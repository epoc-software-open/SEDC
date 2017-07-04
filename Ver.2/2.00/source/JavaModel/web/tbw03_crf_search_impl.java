/*
               File: tbw03_crf_search_impl
        Description: CRF検索ワーク
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:16:10.64
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbw03_crf_search_impl extends GXWebPanel
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_9") == 0 )
      {
         A113TBW03_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
         httpContext.ajax_rsp_assign_attri("", false, "A113TBW03_STUDY_ID", GXutil.ltrim( GXutil.str( A113TBW03_STUDY_ID, 10, 0)));
         A115TBW03_CRF_ID = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A115TBW03_CRF_ID", GXutil.ltrim( GXutil.str( A115TBW03_CRF_ID, 4, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_9( A113TBW03_STUDY_ID, A115TBW03_CRF_ID) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_10") == 0 )
      {
         A120TBW03_SITE_ID = httpContext.GetNextPar( ) ;
         n120TBW03_SITE_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A120TBW03_SITE_ID", A120TBW03_SITE_ID);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_10( A120TBW03_SITE_ID) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_11") == 0 )
      {
         A116TBW03_LOCK_USER_ID = httpContext.GetNextPar( ) ;
         n116TBW03_LOCK_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A116TBW03_LOCK_USER_ID", A116TBW03_LOCK_USER_ID);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_11( A116TBW03_LOCK_USER_ID) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_12") == 0 )
      {
         A117TBW03_UPLOAD_USER_ID = httpContext.GetNextPar( ) ;
         n117TBW03_UPLOAD_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A117TBW03_UPLOAD_USER_ID", A117TBW03_UPLOAD_USER_ID);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_12( A117TBW03_UPLOAD_USER_ID) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_13") == 0 )
      {
         A118TBW03_APPROVAL_USER_ID = httpContext.GetNextPar( ) ;
         n118TBW03_APPROVAL_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A118TBW03_APPROVAL_USER_ID", A118TBW03_APPROVAL_USER_ID);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_13( A118TBW03_APPROVAL_USER_ID) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_14") == 0 )
      {
         A119TBW03_INPUT_END_USER_ID = httpContext.GetNextPar( ) ;
         n119TBW03_INPUT_END_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A119TBW03_INPUT_END_USER_ID", A119TBW03_INPUT_END_USER_ID);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_14( A119TBW03_INPUT_END_USER_ID) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_15") == 0 )
      {
         A121TBW03_CRT_USER_ID = httpContext.GetNextPar( ) ;
         n121TBW03_CRT_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A121TBW03_CRT_USER_ID", A121TBW03_CRT_USER_ID);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_15( A121TBW03_CRT_USER_ID) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_16") == 0 )
      {
         A122TBW03_UPD_USER_ID = httpContext.GetNextPar( ) ;
         n122TBW03_UPD_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A122TBW03_UPD_USER_ID", A122TBW03_UPD_USER_ID);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_16( A122TBW03_UPD_USER_ID) ;
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
         Form.getMeta().addItem("description", "CRF検索ワーク", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTBW03_SESSION_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Style2");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tbw03_crf_search_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbw03_crf_search_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbw03_crf_search_impl.class ));
   }

   public tbw03_crf_search_impl( int remoteHandle ,
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
         wb_table1_2_1641( true) ;
      }
      return  ;
   }

   public void wb_table1_2_1641e( boolean wbgen )
   {
      if ( wbgen )
      {
         renderHtmlCloseForm1641( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void wb_table1_2_1641( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableBorder100x100", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_1641( true) ;
      }
      return  ;
   }

   public void wb_table2_5_1641e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Control Group */
         GxWebStd.gx_group_start( httpContext, grpGroupdata_Internalname, "CRF検索ワーク", 1, 0, "px", 0, "px", "Group", "", "HLP_TBW03_CRF_SEARCH.htm");
         wb_table3_28_1641( true) ;
      }
      return  ;
   }

   public void wb_table3_28_1641e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_1641e( true) ;
      }
      else
      {
         wb_table1_2_1641e( false) ;
      }
   }

   public void wb_table3_28_1641( boolean wbgen )
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
         wb_table4_34_1641( true) ;
      }
      return  ;
   }

   public void wb_table4_34_1641e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 267,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBW03_CRF_SEARCH.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 268,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBW03_CRF_SEARCH.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 269,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_28_1641e( true) ;
      }
      else
      {
         wb_table3_28_1641e( false) ;
      }
   }

   public void wb_table4_34_1641( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_session_id_Internalname, "ID", "", "", lblTextblocktbw03_session_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_SESSION_ID_Internalname, GXutil.rtrim( A110TBW03_SESSION_ID), GXutil.rtrim( localUtil.format( A110TBW03_SESSION_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW03_SESSION_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW03_SESSION_ID_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_SESSION_ID", "left", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_app_id_Internalname, "ID", "", "", lblTextblocktbw03_app_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_APP_ID_Internalname, GXutil.rtrim( A111TBW03_APP_ID), GXutil.rtrim( localUtil.format( A111TBW03_APP_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW03_APP_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW03_APP_ID_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_APP_ID", "left", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_disp_datetime_Internalname, "表示日時", "", "", lblTextblocktbw03_disp_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_DISP_DATETIME_Internalname, GXutil.rtrim( A112TBW03_DISP_DATETIME), GXutil.rtrim( localUtil.format( A112TBW03_DISP_DATETIME, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW03_DISP_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW03_DISP_DATETIME_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_Y4MD_HMS_C", "left", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_study_id_Internalname, "ID", "", "", lblTextblocktbw03_study_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_STUDY_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A113TBW03_STUDY_ID, (byte)(10), (byte)(0), ".", "")), ((edtTBW03_STUDY_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A113TBW03_STUDY_ID), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A113TBW03_STUDY_ID), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW03_STUDY_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW03_STUDY_ID_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_STUDY_ID", "right", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_subject_id_Internalname, "ID", "", "", lblTextblocktbw03_subject_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_SUBJECT_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A114TBW03_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")), ((edtTBW03_SUBJECT_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A114TBW03_SUBJECT_ID), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A114TBW03_SUBJECT_ID), "ZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW03_SUBJECT_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW03_SUBJECT_ID_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_SUBJECT_ID", "right", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_crf_id_Internalname, "CRFID", "", "", lblTextblocktbw03_crf_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_CRF_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A115TBW03_CRF_ID, (byte)(4), (byte)(0), ".", "")), ((edtTBW03_CRF_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A115TBW03_CRF_ID), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A115TBW03_CRF_ID), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW03_CRF_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW03_CRF_ID_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_CRF_ID", "right", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_crf_nm_Internalname, "CRF名称", "", "", lblTextblocktbw03_crf_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_CRF_NM_Internalname, GXutil.rtrim( A710TBW03_CRF_NM), GXutil.rtrim( localUtil.format( A710TBW03_CRF_NM, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW03_CRF_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW03_CRF_NM_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_crf_snm_Internalname, "CRF略称", "", "", lblTextblocktbw03_crf_snm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_CRF_SNM_Internalname, GXutil.rtrim( A711TBW03_CRF_SNM), GXutil.rtrim( localUtil.format( A711TBW03_CRF_SNM, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW03_CRF_SNM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW03_CRF_SNM_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_crf_order_Internalname, "CRF表示順", "", "", lblTextblocktbw03_crf_order_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_CRF_ORDER_Internalname, GXutil.ltrim( localUtil.ntoc( A712TBW03_CRF_ORDER, (byte)(5), (byte)(0), ".", "")), ((edtTBW03_CRF_ORDER_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A712TBW03_CRF_ORDER), "ZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A712TBW03_CRF_ORDER), "ZZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW03_CRF_ORDER_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW03_CRF_ORDER_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_site_id_Internalname, "ID", "", "", lblTextblocktbw03_site_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_SITE_ID_Internalname, GXutil.rtrim( A120TBW03_SITE_ID), GXutil.rtrim( localUtil.format( A120TBW03_SITE_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW03_SITE_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW03_SITE_ID_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_SITE_ID", "left", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_site_nm_Internalname, "施設名", "", "", lblTextblocktbw03_site_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_SITE_NM_Internalname, GXutil.rtrim( A713TBW03_SITE_NM), GXutil.rtrim( localUtil.format( A713TBW03_SITE_NM, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW03_SITE_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW03_SITE_NM_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_site_ryak_nm_Internalname, "施設名（略称）", "", "", lblTextblocktbw03_site_ryak_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_SITE_RYAK_NM_Internalname, GXutil.rtrim( A714TBW03_SITE_RYAK_NM), GXutil.rtrim( localUtil.format( A714TBW03_SITE_RYAK_NM, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW03_SITE_RYAK_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW03_SITE_RYAK_NM_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_outer_subject_id_Internalname, "ID", "", "", lblTextblocktbw03_outer_subject_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_OUTER_SUBJECT_ID_Internalname, GXutil.rtrim( A715TBW03_OUTER_SUBJECT_ID), GXutil.rtrim( localUtil.format( A715TBW03_OUTER_SUBJECT_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW03_OUTER_SUBJECT_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW03_OUTER_SUBJECT_ID_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_crf_latest_version_Internalname, "CRF最新更新バージョン", "", "", lblTextblocktbw03_crf_latest_version_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_CRF_LATEST_VERSION_Internalname, GXutil.ltrim( localUtil.ntoc( A716TBW03_CRF_LATEST_VERSION, (byte)(4), (byte)(0), ".", "")), ((edtTBW03_CRF_LATEST_VERSION_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A716TBW03_CRF_LATEST_VERSION), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A716TBW03_CRF_LATEST_VERSION), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(104);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW03_CRF_LATEST_VERSION_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW03_CRF_LATEST_VERSION_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_crf_input_level_Internalname, "CRF入力権限レベル", "", "", lblTextblocktbw03_crf_input_level_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_CRF_INPUT_LEVEL_Internalname, GXutil.ltrim( localUtil.ntoc( A717TBW03_CRF_INPUT_LEVEL, (byte)(2), (byte)(0), ".", "")), ((edtTBW03_CRF_INPUT_LEVEL_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A717TBW03_CRF_INPUT_LEVEL), "Z9")) : localUtil.format( DecimalUtil.doubleToDec(A717TBW03_CRF_INPUT_LEVEL), "Z9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW03_CRF_INPUT_LEVEL_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW03_CRF_INPUT_LEVEL_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_lock_flg_Internalname, "ロックフラグ", "", "", lblTextblocktbw03_lock_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_LOCK_FLG_Internalname, GXutil.rtrim( A718TBW03_LOCK_FLG), GXutil.rtrim( localUtil.format( A718TBW03_LOCK_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(114);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW03_LOCK_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW03_LOCK_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_lock_datetime_Internalname, "ロック日時", "", "", lblTextblocktbw03_lock_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTBW03_LOCK_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_LOCK_DATETIME_Internalname, localUtil.format(A719TBW03_LOCK_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A719TBW03_LOCK_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(119);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW03_LOCK_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW03_LOCK_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TBW03_CRF_SEARCH.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBW03_LOCK_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTBW03_LOCK_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_lock_user_id_Internalname, "ID", "", "", lblTextblocktbw03_lock_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_LOCK_USER_ID_Internalname, GXutil.rtrim( A116TBW03_LOCK_USER_ID), GXutil.rtrim( localUtil.format( A116TBW03_LOCK_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(124);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW03_LOCK_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW03_LOCK_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_USER_ID", "left", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_lock_user_nm_Internalname, "ロックユーザー名", "", "", lblTextblocktbw03_lock_user_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_LOCK_USER_NM_Internalname, GXutil.rtrim( A720TBW03_LOCK_USER_NM), GXutil.rtrim( localUtil.format( A720TBW03_LOCK_USER_NM, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW03_LOCK_USER_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW03_LOCK_USER_NM_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_lock_auth_cd_Internalname, "ロック時権限コード", "", "", lblTextblocktbw03_lock_auth_cd_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 134,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_LOCK_AUTH_CD_Internalname, GXutil.rtrim( A721TBW03_LOCK_AUTH_CD), GXutil.rtrim( localUtil.format( A721TBW03_LOCK_AUTH_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(134);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW03_LOCK_AUTH_CD_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW03_LOCK_AUTH_CD_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_AUTH_CD", "left", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_upload_datetime_Internalname, "アップロード日時", "", "", lblTextblocktbw03_upload_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 139,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTBW03_UPLOAD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_UPLOAD_DATETIME_Internalname, localUtil.format(A722TBW03_UPLOAD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A722TBW03_UPLOAD_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(139);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW03_UPLOAD_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW03_UPLOAD_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TBW03_CRF_SEARCH.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBW03_UPLOAD_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTBW03_UPLOAD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_upload_user_id_Internalname, "ID", "", "", lblTextblocktbw03_upload_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 144,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_UPLOAD_USER_ID_Internalname, GXutil.rtrim( A117TBW03_UPLOAD_USER_ID), GXutil.rtrim( localUtil.format( A117TBW03_UPLOAD_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(144);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW03_UPLOAD_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW03_UPLOAD_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_USER_ID", "left", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_upload_user_nm_Internalname, "アップロードユーザー名", "", "", lblTextblocktbw03_upload_user_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_UPLOAD_USER_NM_Internalname, GXutil.rtrim( A723TBW03_UPLOAD_USER_NM), GXutil.rtrim( localUtil.format( A723TBW03_UPLOAD_USER_NM, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW03_UPLOAD_USER_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW03_UPLOAD_USER_NM_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_upload_auth_cd_Internalname, "アップロード時権限コード", "", "", lblTextblocktbw03_upload_auth_cd_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 154,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_UPLOAD_AUTH_CD_Internalname, GXutil.rtrim( A724TBW03_UPLOAD_AUTH_CD), GXutil.rtrim( localUtil.format( A724TBW03_UPLOAD_AUTH_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(154);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW03_UPLOAD_AUTH_CD_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW03_UPLOAD_AUTH_CD_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_AUTH_CD", "left", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_dm_arrival_flg_Internalname, "DM到着フラグ", "", "", lblTextblocktbw03_dm_arrival_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 159,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_DM_ARRIVAL_FLG_Internalname, GXutil.rtrim( A725TBW03_DM_ARRIVAL_FLG), GXutil.rtrim( localUtil.format( A725TBW03_DM_ARRIVAL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(159);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW03_DM_ARRIVAL_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW03_DM_ARRIVAL_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_dm_arrival_datetime_Internalname, "DM到着日時", "", "", lblTextblocktbw03_dm_arrival_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 164,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTBW03_DM_ARRIVAL_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_DM_ARRIVAL_DATETIME_Internalname, localUtil.format(A726TBW03_DM_ARRIVAL_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A726TBW03_DM_ARRIVAL_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(164);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW03_DM_ARRIVAL_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW03_DM_ARRIVAL_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TBW03_CRF_SEARCH.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBW03_DM_ARRIVAL_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTBW03_DM_ARRIVAL_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_approval_flg_Internalname, "承認フラグ", "", "", lblTextblocktbw03_approval_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 169,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_APPROVAL_FLG_Internalname, GXutil.rtrim( A727TBW03_APPROVAL_FLG), GXutil.rtrim( localUtil.format( A727TBW03_APPROVAL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(169);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW03_APPROVAL_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW03_APPROVAL_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_approval_datetime_Internalname, "承認日時", "", "", lblTextblocktbw03_approval_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 174,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTBW03_APPROVAL_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_APPROVAL_DATETIME_Internalname, localUtil.format(A728TBW03_APPROVAL_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A728TBW03_APPROVAL_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(174);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW03_APPROVAL_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW03_APPROVAL_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TBW03_CRF_SEARCH.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBW03_APPROVAL_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTBW03_APPROVAL_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_approval_user_id_Internalname, "ID", "", "", lblTextblocktbw03_approval_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 179,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_APPROVAL_USER_ID_Internalname, GXutil.rtrim( A118TBW03_APPROVAL_USER_ID), GXutil.rtrim( localUtil.format( A118TBW03_APPROVAL_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(179);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW03_APPROVAL_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW03_APPROVAL_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_USER_ID", "left", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_approval_user_nm_Internalname, "承認ユーザー名", "", "", lblTextblocktbw03_approval_user_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_APPROVAL_USER_NM_Internalname, GXutil.rtrim( A729TBW03_APPROVAL_USER_NM), GXutil.rtrim( localUtil.format( A729TBW03_APPROVAL_USER_NM, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW03_APPROVAL_USER_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW03_APPROVAL_USER_NM_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_approval_auth_cd_Internalname, "承認時権限コード", "", "", lblTextblocktbw03_approval_auth_cd_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 189,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_APPROVAL_AUTH_CD_Internalname, GXutil.rtrim( A730TBW03_APPROVAL_AUTH_CD), GXutil.rtrim( localUtil.format( A730TBW03_APPROVAL_AUTH_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(189);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW03_APPROVAL_AUTH_CD_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW03_APPROVAL_AUTH_CD_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_AUTH_CD", "left", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_input_end_flg_Internalname, "データ固定フラグ", "", "", lblTextblocktbw03_input_end_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 194,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_INPUT_END_FLG_Internalname, GXutil.rtrim( A731TBW03_INPUT_END_FLG), GXutil.rtrim( localUtil.format( A731TBW03_INPUT_END_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(194);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW03_INPUT_END_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW03_INPUT_END_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_input_end_datetime_Internalname, "データ固定日時", "", "", lblTextblocktbw03_input_end_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 199,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTBW03_INPUT_END_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_INPUT_END_DATETIME_Internalname, localUtil.format(A732TBW03_INPUT_END_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A732TBW03_INPUT_END_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(199);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW03_INPUT_END_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW03_INPUT_END_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TBW03_CRF_SEARCH.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBW03_INPUT_END_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTBW03_INPUT_END_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_input_end_user_id_Internalname, "ID", "", "", lblTextblocktbw03_input_end_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 204,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_INPUT_END_USER_ID_Internalname, GXutil.rtrim( A119TBW03_INPUT_END_USER_ID), GXutil.rtrim( localUtil.format( A119TBW03_INPUT_END_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(204);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW03_INPUT_END_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW03_INPUT_END_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_USER_ID", "left", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_input_end_user_nm_Internalname, "データ固定ユーザー名", "", "", lblTextblocktbw03_input_end_user_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_INPUT_END_USER_NM_Internalname, GXutil.rtrim( A733TBW03_INPUT_END_USER_NM), GXutil.rtrim( localUtil.format( A733TBW03_INPUT_END_USER_NM, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW03_INPUT_END_USER_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW03_INPUT_END_USER_NM_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_input_end_auth_cd_Internalname, "データ固定時権限コード", "", "", lblTextblocktbw03_input_end_auth_cd_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 214,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_INPUT_END_AUTH_CD_Internalname, GXutil.rtrim( A734TBW03_INPUT_END_AUTH_CD), GXutil.rtrim( localUtil.format( A734TBW03_INPUT_END_AUTH_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(214);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW03_INPUT_END_AUTH_CD_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW03_INPUT_END_AUTH_CD_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_AUTH_CD", "left", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_del_flg_Internalname, "削除フラグ", "", "", lblTextblocktbw03_del_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 219,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_DEL_FLG_Internalname, GXutil.rtrim( A780TBW03_DEL_FLG), GXutil.rtrim( localUtil.format( A780TBW03_DEL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(219);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW03_DEL_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW03_DEL_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_crt_datetime_Internalname, "作成日時", "", "", lblTextblocktbw03_crt_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 224,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTBW03_CRT_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_CRT_DATETIME_Internalname, localUtil.format(A781TBW03_CRT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A781TBW03_CRT_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(224);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW03_CRT_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW03_CRT_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TBW03_CRF_SEARCH.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBW03_CRT_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTBW03_CRT_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_crt_user_id_Internalname, "ID", "", "", lblTextblocktbw03_crt_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 229,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_CRT_USER_ID_Internalname, GXutil.rtrim( A121TBW03_CRT_USER_ID), GXutil.rtrim( localUtil.format( A121TBW03_CRT_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(229);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW03_CRT_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW03_CRT_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_USER_ID", "left", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_crt_user_nm_Internalname, "作成ユーザー名", "", "", lblTextblocktbw03_crt_user_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_CRT_USER_NM_Internalname, GXutil.rtrim( A782TBW03_CRT_USER_NM), GXutil.rtrim( localUtil.format( A782TBW03_CRT_USER_NM, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW03_CRT_USER_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW03_CRT_USER_NM_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_crt_prog_nm_Internalname, "作成プログラム名", "", "", lblTextblocktbw03_crt_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 239,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_CRT_PROG_NM_Internalname, GXutil.rtrim( A783TBW03_CRT_PROG_NM), GXutil.rtrim( localUtil.format( A783TBW03_CRT_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(239);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW03_CRT_PROG_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW03_CRT_PROG_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_PG_NM", "left", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_upd_datetime_Internalname, "更新日時", "", "", lblTextblocktbw03_upd_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 244,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTBW03_UPD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_UPD_DATETIME_Internalname, localUtil.format(A784TBW03_UPD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A784TBW03_UPD_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(244);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW03_UPD_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW03_UPD_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TBW03_CRF_SEARCH.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBW03_UPD_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTBW03_UPD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_upd_user_id_Internalname, "ID", "", "", lblTextblocktbw03_upd_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 249,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_UPD_USER_ID_Internalname, GXutil.rtrim( A122TBW03_UPD_USER_ID), GXutil.rtrim( localUtil.format( A122TBW03_UPD_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(249);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW03_UPD_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW03_UPD_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_USER_ID", "left", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_upd_user_nm_Internalname, "更新ユーザー名", "", "", lblTextblocktbw03_upd_user_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_UPD_USER_NM_Internalname, GXutil.rtrim( A785TBW03_UPD_USER_NM), GXutil.rtrim( localUtil.format( A785TBW03_UPD_USER_NM, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW03_UPD_USER_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW03_UPD_USER_NM_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_upd_prog_nm_Internalname, "更新プログラム名", "", "", lblTextblocktbw03_upd_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 259,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_UPD_PROG_NM_Internalname, GXutil.rtrim( A786TBW03_UPD_PROG_NM), GXutil.rtrim( localUtil.format( A786TBW03_UPD_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(259);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW03_UPD_PROG_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW03_UPD_PROG_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_PG_NM", "left", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_upd_cnt_Internalname, "更新カウント", "", "", lblTextblocktbw03_upd_cnt_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 264,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_UPD_CNT_Internalname, GXutil.ltrim( localUtil.ntoc( A787TBW03_UPD_CNT, (byte)(10), (byte)(0), ".", "")), ((edtTBW03_UPD_CNT_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A787TBW03_UPD_CNT), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A787TBW03_UPD_CNT), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(264);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW03_UPD_CNT_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW03_UPD_CNT_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_NO", "right", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_34_1641e( true) ;
      }
      else
      {
         wb_table4_34_1641e( false) ;
      }
   }

   public void wb_table2_5_1641( boolean wbgen )
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
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW03_CRF_SEARCH.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW03_CRF_SEARCH.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW03_CRF_SEARCH.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW03_CRF_SEARCH.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW03_CRF_SEARCH.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW03_CRF_SEARCH.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW03_CRF_SEARCH.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW03_CRF_SEARCH.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW03_CRF_SEARCH.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW03_CRF_SEARCH.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW03_CRF_SEARCH.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW03_CRF_SEARCH.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW03_CRF_SEARCH.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW03_CRF_SEARCH.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW03_CRF_SEARCH.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW03_CRF_SEARCH.htm");
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
         wb_table2_5_1641e( true) ;
      }
      else
      {
         wb_table2_5_1641e( false) ;
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
      /* Execute user event: e11162 */
      e11162 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            A110TBW03_SESSION_ID = httpContext.cgiGet( edtTBW03_SESSION_ID_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A110TBW03_SESSION_ID", A110TBW03_SESSION_ID);
            A111TBW03_APP_ID = httpContext.cgiGet( edtTBW03_APP_ID_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A111TBW03_APP_ID", A111TBW03_APP_ID);
            A112TBW03_DISP_DATETIME = httpContext.cgiGet( edtTBW03_DISP_DATETIME_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A112TBW03_DISP_DATETIME", A112TBW03_DISP_DATETIME);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW03_STUDY_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW03_STUDY_ID_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW03_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW03_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A113TBW03_STUDY_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A113TBW03_STUDY_ID", GXutil.ltrim( GXutil.str( A113TBW03_STUDY_ID, 10, 0)));
            }
            else
            {
               A113TBW03_STUDY_ID = localUtil.ctol( httpContext.cgiGet( edtTBW03_STUDY_ID_Internalname), ".", ",") ;
               httpContext.ajax_rsp_assign_attri("", false, "A113TBW03_STUDY_ID", GXutil.ltrim( GXutil.str( A113TBW03_STUDY_ID, 10, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW03_SUBJECT_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW03_SUBJECT_ID_Internalname), ".", ",") > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW03_SUBJECT_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW03_SUBJECT_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A114TBW03_SUBJECT_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A114TBW03_SUBJECT_ID", GXutil.ltrim( GXutil.str( A114TBW03_SUBJECT_ID, 6, 0)));
            }
            else
            {
               A114TBW03_SUBJECT_ID = (int)(localUtil.ctol( httpContext.cgiGet( edtTBW03_SUBJECT_ID_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A114TBW03_SUBJECT_ID", GXutil.ltrim( GXutil.str( A114TBW03_SUBJECT_ID, 6, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW03_CRF_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW03_CRF_ID_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW03_CRF_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW03_CRF_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A115TBW03_CRF_ID = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A115TBW03_CRF_ID", GXutil.ltrim( GXutil.str( A115TBW03_CRF_ID, 4, 0)));
            }
            else
            {
               A115TBW03_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( edtTBW03_CRF_ID_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A115TBW03_CRF_ID", GXutil.ltrim( GXutil.str( A115TBW03_CRF_ID, 4, 0)));
            }
            A710TBW03_CRF_NM = httpContext.cgiGet( edtTBW03_CRF_NM_Internalname) ;
            n710TBW03_CRF_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A710TBW03_CRF_NM", A710TBW03_CRF_NM);
            A711TBW03_CRF_SNM = httpContext.cgiGet( edtTBW03_CRF_SNM_Internalname) ;
            n711TBW03_CRF_SNM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A711TBW03_CRF_SNM", A711TBW03_CRF_SNM);
            A712TBW03_CRF_ORDER = (int)(localUtil.ctol( httpContext.cgiGet( edtTBW03_CRF_ORDER_Internalname), ".", ",")) ;
            n712TBW03_CRF_ORDER = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A712TBW03_CRF_ORDER", GXutil.ltrim( GXutil.str( A712TBW03_CRF_ORDER, 5, 0)));
            A120TBW03_SITE_ID = httpContext.cgiGet( edtTBW03_SITE_ID_Internalname) ;
            n120TBW03_SITE_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A120TBW03_SITE_ID", A120TBW03_SITE_ID);
            n120TBW03_SITE_ID = ((GXutil.strcmp("", A120TBW03_SITE_ID)==0) ? true : false) ;
            A713TBW03_SITE_NM = httpContext.cgiGet( edtTBW03_SITE_NM_Internalname) ;
            n713TBW03_SITE_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A713TBW03_SITE_NM", A713TBW03_SITE_NM);
            A714TBW03_SITE_RYAK_NM = httpContext.cgiGet( edtTBW03_SITE_RYAK_NM_Internalname) ;
            n714TBW03_SITE_RYAK_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A714TBW03_SITE_RYAK_NM", A714TBW03_SITE_RYAK_NM);
            A715TBW03_OUTER_SUBJECT_ID = httpContext.cgiGet( edtTBW03_OUTER_SUBJECT_ID_Internalname) ;
            n715TBW03_OUTER_SUBJECT_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A715TBW03_OUTER_SUBJECT_ID", A715TBW03_OUTER_SUBJECT_ID);
            n715TBW03_OUTER_SUBJECT_ID = ((GXutil.strcmp("", A715TBW03_OUTER_SUBJECT_ID)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW03_CRF_LATEST_VERSION_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW03_CRF_LATEST_VERSION_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW03_CRF_LATEST_VERSION");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW03_CRF_LATEST_VERSION_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A716TBW03_CRF_LATEST_VERSION = (short)(0) ;
               n716TBW03_CRF_LATEST_VERSION = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A716TBW03_CRF_LATEST_VERSION", GXutil.ltrim( GXutil.str( A716TBW03_CRF_LATEST_VERSION, 4, 0)));
            }
            else
            {
               A716TBW03_CRF_LATEST_VERSION = (short)(localUtil.ctol( httpContext.cgiGet( edtTBW03_CRF_LATEST_VERSION_Internalname), ".", ",")) ;
               n716TBW03_CRF_LATEST_VERSION = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A716TBW03_CRF_LATEST_VERSION", GXutil.ltrim( GXutil.str( A716TBW03_CRF_LATEST_VERSION, 4, 0)));
            }
            n716TBW03_CRF_LATEST_VERSION = ((0==A716TBW03_CRF_LATEST_VERSION) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW03_CRF_INPUT_LEVEL_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW03_CRF_INPUT_LEVEL_Internalname), ".", ",") > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW03_CRF_INPUT_LEVEL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW03_CRF_INPUT_LEVEL_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A717TBW03_CRF_INPUT_LEVEL = (byte)(0) ;
               n717TBW03_CRF_INPUT_LEVEL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A717TBW03_CRF_INPUT_LEVEL", GXutil.ltrim( GXutil.str( A717TBW03_CRF_INPUT_LEVEL, 2, 0)));
            }
            else
            {
               A717TBW03_CRF_INPUT_LEVEL = (byte)(localUtil.ctol( httpContext.cgiGet( edtTBW03_CRF_INPUT_LEVEL_Internalname), ".", ",")) ;
               n717TBW03_CRF_INPUT_LEVEL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A717TBW03_CRF_INPUT_LEVEL", GXutil.ltrim( GXutil.str( A717TBW03_CRF_INPUT_LEVEL, 2, 0)));
            }
            n717TBW03_CRF_INPUT_LEVEL = ((0==A717TBW03_CRF_INPUT_LEVEL) ? true : false) ;
            A718TBW03_LOCK_FLG = httpContext.cgiGet( edtTBW03_LOCK_FLG_Internalname) ;
            n718TBW03_LOCK_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A718TBW03_LOCK_FLG", A718TBW03_LOCK_FLG);
            n718TBW03_LOCK_FLG = ((GXutil.strcmp("", A718TBW03_LOCK_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBW03_LOCK_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TBW03_LOCK_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW03_LOCK_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A719TBW03_LOCK_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n719TBW03_LOCK_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A719TBW03_LOCK_DATETIME", localUtil.ttoc( A719TBW03_LOCK_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A719TBW03_LOCK_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBW03_LOCK_DATETIME_Internalname)) ;
               n719TBW03_LOCK_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A719TBW03_LOCK_DATETIME", localUtil.ttoc( A719TBW03_LOCK_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n719TBW03_LOCK_DATETIME = (GXutil.nullDate().equals(A719TBW03_LOCK_DATETIME) ? true : false) ;
            A116TBW03_LOCK_USER_ID = httpContext.cgiGet( edtTBW03_LOCK_USER_ID_Internalname) ;
            n116TBW03_LOCK_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A116TBW03_LOCK_USER_ID", A116TBW03_LOCK_USER_ID);
            n116TBW03_LOCK_USER_ID = ((GXutil.strcmp("", A116TBW03_LOCK_USER_ID)==0) ? true : false) ;
            A720TBW03_LOCK_USER_NM = httpContext.cgiGet( edtTBW03_LOCK_USER_NM_Internalname) ;
            n720TBW03_LOCK_USER_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A720TBW03_LOCK_USER_NM", A720TBW03_LOCK_USER_NM);
            A721TBW03_LOCK_AUTH_CD = httpContext.cgiGet( edtTBW03_LOCK_AUTH_CD_Internalname) ;
            n721TBW03_LOCK_AUTH_CD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A721TBW03_LOCK_AUTH_CD", A721TBW03_LOCK_AUTH_CD);
            n721TBW03_LOCK_AUTH_CD = ((GXutil.strcmp("", A721TBW03_LOCK_AUTH_CD)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBW03_UPLOAD_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TBW03_UPLOAD_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW03_UPLOAD_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A722TBW03_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n722TBW03_UPLOAD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A722TBW03_UPLOAD_DATETIME", localUtil.ttoc( A722TBW03_UPLOAD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A722TBW03_UPLOAD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBW03_UPLOAD_DATETIME_Internalname)) ;
               n722TBW03_UPLOAD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A722TBW03_UPLOAD_DATETIME", localUtil.ttoc( A722TBW03_UPLOAD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n722TBW03_UPLOAD_DATETIME = (GXutil.nullDate().equals(A722TBW03_UPLOAD_DATETIME) ? true : false) ;
            A117TBW03_UPLOAD_USER_ID = httpContext.cgiGet( edtTBW03_UPLOAD_USER_ID_Internalname) ;
            n117TBW03_UPLOAD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A117TBW03_UPLOAD_USER_ID", A117TBW03_UPLOAD_USER_ID);
            n117TBW03_UPLOAD_USER_ID = ((GXutil.strcmp("", A117TBW03_UPLOAD_USER_ID)==0) ? true : false) ;
            A723TBW03_UPLOAD_USER_NM = httpContext.cgiGet( edtTBW03_UPLOAD_USER_NM_Internalname) ;
            n723TBW03_UPLOAD_USER_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A723TBW03_UPLOAD_USER_NM", A723TBW03_UPLOAD_USER_NM);
            A724TBW03_UPLOAD_AUTH_CD = httpContext.cgiGet( edtTBW03_UPLOAD_AUTH_CD_Internalname) ;
            n724TBW03_UPLOAD_AUTH_CD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A724TBW03_UPLOAD_AUTH_CD", A724TBW03_UPLOAD_AUTH_CD);
            n724TBW03_UPLOAD_AUTH_CD = ((GXutil.strcmp("", A724TBW03_UPLOAD_AUTH_CD)==0) ? true : false) ;
            A725TBW03_DM_ARRIVAL_FLG = httpContext.cgiGet( edtTBW03_DM_ARRIVAL_FLG_Internalname) ;
            n725TBW03_DM_ARRIVAL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A725TBW03_DM_ARRIVAL_FLG", A725TBW03_DM_ARRIVAL_FLG);
            n725TBW03_DM_ARRIVAL_FLG = ((GXutil.strcmp("", A725TBW03_DM_ARRIVAL_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBW03_DM_ARRIVAL_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TBW03_DM_ARRIVAL_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW03_DM_ARRIVAL_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A726TBW03_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n726TBW03_DM_ARRIVAL_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A726TBW03_DM_ARRIVAL_DATETIME", localUtil.ttoc( A726TBW03_DM_ARRIVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A726TBW03_DM_ARRIVAL_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBW03_DM_ARRIVAL_DATETIME_Internalname)) ;
               n726TBW03_DM_ARRIVAL_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A726TBW03_DM_ARRIVAL_DATETIME", localUtil.ttoc( A726TBW03_DM_ARRIVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n726TBW03_DM_ARRIVAL_DATETIME = (GXutil.nullDate().equals(A726TBW03_DM_ARRIVAL_DATETIME) ? true : false) ;
            A727TBW03_APPROVAL_FLG = httpContext.cgiGet( edtTBW03_APPROVAL_FLG_Internalname) ;
            n727TBW03_APPROVAL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A727TBW03_APPROVAL_FLG", A727TBW03_APPROVAL_FLG);
            n727TBW03_APPROVAL_FLG = ((GXutil.strcmp("", A727TBW03_APPROVAL_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBW03_APPROVAL_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TBW03_APPROVAL_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW03_APPROVAL_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A728TBW03_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n728TBW03_APPROVAL_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A728TBW03_APPROVAL_DATETIME", localUtil.ttoc( A728TBW03_APPROVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A728TBW03_APPROVAL_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBW03_APPROVAL_DATETIME_Internalname)) ;
               n728TBW03_APPROVAL_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A728TBW03_APPROVAL_DATETIME", localUtil.ttoc( A728TBW03_APPROVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n728TBW03_APPROVAL_DATETIME = (GXutil.nullDate().equals(A728TBW03_APPROVAL_DATETIME) ? true : false) ;
            A118TBW03_APPROVAL_USER_ID = httpContext.cgiGet( edtTBW03_APPROVAL_USER_ID_Internalname) ;
            n118TBW03_APPROVAL_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A118TBW03_APPROVAL_USER_ID", A118TBW03_APPROVAL_USER_ID);
            n118TBW03_APPROVAL_USER_ID = ((GXutil.strcmp("", A118TBW03_APPROVAL_USER_ID)==0) ? true : false) ;
            A729TBW03_APPROVAL_USER_NM = httpContext.cgiGet( edtTBW03_APPROVAL_USER_NM_Internalname) ;
            n729TBW03_APPROVAL_USER_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A729TBW03_APPROVAL_USER_NM", A729TBW03_APPROVAL_USER_NM);
            A730TBW03_APPROVAL_AUTH_CD = httpContext.cgiGet( edtTBW03_APPROVAL_AUTH_CD_Internalname) ;
            n730TBW03_APPROVAL_AUTH_CD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A730TBW03_APPROVAL_AUTH_CD", A730TBW03_APPROVAL_AUTH_CD);
            n730TBW03_APPROVAL_AUTH_CD = ((GXutil.strcmp("", A730TBW03_APPROVAL_AUTH_CD)==0) ? true : false) ;
            A731TBW03_INPUT_END_FLG = httpContext.cgiGet( edtTBW03_INPUT_END_FLG_Internalname) ;
            n731TBW03_INPUT_END_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A731TBW03_INPUT_END_FLG", A731TBW03_INPUT_END_FLG);
            n731TBW03_INPUT_END_FLG = ((GXutil.strcmp("", A731TBW03_INPUT_END_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBW03_INPUT_END_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TBW03_INPUT_END_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW03_INPUT_END_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A732TBW03_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n732TBW03_INPUT_END_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A732TBW03_INPUT_END_DATETIME", localUtil.ttoc( A732TBW03_INPUT_END_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A732TBW03_INPUT_END_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBW03_INPUT_END_DATETIME_Internalname)) ;
               n732TBW03_INPUT_END_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A732TBW03_INPUT_END_DATETIME", localUtil.ttoc( A732TBW03_INPUT_END_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n732TBW03_INPUT_END_DATETIME = (GXutil.nullDate().equals(A732TBW03_INPUT_END_DATETIME) ? true : false) ;
            A119TBW03_INPUT_END_USER_ID = httpContext.cgiGet( edtTBW03_INPUT_END_USER_ID_Internalname) ;
            n119TBW03_INPUT_END_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A119TBW03_INPUT_END_USER_ID", A119TBW03_INPUT_END_USER_ID);
            n119TBW03_INPUT_END_USER_ID = ((GXutil.strcmp("", A119TBW03_INPUT_END_USER_ID)==0) ? true : false) ;
            A733TBW03_INPUT_END_USER_NM = httpContext.cgiGet( edtTBW03_INPUT_END_USER_NM_Internalname) ;
            n733TBW03_INPUT_END_USER_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A733TBW03_INPUT_END_USER_NM", A733TBW03_INPUT_END_USER_NM);
            A734TBW03_INPUT_END_AUTH_CD = httpContext.cgiGet( edtTBW03_INPUT_END_AUTH_CD_Internalname) ;
            n734TBW03_INPUT_END_AUTH_CD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A734TBW03_INPUT_END_AUTH_CD", A734TBW03_INPUT_END_AUTH_CD);
            n734TBW03_INPUT_END_AUTH_CD = ((GXutil.strcmp("", A734TBW03_INPUT_END_AUTH_CD)==0) ? true : false) ;
            A780TBW03_DEL_FLG = httpContext.cgiGet( edtTBW03_DEL_FLG_Internalname) ;
            n780TBW03_DEL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A780TBW03_DEL_FLG", A780TBW03_DEL_FLG);
            n780TBW03_DEL_FLG = ((GXutil.strcmp("", A780TBW03_DEL_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBW03_CRT_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TBW03_CRT_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW03_CRT_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A781TBW03_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n781TBW03_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A781TBW03_CRT_DATETIME", localUtil.ttoc( A781TBW03_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A781TBW03_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBW03_CRT_DATETIME_Internalname)) ;
               n781TBW03_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A781TBW03_CRT_DATETIME", localUtil.ttoc( A781TBW03_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n781TBW03_CRT_DATETIME = (GXutil.nullDate().equals(A781TBW03_CRT_DATETIME) ? true : false) ;
            A121TBW03_CRT_USER_ID = httpContext.cgiGet( edtTBW03_CRT_USER_ID_Internalname) ;
            n121TBW03_CRT_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A121TBW03_CRT_USER_ID", A121TBW03_CRT_USER_ID);
            n121TBW03_CRT_USER_ID = ((GXutil.strcmp("", A121TBW03_CRT_USER_ID)==0) ? true : false) ;
            A782TBW03_CRT_USER_NM = httpContext.cgiGet( edtTBW03_CRT_USER_NM_Internalname) ;
            n782TBW03_CRT_USER_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A782TBW03_CRT_USER_NM", A782TBW03_CRT_USER_NM);
            A783TBW03_CRT_PROG_NM = httpContext.cgiGet( edtTBW03_CRT_PROG_NM_Internalname) ;
            n783TBW03_CRT_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A783TBW03_CRT_PROG_NM", A783TBW03_CRT_PROG_NM);
            n783TBW03_CRT_PROG_NM = ((GXutil.strcmp("", A783TBW03_CRT_PROG_NM)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBW03_UPD_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TBW03_UPD_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW03_UPD_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A784TBW03_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n784TBW03_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A784TBW03_UPD_DATETIME", localUtil.ttoc( A784TBW03_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A784TBW03_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBW03_UPD_DATETIME_Internalname)) ;
               n784TBW03_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A784TBW03_UPD_DATETIME", localUtil.ttoc( A784TBW03_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n784TBW03_UPD_DATETIME = (GXutil.nullDate().equals(A784TBW03_UPD_DATETIME) ? true : false) ;
            A122TBW03_UPD_USER_ID = httpContext.cgiGet( edtTBW03_UPD_USER_ID_Internalname) ;
            n122TBW03_UPD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A122TBW03_UPD_USER_ID", A122TBW03_UPD_USER_ID);
            n122TBW03_UPD_USER_ID = ((GXutil.strcmp("", A122TBW03_UPD_USER_ID)==0) ? true : false) ;
            A785TBW03_UPD_USER_NM = httpContext.cgiGet( edtTBW03_UPD_USER_NM_Internalname) ;
            n785TBW03_UPD_USER_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A785TBW03_UPD_USER_NM", A785TBW03_UPD_USER_NM);
            A786TBW03_UPD_PROG_NM = httpContext.cgiGet( edtTBW03_UPD_PROG_NM_Internalname) ;
            n786TBW03_UPD_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A786TBW03_UPD_PROG_NM", A786TBW03_UPD_PROG_NM);
            n786TBW03_UPD_PROG_NM = ((GXutil.strcmp("", A786TBW03_UPD_PROG_NM)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW03_UPD_CNT_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW03_UPD_CNT_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW03_UPD_CNT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW03_UPD_CNT_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A787TBW03_UPD_CNT = 0 ;
               n787TBW03_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A787TBW03_UPD_CNT", GXutil.ltrim( GXutil.str( A787TBW03_UPD_CNT, 10, 0)));
            }
            else
            {
               A787TBW03_UPD_CNT = localUtil.ctol( httpContext.cgiGet( edtTBW03_UPD_CNT_Internalname), ".", ",") ;
               n787TBW03_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A787TBW03_UPD_CNT", GXutil.ltrim( GXutil.str( A787TBW03_UPD_CNT, 10, 0)));
            }
            n787TBW03_UPD_CNT = ((0==A787TBW03_UPD_CNT) ? true : false) ;
            /* Read saved values. */
            Z110TBW03_SESSION_ID = httpContext.cgiGet( "Z110TBW03_SESSION_ID") ;
            Z111TBW03_APP_ID = httpContext.cgiGet( "Z111TBW03_APP_ID") ;
            Z112TBW03_DISP_DATETIME = httpContext.cgiGet( "Z112TBW03_DISP_DATETIME") ;
            Z113TBW03_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "Z113TBW03_STUDY_ID"), ".", ",") ;
            Z114TBW03_SUBJECT_ID = (int)(localUtil.ctol( httpContext.cgiGet( "Z114TBW03_SUBJECT_ID"), ".", ",")) ;
            Z115TBW03_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( "Z115TBW03_CRF_ID"), ".", ",")) ;
            Z715TBW03_OUTER_SUBJECT_ID = httpContext.cgiGet( "Z715TBW03_OUTER_SUBJECT_ID") ;
            n715TBW03_OUTER_SUBJECT_ID = ((GXutil.strcmp("", A715TBW03_OUTER_SUBJECT_ID)==0) ? true : false) ;
            Z716TBW03_CRF_LATEST_VERSION = (short)(localUtil.ctol( httpContext.cgiGet( "Z716TBW03_CRF_LATEST_VERSION"), ".", ",")) ;
            n716TBW03_CRF_LATEST_VERSION = ((0==A716TBW03_CRF_LATEST_VERSION) ? true : false) ;
            Z717TBW03_CRF_INPUT_LEVEL = (byte)(localUtil.ctol( httpContext.cgiGet( "Z717TBW03_CRF_INPUT_LEVEL"), ".", ",")) ;
            n717TBW03_CRF_INPUT_LEVEL = ((0==A717TBW03_CRF_INPUT_LEVEL) ? true : false) ;
            Z718TBW03_LOCK_FLG = httpContext.cgiGet( "Z718TBW03_LOCK_FLG") ;
            n718TBW03_LOCK_FLG = ((GXutil.strcmp("", A718TBW03_LOCK_FLG)==0) ? true : false) ;
            Z719TBW03_LOCK_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z719TBW03_LOCK_DATETIME"), 0) ;
            n719TBW03_LOCK_DATETIME = (GXutil.nullDate().equals(A719TBW03_LOCK_DATETIME) ? true : false) ;
            Z721TBW03_LOCK_AUTH_CD = httpContext.cgiGet( "Z721TBW03_LOCK_AUTH_CD") ;
            n721TBW03_LOCK_AUTH_CD = ((GXutil.strcmp("", A721TBW03_LOCK_AUTH_CD)==0) ? true : false) ;
            Z722TBW03_UPLOAD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z722TBW03_UPLOAD_DATETIME"), 0) ;
            n722TBW03_UPLOAD_DATETIME = (GXutil.nullDate().equals(A722TBW03_UPLOAD_DATETIME) ? true : false) ;
            Z724TBW03_UPLOAD_AUTH_CD = httpContext.cgiGet( "Z724TBW03_UPLOAD_AUTH_CD") ;
            n724TBW03_UPLOAD_AUTH_CD = ((GXutil.strcmp("", A724TBW03_UPLOAD_AUTH_CD)==0) ? true : false) ;
            Z725TBW03_DM_ARRIVAL_FLG = httpContext.cgiGet( "Z725TBW03_DM_ARRIVAL_FLG") ;
            n725TBW03_DM_ARRIVAL_FLG = ((GXutil.strcmp("", A725TBW03_DM_ARRIVAL_FLG)==0) ? true : false) ;
            Z726TBW03_DM_ARRIVAL_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z726TBW03_DM_ARRIVAL_DATETIME"), 0) ;
            n726TBW03_DM_ARRIVAL_DATETIME = (GXutil.nullDate().equals(A726TBW03_DM_ARRIVAL_DATETIME) ? true : false) ;
            Z727TBW03_APPROVAL_FLG = httpContext.cgiGet( "Z727TBW03_APPROVAL_FLG") ;
            n727TBW03_APPROVAL_FLG = ((GXutil.strcmp("", A727TBW03_APPROVAL_FLG)==0) ? true : false) ;
            Z728TBW03_APPROVAL_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z728TBW03_APPROVAL_DATETIME"), 0) ;
            n728TBW03_APPROVAL_DATETIME = (GXutil.nullDate().equals(A728TBW03_APPROVAL_DATETIME) ? true : false) ;
            Z730TBW03_APPROVAL_AUTH_CD = httpContext.cgiGet( "Z730TBW03_APPROVAL_AUTH_CD") ;
            n730TBW03_APPROVAL_AUTH_CD = ((GXutil.strcmp("", A730TBW03_APPROVAL_AUTH_CD)==0) ? true : false) ;
            Z731TBW03_INPUT_END_FLG = httpContext.cgiGet( "Z731TBW03_INPUT_END_FLG") ;
            n731TBW03_INPUT_END_FLG = ((GXutil.strcmp("", A731TBW03_INPUT_END_FLG)==0) ? true : false) ;
            Z732TBW03_INPUT_END_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z732TBW03_INPUT_END_DATETIME"), 0) ;
            n732TBW03_INPUT_END_DATETIME = (GXutil.nullDate().equals(A732TBW03_INPUT_END_DATETIME) ? true : false) ;
            Z734TBW03_INPUT_END_AUTH_CD = httpContext.cgiGet( "Z734TBW03_INPUT_END_AUTH_CD") ;
            n734TBW03_INPUT_END_AUTH_CD = ((GXutil.strcmp("", A734TBW03_INPUT_END_AUTH_CD)==0) ? true : false) ;
            Z780TBW03_DEL_FLG = httpContext.cgiGet( "Z780TBW03_DEL_FLG") ;
            n780TBW03_DEL_FLG = ((GXutil.strcmp("", A780TBW03_DEL_FLG)==0) ? true : false) ;
            Z781TBW03_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z781TBW03_CRT_DATETIME"), 0) ;
            n781TBW03_CRT_DATETIME = (GXutil.nullDate().equals(A781TBW03_CRT_DATETIME) ? true : false) ;
            Z783TBW03_CRT_PROG_NM = httpContext.cgiGet( "Z783TBW03_CRT_PROG_NM") ;
            n783TBW03_CRT_PROG_NM = ((GXutil.strcmp("", A783TBW03_CRT_PROG_NM)==0) ? true : false) ;
            Z784TBW03_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z784TBW03_UPD_DATETIME"), 0) ;
            n784TBW03_UPD_DATETIME = (GXutil.nullDate().equals(A784TBW03_UPD_DATETIME) ? true : false) ;
            Z786TBW03_UPD_PROG_NM = httpContext.cgiGet( "Z786TBW03_UPD_PROG_NM") ;
            n786TBW03_UPD_PROG_NM = ((GXutil.strcmp("", A786TBW03_UPD_PROG_NM)==0) ? true : false) ;
            Z787TBW03_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z787TBW03_UPD_CNT"), ".", ",") ;
            n787TBW03_UPD_CNT = ((0==A787TBW03_UPD_CNT) ? true : false) ;
            Z120TBW03_SITE_ID = httpContext.cgiGet( "Z120TBW03_SITE_ID") ;
            n120TBW03_SITE_ID = ((GXutil.strcmp("", A120TBW03_SITE_ID)==0) ? true : false) ;
            Z116TBW03_LOCK_USER_ID = httpContext.cgiGet( "Z116TBW03_LOCK_USER_ID") ;
            n116TBW03_LOCK_USER_ID = ((GXutil.strcmp("", A116TBW03_LOCK_USER_ID)==0) ? true : false) ;
            Z117TBW03_UPLOAD_USER_ID = httpContext.cgiGet( "Z117TBW03_UPLOAD_USER_ID") ;
            n117TBW03_UPLOAD_USER_ID = ((GXutil.strcmp("", A117TBW03_UPLOAD_USER_ID)==0) ? true : false) ;
            Z118TBW03_APPROVAL_USER_ID = httpContext.cgiGet( "Z118TBW03_APPROVAL_USER_ID") ;
            n118TBW03_APPROVAL_USER_ID = ((GXutil.strcmp("", A118TBW03_APPROVAL_USER_ID)==0) ? true : false) ;
            Z119TBW03_INPUT_END_USER_ID = httpContext.cgiGet( "Z119TBW03_INPUT_END_USER_ID") ;
            n119TBW03_INPUT_END_USER_ID = ((GXutil.strcmp("", A119TBW03_INPUT_END_USER_ID)==0) ? true : false) ;
            Z121TBW03_CRT_USER_ID = httpContext.cgiGet( "Z121TBW03_CRT_USER_ID") ;
            n121TBW03_CRT_USER_ID = ((GXutil.strcmp("", A121TBW03_CRT_USER_ID)==0) ? true : false) ;
            Z122TBW03_UPD_USER_ID = httpContext.cgiGet( "Z122TBW03_UPD_USER_ID") ;
            n122TBW03_UPD_USER_ID = ((GXutil.strcmp("", A122TBW03_UPD_USER_ID)==0) ? true : false) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ".", ",")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ".", ",")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV8Pgmname = httpContext.cgiGet( "vPGMNAME") ;
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
               A110TBW03_SESSION_ID = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A110TBW03_SESSION_ID", A110TBW03_SESSION_ID);
               A111TBW03_APP_ID = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A111TBW03_APP_ID", A111TBW03_APP_ID);
               A112TBW03_DISP_DATETIME = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A112TBW03_DISP_DATETIME", A112TBW03_DISP_DATETIME);
               A113TBW03_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A113TBW03_STUDY_ID", GXutil.ltrim( GXutil.str( A113TBW03_STUDY_ID, 10, 0)));
               A114TBW03_SUBJECT_ID = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A114TBW03_SUBJECT_ID", GXutil.ltrim( GXutil.str( A114TBW03_SUBJECT_ID, 6, 0)));
               A115TBW03_CRF_ID = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A115TBW03_CRF_ID", GXutil.ltrim( GXutil.str( A115TBW03_CRF_ID, 4, 0)));
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
                     /* Execute user event: e11162 */
                     e11162 ();
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
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll1641( ) ;
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
      disableAttributes1641( ) ;
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

   public void resetCaption160( )
   {
   }

   public void e11162( )
   {
      /* Start Routine */
      AV7W_BC_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_BC_FLG", AV7W_BC_FLG);
      if ( GXutil.strcmp(AV7W_BC_FLG, "1") != 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV8Pgmname, "ERR", "禁止機能") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8Pgmname", AV8Pgmname);
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("8")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void S112( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV8Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Pgmname", AV8Pgmname);
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void zm1641( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z715TBW03_OUTER_SUBJECT_ID = T00163_A715TBW03_OUTER_SUBJECT_ID[0] ;
            Z716TBW03_CRF_LATEST_VERSION = T00163_A716TBW03_CRF_LATEST_VERSION[0] ;
            Z717TBW03_CRF_INPUT_LEVEL = T00163_A717TBW03_CRF_INPUT_LEVEL[0] ;
            Z718TBW03_LOCK_FLG = T00163_A718TBW03_LOCK_FLG[0] ;
            Z719TBW03_LOCK_DATETIME = T00163_A719TBW03_LOCK_DATETIME[0] ;
            Z721TBW03_LOCK_AUTH_CD = T00163_A721TBW03_LOCK_AUTH_CD[0] ;
            Z722TBW03_UPLOAD_DATETIME = T00163_A722TBW03_UPLOAD_DATETIME[0] ;
            Z724TBW03_UPLOAD_AUTH_CD = T00163_A724TBW03_UPLOAD_AUTH_CD[0] ;
            Z725TBW03_DM_ARRIVAL_FLG = T00163_A725TBW03_DM_ARRIVAL_FLG[0] ;
            Z726TBW03_DM_ARRIVAL_DATETIME = T00163_A726TBW03_DM_ARRIVAL_DATETIME[0] ;
            Z727TBW03_APPROVAL_FLG = T00163_A727TBW03_APPROVAL_FLG[0] ;
            Z728TBW03_APPROVAL_DATETIME = T00163_A728TBW03_APPROVAL_DATETIME[0] ;
            Z730TBW03_APPROVAL_AUTH_CD = T00163_A730TBW03_APPROVAL_AUTH_CD[0] ;
            Z731TBW03_INPUT_END_FLG = T00163_A731TBW03_INPUT_END_FLG[0] ;
            Z732TBW03_INPUT_END_DATETIME = T00163_A732TBW03_INPUT_END_DATETIME[0] ;
            Z734TBW03_INPUT_END_AUTH_CD = T00163_A734TBW03_INPUT_END_AUTH_CD[0] ;
            Z780TBW03_DEL_FLG = T00163_A780TBW03_DEL_FLG[0] ;
            Z781TBW03_CRT_DATETIME = T00163_A781TBW03_CRT_DATETIME[0] ;
            Z783TBW03_CRT_PROG_NM = T00163_A783TBW03_CRT_PROG_NM[0] ;
            Z784TBW03_UPD_DATETIME = T00163_A784TBW03_UPD_DATETIME[0] ;
            Z786TBW03_UPD_PROG_NM = T00163_A786TBW03_UPD_PROG_NM[0] ;
            Z787TBW03_UPD_CNT = T00163_A787TBW03_UPD_CNT[0] ;
            Z120TBW03_SITE_ID = T00163_A120TBW03_SITE_ID[0] ;
            Z116TBW03_LOCK_USER_ID = T00163_A116TBW03_LOCK_USER_ID[0] ;
            Z117TBW03_UPLOAD_USER_ID = T00163_A117TBW03_UPLOAD_USER_ID[0] ;
            Z118TBW03_APPROVAL_USER_ID = T00163_A118TBW03_APPROVAL_USER_ID[0] ;
            Z119TBW03_INPUT_END_USER_ID = T00163_A119TBW03_INPUT_END_USER_ID[0] ;
            Z121TBW03_CRT_USER_ID = T00163_A121TBW03_CRT_USER_ID[0] ;
            Z122TBW03_UPD_USER_ID = T00163_A122TBW03_UPD_USER_ID[0] ;
         }
         else
         {
            Z715TBW03_OUTER_SUBJECT_ID = A715TBW03_OUTER_SUBJECT_ID ;
            Z716TBW03_CRF_LATEST_VERSION = A716TBW03_CRF_LATEST_VERSION ;
            Z717TBW03_CRF_INPUT_LEVEL = A717TBW03_CRF_INPUT_LEVEL ;
            Z718TBW03_LOCK_FLG = A718TBW03_LOCK_FLG ;
            Z719TBW03_LOCK_DATETIME = A719TBW03_LOCK_DATETIME ;
            Z721TBW03_LOCK_AUTH_CD = A721TBW03_LOCK_AUTH_CD ;
            Z722TBW03_UPLOAD_DATETIME = A722TBW03_UPLOAD_DATETIME ;
            Z724TBW03_UPLOAD_AUTH_CD = A724TBW03_UPLOAD_AUTH_CD ;
            Z725TBW03_DM_ARRIVAL_FLG = A725TBW03_DM_ARRIVAL_FLG ;
            Z726TBW03_DM_ARRIVAL_DATETIME = A726TBW03_DM_ARRIVAL_DATETIME ;
            Z727TBW03_APPROVAL_FLG = A727TBW03_APPROVAL_FLG ;
            Z728TBW03_APPROVAL_DATETIME = A728TBW03_APPROVAL_DATETIME ;
            Z730TBW03_APPROVAL_AUTH_CD = A730TBW03_APPROVAL_AUTH_CD ;
            Z731TBW03_INPUT_END_FLG = A731TBW03_INPUT_END_FLG ;
            Z732TBW03_INPUT_END_DATETIME = A732TBW03_INPUT_END_DATETIME ;
            Z734TBW03_INPUT_END_AUTH_CD = A734TBW03_INPUT_END_AUTH_CD ;
            Z780TBW03_DEL_FLG = A780TBW03_DEL_FLG ;
            Z781TBW03_CRT_DATETIME = A781TBW03_CRT_DATETIME ;
            Z783TBW03_CRT_PROG_NM = A783TBW03_CRT_PROG_NM ;
            Z784TBW03_UPD_DATETIME = A784TBW03_UPD_DATETIME ;
            Z786TBW03_UPD_PROG_NM = A786TBW03_UPD_PROG_NM ;
            Z787TBW03_UPD_CNT = A787TBW03_UPD_CNT ;
            Z120TBW03_SITE_ID = A120TBW03_SITE_ID ;
            Z116TBW03_LOCK_USER_ID = A116TBW03_LOCK_USER_ID ;
            Z117TBW03_UPLOAD_USER_ID = A117TBW03_UPLOAD_USER_ID ;
            Z118TBW03_APPROVAL_USER_ID = A118TBW03_APPROVAL_USER_ID ;
            Z119TBW03_INPUT_END_USER_ID = A119TBW03_INPUT_END_USER_ID ;
            Z121TBW03_CRT_USER_ID = A121TBW03_CRT_USER_ID ;
            Z122TBW03_UPD_USER_ID = A122TBW03_UPD_USER_ID ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z110TBW03_SESSION_ID = A110TBW03_SESSION_ID ;
         Z111TBW03_APP_ID = A111TBW03_APP_ID ;
         Z112TBW03_DISP_DATETIME = A112TBW03_DISP_DATETIME ;
         Z114TBW03_SUBJECT_ID = A114TBW03_SUBJECT_ID ;
         Z715TBW03_OUTER_SUBJECT_ID = A715TBW03_OUTER_SUBJECT_ID ;
         Z716TBW03_CRF_LATEST_VERSION = A716TBW03_CRF_LATEST_VERSION ;
         Z717TBW03_CRF_INPUT_LEVEL = A717TBW03_CRF_INPUT_LEVEL ;
         Z718TBW03_LOCK_FLG = A718TBW03_LOCK_FLG ;
         Z719TBW03_LOCK_DATETIME = A719TBW03_LOCK_DATETIME ;
         Z721TBW03_LOCK_AUTH_CD = A721TBW03_LOCK_AUTH_CD ;
         Z722TBW03_UPLOAD_DATETIME = A722TBW03_UPLOAD_DATETIME ;
         Z724TBW03_UPLOAD_AUTH_CD = A724TBW03_UPLOAD_AUTH_CD ;
         Z725TBW03_DM_ARRIVAL_FLG = A725TBW03_DM_ARRIVAL_FLG ;
         Z726TBW03_DM_ARRIVAL_DATETIME = A726TBW03_DM_ARRIVAL_DATETIME ;
         Z727TBW03_APPROVAL_FLG = A727TBW03_APPROVAL_FLG ;
         Z728TBW03_APPROVAL_DATETIME = A728TBW03_APPROVAL_DATETIME ;
         Z730TBW03_APPROVAL_AUTH_CD = A730TBW03_APPROVAL_AUTH_CD ;
         Z731TBW03_INPUT_END_FLG = A731TBW03_INPUT_END_FLG ;
         Z732TBW03_INPUT_END_DATETIME = A732TBW03_INPUT_END_DATETIME ;
         Z734TBW03_INPUT_END_AUTH_CD = A734TBW03_INPUT_END_AUTH_CD ;
         Z780TBW03_DEL_FLG = A780TBW03_DEL_FLG ;
         Z781TBW03_CRT_DATETIME = A781TBW03_CRT_DATETIME ;
         Z783TBW03_CRT_PROG_NM = A783TBW03_CRT_PROG_NM ;
         Z784TBW03_UPD_DATETIME = A784TBW03_UPD_DATETIME ;
         Z786TBW03_UPD_PROG_NM = A786TBW03_UPD_PROG_NM ;
         Z787TBW03_UPD_CNT = A787TBW03_UPD_CNT ;
         Z113TBW03_STUDY_ID = A113TBW03_STUDY_ID ;
         Z115TBW03_CRF_ID = A115TBW03_CRF_ID ;
         Z120TBW03_SITE_ID = A120TBW03_SITE_ID ;
         Z116TBW03_LOCK_USER_ID = A116TBW03_LOCK_USER_ID ;
         Z117TBW03_UPLOAD_USER_ID = A117TBW03_UPLOAD_USER_ID ;
         Z118TBW03_APPROVAL_USER_ID = A118TBW03_APPROVAL_USER_ID ;
         Z119TBW03_INPUT_END_USER_ID = A119TBW03_INPUT_END_USER_ID ;
         Z121TBW03_CRT_USER_ID = A121TBW03_CRT_USER_ID ;
         Z122TBW03_UPD_USER_ID = A122TBW03_UPD_USER_ID ;
         Z710TBW03_CRF_NM = A710TBW03_CRF_NM ;
         Z711TBW03_CRF_SNM = A711TBW03_CRF_SNM ;
         Z712TBW03_CRF_ORDER = A712TBW03_CRF_ORDER ;
         Z713TBW03_SITE_NM = A713TBW03_SITE_NM ;
         Z714TBW03_SITE_RYAK_NM = A714TBW03_SITE_RYAK_NM ;
         Z720TBW03_LOCK_USER_NM = A720TBW03_LOCK_USER_NM ;
         Z723TBW03_UPLOAD_USER_NM = A723TBW03_UPLOAD_USER_NM ;
         Z729TBW03_APPROVAL_USER_NM = A729TBW03_APPROVAL_USER_NM ;
         Z733TBW03_INPUT_END_USER_NM = A733TBW03_INPUT_END_USER_NM ;
         Z782TBW03_CRT_USER_NM = A782TBW03_CRT_USER_NM ;
         Z785TBW03_UPD_USER_NM = A785TBW03_UPD_USER_NM ;
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

   public void load1641( )
   {
      /* Using cursor T001612 */
      pr_default.execute(10, new Object[] {A110TBW03_SESSION_ID, A111TBW03_APP_ID, A112TBW03_DISP_DATETIME, new Long(A113TBW03_STUDY_ID), new Integer(A114TBW03_SUBJECT_ID), new Short(A115TBW03_CRF_ID)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound41 = (short)(1) ;
         A710TBW03_CRF_NM = T001612_A710TBW03_CRF_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A710TBW03_CRF_NM", A710TBW03_CRF_NM);
         n710TBW03_CRF_NM = T001612_n710TBW03_CRF_NM[0] ;
         A711TBW03_CRF_SNM = T001612_A711TBW03_CRF_SNM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A711TBW03_CRF_SNM", A711TBW03_CRF_SNM);
         n711TBW03_CRF_SNM = T001612_n711TBW03_CRF_SNM[0] ;
         A712TBW03_CRF_ORDER = T001612_A712TBW03_CRF_ORDER[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A712TBW03_CRF_ORDER", GXutil.ltrim( GXutil.str( A712TBW03_CRF_ORDER, 5, 0)));
         n712TBW03_CRF_ORDER = T001612_n712TBW03_CRF_ORDER[0] ;
         A713TBW03_SITE_NM = T001612_A713TBW03_SITE_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A713TBW03_SITE_NM", A713TBW03_SITE_NM);
         n713TBW03_SITE_NM = T001612_n713TBW03_SITE_NM[0] ;
         A714TBW03_SITE_RYAK_NM = T001612_A714TBW03_SITE_RYAK_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A714TBW03_SITE_RYAK_NM", A714TBW03_SITE_RYAK_NM);
         n714TBW03_SITE_RYAK_NM = T001612_n714TBW03_SITE_RYAK_NM[0] ;
         A715TBW03_OUTER_SUBJECT_ID = T001612_A715TBW03_OUTER_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A715TBW03_OUTER_SUBJECT_ID", A715TBW03_OUTER_SUBJECT_ID);
         n715TBW03_OUTER_SUBJECT_ID = T001612_n715TBW03_OUTER_SUBJECT_ID[0] ;
         A716TBW03_CRF_LATEST_VERSION = T001612_A716TBW03_CRF_LATEST_VERSION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A716TBW03_CRF_LATEST_VERSION", GXutil.ltrim( GXutil.str( A716TBW03_CRF_LATEST_VERSION, 4, 0)));
         n716TBW03_CRF_LATEST_VERSION = T001612_n716TBW03_CRF_LATEST_VERSION[0] ;
         A717TBW03_CRF_INPUT_LEVEL = T001612_A717TBW03_CRF_INPUT_LEVEL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A717TBW03_CRF_INPUT_LEVEL", GXutil.ltrim( GXutil.str( A717TBW03_CRF_INPUT_LEVEL, 2, 0)));
         n717TBW03_CRF_INPUT_LEVEL = T001612_n717TBW03_CRF_INPUT_LEVEL[0] ;
         A718TBW03_LOCK_FLG = T001612_A718TBW03_LOCK_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A718TBW03_LOCK_FLG", A718TBW03_LOCK_FLG);
         n718TBW03_LOCK_FLG = T001612_n718TBW03_LOCK_FLG[0] ;
         A719TBW03_LOCK_DATETIME = T001612_A719TBW03_LOCK_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719TBW03_LOCK_DATETIME", localUtil.ttoc( A719TBW03_LOCK_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n719TBW03_LOCK_DATETIME = T001612_n719TBW03_LOCK_DATETIME[0] ;
         A720TBW03_LOCK_USER_NM = T001612_A720TBW03_LOCK_USER_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A720TBW03_LOCK_USER_NM", A720TBW03_LOCK_USER_NM);
         n720TBW03_LOCK_USER_NM = T001612_n720TBW03_LOCK_USER_NM[0] ;
         A721TBW03_LOCK_AUTH_CD = T001612_A721TBW03_LOCK_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A721TBW03_LOCK_AUTH_CD", A721TBW03_LOCK_AUTH_CD);
         n721TBW03_LOCK_AUTH_CD = T001612_n721TBW03_LOCK_AUTH_CD[0] ;
         A722TBW03_UPLOAD_DATETIME = T001612_A722TBW03_UPLOAD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A722TBW03_UPLOAD_DATETIME", localUtil.ttoc( A722TBW03_UPLOAD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n722TBW03_UPLOAD_DATETIME = T001612_n722TBW03_UPLOAD_DATETIME[0] ;
         A723TBW03_UPLOAD_USER_NM = T001612_A723TBW03_UPLOAD_USER_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A723TBW03_UPLOAD_USER_NM", A723TBW03_UPLOAD_USER_NM);
         n723TBW03_UPLOAD_USER_NM = T001612_n723TBW03_UPLOAD_USER_NM[0] ;
         A724TBW03_UPLOAD_AUTH_CD = T001612_A724TBW03_UPLOAD_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A724TBW03_UPLOAD_AUTH_CD", A724TBW03_UPLOAD_AUTH_CD);
         n724TBW03_UPLOAD_AUTH_CD = T001612_n724TBW03_UPLOAD_AUTH_CD[0] ;
         A725TBW03_DM_ARRIVAL_FLG = T001612_A725TBW03_DM_ARRIVAL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A725TBW03_DM_ARRIVAL_FLG", A725TBW03_DM_ARRIVAL_FLG);
         n725TBW03_DM_ARRIVAL_FLG = T001612_n725TBW03_DM_ARRIVAL_FLG[0] ;
         A726TBW03_DM_ARRIVAL_DATETIME = T001612_A726TBW03_DM_ARRIVAL_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A726TBW03_DM_ARRIVAL_DATETIME", localUtil.ttoc( A726TBW03_DM_ARRIVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n726TBW03_DM_ARRIVAL_DATETIME = T001612_n726TBW03_DM_ARRIVAL_DATETIME[0] ;
         A727TBW03_APPROVAL_FLG = T001612_A727TBW03_APPROVAL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A727TBW03_APPROVAL_FLG", A727TBW03_APPROVAL_FLG);
         n727TBW03_APPROVAL_FLG = T001612_n727TBW03_APPROVAL_FLG[0] ;
         A728TBW03_APPROVAL_DATETIME = T001612_A728TBW03_APPROVAL_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A728TBW03_APPROVAL_DATETIME", localUtil.ttoc( A728TBW03_APPROVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n728TBW03_APPROVAL_DATETIME = T001612_n728TBW03_APPROVAL_DATETIME[0] ;
         A729TBW03_APPROVAL_USER_NM = T001612_A729TBW03_APPROVAL_USER_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A729TBW03_APPROVAL_USER_NM", A729TBW03_APPROVAL_USER_NM);
         n729TBW03_APPROVAL_USER_NM = T001612_n729TBW03_APPROVAL_USER_NM[0] ;
         A730TBW03_APPROVAL_AUTH_CD = T001612_A730TBW03_APPROVAL_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A730TBW03_APPROVAL_AUTH_CD", A730TBW03_APPROVAL_AUTH_CD);
         n730TBW03_APPROVAL_AUTH_CD = T001612_n730TBW03_APPROVAL_AUTH_CD[0] ;
         A731TBW03_INPUT_END_FLG = T001612_A731TBW03_INPUT_END_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A731TBW03_INPUT_END_FLG", A731TBW03_INPUT_END_FLG);
         n731TBW03_INPUT_END_FLG = T001612_n731TBW03_INPUT_END_FLG[0] ;
         A732TBW03_INPUT_END_DATETIME = T001612_A732TBW03_INPUT_END_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A732TBW03_INPUT_END_DATETIME", localUtil.ttoc( A732TBW03_INPUT_END_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n732TBW03_INPUT_END_DATETIME = T001612_n732TBW03_INPUT_END_DATETIME[0] ;
         A733TBW03_INPUT_END_USER_NM = T001612_A733TBW03_INPUT_END_USER_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A733TBW03_INPUT_END_USER_NM", A733TBW03_INPUT_END_USER_NM);
         n733TBW03_INPUT_END_USER_NM = T001612_n733TBW03_INPUT_END_USER_NM[0] ;
         A734TBW03_INPUT_END_AUTH_CD = T001612_A734TBW03_INPUT_END_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A734TBW03_INPUT_END_AUTH_CD", A734TBW03_INPUT_END_AUTH_CD);
         n734TBW03_INPUT_END_AUTH_CD = T001612_n734TBW03_INPUT_END_AUTH_CD[0] ;
         A780TBW03_DEL_FLG = T001612_A780TBW03_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A780TBW03_DEL_FLG", A780TBW03_DEL_FLG);
         n780TBW03_DEL_FLG = T001612_n780TBW03_DEL_FLG[0] ;
         A781TBW03_CRT_DATETIME = T001612_A781TBW03_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A781TBW03_CRT_DATETIME", localUtil.ttoc( A781TBW03_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n781TBW03_CRT_DATETIME = T001612_n781TBW03_CRT_DATETIME[0] ;
         A782TBW03_CRT_USER_NM = T001612_A782TBW03_CRT_USER_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A782TBW03_CRT_USER_NM", A782TBW03_CRT_USER_NM);
         n782TBW03_CRT_USER_NM = T001612_n782TBW03_CRT_USER_NM[0] ;
         A783TBW03_CRT_PROG_NM = T001612_A783TBW03_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A783TBW03_CRT_PROG_NM", A783TBW03_CRT_PROG_NM);
         n783TBW03_CRT_PROG_NM = T001612_n783TBW03_CRT_PROG_NM[0] ;
         A784TBW03_UPD_DATETIME = T001612_A784TBW03_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A784TBW03_UPD_DATETIME", localUtil.ttoc( A784TBW03_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n784TBW03_UPD_DATETIME = T001612_n784TBW03_UPD_DATETIME[0] ;
         A785TBW03_UPD_USER_NM = T001612_A785TBW03_UPD_USER_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A785TBW03_UPD_USER_NM", A785TBW03_UPD_USER_NM);
         n785TBW03_UPD_USER_NM = T001612_n785TBW03_UPD_USER_NM[0] ;
         A786TBW03_UPD_PROG_NM = T001612_A786TBW03_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A786TBW03_UPD_PROG_NM", A786TBW03_UPD_PROG_NM);
         n786TBW03_UPD_PROG_NM = T001612_n786TBW03_UPD_PROG_NM[0] ;
         A787TBW03_UPD_CNT = T001612_A787TBW03_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A787TBW03_UPD_CNT", GXutil.ltrim( GXutil.str( A787TBW03_UPD_CNT, 10, 0)));
         n787TBW03_UPD_CNT = T001612_n787TBW03_UPD_CNT[0] ;
         A120TBW03_SITE_ID = T001612_A120TBW03_SITE_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A120TBW03_SITE_ID", A120TBW03_SITE_ID);
         n120TBW03_SITE_ID = T001612_n120TBW03_SITE_ID[0] ;
         A116TBW03_LOCK_USER_ID = T001612_A116TBW03_LOCK_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A116TBW03_LOCK_USER_ID", A116TBW03_LOCK_USER_ID);
         n116TBW03_LOCK_USER_ID = T001612_n116TBW03_LOCK_USER_ID[0] ;
         A117TBW03_UPLOAD_USER_ID = T001612_A117TBW03_UPLOAD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A117TBW03_UPLOAD_USER_ID", A117TBW03_UPLOAD_USER_ID);
         n117TBW03_UPLOAD_USER_ID = T001612_n117TBW03_UPLOAD_USER_ID[0] ;
         A118TBW03_APPROVAL_USER_ID = T001612_A118TBW03_APPROVAL_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A118TBW03_APPROVAL_USER_ID", A118TBW03_APPROVAL_USER_ID);
         n118TBW03_APPROVAL_USER_ID = T001612_n118TBW03_APPROVAL_USER_ID[0] ;
         A119TBW03_INPUT_END_USER_ID = T001612_A119TBW03_INPUT_END_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A119TBW03_INPUT_END_USER_ID", A119TBW03_INPUT_END_USER_ID);
         n119TBW03_INPUT_END_USER_ID = T001612_n119TBW03_INPUT_END_USER_ID[0] ;
         A121TBW03_CRT_USER_ID = T001612_A121TBW03_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A121TBW03_CRT_USER_ID", A121TBW03_CRT_USER_ID);
         n121TBW03_CRT_USER_ID = T001612_n121TBW03_CRT_USER_ID[0] ;
         A122TBW03_UPD_USER_ID = T001612_A122TBW03_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A122TBW03_UPD_USER_ID", A122TBW03_UPD_USER_ID);
         n122TBW03_UPD_USER_ID = T001612_n122TBW03_UPD_USER_ID[0] ;
         zm1641( -8) ;
      }
      pr_default.close(10);
      onLoadActions1641( ) ;
   }

   public void onLoadActions1641( )
   {
      AV8Pgmname = "TBW03_CRF_SEARCH" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Pgmname", AV8Pgmname);
   }

   public void checkExtendedTable1641( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV8Pgmname = "TBW03_CRF_SEARCH" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Pgmname", AV8Pgmname);
      /* Using cursor T00164 */
      pr_default.execute(2, new Object[] {new Long(A113TBW03_STUDY_ID), new Short(A115TBW03_CRF_ID)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem("'CRF検索ワーク・CRFサブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBW03_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBW03_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A710TBW03_CRF_NM = T00164_A710TBW03_CRF_NM[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A710TBW03_CRF_NM", A710TBW03_CRF_NM);
      n710TBW03_CRF_NM = T00164_n710TBW03_CRF_NM[0] ;
      A711TBW03_CRF_SNM = T00164_A711TBW03_CRF_SNM[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A711TBW03_CRF_SNM", A711TBW03_CRF_SNM);
      n711TBW03_CRF_SNM = T00164_n711TBW03_CRF_SNM[0] ;
      A712TBW03_CRF_ORDER = T00164_A712TBW03_CRF_ORDER[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A712TBW03_CRF_ORDER", GXutil.ltrim( GXutil.str( A712TBW03_CRF_ORDER, 5, 0)));
      n712TBW03_CRF_ORDER = T00164_n712TBW03_CRF_ORDER[0] ;
      pr_default.close(2);
      /* Using cursor T00165 */
      pr_default.execute(3, new Object[] {new Boolean(n120TBW03_SITE_ID), A120TBW03_SITE_ID});
      if ( (pr_default.getStatus(3) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A120TBW03_SITE_ID)==0) ) )
         {
            httpContext.GX_msglist.addItem("'CRF検索ワーク・施設サブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBW03_SITE_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBW03_SITE_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A713TBW03_SITE_NM = T00165_A713TBW03_SITE_NM[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A713TBW03_SITE_NM", A713TBW03_SITE_NM);
      n713TBW03_SITE_NM = T00165_n713TBW03_SITE_NM[0] ;
      A714TBW03_SITE_RYAK_NM = T00165_A714TBW03_SITE_RYAK_NM[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A714TBW03_SITE_RYAK_NM", A714TBW03_SITE_RYAK_NM);
      n714TBW03_SITE_RYAK_NM = T00165_n714TBW03_SITE_RYAK_NM[0] ;
      pr_default.close(3);
      if ( ! ( GXutil.nullDate().equals(A719TBW03_LOCK_DATETIME) || (( A719TBW03_LOCK_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A719TBW03_LOCK_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　ロック日時 は範囲外です", "OutOfRange", 1, "TBW03_LOCK_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBW03_LOCK_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      /* Using cursor T00166 */
      pr_default.execute(4, new Object[] {new Boolean(n116TBW03_LOCK_USER_ID), A116TBW03_LOCK_USER_ID});
      if ( (pr_default.getStatus(4) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A116TBW03_LOCK_USER_ID)==0) ) )
         {
            httpContext.GX_msglist.addItem("'CRF検索ワーク・ロックユーザーサブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBW03_LOCK_USER_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBW03_LOCK_USER_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A720TBW03_LOCK_USER_NM = T00166_A720TBW03_LOCK_USER_NM[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A720TBW03_LOCK_USER_NM", A720TBW03_LOCK_USER_NM);
      n720TBW03_LOCK_USER_NM = T00166_n720TBW03_LOCK_USER_NM[0] ;
      pr_default.close(4);
      if ( ! ( GXutil.nullDate().equals(A722TBW03_UPLOAD_DATETIME) || (( A722TBW03_UPLOAD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A722TBW03_UPLOAD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　アップロード日時 は範囲外です", "OutOfRange", 1, "TBW03_UPLOAD_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBW03_UPLOAD_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      /* Using cursor T00167 */
      pr_default.execute(5, new Object[] {new Boolean(n117TBW03_UPLOAD_USER_ID), A117TBW03_UPLOAD_USER_ID});
      if ( (pr_default.getStatus(5) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A117TBW03_UPLOAD_USER_ID)==0) ) )
         {
            httpContext.GX_msglist.addItem("'CRF検索ワーク・アップロードユーザーサブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBW03_UPLOAD_USER_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBW03_UPLOAD_USER_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A723TBW03_UPLOAD_USER_NM = T00167_A723TBW03_UPLOAD_USER_NM[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A723TBW03_UPLOAD_USER_NM", A723TBW03_UPLOAD_USER_NM);
      n723TBW03_UPLOAD_USER_NM = T00167_n723TBW03_UPLOAD_USER_NM[0] ;
      pr_default.close(5);
      if ( ! ( GXutil.nullDate().equals(A726TBW03_DM_ARRIVAL_DATETIME) || (( A726TBW03_DM_ARRIVAL_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A726TBW03_DM_ARRIVAL_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　DM到着日時 は範囲外です", "OutOfRange", 1, "TBW03_DM_ARRIVAL_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBW03_DM_ARRIVAL_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( GXutil.nullDate().equals(A728TBW03_APPROVAL_DATETIME) || (( A728TBW03_APPROVAL_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A728TBW03_APPROVAL_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　承認日時 は範囲外です", "OutOfRange", 1, "TBW03_APPROVAL_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBW03_APPROVAL_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      /* Using cursor T00168 */
      pr_default.execute(6, new Object[] {new Boolean(n118TBW03_APPROVAL_USER_ID), A118TBW03_APPROVAL_USER_ID});
      if ( (pr_default.getStatus(6) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A118TBW03_APPROVAL_USER_ID)==0) ) )
         {
            httpContext.GX_msglist.addItem("'CRF検索ワーク・承認ユーザーサブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBW03_APPROVAL_USER_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBW03_APPROVAL_USER_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A729TBW03_APPROVAL_USER_NM = T00168_A729TBW03_APPROVAL_USER_NM[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A729TBW03_APPROVAL_USER_NM", A729TBW03_APPROVAL_USER_NM);
      n729TBW03_APPROVAL_USER_NM = T00168_n729TBW03_APPROVAL_USER_NM[0] ;
      pr_default.close(6);
      if ( ! ( GXutil.nullDate().equals(A732TBW03_INPUT_END_DATETIME) || (( A732TBW03_INPUT_END_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A732TBW03_INPUT_END_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　データ固定日時 は範囲外です", "OutOfRange", 1, "TBW03_INPUT_END_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBW03_INPUT_END_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      /* Using cursor T00169 */
      pr_default.execute(7, new Object[] {new Boolean(n119TBW03_INPUT_END_USER_ID), A119TBW03_INPUT_END_USER_ID});
      if ( (pr_default.getStatus(7) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A119TBW03_INPUT_END_USER_ID)==0) ) )
         {
            httpContext.GX_msglist.addItem("'CRF検索ワーク・データ固定ユーザーサブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBW03_INPUT_END_USER_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBW03_INPUT_END_USER_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A733TBW03_INPUT_END_USER_NM = T00169_A733TBW03_INPUT_END_USER_NM[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A733TBW03_INPUT_END_USER_NM", A733TBW03_INPUT_END_USER_NM);
      n733TBW03_INPUT_END_USER_NM = T00169_n733TBW03_INPUT_END_USER_NM[0] ;
      pr_default.close(7);
      if ( ! ( GXutil.nullDate().equals(A781TBW03_CRT_DATETIME) || (( A781TBW03_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A781TBW03_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "TBW03_CRT_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBW03_CRT_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      /* Using cursor T001610 */
      pr_default.execute(8, new Object[] {new Boolean(n121TBW03_CRT_USER_ID), A121TBW03_CRT_USER_ID});
      if ( (pr_default.getStatus(8) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A121TBW03_CRT_USER_ID)==0) ) )
         {
            httpContext.GX_msglist.addItem("'CRF検索ワーク・作成ユーザーサブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBW03_CRT_USER_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBW03_CRT_USER_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A782TBW03_CRT_USER_NM = T001610_A782TBW03_CRT_USER_NM[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A782TBW03_CRT_USER_NM", A782TBW03_CRT_USER_NM);
      n782TBW03_CRT_USER_NM = T001610_n782TBW03_CRT_USER_NM[0] ;
      pr_default.close(8);
      if ( ! ( GXutil.nullDate().equals(A784TBW03_UPD_DATETIME) || (( A784TBW03_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A784TBW03_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "TBW03_UPD_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBW03_UPD_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      /* Using cursor T001611 */
      pr_default.execute(9, new Object[] {new Boolean(n122TBW03_UPD_USER_ID), A122TBW03_UPD_USER_ID});
      if ( (pr_default.getStatus(9) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A122TBW03_UPD_USER_ID)==0) ) )
         {
            httpContext.GX_msglist.addItem("'CRF検索ワーク・更新ユーザーサブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBW03_UPD_USER_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBW03_UPD_USER_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A785TBW03_UPD_USER_NM = T001611_A785TBW03_UPD_USER_NM[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A785TBW03_UPD_USER_NM", A785TBW03_UPD_USER_NM);
      n785TBW03_UPD_USER_NM = T001611_n785TBW03_UPD_USER_NM[0] ;
      pr_default.close(9);
   }

   public void closeExtendedTableCursors1641( )
   {
   }

   public void enableDisable( )
   {
   }

   public void gxload_9( long A113TBW03_STUDY_ID ,
                         short A115TBW03_CRF_ID )
   {
      /* Using cursor T00164 */
      pr_default.execute(2, new Object[] {new Long(A113TBW03_STUDY_ID), new Short(A115TBW03_CRF_ID)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem("'CRF検索ワーク・CRFサブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBW03_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBW03_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A710TBW03_CRF_NM = T00164_A710TBW03_CRF_NM[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A710TBW03_CRF_NM", A710TBW03_CRF_NM);
      n710TBW03_CRF_NM = T00164_n710TBW03_CRF_NM[0] ;
      A711TBW03_CRF_SNM = T00164_A711TBW03_CRF_SNM[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A711TBW03_CRF_SNM", A711TBW03_CRF_SNM);
      n711TBW03_CRF_SNM = T00164_n711TBW03_CRF_SNM[0] ;
      A712TBW03_CRF_ORDER = T00164_A712TBW03_CRF_ORDER[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A712TBW03_CRF_ORDER", GXutil.ltrim( GXutil.str( A712TBW03_CRF_ORDER, 5, 0)));
      n712TBW03_CRF_ORDER = T00164_n712TBW03_CRF_ORDER[0] ;
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A710TBW03_CRF_NM))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A711TBW03_CRF_SNM))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A712TBW03_CRF_ORDER, (byte)(5), (byte)(0), ".", "")))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(2);
   }

   public void gxload_10( String A120TBW03_SITE_ID )
   {
      /* Using cursor T00165 */
      pr_default.execute(3, new Object[] {new Boolean(n120TBW03_SITE_ID), A120TBW03_SITE_ID});
      if ( (pr_default.getStatus(3) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A120TBW03_SITE_ID)==0) ) )
         {
            httpContext.GX_msglist.addItem("'CRF検索ワーク・施設サブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBW03_SITE_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBW03_SITE_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A713TBW03_SITE_NM = T00165_A713TBW03_SITE_NM[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A713TBW03_SITE_NM", A713TBW03_SITE_NM);
      n713TBW03_SITE_NM = T00165_n713TBW03_SITE_NM[0] ;
      A714TBW03_SITE_RYAK_NM = T00165_A714TBW03_SITE_RYAK_NM[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A714TBW03_SITE_RYAK_NM", A714TBW03_SITE_RYAK_NM);
      n714TBW03_SITE_RYAK_NM = T00165_n714TBW03_SITE_RYAK_NM[0] ;
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A713TBW03_SITE_NM))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A714TBW03_SITE_RYAK_NM))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(3);
   }

   public void gxload_11( String A116TBW03_LOCK_USER_ID )
   {
      /* Using cursor T00166 */
      pr_default.execute(4, new Object[] {new Boolean(n116TBW03_LOCK_USER_ID), A116TBW03_LOCK_USER_ID});
      if ( (pr_default.getStatus(4) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A116TBW03_LOCK_USER_ID)==0) ) )
         {
            httpContext.GX_msglist.addItem("'CRF検索ワーク・ロックユーザーサブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBW03_LOCK_USER_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBW03_LOCK_USER_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A720TBW03_LOCK_USER_NM = T00166_A720TBW03_LOCK_USER_NM[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A720TBW03_LOCK_USER_NM", A720TBW03_LOCK_USER_NM);
      n720TBW03_LOCK_USER_NM = T00166_n720TBW03_LOCK_USER_NM[0] ;
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A720TBW03_LOCK_USER_NM))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(4);
   }

   public void gxload_12( String A117TBW03_UPLOAD_USER_ID )
   {
      /* Using cursor T00167 */
      pr_default.execute(5, new Object[] {new Boolean(n117TBW03_UPLOAD_USER_ID), A117TBW03_UPLOAD_USER_ID});
      if ( (pr_default.getStatus(5) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A117TBW03_UPLOAD_USER_ID)==0) ) )
         {
            httpContext.GX_msglist.addItem("'CRF検索ワーク・アップロードユーザーサブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBW03_UPLOAD_USER_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBW03_UPLOAD_USER_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A723TBW03_UPLOAD_USER_NM = T00167_A723TBW03_UPLOAD_USER_NM[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A723TBW03_UPLOAD_USER_NM", A723TBW03_UPLOAD_USER_NM);
      n723TBW03_UPLOAD_USER_NM = T00167_n723TBW03_UPLOAD_USER_NM[0] ;
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A723TBW03_UPLOAD_USER_NM))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(5);
   }

   public void gxload_13( String A118TBW03_APPROVAL_USER_ID )
   {
      /* Using cursor T00168 */
      pr_default.execute(6, new Object[] {new Boolean(n118TBW03_APPROVAL_USER_ID), A118TBW03_APPROVAL_USER_ID});
      if ( (pr_default.getStatus(6) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A118TBW03_APPROVAL_USER_ID)==0) ) )
         {
            httpContext.GX_msglist.addItem("'CRF検索ワーク・承認ユーザーサブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBW03_APPROVAL_USER_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBW03_APPROVAL_USER_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A729TBW03_APPROVAL_USER_NM = T00168_A729TBW03_APPROVAL_USER_NM[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A729TBW03_APPROVAL_USER_NM", A729TBW03_APPROVAL_USER_NM);
      n729TBW03_APPROVAL_USER_NM = T00168_n729TBW03_APPROVAL_USER_NM[0] ;
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A729TBW03_APPROVAL_USER_NM))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(6);
   }

   public void gxload_14( String A119TBW03_INPUT_END_USER_ID )
   {
      /* Using cursor T00169 */
      pr_default.execute(7, new Object[] {new Boolean(n119TBW03_INPUT_END_USER_ID), A119TBW03_INPUT_END_USER_ID});
      if ( (pr_default.getStatus(7) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A119TBW03_INPUT_END_USER_ID)==0) ) )
         {
            httpContext.GX_msglist.addItem("'CRF検索ワーク・データ固定ユーザーサブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBW03_INPUT_END_USER_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBW03_INPUT_END_USER_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A733TBW03_INPUT_END_USER_NM = T00169_A733TBW03_INPUT_END_USER_NM[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A733TBW03_INPUT_END_USER_NM", A733TBW03_INPUT_END_USER_NM);
      n733TBW03_INPUT_END_USER_NM = T00169_n733TBW03_INPUT_END_USER_NM[0] ;
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A733TBW03_INPUT_END_USER_NM))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(7);
   }

   public void gxload_15( String A121TBW03_CRT_USER_ID )
   {
      /* Using cursor T001610 */
      pr_default.execute(8, new Object[] {new Boolean(n121TBW03_CRT_USER_ID), A121TBW03_CRT_USER_ID});
      if ( (pr_default.getStatus(8) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A121TBW03_CRT_USER_ID)==0) ) )
         {
            httpContext.GX_msglist.addItem("'CRF検索ワーク・作成ユーザーサブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBW03_CRT_USER_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBW03_CRT_USER_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A782TBW03_CRT_USER_NM = T001610_A782TBW03_CRT_USER_NM[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A782TBW03_CRT_USER_NM", A782TBW03_CRT_USER_NM);
      n782TBW03_CRT_USER_NM = T001610_n782TBW03_CRT_USER_NM[0] ;
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A782TBW03_CRT_USER_NM))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(8);
   }

   public void gxload_16( String A122TBW03_UPD_USER_ID )
   {
      /* Using cursor T001611 */
      pr_default.execute(9, new Object[] {new Boolean(n122TBW03_UPD_USER_ID), A122TBW03_UPD_USER_ID});
      if ( (pr_default.getStatus(9) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A122TBW03_UPD_USER_ID)==0) ) )
         {
            httpContext.GX_msglist.addItem("'CRF検索ワーク・更新ユーザーサブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBW03_UPD_USER_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBW03_UPD_USER_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A785TBW03_UPD_USER_NM = T001611_A785TBW03_UPD_USER_NM[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A785TBW03_UPD_USER_NM", A785TBW03_UPD_USER_NM);
      n785TBW03_UPD_USER_NM = T001611_n785TBW03_UPD_USER_NM[0] ;
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A785TBW03_UPD_USER_NM))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(9);
   }

   public void getKey1641( )
   {
      /* Using cursor T001613 */
      pr_default.execute(11, new Object[] {A110TBW03_SESSION_ID, A111TBW03_APP_ID, A112TBW03_DISP_DATETIME, new Long(A113TBW03_STUDY_ID), new Integer(A114TBW03_SUBJECT_ID), new Short(A115TBW03_CRF_ID)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound41 = (short)(1) ;
      }
      else
      {
         RcdFound41 = (short)(0) ;
      }
      pr_default.close(11);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00163 */
      pr_default.execute(1, new Object[] {A110TBW03_SESSION_ID, A111TBW03_APP_ID, A112TBW03_DISP_DATETIME, new Long(A113TBW03_STUDY_ID), new Integer(A114TBW03_SUBJECT_ID), new Short(A115TBW03_CRF_ID)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1641( 8) ;
         RcdFound41 = (short)(1) ;
         A110TBW03_SESSION_ID = T00163_A110TBW03_SESSION_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A110TBW03_SESSION_ID", A110TBW03_SESSION_ID);
         A111TBW03_APP_ID = T00163_A111TBW03_APP_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A111TBW03_APP_ID", A111TBW03_APP_ID);
         A112TBW03_DISP_DATETIME = T00163_A112TBW03_DISP_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A112TBW03_DISP_DATETIME", A112TBW03_DISP_DATETIME);
         A114TBW03_SUBJECT_ID = T00163_A114TBW03_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A114TBW03_SUBJECT_ID", GXutil.ltrim( GXutil.str( A114TBW03_SUBJECT_ID, 6, 0)));
         A715TBW03_OUTER_SUBJECT_ID = T00163_A715TBW03_OUTER_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A715TBW03_OUTER_SUBJECT_ID", A715TBW03_OUTER_SUBJECT_ID);
         n715TBW03_OUTER_SUBJECT_ID = T00163_n715TBW03_OUTER_SUBJECT_ID[0] ;
         A716TBW03_CRF_LATEST_VERSION = T00163_A716TBW03_CRF_LATEST_VERSION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A716TBW03_CRF_LATEST_VERSION", GXutil.ltrim( GXutil.str( A716TBW03_CRF_LATEST_VERSION, 4, 0)));
         n716TBW03_CRF_LATEST_VERSION = T00163_n716TBW03_CRF_LATEST_VERSION[0] ;
         A717TBW03_CRF_INPUT_LEVEL = T00163_A717TBW03_CRF_INPUT_LEVEL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A717TBW03_CRF_INPUT_LEVEL", GXutil.ltrim( GXutil.str( A717TBW03_CRF_INPUT_LEVEL, 2, 0)));
         n717TBW03_CRF_INPUT_LEVEL = T00163_n717TBW03_CRF_INPUT_LEVEL[0] ;
         A718TBW03_LOCK_FLG = T00163_A718TBW03_LOCK_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A718TBW03_LOCK_FLG", A718TBW03_LOCK_FLG);
         n718TBW03_LOCK_FLG = T00163_n718TBW03_LOCK_FLG[0] ;
         A719TBW03_LOCK_DATETIME = T00163_A719TBW03_LOCK_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719TBW03_LOCK_DATETIME", localUtil.ttoc( A719TBW03_LOCK_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n719TBW03_LOCK_DATETIME = T00163_n719TBW03_LOCK_DATETIME[0] ;
         A721TBW03_LOCK_AUTH_CD = T00163_A721TBW03_LOCK_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A721TBW03_LOCK_AUTH_CD", A721TBW03_LOCK_AUTH_CD);
         n721TBW03_LOCK_AUTH_CD = T00163_n721TBW03_LOCK_AUTH_CD[0] ;
         A722TBW03_UPLOAD_DATETIME = T00163_A722TBW03_UPLOAD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A722TBW03_UPLOAD_DATETIME", localUtil.ttoc( A722TBW03_UPLOAD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n722TBW03_UPLOAD_DATETIME = T00163_n722TBW03_UPLOAD_DATETIME[0] ;
         A724TBW03_UPLOAD_AUTH_CD = T00163_A724TBW03_UPLOAD_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A724TBW03_UPLOAD_AUTH_CD", A724TBW03_UPLOAD_AUTH_CD);
         n724TBW03_UPLOAD_AUTH_CD = T00163_n724TBW03_UPLOAD_AUTH_CD[0] ;
         A725TBW03_DM_ARRIVAL_FLG = T00163_A725TBW03_DM_ARRIVAL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A725TBW03_DM_ARRIVAL_FLG", A725TBW03_DM_ARRIVAL_FLG);
         n725TBW03_DM_ARRIVAL_FLG = T00163_n725TBW03_DM_ARRIVAL_FLG[0] ;
         A726TBW03_DM_ARRIVAL_DATETIME = T00163_A726TBW03_DM_ARRIVAL_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A726TBW03_DM_ARRIVAL_DATETIME", localUtil.ttoc( A726TBW03_DM_ARRIVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n726TBW03_DM_ARRIVAL_DATETIME = T00163_n726TBW03_DM_ARRIVAL_DATETIME[0] ;
         A727TBW03_APPROVAL_FLG = T00163_A727TBW03_APPROVAL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A727TBW03_APPROVAL_FLG", A727TBW03_APPROVAL_FLG);
         n727TBW03_APPROVAL_FLG = T00163_n727TBW03_APPROVAL_FLG[0] ;
         A728TBW03_APPROVAL_DATETIME = T00163_A728TBW03_APPROVAL_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A728TBW03_APPROVAL_DATETIME", localUtil.ttoc( A728TBW03_APPROVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n728TBW03_APPROVAL_DATETIME = T00163_n728TBW03_APPROVAL_DATETIME[0] ;
         A730TBW03_APPROVAL_AUTH_CD = T00163_A730TBW03_APPROVAL_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A730TBW03_APPROVAL_AUTH_CD", A730TBW03_APPROVAL_AUTH_CD);
         n730TBW03_APPROVAL_AUTH_CD = T00163_n730TBW03_APPROVAL_AUTH_CD[0] ;
         A731TBW03_INPUT_END_FLG = T00163_A731TBW03_INPUT_END_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A731TBW03_INPUT_END_FLG", A731TBW03_INPUT_END_FLG);
         n731TBW03_INPUT_END_FLG = T00163_n731TBW03_INPUT_END_FLG[0] ;
         A732TBW03_INPUT_END_DATETIME = T00163_A732TBW03_INPUT_END_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A732TBW03_INPUT_END_DATETIME", localUtil.ttoc( A732TBW03_INPUT_END_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n732TBW03_INPUT_END_DATETIME = T00163_n732TBW03_INPUT_END_DATETIME[0] ;
         A734TBW03_INPUT_END_AUTH_CD = T00163_A734TBW03_INPUT_END_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A734TBW03_INPUT_END_AUTH_CD", A734TBW03_INPUT_END_AUTH_CD);
         n734TBW03_INPUT_END_AUTH_CD = T00163_n734TBW03_INPUT_END_AUTH_CD[0] ;
         A780TBW03_DEL_FLG = T00163_A780TBW03_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A780TBW03_DEL_FLG", A780TBW03_DEL_FLG);
         n780TBW03_DEL_FLG = T00163_n780TBW03_DEL_FLG[0] ;
         A781TBW03_CRT_DATETIME = T00163_A781TBW03_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A781TBW03_CRT_DATETIME", localUtil.ttoc( A781TBW03_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n781TBW03_CRT_DATETIME = T00163_n781TBW03_CRT_DATETIME[0] ;
         A783TBW03_CRT_PROG_NM = T00163_A783TBW03_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A783TBW03_CRT_PROG_NM", A783TBW03_CRT_PROG_NM);
         n783TBW03_CRT_PROG_NM = T00163_n783TBW03_CRT_PROG_NM[0] ;
         A784TBW03_UPD_DATETIME = T00163_A784TBW03_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A784TBW03_UPD_DATETIME", localUtil.ttoc( A784TBW03_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n784TBW03_UPD_DATETIME = T00163_n784TBW03_UPD_DATETIME[0] ;
         A786TBW03_UPD_PROG_NM = T00163_A786TBW03_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A786TBW03_UPD_PROG_NM", A786TBW03_UPD_PROG_NM);
         n786TBW03_UPD_PROG_NM = T00163_n786TBW03_UPD_PROG_NM[0] ;
         A787TBW03_UPD_CNT = T00163_A787TBW03_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A787TBW03_UPD_CNT", GXutil.ltrim( GXutil.str( A787TBW03_UPD_CNT, 10, 0)));
         n787TBW03_UPD_CNT = T00163_n787TBW03_UPD_CNT[0] ;
         A113TBW03_STUDY_ID = T00163_A113TBW03_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A113TBW03_STUDY_ID", GXutil.ltrim( GXutil.str( A113TBW03_STUDY_ID, 10, 0)));
         A115TBW03_CRF_ID = T00163_A115TBW03_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A115TBW03_CRF_ID", GXutil.ltrim( GXutil.str( A115TBW03_CRF_ID, 4, 0)));
         A120TBW03_SITE_ID = T00163_A120TBW03_SITE_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A120TBW03_SITE_ID", A120TBW03_SITE_ID);
         n120TBW03_SITE_ID = T00163_n120TBW03_SITE_ID[0] ;
         A116TBW03_LOCK_USER_ID = T00163_A116TBW03_LOCK_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A116TBW03_LOCK_USER_ID", A116TBW03_LOCK_USER_ID);
         n116TBW03_LOCK_USER_ID = T00163_n116TBW03_LOCK_USER_ID[0] ;
         A117TBW03_UPLOAD_USER_ID = T00163_A117TBW03_UPLOAD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A117TBW03_UPLOAD_USER_ID", A117TBW03_UPLOAD_USER_ID);
         n117TBW03_UPLOAD_USER_ID = T00163_n117TBW03_UPLOAD_USER_ID[0] ;
         A118TBW03_APPROVAL_USER_ID = T00163_A118TBW03_APPROVAL_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A118TBW03_APPROVAL_USER_ID", A118TBW03_APPROVAL_USER_ID);
         n118TBW03_APPROVAL_USER_ID = T00163_n118TBW03_APPROVAL_USER_ID[0] ;
         A119TBW03_INPUT_END_USER_ID = T00163_A119TBW03_INPUT_END_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A119TBW03_INPUT_END_USER_ID", A119TBW03_INPUT_END_USER_ID);
         n119TBW03_INPUT_END_USER_ID = T00163_n119TBW03_INPUT_END_USER_ID[0] ;
         A121TBW03_CRT_USER_ID = T00163_A121TBW03_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A121TBW03_CRT_USER_ID", A121TBW03_CRT_USER_ID);
         n121TBW03_CRT_USER_ID = T00163_n121TBW03_CRT_USER_ID[0] ;
         A122TBW03_UPD_USER_ID = T00163_A122TBW03_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A122TBW03_UPD_USER_ID", A122TBW03_UPD_USER_ID);
         n122TBW03_UPD_USER_ID = T00163_n122TBW03_UPD_USER_ID[0] ;
         Z110TBW03_SESSION_ID = A110TBW03_SESSION_ID ;
         Z111TBW03_APP_ID = A111TBW03_APP_ID ;
         Z112TBW03_DISP_DATETIME = A112TBW03_DISP_DATETIME ;
         Z113TBW03_STUDY_ID = A113TBW03_STUDY_ID ;
         Z114TBW03_SUBJECT_ID = A114TBW03_SUBJECT_ID ;
         Z115TBW03_CRF_ID = A115TBW03_CRF_ID ;
         sMode41 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1641( ) ;
         if ( AnyError == 1 )
         {
            RcdFound41 = (short)(0) ;
            initializeNonKey1641( ) ;
         }
         Gx_mode = sMode41 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound41 = (short)(0) ;
         initializeNonKey1641( ) ;
         sMode41 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode41 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1641( ) ;
      if ( RcdFound41 == 0 )
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
      RcdFound41 = (short)(0) ;
      /* Using cursor T001614 */
      pr_default.execute(12, new Object[] {A110TBW03_SESSION_ID, A110TBW03_SESSION_ID, A111TBW03_APP_ID, A111TBW03_APP_ID, A110TBW03_SESSION_ID, A112TBW03_DISP_DATETIME, A112TBW03_DISP_DATETIME, A111TBW03_APP_ID, A110TBW03_SESSION_ID, new Long(A113TBW03_STUDY_ID), new Long(A113TBW03_STUDY_ID), A112TBW03_DISP_DATETIME, A111TBW03_APP_ID, A110TBW03_SESSION_ID, new Integer(A114TBW03_SUBJECT_ID), new Integer(A114TBW03_SUBJECT_ID), new Long(A113TBW03_STUDY_ID), A112TBW03_DISP_DATETIME, A111TBW03_APP_ID, A110TBW03_SESSION_ID, new Short(A115TBW03_CRF_ID)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T001614_A110TBW03_SESSION_ID[0], A110TBW03_SESSION_ID) < 0 ) || ( GXutil.strcmp(T001614_A110TBW03_SESSION_ID[0], A110TBW03_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001614_A111TBW03_APP_ID[0], A111TBW03_APP_ID) < 0 ) || ( GXutil.strcmp(T001614_A111TBW03_APP_ID[0], A111TBW03_APP_ID) == 0 ) && ( GXutil.strcmp(T001614_A110TBW03_SESSION_ID[0], A110TBW03_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001614_A112TBW03_DISP_DATETIME[0], A112TBW03_DISP_DATETIME) < 0 ) || ( GXutil.strcmp(T001614_A112TBW03_DISP_DATETIME[0], A112TBW03_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001614_A111TBW03_APP_ID[0], A111TBW03_APP_ID) == 0 ) && ( GXutil.strcmp(T001614_A110TBW03_SESSION_ID[0], A110TBW03_SESSION_ID) == 0 ) && ( T001614_A113TBW03_STUDY_ID[0] < A113TBW03_STUDY_ID ) || ( T001614_A113TBW03_STUDY_ID[0] == A113TBW03_STUDY_ID ) && ( GXutil.strcmp(T001614_A112TBW03_DISP_DATETIME[0], A112TBW03_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001614_A111TBW03_APP_ID[0], A111TBW03_APP_ID) == 0 ) && ( GXutil.strcmp(T001614_A110TBW03_SESSION_ID[0], A110TBW03_SESSION_ID) == 0 ) && ( T001614_A114TBW03_SUBJECT_ID[0] < A114TBW03_SUBJECT_ID ) || ( T001614_A114TBW03_SUBJECT_ID[0] == A114TBW03_SUBJECT_ID ) && ( T001614_A113TBW03_STUDY_ID[0] == A113TBW03_STUDY_ID ) && ( GXutil.strcmp(T001614_A112TBW03_DISP_DATETIME[0], A112TBW03_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001614_A111TBW03_APP_ID[0], A111TBW03_APP_ID) == 0 ) && ( GXutil.strcmp(T001614_A110TBW03_SESSION_ID[0], A110TBW03_SESSION_ID) == 0 ) && ( T001614_A115TBW03_CRF_ID[0] < A115TBW03_CRF_ID ) ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T001614_A110TBW03_SESSION_ID[0], A110TBW03_SESSION_ID) > 0 ) || ( GXutil.strcmp(T001614_A110TBW03_SESSION_ID[0], A110TBW03_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001614_A111TBW03_APP_ID[0], A111TBW03_APP_ID) > 0 ) || ( GXutil.strcmp(T001614_A111TBW03_APP_ID[0], A111TBW03_APP_ID) == 0 ) && ( GXutil.strcmp(T001614_A110TBW03_SESSION_ID[0], A110TBW03_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001614_A112TBW03_DISP_DATETIME[0], A112TBW03_DISP_DATETIME) > 0 ) || ( GXutil.strcmp(T001614_A112TBW03_DISP_DATETIME[0], A112TBW03_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001614_A111TBW03_APP_ID[0], A111TBW03_APP_ID) == 0 ) && ( GXutil.strcmp(T001614_A110TBW03_SESSION_ID[0], A110TBW03_SESSION_ID) == 0 ) && ( T001614_A113TBW03_STUDY_ID[0] > A113TBW03_STUDY_ID ) || ( T001614_A113TBW03_STUDY_ID[0] == A113TBW03_STUDY_ID ) && ( GXutil.strcmp(T001614_A112TBW03_DISP_DATETIME[0], A112TBW03_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001614_A111TBW03_APP_ID[0], A111TBW03_APP_ID) == 0 ) && ( GXutil.strcmp(T001614_A110TBW03_SESSION_ID[0], A110TBW03_SESSION_ID) == 0 ) && ( T001614_A114TBW03_SUBJECT_ID[0] > A114TBW03_SUBJECT_ID ) || ( T001614_A114TBW03_SUBJECT_ID[0] == A114TBW03_SUBJECT_ID ) && ( T001614_A113TBW03_STUDY_ID[0] == A113TBW03_STUDY_ID ) && ( GXutil.strcmp(T001614_A112TBW03_DISP_DATETIME[0], A112TBW03_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001614_A111TBW03_APP_ID[0], A111TBW03_APP_ID) == 0 ) && ( GXutil.strcmp(T001614_A110TBW03_SESSION_ID[0], A110TBW03_SESSION_ID) == 0 ) && ( T001614_A115TBW03_CRF_ID[0] > A115TBW03_CRF_ID ) ) )
         {
            A110TBW03_SESSION_ID = T001614_A110TBW03_SESSION_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A110TBW03_SESSION_ID", A110TBW03_SESSION_ID);
            A111TBW03_APP_ID = T001614_A111TBW03_APP_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A111TBW03_APP_ID", A111TBW03_APP_ID);
            A112TBW03_DISP_DATETIME = T001614_A112TBW03_DISP_DATETIME[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A112TBW03_DISP_DATETIME", A112TBW03_DISP_DATETIME);
            A113TBW03_STUDY_ID = T001614_A113TBW03_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A113TBW03_STUDY_ID", GXutil.ltrim( GXutil.str( A113TBW03_STUDY_ID, 10, 0)));
            A114TBW03_SUBJECT_ID = T001614_A114TBW03_SUBJECT_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A114TBW03_SUBJECT_ID", GXutil.ltrim( GXutil.str( A114TBW03_SUBJECT_ID, 6, 0)));
            A115TBW03_CRF_ID = T001614_A115TBW03_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A115TBW03_CRF_ID", GXutil.ltrim( GXutil.str( A115TBW03_CRF_ID, 4, 0)));
            RcdFound41 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void move_previous( )
   {
      RcdFound41 = (short)(0) ;
      /* Using cursor T001615 */
      pr_default.execute(13, new Object[] {A110TBW03_SESSION_ID, A110TBW03_SESSION_ID, A111TBW03_APP_ID, A111TBW03_APP_ID, A110TBW03_SESSION_ID, A112TBW03_DISP_DATETIME, A112TBW03_DISP_DATETIME, A111TBW03_APP_ID, A110TBW03_SESSION_ID, new Long(A113TBW03_STUDY_ID), new Long(A113TBW03_STUDY_ID), A112TBW03_DISP_DATETIME, A111TBW03_APP_ID, A110TBW03_SESSION_ID, new Integer(A114TBW03_SUBJECT_ID), new Integer(A114TBW03_SUBJECT_ID), new Long(A113TBW03_STUDY_ID), A112TBW03_DISP_DATETIME, A111TBW03_APP_ID, A110TBW03_SESSION_ID, new Short(A115TBW03_CRF_ID)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T001615_A110TBW03_SESSION_ID[0], A110TBW03_SESSION_ID) > 0 ) || ( GXutil.strcmp(T001615_A110TBW03_SESSION_ID[0], A110TBW03_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001615_A111TBW03_APP_ID[0], A111TBW03_APP_ID) > 0 ) || ( GXutil.strcmp(T001615_A111TBW03_APP_ID[0], A111TBW03_APP_ID) == 0 ) && ( GXutil.strcmp(T001615_A110TBW03_SESSION_ID[0], A110TBW03_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001615_A112TBW03_DISP_DATETIME[0], A112TBW03_DISP_DATETIME) > 0 ) || ( GXutil.strcmp(T001615_A112TBW03_DISP_DATETIME[0], A112TBW03_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001615_A111TBW03_APP_ID[0], A111TBW03_APP_ID) == 0 ) && ( GXutil.strcmp(T001615_A110TBW03_SESSION_ID[0], A110TBW03_SESSION_ID) == 0 ) && ( T001615_A113TBW03_STUDY_ID[0] > A113TBW03_STUDY_ID ) || ( T001615_A113TBW03_STUDY_ID[0] == A113TBW03_STUDY_ID ) && ( GXutil.strcmp(T001615_A112TBW03_DISP_DATETIME[0], A112TBW03_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001615_A111TBW03_APP_ID[0], A111TBW03_APP_ID) == 0 ) && ( GXutil.strcmp(T001615_A110TBW03_SESSION_ID[0], A110TBW03_SESSION_ID) == 0 ) && ( T001615_A114TBW03_SUBJECT_ID[0] > A114TBW03_SUBJECT_ID ) || ( T001615_A114TBW03_SUBJECT_ID[0] == A114TBW03_SUBJECT_ID ) && ( T001615_A113TBW03_STUDY_ID[0] == A113TBW03_STUDY_ID ) && ( GXutil.strcmp(T001615_A112TBW03_DISP_DATETIME[0], A112TBW03_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001615_A111TBW03_APP_ID[0], A111TBW03_APP_ID) == 0 ) && ( GXutil.strcmp(T001615_A110TBW03_SESSION_ID[0], A110TBW03_SESSION_ID) == 0 ) && ( T001615_A115TBW03_CRF_ID[0] > A115TBW03_CRF_ID ) ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T001615_A110TBW03_SESSION_ID[0], A110TBW03_SESSION_ID) < 0 ) || ( GXutil.strcmp(T001615_A110TBW03_SESSION_ID[0], A110TBW03_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001615_A111TBW03_APP_ID[0], A111TBW03_APP_ID) < 0 ) || ( GXutil.strcmp(T001615_A111TBW03_APP_ID[0], A111TBW03_APP_ID) == 0 ) && ( GXutil.strcmp(T001615_A110TBW03_SESSION_ID[0], A110TBW03_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001615_A112TBW03_DISP_DATETIME[0], A112TBW03_DISP_DATETIME) < 0 ) || ( GXutil.strcmp(T001615_A112TBW03_DISP_DATETIME[0], A112TBW03_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001615_A111TBW03_APP_ID[0], A111TBW03_APP_ID) == 0 ) && ( GXutil.strcmp(T001615_A110TBW03_SESSION_ID[0], A110TBW03_SESSION_ID) == 0 ) && ( T001615_A113TBW03_STUDY_ID[0] < A113TBW03_STUDY_ID ) || ( T001615_A113TBW03_STUDY_ID[0] == A113TBW03_STUDY_ID ) && ( GXutil.strcmp(T001615_A112TBW03_DISP_DATETIME[0], A112TBW03_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001615_A111TBW03_APP_ID[0], A111TBW03_APP_ID) == 0 ) && ( GXutil.strcmp(T001615_A110TBW03_SESSION_ID[0], A110TBW03_SESSION_ID) == 0 ) && ( T001615_A114TBW03_SUBJECT_ID[0] < A114TBW03_SUBJECT_ID ) || ( T001615_A114TBW03_SUBJECT_ID[0] == A114TBW03_SUBJECT_ID ) && ( T001615_A113TBW03_STUDY_ID[0] == A113TBW03_STUDY_ID ) && ( GXutil.strcmp(T001615_A112TBW03_DISP_DATETIME[0], A112TBW03_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001615_A111TBW03_APP_ID[0], A111TBW03_APP_ID) == 0 ) && ( GXutil.strcmp(T001615_A110TBW03_SESSION_ID[0], A110TBW03_SESSION_ID) == 0 ) && ( T001615_A115TBW03_CRF_ID[0] < A115TBW03_CRF_ID ) ) )
         {
            A110TBW03_SESSION_ID = T001615_A110TBW03_SESSION_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A110TBW03_SESSION_ID", A110TBW03_SESSION_ID);
            A111TBW03_APP_ID = T001615_A111TBW03_APP_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A111TBW03_APP_ID", A111TBW03_APP_ID);
            A112TBW03_DISP_DATETIME = T001615_A112TBW03_DISP_DATETIME[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A112TBW03_DISP_DATETIME", A112TBW03_DISP_DATETIME);
            A113TBW03_STUDY_ID = T001615_A113TBW03_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A113TBW03_STUDY_ID", GXutil.ltrim( GXutil.str( A113TBW03_STUDY_ID, 10, 0)));
            A114TBW03_SUBJECT_ID = T001615_A114TBW03_SUBJECT_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A114TBW03_SUBJECT_ID", GXutil.ltrim( GXutil.str( A114TBW03_SUBJECT_ID, 6, 0)));
            A115TBW03_CRF_ID = T001615_A115TBW03_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A115TBW03_CRF_ID", GXutil.ltrim( GXutil.str( A115TBW03_CRF_ID, 4, 0)));
            RcdFound41 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1641( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtTBW03_SESSION_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1641( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound41 == 1 )
         {
            if ( ( GXutil.strcmp(A110TBW03_SESSION_ID, Z110TBW03_SESSION_ID) != 0 ) || ( GXutil.strcmp(A111TBW03_APP_ID, Z111TBW03_APP_ID) != 0 ) || ( GXutil.strcmp(A112TBW03_DISP_DATETIME, Z112TBW03_DISP_DATETIME) != 0 ) || ( A113TBW03_STUDY_ID != Z113TBW03_STUDY_ID ) || ( A114TBW03_SUBJECT_ID != Z114TBW03_SUBJECT_ID ) || ( A115TBW03_CRF_ID != Z115TBW03_CRF_ID ) )
            {
               A110TBW03_SESSION_ID = Z110TBW03_SESSION_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A110TBW03_SESSION_ID", A110TBW03_SESSION_ID);
               A111TBW03_APP_ID = Z111TBW03_APP_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A111TBW03_APP_ID", A111TBW03_APP_ID);
               A112TBW03_DISP_DATETIME = Z112TBW03_DISP_DATETIME ;
               httpContext.ajax_rsp_assign_attri("", false, "A112TBW03_DISP_DATETIME", A112TBW03_DISP_DATETIME);
               A113TBW03_STUDY_ID = Z113TBW03_STUDY_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A113TBW03_STUDY_ID", GXutil.ltrim( GXutil.str( A113TBW03_STUDY_ID, 10, 0)));
               A114TBW03_SUBJECT_ID = Z114TBW03_SUBJECT_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A114TBW03_SUBJECT_ID", GXutil.ltrim( GXutil.str( A114TBW03_SUBJECT_ID, 6, 0)));
               A115TBW03_CRF_ID = Z115TBW03_CRF_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A115TBW03_CRF_ID", GXutil.ltrim( GXutil.str( A115TBW03_CRF_ID, 4, 0)));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TBW03_SESSION_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW03_SESSION_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTBW03_SESSION_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1641( ) ;
               GX_FocusControl = edtTBW03_SESSION_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A110TBW03_SESSION_ID, Z110TBW03_SESSION_ID) != 0 ) || ( GXutil.strcmp(A111TBW03_APP_ID, Z111TBW03_APP_ID) != 0 ) || ( GXutil.strcmp(A112TBW03_DISP_DATETIME, Z112TBW03_DISP_DATETIME) != 0 ) || ( A113TBW03_STUDY_ID != Z113TBW03_STUDY_ID ) || ( A114TBW03_SUBJECT_ID != Z114TBW03_SUBJECT_ID ) || ( A115TBW03_CRF_ID != Z115TBW03_CRF_ID ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTBW03_SESSION_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1641( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TBW03_SESSION_ID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTBW03_SESSION_ID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtTBW03_SESSION_ID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1641( ) ;
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
      if ( ( GXutil.strcmp(A110TBW03_SESSION_ID, Z110TBW03_SESSION_ID) != 0 ) || ( GXutil.strcmp(A111TBW03_APP_ID, Z111TBW03_APP_ID) != 0 ) || ( GXutil.strcmp(A112TBW03_DISP_DATETIME, Z112TBW03_DISP_DATETIME) != 0 ) || ( A113TBW03_STUDY_ID != Z113TBW03_STUDY_ID ) || ( A114TBW03_SUBJECT_ID != Z114TBW03_SUBJECT_ID ) || ( A115TBW03_CRF_ID != Z115TBW03_CRF_ID ) )
      {
         A110TBW03_SESSION_ID = Z110TBW03_SESSION_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A110TBW03_SESSION_ID", A110TBW03_SESSION_ID);
         A111TBW03_APP_ID = Z111TBW03_APP_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A111TBW03_APP_ID", A111TBW03_APP_ID);
         A112TBW03_DISP_DATETIME = Z112TBW03_DISP_DATETIME ;
         httpContext.ajax_rsp_assign_attri("", false, "A112TBW03_DISP_DATETIME", A112TBW03_DISP_DATETIME);
         A113TBW03_STUDY_ID = Z113TBW03_STUDY_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A113TBW03_STUDY_ID", GXutil.ltrim( GXutil.str( A113TBW03_STUDY_ID, 10, 0)));
         A114TBW03_SUBJECT_ID = Z114TBW03_SUBJECT_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A114TBW03_SUBJECT_ID", GXutil.ltrim( GXutil.str( A114TBW03_SUBJECT_ID, 6, 0)));
         A115TBW03_CRF_ID = Z115TBW03_CRF_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A115TBW03_CRF_ID", GXutil.ltrim( GXutil.str( A115TBW03_CRF_ID, 4, 0)));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TBW03_SESSION_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBW03_SESSION_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTBW03_SESSION_ID_Internalname ;
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
      if ( RcdFound41 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TBW03_SESSION_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBW03_SESSION_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtTBW03_SITE_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart1641( ) ;
      if ( RcdFound41 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBW03_SITE_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1641( ) ;
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
      if ( RcdFound41 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBW03_SITE_ID_Internalname ;
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
      if ( RcdFound41 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBW03_SITE_ID_Internalname ;
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
      scanStart1641( ) ;
      if ( RcdFound41 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound41 != 0 )
         {
            scanNext1641( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBW03_SITE_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1641( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1641( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T00162 */
         pr_default.execute(0, new Object[] {A110TBW03_SESSION_ID, A111TBW03_APP_ID, A112TBW03_DISP_DATETIME, new Long(A113TBW03_STUDY_ID), new Integer(A114TBW03_SUBJECT_ID), new Short(A115TBW03_CRF_ID)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBW03_CRF_SEARCH"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z715TBW03_OUTER_SUBJECT_ID, T00162_A715TBW03_OUTER_SUBJECT_ID[0]) != 0 ) || ( Z716TBW03_CRF_LATEST_VERSION != T00162_A716TBW03_CRF_LATEST_VERSION[0] ) || ( Z717TBW03_CRF_INPUT_LEVEL != T00162_A717TBW03_CRF_INPUT_LEVEL[0] ) || ( GXutil.strcmp(Z718TBW03_LOCK_FLG, T00162_A718TBW03_LOCK_FLG[0]) != 0 ) || !( Z719TBW03_LOCK_DATETIME.equals( T00162_A719TBW03_LOCK_DATETIME[0] ) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z721TBW03_LOCK_AUTH_CD, T00162_A721TBW03_LOCK_AUTH_CD[0]) != 0 ) || !( Z722TBW03_UPLOAD_DATETIME.equals( T00162_A722TBW03_UPLOAD_DATETIME[0] ) ) || ( GXutil.strcmp(Z724TBW03_UPLOAD_AUTH_CD, T00162_A724TBW03_UPLOAD_AUTH_CD[0]) != 0 ) || ( GXutil.strcmp(Z725TBW03_DM_ARRIVAL_FLG, T00162_A725TBW03_DM_ARRIVAL_FLG[0]) != 0 ) || !( Z726TBW03_DM_ARRIVAL_DATETIME.equals( T00162_A726TBW03_DM_ARRIVAL_DATETIME[0] ) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z727TBW03_APPROVAL_FLG, T00162_A727TBW03_APPROVAL_FLG[0]) != 0 ) || !( Z728TBW03_APPROVAL_DATETIME.equals( T00162_A728TBW03_APPROVAL_DATETIME[0] ) ) || ( GXutil.strcmp(Z730TBW03_APPROVAL_AUTH_CD, T00162_A730TBW03_APPROVAL_AUTH_CD[0]) != 0 ) || ( GXutil.strcmp(Z731TBW03_INPUT_END_FLG, T00162_A731TBW03_INPUT_END_FLG[0]) != 0 ) || !( Z732TBW03_INPUT_END_DATETIME.equals( T00162_A732TBW03_INPUT_END_DATETIME[0] ) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z734TBW03_INPUT_END_AUTH_CD, T00162_A734TBW03_INPUT_END_AUTH_CD[0]) != 0 ) || ( GXutil.strcmp(Z780TBW03_DEL_FLG, T00162_A780TBW03_DEL_FLG[0]) != 0 ) || !( Z781TBW03_CRT_DATETIME.equals( T00162_A781TBW03_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z783TBW03_CRT_PROG_NM, T00162_A783TBW03_CRT_PROG_NM[0]) != 0 ) || !( Z784TBW03_UPD_DATETIME.equals( T00162_A784TBW03_UPD_DATETIME[0] ) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z786TBW03_UPD_PROG_NM, T00162_A786TBW03_UPD_PROG_NM[0]) != 0 ) || ( Z787TBW03_UPD_CNT != T00162_A787TBW03_UPD_CNT[0] ) || ( GXutil.strcmp(Z120TBW03_SITE_ID, T00162_A120TBW03_SITE_ID[0]) != 0 ) || ( GXutil.strcmp(Z116TBW03_LOCK_USER_ID, T00162_A116TBW03_LOCK_USER_ID[0]) != 0 ) || ( GXutil.strcmp(Z117TBW03_UPLOAD_USER_ID, T00162_A117TBW03_UPLOAD_USER_ID[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z118TBW03_APPROVAL_USER_ID, T00162_A118TBW03_APPROVAL_USER_ID[0]) != 0 ) || ( GXutil.strcmp(Z119TBW03_INPUT_END_USER_ID, T00162_A119TBW03_INPUT_END_USER_ID[0]) != 0 ) || ( GXutil.strcmp(Z121TBW03_CRT_USER_ID, T00162_A121TBW03_CRT_USER_ID[0]) != 0 ) || ( GXutil.strcmp(Z122TBW03_UPD_USER_ID, T00162_A122TBW03_UPD_USER_ID[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBW03_CRF_SEARCH"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1641( )
   {
      beforeValidate1641( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1641( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1641( 0) ;
         checkOptimisticConcurrency1641( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1641( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1641( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001616 */
                  pr_default.execute(14, new Object[] {A110TBW03_SESSION_ID, A111TBW03_APP_ID, A112TBW03_DISP_DATETIME, new Integer(A114TBW03_SUBJECT_ID), new Boolean(n715TBW03_OUTER_SUBJECT_ID), A715TBW03_OUTER_SUBJECT_ID, new Boolean(n716TBW03_CRF_LATEST_VERSION), new Short(A716TBW03_CRF_LATEST_VERSION), new Boolean(n717TBW03_CRF_INPUT_LEVEL), new Byte(A717TBW03_CRF_INPUT_LEVEL), new Boolean(n718TBW03_LOCK_FLG), A718TBW03_LOCK_FLG, new Boolean(n719TBW03_LOCK_DATETIME), A719TBW03_LOCK_DATETIME, new Boolean(n721TBW03_LOCK_AUTH_CD), A721TBW03_LOCK_AUTH_CD, new Boolean(n722TBW03_UPLOAD_DATETIME), A722TBW03_UPLOAD_DATETIME, new Boolean(n724TBW03_UPLOAD_AUTH_CD), A724TBW03_UPLOAD_AUTH_CD, new Boolean(n725TBW03_DM_ARRIVAL_FLG), A725TBW03_DM_ARRIVAL_FLG, new Boolean(n726TBW03_DM_ARRIVAL_DATETIME), A726TBW03_DM_ARRIVAL_DATETIME, new Boolean(n727TBW03_APPROVAL_FLG), A727TBW03_APPROVAL_FLG, new Boolean(n728TBW03_APPROVAL_DATETIME), A728TBW03_APPROVAL_DATETIME, new Boolean(n730TBW03_APPROVAL_AUTH_CD), A730TBW03_APPROVAL_AUTH_CD, new Boolean(n731TBW03_INPUT_END_FLG), A731TBW03_INPUT_END_FLG, new Boolean(n732TBW03_INPUT_END_DATETIME), A732TBW03_INPUT_END_DATETIME, new Boolean(n734TBW03_INPUT_END_AUTH_CD), A734TBW03_INPUT_END_AUTH_CD, new Boolean(n780TBW03_DEL_FLG), A780TBW03_DEL_FLG, new Boolean(n781TBW03_CRT_DATETIME), A781TBW03_CRT_DATETIME, new Boolean(n783TBW03_CRT_PROG_NM), A783TBW03_CRT_PROG_NM, new Boolean(n784TBW03_UPD_DATETIME), A784TBW03_UPD_DATETIME, new Boolean(n786TBW03_UPD_PROG_NM), A786TBW03_UPD_PROG_NM, new Boolean(n787TBW03_UPD_CNT), new Long(A787TBW03_UPD_CNT), new Long(A113TBW03_STUDY_ID), new Short(A115TBW03_CRF_ID), new Boolean(n120TBW03_SITE_ID), A120TBW03_SITE_ID, new Boolean(n116TBW03_LOCK_USER_ID), A116TBW03_LOCK_USER_ID, new Boolean(n117TBW03_UPLOAD_USER_ID), A117TBW03_UPLOAD_USER_ID, new Boolean(n118TBW03_APPROVAL_USER_ID), A118TBW03_APPROVAL_USER_ID, new Boolean(n119TBW03_INPUT_END_USER_ID), A119TBW03_INPUT_END_USER_ID, new Boolean(n121TBW03_CRT_USER_ID), A121TBW03_CRT_USER_ID, new Boolean(n122TBW03_UPD_USER_ID), A122TBW03_UPD_USER_ID});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBW03_CRF_SEARCH") ;
                  if ( (pr_default.getStatus(14) == 1) )
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
                        resetCaption160( ) ;
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
            load1641( ) ;
         }
         endLevel1641( ) ;
      }
      closeExtendedTableCursors1641( ) ;
   }

   public void update1641( )
   {
      beforeValidate1641( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1641( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1641( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1641( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1641( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001617 */
                  pr_default.execute(15, new Object[] {new Boolean(n715TBW03_OUTER_SUBJECT_ID), A715TBW03_OUTER_SUBJECT_ID, new Boolean(n716TBW03_CRF_LATEST_VERSION), new Short(A716TBW03_CRF_LATEST_VERSION), new Boolean(n717TBW03_CRF_INPUT_LEVEL), new Byte(A717TBW03_CRF_INPUT_LEVEL), new Boolean(n718TBW03_LOCK_FLG), A718TBW03_LOCK_FLG, new Boolean(n719TBW03_LOCK_DATETIME), A719TBW03_LOCK_DATETIME, new Boolean(n721TBW03_LOCK_AUTH_CD), A721TBW03_LOCK_AUTH_CD, new Boolean(n722TBW03_UPLOAD_DATETIME), A722TBW03_UPLOAD_DATETIME, new Boolean(n724TBW03_UPLOAD_AUTH_CD), A724TBW03_UPLOAD_AUTH_CD, new Boolean(n725TBW03_DM_ARRIVAL_FLG), A725TBW03_DM_ARRIVAL_FLG, new Boolean(n726TBW03_DM_ARRIVAL_DATETIME), A726TBW03_DM_ARRIVAL_DATETIME, new Boolean(n727TBW03_APPROVAL_FLG), A727TBW03_APPROVAL_FLG, new Boolean(n728TBW03_APPROVAL_DATETIME), A728TBW03_APPROVAL_DATETIME, new Boolean(n730TBW03_APPROVAL_AUTH_CD), A730TBW03_APPROVAL_AUTH_CD, new Boolean(n731TBW03_INPUT_END_FLG), A731TBW03_INPUT_END_FLG, new Boolean(n732TBW03_INPUT_END_DATETIME), A732TBW03_INPUT_END_DATETIME, new Boolean(n734TBW03_INPUT_END_AUTH_CD), A734TBW03_INPUT_END_AUTH_CD, new Boolean(n780TBW03_DEL_FLG), A780TBW03_DEL_FLG, new Boolean(n781TBW03_CRT_DATETIME), A781TBW03_CRT_DATETIME, new Boolean(n783TBW03_CRT_PROG_NM), A783TBW03_CRT_PROG_NM, new Boolean(n784TBW03_UPD_DATETIME), A784TBW03_UPD_DATETIME, new Boolean(n786TBW03_UPD_PROG_NM), A786TBW03_UPD_PROG_NM, new Boolean(n787TBW03_UPD_CNT), new Long(A787TBW03_UPD_CNT), new Boolean(n120TBW03_SITE_ID), A120TBW03_SITE_ID, new Boolean(n116TBW03_LOCK_USER_ID), A116TBW03_LOCK_USER_ID, new Boolean(n117TBW03_UPLOAD_USER_ID), A117TBW03_UPLOAD_USER_ID, new Boolean(n118TBW03_APPROVAL_USER_ID), A118TBW03_APPROVAL_USER_ID, new Boolean(n119TBW03_INPUT_END_USER_ID), A119TBW03_INPUT_END_USER_ID, new Boolean(n121TBW03_CRT_USER_ID), A121TBW03_CRT_USER_ID, new Boolean(n122TBW03_UPD_USER_ID), A122TBW03_UPD_USER_ID, A110TBW03_SESSION_ID, A111TBW03_APP_ID, A112TBW03_DISP_DATETIME, new Long(A113TBW03_STUDY_ID), new Integer(A114TBW03_SUBJECT_ID), new Short(A115TBW03_CRF_ID)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBW03_CRF_SEARCH") ;
                  if ( (pr_default.getStatus(15) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBW03_CRF_SEARCH"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1641( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "", true);
                        resetCaption160( ) ;
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
         endLevel1641( ) ;
      }
      closeExtendedTableCursors1641( ) ;
   }

   public void deferredUpdate1641( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1641( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1641( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1641( ) ;
         afterConfirm1641( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1641( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T001618 */
               pr_default.execute(16, new Object[] {A110TBW03_SESSION_ID, A111TBW03_APP_ID, A112TBW03_DISP_DATETIME, new Long(A113TBW03_STUDY_ID), new Integer(A114TBW03_SUBJECT_ID), new Short(A115TBW03_CRF_ID)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TBW03_CRF_SEARCH") ;
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound41 == 0 )
                     {
                        initAll1641( ) ;
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
                     resetCaption160( ) ;
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
      sMode41 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1641( ) ;
      Gx_mode = sMode41 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1641( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV8Pgmname = "TBW03_CRF_SEARCH" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8Pgmname", AV8Pgmname);
         /* Using cursor T001619 */
         pr_default.execute(17, new Object[] {new Long(A113TBW03_STUDY_ID), new Short(A115TBW03_CRF_ID)});
         A710TBW03_CRF_NM = T001619_A710TBW03_CRF_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A710TBW03_CRF_NM", A710TBW03_CRF_NM);
         n710TBW03_CRF_NM = T001619_n710TBW03_CRF_NM[0] ;
         A711TBW03_CRF_SNM = T001619_A711TBW03_CRF_SNM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A711TBW03_CRF_SNM", A711TBW03_CRF_SNM);
         n711TBW03_CRF_SNM = T001619_n711TBW03_CRF_SNM[0] ;
         A712TBW03_CRF_ORDER = T001619_A712TBW03_CRF_ORDER[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A712TBW03_CRF_ORDER", GXutil.ltrim( GXutil.str( A712TBW03_CRF_ORDER, 5, 0)));
         n712TBW03_CRF_ORDER = T001619_n712TBW03_CRF_ORDER[0] ;
         pr_default.close(17);
         /* Using cursor T001620 */
         pr_default.execute(18, new Object[] {new Boolean(n120TBW03_SITE_ID), A120TBW03_SITE_ID});
         A713TBW03_SITE_NM = T001620_A713TBW03_SITE_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A713TBW03_SITE_NM", A713TBW03_SITE_NM);
         n713TBW03_SITE_NM = T001620_n713TBW03_SITE_NM[0] ;
         A714TBW03_SITE_RYAK_NM = T001620_A714TBW03_SITE_RYAK_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A714TBW03_SITE_RYAK_NM", A714TBW03_SITE_RYAK_NM);
         n714TBW03_SITE_RYAK_NM = T001620_n714TBW03_SITE_RYAK_NM[0] ;
         pr_default.close(18);
         /* Using cursor T001621 */
         pr_default.execute(19, new Object[] {new Boolean(n116TBW03_LOCK_USER_ID), A116TBW03_LOCK_USER_ID});
         A720TBW03_LOCK_USER_NM = T001621_A720TBW03_LOCK_USER_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A720TBW03_LOCK_USER_NM", A720TBW03_LOCK_USER_NM);
         n720TBW03_LOCK_USER_NM = T001621_n720TBW03_LOCK_USER_NM[0] ;
         pr_default.close(19);
         /* Using cursor T001622 */
         pr_default.execute(20, new Object[] {new Boolean(n117TBW03_UPLOAD_USER_ID), A117TBW03_UPLOAD_USER_ID});
         A723TBW03_UPLOAD_USER_NM = T001622_A723TBW03_UPLOAD_USER_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A723TBW03_UPLOAD_USER_NM", A723TBW03_UPLOAD_USER_NM);
         n723TBW03_UPLOAD_USER_NM = T001622_n723TBW03_UPLOAD_USER_NM[0] ;
         pr_default.close(20);
         /* Using cursor T001623 */
         pr_default.execute(21, new Object[] {new Boolean(n118TBW03_APPROVAL_USER_ID), A118TBW03_APPROVAL_USER_ID});
         A729TBW03_APPROVAL_USER_NM = T001623_A729TBW03_APPROVAL_USER_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A729TBW03_APPROVAL_USER_NM", A729TBW03_APPROVAL_USER_NM);
         n729TBW03_APPROVAL_USER_NM = T001623_n729TBW03_APPROVAL_USER_NM[0] ;
         pr_default.close(21);
         /* Using cursor T001624 */
         pr_default.execute(22, new Object[] {new Boolean(n119TBW03_INPUT_END_USER_ID), A119TBW03_INPUT_END_USER_ID});
         A733TBW03_INPUT_END_USER_NM = T001624_A733TBW03_INPUT_END_USER_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A733TBW03_INPUT_END_USER_NM", A733TBW03_INPUT_END_USER_NM);
         n733TBW03_INPUT_END_USER_NM = T001624_n733TBW03_INPUT_END_USER_NM[0] ;
         pr_default.close(22);
         /* Using cursor T001625 */
         pr_default.execute(23, new Object[] {new Boolean(n121TBW03_CRT_USER_ID), A121TBW03_CRT_USER_ID});
         A782TBW03_CRT_USER_NM = T001625_A782TBW03_CRT_USER_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A782TBW03_CRT_USER_NM", A782TBW03_CRT_USER_NM);
         n782TBW03_CRT_USER_NM = T001625_n782TBW03_CRT_USER_NM[0] ;
         pr_default.close(23);
         /* Using cursor T001626 */
         pr_default.execute(24, new Object[] {new Boolean(n122TBW03_UPD_USER_ID), A122TBW03_UPD_USER_ID});
         A785TBW03_UPD_USER_NM = T001626_A785TBW03_UPD_USER_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A785TBW03_UPD_USER_NM", A785TBW03_UPD_USER_NM);
         n785TBW03_UPD_USER_NM = T001626_n785TBW03_UPD_USER_NM[0] ;
         pr_default.close(24);
      }
   }

   public void endLevel1641( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1641( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "tbw03_crf_search");
         if ( AnyError == 0 )
         {
            confirmValues160( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "tbw03_crf_search");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1641( )
   {
      /* Scan By routine */
      /* Using cursor T001627 */
      pr_default.execute(25);
      RcdFound41 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound41 = (short)(1) ;
         A110TBW03_SESSION_ID = T001627_A110TBW03_SESSION_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A110TBW03_SESSION_ID", A110TBW03_SESSION_ID);
         A111TBW03_APP_ID = T001627_A111TBW03_APP_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A111TBW03_APP_ID", A111TBW03_APP_ID);
         A112TBW03_DISP_DATETIME = T001627_A112TBW03_DISP_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A112TBW03_DISP_DATETIME", A112TBW03_DISP_DATETIME);
         A113TBW03_STUDY_ID = T001627_A113TBW03_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A113TBW03_STUDY_ID", GXutil.ltrim( GXutil.str( A113TBW03_STUDY_ID, 10, 0)));
         A114TBW03_SUBJECT_ID = T001627_A114TBW03_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A114TBW03_SUBJECT_ID", GXutil.ltrim( GXutil.str( A114TBW03_SUBJECT_ID, 6, 0)));
         A115TBW03_CRF_ID = T001627_A115TBW03_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A115TBW03_CRF_ID", GXutil.ltrim( GXutil.str( A115TBW03_CRF_ID, 4, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1641( )
   {
      /* Scan next routine */
      pr_default.readNext(25);
      RcdFound41 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound41 = (short)(1) ;
         A110TBW03_SESSION_ID = T001627_A110TBW03_SESSION_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A110TBW03_SESSION_ID", A110TBW03_SESSION_ID);
         A111TBW03_APP_ID = T001627_A111TBW03_APP_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A111TBW03_APP_ID", A111TBW03_APP_ID);
         A112TBW03_DISP_DATETIME = T001627_A112TBW03_DISP_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A112TBW03_DISP_DATETIME", A112TBW03_DISP_DATETIME);
         A113TBW03_STUDY_ID = T001627_A113TBW03_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A113TBW03_STUDY_ID", GXutil.ltrim( GXutil.str( A113TBW03_STUDY_ID, 10, 0)));
         A114TBW03_SUBJECT_ID = T001627_A114TBW03_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A114TBW03_SUBJECT_ID", GXutil.ltrim( GXutil.str( A114TBW03_SUBJECT_ID, 6, 0)));
         A115TBW03_CRF_ID = T001627_A115TBW03_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A115TBW03_CRF_ID", GXutil.ltrim( GXutil.str( A115TBW03_CRF_ID, 4, 0)));
      }
   }

   public void scanEnd1641( )
   {
      pr_default.close(25);
   }

   public void afterConfirm1641( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1641( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1641( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1641( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1641( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1641( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1641( )
   {
      edtTBW03_SESSION_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW03_SESSION_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW03_SESSION_ID_Enabled, 5, 0)));
      edtTBW03_APP_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW03_APP_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW03_APP_ID_Enabled, 5, 0)));
      edtTBW03_DISP_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW03_DISP_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW03_DISP_DATETIME_Enabled, 5, 0)));
      edtTBW03_STUDY_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW03_STUDY_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW03_STUDY_ID_Enabled, 5, 0)));
      edtTBW03_SUBJECT_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW03_SUBJECT_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW03_SUBJECT_ID_Enabled, 5, 0)));
      edtTBW03_CRF_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW03_CRF_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW03_CRF_ID_Enabled, 5, 0)));
      edtTBW03_CRF_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW03_CRF_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW03_CRF_NM_Enabled, 5, 0)));
      edtTBW03_CRF_SNM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW03_CRF_SNM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW03_CRF_SNM_Enabled, 5, 0)));
      edtTBW03_CRF_ORDER_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW03_CRF_ORDER_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW03_CRF_ORDER_Enabled, 5, 0)));
      edtTBW03_SITE_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW03_SITE_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW03_SITE_ID_Enabled, 5, 0)));
      edtTBW03_SITE_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW03_SITE_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW03_SITE_NM_Enabled, 5, 0)));
      edtTBW03_SITE_RYAK_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW03_SITE_RYAK_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW03_SITE_RYAK_NM_Enabled, 5, 0)));
      edtTBW03_OUTER_SUBJECT_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW03_OUTER_SUBJECT_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW03_OUTER_SUBJECT_ID_Enabled, 5, 0)));
      edtTBW03_CRF_LATEST_VERSION_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW03_CRF_LATEST_VERSION_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW03_CRF_LATEST_VERSION_Enabled, 5, 0)));
      edtTBW03_CRF_INPUT_LEVEL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW03_CRF_INPUT_LEVEL_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW03_CRF_INPUT_LEVEL_Enabled, 5, 0)));
      edtTBW03_LOCK_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW03_LOCK_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW03_LOCK_FLG_Enabled, 5, 0)));
      edtTBW03_LOCK_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW03_LOCK_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW03_LOCK_DATETIME_Enabled, 5, 0)));
      edtTBW03_LOCK_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW03_LOCK_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW03_LOCK_USER_ID_Enabled, 5, 0)));
      edtTBW03_LOCK_USER_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW03_LOCK_USER_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW03_LOCK_USER_NM_Enabled, 5, 0)));
      edtTBW03_LOCK_AUTH_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW03_LOCK_AUTH_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW03_LOCK_AUTH_CD_Enabled, 5, 0)));
      edtTBW03_UPLOAD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW03_UPLOAD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW03_UPLOAD_DATETIME_Enabled, 5, 0)));
      edtTBW03_UPLOAD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW03_UPLOAD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW03_UPLOAD_USER_ID_Enabled, 5, 0)));
      edtTBW03_UPLOAD_USER_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW03_UPLOAD_USER_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW03_UPLOAD_USER_NM_Enabled, 5, 0)));
      edtTBW03_UPLOAD_AUTH_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW03_UPLOAD_AUTH_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW03_UPLOAD_AUTH_CD_Enabled, 5, 0)));
      edtTBW03_DM_ARRIVAL_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW03_DM_ARRIVAL_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW03_DM_ARRIVAL_FLG_Enabled, 5, 0)));
      edtTBW03_DM_ARRIVAL_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW03_DM_ARRIVAL_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW03_DM_ARRIVAL_DATETIME_Enabled, 5, 0)));
      edtTBW03_APPROVAL_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW03_APPROVAL_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW03_APPROVAL_FLG_Enabled, 5, 0)));
      edtTBW03_APPROVAL_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW03_APPROVAL_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW03_APPROVAL_DATETIME_Enabled, 5, 0)));
      edtTBW03_APPROVAL_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW03_APPROVAL_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW03_APPROVAL_USER_ID_Enabled, 5, 0)));
      edtTBW03_APPROVAL_USER_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW03_APPROVAL_USER_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW03_APPROVAL_USER_NM_Enabled, 5, 0)));
      edtTBW03_APPROVAL_AUTH_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW03_APPROVAL_AUTH_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW03_APPROVAL_AUTH_CD_Enabled, 5, 0)));
      edtTBW03_INPUT_END_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW03_INPUT_END_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW03_INPUT_END_FLG_Enabled, 5, 0)));
      edtTBW03_INPUT_END_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW03_INPUT_END_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW03_INPUT_END_DATETIME_Enabled, 5, 0)));
      edtTBW03_INPUT_END_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW03_INPUT_END_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW03_INPUT_END_USER_ID_Enabled, 5, 0)));
      edtTBW03_INPUT_END_USER_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW03_INPUT_END_USER_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW03_INPUT_END_USER_NM_Enabled, 5, 0)));
      edtTBW03_INPUT_END_AUTH_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW03_INPUT_END_AUTH_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW03_INPUT_END_AUTH_CD_Enabled, 5, 0)));
      edtTBW03_DEL_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW03_DEL_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW03_DEL_FLG_Enabled, 5, 0)));
      edtTBW03_CRT_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW03_CRT_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW03_CRT_DATETIME_Enabled, 5, 0)));
      edtTBW03_CRT_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW03_CRT_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW03_CRT_USER_ID_Enabled, 5, 0)));
      edtTBW03_CRT_USER_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW03_CRT_USER_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW03_CRT_USER_NM_Enabled, 5, 0)));
      edtTBW03_CRT_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW03_CRT_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW03_CRT_PROG_NM_Enabled, 5, 0)));
      edtTBW03_UPD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW03_UPD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW03_UPD_DATETIME_Enabled, 5, 0)));
      edtTBW03_UPD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW03_UPD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW03_UPD_USER_ID_Enabled, 5, 0)));
      edtTBW03_UPD_USER_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW03_UPD_USER_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW03_UPD_USER_NM_Enabled, 5, 0)));
      edtTBW03_UPD_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW03_UPD_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW03_UPD_PROG_NM_Enabled, 5, 0)));
      edtTBW03_UPD_CNT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW03_UPD_CNT_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW03_UPD_CNT_Enabled, 5, 0)));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues160( )
   {
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv());
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( "CRF検索ワーク") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?20177317161724");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("tbw03_crf_search") +"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm1641( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z110TBW03_SESSION_ID", GXutil.rtrim( Z110TBW03_SESSION_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z111TBW03_APP_ID", GXutil.rtrim( Z111TBW03_APP_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z112TBW03_DISP_DATETIME", GXutil.rtrim( Z112TBW03_DISP_DATETIME));
      GxWebStd.gx_hidden_field( httpContext, "Z113TBW03_STUDY_ID", GXutil.ltrim( localUtil.ntoc( Z113TBW03_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z114TBW03_SUBJECT_ID", GXutil.ltrim( localUtil.ntoc( Z114TBW03_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z115TBW03_CRF_ID", GXutil.ltrim( localUtil.ntoc( Z115TBW03_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z715TBW03_OUTER_SUBJECT_ID", GXutil.rtrim( Z715TBW03_OUTER_SUBJECT_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z716TBW03_CRF_LATEST_VERSION", GXutil.ltrim( localUtil.ntoc( Z716TBW03_CRF_LATEST_VERSION, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z717TBW03_CRF_INPUT_LEVEL", GXutil.ltrim( localUtil.ntoc( Z717TBW03_CRF_INPUT_LEVEL, (byte)(2), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z718TBW03_LOCK_FLG", GXutil.rtrim( Z718TBW03_LOCK_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z719TBW03_LOCK_DATETIME", localUtil.ttoc( Z719TBW03_LOCK_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z721TBW03_LOCK_AUTH_CD", GXutil.rtrim( Z721TBW03_LOCK_AUTH_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z722TBW03_UPLOAD_DATETIME", localUtil.ttoc( Z722TBW03_UPLOAD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z724TBW03_UPLOAD_AUTH_CD", GXutil.rtrim( Z724TBW03_UPLOAD_AUTH_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z725TBW03_DM_ARRIVAL_FLG", GXutil.rtrim( Z725TBW03_DM_ARRIVAL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z726TBW03_DM_ARRIVAL_DATETIME", localUtil.ttoc( Z726TBW03_DM_ARRIVAL_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z727TBW03_APPROVAL_FLG", GXutil.rtrim( Z727TBW03_APPROVAL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z728TBW03_APPROVAL_DATETIME", localUtil.ttoc( Z728TBW03_APPROVAL_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z730TBW03_APPROVAL_AUTH_CD", GXutil.rtrim( Z730TBW03_APPROVAL_AUTH_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z731TBW03_INPUT_END_FLG", GXutil.rtrim( Z731TBW03_INPUT_END_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z732TBW03_INPUT_END_DATETIME", localUtil.ttoc( Z732TBW03_INPUT_END_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z734TBW03_INPUT_END_AUTH_CD", GXutil.rtrim( Z734TBW03_INPUT_END_AUTH_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z780TBW03_DEL_FLG", GXutil.rtrim( Z780TBW03_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z781TBW03_CRT_DATETIME", localUtil.ttoc( Z781TBW03_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z783TBW03_CRT_PROG_NM", GXutil.rtrim( Z783TBW03_CRT_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z784TBW03_UPD_DATETIME", localUtil.ttoc( Z784TBW03_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z786TBW03_UPD_PROG_NM", GXutil.rtrim( Z786TBW03_UPD_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z787TBW03_UPD_CNT", GXutil.ltrim( localUtil.ntoc( Z787TBW03_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z120TBW03_SITE_ID", GXutil.rtrim( Z120TBW03_SITE_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z116TBW03_LOCK_USER_ID", GXutil.rtrim( Z116TBW03_LOCK_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z117TBW03_UPLOAD_USER_ID", GXutil.rtrim( Z117TBW03_UPLOAD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z118TBW03_APPROVAL_USER_ID", GXutil.rtrim( Z118TBW03_APPROVAL_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z119TBW03_INPUT_END_USER_ID", GXutil.rtrim( Z119TBW03_INPUT_END_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z121TBW03_CRT_USER_ID", GXutil.rtrim( Z121TBW03_CRT_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z122TBW03_UPD_USER_ID", GXutil.rtrim( Z122TBW03_UPD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV8Pgmname));
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
      return "TBW03_CRF_SEARCH" ;
   }

   public String getPgmdesc( )
   {
      return "CRF検索ワーク" ;
   }

   public void initializeNonKey1641( )
   {
      A710TBW03_CRF_NM = "" ;
      n710TBW03_CRF_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A710TBW03_CRF_NM", A710TBW03_CRF_NM);
      A711TBW03_CRF_SNM = "" ;
      n711TBW03_CRF_SNM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A711TBW03_CRF_SNM", A711TBW03_CRF_SNM);
      A712TBW03_CRF_ORDER = 0 ;
      n712TBW03_CRF_ORDER = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A712TBW03_CRF_ORDER", GXutil.ltrim( GXutil.str( A712TBW03_CRF_ORDER, 5, 0)));
      A120TBW03_SITE_ID = "" ;
      n120TBW03_SITE_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A120TBW03_SITE_ID", A120TBW03_SITE_ID);
      n120TBW03_SITE_ID = ((GXutil.strcmp("", A120TBW03_SITE_ID)==0) ? true : false) ;
      A713TBW03_SITE_NM = "" ;
      n713TBW03_SITE_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A713TBW03_SITE_NM", A713TBW03_SITE_NM);
      A714TBW03_SITE_RYAK_NM = "" ;
      n714TBW03_SITE_RYAK_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A714TBW03_SITE_RYAK_NM", A714TBW03_SITE_RYAK_NM);
      A715TBW03_OUTER_SUBJECT_ID = "" ;
      n715TBW03_OUTER_SUBJECT_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A715TBW03_OUTER_SUBJECT_ID", A715TBW03_OUTER_SUBJECT_ID);
      n715TBW03_OUTER_SUBJECT_ID = ((GXutil.strcmp("", A715TBW03_OUTER_SUBJECT_ID)==0) ? true : false) ;
      A716TBW03_CRF_LATEST_VERSION = (short)(0) ;
      n716TBW03_CRF_LATEST_VERSION = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A716TBW03_CRF_LATEST_VERSION", GXutil.ltrim( GXutil.str( A716TBW03_CRF_LATEST_VERSION, 4, 0)));
      n716TBW03_CRF_LATEST_VERSION = ((0==A716TBW03_CRF_LATEST_VERSION) ? true : false) ;
      A717TBW03_CRF_INPUT_LEVEL = (byte)(0) ;
      n717TBW03_CRF_INPUT_LEVEL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A717TBW03_CRF_INPUT_LEVEL", GXutil.ltrim( GXutil.str( A717TBW03_CRF_INPUT_LEVEL, 2, 0)));
      n717TBW03_CRF_INPUT_LEVEL = ((0==A717TBW03_CRF_INPUT_LEVEL) ? true : false) ;
      A718TBW03_LOCK_FLG = "" ;
      n718TBW03_LOCK_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A718TBW03_LOCK_FLG", A718TBW03_LOCK_FLG);
      n718TBW03_LOCK_FLG = ((GXutil.strcmp("", A718TBW03_LOCK_FLG)==0) ? true : false) ;
      A719TBW03_LOCK_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n719TBW03_LOCK_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A719TBW03_LOCK_DATETIME", localUtil.ttoc( A719TBW03_LOCK_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n719TBW03_LOCK_DATETIME = (GXutil.nullDate().equals(A719TBW03_LOCK_DATETIME) ? true : false) ;
      A116TBW03_LOCK_USER_ID = "" ;
      n116TBW03_LOCK_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A116TBW03_LOCK_USER_ID", A116TBW03_LOCK_USER_ID);
      n116TBW03_LOCK_USER_ID = ((GXutil.strcmp("", A116TBW03_LOCK_USER_ID)==0) ? true : false) ;
      A720TBW03_LOCK_USER_NM = "" ;
      n720TBW03_LOCK_USER_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A720TBW03_LOCK_USER_NM", A720TBW03_LOCK_USER_NM);
      A721TBW03_LOCK_AUTH_CD = "" ;
      n721TBW03_LOCK_AUTH_CD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A721TBW03_LOCK_AUTH_CD", A721TBW03_LOCK_AUTH_CD);
      n721TBW03_LOCK_AUTH_CD = ((GXutil.strcmp("", A721TBW03_LOCK_AUTH_CD)==0) ? true : false) ;
      A722TBW03_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n722TBW03_UPLOAD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A722TBW03_UPLOAD_DATETIME", localUtil.ttoc( A722TBW03_UPLOAD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n722TBW03_UPLOAD_DATETIME = (GXutil.nullDate().equals(A722TBW03_UPLOAD_DATETIME) ? true : false) ;
      A117TBW03_UPLOAD_USER_ID = "" ;
      n117TBW03_UPLOAD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A117TBW03_UPLOAD_USER_ID", A117TBW03_UPLOAD_USER_ID);
      n117TBW03_UPLOAD_USER_ID = ((GXutil.strcmp("", A117TBW03_UPLOAD_USER_ID)==0) ? true : false) ;
      A723TBW03_UPLOAD_USER_NM = "" ;
      n723TBW03_UPLOAD_USER_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A723TBW03_UPLOAD_USER_NM", A723TBW03_UPLOAD_USER_NM);
      A724TBW03_UPLOAD_AUTH_CD = "" ;
      n724TBW03_UPLOAD_AUTH_CD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A724TBW03_UPLOAD_AUTH_CD", A724TBW03_UPLOAD_AUTH_CD);
      n724TBW03_UPLOAD_AUTH_CD = ((GXutil.strcmp("", A724TBW03_UPLOAD_AUTH_CD)==0) ? true : false) ;
      A725TBW03_DM_ARRIVAL_FLG = "" ;
      n725TBW03_DM_ARRIVAL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A725TBW03_DM_ARRIVAL_FLG", A725TBW03_DM_ARRIVAL_FLG);
      n725TBW03_DM_ARRIVAL_FLG = ((GXutil.strcmp("", A725TBW03_DM_ARRIVAL_FLG)==0) ? true : false) ;
      A726TBW03_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n726TBW03_DM_ARRIVAL_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A726TBW03_DM_ARRIVAL_DATETIME", localUtil.ttoc( A726TBW03_DM_ARRIVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n726TBW03_DM_ARRIVAL_DATETIME = (GXutil.nullDate().equals(A726TBW03_DM_ARRIVAL_DATETIME) ? true : false) ;
      A727TBW03_APPROVAL_FLG = "" ;
      n727TBW03_APPROVAL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A727TBW03_APPROVAL_FLG", A727TBW03_APPROVAL_FLG);
      n727TBW03_APPROVAL_FLG = ((GXutil.strcmp("", A727TBW03_APPROVAL_FLG)==0) ? true : false) ;
      A728TBW03_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n728TBW03_APPROVAL_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A728TBW03_APPROVAL_DATETIME", localUtil.ttoc( A728TBW03_APPROVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n728TBW03_APPROVAL_DATETIME = (GXutil.nullDate().equals(A728TBW03_APPROVAL_DATETIME) ? true : false) ;
      A118TBW03_APPROVAL_USER_ID = "" ;
      n118TBW03_APPROVAL_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A118TBW03_APPROVAL_USER_ID", A118TBW03_APPROVAL_USER_ID);
      n118TBW03_APPROVAL_USER_ID = ((GXutil.strcmp("", A118TBW03_APPROVAL_USER_ID)==0) ? true : false) ;
      A729TBW03_APPROVAL_USER_NM = "" ;
      n729TBW03_APPROVAL_USER_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A729TBW03_APPROVAL_USER_NM", A729TBW03_APPROVAL_USER_NM);
      A730TBW03_APPROVAL_AUTH_CD = "" ;
      n730TBW03_APPROVAL_AUTH_CD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A730TBW03_APPROVAL_AUTH_CD", A730TBW03_APPROVAL_AUTH_CD);
      n730TBW03_APPROVAL_AUTH_CD = ((GXutil.strcmp("", A730TBW03_APPROVAL_AUTH_CD)==0) ? true : false) ;
      A731TBW03_INPUT_END_FLG = "" ;
      n731TBW03_INPUT_END_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A731TBW03_INPUT_END_FLG", A731TBW03_INPUT_END_FLG);
      n731TBW03_INPUT_END_FLG = ((GXutil.strcmp("", A731TBW03_INPUT_END_FLG)==0) ? true : false) ;
      A732TBW03_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n732TBW03_INPUT_END_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A732TBW03_INPUT_END_DATETIME", localUtil.ttoc( A732TBW03_INPUT_END_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n732TBW03_INPUT_END_DATETIME = (GXutil.nullDate().equals(A732TBW03_INPUT_END_DATETIME) ? true : false) ;
      A119TBW03_INPUT_END_USER_ID = "" ;
      n119TBW03_INPUT_END_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A119TBW03_INPUT_END_USER_ID", A119TBW03_INPUT_END_USER_ID);
      n119TBW03_INPUT_END_USER_ID = ((GXutil.strcmp("", A119TBW03_INPUT_END_USER_ID)==0) ? true : false) ;
      A733TBW03_INPUT_END_USER_NM = "" ;
      n733TBW03_INPUT_END_USER_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A733TBW03_INPUT_END_USER_NM", A733TBW03_INPUT_END_USER_NM);
      A734TBW03_INPUT_END_AUTH_CD = "" ;
      n734TBW03_INPUT_END_AUTH_CD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A734TBW03_INPUT_END_AUTH_CD", A734TBW03_INPUT_END_AUTH_CD);
      n734TBW03_INPUT_END_AUTH_CD = ((GXutil.strcmp("", A734TBW03_INPUT_END_AUTH_CD)==0) ? true : false) ;
      A780TBW03_DEL_FLG = "" ;
      n780TBW03_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A780TBW03_DEL_FLG", A780TBW03_DEL_FLG);
      n780TBW03_DEL_FLG = ((GXutil.strcmp("", A780TBW03_DEL_FLG)==0) ? true : false) ;
      A781TBW03_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n781TBW03_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A781TBW03_CRT_DATETIME", localUtil.ttoc( A781TBW03_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n781TBW03_CRT_DATETIME = (GXutil.nullDate().equals(A781TBW03_CRT_DATETIME) ? true : false) ;
      A121TBW03_CRT_USER_ID = "" ;
      n121TBW03_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A121TBW03_CRT_USER_ID", A121TBW03_CRT_USER_ID);
      n121TBW03_CRT_USER_ID = ((GXutil.strcmp("", A121TBW03_CRT_USER_ID)==0) ? true : false) ;
      A782TBW03_CRT_USER_NM = "" ;
      n782TBW03_CRT_USER_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A782TBW03_CRT_USER_NM", A782TBW03_CRT_USER_NM);
      A783TBW03_CRT_PROG_NM = "" ;
      n783TBW03_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A783TBW03_CRT_PROG_NM", A783TBW03_CRT_PROG_NM);
      n783TBW03_CRT_PROG_NM = ((GXutil.strcmp("", A783TBW03_CRT_PROG_NM)==0) ? true : false) ;
      A784TBW03_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n784TBW03_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A784TBW03_UPD_DATETIME", localUtil.ttoc( A784TBW03_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n784TBW03_UPD_DATETIME = (GXutil.nullDate().equals(A784TBW03_UPD_DATETIME) ? true : false) ;
      A122TBW03_UPD_USER_ID = "" ;
      n122TBW03_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A122TBW03_UPD_USER_ID", A122TBW03_UPD_USER_ID);
      n122TBW03_UPD_USER_ID = ((GXutil.strcmp("", A122TBW03_UPD_USER_ID)==0) ? true : false) ;
      A785TBW03_UPD_USER_NM = "" ;
      n785TBW03_UPD_USER_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A785TBW03_UPD_USER_NM", A785TBW03_UPD_USER_NM);
      A786TBW03_UPD_PROG_NM = "" ;
      n786TBW03_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A786TBW03_UPD_PROG_NM", A786TBW03_UPD_PROG_NM);
      n786TBW03_UPD_PROG_NM = ((GXutil.strcmp("", A786TBW03_UPD_PROG_NM)==0) ? true : false) ;
      A787TBW03_UPD_CNT = 0 ;
      n787TBW03_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A787TBW03_UPD_CNT", GXutil.ltrim( GXutil.str( A787TBW03_UPD_CNT, 10, 0)));
      n787TBW03_UPD_CNT = ((0==A787TBW03_UPD_CNT) ? true : false) ;
   }

   public void initAll1641( )
   {
      A110TBW03_SESSION_ID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A110TBW03_SESSION_ID", A110TBW03_SESSION_ID);
      A111TBW03_APP_ID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A111TBW03_APP_ID", A111TBW03_APP_ID);
      A112TBW03_DISP_DATETIME = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A112TBW03_DISP_DATETIME", A112TBW03_DISP_DATETIME);
      A113TBW03_STUDY_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A113TBW03_STUDY_ID", GXutil.ltrim( GXutil.str( A113TBW03_STUDY_ID, 10, 0)));
      A114TBW03_SUBJECT_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A114TBW03_SUBJECT_ID", GXutil.ltrim( GXutil.str( A114TBW03_SUBJECT_ID, 6, 0)));
      A115TBW03_CRF_ID = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A115TBW03_CRF_ID", GXutil.ltrim( GXutil.str( A115TBW03_CRF_ID, 4, 0)));
      initializeNonKey1641( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20177317161748");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("tbw03_crf_search.js", "?20177317161748");
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
      lblTextblocktbw03_session_id_Internalname = "TEXTBLOCKTBW03_SESSION_ID" ;
      edtTBW03_SESSION_ID_Internalname = "TBW03_SESSION_ID" ;
      lblTextblocktbw03_app_id_Internalname = "TEXTBLOCKTBW03_APP_ID" ;
      edtTBW03_APP_ID_Internalname = "TBW03_APP_ID" ;
      lblTextblocktbw03_disp_datetime_Internalname = "TEXTBLOCKTBW03_DISP_DATETIME" ;
      edtTBW03_DISP_DATETIME_Internalname = "TBW03_DISP_DATETIME" ;
      lblTextblocktbw03_study_id_Internalname = "TEXTBLOCKTBW03_STUDY_ID" ;
      edtTBW03_STUDY_ID_Internalname = "TBW03_STUDY_ID" ;
      lblTextblocktbw03_subject_id_Internalname = "TEXTBLOCKTBW03_SUBJECT_ID" ;
      edtTBW03_SUBJECT_ID_Internalname = "TBW03_SUBJECT_ID" ;
      lblTextblocktbw03_crf_id_Internalname = "TEXTBLOCKTBW03_CRF_ID" ;
      edtTBW03_CRF_ID_Internalname = "TBW03_CRF_ID" ;
      lblTextblocktbw03_crf_nm_Internalname = "TEXTBLOCKTBW03_CRF_NM" ;
      edtTBW03_CRF_NM_Internalname = "TBW03_CRF_NM" ;
      lblTextblocktbw03_crf_snm_Internalname = "TEXTBLOCKTBW03_CRF_SNM" ;
      edtTBW03_CRF_SNM_Internalname = "TBW03_CRF_SNM" ;
      lblTextblocktbw03_crf_order_Internalname = "TEXTBLOCKTBW03_CRF_ORDER" ;
      edtTBW03_CRF_ORDER_Internalname = "TBW03_CRF_ORDER" ;
      lblTextblocktbw03_site_id_Internalname = "TEXTBLOCKTBW03_SITE_ID" ;
      edtTBW03_SITE_ID_Internalname = "TBW03_SITE_ID" ;
      lblTextblocktbw03_site_nm_Internalname = "TEXTBLOCKTBW03_SITE_NM" ;
      edtTBW03_SITE_NM_Internalname = "TBW03_SITE_NM" ;
      lblTextblocktbw03_site_ryak_nm_Internalname = "TEXTBLOCKTBW03_SITE_RYAK_NM" ;
      edtTBW03_SITE_RYAK_NM_Internalname = "TBW03_SITE_RYAK_NM" ;
      lblTextblocktbw03_outer_subject_id_Internalname = "TEXTBLOCKTBW03_OUTER_SUBJECT_ID" ;
      edtTBW03_OUTER_SUBJECT_ID_Internalname = "TBW03_OUTER_SUBJECT_ID" ;
      lblTextblocktbw03_crf_latest_version_Internalname = "TEXTBLOCKTBW03_CRF_LATEST_VERSION" ;
      edtTBW03_CRF_LATEST_VERSION_Internalname = "TBW03_CRF_LATEST_VERSION" ;
      lblTextblocktbw03_crf_input_level_Internalname = "TEXTBLOCKTBW03_CRF_INPUT_LEVEL" ;
      edtTBW03_CRF_INPUT_LEVEL_Internalname = "TBW03_CRF_INPUT_LEVEL" ;
      lblTextblocktbw03_lock_flg_Internalname = "TEXTBLOCKTBW03_LOCK_FLG" ;
      edtTBW03_LOCK_FLG_Internalname = "TBW03_LOCK_FLG" ;
      lblTextblocktbw03_lock_datetime_Internalname = "TEXTBLOCKTBW03_LOCK_DATETIME" ;
      edtTBW03_LOCK_DATETIME_Internalname = "TBW03_LOCK_DATETIME" ;
      lblTextblocktbw03_lock_user_id_Internalname = "TEXTBLOCKTBW03_LOCK_USER_ID" ;
      edtTBW03_LOCK_USER_ID_Internalname = "TBW03_LOCK_USER_ID" ;
      lblTextblocktbw03_lock_user_nm_Internalname = "TEXTBLOCKTBW03_LOCK_USER_NM" ;
      edtTBW03_LOCK_USER_NM_Internalname = "TBW03_LOCK_USER_NM" ;
      lblTextblocktbw03_lock_auth_cd_Internalname = "TEXTBLOCKTBW03_LOCK_AUTH_CD" ;
      edtTBW03_LOCK_AUTH_CD_Internalname = "TBW03_LOCK_AUTH_CD" ;
      lblTextblocktbw03_upload_datetime_Internalname = "TEXTBLOCKTBW03_UPLOAD_DATETIME" ;
      edtTBW03_UPLOAD_DATETIME_Internalname = "TBW03_UPLOAD_DATETIME" ;
      lblTextblocktbw03_upload_user_id_Internalname = "TEXTBLOCKTBW03_UPLOAD_USER_ID" ;
      edtTBW03_UPLOAD_USER_ID_Internalname = "TBW03_UPLOAD_USER_ID" ;
      lblTextblocktbw03_upload_user_nm_Internalname = "TEXTBLOCKTBW03_UPLOAD_USER_NM" ;
      edtTBW03_UPLOAD_USER_NM_Internalname = "TBW03_UPLOAD_USER_NM" ;
      lblTextblocktbw03_upload_auth_cd_Internalname = "TEXTBLOCKTBW03_UPLOAD_AUTH_CD" ;
      edtTBW03_UPLOAD_AUTH_CD_Internalname = "TBW03_UPLOAD_AUTH_CD" ;
      lblTextblocktbw03_dm_arrival_flg_Internalname = "TEXTBLOCKTBW03_DM_ARRIVAL_FLG" ;
      edtTBW03_DM_ARRIVAL_FLG_Internalname = "TBW03_DM_ARRIVAL_FLG" ;
      lblTextblocktbw03_dm_arrival_datetime_Internalname = "TEXTBLOCKTBW03_DM_ARRIVAL_DATETIME" ;
      edtTBW03_DM_ARRIVAL_DATETIME_Internalname = "TBW03_DM_ARRIVAL_DATETIME" ;
      lblTextblocktbw03_approval_flg_Internalname = "TEXTBLOCKTBW03_APPROVAL_FLG" ;
      edtTBW03_APPROVAL_FLG_Internalname = "TBW03_APPROVAL_FLG" ;
      lblTextblocktbw03_approval_datetime_Internalname = "TEXTBLOCKTBW03_APPROVAL_DATETIME" ;
      edtTBW03_APPROVAL_DATETIME_Internalname = "TBW03_APPROVAL_DATETIME" ;
      lblTextblocktbw03_approval_user_id_Internalname = "TEXTBLOCKTBW03_APPROVAL_USER_ID" ;
      edtTBW03_APPROVAL_USER_ID_Internalname = "TBW03_APPROVAL_USER_ID" ;
      lblTextblocktbw03_approval_user_nm_Internalname = "TEXTBLOCKTBW03_APPROVAL_USER_NM" ;
      edtTBW03_APPROVAL_USER_NM_Internalname = "TBW03_APPROVAL_USER_NM" ;
      lblTextblocktbw03_approval_auth_cd_Internalname = "TEXTBLOCKTBW03_APPROVAL_AUTH_CD" ;
      edtTBW03_APPROVAL_AUTH_CD_Internalname = "TBW03_APPROVAL_AUTH_CD" ;
      lblTextblocktbw03_input_end_flg_Internalname = "TEXTBLOCKTBW03_INPUT_END_FLG" ;
      edtTBW03_INPUT_END_FLG_Internalname = "TBW03_INPUT_END_FLG" ;
      lblTextblocktbw03_input_end_datetime_Internalname = "TEXTBLOCKTBW03_INPUT_END_DATETIME" ;
      edtTBW03_INPUT_END_DATETIME_Internalname = "TBW03_INPUT_END_DATETIME" ;
      lblTextblocktbw03_input_end_user_id_Internalname = "TEXTBLOCKTBW03_INPUT_END_USER_ID" ;
      edtTBW03_INPUT_END_USER_ID_Internalname = "TBW03_INPUT_END_USER_ID" ;
      lblTextblocktbw03_input_end_user_nm_Internalname = "TEXTBLOCKTBW03_INPUT_END_USER_NM" ;
      edtTBW03_INPUT_END_USER_NM_Internalname = "TBW03_INPUT_END_USER_NM" ;
      lblTextblocktbw03_input_end_auth_cd_Internalname = "TEXTBLOCKTBW03_INPUT_END_AUTH_CD" ;
      edtTBW03_INPUT_END_AUTH_CD_Internalname = "TBW03_INPUT_END_AUTH_CD" ;
      lblTextblocktbw03_del_flg_Internalname = "TEXTBLOCKTBW03_DEL_FLG" ;
      edtTBW03_DEL_FLG_Internalname = "TBW03_DEL_FLG" ;
      lblTextblocktbw03_crt_datetime_Internalname = "TEXTBLOCKTBW03_CRT_DATETIME" ;
      edtTBW03_CRT_DATETIME_Internalname = "TBW03_CRT_DATETIME" ;
      lblTextblocktbw03_crt_user_id_Internalname = "TEXTBLOCKTBW03_CRT_USER_ID" ;
      edtTBW03_CRT_USER_ID_Internalname = "TBW03_CRT_USER_ID" ;
      lblTextblocktbw03_crt_user_nm_Internalname = "TEXTBLOCKTBW03_CRT_USER_NM" ;
      edtTBW03_CRT_USER_NM_Internalname = "TBW03_CRT_USER_NM" ;
      lblTextblocktbw03_crt_prog_nm_Internalname = "TEXTBLOCKTBW03_CRT_PROG_NM" ;
      edtTBW03_CRT_PROG_NM_Internalname = "TBW03_CRT_PROG_NM" ;
      lblTextblocktbw03_upd_datetime_Internalname = "TEXTBLOCKTBW03_UPD_DATETIME" ;
      edtTBW03_UPD_DATETIME_Internalname = "TBW03_UPD_DATETIME" ;
      lblTextblocktbw03_upd_user_id_Internalname = "TEXTBLOCKTBW03_UPD_USER_ID" ;
      edtTBW03_UPD_USER_ID_Internalname = "TBW03_UPD_USER_ID" ;
      lblTextblocktbw03_upd_user_nm_Internalname = "TEXTBLOCKTBW03_UPD_USER_NM" ;
      edtTBW03_UPD_USER_NM_Internalname = "TBW03_UPD_USER_NM" ;
      lblTextblocktbw03_upd_prog_nm_Internalname = "TEXTBLOCKTBW03_UPD_PROG_NM" ;
      edtTBW03_UPD_PROG_NM_Internalname = "TBW03_UPD_PROG_NM" ;
      lblTextblocktbw03_upd_cnt_Internalname = "TEXTBLOCKTBW03_UPD_CNT" ;
      edtTBW03_UPD_CNT_Internalname = "TBW03_UPD_CNT" ;
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
      edtTBW03_UPD_CNT_Jsonclick = "" ;
      edtTBW03_UPD_CNT_Enabled = 1 ;
      edtTBW03_UPD_PROG_NM_Jsonclick = "" ;
      edtTBW03_UPD_PROG_NM_Enabled = 1 ;
      edtTBW03_UPD_USER_NM_Jsonclick = "" ;
      edtTBW03_UPD_USER_NM_Enabled = 0 ;
      edtTBW03_UPD_USER_ID_Jsonclick = "" ;
      edtTBW03_UPD_USER_ID_Enabled = 1 ;
      edtTBW03_UPD_DATETIME_Jsonclick = "" ;
      edtTBW03_UPD_DATETIME_Enabled = 1 ;
      edtTBW03_CRT_PROG_NM_Jsonclick = "" ;
      edtTBW03_CRT_PROG_NM_Enabled = 1 ;
      edtTBW03_CRT_USER_NM_Jsonclick = "" ;
      edtTBW03_CRT_USER_NM_Enabled = 0 ;
      edtTBW03_CRT_USER_ID_Jsonclick = "" ;
      edtTBW03_CRT_USER_ID_Enabled = 1 ;
      edtTBW03_CRT_DATETIME_Jsonclick = "" ;
      edtTBW03_CRT_DATETIME_Enabled = 1 ;
      edtTBW03_DEL_FLG_Jsonclick = "" ;
      edtTBW03_DEL_FLG_Enabled = 1 ;
      edtTBW03_INPUT_END_AUTH_CD_Jsonclick = "" ;
      edtTBW03_INPUT_END_AUTH_CD_Enabled = 1 ;
      edtTBW03_INPUT_END_USER_NM_Jsonclick = "" ;
      edtTBW03_INPUT_END_USER_NM_Enabled = 0 ;
      edtTBW03_INPUT_END_USER_ID_Jsonclick = "" ;
      edtTBW03_INPUT_END_USER_ID_Enabled = 1 ;
      edtTBW03_INPUT_END_DATETIME_Jsonclick = "" ;
      edtTBW03_INPUT_END_DATETIME_Enabled = 1 ;
      edtTBW03_INPUT_END_FLG_Jsonclick = "" ;
      edtTBW03_INPUT_END_FLG_Enabled = 1 ;
      edtTBW03_APPROVAL_AUTH_CD_Jsonclick = "" ;
      edtTBW03_APPROVAL_AUTH_CD_Enabled = 1 ;
      edtTBW03_APPROVAL_USER_NM_Jsonclick = "" ;
      edtTBW03_APPROVAL_USER_NM_Enabled = 0 ;
      edtTBW03_APPROVAL_USER_ID_Jsonclick = "" ;
      edtTBW03_APPROVAL_USER_ID_Enabled = 1 ;
      edtTBW03_APPROVAL_DATETIME_Jsonclick = "" ;
      edtTBW03_APPROVAL_DATETIME_Enabled = 1 ;
      edtTBW03_APPROVAL_FLG_Jsonclick = "" ;
      edtTBW03_APPROVAL_FLG_Enabled = 1 ;
      edtTBW03_DM_ARRIVAL_DATETIME_Jsonclick = "" ;
      edtTBW03_DM_ARRIVAL_DATETIME_Enabled = 1 ;
      edtTBW03_DM_ARRIVAL_FLG_Jsonclick = "" ;
      edtTBW03_DM_ARRIVAL_FLG_Enabled = 1 ;
      edtTBW03_UPLOAD_AUTH_CD_Jsonclick = "" ;
      edtTBW03_UPLOAD_AUTH_CD_Enabled = 1 ;
      edtTBW03_UPLOAD_USER_NM_Jsonclick = "" ;
      edtTBW03_UPLOAD_USER_NM_Enabled = 0 ;
      edtTBW03_UPLOAD_USER_ID_Jsonclick = "" ;
      edtTBW03_UPLOAD_USER_ID_Enabled = 1 ;
      edtTBW03_UPLOAD_DATETIME_Jsonclick = "" ;
      edtTBW03_UPLOAD_DATETIME_Enabled = 1 ;
      edtTBW03_LOCK_AUTH_CD_Jsonclick = "" ;
      edtTBW03_LOCK_AUTH_CD_Enabled = 1 ;
      edtTBW03_LOCK_USER_NM_Jsonclick = "" ;
      edtTBW03_LOCK_USER_NM_Enabled = 0 ;
      edtTBW03_LOCK_USER_ID_Jsonclick = "" ;
      edtTBW03_LOCK_USER_ID_Enabled = 1 ;
      edtTBW03_LOCK_DATETIME_Jsonclick = "" ;
      edtTBW03_LOCK_DATETIME_Enabled = 1 ;
      edtTBW03_LOCK_FLG_Jsonclick = "" ;
      edtTBW03_LOCK_FLG_Enabled = 1 ;
      edtTBW03_CRF_INPUT_LEVEL_Jsonclick = "" ;
      edtTBW03_CRF_INPUT_LEVEL_Enabled = 1 ;
      edtTBW03_CRF_LATEST_VERSION_Jsonclick = "" ;
      edtTBW03_CRF_LATEST_VERSION_Enabled = 1 ;
      edtTBW03_OUTER_SUBJECT_ID_Jsonclick = "" ;
      edtTBW03_OUTER_SUBJECT_ID_Enabled = 1 ;
      edtTBW03_SITE_RYAK_NM_Jsonclick = "" ;
      edtTBW03_SITE_RYAK_NM_Enabled = 0 ;
      edtTBW03_SITE_NM_Jsonclick = "" ;
      edtTBW03_SITE_NM_Enabled = 0 ;
      edtTBW03_SITE_ID_Jsonclick = "" ;
      edtTBW03_SITE_ID_Enabled = 1 ;
      edtTBW03_CRF_ORDER_Jsonclick = "" ;
      edtTBW03_CRF_ORDER_Enabled = 0 ;
      edtTBW03_CRF_SNM_Jsonclick = "" ;
      edtTBW03_CRF_SNM_Enabled = 0 ;
      edtTBW03_CRF_NM_Jsonclick = "" ;
      edtTBW03_CRF_NM_Enabled = 0 ;
      edtTBW03_CRF_ID_Jsonclick = "" ;
      edtTBW03_CRF_ID_Enabled = 1 ;
      edtTBW03_SUBJECT_ID_Jsonclick = "" ;
      edtTBW03_SUBJECT_ID_Enabled = 1 ;
      edtTBW03_STUDY_ID_Jsonclick = "" ;
      edtTBW03_STUDY_ID_Enabled = 1 ;
      edtTBW03_DISP_DATETIME_Jsonclick = "" ;
      edtTBW03_DISP_DATETIME_Enabled = 1 ;
      edtTBW03_APP_ID_Jsonclick = "" ;
      edtTBW03_APP_ID_Enabled = 1 ;
      edtTBW03_SESSION_ID_Jsonclick = "" ;
      edtTBW03_SESSION_ID_Enabled = 1 ;
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
      /* Using cursor T001619 */
      pr_default.execute(17, new Object[] {new Long(A113TBW03_STUDY_ID), new Short(A115TBW03_CRF_ID)});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem("'CRF検索ワーク・CRFサブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBW03_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBW03_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A710TBW03_CRF_NM = T001619_A710TBW03_CRF_NM[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A710TBW03_CRF_NM", A710TBW03_CRF_NM);
      n710TBW03_CRF_NM = T001619_n710TBW03_CRF_NM[0] ;
      A711TBW03_CRF_SNM = T001619_A711TBW03_CRF_SNM[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A711TBW03_CRF_SNM", A711TBW03_CRF_SNM);
      n711TBW03_CRF_SNM = T001619_n711TBW03_CRF_SNM[0] ;
      A712TBW03_CRF_ORDER = T001619_A712TBW03_CRF_ORDER[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A712TBW03_CRF_ORDER", GXutil.ltrim( GXutil.str( A712TBW03_CRF_ORDER, 5, 0)));
      n712TBW03_CRF_ORDER = T001619_n712TBW03_CRF_ORDER[0] ;
      pr_default.close(17);
      GX_FocusControl = edtTBW03_SITE_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Tbw03_crf_id( String GX_Parm1 ,
                                   String GX_Parm2 ,
                                   String GX_Parm3 ,
                                   long GX_Parm4 ,
                                   int GX_Parm5 ,
                                   short GX_Parm6 ,
                                   String GX_Parm7 ,
                                   short GX_Parm8 ,
                                   byte GX_Parm9 ,
                                   String GX_Parm10 ,
                                   java.util.Date GX_Parm11 ,
                                   String GX_Parm12 ,
                                   java.util.Date GX_Parm13 ,
                                   String GX_Parm14 ,
                                   String GX_Parm15 ,
                                   java.util.Date GX_Parm16 ,
                                   String GX_Parm17 ,
                                   java.util.Date GX_Parm18 ,
                                   String GX_Parm19 ,
                                   String GX_Parm20 ,
                                   java.util.Date GX_Parm21 ,
                                   String GX_Parm22 ,
                                   String GX_Parm23 ,
                                   java.util.Date GX_Parm24 ,
                                   String GX_Parm25 ,
                                   java.util.Date GX_Parm26 ,
                                   String GX_Parm27 ,
                                   long GX_Parm28 ,
                                   String GX_Parm29 ,
                                   String GX_Parm30 ,
                                   String GX_Parm31 ,
                                   String GX_Parm32 ,
                                   String GX_Parm33 ,
                                   String GX_Parm34 ,
                                   String GX_Parm35 ,
                                   String GX_Parm36 ,
                                   String GX_Parm37 ,
                                   int GX_Parm38 )
   {
      A110TBW03_SESSION_ID = GX_Parm1 ;
      A111TBW03_APP_ID = GX_Parm2 ;
      A112TBW03_DISP_DATETIME = GX_Parm3 ;
      A113TBW03_STUDY_ID = GX_Parm4 ;
      A114TBW03_SUBJECT_ID = GX_Parm5 ;
      A115TBW03_CRF_ID = GX_Parm6 ;
      A715TBW03_OUTER_SUBJECT_ID = GX_Parm7 ;
      n715TBW03_OUTER_SUBJECT_ID = false ;
      A716TBW03_CRF_LATEST_VERSION = GX_Parm8 ;
      n716TBW03_CRF_LATEST_VERSION = false ;
      A717TBW03_CRF_INPUT_LEVEL = GX_Parm9 ;
      n717TBW03_CRF_INPUT_LEVEL = false ;
      A718TBW03_LOCK_FLG = GX_Parm10 ;
      n718TBW03_LOCK_FLG = false ;
      A719TBW03_LOCK_DATETIME = GX_Parm11 ;
      n719TBW03_LOCK_DATETIME = false ;
      A721TBW03_LOCK_AUTH_CD = GX_Parm12 ;
      n721TBW03_LOCK_AUTH_CD = false ;
      A722TBW03_UPLOAD_DATETIME = GX_Parm13 ;
      n722TBW03_UPLOAD_DATETIME = false ;
      A724TBW03_UPLOAD_AUTH_CD = GX_Parm14 ;
      n724TBW03_UPLOAD_AUTH_CD = false ;
      A725TBW03_DM_ARRIVAL_FLG = GX_Parm15 ;
      n725TBW03_DM_ARRIVAL_FLG = false ;
      A726TBW03_DM_ARRIVAL_DATETIME = GX_Parm16 ;
      n726TBW03_DM_ARRIVAL_DATETIME = false ;
      A727TBW03_APPROVAL_FLG = GX_Parm17 ;
      n727TBW03_APPROVAL_FLG = false ;
      A728TBW03_APPROVAL_DATETIME = GX_Parm18 ;
      n728TBW03_APPROVAL_DATETIME = false ;
      A730TBW03_APPROVAL_AUTH_CD = GX_Parm19 ;
      n730TBW03_APPROVAL_AUTH_CD = false ;
      A731TBW03_INPUT_END_FLG = GX_Parm20 ;
      n731TBW03_INPUT_END_FLG = false ;
      A732TBW03_INPUT_END_DATETIME = GX_Parm21 ;
      n732TBW03_INPUT_END_DATETIME = false ;
      A734TBW03_INPUT_END_AUTH_CD = GX_Parm22 ;
      n734TBW03_INPUT_END_AUTH_CD = false ;
      A780TBW03_DEL_FLG = GX_Parm23 ;
      n780TBW03_DEL_FLG = false ;
      A781TBW03_CRT_DATETIME = GX_Parm24 ;
      n781TBW03_CRT_DATETIME = false ;
      A783TBW03_CRT_PROG_NM = GX_Parm25 ;
      n783TBW03_CRT_PROG_NM = false ;
      A784TBW03_UPD_DATETIME = GX_Parm26 ;
      n784TBW03_UPD_DATETIME = false ;
      A786TBW03_UPD_PROG_NM = GX_Parm27 ;
      n786TBW03_UPD_PROG_NM = false ;
      A787TBW03_UPD_CNT = GX_Parm28 ;
      n787TBW03_UPD_CNT = false ;
      A120TBW03_SITE_ID = GX_Parm29 ;
      n120TBW03_SITE_ID = false ;
      A116TBW03_LOCK_USER_ID = GX_Parm30 ;
      n116TBW03_LOCK_USER_ID = false ;
      A117TBW03_UPLOAD_USER_ID = GX_Parm31 ;
      n117TBW03_UPLOAD_USER_ID = false ;
      A118TBW03_APPROVAL_USER_ID = GX_Parm32 ;
      n118TBW03_APPROVAL_USER_ID = false ;
      A119TBW03_INPUT_END_USER_ID = GX_Parm33 ;
      n119TBW03_INPUT_END_USER_ID = false ;
      A121TBW03_CRT_USER_ID = GX_Parm34 ;
      n121TBW03_CRT_USER_ID = false ;
      A122TBW03_UPD_USER_ID = GX_Parm35 ;
      n122TBW03_UPD_USER_ID = false ;
      A710TBW03_CRF_NM = GX_Parm36 ;
      n710TBW03_CRF_NM = false ;
      A711TBW03_CRF_SNM = GX_Parm37 ;
      n711TBW03_CRF_SNM = false ;
      A712TBW03_CRF_ORDER = GX_Parm38 ;
      n712TBW03_CRF_ORDER = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      /* Using cursor T001619 */
      pr_default.execute(17, new Object[] {new Long(A113TBW03_STUDY_ID), new Short(A115TBW03_CRF_ID)});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem("'CRF検索ワーク・CRFサブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBW03_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBW03_STUDY_ID_Internalname ;
      }
      A710TBW03_CRF_NM = T001619_A710TBW03_CRF_NM[0] ;
      n710TBW03_CRF_NM = T001619_n710TBW03_CRF_NM[0] ;
      A711TBW03_CRF_SNM = T001619_A711TBW03_CRF_SNM[0] ;
      n711TBW03_CRF_SNM = T001619_n711TBW03_CRF_SNM[0] ;
      A712TBW03_CRF_ORDER = T001619_A712TBW03_CRF_ORDER[0] ;
      n712TBW03_CRF_ORDER = T001619_n712TBW03_CRF_ORDER[0] ;
      pr_default.close(17);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A710TBW03_CRF_NM = "" ;
         n710TBW03_CRF_NM = false ;
         A711TBW03_CRF_SNM = "" ;
         n711TBW03_CRF_SNM = false ;
         A712TBW03_CRF_ORDER = 0 ;
         n712TBW03_CRF_ORDER = false ;
         A713TBW03_SITE_NM = "" ;
         n713TBW03_SITE_NM = false ;
         A714TBW03_SITE_RYAK_NM = "" ;
         n714TBW03_SITE_RYAK_NM = false ;
         A720TBW03_LOCK_USER_NM = "" ;
         n720TBW03_LOCK_USER_NM = false ;
         A723TBW03_UPLOAD_USER_NM = "" ;
         n723TBW03_UPLOAD_USER_NM = false ;
         A729TBW03_APPROVAL_USER_NM = "" ;
         n729TBW03_APPROVAL_USER_NM = false ;
         A733TBW03_INPUT_END_USER_NM = "" ;
         n733TBW03_INPUT_END_USER_NM = false ;
         A782TBW03_CRT_USER_NM = "" ;
         n782TBW03_CRT_USER_NM = false ;
         A785TBW03_UPD_USER_NM = "" ;
         n785TBW03_UPD_USER_NM = false ;
      }
      isValidOutput.add(GXutil.rtrim( A120TBW03_SITE_ID));
      isValidOutput.add(GXutil.rtrim( A715TBW03_OUTER_SUBJECT_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A716TBW03_CRF_LATEST_VERSION, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A717TBW03_CRF_INPUT_LEVEL, (byte)(2), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A718TBW03_LOCK_FLG));
      isValidOutput.add(localUtil.format(A719TBW03_LOCK_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A116TBW03_LOCK_USER_ID));
      isValidOutput.add(GXutil.rtrim( A721TBW03_LOCK_AUTH_CD));
      isValidOutput.add(localUtil.format(A722TBW03_UPLOAD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A117TBW03_UPLOAD_USER_ID));
      isValidOutput.add(GXutil.rtrim( A724TBW03_UPLOAD_AUTH_CD));
      isValidOutput.add(GXutil.rtrim( A725TBW03_DM_ARRIVAL_FLG));
      isValidOutput.add(localUtil.format(A726TBW03_DM_ARRIVAL_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A727TBW03_APPROVAL_FLG));
      isValidOutput.add(localUtil.format(A728TBW03_APPROVAL_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A118TBW03_APPROVAL_USER_ID));
      isValidOutput.add(GXutil.rtrim( A730TBW03_APPROVAL_AUTH_CD));
      isValidOutput.add(GXutil.rtrim( A731TBW03_INPUT_END_FLG));
      isValidOutput.add(localUtil.format(A732TBW03_INPUT_END_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A119TBW03_INPUT_END_USER_ID));
      isValidOutput.add(GXutil.rtrim( A734TBW03_INPUT_END_AUTH_CD));
      isValidOutput.add(GXutil.rtrim( A780TBW03_DEL_FLG));
      isValidOutput.add(localUtil.format(A781TBW03_CRT_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A121TBW03_CRT_USER_ID));
      isValidOutput.add(GXutil.rtrim( A783TBW03_CRT_PROG_NM));
      isValidOutput.add(localUtil.format(A784TBW03_UPD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A122TBW03_UPD_USER_ID));
      isValidOutput.add(GXutil.rtrim( A786TBW03_UPD_PROG_NM));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A787TBW03_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( AV8Pgmname));
      isValidOutput.add(GXutil.rtrim( A710TBW03_CRF_NM));
      isValidOutput.add(GXutil.rtrim( A711TBW03_CRF_SNM));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A712TBW03_CRF_ORDER, (byte)(5), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A713TBW03_SITE_NM));
      isValidOutput.add(GXutil.rtrim( A714TBW03_SITE_RYAK_NM));
      isValidOutput.add(GXutil.rtrim( A720TBW03_LOCK_USER_NM));
      isValidOutput.add(GXutil.rtrim( A723TBW03_UPLOAD_USER_NM));
      isValidOutput.add(GXutil.rtrim( A729TBW03_APPROVAL_USER_NM));
      isValidOutput.add(GXutil.rtrim( A733TBW03_INPUT_END_USER_NM));
      isValidOutput.add(GXutil.rtrim( A782TBW03_CRT_USER_NM));
      isValidOutput.add(GXutil.rtrim( A785TBW03_UPD_USER_NM));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.rtrim( Z110TBW03_SESSION_ID));
      isValidOutput.add(GXutil.rtrim( Z111TBW03_APP_ID));
      isValidOutput.add(GXutil.rtrim( Z112TBW03_DISP_DATETIME));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z113TBW03_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z114TBW03_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z115TBW03_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z120TBW03_SITE_ID));
      isValidOutput.add(GXutil.rtrim( Z715TBW03_OUTER_SUBJECT_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z716TBW03_CRF_LATEST_VERSION, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z717TBW03_CRF_INPUT_LEVEL, (byte)(2), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z718TBW03_LOCK_FLG));
      isValidOutput.add(localUtil.ttoc( Z719TBW03_LOCK_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z116TBW03_LOCK_USER_ID));
      isValidOutput.add(GXutil.rtrim( Z721TBW03_LOCK_AUTH_CD));
      isValidOutput.add(localUtil.ttoc( Z722TBW03_UPLOAD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z117TBW03_UPLOAD_USER_ID));
      isValidOutput.add(GXutil.rtrim( Z724TBW03_UPLOAD_AUTH_CD));
      isValidOutput.add(GXutil.rtrim( Z725TBW03_DM_ARRIVAL_FLG));
      isValidOutput.add(localUtil.ttoc( Z726TBW03_DM_ARRIVAL_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z727TBW03_APPROVAL_FLG));
      isValidOutput.add(localUtil.ttoc( Z728TBW03_APPROVAL_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z118TBW03_APPROVAL_USER_ID));
      isValidOutput.add(GXutil.rtrim( Z730TBW03_APPROVAL_AUTH_CD));
      isValidOutput.add(GXutil.rtrim( Z731TBW03_INPUT_END_FLG));
      isValidOutput.add(localUtil.ttoc( Z732TBW03_INPUT_END_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z119TBW03_INPUT_END_USER_ID));
      isValidOutput.add(GXutil.rtrim( Z734TBW03_INPUT_END_AUTH_CD));
      isValidOutput.add(GXutil.rtrim( Z780TBW03_DEL_FLG));
      isValidOutput.add(localUtil.ttoc( Z781TBW03_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z121TBW03_CRT_USER_ID));
      isValidOutput.add(GXutil.rtrim( Z783TBW03_CRT_PROG_NM));
      isValidOutput.add(localUtil.ttoc( Z784TBW03_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z122TBW03_UPD_USER_ID));
      isValidOutput.add(GXutil.rtrim( Z786TBW03_UPD_PROG_NM));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z787TBW03_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( ZV8Pgmname));
      isValidOutput.add(GXutil.rtrim( Z710TBW03_CRF_NM));
      isValidOutput.add(GXutil.rtrim( Z711TBW03_CRF_SNM));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z712TBW03_CRF_ORDER, (byte)(5), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z713TBW03_SITE_NM));
      isValidOutput.add(GXutil.rtrim( Z714TBW03_SITE_RYAK_NM));
      isValidOutput.add(GXutil.rtrim( Z720TBW03_LOCK_USER_NM));
      isValidOutput.add(GXutil.rtrim( Z723TBW03_UPLOAD_USER_NM));
      isValidOutput.add(GXutil.rtrim( Z729TBW03_APPROVAL_USER_NM));
      isValidOutput.add(GXutil.rtrim( Z733TBW03_INPUT_END_USER_NM));
      isValidOutput.add(GXutil.rtrim( Z782TBW03_CRT_USER_NM));
      isValidOutput.add(GXutil.rtrim( Z785TBW03_UPD_USER_NM));
      isValidOutput.add(imgBtn_delete2_Enabled);
      isValidOutput.add(imgBtn_enter2_Enabled);
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Tbw03_site_id( String GX_Parm1 ,
                                    String GX_Parm2 ,
                                    String GX_Parm3 )
   {
      A120TBW03_SITE_ID = GX_Parm1 ;
      n120TBW03_SITE_ID = false ;
      A713TBW03_SITE_NM = GX_Parm2 ;
      n713TBW03_SITE_NM = false ;
      A714TBW03_SITE_RYAK_NM = GX_Parm3 ;
      n714TBW03_SITE_RYAK_NM = false ;
      /* Using cursor T001620 */
      pr_default.execute(18, new Object[] {new Boolean(n120TBW03_SITE_ID), A120TBW03_SITE_ID});
      if ( (pr_default.getStatus(18) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A120TBW03_SITE_ID)==0) ) )
         {
            httpContext.GX_msglist.addItem("'CRF検索ワーク・施設サブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBW03_SITE_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBW03_SITE_ID_Internalname ;
         }
      }
      A713TBW03_SITE_NM = T001620_A713TBW03_SITE_NM[0] ;
      n713TBW03_SITE_NM = T001620_n713TBW03_SITE_NM[0] ;
      A714TBW03_SITE_RYAK_NM = T001620_A714TBW03_SITE_RYAK_NM[0] ;
      n714TBW03_SITE_RYAK_NM = T001620_n714TBW03_SITE_RYAK_NM[0] ;
      pr_default.close(18);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A713TBW03_SITE_NM = "" ;
         n713TBW03_SITE_NM = false ;
         A714TBW03_SITE_RYAK_NM = "" ;
         n714TBW03_SITE_RYAK_NM = false ;
      }
      isValidOutput.add(GXutil.rtrim( A713TBW03_SITE_NM));
      isValidOutput.add(GXutil.rtrim( A714TBW03_SITE_RYAK_NM));
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Tbw03_lock_user_id( String GX_Parm1 ,
                                         String GX_Parm2 )
   {
      A116TBW03_LOCK_USER_ID = GX_Parm1 ;
      n116TBW03_LOCK_USER_ID = false ;
      A720TBW03_LOCK_USER_NM = GX_Parm2 ;
      n720TBW03_LOCK_USER_NM = false ;
      /* Using cursor T001621 */
      pr_default.execute(19, new Object[] {new Boolean(n116TBW03_LOCK_USER_ID), A116TBW03_LOCK_USER_ID});
      if ( (pr_default.getStatus(19) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A116TBW03_LOCK_USER_ID)==0) ) )
         {
            httpContext.GX_msglist.addItem("'CRF検索ワーク・ロックユーザーサブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBW03_LOCK_USER_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBW03_LOCK_USER_ID_Internalname ;
         }
      }
      A720TBW03_LOCK_USER_NM = T001621_A720TBW03_LOCK_USER_NM[0] ;
      n720TBW03_LOCK_USER_NM = T001621_n720TBW03_LOCK_USER_NM[0] ;
      pr_default.close(19);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A720TBW03_LOCK_USER_NM = "" ;
         n720TBW03_LOCK_USER_NM = false ;
      }
      isValidOutput.add(GXutil.rtrim( A720TBW03_LOCK_USER_NM));
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Tbw03_upload_user_id( String GX_Parm1 ,
                                           String GX_Parm2 )
   {
      A117TBW03_UPLOAD_USER_ID = GX_Parm1 ;
      n117TBW03_UPLOAD_USER_ID = false ;
      A723TBW03_UPLOAD_USER_NM = GX_Parm2 ;
      n723TBW03_UPLOAD_USER_NM = false ;
      /* Using cursor T001622 */
      pr_default.execute(20, new Object[] {new Boolean(n117TBW03_UPLOAD_USER_ID), A117TBW03_UPLOAD_USER_ID});
      if ( (pr_default.getStatus(20) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A117TBW03_UPLOAD_USER_ID)==0) ) )
         {
            httpContext.GX_msglist.addItem("'CRF検索ワーク・アップロードユーザーサブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBW03_UPLOAD_USER_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBW03_UPLOAD_USER_ID_Internalname ;
         }
      }
      A723TBW03_UPLOAD_USER_NM = T001622_A723TBW03_UPLOAD_USER_NM[0] ;
      n723TBW03_UPLOAD_USER_NM = T001622_n723TBW03_UPLOAD_USER_NM[0] ;
      pr_default.close(20);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A723TBW03_UPLOAD_USER_NM = "" ;
         n723TBW03_UPLOAD_USER_NM = false ;
      }
      isValidOutput.add(GXutil.rtrim( A723TBW03_UPLOAD_USER_NM));
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Tbw03_approval_user_id( String GX_Parm1 ,
                                             String GX_Parm2 )
   {
      A118TBW03_APPROVAL_USER_ID = GX_Parm1 ;
      n118TBW03_APPROVAL_USER_ID = false ;
      A729TBW03_APPROVAL_USER_NM = GX_Parm2 ;
      n729TBW03_APPROVAL_USER_NM = false ;
      /* Using cursor T001623 */
      pr_default.execute(21, new Object[] {new Boolean(n118TBW03_APPROVAL_USER_ID), A118TBW03_APPROVAL_USER_ID});
      if ( (pr_default.getStatus(21) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A118TBW03_APPROVAL_USER_ID)==0) ) )
         {
            httpContext.GX_msglist.addItem("'CRF検索ワーク・承認ユーザーサブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBW03_APPROVAL_USER_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBW03_APPROVAL_USER_ID_Internalname ;
         }
      }
      A729TBW03_APPROVAL_USER_NM = T001623_A729TBW03_APPROVAL_USER_NM[0] ;
      n729TBW03_APPROVAL_USER_NM = T001623_n729TBW03_APPROVAL_USER_NM[0] ;
      pr_default.close(21);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A729TBW03_APPROVAL_USER_NM = "" ;
         n729TBW03_APPROVAL_USER_NM = false ;
      }
      isValidOutput.add(GXutil.rtrim( A729TBW03_APPROVAL_USER_NM));
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Tbw03_input_end_user_id( String GX_Parm1 ,
                                              String GX_Parm2 )
   {
      A119TBW03_INPUT_END_USER_ID = GX_Parm1 ;
      n119TBW03_INPUT_END_USER_ID = false ;
      A733TBW03_INPUT_END_USER_NM = GX_Parm2 ;
      n733TBW03_INPUT_END_USER_NM = false ;
      /* Using cursor T001624 */
      pr_default.execute(22, new Object[] {new Boolean(n119TBW03_INPUT_END_USER_ID), A119TBW03_INPUT_END_USER_ID});
      if ( (pr_default.getStatus(22) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A119TBW03_INPUT_END_USER_ID)==0) ) )
         {
            httpContext.GX_msglist.addItem("'CRF検索ワーク・データ固定ユーザーサブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBW03_INPUT_END_USER_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBW03_INPUT_END_USER_ID_Internalname ;
         }
      }
      A733TBW03_INPUT_END_USER_NM = T001624_A733TBW03_INPUT_END_USER_NM[0] ;
      n733TBW03_INPUT_END_USER_NM = T001624_n733TBW03_INPUT_END_USER_NM[0] ;
      pr_default.close(22);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A733TBW03_INPUT_END_USER_NM = "" ;
         n733TBW03_INPUT_END_USER_NM = false ;
      }
      isValidOutput.add(GXutil.rtrim( A733TBW03_INPUT_END_USER_NM));
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Tbw03_crt_user_id( String GX_Parm1 ,
                                        String GX_Parm2 )
   {
      A121TBW03_CRT_USER_ID = GX_Parm1 ;
      n121TBW03_CRT_USER_ID = false ;
      A782TBW03_CRT_USER_NM = GX_Parm2 ;
      n782TBW03_CRT_USER_NM = false ;
      /* Using cursor T001625 */
      pr_default.execute(23, new Object[] {new Boolean(n121TBW03_CRT_USER_ID), A121TBW03_CRT_USER_ID});
      if ( (pr_default.getStatus(23) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A121TBW03_CRT_USER_ID)==0) ) )
         {
            httpContext.GX_msglist.addItem("'CRF検索ワーク・作成ユーザーサブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBW03_CRT_USER_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBW03_CRT_USER_ID_Internalname ;
         }
      }
      A782TBW03_CRT_USER_NM = T001625_A782TBW03_CRT_USER_NM[0] ;
      n782TBW03_CRT_USER_NM = T001625_n782TBW03_CRT_USER_NM[0] ;
      pr_default.close(23);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A782TBW03_CRT_USER_NM = "" ;
         n782TBW03_CRT_USER_NM = false ;
      }
      isValidOutput.add(GXutil.rtrim( A782TBW03_CRT_USER_NM));
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Tbw03_upd_user_id( String GX_Parm1 ,
                                        String GX_Parm2 )
   {
      A122TBW03_UPD_USER_ID = GX_Parm1 ;
      n122TBW03_UPD_USER_ID = false ;
      A785TBW03_UPD_USER_NM = GX_Parm2 ;
      n785TBW03_UPD_USER_NM = false ;
      /* Using cursor T001626 */
      pr_default.execute(24, new Object[] {new Boolean(n122TBW03_UPD_USER_ID), A122TBW03_UPD_USER_ID});
      if ( (pr_default.getStatus(24) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A122TBW03_UPD_USER_ID)==0) ) )
         {
            httpContext.GX_msglist.addItem("'CRF検索ワーク・更新ユーザーサブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBW03_UPD_USER_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBW03_UPD_USER_ID_Internalname ;
         }
      }
      A785TBW03_UPD_USER_NM = T001626_A785TBW03_UPD_USER_NM[0] ;
      n785TBW03_UPD_USER_NM = T001626_n785TBW03_UPD_USER_NM[0] ;
      pr_default.close(24);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A785TBW03_UPD_USER_NM = "" ;
         n785TBW03_UPD_USER_NM = false ;
      }
      isValidOutput.add(GXutil.rtrim( A785TBW03_UPD_USER_NM));
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
      pr_default.close(17);
      pr_default.close(18);
      pr_default.close(19);
      pr_default.close(20);
      pr_default.close(21);
      pr_default.close(22);
      pr_default.close(23);
      pr_default.close(24);
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
      Z110TBW03_SESSION_ID = "" ;
      Z111TBW03_APP_ID = "" ;
      Z112TBW03_DISP_DATETIME = "" ;
      Z715TBW03_OUTER_SUBJECT_ID = "" ;
      Z718TBW03_LOCK_FLG = "" ;
      Z719TBW03_LOCK_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z721TBW03_LOCK_AUTH_CD = "" ;
      Z722TBW03_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z724TBW03_UPLOAD_AUTH_CD = "" ;
      Z725TBW03_DM_ARRIVAL_FLG = "" ;
      Z726TBW03_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z727TBW03_APPROVAL_FLG = "" ;
      Z728TBW03_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z730TBW03_APPROVAL_AUTH_CD = "" ;
      Z731TBW03_INPUT_END_FLG = "" ;
      Z732TBW03_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z734TBW03_INPUT_END_AUTH_CD = "" ;
      Z780TBW03_DEL_FLG = "" ;
      Z781TBW03_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z783TBW03_CRT_PROG_NM = "" ;
      Z784TBW03_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z786TBW03_UPD_PROG_NM = "" ;
      Z120TBW03_SITE_ID = "" ;
      Z116TBW03_LOCK_USER_ID = "" ;
      Z117TBW03_UPLOAD_USER_ID = "" ;
      Z118TBW03_APPROVAL_USER_ID = "" ;
      Z119TBW03_INPUT_END_USER_ID = "" ;
      Z121TBW03_CRT_USER_ID = "" ;
      Z122TBW03_UPD_USER_ID = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A120TBW03_SITE_ID = "" ;
      A116TBW03_LOCK_USER_ID = "" ;
      A117TBW03_UPLOAD_USER_ID = "" ;
      A118TBW03_APPROVAL_USER_ID = "" ;
      A119TBW03_INPUT_END_USER_ID = "" ;
      A121TBW03_CRT_USER_ID = "" ;
      A122TBW03_UPD_USER_ID = "" ;
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
      lblTextblocktbw03_session_id_Jsonclick = "" ;
      A110TBW03_SESSION_ID = "" ;
      lblTextblocktbw03_app_id_Jsonclick = "" ;
      A111TBW03_APP_ID = "" ;
      lblTextblocktbw03_disp_datetime_Jsonclick = "" ;
      A112TBW03_DISP_DATETIME = "" ;
      lblTextblocktbw03_study_id_Jsonclick = "" ;
      lblTextblocktbw03_subject_id_Jsonclick = "" ;
      lblTextblocktbw03_crf_id_Jsonclick = "" ;
      lblTextblocktbw03_crf_nm_Jsonclick = "" ;
      A710TBW03_CRF_NM = "" ;
      lblTextblocktbw03_crf_snm_Jsonclick = "" ;
      A711TBW03_CRF_SNM = "" ;
      lblTextblocktbw03_crf_order_Jsonclick = "" ;
      lblTextblocktbw03_site_id_Jsonclick = "" ;
      lblTextblocktbw03_site_nm_Jsonclick = "" ;
      A713TBW03_SITE_NM = "" ;
      lblTextblocktbw03_site_ryak_nm_Jsonclick = "" ;
      A714TBW03_SITE_RYAK_NM = "" ;
      lblTextblocktbw03_outer_subject_id_Jsonclick = "" ;
      A715TBW03_OUTER_SUBJECT_ID = "" ;
      lblTextblocktbw03_crf_latest_version_Jsonclick = "" ;
      lblTextblocktbw03_crf_input_level_Jsonclick = "" ;
      lblTextblocktbw03_lock_flg_Jsonclick = "" ;
      A718TBW03_LOCK_FLG = "" ;
      lblTextblocktbw03_lock_datetime_Jsonclick = "" ;
      A719TBW03_LOCK_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbw03_lock_user_id_Jsonclick = "" ;
      lblTextblocktbw03_lock_user_nm_Jsonclick = "" ;
      A720TBW03_LOCK_USER_NM = "" ;
      lblTextblocktbw03_lock_auth_cd_Jsonclick = "" ;
      A721TBW03_LOCK_AUTH_CD = "" ;
      lblTextblocktbw03_upload_datetime_Jsonclick = "" ;
      A722TBW03_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbw03_upload_user_id_Jsonclick = "" ;
      lblTextblocktbw03_upload_user_nm_Jsonclick = "" ;
      A723TBW03_UPLOAD_USER_NM = "" ;
      lblTextblocktbw03_upload_auth_cd_Jsonclick = "" ;
      A724TBW03_UPLOAD_AUTH_CD = "" ;
      lblTextblocktbw03_dm_arrival_flg_Jsonclick = "" ;
      A725TBW03_DM_ARRIVAL_FLG = "" ;
      lblTextblocktbw03_dm_arrival_datetime_Jsonclick = "" ;
      A726TBW03_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbw03_approval_flg_Jsonclick = "" ;
      A727TBW03_APPROVAL_FLG = "" ;
      lblTextblocktbw03_approval_datetime_Jsonclick = "" ;
      A728TBW03_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbw03_approval_user_id_Jsonclick = "" ;
      lblTextblocktbw03_approval_user_nm_Jsonclick = "" ;
      A729TBW03_APPROVAL_USER_NM = "" ;
      lblTextblocktbw03_approval_auth_cd_Jsonclick = "" ;
      A730TBW03_APPROVAL_AUTH_CD = "" ;
      lblTextblocktbw03_input_end_flg_Jsonclick = "" ;
      A731TBW03_INPUT_END_FLG = "" ;
      lblTextblocktbw03_input_end_datetime_Jsonclick = "" ;
      A732TBW03_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbw03_input_end_user_id_Jsonclick = "" ;
      lblTextblocktbw03_input_end_user_nm_Jsonclick = "" ;
      A733TBW03_INPUT_END_USER_NM = "" ;
      lblTextblocktbw03_input_end_auth_cd_Jsonclick = "" ;
      A734TBW03_INPUT_END_AUTH_CD = "" ;
      lblTextblocktbw03_del_flg_Jsonclick = "" ;
      A780TBW03_DEL_FLG = "" ;
      lblTextblocktbw03_crt_datetime_Jsonclick = "" ;
      A781TBW03_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbw03_crt_user_id_Jsonclick = "" ;
      lblTextblocktbw03_crt_user_nm_Jsonclick = "" ;
      A782TBW03_CRT_USER_NM = "" ;
      lblTextblocktbw03_crt_prog_nm_Jsonclick = "" ;
      A783TBW03_CRT_PROG_NM = "" ;
      lblTextblocktbw03_upd_datetime_Jsonclick = "" ;
      A784TBW03_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbw03_upd_user_id_Jsonclick = "" ;
      lblTextblocktbw03_upd_user_nm_Jsonclick = "" ;
      A785TBW03_UPD_USER_NM = "" ;
      lblTextblocktbw03_upd_prog_nm_Jsonclick = "" ;
      A786TBW03_UPD_PROG_NM = "" ;
      lblTextblocktbw03_upd_cnt_Jsonclick = "" ;
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
      AV8Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV7W_BC_FLG = "" ;
      GXEncryptionTmp = "" ;
      Z710TBW03_CRF_NM = "" ;
      Z711TBW03_CRF_SNM = "" ;
      Z713TBW03_SITE_NM = "" ;
      Z714TBW03_SITE_RYAK_NM = "" ;
      Z720TBW03_LOCK_USER_NM = "" ;
      Z723TBW03_UPLOAD_USER_NM = "" ;
      Z729TBW03_APPROVAL_USER_NM = "" ;
      Z733TBW03_INPUT_END_USER_NM = "" ;
      Z782TBW03_CRT_USER_NM = "" ;
      Z785TBW03_UPD_USER_NM = "" ;
      T001612_A110TBW03_SESSION_ID = new String[] {""} ;
      T001612_A111TBW03_APP_ID = new String[] {""} ;
      T001612_A112TBW03_DISP_DATETIME = new String[] {""} ;
      T001612_A114TBW03_SUBJECT_ID = new int[1] ;
      T001612_A710TBW03_CRF_NM = new String[] {""} ;
      T001612_n710TBW03_CRF_NM = new boolean[] {false} ;
      T001612_A711TBW03_CRF_SNM = new String[] {""} ;
      T001612_n711TBW03_CRF_SNM = new boolean[] {false} ;
      T001612_A712TBW03_CRF_ORDER = new int[1] ;
      T001612_n712TBW03_CRF_ORDER = new boolean[] {false} ;
      T001612_A713TBW03_SITE_NM = new String[] {""} ;
      T001612_n713TBW03_SITE_NM = new boolean[] {false} ;
      T001612_A714TBW03_SITE_RYAK_NM = new String[] {""} ;
      T001612_n714TBW03_SITE_RYAK_NM = new boolean[] {false} ;
      T001612_A715TBW03_OUTER_SUBJECT_ID = new String[] {""} ;
      T001612_n715TBW03_OUTER_SUBJECT_ID = new boolean[] {false} ;
      T001612_A716TBW03_CRF_LATEST_VERSION = new short[1] ;
      T001612_n716TBW03_CRF_LATEST_VERSION = new boolean[] {false} ;
      T001612_A717TBW03_CRF_INPUT_LEVEL = new byte[1] ;
      T001612_n717TBW03_CRF_INPUT_LEVEL = new boolean[] {false} ;
      T001612_A718TBW03_LOCK_FLG = new String[] {""} ;
      T001612_n718TBW03_LOCK_FLG = new boolean[] {false} ;
      T001612_A719TBW03_LOCK_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001612_n719TBW03_LOCK_DATETIME = new boolean[] {false} ;
      T001612_A720TBW03_LOCK_USER_NM = new String[] {""} ;
      T001612_n720TBW03_LOCK_USER_NM = new boolean[] {false} ;
      T001612_A721TBW03_LOCK_AUTH_CD = new String[] {""} ;
      T001612_n721TBW03_LOCK_AUTH_CD = new boolean[] {false} ;
      T001612_A722TBW03_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001612_n722TBW03_UPLOAD_DATETIME = new boolean[] {false} ;
      T001612_A723TBW03_UPLOAD_USER_NM = new String[] {""} ;
      T001612_n723TBW03_UPLOAD_USER_NM = new boolean[] {false} ;
      T001612_A724TBW03_UPLOAD_AUTH_CD = new String[] {""} ;
      T001612_n724TBW03_UPLOAD_AUTH_CD = new boolean[] {false} ;
      T001612_A725TBW03_DM_ARRIVAL_FLG = new String[] {""} ;
      T001612_n725TBW03_DM_ARRIVAL_FLG = new boolean[] {false} ;
      T001612_A726TBW03_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001612_n726TBW03_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      T001612_A727TBW03_APPROVAL_FLG = new String[] {""} ;
      T001612_n727TBW03_APPROVAL_FLG = new boolean[] {false} ;
      T001612_A728TBW03_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001612_n728TBW03_APPROVAL_DATETIME = new boolean[] {false} ;
      T001612_A729TBW03_APPROVAL_USER_NM = new String[] {""} ;
      T001612_n729TBW03_APPROVAL_USER_NM = new boolean[] {false} ;
      T001612_A730TBW03_APPROVAL_AUTH_CD = new String[] {""} ;
      T001612_n730TBW03_APPROVAL_AUTH_CD = new boolean[] {false} ;
      T001612_A731TBW03_INPUT_END_FLG = new String[] {""} ;
      T001612_n731TBW03_INPUT_END_FLG = new boolean[] {false} ;
      T001612_A732TBW03_INPUT_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001612_n732TBW03_INPUT_END_DATETIME = new boolean[] {false} ;
      T001612_A733TBW03_INPUT_END_USER_NM = new String[] {""} ;
      T001612_n733TBW03_INPUT_END_USER_NM = new boolean[] {false} ;
      T001612_A734TBW03_INPUT_END_AUTH_CD = new String[] {""} ;
      T001612_n734TBW03_INPUT_END_AUTH_CD = new boolean[] {false} ;
      T001612_A780TBW03_DEL_FLG = new String[] {""} ;
      T001612_n780TBW03_DEL_FLG = new boolean[] {false} ;
      T001612_A781TBW03_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001612_n781TBW03_CRT_DATETIME = new boolean[] {false} ;
      T001612_A782TBW03_CRT_USER_NM = new String[] {""} ;
      T001612_n782TBW03_CRT_USER_NM = new boolean[] {false} ;
      T001612_A783TBW03_CRT_PROG_NM = new String[] {""} ;
      T001612_n783TBW03_CRT_PROG_NM = new boolean[] {false} ;
      T001612_A784TBW03_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001612_n784TBW03_UPD_DATETIME = new boolean[] {false} ;
      T001612_A785TBW03_UPD_USER_NM = new String[] {""} ;
      T001612_n785TBW03_UPD_USER_NM = new boolean[] {false} ;
      T001612_A786TBW03_UPD_PROG_NM = new String[] {""} ;
      T001612_n786TBW03_UPD_PROG_NM = new boolean[] {false} ;
      T001612_A787TBW03_UPD_CNT = new long[1] ;
      T001612_n787TBW03_UPD_CNT = new boolean[] {false} ;
      T001612_A113TBW03_STUDY_ID = new long[1] ;
      T001612_A115TBW03_CRF_ID = new short[1] ;
      T001612_A120TBW03_SITE_ID = new String[] {""} ;
      T001612_n120TBW03_SITE_ID = new boolean[] {false} ;
      T001612_A116TBW03_LOCK_USER_ID = new String[] {""} ;
      T001612_n116TBW03_LOCK_USER_ID = new boolean[] {false} ;
      T001612_A117TBW03_UPLOAD_USER_ID = new String[] {""} ;
      T001612_n117TBW03_UPLOAD_USER_ID = new boolean[] {false} ;
      T001612_A118TBW03_APPROVAL_USER_ID = new String[] {""} ;
      T001612_n118TBW03_APPROVAL_USER_ID = new boolean[] {false} ;
      T001612_A119TBW03_INPUT_END_USER_ID = new String[] {""} ;
      T001612_n119TBW03_INPUT_END_USER_ID = new boolean[] {false} ;
      T001612_A121TBW03_CRT_USER_ID = new String[] {""} ;
      T001612_n121TBW03_CRT_USER_ID = new boolean[] {false} ;
      T001612_A122TBW03_UPD_USER_ID = new String[] {""} ;
      T001612_n122TBW03_UPD_USER_ID = new boolean[] {false} ;
      T00164_A710TBW03_CRF_NM = new String[] {""} ;
      T00164_n710TBW03_CRF_NM = new boolean[] {false} ;
      T00164_A711TBW03_CRF_SNM = new String[] {""} ;
      T00164_n711TBW03_CRF_SNM = new boolean[] {false} ;
      T00164_A712TBW03_CRF_ORDER = new int[1] ;
      T00164_n712TBW03_CRF_ORDER = new boolean[] {false} ;
      T00165_A713TBW03_SITE_NM = new String[] {""} ;
      T00165_n713TBW03_SITE_NM = new boolean[] {false} ;
      T00165_A714TBW03_SITE_RYAK_NM = new String[] {""} ;
      T00165_n714TBW03_SITE_RYAK_NM = new boolean[] {false} ;
      T00166_A720TBW03_LOCK_USER_NM = new String[] {""} ;
      T00166_n720TBW03_LOCK_USER_NM = new boolean[] {false} ;
      T00167_A723TBW03_UPLOAD_USER_NM = new String[] {""} ;
      T00167_n723TBW03_UPLOAD_USER_NM = new boolean[] {false} ;
      T00168_A729TBW03_APPROVAL_USER_NM = new String[] {""} ;
      T00168_n729TBW03_APPROVAL_USER_NM = new boolean[] {false} ;
      T00169_A733TBW03_INPUT_END_USER_NM = new String[] {""} ;
      T00169_n733TBW03_INPUT_END_USER_NM = new boolean[] {false} ;
      T001610_A782TBW03_CRT_USER_NM = new String[] {""} ;
      T001610_n782TBW03_CRT_USER_NM = new boolean[] {false} ;
      T001611_A785TBW03_UPD_USER_NM = new String[] {""} ;
      T001611_n785TBW03_UPD_USER_NM = new boolean[] {false} ;
      T001613_A110TBW03_SESSION_ID = new String[] {""} ;
      T001613_A111TBW03_APP_ID = new String[] {""} ;
      T001613_A112TBW03_DISP_DATETIME = new String[] {""} ;
      T001613_A113TBW03_STUDY_ID = new long[1] ;
      T001613_A114TBW03_SUBJECT_ID = new int[1] ;
      T001613_A115TBW03_CRF_ID = new short[1] ;
      T00163_A110TBW03_SESSION_ID = new String[] {""} ;
      T00163_A111TBW03_APP_ID = new String[] {""} ;
      T00163_A112TBW03_DISP_DATETIME = new String[] {""} ;
      T00163_A114TBW03_SUBJECT_ID = new int[1] ;
      T00163_A715TBW03_OUTER_SUBJECT_ID = new String[] {""} ;
      T00163_n715TBW03_OUTER_SUBJECT_ID = new boolean[] {false} ;
      T00163_A716TBW03_CRF_LATEST_VERSION = new short[1] ;
      T00163_n716TBW03_CRF_LATEST_VERSION = new boolean[] {false} ;
      T00163_A717TBW03_CRF_INPUT_LEVEL = new byte[1] ;
      T00163_n717TBW03_CRF_INPUT_LEVEL = new boolean[] {false} ;
      T00163_A718TBW03_LOCK_FLG = new String[] {""} ;
      T00163_n718TBW03_LOCK_FLG = new boolean[] {false} ;
      T00163_A719TBW03_LOCK_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00163_n719TBW03_LOCK_DATETIME = new boolean[] {false} ;
      T00163_A721TBW03_LOCK_AUTH_CD = new String[] {""} ;
      T00163_n721TBW03_LOCK_AUTH_CD = new boolean[] {false} ;
      T00163_A722TBW03_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00163_n722TBW03_UPLOAD_DATETIME = new boolean[] {false} ;
      T00163_A724TBW03_UPLOAD_AUTH_CD = new String[] {""} ;
      T00163_n724TBW03_UPLOAD_AUTH_CD = new boolean[] {false} ;
      T00163_A725TBW03_DM_ARRIVAL_FLG = new String[] {""} ;
      T00163_n725TBW03_DM_ARRIVAL_FLG = new boolean[] {false} ;
      T00163_A726TBW03_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00163_n726TBW03_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      T00163_A727TBW03_APPROVAL_FLG = new String[] {""} ;
      T00163_n727TBW03_APPROVAL_FLG = new boolean[] {false} ;
      T00163_A728TBW03_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00163_n728TBW03_APPROVAL_DATETIME = new boolean[] {false} ;
      T00163_A730TBW03_APPROVAL_AUTH_CD = new String[] {""} ;
      T00163_n730TBW03_APPROVAL_AUTH_CD = new boolean[] {false} ;
      T00163_A731TBW03_INPUT_END_FLG = new String[] {""} ;
      T00163_n731TBW03_INPUT_END_FLG = new boolean[] {false} ;
      T00163_A732TBW03_INPUT_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00163_n732TBW03_INPUT_END_DATETIME = new boolean[] {false} ;
      T00163_A734TBW03_INPUT_END_AUTH_CD = new String[] {""} ;
      T00163_n734TBW03_INPUT_END_AUTH_CD = new boolean[] {false} ;
      T00163_A780TBW03_DEL_FLG = new String[] {""} ;
      T00163_n780TBW03_DEL_FLG = new boolean[] {false} ;
      T00163_A781TBW03_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00163_n781TBW03_CRT_DATETIME = new boolean[] {false} ;
      T00163_A783TBW03_CRT_PROG_NM = new String[] {""} ;
      T00163_n783TBW03_CRT_PROG_NM = new boolean[] {false} ;
      T00163_A784TBW03_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00163_n784TBW03_UPD_DATETIME = new boolean[] {false} ;
      T00163_A786TBW03_UPD_PROG_NM = new String[] {""} ;
      T00163_n786TBW03_UPD_PROG_NM = new boolean[] {false} ;
      T00163_A787TBW03_UPD_CNT = new long[1] ;
      T00163_n787TBW03_UPD_CNT = new boolean[] {false} ;
      T00163_A113TBW03_STUDY_ID = new long[1] ;
      T00163_A115TBW03_CRF_ID = new short[1] ;
      T00163_A120TBW03_SITE_ID = new String[] {""} ;
      T00163_n120TBW03_SITE_ID = new boolean[] {false} ;
      T00163_A116TBW03_LOCK_USER_ID = new String[] {""} ;
      T00163_n116TBW03_LOCK_USER_ID = new boolean[] {false} ;
      T00163_A117TBW03_UPLOAD_USER_ID = new String[] {""} ;
      T00163_n117TBW03_UPLOAD_USER_ID = new boolean[] {false} ;
      T00163_A118TBW03_APPROVAL_USER_ID = new String[] {""} ;
      T00163_n118TBW03_APPROVAL_USER_ID = new boolean[] {false} ;
      T00163_A119TBW03_INPUT_END_USER_ID = new String[] {""} ;
      T00163_n119TBW03_INPUT_END_USER_ID = new boolean[] {false} ;
      T00163_A121TBW03_CRT_USER_ID = new String[] {""} ;
      T00163_n121TBW03_CRT_USER_ID = new boolean[] {false} ;
      T00163_A122TBW03_UPD_USER_ID = new String[] {""} ;
      T00163_n122TBW03_UPD_USER_ID = new boolean[] {false} ;
      sMode41 = "" ;
      T001614_A110TBW03_SESSION_ID = new String[] {""} ;
      T001614_A111TBW03_APP_ID = new String[] {""} ;
      T001614_A112TBW03_DISP_DATETIME = new String[] {""} ;
      T001614_A113TBW03_STUDY_ID = new long[1] ;
      T001614_A114TBW03_SUBJECT_ID = new int[1] ;
      T001614_A115TBW03_CRF_ID = new short[1] ;
      T001615_A110TBW03_SESSION_ID = new String[] {""} ;
      T001615_A111TBW03_APP_ID = new String[] {""} ;
      T001615_A112TBW03_DISP_DATETIME = new String[] {""} ;
      T001615_A113TBW03_STUDY_ID = new long[1] ;
      T001615_A114TBW03_SUBJECT_ID = new int[1] ;
      T001615_A115TBW03_CRF_ID = new short[1] ;
      T00162_A110TBW03_SESSION_ID = new String[] {""} ;
      T00162_A111TBW03_APP_ID = new String[] {""} ;
      T00162_A112TBW03_DISP_DATETIME = new String[] {""} ;
      T00162_A114TBW03_SUBJECT_ID = new int[1] ;
      T00162_A715TBW03_OUTER_SUBJECT_ID = new String[] {""} ;
      T00162_n715TBW03_OUTER_SUBJECT_ID = new boolean[] {false} ;
      T00162_A716TBW03_CRF_LATEST_VERSION = new short[1] ;
      T00162_n716TBW03_CRF_LATEST_VERSION = new boolean[] {false} ;
      T00162_A717TBW03_CRF_INPUT_LEVEL = new byte[1] ;
      T00162_n717TBW03_CRF_INPUT_LEVEL = new boolean[] {false} ;
      T00162_A718TBW03_LOCK_FLG = new String[] {""} ;
      T00162_n718TBW03_LOCK_FLG = new boolean[] {false} ;
      T00162_A719TBW03_LOCK_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00162_n719TBW03_LOCK_DATETIME = new boolean[] {false} ;
      T00162_A721TBW03_LOCK_AUTH_CD = new String[] {""} ;
      T00162_n721TBW03_LOCK_AUTH_CD = new boolean[] {false} ;
      T00162_A722TBW03_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00162_n722TBW03_UPLOAD_DATETIME = new boolean[] {false} ;
      T00162_A724TBW03_UPLOAD_AUTH_CD = new String[] {""} ;
      T00162_n724TBW03_UPLOAD_AUTH_CD = new boolean[] {false} ;
      T00162_A725TBW03_DM_ARRIVAL_FLG = new String[] {""} ;
      T00162_n725TBW03_DM_ARRIVAL_FLG = new boolean[] {false} ;
      T00162_A726TBW03_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00162_n726TBW03_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      T00162_A727TBW03_APPROVAL_FLG = new String[] {""} ;
      T00162_n727TBW03_APPROVAL_FLG = new boolean[] {false} ;
      T00162_A728TBW03_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00162_n728TBW03_APPROVAL_DATETIME = new boolean[] {false} ;
      T00162_A730TBW03_APPROVAL_AUTH_CD = new String[] {""} ;
      T00162_n730TBW03_APPROVAL_AUTH_CD = new boolean[] {false} ;
      T00162_A731TBW03_INPUT_END_FLG = new String[] {""} ;
      T00162_n731TBW03_INPUT_END_FLG = new boolean[] {false} ;
      T00162_A732TBW03_INPUT_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00162_n732TBW03_INPUT_END_DATETIME = new boolean[] {false} ;
      T00162_A734TBW03_INPUT_END_AUTH_CD = new String[] {""} ;
      T00162_n734TBW03_INPUT_END_AUTH_CD = new boolean[] {false} ;
      T00162_A780TBW03_DEL_FLG = new String[] {""} ;
      T00162_n780TBW03_DEL_FLG = new boolean[] {false} ;
      T00162_A781TBW03_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00162_n781TBW03_CRT_DATETIME = new boolean[] {false} ;
      T00162_A783TBW03_CRT_PROG_NM = new String[] {""} ;
      T00162_n783TBW03_CRT_PROG_NM = new boolean[] {false} ;
      T00162_A784TBW03_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00162_n784TBW03_UPD_DATETIME = new boolean[] {false} ;
      T00162_A786TBW03_UPD_PROG_NM = new String[] {""} ;
      T00162_n786TBW03_UPD_PROG_NM = new boolean[] {false} ;
      T00162_A787TBW03_UPD_CNT = new long[1] ;
      T00162_n787TBW03_UPD_CNT = new boolean[] {false} ;
      T00162_A113TBW03_STUDY_ID = new long[1] ;
      T00162_A115TBW03_CRF_ID = new short[1] ;
      T00162_A120TBW03_SITE_ID = new String[] {""} ;
      T00162_n120TBW03_SITE_ID = new boolean[] {false} ;
      T00162_A116TBW03_LOCK_USER_ID = new String[] {""} ;
      T00162_n116TBW03_LOCK_USER_ID = new boolean[] {false} ;
      T00162_A117TBW03_UPLOAD_USER_ID = new String[] {""} ;
      T00162_n117TBW03_UPLOAD_USER_ID = new boolean[] {false} ;
      T00162_A118TBW03_APPROVAL_USER_ID = new String[] {""} ;
      T00162_n118TBW03_APPROVAL_USER_ID = new boolean[] {false} ;
      T00162_A119TBW03_INPUT_END_USER_ID = new String[] {""} ;
      T00162_n119TBW03_INPUT_END_USER_ID = new boolean[] {false} ;
      T00162_A121TBW03_CRT_USER_ID = new String[] {""} ;
      T00162_n121TBW03_CRT_USER_ID = new boolean[] {false} ;
      T00162_A122TBW03_UPD_USER_ID = new String[] {""} ;
      T00162_n122TBW03_UPD_USER_ID = new boolean[] {false} ;
      T001619_A710TBW03_CRF_NM = new String[] {""} ;
      T001619_n710TBW03_CRF_NM = new boolean[] {false} ;
      T001619_A711TBW03_CRF_SNM = new String[] {""} ;
      T001619_n711TBW03_CRF_SNM = new boolean[] {false} ;
      T001619_A712TBW03_CRF_ORDER = new int[1] ;
      T001619_n712TBW03_CRF_ORDER = new boolean[] {false} ;
      T001620_A713TBW03_SITE_NM = new String[] {""} ;
      T001620_n713TBW03_SITE_NM = new boolean[] {false} ;
      T001620_A714TBW03_SITE_RYAK_NM = new String[] {""} ;
      T001620_n714TBW03_SITE_RYAK_NM = new boolean[] {false} ;
      T001621_A720TBW03_LOCK_USER_NM = new String[] {""} ;
      T001621_n720TBW03_LOCK_USER_NM = new boolean[] {false} ;
      T001622_A723TBW03_UPLOAD_USER_NM = new String[] {""} ;
      T001622_n723TBW03_UPLOAD_USER_NM = new boolean[] {false} ;
      T001623_A729TBW03_APPROVAL_USER_NM = new String[] {""} ;
      T001623_n729TBW03_APPROVAL_USER_NM = new boolean[] {false} ;
      T001624_A733TBW03_INPUT_END_USER_NM = new String[] {""} ;
      T001624_n733TBW03_INPUT_END_USER_NM = new boolean[] {false} ;
      T001625_A782TBW03_CRT_USER_NM = new String[] {""} ;
      T001625_n782TBW03_CRT_USER_NM = new boolean[] {false} ;
      T001626_A785TBW03_UPD_USER_NM = new String[] {""} ;
      T001626_n785TBW03_UPD_USER_NM = new boolean[] {false} ;
      T001627_A110TBW03_SESSION_ID = new String[] {""} ;
      T001627_A111TBW03_APP_ID = new String[] {""} ;
      T001627_A112TBW03_DISP_DATETIME = new String[] {""} ;
      T001627_A113TBW03_STUDY_ID = new long[1] ;
      T001627_A114TBW03_SUBJECT_ID = new int[1] ;
      T001627_A115TBW03_CRF_ID = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZV8Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbw03_crf_search__default(),
         new Object[] {
             new Object[] {
            T00162_A110TBW03_SESSION_ID, T00162_A111TBW03_APP_ID, T00162_A112TBW03_DISP_DATETIME, T00162_A114TBW03_SUBJECT_ID, T00162_A715TBW03_OUTER_SUBJECT_ID, T00162_n715TBW03_OUTER_SUBJECT_ID, T00162_A716TBW03_CRF_LATEST_VERSION, T00162_n716TBW03_CRF_LATEST_VERSION, T00162_A717TBW03_CRF_INPUT_LEVEL, T00162_n717TBW03_CRF_INPUT_LEVEL,
            T00162_A718TBW03_LOCK_FLG, T00162_n718TBW03_LOCK_FLG, T00162_A719TBW03_LOCK_DATETIME, T00162_n719TBW03_LOCK_DATETIME, T00162_A721TBW03_LOCK_AUTH_CD, T00162_n721TBW03_LOCK_AUTH_CD, T00162_A722TBW03_UPLOAD_DATETIME, T00162_n722TBW03_UPLOAD_DATETIME, T00162_A724TBW03_UPLOAD_AUTH_CD, T00162_n724TBW03_UPLOAD_AUTH_CD,
            T00162_A725TBW03_DM_ARRIVAL_FLG, T00162_n725TBW03_DM_ARRIVAL_FLG, T00162_A726TBW03_DM_ARRIVAL_DATETIME, T00162_n726TBW03_DM_ARRIVAL_DATETIME, T00162_A727TBW03_APPROVAL_FLG, T00162_n727TBW03_APPROVAL_FLG, T00162_A728TBW03_APPROVAL_DATETIME, T00162_n728TBW03_APPROVAL_DATETIME, T00162_A730TBW03_APPROVAL_AUTH_CD, T00162_n730TBW03_APPROVAL_AUTH_CD,
            T00162_A731TBW03_INPUT_END_FLG, T00162_n731TBW03_INPUT_END_FLG, T00162_A732TBW03_INPUT_END_DATETIME, T00162_n732TBW03_INPUT_END_DATETIME, T00162_A734TBW03_INPUT_END_AUTH_CD, T00162_n734TBW03_INPUT_END_AUTH_CD, T00162_A780TBW03_DEL_FLG, T00162_n780TBW03_DEL_FLG, T00162_A781TBW03_CRT_DATETIME, T00162_n781TBW03_CRT_DATETIME,
            T00162_A783TBW03_CRT_PROG_NM, T00162_n783TBW03_CRT_PROG_NM, T00162_A784TBW03_UPD_DATETIME, T00162_n784TBW03_UPD_DATETIME, T00162_A786TBW03_UPD_PROG_NM, T00162_n786TBW03_UPD_PROG_NM, T00162_A787TBW03_UPD_CNT, T00162_n787TBW03_UPD_CNT, T00162_A113TBW03_STUDY_ID, T00162_A115TBW03_CRF_ID,
            T00162_A120TBW03_SITE_ID, T00162_n120TBW03_SITE_ID, T00162_A116TBW03_LOCK_USER_ID, T00162_n116TBW03_LOCK_USER_ID, T00162_A117TBW03_UPLOAD_USER_ID, T00162_n117TBW03_UPLOAD_USER_ID, T00162_A118TBW03_APPROVAL_USER_ID, T00162_n118TBW03_APPROVAL_USER_ID, T00162_A119TBW03_INPUT_END_USER_ID, T00162_n119TBW03_INPUT_END_USER_ID,
            T00162_A121TBW03_CRT_USER_ID, T00162_n121TBW03_CRT_USER_ID, T00162_A122TBW03_UPD_USER_ID, T00162_n122TBW03_UPD_USER_ID
            }
            , new Object[] {
            T00163_A110TBW03_SESSION_ID, T00163_A111TBW03_APP_ID, T00163_A112TBW03_DISP_DATETIME, T00163_A114TBW03_SUBJECT_ID, T00163_A715TBW03_OUTER_SUBJECT_ID, T00163_n715TBW03_OUTER_SUBJECT_ID, T00163_A716TBW03_CRF_LATEST_VERSION, T00163_n716TBW03_CRF_LATEST_VERSION, T00163_A717TBW03_CRF_INPUT_LEVEL, T00163_n717TBW03_CRF_INPUT_LEVEL,
            T00163_A718TBW03_LOCK_FLG, T00163_n718TBW03_LOCK_FLG, T00163_A719TBW03_LOCK_DATETIME, T00163_n719TBW03_LOCK_DATETIME, T00163_A721TBW03_LOCK_AUTH_CD, T00163_n721TBW03_LOCK_AUTH_CD, T00163_A722TBW03_UPLOAD_DATETIME, T00163_n722TBW03_UPLOAD_DATETIME, T00163_A724TBW03_UPLOAD_AUTH_CD, T00163_n724TBW03_UPLOAD_AUTH_CD,
            T00163_A725TBW03_DM_ARRIVAL_FLG, T00163_n725TBW03_DM_ARRIVAL_FLG, T00163_A726TBW03_DM_ARRIVAL_DATETIME, T00163_n726TBW03_DM_ARRIVAL_DATETIME, T00163_A727TBW03_APPROVAL_FLG, T00163_n727TBW03_APPROVAL_FLG, T00163_A728TBW03_APPROVAL_DATETIME, T00163_n728TBW03_APPROVAL_DATETIME, T00163_A730TBW03_APPROVAL_AUTH_CD, T00163_n730TBW03_APPROVAL_AUTH_CD,
            T00163_A731TBW03_INPUT_END_FLG, T00163_n731TBW03_INPUT_END_FLG, T00163_A732TBW03_INPUT_END_DATETIME, T00163_n732TBW03_INPUT_END_DATETIME, T00163_A734TBW03_INPUT_END_AUTH_CD, T00163_n734TBW03_INPUT_END_AUTH_CD, T00163_A780TBW03_DEL_FLG, T00163_n780TBW03_DEL_FLG, T00163_A781TBW03_CRT_DATETIME, T00163_n781TBW03_CRT_DATETIME,
            T00163_A783TBW03_CRT_PROG_NM, T00163_n783TBW03_CRT_PROG_NM, T00163_A784TBW03_UPD_DATETIME, T00163_n784TBW03_UPD_DATETIME, T00163_A786TBW03_UPD_PROG_NM, T00163_n786TBW03_UPD_PROG_NM, T00163_A787TBW03_UPD_CNT, T00163_n787TBW03_UPD_CNT, T00163_A113TBW03_STUDY_ID, T00163_A115TBW03_CRF_ID,
            T00163_A120TBW03_SITE_ID, T00163_n120TBW03_SITE_ID, T00163_A116TBW03_LOCK_USER_ID, T00163_n116TBW03_LOCK_USER_ID, T00163_A117TBW03_UPLOAD_USER_ID, T00163_n117TBW03_UPLOAD_USER_ID, T00163_A118TBW03_APPROVAL_USER_ID, T00163_n118TBW03_APPROVAL_USER_ID, T00163_A119TBW03_INPUT_END_USER_ID, T00163_n119TBW03_INPUT_END_USER_ID,
            T00163_A121TBW03_CRT_USER_ID, T00163_n121TBW03_CRT_USER_ID, T00163_A122TBW03_UPD_USER_ID, T00163_n122TBW03_UPD_USER_ID
            }
            , new Object[] {
            T00164_A710TBW03_CRF_NM, T00164_n710TBW03_CRF_NM, T00164_A711TBW03_CRF_SNM, T00164_n711TBW03_CRF_SNM, T00164_A712TBW03_CRF_ORDER, T00164_n712TBW03_CRF_ORDER
            }
            , new Object[] {
            T00165_A713TBW03_SITE_NM, T00165_n713TBW03_SITE_NM, T00165_A714TBW03_SITE_RYAK_NM, T00165_n714TBW03_SITE_RYAK_NM
            }
            , new Object[] {
            T00166_A720TBW03_LOCK_USER_NM, T00166_n720TBW03_LOCK_USER_NM
            }
            , new Object[] {
            T00167_A723TBW03_UPLOAD_USER_NM, T00167_n723TBW03_UPLOAD_USER_NM
            }
            , new Object[] {
            T00168_A729TBW03_APPROVAL_USER_NM, T00168_n729TBW03_APPROVAL_USER_NM
            }
            , new Object[] {
            T00169_A733TBW03_INPUT_END_USER_NM, T00169_n733TBW03_INPUT_END_USER_NM
            }
            , new Object[] {
            T001610_A782TBW03_CRT_USER_NM, T001610_n782TBW03_CRT_USER_NM
            }
            , new Object[] {
            T001611_A785TBW03_UPD_USER_NM, T001611_n785TBW03_UPD_USER_NM
            }
            , new Object[] {
            T001612_A110TBW03_SESSION_ID, T001612_A111TBW03_APP_ID, T001612_A112TBW03_DISP_DATETIME, T001612_A114TBW03_SUBJECT_ID, T001612_A710TBW03_CRF_NM, T001612_n710TBW03_CRF_NM, T001612_A711TBW03_CRF_SNM, T001612_n711TBW03_CRF_SNM, T001612_A712TBW03_CRF_ORDER, T001612_n712TBW03_CRF_ORDER,
            T001612_A713TBW03_SITE_NM, T001612_n713TBW03_SITE_NM, T001612_A714TBW03_SITE_RYAK_NM, T001612_n714TBW03_SITE_RYAK_NM, T001612_A715TBW03_OUTER_SUBJECT_ID, T001612_n715TBW03_OUTER_SUBJECT_ID, T001612_A716TBW03_CRF_LATEST_VERSION, T001612_n716TBW03_CRF_LATEST_VERSION, T001612_A717TBW03_CRF_INPUT_LEVEL, T001612_n717TBW03_CRF_INPUT_LEVEL,
            T001612_A718TBW03_LOCK_FLG, T001612_n718TBW03_LOCK_FLG, T001612_A719TBW03_LOCK_DATETIME, T001612_n719TBW03_LOCK_DATETIME, T001612_A720TBW03_LOCK_USER_NM, T001612_n720TBW03_LOCK_USER_NM, T001612_A721TBW03_LOCK_AUTH_CD, T001612_n721TBW03_LOCK_AUTH_CD, T001612_A722TBW03_UPLOAD_DATETIME, T001612_n722TBW03_UPLOAD_DATETIME,
            T001612_A723TBW03_UPLOAD_USER_NM, T001612_n723TBW03_UPLOAD_USER_NM, T001612_A724TBW03_UPLOAD_AUTH_CD, T001612_n724TBW03_UPLOAD_AUTH_CD, T001612_A725TBW03_DM_ARRIVAL_FLG, T001612_n725TBW03_DM_ARRIVAL_FLG, T001612_A726TBW03_DM_ARRIVAL_DATETIME, T001612_n726TBW03_DM_ARRIVAL_DATETIME, T001612_A727TBW03_APPROVAL_FLG, T001612_n727TBW03_APPROVAL_FLG,
            T001612_A728TBW03_APPROVAL_DATETIME, T001612_n728TBW03_APPROVAL_DATETIME, T001612_A729TBW03_APPROVAL_USER_NM, T001612_n729TBW03_APPROVAL_USER_NM, T001612_A730TBW03_APPROVAL_AUTH_CD, T001612_n730TBW03_APPROVAL_AUTH_CD, T001612_A731TBW03_INPUT_END_FLG, T001612_n731TBW03_INPUT_END_FLG, T001612_A732TBW03_INPUT_END_DATETIME, T001612_n732TBW03_INPUT_END_DATETIME,
            T001612_A733TBW03_INPUT_END_USER_NM, T001612_n733TBW03_INPUT_END_USER_NM, T001612_A734TBW03_INPUT_END_AUTH_CD, T001612_n734TBW03_INPUT_END_AUTH_CD, T001612_A780TBW03_DEL_FLG, T001612_n780TBW03_DEL_FLG, T001612_A781TBW03_CRT_DATETIME, T001612_n781TBW03_CRT_DATETIME, T001612_A782TBW03_CRT_USER_NM, T001612_n782TBW03_CRT_USER_NM,
            T001612_A783TBW03_CRT_PROG_NM, T001612_n783TBW03_CRT_PROG_NM, T001612_A784TBW03_UPD_DATETIME, T001612_n784TBW03_UPD_DATETIME, T001612_A785TBW03_UPD_USER_NM, T001612_n785TBW03_UPD_USER_NM, T001612_A786TBW03_UPD_PROG_NM, T001612_n786TBW03_UPD_PROG_NM, T001612_A787TBW03_UPD_CNT, T001612_n787TBW03_UPD_CNT,
            T001612_A113TBW03_STUDY_ID, T001612_A115TBW03_CRF_ID, T001612_A120TBW03_SITE_ID, T001612_n120TBW03_SITE_ID, T001612_A116TBW03_LOCK_USER_ID, T001612_n116TBW03_LOCK_USER_ID, T001612_A117TBW03_UPLOAD_USER_ID, T001612_n117TBW03_UPLOAD_USER_ID, T001612_A118TBW03_APPROVAL_USER_ID, T001612_n118TBW03_APPROVAL_USER_ID,
            T001612_A119TBW03_INPUT_END_USER_ID, T001612_n119TBW03_INPUT_END_USER_ID, T001612_A121TBW03_CRT_USER_ID, T001612_n121TBW03_CRT_USER_ID, T001612_A122TBW03_UPD_USER_ID, T001612_n122TBW03_UPD_USER_ID
            }
            , new Object[] {
            T001613_A110TBW03_SESSION_ID, T001613_A111TBW03_APP_ID, T001613_A112TBW03_DISP_DATETIME, T001613_A113TBW03_STUDY_ID, T001613_A114TBW03_SUBJECT_ID, T001613_A115TBW03_CRF_ID
            }
            , new Object[] {
            T001614_A110TBW03_SESSION_ID, T001614_A111TBW03_APP_ID, T001614_A112TBW03_DISP_DATETIME, T001614_A113TBW03_STUDY_ID, T001614_A114TBW03_SUBJECT_ID, T001614_A115TBW03_CRF_ID
            }
            , new Object[] {
            T001615_A110TBW03_SESSION_ID, T001615_A111TBW03_APP_ID, T001615_A112TBW03_DISP_DATETIME, T001615_A113TBW03_STUDY_ID, T001615_A114TBW03_SUBJECT_ID, T001615_A115TBW03_CRF_ID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T001619_A710TBW03_CRF_NM, T001619_n710TBW03_CRF_NM, T001619_A711TBW03_CRF_SNM, T001619_n711TBW03_CRF_SNM, T001619_A712TBW03_CRF_ORDER, T001619_n712TBW03_CRF_ORDER
            }
            , new Object[] {
            T001620_A713TBW03_SITE_NM, T001620_n713TBW03_SITE_NM, T001620_A714TBW03_SITE_RYAK_NM, T001620_n714TBW03_SITE_RYAK_NM
            }
            , new Object[] {
            T001621_A720TBW03_LOCK_USER_NM, T001621_n720TBW03_LOCK_USER_NM
            }
            , new Object[] {
            T001622_A723TBW03_UPLOAD_USER_NM, T001622_n723TBW03_UPLOAD_USER_NM
            }
            , new Object[] {
            T001623_A729TBW03_APPROVAL_USER_NM, T001623_n729TBW03_APPROVAL_USER_NM
            }
            , new Object[] {
            T001624_A733TBW03_INPUT_END_USER_NM, T001624_n733TBW03_INPUT_END_USER_NM
            }
            , new Object[] {
            T001625_A782TBW03_CRT_USER_NM, T001625_n782TBW03_CRT_USER_NM
            }
            , new Object[] {
            T001626_A785TBW03_UPD_USER_NM, T001626_n785TBW03_UPD_USER_NM
            }
            , new Object[] {
            T001627_A110TBW03_SESSION_ID, T001627_A111TBW03_APP_ID, T001627_A112TBW03_DISP_DATETIME, T001627_A113TBW03_STUDY_ID, T001627_A114TBW03_SUBJECT_ID, T001627_A115TBW03_CRF_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV8Pgmname = "TBW03_CRF_SEARCH" ;
   }

   private byte Z717TBW03_CRF_INPUT_LEVEL ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A717TBW03_CRF_INPUT_LEVEL ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short Z115TBW03_CRF_ID ;
   private short Z716TBW03_CRF_LATEST_VERSION ;
   private short A115TBW03_CRF_ID ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A716TBW03_CRF_LATEST_VERSION ;
   private short RcdFound41 ;
   private short Gx_err ;
   private int Z114TBW03_SUBJECT_ID ;
   private int trnEnded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int edtTBW03_SESSION_ID_Enabled ;
   private int edtTBW03_APP_ID_Enabled ;
   private int edtTBW03_DISP_DATETIME_Enabled ;
   private int edtTBW03_STUDY_ID_Enabled ;
   private int A114TBW03_SUBJECT_ID ;
   private int edtTBW03_SUBJECT_ID_Enabled ;
   private int edtTBW03_CRF_ID_Enabled ;
   private int edtTBW03_CRF_NM_Enabled ;
   private int edtTBW03_CRF_SNM_Enabled ;
   private int A712TBW03_CRF_ORDER ;
   private int edtTBW03_CRF_ORDER_Enabled ;
   private int edtTBW03_SITE_ID_Enabled ;
   private int edtTBW03_SITE_NM_Enabled ;
   private int edtTBW03_SITE_RYAK_NM_Enabled ;
   private int edtTBW03_OUTER_SUBJECT_ID_Enabled ;
   private int edtTBW03_CRF_LATEST_VERSION_Enabled ;
   private int edtTBW03_CRF_INPUT_LEVEL_Enabled ;
   private int edtTBW03_LOCK_FLG_Enabled ;
   private int edtTBW03_LOCK_DATETIME_Enabled ;
   private int edtTBW03_LOCK_USER_ID_Enabled ;
   private int edtTBW03_LOCK_USER_NM_Enabled ;
   private int edtTBW03_LOCK_AUTH_CD_Enabled ;
   private int edtTBW03_UPLOAD_DATETIME_Enabled ;
   private int edtTBW03_UPLOAD_USER_ID_Enabled ;
   private int edtTBW03_UPLOAD_USER_NM_Enabled ;
   private int edtTBW03_UPLOAD_AUTH_CD_Enabled ;
   private int edtTBW03_DM_ARRIVAL_FLG_Enabled ;
   private int edtTBW03_DM_ARRIVAL_DATETIME_Enabled ;
   private int edtTBW03_APPROVAL_FLG_Enabled ;
   private int edtTBW03_APPROVAL_DATETIME_Enabled ;
   private int edtTBW03_APPROVAL_USER_ID_Enabled ;
   private int edtTBW03_APPROVAL_USER_NM_Enabled ;
   private int edtTBW03_APPROVAL_AUTH_CD_Enabled ;
   private int edtTBW03_INPUT_END_FLG_Enabled ;
   private int edtTBW03_INPUT_END_DATETIME_Enabled ;
   private int edtTBW03_INPUT_END_USER_ID_Enabled ;
   private int edtTBW03_INPUT_END_USER_NM_Enabled ;
   private int edtTBW03_INPUT_END_AUTH_CD_Enabled ;
   private int edtTBW03_DEL_FLG_Enabled ;
   private int edtTBW03_CRT_DATETIME_Enabled ;
   private int edtTBW03_CRT_USER_ID_Enabled ;
   private int edtTBW03_CRT_USER_NM_Enabled ;
   private int edtTBW03_CRT_PROG_NM_Enabled ;
   private int edtTBW03_UPD_DATETIME_Enabled ;
   private int edtTBW03_UPD_USER_ID_Enabled ;
   private int edtTBW03_UPD_USER_NM_Enabled ;
   private int edtTBW03_UPD_PROG_NM_Enabled ;
   private int edtTBW03_UPD_CNT_Enabled ;
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
   private int Z712TBW03_CRF_ORDER ;
   private int idxLst ;
   private int GXActiveErrHndl ;
   private long Z113TBW03_STUDY_ID ;
   private long Z787TBW03_UPD_CNT ;
   private long A113TBW03_STUDY_ID ;
   private long A787TBW03_UPD_CNT ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTBW03_SESSION_ID_Internalname ;
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
   private String lblTextblocktbw03_session_id_Internalname ;
   private String lblTextblocktbw03_session_id_Jsonclick ;
   private String edtTBW03_SESSION_ID_Jsonclick ;
   private String lblTextblocktbw03_app_id_Internalname ;
   private String lblTextblocktbw03_app_id_Jsonclick ;
   private String edtTBW03_APP_ID_Internalname ;
   private String edtTBW03_APP_ID_Jsonclick ;
   private String lblTextblocktbw03_disp_datetime_Internalname ;
   private String lblTextblocktbw03_disp_datetime_Jsonclick ;
   private String edtTBW03_DISP_DATETIME_Internalname ;
   private String edtTBW03_DISP_DATETIME_Jsonclick ;
   private String lblTextblocktbw03_study_id_Internalname ;
   private String lblTextblocktbw03_study_id_Jsonclick ;
   private String edtTBW03_STUDY_ID_Internalname ;
   private String edtTBW03_STUDY_ID_Jsonclick ;
   private String lblTextblocktbw03_subject_id_Internalname ;
   private String lblTextblocktbw03_subject_id_Jsonclick ;
   private String edtTBW03_SUBJECT_ID_Internalname ;
   private String edtTBW03_SUBJECT_ID_Jsonclick ;
   private String lblTextblocktbw03_crf_id_Internalname ;
   private String lblTextblocktbw03_crf_id_Jsonclick ;
   private String edtTBW03_CRF_ID_Internalname ;
   private String edtTBW03_CRF_ID_Jsonclick ;
   private String lblTextblocktbw03_crf_nm_Internalname ;
   private String lblTextblocktbw03_crf_nm_Jsonclick ;
   private String edtTBW03_CRF_NM_Internalname ;
   private String edtTBW03_CRF_NM_Jsonclick ;
   private String lblTextblocktbw03_crf_snm_Internalname ;
   private String lblTextblocktbw03_crf_snm_Jsonclick ;
   private String edtTBW03_CRF_SNM_Internalname ;
   private String edtTBW03_CRF_SNM_Jsonclick ;
   private String lblTextblocktbw03_crf_order_Internalname ;
   private String lblTextblocktbw03_crf_order_Jsonclick ;
   private String edtTBW03_CRF_ORDER_Internalname ;
   private String edtTBW03_CRF_ORDER_Jsonclick ;
   private String lblTextblocktbw03_site_id_Internalname ;
   private String lblTextblocktbw03_site_id_Jsonclick ;
   private String edtTBW03_SITE_ID_Internalname ;
   private String edtTBW03_SITE_ID_Jsonclick ;
   private String lblTextblocktbw03_site_nm_Internalname ;
   private String lblTextblocktbw03_site_nm_Jsonclick ;
   private String edtTBW03_SITE_NM_Internalname ;
   private String edtTBW03_SITE_NM_Jsonclick ;
   private String lblTextblocktbw03_site_ryak_nm_Internalname ;
   private String lblTextblocktbw03_site_ryak_nm_Jsonclick ;
   private String edtTBW03_SITE_RYAK_NM_Internalname ;
   private String edtTBW03_SITE_RYAK_NM_Jsonclick ;
   private String lblTextblocktbw03_outer_subject_id_Internalname ;
   private String lblTextblocktbw03_outer_subject_id_Jsonclick ;
   private String edtTBW03_OUTER_SUBJECT_ID_Internalname ;
   private String edtTBW03_OUTER_SUBJECT_ID_Jsonclick ;
   private String lblTextblocktbw03_crf_latest_version_Internalname ;
   private String lblTextblocktbw03_crf_latest_version_Jsonclick ;
   private String edtTBW03_CRF_LATEST_VERSION_Internalname ;
   private String edtTBW03_CRF_LATEST_VERSION_Jsonclick ;
   private String lblTextblocktbw03_crf_input_level_Internalname ;
   private String lblTextblocktbw03_crf_input_level_Jsonclick ;
   private String edtTBW03_CRF_INPUT_LEVEL_Internalname ;
   private String edtTBW03_CRF_INPUT_LEVEL_Jsonclick ;
   private String lblTextblocktbw03_lock_flg_Internalname ;
   private String lblTextblocktbw03_lock_flg_Jsonclick ;
   private String edtTBW03_LOCK_FLG_Internalname ;
   private String edtTBW03_LOCK_FLG_Jsonclick ;
   private String lblTextblocktbw03_lock_datetime_Internalname ;
   private String lblTextblocktbw03_lock_datetime_Jsonclick ;
   private String edtTBW03_LOCK_DATETIME_Internalname ;
   private String edtTBW03_LOCK_DATETIME_Jsonclick ;
   private String lblTextblocktbw03_lock_user_id_Internalname ;
   private String lblTextblocktbw03_lock_user_id_Jsonclick ;
   private String edtTBW03_LOCK_USER_ID_Internalname ;
   private String edtTBW03_LOCK_USER_ID_Jsonclick ;
   private String lblTextblocktbw03_lock_user_nm_Internalname ;
   private String lblTextblocktbw03_lock_user_nm_Jsonclick ;
   private String edtTBW03_LOCK_USER_NM_Internalname ;
   private String edtTBW03_LOCK_USER_NM_Jsonclick ;
   private String lblTextblocktbw03_lock_auth_cd_Internalname ;
   private String lblTextblocktbw03_lock_auth_cd_Jsonclick ;
   private String edtTBW03_LOCK_AUTH_CD_Internalname ;
   private String edtTBW03_LOCK_AUTH_CD_Jsonclick ;
   private String lblTextblocktbw03_upload_datetime_Internalname ;
   private String lblTextblocktbw03_upload_datetime_Jsonclick ;
   private String edtTBW03_UPLOAD_DATETIME_Internalname ;
   private String edtTBW03_UPLOAD_DATETIME_Jsonclick ;
   private String lblTextblocktbw03_upload_user_id_Internalname ;
   private String lblTextblocktbw03_upload_user_id_Jsonclick ;
   private String edtTBW03_UPLOAD_USER_ID_Internalname ;
   private String edtTBW03_UPLOAD_USER_ID_Jsonclick ;
   private String lblTextblocktbw03_upload_user_nm_Internalname ;
   private String lblTextblocktbw03_upload_user_nm_Jsonclick ;
   private String edtTBW03_UPLOAD_USER_NM_Internalname ;
   private String edtTBW03_UPLOAD_USER_NM_Jsonclick ;
   private String lblTextblocktbw03_upload_auth_cd_Internalname ;
   private String lblTextblocktbw03_upload_auth_cd_Jsonclick ;
   private String edtTBW03_UPLOAD_AUTH_CD_Internalname ;
   private String edtTBW03_UPLOAD_AUTH_CD_Jsonclick ;
   private String lblTextblocktbw03_dm_arrival_flg_Internalname ;
   private String lblTextblocktbw03_dm_arrival_flg_Jsonclick ;
   private String edtTBW03_DM_ARRIVAL_FLG_Internalname ;
   private String edtTBW03_DM_ARRIVAL_FLG_Jsonclick ;
   private String lblTextblocktbw03_dm_arrival_datetime_Internalname ;
   private String lblTextblocktbw03_dm_arrival_datetime_Jsonclick ;
   private String edtTBW03_DM_ARRIVAL_DATETIME_Internalname ;
   private String edtTBW03_DM_ARRIVAL_DATETIME_Jsonclick ;
   private String lblTextblocktbw03_approval_flg_Internalname ;
   private String lblTextblocktbw03_approval_flg_Jsonclick ;
   private String edtTBW03_APPROVAL_FLG_Internalname ;
   private String edtTBW03_APPROVAL_FLG_Jsonclick ;
   private String lblTextblocktbw03_approval_datetime_Internalname ;
   private String lblTextblocktbw03_approval_datetime_Jsonclick ;
   private String edtTBW03_APPROVAL_DATETIME_Internalname ;
   private String edtTBW03_APPROVAL_DATETIME_Jsonclick ;
   private String lblTextblocktbw03_approval_user_id_Internalname ;
   private String lblTextblocktbw03_approval_user_id_Jsonclick ;
   private String edtTBW03_APPROVAL_USER_ID_Internalname ;
   private String edtTBW03_APPROVAL_USER_ID_Jsonclick ;
   private String lblTextblocktbw03_approval_user_nm_Internalname ;
   private String lblTextblocktbw03_approval_user_nm_Jsonclick ;
   private String edtTBW03_APPROVAL_USER_NM_Internalname ;
   private String edtTBW03_APPROVAL_USER_NM_Jsonclick ;
   private String lblTextblocktbw03_approval_auth_cd_Internalname ;
   private String lblTextblocktbw03_approval_auth_cd_Jsonclick ;
   private String edtTBW03_APPROVAL_AUTH_CD_Internalname ;
   private String edtTBW03_APPROVAL_AUTH_CD_Jsonclick ;
   private String lblTextblocktbw03_input_end_flg_Internalname ;
   private String lblTextblocktbw03_input_end_flg_Jsonclick ;
   private String edtTBW03_INPUT_END_FLG_Internalname ;
   private String edtTBW03_INPUT_END_FLG_Jsonclick ;
   private String lblTextblocktbw03_input_end_datetime_Internalname ;
   private String lblTextblocktbw03_input_end_datetime_Jsonclick ;
   private String edtTBW03_INPUT_END_DATETIME_Internalname ;
   private String edtTBW03_INPUT_END_DATETIME_Jsonclick ;
   private String lblTextblocktbw03_input_end_user_id_Internalname ;
   private String lblTextblocktbw03_input_end_user_id_Jsonclick ;
   private String edtTBW03_INPUT_END_USER_ID_Internalname ;
   private String edtTBW03_INPUT_END_USER_ID_Jsonclick ;
   private String lblTextblocktbw03_input_end_user_nm_Internalname ;
   private String lblTextblocktbw03_input_end_user_nm_Jsonclick ;
   private String edtTBW03_INPUT_END_USER_NM_Internalname ;
   private String edtTBW03_INPUT_END_USER_NM_Jsonclick ;
   private String lblTextblocktbw03_input_end_auth_cd_Internalname ;
   private String lblTextblocktbw03_input_end_auth_cd_Jsonclick ;
   private String edtTBW03_INPUT_END_AUTH_CD_Internalname ;
   private String edtTBW03_INPUT_END_AUTH_CD_Jsonclick ;
   private String lblTextblocktbw03_del_flg_Internalname ;
   private String lblTextblocktbw03_del_flg_Jsonclick ;
   private String edtTBW03_DEL_FLG_Internalname ;
   private String edtTBW03_DEL_FLG_Jsonclick ;
   private String lblTextblocktbw03_crt_datetime_Internalname ;
   private String lblTextblocktbw03_crt_datetime_Jsonclick ;
   private String edtTBW03_CRT_DATETIME_Internalname ;
   private String edtTBW03_CRT_DATETIME_Jsonclick ;
   private String lblTextblocktbw03_crt_user_id_Internalname ;
   private String lblTextblocktbw03_crt_user_id_Jsonclick ;
   private String edtTBW03_CRT_USER_ID_Internalname ;
   private String edtTBW03_CRT_USER_ID_Jsonclick ;
   private String lblTextblocktbw03_crt_user_nm_Internalname ;
   private String lblTextblocktbw03_crt_user_nm_Jsonclick ;
   private String edtTBW03_CRT_USER_NM_Internalname ;
   private String edtTBW03_CRT_USER_NM_Jsonclick ;
   private String lblTextblocktbw03_crt_prog_nm_Internalname ;
   private String lblTextblocktbw03_crt_prog_nm_Jsonclick ;
   private String edtTBW03_CRT_PROG_NM_Internalname ;
   private String edtTBW03_CRT_PROG_NM_Jsonclick ;
   private String lblTextblocktbw03_upd_datetime_Internalname ;
   private String lblTextblocktbw03_upd_datetime_Jsonclick ;
   private String edtTBW03_UPD_DATETIME_Internalname ;
   private String edtTBW03_UPD_DATETIME_Jsonclick ;
   private String lblTextblocktbw03_upd_user_id_Internalname ;
   private String lblTextblocktbw03_upd_user_id_Jsonclick ;
   private String edtTBW03_UPD_USER_ID_Internalname ;
   private String edtTBW03_UPD_USER_ID_Jsonclick ;
   private String lblTextblocktbw03_upd_user_nm_Internalname ;
   private String lblTextblocktbw03_upd_user_nm_Jsonclick ;
   private String edtTBW03_UPD_USER_NM_Internalname ;
   private String edtTBW03_UPD_USER_NM_Jsonclick ;
   private String lblTextblocktbw03_upd_prog_nm_Internalname ;
   private String lblTextblocktbw03_upd_prog_nm_Jsonclick ;
   private String edtTBW03_UPD_PROG_NM_Internalname ;
   private String edtTBW03_UPD_PROG_NM_Jsonclick ;
   private String lblTextblocktbw03_upd_cnt_Internalname ;
   private String lblTextblocktbw03_upd_cnt_Jsonclick ;
   private String edtTBW03_UPD_CNT_Internalname ;
   private String edtTBW03_UPD_CNT_Jsonclick ;
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
   private String AV8Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String GXEncryptionTmp ;
   private String sMode41 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZV8Pgmname ;
   private String Gx_emsg ;
   private java.util.Date Z719TBW03_LOCK_DATETIME ;
   private java.util.Date Z722TBW03_UPLOAD_DATETIME ;
   private java.util.Date Z726TBW03_DM_ARRIVAL_DATETIME ;
   private java.util.Date Z728TBW03_APPROVAL_DATETIME ;
   private java.util.Date Z732TBW03_INPUT_END_DATETIME ;
   private java.util.Date Z781TBW03_CRT_DATETIME ;
   private java.util.Date Z784TBW03_UPD_DATETIME ;
   private java.util.Date A719TBW03_LOCK_DATETIME ;
   private java.util.Date A722TBW03_UPLOAD_DATETIME ;
   private java.util.Date A726TBW03_DM_ARRIVAL_DATETIME ;
   private java.util.Date A728TBW03_APPROVAL_DATETIME ;
   private java.util.Date A732TBW03_INPUT_END_DATETIME ;
   private java.util.Date A781TBW03_CRT_DATETIME ;
   private java.util.Date A784TBW03_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean n120TBW03_SITE_ID ;
   private boolean n116TBW03_LOCK_USER_ID ;
   private boolean n117TBW03_UPLOAD_USER_ID ;
   private boolean n118TBW03_APPROVAL_USER_ID ;
   private boolean n119TBW03_INPUT_END_USER_ID ;
   private boolean n121TBW03_CRT_USER_ID ;
   private boolean n122TBW03_UPD_USER_ID ;
   private boolean wbErr ;
   private boolean n710TBW03_CRF_NM ;
   private boolean n711TBW03_CRF_SNM ;
   private boolean n712TBW03_CRF_ORDER ;
   private boolean n713TBW03_SITE_NM ;
   private boolean n714TBW03_SITE_RYAK_NM ;
   private boolean n715TBW03_OUTER_SUBJECT_ID ;
   private boolean n716TBW03_CRF_LATEST_VERSION ;
   private boolean n717TBW03_CRF_INPUT_LEVEL ;
   private boolean n718TBW03_LOCK_FLG ;
   private boolean n719TBW03_LOCK_DATETIME ;
   private boolean n720TBW03_LOCK_USER_NM ;
   private boolean n721TBW03_LOCK_AUTH_CD ;
   private boolean n722TBW03_UPLOAD_DATETIME ;
   private boolean n723TBW03_UPLOAD_USER_NM ;
   private boolean n724TBW03_UPLOAD_AUTH_CD ;
   private boolean n725TBW03_DM_ARRIVAL_FLG ;
   private boolean n726TBW03_DM_ARRIVAL_DATETIME ;
   private boolean n727TBW03_APPROVAL_FLG ;
   private boolean n728TBW03_APPROVAL_DATETIME ;
   private boolean n729TBW03_APPROVAL_USER_NM ;
   private boolean n730TBW03_APPROVAL_AUTH_CD ;
   private boolean n731TBW03_INPUT_END_FLG ;
   private boolean n732TBW03_INPUT_END_DATETIME ;
   private boolean n733TBW03_INPUT_END_USER_NM ;
   private boolean n734TBW03_INPUT_END_AUTH_CD ;
   private boolean n780TBW03_DEL_FLG ;
   private boolean n781TBW03_CRT_DATETIME ;
   private boolean n782TBW03_CRT_USER_NM ;
   private boolean n783TBW03_CRT_PROG_NM ;
   private boolean n784TBW03_UPD_DATETIME ;
   private boolean n785TBW03_UPD_USER_NM ;
   private boolean n786TBW03_UPD_PROG_NM ;
   private boolean n787TBW03_UPD_CNT ;
   private boolean Gx_longc ;
   private boolean toggleJsOutput ;
   private String Z110TBW03_SESSION_ID ;
   private String Z111TBW03_APP_ID ;
   private String Z112TBW03_DISP_DATETIME ;
   private String Z715TBW03_OUTER_SUBJECT_ID ;
   private String Z718TBW03_LOCK_FLG ;
   private String Z721TBW03_LOCK_AUTH_CD ;
   private String Z724TBW03_UPLOAD_AUTH_CD ;
   private String Z725TBW03_DM_ARRIVAL_FLG ;
   private String Z727TBW03_APPROVAL_FLG ;
   private String Z730TBW03_APPROVAL_AUTH_CD ;
   private String Z731TBW03_INPUT_END_FLG ;
   private String Z734TBW03_INPUT_END_AUTH_CD ;
   private String Z780TBW03_DEL_FLG ;
   private String Z783TBW03_CRT_PROG_NM ;
   private String Z786TBW03_UPD_PROG_NM ;
   private String Z120TBW03_SITE_ID ;
   private String Z116TBW03_LOCK_USER_ID ;
   private String Z117TBW03_UPLOAD_USER_ID ;
   private String Z118TBW03_APPROVAL_USER_ID ;
   private String Z119TBW03_INPUT_END_USER_ID ;
   private String Z121TBW03_CRT_USER_ID ;
   private String Z122TBW03_UPD_USER_ID ;
   private String A120TBW03_SITE_ID ;
   private String A116TBW03_LOCK_USER_ID ;
   private String A117TBW03_UPLOAD_USER_ID ;
   private String A118TBW03_APPROVAL_USER_ID ;
   private String A119TBW03_INPUT_END_USER_ID ;
   private String A121TBW03_CRT_USER_ID ;
   private String A122TBW03_UPD_USER_ID ;
   private String A110TBW03_SESSION_ID ;
   private String A111TBW03_APP_ID ;
   private String A112TBW03_DISP_DATETIME ;
   private String A710TBW03_CRF_NM ;
   private String A711TBW03_CRF_SNM ;
   private String A713TBW03_SITE_NM ;
   private String A714TBW03_SITE_RYAK_NM ;
   private String A715TBW03_OUTER_SUBJECT_ID ;
   private String A718TBW03_LOCK_FLG ;
   private String A720TBW03_LOCK_USER_NM ;
   private String A721TBW03_LOCK_AUTH_CD ;
   private String A723TBW03_UPLOAD_USER_NM ;
   private String A724TBW03_UPLOAD_AUTH_CD ;
   private String A725TBW03_DM_ARRIVAL_FLG ;
   private String A727TBW03_APPROVAL_FLG ;
   private String A729TBW03_APPROVAL_USER_NM ;
   private String A730TBW03_APPROVAL_AUTH_CD ;
   private String A731TBW03_INPUT_END_FLG ;
   private String A733TBW03_INPUT_END_USER_NM ;
   private String A734TBW03_INPUT_END_AUTH_CD ;
   private String A780TBW03_DEL_FLG ;
   private String A782TBW03_CRT_USER_NM ;
   private String A783TBW03_CRT_PROG_NM ;
   private String A785TBW03_UPD_USER_NM ;
   private String A786TBW03_UPD_PROG_NM ;
   private String AV7W_BC_FLG ;
   private String Z710TBW03_CRF_NM ;
   private String Z711TBW03_CRF_SNM ;
   private String Z713TBW03_SITE_NM ;
   private String Z714TBW03_SITE_RYAK_NM ;
   private String Z720TBW03_LOCK_USER_NM ;
   private String Z723TBW03_UPLOAD_USER_NM ;
   private String Z729TBW03_APPROVAL_USER_NM ;
   private String Z733TBW03_INPUT_END_USER_NM ;
   private String Z782TBW03_CRT_USER_NM ;
   private String Z785TBW03_UPD_USER_NM ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private String[] T001612_A110TBW03_SESSION_ID ;
   private String[] T001612_A111TBW03_APP_ID ;
   private String[] T001612_A112TBW03_DISP_DATETIME ;
   private int[] T001612_A114TBW03_SUBJECT_ID ;
   private String[] T001612_A710TBW03_CRF_NM ;
   private boolean[] T001612_n710TBW03_CRF_NM ;
   private String[] T001612_A711TBW03_CRF_SNM ;
   private boolean[] T001612_n711TBW03_CRF_SNM ;
   private int[] T001612_A712TBW03_CRF_ORDER ;
   private boolean[] T001612_n712TBW03_CRF_ORDER ;
   private String[] T001612_A713TBW03_SITE_NM ;
   private boolean[] T001612_n713TBW03_SITE_NM ;
   private String[] T001612_A714TBW03_SITE_RYAK_NM ;
   private boolean[] T001612_n714TBW03_SITE_RYAK_NM ;
   private String[] T001612_A715TBW03_OUTER_SUBJECT_ID ;
   private boolean[] T001612_n715TBW03_OUTER_SUBJECT_ID ;
   private short[] T001612_A716TBW03_CRF_LATEST_VERSION ;
   private boolean[] T001612_n716TBW03_CRF_LATEST_VERSION ;
   private byte[] T001612_A717TBW03_CRF_INPUT_LEVEL ;
   private boolean[] T001612_n717TBW03_CRF_INPUT_LEVEL ;
   private String[] T001612_A718TBW03_LOCK_FLG ;
   private boolean[] T001612_n718TBW03_LOCK_FLG ;
   private java.util.Date[] T001612_A719TBW03_LOCK_DATETIME ;
   private boolean[] T001612_n719TBW03_LOCK_DATETIME ;
   private String[] T001612_A720TBW03_LOCK_USER_NM ;
   private boolean[] T001612_n720TBW03_LOCK_USER_NM ;
   private String[] T001612_A721TBW03_LOCK_AUTH_CD ;
   private boolean[] T001612_n721TBW03_LOCK_AUTH_CD ;
   private java.util.Date[] T001612_A722TBW03_UPLOAD_DATETIME ;
   private boolean[] T001612_n722TBW03_UPLOAD_DATETIME ;
   private String[] T001612_A723TBW03_UPLOAD_USER_NM ;
   private boolean[] T001612_n723TBW03_UPLOAD_USER_NM ;
   private String[] T001612_A724TBW03_UPLOAD_AUTH_CD ;
   private boolean[] T001612_n724TBW03_UPLOAD_AUTH_CD ;
   private String[] T001612_A725TBW03_DM_ARRIVAL_FLG ;
   private boolean[] T001612_n725TBW03_DM_ARRIVAL_FLG ;
   private java.util.Date[] T001612_A726TBW03_DM_ARRIVAL_DATETIME ;
   private boolean[] T001612_n726TBW03_DM_ARRIVAL_DATETIME ;
   private String[] T001612_A727TBW03_APPROVAL_FLG ;
   private boolean[] T001612_n727TBW03_APPROVAL_FLG ;
   private java.util.Date[] T001612_A728TBW03_APPROVAL_DATETIME ;
   private boolean[] T001612_n728TBW03_APPROVAL_DATETIME ;
   private String[] T001612_A729TBW03_APPROVAL_USER_NM ;
   private boolean[] T001612_n729TBW03_APPROVAL_USER_NM ;
   private String[] T001612_A730TBW03_APPROVAL_AUTH_CD ;
   private boolean[] T001612_n730TBW03_APPROVAL_AUTH_CD ;
   private String[] T001612_A731TBW03_INPUT_END_FLG ;
   private boolean[] T001612_n731TBW03_INPUT_END_FLG ;
   private java.util.Date[] T001612_A732TBW03_INPUT_END_DATETIME ;
   private boolean[] T001612_n732TBW03_INPUT_END_DATETIME ;
   private String[] T001612_A733TBW03_INPUT_END_USER_NM ;
   private boolean[] T001612_n733TBW03_INPUT_END_USER_NM ;
   private String[] T001612_A734TBW03_INPUT_END_AUTH_CD ;
   private boolean[] T001612_n734TBW03_INPUT_END_AUTH_CD ;
   private String[] T001612_A780TBW03_DEL_FLG ;
   private boolean[] T001612_n780TBW03_DEL_FLG ;
   private java.util.Date[] T001612_A781TBW03_CRT_DATETIME ;
   private boolean[] T001612_n781TBW03_CRT_DATETIME ;
   private String[] T001612_A782TBW03_CRT_USER_NM ;
   private boolean[] T001612_n782TBW03_CRT_USER_NM ;
   private String[] T001612_A783TBW03_CRT_PROG_NM ;
   private boolean[] T001612_n783TBW03_CRT_PROG_NM ;
   private java.util.Date[] T001612_A784TBW03_UPD_DATETIME ;
   private boolean[] T001612_n784TBW03_UPD_DATETIME ;
   private String[] T001612_A785TBW03_UPD_USER_NM ;
   private boolean[] T001612_n785TBW03_UPD_USER_NM ;
   private String[] T001612_A786TBW03_UPD_PROG_NM ;
   private boolean[] T001612_n786TBW03_UPD_PROG_NM ;
   private long[] T001612_A787TBW03_UPD_CNT ;
   private boolean[] T001612_n787TBW03_UPD_CNT ;
   private long[] T001612_A113TBW03_STUDY_ID ;
   private short[] T001612_A115TBW03_CRF_ID ;
   private String[] T001612_A120TBW03_SITE_ID ;
   private boolean[] T001612_n120TBW03_SITE_ID ;
   private String[] T001612_A116TBW03_LOCK_USER_ID ;
   private boolean[] T001612_n116TBW03_LOCK_USER_ID ;
   private String[] T001612_A117TBW03_UPLOAD_USER_ID ;
   private boolean[] T001612_n117TBW03_UPLOAD_USER_ID ;
   private String[] T001612_A118TBW03_APPROVAL_USER_ID ;
   private boolean[] T001612_n118TBW03_APPROVAL_USER_ID ;
   private String[] T001612_A119TBW03_INPUT_END_USER_ID ;
   private boolean[] T001612_n119TBW03_INPUT_END_USER_ID ;
   private String[] T001612_A121TBW03_CRT_USER_ID ;
   private boolean[] T001612_n121TBW03_CRT_USER_ID ;
   private String[] T001612_A122TBW03_UPD_USER_ID ;
   private boolean[] T001612_n122TBW03_UPD_USER_ID ;
   private String[] T00164_A710TBW03_CRF_NM ;
   private boolean[] T00164_n710TBW03_CRF_NM ;
   private String[] T00164_A711TBW03_CRF_SNM ;
   private boolean[] T00164_n711TBW03_CRF_SNM ;
   private int[] T00164_A712TBW03_CRF_ORDER ;
   private boolean[] T00164_n712TBW03_CRF_ORDER ;
   private String[] T00165_A713TBW03_SITE_NM ;
   private boolean[] T00165_n713TBW03_SITE_NM ;
   private String[] T00165_A714TBW03_SITE_RYAK_NM ;
   private boolean[] T00165_n714TBW03_SITE_RYAK_NM ;
   private String[] T00166_A720TBW03_LOCK_USER_NM ;
   private boolean[] T00166_n720TBW03_LOCK_USER_NM ;
   private String[] T00167_A723TBW03_UPLOAD_USER_NM ;
   private boolean[] T00167_n723TBW03_UPLOAD_USER_NM ;
   private String[] T00168_A729TBW03_APPROVAL_USER_NM ;
   private boolean[] T00168_n729TBW03_APPROVAL_USER_NM ;
   private String[] T00169_A733TBW03_INPUT_END_USER_NM ;
   private boolean[] T00169_n733TBW03_INPUT_END_USER_NM ;
   private String[] T001610_A782TBW03_CRT_USER_NM ;
   private boolean[] T001610_n782TBW03_CRT_USER_NM ;
   private String[] T001611_A785TBW03_UPD_USER_NM ;
   private boolean[] T001611_n785TBW03_UPD_USER_NM ;
   private String[] T001613_A110TBW03_SESSION_ID ;
   private String[] T001613_A111TBW03_APP_ID ;
   private String[] T001613_A112TBW03_DISP_DATETIME ;
   private long[] T001613_A113TBW03_STUDY_ID ;
   private int[] T001613_A114TBW03_SUBJECT_ID ;
   private short[] T001613_A115TBW03_CRF_ID ;
   private String[] T00163_A110TBW03_SESSION_ID ;
   private String[] T00163_A111TBW03_APP_ID ;
   private String[] T00163_A112TBW03_DISP_DATETIME ;
   private int[] T00163_A114TBW03_SUBJECT_ID ;
   private String[] T00163_A715TBW03_OUTER_SUBJECT_ID ;
   private boolean[] T00163_n715TBW03_OUTER_SUBJECT_ID ;
   private short[] T00163_A716TBW03_CRF_LATEST_VERSION ;
   private boolean[] T00163_n716TBW03_CRF_LATEST_VERSION ;
   private byte[] T00163_A717TBW03_CRF_INPUT_LEVEL ;
   private boolean[] T00163_n717TBW03_CRF_INPUT_LEVEL ;
   private String[] T00163_A718TBW03_LOCK_FLG ;
   private boolean[] T00163_n718TBW03_LOCK_FLG ;
   private java.util.Date[] T00163_A719TBW03_LOCK_DATETIME ;
   private boolean[] T00163_n719TBW03_LOCK_DATETIME ;
   private String[] T00163_A721TBW03_LOCK_AUTH_CD ;
   private boolean[] T00163_n721TBW03_LOCK_AUTH_CD ;
   private java.util.Date[] T00163_A722TBW03_UPLOAD_DATETIME ;
   private boolean[] T00163_n722TBW03_UPLOAD_DATETIME ;
   private String[] T00163_A724TBW03_UPLOAD_AUTH_CD ;
   private boolean[] T00163_n724TBW03_UPLOAD_AUTH_CD ;
   private String[] T00163_A725TBW03_DM_ARRIVAL_FLG ;
   private boolean[] T00163_n725TBW03_DM_ARRIVAL_FLG ;
   private java.util.Date[] T00163_A726TBW03_DM_ARRIVAL_DATETIME ;
   private boolean[] T00163_n726TBW03_DM_ARRIVAL_DATETIME ;
   private String[] T00163_A727TBW03_APPROVAL_FLG ;
   private boolean[] T00163_n727TBW03_APPROVAL_FLG ;
   private java.util.Date[] T00163_A728TBW03_APPROVAL_DATETIME ;
   private boolean[] T00163_n728TBW03_APPROVAL_DATETIME ;
   private String[] T00163_A730TBW03_APPROVAL_AUTH_CD ;
   private boolean[] T00163_n730TBW03_APPROVAL_AUTH_CD ;
   private String[] T00163_A731TBW03_INPUT_END_FLG ;
   private boolean[] T00163_n731TBW03_INPUT_END_FLG ;
   private java.util.Date[] T00163_A732TBW03_INPUT_END_DATETIME ;
   private boolean[] T00163_n732TBW03_INPUT_END_DATETIME ;
   private String[] T00163_A734TBW03_INPUT_END_AUTH_CD ;
   private boolean[] T00163_n734TBW03_INPUT_END_AUTH_CD ;
   private String[] T00163_A780TBW03_DEL_FLG ;
   private boolean[] T00163_n780TBW03_DEL_FLG ;
   private java.util.Date[] T00163_A781TBW03_CRT_DATETIME ;
   private boolean[] T00163_n781TBW03_CRT_DATETIME ;
   private String[] T00163_A783TBW03_CRT_PROG_NM ;
   private boolean[] T00163_n783TBW03_CRT_PROG_NM ;
   private java.util.Date[] T00163_A784TBW03_UPD_DATETIME ;
   private boolean[] T00163_n784TBW03_UPD_DATETIME ;
   private String[] T00163_A786TBW03_UPD_PROG_NM ;
   private boolean[] T00163_n786TBW03_UPD_PROG_NM ;
   private long[] T00163_A787TBW03_UPD_CNT ;
   private boolean[] T00163_n787TBW03_UPD_CNT ;
   private long[] T00163_A113TBW03_STUDY_ID ;
   private short[] T00163_A115TBW03_CRF_ID ;
   private String[] T00163_A120TBW03_SITE_ID ;
   private boolean[] T00163_n120TBW03_SITE_ID ;
   private String[] T00163_A116TBW03_LOCK_USER_ID ;
   private boolean[] T00163_n116TBW03_LOCK_USER_ID ;
   private String[] T00163_A117TBW03_UPLOAD_USER_ID ;
   private boolean[] T00163_n117TBW03_UPLOAD_USER_ID ;
   private String[] T00163_A118TBW03_APPROVAL_USER_ID ;
   private boolean[] T00163_n118TBW03_APPROVAL_USER_ID ;
   private String[] T00163_A119TBW03_INPUT_END_USER_ID ;
   private boolean[] T00163_n119TBW03_INPUT_END_USER_ID ;
   private String[] T00163_A121TBW03_CRT_USER_ID ;
   private boolean[] T00163_n121TBW03_CRT_USER_ID ;
   private String[] T00163_A122TBW03_UPD_USER_ID ;
   private boolean[] T00163_n122TBW03_UPD_USER_ID ;
   private String[] T001614_A110TBW03_SESSION_ID ;
   private String[] T001614_A111TBW03_APP_ID ;
   private String[] T001614_A112TBW03_DISP_DATETIME ;
   private long[] T001614_A113TBW03_STUDY_ID ;
   private int[] T001614_A114TBW03_SUBJECT_ID ;
   private short[] T001614_A115TBW03_CRF_ID ;
   private String[] T001615_A110TBW03_SESSION_ID ;
   private String[] T001615_A111TBW03_APP_ID ;
   private String[] T001615_A112TBW03_DISP_DATETIME ;
   private long[] T001615_A113TBW03_STUDY_ID ;
   private int[] T001615_A114TBW03_SUBJECT_ID ;
   private short[] T001615_A115TBW03_CRF_ID ;
   private String[] T00162_A110TBW03_SESSION_ID ;
   private String[] T00162_A111TBW03_APP_ID ;
   private String[] T00162_A112TBW03_DISP_DATETIME ;
   private int[] T00162_A114TBW03_SUBJECT_ID ;
   private String[] T00162_A715TBW03_OUTER_SUBJECT_ID ;
   private boolean[] T00162_n715TBW03_OUTER_SUBJECT_ID ;
   private short[] T00162_A716TBW03_CRF_LATEST_VERSION ;
   private boolean[] T00162_n716TBW03_CRF_LATEST_VERSION ;
   private byte[] T00162_A717TBW03_CRF_INPUT_LEVEL ;
   private boolean[] T00162_n717TBW03_CRF_INPUT_LEVEL ;
   private String[] T00162_A718TBW03_LOCK_FLG ;
   private boolean[] T00162_n718TBW03_LOCK_FLG ;
   private java.util.Date[] T00162_A719TBW03_LOCK_DATETIME ;
   private boolean[] T00162_n719TBW03_LOCK_DATETIME ;
   private String[] T00162_A721TBW03_LOCK_AUTH_CD ;
   private boolean[] T00162_n721TBW03_LOCK_AUTH_CD ;
   private java.util.Date[] T00162_A722TBW03_UPLOAD_DATETIME ;
   private boolean[] T00162_n722TBW03_UPLOAD_DATETIME ;
   private String[] T00162_A724TBW03_UPLOAD_AUTH_CD ;
   private boolean[] T00162_n724TBW03_UPLOAD_AUTH_CD ;
   private String[] T00162_A725TBW03_DM_ARRIVAL_FLG ;
   private boolean[] T00162_n725TBW03_DM_ARRIVAL_FLG ;
   private java.util.Date[] T00162_A726TBW03_DM_ARRIVAL_DATETIME ;
   private boolean[] T00162_n726TBW03_DM_ARRIVAL_DATETIME ;
   private String[] T00162_A727TBW03_APPROVAL_FLG ;
   private boolean[] T00162_n727TBW03_APPROVAL_FLG ;
   private java.util.Date[] T00162_A728TBW03_APPROVAL_DATETIME ;
   private boolean[] T00162_n728TBW03_APPROVAL_DATETIME ;
   private String[] T00162_A730TBW03_APPROVAL_AUTH_CD ;
   private boolean[] T00162_n730TBW03_APPROVAL_AUTH_CD ;
   private String[] T00162_A731TBW03_INPUT_END_FLG ;
   private boolean[] T00162_n731TBW03_INPUT_END_FLG ;
   private java.util.Date[] T00162_A732TBW03_INPUT_END_DATETIME ;
   private boolean[] T00162_n732TBW03_INPUT_END_DATETIME ;
   private String[] T00162_A734TBW03_INPUT_END_AUTH_CD ;
   private boolean[] T00162_n734TBW03_INPUT_END_AUTH_CD ;
   private String[] T00162_A780TBW03_DEL_FLG ;
   private boolean[] T00162_n780TBW03_DEL_FLG ;
   private java.util.Date[] T00162_A781TBW03_CRT_DATETIME ;
   private boolean[] T00162_n781TBW03_CRT_DATETIME ;
   private String[] T00162_A783TBW03_CRT_PROG_NM ;
   private boolean[] T00162_n783TBW03_CRT_PROG_NM ;
   private java.util.Date[] T00162_A784TBW03_UPD_DATETIME ;
   private boolean[] T00162_n784TBW03_UPD_DATETIME ;
   private String[] T00162_A786TBW03_UPD_PROG_NM ;
   private boolean[] T00162_n786TBW03_UPD_PROG_NM ;
   private long[] T00162_A787TBW03_UPD_CNT ;
   private boolean[] T00162_n787TBW03_UPD_CNT ;
   private long[] T00162_A113TBW03_STUDY_ID ;
   private short[] T00162_A115TBW03_CRF_ID ;
   private String[] T00162_A120TBW03_SITE_ID ;
   private boolean[] T00162_n120TBW03_SITE_ID ;
   private String[] T00162_A116TBW03_LOCK_USER_ID ;
   private boolean[] T00162_n116TBW03_LOCK_USER_ID ;
   private String[] T00162_A117TBW03_UPLOAD_USER_ID ;
   private boolean[] T00162_n117TBW03_UPLOAD_USER_ID ;
   private String[] T00162_A118TBW03_APPROVAL_USER_ID ;
   private boolean[] T00162_n118TBW03_APPROVAL_USER_ID ;
   private String[] T00162_A119TBW03_INPUT_END_USER_ID ;
   private boolean[] T00162_n119TBW03_INPUT_END_USER_ID ;
   private String[] T00162_A121TBW03_CRT_USER_ID ;
   private boolean[] T00162_n121TBW03_CRT_USER_ID ;
   private String[] T00162_A122TBW03_UPD_USER_ID ;
   private boolean[] T00162_n122TBW03_UPD_USER_ID ;
   private String[] T001619_A710TBW03_CRF_NM ;
   private boolean[] T001619_n710TBW03_CRF_NM ;
   private String[] T001619_A711TBW03_CRF_SNM ;
   private boolean[] T001619_n711TBW03_CRF_SNM ;
   private int[] T001619_A712TBW03_CRF_ORDER ;
   private boolean[] T001619_n712TBW03_CRF_ORDER ;
   private String[] T001620_A713TBW03_SITE_NM ;
   private boolean[] T001620_n713TBW03_SITE_NM ;
   private String[] T001620_A714TBW03_SITE_RYAK_NM ;
   private boolean[] T001620_n714TBW03_SITE_RYAK_NM ;
   private String[] T001621_A720TBW03_LOCK_USER_NM ;
   private boolean[] T001621_n720TBW03_LOCK_USER_NM ;
   private String[] T001622_A723TBW03_UPLOAD_USER_NM ;
   private boolean[] T001622_n723TBW03_UPLOAD_USER_NM ;
   private String[] T001623_A729TBW03_APPROVAL_USER_NM ;
   private boolean[] T001623_n729TBW03_APPROVAL_USER_NM ;
   private String[] T001624_A733TBW03_INPUT_END_USER_NM ;
   private boolean[] T001624_n733TBW03_INPUT_END_USER_NM ;
   private String[] T001625_A782TBW03_CRT_USER_NM ;
   private boolean[] T001625_n782TBW03_CRT_USER_NM ;
   private String[] T001626_A785TBW03_UPD_USER_NM ;
   private boolean[] T001626_n785TBW03_UPD_USER_NM ;
   private String[] T001627_A110TBW03_SESSION_ID ;
   private String[] T001627_A111TBW03_APP_ID ;
   private String[] T001627_A112TBW03_DISP_DATETIME ;
   private long[] T001627_A113TBW03_STUDY_ID ;
   private int[] T001627_A114TBW03_SUBJECT_ID ;
   private short[] T001627_A115TBW03_CRF_ID ;
}

final  class tbw03_crf_search__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00162", "SELECT `TBW03_SESSION_ID`, `TBW03_APP_ID`, `TBW03_DISP_DATETIME`, `TBW03_SUBJECT_ID`, `TBW03_OUTER_SUBJECT_ID`, `TBW03_CRF_LATEST_VERSION`, `TBW03_CRF_INPUT_LEVEL`, `TBW03_LOCK_FLG`, `TBW03_LOCK_DATETIME`, `TBW03_LOCK_AUTH_CD`, `TBW03_UPLOAD_DATETIME`, `TBW03_UPLOAD_AUTH_CD`, `TBW03_DM_ARRIVAL_FLG`, `TBW03_DM_ARRIVAL_DATETIME`, `TBW03_APPROVAL_FLG`, `TBW03_APPROVAL_DATETIME`, `TBW03_APPROVAL_AUTH_CD`, `TBW03_INPUT_END_FLG`, `TBW03_INPUT_END_DATETIME`, `TBW03_INPUT_END_AUTH_CD`, `TBW03_DEL_FLG`, `TBW03_CRT_DATETIME`, `TBW03_CRT_PROG_NM`, `TBW03_UPD_DATETIME`, `TBW03_UPD_PROG_NM`, `TBW03_UPD_CNT`, `TBW03_STUDY_ID` AS TBW03_STUDY_ID, `TBW03_CRF_ID` AS TBW03_CRF_ID, `TBW03_SITE_ID` AS TBW03_SITE_ID, `TBW03_LOCK_USER_ID` AS TBW03_LOCK_USER_ID, `TBW03_UPLOAD_USER_ID` AS TBW03_UPLOAD_USER_ID, `TBW03_APPROVAL_USER_ID` AS TBW03_APPROVAL_USER_ID, `TBW03_INPUT_END_USER_ID` AS TBW03_INPUT_END_USER_ID, `TBW03_CRT_USER_ID` AS TBW03_CRT_USER_ID, `TBW03_UPD_USER_ID` AS TBW03_UPD_USER_ID FROM `TBW03_CRF_SEARCH` WHERE `TBW03_SESSION_ID` = ? AND `TBW03_APP_ID` = ? AND `TBW03_DISP_DATETIME` = ? AND `TBW03_STUDY_ID` = ? AND `TBW03_SUBJECT_ID` = ? AND `TBW03_CRF_ID` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00163", "SELECT `TBW03_SESSION_ID`, `TBW03_APP_ID`, `TBW03_DISP_DATETIME`, `TBW03_SUBJECT_ID`, `TBW03_OUTER_SUBJECT_ID`, `TBW03_CRF_LATEST_VERSION`, `TBW03_CRF_INPUT_LEVEL`, `TBW03_LOCK_FLG`, `TBW03_LOCK_DATETIME`, `TBW03_LOCK_AUTH_CD`, `TBW03_UPLOAD_DATETIME`, `TBW03_UPLOAD_AUTH_CD`, `TBW03_DM_ARRIVAL_FLG`, `TBW03_DM_ARRIVAL_DATETIME`, `TBW03_APPROVAL_FLG`, `TBW03_APPROVAL_DATETIME`, `TBW03_APPROVAL_AUTH_CD`, `TBW03_INPUT_END_FLG`, `TBW03_INPUT_END_DATETIME`, `TBW03_INPUT_END_AUTH_CD`, `TBW03_DEL_FLG`, `TBW03_CRT_DATETIME`, `TBW03_CRT_PROG_NM`, `TBW03_UPD_DATETIME`, `TBW03_UPD_PROG_NM`, `TBW03_UPD_CNT`, `TBW03_STUDY_ID` AS TBW03_STUDY_ID, `TBW03_CRF_ID` AS TBW03_CRF_ID, `TBW03_SITE_ID` AS TBW03_SITE_ID, `TBW03_LOCK_USER_ID` AS TBW03_LOCK_USER_ID, `TBW03_UPLOAD_USER_ID` AS TBW03_UPLOAD_USER_ID, `TBW03_APPROVAL_USER_ID` AS TBW03_APPROVAL_USER_ID, `TBW03_INPUT_END_USER_ID` AS TBW03_INPUT_END_USER_ID, `TBW03_CRT_USER_ID` AS TBW03_CRT_USER_ID, `TBW03_UPD_USER_ID` AS TBW03_UPD_USER_ID FROM `TBW03_CRF_SEARCH` WHERE `TBW03_SESSION_ID` = ? AND `TBW03_APP_ID` = ? AND `TBW03_DISP_DATETIME` = ? AND `TBW03_STUDY_ID` = ? AND `TBW03_SUBJECT_ID` = ? AND `TBW03_CRF_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00164", "SELECT `TBM31_CRF_NM` AS TBW03_CRF_NM, `TBM31_CRF_SNM` AS TBW03_CRF_SNM, `TBM31_ORDER` AS TBW03_CRF_ORDER FROM `TBM31_CRF` WHERE `TBM31_STUDY_ID` = ? AND `TBM31_CRF_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00165", "SELECT `TAM08_SITE_NM` AS TBW03_SITE_NM, `TAM08_SITE_SNM` AS TBW03_SITE_RYAK_NM FROM `TAM08_SITE` WHERE `TAM08_SITE_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00166", "SELECT `TAM07_USER_NM` AS TBW03_LOCK_USER_NM FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00167", "SELECT `TAM07_USER_NM` AS TBW03_UPLOAD_USER_NM FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00168", "SELECT `TAM07_USER_NM` AS TBW03_APPROVAL_USER_NM FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00169", "SELECT `TAM07_USER_NM` AS TBW03_INPUT_END_USER_NM FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001610", "SELECT `TAM07_USER_NM` AS TBW03_CRT_USER_NM FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001611", "SELECT `TAM07_USER_NM` AS TBW03_UPD_USER_NM FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001612", "SELECT TM1.`TBW03_SESSION_ID`, TM1.`TBW03_APP_ID`, TM1.`TBW03_DISP_DATETIME`, TM1.`TBW03_SUBJECT_ID`, T2.`TBM31_CRF_NM` AS TBW03_CRF_NM, T2.`TBM31_CRF_SNM` AS TBW03_CRF_SNM, T2.`TBM31_ORDER` AS TBW03_CRF_ORDER, T3.`TAM08_SITE_NM` AS TBW03_SITE_NM, T3.`TAM08_SITE_SNM` AS TBW03_SITE_RYAK_NM, TM1.`TBW03_OUTER_SUBJECT_ID`, TM1.`TBW03_CRF_LATEST_VERSION`, TM1.`TBW03_CRF_INPUT_LEVEL`, TM1.`TBW03_LOCK_FLG`, TM1.`TBW03_LOCK_DATETIME`, T4.`TAM07_USER_NM` AS TBW03_LOCK_USER_NM, TM1.`TBW03_LOCK_AUTH_CD`, TM1.`TBW03_UPLOAD_DATETIME`, T5.`TAM07_USER_NM` AS TBW03_UPLOAD_USER_NM, TM1.`TBW03_UPLOAD_AUTH_CD`, TM1.`TBW03_DM_ARRIVAL_FLG`, TM1.`TBW03_DM_ARRIVAL_DATETIME`, TM1.`TBW03_APPROVAL_FLG`, TM1.`TBW03_APPROVAL_DATETIME`, T6.`TAM07_USER_NM` AS TBW03_APPROVAL_USER_NM, TM1.`TBW03_APPROVAL_AUTH_CD`, TM1.`TBW03_INPUT_END_FLG`, TM1.`TBW03_INPUT_END_DATETIME`, T7.`TAM07_USER_NM` AS TBW03_INPUT_END_USER_NM, TM1.`TBW03_INPUT_END_AUTH_CD`, TM1.`TBW03_DEL_FLG`, TM1.`TBW03_CRT_DATETIME`, T8.`TAM07_USER_NM` AS TBW03_CRT_USER_NM, TM1.`TBW03_CRT_PROG_NM`, TM1.`TBW03_UPD_DATETIME`, T9.`TAM07_USER_NM` AS TBW03_UPD_USER_NM, TM1.`TBW03_UPD_PROG_NM`, TM1.`TBW03_UPD_CNT`, TM1.`TBW03_STUDY_ID` AS TBW03_STUDY_ID, TM1.`TBW03_CRF_ID` AS TBW03_CRF_ID, TM1.`TBW03_SITE_ID` AS TBW03_SITE_ID, TM1.`TBW03_LOCK_USER_ID` AS TBW03_LOCK_USER_ID, TM1.`TBW03_UPLOAD_USER_ID` AS TBW03_UPLOAD_USER_ID, TM1.`TBW03_APPROVAL_USER_ID` AS TBW03_APPROVAL_USER_ID, TM1.`TBW03_INPUT_END_USER_ID` AS TBW03_INPUT_END_USER_ID, TM1.`TBW03_CRT_USER_ID` AS TBW03_CRT_USER_ID, TM1.`TBW03_UPD_USER_ID` AS TBW03_UPD_USER_ID FROM ((((((((`TBW03_CRF_SEARCH` TM1 INNER JOIN `TBM31_CRF` T2 ON T2.`TBM31_STUDY_ID` = TM1.`TBW03_STUDY_ID` AND T2.`TBM31_CRF_ID` = TM1.`TBW03_CRF_ID`) LEFT JOIN `TAM08_SITE` T3 ON T3.`TAM08_SITE_ID` = TM1.`TBW03_SITE_ID`) LEFT JOIN `TAM07_USER` T4 ON T4.`TAM07_USER_ID` = TM1.`TBW03_LOCK_USER_ID`) LEFT JOIN `TAM07_USER` T5 ON T5.`TAM07_USER_ID` = TM1.`TBW03_UPLOAD_USER_ID`) LEFT JOIN `TAM07_USER` T6 ON T6.`TAM07_USER_ID` = TM1.`TBW03_APPROVAL_USER_ID`) LEFT JOIN `TAM07_USER` T7 ON T7.`TAM07_USER_ID` = TM1.`TBW03_INPUT_END_USER_ID`) LEFT JOIN `TAM07_USER` T8 ON T8.`TAM07_USER_ID` = TM1.`TBW03_CRT_USER_ID`) LEFT JOIN `TAM07_USER` T9 ON T9.`TAM07_USER_ID` = TM1.`TBW03_UPD_USER_ID`) WHERE TM1.`TBW03_SESSION_ID` = ? and TM1.`TBW03_APP_ID` = ? and TM1.`TBW03_DISP_DATETIME` = ? and TM1.`TBW03_STUDY_ID` = ? and TM1.`TBW03_SUBJECT_ID` = ? and TM1.`TBW03_CRF_ID` = ? ORDER BY TM1.`TBW03_SESSION_ID`, TM1.`TBW03_APP_ID`, TM1.`TBW03_DISP_DATETIME`, TM1.`TBW03_STUDY_ID`, TM1.`TBW03_SUBJECT_ID`, TM1.`TBW03_CRF_ID` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T001613", "SELECT `TBW03_SESSION_ID`, `TBW03_APP_ID`, `TBW03_DISP_DATETIME`, `TBW03_STUDY_ID` AS TBW03_STUDY_ID, `TBW03_SUBJECT_ID`, `TBW03_CRF_ID` AS TBW03_CRF_ID FROM `TBW03_CRF_SEARCH` WHERE `TBW03_SESSION_ID` = ? AND `TBW03_APP_ID` = ? AND `TBW03_DISP_DATETIME` = ? AND `TBW03_STUDY_ID` = ? AND `TBW03_SUBJECT_ID` = ? AND `TBW03_CRF_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001614", "SELECT `TBW03_SESSION_ID`, `TBW03_APP_ID`, `TBW03_DISP_DATETIME`, `TBW03_STUDY_ID` AS TBW03_STUDY_ID, `TBW03_SUBJECT_ID`, `TBW03_CRF_ID` AS TBW03_CRF_ID FROM `TBW03_CRF_SEARCH` WHERE ( `TBW03_SESSION_ID` > ? or `TBW03_SESSION_ID` = ? and `TBW03_APP_ID` > ? or `TBW03_APP_ID` = ? and `TBW03_SESSION_ID` = ? and `TBW03_DISP_DATETIME` > ? or `TBW03_DISP_DATETIME` = ? and `TBW03_APP_ID` = ? and `TBW03_SESSION_ID` = ? and `TBW03_STUDY_ID` > ? or `TBW03_STUDY_ID` = ? and `TBW03_DISP_DATETIME` = ? and `TBW03_APP_ID` = ? and `TBW03_SESSION_ID` = ? and `TBW03_SUBJECT_ID` > ? or `TBW03_SUBJECT_ID` = ? and `TBW03_STUDY_ID` = ? and `TBW03_DISP_DATETIME` = ? and `TBW03_APP_ID` = ? and `TBW03_SESSION_ID` = ? and `TBW03_CRF_ID` > ?) ORDER BY `TBW03_SESSION_ID`, `TBW03_APP_ID`, `TBW03_DISP_DATETIME`, `TBW03_STUDY_ID`, `TBW03_SUBJECT_ID`, `TBW03_CRF_ID`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T001615", "SELECT `TBW03_SESSION_ID`, `TBW03_APP_ID`, `TBW03_DISP_DATETIME`, `TBW03_STUDY_ID` AS TBW03_STUDY_ID, `TBW03_SUBJECT_ID`, `TBW03_CRF_ID` AS TBW03_CRF_ID FROM `TBW03_CRF_SEARCH` WHERE ( `TBW03_SESSION_ID` < ? or `TBW03_SESSION_ID` = ? and `TBW03_APP_ID` < ? or `TBW03_APP_ID` = ? and `TBW03_SESSION_ID` = ? and `TBW03_DISP_DATETIME` < ? or `TBW03_DISP_DATETIME` = ? and `TBW03_APP_ID` = ? and `TBW03_SESSION_ID` = ? and `TBW03_STUDY_ID` < ? or `TBW03_STUDY_ID` = ? and `TBW03_DISP_DATETIME` = ? and `TBW03_APP_ID` = ? and `TBW03_SESSION_ID` = ? and `TBW03_SUBJECT_ID` < ? or `TBW03_SUBJECT_ID` = ? and `TBW03_STUDY_ID` = ? and `TBW03_DISP_DATETIME` = ? and `TBW03_APP_ID` = ? and `TBW03_SESSION_ID` = ? and `TBW03_CRF_ID` < ?) ORDER BY `TBW03_SESSION_ID` DESC, `TBW03_APP_ID` DESC, `TBW03_DISP_DATETIME` DESC, `TBW03_STUDY_ID` DESC, `TBW03_SUBJECT_ID` DESC, `TBW03_CRF_ID` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T001616", "INSERT INTO `TBW03_CRF_SEARCH`(`TBW03_SESSION_ID`, `TBW03_APP_ID`, `TBW03_DISP_DATETIME`, `TBW03_SUBJECT_ID`, `TBW03_OUTER_SUBJECT_ID`, `TBW03_CRF_LATEST_VERSION`, `TBW03_CRF_INPUT_LEVEL`, `TBW03_LOCK_FLG`, `TBW03_LOCK_DATETIME`, `TBW03_LOCK_AUTH_CD`, `TBW03_UPLOAD_DATETIME`, `TBW03_UPLOAD_AUTH_CD`, `TBW03_DM_ARRIVAL_FLG`, `TBW03_DM_ARRIVAL_DATETIME`, `TBW03_APPROVAL_FLG`, `TBW03_APPROVAL_DATETIME`, `TBW03_APPROVAL_AUTH_CD`, `TBW03_INPUT_END_FLG`, `TBW03_INPUT_END_DATETIME`, `TBW03_INPUT_END_AUTH_CD`, `TBW03_DEL_FLG`, `TBW03_CRT_DATETIME`, `TBW03_CRT_PROG_NM`, `TBW03_UPD_DATETIME`, `TBW03_UPD_PROG_NM`, `TBW03_UPD_CNT`, `TBW03_STUDY_ID`, `TBW03_CRF_ID`, `TBW03_SITE_ID`, `TBW03_LOCK_USER_ID`, `TBW03_UPLOAD_USER_ID`, `TBW03_APPROVAL_USER_ID`, `TBW03_INPUT_END_USER_ID`, `TBW03_CRT_USER_ID`, `TBW03_UPD_USER_ID`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T001617", "UPDATE `TBW03_CRF_SEARCH` SET `TBW03_OUTER_SUBJECT_ID`=?, `TBW03_CRF_LATEST_VERSION`=?, `TBW03_CRF_INPUT_LEVEL`=?, `TBW03_LOCK_FLG`=?, `TBW03_LOCK_DATETIME`=?, `TBW03_LOCK_AUTH_CD`=?, `TBW03_UPLOAD_DATETIME`=?, `TBW03_UPLOAD_AUTH_CD`=?, `TBW03_DM_ARRIVAL_FLG`=?, `TBW03_DM_ARRIVAL_DATETIME`=?, `TBW03_APPROVAL_FLG`=?, `TBW03_APPROVAL_DATETIME`=?, `TBW03_APPROVAL_AUTH_CD`=?, `TBW03_INPUT_END_FLG`=?, `TBW03_INPUT_END_DATETIME`=?, `TBW03_INPUT_END_AUTH_CD`=?, `TBW03_DEL_FLG`=?, `TBW03_CRT_DATETIME`=?, `TBW03_CRT_PROG_NM`=?, `TBW03_UPD_DATETIME`=?, `TBW03_UPD_PROG_NM`=?, `TBW03_UPD_CNT`=?, `TBW03_SITE_ID`=?, `TBW03_LOCK_USER_ID`=?, `TBW03_UPLOAD_USER_ID`=?, `TBW03_APPROVAL_USER_ID`=?, `TBW03_INPUT_END_USER_ID`=?, `TBW03_CRT_USER_ID`=?, `TBW03_UPD_USER_ID`=?  WHERE `TBW03_SESSION_ID` = ? AND `TBW03_APP_ID` = ? AND `TBW03_DISP_DATETIME` = ? AND `TBW03_STUDY_ID` = ? AND `TBW03_SUBJECT_ID` = ? AND `TBW03_CRF_ID` = ?", GX_NOMASK)
         ,new UpdateCursor("T001618", "DELETE FROM `TBW03_CRF_SEARCH`  WHERE `TBW03_SESSION_ID` = ? AND `TBW03_APP_ID` = ? AND `TBW03_DISP_DATETIME` = ? AND `TBW03_STUDY_ID` = ? AND `TBW03_SUBJECT_ID` = ? AND `TBW03_CRF_ID` = ?", GX_NOMASK)
         ,new ForEachCursor("T001619", "SELECT `TBM31_CRF_NM` AS TBW03_CRF_NM, `TBM31_CRF_SNM` AS TBW03_CRF_SNM, `TBM31_ORDER` AS TBW03_CRF_ORDER FROM `TBM31_CRF` WHERE `TBM31_STUDY_ID` = ? AND `TBM31_CRF_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001620", "SELECT `TAM08_SITE_NM` AS TBW03_SITE_NM, `TAM08_SITE_SNM` AS TBW03_SITE_RYAK_NM FROM `TAM08_SITE` WHERE `TAM08_SITE_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001621", "SELECT `TAM07_USER_NM` AS TBW03_LOCK_USER_NM FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001622", "SELECT `TAM07_USER_NM` AS TBW03_UPLOAD_USER_NM FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001623", "SELECT `TAM07_USER_NM` AS TBW03_APPROVAL_USER_NM FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001624", "SELECT `TAM07_USER_NM` AS TBW03_INPUT_END_USER_NM FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001625", "SELECT `TAM07_USER_NM` AS TBW03_CRT_USER_NM FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001626", "SELECT `TAM07_USER_NM` AS TBW03_UPD_USER_NM FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001627", "SELECT `TBW03_SESSION_ID`, `TBW03_APP_ID`, `TBW03_DISP_DATETIME`, `TBW03_STUDY_ID` AS TBW03_STUDY_ID, `TBW03_SUBJECT_ID`, `TBW03_CRF_ID` AS TBW03_CRF_ID FROM `TBW03_CRF_SEARCH` ORDER BY `TBW03_SESSION_ID`, `TBW03_APP_ID`, `TBW03_DISP_DATETIME`, `TBW03_STUDY_ID`, `TBW03_SUBJECT_ID`, `TBW03_CRF_ID` ",true, GX_NOMASK, false, this,100,0,false )
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
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(7) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(9) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDateTime(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDateTime(14) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[26])[0] = rslt.getGXDateTime(16) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[32])[0] = rslt.getGXDateTime(19) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[38])[0] = rslt.getGXDateTime(22) ;
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[42])[0] = rslt.getGXDateTime(24) ;
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((long[]) buf[46])[0] = rslt.getLong(26) ;
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((long[]) buf[48])[0] = rslt.getLong(27) ;
               ((short[]) buf[49])[0] = rslt.getShort(28) ;
               ((String[]) buf[50])[0] = rslt.getVarchar(29) ;
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((String[]) buf[52])[0] = rslt.getVarchar(30) ;
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((String[]) buf[54])[0] = rslt.getVarchar(31) ;
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((String[]) buf[56])[0] = rslt.getVarchar(32) ;
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((String[]) buf[58])[0] = rslt.getVarchar(33) ;
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((String[]) buf[60])[0] = rslt.getVarchar(34) ;
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((String[]) buf[62])[0] = rslt.getVarchar(35) ;
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(7) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(9) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDateTime(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDateTime(14) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[26])[0] = rslt.getGXDateTime(16) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[32])[0] = rslt.getGXDateTime(19) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[38])[0] = rslt.getGXDateTime(22) ;
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[42])[0] = rslt.getGXDateTime(24) ;
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((long[]) buf[46])[0] = rslt.getLong(26) ;
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((long[]) buf[48])[0] = rslt.getLong(27) ;
               ((short[]) buf[49])[0] = rslt.getShort(28) ;
               ((String[]) buf[50])[0] = rslt.getVarchar(29) ;
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((String[]) buf[52])[0] = rslt.getVarchar(30) ;
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((String[]) buf[54])[0] = rslt.getVarchar(31) ;
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((String[]) buf[56])[0] = rslt.getVarchar(32) ;
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((String[]) buf[58])[0] = rslt.getVarchar(33) ;
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((String[]) buf[60])[0] = rslt.getVarchar(34) ;
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((String[]) buf[62])[0] = rslt.getVarchar(35) ;
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(7) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((byte[]) buf[18])[0] = rslt.getByte(12) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDateTime(14) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[28])[0] = rslt.getGXDateTime(17) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[36])[0] = rslt.getGXDateTime(21) ;
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[40])[0] = rslt.getGXDateTime(23) ;
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[48])[0] = rslt.getGXDateTime(27) ;
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((String[]) buf[50])[0] = rslt.getVarchar(28) ;
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((String[]) buf[52])[0] = rslt.getVarchar(29) ;
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((String[]) buf[54])[0] = rslt.getVarchar(30) ;
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[56])[0] = rslt.getGXDateTime(31) ;
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((String[]) buf[58])[0] = rslt.getVarchar(32) ;
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((String[]) buf[60])[0] = rslt.getVarchar(33) ;
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[62])[0] = rslt.getGXDateTime(34) ;
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((String[]) buf[64])[0] = rslt.getVarchar(35) ;
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((String[]) buf[66])[0] = rslt.getVarchar(36) ;
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((long[]) buf[68])[0] = rslt.getLong(37) ;
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((long[]) buf[70])[0] = rslt.getLong(38) ;
               ((short[]) buf[71])[0] = rslt.getShort(39) ;
               ((String[]) buf[72])[0] = rslt.getVarchar(40) ;
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((String[]) buf[74])[0] = rslt.getVarchar(41) ;
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((String[]) buf[76])[0] = rslt.getVarchar(42) ;
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((String[]) buf[78])[0] = rslt.getVarchar(43) ;
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((String[]) buf[80])[0] = rslt.getVarchar(44) ;
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((String[]) buf[82])[0] = rslt.getVarchar(45) ;
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((String[]) buf[84])[0] = rslt.getVarchar(46) ;
               ((boolean[]) buf[85])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
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
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 20, false);
               }
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 128, false);
               }
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 128, false);
               }
               return;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 128, false);
               }
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 128, false);
               }
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 128, false);
               }
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 128, false);
               }
               return;
            case 10 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 11 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 12 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 50, false);
               stmt.setVarchar(3, (String)parms[2], 7, false);
               stmt.setVarchar(4, (String)parms[3], 7, false);
               stmt.setVarchar(5, (String)parms[4], 50, false);
               stmt.setVarchar(6, (String)parms[5], 14, false);
               stmt.setVarchar(7, (String)parms[6], 14, false);
               stmt.setVarchar(8, (String)parms[7], 7, false);
               stmt.setVarchar(9, (String)parms[8], 50, false);
               stmt.setLong(10, ((Number) parms[9]).longValue());
               stmt.setLong(11, ((Number) parms[10]).longValue());
               stmt.setVarchar(12, (String)parms[11], 14, false);
               stmt.setVarchar(13, (String)parms[12], 7, false);
               stmt.setVarchar(14, (String)parms[13], 50, false);
               stmt.setInt(15, ((Number) parms[14]).intValue());
               stmt.setInt(16, ((Number) parms[15]).intValue());
               stmt.setLong(17, ((Number) parms[16]).longValue());
               stmt.setVarchar(18, (String)parms[17], 14, false);
               stmt.setVarchar(19, (String)parms[18], 7, false);
               stmt.setVarchar(20, (String)parms[19], 50, false);
               stmt.setShort(21, ((Number) parms[20]).shortValue());
               return;
            case 13 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 50, false);
               stmt.setVarchar(3, (String)parms[2], 7, false);
               stmt.setVarchar(4, (String)parms[3], 7, false);
               stmt.setVarchar(5, (String)parms[4], 50, false);
               stmt.setVarchar(6, (String)parms[5], 14, false);
               stmt.setVarchar(7, (String)parms[6], 14, false);
               stmt.setVarchar(8, (String)parms[7], 7, false);
               stmt.setVarchar(9, (String)parms[8], 50, false);
               stmt.setLong(10, ((Number) parms[9]).longValue());
               stmt.setLong(11, ((Number) parms[10]).longValue());
               stmt.setVarchar(12, (String)parms[11], 14, false);
               stmt.setVarchar(13, (String)parms[12], 7, false);
               stmt.setVarchar(14, (String)parms[13], 50, false);
               stmt.setInt(15, ((Number) parms[14]).intValue());
               stmt.setInt(16, ((Number) parms[15]).intValue());
               stmt.setLong(17, ((Number) parms[16]).longValue());
               stmt.setVarchar(18, (String)parms[17], 14, false);
               stmt.setVarchar(19, (String)parms[18], 7, false);
               stmt.setVarchar(20, (String)parms[19], 50, false);
               stmt.setShort(21, ((Number) parms[20]).shortValue());
               return;
            case 14 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[5], 6);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[7]).shortValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[9]).byteValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[11], 1);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(9, (java.util.Date)parms[13], false);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[15], 2);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(11, (java.util.Date)parms[17], false);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[19], 2);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[21], 1);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(14, (java.util.Date)parms[23], false);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[25], 1);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(16, (java.util.Date)parms[27], false);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[29], 2);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[31], 1);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(19, (java.util.Date)parms[33], false);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[35], 2);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[37], 1);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(22, (java.util.Date)parms[39], false);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(23, (String)parms[41], 40);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(24, (java.util.Date)parms[43], false);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(25, (String)parms[45], 40);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(26, ((Number) parms[47]).longValue());
               }
               stmt.setLong(27, ((Number) parms[48]).longValue());
               stmt.setShort(28, ((Number) parms[49]).shortValue());
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(29, (String)parms[51], 20);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(30, (String)parms[53], 128);
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(31, (String)parms[55], 128);
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(32, (String)parms[57], 128);
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(33, (String)parms[59], 128);
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(34, (String)parms[61], 128);
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(35, (String)parms[63], 128);
               }
               return;
            case 15 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 6);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
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
                  stmt.setNull( 5 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(5, (java.util.Date)parms[9], false);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[11], 2);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(7, (java.util.Date)parms[13], false);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[15], 2);
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
                  stmt.setNull( 10 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(10, (java.util.Date)parms[19], false);
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
                  stmt.setNull( 12 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(12, (java.util.Date)parms[23], false);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[25], 2);
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
                  stmt.setVarchar(16, (String)parms[31], 2);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[33], 1);
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
                  stmt.setVarchar(19, (String)parms[37], 40);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(20, (java.util.Date)parms[39], false);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[41], 40);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(22, ((Number) parms[43]).longValue());
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(23, (String)parms[45], 20);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(24, (String)parms[47], 128);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(25, (String)parms[49], 128);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(26, (String)parms[51], 128);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(27, (String)parms[53], 128);
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(28, (String)parms[55], 128);
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(29, (String)parms[57], 128);
               }
               stmt.setVarchar(30, (String)parms[58], 50, false);
               stmt.setVarchar(31, (String)parms[59], 7, false);
               stmt.setVarchar(32, (String)parms[60], 14, false);
               stmt.setLong(33, ((Number) parms[61]).longValue());
               stmt.setInt(34, ((Number) parms[62]).intValue());
               stmt.setShort(35, ((Number) parms[63]).shortValue());
               return;
            case 16 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 17 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 18 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 20, false);
               }
               return;
            case 19 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 128, false);
               }
               return;
            case 20 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 128, false);
               }
               return;
            case 21 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 128, false);
               }
               return;
            case 22 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 128, false);
               }
               return;
            case 23 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 128, false);
               }
               return;
            case 24 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 128, false);
               }
               return;
      }
   }

}

