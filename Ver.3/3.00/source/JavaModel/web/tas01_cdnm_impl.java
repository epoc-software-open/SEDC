/*
               File: tas01_cdnm_impl
        Description: 項目名称マスタ
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:18:31.73
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tas01_cdnm_impl extends GXWebPanel
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action33") == 0 )
      {
         AV14Pgmname = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A7TAS01_DATA_KIND = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A7TAS01_DATA_KIND", A7TAS01_DATA_KIND);
         A8TAS01_ITEM_CD = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8TAS01_ITEM_CD", A8TAS01_ITEM_CD);
         A9TAS01_ITEM_NM = httpContext.GetNextPar( ) ;
         n9TAS01_ITEM_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9TAS01_ITEM_NM", A9TAS01_ITEM_NM);
         A247TAS01_ITEM_RYAK = httpContext.GetNextPar( ) ;
         n247TAS01_ITEM_RYAK = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A247TAS01_ITEM_RYAK", A247TAS01_ITEM_RYAK);
         A300TAS01_DEL_FLG = httpContext.GetNextPar( ) ;
         n300TAS01_DEL_FLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A300TAS01_DEL_FLG", A300TAS01_DEL_FLG);
         A241TAS01_CRT_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
         n241TAS01_CRT_DATETIME = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A241TAS01_CRT_DATETIME", localUtil.ttoc( A241TAS01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         A269TAS01_CRT_USER_ID = httpContext.GetNextPar( ) ;
         n269TAS01_CRT_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A269TAS01_CRT_USER_ID", A269TAS01_CRT_USER_ID);
         A243TAS01_CRT_PROG_NM = httpContext.GetNextPar( ) ;
         n243TAS01_CRT_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A243TAS01_CRT_PROG_NM", A243TAS01_CRT_PROG_NM);
         A244TAS01_UPD_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
         n244TAS01_UPD_DATETIME = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A244TAS01_UPD_DATETIME", localUtil.ttoc( A244TAS01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         A270TAS01_UPD_USER_ID = httpContext.GetNextPar( ) ;
         n270TAS01_UPD_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A270TAS01_UPD_USER_ID", A270TAS01_UPD_USER_ID);
         A246TAS01_UPD_PROG_NM = httpContext.GetNextPar( ) ;
         n246TAS01_UPD_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A246TAS01_UPD_PROG_NM", A246TAS01_UPD_PROG_NM);
         A301TAS01_UPD_CNT = GXutil.lval( httpContext.GetNextPar( )) ;
         n301TAS01_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A301TAS01_UPD_CNT", GXutil.ltrim( GXutil.str( A301TAS01_UPD_CNT, 10, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_33_055( AV14Pgmname, Gx_mode, A7TAS01_DATA_KIND, A8TAS01_ITEM_CD, A9TAS01_ITEM_NM, A247TAS01_ITEM_RYAK, A300TAS01_DEL_FLG, A241TAS01_CRT_DATETIME, A269TAS01_CRT_USER_ID, A243TAS01_CRT_PROG_NM, A244TAS01_UPD_DATETIME, A270TAS01_UPD_USER_ID, A246TAS01_UPD_PROG_NM, A301TAS01_UPD_CNT) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action34") == 0 )
      {
         AV14Pgmname = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A7TAS01_DATA_KIND = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A7TAS01_DATA_KIND", A7TAS01_DATA_KIND);
         A8TAS01_ITEM_CD = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8TAS01_ITEM_CD", A8TAS01_ITEM_CD);
         A9TAS01_ITEM_NM = httpContext.GetNextPar( ) ;
         n9TAS01_ITEM_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9TAS01_ITEM_NM", A9TAS01_ITEM_NM);
         A247TAS01_ITEM_RYAK = httpContext.GetNextPar( ) ;
         n247TAS01_ITEM_RYAK = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A247TAS01_ITEM_RYAK", A247TAS01_ITEM_RYAK);
         A300TAS01_DEL_FLG = httpContext.GetNextPar( ) ;
         n300TAS01_DEL_FLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A300TAS01_DEL_FLG", A300TAS01_DEL_FLG);
         A241TAS01_CRT_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
         n241TAS01_CRT_DATETIME = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A241TAS01_CRT_DATETIME", localUtil.ttoc( A241TAS01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         A269TAS01_CRT_USER_ID = httpContext.GetNextPar( ) ;
         n269TAS01_CRT_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A269TAS01_CRT_USER_ID", A269TAS01_CRT_USER_ID);
         A243TAS01_CRT_PROG_NM = httpContext.GetNextPar( ) ;
         n243TAS01_CRT_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A243TAS01_CRT_PROG_NM", A243TAS01_CRT_PROG_NM);
         A244TAS01_UPD_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
         n244TAS01_UPD_DATETIME = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A244TAS01_UPD_DATETIME", localUtil.ttoc( A244TAS01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         A270TAS01_UPD_USER_ID = httpContext.GetNextPar( ) ;
         n270TAS01_UPD_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A270TAS01_UPD_USER_ID", A270TAS01_UPD_USER_ID);
         A246TAS01_UPD_PROG_NM = httpContext.GetNextPar( ) ;
         n246TAS01_UPD_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A246TAS01_UPD_PROG_NM", A246TAS01_UPD_PROG_NM);
         A301TAS01_UPD_CNT = GXutil.lval( httpContext.GetNextPar( )) ;
         n301TAS01_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A301TAS01_UPD_CNT", GXutil.ltrim( GXutil.str( A301TAS01_UPD_CNT, 10, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_34_055( AV14Pgmname, Gx_mode, A7TAS01_DATA_KIND, A8TAS01_ITEM_CD, A9TAS01_ITEM_NM, A247TAS01_ITEM_RYAK, A300TAS01_DEL_FLG, A241TAS01_CRT_DATETIME, A269TAS01_CRT_USER_ID, A243TAS01_CRT_PROG_NM, A244TAS01_UPD_DATETIME, A270TAS01_UPD_USER_ID, A246TAS01_UPD_PROG_NM, A301TAS01_UPD_CNT) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action35") == 0 )
      {
         AV14Pgmname = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A7TAS01_DATA_KIND = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A7TAS01_DATA_KIND", A7TAS01_DATA_KIND);
         A8TAS01_ITEM_CD = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8TAS01_ITEM_CD", A8TAS01_ITEM_CD);
         A9TAS01_ITEM_NM = httpContext.GetNextPar( ) ;
         n9TAS01_ITEM_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9TAS01_ITEM_NM", A9TAS01_ITEM_NM);
         A247TAS01_ITEM_RYAK = httpContext.GetNextPar( ) ;
         n247TAS01_ITEM_RYAK = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A247TAS01_ITEM_RYAK", A247TAS01_ITEM_RYAK);
         A300TAS01_DEL_FLG = httpContext.GetNextPar( ) ;
         n300TAS01_DEL_FLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A300TAS01_DEL_FLG", A300TAS01_DEL_FLG);
         A241TAS01_CRT_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
         n241TAS01_CRT_DATETIME = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A241TAS01_CRT_DATETIME", localUtil.ttoc( A241TAS01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         A269TAS01_CRT_USER_ID = httpContext.GetNextPar( ) ;
         n269TAS01_CRT_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A269TAS01_CRT_USER_ID", A269TAS01_CRT_USER_ID);
         A243TAS01_CRT_PROG_NM = httpContext.GetNextPar( ) ;
         n243TAS01_CRT_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A243TAS01_CRT_PROG_NM", A243TAS01_CRT_PROG_NM);
         A244TAS01_UPD_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
         n244TAS01_UPD_DATETIME = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A244TAS01_UPD_DATETIME", localUtil.ttoc( A244TAS01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         A270TAS01_UPD_USER_ID = httpContext.GetNextPar( ) ;
         n270TAS01_UPD_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A270TAS01_UPD_USER_ID", A270TAS01_UPD_USER_ID);
         A246TAS01_UPD_PROG_NM = httpContext.GetNextPar( ) ;
         n246TAS01_UPD_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A246TAS01_UPD_PROG_NM", A246TAS01_UPD_PROG_NM);
         A301TAS01_UPD_CNT = GXutil.lval( httpContext.GetNextPar( )) ;
         n301TAS01_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A301TAS01_UPD_CNT", GXutil.ltrim( GXutil.str( A301TAS01_UPD_CNT, 10, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_35_055( AV14Pgmname, Gx_mode, A7TAS01_DATA_KIND, A8TAS01_ITEM_CD, A9TAS01_ITEM_NM, A247TAS01_ITEM_RYAK, A300TAS01_DEL_FLG, A241TAS01_CRT_DATETIME, A269TAS01_CRT_USER_ID, A243TAS01_CRT_PROG_NM, A244TAS01_UPD_DATETIME, A270TAS01_UPD_USER_ID, A246TAS01_UPD_PROG_NM, A301TAS01_UPD_CNT) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel7"+"_"+"TAS01_CRT_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx7asatas01_crt_user_id055( Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel9"+"_"+"TAS01_UPD_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx9asatas01_upd_user_id055( Gx_mode) ;
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
      radTAS01_DEL_FLG.setName( "TAS01_DEL_FLG" );
      radTAS01_DEL_FLG.setWebtags( "" );
      radTAS01_DEL_FLG.addItem("0", "利用可能", (short)(0));
      radTAS01_DEL_FLG.addItem("1", "利用不可", (short)(0));
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 10_3_3-92797", (short)(0)) ;
         Form.getMeta().addItem("description", "項目名称マスタ", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTAS01_DATA_KIND_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Style2");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tas01_cdnm_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tas01_cdnm_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tas01_cdnm_impl.class ));
   }

   public tas01_cdnm_impl( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      radTAS01_DEL_FLG = new HTMLChoice();
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
         /* Event 'Enter' not assigned to any button. */
         /* Form start */
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
         wb_table1_2_055( true) ;
      }
      return  ;
   }

   public void wb_table1_2_055e( boolean wbgen )
   {
      if ( wbgen )
      {
         renderHtmlCloseForm055( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void wb_table1_2_055( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableBorder100x100", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_055( true) ;
      }
      return  ;
   }

   public void wb_table2_5_055e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Control Group */
         GxWebStd.gx_group_start( httpContext, grpGroupdata_Internalname, "項目名称マスタ", 1, 0, "px", 0, "px", "Group", "", "HLP_TAS01_CDNM.htm");
         wb_table3_28_055( true) ;
      }
      return  ;
   }

   public void wb_table3_28_055e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_055e( true) ;
      }
      else
      {
         wb_table1_2_055e( false) ;
      }
   }

   public void wb_table3_28_055( boolean wbgen )
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
         wb_table4_34_055( true) ;
      }
      return  ;
   }

   public void wb_table4_34_055e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table5_161_055( true) ;
      }
      return  ;
   }

   public void wb_table5_161_055e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_28_055e( true) ;
      }
      else
      {
         wb_table3_28_055e( false) ;
      }
   }

   public void wb_table5_161_055( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock44_Internalname, "実行", "", "", lblTextblock44_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", "", "TextBlockBtn060", 5, "", 1, 1, (short)(0), "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "&nbsp;") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock45_Internalname, "クリア", "", "", lblTextblock45_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_CLER\\'."+"'", "", "TextBlockBtn060", 5, "", 1, 1, (short)(0), "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "&nbsp;") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_cancel_Internalname, "終了", "", "", lblBtn_cancel_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", "", "TextBlockBtn060", 5, "", 1, lblBtn_cancel_Enabled, (short)(0), "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_161_055e( true) ;
      }
      else
      {
         wb_table5_161_055e( false) ;
      }
   }

   public void wb_table4_34_055( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable2_Internalname, tblTable2_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:110px\">") ;
         /* Static images/pictures */
         ClassString = "ImageRequiredMark" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage19_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgImage19_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, "HLP_TAS01_CDNM.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktas01_data_kind_Internalname, "データ種類", "", "", lblTextblocktas01_data_kind_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAS01_DATA_KIND_Internalname, GXutil.rtrim( A7TAS01_DATA_KIND), GXutil.rtrim( localUtil.format( A7TAS01_DATA_KIND, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAS01_DATA_KIND_Jsonclick, 0, "AttributeImeOff", "", "", "", 1, edtTAS01_DATA_KIND_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top\">") ;
         /* Static images/pictures */
         ClassString = "ImageRequiredMark" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage20_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgImage20_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, "HLP_TAS01_CDNM.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktas01_item_cd_Internalname, "項目コード", "", "", lblTextblocktas01_item_cd_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAS01_ITEM_CD_Internalname, GXutil.rtrim( A8TAS01_ITEM_CD), GXutil.rtrim( localUtil.format( A8TAS01_ITEM_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAS01_ITEM_CD_Jsonclick, 0, "AttributeImeOff", "", "", "", 1, edtTAS01_ITEM_CD_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top\">") ;
         /* Static images/pictures */
         ClassString = "ImageRequiredMark" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage21_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgImage21_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, "HLP_TAS01_CDNM.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktas01_item_nm_Internalname, "項目名称", "", "", lblTextblocktas01_item_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAS01_ITEM_NM_Internalname, GXutil.rtrim( A9TAS01_ITEM_NM), GXutil.rtrim( localUtil.format( A9TAS01_ITEM_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(52);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAS01_ITEM_NM_Jsonclick, 0, "AttributeImeOn", "", "", "", 1, edtTAS01_ITEM_NM_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktas01_item_ryak_Internalname, "項目略称", "", "", lblTextblocktas01_item_ryak_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAS01_ITEM_RYAK_Internalname, GXutil.rtrim( A247TAS01_ITEM_RYAK), GXutil.rtrim( localUtil.format( A247TAS01_ITEM_RYAK, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAS01_ITEM_RYAK_Jsonclick, 0, "AttributeImeOn", "", "", "", 1, edtTAS01_ITEM_RYAK_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktas01_item_ryak2_Internalname, "データ種類名", "", "", lblTextblocktas01_item_ryak2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAS01_DATA_KIND_NM_Internalname, GXutil.rtrim( A334TAS01_DATA_KIND_NM), GXutil.rtrim( localUtil.format( A334TAS01_DATA_KIND_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(62);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAS01_DATA_KIND_NM_Jsonclick, 0, "AttributeImeOn", "", "", "", 1, edtTAS01_DATA_KIND_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktas01_item_ryak3_Internalname, "表示順", "", "", lblTextblocktas01_item_ryak3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAS01_SORT_NO_Internalname, GXutil.ltrim( localUtil.ntoc( A335TAS01_SORT_NO, (byte)(3), (byte)(0), ".", "")), ((edtTAS01_SORT_NO_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A335TAS01_SORT_NO), "ZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A335TAS01_SORT_NO), "ZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(67);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAS01_SORT_NO_Jsonclick, 0, "AttributeNum", "", "", "", 1, edtTAS01_SORT_NO_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktas01_item_ryak4_Internalname, "予備項目（文字１）", "", "", lblTextblocktas01_item_ryak4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAS01_CHAR_1_Internalname, GXutil.rtrim( A336TAS01_CHAR_1), GXutil.rtrim( localUtil.format( A336TAS01_CHAR_1, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(72);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAS01_CHAR_1_Jsonclick, 0, "AttributeImeOn", "", "", "", 1, edtTAS01_CHAR_1_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktas01_item_ryak6_Internalname, "予備項目（文字２）", "", "", lblTextblocktas01_item_ryak6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAS01_CHAR_2_Internalname, GXutil.rtrim( A337TAS01_CHAR_2), GXutil.rtrim( localUtil.format( A337TAS01_CHAR_2, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(77);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAS01_CHAR_2_Jsonclick, 0, "AttributeImeOn", "", "", "", 1, edtTAS01_CHAR_2_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktas01_item_ryak7_Internalname, "予備項目（文字３）", "", "", lblTextblocktas01_item_ryak7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAS01_CHAR_3_Internalname, GXutil.rtrim( A338TAS01_CHAR_3), GXutil.rtrim( localUtil.format( A338TAS01_CHAR_3, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(82);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAS01_CHAR_3_Jsonclick, 0, "AttributeImeOn", "", "", "", 1, edtTAS01_CHAR_3_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktas01_item_ryak8_Internalname, "予備項目（文字４）", "", "", lblTextblocktas01_item_ryak8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAS01_CHAR_4_Internalname, GXutil.rtrim( A339TAS01_CHAR_4), GXutil.rtrim( localUtil.format( A339TAS01_CHAR_4, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(87);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAS01_CHAR_4_Jsonclick, 0, "AttributeImeOn", "", "", "", 1, edtTAS01_CHAR_4_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktas01_item_ryak9_Internalname, "予備項目（文字５）", "", "", lblTextblocktas01_item_ryak9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 92,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAS01_CHAR_5_Internalname, GXutil.rtrim( A340TAS01_CHAR_5), GXutil.rtrim( localUtil.format( A340TAS01_CHAR_5, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(92);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAS01_CHAR_5_Jsonclick, 0, "AttributeImeOn", "", "", "", 1, edtTAS01_CHAR_5_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktas01_item_ryak5_Internalname, "予備項目（数値１）", "", "", lblTextblocktas01_item_ryak5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAS01_NUM_1_Internalname, GXutil.ltrim( localUtil.ntoc( A341TAS01_NUM_1, (byte)(18), (byte)(4), ".", "")), ((edtTAS01_NUM_1_Enabled!=0) ? GXutil.ltrim( localUtil.format( A341TAS01_NUM_1, "ZZZZZZZZZZZZ9.9999")) : localUtil.format( A341TAS01_NUM_1, "ZZZZZZZZZZZZ9.9999")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_decimal( this, ',','.','4');"+";gx.evt.onblur(97);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAS01_NUM_1_Jsonclick, 0, "AttributeNum", "", "", "", 1, edtTAS01_NUM_1_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktas01_item_ryak10_Internalname, "予備項目（数値２）", "", "", lblTextblocktas01_item_ryak10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 102,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAS01_NUM_2_Internalname, GXutil.ltrim( localUtil.ntoc( A342TAS01_NUM_2, (byte)(18), (byte)(4), ".", "")), ((edtTAS01_NUM_2_Enabled!=0) ? GXutil.ltrim( localUtil.format( A342TAS01_NUM_2, "ZZZZZZZZZZZZ9.9999")) : localUtil.format( A342TAS01_NUM_2, "ZZZZZZZZZZZZ9.9999")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_decimal( this, ',','.','4');"+";gx.evt.onblur(102);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAS01_NUM_2_Jsonclick, 0, "AttributeNum", "", "", "", 1, edtTAS01_NUM_2_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktas01_item_ryak11_Internalname, "予備項目（数値３）", "", "", lblTextblocktas01_item_ryak11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 107,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAS01_NUM_3_Internalname, GXutil.ltrim( localUtil.ntoc( A343TAS01_NUM_3, (byte)(18), (byte)(4), ".", "")), ((edtTAS01_NUM_3_Enabled!=0) ? GXutil.ltrim( localUtil.format( A343TAS01_NUM_3, "ZZZZZZZZZZZZ9.9999")) : localUtil.format( A343TAS01_NUM_3, "ZZZZZZZZZZZZ9.9999")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_decimal( this, ',','.','4');"+";gx.evt.onblur(107);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAS01_NUM_3_Jsonclick, 0, "AttributeNum", "", "", "", 1, edtTAS01_NUM_3_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktas01_item_ryak12_Internalname, "予備項目（数値４）", "", "", lblTextblocktas01_item_ryak12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 112,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAS01_NUM_4_Internalname, GXutil.ltrim( localUtil.ntoc( A344TAS01_NUM_4, (byte)(18), (byte)(4), ".", "")), ((edtTAS01_NUM_4_Enabled!=0) ? GXutil.ltrim( localUtil.format( A344TAS01_NUM_4, "ZZZZZZZZZZZZ9.9999")) : localUtil.format( A344TAS01_NUM_4, "ZZZZZZZZZZZZ9.9999")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_decimal( this, ',','.','4');"+";gx.evt.onblur(112);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAS01_NUM_4_Jsonclick, 0, "AttributeNum", "", "", "", 1, edtTAS01_NUM_4_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktas01_item_ryak13_Internalname, "予備項目（数値５）", "", "", lblTextblocktas01_item_ryak13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 117,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAS01_NUM_5_Internalname, GXutil.ltrim( localUtil.ntoc( A345TAS01_NUM_5, (byte)(18), (byte)(4), ".", "")), ((edtTAS01_NUM_5_Enabled!=0) ? GXutil.ltrim( localUtil.format( A345TAS01_NUM_5, "ZZZZZZZZZZZZ9.9999")) : localUtil.format( A345TAS01_NUM_5, "ZZZZZZZZZZZZ9.9999")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_decimal( this, ',','.','4');"+";gx.evt.onblur(117);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAS01_NUM_5_Jsonclick, 0, "AttributeNum", "", "", "", 1, edtTAS01_NUM_5_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktas01_del_flg_Internalname, "削除フラグ", "", "", lblTextblocktas01_del_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Radio button */
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 122,'',false,'',0)\"" ;
         GxWebStd.gx_radio_ctrl( httpContext, radTAS01_DEL_FLG, radTAS01_DEL_FLG.getInternalname(), GXutil.rtrim( A300TAS01_DEL_FLG), "", 1, radTAS01_DEL_FLG.getEnabled(), 0, 0, StyleString, ClassString, "", 0, radTAS01_DEL_FLG.getJsonclick(), "'"+""+"'"+",false,"+"'"+""+"'", TempTags+" onclick=\"gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(122);\"", "HLP_TAS01_CDNM.htm");
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
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktas01_crt_datetime_Internalname, "作成日時", "", "", lblTextblocktas01_crt_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtTAS01_CRT_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAS01_CRT_DATETIME_Internalname, localUtil.format(A241TAS01_CRT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A241TAS01_CRT_DATETIME, "9999/99/99 99:99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAS01_CRT_DATETIME_Jsonclick, 0, "ReadonlyAttribute", "", "", "", edtTAS01_CRT_DATETIME_Visible, edtTAS01_CRT_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TAS01_CDNM.htm");
         GxWebStd.gx_bitmap( httpContext, edtTAS01_CRT_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtTAS01_CRT_DATETIME_Visible==0)||(edtTAS01_CRT_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TAS01_CDNM.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktas01_crt_user_id_Internalname, "作成ユーザーID", "", "", lblTextblocktas01_crt_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         GxWebStd.gx_single_line_edit( httpContext, edtTAS01_CRT_USER_ID_Internalname, GXutil.rtrim( A269TAS01_CRT_USER_ID), GXutil.rtrim( localUtil.format( A269TAS01_CRT_USER_ID, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAS01_CRT_USER_ID_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTAS01_CRT_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_USER_ID", "left", "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktas01_crt_prog_nm_Internalname, "作成プログラム名", "", "", lblTextblocktas01_crt_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         GxWebStd.gx_single_line_edit( httpContext, edtTAS01_CRT_PROG_NM_Internalname, GXutil.rtrim( A243TAS01_CRT_PROG_NM), GXutil.rtrim( localUtil.format( A243TAS01_CRT_PROG_NM, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAS01_CRT_PROG_NM_Jsonclick, 0, "ReadonlyAttribute", "", "", "", edtTAS01_CRT_PROG_NM_Visible, edtTAS01_CRT_PROG_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_PG_NM", "left", "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktas01_upd_datetime_Internalname, "更新日時", "", "", lblTextblocktas01_upd_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtTAS01_UPD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAS01_UPD_DATETIME_Internalname, localUtil.format(A244TAS01_UPD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A244TAS01_UPD_DATETIME, "9999/99/99 99:99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAS01_UPD_DATETIME_Jsonclick, 0, "ReadonlyAttribute", "", "", "", edtTAS01_UPD_DATETIME_Visible, edtTAS01_UPD_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TAS01_CDNM.htm");
         GxWebStd.gx_bitmap( httpContext, edtTAS01_UPD_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtTAS01_UPD_DATETIME_Visible==0)||(edtTAS01_UPD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TAS01_CDNM.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktas01_upd_user_id_Internalname, "更新ユーザーID", "", "", lblTextblocktas01_upd_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         GxWebStd.gx_single_line_edit( httpContext, edtTAS01_UPD_USER_ID_Internalname, GXutil.rtrim( A270TAS01_UPD_USER_ID), GXutil.rtrim( localUtil.format( A270TAS01_UPD_USER_ID, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAS01_UPD_USER_ID_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTAS01_UPD_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_USER_ID", "left", "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktas01_upd_prog_nm_Internalname, "更新プログラム名", "", "", lblTextblocktas01_upd_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         GxWebStd.gx_single_line_edit( httpContext, edtTAS01_UPD_PROG_NM_Internalname, GXutil.rtrim( A246TAS01_UPD_PROG_NM), GXutil.rtrim( localUtil.format( A246TAS01_UPD_PROG_NM, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAS01_UPD_PROG_NM_Jsonclick, 0, "ReadonlyAttribute", "", "", "", edtTAS01_UPD_PROG_NM_Visible, edtTAS01_UPD_PROG_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_PG_NM", "left", "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top\">") ;
         httpContext.writeText( "&nbsp;") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_34_055e( true) ;
      }
      else
      {
         wb_table4_34_055e( false) ;
      }
   }

   public void wb_table2_5_055( boolean wbgen )
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
         GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "ToolbarMain", "");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAS01_CDNM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAS01_CDNM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAS01_CDNM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAS01_CDNM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAS01_CDNM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAS01_CDNM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAS01_CDNM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAS01_CDNM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_SELECT\\'."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAS01_CDNM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAS01_CDNM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAS01_CDNM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAS01_CDNM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAS01_CDNM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAS01_CDNM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAS01_CDNM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAS01_CDNM.htm");
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
         wb_table2_5_055e( true) ;
      }
      else
      {
         wb_table2_5_055e( false) ;
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
      /* Execute user event: e11052 */
      e11052 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            A7TAS01_DATA_KIND = httpContext.cgiGet( edtTAS01_DATA_KIND_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7TAS01_DATA_KIND", A7TAS01_DATA_KIND);
            A8TAS01_ITEM_CD = httpContext.cgiGet( edtTAS01_ITEM_CD_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8TAS01_ITEM_CD", A8TAS01_ITEM_CD);
            A9TAS01_ITEM_NM = httpContext.cgiGet( edtTAS01_ITEM_NM_Internalname) ;
            n9TAS01_ITEM_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9TAS01_ITEM_NM", A9TAS01_ITEM_NM);
            n9TAS01_ITEM_NM = ((GXutil.strcmp("", A9TAS01_ITEM_NM)==0) ? true : false) ;
            A247TAS01_ITEM_RYAK = httpContext.cgiGet( edtTAS01_ITEM_RYAK_Internalname) ;
            n247TAS01_ITEM_RYAK = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A247TAS01_ITEM_RYAK", A247TAS01_ITEM_RYAK);
            n247TAS01_ITEM_RYAK = ((GXutil.strcmp("", A247TAS01_ITEM_RYAK)==0) ? true : false) ;
            A334TAS01_DATA_KIND_NM = httpContext.cgiGet( edtTAS01_DATA_KIND_NM_Internalname) ;
            n334TAS01_DATA_KIND_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A334TAS01_DATA_KIND_NM", A334TAS01_DATA_KIND_NM);
            n334TAS01_DATA_KIND_NM = ((GXutil.strcmp("", A334TAS01_DATA_KIND_NM)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTAS01_SORT_NO_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTAS01_SORT_NO_Internalname), ".", ",") > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TAS01_SORT_NO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTAS01_SORT_NO_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A335TAS01_SORT_NO = (short)(0) ;
               n335TAS01_SORT_NO = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A335TAS01_SORT_NO", GXutil.ltrim( GXutil.str( A335TAS01_SORT_NO, 3, 0)));
            }
            else
            {
               A335TAS01_SORT_NO = (short)(localUtil.ctol( httpContext.cgiGet( edtTAS01_SORT_NO_Internalname), ".", ",")) ;
               n335TAS01_SORT_NO = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A335TAS01_SORT_NO", GXutil.ltrim( GXutil.str( A335TAS01_SORT_NO, 3, 0)));
            }
            n335TAS01_SORT_NO = ((0==A335TAS01_SORT_NO) ? true : false) ;
            A336TAS01_CHAR_1 = httpContext.cgiGet( edtTAS01_CHAR_1_Internalname) ;
            n336TAS01_CHAR_1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A336TAS01_CHAR_1", A336TAS01_CHAR_1);
            n336TAS01_CHAR_1 = ((GXutil.strcmp("", A336TAS01_CHAR_1)==0) ? true : false) ;
            A337TAS01_CHAR_2 = httpContext.cgiGet( edtTAS01_CHAR_2_Internalname) ;
            n337TAS01_CHAR_2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A337TAS01_CHAR_2", A337TAS01_CHAR_2);
            n337TAS01_CHAR_2 = ((GXutil.strcmp("", A337TAS01_CHAR_2)==0) ? true : false) ;
            A338TAS01_CHAR_3 = httpContext.cgiGet( edtTAS01_CHAR_3_Internalname) ;
            n338TAS01_CHAR_3 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A338TAS01_CHAR_3", A338TAS01_CHAR_3);
            n338TAS01_CHAR_3 = ((GXutil.strcmp("", A338TAS01_CHAR_3)==0) ? true : false) ;
            A339TAS01_CHAR_4 = httpContext.cgiGet( edtTAS01_CHAR_4_Internalname) ;
            n339TAS01_CHAR_4 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A339TAS01_CHAR_4", A339TAS01_CHAR_4);
            n339TAS01_CHAR_4 = ((GXutil.strcmp("", A339TAS01_CHAR_4)==0) ? true : false) ;
            A340TAS01_CHAR_5 = httpContext.cgiGet( edtTAS01_CHAR_5_Internalname) ;
            n340TAS01_CHAR_5 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A340TAS01_CHAR_5", A340TAS01_CHAR_5);
            n340TAS01_CHAR_5 = ((GXutil.strcmp("", A340TAS01_CHAR_5)==0) ? true : false) ;
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTAS01_NUM_1_Internalname)).compareTo(DecimalUtil.doubleToDec(-999999999999.9999,18,4)) < 0 ) ) || ( ( localUtil.ctond( httpContext.cgiGet( edtTAS01_NUM_1_Internalname)).compareTo(DecimalUtil.doubleToDec(9999999999999.9999,18,4)) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TAS01_NUM_1");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTAS01_NUM_1_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A341TAS01_NUM_1 = DecimalUtil.ZERO ;
               n341TAS01_NUM_1 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A341TAS01_NUM_1", GXutil.ltrim( GXutil.str( A341TAS01_NUM_1, 18, 4)));
            }
            else
            {
               A341TAS01_NUM_1 = localUtil.ctond( httpContext.cgiGet( edtTAS01_NUM_1_Internalname)) ;
               n341TAS01_NUM_1 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A341TAS01_NUM_1", GXutil.ltrim( GXutil.str( A341TAS01_NUM_1, 18, 4)));
            }
            n341TAS01_NUM_1 = ((DecimalUtil.ZERO.compareTo(A341TAS01_NUM_1)==0) ? true : false) ;
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTAS01_NUM_2_Internalname)).compareTo(DecimalUtil.doubleToDec(-999999999999.9999,18,4)) < 0 ) ) || ( ( localUtil.ctond( httpContext.cgiGet( edtTAS01_NUM_2_Internalname)).compareTo(DecimalUtil.doubleToDec(9999999999999.9999,18,4)) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TAS01_NUM_2");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTAS01_NUM_2_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A342TAS01_NUM_2 = DecimalUtil.ZERO ;
               n342TAS01_NUM_2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A342TAS01_NUM_2", GXutil.ltrim( GXutil.str( A342TAS01_NUM_2, 18, 4)));
            }
            else
            {
               A342TAS01_NUM_2 = localUtil.ctond( httpContext.cgiGet( edtTAS01_NUM_2_Internalname)) ;
               n342TAS01_NUM_2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A342TAS01_NUM_2", GXutil.ltrim( GXutil.str( A342TAS01_NUM_2, 18, 4)));
            }
            n342TAS01_NUM_2 = ((DecimalUtil.ZERO.compareTo(A342TAS01_NUM_2)==0) ? true : false) ;
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTAS01_NUM_3_Internalname)).compareTo(DecimalUtil.doubleToDec(-999999999999.9999,18,4)) < 0 ) ) || ( ( localUtil.ctond( httpContext.cgiGet( edtTAS01_NUM_3_Internalname)).compareTo(DecimalUtil.doubleToDec(9999999999999.9999,18,4)) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TAS01_NUM_3");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTAS01_NUM_3_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A343TAS01_NUM_3 = DecimalUtil.ZERO ;
               n343TAS01_NUM_3 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A343TAS01_NUM_3", GXutil.ltrim( GXutil.str( A343TAS01_NUM_3, 18, 4)));
            }
            else
            {
               A343TAS01_NUM_3 = localUtil.ctond( httpContext.cgiGet( edtTAS01_NUM_3_Internalname)) ;
               n343TAS01_NUM_3 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A343TAS01_NUM_3", GXutil.ltrim( GXutil.str( A343TAS01_NUM_3, 18, 4)));
            }
            n343TAS01_NUM_3 = ((DecimalUtil.ZERO.compareTo(A343TAS01_NUM_3)==0) ? true : false) ;
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTAS01_NUM_4_Internalname)).compareTo(DecimalUtil.doubleToDec(-999999999999.9999,18,4)) < 0 ) ) || ( ( localUtil.ctond( httpContext.cgiGet( edtTAS01_NUM_4_Internalname)).compareTo(DecimalUtil.doubleToDec(9999999999999.9999,18,4)) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TAS01_NUM_4");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTAS01_NUM_4_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A344TAS01_NUM_4 = DecimalUtil.ZERO ;
               n344TAS01_NUM_4 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A344TAS01_NUM_4", GXutil.ltrim( GXutil.str( A344TAS01_NUM_4, 18, 4)));
            }
            else
            {
               A344TAS01_NUM_4 = localUtil.ctond( httpContext.cgiGet( edtTAS01_NUM_4_Internalname)) ;
               n344TAS01_NUM_4 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A344TAS01_NUM_4", GXutil.ltrim( GXutil.str( A344TAS01_NUM_4, 18, 4)));
            }
            n344TAS01_NUM_4 = ((DecimalUtil.ZERO.compareTo(A344TAS01_NUM_4)==0) ? true : false) ;
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTAS01_NUM_5_Internalname)).compareTo(DecimalUtil.doubleToDec(-999999999999.9999,18,4)) < 0 ) ) || ( ( localUtil.ctond( httpContext.cgiGet( edtTAS01_NUM_5_Internalname)).compareTo(DecimalUtil.doubleToDec(9999999999999.9999,18,4)) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TAS01_NUM_5");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTAS01_NUM_5_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A345TAS01_NUM_5 = DecimalUtil.ZERO ;
               n345TAS01_NUM_5 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A345TAS01_NUM_5", GXutil.ltrim( GXutil.str( A345TAS01_NUM_5, 18, 4)));
            }
            else
            {
               A345TAS01_NUM_5 = localUtil.ctond( httpContext.cgiGet( edtTAS01_NUM_5_Internalname)) ;
               n345TAS01_NUM_5 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A345TAS01_NUM_5", GXutil.ltrim( GXutil.str( A345TAS01_NUM_5, 18, 4)));
            }
            n345TAS01_NUM_5 = ((DecimalUtil.ZERO.compareTo(A345TAS01_NUM_5)==0) ? true : false) ;
            A300TAS01_DEL_FLG = httpContext.cgiGet( radTAS01_DEL_FLG.getInternalname()) ;
            n300TAS01_DEL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A300TAS01_DEL_FLG", A300TAS01_DEL_FLG);
            n300TAS01_DEL_FLG = ((GXutil.strcmp("", A300TAS01_DEL_FLG)==0) ? true : false) ;
            A241TAS01_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTAS01_CRT_DATETIME_Internalname)) ;
            n241TAS01_CRT_DATETIME = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A241TAS01_CRT_DATETIME", localUtil.ttoc( A241TAS01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            A269TAS01_CRT_USER_ID = httpContext.cgiGet( edtTAS01_CRT_USER_ID_Internalname) ;
            n269TAS01_CRT_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A269TAS01_CRT_USER_ID", A269TAS01_CRT_USER_ID);
            A243TAS01_CRT_PROG_NM = httpContext.cgiGet( edtTAS01_CRT_PROG_NM_Internalname) ;
            n243TAS01_CRT_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A243TAS01_CRT_PROG_NM", A243TAS01_CRT_PROG_NM);
            A244TAS01_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTAS01_UPD_DATETIME_Internalname)) ;
            n244TAS01_UPD_DATETIME = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A244TAS01_UPD_DATETIME", localUtil.ttoc( A244TAS01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            A270TAS01_UPD_USER_ID = httpContext.cgiGet( edtTAS01_UPD_USER_ID_Internalname) ;
            n270TAS01_UPD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A270TAS01_UPD_USER_ID", A270TAS01_UPD_USER_ID);
            A246TAS01_UPD_PROG_NM = httpContext.cgiGet( edtTAS01_UPD_PROG_NM_Internalname) ;
            n246TAS01_UPD_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A246TAS01_UPD_PROG_NM", A246TAS01_UPD_PROG_NM);
            /* Read saved values. */
            Z7TAS01_DATA_KIND = httpContext.cgiGet( "Z7TAS01_DATA_KIND") ;
            Z8TAS01_ITEM_CD = httpContext.cgiGet( "Z8TAS01_ITEM_CD") ;
            Z241TAS01_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z241TAS01_CRT_DATETIME"), 0) ;
            n241TAS01_CRT_DATETIME = (GXutil.nullDate().equals(A241TAS01_CRT_DATETIME) ? true : false) ;
            Z269TAS01_CRT_USER_ID = httpContext.cgiGet( "Z269TAS01_CRT_USER_ID") ;
            n269TAS01_CRT_USER_ID = ((GXutil.strcmp("", A269TAS01_CRT_USER_ID)==0) ? true : false) ;
            Z244TAS01_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z244TAS01_UPD_DATETIME"), 0) ;
            n244TAS01_UPD_DATETIME = (GXutil.nullDate().equals(A244TAS01_UPD_DATETIME) ? true : false) ;
            Z270TAS01_UPD_USER_ID = httpContext.cgiGet( "Z270TAS01_UPD_USER_ID") ;
            n270TAS01_UPD_USER_ID = ((GXutil.strcmp("", A270TAS01_UPD_USER_ID)==0) ? true : false) ;
            Z301TAS01_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z301TAS01_UPD_CNT"), ".", ",") ;
            n301TAS01_UPD_CNT = ((0==A301TAS01_UPD_CNT) ? true : false) ;
            Z9TAS01_ITEM_NM = httpContext.cgiGet( "Z9TAS01_ITEM_NM") ;
            n9TAS01_ITEM_NM = ((GXutil.strcmp("", A9TAS01_ITEM_NM)==0) ? true : false) ;
            Z247TAS01_ITEM_RYAK = httpContext.cgiGet( "Z247TAS01_ITEM_RYAK") ;
            n247TAS01_ITEM_RYAK = ((GXutil.strcmp("", A247TAS01_ITEM_RYAK)==0) ? true : false) ;
            Z334TAS01_DATA_KIND_NM = httpContext.cgiGet( "Z334TAS01_DATA_KIND_NM") ;
            n334TAS01_DATA_KIND_NM = ((GXutil.strcmp("", A334TAS01_DATA_KIND_NM)==0) ? true : false) ;
            Z335TAS01_SORT_NO = (short)(localUtil.ctol( httpContext.cgiGet( "Z335TAS01_SORT_NO"), ".", ",")) ;
            n335TAS01_SORT_NO = ((0==A335TAS01_SORT_NO) ? true : false) ;
            Z336TAS01_CHAR_1 = httpContext.cgiGet( "Z336TAS01_CHAR_1") ;
            n336TAS01_CHAR_1 = ((GXutil.strcmp("", A336TAS01_CHAR_1)==0) ? true : false) ;
            Z337TAS01_CHAR_2 = httpContext.cgiGet( "Z337TAS01_CHAR_2") ;
            n337TAS01_CHAR_2 = ((GXutil.strcmp("", A337TAS01_CHAR_2)==0) ? true : false) ;
            Z338TAS01_CHAR_3 = httpContext.cgiGet( "Z338TAS01_CHAR_3") ;
            n338TAS01_CHAR_3 = ((GXutil.strcmp("", A338TAS01_CHAR_3)==0) ? true : false) ;
            Z339TAS01_CHAR_4 = httpContext.cgiGet( "Z339TAS01_CHAR_4") ;
            n339TAS01_CHAR_4 = ((GXutil.strcmp("", A339TAS01_CHAR_4)==0) ? true : false) ;
            Z340TAS01_CHAR_5 = httpContext.cgiGet( "Z340TAS01_CHAR_5") ;
            n340TAS01_CHAR_5 = ((GXutil.strcmp("", A340TAS01_CHAR_5)==0) ? true : false) ;
            Z341TAS01_NUM_1 = localUtil.ctond( httpContext.cgiGet( "Z341TAS01_NUM_1")) ;
            n341TAS01_NUM_1 = ((DecimalUtil.ZERO.compareTo(A341TAS01_NUM_1)==0) ? true : false) ;
            Z342TAS01_NUM_2 = localUtil.ctond( httpContext.cgiGet( "Z342TAS01_NUM_2")) ;
            n342TAS01_NUM_2 = ((DecimalUtil.ZERO.compareTo(A342TAS01_NUM_2)==0) ? true : false) ;
            Z343TAS01_NUM_3 = localUtil.ctond( httpContext.cgiGet( "Z343TAS01_NUM_3")) ;
            n343TAS01_NUM_3 = ((DecimalUtil.ZERO.compareTo(A343TAS01_NUM_3)==0) ? true : false) ;
            Z344TAS01_NUM_4 = localUtil.ctond( httpContext.cgiGet( "Z344TAS01_NUM_4")) ;
            n344TAS01_NUM_4 = ((DecimalUtil.ZERO.compareTo(A344TAS01_NUM_4)==0) ? true : false) ;
            Z345TAS01_NUM_5 = localUtil.ctond( httpContext.cgiGet( "Z345TAS01_NUM_5")) ;
            n345TAS01_NUM_5 = ((DecimalUtil.ZERO.compareTo(A345TAS01_NUM_5)==0) ? true : false) ;
            Z300TAS01_DEL_FLG = httpContext.cgiGet( "Z300TAS01_DEL_FLG") ;
            n300TAS01_DEL_FLG = ((GXutil.strcmp("", A300TAS01_DEL_FLG)==0) ? true : false) ;
            Z243TAS01_CRT_PROG_NM = httpContext.cgiGet( "Z243TAS01_CRT_PROG_NM") ;
            n243TAS01_CRT_PROG_NM = ((GXutil.strcmp("", A243TAS01_CRT_PROG_NM)==0) ? true : false) ;
            Z246TAS01_UPD_PROG_NM = httpContext.cgiGet( "Z246TAS01_UPD_PROG_NM") ;
            n246TAS01_UPD_PROG_NM = ((GXutil.strcmp("", A246TAS01_UPD_PROG_NM)==0) ? true : false) ;
            A301TAS01_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z301TAS01_UPD_CNT"), ".", ",") ;
            n301TAS01_UPD_CNT = false ;
            n301TAS01_UPD_CNT = ((0==A301TAS01_UPD_CNT) ? true : false) ;
            O301TAS01_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "O301TAS01_UPD_CNT"), ".", ",") ;
            n301TAS01_UPD_CNT = ((0==A301TAS01_UPD_CNT) ? true : false) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ".", ",")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ".", ",")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            A301TAS01_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "TAS01_UPD_CNT"), ".", ",") ;
            n301TAS01_UPD_CNT = ((0==A301TAS01_UPD_CNT) ? true : false) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), ".", ",")) ;
            AV14Pgmname = httpContext.cgiGet( "vPGMNAME") ;
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
               A7TAS01_DATA_KIND = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A7TAS01_DATA_KIND", A7TAS01_DATA_KIND);
               A8TAS01_ITEM_CD = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8TAS01_ITEM_CD", A8TAS01_ITEM_CD);
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
                     /* Execute user event: e11052 */
                     e11052 ();
                  }
                  else if ( GXutil.strcmp(sEvt, "'BTN_SELECT'") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     dynload_actions( ) ;
                     /* Execute user event: e12052 */
                     e12052 ();
                  }
                  else if ( GXutil.strcmp(sEvt, "'BTN_CLER'") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     dynload_actions( ) ;
                     /* Execute user event: e13052 */
                     e13052 ();
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
            initAll055( ) ;
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
      disableAttributes055( ) ;
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

   public void confirm_050( )
   {
      beforeValidate055( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls055( ) ;
         }
         else
         {
            checkExtendedTable055( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors055( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      }
      if ( AnyError == 0 )
      {
         confirmValues050( ) ;
      }
   }

   public void resetCaption050( )
   {
   }

   public void e11052( )
   {
      /* Start Routine */
      AV7C_TAM02_APP_ID = "TAS01" ;
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
      GXt_char1 = AV12W_MSG ;
      GXv_char2[0] = GXt_char1 ;
      new a805_pc01_msg_get(remoteHandle, context).execute( "AG00005", "", "", "", "", "", GXv_char2) ;
      tas01_cdnm_impl.this.GXt_char1 = GXv_char2[0] ;
      AV12W_MSG = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12W_MSG", AV12W_MSG);
      imgBtn_delete2_Jsonclick = "confirm('"+AV12W_MSG+"')" ;
      httpContext.ajax_rsp_assign_prop("", false, imgBtn_delete2_Internalname, "Jsonclick", imgBtn_delete2_Jsonclick);
   }

   public void e12052( )
   {
      /* 'BTN_SELECT' Routine */
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "tas01_sel"+GXutil.URLEncode(GXutil.rtrim(A7TAS01_DATA_KIND)) + "," + GXutil.URLEncode(GXutil.rtrim(A8TAS01_ITEM_CD)) ;
      httpContext.popup(formatLink("tas01_sel") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey), new Object[] {"A7TAS01_DATA_KIND","A8TAS01_ITEM_CD"});
   }

   public void e13052( )
   {
      /* 'BTN_CLER' Routine */
      httpContext.wjLoc = formatLink("tas01_cdnm")  ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT3[0] = AV8W_A_LOGIN_SDT;
      GXv_char2[0] = AV9W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT3, GXv_char2) ;
      AV8W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT3[0] ;
      tas01_cdnm_impl.this.AV9W_ERRCD = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9W_ERRCD", AV9W_ERRCD);
      if ( GXutil.strcmp(AV9W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("1")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      Form.getJscriptsrc().add("js/acom.js") ;
   }

   public void S122( )
   {
      /* 'SUB_AP_CHECK' Routine */
      GXv_char2[0] = AV10W_KNGN_FLG ;
      GXv_char4[0] = AV9W_ERRCD ;
      new a402_pc01_kengen_check(remoteHandle, context).execute( AV7C_TAM02_APP_ID, GXv_char2, GXv_char4) ;
      tas01_cdnm_impl.this.AV10W_KNGN_FLG = GXv_char2[0] ;
      tas01_cdnm_impl.this.AV9W_ERRCD = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7C_TAM02_APP_ID", AV7C_TAM02_APP_ID);
      httpContext.ajax_rsp_assign_attri("", false, "AV10W_KNGN_FLG", AV10W_KNGN_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "AV9W_ERRCD", AV9W_ERRCD);
      if ( GXutil.strcmp(AV9W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("2")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void S132( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV14Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void zm055( int GX_JID )
   {
      if ( ( GX_JID == 36 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z241TAS01_CRT_DATETIME = T00053_A241TAS01_CRT_DATETIME[0] ;
            Z269TAS01_CRT_USER_ID = T00053_A269TAS01_CRT_USER_ID[0] ;
            Z244TAS01_UPD_DATETIME = T00053_A244TAS01_UPD_DATETIME[0] ;
            Z270TAS01_UPD_USER_ID = T00053_A270TAS01_UPD_USER_ID[0] ;
            Z301TAS01_UPD_CNT = T00053_A301TAS01_UPD_CNT[0] ;
            Z9TAS01_ITEM_NM = T00053_A9TAS01_ITEM_NM[0] ;
            Z247TAS01_ITEM_RYAK = T00053_A247TAS01_ITEM_RYAK[0] ;
            Z334TAS01_DATA_KIND_NM = T00053_A334TAS01_DATA_KIND_NM[0] ;
            Z335TAS01_SORT_NO = T00053_A335TAS01_SORT_NO[0] ;
            Z336TAS01_CHAR_1 = T00053_A336TAS01_CHAR_1[0] ;
            Z337TAS01_CHAR_2 = T00053_A337TAS01_CHAR_2[0] ;
            Z338TAS01_CHAR_3 = T00053_A338TAS01_CHAR_3[0] ;
            Z339TAS01_CHAR_4 = T00053_A339TAS01_CHAR_4[0] ;
            Z340TAS01_CHAR_5 = T00053_A340TAS01_CHAR_5[0] ;
            Z341TAS01_NUM_1 = T00053_A341TAS01_NUM_1[0] ;
            Z342TAS01_NUM_2 = T00053_A342TAS01_NUM_2[0] ;
            Z343TAS01_NUM_3 = T00053_A343TAS01_NUM_3[0] ;
            Z344TAS01_NUM_4 = T00053_A344TAS01_NUM_4[0] ;
            Z345TAS01_NUM_5 = T00053_A345TAS01_NUM_5[0] ;
            Z300TAS01_DEL_FLG = T00053_A300TAS01_DEL_FLG[0] ;
            Z243TAS01_CRT_PROG_NM = T00053_A243TAS01_CRT_PROG_NM[0] ;
            Z246TAS01_UPD_PROG_NM = T00053_A246TAS01_UPD_PROG_NM[0] ;
         }
         else
         {
            Z241TAS01_CRT_DATETIME = A241TAS01_CRT_DATETIME ;
            Z269TAS01_CRT_USER_ID = A269TAS01_CRT_USER_ID ;
            Z244TAS01_UPD_DATETIME = A244TAS01_UPD_DATETIME ;
            Z270TAS01_UPD_USER_ID = A270TAS01_UPD_USER_ID ;
            Z301TAS01_UPD_CNT = A301TAS01_UPD_CNT ;
            Z9TAS01_ITEM_NM = A9TAS01_ITEM_NM ;
            Z247TAS01_ITEM_RYAK = A247TAS01_ITEM_RYAK ;
            Z334TAS01_DATA_KIND_NM = A334TAS01_DATA_KIND_NM ;
            Z335TAS01_SORT_NO = A335TAS01_SORT_NO ;
            Z336TAS01_CHAR_1 = A336TAS01_CHAR_1 ;
            Z337TAS01_CHAR_2 = A337TAS01_CHAR_2 ;
            Z338TAS01_CHAR_3 = A338TAS01_CHAR_3 ;
            Z339TAS01_CHAR_4 = A339TAS01_CHAR_4 ;
            Z340TAS01_CHAR_5 = A340TAS01_CHAR_5 ;
            Z341TAS01_NUM_1 = A341TAS01_NUM_1 ;
            Z342TAS01_NUM_2 = A342TAS01_NUM_2 ;
            Z343TAS01_NUM_3 = A343TAS01_NUM_3 ;
            Z344TAS01_NUM_4 = A344TAS01_NUM_4 ;
            Z345TAS01_NUM_5 = A345TAS01_NUM_5 ;
            Z300TAS01_DEL_FLG = A300TAS01_DEL_FLG ;
            Z243TAS01_CRT_PROG_NM = A243TAS01_CRT_PROG_NM ;
            Z246TAS01_UPD_PROG_NM = A246TAS01_UPD_PROG_NM ;
         }
      }
      if ( GX_JID == -36 )
      {
         Z7TAS01_DATA_KIND = A7TAS01_DATA_KIND ;
         Z8TAS01_ITEM_CD = A8TAS01_ITEM_CD ;
         Z241TAS01_CRT_DATETIME = A241TAS01_CRT_DATETIME ;
         Z269TAS01_CRT_USER_ID = A269TAS01_CRT_USER_ID ;
         Z244TAS01_UPD_DATETIME = A244TAS01_UPD_DATETIME ;
         Z270TAS01_UPD_USER_ID = A270TAS01_UPD_USER_ID ;
         Z301TAS01_UPD_CNT = A301TAS01_UPD_CNT ;
         Z9TAS01_ITEM_NM = A9TAS01_ITEM_NM ;
         Z247TAS01_ITEM_RYAK = A247TAS01_ITEM_RYAK ;
         Z334TAS01_DATA_KIND_NM = A334TAS01_DATA_KIND_NM ;
         Z335TAS01_SORT_NO = A335TAS01_SORT_NO ;
         Z336TAS01_CHAR_1 = A336TAS01_CHAR_1 ;
         Z337TAS01_CHAR_2 = A337TAS01_CHAR_2 ;
         Z338TAS01_CHAR_3 = A338TAS01_CHAR_3 ;
         Z339TAS01_CHAR_4 = A339TAS01_CHAR_4 ;
         Z340TAS01_CHAR_5 = A340TAS01_CHAR_5 ;
         Z341TAS01_NUM_1 = A341TAS01_NUM_1 ;
         Z342TAS01_NUM_2 = A342TAS01_NUM_2 ;
         Z343TAS01_NUM_3 = A343TAS01_NUM_3 ;
         Z344TAS01_NUM_4 = A344TAS01_NUM_4 ;
         Z345TAS01_NUM_5 = A345TAS01_NUM_5 ;
         Z300TAS01_DEL_FLG = A300TAS01_DEL_FLG ;
         Z243TAS01_CRT_PROG_NM = A243TAS01_CRT_PROG_NM ;
         Z246TAS01_UPD_PROG_NM = A246TAS01_UPD_PROG_NM ;
      }
   }

   public void standaloneNotModal( )
   {
      edtTAS01_CRT_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAS01_CRT_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAS01_CRT_DATETIME_Enabled, 5, 0)));
      edtTAS01_CRT_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAS01_CRT_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAS01_CRT_USER_ID_Enabled, 5, 0)));
      edtTAS01_CRT_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAS01_CRT_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAS01_CRT_PROG_NM_Enabled, 5, 0)));
      edtTAS01_UPD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAS01_UPD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAS01_UPD_DATETIME_Enabled, 5, 0)));
      edtTAS01_UPD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAS01_UPD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAS01_UPD_USER_ID_Enabled, 5, 0)));
      edtTAS01_UPD_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAS01_UPD_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAS01_UPD_PROG_NM_Enabled, 5, 0)));
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtTAS01_CRT_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAS01_CRT_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAS01_CRT_DATETIME_Enabled, 5, 0)));
      edtTAS01_CRT_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAS01_CRT_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAS01_CRT_USER_ID_Enabled, 5, 0)));
      edtTAS01_CRT_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAS01_CRT_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAS01_CRT_PROG_NM_Enabled, 5, 0)));
      edtTAS01_UPD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAS01_UPD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAS01_UPD_DATETIME_Enabled, 5, 0)));
      edtTAS01_UPD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAS01_UPD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAS01_UPD_USER_ID_Enabled, 5, 0)));
      edtTAS01_UPD_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAS01_UPD_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAS01_UPD_PROG_NM_Enabled, 5, 0)));
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 )  )
      {
         edtTAS01_DATA_KIND_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTAS01_DATA_KIND_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAS01_DATA_KIND_Enabled, 5, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
      {
         edtTAS01_CRT_DATETIME_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTAS01_CRT_DATETIME_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTAS01_CRT_DATETIME_Visible, 5, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
      {
         edtTAS01_CRT_PROG_NM_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTAS01_CRT_PROG_NM_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTAS01_CRT_PROG_NM_Visible, 5, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
      {
         edtTAS01_UPD_DATETIME_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTAS01_UPD_DATETIME_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTAS01_UPD_DATETIME_Visible, 5, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
      {
         edtTAS01_UPD_PROG_NM_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTAS01_UPD_PROG_NM_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTAS01_UPD_PROG_NM_Visible, 5, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  && (GXutil.strcmp("", A300TAS01_DEL_FLG)==0) && ( Gx_BScreen == 0 ) )
      {
         A300TAS01_DEL_FLG = "0" ;
         n300TAS01_DEL_FLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A300TAS01_DEL_FLG", A300TAS01_DEL_FLG);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  && (GXutil.strcmp("", A243TAS01_CRT_PROG_NM)==0) && ( Gx_BScreen == 0 ) )
      {
         A243TAS01_CRT_PROG_NM = AV14Pgmname ;
         n243TAS01_CRT_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A243TAS01_CRT_PROG_NM", A243TAS01_CRT_PROG_NM);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  && (GXutil.strcmp("", A246TAS01_UPD_PROG_NM)==0) && ( Gx_BScreen == 0 ) )
      {
         A246TAS01_UPD_PROG_NM = AV14Pgmname ;
         n246TAS01_UPD_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A246TAS01_UPD_PROG_NM", A246TAS01_UPD_PROG_NM);
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

   public void load055( )
   {
      /* Using cursor T00054 */
      pr_default.execute(2, new Object[] {A7TAS01_DATA_KIND, A8TAS01_ITEM_CD});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound5 = (short)(1) ;
         A241TAS01_CRT_DATETIME = T00054_A241TAS01_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A241TAS01_CRT_DATETIME", localUtil.ttoc( A241TAS01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n241TAS01_CRT_DATETIME = T00054_n241TAS01_CRT_DATETIME[0] ;
         A269TAS01_CRT_USER_ID = T00054_A269TAS01_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A269TAS01_CRT_USER_ID", A269TAS01_CRT_USER_ID);
         n269TAS01_CRT_USER_ID = T00054_n269TAS01_CRT_USER_ID[0] ;
         A244TAS01_UPD_DATETIME = T00054_A244TAS01_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A244TAS01_UPD_DATETIME", localUtil.ttoc( A244TAS01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n244TAS01_UPD_DATETIME = T00054_n244TAS01_UPD_DATETIME[0] ;
         A270TAS01_UPD_USER_ID = T00054_A270TAS01_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A270TAS01_UPD_USER_ID", A270TAS01_UPD_USER_ID);
         n270TAS01_UPD_USER_ID = T00054_n270TAS01_UPD_USER_ID[0] ;
         A301TAS01_UPD_CNT = T00054_A301TAS01_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A301TAS01_UPD_CNT", GXutil.ltrim( GXutil.str( A301TAS01_UPD_CNT, 10, 0)));
         n301TAS01_UPD_CNT = T00054_n301TAS01_UPD_CNT[0] ;
         A9TAS01_ITEM_NM = T00054_A9TAS01_ITEM_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9TAS01_ITEM_NM", A9TAS01_ITEM_NM);
         n9TAS01_ITEM_NM = T00054_n9TAS01_ITEM_NM[0] ;
         A247TAS01_ITEM_RYAK = T00054_A247TAS01_ITEM_RYAK[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A247TAS01_ITEM_RYAK", A247TAS01_ITEM_RYAK);
         n247TAS01_ITEM_RYAK = T00054_n247TAS01_ITEM_RYAK[0] ;
         A334TAS01_DATA_KIND_NM = T00054_A334TAS01_DATA_KIND_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A334TAS01_DATA_KIND_NM", A334TAS01_DATA_KIND_NM);
         n334TAS01_DATA_KIND_NM = T00054_n334TAS01_DATA_KIND_NM[0] ;
         A335TAS01_SORT_NO = T00054_A335TAS01_SORT_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A335TAS01_SORT_NO", GXutil.ltrim( GXutil.str( A335TAS01_SORT_NO, 3, 0)));
         n335TAS01_SORT_NO = T00054_n335TAS01_SORT_NO[0] ;
         A336TAS01_CHAR_1 = T00054_A336TAS01_CHAR_1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A336TAS01_CHAR_1", A336TAS01_CHAR_1);
         n336TAS01_CHAR_1 = T00054_n336TAS01_CHAR_1[0] ;
         A337TAS01_CHAR_2 = T00054_A337TAS01_CHAR_2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A337TAS01_CHAR_2", A337TAS01_CHAR_2);
         n337TAS01_CHAR_2 = T00054_n337TAS01_CHAR_2[0] ;
         A338TAS01_CHAR_3 = T00054_A338TAS01_CHAR_3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A338TAS01_CHAR_3", A338TAS01_CHAR_3);
         n338TAS01_CHAR_3 = T00054_n338TAS01_CHAR_3[0] ;
         A339TAS01_CHAR_4 = T00054_A339TAS01_CHAR_4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A339TAS01_CHAR_4", A339TAS01_CHAR_4);
         n339TAS01_CHAR_4 = T00054_n339TAS01_CHAR_4[0] ;
         A340TAS01_CHAR_5 = T00054_A340TAS01_CHAR_5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A340TAS01_CHAR_5", A340TAS01_CHAR_5);
         n340TAS01_CHAR_5 = T00054_n340TAS01_CHAR_5[0] ;
         A341TAS01_NUM_1 = T00054_A341TAS01_NUM_1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A341TAS01_NUM_1", GXutil.ltrim( GXutil.str( A341TAS01_NUM_1, 18, 4)));
         n341TAS01_NUM_1 = T00054_n341TAS01_NUM_1[0] ;
         A342TAS01_NUM_2 = T00054_A342TAS01_NUM_2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A342TAS01_NUM_2", GXutil.ltrim( GXutil.str( A342TAS01_NUM_2, 18, 4)));
         n342TAS01_NUM_2 = T00054_n342TAS01_NUM_2[0] ;
         A343TAS01_NUM_3 = T00054_A343TAS01_NUM_3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A343TAS01_NUM_3", GXutil.ltrim( GXutil.str( A343TAS01_NUM_3, 18, 4)));
         n343TAS01_NUM_3 = T00054_n343TAS01_NUM_3[0] ;
         A344TAS01_NUM_4 = T00054_A344TAS01_NUM_4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A344TAS01_NUM_4", GXutil.ltrim( GXutil.str( A344TAS01_NUM_4, 18, 4)));
         n344TAS01_NUM_4 = T00054_n344TAS01_NUM_4[0] ;
         A345TAS01_NUM_5 = T00054_A345TAS01_NUM_5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A345TAS01_NUM_5", GXutil.ltrim( GXutil.str( A345TAS01_NUM_5, 18, 4)));
         n345TAS01_NUM_5 = T00054_n345TAS01_NUM_5[0] ;
         A300TAS01_DEL_FLG = T00054_A300TAS01_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A300TAS01_DEL_FLG", A300TAS01_DEL_FLG);
         n300TAS01_DEL_FLG = T00054_n300TAS01_DEL_FLG[0] ;
         A243TAS01_CRT_PROG_NM = T00054_A243TAS01_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A243TAS01_CRT_PROG_NM", A243TAS01_CRT_PROG_NM);
         n243TAS01_CRT_PROG_NM = T00054_n243TAS01_CRT_PROG_NM[0] ;
         A246TAS01_UPD_PROG_NM = T00054_A246TAS01_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A246TAS01_UPD_PROG_NM", A246TAS01_UPD_PROG_NM);
         n246TAS01_UPD_PROG_NM = T00054_n246TAS01_UPD_PROG_NM[0] ;
         zm055( -36) ;
      }
      pr_default.close(2);
      onLoadActions055( ) ;
   }

   public void onLoadActions055( )
   {
      AV14Pgmname = "TAS01_CDNM" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
   }

   public void checkExtendedTable055( )
   {
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      AV14Pgmname = "TAS01_CDNM" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
   }

   public void closeExtendedTableCursors055( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey055( )
   {
      /* Using cursor T00055 */
      pr_default.execute(3, new Object[] {A7TAS01_DATA_KIND, A8TAS01_ITEM_CD});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound5 = (short)(1) ;
      }
      else
      {
         RcdFound5 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00053 */
      pr_default.execute(1, new Object[] {A7TAS01_DATA_KIND, A8TAS01_ITEM_CD});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm055( 36) ;
         RcdFound5 = (short)(1) ;
         A7TAS01_DATA_KIND = T00053_A7TAS01_DATA_KIND[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7TAS01_DATA_KIND", A7TAS01_DATA_KIND);
         A8TAS01_ITEM_CD = T00053_A8TAS01_ITEM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8TAS01_ITEM_CD", A8TAS01_ITEM_CD);
         A241TAS01_CRT_DATETIME = T00053_A241TAS01_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A241TAS01_CRT_DATETIME", localUtil.ttoc( A241TAS01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n241TAS01_CRT_DATETIME = T00053_n241TAS01_CRT_DATETIME[0] ;
         A269TAS01_CRT_USER_ID = T00053_A269TAS01_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A269TAS01_CRT_USER_ID", A269TAS01_CRT_USER_ID);
         n269TAS01_CRT_USER_ID = T00053_n269TAS01_CRT_USER_ID[0] ;
         A244TAS01_UPD_DATETIME = T00053_A244TAS01_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A244TAS01_UPD_DATETIME", localUtil.ttoc( A244TAS01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n244TAS01_UPD_DATETIME = T00053_n244TAS01_UPD_DATETIME[0] ;
         A270TAS01_UPD_USER_ID = T00053_A270TAS01_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A270TAS01_UPD_USER_ID", A270TAS01_UPD_USER_ID);
         n270TAS01_UPD_USER_ID = T00053_n270TAS01_UPD_USER_ID[0] ;
         A301TAS01_UPD_CNT = T00053_A301TAS01_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A301TAS01_UPD_CNT", GXutil.ltrim( GXutil.str( A301TAS01_UPD_CNT, 10, 0)));
         n301TAS01_UPD_CNT = T00053_n301TAS01_UPD_CNT[0] ;
         A9TAS01_ITEM_NM = T00053_A9TAS01_ITEM_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9TAS01_ITEM_NM", A9TAS01_ITEM_NM);
         n9TAS01_ITEM_NM = T00053_n9TAS01_ITEM_NM[0] ;
         A247TAS01_ITEM_RYAK = T00053_A247TAS01_ITEM_RYAK[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A247TAS01_ITEM_RYAK", A247TAS01_ITEM_RYAK);
         n247TAS01_ITEM_RYAK = T00053_n247TAS01_ITEM_RYAK[0] ;
         A334TAS01_DATA_KIND_NM = T00053_A334TAS01_DATA_KIND_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A334TAS01_DATA_KIND_NM", A334TAS01_DATA_KIND_NM);
         n334TAS01_DATA_KIND_NM = T00053_n334TAS01_DATA_KIND_NM[0] ;
         A335TAS01_SORT_NO = T00053_A335TAS01_SORT_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A335TAS01_SORT_NO", GXutil.ltrim( GXutil.str( A335TAS01_SORT_NO, 3, 0)));
         n335TAS01_SORT_NO = T00053_n335TAS01_SORT_NO[0] ;
         A336TAS01_CHAR_1 = T00053_A336TAS01_CHAR_1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A336TAS01_CHAR_1", A336TAS01_CHAR_1);
         n336TAS01_CHAR_1 = T00053_n336TAS01_CHAR_1[0] ;
         A337TAS01_CHAR_2 = T00053_A337TAS01_CHAR_2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A337TAS01_CHAR_2", A337TAS01_CHAR_2);
         n337TAS01_CHAR_2 = T00053_n337TAS01_CHAR_2[0] ;
         A338TAS01_CHAR_3 = T00053_A338TAS01_CHAR_3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A338TAS01_CHAR_3", A338TAS01_CHAR_3);
         n338TAS01_CHAR_3 = T00053_n338TAS01_CHAR_3[0] ;
         A339TAS01_CHAR_4 = T00053_A339TAS01_CHAR_4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A339TAS01_CHAR_4", A339TAS01_CHAR_4);
         n339TAS01_CHAR_4 = T00053_n339TAS01_CHAR_4[0] ;
         A340TAS01_CHAR_5 = T00053_A340TAS01_CHAR_5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A340TAS01_CHAR_5", A340TAS01_CHAR_5);
         n340TAS01_CHAR_5 = T00053_n340TAS01_CHAR_5[0] ;
         A341TAS01_NUM_1 = T00053_A341TAS01_NUM_1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A341TAS01_NUM_1", GXutil.ltrim( GXutil.str( A341TAS01_NUM_1, 18, 4)));
         n341TAS01_NUM_1 = T00053_n341TAS01_NUM_1[0] ;
         A342TAS01_NUM_2 = T00053_A342TAS01_NUM_2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A342TAS01_NUM_2", GXutil.ltrim( GXutil.str( A342TAS01_NUM_2, 18, 4)));
         n342TAS01_NUM_2 = T00053_n342TAS01_NUM_2[0] ;
         A343TAS01_NUM_3 = T00053_A343TAS01_NUM_3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A343TAS01_NUM_3", GXutil.ltrim( GXutil.str( A343TAS01_NUM_3, 18, 4)));
         n343TAS01_NUM_3 = T00053_n343TAS01_NUM_3[0] ;
         A344TAS01_NUM_4 = T00053_A344TAS01_NUM_4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A344TAS01_NUM_4", GXutil.ltrim( GXutil.str( A344TAS01_NUM_4, 18, 4)));
         n344TAS01_NUM_4 = T00053_n344TAS01_NUM_4[0] ;
         A345TAS01_NUM_5 = T00053_A345TAS01_NUM_5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A345TAS01_NUM_5", GXutil.ltrim( GXutil.str( A345TAS01_NUM_5, 18, 4)));
         n345TAS01_NUM_5 = T00053_n345TAS01_NUM_5[0] ;
         A300TAS01_DEL_FLG = T00053_A300TAS01_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A300TAS01_DEL_FLG", A300TAS01_DEL_FLG);
         n300TAS01_DEL_FLG = T00053_n300TAS01_DEL_FLG[0] ;
         A243TAS01_CRT_PROG_NM = T00053_A243TAS01_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A243TAS01_CRT_PROG_NM", A243TAS01_CRT_PROG_NM);
         n243TAS01_CRT_PROG_NM = T00053_n243TAS01_CRT_PROG_NM[0] ;
         A246TAS01_UPD_PROG_NM = T00053_A246TAS01_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A246TAS01_UPD_PROG_NM", A246TAS01_UPD_PROG_NM);
         n246TAS01_UPD_PROG_NM = T00053_n246TAS01_UPD_PROG_NM[0] ;
         O301TAS01_UPD_CNT = A301TAS01_UPD_CNT ;
         n301TAS01_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A301TAS01_UPD_CNT", GXutil.ltrim( GXutil.str( A301TAS01_UPD_CNT, 10, 0)));
         Z7TAS01_DATA_KIND = A7TAS01_DATA_KIND ;
         Z8TAS01_ITEM_CD = A8TAS01_ITEM_CD ;
         sMode5 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load055( ) ;
         if ( AnyError == 1 )
         {
            RcdFound5 = (short)(0) ;
            initializeNonKey055( ) ;
         }
         Gx_mode = sMode5 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound5 = (short)(0) ;
         initializeNonKey055( ) ;
         sMode5 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode5 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey055( ) ;
      if ( RcdFound5 == 0 )
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
      RcdFound5 = (short)(0) ;
      /* Using cursor T00056 */
      pr_default.execute(4, new Object[] {A7TAS01_DATA_KIND, A7TAS01_DATA_KIND, A8TAS01_ITEM_CD});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T00056_A7TAS01_DATA_KIND[0], A7TAS01_DATA_KIND) < 0 ) || ( GXutil.strcmp(T00056_A7TAS01_DATA_KIND[0], A7TAS01_DATA_KIND) == 0 ) && ( GXutil.strcmp(T00056_A8TAS01_ITEM_CD[0], A8TAS01_ITEM_CD) < 0 ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T00056_A7TAS01_DATA_KIND[0], A7TAS01_DATA_KIND) > 0 ) || ( GXutil.strcmp(T00056_A7TAS01_DATA_KIND[0], A7TAS01_DATA_KIND) == 0 ) && ( GXutil.strcmp(T00056_A8TAS01_ITEM_CD[0], A8TAS01_ITEM_CD) > 0 ) ) )
         {
            A7TAS01_DATA_KIND = T00056_A7TAS01_DATA_KIND[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A7TAS01_DATA_KIND", A7TAS01_DATA_KIND);
            A8TAS01_ITEM_CD = T00056_A8TAS01_ITEM_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A8TAS01_ITEM_CD", A8TAS01_ITEM_CD);
            RcdFound5 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound5 = (short)(0) ;
      /* Using cursor T00057 */
      pr_default.execute(5, new Object[] {A7TAS01_DATA_KIND, A7TAS01_DATA_KIND, A8TAS01_ITEM_CD});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T00057_A7TAS01_DATA_KIND[0], A7TAS01_DATA_KIND) > 0 ) || ( GXutil.strcmp(T00057_A7TAS01_DATA_KIND[0], A7TAS01_DATA_KIND) == 0 ) && ( GXutil.strcmp(T00057_A8TAS01_ITEM_CD[0], A8TAS01_ITEM_CD) > 0 ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T00057_A7TAS01_DATA_KIND[0], A7TAS01_DATA_KIND) < 0 ) || ( GXutil.strcmp(T00057_A7TAS01_DATA_KIND[0], A7TAS01_DATA_KIND) == 0 ) && ( GXutil.strcmp(T00057_A8TAS01_ITEM_CD[0], A8TAS01_ITEM_CD) < 0 ) ) )
         {
            A7TAS01_DATA_KIND = T00057_A7TAS01_DATA_KIND[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A7TAS01_DATA_KIND", A7TAS01_DATA_KIND);
            A8TAS01_ITEM_CD = T00057_A8TAS01_ITEM_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A8TAS01_ITEM_CD", A8TAS01_ITEM_CD);
            RcdFound5 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey055( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtTAS01_DATA_KIND_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert055( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound5 == 1 )
         {
            if ( ( GXutil.strcmp(A7TAS01_DATA_KIND, Z7TAS01_DATA_KIND) != 0 ) || ( GXutil.strcmp(A8TAS01_ITEM_CD, Z8TAS01_ITEM_CD) != 0 ) )
            {
               A7TAS01_DATA_KIND = Z7TAS01_DATA_KIND ;
               httpContext.ajax_rsp_assign_attri("", false, "A7TAS01_DATA_KIND", A7TAS01_DATA_KIND);
               A8TAS01_ITEM_CD = Z8TAS01_ITEM_CD ;
               httpContext.ajax_rsp_assign_attri("", false, "A8TAS01_ITEM_CD", A8TAS01_ITEM_CD);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TAS01_DATA_KIND");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTAS01_DATA_KIND_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTAS01_DATA_KIND_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update055( ) ;
               GX_FocusControl = edtTAS01_DATA_KIND_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A7TAS01_DATA_KIND, Z7TAS01_DATA_KIND) != 0 ) || ( GXutil.strcmp(A8TAS01_ITEM_CD, Z8TAS01_ITEM_CD) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTAS01_DATA_KIND_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert055( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TAS01_DATA_KIND");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTAS01_DATA_KIND_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtTAS01_DATA_KIND_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert055( ) ;
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
      if ( ( GXutil.strcmp(A7TAS01_DATA_KIND, Z7TAS01_DATA_KIND) != 0 ) || ( GXutil.strcmp(A8TAS01_ITEM_CD, Z8TAS01_ITEM_CD) != 0 ) )
      {
         A7TAS01_DATA_KIND = Z7TAS01_DATA_KIND ;
         httpContext.ajax_rsp_assign_attri("", false, "A7TAS01_DATA_KIND", A7TAS01_DATA_KIND);
         A8TAS01_ITEM_CD = Z8TAS01_ITEM_CD ;
         httpContext.ajax_rsp_assign_attri("", false, "A8TAS01_ITEM_CD", A8TAS01_ITEM_CD);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TAS01_DATA_KIND");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAS01_DATA_KIND_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTAS01_DATA_KIND_Internalname ;
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

   public void btn_check( )
   {
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      getKey055( ) ;
      if ( RcdFound5 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "TAS01_DATA_KIND");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTAS01_DATA_KIND_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A7TAS01_DATA_KIND, Z7TAS01_DATA_KIND) != 0 ) || ( GXutil.strcmp(A8TAS01_ITEM_CD, Z8TAS01_ITEM_CD) != 0 ) )
         {
            A7TAS01_DATA_KIND = Z7TAS01_DATA_KIND ;
            httpContext.ajax_rsp_assign_attri("", false, "A7TAS01_DATA_KIND", A7TAS01_DATA_KIND);
            A8TAS01_ITEM_CD = Z8TAS01_ITEM_CD ;
            httpContext.ajax_rsp_assign_attri("", false, "A8TAS01_ITEM_CD", A8TAS01_ITEM_CD);
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "TAS01_DATA_KIND");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTAS01_DATA_KIND_Internalname ;
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
         if ( ( GXutil.strcmp(A7TAS01_DATA_KIND, Z7TAS01_DATA_KIND) != 0 ) || ( GXutil.strcmp(A8TAS01_ITEM_CD, Z8TAS01_ITEM_CD) != 0 ) )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            insert_check( ) ;
         }
         else
         {
            if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TAS01_DATA_KIND");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTAS01_DATA_KIND_Internalname ;
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
      Application.rollback(context, remoteHandle, "DEFAULT", "tas01_cdnm");
      GX_FocusControl = edtTAS01_ITEM_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_050( ) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
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
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      getEqualNoModal( ) ;
      if ( RcdFound5 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TAS01_DATA_KIND");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAS01_DATA_KIND_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtTAS01_ITEM_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart055( ) ;
      if ( RcdFound5 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTAS01_ITEM_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd055( ) ;
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
      if ( RcdFound5 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTAS01_ITEM_NM_Internalname ;
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
      if ( RcdFound5 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTAS01_ITEM_NM_Internalname ;
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
      scanStart055( ) ;
      if ( RcdFound5 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound5 != 0 )
         {
            scanNext055( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTAS01_ITEM_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd055( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency055( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T00052 */
         pr_default.execute(0, new Object[] {A7TAS01_DATA_KIND, A8TAS01_ITEM_CD});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TAS01_CDNM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z241TAS01_CRT_DATETIME.equals( T00052_A241TAS01_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z269TAS01_CRT_USER_ID, T00052_A269TAS01_CRT_USER_ID[0]) != 0 ) || !( Z244TAS01_UPD_DATETIME.equals( T00052_A244TAS01_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z270TAS01_UPD_USER_ID, T00052_A270TAS01_UPD_USER_ID[0]) != 0 ) || ( Z301TAS01_UPD_CNT != T00052_A301TAS01_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z9TAS01_ITEM_NM, T00052_A9TAS01_ITEM_NM[0]) != 0 ) || ( GXutil.strcmp(Z247TAS01_ITEM_RYAK, T00052_A247TAS01_ITEM_RYAK[0]) != 0 ) || ( GXutil.strcmp(Z334TAS01_DATA_KIND_NM, T00052_A334TAS01_DATA_KIND_NM[0]) != 0 ) || ( Z335TAS01_SORT_NO != T00052_A335TAS01_SORT_NO[0] ) || ( GXutil.strcmp(Z336TAS01_CHAR_1, T00052_A336TAS01_CHAR_1[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z337TAS01_CHAR_2, T00052_A337TAS01_CHAR_2[0]) != 0 ) || ( GXutil.strcmp(Z338TAS01_CHAR_3, T00052_A338TAS01_CHAR_3[0]) != 0 ) || ( GXutil.strcmp(Z339TAS01_CHAR_4, T00052_A339TAS01_CHAR_4[0]) != 0 ) || ( GXutil.strcmp(Z340TAS01_CHAR_5, T00052_A340TAS01_CHAR_5[0]) != 0 ) || ( Z341TAS01_NUM_1.compareTo(T00052_A341TAS01_NUM_1[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z342TAS01_NUM_2.compareTo(T00052_A342TAS01_NUM_2[0]) != 0 ) || ( Z343TAS01_NUM_3.compareTo(T00052_A343TAS01_NUM_3[0]) != 0 ) || ( Z344TAS01_NUM_4.compareTo(T00052_A344TAS01_NUM_4[0]) != 0 ) || ( Z345TAS01_NUM_5.compareTo(T00052_A345TAS01_NUM_5[0]) != 0 ) || ( GXutil.strcmp(Z300TAS01_DEL_FLG, T00052_A300TAS01_DEL_FLG[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z243TAS01_CRT_PROG_NM, T00052_A243TAS01_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z246TAS01_UPD_PROG_NM, T00052_A246TAS01_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TAS01_CDNM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert055( )
   {
      beforeValidate055( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable055( ) ;
      }
      if ( AnyError == 0 )
      {
         zm055( 0) ;
         checkOptimisticConcurrency055( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm055( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert055( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00058 */
                  pr_default.execute(6, new Object[] {A7TAS01_DATA_KIND, A8TAS01_ITEM_CD, new Boolean(n241TAS01_CRT_DATETIME), A241TAS01_CRT_DATETIME, new Boolean(n269TAS01_CRT_USER_ID), A269TAS01_CRT_USER_ID, new Boolean(n244TAS01_UPD_DATETIME), A244TAS01_UPD_DATETIME, new Boolean(n270TAS01_UPD_USER_ID), A270TAS01_UPD_USER_ID, new Boolean(n301TAS01_UPD_CNT), new Long(A301TAS01_UPD_CNT), new Boolean(n9TAS01_ITEM_NM), A9TAS01_ITEM_NM, new Boolean(n247TAS01_ITEM_RYAK), A247TAS01_ITEM_RYAK, new Boolean(n334TAS01_DATA_KIND_NM), A334TAS01_DATA_KIND_NM, new Boolean(n335TAS01_SORT_NO), new Short(A335TAS01_SORT_NO), new Boolean(n336TAS01_CHAR_1), A336TAS01_CHAR_1, new Boolean(n337TAS01_CHAR_2), A337TAS01_CHAR_2, new Boolean(n338TAS01_CHAR_3), A338TAS01_CHAR_3, new Boolean(n339TAS01_CHAR_4), A339TAS01_CHAR_4, new Boolean(n340TAS01_CHAR_5), A340TAS01_CHAR_5, new Boolean(n341TAS01_NUM_1), A341TAS01_NUM_1, new Boolean(n342TAS01_NUM_2), A342TAS01_NUM_2, new Boolean(n343TAS01_NUM_3), A343TAS01_NUM_3, new Boolean(n344TAS01_NUM_4), A344TAS01_NUM_4, new Boolean(n345TAS01_NUM_5), A345TAS01_NUM_5, new Boolean(n300TAS01_DEL_FLG), A300TAS01_DEL_FLG, new Boolean(n243TAS01_CRT_PROG_NM), A243TAS01_CRT_PROG_NM, new Boolean(n246TAS01_UPD_PROG_NM), A246TAS01_UPD_PROG_NM});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TAS01_CDNM") ;
                  if ( (pr_default.getStatus(6) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     new tas01_pc01_datalog(remoteHandle, context).execute( AV14Pgmname, Gx_mode, A7TAS01_DATA_KIND, A8TAS01_ITEM_CD, A9TAS01_ITEM_NM, A247TAS01_ITEM_RYAK, A300TAS01_DEL_FLG, A241TAS01_CRT_DATETIME, A269TAS01_CRT_USER_ID, A243TAS01_CRT_PROG_NM, A244TAS01_UPD_DATETIME, A270TAS01_UPD_USER_ID, A246TAS01_UPD_PROG_NM, A301TAS01_UPD_CNT) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     httpContext.ajax_rsp_assign_attri("", false, "A7TAS01_DATA_KIND", A7TAS01_DATA_KIND);
                     httpContext.ajax_rsp_assign_attri("", false, "A8TAS01_ITEM_CD", A8TAS01_ITEM_CD);
                     httpContext.ajax_rsp_assign_attri("", false, "A9TAS01_ITEM_NM", A9TAS01_ITEM_NM);
                     httpContext.ajax_rsp_assign_attri("", false, "A247TAS01_ITEM_RYAK", A247TAS01_ITEM_RYAK);
                     httpContext.ajax_rsp_assign_attri("", false, "A300TAS01_DEL_FLG", A300TAS01_DEL_FLG);
                     httpContext.ajax_rsp_assign_attri("", false, "A241TAS01_CRT_DATETIME", localUtil.ttoc( A241TAS01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
                     httpContext.ajax_rsp_assign_attri("", false, "A269TAS01_CRT_USER_ID", A269TAS01_CRT_USER_ID);
                     httpContext.ajax_rsp_assign_attri("", false, "A243TAS01_CRT_PROG_NM", A243TAS01_CRT_PROG_NM);
                     httpContext.ajax_rsp_assign_attri("", false, "A244TAS01_UPD_DATETIME", localUtil.ttoc( A244TAS01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
                     httpContext.ajax_rsp_assign_attri("", false, "A270TAS01_UPD_USER_ID", A270TAS01_UPD_USER_ID);
                     httpContext.ajax_rsp_assign_attri("", false, "A246TAS01_UPD_PROG_NM", A246TAS01_UPD_PROG_NM);
                     httpContext.ajax_rsp_assign_attri("", false, "A301TAS01_UPD_CNT", GXutil.ltrim( GXutil.str( A301TAS01_UPD_CNT, 10, 0)));
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucadded"), 0, "", true);
                        resetCaption050( ) ;
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
            load055( ) ;
         }
         endLevel055( ) ;
      }
      closeExtendedTableCursors055( ) ;
   }

   public void update055( )
   {
      beforeValidate055( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable055( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency055( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm055( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate055( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00059 */
                  pr_default.execute(7, new Object[] {new Boolean(n241TAS01_CRT_DATETIME), A241TAS01_CRT_DATETIME, new Boolean(n269TAS01_CRT_USER_ID), A269TAS01_CRT_USER_ID, new Boolean(n244TAS01_UPD_DATETIME), A244TAS01_UPD_DATETIME, new Boolean(n270TAS01_UPD_USER_ID), A270TAS01_UPD_USER_ID, new Boolean(n301TAS01_UPD_CNT), new Long(A301TAS01_UPD_CNT), new Boolean(n9TAS01_ITEM_NM), A9TAS01_ITEM_NM, new Boolean(n247TAS01_ITEM_RYAK), A247TAS01_ITEM_RYAK, new Boolean(n334TAS01_DATA_KIND_NM), A334TAS01_DATA_KIND_NM, new Boolean(n335TAS01_SORT_NO), new Short(A335TAS01_SORT_NO), new Boolean(n336TAS01_CHAR_1), A336TAS01_CHAR_1, new Boolean(n337TAS01_CHAR_2), A337TAS01_CHAR_2, new Boolean(n338TAS01_CHAR_3), A338TAS01_CHAR_3, new Boolean(n339TAS01_CHAR_4), A339TAS01_CHAR_4, new Boolean(n340TAS01_CHAR_5), A340TAS01_CHAR_5, new Boolean(n341TAS01_NUM_1), A341TAS01_NUM_1, new Boolean(n342TAS01_NUM_2), A342TAS01_NUM_2, new Boolean(n343TAS01_NUM_3), A343TAS01_NUM_3, new Boolean(n344TAS01_NUM_4), A344TAS01_NUM_4, new Boolean(n345TAS01_NUM_5), A345TAS01_NUM_5, new Boolean(n300TAS01_DEL_FLG), A300TAS01_DEL_FLG, new Boolean(n243TAS01_CRT_PROG_NM), A243TAS01_CRT_PROG_NM, new Boolean(n246TAS01_UPD_PROG_NM), A246TAS01_UPD_PROG_NM, A7TAS01_DATA_KIND, A8TAS01_ITEM_CD});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TAS01_CDNM") ;
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TAS01_CDNM"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate055( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     new tas01_pc01_datalog(remoteHandle, context).execute( AV14Pgmname, Gx_mode, A7TAS01_DATA_KIND, A8TAS01_ITEM_CD, A9TAS01_ITEM_NM, A247TAS01_ITEM_RYAK, A300TAS01_DEL_FLG, A241TAS01_CRT_DATETIME, A269TAS01_CRT_USER_ID, A243TAS01_CRT_PROG_NM, A244TAS01_UPD_DATETIME, A270TAS01_UPD_USER_ID, A246TAS01_UPD_PROG_NM, A301TAS01_UPD_CNT) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     httpContext.ajax_rsp_assign_attri("", false, "A7TAS01_DATA_KIND", A7TAS01_DATA_KIND);
                     httpContext.ajax_rsp_assign_attri("", false, "A8TAS01_ITEM_CD", A8TAS01_ITEM_CD);
                     httpContext.ajax_rsp_assign_attri("", false, "A9TAS01_ITEM_NM", A9TAS01_ITEM_NM);
                     httpContext.ajax_rsp_assign_attri("", false, "A247TAS01_ITEM_RYAK", A247TAS01_ITEM_RYAK);
                     httpContext.ajax_rsp_assign_attri("", false, "A300TAS01_DEL_FLG", A300TAS01_DEL_FLG);
                     httpContext.ajax_rsp_assign_attri("", false, "A241TAS01_CRT_DATETIME", localUtil.ttoc( A241TAS01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
                     httpContext.ajax_rsp_assign_attri("", false, "A269TAS01_CRT_USER_ID", A269TAS01_CRT_USER_ID);
                     httpContext.ajax_rsp_assign_attri("", false, "A243TAS01_CRT_PROG_NM", A243TAS01_CRT_PROG_NM);
                     httpContext.ajax_rsp_assign_attri("", false, "A244TAS01_UPD_DATETIME", localUtil.ttoc( A244TAS01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
                     httpContext.ajax_rsp_assign_attri("", false, "A270TAS01_UPD_USER_ID", A270TAS01_UPD_USER_ID);
                     httpContext.ajax_rsp_assign_attri("", false, "A246TAS01_UPD_PROG_NM", A246TAS01_UPD_PROG_NM);
                     httpContext.ajax_rsp_assign_attri("", false, "A301TAS01_UPD_CNT", GXutil.ltrim( GXutil.str( A301TAS01_UPD_CNT, 10, 0)));
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "", true);
                        resetCaption050( ) ;
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
         endLevel055( ) ;
      }
      closeExtendedTableCursors055( ) ;
   }

   public void deferredUpdate055( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate055( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency055( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls055( ) ;
         afterConfirm055( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete055( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000510 */
               pr_default.execute(8, new Object[] {A7TAS01_DATA_KIND, A8TAS01_ITEM_CD});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TAS01_CDNM") ;
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  new tas01_pc01_datalog(remoteHandle, context).execute( AV14Pgmname, Gx_mode, A7TAS01_DATA_KIND, A8TAS01_ITEM_CD, A9TAS01_ITEM_NM, A247TAS01_ITEM_RYAK, A300TAS01_DEL_FLG, A241TAS01_CRT_DATETIME, A269TAS01_CRT_USER_ID, A243TAS01_CRT_PROG_NM, A244TAS01_UPD_DATETIME, A270TAS01_UPD_USER_ID, A246TAS01_UPD_PROG_NM, A301TAS01_UPD_CNT) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "A7TAS01_DATA_KIND", A7TAS01_DATA_KIND);
                  httpContext.ajax_rsp_assign_attri("", false, "A8TAS01_ITEM_CD", A8TAS01_ITEM_CD);
                  httpContext.ajax_rsp_assign_attri("", false, "A9TAS01_ITEM_NM", A9TAS01_ITEM_NM);
                  httpContext.ajax_rsp_assign_attri("", false, "A247TAS01_ITEM_RYAK", A247TAS01_ITEM_RYAK);
                  httpContext.ajax_rsp_assign_attri("", false, "A300TAS01_DEL_FLG", A300TAS01_DEL_FLG);
                  httpContext.ajax_rsp_assign_attri("", false, "A241TAS01_CRT_DATETIME", localUtil.ttoc( A241TAS01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
                  httpContext.ajax_rsp_assign_attri("", false, "A269TAS01_CRT_USER_ID", A269TAS01_CRT_USER_ID);
                  httpContext.ajax_rsp_assign_attri("", false, "A243TAS01_CRT_PROG_NM", A243TAS01_CRT_PROG_NM);
                  httpContext.ajax_rsp_assign_attri("", false, "A244TAS01_UPD_DATETIME", localUtil.ttoc( A244TAS01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
                  httpContext.ajax_rsp_assign_attri("", false, "A270TAS01_UPD_USER_ID", A270TAS01_UPD_USER_ID);
                  httpContext.ajax_rsp_assign_attri("", false, "A246TAS01_UPD_PROG_NM", A246TAS01_UPD_PROG_NM);
                  httpContext.ajax_rsp_assign_attri("", false, "A301TAS01_UPD_CNT", GXutil.ltrim( GXutil.str( A301TAS01_UPD_CNT, 10, 0)));
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound5 == 0 )
                     {
                        initAll055( ) ;
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
                     resetCaption050( ) ;
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
      sMode5 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel055( ) ;
      Gx_mode = sMode5 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls055( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV14Pgmname = "TAS01_CDNM" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
      }
   }

   public void endLevel055( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete055( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "tas01_cdnm");
         if ( AnyError == 0 )
         {
            confirmValues050( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "tas01_cdnm");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart055( )
   {
      /* Scan By routine */
      /* Using cursor T000511 */
      pr_default.execute(9);
      RcdFound5 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound5 = (short)(1) ;
         A7TAS01_DATA_KIND = T000511_A7TAS01_DATA_KIND[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7TAS01_DATA_KIND", A7TAS01_DATA_KIND);
         A8TAS01_ITEM_CD = T000511_A8TAS01_ITEM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8TAS01_ITEM_CD", A8TAS01_ITEM_CD);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext055( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound5 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound5 = (short)(1) ;
         A7TAS01_DATA_KIND = T000511_A7TAS01_DATA_KIND[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7TAS01_DATA_KIND", A7TAS01_DATA_KIND);
         A8TAS01_ITEM_CD = T000511_A8TAS01_ITEM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8TAS01_ITEM_CD", A8TAS01_ITEM_CD);
      }
   }

   public void scanEnd055( )
   {
      pr_default.close(9);
   }

   public void afterConfirm055( )
   {
      /* After Confirm Rules */
      if ( (GXutil.strcmp("", A7TAS01_DATA_KIND)==0) )
      {
         httpContext.GX_msglist.addItem("データ種類を入力してください", 1, "TAS01_DATA_KIND");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAS01_DATA_KIND_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( 3 < GXutil.byteCount( A7TAS01_DATA_KIND, "Shift-JIS") )
      {
         httpContext.GX_msglist.addItem("データ種類は半角3桁以内になるようにしてください。", 1, "TAS01_DATA_KIND");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAS01_DATA_KIND_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( (GXutil.strcmp("", A8TAS01_ITEM_CD)==0) )
      {
         httpContext.GX_msglist.addItem("項目コードを入力してください", 1, "TAS01_ITEM_CD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAS01_ITEM_CD_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( 4 < GXutil.byteCount( A8TAS01_ITEM_CD, "Shift-JIS") )
      {
         httpContext.GX_msglist.addItem("項目コードは半角4桁以内になるようにしてください。", 1, "TAS01_ITEM_CD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAS01_ITEM_CD_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( (GXutil.strcmp("", A9TAS01_ITEM_NM)==0) )
      {
         httpContext.GX_msglist.addItem("項目名称を入力してください", 1, "TAS01_ITEM_NM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAS01_ITEM_NM_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( 60 < GXutil.byteCount( A9TAS01_ITEM_NM, "Shift-JIS") )
      {
         httpContext.GX_msglist.addItem("項目名称は全角30桁又は半角60桁以内になるようにしてください。", 1, "TAS01_ITEM_NM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAS01_ITEM_NM_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( 20 < GXutil.byteCount( A247TAS01_ITEM_RYAK, "Shift-JIS") )
      {
         httpContext.GX_msglist.addItem("項目略称は全角10桁又は半角20桁以内になるようにしてください。", 1, "TAS01_ITEM_RYAK");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAS01_ITEM_RYAK_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( 40 < GXutil.byteCount( A334TAS01_DATA_KIND_NM, "Shift-JIS") )
      {
         httpContext.GX_msglist.addItem("データ種類名は全角20桁又は半角40桁以内になるようにしてください。", 1, "TAS01_DATA_KIND_NM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAS01_DATA_KIND_NM_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( 100 < GXutil.byteCount( A336TAS01_CHAR_1, "Shift-JIS") )
      {
         httpContext.GX_msglist.addItem("予備項目（文字１）は全角50桁又は半角100桁以内になるようにしてください。", 1, "TAS01_CHAR_1");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAS01_CHAR_1_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( 100 < GXutil.byteCount( A337TAS01_CHAR_2, "Shift-JIS") )
      {
         httpContext.GX_msglist.addItem("予備項目（文字２）は全角50桁又は半角100桁以内になるようにしてください。", 1, "TAS01_CHAR_2");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAS01_CHAR_2_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( 100 < GXutil.byteCount( A338TAS01_CHAR_3, "Shift-JIS") )
      {
         httpContext.GX_msglist.addItem("予備項目（文字３）は全角50桁又は半角100桁以内になるようにしてください。", 1, "TAS01_CHAR_3");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAS01_CHAR_3_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( 100 < GXutil.byteCount( A339TAS01_CHAR_4, "Shift-JIS") )
      {
         httpContext.GX_msglist.addItem("予備項目（文字４）は全角50桁又は半角100桁以内になるようにしてください。", 1, "TAS01_CHAR_4");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAS01_CHAR_4_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( 100 < GXutil.byteCount( A340TAS01_CHAR_5, "Shift-JIS") )
      {
         httpContext.GX_msglist.addItem("予備項目（文字５）は全角50桁又は半角100桁以内になるようにしてください。", 1, "TAS01_CHAR_5");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAS01_CHAR_5_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
   }

   public void beforeInsert055( )
   {
      /* Before Insert Rules */
      A241TAS01_CRT_DATETIME = GXutil.now( ) ;
      n241TAS01_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A241TAS01_CRT_DATETIME", localUtil.ttoc( A241TAS01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A269TAS01_CRT_USER_ID ;
      GXv_char4[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tas01_cdnm_impl.this.GXt_char1 = GXv_char4[0] ;
      A269TAS01_CRT_USER_ID = GXt_char1 ;
      n269TAS01_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A269TAS01_CRT_USER_ID", A269TAS01_CRT_USER_ID);
      A244TAS01_UPD_DATETIME = GXutil.now( ) ;
      n244TAS01_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A244TAS01_UPD_DATETIME", localUtil.ttoc( A244TAS01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A270TAS01_UPD_USER_ID ;
      GXv_char4[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tas01_cdnm_impl.this.GXt_char1 = GXv_char4[0] ;
      A270TAS01_UPD_USER_ID = GXt_char1 ;
      n270TAS01_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A270TAS01_UPD_USER_ID", A270TAS01_UPD_USER_ID);
      A301TAS01_UPD_CNT = (long)(O301TAS01_UPD_CNT+1) ;
      n301TAS01_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A301TAS01_UPD_CNT", GXutil.ltrim( GXutil.str( A301TAS01_UPD_CNT, 10, 0)));
   }

   public void beforeUpdate055( )
   {
      /* Before Update Rules */
      A244TAS01_UPD_DATETIME = GXutil.now( ) ;
      n244TAS01_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A244TAS01_UPD_DATETIME", localUtil.ttoc( A244TAS01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A270TAS01_UPD_USER_ID ;
      GXv_char4[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tas01_cdnm_impl.this.GXt_char1 = GXv_char4[0] ;
      A270TAS01_UPD_USER_ID = GXt_char1 ;
      n270TAS01_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A270TAS01_UPD_USER_ID", A270TAS01_UPD_USER_ID);
      A301TAS01_UPD_CNT = (long)(O301TAS01_UPD_CNT+1) ;
      n301TAS01_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A301TAS01_UPD_CNT", GXutil.ltrim( GXutil.str( A301TAS01_UPD_CNT, 10, 0)));
   }

   public void beforeDelete055( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete055( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate055( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes055( )
   {
      edtTAS01_DATA_KIND_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAS01_DATA_KIND_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAS01_DATA_KIND_Enabled, 5, 0)));
      edtTAS01_ITEM_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAS01_ITEM_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAS01_ITEM_CD_Enabled, 5, 0)));
      edtTAS01_ITEM_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAS01_ITEM_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAS01_ITEM_NM_Enabled, 5, 0)));
      edtTAS01_ITEM_RYAK_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAS01_ITEM_RYAK_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAS01_ITEM_RYAK_Enabled, 5, 0)));
      edtTAS01_DATA_KIND_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAS01_DATA_KIND_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAS01_DATA_KIND_NM_Enabled, 5, 0)));
      edtTAS01_SORT_NO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAS01_SORT_NO_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAS01_SORT_NO_Enabled, 5, 0)));
      edtTAS01_CHAR_1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAS01_CHAR_1_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAS01_CHAR_1_Enabled, 5, 0)));
      edtTAS01_CHAR_2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAS01_CHAR_2_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAS01_CHAR_2_Enabled, 5, 0)));
      edtTAS01_CHAR_3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAS01_CHAR_3_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAS01_CHAR_3_Enabled, 5, 0)));
      edtTAS01_CHAR_4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAS01_CHAR_4_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAS01_CHAR_4_Enabled, 5, 0)));
      edtTAS01_CHAR_5_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAS01_CHAR_5_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAS01_CHAR_5_Enabled, 5, 0)));
      edtTAS01_NUM_1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAS01_NUM_1_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAS01_NUM_1_Enabled, 5, 0)));
      edtTAS01_NUM_2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAS01_NUM_2_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAS01_NUM_2_Enabled, 5, 0)));
      edtTAS01_NUM_3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAS01_NUM_3_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAS01_NUM_3_Enabled, 5, 0)));
      edtTAS01_NUM_4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAS01_NUM_4_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAS01_NUM_4_Enabled, 5, 0)));
      edtTAS01_NUM_5_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAS01_NUM_5_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAS01_NUM_5_Enabled, 5, 0)));
      radTAS01_DEL_FLG.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, radTAS01_DEL_FLG.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( radTAS01_DEL_FLG.getEnabled(), 5, 0)));
      edtTAS01_CRT_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAS01_CRT_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAS01_CRT_DATETIME_Enabled, 5, 0)));
      edtTAS01_CRT_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAS01_CRT_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAS01_CRT_USER_ID_Enabled, 5, 0)));
      edtTAS01_CRT_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAS01_CRT_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAS01_CRT_PROG_NM_Enabled, 5, 0)));
      edtTAS01_UPD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAS01_UPD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAS01_UPD_DATETIME_Enabled, 5, 0)));
      edtTAS01_UPD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAS01_UPD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAS01_UPD_USER_ID_Enabled, 5, 0)));
      edtTAS01_UPD_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAS01_UPD_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAS01_UPD_PROG_NM_Enabled, 5, 0)));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues050( )
   {
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv());
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( "項目名称マスタ") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?202071513183412");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("tas01_cdnm") +"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm055( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z7TAS01_DATA_KIND", GXutil.rtrim( Z7TAS01_DATA_KIND));
      GxWebStd.gx_hidden_field( httpContext, "Z8TAS01_ITEM_CD", GXutil.rtrim( Z8TAS01_ITEM_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z241TAS01_CRT_DATETIME", localUtil.ttoc( Z241TAS01_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z269TAS01_CRT_USER_ID", GXutil.rtrim( Z269TAS01_CRT_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z244TAS01_UPD_DATETIME", localUtil.ttoc( Z244TAS01_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z270TAS01_UPD_USER_ID", GXutil.rtrim( Z270TAS01_UPD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z301TAS01_UPD_CNT", GXutil.ltrim( localUtil.ntoc( Z301TAS01_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z9TAS01_ITEM_NM", GXutil.rtrim( Z9TAS01_ITEM_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z247TAS01_ITEM_RYAK", GXutil.rtrim( Z247TAS01_ITEM_RYAK));
      GxWebStd.gx_hidden_field( httpContext, "Z334TAS01_DATA_KIND_NM", GXutil.rtrim( Z334TAS01_DATA_KIND_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z335TAS01_SORT_NO", GXutil.ltrim( localUtil.ntoc( Z335TAS01_SORT_NO, (byte)(3), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z336TAS01_CHAR_1", GXutil.rtrim( Z336TAS01_CHAR_1));
      GxWebStd.gx_hidden_field( httpContext, "Z337TAS01_CHAR_2", GXutil.rtrim( Z337TAS01_CHAR_2));
      GxWebStd.gx_hidden_field( httpContext, "Z338TAS01_CHAR_3", GXutil.rtrim( Z338TAS01_CHAR_3));
      GxWebStd.gx_hidden_field( httpContext, "Z339TAS01_CHAR_4", GXutil.rtrim( Z339TAS01_CHAR_4));
      GxWebStd.gx_hidden_field( httpContext, "Z340TAS01_CHAR_5", GXutil.rtrim( Z340TAS01_CHAR_5));
      GxWebStd.gx_hidden_field( httpContext, "Z341TAS01_NUM_1", GXutil.ltrim( localUtil.ntoc( Z341TAS01_NUM_1, (byte)(18), (byte)(4), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z342TAS01_NUM_2", GXutil.ltrim( localUtil.ntoc( Z342TAS01_NUM_2, (byte)(18), (byte)(4), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z343TAS01_NUM_3", GXutil.ltrim( localUtil.ntoc( Z343TAS01_NUM_3, (byte)(18), (byte)(4), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z344TAS01_NUM_4", GXutil.ltrim( localUtil.ntoc( Z344TAS01_NUM_4, (byte)(18), (byte)(4), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z345TAS01_NUM_5", GXutil.ltrim( localUtil.ntoc( Z345TAS01_NUM_5, (byte)(18), (byte)(4), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z300TAS01_DEL_FLG", GXutil.rtrim( Z300TAS01_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z243TAS01_CRT_PROG_NM", GXutil.rtrim( Z243TAS01_CRT_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z246TAS01_UPD_PROG_NM", GXutil.rtrim( Z246TAS01_UPD_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "O301TAS01_UPD_CNT", GXutil.ltrim( localUtil.ntoc( O301TAS01_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      GxWebStd.gx_hidden_field( httpContext, "TAS01_UPD_CNT", GXutil.ltrim( localUtil.ntoc( A301TAS01_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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

   public String getPgmname( )
   {
      return "TAS01_CDNM" ;
   }

   public String getPgmdesc( )
   {
      return "項目名称マスタ" ;
   }

   public void initializeNonKey055( )
   {
      A241TAS01_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n241TAS01_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A241TAS01_CRT_DATETIME", localUtil.ttoc( A241TAS01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n241TAS01_CRT_DATETIME = (GXutil.nullDate().equals(A241TAS01_CRT_DATETIME) ? true : false) ;
      A269TAS01_CRT_USER_ID = "" ;
      n269TAS01_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A269TAS01_CRT_USER_ID", A269TAS01_CRT_USER_ID);
      n269TAS01_CRT_USER_ID = ((GXutil.strcmp("", A269TAS01_CRT_USER_ID)==0) ? true : false) ;
      A244TAS01_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n244TAS01_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A244TAS01_UPD_DATETIME", localUtil.ttoc( A244TAS01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n244TAS01_UPD_DATETIME = (GXutil.nullDate().equals(A244TAS01_UPD_DATETIME) ? true : false) ;
      A270TAS01_UPD_USER_ID = "" ;
      n270TAS01_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A270TAS01_UPD_USER_ID", A270TAS01_UPD_USER_ID);
      n270TAS01_UPD_USER_ID = ((GXutil.strcmp("", A270TAS01_UPD_USER_ID)==0) ? true : false) ;
      A301TAS01_UPD_CNT = 0 ;
      n301TAS01_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A301TAS01_UPD_CNT", GXutil.ltrim( GXutil.str( A301TAS01_UPD_CNT, 10, 0)));
      A9TAS01_ITEM_NM = "" ;
      n9TAS01_ITEM_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9TAS01_ITEM_NM", A9TAS01_ITEM_NM);
      n9TAS01_ITEM_NM = ((GXutil.strcmp("", A9TAS01_ITEM_NM)==0) ? true : false) ;
      A247TAS01_ITEM_RYAK = "" ;
      n247TAS01_ITEM_RYAK = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A247TAS01_ITEM_RYAK", A247TAS01_ITEM_RYAK);
      n247TAS01_ITEM_RYAK = ((GXutil.strcmp("", A247TAS01_ITEM_RYAK)==0) ? true : false) ;
      A334TAS01_DATA_KIND_NM = "" ;
      n334TAS01_DATA_KIND_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A334TAS01_DATA_KIND_NM", A334TAS01_DATA_KIND_NM);
      n334TAS01_DATA_KIND_NM = ((GXutil.strcmp("", A334TAS01_DATA_KIND_NM)==0) ? true : false) ;
      A335TAS01_SORT_NO = (short)(0) ;
      n335TAS01_SORT_NO = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A335TAS01_SORT_NO", GXutil.ltrim( GXutil.str( A335TAS01_SORT_NO, 3, 0)));
      n335TAS01_SORT_NO = ((0==A335TAS01_SORT_NO) ? true : false) ;
      A336TAS01_CHAR_1 = "" ;
      n336TAS01_CHAR_1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A336TAS01_CHAR_1", A336TAS01_CHAR_1);
      n336TAS01_CHAR_1 = ((GXutil.strcmp("", A336TAS01_CHAR_1)==0) ? true : false) ;
      A337TAS01_CHAR_2 = "" ;
      n337TAS01_CHAR_2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A337TAS01_CHAR_2", A337TAS01_CHAR_2);
      n337TAS01_CHAR_2 = ((GXutil.strcmp("", A337TAS01_CHAR_2)==0) ? true : false) ;
      A338TAS01_CHAR_3 = "" ;
      n338TAS01_CHAR_3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A338TAS01_CHAR_3", A338TAS01_CHAR_3);
      n338TAS01_CHAR_3 = ((GXutil.strcmp("", A338TAS01_CHAR_3)==0) ? true : false) ;
      A339TAS01_CHAR_4 = "" ;
      n339TAS01_CHAR_4 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A339TAS01_CHAR_4", A339TAS01_CHAR_4);
      n339TAS01_CHAR_4 = ((GXutil.strcmp("", A339TAS01_CHAR_4)==0) ? true : false) ;
      A340TAS01_CHAR_5 = "" ;
      n340TAS01_CHAR_5 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A340TAS01_CHAR_5", A340TAS01_CHAR_5);
      n340TAS01_CHAR_5 = ((GXutil.strcmp("", A340TAS01_CHAR_5)==0) ? true : false) ;
      A341TAS01_NUM_1 = DecimalUtil.ZERO ;
      n341TAS01_NUM_1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A341TAS01_NUM_1", GXutil.ltrim( GXutil.str( A341TAS01_NUM_1, 18, 4)));
      n341TAS01_NUM_1 = ((DecimalUtil.ZERO.compareTo(A341TAS01_NUM_1)==0) ? true : false) ;
      A342TAS01_NUM_2 = DecimalUtil.ZERO ;
      n342TAS01_NUM_2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A342TAS01_NUM_2", GXutil.ltrim( GXutil.str( A342TAS01_NUM_2, 18, 4)));
      n342TAS01_NUM_2 = ((DecimalUtil.ZERO.compareTo(A342TAS01_NUM_2)==0) ? true : false) ;
      A343TAS01_NUM_3 = DecimalUtil.ZERO ;
      n343TAS01_NUM_3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A343TAS01_NUM_3", GXutil.ltrim( GXutil.str( A343TAS01_NUM_3, 18, 4)));
      n343TAS01_NUM_3 = ((DecimalUtil.ZERO.compareTo(A343TAS01_NUM_3)==0) ? true : false) ;
      A344TAS01_NUM_4 = DecimalUtil.ZERO ;
      n344TAS01_NUM_4 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A344TAS01_NUM_4", GXutil.ltrim( GXutil.str( A344TAS01_NUM_4, 18, 4)));
      n344TAS01_NUM_4 = ((DecimalUtil.ZERO.compareTo(A344TAS01_NUM_4)==0) ? true : false) ;
      A345TAS01_NUM_5 = DecimalUtil.ZERO ;
      n345TAS01_NUM_5 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A345TAS01_NUM_5", GXutil.ltrim( GXutil.str( A345TAS01_NUM_5, 18, 4)));
      n345TAS01_NUM_5 = ((DecimalUtil.ZERO.compareTo(A345TAS01_NUM_5)==0) ? true : false) ;
      A300TAS01_DEL_FLG = "0" ;
      n300TAS01_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A300TAS01_DEL_FLG", A300TAS01_DEL_FLG);
      A243TAS01_CRT_PROG_NM = AV14Pgmname ;
      n243TAS01_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A243TAS01_CRT_PROG_NM", A243TAS01_CRT_PROG_NM);
      A246TAS01_UPD_PROG_NM = AV14Pgmname ;
      n246TAS01_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A246TAS01_UPD_PROG_NM", A246TAS01_UPD_PROG_NM);
      O301TAS01_UPD_CNT = A301TAS01_UPD_CNT ;
      n301TAS01_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A301TAS01_UPD_CNT", GXutil.ltrim( GXutil.str( A301TAS01_UPD_CNT, 10, 0)));
   }

   public void initAll055( )
   {
      A7TAS01_DATA_KIND = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A7TAS01_DATA_KIND", A7TAS01_DATA_KIND);
      A8TAS01_ITEM_CD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8TAS01_ITEM_CD", A8TAS01_ITEM_CD);
      initializeNonKey055( ) ;
   }

   public void standaloneModalInsert( )
   {
      A300TAS01_DEL_FLG = i300TAS01_DEL_FLG ;
      n300TAS01_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A300TAS01_DEL_FLG", A300TAS01_DEL_FLG);
      A243TAS01_CRT_PROG_NM = i243TAS01_CRT_PROG_NM ;
      n243TAS01_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A243TAS01_CRT_PROG_NM", A243TAS01_CRT_PROG_NM);
      A246TAS01_UPD_PROG_NM = i246TAS01_UPD_PROG_NM ;
      n246TAS01_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A246TAS01_UPD_PROG_NM", A246TAS01_UPD_PROG_NM);
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("calendar-system.css", "?1830155");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?1316731");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202071513183425");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("tas01_cdnm.js", "?202071513183425");
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
      div_Internalname = "" ;
      tblTabletoolbar_Internalname = "TABLETOOLBAR" ;
      imgImage19_Internalname = "IMAGE19" ;
      lblTextblocktas01_data_kind_Internalname = "TEXTBLOCKTAS01_DATA_KIND" ;
      edtTAS01_DATA_KIND_Internalname = "TAS01_DATA_KIND" ;
      imgImage20_Internalname = "IMAGE20" ;
      lblTextblocktas01_item_cd_Internalname = "TEXTBLOCKTAS01_ITEM_CD" ;
      edtTAS01_ITEM_CD_Internalname = "TAS01_ITEM_CD" ;
      imgImage21_Internalname = "IMAGE21" ;
      lblTextblocktas01_item_nm_Internalname = "TEXTBLOCKTAS01_ITEM_NM" ;
      edtTAS01_ITEM_NM_Internalname = "TAS01_ITEM_NM" ;
      lblTextblocktas01_item_ryak_Internalname = "TEXTBLOCKTAS01_ITEM_RYAK" ;
      edtTAS01_ITEM_RYAK_Internalname = "TAS01_ITEM_RYAK" ;
      lblTextblocktas01_item_ryak2_Internalname = "TEXTBLOCKTAS01_ITEM_RYAK2" ;
      edtTAS01_DATA_KIND_NM_Internalname = "TAS01_DATA_KIND_NM" ;
      lblTextblocktas01_item_ryak3_Internalname = "TEXTBLOCKTAS01_ITEM_RYAK3" ;
      edtTAS01_SORT_NO_Internalname = "TAS01_SORT_NO" ;
      lblTextblocktas01_item_ryak4_Internalname = "TEXTBLOCKTAS01_ITEM_RYAK4" ;
      edtTAS01_CHAR_1_Internalname = "TAS01_CHAR_1" ;
      lblTextblocktas01_item_ryak6_Internalname = "TEXTBLOCKTAS01_ITEM_RYAK6" ;
      edtTAS01_CHAR_2_Internalname = "TAS01_CHAR_2" ;
      lblTextblocktas01_item_ryak7_Internalname = "TEXTBLOCKTAS01_ITEM_RYAK7" ;
      edtTAS01_CHAR_3_Internalname = "TAS01_CHAR_3" ;
      lblTextblocktas01_item_ryak8_Internalname = "TEXTBLOCKTAS01_ITEM_RYAK8" ;
      edtTAS01_CHAR_4_Internalname = "TAS01_CHAR_4" ;
      lblTextblocktas01_item_ryak9_Internalname = "TEXTBLOCKTAS01_ITEM_RYAK9" ;
      edtTAS01_CHAR_5_Internalname = "TAS01_CHAR_5" ;
      lblTextblocktas01_item_ryak5_Internalname = "TEXTBLOCKTAS01_ITEM_RYAK5" ;
      edtTAS01_NUM_1_Internalname = "TAS01_NUM_1" ;
      lblTextblocktas01_item_ryak10_Internalname = "TEXTBLOCKTAS01_ITEM_RYAK10" ;
      edtTAS01_NUM_2_Internalname = "TAS01_NUM_2" ;
      lblTextblocktas01_item_ryak11_Internalname = "TEXTBLOCKTAS01_ITEM_RYAK11" ;
      edtTAS01_NUM_3_Internalname = "TAS01_NUM_3" ;
      lblTextblocktas01_item_ryak12_Internalname = "TEXTBLOCKTAS01_ITEM_RYAK12" ;
      edtTAS01_NUM_4_Internalname = "TAS01_NUM_4" ;
      lblTextblocktas01_item_ryak13_Internalname = "TEXTBLOCKTAS01_ITEM_RYAK13" ;
      edtTAS01_NUM_5_Internalname = "TAS01_NUM_5" ;
      lblTextblocktas01_del_flg_Internalname = "TEXTBLOCKTAS01_DEL_FLG" ;
      radTAS01_DEL_FLG.setInternalname( "TAS01_DEL_FLG" );
      lblTextblocktas01_crt_datetime_Internalname = "TEXTBLOCKTAS01_CRT_DATETIME" ;
      edtTAS01_CRT_DATETIME_Internalname = "TAS01_CRT_DATETIME" ;
      lblTextblocktas01_crt_user_id_Internalname = "TEXTBLOCKTAS01_CRT_USER_ID" ;
      edtTAS01_CRT_USER_ID_Internalname = "TAS01_CRT_USER_ID" ;
      lblTextblocktas01_crt_prog_nm_Internalname = "TEXTBLOCKTAS01_CRT_PROG_NM" ;
      edtTAS01_CRT_PROG_NM_Internalname = "TAS01_CRT_PROG_NM" ;
      lblTextblocktas01_upd_datetime_Internalname = "TEXTBLOCKTAS01_UPD_DATETIME" ;
      edtTAS01_UPD_DATETIME_Internalname = "TAS01_UPD_DATETIME" ;
      lblTextblocktas01_upd_user_id_Internalname = "TEXTBLOCKTAS01_UPD_USER_ID" ;
      edtTAS01_UPD_USER_ID_Internalname = "TAS01_UPD_USER_ID" ;
      lblTextblocktas01_upd_prog_nm_Internalname = "TEXTBLOCKTAS01_UPD_PROG_NM" ;
      edtTAS01_UPD_PROG_NM_Internalname = "TAS01_UPD_PROG_NM" ;
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
      edtTAS01_UPD_PROG_NM_Jsonclick = "" ;
      edtTAS01_UPD_PROG_NM_Enabled = 0 ;
      edtTAS01_UPD_PROG_NM_Visible = 1 ;
      edtTAS01_UPD_USER_ID_Jsonclick = "" ;
      edtTAS01_UPD_USER_ID_Enabled = 0 ;
      edtTAS01_UPD_DATETIME_Jsonclick = "" ;
      edtTAS01_UPD_DATETIME_Enabled = 0 ;
      edtTAS01_UPD_DATETIME_Visible = 1 ;
      edtTAS01_CRT_PROG_NM_Jsonclick = "" ;
      edtTAS01_CRT_PROG_NM_Enabled = 0 ;
      edtTAS01_CRT_PROG_NM_Visible = 1 ;
      edtTAS01_CRT_USER_ID_Jsonclick = "" ;
      edtTAS01_CRT_USER_ID_Enabled = 0 ;
      edtTAS01_CRT_DATETIME_Jsonclick = "" ;
      edtTAS01_CRT_DATETIME_Enabled = 0 ;
      edtTAS01_CRT_DATETIME_Visible = 1 ;
      radTAS01_DEL_FLG.setJsonclick( "" );
      radTAS01_DEL_FLG.setEnabled( 1 );
      edtTAS01_NUM_5_Jsonclick = "" ;
      edtTAS01_NUM_5_Enabled = 1 ;
      edtTAS01_NUM_4_Jsonclick = "" ;
      edtTAS01_NUM_4_Enabled = 1 ;
      edtTAS01_NUM_3_Jsonclick = "" ;
      edtTAS01_NUM_3_Enabled = 1 ;
      edtTAS01_NUM_2_Jsonclick = "" ;
      edtTAS01_NUM_2_Enabled = 1 ;
      edtTAS01_NUM_1_Jsonclick = "" ;
      edtTAS01_NUM_1_Enabled = 1 ;
      edtTAS01_CHAR_5_Jsonclick = "" ;
      edtTAS01_CHAR_5_Enabled = 1 ;
      edtTAS01_CHAR_4_Jsonclick = "" ;
      edtTAS01_CHAR_4_Enabled = 1 ;
      edtTAS01_CHAR_3_Jsonclick = "" ;
      edtTAS01_CHAR_3_Enabled = 1 ;
      edtTAS01_CHAR_2_Jsonclick = "" ;
      edtTAS01_CHAR_2_Enabled = 1 ;
      edtTAS01_CHAR_1_Jsonclick = "" ;
      edtTAS01_CHAR_1_Enabled = 1 ;
      edtTAS01_SORT_NO_Jsonclick = "" ;
      edtTAS01_SORT_NO_Enabled = 1 ;
      edtTAS01_DATA_KIND_NM_Jsonclick = "" ;
      edtTAS01_DATA_KIND_NM_Enabled = 1 ;
      edtTAS01_ITEM_RYAK_Jsonclick = "" ;
      edtTAS01_ITEM_RYAK_Enabled = 1 ;
      edtTAS01_ITEM_NM_Jsonclick = "" ;
      edtTAS01_ITEM_NM_Enabled = 1 ;
      imgImage21_Visible = 1 ;
      edtTAS01_ITEM_CD_Jsonclick = "" ;
      edtTAS01_ITEM_CD_Enabled = 1 ;
      imgImage20_Visible = 1 ;
      edtTAS01_DATA_KIND_Jsonclick = "" ;
      edtTAS01_DATA_KIND_Enabled = 1 ;
      imgImage19_Visible = 1 ;
      lblBtn_cancel_Enabled = 1 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gx7asatas01_crt_user_id055( String Gx_mode )
   {
      GXt_char1 = A269TAS01_CRT_USER_ID ;
      GXv_char4[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tas01_cdnm_impl.this.GXt_char1 = GXv_char4[0] ;
      A269TAS01_CRT_USER_ID = GXt_char1 ;
      n269TAS01_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A269TAS01_CRT_USER_ID", A269TAS01_CRT_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A269TAS01_CRT_USER_ID))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void gx9asatas01_upd_user_id055( String Gx_mode )
   {
      GXt_char1 = A270TAS01_UPD_USER_ID ;
      GXv_char4[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tas01_cdnm_impl.this.GXt_char1 = GXv_char4[0] ;
      A270TAS01_UPD_USER_ID = GXt_char1 ;
      n270TAS01_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A270TAS01_UPD_USER_ID", A270TAS01_UPD_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A270TAS01_UPD_USER_ID))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void xc_33_055( String AV14Pgmname ,
                          String Gx_mode ,
                          String A7TAS01_DATA_KIND ,
                          String A8TAS01_ITEM_CD ,
                          String A9TAS01_ITEM_NM ,
                          String A247TAS01_ITEM_RYAK ,
                          String A300TAS01_DEL_FLG ,
                          java.util.Date A241TAS01_CRT_DATETIME ,
                          String A269TAS01_CRT_USER_ID ,
                          String A243TAS01_CRT_PROG_NM ,
                          java.util.Date A244TAS01_UPD_DATETIME ,
                          String A270TAS01_UPD_USER_ID ,
                          String A246TAS01_UPD_PROG_NM ,
                          long A301TAS01_UPD_CNT )
   {
      new tas01_pc01_datalog(remoteHandle, context).execute( AV14Pgmname, Gx_mode, A7TAS01_DATA_KIND, A8TAS01_ITEM_CD, A9TAS01_ITEM_NM, A247TAS01_ITEM_RYAK, A300TAS01_DEL_FLG, A241TAS01_CRT_DATETIME, A269TAS01_CRT_USER_ID, A243TAS01_CRT_PROG_NM, A244TAS01_UPD_DATETIME, A270TAS01_UPD_USER_ID, A246TAS01_UPD_PROG_NM, A301TAS01_UPD_CNT) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "A7TAS01_DATA_KIND", A7TAS01_DATA_KIND);
      httpContext.ajax_rsp_assign_attri("", false, "A8TAS01_ITEM_CD", A8TAS01_ITEM_CD);
      httpContext.ajax_rsp_assign_attri("", false, "A9TAS01_ITEM_NM", A9TAS01_ITEM_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A247TAS01_ITEM_RYAK", A247TAS01_ITEM_RYAK);
      httpContext.ajax_rsp_assign_attri("", false, "A300TAS01_DEL_FLG", A300TAS01_DEL_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "A241TAS01_CRT_DATETIME", localUtil.ttoc( A241TAS01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A269TAS01_CRT_USER_ID", A269TAS01_CRT_USER_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A243TAS01_CRT_PROG_NM", A243TAS01_CRT_PROG_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A244TAS01_UPD_DATETIME", localUtil.ttoc( A244TAS01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A270TAS01_UPD_USER_ID", A270TAS01_UPD_USER_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A246TAS01_UPD_PROG_NM", A246TAS01_UPD_PROG_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A301TAS01_UPD_CNT", GXutil.ltrim( GXutil.str( A301TAS01_UPD_CNT, 10, 0)));
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

   public void xc_34_055( String AV14Pgmname ,
                          String Gx_mode ,
                          String A7TAS01_DATA_KIND ,
                          String A8TAS01_ITEM_CD ,
                          String A9TAS01_ITEM_NM ,
                          String A247TAS01_ITEM_RYAK ,
                          String A300TAS01_DEL_FLG ,
                          java.util.Date A241TAS01_CRT_DATETIME ,
                          String A269TAS01_CRT_USER_ID ,
                          String A243TAS01_CRT_PROG_NM ,
                          java.util.Date A244TAS01_UPD_DATETIME ,
                          String A270TAS01_UPD_USER_ID ,
                          String A246TAS01_UPD_PROG_NM ,
                          long A301TAS01_UPD_CNT )
   {
      new tas01_pc01_datalog(remoteHandle, context).execute( AV14Pgmname, Gx_mode, A7TAS01_DATA_KIND, A8TAS01_ITEM_CD, A9TAS01_ITEM_NM, A247TAS01_ITEM_RYAK, A300TAS01_DEL_FLG, A241TAS01_CRT_DATETIME, A269TAS01_CRT_USER_ID, A243TAS01_CRT_PROG_NM, A244TAS01_UPD_DATETIME, A270TAS01_UPD_USER_ID, A246TAS01_UPD_PROG_NM, A301TAS01_UPD_CNT) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "A7TAS01_DATA_KIND", A7TAS01_DATA_KIND);
      httpContext.ajax_rsp_assign_attri("", false, "A8TAS01_ITEM_CD", A8TAS01_ITEM_CD);
      httpContext.ajax_rsp_assign_attri("", false, "A9TAS01_ITEM_NM", A9TAS01_ITEM_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A247TAS01_ITEM_RYAK", A247TAS01_ITEM_RYAK);
      httpContext.ajax_rsp_assign_attri("", false, "A300TAS01_DEL_FLG", A300TAS01_DEL_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "A241TAS01_CRT_DATETIME", localUtil.ttoc( A241TAS01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A269TAS01_CRT_USER_ID", A269TAS01_CRT_USER_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A243TAS01_CRT_PROG_NM", A243TAS01_CRT_PROG_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A244TAS01_UPD_DATETIME", localUtil.ttoc( A244TAS01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A270TAS01_UPD_USER_ID", A270TAS01_UPD_USER_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A246TAS01_UPD_PROG_NM", A246TAS01_UPD_PROG_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A301TAS01_UPD_CNT", GXutil.ltrim( GXutil.str( A301TAS01_UPD_CNT, 10, 0)));
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

   public void xc_35_055( String AV14Pgmname ,
                          String Gx_mode ,
                          String A7TAS01_DATA_KIND ,
                          String A8TAS01_ITEM_CD ,
                          String A9TAS01_ITEM_NM ,
                          String A247TAS01_ITEM_RYAK ,
                          String A300TAS01_DEL_FLG ,
                          java.util.Date A241TAS01_CRT_DATETIME ,
                          String A269TAS01_CRT_USER_ID ,
                          String A243TAS01_CRT_PROG_NM ,
                          java.util.Date A244TAS01_UPD_DATETIME ,
                          String A270TAS01_UPD_USER_ID ,
                          String A246TAS01_UPD_PROG_NM ,
                          long A301TAS01_UPD_CNT )
   {
      new tas01_pc01_datalog(remoteHandle, context).execute( AV14Pgmname, Gx_mode, A7TAS01_DATA_KIND, A8TAS01_ITEM_CD, A9TAS01_ITEM_NM, A247TAS01_ITEM_RYAK, A300TAS01_DEL_FLG, A241TAS01_CRT_DATETIME, A269TAS01_CRT_USER_ID, A243TAS01_CRT_PROG_NM, A244TAS01_UPD_DATETIME, A270TAS01_UPD_USER_ID, A246TAS01_UPD_PROG_NM, A301TAS01_UPD_CNT) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "A7TAS01_DATA_KIND", A7TAS01_DATA_KIND);
      httpContext.ajax_rsp_assign_attri("", false, "A8TAS01_ITEM_CD", A8TAS01_ITEM_CD);
      httpContext.ajax_rsp_assign_attri("", false, "A9TAS01_ITEM_NM", A9TAS01_ITEM_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A247TAS01_ITEM_RYAK", A247TAS01_ITEM_RYAK);
      httpContext.ajax_rsp_assign_attri("", false, "A300TAS01_DEL_FLG", A300TAS01_DEL_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "A241TAS01_CRT_DATETIME", localUtil.ttoc( A241TAS01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A269TAS01_CRT_USER_ID", A269TAS01_CRT_USER_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A243TAS01_CRT_PROG_NM", A243TAS01_CRT_PROG_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A244TAS01_UPD_DATETIME", localUtil.ttoc( A244TAS01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A270TAS01_UPD_USER_ID", A270TAS01_UPD_USER_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A246TAS01_UPD_PROG_NM", A246TAS01_UPD_PROG_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A301TAS01_UPD_CNT", GXutil.ltrim( GXutil.str( A301TAS01_UPD_CNT, 10, 0)));
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
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      getEqualNoModal( ) ;
      GX_FocusControl = edtTAS01_ITEM_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Tas01_item_cd( String GX_Parm1 ,
                                    String GX_Parm2 ,
                                    java.util.Date GX_Parm3 ,
                                    String GX_Parm4 ,
                                    java.util.Date GX_Parm5 ,
                                    String GX_Parm6 ,
                                    long GX_Parm7 ,
                                    String GX_Parm8 ,
                                    String GX_Parm9 ,
                                    String GX_Parm10 ,
                                    short GX_Parm11 ,
                                    String GX_Parm12 ,
                                    String GX_Parm13 ,
                                    String GX_Parm14 ,
                                    String GX_Parm15 ,
                                    String GX_Parm16 ,
                                    java.math.BigDecimal GX_Parm17 ,
                                    java.math.BigDecimal GX_Parm18 ,
                                    java.math.BigDecimal GX_Parm19 ,
                                    java.math.BigDecimal GX_Parm20 ,
                                    java.math.BigDecimal GX_Parm21 ,
                                    String GX_Parm22 ,
                                    String GX_Parm23 ,
                                    String GX_Parm24 )
   {
      A7TAS01_DATA_KIND = GX_Parm1 ;
      A8TAS01_ITEM_CD = GX_Parm2 ;
      A241TAS01_CRT_DATETIME = GX_Parm3 ;
      n241TAS01_CRT_DATETIME = false ;
      A269TAS01_CRT_USER_ID = GX_Parm4 ;
      n269TAS01_CRT_USER_ID = false ;
      A244TAS01_UPD_DATETIME = GX_Parm5 ;
      n244TAS01_UPD_DATETIME = false ;
      A270TAS01_UPD_USER_ID = GX_Parm6 ;
      n270TAS01_UPD_USER_ID = false ;
      A301TAS01_UPD_CNT = GX_Parm7 ;
      n301TAS01_UPD_CNT = false ;
      A9TAS01_ITEM_NM = GX_Parm8 ;
      n9TAS01_ITEM_NM = false ;
      A247TAS01_ITEM_RYAK = GX_Parm9 ;
      n247TAS01_ITEM_RYAK = false ;
      A334TAS01_DATA_KIND_NM = GX_Parm10 ;
      n334TAS01_DATA_KIND_NM = false ;
      A335TAS01_SORT_NO = GX_Parm11 ;
      n335TAS01_SORT_NO = false ;
      A336TAS01_CHAR_1 = GX_Parm12 ;
      n336TAS01_CHAR_1 = false ;
      A337TAS01_CHAR_2 = GX_Parm13 ;
      n337TAS01_CHAR_2 = false ;
      A338TAS01_CHAR_3 = GX_Parm14 ;
      n338TAS01_CHAR_3 = false ;
      A339TAS01_CHAR_4 = GX_Parm15 ;
      n339TAS01_CHAR_4 = false ;
      A340TAS01_CHAR_5 = GX_Parm16 ;
      n340TAS01_CHAR_5 = false ;
      A341TAS01_NUM_1 = GX_Parm17 ;
      n341TAS01_NUM_1 = false ;
      A342TAS01_NUM_2 = GX_Parm18 ;
      n342TAS01_NUM_2 = false ;
      A343TAS01_NUM_3 = GX_Parm19 ;
      n343TAS01_NUM_3 = false ;
      A344TAS01_NUM_4 = GX_Parm20 ;
      n344TAS01_NUM_4 = false ;
      A345TAS01_NUM_5 = GX_Parm21 ;
      n345TAS01_NUM_5 = false ;
      A300TAS01_DEL_FLG = GX_Parm22 ;
      n300TAS01_DEL_FLG = false ;
      A243TAS01_CRT_PROG_NM = GX_Parm23 ;
      n243TAS01_CRT_PROG_NM = false ;
      A246TAS01_UPD_PROG_NM = GX_Parm24 ;
      n246TAS01_UPD_PROG_NM = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(localUtil.format(A241TAS01_CRT_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A269TAS01_CRT_USER_ID));
      isValidOutput.add(localUtil.format(A244TAS01_UPD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A270TAS01_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A301TAS01_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A9TAS01_ITEM_NM));
      isValidOutput.add(GXutil.rtrim( A247TAS01_ITEM_RYAK));
      isValidOutput.add(GXutil.rtrim( A334TAS01_DATA_KIND_NM));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A335TAS01_SORT_NO, (byte)(3), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A336TAS01_CHAR_1));
      isValidOutput.add(GXutil.rtrim( A337TAS01_CHAR_2));
      isValidOutput.add(GXutil.rtrim( A338TAS01_CHAR_3));
      isValidOutput.add(GXutil.rtrim( A339TAS01_CHAR_4));
      isValidOutput.add(GXutil.rtrim( A340TAS01_CHAR_5));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A341TAS01_NUM_1, (byte)(18), (byte)(4), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A342TAS01_NUM_2, (byte)(18), (byte)(4), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A343TAS01_NUM_3, (byte)(18), (byte)(4), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A344TAS01_NUM_4, (byte)(18), (byte)(4), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A345TAS01_NUM_5, (byte)(18), (byte)(4), ".", "")));
      isValidOutput.add(GXutil.rtrim( A300TAS01_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( A243TAS01_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( A246TAS01_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( AV14Pgmname));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.rtrim( Z7TAS01_DATA_KIND));
      isValidOutput.add(GXutil.rtrim( Z8TAS01_ITEM_CD));
      isValidOutput.add(localUtil.ttoc( Z241TAS01_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z269TAS01_CRT_USER_ID));
      isValidOutput.add(localUtil.ttoc( Z244TAS01_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z270TAS01_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z301TAS01_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z9TAS01_ITEM_NM));
      isValidOutput.add(GXutil.rtrim( Z247TAS01_ITEM_RYAK));
      isValidOutput.add(GXutil.rtrim( Z334TAS01_DATA_KIND_NM));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z335TAS01_SORT_NO, (byte)(3), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z336TAS01_CHAR_1));
      isValidOutput.add(GXutil.rtrim( Z337TAS01_CHAR_2));
      isValidOutput.add(GXutil.rtrim( Z338TAS01_CHAR_3));
      isValidOutput.add(GXutil.rtrim( Z339TAS01_CHAR_4));
      isValidOutput.add(GXutil.rtrim( Z340TAS01_CHAR_5));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z341TAS01_NUM_1, (byte)(18), (byte)(4), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z342TAS01_NUM_2, (byte)(18), (byte)(4), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z343TAS01_NUM_3, (byte)(18), (byte)(4), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z344TAS01_NUM_4, (byte)(18), (byte)(4), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z345TAS01_NUM_5, (byte)(18), (byte)(4), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z300TAS01_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( Z243TAS01_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( Z246TAS01_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( ZV14Pgmname));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( O301TAS01_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(edtTAS01_DATA_KIND_Enabled);
      isValidOutput.add(edtTAS01_CRT_DATETIME_Visible);
      isValidOutput.add(edtTAS01_CRT_PROG_NM_Visible);
      isValidOutput.add(edtTAS01_UPD_DATETIME_Visible);
      isValidOutput.add(edtTAS01_UPD_PROG_NM_Visible);
      isValidOutput.add(imgBtn_delete2_Enabled);
      isValidOutput.add(imgBtn_enter2_Enabled);
      isValidOutput.add(lblBtn_cancel_Enabled);
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
               case 1 :
                  /* Execute user subroutine: S132 */
                  S132 ();
                  break;
         }
      }
   }

   public void initialize( )
   {
      sPrefix = "" ;
      Z7TAS01_DATA_KIND = "" ;
      Z8TAS01_ITEM_CD = "" ;
      Z241TAS01_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z269TAS01_CRT_USER_ID = "" ;
      Z244TAS01_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z270TAS01_UPD_USER_ID = "" ;
      Z9TAS01_ITEM_NM = "" ;
      Z247TAS01_ITEM_RYAK = "" ;
      Z334TAS01_DATA_KIND_NM = "" ;
      Z336TAS01_CHAR_1 = "" ;
      Z337TAS01_CHAR_2 = "" ;
      Z338TAS01_CHAR_3 = "" ;
      Z339TAS01_CHAR_4 = "" ;
      Z340TAS01_CHAR_5 = "" ;
      Z341TAS01_NUM_1 = DecimalUtil.ZERO ;
      Z342TAS01_NUM_2 = DecimalUtil.ZERO ;
      Z343TAS01_NUM_3 = DecimalUtil.ZERO ;
      Z344TAS01_NUM_4 = DecimalUtil.ZERO ;
      Z345TAS01_NUM_5 = DecimalUtil.ZERO ;
      Z300TAS01_DEL_FLG = "" ;
      Z243TAS01_CRT_PROG_NM = "" ;
      Z246TAS01_UPD_PROG_NM = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV14Pgmname = "" ;
      Gx_mode = "" ;
      A7TAS01_DATA_KIND = "" ;
      A8TAS01_ITEM_CD = "" ;
      A9TAS01_ITEM_NM = "" ;
      A247TAS01_ITEM_RYAK = "" ;
      A300TAS01_DEL_FLG = "" ;
      A241TAS01_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A269TAS01_CRT_USER_ID = "" ;
      A243TAS01_CRT_PROG_NM = "" ;
      A244TAS01_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A270TAS01_UPD_USER_ID = "" ;
      A246TAS01_UPD_PROG_NM = "" ;
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
      lblTextblocktas01_data_kind_Jsonclick = "" ;
      TempTags = "" ;
      lblTextblocktas01_item_cd_Jsonclick = "" ;
      lblTextblocktas01_item_nm_Jsonclick = "" ;
      lblTextblocktas01_item_ryak_Jsonclick = "" ;
      lblTextblocktas01_item_ryak2_Jsonclick = "" ;
      A334TAS01_DATA_KIND_NM = "" ;
      lblTextblocktas01_item_ryak3_Jsonclick = "" ;
      lblTextblocktas01_item_ryak4_Jsonclick = "" ;
      A336TAS01_CHAR_1 = "" ;
      lblTextblocktas01_item_ryak6_Jsonclick = "" ;
      A337TAS01_CHAR_2 = "" ;
      lblTextblocktas01_item_ryak7_Jsonclick = "" ;
      A338TAS01_CHAR_3 = "" ;
      lblTextblocktas01_item_ryak8_Jsonclick = "" ;
      A339TAS01_CHAR_4 = "" ;
      lblTextblocktas01_item_ryak9_Jsonclick = "" ;
      A340TAS01_CHAR_5 = "" ;
      lblTextblocktas01_item_ryak5_Jsonclick = "" ;
      A341TAS01_NUM_1 = DecimalUtil.ZERO ;
      lblTextblocktas01_item_ryak10_Jsonclick = "" ;
      A342TAS01_NUM_2 = DecimalUtil.ZERO ;
      lblTextblocktas01_item_ryak11_Jsonclick = "" ;
      A343TAS01_NUM_3 = DecimalUtil.ZERO ;
      lblTextblocktas01_item_ryak12_Jsonclick = "" ;
      A344TAS01_NUM_4 = DecimalUtil.ZERO ;
      lblTextblocktas01_item_ryak13_Jsonclick = "" ;
      A345TAS01_NUM_5 = DecimalUtil.ZERO ;
      lblTextblocktas01_del_flg_Jsonclick = "" ;
      lblTextblocktas01_crt_datetime_Jsonclick = "" ;
      lblTextblocktas01_crt_user_id_Jsonclick = "" ;
      lblTextblocktas01_crt_prog_nm_Jsonclick = "" ;
      lblTextblocktas01_upd_datetime_Jsonclick = "" ;
      lblTextblocktas01_upd_user_id_Jsonclick = "" ;
      lblTextblocktas01_upd_prog_nm_Jsonclick = "" ;
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
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV7C_TAM02_APP_ID = "" ;
      AV9W_ERRCD = "" ;
      AV12W_MSG = "" ;
      GXEncryptionTmp = "" ;
      AV8W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      GXv_SdtA_LOGIN_SDT3 = new SdtA_LOGIN_SDT [1] ;
      AV10W_KNGN_FLG = "" ;
      GXv_char2 = new String [1] ;
      T00054_A7TAS01_DATA_KIND = new String[] {""} ;
      T00054_A8TAS01_ITEM_CD = new String[] {""} ;
      T00054_A241TAS01_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00054_n241TAS01_CRT_DATETIME = new boolean[] {false} ;
      T00054_A269TAS01_CRT_USER_ID = new String[] {""} ;
      T00054_n269TAS01_CRT_USER_ID = new boolean[] {false} ;
      T00054_A244TAS01_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00054_n244TAS01_UPD_DATETIME = new boolean[] {false} ;
      T00054_A270TAS01_UPD_USER_ID = new String[] {""} ;
      T00054_n270TAS01_UPD_USER_ID = new boolean[] {false} ;
      T00054_A301TAS01_UPD_CNT = new long[1] ;
      T00054_n301TAS01_UPD_CNT = new boolean[] {false} ;
      T00054_A9TAS01_ITEM_NM = new String[] {""} ;
      T00054_n9TAS01_ITEM_NM = new boolean[] {false} ;
      T00054_A247TAS01_ITEM_RYAK = new String[] {""} ;
      T00054_n247TAS01_ITEM_RYAK = new boolean[] {false} ;
      T00054_A334TAS01_DATA_KIND_NM = new String[] {""} ;
      T00054_n334TAS01_DATA_KIND_NM = new boolean[] {false} ;
      T00054_A335TAS01_SORT_NO = new short[1] ;
      T00054_n335TAS01_SORT_NO = new boolean[] {false} ;
      T00054_A336TAS01_CHAR_1 = new String[] {""} ;
      T00054_n336TAS01_CHAR_1 = new boolean[] {false} ;
      T00054_A337TAS01_CHAR_2 = new String[] {""} ;
      T00054_n337TAS01_CHAR_2 = new boolean[] {false} ;
      T00054_A338TAS01_CHAR_3 = new String[] {""} ;
      T00054_n338TAS01_CHAR_3 = new boolean[] {false} ;
      T00054_A339TAS01_CHAR_4 = new String[] {""} ;
      T00054_n339TAS01_CHAR_4 = new boolean[] {false} ;
      T00054_A340TAS01_CHAR_5 = new String[] {""} ;
      T00054_n340TAS01_CHAR_5 = new boolean[] {false} ;
      T00054_A341TAS01_NUM_1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00054_n341TAS01_NUM_1 = new boolean[] {false} ;
      T00054_A342TAS01_NUM_2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00054_n342TAS01_NUM_2 = new boolean[] {false} ;
      T00054_A343TAS01_NUM_3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00054_n343TAS01_NUM_3 = new boolean[] {false} ;
      T00054_A344TAS01_NUM_4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00054_n344TAS01_NUM_4 = new boolean[] {false} ;
      T00054_A345TAS01_NUM_5 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00054_n345TAS01_NUM_5 = new boolean[] {false} ;
      T00054_A300TAS01_DEL_FLG = new String[] {""} ;
      T00054_n300TAS01_DEL_FLG = new boolean[] {false} ;
      T00054_A243TAS01_CRT_PROG_NM = new String[] {""} ;
      T00054_n243TAS01_CRT_PROG_NM = new boolean[] {false} ;
      T00054_A246TAS01_UPD_PROG_NM = new String[] {""} ;
      T00054_n246TAS01_UPD_PROG_NM = new boolean[] {false} ;
      T00055_A7TAS01_DATA_KIND = new String[] {""} ;
      T00055_A8TAS01_ITEM_CD = new String[] {""} ;
      T00053_A7TAS01_DATA_KIND = new String[] {""} ;
      T00053_A8TAS01_ITEM_CD = new String[] {""} ;
      T00053_A241TAS01_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00053_n241TAS01_CRT_DATETIME = new boolean[] {false} ;
      T00053_A269TAS01_CRT_USER_ID = new String[] {""} ;
      T00053_n269TAS01_CRT_USER_ID = new boolean[] {false} ;
      T00053_A244TAS01_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00053_n244TAS01_UPD_DATETIME = new boolean[] {false} ;
      T00053_A270TAS01_UPD_USER_ID = new String[] {""} ;
      T00053_n270TAS01_UPD_USER_ID = new boolean[] {false} ;
      T00053_A301TAS01_UPD_CNT = new long[1] ;
      T00053_n301TAS01_UPD_CNT = new boolean[] {false} ;
      T00053_A9TAS01_ITEM_NM = new String[] {""} ;
      T00053_n9TAS01_ITEM_NM = new boolean[] {false} ;
      T00053_A247TAS01_ITEM_RYAK = new String[] {""} ;
      T00053_n247TAS01_ITEM_RYAK = new boolean[] {false} ;
      T00053_A334TAS01_DATA_KIND_NM = new String[] {""} ;
      T00053_n334TAS01_DATA_KIND_NM = new boolean[] {false} ;
      T00053_A335TAS01_SORT_NO = new short[1] ;
      T00053_n335TAS01_SORT_NO = new boolean[] {false} ;
      T00053_A336TAS01_CHAR_1 = new String[] {""} ;
      T00053_n336TAS01_CHAR_1 = new boolean[] {false} ;
      T00053_A337TAS01_CHAR_2 = new String[] {""} ;
      T00053_n337TAS01_CHAR_2 = new boolean[] {false} ;
      T00053_A338TAS01_CHAR_3 = new String[] {""} ;
      T00053_n338TAS01_CHAR_3 = new boolean[] {false} ;
      T00053_A339TAS01_CHAR_4 = new String[] {""} ;
      T00053_n339TAS01_CHAR_4 = new boolean[] {false} ;
      T00053_A340TAS01_CHAR_5 = new String[] {""} ;
      T00053_n340TAS01_CHAR_5 = new boolean[] {false} ;
      T00053_A341TAS01_NUM_1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00053_n341TAS01_NUM_1 = new boolean[] {false} ;
      T00053_A342TAS01_NUM_2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00053_n342TAS01_NUM_2 = new boolean[] {false} ;
      T00053_A343TAS01_NUM_3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00053_n343TAS01_NUM_3 = new boolean[] {false} ;
      T00053_A344TAS01_NUM_4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00053_n344TAS01_NUM_4 = new boolean[] {false} ;
      T00053_A345TAS01_NUM_5 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00053_n345TAS01_NUM_5 = new boolean[] {false} ;
      T00053_A300TAS01_DEL_FLG = new String[] {""} ;
      T00053_n300TAS01_DEL_FLG = new boolean[] {false} ;
      T00053_A243TAS01_CRT_PROG_NM = new String[] {""} ;
      T00053_n243TAS01_CRT_PROG_NM = new boolean[] {false} ;
      T00053_A246TAS01_UPD_PROG_NM = new String[] {""} ;
      T00053_n246TAS01_UPD_PROG_NM = new boolean[] {false} ;
      sMode5 = "" ;
      T00056_A7TAS01_DATA_KIND = new String[] {""} ;
      T00056_A8TAS01_ITEM_CD = new String[] {""} ;
      T00057_A7TAS01_DATA_KIND = new String[] {""} ;
      T00057_A8TAS01_ITEM_CD = new String[] {""} ;
      T00052_A7TAS01_DATA_KIND = new String[] {""} ;
      T00052_A8TAS01_ITEM_CD = new String[] {""} ;
      T00052_A241TAS01_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00052_n241TAS01_CRT_DATETIME = new boolean[] {false} ;
      T00052_A269TAS01_CRT_USER_ID = new String[] {""} ;
      T00052_n269TAS01_CRT_USER_ID = new boolean[] {false} ;
      T00052_A244TAS01_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00052_n244TAS01_UPD_DATETIME = new boolean[] {false} ;
      T00052_A270TAS01_UPD_USER_ID = new String[] {""} ;
      T00052_n270TAS01_UPD_USER_ID = new boolean[] {false} ;
      T00052_A301TAS01_UPD_CNT = new long[1] ;
      T00052_n301TAS01_UPD_CNT = new boolean[] {false} ;
      T00052_A9TAS01_ITEM_NM = new String[] {""} ;
      T00052_n9TAS01_ITEM_NM = new boolean[] {false} ;
      T00052_A247TAS01_ITEM_RYAK = new String[] {""} ;
      T00052_n247TAS01_ITEM_RYAK = new boolean[] {false} ;
      T00052_A334TAS01_DATA_KIND_NM = new String[] {""} ;
      T00052_n334TAS01_DATA_KIND_NM = new boolean[] {false} ;
      T00052_A335TAS01_SORT_NO = new short[1] ;
      T00052_n335TAS01_SORT_NO = new boolean[] {false} ;
      T00052_A336TAS01_CHAR_1 = new String[] {""} ;
      T00052_n336TAS01_CHAR_1 = new boolean[] {false} ;
      T00052_A337TAS01_CHAR_2 = new String[] {""} ;
      T00052_n337TAS01_CHAR_2 = new boolean[] {false} ;
      T00052_A338TAS01_CHAR_3 = new String[] {""} ;
      T00052_n338TAS01_CHAR_3 = new boolean[] {false} ;
      T00052_A339TAS01_CHAR_4 = new String[] {""} ;
      T00052_n339TAS01_CHAR_4 = new boolean[] {false} ;
      T00052_A340TAS01_CHAR_5 = new String[] {""} ;
      T00052_n340TAS01_CHAR_5 = new boolean[] {false} ;
      T00052_A341TAS01_NUM_1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00052_n341TAS01_NUM_1 = new boolean[] {false} ;
      T00052_A342TAS01_NUM_2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00052_n342TAS01_NUM_2 = new boolean[] {false} ;
      T00052_A343TAS01_NUM_3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00052_n343TAS01_NUM_3 = new boolean[] {false} ;
      T00052_A344TAS01_NUM_4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00052_n344TAS01_NUM_4 = new boolean[] {false} ;
      T00052_A345TAS01_NUM_5 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00052_n345TAS01_NUM_5 = new boolean[] {false} ;
      T00052_A300TAS01_DEL_FLG = new String[] {""} ;
      T00052_n300TAS01_DEL_FLG = new boolean[] {false} ;
      T00052_A243TAS01_CRT_PROG_NM = new String[] {""} ;
      T00052_n243TAS01_CRT_PROG_NM = new boolean[] {false} ;
      T00052_A246TAS01_UPD_PROG_NM = new String[] {""} ;
      T00052_n246TAS01_UPD_PROG_NM = new boolean[] {false} ;
      T000511_A7TAS01_DATA_KIND = new String[] {""} ;
      T000511_A8TAS01_ITEM_CD = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i300TAS01_DEL_FLG = "" ;
      i243TAS01_CRT_PROG_NM = "" ;
      i246TAS01_UPD_PROG_NM = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String [1] ;
      ZV14Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tas01_cdnm__default(),
         new Object[] {
             new Object[] {
            T00052_A7TAS01_DATA_KIND, T00052_A8TAS01_ITEM_CD, T00052_A241TAS01_CRT_DATETIME, T00052_n241TAS01_CRT_DATETIME, T00052_A269TAS01_CRT_USER_ID, T00052_n269TAS01_CRT_USER_ID, T00052_A244TAS01_UPD_DATETIME, T00052_n244TAS01_UPD_DATETIME, T00052_A270TAS01_UPD_USER_ID, T00052_n270TAS01_UPD_USER_ID,
            T00052_A301TAS01_UPD_CNT, T00052_n301TAS01_UPD_CNT, T00052_A9TAS01_ITEM_NM, T00052_n9TAS01_ITEM_NM, T00052_A247TAS01_ITEM_RYAK, T00052_n247TAS01_ITEM_RYAK, T00052_A334TAS01_DATA_KIND_NM, T00052_n334TAS01_DATA_KIND_NM, T00052_A335TAS01_SORT_NO, T00052_n335TAS01_SORT_NO,
            T00052_A336TAS01_CHAR_1, T00052_n336TAS01_CHAR_1, T00052_A337TAS01_CHAR_2, T00052_n337TAS01_CHAR_2, T00052_A338TAS01_CHAR_3, T00052_n338TAS01_CHAR_3, T00052_A339TAS01_CHAR_4, T00052_n339TAS01_CHAR_4, T00052_A340TAS01_CHAR_5, T00052_n340TAS01_CHAR_5,
            T00052_A341TAS01_NUM_1, T00052_n341TAS01_NUM_1, T00052_A342TAS01_NUM_2, T00052_n342TAS01_NUM_2, T00052_A343TAS01_NUM_3, T00052_n343TAS01_NUM_3, T00052_A344TAS01_NUM_4, T00052_n344TAS01_NUM_4, T00052_A345TAS01_NUM_5, T00052_n345TAS01_NUM_5,
            T00052_A300TAS01_DEL_FLG, T00052_n300TAS01_DEL_FLG, T00052_A243TAS01_CRT_PROG_NM, T00052_n243TAS01_CRT_PROG_NM, T00052_A246TAS01_UPD_PROG_NM, T00052_n246TAS01_UPD_PROG_NM
            }
            , new Object[] {
            T00053_A7TAS01_DATA_KIND, T00053_A8TAS01_ITEM_CD, T00053_A241TAS01_CRT_DATETIME, T00053_n241TAS01_CRT_DATETIME, T00053_A269TAS01_CRT_USER_ID, T00053_n269TAS01_CRT_USER_ID, T00053_A244TAS01_UPD_DATETIME, T00053_n244TAS01_UPD_DATETIME, T00053_A270TAS01_UPD_USER_ID, T00053_n270TAS01_UPD_USER_ID,
            T00053_A301TAS01_UPD_CNT, T00053_n301TAS01_UPD_CNT, T00053_A9TAS01_ITEM_NM, T00053_n9TAS01_ITEM_NM, T00053_A247TAS01_ITEM_RYAK, T00053_n247TAS01_ITEM_RYAK, T00053_A334TAS01_DATA_KIND_NM, T00053_n334TAS01_DATA_KIND_NM, T00053_A335TAS01_SORT_NO, T00053_n335TAS01_SORT_NO,
            T00053_A336TAS01_CHAR_1, T00053_n336TAS01_CHAR_1, T00053_A337TAS01_CHAR_2, T00053_n337TAS01_CHAR_2, T00053_A338TAS01_CHAR_3, T00053_n338TAS01_CHAR_3, T00053_A339TAS01_CHAR_4, T00053_n339TAS01_CHAR_4, T00053_A340TAS01_CHAR_5, T00053_n340TAS01_CHAR_5,
            T00053_A341TAS01_NUM_1, T00053_n341TAS01_NUM_1, T00053_A342TAS01_NUM_2, T00053_n342TAS01_NUM_2, T00053_A343TAS01_NUM_3, T00053_n343TAS01_NUM_3, T00053_A344TAS01_NUM_4, T00053_n344TAS01_NUM_4, T00053_A345TAS01_NUM_5, T00053_n345TAS01_NUM_5,
            T00053_A300TAS01_DEL_FLG, T00053_n300TAS01_DEL_FLG, T00053_A243TAS01_CRT_PROG_NM, T00053_n243TAS01_CRT_PROG_NM, T00053_A246TAS01_UPD_PROG_NM, T00053_n246TAS01_UPD_PROG_NM
            }
            , new Object[] {
            T00054_A7TAS01_DATA_KIND, T00054_A8TAS01_ITEM_CD, T00054_A241TAS01_CRT_DATETIME, T00054_n241TAS01_CRT_DATETIME, T00054_A269TAS01_CRT_USER_ID, T00054_n269TAS01_CRT_USER_ID, T00054_A244TAS01_UPD_DATETIME, T00054_n244TAS01_UPD_DATETIME, T00054_A270TAS01_UPD_USER_ID, T00054_n270TAS01_UPD_USER_ID,
            T00054_A301TAS01_UPD_CNT, T00054_n301TAS01_UPD_CNT, T00054_A9TAS01_ITEM_NM, T00054_n9TAS01_ITEM_NM, T00054_A247TAS01_ITEM_RYAK, T00054_n247TAS01_ITEM_RYAK, T00054_A334TAS01_DATA_KIND_NM, T00054_n334TAS01_DATA_KIND_NM, T00054_A335TAS01_SORT_NO, T00054_n335TAS01_SORT_NO,
            T00054_A336TAS01_CHAR_1, T00054_n336TAS01_CHAR_1, T00054_A337TAS01_CHAR_2, T00054_n337TAS01_CHAR_2, T00054_A338TAS01_CHAR_3, T00054_n338TAS01_CHAR_3, T00054_A339TAS01_CHAR_4, T00054_n339TAS01_CHAR_4, T00054_A340TAS01_CHAR_5, T00054_n340TAS01_CHAR_5,
            T00054_A341TAS01_NUM_1, T00054_n341TAS01_NUM_1, T00054_A342TAS01_NUM_2, T00054_n342TAS01_NUM_2, T00054_A343TAS01_NUM_3, T00054_n343TAS01_NUM_3, T00054_A344TAS01_NUM_4, T00054_n344TAS01_NUM_4, T00054_A345TAS01_NUM_5, T00054_n345TAS01_NUM_5,
            T00054_A300TAS01_DEL_FLG, T00054_n300TAS01_DEL_FLG, T00054_A243TAS01_CRT_PROG_NM, T00054_n243TAS01_CRT_PROG_NM, T00054_A246TAS01_UPD_PROG_NM, T00054_n246TAS01_UPD_PROG_NM
            }
            , new Object[] {
            T00055_A7TAS01_DATA_KIND, T00055_A8TAS01_ITEM_CD
            }
            , new Object[] {
            T00056_A7TAS01_DATA_KIND, T00056_A8TAS01_ITEM_CD
            }
            , new Object[] {
            T00057_A7TAS01_DATA_KIND, T00057_A8TAS01_ITEM_CD
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000511_A7TAS01_DATA_KIND, T000511_A8TAS01_ITEM_CD
            }
         }
      );
      pr_default.setErrorHandler(this);
      Z246TAS01_UPD_PROG_NM = AV14Pgmname ;
      n246TAS01_UPD_PROG_NM = false ;
      Z243TAS01_CRT_PROG_NM = AV14Pgmname ;
      n243TAS01_CRT_PROG_NM = false ;
      AV14Pgmname = "TAS01_CDNM" ;
      Z300TAS01_DEL_FLG = "0" ;
      n300TAS01_DEL_FLG = false ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short Z335TAS01_SORT_NO ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A335TAS01_SORT_NO ;
   private short RcdFound5 ;
   private short Gx_err ;
   private int trnEnded ;
   private int lblBtn_cancel_Enabled ;
   private int imgImage19_Visible ;
   private int edtTAS01_DATA_KIND_Enabled ;
   private int imgImage20_Visible ;
   private int edtTAS01_ITEM_CD_Enabled ;
   private int imgImage21_Visible ;
   private int edtTAS01_ITEM_NM_Enabled ;
   private int edtTAS01_ITEM_RYAK_Enabled ;
   private int edtTAS01_DATA_KIND_NM_Enabled ;
   private int edtTAS01_SORT_NO_Enabled ;
   private int edtTAS01_CHAR_1_Enabled ;
   private int edtTAS01_CHAR_2_Enabled ;
   private int edtTAS01_CHAR_3_Enabled ;
   private int edtTAS01_CHAR_4_Enabled ;
   private int edtTAS01_CHAR_5_Enabled ;
   private int edtTAS01_NUM_1_Enabled ;
   private int edtTAS01_NUM_2_Enabled ;
   private int edtTAS01_NUM_3_Enabled ;
   private int edtTAS01_NUM_4_Enabled ;
   private int edtTAS01_NUM_5_Enabled ;
   private int edtTAS01_CRT_DATETIME_Visible ;
   private int edtTAS01_CRT_DATETIME_Enabled ;
   private int edtTAS01_CRT_USER_ID_Enabled ;
   private int edtTAS01_CRT_PROG_NM_Visible ;
   private int edtTAS01_CRT_PROG_NM_Enabled ;
   private int edtTAS01_UPD_DATETIME_Visible ;
   private int edtTAS01_UPD_DATETIME_Enabled ;
   private int edtTAS01_UPD_USER_ID_Enabled ;
   private int edtTAS01_UPD_PROG_NM_Visible ;
   private int edtTAS01_UPD_PROG_NM_Enabled ;
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
   private long Z301TAS01_UPD_CNT ;
   private long O301TAS01_UPD_CNT ;
   private long A301TAS01_UPD_CNT ;
   private java.math.BigDecimal Z341TAS01_NUM_1 ;
   private java.math.BigDecimal Z342TAS01_NUM_2 ;
   private java.math.BigDecimal Z343TAS01_NUM_3 ;
   private java.math.BigDecimal Z344TAS01_NUM_4 ;
   private java.math.BigDecimal Z345TAS01_NUM_5 ;
   private java.math.BigDecimal A341TAS01_NUM_1 ;
   private java.math.BigDecimal A342TAS01_NUM_2 ;
   private java.math.BigDecimal A343TAS01_NUM_3 ;
   private java.math.BigDecimal A344TAS01_NUM_4 ;
   private java.math.BigDecimal A345TAS01_NUM_5 ;
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
   private String edtTAS01_DATA_KIND_Internalname ;
   private String sStyleString ;
   private String tblTablemain_Internalname ;
   private String grpGroupdata_Internalname ;
   private String tblTable1_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String tblTable4_Internalname ;
   private String lblTextblock44_Internalname ;
   private String lblTextblock44_Jsonclick ;
   private String lblTextblock45_Internalname ;
   private String lblTextblock45_Jsonclick ;
   private String lblBtn_cancel_Internalname ;
   private String lblBtn_cancel_Jsonclick ;
   private String tblTable2_Internalname ;
   private String imgImage19_Internalname ;
   private String lblTextblocktas01_data_kind_Internalname ;
   private String lblTextblocktas01_data_kind_Jsonclick ;
   private String TempTags ;
   private String edtTAS01_DATA_KIND_Jsonclick ;
   private String imgImage20_Internalname ;
   private String lblTextblocktas01_item_cd_Internalname ;
   private String lblTextblocktas01_item_cd_Jsonclick ;
   private String edtTAS01_ITEM_CD_Internalname ;
   private String edtTAS01_ITEM_CD_Jsonclick ;
   private String imgImage21_Internalname ;
   private String lblTextblocktas01_item_nm_Internalname ;
   private String lblTextblocktas01_item_nm_Jsonclick ;
   private String edtTAS01_ITEM_NM_Internalname ;
   private String edtTAS01_ITEM_NM_Jsonclick ;
   private String lblTextblocktas01_item_ryak_Internalname ;
   private String lblTextblocktas01_item_ryak_Jsonclick ;
   private String edtTAS01_ITEM_RYAK_Internalname ;
   private String edtTAS01_ITEM_RYAK_Jsonclick ;
   private String lblTextblocktas01_item_ryak2_Internalname ;
   private String lblTextblocktas01_item_ryak2_Jsonclick ;
   private String edtTAS01_DATA_KIND_NM_Internalname ;
   private String edtTAS01_DATA_KIND_NM_Jsonclick ;
   private String lblTextblocktas01_item_ryak3_Internalname ;
   private String lblTextblocktas01_item_ryak3_Jsonclick ;
   private String edtTAS01_SORT_NO_Internalname ;
   private String edtTAS01_SORT_NO_Jsonclick ;
   private String lblTextblocktas01_item_ryak4_Internalname ;
   private String lblTextblocktas01_item_ryak4_Jsonclick ;
   private String edtTAS01_CHAR_1_Internalname ;
   private String edtTAS01_CHAR_1_Jsonclick ;
   private String lblTextblocktas01_item_ryak6_Internalname ;
   private String lblTextblocktas01_item_ryak6_Jsonclick ;
   private String edtTAS01_CHAR_2_Internalname ;
   private String edtTAS01_CHAR_2_Jsonclick ;
   private String lblTextblocktas01_item_ryak7_Internalname ;
   private String lblTextblocktas01_item_ryak7_Jsonclick ;
   private String edtTAS01_CHAR_3_Internalname ;
   private String edtTAS01_CHAR_3_Jsonclick ;
   private String lblTextblocktas01_item_ryak8_Internalname ;
   private String lblTextblocktas01_item_ryak8_Jsonclick ;
   private String edtTAS01_CHAR_4_Internalname ;
   private String edtTAS01_CHAR_4_Jsonclick ;
   private String lblTextblocktas01_item_ryak9_Internalname ;
   private String lblTextblocktas01_item_ryak9_Jsonclick ;
   private String edtTAS01_CHAR_5_Internalname ;
   private String edtTAS01_CHAR_5_Jsonclick ;
   private String lblTextblocktas01_item_ryak5_Internalname ;
   private String lblTextblocktas01_item_ryak5_Jsonclick ;
   private String edtTAS01_NUM_1_Internalname ;
   private String edtTAS01_NUM_1_Jsonclick ;
   private String lblTextblocktas01_item_ryak10_Internalname ;
   private String lblTextblocktas01_item_ryak10_Jsonclick ;
   private String edtTAS01_NUM_2_Internalname ;
   private String edtTAS01_NUM_2_Jsonclick ;
   private String lblTextblocktas01_item_ryak11_Internalname ;
   private String lblTextblocktas01_item_ryak11_Jsonclick ;
   private String edtTAS01_NUM_3_Internalname ;
   private String edtTAS01_NUM_3_Jsonclick ;
   private String lblTextblocktas01_item_ryak12_Internalname ;
   private String lblTextblocktas01_item_ryak12_Jsonclick ;
   private String edtTAS01_NUM_4_Internalname ;
   private String edtTAS01_NUM_4_Jsonclick ;
   private String lblTextblocktas01_item_ryak13_Internalname ;
   private String lblTextblocktas01_item_ryak13_Jsonclick ;
   private String edtTAS01_NUM_5_Internalname ;
   private String edtTAS01_NUM_5_Jsonclick ;
   private String lblTextblocktas01_del_flg_Internalname ;
   private String lblTextblocktas01_del_flg_Jsonclick ;
   private String lblTextblocktas01_crt_datetime_Internalname ;
   private String lblTextblocktas01_crt_datetime_Jsonclick ;
   private String edtTAS01_CRT_DATETIME_Internalname ;
   private String edtTAS01_CRT_DATETIME_Jsonclick ;
   private String lblTextblocktas01_crt_user_id_Internalname ;
   private String lblTextblocktas01_crt_user_id_Jsonclick ;
   private String edtTAS01_CRT_USER_ID_Internalname ;
   private String edtTAS01_CRT_USER_ID_Jsonclick ;
   private String lblTextblocktas01_crt_prog_nm_Internalname ;
   private String lblTextblocktas01_crt_prog_nm_Jsonclick ;
   private String edtTAS01_CRT_PROG_NM_Internalname ;
   private String edtTAS01_CRT_PROG_NM_Jsonclick ;
   private String lblTextblocktas01_upd_datetime_Internalname ;
   private String lblTextblocktas01_upd_datetime_Jsonclick ;
   private String edtTAS01_UPD_DATETIME_Internalname ;
   private String edtTAS01_UPD_DATETIME_Jsonclick ;
   private String lblTextblocktas01_upd_user_id_Internalname ;
   private String lblTextblocktas01_upd_user_id_Jsonclick ;
   private String edtTAS01_UPD_USER_ID_Internalname ;
   private String edtTAS01_UPD_USER_ID_Jsonclick ;
   private String lblTextblocktas01_upd_prog_nm_Internalname ;
   private String lblTextblocktas01_upd_prog_nm_Jsonclick ;
   private String edtTAS01_UPD_PROG_NM_Internalname ;
   private String edtTAS01_UPD_PROG_NM_Jsonclick ;
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
   private String GXv_char2[] ;
   private String sMode5 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String div_Internalname ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String ZV14Pgmname ;
   private String Gx_emsg ;
   private java.util.Date Z241TAS01_CRT_DATETIME ;
   private java.util.Date Z244TAS01_UPD_DATETIME ;
   private java.util.Date A241TAS01_CRT_DATETIME ;
   private java.util.Date A244TAS01_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean n9TAS01_ITEM_NM ;
   private boolean n247TAS01_ITEM_RYAK ;
   private boolean n300TAS01_DEL_FLG ;
   private boolean n241TAS01_CRT_DATETIME ;
   private boolean n269TAS01_CRT_USER_ID ;
   private boolean n243TAS01_CRT_PROG_NM ;
   private boolean n244TAS01_UPD_DATETIME ;
   private boolean n270TAS01_UPD_USER_ID ;
   private boolean n246TAS01_UPD_PROG_NM ;
   private boolean n301TAS01_UPD_CNT ;
   private boolean wbErr ;
   private boolean n334TAS01_DATA_KIND_NM ;
   private boolean n335TAS01_SORT_NO ;
   private boolean n336TAS01_CHAR_1 ;
   private boolean n337TAS01_CHAR_2 ;
   private boolean n338TAS01_CHAR_3 ;
   private boolean n339TAS01_CHAR_4 ;
   private boolean n340TAS01_CHAR_5 ;
   private boolean n341TAS01_NUM_1 ;
   private boolean n342TAS01_NUM_2 ;
   private boolean n343TAS01_NUM_3 ;
   private boolean n344TAS01_NUM_4 ;
   private boolean n345TAS01_NUM_5 ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean toggleJsOutput ;
   private String Z7TAS01_DATA_KIND ;
   private String Z8TAS01_ITEM_CD ;
   private String Z269TAS01_CRT_USER_ID ;
   private String Z270TAS01_UPD_USER_ID ;
   private String Z9TAS01_ITEM_NM ;
   private String Z247TAS01_ITEM_RYAK ;
   private String Z334TAS01_DATA_KIND_NM ;
   private String Z336TAS01_CHAR_1 ;
   private String Z337TAS01_CHAR_2 ;
   private String Z338TAS01_CHAR_3 ;
   private String Z339TAS01_CHAR_4 ;
   private String Z340TAS01_CHAR_5 ;
   private String Z300TAS01_DEL_FLG ;
   private String Z243TAS01_CRT_PROG_NM ;
   private String Z246TAS01_UPD_PROG_NM ;
   private String A7TAS01_DATA_KIND ;
   private String A8TAS01_ITEM_CD ;
   private String A9TAS01_ITEM_NM ;
   private String A247TAS01_ITEM_RYAK ;
   private String A300TAS01_DEL_FLG ;
   private String A269TAS01_CRT_USER_ID ;
   private String A243TAS01_CRT_PROG_NM ;
   private String A270TAS01_UPD_USER_ID ;
   private String A246TAS01_UPD_PROG_NM ;
   private String A334TAS01_DATA_KIND_NM ;
   private String A336TAS01_CHAR_1 ;
   private String A337TAS01_CHAR_2 ;
   private String A338TAS01_CHAR_3 ;
   private String A339TAS01_CHAR_4 ;
   private String A340TAS01_CHAR_5 ;
   private String AV7C_TAM02_APP_ID ;
   private String AV9W_ERRCD ;
   private String AV12W_MSG ;
   private String AV10W_KNGN_FLG ;
   private String i300TAS01_DEL_FLG ;
   private String i243TAS01_CRT_PROG_NM ;
   private String i246TAS01_UPD_PROG_NM ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private HTMLChoice radTAS01_DEL_FLG ;
   private IDataStoreProvider pr_default ;
   private String[] T00054_A7TAS01_DATA_KIND ;
   private String[] T00054_A8TAS01_ITEM_CD ;
   private java.util.Date[] T00054_A241TAS01_CRT_DATETIME ;
   private boolean[] T00054_n241TAS01_CRT_DATETIME ;
   private String[] T00054_A269TAS01_CRT_USER_ID ;
   private boolean[] T00054_n269TAS01_CRT_USER_ID ;
   private java.util.Date[] T00054_A244TAS01_UPD_DATETIME ;
   private boolean[] T00054_n244TAS01_UPD_DATETIME ;
   private String[] T00054_A270TAS01_UPD_USER_ID ;
   private boolean[] T00054_n270TAS01_UPD_USER_ID ;
   private long[] T00054_A301TAS01_UPD_CNT ;
   private boolean[] T00054_n301TAS01_UPD_CNT ;
   private String[] T00054_A9TAS01_ITEM_NM ;
   private boolean[] T00054_n9TAS01_ITEM_NM ;
   private String[] T00054_A247TAS01_ITEM_RYAK ;
   private boolean[] T00054_n247TAS01_ITEM_RYAK ;
   private String[] T00054_A334TAS01_DATA_KIND_NM ;
   private boolean[] T00054_n334TAS01_DATA_KIND_NM ;
   private short[] T00054_A335TAS01_SORT_NO ;
   private boolean[] T00054_n335TAS01_SORT_NO ;
   private String[] T00054_A336TAS01_CHAR_1 ;
   private boolean[] T00054_n336TAS01_CHAR_1 ;
   private String[] T00054_A337TAS01_CHAR_2 ;
   private boolean[] T00054_n337TAS01_CHAR_2 ;
   private String[] T00054_A338TAS01_CHAR_3 ;
   private boolean[] T00054_n338TAS01_CHAR_3 ;
   private String[] T00054_A339TAS01_CHAR_4 ;
   private boolean[] T00054_n339TAS01_CHAR_4 ;
   private String[] T00054_A340TAS01_CHAR_5 ;
   private boolean[] T00054_n340TAS01_CHAR_5 ;
   private java.math.BigDecimal[] T00054_A341TAS01_NUM_1 ;
   private boolean[] T00054_n341TAS01_NUM_1 ;
   private java.math.BigDecimal[] T00054_A342TAS01_NUM_2 ;
   private boolean[] T00054_n342TAS01_NUM_2 ;
   private java.math.BigDecimal[] T00054_A343TAS01_NUM_3 ;
   private boolean[] T00054_n343TAS01_NUM_3 ;
   private java.math.BigDecimal[] T00054_A344TAS01_NUM_4 ;
   private boolean[] T00054_n344TAS01_NUM_4 ;
   private java.math.BigDecimal[] T00054_A345TAS01_NUM_5 ;
   private boolean[] T00054_n345TAS01_NUM_5 ;
   private String[] T00054_A300TAS01_DEL_FLG ;
   private boolean[] T00054_n300TAS01_DEL_FLG ;
   private String[] T00054_A243TAS01_CRT_PROG_NM ;
   private boolean[] T00054_n243TAS01_CRT_PROG_NM ;
   private String[] T00054_A246TAS01_UPD_PROG_NM ;
   private boolean[] T00054_n246TAS01_UPD_PROG_NM ;
   private String[] T00055_A7TAS01_DATA_KIND ;
   private String[] T00055_A8TAS01_ITEM_CD ;
   private String[] T00053_A7TAS01_DATA_KIND ;
   private String[] T00053_A8TAS01_ITEM_CD ;
   private java.util.Date[] T00053_A241TAS01_CRT_DATETIME ;
   private boolean[] T00053_n241TAS01_CRT_DATETIME ;
   private String[] T00053_A269TAS01_CRT_USER_ID ;
   private boolean[] T00053_n269TAS01_CRT_USER_ID ;
   private java.util.Date[] T00053_A244TAS01_UPD_DATETIME ;
   private boolean[] T00053_n244TAS01_UPD_DATETIME ;
   private String[] T00053_A270TAS01_UPD_USER_ID ;
   private boolean[] T00053_n270TAS01_UPD_USER_ID ;
   private long[] T00053_A301TAS01_UPD_CNT ;
   private boolean[] T00053_n301TAS01_UPD_CNT ;
   private String[] T00053_A9TAS01_ITEM_NM ;
   private boolean[] T00053_n9TAS01_ITEM_NM ;
   private String[] T00053_A247TAS01_ITEM_RYAK ;
   private boolean[] T00053_n247TAS01_ITEM_RYAK ;
   private String[] T00053_A334TAS01_DATA_KIND_NM ;
   private boolean[] T00053_n334TAS01_DATA_KIND_NM ;
   private short[] T00053_A335TAS01_SORT_NO ;
   private boolean[] T00053_n335TAS01_SORT_NO ;
   private String[] T00053_A336TAS01_CHAR_1 ;
   private boolean[] T00053_n336TAS01_CHAR_1 ;
   private String[] T00053_A337TAS01_CHAR_2 ;
   private boolean[] T00053_n337TAS01_CHAR_2 ;
   private String[] T00053_A338TAS01_CHAR_3 ;
   private boolean[] T00053_n338TAS01_CHAR_3 ;
   private String[] T00053_A339TAS01_CHAR_4 ;
   private boolean[] T00053_n339TAS01_CHAR_4 ;
   private String[] T00053_A340TAS01_CHAR_5 ;
   private boolean[] T00053_n340TAS01_CHAR_5 ;
   private java.math.BigDecimal[] T00053_A341TAS01_NUM_1 ;
   private boolean[] T00053_n341TAS01_NUM_1 ;
   private java.math.BigDecimal[] T00053_A342TAS01_NUM_2 ;
   private boolean[] T00053_n342TAS01_NUM_2 ;
   private java.math.BigDecimal[] T00053_A343TAS01_NUM_3 ;
   private boolean[] T00053_n343TAS01_NUM_3 ;
   private java.math.BigDecimal[] T00053_A344TAS01_NUM_4 ;
   private boolean[] T00053_n344TAS01_NUM_4 ;
   private java.math.BigDecimal[] T00053_A345TAS01_NUM_5 ;
   private boolean[] T00053_n345TAS01_NUM_5 ;
   private String[] T00053_A300TAS01_DEL_FLG ;
   private boolean[] T00053_n300TAS01_DEL_FLG ;
   private String[] T00053_A243TAS01_CRT_PROG_NM ;
   private boolean[] T00053_n243TAS01_CRT_PROG_NM ;
   private String[] T00053_A246TAS01_UPD_PROG_NM ;
   private boolean[] T00053_n246TAS01_UPD_PROG_NM ;
   private String[] T00056_A7TAS01_DATA_KIND ;
   private String[] T00056_A8TAS01_ITEM_CD ;
   private String[] T00057_A7TAS01_DATA_KIND ;
   private String[] T00057_A8TAS01_ITEM_CD ;
   private String[] T00052_A7TAS01_DATA_KIND ;
   private String[] T00052_A8TAS01_ITEM_CD ;
   private java.util.Date[] T00052_A241TAS01_CRT_DATETIME ;
   private boolean[] T00052_n241TAS01_CRT_DATETIME ;
   private String[] T00052_A269TAS01_CRT_USER_ID ;
   private boolean[] T00052_n269TAS01_CRT_USER_ID ;
   private java.util.Date[] T00052_A244TAS01_UPD_DATETIME ;
   private boolean[] T00052_n244TAS01_UPD_DATETIME ;
   private String[] T00052_A270TAS01_UPD_USER_ID ;
   private boolean[] T00052_n270TAS01_UPD_USER_ID ;
   private long[] T00052_A301TAS01_UPD_CNT ;
   private boolean[] T00052_n301TAS01_UPD_CNT ;
   private String[] T00052_A9TAS01_ITEM_NM ;
   private boolean[] T00052_n9TAS01_ITEM_NM ;
   private String[] T00052_A247TAS01_ITEM_RYAK ;
   private boolean[] T00052_n247TAS01_ITEM_RYAK ;
   private String[] T00052_A334TAS01_DATA_KIND_NM ;
   private boolean[] T00052_n334TAS01_DATA_KIND_NM ;
   private short[] T00052_A335TAS01_SORT_NO ;
   private boolean[] T00052_n335TAS01_SORT_NO ;
   private String[] T00052_A336TAS01_CHAR_1 ;
   private boolean[] T00052_n336TAS01_CHAR_1 ;
   private String[] T00052_A337TAS01_CHAR_2 ;
   private boolean[] T00052_n337TAS01_CHAR_2 ;
   private String[] T00052_A338TAS01_CHAR_3 ;
   private boolean[] T00052_n338TAS01_CHAR_3 ;
   private String[] T00052_A339TAS01_CHAR_4 ;
   private boolean[] T00052_n339TAS01_CHAR_4 ;
   private String[] T00052_A340TAS01_CHAR_5 ;
   private boolean[] T00052_n340TAS01_CHAR_5 ;
   private java.math.BigDecimal[] T00052_A341TAS01_NUM_1 ;
   private boolean[] T00052_n341TAS01_NUM_1 ;
   private java.math.BigDecimal[] T00052_A342TAS01_NUM_2 ;
   private boolean[] T00052_n342TAS01_NUM_2 ;
   private java.math.BigDecimal[] T00052_A343TAS01_NUM_3 ;
   private boolean[] T00052_n343TAS01_NUM_3 ;
   private java.math.BigDecimal[] T00052_A344TAS01_NUM_4 ;
   private boolean[] T00052_n344TAS01_NUM_4 ;
   private java.math.BigDecimal[] T00052_A345TAS01_NUM_5 ;
   private boolean[] T00052_n345TAS01_NUM_5 ;
   private String[] T00052_A300TAS01_DEL_FLG ;
   private boolean[] T00052_n300TAS01_DEL_FLG ;
   private String[] T00052_A243TAS01_CRT_PROG_NM ;
   private boolean[] T00052_n243TAS01_CRT_PROG_NM ;
   private String[] T00052_A246TAS01_UPD_PROG_NM ;
   private boolean[] T00052_n246TAS01_UPD_PROG_NM ;
   private String[] T000511_A7TAS01_DATA_KIND ;
   private String[] T000511_A8TAS01_ITEM_CD ;
   private SdtA_LOGIN_SDT AV8W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT3[] ;
}

final  class tas01_cdnm__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00052", "SELECT `TAS01_DATA_KIND`, `TAS01_ITEM_CD`, `TAS01_CRT_DATETIME`, `TAS01_CRT_USER_ID`, `TAS01_UPD_DATETIME`, `TAS01_UPD_USER_ID`, `TAS01_UPD_CNT`, `TAS01_ITEM_NM`, `TAS01_ITEM_RYAK`, `TAS01_DATA_KIND_NM`, `TAS01_SORT_NO`, `TAS01_CHAR_1`, `TAS01_CHAR_2`, `TAS01_CHAR_3`, `TAS01_CHAR_4`, `TAS01_CHAR_5`, `TAS01_NUM_1`, `TAS01_NUM_2`, `TAS01_NUM_3`, `TAS01_NUM_4`, `TAS01_NUM_5`, `TAS01_DEL_FLG`, `TAS01_CRT_PROG_NM`, `TAS01_UPD_PROG_NM` FROM `TAS01_CDNM` WHERE `TAS01_DATA_KIND` = ? AND `TAS01_ITEM_CD` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00053", "SELECT `TAS01_DATA_KIND`, `TAS01_ITEM_CD`, `TAS01_CRT_DATETIME`, `TAS01_CRT_USER_ID`, `TAS01_UPD_DATETIME`, `TAS01_UPD_USER_ID`, `TAS01_UPD_CNT`, `TAS01_ITEM_NM`, `TAS01_ITEM_RYAK`, `TAS01_DATA_KIND_NM`, `TAS01_SORT_NO`, `TAS01_CHAR_1`, `TAS01_CHAR_2`, `TAS01_CHAR_3`, `TAS01_CHAR_4`, `TAS01_CHAR_5`, `TAS01_NUM_1`, `TAS01_NUM_2`, `TAS01_NUM_3`, `TAS01_NUM_4`, `TAS01_NUM_5`, `TAS01_DEL_FLG`, `TAS01_CRT_PROG_NM`, `TAS01_UPD_PROG_NM` FROM `TAS01_CDNM` WHERE `TAS01_DATA_KIND` = ? AND `TAS01_ITEM_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00054", "SELECT TM1.`TAS01_DATA_KIND`, TM1.`TAS01_ITEM_CD`, TM1.`TAS01_CRT_DATETIME`, TM1.`TAS01_CRT_USER_ID`, TM1.`TAS01_UPD_DATETIME`, TM1.`TAS01_UPD_USER_ID`, TM1.`TAS01_UPD_CNT`, TM1.`TAS01_ITEM_NM`, TM1.`TAS01_ITEM_RYAK`, TM1.`TAS01_DATA_KIND_NM`, TM1.`TAS01_SORT_NO`, TM1.`TAS01_CHAR_1`, TM1.`TAS01_CHAR_2`, TM1.`TAS01_CHAR_3`, TM1.`TAS01_CHAR_4`, TM1.`TAS01_CHAR_5`, TM1.`TAS01_NUM_1`, TM1.`TAS01_NUM_2`, TM1.`TAS01_NUM_3`, TM1.`TAS01_NUM_4`, TM1.`TAS01_NUM_5`, TM1.`TAS01_DEL_FLG`, TM1.`TAS01_CRT_PROG_NM`, TM1.`TAS01_UPD_PROG_NM` FROM `TAS01_CDNM` TM1 WHERE TM1.`TAS01_DATA_KIND` = ? and TM1.`TAS01_ITEM_CD` = ? ORDER BY TM1.`TAS01_DATA_KIND`, TM1.`TAS01_ITEM_CD` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T00055", "SELECT `TAS01_DATA_KIND`, `TAS01_ITEM_CD` FROM `TAS01_CDNM` WHERE `TAS01_DATA_KIND` = ? AND `TAS01_ITEM_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00056", "SELECT `TAS01_DATA_KIND`, `TAS01_ITEM_CD` FROM `TAS01_CDNM` WHERE ( `TAS01_DATA_KIND` > ? or `TAS01_DATA_KIND` = ? and `TAS01_ITEM_CD` > ?) ORDER BY `TAS01_DATA_KIND`, `TAS01_ITEM_CD`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T00057", "SELECT `TAS01_DATA_KIND`, `TAS01_ITEM_CD` FROM `TAS01_CDNM` WHERE ( `TAS01_DATA_KIND` < ? or `TAS01_DATA_KIND` = ? and `TAS01_ITEM_CD` < ?) ORDER BY `TAS01_DATA_KIND` DESC, `TAS01_ITEM_CD` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T00058", "INSERT INTO `TAS01_CDNM`(`TAS01_DATA_KIND`, `TAS01_ITEM_CD`, `TAS01_CRT_DATETIME`, `TAS01_CRT_USER_ID`, `TAS01_UPD_DATETIME`, `TAS01_UPD_USER_ID`, `TAS01_UPD_CNT`, `TAS01_ITEM_NM`, `TAS01_ITEM_RYAK`, `TAS01_DATA_KIND_NM`, `TAS01_SORT_NO`, `TAS01_CHAR_1`, `TAS01_CHAR_2`, `TAS01_CHAR_3`, `TAS01_CHAR_4`, `TAS01_CHAR_5`, `TAS01_NUM_1`, `TAS01_NUM_2`, `TAS01_NUM_3`, `TAS01_NUM_4`, `TAS01_NUM_5`, `TAS01_DEL_FLG`, `TAS01_CRT_PROG_NM`, `TAS01_UPD_PROG_NM`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T00059", "UPDATE `TAS01_CDNM` SET `TAS01_CRT_DATETIME`=?, `TAS01_CRT_USER_ID`=?, `TAS01_UPD_DATETIME`=?, `TAS01_UPD_USER_ID`=?, `TAS01_UPD_CNT`=?, `TAS01_ITEM_NM`=?, `TAS01_ITEM_RYAK`=?, `TAS01_DATA_KIND_NM`=?, `TAS01_SORT_NO`=?, `TAS01_CHAR_1`=?, `TAS01_CHAR_2`=?, `TAS01_CHAR_3`=?, `TAS01_CHAR_4`=?, `TAS01_CHAR_5`=?, `TAS01_NUM_1`=?, `TAS01_NUM_2`=?, `TAS01_NUM_3`=?, `TAS01_NUM_4`=?, `TAS01_NUM_5`=?, `TAS01_DEL_FLG`=?, `TAS01_CRT_PROG_NM`=?, `TAS01_UPD_PROG_NM`=?  WHERE `TAS01_DATA_KIND` = ? AND `TAS01_ITEM_CD` = ?", GX_NOMASK)
         ,new UpdateCursor("T000510", "DELETE FROM `TAS01_CDNM`  WHERE `TAS01_DATA_KIND` = ? AND `TAS01_ITEM_CD` = ?", GX_NOMASK)
         ,new ForEachCursor("T000511", "SELECT `TAS01_DATA_KIND`, `TAS01_ITEM_CD` FROM `TAS01_CDNM` ORDER BY `TAS01_DATA_KIND`, `TAS01_ITEM_CD` ",true, GX_NOMASK, false, this,100,0,false )
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((long[]) buf[10])[0] = rslt.getLong(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(11) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(17,4) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(18,4) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(19,4) ;
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(20,4) ;
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[38])[0] = rslt.getBigDecimal(21,4) ;
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((long[]) buf[10])[0] = rslt.getLong(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(11) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(17,4) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(18,4) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(19,4) ;
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(20,4) ;
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[38])[0] = rslt.getBigDecimal(21,4) ;
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((long[]) buf[10])[0] = rslt.getLong(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(11) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(17,4) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(18,4) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(19,4) ;
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(20,4) ;
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[38])[0] = rslt.getBigDecimal(21,4) ;
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
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
               stmt.setVarchar(1, (String)parms[0], 3, false);
               stmt.setVarchar(2, (String)parms[1], 4, false);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               stmt.setVarchar(2, (String)parms[1], 4, false);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               stmt.setVarchar(2, (String)parms[1], 4, false);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               stmt.setVarchar(2, (String)parms[1], 4, false);
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               stmt.setVarchar(2, (String)parms[1], 3, false);
               stmt.setVarchar(3, (String)parms[2], 4, false);
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               stmt.setVarchar(2, (String)parms[1], 3, false);
               stmt.setVarchar(3, (String)parms[2], 4, false);
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               stmt.setVarchar(2, (String)parms[1], 4, false);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(3, (java.util.Date)parms[3], false);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[5], 128);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(5, (java.util.Date)parms[7], false);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[9], 128);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(7, ((Number) parms[11]).longValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[13], 60);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[15], 20);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[17], 40);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[19]).shortValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[21], 100);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[23], 100);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[25], 100);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[27], 100);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[29], 100);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(17, (java.math.BigDecimal)parms[31], 4);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(18, (java.math.BigDecimal)parms[33], 4);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(19, (java.math.BigDecimal)parms[35], 4);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(20, (java.math.BigDecimal)parms[37], 4);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(21, (java.math.BigDecimal)parms[39], 4);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(22, (String)parms[41], 1);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(23, (String)parms[43], 40);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(24, (String)parms[45], 40);
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
                  stmt.setVarchar(6, (String)parms[11], 60);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[13], 20);
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
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[17]).shortValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[19], 100);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[21], 100);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[23], 100);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[25], 100);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[27], 100);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[29], 4);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(16, (java.math.BigDecimal)parms[31], 4);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(17, (java.math.BigDecimal)parms[33], 4);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(18, (java.math.BigDecimal)parms[35], 4);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(19, (java.math.BigDecimal)parms[37], 4);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[39], 1);
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
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(22, (String)parms[43], 40);
               }
               stmt.setVarchar(23, (String)parms[44], 3, false);
               stmt.setVarchar(24, (String)parms[45], 4, false);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               stmt.setVarchar(2, (String)parms[1], 4, false);
               return;
      }
   }

}

