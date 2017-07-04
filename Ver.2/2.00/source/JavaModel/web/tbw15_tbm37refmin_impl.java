/*
               File: tbw15_tbm37refmin_impl
        Description: CRFドメインマッピング参照ワーク
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:16:40.23
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbw15_tbm37refmin_impl extends GXWebPanel
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
         Form.getMeta().addItem("description", "CRFドメインマッピング参照ワーク", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTBW15_SESSION_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Style2");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tbw15_tbm37refmin_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbw15_tbm37refmin_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbw15_tbm37refmin_impl.class ));
   }

   public tbw15_tbm37refmin_impl( int remoteHandle ,
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
         wb_table1_2_1L64( true) ;
      }
      return  ;
   }

   public void wb_table1_2_1L64e( boolean wbgen )
   {
      if ( wbgen )
      {
         renderHtmlCloseForm1L64( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void wb_table1_2_1L64( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableBorder100x100", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_1L64( true) ;
      }
      return  ;
   }

   public void wb_table2_5_1L64e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Control Group */
         GxWebStd.gx_group_start( httpContext, grpGroupdata_Internalname, "CRFドメインマッピング参照ワーク", 1, 0, "px", 0, "px", "Group", "", "HLP_TBW15_TBM37REFMIN.htm");
         wb_table3_28_1L64( true) ;
      }
      return  ;
   }

   public void wb_table3_28_1L64e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_1L64e( true) ;
      }
      else
      {
         wb_table1_2_1L64e( false) ;
      }
   }

   public void wb_table3_28_1L64( boolean wbgen )
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
         wb_table4_34_1L64( true) ;
      }
      return  ;
   }

   public void wb_table4_34_1L64e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBW15_TBM37REFMIN.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBW15_TBM37REFMIN.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBW15_TBM37REFMIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_28_1L64e( true) ;
      }
      else
      {
         wb_table3_28_1L64e( false) ;
      }
   }

   public void wb_table4_34_1L64( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw15_session_id_Internalname, "ID", "", "", lblTextblocktbw15_session_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW15_TBM37REFMIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW15_SESSION_ID_Internalname, GXutil.rtrim( A961TBW15_SESSION_ID), GXutil.rtrim( localUtil.format( A961TBW15_SESSION_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW15_SESSION_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW15_SESSION_ID_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_SESSION_ID", "left", "HLP_TBW15_TBM37REFMIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw15_datetime_Internalname, "実行日時", "", "", lblTextblocktbw15_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW15_TBM37REFMIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTBW15_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW15_DATETIME_Internalname, localUtil.format(A962TBW15_DATETIME, "99/99/99 99:99"), localUtil.format( A962TBW15_DATETIME, "99/99/99 99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'YMD',5,24,'jap',false,0);"+";gx.evt.onblur(44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW15_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW15_DATETIME_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBW15_TBM37REFMIN.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBW15_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTBW15_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBW15_TBM37REFMIN.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw15_study_id_Internalname, "ID", "", "", lblTextblocktbw15_study_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW15_TBM37REFMIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW15_STUDY_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A958TBW15_STUDY_ID, (byte)(10), (byte)(0), ".", "")), ((edtTBW15_STUDY_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A958TBW15_STUDY_ID), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A958TBW15_STUDY_ID), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW15_STUDY_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW15_STUDY_ID_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_STUDY_ID", "right", "HLP_TBW15_TBM37REFMIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw15_crf_id_Internalname, "CRFID", "", "", lblTextblocktbw15_crf_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW15_TBM37REFMIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW15_CRF_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A959TBW15_CRF_ID, (byte)(4), (byte)(0), ".", "")), ((edtTBW15_CRF_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A959TBW15_CRF_ID), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A959TBW15_CRF_ID), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW15_CRF_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW15_CRF_ID_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_CRF_ID", "right", "HLP_TBW15_TBM37REFMIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw15_dom_var_nm_Internalname, "ドメイン変数名", "", "", lblTextblocktbw15_dom_var_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW15_TBM37REFMIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW15_DOM_VAR_NM_Internalname, GXutil.rtrim( A960TBW15_DOM_VAR_NM), GXutil.rtrim( localUtil.format( A960TBW15_DOM_VAR_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW15_DOM_VAR_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW15_DOM_VAR_NM_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_DOM_VAR_NM", "left", "HLP_TBW15_TBM37REFMIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_34_1L64e( true) ;
      }
      else
      {
         wb_table4_34_1L64e( false) ;
      }
   }

   public void wb_table2_5_1L64( boolean wbgen )
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
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW15_TBM37REFMIN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW15_TBM37REFMIN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW15_TBM37REFMIN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW15_TBM37REFMIN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW15_TBM37REFMIN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW15_TBM37REFMIN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW15_TBM37REFMIN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW15_TBM37REFMIN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW15_TBM37REFMIN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW15_TBM37REFMIN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW15_TBM37REFMIN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW15_TBM37REFMIN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW15_TBM37REFMIN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW15_TBM37REFMIN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW15_TBM37REFMIN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW15_TBM37REFMIN.htm");
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
         wb_table2_5_1L64e( true) ;
      }
      else
      {
         wb_table2_5_1L64e( false) ;
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
            A961TBW15_SESSION_ID = httpContext.cgiGet( edtTBW15_SESSION_ID_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A961TBW15_SESSION_ID", A961TBW15_SESSION_ID);
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBW15_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TBW15_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW15_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A962TBW15_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               httpContext.ajax_rsp_assign_attri("", false, "A962TBW15_DATETIME", localUtil.ttoc( A962TBW15_DATETIME, 8, 5, 0, 1, "/", ":", " "));
            }
            else
            {
               A962TBW15_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBW15_DATETIME_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A962TBW15_DATETIME", localUtil.ttoc( A962TBW15_DATETIME, 8, 5, 0, 1, "/", ":", " "));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW15_STUDY_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW15_STUDY_ID_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW15_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW15_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A958TBW15_STUDY_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A958TBW15_STUDY_ID", GXutil.ltrim( GXutil.str( A958TBW15_STUDY_ID, 10, 0)));
            }
            else
            {
               A958TBW15_STUDY_ID = localUtil.ctol( httpContext.cgiGet( edtTBW15_STUDY_ID_Internalname), ".", ",") ;
               httpContext.ajax_rsp_assign_attri("", false, "A958TBW15_STUDY_ID", GXutil.ltrim( GXutil.str( A958TBW15_STUDY_ID, 10, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW15_CRF_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW15_CRF_ID_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW15_CRF_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW15_CRF_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A959TBW15_CRF_ID = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A959TBW15_CRF_ID", GXutil.ltrim( GXutil.str( A959TBW15_CRF_ID, 4, 0)));
            }
            else
            {
               A959TBW15_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( edtTBW15_CRF_ID_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A959TBW15_CRF_ID", GXutil.ltrim( GXutil.str( A959TBW15_CRF_ID, 4, 0)));
            }
            A960TBW15_DOM_VAR_NM = httpContext.cgiGet( edtTBW15_DOM_VAR_NM_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A960TBW15_DOM_VAR_NM", A960TBW15_DOM_VAR_NM);
            /* Read saved values. */
            Z961TBW15_SESSION_ID = httpContext.cgiGet( "Z961TBW15_SESSION_ID") ;
            Z962TBW15_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z962TBW15_DATETIME"), 0) ;
            Z958TBW15_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "Z958TBW15_STUDY_ID"), ".", ",") ;
            Z959TBW15_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( "Z959TBW15_CRF_ID"), ".", ",")) ;
            Z960TBW15_DOM_VAR_NM = httpContext.cgiGet( "Z960TBW15_DOM_VAR_NM") ;
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
               A961TBW15_SESSION_ID = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A961TBW15_SESSION_ID", A961TBW15_SESSION_ID);
               A962TBW15_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A962TBW15_DATETIME", localUtil.ttoc( A962TBW15_DATETIME, 8, 5, 0, 1, "/", ":", " "));
               A958TBW15_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A958TBW15_STUDY_ID", GXutil.ltrim( GXutil.str( A958TBW15_STUDY_ID, 10, 0)));
               A959TBW15_CRF_ID = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A959TBW15_CRF_ID", GXutil.ltrim( GXutil.str( A959TBW15_CRF_ID, 4, 0)));
               A960TBW15_DOM_VAR_NM = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A960TBW15_DOM_VAR_NM", A960TBW15_DOM_VAR_NM);
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
            initAll1L64( ) ;
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
      disableAttributes1L64( ) ;
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

   public void resetCaption1L0( )
   {
   }

   public void zm1L64( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -2 )
      {
         Z961TBW15_SESSION_ID = A961TBW15_SESSION_ID ;
         Z962TBW15_DATETIME = A962TBW15_DATETIME ;
         Z958TBW15_STUDY_ID = A958TBW15_STUDY_ID ;
         Z959TBW15_CRF_ID = A959TBW15_CRF_ID ;
         Z960TBW15_DOM_VAR_NM = A960TBW15_DOM_VAR_NM ;
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

   public void load1L64( )
   {
      /* Using cursor T001L4 */
      pr_default.execute(2, new Object[] {A961TBW15_SESSION_ID, A962TBW15_DATETIME, new Long(A958TBW15_STUDY_ID), new Short(A959TBW15_CRF_ID), A960TBW15_DOM_VAR_NM});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound64 = (short)(1) ;
         zm1L64( -2) ;
      }
      pr_default.close(2);
      onLoadActions1L64( ) ;
   }

   public void onLoadActions1L64( )
   {
   }

   public void checkExtendedTable1L64( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      if ( ! ( GXutil.nullDate().equals(A962TBW15_DATETIME) || (( A962TBW15_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A962TBW15_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　実行日時 は範囲外です", "OutOfRange", 1, "TBW15_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBW15_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1L64( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1L64( )
   {
      /* Using cursor T001L5 */
      pr_default.execute(3, new Object[] {A961TBW15_SESSION_ID, A962TBW15_DATETIME, new Long(A958TBW15_STUDY_ID), new Short(A959TBW15_CRF_ID), A960TBW15_DOM_VAR_NM});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound64 = (short)(1) ;
      }
      else
      {
         RcdFound64 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T001L3 */
      pr_default.execute(1, new Object[] {A961TBW15_SESSION_ID, A962TBW15_DATETIME, new Long(A958TBW15_STUDY_ID), new Short(A959TBW15_CRF_ID), A960TBW15_DOM_VAR_NM});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1L64( 2) ;
         RcdFound64 = (short)(1) ;
         A961TBW15_SESSION_ID = T001L3_A961TBW15_SESSION_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A961TBW15_SESSION_ID", A961TBW15_SESSION_ID);
         A962TBW15_DATETIME = T001L3_A962TBW15_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A962TBW15_DATETIME", localUtil.ttoc( A962TBW15_DATETIME, 8, 5, 0, 1, "/", ":", " "));
         A958TBW15_STUDY_ID = T001L3_A958TBW15_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A958TBW15_STUDY_ID", GXutil.ltrim( GXutil.str( A958TBW15_STUDY_ID, 10, 0)));
         A959TBW15_CRF_ID = T001L3_A959TBW15_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A959TBW15_CRF_ID", GXutil.ltrim( GXutil.str( A959TBW15_CRF_ID, 4, 0)));
         A960TBW15_DOM_VAR_NM = T001L3_A960TBW15_DOM_VAR_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A960TBW15_DOM_VAR_NM", A960TBW15_DOM_VAR_NM);
         Z961TBW15_SESSION_ID = A961TBW15_SESSION_ID ;
         Z962TBW15_DATETIME = A962TBW15_DATETIME ;
         Z958TBW15_STUDY_ID = A958TBW15_STUDY_ID ;
         Z959TBW15_CRF_ID = A959TBW15_CRF_ID ;
         Z960TBW15_DOM_VAR_NM = A960TBW15_DOM_VAR_NM ;
         sMode64 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1L64( ) ;
         if ( AnyError == 1 )
         {
            RcdFound64 = (short)(0) ;
            initializeNonKey1L64( ) ;
         }
         Gx_mode = sMode64 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound64 = (short)(0) ;
         initializeNonKey1L64( ) ;
         sMode64 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode64 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1L64( ) ;
      if ( RcdFound64 == 0 )
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
      RcdFound64 = (short)(0) ;
      /* Using cursor T001L6 */
      pr_default.execute(4, new Object[] {A961TBW15_SESSION_ID, A961TBW15_SESSION_ID, A962TBW15_DATETIME, A962TBW15_DATETIME, A961TBW15_SESSION_ID, new Long(A958TBW15_STUDY_ID), new Long(A958TBW15_STUDY_ID), A962TBW15_DATETIME, A961TBW15_SESSION_ID, new Short(A959TBW15_CRF_ID), new Short(A959TBW15_CRF_ID), new Long(A958TBW15_STUDY_ID), A962TBW15_DATETIME, A961TBW15_SESSION_ID, A960TBW15_DOM_VAR_NM});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T001L6_A961TBW15_SESSION_ID[0], A961TBW15_SESSION_ID) < 0 ) || ( GXutil.strcmp(T001L6_A961TBW15_SESSION_ID[0], A961TBW15_SESSION_ID) == 0 ) && T001L6_A962TBW15_DATETIME[0].before( A962TBW15_DATETIME ) || T001L6_A962TBW15_DATETIME[0].equals( A962TBW15_DATETIME ) && ( GXutil.strcmp(T001L6_A961TBW15_SESSION_ID[0], A961TBW15_SESSION_ID) == 0 ) && ( T001L6_A958TBW15_STUDY_ID[0] < A958TBW15_STUDY_ID ) || ( T001L6_A958TBW15_STUDY_ID[0] == A958TBW15_STUDY_ID ) && T001L6_A962TBW15_DATETIME[0].equals( A962TBW15_DATETIME ) && ( GXutil.strcmp(T001L6_A961TBW15_SESSION_ID[0], A961TBW15_SESSION_ID) == 0 ) && ( T001L6_A959TBW15_CRF_ID[0] < A959TBW15_CRF_ID ) || ( T001L6_A959TBW15_CRF_ID[0] == A959TBW15_CRF_ID ) && ( T001L6_A958TBW15_STUDY_ID[0] == A958TBW15_STUDY_ID ) && T001L6_A962TBW15_DATETIME[0].equals( A962TBW15_DATETIME ) && ( GXutil.strcmp(T001L6_A961TBW15_SESSION_ID[0], A961TBW15_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001L6_A960TBW15_DOM_VAR_NM[0], A960TBW15_DOM_VAR_NM) < 0 ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T001L6_A961TBW15_SESSION_ID[0], A961TBW15_SESSION_ID) > 0 ) || ( GXutil.strcmp(T001L6_A961TBW15_SESSION_ID[0], A961TBW15_SESSION_ID) == 0 ) && T001L6_A962TBW15_DATETIME[0].after( A962TBW15_DATETIME ) || T001L6_A962TBW15_DATETIME[0].equals( A962TBW15_DATETIME ) && ( GXutil.strcmp(T001L6_A961TBW15_SESSION_ID[0], A961TBW15_SESSION_ID) == 0 ) && ( T001L6_A958TBW15_STUDY_ID[0] > A958TBW15_STUDY_ID ) || ( T001L6_A958TBW15_STUDY_ID[0] == A958TBW15_STUDY_ID ) && T001L6_A962TBW15_DATETIME[0].equals( A962TBW15_DATETIME ) && ( GXutil.strcmp(T001L6_A961TBW15_SESSION_ID[0], A961TBW15_SESSION_ID) == 0 ) && ( T001L6_A959TBW15_CRF_ID[0] > A959TBW15_CRF_ID ) || ( T001L6_A959TBW15_CRF_ID[0] == A959TBW15_CRF_ID ) && ( T001L6_A958TBW15_STUDY_ID[0] == A958TBW15_STUDY_ID ) && T001L6_A962TBW15_DATETIME[0].equals( A962TBW15_DATETIME ) && ( GXutil.strcmp(T001L6_A961TBW15_SESSION_ID[0], A961TBW15_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001L6_A960TBW15_DOM_VAR_NM[0], A960TBW15_DOM_VAR_NM) > 0 ) ) )
         {
            A961TBW15_SESSION_ID = T001L6_A961TBW15_SESSION_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A961TBW15_SESSION_ID", A961TBW15_SESSION_ID);
            A962TBW15_DATETIME = T001L6_A962TBW15_DATETIME[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A962TBW15_DATETIME", localUtil.ttoc( A962TBW15_DATETIME, 8, 5, 0, 1, "/", ":", " "));
            A958TBW15_STUDY_ID = T001L6_A958TBW15_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A958TBW15_STUDY_ID", GXutil.ltrim( GXutil.str( A958TBW15_STUDY_ID, 10, 0)));
            A959TBW15_CRF_ID = T001L6_A959TBW15_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A959TBW15_CRF_ID", GXutil.ltrim( GXutil.str( A959TBW15_CRF_ID, 4, 0)));
            A960TBW15_DOM_VAR_NM = T001L6_A960TBW15_DOM_VAR_NM[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A960TBW15_DOM_VAR_NM", A960TBW15_DOM_VAR_NM);
            RcdFound64 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound64 = (short)(0) ;
      /* Using cursor T001L7 */
      pr_default.execute(5, new Object[] {A961TBW15_SESSION_ID, A961TBW15_SESSION_ID, A962TBW15_DATETIME, A962TBW15_DATETIME, A961TBW15_SESSION_ID, new Long(A958TBW15_STUDY_ID), new Long(A958TBW15_STUDY_ID), A962TBW15_DATETIME, A961TBW15_SESSION_ID, new Short(A959TBW15_CRF_ID), new Short(A959TBW15_CRF_ID), new Long(A958TBW15_STUDY_ID), A962TBW15_DATETIME, A961TBW15_SESSION_ID, A960TBW15_DOM_VAR_NM});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T001L7_A961TBW15_SESSION_ID[0], A961TBW15_SESSION_ID) > 0 ) || ( GXutil.strcmp(T001L7_A961TBW15_SESSION_ID[0], A961TBW15_SESSION_ID) == 0 ) && T001L7_A962TBW15_DATETIME[0].after( A962TBW15_DATETIME ) || T001L7_A962TBW15_DATETIME[0].equals( A962TBW15_DATETIME ) && ( GXutil.strcmp(T001L7_A961TBW15_SESSION_ID[0], A961TBW15_SESSION_ID) == 0 ) && ( T001L7_A958TBW15_STUDY_ID[0] > A958TBW15_STUDY_ID ) || ( T001L7_A958TBW15_STUDY_ID[0] == A958TBW15_STUDY_ID ) && T001L7_A962TBW15_DATETIME[0].equals( A962TBW15_DATETIME ) && ( GXutil.strcmp(T001L7_A961TBW15_SESSION_ID[0], A961TBW15_SESSION_ID) == 0 ) && ( T001L7_A959TBW15_CRF_ID[0] > A959TBW15_CRF_ID ) || ( T001L7_A959TBW15_CRF_ID[0] == A959TBW15_CRF_ID ) && ( T001L7_A958TBW15_STUDY_ID[0] == A958TBW15_STUDY_ID ) && T001L7_A962TBW15_DATETIME[0].equals( A962TBW15_DATETIME ) && ( GXutil.strcmp(T001L7_A961TBW15_SESSION_ID[0], A961TBW15_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001L7_A960TBW15_DOM_VAR_NM[0], A960TBW15_DOM_VAR_NM) > 0 ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T001L7_A961TBW15_SESSION_ID[0], A961TBW15_SESSION_ID) < 0 ) || ( GXutil.strcmp(T001L7_A961TBW15_SESSION_ID[0], A961TBW15_SESSION_ID) == 0 ) && T001L7_A962TBW15_DATETIME[0].before( A962TBW15_DATETIME ) || T001L7_A962TBW15_DATETIME[0].equals( A962TBW15_DATETIME ) && ( GXutil.strcmp(T001L7_A961TBW15_SESSION_ID[0], A961TBW15_SESSION_ID) == 0 ) && ( T001L7_A958TBW15_STUDY_ID[0] < A958TBW15_STUDY_ID ) || ( T001L7_A958TBW15_STUDY_ID[0] == A958TBW15_STUDY_ID ) && T001L7_A962TBW15_DATETIME[0].equals( A962TBW15_DATETIME ) && ( GXutil.strcmp(T001L7_A961TBW15_SESSION_ID[0], A961TBW15_SESSION_ID) == 0 ) && ( T001L7_A959TBW15_CRF_ID[0] < A959TBW15_CRF_ID ) || ( T001L7_A959TBW15_CRF_ID[0] == A959TBW15_CRF_ID ) && ( T001L7_A958TBW15_STUDY_ID[0] == A958TBW15_STUDY_ID ) && T001L7_A962TBW15_DATETIME[0].equals( A962TBW15_DATETIME ) && ( GXutil.strcmp(T001L7_A961TBW15_SESSION_ID[0], A961TBW15_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001L7_A960TBW15_DOM_VAR_NM[0], A960TBW15_DOM_VAR_NM) < 0 ) ) )
         {
            A961TBW15_SESSION_ID = T001L7_A961TBW15_SESSION_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A961TBW15_SESSION_ID", A961TBW15_SESSION_ID);
            A962TBW15_DATETIME = T001L7_A962TBW15_DATETIME[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A962TBW15_DATETIME", localUtil.ttoc( A962TBW15_DATETIME, 8, 5, 0, 1, "/", ":", " "));
            A958TBW15_STUDY_ID = T001L7_A958TBW15_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A958TBW15_STUDY_ID", GXutil.ltrim( GXutil.str( A958TBW15_STUDY_ID, 10, 0)));
            A959TBW15_CRF_ID = T001L7_A959TBW15_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A959TBW15_CRF_ID", GXutil.ltrim( GXutil.str( A959TBW15_CRF_ID, 4, 0)));
            A960TBW15_DOM_VAR_NM = T001L7_A960TBW15_DOM_VAR_NM[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A960TBW15_DOM_VAR_NM", A960TBW15_DOM_VAR_NM);
            RcdFound64 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1L64( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtTBW15_SESSION_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1L64( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound64 == 1 )
         {
            if ( ( GXutil.strcmp(A961TBW15_SESSION_ID, Z961TBW15_SESSION_ID) != 0 ) || !( A962TBW15_DATETIME.equals( Z962TBW15_DATETIME ) ) || ( A958TBW15_STUDY_ID != Z958TBW15_STUDY_ID ) || ( A959TBW15_CRF_ID != Z959TBW15_CRF_ID ) || ( GXutil.strcmp(A960TBW15_DOM_VAR_NM, Z960TBW15_DOM_VAR_NM) != 0 ) )
            {
               A961TBW15_SESSION_ID = Z961TBW15_SESSION_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A961TBW15_SESSION_ID", A961TBW15_SESSION_ID);
               A962TBW15_DATETIME = Z962TBW15_DATETIME ;
               httpContext.ajax_rsp_assign_attri("", false, "A962TBW15_DATETIME", localUtil.ttoc( A962TBW15_DATETIME, 8, 5, 0, 1, "/", ":", " "));
               A958TBW15_STUDY_ID = Z958TBW15_STUDY_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A958TBW15_STUDY_ID", GXutil.ltrim( GXutil.str( A958TBW15_STUDY_ID, 10, 0)));
               A959TBW15_CRF_ID = Z959TBW15_CRF_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A959TBW15_CRF_ID", GXutil.ltrim( GXutil.str( A959TBW15_CRF_ID, 4, 0)));
               A960TBW15_DOM_VAR_NM = Z960TBW15_DOM_VAR_NM ;
               httpContext.ajax_rsp_assign_attri("", false, "A960TBW15_DOM_VAR_NM", A960TBW15_DOM_VAR_NM);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TBW15_SESSION_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW15_SESSION_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTBW15_SESSION_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1L64( ) ;
               GX_FocusControl = edtTBW15_SESSION_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A961TBW15_SESSION_ID, Z961TBW15_SESSION_ID) != 0 ) || !( A962TBW15_DATETIME.equals( Z962TBW15_DATETIME ) ) || ( A958TBW15_STUDY_ID != Z958TBW15_STUDY_ID ) || ( A959TBW15_CRF_ID != Z959TBW15_CRF_ID ) || ( GXutil.strcmp(A960TBW15_DOM_VAR_NM, Z960TBW15_DOM_VAR_NM) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTBW15_SESSION_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1L64( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TBW15_SESSION_ID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTBW15_SESSION_ID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtTBW15_SESSION_ID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1L64( ) ;
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
      if ( ( GXutil.strcmp(A961TBW15_SESSION_ID, Z961TBW15_SESSION_ID) != 0 ) || !( A962TBW15_DATETIME.equals( Z962TBW15_DATETIME ) ) || ( A958TBW15_STUDY_ID != Z958TBW15_STUDY_ID ) || ( A959TBW15_CRF_ID != Z959TBW15_CRF_ID ) || ( GXutil.strcmp(A960TBW15_DOM_VAR_NM, Z960TBW15_DOM_VAR_NM) != 0 ) )
      {
         A961TBW15_SESSION_ID = Z961TBW15_SESSION_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A961TBW15_SESSION_ID", A961TBW15_SESSION_ID);
         A962TBW15_DATETIME = Z962TBW15_DATETIME ;
         httpContext.ajax_rsp_assign_attri("", false, "A962TBW15_DATETIME", localUtil.ttoc( A962TBW15_DATETIME, 8, 5, 0, 1, "/", ":", " "));
         A958TBW15_STUDY_ID = Z958TBW15_STUDY_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A958TBW15_STUDY_ID", GXutil.ltrim( GXutil.str( A958TBW15_STUDY_ID, 10, 0)));
         A959TBW15_CRF_ID = Z959TBW15_CRF_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A959TBW15_CRF_ID", GXutil.ltrim( GXutil.str( A959TBW15_CRF_ID, 4, 0)));
         A960TBW15_DOM_VAR_NM = Z960TBW15_DOM_VAR_NM ;
         httpContext.ajax_rsp_assign_attri("", false, "A960TBW15_DOM_VAR_NM", A960TBW15_DOM_VAR_NM);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TBW15_SESSION_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBW15_SESSION_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTBW15_SESSION_ID_Internalname ;
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
      if ( RcdFound64 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TBW15_SESSION_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBW15_SESSION_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart1L64( ) ;
      if ( RcdFound64 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1L64( ) ;
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
      if ( RcdFound64 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
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
      if ( RcdFound64 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_last( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart1L64( ) ;
      if ( RcdFound64 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound64 != 0 )
         {
            scanNext1L64( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1L64( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1L64( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T001L2 */
         pr_default.execute(0, new Object[] {A961TBW15_SESSION_ID, A962TBW15_DATETIME, new Long(A958TBW15_STUDY_ID), new Short(A959TBW15_CRF_ID), A960TBW15_DOM_VAR_NM});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBW15_TBM37REFMIN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBW15_TBM37REFMIN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1L64( )
   {
      beforeValidate1L64( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1L64( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1L64( 0) ;
         checkOptimisticConcurrency1L64( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1L64( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1L64( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001L8 */
                  pr_default.execute(6, new Object[] {A961TBW15_SESSION_ID, A962TBW15_DATETIME, new Long(A958TBW15_STUDY_ID), new Short(A959TBW15_CRF_ID), A960TBW15_DOM_VAR_NM});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBW15_TBM37REFMIN") ;
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
                        resetCaption1L0( ) ;
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
            load1L64( ) ;
         }
         endLevel1L64( ) ;
      }
      closeExtendedTableCursors1L64( ) ;
   }

   public void update1L64( )
   {
      beforeValidate1L64( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1L64( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1L64( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1L64( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1L64( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table `TBW15_TBM37REFMIN` */
                  deferredUpdate1L64( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "", true);
                        resetCaption1L0( ) ;
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
         endLevel1L64( ) ;
      }
      closeExtendedTableCursors1L64( ) ;
   }

   public void deferredUpdate1L64( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1L64( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1L64( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1L64( ) ;
         afterConfirm1L64( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1L64( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T001L9 */
               pr_default.execute(7, new Object[] {A961TBW15_SESSION_ID, A962TBW15_DATETIME, new Long(A958TBW15_STUDY_ID), new Short(A959TBW15_CRF_ID), A960TBW15_DOM_VAR_NM});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TBW15_TBM37REFMIN") ;
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound64 == 0 )
                     {
                        initAll1L64( ) ;
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
                     resetCaption1L0( ) ;
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
      sMode64 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1L64( ) ;
      Gx_mode = sMode64 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1L64( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1L64( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1L64( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "tbw15_tbm37refmin");
         if ( AnyError == 0 )
         {
            confirmValues1L0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "tbw15_tbm37refmin");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1L64( )
   {
      /* Using cursor T001L10 */
      pr_default.execute(8);
      RcdFound64 = (short)(0) ;
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound64 = (short)(1) ;
         A961TBW15_SESSION_ID = T001L10_A961TBW15_SESSION_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A961TBW15_SESSION_ID", A961TBW15_SESSION_ID);
         A962TBW15_DATETIME = T001L10_A962TBW15_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A962TBW15_DATETIME", localUtil.ttoc( A962TBW15_DATETIME, 8, 5, 0, 1, "/", ":", " "));
         A958TBW15_STUDY_ID = T001L10_A958TBW15_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A958TBW15_STUDY_ID", GXutil.ltrim( GXutil.str( A958TBW15_STUDY_ID, 10, 0)));
         A959TBW15_CRF_ID = T001L10_A959TBW15_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A959TBW15_CRF_ID", GXutil.ltrim( GXutil.str( A959TBW15_CRF_ID, 4, 0)));
         A960TBW15_DOM_VAR_NM = T001L10_A960TBW15_DOM_VAR_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A960TBW15_DOM_VAR_NM", A960TBW15_DOM_VAR_NM);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1L64( )
   {
      /* Scan next routine */
      pr_default.readNext(8);
      RcdFound64 = (short)(0) ;
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound64 = (short)(1) ;
         A961TBW15_SESSION_ID = T001L10_A961TBW15_SESSION_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A961TBW15_SESSION_ID", A961TBW15_SESSION_ID);
         A962TBW15_DATETIME = T001L10_A962TBW15_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A962TBW15_DATETIME", localUtil.ttoc( A962TBW15_DATETIME, 8, 5, 0, 1, "/", ":", " "));
         A958TBW15_STUDY_ID = T001L10_A958TBW15_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A958TBW15_STUDY_ID", GXutil.ltrim( GXutil.str( A958TBW15_STUDY_ID, 10, 0)));
         A959TBW15_CRF_ID = T001L10_A959TBW15_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A959TBW15_CRF_ID", GXutil.ltrim( GXutil.str( A959TBW15_CRF_ID, 4, 0)));
         A960TBW15_DOM_VAR_NM = T001L10_A960TBW15_DOM_VAR_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A960TBW15_DOM_VAR_NM", A960TBW15_DOM_VAR_NM);
      }
   }

   public void scanEnd1L64( )
   {
      pr_default.close(8);
   }

   public void afterConfirm1L64( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1L64( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1L64( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1L64( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1L64( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1L64( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1L64( )
   {
      edtTBW15_SESSION_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW15_SESSION_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW15_SESSION_ID_Enabled, 5, 0)));
      edtTBW15_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW15_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW15_DATETIME_Enabled, 5, 0)));
      edtTBW15_STUDY_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW15_STUDY_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW15_STUDY_ID_Enabled, 5, 0)));
      edtTBW15_CRF_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW15_CRF_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW15_CRF_ID_Enabled, 5, 0)));
      edtTBW15_DOM_VAR_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW15_DOM_VAR_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW15_DOM_VAR_NM_Enabled, 5, 0)));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1L0( )
   {
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv());
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( "CRFドメインマッピング参照ワーク") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?2017731716411");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("tbw15_tbm37refmin") +"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm1L64( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z961TBW15_SESSION_ID", GXutil.rtrim( Z961TBW15_SESSION_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z962TBW15_DATETIME", localUtil.ttoc( Z962TBW15_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z958TBW15_STUDY_ID", GXutil.ltrim( localUtil.ntoc( Z958TBW15_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z959TBW15_CRF_ID", GXutil.ltrim( localUtil.ntoc( Z959TBW15_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z960TBW15_DOM_VAR_NM", GXutil.rtrim( Z960TBW15_DOM_VAR_NM));
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
      return "TBW15_TBM37REFMIN" ;
   }

   public String getPgmdesc( )
   {
      return "CRFドメインマッピング参照ワーク" ;
   }

   public void initializeNonKey1L64( )
   {
   }

   public void initAll1L64( )
   {
      A961TBW15_SESSION_ID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A961TBW15_SESSION_ID", A961TBW15_SESSION_ID);
      A962TBW15_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A962TBW15_DATETIME", localUtil.ttoc( A962TBW15_DATETIME, 8, 5, 0, 1, "/", ":", " "));
      A958TBW15_STUDY_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A958TBW15_STUDY_ID", GXutil.ltrim( GXutil.str( A958TBW15_STUDY_ID, 10, 0)));
      A959TBW15_CRF_ID = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A959TBW15_CRF_ID", GXutil.ltrim( GXutil.str( A959TBW15_CRF_ID, 4, 0)));
      A960TBW15_DOM_VAR_NM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A960TBW15_DOM_VAR_NM", A960TBW15_DOM_VAR_NM);
      initializeNonKey1L64( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2017731716413");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("tbw15_tbm37refmin.js", "?2017731716413");
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
      lblTextblocktbw15_session_id_Internalname = "TEXTBLOCKTBW15_SESSION_ID" ;
      edtTBW15_SESSION_ID_Internalname = "TBW15_SESSION_ID" ;
      lblTextblocktbw15_datetime_Internalname = "TEXTBLOCKTBW15_DATETIME" ;
      edtTBW15_DATETIME_Internalname = "TBW15_DATETIME" ;
      lblTextblocktbw15_study_id_Internalname = "TEXTBLOCKTBW15_STUDY_ID" ;
      edtTBW15_STUDY_ID_Internalname = "TBW15_STUDY_ID" ;
      lblTextblocktbw15_crf_id_Internalname = "TEXTBLOCKTBW15_CRF_ID" ;
      edtTBW15_CRF_ID_Internalname = "TBW15_CRF_ID" ;
      lblTextblocktbw15_dom_var_nm_Internalname = "TEXTBLOCKTBW15_DOM_VAR_NM" ;
      edtTBW15_DOM_VAR_NM_Internalname = "TBW15_DOM_VAR_NM" ;
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
      edtTBW15_DOM_VAR_NM_Jsonclick = "" ;
      edtTBW15_DOM_VAR_NM_Enabled = 1 ;
      edtTBW15_CRF_ID_Jsonclick = "" ;
      edtTBW15_CRF_ID_Enabled = 1 ;
      edtTBW15_STUDY_ID_Jsonclick = "" ;
      edtTBW15_STUDY_ID_Enabled = 1 ;
      edtTBW15_DATETIME_Jsonclick = "" ;
      edtTBW15_DATETIME_Enabled = 1 ;
      edtTBW15_SESSION_ID_Jsonclick = "" ;
      edtTBW15_SESSION_ID_Enabled = 1 ;
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
      if ( AnyError == 0 )
      {
         GX_FocusControl = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Tbw15_dom_var_nm( String GX_Parm1 ,
                                       java.util.Date GX_Parm2 ,
                                       long GX_Parm3 ,
                                       short GX_Parm4 ,
                                       String GX_Parm5 )
   {
      A961TBW15_SESSION_ID = GX_Parm1 ;
      A962TBW15_DATETIME = GX_Parm2 ;
      A958TBW15_STUDY_ID = GX_Parm3 ;
      A959TBW15_CRF_ID = GX_Parm4 ;
      A960TBW15_DOM_VAR_NM = GX_Parm5 ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.rtrim( Z961TBW15_SESSION_ID));
      isValidOutput.add(localUtil.ttoc( Z962TBW15_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z958TBW15_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z959TBW15_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z960TBW15_DOM_VAR_NM));
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
      Z961TBW15_SESSION_ID = "" ;
      Z962TBW15_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z960TBW15_DOM_VAR_NM = "" ;
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
      lblTextblocktbw15_session_id_Jsonclick = "" ;
      A961TBW15_SESSION_ID = "" ;
      lblTextblocktbw15_datetime_Jsonclick = "" ;
      A962TBW15_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbw15_study_id_Jsonclick = "" ;
      lblTextblocktbw15_crf_id_Jsonclick = "" ;
      lblTextblocktbw15_dom_var_nm_Jsonclick = "" ;
      A960TBW15_DOM_VAR_NM = "" ;
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
      T001L4_A961TBW15_SESSION_ID = new String[] {""} ;
      T001L4_A962TBW15_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001L4_A958TBW15_STUDY_ID = new long[1] ;
      T001L4_A959TBW15_CRF_ID = new short[1] ;
      T001L4_A960TBW15_DOM_VAR_NM = new String[] {""} ;
      T001L5_A961TBW15_SESSION_ID = new String[] {""} ;
      T001L5_A962TBW15_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001L5_A958TBW15_STUDY_ID = new long[1] ;
      T001L5_A959TBW15_CRF_ID = new short[1] ;
      T001L5_A960TBW15_DOM_VAR_NM = new String[] {""} ;
      T001L3_A961TBW15_SESSION_ID = new String[] {""} ;
      T001L3_A962TBW15_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001L3_A958TBW15_STUDY_ID = new long[1] ;
      T001L3_A959TBW15_CRF_ID = new short[1] ;
      T001L3_A960TBW15_DOM_VAR_NM = new String[] {""} ;
      sMode64 = "" ;
      T001L6_A961TBW15_SESSION_ID = new String[] {""} ;
      T001L6_A962TBW15_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001L6_A958TBW15_STUDY_ID = new long[1] ;
      T001L6_A959TBW15_CRF_ID = new short[1] ;
      T001L6_A960TBW15_DOM_VAR_NM = new String[] {""} ;
      T001L7_A961TBW15_SESSION_ID = new String[] {""} ;
      T001L7_A962TBW15_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001L7_A958TBW15_STUDY_ID = new long[1] ;
      T001L7_A959TBW15_CRF_ID = new short[1] ;
      T001L7_A960TBW15_DOM_VAR_NM = new String[] {""} ;
      T001L2_A961TBW15_SESSION_ID = new String[] {""} ;
      T001L2_A962TBW15_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001L2_A958TBW15_STUDY_ID = new long[1] ;
      T001L2_A959TBW15_CRF_ID = new short[1] ;
      T001L2_A960TBW15_DOM_VAR_NM = new String[] {""} ;
      T001L10_A961TBW15_SESSION_ID = new String[] {""} ;
      T001L10_A962TBW15_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001L10_A958TBW15_STUDY_ID = new long[1] ;
      T001L10_A959TBW15_CRF_ID = new short[1] ;
      T001L10_A960TBW15_DOM_VAR_NM = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      pr_default = new DataStoreProvider(context, remoteHandle, new tbw15_tbm37refmin__default(),
         new Object[] {
             new Object[] {
            T001L2_A961TBW15_SESSION_ID, T001L2_A962TBW15_DATETIME, T001L2_A958TBW15_STUDY_ID, T001L2_A959TBW15_CRF_ID, T001L2_A960TBW15_DOM_VAR_NM
            }
            , new Object[] {
            T001L3_A961TBW15_SESSION_ID, T001L3_A962TBW15_DATETIME, T001L3_A958TBW15_STUDY_ID, T001L3_A959TBW15_CRF_ID, T001L3_A960TBW15_DOM_VAR_NM
            }
            , new Object[] {
            T001L4_A961TBW15_SESSION_ID, T001L4_A962TBW15_DATETIME, T001L4_A958TBW15_STUDY_ID, T001L4_A959TBW15_CRF_ID, T001L4_A960TBW15_DOM_VAR_NM
            }
            , new Object[] {
            T001L5_A961TBW15_SESSION_ID, T001L5_A962TBW15_DATETIME, T001L5_A958TBW15_STUDY_ID, T001L5_A959TBW15_CRF_ID, T001L5_A960TBW15_DOM_VAR_NM
            }
            , new Object[] {
            T001L6_A961TBW15_SESSION_ID, T001L6_A962TBW15_DATETIME, T001L6_A958TBW15_STUDY_ID, T001L6_A959TBW15_CRF_ID, T001L6_A960TBW15_DOM_VAR_NM
            }
            , new Object[] {
            T001L7_A961TBW15_SESSION_ID, T001L7_A962TBW15_DATETIME, T001L7_A958TBW15_STUDY_ID, T001L7_A959TBW15_CRF_ID, T001L7_A960TBW15_DOM_VAR_NM
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T001L10_A961TBW15_SESSION_ID, T001L10_A962TBW15_DATETIME, T001L10_A958TBW15_STUDY_ID, T001L10_A959TBW15_CRF_ID, T001L10_A960TBW15_DOM_VAR_NM
            }
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short Z959TBW15_CRF_ID ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A959TBW15_CRF_ID ;
   private short RcdFound64 ;
   private int trnEnded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int edtTBW15_SESSION_ID_Enabled ;
   private int edtTBW15_DATETIME_Enabled ;
   private int edtTBW15_STUDY_ID_Enabled ;
   private int edtTBW15_CRF_ID_Enabled ;
   private int edtTBW15_DOM_VAR_NM_Enabled ;
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
   private long Z958TBW15_STUDY_ID ;
   private long A958TBW15_STUDY_ID ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTBW15_SESSION_ID_Internalname ;
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
   private String lblTextblocktbw15_session_id_Internalname ;
   private String lblTextblocktbw15_session_id_Jsonclick ;
   private String edtTBW15_SESSION_ID_Jsonclick ;
   private String lblTextblocktbw15_datetime_Internalname ;
   private String lblTextblocktbw15_datetime_Jsonclick ;
   private String edtTBW15_DATETIME_Internalname ;
   private String edtTBW15_DATETIME_Jsonclick ;
   private String lblTextblocktbw15_study_id_Internalname ;
   private String lblTextblocktbw15_study_id_Jsonclick ;
   private String edtTBW15_STUDY_ID_Internalname ;
   private String edtTBW15_STUDY_ID_Jsonclick ;
   private String lblTextblocktbw15_crf_id_Internalname ;
   private String lblTextblocktbw15_crf_id_Jsonclick ;
   private String edtTBW15_CRF_ID_Internalname ;
   private String edtTBW15_CRF_ID_Jsonclick ;
   private String lblTextblocktbw15_dom_var_nm_Internalname ;
   private String lblTextblocktbw15_dom_var_nm_Jsonclick ;
   private String edtTBW15_DOM_VAR_NM_Internalname ;
   private String edtTBW15_DOM_VAR_NM_Jsonclick ;
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
   private String sMode64 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date Z962TBW15_DATETIME ;
   private java.util.Date A962TBW15_DATETIME ;
   private boolean entryPointCalled ;
   private boolean wbErr ;
   private boolean toggleJsOutput ;
   private String Z961TBW15_SESSION_ID ;
   private String Z960TBW15_DOM_VAR_NM ;
   private String A961TBW15_SESSION_ID ;
   private String A960TBW15_DOM_VAR_NM ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private String[] T001L4_A961TBW15_SESSION_ID ;
   private java.util.Date[] T001L4_A962TBW15_DATETIME ;
   private long[] T001L4_A958TBW15_STUDY_ID ;
   private short[] T001L4_A959TBW15_CRF_ID ;
   private String[] T001L4_A960TBW15_DOM_VAR_NM ;
   private String[] T001L5_A961TBW15_SESSION_ID ;
   private java.util.Date[] T001L5_A962TBW15_DATETIME ;
   private long[] T001L5_A958TBW15_STUDY_ID ;
   private short[] T001L5_A959TBW15_CRF_ID ;
   private String[] T001L5_A960TBW15_DOM_VAR_NM ;
   private String[] T001L3_A961TBW15_SESSION_ID ;
   private java.util.Date[] T001L3_A962TBW15_DATETIME ;
   private long[] T001L3_A958TBW15_STUDY_ID ;
   private short[] T001L3_A959TBW15_CRF_ID ;
   private String[] T001L3_A960TBW15_DOM_VAR_NM ;
   private String[] T001L6_A961TBW15_SESSION_ID ;
   private java.util.Date[] T001L6_A962TBW15_DATETIME ;
   private long[] T001L6_A958TBW15_STUDY_ID ;
   private short[] T001L6_A959TBW15_CRF_ID ;
   private String[] T001L6_A960TBW15_DOM_VAR_NM ;
   private String[] T001L7_A961TBW15_SESSION_ID ;
   private java.util.Date[] T001L7_A962TBW15_DATETIME ;
   private long[] T001L7_A958TBW15_STUDY_ID ;
   private short[] T001L7_A959TBW15_CRF_ID ;
   private String[] T001L7_A960TBW15_DOM_VAR_NM ;
   private String[] T001L2_A961TBW15_SESSION_ID ;
   private java.util.Date[] T001L2_A962TBW15_DATETIME ;
   private long[] T001L2_A958TBW15_STUDY_ID ;
   private short[] T001L2_A959TBW15_CRF_ID ;
   private String[] T001L2_A960TBW15_DOM_VAR_NM ;
   private String[] T001L10_A961TBW15_SESSION_ID ;
   private java.util.Date[] T001L10_A962TBW15_DATETIME ;
   private long[] T001L10_A958TBW15_STUDY_ID ;
   private short[] T001L10_A959TBW15_CRF_ID ;
   private String[] T001L10_A960TBW15_DOM_VAR_NM ;
}

final  class tbw15_tbm37refmin__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T001L2", "SELECT `TBW15_SESSION_ID`, `TBW15_DATETIME`, `TBW15_STUDY_ID`, `TBW15_CRF_ID`, `TBW15_DOM_VAR_NM` FROM `TBW15_TBM37REFMIN` WHERE `TBW15_SESSION_ID` = ? AND `TBW15_DATETIME` = ? AND `TBW15_STUDY_ID` = ? AND `TBW15_CRF_ID` = ? AND `TBW15_DOM_VAR_NM` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001L3", "SELECT `TBW15_SESSION_ID`, `TBW15_DATETIME`, `TBW15_STUDY_ID`, `TBW15_CRF_ID`, `TBW15_DOM_VAR_NM` FROM `TBW15_TBM37REFMIN` WHERE `TBW15_SESSION_ID` = ? AND `TBW15_DATETIME` = ? AND `TBW15_STUDY_ID` = ? AND `TBW15_CRF_ID` = ? AND `TBW15_DOM_VAR_NM` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001L4", "SELECT TM1.`TBW15_SESSION_ID`, TM1.`TBW15_DATETIME`, TM1.`TBW15_STUDY_ID`, TM1.`TBW15_CRF_ID`, TM1.`TBW15_DOM_VAR_NM` FROM `TBW15_TBM37REFMIN` TM1 WHERE TM1.`TBW15_SESSION_ID` = ? and TM1.`TBW15_DATETIME` = ? and TM1.`TBW15_STUDY_ID` = ? and TM1.`TBW15_CRF_ID` = ? and TM1.`TBW15_DOM_VAR_NM` = ? ORDER BY TM1.`TBW15_SESSION_ID`, TM1.`TBW15_DATETIME`, TM1.`TBW15_STUDY_ID`, TM1.`TBW15_CRF_ID`, TM1.`TBW15_DOM_VAR_NM` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T001L5", "SELECT `TBW15_SESSION_ID`, `TBW15_DATETIME`, `TBW15_STUDY_ID`, `TBW15_CRF_ID`, `TBW15_DOM_VAR_NM` FROM `TBW15_TBM37REFMIN` WHERE `TBW15_SESSION_ID` = ? AND `TBW15_DATETIME` = ? AND `TBW15_STUDY_ID` = ? AND `TBW15_CRF_ID` = ? AND `TBW15_DOM_VAR_NM` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001L6", "SELECT `TBW15_SESSION_ID`, `TBW15_DATETIME`, `TBW15_STUDY_ID`, `TBW15_CRF_ID`, `TBW15_DOM_VAR_NM` FROM `TBW15_TBM37REFMIN` WHERE ( `TBW15_SESSION_ID` > ? or `TBW15_SESSION_ID` = ? and `TBW15_DATETIME` > ? or `TBW15_DATETIME` = ? and `TBW15_SESSION_ID` = ? and `TBW15_STUDY_ID` > ? or `TBW15_STUDY_ID` = ? and `TBW15_DATETIME` = ? and `TBW15_SESSION_ID` = ? and `TBW15_CRF_ID` > ? or `TBW15_CRF_ID` = ? and `TBW15_STUDY_ID` = ? and `TBW15_DATETIME` = ? and `TBW15_SESSION_ID` = ? and `TBW15_DOM_VAR_NM` > ?) ORDER BY `TBW15_SESSION_ID`, `TBW15_DATETIME`, `TBW15_STUDY_ID`, `TBW15_CRF_ID`, `TBW15_DOM_VAR_NM`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T001L7", "SELECT `TBW15_SESSION_ID`, `TBW15_DATETIME`, `TBW15_STUDY_ID`, `TBW15_CRF_ID`, `TBW15_DOM_VAR_NM` FROM `TBW15_TBM37REFMIN` WHERE ( `TBW15_SESSION_ID` < ? or `TBW15_SESSION_ID` = ? and `TBW15_DATETIME` < ? or `TBW15_DATETIME` = ? and `TBW15_SESSION_ID` = ? and `TBW15_STUDY_ID` < ? or `TBW15_STUDY_ID` = ? and `TBW15_DATETIME` = ? and `TBW15_SESSION_ID` = ? and `TBW15_CRF_ID` < ? or `TBW15_CRF_ID` = ? and `TBW15_STUDY_ID` = ? and `TBW15_DATETIME` = ? and `TBW15_SESSION_ID` = ? and `TBW15_DOM_VAR_NM` < ?) ORDER BY `TBW15_SESSION_ID` DESC, `TBW15_DATETIME` DESC, `TBW15_STUDY_ID` DESC, `TBW15_CRF_ID` DESC, `TBW15_DOM_VAR_NM` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T001L8", "INSERT INTO `TBW15_TBM37REFMIN`(`TBW15_SESSION_ID`, `TBW15_DATETIME`, `TBW15_STUDY_ID`, `TBW15_CRF_ID`, `TBW15_DOM_VAR_NM`) VALUES(?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T001L9", "DELETE FROM `TBW15_TBM37REFMIN`  WHERE `TBW15_SESSION_ID` = ? AND `TBW15_DATETIME` = ? AND `TBW15_STUDY_ID` = ? AND `TBW15_CRF_ID` = ? AND `TBW15_DOM_VAR_NM` = ?", GX_NOMASK)
         ,new ForEachCursor("T001L10", "SELECT `TBW15_SESSION_ID`, `TBW15_DATETIME`, `TBW15_STUDY_ID`, `TBW15_CRF_ID`, `TBW15_DOM_VAR_NM` FROM `TBW15_TBM37REFMIN` ORDER BY `TBW15_SESSION_ID`, `TBW15_DATETIME`, `TBW15_STUDY_ID`, `TBW15_CRF_ID`, `TBW15_DOM_VAR_NM` ",true, GX_NOMASK, false, this,100,0,false )
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
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
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
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setVarchar(5, (String)parms[4], 50, false);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setVarchar(5, (String)parms[4], 50, false);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setVarchar(5, (String)parms[4], 50, false);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setVarchar(5, (String)parms[4], 50, false);
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 50, false);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setVarchar(5, (String)parms[4], 50, false);
               stmt.setLong(6, ((Number) parms[5]).longValue());
               stmt.setLong(7, ((Number) parms[6]).longValue());
               stmt.setDateTime(8, (java.util.Date)parms[7], false);
               stmt.setVarchar(9, (String)parms[8], 50, false);
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               stmt.setLong(12, ((Number) parms[11]).longValue());
               stmt.setDateTime(13, (java.util.Date)parms[12], false);
               stmt.setVarchar(14, (String)parms[13], 50, false);
               stmt.setVarchar(15, (String)parms[14], 50, false);
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 50, false);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setVarchar(5, (String)parms[4], 50, false);
               stmt.setLong(6, ((Number) parms[5]).longValue());
               stmt.setLong(7, ((Number) parms[6]).longValue());
               stmt.setDateTime(8, (java.util.Date)parms[7], false);
               stmt.setVarchar(9, (String)parms[8], 50, false);
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               stmt.setLong(12, ((Number) parms[11]).longValue());
               stmt.setDateTime(13, (java.util.Date)parms[12], false);
               stmt.setVarchar(14, (String)parms[13], 50, false);
               stmt.setVarchar(15, (String)parms[14], 50, false);
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setVarchar(5, (String)parms[4], 50, false);
               return;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setVarchar(5, (String)parms[4], 50, false);
               return;
      }
   }

}

