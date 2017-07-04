/*
               File: tam06_msg_impl
        Description: メッセージマスタ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:53:40.62
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tam06_msg_impl extends GXWebPanel
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action24") == 0 )
      {
         AV14Pgmname = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A21TAM06_MSG_CD = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A21TAM06_MSG_CD", A21TAM06_MSG_CD);
         A20TAM06_MSG = httpContext.GetNextPar( ) ;
         n20TAM06_MSG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A20TAM06_MSG", A20TAM06_MSG);
         A110TAM06_DEL_FLG = httpContext.GetNextPar( ) ;
         n110TAM06_DEL_FLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A110TAM06_DEL_FLG", A110TAM06_DEL_FLG);
         A43TAM06_CRT_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
         n43TAM06_CRT_DATETIME = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A43TAM06_CRT_DATETIME", localUtil.ttoc( A43TAM06_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         A125TAM06_CRT_USER_ID = httpContext.GetNextPar( ) ;
         n125TAM06_CRT_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A125TAM06_CRT_USER_ID", A125TAM06_CRT_USER_ID);
         A44TAM06_CRT_PROG_NM = httpContext.GetNextPar( ) ;
         n44TAM06_CRT_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44TAM06_CRT_PROG_NM", A44TAM06_CRT_PROG_NM);
         A45TAM06_UPD_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
         n45TAM06_UPD_DATETIME = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A45TAM06_UPD_DATETIME", localUtil.ttoc( A45TAM06_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         A80TAM06_UPD_USER_ID = httpContext.GetNextPar( ) ;
         n80TAM06_UPD_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A80TAM06_UPD_USER_ID", A80TAM06_UPD_USER_ID);
         A46TAM06_UPD_PROG_NM = httpContext.GetNextPar( ) ;
         n46TAM06_UPD_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A46TAM06_UPD_PROG_NM", A46TAM06_UPD_PROG_NM);
         A111TAM06_UPD_CNT = GXutil.lval( httpContext.GetNextPar( )) ;
         n111TAM06_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A111TAM06_UPD_CNT", GXutil.ltrim( GXutil.str( A111TAM06_UPD_CNT, 10, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_24_044( AV14Pgmname, Gx_mode, A21TAM06_MSG_CD, A20TAM06_MSG, A110TAM06_DEL_FLG, A43TAM06_CRT_DATETIME, A125TAM06_CRT_USER_ID, A44TAM06_CRT_PROG_NM, A45TAM06_UPD_DATETIME, A80TAM06_UPD_USER_ID, A46TAM06_UPD_PROG_NM, A111TAM06_UPD_CNT) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action25") == 0 )
      {
         AV14Pgmname = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A21TAM06_MSG_CD = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A21TAM06_MSG_CD", A21TAM06_MSG_CD);
         A20TAM06_MSG = httpContext.GetNextPar( ) ;
         n20TAM06_MSG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A20TAM06_MSG", A20TAM06_MSG);
         A110TAM06_DEL_FLG = httpContext.GetNextPar( ) ;
         n110TAM06_DEL_FLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A110TAM06_DEL_FLG", A110TAM06_DEL_FLG);
         A43TAM06_CRT_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
         n43TAM06_CRT_DATETIME = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A43TAM06_CRT_DATETIME", localUtil.ttoc( A43TAM06_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         A125TAM06_CRT_USER_ID = httpContext.GetNextPar( ) ;
         n125TAM06_CRT_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A125TAM06_CRT_USER_ID", A125TAM06_CRT_USER_ID);
         A44TAM06_CRT_PROG_NM = httpContext.GetNextPar( ) ;
         n44TAM06_CRT_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44TAM06_CRT_PROG_NM", A44TAM06_CRT_PROG_NM);
         A45TAM06_UPD_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
         n45TAM06_UPD_DATETIME = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A45TAM06_UPD_DATETIME", localUtil.ttoc( A45TAM06_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         A80TAM06_UPD_USER_ID = httpContext.GetNextPar( ) ;
         n80TAM06_UPD_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A80TAM06_UPD_USER_ID", A80TAM06_UPD_USER_ID);
         A46TAM06_UPD_PROG_NM = httpContext.GetNextPar( ) ;
         n46TAM06_UPD_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A46TAM06_UPD_PROG_NM", A46TAM06_UPD_PROG_NM);
         A111TAM06_UPD_CNT = GXutil.lval( httpContext.GetNextPar( )) ;
         n111TAM06_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A111TAM06_UPD_CNT", GXutil.ltrim( GXutil.str( A111TAM06_UPD_CNT, 10, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_25_044( AV14Pgmname, Gx_mode, A21TAM06_MSG_CD, A20TAM06_MSG, A110TAM06_DEL_FLG, A43TAM06_CRT_DATETIME, A125TAM06_CRT_USER_ID, A44TAM06_CRT_PROG_NM, A45TAM06_UPD_DATETIME, A80TAM06_UPD_USER_ID, A46TAM06_UPD_PROG_NM, A111TAM06_UPD_CNT) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action26") == 0 )
      {
         AV14Pgmname = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A21TAM06_MSG_CD = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A21TAM06_MSG_CD", A21TAM06_MSG_CD);
         A20TAM06_MSG = httpContext.GetNextPar( ) ;
         n20TAM06_MSG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A20TAM06_MSG", A20TAM06_MSG);
         A110TAM06_DEL_FLG = httpContext.GetNextPar( ) ;
         n110TAM06_DEL_FLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A110TAM06_DEL_FLG", A110TAM06_DEL_FLG);
         A43TAM06_CRT_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
         n43TAM06_CRT_DATETIME = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A43TAM06_CRT_DATETIME", localUtil.ttoc( A43TAM06_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         A125TAM06_CRT_USER_ID = httpContext.GetNextPar( ) ;
         n125TAM06_CRT_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A125TAM06_CRT_USER_ID", A125TAM06_CRT_USER_ID);
         A44TAM06_CRT_PROG_NM = httpContext.GetNextPar( ) ;
         n44TAM06_CRT_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44TAM06_CRT_PROG_NM", A44TAM06_CRT_PROG_NM);
         A45TAM06_UPD_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
         n45TAM06_UPD_DATETIME = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A45TAM06_UPD_DATETIME", localUtil.ttoc( A45TAM06_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         A80TAM06_UPD_USER_ID = httpContext.GetNextPar( ) ;
         n80TAM06_UPD_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A80TAM06_UPD_USER_ID", A80TAM06_UPD_USER_ID);
         A46TAM06_UPD_PROG_NM = httpContext.GetNextPar( ) ;
         n46TAM06_UPD_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A46TAM06_UPD_PROG_NM", A46TAM06_UPD_PROG_NM);
         A111TAM06_UPD_CNT = GXutil.lval( httpContext.GetNextPar( )) ;
         n111TAM06_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A111TAM06_UPD_CNT", GXutil.ltrim( GXutil.str( A111TAM06_UPD_CNT, 10, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_26_044( AV14Pgmname, Gx_mode, A21TAM06_MSG_CD, A20TAM06_MSG, A110TAM06_DEL_FLG, A43TAM06_CRT_DATETIME, A125TAM06_CRT_USER_ID, A44TAM06_CRT_PROG_NM, A45TAM06_UPD_DATETIME, A80TAM06_UPD_USER_ID, A46TAM06_UPD_PROG_NM, A111TAM06_UPD_CNT) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel7"+"_"+"TAM06_CRT_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx7asatam06_crt_user_id044( Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel9"+"_"+"TAM06_UPD_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx9asatam06_upd_user_id044( Gx_mode) ;
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
      radTAM06_DEL_FLG.setName( "TAM06_DEL_FLG" );
      radTAM06_DEL_FLG.setWebtags( "" );
      radTAM06_DEL_FLG.addItem("0", "利用可能", (short)(0));
      radTAM06_DEL_FLG.addItem("1", "利用不可", (short)(0));
      Form.getMeta().addItem("Generator", "GeneXus Java", (short)(0)) ;
      Form.getMeta().addItem("Version", "10_1_8-58720", (short)(0)) ;
      Form.getMeta().addItem("Description", "メッセージマスタ", (short)(0)) ;
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTAM06_MSG_CD_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setTheme("Style2");
   }

   public tam06_msg_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tam06_msg_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tam06_msg_impl.class ));
   }

   public tam06_msg_impl( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      radTAM06_DEL_FLG = new HTMLChoice();
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
         /* Event 'Enter' not assigned to any button. */
         /* Form start */
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
         wb_table1_2_044( true) ;
      }
      return  ;
   }

   public void wb_table1_2_044e( boolean wbgen )
   {
      if ( wbgen )
      {
         renderHtmlCloseForm044( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void wb_table1_2_044( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableBorder100x100", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_044( true) ;
      }
      return  ;
   }

   public void wb_table2_5_044e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Control Group */
         ClassString = "Group" ;
         StyleString = "" ;
         httpContext.writeText( "<fieldset id=\""+grpGroupdata_Internalname+"\""+" style=\"-moz-border-radius:3pt;\""+" class=\""+ClassString+"\">") ;
         httpContext.writeText( "<legend class=\""+ClassString+"Title"+"\">"+"メッセージマスタ"+"</legend>") ;
         wb_table3_27_044( true) ;
      }
      return  ;
   }

   public void wb_table3_27_044e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_044e( true) ;
      }
      else
      {
         wb_table1_2_044e( false) ;
      }
   }

   public void wb_table3_27_044( boolean wbgen )
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
         wb_table4_33_044( true) ;
      }
      return  ;
   }

   public void wb_table4_33_044e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table5_89_044( true) ;
      }
      return  ;
   }

   public void wb_table5_89_044e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_27_044e( true) ;
      }
      else
      {
         wb_table3_27_044e( false) ;
      }
   }

   public void wb_table5_89_044( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable4_Internalname, tblTable4_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockBtn060" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock44_Internalname, "実行", "", "", lblTextblock44_Jsonclick, "EENTER.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_TAM06_MSG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "&nbsp;") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockBtn060" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock45_Internalname, "クリア", "", "", lblTextblock45_Jsonclick, "E\\'BTN_CLER\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_TAM06_MSG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "&nbsp;") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockBtn060" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_cancel_Internalname, "終了", "", "", lblBtn_cancel_Jsonclick, "ECHECK.", StyleString, ClassString, 5, "", 1, lblBtn_cancel_Enabled, (short)(0), "HLP_TAM06_MSG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_89_044e( true) ;
      }
      else
      {
         wb_table5_89_044e( false) ;
      }
   }

   public void wb_table4_33_044( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable2_Internalname, tblTable2_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\"  style=\"width:130px\">") ;
         /* Static images/pictures */
         ClassString = "ImageRequiredMark" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage19_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", "Style2"), "", "", "", "Style2", imgImage19_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "HLP_TAM06_MSG.htm");
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam06_msg_cd_Internalname, "メッセージコード", "", "", lblTextblocktam06_msg_cd_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAM06_MSG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A21TAM06_MSG_CD", A21TAM06_MSG_CD);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
         ClassString = "AttributeImeOff" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM06_MSG_CD_Internalname, GXutil.rtrim( A21TAM06_MSG_CD), GXutil.rtrim( localUtil.format( A21TAM06_MSG_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(39);\"", "", "", "", "", edtTAM06_MSG_CD_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAM06_MSG_CD_Enabled, 1, 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TAM06_MSG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Static images/pictures */
         ClassString = "ImageRequiredMark" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage20_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", "Style2"), "", "", "", "Style2", imgImage20_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "HLP_TAM06_MSG.htm");
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam06_msg_Internalname, "メッセージ", "", "", lblTextblocktam06_msg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAM06_MSG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Multiple line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A20TAM06_MSG", A20TAM06_MSG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
         ClassString = "AttributeImeOn" ;
         StyleString = "" ;
         ClassString = "AttributeImeOn" ;
         StyleString = "" ;
         GxWebStd.gx_html_textarea( httpContext, edtTAM06_MSG_Internalname, GXutil.rtrim( A20TAM06_MSG), "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(45);\"", (short)(0), 1, edtTAM06_MSG_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "1000", -1, "", true, "HLP_TAM06_MSG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam06_del_flg_Internalname, "削除フラグ", "", "", lblTextblocktam06_del_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAM06_MSG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Radio button */
         httpContext.ajax_rsp_assign_attri("", false, "A110TAM06_DEL_FLG", A110TAM06_DEL_FLG);
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
         GxWebStd.gx_radio_ctrl( httpContext, radTAM06_DEL_FLG, radTAM06_DEL_FLG.getInternalname(), A110TAM06_DEL_FLG, "", 1, radTAM06_DEL_FLG.getEnabled(), 0, 0, StyleString, ClassString, 0, radTAM06_DEL_FLG.getJsonclick(), "", TempTags+" onclick=\"gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(50);\"", "HLP_TAM06_MSG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "&nbsp;") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam06_crt_datetime_Internalname, "作成日時", "", "", lblTextblocktam06_crt_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAM06_MSG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A43TAM06_CRT_DATETIME", localUtil.ttoc( A43TAM06_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTAM06_CRT_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM06_CRT_DATETIME_Internalname, localUtil.format(A43TAM06_CRT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A43TAM06_CRT_DATETIME, "9999/99/99 99:99:99"), "", "", "", "", "", edtTAM06_CRT_DATETIME_Jsonclick, 0, ClassString, StyleString, "", edtTAM06_CRT_DATETIME_Visible, edtTAM06_CRT_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(1), true, "right", "HLP_TAM06_MSG.htm");
         GxWebStd.gx_bitmap( httpContext, edtTAM06_CRT_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((edtTAM06_CRT_DATETIME_Visible==0)||(edtTAM06_CRT_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TAM06_MSG.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam06_crt_user_id_Internalname, "作成ユーザーID", "", "", lblTextblocktam06_crt_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAM06_MSG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A125TAM06_CRT_USER_ID", A125TAM06_CRT_USER_ID);
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM06_CRT_USER_ID_Internalname, GXutil.rtrim( A125TAM06_CRT_USER_ID), GXutil.rtrim( localUtil.format( A125TAM06_CRT_USER_ID, "")), "", "", "", "", "", edtTAM06_CRT_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAM06_CRT_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(1), true, "left", "HLP_TAM06_MSG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam06_crt_prog_nm_Internalname, "作成プログラム名", "", "", lblTextblocktam06_crt_prog_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAM06_MSG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A44TAM06_CRT_PROG_NM", A44TAM06_CRT_PROG_NM);
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM06_CRT_PROG_NM_Internalname, GXutil.rtrim( A44TAM06_CRT_PROG_NM), GXutil.rtrim( localUtil.format( A44TAM06_CRT_PROG_NM, "")), "", "", "", "", "", edtTAM06_CRT_PROG_NM_Jsonclick, 0, ClassString, StyleString, "", edtTAM06_CRT_PROG_NM_Visible, edtTAM06_CRT_PROG_NM_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(1), true, "left", "HLP_TAM06_MSG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam06_upd_datetime_Internalname, "更新日時", "", "", lblTextblocktam06_upd_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAM06_MSG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A45TAM06_UPD_DATETIME", localUtil.ttoc( A45TAM06_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTAM06_UPD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM06_UPD_DATETIME_Internalname, localUtil.format(A45TAM06_UPD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A45TAM06_UPD_DATETIME, "9999/99/99 99:99:99"), "", "", "", "", "", edtTAM06_UPD_DATETIME_Jsonclick, 0, ClassString, StyleString, "", edtTAM06_UPD_DATETIME_Visible, edtTAM06_UPD_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(1), true, "right", "HLP_TAM06_MSG.htm");
         GxWebStd.gx_bitmap( httpContext, edtTAM06_UPD_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((edtTAM06_UPD_DATETIME_Visible==0)||(edtTAM06_UPD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TAM06_MSG.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam06_upd_user_id_Internalname, "更新ユーザーID", "", "", lblTextblocktam06_upd_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAM06_MSG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A80TAM06_UPD_USER_ID", A80TAM06_UPD_USER_ID);
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM06_UPD_USER_ID_Internalname, GXutil.rtrim( A80TAM06_UPD_USER_ID), GXutil.rtrim( localUtil.format( A80TAM06_UPD_USER_ID, "")), "", "", "", "", "", edtTAM06_UPD_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAM06_UPD_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(1), true, "left", "HLP_TAM06_MSG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam06_upd_prog_nm_Internalname, "更新プログラム名", "", "", lblTextblocktam06_upd_prog_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAM06_MSG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A46TAM06_UPD_PROG_NM", A46TAM06_UPD_PROG_NM);
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM06_UPD_PROG_NM_Internalname, GXutil.rtrim( A46TAM06_UPD_PROG_NM), GXutil.rtrim( localUtil.format( A46TAM06_UPD_PROG_NM, "")), "", "", "", "", "", edtTAM06_UPD_PROG_NM_Jsonclick, 0, ClassString, StyleString, "", edtTAM06_UPD_PROG_NM_Visible, edtTAM06_UPD_PROG_NM_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(1), true, "left", "HLP_TAM06_MSG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         httpContext.writeText( "&nbsp;") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_33_044e( true) ;
      }
      else
      {
         wb_table4_33_044e( false) ;
      }
   }

   public void wb_table2_5_044( boolean wbgen )
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
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", "Style2"), "", "", "", "Style2", imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM06_MSG.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_separator_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM06_MSG.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", "Style2"), "", "", "", "Style2", imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM06_MSG.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM06_MSG.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", "Style2"), "", "", "", "Style2", imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM06_MSG.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_separator_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM06_MSG.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", "Style2"), "", "", "", "Style2", imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM06_MSG.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_separator_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM06_MSG.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", "Style2"), "", "", "", "Style2", imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "", 0, "", 0, 0, 4, imgBtn_select_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "gx.popup.openPrompt('"+"gx0040"+"',["+"{Ctrl:gx.dom.el('"+"TAM06_MSG_CD"+"'), id:'"+"TAM06_MSG_CD"+"'"+",isOut:true,isKey:true,isLastKey:true}"+"],"+"null"+","+"'', false"+","+"true"+");"+"return false;", "HLP_TAM06_MSG.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 4, imgBtn_select_separator_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "gx.popup.openPrompt('"+"gx0040"+"',["+"{Ctrl:gx.dom.el('"+"TAM06_MSG_CD"+"'), id:'"+"TAM06_MSG_CD"+"'"+",isOut:true,isKey:true,isLastKey:true}"+"],"+"null"+","+"'', false"+","+"true"+");"+"return false;", "HLP_TAM06_MSG.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM06_MSG.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM06_MSG.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM06_MSG.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM06_MSG.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM06_MSG.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM06_MSG.htm");
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
         wb_table2_5_044e( true) ;
      }
      else
      {
         wb_table2_5_044e( false) ;
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
      /* Execute user event: e11042 */
      e11042 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            A21TAM06_MSG_CD = httpContext.cgiGet( edtTAM06_MSG_CD_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A21TAM06_MSG_CD", A21TAM06_MSG_CD);
            A20TAM06_MSG = httpContext.cgiGet( edtTAM06_MSG_Internalname) ;
            n20TAM06_MSG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A20TAM06_MSG", A20TAM06_MSG);
            n20TAM06_MSG = ((GXutil.strcmp("", A20TAM06_MSG)==0) ? true : false) ;
            A110TAM06_DEL_FLG = httpContext.cgiGet( radTAM06_DEL_FLG.getInternalname()) ;
            n110TAM06_DEL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A110TAM06_DEL_FLG", A110TAM06_DEL_FLG);
            n110TAM06_DEL_FLG = ((GXutil.strcmp("", A110TAM06_DEL_FLG)==0) ? true : false) ;
            A43TAM06_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTAM06_CRT_DATETIME_Internalname)) ;
            n43TAM06_CRT_DATETIME = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A43TAM06_CRT_DATETIME", localUtil.ttoc( A43TAM06_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            A125TAM06_CRT_USER_ID = httpContext.cgiGet( edtTAM06_CRT_USER_ID_Internalname) ;
            n125TAM06_CRT_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A125TAM06_CRT_USER_ID", A125TAM06_CRT_USER_ID);
            A44TAM06_CRT_PROG_NM = httpContext.cgiGet( edtTAM06_CRT_PROG_NM_Internalname) ;
            n44TAM06_CRT_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A44TAM06_CRT_PROG_NM", A44TAM06_CRT_PROG_NM);
            A45TAM06_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTAM06_UPD_DATETIME_Internalname)) ;
            n45TAM06_UPD_DATETIME = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A45TAM06_UPD_DATETIME", localUtil.ttoc( A45TAM06_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            A80TAM06_UPD_USER_ID = httpContext.cgiGet( edtTAM06_UPD_USER_ID_Internalname) ;
            n80TAM06_UPD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A80TAM06_UPD_USER_ID", A80TAM06_UPD_USER_ID);
            A46TAM06_UPD_PROG_NM = httpContext.cgiGet( edtTAM06_UPD_PROG_NM_Internalname) ;
            n46TAM06_UPD_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A46TAM06_UPD_PROG_NM", A46TAM06_UPD_PROG_NM);
            /* Read saved values. */
            Z21TAM06_MSG_CD = httpContext.cgiGet( "Z21TAM06_MSG_CD") ;
            Z43TAM06_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z43TAM06_CRT_DATETIME"), 0) ;
            n43TAM06_CRT_DATETIME = (GXutil.nullDate().equals(A43TAM06_CRT_DATETIME) ? true : false) ;
            Z125TAM06_CRT_USER_ID = httpContext.cgiGet( "Z125TAM06_CRT_USER_ID") ;
            n125TAM06_CRT_USER_ID = ((GXutil.strcmp("", A125TAM06_CRT_USER_ID)==0) ? true : false) ;
            Z45TAM06_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z45TAM06_UPD_DATETIME"), 0) ;
            n45TAM06_UPD_DATETIME = (GXutil.nullDate().equals(A45TAM06_UPD_DATETIME) ? true : false) ;
            Z80TAM06_UPD_USER_ID = httpContext.cgiGet( "Z80TAM06_UPD_USER_ID") ;
            n80TAM06_UPD_USER_ID = ((GXutil.strcmp("", A80TAM06_UPD_USER_ID)==0) ? true : false) ;
            Z111TAM06_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z111TAM06_UPD_CNT"), ".", ",") ;
            n111TAM06_UPD_CNT = ((0==A111TAM06_UPD_CNT) ? true : false) ;
            Z20TAM06_MSG = httpContext.cgiGet( "Z20TAM06_MSG") ;
            n20TAM06_MSG = ((GXutil.strcmp("", A20TAM06_MSG)==0) ? true : false) ;
            Z110TAM06_DEL_FLG = httpContext.cgiGet( "Z110TAM06_DEL_FLG") ;
            n110TAM06_DEL_FLG = ((GXutil.strcmp("", A110TAM06_DEL_FLG)==0) ? true : false) ;
            Z44TAM06_CRT_PROG_NM = httpContext.cgiGet( "Z44TAM06_CRT_PROG_NM") ;
            n44TAM06_CRT_PROG_NM = ((GXutil.strcmp("", A44TAM06_CRT_PROG_NM)==0) ? true : false) ;
            Z46TAM06_UPD_PROG_NM = httpContext.cgiGet( "Z46TAM06_UPD_PROG_NM") ;
            n46TAM06_UPD_PROG_NM = ((GXutil.strcmp("", A46TAM06_UPD_PROG_NM)==0) ? true : false) ;
            A111TAM06_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z111TAM06_UPD_CNT"), ".", ",") ;
            n111TAM06_UPD_CNT = false ;
            n111TAM06_UPD_CNT = ((0==A111TAM06_UPD_CNT) ? true : false) ;
            O111TAM06_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "O111TAM06_UPD_CNT"), ".", ",") ;
            n111TAM06_UPD_CNT = ((0==A111TAM06_UPD_CNT) ? true : false) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ".", ",")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ".", ",")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            A111TAM06_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "TAM06_UPD_CNT"), ".", ",") ;
            n111TAM06_UPD_CNT = ((0==A111TAM06_UPD_CNT) ? true : false) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), ".", ",")) ;
            AV14Pgmname = httpContext.cgiGet( "vPGMNAME") ;
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
               A21TAM06_MSG_CD = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A21TAM06_MSG_CD", A21TAM06_MSG_CD);
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
                     /* Execute user event: e11042 */
                     e11042 ();
                  }
                  else if ( GXutil.strcmp(sEvt, "'BTN_CLER'") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     dynload_actions( ) ;
                     /* Execute user event: e12042 */
                     e12042 ();
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
                  else if ( GXutil.strcmp(sEvt, "CHECK") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     btn_check( ) ;
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
            initAll044( ) ;
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
      if ( GXutil.strcmp(Gx_mode, "DSP") == 0 )
      {
         imgBtn_enter2_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, imgBtn_enter2_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgBtn_enter2_Visible, 5, 0)));
         imgBtn_enter2_separator_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, imgBtn_enter2_separator_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgBtn_enter2_separator_Visible, 5, 0)));
      }
      disableAttributes044( ) ;
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

   public void confirm_040( )
   {
      beforeValidate044( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls044( ) ;
         }
         else
         {
            checkExtendedTable044( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors044( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
      if ( AnyError == 0 )
      {
         confirmValues040( ) ;
      }
   }

   public void resetCaption040( )
   {
   }

   public void e11042( )
   {
      /* Start Routine */
      AV7C_TAM02_APP_ID = "TAM06" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7C_TAM02_APP_ID", AV7C_TAM02_APP_ID);
      /* Execute user subroutine: S112 */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      imgBtn_cancel2_Jsonclick = "(window.open('', '_self').opener = window).close();" ;
      httpContext.ajax_rsp_assign_prop("", false, imgBtn_cancel2_Internalname, "Jsonclick", imgBtn_cancel2_Jsonclick);
      lblBtn_cancel_Jsonclick = "(window.open('', '_self').opener = window).close()" ;
      httpContext.ajax_rsp_assign_prop("", false, lblBtn_cancel_Internalname, "Jsonclick", lblBtn_cancel_Jsonclick);
      new a804_pc01_syslog(remoteHandle, context).execute( AV14Pgmname, "INFO", "画面起動") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
      if ( GXutil.strcmp(AV9W_ERRCD, "0") == 0 )
      {
         /* Execute user subroutine: S122 */
         S122 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            returnInSub = true;
            if (true) return;
         }
      }
      GXt_char2 = AV12W_MSG ;
      GXv_char3[0] = GXt_char2 ;
      new a805_pc01_msg_get(remoteHandle, context).execute( "AG00005", "", "", "", "", "", GXv_char3) ;
      tam06_msg_impl.this.GXt_char2 = GXv_char3[0] ;
      AV12W_MSG = GXt_char2 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12W_MSG", AV12W_MSG);
      imgBtn_delete2_Jsonclick = "confirm('"+AV12W_MSG+"')" ;
      httpContext.ajax_rsp_assign_prop("", false, imgBtn_delete2_Internalname, "Jsonclick", imgBtn_delete2_Jsonclick);
   }

   public void e12042( )
   {
      /* 'BTN_CLER' Routine */
      httpContext.wjLoc = formatLink("tam06_msg")  ;
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT4[0] = AV8W_A_LOGIN_SDT;
      GXv_char3[0] = AV9W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT4, GXv_char3) ;
      AV8W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT4[0] ;
      tam06_msg_impl.this.AV9W_ERRCD = GXv_char3[0] ;
      if ( GXutil.strcmp(AV9W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("1")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
      Form.getJscriptsrc().add("js/acom.js");
   }

   public void S122( )
   {
      /* 'SUB_AP_CHECK' Routine */
      GXv_char3[0] = AV10W_KNGN_FLG ;
      GXv_char5[0] = AV9W_ERRCD ;
      new a402_pc01_kengen_check(remoteHandle, context).execute( AV7C_TAM02_APP_ID, GXv_char3, GXv_char5) ;
      tam06_msg_impl.this.AV10W_KNGN_FLG = GXv_char3[0] ;
      tam06_msg_impl.this.AV9W_ERRCD = GXv_char5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7C_TAM02_APP_ID", AV7C_TAM02_APP_ID);
      if ( GXutil.strcmp(AV9W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("2")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void S13109( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV14Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void zm044( int GX_JID )
   {
      if ( ( GX_JID == 27 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z43TAM06_CRT_DATETIME = T00043_A43TAM06_CRT_DATETIME[0] ;
            Z125TAM06_CRT_USER_ID = T00043_A125TAM06_CRT_USER_ID[0] ;
            Z45TAM06_UPD_DATETIME = T00043_A45TAM06_UPD_DATETIME[0] ;
            Z80TAM06_UPD_USER_ID = T00043_A80TAM06_UPD_USER_ID[0] ;
            Z111TAM06_UPD_CNT = T00043_A111TAM06_UPD_CNT[0] ;
            Z20TAM06_MSG = T00043_A20TAM06_MSG[0] ;
            Z110TAM06_DEL_FLG = T00043_A110TAM06_DEL_FLG[0] ;
            Z44TAM06_CRT_PROG_NM = T00043_A44TAM06_CRT_PROG_NM[0] ;
            Z46TAM06_UPD_PROG_NM = T00043_A46TAM06_UPD_PROG_NM[0] ;
         }
         else
         {
            Z43TAM06_CRT_DATETIME = A43TAM06_CRT_DATETIME ;
            Z125TAM06_CRT_USER_ID = A125TAM06_CRT_USER_ID ;
            Z45TAM06_UPD_DATETIME = A45TAM06_UPD_DATETIME ;
            Z80TAM06_UPD_USER_ID = A80TAM06_UPD_USER_ID ;
            Z111TAM06_UPD_CNT = A111TAM06_UPD_CNT ;
            Z20TAM06_MSG = A20TAM06_MSG ;
            Z110TAM06_DEL_FLG = A110TAM06_DEL_FLG ;
            Z44TAM06_CRT_PROG_NM = A44TAM06_CRT_PROG_NM ;
            Z46TAM06_UPD_PROG_NM = A46TAM06_UPD_PROG_NM ;
         }
      }
      if ( GX_JID == -27 )
      {
         Z21TAM06_MSG_CD = A21TAM06_MSG_CD ;
         Z43TAM06_CRT_DATETIME = A43TAM06_CRT_DATETIME ;
         Z125TAM06_CRT_USER_ID = A125TAM06_CRT_USER_ID ;
         Z45TAM06_UPD_DATETIME = A45TAM06_UPD_DATETIME ;
         Z80TAM06_UPD_USER_ID = A80TAM06_UPD_USER_ID ;
         Z111TAM06_UPD_CNT = A111TAM06_UPD_CNT ;
         Z20TAM06_MSG = A20TAM06_MSG ;
         Z110TAM06_DEL_FLG = A110TAM06_DEL_FLG ;
         Z44TAM06_CRT_PROG_NM = A44TAM06_CRT_PROG_NM ;
         Z46TAM06_UPD_PROG_NM = A46TAM06_UPD_PROG_NM ;
      }
   }

   public void standaloneNotModal( )
   {
      edtTAM06_CRT_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM06_CRT_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM06_CRT_DATETIME_Enabled, 5, 0)));
      edtTAM06_CRT_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM06_CRT_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM06_CRT_USER_ID_Enabled, 5, 0)));
      edtTAM06_CRT_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM06_CRT_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM06_CRT_PROG_NM_Enabled, 5, 0)));
      edtTAM06_UPD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM06_UPD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM06_UPD_DATETIME_Enabled, 5, 0)));
      edtTAM06_UPD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM06_UPD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM06_UPD_USER_ID_Enabled, 5, 0)));
      edtTAM06_UPD_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM06_UPD_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM06_UPD_PROG_NM_Enabled, 5, 0)));
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtTAM06_CRT_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM06_CRT_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM06_CRT_DATETIME_Enabled, 5, 0)));
      edtTAM06_CRT_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM06_CRT_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM06_CRT_USER_ID_Enabled, 5, 0)));
      edtTAM06_CRT_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM06_CRT_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM06_CRT_PROG_NM_Enabled, 5, 0)));
      edtTAM06_UPD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM06_UPD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM06_UPD_DATETIME_Enabled, 5, 0)));
      edtTAM06_UPD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM06_UPD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM06_UPD_USER_ID_Enabled, 5, 0)));
      edtTAM06_UPD_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM06_UPD_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM06_UPD_PROG_NM_Enabled, 5, 0)));
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 )  )
      {
         edtTAM06_MSG_CD_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTAM06_MSG_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM06_MSG_CD_Enabled, 5, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
      {
         edtTAM06_CRT_DATETIME_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTAM06_CRT_DATETIME_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTAM06_CRT_DATETIME_Visible, 5, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
      {
         edtTAM06_CRT_PROG_NM_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTAM06_CRT_PROG_NM_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTAM06_CRT_PROG_NM_Visible, 5, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
      {
         edtTAM06_UPD_DATETIME_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTAM06_UPD_DATETIME_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTAM06_UPD_DATETIME_Visible, 5, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
      {
         edtTAM06_UPD_PROG_NM_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTAM06_UPD_PROG_NM_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTAM06_UPD_PROG_NM_Visible, 5, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  && (GXutil.strcmp("", A110TAM06_DEL_FLG)==0) && ( Gx_BScreen == 0 ) )
      {
         A110TAM06_DEL_FLG = "0" ;
         n110TAM06_DEL_FLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A110TAM06_DEL_FLG", A110TAM06_DEL_FLG);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  && (GXutil.strcmp("", A44TAM06_CRT_PROG_NM)==0) && ( Gx_BScreen == 0 ) )
      {
         A44TAM06_CRT_PROG_NM = AV14Pgmname ;
         n44TAM06_CRT_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44TAM06_CRT_PROG_NM", A44TAM06_CRT_PROG_NM);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  && (GXutil.strcmp("", A46TAM06_UPD_PROG_NM)==0) && ( Gx_BScreen == 0 ) )
      {
         A46TAM06_UPD_PROG_NM = AV14Pgmname ;
         n46TAM06_UPD_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A46TAM06_UPD_PROG_NM", A46TAM06_UPD_PROG_NM);
      }
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
      if ( GXutil.strcmp(Gx_mode, "DSP") == 0 )
      {
         lblBtn_cancel_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, lblBtn_cancel_Internalname, "Enabled", GXutil.ltrim( GXutil.str( lblBtn_cancel_Enabled, 5, 0)));
      }
      else
      {
         lblBtn_cancel_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, lblBtn_cancel_Internalname, "Enabled", GXutil.ltrim( GXutil.str( lblBtn_cancel_Enabled, 5, 0)));
      }
   }

   public void load044( )
   {
      /* Using cursor T00044 */
      pr_default.execute(2, new Object[] {A21TAM06_MSG_CD});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound4 = (short)(1) ;
         A43TAM06_CRT_DATETIME = T00044_A43TAM06_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A43TAM06_CRT_DATETIME", localUtil.ttoc( A43TAM06_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n43TAM06_CRT_DATETIME = T00044_n43TAM06_CRT_DATETIME[0] ;
         A125TAM06_CRT_USER_ID = T00044_A125TAM06_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A125TAM06_CRT_USER_ID", A125TAM06_CRT_USER_ID);
         n125TAM06_CRT_USER_ID = T00044_n125TAM06_CRT_USER_ID[0] ;
         A45TAM06_UPD_DATETIME = T00044_A45TAM06_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A45TAM06_UPD_DATETIME", localUtil.ttoc( A45TAM06_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n45TAM06_UPD_DATETIME = T00044_n45TAM06_UPD_DATETIME[0] ;
         A80TAM06_UPD_USER_ID = T00044_A80TAM06_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A80TAM06_UPD_USER_ID", A80TAM06_UPD_USER_ID);
         n80TAM06_UPD_USER_ID = T00044_n80TAM06_UPD_USER_ID[0] ;
         A111TAM06_UPD_CNT = T00044_A111TAM06_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A111TAM06_UPD_CNT", GXutil.ltrim( GXutil.str( A111TAM06_UPD_CNT, 10, 0)));
         n111TAM06_UPD_CNT = T00044_n111TAM06_UPD_CNT[0] ;
         A20TAM06_MSG = T00044_A20TAM06_MSG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A20TAM06_MSG", A20TAM06_MSG);
         n20TAM06_MSG = T00044_n20TAM06_MSG[0] ;
         A110TAM06_DEL_FLG = T00044_A110TAM06_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A110TAM06_DEL_FLG", A110TAM06_DEL_FLG);
         n110TAM06_DEL_FLG = T00044_n110TAM06_DEL_FLG[0] ;
         A44TAM06_CRT_PROG_NM = T00044_A44TAM06_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44TAM06_CRT_PROG_NM", A44TAM06_CRT_PROG_NM);
         n44TAM06_CRT_PROG_NM = T00044_n44TAM06_CRT_PROG_NM[0] ;
         A46TAM06_UPD_PROG_NM = T00044_A46TAM06_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A46TAM06_UPD_PROG_NM", A46TAM06_UPD_PROG_NM);
         n46TAM06_UPD_PROG_NM = T00044_n46TAM06_UPD_PROG_NM[0] ;
         zm044( -27) ;
      }
      pr_default.close(2);
      onLoadActions044( ) ;
   }

   public void onLoadActions044( )
   {
      AV14Pgmname = "TAM06_MSG" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
   }

   public void checkExtendedTable044( )
   {
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      AV14Pgmname = "TAM06_MSG" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
   }

   public void closeExtendedTableCursors044( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey044( )
   {
      /* Using cursor T00045 */
      pr_default.execute(3, new Object[] {A21TAM06_MSG_CD});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound4 = (short)(1) ;
      }
      else
      {
         RcdFound4 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00043 */
      pr_default.execute(1, new Object[] {A21TAM06_MSG_CD});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm044( 27) ;
         RcdFound4 = (short)(1) ;
         A21TAM06_MSG_CD = T00043_A21TAM06_MSG_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A21TAM06_MSG_CD", A21TAM06_MSG_CD);
         A43TAM06_CRT_DATETIME = T00043_A43TAM06_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A43TAM06_CRT_DATETIME", localUtil.ttoc( A43TAM06_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n43TAM06_CRT_DATETIME = T00043_n43TAM06_CRT_DATETIME[0] ;
         A125TAM06_CRT_USER_ID = T00043_A125TAM06_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A125TAM06_CRT_USER_ID", A125TAM06_CRT_USER_ID);
         n125TAM06_CRT_USER_ID = T00043_n125TAM06_CRT_USER_ID[0] ;
         A45TAM06_UPD_DATETIME = T00043_A45TAM06_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A45TAM06_UPD_DATETIME", localUtil.ttoc( A45TAM06_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n45TAM06_UPD_DATETIME = T00043_n45TAM06_UPD_DATETIME[0] ;
         A80TAM06_UPD_USER_ID = T00043_A80TAM06_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A80TAM06_UPD_USER_ID", A80TAM06_UPD_USER_ID);
         n80TAM06_UPD_USER_ID = T00043_n80TAM06_UPD_USER_ID[0] ;
         A111TAM06_UPD_CNT = T00043_A111TAM06_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A111TAM06_UPD_CNT", GXutil.ltrim( GXutil.str( A111TAM06_UPD_CNT, 10, 0)));
         n111TAM06_UPD_CNT = T00043_n111TAM06_UPD_CNT[0] ;
         A20TAM06_MSG = T00043_A20TAM06_MSG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A20TAM06_MSG", A20TAM06_MSG);
         n20TAM06_MSG = T00043_n20TAM06_MSG[0] ;
         A110TAM06_DEL_FLG = T00043_A110TAM06_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A110TAM06_DEL_FLG", A110TAM06_DEL_FLG);
         n110TAM06_DEL_FLG = T00043_n110TAM06_DEL_FLG[0] ;
         A44TAM06_CRT_PROG_NM = T00043_A44TAM06_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44TAM06_CRT_PROG_NM", A44TAM06_CRT_PROG_NM);
         n44TAM06_CRT_PROG_NM = T00043_n44TAM06_CRT_PROG_NM[0] ;
         A46TAM06_UPD_PROG_NM = T00043_A46TAM06_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A46TAM06_UPD_PROG_NM", A46TAM06_UPD_PROG_NM);
         n46TAM06_UPD_PROG_NM = T00043_n46TAM06_UPD_PROG_NM[0] ;
         O111TAM06_UPD_CNT = A111TAM06_UPD_CNT ;
         n111TAM06_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A111TAM06_UPD_CNT", GXutil.ltrim( GXutil.str( A111TAM06_UPD_CNT, 10, 0)));
         Z21TAM06_MSG_CD = A21TAM06_MSG_CD ;
         sMode4 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load044( ) ;
         Gx_mode = sMode4 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound4 = (short)(0) ;
         initializeNonKey044( ) ;
         sMode4 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode4 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey044( ) ;
      if ( RcdFound4 == 0 )
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
      RcdFound4 = (short)(0) ;
      /* Using cursor T00046 */
      pr_default.execute(4, new Object[] {A21TAM06_MSG_CD});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T00046_A21TAM06_MSG_CD[0], A21TAM06_MSG_CD) < 0 ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T00046_A21TAM06_MSG_CD[0], A21TAM06_MSG_CD) > 0 ) ) )
         {
            A21TAM06_MSG_CD = T00046_A21TAM06_MSG_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A21TAM06_MSG_CD", A21TAM06_MSG_CD);
            RcdFound4 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound4 = (short)(0) ;
      /* Using cursor T00047 */
      pr_default.execute(5, new Object[] {A21TAM06_MSG_CD});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T00047_A21TAM06_MSG_CD[0], A21TAM06_MSG_CD) > 0 ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T00047_A21TAM06_MSG_CD[0], A21TAM06_MSG_CD) < 0 ) ) )
         {
            A21TAM06_MSG_CD = T00047_A21TAM06_MSG_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A21TAM06_MSG_CD", A21TAM06_MSG_CD);
            RcdFound4 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey044( ) ;
      if ( RcdFound4 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "TAM06_MSG_CD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTAM06_MSG_CD_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( GXutil.strcmp(A21TAM06_MSG_CD, Z21TAM06_MSG_CD) != 0 )
         {
            A21TAM06_MSG_CD = Z21TAM06_MSG_CD ;
            httpContext.ajax_rsp_assign_attri("", false, "A21TAM06_MSG_CD", A21TAM06_MSG_CD);
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TAM06_MSG_CD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTAM06_MSG_CD_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            delete( ) ;
            afterTrn( ) ;
            GX_FocusControl = edtTAM06_MSG_CD_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else
         {
            Gx_mode = "UPD" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            /* Update record */
            update044( ) ;
            GX_FocusControl = edtTAM06_MSG_CD_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( GXutil.strcmp(A21TAM06_MSG_CD, Z21TAM06_MSG_CD) != 0 )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            /* Insert record */
            GX_FocusControl = edtTAM06_MSG_CD_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            insert044( ) ;
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
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TAM06_MSG_CD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTAM06_MSG_CD_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTAM06_MSG_CD_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert044( ) ;
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
      if ( GXutil.strcmp(A21TAM06_MSG_CD, Z21TAM06_MSG_CD) != 0 )
      {
         A21TAM06_MSG_CD = Z21TAM06_MSG_CD ;
         httpContext.ajax_rsp_assign_attri("", false, "A21TAM06_MSG_CD", A21TAM06_MSG_CD);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TAM06_MSG_CD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAM06_MSG_CD_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTAM06_MSG_CD_Internalname ;
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

   public void btn_check( )
   {
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey044( ) ;
      if ( RcdFound4 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "TAM06_MSG_CD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTAM06_MSG_CD_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( GXutil.strcmp(A21TAM06_MSG_CD, Z21TAM06_MSG_CD) != 0 )
         {
            A21TAM06_MSG_CD = Z21TAM06_MSG_CD ;
            httpContext.ajax_rsp_assign_attri("", false, "A21TAM06_MSG_CD", A21TAM06_MSG_CD);
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "TAM06_MSG_CD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTAM06_MSG_CD_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            delete_check( ) ;
         }
         else
         {
            Gx_mode = "UPD" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            update_check( ) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(A21TAM06_MSG_CD, Z21TAM06_MSG_CD) != 0 )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            insert_check( ) ;
         }
         else
         {
            if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TAM06_MSG_CD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTAM06_MSG_CD_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert_check( ) ;
            }
         }
      }
      Application.rollback(context, remoteHandle, "DEFAULT", "tam06_msg");
      GX_FocusControl = edtTAM06_MSG_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_040( ) ;
      IsConfirmed = (short)(0) ;
   }

   public void update_check( )
   {
      insert_check( ) ;
   }

   public void delete_check( )
   {
      insert_check( ) ;
   }

   public void btn_get( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      getEqualNoModal( ) ;
      if ( RcdFound4 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TAM06_MSG_CD");
         AnyError = (short)(1) ;
      }
      GX_FocusControl = edtTAM06_MSG_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      scanStart044( ) ;
      if ( RcdFound4 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTAM06_MSG_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd044( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_previous( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      move_previous( ) ;
      if ( RcdFound4 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTAM06_MSG_Internalname ;
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
      if ( RcdFound4 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTAM06_MSG_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_last( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      scanStart044( ) ;
      if ( RcdFound4 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         while ( RcdFound4 != 0 )
         {
            scanNext044( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTAM06_MSG_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd044( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency044( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T00042 */
         pr_default.execute(0, new Object[] {A21TAM06_MSG_CD});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TAM06_MSG"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z43TAM06_CRT_DATETIME.equals( T00042_A43TAM06_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z125TAM06_CRT_USER_ID, T00042_A125TAM06_CRT_USER_ID[0]) != 0 ) || !( Z45TAM06_UPD_DATETIME.equals( T00042_A45TAM06_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z80TAM06_UPD_USER_ID, T00042_A80TAM06_UPD_USER_ID[0]) != 0 ) || ( Z111TAM06_UPD_CNT != T00042_A111TAM06_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z20TAM06_MSG, T00042_A20TAM06_MSG[0]) != 0 ) || ( GXutil.strcmp(Z110TAM06_DEL_FLG, T00042_A110TAM06_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z44TAM06_CRT_PROG_NM, T00042_A44TAM06_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z46TAM06_UPD_PROG_NM, T00042_A46TAM06_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TAM06_MSG"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert044( )
   {
      beforeValidate044( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable044( ) ;
      }
      if ( AnyError == 0 )
      {
         zm044( 0) ;
         checkOptimisticConcurrency044( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm044( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert044( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00048 */
                  pr_default.execute(6, new Object[] {A21TAM06_MSG_CD, new Boolean(n43TAM06_CRT_DATETIME), A43TAM06_CRT_DATETIME, new Boolean(n125TAM06_CRT_USER_ID), A125TAM06_CRT_USER_ID, new Boolean(n45TAM06_UPD_DATETIME), A45TAM06_UPD_DATETIME, new Boolean(n80TAM06_UPD_USER_ID), A80TAM06_UPD_USER_ID, new Boolean(n111TAM06_UPD_CNT), new Long(A111TAM06_UPD_CNT), new Boolean(n20TAM06_MSG), A20TAM06_MSG, new Boolean(n110TAM06_DEL_FLG), A110TAM06_DEL_FLG, new Boolean(n44TAM06_CRT_PROG_NM), A44TAM06_CRT_PROG_NM, new Boolean(n46TAM06_UPD_PROG_NM), A46TAM06_UPD_PROG_NM});
                  if ( (pr_default.getStatus(6) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     new tam06_pc01_datalog(remoteHandle, context).execute( AV14Pgmname, Gx_mode, A21TAM06_MSG_CD, A20TAM06_MSG, A110TAM06_DEL_FLG, A43TAM06_CRT_DATETIME, A125TAM06_CRT_USER_ID, A44TAM06_CRT_PROG_NM, A45TAM06_UPD_DATETIME, A80TAM06_UPD_USER_ID, A46TAM06_UPD_PROG_NM, A111TAM06_UPD_CNT) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     httpContext.ajax_rsp_assign_attri("", false, "A21TAM06_MSG_CD", A21TAM06_MSG_CD);
                     httpContext.ajax_rsp_assign_attri("", false, "A20TAM06_MSG", A20TAM06_MSG);
                     httpContext.ajax_rsp_assign_attri("", false, "A110TAM06_DEL_FLG", A110TAM06_DEL_FLG);
                     httpContext.ajax_rsp_assign_attri("", false, "A43TAM06_CRT_DATETIME", localUtil.ttoc( A43TAM06_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
                     httpContext.ajax_rsp_assign_attri("", false, "A125TAM06_CRT_USER_ID", A125TAM06_CRT_USER_ID);
                     httpContext.ajax_rsp_assign_attri("", false, "A44TAM06_CRT_PROG_NM", A44TAM06_CRT_PROG_NM);
                     httpContext.ajax_rsp_assign_attri("", false, "A45TAM06_UPD_DATETIME", localUtil.ttoc( A45TAM06_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
                     httpContext.ajax_rsp_assign_attri("", false, "A80TAM06_UPD_USER_ID", A80TAM06_UPD_USER_ID);
                     httpContext.ajax_rsp_assign_attri("", false, "A46TAM06_UPD_PROG_NM", A46TAM06_UPD_PROG_NM);
                     httpContext.ajax_rsp_assign_attri("", false, "A111TAM06_UPD_CNT", GXutil.ltrim( GXutil.str( A111TAM06_UPD_CNT, 10, 0)));
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucadded"), 0, "");
                        resetCaption040( ) ;
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
            load044( ) ;
         }
         endLevel044( ) ;
      }
      closeExtendedTableCursors044( ) ;
   }

   public void update044( )
   {
      beforeValidate044( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable044( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency044( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm044( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate044( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00049 */
                  pr_default.execute(7, new Object[] {new Boolean(n43TAM06_CRT_DATETIME), A43TAM06_CRT_DATETIME, new Boolean(n125TAM06_CRT_USER_ID), A125TAM06_CRT_USER_ID, new Boolean(n45TAM06_UPD_DATETIME), A45TAM06_UPD_DATETIME, new Boolean(n80TAM06_UPD_USER_ID), A80TAM06_UPD_USER_ID, new Boolean(n111TAM06_UPD_CNT), new Long(A111TAM06_UPD_CNT), new Boolean(n20TAM06_MSG), A20TAM06_MSG, new Boolean(n110TAM06_DEL_FLG), A110TAM06_DEL_FLG, new Boolean(n44TAM06_CRT_PROG_NM), A44TAM06_CRT_PROG_NM, new Boolean(n46TAM06_UPD_PROG_NM), A46TAM06_UPD_PROG_NM, A21TAM06_MSG_CD});
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TAM06_MSG"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate044( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     new tam06_pc01_datalog(remoteHandle, context).execute( AV14Pgmname, Gx_mode, A21TAM06_MSG_CD, A20TAM06_MSG, A110TAM06_DEL_FLG, A43TAM06_CRT_DATETIME, A125TAM06_CRT_USER_ID, A44TAM06_CRT_PROG_NM, A45TAM06_UPD_DATETIME, A80TAM06_UPD_USER_ID, A46TAM06_UPD_PROG_NM, A111TAM06_UPD_CNT) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     httpContext.ajax_rsp_assign_attri("", false, "A21TAM06_MSG_CD", A21TAM06_MSG_CD);
                     httpContext.ajax_rsp_assign_attri("", false, "A20TAM06_MSG", A20TAM06_MSG);
                     httpContext.ajax_rsp_assign_attri("", false, "A110TAM06_DEL_FLG", A110TAM06_DEL_FLG);
                     httpContext.ajax_rsp_assign_attri("", false, "A43TAM06_CRT_DATETIME", localUtil.ttoc( A43TAM06_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
                     httpContext.ajax_rsp_assign_attri("", false, "A125TAM06_CRT_USER_ID", A125TAM06_CRT_USER_ID);
                     httpContext.ajax_rsp_assign_attri("", false, "A44TAM06_CRT_PROG_NM", A44TAM06_CRT_PROG_NM);
                     httpContext.ajax_rsp_assign_attri("", false, "A45TAM06_UPD_DATETIME", localUtil.ttoc( A45TAM06_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
                     httpContext.ajax_rsp_assign_attri("", false, "A80TAM06_UPD_USER_ID", A80TAM06_UPD_USER_ID);
                     httpContext.ajax_rsp_assign_attri("", false, "A46TAM06_UPD_PROG_NM", A46TAM06_UPD_PROG_NM);
                     httpContext.ajax_rsp_assign_attri("", false, "A111TAM06_UPD_CNT", GXutil.ltrim( GXutil.str( A111TAM06_UPD_CNT, 10, 0)));
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "");
                        resetCaption040( ) ;
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
         endLevel044( ) ;
      }
      closeExtendedTableCursors044( ) ;
   }

   public void deferredUpdate044( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate044( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency044( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls044( ) ;
         afterConfirm044( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete044( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000410 */
               pr_default.execute(8, new Object[] {A21TAM06_MSG_CD});
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  new tam06_pc01_datalog(remoteHandle, context).execute( AV14Pgmname, Gx_mode, A21TAM06_MSG_CD, A20TAM06_MSG, A110TAM06_DEL_FLG, A43TAM06_CRT_DATETIME, A125TAM06_CRT_USER_ID, A44TAM06_CRT_PROG_NM, A45TAM06_UPD_DATETIME, A80TAM06_UPD_USER_ID, A46TAM06_UPD_PROG_NM, A111TAM06_UPD_CNT) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "A21TAM06_MSG_CD", A21TAM06_MSG_CD);
                  httpContext.ajax_rsp_assign_attri("", false, "A20TAM06_MSG", A20TAM06_MSG);
                  httpContext.ajax_rsp_assign_attri("", false, "A110TAM06_DEL_FLG", A110TAM06_DEL_FLG);
                  httpContext.ajax_rsp_assign_attri("", false, "A43TAM06_CRT_DATETIME", localUtil.ttoc( A43TAM06_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
                  httpContext.ajax_rsp_assign_attri("", false, "A125TAM06_CRT_USER_ID", A125TAM06_CRT_USER_ID);
                  httpContext.ajax_rsp_assign_attri("", false, "A44TAM06_CRT_PROG_NM", A44TAM06_CRT_PROG_NM);
                  httpContext.ajax_rsp_assign_attri("", false, "A45TAM06_UPD_DATETIME", localUtil.ttoc( A45TAM06_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
                  httpContext.ajax_rsp_assign_attri("", false, "A80TAM06_UPD_USER_ID", A80TAM06_UPD_USER_ID);
                  httpContext.ajax_rsp_assign_attri("", false, "A46TAM06_UPD_PROG_NM", A46TAM06_UPD_PROG_NM);
                  httpContext.ajax_rsp_assign_attri("", false, "A111TAM06_UPD_CNT", GXutil.ltrim( GXutil.str( A111TAM06_UPD_CNT, 10, 0)));
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound4 == 0 )
                     {
                        initAll044( ) ;
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
                     resetCaption040( ) ;
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
      sMode4 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel044( ) ;
      Gx_mode = sMode4 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls044( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV14Pgmname = "TAM06_MSG" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
      }
   }

   public void endLevel044( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete044( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "tam06_msg");
         if ( AnyError == 0 )
         {
            confirmValues040( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "tam06_msg");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart044( )
   {
      /* Using cursor T000411 */
      pr_default.execute(9);
      RcdFound4 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound4 = (short)(1) ;
         A21TAM06_MSG_CD = T000411_A21TAM06_MSG_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A21TAM06_MSG_CD", A21TAM06_MSG_CD);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext044( )
   {
      pr_default.readNext(9);
      RcdFound4 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound4 = (short)(1) ;
         A21TAM06_MSG_CD = T000411_A21TAM06_MSG_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A21TAM06_MSG_CD", A21TAM06_MSG_CD);
      }
   }

   public void scanEnd044( )
   {
      pr_default.close(9);
   }

   public void afterConfirm044( )
   {
      /* After Confirm Rules */
      if ( (GXutil.strcmp("", A21TAM06_MSG_CD)==0) )
      {
         httpContext.GX_msglist.addItem("メッセージコードを入力してください", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( 7 < GXutil.byteCount( A21TAM06_MSG_CD, "Shift-JIS") )
      {
         httpContext.GX_msglist.addItem("メッセージコードは半角7桁以内になるようにしてください。", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( (GXutil.strcmp("", A20TAM06_MSG)==0) )
      {
         httpContext.GX_msglist.addItem("メッセージを入力してください", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( 1000 < GXutil.byteCount( A20TAM06_MSG, "Shift-JIS") )
      {
         httpContext.GX_msglist.addItem("メッセージは全角500桁又は半角1000桁以内になるようにしてください。", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
   }

   public void beforeInsert044( )
   {
      /* Before Insert Rules */
      A43TAM06_CRT_DATETIME = GXutil.now( ) ;
      n43TAM06_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A43TAM06_CRT_DATETIME", localUtil.ttoc( A43TAM06_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char2 = A125TAM06_CRT_USER_ID ;
      GXv_char5[0] = GXt_char2 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char5) ;
      tam06_msg_impl.this.GXt_char2 = GXv_char5[0] ;
      A125TAM06_CRT_USER_ID = GXt_char2 ;
      n125TAM06_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A125TAM06_CRT_USER_ID", A125TAM06_CRT_USER_ID);
      A45TAM06_UPD_DATETIME = GXutil.now( ) ;
      n45TAM06_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A45TAM06_UPD_DATETIME", localUtil.ttoc( A45TAM06_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char2 = A80TAM06_UPD_USER_ID ;
      GXv_char5[0] = GXt_char2 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char5) ;
      tam06_msg_impl.this.GXt_char2 = GXv_char5[0] ;
      A80TAM06_UPD_USER_ID = GXt_char2 ;
      n80TAM06_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A80TAM06_UPD_USER_ID", A80TAM06_UPD_USER_ID);
      A111TAM06_UPD_CNT = (long)(O111TAM06_UPD_CNT+1) ;
      n111TAM06_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A111TAM06_UPD_CNT", GXutil.ltrim( GXutil.str( A111TAM06_UPD_CNT, 10, 0)));
   }

   public void beforeUpdate044( )
   {
      /* Before Update Rules */
      A45TAM06_UPD_DATETIME = GXutil.now( ) ;
      n45TAM06_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A45TAM06_UPD_DATETIME", localUtil.ttoc( A45TAM06_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char2 = A80TAM06_UPD_USER_ID ;
      GXv_char5[0] = GXt_char2 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char5) ;
      tam06_msg_impl.this.GXt_char2 = GXv_char5[0] ;
      A80TAM06_UPD_USER_ID = GXt_char2 ;
      n80TAM06_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A80TAM06_UPD_USER_ID", A80TAM06_UPD_USER_ID);
      A111TAM06_UPD_CNT = (long)(O111TAM06_UPD_CNT+1) ;
      n111TAM06_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A111TAM06_UPD_CNT", GXutil.ltrim( GXutil.str( A111TAM06_UPD_CNT, 10, 0)));
   }

   public void beforeDelete044( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete044( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate044( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes044( )
   {
      edtTAM06_MSG_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM06_MSG_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM06_MSG_CD_Enabled, 5, 0)));
      edtTAM06_MSG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM06_MSG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM06_MSG_Enabled, 5, 0)));
      radTAM06_DEL_FLG.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, radTAM06_DEL_FLG.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( radTAM06_DEL_FLG.getEnabled(), 5, 0)));
      edtTAM06_CRT_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM06_CRT_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM06_CRT_DATETIME_Enabled, 5, 0)));
      edtTAM06_CRT_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM06_CRT_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM06_CRT_USER_ID_Enabled, 5, 0)));
      edtTAM06_CRT_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM06_CRT_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM06_CRT_PROG_NM_Enabled, 5, 0)));
      edtTAM06_UPD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM06_UPD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM06_UPD_DATETIME_Enabled, 5, 0)));
      edtTAM06_UPD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM06_UPD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM06_UPD_USER_ID_Enabled, 5, 0)));
      edtTAM06_UPD_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM06_UPD_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM06_UPD_PROG_NM_Enabled, 5, 0)));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues040( )
   {
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), "IE=EmulateIE7");
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeText( "メッセージマスタ") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" onsubmit=\"try{return gx.csv.validForm()}catch(e){return true;}\" name=\"MAINFORM\" method=\"post\" action=\""+formatLink("tam06_msg") +"\" class=\""+"Form"+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
   }

   public void renderHtmlCloseForm044( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z21TAM06_MSG_CD", GXutil.rtrim( Z21TAM06_MSG_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z43TAM06_CRT_DATETIME", localUtil.ttoc( Z43TAM06_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z125TAM06_CRT_USER_ID", GXutil.rtrim( Z125TAM06_CRT_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z45TAM06_UPD_DATETIME", localUtil.ttoc( Z45TAM06_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z80TAM06_UPD_USER_ID", GXutil.rtrim( Z80TAM06_UPD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z111TAM06_UPD_CNT", GXutil.ltrim( localUtil.ntoc( Z111TAM06_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z20TAM06_MSG", GXutil.rtrim( Z20TAM06_MSG));
      GxWebStd.gx_hidden_field( httpContext, "Z110TAM06_DEL_FLG", GXutil.rtrim( Z110TAM06_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z44TAM06_CRT_PROG_NM", GXutil.rtrim( Z44TAM06_CRT_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z46TAM06_UPD_PROG_NM", GXutil.rtrim( Z46TAM06_UPD_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "O111TAM06_UPD_CNT", GXutil.ltrim( localUtil.ntoc( O111TAM06_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      GxWebStd.gx_hidden_field( httpContext, "TAM06_UPD_CNT", GXutil.ltrim( localUtil.ntoc( A111TAM06_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV14Pgmname));
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

   public void initializeNonKey044( )
   {
      A43TAM06_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n43TAM06_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A43TAM06_CRT_DATETIME", localUtil.ttoc( A43TAM06_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n43TAM06_CRT_DATETIME = (GXutil.nullDate().equals(A43TAM06_CRT_DATETIME) ? true : false) ;
      A125TAM06_CRT_USER_ID = "" ;
      n125TAM06_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A125TAM06_CRT_USER_ID", A125TAM06_CRT_USER_ID);
      n125TAM06_CRT_USER_ID = ((GXutil.strcmp("", A125TAM06_CRT_USER_ID)==0) ? true : false) ;
      A45TAM06_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n45TAM06_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A45TAM06_UPD_DATETIME", localUtil.ttoc( A45TAM06_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n45TAM06_UPD_DATETIME = (GXutil.nullDate().equals(A45TAM06_UPD_DATETIME) ? true : false) ;
      A80TAM06_UPD_USER_ID = "" ;
      n80TAM06_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A80TAM06_UPD_USER_ID", A80TAM06_UPD_USER_ID);
      n80TAM06_UPD_USER_ID = ((GXutil.strcmp("", A80TAM06_UPD_USER_ID)==0) ? true : false) ;
      A111TAM06_UPD_CNT = 0 ;
      n111TAM06_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A111TAM06_UPD_CNT", GXutil.ltrim( GXutil.str( A111TAM06_UPD_CNT, 10, 0)));
      A20TAM06_MSG = "" ;
      n20TAM06_MSG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A20TAM06_MSG", A20TAM06_MSG);
      n20TAM06_MSG = ((GXutil.strcmp("", A20TAM06_MSG)==0) ? true : false) ;
      A110TAM06_DEL_FLG = "0" ;
      n110TAM06_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A110TAM06_DEL_FLG", A110TAM06_DEL_FLG);
      A44TAM06_CRT_PROG_NM = AV14Pgmname ;
      n44TAM06_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A44TAM06_CRT_PROG_NM", A44TAM06_CRT_PROG_NM);
      A46TAM06_UPD_PROG_NM = AV14Pgmname ;
      n46TAM06_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A46TAM06_UPD_PROG_NM", A46TAM06_UPD_PROG_NM);
      O111TAM06_UPD_CNT = A111TAM06_UPD_CNT ;
      n111TAM06_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A111TAM06_UPD_CNT", GXutil.ltrim( GXutil.str( A111TAM06_UPD_CNT, 10, 0)));
   }

   public void initAll044( )
   {
      A21TAM06_MSG_CD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A21TAM06_MSG_CD", A21TAM06_MSG_CD);
      initializeNonKey044( ) ;
   }

   public void standaloneModalInsert( )
   {
      A110TAM06_DEL_FLG = i110TAM06_DEL_FLG ;
      n110TAM06_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A110TAM06_DEL_FLG", A110TAM06_DEL_FLG);
      A44TAM06_CRT_PROG_NM = i44TAM06_CRT_PROG_NM ;
      n44TAM06_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A44TAM06_CRT_PROG_NM", A44TAM06_CRT_PROG_NM);
      A46TAM06_UPD_PROG_NM = i46TAM06_UPD_PROG_NM ;
      n46TAM06_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A46TAM06_UPD_PROG_NM", A46TAM06_UPD_PROG_NM);
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("calendar-system.css", "?225080");
      httpContext.AddThemeStyleSheetFile("", "Style2.css", "?14454892");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?14534212");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?58720");
      httpContext.AddJavascriptSource("tam06_msg.js", "?14534212");
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
      imgImage19_Internalname = "IMAGE19" ;
      lblTextblocktam06_msg_cd_Internalname = "TEXTBLOCKTAM06_MSG_CD" ;
      edtTAM06_MSG_CD_Internalname = "TAM06_MSG_CD" ;
      imgImage20_Internalname = "IMAGE20" ;
      lblTextblocktam06_msg_Internalname = "TEXTBLOCKTAM06_MSG" ;
      edtTAM06_MSG_Internalname = "TAM06_MSG" ;
      lblTextblocktam06_del_flg_Internalname = "TEXTBLOCKTAM06_DEL_FLG" ;
      radTAM06_DEL_FLG.setInternalname( "TAM06_DEL_FLG" );
      lblTextblocktam06_crt_datetime_Internalname = "TEXTBLOCKTAM06_CRT_DATETIME" ;
      edtTAM06_CRT_DATETIME_Internalname = "TAM06_CRT_DATETIME" ;
      lblTextblocktam06_crt_user_id_Internalname = "TEXTBLOCKTAM06_CRT_USER_ID" ;
      edtTAM06_CRT_USER_ID_Internalname = "TAM06_CRT_USER_ID" ;
      lblTextblocktam06_crt_prog_nm_Internalname = "TEXTBLOCKTAM06_CRT_PROG_NM" ;
      edtTAM06_CRT_PROG_NM_Internalname = "TAM06_CRT_PROG_NM" ;
      lblTextblocktam06_upd_datetime_Internalname = "TEXTBLOCKTAM06_UPD_DATETIME" ;
      edtTAM06_UPD_DATETIME_Internalname = "TAM06_UPD_DATETIME" ;
      lblTextblocktam06_upd_user_id_Internalname = "TEXTBLOCKTAM06_UPD_USER_ID" ;
      edtTAM06_UPD_USER_ID_Internalname = "TAM06_UPD_USER_ID" ;
      lblTextblocktam06_upd_prog_nm_Internalname = "TEXTBLOCKTAM06_UPD_PROG_NM" ;
      edtTAM06_UPD_PROG_NM_Internalname = "TAM06_UPD_PROG_NM" ;
      tblTable2_Internalname = "TABLE2" ;
      lblTextblock44_Internalname = "TEXTBLOCK44" ;
      lblTextblock45_Internalname = "TEXTBLOCK45" ;
      lblBtn_cancel_Internalname = "BTN_CANCEL" ;
      tblTable4_Internalname = "TABLE4" ;
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
      edtTAM06_UPD_PROG_NM_Jsonclick = "" ;
      edtTAM06_UPD_PROG_NM_Enabled = 0 ;
      edtTAM06_UPD_PROG_NM_Visible = 1 ;
      edtTAM06_UPD_USER_ID_Jsonclick = "" ;
      edtTAM06_UPD_USER_ID_Enabled = 0 ;
      edtTAM06_UPD_DATETIME_Jsonclick = "" ;
      edtTAM06_UPD_DATETIME_Enabled = 0 ;
      edtTAM06_UPD_DATETIME_Visible = 1 ;
      edtTAM06_CRT_PROG_NM_Jsonclick = "" ;
      edtTAM06_CRT_PROG_NM_Enabled = 0 ;
      edtTAM06_CRT_PROG_NM_Visible = 1 ;
      edtTAM06_CRT_USER_ID_Jsonclick = "" ;
      edtTAM06_CRT_USER_ID_Enabled = 0 ;
      edtTAM06_CRT_DATETIME_Jsonclick = "" ;
      edtTAM06_CRT_DATETIME_Enabled = 0 ;
      edtTAM06_CRT_DATETIME_Visible = 1 ;
      radTAM06_DEL_FLG.setJsonclick( "" );
      radTAM06_DEL_FLG.setEnabled( 1 );
      edtTAM06_MSG_Enabled = 1 ;
      imgImage20_Visible = 1 ;
      edtTAM06_MSG_CD_Jsonclick = "" ;
      edtTAM06_MSG_CD_Enabled = 1 ;
      imgImage19_Visible = 1 ;
      lblBtn_cancel_Enabled = 1 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gx7asatam06_crt_user_id044( String Gx_mode )
   {
      GXt_char6 = A125TAM06_CRT_USER_ID ;
      GXv_char5[0] = GXt_char6 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char5) ;
      tam06_msg_impl.this.GXt_char6 = GXv_char5[0] ;
      A125TAM06_CRT_USER_ID = GXt_char6 ;
      n125TAM06_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A125TAM06_CRT_USER_ID", A125TAM06_CRT_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A125TAM06_CRT_USER_ID))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void gx9asatam06_upd_user_id044( String Gx_mode )
   {
      GXt_char6 = A80TAM06_UPD_USER_ID ;
      GXv_char5[0] = GXt_char6 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char5) ;
      tam06_msg_impl.this.GXt_char6 = GXv_char5[0] ;
      A80TAM06_UPD_USER_ID = GXt_char6 ;
      n80TAM06_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A80TAM06_UPD_USER_ID", A80TAM06_UPD_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A80TAM06_UPD_USER_ID))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void xc_24_044( String AV14Pgmname ,
                          String Gx_mode ,
                          String A21TAM06_MSG_CD ,
                          String A20TAM06_MSG ,
                          String A110TAM06_DEL_FLG ,
                          java.util.Date A43TAM06_CRT_DATETIME ,
                          String A125TAM06_CRT_USER_ID ,
                          String A44TAM06_CRT_PROG_NM ,
                          java.util.Date A45TAM06_UPD_DATETIME ,
                          String A80TAM06_UPD_USER_ID ,
                          String A46TAM06_UPD_PROG_NM ,
                          long A111TAM06_UPD_CNT )
   {
      new tam06_pc01_datalog(remoteHandle, context).execute( AV14Pgmname, Gx_mode, A21TAM06_MSG_CD, A20TAM06_MSG, A110TAM06_DEL_FLG, A43TAM06_CRT_DATETIME, A125TAM06_CRT_USER_ID, A44TAM06_CRT_PROG_NM, A45TAM06_UPD_DATETIME, A80TAM06_UPD_USER_ID, A46TAM06_UPD_PROG_NM, A111TAM06_UPD_CNT) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "A21TAM06_MSG_CD", A21TAM06_MSG_CD);
      httpContext.ajax_rsp_assign_attri("", false, "A20TAM06_MSG", A20TAM06_MSG);
      httpContext.ajax_rsp_assign_attri("", false, "A110TAM06_DEL_FLG", A110TAM06_DEL_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "A43TAM06_CRT_DATETIME", localUtil.ttoc( A43TAM06_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A125TAM06_CRT_USER_ID", A125TAM06_CRT_USER_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A44TAM06_CRT_PROG_NM", A44TAM06_CRT_PROG_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A45TAM06_UPD_DATETIME", localUtil.ttoc( A45TAM06_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A80TAM06_UPD_USER_ID", A80TAM06_UPD_USER_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A46TAM06_UPD_PROG_NM", A46TAM06_UPD_PROG_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A111TAM06_UPD_CNT", GXutil.ltrim( GXutil.str( A111TAM06_UPD_CNT, 10, 0)));
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void xc_25_044( String AV14Pgmname ,
                          String Gx_mode ,
                          String A21TAM06_MSG_CD ,
                          String A20TAM06_MSG ,
                          String A110TAM06_DEL_FLG ,
                          java.util.Date A43TAM06_CRT_DATETIME ,
                          String A125TAM06_CRT_USER_ID ,
                          String A44TAM06_CRT_PROG_NM ,
                          java.util.Date A45TAM06_UPD_DATETIME ,
                          String A80TAM06_UPD_USER_ID ,
                          String A46TAM06_UPD_PROG_NM ,
                          long A111TAM06_UPD_CNT )
   {
      new tam06_pc01_datalog(remoteHandle, context).execute( AV14Pgmname, Gx_mode, A21TAM06_MSG_CD, A20TAM06_MSG, A110TAM06_DEL_FLG, A43TAM06_CRT_DATETIME, A125TAM06_CRT_USER_ID, A44TAM06_CRT_PROG_NM, A45TAM06_UPD_DATETIME, A80TAM06_UPD_USER_ID, A46TAM06_UPD_PROG_NM, A111TAM06_UPD_CNT) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "A21TAM06_MSG_CD", A21TAM06_MSG_CD);
      httpContext.ajax_rsp_assign_attri("", false, "A20TAM06_MSG", A20TAM06_MSG);
      httpContext.ajax_rsp_assign_attri("", false, "A110TAM06_DEL_FLG", A110TAM06_DEL_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "A43TAM06_CRT_DATETIME", localUtil.ttoc( A43TAM06_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A125TAM06_CRT_USER_ID", A125TAM06_CRT_USER_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A44TAM06_CRT_PROG_NM", A44TAM06_CRT_PROG_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A45TAM06_UPD_DATETIME", localUtil.ttoc( A45TAM06_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A80TAM06_UPD_USER_ID", A80TAM06_UPD_USER_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A46TAM06_UPD_PROG_NM", A46TAM06_UPD_PROG_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A111TAM06_UPD_CNT", GXutil.ltrim( GXutil.str( A111TAM06_UPD_CNT, 10, 0)));
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void xc_26_044( String AV14Pgmname ,
                          String Gx_mode ,
                          String A21TAM06_MSG_CD ,
                          String A20TAM06_MSG ,
                          String A110TAM06_DEL_FLG ,
                          java.util.Date A43TAM06_CRT_DATETIME ,
                          String A125TAM06_CRT_USER_ID ,
                          String A44TAM06_CRT_PROG_NM ,
                          java.util.Date A45TAM06_UPD_DATETIME ,
                          String A80TAM06_UPD_USER_ID ,
                          String A46TAM06_UPD_PROG_NM ,
                          long A111TAM06_UPD_CNT )
   {
      new tam06_pc01_datalog(remoteHandle, context).execute( AV14Pgmname, Gx_mode, A21TAM06_MSG_CD, A20TAM06_MSG, A110TAM06_DEL_FLG, A43TAM06_CRT_DATETIME, A125TAM06_CRT_USER_ID, A44TAM06_CRT_PROG_NM, A45TAM06_UPD_DATETIME, A80TAM06_UPD_USER_ID, A46TAM06_UPD_PROG_NM, A111TAM06_UPD_CNT) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "A21TAM06_MSG_CD", A21TAM06_MSG_CD);
      httpContext.ajax_rsp_assign_attri("", false, "A20TAM06_MSG", A20TAM06_MSG);
      httpContext.ajax_rsp_assign_attri("", false, "A110TAM06_DEL_FLG", A110TAM06_DEL_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "A43TAM06_CRT_DATETIME", localUtil.ttoc( A43TAM06_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A125TAM06_CRT_USER_ID", A125TAM06_CRT_USER_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A44TAM06_CRT_PROG_NM", A44TAM06_CRT_PROG_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A45TAM06_UPD_DATETIME", localUtil.ttoc( A45TAM06_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A80TAM06_UPD_USER_ID", A80TAM06_UPD_USER_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A46TAM06_UPD_PROG_NM", A46TAM06_UPD_PROG_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A111TAM06_UPD_CNT", GXutil.ltrim( GXutil.str( A111TAM06_UPD_CNT, 10, 0)));
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("");
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
      GX_FocusControl = edtTAM06_MSG_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Tam06_msg_cd( String GX_Parm1 ,
                                   java.util.Date GX_Parm2 ,
                                   String GX_Parm3 ,
                                   java.util.Date GX_Parm4 ,
                                   String GX_Parm5 ,
                                   long GX_Parm6 ,
                                   String GX_Parm7 ,
                                   String GX_Parm8 ,
                                   String GX_Parm9 ,
                                   String GX_Parm10 )
   {
      A21TAM06_MSG_CD = GX_Parm1 ;
      A43TAM06_CRT_DATETIME = GX_Parm2 ;
      n43TAM06_CRT_DATETIME = false ;
      A125TAM06_CRT_USER_ID = GX_Parm3 ;
      n125TAM06_CRT_USER_ID = false ;
      A45TAM06_UPD_DATETIME = GX_Parm4 ;
      n45TAM06_UPD_DATETIME = false ;
      A80TAM06_UPD_USER_ID = GX_Parm5 ;
      n80TAM06_UPD_USER_ID = false ;
      A111TAM06_UPD_CNT = GX_Parm6 ;
      n111TAM06_UPD_CNT = false ;
      A20TAM06_MSG = GX_Parm7 ;
      n20TAM06_MSG = false ;
      A110TAM06_DEL_FLG = GX_Parm8 ;
      n110TAM06_DEL_FLG = false ;
      A44TAM06_CRT_PROG_NM = GX_Parm9 ;
      n44TAM06_CRT_PROG_NM = false ;
      A46TAM06_UPD_PROG_NM = GX_Parm10 ;
      n46TAM06_UPD_PROG_NM = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(localUtil.format(A43TAM06_CRT_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A125TAM06_CRT_USER_ID));
      isValidOutput.add(localUtil.format(A45TAM06_UPD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A80TAM06_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A111TAM06_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A20TAM06_MSG));
      isValidOutput.add(GXutil.rtrim( A110TAM06_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( A44TAM06_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( A46TAM06_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( AV14Pgmname));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.rtrim( Z21TAM06_MSG_CD));
      isValidOutput.add(localUtil.ttoc( Z43TAM06_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z125TAM06_CRT_USER_ID));
      isValidOutput.add(localUtil.ttoc( Z45TAM06_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z80TAM06_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z111TAM06_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z20TAM06_MSG));
      isValidOutput.add(GXutil.rtrim( Z110TAM06_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( Z44TAM06_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( Z46TAM06_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( ZV14Pgmname));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( O111TAM06_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(edtTAM06_MSG_CD_Enabled);
      isValidOutput.add(edtTAM06_CRT_DATETIME_Visible);
      isValidOutput.add(edtTAM06_CRT_PROG_NM_Visible);
      isValidOutput.add(edtTAM06_UPD_DATETIME_Visible);
      isValidOutput.add(edtTAM06_UPD_PROG_NM_Visible);
      isValidOutput.add(imgBtn_delete2_Enabled);
      isValidOutput.add(imgBtn_enter2_Enabled);
      isValidOutput.add(lblBtn_cancel_Enabled);
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
               case 1 :
                  /* Execute user subroutine: S13109 */
                  S13109 ();
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
      AV14Pgmname = "" ;
      Gx_mode = "" ;
      A21TAM06_MSG_CD = "" ;
      A20TAM06_MSG = "" ;
      A110TAM06_DEL_FLG = "" ;
      A43TAM06_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A125TAM06_CRT_USER_ID = "" ;
      A44TAM06_CRT_PROG_NM = "" ;
      A45TAM06_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A80TAM06_UPD_USER_ID = "" ;
      A46TAM06_UPD_PROG_NM = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      sStyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      lblTextblock44_Jsonclick = "" ;
      lblTextblock45_Jsonclick = "" ;
      lblBtn_cancel_Jsonclick = "" ;
      lblTextblocktam06_msg_cd_Jsonclick = "" ;
      TempTags = "" ;
      lblTextblocktam06_msg_Jsonclick = "" ;
      lblTextblocktam06_del_flg_Jsonclick = "" ;
      lblTextblocktam06_crt_datetime_Jsonclick = "" ;
      lblTextblocktam06_crt_user_id_Jsonclick = "" ;
      lblTextblocktam06_crt_prog_nm_Jsonclick = "" ;
      lblTextblocktam06_upd_datetime_Jsonclick = "" ;
      lblTextblocktam06_upd_user_id_Jsonclick = "" ;
      lblTextblocktam06_upd_prog_nm_Jsonclick = "" ;
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
      Z21TAM06_MSG_CD = "" ;
      Z43TAM06_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z125TAM06_CRT_USER_ID = "" ;
      Z45TAM06_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z80TAM06_UPD_USER_ID = "" ;
      Z20TAM06_MSG = "" ;
      Z110TAM06_DEL_FLG = "" ;
      Z44TAM06_CRT_PROG_NM = "" ;
      Z46TAM06_UPD_PROG_NM = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV7C_TAM02_APP_ID = "" ;
      AV9W_ERRCD = "" ;
      AV12W_MSG = "" ;
      AV8W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      GXv_SdtA_LOGIN_SDT4 = new SdtA_LOGIN_SDT [1] ;
      GXEncryptionTmp = "" ;
      AV10W_KNGN_FLG = "" ;
      GXv_char3 = new String [1] ;
      T00044_A21TAM06_MSG_CD = new String[] {""} ;
      T00044_A43TAM06_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00044_n43TAM06_CRT_DATETIME = new boolean[] {false} ;
      T00044_A125TAM06_CRT_USER_ID = new String[] {""} ;
      T00044_n125TAM06_CRT_USER_ID = new boolean[] {false} ;
      T00044_A45TAM06_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00044_n45TAM06_UPD_DATETIME = new boolean[] {false} ;
      T00044_A80TAM06_UPD_USER_ID = new String[] {""} ;
      T00044_n80TAM06_UPD_USER_ID = new boolean[] {false} ;
      T00044_A111TAM06_UPD_CNT = new long[1] ;
      T00044_n111TAM06_UPD_CNT = new boolean[] {false} ;
      T00044_A20TAM06_MSG = new String[] {""} ;
      T00044_n20TAM06_MSG = new boolean[] {false} ;
      T00044_A110TAM06_DEL_FLG = new String[] {""} ;
      T00044_n110TAM06_DEL_FLG = new boolean[] {false} ;
      T00044_A44TAM06_CRT_PROG_NM = new String[] {""} ;
      T00044_n44TAM06_CRT_PROG_NM = new boolean[] {false} ;
      T00044_A46TAM06_UPD_PROG_NM = new String[] {""} ;
      T00044_n46TAM06_UPD_PROG_NM = new boolean[] {false} ;
      T00045_A21TAM06_MSG_CD = new String[] {""} ;
      T00043_A21TAM06_MSG_CD = new String[] {""} ;
      T00043_A43TAM06_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00043_n43TAM06_CRT_DATETIME = new boolean[] {false} ;
      T00043_A125TAM06_CRT_USER_ID = new String[] {""} ;
      T00043_n125TAM06_CRT_USER_ID = new boolean[] {false} ;
      T00043_A45TAM06_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00043_n45TAM06_UPD_DATETIME = new boolean[] {false} ;
      T00043_A80TAM06_UPD_USER_ID = new String[] {""} ;
      T00043_n80TAM06_UPD_USER_ID = new boolean[] {false} ;
      T00043_A111TAM06_UPD_CNT = new long[1] ;
      T00043_n111TAM06_UPD_CNT = new boolean[] {false} ;
      T00043_A20TAM06_MSG = new String[] {""} ;
      T00043_n20TAM06_MSG = new boolean[] {false} ;
      T00043_A110TAM06_DEL_FLG = new String[] {""} ;
      T00043_n110TAM06_DEL_FLG = new boolean[] {false} ;
      T00043_A44TAM06_CRT_PROG_NM = new String[] {""} ;
      T00043_n44TAM06_CRT_PROG_NM = new boolean[] {false} ;
      T00043_A46TAM06_UPD_PROG_NM = new String[] {""} ;
      T00043_n46TAM06_UPD_PROG_NM = new boolean[] {false} ;
      sMode4 = "" ;
      T00046_A21TAM06_MSG_CD = new String[] {""} ;
      T00047_A21TAM06_MSG_CD = new String[] {""} ;
      T00042_A21TAM06_MSG_CD = new String[] {""} ;
      T00042_A43TAM06_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00042_n43TAM06_CRT_DATETIME = new boolean[] {false} ;
      T00042_A125TAM06_CRT_USER_ID = new String[] {""} ;
      T00042_n125TAM06_CRT_USER_ID = new boolean[] {false} ;
      T00042_A45TAM06_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00042_n45TAM06_UPD_DATETIME = new boolean[] {false} ;
      T00042_A80TAM06_UPD_USER_ID = new String[] {""} ;
      T00042_n80TAM06_UPD_USER_ID = new boolean[] {false} ;
      T00042_A111TAM06_UPD_CNT = new long[1] ;
      T00042_n111TAM06_UPD_CNT = new boolean[] {false} ;
      T00042_A20TAM06_MSG = new String[] {""} ;
      T00042_n20TAM06_MSG = new boolean[] {false} ;
      T00042_A110TAM06_DEL_FLG = new String[] {""} ;
      T00042_n110TAM06_DEL_FLG = new boolean[] {false} ;
      T00042_A44TAM06_CRT_PROG_NM = new String[] {""} ;
      T00042_n44TAM06_CRT_PROG_NM = new boolean[] {false} ;
      T00042_A46TAM06_UPD_PROG_NM = new String[] {""} ;
      T00042_n46TAM06_UPD_PROG_NM = new boolean[] {false} ;
      T000411_A21TAM06_MSG_CD = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      GXt_char2 = "" ;
      GXt_char1 = "" ;
      i110TAM06_DEL_FLG = "" ;
      i44TAM06_CRT_PROG_NM = "" ;
      i46TAM06_UPD_PROG_NM = "" ;
      GXv_char5 = new String [1] ;
      GXt_char6 = "" ;
      ZV14Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tam06_msg__default(),
         new Object[] {
             new Object[] {
            T00042_A21TAM06_MSG_CD, T00042_A43TAM06_CRT_DATETIME, T00042_n43TAM06_CRT_DATETIME, T00042_A125TAM06_CRT_USER_ID, T00042_n125TAM06_CRT_USER_ID, T00042_A45TAM06_UPD_DATETIME, T00042_n45TAM06_UPD_DATETIME, T00042_A80TAM06_UPD_USER_ID, T00042_n80TAM06_UPD_USER_ID, T00042_A111TAM06_UPD_CNT,
            T00042_n111TAM06_UPD_CNT, T00042_A20TAM06_MSG, T00042_n20TAM06_MSG, T00042_A110TAM06_DEL_FLG, T00042_n110TAM06_DEL_FLG, T00042_A44TAM06_CRT_PROG_NM, T00042_n44TAM06_CRT_PROG_NM, T00042_A46TAM06_UPD_PROG_NM, T00042_n46TAM06_UPD_PROG_NM
            }
            , new Object[] {
            T00043_A21TAM06_MSG_CD, T00043_A43TAM06_CRT_DATETIME, T00043_n43TAM06_CRT_DATETIME, T00043_A125TAM06_CRT_USER_ID, T00043_n125TAM06_CRT_USER_ID, T00043_A45TAM06_UPD_DATETIME, T00043_n45TAM06_UPD_DATETIME, T00043_A80TAM06_UPD_USER_ID, T00043_n80TAM06_UPD_USER_ID, T00043_A111TAM06_UPD_CNT,
            T00043_n111TAM06_UPD_CNT, T00043_A20TAM06_MSG, T00043_n20TAM06_MSG, T00043_A110TAM06_DEL_FLG, T00043_n110TAM06_DEL_FLG, T00043_A44TAM06_CRT_PROG_NM, T00043_n44TAM06_CRT_PROG_NM, T00043_A46TAM06_UPD_PROG_NM, T00043_n46TAM06_UPD_PROG_NM
            }
            , new Object[] {
            T00044_A21TAM06_MSG_CD, T00044_A43TAM06_CRT_DATETIME, T00044_n43TAM06_CRT_DATETIME, T00044_A125TAM06_CRT_USER_ID, T00044_n125TAM06_CRT_USER_ID, T00044_A45TAM06_UPD_DATETIME, T00044_n45TAM06_UPD_DATETIME, T00044_A80TAM06_UPD_USER_ID, T00044_n80TAM06_UPD_USER_ID, T00044_A111TAM06_UPD_CNT,
            T00044_n111TAM06_UPD_CNT, T00044_A20TAM06_MSG, T00044_n20TAM06_MSG, T00044_A110TAM06_DEL_FLG, T00044_n110TAM06_DEL_FLG, T00044_A44TAM06_CRT_PROG_NM, T00044_n44TAM06_CRT_PROG_NM, T00044_A46TAM06_UPD_PROG_NM, T00044_n46TAM06_UPD_PROG_NM
            }
            , new Object[] {
            T00045_A21TAM06_MSG_CD
            }
            , new Object[] {
            T00046_A21TAM06_MSG_CD
            }
            , new Object[] {
            T00047_A21TAM06_MSG_CD
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000411_A21TAM06_MSG_CD
            }
         }
      );
      pr_default.setErrorHandler(this);
      Z46TAM06_UPD_PROG_NM = AV14Pgmname ;
      n46TAM06_UPD_PROG_NM = false ;
      Z44TAM06_CRT_PROG_NM = AV14Pgmname ;
      n44TAM06_CRT_PROG_NM = false ;
      AV14Pgmname = "TAM06_MSG" ;
      Z110TAM06_DEL_FLG = "0" ;
      n110TAM06_DEL_FLG = false ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound4 ;
   private short Gx_err ;
   private int trnEnded ;
   private int lblBtn_cancel_Enabled ;
   private int imgImage19_Visible ;
   private int edtTAM06_MSG_CD_Enabled ;
   private int imgImage20_Visible ;
   private int edtTAM06_MSG_Enabled ;
   private int edtTAM06_CRT_DATETIME_Visible ;
   private int edtTAM06_CRT_DATETIME_Enabled ;
   private int edtTAM06_CRT_USER_ID_Enabled ;
   private int edtTAM06_CRT_PROG_NM_Visible ;
   private int edtTAM06_CRT_PROG_NM_Enabled ;
   private int edtTAM06_UPD_DATETIME_Visible ;
   private int edtTAM06_UPD_DATETIME_Enabled ;
   private int edtTAM06_UPD_USER_ID_Enabled ;
   private int edtTAM06_UPD_PROG_NM_Visible ;
   private int edtTAM06_UPD_PROG_NM_Enabled ;
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
   private int GXActiveErrHndl ;
   private int GX_JID ;
   private int idxLst ;
   private long A111TAM06_UPD_CNT ;
   private long Z111TAM06_UPD_CNT ;
   private long O111TAM06_UPD_CNT ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV14Pgmname ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTAM06_MSG_CD_Internalname ;
   private String sStyleString ;
   private String tblTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String grpGroupdata_Internalname ;
   private String tblTable1_Internalname ;
   private String tblTable4_Internalname ;
   private String lblTextblock44_Internalname ;
   private String lblTextblock44_Jsonclick ;
   private String lblTextblock45_Internalname ;
   private String lblTextblock45_Jsonclick ;
   private String lblBtn_cancel_Internalname ;
   private String lblBtn_cancel_Jsonclick ;
   private String tblTable2_Internalname ;
   private String imgImage19_Internalname ;
   private String lblTextblocktam06_msg_cd_Internalname ;
   private String lblTextblocktam06_msg_cd_Jsonclick ;
   private String TempTags ;
   private String edtTAM06_MSG_CD_Jsonclick ;
   private String imgImage20_Internalname ;
   private String lblTextblocktam06_msg_Internalname ;
   private String lblTextblocktam06_msg_Jsonclick ;
   private String edtTAM06_MSG_Internalname ;
   private String lblTextblocktam06_del_flg_Internalname ;
   private String lblTextblocktam06_del_flg_Jsonclick ;
   private String lblTextblocktam06_crt_datetime_Internalname ;
   private String lblTextblocktam06_crt_datetime_Jsonclick ;
   private String edtTAM06_CRT_DATETIME_Internalname ;
   private String edtTAM06_CRT_DATETIME_Jsonclick ;
   private String lblTextblocktam06_crt_user_id_Internalname ;
   private String lblTextblocktam06_crt_user_id_Jsonclick ;
   private String edtTAM06_CRT_USER_ID_Internalname ;
   private String edtTAM06_CRT_USER_ID_Jsonclick ;
   private String lblTextblocktam06_crt_prog_nm_Internalname ;
   private String lblTextblocktam06_crt_prog_nm_Jsonclick ;
   private String edtTAM06_CRT_PROG_NM_Internalname ;
   private String edtTAM06_CRT_PROG_NM_Jsonclick ;
   private String lblTextblocktam06_upd_datetime_Internalname ;
   private String lblTextblocktam06_upd_datetime_Jsonclick ;
   private String edtTAM06_UPD_DATETIME_Internalname ;
   private String edtTAM06_UPD_DATETIME_Jsonclick ;
   private String lblTextblocktam06_upd_user_id_Internalname ;
   private String lblTextblocktam06_upd_user_id_Jsonclick ;
   private String edtTAM06_UPD_USER_ID_Internalname ;
   private String edtTAM06_UPD_USER_ID_Jsonclick ;
   private String lblTextblocktam06_upd_prog_nm_Internalname ;
   private String lblTextblocktam06_upd_prog_nm_Jsonclick ;
   private String edtTAM06_UPD_PROG_NM_Internalname ;
   private String edtTAM06_UPD_PROG_NM_Jsonclick ;
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
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String GXEncryptionTmp ;
   private String GXv_char3[] ;
   private String sMode4 ;
   private String sDynURL ;
   private String FormProcess ;
   private String GXt_char2 ;
   private String GXt_char1 ;
   private String GXv_char5[] ;
   private String GXt_char6 ;
   private String ZV14Pgmname ;
   private String Gx_emsg ;
   private java.util.Date A43TAM06_CRT_DATETIME ;
   private java.util.Date A45TAM06_UPD_DATETIME ;
   private java.util.Date Z43TAM06_CRT_DATETIME ;
   private java.util.Date Z45TAM06_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean n20TAM06_MSG ;
   private boolean n110TAM06_DEL_FLG ;
   private boolean n43TAM06_CRT_DATETIME ;
   private boolean n125TAM06_CRT_USER_ID ;
   private boolean n44TAM06_CRT_PROG_NM ;
   private boolean n45TAM06_UPD_DATETIME ;
   private boolean n80TAM06_UPD_USER_ID ;
   private boolean n46TAM06_UPD_PROG_NM ;
   private boolean n111TAM06_UPD_CNT ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String A21TAM06_MSG_CD ;
   private String A20TAM06_MSG ;
   private String A110TAM06_DEL_FLG ;
   private String A125TAM06_CRT_USER_ID ;
   private String A44TAM06_CRT_PROG_NM ;
   private String A80TAM06_UPD_USER_ID ;
   private String A46TAM06_UPD_PROG_NM ;
   private String Z21TAM06_MSG_CD ;
   private String Z125TAM06_CRT_USER_ID ;
   private String Z80TAM06_UPD_USER_ID ;
   private String Z20TAM06_MSG ;
   private String Z110TAM06_DEL_FLG ;
   private String Z44TAM06_CRT_PROG_NM ;
   private String Z46TAM06_UPD_PROG_NM ;
   private String AV7C_TAM02_APP_ID ;
   private String AV9W_ERRCD ;
   private String AV12W_MSG ;
   private String AV10W_KNGN_FLG ;
   private String i110TAM06_DEL_FLG ;
   private String i44TAM06_CRT_PROG_NM ;
   private String i46TAM06_UPD_PROG_NM ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private HTMLChoice radTAM06_DEL_FLG ;
   private IDataStoreProvider pr_default ;
   private String[] T00044_A21TAM06_MSG_CD ;
   private java.util.Date[] T00044_A43TAM06_CRT_DATETIME ;
   private boolean[] T00044_n43TAM06_CRT_DATETIME ;
   private String[] T00044_A125TAM06_CRT_USER_ID ;
   private boolean[] T00044_n125TAM06_CRT_USER_ID ;
   private java.util.Date[] T00044_A45TAM06_UPD_DATETIME ;
   private boolean[] T00044_n45TAM06_UPD_DATETIME ;
   private String[] T00044_A80TAM06_UPD_USER_ID ;
   private boolean[] T00044_n80TAM06_UPD_USER_ID ;
   private long[] T00044_A111TAM06_UPD_CNT ;
   private boolean[] T00044_n111TAM06_UPD_CNT ;
   private String[] T00044_A20TAM06_MSG ;
   private boolean[] T00044_n20TAM06_MSG ;
   private String[] T00044_A110TAM06_DEL_FLG ;
   private boolean[] T00044_n110TAM06_DEL_FLG ;
   private String[] T00044_A44TAM06_CRT_PROG_NM ;
   private boolean[] T00044_n44TAM06_CRT_PROG_NM ;
   private String[] T00044_A46TAM06_UPD_PROG_NM ;
   private boolean[] T00044_n46TAM06_UPD_PROG_NM ;
   private String[] T00045_A21TAM06_MSG_CD ;
   private String[] T00043_A21TAM06_MSG_CD ;
   private java.util.Date[] T00043_A43TAM06_CRT_DATETIME ;
   private boolean[] T00043_n43TAM06_CRT_DATETIME ;
   private String[] T00043_A125TAM06_CRT_USER_ID ;
   private boolean[] T00043_n125TAM06_CRT_USER_ID ;
   private java.util.Date[] T00043_A45TAM06_UPD_DATETIME ;
   private boolean[] T00043_n45TAM06_UPD_DATETIME ;
   private String[] T00043_A80TAM06_UPD_USER_ID ;
   private boolean[] T00043_n80TAM06_UPD_USER_ID ;
   private long[] T00043_A111TAM06_UPD_CNT ;
   private boolean[] T00043_n111TAM06_UPD_CNT ;
   private String[] T00043_A20TAM06_MSG ;
   private boolean[] T00043_n20TAM06_MSG ;
   private String[] T00043_A110TAM06_DEL_FLG ;
   private boolean[] T00043_n110TAM06_DEL_FLG ;
   private String[] T00043_A44TAM06_CRT_PROG_NM ;
   private boolean[] T00043_n44TAM06_CRT_PROG_NM ;
   private String[] T00043_A46TAM06_UPD_PROG_NM ;
   private boolean[] T00043_n46TAM06_UPD_PROG_NM ;
   private String[] T00046_A21TAM06_MSG_CD ;
   private String[] T00047_A21TAM06_MSG_CD ;
   private String[] T00042_A21TAM06_MSG_CD ;
   private java.util.Date[] T00042_A43TAM06_CRT_DATETIME ;
   private boolean[] T00042_n43TAM06_CRT_DATETIME ;
   private String[] T00042_A125TAM06_CRT_USER_ID ;
   private boolean[] T00042_n125TAM06_CRT_USER_ID ;
   private java.util.Date[] T00042_A45TAM06_UPD_DATETIME ;
   private boolean[] T00042_n45TAM06_UPD_DATETIME ;
   private String[] T00042_A80TAM06_UPD_USER_ID ;
   private boolean[] T00042_n80TAM06_UPD_USER_ID ;
   private long[] T00042_A111TAM06_UPD_CNT ;
   private boolean[] T00042_n111TAM06_UPD_CNT ;
   private String[] T00042_A20TAM06_MSG ;
   private boolean[] T00042_n20TAM06_MSG ;
   private String[] T00042_A110TAM06_DEL_FLG ;
   private boolean[] T00042_n110TAM06_DEL_FLG ;
   private String[] T00042_A44TAM06_CRT_PROG_NM ;
   private boolean[] T00042_n44TAM06_CRT_PROG_NM ;
   private String[] T00042_A46TAM06_UPD_PROG_NM ;
   private boolean[] T00042_n46TAM06_UPD_PROG_NM ;
   private String[] T000411_A21TAM06_MSG_CD ;
   private SdtA_LOGIN_SDT AV8W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT4[] ;
}

final  class tam06_msg__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00042", "SELECT `TAM06_MSG_CD`, `TAM06_CRT_DATETIME`, `TAM06_CRT_USER_ID`, `TAM06_UPD_DATETIME`, `TAM06_UPD_USER_ID`, `TAM06_UPD_CNT`, `TAM06_MSG`, `TAM06_DEL_FLG`, `TAM06_CRT_PROG_NM`, `TAM06_UPD_PROG_NM` FROM `TAM06_MSG` WHERE `TAM06_MSG_CD` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00043", "SELECT `TAM06_MSG_CD`, `TAM06_CRT_DATETIME`, `TAM06_CRT_USER_ID`, `TAM06_UPD_DATETIME`, `TAM06_UPD_USER_ID`, `TAM06_UPD_CNT`, `TAM06_MSG`, `TAM06_DEL_FLG`, `TAM06_CRT_PROG_NM`, `TAM06_UPD_PROG_NM` FROM `TAM06_MSG` WHERE `TAM06_MSG_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00044", "SELECT TM1.`TAM06_MSG_CD`, TM1.`TAM06_CRT_DATETIME`, TM1.`TAM06_CRT_USER_ID`, TM1.`TAM06_UPD_DATETIME`, TM1.`TAM06_UPD_USER_ID`, TM1.`TAM06_UPD_CNT`, TM1.`TAM06_MSG`, TM1.`TAM06_DEL_FLG`, TM1.`TAM06_CRT_PROG_NM`, TM1.`TAM06_UPD_PROG_NM` FROM `TAM06_MSG` TM1 WHERE TM1.`TAM06_MSG_CD` = ? ORDER BY TM1.`TAM06_MSG_CD` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("T00045", "SELECT `TAM06_MSG_CD` FROM `TAM06_MSG` WHERE `TAM06_MSG_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00046", "SELECT `TAM06_MSG_CD` FROM `TAM06_MSG` WHERE ( `TAM06_MSG_CD` > ?) ORDER BY `TAM06_MSG_CD`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T00047", "SELECT `TAM06_MSG_CD` FROM `TAM06_MSG` WHERE ( `TAM06_MSG_CD` < ?) ORDER BY `TAM06_MSG_CD` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T00048", "INSERT INTO `TAM06_MSG` (`TAM06_MSG_CD`, `TAM06_CRT_DATETIME`, `TAM06_CRT_USER_ID`, `TAM06_UPD_DATETIME`, `TAM06_UPD_USER_ID`, `TAM06_UPD_CNT`, `TAM06_MSG`, `TAM06_DEL_FLG`, `TAM06_CRT_PROG_NM`, `TAM06_UPD_PROG_NM`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T00049", "UPDATE `TAM06_MSG` SET `TAM06_CRT_DATETIME`=?, `TAM06_CRT_USER_ID`=?, `TAM06_UPD_DATETIME`=?, `TAM06_UPD_USER_ID`=?, `TAM06_UPD_CNT`=?, `TAM06_MSG`=?, `TAM06_DEL_FLG`=?, `TAM06_CRT_PROG_NM`=?, `TAM06_UPD_PROG_NM`=?  WHERE `TAM06_MSG_CD` = ?", GX_NOMASK)
         ,new UpdateCursor("T000410", "DELETE FROM `TAM06_MSG`  WHERE `TAM06_MSG_CD` = ?", GX_NOMASK)
         ,new ForEachCursor("T000411", "SELECT `TAM06_MSG_CD` FROM `TAM06_MSG` ORDER BY `TAM06_MSG_CD` ",true, GX_NOMASK, false, this,10,0,false )
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
               break;
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
               ((String[]) buf[13])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
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
               stmt.setVarchar(1, (String)parms[0], 7, false);
               break;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 7, false);
               break;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 7, false);
               break;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 7, false);
               break;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 7, false);
               break;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 7, false);
               break;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 7, false);
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
                  stmt.setVarchar(7, (String)parms[12], 1000);
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
                  stmt.setVarchar(6, (String)parms[11], 1000);
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
               stmt.setVarchar(10, (String)parms[18], 7, false);
               break;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 7, false);
               break;
      }
   }

}

