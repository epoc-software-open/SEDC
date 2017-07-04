/*
               File: tam04bc_kngn_impl
        Description: 権限パターンマスタ（ビジネスコンポーネント）
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:54:6.29
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
         A88TAM03_APP_ID = httpContext.GetNextPar( ) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_17( A88TAM03_APP_ID) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridtam04bc_kngn_tam05_appli") == 0 )
      {
         nRC_Gridtam04bc_kngn_tam05_appli = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         nGXsfl_95_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         sGXsfl_95_idx = httpContext.GetNextPar( ) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxnrgridtam04bc_kngn_tam05_appli_newrow( nRC_Gridtam04bc_kngn_tam05_appli, nGXsfl_95_idx, sGXsfl_95_idx) ;
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
      Form.getMeta().addItem("Generator", "GeneXus Java", (short)(0)) ;
      Form.getMeta().addItem("Version", "10_1_8-58720", (short)(0)) ;
      Form.getMeta().addItem("Description", "権限パターンマスタ（ビジネスコンポーネント）", (short)(0)) ;
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTAM04_AUTH_CD_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setTheme("Style2");
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
         ClassString = "Group" ;
         StyleString = "" ;
         httpContext.writeText( "<fieldset id=\""+grpGroupdata_Internalname+"\""+" style=\"-moz-border-radius:3pt;\""+" class=\""+ClassString+"\">") ;
         httpContext.writeText( "<legend class=\""+ClassString+"Title"+"\">"+"権限パターンマスタ（ビジネスコンポーネント）"+"</legend>") ;
         wb_table3_27_0C3( true) ;
      }
      return  ;
   }

   public void wb_table3_27_0C3e( boolean wbgen )
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

   public void wb_table3_27_0C3( boolean wbgen )
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
         wb_table4_33_0C3( true) ;
      }
      return  ;
   }

   public void wb_table4_33_0C3e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 108,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "EENTER.", TempTags, "", httpContext.getButtonType( ), "HLP_TAM04BC_KNGN.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "ECANCEL.", TempTags, "", httpContext.getButtonType( ), "HLP_TAM04BC_KNGN.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 110,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "EDELETE.", TempTags, "", httpContext.getButtonType( ), "HLP_TAM04BC_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_27_0C3e( true) ;
      }
      else
      {
         wb_table3_27_0C3e( false) ;
      }
   }

   public void wb_table4_33_0C3( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam04_auth_cd_Internalname, "権限パターン区分", "", "", lblTextblocktam04_auth_cd_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAM04BC_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A17TAM04_AUTH_CD", A17TAM04_AUTH_CD);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM04_AUTH_CD_Internalname, GXutil.rtrim( A17TAM04_AUTH_CD), GXutil.rtrim( localUtil.format( A17TAM04_AUTH_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(38);\"", "", "", "", "", edtTAM04_AUTH_CD_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAM04_AUTH_CD_Enabled, 0, 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TAM04BC_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam04_auth_nm_Internalname, "権限パターン名", "", "", lblTextblocktam04_auth_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAM04BC_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A98TAM04_AUTH_NM", A98TAM04_AUTH_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM04_AUTH_NM_Internalname, GXutil.rtrim( A98TAM04_AUTH_NM), GXutil.rtrim( localUtil.format( A98TAM04_AUTH_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(43);\"", "", "", "", "", edtTAM04_AUTH_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAM04_AUTH_NM_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TAM04BC_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam04_auth_lvl_Internalname, "入力権限レベル", "", "", lblTextblocktam04_auth_lvl_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAM04BC_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A601TAM04_AUTH_LVL", GXutil.ltrim( GXutil.str( A601TAM04_AUTH_LVL, 2, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM04_AUTH_LVL_Internalname, GXutil.ltrim( localUtil.ntoc( A601TAM04_AUTH_LVL, (byte)(2), (byte)(0), ".", "")), ((edtTAM04_AUTH_LVL_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A601TAM04_AUTH_LVL), "Z9")) : localUtil.format( DecimalUtil.doubleToDec(A601TAM04_AUTH_LVL), "Z9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(48);\"", "", "", "", "", edtTAM04_AUTH_LVL_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAM04_AUTH_LVL_Enabled, 0, 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TAM04BC_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam04_del_flg_Internalname, "削除フラグ", "", "", lblTextblocktam04_del_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAM04BC_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A18TAM04_DEL_FLG", A18TAM04_DEL_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM04_DEL_FLG_Internalname, GXutil.rtrim( A18TAM04_DEL_FLG), GXutil.rtrim( localUtil.format( A18TAM04_DEL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(53);\"", "", "", "", "", edtTAM04_DEL_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAM04_DEL_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TAM04BC_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam04_crt_datetime_Internalname, "作成日時", "", "", lblTextblocktam04_crt_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAM04BC_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A39TAM04_CRT_DATETIME", localUtil.ttoc( A39TAM04_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTAM04_CRT_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM04_CRT_DATETIME_Internalname, localUtil.format(A39TAM04_CRT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A39TAM04_CRT_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(58);\"", "", "", "", "", edtTAM04_CRT_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAM04_CRT_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TAM04BC_KNGN.htm");
         GxWebStd.gx_bitmap( httpContext, edtTAM04_CRT_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTAM04_CRT_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TAM04BC_KNGN.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam04_crt_user_id_Internalname, "作成ユーザーID", "", "", lblTextblocktam04_crt_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAM04BC_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A78TAM04_CRT_USER_ID", A78TAM04_CRT_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM04_CRT_USER_ID_Internalname, GXutil.rtrim( A78TAM04_CRT_USER_ID), GXutil.rtrim( localUtil.format( A78TAM04_CRT_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(63);\"", "", "", "", "", edtTAM04_CRT_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAM04_CRT_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TAM04BC_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam04_crt_prog_nm_Internalname, "作成プログラム名", "", "", lblTextblocktam04_crt_prog_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAM04BC_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A40TAM04_CRT_PROG_NM", A40TAM04_CRT_PROG_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM04_CRT_PROG_NM_Internalname, GXutil.rtrim( A40TAM04_CRT_PROG_NM), GXutil.rtrim( localUtil.format( A40TAM04_CRT_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(68);\"", "", "", "", "", edtTAM04_CRT_PROG_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAM04_CRT_PROG_NM_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TAM04BC_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam04_upd_datetime_Internalname, "更新日時", "", "", lblTextblocktam04_upd_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAM04BC_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A41TAM04_UPD_DATETIME", localUtil.ttoc( A41TAM04_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTAM04_UPD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM04_UPD_DATETIME_Internalname, localUtil.format(A41TAM04_UPD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A41TAM04_UPD_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(73);\"", "", "", "", "", edtTAM04_UPD_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAM04_UPD_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TAM04BC_KNGN.htm");
         GxWebStd.gx_bitmap( httpContext, edtTAM04_UPD_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTAM04_UPD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TAM04BC_KNGN.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam04_upd_user_id_Internalname, "更新ユーザーID", "", "", lblTextblocktam04_upd_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAM04BC_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A79TAM04_UPD_USER_ID", A79TAM04_UPD_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM04_UPD_USER_ID_Internalname, GXutil.rtrim( A79TAM04_UPD_USER_ID), GXutil.rtrim( localUtil.format( A79TAM04_UPD_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(78);\"", "", "", "", "", edtTAM04_UPD_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAM04_UPD_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TAM04BC_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam04_upd_prog_nm_Internalname, "更新プログラム名", "", "", lblTextblocktam04_upd_prog_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAM04BC_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A42TAM04_UPD_PROG_NM", A42TAM04_UPD_PROG_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM04_UPD_PROG_NM_Internalname, GXutil.rtrim( A42TAM04_UPD_PROG_NM), GXutil.rtrim( localUtil.format( A42TAM04_UPD_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(83);\"", "", "", "", "", edtTAM04_UPD_PROG_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAM04_UPD_PROG_NM_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TAM04BC_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam04_upd_cnt_Internalname, "更新カウント", "", "", lblTextblocktam04_upd_cnt_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAM04BC_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A99TAM04_UPD_CNT", GXutil.ltrim( GXutil.str( A99TAM04_UPD_CNT, 10, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM04_UPD_CNT_Internalname, GXutil.ltrim( localUtil.ntoc( A99TAM04_UPD_CNT, (byte)(10), (byte)(0), ".", "")), ((edtTAM04_UPD_CNT_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A99TAM04_UPD_CNT), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A99TAM04_UPD_CNT), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(88);\"", "", "", "", "", edtTAM04_UPD_CNT_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAM04_UPD_CNT_Enabled, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TAM04BC_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\" >") ;
         httpContext.writeText( "<br>") ;
         wb_table5_91_0C3( true) ;
      }
      return  ;
   }

   public void wb_table5_91_0C3e( boolean wbgen )
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
         Gridtam04bc_kngn_tam05_appliColumn = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
         Gridtam04bc_kngn_tam05_appliColumn.AddObjectProperty("Value", GXutil.rtrim( A88TAM03_APP_ID));
         Gridtam04bc_kngn_tam05_appliColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM03_APP_ID_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridtam04bc_kngn_tam05_appliContainer.AddColumnProperties(Gridtam04bc_kngn_tam05_appliColumn);
         Gridtam04bc_kngn_tam05_appliColumn = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
         Gridtam04bc_kngn_tam05_appliColumn.AddObjectProperty("Value", GXutil.rtrim( A101TAM05_KNGN_FLG));
         Gridtam04bc_kngn_tam05_appliColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_KNGN_FLG_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridtam04bc_kngn_tam05_appliContainer.AddColumnProperties(Gridtam04bc_kngn_tam05_appliColumn);
         Gridtam04bc_kngn_tam05_appliColumn = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
         Gridtam04bc_kngn_tam05_appliColumn.AddObjectProperty("Value", GXutil.rtrim( A102TAM05_DEL_FLG));
         Gridtam04bc_kngn_tam05_appliColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_DEL_FLG_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridtam04bc_kngn_tam05_appliContainer.AddColumnProperties(Gridtam04bc_kngn_tam05_appliColumn);
         Gridtam04bc_kngn_tam05_appliColumn = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
         Gridtam04bc_kngn_tam05_appliColumn.AddObjectProperty("Value", localUtil.format(A103TAM05_CRT_DATETIME, "9999/99/99 99:99:99"));
         Gridtam04bc_kngn_tam05_appliColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_CRT_DATETIME_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridtam04bc_kngn_tam05_appliContainer.AddColumnProperties(Gridtam04bc_kngn_tam05_appliColumn);
         Gridtam04bc_kngn_tam05_appliColumn = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
         Gridtam04bc_kngn_tam05_appliColumn.AddObjectProperty("Value", GXutil.rtrim( A104TAM05_CRT_USER_ID));
         Gridtam04bc_kngn_tam05_appliColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_CRT_USER_ID_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridtam04bc_kngn_tam05_appliContainer.AddColumnProperties(Gridtam04bc_kngn_tam05_appliColumn);
         Gridtam04bc_kngn_tam05_appliColumn = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
         Gridtam04bc_kngn_tam05_appliColumn.AddObjectProperty("Value", GXutil.rtrim( A105TAM05_CRT_PROG_NM));
         Gridtam04bc_kngn_tam05_appliColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_CRT_PROG_NM_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridtam04bc_kngn_tam05_appliContainer.AddColumnProperties(Gridtam04bc_kngn_tam05_appliColumn);
         Gridtam04bc_kngn_tam05_appliColumn = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
         Gridtam04bc_kngn_tam05_appliColumn.AddObjectProperty("Value", localUtil.format(A106TAM05_UPD_DATETIME, "9999/99/99 99:99:99"));
         Gridtam04bc_kngn_tam05_appliColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_UPD_DATETIME_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridtam04bc_kngn_tam05_appliContainer.AddColumnProperties(Gridtam04bc_kngn_tam05_appliColumn);
         Gridtam04bc_kngn_tam05_appliColumn = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
         Gridtam04bc_kngn_tam05_appliColumn.AddObjectProperty("Value", GXutil.rtrim( A107TAM05_UPD_USER_ID));
         Gridtam04bc_kngn_tam05_appliColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_UPD_USER_ID_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridtam04bc_kngn_tam05_appliContainer.AddColumnProperties(Gridtam04bc_kngn_tam05_appliColumn);
         Gridtam04bc_kngn_tam05_appliColumn = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
         Gridtam04bc_kngn_tam05_appliColumn.AddObjectProperty("Value", GXutil.rtrim( A108TAM05_UPD_PROG_NM));
         Gridtam04bc_kngn_tam05_appliColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_UPD_PROG_NM_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridtam04bc_kngn_tam05_appliContainer.AddColumnProperties(Gridtam04bc_kngn_tam05_appliColumn);
         Gridtam04bc_kngn_tam05_appliColumn = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
         Gridtam04bc_kngn_tam05_appliColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A109TAM05_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
         Gridtam04bc_kngn_tam05_appliColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_UPD_CNT_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridtam04bc_kngn_tam05_appliContainer.AddColumnProperties(Gridtam04bc_kngn_tam05_appliColumn);
         Gridtam04bc_kngn_tam05_appliContainer.AddObjectProperty("Allowselection", "false");
         Gridtam04bc_kngn_tam05_appliContainer.AddObjectProperty("Allowcollapsing", ((subGridtam04bc_kngn_tam05_appli_Allowcollapsing==1) ? "true" : "false"));
         Gridtam04bc_kngn_tam05_appliContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridtam04bc_kngn_tam05_appli_Collapsed, (byte)(9), (byte)(0), ".", "")));
         nGXsfl_95_idx = (short)(0) ;
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
            B99TAM04_UPD_CNT = A99TAM04_UPD_CNT ;
            n99TAM04_UPD_CNT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A99TAM04_UPD_CNT", GXutil.ltrim( GXutil.str( A99TAM04_UPD_CNT, 10, 0)));
            standaloneNotModal0C9( ) ;
            standaloneModal0C9( ) ;
            sMode9 = Gx_mode ;
            while ( nGXsfl_95_idx < nRC_Gridtam04bc_kngn_tam05_appli )
            {
               readRow0C9( ) ;
               edtTAM03_APP_ID_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAM03_APP_ID_"+sGXsfl_95_idx+"Enabled"), ".", ",")) ;
               edtTAM05_KNGN_FLG_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAM05_KNGN_FLG_"+sGXsfl_95_idx+"Enabled"), ".", ",")) ;
               edtTAM05_DEL_FLG_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAM05_DEL_FLG_"+sGXsfl_95_idx+"Enabled"), ".", ",")) ;
               edtTAM05_CRT_DATETIME_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAM05_CRT_DATETIME_"+sGXsfl_95_idx+"Enabled"), ".", ",")) ;
               edtTAM05_CRT_USER_ID_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAM05_CRT_USER_ID_"+sGXsfl_95_idx+"Enabled"), ".", ",")) ;
               edtTAM05_CRT_PROG_NM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAM05_CRT_PROG_NM_"+sGXsfl_95_idx+"Enabled"), ".", ",")) ;
               edtTAM05_UPD_DATETIME_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAM05_UPD_DATETIME_"+sGXsfl_95_idx+"Enabled"), ".", ",")) ;
               edtTAM05_UPD_USER_ID_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAM05_UPD_USER_ID_"+sGXsfl_95_idx+"Enabled"), ".", ",")) ;
               edtTAM05_UPD_PROG_NM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAM05_UPD_PROG_NM_"+sGXsfl_95_idx+"Enabled"), ".", ",")) ;
               edtTAM05_UPD_CNT_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAM05_UPD_CNT_"+sGXsfl_95_idx+"Enabled"), ".", ",")) ;
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
            A99TAM04_UPD_CNT = B99TAM04_UPD_CNT ;
            n99TAM04_UPD_CNT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A99TAM04_UPD_CNT", GXutil.ltrim( GXutil.str( A99TAM04_UPD_CNT, 10, 0)));
         }
         else
         {
            /* Get or get-alike key processing. */
            nBlankRcdCount9 = (short)(5) ;
            nRcdExists_9 = (short)(1) ;
            scanStart0C9( ) ;
            while ( RcdFound9 != 0 )
            {
               init_level_properties9( ) ;
               getByPrimaryKey0C9( ) ;
               standaloneNotModal0C9( ) ;
               standaloneModal0C9( ) ;
               addRow0C9( ) ;
               scanNext0C9( ) ;
            }
            scanEnd0C9( ) ;
         }
         /* Initialize fields for 'new' records and send them. */
         sMode9 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         initAll0C9( ) ;
         init_level_properties9( ) ;
         B99TAM04_UPD_CNT = A99TAM04_UPD_CNT ;
         n99TAM04_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A99TAM04_UPD_CNT", GXutil.ltrim( GXutil.str( A99TAM04_UPD_CNT, 10, 0)));
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
         A99TAM04_UPD_CNT = B99TAM04_UPD_CNT ;
         n99TAM04_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A99TAM04_UPD_CNT", GXutil.ltrim( GXutil.str( A99TAM04_UPD_CNT, 10, 0)));
         sStyleString = " style=\"display:none;\"" ;
         sStyleString = "" ;
         httpContext.writeText( "<div id=\""+"Gridtam04bc_kngn_tam05_appliContainer"+"Div\" "+sStyleString+">"+"</div>") ;
         httpContext.ajax_rsp_assign_grid("_"+"Gridtam04bc_kngn_tam05_appli", Gridtam04bc_kngn_tam05_appliContainer);
         GxWebStd.gx_hidden_field( httpContext, "Gridtam04bc_kngn_tam05_appliContainerData", Gridtam04bc_kngn_tam05_appliContainer.ToJavascriptSource());
         if ( httpContext.isAjaxRequest( ) )
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
         wb_table4_33_0C3e( true) ;
      }
      else
      {
         wb_table4_33_0C3e( false) ;
      }
   }

   public void wb_table5_91_0C3( boolean wbgen )
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
         ClassString = "" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTitletam05_appli_Internalname, "TAM05_ APPLI", "", "", lblTitletam05_appli_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAM04BC_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_91_0C3e( true) ;
      }
      else
      {
         wb_table5_91_0C3e( false) ;
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
         httpContext.writeText( "<div style=\"WHITE-SPACE: nowrap\" class=\"ToolbarMain\">") ;
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", "Style2"), "", "", "", "Style2", imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM04BC_KNGN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_separator_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM04BC_KNGN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", "Style2"), "", "", "", "Style2", imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM04BC_KNGN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM04BC_KNGN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", "Style2"), "", "", "", "Style2", imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM04BC_KNGN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_separator_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM04BC_KNGN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", "Style2"), "", "", "", "Style2", imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM04BC_KNGN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_separator_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM04BC_KNGN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", "Style2"), "", "", "", "Style2", imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM04BC_KNGN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_separator_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM04BC_KNGN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM04BC_KNGN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM04BC_KNGN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM04BC_KNGN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM04BC_KNGN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM04BC_KNGN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM04BC_KNGN.htm");
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
            A17TAM04_AUTH_CD = httpContext.cgiGet( edtTAM04_AUTH_CD_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A17TAM04_AUTH_CD", A17TAM04_AUTH_CD);
            A98TAM04_AUTH_NM = httpContext.cgiGet( edtTAM04_AUTH_NM_Internalname) ;
            n98TAM04_AUTH_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A98TAM04_AUTH_NM", A98TAM04_AUTH_NM);
            n98TAM04_AUTH_NM = ((GXutil.strcmp("", A98TAM04_AUTH_NM)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTAM04_AUTH_LVL_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTAM04_AUTH_LVL_Internalname), ".", ",") > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TAM04_AUTH_LVL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTAM04_AUTH_LVL_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A601TAM04_AUTH_LVL = (byte)(0) ;
               n601TAM04_AUTH_LVL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A601TAM04_AUTH_LVL", GXutil.ltrim( GXutil.str( A601TAM04_AUTH_LVL, 2, 0)));
            }
            else
            {
               A601TAM04_AUTH_LVL = (byte)(localUtil.ctol( httpContext.cgiGet( edtTAM04_AUTH_LVL_Internalname), ".", ",")) ;
               n601TAM04_AUTH_LVL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A601TAM04_AUTH_LVL", GXutil.ltrim( GXutil.str( A601TAM04_AUTH_LVL, 2, 0)));
            }
            n601TAM04_AUTH_LVL = ((0==A601TAM04_AUTH_LVL) ? true : false) ;
            A18TAM04_DEL_FLG = httpContext.cgiGet( edtTAM04_DEL_FLG_Internalname) ;
            n18TAM04_DEL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A18TAM04_DEL_FLG", A18TAM04_DEL_FLG);
            n18TAM04_DEL_FLG = ((GXutil.strcmp("", A18TAM04_DEL_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTAM04_CRT_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"作成日時"}), 1, "TAM04_CRT_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTAM04_CRT_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A39TAM04_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n39TAM04_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A39TAM04_CRT_DATETIME", localUtil.ttoc( A39TAM04_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A39TAM04_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTAM04_CRT_DATETIME_Internalname)) ;
               n39TAM04_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A39TAM04_CRT_DATETIME", localUtil.ttoc( A39TAM04_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n39TAM04_CRT_DATETIME = (GXutil.nullDate().equals(A39TAM04_CRT_DATETIME) ? true : false) ;
            A78TAM04_CRT_USER_ID = httpContext.cgiGet( edtTAM04_CRT_USER_ID_Internalname) ;
            n78TAM04_CRT_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A78TAM04_CRT_USER_ID", A78TAM04_CRT_USER_ID);
            n78TAM04_CRT_USER_ID = ((GXutil.strcmp("", A78TAM04_CRT_USER_ID)==0) ? true : false) ;
            A40TAM04_CRT_PROG_NM = httpContext.cgiGet( edtTAM04_CRT_PROG_NM_Internalname) ;
            n40TAM04_CRT_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A40TAM04_CRT_PROG_NM", A40TAM04_CRT_PROG_NM);
            n40TAM04_CRT_PROG_NM = ((GXutil.strcmp("", A40TAM04_CRT_PROG_NM)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTAM04_UPD_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"更新日時"}), 1, "TAM04_UPD_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTAM04_UPD_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A41TAM04_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n41TAM04_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A41TAM04_UPD_DATETIME", localUtil.ttoc( A41TAM04_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A41TAM04_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTAM04_UPD_DATETIME_Internalname)) ;
               n41TAM04_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A41TAM04_UPD_DATETIME", localUtil.ttoc( A41TAM04_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n41TAM04_UPD_DATETIME = (GXutil.nullDate().equals(A41TAM04_UPD_DATETIME) ? true : false) ;
            A79TAM04_UPD_USER_ID = httpContext.cgiGet( edtTAM04_UPD_USER_ID_Internalname) ;
            n79TAM04_UPD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A79TAM04_UPD_USER_ID", A79TAM04_UPD_USER_ID);
            n79TAM04_UPD_USER_ID = ((GXutil.strcmp("", A79TAM04_UPD_USER_ID)==0) ? true : false) ;
            A42TAM04_UPD_PROG_NM = httpContext.cgiGet( edtTAM04_UPD_PROG_NM_Internalname) ;
            n42TAM04_UPD_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A42TAM04_UPD_PROG_NM", A42TAM04_UPD_PROG_NM);
            n42TAM04_UPD_PROG_NM = ((GXutil.strcmp("", A42TAM04_UPD_PROG_NM)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTAM04_UPD_CNT_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTAM04_UPD_CNT_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TAM04_UPD_CNT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTAM04_UPD_CNT_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A99TAM04_UPD_CNT = 0 ;
               n99TAM04_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A99TAM04_UPD_CNT", GXutil.ltrim( GXutil.str( A99TAM04_UPD_CNT, 10, 0)));
            }
            else
            {
               A99TAM04_UPD_CNT = localUtil.ctol( httpContext.cgiGet( edtTAM04_UPD_CNT_Internalname), ".", ",") ;
               n99TAM04_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A99TAM04_UPD_CNT", GXutil.ltrim( GXutil.str( A99TAM04_UPD_CNT, 10, 0)));
            }
            n99TAM04_UPD_CNT = ((0==A99TAM04_UPD_CNT) ? true : false) ;
            /* Read saved values. */
            Z17TAM04_AUTH_CD = httpContext.cgiGet( "Z17TAM04_AUTH_CD") ;
            Z39TAM04_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z39TAM04_CRT_DATETIME"), 0) ;
            n39TAM04_CRT_DATETIME = (GXutil.nullDate().equals(A39TAM04_CRT_DATETIME) ? true : false) ;
            Z78TAM04_CRT_USER_ID = httpContext.cgiGet( "Z78TAM04_CRT_USER_ID") ;
            n78TAM04_CRT_USER_ID = ((GXutil.strcmp("", A78TAM04_CRT_USER_ID)==0) ? true : false) ;
            Z41TAM04_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z41TAM04_UPD_DATETIME"), 0) ;
            n41TAM04_UPD_DATETIME = (GXutil.nullDate().equals(A41TAM04_UPD_DATETIME) ? true : false) ;
            Z79TAM04_UPD_USER_ID = httpContext.cgiGet( "Z79TAM04_UPD_USER_ID") ;
            n79TAM04_UPD_USER_ID = ((GXutil.strcmp("", A79TAM04_UPD_USER_ID)==0) ? true : false) ;
            Z99TAM04_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z99TAM04_UPD_CNT"), ".", ",") ;
            n99TAM04_UPD_CNT = ((0==A99TAM04_UPD_CNT) ? true : false) ;
            Z98TAM04_AUTH_NM = httpContext.cgiGet( "Z98TAM04_AUTH_NM") ;
            n98TAM04_AUTH_NM = ((GXutil.strcmp("", A98TAM04_AUTH_NM)==0) ? true : false) ;
            Z601TAM04_AUTH_LVL = (byte)(localUtil.ctol( httpContext.cgiGet( "Z601TAM04_AUTH_LVL"), ".", ",")) ;
            n601TAM04_AUTH_LVL = ((0==A601TAM04_AUTH_LVL) ? true : false) ;
            Z18TAM04_DEL_FLG = httpContext.cgiGet( "Z18TAM04_DEL_FLG") ;
            n18TAM04_DEL_FLG = ((GXutil.strcmp("", A18TAM04_DEL_FLG)==0) ? true : false) ;
            Z40TAM04_CRT_PROG_NM = httpContext.cgiGet( "Z40TAM04_CRT_PROG_NM") ;
            n40TAM04_CRT_PROG_NM = ((GXutil.strcmp("", A40TAM04_CRT_PROG_NM)==0) ? true : false) ;
            Z42TAM04_UPD_PROG_NM = httpContext.cgiGet( "Z42TAM04_UPD_PROG_NM") ;
            n42TAM04_UPD_PROG_NM = ((GXutil.strcmp("", A42TAM04_UPD_PROG_NM)==0) ? true : false) ;
            O99TAM04_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "O99TAM04_UPD_CNT"), ".", ",") ;
            n99TAM04_UPD_CNT = ((0==A99TAM04_UPD_CNT) ? true : false) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ".", ",")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ".", ",")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_Gridtam04bc_kngn_tam05_appli = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_Gridtam04bc_kngn_tam05_appli"), ".", ",")) ;
            AV12Pgmname = httpContext.cgiGet( "vPGMNAME") ;
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
               A17TAM04_AUTH_CD = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A17TAM04_AUTH_CD", A17TAM04_AUTH_CD);
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
            /* Check if conditions changed and reset current page numbers */
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
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_confdelete"), 0, "");
         }
         else
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_mustconfirm"), 0, "");
         }
      }
   }

   public void confirm_0C9( )
   {
      nGXsfl_95_idx = (short)(0) ;
      while ( nGXsfl_95_idx < nRC_Gridtam04bc_kngn_tam05_appli )
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
                     }
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
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
                           }
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_9 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTAM03_APP_ID_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtTAM03_APP_ID_Internalname, GXutil.rtrim( A88TAM03_APP_ID)) ;
         httpContext.changePostValue( edtTAM05_KNGN_FLG_Internalname, GXutil.rtrim( A101TAM05_KNGN_FLG)) ;
         httpContext.changePostValue( edtTAM05_DEL_FLG_Internalname, GXutil.rtrim( A102TAM05_DEL_FLG)) ;
         httpContext.changePostValue( edtTAM05_CRT_DATETIME_Internalname, localUtil.format(A103TAM05_CRT_DATETIME, "9999/99/99 99:99:99")) ;
         httpContext.changePostValue( edtTAM05_CRT_USER_ID_Internalname, GXutil.rtrim( A104TAM05_CRT_USER_ID)) ;
         httpContext.changePostValue( edtTAM05_CRT_PROG_NM_Internalname, GXutil.rtrim( A105TAM05_CRT_PROG_NM)) ;
         httpContext.changePostValue( edtTAM05_UPD_DATETIME_Internalname, localUtil.format(A106TAM05_UPD_DATETIME, "9999/99/99 99:99:99")) ;
         httpContext.changePostValue( edtTAM05_UPD_USER_ID_Internalname, GXutil.rtrim( A107TAM05_UPD_USER_ID)) ;
         httpContext.changePostValue( edtTAM05_UPD_PROG_NM_Internalname, GXutil.rtrim( A108TAM05_UPD_PROG_NM)) ;
         httpContext.changePostValue( edtTAM05_UPD_CNT_Internalname, GXutil.ltrim( localUtil.ntoc( A109TAM05_UPD_CNT, (byte)(10), (byte)(0), ".", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z88TAM03_APP_ID_"+sGXsfl_95_idx, GXutil.rtrim( Z88TAM03_APP_ID)) ;
         httpContext.changePostValue( "ZT_"+"Z103TAM05_CRT_DATETIME_"+sGXsfl_95_idx, localUtil.ttoc( Z103TAM05_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z104TAM05_CRT_USER_ID_"+sGXsfl_95_idx, GXutil.rtrim( Z104TAM05_CRT_USER_ID)) ;
         httpContext.changePostValue( "ZT_"+"Z106TAM05_UPD_DATETIME_"+sGXsfl_95_idx, localUtil.ttoc( Z106TAM05_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z107TAM05_UPD_USER_ID_"+sGXsfl_95_idx, GXutil.rtrim( Z107TAM05_UPD_USER_ID)) ;
         httpContext.changePostValue( "ZT_"+"Z109TAM05_UPD_CNT_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( Z109TAM05_UPD_CNT, (byte)(10), (byte)(0), ".", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z101TAM05_KNGN_FLG_"+sGXsfl_95_idx, GXutil.rtrim( Z101TAM05_KNGN_FLG)) ;
         httpContext.changePostValue( "ZT_"+"Z102TAM05_DEL_FLG_"+sGXsfl_95_idx, GXutil.rtrim( Z102TAM05_DEL_FLG)) ;
         httpContext.changePostValue( "ZT_"+"Z105TAM05_CRT_PROG_NM_"+sGXsfl_95_idx, GXutil.rtrim( Z105TAM05_CRT_PROG_NM)) ;
         httpContext.changePostValue( "ZT_"+"Z108TAM05_UPD_PROG_NM_"+sGXsfl_95_idx, GXutil.rtrim( Z108TAM05_UPD_PROG_NM)) ;
         httpContext.changePostValue( "T109TAM05_UPD_CNT_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( O109TAM05_UPD_CNT, (byte)(10), (byte)(0), ".", ""))) ;
         httpContext.changePostValue( "nRcdDeleted_9_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_9, (byte)(4), (byte)(0), ".", ""))) ;
         httpContext.changePostValue( "nRcdExists_9_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_9, (byte)(4), (byte)(0), ".", ""))) ;
         httpContext.changePostValue( "nIsMod_9_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_9, (byte)(4), (byte)(0), ".", ""))) ;
         if ( nIsMod_9 != 0 )
         {
            httpContext.changePostValue( "TAM03_APP_ID_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM03_APP_ID_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TAM05_KNGN_FLG_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_KNGN_FLG_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TAM05_DEL_FLG_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_DEL_FLG_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TAM05_CRT_DATETIME_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_CRT_DATETIME_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TAM05_CRT_USER_ID_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_CRT_USER_ID_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TAM05_CRT_PROG_NM_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_CRT_PROG_NM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TAM05_UPD_DATETIME_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_UPD_DATETIME_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TAM05_UPD_USER_ID_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_UPD_USER_ID_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TAM05_UPD_PROG_NM_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_UPD_PROG_NM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TAM05_UPD_CNT_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_UPD_CNT_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
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
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("8")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void e120C2( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV12Pgmname) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Pgmname", AV12Pgmname);
      AV10W_TXT = "" ;
      AV10W_TXT = AV10W_TXT + "権限パターン区分:" + A17TAM04_AUTH_CD + GXutil.chr( (short)(9)) ;
      AV10W_TXT = AV10W_TXT + A98TAM04_AUTH_NM + GXutil.chr( (short)(9)) ;
      AV10W_TXT = AV10W_TXT + GXutil.trim( GXutil.str( A601TAM04_AUTH_LVL, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV10W_TXT = AV10W_TXT + A18TAM04_DEL_FLG + GXutil.chr( (short)(9)) ;
      GXt_char14 = AV10W_TXT ;
      GXv_char15[0] = GXt_char14 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A39TAM04_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char15) ;
      tam04bc_kngn_impl.this.GXt_char14 = GXv_char15[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A39TAM04_CRT_DATETIME", localUtil.ttoc( A39TAM04_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV10W_TXT = AV10W_TXT + GXt_char14 + GXutil.chr( (short)(9)) ;
      AV10W_TXT = AV10W_TXT + A78TAM04_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      AV10W_TXT = AV10W_TXT + A40TAM04_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      GXt_char14 = AV10W_TXT ;
      GXv_char15[0] = GXt_char14 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A41TAM04_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char15) ;
      tam04bc_kngn_impl.this.GXt_char14 = GXv_char15[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A41TAM04_UPD_DATETIME", localUtil.ttoc( A41TAM04_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV10W_TXT = AV10W_TXT + GXt_char14 + GXutil.chr( (short)(9)) ;
      AV10W_TXT = AV10W_TXT + A79TAM04_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      AV10W_TXT = AV10W_TXT + A42TAM04_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      AV10W_TXT = AV10W_TXT + GXutil.trim( GXutil.str( A99TAM04_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV10W_TXT = GXutil.strReplace( AV10W_TXT, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "@br@") ;
      new a804_pc03_datalog(remoteHandle, context).execute( AV12Pgmname, Gx_mode, AV10W_TXT) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Pgmname", AV12Pgmname);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      new tam04bc_pc01_datalog(remoteHandle, context).execute( AV12Pgmname, Gx_mode, A17TAM04_AUTH_CD) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Pgmname", AV12Pgmname);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "A17TAM04_AUTH_CD", A17TAM04_AUTH_CD);
   }

   public void S1165( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV12Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Pgmname", AV12Pgmname);
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void zm0C3( int GX_JID )
   {
      if ( ( GX_JID == 15 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z39TAM04_CRT_DATETIME = T000C6_A39TAM04_CRT_DATETIME[0] ;
            Z78TAM04_CRT_USER_ID = T000C6_A78TAM04_CRT_USER_ID[0] ;
            Z41TAM04_UPD_DATETIME = T000C6_A41TAM04_UPD_DATETIME[0] ;
            Z79TAM04_UPD_USER_ID = T000C6_A79TAM04_UPD_USER_ID[0] ;
            Z99TAM04_UPD_CNT = T000C6_A99TAM04_UPD_CNT[0] ;
            Z98TAM04_AUTH_NM = T000C6_A98TAM04_AUTH_NM[0] ;
            Z601TAM04_AUTH_LVL = T000C6_A601TAM04_AUTH_LVL[0] ;
            Z18TAM04_DEL_FLG = T000C6_A18TAM04_DEL_FLG[0] ;
            Z40TAM04_CRT_PROG_NM = T000C6_A40TAM04_CRT_PROG_NM[0] ;
            Z42TAM04_UPD_PROG_NM = T000C6_A42TAM04_UPD_PROG_NM[0] ;
         }
         else
         {
            Z39TAM04_CRT_DATETIME = A39TAM04_CRT_DATETIME ;
            Z78TAM04_CRT_USER_ID = A78TAM04_CRT_USER_ID ;
            Z41TAM04_UPD_DATETIME = A41TAM04_UPD_DATETIME ;
            Z79TAM04_UPD_USER_ID = A79TAM04_UPD_USER_ID ;
            Z99TAM04_UPD_CNT = A99TAM04_UPD_CNT ;
            Z98TAM04_AUTH_NM = A98TAM04_AUTH_NM ;
            Z601TAM04_AUTH_LVL = A601TAM04_AUTH_LVL ;
            Z18TAM04_DEL_FLG = A18TAM04_DEL_FLG ;
            Z40TAM04_CRT_PROG_NM = A40TAM04_CRT_PROG_NM ;
            Z42TAM04_UPD_PROG_NM = A42TAM04_UPD_PROG_NM ;
         }
      }
      if ( GX_JID == -15 )
      {
         Z17TAM04_AUTH_CD = A17TAM04_AUTH_CD ;
         Z39TAM04_CRT_DATETIME = A39TAM04_CRT_DATETIME ;
         Z78TAM04_CRT_USER_ID = A78TAM04_CRT_USER_ID ;
         Z41TAM04_UPD_DATETIME = A41TAM04_UPD_DATETIME ;
         Z79TAM04_UPD_USER_ID = A79TAM04_UPD_USER_ID ;
         Z99TAM04_UPD_CNT = A99TAM04_UPD_CNT ;
         Z98TAM04_AUTH_NM = A98TAM04_AUTH_NM ;
         Z601TAM04_AUTH_LVL = A601TAM04_AUTH_LVL ;
         Z18TAM04_DEL_FLG = A18TAM04_DEL_FLG ;
         Z40TAM04_CRT_PROG_NM = A40TAM04_CRT_PROG_NM ;
         Z42TAM04_UPD_PROG_NM = A42TAM04_UPD_PROG_NM ;
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
      pr_default.execute(5, new Object[] {A17TAM04_AUTH_CD});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A39TAM04_CRT_DATETIME = T000C7_A39TAM04_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A39TAM04_CRT_DATETIME", localUtil.ttoc( A39TAM04_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n39TAM04_CRT_DATETIME = T000C7_n39TAM04_CRT_DATETIME[0] ;
         A78TAM04_CRT_USER_ID = T000C7_A78TAM04_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A78TAM04_CRT_USER_ID", A78TAM04_CRT_USER_ID);
         n78TAM04_CRT_USER_ID = T000C7_n78TAM04_CRT_USER_ID[0] ;
         A41TAM04_UPD_DATETIME = T000C7_A41TAM04_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A41TAM04_UPD_DATETIME", localUtil.ttoc( A41TAM04_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n41TAM04_UPD_DATETIME = T000C7_n41TAM04_UPD_DATETIME[0] ;
         A79TAM04_UPD_USER_ID = T000C7_A79TAM04_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A79TAM04_UPD_USER_ID", A79TAM04_UPD_USER_ID);
         n79TAM04_UPD_USER_ID = T000C7_n79TAM04_UPD_USER_ID[0] ;
         A99TAM04_UPD_CNT = T000C7_A99TAM04_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A99TAM04_UPD_CNT", GXutil.ltrim( GXutil.str( A99TAM04_UPD_CNT, 10, 0)));
         n99TAM04_UPD_CNT = T000C7_n99TAM04_UPD_CNT[0] ;
         A98TAM04_AUTH_NM = T000C7_A98TAM04_AUTH_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A98TAM04_AUTH_NM", A98TAM04_AUTH_NM);
         n98TAM04_AUTH_NM = T000C7_n98TAM04_AUTH_NM[0] ;
         A601TAM04_AUTH_LVL = T000C7_A601TAM04_AUTH_LVL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A601TAM04_AUTH_LVL", GXutil.ltrim( GXutil.str( A601TAM04_AUTH_LVL, 2, 0)));
         n601TAM04_AUTH_LVL = T000C7_n601TAM04_AUTH_LVL[0] ;
         A18TAM04_DEL_FLG = T000C7_A18TAM04_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A18TAM04_DEL_FLG", A18TAM04_DEL_FLG);
         n18TAM04_DEL_FLG = T000C7_n18TAM04_DEL_FLG[0] ;
         A40TAM04_CRT_PROG_NM = T000C7_A40TAM04_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A40TAM04_CRT_PROG_NM", A40TAM04_CRT_PROG_NM);
         n40TAM04_CRT_PROG_NM = T000C7_n40TAM04_CRT_PROG_NM[0] ;
         A42TAM04_UPD_PROG_NM = T000C7_A42TAM04_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A42TAM04_UPD_PROG_NM", A42TAM04_UPD_PROG_NM);
         n42TAM04_UPD_PROG_NM = T000C7_n42TAM04_UPD_PROG_NM[0] ;
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
      if ( ! ( GXutil.nullDate().equals(A39TAM04_CRT_DATETIME) || (( A39TAM04_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A39TAM04_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A41TAM04_UPD_DATETIME) || (( A41TAM04_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A41TAM04_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
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
      pr_default.execute(6, new Object[] {A17TAM04_AUTH_CD});
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
      pr_default.execute(4, new Object[] {A17TAM04_AUTH_CD});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zm0C3( 15) ;
         RcdFound3 = (short)(1) ;
         A17TAM04_AUTH_CD = T000C6_A17TAM04_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A17TAM04_AUTH_CD", A17TAM04_AUTH_CD);
         A39TAM04_CRT_DATETIME = T000C6_A39TAM04_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A39TAM04_CRT_DATETIME", localUtil.ttoc( A39TAM04_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n39TAM04_CRT_DATETIME = T000C6_n39TAM04_CRT_DATETIME[0] ;
         A78TAM04_CRT_USER_ID = T000C6_A78TAM04_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A78TAM04_CRT_USER_ID", A78TAM04_CRT_USER_ID);
         n78TAM04_CRT_USER_ID = T000C6_n78TAM04_CRT_USER_ID[0] ;
         A41TAM04_UPD_DATETIME = T000C6_A41TAM04_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A41TAM04_UPD_DATETIME", localUtil.ttoc( A41TAM04_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n41TAM04_UPD_DATETIME = T000C6_n41TAM04_UPD_DATETIME[0] ;
         A79TAM04_UPD_USER_ID = T000C6_A79TAM04_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A79TAM04_UPD_USER_ID", A79TAM04_UPD_USER_ID);
         n79TAM04_UPD_USER_ID = T000C6_n79TAM04_UPD_USER_ID[0] ;
         A99TAM04_UPD_CNT = T000C6_A99TAM04_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A99TAM04_UPD_CNT", GXutil.ltrim( GXutil.str( A99TAM04_UPD_CNT, 10, 0)));
         n99TAM04_UPD_CNT = T000C6_n99TAM04_UPD_CNT[0] ;
         A98TAM04_AUTH_NM = T000C6_A98TAM04_AUTH_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A98TAM04_AUTH_NM", A98TAM04_AUTH_NM);
         n98TAM04_AUTH_NM = T000C6_n98TAM04_AUTH_NM[0] ;
         A601TAM04_AUTH_LVL = T000C6_A601TAM04_AUTH_LVL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A601TAM04_AUTH_LVL", GXutil.ltrim( GXutil.str( A601TAM04_AUTH_LVL, 2, 0)));
         n601TAM04_AUTH_LVL = T000C6_n601TAM04_AUTH_LVL[0] ;
         A18TAM04_DEL_FLG = T000C6_A18TAM04_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A18TAM04_DEL_FLG", A18TAM04_DEL_FLG);
         n18TAM04_DEL_FLG = T000C6_n18TAM04_DEL_FLG[0] ;
         A40TAM04_CRT_PROG_NM = T000C6_A40TAM04_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A40TAM04_CRT_PROG_NM", A40TAM04_CRT_PROG_NM);
         n40TAM04_CRT_PROG_NM = T000C6_n40TAM04_CRT_PROG_NM[0] ;
         A42TAM04_UPD_PROG_NM = T000C6_A42TAM04_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A42TAM04_UPD_PROG_NM", A42TAM04_UPD_PROG_NM);
         n42TAM04_UPD_PROG_NM = T000C6_n42TAM04_UPD_PROG_NM[0] ;
         O99TAM04_UPD_CNT = A99TAM04_UPD_CNT ;
         n99TAM04_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A99TAM04_UPD_CNT", GXutil.ltrim( GXutil.str( A99TAM04_UPD_CNT, 10, 0)));
         Z17TAM04_AUTH_CD = A17TAM04_AUTH_CD ;
         sMode3 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load0C3( ) ;
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
      pr_default.execute(7, new Object[] {A17TAM04_AUTH_CD});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T000C9_A17TAM04_AUTH_CD[0], A17TAM04_AUTH_CD) < 0 ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T000C9_A17TAM04_AUTH_CD[0], A17TAM04_AUTH_CD) > 0 ) ) )
         {
            A17TAM04_AUTH_CD = T000C9_A17TAM04_AUTH_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A17TAM04_AUTH_CD", A17TAM04_AUTH_CD);
            RcdFound3 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void move_previous( )
   {
      RcdFound3 = (short)(0) ;
      /* Using cursor T000C10 */
      pr_default.execute(8, new Object[] {A17TAM04_AUTH_CD});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T000C10_A17TAM04_AUTH_CD[0], A17TAM04_AUTH_CD) > 0 ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T000C10_A17TAM04_AUTH_CD[0], A17TAM04_AUTH_CD) < 0 ) ) )
         {
            A17TAM04_AUTH_CD = T000C10_A17TAM04_AUTH_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A17TAM04_AUTH_CD", A17TAM04_AUTH_CD);
            RcdFound3 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0C3( ) ;
      if ( RcdFound3 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "TAM04_AUTH_CD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTAM04_AUTH_CD_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( GXutil.strcmp(A17TAM04_AUTH_CD, Z17TAM04_AUTH_CD) != 0 )
         {
            A17TAM04_AUTH_CD = Z17TAM04_AUTH_CD ;
            httpContext.ajax_rsp_assign_attri("", false, "A17TAM04_AUTH_CD", A17TAM04_AUTH_CD);
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
         if ( GXutil.strcmp(A17TAM04_AUTH_CD, Z17TAM04_AUTH_CD) != 0 )
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
      afterTrn( ) ;
   }

   public void btn_delete( )
   {
      if ( GXutil.strcmp(A17TAM04_AUTH_CD, Z17TAM04_AUTH_CD) != 0 )
      {
         A17TAM04_AUTH_CD = Z17TAM04_AUTH_CD ;
         httpContext.ajax_rsp_assign_attri("", false, "A17TAM04_AUTH_CD", A17TAM04_AUTH_CD);
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
      getByPrimaryKey( ) ;
      CloseOpenCursors();
   }

   public void btn_get( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      getEqualNoModal( ) ;
      if ( RcdFound3 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TAM04_AUTH_CD");
         AnyError = (short)(1) ;
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
      scanStart0C3( ) ;
      if ( RcdFound3 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
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
      move_previous( ) ;
      if ( RcdFound3 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
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
      move_next( ) ;
      if ( RcdFound3 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
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
      scanStart0C3( ) ;
      if ( RcdFound3 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
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
         pr_default.execute(3, new Object[] {A17TAM04_AUTH_CD});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TAM04_KNGN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(3) == 101) || !( Z39TAM04_CRT_DATETIME.equals( T000C5_A39TAM04_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z78TAM04_CRT_USER_ID, T000C5_A78TAM04_CRT_USER_ID[0]) != 0 ) || !( Z41TAM04_UPD_DATETIME.equals( T000C5_A41TAM04_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z79TAM04_UPD_USER_ID, T000C5_A79TAM04_UPD_USER_ID[0]) != 0 ) || ( Z99TAM04_UPD_CNT != T000C5_A99TAM04_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z98TAM04_AUTH_NM, T000C5_A98TAM04_AUTH_NM[0]) != 0 ) || ( Z601TAM04_AUTH_LVL != T000C5_A601TAM04_AUTH_LVL[0] ) || ( GXutil.strcmp(Z18TAM04_DEL_FLG, T000C5_A18TAM04_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z40TAM04_CRT_PROG_NM, T000C5_A40TAM04_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z42TAM04_UPD_PROG_NM, T000C5_A42TAM04_UPD_PROG_NM[0]) != 0 ) )
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
                  pr_default.execute(9, new Object[] {A17TAM04_AUTH_CD, new Boolean(n39TAM04_CRT_DATETIME), A39TAM04_CRT_DATETIME, new Boolean(n78TAM04_CRT_USER_ID), A78TAM04_CRT_USER_ID, new Boolean(n41TAM04_UPD_DATETIME), A41TAM04_UPD_DATETIME, new Boolean(n79TAM04_UPD_USER_ID), A79TAM04_UPD_USER_ID, new Boolean(n99TAM04_UPD_CNT), new Long(A99TAM04_UPD_CNT), new Boolean(n98TAM04_AUTH_NM), A98TAM04_AUTH_NM, new Boolean(n601TAM04_AUTH_LVL), new Byte(A601TAM04_AUTH_LVL), new Boolean(n18TAM04_DEL_FLG), A18TAM04_DEL_FLG, new Boolean(n40TAM04_CRT_PROG_NM), A40TAM04_CRT_PROG_NM, new Boolean(n42TAM04_UPD_PROG_NM), A42TAM04_UPD_PROG_NM});
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
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucadded"), 0, "");
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
                  pr_default.execute(10, new Object[] {new Boolean(n39TAM04_CRT_DATETIME), A39TAM04_CRT_DATETIME, new Boolean(n78TAM04_CRT_USER_ID), A78TAM04_CRT_USER_ID, new Boolean(n41TAM04_UPD_DATETIME), A41TAM04_UPD_DATETIME, new Boolean(n79TAM04_UPD_USER_ID), A79TAM04_UPD_USER_ID, new Boolean(n99TAM04_UPD_CNT), new Long(A99TAM04_UPD_CNT), new Boolean(n98TAM04_AUTH_NM), A98TAM04_AUTH_NM, new Boolean(n601TAM04_AUTH_LVL), new Byte(A601TAM04_AUTH_LVL), new Boolean(n18TAM04_DEL_FLG), A18TAM04_DEL_FLG, new Boolean(n40TAM04_CRT_PROG_NM), A40TAM04_CRT_PROG_NM, new Boolean(n42TAM04_UPD_PROG_NM), A42TAM04_UPD_PROG_NM, A17TAM04_AUTH_CD});
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
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "");
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
                  pr_default.execute(11, new Object[] {A17TAM04_AUTH_CD});
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
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucdeleted"), 0, "");
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
         pr_default.execute(12, new Object[] {A17TAM04_AUTH_CD});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"権限別振舞マスタ"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
         /* Using cursor T000C15 */
         pr_default.execute(13, new Object[] {A17TAM04_AUTH_CD});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"ユーザーマスタ"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
      }
   }

   public void processNestedLevel0C9( )
   {
      nGXsfl_95_idx = (short)(0) ;
      while ( nGXsfl_95_idx < nRC_Gridtam04bc_kngn_tam05_appli )
      {
         readRow0C9( ) ;
         if ( ( nRcdExists_9 != 0 ) || ( nIsMod_9 != 0 ) )
         {
            standaloneNotModal0C9( ) ;
            getKey0C9( ) ;
            if ( ( nRcdExists_9 == 0 ) && ( nRcdDeleted_9 == 0 ) )
            {
               if ( RcdFound9 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  insert0C9( ) ;
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTAM03_APP_ID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
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
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTAM03_APP_ID_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtTAM03_APP_ID_Internalname, GXutil.rtrim( A88TAM03_APP_ID)) ;
         httpContext.changePostValue( edtTAM05_KNGN_FLG_Internalname, GXutil.rtrim( A101TAM05_KNGN_FLG)) ;
         httpContext.changePostValue( edtTAM05_DEL_FLG_Internalname, GXutil.rtrim( A102TAM05_DEL_FLG)) ;
         httpContext.changePostValue( edtTAM05_CRT_DATETIME_Internalname, localUtil.format(A103TAM05_CRT_DATETIME, "9999/99/99 99:99:99")) ;
         httpContext.changePostValue( edtTAM05_CRT_USER_ID_Internalname, GXutil.rtrim( A104TAM05_CRT_USER_ID)) ;
         httpContext.changePostValue( edtTAM05_CRT_PROG_NM_Internalname, GXutil.rtrim( A105TAM05_CRT_PROG_NM)) ;
         httpContext.changePostValue( edtTAM05_UPD_DATETIME_Internalname, localUtil.format(A106TAM05_UPD_DATETIME, "9999/99/99 99:99:99")) ;
         httpContext.changePostValue( edtTAM05_UPD_USER_ID_Internalname, GXutil.rtrim( A107TAM05_UPD_USER_ID)) ;
         httpContext.changePostValue( edtTAM05_UPD_PROG_NM_Internalname, GXutil.rtrim( A108TAM05_UPD_PROG_NM)) ;
         httpContext.changePostValue( edtTAM05_UPD_CNT_Internalname, GXutil.ltrim( localUtil.ntoc( A109TAM05_UPD_CNT, (byte)(10), (byte)(0), ".", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z88TAM03_APP_ID_"+sGXsfl_95_idx, GXutil.rtrim( Z88TAM03_APP_ID)) ;
         httpContext.changePostValue( "ZT_"+"Z103TAM05_CRT_DATETIME_"+sGXsfl_95_idx, localUtil.ttoc( Z103TAM05_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z104TAM05_CRT_USER_ID_"+sGXsfl_95_idx, GXutil.rtrim( Z104TAM05_CRT_USER_ID)) ;
         httpContext.changePostValue( "ZT_"+"Z106TAM05_UPD_DATETIME_"+sGXsfl_95_idx, localUtil.ttoc( Z106TAM05_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z107TAM05_UPD_USER_ID_"+sGXsfl_95_idx, GXutil.rtrim( Z107TAM05_UPD_USER_ID)) ;
         httpContext.changePostValue( "ZT_"+"Z109TAM05_UPD_CNT_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( Z109TAM05_UPD_CNT, (byte)(10), (byte)(0), ".", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z101TAM05_KNGN_FLG_"+sGXsfl_95_idx, GXutil.rtrim( Z101TAM05_KNGN_FLG)) ;
         httpContext.changePostValue( "ZT_"+"Z102TAM05_DEL_FLG_"+sGXsfl_95_idx, GXutil.rtrim( Z102TAM05_DEL_FLG)) ;
         httpContext.changePostValue( "ZT_"+"Z105TAM05_CRT_PROG_NM_"+sGXsfl_95_idx, GXutil.rtrim( Z105TAM05_CRT_PROG_NM)) ;
         httpContext.changePostValue( "ZT_"+"Z108TAM05_UPD_PROG_NM_"+sGXsfl_95_idx, GXutil.rtrim( Z108TAM05_UPD_PROG_NM)) ;
         httpContext.changePostValue( "T109TAM05_UPD_CNT_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( O109TAM05_UPD_CNT, (byte)(10), (byte)(0), ".", ""))) ;
         httpContext.changePostValue( "nRcdDeleted_9_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_9, (byte)(4), (byte)(0), ".", ""))) ;
         httpContext.changePostValue( "nRcdExists_9_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_9, (byte)(4), (byte)(0), ".", ""))) ;
         httpContext.changePostValue( "nIsMod_9_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_9, (byte)(4), (byte)(0), ".", ""))) ;
         if ( nIsMod_9 != 0 )
         {
            httpContext.changePostValue( "TAM03_APP_ID_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM03_APP_ID_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TAM05_KNGN_FLG_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_KNGN_FLG_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TAM05_DEL_FLG_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_DEL_FLG_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TAM05_CRT_DATETIME_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_CRT_DATETIME_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TAM05_CRT_USER_ID_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_CRT_USER_ID_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TAM05_CRT_PROG_NM_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_CRT_PROG_NM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TAM05_UPD_DATETIME_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_UPD_DATETIME_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TAM05_UPD_USER_ID_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_UPD_USER_ID_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TAM05_UPD_PROG_NM_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_UPD_PROG_NM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TAM05_UPD_CNT_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_UPD_CNT_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
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
      /* Using cursor T000C16 */
      pr_default.execute(14);
      RcdFound3 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A17TAM04_AUTH_CD = T000C16_A17TAM04_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A17TAM04_AUTH_CD", A17TAM04_AUTH_CD);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0C3( )
   {
      pr_default.readNext(14);
      RcdFound3 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A17TAM04_AUTH_CD = T000C16_A17TAM04_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A17TAM04_AUTH_CD", A17TAM04_AUTH_CD);
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
      A39TAM04_CRT_DATETIME = GXutil.now( ) ;
      n39TAM04_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A39TAM04_CRT_DATETIME", localUtil.ttoc( A39TAM04_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char14 = A78TAM04_CRT_USER_ID ;
      GXv_char15[0] = GXt_char14 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char15) ;
      tam04bc_kngn_impl.this.GXt_char14 = GXv_char15[0] ;
      A78TAM04_CRT_USER_ID = GXt_char14 ;
      n78TAM04_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A78TAM04_CRT_USER_ID", A78TAM04_CRT_USER_ID);
      A41TAM04_UPD_DATETIME = GXutil.now( ) ;
      n41TAM04_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A41TAM04_UPD_DATETIME", localUtil.ttoc( A41TAM04_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char14 = A79TAM04_UPD_USER_ID ;
      GXv_char15[0] = GXt_char14 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char15) ;
      tam04bc_kngn_impl.this.GXt_char14 = GXv_char15[0] ;
      A79TAM04_UPD_USER_ID = GXt_char14 ;
      n79TAM04_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A79TAM04_UPD_USER_ID", A79TAM04_UPD_USER_ID);
      A99TAM04_UPD_CNT = (long)(O99TAM04_UPD_CNT+1) ;
      n99TAM04_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A99TAM04_UPD_CNT", GXutil.ltrim( GXutil.str( A99TAM04_UPD_CNT, 10, 0)));
   }

   public void beforeUpdate0C3( )
   {
      /* Before Update Rules */
      A41TAM04_UPD_DATETIME = GXutil.now( ) ;
      n41TAM04_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A41TAM04_UPD_DATETIME", localUtil.ttoc( A41TAM04_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char14 = A79TAM04_UPD_USER_ID ;
      GXv_char15[0] = GXt_char14 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char15) ;
      tam04bc_kngn_impl.this.GXt_char14 = GXv_char15[0] ;
      A79TAM04_UPD_USER_ID = GXt_char14 ;
      n79TAM04_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A79TAM04_UPD_USER_ID", A79TAM04_UPD_USER_ID);
      A99TAM04_UPD_CNT = (long)(O99TAM04_UPD_CNT+1) ;
      n99TAM04_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A99TAM04_UPD_CNT", GXutil.ltrim( GXutil.str( A99TAM04_UPD_CNT, 10, 0)));
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
            Z103TAM05_CRT_DATETIME = T000C3_A103TAM05_CRT_DATETIME[0] ;
            Z104TAM05_CRT_USER_ID = T000C3_A104TAM05_CRT_USER_ID[0] ;
            Z106TAM05_UPD_DATETIME = T000C3_A106TAM05_UPD_DATETIME[0] ;
            Z107TAM05_UPD_USER_ID = T000C3_A107TAM05_UPD_USER_ID[0] ;
            Z109TAM05_UPD_CNT = T000C3_A109TAM05_UPD_CNT[0] ;
            Z101TAM05_KNGN_FLG = T000C3_A101TAM05_KNGN_FLG[0] ;
            Z102TAM05_DEL_FLG = T000C3_A102TAM05_DEL_FLG[0] ;
            Z105TAM05_CRT_PROG_NM = T000C3_A105TAM05_CRT_PROG_NM[0] ;
            Z108TAM05_UPD_PROG_NM = T000C3_A108TAM05_UPD_PROG_NM[0] ;
         }
         else
         {
            Z103TAM05_CRT_DATETIME = A103TAM05_CRT_DATETIME ;
            Z104TAM05_CRT_USER_ID = A104TAM05_CRT_USER_ID ;
            Z106TAM05_UPD_DATETIME = A106TAM05_UPD_DATETIME ;
            Z107TAM05_UPD_USER_ID = A107TAM05_UPD_USER_ID ;
            Z109TAM05_UPD_CNT = A109TAM05_UPD_CNT ;
            Z101TAM05_KNGN_FLG = A101TAM05_KNGN_FLG ;
            Z102TAM05_DEL_FLG = A102TAM05_DEL_FLG ;
            Z105TAM05_CRT_PROG_NM = A105TAM05_CRT_PROG_NM ;
            Z108TAM05_UPD_PROG_NM = A108TAM05_UPD_PROG_NM ;
         }
      }
      if ( GX_JID == -16 )
      {
         Z17TAM04_AUTH_CD = A17TAM04_AUTH_CD ;
         Z103TAM05_CRT_DATETIME = A103TAM05_CRT_DATETIME ;
         Z104TAM05_CRT_USER_ID = A104TAM05_CRT_USER_ID ;
         Z106TAM05_UPD_DATETIME = A106TAM05_UPD_DATETIME ;
         Z107TAM05_UPD_USER_ID = A107TAM05_UPD_USER_ID ;
         Z109TAM05_UPD_CNT = A109TAM05_UPD_CNT ;
         Z101TAM05_KNGN_FLG = A101TAM05_KNGN_FLG ;
         Z102TAM05_DEL_FLG = A102TAM05_DEL_FLG ;
         Z105TAM05_CRT_PROG_NM = A105TAM05_CRT_PROG_NM ;
         Z108TAM05_UPD_PROG_NM = A108TAM05_UPD_PROG_NM ;
         Z88TAM03_APP_ID = A88TAM03_APP_ID ;
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
      if ( ( GXutil.strcmp(sMode9, "DSP") == 0 ) || ( GXutil.strcmp(sMode9, "DLT") == 0 ) )
      {
         disableAttributes0C9( ) ;
      }
   }

   public void load0C9( )
   {
      /* Using cursor T000C17 */
      pr_default.execute(15, new Object[] {A17TAM04_AUTH_CD, A88TAM03_APP_ID});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound9 = (short)(1) ;
         A103TAM05_CRT_DATETIME = T000C17_A103TAM05_CRT_DATETIME[0] ;
         n103TAM05_CRT_DATETIME = T000C17_n103TAM05_CRT_DATETIME[0] ;
         A104TAM05_CRT_USER_ID = T000C17_A104TAM05_CRT_USER_ID[0] ;
         n104TAM05_CRT_USER_ID = T000C17_n104TAM05_CRT_USER_ID[0] ;
         A106TAM05_UPD_DATETIME = T000C17_A106TAM05_UPD_DATETIME[0] ;
         n106TAM05_UPD_DATETIME = T000C17_n106TAM05_UPD_DATETIME[0] ;
         A107TAM05_UPD_USER_ID = T000C17_A107TAM05_UPD_USER_ID[0] ;
         n107TAM05_UPD_USER_ID = T000C17_n107TAM05_UPD_USER_ID[0] ;
         A109TAM05_UPD_CNT = T000C17_A109TAM05_UPD_CNT[0] ;
         n109TAM05_UPD_CNT = T000C17_n109TAM05_UPD_CNT[0] ;
         A101TAM05_KNGN_FLG = T000C17_A101TAM05_KNGN_FLG[0] ;
         n101TAM05_KNGN_FLG = T000C17_n101TAM05_KNGN_FLG[0] ;
         A102TAM05_DEL_FLG = T000C17_A102TAM05_DEL_FLG[0] ;
         n102TAM05_DEL_FLG = T000C17_n102TAM05_DEL_FLG[0] ;
         A105TAM05_CRT_PROG_NM = T000C17_A105TAM05_CRT_PROG_NM[0] ;
         n105TAM05_CRT_PROG_NM = T000C17_n105TAM05_CRT_PROG_NM[0] ;
         A108TAM05_UPD_PROG_NM = T000C17_A108TAM05_UPD_PROG_NM[0] ;
         n108TAM05_UPD_PROG_NM = T000C17_n108TAM05_UPD_PROG_NM[0] ;
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
      pr_default.execute(2, new Object[] {A88TAM03_APP_ID});
      if ( (pr_default.getStatus(2) == 101) )
      {
         AnyError88 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'アプリケーションマスタ'", "ForeignKeyNotFound", 1, "TAM03_APP_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAM03_APP_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError88 == 0 )
      {
      }
      pr_default.close(2);
      if ( ! ( GXutil.nullDate().equals(A103TAM05_CRT_DATETIME) || (( A103TAM05_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A103TAM05_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A106TAM05_UPD_DATETIME) || (( A106TAM05_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A106TAM05_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors0C9( )
   {
      pr_default.close(2);
   }

   public void enableDisable0C9( )
   {
   }

   public void gxload_17( String A88TAM03_APP_ID )
   {
      /* Using cursor T000C18 */
      pr_default.execute(16, new Object[] {A88TAM03_APP_ID});
      if ( (pr_default.getStatus(16) == 101) )
      {
         AnyError88 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'アプリケーションマスタ'", "ForeignKeyNotFound", 1, "TAM03_APP_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAM03_APP_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError88 == 0 )
      {
      }
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(16);
   }

   public void getKey0C9( )
   {
      /* Using cursor T000C19 */
      pr_default.execute(17, new Object[] {A17TAM04_AUTH_CD, A88TAM03_APP_ID});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound9 = (short)(1) ;
      }
      else
      {
         RcdFound9 = (short)(0) ;
      }
      pr_default.close(17);
   }

   public void getByPrimaryKey0C9( )
   {
      /* Using cursor T000C3 */
      pr_default.execute(1, new Object[] {A17TAM04_AUTH_CD, A88TAM03_APP_ID});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0C9( 16) ;
         RcdFound9 = (short)(1) ;
         initializeNonKey0C9( ) ;
         A103TAM05_CRT_DATETIME = T000C3_A103TAM05_CRT_DATETIME[0] ;
         n103TAM05_CRT_DATETIME = T000C3_n103TAM05_CRT_DATETIME[0] ;
         A104TAM05_CRT_USER_ID = T000C3_A104TAM05_CRT_USER_ID[0] ;
         n104TAM05_CRT_USER_ID = T000C3_n104TAM05_CRT_USER_ID[0] ;
         A106TAM05_UPD_DATETIME = T000C3_A106TAM05_UPD_DATETIME[0] ;
         n106TAM05_UPD_DATETIME = T000C3_n106TAM05_UPD_DATETIME[0] ;
         A107TAM05_UPD_USER_ID = T000C3_A107TAM05_UPD_USER_ID[0] ;
         n107TAM05_UPD_USER_ID = T000C3_n107TAM05_UPD_USER_ID[0] ;
         A109TAM05_UPD_CNT = T000C3_A109TAM05_UPD_CNT[0] ;
         n109TAM05_UPD_CNT = T000C3_n109TAM05_UPD_CNT[0] ;
         A101TAM05_KNGN_FLG = T000C3_A101TAM05_KNGN_FLG[0] ;
         n101TAM05_KNGN_FLG = T000C3_n101TAM05_KNGN_FLG[0] ;
         A102TAM05_DEL_FLG = T000C3_A102TAM05_DEL_FLG[0] ;
         n102TAM05_DEL_FLG = T000C3_n102TAM05_DEL_FLG[0] ;
         A105TAM05_CRT_PROG_NM = T000C3_A105TAM05_CRT_PROG_NM[0] ;
         n105TAM05_CRT_PROG_NM = T000C3_n105TAM05_CRT_PROG_NM[0] ;
         A108TAM05_UPD_PROG_NM = T000C3_A108TAM05_UPD_PROG_NM[0] ;
         n108TAM05_UPD_PROG_NM = T000C3_n108TAM05_UPD_PROG_NM[0] ;
         A88TAM03_APP_ID = T000C3_A88TAM03_APP_ID[0] ;
         O109TAM05_UPD_CNT = A109TAM05_UPD_CNT ;
         n109TAM05_UPD_CNT = false ;
         Z17TAM04_AUTH_CD = A17TAM04_AUTH_CD ;
         Z88TAM03_APP_ID = A88TAM03_APP_ID ;
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
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency0C9( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000C2 */
         pr_default.execute(0, new Object[] {A17TAM04_AUTH_CD, A88TAM03_APP_ID});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TAM05_APPLI_KNGN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z103TAM05_CRT_DATETIME.equals( T000C2_A103TAM05_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z104TAM05_CRT_USER_ID, T000C2_A104TAM05_CRT_USER_ID[0]) != 0 ) || !( Z106TAM05_UPD_DATETIME.equals( T000C2_A106TAM05_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z107TAM05_UPD_USER_ID, T000C2_A107TAM05_UPD_USER_ID[0]) != 0 ) || ( Z109TAM05_UPD_CNT != T000C2_A109TAM05_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z101TAM05_KNGN_FLG, T000C2_A101TAM05_KNGN_FLG[0]) != 0 ) || ( GXutil.strcmp(Z102TAM05_DEL_FLG, T000C2_A102TAM05_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z105TAM05_CRT_PROG_NM, T000C2_A105TAM05_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z108TAM05_UPD_PROG_NM, T000C2_A108TAM05_UPD_PROG_NM[0]) != 0 ) )
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
                  /* Using cursor T000C20 */
                  pr_default.execute(18, new Object[] {A17TAM04_AUTH_CD, new Boolean(n103TAM05_CRT_DATETIME), A103TAM05_CRT_DATETIME, new Boolean(n104TAM05_CRT_USER_ID), A104TAM05_CRT_USER_ID, new Boolean(n106TAM05_UPD_DATETIME), A106TAM05_UPD_DATETIME, new Boolean(n107TAM05_UPD_USER_ID), A107TAM05_UPD_USER_ID, new Boolean(n109TAM05_UPD_CNT), new Long(A109TAM05_UPD_CNT), new Boolean(n101TAM05_KNGN_FLG), A101TAM05_KNGN_FLG, new Boolean(n102TAM05_DEL_FLG), A102TAM05_DEL_FLG, new Boolean(n105TAM05_CRT_PROG_NM), A105TAM05_CRT_PROG_NM, new Boolean(n108TAM05_UPD_PROG_NM), A108TAM05_UPD_PROG_NM, A88TAM03_APP_ID});
                  if ( (pr_default.getStatus(18) == 1) )
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
                  /* Using cursor T000C21 */
                  pr_default.execute(19, new Object[] {new Boolean(n103TAM05_CRT_DATETIME), A103TAM05_CRT_DATETIME, new Boolean(n104TAM05_CRT_USER_ID), A104TAM05_CRT_USER_ID, new Boolean(n106TAM05_UPD_DATETIME), A106TAM05_UPD_DATETIME, new Boolean(n107TAM05_UPD_USER_ID), A107TAM05_UPD_USER_ID, new Boolean(n109TAM05_UPD_CNT), new Long(A109TAM05_UPD_CNT), new Boolean(n101TAM05_KNGN_FLG), A101TAM05_KNGN_FLG, new Boolean(n102TAM05_DEL_FLG), A102TAM05_DEL_FLG, new Boolean(n105TAM05_CRT_PROG_NM), A105TAM05_CRT_PROG_NM, new Boolean(n108TAM05_UPD_PROG_NM), A108TAM05_UPD_PROG_NM, A17TAM04_AUTH_CD, A88TAM03_APP_ID});
                  if ( (pr_default.getStatus(19) == 103) )
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
               /* Using cursor T000C22 */
               pr_default.execute(20, new Object[] {A17TAM04_AUTH_CD, A88TAM03_APP_ID});
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
      /* Using cursor T000C23 */
      pr_default.execute(21, new Object[] {A17TAM04_AUTH_CD});
      RcdFound9 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound9 = (short)(1) ;
         A88TAM03_APP_ID = T000C23_A88TAM03_APP_ID[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0C9( )
   {
      pr_default.readNext(21);
      RcdFound9 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound9 = (short)(1) ;
         A88TAM03_APP_ID = T000C23_A88TAM03_APP_ID[0] ;
      }
   }

   public void scanEnd0C9( )
   {
      pr_default.close(21);
   }

   public void afterConfirm0C9( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0C9( )
   {
      /* Before Insert Rules */
      A103TAM05_CRT_DATETIME = GXutil.now( ) ;
      n103TAM05_CRT_DATETIME = false ;
      GXt_char14 = A104TAM05_CRT_USER_ID ;
      GXv_char15[0] = GXt_char14 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char15) ;
      tam04bc_kngn_impl.this.GXt_char14 = GXv_char15[0] ;
      A104TAM05_CRT_USER_ID = GXt_char14 ;
      n104TAM05_CRT_USER_ID = false ;
      A106TAM05_UPD_DATETIME = GXutil.now( ) ;
      n106TAM05_UPD_DATETIME = false ;
      GXt_char14 = A107TAM05_UPD_USER_ID ;
      GXv_char15[0] = GXt_char14 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char15) ;
      tam04bc_kngn_impl.this.GXt_char14 = GXv_char15[0] ;
      A107TAM05_UPD_USER_ID = GXt_char14 ;
      n107TAM05_UPD_USER_ID = false ;
      A109TAM05_UPD_CNT = (long)(O109TAM05_UPD_CNT+1) ;
      n109TAM05_UPD_CNT = false ;
   }

   public void beforeUpdate0C9( )
   {
      /* Before Update Rules */
      A106TAM05_UPD_DATETIME = GXutil.now( ) ;
      n106TAM05_UPD_DATETIME = false ;
      GXt_char14 = A107TAM05_UPD_USER_ID ;
      GXv_char15[0] = GXt_char14 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char15) ;
      tam04bc_kngn_impl.this.GXt_char14 = GXv_char15[0] ;
      A107TAM05_UPD_USER_ID = GXt_char14 ;
      n107TAM05_UPD_USER_ID = false ;
      A109TAM05_UPD_CNT = (long)(O109TAM05_UPD_CNT+1) ;
      n109TAM05_UPD_CNT = false ;
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

   public void addRow0C9( )
   {
      nGXsfl_95_idx = (short)(nGXsfl_95_idx+1) ;
      sGXsfl_95_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_95_idx, 4, 0)), (short)(4), "0") ;
      edtTAM03_APP_ID_Internalname = "TAM03_APP_ID_"+sGXsfl_95_idx ;
      edtTAM05_KNGN_FLG_Internalname = "TAM05_KNGN_FLG_"+sGXsfl_95_idx ;
      edtTAM05_DEL_FLG_Internalname = "TAM05_DEL_FLG_"+sGXsfl_95_idx ;
      edtTAM05_CRT_DATETIME_Internalname = "TAM05_CRT_DATETIME_"+sGXsfl_95_idx ;
      edtTAM05_CRT_USER_ID_Internalname = "TAM05_CRT_USER_ID_"+sGXsfl_95_idx ;
      edtTAM05_CRT_PROG_NM_Internalname = "TAM05_CRT_PROG_NM_"+sGXsfl_95_idx ;
      edtTAM05_UPD_DATETIME_Internalname = "TAM05_UPD_DATETIME_"+sGXsfl_95_idx ;
      edtTAM05_UPD_USER_ID_Internalname = "TAM05_UPD_USER_ID_"+sGXsfl_95_idx ;
      edtTAM05_UPD_PROG_NM_Internalname = "TAM05_UPD_PROG_NM_"+sGXsfl_95_idx ;
      edtTAM05_UPD_CNT_Internalname = "TAM05_UPD_CNT_"+sGXsfl_95_idx ;
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
         httpContext.ajax_rsp_assign_prop("", false, "Gridtam04bc_kngn_tam05_appliContainerDiv", "Backcolor", GXutil.ltrim( GXutil.str( subGridtam04bc_kngn_tam05_appli_Backcolor, 9, 0)));
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
         httpContext.ajax_rsp_assign_prop("", false, "Gridtam04bc_kngn_tam05_appliContainerDiv", "Backcolor", GXutil.ltrim( GXutil.str( subGridtam04bc_kngn_tam05_appli_Backcolor, 9, 0)));
      }
      else if ( subGridtam04bc_kngn_tam05_appli_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridtam04bc_kngn_tam05_appli_Backstyle = (byte)(1) ;
         if ( ((int)(nGXsfl_95_idx) % (2)) == 0 )
         {
            subGridtam04bc_kngn_tam05_appli_Backcolor = (int)(0x0) ;
            httpContext.ajax_rsp_assign_prop("", false, "Gridtam04bc_kngn_tam05_appliContainerDiv", "Backcolor", GXutil.ltrim( GXutil.str( subGridtam04bc_kngn_tam05_appli_Backcolor, 9, 0)));
            if ( GXutil.strcmp(subGridtam04bc_kngn_tam05_appli_Class, "") != 0 )
            {
               subGridtam04bc_kngn_tam05_appli_Linesclass = subGridtam04bc_kngn_tam05_appli_Class+"Even" ;
            }
         }
         else
         {
            subGridtam04bc_kngn_tam05_appli_Backcolor = (int)(0xFFFFFF) ;
            httpContext.ajax_rsp_assign_prop("", false, "Gridtam04bc_kngn_tam05_appliContainerDiv", "Backcolor", GXutil.ltrim( GXutil.str( subGridtam04bc_kngn_tam05_appli_Backcolor, 9, 0)));
            if ( GXutil.strcmp(subGridtam04bc_kngn_tam05_appli_Class, "") != 0 )
            {
               subGridtam04bc_kngn_tam05_appli_Linesclass = subGridtam04bc_kngn_tam05_appli_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_9_" + sGXsfl_95_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 96,'',false,'" + sGXsfl_95_idx + "',95)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ROClassString = ClassString ;
      Gridtam04bc_kngn_tam05_appliRow.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtTAM03_APP_ID_Internalname,GXutil.rtrim( A88TAM03_APP_ID),"",TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(96);\"","","","","",edtTAM03_APP_ID_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(-1),new Integer(edtTAM03_APP_ID_Enabled),new Integer(1),new Integer(0),"px",new Integer(17),"px",new Integer(7),new Integer(0),new Integer(0),new Integer(95),new Integer(1),new Integer(-1),new Boolean(true),"left"});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_9_" + sGXsfl_95_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 97,'',false,'" + sGXsfl_95_idx + "',95)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ROClassString = ClassString ;
      Gridtam04bc_kngn_tam05_appliRow.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtTAM05_KNGN_FLG_Internalname,GXutil.rtrim( A101TAM05_KNGN_FLG),"",TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(97);\"","","","","",edtTAM05_KNGN_FLG_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(-1),new Integer(edtTAM05_KNGN_FLG_Enabled),new Integer(0),new Integer(0),"px",new Integer(17),"px",new Integer(1),new Integer(0),new Integer(0),new Integer(95),new Integer(1),new Integer(-1),new Boolean(true),"left"});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_9_" + sGXsfl_95_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 98,'',false,'" + sGXsfl_95_idx + "',95)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ROClassString = ClassString ;
      Gridtam04bc_kngn_tam05_appliRow.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtTAM05_DEL_FLG_Internalname,GXutil.rtrim( A102TAM05_DEL_FLG),"",TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(98);\"","","","","",edtTAM05_DEL_FLG_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(-1),new Integer(edtTAM05_DEL_FLG_Enabled),new Integer(0),new Integer(0),"px",new Integer(17),"px",new Integer(1),new Integer(0),new Integer(0),new Integer(95),new Integer(1),new Integer(-1),new Boolean(true),"left"});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_9_" + sGXsfl_95_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 99,'',false,'" + sGXsfl_95_idx + "',95)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ROClassString = ClassString ;
      Gridtam04bc_kngn_tam05_appliRow.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtTAM05_CRT_DATETIME_Internalname,localUtil.format(A103TAM05_CRT_DATETIME, "9999/99/99 99:99:99"),localUtil.format( A103TAM05_CRT_DATETIME, "9999/99/99 99:99:99"),TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(99);\"","","","","",edtTAM05_CRT_DATETIME_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(-1),new Integer(edtTAM05_CRT_DATETIME_Enabled),new Integer(0),new Integer(0),"px",new Integer(17),"px",new Integer(19),new Integer(0),new Integer(0),new Integer(95),new Integer(1),new Integer(-1),new Boolean(true),"right"});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_9_" + sGXsfl_95_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 100,'',false,'" + sGXsfl_95_idx + "',95)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ROClassString = ClassString ;
      Gridtam04bc_kngn_tam05_appliRow.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtTAM05_CRT_USER_ID_Internalname,GXutil.rtrim( A104TAM05_CRT_USER_ID),"",TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(100);\"","","","","",edtTAM05_CRT_USER_ID_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(-1),new Integer(edtTAM05_CRT_USER_ID_Enabled),new Integer(0),new Integer(0),"px",new Integer(17),"px",new Integer(128),new Integer(0),new Integer(0),new Integer(95),new Integer(1),new Integer(-1),new Boolean(true),"left"});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_9_" + sGXsfl_95_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 101,'',false,'" + sGXsfl_95_idx + "',95)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ROClassString = ClassString ;
      Gridtam04bc_kngn_tam05_appliRow.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtTAM05_CRT_PROG_NM_Internalname,GXutil.rtrim( A105TAM05_CRT_PROG_NM),"",TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(101);\"","","","","",edtTAM05_CRT_PROG_NM_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(-1),new Integer(edtTAM05_CRT_PROG_NM_Enabled),new Integer(0),new Integer(0),"px",new Integer(17),"px",new Integer(40),new Integer(0),new Integer(0),new Integer(95),new Integer(1),new Integer(-1),new Boolean(true),"left"});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_9_" + sGXsfl_95_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 102,'',false,'" + sGXsfl_95_idx + "',95)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ROClassString = ClassString ;
      Gridtam04bc_kngn_tam05_appliRow.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtTAM05_UPD_DATETIME_Internalname,localUtil.format(A106TAM05_UPD_DATETIME, "9999/99/99 99:99:99"),localUtil.format( A106TAM05_UPD_DATETIME, "9999/99/99 99:99:99"),TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(102);\"","","","","",edtTAM05_UPD_DATETIME_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(-1),new Integer(edtTAM05_UPD_DATETIME_Enabled),new Integer(0),new Integer(0),"px",new Integer(17),"px",new Integer(19),new Integer(0),new Integer(0),new Integer(95),new Integer(1),new Integer(-1),new Boolean(true),"right"});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_9_" + sGXsfl_95_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 103,'',false,'" + sGXsfl_95_idx + "',95)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ROClassString = ClassString ;
      Gridtam04bc_kngn_tam05_appliRow.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtTAM05_UPD_USER_ID_Internalname,GXutil.rtrim( A107TAM05_UPD_USER_ID),"",TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(103);\"","","","","",edtTAM05_UPD_USER_ID_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(-1),new Integer(edtTAM05_UPD_USER_ID_Enabled),new Integer(0),new Integer(0),"px",new Integer(17),"px",new Integer(128),new Integer(0),new Integer(0),new Integer(95),new Integer(1),new Integer(-1),new Boolean(true),"left"});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_9_" + sGXsfl_95_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 104,'',false,'" + sGXsfl_95_idx + "',95)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ROClassString = ClassString ;
      Gridtam04bc_kngn_tam05_appliRow.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtTAM05_UPD_PROG_NM_Internalname,GXutil.rtrim( A108TAM05_UPD_PROG_NM),"",TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(104);\"","","","","",edtTAM05_UPD_PROG_NM_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(-1),new Integer(edtTAM05_UPD_PROG_NM_Enabled),new Integer(0),new Integer(0),"px",new Integer(17),"px",new Integer(40),new Integer(0),new Integer(0),new Integer(95),new Integer(1),new Integer(-1),new Boolean(true),"left"});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_9_" + sGXsfl_95_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 105,'',false,'" + sGXsfl_95_idx + "',95)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ROClassString = ClassString ;
      Gridtam04bc_kngn_tam05_appliRow.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtTAM05_UPD_CNT_Internalname,GXutil.ltrim( localUtil.ntoc( A109TAM05_UPD_CNT, (byte)(10), (byte)(0), ".", "")),((edtTAM05_UPD_CNT_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A109TAM05_UPD_CNT), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A109TAM05_UPD_CNT), "ZZZZZZZZZ9")),TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(105);\"","","","","",edtTAM05_UPD_CNT_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(-1),new Integer(edtTAM05_UPD_CNT_Enabled),new Integer(0),new Integer(0),"px",new Integer(17),"px",new Integer(10),new Integer(0),new Integer(0),new Integer(95),new Integer(1),new Integer(-1),new Boolean(true),"right"});
      httpContext.ajax_sending_grid_row(Gridtam04bc_kngn_tam05_appliRow);
      GXCCtl = "Z88TAM03_APP_ID_" + sGXsfl_95_idx ;
      GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z88TAM03_APP_ID));
      GXCCtl = "Z103TAM05_CRT_DATETIME_" + sGXsfl_95_idx ;
      GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z103TAM05_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z104TAM05_CRT_USER_ID_" + sGXsfl_95_idx ;
      GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z104TAM05_CRT_USER_ID));
      GXCCtl = "Z106TAM05_UPD_DATETIME_" + sGXsfl_95_idx ;
      GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z106TAM05_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z107TAM05_UPD_USER_ID_" + sGXsfl_95_idx ;
      GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z107TAM05_UPD_USER_ID));
      GXCCtl = "Z109TAM05_UPD_CNT_" + sGXsfl_95_idx ;
      GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z109TAM05_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GXCCtl = "Z101TAM05_KNGN_FLG_" + sGXsfl_95_idx ;
      GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z101TAM05_KNGN_FLG));
      GXCCtl = "Z102TAM05_DEL_FLG_" + sGXsfl_95_idx ;
      GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z102TAM05_DEL_FLG));
      GXCCtl = "Z105TAM05_CRT_PROG_NM_" + sGXsfl_95_idx ;
      GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z105TAM05_CRT_PROG_NM));
      GXCCtl = "Z108TAM05_UPD_PROG_NM_" + sGXsfl_95_idx ;
      GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z108TAM05_UPD_PROG_NM));
      GXCCtl = "O109TAM05_UPD_CNT_" + sGXsfl_95_idx ;
      GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O109TAM05_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GXCCtl = "nRcdDeleted_9_" + sGXsfl_95_idx ;
      GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_9, (byte)(4), (byte)(0), ".", "")));
      GXCCtl = "nRcdExists_9_" + sGXsfl_95_idx ;
      GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_9, (byte)(4), (byte)(0), ".", "")));
      GXCCtl = "nIsMod_9_" + sGXsfl_95_idx ;
      GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_9, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TAM03_APP_ID_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM03_APP_ID_Enabled, (byte)(5), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TAM05_KNGN_FLG_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_KNGN_FLG_Enabled, (byte)(5), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TAM05_DEL_FLG_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_DEL_FLG_Enabled, (byte)(5), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TAM05_CRT_DATETIME_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_CRT_DATETIME_Enabled, (byte)(5), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TAM05_CRT_USER_ID_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_CRT_USER_ID_Enabled, (byte)(5), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TAM05_CRT_PROG_NM_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_CRT_PROG_NM_Enabled, (byte)(5), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TAM05_UPD_DATETIME_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_UPD_DATETIME_Enabled, (byte)(5), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TAM05_UPD_USER_ID_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_UPD_USER_ID_Enabled, (byte)(5), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TAM05_UPD_PROG_NM_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_UPD_PROG_NM_Enabled, (byte)(5), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TAM05_UPD_CNT_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_UPD_CNT_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridtam04bc_kngn_tam05_appliContainer.AddRow(Gridtam04bc_kngn_tam05_appliRow);
   }

   public void readRow0C9( )
   {
      nGXsfl_95_idx = (short)(nGXsfl_95_idx+1) ;
      sGXsfl_95_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_95_idx, 4, 0)), (short)(4), "0") ;
      edtTAM03_APP_ID_Internalname = "TAM03_APP_ID_"+sGXsfl_95_idx ;
      edtTAM05_KNGN_FLG_Internalname = "TAM05_KNGN_FLG_"+sGXsfl_95_idx ;
      edtTAM05_DEL_FLG_Internalname = "TAM05_DEL_FLG_"+sGXsfl_95_idx ;
      edtTAM05_CRT_DATETIME_Internalname = "TAM05_CRT_DATETIME_"+sGXsfl_95_idx ;
      edtTAM05_CRT_USER_ID_Internalname = "TAM05_CRT_USER_ID_"+sGXsfl_95_idx ;
      edtTAM05_CRT_PROG_NM_Internalname = "TAM05_CRT_PROG_NM_"+sGXsfl_95_idx ;
      edtTAM05_UPD_DATETIME_Internalname = "TAM05_UPD_DATETIME_"+sGXsfl_95_idx ;
      edtTAM05_UPD_USER_ID_Internalname = "TAM05_UPD_USER_ID_"+sGXsfl_95_idx ;
      edtTAM05_UPD_PROG_NM_Internalname = "TAM05_UPD_PROG_NM_"+sGXsfl_95_idx ;
      edtTAM05_UPD_CNT_Internalname = "TAM05_UPD_CNT_"+sGXsfl_95_idx ;
      edtTAM03_APP_ID_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAM03_APP_ID_"+sGXsfl_95_idx+"Enabled"), ".", ",")) ;
      edtTAM05_KNGN_FLG_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAM05_KNGN_FLG_"+sGXsfl_95_idx+"Enabled"), ".", ",")) ;
      edtTAM05_DEL_FLG_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAM05_DEL_FLG_"+sGXsfl_95_idx+"Enabled"), ".", ",")) ;
      edtTAM05_CRT_DATETIME_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAM05_CRT_DATETIME_"+sGXsfl_95_idx+"Enabled"), ".", ",")) ;
      edtTAM05_CRT_USER_ID_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAM05_CRT_USER_ID_"+sGXsfl_95_idx+"Enabled"), ".", ",")) ;
      edtTAM05_CRT_PROG_NM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAM05_CRT_PROG_NM_"+sGXsfl_95_idx+"Enabled"), ".", ",")) ;
      edtTAM05_UPD_DATETIME_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAM05_UPD_DATETIME_"+sGXsfl_95_idx+"Enabled"), ".", ",")) ;
      edtTAM05_UPD_USER_ID_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAM05_UPD_USER_ID_"+sGXsfl_95_idx+"Enabled"), ".", ",")) ;
      edtTAM05_UPD_PROG_NM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAM05_UPD_PROG_NM_"+sGXsfl_95_idx+"Enabled"), ".", ",")) ;
      edtTAM05_UPD_CNT_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAM05_UPD_CNT_"+sGXsfl_95_idx+"Enabled"), ".", ",")) ;
      A88TAM03_APP_ID = httpContext.cgiGet( edtTAM03_APP_ID_Internalname) ;
      A101TAM05_KNGN_FLG = httpContext.cgiGet( edtTAM05_KNGN_FLG_Internalname) ;
      n101TAM05_KNGN_FLG = false ;
      n101TAM05_KNGN_FLG = ((GXutil.strcmp("", A101TAM05_KNGN_FLG)==0) ? true : false) ;
      A102TAM05_DEL_FLG = httpContext.cgiGet( edtTAM05_DEL_FLG_Internalname) ;
      n102TAM05_DEL_FLG = false ;
      n102TAM05_DEL_FLG = ((GXutil.strcmp("", A102TAM05_DEL_FLG)==0) ? true : false) ;
      if ( localUtil.vcdtime( httpContext.cgiGet( edtTAM05_CRT_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"作成日時"}), 1, "TAM05_CRT_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAM05_CRT_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         wbErr = true ;
         A103TAM05_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
         n103TAM05_CRT_DATETIME = false ;
      }
      else
      {
         A103TAM05_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTAM05_CRT_DATETIME_Internalname)) ;
         n103TAM05_CRT_DATETIME = false ;
      }
      n103TAM05_CRT_DATETIME = (GXutil.nullDate().equals(A103TAM05_CRT_DATETIME) ? true : false) ;
      A104TAM05_CRT_USER_ID = httpContext.cgiGet( edtTAM05_CRT_USER_ID_Internalname) ;
      n104TAM05_CRT_USER_ID = false ;
      n104TAM05_CRT_USER_ID = ((GXutil.strcmp("", A104TAM05_CRT_USER_ID)==0) ? true : false) ;
      A105TAM05_CRT_PROG_NM = httpContext.cgiGet( edtTAM05_CRT_PROG_NM_Internalname) ;
      n105TAM05_CRT_PROG_NM = false ;
      n105TAM05_CRT_PROG_NM = ((GXutil.strcmp("", A105TAM05_CRT_PROG_NM)==0) ? true : false) ;
      if ( localUtil.vcdtime( httpContext.cgiGet( edtTAM05_UPD_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"更新日時"}), 1, "TAM05_UPD_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAM05_UPD_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         wbErr = true ;
         A106TAM05_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
         n106TAM05_UPD_DATETIME = false ;
      }
      else
      {
         A106TAM05_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTAM05_UPD_DATETIME_Internalname)) ;
         n106TAM05_UPD_DATETIME = false ;
      }
      n106TAM05_UPD_DATETIME = (GXutil.nullDate().equals(A106TAM05_UPD_DATETIME) ? true : false) ;
      A107TAM05_UPD_USER_ID = httpContext.cgiGet( edtTAM05_UPD_USER_ID_Internalname) ;
      n107TAM05_UPD_USER_ID = false ;
      n107TAM05_UPD_USER_ID = ((GXutil.strcmp("", A107TAM05_UPD_USER_ID)==0) ? true : false) ;
      A108TAM05_UPD_PROG_NM = httpContext.cgiGet( edtTAM05_UPD_PROG_NM_Internalname) ;
      n108TAM05_UPD_PROG_NM = false ;
      n108TAM05_UPD_PROG_NM = ((GXutil.strcmp("", A108TAM05_UPD_PROG_NM)==0) ? true : false) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTAM05_UPD_CNT_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTAM05_UPD_CNT_Internalname), ".", ",") > 9999999999L ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TAM05_UPD_CNT");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAM05_UPD_CNT_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         wbErr = true ;
         A109TAM05_UPD_CNT = 0 ;
         n109TAM05_UPD_CNT = false ;
      }
      else
      {
         A109TAM05_UPD_CNT = localUtil.ctol( httpContext.cgiGet( edtTAM05_UPD_CNT_Internalname), ".", ",") ;
         n109TAM05_UPD_CNT = false ;
      }
      n109TAM05_UPD_CNT = ((0==A109TAM05_UPD_CNT) ? true : false) ;
      GXCCtl = "Z88TAM03_APP_ID_" + sGXsfl_95_idx ;
      Z88TAM03_APP_ID = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z103TAM05_CRT_DATETIME_" + sGXsfl_95_idx ;
      Z103TAM05_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      n103TAM05_CRT_DATETIME = (GXutil.nullDate().equals(A103TAM05_CRT_DATETIME) ? true : false) ;
      GXCCtl = "Z104TAM05_CRT_USER_ID_" + sGXsfl_95_idx ;
      Z104TAM05_CRT_USER_ID = httpContext.cgiGet( GXCCtl) ;
      n104TAM05_CRT_USER_ID = ((GXutil.strcmp("", A104TAM05_CRT_USER_ID)==0) ? true : false) ;
      GXCCtl = "Z106TAM05_UPD_DATETIME_" + sGXsfl_95_idx ;
      Z106TAM05_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      n106TAM05_UPD_DATETIME = (GXutil.nullDate().equals(A106TAM05_UPD_DATETIME) ? true : false) ;
      GXCCtl = "Z107TAM05_UPD_USER_ID_" + sGXsfl_95_idx ;
      Z107TAM05_UPD_USER_ID = httpContext.cgiGet( GXCCtl) ;
      n107TAM05_UPD_USER_ID = ((GXutil.strcmp("", A107TAM05_UPD_USER_ID)==0) ? true : false) ;
      GXCCtl = "Z109TAM05_UPD_CNT_" + sGXsfl_95_idx ;
      Z109TAM05_UPD_CNT = localUtil.ctol( httpContext.cgiGet( GXCCtl), ".", ",") ;
      n109TAM05_UPD_CNT = ((0==A109TAM05_UPD_CNT) ? true : false) ;
      GXCCtl = "Z101TAM05_KNGN_FLG_" + sGXsfl_95_idx ;
      Z101TAM05_KNGN_FLG = httpContext.cgiGet( GXCCtl) ;
      n101TAM05_KNGN_FLG = ((GXutil.strcmp("", A101TAM05_KNGN_FLG)==0) ? true : false) ;
      GXCCtl = "Z102TAM05_DEL_FLG_" + sGXsfl_95_idx ;
      Z102TAM05_DEL_FLG = httpContext.cgiGet( GXCCtl) ;
      n102TAM05_DEL_FLG = ((GXutil.strcmp("", A102TAM05_DEL_FLG)==0) ? true : false) ;
      GXCCtl = "Z105TAM05_CRT_PROG_NM_" + sGXsfl_95_idx ;
      Z105TAM05_CRT_PROG_NM = httpContext.cgiGet( GXCCtl) ;
      n105TAM05_CRT_PROG_NM = ((GXutil.strcmp("", A105TAM05_CRT_PROG_NM)==0) ? true : false) ;
      GXCCtl = "Z108TAM05_UPD_PROG_NM_" + sGXsfl_95_idx ;
      Z108TAM05_UPD_PROG_NM = httpContext.cgiGet( GXCCtl) ;
      n108TAM05_UPD_PROG_NM = ((GXutil.strcmp("", A108TAM05_UPD_PROG_NM)==0) ? true : false) ;
      GXCCtl = "O109TAM05_UPD_CNT_" + sGXsfl_95_idx ;
      O109TAM05_UPD_CNT = localUtil.ctol( httpContext.cgiGet( GXCCtl), ".", ",") ;
      n109TAM05_UPD_CNT = ((0==A109TAM05_UPD_CNT) ? true : false) ;
      GXCCtl = "nRcdDeleted_9_" + sGXsfl_95_idx ;
      nRcdDeleted_9 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ".", ",")) ;
      GXCCtl = "nRcdExists_9_" + sGXsfl_95_idx ;
      nRcdExists_9 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ".", ",")) ;
      GXCCtl = "nIsMod_9_" + sGXsfl_95_idx ;
      nIsMod_9 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ".", ",")) ;
   }

   public void assign_properties_default( )
   {
      defedtTAM03_APP_ID_Enabled = edtTAM03_APP_ID_Enabled ;
   }

   public void confirmValues0C0( )
   {
      nGXsfl_95_idx = (short)(0) ;
      sGXsfl_95_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_95_idx, 4, 0)), (short)(4), "0") ;
      edtTAM03_APP_ID_Internalname = "TAM03_APP_ID_"+sGXsfl_95_idx ;
      edtTAM05_KNGN_FLG_Internalname = "TAM05_KNGN_FLG_"+sGXsfl_95_idx ;
      edtTAM05_DEL_FLG_Internalname = "TAM05_DEL_FLG_"+sGXsfl_95_idx ;
      edtTAM05_CRT_DATETIME_Internalname = "TAM05_CRT_DATETIME_"+sGXsfl_95_idx ;
      edtTAM05_CRT_USER_ID_Internalname = "TAM05_CRT_USER_ID_"+sGXsfl_95_idx ;
      edtTAM05_CRT_PROG_NM_Internalname = "TAM05_CRT_PROG_NM_"+sGXsfl_95_idx ;
      edtTAM05_UPD_DATETIME_Internalname = "TAM05_UPD_DATETIME_"+sGXsfl_95_idx ;
      edtTAM05_UPD_USER_ID_Internalname = "TAM05_UPD_USER_ID_"+sGXsfl_95_idx ;
      edtTAM05_UPD_PROG_NM_Internalname = "TAM05_UPD_PROG_NM_"+sGXsfl_95_idx ;
      edtTAM05_UPD_CNT_Internalname = "TAM05_UPD_CNT_"+sGXsfl_95_idx ;
      while ( nGXsfl_95_idx < nRC_Gridtam04bc_kngn_tam05_appli )
      {
         nGXsfl_95_idx = (short)(nGXsfl_95_idx+1) ;
         sGXsfl_95_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_95_idx, 4, 0)), (short)(4), "0") ;
         edtTAM03_APP_ID_Internalname = "TAM03_APP_ID_"+sGXsfl_95_idx ;
         edtTAM05_KNGN_FLG_Internalname = "TAM05_KNGN_FLG_"+sGXsfl_95_idx ;
         edtTAM05_DEL_FLG_Internalname = "TAM05_DEL_FLG_"+sGXsfl_95_idx ;
         edtTAM05_CRT_DATETIME_Internalname = "TAM05_CRT_DATETIME_"+sGXsfl_95_idx ;
         edtTAM05_CRT_USER_ID_Internalname = "TAM05_CRT_USER_ID_"+sGXsfl_95_idx ;
         edtTAM05_CRT_PROG_NM_Internalname = "TAM05_CRT_PROG_NM_"+sGXsfl_95_idx ;
         edtTAM05_UPD_DATETIME_Internalname = "TAM05_UPD_DATETIME_"+sGXsfl_95_idx ;
         edtTAM05_UPD_USER_ID_Internalname = "TAM05_UPD_USER_ID_"+sGXsfl_95_idx ;
         edtTAM05_UPD_PROG_NM_Internalname = "TAM05_UPD_PROG_NM_"+sGXsfl_95_idx ;
         edtTAM05_UPD_CNT_Internalname = "TAM05_UPD_CNT_"+sGXsfl_95_idx ;
         httpContext.changePostValue( "Z88TAM03_APP_ID_"+sGXsfl_95_idx, httpContext.cgiGet( "ZT_"+"Z88TAM03_APP_ID_"+sGXsfl_95_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z88TAM03_APP_ID_"+sGXsfl_95_idx) ;
         httpContext.changePostValue( "Z103TAM05_CRT_DATETIME_"+sGXsfl_95_idx, httpContext.cgiGet( "ZT_"+"Z103TAM05_CRT_DATETIME_"+sGXsfl_95_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z103TAM05_CRT_DATETIME_"+sGXsfl_95_idx) ;
         httpContext.changePostValue( "Z104TAM05_CRT_USER_ID_"+sGXsfl_95_idx, httpContext.cgiGet( "ZT_"+"Z104TAM05_CRT_USER_ID_"+sGXsfl_95_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z104TAM05_CRT_USER_ID_"+sGXsfl_95_idx) ;
         httpContext.changePostValue( "Z106TAM05_UPD_DATETIME_"+sGXsfl_95_idx, httpContext.cgiGet( "ZT_"+"Z106TAM05_UPD_DATETIME_"+sGXsfl_95_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z106TAM05_UPD_DATETIME_"+sGXsfl_95_idx) ;
         httpContext.changePostValue( "Z107TAM05_UPD_USER_ID_"+sGXsfl_95_idx, httpContext.cgiGet( "ZT_"+"Z107TAM05_UPD_USER_ID_"+sGXsfl_95_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z107TAM05_UPD_USER_ID_"+sGXsfl_95_idx) ;
         httpContext.changePostValue( "Z109TAM05_UPD_CNT_"+sGXsfl_95_idx, httpContext.cgiGet( "ZT_"+"Z109TAM05_UPD_CNT_"+sGXsfl_95_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z109TAM05_UPD_CNT_"+sGXsfl_95_idx) ;
         httpContext.changePostValue( "Z101TAM05_KNGN_FLG_"+sGXsfl_95_idx, httpContext.cgiGet( "ZT_"+"Z101TAM05_KNGN_FLG_"+sGXsfl_95_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z101TAM05_KNGN_FLG_"+sGXsfl_95_idx) ;
         httpContext.changePostValue( "Z102TAM05_DEL_FLG_"+sGXsfl_95_idx, httpContext.cgiGet( "ZT_"+"Z102TAM05_DEL_FLG_"+sGXsfl_95_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z102TAM05_DEL_FLG_"+sGXsfl_95_idx) ;
         httpContext.changePostValue( "Z105TAM05_CRT_PROG_NM_"+sGXsfl_95_idx, httpContext.cgiGet( "ZT_"+"Z105TAM05_CRT_PROG_NM_"+sGXsfl_95_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z105TAM05_CRT_PROG_NM_"+sGXsfl_95_idx) ;
         httpContext.changePostValue( "Z108TAM05_UPD_PROG_NM_"+sGXsfl_95_idx, httpContext.cgiGet( "ZT_"+"Z108TAM05_UPD_PROG_NM_"+sGXsfl_95_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z108TAM05_UPD_PROG_NM_"+sGXsfl_95_idx) ;
      }
      httpContext.changePostValue( "O109TAM05_UPD_CNT", httpContext.cgiGet( "T109TAM05_UPD_CNT")) ;
      httpContext.deletePostValue( "T109TAM05_UPD_CNT") ;
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), "IE=EmulateIE7");
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeText( "権限パターンマスタ（ビジネスコンポーネント）") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" onsubmit=\"try{return gx.csv.validForm()}catch(e){return true;}\" name=\"MAINFORM\" method=\"post\" action=\""+formatLink("tam04bc_kngn") +"\" class=\""+"Form"+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
   }

   public void renderHtmlCloseForm0C3( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z17TAM04_AUTH_CD", GXutil.rtrim( Z17TAM04_AUTH_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z39TAM04_CRT_DATETIME", localUtil.ttoc( Z39TAM04_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z78TAM04_CRT_USER_ID", GXutil.rtrim( Z78TAM04_CRT_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z41TAM04_UPD_DATETIME", localUtil.ttoc( Z41TAM04_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z79TAM04_UPD_USER_ID", GXutil.rtrim( Z79TAM04_UPD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z99TAM04_UPD_CNT", GXutil.ltrim( localUtil.ntoc( Z99TAM04_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z98TAM04_AUTH_NM", GXutil.rtrim( Z98TAM04_AUTH_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z601TAM04_AUTH_LVL", GXutil.ltrim( localUtil.ntoc( Z601TAM04_AUTH_LVL, (byte)(2), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z18TAM04_DEL_FLG", GXutil.rtrim( Z18TAM04_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z40TAM04_CRT_PROG_NM", GXutil.rtrim( Z40TAM04_CRT_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z42TAM04_UPD_PROG_NM", GXutil.rtrim( Z42TAM04_UPD_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "O99TAM04_UPD_CNT", GXutil.ltrim( localUtil.ntoc( O99TAM04_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      GxWebStd.gx_hidden_field( httpContext, "nRC_Gridtam04bc_kngn_tam05_appli", GXutil.ltrim( localUtil.ntoc( nGXsfl_95_idx, (byte)(4), (byte)(0), ".", "")));
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

   public void initializeNonKey0C3( )
   {
      A39TAM04_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n39TAM04_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A39TAM04_CRT_DATETIME", localUtil.ttoc( A39TAM04_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n39TAM04_CRT_DATETIME = (GXutil.nullDate().equals(A39TAM04_CRT_DATETIME) ? true : false) ;
      A78TAM04_CRT_USER_ID = "" ;
      n78TAM04_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A78TAM04_CRT_USER_ID", A78TAM04_CRT_USER_ID);
      n78TAM04_CRT_USER_ID = ((GXutil.strcmp("", A78TAM04_CRT_USER_ID)==0) ? true : false) ;
      A41TAM04_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n41TAM04_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A41TAM04_UPD_DATETIME", localUtil.ttoc( A41TAM04_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n41TAM04_UPD_DATETIME = (GXutil.nullDate().equals(A41TAM04_UPD_DATETIME) ? true : false) ;
      A79TAM04_UPD_USER_ID = "" ;
      n79TAM04_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A79TAM04_UPD_USER_ID", A79TAM04_UPD_USER_ID);
      n79TAM04_UPD_USER_ID = ((GXutil.strcmp("", A79TAM04_UPD_USER_ID)==0) ? true : false) ;
      A99TAM04_UPD_CNT = 0 ;
      n99TAM04_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A99TAM04_UPD_CNT", GXutil.ltrim( GXutil.str( A99TAM04_UPD_CNT, 10, 0)));
      n99TAM04_UPD_CNT = ((0==A99TAM04_UPD_CNT) ? true : false) ;
      A98TAM04_AUTH_NM = "" ;
      n98TAM04_AUTH_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A98TAM04_AUTH_NM", A98TAM04_AUTH_NM);
      n98TAM04_AUTH_NM = ((GXutil.strcmp("", A98TAM04_AUTH_NM)==0) ? true : false) ;
      A601TAM04_AUTH_LVL = (byte)(0) ;
      n601TAM04_AUTH_LVL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A601TAM04_AUTH_LVL", GXutil.ltrim( GXutil.str( A601TAM04_AUTH_LVL, 2, 0)));
      n601TAM04_AUTH_LVL = ((0==A601TAM04_AUTH_LVL) ? true : false) ;
      A18TAM04_DEL_FLG = "" ;
      n18TAM04_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A18TAM04_DEL_FLG", A18TAM04_DEL_FLG);
      n18TAM04_DEL_FLG = ((GXutil.strcmp("", A18TAM04_DEL_FLG)==0) ? true : false) ;
      A40TAM04_CRT_PROG_NM = "" ;
      n40TAM04_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A40TAM04_CRT_PROG_NM", A40TAM04_CRT_PROG_NM);
      n40TAM04_CRT_PROG_NM = ((GXutil.strcmp("", A40TAM04_CRT_PROG_NM)==0) ? true : false) ;
      A42TAM04_UPD_PROG_NM = "" ;
      n42TAM04_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A42TAM04_UPD_PROG_NM", A42TAM04_UPD_PROG_NM);
      n42TAM04_UPD_PROG_NM = ((GXutil.strcmp("", A42TAM04_UPD_PROG_NM)==0) ? true : false) ;
      O99TAM04_UPD_CNT = A99TAM04_UPD_CNT ;
      n99TAM04_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A99TAM04_UPD_CNT", GXutil.ltrim( GXutil.str( A99TAM04_UPD_CNT, 10, 0)));
   }

   public void initAll0C3( )
   {
      A17TAM04_AUTH_CD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A17TAM04_AUTH_CD", A17TAM04_AUTH_CD);
      initializeNonKey0C3( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey0C9( )
   {
      A103TAM05_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n103TAM05_CRT_DATETIME = false ;
      A104TAM05_CRT_USER_ID = "" ;
      n104TAM05_CRT_USER_ID = false ;
      A106TAM05_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n106TAM05_UPD_DATETIME = false ;
      A107TAM05_UPD_USER_ID = "" ;
      n107TAM05_UPD_USER_ID = false ;
      A109TAM05_UPD_CNT = 0 ;
      n109TAM05_UPD_CNT = false ;
      A101TAM05_KNGN_FLG = "" ;
      n101TAM05_KNGN_FLG = false ;
      A102TAM05_DEL_FLG = "" ;
      n102TAM05_DEL_FLG = false ;
      A105TAM05_CRT_PROG_NM = "" ;
      n105TAM05_CRT_PROG_NM = false ;
      A108TAM05_UPD_PROG_NM = "" ;
      n108TAM05_UPD_PROG_NM = false ;
      O109TAM05_UPD_CNT = A109TAM05_UPD_CNT ;
      n109TAM05_UPD_CNT = false ;
   }

   public void initAll0C9( )
   {
      A88TAM03_APP_ID = "" ;
      initializeNonKey0C9( ) ;
   }

   public void standaloneModalInsert0C9( )
   {
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("calendar-system.css", "?225080");
      httpContext.AddThemeStyleSheetFile("", "Style2.css", "?14454892");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?1454941");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?58720");
      httpContext.AddJavascriptSource("tam04bc_kngn.js", "?1454943");
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
      GXt_char32 = A78TAM04_CRT_USER_ID ;
      GXv_char15[0] = GXt_char32 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char15) ;
      tam04bc_kngn_impl.this.GXt_char32 = GXv_char15[0] ;
      A78TAM04_CRT_USER_ID = GXt_char32 ;
      n78TAM04_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A78TAM04_CRT_USER_ID", A78TAM04_CRT_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A78TAM04_CRT_USER_ID))+"\"");
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
      GXt_char32 = A79TAM04_UPD_USER_ID ;
      GXv_char15[0] = GXt_char32 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char15) ;
      tam04bc_kngn_impl.this.GXt_char32 = GXv_char15[0] ;
      A79TAM04_UPD_USER_ID = GXt_char32 ;
      n79TAM04_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A79TAM04_UPD_USER_ID", A79TAM04_UPD_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A79TAM04_UPD_USER_ID))+"\"");
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
      GXt_char32 = A104TAM05_CRT_USER_ID ;
      GXv_char15[0] = GXt_char32 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char15) ;
      tam04bc_kngn_impl.this.GXt_char32 = GXv_char15[0] ;
      A104TAM05_CRT_USER_ID = GXt_char32 ;
      n104TAM05_CRT_USER_ID = false ;
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A104TAM05_CRT_USER_ID))+"\"");
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
      GXt_char32 = A107TAM05_UPD_USER_ID ;
      GXv_char15[0] = GXt_char32 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char15) ;
      tam04bc_kngn_impl.this.GXt_char32 = GXv_char15[0] ;
      A107TAM05_UPD_USER_ID = GXt_char32 ;
      n107TAM05_UPD_USER_ID = false ;
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A107TAM05_UPD_USER_ID))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void gxnrgridtam04bc_kngn_tam05_appli_newrow( short nRC_Gridtam04bc_kngn_tam05_appli ,
                                                        short nGXsfl_95_idx ,
                                                        String sGXsfl_95_idx )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      edtTAM03_APP_ID_Internalname = "TAM03_APP_ID_"+sGXsfl_95_idx ;
      edtTAM05_KNGN_FLG_Internalname = "TAM05_KNGN_FLG_"+sGXsfl_95_idx ;
      edtTAM05_DEL_FLG_Internalname = "TAM05_DEL_FLG_"+sGXsfl_95_idx ;
      edtTAM05_CRT_DATETIME_Internalname = "TAM05_CRT_DATETIME_"+sGXsfl_95_idx ;
      edtTAM05_CRT_USER_ID_Internalname = "TAM05_CRT_USER_ID_"+sGXsfl_95_idx ;
      edtTAM05_CRT_PROG_NM_Internalname = "TAM05_CRT_PROG_NM_"+sGXsfl_95_idx ;
      edtTAM05_UPD_DATETIME_Internalname = "TAM05_UPD_DATETIME_"+sGXsfl_95_idx ;
      edtTAM05_UPD_USER_ID_Internalname = "TAM05_UPD_USER_ID_"+sGXsfl_95_idx ;
      edtTAM05_UPD_PROG_NM_Internalname = "TAM05_UPD_PROG_NM_"+sGXsfl_95_idx ;
      edtTAM05_UPD_CNT_Internalname = "TAM05_UPD_CNT_"+sGXsfl_95_idx ;
      while ( nGXsfl_95_idx <= nRC_Gridtam04bc_kngn_tam05_appli )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal0C9( ) ;
         standaloneModal0C9( ) ;
         dynload_actions( ) ;
         sendRow0C9( ) ;
         nGXsfl_95_idx = (short)(nGXsfl_95_idx+1) ;
         sGXsfl_95_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_95_idx, 4, 0)), (short)(4), "0") ;
         edtTAM03_APP_ID_Internalname = "TAM03_APP_ID_"+sGXsfl_95_idx ;
         edtTAM05_KNGN_FLG_Internalname = "TAM05_KNGN_FLG_"+sGXsfl_95_idx ;
         edtTAM05_DEL_FLG_Internalname = "TAM05_DEL_FLG_"+sGXsfl_95_idx ;
         edtTAM05_CRT_DATETIME_Internalname = "TAM05_CRT_DATETIME_"+sGXsfl_95_idx ;
         edtTAM05_CRT_USER_ID_Internalname = "TAM05_CRT_USER_ID_"+sGXsfl_95_idx ;
         edtTAM05_CRT_PROG_NM_Internalname = "TAM05_CRT_PROG_NM_"+sGXsfl_95_idx ;
         edtTAM05_UPD_DATETIME_Internalname = "TAM05_UPD_DATETIME_"+sGXsfl_95_idx ;
         edtTAM05_UPD_USER_ID_Internalname = "TAM05_UPD_USER_ID_"+sGXsfl_95_idx ;
         edtTAM05_UPD_PROG_NM_Internalname = "TAM05_UPD_PROG_NM_"+sGXsfl_95_idx ;
         edtTAM05_UPD_CNT_Internalname = "TAM05_UPD_CNT_"+sGXsfl_95_idx ;
      }
      httpContext.GX_webresponse.addString(Gridtam04bc_kngn_tam05_appliContainer.ToJavascriptSource());
      /* End function gxnrGridtam04bc_kngn_tam05_appli_newrow */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
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
      A17TAM04_AUTH_CD = GX_Parm1 ;
      A39TAM04_CRT_DATETIME = GX_Parm2 ;
      n39TAM04_CRT_DATETIME = false ;
      A78TAM04_CRT_USER_ID = GX_Parm3 ;
      n78TAM04_CRT_USER_ID = false ;
      A41TAM04_UPD_DATETIME = GX_Parm4 ;
      n41TAM04_UPD_DATETIME = false ;
      A79TAM04_UPD_USER_ID = GX_Parm5 ;
      n79TAM04_UPD_USER_ID = false ;
      A99TAM04_UPD_CNT = GX_Parm6 ;
      n99TAM04_UPD_CNT = false ;
      A98TAM04_AUTH_NM = GX_Parm7 ;
      n98TAM04_AUTH_NM = false ;
      A601TAM04_AUTH_LVL = GX_Parm8 ;
      n601TAM04_AUTH_LVL = false ;
      A18TAM04_DEL_FLG = GX_Parm9 ;
      n18TAM04_DEL_FLG = false ;
      A40TAM04_CRT_PROG_NM = GX_Parm10 ;
      n40TAM04_CRT_PROG_NM = false ;
      A42TAM04_UPD_PROG_NM = GX_Parm11 ;
      n42TAM04_UPD_PROG_NM = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(localUtil.format(A39TAM04_CRT_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A78TAM04_CRT_USER_ID));
      isValidOutput.add(localUtil.format(A41TAM04_UPD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A79TAM04_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A99TAM04_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A98TAM04_AUTH_NM));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A601TAM04_AUTH_LVL, (byte)(2), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A18TAM04_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( A40TAM04_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( A42TAM04_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( AV12Pgmname));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.rtrim( Z17TAM04_AUTH_CD));
      isValidOutput.add(localUtil.ttoc( Z39TAM04_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z78TAM04_CRT_USER_ID));
      isValidOutput.add(localUtil.ttoc( Z41TAM04_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z79TAM04_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z99TAM04_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z98TAM04_AUTH_NM));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z601TAM04_AUTH_LVL, (byte)(2), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z18TAM04_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( Z40TAM04_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( Z42TAM04_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( ZV12Pgmname));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( O99TAM04_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(Gridtam04bc_kngn_tam05_appliContainer);
      isValidOutput.add(imgBtn_delete2_Enabled);
      isValidOutput.add(imgBtn_enter2_Enabled);
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Tam03_app_id( String GX_Parm1 )
   {
      A88TAM03_APP_ID = GX_Parm1 ;
      /* Using cursor T000C24 */
      pr_default.execute(22, new Object[] {A88TAM03_APP_ID});
      if ( (pr_default.getStatus(22) == 101) )
      {
         AnyError88 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'アプリケーションマスタ'", "ForeignKeyNotFound", 1, "TAM03_APP_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAM03_APP_ID_Internalname ;
      }
      if ( AnyError88 == 0 )
      {
      }
      pr_default.close(22);
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
      pr_default.close(22);
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
                  /* Execute user subroutine: S1165 */
                  S1165 ();
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
      A88TAM03_APP_ID = "" ;
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
      A17TAM04_AUTH_CD = "" ;
      lblTextblocktam04_auth_nm_Jsonclick = "" ;
      A98TAM04_AUTH_NM = "" ;
      lblTextblocktam04_auth_lvl_Jsonclick = "" ;
      lblTextblocktam04_del_flg_Jsonclick = "" ;
      A18TAM04_DEL_FLG = "" ;
      lblTextblocktam04_crt_datetime_Jsonclick = "" ;
      A39TAM04_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktam04_crt_user_id_Jsonclick = "" ;
      A78TAM04_CRT_USER_ID = "" ;
      lblTextblocktam04_crt_prog_nm_Jsonclick = "" ;
      A40TAM04_CRT_PROG_NM = "" ;
      lblTextblocktam04_upd_datetime_Jsonclick = "" ;
      A41TAM04_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktam04_upd_user_id_Jsonclick = "" ;
      A79TAM04_UPD_USER_ID = "" ;
      lblTextblocktam04_upd_prog_nm_Jsonclick = "" ;
      A42TAM04_UPD_PROG_NM = "" ;
      lblTextblocktam04_upd_cnt_Jsonclick = "" ;
      Gridtam04bc_kngn_tam05_appliContainer = new com.genexus.webpanels.GXWebGrid(context);
      Gridtam04bc_kngn_tam05_appliColumn = new com.genexus.webpanels.GXWebColumn();
      A101TAM05_KNGN_FLG = "" ;
      A102TAM05_DEL_FLG = "" ;
      A103TAM05_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A104TAM05_CRT_USER_ID = "" ;
      A105TAM05_CRT_PROG_NM = "" ;
      A106TAM05_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A107TAM05_UPD_USER_ID = "" ;
      A108TAM05_UPD_PROG_NM = "" ;
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
      Z17TAM04_AUTH_CD = "" ;
      Z39TAM04_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z78TAM04_CRT_USER_ID = "" ;
      Z41TAM04_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z79TAM04_UPD_USER_ID = "" ;
      Z98TAM04_AUTH_NM = "" ;
      Z18TAM04_DEL_FLG = "" ;
      Z40TAM04_CRT_PROG_NM = "" ;
      Z42TAM04_UPD_PROG_NM = "" ;
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
      Z88TAM03_APP_ID = "" ;
      Z103TAM05_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z104TAM05_CRT_USER_ID = "" ;
      Z106TAM05_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z107TAM05_UPD_USER_ID = "" ;
      Z101TAM05_KNGN_FLG = "" ;
      Z102TAM05_DEL_FLG = "" ;
      Z105TAM05_CRT_PROG_NM = "" ;
      Z108TAM05_UPD_PROG_NM = "" ;
      AV11W_BC_FLG = "" ;
      GXEncryptionTmp = "" ;
      AV10W_TXT = "" ;
      T000C7_A17TAM04_AUTH_CD = new String[] {""} ;
      T000C7_A39TAM04_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000C7_n39TAM04_CRT_DATETIME = new boolean[] {false} ;
      T000C7_A78TAM04_CRT_USER_ID = new String[] {""} ;
      T000C7_n78TAM04_CRT_USER_ID = new boolean[] {false} ;
      T000C7_A41TAM04_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000C7_n41TAM04_UPD_DATETIME = new boolean[] {false} ;
      T000C7_A79TAM04_UPD_USER_ID = new String[] {""} ;
      T000C7_n79TAM04_UPD_USER_ID = new boolean[] {false} ;
      T000C7_A99TAM04_UPD_CNT = new long[1] ;
      T000C7_n99TAM04_UPD_CNT = new boolean[] {false} ;
      T000C7_A98TAM04_AUTH_NM = new String[] {""} ;
      T000C7_n98TAM04_AUTH_NM = new boolean[] {false} ;
      T000C7_A601TAM04_AUTH_LVL = new byte[1] ;
      T000C7_n601TAM04_AUTH_LVL = new boolean[] {false} ;
      T000C7_A18TAM04_DEL_FLG = new String[] {""} ;
      T000C7_n18TAM04_DEL_FLG = new boolean[] {false} ;
      T000C7_A40TAM04_CRT_PROG_NM = new String[] {""} ;
      T000C7_n40TAM04_CRT_PROG_NM = new boolean[] {false} ;
      T000C7_A42TAM04_UPD_PROG_NM = new String[] {""} ;
      T000C7_n42TAM04_UPD_PROG_NM = new boolean[] {false} ;
      T000C8_A17TAM04_AUTH_CD = new String[] {""} ;
      T000C6_A17TAM04_AUTH_CD = new String[] {""} ;
      T000C6_A39TAM04_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000C6_n39TAM04_CRT_DATETIME = new boolean[] {false} ;
      T000C6_A78TAM04_CRT_USER_ID = new String[] {""} ;
      T000C6_n78TAM04_CRT_USER_ID = new boolean[] {false} ;
      T000C6_A41TAM04_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000C6_n41TAM04_UPD_DATETIME = new boolean[] {false} ;
      T000C6_A79TAM04_UPD_USER_ID = new String[] {""} ;
      T000C6_n79TAM04_UPD_USER_ID = new boolean[] {false} ;
      T000C6_A99TAM04_UPD_CNT = new long[1] ;
      T000C6_n99TAM04_UPD_CNT = new boolean[] {false} ;
      T000C6_A98TAM04_AUTH_NM = new String[] {""} ;
      T000C6_n98TAM04_AUTH_NM = new boolean[] {false} ;
      T000C6_A601TAM04_AUTH_LVL = new byte[1] ;
      T000C6_n601TAM04_AUTH_LVL = new boolean[] {false} ;
      T000C6_A18TAM04_DEL_FLG = new String[] {""} ;
      T000C6_n18TAM04_DEL_FLG = new boolean[] {false} ;
      T000C6_A40TAM04_CRT_PROG_NM = new String[] {""} ;
      T000C6_n40TAM04_CRT_PROG_NM = new boolean[] {false} ;
      T000C6_A42TAM04_UPD_PROG_NM = new String[] {""} ;
      T000C6_n42TAM04_UPD_PROG_NM = new boolean[] {false} ;
      sMode3 = "" ;
      T000C9_A17TAM04_AUTH_CD = new String[] {""} ;
      T000C10_A17TAM04_AUTH_CD = new String[] {""} ;
      T000C5_A17TAM04_AUTH_CD = new String[] {""} ;
      T000C5_A39TAM04_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000C5_n39TAM04_CRT_DATETIME = new boolean[] {false} ;
      T000C5_A78TAM04_CRT_USER_ID = new String[] {""} ;
      T000C5_n78TAM04_CRT_USER_ID = new boolean[] {false} ;
      T000C5_A41TAM04_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000C5_n41TAM04_UPD_DATETIME = new boolean[] {false} ;
      T000C5_A79TAM04_UPD_USER_ID = new String[] {""} ;
      T000C5_n79TAM04_UPD_USER_ID = new boolean[] {false} ;
      T000C5_A99TAM04_UPD_CNT = new long[1] ;
      T000C5_n99TAM04_UPD_CNT = new boolean[] {false} ;
      T000C5_A98TAM04_AUTH_NM = new String[] {""} ;
      T000C5_n98TAM04_AUTH_NM = new boolean[] {false} ;
      T000C5_A601TAM04_AUTH_LVL = new byte[1] ;
      T000C5_n601TAM04_AUTH_LVL = new boolean[] {false} ;
      T000C5_A18TAM04_DEL_FLG = new String[] {""} ;
      T000C5_n18TAM04_DEL_FLG = new boolean[] {false} ;
      T000C5_A40TAM04_CRT_PROG_NM = new String[] {""} ;
      T000C5_n40TAM04_CRT_PROG_NM = new boolean[] {false} ;
      T000C5_A42TAM04_UPD_PROG_NM = new String[] {""} ;
      T000C5_n42TAM04_UPD_PROG_NM = new boolean[] {false} ;
      T000C14_A530TBM07_AUTH_CD = new String[] {""} ;
      T000C15_A8TAM07_USER_ID = new String[] {""} ;
      T000C16_A17TAM04_AUTH_CD = new String[] {""} ;
      T000C17_A17TAM04_AUTH_CD = new String[] {""} ;
      T000C17_A103TAM05_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000C17_n103TAM05_CRT_DATETIME = new boolean[] {false} ;
      T000C17_A104TAM05_CRT_USER_ID = new String[] {""} ;
      T000C17_n104TAM05_CRT_USER_ID = new boolean[] {false} ;
      T000C17_A106TAM05_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000C17_n106TAM05_UPD_DATETIME = new boolean[] {false} ;
      T000C17_A107TAM05_UPD_USER_ID = new String[] {""} ;
      T000C17_n107TAM05_UPD_USER_ID = new boolean[] {false} ;
      T000C17_A109TAM05_UPD_CNT = new long[1] ;
      T000C17_n109TAM05_UPD_CNT = new boolean[] {false} ;
      T000C17_A101TAM05_KNGN_FLG = new String[] {""} ;
      T000C17_n101TAM05_KNGN_FLG = new boolean[] {false} ;
      T000C17_A102TAM05_DEL_FLG = new String[] {""} ;
      T000C17_n102TAM05_DEL_FLG = new boolean[] {false} ;
      T000C17_A105TAM05_CRT_PROG_NM = new String[] {""} ;
      T000C17_n105TAM05_CRT_PROG_NM = new boolean[] {false} ;
      T000C17_A108TAM05_UPD_PROG_NM = new String[] {""} ;
      T000C17_n108TAM05_UPD_PROG_NM = new boolean[] {false} ;
      T000C17_A88TAM03_APP_ID = new String[] {""} ;
      T000C4_A88TAM03_APP_ID = new String[] {""} ;
      T000C18_A88TAM03_APP_ID = new String[] {""} ;
      T000C19_A17TAM04_AUTH_CD = new String[] {""} ;
      T000C19_A88TAM03_APP_ID = new String[] {""} ;
      T000C3_A17TAM04_AUTH_CD = new String[] {""} ;
      T000C3_A103TAM05_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000C3_n103TAM05_CRT_DATETIME = new boolean[] {false} ;
      T000C3_A104TAM05_CRT_USER_ID = new String[] {""} ;
      T000C3_n104TAM05_CRT_USER_ID = new boolean[] {false} ;
      T000C3_A106TAM05_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000C3_n106TAM05_UPD_DATETIME = new boolean[] {false} ;
      T000C3_A107TAM05_UPD_USER_ID = new String[] {""} ;
      T000C3_n107TAM05_UPD_USER_ID = new boolean[] {false} ;
      T000C3_A109TAM05_UPD_CNT = new long[1] ;
      T000C3_n109TAM05_UPD_CNT = new boolean[] {false} ;
      T000C3_A101TAM05_KNGN_FLG = new String[] {""} ;
      T000C3_n101TAM05_KNGN_FLG = new boolean[] {false} ;
      T000C3_A102TAM05_DEL_FLG = new String[] {""} ;
      T000C3_n102TAM05_DEL_FLG = new boolean[] {false} ;
      T000C3_A105TAM05_CRT_PROG_NM = new String[] {""} ;
      T000C3_n105TAM05_CRT_PROG_NM = new boolean[] {false} ;
      T000C3_A108TAM05_UPD_PROG_NM = new String[] {""} ;
      T000C3_n108TAM05_UPD_PROG_NM = new boolean[] {false} ;
      T000C3_A88TAM03_APP_ID = new String[] {""} ;
      T000C2_A17TAM04_AUTH_CD = new String[] {""} ;
      T000C2_A103TAM05_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000C2_n103TAM05_CRT_DATETIME = new boolean[] {false} ;
      T000C2_A104TAM05_CRT_USER_ID = new String[] {""} ;
      T000C2_n104TAM05_CRT_USER_ID = new boolean[] {false} ;
      T000C2_A106TAM05_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000C2_n106TAM05_UPD_DATETIME = new boolean[] {false} ;
      T000C2_A107TAM05_UPD_USER_ID = new String[] {""} ;
      T000C2_n107TAM05_UPD_USER_ID = new boolean[] {false} ;
      T000C2_A109TAM05_UPD_CNT = new long[1] ;
      T000C2_n109TAM05_UPD_CNT = new boolean[] {false} ;
      T000C2_A101TAM05_KNGN_FLG = new String[] {""} ;
      T000C2_n101TAM05_KNGN_FLG = new boolean[] {false} ;
      T000C2_A102TAM05_DEL_FLG = new String[] {""} ;
      T000C2_n102TAM05_DEL_FLG = new boolean[] {false} ;
      T000C2_A105TAM05_CRT_PROG_NM = new String[] {""} ;
      T000C2_n105TAM05_CRT_PROG_NM = new boolean[] {false} ;
      T000C2_A108TAM05_UPD_PROG_NM = new String[] {""} ;
      T000C2_n108TAM05_UPD_PROG_NM = new boolean[] {false} ;
      T000C2_A88TAM03_APP_ID = new String[] {""} ;
      T000C23_A17TAM04_AUTH_CD = new String[] {""} ;
      T000C23_A88TAM03_APP_ID = new String[] {""} ;
      Gridtam04bc_kngn_tam05_appliRow = new com.genexus.webpanels.GXWebRow();
      subGridtam04bc_kngn_tam05_appli_Linesclass = "" ;
      ROClassString = "" ;
      GXCCtl = "" ;
      GXt_char14 = "" ;
      GXt_char13 = "" ;
      GXt_char12 = "" ;
      GXt_char11 = "" ;
      GXt_char10 = "" ;
      GXt_char9 = "" ;
      GXt_char8 = "" ;
      GXt_char7 = "" ;
      GXt_char6 = "" ;
      GXt_char5 = "" ;
      GXt_char4 = "" ;
      GXt_char3 = "" ;
      GXt_char2 = "" ;
      GXt_char1 = "" ;
      GXt_char16 = "" ;
      GXt_char17 = "" ;
      GXt_char18 = "" ;
      GXt_char19 = "" ;
      GXt_char20 = "" ;
      GXt_char21 = "" ;
      GXt_char22 = "" ;
      GXt_char23 = "" ;
      GXt_char24 = "" ;
      GXt_char25 = "" ;
      GXt_char26 = "" ;
      GXt_char27 = "" ;
      GXt_char28 = "" ;
      GXt_char29 = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      GXt_char31 = "" ;
      GXt_char30 = "" ;
      GXv_char15 = new String [1] ;
      GXt_char32 = "" ;
      ZV12Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      T000C24_A88TAM03_APP_ID = new String[] {""} ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tam04bc_kngn__default(),
         new Object[] {
             new Object[] {
            T000C2_A17TAM04_AUTH_CD, T000C2_A103TAM05_CRT_DATETIME, T000C2_n103TAM05_CRT_DATETIME, T000C2_A104TAM05_CRT_USER_ID, T000C2_n104TAM05_CRT_USER_ID, T000C2_A106TAM05_UPD_DATETIME, T000C2_n106TAM05_UPD_DATETIME, T000C2_A107TAM05_UPD_USER_ID, T000C2_n107TAM05_UPD_USER_ID, T000C2_A109TAM05_UPD_CNT,
            T000C2_n109TAM05_UPD_CNT, T000C2_A101TAM05_KNGN_FLG, T000C2_n101TAM05_KNGN_FLG, T000C2_A102TAM05_DEL_FLG, T000C2_n102TAM05_DEL_FLG, T000C2_A105TAM05_CRT_PROG_NM, T000C2_n105TAM05_CRT_PROG_NM, T000C2_A108TAM05_UPD_PROG_NM, T000C2_n108TAM05_UPD_PROG_NM, T000C2_A88TAM03_APP_ID
            }
            , new Object[] {
            T000C3_A17TAM04_AUTH_CD, T000C3_A103TAM05_CRT_DATETIME, T000C3_n103TAM05_CRT_DATETIME, T000C3_A104TAM05_CRT_USER_ID, T000C3_n104TAM05_CRT_USER_ID, T000C3_A106TAM05_UPD_DATETIME, T000C3_n106TAM05_UPD_DATETIME, T000C3_A107TAM05_UPD_USER_ID, T000C3_n107TAM05_UPD_USER_ID, T000C3_A109TAM05_UPD_CNT,
            T000C3_n109TAM05_UPD_CNT, T000C3_A101TAM05_KNGN_FLG, T000C3_n101TAM05_KNGN_FLG, T000C3_A102TAM05_DEL_FLG, T000C3_n102TAM05_DEL_FLG, T000C3_A105TAM05_CRT_PROG_NM, T000C3_n105TAM05_CRT_PROG_NM, T000C3_A108TAM05_UPD_PROG_NM, T000C3_n108TAM05_UPD_PROG_NM, T000C3_A88TAM03_APP_ID
            }
            , new Object[] {
            T000C4_A88TAM03_APP_ID
            }
            , new Object[] {
            T000C5_A17TAM04_AUTH_CD, T000C5_A39TAM04_CRT_DATETIME, T000C5_n39TAM04_CRT_DATETIME, T000C5_A78TAM04_CRT_USER_ID, T000C5_n78TAM04_CRT_USER_ID, T000C5_A41TAM04_UPD_DATETIME, T000C5_n41TAM04_UPD_DATETIME, T000C5_A79TAM04_UPD_USER_ID, T000C5_n79TAM04_UPD_USER_ID, T000C5_A99TAM04_UPD_CNT,
            T000C5_n99TAM04_UPD_CNT, T000C5_A98TAM04_AUTH_NM, T000C5_n98TAM04_AUTH_NM, T000C5_A601TAM04_AUTH_LVL, T000C5_n601TAM04_AUTH_LVL, T000C5_A18TAM04_DEL_FLG, T000C5_n18TAM04_DEL_FLG, T000C5_A40TAM04_CRT_PROG_NM, T000C5_n40TAM04_CRT_PROG_NM, T000C5_A42TAM04_UPD_PROG_NM,
            T000C5_n42TAM04_UPD_PROG_NM
            }
            , new Object[] {
            T000C6_A17TAM04_AUTH_CD, T000C6_A39TAM04_CRT_DATETIME, T000C6_n39TAM04_CRT_DATETIME, T000C6_A78TAM04_CRT_USER_ID, T000C6_n78TAM04_CRT_USER_ID, T000C6_A41TAM04_UPD_DATETIME, T000C6_n41TAM04_UPD_DATETIME, T000C6_A79TAM04_UPD_USER_ID, T000C6_n79TAM04_UPD_USER_ID, T000C6_A99TAM04_UPD_CNT,
            T000C6_n99TAM04_UPD_CNT, T000C6_A98TAM04_AUTH_NM, T000C6_n98TAM04_AUTH_NM, T000C6_A601TAM04_AUTH_LVL, T000C6_n601TAM04_AUTH_LVL, T000C6_A18TAM04_DEL_FLG, T000C6_n18TAM04_DEL_FLG, T000C6_A40TAM04_CRT_PROG_NM, T000C6_n40TAM04_CRT_PROG_NM, T000C6_A42TAM04_UPD_PROG_NM,
            T000C6_n42TAM04_UPD_PROG_NM
            }
            , new Object[] {
            T000C7_A17TAM04_AUTH_CD, T000C7_A39TAM04_CRT_DATETIME, T000C7_n39TAM04_CRT_DATETIME, T000C7_A78TAM04_CRT_USER_ID, T000C7_n78TAM04_CRT_USER_ID, T000C7_A41TAM04_UPD_DATETIME, T000C7_n41TAM04_UPD_DATETIME, T000C7_A79TAM04_UPD_USER_ID, T000C7_n79TAM04_UPD_USER_ID, T000C7_A99TAM04_UPD_CNT,
            T000C7_n99TAM04_UPD_CNT, T000C7_A98TAM04_AUTH_NM, T000C7_n98TAM04_AUTH_NM, T000C7_A601TAM04_AUTH_LVL, T000C7_n601TAM04_AUTH_LVL, T000C7_A18TAM04_DEL_FLG, T000C7_n18TAM04_DEL_FLG, T000C7_A40TAM04_CRT_PROG_NM, T000C7_n40TAM04_CRT_PROG_NM, T000C7_A42TAM04_UPD_PROG_NM,
            T000C7_n42TAM04_UPD_PROG_NM
            }
            , new Object[] {
            T000C8_A17TAM04_AUTH_CD
            }
            , new Object[] {
            T000C9_A17TAM04_AUTH_CD
            }
            , new Object[] {
            T000C10_A17TAM04_AUTH_CD
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000C14_A530TBM07_AUTH_CD
            }
            , new Object[] {
            T000C15_A8TAM07_USER_ID
            }
            , new Object[] {
            T000C16_A17TAM04_AUTH_CD
            }
            , new Object[] {
            T000C17_A17TAM04_AUTH_CD, T000C17_A103TAM05_CRT_DATETIME, T000C17_n103TAM05_CRT_DATETIME, T000C17_A104TAM05_CRT_USER_ID, T000C17_n104TAM05_CRT_USER_ID, T000C17_A106TAM05_UPD_DATETIME, T000C17_n106TAM05_UPD_DATETIME, T000C17_A107TAM05_UPD_USER_ID, T000C17_n107TAM05_UPD_USER_ID, T000C17_A109TAM05_UPD_CNT,
            T000C17_n109TAM05_UPD_CNT, T000C17_A101TAM05_KNGN_FLG, T000C17_n101TAM05_KNGN_FLG, T000C17_A102TAM05_DEL_FLG, T000C17_n102TAM05_DEL_FLG, T000C17_A105TAM05_CRT_PROG_NM, T000C17_n105TAM05_CRT_PROG_NM, T000C17_A108TAM05_UPD_PROG_NM, T000C17_n108TAM05_UPD_PROG_NM, T000C17_A88TAM03_APP_ID
            }
            , new Object[] {
            T000C18_A88TAM03_APP_ID
            }
            , new Object[] {
            T000C19_A17TAM04_AUTH_CD, T000C19_A88TAM03_APP_ID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000C23_A17TAM04_AUTH_CD, T000C23_A88TAM03_APP_ID
            }
            , new Object[] {
            T000C24_A88TAM03_APP_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV12Pgmname = "TAM04BC_KNGN" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A601TAM04_AUTH_LVL ;
   private byte subGridtam04bc_kngn_tam05_appli_Backcolorstyle ;
   private byte subGridtam04bc_kngn_tam05_appli_Allowcollapsing ;
   private byte subGridtam04bc_kngn_tam05_appli_Collapsed ;
   private byte Z601TAM04_AUTH_LVL ;
   private byte Gx_BScreen ;
   private byte subGridtam04bc_kngn_tam05_appli_Backstyle ;
   private byte wbTemp ;
   private short nRC_Gridtam04bc_kngn_tam05_appli ;
   private short nGXsfl_95_idx=1 ;
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
   private int GRIDTAM04BC_KNGN_TAM05_APPLI_nFirstRecordOnPage ;
   private int GX_JID ;
   private int AnyError88 ;
   private int subGridtam04bc_kngn_tam05_appli_Backcolor ;
   private int subGridtam04bc_kngn_tam05_appli_Allbackcolor ;
   private int defedtTAM03_APP_ID_Enabled ;
   private int idxLst ;
   private int GXActiveErrHndl ;
   private long A99TAM04_UPD_CNT ;
   private long A109TAM05_UPD_CNT ;
   private long B99TAM04_UPD_CNT ;
   private long Z99TAM04_UPD_CNT ;
   private long O99TAM04_UPD_CNT ;
   private long Z109TAM05_UPD_CNT ;
   private long T109TAM05_UPD_CNT ;
   private long O109TAM05_UPD_CNT ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String sGXsfl_95_idx="0001" ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTAM04_AUTH_CD_Internalname ;
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
   private String GXt_char14 ;
   private String GXt_char13 ;
   private String GXt_char12 ;
   private String GXt_char11 ;
   private String GXt_char10 ;
   private String GXt_char9 ;
   private String GXt_char8 ;
   private String GXt_char7 ;
   private String GXt_char6 ;
   private String GXt_char5 ;
   private String GXt_char4 ;
   private String GXt_char3 ;
   private String GXt_char2 ;
   private String GXt_char1 ;
   private String GXt_char16 ;
   private String GXt_char17 ;
   private String GXt_char18 ;
   private String GXt_char19 ;
   private String GXt_char20 ;
   private String GXt_char21 ;
   private String GXt_char22 ;
   private String GXt_char23 ;
   private String GXt_char24 ;
   private String GXt_char25 ;
   private String GXt_char26 ;
   private String GXt_char27 ;
   private String GXt_char28 ;
   private String GXt_char29 ;
   private String sDynURL ;
   private String FormProcess ;
   private String GXt_char31 ;
   private String GXt_char30 ;
   private String subGridtam04bc_kngn_tam05_appli_Internalname ;
   private String GXv_char15[] ;
   private String GXt_char32 ;
   private String ZV12Pgmname ;
   private String Gx_emsg ;
   private java.util.Date A39TAM04_CRT_DATETIME ;
   private java.util.Date A41TAM04_UPD_DATETIME ;
   private java.util.Date A103TAM05_CRT_DATETIME ;
   private java.util.Date A106TAM05_UPD_DATETIME ;
   private java.util.Date Z39TAM04_CRT_DATETIME ;
   private java.util.Date Z41TAM04_UPD_DATETIME ;
   private java.util.Date Z103TAM05_CRT_DATETIME ;
   private java.util.Date Z106TAM05_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean wbErr ;
   private boolean n99TAM04_UPD_CNT ;
   private boolean n98TAM04_AUTH_NM ;
   private boolean n601TAM04_AUTH_LVL ;
   private boolean n18TAM04_DEL_FLG ;
   private boolean n39TAM04_CRT_DATETIME ;
   private boolean n78TAM04_CRT_USER_ID ;
   private boolean n40TAM04_CRT_PROG_NM ;
   private boolean n41TAM04_UPD_DATETIME ;
   private boolean n79TAM04_UPD_USER_ID ;
   private boolean n42TAM04_UPD_PROG_NM ;
   private boolean Gx_longc ;
   private boolean n103TAM05_CRT_DATETIME ;
   private boolean n104TAM05_CRT_USER_ID ;
   private boolean n106TAM05_UPD_DATETIME ;
   private boolean n107TAM05_UPD_USER_ID ;
   private boolean n109TAM05_UPD_CNT ;
   private boolean n101TAM05_KNGN_FLG ;
   private boolean n102TAM05_DEL_FLG ;
   private boolean n105TAM05_CRT_PROG_NM ;
   private boolean n108TAM05_UPD_PROG_NM ;
   private String A88TAM03_APP_ID ;
   private String A17TAM04_AUTH_CD ;
   private String A98TAM04_AUTH_NM ;
   private String A18TAM04_DEL_FLG ;
   private String A78TAM04_CRT_USER_ID ;
   private String A40TAM04_CRT_PROG_NM ;
   private String A79TAM04_UPD_USER_ID ;
   private String A42TAM04_UPD_PROG_NM ;
   private String A101TAM05_KNGN_FLG ;
   private String A102TAM05_DEL_FLG ;
   private String A104TAM05_CRT_USER_ID ;
   private String A105TAM05_CRT_PROG_NM ;
   private String A107TAM05_UPD_USER_ID ;
   private String A108TAM05_UPD_PROG_NM ;
   private String Z17TAM04_AUTH_CD ;
   private String Z78TAM04_CRT_USER_ID ;
   private String Z79TAM04_UPD_USER_ID ;
   private String Z98TAM04_AUTH_NM ;
   private String Z18TAM04_DEL_FLG ;
   private String Z40TAM04_CRT_PROG_NM ;
   private String Z42TAM04_UPD_PROG_NM ;
   private String Z88TAM03_APP_ID ;
   private String Z104TAM05_CRT_USER_ID ;
   private String Z107TAM05_UPD_USER_ID ;
   private String Z101TAM05_KNGN_FLG ;
   private String Z102TAM05_DEL_FLG ;
   private String Z105TAM05_CRT_PROG_NM ;
   private String Z108TAM05_UPD_PROG_NM ;
   private String AV11W_BC_FLG ;
   private String AV10W_TXT ;
   private com.genexus.webpanels.GXWebGrid Gridtam04bc_kngn_tam05_appliContainer ;
   private com.genexus.webpanels.GXWebRow Gridtam04bc_kngn_tam05_appliRow ;
   private com.genexus.webpanels.GXWebColumn Gridtam04bc_kngn_tam05_appliColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private String[] T000C7_A17TAM04_AUTH_CD ;
   private java.util.Date[] T000C7_A39TAM04_CRT_DATETIME ;
   private boolean[] T000C7_n39TAM04_CRT_DATETIME ;
   private String[] T000C7_A78TAM04_CRT_USER_ID ;
   private boolean[] T000C7_n78TAM04_CRT_USER_ID ;
   private java.util.Date[] T000C7_A41TAM04_UPD_DATETIME ;
   private boolean[] T000C7_n41TAM04_UPD_DATETIME ;
   private String[] T000C7_A79TAM04_UPD_USER_ID ;
   private boolean[] T000C7_n79TAM04_UPD_USER_ID ;
   private long[] T000C7_A99TAM04_UPD_CNT ;
   private boolean[] T000C7_n99TAM04_UPD_CNT ;
   private String[] T000C7_A98TAM04_AUTH_NM ;
   private boolean[] T000C7_n98TAM04_AUTH_NM ;
   private byte[] T000C7_A601TAM04_AUTH_LVL ;
   private boolean[] T000C7_n601TAM04_AUTH_LVL ;
   private String[] T000C7_A18TAM04_DEL_FLG ;
   private boolean[] T000C7_n18TAM04_DEL_FLG ;
   private String[] T000C7_A40TAM04_CRT_PROG_NM ;
   private boolean[] T000C7_n40TAM04_CRT_PROG_NM ;
   private String[] T000C7_A42TAM04_UPD_PROG_NM ;
   private boolean[] T000C7_n42TAM04_UPD_PROG_NM ;
   private String[] T000C8_A17TAM04_AUTH_CD ;
   private String[] T000C6_A17TAM04_AUTH_CD ;
   private java.util.Date[] T000C6_A39TAM04_CRT_DATETIME ;
   private boolean[] T000C6_n39TAM04_CRT_DATETIME ;
   private String[] T000C6_A78TAM04_CRT_USER_ID ;
   private boolean[] T000C6_n78TAM04_CRT_USER_ID ;
   private java.util.Date[] T000C6_A41TAM04_UPD_DATETIME ;
   private boolean[] T000C6_n41TAM04_UPD_DATETIME ;
   private String[] T000C6_A79TAM04_UPD_USER_ID ;
   private boolean[] T000C6_n79TAM04_UPD_USER_ID ;
   private long[] T000C6_A99TAM04_UPD_CNT ;
   private boolean[] T000C6_n99TAM04_UPD_CNT ;
   private String[] T000C6_A98TAM04_AUTH_NM ;
   private boolean[] T000C6_n98TAM04_AUTH_NM ;
   private byte[] T000C6_A601TAM04_AUTH_LVL ;
   private boolean[] T000C6_n601TAM04_AUTH_LVL ;
   private String[] T000C6_A18TAM04_DEL_FLG ;
   private boolean[] T000C6_n18TAM04_DEL_FLG ;
   private String[] T000C6_A40TAM04_CRT_PROG_NM ;
   private boolean[] T000C6_n40TAM04_CRT_PROG_NM ;
   private String[] T000C6_A42TAM04_UPD_PROG_NM ;
   private boolean[] T000C6_n42TAM04_UPD_PROG_NM ;
   private String[] T000C9_A17TAM04_AUTH_CD ;
   private String[] T000C10_A17TAM04_AUTH_CD ;
   private String[] T000C5_A17TAM04_AUTH_CD ;
   private java.util.Date[] T000C5_A39TAM04_CRT_DATETIME ;
   private boolean[] T000C5_n39TAM04_CRT_DATETIME ;
   private String[] T000C5_A78TAM04_CRT_USER_ID ;
   private boolean[] T000C5_n78TAM04_CRT_USER_ID ;
   private java.util.Date[] T000C5_A41TAM04_UPD_DATETIME ;
   private boolean[] T000C5_n41TAM04_UPD_DATETIME ;
   private String[] T000C5_A79TAM04_UPD_USER_ID ;
   private boolean[] T000C5_n79TAM04_UPD_USER_ID ;
   private long[] T000C5_A99TAM04_UPD_CNT ;
   private boolean[] T000C5_n99TAM04_UPD_CNT ;
   private String[] T000C5_A98TAM04_AUTH_NM ;
   private boolean[] T000C5_n98TAM04_AUTH_NM ;
   private byte[] T000C5_A601TAM04_AUTH_LVL ;
   private boolean[] T000C5_n601TAM04_AUTH_LVL ;
   private String[] T000C5_A18TAM04_DEL_FLG ;
   private boolean[] T000C5_n18TAM04_DEL_FLG ;
   private String[] T000C5_A40TAM04_CRT_PROG_NM ;
   private boolean[] T000C5_n40TAM04_CRT_PROG_NM ;
   private String[] T000C5_A42TAM04_UPD_PROG_NM ;
   private boolean[] T000C5_n42TAM04_UPD_PROG_NM ;
   private String[] T000C14_A530TBM07_AUTH_CD ;
   private String[] T000C15_A8TAM07_USER_ID ;
   private String[] T000C16_A17TAM04_AUTH_CD ;
   private String[] T000C17_A17TAM04_AUTH_CD ;
   private java.util.Date[] T000C17_A103TAM05_CRT_DATETIME ;
   private boolean[] T000C17_n103TAM05_CRT_DATETIME ;
   private String[] T000C17_A104TAM05_CRT_USER_ID ;
   private boolean[] T000C17_n104TAM05_CRT_USER_ID ;
   private java.util.Date[] T000C17_A106TAM05_UPD_DATETIME ;
   private boolean[] T000C17_n106TAM05_UPD_DATETIME ;
   private String[] T000C17_A107TAM05_UPD_USER_ID ;
   private boolean[] T000C17_n107TAM05_UPD_USER_ID ;
   private long[] T000C17_A109TAM05_UPD_CNT ;
   private boolean[] T000C17_n109TAM05_UPD_CNT ;
   private String[] T000C17_A101TAM05_KNGN_FLG ;
   private boolean[] T000C17_n101TAM05_KNGN_FLG ;
   private String[] T000C17_A102TAM05_DEL_FLG ;
   private boolean[] T000C17_n102TAM05_DEL_FLG ;
   private String[] T000C17_A105TAM05_CRT_PROG_NM ;
   private boolean[] T000C17_n105TAM05_CRT_PROG_NM ;
   private String[] T000C17_A108TAM05_UPD_PROG_NM ;
   private boolean[] T000C17_n108TAM05_UPD_PROG_NM ;
   private String[] T000C17_A88TAM03_APP_ID ;
   private String[] T000C4_A88TAM03_APP_ID ;
   private String[] T000C18_A88TAM03_APP_ID ;
   private String[] T000C19_A17TAM04_AUTH_CD ;
   private String[] T000C19_A88TAM03_APP_ID ;
   private String[] T000C3_A17TAM04_AUTH_CD ;
   private java.util.Date[] T000C3_A103TAM05_CRT_DATETIME ;
   private boolean[] T000C3_n103TAM05_CRT_DATETIME ;
   private String[] T000C3_A104TAM05_CRT_USER_ID ;
   private boolean[] T000C3_n104TAM05_CRT_USER_ID ;
   private java.util.Date[] T000C3_A106TAM05_UPD_DATETIME ;
   private boolean[] T000C3_n106TAM05_UPD_DATETIME ;
   private String[] T000C3_A107TAM05_UPD_USER_ID ;
   private boolean[] T000C3_n107TAM05_UPD_USER_ID ;
   private long[] T000C3_A109TAM05_UPD_CNT ;
   private boolean[] T000C3_n109TAM05_UPD_CNT ;
   private String[] T000C3_A101TAM05_KNGN_FLG ;
   private boolean[] T000C3_n101TAM05_KNGN_FLG ;
   private String[] T000C3_A102TAM05_DEL_FLG ;
   private boolean[] T000C3_n102TAM05_DEL_FLG ;
   private String[] T000C3_A105TAM05_CRT_PROG_NM ;
   private boolean[] T000C3_n105TAM05_CRT_PROG_NM ;
   private String[] T000C3_A108TAM05_UPD_PROG_NM ;
   private boolean[] T000C3_n108TAM05_UPD_PROG_NM ;
   private String[] T000C3_A88TAM03_APP_ID ;
   private String[] T000C2_A17TAM04_AUTH_CD ;
   private java.util.Date[] T000C2_A103TAM05_CRT_DATETIME ;
   private boolean[] T000C2_n103TAM05_CRT_DATETIME ;
   private String[] T000C2_A104TAM05_CRT_USER_ID ;
   private boolean[] T000C2_n104TAM05_CRT_USER_ID ;
   private java.util.Date[] T000C2_A106TAM05_UPD_DATETIME ;
   private boolean[] T000C2_n106TAM05_UPD_DATETIME ;
   private String[] T000C2_A107TAM05_UPD_USER_ID ;
   private boolean[] T000C2_n107TAM05_UPD_USER_ID ;
   private long[] T000C2_A109TAM05_UPD_CNT ;
   private boolean[] T000C2_n109TAM05_UPD_CNT ;
   private String[] T000C2_A101TAM05_KNGN_FLG ;
   private boolean[] T000C2_n101TAM05_KNGN_FLG ;
   private String[] T000C2_A102TAM05_DEL_FLG ;
   private boolean[] T000C2_n102TAM05_DEL_FLG ;
   private String[] T000C2_A105TAM05_CRT_PROG_NM ;
   private boolean[] T000C2_n105TAM05_CRT_PROG_NM ;
   private String[] T000C2_A108TAM05_UPD_PROG_NM ;
   private boolean[] T000C2_n108TAM05_UPD_PROG_NM ;
   private String[] T000C2_A88TAM03_APP_ID ;
   private String[] T000C23_A17TAM04_AUTH_CD ;
   private String[] T000C23_A88TAM03_APP_ID ;
   private String[] T000C24_A88TAM03_APP_ID ;
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
         ,new ForEachCursor("T000C7", "SELECT TM1.`TAM04_AUTH_CD`, TM1.`TAM04_CRT_DATETIME`, TM1.`TAM04_CRT_USER_ID`, TM1.`TAM04_UPD_DATETIME`, TM1.`TAM04_UPD_USER_ID`, TM1.`TAM04_UPD_CNT`, TM1.`TAM04_AUTH_NM`, TM1.`TAM04_AUTH_LVL`, TM1.`TAM04_DEL_FLG`, TM1.`TAM04_CRT_PROG_NM`, TM1.`TAM04_UPD_PROG_NM` FROM `TAM04_KNGN` TM1 WHERE TM1.`TAM04_AUTH_CD` = ? ORDER BY TM1.`TAM04_AUTH_CD` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("T000C8", "SELECT `TAM04_AUTH_CD` FROM `TAM04_KNGN` WHERE `TAM04_AUTH_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000C9", "SELECT `TAM04_AUTH_CD` FROM `TAM04_KNGN` WHERE ( `TAM04_AUTH_CD` > ?) ORDER BY `TAM04_AUTH_CD`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000C10", "SELECT `TAM04_AUTH_CD` FROM `TAM04_KNGN` WHERE ( `TAM04_AUTH_CD` < ?) ORDER BY `TAM04_AUTH_CD` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000C11", "INSERT INTO `TAM04_KNGN` (`TAM04_AUTH_CD`, `TAM04_CRT_DATETIME`, `TAM04_CRT_USER_ID`, `TAM04_UPD_DATETIME`, `TAM04_UPD_USER_ID`, `TAM04_UPD_CNT`, `TAM04_AUTH_NM`, `TAM04_AUTH_LVL`, `TAM04_DEL_FLG`, `TAM04_CRT_PROG_NM`, `TAM04_UPD_PROG_NM`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T000C12", "UPDATE `TAM04_KNGN` SET `TAM04_CRT_DATETIME`=?, `TAM04_CRT_USER_ID`=?, `TAM04_UPD_DATETIME`=?, `TAM04_UPD_USER_ID`=?, `TAM04_UPD_CNT`=?, `TAM04_AUTH_NM`=?, `TAM04_AUTH_LVL`=?, `TAM04_DEL_FLG`=?, `TAM04_CRT_PROG_NM`=?, `TAM04_UPD_PROG_NM`=?  WHERE `TAM04_AUTH_CD` = ?", GX_NOMASK)
         ,new UpdateCursor("T000C13", "DELETE FROM `TAM04_KNGN`  WHERE `TAM04_AUTH_CD` = ?", GX_NOMASK)
         ,new ForEachCursor("T000C14", "SELECT `TBM07_AUTH_CD` FROM `TBM07_AUTH_BEHAVIOR` WHERE `TBM07_AUTH_CD` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000C15", "SELECT `TAM07_USER_ID` FROM `TAM07_USER` WHERE `TAM07_AUTH_CD` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000C16", "SELECT `TAM04_AUTH_CD` FROM `TAM04_KNGN` ORDER BY `TAM04_AUTH_CD` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("T000C17", "SELECT `TAM04_AUTH_CD`, `TAM05_CRT_DATETIME`, `TAM05_CRT_USER_ID`, `TAM05_UPD_DATETIME`, `TAM05_UPD_USER_ID`, `TAM05_UPD_CNT`, `TAM05_KNGN_FLG`, `TAM05_DEL_FLG`, `TAM05_CRT_PROG_NM`, `TAM05_UPD_PROG_NM`, `TAM03_APP_ID` FROM `TAM05_APPLI_KNGN` WHERE `TAM04_AUTH_CD` = ? and `TAM03_APP_ID` = ? ORDER BY `TAM04_AUTH_CD`, `TAM03_APP_ID` ",true, GX_NOMASK, false, this,11,0,false )
         ,new ForEachCursor("T000C18", "SELECT `TAM03_APP_ID` FROM `TAM03_APPLI` WHERE `TAM03_APP_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000C19", "SELECT `TAM04_AUTH_CD`, `TAM03_APP_ID` FROM `TAM05_APPLI_KNGN` WHERE `TAM04_AUTH_CD` = ? AND `TAM03_APP_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("T000C20", "INSERT INTO `TAM05_APPLI_KNGN` (`TAM04_AUTH_CD`, `TAM05_CRT_DATETIME`, `TAM05_CRT_USER_ID`, `TAM05_UPD_DATETIME`, `TAM05_UPD_USER_ID`, `TAM05_UPD_CNT`, `TAM05_KNGN_FLG`, `TAM05_DEL_FLG`, `TAM05_CRT_PROG_NM`, `TAM05_UPD_PROG_NM`, `TAM03_APP_ID`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T000C21", "UPDATE `TAM05_APPLI_KNGN` SET `TAM05_CRT_DATETIME`=?, `TAM05_CRT_USER_ID`=?, `TAM05_UPD_DATETIME`=?, `TAM05_UPD_USER_ID`=?, `TAM05_UPD_CNT`=?, `TAM05_KNGN_FLG`=?, `TAM05_DEL_FLG`=?, `TAM05_CRT_PROG_NM`=?, `TAM05_UPD_PROG_NM`=?  WHERE `TAM04_AUTH_CD` = ? AND `TAM03_APP_ID` = ?", GX_NOMASK)
         ,new UpdateCursor("T000C22", "DELETE FROM `TAM05_APPLI_KNGN`  WHERE `TAM04_AUTH_CD` = ? AND `TAM03_APP_ID` = ?", GX_NOMASK)
         ,new ForEachCursor("T000C23", "SELECT `TAM04_AUTH_CD`, `TAM03_APP_ID` FROM `TAM05_APPLI_KNGN` WHERE `TAM04_AUTH_CD` = ? ORDER BY `TAM04_AUTH_CD`, `TAM03_APP_ID` ",true, GX_NOMASK, false, this,11,0,false )
         ,new ForEachCursor("T000C24", "SELECT `TAM03_APP_ID` FROM `TAM03_APPLI` WHERE `TAM03_APP_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
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
               ((byte[]) buf[13])[0] = rslt.getByte(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               break;
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
               break;
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
               break;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               break;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               break;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               break;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               break;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               break;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               break;
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
               break;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               break;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               break;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               break;
            case 22 :
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
               stmt.setVarchar(2, (String)parms[1], 7, false);
               break;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               break;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 7, false);
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
               break;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               break;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               break;
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
               break;
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
               break;
            case 11 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               break;
            case 12 :
               stmt.setVarchar(1, (String)parms[0], 2);
               break;
            case 13 :
               stmt.setVarchar(1, (String)parms[0], 2);
               break;
            case 15 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               break;
            case 16 :
               stmt.setVarchar(1, (String)parms[0], 7, false);
               break;
            case 17 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               break;
            case 18 :
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
               break;
            case 19 :
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
               break;
            case 20 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               break;
            case 21 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               break;
            case 22 :
               stmt.setVarchar(1, (String)parms[0], 7, false);
               break;
      }
   }

}

