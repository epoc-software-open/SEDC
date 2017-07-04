/*
               File: tbw03_crf_search_impl
        Description: CRF検索ワーク
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:56:42.97
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_9") == 0 )
      {
         A628TBW03_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
         httpContext.ajax_rsp_assign_attri("", false, "A628TBW03_STUDY_ID", GXutil.ltrim( GXutil.str( A628TBW03_STUDY_ID, 10, 0)));
         A630TBW03_CRF_ID = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A630TBW03_CRF_ID", GXutil.ltrim( GXutil.str( A630TBW03_CRF_ID, 4, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_9( A628TBW03_STUDY_ID, A630TBW03_CRF_ID) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_10") == 0 )
      {
         A634TBW03_SITE_ID = httpContext.GetNextPar( ) ;
         n634TBW03_SITE_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A634TBW03_SITE_ID", A634TBW03_SITE_ID);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_10( A634TBW03_SITE_ID) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_11") == 0 )
      {
         A642TBW03_LOCK_USER_ID = httpContext.GetNextPar( ) ;
         n642TBW03_LOCK_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A642TBW03_LOCK_USER_ID", A642TBW03_LOCK_USER_ID);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_11( A642TBW03_LOCK_USER_ID) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_12") == 0 )
      {
         A646TBW03_UPLOAD_USER_ID = httpContext.GetNextPar( ) ;
         n646TBW03_UPLOAD_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A646TBW03_UPLOAD_USER_ID", A646TBW03_UPLOAD_USER_ID);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_12( A646TBW03_UPLOAD_USER_ID) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_13") == 0 )
      {
         A653TBW03_APPROVAL_USER_ID = httpContext.GetNextPar( ) ;
         n653TBW03_APPROVAL_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A653TBW03_APPROVAL_USER_ID", A653TBW03_APPROVAL_USER_ID);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_13( A653TBW03_APPROVAL_USER_ID) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_14") == 0 )
      {
         A658TBW03_INPUT_END_USER_ID = httpContext.GetNextPar( ) ;
         n658TBW03_INPUT_END_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A658TBW03_INPUT_END_USER_ID", A658TBW03_INPUT_END_USER_ID);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_14( A658TBW03_INPUT_END_USER_ID) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_15") == 0 )
      {
         A757TBW03_CRT_USER_ID = httpContext.GetNextPar( ) ;
         n757TBW03_CRT_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A757TBW03_CRT_USER_ID", A757TBW03_CRT_USER_ID);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_15( A757TBW03_CRT_USER_ID) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_16") == 0 )
      {
         A761TBW03_UPD_USER_ID = httpContext.GetNextPar( ) ;
         n761TBW03_UPD_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A761TBW03_UPD_USER_ID", A761TBW03_UPD_USER_ID);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_16( A761TBW03_UPD_USER_ID) ;
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
      Form.getMeta().addItem("Description", "CRF検索ワーク", (short)(0)) ;
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTBW03_SESSION_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setTheme("Style2");
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
         ClassString = "Group" ;
         StyleString = "" ;
         httpContext.writeText( "<fieldset id=\""+grpGroupdata_Internalname+"\""+" style=\"-moz-border-radius:3pt;\""+" class=\""+ClassString+"\">") ;
         httpContext.writeText( "<legend class=\""+ClassString+"Title"+"\">"+"CRF検索ワーク"+"</legend>") ;
         wb_table3_27_1641( true) ;
      }
      return  ;
   }

   public void wb_table3_27_1641e( boolean wbgen )
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

   public void wb_table3_27_1641( boolean wbgen )
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
         wb_table4_33_1641( true) ;
      }
      return  ;
   }

   public void wb_table4_33_1641e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 266,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "EENTER.", TempTags, "", httpContext.getButtonType( ), "HLP_TBW03_CRF_SEARCH.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 267,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "ECANCEL.", TempTags, "", httpContext.getButtonType( ), "HLP_TBW03_CRF_SEARCH.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 268,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "EDELETE.", TempTags, "", httpContext.getButtonType( ), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_27_1641e( true) ;
      }
      else
      {
         wb_table3_27_1641e( false) ;
      }
   }

   public void wb_table4_33_1641( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_session_id_Internalname, "ID", "", "", lblTextblocktbw03_session_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A625TBW03_SESSION_ID", A625TBW03_SESSION_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_SESSION_ID_Internalname, GXutil.rtrim( A625TBW03_SESSION_ID), GXutil.rtrim( localUtil.format( A625TBW03_SESSION_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(38);\"", "", "", "", "", edtTBW03_SESSION_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW03_SESSION_ID_Enabled, 0, 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_app_id_Internalname, "ID", "", "", lblTextblocktbw03_app_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A626TBW03_APP_ID", A626TBW03_APP_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_APP_ID_Internalname, GXutil.rtrim( A626TBW03_APP_ID), GXutil.rtrim( localUtil.format( A626TBW03_APP_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(43);\"", "", "", "", "", edtTBW03_APP_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW03_APP_ID_Enabled, 0, 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_disp_datetime_Internalname, "表示日時", "", "", lblTextblocktbw03_disp_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A627TBW03_DISP_DATETIME", A627TBW03_DISP_DATETIME);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_DISP_DATETIME_Internalname, GXutil.rtrim( A627TBW03_DISP_DATETIME), GXutil.rtrim( localUtil.format( A627TBW03_DISP_DATETIME, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(48);\"", "", "", "", "", edtTBW03_DISP_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW03_DISP_DATETIME_Enabled, 0, 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_study_id_Internalname, "ID", "", "", lblTextblocktbw03_study_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A628TBW03_STUDY_ID", GXutil.ltrim( GXutil.str( A628TBW03_STUDY_ID, 10, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_STUDY_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A628TBW03_STUDY_ID, (byte)(10), (byte)(0), ".", "")), ((edtTBW03_STUDY_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A628TBW03_STUDY_ID), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A628TBW03_STUDY_ID), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(53);\"", "", "", "", "", edtTBW03_STUDY_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW03_STUDY_ID_Enabled, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_subject_id_Internalname, "ID", "", "", lblTextblocktbw03_subject_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A629TBW03_SUBJECT_ID", GXutil.ltrim( GXutil.str( A629TBW03_SUBJECT_ID, 6, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_SUBJECT_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A629TBW03_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")), ((edtTBW03_SUBJECT_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A629TBW03_SUBJECT_ID), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A629TBW03_SUBJECT_ID), "ZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(58);\"", "", "", "", "", edtTBW03_SUBJECT_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW03_SUBJECT_ID_Enabled, 0, 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_crf_id_Internalname, "CRFID", "", "", lblTextblocktbw03_crf_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A630TBW03_CRF_ID", GXutil.ltrim( GXutil.str( A630TBW03_CRF_ID, 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_CRF_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A630TBW03_CRF_ID, (byte)(4), (byte)(0), ".", "")), ((edtTBW03_CRF_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A630TBW03_CRF_ID), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A630TBW03_CRF_ID), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(63);\"", "", "", "", "", edtTBW03_CRF_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW03_CRF_ID_Enabled, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_crf_nm_Internalname, "CRF名称", "", "", lblTextblocktbw03_crf_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A631TBW03_CRF_NM", A631TBW03_CRF_NM);
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_CRF_NM_Internalname, GXutil.rtrim( A631TBW03_CRF_NM), GXutil.rtrim( localUtil.format( A631TBW03_CRF_NM, "")), "", "", "", "", "", edtTBW03_CRF_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW03_CRF_NM_Enabled, 0, 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_crf_snm_Internalname, "CRF略称", "", "", lblTextblocktbw03_crf_snm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A632TBW03_CRF_SNM", A632TBW03_CRF_SNM);
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_CRF_SNM_Internalname, GXutil.rtrim( A632TBW03_CRF_SNM), GXutil.rtrim( localUtil.format( A632TBW03_CRF_SNM, "")), "", "", "", "", "", edtTBW03_CRF_SNM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW03_CRF_SNM_Enabled, 0, 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_crf_order_Internalname, "CRF表示順", "", "", lblTextblocktbw03_crf_order_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A633TBW03_CRF_ORDER", GXutil.ltrim( GXutil.str( A633TBW03_CRF_ORDER, 5, 0)));
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_CRF_ORDER_Internalname, GXutil.ltrim( localUtil.ntoc( A633TBW03_CRF_ORDER, (byte)(5), (byte)(0), ".", "")), ((edtTBW03_CRF_ORDER_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A633TBW03_CRF_ORDER), "ZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A633TBW03_CRF_ORDER), "ZZZZ9")), "", "", "", "", "", edtTBW03_CRF_ORDER_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW03_CRF_ORDER_Enabled, 0, 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_site_id_Internalname, "ID", "", "", lblTextblocktbw03_site_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A634TBW03_SITE_ID", A634TBW03_SITE_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_SITE_ID_Internalname, GXutil.rtrim( A634TBW03_SITE_ID), GXutil.rtrim( localUtil.format( A634TBW03_SITE_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(83);\"", "", "", "", "", edtTBW03_SITE_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW03_SITE_ID_Enabled, 0, 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_site_nm_Internalname, "施設名", "", "", lblTextblocktbw03_site_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A635TBW03_SITE_NM", A635TBW03_SITE_NM);
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_SITE_NM_Internalname, GXutil.rtrim( A635TBW03_SITE_NM), GXutil.rtrim( localUtil.format( A635TBW03_SITE_NM, "")), "", "", "", "", "", edtTBW03_SITE_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW03_SITE_NM_Enabled, 0, 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_site_ryak_nm_Internalname, "施設名（略称）", "", "", lblTextblocktbw03_site_ryak_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A636TBW03_SITE_RYAK_NM", A636TBW03_SITE_RYAK_NM);
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_SITE_RYAK_NM_Internalname, GXutil.rtrim( A636TBW03_SITE_RYAK_NM), GXutil.rtrim( localUtil.format( A636TBW03_SITE_RYAK_NM, "")), "", "", "", "", "", edtTBW03_SITE_RYAK_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW03_SITE_RYAK_NM_Enabled, 0, 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_outer_subject_id_Internalname, "ID", "", "", lblTextblocktbw03_outer_subject_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A637TBW03_OUTER_SUBJECT_ID", A637TBW03_OUTER_SUBJECT_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_OUTER_SUBJECT_ID_Internalname, GXutil.rtrim( A637TBW03_OUTER_SUBJECT_ID), GXutil.rtrim( localUtil.format( A637TBW03_OUTER_SUBJECT_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(98);\"", "", "", "", "", edtTBW03_OUTER_SUBJECT_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW03_OUTER_SUBJECT_ID_Enabled, 0, 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_crf_latest_version_Internalname, "CRF最新更新バージョン", "", "", lblTextblocktbw03_crf_latest_version_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A638TBW03_CRF_LATEST_VERSION", GXutil.ltrim( GXutil.str( A638TBW03_CRF_LATEST_VERSION, 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_CRF_LATEST_VERSION_Internalname, GXutil.ltrim( localUtil.ntoc( A638TBW03_CRF_LATEST_VERSION, (byte)(4), (byte)(0), ".", "")), ((edtTBW03_CRF_LATEST_VERSION_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A638TBW03_CRF_LATEST_VERSION), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A638TBW03_CRF_LATEST_VERSION), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(103);\"", "", "", "", "", edtTBW03_CRF_LATEST_VERSION_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW03_CRF_LATEST_VERSION_Enabled, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_crf_input_level_Internalname, "CRF入力権限レベル", "", "", lblTextblocktbw03_crf_input_level_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A639TBW03_CRF_INPUT_LEVEL", GXutil.ltrim( GXutil.str( A639TBW03_CRF_INPUT_LEVEL, 2, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 108,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_CRF_INPUT_LEVEL_Internalname, GXutil.ltrim( localUtil.ntoc( A639TBW03_CRF_INPUT_LEVEL, (byte)(2), (byte)(0), ".", "")), ((edtTBW03_CRF_INPUT_LEVEL_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A639TBW03_CRF_INPUT_LEVEL), "Z9")) : localUtil.format( DecimalUtil.doubleToDec(A639TBW03_CRF_INPUT_LEVEL), "Z9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(108);\"", "", "", "", "", edtTBW03_CRF_INPUT_LEVEL_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW03_CRF_INPUT_LEVEL_Enabled, 0, 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_lock_flg_Internalname, "ロックフラグ", "", "", lblTextblocktbw03_lock_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A640TBW03_LOCK_FLG", A640TBW03_LOCK_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_LOCK_FLG_Internalname, GXutil.rtrim( A640TBW03_LOCK_FLG), GXutil.rtrim( localUtil.format( A640TBW03_LOCK_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(113);\"", "", "", "", "", edtTBW03_LOCK_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW03_LOCK_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_lock_datetime_Internalname, "ロック日時", "", "", lblTextblocktbw03_lock_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A641TBW03_LOCK_DATETIME", localUtil.ttoc( A641TBW03_LOCK_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 118,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBW03_LOCK_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_LOCK_DATETIME_Internalname, localUtil.format(A641TBW03_LOCK_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A641TBW03_LOCK_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(118);\"", "", "", "", "", edtTBW03_LOCK_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW03_LOCK_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBW03_CRF_SEARCH.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBW03_LOCK_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBW03_LOCK_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_lock_user_id_Internalname, "ID", "", "", lblTextblocktbw03_lock_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A642TBW03_LOCK_USER_ID", A642TBW03_LOCK_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 123,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_LOCK_USER_ID_Internalname, GXutil.rtrim( A642TBW03_LOCK_USER_ID), GXutil.rtrim( localUtil.format( A642TBW03_LOCK_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(123);\"", "", "", "", "", edtTBW03_LOCK_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW03_LOCK_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_lock_user_nm_Internalname, "ロックユーザー名", "", "", lblTextblocktbw03_lock_user_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A643TBW03_LOCK_USER_NM", A643TBW03_LOCK_USER_NM);
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_LOCK_USER_NM_Internalname, GXutil.rtrim( A643TBW03_LOCK_USER_NM), GXutil.rtrim( localUtil.format( A643TBW03_LOCK_USER_NM, "")), "", "", "", "", "", edtTBW03_LOCK_USER_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW03_LOCK_USER_NM_Enabled, 0, 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_lock_auth_cd_Internalname, "ロック時権限コード", "", "", lblTextblocktbw03_lock_auth_cd_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A644TBW03_LOCK_AUTH_CD", A644TBW03_LOCK_AUTH_CD);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 133,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_LOCK_AUTH_CD_Internalname, GXutil.rtrim( A644TBW03_LOCK_AUTH_CD), GXutil.rtrim( localUtil.format( A644TBW03_LOCK_AUTH_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(133);\"", "", "", "", "", edtTBW03_LOCK_AUTH_CD_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW03_LOCK_AUTH_CD_Enabled, 0, 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_upload_datetime_Internalname, "アップロード日時", "", "", lblTextblocktbw03_upload_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A645TBW03_UPLOAD_DATETIME", localUtil.ttoc( A645TBW03_UPLOAD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 138,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBW03_UPLOAD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_UPLOAD_DATETIME_Internalname, localUtil.format(A645TBW03_UPLOAD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A645TBW03_UPLOAD_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(138);\"", "", "", "", "", edtTBW03_UPLOAD_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW03_UPLOAD_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBW03_CRF_SEARCH.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBW03_UPLOAD_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBW03_UPLOAD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_upload_user_id_Internalname, "ID", "", "", lblTextblocktbw03_upload_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A646TBW03_UPLOAD_USER_ID", A646TBW03_UPLOAD_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 143,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_UPLOAD_USER_ID_Internalname, GXutil.rtrim( A646TBW03_UPLOAD_USER_ID), GXutil.rtrim( localUtil.format( A646TBW03_UPLOAD_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(143);\"", "", "", "", "", edtTBW03_UPLOAD_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW03_UPLOAD_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_upload_user_nm_Internalname, "アップロードユーザー名", "", "", lblTextblocktbw03_upload_user_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A647TBW03_UPLOAD_USER_NM", A647TBW03_UPLOAD_USER_NM);
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_UPLOAD_USER_NM_Internalname, GXutil.rtrim( A647TBW03_UPLOAD_USER_NM), GXutil.rtrim( localUtil.format( A647TBW03_UPLOAD_USER_NM, "")), "", "", "", "", "", edtTBW03_UPLOAD_USER_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW03_UPLOAD_USER_NM_Enabled, 0, 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_upload_auth_cd_Internalname, "アップロード時権限コード", "", "", lblTextblocktbw03_upload_auth_cd_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A648TBW03_UPLOAD_AUTH_CD", A648TBW03_UPLOAD_AUTH_CD);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 153,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_UPLOAD_AUTH_CD_Internalname, GXutil.rtrim( A648TBW03_UPLOAD_AUTH_CD), GXutil.rtrim( localUtil.format( A648TBW03_UPLOAD_AUTH_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(153);\"", "", "", "", "", edtTBW03_UPLOAD_AUTH_CD_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW03_UPLOAD_AUTH_CD_Enabled, 0, 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_dm_arrival_flg_Internalname, "DM到着フラグ", "", "", lblTextblocktbw03_dm_arrival_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A649TBW03_DM_ARRIVAL_FLG", A649TBW03_DM_ARRIVAL_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 158,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_DM_ARRIVAL_FLG_Internalname, GXutil.rtrim( A649TBW03_DM_ARRIVAL_FLG), GXutil.rtrim( localUtil.format( A649TBW03_DM_ARRIVAL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(158);\"", "", "", "", "", edtTBW03_DM_ARRIVAL_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW03_DM_ARRIVAL_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_dm_arrival_datetime_Internalname, "DM到着日時", "", "", lblTextblocktbw03_dm_arrival_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A650TBW03_DM_ARRIVAL_DATETIME", localUtil.ttoc( A650TBW03_DM_ARRIVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 163,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBW03_DM_ARRIVAL_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_DM_ARRIVAL_DATETIME_Internalname, localUtil.format(A650TBW03_DM_ARRIVAL_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A650TBW03_DM_ARRIVAL_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(163);\"", "", "", "", "", edtTBW03_DM_ARRIVAL_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW03_DM_ARRIVAL_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBW03_CRF_SEARCH.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBW03_DM_ARRIVAL_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBW03_DM_ARRIVAL_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_approval_flg_Internalname, "承認フラグ", "", "", lblTextblocktbw03_approval_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A651TBW03_APPROVAL_FLG", A651TBW03_APPROVAL_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 168,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_APPROVAL_FLG_Internalname, GXutil.rtrim( A651TBW03_APPROVAL_FLG), GXutil.rtrim( localUtil.format( A651TBW03_APPROVAL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(168);\"", "", "", "", "", edtTBW03_APPROVAL_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW03_APPROVAL_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_approval_datetime_Internalname, "承認日時", "", "", lblTextblocktbw03_approval_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A652TBW03_APPROVAL_DATETIME", localUtil.ttoc( A652TBW03_APPROVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 173,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBW03_APPROVAL_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_APPROVAL_DATETIME_Internalname, localUtil.format(A652TBW03_APPROVAL_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A652TBW03_APPROVAL_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(173);\"", "", "", "", "", edtTBW03_APPROVAL_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW03_APPROVAL_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBW03_CRF_SEARCH.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBW03_APPROVAL_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBW03_APPROVAL_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_approval_user_id_Internalname, "ID", "", "", lblTextblocktbw03_approval_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A653TBW03_APPROVAL_USER_ID", A653TBW03_APPROVAL_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 178,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_APPROVAL_USER_ID_Internalname, GXutil.rtrim( A653TBW03_APPROVAL_USER_ID), GXutil.rtrim( localUtil.format( A653TBW03_APPROVAL_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(178);\"", "", "", "", "", edtTBW03_APPROVAL_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW03_APPROVAL_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_approval_user_nm_Internalname, "承認ユーザー名", "", "", lblTextblocktbw03_approval_user_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A654TBW03_APPROVAL_USER_NM", A654TBW03_APPROVAL_USER_NM);
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_APPROVAL_USER_NM_Internalname, GXutil.rtrim( A654TBW03_APPROVAL_USER_NM), GXutil.rtrim( localUtil.format( A654TBW03_APPROVAL_USER_NM, "")), "", "", "", "", "", edtTBW03_APPROVAL_USER_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW03_APPROVAL_USER_NM_Enabled, 0, 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_approval_auth_cd_Internalname, "承認時権限コード", "", "", lblTextblocktbw03_approval_auth_cd_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A655TBW03_APPROVAL_AUTH_CD", A655TBW03_APPROVAL_AUTH_CD);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 188,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_APPROVAL_AUTH_CD_Internalname, GXutil.rtrim( A655TBW03_APPROVAL_AUTH_CD), GXutil.rtrim( localUtil.format( A655TBW03_APPROVAL_AUTH_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(188);\"", "", "", "", "", edtTBW03_APPROVAL_AUTH_CD_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW03_APPROVAL_AUTH_CD_Enabled, 0, 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_input_end_flg_Internalname, "データ固定フラグ", "", "", lblTextblocktbw03_input_end_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A656TBW03_INPUT_END_FLG", A656TBW03_INPUT_END_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 193,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_INPUT_END_FLG_Internalname, GXutil.rtrim( A656TBW03_INPUT_END_FLG), GXutil.rtrim( localUtil.format( A656TBW03_INPUT_END_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(193);\"", "", "", "", "", edtTBW03_INPUT_END_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW03_INPUT_END_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_input_end_datetime_Internalname, "データ固定日時", "", "", lblTextblocktbw03_input_end_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A657TBW03_INPUT_END_DATETIME", localUtil.ttoc( A657TBW03_INPUT_END_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 198,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBW03_INPUT_END_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_INPUT_END_DATETIME_Internalname, localUtil.format(A657TBW03_INPUT_END_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A657TBW03_INPUT_END_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(198);\"", "", "", "", "", edtTBW03_INPUT_END_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW03_INPUT_END_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBW03_CRF_SEARCH.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBW03_INPUT_END_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBW03_INPUT_END_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_input_end_user_id_Internalname, "ID", "", "", lblTextblocktbw03_input_end_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A658TBW03_INPUT_END_USER_ID", A658TBW03_INPUT_END_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 203,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_INPUT_END_USER_ID_Internalname, GXutil.rtrim( A658TBW03_INPUT_END_USER_ID), GXutil.rtrim( localUtil.format( A658TBW03_INPUT_END_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(203);\"", "", "", "", "", edtTBW03_INPUT_END_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW03_INPUT_END_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_input_end_user_nm_Internalname, "データ固定ユーザー名", "", "", lblTextblocktbw03_input_end_user_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A659TBW03_INPUT_END_USER_NM", A659TBW03_INPUT_END_USER_NM);
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_INPUT_END_USER_NM_Internalname, GXutil.rtrim( A659TBW03_INPUT_END_USER_NM), GXutil.rtrim( localUtil.format( A659TBW03_INPUT_END_USER_NM, "")), "", "", "", "", "", edtTBW03_INPUT_END_USER_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW03_INPUT_END_USER_NM_Enabled, 0, 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_input_end_auth_cd_Internalname, "データ固定時権限コード", "", "", lblTextblocktbw03_input_end_auth_cd_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A660TBW03_INPUT_END_AUTH_CD", A660TBW03_INPUT_END_AUTH_CD);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 213,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_INPUT_END_AUTH_CD_Internalname, GXutil.rtrim( A660TBW03_INPUT_END_AUTH_CD), GXutil.rtrim( localUtil.format( A660TBW03_INPUT_END_AUTH_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(213);\"", "", "", "", "", edtTBW03_INPUT_END_AUTH_CD_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW03_INPUT_END_AUTH_CD_Enabled, 0, 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_del_flg_Internalname, "削除フラグ", "", "", lblTextblocktbw03_del_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A755TBW03_DEL_FLG", A755TBW03_DEL_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 218,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_DEL_FLG_Internalname, GXutil.rtrim( A755TBW03_DEL_FLG), GXutil.rtrim( localUtil.format( A755TBW03_DEL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(218);\"", "", "", "", "", edtTBW03_DEL_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW03_DEL_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_crt_datetime_Internalname, "作成日時", "", "", lblTextblocktbw03_crt_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A756TBW03_CRT_DATETIME", localUtil.ttoc( A756TBW03_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 223,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBW03_CRT_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_CRT_DATETIME_Internalname, localUtil.format(A756TBW03_CRT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A756TBW03_CRT_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(223);\"", "", "", "", "", edtTBW03_CRT_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW03_CRT_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBW03_CRF_SEARCH.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBW03_CRT_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBW03_CRT_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_crt_user_id_Internalname, "ID", "", "", lblTextblocktbw03_crt_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A757TBW03_CRT_USER_ID", A757TBW03_CRT_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 228,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_CRT_USER_ID_Internalname, GXutil.rtrim( A757TBW03_CRT_USER_ID), GXutil.rtrim( localUtil.format( A757TBW03_CRT_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(228);\"", "", "", "", "", edtTBW03_CRT_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW03_CRT_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_crt_user_nm_Internalname, "作成ユーザー名", "", "", lblTextblocktbw03_crt_user_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A758TBW03_CRT_USER_NM", A758TBW03_CRT_USER_NM);
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_CRT_USER_NM_Internalname, GXutil.rtrim( A758TBW03_CRT_USER_NM), GXutil.rtrim( localUtil.format( A758TBW03_CRT_USER_NM, "")), "", "", "", "", "", edtTBW03_CRT_USER_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW03_CRT_USER_NM_Enabled, 0, 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_crt_prog_nm_Internalname, "作成プログラム名", "", "", lblTextblocktbw03_crt_prog_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A759TBW03_CRT_PROG_NM", A759TBW03_CRT_PROG_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 238,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_CRT_PROG_NM_Internalname, GXutil.rtrim( A759TBW03_CRT_PROG_NM), GXutil.rtrim( localUtil.format( A759TBW03_CRT_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(238);\"", "", "", "", "", edtTBW03_CRT_PROG_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW03_CRT_PROG_NM_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_upd_datetime_Internalname, "更新日時", "", "", lblTextblocktbw03_upd_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A760TBW03_UPD_DATETIME", localUtil.ttoc( A760TBW03_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 243,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBW03_UPD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_UPD_DATETIME_Internalname, localUtil.format(A760TBW03_UPD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A760TBW03_UPD_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(243);\"", "", "", "", "", edtTBW03_UPD_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW03_UPD_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBW03_CRF_SEARCH.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBW03_UPD_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBW03_UPD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_upd_user_id_Internalname, "ID", "", "", lblTextblocktbw03_upd_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A761TBW03_UPD_USER_ID", A761TBW03_UPD_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 248,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_UPD_USER_ID_Internalname, GXutil.rtrim( A761TBW03_UPD_USER_ID), GXutil.rtrim( localUtil.format( A761TBW03_UPD_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(248);\"", "", "", "", "", edtTBW03_UPD_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW03_UPD_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_upd_user_nm_Internalname, "更新ユーザー名", "", "", lblTextblocktbw03_upd_user_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A762TBW03_UPD_USER_NM", A762TBW03_UPD_USER_NM);
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_UPD_USER_NM_Internalname, GXutil.rtrim( A762TBW03_UPD_USER_NM), GXutil.rtrim( localUtil.format( A762TBW03_UPD_USER_NM, "")), "", "", "", "", "", edtTBW03_UPD_USER_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW03_UPD_USER_NM_Enabled, 0, 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_upd_prog_nm_Internalname, "更新プログラム名", "", "", lblTextblocktbw03_upd_prog_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A763TBW03_UPD_PROG_NM", A763TBW03_UPD_PROG_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 258,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_UPD_PROG_NM_Internalname, GXutil.rtrim( A763TBW03_UPD_PROG_NM), GXutil.rtrim( localUtil.format( A763TBW03_UPD_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(258);\"", "", "", "", "", edtTBW03_UPD_PROG_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW03_UPD_PROG_NM_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw03_upd_cnt_Internalname, "更新カウント", "", "", lblTextblocktbw03_upd_cnt_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A764TBW03_UPD_CNT", GXutil.ltrim( GXutil.str( A764TBW03_UPD_CNT, 10, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 263,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW03_UPD_CNT_Internalname, GXutil.ltrim( localUtil.ntoc( A764TBW03_UPD_CNT, (byte)(10), (byte)(0), ".", "")), ((edtTBW03_UPD_CNT_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A764TBW03_UPD_CNT), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A764TBW03_UPD_CNT), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(263);\"", "", "", "", "", edtTBW03_UPD_CNT_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW03_UPD_CNT_Enabled, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBW03_CRF_SEARCH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_33_1641e( true) ;
      }
      else
      {
         wb_table4_33_1641e( false) ;
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
         httpContext.writeText( "<div style=\"WHITE-SPACE: nowrap\" class=\"ToolbarMain\">") ;
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", "Style2"), "", "", "", "Style2", imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW03_CRF_SEARCH.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_separator_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW03_CRF_SEARCH.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", "Style2"), "", "", "", "Style2", imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW03_CRF_SEARCH.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW03_CRF_SEARCH.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", "Style2"), "", "", "", "Style2", imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW03_CRF_SEARCH.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_separator_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW03_CRF_SEARCH.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", "Style2"), "", "", "", "Style2", imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW03_CRF_SEARCH.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_separator_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW03_CRF_SEARCH.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", "Style2"), "", "", "", "Style2", imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW03_CRF_SEARCH.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_separator_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW03_CRF_SEARCH.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW03_CRF_SEARCH.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW03_CRF_SEARCH.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW03_CRF_SEARCH.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW03_CRF_SEARCH.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW03_CRF_SEARCH.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW03_CRF_SEARCH.htm");
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
            A625TBW03_SESSION_ID = httpContext.cgiGet( edtTBW03_SESSION_ID_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A625TBW03_SESSION_ID", A625TBW03_SESSION_ID);
            A626TBW03_APP_ID = httpContext.cgiGet( edtTBW03_APP_ID_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A626TBW03_APP_ID", A626TBW03_APP_ID);
            A627TBW03_DISP_DATETIME = httpContext.cgiGet( edtTBW03_DISP_DATETIME_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A627TBW03_DISP_DATETIME", A627TBW03_DISP_DATETIME);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW03_STUDY_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW03_STUDY_ID_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW03_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW03_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A628TBW03_STUDY_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A628TBW03_STUDY_ID", GXutil.ltrim( GXutil.str( A628TBW03_STUDY_ID, 10, 0)));
            }
            else
            {
               A628TBW03_STUDY_ID = localUtil.ctol( httpContext.cgiGet( edtTBW03_STUDY_ID_Internalname), ".", ",") ;
               httpContext.ajax_rsp_assign_attri("", false, "A628TBW03_STUDY_ID", GXutil.ltrim( GXutil.str( A628TBW03_STUDY_ID, 10, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW03_SUBJECT_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW03_SUBJECT_ID_Internalname), ".", ",") > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW03_SUBJECT_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW03_SUBJECT_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A629TBW03_SUBJECT_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A629TBW03_SUBJECT_ID", GXutil.ltrim( GXutil.str( A629TBW03_SUBJECT_ID, 6, 0)));
            }
            else
            {
               A629TBW03_SUBJECT_ID = (int)(localUtil.ctol( httpContext.cgiGet( edtTBW03_SUBJECT_ID_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A629TBW03_SUBJECT_ID", GXutil.ltrim( GXutil.str( A629TBW03_SUBJECT_ID, 6, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW03_CRF_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW03_CRF_ID_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW03_CRF_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW03_CRF_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A630TBW03_CRF_ID = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A630TBW03_CRF_ID", GXutil.ltrim( GXutil.str( A630TBW03_CRF_ID, 4, 0)));
            }
            else
            {
               A630TBW03_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( edtTBW03_CRF_ID_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A630TBW03_CRF_ID", GXutil.ltrim( GXutil.str( A630TBW03_CRF_ID, 4, 0)));
            }
            A631TBW03_CRF_NM = httpContext.cgiGet( edtTBW03_CRF_NM_Internalname) ;
            n631TBW03_CRF_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A631TBW03_CRF_NM", A631TBW03_CRF_NM);
            A632TBW03_CRF_SNM = httpContext.cgiGet( edtTBW03_CRF_SNM_Internalname) ;
            n632TBW03_CRF_SNM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A632TBW03_CRF_SNM", A632TBW03_CRF_SNM);
            A633TBW03_CRF_ORDER = (int)(localUtil.ctol( httpContext.cgiGet( edtTBW03_CRF_ORDER_Internalname), ".", ",")) ;
            n633TBW03_CRF_ORDER = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A633TBW03_CRF_ORDER", GXutil.ltrim( GXutil.str( A633TBW03_CRF_ORDER, 5, 0)));
            A634TBW03_SITE_ID = httpContext.cgiGet( edtTBW03_SITE_ID_Internalname) ;
            n634TBW03_SITE_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A634TBW03_SITE_ID", A634TBW03_SITE_ID);
            n634TBW03_SITE_ID = ((GXutil.strcmp("", A634TBW03_SITE_ID)==0) ? true : false) ;
            A635TBW03_SITE_NM = httpContext.cgiGet( edtTBW03_SITE_NM_Internalname) ;
            n635TBW03_SITE_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A635TBW03_SITE_NM", A635TBW03_SITE_NM);
            A636TBW03_SITE_RYAK_NM = httpContext.cgiGet( edtTBW03_SITE_RYAK_NM_Internalname) ;
            n636TBW03_SITE_RYAK_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A636TBW03_SITE_RYAK_NM", A636TBW03_SITE_RYAK_NM);
            A637TBW03_OUTER_SUBJECT_ID = httpContext.cgiGet( edtTBW03_OUTER_SUBJECT_ID_Internalname) ;
            n637TBW03_OUTER_SUBJECT_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A637TBW03_OUTER_SUBJECT_ID", A637TBW03_OUTER_SUBJECT_ID);
            n637TBW03_OUTER_SUBJECT_ID = ((GXutil.strcmp("", A637TBW03_OUTER_SUBJECT_ID)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW03_CRF_LATEST_VERSION_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW03_CRF_LATEST_VERSION_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW03_CRF_LATEST_VERSION");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW03_CRF_LATEST_VERSION_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A638TBW03_CRF_LATEST_VERSION = (short)(0) ;
               n638TBW03_CRF_LATEST_VERSION = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A638TBW03_CRF_LATEST_VERSION", GXutil.ltrim( GXutil.str( A638TBW03_CRF_LATEST_VERSION, 4, 0)));
            }
            else
            {
               A638TBW03_CRF_LATEST_VERSION = (short)(localUtil.ctol( httpContext.cgiGet( edtTBW03_CRF_LATEST_VERSION_Internalname), ".", ",")) ;
               n638TBW03_CRF_LATEST_VERSION = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A638TBW03_CRF_LATEST_VERSION", GXutil.ltrim( GXutil.str( A638TBW03_CRF_LATEST_VERSION, 4, 0)));
            }
            n638TBW03_CRF_LATEST_VERSION = ((0==A638TBW03_CRF_LATEST_VERSION) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW03_CRF_INPUT_LEVEL_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW03_CRF_INPUT_LEVEL_Internalname), ".", ",") > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW03_CRF_INPUT_LEVEL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW03_CRF_INPUT_LEVEL_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A639TBW03_CRF_INPUT_LEVEL = (byte)(0) ;
               n639TBW03_CRF_INPUT_LEVEL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A639TBW03_CRF_INPUT_LEVEL", GXutil.ltrim( GXutil.str( A639TBW03_CRF_INPUT_LEVEL, 2, 0)));
            }
            else
            {
               A639TBW03_CRF_INPUT_LEVEL = (byte)(localUtil.ctol( httpContext.cgiGet( edtTBW03_CRF_INPUT_LEVEL_Internalname), ".", ",")) ;
               n639TBW03_CRF_INPUT_LEVEL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A639TBW03_CRF_INPUT_LEVEL", GXutil.ltrim( GXutil.str( A639TBW03_CRF_INPUT_LEVEL, 2, 0)));
            }
            n639TBW03_CRF_INPUT_LEVEL = ((0==A639TBW03_CRF_INPUT_LEVEL) ? true : false) ;
            A640TBW03_LOCK_FLG = httpContext.cgiGet( edtTBW03_LOCK_FLG_Internalname) ;
            n640TBW03_LOCK_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A640TBW03_LOCK_FLG", A640TBW03_LOCK_FLG);
            n640TBW03_LOCK_FLG = ((GXutil.strcmp("", A640TBW03_LOCK_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBW03_LOCK_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"ロック日時"}), 1, "TBW03_LOCK_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW03_LOCK_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A641TBW03_LOCK_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n641TBW03_LOCK_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A641TBW03_LOCK_DATETIME", localUtil.ttoc( A641TBW03_LOCK_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A641TBW03_LOCK_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBW03_LOCK_DATETIME_Internalname)) ;
               n641TBW03_LOCK_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A641TBW03_LOCK_DATETIME", localUtil.ttoc( A641TBW03_LOCK_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n641TBW03_LOCK_DATETIME = (GXutil.nullDate().equals(A641TBW03_LOCK_DATETIME) ? true : false) ;
            A642TBW03_LOCK_USER_ID = httpContext.cgiGet( edtTBW03_LOCK_USER_ID_Internalname) ;
            n642TBW03_LOCK_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A642TBW03_LOCK_USER_ID", A642TBW03_LOCK_USER_ID);
            n642TBW03_LOCK_USER_ID = ((GXutil.strcmp("", A642TBW03_LOCK_USER_ID)==0) ? true : false) ;
            A643TBW03_LOCK_USER_NM = httpContext.cgiGet( edtTBW03_LOCK_USER_NM_Internalname) ;
            n643TBW03_LOCK_USER_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A643TBW03_LOCK_USER_NM", A643TBW03_LOCK_USER_NM);
            A644TBW03_LOCK_AUTH_CD = httpContext.cgiGet( edtTBW03_LOCK_AUTH_CD_Internalname) ;
            n644TBW03_LOCK_AUTH_CD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A644TBW03_LOCK_AUTH_CD", A644TBW03_LOCK_AUTH_CD);
            n644TBW03_LOCK_AUTH_CD = ((GXutil.strcmp("", A644TBW03_LOCK_AUTH_CD)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBW03_UPLOAD_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"アップロード日時"}), 1, "TBW03_UPLOAD_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW03_UPLOAD_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A645TBW03_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n645TBW03_UPLOAD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A645TBW03_UPLOAD_DATETIME", localUtil.ttoc( A645TBW03_UPLOAD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A645TBW03_UPLOAD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBW03_UPLOAD_DATETIME_Internalname)) ;
               n645TBW03_UPLOAD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A645TBW03_UPLOAD_DATETIME", localUtil.ttoc( A645TBW03_UPLOAD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n645TBW03_UPLOAD_DATETIME = (GXutil.nullDate().equals(A645TBW03_UPLOAD_DATETIME) ? true : false) ;
            A646TBW03_UPLOAD_USER_ID = httpContext.cgiGet( edtTBW03_UPLOAD_USER_ID_Internalname) ;
            n646TBW03_UPLOAD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A646TBW03_UPLOAD_USER_ID", A646TBW03_UPLOAD_USER_ID);
            n646TBW03_UPLOAD_USER_ID = ((GXutil.strcmp("", A646TBW03_UPLOAD_USER_ID)==0) ? true : false) ;
            A647TBW03_UPLOAD_USER_NM = httpContext.cgiGet( edtTBW03_UPLOAD_USER_NM_Internalname) ;
            n647TBW03_UPLOAD_USER_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A647TBW03_UPLOAD_USER_NM", A647TBW03_UPLOAD_USER_NM);
            A648TBW03_UPLOAD_AUTH_CD = httpContext.cgiGet( edtTBW03_UPLOAD_AUTH_CD_Internalname) ;
            n648TBW03_UPLOAD_AUTH_CD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A648TBW03_UPLOAD_AUTH_CD", A648TBW03_UPLOAD_AUTH_CD);
            n648TBW03_UPLOAD_AUTH_CD = ((GXutil.strcmp("", A648TBW03_UPLOAD_AUTH_CD)==0) ? true : false) ;
            A649TBW03_DM_ARRIVAL_FLG = httpContext.cgiGet( edtTBW03_DM_ARRIVAL_FLG_Internalname) ;
            n649TBW03_DM_ARRIVAL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A649TBW03_DM_ARRIVAL_FLG", A649TBW03_DM_ARRIVAL_FLG);
            n649TBW03_DM_ARRIVAL_FLG = ((GXutil.strcmp("", A649TBW03_DM_ARRIVAL_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBW03_DM_ARRIVAL_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"DM到着日時"}), 1, "TBW03_DM_ARRIVAL_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW03_DM_ARRIVAL_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A650TBW03_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n650TBW03_DM_ARRIVAL_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A650TBW03_DM_ARRIVAL_DATETIME", localUtil.ttoc( A650TBW03_DM_ARRIVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A650TBW03_DM_ARRIVAL_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBW03_DM_ARRIVAL_DATETIME_Internalname)) ;
               n650TBW03_DM_ARRIVAL_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A650TBW03_DM_ARRIVAL_DATETIME", localUtil.ttoc( A650TBW03_DM_ARRIVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n650TBW03_DM_ARRIVAL_DATETIME = (GXutil.nullDate().equals(A650TBW03_DM_ARRIVAL_DATETIME) ? true : false) ;
            A651TBW03_APPROVAL_FLG = httpContext.cgiGet( edtTBW03_APPROVAL_FLG_Internalname) ;
            n651TBW03_APPROVAL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A651TBW03_APPROVAL_FLG", A651TBW03_APPROVAL_FLG);
            n651TBW03_APPROVAL_FLG = ((GXutil.strcmp("", A651TBW03_APPROVAL_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBW03_APPROVAL_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"承認日時"}), 1, "TBW03_APPROVAL_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW03_APPROVAL_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A652TBW03_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n652TBW03_APPROVAL_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A652TBW03_APPROVAL_DATETIME", localUtil.ttoc( A652TBW03_APPROVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A652TBW03_APPROVAL_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBW03_APPROVAL_DATETIME_Internalname)) ;
               n652TBW03_APPROVAL_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A652TBW03_APPROVAL_DATETIME", localUtil.ttoc( A652TBW03_APPROVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n652TBW03_APPROVAL_DATETIME = (GXutil.nullDate().equals(A652TBW03_APPROVAL_DATETIME) ? true : false) ;
            A653TBW03_APPROVAL_USER_ID = httpContext.cgiGet( edtTBW03_APPROVAL_USER_ID_Internalname) ;
            n653TBW03_APPROVAL_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A653TBW03_APPROVAL_USER_ID", A653TBW03_APPROVAL_USER_ID);
            n653TBW03_APPROVAL_USER_ID = ((GXutil.strcmp("", A653TBW03_APPROVAL_USER_ID)==0) ? true : false) ;
            A654TBW03_APPROVAL_USER_NM = httpContext.cgiGet( edtTBW03_APPROVAL_USER_NM_Internalname) ;
            n654TBW03_APPROVAL_USER_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A654TBW03_APPROVAL_USER_NM", A654TBW03_APPROVAL_USER_NM);
            A655TBW03_APPROVAL_AUTH_CD = httpContext.cgiGet( edtTBW03_APPROVAL_AUTH_CD_Internalname) ;
            n655TBW03_APPROVAL_AUTH_CD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A655TBW03_APPROVAL_AUTH_CD", A655TBW03_APPROVAL_AUTH_CD);
            n655TBW03_APPROVAL_AUTH_CD = ((GXutil.strcmp("", A655TBW03_APPROVAL_AUTH_CD)==0) ? true : false) ;
            A656TBW03_INPUT_END_FLG = httpContext.cgiGet( edtTBW03_INPUT_END_FLG_Internalname) ;
            n656TBW03_INPUT_END_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A656TBW03_INPUT_END_FLG", A656TBW03_INPUT_END_FLG);
            n656TBW03_INPUT_END_FLG = ((GXutil.strcmp("", A656TBW03_INPUT_END_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBW03_INPUT_END_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"データ固定日時"}), 1, "TBW03_INPUT_END_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW03_INPUT_END_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A657TBW03_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n657TBW03_INPUT_END_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A657TBW03_INPUT_END_DATETIME", localUtil.ttoc( A657TBW03_INPUT_END_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A657TBW03_INPUT_END_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBW03_INPUT_END_DATETIME_Internalname)) ;
               n657TBW03_INPUT_END_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A657TBW03_INPUT_END_DATETIME", localUtil.ttoc( A657TBW03_INPUT_END_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n657TBW03_INPUT_END_DATETIME = (GXutil.nullDate().equals(A657TBW03_INPUT_END_DATETIME) ? true : false) ;
            A658TBW03_INPUT_END_USER_ID = httpContext.cgiGet( edtTBW03_INPUT_END_USER_ID_Internalname) ;
            n658TBW03_INPUT_END_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A658TBW03_INPUT_END_USER_ID", A658TBW03_INPUT_END_USER_ID);
            n658TBW03_INPUT_END_USER_ID = ((GXutil.strcmp("", A658TBW03_INPUT_END_USER_ID)==0) ? true : false) ;
            A659TBW03_INPUT_END_USER_NM = httpContext.cgiGet( edtTBW03_INPUT_END_USER_NM_Internalname) ;
            n659TBW03_INPUT_END_USER_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A659TBW03_INPUT_END_USER_NM", A659TBW03_INPUT_END_USER_NM);
            A660TBW03_INPUT_END_AUTH_CD = httpContext.cgiGet( edtTBW03_INPUT_END_AUTH_CD_Internalname) ;
            n660TBW03_INPUT_END_AUTH_CD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A660TBW03_INPUT_END_AUTH_CD", A660TBW03_INPUT_END_AUTH_CD);
            n660TBW03_INPUT_END_AUTH_CD = ((GXutil.strcmp("", A660TBW03_INPUT_END_AUTH_CD)==0) ? true : false) ;
            A755TBW03_DEL_FLG = httpContext.cgiGet( edtTBW03_DEL_FLG_Internalname) ;
            n755TBW03_DEL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A755TBW03_DEL_FLG", A755TBW03_DEL_FLG);
            n755TBW03_DEL_FLG = ((GXutil.strcmp("", A755TBW03_DEL_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBW03_CRT_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"作成日時"}), 1, "TBW03_CRT_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW03_CRT_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A756TBW03_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n756TBW03_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A756TBW03_CRT_DATETIME", localUtil.ttoc( A756TBW03_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A756TBW03_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBW03_CRT_DATETIME_Internalname)) ;
               n756TBW03_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A756TBW03_CRT_DATETIME", localUtil.ttoc( A756TBW03_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n756TBW03_CRT_DATETIME = (GXutil.nullDate().equals(A756TBW03_CRT_DATETIME) ? true : false) ;
            A757TBW03_CRT_USER_ID = httpContext.cgiGet( edtTBW03_CRT_USER_ID_Internalname) ;
            n757TBW03_CRT_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A757TBW03_CRT_USER_ID", A757TBW03_CRT_USER_ID);
            n757TBW03_CRT_USER_ID = ((GXutil.strcmp("", A757TBW03_CRT_USER_ID)==0) ? true : false) ;
            A758TBW03_CRT_USER_NM = httpContext.cgiGet( edtTBW03_CRT_USER_NM_Internalname) ;
            n758TBW03_CRT_USER_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A758TBW03_CRT_USER_NM", A758TBW03_CRT_USER_NM);
            A759TBW03_CRT_PROG_NM = httpContext.cgiGet( edtTBW03_CRT_PROG_NM_Internalname) ;
            n759TBW03_CRT_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A759TBW03_CRT_PROG_NM", A759TBW03_CRT_PROG_NM);
            n759TBW03_CRT_PROG_NM = ((GXutil.strcmp("", A759TBW03_CRT_PROG_NM)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBW03_UPD_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"更新日時"}), 1, "TBW03_UPD_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW03_UPD_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A760TBW03_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n760TBW03_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A760TBW03_UPD_DATETIME", localUtil.ttoc( A760TBW03_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A760TBW03_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBW03_UPD_DATETIME_Internalname)) ;
               n760TBW03_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A760TBW03_UPD_DATETIME", localUtil.ttoc( A760TBW03_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n760TBW03_UPD_DATETIME = (GXutil.nullDate().equals(A760TBW03_UPD_DATETIME) ? true : false) ;
            A761TBW03_UPD_USER_ID = httpContext.cgiGet( edtTBW03_UPD_USER_ID_Internalname) ;
            n761TBW03_UPD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A761TBW03_UPD_USER_ID", A761TBW03_UPD_USER_ID);
            n761TBW03_UPD_USER_ID = ((GXutil.strcmp("", A761TBW03_UPD_USER_ID)==0) ? true : false) ;
            A762TBW03_UPD_USER_NM = httpContext.cgiGet( edtTBW03_UPD_USER_NM_Internalname) ;
            n762TBW03_UPD_USER_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A762TBW03_UPD_USER_NM", A762TBW03_UPD_USER_NM);
            A763TBW03_UPD_PROG_NM = httpContext.cgiGet( edtTBW03_UPD_PROG_NM_Internalname) ;
            n763TBW03_UPD_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A763TBW03_UPD_PROG_NM", A763TBW03_UPD_PROG_NM);
            n763TBW03_UPD_PROG_NM = ((GXutil.strcmp("", A763TBW03_UPD_PROG_NM)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW03_UPD_CNT_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW03_UPD_CNT_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW03_UPD_CNT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW03_UPD_CNT_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A764TBW03_UPD_CNT = 0 ;
               n764TBW03_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A764TBW03_UPD_CNT", GXutil.ltrim( GXutil.str( A764TBW03_UPD_CNT, 10, 0)));
            }
            else
            {
               A764TBW03_UPD_CNT = localUtil.ctol( httpContext.cgiGet( edtTBW03_UPD_CNT_Internalname), ".", ",") ;
               n764TBW03_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A764TBW03_UPD_CNT", GXutil.ltrim( GXutil.str( A764TBW03_UPD_CNT, 10, 0)));
            }
            n764TBW03_UPD_CNT = ((0==A764TBW03_UPD_CNT) ? true : false) ;
            /* Read saved values. */
            Z625TBW03_SESSION_ID = httpContext.cgiGet( "Z625TBW03_SESSION_ID") ;
            Z626TBW03_APP_ID = httpContext.cgiGet( "Z626TBW03_APP_ID") ;
            Z627TBW03_DISP_DATETIME = httpContext.cgiGet( "Z627TBW03_DISP_DATETIME") ;
            Z628TBW03_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "Z628TBW03_STUDY_ID"), ".", ",") ;
            Z629TBW03_SUBJECT_ID = (int)(localUtil.ctol( httpContext.cgiGet( "Z629TBW03_SUBJECT_ID"), ".", ",")) ;
            Z630TBW03_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( "Z630TBW03_CRF_ID"), ".", ",")) ;
            Z637TBW03_OUTER_SUBJECT_ID = httpContext.cgiGet( "Z637TBW03_OUTER_SUBJECT_ID") ;
            n637TBW03_OUTER_SUBJECT_ID = ((GXutil.strcmp("", A637TBW03_OUTER_SUBJECT_ID)==0) ? true : false) ;
            Z638TBW03_CRF_LATEST_VERSION = (short)(localUtil.ctol( httpContext.cgiGet( "Z638TBW03_CRF_LATEST_VERSION"), ".", ",")) ;
            n638TBW03_CRF_LATEST_VERSION = ((0==A638TBW03_CRF_LATEST_VERSION) ? true : false) ;
            Z639TBW03_CRF_INPUT_LEVEL = (byte)(localUtil.ctol( httpContext.cgiGet( "Z639TBW03_CRF_INPUT_LEVEL"), ".", ",")) ;
            n639TBW03_CRF_INPUT_LEVEL = ((0==A639TBW03_CRF_INPUT_LEVEL) ? true : false) ;
            Z640TBW03_LOCK_FLG = httpContext.cgiGet( "Z640TBW03_LOCK_FLG") ;
            n640TBW03_LOCK_FLG = ((GXutil.strcmp("", A640TBW03_LOCK_FLG)==0) ? true : false) ;
            Z641TBW03_LOCK_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z641TBW03_LOCK_DATETIME"), 0) ;
            n641TBW03_LOCK_DATETIME = (GXutil.nullDate().equals(A641TBW03_LOCK_DATETIME) ? true : false) ;
            Z644TBW03_LOCK_AUTH_CD = httpContext.cgiGet( "Z644TBW03_LOCK_AUTH_CD") ;
            n644TBW03_LOCK_AUTH_CD = ((GXutil.strcmp("", A644TBW03_LOCK_AUTH_CD)==0) ? true : false) ;
            Z645TBW03_UPLOAD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z645TBW03_UPLOAD_DATETIME"), 0) ;
            n645TBW03_UPLOAD_DATETIME = (GXutil.nullDate().equals(A645TBW03_UPLOAD_DATETIME) ? true : false) ;
            Z648TBW03_UPLOAD_AUTH_CD = httpContext.cgiGet( "Z648TBW03_UPLOAD_AUTH_CD") ;
            n648TBW03_UPLOAD_AUTH_CD = ((GXutil.strcmp("", A648TBW03_UPLOAD_AUTH_CD)==0) ? true : false) ;
            Z649TBW03_DM_ARRIVAL_FLG = httpContext.cgiGet( "Z649TBW03_DM_ARRIVAL_FLG") ;
            n649TBW03_DM_ARRIVAL_FLG = ((GXutil.strcmp("", A649TBW03_DM_ARRIVAL_FLG)==0) ? true : false) ;
            Z650TBW03_DM_ARRIVAL_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z650TBW03_DM_ARRIVAL_DATETIME"), 0) ;
            n650TBW03_DM_ARRIVAL_DATETIME = (GXutil.nullDate().equals(A650TBW03_DM_ARRIVAL_DATETIME) ? true : false) ;
            Z651TBW03_APPROVAL_FLG = httpContext.cgiGet( "Z651TBW03_APPROVAL_FLG") ;
            n651TBW03_APPROVAL_FLG = ((GXutil.strcmp("", A651TBW03_APPROVAL_FLG)==0) ? true : false) ;
            Z652TBW03_APPROVAL_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z652TBW03_APPROVAL_DATETIME"), 0) ;
            n652TBW03_APPROVAL_DATETIME = (GXutil.nullDate().equals(A652TBW03_APPROVAL_DATETIME) ? true : false) ;
            Z655TBW03_APPROVAL_AUTH_CD = httpContext.cgiGet( "Z655TBW03_APPROVAL_AUTH_CD") ;
            n655TBW03_APPROVAL_AUTH_CD = ((GXutil.strcmp("", A655TBW03_APPROVAL_AUTH_CD)==0) ? true : false) ;
            Z656TBW03_INPUT_END_FLG = httpContext.cgiGet( "Z656TBW03_INPUT_END_FLG") ;
            n656TBW03_INPUT_END_FLG = ((GXutil.strcmp("", A656TBW03_INPUT_END_FLG)==0) ? true : false) ;
            Z657TBW03_INPUT_END_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z657TBW03_INPUT_END_DATETIME"), 0) ;
            n657TBW03_INPUT_END_DATETIME = (GXutil.nullDate().equals(A657TBW03_INPUT_END_DATETIME) ? true : false) ;
            Z660TBW03_INPUT_END_AUTH_CD = httpContext.cgiGet( "Z660TBW03_INPUT_END_AUTH_CD") ;
            n660TBW03_INPUT_END_AUTH_CD = ((GXutil.strcmp("", A660TBW03_INPUT_END_AUTH_CD)==0) ? true : false) ;
            Z755TBW03_DEL_FLG = httpContext.cgiGet( "Z755TBW03_DEL_FLG") ;
            n755TBW03_DEL_FLG = ((GXutil.strcmp("", A755TBW03_DEL_FLG)==0) ? true : false) ;
            Z756TBW03_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z756TBW03_CRT_DATETIME"), 0) ;
            n756TBW03_CRT_DATETIME = (GXutil.nullDate().equals(A756TBW03_CRT_DATETIME) ? true : false) ;
            Z759TBW03_CRT_PROG_NM = httpContext.cgiGet( "Z759TBW03_CRT_PROG_NM") ;
            n759TBW03_CRT_PROG_NM = ((GXutil.strcmp("", A759TBW03_CRT_PROG_NM)==0) ? true : false) ;
            Z760TBW03_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z760TBW03_UPD_DATETIME"), 0) ;
            n760TBW03_UPD_DATETIME = (GXutil.nullDate().equals(A760TBW03_UPD_DATETIME) ? true : false) ;
            Z763TBW03_UPD_PROG_NM = httpContext.cgiGet( "Z763TBW03_UPD_PROG_NM") ;
            n763TBW03_UPD_PROG_NM = ((GXutil.strcmp("", A763TBW03_UPD_PROG_NM)==0) ? true : false) ;
            Z764TBW03_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z764TBW03_UPD_CNT"), ".", ",") ;
            n764TBW03_UPD_CNT = ((0==A764TBW03_UPD_CNT) ? true : false) ;
            Z634TBW03_SITE_ID = httpContext.cgiGet( "Z634TBW03_SITE_ID") ;
            n634TBW03_SITE_ID = ((GXutil.strcmp("", A634TBW03_SITE_ID)==0) ? true : false) ;
            Z642TBW03_LOCK_USER_ID = httpContext.cgiGet( "Z642TBW03_LOCK_USER_ID") ;
            n642TBW03_LOCK_USER_ID = ((GXutil.strcmp("", A642TBW03_LOCK_USER_ID)==0) ? true : false) ;
            Z646TBW03_UPLOAD_USER_ID = httpContext.cgiGet( "Z646TBW03_UPLOAD_USER_ID") ;
            n646TBW03_UPLOAD_USER_ID = ((GXutil.strcmp("", A646TBW03_UPLOAD_USER_ID)==0) ? true : false) ;
            Z653TBW03_APPROVAL_USER_ID = httpContext.cgiGet( "Z653TBW03_APPROVAL_USER_ID") ;
            n653TBW03_APPROVAL_USER_ID = ((GXutil.strcmp("", A653TBW03_APPROVAL_USER_ID)==0) ? true : false) ;
            Z658TBW03_INPUT_END_USER_ID = httpContext.cgiGet( "Z658TBW03_INPUT_END_USER_ID") ;
            n658TBW03_INPUT_END_USER_ID = ((GXutil.strcmp("", A658TBW03_INPUT_END_USER_ID)==0) ? true : false) ;
            Z757TBW03_CRT_USER_ID = httpContext.cgiGet( "Z757TBW03_CRT_USER_ID") ;
            n757TBW03_CRT_USER_ID = ((GXutil.strcmp("", A757TBW03_CRT_USER_ID)==0) ? true : false) ;
            Z761TBW03_UPD_USER_ID = httpContext.cgiGet( "Z761TBW03_UPD_USER_ID") ;
            n761TBW03_UPD_USER_ID = ((GXutil.strcmp("", A761TBW03_UPD_USER_ID)==0) ? true : false) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ".", ",")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ".", ",")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV8Pgmname = httpContext.cgiGet( "vPGMNAME") ;
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
               A625TBW03_SESSION_ID = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A625TBW03_SESSION_ID", A625TBW03_SESSION_ID);
               A626TBW03_APP_ID = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A626TBW03_APP_ID", A626TBW03_APP_ID);
               A627TBW03_DISP_DATETIME = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A627TBW03_DISP_DATETIME", A627TBW03_DISP_DATETIME);
               A628TBW03_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A628TBW03_STUDY_ID", GXutil.ltrim( GXutil.str( A628TBW03_STUDY_ID, 10, 0)));
               A629TBW03_SUBJECT_ID = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A629TBW03_SUBJECT_ID", GXutil.ltrim( GXutil.str( A629TBW03_SUBJECT_ID, 6, 0)));
               A630TBW03_CRF_ID = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A630TBW03_CRF_ID", GXutil.ltrim( GXutil.str( A630TBW03_CRF_ID, 4, 0)));
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
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_confdelete"), 0, "");
         }
         else
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_mustconfirm"), 0, "");
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
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("8")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void S1132( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV8Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Pgmname", AV8Pgmname);
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void zm1641( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z637TBW03_OUTER_SUBJECT_ID = T00163_A637TBW03_OUTER_SUBJECT_ID[0] ;
            Z638TBW03_CRF_LATEST_VERSION = T00163_A638TBW03_CRF_LATEST_VERSION[0] ;
            Z639TBW03_CRF_INPUT_LEVEL = T00163_A639TBW03_CRF_INPUT_LEVEL[0] ;
            Z640TBW03_LOCK_FLG = T00163_A640TBW03_LOCK_FLG[0] ;
            Z641TBW03_LOCK_DATETIME = T00163_A641TBW03_LOCK_DATETIME[0] ;
            Z644TBW03_LOCK_AUTH_CD = T00163_A644TBW03_LOCK_AUTH_CD[0] ;
            Z645TBW03_UPLOAD_DATETIME = T00163_A645TBW03_UPLOAD_DATETIME[0] ;
            Z648TBW03_UPLOAD_AUTH_CD = T00163_A648TBW03_UPLOAD_AUTH_CD[0] ;
            Z649TBW03_DM_ARRIVAL_FLG = T00163_A649TBW03_DM_ARRIVAL_FLG[0] ;
            Z650TBW03_DM_ARRIVAL_DATETIME = T00163_A650TBW03_DM_ARRIVAL_DATETIME[0] ;
            Z651TBW03_APPROVAL_FLG = T00163_A651TBW03_APPROVAL_FLG[0] ;
            Z652TBW03_APPROVAL_DATETIME = T00163_A652TBW03_APPROVAL_DATETIME[0] ;
            Z655TBW03_APPROVAL_AUTH_CD = T00163_A655TBW03_APPROVAL_AUTH_CD[0] ;
            Z656TBW03_INPUT_END_FLG = T00163_A656TBW03_INPUT_END_FLG[0] ;
            Z657TBW03_INPUT_END_DATETIME = T00163_A657TBW03_INPUT_END_DATETIME[0] ;
            Z660TBW03_INPUT_END_AUTH_CD = T00163_A660TBW03_INPUT_END_AUTH_CD[0] ;
            Z755TBW03_DEL_FLG = T00163_A755TBW03_DEL_FLG[0] ;
            Z756TBW03_CRT_DATETIME = T00163_A756TBW03_CRT_DATETIME[0] ;
            Z759TBW03_CRT_PROG_NM = T00163_A759TBW03_CRT_PROG_NM[0] ;
            Z760TBW03_UPD_DATETIME = T00163_A760TBW03_UPD_DATETIME[0] ;
            Z763TBW03_UPD_PROG_NM = T00163_A763TBW03_UPD_PROG_NM[0] ;
            Z764TBW03_UPD_CNT = T00163_A764TBW03_UPD_CNT[0] ;
            Z634TBW03_SITE_ID = T00163_A634TBW03_SITE_ID[0] ;
            Z642TBW03_LOCK_USER_ID = T00163_A642TBW03_LOCK_USER_ID[0] ;
            Z646TBW03_UPLOAD_USER_ID = T00163_A646TBW03_UPLOAD_USER_ID[0] ;
            Z653TBW03_APPROVAL_USER_ID = T00163_A653TBW03_APPROVAL_USER_ID[0] ;
            Z658TBW03_INPUT_END_USER_ID = T00163_A658TBW03_INPUT_END_USER_ID[0] ;
            Z757TBW03_CRT_USER_ID = T00163_A757TBW03_CRT_USER_ID[0] ;
            Z761TBW03_UPD_USER_ID = T00163_A761TBW03_UPD_USER_ID[0] ;
         }
         else
         {
            Z637TBW03_OUTER_SUBJECT_ID = A637TBW03_OUTER_SUBJECT_ID ;
            Z638TBW03_CRF_LATEST_VERSION = A638TBW03_CRF_LATEST_VERSION ;
            Z639TBW03_CRF_INPUT_LEVEL = A639TBW03_CRF_INPUT_LEVEL ;
            Z640TBW03_LOCK_FLG = A640TBW03_LOCK_FLG ;
            Z641TBW03_LOCK_DATETIME = A641TBW03_LOCK_DATETIME ;
            Z644TBW03_LOCK_AUTH_CD = A644TBW03_LOCK_AUTH_CD ;
            Z645TBW03_UPLOAD_DATETIME = A645TBW03_UPLOAD_DATETIME ;
            Z648TBW03_UPLOAD_AUTH_CD = A648TBW03_UPLOAD_AUTH_CD ;
            Z649TBW03_DM_ARRIVAL_FLG = A649TBW03_DM_ARRIVAL_FLG ;
            Z650TBW03_DM_ARRIVAL_DATETIME = A650TBW03_DM_ARRIVAL_DATETIME ;
            Z651TBW03_APPROVAL_FLG = A651TBW03_APPROVAL_FLG ;
            Z652TBW03_APPROVAL_DATETIME = A652TBW03_APPROVAL_DATETIME ;
            Z655TBW03_APPROVAL_AUTH_CD = A655TBW03_APPROVAL_AUTH_CD ;
            Z656TBW03_INPUT_END_FLG = A656TBW03_INPUT_END_FLG ;
            Z657TBW03_INPUT_END_DATETIME = A657TBW03_INPUT_END_DATETIME ;
            Z660TBW03_INPUT_END_AUTH_CD = A660TBW03_INPUT_END_AUTH_CD ;
            Z755TBW03_DEL_FLG = A755TBW03_DEL_FLG ;
            Z756TBW03_CRT_DATETIME = A756TBW03_CRT_DATETIME ;
            Z759TBW03_CRT_PROG_NM = A759TBW03_CRT_PROG_NM ;
            Z760TBW03_UPD_DATETIME = A760TBW03_UPD_DATETIME ;
            Z763TBW03_UPD_PROG_NM = A763TBW03_UPD_PROG_NM ;
            Z764TBW03_UPD_CNT = A764TBW03_UPD_CNT ;
            Z634TBW03_SITE_ID = A634TBW03_SITE_ID ;
            Z642TBW03_LOCK_USER_ID = A642TBW03_LOCK_USER_ID ;
            Z646TBW03_UPLOAD_USER_ID = A646TBW03_UPLOAD_USER_ID ;
            Z653TBW03_APPROVAL_USER_ID = A653TBW03_APPROVAL_USER_ID ;
            Z658TBW03_INPUT_END_USER_ID = A658TBW03_INPUT_END_USER_ID ;
            Z757TBW03_CRT_USER_ID = A757TBW03_CRT_USER_ID ;
            Z761TBW03_UPD_USER_ID = A761TBW03_UPD_USER_ID ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z625TBW03_SESSION_ID = A625TBW03_SESSION_ID ;
         Z626TBW03_APP_ID = A626TBW03_APP_ID ;
         Z627TBW03_DISP_DATETIME = A627TBW03_DISP_DATETIME ;
         Z629TBW03_SUBJECT_ID = A629TBW03_SUBJECT_ID ;
         Z637TBW03_OUTER_SUBJECT_ID = A637TBW03_OUTER_SUBJECT_ID ;
         Z638TBW03_CRF_LATEST_VERSION = A638TBW03_CRF_LATEST_VERSION ;
         Z639TBW03_CRF_INPUT_LEVEL = A639TBW03_CRF_INPUT_LEVEL ;
         Z640TBW03_LOCK_FLG = A640TBW03_LOCK_FLG ;
         Z641TBW03_LOCK_DATETIME = A641TBW03_LOCK_DATETIME ;
         Z644TBW03_LOCK_AUTH_CD = A644TBW03_LOCK_AUTH_CD ;
         Z645TBW03_UPLOAD_DATETIME = A645TBW03_UPLOAD_DATETIME ;
         Z648TBW03_UPLOAD_AUTH_CD = A648TBW03_UPLOAD_AUTH_CD ;
         Z649TBW03_DM_ARRIVAL_FLG = A649TBW03_DM_ARRIVAL_FLG ;
         Z650TBW03_DM_ARRIVAL_DATETIME = A650TBW03_DM_ARRIVAL_DATETIME ;
         Z651TBW03_APPROVAL_FLG = A651TBW03_APPROVAL_FLG ;
         Z652TBW03_APPROVAL_DATETIME = A652TBW03_APPROVAL_DATETIME ;
         Z655TBW03_APPROVAL_AUTH_CD = A655TBW03_APPROVAL_AUTH_CD ;
         Z656TBW03_INPUT_END_FLG = A656TBW03_INPUT_END_FLG ;
         Z657TBW03_INPUT_END_DATETIME = A657TBW03_INPUT_END_DATETIME ;
         Z660TBW03_INPUT_END_AUTH_CD = A660TBW03_INPUT_END_AUTH_CD ;
         Z755TBW03_DEL_FLG = A755TBW03_DEL_FLG ;
         Z756TBW03_CRT_DATETIME = A756TBW03_CRT_DATETIME ;
         Z759TBW03_CRT_PROG_NM = A759TBW03_CRT_PROG_NM ;
         Z760TBW03_UPD_DATETIME = A760TBW03_UPD_DATETIME ;
         Z763TBW03_UPD_PROG_NM = A763TBW03_UPD_PROG_NM ;
         Z764TBW03_UPD_CNT = A764TBW03_UPD_CNT ;
         Z628TBW03_STUDY_ID = A628TBW03_STUDY_ID ;
         Z630TBW03_CRF_ID = A630TBW03_CRF_ID ;
         Z634TBW03_SITE_ID = A634TBW03_SITE_ID ;
         Z642TBW03_LOCK_USER_ID = A642TBW03_LOCK_USER_ID ;
         Z646TBW03_UPLOAD_USER_ID = A646TBW03_UPLOAD_USER_ID ;
         Z653TBW03_APPROVAL_USER_ID = A653TBW03_APPROVAL_USER_ID ;
         Z658TBW03_INPUT_END_USER_ID = A658TBW03_INPUT_END_USER_ID ;
         Z757TBW03_CRT_USER_ID = A757TBW03_CRT_USER_ID ;
         Z761TBW03_UPD_USER_ID = A761TBW03_UPD_USER_ID ;
         Z631TBW03_CRF_NM = A631TBW03_CRF_NM ;
         Z632TBW03_CRF_SNM = A632TBW03_CRF_SNM ;
         Z633TBW03_CRF_ORDER = A633TBW03_CRF_ORDER ;
         Z635TBW03_SITE_NM = A635TBW03_SITE_NM ;
         Z636TBW03_SITE_RYAK_NM = A636TBW03_SITE_RYAK_NM ;
         Z643TBW03_LOCK_USER_NM = A643TBW03_LOCK_USER_NM ;
         Z647TBW03_UPLOAD_USER_NM = A647TBW03_UPLOAD_USER_NM ;
         Z654TBW03_APPROVAL_USER_NM = A654TBW03_APPROVAL_USER_NM ;
         Z659TBW03_INPUT_END_USER_NM = A659TBW03_INPUT_END_USER_NM ;
         Z758TBW03_CRT_USER_NM = A758TBW03_CRT_USER_NM ;
         Z762TBW03_UPD_USER_NM = A762TBW03_UPD_USER_NM ;
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
      pr_default.execute(10, new Object[] {A625TBW03_SESSION_ID, A626TBW03_APP_ID, A627TBW03_DISP_DATETIME, new Long(A628TBW03_STUDY_ID), new Integer(A629TBW03_SUBJECT_ID), new Short(A630TBW03_CRF_ID)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound41 = (short)(1) ;
         A631TBW03_CRF_NM = T001612_A631TBW03_CRF_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A631TBW03_CRF_NM", A631TBW03_CRF_NM);
         n631TBW03_CRF_NM = T001612_n631TBW03_CRF_NM[0] ;
         A632TBW03_CRF_SNM = T001612_A632TBW03_CRF_SNM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A632TBW03_CRF_SNM", A632TBW03_CRF_SNM);
         n632TBW03_CRF_SNM = T001612_n632TBW03_CRF_SNM[0] ;
         A633TBW03_CRF_ORDER = T001612_A633TBW03_CRF_ORDER[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A633TBW03_CRF_ORDER", GXutil.ltrim( GXutil.str( A633TBW03_CRF_ORDER, 5, 0)));
         n633TBW03_CRF_ORDER = T001612_n633TBW03_CRF_ORDER[0] ;
         A635TBW03_SITE_NM = T001612_A635TBW03_SITE_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A635TBW03_SITE_NM", A635TBW03_SITE_NM);
         n635TBW03_SITE_NM = T001612_n635TBW03_SITE_NM[0] ;
         A636TBW03_SITE_RYAK_NM = T001612_A636TBW03_SITE_RYAK_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A636TBW03_SITE_RYAK_NM", A636TBW03_SITE_RYAK_NM);
         n636TBW03_SITE_RYAK_NM = T001612_n636TBW03_SITE_RYAK_NM[0] ;
         A637TBW03_OUTER_SUBJECT_ID = T001612_A637TBW03_OUTER_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A637TBW03_OUTER_SUBJECT_ID", A637TBW03_OUTER_SUBJECT_ID);
         n637TBW03_OUTER_SUBJECT_ID = T001612_n637TBW03_OUTER_SUBJECT_ID[0] ;
         A638TBW03_CRF_LATEST_VERSION = T001612_A638TBW03_CRF_LATEST_VERSION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A638TBW03_CRF_LATEST_VERSION", GXutil.ltrim( GXutil.str( A638TBW03_CRF_LATEST_VERSION, 4, 0)));
         n638TBW03_CRF_LATEST_VERSION = T001612_n638TBW03_CRF_LATEST_VERSION[0] ;
         A639TBW03_CRF_INPUT_LEVEL = T001612_A639TBW03_CRF_INPUT_LEVEL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A639TBW03_CRF_INPUT_LEVEL", GXutil.ltrim( GXutil.str( A639TBW03_CRF_INPUT_LEVEL, 2, 0)));
         n639TBW03_CRF_INPUT_LEVEL = T001612_n639TBW03_CRF_INPUT_LEVEL[0] ;
         A640TBW03_LOCK_FLG = T001612_A640TBW03_LOCK_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A640TBW03_LOCK_FLG", A640TBW03_LOCK_FLG);
         n640TBW03_LOCK_FLG = T001612_n640TBW03_LOCK_FLG[0] ;
         A641TBW03_LOCK_DATETIME = T001612_A641TBW03_LOCK_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A641TBW03_LOCK_DATETIME", localUtil.ttoc( A641TBW03_LOCK_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n641TBW03_LOCK_DATETIME = T001612_n641TBW03_LOCK_DATETIME[0] ;
         A643TBW03_LOCK_USER_NM = T001612_A643TBW03_LOCK_USER_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A643TBW03_LOCK_USER_NM", A643TBW03_LOCK_USER_NM);
         n643TBW03_LOCK_USER_NM = T001612_n643TBW03_LOCK_USER_NM[0] ;
         A644TBW03_LOCK_AUTH_CD = T001612_A644TBW03_LOCK_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A644TBW03_LOCK_AUTH_CD", A644TBW03_LOCK_AUTH_CD);
         n644TBW03_LOCK_AUTH_CD = T001612_n644TBW03_LOCK_AUTH_CD[0] ;
         A645TBW03_UPLOAD_DATETIME = T001612_A645TBW03_UPLOAD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A645TBW03_UPLOAD_DATETIME", localUtil.ttoc( A645TBW03_UPLOAD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n645TBW03_UPLOAD_DATETIME = T001612_n645TBW03_UPLOAD_DATETIME[0] ;
         A647TBW03_UPLOAD_USER_NM = T001612_A647TBW03_UPLOAD_USER_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A647TBW03_UPLOAD_USER_NM", A647TBW03_UPLOAD_USER_NM);
         n647TBW03_UPLOAD_USER_NM = T001612_n647TBW03_UPLOAD_USER_NM[0] ;
         A648TBW03_UPLOAD_AUTH_CD = T001612_A648TBW03_UPLOAD_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A648TBW03_UPLOAD_AUTH_CD", A648TBW03_UPLOAD_AUTH_CD);
         n648TBW03_UPLOAD_AUTH_CD = T001612_n648TBW03_UPLOAD_AUTH_CD[0] ;
         A649TBW03_DM_ARRIVAL_FLG = T001612_A649TBW03_DM_ARRIVAL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A649TBW03_DM_ARRIVAL_FLG", A649TBW03_DM_ARRIVAL_FLG);
         n649TBW03_DM_ARRIVAL_FLG = T001612_n649TBW03_DM_ARRIVAL_FLG[0] ;
         A650TBW03_DM_ARRIVAL_DATETIME = T001612_A650TBW03_DM_ARRIVAL_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A650TBW03_DM_ARRIVAL_DATETIME", localUtil.ttoc( A650TBW03_DM_ARRIVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n650TBW03_DM_ARRIVAL_DATETIME = T001612_n650TBW03_DM_ARRIVAL_DATETIME[0] ;
         A651TBW03_APPROVAL_FLG = T001612_A651TBW03_APPROVAL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A651TBW03_APPROVAL_FLG", A651TBW03_APPROVAL_FLG);
         n651TBW03_APPROVAL_FLG = T001612_n651TBW03_APPROVAL_FLG[0] ;
         A652TBW03_APPROVAL_DATETIME = T001612_A652TBW03_APPROVAL_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A652TBW03_APPROVAL_DATETIME", localUtil.ttoc( A652TBW03_APPROVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n652TBW03_APPROVAL_DATETIME = T001612_n652TBW03_APPROVAL_DATETIME[0] ;
         A654TBW03_APPROVAL_USER_NM = T001612_A654TBW03_APPROVAL_USER_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A654TBW03_APPROVAL_USER_NM", A654TBW03_APPROVAL_USER_NM);
         n654TBW03_APPROVAL_USER_NM = T001612_n654TBW03_APPROVAL_USER_NM[0] ;
         A655TBW03_APPROVAL_AUTH_CD = T001612_A655TBW03_APPROVAL_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A655TBW03_APPROVAL_AUTH_CD", A655TBW03_APPROVAL_AUTH_CD);
         n655TBW03_APPROVAL_AUTH_CD = T001612_n655TBW03_APPROVAL_AUTH_CD[0] ;
         A656TBW03_INPUT_END_FLG = T001612_A656TBW03_INPUT_END_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A656TBW03_INPUT_END_FLG", A656TBW03_INPUT_END_FLG);
         n656TBW03_INPUT_END_FLG = T001612_n656TBW03_INPUT_END_FLG[0] ;
         A657TBW03_INPUT_END_DATETIME = T001612_A657TBW03_INPUT_END_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A657TBW03_INPUT_END_DATETIME", localUtil.ttoc( A657TBW03_INPUT_END_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n657TBW03_INPUT_END_DATETIME = T001612_n657TBW03_INPUT_END_DATETIME[0] ;
         A659TBW03_INPUT_END_USER_NM = T001612_A659TBW03_INPUT_END_USER_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A659TBW03_INPUT_END_USER_NM", A659TBW03_INPUT_END_USER_NM);
         n659TBW03_INPUT_END_USER_NM = T001612_n659TBW03_INPUT_END_USER_NM[0] ;
         A660TBW03_INPUT_END_AUTH_CD = T001612_A660TBW03_INPUT_END_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A660TBW03_INPUT_END_AUTH_CD", A660TBW03_INPUT_END_AUTH_CD);
         n660TBW03_INPUT_END_AUTH_CD = T001612_n660TBW03_INPUT_END_AUTH_CD[0] ;
         A755TBW03_DEL_FLG = T001612_A755TBW03_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A755TBW03_DEL_FLG", A755TBW03_DEL_FLG);
         n755TBW03_DEL_FLG = T001612_n755TBW03_DEL_FLG[0] ;
         A756TBW03_CRT_DATETIME = T001612_A756TBW03_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A756TBW03_CRT_DATETIME", localUtil.ttoc( A756TBW03_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n756TBW03_CRT_DATETIME = T001612_n756TBW03_CRT_DATETIME[0] ;
         A758TBW03_CRT_USER_NM = T001612_A758TBW03_CRT_USER_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758TBW03_CRT_USER_NM", A758TBW03_CRT_USER_NM);
         n758TBW03_CRT_USER_NM = T001612_n758TBW03_CRT_USER_NM[0] ;
         A759TBW03_CRT_PROG_NM = T001612_A759TBW03_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A759TBW03_CRT_PROG_NM", A759TBW03_CRT_PROG_NM);
         n759TBW03_CRT_PROG_NM = T001612_n759TBW03_CRT_PROG_NM[0] ;
         A760TBW03_UPD_DATETIME = T001612_A760TBW03_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A760TBW03_UPD_DATETIME", localUtil.ttoc( A760TBW03_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n760TBW03_UPD_DATETIME = T001612_n760TBW03_UPD_DATETIME[0] ;
         A762TBW03_UPD_USER_NM = T001612_A762TBW03_UPD_USER_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A762TBW03_UPD_USER_NM", A762TBW03_UPD_USER_NM);
         n762TBW03_UPD_USER_NM = T001612_n762TBW03_UPD_USER_NM[0] ;
         A763TBW03_UPD_PROG_NM = T001612_A763TBW03_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A763TBW03_UPD_PROG_NM", A763TBW03_UPD_PROG_NM);
         n763TBW03_UPD_PROG_NM = T001612_n763TBW03_UPD_PROG_NM[0] ;
         A764TBW03_UPD_CNT = T001612_A764TBW03_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A764TBW03_UPD_CNT", GXutil.ltrim( GXutil.str( A764TBW03_UPD_CNT, 10, 0)));
         n764TBW03_UPD_CNT = T001612_n764TBW03_UPD_CNT[0] ;
         A634TBW03_SITE_ID = T001612_A634TBW03_SITE_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A634TBW03_SITE_ID", A634TBW03_SITE_ID);
         n634TBW03_SITE_ID = T001612_n634TBW03_SITE_ID[0] ;
         A642TBW03_LOCK_USER_ID = T001612_A642TBW03_LOCK_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A642TBW03_LOCK_USER_ID", A642TBW03_LOCK_USER_ID);
         n642TBW03_LOCK_USER_ID = T001612_n642TBW03_LOCK_USER_ID[0] ;
         A646TBW03_UPLOAD_USER_ID = T001612_A646TBW03_UPLOAD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A646TBW03_UPLOAD_USER_ID", A646TBW03_UPLOAD_USER_ID);
         n646TBW03_UPLOAD_USER_ID = T001612_n646TBW03_UPLOAD_USER_ID[0] ;
         A653TBW03_APPROVAL_USER_ID = T001612_A653TBW03_APPROVAL_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A653TBW03_APPROVAL_USER_ID", A653TBW03_APPROVAL_USER_ID);
         n653TBW03_APPROVAL_USER_ID = T001612_n653TBW03_APPROVAL_USER_ID[0] ;
         A658TBW03_INPUT_END_USER_ID = T001612_A658TBW03_INPUT_END_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A658TBW03_INPUT_END_USER_ID", A658TBW03_INPUT_END_USER_ID);
         n658TBW03_INPUT_END_USER_ID = T001612_n658TBW03_INPUT_END_USER_ID[0] ;
         A757TBW03_CRT_USER_ID = T001612_A757TBW03_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A757TBW03_CRT_USER_ID", A757TBW03_CRT_USER_ID);
         n757TBW03_CRT_USER_ID = T001612_n757TBW03_CRT_USER_ID[0] ;
         A761TBW03_UPD_USER_ID = T001612_A761TBW03_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A761TBW03_UPD_USER_ID", A761TBW03_UPD_USER_ID);
         n761TBW03_UPD_USER_ID = T001612_n761TBW03_UPD_USER_ID[0] ;
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
      pr_default.execute(2, new Object[] {new Long(A628TBW03_STUDY_ID), new Short(A630TBW03_CRF_ID)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         AnyError628 = 1 ;
         AnyError630 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'CRF検索ワーク・CRFサブタイプ'", "ForeignKeyNotFound", 1, "TBW03_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBW03_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( AnyError628 == 0 ) && ( AnyError630 == 0 ) )
      {
         A631TBW03_CRF_NM = T00164_A631TBW03_CRF_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A631TBW03_CRF_NM", A631TBW03_CRF_NM);
         n631TBW03_CRF_NM = T00164_n631TBW03_CRF_NM[0] ;
         A632TBW03_CRF_SNM = T00164_A632TBW03_CRF_SNM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A632TBW03_CRF_SNM", A632TBW03_CRF_SNM);
         n632TBW03_CRF_SNM = T00164_n632TBW03_CRF_SNM[0] ;
         A633TBW03_CRF_ORDER = T00164_A633TBW03_CRF_ORDER[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A633TBW03_CRF_ORDER", GXutil.ltrim( GXutil.str( A633TBW03_CRF_ORDER, 5, 0)));
         n633TBW03_CRF_ORDER = T00164_n633TBW03_CRF_ORDER[0] ;
      }
      pr_default.close(2);
      /* Using cursor T00165 */
      pr_default.execute(3, new Object[] {new Boolean(n634TBW03_SITE_ID), A634TBW03_SITE_ID});
      if ( (pr_default.getStatus(3) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A634TBW03_SITE_ID)==0) ) )
         {
            AnyError634 = 1 ;
            httpContext.GX_msglist.addItem("該当レコードなし'CRF検索ワーク・施設サブタイプ'", "ForeignKeyNotFound", 1, "TBW03_SITE_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBW03_SITE_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      if ( AnyError634 == 0 )
      {
         A635TBW03_SITE_NM = T00165_A635TBW03_SITE_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A635TBW03_SITE_NM", A635TBW03_SITE_NM);
         n635TBW03_SITE_NM = T00165_n635TBW03_SITE_NM[0] ;
         A636TBW03_SITE_RYAK_NM = T00165_A636TBW03_SITE_RYAK_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A636TBW03_SITE_RYAK_NM", A636TBW03_SITE_RYAK_NM);
         n636TBW03_SITE_RYAK_NM = T00165_n636TBW03_SITE_RYAK_NM[0] ;
      }
      pr_default.close(3);
      if ( ! ( GXutil.nullDate().equals(A641TBW03_LOCK_DATETIME) || (( A641TBW03_LOCK_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A641TBW03_LOCK_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　ロック日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      /* Using cursor T00166 */
      pr_default.execute(4, new Object[] {new Boolean(n642TBW03_LOCK_USER_ID), A642TBW03_LOCK_USER_ID});
      if ( (pr_default.getStatus(4) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A642TBW03_LOCK_USER_ID)==0) ) )
         {
            AnyError642 = 1 ;
            httpContext.GX_msglist.addItem("該当レコードなし'CRF検索ワーク・ロックユーザーサブタイプ'", "ForeignKeyNotFound", 1, "TBW03_LOCK_USER_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBW03_LOCK_USER_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      if ( AnyError642 == 0 )
      {
         A643TBW03_LOCK_USER_NM = T00166_A643TBW03_LOCK_USER_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A643TBW03_LOCK_USER_NM", A643TBW03_LOCK_USER_NM);
         n643TBW03_LOCK_USER_NM = T00166_n643TBW03_LOCK_USER_NM[0] ;
      }
      pr_default.close(4);
      if ( ! ( GXutil.nullDate().equals(A645TBW03_UPLOAD_DATETIME) || (( A645TBW03_UPLOAD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A645TBW03_UPLOAD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　アップロード日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      /* Using cursor T00167 */
      pr_default.execute(5, new Object[] {new Boolean(n646TBW03_UPLOAD_USER_ID), A646TBW03_UPLOAD_USER_ID});
      if ( (pr_default.getStatus(5) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A646TBW03_UPLOAD_USER_ID)==0) ) )
         {
            AnyError646 = 1 ;
            httpContext.GX_msglist.addItem("該当レコードなし'CRF検索ワーク・アップロードユーザーサブタイプ'", "ForeignKeyNotFound", 1, "TBW03_UPLOAD_USER_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBW03_UPLOAD_USER_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      if ( AnyError646 == 0 )
      {
         A647TBW03_UPLOAD_USER_NM = T00167_A647TBW03_UPLOAD_USER_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A647TBW03_UPLOAD_USER_NM", A647TBW03_UPLOAD_USER_NM);
         n647TBW03_UPLOAD_USER_NM = T00167_n647TBW03_UPLOAD_USER_NM[0] ;
      }
      pr_default.close(5);
      if ( ! ( GXutil.nullDate().equals(A650TBW03_DM_ARRIVAL_DATETIME) || (( A650TBW03_DM_ARRIVAL_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A650TBW03_DM_ARRIVAL_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　DM到着日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A652TBW03_APPROVAL_DATETIME) || (( A652TBW03_APPROVAL_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A652TBW03_APPROVAL_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　承認日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      /* Using cursor T00168 */
      pr_default.execute(6, new Object[] {new Boolean(n653TBW03_APPROVAL_USER_ID), A653TBW03_APPROVAL_USER_ID});
      if ( (pr_default.getStatus(6) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A653TBW03_APPROVAL_USER_ID)==0) ) )
         {
            AnyError653 = 1 ;
            httpContext.GX_msglist.addItem("該当レコードなし'CRF検索ワーク・承認ユーザーサブタイプ'", "ForeignKeyNotFound", 1, "TBW03_APPROVAL_USER_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBW03_APPROVAL_USER_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      if ( AnyError653 == 0 )
      {
         A654TBW03_APPROVAL_USER_NM = T00168_A654TBW03_APPROVAL_USER_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A654TBW03_APPROVAL_USER_NM", A654TBW03_APPROVAL_USER_NM);
         n654TBW03_APPROVAL_USER_NM = T00168_n654TBW03_APPROVAL_USER_NM[0] ;
      }
      pr_default.close(6);
      if ( ! ( GXutil.nullDate().equals(A657TBW03_INPUT_END_DATETIME) || (( A657TBW03_INPUT_END_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A657TBW03_INPUT_END_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　データ固定日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      /* Using cursor T00169 */
      pr_default.execute(7, new Object[] {new Boolean(n658TBW03_INPUT_END_USER_ID), A658TBW03_INPUT_END_USER_ID});
      if ( (pr_default.getStatus(7) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A658TBW03_INPUT_END_USER_ID)==0) ) )
         {
            AnyError658 = 1 ;
            httpContext.GX_msglist.addItem("該当レコードなし'CRF検索ワーク・データ固定ユーザーサブタイプ'", "ForeignKeyNotFound", 1, "TBW03_INPUT_END_USER_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBW03_INPUT_END_USER_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      if ( AnyError658 == 0 )
      {
         A659TBW03_INPUT_END_USER_NM = T00169_A659TBW03_INPUT_END_USER_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A659TBW03_INPUT_END_USER_NM", A659TBW03_INPUT_END_USER_NM);
         n659TBW03_INPUT_END_USER_NM = T00169_n659TBW03_INPUT_END_USER_NM[0] ;
      }
      pr_default.close(7);
      if ( ! ( GXutil.nullDate().equals(A756TBW03_CRT_DATETIME) || (( A756TBW03_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A756TBW03_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      /* Using cursor T001610 */
      pr_default.execute(8, new Object[] {new Boolean(n757TBW03_CRT_USER_ID), A757TBW03_CRT_USER_ID});
      if ( (pr_default.getStatus(8) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A757TBW03_CRT_USER_ID)==0) ) )
         {
            AnyError757 = 1 ;
            httpContext.GX_msglist.addItem("該当レコードなし'CRF検索ワーク・作成ユーザーサブタイプ'", "ForeignKeyNotFound", 1, "TBW03_CRT_USER_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBW03_CRT_USER_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      if ( AnyError757 == 0 )
      {
         A758TBW03_CRT_USER_NM = T001610_A758TBW03_CRT_USER_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758TBW03_CRT_USER_NM", A758TBW03_CRT_USER_NM);
         n758TBW03_CRT_USER_NM = T001610_n758TBW03_CRT_USER_NM[0] ;
      }
      pr_default.close(8);
      if ( ! ( GXutil.nullDate().equals(A760TBW03_UPD_DATETIME) || (( A760TBW03_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A760TBW03_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      /* Using cursor T001611 */
      pr_default.execute(9, new Object[] {new Boolean(n761TBW03_UPD_USER_ID), A761TBW03_UPD_USER_ID});
      if ( (pr_default.getStatus(9) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A761TBW03_UPD_USER_ID)==0) ) )
         {
            AnyError761 = 1 ;
            httpContext.GX_msglist.addItem("該当レコードなし'CRF検索ワーク・更新ユーザーサブタイプ'", "ForeignKeyNotFound", 1, "TBW03_UPD_USER_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBW03_UPD_USER_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      if ( AnyError761 == 0 )
      {
         A762TBW03_UPD_USER_NM = T001611_A762TBW03_UPD_USER_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A762TBW03_UPD_USER_NM", A762TBW03_UPD_USER_NM);
         n762TBW03_UPD_USER_NM = T001611_n762TBW03_UPD_USER_NM[0] ;
      }
      pr_default.close(9);
   }

   public void closeExtendedTableCursors1641( )
   {
      pr_default.close(2);
      pr_default.close(3);
      pr_default.close(4);
      pr_default.close(5);
      pr_default.close(6);
      pr_default.close(7);
      pr_default.close(8);
      pr_default.close(9);
   }

   public void enableDisable( )
   {
   }

   public void gxload_9( long A628TBW03_STUDY_ID ,
                         short A630TBW03_CRF_ID )
   {
      /* Using cursor T001613 */
      pr_default.execute(11, new Object[] {new Long(A628TBW03_STUDY_ID), new Short(A630TBW03_CRF_ID)});
      if ( (pr_default.getStatus(11) == 101) )
      {
         AnyError628 = 1 ;
         AnyError630 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'CRF検索ワーク・CRFサブタイプ'", "ForeignKeyNotFound", 1, "TBW03_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBW03_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( AnyError628 == 0 ) && ( AnyError630 == 0 ) )
      {
         A631TBW03_CRF_NM = T001613_A631TBW03_CRF_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A631TBW03_CRF_NM", A631TBW03_CRF_NM);
         n631TBW03_CRF_NM = T001613_n631TBW03_CRF_NM[0] ;
         A632TBW03_CRF_SNM = T001613_A632TBW03_CRF_SNM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A632TBW03_CRF_SNM", A632TBW03_CRF_SNM);
         n632TBW03_CRF_SNM = T001613_n632TBW03_CRF_SNM[0] ;
         A633TBW03_CRF_ORDER = T001613_A633TBW03_CRF_ORDER[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A633TBW03_CRF_ORDER", GXutil.ltrim( GXutil.str( A633TBW03_CRF_ORDER, 5, 0)));
         n633TBW03_CRF_ORDER = T001613_n633TBW03_CRF_ORDER[0] ;
      }
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A631TBW03_CRF_NM))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A632TBW03_CRF_SNM))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A633TBW03_CRF_ORDER, (byte)(5), (byte)(0), ".", "")))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(11);
   }

   public void gxload_10( String A634TBW03_SITE_ID )
   {
      /* Using cursor T001614 */
      pr_default.execute(12, new Object[] {new Boolean(n634TBW03_SITE_ID), A634TBW03_SITE_ID});
      if ( (pr_default.getStatus(12) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A634TBW03_SITE_ID)==0) ) )
         {
            AnyError634 = 1 ;
            httpContext.GX_msglist.addItem("該当レコードなし'CRF検索ワーク・施設サブタイプ'", "ForeignKeyNotFound", 1, "TBW03_SITE_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBW03_SITE_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      if ( AnyError634 == 0 )
      {
         A635TBW03_SITE_NM = T001614_A635TBW03_SITE_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A635TBW03_SITE_NM", A635TBW03_SITE_NM);
         n635TBW03_SITE_NM = T001614_n635TBW03_SITE_NM[0] ;
         A636TBW03_SITE_RYAK_NM = T001614_A636TBW03_SITE_RYAK_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A636TBW03_SITE_RYAK_NM", A636TBW03_SITE_RYAK_NM);
         n636TBW03_SITE_RYAK_NM = T001614_n636TBW03_SITE_RYAK_NM[0] ;
      }
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A635TBW03_SITE_NM))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A636TBW03_SITE_RYAK_NM))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(12);
   }

   public void gxload_11( String A642TBW03_LOCK_USER_ID )
   {
      /* Using cursor T001615 */
      pr_default.execute(13, new Object[] {new Boolean(n642TBW03_LOCK_USER_ID), A642TBW03_LOCK_USER_ID});
      if ( (pr_default.getStatus(13) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A642TBW03_LOCK_USER_ID)==0) ) )
         {
            AnyError642 = 1 ;
            httpContext.GX_msglist.addItem("該当レコードなし'CRF検索ワーク・ロックユーザーサブタイプ'", "ForeignKeyNotFound", 1, "TBW03_LOCK_USER_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBW03_LOCK_USER_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      if ( AnyError642 == 0 )
      {
         A643TBW03_LOCK_USER_NM = T001615_A643TBW03_LOCK_USER_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A643TBW03_LOCK_USER_NM", A643TBW03_LOCK_USER_NM);
         n643TBW03_LOCK_USER_NM = T001615_n643TBW03_LOCK_USER_NM[0] ;
      }
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A643TBW03_LOCK_USER_NM))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(13);
   }

   public void gxload_12( String A646TBW03_UPLOAD_USER_ID )
   {
      /* Using cursor T001616 */
      pr_default.execute(14, new Object[] {new Boolean(n646TBW03_UPLOAD_USER_ID), A646TBW03_UPLOAD_USER_ID});
      if ( (pr_default.getStatus(14) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A646TBW03_UPLOAD_USER_ID)==0) ) )
         {
            AnyError646 = 1 ;
            httpContext.GX_msglist.addItem("該当レコードなし'CRF検索ワーク・アップロードユーザーサブタイプ'", "ForeignKeyNotFound", 1, "TBW03_UPLOAD_USER_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBW03_UPLOAD_USER_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      if ( AnyError646 == 0 )
      {
         A647TBW03_UPLOAD_USER_NM = T001616_A647TBW03_UPLOAD_USER_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A647TBW03_UPLOAD_USER_NM", A647TBW03_UPLOAD_USER_NM);
         n647TBW03_UPLOAD_USER_NM = T001616_n647TBW03_UPLOAD_USER_NM[0] ;
      }
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A647TBW03_UPLOAD_USER_NM))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(14);
   }

   public void gxload_13( String A653TBW03_APPROVAL_USER_ID )
   {
      /* Using cursor T001617 */
      pr_default.execute(15, new Object[] {new Boolean(n653TBW03_APPROVAL_USER_ID), A653TBW03_APPROVAL_USER_ID});
      if ( (pr_default.getStatus(15) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A653TBW03_APPROVAL_USER_ID)==0) ) )
         {
            AnyError653 = 1 ;
            httpContext.GX_msglist.addItem("該当レコードなし'CRF検索ワーク・承認ユーザーサブタイプ'", "ForeignKeyNotFound", 1, "TBW03_APPROVAL_USER_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBW03_APPROVAL_USER_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      if ( AnyError653 == 0 )
      {
         A654TBW03_APPROVAL_USER_NM = T001617_A654TBW03_APPROVAL_USER_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A654TBW03_APPROVAL_USER_NM", A654TBW03_APPROVAL_USER_NM);
         n654TBW03_APPROVAL_USER_NM = T001617_n654TBW03_APPROVAL_USER_NM[0] ;
      }
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A654TBW03_APPROVAL_USER_NM))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(15);
   }

   public void gxload_14( String A658TBW03_INPUT_END_USER_ID )
   {
      /* Using cursor T001618 */
      pr_default.execute(16, new Object[] {new Boolean(n658TBW03_INPUT_END_USER_ID), A658TBW03_INPUT_END_USER_ID});
      if ( (pr_default.getStatus(16) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A658TBW03_INPUT_END_USER_ID)==0) ) )
         {
            AnyError658 = 1 ;
            httpContext.GX_msglist.addItem("該当レコードなし'CRF検索ワーク・データ固定ユーザーサブタイプ'", "ForeignKeyNotFound", 1, "TBW03_INPUT_END_USER_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBW03_INPUT_END_USER_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      if ( AnyError658 == 0 )
      {
         A659TBW03_INPUT_END_USER_NM = T001618_A659TBW03_INPUT_END_USER_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A659TBW03_INPUT_END_USER_NM", A659TBW03_INPUT_END_USER_NM);
         n659TBW03_INPUT_END_USER_NM = T001618_n659TBW03_INPUT_END_USER_NM[0] ;
      }
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A659TBW03_INPUT_END_USER_NM))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(16);
   }

   public void gxload_15( String A757TBW03_CRT_USER_ID )
   {
      /* Using cursor T001619 */
      pr_default.execute(17, new Object[] {new Boolean(n757TBW03_CRT_USER_ID), A757TBW03_CRT_USER_ID});
      if ( (pr_default.getStatus(17) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A757TBW03_CRT_USER_ID)==0) ) )
         {
            AnyError757 = 1 ;
            httpContext.GX_msglist.addItem("該当レコードなし'CRF検索ワーク・作成ユーザーサブタイプ'", "ForeignKeyNotFound", 1, "TBW03_CRT_USER_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBW03_CRT_USER_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      if ( AnyError757 == 0 )
      {
         A758TBW03_CRT_USER_NM = T001619_A758TBW03_CRT_USER_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758TBW03_CRT_USER_NM", A758TBW03_CRT_USER_NM);
         n758TBW03_CRT_USER_NM = T001619_n758TBW03_CRT_USER_NM[0] ;
      }
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A758TBW03_CRT_USER_NM))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(17);
   }

   public void gxload_16( String A761TBW03_UPD_USER_ID )
   {
      /* Using cursor T001620 */
      pr_default.execute(18, new Object[] {new Boolean(n761TBW03_UPD_USER_ID), A761TBW03_UPD_USER_ID});
      if ( (pr_default.getStatus(18) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A761TBW03_UPD_USER_ID)==0) ) )
         {
            AnyError761 = 1 ;
            httpContext.GX_msglist.addItem("該当レコードなし'CRF検索ワーク・更新ユーザーサブタイプ'", "ForeignKeyNotFound", 1, "TBW03_UPD_USER_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBW03_UPD_USER_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      if ( AnyError761 == 0 )
      {
         A762TBW03_UPD_USER_NM = T001620_A762TBW03_UPD_USER_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A762TBW03_UPD_USER_NM", A762TBW03_UPD_USER_NM);
         n762TBW03_UPD_USER_NM = T001620_n762TBW03_UPD_USER_NM[0] ;
      }
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A762TBW03_UPD_USER_NM))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(18);
   }

   public void getKey1641( )
   {
      /* Using cursor T001621 */
      pr_default.execute(19, new Object[] {A625TBW03_SESSION_ID, A626TBW03_APP_ID, A627TBW03_DISP_DATETIME, new Long(A628TBW03_STUDY_ID), new Integer(A629TBW03_SUBJECT_ID), new Short(A630TBW03_CRF_ID)});
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound41 = (short)(1) ;
      }
      else
      {
         RcdFound41 = (short)(0) ;
      }
      pr_default.close(19);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00163 */
      pr_default.execute(1, new Object[] {A625TBW03_SESSION_ID, A626TBW03_APP_ID, A627TBW03_DISP_DATETIME, new Long(A628TBW03_STUDY_ID), new Integer(A629TBW03_SUBJECT_ID), new Short(A630TBW03_CRF_ID)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1641( 8) ;
         RcdFound41 = (short)(1) ;
         A625TBW03_SESSION_ID = T00163_A625TBW03_SESSION_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A625TBW03_SESSION_ID", A625TBW03_SESSION_ID);
         A626TBW03_APP_ID = T00163_A626TBW03_APP_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A626TBW03_APP_ID", A626TBW03_APP_ID);
         A627TBW03_DISP_DATETIME = T00163_A627TBW03_DISP_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A627TBW03_DISP_DATETIME", A627TBW03_DISP_DATETIME);
         A629TBW03_SUBJECT_ID = T00163_A629TBW03_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A629TBW03_SUBJECT_ID", GXutil.ltrim( GXutil.str( A629TBW03_SUBJECT_ID, 6, 0)));
         A637TBW03_OUTER_SUBJECT_ID = T00163_A637TBW03_OUTER_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A637TBW03_OUTER_SUBJECT_ID", A637TBW03_OUTER_SUBJECT_ID);
         n637TBW03_OUTER_SUBJECT_ID = T00163_n637TBW03_OUTER_SUBJECT_ID[0] ;
         A638TBW03_CRF_LATEST_VERSION = T00163_A638TBW03_CRF_LATEST_VERSION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A638TBW03_CRF_LATEST_VERSION", GXutil.ltrim( GXutil.str( A638TBW03_CRF_LATEST_VERSION, 4, 0)));
         n638TBW03_CRF_LATEST_VERSION = T00163_n638TBW03_CRF_LATEST_VERSION[0] ;
         A639TBW03_CRF_INPUT_LEVEL = T00163_A639TBW03_CRF_INPUT_LEVEL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A639TBW03_CRF_INPUT_LEVEL", GXutil.ltrim( GXutil.str( A639TBW03_CRF_INPUT_LEVEL, 2, 0)));
         n639TBW03_CRF_INPUT_LEVEL = T00163_n639TBW03_CRF_INPUT_LEVEL[0] ;
         A640TBW03_LOCK_FLG = T00163_A640TBW03_LOCK_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A640TBW03_LOCK_FLG", A640TBW03_LOCK_FLG);
         n640TBW03_LOCK_FLG = T00163_n640TBW03_LOCK_FLG[0] ;
         A641TBW03_LOCK_DATETIME = T00163_A641TBW03_LOCK_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A641TBW03_LOCK_DATETIME", localUtil.ttoc( A641TBW03_LOCK_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n641TBW03_LOCK_DATETIME = T00163_n641TBW03_LOCK_DATETIME[0] ;
         A644TBW03_LOCK_AUTH_CD = T00163_A644TBW03_LOCK_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A644TBW03_LOCK_AUTH_CD", A644TBW03_LOCK_AUTH_CD);
         n644TBW03_LOCK_AUTH_CD = T00163_n644TBW03_LOCK_AUTH_CD[0] ;
         A645TBW03_UPLOAD_DATETIME = T00163_A645TBW03_UPLOAD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A645TBW03_UPLOAD_DATETIME", localUtil.ttoc( A645TBW03_UPLOAD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n645TBW03_UPLOAD_DATETIME = T00163_n645TBW03_UPLOAD_DATETIME[0] ;
         A648TBW03_UPLOAD_AUTH_CD = T00163_A648TBW03_UPLOAD_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A648TBW03_UPLOAD_AUTH_CD", A648TBW03_UPLOAD_AUTH_CD);
         n648TBW03_UPLOAD_AUTH_CD = T00163_n648TBW03_UPLOAD_AUTH_CD[0] ;
         A649TBW03_DM_ARRIVAL_FLG = T00163_A649TBW03_DM_ARRIVAL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A649TBW03_DM_ARRIVAL_FLG", A649TBW03_DM_ARRIVAL_FLG);
         n649TBW03_DM_ARRIVAL_FLG = T00163_n649TBW03_DM_ARRIVAL_FLG[0] ;
         A650TBW03_DM_ARRIVAL_DATETIME = T00163_A650TBW03_DM_ARRIVAL_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A650TBW03_DM_ARRIVAL_DATETIME", localUtil.ttoc( A650TBW03_DM_ARRIVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n650TBW03_DM_ARRIVAL_DATETIME = T00163_n650TBW03_DM_ARRIVAL_DATETIME[0] ;
         A651TBW03_APPROVAL_FLG = T00163_A651TBW03_APPROVAL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A651TBW03_APPROVAL_FLG", A651TBW03_APPROVAL_FLG);
         n651TBW03_APPROVAL_FLG = T00163_n651TBW03_APPROVAL_FLG[0] ;
         A652TBW03_APPROVAL_DATETIME = T00163_A652TBW03_APPROVAL_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A652TBW03_APPROVAL_DATETIME", localUtil.ttoc( A652TBW03_APPROVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n652TBW03_APPROVAL_DATETIME = T00163_n652TBW03_APPROVAL_DATETIME[0] ;
         A655TBW03_APPROVAL_AUTH_CD = T00163_A655TBW03_APPROVAL_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A655TBW03_APPROVAL_AUTH_CD", A655TBW03_APPROVAL_AUTH_CD);
         n655TBW03_APPROVAL_AUTH_CD = T00163_n655TBW03_APPROVAL_AUTH_CD[0] ;
         A656TBW03_INPUT_END_FLG = T00163_A656TBW03_INPUT_END_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A656TBW03_INPUT_END_FLG", A656TBW03_INPUT_END_FLG);
         n656TBW03_INPUT_END_FLG = T00163_n656TBW03_INPUT_END_FLG[0] ;
         A657TBW03_INPUT_END_DATETIME = T00163_A657TBW03_INPUT_END_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A657TBW03_INPUT_END_DATETIME", localUtil.ttoc( A657TBW03_INPUT_END_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n657TBW03_INPUT_END_DATETIME = T00163_n657TBW03_INPUT_END_DATETIME[0] ;
         A660TBW03_INPUT_END_AUTH_CD = T00163_A660TBW03_INPUT_END_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A660TBW03_INPUT_END_AUTH_CD", A660TBW03_INPUT_END_AUTH_CD);
         n660TBW03_INPUT_END_AUTH_CD = T00163_n660TBW03_INPUT_END_AUTH_CD[0] ;
         A755TBW03_DEL_FLG = T00163_A755TBW03_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A755TBW03_DEL_FLG", A755TBW03_DEL_FLG);
         n755TBW03_DEL_FLG = T00163_n755TBW03_DEL_FLG[0] ;
         A756TBW03_CRT_DATETIME = T00163_A756TBW03_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A756TBW03_CRT_DATETIME", localUtil.ttoc( A756TBW03_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n756TBW03_CRT_DATETIME = T00163_n756TBW03_CRT_DATETIME[0] ;
         A759TBW03_CRT_PROG_NM = T00163_A759TBW03_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A759TBW03_CRT_PROG_NM", A759TBW03_CRT_PROG_NM);
         n759TBW03_CRT_PROG_NM = T00163_n759TBW03_CRT_PROG_NM[0] ;
         A760TBW03_UPD_DATETIME = T00163_A760TBW03_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A760TBW03_UPD_DATETIME", localUtil.ttoc( A760TBW03_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n760TBW03_UPD_DATETIME = T00163_n760TBW03_UPD_DATETIME[0] ;
         A763TBW03_UPD_PROG_NM = T00163_A763TBW03_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A763TBW03_UPD_PROG_NM", A763TBW03_UPD_PROG_NM);
         n763TBW03_UPD_PROG_NM = T00163_n763TBW03_UPD_PROG_NM[0] ;
         A764TBW03_UPD_CNT = T00163_A764TBW03_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A764TBW03_UPD_CNT", GXutil.ltrim( GXutil.str( A764TBW03_UPD_CNT, 10, 0)));
         n764TBW03_UPD_CNT = T00163_n764TBW03_UPD_CNT[0] ;
         A628TBW03_STUDY_ID = T00163_A628TBW03_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A628TBW03_STUDY_ID", GXutil.ltrim( GXutil.str( A628TBW03_STUDY_ID, 10, 0)));
         A630TBW03_CRF_ID = T00163_A630TBW03_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A630TBW03_CRF_ID", GXutil.ltrim( GXutil.str( A630TBW03_CRF_ID, 4, 0)));
         A634TBW03_SITE_ID = T00163_A634TBW03_SITE_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A634TBW03_SITE_ID", A634TBW03_SITE_ID);
         n634TBW03_SITE_ID = T00163_n634TBW03_SITE_ID[0] ;
         A642TBW03_LOCK_USER_ID = T00163_A642TBW03_LOCK_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A642TBW03_LOCK_USER_ID", A642TBW03_LOCK_USER_ID);
         n642TBW03_LOCK_USER_ID = T00163_n642TBW03_LOCK_USER_ID[0] ;
         A646TBW03_UPLOAD_USER_ID = T00163_A646TBW03_UPLOAD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A646TBW03_UPLOAD_USER_ID", A646TBW03_UPLOAD_USER_ID);
         n646TBW03_UPLOAD_USER_ID = T00163_n646TBW03_UPLOAD_USER_ID[0] ;
         A653TBW03_APPROVAL_USER_ID = T00163_A653TBW03_APPROVAL_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A653TBW03_APPROVAL_USER_ID", A653TBW03_APPROVAL_USER_ID);
         n653TBW03_APPROVAL_USER_ID = T00163_n653TBW03_APPROVAL_USER_ID[0] ;
         A658TBW03_INPUT_END_USER_ID = T00163_A658TBW03_INPUT_END_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A658TBW03_INPUT_END_USER_ID", A658TBW03_INPUT_END_USER_ID);
         n658TBW03_INPUT_END_USER_ID = T00163_n658TBW03_INPUT_END_USER_ID[0] ;
         A757TBW03_CRT_USER_ID = T00163_A757TBW03_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A757TBW03_CRT_USER_ID", A757TBW03_CRT_USER_ID);
         n757TBW03_CRT_USER_ID = T00163_n757TBW03_CRT_USER_ID[0] ;
         A761TBW03_UPD_USER_ID = T00163_A761TBW03_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A761TBW03_UPD_USER_ID", A761TBW03_UPD_USER_ID);
         n761TBW03_UPD_USER_ID = T00163_n761TBW03_UPD_USER_ID[0] ;
         Z625TBW03_SESSION_ID = A625TBW03_SESSION_ID ;
         Z626TBW03_APP_ID = A626TBW03_APP_ID ;
         Z627TBW03_DISP_DATETIME = A627TBW03_DISP_DATETIME ;
         Z628TBW03_STUDY_ID = A628TBW03_STUDY_ID ;
         Z629TBW03_SUBJECT_ID = A629TBW03_SUBJECT_ID ;
         Z630TBW03_CRF_ID = A630TBW03_CRF_ID ;
         sMode41 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1641( ) ;
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
      /* Using cursor T001622 */
      pr_default.execute(20, new Object[] {A625TBW03_SESSION_ID, A625TBW03_SESSION_ID, A626TBW03_APP_ID, A626TBW03_APP_ID, A625TBW03_SESSION_ID, A627TBW03_DISP_DATETIME, A627TBW03_DISP_DATETIME, A626TBW03_APP_ID, A625TBW03_SESSION_ID, new Long(A628TBW03_STUDY_ID), new Long(A628TBW03_STUDY_ID), A627TBW03_DISP_DATETIME, A626TBW03_APP_ID, A625TBW03_SESSION_ID, new Integer(A629TBW03_SUBJECT_ID), new Integer(A629TBW03_SUBJECT_ID), new Long(A628TBW03_STUDY_ID), A627TBW03_DISP_DATETIME, A626TBW03_APP_ID, A625TBW03_SESSION_ID, new Short(A630TBW03_CRF_ID)});
      if ( (pr_default.getStatus(20) != 101) )
      {
         while ( (pr_default.getStatus(20) != 101) && ( ( GXutil.strcmp(T001622_A625TBW03_SESSION_ID[0], A625TBW03_SESSION_ID) < 0 ) || ( GXutil.strcmp(T001622_A625TBW03_SESSION_ID[0], A625TBW03_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001622_A626TBW03_APP_ID[0], A626TBW03_APP_ID) < 0 ) || ( GXutil.strcmp(T001622_A626TBW03_APP_ID[0], A626TBW03_APP_ID) == 0 ) && ( GXutil.strcmp(T001622_A625TBW03_SESSION_ID[0], A625TBW03_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001622_A627TBW03_DISP_DATETIME[0], A627TBW03_DISP_DATETIME) < 0 ) || ( GXutil.strcmp(T001622_A627TBW03_DISP_DATETIME[0], A627TBW03_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001622_A626TBW03_APP_ID[0], A626TBW03_APP_ID) == 0 ) && ( GXutil.strcmp(T001622_A625TBW03_SESSION_ID[0], A625TBW03_SESSION_ID) == 0 ) && ( T001622_A628TBW03_STUDY_ID[0] < A628TBW03_STUDY_ID ) || ( T001622_A628TBW03_STUDY_ID[0] == A628TBW03_STUDY_ID ) && ( GXutil.strcmp(T001622_A627TBW03_DISP_DATETIME[0], A627TBW03_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001622_A626TBW03_APP_ID[0], A626TBW03_APP_ID) == 0 ) && ( GXutil.strcmp(T001622_A625TBW03_SESSION_ID[0], A625TBW03_SESSION_ID) == 0 ) && ( T001622_A629TBW03_SUBJECT_ID[0] < A629TBW03_SUBJECT_ID ) || ( T001622_A629TBW03_SUBJECT_ID[0] == A629TBW03_SUBJECT_ID ) && ( T001622_A628TBW03_STUDY_ID[0] == A628TBW03_STUDY_ID ) && ( GXutil.strcmp(T001622_A627TBW03_DISP_DATETIME[0], A627TBW03_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001622_A626TBW03_APP_ID[0], A626TBW03_APP_ID) == 0 ) && ( GXutil.strcmp(T001622_A625TBW03_SESSION_ID[0], A625TBW03_SESSION_ID) == 0 ) && ( T001622_A630TBW03_CRF_ID[0] < A630TBW03_CRF_ID ) ) )
         {
            pr_default.readNext(20);
         }
         if ( (pr_default.getStatus(20) != 101) && ( ( GXutil.strcmp(T001622_A625TBW03_SESSION_ID[0], A625TBW03_SESSION_ID) > 0 ) || ( GXutil.strcmp(T001622_A625TBW03_SESSION_ID[0], A625TBW03_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001622_A626TBW03_APP_ID[0], A626TBW03_APP_ID) > 0 ) || ( GXutil.strcmp(T001622_A626TBW03_APP_ID[0], A626TBW03_APP_ID) == 0 ) && ( GXutil.strcmp(T001622_A625TBW03_SESSION_ID[0], A625TBW03_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001622_A627TBW03_DISP_DATETIME[0], A627TBW03_DISP_DATETIME) > 0 ) || ( GXutil.strcmp(T001622_A627TBW03_DISP_DATETIME[0], A627TBW03_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001622_A626TBW03_APP_ID[0], A626TBW03_APP_ID) == 0 ) && ( GXutil.strcmp(T001622_A625TBW03_SESSION_ID[0], A625TBW03_SESSION_ID) == 0 ) && ( T001622_A628TBW03_STUDY_ID[0] > A628TBW03_STUDY_ID ) || ( T001622_A628TBW03_STUDY_ID[0] == A628TBW03_STUDY_ID ) && ( GXutil.strcmp(T001622_A627TBW03_DISP_DATETIME[0], A627TBW03_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001622_A626TBW03_APP_ID[0], A626TBW03_APP_ID) == 0 ) && ( GXutil.strcmp(T001622_A625TBW03_SESSION_ID[0], A625TBW03_SESSION_ID) == 0 ) && ( T001622_A629TBW03_SUBJECT_ID[0] > A629TBW03_SUBJECT_ID ) || ( T001622_A629TBW03_SUBJECT_ID[0] == A629TBW03_SUBJECT_ID ) && ( T001622_A628TBW03_STUDY_ID[0] == A628TBW03_STUDY_ID ) && ( GXutil.strcmp(T001622_A627TBW03_DISP_DATETIME[0], A627TBW03_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001622_A626TBW03_APP_ID[0], A626TBW03_APP_ID) == 0 ) && ( GXutil.strcmp(T001622_A625TBW03_SESSION_ID[0], A625TBW03_SESSION_ID) == 0 ) && ( T001622_A630TBW03_CRF_ID[0] > A630TBW03_CRF_ID ) ) )
         {
            A625TBW03_SESSION_ID = T001622_A625TBW03_SESSION_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A625TBW03_SESSION_ID", A625TBW03_SESSION_ID);
            A626TBW03_APP_ID = T001622_A626TBW03_APP_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A626TBW03_APP_ID", A626TBW03_APP_ID);
            A627TBW03_DISP_DATETIME = T001622_A627TBW03_DISP_DATETIME[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A627TBW03_DISP_DATETIME", A627TBW03_DISP_DATETIME);
            A628TBW03_STUDY_ID = T001622_A628TBW03_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A628TBW03_STUDY_ID", GXutil.ltrim( GXutil.str( A628TBW03_STUDY_ID, 10, 0)));
            A629TBW03_SUBJECT_ID = T001622_A629TBW03_SUBJECT_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A629TBW03_SUBJECT_ID", GXutil.ltrim( GXutil.str( A629TBW03_SUBJECT_ID, 6, 0)));
            A630TBW03_CRF_ID = T001622_A630TBW03_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A630TBW03_CRF_ID", GXutil.ltrim( GXutil.str( A630TBW03_CRF_ID, 4, 0)));
            RcdFound41 = (short)(1) ;
         }
      }
      pr_default.close(20);
   }

   public void move_previous( )
   {
      RcdFound41 = (short)(0) ;
      /* Using cursor T001623 */
      pr_default.execute(21, new Object[] {A625TBW03_SESSION_ID, A625TBW03_SESSION_ID, A626TBW03_APP_ID, A626TBW03_APP_ID, A625TBW03_SESSION_ID, A627TBW03_DISP_DATETIME, A627TBW03_DISP_DATETIME, A626TBW03_APP_ID, A625TBW03_SESSION_ID, new Long(A628TBW03_STUDY_ID), new Long(A628TBW03_STUDY_ID), A627TBW03_DISP_DATETIME, A626TBW03_APP_ID, A625TBW03_SESSION_ID, new Integer(A629TBW03_SUBJECT_ID), new Integer(A629TBW03_SUBJECT_ID), new Long(A628TBW03_STUDY_ID), A627TBW03_DISP_DATETIME, A626TBW03_APP_ID, A625TBW03_SESSION_ID, new Short(A630TBW03_CRF_ID)});
      if ( (pr_default.getStatus(21) != 101) )
      {
         while ( (pr_default.getStatus(21) != 101) && ( ( GXutil.strcmp(T001623_A625TBW03_SESSION_ID[0], A625TBW03_SESSION_ID) > 0 ) || ( GXutil.strcmp(T001623_A625TBW03_SESSION_ID[0], A625TBW03_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001623_A626TBW03_APP_ID[0], A626TBW03_APP_ID) > 0 ) || ( GXutil.strcmp(T001623_A626TBW03_APP_ID[0], A626TBW03_APP_ID) == 0 ) && ( GXutil.strcmp(T001623_A625TBW03_SESSION_ID[0], A625TBW03_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001623_A627TBW03_DISP_DATETIME[0], A627TBW03_DISP_DATETIME) > 0 ) || ( GXutil.strcmp(T001623_A627TBW03_DISP_DATETIME[0], A627TBW03_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001623_A626TBW03_APP_ID[0], A626TBW03_APP_ID) == 0 ) && ( GXutil.strcmp(T001623_A625TBW03_SESSION_ID[0], A625TBW03_SESSION_ID) == 0 ) && ( T001623_A628TBW03_STUDY_ID[0] > A628TBW03_STUDY_ID ) || ( T001623_A628TBW03_STUDY_ID[0] == A628TBW03_STUDY_ID ) && ( GXutil.strcmp(T001623_A627TBW03_DISP_DATETIME[0], A627TBW03_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001623_A626TBW03_APP_ID[0], A626TBW03_APP_ID) == 0 ) && ( GXutil.strcmp(T001623_A625TBW03_SESSION_ID[0], A625TBW03_SESSION_ID) == 0 ) && ( T001623_A629TBW03_SUBJECT_ID[0] > A629TBW03_SUBJECT_ID ) || ( T001623_A629TBW03_SUBJECT_ID[0] == A629TBW03_SUBJECT_ID ) && ( T001623_A628TBW03_STUDY_ID[0] == A628TBW03_STUDY_ID ) && ( GXutil.strcmp(T001623_A627TBW03_DISP_DATETIME[0], A627TBW03_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001623_A626TBW03_APP_ID[0], A626TBW03_APP_ID) == 0 ) && ( GXutil.strcmp(T001623_A625TBW03_SESSION_ID[0], A625TBW03_SESSION_ID) == 0 ) && ( T001623_A630TBW03_CRF_ID[0] > A630TBW03_CRF_ID ) ) )
         {
            pr_default.readNext(21);
         }
         if ( (pr_default.getStatus(21) != 101) && ( ( GXutil.strcmp(T001623_A625TBW03_SESSION_ID[0], A625TBW03_SESSION_ID) < 0 ) || ( GXutil.strcmp(T001623_A625TBW03_SESSION_ID[0], A625TBW03_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001623_A626TBW03_APP_ID[0], A626TBW03_APP_ID) < 0 ) || ( GXutil.strcmp(T001623_A626TBW03_APP_ID[0], A626TBW03_APP_ID) == 0 ) && ( GXutil.strcmp(T001623_A625TBW03_SESSION_ID[0], A625TBW03_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001623_A627TBW03_DISP_DATETIME[0], A627TBW03_DISP_DATETIME) < 0 ) || ( GXutil.strcmp(T001623_A627TBW03_DISP_DATETIME[0], A627TBW03_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001623_A626TBW03_APP_ID[0], A626TBW03_APP_ID) == 0 ) && ( GXutil.strcmp(T001623_A625TBW03_SESSION_ID[0], A625TBW03_SESSION_ID) == 0 ) && ( T001623_A628TBW03_STUDY_ID[0] < A628TBW03_STUDY_ID ) || ( T001623_A628TBW03_STUDY_ID[0] == A628TBW03_STUDY_ID ) && ( GXutil.strcmp(T001623_A627TBW03_DISP_DATETIME[0], A627TBW03_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001623_A626TBW03_APP_ID[0], A626TBW03_APP_ID) == 0 ) && ( GXutil.strcmp(T001623_A625TBW03_SESSION_ID[0], A625TBW03_SESSION_ID) == 0 ) && ( T001623_A629TBW03_SUBJECT_ID[0] < A629TBW03_SUBJECT_ID ) || ( T001623_A629TBW03_SUBJECT_ID[0] == A629TBW03_SUBJECT_ID ) && ( T001623_A628TBW03_STUDY_ID[0] == A628TBW03_STUDY_ID ) && ( GXutil.strcmp(T001623_A627TBW03_DISP_DATETIME[0], A627TBW03_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001623_A626TBW03_APP_ID[0], A626TBW03_APP_ID) == 0 ) && ( GXutil.strcmp(T001623_A625TBW03_SESSION_ID[0], A625TBW03_SESSION_ID) == 0 ) && ( T001623_A630TBW03_CRF_ID[0] < A630TBW03_CRF_ID ) ) )
         {
            A625TBW03_SESSION_ID = T001623_A625TBW03_SESSION_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A625TBW03_SESSION_ID", A625TBW03_SESSION_ID);
            A626TBW03_APP_ID = T001623_A626TBW03_APP_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A626TBW03_APP_ID", A626TBW03_APP_ID);
            A627TBW03_DISP_DATETIME = T001623_A627TBW03_DISP_DATETIME[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A627TBW03_DISP_DATETIME", A627TBW03_DISP_DATETIME);
            A628TBW03_STUDY_ID = T001623_A628TBW03_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A628TBW03_STUDY_ID", GXutil.ltrim( GXutil.str( A628TBW03_STUDY_ID, 10, 0)));
            A629TBW03_SUBJECT_ID = T001623_A629TBW03_SUBJECT_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A629TBW03_SUBJECT_ID", GXutil.ltrim( GXutil.str( A629TBW03_SUBJECT_ID, 6, 0)));
            A630TBW03_CRF_ID = T001623_A630TBW03_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A630TBW03_CRF_ID", GXutil.ltrim( GXutil.str( A630TBW03_CRF_ID, 4, 0)));
            RcdFound41 = (short)(1) ;
         }
      }
      pr_default.close(21);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1641( ) ;
      if ( RcdFound41 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "TBW03_SESSION_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBW03_SESSION_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A625TBW03_SESSION_ID, Z625TBW03_SESSION_ID) != 0 ) || ( GXutil.strcmp(A626TBW03_APP_ID, Z626TBW03_APP_ID) != 0 ) || ( GXutil.strcmp(A627TBW03_DISP_DATETIME, Z627TBW03_DISP_DATETIME) != 0 ) || ( A628TBW03_STUDY_ID != Z628TBW03_STUDY_ID ) || ( A629TBW03_SUBJECT_ID != Z629TBW03_SUBJECT_ID ) || ( A630TBW03_CRF_ID != Z630TBW03_CRF_ID ) )
         {
            A625TBW03_SESSION_ID = Z625TBW03_SESSION_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A625TBW03_SESSION_ID", A625TBW03_SESSION_ID);
            A626TBW03_APP_ID = Z626TBW03_APP_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A626TBW03_APP_ID", A626TBW03_APP_ID);
            A627TBW03_DISP_DATETIME = Z627TBW03_DISP_DATETIME ;
            httpContext.ajax_rsp_assign_attri("", false, "A627TBW03_DISP_DATETIME", A627TBW03_DISP_DATETIME);
            A628TBW03_STUDY_ID = Z628TBW03_STUDY_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A628TBW03_STUDY_ID", GXutil.ltrim( GXutil.str( A628TBW03_STUDY_ID, 10, 0)));
            A629TBW03_SUBJECT_ID = Z629TBW03_SUBJECT_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A629TBW03_SUBJECT_ID", GXutil.ltrim( GXutil.str( A629TBW03_SUBJECT_ID, 6, 0)));
            A630TBW03_CRF_ID = Z630TBW03_CRF_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A630TBW03_CRF_ID", GXutil.ltrim( GXutil.str( A630TBW03_CRF_ID, 4, 0)));
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
         if ( ( GXutil.strcmp(A625TBW03_SESSION_ID, Z625TBW03_SESSION_ID) != 0 ) || ( GXutil.strcmp(A626TBW03_APP_ID, Z626TBW03_APP_ID) != 0 ) || ( GXutil.strcmp(A627TBW03_DISP_DATETIME, Z627TBW03_DISP_DATETIME) != 0 ) || ( A628TBW03_STUDY_ID != Z628TBW03_STUDY_ID ) || ( A629TBW03_SUBJECT_ID != Z629TBW03_SUBJECT_ID ) || ( A630TBW03_CRF_ID != Z630TBW03_CRF_ID ) )
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
      afterTrn( ) ;
   }

   public void btn_delete( )
   {
      if ( ( GXutil.strcmp(A625TBW03_SESSION_ID, Z625TBW03_SESSION_ID) != 0 ) || ( GXutil.strcmp(A626TBW03_APP_ID, Z626TBW03_APP_ID) != 0 ) || ( GXutil.strcmp(A627TBW03_DISP_DATETIME, Z627TBW03_DISP_DATETIME) != 0 ) || ( A628TBW03_STUDY_ID != Z628TBW03_STUDY_ID ) || ( A629TBW03_SUBJECT_ID != Z629TBW03_SUBJECT_ID ) || ( A630TBW03_CRF_ID != Z630TBW03_CRF_ID ) )
      {
         A625TBW03_SESSION_ID = Z625TBW03_SESSION_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A625TBW03_SESSION_ID", A625TBW03_SESSION_ID);
         A626TBW03_APP_ID = Z626TBW03_APP_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A626TBW03_APP_ID", A626TBW03_APP_ID);
         A627TBW03_DISP_DATETIME = Z627TBW03_DISP_DATETIME ;
         httpContext.ajax_rsp_assign_attri("", false, "A627TBW03_DISP_DATETIME", A627TBW03_DISP_DATETIME);
         A628TBW03_STUDY_ID = Z628TBW03_STUDY_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A628TBW03_STUDY_ID", GXutil.ltrim( GXutil.str( A628TBW03_STUDY_ID, 10, 0)));
         A629TBW03_SUBJECT_ID = Z629TBW03_SUBJECT_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A629TBW03_SUBJECT_ID", GXutil.ltrim( GXutil.str( A629TBW03_SUBJECT_ID, 6, 0)));
         A630TBW03_CRF_ID = Z630TBW03_CRF_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A630TBW03_CRF_ID", GXutil.ltrim( GXutil.str( A630TBW03_CRF_ID, 4, 0)));
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
      getByPrimaryKey( ) ;
      CloseOpenCursors();
   }

   public void btn_get( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      getEqualNoModal( ) ;
      if ( RcdFound41 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TBW03_SESSION_ID");
         AnyError = (short)(1) ;
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
      scanStart1641( ) ;
      if ( RcdFound41 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
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
      move_previous( ) ;
      if ( RcdFound41 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
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
      move_next( ) ;
      if ( RcdFound41 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
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
      scanStart1641( ) ;
      if ( RcdFound41 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
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
         pr_default.execute(0, new Object[] {A625TBW03_SESSION_ID, A626TBW03_APP_ID, A627TBW03_DISP_DATETIME, new Long(A628TBW03_STUDY_ID), new Integer(A629TBW03_SUBJECT_ID), new Short(A630TBW03_CRF_ID)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBW03_CRF_SEARCH"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z637TBW03_OUTER_SUBJECT_ID, T00162_A637TBW03_OUTER_SUBJECT_ID[0]) != 0 ) || ( Z638TBW03_CRF_LATEST_VERSION != T00162_A638TBW03_CRF_LATEST_VERSION[0] ) || ( Z639TBW03_CRF_INPUT_LEVEL != T00162_A639TBW03_CRF_INPUT_LEVEL[0] ) || ( GXutil.strcmp(Z640TBW03_LOCK_FLG, T00162_A640TBW03_LOCK_FLG[0]) != 0 ) || !( Z641TBW03_LOCK_DATETIME.equals( T00162_A641TBW03_LOCK_DATETIME[0] ) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z644TBW03_LOCK_AUTH_CD, T00162_A644TBW03_LOCK_AUTH_CD[0]) != 0 ) || !( Z645TBW03_UPLOAD_DATETIME.equals( T00162_A645TBW03_UPLOAD_DATETIME[0] ) ) || ( GXutil.strcmp(Z648TBW03_UPLOAD_AUTH_CD, T00162_A648TBW03_UPLOAD_AUTH_CD[0]) != 0 ) || ( GXutil.strcmp(Z649TBW03_DM_ARRIVAL_FLG, T00162_A649TBW03_DM_ARRIVAL_FLG[0]) != 0 ) || !( Z650TBW03_DM_ARRIVAL_DATETIME.equals( T00162_A650TBW03_DM_ARRIVAL_DATETIME[0] ) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z651TBW03_APPROVAL_FLG, T00162_A651TBW03_APPROVAL_FLG[0]) != 0 ) || !( Z652TBW03_APPROVAL_DATETIME.equals( T00162_A652TBW03_APPROVAL_DATETIME[0] ) ) || ( GXutil.strcmp(Z655TBW03_APPROVAL_AUTH_CD, T00162_A655TBW03_APPROVAL_AUTH_CD[0]) != 0 ) || ( GXutil.strcmp(Z656TBW03_INPUT_END_FLG, T00162_A656TBW03_INPUT_END_FLG[0]) != 0 ) || !( Z657TBW03_INPUT_END_DATETIME.equals( T00162_A657TBW03_INPUT_END_DATETIME[0] ) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z660TBW03_INPUT_END_AUTH_CD, T00162_A660TBW03_INPUT_END_AUTH_CD[0]) != 0 ) || ( GXutil.strcmp(Z755TBW03_DEL_FLG, T00162_A755TBW03_DEL_FLG[0]) != 0 ) || !( Z756TBW03_CRT_DATETIME.equals( T00162_A756TBW03_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z759TBW03_CRT_PROG_NM, T00162_A759TBW03_CRT_PROG_NM[0]) != 0 ) || !( Z760TBW03_UPD_DATETIME.equals( T00162_A760TBW03_UPD_DATETIME[0] ) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z763TBW03_UPD_PROG_NM, T00162_A763TBW03_UPD_PROG_NM[0]) != 0 ) || ( Z764TBW03_UPD_CNT != T00162_A764TBW03_UPD_CNT[0] ) || ( GXutil.strcmp(Z634TBW03_SITE_ID, T00162_A634TBW03_SITE_ID[0]) != 0 ) || ( GXutil.strcmp(Z642TBW03_LOCK_USER_ID, T00162_A642TBW03_LOCK_USER_ID[0]) != 0 ) || ( GXutil.strcmp(Z646TBW03_UPLOAD_USER_ID, T00162_A646TBW03_UPLOAD_USER_ID[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z653TBW03_APPROVAL_USER_ID, T00162_A653TBW03_APPROVAL_USER_ID[0]) != 0 ) || ( GXutil.strcmp(Z658TBW03_INPUT_END_USER_ID, T00162_A658TBW03_INPUT_END_USER_ID[0]) != 0 ) || ( GXutil.strcmp(Z757TBW03_CRT_USER_ID, T00162_A757TBW03_CRT_USER_ID[0]) != 0 ) || ( GXutil.strcmp(Z761TBW03_UPD_USER_ID, T00162_A761TBW03_UPD_USER_ID[0]) != 0 ) )
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
                  /* Using cursor T001624 */
                  pr_default.execute(22, new Object[] {A625TBW03_SESSION_ID, A626TBW03_APP_ID, A627TBW03_DISP_DATETIME, new Integer(A629TBW03_SUBJECT_ID), new Boolean(n637TBW03_OUTER_SUBJECT_ID), A637TBW03_OUTER_SUBJECT_ID, new Boolean(n638TBW03_CRF_LATEST_VERSION), new Short(A638TBW03_CRF_LATEST_VERSION), new Boolean(n639TBW03_CRF_INPUT_LEVEL), new Byte(A639TBW03_CRF_INPUT_LEVEL), new Boolean(n640TBW03_LOCK_FLG), A640TBW03_LOCK_FLG, new Boolean(n641TBW03_LOCK_DATETIME), A641TBW03_LOCK_DATETIME, new Boolean(n644TBW03_LOCK_AUTH_CD), A644TBW03_LOCK_AUTH_CD, new Boolean(n645TBW03_UPLOAD_DATETIME), A645TBW03_UPLOAD_DATETIME, new Boolean(n648TBW03_UPLOAD_AUTH_CD), A648TBW03_UPLOAD_AUTH_CD, new Boolean(n649TBW03_DM_ARRIVAL_FLG), A649TBW03_DM_ARRIVAL_FLG, new Boolean(n650TBW03_DM_ARRIVAL_DATETIME), A650TBW03_DM_ARRIVAL_DATETIME, new Boolean(n651TBW03_APPROVAL_FLG), A651TBW03_APPROVAL_FLG, new Boolean(n652TBW03_APPROVAL_DATETIME), A652TBW03_APPROVAL_DATETIME, new Boolean(n655TBW03_APPROVAL_AUTH_CD), A655TBW03_APPROVAL_AUTH_CD, new Boolean(n656TBW03_INPUT_END_FLG), A656TBW03_INPUT_END_FLG, new Boolean(n657TBW03_INPUT_END_DATETIME), A657TBW03_INPUT_END_DATETIME, new Boolean(n660TBW03_INPUT_END_AUTH_CD), A660TBW03_INPUT_END_AUTH_CD, new Boolean(n755TBW03_DEL_FLG), A755TBW03_DEL_FLG, new Boolean(n756TBW03_CRT_DATETIME), A756TBW03_CRT_DATETIME, new Boolean(n759TBW03_CRT_PROG_NM), A759TBW03_CRT_PROG_NM, new Boolean(n760TBW03_UPD_DATETIME), A760TBW03_UPD_DATETIME, new Boolean(n763TBW03_UPD_PROG_NM), A763TBW03_UPD_PROG_NM, new Boolean(n764TBW03_UPD_CNT), new Long(A764TBW03_UPD_CNT), new Long(A628TBW03_STUDY_ID), new Short(A630TBW03_CRF_ID), new Boolean(n634TBW03_SITE_ID), A634TBW03_SITE_ID, new Boolean(n642TBW03_LOCK_USER_ID), A642TBW03_LOCK_USER_ID, new Boolean(n646TBW03_UPLOAD_USER_ID), A646TBW03_UPLOAD_USER_ID, new Boolean(n653TBW03_APPROVAL_USER_ID), A653TBW03_APPROVAL_USER_ID, new Boolean(n658TBW03_INPUT_END_USER_ID), A658TBW03_INPUT_END_USER_ID, new Boolean(n757TBW03_CRT_USER_ID), A757TBW03_CRT_USER_ID, new Boolean(n761TBW03_UPD_USER_ID), A761TBW03_UPD_USER_ID});
                  if ( (pr_default.getStatus(22) == 1) )
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
                  /* Using cursor T001625 */
                  pr_default.execute(23, new Object[] {new Boolean(n637TBW03_OUTER_SUBJECT_ID), A637TBW03_OUTER_SUBJECT_ID, new Boolean(n638TBW03_CRF_LATEST_VERSION), new Short(A638TBW03_CRF_LATEST_VERSION), new Boolean(n639TBW03_CRF_INPUT_LEVEL), new Byte(A639TBW03_CRF_INPUT_LEVEL), new Boolean(n640TBW03_LOCK_FLG), A640TBW03_LOCK_FLG, new Boolean(n641TBW03_LOCK_DATETIME), A641TBW03_LOCK_DATETIME, new Boolean(n644TBW03_LOCK_AUTH_CD), A644TBW03_LOCK_AUTH_CD, new Boolean(n645TBW03_UPLOAD_DATETIME), A645TBW03_UPLOAD_DATETIME, new Boolean(n648TBW03_UPLOAD_AUTH_CD), A648TBW03_UPLOAD_AUTH_CD, new Boolean(n649TBW03_DM_ARRIVAL_FLG), A649TBW03_DM_ARRIVAL_FLG, new Boolean(n650TBW03_DM_ARRIVAL_DATETIME), A650TBW03_DM_ARRIVAL_DATETIME, new Boolean(n651TBW03_APPROVAL_FLG), A651TBW03_APPROVAL_FLG, new Boolean(n652TBW03_APPROVAL_DATETIME), A652TBW03_APPROVAL_DATETIME, new Boolean(n655TBW03_APPROVAL_AUTH_CD), A655TBW03_APPROVAL_AUTH_CD, new Boolean(n656TBW03_INPUT_END_FLG), A656TBW03_INPUT_END_FLG, new Boolean(n657TBW03_INPUT_END_DATETIME), A657TBW03_INPUT_END_DATETIME, new Boolean(n660TBW03_INPUT_END_AUTH_CD), A660TBW03_INPUT_END_AUTH_CD, new Boolean(n755TBW03_DEL_FLG), A755TBW03_DEL_FLG, new Boolean(n756TBW03_CRT_DATETIME), A756TBW03_CRT_DATETIME, new Boolean(n759TBW03_CRT_PROG_NM), A759TBW03_CRT_PROG_NM, new Boolean(n760TBW03_UPD_DATETIME), A760TBW03_UPD_DATETIME, new Boolean(n763TBW03_UPD_PROG_NM), A763TBW03_UPD_PROG_NM, new Boolean(n764TBW03_UPD_CNT), new Long(A764TBW03_UPD_CNT), new Boolean(n634TBW03_SITE_ID), A634TBW03_SITE_ID, new Boolean(n642TBW03_LOCK_USER_ID), A642TBW03_LOCK_USER_ID, new Boolean(n646TBW03_UPLOAD_USER_ID), A646TBW03_UPLOAD_USER_ID, new Boolean(n653TBW03_APPROVAL_USER_ID), A653TBW03_APPROVAL_USER_ID, new Boolean(n658TBW03_INPUT_END_USER_ID), A658TBW03_INPUT_END_USER_ID, new Boolean(n757TBW03_CRT_USER_ID), A757TBW03_CRT_USER_ID, new Boolean(n761TBW03_UPD_USER_ID), A761TBW03_UPD_USER_ID, A625TBW03_SESSION_ID, A626TBW03_APP_ID, A627TBW03_DISP_DATETIME, new Long(A628TBW03_STUDY_ID), new Integer(A629TBW03_SUBJECT_ID), new Short(A630TBW03_CRF_ID)});
                  if ( (pr_default.getStatus(23) == 103) )
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
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "");
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
               /* Using cursor T001626 */
               pr_default.execute(24, new Object[] {A625TBW03_SESSION_ID, A626TBW03_APP_ID, A627TBW03_DISP_DATETIME, new Long(A628TBW03_STUDY_ID), new Integer(A629TBW03_SUBJECT_ID), new Short(A630TBW03_CRF_ID)});
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
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucdeleted"), 0, "");
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
         /* Using cursor T001627 */
         pr_default.execute(25, new Object[] {new Long(A628TBW03_STUDY_ID), new Short(A630TBW03_CRF_ID)});
         A631TBW03_CRF_NM = T001627_A631TBW03_CRF_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A631TBW03_CRF_NM", A631TBW03_CRF_NM);
         n631TBW03_CRF_NM = T001627_n631TBW03_CRF_NM[0] ;
         A632TBW03_CRF_SNM = T001627_A632TBW03_CRF_SNM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A632TBW03_CRF_SNM", A632TBW03_CRF_SNM);
         n632TBW03_CRF_SNM = T001627_n632TBW03_CRF_SNM[0] ;
         A633TBW03_CRF_ORDER = T001627_A633TBW03_CRF_ORDER[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A633TBW03_CRF_ORDER", GXutil.ltrim( GXutil.str( A633TBW03_CRF_ORDER, 5, 0)));
         n633TBW03_CRF_ORDER = T001627_n633TBW03_CRF_ORDER[0] ;
         pr_default.close(25);
         /* Using cursor T001628 */
         pr_default.execute(26, new Object[] {new Boolean(n634TBW03_SITE_ID), A634TBW03_SITE_ID});
         A635TBW03_SITE_NM = T001628_A635TBW03_SITE_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A635TBW03_SITE_NM", A635TBW03_SITE_NM);
         n635TBW03_SITE_NM = T001628_n635TBW03_SITE_NM[0] ;
         A636TBW03_SITE_RYAK_NM = T001628_A636TBW03_SITE_RYAK_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A636TBW03_SITE_RYAK_NM", A636TBW03_SITE_RYAK_NM);
         n636TBW03_SITE_RYAK_NM = T001628_n636TBW03_SITE_RYAK_NM[0] ;
         pr_default.close(26);
         /* Using cursor T001629 */
         pr_default.execute(27, new Object[] {new Boolean(n642TBW03_LOCK_USER_ID), A642TBW03_LOCK_USER_ID});
         A643TBW03_LOCK_USER_NM = T001629_A643TBW03_LOCK_USER_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A643TBW03_LOCK_USER_NM", A643TBW03_LOCK_USER_NM);
         n643TBW03_LOCK_USER_NM = T001629_n643TBW03_LOCK_USER_NM[0] ;
         pr_default.close(27);
         /* Using cursor T001630 */
         pr_default.execute(28, new Object[] {new Boolean(n646TBW03_UPLOAD_USER_ID), A646TBW03_UPLOAD_USER_ID});
         A647TBW03_UPLOAD_USER_NM = T001630_A647TBW03_UPLOAD_USER_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A647TBW03_UPLOAD_USER_NM", A647TBW03_UPLOAD_USER_NM);
         n647TBW03_UPLOAD_USER_NM = T001630_n647TBW03_UPLOAD_USER_NM[0] ;
         pr_default.close(28);
         /* Using cursor T001631 */
         pr_default.execute(29, new Object[] {new Boolean(n653TBW03_APPROVAL_USER_ID), A653TBW03_APPROVAL_USER_ID});
         A654TBW03_APPROVAL_USER_NM = T001631_A654TBW03_APPROVAL_USER_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A654TBW03_APPROVAL_USER_NM", A654TBW03_APPROVAL_USER_NM);
         n654TBW03_APPROVAL_USER_NM = T001631_n654TBW03_APPROVAL_USER_NM[0] ;
         pr_default.close(29);
         /* Using cursor T001632 */
         pr_default.execute(30, new Object[] {new Boolean(n658TBW03_INPUT_END_USER_ID), A658TBW03_INPUT_END_USER_ID});
         A659TBW03_INPUT_END_USER_NM = T001632_A659TBW03_INPUT_END_USER_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A659TBW03_INPUT_END_USER_NM", A659TBW03_INPUT_END_USER_NM);
         n659TBW03_INPUT_END_USER_NM = T001632_n659TBW03_INPUT_END_USER_NM[0] ;
         pr_default.close(30);
         /* Using cursor T001633 */
         pr_default.execute(31, new Object[] {new Boolean(n757TBW03_CRT_USER_ID), A757TBW03_CRT_USER_ID});
         A758TBW03_CRT_USER_NM = T001633_A758TBW03_CRT_USER_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758TBW03_CRT_USER_NM", A758TBW03_CRT_USER_NM);
         n758TBW03_CRT_USER_NM = T001633_n758TBW03_CRT_USER_NM[0] ;
         pr_default.close(31);
         /* Using cursor T001634 */
         pr_default.execute(32, new Object[] {new Boolean(n761TBW03_UPD_USER_ID), A761TBW03_UPD_USER_ID});
         A762TBW03_UPD_USER_NM = T001634_A762TBW03_UPD_USER_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A762TBW03_UPD_USER_NM", A762TBW03_UPD_USER_NM);
         n762TBW03_UPD_USER_NM = T001634_n762TBW03_UPD_USER_NM[0] ;
         pr_default.close(32);
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
      /* Using cursor T001635 */
      pr_default.execute(33);
      RcdFound41 = (short)(0) ;
      if ( (pr_default.getStatus(33) != 101) )
      {
         RcdFound41 = (short)(1) ;
         A625TBW03_SESSION_ID = T001635_A625TBW03_SESSION_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A625TBW03_SESSION_ID", A625TBW03_SESSION_ID);
         A626TBW03_APP_ID = T001635_A626TBW03_APP_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A626TBW03_APP_ID", A626TBW03_APP_ID);
         A627TBW03_DISP_DATETIME = T001635_A627TBW03_DISP_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A627TBW03_DISP_DATETIME", A627TBW03_DISP_DATETIME);
         A628TBW03_STUDY_ID = T001635_A628TBW03_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A628TBW03_STUDY_ID", GXutil.ltrim( GXutil.str( A628TBW03_STUDY_ID, 10, 0)));
         A629TBW03_SUBJECT_ID = T001635_A629TBW03_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A629TBW03_SUBJECT_ID", GXutil.ltrim( GXutil.str( A629TBW03_SUBJECT_ID, 6, 0)));
         A630TBW03_CRF_ID = T001635_A630TBW03_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A630TBW03_CRF_ID", GXutil.ltrim( GXutil.str( A630TBW03_CRF_ID, 4, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1641( )
   {
      pr_default.readNext(33);
      RcdFound41 = (short)(0) ;
      if ( (pr_default.getStatus(33) != 101) )
      {
         RcdFound41 = (short)(1) ;
         A625TBW03_SESSION_ID = T001635_A625TBW03_SESSION_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A625TBW03_SESSION_ID", A625TBW03_SESSION_ID);
         A626TBW03_APP_ID = T001635_A626TBW03_APP_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A626TBW03_APP_ID", A626TBW03_APP_ID);
         A627TBW03_DISP_DATETIME = T001635_A627TBW03_DISP_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A627TBW03_DISP_DATETIME", A627TBW03_DISP_DATETIME);
         A628TBW03_STUDY_ID = T001635_A628TBW03_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A628TBW03_STUDY_ID", GXutil.ltrim( GXutil.str( A628TBW03_STUDY_ID, 10, 0)));
         A629TBW03_SUBJECT_ID = T001635_A629TBW03_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A629TBW03_SUBJECT_ID", GXutil.ltrim( GXutil.str( A629TBW03_SUBJECT_ID, 6, 0)));
         A630TBW03_CRF_ID = T001635_A630TBW03_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A630TBW03_CRF_ID", GXutil.ltrim( GXutil.str( A630TBW03_CRF_ID, 4, 0)));
      }
   }

   public void scanEnd1641( )
   {
      pr_default.close(33);
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
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), "IE=EmulateIE7");
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeText( "CRF検索ワーク") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" onsubmit=\"try{return gx.csv.validForm()}catch(e){return true;}\" name=\"MAINFORM\" method=\"post\" action=\""+formatLink("tbw03_crf_search") +"\" class=\""+"Form"+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
   }

   public void renderHtmlCloseForm1641( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z625TBW03_SESSION_ID", GXutil.rtrim( Z625TBW03_SESSION_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z626TBW03_APP_ID", GXutil.rtrim( Z626TBW03_APP_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z627TBW03_DISP_DATETIME", GXutil.rtrim( Z627TBW03_DISP_DATETIME));
      GxWebStd.gx_hidden_field( httpContext, "Z628TBW03_STUDY_ID", GXutil.ltrim( localUtil.ntoc( Z628TBW03_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z629TBW03_SUBJECT_ID", GXutil.ltrim( localUtil.ntoc( Z629TBW03_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z630TBW03_CRF_ID", GXutil.ltrim( localUtil.ntoc( Z630TBW03_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z637TBW03_OUTER_SUBJECT_ID", GXutil.rtrim( Z637TBW03_OUTER_SUBJECT_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z638TBW03_CRF_LATEST_VERSION", GXutil.ltrim( localUtil.ntoc( Z638TBW03_CRF_LATEST_VERSION, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z639TBW03_CRF_INPUT_LEVEL", GXutil.ltrim( localUtil.ntoc( Z639TBW03_CRF_INPUT_LEVEL, (byte)(2), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z640TBW03_LOCK_FLG", GXutil.rtrim( Z640TBW03_LOCK_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z641TBW03_LOCK_DATETIME", localUtil.ttoc( Z641TBW03_LOCK_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z644TBW03_LOCK_AUTH_CD", GXutil.rtrim( Z644TBW03_LOCK_AUTH_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z645TBW03_UPLOAD_DATETIME", localUtil.ttoc( Z645TBW03_UPLOAD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z648TBW03_UPLOAD_AUTH_CD", GXutil.rtrim( Z648TBW03_UPLOAD_AUTH_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z649TBW03_DM_ARRIVAL_FLG", GXutil.rtrim( Z649TBW03_DM_ARRIVAL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z650TBW03_DM_ARRIVAL_DATETIME", localUtil.ttoc( Z650TBW03_DM_ARRIVAL_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z651TBW03_APPROVAL_FLG", GXutil.rtrim( Z651TBW03_APPROVAL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z652TBW03_APPROVAL_DATETIME", localUtil.ttoc( Z652TBW03_APPROVAL_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z655TBW03_APPROVAL_AUTH_CD", GXutil.rtrim( Z655TBW03_APPROVAL_AUTH_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z656TBW03_INPUT_END_FLG", GXutil.rtrim( Z656TBW03_INPUT_END_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z657TBW03_INPUT_END_DATETIME", localUtil.ttoc( Z657TBW03_INPUT_END_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z660TBW03_INPUT_END_AUTH_CD", GXutil.rtrim( Z660TBW03_INPUT_END_AUTH_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z755TBW03_DEL_FLG", GXutil.rtrim( Z755TBW03_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z756TBW03_CRT_DATETIME", localUtil.ttoc( Z756TBW03_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z759TBW03_CRT_PROG_NM", GXutil.rtrim( Z759TBW03_CRT_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z760TBW03_UPD_DATETIME", localUtil.ttoc( Z760TBW03_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z763TBW03_UPD_PROG_NM", GXutil.rtrim( Z763TBW03_UPD_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z764TBW03_UPD_CNT", GXutil.ltrim( localUtil.ntoc( Z764TBW03_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z634TBW03_SITE_ID", GXutil.rtrim( Z634TBW03_SITE_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z642TBW03_LOCK_USER_ID", GXutil.rtrim( Z642TBW03_LOCK_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z646TBW03_UPLOAD_USER_ID", GXutil.rtrim( Z646TBW03_UPLOAD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z653TBW03_APPROVAL_USER_ID", GXutil.rtrim( Z653TBW03_APPROVAL_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z658TBW03_INPUT_END_USER_ID", GXutil.rtrim( Z658TBW03_INPUT_END_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z757TBW03_CRT_USER_ID", GXutil.rtrim( Z757TBW03_CRT_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z761TBW03_UPD_USER_ID", GXutil.rtrim( Z761TBW03_UPD_USER_ID));
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

   public void initializeNonKey1641( )
   {
      A631TBW03_CRF_NM = "" ;
      n631TBW03_CRF_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A631TBW03_CRF_NM", A631TBW03_CRF_NM);
      A632TBW03_CRF_SNM = "" ;
      n632TBW03_CRF_SNM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A632TBW03_CRF_SNM", A632TBW03_CRF_SNM);
      A633TBW03_CRF_ORDER = 0 ;
      n633TBW03_CRF_ORDER = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A633TBW03_CRF_ORDER", GXutil.ltrim( GXutil.str( A633TBW03_CRF_ORDER, 5, 0)));
      A634TBW03_SITE_ID = "" ;
      n634TBW03_SITE_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A634TBW03_SITE_ID", A634TBW03_SITE_ID);
      n634TBW03_SITE_ID = ((GXutil.strcmp("", A634TBW03_SITE_ID)==0) ? true : false) ;
      A635TBW03_SITE_NM = "" ;
      n635TBW03_SITE_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A635TBW03_SITE_NM", A635TBW03_SITE_NM);
      A636TBW03_SITE_RYAK_NM = "" ;
      n636TBW03_SITE_RYAK_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A636TBW03_SITE_RYAK_NM", A636TBW03_SITE_RYAK_NM);
      A637TBW03_OUTER_SUBJECT_ID = "" ;
      n637TBW03_OUTER_SUBJECT_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A637TBW03_OUTER_SUBJECT_ID", A637TBW03_OUTER_SUBJECT_ID);
      n637TBW03_OUTER_SUBJECT_ID = ((GXutil.strcmp("", A637TBW03_OUTER_SUBJECT_ID)==0) ? true : false) ;
      A638TBW03_CRF_LATEST_VERSION = (short)(0) ;
      n638TBW03_CRF_LATEST_VERSION = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A638TBW03_CRF_LATEST_VERSION", GXutil.ltrim( GXutil.str( A638TBW03_CRF_LATEST_VERSION, 4, 0)));
      n638TBW03_CRF_LATEST_VERSION = ((0==A638TBW03_CRF_LATEST_VERSION) ? true : false) ;
      A639TBW03_CRF_INPUT_LEVEL = (byte)(0) ;
      n639TBW03_CRF_INPUT_LEVEL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A639TBW03_CRF_INPUT_LEVEL", GXutil.ltrim( GXutil.str( A639TBW03_CRF_INPUT_LEVEL, 2, 0)));
      n639TBW03_CRF_INPUT_LEVEL = ((0==A639TBW03_CRF_INPUT_LEVEL) ? true : false) ;
      A640TBW03_LOCK_FLG = "" ;
      n640TBW03_LOCK_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A640TBW03_LOCK_FLG", A640TBW03_LOCK_FLG);
      n640TBW03_LOCK_FLG = ((GXutil.strcmp("", A640TBW03_LOCK_FLG)==0) ? true : false) ;
      A641TBW03_LOCK_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n641TBW03_LOCK_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A641TBW03_LOCK_DATETIME", localUtil.ttoc( A641TBW03_LOCK_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n641TBW03_LOCK_DATETIME = (GXutil.nullDate().equals(A641TBW03_LOCK_DATETIME) ? true : false) ;
      A642TBW03_LOCK_USER_ID = "" ;
      n642TBW03_LOCK_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A642TBW03_LOCK_USER_ID", A642TBW03_LOCK_USER_ID);
      n642TBW03_LOCK_USER_ID = ((GXutil.strcmp("", A642TBW03_LOCK_USER_ID)==0) ? true : false) ;
      A643TBW03_LOCK_USER_NM = "" ;
      n643TBW03_LOCK_USER_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A643TBW03_LOCK_USER_NM", A643TBW03_LOCK_USER_NM);
      A644TBW03_LOCK_AUTH_CD = "" ;
      n644TBW03_LOCK_AUTH_CD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A644TBW03_LOCK_AUTH_CD", A644TBW03_LOCK_AUTH_CD);
      n644TBW03_LOCK_AUTH_CD = ((GXutil.strcmp("", A644TBW03_LOCK_AUTH_CD)==0) ? true : false) ;
      A645TBW03_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n645TBW03_UPLOAD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A645TBW03_UPLOAD_DATETIME", localUtil.ttoc( A645TBW03_UPLOAD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n645TBW03_UPLOAD_DATETIME = (GXutil.nullDate().equals(A645TBW03_UPLOAD_DATETIME) ? true : false) ;
      A646TBW03_UPLOAD_USER_ID = "" ;
      n646TBW03_UPLOAD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A646TBW03_UPLOAD_USER_ID", A646TBW03_UPLOAD_USER_ID);
      n646TBW03_UPLOAD_USER_ID = ((GXutil.strcmp("", A646TBW03_UPLOAD_USER_ID)==0) ? true : false) ;
      A647TBW03_UPLOAD_USER_NM = "" ;
      n647TBW03_UPLOAD_USER_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A647TBW03_UPLOAD_USER_NM", A647TBW03_UPLOAD_USER_NM);
      A648TBW03_UPLOAD_AUTH_CD = "" ;
      n648TBW03_UPLOAD_AUTH_CD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A648TBW03_UPLOAD_AUTH_CD", A648TBW03_UPLOAD_AUTH_CD);
      n648TBW03_UPLOAD_AUTH_CD = ((GXutil.strcmp("", A648TBW03_UPLOAD_AUTH_CD)==0) ? true : false) ;
      A649TBW03_DM_ARRIVAL_FLG = "" ;
      n649TBW03_DM_ARRIVAL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A649TBW03_DM_ARRIVAL_FLG", A649TBW03_DM_ARRIVAL_FLG);
      n649TBW03_DM_ARRIVAL_FLG = ((GXutil.strcmp("", A649TBW03_DM_ARRIVAL_FLG)==0) ? true : false) ;
      A650TBW03_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n650TBW03_DM_ARRIVAL_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A650TBW03_DM_ARRIVAL_DATETIME", localUtil.ttoc( A650TBW03_DM_ARRIVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n650TBW03_DM_ARRIVAL_DATETIME = (GXutil.nullDate().equals(A650TBW03_DM_ARRIVAL_DATETIME) ? true : false) ;
      A651TBW03_APPROVAL_FLG = "" ;
      n651TBW03_APPROVAL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A651TBW03_APPROVAL_FLG", A651TBW03_APPROVAL_FLG);
      n651TBW03_APPROVAL_FLG = ((GXutil.strcmp("", A651TBW03_APPROVAL_FLG)==0) ? true : false) ;
      A652TBW03_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n652TBW03_APPROVAL_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A652TBW03_APPROVAL_DATETIME", localUtil.ttoc( A652TBW03_APPROVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n652TBW03_APPROVAL_DATETIME = (GXutil.nullDate().equals(A652TBW03_APPROVAL_DATETIME) ? true : false) ;
      A653TBW03_APPROVAL_USER_ID = "" ;
      n653TBW03_APPROVAL_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A653TBW03_APPROVAL_USER_ID", A653TBW03_APPROVAL_USER_ID);
      n653TBW03_APPROVAL_USER_ID = ((GXutil.strcmp("", A653TBW03_APPROVAL_USER_ID)==0) ? true : false) ;
      A654TBW03_APPROVAL_USER_NM = "" ;
      n654TBW03_APPROVAL_USER_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A654TBW03_APPROVAL_USER_NM", A654TBW03_APPROVAL_USER_NM);
      A655TBW03_APPROVAL_AUTH_CD = "" ;
      n655TBW03_APPROVAL_AUTH_CD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A655TBW03_APPROVAL_AUTH_CD", A655TBW03_APPROVAL_AUTH_CD);
      n655TBW03_APPROVAL_AUTH_CD = ((GXutil.strcmp("", A655TBW03_APPROVAL_AUTH_CD)==0) ? true : false) ;
      A656TBW03_INPUT_END_FLG = "" ;
      n656TBW03_INPUT_END_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A656TBW03_INPUT_END_FLG", A656TBW03_INPUT_END_FLG);
      n656TBW03_INPUT_END_FLG = ((GXutil.strcmp("", A656TBW03_INPUT_END_FLG)==0) ? true : false) ;
      A657TBW03_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n657TBW03_INPUT_END_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A657TBW03_INPUT_END_DATETIME", localUtil.ttoc( A657TBW03_INPUT_END_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n657TBW03_INPUT_END_DATETIME = (GXutil.nullDate().equals(A657TBW03_INPUT_END_DATETIME) ? true : false) ;
      A658TBW03_INPUT_END_USER_ID = "" ;
      n658TBW03_INPUT_END_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A658TBW03_INPUT_END_USER_ID", A658TBW03_INPUT_END_USER_ID);
      n658TBW03_INPUT_END_USER_ID = ((GXutil.strcmp("", A658TBW03_INPUT_END_USER_ID)==0) ? true : false) ;
      A659TBW03_INPUT_END_USER_NM = "" ;
      n659TBW03_INPUT_END_USER_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A659TBW03_INPUT_END_USER_NM", A659TBW03_INPUT_END_USER_NM);
      A660TBW03_INPUT_END_AUTH_CD = "" ;
      n660TBW03_INPUT_END_AUTH_CD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A660TBW03_INPUT_END_AUTH_CD", A660TBW03_INPUT_END_AUTH_CD);
      n660TBW03_INPUT_END_AUTH_CD = ((GXutil.strcmp("", A660TBW03_INPUT_END_AUTH_CD)==0) ? true : false) ;
      A755TBW03_DEL_FLG = "" ;
      n755TBW03_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A755TBW03_DEL_FLG", A755TBW03_DEL_FLG);
      n755TBW03_DEL_FLG = ((GXutil.strcmp("", A755TBW03_DEL_FLG)==0) ? true : false) ;
      A756TBW03_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n756TBW03_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A756TBW03_CRT_DATETIME", localUtil.ttoc( A756TBW03_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n756TBW03_CRT_DATETIME = (GXutil.nullDate().equals(A756TBW03_CRT_DATETIME) ? true : false) ;
      A757TBW03_CRT_USER_ID = "" ;
      n757TBW03_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A757TBW03_CRT_USER_ID", A757TBW03_CRT_USER_ID);
      n757TBW03_CRT_USER_ID = ((GXutil.strcmp("", A757TBW03_CRT_USER_ID)==0) ? true : false) ;
      A758TBW03_CRT_USER_NM = "" ;
      n758TBW03_CRT_USER_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A758TBW03_CRT_USER_NM", A758TBW03_CRT_USER_NM);
      A759TBW03_CRT_PROG_NM = "" ;
      n759TBW03_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A759TBW03_CRT_PROG_NM", A759TBW03_CRT_PROG_NM);
      n759TBW03_CRT_PROG_NM = ((GXutil.strcmp("", A759TBW03_CRT_PROG_NM)==0) ? true : false) ;
      A760TBW03_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n760TBW03_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A760TBW03_UPD_DATETIME", localUtil.ttoc( A760TBW03_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n760TBW03_UPD_DATETIME = (GXutil.nullDate().equals(A760TBW03_UPD_DATETIME) ? true : false) ;
      A761TBW03_UPD_USER_ID = "" ;
      n761TBW03_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A761TBW03_UPD_USER_ID", A761TBW03_UPD_USER_ID);
      n761TBW03_UPD_USER_ID = ((GXutil.strcmp("", A761TBW03_UPD_USER_ID)==0) ? true : false) ;
      A762TBW03_UPD_USER_NM = "" ;
      n762TBW03_UPD_USER_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A762TBW03_UPD_USER_NM", A762TBW03_UPD_USER_NM);
      A763TBW03_UPD_PROG_NM = "" ;
      n763TBW03_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A763TBW03_UPD_PROG_NM", A763TBW03_UPD_PROG_NM);
      n763TBW03_UPD_PROG_NM = ((GXutil.strcmp("", A763TBW03_UPD_PROG_NM)==0) ? true : false) ;
      A764TBW03_UPD_CNT = 0 ;
      n764TBW03_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A764TBW03_UPD_CNT", GXutil.ltrim( GXutil.str( A764TBW03_UPD_CNT, 10, 0)));
      n764TBW03_UPD_CNT = ((0==A764TBW03_UPD_CNT) ? true : false) ;
   }

   public void initAll1641( )
   {
      A625TBW03_SESSION_ID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A625TBW03_SESSION_ID", A625TBW03_SESSION_ID);
      A626TBW03_APP_ID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A626TBW03_APP_ID", A626TBW03_APP_ID);
      A627TBW03_DISP_DATETIME = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A627TBW03_DISP_DATETIME", A627TBW03_DISP_DATETIME);
      A628TBW03_STUDY_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A628TBW03_STUDY_ID", GXutil.ltrim( GXutil.str( A628TBW03_STUDY_ID, 10, 0)));
      A629TBW03_SUBJECT_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A629TBW03_SUBJECT_ID", GXutil.ltrim( GXutil.str( A629TBW03_SUBJECT_ID, 6, 0)));
      A630TBW03_CRF_ID = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A630TBW03_CRF_ID", GXutil.ltrim( GXutil.str( A630TBW03_CRF_ID, 4, 0)));
      initializeNonKey1641( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?14564864");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?58720");
      httpContext.AddJavascriptSource("tbw03_crf_search.js", "?14564866");
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
      getEqualNoModal( ) ;
      /* Using cursor T001627 */
      pr_default.execute(25, new Object[] {new Long(A628TBW03_STUDY_ID), new Short(A630TBW03_CRF_ID)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         AnyError628 = 1 ;
         AnyError630 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'CRF検索ワーク・CRFサブタイプ'", "ForeignKeyNotFound", 1, "TBW03_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBW03_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( AnyError628 == 0 ) && ( AnyError630 == 0 ) )
      {
         A631TBW03_CRF_NM = T001627_A631TBW03_CRF_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A631TBW03_CRF_NM", A631TBW03_CRF_NM);
         n631TBW03_CRF_NM = T001627_n631TBW03_CRF_NM[0] ;
         A632TBW03_CRF_SNM = T001627_A632TBW03_CRF_SNM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A632TBW03_CRF_SNM", A632TBW03_CRF_SNM);
         n632TBW03_CRF_SNM = T001627_n632TBW03_CRF_SNM[0] ;
         A633TBW03_CRF_ORDER = T001627_A633TBW03_CRF_ORDER[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A633TBW03_CRF_ORDER", GXutil.ltrim( GXutil.str( A633TBW03_CRF_ORDER, 5, 0)));
         n633TBW03_CRF_ORDER = T001627_n633TBW03_CRF_ORDER[0] ;
      }
      pr_default.close(25);
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
      A625TBW03_SESSION_ID = GX_Parm1 ;
      A626TBW03_APP_ID = GX_Parm2 ;
      A627TBW03_DISP_DATETIME = GX_Parm3 ;
      A628TBW03_STUDY_ID = GX_Parm4 ;
      A629TBW03_SUBJECT_ID = GX_Parm5 ;
      A630TBW03_CRF_ID = GX_Parm6 ;
      A637TBW03_OUTER_SUBJECT_ID = GX_Parm7 ;
      n637TBW03_OUTER_SUBJECT_ID = false ;
      A638TBW03_CRF_LATEST_VERSION = GX_Parm8 ;
      n638TBW03_CRF_LATEST_VERSION = false ;
      A639TBW03_CRF_INPUT_LEVEL = GX_Parm9 ;
      n639TBW03_CRF_INPUT_LEVEL = false ;
      A640TBW03_LOCK_FLG = GX_Parm10 ;
      n640TBW03_LOCK_FLG = false ;
      A641TBW03_LOCK_DATETIME = GX_Parm11 ;
      n641TBW03_LOCK_DATETIME = false ;
      A644TBW03_LOCK_AUTH_CD = GX_Parm12 ;
      n644TBW03_LOCK_AUTH_CD = false ;
      A645TBW03_UPLOAD_DATETIME = GX_Parm13 ;
      n645TBW03_UPLOAD_DATETIME = false ;
      A648TBW03_UPLOAD_AUTH_CD = GX_Parm14 ;
      n648TBW03_UPLOAD_AUTH_CD = false ;
      A649TBW03_DM_ARRIVAL_FLG = GX_Parm15 ;
      n649TBW03_DM_ARRIVAL_FLG = false ;
      A650TBW03_DM_ARRIVAL_DATETIME = GX_Parm16 ;
      n650TBW03_DM_ARRIVAL_DATETIME = false ;
      A651TBW03_APPROVAL_FLG = GX_Parm17 ;
      n651TBW03_APPROVAL_FLG = false ;
      A652TBW03_APPROVAL_DATETIME = GX_Parm18 ;
      n652TBW03_APPROVAL_DATETIME = false ;
      A655TBW03_APPROVAL_AUTH_CD = GX_Parm19 ;
      n655TBW03_APPROVAL_AUTH_CD = false ;
      A656TBW03_INPUT_END_FLG = GX_Parm20 ;
      n656TBW03_INPUT_END_FLG = false ;
      A657TBW03_INPUT_END_DATETIME = GX_Parm21 ;
      n657TBW03_INPUT_END_DATETIME = false ;
      A660TBW03_INPUT_END_AUTH_CD = GX_Parm22 ;
      n660TBW03_INPUT_END_AUTH_CD = false ;
      A755TBW03_DEL_FLG = GX_Parm23 ;
      n755TBW03_DEL_FLG = false ;
      A756TBW03_CRT_DATETIME = GX_Parm24 ;
      n756TBW03_CRT_DATETIME = false ;
      A759TBW03_CRT_PROG_NM = GX_Parm25 ;
      n759TBW03_CRT_PROG_NM = false ;
      A760TBW03_UPD_DATETIME = GX_Parm26 ;
      n760TBW03_UPD_DATETIME = false ;
      A763TBW03_UPD_PROG_NM = GX_Parm27 ;
      n763TBW03_UPD_PROG_NM = false ;
      A764TBW03_UPD_CNT = GX_Parm28 ;
      n764TBW03_UPD_CNT = false ;
      A634TBW03_SITE_ID = GX_Parm29 ;
      n634TBW03_SITE_ID = false ;
      A642TBW03_LOCK_USER_ID = GX_Parm30 ;
      n642TBW03_LOCK_USER_ID = false ;
      A646TBW03_UPLOAD_USER_ID = GX_Parm31 ;
      n646TBW03_UPLOAD_USER_ID = false ;
      A653TBW03_APPROVAL_USER_ID = GX_Parm32 ;
      n653TBW03_APPROVAL_USER_ID = false ;
      A658TBW03_INPUT_END_USER_ID = GX_Parm33 ;
      n658TBW03_INPUT_END_USER_ID = false ;
      A757TBW03_CRT_USER_ID = GX_Parm34 ;
      n757TBW03_CRT_USER_ID = false ;
      A761TBW03_UPD_USER_ID = GX_Parm35 ;
      n761TBW03_UPD_USER_ID = false ;
      A631TBW03_CRF_NM = GX_Parm36 ;
      n631TBW03_CRF_NM = false ;
      A632TBW03_CRF_SNM = GX_Parm37 ;
      n632TBW03_CRF_SNM = false ;
      A633TBW03_CRF_ORDER = GX_Parm38 ;
      n633TBW03_CRF_ORDER = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      /* Using cursor T001627 */
      pr_default.execute(25, new Object[] {new Long(A628TBW03_STUDY_ID), new Short(A630TBW03_CRF_ID)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         AnyError628 = 1 ;
         AnyError630 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'CRF検索ワーク・CRFサブタイプ'", "ForeignKeyNotFound", 1, "TBW03_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBW03_STUDY_ID_Internalname ;
      }
      if ( ( AnyError628 == 0 ) && ( AnyError630 == 0 ) )
      {
         A631TBW03_CRF_NM = T001627_A631TBW03_CRF_NM[0] ;
         n631TBW03_CRF_NM = T001627_n631TBW03_CRF_NM[0] ;
         A632TBW03_CRF_SNM = T001627_A632TBW03_CRF_SNM[0] ;
         n632TBW03_CRF_SNM = T001627_n632TBW03_CRF_SNM[0] ;
         A633TBW03_CRF_ORDER = T001627_A633TBW03_CRF_ORDER[0] ;
         n633TBW03_CRF_ORDER = T001627_n633TBW03_CRF_ORDER[0] ;
      }
      pr_default.close(25);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A631TBW03_CRF_NM = "" ;
         n631TBW03_CRF_NM = false ;
         A632TBW03_CRF_SNM = "" ;
         n632TBW03_CRF_SNM = false ;
         A633TBW03_CRF_ORDER = 0 ;
         n633TBW03_CRF_ORDER = false ;
         A635TBW03_SITE_NM = "" ;
         n635TBW03_SITE_NM = false ;
         A636TBW03_SITE_RYAK_NM = "" ;
         n636TBW03_SITE_RYAK_NM = false ;
         A643TBW03_LOCK_USER_NM = "" ;
         n643TBW03_LOCK_USER_NM = false ;
         A647TBW03_UPLOAD_USER_NM = "" ;
         n647TBW03_UPLOAD_USER_NM = false ;
         A654TBW03_APPROVAL_USER_NM = "" ;
         n654TBW03_APPROVAL_USER_NM = false ;
         A659TBW03_INPUT_END_USER_NM = "" ;
         n659TBW03_INPUT_END_USER_NM = false ;
         A758TBW03_CRT_USER_NM = "" ;
         n758TBW03_CRT_USER_NM = false ;
         A762TBW03_UPD_USER_NM = "" ;
         n762TBW03_UPD_USER_NM = false ;
      }
      isValidOutput.add(GXutil.rtrim( A634TBW03_SITE_ID));
      isValidOutput.add(GXutil.rtrim( A637TBW03_OUTER_SUBJECT_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A638TBW03_CRF_LATEST_VERSION, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A639TBW03_CRF_INPUT_LEVEL, (byte)(2), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A640TBW03_LOCK_FLG));
      isValidOutput.add(localUtil.format(A641TBW03_LOCK_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A642TBW03_LOCK_USER_ID));
      isValidOutput.add(GXutil.rtrim( A644TBW03_LOCK_AUTH_CD));
      isValidOutput.add(localUtil.format(A645TBW03_UPLOAD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A646TBW03_UPLOAD_USER_ID));
      isValidOutput.add(GXutil.rtrim( A648TBW03_UPLOAD_AUTH_CD));
      isValidOutput.add(GXutil.rtrim( A649TBW03_DM_ARRIVAL_FLG));
      isValidOutput.add(localUtil.format(A650TBW03_DM_ARRIVAL_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A651TBW03_APPROVAL_FLG));
      isValidOutput.add(localUtil.format(A652TBW03_APPROVAL_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A653TBW03_APPROVAL_USER_ID));
      isValidOutput.add(GXutil.rtrim( A655TBW03_APPROVAL_AUTH_CD));
      isValidOutput.add(GXutil.rtrim( A656TBW03_INPUT_END_FLG));
      isValidOutput.add(localUtil.format(A657TBW03_INPUT_END_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A658TBW03_INPUT_END_USER_ID));
      isValidOutput.add(GXutil.rtrim( A660TBW03_INPUT_END_AUTH_CD));
      isValidOutput.add(GXutil.rtrim( A755TBW03_DEL_FLG));
      isValidOutput.add(localUtil.format(A756TBW03_CRT_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A757TBW03_CRT_USER_ID));
      isValidOutput.add(GXutil.rtrim( A759TBW03_CRT_PROG_NM));
      isValidOutput.add(localUtil.format(A760TBW03_UPD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A761TBW03_UPD_USER_ID));
      isValidOutput.add(GXutil.rtrim( A763TBW03_UPD_PROG_NM));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A764TBW03_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( AV8Pgmname));
      isValidOutput.add(GXutil.rtrim( A631TBW03_CRF_NM));
      isValidOutput.add(GXutil.rtrim( A632TBW03_CRF_SNM));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A633TBW03_CRF_ORDER, (byte)(5), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A635TBW03_SITE_NM));
      isValidOutput.add(GXutil.rtrim( A636TBW03_SITE_RYAK_NM));
      isValidOutput.add(GXutil.rtrim( A643TBW03_LOCK_USER_NM));
      isValidOutput.add(GXutil.rtrim( A647TBW03_UPLOAD_USER_NM));
      isValidOutput.add(GXutil.rtrim( A654TBW03_APPROVAL_USER_NM));
      isValidOutput.add(GXutil.rtrim( A659TBW03_INPUT_END_USER_NM));
      isValidOutput.add(GXutil.rtrim( A758TBW03_CRT_USER_NM));
      isValidOutput.add(GXutil.rtrim( A762TBW03_UPD_USER_NM));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.rtrim( Z625TBW03_SESSION_ID));
      isValidOutput.add(GXutil.rtrim( Z626TBW03_APP_ID));
      isValidOutput.add(GXutil.rtrim( Z627TBW03_DISP_DATETIME));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z628TBW03_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z629TBW03_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z630TBW03_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z634TBW03_SITE_ID));
      isValidOutput.add(GXutil.rtrim( Z637TBW03_OUTER_SUBJECT_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z638TBW03_CRF_LATEST_VERSION, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z639TBW03_CRF_INPUT_LEVEL, (byte)(2), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z640TBW03_LOCK_FLG));
      isValidOutput.add(localUtil.ttoc( Z641TBW03_LOCK_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z642TBW03_LOCK_USER_ID));
      isValidOutput.add(GXutil.rtrim( Z644TBW03_LOCK_AUTH_CD));
      isValidOutput.add(localUtil.ttoc( Z645TBW03_UPLOAD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z646TBW03_UPLOAD_USER_ID));
      isValidOutput.add(GXutil.rtrim( Z648TBW03_UPLOAD_AUTH_CD));
      isValidOutput.add(GXutil.rtrim( Z649TBW03_DM_ARRIVAL_FLG));
      isValidOutput.add(localUtil.ttoc( Z650TBW03_DM_ARRIVAL_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z651TBW03_APPROVAL_FLG));
      isValidOutput.add(localUtil.ttoc( Z652TBW03_APPROVAL_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z653TBW03_APPROVAL_USER_ID));
      isValidOutput.add(GXutil.rtrim( Z655TBW03_APPROVAL_AUTH_CD));
      isValidOutput.add(GXutil.rtrim( Z656TBW03_INPUT_END_FLG));
      isValidOutput.add(localUtil.ttoc( Z657TBW03_INPUT_END_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z658TBW03_INPUT_END_USER_ID));
      isValidOutput.add(GXutil.rtrim( Z660TBW03_INPUT_END_AUTH_CD));
      isValidOutput.add(GXutil.rtrim( Z755TBW03_DEL_FLG));
      isValidOutput.add(localUtil.ttoc( Z756TBW03_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z757TBW03_CRT_USER_ID));
      isValidOutput.add(GXutil.rtrim( Z759TBW03_CRT_PROG_NM));
      isValidOutput.add(localUtil.ttoc( Z760TBW03_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z761TBW03_UPD_USER_ID));
      isValidOutput.add(GXutil.rtrim( Z763TBW03_UPD_PROG_NM));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z764TBW03_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( ZV8Pgmname));
      isValidOutput.add(GXutil.rtrim( Z631TBW03_CRF_NM));
      isValidOutput.add(GXutil.rtrim( Z632TBW03_CRF_SNM));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z633TBW03_CRF_ORDER, (byte)(5), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z635TBW03_SITE_NM));
      isValidOutput.add(GXutil.rtrim( Z636TBW03_SITE_RYAK_NM));
      isValidOutput.add(GXutil.rtrim( Z643TBW03_LOCK_USER_NM));
      isValidOutput.add(GXutil.rtrim( Z647TBW03_UPLOAD_USER_NM));
      isValidOutput.add(GXutil.rtrim( Z654TBW03_APPROVAL_USER_NM));
      isValidOutput.add(GXutil.rtrim( Z659TBW03_INPUT_END_USER_NM));
      isValidOutput.add(GXutil.rtrim( Z758TBW03_CRT_USER_NM));
      isValidOutput.add(GXutil.rtrim( Z762TBW03_UPD_USER_NM));
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
      A634TBW03_SITE_ID = GX_Parm1 ;
      n634TBW03_SITE_ID = false ;
      A635TBW03_SITE_NM = GX_Parm2 ;
      n635TBW03_SITE_NM = false ;
      A636TBW03_SITE_RYAK_NM = GX_Parm3 ;
      n636TBW03_SITE_RYAK_NM = false ;
      /* Using cursor T001628 */
      pr_default.execute(26, new Object[] {new Boolean(n634TBW03_SITE_ID), A634TBW03_SITE_ID});
      if ( (pr_default.getStatus(26) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A634TBW03_SITE_ID)==0) ) )
         {
            AnyError634 = 1 ;
            httpContext.GX_msglist.addItem("該当レコードなし'CRF検索ワーク・施設サブタイプ'", "ForeignKeyNotFound", 1, "TBW03_SITE_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBW03_SITE_ID_Internalname ;
         }
      }
      if ( AnyError634 == 0 )
      {
         A635TBW03_SITE_NM = T001628_A635TBW03_SITE_NM[0] ;
         n635TBW03_SITE_NM = T001628_n635TBW03_SITE_NM[0] ;
         A636TBW03_SITE_RYAK_NM = T001628_A636TBW03_SITE_RYAK_NM[0] ;
         n636TBW03_SITE_RYAK_NM = T001628_n636TBW03_SITE_RYAK_NM[0] ;
      }
      pr_default.close(26);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A635TBW03_SITE_NM = "" ;
         n635TBW03_SITE_NM = false ;
         A636TBW03_SITE_RYAK_NM = "" ;
         n636TBW03_SITE_RYAK_NM = false ;
      }
      isValidOutput.add(GXutil.rtrim( A635TBW03_SITE_NM));
      isValidOutput.add(GXutil.rtrim( A636TBW03_SITE_RYAK_NM));
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Tbw03_lock_user_id( String GX_Parm1 ,
                                         String GX_Parm2 )
   {
      A642TBW03_LOCK_USER_ID = GX_Parm1 ;
      n642TBW03_LOCK_USER_ID = false ;
      A643TBW03_LOCK_USER_NM = GX_Parm2 ;
      n643TBW03_LOCK_USER_NM = false ;
      /* Using cursor T001629 */
      pr_default.execute(27, new Object[] {new Boolean(n642TBW03_LOCK_USER_ID), A642TBW03_LOCK_USER_ID});
      if ( (pr_default.getStatus(27) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A642TBW03_LOCK_USER_ID)==0) ) )
         {
            AnyError642 = 1 ;
            httpContext.GX_msglist.addItem("該当レコードなし'CRF検索ワーク・ロックユーザーサブタイプ'", "ForeignKeyNotFound", 1, "TBW03_LOCK_USER_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBW03_LOCK_USER_ID_Internalname ;
         }
      }
      if ( AnyError642 == 0 )
      {
         A643TBW03_LOCK_USER_NM = T001629_A643TBW03_LOCK_USER_NM[0] ;
         n643TBW03_LOCK_USER_NM = T001629_n643TBW03_LOCK_USER_NM[0] ;
      }
      pr_default.close(27);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A643TBW03_LOCK_USER_NM = "" ;
         n643TBW03_LOCK_USER_NM = false ;
      }
      isValidOutput.add(GXutil.rtrim( A643TBW03_LOCK_USER_NM));
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Tbw03_upload_user_id( String GX_Parm1 ,
                                           String GX_Parm2 )
   {
      A646TBW03_UPLOAD_USER_ID = GX_Parm1 ;
      n646TBW03_UPLOAD_USER_ID = false ;
      A647TBW03_UPLOAD_USER_NM = GX_Parm2 ;
      n647TBW03_UPLOAD_USER_NM = false ;
      /* Using cursor T001630 */
      pr_default.execute(28, new Object[] {new Boolean(n646TBW03_UPLOAD_USER_ID), A646TBW03_UPLOAD_USER_ID});
      if ( (pr_default.getStatus(28) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A646TBW03_UPLOAD_USER_ID)==0) ) )
         {
            AnyError646 = 1 ;
            httpContext.GX_msglist.addItem("該当レコードなし'CRF検索ワーク・アップロードユーザーサブタイプ'", "ForeignKeyNotFound", 1, "TBW03_UPLOAD_USER_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBW03_UPLOAD_USER_ID_Internalname ;
         }
      }
      if ( AnyError646 == 0 )
      {
         A647TBW03_UPLOAD_USER_NM = T001630_A647TBW03_UPLOAD_USER_NM[0] ;
         n647TBW03_UPLOAD_USER_NM = T001630_n647TBW03_UPLOAD_USER_NM[0] ;
      }
      pr_default.close(28);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A647TBW03_UPLOAD_USER_NM = "" ;
         n647TBW03_UPLOAD_USER_NM = false ;
      }
      isValidOutput.add(GXutil.rtrim( A647TBW03_UPLOAD_USER_NM));
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Tbw03_approval_user_id( String GX_Parm1 ,
                                             String GX_Parm2 )
   {
      A653TBW03_APPROVAL_USER_ID = GX_Parm1 ;
      n653TBW03_APPROVAL_USER_ID = false ;
      A654TBW03_APPROVAL_USER_NM = GX_Parm2 ;
      n654TBW03_APPROVAL_USER_NM = false ;
      /* Using cursor T001631 */
      pr_default.execute(29, new Object[] {new Boolean(n653TBW03_APPROVAL_USER_ID), A653TBW03_APPROVAL_USER_ID});
      if ( (pr_default.getStatus(29) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A653TBW03_APPROVAL_USER_ID)==0) ) )
         {
            AnyError653 = 1 ;
            httpContext.GX_msglist.addItem("該当レコードなし'CRF検索ワーク・承認ユーザーサブタイプ'", "ForeignKeyNotFound", 1, "TBW03_APPROVAL_USER_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBW03_APPROVAL_USER_ID_Internalname ;
         }
      }
      if ( AnyError653 == 0 )
      {
         A654TBW03_APPROVAL_USER_NM = T001631_A654TBW03_APPROVAL_USER_NM[0] ;
         n654TBW03_APPROVAL_USER_NM = T001631_n654TBW03_APPROVAL_USER_NM[0] ;
      }
      pr_default.close(29);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A654TBW03_APPROVAL_USER_NM = "" ;
         n654TBW03_APPROVAL_USER_NM = false ;
      }
      isValidOutput.add(GXutil.rtrim( A654TBW03_APPROVAL_USER_NM));
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Tbw03_input_end_user_id( String GX_Parm1 ,
                                              String GX_Parm2 )
   {
      A658TBW03_INPUT_END_USER_ID = GX_Parm1 ;
      n658TBW03_INPUT_END_USER_ID = false ;
      A659TBW03_INPUT_END_USER_NM = GX_Parm2 ;
      n659TBW03_INPUT_END_USER_NM = false ;
      /* Using cursor T001632 */
      pr_default.execute(30, new Object[] {new Boolean(n658TBW03_INPUT_END_USER_ID), A658TBW03_INPUT_END_USER_ID});
      if ( (pr_default.getStatus(30) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A658TBW03_INPUT_END_USER_ID)==0) ) )
         {
            AnyError658 = 1 ;
            httpContext.GX_msglist.addItem("該当レコードなし'CRF検索ワーク・データ固定ユーザーサブタイプ'", "ForeignKeyNotFound", 1, "TBW03_INPUT_END_USER_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBW03_INPUT_END_USER_ID_Internalname ;
         }
      }
      if ( AnyError658 == 0 )
      {
         A659TBW03_INPUT_END_USER_NM = T001632_A659TBW03_INPUT_END_USER_NM[0] ;
         n659TBW03_INPUT_END_USER_NM = T001632_n659TBW03_INPUT_END_USER_NM[0] ;
      }
      pr_default.close(30);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A659TBW03_INPUT_END_USER_NM = "" ;
         n659TBW03_INPUT_END_USER_NM = false ;
      }
      isValidOutput.add(GXutil.rtrim( A659TBW03_INPUT_END_USER_NM));
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Tbw03_crt_user_id( String GX_Parm1 ,
                                        String GX_Parm2 )
   {
      A757TBW03_CRT_USER_ID = GX_Parm1 ;
      n757TBW03_CRT_USER_ID = false ;
      A758TBW03_CRT_USER_NM = GX_Parm2 ;
      n758TBW03_CRT_USER_NM = false ;
      /* Using cursor T001633 */
      pr_default.execute(31, new Object[] {new Boolean(n757TBW03_CRT_USER_ID), A757TBW03_CRT_USER_ID});
      if ( (pr_default.getStatus(31) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A757TBW03_CRT_USER_ID)==0) ) )
         {
            AnyError757 = 1 ;
            httpContext.GX_msglist.addItem("該当レコードなし'CRF検索ワーク・作成ユーザーサブタイプ'", "ForeignKeyNotFound", 1, "TBW03_CRT_USER_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBW03_CRT_USER_ID_Internalname ;
         }
      }
      if ( AnyError757 == 0 )
      {
         A758TBW03_CRT_USER_NM = T001633_A758TBW03_CRT_USER_NM[0] ;
         n758TBW03_CRT_USER_NM = T001633_n758TBW03_CRT_USER_NM[0] ;
      }
      pr_default.close(31);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A758TBW03_CRT_USER_NM = "" ;
         n758TBW03_CRT_USER_NM = false ;
      }
      isValidOutput.add(GXutil.rtrim( A758TBW03_CRT_USER_NM));
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Tbw03_upd_user_id( String GX_Parm1 ,
                                        String GX_Parm2 )
   {
      A761TBW03_UPD_USER_ID = GX_Parm1 ;
      n761TBW03_UPD_USER_ID = false ;
      A762TBW03_UPD_USER_NM = GX_Parm2 ;
      n762TBW03_UPD_USER_NM = false ;
      /* Using cursor T001634 */
      pr_default.execute(32, new Object[] {new Boolean(n761TBW03_UPD_USER_ID), A761TBW03_UPD_USER_ID});
      if ( (pr_default.getStatus(32) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A761TBW03_UPD_USER_ID)==0) ) )
         {
            AnyError761 = 1 ;
            httpContext.GX_msglist.addItem("該当レコードなし'CRF検索ワーク・更新ユーザーサブタイプ'", "ForeignKeyNotFound", 1, "TBW03_UPD_USER_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBW03_UPD_USER_ID_Internalname ;
         }
      }
      if ( AnyError761 == 0 )
      {
         A762TBW03_UPD_USER_NM = T001634_A762TBW03_UPD_USER_NM[0] ;
         n762TBW03_UPD_USER_NM = T001634_n762TBW03_UPD_USER_NM[0] ;
      }
      pr_default.close(32);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A762TBW03_UPD_USER_NM = "" ;
         n762TBW03_UPD_USER_NM = false ;
      }
      isValidOutput.add(GXutil.rtrim( A762TBW03_UPD_USER_NM));
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
      pr_default.close(25);
      pr_default.close(26);
      pr_default.close(27);
      pr_default.close(28);
      pr_default.close(29);
      pr_default.close(30);
      pr_default.close(31);
      pr_default.close(32);
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
                  /* Execute user subroutine: S1132 */
                  S1132 ();
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
      A634TBW03_SITE_ID = "" ;
      A642TBW03_LOCK_USER_ID = "" ;
      A646TBW03_UPLOAD_USER_ID = "" ;
      A653TBW03_APPROVAL_USER_ID = "" ;
      A658TBW03_INPUT_END_USER_ID = "" ;
      A757TBW03_CRT_USER_ID = "" ;
      A761TBW03_UPD_USER_ID = "" ;
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
      A625TBW03_SESSION_ID = "" ;
      lblTextblocktbw03_app_id_Jsonclick = "" ;
      A626TBW03_APP_ID = "" ;
      lblTextblocktbw03_disp_datetime_Jsonclick = "" ;
      A627TBW03_DISP_DATETIME = "" ;
      lblTextblocktbw03_study_id_Jsonclick = "" ;
      lblTextblocktbw03_subject_id_Jsonclick = "" ;
      lblTextblocktbw03_crf_id_Jsonclick = "" ;
      lblTextblocktbw03_crf_nm_Jsonclick = "" ;
      A631TBW03_CRF_NM = "" ;
      lblTextblocktbw03_crf_snm_Jsonclick = "" ;
      A632TBW03_CRF_SNM = "" ;
      lblTextblocktbw03_crf_order_Jsonclick = "" ;
      lblTextblocktbw03_site_id_Jsonclick = "" ;
      lblTextblocktbw03_site_nm_Jsonclick = "" ;
      A635TBW03_SITE_NM = "" ;
      lblTextblocktbw03_site_ryak_nm_Jsonclick = "" ;
      A636TBW03_SITE_RYAK_NM = "" ;
      lblTextblocktbw03_outer_subject_id_Jsonclick = "" ;
      A637TBW03_OUTER_SUBJECT_ID = "" ;
      lblTextblocktbw03_crf_latest_version_Jsonclick = "" ;
      lblTextblocktbw03_crf_input_level_Jsonclick = "" ;
      lblTextblocktbw03_lock_flg_Jsonclick = "" ;
      A640TBW03_LOCK_FLG = "" ;
      lblTextblocktbw03_lock_datetime_Jsonclick = "" ;
      A641TBW03_LOCK_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbw03_lock_user_id_Jsonclick = "" ;
      lblTextblocktbw03_lock_user_nm_Jsonclick = "" ;
      A643TBW03_LOCK_USER_NM = "" ;
      lblTextblocktbw03_lock_auth_cd_Jsonclick = "" ;
      A644TBW03_LOCK_AUTH_CD = "" ;
      lblTextblocktbw03_upload_datetime_Jsonclick = "" ;
      A645TBW03_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbw03_upload_user_id_Jsonclick = "" ;
      lblTextblocktbw03_upload_user_nm_Jsonclick = "" ;
      A647TBW03_UPLOAD_USER_NM = "" ;
      lblTextblocktbw03_upload_auth_cd_Jsonclick = "" ;
      A648TBW03_UPLOAD_AUTH_CD = "" ;
      lblTextblocktbw03_dm_arrival_flg_Jsonclick = "" ;
      A649TBW03_DM_ARRIVAL_FLG = "" ;
      lblTextblocktbw03_dm_arrival_datetime_Jsonclick = "" ;
      A650TBW03_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbw03_approval_flg_Jsonclick = "" ;
      A651TBW03_APPROVAL_FLG = "" ;
      lblTextblocktbw03_approval_datetime_Jsonclick = "" ;
      A652TBW03_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbw03_approval_user_id_Jsonclick = "" ;
      lblTextblocktbw03_approval_user_nm_Jsonclick = "" ;
      A654TBW03_APPROVAL_USER_NM = "" ;
      lblTextblocktbw03_approval_auth_cd_Jsonclick = "" ;
      A655TBW03_APPROVAL_AUTH_CD = "" ;
      lblTextblocktbw03_input_end_flg_Jsonclick = "" ;
      A656TBW03_INPUT_END_FLG = "" ;
      lblTextblocktbw03_input_end_datetime_Jsonclick = "" ;
      A657TBW03_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbw03_input_end_user_id_Jsonclick = "" ;
      lblTextblocktbw03_input_end_user_nm_Jsonclick = "" ;
      A659TBW03_INPUT_END_USER_NM = "" ;
      lblTextblocktbw03_input_end_auth_cd_Jsonclick = "" ;
      A660TBW03_INPUT_END_AUTH_CD = "" ;
      lblTextblocktbw03_del_flg_Jsonclick = "" ;
      A755TBW03_DEL_FLG = "" ;
      lblTextblocktbw03_crt_datetime_Jsonclick = "" ;
      A756TBW03_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbw03_crt_user_id_Jsonclick = "" ;
      lblTextblocktbw03_crt_user_nm_Jsonclick = "" ;
      A758TBW03_CRT_USER_NM = "" ;
      lblTextblocktbw03_crt_prog_nm_Jsonclick = "" ;
      A759TBW03_CRT_PROG_NM = "" ;
      lblTextblocktbw03_upd_datetime_Jsonclick = "" ;
      A760TBW03_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbw03_upd_user_id_Jsonclick = "" ;
      lblTextblocktbw03_upd_user_nm_Jsonclick = "" ;
      A762TBW03_UPD_USER_NM = "" ;
      lblTextblocktbw03_upd_prog_nm_Jsonclick = "" ;
      A763TBW03_UPD_PROG_NM = "" ;
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
      Z625TBW03_SESSION_ID = "" ;
      Z626TBW03_APP_ID = "" ;
      Z627TBW03_DISP_DATETIME = "" ;
      Z637TBW03_OUTER_SUBJECT_ID = "" ;
      Z640TBW03_LOCK_FLG = "" ;
      Z641TBW03_LOCK_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z644TBW03_LOCK_AUTH_CD = "" ;
      Z645TBW03_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z648TBW03_UPLOAD_AUTH_CD = "" ;
      Z649TBW03_DM_ARRIVAL_FLG = "" ;
      Z650TBW03_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z651TBW03_APPROVAL_FLG = "" ;
      Z652TBW03_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z655TBW03_APPROVAL_AUTH_CD = "" ;
      Z656TBW03_INPUT_END_FLG = "" ;
      Z657TBW03_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z660TBW03_INPUT_END_AUTH_CD = "" ;
      Z755TBW03_DEL_FLG = "" ;
      Z756TBW03_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z759TBW03_CRT_PROG_NM = "" ;
      Z760TBW03_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z763TBW03_UPD_PROG_NM = "" ;
      Z634TBW03_SITE_ID = "" ;
      Z642TBW03_LOCK_USER_ID = "" ;
      Z646TBW03_UPLOAD_USER_ID = "" ;
      Z653TBW03_APPROVAL_USER_ID = "" ;
      Z658TBW03_INPUT_END_USER_ID = "" ;
      Z757TBW03_CRT_USER_ID = "" ;
      Z761TBW03_UPD_USER_ID = "" ;
      Gx_mode = "" ;
      AV8Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV7W_BC_FLG = "" ;
      GXEncryptionTmp = "" ;
      Z631TBW03_CRF_NM = "" ;
      Z632TBW03_CRF_SNM = "" ;
      Z635TBW03_SITE_NM = "" ;
      Z636TBW03_SITE_RYAK_NM = "" ;
      Z643TBW03_LOCK_USER_NM = "" ;
      Z647TBW03_UPLOAD_USER_NM = "" ;
      Z654TBW03_APPROVAL_USER_NM = "" ;
      Z659TBW03_INPUT_END_USER_NM = "" ;
      Z758TBW03_CRT_USER_NM = "" ;
      Z762TBW03_UPD_USER_NM = "" ;
      T001612_A625TBW03_SESSION_ID = new String[] {""} ;
      T001612_A626TBW03_APP_ID = new String[] {""} ;
      T001612_A627TBW03_DISP_DATETIME = new String[] {""} ;
      T001612_A629TBW03_SUBJECT_ID = new int[1] ;
      T001612_A631TBW03_CRF_NM = new String[] {""} ;
      T001612_n631TBW03_CRF_NM = new boolean[] {false} ;
      T001612_A632TBW03_CRF_SNM = new String[] {""} ;
      T001612_n632TBW03_CRF_SNM = new boolean[] {false} ;
      T001612_A633TBW03_CRF_ORDER = new int[1] ;
      T001612_n633TBW03_CRF_ORDER = new boolean[] {false} ;
      T001612_A635TBW03_SITE_NM = new String[] {""} ;
      T001612_n635TBW03_SITE_NM = new boolean[] {false} ;
      T001612_A636TBW03_SITE_RYAK_NM = new String[] {""} ;
      T001612_n636TBW03_SITE_RYAK_NM = new boolean[] {false} ;
      T001612_A637TBW03_OUTER_SUBJECT_ID = new String[] {""} ;
      T001612_n637TBW03_OUTER_SUBJECT_ID = new boolean[] {false} ;
      T001612_A638TBW03_CRF_LATEST_VERSION = new short[1] ;
      T001612_n638TBW03_CRF_LATEST_VERSION = new boolean[] {false} ;
      T001612_A639TBW03_CRF_INPUT_LEVEL = new byte[1] ;
      T001612_n639TBW03_CRF_INPUT_LEVEL = new boolean[] {false} ;
      T001612_A640TBW03_LOCK_FLG = new String[] {""} ;
      T001612_n640TBW03_LOCK_FLG = new boolean[] {false} ;
      T001612_A641TBW03_LOCK_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001612_n641TBW03_LOCK_DATETIME = new boolean[] {false} ;
      T001612_A643TBW03_LOCK_USER_NM = new String[] {""} ;
      T001612_n643TBW03_LOCK_USER_NM = new boolean[] {false} ;
      T001612_A644TBW03_LOCK_AUTH_CD = new String[] {""} ;
      T001612_n644TBW03_LOCK_AUTH_CD = new boolean[] {false} ;
      T001612_A645TBW03_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001612_n645TBW03_UPLOAD_DATETIME = new boolean[] {false} ;
      T001612_A647TBW03_UPLOAD_USER_NM = new String[] {""} ;
      T001612_n647TBW03_UPLOAD_USER_NM = new boolean[] {false} ;
      T001612_A648TBW03_UPLOAD_AUTH_CD = new String[] {""} ;
      T001612_n648TBW03_UPLOAD_AUTH_CD = new boolean[] {false} ;
      T001612_A649TBW03_DM_ARRIVAL_FLG = new String[] {""} ;
      T001612_n649TBW03_DM_ARRIVAL_FLG = new boolean[] {false} ;
      T001612_A650TBW03_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001612_n650TBW03_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      T001612_A651TBW03_APPROVAL_FLG = new String[] {""} ;
      T001612_n651TBW03_APPROVAL_FLG = new boolean[] {false} ;
      T001612_A652TBW03_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001612_n652TBW03_APPROVAL_DATETIME = new boolean[] {false} ;
      T001612_A654TBW03_APPROVAL_USER_NM = new String[] {""} ;
      T001612_n654TBW03_APPROVAL_USER_NM = new boolean[] {false} ;
      T001612_A655TBW03_APPROVAL_AUTH_CD = new String[] {""} ;
      T001612_n655TBW03_APPROVAL_AUTH_CD = new boolean[] {false} ;
      T001612_A656TBW03_INPUT_END_FLG = new String[] {""} ;
      T001612_n656TBW03_INPUT_END_FLG = new boolean[] {false} ;
      T001612_A657TBW03_INPUT_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001612_n657TBW03_INPUT_END_DATETIME = new boolean[] {false} ;
      T001612_A659TBW03_INPUT_END_USER_NM = new String[] {""} ;
      T001612_n659TBW03_INPUT_END_USER_NM = new boolean[] {false} ;
      T001612_A660TBW03_INPUT_END_AUTH_CD = new String[] {""} ;
      T001612_n660TBW03_INPUT_END_AUTH_CD = new boolean[] {false} ;
      T001612_A755TBW03_DEL_FLG = new String[] {""} ;
      T001612_n755TBW03_DEL_FLG = new boolean[] {false} ;
      T001612_A756TBW03_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001612_n756TBW03_CRT_DATETIME = new boolean[] {false} ;
      T001612_A758TBW03_CRT_USER_NM = new String[] {""} ;
      T001612_n758TBW03_CRT_USER_NM = new boolean[] {false} ;
      T001612_A759TBW03_CRT_PROG_NM = new String[] {""} ;
      T001612_n759TBW03_CRT_PROG_NM = new boolean[] {false} ;
      T001612_A760TBW03_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001612_n760TBW03_UPD_DATETIME = new boolean[] {false} ;
      T001612_A762TBW03_UPD_USER_NM = new String[] {""} ;
      T001612_n762TBW03_UPD_USER_NM = new boolean[] {false} ;
      T001612_A763TBW03_UPD_PROG_NM = new String[] {""} ;
      T001612_n763TBW03_UPD_PROG_NM = new boolean[] {false} ;
      T001612_A764TBW03_UPD_CNT = new long[1] ;
      T001612_n764TBW03_UPD_CNT = new boolean[] {false} ;
      T001612_A628TBW03_STUDY_ID = new long[1] ;
      T001612_A630TBW03_CRF_ID = new short[1] ;
      T001612_A634TBW03_SITE_ID = new String[] {""} ;
      T001612_n634TBW03_SITE_ID = new boolean[] {false} ;
      T001612_A642TBW03_LOCK_USER_ID = new String[] {""} ;
      T001612_n642TBW03_LOCK_USER_ID = new boolean[] {false} ;
      T001612_A646TBW03_UPLOAD_USER_ID = new String[] {""} ;
      T001612_n646TBW03_UPLOAD_USER_ID = new boolean[] {false} ;
      T001612_A653TBW03_APPROVAL_USER_ID = new String[] {""} ;
      T001612_n653TBW03_APPROVAL_USER_ID = new boolean[] {false} ;
      T001612_A658TBW03_INPUT_END_USER_ID = new String[] {""} ;
      T001612_n658TBW03_INPUT_END_USER_ID = new boolean[] {false} ;
      T001612_A757TBW03_CRT_USER_ID = new String[] {""} ;
      T001612_n757TBW03_CRT_USER_ID = new boolean[] {false} ;
      T001612_A761TBW03_UPD_USER_ID = new String[] {""} ;
      T001612_n761TBW03_UPD_USER_ID = new boolean[] {false} ;
      T00164_A631TBW03_CRF_NM = new String[] {""} ;
      T00164_n631TBW03_CRF_NM = new boolean[] {false} ;
      T00164_A632TBW03_CRF_SNM = new String[] {""} ;
      T00164_n632TBW03_CRF_SNM = new boolean[] {false} ;
      T00164_A633TBW03_CRF_ORDER = new int[1] ;
      T00164_n633TBW03_CRF_ORDER = new boolean[] {false} ;
      T00165_A635TBW03_SITE_NM = new String[] {""} ;
      T00165_n635TBW03_SITE_NM = new boolean[] {false} ;
      T00165_A636TBW03_SITE_RYAK_NM = new String[] {""} ;
      T00165_n636TBW03_SITE_RYAK_NM = new boolean[] {false} ;
      T00166_A643TBW03_LOCK_USER_NM = new String[] {""} ;
      T00166_n643TBW03_LOCK_USER_NM = new boolean[] {false} ;
      T00167_A647TBW03_UPLOAD_USER_NM = new String[] {""} ;
      T00167_n647TBW03_UPLOAD_USER_NM = new boolean[] {false} ;
      T00168_A654TBW03_APPROVAL_USER_NM = new String[] {""} ;
      T00168_n654TBW03_APPROVAL_USER_NM = new boolean[] {false} ;
      T00169_A659TBW03_INPUT_END_USER_NM = new String[] {""} ;
      T00169_n659TBW03_INPUT_END_USER_NM = new boolean[] {false} ;
      T001610_A758TBW03_CRT_USER_NM = new String[] {""} ;
      T001610_n758TBW03_CRT_USER_NM = new boolean[] {false} ;
      T001611_A762TBW03_UPD_USER_NM = new String[] {""} ;
      T001611_n762TBW03_UPD_USER_NM = new boolean[] {false} ;
      T001613_A631TBW03_CRF_NM = new String[] {""} ;
      T001613_n631TBW03_CRF_NM = new boolean[] {false} ;
      T001613_A632TBW03_CRF_SNM = new String[] {""} ;
      T001613_n632TBW03_CRF_SNM = new boolean[] {false} ;
      T001613_A633TBW03_CRF_ORDER = new int[1] ;
      T001613_n633TBW03_CRF_ORDER = new boolean[] {false} ;
      T001614_A635TBW03_SITE_NM = new String[] {""} ;
      T001614_n635TBW03_SITE_NM = new boolean[] {false} ;
      T001614_A636TBW03_SITE_RYAK_NM = new String[] {""} ;
      T001614_n636TBW03_SITE_RYAK_NM = new boolean[] {false} ;
      T001615_A643TBW03_LOCK_USER_NM = new String[] {""} ;
      T001615_n643TBW03_LOCK_USER_NM = new boolean[] {false} ;
      T001616_A647TBW03_UPLOAD_USER_NM = new String[] {""} ;
      T001616_n647TBW03_UPLOAD_USER_NM = new boolean[] {false} ;
      T001617_A654TBW03_APPROVAL_USER_NM = new String[] {""} ;
      T001617_n654TBW03_APPROVAL_USER_NM = new boolean[] {false} ;
      T001618_A659TBW03_INPUT_END_USER_NM = new String[] {""} ;
      T001618_n659TBW03_INPUT_END_USER_NM = new boolean[] {false} ;
      T001619_A758TBW03_CRT_USER_NM = new String[] {""} ;
      T001619_n758TBW03_CRT_USER_NM = new boolean[] {false} ;
      T001620_A762TBW03_UPD_USER_NM = new String[] {""} ;
      T001620_n762TBW03_UPD_USER_NM = new boolean[] {false} ;
      T001621_A625TBW03_SESSION_ID = new String[] {""} ;
      T001621_A626TBW03_APP_ID = new String[] {""} ;
      T001621_A627TBW03_DISP_DATETIME = new String[] {""} ;
      T001621_A628TBW03_STUDY_ID = new long[1] ;
      T001621_A629TBW03_SUBJECT_ID = new int[1] ;
      T001621_A630TBW03_CRF_ID = new short[1] ;
      T00163_A625TBW03_SESSION_ID = new String[] {""} ;
      T00163_A626TBW03_APP_ID = new String[] {""} ;
      T00163_A627TBW03_DISP_DATETIME = new String[] {""} ;
      T00163_A629TBW03_SUBJECT_ID = new int[1] ;
      T00163_A637TBW03_OUTER_SUBJECT_ID = new String[] {""} ;
      T00163_n637TBW03_OUTER_SUBJECT_ID = new boolean[] {false} ;
      T00163_A638TBW03_CRF_LATEST_VERSION = new short[1] ;
      T00163_n638TBW03_CRF_LATEST_VERSION = new boolean[] {false} ;
      T00163_A639TBW03_CRF_INPUT_LEVEL = new byte[1] ;
      T00163_n639TBW03_CRF_INPUT_LEVEL = new boolean[] {false} ;
      T00163_A640TBW03_LOCK_FLG = new String[] {""} ;
      T00163_n640TBW03_LOCK_FLG = new boolean[] {false} ;
      T00163_A641TBW03_LOCK_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00163_n641TBW03_LOCK_DATETIME = new boolean[] {false} ;
      T00163_A644TBW03_LOCK_AUTH_CD = new String[] {""} ;
      T00163_n644TBW03_LOCK_AUTH_CD = new boolean[] {false} ;
      T00163_A645TBW03_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00163_n645TBW03_UPLOAD_DATETIME = new boolean[] {false} ;
      T00163_A648TBW03_UPLOAD_AUTH_CD = new String[] {""} ;
      T00163_n648TBW03_UPLOAD_AUTH_CD = new boolean[] {false} ;
      T00163_A649TBW03_DM_ARRIVAL_FLG = new String[] {""} ;
      T00163_n649TBW03_DM_ARRIVAL_FLG = new boolean[] {false} ;
      T00163_A650TBW03_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00163_n650TBW03_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      T00163_A651TBW03_APPROVAL_FLG = new String[] {""} ;
      T00163_n651TBW03_APPROVAL_FLG = new boolean[] {false} ;
      T00163_A652TBW03_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00163_n652TBW03_APPROVAL_DATETIME = new boolean[] {false} ;
      T00163_A655TBW03_APPROVAL_AUTH_CD = new String[] {""} ;
      T00163_n655TBW03_APPROVAL_AUTH_CD = new boolean[] {false} ;
      T00163_A656TBW03_INPUT_END_FLG = new String[] {""} ;
      T00163_n656TBW03_INPUT_END_FLG = new boolean[] {false} ;
      T00163_A657TBW03_INPUT_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00163_n657TBW03_INPUT_END_DATETIME = new boolean[] {false} ;
      T00163_A660TBW03_INPUT_END_AUTH_CD = new String[] {""} ;
      T00163_n660TBW03_INPUT_END_AUTH_CD = new boolean[] {false} ;
      T00163_A755TBW03_DEL_FLG = new String[] {""} ;
      T00163_n755TBW03_DEL_FLG = new boolean[] {false} ;
      T00163_A756TBW03_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00163_n756TBW03_CRT_DATETIME = new boolean[] {false} ;
      T00163_A759TBW03_CRT_PROG_NM = new String[] {""} ;
      T00163_n759TBW03_CRT_PROG_NM = new boolean[] {false} ;
      T00163_A760TBW03_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00163_n760TBW03_UPD_DATETIME = new boolean[] {false} ;
      T00163_A763TBW03_UPD_PROG_NM = new String[] {""} ;
      T00163_n763TBW03_UPD_PROG_NM = new boolean[] {false} ;
      T00163_A764TBW03_UPD_CNT = new long[1] ;
      T00163_n764TBW03_UPD_CNT = new boolean[] {false} ;
      T00163_A628TBW03_STUDY_ID = new long[1] ;
      T00163_A630TBW03_CRF_ID = new short[1] ;
      T00163_A634TBW03_SITE_ID = new String[] {""} ;
      T00163_n634TBW03_SITE_ID = new boolean[] {false} ;
      T00163_A642TBW03_LOCK_USER_ID = new String[] {""} ;
      T00163_n642TBW03_LOCK_USER_ID = new boolean[] {false} ;
      T00163_A646TBW03_UPLOAD_USER_ID = new String[] {""} ;
      T00163_n646TBW03_UPLOAD_USER_ID = new boolean[] {false} ;
      T00163_A653TBW03_APPROVAL_USER_ID = new String[] {""} ;
      T00163_n653TBW03_APPROVAL_USER_ID = new boolean[] {false} ;
      T00163_A658TBW03_INPUT_END_USER_ID = new String[] {""} ;
      T00163_n658TBW03_INPUT_END_USER_ID = new boolean[] {false} ;
      T00163_A757TBW03_CRT_USER_ID = new String[] {""} ;
      T00163_n757TBW03_CRT_USER_ID = new boolean[] {false} ;
      T00163_A761TBW03_UPD_USER_ID = new String[] {""} ;
      T00163_n761TBW03_UPD_USER_ID = new boolean[] {false} ;
      sMode41 = "" ;
      T001622_A625TBW03_SESSION_ID = new String[] {""} ;
      T001622_A626TBW03_APP_ID = new String[] {""} ;
      T001622_A627TBW03_DISP_DATETIME = new String[] {""} ;
      T001622_A628TBW03_STUDY_ID = new long[1] ;
      T001622_A629TBW03_SUBJECT_ID = new int[1] ;
      T001622_A630TBW03_CRF_ID = new short[1] ;
      T001623_A625TBW03_SESSION_ID = new String[] {""} ;
      T001623_A626TBW03_APP_ID = new String[] {""} ;
      T001623_A627TBW03_DISP_DATETIME = new String[] {""} ;
      T001623_A628TBW03_STUDY_ID = new long[1] ;
      T001623_A629TBW03_SUBJECT_ID = new int[1] ;
      T001623_A630TBW03_CRF_ID = new short[1] ;
      T00162_A625TBW03_SESSION_ID = new String[] {""} ;
      T00162_A626TBW03_APP_ID = new String[] {""} ;
      T00162_A627TBW03_DISP_DATETIME = new String[] {""} ;
      T00162_A629TBW03_SUBJECT_ID = new int[1] ;
      T00162_A637TBW03_OUTER_SUBJECT_ID = new String[] {""} ;
      T00162_n637TBW03_OUTER_SUBJECT_ID = new boolean[] {false} ;
      T00162_A638TBW03_CRF_LATEST_VERSION = new short[1] ;
      T00162_n638TBW03_CRF_LATEST_VERSION = new boolean[] {false} ;
      T00162_A639TBW03_CRF_INPUT_LEVEL = new byte[1] ;
      T00162_n639TBW03_CRF_INPUT_LEVEL = new boolean[] {false} ;
      T00162_A640TBW03_LOCK_FLG = new String[] {""} ;
      T00162_n640TBW03_LOCK_FLG = new boolean[] {false} ;
      T00162_A641TBW03_LOCK_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00162_n641TBW03_LOCK_DATETIME = new boolean[] {false} ;
      T00162_A644TBW03_LOCK_AUTH_CD = new String[] {""} ;
      T00162_n644TBW03_LOCK_AUTH_CD = new boolean[] {false} ;
      T00162_A645TBW03_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00162_n645TBW03_UPLOAD_DATETIME = new boolean[] {false} ;
      T00162_A648TBW03_UPLOAD_AUTH_CD = new String[] {""} ;
      T00162_n648TBW03_UPLOAD_AUTH_CD = new boolean[] {false} ;
      T00162_A649TBW03_DM_ARRIVAL_FLG = new String[] {""} ;
      T00162_n649TBW03_DM_ARRIVAL_FLG = new boolean[] {false} ;
      T00162_A650TBW03_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00162_n650TBW03_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      T00162_A651TBW03_APPROVAL_FLG = new String[] {""} ;
      T00162_n651TBW03_APPROVAL_FLG = new boolean[] {false} ;
      T00162_A652TBW03_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00162_n652TBW03_APPROVAL_DATETIME = new boolean[] {false} ;
      T00162_A655TBW03_APPROVAL_AUTH_CD = new String[] {""} ;
      T00162_n655TBW03_APPROVAL_AUTH_CD = new boolean[] {false} ;
      T00162_A656TBW03_INPUT_END_FLG = new String[] {""} ;
      T00162_n656TBW03_INPUT_END_FLG = new boolean[] {false} ;
      T00162_A657TBW03_INPUT_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00162_n657TBW03_INPUT_END_DATETIME = new boolean[] {false} ;
      T00162_A660TBW03_INPUT_END_AUTH_CD = new String[] {""} ;
      T00162_n660TBW03_INPUT_END_AUTH_CD = new boolean[] {false} ;
      T00162_A755TBW03_DEL_FLG = new String[] {""} ;
      T00162_n755TBW03_DEL_FLG = new boolean[] {false} ;
      T00162_A756TBW03_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00162_n756TBW03_CRT_DATETIME = new boolean[] {false} ;
      T00162_A759TBW03_CRT_PROG_NM = new String[] {""} ;
      T00162_n759TBW03_CRT_PROG_NM = new boolean[] {false} ;
      T00162_A760TBW03_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00162_n760TBW03_UPD_DATETIME = new boolean[] {false} ;
      T00162_A763TBW03_UPD_PROG_NM = new String[] {""} ;
      T00162_n763TBW03_UPD_PROG_NM = new boolean[] {false} ;
      T00162_A764TBW03_UPD_CNT = new long[1] ;
      T00162_n764TBW03_UPD_CNT = new boolean[] {false} ;
      T00162_A628TBW03_STUDY_ID = new long[1] ;
      T00162_A630TBW03_CRF_ID = new short[1] ;
      T00162_A634TBW03_SITE_ID = new String[] {""} ;
      T00162_n634TBW03_SITE_ID = new boolean[] {false} ;
      T00162_A642TBW03_LOCK_USER_ID = new String[] {""} ;
      T00162_n642TBW03_LOCK_USER_ID = new boolean[] {false} ;
      T00162_A646TBW03_UPLOAD_USER_ID = new String[] {""} ;
      T00162_n646TBW03_UPLOAD_USER_ID = new boolean[] {false} ;
      T00162_A653TBW03_APPROVAL_USER_ID = new String[] {""} ;
      T00162_n653TBW03_APPROVAL_USER_ID = new boolean[] {false} ;
      T00162_A658TBW03_INPUT_END_USER_ID = new String[] {""} ;
      T00162_n658TBW03_INPUT_END_USER_ID = new boolean[] {false} ;
      T00162_A757TBW03_CRT_USER_ID = new String[] {""} ;
      T00162_n757TBW03_CRT_USER_ID = new boolean[] {false} ;
      T00162_A761TBW03_UPD_USER_ID = new String[] {""} ;
      T00162_n761TBW03_UPD_USER_ID = new boolean[] {false} ;
      T001627_A631TBW03_CRF_NM = new String[] {""} ;
      T001627_n631TBW03_CRF_NM = new boolean[] {false} ;
      T001627_A632TBW03_CRF_SNM = new String[] {""} ;
      T001627_n632TBW03_CRF_SNM = new boolean[] {false} ;
      T001627_A633TBW03_CRF_ORDER = new int[1] ;
      T001627_n633TBW03_CRF_ORDER = new boolean[] {false} ;
      T001628_A635TBW03_SITE_NM = new String[] {""} ;
      T001628_n635TBW03_SITE_NM = new boolean[] {false} ;
      T001628_A636TBW03_SITE_RYAK_NM = new String[] {""} ;
      T001628_n636TBW03_SITE_RYAK_NM = new boolean[] {false} ;
      T001629_A643TBW03_LOCK_USER_NM = new String[] {""} ;
      T001629_n643TBW03_LOCK_USER_NM = new boolean[] {false} ;
      T001630_A647TBW03_UPLOAD_USER_NM = new String[] {""} ;
      T001630_n647TBW03_UPLOAD_USER_NM = new boolean[] {false} ;
      T001631_A654TBW03_APPROVAL_USER_NM = new String[] {""} ;
      T001631_n654TBW03_APPROVAL_USER_NM = new boolean[] {false} ;
      T001632_A659TBW03_INPUT_END_USER_NM = new String[] {""} ;
      T001632_n659TBW03_INPUT_END_USER_NM = new boolean[] {false} ;
      T001633_A758TBW03_CRT_USER_NM = new String[] {""} ;
      T001633_n758TBW03_CRT_USER_NM = new boolean[] {false} ;
      T001634_A762TBW03_UPD_USER_NM = new String[] {""} ;
      T001634_n762TBW03_UPD_USER_NM = new boolean[] {false} ;
      T001635_A625TBW03_SESSION_ID = new String[] {""} ;
      T001635_A626TBW03_APP_ID = new String[] {""} ;
      T001635_A627TBW03_DISP_DATETIME = new String[] {""} ;
      T001635_A628TBW03_STUDY_ID = new long[1] ;
      T001635_A629TBW03_SUBJECT_ID = new int[1] ;
      T001635_A630TBW03_CRF_ID = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      GXt_char3 = "" ;
      GXt_char2 = "" ;
      GXt_char1 = "" ;
      ZV8Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbw03_crf_search__default(),
         new Object[] {
             new Object[] {
            T00162_A625TBW03_SESSION_ID, T00162_A626TBW03_APP_ID, T00162_A627TBW03_DISP_DATETIME, T00162_A629TBW03_SUBJECT_ID, T00162_A637TBW03_OUTER_SUBJECT_ID, T00162_n637TBW03_OUTER_SUBJECT_ID, T00162_A638TBW03_CRF_LATEST_VERSION, T00162_n638TBW03_CRF_LATEST_VERSION, T00162_A639TBW03_CRF_INPUT_LEVEL, T00162_n639TBW03_CRF_INPUT_LEVEL,
            T00162_A640TBW03_LOCK_FLG, T00162_n640TBW03_LOCK_FLG, T00162_A641TBW03_LOCK_DATETIME, T00162_n641TBW03_LOCK_DATETIME, T00162_A644TBW03_LOCK_AUTH_CD, T00162_n644TBW03_LOCK_AUTH_CD, T00162_A645TBW03_UPLOAD_DATETIME, T00162_n645TBW03_UPLOAD_DATETIME, T00162_A648TBW03_UPLOAD_AUTH_CD, T00162_n648TBW03_UPLOAD_AUTH_CD,
            T00162_A649TBW03_DM_ARRIVAL_FLG, T00162_n649TBW03_DM_ARRIVAL_FLG, T00162_A650TBW03_DM_ARRIVAL_DATETIME, T00162_n650TBW03_DM_ARRIVAL_DATETIME, T00162_A651TBW03_APPROVAL_FLG, T00162_n651TBW03_APPROVAL_FLG, T00162_A652TBW03_APPROVAL_DATETIME, T00162_n652TBW03_APPROVAL_DATETIME, T00162_A655TBW03_APPROVAL_AUTH_CD, T00162_n655TBW03_APPROVAL_AUTH_CD,
            T00162_A656TBW03_INPUT_END_FLG, T00162_n656TBW03_INPUT_END_FLG, T00162_A657TBW03_INPUT_END_DATETIME, T00162_n657TBW03_INPUT_END_DATETIME, T00162_A660TBW03_INPUT_END_AUTH_CD, T00162_n660TBW03_INPUT_END_AUTH_CD, T00162_A755TBW03_DEL_FLG, T00162_n755TBW03_DEL_FLG, T00162_A756TBW03_CRT_DATETIME, T00162_n756TBW03_CRT_DATETIME,
            T00162_A759TBW03_CRT_PROG_NM, T00162_n759TBW03_CRT_PROG_NM, T00162_A760TBW03_UPD_DATETIME, T00162_n760TBW03_UPD_DATETIME, T00162_A763TBW03_UPD_PROG_NM, T00162_n763TBW03_UPD_PROG_NM, T00162_A764TBW03_UPD_CNT, T00162_n764TBW03_UPD_CNT, T00162_A628TBW03_STUDY_ID, T00162_A630TBW03_CRF_ID,
            T00162_A634TBW03_SITE_ID, T00162_n634TBW03_SITE_ID, T00162_A642TBW03_LOCK_USER_ID, T00162_n642TBW03_LOCK_USER_ID, T00162_A646TBW03_UPLOAD_USER_ID, T00162_n646TBW03_UPLOAD_USER_ID, T00162_A653TBW03_APPROVAL_USER_ID, T00162_n653TBW03_APPROVAL_USER_ID, T00162_A658TBW03_INPUT_END_USER_ID, T00162_n658TBW03_INPUT_END_USER_ID,
            T00162_A757TBW03_CRT_USER_ID, T00162_n757TBW03_CRT_USER_ID, T00162_A761TBW03_UPD_USER_ID, T00162_n761TBW03_UPD_USER_ID
            }
            , new Object[] {
            T00163_A625TBW03_SESSION_ID, T00163_A626TBW03_APP_ID, T00163_A627TBW03_DISP_DATETIME, T00163_A629TBW03_SUBJECT_ID, T00163_A637TBW03_OUTER_SUBJECT_ID, T00163_n637TBW03_OUTER_SUBJECT_ID, T00163_A638TBW03_CRF_LATEST_VERSION, T00163_n638TBW03_CRF_LATEST_VERSION, T00163_A639TBW03_CRF_INPUT_LEVEL, T00163_n639TBW03_CRF_INPUT_LEVEL,
            T00163_A640TBW03_LOCK_FLG, T00163_n640TBW03_LOCK_FLG, T00163_A641TBW03_LOCK_DATETIME, T00163_n641TBW03_LOCK_DATETIME, T00163_A644TBW03_LOCK_AUTH_CD, T00163_n644TBW03_LOCK_AUTH_CD, T00163_A645TBW03_UPLOAD_DATETIME, T00163_n645TBW03_UPLOAD_DATETIME, T00163_A648TBW03_UPLOAD_AUTH_CD, T00163_n648TBW03_UPLOAD_AUTH_CD,
            T00163_A649TBW03_DM_ARRIVAL_FLG, T00163_n649TBW03_DM_ARRIVAL_FLG, T00163_A650TBW03_DM_ARRIVAL_DATETIME, T00163_n650TBW03_DM_ARRIVAL_DATETIME, T00163_A651TBW03_APPROVAL_FLG, T00163_n651TBW03_APPROVAL_FLG, T00163_A652TBW03_APPROVAL_DATETIME, T00163_n652TBW03_APPROVAL_DATETIME, T00163_A655TBW03_APPROVAL_AUTH_CD, T00163_n655TBW03_APPROVAL_AUTH_CD,
            T00163_A656TBW03_INPUT_END_FLG, T00163_n656TBW03_INPUT_END_FLG, T00163_A657TBW03_INPUT_END_DATETIME, T00163_n657TBW03_INPUT_END_DATETIME, T00163_A660TBW03_INPUT_END_AUTH_CD, T00163_n660TBW03_INPUT_END_AUTH_CD, T00163_A755TBW03_DEL_FLG, T00163_n755TBW03_DEL_FLG, T00163_A756TBW03_CRT_DATETIME, T00163_n756TBW03_CRT_DATETIME,
            T00163_A759TBW03_CRT_PROG_NM, T00163_n759TBW03_CRT_PROG_NM, T00163_A760TBW03_UPD_DATETIME, T00163_n760TBW03_UPD_DATETIME, T00163_A763TBW03_UPD_PROG_NM, T00163_n763TBW03_UPD_PROG_NM, T00163_A764TBW03_UPD_CNT, T00163_n764TBW03_UPD_CNT, T00163_A628TBW03_STUDY_ID, T00163_A630TBW03_CRF_ID,
            T00163_A634TBW03_SITE_ID, T00163_n634TBW03_SITE_ID, T00163_A642TBW03_LOCK_USER_ID, T00163_n642TBW03_LOCK_USER_ID, T00163_A646TBW03_UPLOAD_USER_ID, T00163_n646TBW03_UPLOAD_USER_ID, T00163_A653TBW03_APPROVAL_USER_ID, T00163_n653TBW03_APPROVAL_USER_ID, T00163_A658TBW03_INPUT_END_USER_ID, T00163_n658TBW03_INPUT_END_USER_ID,
            T00163_A757TBW03_CRT_USER_ID, T00163_n757TBW03_CRT_USER_ID, T00163_A761TBW03_UPD_USER_ID, T00163_n761TBW03_UPD_USER_ID
            }
            , new Object[] {
            T00164_A631TBW03_CRF_NM, T00164_n631TBW03_CRF_NM, T00164_A632TBW03_CRF_SNM, T00164_n632TBW03_CRF_SNM, T00164_A633TBW03_CRF_ORDER, T00164_n633TBW03_CRF_ORDER
            }
            , new Object[] {
            T00165_A635TBW03_SITE_NM, T00165_n635TBW03_SITE_NM, T00165_A636TBW03_SITE_RYAK_NM, T00165_n636TBW03_SITE_RYAK_NM
            }
            , new Object[] {
            T00166_A643TBW03_LOCK_USER_NM, T00166_n643TBW03_LOCK_USER_NM
            }
            , new Object[] {
            T00167_A647TBW03_UPLOAD_USER_NM, T00167_n647TBW03_UPLOAD_USER_NM
            }
            , new Object[] {
            T00168_A654TBW03_APPROVAL_USER_NM, T00168_n654TBW03_APPROVAL_USER_NM
            }
            , new Object[] {
            T00169_A659TBW03_INPUT_END_USER_NM, T00169_n659TBW03_INPUT_END_USER_NM
            }
            , new Object[] {
            T001610_A758TBW03_CRT_USER_NM, T001610_n758TBW03_CRT_USER_NM
            }
            , new Object[] {
            T001611_A762TBW03_UPD_USER_NM, T001611_n762TBW03_UPD_USER_NM
            }
            , new Object[] {
            T001612_A625TBW03_SESSION_ID, T001612_A626TBW03_APP_ID, T001612_A627TBW03_DISP_DATETIME, T001612_A629TBW03_SUBJECT_ID, T001612_A631TBW03_CRF_NM, T001612_n631TBW03_CRF_NM, T001612_A632TBW03_CRF_SNM, T001612_n632TBW03_CRF_SNM, T001612_A633TBW03_CRF_ORDER, T001612_n633TBW03_CRF_ORDER,
            T001612_A635TBW03_SITE_NM, T001612_n635TBW03_SITE_NM, T001612_A636TBW03_SITE_RYAK_NM, T001612_n636TBW03_SITE_RYAK_NM, T001612_A637TBW03_OUTER_SUBJECT_ID, T001612_n637TBW03_OUTER_SUBJECT_ID, T001612_A638TBW03_CRF_LATEST_VERSION, T001612_n638TBW03_CRF_LATEST_VERSION, T001612_A639TBW03_CRF_INPUT_LEVEL, T001612_n639TBW03_CRF_INPUT_LEVEL,
            T001612_A640TBW03_LOCK_FLG, T001612_n640TBW03_LOCK_FLG, T001612_A641TBW03_LOCK_DATETIME, T001612_n641TBW03_LOCK_DATETIME, T001612_A643TBW03_LOCK_USER_NM, T001612_n643TBW03_LOCK_USER_NM, T001612_A644TBW03_LOCK_AUTH_CD, T001612_n644TBW03_LOCK_AUTH_CD, T001612_A645TBW03_UPLOAD_DATETIME, T001612_n645TBW03_UPLOAD_DATETIME,
            T001612_A647TBW03_UPLOAD_USER_NM, T001612_n647TBW03_UPLOAD_USER_NM, T001612_A648TBW03_UPLOAD_AUTH_CD, T001612_n648TBW03_UPLOAD_AUTH_CD, T001612_A649TBW03_DM_ARRIVAL_FLG, T001612_n649TBW03_DM_ARRIVAL_FLG, T001612_A650TBW03_DM_ARRIVAL_DATETIME, T001612_n650TBW03_DM_ARRIVAL_DATETIME, T001612_A651TBW03_APPROVAL_FLG, T001612_n651TBW03_APPROVAL_FLG,
            T001612_A652TBW03_APPROVAL_DATETIME, T001612_n652TBW03_APPROVAL_DATETIME, T001612_A654TBW03_APPROVAL_USER_NM, T001612_n654TBW03_APPROVAL_USER_NM, T001612_A655TBW03_APPROVAL_AUTH_CD, T001612_n655TBW03_APPROVAL_AUTH_CD, T001612_A656TBW03_INPUT_END_FLG, T001612_n656TBW03_INPUT_END_FLG, T001612_A657TBW03_INPUT_END_DATETIME, T001612_n657TBW03_INPUT_END_DATETIME,
            T001612_A659TBW03_INPUT_END_USER_NM, T001612_n659TBW03_INPUT_END_USER_NM, T001612_A660TBW03_INPUT_END_AUTH_CD, T001612_n660TBW03_INPUT_END_AUTH_CD, T001612_A755TBW03_DEL_FLG, T001612_n755TBW03_DEL_FLG, T001612_A756TBW03_CRT_DATETIME, T001612_n756TBW03_CRT_DATETIME, T001612_A758TBW03_CRT_USER_NM, T001612_n758TBW03_CRT_USER_NM,
            T001612_A759TBW03_CRT_PROG_NM, T001612_n759TBW03_CRT_PROG_NM, T001612_A760TBW03_UPD_DATETIME, T001612_n760TBW03_UPD_DATETIME, T001612_A762TBW03_UPD_USER_NM, T001612_n762TBW03_UPD_USER_NM, T001612_A763TBW03_UPD_PROG_NM, T001612_n763TBW03_UPD_PROG_NM, T001612_A764TBW03_UPD_CNT, T001612_n764TBW03_UPD_CNT,
            T001612_A628TBW03_STUDY_ID, T001612_A630TBW03_CRF_ID, T001612_A634TBW03_SITE_ID, T001612_n634TBW03_SITE_ID, T001612_A642TBW03_LOCK_USER_ID, T001612_n642TBW03_LOCK_USER_ID, T001612_A646TBW03_UPLOAD_USER_ID, T001612_n646TBW03_UPLOAD_USER_ID, T001612_A653TBW03_APPROVAL_USER_ID, T001612_n653TBW03_APPROVAL_USER_ID,
            T001612_A658TBW03_INPUT_END_USER_ID, T001612_n658TBW03_INPUT_END_USER_ID, T001612_A757TBW03_CRT_USER_ID, T001612_n757TBW03_CRT_USER_ID, T001612_A761TBW03_UPD_USER_ID, T001612_n761TBW03_UPD_USER_ID
            }
            , new Object[] {
            T001613_A631TBW03_CRF_NM, T001613_n631TBW03_CRF_NM, T001613_A632TBW03_CRF_SNM, T001613_n632TBW03_CRF_SNM, T001613_A633TBW03_CRF_ORDER, T001613_n633TBW03_CRF_ORDER
            }
            , new Object[] {
            T001614_A635TBW03_SITE_NM, T001614_n635TBW03_SITE_NM, T001614_A636TBW03_SITE_RYAK_NM, T001614_n636TBW03_SITE_RYAK_NM
            }
            , new Object[] {
            T001615_A643TBW03_LOCK_USER_NM, T001615_n643TBW03_LOCK_USER_NM
            }
            , new Object[] {
            T001616_A647TBW03_UPLOAD_USER_NM, T001616_n647TBW03_UPLOAD_USER_NM
            }
            , new Object[] {
            T001617_A654TBW03_APPROVAL_USER_NM, T001617_n654TBW03_APPROVAL_USER_NM
            }
            , new Object[] {
            T001618_A659TBW03_INPUT_END_USER_NM, T001618_n659TBW03_INPUT_END_USER_NM
            }
            , new Object[] {
            T001619_A758TBW03_CRT_USER_NM, T001619_n758TBW03_CRT_USER_NM
            }
            , new Object[] {
            T001620_A762TBW03_UPD_USER_NM, T001620_n762TBW03_UPD_USER_NM
            }
            , new Object[] {
            T001621_A625TBW03_SESSION_ID, T001621_A626TBW03_APP_ID, T001621_A627TBW03_DISP_DATETIME, T001621_A628TBW03_STUDY_ID, T001621_A629TBW03_SUBJECT_ID, T001621_A630TBW03_CRF_ID
            }
            , new Object[] {
            T001622_A625TBW03_SESSION_ID, T001622_A626TBW03_APP_ID, T001622_A627TBW03_DISP_DATETIME, T001622_A628TBW03_STUDY_ID, T001622_A629TBW03_SUBJECT_ID, T001622_A630TBW03_CRF_ID
            }
            , new Object[] {
            T001623_A625TBW03_SESSION_ID, T001623_A626TBW03_APP_ID, T001623_A627TBW03_DISP_DATETIME, T001623_A628TBW03_STUDY_ID, T001623_A629TBW03_SUBJECT_ID, T001623_A630TBW03_CRF_ID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T001627_A631TBW03_CRF_NM, T001627_n631TBW03_CRF_NM, T001627_A632TBW03_CRF_SNM, T001627_n632TBW03_CRF_SNM, T001627_A633TBW03_CRF_ORDER, T001627_n633TBW03_CRF_ORDER
            }
            , new Object[] {
            T001628_A635TBW03_SITE_NM, T001628_n635TBW03_SITE_NM, T001628_A636TBW03_SITE_RYAK_NM, T001628_n636TBW03_SITE_RYAK_NM
            }
            , new Object[] {
            T001629_A643TBW03_LOCK_USER_NM, T001629_n643TBW03_LOCK_USER_NM
            }
            , new Object[] {
            T001630_A647TBW03_UPLOAD_USER_NM, T001630_n647TBW03_UPLOAD_USER_NM
            }
            , new Object[] {
            T001631_A654TBW03_APPROVAL_USER_NM, T001631_n654TBW03_APPROVAL_USER_NM
            }
            , new Object[] {
            T001632_A659TBW03_INPUT_END_USER_NM, T001632_n659TBW03_INPUT_END_USER_NM
            }
            , new Object[] {
            T001633_A758TBW03_CRT_USER_NM, T001633_n758TBW03_CRT_USER_NM
            }
            , new Object[] {
            T001634_A762TBW03_UPD_USER_NM, T001634_n762TBW03_UPD_USER_NM
            }
            , new Object[] {
            T001635_A625TBW03_SESSION_ID, T001635_A626TBW03_APP_ID, T001635_A627TBW03_DISP_DATETIME, T001635_A628TBW03_STUDY_ID, T001635_A629TBW03_SUBJECT_ID, T001635_A630TBW03_CRF_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV8Pgmname = "TBW03_CRF_SEARCH" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A639TBW03_CRF_INPUT_LEVEL ;
   private byte Z639TBW03_CRF_INPUT_LEVEL ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short A630TBW03_CRF_ID ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A638TBW03_CRF_LATEST_VERSION ;
   private short Z630TBW03_CRF_ID ;
   private short Z638TBW03_CRF_LATEST_VERSION ;
   private short RcdFound41 ;
   private short Gx_err ;
   private int trnEnded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int edtTBW03_SESSION_ID_Enabled ;
   private int edtTBW03_APP_ID_Enabled ;
   private int edtTBW03_DISP_DATETIME_Enabled ;
   private int edtTBW03_STUDY_ID_Enabled ;
   private int A629TBW03_SUBJECT_ID ;
   private int edtTBW03_SUBJECT_ID_Enabled ;
   private int edtTBW03_CRF_ID_Enabled ;
   private int edtTBW03_CRF_NM_Enabled ;
   private int edtTBW03_CRF_SNM_Enabled ;
   private int A633TBW03_CRF_ORDER ;
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
   private int Z629TBW03_SUBJECT_ID ;
   private int GX_JID ;
   private int Z633TBW03_CRF_ORDER ;
   private int AnyError628 ;
   private int AnyError630 ;
   private int AnyError634 ;
   private int AnyError642 ;
   private int AnyError646 ;
   private int AnyError653 ;
   private int AnyError658 ;
   private int AnyError757 ;
   private int AnyError761 ;
   private int idxLst ;
   private int GXActiveErrHndl ;
   private long A628TBW03_STUDY_ID ;
   private long A764TBW03_UPD_CNT ;
   private long Z628TBW03_STUDY_ID ;
   private long Z764TBW03_UPD_CNT ;
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
   private String GXt_char3 ;
   private String GXt_char2 ;
   private String GXt_char1 ;
   private String ZV8Pgmname ;
   private String Gx_emsg ;
   private java.util.Date A641TBW03_LOCK_DATETIME ;
   private java.util.Date A645TBW03_UPLOAD_DATETIME ;
   private java.util.Date A650TBW03_DM_ARRIVAL_DATETIME ;
   private java.util.Date A652TBW03_APPROVAL_DATETIME ;
   private java.util.Date A657TBW03_INPUT_END_DATETIME ;
   private java.util.Date A756TBW03_CRT_DATETIME ;
   private java.util.Date A760TBW03_UPD_DATETIME ;
   private java.util.Date Z641TBW03_LOCK_DATETIME ;
   private java.util.Date Z645TBW03_UPLOAD_DATETIME ;
   private java.util.Date Z650TBW03_DM_ARRIVAL_DATETIME ;
   private java.util.Date Z652TBW03_APPROVAL_DATETIME ;
   private java.util.Date Z657TBW03_INPUT_END_DATETIME ;
   private java.util.Date Z756TBW03_CRT_DATETIME ;
   private java.util.Date Z760TBW03_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean n634TBW03_SITE_ID ;
   private boolean n642TBW03_LOCK_USER_ID ;
   private boolean n646TBW03_UPLOAD_USER_ID ;
   private boolean n653TBW03_APPROVAL_USER_ID ;
   private boolean n658TBW03_INPUT_END_USER_ID ;
   private boolean n757TBW03_CRT_USER_ID ;
   private boolean n761TBW03_UPD_USER_ID ;
   private boolean wbErr ;
   private boolean n631TBW03_CRF_NM ;
   private boolean n632TBW03_CRF_SNM ;
   private boolean n633TBW03_CRF_ORDER ;
   private boolean n635TBW03_SITE_NM ;
   private boolean n636TBW03_SITE_RYAK_NM ;
   private boolean n637TBW03_OUTER_SUBJECT_ID ;
   private boolean n638TBW03_CRF_LATEST_VERSION ;
   private boolean n639TBW03_CRF_INPUT_LEVEL ;
   private boolean n640TBW03_LOCK_FLG ;
   private boolean n641TBW03_LOCK_DATETIME ;
   private boolean n643TBW03_LOCK_USER_NM ;
   private boolean n644TBW03_LOCK_AUTH_CD ;
   private boolean n645TBW03_UPLOAD_DATETIME ;
   private boolean n647TBW03_UPLOAD_USER_NM ;
   private boolean n648TBW03_UPLOAD_AUTH_CD ;
   private boolean n649TBW03_DM_ARRIVAL_FLG ;
   private boolean n650TBW03_DM_ARRIVAL_DATETIME ;
   private boolean n651TBW03_APPROVAL_FLG ;
   private boolean n652TBW03_APPROVAL_DATETIME ;
   private boolean n654TBW03_APPROVAL_USER_NM ;
   private boolean n655TBW03_APPROVAL_AUTH_CD ;
   private boolean n656TBW03_INPUT_END_FLG ;
   private boolean n657TBW03_INPUT_END_DATETIME ;
   private boolean n659TBW03_INPUT_END_USER_NM ;
   private boolean n660TBW03_INPUT_END_AUTH_CD ;
   private boolean n755TBW03_DEL_FLG ;
   private boolean n756TBW03_CRT_DATETIME ;
   private boolean n758TBW03_CRT_USER_NM ;
   private boolean n759TBW03_CRT_PROG_NM ;
   private boolean n760TBW03_UPD_DATETIME ;
   private boolean n762TBW03_UPD_USER_NM ;
   private boolean n763TBW03_UPD_PROG_NM ;
   private boolean n764TBW03_UPD_CNT ;
   private boolean Gx_longc ;
   private String A634TBW03_SITE_ID ;
   private String A642TBW03_LOCK_USER_ID ;
   private String A646TBW03_UPLOAD_USER_ID ;
   private String A653TBW03_APPROVAL_USER_ID ;
   private String A658TBW03_INPUT_END_USER_ID ;
   private String A757TBW03_CRT_USER_ID ;
   private String A761TBW03_UPD_USER_ID ;
   private String A625TBW03_SESSION_ID ;
   private String A626TBW03_APP_ID ;
   private String A627TBW03_DISP_DATETIME ;
   private String A631TBW03_CRF_NM ;
   private String A632TBW03_CRF_SNM ;
   private String A635TBW03_SITE_NM ;
   private String A636TBW03_SITE_RYAK_NM ;
   private String A637TBW03_OUTER_SUBJECT_ID ;
   private String A640TBW03_LOCK_FLG ;
   private String A643TBW03_LOCK_USER_NM ;
   private String A644TBW03_LOCK_AUTH_CD ;
   private String A647TBW03_UPLOAD_USER_NM ;
   private String A648TBW03_UPLOAD_AUTH_CD ;
   private String A649TBW03_DM_ARRIVAL_FLG ;
   private String A651TBW03_APPROVAL_FLG ;
   private String A654TBW03_APPROVAL_USER_NM ;
   private String A655TBW03_APPROVAL_AUTH_CD ;
   private String A656TBW03_INPUT_END_FLG ;
   private String A659TBW03_INPUT_END_USER_NM ;
   private String A660TBW03_INPUT_END_AUTH_CD ;
   private String A755TBW03_DEL_FLG ;
   private String A758TBW03_CRT_USER_NM ;
   private String A759TBW03_CRT_PROG_NM ;
   private String A762TBW03_UPD_USER_NM ;
   private String A763TBW03_UPD_PROG_NM ;
   private String Z625TBW03_SESSION_ID ;
   private String Z626TBW03_APP_ID ;
   private String Z627TBW03_DISP_DATETIME ;
   private String Z637TBW03_OUTER_SUBJECT_ID ;
   private String Z640TBW03_LOCK_FLG ;
   private String Z644TBW03_LOCK_AUTH_CD ;
   private String Z648TBW03_UPLOAD_AUTH_CD ;
   private String Z649TBW03_DM_ARRIVAL_FLG ;
   private String Z651TBW03_APPROVAL_FLG ;
   private String Z655TBW03_APPROVAL_AUTH_CD ;
   private String Z656TBW03_INPUT_END_FLG ;
   private String Z660TBW03_INPUT_END_AUTH_CD ;
   private String Z755TBW03_DEL_FLG ;
   private String Z759TBW03_CRT_PROG_NM ;
   private String Z763TBW03_UPD_PROG_NM ;
   private String Z634TBW03_SITE_ID ;
   private String Z642TBW03_LOCK_USER_ID ;
   private String Z646TBW03_UPLOAD_USER_ID ;
   private String Z653TBW03_APPROVAL_USER_ID ;
   private String Z658TBW03_INPUT_END_USER_ID ;
   private String Z757TBW03_CRT_USER_ID ;
   private String Z761TBW03_UPD_USER_ID ;
   private String AV7W_BC_FLG ;
   private String Z631TBW03_CRF_NM ;
   private String Z632TBW03_CRF_SNM ;
   private String Z635TBW03_SITE_NM ;
   private String Z636TBW03_SITE_RYAK_NM ;
   private String Z643TBW03_LOCK_USER_NM ;
   private String Z647TBW03_UPLOAD_USER_NM ;
   private String Z654TBW03_APPROVAL_USER_NM ;
   private String Z659TBW03_INPUT_END_USER_NM ;
   private String Z758TBW03_CRT_USER_NM ;
   private String Z762TBW03_UPD_USER_NM ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private String[] T001612_A625TBW03_SESSION_ID ;
   private String[] T001612_A626TBW03_APP_ID ;
   private String[] T001612_A627TBW03_DISP_DATETIME ;
   private int[] T001612_A629TBW03_SUBJECT_ID ;
   private String[] T001612_A631TBW03_CRF_NM ;
   private boolean[] T001612_n631TBW03_CRF_NM ;
   private String[] T001612_A632TBW03_CRF_SNM ;
   private boolean[] T001612_n632TBW03_CRF_SNM ;
   private int[] T001612_A633TBW03_CRF_ORDER ;
   private boolean[] T001612_n633TBW03_CRF_ORDER ;
   private String[] T001612_A635TBW03_SITE_NM ;
   private boolean[] T001612_n635TBW03_SITE_NM ;
   private String[] T001612_A636TBW03_SITE_RYAK_NM ;
   private boolean[] T001612_n636TBW03_SITE_RYAK_NM ;
   private String[] T001612_A637TBW03_OUTER_SUBJECT_ID ;
   private boolean[] T001612_n637TBW03_OUTER_SUBJECT_ID ;
   private short[] T001612_A638TBW03_CRF_LATEST_VERSION ;
   private boolean[] T001612_n638TBW03_CRF_LATEST_VERSION ;
   private byte[] T001612_A639TBW03_CRF_INPUT_LEVEL ;
   private boolean[] T001612_n639TBW03_CRF_INPUT_LEVEL ;
   private String[] T001612_A640TBW03_LOCK_FLG ;
   private boolean[] T001612_n640TBW03_LOCK_FLG ;
   private java.util.Date[] T001612_A641TBW03_LOCK_DATETIME ;
   private boolean[] T001612_n641TBW03_LOCK_DATETIME ;
   private String[] T001612_A643TBW03_LOCK_USER_NM ;
   private boolean[] T001612_n643TBW03_LOCK_USER_NM ;
   private String[] T001612_A644TBW03_LOCK_AUTH_CD ;
   private boolean[] T001612_n644TBW03_LOCK_AUTH_CD ;
   private java.util.Date[] T001612_A645TBW03_UPLOAD_DATETIME ;
   private boolean[] T001612_n645TBW03_UPLOAD_DATETIME ;
   private String[] T001612_A647TBW03_UPLOAD_USER_NM ;
   private boolean[] T001612_n647TBW03_UPLOAD_USER_NM ;
   private String[] T001612_A648TBW03_UPLOAD_AUTH_CD ;
   private boolean[] T001612_n648TBW03_UPLOAD_AUTH_CD ;
   private String[] T001612_A649TBW03_DM_ARRIVAL_FLG ;
   private boolean[] T001612_n649TBW03_DM_ARRIVAL_FLG ;
   private java.util.Date[] T001612_A650TBW03_DM_ARRIVAL_DATETIME ;
   private boolean[] T001612_n650TBW03_DM_ARRIVAL_DATETIME ;
   private String[] T001612_A651TBW03_APPROVAL_FLG ;
   private boolean[] T001612_n651TBW03_APPROVAL_FLG ;
   private java.util.Date[] T001612_A652TBW03_APPROVAL_DATETIME ;
   private boolean[] T001612_n652TBW03_APPROVAL_DATETIME ;
   private String[] T001612_A654TBW03_APPROVAL_USER_NM ;
   private boolean[] T001612_n654TBW03_APPROVAL_USER_NM ;
   private String[] T001612_A655TBW03_APPROVAL_AUTH_CD ;
   private boolean[] T001612_n655TBW03_APPROVAL_AUTH_CD ;
   private String[] T001612_A656TBW03_INPUT_END_FLG ;
   private boolean[] T001612_n656TBW03_INPUT_END_FLG ;
   private java.util.Date[] T001612_A657TBW03_INPUT_END_DATETIME ;
   private boolean[] T001612_n657TBW03_INPUT_END_DATETIME ;
   private String[] T001612_A659TBW03_INPUT_END_USER_NM ;
   private boolean[] T001612_n659TBW03_INPUT_END_USER_NM ;
   private String[] T001612_A660TBW03_INPUT_END_AUTH_CD ;
   private boolean[] T001612_n660TBW03_INPUT_END_AUTH_CD ;
   private String[] T001612_A755TBW03_DEL_FLG ;
   private boolean[] T001612_n755TBW03_DEL_FLG ;
   private java.util.Date[] T001612_A756TBW03_CRT_DATETIME ;
   private boolean[] T001612_n756TBW03_CRT_DATETIME ;
   private String[] T001612_A758TBW03_CRT_USER_NM ;
   private boolean[] T001612_n758TBW03_CRT_USER_NM ;
   private String[] T001612_A759TBW03_CRT_PROG_NM ;
   private boolean[] T001612_n759TBW03_CRT_PROG_NM ;
   private java.util.Date[] T001612_A760TBW03_UPD_DATETIME ;
   private boolean[] T001612_n760TBW03_UPD_DATETIME ;
   private String[] T001612_A762TBW03_UPD_USER_NM ;
   private boolean[] T001612_n762TBW03_UPD_USER_NM ;
   private String[] T001612_A763TBW03_UPD_PROG_NM ;
   private boolean[] T001612_n763TBW03_UPD_PROG_NM ;
   private long[] T001612_A764TBW03_UPD_CNT ;
   private boolean[] T001612_n764TBW03_UPD_CNT ;
   private long[] T001612_A628TBW03_STUDY_ID ;
   private short[] T001612_A630TBW03_CRF_ID ;
   private String[] T001612_A634TBW03_SITE_ID ;
   private boolean[] T001612_n634TBW03_SITE_ID ;
   private String[] T001612_A642TBW03_LOCK_USER_ID ;
   private boolean[] T001612_n642TBW03_LOCK_USER_ID ;
   private String[] T001612_A646TBW03_UPLOAD_USER_ID ;
   private boolean[] T001612_n646TBW03_UPLOAD_USER_ID ;
   private String[] T001612_A653TBW03_APPROVAL_USER_ID ;
   private boolean[] T001612_n653TBW03_APPROVAL_USER_ID ;
   private String[] T001612_A658TBW03_INPUT_END_USER_ID ;
   private boolean[] T001612_n658TBW03_INPUT_END_USER_ID ;
   private String[] T001612_A757TBW03_CRT_USER_ID ;
   private boolean[] T001612_n757TBW03_CRT_USER_ID ;
   private String[] T001612_A761TBW03_UPD_USER_ID ;
   private boolean[] T001612_n761TBW03_UPD_USER_ID ;
   private String[] T00164_A631TBW03_CRF_NM ;
   private boolean[] T00164_n631TBW03_CRF_NM ;
   private String[] T00164_A632TBW03_CRF_SNM ;
   private boolean[] T00164_n632TBW03_CRF_SNM ;
   private int[] T00164_A633TBW03_CRF_ORDER ;
   private boolean[] T00164_n633TBW03_CRF_ORDER ;
   private String[] T00165_A635TBW03_SITE_NM ;
   private boolean[] T00165_n635TBW03_SITE_NM ;
   private String[] T00165_A636TBW03_SITE_RYAK_NM ;
   private boolean[] T00165_n636TBW03_SITE_RYAK_NM ;
   private String[] T00166_A643TBW03_LOCK_USER_NM ;
   private boolean[] T00166_n643TBW03_LOCK_USER_NM ;
   private String[] T00167_A647TBW03_UPLOAD_USER_NM ;
   private boolean[] T00167_n647TBW03_UPLOAD_USER_NM ;
   private String[] T00168_A654TBW03_APPROVAL_USER_NM ;
   private boolean[] T00168_n654TBW03_APPROVAL_USER_NM ;
   private String[] T00169_A659TBW03_INPUT_END_USER_NM ;
   private boolean[] T00169_n659TBW03_INPUT_END_USER_NM ;
   private String[] T001610_A758TBW03_CRT_USER_NM ;
   private boolean[] T001610_n758TBW03_CRT_USER_NM ;
   private String[] T001611_A762TBW03_UPD_USER_NM ;
   private boolean[] T001611_n762TBW03_UPD_USER_NM ;
   private String[] T001613_A631TBW03_CRF_NM ;
   private boolean[] T001613_n631TBW03_CRF_NM ;
   private String[] T001613_A632TBW03_CRF_SNM ;
   private boolean[] T001613_n632TBW03_CRF_SNM ;
   private int[] T001613_A633TBW03_CRF_ORDER ;
   private boolean[] T001613_n633TBW03_CRF_ORDER ;
   private String[] T001614_A635TBW03_SITE_NM ;
   private boolean[] T001614_n635TBW03_SITE_NM ;
   private String[] T001614_A636TBW03_SITE_RYAK_NM ;
   private boolean[] T001614_n636TBW03_SITE_RYAK_NM ;
   private String[] T001615_A643TBW03_LOCK_USER_NM ;
   private boolean[] T001615_n643TBW03_LOCK_USER_NM ;
   private String[] T001616_A647TBW03_UPLOAD_USER_NM ;
   private boolean[] T001616_n647TBW03_UPLOAD_USER_NM ;
   private String[] T001617_A654TBW03_APPROVAL_USER_NM ;
   private boolean[] T001617_n654TBW03_APPROVAL_USER_NM ;
   private String[] T001618_A659TBW03_INPUT_END_USER_NM ;
   private boolean[] T001618_n659TBW03_INPUT_END_USER_NM ;
   private String[] T001619_A758TBW03_CRT_USER_NM ;
   private boolean[] T001619_n758TBW03_CRT_USER_NM ;
   private String[] T001620_A762TBW03_UPD_USER_NM ;
   private boolean[] T001620_n762TBW03_UPD_USER_NM ;
   private String[] T001621_A625TBW03_SESSION_ID ;
   private String[] T001621_A626TBW03_APP_ID ;
   private String[] T001621_A627TBW03_DISP_DATETIME ;
   private long[] T001621_A628TBW03_STUDY_ID ;
   private int[] T001621_A629TBW03_SUBJECT_ID ;
   private short[] T001621_A630TBW03_CRF_ID ;
   private String[] T00163_A625TBW03_SESSION_ID ;
   private String[] T00163_A626TBW03_APP_ID ;
   private String[] T00163_A627TBW03_DISP_DATETIME ;
   private int[] T00163_A629TBW03_SUBJECT_ID ;
   private String[] T00163_A637TBW03_OUTER_SUBJECT_ID ;
   private boolean[] T00163_n637TBW03_OUTER_SUBJECT_ID ;
   private short[] T00163_A638TBW03_CRF_LATEST_VERSION ;
   private boolean[] T00163_n638TBW03_CRF_LATEST_VERSION ;
   private byte[] T00163_A639TBW03_CRF_INPUT_LEVEL ;
   private boolean[] T00163_n639TBW03_CRF_INPUT_LEVEL ;
   private String[] T00163_A640TBW03_LOCK_FLG ;
   private boolean[] T00163_n640TBW03_LOCK_FLG ;
   private java.util.Date[] T00163_A641TBW03_LOCK_DATETIME ;
   private boolean[] T00163_n641TBW03_LOCK_DATETIME ;
   private String[] T00163_A644TBW03_LOCK_AUTH_CD ;
   private boolean[] T00163_n644TBW03_LOCK_AUTH_CD ;
   private java.util.Date[] T00163_A645TBW03_UPLOAD_DATETIME ;
   private boolean[] T00163_n645TBW03_UPLOAD_DATETIME ;
   private String[] T00163_A648TBW03_UPLOAD_AUTH_CD ;
   private boolean[] T00163_n648TBW03_UPLOAD_AUTH_CD ;
   private String[] T00163_A649TBW03_DM_ARRIVAL_FLG ;
   private boolean[] T00163_n649TBW03_DM_ARRIVAL_FLG ;
   private java.util.Date[] T00163_A650TBW03_DM_ARRIVAL_DATETIME ;
   private boolean[] T00163_n650TBW03_DM_ARRIVAL_DATETIME ;
   private String[] T00163_A651TBW03_APPROVAL_FLG ;
   private boolean[] T00163_n651TBW03_APPROVAL_FLG ;
   private java.util.Date[] T00163_A652TBW03_APPROVAL_DATETIME ;
   private boolean[] T00163_n652TBW03_APPROVAL_DATETIME ;
   private String[] T00163_A655TBW03_APPROVAL_AUTH_CD ;
   private boolean[] T00163_n655TBW03_APPROVAL_AUTH_CD ;
   private String[] T00163_A656TBW03_INPUT_END_FLG ;
   private boolean[] T00163_n656TBW03_INPUT_END_FLG ;
   private java.util.Date[] T00163_A657TBW03_INPUT_END_DATETIME ;
   private boolean[] T00163_n657TBW03_INPUT_END_DATETIME ;
   private String[] T00163_A660TBW03_INPUT_END_AUTH_CD ;
   private boolean[] T00163_n660TBW03_INPUT_END_AUTH_CD ;
   private String[] T00163_A755TBW03_DEL_FLG ;
   private boolean[] T00163_n755TBW03_DEL_FLG ;
   private java.util.Date[] T00163_A756TBW03_CRT_DATETIME ;
   private boolean[] T00163_n756TBW03_CRT_DATETIME ;
   private String[] T00163_A759TBW03_CRT_PROG_NM ;
   private boolean[] T00163_n759TBW03_CRT_PROG_NM ;
   private java.util.Date[] T00163_A760TBW03_UPD_DATETIME ;
   private boolean[] T00163_n760TBW03_UPD_DATETIME ;
   private String[] T00163_A763TBW03_UPD_PROG_NM ;
   private boolean[] T00163_n763TBW03_UPD_PROG_NM ;
   private long[] T00163_A764TBW03_UPD_CNT ;
   private boolean[] T00163_n764TBW03_UPD_CNT ;
   private long[] T00163_A628TBW03_STUDY_ID ;
   private short[] T00163_A630TBW03_CRF_ID ;
   private String[] T00163_A634TBW03_SITE_ID ;
   private boolean[] T00163_n634TBW03_SITE_ID ;
   private String[] T00163_A642TBW03_LOCK_USER_ID ;
   private boolean[] T00163_n642TBW03_LOCK_USER_ID ;
   private String[] T00163_A646TBW03_UPLOAD_USER_ID ;
   private boolean[] T00163_n646TBW03_UPLOAD_USER_ID ;
   private String[] T00163_A653TBW03_APPROVAL_USER_ID ;
   private boolean[] T00163_n653TBW03_APPROVAL_USER_ID ;
   private String[] T00163_A658TBW03_INPUT_END_USER_ID ;
   private boolean[] T00163_n658TBW03_INPUT_END_USER_ID ;
   private String[] T00163_A757TBW03_CRT_USER_ID ;
   private boolean[] T00163_n757TBW03_CRT_USER_ID ;
   private String[] T00163_A761TBW03_UPD_USER_ID ;
   private boolean[] T00163_n761TBW03_UPD_USER_ID ;
   private String[] T001622_A625TBW03_SESSION_ID ;
   private String[] T001622_A626TBW03_APP_ID ;
   private String[] T001622_A627TBW03_DISP_DATETIME ;
   private long[] T001622_A628TBW03_STUDY_ID ;
   private int[] T001622_A629TBW03_SUBJECT_ID ;
   private short[] T001622_A630TBW03_CRF_ID ;
   private String[] T001623_A625TBW03_SESSION_ID ;
   private String[] T001623_A626TBW03_APP_ID ;
   private String[] T001623_A627TBW03_DISP_DATETIME ;
   private long[] T001623_A628TBW03_STUDY_ID ;
   private int[] T001623_A629TBW03_SUBJECT_ID ;
   private short[] T001623_A630TBW03_CRF_ID ;
   private String[] T00162_A625TBW03_SESSION_ID ;
   private String[] T00162_A626TBW03_APP_ID ;
   private String[] T00162_A627TBW03_DISP_DATETIME ;
   private int[] T00162_A629TBW03_SUBJECT_ID ;
   private String[] T00162_A637TBW03_OUTER_SUBJECT_ID ;
   private boolean[] T00162_n637TBW03_OUTER_SUBJECT_ID ;
   private short[] T00162_A638TBW03_CRF_LATEST_VERSION ;
   private boolean[] T00162_n638TBW03_CRF_LATEST_VERSION ;
   private byte[] T00162_A639TBW03_CRF_INPUT_LEVEL ;
   private boolean[] T00162_n639TBW03_CRF_INPUT_LEVEL ;
   private String[] T00162_A640TBW03_LOCK_FLG ;
   private boolean[] T00162_n640TBW03_LOCK_FLG ;
   private java.util.Date[] T00162_A641TBW03_LOCK_DATETIME ;
   private boolean[] T00162_n641TBW03_LOCK_DATETIME ;
   private String[] T00162_A644TBW03_LOCK_AUTH_CD ;
   private boolean[] T00162_n644TBW03_LOCK_AUTH_CD ;
   private java.util.Date[] T00162_A645TBW03_UPLOAD_DATETIME ;
   private boolean[] T00162_n645TBW03_UPLOAD_DATETIME ;
   private String[] T00162_A648TBW03_UPLOAD_AUTH_CD ;
   private boolean[] T00162_n648TBW03_UPLOAD_AUTH_CD ;
   private String[] T00162_A649TBW03_DM_ARRIVAL_FLG ;
   private boolean[] T00162_n649TBW03_DM_ARRIVAL_FLG ;
   private java.util.Date[] T00162_A650TBW03_DM_ARRIVAL_DATETIME ;
   private boolean[] T00162_n650TBW03_DM_ARRIVAL_DATETIME ;
   private String[] T00162_A651TBW03_APPROVAL_FLG ;
   private boolean[] T00162_n651TBW03_APPROVAL_FLG ;
   private java.util.Date[] T00162_A652TBW03_APPROVAL_DATETIME ;
   private boolean[] T00162_n652TBW03_APPROVAL_DATETIME ;
   private String[] T00162_A655TBW03_APPROVAL_AUTH_CD ;
   private boolean[] T00162_n655TBW03_APPROVAL_AUTH_CD ;
   private String[] T00162_A656TBW03_INPUT_END_FLG ;
   private boolean[] T00162_n656TBW03_INPUT_END_FLG ;
   private java.util.Date[] T00162_A657TBW03_INPUT_END_DATETIME ;
   private boolean[] T00162_n657TBW03_INPUT_END_DATETIME ;
   private String[] T00162_A660TBW03_INPUT_END_AUTH_CD ;
   private boolean[] T00162_n660TBW03_INPUT_END_AUTH_CD ;
   private String[] T00162_A755TBW03_DEL_FLG ;
   private boolean[] T00162_n755TBW03_DEL_FLG ;
   private java.util.Date[] T00162_A756TBW03_CRT_DATETIME ;
   private boolean[] T00162_n756TBW03_CRT_DATETIME ;
   private String[] T00162_A759TBW03_CRT_PROG_NM ;
   private boolean[] T00162_n759TBW03_CRT_PROG_NM ;
   private java.util.Date[] T00162_A760TBW03_UPD_DATETIME ;
   private boolean[] T00162_n760TBW03_UPD_DATETIME ;
   private String[] T00162_A763TBW03_UPD_PROG_NM ;
   private boolean[] T00162_n763TBW03_UPD_PROG_NM ;
   private long[] T00162_A764TBW03_UPD_CNT ;
   private boolean[] T00162_n764TBW03_UPD_CNT ;
   private long[] T00162_A628TBW03_STUDY_ID ;
   private short[] T00162_A630TBW03_CRF_ID ;
   private String[] T00162_A634TBW03_SITE_ID ;
   private boolean[] T00162_n634TBW03_SITE_ID ;
   private String[] T00162_A642TBW03_LOCK_USER_ID ;
   private boolean[] T00162_n642TBW03_LOCK_USER_ID ;
   private String[] T00162_A646TBW03_UPLOAD_USER_ID ;
   private boolean[] T00162_n646TBW03_UPLOAD_USER_ID ;
   private String[] T00162_A653TBW03_APPROVAL_USER_ID ;
   private boolean[] T00162_n653TBW03_APPROVAL_USER_ID ;
   private String[] T00162_A658TBW03_INPUT_END_USER_ID ;
   private boolean[] T00162_n658TBW03_INPUT_END_USER_ID ;
   private String[] T00162_A757TBW03_CRT_USER_ID ;
   private boolean[] T00162_n757TBW03_CRT_USER_ID ;
   private String[] T00162_A761TBW03_UPD_USER_ID ;
   private boolean[] T00162_n761TBW03_UPD_USER_ID ;
   private String[] T001627_A631TBW03_CRF_NM ;
   private boolean[] T001627_n631TBW03_CRF_NM ;
   private String[] T001627_A632TBW03_CRF_SNM ;
   private boolean[] T001627_n632TBW03_CRF_SNM ;
   private int[] T001627_A633TBW03_CRF_ORDER ;
   private boolean[] T001627_n633TBW03_CRF_ORDER ;
   private String[] T001628_A635TBW03_SITE_NM ;
   private boolean[] T001628_n635TBW03_SITE_NM ;
   private String[] T001628_A636TBW03_SITE_RYAK_NM ;
   private boolean[] T001628_n636TBW03_SITE_RYAK_NM ;
   private String[] T001629_A643TBW03_LOCK_USER_NM ;
   private boolean[] T001629_n643TBW03_LOCK_USER_NM ;
   private String[] T001630_A647TBW03_UPLOAD_USER_NM ;
   private boolean[] T001630_n647TBW03_UPLOAD_USER_NM ;
   private String[] T001631_A654TBW03_APPROVAL_USER_NM ;
   private boolean[] T001631_n654TBW03_APPROVAL_USER_NM ;
   private String[] T001632_A659TBW03_INPUT_END_USER_NM ;
   private boolean[] T001632_n659TBW03_INPUT_END_USER_NM ;
   private String[] T001633_A758TBW03_CRT_USER_NM ;
   private boolean[] T001633_n758TBW03_CRT_USER_NM ;
   private String[] T001634_A762TBW03_UPD_USER_NM ;
   private boolean[] T001634_n762TBW03_UPD_USER_NM ;
   private String[] T001635_A625TBW03_SESSION_ID ;
   private String[] T001635_A626TBW03_APP_ID ;
   private String[] T001635_A627TBW03_DISP_DATETIME ;
   private long[] T001635_A628TBW03_STUDY_ID ;
   private int[] T001635_A629TBW03_SUBJECT_ID ;
   private short[] T001635_A630TBW03_CRF_ID ;
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
         ,new ForEachCursor("T001612", "SELECT TM1.`TBW03_SESSION_ID`, TM1.`TBW03_APP_ID`, TM1.`TBW03_DISP_DATETIME`, TM1.`TBW03_SUBJECT_ID`, T2.`TBM31_CRF_NM` AS TBW03_CRF_NM, T2.`TBM31_CRF_SNM` AS TBW03_CRF_SNM, T2.`TBM31_ORDER` AS TBW03_CRF_ORDER, T3.`TAM08_SITE_NM` AS TBW03_SITE_NM, T3.`TAM08_SITE_SNM` AS TBW03_SITE_RYAK_NM, TM1.`TBW03_OUTER_SUBJECT_ID`, TM1.`TBW03_CRF_LATEST_VERSION`, TM1.`TBW03_CRF_INPUT_LEVEL`, TM1.`TBW03_LOCK_FLG`, TM1.`TBW03_LOCK_DATETIME`, T4.`TAM07_USER_NM` AS TBW03_LOCK_USER_NM, TM1.`TBW03_LOCK_AUTH_CD`, TM1.`TBW03_UPLOAD_DATETIME`, T5.`TAM07_USER_NM` AS TBW03_UPLOAD_USER_NM, TM1.`TBW03_UPLOAD_AUTH_CD`, TM1.`TBW03_DM_ARRIVAL_FLG`, TM1.`TBW03_DM_ARRIVAL_DATETIME`, TM1.`TBW03_APPROVAL_FLG`, TM1.`TBW03_APPROVAL_DATETIME`, T6.`TAM07_USER_NM` AS TBW03_APPROVAL_USER_NM, TM1.`TBW03_APPROVAL_AUTH_CD`, TM1.`TBW03_INPUT_END_FLG`, TM1.`TBW03_INPUT_END_DATETIME`, T7.`TAM07_USER_NM` AS TBW03_INPUT_END_USER_NM, TM1.`TBW03_INPUT_END_AUTH_CD`, TM1.`TBW03_DEL_FLG`, TM1.`TBW03_CRT_DATETIME`, T8.`TAM07_USER_NM` AS TBW03_CRT_USER_NM, TM1.`TBW03_CRT_PROG_NM`, TM1.`TBW03_UPD_DATETIME`, T9.`TAM07_USER_NM` AS TBW03_UPD_USER_NM, TM1.`TBW03_UPD_PROG_NM`, TM1.`TBW03_UPD_CNT`, TM1.`TBW03_STUDY_ID` AS TBW03_STUDY_ID, TM1.`TBW03_CRF_ID` AS TBW03_CRF_ID, TM1.`TBW03_SITE_ID` AS TBW03_SITE_ID, TM1.`TBW03_LOCK_USER_ID` AS TBW03_LOCK_USER_ID, TM1.`TBW03_UPLOAD_USER_ID` AS TBW03_UPLOAD_USER_ID, TM1.`TBW03_APPROVAL_USER_ID` AS TBW03_APPROVAL_USER_ID, TM1.`TBW03_INPUT_END_USER_ID` AS TBW03_INPUT_END_USER_ID, TM1.`TBW03_CRT_USER_ID` AS TBW03_CRT_USER_ID, TM1.`TBW03_UPD_USER_ID` AS TBW03_UPD_USER_ID FROM ((((((((`TBW03_CRF_SEARCH` TM1 INNER JOIN `TBM31_CRF` T2 ON T2.`TBM31_STUDY_ID` = TM1.`TBW03_STUDY_ID` AND T2.`TBM31_CRF_ID` = TM1.`TBW03_CRF_ID`) LEFT JOIN `TAM08_SITE` T3 ON T3.`TAM08_SITE_ID` = TM1.`TBW03_SITE_ID`) LEFT JOIN `TAM07_USER` T4 ON T4.`TAM07_USER_ID` = TM1.`TBW03_LOCK_USER_ID`) LEFT JOIN `TAM07_USER` T5 ON T5.`TAM07_USER_ID` = TM1.`TBW03_UPLOAD_USER_ID`) LEFT JOIN `TAM07_USER` T6 ON T6.`TAM07_USER_ID` = TM1.`TBW03_APPROVAL_USER_ID`) LEFT JOIN `TAM07_USER` T7 ON T7.`TAM07_USER_ID` = TM1.`TBW03_INPUT_END_USER_ID`) LEFT JOIN `TAM07_USER` T8 ON T8.`TAM07_USER_ID` = TM1.`TBW03_CRT_USER_ID`) LEFT JOIN `TAM07_USER` T9 ON T9.`TAM07_USER_ID` = TM1.`TBW03_UPD_USER_ID`) WHERE TM1.`TBW03_SESSION_ID` = ? and TM1.`TBW03_APP_ID` = ? and TM1.`TBW03_DISP_DATETIME` = ? and TM1.`TBW03_STUDY_ID` = ? and TM1.`TBW03_SUBJECT_ID` = ? and TM1.`TBW03_CRF_ID` = ? ORDER BY TM1.`TBW03_SESSION_ID`, TM1.`TBW03_APP_ID`, TM1.`TBW03_DISP_DATETIME`, TM1.`TBW03_STUDY_ID`, TM1.`TBW03_SUBJECT_ID`, TM1.`TBW03_CRF_ID` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("T001613", "SELECT `TBM31_CRF_NM` AS TBW03_CRF_NM, `TBM31_CRF_SNM` AS TBW03_CRF_SNM, `TBM31_ORDER` AS TBW03_CRF_ORDER FROM `TBM31_CRF` WHERE `TBM31_STUDY_ID` = ? AND `TBM31_CRF_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001614", "SELECT `TAM08_SITE_NM` AS TBW03_SITE_NM, `TAM08_SITE_SNM` AS TBW03_SITE_RYAK_NM FROM `TAM08_SITE` WHERE `TAM08_SITE_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001615", "SELECT `TAM07_USER_NM` AS TBW03_LOCK_USER_NM FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001616", "SELECT `TAM07_USER_NM` AS TBW03_UPLOAD_USER_NM FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001617", "SELECT `TAM07_USER_NM` AS TBW03_APPROVAL_USER_NM FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001618", "SELECT `TAM07_USER_NM` AS TBW03_INPUT_END_USER_NM FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001619", "SELECT `TAM07_USER_NM` AS TBW03_CRT_USER_NM FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001620", "SELECT `TAM07_USER_NM` AS TBW03_UPD_USER_NM FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001621", "SELECT `TBW03_SESSION_ID`, `TBW03_APP_ID`, `TBW03_DISP_DATETIME`, `TBW03_STUDY_ID` AS TBW03_STUDY_ID, `TBW03_SUBJECT_ID`, `TBW03_CRF_ID` AS TBW03_CRF_ID FROM `TBW03_CRF_SEARCH` WHERE `TBW03_SESSION_ID` = ? AND `TBW03_APP_ID` = ? AND `TBW03_DISP_DATETIME` = ? AND `TBW03_STUDY_ID` = ? AND `TBW03_SUBJECT_ID` = ? AND `TBW03_CRF_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001622", "SELECT `TBW03_SESSION_ID`, `TBW03_APP_ID`, `TBW03_DISP_DATETIME`, `TBW03_STUDY_ID` AS TBW03_STUDY_ID, `TBW03_SUBJECT_ID`, `TBW03_CRF_ID` AS TBW03_CRF_ID FROM `TBW03_CRF_SEARCH` WHERE ( `TBW03_SESSION_ID` > ? or `TBW03_SESSION_ID` = ? and `TBW03_APP_ID` > ? or `TBW03_APP_ID` = ? and `TBW03_SESSION_ID` = ? and `TBW03_DISP_DATETIME` > ? or `TBW03_DISP_DATETIME` = ? and `TBW03_APP_ID` = ? and `TBW03_SESSION_ID` = ? and `TBW03_STUDY_ID` > ? or `TBW03_STUDY_ID` = ? and `TBW03_DISP_DATETIME` = ? and `TBW03_APP_ID` = ? and `TBW03_SESSION_ID` = ? and `TBW03_SUBJECT_ID` > ? or `TBW03_SUBJECT_ID` = ? and `TBW03_STUDY_ID` = ? and `TBW03_DISP_DATETIME` = ? and `TBW03_APP_ID` = ? and `TBW03_SESSION_ID` = ? and `TBW03_CRF_ID` > ?) ORDER BY `TBW03_SESSION_ID`, `TBW03_APP_ID`, `TBW03_DISP_DATETIME`, `TBW03_STUDY_ID`, `TBW03_SUBJECT_ID`, `TBW03_CRF_ID`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T001623", "SELECT `TBW03_SESSION_ID`, `TBW03_APP_ID`, `TBW03_DISP_DATETIME`, `TBW03_STUDY_ID` AS TBW03_STUDY_ID, `TBW03_SUBJECT_ID`, `TBW03_CRF_ID` AS TBW03_CRF_ID FROM `TBW03_CRF_SEARCH` WHERE ( `TBW03_SESSION_ID` < ? or `TBW03_SESSION_ID` = ? and `TBW03_APP_ID` < ? or `TBW03_APP_ID` = ? and `TBW03_SESSION_ID` = ? and `TBW03_DISP_DATETIME` < ? or `TBW03_DISP_DATETIME` = ? and `TBW03_APP_ID` = ? and `TBW03_SESSION_ID` = ? and `TBW03_STUDY_ID` < ? or `TBW03_STUDY_ID` = ? and `TBW03_DISP_DATETIME` = ? and `TBW03_APP_ID` = ? and `TBW03_SESSION_ID` = ? and `TBW03_SUBJECT_ID` < ? or `TBW03_SUBJECT_ID` = ? and `TBW03_STUDY_ID` = ? and `TBW03_DISP_DATETIME` = ? and `TBW03_APP_ID` = ? and `TBW03_SESSION_ID` = ? and `TBW03_CRF_ID` < ?) ORDER BY `TBW03_SESSION_ID` DESC, `TBW03_APP_ID` DESC, `TBW03_DISP_DATETIME` DESC, `TBW03_STUDY_ID` DESC, `TBW03_SUBJECT_ID` DESC, `TBW03_CRF_ID` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T001624", "INSERT INTO `TBW03_CRF_SEARCH` (`TBW03_SESSION_ID`, `TBW03_APP_ID`, `TBW03_DISP_DATETIME`, `TBW03_SUBJECT_ID`, `TBW03_OUTER_SUBJECT_ID`, `TBW03_CRF_LATEST_VERSION`, `TBW03_CRF_INPUT_LEVEL`, `TBW03_LOCK_FLG`, `TBW03_LOCK_DATETIME`, `TBW03_LOCK_AUTH_CD`, `TBW03_UPLOAD_DATETIME`, `TBW03_UPLOAD_AUTH_CD`, `TBW03_DM_ARRIVAL_FLG`, `TBW03_DM_ARRIVAL_DATETIME`, `TBW03_APPROVAL_FLG`, `TBW03_APPROVAL_DATETIME`, `TBW03_APPROVAL_AUTH_CD`, `TBW03_INPUT_END_FLG`, `TBW03_INPUT_END_DATETIME`, `TBW03_INPUT_END_AUTH_CD`, `TBW03_DEL_FLG`, `TBW03_CRT_DATETIME`, `TBW03_CRT_PROG_NM`, `TBW03_UPD_DATETIME`, `TBW03_UPD_PROG_NM`, `TBW03_UPD_CNT`, `TBW03_STUDY_ID`, `TBW03_CRF_ID`, `TBW03_SITE_ID`, `TBW03_LOCK_USER_ID`, `TBW03_UPLOAD_USER_ID`, `TBW03_APPROVAL_USER_ID`, `TBW03_INPUT_END_USER_ID`, `TBW03_CRT_USER_ID`, `TBW03_UPD_USER_ID`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T001625", "UPDATE `TBW03_CRF_SEARCH` SET `TBW03_OUTER_SUBJECT_ID`=?, `TBW03_CRF_LATEST_VERSION`=?, `TBW03_CRF_INPUT_LEVEL`=?, `TBW03_LOCK_FLG`=?, `TBW03_LOCK_DATETIME`=?, `TBW03_LOCK_AUTH_CD`=?, `TBW03_UPLOAD_DATETIME`=?, `TBW03_UPLOAD_AUTH_CD`=?, `TBW03_DM_ARRIVAL_FLG`=?, `TBW03_DM_ARRIVAL_DATETIME`=?, `TBW03_APPROVAL_FLG`=?, `TBW03_APPROVAL_DATETIME`=?, `TBW03_APPROVAL_AUTH_CD`=?, `TBW03_INPUT_END_FLG`=?, `TBW03_INPUT_END_DATETIME`=?, `TBW03_INPUT_END_AUTH_CD`=?, `TBW03_DEL_FLG`=?, `TBW03_CRT_DATETIME`=?, `TBW03_CRT_PROG_NM`=?, `TBW03_UPD_DATETIME`=?, `TBW03_UPD_PROG_NM`=?, `TBW03_UPD_CNT`=?, `TBW03_SITE_ID`=?, `TBW03_LOCK_USER_ID`=?, `TBW03_UPLOAD_USER_ID`=?, `TBW03_APPROVAL_USER_ID`=?, `TBW03_INPUT_END_USER_ID`=?, `TBW03_CRT_USER_ID`=?, `TBW03_UPD_USER_ID`=?  WHERE `TBW03_SESSION_ID` = ? AND `TBW03_APP_ID` = ? AND `TBW03_DISP_DATETIME` = ? AND `TBW03_STUDY_ID` = ? AND `TBW03_SUBJECT_ID` = ? AND `TBW03_CRF_ID` = ?", GX_NOMASK)
         ,new UpdateCursor("T001626", "DELETE FROM `TBW03_CRF_SEARCH`  WHERE `TBW03_SESSION_ID` = ? AND `TBW03_APP_ID` = ? AND `TBW03_DISP_DATETIME` = ? AND `TBW03_STUDY_ID` = ? AND `TBW03_SUBJECT_ID` = ? AND `TBW03_CRF_ID` = ?", GX_NOMASK)
         ,new ForEachCursor("T001627", "SELECT `TBM31_CRF_NM` AS TBW03_CRF_NM, `TBM31_CRF_SNM` AS TBW03_CRF_SNM, `TBM31_ORDER` AS TBW03_CRF_ORDER FROM `TBM31_CRF` WHERE `TBM31_STUDY_ID` = ? AND `TBM31_CRF_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001628", "SELECT `TAM08_SITE_NM` AS TBW03_SITE_NM, `TAM08_SITE_SNM` AS TBW03_SITE_RYAK_NM FROM `TAM08_SITE` WHERE `TAM08_SITE_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001629", "SELECT `TAM07_USER_NM` AS TBW03_LOCK_USER_NM FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001630", "SELECT `TAM07_USER_NM` AS TBW03_UPLOAD_USER_NM FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001631", "SELECT `TAM07_USER_NM` AS TBW03_APPROVAL_USER_NM FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001632", "SELECT `TAM07_USER_NM` AS TBW03_INPUT_END_USER_NM FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001633", "SELECT `TAM07_USER_NM` AS TBW03_CRT_USER_NM FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001634", "SELECT `TAM07_USER_NM` AS TBW03_UPD_USER_NM FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001635", "SELECT `TBW03_SESSION_ID`, `TBW03_APP_ID`, `TBW03_DISP_DATETIME`, `TBW03_STUDY_ID` AS TBW03_STUDY_ID, `TBW03_SUBJECT_ID`, `TBW03_CRF_ID` AS TBW03_CRF_ID FROM `TBW03_CRF_SEARCH` ORDER BY `TBW03_SESSION_ID`, `TBW03_APP_ID`, `TBW03_DISP_DATETIME`, `TBW03_STUDY_ID`, `TBW03_SUBJECT_ID`, `TBW03_CRF_ID` ",true, GX_NOMASK, false, this,10,0,false )
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
               break;
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
               break;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               break;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               break;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               break;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               break;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               break;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               break;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               break;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               break;
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
               break;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               break;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               break;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               break;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               break;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               break;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               break;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               break;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               break;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               break;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               break;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               break;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               break;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               break;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               break;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               break;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               break;
            case 30 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               break;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               break;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               break;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
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
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               break;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               break;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               break;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 20, false);
               }
               break;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 128, false);
               }
               break;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 128, false);
               }
               break;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 128, false);
               }
               break;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 128, false);
               }
               break;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 128, false);
               }
               break;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 128, false);
               }
               break;
            case 10 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               break;
            case 11 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               break;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 20, false);
               }
               break;
            case 13 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 128, false);
               }
               break;
            case 14 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 128, false);
               }
               break;
            case 15 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 128, false);
               }
               break;
            case 16 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 128, false);
               }
               break;
            case 17 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 128, false);
               }
               break;
            case 18 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 128, false);
               }
               break;
            case 19 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               break;
            case 20 :
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
               break;
            case 21 :
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
               break;
            case 22 :
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
               break;
            case 23 :
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
               break;
            case 24 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               break;
            case 25 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               break;
            case 26 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 20, false);
               }
               break;
            case 27 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 128, false);
               }
               break;
            case 28 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 128, false);
               }
               break;
            case 29 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 128, false);
               }
               break;
            case 30 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 128, false);
               }
               break;
            case 31 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 128, false);
               }
               break;
            case 32 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 128, false);
               }
               break;
      }
   }

}

