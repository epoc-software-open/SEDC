/*
               File: tbm07_auth_behavior_impl
        Description: �����ʐU���}�X�^
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:21:25.68
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbm07_auth_behavior_impl extends GXWebPanel
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"TBM07_CRT_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx4asatbm07_crt_user_id1439( Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel6"+"_"+"TBM07_UPD_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx6asatbm07_upd_user_id1439( Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_9") == 0 )
      {
         A50TBM07_AUTH_CD = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A50TBM07_AUTH_CD", A50TBM07_AUTH_CD);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_9( A50TBM07_AUTH_CD) ;
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
         Form.getMeta().addItem("description", "�����ʐU���}�X�^", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTBM07_AUTH_CD_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Style2");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tbm07_auth_behavior_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbm07_auth_behavior_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbm07_auth_behavior_impl.class ));
   }

   public tbm07_auth_behavior_impl( int remoteHandle ,
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
         wb_table1_2_1439( true) ;
      }
      return  ;
   }

   public void wb_table1_2_1439e( boolean wbgen )
   {
      if ( wbgen )
      {
         renderHtmlCloseForm1439( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void wb_table1_2_1439( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableBorder100x100", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_1439( true) ;
      }
      return  ;
   }

   public void wb_table2_5_1439e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Control Group */
         GxWebStd.gx_group_start( httpContext, grpGroupdata_Internalname, "�����ʐU���}�X�^", 1, 0, "px", 0, "px", "Group", "", "HLP_TBM07_AUTH_BEHAVIOR.htm");
         wb_table3_28_1439( true) ;
      }
      return  ;
   }

   public void wb_table3_28_1439e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_1439e( true) ;
      }
      else
      {
         wb_table1_2_1439e( false) ;
      }
   }

   public void wb_table3_28_1439( boolean wbgen )
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
         wb_table4_34_1439( true) ;
      }
      return  ;
   }

   public void wb_table4_34_1439e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "���s", bttBtn_enter_Jsonclick, 5, "���s", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBM07_AUTH_BEHAVIOR.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "�I��", bttBtn_cancel_Jsonclick, 1, "�I��", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBM07_AUTH_BEHAVIOR.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "�폜", bttBtn_delete_Jsonclick, 5, "�폜", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBM07_AUTH_BEHAVIOR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_28_1439e( true) ;
      }
      else
      {
         wb_table3_28_1439e( false) ;
      }
   }

   public void wb_table4_34_1439( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm07_auth_cd_Internalname, "�����R�[�h", "", "", lblTextblocktbm07_auth_cd_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM07_AUTH_BEHAVIOR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM07_AUTH_CD_Internalname, GXutil.rtrim( A50TBM07_AUTH_CD), GXutil.rtrim( localUtil.format( A50TBM07_AUTH_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM07_AUTH_CD_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM07_AUTH_CD_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_AUTH_CD", "left", "HLP_TBM07_AUTH_BEHAVIOR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm07_crf_inp_auth_flg_Internalname, "�b�q�e���͌����t���O", "", "", lblTextblocktbm07_crf_inp_auth_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM07_AUTH_BEHAVIOR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM07_CRF_INP_AUTH_FLG_Internalname, GXutil.rtrim( A623TBM07_CRF_INP_AUTH_FLG), GXutil.rtrim( localUtil.format( A623TBM07_CRF_INP_AUTH_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM07_CRF_INP_AUTH_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM07_CRF_INP_AUTH_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TBM07_AUTH_BEHAVIOR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm07_crf_edit_auth_flg_Internalname, "�b�q�e�C�������t���O", "", "", lblTextblocktbm07_crf_edit_auth_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM07_AUTH_BEHAVIOR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM07_CRF_EDIT_AUTH_FLG_Internalname, GXutil.rtrim( A624TBM07_CRF_EDIT_AUTH_FLG), GXutil.rtrim( localUtil.format( A624TBM07_CRF_EDIT_AUTH_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM07_CRF_EDIT_AUTH_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM07_CRF_EDIT_AUTH_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TBM07_AUTH_BEHAVIOR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm07_other_site_view_flg_Internalname, "���{�ݎQ�ƃt���O", "", "", lblTextblocktbm07_other_site_view_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM07_AUTH_BEHAVIOR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM07_OTHER_SITE_VIEW_FLG_Internalname, GXutil.rtrim( A625TBM07_OTHER_SITE_VIEW_FLG), GXutil.rtrim( localUtil.format( A625TBM07_OTHER_SITE_VIEW_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM07_OTHER_SITE_VIEW_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM07_OTHER_SITE_VIEW_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TBM07_AUTH_BEHAVIOR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm07_del_flg_Internalname, "�폜�t���O", "", "", lblTextblocktbm07_del_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM07_AUTH_BEHAVIOR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM07_DEL_FLG_Internalname, GXutil.rtrim( A626TBM07_DEL_FLG), GXutil.rtrim( localUtil.format( A626TBM07_DEL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM07_DEL_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM07_DEL_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TBM07_AUTH_BEHAVIOR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm07_crt_datetime_Internalname, "�쐬����", "", "", lblTextblocktbm07_crt_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM07_AUTH_BEHAVIOR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTBM07_CRT_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM07_CRT_DATETIME_Internalname, localUtil.format(A627TBM07_CRT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A627TBM07_CRT_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM07_CRT_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM07_CRT_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TBM07_AUTH_BEHAVIOR.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBM07_CRT_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTBM07_CRT_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBM07_AUTH_BEHAVIOR.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm07_crt_user_id_Internalname, "ID", "", "", lblTextblocktbm07_crt_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM07_AUTH_BEHAVIOR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM07_CRT_USER_ID_Internalname, GXutil.rtrim( A628TBM07_CRT_USER_ID), GXutil.rtrim( localUtil.format( A628TBM07_CRT_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM07_CRT_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM07_CRT_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_USER_ID", "left", "HLP_TBM07_AUTH_BEHAVIOR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm07_crt_prog_nm_Internalname, "�쐬�v���O������", "", "", lblTextblocktbm07_crt_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM07_AUTH_BEHAVIOR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM07_CRT_PROG_NM_Internalname, GXutil.rtrim( A629TBM07_CRT_PROG_NM), GXutil.rtrim( localUtil.format( A629TBM07_CRT_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM07_CRT_PROG_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM07_CRT_PROG_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_PG_NM", "left", "HLP_TBM07_AUTH_BEHAVIOR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm07_upd_datetime_Internalname, "�X�V����", "", "", lblTextblocktbm07_upd_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM07_AUTH_BEHAVIOR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTBM07_UPD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM07_UPD_DATETIME_Internalname, localUtil.format(A630TBM07_UPD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A630TBM07_UPD_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM07_UPD_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM07_UPD_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TBM07_AUTH_BEHAVIOR.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBM07_UPD_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTBM07_UPD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBM07_AUTH_BEHAVIOR.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm07_upd_user_id_Internalname, "ID", "", "", lblTextblocktbm07_upd_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM07_AUTH_BEHAVIOR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM07_UPD_USER_ID_Internalname, GXutil.rtrim( A631TBM07_UPD_USER_ID), GXutil.rtrim( localUtil.format( A631TBM07_UPD_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM07_UPD_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM07_UPD_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_USER_ID", "left", "HLP_TBM07_AUTH_BEHAVIOR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm07_upd_prog_nm_Internalname, "�X�V�v���O������", "", "", lblTextblocktbm07_upd_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM07_AUTH_BEHAVIOR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM07_UPD_PROG_NM_Internalname, GXutil.rtrim( A632TBM07_UPD_PROG_NM), GXutil.rtrim( localUtil.format( A632TBM07_UPD_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM07_UPD_PROG_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM07_UPD_PROG_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_PG_NM", "left", "HLP_TBM07_AUTH_BEHAVIOR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm07_upd_cnt_Internalname, "�X�V�J�E���g", "", "", lblTextblocktbm07_upd_cnt_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM07_AUTH_BEHAVIOR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM07_UPD_CNT_Internalname, GXutil.ltrim( localUtil.ntoc( A633TBM07_UPD_CNT, (byte)(10), (byte)(0), ".", "")), ((edtTBM07_UPD_CNT_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A633TBM07_UPD_CNT), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A633TBM07_UPD_CNT), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM07_UPD_CNT_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM07_UPD_CNT_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_NO", "right", "HLP_TBM07_AUTH_BEHAVIOR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_34_1439e( true) ;
      }
      else
      {
         wb_table4_34_1439e( false) ;
      }
   }

   public void wb_table2_5_1439( boolean wbgen )
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
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_Visible, 1, "", "�ŏ���", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM07_AUTH_BEHAVIOR.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM07_AUTH_BEHAVIOR.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_Visible, 1, "", "�O��", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM07_AUTH_BEHAVIOR.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM07_AUTH_BEHAVIOR.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_Visible, 1, "", "����", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM07_AUTH_BEHAVIOR.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM07_AUTH_BEHAVIOR.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_Visible, 1, "", "�Ō�", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM07_AUTH_BEHAVIOR.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM07_AUTH_BEHAVIOR.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_Visible, 1, "", "�I��", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM07_AUTH_BEHAVIOR.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM07_AUTH_BEHAVIOR.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "���s", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM07_AUTH_BEHAVIOR.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM07_AUTH_BEHAVIOR.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_Visible, 1, "", "�I��", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM07_AUTH_BEHAVIOR.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM07_AUTH_BEHAVIOR.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "�폜", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM07_AUTH_BEHAVIOR.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM07_AUTH_BEHAVIOR.htm");
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
         wb_table2_5_1439e( true) ;
      }
      else
      {
         wb_table2_5_1439e( false) ;
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
      /* Execute user event: e11142 */
      e11142 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            A50TBM07_AUTH_CD = httpContext.cgiGet( edtTBM07_AUTH_CD_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A50TBM07_AUTH_CD", A50TBM07_AUTH_CD);
            A623TBM07_CRF_INP_AUTH_FLG = httpContext.cgiGet( edtTBM07_CRF_INP_AUTH_FLG_Internalname) ;
            n623TBM07_CRF_INP_AUTH_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A623TBM07_CRF_INP_AUTH_FLG", A623TBM07_CRF_INP_AUTH_FLG);
            n623TBM07_CRF_INP_AUTH_FLG = ((GXutil.strcmp("", A623TBM07_CRF_INP_AUTH_FLG)==0) ? true : false) ;
            A624TBM07_CRF_EDIT_AUTH_FLG = httpContext.cgiGet( edtTBM07_CRF_EDIT_AUTH_FLG_Internalname) ;
            n624TBM07_CRF_EDIT_AUTH_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A624TBM07_CRF_EDIT_AUTH_FLG", A624TBM07_CRF_EDIT_AUTH_FLG);
            n624TBM07_CRF_EDIT_AUTH_FLG = ((GXutil.strcmp("", A624TBM07_CRF_EDIT_AUTH_FLG)==0) ? true : false) ;
            A625TBM07_OTHER_SITE_VIEW_FLG = httpContext.cgiGet( edtTBM07_OTHER_SITE_VIEW_FLG_Internalname) ;
            n625TBM07_OTHER_SITE_VIEW_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A625TBM07_OTHER_SITE_VIEW_FLG", A625TBM07_OTHER_SITE_VIEW_FLG);
            n625TBM07_OTHER_SITE_VIEW_FLG = ((GXutil.strcmp("", A625TBM07_OTHER_SITE_VIEW_FLG)==0) ? true : false) ;
            A626TBM07_DEL_FLG = httpContext.cgiGet( edtTBM07_DEL_FLG_Internalname) ;
            n626TBM07_DEL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A626TBM07_DEL_FLG", A626TBM07_DEL_FLG);
            n626TBM07_DEL_FLG = ((GXutil.strcmp("", A626TBM07_DEL_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBM07_CRT_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TBM07_CRT_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM07_CRT_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A627TBM07_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n627TBM07_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A627TBM07_CRT_DATETIME", localUtil.ttoc( A627TBM07_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A627TBM07_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBM07_CRT_DATETIME_Internalname)) ;
               n627TBM07_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A627TBM07_CRT_DATETIME", localUtil.ttoc( A627TBM07_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n627TBM07_CRT_DATETIME = (GXutil.nullDate().equals(A627TBM07_CRT_DATETIME) ? true : false) ;
            A628TBM07_CRT_USER_ID = httpContext.cgiGet( edtTBM07_CRT_USER_ID_Internalname) ;
            n628TBM07_CRT_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A628TBM07_CRT_USER_ID", A628TBM07_CRT_USER_ID);
            n628TBM07_CRT_USER_ID = ((GXutil.strcmp("", A628TBM07_CRT_USER_ID)==0) ? true : false) ;
            A629TBM07_CRT_PROG_NM = httpContext.cgiGet( edtTBM07_CRT_PROG_NM_Internalname) ;
            n629TBM07_CRT_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A629TBM07_CRT_PROG_NM", A629TBM07_CRT_PROG_NM);
            n629TBM07_CRT_PROG_NM = ((GXutil.strcmp("", A629TBM07_CRT_PROG_NM)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBM07_UPD_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TBM07_UPD_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM07_UPD_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A630TBM07_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n630TBM07_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A630TBM07_UPD_DATETIME", localUtil.ttoc( A630TBM07_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A630TBM07_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBM07_UPD_DATETIME_Internalname)) ;
               n630TBM07_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A630TBM07_UPD_DATETIME", localUtil.ttoc( A630TBM07_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n630TBM07_UPD_DATETIME = (GXutil.nullDate().equals(A630TBM07_UPD_DATETIME) ? true : false) ;
            A631TBM07_UPD_USER_ID = httpContext.cgiGet( edtTBM07_UPD_USER_ID_Internalname) ;
            n631TBM07_UPD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A631TBM07_UPD_USER_ID", A631TBM07_UPD_USER_ID);
            n631TBM07_UPD_USER_ID = ((GXutil.strcmp("", A631TBM07_UPD_USER_ID)==0) ? true : false) ;
            A632TBM07_UPD_PROG_NM = httpContext.cgiGet( edtTBM07_UPD_PROG_NM_Internalname) ;
            n632TBM07_UPD_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A632TBM07_UPD_PROG_NM", A632TBM07_UPD_PROG_NM);
            n632TBM07_UPD_PROG_NM = ((GXutil.strcmp("", A632TBM07_UPD_PROG_NM)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM07_UPD_CNT_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM07_UPD_CNT_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM07_UPD_CNT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM07_UPD_CNT_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A633TBM07_UPD_CNT = 0 ;
               n633TBM07_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A633TBM07_UPD_CNT", GXutil.ltrim( GXutil.str( A633TBM07_UPD_CNT, 10, 0)));
            }
            else
            {
               A633TBM07_UPD_CNT = localUtil.ctol( httpContext.cgiGet( edtTBM07_UPD_CNT_Internalname), ".", ",") ;
               n633TBM07_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A633TBM07_UPD_CNT", GXutil.ltrim( GXutil.str( A633TBM07_UPD_CNT, 10, 0)));
            }
            n633TBM07_UPD_CNT = ((0==A633TBM07_UPD_CNT) ? true : false) ;
            /* Read saved values. */
            Z50TBM07_AUTH_CD = httpContext.cgiGet( "Z50TBM07_AUTH_CD") ;
            Z627TBM07_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z627TBM07_CRT_DATETIME"), 0) ;
            n627TBM07_CRT_DATETIME = (GXutil.nullDate().equals(A627TBM07_CRT_DATETIME) ? true : false) ;
            Z628TBM07_CRT_USER_ID = httpContext.cgiGet( "Z628TBM07_CRT_USER_ID") ;
            n628TBM07_CRT_USER_ID = ((GXutil.strcmp("", A628TBM07_CRT_USER_ID)==0) ? true : false) ;
            Z630TBM07_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z630TBM07_UPD_DATETIME"), 0) ;
            n630TBM07_UPD_DATETIME = (GXutil.nullDate().equals(A630TBM07_UPD_DATETIME) ? true : false) ;
            Z631TBM07_UPD_USER_ID = httpContext.cgiGet( "Z631TBM07_UPD_USER_ID") ;
            n631TBM07_UPD_USER_ID = ((GXutil.strcmp("", A631TBM07_UPD_USER_ID)==0) ? true : false) ;
            Z633TBM07_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z633TBM07_UPD_CNT"), ".", ",") ;
            n633TBM07_UPD_CNT = ((0==A633TBM07_UPD_CNT) ? true : false) ;
            Z623TBM07_CRF_INP_AUTH_FLG = httpContext.cgiGet( "Z623TBM07_CRF_INP_AUTH_FLG") ;
            n623TBM07_CRF_INP_AUTH_FLG = ((GXutil.strcmp("", A623TBM07_CRF_INP_AUTH_FLG)==0) ? true : false) ;
            Z624TBM07_CRF_EDIT_AUTH_FLG = httpContext.cgiGet( "Z624TBM07_CRF_EDIT_AUTH_FLG") ;
            n624TBM07_CRF_EDIT_AUTH_FLG = ((GXutil.strcmp("", A624TBM07_CRF_EDIT_AUTH_FLG)==0) ? true : false) ;
            Z625TBM07_OTHER_SITE_VIEW_FLG = httpContext.cgiGet( "Z625TBM07_OTHER_SITE_VIEW_FLG") ;
            n625TBM07_OTHER_SITE_VIEW_FLG = ((GXutil.strcmp("", A625TBM07_OTHER_SITE_VIEW_FLG)==0) ? true : false) ;
            Z626TBM07_DEL_FLG = httpContext.cgiGet( "Z626TBM07_DEL_FLG") ;
            n626TBM07_DEL_FLG = ((GXutil.strcmp("", A626TBM07_DEL_FLG)==0) ? true : false) ;
            Z629TBM07_CRT_PROG_NM = httpContext.cgiGet( "Z629TBM07_CRT_PROG_NM") ;
            n629TBM07_CRT_PROG_NM = ((GXutil.strcmp("", A629TBM07_CRT_PROG_NM)==0) ? true : false) ;
            Z632TBM07_UPD_PROG_NM = httpContext.cgiGet( "Z632TBM07_UPD_PROG_NM") ;
            n632TBM07_UPD_PROG_NM = ((GXutil.strcmp("", A632TBM07_UPD_PROG_NM)==0) ? true : false) ;
            O633TBM07_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "O633TBM07_UPD_CNT"), ".", ",") ;
            n633TBM07_UPD_CNT = ((0==A633TBM07_UPD_CNT) ? true : false) ;
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
               A50TBM07_AUTH_CD = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A50TBM07_AUTH_CD", A50TBM07_AUTH_CD);
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
                     /* Execute user event: e11142 */
                     e11142 ();
                  }
                  else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     dynload_actions( ) ;
                     /* Execute user event: e12142 */
                     e12142 ();
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
         /* Execute user event: e12142 */
         e12142 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll1439( ) ;
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
      disableAttributes1439( ) ;
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

   public void resetCaption140( )
   {
   }

   public void e11142( )
   {
      /* Start Routine */
      AV8W_BC_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8W_BC_FLG", AV8W_BC_FLG);
      if ( GXutil.strcmp(AV8W_BC_FLG, "1") != 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV9Pgmname, "ERR", "�֎~�@�\") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("8")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void e12142( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV9Pgmname) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      AV7W_TXT = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + "�����R�[�h:" + A50TBM07_AUTH_CD + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A623TBM07_CRF_INP_AUTH_FLG + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A624TBM07_CRF_EDIT_AUTH_FLG + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A625TBM07_OTHER_SITE_VIEW_FLG + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A626TBM07_DEL_FLG + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A627TBM07_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm07_auth_behavior_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A627TBM07_CRT_DATETIME", localUtil.ttoc( A627TBM07_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A628TBM07_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A629TBM07_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A630TBM07_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm07_auth_behavior_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A630TBM07_UPD_DATETIME", localUtil.ttoc( A630TBM07_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A631TBM07_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A632TBM07_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A633TBM07_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
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

   public void zm1439( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z627TBM07_CRT_DATETIME = T00143_A627TBM07_CRT_DATETIME[0] ;
            Z628TBM07_CRT_USER_ID = T00143_A628TBM07_CRT_USER_ID[0] ;
            Z630TBM07_UPD_DATETIME = T00143_A630TBM07_UPD_DATETIME[0] ;
            Z631TBM07_UPD_USER_ID = T00143_A631TBM07_UPD_USER_ID[0] ;
            Z633TBM07_UPD_CNT = T00143_A633TBM07_UPD_CNT[0] ;
            Z623TBM07_CRF_INP_AUTH_FLG = T00143_A623TBM07_CRF_INP_AUTH_FLG[0] ;
            Z624TBM07_CRF_EDIT_AUTH_FLG = T00143_A624TBM07_CRF_EDIT_AUTH_FLG[0] ;
            Z625TBM07_OTHER_SITE_VIEW_FLG = T00143_A625TBM07_OTHER_SITE_VIEW_FLG[0] ;
            Z626TBM07_DEL_FLG = T00143_A626TBM07_DEL_FLG[0] ;
            Z629TBM07_CRT_PROG_NM = T00143_A629TBM07_CRT_PROG_NM[0] ;
            Z632TBM07_UPD_PROG_NM = T00143_A632TBM07_UPD_PROG_NM[0] ;
         }
         else
         {
            Z627TBM07_CRT_DATETIME = A627TBM07_CRT_DATETIME ;
            Z628TBM07_CRT_USER_ID = A628TBM07_CRT_USER_ID ;
            Z630TBM07_UPD_DATETIME = A630TBM07_UPD_DATETIME ;
            Z631TBM07_UPD_USER_ID = A631TBM07_UPD_USER_ID ;
            Z633TBM07_UPD_CNT = A633TBM07_UPD_CNT ;
            Z623TBM07_CRF_INP_AUTH_FLG = A623TBM07_CRF_INP_AUTH_FLG ;
            Z624TBM07_CRF_EDIT_AUTH_FLG = A624TBM07_CRF_EDIT_AUTH_FLG ;
            Z625TBM07_OTHER_SITE_VIEW_FLG = A625TBM07_OTHER_SITE_VIEW_FLG ;
            Z626TBM07_DEL_FLG = A626TBM07_DEL_FLG ;
            Z629TBM07_CRT_PROG_NM = A629TBM07_CRT_PROG_NM ;
            Z632TBM07_UPD_PROG_NM = A632TBM07_UPD_PROG_NM ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z627TBM07_CRT_DATETIME = A627TBM07_CRT_DATETIME ;
         Z628TBM07_CRT_USER_ID = A628TBM07_CRT_USER_ID ;
         Z630TBM07_UPD_DATETIME = A630TBM07_UPD_DATETIME ;
         Z631TBM07_UPD_USER_ID = A631TBM07_UPD_USER_ID ;
         Z633TBM07_UPD_CNT = A633TBM07_UPD_CNT ;
         Z623TBM07_CRF_INP_AUTH_FLG = A623TBM07_CRF_INP_AUTH_FLG ;
         Z624TBM07_CRF_EDIT_AUTH_FLG = A624TBM07_CRF_EDIT_AUTH_FLG ;
         Z625TBM07_OTHER_SITE_VIEW_FLG = A625TBM07_OTHER_SITE_VIEW_FLG ;
         Z626TBM07_DEL_FLG = A626TBM07_DEL_FLG ;
         Z629TBM07_CRT_PROG_NM = A629TBM07_CRT_PROG_NM ;
         Z632TBM07_UPD_PROG_NM = A632TBM07_UPD_PROG_NM ;
         Z50TBM07_AUTH_CD = A50TBM07_AUTH_CD ;
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

   public void load1439( )
   {
      /* Using cursor T00145 */
      pr_default.execute(3, new Object[] {A50TBM07_AUTH_CD});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound39 = (short)(1) ;
         A627TBM07_CRT_DATETIME = T00145_A627TBM07_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A627TBM07_CRT_DATETIME", localUtil.ttoc( A627TBM07_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n627TBM07_CRT_DATETIME = T00145_n627TBM07_CRT_DATETIME[0] ;
         A628TBM07_CRT_USER_ID = T00145_A628TBM07_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A628TBM07_CRT_USER_ID", A628TBM07_CRT_USER_ID);
         n628TBM07_CRT_USER_ID = T00145_n628TBM07_CRT_USER_ID[0] ;
         A630TBM07_UPD_DATETIME = T00145_A630TBM07_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A630TBM07_UPD_DATETIME", localUtil.ttoc( A630TBM07_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n630TBM07_UPD_DATETIME = T00145_n630TBM07_UPD_DATETIME[0] ;
         A631TBM07_UPD_USER_ID = T00145_A631TBM07_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A631TBM07_UPD_USER_ID", A631TBM07_UPD_USER_ID);
         n631TBM07_UPD_USER_ID = T00145_n631TBM07_UPD_USER_ID[0] ;
         A633TBM07_UPD_CNT = T00145_A633TBM07_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A633TBM07_UPD_CNT", GXutil.ltrim( GXutil.str( A633TBM07_UPD_CNT, 10, 0)));
         n633TBM07_UPD_CNT = T00145_n633TBM07_UPD_CNT[0] ;
         A623TBM07_CRF_INP_AUTH_FLG = T00145_A623TBM07_CRF_INP_AUTH_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A623TBM07_CRF_INP_AUTH_FLG", A623TBM07_CRF_INP_AUTH_FLG);
         n623TBM07_CRF_INP_AUTH_FLG = T00145_n623TBM07_CRF_INP_AUTH_FLG[0] ;
         A624TBM07_CRF_EDIT_AUTH_FLG = T00145_A624TBM07_CRF_EDIT_AUTH_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A624TBM07_CRF_EDIT_AUTH_FLG", A624TBM07_CRF_EDIT_AUTH_FLG);
         n624TBM07_CRF_EDIT_AUTH_FLG = T00145_n624TBM07_CRF_EDIT_AUTH_FLG[0] ;
         A625TBM07_OTHER_SITE_VIEW_FLG = T00145_A625TBM07_OTHER_SITE_VIEW_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A625TBM07_OTHER_SITE_VIEW_FLG", A625TBM07_OTHER_SITE_VIEW_FLG);
         n625TBM07_OTHER_SITE_VIEW_FLG = T00145_n625TBM07_OTHER_SITE_VIEW_FLG[0] ;
         A626TBM07_DEL_FLG = T00145_A626TBM07_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A626TBM07_DEL_FLG", A626TBM07_DEL_FLG);
         n626TBM07_DEL_FLG = T00145_n626TBM07_DEL_FLG[0] ;
         A629TBM07_CRT_PROG_NM = T00145_A629TBM07_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A629TBM07_CRT_PROG_NM", A629TBM07_CRT_PROG_NM);
         n629TBM07_CRT_PROG_NM = T00145_n629TBM07_CRT_PROG_NM[0] ;
         A632TBM07_UPD_PROG_NM = T00145_A632TBM07_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A632TBM07_UPD_PROG_NM", A632TBM07_UPD_PROG_NM);
         n632TBM07_UPD_PROG_NM = T00145_n632TBM07_UPD_PROG_NM[0] ;
         zm1439( -8) ;
      }
      pr_default.close(3);
      onLoadActions1439( ) ;
   }

   public void onLoadActions1439( )
   {
      AV9Pgmname = "TBM07_AUTH_BEHAVIOR" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
   }

   public void checkExtendedTable1439( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV9Pgmname = "TBM07_AUTH_BEHAVIOR" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      /* Using cursor T00144 */
      pr_default.execute(2, new Object[] {A50TBM07_AUTH_CD});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem("'�����ʐU���}�X�^�E�����T�u�^�C�v' �̊Y�����R�[�h�͂���܂���B", "ForeignKeyNotFound", 1, "TBM07_AUTH_CD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM07_AUTH_CD_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
      if ( ! ( GXutil.nullDate().equals(A627TBM07_CRT_DATETIME) || (( A627TBM07_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A627TBM07_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("�t�B�[���h�@�쐬���� �͔͈͊O�ł�", "OutOfRange", 1, "TBM07_CRT_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM07_CRT_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( GXutil.nullDate().equals(A630TBM07_UPD_DATETIME) || (( A630TBM07_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A630TBM07_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("�t�B�[���h�@�X�V���� �͔͈͊O�ł�", "OutOfRange", 1, "TBM07_UPD_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM07_UPD_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1439( )
   {
   }

   public void enableDisable( )
   {
   }

   public void gxload_9( String A50TBM07_AUTH_CD )
   {
      /* Using cursor T00144 */
      pr_default.execute(2, new Object[] {A50TBM07_AUTH_CD});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem("'�����ʐU���}�X�^�E�����T�u�^�C�v' �̊Y�����R�[�h�͂���܂���B", "ForeignKeyNotFound", 1, "TBM07_AUTH_CD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM07_AUTH_CD_Internalname ;
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

   public void getKey1439( )
   {
      /* Using cursor T00146 */
      pr_default.execute(4, new Object[] {A50TBM07_AUTH_CD});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound39 = (short)(1) ;
      }
      else
      {
         RcdFound39 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00143 */
      pr_default.execute(1, new Object[] {A50TBM07_AUTH_CD});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1439( 8) ;
         RcdFound39 = (short)(1) ;
         A627TBM07_CRT_DATETIME = T00143_A627TBM07_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A627TBM07_CRT_DATETIME", localUtil.ttoc( A627TBM07_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n627TBM07_CRT_DATETIME = T00143_n627TBM07_CRT_DATETIME[0] ;
         A628TBM07_CRT_USER_ID = T00143_A628TBM07_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A628TBM07_CRT_USER_ID", A628TBM07_CRT_USER_ID);
         n628TBM07_CRT_USER_ID = T00143_n628TBM07_CRT_USER_ID[0] ;
         A630TBM07_UPD_DATETIME = T00143_A630TBM07_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A630TBM07_UPD_DATETIME", localUtil.ttoc( A630TBM07_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n630TBM07_UPD_DATETIME = T00143_n630TBM07_UPD_DATETIME[0] ;
         A631TBM07_UPD_USER_ID = T00143_A631TBM07_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A631TBM07_UPD_USER_ID", A631TBM07_UPD_USER_ID);
         n631TBM07_UPD_USER_ID = T00143_n631TBM07_UPD_USER_ID[0] ;
         A633TBM07_UPD_CNT = T00143_A633TBM07_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A633TBM07_UPD_CNT", GXutil.ltrim( GXutil.str( A633TBM07_UPD_CNT, 10, 0)));
         n633TBM07_UPD_CNT = T00143_n633TBM07_UPD_CNT[0] ;
         A623TBM07_CRF_INP_AUTH_FLG = T00143_A623TBM07_CRF_INP_AUTH_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A623TBM07_CRF_INP_AUTH_FLG", A623TBM07_CRF_INP_AUTH_FLG);
         n623TBM07_CRF_INP_AUTH_FLG = T00143_n623TBM07_CRF_INP_AUTH_FLG[0] ;
         A624TBM07_CRF_EDIT_AUTH_FLG = T00143_A624TBM07_CRF_EDIT_AUTH_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A624TBM07_CRF_EDIT_AUTH_FLG", A624TBM07_CRF_EDIT_AUTH_FLG);
         n624TBM07_CRF_EDIT_AUTH_FLG = T00143_n624TBM07_CRF_EDIT_AUTH_FLG[0] ;
         A625TBM07_OTHER_SITE_VIEW_FLG = T00143_A625TBM07_OTHER_SITE_VIEW_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A625TBM07_OTHER_SITE_VIEW_FLG", A625TBM07_OTHER_SITE_VIEW_FLG);
         n625TBM07_OTHER_SITE_VIEW_FLG = T00143_n625TBM07_OTHER_SITE_VIEW_FLG[0] ;
         A626TBM07_DEL_FLG = T00143_A626TBM07_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A626TBM07_DEL_FLG", A626TBM07_DEL_FLG);
         n626TBM07_DEL_FLG = T00143_n626TBM07_DEL_FLG[0] ;
         A629TBM07_CRT_PROG_NM = T00143_A629TBM07_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A629TBM07_CRT_PROG_NM", A629TBM07_CRT_PROG_NM);
         n629TBM07_CRT_PROG_NM = T00143_n629TBM07_CRT_PROG_NM[0] ;
         A632TBM07_UPD_PROG_NM = T00143_A632TBM07_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A632TBM07_UPD_PROG_NM", A632TBM07_UPD_PROG_NM);
         n632TBM07_UPD_PROG_NM = T00143_n632TBM07_UPD_PROG_NM[0] ;
         A50TBM07_AUTH_CD = T00143_A50TBM07_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A50TBM07_AUTH_CD", A50TBM07_AUTH_CD);
         O633TBM07_UPD_CNT = A633TBM07_UPD_CNT ;
         n633TBM07_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A633TBM07_UPD_CNT", GXutil.ltrim( GXutil.str( A633TBM07_UPD_CNT, 10, 0)));
         Z50TBM07_AUTH_CD = A50TBM07_AUTH_CD ;
         sMode39 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1439( ) ;
         if ( AnyError == 1 )
         {
            RcdFound39 = (short)(0) ;
            initializeNonKey1439( ) ;
         }
         Gx_mode = sMode39 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound39 = (short)(0) ;
         initializeNonKey1439( ) ;
         sMode39 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode39 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1439( ) ;
      if ( RcdFound39 == 0 )
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
      RcdFound39 = (short)(0) ;
      /* Using cursor T00147 */
      pr_default.execute(5, new Object[] {A50TBM07_AUTH_CD});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T00147_A50TBM07_AUTH_CD[0], A50TBM07_AUTH_CD) < 0 ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T00147_A50TBM07_AUTH_CD[0], A50TBM07_AUTH_CD) > 0 ) ) )
         {
            A50TBM07_AUTH_CD = T00147_A50TBM07_AUTH_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A50TBM07_AUTH_CD", A50TBM07_AUTH_CD);
            RcdFound39 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void move_previous( )
   {
      RcdFound39 = (short)(0) ;
      /* Using cursor T00148 */
      pr_default.execute(6, new Object[] {A50TBM07_AUTH_CD});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T00148_A50TBM07_AUTH_CD[0], A50TBM07_AUTH_CD) > 0 ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T00148_A50TBM07_AUTH_CD[0], A50TBM07_AUTH_CD) < 0 ) ) )
         {
            A50TBM07_AUTH_CD = T00148_A50TBM07_AUTH_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A50TBM07_AUTH_CD", A50TBM07_AUTH_CD);
            RcdFound39 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1439( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtTBM07_AUTH_CD_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1439( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound39 == 1 )
         {
            if ( GXutil.strcmp(A50TBM07_AUTH_CD, Z50TBM07_AUTH_CD) != 0 )
            {
               A50TBM07_AUTH_CD = Z50TBM07_AUTH_CD ;
               httpContext.ajax_rsp_assign_attri("", false, "A50TBM07_AUTH_CD", A50TBM07_AUTH_CD);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TBM07_AUTH_CD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM07_AUTH_CD_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTBM07_AUTH_CD_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1439( ) ;
               GX_FocusControl = edtTBM07_AUTH_CD_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( GXutil.strcmp(A50TBM07_AUTH_CD, Z50TBM07_AUTH_CD) != 0 )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTBM07_AUTH_CD_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1439( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TBM07_AUTH_CD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTBM07_AUTH_CD_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtTBM07_AUTH_CD_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1439( ) ;
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
      if ( GXutil.strcmp(A50TBM07_AUTH_CD, Z50TBM07_AUTH_CD) != 0 )
      {
         A50TBM07_AUTH_CD = Z50TBM07_AUTH_CD ;
         httpContext.ajax_rsp_assign_attri("", false, "A50TBM07_AUTH_CD", A50TBM07_AUTH_CD);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TBM07_AUTH_CD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM07_AUTH_CD_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTBM07_AUTH_CD_Internalname ;
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
      if ( RcdFound39 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TBM07_AUTH_CD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM07_AUTH_CD_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtTBM07_CRF_INP_AUTH_FLG_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart1439( ) ;
      if ( RcdFound39 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM07_CRF_INP_AUTH_FLG_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1439( ) ;
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
      if ( RcdFound39 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM07_CRF_INP_AUTH_FLG_Internalname ;
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
      if ( RcdFound39 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM07_CRF_INP_AUTH_FLG_Internalname ;
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
      scanStart1439( ) ;
      if ( RcdFound39 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound39 != 0 )
         {
            scanNext1439( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM07_CRF_INP_AUTH_FLG_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1439( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1439( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T00142 */
         pr_default.execute(0, new Object[] {A50TBM07_AUTH_CD});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM07_AUTH_BEHAVIOR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z627TBM07_CRT_DATETIME.equals( T00142_A627TBM07_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z628TBM07_CRT_USER_ID, T00142_A628TBM07_CRT_USER_ID[0]) != 0 ) || !( Z630TBM07_UPD_DATETIME.equals( T00142_A630TBM07_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z631TBM07_UPD_USER_ID, T00142_A631TBM07_UPD_USER_ID[0]) != 0 ) || ( Z633TBM07_UPD_CNT != T00142_A633TBM07_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z623TBM07_CRF_INP_AUTH_FLG, T00142_A623TBM07_CRF_INP_AUTH_FLG[0]) != 0 ) || ( GXutil.strcmp(Z624TBM07_CRF_EDIT_AUTH_FLG, T00142_A624TBM07_CRF_EDIT_AUTH_FLG[0]) != 0 ) || ( GXutil.strcmp(Z625TBM07_OTHER_SITE_VIEW_FLG, T00142_A625TBM07_OTHER_SITE_VIEW_FLG[0]) != 0 ) || ( GXutil.strcmp(Z626TBM07_DEL_FLG, T00142_A626TBM07_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z629TBM07_CRT_PROG_NM, T00142_A629TBM07_CRT_PROG_NM[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z632TBM07_UPD_PROG_NM, T00142_A632TBM07_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBM07_AUTH_BEHAVIOR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1439( )
   {
      beforeValidate1439( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1439( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1439( 0) ;
         checkOptimisticConcurrency1439( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1439( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1439( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00149 */
                  pr_default.execute(7, new Object[] {new Boolean(n627TBM07_CRT_DATETIME), A627TBM07_CRT_DATETIME, new Boolean(n628TBM07_CRT_USER_ID), A628TBM07_CRT_USER_ID, new Boolean(n630TBM07_UPD_DATETIME), A630TBM07_UPD_DATETIME, new Boolean(n631TBM07_UPD_USER_ID), A631TBM07_UPD_USER_ID, new Boolean(n633TBM07_UPD_CNT), new Long(A633TBM07_UPD_CNT), new Boolean(n623TBM07_CRF_INP_AUTH_FLG), A623TBM07_CRF_INP_AUTH_FLG, new Boolean(n624TBM07_CRF_EDIT_AUTH_FLG), A624TBM07_CRF_EDIT_AUTH_FLG, new Boolean(n625TBM07_OTHER_SITE_VIEW_FLG), A625TBM07_OTHER_SITE_VIEW_FLG, new Boolean(n626TBM07_DEL_FLG), A626TBM07_DEL_FLG, new Boolean(n629TBM07_CRT_PROG_NM), A629TBM07_CRT_PROG_NM, new Boolean(n632TBM07_UPD_PROG_NM), A632TBM07_UPD_PROG_NM, A50TBM07_AUTH_CD});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM07_AUTH_BEHAVIOR") ;
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
                        resetCaption140( ) ;
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
            load1439( ) ;
         }
         endLevel1439( ) ;
      }
      closeExtendedTableCursors1439( ) ;
   }

   public void update1439( )
   {
      beforeValidate1439( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1439( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1439( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1439( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1439( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001410 */
                  pr_default.execute(8, new Object[] {new Boolean(n627TBM07_CRT_DATETIME), A627TBM07_CRT_DATETIME, new Boolean(n628TBM07_CRT_USER_ID), A628TBM07_CRT_USER_ID, new Boolean(n630TBM07_UPD_DATETIME), A630TBM07_UPD_DATETIME, new Boolean(n631TBM07_UPD_USER_ID), A631TBM07_UPD_USER_ID, new Boolean(n633TBM07_UPD_CNT), new Long(A633TBM07_UPD_CNT), new Boolean(n623TBM07_CRF_INP_AUTH_FLG), A623TBM07_CRF_INP_AUTH_FLG, new Boolean(n624TBM07_CRF_EDIT_AUTH_FLG), A624TBM07_CRF_EDIT_AUTH_FLG, new Boolean(n625TBM07_OTHER_SITE_VIEW_FLG), A625TBM07_OTHER_SITE_VIEW_FLG, new Boolean(n626TBM07_DEL_FLG), A626TBM07_DEL_FLG, new Boolean(n629TBM07_CRT_PROG_NM), A629TBM07_CRT_PROG_NM, new Boolean(n632TBM07_UPD_PROG_NM), A632TBM07_UPD_PROG_NM, A50TBM07_AUTH_CD});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM07_AUTH_BEHAVIOR") ;
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM07_AUTH_BEHAVIOR"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1439( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "", true);
                        resetCaption140( ) ;
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
         endLevel1439( ) ;
      }
      closeExtendedTableCursors1439( ) ;
   }

   public void deferredUpdate1439( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1439( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1439( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1439( ) ;
         afterConfirm1439( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1439( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T001411 */
               pr_default.execute(9, new Object[] {A50TBM07_AUTH_CD});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM07_AUTH_BEHAVIOR") ;
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound39 == 0 )
                     {
                        initAll1439( ) ;
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
                     resetCaption140( ) ;
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
      sMode39 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1439( ) ;
      Gx_mode = sMode39 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1439( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBM07_AUTH_BEHAVIOR" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      }
   }

   public void endLevel1439( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1439( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "tbm07_auth_behavior");
         if ( AnyError == 0 )
         {
            confirmValues140( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "tbm07_auth_behavior");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1439( )
   {
      /* Scan By routine */
      /* Using cursor T001412 */
      pr_default.execute(10);
      RcdFound39 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound39 = (short)(1) ;
         A50TBM07_AUTH_CD = T001412_A50TBM07_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A50TBM07_AUTH_CD", A50TBM07_AUTH_CD);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1439( )
   {
      /* Scan next routine */
      pr_default.readNext(10);
      RcdFound39 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound39 = (short)(1) ;
         A50TBM07_AUTH_CD = T001412_A50TBM07_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A50TBM07_AUTH_CD", A50TBM07_AUTH_CD);
      }
   }

   public void scanEnd1439( )
   {
      pr_default.close(10);
   }

   public void afterConfirm1439( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1439( )
   {
      /* Before Insert Rules */
      A627TBM07_CRT_DATETIME = GXutil.now( ) ;
      n627TBM07_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A627TBM07_CRT_DATETIME", localUtil.ttoc( A627TBM07_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A628TBM07_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm07_auth_behavior_impl.this.GXt_char1 = GXv_char2[0] ;
      A628TBM07_CRT_USER_ID = GXt_char1 ;
      n628TBM07_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A628TBM07_CRT_USER_ID", A628TBM07_CRT_USER_ID);
      A630TBM07_UPD_DATETIME = GXutil.now( ) ;
      n630TBM07_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A630TBM07_UPD_DATETIME", localUtil.ttoc( A630TBM07_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A631TBM07_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm07_auth_behavior_impl.this.GXt_char1 = GXv_char2[0] ;
      A631TBM07_UPD_USER_ID = GXt_char1 ;
      n631TBM07_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A631TBM07_UPD_USER_ID", A631TBM07_UPD_USER_ID);
      A633TBM07_UPD_CNT = (long)(O633TBM07_UPD_CNT+1) ;
      n633TBM07_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A633TBM07_UPD_CNT", GXutil.ltrim( GXutil.str( A633TBM07_UPD_CNT, 10, 0)));
   }

   public void beforeUpdate1439( )
   {
      /* Before Update Rules */
      A630TBM07_UPD_DATETIME = GXutil.now( ) ;
      n630TBM07_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A630TBM07_UPD_DATETIME", localUtil.ttoc( A630TBM07_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A631TBM07_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm07_auth_behavior_impl.this.GXt_char1 = GXv_char2[0] ;
      A631TBM07_UPD_USER_ID = GXt_char1 ;
      n631TBM07_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A631TBM07_UPD_USER_ID", A631TBM07_UPD_USER_ID);
      A633TBM07_UPD_CNT = (long)(O633TBM07_UPD_CNT+1) ;
      n633TBM07_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A633TBM07_UPD_CNT", GXutil.ltrim( GXutil.str( A633TBM07_UPD_CNT, 10, 0)));
   }

   public void beforeDelete1439( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1439( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1439( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1439( )
   {
      edtTBM07_AUTH_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM07_AUTH_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM07_AUTH_CD_Enabled, 5, 0)));
      edtTBM07_CRF_INP_AUTH_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM07_CRF_INP_AUTH_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM07_CRF_INP_AUTH_FLG_Enabled, 5, 0)));
      edtTBM07_CRF_EDIT_AUTH_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM07_CRF_EDIT_AUTH_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM07_CRF_EDIT_AUTH_FLG_Enabled, 5, 0)));
      edtTBM07_OTHER_SITE_VIEW_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM07_OTHER_SITE_VIEW_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM07_OTHER_SITE_VIEW_FLG_Enabled, 5, 0)));
      edtTBM07_DEL_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM07_DEL_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM07_DEL_FLG_Enabled, 5, 0)));
      edtTBM07_CRT_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM07_CRT_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM07_CRT_DATETIME_Enabled, 5, 0)));
      edtTBM07_CRT_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM07_CRT_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM07_CRT_USER_ID_Enabled, 5, 0)));
      edtTBM07_CRT_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM07_CRT_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM07_CRT_PROG_NM_Enabled, 5, 0)));
      edtTBM07_UPD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM07_UPD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM07_UPD_DATETIME_Enabled, 5, 0)));
      edtTBM07_UPD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM07_UPD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM07_UPD_USER_ID_Enabled, 5, 0)));
      edtTBM07_UPD_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM07_UPD_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM07_UPD_PROG_NM_Enabled, 5, 0)));
      edtTBM07_UPD_CNT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM07_UPD_CNT_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM07_UPD_CNT_Enabled, 5, 0)));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues140( )
   {
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv());
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( "�����ʐU���}�X�^") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?202071513212678");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("tbm07_auth_behavior") +"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm1439( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z50TBM07_AUTH_CD", GXutil.rtrim( Z50TBM07_AUTH_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z627TBM07_CRT_DATETIME", localUtil.ttoc( Z627TBM07_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z628TBM07_CRT_USER_ID", GXutil.rtrim( Z628TBM07_CRT_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z630TBM07_UPD_DATETIME", localUtil.ttoc( Z630TBM07_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z631TBM07_UPD_USER_ID", GXutil.rtrim( Z631TBM07_UPD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z633TBM07_UPD_CNT", GXutil.ltrim( localUtil.ntoc( Z633TBM07_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z623TBM07_CRF_INP_AUTH_FLG", GXutil.rtrim( Z623TBM07_CRF_INP_AUTH_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z624TBM07_CRF_EDIT_AUTH_FLG", GXutil.rtrim( Z624TBM07_CRF_EDIT_AUTH_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z625TBM07_OTHER_SITE_VIEW_FLG", GXutil.rtrim( Z625TBM07_OTHER_SITE_VIEW_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z626TBM07_DEL_FLG", GXutil.rtrim( Z626TBM07_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z629TBM07_CRT_PROG_NM", GXutil.rtrim( Z629TBM07_CRT_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z632TBM07_UPD_PROG_NM", GXutil.rtrim( Z632TBM07_UPD_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "O633TBM07_UPD_CNT", GXutil.ltrim( localUtil.ntoc( O633TBM07_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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
      return "TBM07_AUTH_BEHAVIOR" ;
   }

   public String getPgmdesc( )
   {
      return "�����ʐU���}�X�^" ;
   }

   public void initializeNonKey1439( )
   {
      A627TBM07_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n627TBM07_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A627TBM07_CRT_DATETIME", localUtil.ttoc( A627TBM07_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n627TBM07_CRT_DATETIME = (GXutil.nullDate().equals(A627TBM07_CRT_DATETIME) ? true : false) ;
      A628TBM07_CRT_USER_ID = "" ;
      n628TBM07_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A628TBM07_CRT_USER_ID", A628TBM07_CRT_USER_ID);
      n628TBM07_CRT_USER_ID = ((GXutil.strcmp("", A628TBM07_CRT_USER_ID)==0) ? true : false) ;
      A630TBM07_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n630TBM07_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A630TBM07_UPD_DATETIME", localUtil.ttoc( A630TBM07_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n630TBM07_UPD_DATETIME = (GXutil.nullDate().equals(A630TBM07_UPD_DATETIME) ? true : false) ;
      A631TBM07_UPD_USER_ID = "" ;
      n631TBM07_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A631TBM07_UPD_USER_ID", A631TBM07_UPD_USER_ID);
      n631TBM07_UPD_USER_ID = ((GXutil.strcmp("", A631TBM07_UPD_USER_ID)==0) ? true : false) ;
      A633TBM07_UPD_CNT = 0 ;
      n633TBM07_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A633TBM07_UPD_CNT", GXutil.ltrim( GXutil.str( A633TBM07_UPD_CNT, 10, 0)));
      n633TBM07_UPD_CNT = ((0==A633TBM07_UPD_CNT) ? true : false) ;
      A623TBM07_CRF_INP_AUTH_FLG = "" ;
      n623TBM07_CRF_INP_AUTH_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A623TBM07_CRF_INP_AUTH_FLG", A623TBM07_CRF_INP_AUTH_FLG);
      n623TBM07_CRF_INP_AUTH_FLG = ((GXutil.strcmp("", A623TBM07_CRF_INP_AUTH_FLG)==0) ? true : false) ;
      A624TBM07_CRF_EDIT_AUTH_FLG = "" ;
      n624TBM07_CRF_EDIT_AUTH_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A624TBM07_CRF_EDIT_AUTH_FLG", A624TBM07_CRF_EDIT_AUTH_FLG);
      n624TBM07_CRF_EDIT_AUTH_FLG = ((GXutil.strcmp("", A624TBM07_CRF_EDIT_AUTH_FLG)==0) ? true : false) ;
      A625TBM07_OTHER_SITE_VIEW_FLG = "" ;
      n625TBM07_OTHER_SITE_VIEW_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A625TBM07_OTHER_SITE_VIEW_FLG", A625TBM07_OTHER_SITE_VIEW_FLG);
      n625TBM07_OTHER_SITE_VIEW_FLG = ((GXutil.strcmp("", A625TBM07_OTHER_SITE_VIEW_FLG)==0) ? true : false) ;
      A626TBM07_DEL_FLG = "" ;
      n626TBM07_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A626TBM07_DEL_FLG", A626TBM07_DEL_FLG);
      n626TBM07_DEL_FLG = ((GXutil.strcmp("", A626TBM07_DEL_FLG)==0) ? true : false) ;
      A629TBM07_CRT_PROG_NM = "" ;
      n629TBM07_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A629TBM07_CRT_PROG_NM", A629TBM07_CRT_PROG_NM);
      n629TBM07_CRT_PROG_NM = ((GXutil.strcmp("", A629TBM07_CRT_PROG_NM)==0) ? true : false) ;
      A632TBM07_UPD_PROG_NM = "" ;
      n632TBM07_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A632TBM07_UPD_PROG_NM", A632TBM07_UPD_PROG_NM);
      n632TBM07_UPD_PROG_NM = ((GXutil.strcmp("", A632TBM07_UPD_PROG_NM)==0) ? true : false) ;
      O633TBM07_UPD_CNT = A633TBM07_UPD_CNT ;
      n633TBM07_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A633TBM07_UPD_CNT", GXutil.ltrim( GXutil.str( A633TBM07_UPD_CNT, 10, 0)));
   }

   public void initAll1439( )
   {
      A50TBM07_AUTH_CD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A50TBM07_AUTH_CD", A50TBM07_AUTH_CD);
      initializeNonKey1439( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202071513212682");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("tbm07_auth_behavior.js", "?202071513212682");
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
      lblTextblocktbm07_auth_cd_Internalname = "TEXTBLOCKTBM07_AUTH_CD" ;
      edtTBM07_AUTH_CD_Internalname = "TBM07_AUTH_CD" ;
      lblTextblocktbm07_crf_inp_auth_flg_Internalname = "TEXTBLOCKTBM07_CRF_INP_AUTH_FLG" ;
      edtTBM07_CRF_INP_AUTH_FLG_Internalname = "TBM07_CRF_INP_AUTH_FLG" ;
      lblTextblocktbm07_crf_edit_auth_flg_Internalname = "TEXTBLOCKTBM07_CRF_EDIT_AUTH_FLG" ;
      edtTBM07_CRF_EDIT_AUTH_FLG_Internalname = "TBM07_CRF_EDIT_AUTH_FLG" ;
      lblTextblocktbm07_other_site_view_flg_Internalname = "TEXTBLOCKTBM07_OTHER_SITE_VIEW_FLG" ;
      edtTBM07_OTHER_SITE_VIEW_FLG_Internalname = "TBM07_OTHER_SITE_VIEW_FLG" ;
      lblTextblocktbm07_del_flg_Internalname = "TEXTBLOCKTBM07_DEL_FLG" ;
      edtTBM07_DEL_FLG_Internalname = "TBM07_DEL_FLG" ;
      lblTextblocktbm07_crt_datetime_Internalname = "TEXTBLOCKTBM07_CRT_DATETIME" ;
      edtTBM07_CRT_DATETIME_Internalname = "TBM07_CRT_DATETIME" ;
      lblTextblocktbm07_crt_user_id_Internalname = "TEXTBLOCKTBM07_CRT_USER_ID" ;
      edtTBM07_CRT_USER_ID_Internalname = "TBM07_CRT_USER_ID" ;
      lblTextblocktbm07_crt_prog_nm_Internalname = "TEXTBLOCKTBM07_CRT_PROG_NM" ;
      edtTBM07_CRT_PROG_NM_Internalname = "TBM07_CRT_PROG_NM" ;
      lblTextblocktbm07_upd_datetime_Internalname = "TEXTBLOCKTBM07_UPD_DATETIME" ;
      edtTBM07_UPD_DATETIME_Internalname = "TBM07_UPD_DATETIME" ;
      lblTextblocktbm07_upd_user_id_Internalname = "TEXTBLOCKTBM07_UPD_USER_ID" ;
      edtTBM07_UPD_USER_ID_Internalname = "TBM07_UPD_USER_ID" ;
      lblTextblocktbm07_upd_prog_nm_Internalname = "TEXTBLOCKTBM07_UPD_PROG_NM" ;
      edtTBM07_UPD_PROG_NM_Internalname = "TBM07_UPD_PROG_NM" ;
      lblTextblocktbm07_upd_cnt_Internalname = "TEXTBLOCKTBM07_UPD_CNT" ;
      edtTBM07_UPD_CNT_Internalname = "TBM07_UPD_CNT" ;
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
      edtTBM07_UPD_CNT_Jsonclick = "" ;
      edtTBM07_UPD_CNT_Enabled = 1 ;
      edtTBM07_UPD_PROG_NM_Jsonclick = "" ;
      edtTBM07_UPD_PROG_NM_Enabled = 1 ;
      edtTBM07_UPD_USER_ID_Jsonclick = "" ;
      edtTBM07_UPD_USER_ID_Enabled = 1 ;
      edtTBM07_UPD_DATETIME_Jsonclick = "" ;
      edtTBM07_UPD_DATETIME_Enabled = 1 ;
      edtTBM07_CRT_PROG_NM_Jsonclick = "" ;
      edtTBM07_CRT_PROG_NM_Enabled = 1 ;
      edtTBM07_CRT_USER_ID_Jsonclick = "" ;
      edtTBM07_CRT_USER_ID_Enabled = 1 ;
      edtTBM07_CRT_DATETIME_Jsonclick = "" ;
      edtTBM07_CRT_DATETIME_Enabled = 1 ;
      edtTBM07_DEL_FLG_Jsonclick = "" ;
      edtTBM07_DEL_FLG_Enabled = 1 ;
      edtTBM07_OTHER_SITE_VIEW_FLG_Jsonclick = "" ;
      edtTBM07_OTHER_SITE_VIEW_FLG_Enabled = 1 ;
      edtTBM07_CRF_EDIT_AUTH_FLG_Jsonclick = "" ;
      edtTBM07_CRF_EDIT_AUTH_FLG_Enabled = 1 ;
      edtTBM07_CRF_INP_AUTH_FLG_Jsonclick = "" ;
      edtTBM07_CRF_INP_AUTH_FLG_Enabled = 1 ;
      edtTBM07_AUTH_CD_Jsonclick = "" ;
      edtTBM07_AUTH_CD_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Visible = 1 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gx4asatbm07_crt_user_id1439( String Gx_mode )
   {
      GXt_char1 = A628TBM07_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm07_auth_behavior_impl.this.GXt_char1 = GXv_char2[0] ;
      A628TBM07_CRT_USER_ID = GXt_char1 ;
      n628TBM07_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A628TBM07_CRT_USER_ID", A628TBM07_CRT_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A628TBM07_CRT_USER_ID))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void gx6asatbm07_upd_user_id1439( String Gx_mode )
   {
      GXt_char1 = A631TBM07_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm07_auth_behavior_impl.this.GXt_char1 = GXv_char2[0] ;
      A631TBM07_UPD_USER_ID = GXt_char1 ;
      n631TBM07_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A631TBM07_UPD_USER_ID", A631TBM07_UPD_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A631TBM07_UPD_USER_ID))+"\"");
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
      GX_FocusControl = edtTBM07_CRF_INP_AUTH_FLG_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Tbm07_auth_cd( String GX_Parm1 ,
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
                                    String GX_Parm12 )
   {
      A50TBM07_AUTH_CD = GX_Parm1 ;
      A627TBM07_CRT_DATETIME = GX_Parm2 ;
      n627TBM07_CRT_DATETIME = false ;
      A628TBM07_CRT_USER_ID = GX_Parm3 ;
      n628TBM07_CRT_USER_ID = false ;
      A630TBM07_UPD_DATETIME = GX_Parm4 ;
      n630TBM07_UPD_DATETIME = false ;
      A631TBM07_UPD_USER_ID = GX_Parm5 ;
      n631TBM07_UPD_USER_ID = false ;
      A633TBM07_UPD_CNT = GX_Parm6 ;
      n633TBM07_UPD_CNT = false ;
      A623TBM07_CRF_INP_AUTH_FLG = GX_Parm7 ;
      n623TBM07_CRF_INP_AUTH_FLG = false ;
      A624TBM07_CRF_EDIT_AUTH_FLG = GX_Parm8 ;
      n624TBM07_CRF_EDIT_AUTH_FLG = false ;
      A625TBM07_OTHER_SITE_VIEW_FLG = GX_Parm9 ;
      n625TBM07_OTHER_SITE_VIEW_FLG = false ;
      A626TBM07_DEL_FLG = GX_Parm10 ;
      n626TBM07_DEL_FLG = false ;
      A629TBM07_CRT_PROG_NM = GX_Parm11 ;
      n629TBM07_CRT_PROG_NM = false ;
      A632TBM07_UPD_PROG_NM = GX_Parm12 ;
      n632TBM07_UPD_PROG_NM = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      /* Using cursor T001413 */
      pr_default.execute(11, new Object[] {A50TBM07_AUTH_CD});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem("'�����ʐU���}�X�^�E�����T�u�^�C�v' �̊Y�����R�[�h�͂���܂���B", "ForeignKeyNotFound", 1, "TBM07_AUTH_CD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM07_AUTH_CD_Internalname ;
      }
      pr_default.close(11);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(localUtil.format(A627TBM07_CRT_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A628TBM07_CRT_USER_ID));
      isValidOutput.add(localUtil.format(A630TBM07_UPD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A631TBM07_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A633TBM07_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A623TBM07_CRF_INP_AUTH_FLG));
      isValidOutput.add(GXutil.rtrim( A624TBM07_CRF_EDIT_AUTH_FLG));
      isValidOutput.add(GXutil.rtrim( A625TBM07_OTHER_SITE_VIEW_FLG));
      isValidOutput.add(GXutil.rtrim( A626TBM07_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( A629TBM07_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( A632TBM07_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( AV9Pgmname));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.rtrim( Z50TBM07_AUTH_CD));
      isValidOutput.add(localUtil.ttoc( Z627TBM07_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z628TBM07_CRT_USER_ID));
      isValidOutput.add(localUtil.ttoc( Z630TBM07_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z631TBM07_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z633TBM07_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z623TBM07_CRF_INP_AUTH_FLG));
      isValidOutput.add(GXutil.rtrim( Z624TBM07_CRF_EDIT_AUTH_FLG));
      isValidOutput.add(GXutil.rtrim( Z625TBM07_OTHER_SITE_VIEW_FLG));
      isValidOutput.add(GXutil.rtrim( Z626TBM07_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( Z629TBM07_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( Z632TBM07_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( ZV9Pgmname));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( O633TBM07_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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
      pr_default.close(11);
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
      Z50TBM07_AUTH_CD = "" ;
      Z627TBM07_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z628TBM07_CRT_USER_ID = "" ;
      Z630TBM07_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z631TBM07_UPD_USER_ID = "" ;
      Z623TBM07_CRF_INP_AUTH_FLG = "" ;
      Z624TBM07_CRF_EDIT_AUTH_FLG = "" ;
      Z625TBM07_OTHER_SITE_VIEW_FLG = "" ;
      Z626TBM07_DEL_FLG = "" ;
      Z629TBM07_CRT_PROG_NM = "" ;
      Z632TBM07_UPD_PROG_NM = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      A50TBM07_AUTH_CD = "" ;
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
      lblTextblocktbm07_auth_cd_Jsonclick = "" ;
      lblTextblocktbm07_crf_inp_auth_flg_Jsonclick = "" ;
      A623TBM07_CRF_INP_AUTH_FLG = "" ;
      lblTextblocktbm07_crf_edit_auth_flg_Jsonclick = "" ;
      A624TBM07_CRF_EDIT_AUTH_FLG = "" ;
      lblTextblocktbm07_other_site_view_flg_Jsonclick = "" ;
      A625TBM07_OTHER_SITE_VIEW_FLG = "" ;
      lblTextblocktbm07_del_flg_Jsonclick = "" ;
      A626TBM07_DEL_FLG = "" ;
      lblTextblocktbm07_crt_datetime_Jsonclick = "" ;
      A627TBM07_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbm07_crt_user_id_Jsonclick = "" ;
      A628TBM07_CRT_USER_ID = "" ;
      lblTextblocktbm07_crt_prog_nm_Jsonclick = "" ;
      A629TBM07_CRT_PROG_NM = "" ;
      lblTextblocktbm07_upd_datetime_Jsonclick = "" ;
      A630TBM07_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbm07_upd_user_id_Jsonclick = "" ;
      A631TBM07_UPD_USER_ID = "" ;
      lblTextblocktbm07_upd_prog_nm_Jsonclick = "" ;
      A632TBM07_UPD_PROG_NM = "" ;
      lblTextblocktbm07_upd_cnt_Jsonclick = "" ;
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
      T00145_A627TBM07_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00145_n627TBM07_CRT_DATETIME = new boolean[] {false} ;
      T00145_A628TBM07_CRT_USER_ID = new String[] {""} ;
      T00145_n628TBM07_CRT_USER_ID = new boolean[] {false} ;
      T00145_A630TBM07_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00145_n630TBM07_UPD_DATETIME = new boolean[] {false} ;
      T00145_A631TBM07_UPD_USER_ID = new String[] {""} ;
      T00145_n631TBM07_UPD_USER_ID = new boolean[] {false} ;
      T00145_A633TBM07_UPD_CNT = new long[1] ;
      T00145_n633TBM07_UPD_CNT = new boolean[] {false} ;
      T00145_A623TBM07_CRF_INP_AUTH_FLG = new String[] {""} ;
      T00145_n623TBM07_CRF_INP_AUTH_FLG = new boolean[] {false} ;
      T00145_A624TBM07_CRF_EDIT_AUTH_FLG = new String[] {""} ;
      T00145_n624TBM07_CRF_EDIT_AUTH_FLG = new boolean[] {false} ;
      T00145_A625TBM07_OTHER_SITE_VIEW_FLG = new String[] {""} ;
      T00145_n625TBM07_OTHER_SITE_VIEW_FLG = new boolean[] {false} ;
      T00145_A626TBM07_DEL_FLG = new String[] {""} ;
      T00145_n626TBM07_DEL_FLG = new boolean[] {false} ;
      T00145_A629TBM07_CRT_PROG_NM = new String[] {""} ;
      T00145_n629TBM07_CRT_PROG_NM = new boolean[] {false} ;
      T00145_A632TBM07_UPD_PROG_NM = new String[] {""} ;
      T00145_n632TBM07_UPD_PROG_NM = new boolean[] {false} ;
      T00145_A50TBM07_AUTH_CD = new String[] {""} ;
      T00144_A50TBM07_AUTH_CD = new String[] {""} ;
      T00146_A50TBM07_AUTH_CD = new String[] {""} ;
      T00143_A627TBM07_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00143_n627TBM07_CRT_DATETIME = new boolean[] {false} ;
      T00143_A628TBM07_CRT_USER_ID = new String[] {""} ;
      T00143_n628TBM07_CRT_USER_ID = new boolean[] {false} ;
      T00143_A630TBM07_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00143_n630TBM07_UPD_DATETIME = new boolean[] {false} ;
      T00143_A631TBM07_UPD_USER_ID = new String[] {""} ;
      T00143_n631TBM07_UPD_USER_ID = new boolean[] {false} ;
      T00143_A633TBM07_UPD_CNT = new long[1] ;
      T00143_n633TBM07_UPD_CNT = new boolean[] {false} ;
      T00143_A623TBM07_CRF_INP_AUTH_FLG = new String[] {""} ;
      T00143_n623TBM07_CRF_INP_AUTH_FLG = new boolean[] {false} ;
      T00143_A624TBM07_CRF_EDIT_AUTH_FLG = new String[] {""} ;
      T00143_n624TBM07_CRF_EDIT_AUTH_FLG = new boolean[] {false} ;
      T00143_A625TBM07_OTHER_SITE_VIEW_FLG = new String[] {""} ;
      T00143_n625TBM07_OTHER_SITE_VIEW_FLG = new boolean[] {false} ;
      T00143_A626TBM07_DEL_FLG = new String[] {""} ;
      T00143_n626TBM07_DEL_FLG = new boolean[] {false} ;
      T00143_A629TBM07_CRT_PROG_NM = new String[] {""} ;
      T00143_n629TBM07_CRT_PROG_NM = new boolean[] {false} ;
      T00143_A632TBM07_UPD_PROG_NM = new String[] {""} ;
      T00143_n632TBM07_UPD_PROG_NM = new boolean[] {false} ;
      T00143_A50TBM07_AUTH_CD = new String[] {""} ;
      sMode39 = "" ;
      T00147_A50TBM07_AUTH_CD = new String[] {""} ;
      T00148_A50TBM07_AUTH_CD = new String[] {""} ;
      T00142_A627TBM07_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00142_n627TBM07_CRT_DATETIME = new boolean[] {false} ;
      T00142_A628TBM07_CRT_USER_ID = new String[] {""} ;
      T00142_n628TBM07_CRT_USER_ID = new boolean[] {false} ;
      T00142_A630TBM07_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00142_n630TBM07_UPD_DATETIME = new boolean[] {false} ;
      T00142_A631TBM07_UPD_USER_ID = new String[] {""} ;
      T00142_n631TBM07_UPD_USER_ID = new boolean[] {false} ;
      T00142_A633TBM07_UPD_CNT = new long[1] ;
      T00142_n633TBM07_UPD_CNT = new boolean[] {false} ;
      T00142_A623TBM07_CRF_INP_AUTH_FLG = new String[] {""} ;
      T00142_n623TBM07_CRF_INP_AUTH_FLG = new boolean[] {false} ;
      T00142_A624TBM07_CRF_EDIT_AUTH_FLG = new String[] {""} ;
      T00142_n624TBM07_CRF_EDIT_AUTH_FLG = new boolean[] {false} ;
      T00142_A625TBM07_OTHER_SITE_VIEW_FLG = new String[] {""} ;
      T00142_n625TBM07_OTHER_SITE_VIEW_FLG = new boolean[] {false} ;
      T00142_A626TBM07_DEL_FLG = new String[] {""} ;
      T00142_n626TBM07_DEL_FLG = new boolean[] {false} ;
      T00142_A629TBM07_CRT_PROG_NM = new String[] {""} ;
      T00142_n629TBM07_CRT_PROG_NM = new boolean[] {false} ;
      T00142_A632TBM07_UPD_PROG_NM = new String[] {""} ;
      T00142_n632TBM07_UPD_PROG_NM = new boolean[] {false} ;
      T00142_A50TBM07_AUTH_CD = new String[] {""} ;
      T001412_A50TBM07_AUTH_CD = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      ZV9Pgmname = "" ;
      T001413_A50TBM07_AUTH_CD = new String[] {""} ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbm07_auth_behavior__default(),
         new Object[] {
             new Object[] {
            T00142_A627TBM07_CRT_DATETIME, T00142_n627TBM07_CRT_DATETIME, T00142_A628TBM07_CRT_USER_ID, T00142_n628TBM07_CRT_USER_ID, T00142_A630TBM07_UPD_DATETIME, T00142_n630TBM07_UPD_DATETIME, T00142_A631TBM07_UPD_USER_ID, T00142_n631TBM07_UPD_USER_ID, T00142_A633TBM07_UPD_CNT, T00142_n633TBM07_UPD_CNT,
            T00142_A623TBM07_CRF_INP_AUTH_FLG, T00142_n623TBM07_CRF_INP_AUTH_FLG, T00142_A624TBM07_CRF_EDIT_AUTH_FLG, T00142_n624TBM07_CRF_EDIT_AUTH_FLG, T00142_A625TBM07_OTHER_SITE_VIEW_FLG, T00142_n625TBM07_OTHER_SITE_VIEW_FLG, T00142_A626TBM07_DEL_FLG, T00142_n626TBM07_DEL_FLG, T00142_A629TBM07_CRT_PROG_NM, T00142_n629TBM07_CRT_PROG_NM,
            T00142_A632TBM07_UPD_PROG_NM, T00142_n632TBM07_UPD_PROG_NM, T00142_A50TBM07_AUTH_CD
            }
            , new Object[] {
            T00143_A627TBM07_CRT_DATETIME, T00143_n627TBM07_CRT_DATETIME, T00143_A628TBM07_CRT_USER_ID, T00143_n628TBM07_CRT_USER_ID, T00143_A630TBM07_UPD_DATETIME, T00143_n630TBM07_UPD_DATETIME, T00143_A631TBM07_UPD_USER_ID, T00143_n631TBM07_UPD_USER_ID, T00143_A633TBM07_UPD_CNT, T00143_n633TBM07_UPD_CNT,
            T00143_A623TBM07_CRF_INP_AUTH_FLG, T00143_n623TBM07_CRF_INP_AUTH_FLG, T00143_A624TBM07_CRF_EDIT_AUTH_FLG, T00143_n624TBM07_CRF_EDIT_AUTH_FLG, T00143_A625TBM07_OTHER_SITE_VIEW_FLG, T00143_n625TBM07_OTHER_SITE_VIEW_FLG, T00143_A626TBM07_DEL_FLG, T00143_n626TBM07_DEL_FLG, T00143_A629TBM07_CRT_PROG_NM, T00143_n629TBM07_CRT_PROG_NM,
            T00143_A632TBM07_UPD_PROG_NM, T00143_n632TBM07_UPD_PROG_NM, T00143_A50TBM07_AUTH_CD
            }
            , new Object[] {
            T00144_A50TBM07_AUTH_CD
            }
            , new Object[] {
            T00145_A627TBM07_CRT_DATETIME, T00145_n627TBM07_CRT_DATETIME, T00145_A628TBM07_CRT_USER_ID, T00145_n628TBM07_CRT_USER_ID, T00145_A630TBM07_UPD_DATETIME, T00145_n630TBM07_UPD_DATETIME, T00145_A631TBM07_UPD_USER_ID, T00145_n631TBM07_UPD_USER_ID, T00145_A633TBM07_UPD_CNT, T00145_n633TBM07_UPD_CNT,
            T00145_A623TBM07_CRF_INP_AUTH_FLG, T00145_n623TBM07_CRF_INP_AUTH_FLG, T00145_A624TBM07_CRF_EDIT_AUTH_FLG, T00145_n624TBM07_CRF_EDIT_AUTH_FLG, T00145_A625TBM07_OTHER_SITE_VIEW_FLG, T00145_n625TBM07_OTHER_SITE_VIEW_FLG, T00145_A626TBM07_DEL_FLG, T00145_n626TBM07_DEL_FLG, T00145_A629TBM07_CRT_PROG_NM, T00145_n629TBM07_CRT_PROG_NM,
            T00145_A632TBM07_UPD_PROG_NM, T00145_n632TBM07_UPD_PROG_NM, T00145_A50TBM07_AUTH_CD
            }
            , new Object[] {
            T00146_A50TBM07_AUTH_CD
            }
            , new Object[] {
            T00147_A50TBM07_AUTH_CD
            }
            , new Object[] {
            T00148_A50TBM07_AUTH_CD
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T001412_A50TBM07_AUTH_CD
            }
            , new Object[] {
            T001413_A50TBM07_AUTH_CD
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBM07_AUTH_BEHAVIOR" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound39 ;
   private short Gx_err ;
   private int trnEnded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int edtTBM07_AUTH_CD_Enabled ;
   private int edtTBM07_CRF_INP_AUTH_FLG_Enabled ;
   private int edtTBM07_CRF_EDIT_AUTH_FLG_Enabled ;
   private int edtTBM07_OTHER_SITE_VIEW_FLG_Enabled ;
   private int edtTBM07_DEL_FLG_Enabled ;
   private int edtTBM07_CRT_DATETIME_Enabled ;
   private int edtTBM07_CRT_USER_ID_Enabled ;
   private int edtTBM07_CRT_PROG_NM_Enabled ;
   private int edtTBM07_UPD_DATETIME_Enabled ;
   private int edtTBM07_UPD_USER_ID_Enabled ;
   private int edtTBM07_UPD_PROG_NM_Enabled ;
   private int edtTBM07_UPD_CNT_Enabled ;
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
   private long Z633TBM07_UPD_CNT ;
   private long O633TBM07_UPD_CNT ;
   private long A633TBM07_UPD_CNT ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTBM07_AUTH_CD_Internalname ;
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
   private String lblTextblocktbm07_auth_cd_Internalname ;
   private String lblTextblocktbm07_auth_cd_Jsonclick ;
   private String edtTBM07_AUTH_CD_Jsonclick ;
   private String lblTextblocktbm07_crf_inp_auth_flg_Internalname ;
   private String lblTextblocktbm07_crf_inp_auth_flg_Jsonclick ;
   private String edtTBM07_CRF_INP_AUTH_FLG_Internalname ;
   private String edtTBM07_CRF_INP_AUTH_FLG_Jsonclick ;
   private String lblTextblocktbm07_crf_edit_auth_flg_Internalname ;
   private String lblTextblocktbm07_crf_edit_auth_flg_Jsonclick ;
   private String edtTBM07_CRF_EDIT_AUTH_FLG_Internalname ;
   private String edtTBM07_CRF_EDIT_AUTH_FLG_Jsonclick ;
   private String lblTextblocktbm07_other_site_view_flg_Internalname ;
   private String lblTextblocktbm07_other_site_view_flg_Jsonclick ;
   private String edtTBM07_OTHER_SITE_VIEW_FLG_Internalname ;
   private String edtTBM07_OTHER_SITE_VIEW_FLG_Jsonclick ;
   private String lblTextblocktbm07_del_flg_Internalname ;
   private String lblTextblocktbm07_del_flg_Jsonclick ;
   private String edtTBM07_DEL_FLG_Internalname ;
   private String edtTBM07_DEL_FLG_Jsonclick ;
   private String lblTextblocktbm07_crt_datetime_Internalname ;
   private String lblTextblocktbm07_crt_datetime_Jsonclick ;
   private String edtTBM07_CRT_DATETIME_Internalname ;
   private String edtTBM07_CRT_DATETIME_Jsonclick ;
   private String lblTextblocktbm07_crt_user_id_Internalname ;
   private String lblTextblocktbm07_crt_user_id_Jsonclick ;
   private String edtTBM07_CRT_USER_ID_Internalname ;
   private String edtTBM07_CRT_USER_ID_Jsonclick ;
   private String lblTextblocktbm07_crt_prog_nm_Internalname ;
   private String lblTextblocktbm07_crt_prog_nm_Jsonclick ;
   private String edtTBM07_CRT_PROG_NM_Internalname ;
   private String edtTBM07_CRT_PROG_NM_Jsonclick ;
   private String lblTextblocktbm07_upd_datetime_Internalname ;
   private String lblTextblocktbm07_upd_datetime_Jsonclick ;
   private String edtTBM07_UPD_DATETIME_Internalname ;
   private String edtTBM07_UPD_DATETIME_Jsonclick ;
   private String lblTextblocktbm07_upd_user_id_Internalname ;
   private String lblTextblocktbm07_upd_user_id_Jsonclick ;
   private String edtTBM07_UPD_USER_ID_Internalname ;
   private String edtTBM07_UPD_USER_ID_Jsonclick ;
   private String lblTextblocktbm07_upd_prog_nm_Internalname ;
   private String lblTextblocktbm07_upd_prog_nm_Jsonclick ;
   private String edtTBM07_UPD_PROG_NM_Internalname ;
   private String edtTBM07_UPD_PROG_NM_Jsonclick ;
   private String lblTextblocktbm07_upd_cnt_Internalname ;
   private String lblTextblocktbm07_upd_cnt_Jsonclick ;
   private String edtTBM07_UPD_CNT_Internalname ;
   private String edtTBM07_UPD_CNT_Jsonclick ;
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
   private String sMode39 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String ZV9Pgmname ;
   private String Gx_emsg ;
   private java.util.Date Z627TBM07_CRT_DATETIME ;
   private java.util.Date Z630TBM07_UPD_DATETIME ;
   private java.util.Date A627TBM07_CRT_DATETIME ;
   private java.util.Date A630TBM07_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean wbErr ;
   private boolean n623TBM07_CRF_INP_AUTH_FLG ;
   private boolean n624TBM07_CRF_EDIT_AUTH_FLG ;
   private boolean n625TBM07_OTHER_SITE_VIEW_FLG ;
   private boolean n626TBM07_DEL_FLG ;
   private boolean n627TBM07_CRT_DATETIME ;
   private boolean n628TBM07_CRT_USER_ID ;
   private boolean n629TBM07_CRT_PROG_NM ;
   private boolean n630TBM07_UPD_DATETIME ;
   private boolean n631TBM07_UPD_USER_ID ;
   private boolean n632TBM07_UPD_PROG_NM ;
   private boolean n633TBM07_UPD_CNT ;
   private boolean Gx_longc ;
   private boolean toggleJsOutput ;
   private String Z50TBM07_AUTH_CD ;
   private String Z628TBM07_CRT_USER_ID ;
   private String Z631TBM07_UPD_USER_ID ;
   private String Z623TBM07_CRF_INP_AUTH_FLG ;
   private String Z624TBM07_CRF_EDIT_AUTH_FLG ;
   private String Z625TBM07_OTHER_SITE_VIEW_FLG ;
   private String Z626TBM07_DEL_FLG ;
   private String Z629TBM07_CRT_PROG_NM ;
   private String Z632TBM07_UPD_PROG_NM ;
   private String A50TBM07_AUTH_CD ;
   private String A623TBM07_CRF_INP_AUTH_FLG ;
   private String A624TBM07_CRF_EDIT_AUTH_FLG ;
   private String A625TBM07_OTHER_SITE_VIEW_FLG ;
   private String A626TBM07_DEL_FLG ;
   private String A628TBM07_CRT_USER_ID ;
   private String A629TBM07_CRT_PROG_NM ;
   private String A631TBM07_UPD_USER_ID ;
   private String A632TBM07_UPD_PROG_NM ;
   private String AV8W_BC_FLG ;
   private String AV7W_TXT ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] T00145_A627TBM07_CRT_DATETIME ;
   private boolean[] T00145_n627TBM07_CRT_DATETIME ;
   private String[] T00145_A628TBM07_CRT_USER_ID ;
   private boolean[] T00145_n628TBM07_CRT_USER_ID ;
   private java.util.Date[] T00145_A630TBM07_UPD_DATETIME ;
   private boolean[] T00145_n630TBM07_UPD_DATETIME ;
   private String[] T00145_A631TBM07_UPD_USER_ID ;
   private boolean[] T00145_n631TBM07_UPD_USER_ID ;
   private long[] T00145_A633TBM07_UPD_CNT ;
   private boolean[] T00145_n633TBM07_UPD_CNT ;
   private String[] T00145_A623TBM07_CRF_INP_AUTH_FLG ;
   private boolean[] T00145_n623TBM07_CRF_INP_AUTH_FLG ;
   private String[] T00145_A624TBM07_CRF_EDIT_AUTH_FLG ;
   private boolean[] T00145_n624TBM07_CRF_EDIT_AUTH_FLG ;
   private String[] T00145_A625TBM07_OTHER_SITE_VIEW_FLG ;
   private boolean[] T00145_n625TBM07_OTHER_SITE_VIEW_FLG ;
   private String[] T00145_A626TBM07_DEL_FLG ;
   private boolean[] T00145_n626TBM07_DEL_FLG ;
   private String[] T00145_A629TBM07_CRT_PROG_NM ;
   private boolean[] T00145_n629TBM07_CRT_PROG_NM ;
   private String[] T00145_A632TBM07_UPD_PROG_NM ;
   private boolean[] T00145_n632TBM07_UPD_PROG_NM ;
   private String[] T00145_A50TBM07_AUTH_CD ;
   private String[] T00144_A50TBM07_AUTH_CD ;
   private String[] T00146_A50TBM07_AUTH_CD ;
   private java.util.Date[] T00143_A627TBM07_CRT_DATETIME ;
   private boolean[] T00143_n627TBM07_CRT_DATETIME ;
   private String[] T00143_A628TBM07_CRT_USER_ID ;
   private boolean[] T00143_n628TBM07_CRT_USER_ID ;
   private java.util.Date[] T00143_A630TBM07_UPD_DATETIME ;
   private boolean[] T00143_n630TBM07_UPD_DATETIME ;
   private String[] T00143_A631TBM07_UPD_USER_ID ;
   private boolean[] T00143_n631TBM07_UPD_USER_ID ;
   private long[] T00143_A633TBM07_UPD_CNT ;
   private boolean[] T00143_n633TBM07_UPD_CNT ;
   private String[] T00143_A623TBM07_CRF_INP_AUTH_FLG ;
   private boolean[] T00143_n623TBM07_CRF_INP_AUTH_FLG ;
   private String[] T00143_A624TBM07_CRF_EDIT_AUTH_FLG ;
   private boolean[] T00143_n624TBM07_CRF_EDIT_AUTH_FLG ;
   private String[] T00143_A625TBM07_OTHER_SITE_VIEW_FLG ;
   private boolean[] T00143_n625TBM07_OTHER_SITE_VIEW_FLG ;
   private String[] T00143_A626TBM07_DEL_FLG ;
   private boolean[] T00143_n626TBM07_DEL_FLG ;
   private String[] T00143_A629TBM07_CRT_PROG_NM ;
   private boolean[] T00143_n629TBM07_CRT_PROG_NM ;
   private String[] T00143_A632TBM07_UPD_PROG_NM ;
   private boolean[] T00143_n632TBM07_UPD_PROG_NM ;
   private String[] T00143_A50TBM07_AUTH_CD ;
   private String[] T00147_A50TBM07_AUTH_CD ;
   private String[] T00148_A50TBM07_AUTH_CD ;
   private java.util.Date[] T00142_A627TBM07_CRT_DATETIME ;
   private boolean[] T00142_n627TBM07_CRT_DATETIME ;
   private String[] T00142_A628TBM07_CRT_USER_ID ;
   private boolean[] T00142_n628TBM07_CRT_USER_ID ;
   private java.util.Date[] T00142_A630TBM07_UPD_DATETIME ;
   private boolean[] T00142_n630TBM07_UPD_DATETIME ;
   private String[] T00142_A631TBM07_UPD_USER_ID ;
   private boolean[] T00142_n631TBM07_UPD_USER_ID ;
   private long[] T00142_A633TBM07_UPD_CNT ;
   private boolean[] T00142_n633TBM07_UPD_CNT ;
   private String[] T00142_A623TBM07_CRF_INP_AUTH_FLG ;
   private boolean[] T00142_n623TBM07_CRF_INP_AUTH_FLG ;
   private String[] T00142_A624TBM07_CRF_EDIT_AUTH_FLG ;
   private boolean[] T00142_n624TBM07_CRF_EDIT_AUTH_FLG ;
   private String[] T00142_A625TBM07_OTHER_SITE_VIEW_FLG ;
   private boolean[] T00142_n625TBM07_OTHER_SITE_VIEW_FLG ;
   private String[] T00142_A626TBM07_DEL_FLG ;
   private boolean[] T00142_n626TBM07_DEL_FLG ;
   private String[] T00142_A629TBM07_CRT_PROG_NM ;
   private boolean[] T00142_n629TBM07_CRT_PROG_NM ;
   private String[] T00142_A632TBM07_UPD_PROG_NM ;
   private boolean[] T00142_n632TBM07_UPD_PROG_NM ;
   private String[] T00142_A50TBM07_AUTH_CD ;
   private String[] T001412_A50TBM07_AUTH_CD ;
   private String[] T001413_A50TBM07_AUTH_CD ;
}

final  class tbm07_auth_behavior__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00142", "SELECT `TBM07_CRT_DATETIME`, `TBM07_CRT_USER_ID`, `TBM07_UPD_DATETIME`, `TBM07_UPD_USER_ID`, `TBM07_UPD_CNT`, `TBM07_CRF_INP_AUTH_FLG`, `TBM07_CRF_EDIT_AUTH_FLG`, `TBM07_OTHER_SITE_VIEW_FLG`, `TBM07_DEL_FLG`, `TBM07_CRT_PROG_NM`, `TBM07_UPD_PROG_NM`, `TBM07_AUTH_CD` AS TBM07_AUTH_CD FROM `TBM07_AUTH_BEHAVIOR` WHERE `TBM07_AUTH_CD` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00143", "SELECT `TBM07_CRT_DATETIME`, `TBM07_CRT_USER_ID`, `TBM07_UPD_DATETIME`, `TBM07_UPD_USER_ID`, `TBM07_UPD_CNT`, `TBM07_CRF_INP_AUTH_FLG`, `TBM07_CRF_EDIT_AUTH_FLG`, `TBM07_OTHER_SITE_VIEW_FLG`, `TBM07_DEL_FLG`, `TBM07_CRT_PROG_NM`, `TBM07_UPD_PROG_NM`, `TBM07_AUTH_CD` AS TBM07_AUTH_CD FROM `TBM07_AUTH_BEHAVIOR` WHERE `TBM07_AUTH_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00144", "SELECT `TAM04_AUTH_CD` AS TBM07_AUTH_CD FROM `TAM04_KNGN` WHERE `TAM04_AUTH_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00145", "SELECT TM1.`TBM07_CRT_DATETIME`, TM1.`TBM07_CRT_USER_ID`, TM1.`TBM07_UPD_DATETIME`, TM1.`TBM07_UPD_USER_ID`, TM1.`TBM07_UPD_CNT`, TM1.`TBM07_CRF_INP_AUTH_FLG`, TM1.`TBM07_CRF_EDIT_AUTH_FLG`, TM1.`TBM07_OTHER_SITE_VIEW_FLG`, TM1.`TBM07_DEL_FLG`, TM1.`TBM07_CRT_PROG_NM`, TM1.`TBM07_UPD_PROG_NM`, TM1.`TBM07_AUTH_CD` AS TBM07_AUTH_CD FROM `TBM07_AUTH_BEHAVIOR` TM1 WHERE TM1.`TBM07_AUTH_CD` = ? ORDER BY TM1.`TBM07_AUTH_CD` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T00146", "SELECT `TBM07_AUTH_CD` AS TBM07_AUTH_CD FROM `TBM07_AUTH_BEHAVIOR` WHERE `TBM07_AUTH_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00147", "SELECT `TBM07_AUTH_CD` AS TBM07_AUTH_CD FROM `TBM07_AUTH_BEHAVIOR` WHERE ( `TBM07_AUTH_CD` > ?) ORDER BY `TBM07_AUTH_CD`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T00148", "SELECT `TBM07_AUTH_CD` AS TBM07_AUTH_CD FROM `TBM07_AUTH_BEHAVIOR` WHERE ( `TBM07_AUTH_CD` < ?) ORDER BY `TBM07_AUTH_CD` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T00149", "INSERT INTO `TBM07_AUTH_BEHAVIOR`(`TBM07_CRT_DATETIME`, `TBM07_CRT_USER_ID`, `TBM07_UPD_DATETIME`, `TBM07_UPD_USER_ID`, `TBM07_UPD_CNT`, `TBM07_CRF_INP_AUTH_FLG`, `TBM07_CRF_EDIT_AUTH_FLG`, `TBM07_OTHER_SITE_VIEW_FLG`, `TBM07_DEL_FLG`, `TBM07_CRT_PROG_NM`, `TBM07_UPD_PROG_NM`, `TBM07_AUTH_CD`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T001410", "UPDATE `TBM07_AUTH_BEHAVIOR` SET `TBM07_CRT_DATETIME`=?, `TBM07_CRT_USER_ID`=?, `TBM07_UPD_DATETIME`=?, `TBM07_UPD_USER_ID`=?, `TBM07_UPD_CNT`=?, `TBM07_CRF_INP_AUTH_FLG`=?, `TBM07_CRF_EDIT_AUTH_FLG`=?, `TBM07_OTHER_SITE_VIEW_FLG`=?, `TBM07_DEL_FLG`=?, `TBM07_CRT_PROG_NM`=?, `TBM07_UPD_PROG_NM`=?  WHERE `TBM07_AUTH_CD` = ?", GX_NOMASK)
         ,new UpdateCursor("T001411", "DELETE FROM `TBM07_AUTH_BEHAVIOR`  WHERE `TBM07_AUTH_CD` = ?", GX_NOMASK)
         ,new ForEachCursor("T001412", "SELECT `TBM07_AUTH_CD` AS TBM07_AUTH_CD FROM `TBM07_AUTH_BEHAVIOR` ORDER BY `TBM07_AUTH_CD` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T001413", "SELECT `TAM04_AUTH_CD` AS TBM07_AUTH_CD FROM `TAM04_KNGN` WHERE `TAM04_AUTH_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(5) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(12) ;
               return;
            case 1 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(5) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(12) ;
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 3 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(5) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(12) ;
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
               return;
            case 11 :
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
                  stmt.setVarchar(10, (String)parms[19], 40);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[21], 40);
               }
               stmt.setVarchar(12, (String)parms[22], 2, false);
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
                  stmt.setVarchar(10, (String)parms[19], 40);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[21], 40);
               }
               stmt.setVarchar(12, (String)parms[22], 2, false);
               return;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
            case 11 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
      }
   }

}

