/*
               File: tbm11_image_impl
        Description: 画像マスタ
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:20:24.68
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbm11_image_impl extends GXWebPanel
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"TBM11_CRT_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx4asatbm11_crt_user_id0V30( Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel6"+"_"+"TBM11_UPD_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx6asatbm11_upd_user_id0V30( Gx_mode) ;
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
         Form.getMeta().addItem("description", "画像マスタ", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTBM11_IMAGE_CD_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Style2");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tbm11_image_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbm11_image_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbm11_image_impl.class ));
   }

   public tbm11_image_impl( int remoteHandle ,
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
         wb_table1_2_0V30( true) ;
      }
      return  ;
   }

   public void wb_table1_2_0V30e( boolean wbgen )
   {
      if ( wbgen )
      {
         renderHtmlCloseForm0V30( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void wb_table1_2_0V30( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableBorder100x100", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_0V30( true) ;
      }
      return  ;
   }

   public void wb_table2_5_0V30e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Control Group */
         GxWebStd.gx_group_start( httpContext, grpGroupdata_Internalname, "画像マスタ", 1, 0, "px", 0, "px", "Group", "", "HLP_TBM11_IMAGE.htm");
         wb_table3_28_0V30( true) ;
      }
      return  ;
   }

   public void wb_table3_28_0V30e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_0V30e( true) ;
      }
      else
      {
         wb_table1_2_0V30e( false) ;
      }
   }

   public void wb_table3_28_0V30( boolean wbgen )
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
         wb_table4_34_0V30( true) ;
      }
      return  ;
   }

   public void wb_table4_34_0V30e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 102,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBM11_IMAGE.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBM11_IMAGE.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBM11_IMAGE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_28_0V30e( true) ;
      }
      else
      {
         wb_table3_28_0V30e( false) ;
      }
   }

   public void wb_table4_34_0V30( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm11_image_cd_Internalname, "画像コード", "", "", lblTextblocktbm11_image_cd_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM11_IMAGE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM11_IMAGE_CD_Internalname, GXutil.rtrim( A62TBM11_IMAGE_CD), GXutil.rtrim( localUtil.format( A62TBM11_IMAGE_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM11_IMAGE_CD_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM11_IMAGE_CD_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_IMAGE_CD", "left", "HLP_TBM11_IMAGE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm11_image_nm_Internalname, "画像名", "", "", lblTextblocktbm11_image_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM11_IMAGE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM11_IMAGE_NM_Internalname, GXutil.rtrim( A634TBM11_IMAGE_NM), GXutil.rtrim( localUtil.format( A634TBM11_IMAGE_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM11_IMAGE_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM11_IMAGE_NM_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TBM11_IMAGE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm11_image_Internalname, "画像バイナリ", "", "", lblTextblocktbm11_image_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM11_IMAGE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         ClassString = "Image" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         edtTBM11_IMAGE_Filetype = "tmp" ;
         httpContext.ajax_rsp_assign_prop("", false, edtTBM11_IMAGE_Internalname, "Filetype", edtTBM11_IMAGE_Filetype);
         if ( ! (GXutil.strcmp("", A533TBM11_IMAGE)==0) )
         {
            gxblobfileaux.setSource( A533TBM11_IMAGE );
            if ( ! gxblobfileaux.hasExtension() || ( GXutil.strcmp(edtTBM11_IMAGE_Filetype, "tmp") != 0 ) )
            {
               gxblobfileaux.setExt(GXutil.trim( edtTBM11_IMAGE_Filetype));
            }
            if ( gxblobfileaux.getErrCode() == 0 )
            {
               A533TBM11_IMAGE = gxblobfileaux.getAbsoluteName() ;
               n533TBM11_IMAGE = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A533TBM11_IMAGE", A533TBM11_IMAGE);
               edtTBM11_IMAGE_Filetype = gxblobfileaux.getExtension() ;
               httpContext.ajax_rsp_assign_prop("", false, edtTBM11_IMAGE_Internalname, "Filetype", edtTBM11_IMAGE_Filetype);
               gxblobfileaux.setBlobToDelete();
            }
         }
         GxWebStd.gx_blob_field( httpContext, edtTBM11_IMAGE_Internalname, GXutil.rtrim( A533TBM11_IMAGE), httpContext.getResourceRelative(A533TBM11_IMAGE), ((GXutil.strcmp("", edtTBM11_IMAGE_Contenttype)==0) ? com.genexus.internet.HttpResponse.getContentType(((GXutil.strcmp("", edtTBM11_IMAGE_Filetype)==0) ? A533TBM11_IMAGE : edtTBM11_IMAGE_Filetype)) : edtTBM11_IMAGE_Contenttype), false, "", edtTBM11_IMAGE_Parameters, 0, edtTBM11_IMAGE_Enabled, 1, "", "", 0, -1, 250, "px", 60, "px", 0, 0, 0, edtTBM11_IMAGE_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", StyleString, ClassString, "", ""+TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(49);\"", "", "", "HLP_TBM11_IMAGE.htm");
         httpContext.ajax_rsp_assign_prop("", false, edtTBM11_IMAGE_Internalname, "URL", httpContext.getResourceRelative(A533TBM11_IMAGE));
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm11_file_name_Internalname, "取込時ファイル名", "", "", lblTextblocktbm11_file_name_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM11_IMAGE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM11_FILE_NAME_Internalname, GXutil.rtrim( A534TBM11_FILE_NAME), GXutil.rtrim( localUtil.format( A534TBM11_FILE_NAME, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM11_FILE_NAME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM11_FILE_NAME_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TBM11_IMAGE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm11_study_id_Internalname, "試験ID", "", "", lblTextblocktbm11_study_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM11_IMAGE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM11_STUDY_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A606TBM11_STUDY_ID, (byte)(10), (byte)(0), ".", "")), ((edtTBM11_STUDY_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A606TBM11_STUDY_ID), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A606TBM11_STUDY_ID), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM11_STUDY_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM11_STUDY_ID_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_STUDY_ID", "right", "HLP_TBM11_IMAGE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm11_del_flg_Internalname, "削除フラグ", "", "", lblTextblocktbm11_del_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM11_IMAGE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM11_DEL_FLG_Internalname, GXutil.rtrim( A535TBM11_DEL_FLG), GXutil.rtrim( localUtil.format( A535TBM11_DEL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM11_DEL_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM11_DEL_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TBM11_IMAGE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm11_crt_datetime_Internalname, "作成日時", "", "", lblTextblocktbm11_crt_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM11_IMAGE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTBM11_CRT_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM11_CRT_DATETIME_Internalname, localUtil.format(A536TBM11_CRT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A536TBM11_CRT_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM11_CRT_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM11_CRT_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TBM11_IMAGE.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBM11_CRT_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTBM11_CRT_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBM11_IMAGE.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm11_crt_user_id_Internalname, "作成ユーザーID", "", "", lblTextblocktbm11_crt_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM11_IMAGE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM11_CRT_USER_ID_Internalname, GXutil.rtrim( A537TBM11_CRT_USER_ID), GXutil.rtrim( localUtil.format( A537TBM11_CRT_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM11_CRT_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM11_CRT_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_USER_ID", "left", "HLP_TBM11_IMAGE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm11_crt_prog_nm_Internalname, "作成プログラム名", "", "", lblTextblocktbm11_crt_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM11_IMAGE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM11_CRT_PROG_NM_Internalname, GXutil.rtrim( A538TBM11_CRT_PROG_NM), GXutil.rtrim( localUtil.format( A538TBM11_CRT_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM11_CRT_PROG_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM11_CRT_PROG_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_PG_NM", "left", "HLP_TBM11_IMAGE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm11_upd_datetime_Internalname, "更新日時", "", "", lblTextblocktbm11_upd_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM11_IMAGE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTBM11_UPD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM11_UPD_DATETIME_Internalname, localUtil.format(A539TBM11_UPD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A539TBM11_UPD_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM11_UPD_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM11_UPD_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TBM11_IMAGE.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBM11_UPD_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTBM11_UPD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBM11_IMAGE.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm11_upd_user_id_Internalname, "更新ユーザーID", "", "", lblTextblocktbm11_upd_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM11_IMAGE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM11_UPD_USER_ID_Internalname, GXutil.rtrim( A540TBM11_UPD_USER_ID), GXutil.rtrim( localUtil.format( A540TBM11_UPD_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM11_UPD_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM11_UPD_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_USER_ID", "left", "HLP_TBM11_IMAGE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm11_upd_prog_nm_Internalname, "更新プログラム名", "", "", lblTextblocktbm11_upd_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM11_IMAGE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM11_UPD_PROG_NM_Internalname, GXutil.rtrim( A541TBM11_UPD_PROG_NM), GXutil.rtrim( localUtil.format( A541TBM11_UPD_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM11_UPD_PROG_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM11_UPD_PROG_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_PG_NM", "left", "HLP_TBM11_IMAGE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm11_upd_cnt_Internalname, "更新カウント", "", "", lblTextblocktbm11_upd_cnt_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM11_IMAGE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM11_UPD_CNT_Internalname, GXutil.ltrim( localUtil.ntoc( A542TBM11_UPD_CNT, (byte)(10), (byte)(0), ".", "")), ((edtTBM11_UPD_CNT_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A542TBM11_UPD_CNT), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A542TBM11_UPD_CNT), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM11_UPD_CNT_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM11_UPD_CNT_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_NO", "right", "HLP_TBM11_IMAGE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_34_0V30e( true) ;
      }
      else
      {
         wb_table4_34_0V30e( false) ;
      }
   }

   public void wb_table2_5_0V30( boolean wbgen )
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
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM11_IMAGE.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM11_IMAGE.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM11_IMAGE.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM11_IMAGE.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM11_IMAGE.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM11_IMAGE.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM11_IMAGE.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM11_IMAGE.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM11_IMAGE.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM11_IMAGE.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM11_IMAGE.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM11_IMAGE.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM11_IMAGE.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM11_IMAGE.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM11_IMAGE.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM11_IMAGE.htm");
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
         wb_table2_5_0V30e( true) ;
      }
      else
      {
         wb_table2_5_0V30e( false) ;
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
      /* Execute user event: e110V2 */
      e110V2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            A62TBM11_IMAGE_CD = httpContext.cgiGet( edtTBM11_IMAGE_CD_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A62TBM11_IMAGE_CD", A62TBM11_IMAGE_CD);
            A634TBM11_IMAGE_NM = httpContext.cgiGet( edtTBM11_IMAGE_NM_Internalname) ;
            n634TBM11_IMAGE_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A634TBM11_IMAGE_NM", A634TBM11_IMAGE_NM);
            n634TBM11_IMAGE_NM = ((GXutil.strcmp("", A634TBM11_IMAGE_NM)==0) ? true : false) ;
            A533TBM11_IMAGE = httpContext.cgiGet( edtTBM11_IMAGE_Internalname) ;
            n533TBM11_IMAGE = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A533TBM11_IMAGE", A533TBM11_IMAGE);
            n533TBM11_IMAGE = ((GXutil.strcmp("", A533TBM11_IMAGE)==0) ? true : false) ;
            A534TBM11_FILE_NAME = httpContext.cgiGet( edtTBM11_FILE_NAME_Internalname) ;
            n534TBM11_FILE_NAME = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A534TBM11_FILE_NAME", A534TBM11_FILE_NAME);
            n534TBM11_FILE_NAME = ((GXutil.strcmp("", A534TBM11_FILE_NAME)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM11_STUDY_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM11_STUDY_ID_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM11_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM11_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A606TBM11_STUDY_ID = 0 ;
               n606TBM11_STUDY_ID = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A606TBM11_STUDY_ID", GXutil.ltrim( GXutil.str( A606TBM11_STUDY_ID, 10, 0)));
            }
            else
            {
               A606TBM11_STUDY_ID = localUtil.ctol( httpContext.cgiGet( edtTBM11_STUDY_ID_Internalname), ".", ",") ;
               n606TBM11_STUDY_ID = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A606TBM11_STUDY_ID", GXutil.ltrim( GXutil.str( A606TBM11_STUDY_ID, 10, 0)));
            }
            n606TBM11_STUDY_ID = ((0==A606TBM11_STUDY_ID) ? true : false) ;
            A535TBM11_DEL_FLG = httpContext.cgiGet( edtTBM11_DEL_FLG_Internalname) ;
            n535TBM11_DEL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A535TBM11_DEL_FLG", A535TBM11_DEL_FLG);
            n535TBM11_DEL_FLG = ((GXutil.strcmp("", A535TBM11_DEL_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBM11_CRT_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TBM11_CRT_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM11_CRT_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A536TBM11_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n536TBM11_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A536TBM11_CRT_DATETIME", localUtil.ttoc( A536TBM11_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A536TBM11_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBM11_CRT_DATETIME_Internalname)) ;
               n536TBM11_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A536TBM11_CRT_DATETIME", localUtil.ttoc( A536TBM11_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n536TBM11_CRT_DATETIME = (GXutil.nullDate().equals(A536TBM11_CRT_DATETIME) ? true : false) ;
            A537TBM11_CRT_USER_ID = httpContext.cgiGet( edtTBM11_CRT_USER_ID_Internalname) ;
            n537TBM11_CRT_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A537TBM11_CRT_USER_ID", A537TBM11_CRT_USER_ID);
            n537TBM11_CRT_USER_ID = ((GXutil.strcmp("", A537TBM11_CRT_USER_ID)==0) ? true : false) ;
            A538TBM11_CRT_PROG_NM = httpContext.cgiGet( edtTBM11_CRT_PROG_NM_Internalname) ;
            n538TBM11_CRT_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A538TBM11_CRT_PROG_NM", A538TBM11_CRT_PROG_NM);
            n538TBM11_CRT_PROG_NM = ((GXutil.strcmp("", A538TBM11_CRT_PROG_NM)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBM11_UPD_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TBM11_UPD_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM11_UPD_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A539TBM11_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n539TBM11_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A539TBM11_UPD_DATETIME", localUtil.ttoc( A539TBM11_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A539TBM11_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBM11_UPD_DATETIME_Internalname)) ;
               n539TBM11_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A539TBM11_UPD_DATETIME", localUtil.ttoc( A539TBM11_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n539TBM11_UPD_DATETIME = (GXutil.nullDate().equals(A539TBM11_UPD_DATETIME) ? true : false) ;
            A540TBM11_UPD_USER_ID = httpContext.cgiGet( edtTBM11_UPD_USER_ID_Internalname) ;
            n540TBM11_UPD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A540TBM11_UPD_USER_ID", A540TBM11_UPD_USER_ID);
            n540TBM11_UPD_USER_ID = ((GXutil.strcmp("", A540TBM11_UPD_USER_ID)==0) ? true : false) ;
            A541TBM11_UPD_PROG_NM = httpContext.cgiGet( edtTBM11_UPD_PROG_NM_Internalname) ;
            n541TBM11_UPD_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A541TBM11_UPD_PROG_NM", A541TBM11_UPD_PROG_NM);
            n541TBM11_UPD_PROG_NM = ((GXutil.strcmp("", A541TBM11_UPD_PROG_NM)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM11_UPD_CNT_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM11_UPD_CNT_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM11_UPD_CNT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM11_UPD_CNT_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A542TBM11_UPD_CNT = 0 ;
               n542TBM11_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A542TBM11_UPD_CNT", GXutil.ltrim( GXutil.str( A542TBM11_UPD_CNT, 10, 0)));
            }
            else
            {
               A542TBM11_UPD_CNT = localUtil.ctol( httpContext.cgiGet( edtTBM11_UPD_CNT_Internalname), ".", ",") ;
               n542TBM11_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A542TBM11_UPD_CNT", GXutil.ltrim( GXutil.str( A542TBM11_UPD_CNT, 10, 0)));
            }
            n542TBM11_UPD_CNT = ((0==A542TBM11_UPD_CNT) ? true : false) ;
            /* Read saved values. */
            Z62TBM11_IMAGE_CD = httpContext.cgiGet( "Z62TBM11_IMAGE_CD") ;
            Z536TBM11_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z536TBM11_CRT_DATETIME"), 0) ;
            n536TBM11_CRT_DATETIME = (GXutil.nullDate().equals(A536TBM11_CRT_DATETIME) ? true : false) ;
            Z537TBM11_CRT_USER_ID = httpContext.cgiGet( "Z537TBM11_CRT_USER_ID") ;
            n537TBM11_CRT_USER_ID = ((GXutil.strcmp("", A537TBM11_CRT_USER_ID)==0) ? true : false) ;
            Z539TBM11_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z539TBM11_UPD_DATETIME"), 0) ;
            n539TBM11_UPD_DATETIME = (GXutil.nullDate().equals(A539TBM11_UPD_DATETIME) ? true : false) ;
            Z540TBM11_UPD_USER_ID = httpContext.cgiGet( "Z540TBM11_UPD_USER_ID") ;
            n540TBM11_UPD_USER_ID = ((GXutil.strcmp("", A540TBM11_UPD_USER_ID)==0) ? true : false) ;
            Z542TBM11_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z542TBM11_UPD_CNT"), ".", ",") ;
            n542TBM11_UPD_CNT = ((0==A542TBM11_UPD_CNT) ? true : false) ;
            Z634TBM11_IMAGE_NM = httpContext.cgiGet( "Z634TBM11_IMAGE_NM") ;
            n634TBM11_IMAGE_NM = ((GXutil.strcmp("", A634TBM11_IMAGE_NM)==0) ? true : false) ;
            Z534TBM11_FILE_NAME = httpContext.cgiGet( "Z534TBM11_FILE_NAME") ;
            n534TBM11_FILE_NAME = ((GXutil.strcmp("", A534TBM11_FILE_NAME)==0) ? true : false) ;
            Z606TBM11_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "Z606TBM11_STUDY_ID"), ".", ",") ;
            n606TBM11_STUDY_ID = ((0==A606TBM11_STUDY_ID) ? true : false) ;
            Z535TBM11_DEL_FLG = httpContext.cgiGet( "Z535TBM11_DEL_FLG") ;
            n535TBM11_DEL_FLG = ((GXutil.strcmp("", A535TBM11_DEL_FLG)==0) ? true : false) ;
            Z538TBM11_CRT_PROG_NM = httpContext.cgiGet( "Z538TBM11_CRT_PROG_NM") ;
            n538TBM11_CRT_PROG_NM = ((GXutil.strcmp("", A538TBM11_CRT_PROG_NM)==0) ? true : false) ;
            Z541TBM11_UPD_PROG_NM = httpContext.cgiGet( "Z541TBM11_UPD_PROG_NM") ;
            n541TBM11_UPD_PROG_NM = ((GXutil.strcmp("", A541TBM11_UPD_PROG_NM)==0) ? true : false) ;
            O542TBM11_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "O542TBM11_UPD_CNT"), ".", ",") ;
            n542TBM11_UPD_CNT = ((0==A542TBM11_UPD_CNT) ? true : false) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ".", ",")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ".", ",")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV9Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            edtTBM11_IMAGE_Filename = httpContext.cgiGet( "TBM11_IMAGE_Filename") ;
            edtTBM11_IMAGE_Filetype = httpContext.cgiGet( "TBM11_IMAGE_Filetype") ;
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            if ( ! (GXutil.strcmp("", A533TBM11_IMAGE)==0) )
            {
               edtTBM11_IMAGE_Filename = httpContext.cgiGetFileName( edtTBM11_IMAGE_Internalname) ;
               edtTBM11_IMAGE_Filetype = httpContext.cgiGetFileType( edtTBM11_IMAGE_Internalname) ;
            }
            if ( (GXutil.strcmp("", A533TBM11_IMAGE)==0) )
            {
               GXCCtlgxBlob = "TBM11_IMAGE" + "_gxBlob" ;
               A533TBM11_IMAGE = httpContext.cgiGet( GXCCtlgxBlob) ;
               n533TBM11_IMAGE = false ;
               n533TBM11_IMAGE = ((GXutil.strcmp("", A533TBM11_IMAGE)==0) ? true : false) ;
            }
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
               A62TBM11_IMAGE_CD = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A62TBM11_IMAGE_CD", A62TBM11_IMAGE_CD);
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
                     /* Execute user event: e110V2 */
                     e110V2 ();
                  }
                  else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     dynload_actions( ) ;
                     /* Execute user event: e120V2 */
                     e120V2 ();
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
         /* Execute user event: e120V2 */
         e120V2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll0V30( ) ;
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
      disableAttributes0V30( ) ;
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

   public void resetCaption0V0( )
   {
   }

   public void e110V2( )
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

   public void e120V2( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV9Pgmname) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      AV7W_TXT = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + "画像コード:" + A62TBM11_IMAGE_CD + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A634TBM11_IMAGE_NM + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A534TBM11_FILE_NAME + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A606TBM11_STUDY_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A535TBM11_DEL_FLG + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A536TBM11_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm11_image_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A536TBM11_CRT_DATETIME", localUtil.ttoc( A536TBM11_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A537TBM11_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A538TBM11_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A539TBM11_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm11_image_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A539TBM11_UPD_DATETIME", localUtil.ttoc( A539TBM11_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A540TBM11_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A541TBM11_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A542TBM11_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
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

   public void zm0V30( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z536TBM11_CRT_DATETIME = T000V3_A536TBM11_CRT_DATETIME[0] ;
            Z537TBM11_CRT_USER_ID = T000V3_A537TBM11_CRT_USER_ID[0] ;
            Z539TBM11_UPD_DATETIME = T000V3_A539TBM11_UPD_DATETIME[0] ;
            Z540TBM11_UPD_USER_ID = T000V3_A540TBM11_UPD_USER_ID[0] ;
            Z542TBM11_UPD_CNT = T000V3_A542TBM11_UPD_CNT[0] ;
            Z634TBM11_IMAGE_NM = T000V3_A634TBM11_IMAGE_NM[0] ;
            Z534TBM11_FILE_NAME = T000V3_A534TBM11_FILE_NAME[0] ;
            Z606TBM11_STUDY_ID = T000V3_A606TBM11_STUDY_ID[0] ;
            Z535TBM11_DEL_FLG = T000V3_A535TBM11_DEL_FLG[0] ;
            Z538TBM11_CRT_PROG_NM = T000V3_A538TBM11_CRT_PROG_NM[0] ;
            Z541TBM11_UPD_PROG_NM = T000V3_A541TBM11_UPD_PROG_NM[0] ;
         }
         else
         {
            Z536TBM11_CRT_DATETIME = A536TBM11_CRT_DATETIME ;
            Z537TBM11_CRT_USER_ID = A537TBM11_CRT_USER_ID ;
            Z539TBM11_UPD_DATETIME = A539TBM11_UPD_DATETIME ;
            Z540TBM11_UPD_USER_ID = A540TBM11_UPD_USER_ID ;
            Z542TBM11_UPD_CNT = A542TBM11_UPD_CNT ;
            Z634TBM11_IMAGE_NM = A634TBM11_IMAGE_NM ;
            Z534TBM11_FILE_NAME = A534TBM11_FILE_NAME ;
            Z606TBM11_STUDY_ID = A606TBM11_STUDY_ID ;
            Z535TBM11_DEL_FLG = A535TBM11_DEL_FLG ;
            Z538TBM11_CRT_PROG_NM = A538TBM11_CRT_PROG_NM ;
            Z541TBM11_UPD_PROG_NM = A541TBM11_UPD_PROG_NM ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z62TBM11_IMAGE_CD = A62TBM11_IMAGE_CD ;
         Z536TBM11_CRT_DATETIME = A536TBM11_CRT_DATETIME ;
         Z537TBM11_CRT_USER_ID = A537TBM11_CRT_USER_ID ;
         Z539TBM11_UPD_DATETIME = A539TBM11_UPD_DATETIME ;
         Z540TBM11_UPD_USER_ID = A540TBM11_UPD_USER_ID ;
         Z542TBM11_UPD_CNT = A542TBM11_UPD_CNT ;
         Z634TBM11_IMAGE_NM = A634TBM11_IMAGE_NM ;
         Z533TBM11_IMAGE = A533TBM11_IMAGE ;
         Z534TBM11_FILE_NAME = A534TBM11_FILE_NAME ;
         Z606TBM11_STUDY_ID = A606TBM11_STUDY_ID ;
         Z535TBM11_DEL_FLG = A535TBM11_DEL_FLG ;
         Z538TBM11_CRT_PROG_NM = A538TBM11_CRT_PROG_NM ;
         Z541TBM11_UPD_PROG_NM = A541TBM11_UPD_PROG_NM ;
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

   public void load0V30( )
   {
      /* Using cursor T000V4 */
      pr_default.execute(2, new Object[] {A62TBM11_IMAGE_CD});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound30 = (short)(1) ;
         A536TBM11_CRT_DATETIME = T000V4_A536TBM11_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A536TBM11_CRT_DATETIME", localUtil.ttoc( A536TBM11_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n536TBM11_CRT_DATETIME = T000V4_n536TBM11_CRT_DATETIME[0] ;
         A537TBM11_CRT_USER_ID = T000V4_A537TBM11_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A537TBM11_CRT_USER_ID", A537TBM11_CRT_USER_ID);
         n537TBM11_CRT_USER_ID = T000V4_n537TBM11_CRT_USER_ID[0] ;
         A539TBM11_UPD_DATETIME = T000V4_A539TBM11_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A539TBM11_UPD_DATETIME", localUtil.ttoc( A539TBM11_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n539TBM11_UPD_DATETIME = T000V4_n539TBM11_UPD_DATETIME[0] ;
         A540TBM11_UPD_USER_ID = T000V4_A540TBM11_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A540TBM11_UPD_USER_ID", A540TBM11_UPD_USER_ID);
         n540TBM11_UPD_USER_ID = T000V4_n540TBM11_UPD_USER_ID[0] ;
         A542TBM11_UPD_CNT = T000V4_A542TBM11_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A542TBM11_UPD_CNT", GXutil.ltrim( GXutil.str( A542TBM11_UPD_CNT, 10, 0)));
         n542TBM11_UPD_CNT = T000V4_n542TBM11_UPD_CNT[0] ;
         A634TBM11_IMAGE_NM = T000V4_A634TBM11_IMAGE_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A634TBM11_IMAGE_NM", A634TBM11_IMAGE_NM);
         n634TBM11_IMAGE_NM = T000V4_n634TBM11_IMAGE_NM[0] ;
         A533TBM11_IMAGE = T000V4_A533TBM11_IMAGE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A533TBM11_IMAGE", A533TBM11_IMAGE);
         n533TBM11_IMAGE = T000V4_n533TBM11_IMAGE[0] ;
         A534TBM11_FILE_NAME = T000V4_A534TBM11_FILE_NAME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A534TBM11_FILE_NAME", A534TBM11_FILE_NAME);
         n534TBM11_FILE_NAME = T000V4_n534TBM11_FILE_NAME[0] ;
         A606TBM11_STUDY_ID = T000V4_A606TBM11_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A606TBM11_STUDY_ID", GXutil.ltrim( GXutil.str( A606TBM11_STUDY_ID, 10, 0)));
         n606TBM11_STUDY_ID = T000V4_n606TBM11_STUDY_ID[0] ;
         A535TBM11_DEL_FLG = T000V4_A535TBM11_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A535TBM11_DEL_FLG", A535TBM11_DEL_FLG);
         n535TBM11_DEL_FLG = T000V4_n535TBM11_DEL_FLG[0] ;
         A538TBM11_CRT_PROG_NM = T000V4_A538TBM11_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A538TBM11_CRT_PROG_NM", A538TBM11_CRT_PROG_NM);
         n538TBM11_CRT_PROG_NM = T000V4_n538TBM11_CRT_PROG_NM[0] ;
         A541TBM11_UPD_PROG_NM = T000V4_A541TBM11_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A541TBM11_UPD_PROG_NM", A541TBM11_UPD_PROG_NM);
         n541TBM11_UPD_PROG_NM = T000V4_n541TBM11_UPD_PROG_NM[0] ;
         zm0V30( -8) ;
      }
      pr_default.close(2);
      onLoadActions0V30( ) ;
   }

   public void onLoadActions0V30( )
   {
      AV9Pgmname = "TBM11_IMAGE" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
   }

   public void checkExtendedTable0V30( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV9Pgmname = "TBM11_IMAGE" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      if ( ! ( GXutil.nullDate().equals(A536TBM11_CRT_DATETIME) || (( A536TBM11_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A536TBM11_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "TBM11_CRT_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM11_CRT_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( GXutil.nullDate().equals(A539TBM11_UPD_DATETIME) || (( A539TBM11_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A539TBM11_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "TBM11_UPD_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM11_UPD_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors0V30( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey0V30( )
   {
      /* Using cursor T000V5 */
      pr_default.execute(3, new Object[] {A62TBM11_IMAGE_CD});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound30 = (short)(1) ;
      }
      else
      {
         RcdFound30 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000V3 */
      pr_default.execute(1, new Object[] {A62TBM11_IMAGE_CD});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0V30( 8) ;
         RcdFound30 = (short)(1) ;
         A62TBM11_IMAGE_CD = T000V3_A62TBM11_IMAGE_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A62TBM11_IMAGE_CD", A62TBM11_IMAGE_CD);
         A536TBM11_CRT_DATETIME = T000V3_A536TBM11_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A536TBM11_CRT_DATETIME", localUtil.ttoc( A536TBM11_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n536TBM11_CRT_DATETIME = T000V3_n536TBM11_CRT_DATETIME[0] ;
         A537TBM11_CRT_USER_ID = T000V3_A537TBM11_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A537TBM11_CRT_USER_ID", A537TBM11_CRT_USER_ID);
         n537TBM11_CRT_USER_ID = T000V3_n537TBM11_CRT_USER_ID[0] ;
         A539TBM11_UPD_DATETIME = T000V3_A539TBM11_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A539TBM11_UPD_DATETIME", localUtil.ttoc( A539TBM11_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n539TBM11_UPD_DATETIME = T000V3_n539TBM11_UPD_DATETIME[0] ;
         A540TBM11_UPD_USER_ID = T000V3_A540TBM11_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A540TBM11_UPD_USER_ID", A540TBM11_UPD_USER_ID);
         n540TBM11_UPD_USER_ID = T000V3_n540TBM11_UPD_USER_ID[0] ;
         A542TBM11_UPD_CNT = T000V3_A542TBM11_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A542TBM11_UPD_CNT", GXutil.ltrim( GXutil.str( A542TBM11_UPD_CNT, 10, 0)));
         n542TBM11_UPD_CNT = T000V3_n542TBM11_UPD_CNT[0] ;
         A634TBM11_IMAGE_NM = T000V3_A634TBM11_IMAGE_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A634TBM11_IMAGE_NM", A634TBM11_IMAGE_NM);
         n634TBM11_IMAGE_NM = T000V3_n634TBM11_IMAGE_NM[0] ;
         A533TBM11_IMAGE = T000V3_A533TBM11_IMAGE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A533TBM11_IMAGE", A533TBM11_IMAGE);
         n533TBM11_IMAGE = T000V3_n533TBM11_IMAGE[0] ;
         A534TBM11_FILE_NAME = T000V3_A534TBM11_FILE_NAME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A534TBM11_FILE_NAME", A534TBM11_FILE_NAME);
         n534TBM11_FILE_NAME = T000V3_n534TBM11_FILE_NAME[0] ;
         A606TBM11_STUDY_ID = T000V3_A606TBM11_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A606TBM11_STUDY_ID", GXutil.ltrim( GXutil.str( A606TBM11_STUDY_ID, 10, 0)));
         n606TBM11_STUDY_ID = T000V3_n606TBM11_STUDY_ID[0] ;
         A535TBM11_DEL_FLG = T000V3_A535TBM11_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A535TBM11_DEL_FLG", A535TBM11_DEL_FLG);
         n535TBM11_DEL_FLG = T000V3_n535TBM11_DEL_FLG[0] ;
         A538TBM11_CRT_PROG_NM = T000V3_A538TBM11_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A538TBM11_CRT_PROG_NM", A538TBM11_CRT_PROG_NM);
         n538TBM11_CRT_PROG_NM = T000V3_n538TBM11_CRT_PROG_NM[0] ;
         A541TBM11_UPD_PROG_NM = T000V3_A541TBM11_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A541TBM11_UPD_PROG_NM", A541TBM11_UPD_PROG_NM);
         n541TBM11_UPD_PROG_NM = T000V3_n541TBM11_UPD_PROG_NM[0] ;
         O542TBM11_UPD_CNT = A542TBM11_UPD_CNT ;
         n542TBM11_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A542TBM11_UPD_CNT", GXutil.ltrim( GXutil.str( A542TBM11_UPD_CNT, 10, 0)));
         Z62TBM11_IMAGE_CD = A62TBM11_IMAGE_CD ;
         sMode30 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load0V30( ) ;
         if ( AnyError == 1 )
         {
            RcdFound30 = (short)(0) ;
            initializeNonKey0V30( ) ;
         }
         Gx_mode = sMode30 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound30 = (short)(0) ;
         initializeNonKey0V30( ) ;
         sMode30 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode30 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0V30( ) ;
      if ( RcdFound30 == 0 )
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
      RcdFound30 = (short)(0) ;
      /* Using cursor T000V6 */
      pr_default.execute(4, new Object[] {A62TBM11_IMAGE_CD});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T000V6_A62TBM11_IMAGE_CD[0], A62TBM11_IMAGE_CD) < 0 ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T000V6_A62TBM11_IMAGE_CD[0], A62TBM11_IMAGE_CD) > 0 ) ) )
         {
            A62TBM11_IMAGE_CD = T000V6_A62TBM11_IMAGE_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A62TBM11_IMAGE_CD", A62TBM11_IMAGE_CD);
            RcdFound30 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound30 = (short)(0) ;
      /* Using cursor T000V7 */
      pr_default.execute(5, new Object[] {A62TBM11_IMAGE_CD});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T000V7_A62TBM11_IMAGE_CD[0], A62TBM11_IMAGE_CD) > 0 ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T000V7_A62TBM11_IMAGE_CD[0], A62TBM11_IMAGE_CD) < 0 ) ) )
         {
            A62TBM11_IMAGE_CD = T000V7_A62TBM11_IMAGE_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A62TBM11_IMAGE_CD", A62TBM11_IMAGE_CD);
            RcdFound30 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0V30( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtTBM11_IMAGE_CD_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert0V30( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound30 == 1 )
         {
            if ( GXutil.strcmp(A62TBM11_IMAGE_CD, Z62TBM11_IMAGE_CD) != 0 )
            {
               A62TBM11_IMAGE_CD = Z62TBM11_IMAGE_CD ;
               httpContext.ajax_rsp_assign_attri("", false, "A62TBM11_IMAGE_CD", A62TBM11_IMAGE_CD);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TBM11_IMAGE_CD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM11_IMAGE_CD_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTBM11_IMAGE_CD_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update0V30( ) ;
               GX_FocusControl = edtTBM11_IMAGE_CD_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( GXutil.strcmp(A62TBM11_IMAGE_CD, Z62TBM11_IMAGE_CD) != 0 )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTBM11_IMAGE_CD_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert0V30( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TBM11_IMAGE_CD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTBM11_IMAGE_CD_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtTBM11_IMAGE_CD_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert0V30( ) ;
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
      if ( GXutil.strcmp(A62TBM11_IMAGE_CD, Z62TBM11_IMAGE_CD) != 0 )
      {
         A62TBM11_IMAGE_CD = Z62TBM11_IMAGE_CD ;
         httpContext.ajax_rsp_assign_attri("", false, "A62TBM11_IMAGE_CD", A62TBM11_IMAGE_CD);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TBM11_IMAGE_CD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM11_IMAGE_CD_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTBM11_IMAGE_CD_Internalname ;
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
      if ( RcdFound30 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TBM11_IMAGE_CD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM11_IMAGE_CD_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtTBM11_IMAGE_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart0V30( ) ;
      if ( RcdFound30 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM11_IMAGE_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0V30( ) ;
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
      if ( RcdFound30 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM11_IMAGE_NM_Internalname ;
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
      if ( RcdFound30 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM11_IMAGE_NM_Internalname ;
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
      scanStart0V30( ) ;
      if ( RcdFound30 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound30 != 0 )
         {
            scanNext0V30( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM11_IMAGE_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0V30( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency0V30( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000V2 */
         pr_default.execute(0, new Object[] {A62TBM11_IMAGE_CD});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM11_IMAGE"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z536TBM11_CRT_DATETIME.equals( T000V2_A536TBM11_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z537TBM11_CRT_USER_ID, T000V2_A537TBM11_CRT_USER_ID[0]) != 0 ) || !( Z539TBM11_UPD_DATETIME.equals( T000V2_A539TBM11_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z540TBM11_UPD_USER_ID, T000V2_A540TBM11_UPD_USER_ID[0]) != 0 ) || ( Z542TBM11_UPD_CNT != T000V2_A542TBM11_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z634TBM11_IMAGE_NM, T000V2_A634TBM11_IMAGE_NM[0]) != 0 ) || ( GXutil.strcmp(Z534TBM11_FILE_NAME, T000V2_A534TBM11_FILE_NAME[0]) != 0 ) || ( Z606TBM11_STUDY_ID != T000V2_A606TBM11_STUDY_ID[0] ) || ( GXutil.strcmp(Z535TBM11_DEL_FLG, T000V2_A535TBM11_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z538TBM11_CRT_PROG_NM, T000V2_A538TBM11_CRT_PROG_NM[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z541TBM11_UPD_PROG_NM, T000V2_A541TBM11_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBM11_IMAGE"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0V30( )
   {
      beforeValidate0V30( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0V30( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0V30( 0) ;
         checkOptimisticConcurrency0V30( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0V30( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0V30( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000V8 */
                  pr_default.execute(6, new Object[] {A62TBM11_IMAGE_CD, new Boolean(n536TBM11_CRT_DATETIME), A536TBM11_CRT_DATETIME, new Boolean(n537TBM11_CRT_USER_ID), A537TBM11_CRT_USER_ID, new Boolean(n539TBM11_UPD_DATETIME), A539TBM11_UPD_DATETIME, new Boolean(n540TBM11_UPD_USER_ID), A540TBM11_UPD_USER_ID, new Boolean(n542TBM11_UPD_CNT), new Long(A542TBM11_UPD_CNT), new Boolean(n634TBM11_IMAGE_NM), A634TBM11_IMAGE_NM, new Boolean(n533TBM11_IMAGE), A533TBM11_IMAGE, new Boolean(n534TBM11_FILE_NAME), A534TBM11_FILE_NAME, new Boolean(n606TBM11_STUDY_ID), new Long(A606TBM11_STUDY_ID), new Boolean(n535TBM11_DEL_FLG), A535TBM11_DEL_FLG, new Boolean(n538TBM11_CRT_PROG_NM), A538TBM11_CRT_PROG_NM, new Boolean(n541TBM11_UPD_PROG_NM), A541TBM11_UPD_PROG_NM});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM11_IMAGE") ;
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
                        resetCaption0V0( ) ;
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
            load0V30( ) ;
         }
         endLevel0V30( ) ;
      }
      closeExtendedTableCursors0V30( ) ;
   }

   public void update0V30( )
   {
      beforeValidate0V30( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0V30( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0V30( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0V30( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0V30( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000V9 */
                  pr_default.execute(7, new Object[] {new Boolean(n536TBM11_CRT_DATETIME), A536TBM11_CRT_DATETIME, new Boolean(n537TBM11_CRT_USER_ID), A537TBM11_CRT_USER_ID, new Boolean(n539TBM11_UPD_DATETIME), A539TBM11_UPD_DATETIME, new Boolean(n540TBM11_UPD_USER_ID), A540TBM11_UPD_USER_ID, new Boolean(n542TBM11_UPD_CNT), new Long(A542TBM11_UPD_CNT), new Boolean(n634TBM11_IMAGE_NM), A634TBM11_IMAGE_NM, new Boolean(n534TBM11_FILE_NAME), A534TBM11_FILE_NAME, new Boolean(n606TBM11_STUDY_ID), new Long(A606TBM11_STUDY_ID), new Boolean(n535TBM11_DEL_FLG), A535TBM11_DEL_FLG, new Boolean(n538TBM11_CRT_PROG_NM), A538TBM11_CRT_PROG_NM, new Boolean(n541TBM11_UPD_PROG_NM), A541TBM11_UPD_PROG_NM, A62TBM11_IMAGE_CD});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM11_IMAGE") ;
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM11_IMAGE"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0V30( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "", true);
                        resetCaption0V0( ) ;
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
         endLevel0V30( ) ;
      }
      closeExtendedTableCursors0V30( ) ;
   }

   public void deferredUpdate0V30( )
   {
      if ( AnyError == 0 )
      {
         /* Using cursor T000V10 */
         pr_default.execute(8, new Object[] {new Boolean(n533TBM11_IMAGE), A533TBM11_IMAGE, A62TBM11_IMAGE_CD});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM11_IMAGE") ;
      }
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate0V30( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0V30( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0V30( ) ;
         afterConfirm0V30( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0V30( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000V11 */
               pr_default.execute(9, new Object[] {A62TBM11_IMAGE_CD});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM11_IMAGE") ;
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound30 == 0 )
                     {
                        initAll0V30( ) ;
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
                     resetCaption0V0( ) ;
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
      sMode30 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel0V30( ) ;
      Gx_mode = sMode30 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls0V30( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBM11_IMAGE" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      }
   }

   public void endLevel0V30( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0V30( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "tbm11_image");
         if ( AnyError == 0 )
         {
            confirmValues0V0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "tbm11_image");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0V30( )
   {
      /* Scan By routine */
      /* Using cursor T000V12 */
      pr_default.execute(10);
      RcdFound30 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound30 = (short)(1) ;
         A62TBM11_IMAGE_CD = T000V12_A62TBM11_IMAGE_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A62TBM11_IMAGE_CD", A62TBM11_IMAGE_CD);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0V30( )
   {
      /* Scan next routine */
      pr_default.readNext(10);
      RcdFound30 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound30 = (short)(1) ;
         A62TBM11_IMAGE_CD = T000V12_A62TBM11_IMAGE_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A62TBM11_IMAGE_CD", A62TBM11_IMAGE_CD);
      }
   }

   public void scanEnd0V30( )
   {
      pr_default.close(10);
   }

   public void afterConfirm0V30( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0V30( )
   {
      /* Before Insert Rules */
      A536TBM11_CRT_DATETIME = GXutil.now( ) ;
      n536TBM11_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A536TBM11_CRT_DATETIME", localUtil.ttoc( A536TBM11_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A537TBM11_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm11_image_impl.this.GXt_char1 = GXv_char2[0] ;
      A537TBM11_CRT_USER_ID = GXt_char1 ;
      n537TBM11_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A537TBM11_CRT_USER_ID", A537TBM11_CRT_USER_ID);
      A539TBM11_UPD_DATETIME = GXutil.now( ) ;
      n539TBM11_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A539TBM11_UPD_DATETIME", localUtil.ttoc( A539TBM11_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A540TBM11_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm11_image_impl.this.GXt_char1 = GXv_char2[0] ;
      A540TBM11_UPD_USER_ID = GXt_char1 ;
      n540TBM11_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A540TBM11_UPD_USER_ID", A540TBM11_UPD_USER_ID);
      A542TBM11_UPD_CNT = (long)(O542TBM11_UPD_CNT+1) ;
      n542TBM11_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A542TBM11_UPD_CNT", GXutil.ltrim( GXutil.str( A542TBM11_UPD_CNT, 10, 0)));
   }

   public void beforeUpdate0V30( )
   {
      /* Before Update Rules */
      A539TBM11_UPD_DATETIME = GXutil.now( ) ;
      n539TBM11_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A539TBM11_UPD_DATETIME", localUtil.ttoc( A539TBM11_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A540TBM11_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm11_image_impl.this.GXt_char1 = GXv_char2[0] ;
      A540TBM11_UPD_USER_ID = GXt_char1 ;
      n540TBM11_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A540TBM11_UPD_USER_ID", A540TBM11_UPD_USER_ID);
      A542TBM11_UPD_CNT = (long)(O542TBM11_UPD_CNT+1) ;
      n542TBM11_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A542TBM11_UPD_CNT", GXutil.ltrim( GXutil.str( A542TBM11_UPD_CNT, 10, 0)));
   }

   public void beforeDelete0V30( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0V30( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0V30( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0V30( )
   {
      edtTBM11_IMAGE_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM11_IMAGE_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM11_IMAGE_CD_Enabled, 5, 0)));
      edtTBM11_IMAGE_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM11_IMAGE_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM11_IMAGE_NM_Enabled, 5, 0)));
      edtTBM11_IMAGE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM11_IMAGE_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM11_IMAGE_Enabled, 5, 0)));
      edtTBM11_FILE_NAME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM11_FILE_NAME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM11_FILE_NAME_Enabled, 5, 0)));
      edtTBM11_STUDY_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM11_STUDY_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM11_STUDY_ID_Enabled, 5, 0)));
      edtTBM11_DEL_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM11_DEL_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM11_DEL_FLG_Enabled, 5, 0)));
      edtTBM11_CRT_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM11_CRT_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM11_CRT_DATETIME_Enabled, 5, 0)));
      edtTBM11_CRT_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM11_CRT_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM11_CRT_USER_ID_Enabled, 5, 0)));
      edtTBM11_CRT_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM11_CRT_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM11_CRT_PROG_NM_Enabled, 5, 0)));
      edtTBM11_UPD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM11_UPD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM11_UPD_DATETIME_Enabled, 5, 0)));
      edtTBM11_UPD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM11_UPD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM11_UPD_USER_ID_Enabled, 5, 0)));
      edtTBM11_UPD_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM11_UPD_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM11_UPD_PROG_NM_Enabled, 5, 0)));
      edtTBM11_UPD_CNT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM11_UPD_CNT_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM11_UPD_CNT_Enabled, 5, 0)));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues0V0( )
   {
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv());
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( "画像マスタ") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?202071513202586");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("tbm11_image") +"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm0V30( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z62TBM11_IMAGE_CD", GXutil.rtrim( Z62TBM11_IMAGE_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z536TBM11_CRT_DATETIME", localUtil.ttoc( Z536TBM11_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z537TBM11_CRT_USER_ID", GXutil.rtrim( Z537TBM11_CRT_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z539TBM11_UPD_DATETIME", localUtil.ttoc( Z539TBM11_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z540TBM11_UPD_USER_ID", GXutil.rtrim( Z540TBM11_UPD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z542TBM11_UPD_CNT", GXutil.ltrim( localUtil.ntoc( Z542TBM11_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z634TBM11_IMAGE_NM", GXutil.rtrim( Z634TBM11_IMAGE_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z534TBM11_FILE_NAME", GXutil.rtrim( Z534TBM11_FILE_NAME));
      GxWebStd.gx_hidden_field( httpContext, "Z606TBM11_STUDY_ID", GXutil.ltrim( localUtil.ntoc( Z606TBM11_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z535TBM11_DEL_FLG", GXutil.rtrim( Z535TBM11_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z538TBM11_CRT_PROG_NM", GXutil.rtrim( Z538TBM11_CRT_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z541TBM11_UPD_PROG_NM", GXutil.rtrim( Z541TBM11_UPD_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "O542TBM11_UPD_CNT", GXutil.ltrim( localUtil.ntoc( O542TBM11_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV9Pgmname));
      GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      GXCCtlgxBlob = "TBM11_IMAGE" + "_gxBlob" ;
      GxWebStd.gx_hidden_field( httpContext, GXCCtlgxBlob, GXutil.rtrim( A533TBM11_IMAGE));
      GxWebStd.gx_hidden_field( httpContext, "TBM11_IMAGE_Filename", GXutil.rtrim( edtTBM11_IMAGE_Filename));
      GxWebStd.gx_hidden_field( httpContext, "TBM11_IMAGE_Filetype", GXutil.rtrim( edtTBM11_IMAGE_Filetype));
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
      return "TBM11_IMAGE" ;
   }

   public String getPgmdesc( )
   {
      return "画像マスタ" ;
   }

   public void initializeNonKey0V30( )
   {
      A536TBM11_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n536TBM11_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A536TBM11_CRT_DATETIME", localUtil.ttoc( A536TBM11_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n536TBM11_CRT_DATETIME = (GXutil.nullDate().equals(A536TBM11_CRT_DATETIME) ? true : false) ;
      A537TBM11_CRT_USER_ID = "" ;
      n537TBM11_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A537TBM11_CRT_USER_ID", A537TBM11_CRT_USER_ID);
      n537TBM11_CRT_USER_ID = ((GXutil.strcmp("", A537TBM11_CRT_USER_ID)==0) ? true : false) ;
      A539TBM11_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n539TBM11_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A539TBM11_UPD_DATETIME", localUtil.ttoc( A539TBM11_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n539TBM11_UPD_DATETIME = (GXutil.nullDate().equals(A539TBM11_UPD_DATETIME) ? true : false) ;
      A540TBM11_UPD_USER_ID = "" ;
      n540TBM11_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A540TBM11_UPD_USER_ID", A540TBM11_UPD_USER_ID);
      n540TBM11_UPD_USER_ID = ((GXutil.strcmp("", A540TBM11_UPD_USER_ID)==0) ? true : false) ;
      A542TBM11_UPD_CNT = 0 ;
      n542TBM11_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A542TBM11_UPD_CNT", GXutil.ltrim( GXutil.str( A542TBM11_UPD_CNT, 10, 0)));
      n542TBM11_UPD_CNT = ((0==A542TBM11_UPD_CNT) ? true : false) ;
      A634TBM11_IMAGE_NM = "" ;
      n634TBM11_IMAGE_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A634TBM11_IMAGE_NM", A634TBM11_IMAGE_NM);
      n634TBM11_IMAGE_NM = ((GXutil.strcmp("", A634TBM11_IMAGE_NM)==0) ? true : false) ;
      A533TBM11_IMAGE = "" ;
      n533TBM11_IMAGE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A533TBM11_IMAGE", A533TBM11_IMAGE);
      n533TBM11_IMAGE = ((GXutil.strcmp("", A533TBM11_IMAGE)==0) ? true : false) ;
      A534TBM11_FILE_NAME = "" ;
      n534TBM11_FILE_NAME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A534TBM11_FILE_NAME", A534TBM11_FILE_NAME);
      n534TBM11_FILE_NAME = ((GXutil.strcmp("", A534TBM11_FILE_NAME)==0) ? true : false) ;
      A606TBM11_STUDY_ID = 0 ;
      n606TBM11_STUDY_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A606TBM11_STUDY_ID", GXutil.ltrim( GXutil.str( A606TBM11_STUDY_ID, 10, 0)));
      n606TBM11_STUDY_ID = ((0==A606TBM11_STUDY_ID) ? true : false) ;
      A535TBM11_DEL_FLG = "" ;
      n535TBM11_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A535TBM11_DEL_FLG", A535TBM11_DEL_FLG);
      n535TBM11_DEL_FLG = ((GXutil.strcmp("", A535TBM11_DEL_FLG)==0) ? true : false) ;
      A538TBM11_CRT_PROG_NM = "" ;
      n538TBM11_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A538TBM11_CRT_PROG_NM", A538TBM11_CRT_PROG_NM);
      n538TBM11_CRT_PROG_NM = ((GXutil.strcmp("", A538TBM11_CRT_PROG_NM)==0) ? true : false) ;
      A541TBM11_UPD_PROG_NM = "" ;
      n541TBM11_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A541TBM11_UPD_PROG_NM", A541TBM11_UPD_PROG_NM);
      n541TBM11_UPD_PROG_NM = ((GXutil.strcmp("", A541TBM11_UPD_PROG_NM)==0) ? true : false) ;
      O542TBM11_UPD_CNT = A542TBM11_UPD_CNT ;
      n542TBM11_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A542TBM11_UPD_CNT", GXutil.ltrim( GXutil.str( A542TBM11_UPD_CNT, 10, 0)));
   }

   public void initAll0V30( )
   {
      A62TBM11_IMAGE_CD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A62TBM11_IMAGE_CD", A62TBM11_IMAGE_CD);
      initializeNonKey0V30( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202071513202590");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("tbm11_image.js", "?202071513202590");
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
      lblTextblocktbm11_image_cd_Internalname = "TEXTBLOCKTBM11_IMAGE_CD" ;
      edtTBM11_IMAGE_CD_Internalname = "TBM11_IMAGE_CD" ;
      lblTextblocktbm11_image_nm_Internalname = "TEXTBLOCKTBM11_IMAGE_NM" ;
      edtTBM11_IMAGE_NM_Internalname = "TBM11_IMAGE_NM" ;
      lblTextblocktbm11_image_Internalname = "TEXTBLOCKTBM11_IMAGE" ;
      edtTBM11_IMAGE_Internalname = "TBM11_IMAGE" ;
      lblTextblocktbm11_file_name_Internalname = "TEXTBLOCKTBM11_FILE_NAME" ;
      edtTBM11_FILE_NAME_Internalname = "TBM11_FILE_NAME" ;
      lblTextblocktbm11_study_id_Internalname = "TEXTBLOCKTBM11_STUDY_ID" ;
      edtTBM11_STUDY_ID_Internalname = "TBM11_STUDY_ID" ;
      lblTextblocktbm11_del_flg_Internalname = "TEXTBLOCKTBM11_DEL_FLG" ;
      edtTBM11_DEL_FLG_Internalname = "TBM11_DEL_FLG" ;
      lblTextblocktbm11_crt_datetime_Internalname = "TEXTBLOCKTBM11_CRT_DATETIME" ;
      edtTBM11_CRT_DATETIME_Internalname = "TBM11_CRT_DATETIME" ;
      lblTextblocktbm11_crt_user_id_Internalname = "TEXTBLOCKTBM11_CRT_USER_ID" ;
      edtTBM11_CRT_USER_ID_Internalname = "TBM11_CRT_USER_ID" ;
      lblTextblocktbm11_crt_prog_nm_Internalname = "TEXTBLOCKTBM11_CRT_PROG_NM" ;
      edtTBM11_CRT_PROG_NM_Internalname = "TBM11_CRT_PROG_NM" ;
      lblTextblocktbm11_upd_datetime_Internalname = "TEXTBLOCKTBM11_UPD_DATETIME" ;
      edtTBM11_UPD_DATETIME_Internalname = "TBM11_UPD_DATETIME" ;
      lblTextblocktbm11_upd_user_id_Internalname = "TEXTBLOCKTBM11_UPD_USER_ID" ;
      edtTBM11_UPD_USER_ID_Internalname = "TBM11_UPD_USER_ID" ;
      lblTextblocktbm11_upd_prog_nm_Internalname = "TEXTBLOCKTBM11_UPD_PROG_NM" ;
      edtTBM11_UPD_PROG_NM_Internalname = "TBM11_UPD_PROG_NM" ;
      lblTextblocktbm11_upd_cnt_Internalname = "TEXTBLOCKTBM11_UPD_CNT" ;
      edtTBM11_UPD_CNT_Internalname = "TBM11_UPD_CNT" ;
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
      edtTBM11_IMAGE_Filename = "" ;
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
      edtTBM11_UPD_CNT_Jsonclick = "" ;
      edtTBM11_UPD_CNT_Enabled = 1 ;
      edtTBM11_UPD_PROG_NM_Jsonclick = "" ;
      edtTBM11_UPD_PROG_NM_Enabled = 1 ;
      edtTBM11_UPD_USER_ID_Jsonclick = "" ;
      edtTBM11_UPD_USER_ID_Enabled = 1 ;
      edtTBM11_UPD_DATETIME_Jsonclick = "" ;
      edtTBM11_UPD_DATETIME_Enabled = 1 ;
      edtTBM11_CRT_PROG_NM_Jsonclick = "" ;
      edtTBM11_CRT_PROG_NM_Enabled = 1 ;
      edtTBM11_CRT_USER_ID_Jsonclick = "" ;
      edtTBM11_CRT_USER_ID_Enabled = 1 ;
      edtTBM11_CRT_DATETIME_Jsonclick = "" ;
      edtTBM11_CRT_DATETIME_Enabled = 1 ;
      edtTBM11_DEL_FLG_Jsonclick = "" ;
      edtTBM11_DEL_FLG_Enabled = 1 ;
      edtTBM11_STUDY_ID_Jsonclick = "" ;
      edtTBM11_STUDY_ID_Enabled = 1 ;
      edtTBM11_FILE_NAME_Jsonclick = "" ;
      edtTBM11_FILE_NAME_Enabled = 1 ;
      edtTBM11_IMAGE_Jsonclick = "" ;
      edtTBM11_IMAGE_Parameters = "" ;
      edtTBM11_IMAGE_Contenttype = "" ;
      edtTBM11_IMAGE_Filetype = "" ;
      edtTBM11_IMAGE_Enabled = 1 ;
      edtTBM11_IMAGE_NM_Jsonclick = "" ;
      edtTBM11_IMAGE_NM_Enabled = 1 ;
      edtTBM11_IMAGE_CD_Jsonclick = "" ;
      edtTBM11_IMAGE_CD_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Visible = 1 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gx4asatbm11_crt_user_id0V30( String Gx_mode )
   {
      GXt_char1 = A537TBM11_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm11_image_impl.this.GXt_char1 = GXv_char2[0] ;
      A537TBM11_CRT_USER_ID = GXt_char1 ;
      n537TBM11_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A537TBM11_CRT_USER_ID", A537TBM11_CRT_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A537TBM11_CRT_USER_ID))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void gx6asatbm11_upd_user_id0V30( String Gx_mode )
   {
      GXt_char1 = A540TBM11_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm11_image_impl.this.GXt_char1 = GXv_char2[0] ;
      A540TBM11_UPD_USER_ID = GXt_char1 ;
      n540TBM11_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A540TBM11_UPD_USER_ID", A540TBM11_UPD_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A540TBM11_UPD_USER_ID))+"\"");
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
      GX_FocusControl = edtTBM11_IMAGE_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Tbm11_image_cd( String GX_Parm1 ,
                                     java.util.Date GX_Parm2 ,
                                     String GX_Parm3 ,
                                     java.util.Date GX_Parm4 ,
                                     String GX_Parm5 ,
                                     long GX_Parm6 ,
                                     String GX_Parm7 ,
                                     String GX_Parm8 ,
                                     String GX_Parm9 ,
                                     long GX_Parm10 ,
                                     String GX_Parm11 ,
                                     String GX_Parm12 ,
                                     String GX_Parm13 )
   {
      A62TBM11_IMAGE_CD = GX_Parm1 ;
      A536TBM11_CRT_DATETIME = GX_Parm2 ;
      n536TBM11_CRT_DATETIME = false ;
      A537TBM11_CRT_USER_ID = GX_Parm3 ;
      n537TBM11_CRT_USER_ID = false ;
      A539TBM11_UPD_DATETIME = GX_Parm4 ;
      n539TBM11_UPD_DATETIME = false ;
      A540TBM11_UPD_USER_ID = GX_Parm5 ;
      n540TBM11_UPD_USER_ID = false ;
      A542TBM11_UPD_CNT = GX_Parm6 ;
      n542TBM11_UPD_CNT = false ;
      A634TBM11_IMAGE_NM = GX_Parm7 ;
      n634TBM11_IMAGE_NM = false ;
      A533TBM11_IMAGE = GX_Parm8 ;
      n533TBM11_IMAGE = false ;
      A534TBM11_FILE_NAME = GX_Parm9 ;
      n534TBM11_FILE_NAME = false ;
      A606TBM11_STUDY_ID = GX_Parm10 ;
      n606TBM11_STUDY_ID = false ;
      A535TBM11_DEL_FLG = GX_Parm11 ;
      n535TBM11_DEL_FLG = false ;
      A538TBM11_CRT_PROG_NM = GX_Parm12 ;
      n538TBM11_CRT_PROG_NM = false ;
      A541TBM11_UPD_PROG_NM = GX_Parm13 ;
      n541TBM11_UPD_PROG_NM = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(localUtil.format(A536TBM11_CRT_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A537TBM11_CRT_USER_ID));
      isValidOutput.add(localUtil.format(A539TBM11_UPD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A540TBM11_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A542TBM11_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A634TBM11_IMAGE_NM));
      isValidOutput.add(httpContext.getResourceRelative(A533TBM11_IMAGE));
      isValidOutput.add(A533TBM11_IMAGE);
      isValidOutput.add(GXutil.rtrim( A534TBM11_FILE_NAME));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A606TBM11_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A535TBM11_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( A538TBM11_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( A541TBM11_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( AV9Pgmname));
      isValidOutput.add(edtTBM11_IMAGE_Filetype);
      isValidOutput.add(edtTBM11_IMAGE_Filename);
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.rtrim( Z62TBM11_IMAGE_CD));
      isValidOutput.add(localUtil.ttoc( Z536TBM11_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z537TBM11_CRT_USER_ID));
      isValidOutput.add(localUtil.ttoc( Z539TBM11_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z540TBM11_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z542TBM11_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z634TBM11_IMAGE_NM));
      isValidOutput.add(httpContext.getResourceRelative(Z533TBM11_IMAGE));
      isValidOutput.add(GXutil.rtrim( Z534TBM11_FILE_NAME));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z606TBM11_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z535TBM11_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( Z538TBM11_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( Z541TBM11_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( ZV9Pgmname));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( O542TBM11_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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
      Z62TBM11_IMAGE_CD = "" ;
      Z536TBM11_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z537TBM11_CRT_USER_ID = "" ;
      Z539TBM11_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z540TBM11_UPD_USER_ID = "" ;
      Z634TBM11_IMAGE_NM = "" ;
      Z534TBM11_FILE_NAME = "" ;
      Z535TBM11_DEL_FLG = "" ;
      Z538TBM11_CRT_PROG_NM = "" ;
      Z541TBM11_UPD_PROG_NM = "" ;
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
      lblTextblocktbm11_image_cd_Jsonclick = "" ;
      A62TBM11_IMAGE_CD = "" ;
      lblTextblocktbm11_image_nm_Jsonclick = "" ;
      A634TBM11_IMAGE_NM = "" ;
      lblTextblocktbm11_image_Jsonclick = "" ;
      gxblobfileaux = new com.genexus.util.GXFile();
      A533TBM11_IMAGE = "" ;
      lblTextblocktbm11_file_name_Jsonclick = "" ;
      A534TBM11_FILE_NAME = "" ;
      lblTextblocktbm11_study_id_Jsonclick = "" ;
      lblTextblocktbm11_del_flg_Jsonclick = "" ;
      A535TBM11_DEL_FLG = "" ;
      lblTextblocktbm11_crt_datetime_Jsonclick = "" ;
      A536TBM11_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbm11_crt_user_id_Jsonclick = "" ;
      A537TBM11_CRT_USER_ID = "" ;
      lblTextblocktbm11_crt_prog_nm_Jsonclick = "" ;
      A538TBM11_CRT_PROG_NM = "" ;
      lblTextblocktbm11_upd_datetime_Jsonclick = "" ;
      A539TBM11_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbm11_upd_user_id_Jsonclick = "" ;
      A540TBM11_UPD_USER_ID = "" ;
      lblTextblocktbm11_upd_prog_nm_Jsonclick = "" ;
      A541TBM11_UPD_PROG_NM = "" ;
      lblTextblocktbm11_upd_cnt_Jsonclick = "" ;
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
      GXCCtlgxBlob = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV8W_BC_FLG = "" ;
      GXEncryptionTmp = "" ;
      AV7W_TXT = "" ;
      Z533TBM11_IMAGE = "" ;
      T000V4_A62TBM11_IMAGE_CD = new String[] {""} ;
      T000V4_A536TBM11_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000V4_n536TBM11_CRT_DATETIME = new boolean[] {false} ;
      T000V4_A537TBM11_CRT_USER_ID = new String[] {""} ;
      T000V4_n537TBM11_CRT_USER_ID = new boolean[] {false} ;
      T000V4_A539TBM11_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000V4_n539TBM11_UPD_DATETIME = new boolean[] {false} ;
      T000V4_A540TBM11_UPD_USER_ID = new String[] {""} ;
      T000V4_n540TBM11_UPD_USER_ID = new boolean[] {false} ;
      T000V4_A542TBM11_UPD_CNT = new long[1] ;
      T000V4_n542TBM11_UPD_CNT = new boolean[] {false} ;
      T000V4_A634TBM11_IMAGE_NM = new String[] {""} ;
      T000V4_n634TBM11_IMAGE_NM = new boolean[] {false} ;
      T000V4_A533TBM11_IMAGE = new String[] {""} ;
      T000V4_n533TBM11_IMAGE = new boolean[] {false} ;
      T000V4_A534TBM11_FILE_NAME = new String[] {""} ;
      T000V4_n534TBM11_FILE_NAME = new boolean[] {false} ;
      T000V4_A606TBM11_STUDY_ID = new long[1] ;
      T000V4_n606TBM11_STUDY_ID = new boolean[] {false} ;
      T000V4_A535TBM11_DEL_FLG = new String[] {""} ;
      T000V4_n535TBM11_DEL_FLG = new boolean[] {false} ;
      T000V4_A538TBM11_CRT_PROG_NM = new String[] {""} ;
      T000V4_n538TBM11_CRT_PROG_NM = new boolean[] {false} ;
      T000V4_A541TBM11_UPD_PROG_NM = new String[] {""} ;
      T000V4_n541TBM11_UPD_PROG_NM = new boolean[] {false} ;
      T000V5_A62TBM11_IMAGE_CD = new String[] {""} ;
      T000V3_A62TBM11_IMAGE_CD = new String[] {""} ;
      T000V3_A536TBM11_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000V3_n536TBM11_CRT_DATETIME = new boolean[] {false} ;
      T000V3_A537TBM11_CRT_USER_ID = new String[] {""} ;
      T000V3_n537TBM11_CRT_USER_ID = new boolean[] {false} ;
      T000V3_A539TBM11_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000V3_n539TBM11_UPD_DATETIME = new boolean[] {false} ;
      T000V3_A540TBM11_UPD_USER_ID = new String[] {""} ;
      T000V3_n540TBM11_UPD_USER_ID = new boolean[] {false} ;
      T000V3_A542TBM11_UPD_CNT = new long[1] ;
      T000V3_n542TBM11_UPD_CNT = new boolean[] {false} ;
      T000V3_A634TBM11_IMAGE_NM = new String[] {""} ;
      T000V3_n634TBM11_IMAGE_NM = new boolean[] {false} ;
      T000V3_A533TBM11_IMAGE = new String[] {""} ;
      T000V3_n533TBM11_IMAGE = new boolean[] {false} ;
      T000V3_A534TBM11_FILE_NAME = new String[] {""} ;
      T000V3_n534TBM11_FILE_NAME = new boolean[] {false} ;
      T000V3_A606TBM11_STUDY_ID = new long[1] ;
      T000V3_n606TBM11_STUDY_ID = new boolean[] {false} ;
      T000V3_A535TBM11_DEL_FLG = new String[] {""} ;
      T000V3_n535TBM11_DEL_FLG = new boolean[] {false} ;
      T000V3_A538TBM11_CRT_PROG_NM = new String[] {""} ;
      T000V3_n538TBM11_CRT_PROG_NM = new boolean[] {false} ;
      T000V3_A541TBM11_UPD_PROG_NM = new String[] {""} ;
      T000V3_n541TBM11_UPD_PROG_NM = new boolean[] {false} ;
      sMode30 = "" ;
      T000V6_A62TBM11_IMAGE_CD = new String[] {""} ;
      T000V7_A62TBM11_IMAGE_CD = new String[] {""} ;
      T000V2_A62TBM11_IMAGE_CD = new String[] {""} ;
      T000V2_A536TBM11_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000V2_n536TBM11_CRT_DATETIME = new boolean[] {false} ;
      T000V2_A537TBM11_CRT_USER_ID = new String[] {""} ;
      T000V2_n537TBM11_CRT_USER_ID = new boolean[] {false} ;
      T000V2_A539TBM11_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000V2_n539TBM11_UPD_DATETIME = new boolean[] {false} ;
      T000V2_A540TBM11_UPD_USER_ID = new String[] {""} ;
      T000V2_n540TBM11_UPD_USER_ID = new boolean[] {false} ;
      T000V2_A542TBM11_UPD_CNT = new long[1] ;
      T000V2_n542TBM11_UPD_CNT = new boolean[] {false} ;
      T000V2_A634TBM11_IMAGE_NM = new String[] {""} ;
      T000V2_n634TBM11_IMAGE_NM = new boolean[] {false} ;
      T000V2_A533TBM11_IMAGE = new String[] {""} ;
      T000V2_n533TBM11_IMAGE = new boolean[] {false} ;
      T000V2_A534TBM11_FILE_NAME = new String[] {""} ;
      T000V2_n534TBM11_FILE_NAME = new boolean[] {false} ;
      T000V2_A606TBM11_STUDY_ID = new long[1] ;
      T000V2_n606TBM11_STUDY_ID = new boolean[] {false} ;
      T000V2_A535TBM11_DEL_FLG = new String[] {""} ;
      T000V2_n535TBM11_DEL_FLG = new boolean[] {false} ;
      T000V2_A538TBM11_CRT_PROG_NM = new String[] {""} ;
      T000V2_n538TBM11_CRT_PROG_NM = new boolean[] {false} ;
      T000V2_A541TBM11_UPD_PROG_NM = new String[] {""} ;
      T000V2_n541TBM11_UPD_PROG_NM = new boolean[] {false} ;
      T000V12_A62TBM11_IMAGE_CD = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      ZV9Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbm11_image__default(),
         new Object[] {
             new Object[] {
            T000V2_A62TBM11_IMAGE_CD, T000V2_A536TBM11_CRT_DATETIME, T000V2_n536TBM11_CRT_DATETIME, T000V2_A537TBM11_CRT_USER_ID, T000V2_n537TBM11_CRT_USER_ID, T000V2_A539TBM11_UPD_DATETIME, T000V2_n539TBM11_UPD_DATETIME, T000V2_A540TBM11_UPD_USER_ID, T000V2_n540TBM11_UPD_USER_ID, T000V2_A542TBM11_UPD_CNT,
            T000V2_n542TBM11_UPD_CNT, T000V2_A634TBM11_IMAGE_NM, T000V2_n634TBM11_IMAGE_NM, T000V2_A533TBM11_IMAGE, T000V2_n533TBM11_IMAGE, T000V2_A534TBM11_FILE_NAME, T000V2_n534TBM11_FILE_NAME, T000V2_A606TBM11_STUDY_ID, T000V2_n606TBM11_STUDY_ID, T000V2_A535TBM11_DEL_FLG,
            T000V2_n535TBM11_DEL_FLG, T000V2_A538TBM11_CRT_PROG_NM, T000V2_n538TBM11_CRT_PROG_NM, T000V2_A541TBM11_UPD_PROG_NM, T000V2_n541TBM11_UPD_PROG_NM
            }
            , new Object[] {
            T000V3_A62TBM11_IMAGE_CD, T000V3_A536TBM11_CRT_DATETIME, T000V3_n536TBM11_CRT_DATETIME, T000V3_A537TBM11_CRT_USER_ID, T000V3_n537TBM11_CRT_USER_ID, T000V3_A539TBM11_UPD_DATETIME, T000V3_n539TBM11_UPD_DATETIME, T000V3_A540TBM11_UPD_USER_ID, T000V3_n540TBM11_UPD_USER_ID, T000V3_A542TBM11_UPD_CNT,
            T000V3_n542TBM11_UPD_CNT, T000V3_A634TBM11_IMAGE_NM, T000V3_n634TBM11_IMAGE_NM, T000V3_A533TBM11_IMAGE, T000V3_n533TBM11_IMAGE, T000V3_A534TBM11_FILE_NAME, T000V3_n534TBM11_FILE_NAME, T000V3_A606TBM11_STUDY_ID, T000V3_n606TBM11_STUDY_ID, T000V3_A535TBM11_DEL_FLG,
            T000V3_n535TBM11_DEL_FLG, T000V3_A538TBM11_CRT_PROG_NM, T000V3_n538TBM11_CRT_PROG_NM, T000V3_A541TBM11_UPD_PROG_NM, T000V3_n541TBM11_UPD_PROG_NM
            }
            , new Object[] {
            T000V4_A62TBM11_IMAGE_CD, T000V4_A536TBM11_CRT_DATETIME, T000V4_n536TBM11_CRT_DATETIME, T000V4_A537TBM11_CRT_USER_ID, T000V4_n537TBM11_CRT_USER_ID, T000V4_A539TBM11_UPD_DATETIME, T000V4_n539TBM11_UPD_DATETIME, T000V4_A540TBM11_UPD_USER_ID, T000V4_n540TBM11_UPD_USER_ID, T000V4_A542TBM11_UPD_CNT,
            T000V4_n542TBM11_UPD_CNT, T000V4_A634TBM11_IMAGE_NM, T000V4_n634TBM11_IMAGE_NM, T000V4_A533TBM11_IMAGE, T000V4_n533TBM11_IMAGE, T000V4_A534TBM11_FILE_NAME, T000V4_n534TBM11_FILE_NAME, T000V4_A606TBM11_STUDY_ID, T000V4_n606TBM11_STUDY_ID, T000V4_A535TBM11_DEL_FLG,
            T000V4_n535TBM11_DEL_FLG, T000V4_A538TBM11_CRT_PROG_NM, T000V4_n538TBM11_CRT_PROG_NM, T000V4_A541TBM11_UPD_PROG_NM, T000V4_n541TBM11_UPD_PROG_NM
            }
            , new Object[] {
            T000V5_A62TBM11_IMAGE_CD
            }
            , new Object[] {
            T000V6_A62TBM11_IMAGE_CD
            }
            , new Object[] {
            T000V7_A62TBM11_IMAGE_CD
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000V12_A62TBM11_IMAGE_CD
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBM11_IMAGE" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound30 ;
   private short Gx_err ;
   private int trnEnded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int edtTBM11_IMAGE_CD_Enabled ;
   private int edtTBM11_IMAGE_NM_Enabled ;
   private int edtTBM11_IMAGE_Enabled ;
   private int edtTBM11_FILE_NAME_Enabled ;
   private int edtTBM11_STUDY_ID_Enabled ;
   private int edtTBM11_DEL_FLG_Enabled ;
   private int edtTBM11_CRT_DATETIME_Enabled ;
   private int edtTBM11_CRT_USER_ID_Enabled ;
   private int edtTBM11_CRT_PROG_NM_Enabled ;
   private int edtTBM11_UPD_DATETIME_Enabled ;
   private int edtTBM11_UPD_USER_ID_Enabled ;
   private int edtTBM11_UPD_PROG_NM_Enabled ;
   private int edtTBM11_UPD_CNT_Enabled ;
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
   private long Z542TBM11_UPD_CNT ;
   private long Z606TBM11_STUDY_ID ;
   private long O542TBM11_UPD_CNT ;
   private long A606TBM11_STUDY_ID ;
   private long A542TBM11_UPD_CNT ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTBM11_IMAGE_CD_Internalname ;
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
   private String lblTextblocktbm11_image_cd_Internalname ;
   private String lblTextblocktbm11_image_cd_Jsonclick ;
   private String edtTBM11_IMAGE_CD_Jsonclick ;
   private String lblTextblocktbm11_image_nm_Internalname ;
   private String lblTextblocktbm11_image_nm_Jsonclick ;
   private String edtTBM11_IMAGE_NM_Internalname ;
   private String edtTBM11_IMAGE_NM_Jsonclick ;
   private String lblTextblocktbm11_image_Internalname ;
   private String lblTextblocktbm11_image_Jsonclick ;
   private String edtTBM11_IMAGE_Filetype ;
   private String edtTBM11_IMAGE_Internalname ;
   private String edtTBM11_IMAGE_Contenttype ;
   private String edtTBM11_IMAGE_Parameters ;
   private String edtTBM11_IMAGE_Jsonclick ;
   private String lblTextblocktbm11_file_name_Internalname ;
   private String lblTextblocktbm11_file_name_Jsonclick ;
   private String edtTBM11_FILE_NAME_Internalname ;
   private String edtTBM11_FILE_NAME_Jsonclick ;
   private String lblTextblocktbm11_study_id_Internalname ;
   private String lblTextblocktbm11_study_id_Jsonclick ;
   private String edtTBM11_STUDY_ID_Internalname ;
   private String edtTBM11_STUDY_ID_Jsonclick ;
   private String lblTextblocktbm11_del_flg_Internalname ;
   private String lblTextblocktbm11_del_flg_Jsonclick ;
   private String edtTBM11_DEL_FLG_Internalname ;
   private String edtTBM11_DEL_FLG_Jsonclick ;
   private String lblTextblocktbm11_crt_datetime_Internalname ;
   private String lblTextblocktbm11_crt_datetime_Jsonclick ;
   private String edtTBM11_CRT_DATETIME_Internalname ;
   private String edtTBM11_CRT_DATETIME_Jsonclick ;
   private String lblTextblocktbm11_crt_user_id_Internalname ;
   private String lblTextblocktbm11_crt_user_id_Jsonclick ;
   private String edtTBM11_CRT_USER_ID_Internalname ;
   private String edtTBM11_CRT_USER_ID_Jsonclick ;
   private String lblTextblocktbm11_crt_prog_nm_Internalname ;
   private String lblTextblocktbm11_crt_prog_nm_Jsonclick ;
   private String edtTBM11_CRT_PROG_NM_Internalname ;
   private String edtTBM11_CRT_PROG_NM_Jsonclick ;
   private String lblTextblocktbm11_upd_datetime_Internalname ;
   private String lblTextblocktbm11_upd_datetime_Jsonclick ;
   private String edtTBM11_UPD_DATETIME_Internalname ;
   private String edtTBM11_UPD_DATETIME_Jsonclick ;
   private String lblTextblocktbm11_upd_user_id_Internalname ;
   private String lblTextblocktbm11_upd_user_id_Jsonclick ;
   private String edtTBM11_UPD_USER_ID_Internalname ;
   private String edtTBM11_UPD_USER_ID_Jsonclick ;
   private String lblTextblocktbm11_upd_prog_nm_Internalname ;
   private String lblTextblocktbm11_upd_prog_nm_Jsonclick ;
   private String edtTBM11_UPD_PROG_NM_Internalname ;
   private String edtTBM11_UPD_PROG_NM_Jsonclick ;
   private String lblTextblocktbm11_upd_cnt_Internalname ;
   private String lblTextblocktbm11_upd_cnt_Jsonclick ;
   private String edtTBM11_UPD_CNT_Internalname ;
   private String edtTBM11_UPD_CNT_Jsonclick ;
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
   private String edtTBM11_IMAGE_Filename ;
   private String GXCCtlgxBlob ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String GXEncryptionTmp ;
   private String sMode30 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String ZV9Pgmname ;
   private String Gx_emsg ;
   private java.util.Date Z536TBM11_CRT_DATETIME ;
   private java.util.Date Z539TBM11_UPD_DATETIME ;
   private java.util.Date A536TBM11_CRT_DATETIME ;
   private java.util.Date A539TBM11_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean wbErr ;
   private boolean n533TBM11_IMAGE ;
   private boolean n634TBM11_IMAGE_NM ;
   private boolean n534TBM11_FILE_NAME ;
   private boolean n606TBM11_STUDY_ID ;
   private boolean n535TBM11_DEL_FLG ;
   private boolean n536TBM11_CRT_DATETIME ;
   private boolean n537TBM11_CRT_USER_ID ;
   private boolean n538TBM11_CRT_PROG_NM ;
   private boolean n539TBM11_UPD_DATETIME ;
   private boolean n540TBM11_UPD_USER_ID ;
   private boolean n541TBM11_UPD_PROG_NM ;
   private boolean n542TBM11_UPD_CNT ;
   private boolean Gx_longc ;
   private boolean toggleJsOutput ;
   private String A533TBM11_IMAGE ;
   private String Z533TBM11_IMAGE ;
   private String Z62TBM11_IMAGE_CD ;
   private String Z537TBM11_CRT_USER_ID ;
   private String Z540TBM11_UPD_USER_ID ;
   private String Z634TBM11_IMAGE_NM ;
   private String Z534TBM11_FILE_NAME ;
   private String Z535TBM11_DEL_FLG ;
   private String Z538TBM11_CRT_PROG_NM ;
   private String Z541TBM11_UPD_PROG_NM ;
   private String A62TBM11_IMAGE_CD ;
   private String A634TBM11_IMAGE_NM ;
   private String A534TBM11_FILE_NAME ;
   private String A535TBM11_DEL_FLG ;
   private String A537TBM11_CRT_USER_ID ;
   private String A538TBM11_CRT_PROG_NM ;
   private String A540TBM11_UPD_USER_ID ;
   private String A541TBM11_UPD_PROG_NM ;
   private String AV8W_BC_FLG ;
   private String AV7W_TXT ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.util.GXFile gxblobfileaux ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private String[] T000V4_A62TBM11_IMAGE_CD ;
   private java.util.Date[] T000V4_A536TBM11_CRT_DATETIME ;
   private boolean[] T000V4_n536TBM11_CRT_DATETIME ;
   private String[] T000V4_A537TBM11_CRT_USER_ID ;
   private boolean[] T000V4_n537TBM11_CRT_USER_ID ;
   private java.util.Date[] T000V4_A539TBM11_UPD_DATETIME ;
   private boolean[] T000V4_n539TBM11_UPD_DATETIME ;
   private String[] T000V4_A540TBM11_UPD_USER_ID ;
   private boolean[] T000V4_n540TBM11_UPD_USER_ID ;
   private long[] T000V4_A542TBM11_UPD_CNT ;
   private boolean[] T000V4_n542TBM11_UPD_CNT ;
   private String[] T000V4_A634TBM11_IMAGE_NM ;
   private boolean[] T000V4_n634TBM11_IMAGE_NM ;
   private String[] T000V4_A533TBM11_IMAGE ;
   private boolean[] T000V4_n533TBM11_IMAGE ;
   private String[] T000V4_A534TBM11_FILE_NAME ;
   private boolean[] T000V4_n534TBM11_FILE_NAME ;
   private long[] T000V4_A606TBM11_STUDY_ID ;
   private boolean[] T000V4_n606TBM11_STUDY_ID ;
   private String[] T000V4_A535TBM11_DEL_FLG ;
   private boolean[] T000V4_n535TBM11_DEL_FLG ;
   private String[] T000V4_A538TBM11_CRT_PROG_NM ;
   private boolean[] T000V4_n538TBM11_CRT_PROG_NM ;
   private String[] T000V4_A541TBM11_UPD_PROG_NM ;
   private boolean[] T000V4_n541TBM11_UPD_PROG_NM ;
   private String[] T000V5_A62TBM11_IMAGE_CD ;
   private String[] T000V3_A62TBM11_IMAGE_CD ;
   private java.util.Date[] T000V3_A536TBM11_CRT_DATETIME ;
   private boolean[] T000V3_n536TBM11_CRT_DATETIME ;
   private String[] T000V3_A537TBM11_CRT_USER_ID ;
   private boolean[] T000V3_n537TBM11_CRT_USER_ID ;
   private java.util.Date[] T000V3_A539TBM11_UPD_DATETIME ;
   private boolean[] T000V3_n539TBM11_UPD_DATETIME ;
   private String[] T000V3_A540TBM11_UPD_USER_ID ;
   private boolean[] T000V3_n540TBM11_UPD_USER_ID ;
   private long[] T000V3_A542TBM11_UPD_CNT ;
   private boolean[] T000V3_n542TBM11_UPD_CNT ;
   private String[] T000V3_A634TBM11_IMAGE_NM ;
   private boolean[] T000V3_n634TBM11_IMAGE_NM ;
   private String[] T000V3_A533TBM11_IMAGE ;
   private boolean[] T000V3_n533TBM11_IMAGE ;
   private String[] T000V3_A534TBM11_FILE_NAME ;
   private boolean[] T000V3_n534TBM11_FILE_NAME ;
   private long[] T000V3_A606TBM11_STUDY_ID ;
   private boolean[] T000V3_n606TBM11_STUDY_ID ;
   private String[] T000V3_A535TBM11_DEL_FLG ;
   private boolean[] T000V3_n535TBM11_DEL_FLG ;
   private String[] T000V3_A538TBM11_CRT_PROG_NM ;
   private boolean[] T000V3_n538TBM11_CRT_PROG_NM ;
   private String[] T000V3_A541TBM11_UPD_PROG_NM ;
   private boolean[] T000V3_n541TBM11_UPD_PROG_NM ;
   private String[] T000V6_A62TBM11_IMAGE_CD ;
   private String[] T000V7_A62TBM11_IMAGE_CD ;
   private String[] T000V2_A62TBM11_IMAGE_CD ;
   private java.util.Date[] T000V2_A536TBM11_CRT_DATETIME ;
   private boolean[] T000V2_n536TBM11_CRT_DATETIME ;
   private String[] T000V2_A537TBM11_CRT_USER_ID ;
   private boolean[] T000V2_n537TBM11_CRT_USER_ID ;
   private java.util.Date[] T000V2_A539TBM11_UPD_DATETIME ;
   private boolean[] T000V2_n539TBM11_UPD_DATETIME ;
   private String[] T000V2_A540TBM11_UPD_USER_ID ;
   private boolean[] T000V2_n540TBM11_UPD_USER_ID ;
   private long[] T000V2_A542TBM11_UPD_CNT ;
   private boolean[] T000V2_n542TBM11_UPD_CNT ;
   private String[] T000V2_A634TBM11_IMAGE_NM ;
   private boolean[] T000V2_n634TBM11_IMAGE_NM ;
   private String[] T000V2_A533TBM11_IMAGE ;
   private boolean[] T000V2_n533TBM11_IMAGE ;
   private String[] T000V2_A534TBM11_FILE_NAME ;
   private boolean[] T000V2_n534TBM11_FILE_NAME ;
   private long[] T000V2_A606TBM11_STUDY_ID ;
   private boolean[] T000V2_n606TBM11_STUDY_ID ;
   private String[] T000V2_A535TBM11_DEL_FLG ;
   private boolean[] T000V2_n535TBM11_DEL_FLG ;
   private String[] T000V2_A538TBM11_CRT_PROG_NM ;
   private boolean[] T000V2_n538TBM11_CRT_PROG_NM ;
   private String[] T000V2_A541TBM11_UPD_PROG_NM ;
   private boolean[] T000V2_n541TBM11_UPD_PROG_NM ;
   private String[] T000V12_A62TBM11_IMAGE_CD ;
}

final  class tbm11_image__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000V2", "SELECT `TBM11_IMAGE_CD`, `TBM11_CRT_DATETIME`, `TBM11_CRT_USER_ID`, `TBM11_UPD_DATETIME`, `TBM11_UPD_USER_ID`, `TBM11_UPD_CNT`, `TBM11_IMAGE_NM`, `TBM11_IMAGE`, `TBM11_FILE_NAME`, `TBM11_STUDY_ID`, `TBM11_DEL_FLG`, `TBM11_CRT_PROG_NM`, `TBM11_UPD_PROG_NM` FROM `TBM11_IMAGE` WHERE `TBM11_IMAGE_CD` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000V3", "SELECT `TBM11_IMAGE_CD`, `TBM11_CRT_DATETIME`, `TBM11_CRT_USER_ID`, `TBM11_UPD_DATETIME`, `TBM11_UPD_USER_ID`, `TBM11_UPD_CNT`, `TBM11_IMAGE_NM`, `TBM11_IMAGE`, `TBM11_FILE_NAME`, `TBM11_STUDY_ID`, `TBM11_DEL_FLG`, `TBM11_CRT_PROG_NM`, `TBM11_UPD_PROG_NM` FROM `TBM11_IMAGE` WHERE `TBM11_IMAGE_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000V4", "SELECT TM1.`TBM11_IMAGE_CD`, TM1.`TBM11_CRT_DATETIME`, TM1.`TBM11_CRT_USER_ID`, TM1.`TBM11_UPD_DATETIME`, TM1.`TBM11_UPD_USER_ID`, TM1.`TBM11_UPD_CNT`, TM1.`TBM11_IMAGE_NM`, TM1.`TBM11_IMAGE`, TM1.`TBM11_FILE_NAME`, TM1.`TBM11_STUDY_ID`, TM1.`TBM11_DEL_FLG`, TM1.`TBM11_CRT_PROG_NM`, TM1.`TBM11_UPD_PROG_NM` FROM `TBM11_IMAGE` TM1 WHERE TM1.`TBM11_IMAGE_CD` = ? ORDER BY TM1.`TBM11_IMAGE_CD` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000V5", "SELECT `TBM11_IMAGE_CD` FROM `TBM11_IMAGE` WHERE `TBM11_IMAGE_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000V6", "SELECT `TBM11_IMAGE_CD` FROM `TBM11_IMAGE` WHERE ( `TBM11_IMAGE_CD` > ?) ORDER BY `TBM11_IMAGE_CD`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000V7", "SELECT `TBM11_IMAGE_CD` FROM `TBM11_IMAGE` WHERE ( `TBM11_IMAGE_CD` < ?) ORDER BY `TBM11_IMAGE_CD` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000V8", "INSERT INTO `TBM11_IMAGE`(`TBM11_IMAGE_CD`, `TBM11_CRT_DATETIME`, `TBM11_CRT_USER_ID`, `TBM11_UPD_DATETIME`, `TBM11_UPD_USER_ID`, `TBM11_UPD_CNT`, `TBM11_IMAGE_NM`, `TBM11_IMAGE`, `TBM11_FILE_NAME`, `TBM11_STUDY_ID`, `TBM11_DEL_FLG`, `TBM11_CRT_PROG_NM`, `TBM11_UPD_PROG_NM`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T000V9", "UPDATE `TBM11_IMAGE` SET `TBM11_CRT_DATETIME`=?, `TBM11_CRT_USER_ID`=?, `TBM11_UPD_DATETIME`=?, `TBM11_UPD_USER_ID`=?, `TBM11_UPD_CNT`=?, `TBM11_IMAGE_NM`=?, `TBM11_FILE_NAME`=?, `TBM11_STUDY_ID`=?, `TBM11_DEL_FLG`=?, `TBM11_CRT_PROG_NM`=?, `TBM11_UPD_PROG_NM`=?  WHERE `TBM11_IMAGE_CD` = ?", GX_NOMASK)
         ,new UpdateCursor("T000V10", "UPDATE `TBM11_IMAGE` SET `TBM11_IMAGE`=?  WHERE `TBM11_IMAGE_CD` = ?", GX_NOMASK)
         ,new UpdateCursor("T000V11", "DELETE FROM `TBM11_IMAGE`  WHERE `TBM11_IMAGE_CD` = ?", GX_NOMASK)
         ,new ForEachCursor("T000V12", "SELECT `TBM11_IMAGE_CD` FROM `TBM11_IMAGE` ORDER BY `TBM11_IMAGE_CD` ",true, GX_NOMASK, false, this,100,0,false )
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
               ((String[]) buf[13])[0] = rslt.getBLOBFile(8, "tmp", "") ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((long[]) buf[17])[0] = rslt.getLong(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
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
               ((String[]) buf[13])[0] = rslt.getBLOBFile(8, "tmp", "") ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((long[]) buf[17])[0] = rslt.getLong(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
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
               ((String[]) buf[13])[0] = rslt.getBLOBFile(8, "tmp", "") ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((long[]) buf[17])[0] = rslt.getLong(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
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
               stmt.setVarchar(1, (String)parms[0], 50, false);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
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
                  stmt.setNull( 8 , Types.LONGVARBINARY );
               }
               else
               {
                  stmt.setBLOBFile(8, (String)parms[14]);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[16], 100);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(10, ((Number) parms[18]).longValue());
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[20], 1);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[22], 40);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[24], 40);
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
                  stmt.setVarchar(7, (String)parms[13], 100);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(8, ((Number) parms[15]).longValue());
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
               stmt.setVarchar(12, (String)parms[22], 50, false);
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.LONGVARBINARY );
               }
               else
               {
                  stmt.setBLOBFile(1, (String)parms[1]);
               }
               stmt.setVarchar(2, (String)parms[2], 50, false);
               return;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               return;
      }
   }

}

