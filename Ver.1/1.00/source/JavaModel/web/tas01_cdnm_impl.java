/*
               File: tas01_cdnm_impl
        Description: 項目名称マスタ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:53:42.77
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action33") == 0 )
      {
         AV14Pgmname = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A54TAS01_DATA_KIND = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A54TAS01_DATA_KIND", A54TAS01_DATA_KIND);
         A55TAS01_ITEM_CD = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A55TAS01_ITEM_CD", A55TAS01_ITEM_CD);
         A19TAS01_ITEM_NM = httpContext.GetNextPar( ) ;
         n19TAS01_ITEM_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A19TAS01_ITEM_NM", A19TAS01_ITEM_NM);
         A53TAS01_ITEM_RYAK = httpContext.GetNextPar( ) ;
         n53TAS01_ITEM_RYAK = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A53TAS01_ITEM_RYAK", A53TAS01_ITEM_RYAK);
         A113TAS01_DEL_FLG = httpContext.GetNextPar( ) ;
         n113TAS01_DEL_FLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A113TAS01_DEL_FLG", A113TAS01_DEL_FLG);
         A47TAS01_CRT_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
         n47TAS01_CRT_DATETIME = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A47TAS01_CRT_DATETIME", localUtil.ttoc( A47TAS01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         A81TAS01_CRT_USER_ID = httpContext.GetNextPar( ) ;
         n81TAS01_CRT_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A81TAS01_CRT_USER_ID", A81TAS01_CRT_USER_ID);
         A49TAS01_CRT_PROG_NM = httpContext.GetNextPar( ) ;
         n49TAS01_CRT_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A49TAS01_CRT_PROG_NM", A49TAS01_CRT_PROG_NM);
         A50TAS01_UPD_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
         n50TAS01_UPD_DATETIME = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A50TAS01_UPD_DATETIME", localUtil.ttoc( A50TAS01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         A82TAS01_UPD_USER_ID = httpContext.GetNextPar( ) ;
         n82TAS01_UPD_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A82TAS01_UPD_USER_ID", A82TAS01_UPD_USER_ID);
         A52TAS01_UPD_PROG_NM = httpContext.GetNextPar( ) ;
         n52TAS01_UPD_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A52TAS01_UPD_PROG_NM", A52TAS01_UPD_PROG_NM);
         A114TAS01_UPD_CNT = GXutil.lval( httpContext.GetNextPar( )) ;
         n114TAS01_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A114TAS01_UPD_CNT", GXutil.ltrim( GXutil.str( A114TAS01_UPD_CNT, 10, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_33_055( AV14Pgmname, Gx_mode, A54TAS01_DATA_KIND, A55TAS01_ITEM_CD, A19TAS01_ITEM_NM, A53TAS01_ITEM_RYAK, A113TAS01_DEL_FLG, A47TAS01_CRT_DATETIME, A81TAS01_CRT_USER_ID, A49TAS01_CRT_PROG_NM, A50TAS01_UPD_DATETIME, A82TAS01_UPD_USER_ID, A52TAS01_UPD_PROG_NM, A114TAS01_UPD_CNT) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action34") == 0 )
      {
         AV14Pgmname = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A54TAS01_DATA_KIND = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A54TAS01_DATA_KIND", A54TAS01_DATA_KIND);
         A55TAS01_ITEM_CD = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A55TAS01_ITEM_CD", A55TAS01_ITEM_CD);
         A19TAS01_ITEM_NM = httpContext.GetNextPar( ) ;
         n19TAS01_ITEM_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A19TAS01_ITEM_NM", A19TAS01_ITEM_NM);
         A53TAS01_ITEM_RYAK = httpContext.GetNextPar( ) ;
         n53TAS01_ITEM_RYAK = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A53TAS01_ITEM_RYAK", A53TAS01_ITEM_RYAK);
         A113TAS01_DEL_FLG = httpContext.GetNextPar( ) ;
         n113TAS01_DEL_FLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A113TAS01_DEL_FLG", A113TAS01_DEL_FLG);
         A47TAS01_CRT_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
         n47TAS01_CRT_DATETIME = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A47TAS01_CRT_DATETIME", localUtil.ttoc( A47TAS01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         A81TAS01_CRT_USER_ID = httpContext.GetNextPar( ) ;
         n81TAS01_CRT_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A81TAS01_CRT_USER_ID", A81TAS01_CRT_USER_ID);
         A49TAS01_CRT_PROG_NM = httpContext.GetNextPar( ) ;
         n49TAS01_CRT_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A49TAS01_CRT_PROG_NM", A49TAS01_CRT_PROG_NM);
         A50TAS01_UPD_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
         n50TAS01_UPD_DATETIME = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A50TAS01_UPD_DATETIME", localUtil.ttoc( A50TAS01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         A82TAS01_UPD_USER_ID = httpContext.GetNextPar( ) ;
         n82TAS01_UPD_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A82TAS01_UPD_USER_ID", A82TAS01_UPD_USER_ID);
         A52TAS01_UPD_PROG_NM = httpContext.GetNextPar( ) ;
         n52TAS01_UPD_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A52TAS01_UPD_PROG_NM", A52TAS01_UPD_PROG_NM);
         A114TAS01_UPD_CNT = GXutil.lval( httpContext.GetNextPar( )) ;
         n114TAS01_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A114TAS01_UPD_CNT", GXutil.ltrim( GXutil.str( A114TAS01_UPD_CNT, 10, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_34_055( AV14Pgmname, Gx_mode, A54TAS01_DATA_KIND, A55TAS01_ITEM_CD, A19TAS01_ITEM_NM, A53TAS01_ITEM_RYAK, A113TAS01_DEL_FLG, A47TAS01_CRT_DATETIME, A81TAS01_CRT_USER_ID, A49TAS01_CRT_PROG_NM, A50TAS01_UPD_DATETIME, A82TAS01_UPD_USER_ID, A52TAS01_UPD_PROG_NM, A114TAS01_UPD_CNT) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action35") == 0 )
      {
         AV14Pgmname = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A54TAS01_DATA_KIND = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A54TAS01_DATA_KIND", A54TAS01_DATA_KIND);
         A55TAS01_ITEM_CD = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A55TAS01_ITEM_CD", A55TAS01_ITEM_CD);
         A19TAS01_ITEM_NM = httpContext.GetNextPar( ) ;
         n19TAS01_ITEM_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A19TAS01_ITEM_NM", A19TAS01_ITEM_NM);
         A53TAS01_ITEM_RYAK = httpContext.GetNextPar( ) ;
         n53TAS01_ITEM_RYAK = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A53TAS01_ITEM_RYAK", A53TAS01_ITEM_RYAK);
         A113TAS01_DEL_FLG = httpContext.GetNextPar( ) ;
         n113TAS01_DEL_FLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A113TAS01_DEL_FLG", A113TAS01_DEL_FLG);
         A47TAS01_CRT_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
         n47TAS01_CRT_DATETIME = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A47TAS01_CRT_DATETIME", localUtil.ttoc( A47TAS01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         A81TAS01_CRT_USER_ID = httpContext.GetNextPar( ) ;
         n81TAS01_CRT_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A81TAS01_CRT_USER_ID", A81TAS01_CRT_USER_ID);
         A49TAS01_CRT_PROG_NM = httpContext.GetNextPar( ) ;
         n49TAS01_CRT_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A49TAS01_CRT_PROG_NM", A49TAS01_CRT_PROG_NM);
         A50TAS01_UPD_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
         n50TAS01_UPD_DATETIME = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A50TAS01_UPD_DATETIME", localUtil.ttoc( A50TAS01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         A82TAS01_UPD_USER_ID = httpContext.GetNextPar( ) ;
         n82TAS01_UPD_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A82TAS01_UPD_USER_ID", A82TAS01_UPD_USER_ID);
         A52TAS01_UPD_PROG_NM = httpContext.GetNextPar( ) ;
         n52TAS01_UPD_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A52TAS01_UPD_PROG_NM", A52TAS01_UPD_PROG_NM);
         A114TAS01_UPD_CNT = GXutil.lval( httpContext.GetNextPar( )) ;
         n114TAS01_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A114TAS01_UPD_CNT", GXutil.ltrim( GXutil.str( A114TAS01_UPD_CNT, 10, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_35_055( AV14Pgmname, Gx_mode, A54TAS01_DATA_KIND, A55TAS01_ITEM_CD, A19TAS01_ITEM_NM, A53TAS01_ITEM_RYAK, A113TAS01_DEL_FLG, A47TAS01_CRT_DATETIME, A81TAS01_CRT_USER_ID, A49TAS01_CRT_PROG_NM, A50TAS01_UPD_DATETIME, A82TAS01_UPD_USER_ID, A52TAS01_UPD_PROG_NM, A114TAS01_UPD_CNT) ;
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
      Form.getMeta().addItem("Generator", "GeneXus Java", (short)(0)) ;
      Form.getMeta().addItem("Version", "10_1_8-58720", (short)(0)) ;
      Form.getMeta().addItem("Description", "項目名称マスタ", (short)(0)) ;
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTAS01_DATA_KIND_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setTheme("Style2");
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
         ClassString = "Group" ;
         StyleString = "" ;
         httpContext.writeText( "<fieldset id=\""+grpGroupdata_Internalname+"\""+" style=\"-moz-border-radius:3pt;\""+" class=\""+ClassString+"\">") ;
         httpContext.writeText( "<legend class=\""+ClassString+"Title"+"\">"+"項目名称マスタ"+"</legend>") ;
         wb_table3_27_055( true) ;
      }
      return  ;
   }

   public void wb_table3_27_055e( boolean wbgen )
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

   public void wb_table3_27_055( boolean wbgen )
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
         wb_table4_33_055( true) ;
      }
      return  ;
   }

   public void wb_table4_33_055e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table5_160_055( true) ;
      }
      return  ;
   }

   public void wb_table5_160_055e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_27_055e( true) ;
      }
      else
      {
         wb_table3_27_055e( false) ;
      }
   }

   public void wb_table5_160_055( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock44_Internalname, "実行", "", "", lblTextblock44_Jsonclick, "EENTER.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "&nbsp;") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockBtn060" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock45_Internalname, "クリア", "", "", lblTextblock45_Jsonclick, "E\\'BTN_CLER\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "&nbsp;") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockBtn060" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_cancel_Internalname, "終了", "", "", lblBtn_cancel_Jsonclick, "ECHECK.", StyleString, ClassString, 5, "", 1, lblBtn_cancel_Enabled, (short)(0), "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_160_055e( true) ;
      }
      else
      {
         wb_table5_160_055e( false) ;
      }
   }

   public void wb_table4_33_055( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable2_Internalname, tblTable2_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\"  style=\"width:110px\">") ;
         /* Static images/pictures */
         ClassString = "ImageRequiredMark" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage19_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", "Style2"), "", "", "", "Style2", imgImage19_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "HLP_TAS01_CDNM.htm");
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktas01_data_kind_Internalname, "データ種類", "", "", lblTextblocktas01_data_kind_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A54TAS01_DATA_KIND", A54TAS01_DATA_KIND);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
         ClassString = "AttributeImeOff" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAS01_DATA_KIND_Internalname, GXutil.rtrim( A54TAS01_DATA_KIND), GXutil.rtrim( localUtil.format( A54TAS01_DATA_KIND, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(39);\"", "", "", "", "", edtTAS01_DATA_KIND_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAS01_DATA_KIND_Enabled, 1, 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Static images/pictures */
         ClassString = "ImageRequiredMark" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage20_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", "Style2"), "", "", "", "Style2", imgImage20_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "HLP_TAS01_CDNM.htm");
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktas01_item_cd_Internalname, "項目コード", "", "", lblTextblocktas01_item_cd_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A55TAS01_ITEM_CD", A55TAS01_ITEM_CD);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
         ClassString = "AttributeImeOff" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAS01_ITEM_CD_Internalname, GXutil.rtrim( A55TAS01_ITEM_CD), GXutil.rtrim( localUtil.format( A55TAS01_ITEM_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(45);\"", "", "", "", "", edtTAS01_ITEM_CD_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAS01_ITEM_CD_Enabled, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Static images/pictures */
         ClassString = "ImageRequiredMark" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage21_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", "Style2"), "", "", "", "Style2", imgImage21_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "HLP_TAS01_CDNM.htm");
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktas01_item_nm_Internalname, "項目名称", "", "", lblTextblocktas01_item_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A19TAS01_ITEM_NM", A19TAS01_ITEM_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
         ClassString = "AttributeImeOn" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAS01_ITEM_NM_Internalname, GXutil.rtrim( A19TAS01_ITEM_NM), GXutil.rtrim( localUtil.format( A19TAS01_ITEM_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(51);\"", "", "", "", "", edtTAS01_ITEM_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAS01_ITEM_NM_Enabled, 0, 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktas01_item_ryak_Internalname, "項目略称", "", "", lblTextblocktas01_item_ryak_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A53TAS01_ITEM_RYAK", A53TAS01_ITEM_RYAK);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
         ClassString = "AttributeImeOn" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAS01_ITEM_RYAK_Internalname, GXutil.rtrim( A53TAS01_ITEM_RYAK), GXutil.rtrim( localUtil.format( A53TAS01_ITEM_RYAK, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(56);\"", "", "", "", "", edtTAS01_ITEM_RYAK_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAS01_ITEM_RYAK_Enabled, 0, 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktas01_item_ryak2_Internalname, "データ種類名", "", "", lblTextblocktas01_item_ryak2_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A148TAS01_DATA_KIND_NM", A148TAS01_DATA_KIND_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
         ClassString = "AttributeImeOn" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAS01_DATA_KIND_NM_Internalname, GXutil.rtrim( A148TAS01_DATA_KIND_NM), GXutil.rtrim( localUtil.format( A148TAS01_DATA_KIND_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(61);\"", "", "", "", "", edtTAS01_DATA_KIND_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAS01_DATA_KIND_NM_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktas01_item_ryak3_Internalname, "表示順", "", "", lblTextblocktas01_item_ryak3_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A149TAS01_SORT_NO", GXutil.ltrim( GXutil.str( A149TAS01_SORT_NO, 3, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
         ClassString = "AttributeNum" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAS01_SORT_NO_Internalname, GXutil.ltrim( localUtil.ntoc( A149TAS01_SORT_NO, (byte)(3), (byte)(0), ".", "")), ((edtTAS01_SORT_NO_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A149TAS01_SORT_NO), "ZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A149TAS01_SORT_NO), "ZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(66);\"", "", "", "", "", edtTAS01_SORT_NO_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAS01_SORT_NO_Enabled, 0, 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktas01_item_ryak4_Internalname, "予備項目（文字１）", "", "", lblTextblocktas01_item_ryak4_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A150TAS01_CHAR_1", A150TAS01_CHAR_1);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
         ClassString = "AttributeImeOn" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAS01_CHAR_1_Internalname, GXutil.rtrim( A150TAS01_CHAR_1), GXutil.rtrim( localUtil.format( A150TAS01_CHAR_1, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(71);\"", "", "", "", "", edtTAS01_CHAR_1_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAS01_CHAR_1_Enabled, 0, 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktas01_item_ryak6_Internalname, "予備項目（文字２）", "", "", lblTextblocktas01_item_ryak6_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A151TAS01_CHAR_2", A151TAS01_CHAR_2);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
         ClassString = "AttributeImeOn" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAS01_CHAR_2_Internalname, GXutil.rtrim( A151TAS01_CHAR_2), GXutil.rtrim( localUtil.format( A151TAS01_CHAR_2, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(76);\"", "", "", "", "", edtTAS01_CHAR_2_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAS01_CHAR_2_Enabled, 0, 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktas01_item_ryak7_Internalname, "予備項目（文字３）", "", "", lblTextblocktas01_item_ryak7_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A152TAS01_CHAR_3", A152TAS01_CHAR_3);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
         ClassString = "AttributeImeOn" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAS01_CHAR_3_Internalname, GXutil.rtrim( A152TAS01_CHAR_3), GXutil.rtrim( localUtil.format( A152TAS01_CHAR_3, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(81);\"", "", "", "", "", edtTAS01_CHAR_3_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAS01_CHAR_3_Enabled, 0, 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktas01_item_ryak8_Internalname, "予備項目（文字４）", "", "", lblTextblocktas01_item_ryak8_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A153TAS01_CHAR_4", A153TAS01_CHAR_4);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
         ClassString = "AttributeImeOn" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAS01_CHAR_4_Internalname, GXutil.rtrim( A153TAS01_CHAR_4), GXutil.rtrim( localUtil.format( A153TAS01_CHAR_4, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(86);\"", "", "", "", "", edtTAS01_CHAR_4_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAS01_CHAR_4_Enabled, 0, 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktas01_item_ryak9_Internalname, "予備項目（文字５）", "", "", lblTextblocktas01_item_ryak9_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A154TAS01_CHAR_5", A154TAS01_CHAR_5);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
         ClassString = "AttributeImeOn" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAS01_CHAR_5_Internalname, GXutil.rtrim( A154TAS01_CHAR_5), GXutil.rtrim( localUtil.format( A154TAS01_CHAR_5, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(91);\"", "", "", "", "", edtTAS01_CHAR_5_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAS01_CHAR_5_Enabled, 0, 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktas01_item_ryak5_Internalname, "予備項目（数値１）", "", "", lblTextblocktas01_item_ryak5_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A155TAS01_NUM_1", GXutil.ltrim( GXutil.str( A155TAS01_NUM_1, 18, 4)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
         ClassString = "AttributeNum" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAS01_NUM_1_Internalname, GXutil.ltrim( localUtil.ntoc( A155TAS01_NUM_1, (byte)(18), (byte)(4), ".", "")), ((edtTAS01_NUM_1_Enabled!=0) ? GXutil.ltrim( localUtil.format( A155TAS01_NUM_1, "ZZZZZZZZZZZZ9.9999")) : localUtil.format( A155TAS01_NUM_1, "ZZZZZZZZZZZZ9.9999")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_decimal( this, ',','.','4');"+";gx.evt.onblur(96);\"", "", "", "", "", edtTAS01_NUM_1_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAS01_NUM_1_Enabled, 0, 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktas01_item_ryak10_Internalname, "予備項目（数値２）", "", "", lblTextblocktas01_item_ryak10_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A156TAS01_NUM_2", GXutil.ltrim( GXutil.str( A156TAS01_NUM_2, 18, 4)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
         ClassString = "AttributeNum" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAS01_NUM_2_Internalname, GXutil.ltrim( localUtil.ntoc( A156TAS01_NUM_2, (byte)(18), (byte)(4), ".", "")), ((edtTAS01_NUM_2_Enabled!=0) ? GXutil.ltrim( localUtil.format( A156TAS01_NUM_2, "ZZZZZZZZZZZZ9.9999")) : localUtil.format( A156TAS01_NUM_2, "ZZZZZZZZZZZZ9.9999")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_decimal( this, ',','.','4');"+";gx.evt.onblur(101);\"", "", "", "", "", edtTAS01_NUM_2_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAS01_NUM_2_Enabled, 0, 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktas01_item_ryak11_Internalname, "予備項目（数値３）", "", "", lblTextblocktas01_item_ryak11_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A157TAS01_NUM_3", GXutil.ltrim( GXutil.str( A157TAS01_NUM_3, 18, 4)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
         ClassString = "AttributeNum" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAS01_NUM_3_Internalname, GXutil.ltrim( localUtil.ntoc( A157TAS01_NUM_3, (byte)(18), (byte)(4), ".", "")), ((edtTAS01_NUM_3_Enabled!=0) ? GXutil.ltrim( localUtil.format( A157TAS01_NUM_3, "ZZZZZZZZZZZZ9.9999")) : localUtil.format( A157TAS01_NUM_3, "ZZZZZZZZZZZZ9.9999")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_decimal( this, ',','.','4');"+";gx.evt.onblur(106);\"", "", "", "", "", edtTAS01_NUM_3_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAS01_NUM_3_Enabled, 0, 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktas01_item_ryak12_Internalname, "予備項目（数値４）", "", "", lblTextblocktas01_item_ryak12_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A158TAS01_NUM_4", GXutil.ltrim( GXutil.str( A158TAS01_NUM_4, 18, 4)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
         ClassString = "AttributeNum" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAS01_NUM_4_Internalname, GXutil.ltrim( localUtil.ntoc( A158TAS01_NUM_4, (byte)(18), (byte)(4), ".", "")), ((edtTAS01_NUM_4_Enabled!=0) ? GXutil.ltrim( localUtil.format( A158TAS01_NUM_4, "ZZZZZZZZZZZZ9.9999")) : localUtil.format( A158TAS01_NUM_4, "ZZZZZZZZZZZZ9.9999")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_decimal( this, ',','.','4');"+";gx.evt.onblur(111);\"", "", "", "", "", edtTAS01_NUM_4_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAS01_NUM_4_Enabled, 0, 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktas01_item_ryak13_Internalname, "予備項目（数値５）", "", "", lblTextblocktas01_item_ryak13_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A159TAS01_NUM_5", GXutil.ltrim( GXutil.str( A159TAS01_NUM_5, 18, 4)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
         ClassString = "AttributeNum" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAS01_NUM_5_Internalname, GXutil.ltrim( localUtil.ntoc( A159TAS01_NUM_5, (byte)(18), (byte)(4), ".", "")), ((edtTAS01_NUM_5_Enabled!=0) ? GXutil.ltrim( localUtil.format( A159TAS01_NUM_5, "ZZZZZZZZZZZZ9.9999")) : localUtil.format( A159TAS01_NUM_5, "ZZZZZZZZZZZZ9.9999")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_decimal( this, ',','.','4');"+";gx.evt.onblur(116);\"", "", "", "", "", edtTAS01_NUM_5_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAS01_NUM_5_Enabled, 0, 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktas01_del_flg_Internalname, "削除フラグ", "", "", lblTextblocktas01_del_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Radio button */
         httpContext.ajax_rsp_assign_attri("", false, "A113TAS01_DEL_FLG", A113TAS01_DEL_FLG);
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
         GxWebStd.gx_radio_ctrl( httpContext, radTAS01_DEL_FLG, radTAS01_DEL_FLG.getInternalname(), A113TAS01_DEL_FLG, "", 1, radTAS01_DEL_FLG.getEnabled(), 0, 0, StyleString, ClassString, 0, radTAS01_DEL_FLG.getJsonclick(), "", TempTags+" onclick=\"gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(121);\"", "HLP_TAS01_CDNM.htm");
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktas01_crt_datetime_Internalname, "作成日時", "", "", lblTextblocktas01_crt_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A47TAS01_CRT_DATETIME", localUtil.ttoc( A47TAS01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTAS01_CRT_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAS01_CRT_DATETIME_Internalname, localUtil.format(A47TAS01_CRT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A47TAS01_CRT_DATETIME, "9999/99/99 99:99:99"), "", "", "", "", "", edtTAS01_CRT_DATETIME_Jsonclick, 0, ClassString, StyleString, "", edtTAS01_CRT_DATETIME_Visible, edtTAS01_CRT_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(1), true, "right", "HLP_TAS01_CDNM.htm");
         GxWebStd.gx_bitmap( httpContext, edtTAS01_CRT_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((edtTAS01_CRT_DATETIME_Visible==0)||(edtTAS01_CRT_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TAS01_CDNM.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktas01_crt_user_id_Internalname, "作成ユーザーID", "", "", lblTextblocktas01_crt_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A81TAS01_CRT_USER_ID", A81TAS01_CRT_USER_ID);
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAS01_CRT_USER_ID_Internalname, GXutil.rtrim( A81TAS01_CRT_USER_ID), GXutil.rtrim( localUtil.format( A81TAS01_CRT_USER_ID, "")), "", "", "", "", "", edtTAS01_CRT_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAS01_CRT_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(1), true, "left", "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktas01_crt_prog_nm_Internalname, "作成プログラム名", "", "", lblTextblocktas01_crt_prog_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A49TAS01_CRT_PROG_NM", A49TAS01_CRT_PROG_NM);
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAS01_CRT_PROG_NM_Internalname, GXutil.rtrim( A49TAS01_CRT_PROG_NM), GXutil.rtrim( localUtil.format( A49TAS01_CRT_PROG_NM, "")), "", "", "", "", "", edtTAS01_CRT_PROG_NM_Jsonclick, 0, ClassString, StyleString, "", edtTAS01_CRT_PROG_NM_Visible, edtTAS01_CRT_PROG_NM_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(1), true, "left", "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktas01_upd_datetime_Internalname, "更新日時", "", "", lblTextblocktas01_upd_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A50TAS01_UPD_DATETIME", localUtil.ttoc( A50TAS01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTAS01_UPD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAS01_UPD_DATETIME_Internalname, localUtil.format(A50TAS01_UPD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A50TAS01_UPD_DATETIME, "9999/99/99 99:99:99"), "", "", "", "", "", edtTAS01_UPD_DATETIME_Jsonclick, 0, ClassString, StyleString, "", edtTAS01_UPD_DATETIME_Visible, edtTAS01_UPD_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(1), true, "right", "HLP_TAS01_CDNM.htm");
         GxWebStd.gx_bitmap( httpContext, edtTAS01_UPD_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((edtTAS01_UPD_DATETIME_Visible==0)||(edtTAS01_UPD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TAS01_CDNM.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktas01_upd_user_id_Internalname, "更新ユーザーID", "", "", lblTextblocktas01_upd_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A82TAS01_UPD_USER_ID", A82TAS01_UPD_USER_ID);
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAS01_UPD_USER_ID_Internalname, GXutil.rtrim( A82TAS01_UPD_USER_ID), GXutil.rtrim( localUtil.format( A82TAS01_UPD_USER_ID, "")), "", "", "", "", "", edtTAS01_UPD_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAS01_UPD_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(1), true, "left", "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktas01_upd_prog_nm_Internalname, "更新プログラム名", "", "", lblTextblocktas01_upd_prog_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAS01_CDNM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A52TAS01_UPD_PROG_NM", A52TAS01_UPD_PROG_NM);
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAS01_UPD_PROG_NM_Internalname, GXutil.rtrim( A52TAS01_UPD_PROG_NM), GXutil.rtrim( localUtil.format( A52TAS01_UPD_PROG_NM, "")), "", "", "", "", "", edtTAS01_UPD_PROG_NM_Jsonclick, 0, ClassString, StyleString, "", edtTAS01_UPD_PROG_NM_Visible, edtTAS01_UPD_PROG_NM_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(1), true, "left", "HLP_TAS01_CDNM.htm");
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
         wb_table4_33_055e( true) ;
      }
      else
      {
         wb_table4_33_055e( false) ;
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
         httpContext.writeText( "<div style=\"WHITE-SPACE: nowrap\" class=\"ToolbarMain\">") ;
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", "Style2"), "", "", "", "Style2", imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAS01_CDNM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_separator_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAS01_CDNM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", "Style2"), "", "", "", "Style2", imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAS01_CDNM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAS01_CDNM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", "Style2"), "", "", "", "Style2", imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAS01_CDNM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_separator_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAS01_CDNM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", "Style2"), "", "", "", "Style2", imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAS01_CDNM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_separator_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAS01_CDNM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", "Style2"), "", "", "", "Style2", imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "", 0, "", 0, 0, 4, imgBtn_select_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "gx.popup.openPrompt('"+"gx0050"+"',["+"{Ctrl:gx.dom.el('"+"TAS01_DATA_KIND"+"'), id:'"+"TAS01_DATA_KIND"+"'"+",isOut: true}"+","+"{Ctrl:gx.dom.el('"+"TAS01_ITEM_CD"+"'), id:'"+"TAS01_ITEM_CD"+"'"+",isOut:true,isKey:true,isLastKey:true}"+"],"+"null"+","+"'', false"+","+"true"+");"+"return false;", "HLP_TAS01_CDNM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 4, imgBtn_select_separator_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "gx.popup.openPrompt('"+"gx0050"+"',["+"{Ctrl:gx.dom.el('"+"TAS01_DATA_KIND"+"'), id:'"+"TAS01_DATA_KIND"+"'"+",isOut: true}"+","+"{Ctrl:gx.dom.el('"+"TAS01_ITEM_CD"+"'), id:'"+"TAS01_ITEM_CD"+"'"+",isOut:true,isKey:true,isLastKey:true}"+"],"+"null"+","+"'', false"+","+"true"+");"+"return false;", "HLP_TAS01_CDNM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAS01_CDNM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAS01_CDNM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAS01_CDNM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAS01_CDNM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAS01_CDNM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAS01_CDNM.htm");
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
            A54TAS01_DATA_KIND = httpContext.cgiGet( edtTAS01_DATA_KIND_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A54TAS01_DATA_KIND", A54TAS01_DATA_KIND);
            A55TAS01_ITEM_CD = httpContext.cgiGet( edtTAS01_ITEM_CD_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A55TAS01_ITEM_CD", A55TAS01_ITEM_CD);
            A19TAS01_ITEM_NM = httpContext.cgiGet( edtTAS01_ITEM_NM_Internalname) ;
            n19TAS01_ITEM_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A19TAS01_ITEM_NM", A19TAS01_ITEM_NM);
            n19TAS01_ITEM_NM = ((GXutil.strcmp("", A19TAS01_ITEM_NM)==0) ? true : false) ;
            A53TAS01_ITEM_RYAK = httpContext.cgiGet( edtTAS01_ITEM_RYAK_Internalname) ;
            n53TAS01_ITEM_RYAK = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A53TAS01_ITEM_RYAK", A53TAS01_ITEM_RYAK);
            n53TAS01_ITEM_RYAK = ((GXutil.strcmp("", A53TAS01_ITEM_RYAK)==0) ? true : false) ;
            A148TAS01_DATA_KIND_NM = httpContext.cgiGet( edtTAS01_DATA_KIND_NM_Internalname) ;
            n148TAS01_DATA_KIND_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A148TAS01_DATA_KIND_NM", A148TAS01_DATA_KIND_NM);
            n148TAS01_DATA_KIND_NM = ((GXutil.strcmp("", A148TAS01_DATA_KIND_NM)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTAS01_SORT_NO_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTAS01_SORT_NO_Internalname), ".", ",") > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TAS01_SORT_NO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTAS01_SORT_NO_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A149TAS01_SORT_NO = (short)(0) ;
               n149TAS01_SORT_NO = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A149TAS01_SORT_NO", GXutil.ltrim( GXutil.str( A149TAS01_SORT_NO, 3, 0)));
            }
            else
            {
               A149TAS01_SORT_NO = (short)(localUtil.ctol( httpContext.cgiGet( edtTAS01_SORT_NO_Internalname), ".", ",")) ;
               n149TAS01_SORT_NO = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A149TAS01_SORT_NO", GXutil.ltrim( GXutil.str( A149TAS01_SORT_NO, 3, 0)));
            }
            n149TAS01_SORT_NO = ((0==A149TAS01_SORT_NO) ? true : false) ;
            A150TAS01_CHAR_1 = httpContext.cgiGet( edtTAS01_CHAR_1_Internalname) ;
            n150TAS01_CHAR_1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A150TAS01_CHAR_1", A150TAS01_CHAR_1);
            n150TAS01_CHAR_1 = ((GXutil.strcmp("", A150TAS01_CHAR_1)==0) ? true : false) ;
            A151TAS01_CHAR_2 = httpContext.cgiGet( edtTAS01_CHAR_2_Internalname) ;
            n151TAS01_CHAR_2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A151TAS01_CHAR_2", A151TAS01_CHAR_2);
            n151TAS01_CHAR_2 = ((GXutil.strcmp("", A151TAS01_CHAR_2)==0) ? true : false) ;
            A152TAS01_CHAR_3 = httpContext.cgiGet( edtTAS01_CHAR_3_Internalname) ;
            n152TAS01_CHAR_3 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A152TAS01_CHAR_3", A152TAS01_CHAR_3);
            n152TAS01_CHAR_3 = ((GXutil.strcmp("", A152TAS01_CHAR_3)==0) ? true : false) ;
            A153TAS01_CHAR_4 = httpContext.cgiGet( edtTAS01_CHAR_4_Internalname) ;
            n153TAS01_CHAR_4 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A153TAS01_CHAR_4", A153TAS01_CHAR_4);
            n153TAS01_CHAR_4 = ((GXutil.strcmp("", A153TAS01_CHAR_4)==0) ? true : false) ;
            A154TAS01_CHAR_5 = httpContext.cgiGet( edtTAS01_CHAR_5_Internalname) ;
            n154TAS01_CHAR_5 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A154TAS01_CHAR_5", A154TAS01_CHAR_5);
            n154TAS01_CHAR_5 = ((GXutil.strcmp("", A154TAS01_CHAR_5)==0) ? true : false) ;
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTAS01_NUM_1_Internalname)).compareTo(DecimalUtil.doubleToDec(-999999999999.9999,18,4)) < 0 ) ) || ( ( localUtil.ctond( httpContext.cgiGet( edtTAS01_NUM_1_Internalname)).compareTo(DecimalUtil.doubleToDec(9999999999999.9999,18,4)) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TAS01_NUM_1");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTAS01_NUM_1_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A155TAS01_NUM_1 = DecimalUtil.ZERO ;
               n155TAS01_NUM_1 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A155TAS01_NUM_1", GXutil.ltrim( GXutil.str( A155TAS01_NUM_1, 18, 4)));
            }
            else
            {
               A155TAS01_NUM_1 = localUtil.ctond( httpContext.cgiGet( edtTAS01_NUM_1_Internalname)) ;
               n155TAS01_NUM_1 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A155TAS01_NUM_1", GXutil.ltrim( GXutil.str( A155TAS01_NUM_1, 18, 4)));
            }
            n155TAS01_NUM_1 = ((DecimalUtil.ZERO.compareTo(A155TAS01_NUM_1)==0) ? true : false) ;
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTAS01_NUM_2_Internalname)).compareTo(DecimalUtil.doubleToDec(-999999999999.9999,18,4)) < 0 ) ) || ( ( localUtil.ctond( httpContext.cgiGet( edtTAS01_NUM_2_Internalname)).compareTo(DecimalUtil.doubleToDec(9999999999999.9999,18,4)) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TAS01_NUM_2");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTAS01_NUM_2_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A156TAS01_NUM_2 = DecimalUtil.ZERO ;
               n156TAS01_NUM_2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A156TAS01_NUM_2", GXutil.ltrim( GXutil.str( A156TAS01_NUM_2, 18, 4)));
            }
            else
            {
               A156TAS01_NUM_2 = localUtil.ctond( httpContext.cgiGet( edtTAS01_NUM_2_Internalname)) ;
               n156TAS01_NUM_2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A156TAS01_NUM_2", GXutil.ltrim( GXutil.str( A156TAS01_NUM_2, 18, 4)));
            }
            n156TAS01_NUM_2 = ((DecimalUtil.ZERO.compareTo(A156TAS01_NUM_2)==0) ? true : false) ;
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTAS01_NUM_3_Internalname)).compareTo(DecimalUtil.doubleToDec(-999999999999.9999,18,4)) < 0 ) ) || ( ( localUtil.ctond( httpContext.cgiGet( edtTAS01_NUM_3_Internalname)).compareTo(DecimalUtil.doubleToDec(9999999999999.9999,18,4)) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TAS01_NUM_3");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTAS01_NUM_3_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A157TAS01_NUM_3 = DecimalUtil.ZERO ;
               n157TAS01_NUM_3 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A157TAS01_NUM_3", GXutil.ltrim( GXutil.str( A157TAS01_NUM_3, 18, 4)));
            }
            else
            {
               A157TAS01_NUM_3 = localUtil.ctond( httpContext.cgiGet( edtTAS01_NUM_3_Internalname)) ;
               n157TAS01_NUM_3 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A157TAS01_NUM_3", GXutil.ltrim( GXutil.str( A157TAS01_NUM_3, 18, 4)));
            }
            n157TAS01_NUM_3 = ((DecimalUtil.ZERO.compareTo(A157TAS01_NUM_3)==0) ? true : false) ;
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTAS01_NUM_4_Internalname)).compareTo(DecimalUtil.doubleToDec(-999999999999.9999,18,4)) < 0 ) ) || ( ( localUtil.ctond( httpContext.cgiGet( edtTAS01_NUM_4_Internalname)).compareTo(DecimalUtil.doubleToDec(9999999999999.9999,18,4)) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TAS01_NUM_4");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTAS01_NUM_4_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A158TAS01_NUM_4 = DecimalUtil.ZERO ;
               n158TAS01_NUM_4 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A158TAS01_NUM_4", GXutil.ltrim( GXutil.str( A158TAS01_NUM_4, 18, 4)));
            }
            else
            {
               A158TAS01_NUM_4 = localUtil.ctond( httpContext.cgiGet( edtTAS01_NUM_4_Internalname)) ;
               n158TAS01_NUM_4 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A158TAS01_NUM_4", GXutil.ltrim( GXutil.str( A158TAS01_NUM_4, 18, 4)));
            }
            n158TAS01_NUM_4 = ((DecimalUtil.ZERO.compareTo(A158TAS01_NUM_4)==0) ? true : false) ;
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTAS01_NUM_5_Internalname)).compareTo(DecimalUtil.doubleToDec(-999999999999.9999,18,4)) < 0 ) ) || ( ( localUtil.ctond( httpContext.cgiGet( edtTAS01_NUM_5_Internalname)).compareTo(DecimalUtil.doubleToDec(9999999999999.9999,18,4)) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TAS01_NUM_5");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTAS01_NUM_5_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A159TAS01_NUM_5 = DecimalUtil.ZERO ;
               n159TAS01_NUM_5 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A159TAS01_NUM_5", GXutil.ltrim( GXutil.str( A159TAS01_NUM_5, 18, 4)));
            }
            else
            {
               A159TAS01_NUM_5 = localUtil.ctond( httpContext.cgiGet( edtTAS01_NUM_5_Internalname)) ;
               n159TAS01_NUM_5 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A159TAS01_NUM_5", GXutil.ltrim( GXutil.str( A159TAS01_NUM_5, 18, 4)));
            }
            n159TAS01_NUM_5 = ((DecimalUtil.ZERO.compareTo(A159TAS01_NUM_5)==0) ? true : false) ;
            A113TAS01_DEL_FLG = httpContext.cgiGet( radTAS01_DEL_FLG.getInternalname()) ;
            n113TAS01_DEL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A113TAS01_DEL_FLG", A113TAS01_DEL_FLG);
            n113TAS01_DEL_FLG = ((GXutil.strcmp("", A113TAS01_DEL_FLG)==0) ? true : false) ;
            A47TAS01_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTAS01_CRT_DATETIME_Internalname)) ;
            n47TAS01_CRT_DATETIME = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A47TAS01_CRT_DATETIME", localUtil.ttoc( A47TAS01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            A81TAS01_CRT_USER_ID = httpContext.cgiGet( edtTAS01_CRT_USER_ID_Internalname) ;
            n81TAS01_CRT_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A81TAS01_CRT_USER_ID", A81TAS01_CRT_USER_ID);
            A49TAS01_CRT_PROG_NM = httpContext.cgiGet( edtTAS01_CRT_PROG_NM_Internalname) ;
            n49TAS01_CRT_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A49TAS01_CRT_PROG_NM", A49TAS01_CRT_PROG_NM);
            A50TAS01_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTAS01_UPD_DATETIME_Internalname)) ;
            n50TAS01_UPD_DATETIME = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A50TAS01_UPD_DATETIME", localUtil.ttoc( A50TAS01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            A82TAS01_UPD_USER_ID = httpContext.cgiGet( edtTAS01_UPD_USER_ID_Internalname) ;
            n82TAS01_UPD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A82TAS01_UPD_USER_ID", A82TAS01_UPD_USER_ID);
            A52TAS01_UPD_PROG_NM = httpContext.cgiGet( edtTAS01_UPD_PROG_NM_Internalname) ;
            n52TAS01_UPD_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A52TAS01_UPD_PROG_NM", A52TAS01_UPD_PROG_NM);
            /* Read saved values. */
            Z54TAS01_DATA_KIND = httpContext.cgiGet( "Z54TAS01_DATA_KIND") ;
            Z55TAS01_ITEM_CD = httpContext.cgiGet( "Z55TAS01_ITEM_CD") ;
            Z47TAS01_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z47TAS01_CRT_DATETIME"), 0) ;
            n47TAS01_CRT_DATETIME = (GXutil.nullDate().equals(A47TAS01_CRT_DATETIME) ? true : false) ;
            Z81TAS01_CRT_USER_ID = httpContext.cgiGet( "Z81TAS01_CRT_USER_ID") ;
            n81TAS01_CRT_USER_ID = ((GXutil.strcmp("", A81TAS01_CRT_USER_ID)==0) ? true : false) ;
            Z50TAS01_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z50TAS01_UPD_DATETIME"), 0) ;
            n50TAS01_UPD_DATETIME = (GXutil.nullDate().equals(A50TAS01_UPD_DATETIME) ? true : false) ;
            Z82TAS01_UPD_USER_ID = httpContext.cgiGet( "Z82TAS01_UPD_USER_ID") ;
            n82TAS01_UPD_USER_ID = ((GXutil.strcmp("", A82TAS01_UPD_USER_ID)==0) ? true : false) ;
            Z114TAS01_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z114TAS01_UPD_CNT"), ".", ",") ;
            n114TAS01_UPD_CNT = ((0==A114TAS01_UPD_CNT) ? true : false) ;
            Z19TAS01_ITEM_NM = httpContext.cgiGet( "Z19TAS01_ITEM_NM") ;
            n19TAS01_ITEM_NM = ((GXutil.strcmp("", A19TAS01_ITEM_NM)==0) ? true : false) ;
            Z53TAS01_ITEM_RYAK = httpContext.cgiGet( "Z53TAS01_ITEM_RYAK") ;
            n53TAS01_ITEM_RYAK = ((GXutil.strcmp("", A53TAS01_ITEM_RYAK)==0) ? true : false) ;
            Z148TAS01_DATA_KIND_NM = httpContext.cgiGet( "Z148TAS01_DATA_KIND_NM") ;
            n148TAS01_DATA_KIND_NM = ((GXutil.strcmp("", A148TAS01_DATA_KIND_NM)==0) ? true : false) ;
            Z149TAS01_SORT_NO = (short)(localUtil.ctol( httpContext.cgiGet( "Z149TAS01_SORT_NO"), ".", ",")) ;
            n149TAS01_SORT_NO = ((0==A149TAS01_SORT_NO) ? true : false) ;
            Z150TAS01_CHAR_1 = httpContext.cgiGet( "Z150TAS01_CHAR_1") ;
            n150TAS01_CHAR_1 = ((GXutil.strcmp("", A150TAS01_CHAR_1)==0) ? true : false) ;
            Z151TAS01_CHAR_2 = httpContext.cgiGet( "Z151TAS01_CHAR_2") ;
            n151TAS01_CHAR_2 = ((GXutil.strcmp("", A151TAS01_CHAR_2)==0) ? true : false) ;
            Z152TAS01_CHAR_3 = httpContext.cgiGet( "Z152TAS01_CHAR_3") ;
            n152TAS01_CHAR_3 = ((GXutil.strcmp("", A152TAS01_CHAR_3)==0) ? true : false) ;
            Z153TAS01_CHAR_4 = httpContext.cgiGet( "Z153TAS01_CHAR_4") ;
            n153TAS01_CHAR_4 = ((GXutil.strcmp("", A153TAS01_CHAR_4)==0) ? true : false) ;
            Z154TAS01_CHAR_5 = httpContext.cgiGet( "Z154TAS01_CHAR_5") ;
            n154TAS01_CHAR_5 = ((GXutil.strcmp("", A154TAS01_CHAR_5)==0) ? true : false) ;
            Z155TAS01_NUM_1 = localUtil.ctond( httpContext.cgiGet( "Z155TAS01_NUM_1")) ;
            n155TAS01_NUM_1 = ((DecimalUtil.ZERO.compareTo(A155TAS01_NUM_1)==0) ? true : false) ;
            Z156TAS01_NUM_2 = localUtil.ctond( httpContext.cgiGet( "Z156TAS01_NUM_2")) ;
            n156TAS01_NUM_2 = ((DecimalUtil.ZERO.compareTo(A156TAS01_NUM_2)==0) ? true : false) ;
            Z157TAS01_NUM_3 = localUtil.ctond( httpContext.cgiGet( "Z157TAS01_NUM_3")) ;
            n157TAS01_NUM_3 = ((DecimalUtil.ZERO.compareTo(A157TAS01_NUM_3)==0) ? true : false) ;
            Z158TAS01_NUM_4 = localUtil.ctond( httpContext.cgiGet( "Z158TAS01_NUM_4")) ;
            n158TAS01_NUM_4 = ((DecimalUtil.ZERO.compareTo(A158TAS01_NUM_4)==0) ? true : false) ;
            Z159TAS01_NUM_5 = localUtil.ctond( httpContext.cgiGet( "Z159TAS01_NUM_5")) ;
            n159TAS01_NUM_5 = ((DecimalUtil.ZERO.compareTo(A159TAS01_NUM_5)==0) ? true : false) ;
            Z113TAS01_DEL_FLG = httpContext.cgiGet( "Z113TAS01_DEL_FLG") ;
            n113TAS01_DEL_FLG = ((GXutil.strcmp("", A113TAS01_DEL_FLG)==0) ? true : false) ;
            Z49TAS01_CRT_PROG_NM = httpContext.cgiGet( "Z49TAS01_CRT_PROG_NM") ;
            n49TAS01_CRT_PROG_NM = ((GXutil.strcmp("", A49TAS01_CRT_PROG_NM)==0) ? true : false) ;
            Z52TAS01_UPD_PROG_NM = httpContext.cgiGet( "Z52TAS01_UPD_PROG_NM") ;
            n52TAS01_UPD_PROG_NM = ((GXutil.strcmp("", A52TAS01_UPD_PROG_NM)==0) ? true : false) ;
            A114TAS01_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z114TAS01_UPD_CNT"), ".", ",") ;
            n114TAS01_UPD_CNT = false ;
            n114TAS01_UPD_CNT = ((0==A114TAS01_UPD_CNT) ? true : false) ;
            O114TAS01_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "O114TAS01_UPD_CNT"), ".", ",") ;
            n114TAS01_UPD_CNT = ((0==A114TAS01_UPD_CNT) ? true : false) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ".", ",")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ".", ",")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            A114TAS01_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "TAS01_UPD_CNT"), ".", ",") ;
            n114TAS01_UPD_CNT = ((0==A114TAS01_UPD_CNT) ? true : false) ;
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
               A54TAS01_DATA_KIND = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A54TAS01_DATA_KIND", A54TAS01_DATA_KIND);
               A55TAS01_ITEM_CD = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A55TAS01_ITEM_CD", A55TAS01_ITEM_CD);
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
                  else if ( GXutil.strcmp(sEvt, "'BTN_CLER'") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     dynload_actions( ) ;
                     /* Execute user event: e12052 */
                     e12052 ();
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
      disableAttributes055( ) ;
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
      GXt_char2 = AV12W_MSG ;
      GXv_char3[0] = GXt_char2 ;
      new a805_pc01_msg_get(remoteHandle, context).execute( "AG00005", "", "", "", "", "", GXv_char3) ;
      tas01_cdnm_impl.this.GXt_char2 = GXv_char3[0] ;
      AV12W_MSG = GXt_char2 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12W_MSG", AV12W_MSG);
      imgBtn_delete2_Jsonclick = "confirm('"+AV12W_MSG+"')" ;
      httpContext.ajax_rsp_assign_prop("", false, imgBtn_delete2_Internalname, "Jsonclick", imgBtn_delete2_Jsonclick);
   }

   public void e12052( )
   {
      /* 'BTN_CLER' Routine */
      httpContext.wjLoc = formatLink("tas01_cdnm")  ;
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT4[0] = AV8W_A_LOGIN_SDT;
      GXv_char3[0] = AV9W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT4, GXv_char3) ;
      AV8W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT4[0] ;
      tas01_cdnm_impl.this.AV9W_ERRCD = GXv_char3[0] ;
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
      tas01_cdnm_impl.this.AV10W_KNGN_FLG = GXv_char3[0] ;
      tas01_cdnm_impl.this.AV9W_ERRCD = GXv_char5[0] ;
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

   public void zm055( int GX_JID )
   {
      if ( ( GX_JID == 36 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z47TAS01_CRT_DATETIME = T00053_A47TAS01_CRT_DATETIME[0] ;
            Z81TAS01_CRT_USER_ID = T00053_A81TAS01_CRT_USER_ID[0] ;
            Z50TAS01_UPD_DATETIME = T00053_A50TAS01_UPD_DATETIME[0] ;
            Z82TAS01_UPD_USER_ID = T00053_A82TAS01_UPD_USER_ID[0] ;
            Z114TAS01_UPD_CNT = T00053_A114TAS01_UPD_CNT[0] ;
            Z19TAS01_ITEM_NM = T00053_A19TAS01_ITEM_NM[0] ;
            Z53TAS01_ITEM_RYAK = T00053_A53TAS01_ITEM_RYAK[0] ;
            Z148TAS01_DATA_KIND_NM = T00053_A148TAS01_DATA_KIND_NM[0] ;
            Z149TAS01_SORT_NO = T00053_A149TAS01_SORT_NO[0] ;
            Z150TAS01_CHAR_1 = T00053_A150TAS01_CHAR_1[0] ;
            Z151TAS01_CHAR_2 = T00053_A151TAS01_CHAR_2[0] ;
            Z152TAS01_CHAR_3 = T00053_A152TAS01_CHAR_3[0] ;
            Z153TAS01_CHAR_4 = T00053_A153TAS01_CHAR_4[0] ;
            Z154TAS01_CHAR_5 = T00053_A154TAS01_CHAR_5[0] ;
            Z155TAS01_NUM_1 = T00053_A155TAS01_NUM_1[0] ;
            Z156TAS01_NUM_2 = T00053_A156TAS01_NUM_2[0] ;
            Z157TAS01_NUM_3 = T00053_A157TAS01_NUM_3[0] ;
            Z158TAS01_NUM_4 = T00053_A158TAS01_NUM_4[0] ;
            Z159TAS01_NUM_5 = T00053_A159TAS01_NUM_5[0] ;
            Z113TAS01_DEL_FLG = T00053_A113TAS01_DEL_FLG[0] ;
            Z49TAS01_CRT_PROG_NM = T00053_A49TAS01_CRT_PROG_NM[0] ;
            Z52TAS01_UPD_PROG_NM = T00053_A52TAS01_UPD_PROG_NM[0] ;
         }
         else
         {
            Z47TAS01_CRT_DATETIME = A47TAS01_CRT_DATETIME ;
            Z81TAS01_CRT_USER_ID = A81TAS01_CRT_USER_ID ;
            Z50TAS01_UPD_DATETIME = A50TAS01_UPD_DATETIME ;
            Z82TAS01_UPD_USER_ID = A82TAS01_UPD_USER_ID ;
            Z114TAS01_UPD_CNT = A114TAS01_UPD_CNT ;
            Z19TAS01_ITEM_NM = A19TAS01_ITEM_NM ;
            Z53TAS01_ITEM_RYAK = A53TAS01_ITEM_RYAK ;
            Z148TAS01_DATA_KIND_NM = A148TAS01_DATA_KIND_NM ;
            Z149TAS01_SORT_NO = A149TAS01_SORT_NO ;
            Z150TAS01_CHAR_1 = A150TAS01_CHAR_1 ;
            Z151TAS01_CHAR_2 = A151TAS01_CHAR_2 ;
            Z152TAS01_CHAR_3 = A152TAS01_CHAR_3 ;
            Z153TAS01_CHAR_4 = A153TAS01_CHAR_4 ;
            Z154TAS01_CHAR_5 = A154TAS01_CHAR_5 ;
            Z155TAS01_NUM_1 = A155TAS01_NUM_1 ;
            Z156TAS01_NUM_2 = A156TAS01_NUM_2 ;
            Z157TAS01_NUM_3 = A157TAS01_NUM_3 ;
            Z158TAS01_NUM_4 = A158TAS01_NUM_4 ;
            Z159TAS01_NUM_5 = A159TAS01_NUM_5 ;
            Z113TAS01_DEL_FLG = A113TAS01_DEL_FLG ;
            Z49TAS01_CRT_PROG_NM = A49TAS01_CRT_PROG_NM ;
            Z52TAS01_UPD_PROG_NM = A52TAS01_UPD_PROG_NM ;
         }
      }
      if ( GX_JID == -36 )
      {
         Z54TAS01_DATA_KIND = A54TAS01_DATA_KIND ;
         Z55TAS01_ITEM_CD = A55TAS01_ITEM_CD ;
         Z47TAS01_CRT_DATETIME = A47TAS01_CRT_DATETIME ;
         Z81TAS01_CRT_USER_ID = A81TAS01_CRT_USER_ID ;
         Z50TAS01_UPD_DATETIME = A50TAS01_UPD_DATETIME ;
         Z82TAS01_UPD_USER_ID = A82TAS01_UPD_USER_ID ;
         Z114TAS01_UPD_CNT = A114TAS01_UPD_CNT ;
         Z19TAS01_ITEM_NM = A19TAS01_ITEM_NM ;
         Z53TAS01_ITEM_RYAK = A53TAS01_ITEM_RYAK ;
         Z148TAS01_DATA_KIND_NM = A148TAS01_DATA_KIND_NM ;
         Z149TAS01_SORT_NO = A149TAS01_SORT_NO ;
         Z150TAS01_CHAR_1 = A150TAS01_CHAR_1 ;
         Z151TAS01_CHAR_2 = A151TAS01_CHAR_2 ;
         Z152TAS01_CHAR_3 = A152TAS01_CHAR_3 ;
         Z153TAS01_CHAR_4 = A153TAS01_CHAR_4 ;
         Z154TAS01_CHAR_5 = A154TAS01_CHAR_5 ;
         Z155TAS01_NUM_1 = A155TAS01_NUM_1 ;
         Z156TAS01_NUM_2 = A156TAS01_NUM_2 ;
         Z157TAS01_NUM_3 = A157TAS01_NUM_3 ;
         Z158TAS01_NUM_4 = A158TAS01_NUM_4 ;
         Z159TAS01_NUM_5 = A159TAS01_NUM_5 ;
         Z113TAS01_DEL_FLG = A113TAS01_DEL_FLG ;
         Z49TAS01_CRT_PROG_NM = A49TAS01_CRT_PROG_NM ;
         Z52TAS01_UPD_PROG_NM = A52TAS01_UPD_PROG_NM ;
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
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  && (GXutil.strcmp("", A113TAS01_DEL_FLG)==0) && ( Gx_BScreen == 0 ) )
      {
         A113TAS01_DEL_FLG = "0" ;
         n113TAS01_DEL_FLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A113TAS01_DEL_FLG", A113TAS01_DEL_FLG);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  && (GXutil.strcmp("", A49TAS01_CRT_PROG_NM)==0) && ( Gx_BScreen == 0 ) )
      {
         A49TAS01_CRT_PROG_NM = AV14Pgmname ;
         n49TAS01_CRT_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A49TAS01_CRT_PROG_NM", A49TAS01_CRT_PROG_NM);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  && (GXutil.strcmp("", A52TAS01_UPD_PROG_NM)==0) && ( Gx_BScreen == 0 ) )
      {
         A52TAS01_UPD_PROG_NM = AV14Pgmname ;
         n52TAS01_UPD_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A52TAS01_UPD_PROG_NM", A52TAS01_UPD_PROG_NM);
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
      pr_default.execute(2, new Object[] {A54TAS01_DATA_KIND, A55TAS01_ITEM_CD});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound5 = (short)(1) ;
         A47TAS01_CRT_DATETIME = T00054_A47TAS01_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A47TAS01_CRT_DATETIME", localUtil.ttoc( A47TAS01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n47TAS01_CRT_DATETIME = T00054_n47TAS01_CRT_DATETIME[0] ;
         A81TAS01_CRT_USER_ID = T00054_A81TAS01_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A81TAS01_CRT_USER_ID", A81TAS01_CRT_USER_ID);
         n81TAS01_CRT_USER_ID = T00054_n81TAS01_CRT_USER_ID[0] ;
         A50TAS01_UPD_DATETIME = T00054_A50TAS01_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A50TAS01_UPD_DATETIME", localUtil.ttoc( A50TAS01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n50TAS01_UPD_DATETIME = T00054_n50TAS01_UPD_DATETIME[0] ;
         A82TAS01_UPD_USER_ID = T00054_A82TAS01_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A82TAS01_UPD_USER_ID", A82TAS01_UPD_USER_ID);
         n82TAS01_UPD_USER_ID = T00054_n82TAS01_UPD_USER_ID[0] ;
         A114TAS01_UPD_CNT = T00054_A114TAS01_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A114TAS01_UPD_CNT", GXutil.ltrim( GXutil.str( A114TAS01_UPD_CNT, 10, 0)));
         n114TAS01_UPD_CNT = T00054_n114TAS01_UPD_CNT[0] ;
         A19TAS01_ITEM_NM = T00054_A19TAS01_ITEM_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A19TAS01_ITEM_NM", A19TAS01_ITEM_NM);
         n19TAS01_ITEM_NM = T00054_n19TAS01_ITEM_NM[0] ;
         A53TAS01_ITEM_RYAK = T00054_A53TAS01_ITEM_RYAK[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A53TAS01_ITEM_RYAK", A53TAS01_ITEM_RYAK);
         n53TAS01_ITEM_RYAK = T00054_n53TAS01_ITEM_RYAK[0] ;
         A148TAS01_DATA_KIND_NM = T00054_A148TAS01_DATA_KIND_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A148TAS01_DATA_KIND_NM", A148TAS01_DATA_KIND_NM);
         n148TAS01_DATA_KIND_NM = T00054_n148TAS01_DATA_KIND_NM[0] ;
         A149TAS01_SORT_NO = T00054_A149TAS01_SORT_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A149TAS01_SORT_NO", GXutil.ltrim( GXutil.str( A149TAS01_SORT_NO, 3, 0)));
         n149TAS01_SORT_NO = T00054_n149TAS01_SORT_NO[0] ;
         A150TAS01_CHAR_1 = T00054_A150TAS01_CHAR_1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A150TAS01_CHAR_1", A150TAS01_CHAR_1);
         n150TAS01_CHAR_1 = T00054_n150TAS01_CHAR_1[0] ;
         A151TAS01_CHAR_2 = T00054_A151TAS01_CHAR_2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A151TAS01_CHAR_2", A151TAS01_CHAR_2);
         n151TAS01_CHAR_2 = T00054_n151TAS01_CHAR_2[0] ;
         A152TAS01_CHAR_3 = T00054_A152TAS01_CHAR_3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A152TAS01_CHAR_3", A152TAS01_CHAR_3);
         n152TAS01_CHAR_3 = T00054_n152TAS01_CHAR_3[0] ;
         A153TAS01_CHAR_4 = T00054_A153TAS01_CHAR_4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A153TAS01_CHAR_4", A153TAS01_CHAR_4);
         n153TAS01_CHAR_4 = T00054_n153TAS01_CHAR_4[0] ;
         A154TAS01_CHAR_5 = T00054_A154TAS01_CHAR_5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A154TAS01_CHAR_5", A154TAS01_CHAR_5);
         n154TAS01_CHAR_5 = T00054_n154TAS01_CHAR_5[0] ;
         A155TAS01_NUM_1 = T00054_A155TAS01_NUM_1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A155TAS01_NUM_1", GXutil.ltrim( GXutil.str( A155TAS01_NUM_1, 18, 4)));
         n155TAS01_NUM_1 = T00054_n155TAS01_NUM_1[0] ;
         A156TAS01_NUM_2 = T00054_A156TAS01_NUM_2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A156TAS01_NUM_2", GXutil.ltrim( GXutil.str( A156TAS01_NUM_2, 18, 4)));
         n156TAS01_NUM_2 = T00054_n156TAS01_NUM_2[0] ;
         A157TAS01_NUM_3 = T00054_A157TAS01_NUM_3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A157TAS01_NUM_3", GXutil.ltrim( GXutil.str( A157TAS01_NUM_3, 18, 4)));
         n157TAS01_NUM_3 = T00054_n157TAS01_NUM_3[0] ;
         A158TAS01_NUM_4 = T00054_A158TAS01_NUM_4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A158TAS01_NUM_4", GXutil.ltrim( GXutil.str( A158TAS01_NUM_4, 18, 4)));
         n158TAS01_NUM_4 = T00054_n158TAS01_NUM_4[0] ;
         A159TAS01_NUM_5 = T00054_A159TAS01_NUM_5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A159TAS01_NUM_5", GXutil.ltrim( GXutil.str( A159TAS01_NUM_5, 18, 4)));
         n159TAS01_NUM_5 = T00054_n159TAS01_NUM_5[0] ;
         A113TAS01_DEL_FLG = T00054_A113TAS01_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A113TAS01_DEL_FLG", A113TAS01_DEL_FLG);
         n113TAS01_DEL_FLG = T00054_n113TAS01_DEL_FLG[0] ;
         A49TAS01_CRT_PROG_NM = T00054_A49TAS01_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A49TAS01_CRT_PROG_NM", A49TAS01_CRT_PROG_NM);
         n49TAS01_CRT_PROG_NM = T00054_n49TAS01_CRT_PROG_NM[0] ;
         A52TAS01_UPD_PROG_NM = T00054_A52TAS01_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A52TAS01_UPD_PROG_NM", A52TAS01_UPD_PROG_NM);
         n52TAS01_UPD_PROG_NM = T00054_n52TAS01_UPD_PROG_NM[0] ;
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
      pr_default.execute(3, new Object[] {A54TAS01_DATA_KIND, A55TAS01_ITEM_CD});
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
      pr_default.execute(1, new Object[] {A54TAS01_DATA_KIND, A55TAS01_ITEM_CD});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm055( 36) ;
         RcdFound5 = (short)(1) ;
         A54TAS01_DATA_KIND = T00053_A54TAS01_DATA_KIND[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A54TAS01_DATA_KIND", A54TAS01_DATA_KIND);
         A55TAS01_ITEM_CD = T00053_A55TAS01_ITEM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A55TAS01_ITEM_CD", A55TAS01_ITEM_CD);
         A47TAS01_CRT_DATETIME = T00053_A47TAS01_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A47TAS01_CRT_DATETIME", localUtil.ttoc( A47TAS01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n47TAS01_CRT_DATETIME = T00053_n47TAS01_CRT_DATETIME[0] ;
         A81TAS01_CRT_USER_ID = T00053_A81TAS01_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A81TAS01_CRT_USER_ID", A81TAS01_CRT_USER_ID);
         n81TAS01_CRT_USER_ID = T00053_n81TAS01_CRT_USER_ID[0] ;
         A50TAS01_UPD_DATETIME = T00053_A50TAS01_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A50TAS01_UPD_DATETIME", localUtil.ttoc( A50TAS01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n50TAS01_UPD_DATETIME = T00053_n50TAS01_UPD_DATETIME[0] ;
         A82TAS01_UPD_USER_ID = T00053_A82TAS01_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A82TAS01_UPD_USER_ID", A82TAS01_UPD_USER_ID);
         n82TAS01_UPD_USER_ID = T00053_n82TAS01_UPD_USER_ID[0] ;
         A114TAS01_UPD_CNT = T00053_A114TAS01_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A114TAS01_UPD_CNT", GXutil.ltrim( GXutil.str( A114TAS01_UPD_CNT, 10, 0)));
         n114TAS01_UPD_CNT = T00053_n114TAS01_UPD_CNT[0] ;
         A19TAS01_ITEM_NM = T00053_A19TAS01_ITEM_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A19TAS01_ITEM_NM", A19TAS01_ITEM_NM);
         n19TAS01_ITEM_NM = T00053_n19TAS01_ITEM_NM[0] ;
         A53TAS01_ITEM_RYAK = T00053_A53TAS01_ITEM_RYAK[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A53TAS01_ITEM_RYAK", A53TAS01_ITEM_RYAK);
         n53TAS01_ITEM_RYAK = T00053_n53TAS01_ITEM_RYAK[0] ;
         A148TAS01_DATA_KIND_NM = T00053_A148TAS01_DATA_KIND_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A148TAS01_DATA_KIND_NM", A148TAS01_DATA_KIND_NM);
         n148TAS01_DATA_KIND_NM = T00053_n148TAS01_DATA_KIND_NM[0] ;
         A149TAS01_SORT_NO = T00053_A149TAS01_SORT_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A149TAS01_SORT_NO", GXutil.ltrim( GXutil.str( A149TAS01_SORT_NO, 3, 0)));
         n149TAS01_SORT_NO = T00053_n149TAS01_SORT_NO[0] ;
         A150TAS01_CHAR_1 = T00053_A150TAS01_CHAR_1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A150TAS01_CHAR_1", A150TAS01_CHAR_1);
         n150TAS01_CHAR_1 = T00053_n150TAS01_CHAR_1[0] ;
         A151TAS01_CHAR_2 = T00053_A151TAS01_CHAR_2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A151TAS01_CHAR_2", A151TAS01_CHAR_2);
         n151TAS01_CHAR_2 = T00053_n151TAS01_CHAR_2[0] ;
         A152TAS01_CHAR_3 = T00053_A152TAS01_CHAR_3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A152TAS01_CHAR_3", A152TAS01_CHAR_3);
         n152TAS01_CHAR_3 = T00053_n152TAS01_CHAR_3[0] ;
         A153TAS01_CHAR_4 = T00053_A153TAS01_CHAR_4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A153TAS01_CHAR_4", A153TAS01_CHAR_4);
         n153TAS01_CHAR_4 = T00053_n153TAS01_CHAR_4[0] ;
         A154TAS01_CHAR_5 = T00053_A154TAS01_CHAR_5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A154TAS01_CHAR_5", A154TAS01_CHAR_5);
         n154TAS01_CHAR_5 = T00053_n154TAS01_CHAR_5[0] ;
         A155TAS01_NUM_1 = T00053_A155TAS01_NUM_1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A155TAS01_NUM_1", GXutil.ltrim( GXutil.str( A155TAS01_NUM_1, 18, 4)));
         n155TAS01_NUM_1 = T00053_n155TAS01_NUM_1[0] ;
         A156TAS01_NUM_2 = T00053_A156TAS01_NUM_2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A156TAS01_NUM_2", GXutil.ltrim( GXutil.str( A156TAS01_NUM_2, 18, 4)));
         n156TAS01_NUM_2 = T00053_n156TAS01_NUM_2[0] ;
         A157TAS01_NUM_3 = T00053_A157TAS01_NUM_3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A157TAS01_NUM_3", GXutil.ltrim( GXutil.str( A157TAS01_NUM_3, 18, 4)));
         n157TAS01_NUM_3 = T00053_n157TAS01_NUM_3[0] ;
         A158TAS01_NUM_4 = T00053_A158TAS01_NUM_4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A158TAS01_NUM_4", GXutil.ltrim( GXutil.str( A158TAS01_NUM_4, 18, 4)));
         n158TAS01_NUM_4 = T00053_n158TAS01_NUM_4[0] ;
         A159TAS01_NUM_5 = T00053_A159TAS01_NUM_5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A159TAS01_NUM_5", GXutil.ltrim( GXutil.str( A159TAS01_NUM_5, 18, 4)));
         n159TAS01_NUM_5 = T00053_n159TAS01_NUM_5[0] ;
         A113TAS01_DEL_FLG = T00053_A113TAS01_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A113TAS01_DEL_FLG", A113TAS01_DEL_FLG);
         n113TAS01_DEL_FLG = T00053_n113TAS01_DEL_FLG[0] ;
         A49TAS01_CRT_PROG_NM = T00053_A49TAS01_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A49TAS01_CRT_PROG_NM", A49TAS01_CRT_PROG_NM);
         n49TAS01_CRT_PROG_NM = T00053_n49TAS01_CRT_PROG_NM[0] ;
         A52TAS01_UPD_PROG_NM = T00053_A52TAS01_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A52TAS01_UPD_PROG_NM", A52TAS01_UPD_PROG_NM);
         n52TAS01_UPD_PROG_NM = T00053_n52TAS01_UPD_PROG_NM[0] ;
         O114TAS01_UPD_CNT = A114TAS01_UPD_CNT ;
         n114TAS01_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A114TAS01_UPD_CNT", GXutil.ltrim( GXutil.str( A114TAS01_UPD_CNT, 10, 0)));
         Z54TAS01_DATA_KIND = A54TAS01_DATA_KIND ;
         Z55TAS01_ITEM_CD = A55TAS01_ITEM_CD ;
         sMode5 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load055( ) ;
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
      pr_default.execute(4, new Object[] {A54TAS01_DATA_KIND, A54TAS01_DATA_KIND, A55TAS01_ITEM_CD});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T00056_A54TAS01_DATA_KIND[0], A54TAS01_DATA_KIND) < 0 ) || ( GXutil.strcmp(T00056_A54TAS01_DATA_KIND[0], A54TAS01_DATA_KIND) == 0 ) && ( GXutil.strcmp(T00056_A55TAS01_ITEM_CD[0], A55TAS01_ITEM_CD) < 0 ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T00056_A54TAS01_DATA_KIND[0], A54TAS01_DATA_KIND) > 0 ) || ( GXutil.strcmp(T00056_A54TAS01_DATA_KIND[0], A54TAS01_DATA_KIND) == 0 ) && ( GXutil.strcmp(T00056_A55TAS01_ITEM_CD[0], A55TAS01_ITEM_CD) > 0 ) ) )
         {
            A54TAS01_DATA_KIND = T00056_A54TAS01_DATA_KIND[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A54TAS01_DATA_KIND", A54TAS01_DATA_KIND);
            A55TAS01_ITEM_CD = T00056_A55TAS01_ITEM_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A55TAS01_ITEM_CD", A55TAS01_ITEM_CD);
            RcdFound5 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound5 = (short)(0) ;
      /* Using cursor T00057 */
      pr_default.execute(5, new Object[] {A54TAS01_DATA_KIND, A54TAS01_DATA_KIND, A55TAS01_ITEM_CD});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T00057_A54TAS01_DATA_KIND[0], A54TAS01_DATA_KIND) > 0 ) || ( GXutil.strcmp(T00057_A54TAS01_DATA_KIND[0], A54TAS01_DATA_KIND) == 0 ) && ( GXutil.strcmp(T00057_A55TAS01_ITEM_CD[0], A55TAS01_ITEM_CD) > 0 ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T00057_A54TAS01_DATA_KIND[0], A54TAS01_DATA_KIND) < 0 ) || ( GXutil.strcmp(T00057_A54TAS01_DATA_KIND[0], A54TAS01_DATA_KIND) == 0 ) && ( GXutil.strcmp(T00057_A55TAS01_ITEM_CD[0], A55TAS01_ITEM_CD) < 0 ) ) )
         {
            A54TAS01_DATA_KIND = T00057_A54TAS01_DATA_KIND[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A54TAS01_DATA_KIND", A54TAS01_DATA_KIND);
            A55TAS01_ITEM_CD = T00057_A55TAS01_ITEM_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A55TAS01_ITEM_CD", A55TAS01_ITEM_CD);
            RcdFound5 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
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
         else if ( ( GXutil.strcmp(A54TAS01_DATA_KIND, Z54TAS01_DATA_KIND) != 0 ) || ( GXutil.strcmp(A55TAS01_ITEM_CD, Z55TAS01_ITEM_CD) != 0 ) )
         {
            A54TAS01_DATA_KIND = Z54TAS01_DATA_KIND ;
            httpContext.ajax_rsp_assign_attri("", false, "A54TAS01_DATA_KIND", A54TAS01_DATA_KIND);
            A55TAS01_ITEM_CD = Z55TAS01_ITEM_CD ;
            httpContext.ajax_rsp_assign_attri("", false, "A55TAS01_ITEM_CD", A55TAS01_ITEM_CD);
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
         if ( ( GXutil.strcmp(A54TAS01_DATA_KIND, Z54TAS01_DATA_KIND) != 0 ) || ( GXutil.strcmp(A55TAS01_ITEM_CD, Z55TAS01_ITEM_CD) != 0 ) )
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
      afterTrn( ) ;
   }

   public void btn_delete( )
   {
      if ( ( GXutil.strcmp(A54TAS01_DATA_KIND, Z54TAS01_DATA_KIND) != 0 ) || ( GXutil.strcmp(A55TAS01_ITEM_CD, Z55TAS01_ITEM_CD) != 0 ) )
      {
         A54TAS01_DATA_KIND = Z54TAS01_DATA_KIND ;
         httpContext.ajax_rsp_assign_attri("", false, "A54TAS01_DATA_KIND", A54TAS01_DATA_KIND);
         A55TAS01_ITEM_CD = Z55TAS01_ITEM_CD ;
         httpContext.ajax_rsp_assign_attri("", false, "A55TAS01_ITEM_CD", A55TAS01_ITEM_CD);
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
      getByPrimaryKey( ) ;
      CloseOpenCursors();
   }

   public void btn_check( )
   {
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
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
         else if ( ( GXutil.strcmp(A54TAS01_DATA_KIND, Z54TAS01_DATA_KIND) != 0 ) || ( GXutil.strcmp(A55TAS01_ITEM_CD, Z55TAS01_ITEM_CD) != 0 ) )
         {
            A54TAS01_DATA_KIND = Z54TAS01_DATA_KIND ;
            httpContext.ajax_rsp_assign_attri("", false, "A54TAS01_DATA_KIND", A54TAS01_DATA_KIND);
            A55TAS01_ITEM_CD = Z55TAS01_ITEM_CD ;
            httpContext.ajax_rsp_assign_attri("", false, "A55TAS01_ITEM_CD", A55TAS01_ITEM_CD);
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
         if ( ( GXutil.strcmp(A54TAS01_DATA_KIND, Z54TAS01_DATA_KIND) != 0 ) || ( GXutil.strcmp(A55TAS01_ITEM_CD, Z55TAS01_ITEM_CD) != 0 ) )
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
      if ( RcdFound5 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TAS01_DATA_KIND");
         AnyError = (short)(1) ;
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
      scanStart055( ) ;
      if ( RcdFound5 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
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
      move_previous( ) ;
      if ( RcdFound5 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
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
      move_next( ) ;
      if ( RcdFound5 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
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
      scanStart055( ) ;
      if ( RcdFound5 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
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
         pr_default.execute(0, new Object[] {A54TAS01_DATA_KIND, A55TAS01_ITEM_CD});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TAS01_CDNM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z47TAS01_CRT_DATETIME.equals( T00052_A47TAS01_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z81TAS01_CRT_USER_ID, T00052_A81TAS01_CRT_USER_ID[0]) != 0 ) || !( Z50TAS01_UPD_DATETIME.equals( T00052_A50TAS01_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z82TAS01_UPD_USER_ID, T00052_A82TAS01_UPD_USER_ID[0]) != 0 ) || ( Z114TAS01_UPD_CNT != T00052_A114TAS01_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z19TAS01_ITEM_NM, T00052_A19TAS01_ITEM_NM[0]) != 0 ) || ( GXutil.strcmp(Z53TAS01_ITEM_RYAK, T00052_A53TAS01_ITEM_RYAK[0]) != 0 ) || ( GXutil.strcmp(Z148TAS01_DATA_KIND_NM, T00052_A148TAS01_DATA_KIND_NM[0]) != 0 ) || ( Z149TAS01_SORT_NO != T00052_A149TAS01_SORT_NO[0] ) || ( GXutil.strcmp(Z150TAS01_CHAR_1, T00052_A150TAS01_CHAR_1[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z151TAS01_CHAR_2, T00052_A151TAS01_CHAR_2[0]) != 0 ) || ( GXutil.strcmp(Z152TAS01_CHAR_3, T00052_A152TAS01_CHAR_3[0]) != 0 ) || ( GXutil.strcmp(Z153TAS01_CHAR_4, T00052_A153TAS01_CHAR_4[0]) != 0 ) || ( GXutil.strcmp(Z154TAS01_CHAR_5, T00052_A154TAS01_CHAR_5[0]) != 0 ) || ( Z155TAS01_NUM_1.compareTo(T00052_A155TAS01_NUM_1[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z156TAS01_NUM_2.compareTo(T00052_A156TAS01_NUM_2[0]) != 0 ) || ( Z157TAS01_NUM_3.compareTo(T00052_A157TAS01_NUM_3[0]) != 0 ) || ( Z158TAS01_NUM_4.compareTo(T00052_A158TAS01_NUM_4[0]) != 0 ) || ( Z159TAS01_NUM_5.compareTo(T00052_A159TAS01_NUM_5[0]) != 0 ) || ( GXutil.strcmp(Z113TAS01_DEL_FLG, T00052_A113TAS01_DEL_FLG[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z49TAS01_CRT_PROG_NM, T00052_A49TAS01_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z52TAS01_UPD_PROG_NM, T00052_A52TAS01_UPD_PROG_NM[0]) != 0 ) )
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
                  pr_default.execute(6, new Object[] {A54TAS01_DATA_KIND, A55TAS01_ITEM_CD, new Boolean(n47TAS01_CRT_DATETIME), A47TAS01_CRT_DATETIME, new Boolean(n81TAS01_CRT_USER_ID), A81TAS01_CRT_USER_ID, new Boolean(n50TAS01_UPD_DATETIME), A50TAS01_UPD_DATETIME, new Boolean(n82TAS01_UPD_USER_ID), A82TAS01_UPD_USER_ID, new Boolean(n114TAS01_UPD_CNT), new Long(A114TAS01_UPD_CNT), new Boolean(n19TAS01_ITEM_NM), A19TAS01_ITEM_NM, new Boolean(n53TAS01_ITEM_RYAK), A53TAS01_ITEM_RYAK, new Boolean(n148TAS01_DATA_KIND_NM), A148TAS01_DATA_KIND_NM, new Boolean(n149TAS01_SORT_NO), new Short(A149TAS01_SORT_NO), new Boolean(n150TAS01_CHAR_1), A150TAS01_CHAR_1, new Boolean(n151TAS01_CHAR_2), A151TAS01_CHAR_2, new Boolean(n152TAS01_CHAR_3), A152TAS01_CHAR_3, new Boolean(n153TAS01_CHAR_4), A153TAS01_CHAR_4, new Boolean(n154TAS01_CHAR_5), A154TAS01_CHAR_5, new Boolean(n155TAS01_NUM_1), A155TAS01_NUM_1, new Boolean(n156TAS01_NUM_2), A156TAS01_NUM_2, new Boolean(n157TAS01_NUM_3), A157TAS01_NUM_3, new Boolean(n158TAS01_NUM_4), A158TAS01_NUM_4, new Boolean(n159TAS01_NUM_5), A159TAS01_NUM_5, new Boolean(n113TAS01_DEL_FLG), A113TAS01_DEL_FLG, new Boolean(n49TAS01_CRT_PROG_NM), A49TAS01_CRT_PROG_NM, new Boolean(n52TAS01_UPD_PROG_NM), A52TAS01_UPD_PROG_NM});
                  if ( (pr_default.getStatus(6) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     new tas01_pc01_datalog(remoteHandle, context).execute( AV14Pgmname, Gx_mode, A54TAS01_DATA_KIND, A55TAS01_ITEM_CD, A19TAS01_ITEM_NM, A53TAS01_ITEM_RYAK, A113TAS01_DEL_FLG, A47TAS01_CRT_DATETIME, A81TAS01_CRT_USER_ID, A49TAS01_CRT_PROG_NM, A50TAS01_UPD_DATETIME, A82TAS01_UPD_USER_ID, A52TAS01_UPD_PROG_NM, A114TAS01_UPD_CNT) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     httpContext.ajax_rsp_assign_attri("", false, "A54TAS01_DATA_KIND", A54TAS01_DATA_KIND);
                     httpContext.ajax_rsp_assign_attri("", false, "A55TAS01_ITEM_CD", A55TAS01_ITEM_CD);
                     httpContext.ajax_rsp_assign_attri("", false, "A19TAS01_ITEM_NM", A19TAS01_ITEM_NM);
                     httpContext.ajax_rsp_assign_attri("", false, "A53TAS01_ITEM_RYAK", A53TAS01_ITEM_RYAK);
                     httpContext.ajax_rsp_assign_attri("", false, "A113TAS01_DEL_FLG", A113TAS01_DEL_FLG);
                     httpContext.ajax_rsp_assign_attri("", false, "A47TAS01_CRT_DATETIME", localUtil.ttoc( A47TAS01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
                     httpContext.ajax_rsp_assign_attri("", false, "A81TAS01_CRT_USER_ID", A81TAS01_CRT_USER_ID);
                     httpContext.ajax_rsp_assign_attri("", false, "A49TAS01_CRT_PROG_NM", A49TAS01_CRT_PROG_NM);
                     httpContext.ajax_rsp_assign_attri("", false, "A50TAS01_UPD_DATETIME", localUtil.ttoc( A50TAS01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
                     httpContext.ajax_rsp_assign_attri("", false, "A82TAS01_UPD_USER_ID", A82TAS01_UPD_USER_ID);
                     httpContext.ajax_rsp_assign_attri("", false, "A52TAS01_UPD_PROG_NM", A52TAS01_UPD_PROG_NM);
                     httpContext.ajax_rsp_assign_attri("", false, "A114TAS01_UPD_CNT", GXutil.ltrim( GXutil.str( A114TAS01_UPD_CNT, 10, 0)));
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucadded"), 0, "");
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
                  pr_default.execute(7, new Object[] {new Boolean(n47TAS01_CRT_DATETIME), A47TAS01_CRT_DATETIME, new Boolean(n81TAS01_CRT_USER_ID), A81TAS01_CRT_USER_ID, new Boolean(n50TAS01_UPD_DATETIME), A50TAS01_UPD_DATETIME, new Boolean(n82TAS01_UPD_USER_ID), A82TAS01_UPD_USER_ID, new Boolean(n114TAS01_UPD_CNT), new Long(A114TAS01_UPD_CNT), new Boolean(n19TAS01_ITEM_NM), A19TAS01_ITEM_NM, new Boolean(n53TAS01_ITEM_RYAK), A53TAS01_ITEM_RYAK, new Boolean(n148TAS01_DATA_KIND_NM), A148TAS01_DATA_KIND_NM, new Boolean(n149TAS01_SORT_NO), new Short(A149TAS01_SORT_NO), new Boolean(n150TAS01_CHAR_1), A150TAS01_CHAR_1, new Boolean(n151TAS01_CHAR_2), A151TAS01_CHAR_2, new Boolean(n152TAS01_CHAR_3), A152TAS01_CHAR_3, new Boolean(n153TAS01_CHAR_4), A153TAS01_CHAR_4, new Boolean(n154TAS01_CHAR_5), A154TAS01_CHAR_5, new Boolean(n155TAS01_NUM_1), A155TAS01_NUM_1, new Boolean(n156TAS01_NUM_2), A156TAS01_NUM_2, new Boolean(n157TAS01_NUM_3), A157TAS01_NUM_3, new Boolean(n158TAS01_NUM_4), A158TAS01_NUM_4, new Boolean(n159TAS01_NUM_5), A159TAS01_NUM_5, new Boolean(n113TAS01_DEL_FLG), A113TAS01_DEL_FLG, new Boolean(n49TAS01_CRT_PROG_NM), A49TAS01_CRT_PROG_NM, new Boolean(n52TAS01_UPD_PROG_NM), A52TAS01_UPD_PROG_NM, A54TAS01_DATA_KIND, A55TAS01_ITEM_CD});
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TAS01_CDNM"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate055( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     new tas01_pc01_datalog(remoteHandle, context).execute( AV14Pgmname, Gx_mode, A54TAS01_DATA_KIND, A55TAS01_ITEM_CD, A19TAS01_ITEM_NM, A53TAS01_ITEM_RYAK, A113TAS01_DEL_FLG, A47TAS01_CRT_DATETIME, A81TAS01_CRT_USER_ID, A49TAS01_CRT_PROG_NM, A50TAS01_UPD_DATETIME, A82TAS01_UPD_USER_ID, A52TAS01_UPD_PROG_NM, A114TAS01_UPD_CNT) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     httpContext.ajax_rsp_assign_attri("", false, "A54TAS01_DATA_KIND", A54TAS01_DATA_KIND);
                     httpContext.ajax_rsp_assign_attri("", false, "A55TAS01_ITEM_CD", A55TAS01_ITEM_CD);
                     httpContext.ajax_rsp_assign_attri("", false, "A19TAS01_ITEM_NM", A19TAS01_ITEM_NM);
                     httpContext.ajax_rsp_assign_attri("", false, "A53TAS01_ITEM_RYAK", A53TAS01_ITEM_RYAK);
                     httpContext.ajax_rsp_assign_attri("", false, "A113TAS01_DEL_FLG", A113TAS01_DEL_FLG);
                     httpContext.ajax_rsp_assign_attri("", false, "A47TAS01_CRT_DATETIME", localUtil.ttoc( A47TAS01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
                     httpContext.ajax_rsp_assign_attri("", false, "A81TAS01_CRT_USER_ID", A81TAS01_CRT_USER_ID);
                     httpContext.ajax_rsp_assign_attri("", false, "A49TAS01_CRT_PROG_NM", A49TAS01_CRT_PROG_NM);
                     httpContext.ajax_rsp_assign_attri("", false, "A50TAS01_UPD_DATETIME", localUtil.ttoc( A50TAS01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
                     httpContext.ajax_rsp_assign_attri("", false, "A82TAS01_UPD_USER_ID", A82TAS01_UPD_USER_ID);
                     httpContext.ajax_rsp_assign_attri("", false, "A52TAS01_UPD_PROG_NM", A52TAS01_UPD_PROG_NM);
                     httpContext.ajax_rsp_assign_attri("", false, "A114TAS01_UPD_CNT", GXutil.ltrim( GXutil.str( A114TAS01_UPD_CNT, 10, 0)));
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "");
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
               pr_default.execute(8, new Object[] {A54TAS01_DATA_KIND, A55TAS01_ITEM_CD});
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  new tas01_pc01_datalog(remoteHandle, context).execute( AV14Pgmname, Gx_mode, A54TAS01_DATA_KIND, A55TAS01_ITEM_CD, A19TAS01_ITEM_NM, A53TAS01_ITEM_RYAK, A113TAS01_DEL_FLG, A47TAS01_CRT_DATETIME, A81TAS01_CRT_USER_ID, A49TAS01_CRT_PROG_NM, A50TAS01_UPD_DATETIME, A82TAS01_UPD_USER_ID, A52TAS01_UPD_PROG_NM, A114TAS01_UPD_CNT) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "A54TAS01_DATA_KIND", A54TAS01_DATA_KIND);
                  httpContext.ajax_rsp_assign_attri("", false, "A55TAS01_ITEM_CD", A55TAS01_ITEM_CD);
                  httpContext.ajax_rsp_assign_attri("", false, "A19TAS01_ITEM_NM", A19TAS01_ITEM_NM);
                  httpContext.ajax_rsp_assign_attri("", false, "A53TAS01_ITEM_RYAK", A53TAS01_ITEM_RYAK);
                  httpContext.ajax_rsp_assign_attri("", false, "A113TAS01_DEL_FLG", A113TAS01_DEL_FLG);
                  httpContext.ajax_rsp_assign_attri("", false, "A47TAS01_CRT_DATETIME", localUtil.ttoc( A47TAS01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
                  httpContext.ajax_rsp_assign_attri("", false, "A81TAS01_CRT_USER_ID", A81TAS01_CRT_USER_ID);
                  httpContext.ajax_rsp_assign_attri("", false, "A49TAS01_CRT_PROG_NM", A49TAS01_CRT_PROG_NM);
                  httpContext.ajax_rsp_assign_attri("", false, "A50TAS01_UPD_DATETIME", localUtil.ttoc( A50TAS01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
                  httpContext.ajax_rsp_assign_attri("", false, "A82TAS01_UPD_USER_ID", A82TAS01_UPD_USER_ID);
                  httpContext.ajax_rsp_assign_attri("", false, "A52TAS01_UPD_PROG_NM", A52TAS01_UPD_PROG_NM);
                  httpContext.ajax_rsp_assign_attri("", false, "A114TAS01_UPD_CNT", GXutil.ltrim( GXutil.str( A114TAS01_UPD_CNT, 10, 0)));
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
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucdeleted"), 0, "");
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
      /* Using cursor T000511 */
      pr_default.execute(9);
      RcdFound5 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound5 = (short)(1) ;
         A54TAS01_DATA_KIND = T000511_A54TAS01_DATA_KIND[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A54TAS01_DATA_KIND", A54TAS01_DATA_KIND);
         A55TAS01_ITEM_CD = T000511_A55TAS01_ITEM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A55TAS01_ITEM_CD", A55TAS01_ITEM_CD);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext055( )
   {
      pr_default.readNext(9);
      RcdFound5 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound5 = (short)(1) ;
         A54TAS01_DATA_KIND = T000511_A54TAS01_DATA_KIND[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A54TAS01_DATA_KIND", A54TAS01_DATA_KIND);
         A55TAS01_ITEM_CD = T000511_A55TAS01_ITEM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A55TAS01_ITEM_CD", A55TAS01_ITEM_CD);
      }
   }

   public void scanEnd055( )
   {
      pr_default.close(9);
   }

   public void afterConfirm055( )
   {
      /* After Confirm Rules */
      if ( (GXutil.strcmp("", A54TAS01_DATA_KIND)==0) )
      {
         httpContext.GX_msglist.addItem("データ種類を入力してください", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( 3 < GXutil.byteCount( A54TAS01_DATA_KIND, "Shift-JIS") )
      {
         httpContext.GX_msglist.addItem("データ種類は半角3桁以内になるようにしてください。", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( (GXutil.strcmp("", A55TAS01_ITEM_CD)==0) )
      {
         httpContext.GX_msglist.addItem("項目コードを入力してください", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( 4 < GXutil.byteCount( A55TAS01_ITEM_CD, "Shift-JIS") )
      {
         httpContext.GX_msglist.addItem("項目コードは半角4桁以内になるようにしてください。", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( (GXutil.strcmp("", A19TAS01_ITEM_NM)==0) )
      {
         httpContext.GX_msglist.addItem("項目名称を入力してください", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( 60 < GXutil.byteCount( A19TAS01_ITEM_NM, "Shift-JIS") )
      {
         httpContext.GX_msglist.addItem("項目名称は全角30桁又は半角60桁以内になるようにしてください。", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( 20 < GXutil.byteCount( A53TAS01_ITEM_RYAK, "Shift-JIS") )
      {
         httpContext.GX_msglist.addItem("項目略称は全角10桁又は半角20桁以内になるようにしてください。", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( 40 < GXutil.byteCount( A148TAS01_DATA_KIND_NM, "Shift-JIS") )
      {
         httpContext.GX_msglist.addItem("データ種類名は全角20桁又は半角40桁以内になるようにしてください。", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( 100 < GXutil.byteCount( A150TAS01_CHAR_1, "Shift-JIS") )
      {
         httpContext.GX_msglist.addItem("予備項目（文字１）は全角50桁又は半角100桁以内になるようにしてください。", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( 100 < GXutil.byteCount( A151TAS01_CHAR_2, "Shift-JIS") )
      {
         httpContext.GX_msglist.addItem("予備項目（文字２）は全角50桁又は半角100桁以内になるようにしてください。", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( 100 < GXutil.byteCount( A152TAS01_CHAR_3, "Shift-JIS") )
      {
         httpContext.GX_msglist.addItem("予備項目（文字３）は全角50桁又は半角100桁以内になるようにしてください。", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( 100 < GXutil.byteCount( A153TAS01_CHAR_4, "Shift-JIS") )
      {
         httpContext.GX_msglist.addItem("予備項目（文字４）は全角50桁又は半角100桁以内になるようにしてください。", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( 100 < GXutil.byteCount( A154TAS01_CHAR_5, "Shift-JIS") )
      {
         httpContext.GX_msglist.addItem("予備項目（文字５）は全角50桁又は半角100桁以内になるようにしてください。", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
   }

   public void beforeInsert055( )
   {
      /* Before Insert Rules */
      A47TAS01_CRT_DATETIME = GXutil.now( ) ;
      n47TAS01_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A47TAS01_CRT_DATETIME", localUtil.ttoc( A47TAS01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char2 = A81TAS01_CRT_USER_ID ;
      GXv_char5[0] = GXt_char2 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char5) ;
      tas01_cdnm_impl.this.GXt_char2 = GXv_char5[0] ;
      A81TAS01_CRT_USER_ID = GXt_char2 ;
      n81TAS01_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A81TAS01_CRT_USER_ID", A81TAS01_CRT_USER_ID);
      A50TAS01_UPD_DATETIME = GXutil.now( ) ;
      n50TAS01_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A50TAS01_UPD_DATETIME", localUtil.ttoc( A50TAS01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char2 = A82TAS01_UPD_USER_ID ;
      GXv_char5[0] = GXt_char2 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char5) ;
      tas01_cdnm_impl.this.GXt_char2 = GXv_char5[0] ;
      A82TAS01_UPD_USER_ID = GXt_char2 ;
      n82TAS01_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A82TAS01_UPD_USER_ID", A82TAS01_UPD_USER_ID);
      A114TAS01_UPD_CNT = (long)(O114TAS01_UPD_CNT+1) ;
      n114TAS01_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A114TAS01_UPD_CNT", GXutil.ltrim( GXutil.str( A114TAS01_UPD_CNT, 10, 0)));
   }

   public void beforeUpdate055( )
   {
      /* Before Update Rules */
      A50TAS01_UPD_DATETIME = GXutil.now( ) ;
      n50TAS01_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A50TAS01_UPD_DATETIME", localUtil.ttoc( A50TAS01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char2 = A82TAS01_UPD_USER_ID ;
      GXv_char5[0] = GXt_char2 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char5) ;
      tas01_cdnm_impl.this.GXt_char2 = GXv_char5[0] ;
      A82TAS01_UPD_USER_ID = GXt_char2 ;
      n82TAS01_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A82TAS01_UPD_USER_ID", A82TAS01_UPD_USER_ID);
      A114TAS01_UPD_CNT = (long)(O114TAS01_UPD_CNT+1) ;
      n114TAS01_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A114TAS01_UPD_CNT", GXutil.ltrim( GXutil.str( A114TAS01_UPD_CNT, 10, 0)));
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
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), "IE=EmulateIE7");
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeText( "項目名称マスタ") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" onsubmit=\"try{return gx.csv.validForm()}catch(e){return true;}\" name=\"MAINFORM\" method=\"post\" action=\""+formatLink("tas01_cdnm") +"\" class=\""+"Form"+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
   }

   public void renderHtmlCloseForm055( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z54TAS01_DATA_KIND", GXutil.rtrim( Z54TAS01_DATA_KIND));
      GxWebStd.gx_hidden_field( httpContext, "Z55TAS01_ITEM_CD", GXutil.rtrim( Z55TAS01_ITEM_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z47TAS01_CRT_DATETIME", localUtil.ttoc( Z47TAS01_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z81TAS01_CRT_USER_ID", GXutil.rtrim( Z81TAS01_CRT_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z50TAS01_UPD_DATETIME", localUtil.ttoc( Z50TAS01_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z82TAS01_UPD_USER_ID", GXutil.rtrim( Z82TAS01_UPD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z114TAS01_UPD_CNT", GXutil.ltrim( localUtil.ntoc( Z114TAS01_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z19TAS01_ITEM_NM", GXutil.rtrim( Z19TAS01_ITEM_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z53TAS01_ITEM_RYAK", GXutil.rtrim( Z53TAS01_ITEM_RYAK));
      GxWebStd.gx_hidden_field( httpContext, "Z148TAS01_DATA_KIND_NM", GXutil.rtrim( Z148TAS01_DATA_KIND_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z149TAS01_SORT_NO", GXutil.ltrim( localUtil.ntoc( Z149TAS01_SORT_NO, (byte)(3), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z150TAS01_CHAR_1", GXutil.rtrim( Z150TAS01_CHAR_1));
      GxWebStd.gx_hidden_field( httpContext, "Z151TAS01_CHAR_2", GXutil.rtrim( Z151TAS01_CHAR_2));
      GxWebStd.gx_hidden_field( httpContext, "Z152TAS01_CHAR_3", GXutil.rtrim( Z152TAS01_CHAR_3));
      GxWebStd.gx_hidden_field( httpContext, "Z153TAS01_CHAR_4", GXutil.rtrim( Z153TAS01_CHAR_4));
      GxWebStd.gx_hidden_field( httpContext, "Z154TAS01_CHAR_5", GXutil.rtrim( Z154TAS01_CHAR_5));
      GxWebStd.gx_hidden_field( httpContext, "Z155TAS01_NUM_1", GXutil.ltrim( localUtil.ntoc( Z155TAS01_NUM_1, (byte)(18), (byte)(4), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z156TAS01_NUM_2", GXutil.ltrim( localUtil.ntoc( Z156TAS01_NUM_2, (byte)(18), (byte)(4), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z157TAS01_NUM_3", GXutil.ltrim( localUtil.ntoc( Z157TAS01_NUM_3, (byte)(18), (byte)(4), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z158TAS01_NUM_4", GXutil.ltrim( localUtil.ntoc( Z158TAS01_NUM_4, (byte)(18), (byte)(4), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z159TAS01_NUM_5", GXutil.ltrim( localUtil.ntoc( Z159TAS01_NUM_5, (byte)(18), (byte)(4), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z113TAS01_DEL_FLG", GXutil.rtrim( Z113TAS01_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z49TAS01_CRT_PROG_NM", GXutil.rtrim( Z49TAS01_CRT_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z52TAS01_UPD_PROG_NM", GXutil.rtrim( Z52TAS01_UPD_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "O114TAS01_UPD_CNT", GXutil.ltrim( localUtil.ntoc( O114TAS01_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      GxWebStd.gx_hidden_field( httpContext, "TAS01_UPD_CNT", GXutil.ltrim( localUtil.ntoc( A114TAS01_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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

   public void initializeNonKey055( )
   {
      A47TAS01_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n47TAS01_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A47TAS01_CRT_DATETIME", localUtil.ttoc( A47TAS01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n47TAS01_CRT_DATETIME = (GXutil.nullDate().equals(A47TAS01_CRT_DATETIME) ? true : false) ;
      A81TAS01_CRT_USER_ID = "" ;
      n81TAS01_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A81TAS01_CRT_USER_ID", A81TAS01_CRT_USER_ID);
      n81TAS01_CRT_USER_ID = ((GXutil.strcmp("", A81TAS01_CRT_USER_ID)==0) ? true : false) ;
      A50TAS01_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n50TAS01_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A50TAS01_UPD_DATETIME", localUtil.ttoc( A50TAS01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n50TAS01_UPD_DATETIME = (GXutil.nullDate().equals(A50TAS01_UPD_DATETIME) ? true : false) ;
      A82TAS01_UPD_USER_ID = "" ;
      n82TAS01_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A82TAS01_UPD_USER_ID", A82TAS01_UPD_USER_ID);
      n82TAS01_UPD_USER_ID = ((GXutil.strcmp("", A82TAS01_UPD_USER_ID)==0) ? true : false) ;
      A114TAS01_UPD_CNT = 0 ;
      n114TAS01_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A114TAS01_UPD_CNT", GXutil.ltrim( GXutil.str( A114TAS01_UPD_CNT, 10, 0)));
      A19TAS01_ITEM_NM = "" ;
      n19TAS01_ITEM_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A19TAS01_ITEM_NM", A19TAS01_ITEM_NM);
      n19TAS01_ITEM_NM = ((GXutil.strcmp("", A19TAS01_ITEM_NM)==0) ? true : false) ;
      A53TAS01_ITEM_RYAK = "" ;
      n53TAS01_ITEM_RYAK = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A53TAS01_ITEM_RYAK", A53TAS01_ITEM_RYAK);
      n53TAS01_ITEM_RYAK = ((GXutil.strcmp("", A53TAS01_ITEM_RYAK)==0) ? true : false) ;
      A148TAS01_DATA_KIND_NM = "" ;
      n148TAS01_DATA_KIND_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A148TAS01_DATA_KIND_NM", A148TAS01_DATA_KIND_NM);
      n148TAS01_DATA_KIND_NM = ((GXutil.strcmp("", A148TAS01_DATA_KIND_NM)==0) ? true : false) ;
      A149TAS01_SORT_NO = (short)(0) ;
      n149TAS01_SORT_NO = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A149TAS01_SORT_NO", GXutil.ltrim( GXutil.str( A149TAS01_SORT_NO, 3, 0)));
      n149TAS01_SORT_NO = ((0==A149TAS01_SORT_NO) ? true : false) ;
      A150TAS01_CHAR_1 = "" ;
      n150TAS01_CHAR_1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A150TAS01_CHAR_1", A150TAS01_CHAR_1);
      n150TAS01_CHAR_1 = ((GXutil.strcmp("", A150TAS01_CHAR_1)==0) ? true : false) ;
      A151TAS01_CHAR_2 = "" ;
      n151TAS01_CHAR_2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A151TAS01_CHAR_2", A151TAS01_CHAR_2);
      n151TAS01_CHAR_2 = ((GXutil.strcmp("", A151TAS01_CHAR_2)==0) ? true : false) ;
      A152TAS01_CHAR_3 = "" ;
      n152TAS01_CHAR_3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A152TAS01_CHAR_3", A152TAS01_CHAR_3);
      n152TAS01_CHAR_3 = ((GXutil.strcmp("", A152TAS01_CHAR_3)==0) ? true : false) ;
      A153TAS01_CHAR_4 = "" ;
      n153TAS01_CHAR_4 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A153TAS01_CHAR_4", A153TAS01_CHAR_4);
      n153TAS01_CHAR_4 = ((GXutil.strcmp("", A153TAS01_CHAR_4)==0) ? true : false) ;
      A154TAS01_CHAR_5 = "" ;
      n154TAS01_CHAR_5 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A154TAS01_CHAR_5", A154TAS01_CHAR_5);
      n154TAS01_CHAR_5 = ((GXutil.strcmp("", A154TAS01_CHAR_5)==0) ? true : false) ;
      A155TAS01_NUM_1 = DecimalUtil.ZERO ;
      n155TAS01_NUM_1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A155TAS01_NUM_1", GXutil.ltrim( GXutil.str( A155TAS01_NUM_1, 18, 4)));
      n155TAS01_NUM_1 = ((DecimalUtil.ZERO.compareTo(A155TAS01_NUM_1)==0) ? true : false) ;
      A156TAS01_NUM_2 = DecimalUtil.ZERO ;
      n156TAS01_NUM_2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A156TAS01_NUM_2", GXutil.ltrim( GXutil.str( A156TAS01_NUM_2, 18, 4)));
      n156TAS01_NUM_2 = ((DecimalUtil.ZERO.compareTo(A156TAS01_NUM_2)==0) ? true : false) ;
      A157TAS01_NUM_3 = DecimalUtil.ZERO ;
      n157TAS01_NUM_3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A157TAS01_NUM_3", GXutil.ltrim( GXutil.str( A157TAS01_NUM_3, 18, 4)));
      n157TAS01_NUM_3 = ((DecimalUtil.ZERO.compareTo(A157TAS01_NUM_3)==0) ? true : false) ;
      A158TAS01_NUM_4 = DecimalUtil.ZERO ;
      n158TAS01_NUM_4 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A158TAS01_NUM_4", GXutil.ltrim( GXutil.str( A158TAS01_NUM_4, 18, 4)));
      n158TAS01_NUM_4 = ((DecimalUtil.ZERO.compareTo(A158TAS01_NUM_4)==0) ? true : false) ;
      A159TAS01_NUM_5 = DecimalUtil.ZERO ;
      n159TAS01_NUM_5 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A159TAS01_NUM_5", GXutil.ltrim( GXutil.str( A159TAS01_NUM_5, 18, 4)));
      n159TAS01_NUM_5 = ((DecimalUtil.ZERO.compareTo(A159TAS01_NUM_5)==0) ? true : false) ;
      A113TAS01_DEL_FLG = "0" ;
      n113TAS01_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A113TAS01_DEL_FLG", A113TAS01_DEL_FLG);
      A49TAS01_CRT_PROG_NM = AV14Pgmname ;
      n49TAS01_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A49TAS01_CRT_PROG_NM", A49TAS01_CRT_PROG_NM);
      A52TAS01_UPD_PROG_NM = AV14Pgmname ;
      n52TAS01_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A52TAS01_UPD_PROG_NM", A52TAS01_UPD_PROG_NM);
      O114TAS01_UPD_CNT = A114TAS01_UPD_CNT ;
      n114TAS01_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A114TAS01_UPD_CNT", GXutil.ltrim( GXutil.str( A114TAS01_UPD_CNT, 10, 0)));
   }

   public void initAll055( )
   {
      A54TAS01_DATA_KIND = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A54TAS01_DATA_KIND", A54TAS01_DATA_KIND);
      A55TAS01_ITEM_CD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A55TAS01_ITEM_CD", A55TAS01_ITEM_CD);
      initializeNonKey055( ) ;
   }

   public void standaloneModalInsert( )
   {
      A113TAS01_DEL_FLG = i113TAS01_DEL_FLG ;
      n113TAS01_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A113TAS01_DEL_FLG", A113TAS01_DEL_FLG);
      A49TAS01_CRT_PROG_NM = i49TAS01_CRT_PROG_NM ;
      n49TAS01_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A49TAS01_CRT_PROG_NM", A49TAS01_CRT_PROG_NM);
      A52TAS01_UPD_PROG_NM = i52TAS01_UPD_PROG_NM ;
      n52TAS01_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A52TAS01_UPD_PROG_NM", A52TAS01_UPD_PROG_NM);
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("calendar-system.css", "?225080");
      httpContext.AddThemeStyleSheetFile("", "Style2.css", "?14454892");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?14534566");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?58720");
      httpContext.AddJavascriptSource("gxdec.js", "?58720");
      httpContext.AddJavascriptSource("tas01_cdnm.js", "?14534567");
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
      GXt_char6 = A81TAS01_CRT_USER_ID ;
      GXv_char5[0] = GXt_char6 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char5) ;
      tas01_cdnm_impl.this.GXt_char6 = GXv_char5[0] ;
      A81TAS01_CRT_USER_ID = GXt_char6 ;
      n81TAS01_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A81TAS01_CRT_USER_ID", A81TAS01_CRT_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A81TAS01_CRT_USER_ID))+"\"");
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
      GXt_char6 = A82TAS01_UPD_USER_ID ;
      GXv_char5[0] = GXt_char6 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char5) ;
      tas01_cdnm_impl.this.GXt_char6 = GXv_char5[0] ;
      A82TAS01_UPD_USER_ID = GXt_char6 ;
      n82TAS01_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A82TAS01_UPD_USER_ID", A82TAS01_UPD_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A82TAS01_UPD_USER_ID))+"\"");
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
                          String A54TAS01_DATA_KIND ,
                          String A55TAS01_ITEM_CD ,
                          String A19TAS01_ITEM_NM ,
                          String A53TAS01_ITEM_RYAK ,
                          String A113TAS01_DEL_FLG ,
                          java.util.Date A47TAS01_CRT_DATETIME ,
                          String A81TAS01_CRT_USER_ID ,
                          String A49TAS01_CRT_PROG_NM ,
                          java.util.Date A50TAS01_UPD_DATETIME ,
                          String A82TAS01_UPD_USER_ID ,
                          String A52TAS01_UPD_PROG_NM ,
                          long A114TAS01_UPD_CNT )
   {
      new tas01_pc01_datalog(remoteHandle, context).execute( AV14Pgmname, Gx_mode, A54TAS01_DATA_KIND, A55TAS01_ITEM_CD, A19TAS01_ITEM_NM, A53TAS01_ITEM_RYAK, A113TAS01_DEL_FLG, A47TAS01_CRT_DATETIME, A81TAS01_CRT_USER_ID, A49TAS01_CRT_PROG_NM, A50TAS01_UPD_DATETIME, A82TAS01_UPD_USER_ID, A52TAS01_UPD_PROG_NM, A114TAS01_UPD_CNT) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "A54TAS01_DATA_KIND", A54TAS01_DATA_KIND);
      httpContext.ajax_rsp_assign_attri("", false, "A55TAS01_ITEM_CD", A55TAS01_ITEM_CD);
      httpContext.ajax_rsp_assign_attri("", false, "A19TAS01_ITEM_NM", A19TAS01_ITEM_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A53TAS01_ITEM_RYAK", A53TAS01_ITEM_RYAK);
      httpContext.ajax_rsp_assign_attri("", false, "A113TAS01_DEL_FLG", A113TAS01_DEL_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "A47TAS01_CRT_DATETIME", localUtil.ttoc( A47TAS01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A81TAS01_CRT_USER_ID", A81TAS01_CRT_USER_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A49TAS01_CRT_PROG_NM", A49TAS01_CRT_PROG_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A50TAS01_UPD_DATETIME", localUtil.ttoc( A50TAS01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A82TAS01_UPD_USER_ID", A82TAS01_UPD_USER_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A52TAS01_UPD_PROG_NM", A52TAS01_UPD_PROG_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A114TAS01_UPD_CNT", GXutil.ltrim( GXutil.str( A114TAS01_UPD_CNT, 10, 0)));
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
                          String A54TAS01_DATA_KIND ,
                          String A55TAS01_ITEM_CD ,
                          String A19TAS01_ITEM_NM ,
                          String A53TAS01_ITEM_RYAK ,
                          String A113TAS01_DEL_FLG ,
                          java.util.Date A47TAS01_CRT_DATETIME ,
                          String A81TAS01_CRT_USER_ID ,
                          String A49TAS01_CRT_PROG_NM ,
                          java.util.Date A50TAS01_UPD_DATETIME ,
                          String A82TAS01_UPD_USER_ID ,
                          String A52TAS01_UPD_PROG_NM ,
                          long A114TAS01_UPD_CNT )
   {
      new tas01_pc01_datalog(remoteHandle, context).execute( AV14Pgmname, Gx_mode, A54TAS01_DATA_KIND, A55TAS01_ITEM_CD, A19TAS01_ITEM_NM, A53TAS01_ITEM_RYAK, A113TAS01_DEL_FLG, A47TAS01_CRT_DATETIME, A81TAS01_CRT_USER_ID, A49TAS01_CRT_PROG_NM, A50TAS01_UPD_DATETIME, A82TAS01_UPD_USER_ID, A52TAS01_UPD_PROG_NM, A114TAS01_UPD_CNT) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "A54TAS01_DATA_KIND", A54TAS01_DATA_KIND);
      httpContext.ajax_rsp_assign_attri("", false, "A55TAS01_ITEM_CD", A55TAS01_ITEM_CD);
      httpContext.ajax_rsp_assign_attri("", false, "A19TAS01_ITEM_NM", A19TAS01_ITEM_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A53TAS01_ITEM_RYAK", A53TAS01_ITEM_RYAK);
      httpContext.ajax_rsp_assign_attri("", false, "A113TAS01_DEL_FLG", A113TAS01_DEL_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "A47TAS01_CRT_DATETIME", localUtil.ttoc( A47TAS01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A81TAS01_CRT_USER_ID", A81TAS01_CRT_USER_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A49TAS01_CRT_PROG_NM", A49TAS01_CRT_PROG_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A50TAS01_UPD_DATETIME", localUtil.ttoc( A50TAS01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A82TAS01_UPD_USER_ID", A82TAS01_UPD_USER_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A52TAS01_UPD_PROG_NM", A52TAS01_UPD_PROG_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A114TAS01_UPD_CNT", GXutil.ltrim( GXutil.str( A114TAS01_UPD_CNT, 10, 0)));
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
                          String A54TAS01_DATA_KIND ,
                          String A55TAS01_ITEM_CD ,
                          String A19TAS01_ITEM_NM ,
                          String A53TAS01_ITEM_RYAK ,
                          String A113TAS01_DEL_FLG ,
                          java.util.Date A47TAS01_CRT_DATETIME ,
                          String A81TAS01_CRT_USER_ID ,
                          String A49TAS01_CRT_PROG_NM ,
                          java.util.Date A50TAS01_UPD_DATETIME ,
                          String A82TAS01_UPD_USER_ID ,
                          String A52TAS01_UPD_PROG_NM ,
                          long A114TAS01_UPD_CNT )
   {
      new tas01_pc01_datalog(remoteHandle, context).execute( AV14Pgmname, Gx_mode, A54TAS01_DATA_KIND, A55TAS01_ITEM_CD, A19TAS01_ITEM_NM, A53TAS01_ITEM_RYAK, A113TAS01_DEL_FLG, A47TAS01_CRT_DATETIME, A81TAS01_CRT_USER_ID, A49TAS01_CRT_PROG_NM, A50TAS01_UPD_DATETIME, A82TAS01_UPD_USER_ID, A52TAS01_UPD_PROG_NM, A114TAS01_UPD_CNT) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "A54TAS01_DATA_KIND", A54TAS01_DATA_KIND);
      httpContext.ajax_rsp_assign_attri("", false, "A55TAS01_ITEM_CD", A55TAS01_ITEM_CD);
      httpContext.ajax_rsp_assign_attri("", false, "A19TAS01_ITEM_NM", A19TAS01_ITEM_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A53TAS01_ITEM_RYAK", A53TAS01_ITEM_RYAK);
      httpContext.ajax_rsp_assign_attri("", false, "A113TAS01_DEL_FLG", A113TAS01_DEL_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "A47TAS01_CRT_DATETIME", localUtil.ttoc( A47TAS01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A81TAS01_CRT_USER_ID", A81TAS01_CRT_USER_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A49TAS01_CRT_PROG_NM", A49TAS01_CRT_PROG_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A50TAS01_UPD_DATETIME", localUtil.ttoc( A50TAS01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A82TAS01_UPD_USER_ID", A82TAS01_UPD_USER_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A52TAS01_UPD_PROG_NM", A52TAS01_UPD_PROG_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A114TAS01_UPD_CNT", GXutil.ltrim( GXutil.str( A114TAS01_UPD_CNT, 10, 0)));
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
      A54TAS01_DATA_KIND = GX_Parm1 ;
      A55TAS01_ITEM_CD = GX_Parm2 ;
      A47TAS01_CRT_DATETIME = GX_Parm3 ;
      n47TAS01_CRT_DATETIME = false ;
      A81TAS01_CRT_USER_ID = GX_Parm4 ;
      n81TAS01_CRT_USER_ID = false ;
      A50TAS01_UPD_DATETIME = GX_Parm5 ;
      n50TAS01_UPD_DATETIME = false ;
      A82TAS01_UPD_USER_ID = GX_Parm6 ;
      n82TAS01_UPD_USER_ID = false ;
      A114TAS01_UPD_CNT = GX_Parm7 ;
      n114TAS01_UPD_CNT = false ;
      A19TAS01_ITEM_NM = GX_Parm8 ;
      n19TAS01_ITEM_NM = false ;
      A53TAS01_ITEM_RYAK = GX_Parm9 ;
      n53TAS01_ITEM_RYAK = false ;
      A148TAS01_DATA_KIND_NM = GX_Parm10 ;
      n148TAS01_DATA_KIND_NM = false ;
      A149TAS01_SORT_NO = GX_Parm11 ;
      n149TAS01_SORT_NO = false ;
      A150TAS01_CHAR_1 = GX_Parm12 ;
      n150TAS01_CHAR_1 = false ;
      A151TAS01_CHAR_2 = GX_Parm13 ;
      n151TAS01_CHAR_2 = false ;
      A152TAS01_CHAR_3 = GX_Parm14 ;
      n152TAS01_CHAR_3 = false ;
      A153TAS01_CHAR_4 = GX_Parm15 ;
      n153TAS01_CHAR_4 = false ;
      A154TAS01_CHAR_5 = GX_Parm16 ;
      n154TAS01_CHAR_5 = false ;
      A155TAS01_NUM_1 = GX_Parm17 ;
      n155TAS01_NUM_1 = false ;
      A156TAS01_NUM_2 = GX_Parm18 ;
      n156TAS01_NUM_2 = false ;
      A157TAS01_NUM_3 = GX_Parm19 ;
      n157TAS01_NUM_3 = false ;
      A158TAS01_NUM_4 = GX_Parm20 ;
      n158TAS01_NUM_4 = false ;
      A159TAS01_NUM_5 = GX_Parm21 ;
      n159TAS01_NUM_5 = false ;
      A113TAS01_DEL_FLG = GX_Parm22 ;
      n113TAS01_DEL_FLG = false ;
      A49TAS01_CRT_PROG_NM = GX_Parm23 ;
      n49TAS01_CRT_PROG_NM = false ;
      A52TAS01_UPD_PROG_NM = GX_Parm24 ;
      n52TAS01_UPD_PROG_NM = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(localUtil.format(A47TAS01_CRT_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A81TAS01_CRT_USER_ID));
      isValidOutput.add(localUtil.format(A50TAS01_UPD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A82TAS01_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A114TAS01_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A19TAS01_ITEM_NM));
      isValidOutput.add(GXutil.rtrim( A53TAS01_ITEM_RYAK));
      isValidOutput.add(GXutil.rtrim( A148TAS01_DATA_KIND_NM));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A149TAS01_SORT_NO, (byte)(3), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A150TAS01_CHAR_1));
      isValidOutput.add(GXutil.rtrim( A151TAS01_CHAR_2));
      isValidOutput.add(GXutil.rtrim( A152TAS01_CHAR_3));
      isValidOutput.add(GXutil.rtrim( A153TAS01_CHAR_4));
      isValidOutput.add(GXutil.rtrim( A154TAS01_CHAR_5));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A155TAS01_NUM_1, (byte)(18), (byte)(4), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A156TAS01_NUM_2, (byte)(18), (byte)(4), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A157TAS01_NUM_3, (byte)(18), (byte)(4), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A158TAS01_NUM_4, (byte)(18), (byte)(4), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A159TAS01_NUM_5, (byte)(18), (byte)(4), ".", "")));
      isValidOutput.add(GXutil.rtrim( A113TAS01_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( A49TAS01_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( A52TAS01_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( AV14Pgmname));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.rtrim( Z54TAS01_DATA_KIND));
      isValidOutput.add(GXutil.rtrim( Z55TAS01_ITEM_CD));
      isValidOutput.add(localUtil.ttoc( Z47TAS01_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z81TAS01_CRT_USER_ID));
      isValidOutput.add(localUtil.ttoc( Z50TAS01_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z82TAS01_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z114TAS01_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z19TAS01_ITEM_NM));
      isValidOutput.add(GXutil.rtrim( Z53TAS01_ITEM_RYAK));
      isValidOutput.add(GXutil.rtrim( Z148TAS01_DATA_KIND_NM));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z149TAS01_SORT_NO, (byte)(3), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z150TAS01_CHAR_1));
      isValidOutput.add(GXutil.rtrim( Z151TAS01_CHAR_2));
      isValidOutput.add(GXutil.rtrim( Z152TAS01_CHAR_3));
      isValidOutput.add(GXutil.rtrim( Z153TAS01_CHAR_4));
      isValidOutput.add(GXutil.rtrim( Z154TAS01_CHAR_5));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z155TAS01_NUM_1, (byte)(18), (byte)(4), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z156TAS01_NUM_2, (byte)(18), (byte)(4), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z157TAS01_NUM_3, (byte)(18), (byte)(4), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z158TAS01_NUM_4, (byte)(18), (byte)(4), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z159TAS01_NUM_5, (byte)(18), (byte)(4), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z113TAS01_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( Z49TAS01_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( Z52TAS01_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( ZV14Pgmname));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( O114TAS01_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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
      A54TAS01_DATA_KIND = "" ;
      A55TAS01_ITEM_CD = "" ;
      A19TAS01_ITEM_NM = "" ;
      A53TAS01_ITEM_RYAK = "" ;
      A113TAS01_DEL_FLG = "" ;
      A47TAS01_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A81TAS01_CRT_USER_ID = "" ;
      A49TAS01_CRT_PROG_NM = "" ;
      A50TAS01_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A82TAS01_UPD_USER_ID = "" ;
      A52TAS01_UPD_PROG_NM = "" ;
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
      A148TAS01_DATA_KIND_NM = "" ;
      lblTextblocktas01_item_ryak3_Jsonclick = "" ;
      lblTextblocktas01_item_ryak4_Jsonclick = "" ;
      A150TAS01_CHAR_1 = "" ;
      lblTextblocktas01_item_ryak6_Jsonclick = "" ;
      A151TAS01_CHAR_2 = "" ;
      lblTextblocktas01_item_ryak7_Jsonclick = "" ;
      A152TAS01_CHAR_3 = "" ;
      lblTextblocktas01_item_ryak8_Jsonclick = "" ;
      A153TAS01_CHAR_4 = "" ;
      lblTextblocktas01_item_ryak9_Jsonclick = "" ;
      A154TAS01_CHAR_5 = "" ;
      lblTextblocktas01_item_ryak5_Jsonclick = "" ;
      A155TAS01_NUM_1 = DecimalUtil.ZERO ;
      lblTextblocktas01_item_ryak10_Jsonclick = "" ;
      A156TAS01_NUM_2 = DecimalUtil.ZERO ;
      lblTextblocktas01_item_ryak11_Jsonclick = "" ;
      A157TAS01_NUM_3 = DecimalUtil.ZERO ;
      lblTextblocktas01_item_ryak12_Jsonclick = "" ;
      A158TAS01_NUM_4 = DecimalUtil.ZERO ;
      lblTextblocktas01_item_ryak13_Jsonclick = "" ;
      A159TAS01_NUM_5 = DecimalUtil.ZERO ;
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
      Z54TAS01_DATA_KIND = "" ;
      Z55TAS01_ITEM_CD = "" ;
      Z47TAS01_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z81TAS01_CRT_USER_ID = "" ;
      Z50TAS01_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z82TAS01_UPD_USER_ID = "" ;
      Z19TAS01_ITEM_NM = "" ;
      Z53TAS01_ITEM_RYAK = "" ;
      Z148TAS01_DATA_KIND_NM = "" ;
      Z150TAS01_CHAR_1 = "" ;
      Z151TAS01_CHAR_2 = "" ;
      Z152TAS01_CHAR_3 = "" ;
      Z153TAS01_CHAR_4 = "" ;
      Z154TAS01_CHAR_5 = "" ;
      Z155TAS01_NUM_1 = DecimalUtil.ZERO ;
      Z156TAS01_NUM_2 = DecimalUtil.ZERO ;
      Z157TAS01_NUM_3 = DecimalUtil.ZERO ;
      Z158TAS01_NUM_4 = DecimalUtil.ZERO ;
      Z159TAS01_NUM_5 = DecimalUtil.ZERO ;
      Z113TAS01_DEL_FLG = "" ;
      Z49TAS01_CRT_PROG_NM = "" ;
      Z52TAS01_UPD_PROG_NM = "" ;
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
      T00054_A54TAS01_DATA_KIND = new String[] {""} ;
      T00054_A55TAS01_ITEM_CD = new String[] {""} ;
      T00054_A47TAS01_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00054_n47TAS01_CRT_DATETIME = new boolean[] {false} ;
      T00054_A81TAS01_CRT_USER_ID = new String[] {""} ;
      T00054_n81TAS01_CRT_USER_ID = new boolean[] {false} ;
      T00054_A50TAS01_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00054_n50TAS01_UPD_DATETIME = new boolean[] {false} ;
      T00054_A82TAS01_UPD_USER_ID = new String[] {""} ;
      T00054_n82TAS01_UPD_USER_ID = new boolean[] {false} ;
      T00054_A114TAS01_UPD_CNT = new long[1] ;
      T00054_n114TAS01_UPD_CNT = new boolean[] {false} ;
      T00054_A19TAS01_ITEM_NM = new String[] {""} ;
      T00054_n19TAS01_ITEM_NM = new boolean[] {false} ;
      T00054_A53TAS01_ITEM_RYAK = new String[] {""} ;
      T00054_n53TAS01_ITEM_RYAK = new boolean[] {false} ;
      T00054_A148TAS01_DATA_KIND_NM = new String[] {""} ;
      T00054_n148TAS01_DATA_KIND_NM = new boolean[] {false} ;
      T00054_A149TAS01_SORT_NO = new short[1] ;
      T00054_n149TAS01_SORT_NO = new boolean[] {false} ;
      T00054_A150TAS01_CHAR_1 = new String[] {""} ;
      T00054_n150TAS01_CHAR_1 = new boolean[] {false} ;
      T00054_A151TAS01_CHAR_2 = new String[] {""} ;
      T00054_n151TAS01_CHAR_2 = new boolean[] {false} ;
      T00054_A152TAS01_CHAR_3 = new String[] {""} ;
      T00054_n152TAS01_CHAR_3 = new boolean[] {false} ;
      T00054_A153TAS01_CHAR_4 = new String[] {""} ;
      T00054_n153TAS01_CHAR_4 = new boolean[] {false} ;
      T00054_A154TAS01_CHAR_5 = new String[] {""} ;
      T00054_n154TAS01_CHAR_5 = new boolean[] {false} ;
      T00054_A155TAS01_NUM_1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00054_n155TAS01_NUM_1 = new boolean[] {false} ;
      T00054_A156TAS01_NUM_2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00054_n156TAS01_NUM_2 = new boolean[] {false} ;
      T00054_A157TAS01_NUM_3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00054_n157TAS01_NUM_3 = new boolean[] {false} ;
      T00054_A158TAS01_NUM_4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00054_n158TAS01_NUM_4 = new boolean[] {false} ;
      T00054_A159TAS01_NUM_5 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00054_n159TAS01_NUM_5 = new boolean[] {false} ;
      T00054_A113TAS01_DEL_FLG = new String[] {""} ;
      T00054_n113TAS01_DEL_FLG = new boolean[] {false} ;
      T00054_A49TAS01_CRT_PROG_NM = new String[] {""} ;
      T00054_n49TAS01_CRT_PROG_NM = new boolean[] {false} ;
      T00054_A52TAS01_UPD_PROG_NM = new String[] {""} ;
      T00054_n52TAS01_UPD_PROG_NM = new boolean[] {false} ;
      T00055_A54TAS01_DATA_KIND = new String[] {""} ;
      T00055_A55TAS01_ITEM_CD = new String[] {""} ;
      T00053_A54TAS01_DATA_KIND = new String[] {""} ;
      T00053_A55TAS01_ITEM_CD = new String[] {""} ;
      T00053_A47TAS01_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00053_n47TAS01_CRT_DATETIME = new boolean[] {false} ;
      T00053_A81TAS01_CRT_USER_ID = new String[] {""} ;
      T00053_n81TAS01_CRT_USER_ID = new boolean[] {false} ;
      T00053_A50TAS01_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00053_n50TAS01_UPD_DATETIME = new boolean[] {false} ;
      T00053_A82TAS01_UPD_USER_ID = new String[] {""} ;
      T00053_n82TAS01_UPD_USER_ID = new boolean[] {false} ;
      T00053_A114TAS01_UPD_CNT = new long[1] ;
      T00053_n114TAS01_UPD_CNT = new boolean[] {false} ;
      T00053_A19TAS01_ITEM_NM = new String[] {""} ;
      T00053_n19TAS01_ITEM_NM = new boolean[] {false} ;
      T00053_A53TAS01_ITEM_RYAK = new String[] {""} ;
      T00053_n53TAS01_ITEM_RYAK = new boolean[] {false} ;
      T00053_A148TAS01_DATA_KIND_NM = new String[] {""} ;
      T00053_n148TAS01_DATA_KIND_NM = new boolean[] {false} ;
      T00053_A149TAS01_SORT_NO = new short[1] ;
      T00053_n149TAS01_SORT_NO = new boolean[] {false} ;
      T00053_A150TAS01_CHAR_1 = new String[] {""} ;
      T00053_n150TAS01_CHAR_1 = new boolean[] {false} ;
      T00053_A151TAS01_CHAR_2 = new String[] {""} ;
      T00053_n151TAS01_CHAR_2 = new boolean[] {false} ;
      T00053_A152TAS01_CHAR_3 = new String[] {""} ;
      T00053_n152TAS01_CHAR_3 = new boolean[] {false} ;
      T00053_A153TAS01_CHAR_4 = new String[] {""} ;
      T00053_n153TAS01_CHAR_4 = new boolean[] {false} ;
      T00053_A154TAS01_CHAR_5 = new String[] {""} ;
      T00053_n154TAS01_CHAR_5 = new boolean[] {false} ;
      T00053_A155TAS01_NUM_1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00053_n155TAS01_NUM_1 = new boolean[] {false} ;
      T00053_A156TAS01_NUM_2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00053_n156TAS01_NUM_2 = new boolean[] {false} ;
      T00053_A157TAS01_NUM_3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00053_n157TAS01_NUM_3 = new boolean[] {false} ;
      T00053_A158TAS01_NUM_4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00053_n158TAS01_NUM_4 = new boolean[] {false} ;
      T00053_A159TAS01_NUM_5 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00053_n159TAS01_NUM_5 = new boolean[] {false} ;
      T00053_A113TAS01_DEL_FLG = new String[] {""} ;
      T00053_n113TAS01_DEL_FLG = new boolean[] {false} ;
      T00053_A49TAS01_CRT_PROG_NM = new String[] {""} ;
      T00053_n49TAS01_CRT_PROG_NM = new boolean[] {false} ;
      T00053_A52TAS01_UPD_PROG_NM = new String[] {""} ;
      T00053_n52TAS01_UPD_PROG_NM = new boolean[] {false} ;
      sMode5 = "" ;
      T00056_A54TAS01_DATA_KIND = new String[] {""} ;
      T00056_A55TAS01_ITEM_CD = new String[] {""} ;
      T00057_A54TAS01_DATA_KIND = new String[] {""} ;
      T00057_A55TAS01_ITEM_CD = new String[] {""} ;
      T00052_A54TAS01_DATA_KIND = new String[] {""} ;
      T00052_A55TAS01_ITEM_CD = new String[] {""} ;
      T00052_A47TAS01_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00052_n47TAS01_CRT_DATETIME = new boolean[] {false} ;
      T00052_A81TAS01_CRT_USER_ID = new String[] {""} ;
      T00052_n81TAS01_CRT_USER_ID = new boolean[] {false} ;
      T00052_A50TAS01_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00052_n50TAS01_UPD_DATETIME = new boolean[] {false} ;
      T00052_A82TAS01_UPD_USER_ID = new String[] {""} ;
      T00052_n82TAS01_UPD_USER_ID = new boolean[] {false} ;
      T00052_A114TAS01_UPD_CNT = new long[1] ;
      T00052_n114TAS01_UPD_CNT = new boolean[] {false} ;
      T00052_A19TAS01_ITEM_NM = new String[] {""} ;
      T00052_n19TAS01_ITEM_NM = new boolean[] {false} ;
      T00052_A53TAS01_ITEM_RYAK = new String[] {""} ;
      T00052_n53TAS01_ITEM_RYAK = new boolean[] {false} ;
      T00052_A148TAS01_DATA_KIND_NM = new String[] {""} ;
      T00052_n148TAS01_DATA_KIND_NM = new boolean[] {false} ;
      T00052_A149TAS01_SORT_NO = new short[1] ;
      T00052_n149TAS01_SORT_NO = new boolean[] {false} ;
      T00052_A150TAS01_CHAR_1 = new String[] {""} ;
      T00052_n150TAS01_CHAR_1 = new boolean[] {false} ;
      T00052_A151TAS01_CHAR_2 = new String[] {""} ;
      T00052_n151TAS01_CHAR_2 = new boolean[] {false} ;
      T00052_A152TAS01_CHAR_3 = new String[] {""} ;
      T00052_n152TAS01_CHAR_3 = new boolean[] {false} ;
      T00052_A153TAS01_CHAR_4 = new String[] {""} ;
      T00052_n153TAS01_CHAR_4 = new boolean[] {false} ;
      T00052_A154TAS01_CHAR_5 = new String[] {""} ;
      T00052_n154TAS01_CHAR_5 = new boolean[] {false} ;
      T00052_A155TAS01_NUM_1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00052_n155TAS01_NUM_1 = new boolean[] {false} ;
      T00052_A156TAS01_NUM_2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00052_n156TAS01_NUM_2 = new boolean[] {false} ;
      T00052_A157TAS01_NUM_3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00052_n157TAS01_NUM_3 = new boolean[] {false} ;
      T00052_A158TAS01_NUM_4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00052_n158TAS01_NUM_4 = new boolean[] {false} ;
      T00052_A159TAS01_NUM_5 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00052_n159TAS01_NUM_5 = new boolean[] {false} ;
      T00052_A113TAS01_DEL_FLG = new String[] {""} ;
      T00052_n113TAS01_DEL_FLG = new boolean[] {false} ;
      T00052_A49TAS01_CRT_PROG_NM = new String[] {""} ;
      T00052_n49TAS01_CRT_PROG_NM = new boolean[] {false} ;
      T00052_A52TAS01_UPD_PROG_NM = new String[] {""} ;
      T00052_n52TAS01_UPD_PROG_NM = new boolean[] {false} ;
      T000511_A54TAS01_DATA_KIND = new String[] {""} ;
      T000511_A55TAS01_ITEM_CD = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      GXt_char2 = "" ;
      GXt_char1 = "" ;
      i113TAS01_DEL_FLG = "" ;
      i49TAS01_CRT_PROG_NM = "" ;
      i52TAS01_UPD_PROG_NM = "" ;
      GXv_char5 = new String [1] ;
      GXt_char6 = "" ;
      ZV14Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tas01_cdnm__default(),
         new Object[] {
             new Object[] {
            T00052_A54TAS01_DATA_KIND, T00052_A55TAS01_ITEM_CD, T00052_A47TAS01_CRT_DATETIME, T00052_n47TAS01_CRT_DATETIME, T00052_A81TAS01_CRT_USER_ID, T00052_n81TAS01_CRT_USER_ID, T00052_A50TAS01_UPD_DATETIME, T00052_n50TAS01_UPD_DATETIME, T00052_A82TAS01_UPD_USER_ID, T00052_n82TAS01_UPD_USER_ID,
            T00052_A114TAS01_UPD_CNT, T00052_n114TAS01_UPD_CNT, T00052_A19TAS01_ITEM_NM, T00052_n19TAS01_ITEM_NM, T00052_A53TAS01_ITEM_RYAK, T00052_n53TAS01_ITEM_RYAK, T00052_A148TAS01_DATA_KIND_NM, T00052_n148TAS01_DATA_KIND_NM, T00052_A149TAS01_SORT_NO, T00052_n149TAS01_SORT_NO,
            T00052_A150TAS01_CHAR_1, T00052_n150TAS01_CHAR_1, T00052_A151TAS01_CHAR_2, T00052_n151TAS01_CHAR_2, T00052_A152TAS01_CHAR_3, T00052_n152TAS01_CHAR_3, T00052_A153TAS01_CHAR_4, T00052_n153TAS01_CHAR_4, T00052_A154TAS01_CHAR_5, T00052_n154TAS01_CHAR_5,
            T00052_A155TAS01_NUM_1, T00052_n155TAS01_NUM_1, T00052_A156TAS01_NUM_2, T00052_n156TAS01_NUM_2, T00052_A157TAS01_NUM_3, T00052_n157TAS01_NUM_3, T00052_A158TAS01_NUM_4, T00052_n158TAS01_NUM_4, T00052_A159TAS01_NUM_5, T00052_n159TAS01_NUM_5,
            T00052_A113TAS01_DEL_FLG, T00052_n113TAS01_DEL_FLG, T00052_A49TAS01_CRT_PROG_NM, T00052_n49TAS01_CRT_PROG_NM, T00052_A52TAS01_UPD_PROG_NM, T00052_n52TAS01_UPD_PROG_NM
            }
            , new Object[] {
            T00053_A54TAS01_DATA_KIND, T00053_A55TAS01_ITEM_CD, T00053_A47TAS01_CRT_DATETIME, T00053_n47TAS01_CRT_DATETIME, T00053_A81TAS01_CRT_USER_ID, T00053_n81TAS01_CRT_USER_ID, T00053_A50TAS01_UPD_DATETIME, T00053_n50TAS01_UPD_DATETIME, T00053_A82TAS01_UPD_USER_ID, T00053_n82TAS01_UPD_USER_ID,
            T00053_A114TAS01_UPD_CNT, T00053_n114TAS01_UPD_CNT, T00053_A19TAS01_ITEM_NM, T00053_n19TAS01_ITEM_NM, T00053_A53TAS01_ITEM_RYAK, T00053_n53TAS01_ITEM_RYAK, T00053_A148TAS01_DATA_KIND_NM, T00053_n148TAS01_DATA_KIND_NM, T00053_A149TAS01_SORT_NO, T00053_n149TAS01_SORT_NO,
            T00053_A150TAS01_CHAR_1, T00053_n150TAS01_CHAR_1, T00053_A151TAS01_CHAR_2, T00053_n151TAS01_CHAR_2, T00053_A152TAS01_CHAR_3, T00053_n152TAS01_CHAR_3, T00053_A153TAS01_CHAR_4, T00053_n153TAS01_CHAR_4, T00053_A154TAS01_CHAR_5, T00053_n154TAS01_CHAR_5,
            T00053_A155TAS01_NUM_1, T00053_n155TAS01_NUM_1, T00053_A156TAS01_NUM_2, T00053_n156TAS01_NUM_2, T00053_A157TAS01_NUM_3, T00053_n157TAS01_NUM_3, T00053_A158TAS01_NUM_4, T00053_n158TAS01_NUM_4, T00053_A159TAS01_NUM_5, T00053_n159TAS01_NUM_5,
            T00053_A113TAS01_DEL_FLG, T00053_n113TAS01_DEL_FLG, T00053_A49TAS01_CRT_PROG_NM, T00053_n49TAS01_CRT_PROG_NM, T00053_A52TAS01_UPD_PROG_NM, T00053_n52TAS01_UPD_PROG_NM
            }
            , new Object[] {
            T00054_A54TAS01_DATA_KIND, T00054_A55TAS01_ITEM_CD, T00054_A47TAS01_CRT_DATETIME, T00054_n47TAS01_CRT_DATETIME, T00054_A81TAS01_CRT_USER_ID, T00054_n81TAS01_CRT_USER_ID, T00054_A50TAS01_UPD_DATETIME, T00054_n50TAS01_UPD_DATETIME, T00054_A82TAS01_UPD_USER_ID, T00054_n82TAS01_UPD_USER_ID,
            T00054_A114TAS01_UPD_CNT, T00054_n114TAS01_UPD_CNT, T00054_A19TAS01_ITEM_NM, T00054_n19TAS01_ITEM_NM, T00054_A53TAS01_ITEM_RYAK, T00054_n53TAS01_ITEM_RYAK, T00054_A148TAS01_DATA_KIND_NM, T00054_n148TAS01_DATA_KIND_NM, T00054_A149TAS01_SORT_NO, T00054_n149TAS01_SORT_NO,
            T00054_A150TAS01_CHAR_1, T00054_n150TAS01_CHAR_1, T00054_A151TAS01_CHAR_2, T00054_n151TAS01_CHAR_2, T00054_A152TAS01_CHAR_3, T00054_n152TAS01_CHAR_3, T00054_A153TAS01_CHAR_4, T00054_n153TAS01_CHAR_4, T00054_A154TAS01_CHAR_5, T00054_n154TAS01_CHAR_5,
            T00054_A155TAS01_NUM_1, T00054_n155TAS01_NUM_1, T00054_A156TAS01_NUM_2, T00054_n156TAS01_NUM_2, T00054_A157TAS01_NUM_3, T00054_n157TAS01_NUM_3, T00054_A158TAS01_NUM_4, T00054_n158TAS01_NUM_4, T00054_A159TAS01_NUM_5, T00054_n159TAS01_NUM_5,
            T00054_A113TAS01_DEL_FLG, T00054_n113TAS01_DEL_FLG, T00054_A49TAS01_CRT_PROG_NM, T00054_n49TAS01_CRT_PROG_NM, T00054_A52TAS01_UPD_PROG_NM, T00054_n52TAS01_UPD_PROG_NM
            }
            , new Object[] {
            T00055_A54TAS01_DATA_KIND, T00055_A55TAS01_ITEM_CD
            }
            , new Object[] {
            T00056_A54TAS01_DATA_KIND, T00056_A55TAS01_ITEM_CD
            }
            , new Object[] {
            T00057_A54TAS01_DATA_KIND, T00057_A55TAS01_ITEM_CD
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000511_A54TAS01_DATA_KIND, T000511_A55TAS01_ITEM_CD
            }
         }
      );
      pr_default.setErrorHandler(this);
      Z52TAS01_UPD_PROG_NM = AV14Pgmname ;
      n52TAS01_UPD_PROG_NM = false ;
      Z49TAS01_CRT_PROG_NM = AV14Pgmname ;
      n49TAS01_CRT_PROG_NM = false ;
      AV14Pgmname = "TAS01_CDNM" ;
      Z113TAS01_DEL_FLG = "0" ;
      n113TAS01_DEL_FLG = false ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A149TAS01_SORT_NO ;
   private short Z149TAS01_SORT_NO ;
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
   private long A114TAS01_UPD_CNT ;
   private long Z114TAS01_UPD_CNT ;
   private long O114TAS01_UPD_CNT ;
   private java.math.BigDecimal A155TAS01_NUM_1 ;
   private java.math.BigDecimal A156TAS01_NUM_2 ;
   private java.math.BigDecimal A157TAS01_NUM_3 ;
   private java.math.BigDecimal A158TAS01_NUM_4 ;
   private java.math.BigDecimal A159TAS01_NUM_5 ;
   private java.math.BigDecimal Z155TAS01_NUM_1 ;
   private java.math.BigDecimal Z156TAS01_NUM_2 ;
   private java.math.BigDecimal Z157TAS01_NUM_3 ;
   private java.math.BigDecimal Z158TAS01_NUM_4 ;
   private java.math.BigDecimal Z159TAS01_NUM_5 ;
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
   private String GXv_char3[] ;
   private String sMode5 ;
   private String sDynURL ;
   private String FormProcess ;
   private String GXt_char2 ;
   private String GXt_char1 ;
   private String GXv_char5[] ;
   private String GXt_char6 ;
   private String ZV14Pgmname ;
   private String Gx_emsg ;
   private java.util.Date A47TAS01_CRT_DATETIME ;
   private java.util.Date A50TAS01_UPD_DATETIME ;
   private java.util.Date Z47TAS01_CRT_DATETIME ;
   private java.util.Date Z50TAS01_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean n19TAS01_ITEM_NM ;
   private boolean n53TAS01_ITEM_RYAK ;
   private boolean n113TAS01_DEL_FLG ;
   private boolean n47TAS01_CRT_DATETIME ;
   private boolean n81TAS01_CRT_USER_ID ;
   private boolean n49TAS01_CRT_PROG_NM ;
   private boolean n50TAS01_UPD_DATETIME ;
   private boolean n82TAS01_UPD_USER_ID ;
   private boolean n52TAS01_UPD_PROG_NM ;
   private boolean n114TAS01_UPD_CNT ;
   private boolean wbErr ;
   private boolean n148TAS01_DATA_KIND_NM ;
   private boolean n149TAS01_SORT_NO ;
   private boolean n150TAS01_CHAR_1 ;
   private boolean n151TAS01_CHAR_2 ;
   private boolean n152TAS01_CHAR_3 ;
   private boolean n153TAS01_CHAR_4 ;
   private boolean n154TAS01_CHAR_5 ;
   private boolean n155TAS01_NUM_1 ;
   private boolean n156TAS01_NUM_2 ;
   private boolean n157TAS01_NUM_3 ;
   private boolean n158TAS01_NUM_4 ;
   private boolean n159TAS01_NUM_5 ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String A54TAS01_DATA_KIND ;
   private String A55TAS01_ITEM_CD ;
   private String A19TAS01_ITEM_NM ;
   private String A53TAS01_ITEM_RYAK ;
   private String A113TAS01_DEL_FLG ;
   private String A81TAS01_CRT_USER_ID ;
   private String A49TAS01_CRT_PROG_NM ;
   private String A82TAS01_UPD_USER_ID ;
   private String A52TAS01_UPD_PROG_NM ;
   private String A148TAS01_DATA_KIND_NM ;
   private String A150TAS01_CHAR_1 ;
   private String A151TAS01_CHAR_2 ;
   private String A152TAS01_CHAR_3 ;
   private String A153TAS01_CHAR_4 ;
   private String A154TAS01_CHAR_5 ;
   private String Z54TAS01_DATA_KIND ;
   private String Z55TAS01_ITEM_CD ;
   private String Z81TAS01_CRT_USER_ID ;
   private String Z82TAS01_UPD_USER_ID ;
   private String Z19TAS01_ITEM_NM ;
   private String Z53TAS01_ITEM_RYAK ;
   private String Z148TAS01_DATA_KIND_NM ;
   private String Z150TAS01_CHAR_1 ;
   private String Z151TAS01_CHAR_2 ;
   private String Z152TAS01_CHAR_3 ;
   private String Z153TAS01_CHAR_4 ;
   private String Z154TAS01_CHAR_5 ;
   private String Z113TAS01_DEL_FLG ;
   private String Z49TAS01_CRT_PROG_NM ;
   private String Z52TAS01_UPD_PROG_NM ;
   private String AV7C_TAM02_APP_ID ;
   private String AV9W_ERRCD ;
   private String AV12W_MSG ;
   private String AV10W_KNGN_FLG ;
   private String i113TAS01_DEL_FLG ;
   private String i49TAS01_CRT_PROG_NM ;
   private String i52TAS01_UPD_PROG_NM ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private HTMLChoice radTAS01_DEL_FLG ;
   private IDataStoreProvider pr_default ;
   private String[] T00054_A54TAS01_DATA_KIND ;
   private String[] T00054_A55TAS01_ITEM_CD ;
   private java.util.Date[] T00054_A47TAS01_CRT_DATETIME ;
   private boolean[] T00054_n47TAS01_CRT_DATETIME ;
   private String[] T00054_A81TAS01_CRT_USER_ID ;
   private boolean[] T00054_n81TAS01_CRT_USER_ID ;
   private java.util.Date[] T00054_A50TAS01_UPD_DATETIME ;
   private boolean[] T00054_n50TAS01_UPD_DATETIME ;
   private String[] T00054_A82TAS01_UPD_USER_ID ;
   private boolean[] T00054_n82TAS01_UPD_USER_ID ;
   private long[] T00054_A114TAS01_UPD_CNT ;
   private boolean[] T00054_n114TAS01_UPD_CNT ;
   private String[] T00054_A19TAS01_ITEM_NM ;
   private boolean[] T00054_n19TAS01_ITEM_NM ;
   private String[] T00054_A53TAS01_ITEM_RYAK ;
   private boolean[] T00054_n53TAS01_ITEM_RYAK ;
   private String[] T00054_A148TAS01_DATA_KIND_NM ;
   private boolean[] T00054_n148TAS01_DATA_KIND_NM ;
   private short[] T00054_A149TAS01_SORT_NO ;
   private boolean[] T00054_n149TAS01_SORT_NO ;
   private String[] T00054_A150TAS01_CHAR_1 ;
   private boolean[] T00054_n150TAS01_CHAR_1 ;
   private String[] T00054_A151TAS01_CHAR_2 ;
   private boolean[] T00054_n151TAS01_CHAR_2 ;
   private String[] T00054_A152TAS01_CHAR_3 ;
   private boolean[] T00054_n152TAS01_CHAR_3 ;
   private String[] T00054_A153TAS01_CHAR_4 ;
   private boolean[] T00054_n153TAS01_CHAR_4 ;
   private String[] T00054_A154TAS01_CHAR_5 ;
   private boolean[] T00054_n154TAS01_CHAR_5 ;
   private java.math.BigDecimal[] T00054_A155TAS01_NUM_1 ;
   private boolean[] T00054_n155TAS01_NUM_1 ;
   private java.math.BigDecimal[] T00054_A156TAS01_NUM_2 ;
   private boolean[] T00054_n156TAS01_NUM_2 ;
   private java.math.BigDecimal[] T00054_A157TAS01_NUM_3 ;
   private boolean[] T00054_n157TAS01_NUM_3 ;
   private java.math.BigDecimal[] T00054_A158TAS01_NUM_4 ;
   private boolean[] T00054_n158TAS01_NUM_4 ;
   private java.math.BigDecimal[] T00054_A159TAS01_NUM_5 ;
   private boolean[] T00054_n159TAS01_NUM_5 ;
   private String[] T00054_A113TAS01_DEL_FLG ;
   private boolean[] T00054_n113TAS01_DEL_FLG ;
   private String[] T00054_A49TAS01_CRT_PROG_NM ;
   private boolean[] T00054_n49TAS01_CRT_PROG_NM ;
   private String[] T00054_A52TAS01_UPD_PROG_NM ;
   private boolean[] T00054_n52TAS01_UPD_PROG_NM ;
   private String[] T00055_A54TAS01_DATA_KIND ;
   private String[] T00055_A55TAS01_ITEM_CD ;
   private String[] T00053_A54TAS01_DATA_KIND ;
   private String[] T00053_A55TAS01_ITEM_CD ;
   private java.util.Date[] T00053_A47TAS01_CRT_DATETIME ;
   private boolean[] T00053_n47TAS01_CRT_DATETIME ;
   private String[] T00053_A81TAS01_CRT_USER_ID ;
   private boolean[] T00053_n81TAS01_CRT_USER_ID ;
   private java.util.Date[] T00053_A50TAS01_UPD_DATETIME ;
   private boolean[] T00053_n50TAS01_UPD_DATETIME ;
   private String[] T00053_A82TAS01_UPD_USER_ID ;
   private boolean[] T00053_n82TAS01_UPD_USER_ID ;
   private long[] T00053_A114TAS01_UPD_CNT ;
   private boolean[] T00053_n114TAS01_UPD_CNT ;
   private String[] T00053_A19TAS01_ITEM_NM ;
   private boolean[] T00053_n19TAS01_ITEM_NM ;
   private String[] T00053_A53TAS01_ITEM_RYAK ;
   private boolean[] T00053_n53TAS01_ITEM_RYAK ;
   private String[] T00053_A148TAS01_DATA_KIND_NM ;
   private boolean[] T00053_n148TAS01_DATA_KIND_NM ;
   private short[] T00053_A149TAS01_SORT_NO ;
   private boolean[] T00053_n149TAS01_SORT_NO ;
   private String[] T00053_A150TAS01_CHAR_1 ;
   private boolean[] T00053_n150TAS01_CHAR_1 ;
   private String[] T00053_A151TAS01_CHAR_2 ;
   private boolean[] T00053_n151TAS01_CHAR_2 ;
   private String[] T00053_A152TAS01_CHAR_3 ;
   private boolean[] T00053_n152TAS01_CHAR_3 ;
   private String[] T00053_A153TAS01_CHAR_4 ;
   private boolean[] T00053_n153TAS01_CHAR_4 ;
   private String[] T00053_A154TAS01_CHAR_5 ;
   private boolean[] T00053_n154TAS01_CHAR_5 ;
   private java.math.BigDecimal[] T00053_A155TAS01_NUM_1 ;
   private boolean[] T00053_n155TAS01_NUM_1 ;
   private java.math.BigDecimal[] T00053_A156TAS01_NUM_2 ;
   private boolean[] T00053_n156TAS01_NUM_2 ;
   private java.math.BigDecimal[] T00053_A157TAS01_NUM_3 ;
   private boolean[] T00053_n157TAS01_NUM_3 ;
   private java.math.BigDecimal[] T00053_A158TAS01_NUM_4 ;
   private boolean[] T00053_n158TAS01_NUM_4 ;
   private java.math.BigDecimal[] T00053_A159TAS01_NUM_5 ;
   private boolean[] T00053_n159TAS01_NUM_5 ;
   private String[] T00053_A113TAS01_DEL_FLG ;
   private boolean[] T00053_n113TAS01_DEL_FLG ;
   private String[] T00053_A49TAS01_CRT_PROG_NM ;
   private boolean[] T00053_n49TAS01_CRT_PROG_NM ;
   private String[] T00053_A52TAS01_UPD_PROG_NM ;
   private boolean[] T00053_n52TAS01_UPD_PROG_NM ;
   private String[] T00056_A54TAS01_DATA_KIND ;
   private String[] T00056_A55TAS01_ITEM_CD ;
   private String[] T00057_A54TAS01_DATA_KIND ;
   private String[] T00057_A55TAS01_ITEM_CD ;
   private String[] T00052_A54TAS01_DATA_KIND ;
   private String[] T00052_A55TAS01_ITEM_CD ;
   private java.util.Date[] T00052_A47TAS01_CRT_DATETIME ;
   private boolean[] T00052_n47TAS01_CRT_DATETIME ;
   private String[] T00052_A81TAS01_CRT_USER_ID ;
   private boolean[] T00052_n81TAS01_CRT_USER_ID ;
   private java.util.Date[] T00052_A50TAS01_UPD_DATETIME ;
   private boolean[] T00052_n50TAS01_UPD_DATETIME ;
   private String[] T00052_A82TAS01_UPD_USER_ID ;
   private boolean[] T00052_n82TAS01_UPD_USER_ID ;
   private long[] T00052_A114TAS01_UPD_CNT ;
   private boolean[] T00052_n114TAS01_UPD_CNT ;
   private String[] T00052_A19TAS01_ITEM_NM ;
   private boolean[] T00052_n19TAS01_ITEM_NM ;
   private String[] T00052_A53TAS01_ITEM_RYAK ;
   private boolean[] T00052_n53TAS01_ITEM_RYAK ;
   private String[] T00052_A148TAS01_DATA_KIND_NM ;
   private boolean[] T00052_n148TAS01_DATA_KIND_NM ;
   private short[] T00052_A149TAS01_SORT_NO ;
   private boolean[] T00052_n149TAS01_SORT_NO ;
   private String[] T00052_A150TAS01_CHAR_1 ;
   private boolean[] T00052_n150TAS01_CHAR_1 ;
   private String[] T00052_A151TAS01_CHAR_2 ;
   private boolean[] T00052_n151TAS01_CHAR_2 ;
   private String[] T00052_A152TAS01_CHAR_3 ;
   private boolean[] T00052_n152TAS01_CHAR_3 ;
   private String[] T00052_A153TAS01_CHAR_4 ;
   private boolean[] T00052_n153TAS01_CHAR_4 ;
   private String[] T00052_A154TAS01_CHAR_5 ;
   private boolean[] T00052_n154TAS01_CHAR_5 ;
   private java.math.BigDecimal[] T00052_A155TAS01_NUM_1 ;
   private boolean[] T00052_n155TAS01_NUM_1 ;
   private java.math.BigDecimal[] T00052_A156TAS01_NUM_2 ;
   private boolean[] T00052_n156TAS01_NUM_2 ;
   private java.math.BigDecimal[] T00052_A157TAS01_NUM_3 ;
   private boolean[] T00052_n157TAS01_NUM_3 ;
   private java.math.BigDecimal[] T00052_A158TAS01_NUM_4 ;
   private boolean[] T00052_n158TAS01_NUM_4 ;
   private java.math.BigDecimal[] T00052_A159TAS01_NUM_5 ;
   private boolean[] T00052_n159TAS01_NUM_5 ;
   private String[] T00052_A113TAS01_DEL_FLG ;
   private boolean[] T00052_n113TAS01_DEL_FLG ;
   private String[] T00052_A49TAS01_CRT_PROG_NM ;
   private boolean[] T00052_n49TAS01_CRT_PROG_NM ;
   private String[] T00052_A52TAS01_UPD_PROG_NM ;
   private boolean[] T00052_n52TAS01_UPD_PROG_NM ;
   private String[] T000511_A54TAS01_DATA_KIND ;
   private String[] T000511_A55TAS01_ITEM_CD ;
   private SdtA_LOGIN_SDT AV8W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT4[] ;
}

final  class tas01_cdnm__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00052", "SELECT `TAS01_DATA_KIND`, `TAS01_ITEM_CD`, `TAS01_CRT_DATETIME`, `TAS01_CRT_USER_ID`, `TAS01_UPD_DATETIME`, `TAS01_UPD_USER_ID`, `TAS01_UPD_CNT`, `TAS01_ITEM_NM`, `TAS01_ITEM_RYAK`, `TAS01_DATA_KIND_NM`, `TAS01_SORT_NO`, `TAS01_CHAR_1`, `TAS01_CHAR_2`, `TAS01_CHAR_3`, `TAS01_CHAR_4`, `TAS01_CHAR_5`, `TAS01_NUM_1`, `TAS01_NUM_2`, `TAS01_NUM_3`, `TAS01_NUM_4`, `TAS01_NUM_5`, `TAS01_DEL_FLG`, `TAS01_CRT_PROG_NM`, `TAS01_UPD_PROG_NM` FROM `TAS01_CDNM` WHERE `TAS01_DATA_KIND` = ? AND `TAS01_ITEM_CD` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00053", "SELECT `TAS01_DATA_KIND`, `TAS01_ITEM_CD`, `TAS01_CRT_DATETIME`, `TAS01_CRT_USER_ID`, `TAS01_UPD_DATETIME`, `TAS01_UPD_USER_ID`, `TAS01_UPD_CNT`, `TAS01_ITEM_NM`, `TAS01_ITEM_RYAK`, `TAS01_DATA_KIND_NM`, `TAS01_SORT_NO`, `TAS01_CHAR_1`, `TAS01_CHAR_2`, `TAS01_CHAR_3`, `TAS01_CHAR_4`, `TAS01_CHAR_5`, `TAS01_NUM_1`, `TAS01_NUM_2`, `TAS01_NUM_3`, `TAS01_NUM_4`, `TAS01_NUM_5`, `TAS01_DEL_FLG`, `TAS01_CRT_PROG_NM`, `TAS01_UPD_PROG_NM` FROM `TAS01_CDNM` WHERE `TAS01_DATA_KIND` = ? AND `TAS01_ITEM_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00054", "SELECT TM1.`TAS01_DATA_KIND`, TM1.`TAS01_ITEM_CD`, TM1.`TAS01_CRT_DATETIME`, TM1.`TAS01_CRT_USER_ID`, TM1.`TAS01_UPD_DATETIME`, TM1.`TAS01_UPD_USER_ID`, TM1.`TAS01_UPD_CNT`, TM1.`TAS01_ITEM_NM`, TM1.`TAS01_ITEM_RYAK`, TM1.`TAS01_DATA_KIND_NM`, TM1.`TAS01_SORT_NO`, TM1.`TAS01_CHAR_1`, TM1.`TAS01_CHAR_2`, TM1.`TAS01_CHAR_3`, TM1.`TAS01_CHAR_4`, TM1.`TAS01_CHAR_5`, TM1.`TAS01_NUM_1`, TM1.`TAS01_NUM_2`, TM1.`TAS01_NUM_3`, TM1.`TAS01_NUM_4`, TM1.`TAS01_NUM_5`, TM1.`TAS01_DEL_FLG`, TM1.`TAS01_CRT_PROG_NM`, TM1.`TAS01_UPD_PROG_NM` FROM `TAS01_CDNM` TM1 WHERE TM1.`TAS01_DATA_KIND` = ? and TM1.`TAS01_ITEM_CD` = ? ORDER BY TM1.`TAS01_DATA_KIND`, TM1.`TAS01_ITEM_CD` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("T00055", "SELECT `TAS01_DATA_KIND`, `TAS01_ITEM_CD` FROM `TAS01_CDNM` WHERE `TAS01_DATA_KIND` = ? AND `TAS01_ITEM_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00056", "SELECT `TAS01_DATA_KIND`, `TAS01_ITEM_CD` FROM `TAS01_CDNM` WHERE ( `TAS01_DATA_KIND` > ? or `TAS01_DATA_KIND` = ? and `TAS01_ITEM_CD` > ?) ORDER BY `TAS01_DATA_KIND`, `TAS01_ITEM_CD`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T00057", "SELECT `TAS01_DATA_KIND`, `TAS01_ITEM_CD` FROM `TAS01_CDNM` WHERE ( `TAS01_DATA_KIND` < ? or `TAS01_DATA_KIND` = ? and `TAS01_ITEM_CD` < ?) ORDER BY `TAS01_DATA_KIND` DESC, `TAS01_ITEM_CD` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T00058", "INSERT INTO `TAS01_CDNM` (`TAS01_DATA_KIND`, `TAS01_ITEM_CD`, `TAS01_CRT_DATETIME`, `TAS01_CRT_USER_ID`, `TAS01_UPD_DATETIME`, `TAS01_UPD_USER_ID`, `TAS01_UPD_CNT`, `TAS01_ITEM_NM`, `TAS01_ITEM_RYAK`, `TAS01_DATA_KIND_NM`, `TAS01_SORT_NO`, `TAS01_CHAR_1`, `TAS01_CHAR_2`, `TAS01_CHAR_3`, `TAS01_CHAR_4`, `TAS01_CHAR_5`, `TAS01_NUM_1`, `TAS01_NUM_2`, `TAS01_NUM_3`, `TAS01_NUM_4`, `TAS01_NUM_5`, `TAS01_DEL_FLG`, `TAS01_CRT_PROG_NM`, `TAS01_UPD_PROG_NM`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T00059", "UPDATE `TAS01_CDNM` SET `TAS01_CRT_DATETIME`=?, `TAS01_CRT_USER_ID`=?, `TAS01_UPD_DATETIME`=?, `TAS01_UPD_USER_ID`=?, `TAS01_UPD_CNT`=?, `TAS01_ITEM_NM`=?, `TAS01_ITEM_RYAK`=?, `TAS01_DATA_KIND_NM`=?, `TAS01_SORT_NO`=?, `TAS01_CHAR_1`=?, `TAS01_CHAR_2`=?, `TAS01_CHAR_3`=?, `TAS01_CHAR_4`=?, `TAS01_CHAR_5`=?, `TAS01_NUM_1`=?, `TAS01_NUM_2`=?, `TAS01_NUM_3`=?, `TAS01_NUM_4`=?, `TAS01_NUM_5`=?, `TAS01_DEL_FLG`=?, `TAS01_CRT_PROG_NM`=?, `TAS01_UPD_PROG_NM`=?  WHERE `TAS01_DATA_KIND` = ? AND `TAS01_ITEM_CD` = ?", GX_NOMASK)
         ,new UpdateCursor("T000510", "DELETE FROM `TAS01_CDNM`  WHERE `TAS01_DATA_KIND` = ? AND `TAS01_ITEM_CD` = ?", GX_NOMASK)
         ,new ForEachCursor("T000511", "SELECT `TAS01_DATA_KIND`, `TAS01_ITEM_CD` FROM `TAS01_CDNM` ORDER BY `TAS01_DATA_KIND`, `TAS01_ITEM_CD` ",true, GX_NOMASK, false, this,10,0,false )
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
               break;
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
               break;
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
               break;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               break;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               break;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               break;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
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
               stmt.setVarchar(1, (String)parms[0], 3, false);
               stmt.setVarchar(2, (String)parms[1], 4, false);
               break;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               stmt.setVarchar(2, (String)parms[1], 4, false);
               break;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               stmt.setVarchar(2, (String)parms[1], 4, false);
               break;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               stmt.setVarchar(2, (String)parms[1], 4, false);
               break;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               stmt.setVarchar(2, (String)parms[1], 3, false);
               stmt.setVarchar(3, (String)parms[2], 4, false);
               break;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               stmt.setVarchar(2, (String)parms[1], 3, false);
               stmt.setVarchar(3, (String)parms[2], 4, false);
               break;
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
               break;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               stmt.setVarchar(2, (String)parms[1], 4, false);
               break;
      }
   }

}

