/*
               File: tas02_geng_impl
        Description: 和暦元号マスタ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:53:47.9
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tas02_geng_impl extends GXWebPanel
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
         A22TAS02_GNGO_KBN = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A22TAS02_GNGO_KBN", A22TAS02_GNGO_KBN);
         A23TAS02_GNGO_NM = httpContext.GetNextPar( ) ;
         n23TAS02_GNGO_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A23TAS02_GNGO_NM", A23TAS02_GNGO_NM);
         A56TAS02_GNGO_RYAK_NM = httpContext.GetNextPar( ) ;
         n56TAS02_GNGO_RYAK_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A56TAS02_GNGO_RYAK_NM", A56TAS02_GNGO_RYAK_NM);
         A26TAS02_HNKAN_NEN = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         n26TAS02_HNKAN_NEN = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A26TAS02_HNKAN_NEN", GXutil.ltrim( GXutil.str( A26TAS02_HNKAN_NEN, 4, 0)));
         A24TAS02_DATE_START = httpContext.GetNextPar( ) ;
         n24TAS02_DATE_START = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A24TAS02_DATE_START", A24TAS02_DATE_START);
         A25TAS02_DATE_END = httpContext.GetNextPar( ) ;
         n25TAS02_DATE_END = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A25TAS02_DATE_END", A25TAS02_DATE_END);
         A63TAS02_DATE_W_START = httpContext.GetNextPar( ) ;
         n63TAS02_DATE_W_START = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A63TAS02_DATE_W_START", A63TAS02_DATE_W_START);
         A64TAS02_DATE_W_END = httpContext.GetNextPar( ) ;
         n64TAS02_DATE_W_END = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A64TAS02_DATE_W_END", A64TAS02_DATE_W_END);
         A115TAS02_DEL_FLG = httpContext.GetNextPar( ) ;
         n115TAS02_DEL_FLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A115TAS02_DEL_FLG", A115TAS02_DEL_FLG);
         A57TAS02_CRT_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
         n57TAS02_CRT_DATETIME = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A57TAS02_CRT_DATETIME", localUtil.ttoc( A57TAS02_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         A83TAS02_CRT_USER_ID = httpContext.GetNextPar( ) ;
         n83TAS02_CRT_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A83TAS02_CRT_USER_ID", A83TAS02_CRT_USER_ID);
         A59TAS02_CRT_PROG_NM = httpContext.GetNextPar( ) ;
         n59TAS02_CRT_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A59TAS02_CRT_PROG_NM", A59TAS02_CRT_PROG_NM);
         A60TAS02_UPD_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
         n60TAS02_UPD_DATETIME = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A60TAS02_UPD_DATETIME", localUtil.ttoc( A60TAS02_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         A84TAS02_UPD_USER_ID = httpContext.GetNextPar( ) ;
         n84TAS02_UPD_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A84TAS02_UPD_USER_ID", A84TAS02_UPD_USER_ID);
         A62TAS02_UPD_PROG_NM = httpContext.GetNextPar( ) ;
         n62TAS02_UPD_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A62TAS02_UPD_PROG_NM", A62TAS02_UPD_PROG_NM);
         A116TAS02_UPD_CNT = GXutil.lval( httpContext.GetNextPar( )) ;
         n116TAS02_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A116TAS02_UPD_CNT", GXutil.ltrim( GXutil.str( A116TAS02_UPD_CNT, 10, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_33_066( AV14Pgmname, Gx_mode, A22TAS02_GNGO_KBN, A23TAS02_GNGO_NM, A56TAS02_GNGO_RYAK_NM, A26TAS02_HNKAN_NEN, A24TAS02_DATE_START, A25TAS02_DATE_END, A63TAS02_DATE_W_START, A64TAS02_DATE_W_END, A115TAS02_DEL_FLG, A57TAS02_CRT_DATETIME, A83TAS02_CRT_USER_ID, A59TAS02_CRT_PROG_NM, A60TAS02_UPD_DATETIME, A84TAS02_UPD_USER_ID, A62TAS02_UPD_PROG_NM, A116TAS02_UPD_CNT) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action34") == 0 )
      {
         AV14Pgmname = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A22TAS02_GNGO_KBN = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A22TAS02_GNGO_KBN", A22TAS02_GNGO_KBN);
         A23TAS02_GNGO_NM = httpContext.GetNextPar( ) ;
         n23TAS02_GNGO_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A23TAS02_GNGO_NM", A23TAS02_GNGO_NM);
         A56TAS02_GNGO_RYAK_NM = httpContext.GetNextPar( ) ;
         n56TAS02_GNGO_RYAK_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A56TAS02_GNGO_RYAK_NM", A56TAS02_GNGO_RYAK_NM);
         A26TAS02_HNKAN_NEN = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         n26TAS02_HNKAN_NEN = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A26TAS02_HNKAN_NEN", GXutil.ltrim( GXutil.str( A26TAS02_HNKAN_NEN, 4, 0)));
         A24TAS02_DATE_START = httpContext.GetNextPar( ) ;
         n24TAS02_DATE_START = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A24TAS02_DATE_START", A24TAS02_DATE_START);
         A25TAS02_DATE_END = httpContext.GetNextPar( ) ;
         n25TAS02_DATE_END = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A25TAS02_DATE_END", A25TAS02_DATE_END);
         A63TAS02_DATE_W_START = httpContext.GetNextPar( ) ;
         n63TAS02_DATE_W_START = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A63TAS02_DATE_W_START", A63TAS02_DATE_W_START);
         A64TAS02_DATE_W_END = httpContext.GetNextPar( ) ;
         n64TAS02_DATE_W_END = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A64TAS02_DATE_W_END", A64TAS02_DATE_W_END);
         A115TAS02_DEL_FLG = httpContext.GetNextPar( ) ;
         n115TAS02_DEL_FLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A115TAS02_DEL_FLG", A115TAS02_DEL_FLG);
         A57TAS02_CRT_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
         n57TAS02_CRT_DATETIME = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A57TAS02_CRT_DATETIME", localUtil.ttoc( A57TAS02_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         A83TAS02_CRT_USER_ID = httpContext.GetNextPar( ) ;
         n83TAS02_CRT_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A83TAS02_CRT_USER_ID", A83TAS02_CRT_USER_ID);
         A59TAS02_CRT_PROG_NM = httpContext.GetNextPar( ) ;
         n59TAS02_CRT_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A59TAS02_CRT_PROG_NM", A59TAS02_CRT_PROG_NM);
         A60TAS02_UPD_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
         n60TAS02_UPD_DATETIME = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A60TAS02_UPD_DATETIME", localUtil.ttoc( A60TAS02_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         A84TAS02_UPD_USER_ID = httpContext.GetNextPar( ) ;
         n84TAS02_UPD_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A84TAS02_UPD_USER_ID", A84TAS02_UPD_USER_ID);
         A62TAS02_UPD_PROG_NM = httpContext.GetNextPar( ) ;
         n62TAS02_UPD_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A62TAS02_UPD_PROG_NM", A62TAS02_UPD_PROG_NM);
         A116TAS02_UPD_CNT = GXutil.lval( httpContext.GetNextPar( )) ;
         n116TAS02_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A116TAS02_UPD_CNT", GXutil.ltrim( GXutil.str( A116TAS02_UPD_CNT, 10, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_34_066( AV14Pgmname, Gx_mode, A22TAS02_GNGO_KBN, A23TAS02_GNGO_NM, A56TAS02_GNGO_RYAK_NM, A26TAS02_HNKAN_NEN, A24TAS02_DATE_START, A25TAS02_DATE_END, A63TAS02_DATE_W_START, A64TAS02_DATE_W_END, A115TAS02_DEL_FLG, A57TAS02_CRT_DATETIME, A83TAS02_CRT_USER_ID, A59TAS02_CRT_PROG_NM, A60TAS02_UPD_DATETIME, A84TAS02_UPD_USER_ID, A62TAS02_UPD_PROG_NM, A116TAS02_UPD_CNT) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action35") == 0 )
      {
         AV14Pgmname = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A22TAS02_GNGO_KBN = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A22TAS02_GNGO_KBN", A22TAS02_GNGO_KBN);
         A23TAS02_GNGO_NM = httpContext.GetNextPar( ) ;
         n23TAS02_GNGO_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A23TAS02_GNGO_NM", A23TAS02_GNGO_NM);
         A56TAS02_GNGO_RYAK_NM = httpContext.GetNextPar( ) ;
         n56TAS02_GNGO_RYAK_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A56TAS02_GNGO_RYAK_NM", A56TAS02_GNGO_RYAK_NM);
         A26TAS02_HNKAN_NEN = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         n26TAS02_HNKAN_NEN = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A26TAS02_HNKAN_NEN", GXutil.ltrim( GXutil.str( A26TAS02_HNKAN_NEN, 4, 0)));
         A24TAS02_DATE_START = httpContext.GetNextPar( ) ;
         n24TAS02_DATE_START = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A24TAS02_DATE_START", A24TAS02_DATE_START);
         A25TAS02_DATE_END = httpContext.GetNextPar( ) ;
         n25TAS02_DATE_END = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A25TAS02_DATE_END", A25TAS02_DATE_END);
         A63TAS02_DATE_W_START = httpContext.GetNextPar( ) ;
         n63TAS02_DATE_W_START = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A63TAS02_DATE_W_START", A63TAS02_DATE_W_START);
         A64TAS02_DATE_W_END = httpContext.GetNextPar( ) ;
         n64TAS02_DATE_W_END = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A64TAS02_DATE_W_END", A64TAS02_DATE_W_END);
         A115TAS02_DEL_FLG = httpContext.GetNextPar( ) ;
         n115TAS02_DEL_FLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A115TAS02_DEL_FLG", A115TAS02_DEL_FLG);
         A57TAS02_CRT_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
         n57TAS02_CRT_DATETIME = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A57TAS02_CRT_DATETIME", localUtil.ttoc( A57TAS02_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         A83TAS02_CRT_USER_ID = httpContext.GetNextPar( ) ;
         n83TAS02_CRT_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A83TAS02_CRT_USER_ID", A83TAS02_CRT_USER_ID);
         A59TAS02_CRT_PROG_NM = httpContext.GetNextPar( ) ;
         n59TAS02_CRT_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A59TAS02_CRT_PROG_NM", A59TAS02_CRT_PROG_NM);
         A60TAS02_UPD_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
         n60TAS02_UPD_DATETIME = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A60TAS02_UPD_DATETIME", localUtil.ttoc( A60TAS02_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         A84TAS02_UPD_USER_ID = httpContext.GetNextPar( ) ;
         n84TAS02_UPD_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A84TAS02_UPD_USER_ID", A84TAS02_UPD_USER_ID);
         A62TAS02_UPD_PROG_NM = httpContext.GetNextPar( ) ;
         n62TAS02_UPD_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A62TAS02_UPD_PROG_NM", A62TAS02_UPD_PROG_NM);
         A116TAS02_UPD_CNT = GXutil.lval( httpContext.GetNextPar( )) ;
         n116TAS02_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A116TAS02_UPD_CNT", GXutil.ltrim( GXutil.str( A116TAS02_UPD_CNT, 10, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_35_066( AV14Pgmname, Gx_mode, A22TAS02_GNGO_KBN, A23TAS02_GNGO_NM, A56TAS02_GNGO_RYAK_NM, A26TAS02_HNKAN_NEN, A24TAS02_DATE_START, A25TAS02_DATE_END, A63TAS02_DATE_W_START, A64TAS02_DATE_W_END, A115TAS02_DEL_FLG, A57TAS02_CRT_DATETIME, A83TAS02_CRT_USER_ID, A59TAS02_CRT_PROG_NM, A60TAS02_UPD_DATETIME, A84TAS02_UPD_USER_ID, A62TAS02_UPD_PROG_NM, A116TAS02_UPD_CNT) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel7"+"_"+"TAS02_CRT_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx7asatas02_crt_user_id066( Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel9"+"_"+"TAS02_UPD_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx9asatas02_upd_user_id066( Gx_mode) ;
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
      radTAS02_DEL_FLG.setName( "TAS02_DEL_FLG" );
      radTAS02_DEL_FLG.setWebtags( "" );
      radTAS02_DEL_FLG.addItem("0", "利用可能", (short)(0));
      radTAS02_DEL_FLG.addItem("1", "利用不可", (short)(0));
      Form.getMeta().addItem("Generator", "GeneXus Java", (short)(0)) ;
      Form.getMeta().addItem("Version", "10_1_8-58720", (short)(0)) ;
      Form.getMeta().addItem("Description", "和暦元号マスタ", (short)(0)) ;
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTAS02_GNGO_KBN_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setTheme("Style2");
   }

   public tas02_geng_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tas02_geng_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tas02_geng_impl.class ));
   }

   public tas02_geng_impl( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      radTAS02_DEL_FLG = new HTMLChoice();
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
         wb_table1_2_066( true) ;
      }
      return  ;
   }

   public void wb_table1_2_066e( boolean wbgen )
   {
      if ( wbgen )
      {
         renderHtmlCloseForm066( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void wb_table1_2_066( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableBorder100x100", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_066( true) ;
      }
      return  ;
   }

   public void wb_table2_5_066e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Control Group */
         ClassString = "Group" ;
         StyleString = "" ;
         httpContext.writeText( "<fieldset id=\""+grpGroupdata_Internalname+"\""+" style=\"-moz-border-radius:3pt;\""+" class=\""+ClassString+"\">") ;
         httpContext.writeText( "<legend class=\""+ClassString+"Title"+"\">"+"和暦元号マスタ"+"</legend>") ;
         wb_table3_27_066( true) ;
      }
      return  ;
   }

   public void wb_table3_27_066e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_066e( true) ;
      }
      else
      {
         wb_table1_2_066e( false) ;
      }
   }

   public void wb_table3_27_066( boolean wbgen )
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
         wb_table4_33_066( true) ;
      }
      return  ;
   }

   public void wb_table4_33_066e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table5_122_066( true) ;
      }
      return  ;
   }

   public void wb_table5_122_066e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_27_066e( true) ;
      }
      else
      {
         wb_table3_27_066e( false) ;
      }
   }

   public void wb_table5_122_066( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock44_Internalname, "実行", "", "", lblTextblock44_Jsonclick, "EENTER.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_TAS02_GENG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "&nbsp;") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockBtn060" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock45_Internalname, "クリア", "", "", lblTextblock45_Jsonclick, "E\\'BTN_CLER\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_TAS02_GENG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "&nbsp;") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockBtn060" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_cancel_Internalname, "終了", "", "", lblBtn_cancel_Jsonclick, "ECHECK.", StyleString, ClassString, 5, "", 1, lblBtn_cancel_Enabled, (short)(0), "HLP_TAS02_GENG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_122_066e( true) ;
      }
      else
      {
         wb_table5_122_066e( false) ;
      }
   }

   public void wb_table4_33_066( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable2_Internalname, tblTable2_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\"  style=\"width:150px\">") ;
         /* Static images/pictures */
         ClassString = "ImageRequiredMark" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage19_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", "Style2"), "", "", "", "Style2", imgImage19_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "HLP_TAS02_GENG.htm");
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktas02_gngo_kbn_Internalname, "元号区分", "", "", lblTextblocktas02_gngo_kbn_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAS02_GENG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A22TAS02_GNGO_KBN", A22TAS02_GNGO_KBN);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
         ClassString = "AttributeImeOff" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAS02_GNGO_KBN_Internalname, GXutil.rtrim( A22TAS02_GNGO_KBN), GXutil.rtrim( localUtil.format( A22TAS02_GNGO_KBN, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(39);\"", "", "", "", "", edtTAS02_GNGO_KBN_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAS02_GNGO_KBN_Enabled, 1, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TAS02_GENG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Static images/pictures */
         ClassString = "ImageRequiredMark" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage20_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", "Style2"), "", "", "", "Style2", imgImage20_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "HLP_TAS02_GENG.htm");
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktas02_gngo_nm_Internalname, "元号名称", "", "", lblTextblocktas02_gngo_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAS02_GENG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A23TAS02_GNGO_NM", A23TAS02_GNGO_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
         ClassString = "AttributeImeOn" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAS02_GNGO_NM_Internalname, GXutil.rtrim( A23TAS02_GNGO_NM), GXutil.rtrim( localUtil.format( A23TAS02_GNGO_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(45);\"", "", "", "", "", edtTAS02_GNGO_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAS02_GNGO_NM_Enabled, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TAS02_GENG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktas02_gngo_ryak_nm_Internalname, "元号略称", "", "", lblTextblocktas02_gngo_ryak_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAS02_GENG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A56TAS02_GNGO_RYAK_NM", A56TAS02_GNGO_RYAK_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
         ClassString = "AttributeImeOn" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAS02_GNGO_RYAK_NM_Internalname, GXutil.rtrim( A56TAS02_GNGO_RYAK_NM), GXutil.rtrim( localUtil.format( A56TAS02_GNGO_RYAK_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(50);\"", "", "", "", "", edtTAS02_GNGO_RYAK_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAS02_GNGO_RYAK_NM_Enabled, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TAS02_GENG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Static images/pictures */
         ClassString = "ImageRequiredMark" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage21_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", "Style2"), "", "", "", "Style2", imgImage21_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "HLP_TAS02_GENG.htm");
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktas02_hnkan_nen_Internalname, "和暦変換用減算年数", "", "", lblTextblocktas02_hnkan_nen_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAS02_GENG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A26TAS02_HNKAN_NEN", GXutil.ltrim( GXutil.str( A26TAS02_HNKAN_NEN, 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
         ClassString = "AttributeNum" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAS02_HNKAN_NEN_Internalname, GXutil.ltrim( localUtil.ntoc( A26TAS02_HNKAN_NEN, (byte)(4), (byte)(0), ".", "")), ((edtTAS02_HNKAN_NEN_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A26TAS02_HNKAN_NEN), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A26TAS02_HNKAN_NEN), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(56);\"", "", "", "", "", edtTAS02_HNKAN_NEN_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAS02_HNKAN_NEN_Enabled, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TAS02_GENG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Static images/pictures */
         ClassString = "ImageRequiredMark" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage22_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", "Style2"), "", "", "", "Style2", imgImage22_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "HLP_TAS02_GENG.htm");
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktas02_date_start_Internalname, "開始年月日（西暦）", "", "", lblTextblocktas02_date_start_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAS02_GENG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A24TAS02_DATE_START", A24TAS02_DATE_START);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
         ClassString = "AttributeImeOff" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAS02_DATE_START_Internalname, GXutil.rtrim( A24TAS02_DATE_START), GXutil.rtrim( localUtil.format( A24TAS02_DATE_START, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(62);\"", "", "", "", "", edtTAS02_DATE_START_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAS02_DATE_START_Enabled, 0, 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TAS02_GENG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Static images/pictures */
         ClassString = "ImageRequiredMark" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage23_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", "Style2"), "", "", "", "Style2", imgImage23_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "HLP_TAS02_GENG.htm");
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktas02_date_end_Internalname, "終了年月日（西暦）", "", "", lblTextblocktas02_date_end_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAS02_GENG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A25TAS02_DATE_END", A25TAS02_DATE_END);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
         ClassString = "AttributeImeOff" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAS02_DATE_END_Internalname, GXutil.rtrim( A25TAS02_DATE_END), GXutil.rtrim( localUtil.format( A25TAS02_DATE_END, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(68);\"", "", "", "", "", edtTAS02_DATE_END_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAS02_DATE_END_Enabled, 0, 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TAS02_GENG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktas02_date_w_start_Internalname, "開始年月日（和暦）", "", "", lblTextblocktas02_date_w_start_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAS02_GENG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A63TAS02_DATE_W_START", A63TAS02_DATE_W_START);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
         ClassString = "AttributeImeOff" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAS02_DATE_W_START_Internalname, GXutil.rtrim( A63TAS02_DATE_W_START), GXutil.rtrim( localUtil.format( A63TAS02_DATE_W_START, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(73);\"", "", "", "", "", edtTAS02_DATE_W_START_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAS02_DATE_W_START_Enabled, 0, 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TAS02_GENG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktas02_date_w_end_Internalname, "終了年月日（和暦）", "", "", lblTextblocktas02_date_w_end_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAS02_GENG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A64TAS02_DATE_W_END", A64TAS02_DATE_W_END);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
         ClassString = "AttributeImeOff" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAS02_DATE_W_END_Internalname, GXutil.rtrim( A64TAS02_DATE_W_END), GXutil.rtrim( localUtil.format( A64TAS02_DATE_W_END, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(78);\"", "", "", "", "", edtTAS02_DATE_W_END_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAS02_DATE_W_END_Enabled, 0, 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TAS02_GENG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktas02_del_flg_Internalname, "削除フラグ", "", "", lblTextblocktas02_del_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAS02_GENG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Radio button */
         httpContext.ajax_rsp_assign_attri("", false, "A115TAS02_DEL_FLG", A115TAS02_DEL_FLG);
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
         GxWebStd.gx_radio_ctrl( httpContext, radTAS02_DEL_FLG, radTAS02_DEL_FLG.getInternalname(), A115TAS02_DEL_FLG, "", 1, radTAS02_DEL_FLG.getEnabled(), 0, 0, StyleString, ClassString, 0, radTAS02_DEL_FLG.getJsonclick(), "", TempTags+" onclick=\"gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(83);\"", "HLP_TAS02_GENG.htm");
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktas02_crt_datetime_Internalname, "作成日時", "", "", lblTextblocktas02_crt_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAS02_GENG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A57TAS02_CRT_DATETIME", localUtil.ttoc( A57TAS02_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTAS02_CRT_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAS02_CRT_DATETIME_Internalname, localUtil.format(A57TAS02_CRT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A57TAS02_CRT_DATETIME, "9999/99/99 99:99:99"), "", "", "", "", "", edtTAS02_CRT_DATETIME_Jsonclick, 0, ClassString, StyleString, "", edtTAS02_CRT_DATETIME_Visible, edtTAS02_CRT_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(1), true, "right", "HLP_TAS02_GENG.htm");
         GxWebStd.gx_bitmap( httpContext, edtTAS02_CRT_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((edtTAS02_CRT_DATETIME_Visible==0)||(edtTAS02_CRT_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TAS02_GENG.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktas02_crt_user_id_Internalname, "作成ユーザーID", "", "", lblTextblocktas02_crt_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAS02_GENG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A83TAS02_CRT_USER_ID", A83TAS02_CRT_USER_ID);
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAS02_CRT_USER_ID_Internalname, GXutil.rtrim( A83TAS02_CRT_USER_ID), GXutil.rtrim( localUtil.format( A83TAS02_CRT_USER_ID, "")), "", "", "", "", "", edtTAS02_CRT_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAS02_CRT_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(1), true, "left", "HLP_TAS02_GENG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktas02_crt_prog_nm_Internalname, "作成プログラム名", "", "", lblTextblocktas02_crt_prog_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAS02_GENG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A59TAS02_CRT_PROG_NM", A59TAS02_CRT_PROG_NM);
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAS02_CRT_PROG_NM_Internalname, GXutil.rtrim( A59TAS02_CRT_PROG_NM), GXutil.rtrim( localUtil.format( A59TAS02_CRT_PROG_NM, "")), "", "", "", "", "", edtTAS02_CRT_PROG_NM_Jsonclick, 0, ClassString, StyleString, "", edtTAS02_CRT_PROG_NM_Visible, edtTAS02_CRT_PROG_NM_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(1), true, "left", "HLP_TAS02_GENG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktas02_upd_datetime_Internalname, "更新日時", "", "", lblTextblocktas02_upd_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAS02_GENG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A60TAS02_UPD_DATETIME", localUtil.ttoc( A60TAS02_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTAS02_UPD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAS02_UPD_DATETIME_Internalname, localUtil.format(A60TAS02_UPD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A60TAS02_UPD_DATETIME, "9999/99/99 99:99:99"), "", "", "", "", "", edtTAS02_UPD_DATETIME_Jsonclick, 0, ClassString, StyleString, "", edtTAS02_UPD_DATETIME_Visible, edtTAS02_UPD_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(1), true, "right", "HLP_TAS02_GENG.htm");
         GxWebStd.gx_bitmap( httpContext, edtTAS02_UPD_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((edtTAS02_UPD_DATETIME_Visible==0)||(edtTAS02_UPD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TAS02_GENG.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktas02_upd_user_id_Internalname, "更新ユーザーID", "", "", lblTextblocktas02_upd_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAS02_GENG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A84TAS02_UPD_USER_ID", A84TAS02_UPD_USER_ID);
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAS02_UPD_USER_ID_Internalname, GXutil.rtrim( A84TAS02_UPD_USER_ID), GXutil.rtrim( localUtil.format( A84TAS02_UPD_USER_ID, "")), "", "", "", "", "", edtTAS02_UPD_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAS02_UPD_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(1), true, "left", "HLP_TAS02_GENG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktas02_upd_prog_nm_Internalname, "更新プログラム名", "", "", lblTextblocktas02_upd_prog_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAS02_GENG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A62TAS02_UPD_PROG_NM", A62TAS02_UPD_PROG_NM);
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAS02_UPD_PROG_NM_Internalname, GXutil.rtrim( A62TAS02_UPD_PROG_NM), GXutil.rtrim( localUtil.format( A62TAS02_UPD_PROG_NM, "")), "", "", "", "", "", edtTAS02_UPD_PROG_NM_Jsonclick, 0, ClassString, StyleString, "", edtTAS02_UPD_PROG_NM_Visible, edtTAS02_UPD_PROG_NM_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(1), true, "left", "HLP_TAS02_GENG.htm");
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
         wb_table4_33_066e( true) ;
      }
      else
      {
         wb_table4_33_066e( false) ;
      }
   }

   public void wb_table2_5_066( boolean wbgen )
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
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", "Style2"), "", "", "", "Style2", imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAS02_GENG.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_separator_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAS02_GENG.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", "Style2"), "", "", "", "Style2", imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAS02_GENG.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAS02_GENG.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", "Style2"), "", "", "", "Style2", imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAS02_GENG.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_separator_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAS02_GENG.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", "Style2"), "", "", "", "Style2", imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAS02_GENG.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_separator_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAS02_GENG.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", "Style2"), "", "", "", "Style2", imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "", 0, "", 0, 0, 4, imgBtn_select_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "gx.popup.openPrompt('"+"gx0060"+"',["+"{Ctrl:gx.dom.el('"+"TAS02_GNGO_KBN"+"'), id:'"+"TAS02_GNGO_KBN"+"'"+",isOut:true,isKey:true,isLastKey:true}"+"],"+"null"+","+"'', false"+","+"true"+");"+"return false;", "HLP_TAS02_GENG.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 4, imgBtn_select_separator_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "gx.popup.openPrompt('"+"gx0060"+"',["+"{Ctrl:gx.dom.el('"+"TAS02_GNGO_KBN"+"'), id:'"+"TAS02_GNGO_KBN"+"'"+",isOut:true,isKey:true,isLastKey:true}"+"],"+"null"+","+"'', false"+","+"true"+");"+"return false;", "HLP_TAS02_GENG.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAS02_GENG.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAS02_GENG.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAS02_GENG.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAS02_GENG.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAS02_GENG.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAS02_GENG.htm");
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
         wb_table2_5_066e( true) ;
      }
      else
      {
         wb_table2_5_066e( false) ;
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
      /* Execute user event: e11062 */
      e11062 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            A22TAS02_GNGO_KBN = httpContext.cgiGet( edtTAS02_GNGO_KBN_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A22TAS02_GNGO_KBN", A22TAS02_GNGO_KBN);
            A23TAS02_GNGO_NM = httpContext.cgiGet( edtTAS02_GNGO_NM_Internalname) ;
            n23TAS02_GNGO_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A23TAS02_GNGO_NM", A23TAS02_GNGO_NM);
            n23TAS02_GNGO_NM = ((GXutil.strcmp("", A23TAS02_GNGO_NM)==0) ? true : false) ;
            A56TAS02_GNGO_RYAK_NM = httpContext.cgiGet( edtTAS02_GNGO_RYAK_NM_Internalname) ;
            n56TAS02_GNGO_RYAK_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A56TAS02_GNGO_RYAK_NM", A56TAS02_GNGO_RYAK_NM);
            n56TAS02_GNGO_RYAK_NM = ((GXutil.strcmp("", A56TAS02_GNGO_RYAK_NM)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTAS02_HNKAN_NEN_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTAS02_HNKAN_NEN_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TAS02_HNKAN_NEN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTAS02_HNKAN_NEN_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A26TAS02_HNKAN_NEN = (short)(0) ;
               n26TAS02_HNKAN_NEN = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A26TAS02_HNKAN_NEN", GXutil.ltrim( GXutil.str( A26TAS02_HNKAN_NEN, 4, 0)));
            }
            else
            {
               A26TAS02_HNKAN_NEN = (short)(localUtil.ctol( httpContext.cgiGet( edtTAS02_HNKAN_NEN_Internalname), ".", ",")) ;
               n26TAS02_HNKAN_NEN = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A26TAS02_HNKAN_NEN", GXutil.ltrim( GXutil.str( A26TAS02_HNKAN_NEN, 4, 0)));
            }
            n26TAS02_HNKAN_NEN = ((0==A26TAS02_HNKAN_NEN) ? true : false) ;
            A24TAS02_DATE_START = httpContext.cgiGet( edtTAS02_DATE_START_Internalname) ;
            n24TAS02_DATE_START = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A24TAS02_DATE_START", A24TAS02_DATE_START);
            n24TAS02_DATE_START = ((GXutil.strcmp("", A24TAS02_DATE_START)==0) ? true : false) ;
            A25TAS02_DATE_END = httpContext.cgiGet( edtTAS02_DATE_END_Internalname) ;
            n25TAS02_DATE_END = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A25TAS02_DATE_END", A25TAS02_DATE_END);
            n25TAS02_DATE_END = ((GXutil.strcmp("", A25TAS02_DATE_END)==0) ? true : false) ;
            A63TAS02_DATE_W_START = httpContext.cgiGet( edtTAS02_DATE_W_START_Internalname) ;
            n63TAS02_DATE_W_START = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A63TAS02_DATE_W_START", A63TAS02_DATE_W_START);
            n63TAS02_DATE_W_START = ((GXutil.strcmp("", A63TAS02_DATE_W_START)==0) ? true : false) ;
            A64TAS02_DATE_W_END = httpContext.cgiGet( edtTAS02_DATE_W_END_Internalname) ;
            n64TAS02_DATE_W_END = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A64TAS02_DATE_W_END", A64TAS02_DATE_W_END);
            n64TAS02_DATE_W_END = ((GXutil.strcmp("", A64TAS02_DATE_W_END)==0) ? true : false) ;
            A115TAS02_DEL_FLG = httpContext.cgiGet( radTAS02_DEL_FLG.getInternalname()) ;
            n115TAS02_DEL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A115TAS02_DEL_FLG", A115TAS02_DEL_FLG);
            n115TAS02_DEL_FLG = ((GXutil.strcmp("", A115TAS02_DEL_FLG)==0) ? true : false) ;
            A57TAS02_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTAS02_CRT_DATETIME_Internalname)) ;
            n57TAS02_CRT_DATETIME = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A57TAS02_CRT_DATETIME", localUtil.ttoc( A57TAS02_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            A83TAS02_CRT_USER_ID = httpContext.cgiGet( edtTAS02_CRT_USER_ID_Internalname) ;
            n83TAS02_CRT_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A83TAS02_CRT_USER_ID", A83TAS02_CRT_USER_ID);
            A59TAS02_CRT_PROG_NM = httpContext.cgiGet( edtTAS02_CRT_PROG_NM_Internalname) ;
            n59TAS02_CRT_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A59TAS02_CRT_PROG_NM", A59TAS02_CRT_PROG_NM);
            A60TAS02_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTAS02_UPD_DATETIME_Internalname)) ;
            n60TAS02_UPD_DATETIME = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A60TAS02_UPD_DATETIME", localUtil.ttoc( A60TAS02_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            A84TAS02_UPD_USER_ID = httpContext.cgiGet( edtTAS02_UPD_USER_ID_Internalname) ;
            n84TAS02_UPD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A84TAS02_UPD_USER_ID", A84TAS02_UPD_USER_ID);
            A62TAS02_UPD_PROG_NM = httpContext.cgiGet( edtTAS02_UPD_PROG_NM_Internalname) ;
            n62TAS02_UPD_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A62TAS02_UPD_PROG_NM", A62TAS02_UPD_PROG_NM);
            /* Read saved values. */
            Z22TAS02_GNGO_KBN = httpContext.cgiGet( "Z22TAS02_GNGO_KBN") ;
            Z57TAS02_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z57TAS02_CRT_DATETIME"), 0) ;
            n57TAS02_CRT_DATETIME = (GXutil.nullDate().equals(A57TAS02_CRT_DATETIME) ? true : false) ;
            Z83TAS02_CRT_USER_ID = httpContext.cgiGet( "Z83TAS02_CRT_USER_ID") ;
            n83TAS02_CRT_USER_ID = ((GXutil.strcmp("", A83TAS02_CRT_USER_ID)==0) ? true : false) ;
            Z60TAS02_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z60TAS02_UPD_DATETIME"), 0) ;
            n60TAS02_UPD_DATETIME = (GXutil.nullDate().equals(A60TAS02_UPD_DATETIME) ? true : false) ;
            Z84TAS02_UPD_USER_ID = httpContext.cgiGet( "Z84TAS02_UPD_USER_ID") ;
            n84TAS02_UPD_USER_ID = ((GXutil.strcmp("", A84TAS02_UPD_USER_ID)==0) ? true : false) ;
            Z116TAS02_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z116TAS02_UPD_CNT"), ".", ",") ;
            n116TAS02_UPD_CNT = ((0==A116TAS02_UPD_CNT) ? true : false) ;
            Z23TAS02_GNGO_NM = httpContext.cgiGet( "Z23TAS02_GNGO_NM") ;
            n23TAS02_GNGO_NM = ((GXutil.strcmp("", A23TAS02_GNGO_NM)==0) ? true : false) ;
            Z56TAS02_GNGO_RYAK_NM = httpContext.cgiGet( "Z56TAS02_GNGO_RYAK_NM") ;
            n56TAS02_GNGO_RYAK_NM = ((GXutil.strcmp("", A56TAS02_GNGO_RYAK_NM)==0) ? true : false) ;
            Z26TAS02_HNKAN_NEN = (short)(localUtil.ctol( httpContext.cgiGet( "Z26TAS02_HNKAN_NEN"), ".", ",")) ;
            n26TAS02_HNKAN_NEN = ((0==A26TAS02_HNKAN_NEN) ? true : false) ;
            Z24TAS02_DATE_START = httpContext.cgiGet( "Z24TAS02_DATE_START") ;
            n24TAS02_DATE_START = ((GXutil.strcmp("", A24TAS02_DATE_START)==0) ? true : false) ;
            Z25TAS02_DATE_END = httpContext.cgiGet( "Z25TAS02_DATE_END") ;
            n25TAS02_DATE_END = ((GXutil.strcmp("", A25TAS02_DATE_END)==0) ? true : false) ;
            Z63TAS02_DATE_W_START = httpContext.cgiGet( "Z63TAS02_DATE_W_START") ;
            n63TAS02_DATE_W_START = ((GXutil.strcmp("", A63TAS02_DATE_W_START)==0) ? true : false) ;
            Z64TAS02_DATE_W_END = httpContext.cgiGet( "Z64TAS02_DATE_W_END") ;
            n64TAS02_DATE_W_END = ((GXutil.strcmp("", A64TAS02_DATE_W_END)==0) ? true : false) ;
            Z115TAS02_DEL_FLG = httpContext.cgiGet( "Z115TAS02_DEL_FLG") ;
            n115TAS02_DEL_FLG = ((GXutil.strcmp("", A115TAS02_DEL_FLG)==0) ? true : false) ;
            Z59TAS02_CRT_PROG_NM = httpContext.cgiGet( "Z59TAS02_CRT_PROG_NM") ;
            n59TAS02_CRT_PROG_NM = ((GXutil.strcmp("", A59TAS02_CRT_PROG_NM)==0) ? true : false) ;
            Z62TAS02_UPD_PROG_NM = httpContext.cgiGet( "Z62TAS02_UPD_PROG_NM") ;
            n62TAS02_UPD_PROG_NM = ((GXutil.strcmp("", A62TAS02_UPD_PROG_NM)==0) ? true : false) ;
            A116TAS02_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z116TAS02_UPD_CNT"), ".", ",") ;
            n116TAS02_UPD_CNT = false ;
            n116TAS02_UPD_CNT = ((0==A116TAS02_UPD_CNT) ? true : false) ;
            O116TAS02_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "O116TAS02_UPD_CNT"), ".", ",") ;
            n116TAS02_UPD_CNT = ((0==A116TAS02_UPD_CNT) ? true : false) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ".", ",")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ".", ",")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            A116TAS02_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "TAS02_UPD_CNT"), ".", ",") ;
            n116TAS02_UPD_CNT = ((0==A116TAS02_UPD_CNT) ? true : false) ;
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
               A22TAS02_GNGO_KBN = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A22TAS02_GNGO_KBN", A22TAS02_GNGO_KBN);
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
                     /* Execute user event: e11062 */
                     e11062 ();
                  }
                  else if ( GXutil.strcmp(sEvt, "'BTN_CLER'") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     dynload_actions( ) ;
                     /* Execute user event: e12062 */
                     e12062 ();
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
            initAll066( ) ;
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
      disableAttributes066( ) ;
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

   public void confirm_060( )
   {
      beforeValidate066( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls066( ) ;
         }
         else
         {
            checkExtendedTable066( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors066( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
      if ( AnyError == 0 )
      {
         confirmValues060( ) ;
      }
   }

   public void resetCaption060( )
   {
   }

   public void e11062( )
   {
      /* Start Routine */
      AV7C_TAM02_APP_ID = "TAS02" ;
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
      tas02_geng_impl.this.GXt_char2 = GXv_char3[0] ;
      AV12W_MSG = GXt_char2 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12W_MSG", AV12W_MSG);
      imgBtn_delete2_Jsonclick = "confirm('"+AV12W_MSG+"')" ;
      httpContext.ajax_rsp_assign_prop("", false, imgBtn_delete2_Internalname, "Jsonclick", imgBtn_delete2_Jsonclick);
   }

   public void e12062( )
   {
      /* 'BTN_CLER' Routine */
      httpContext.wjLoc = formatLink("tas02_geng")  ;
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT4[0] = AV8W_A_LOGIN_SDT;
      GXv_char3[0] = AV9W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT4, GXv_char3) ;
      AV8W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT4[0] ;
      tas02_geng_impl.this.AV9W_ERRCD = GXv_char3[0] ;
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
      tas02_geng_impl.this.AV10W_KNGN_FLG = GXv_char3[0] ;
      tas02_geng_impl.this.AV9W_ERRCD = GXv_char5[0] ;
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

   public void zm066( int GX_JID )
   {
      if ( ( GX_JID == 36 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z57TAS02_CRT_DATETIME = T00063_A57TAS02_CRT_DATETIME[0] ;
            Z83TAS02_CRT_USER_ID = T00063_A83TAS02_CRT_USER_ID[0] ;
            Z60TAS02_UPD_DATETIME = T00063_A60TAS02_UPD_DATETIME[0] ;
            Z84TAS02_UPD_USER_ID = T00063_A84TAS02_UPD_USER_ID[0] ;
            Z116TAS02_UPD_CNT = T00063_A116TAS02_UPD_CNT[0] ;
            Z23TAS02_GNGO_NM = T00063_A23TAS02_GNGO_NM[0] ;
            Z56TAS02_GNGO_RYAK_NM = T00063_A56TAS02_GNGO_RYAK_NM[0] ;
            Z26TAS02_HNKAN_NEN = T00063_A26TAS02_HNKAN_NEN[0] ;
            Z24TAS02_DATE_START = T00063_A24TAS02_DATE_START[0] ;
            Z25TAS02_DATE_END = T00063_A25TAS02_DATE_END[0] ;
            Z63TAS02_DATE_W_START = T00063_A63TAS02_DATE_W_START[0] ;
            Z64TAS02_DATE_W_END = T00063_A64TAS02_DATE_W_END[0] ;
            Z115TAS02_DEL_FLG = T00063_A115TAS02_DEL_FLG[0] ;
            Z59TAS02_CRT_PROG_NM = T00063_A59TAS02_CRT_PROG_NM[0] ;
            Z62TAS02_UPD_PROG_NM = T00063_A62TAS02_UPD_PROG_NM[0] ;
         }
         else
         {
            Z57TAS02_CRT_DATETIME = A57TAS02_CRT_DATETIME ;
            Z83TAS02_CRT_USER_ID = A83TAS02_CRT_USER_ID ;
            Z60TAS02_UPD_DATETIME = A60TAS02_UPD_DATETIME ;
            Z84TAS02_UPD_USER_ID = A84TAS02_UPD_USER_ID ;
            Z116TAS02_UPD_CNT = A116TAS02_UPD_CNT ;
            Z23TAS02_GNGO_NM = A23TAS02_GNGO_NM ;
            Z56TAS02_GNGO_RYAK_NM = A56TAS02_GNGO_RYAK_NM ;
            Z26TAS02_HNKAN_NEN = A26TAS02_HNKAN_NEN ;
            Z24TAS02_DATE_START = A24TAS02_DATE_START ;
            Z25TAS02_DATE_END = A25TAS02_DATE_END ;
            Z63TAS02_DATE_W_START = A63TAS02_DATE_W_START ;
            Z64TAS02_DATE_W_END = A64TAS02_DATE_W_END ;
            Z115TAS02_DEL_FLG = A115TAS02_DEL_FLG ;
            Z59TAS02_CRT_PROG_NM = A59TAS02_CRT_PROG_NM ;
            Z62TAS02_UPD_PROG_NM = A62TAS02_UPD_PROG_NM ;
         }
      }
      if ( GX_JID == -36 )
      {
         Z22TAS02_GNGO_KBN = A22TAS02_GNGO_KBN ;
         Z57TAS02_CRT_DATETIME = A57TAS02_CRT_DATETIME ;
         Z83TAS02_CRT_USER_ID = A83TAS02_CRT_USER_ID ;
         Z60TAS02_UPD_DATETIME = A60TAS02_UPD_DATETIME ;
         Z84TAS02_UPD_USER_ID = A84TAS02_UPD_USER_ID ;
         Z116TAS02_UPD_CNT = A116TAS02_UPD_CNT ;
         Z23TAS02_GNGO_NM = A23TAS02_GNGO_NM ;
         Z56TAS02_GNGO_RYAK_NM = A56TAS02_GNGO_RYAK_NM ;
         Z26TAS02_HNKAN_NEN = A26TAS02_HNKAN_NEN ;
         Z24TAS02_DATE_START = A24TAS02_DATE_START ;
         Z25TAS02_DATE_END = A25TAS02_DATE_END ;
         Z63TAS02_DATE_W_START = A63TAS02_DATE_W_START ;
         Z64TAS02_DATE_W_END = A64TAS02_DATE_W_END ;
         Z115TAS02_DEL_FLG = A115TAS02_DEL_FLG ;
         Z59TAS02_CRT_PROG_NM = A59TAS02_CRT_PROG_NM ;
         Z62TAS02_UPD_PROG_NM = A62TAS02_UPD_PROG_NM ;
      }
   }

   public void standaloneNotModal( )
   {
      edtTAS02_CRT_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAS02_CRT_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAS02_CRT_DATETIME_Enabled, 5, 0)));
      edtTAS02_CRT_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAS02_CRT_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAS02_CRT_USER_ID_Enabled, 5, 0)));
      edtTAS02_CRT_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAS02_CRT_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAS02_CRT_PROG_NM_Enabled, 5, 0)));
      edtTAS02_UPD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAS02_UPD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAS02_UPD_DATETIME_Enabled, 5, 0)));
      edtTAS02_UPD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAS02_UPD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAS02_UPD_USER_ID_Enabled, 5, 0)));
      edtTAS02_UPD_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAS02_UPD_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAS02_UPD_PROG_NM_Enabled, 5, 0)));
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtTAS02_CRT_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAS02_CRT_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAS02_CRT_DATETIME_Enabled, 5, 0)));
      edtTAS02_CRT_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAS02_CRT_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAS02_CRT_USER_ID_Enabled, 5, 0)));
      edtTAS02_CRT_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAS02_CRT_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAS02_CRT_PROG_NM_Enabled, 5, 0)));
      edtTAS02_UPD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAS02_UPD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAS02_UPD_DATETIME_Enabled, 5, 0)));
      edtTAS02_UPD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAS02_UPD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAS02_UPD_USER_ID_Enabled, 5, 0)));
      edtTAS02_UPD_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAS02_UPD_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAS02_UPD_PROG_NM_Enabled, 5, 0)));
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 )  )
      {
         edtTAS02_GNGO_KBN_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTAS02_GNGO_KBN_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAS02_GNGO_KBN_Enabled, 5, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
      {
         edtTAS02_CRT_DATETIME_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTAS02_CRT_DATETIME_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTAS02_CRT_DATETIME_Visible, 5, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
      {
         edtTAS02_CRT_PROG_NM_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTAS02_CRT_PROG_NM_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTAS02_CRT_PROG_NM_Visible, 5, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
      {
         edtTAS02_UPD_DATETIME_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTAS02_UPD_DATETIME_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTAS02_UPD_DATETIME_Visible, 5, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
      {
         edtTAS02_UPD_PROG_NM_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTAS02_UPD_PROG_NM_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTAS02_UPD_PROG_NM_Visible, 5, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  && (GXutil.strcmp("", A115TAS02_DEL_FLG)==0) && ( Gx_BScreen == 0 ) )
      {
         A115TAS02_DEL_FLG = "0" ;
         n115TAS02_DEL_FLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A115TAS02_DEL_FLG", A115TAS02_DEL_FLG);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  && (GXutil.strcmp("", A59TAS02_CRT_PROG_NM)==0) && ( Gx_BScreen == 0 ) )
      {
         A59TAS02_CRT_PROG_NM = AV14Pgmname ;
         n59TAS02_CRT_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A59TAS02_CRT_PROG_NM", A59TAS02_CRT_PROG_NM);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  && (GXutil.strcmp("", A62TAS02_UPD_PROG_NM)==0) && ( Gx_BScreen == 0 ) )
      {
         A62TAS02_UPD_PROG_NM = AV14Pgmname ;
         n62TAS02_UPD_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A62TAS02_UPD_PROG_NM", A62TAS02_UPD_PROG_NM);
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

   public void load066( )
   {
      /* Using cursor T00064 */
      pr_default.execute(2, new Object[] {A22TAS02_GNGO_KBN});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound6 = (short)(1) ;
         A57TAS02_CRT_DATETIME = T00064_A57TAS02_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A57TAS02_CRT_DATETIME", localUtil.ttoc( A57TAS02_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n57TAS02_CRT_DATETIME = T00064_n57TAS02_CRT_DATETIME[0] ;
         A83TAS02_CRT_USER_ID = T00064_A83TAS02_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A83TAS02_CRT_USER_ID", A83TAS02_CRT_USER_ID);
         n83TAS02_CRT_USER_ID = T00064_n83TAS02_CRT_USER_ID[0] ;
         A60TAS02_UPD_DATETIME = T00064_A60TAS02_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A60TAS02_UPD_DATETIME", localUtil.ttoc( A60TAS02_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n60TAS02_UPD_DATETIME = T00064_n60TAS02_UPD_DATETIME[0] ;
         A84TAS02_UPD_USER_ID = T00064_A84TAS02_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A84TAS02_UPD_USER_ID", A84TAS02_UPD_USER_ID);
         n84TAS02_UPD_USER_ID = T00064_n84TAS02_UPD_USER_ID[0] ;
         A116TAS02_UPD_CNT = T00064_A116TAS02_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A116TAS02_UPD_CNT", GXutil.ltrim( GXutil.str( A116TAS02_UPD_CNT, 10, 0)));
         n116TAS02_UPD_CNT = T00064_n116TAS02_UPD_CNT[0] ;
         A23TAS02_GNGO_NM = T00064_A23TAS02_GNGO_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A23TAS02_GNGO_NM", A23TAS02_GNGO_NM);
         n23TAS02_GNGO_NM = T00064_n23TAS02_GNGO_NM[0] ;
         A56TAS02_GNGO_RYAK_NM = T00064_A56TAS02_GNGO_RYAK_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A56TAS02_GNGO_RYAK_NM", A56TAS02_GNGO_RYAK_NM);
         n56TAS02_GNGO_RYAK_NM = T00064_n56TAS02_GNGO_RYAK_NM[0] ;
         A26TAS02_HNKAN_NEN = T00064_A26TAS02_HNKAN_NEN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A26TAS02_HNKAN_NEN", GXutil.ltrim( GXutil.str( A26TAS02_HNKAN_NEN, 4, 0)));
         n26TAS02_HNKAN_NEN = T00064_n26TAS02_HNKAN_NEN[0] ;
         A24TAS02_DATE_START = T00064_A24TAS02_DATE_START[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A24TAS02_DATE_START", A24TAS02_DATE_START);
         n24TAS02_DATE_START = T00064_n24TAS02_DATE_START[0] ;
         A25TAS02_DATE_END = T00064_A25TAS02_DATE_END[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A25TAS02_DATE_END", A25TAS02_DATE_END);
         n25TAS02_DATE_END = T00064_n25TAS02_DATE_END[0] ;
         A63TAS02_DATE_W_START = T00064_A63TAS02_DATE_W_START[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A63TAS02_DATE_W_START", A63TAS02_DATE_W_START);
         n63TAS02_DATE_W_START = T00064_n63TAS02_DATE_W_START[0] ;
         A64TAS02_DATE_W_END = T00064_A64TAS02_DATE_W_END[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A64TAS02_DATE_W_END", A64TAS02_DATE_W_END);
         n64TAS02_DATE_W_END = T00064_n64TAS02_DATE_W_END[0] ;
         A115TAS02_DEL_FLG = T00064_A115TAS02_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A115TAS02_DEL_FLG", A115TAS02_DEL_FLG);
         n115TAS02_DEL_FLG = T00064_n115TAS02_DEL_FLG[0] ;
         A59TAS02_CRT_PROG_NM = T00064_A59TAS02_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A59TAS02_CRT_PROG_NM", A59TAS02_CRT_PROG_NM);
         n59TAS02_CRT_PROG_NM = T00064_n59TAS02_CRT_PROG_NM[0] ;
         A62TAS02_UPD_PROG_NM = T00064_A62TAS02_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A62TAS02_UPD_PROG_NM", A62TAS02_UPD_PROG_NM);
         n62TAS02_UPD_PROG_NM = T00064_n62TAS02_UPD_PROG_NM[0] ;
         zm066( -36) ;
      }
      pr_default.close(2);
      onLoadActions066( ) ;
   }

   public void onLoadActions066( )
   {
      AV14Pgmname = "TAS02_GENG" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
   }

   public void checkExtendedTable066( )
   {
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      AV14Pgmname = "TAS02_GENG" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
   }

   public void closeExtendedTableCursors066( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey066( )
   {
      /* Using cursor T00065 */
      pr_default.execute(3, new Object[] {A22TAS02_GNGO_KBN});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound6 = (short)(1) ;
      }
      else
      {
         RcdFound6 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00063 */
      pr_default.execute(1, new Object[] {A22TAS02_GNGO_KBN});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm066( 36) ;
         RcdFound6 = (short)(1) ;
         A22TAS02_GNGO_KBN = T00063_A22TAS02_GNGO_KBN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A22TAS02_GNGO_KBN", A22TAS02_GNGO_KBN);
         A57TAS02_CRT_DATETIME = T00063_A57TAS02_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A57TAS02_CRT_DATETIME", localUtil.ttoc( A57TAS02_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n57TAS02_CRT_DATETIME = T00063_n57TAS02_CRT_DATETIME[0] ;
         A83TAS02_CRT_USER_ID = T00063_A83TAS02_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A83TAS02_CRT_USER_ID", A83TAS02_CRT_USER_ID);
         n83TAS02_CRT_USER_ID = T00063_n83TAS02_CRT_USER_ID[0] ;
         A60TAS02_UPD_DATETIME = T00063_A60TAS02_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A60TAS02_UPD_DATETIME", localUtil.ttoc( A60TAS02_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n60TAS02_UPD_DATETIME = T00063_n60TAS02_UPD_DATETIME[0] ;
         A84TAS02_UPD_USER_ID = T00063_A84TAS02_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A84TAS02_UPD_USER_ID", A84TAS02_UPD_USER_ID);
         n84TAS02_UPD_USER_ID = T00063_n84TAS02_UPD_USER_ID[0] ;
         A116TAS02_UPD_CNT = T00063_A116TAS02_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A116TAS02_UPD_CNT", GXutil.ltrim( GXutil.str( A116TAS02_UPD_CNT, 10, 0)));
         n116TAS02_UPD_CNT = T00063_n116TAS02_UPD_CNT[0] ;
         A23TAS02_GNGO_NM = T00063_A23TAS02_GNGO_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A23TAS02_GNGO_NM", A23TAS02_GNGO_NM);
         n23TAS02_GNGO_NM = T00063_n23TAS02_GNGO_NM[0] ;
         A56TAS02_GNGO_RYAK_NM = T00063_A56TAS02_GNGO_RYAK_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A56TAS02_GNGO_RYAK_NM", A56TAS02_GNGO_RYAK_NM);
         n56TAS02_GNGO_RYAK_NM = T00063_n56TAS02_GNGO_RYAK_NM[0] ;
         A26TAS02_HNKAN_NEN = T00063_A26TAS02_HNKAN_NEN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A26TAS02_HNKAN_NEN", GXutil.ltrim( GXutil.str( A26TAS02_HNKAN_NEN, 4, 0)));
         n26TAS02_HNKAN_NEN = T00063_n26TAS02_HNKAN_NEN[0] ;
         A24TAS02_DATE_START = T00063_A24TAS02_DATE_START[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A24TAS02_DATE_START", A24TAS02_DATE_START);
         n24TAS02_DATE_START = T00063_n24TAS02_DATE_START[0] ;
         A25TAS02_DATE_END = T00063_A25TAS02_DATE_END[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A25TAS02_DATE_END", A25TAS02_DATE_END);
         n25TAS02_DATE_END = T00063_n25TAS02_DATE_END[0] ;
         A63TAS02_DATE_W_START = T00063_A63TAS02_DATE_W_START[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A63TAS02_DATE_W_START", A63TAS02_DATE_W_START);
         n63TAS02_DATE_W_START = T00063_n63TAS02_DATE_W_START[0] ;
         A64TAS02_DATE_W_END = T00063_A64TAS02_DATE_W_END[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A64TAS02_DATE_W_END", A64TAS02_DATE_W_END);
         n64TAS02_DATE_W_END = T00063_n64TAS02_DATE_W_END[0] ;
         A115TAS02_DEL_FLG = T00063_A115TAS02_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A115TAS02_DEL_FLG", A115TAS02_DEL_FLG);
         n115TAS02_DEL_FLG = T00063_n115TAS02_DEL_FLG[0] ;
         A59TAS02_CRT_PROG_NM = T00063_A59TAS02_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A59TAS02_CRT_PROG_NM", A59TAS02_CRT_PROG_NM);
         n59TAS02_CRT_PROG_NM = T00063_n59TAS02_CRT_PROG_NM[0] ;
         A62TAS02_UPD_PROG_NM = T00063_A62TAS02_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A62TAS02_UPD_PROG_NM", A62TAS02_UPD_PROG_NM);
         n62TAS02_UPD_PROG_NM = T00063_n62TAS02_UPD_PROG_NM[0] ;
         O116TAS02_UPD_CNT = A116TAS02_UPD_CNT ;
         n116TAS02_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A116TAS02_UPD_CNT", GXutil.ltrim( GXutil.str( A116TAS02_UPD_CNT, 10, 0)));
         Z22TAS02_GNGO_KBN = A22TAS02_GNGO_KBN ;
         sMode6 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load066( ) ;
         Gx_mode = sMode6 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound6 = (short)(0) ;
         initializeNonKey066( ) ;
         sMode6 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode6 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey066( ) ;
      if ( RcdFound6 == 0 )
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
      RcdFound6 = (short)(0) ;
      /* Using cursor T00066 */
      pr_default.execute(4, new Object[] {A22TAS02_GNGO_KBN});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T00066_A22TAS02_GNGO_KBN[0], A22TAS02_GNGO_KBN) < 0 ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T00066_A22TAS02_GNGO_KBN[0], A22TAS02_GNGO_KBN) > 0 ) ) )
         {
            A22TAS02_GNGO_KBN = T00066_A22TAS02_GNGO_KBN[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A22TAS02_GNGO_KBN", A22TAS02_GNGO_KBN);
            RcdFound6 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound6 = (short)(0) ;
      /* Using cursor T00067 */
      pr_default.execute(5, new Object[] {A22TAS02_GNGO_KBN});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T00067_A22TAS02_GNGO_KBN[0], A22TAS02_GNGO_KBN) > 0 ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T00067_A22TAS02_GNGO_KBN[0], A22TAS02_GNGO_KBN) < 0 ) ) )
         {
            A22TAS02_GNGO_KBN = T00067_A22TAS02_GNGO_KBN[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A22TAS02_GNGO_KBN", A22TAS02_GNGO_KBN);
            RcdFound6 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey066( ) ;
      if ( RcdFound6 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "TAS02_GNGO_KBN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTAS02_GNGO_KBN_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( GXutil.strcmp(A22TAS02_GNGO_KBN, Z22TAS02_GNGO_KBN) != 0 )
         {
            A22TAS02_GNGO_KBN = Z22TAS02_GNGO_KBN ;
            httpContext.ajax_rsp_assign_attri("", false, "A22TAS02_GNGO_KBN", A22TAS02_GNGO_KBN);
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TAS02_GNGO_KBN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTAS02_GNGO_KBN_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            delete( ) ;
            afterTrn( ) ;
            GX_FocusControl = edtTAS02_GNGO_KBN_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else
         {
            Gx_mode = "UPD" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            /* Update record */
            update066( ) ;
            GX_FocusControl = edtTAS02_GNGO_KBN_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( GXutil.strcmp(A22TAS02_GNGO_KBN, Z22TAS02_GNGO_KBN) != 0 )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            /* Insert record */
            GX_FocusControl = edtTAS02_GNGO_KBN_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            insert066( ) ;
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
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TAS02_GNGO_KBN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTAS02_GNGO_KBN_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTAS02_GNGO_KBN_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert066( ) ;
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
      if ( GXutil.strcmp(A22TAS02_GNGO_KBN, Z22TAS02_GNGO_KBN) != 0 )
      {
         A22TAS02_GNGO_KBN = Z22TAS02_GNGO_KBN ;
         httpContext.ajax_rsp_assign_attri("", false, "A22TAS02_GNGO_KBN", A22TAS02_GNGO_KBN);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TAS02_GNGO_KBN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAS02_GNGO_KBN_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTAS02_GNGO_KBN_Internalname ;
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
      getKey066( ) ;
      if ( RcdFound6 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "TAS02_GNGO_KBN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTAS02_GNGO_KBN_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( GXutil.strcmp(A22TAS02_GNGO_KBN, Z22TAS02_GNGO_KBN) != 0 )
         {
            A22TAS02_GNGO_KBN = Z22TAS02_GNGO_KBN ;
            httpContext.ajax_rsp_assign_attri("", false, "A22TAS02_GNGO_KBN", A22TAS02_GNGO_KBN);
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "TAS02_GNGO_KBN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTAS02_GNGO_KBN_Internalname ;
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
         if ( GXutil.strcmp(A22TAS02_GNGO_KBN, Z22TAS02_GNGO_KBN) != 0 )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            insert_check( ) ;
         }
         else
         {
            if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TAS02_GNGO_KBN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTAS02_GNGO_KBN_Internalname ;
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
      Application.rollback(context, remoteHandle, "DEFAULT", "tas02_geng");
      GX_FocusControl = edtTAS02_GNGO_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_060( ) ;
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
      if ( RcdFound6 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TAS02_GNGO_KBN");
         AnyError = (short)(1) ;
      }
      GX_FocusControl = edtTAS02_GNGO_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      scanStart066( ) ;
      if ( RcdFound6 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTAS02_GNGO_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd066( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_previous( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      move_previous( ) ;
      if ( RcdFound6 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTAS02_GNGO_NM_Internalname ;
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
      if ( RcdFound6 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTAS02_GNGO_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_last( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      scanStart066( ) ;
      if ( RcdFound6 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         while ( RcdFound6 != 0 )
         {
            scanNext066( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTAS02_GNGO_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd066( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency066( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T00062 */
         pr_default.execute(0, new Object[] {A22TAS02_GNGO_KBN});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TAS02_GENG"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z57TAS02_CRT_DATETIME.equals( T00062_A57TAS02_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z83TAS02_CRT_USER_ID, T00062_A83TAS02_CRT_USER_ID[0]) != 0 ) || !( Z60TAS02_UPD_DATETIME.equals( T00062_A60TAS02_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z84TAS02_UPD_USER_ID, T00062_A84TAS02_UPD_USER_ID[0]) != 0 ) || ( Z116TAS02_UPD_CNT != T00062_A116TAS02_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z23TAS02_GNGO_NM, T00062_A23TAS02_GNGO_NM[0]) != 0 ) || ( GXutil.strcmp(Z56TAS02_GNGO_RYAK_NM, T00062_A56TAS02_GNGO_RYAK_NM[0]) != 0 ) || ( Z26TAS02_HNKAN_NEN != T00062_A26TAS02_HNKAN_NEN[0] ) || ( GXutil.strcmp(Z24TAS02_DATE_START, T00062_A24TAS02_DATE_START[0]) != 0 ) || ( GXutil.strcmp(Z25TAS02_DATE_END, T00062_A25TAS02_DATE_END[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z63TAS02_DATE_W_START, T00062_A63TAS02_DATE_W_START[0]) != 0 ) || ( GXutil.strcmp(Z64TAS02_DATE_W_END, T00062_A64TAS02_DATE_W_END[0]) != 0 ) || ( GXutil.strcmp(Z115TAS02_DEL_FLG, T00062_A115TAS02_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z59TAS02_CRT_PROG_NM, T00062_A59TAS02_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z62TAS02_UPD_PROG_NM, T00062_A62TAS02_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TAS02_GENG"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert066( )
   {
      beforeValidate066( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable066( ) ;
      }
      if ( AnyError == 0 )
      {
         zm066( 0) ;
         checkOptimisticConcurrency066( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm066( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert066( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00068 */
                  pr_default.execute(6, new Object[] {A22TAS02_GNGO_KBN, new Boolean(n57TAS02_CRT_DATETIME), A57TAS02_CRT_DATETIME, new Boolean(n83TAS02_CRT_USER_ID), A83TAS02_CRT_USER_ID, new Boolean(n60TAS02_UPD_DATETIME), A60TAS02_UPD_DATETIME, new Boolean(n84TAS02_UPD_USER_ID), A84TAS02_UPD_USER_ID, new Boolean(n116TAS02_UPD_CNT), new Long(A116TAS02_UPD_CNT), new Boolean(n23TAS02_GNGO_NM), A23TAS02_GNGO_NM, new Boolean(n56TAS02_GNGO_RYAK_NM), A56TAS02_GNGO_RYAK_NM, new Boolean(n26TAS02_HNKAN_NEN), new Short(A26TAS02_HNKAN_NEN), new Boolean(n24TAS02_DATE_START), A24TAS02_DATE_START, new Boolean(n25TAS02_DATE_END), A25TAS02_DATE_END, new Boolean(n63TAS02_DATE_W_START), A63TAS02_DATE_W_START, new Boolean(n64TAS02_DATE_W_END), A64TAS02_DATE_W_END, new Boolean(n115TAS02_DEL_FLG), A115TAS02_DEL_FLG, new Boolean(n59TAS02_CRT_PROG_NM), A59TAS02_CRT_PROG_NM, new Boolean(n62TAS02_UPD_PROG_NM), A62TAS02_UPD_PROG_NM});
                  if ( (pr_default.getStatus(6) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     new tas02_pc01_datalog(remoteHandle, context).execute( AV14Pgmname, Gx_mode, A22TAS02_GNGO_KBN, A23TAS02_GNGO_NM, A56TAS02_GNGO_RYAK_NM, A26TAS02_HNKAN_NEN, A24TAS02_DATE_START, A25TAS02_DATE_END, A63TAS02_DATE_W_START, A64TAS02_DATE_W_END, A115TAS02_DEL_FLG, A57TAS02_CRT_DATETIME, A83TAS02_CRT_USER_ID, A59TAS02_CRT_PROG_NM, A60TAS02_UPD_DATETIME, A84TAS02_UPD_USER_ID, A62TAS02_UPD_PROG_NM, A116TAS02_UPD_CNT) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     httpContext.ajax_rsp_assign_attri("", false, "A22TAS02_GNGO_KBN", A22TAS02_GNGO_KBN);
                     httpContext.ajax_rsp_assign_attri("", false, "A23TAS02_GNGO_NM", A23TAS02_GNGO_NM);
                     httpContext.ajax_rsp_assign_attri("", false, "A56TAS02_GNGO_RYAK_NM", A56TAS02_GNGO_RYAK_NM);
                     httpContext.ajax_rsp_assign_attri("", false, "A26TAS02_HNKAN_NEN", GXutil.ltrim( GXutil.str( A26TAS02_HNKAN_NEN, 4, 0)));
                     httpContext.ajax_rsp_assign_attri("", false, "A24TAS02_DATE_START", A24TAS02_DATE_START);
                     httpContext.ajax_rsp_assign_attri("", false, "A25TAS02_DATE_END", A25TAS02_DATE_END);
                     httpContext.ajax_rsp_assign_attri("", false, "A63TAS02_DATE_W_START", A63TAS02_DATE_W_START);
                     httpContext.ajax_rsp_assign_attri("", false, "A64TAS02_DATE_W_END", A64TAS02_DATE_W_END);
                     httpContext.ajax_rsp_assign_attri("", false, "A115TAS02_DEL_FLG", A115TAS02_DEL_FLG);
                     httpContext.ajax_rsp_assign_attri("", false, "A57TAS02_CRT_DATETIME", localUtil.ttoc( A57TAS02_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
                     httpContext.ajax_rsp_assign_attri("", false, "A83TAS02_CRT_USER_ID", A83TAS02_CRT_USER_ID);
                     httpContext.ajax_rsp_assign_attri("", false, "A59TAS02_CRT_PROG_NM", A59TAS02_CRT_PROG_NM);
                     httpContext.ajax_rsp_assign_attri("", false, "A60TAS02_UPD_DATETIME", localUtil.ttoc( A60TAS02_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
                     httpContext.ajax_rsp_assign_attri("", false, "A84TAS02_UPD_USER_ID", A84TAS02_UPD_USER_ID);
                     httpContext.ajax_rsp_assign_attri("", false, "A62TAS02_UPD_PROG_NM", A62TAS02_UPD_PROG_NM);
                     httpContext.ajax_rsp_assign_attri("", false, "A116TAS02_UPD_CNT", GXutil.ltrim( GXutil.str( A116TAS02_UPD_CNT, 10, 0)));
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucadded"), 0, "");
                        resetCaption060( ) ;
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
            load066( ) ;
         }
         endLevel066( ) ;
      }
      closeExtendedTableCursors066( ) ;
   }

   public void update066( )
   {
      beforeValidate066( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable066( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency066( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm066( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate066( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00069 */
                  pr_default.execute(7, new Object[] {new Boolean(n57TAS02_CRT_DATETIME), A57TAS02_CRT_DATETIME, new Boolean(n83TAS02_CRT_USER_ID), A83TAS02_CRT_USER_ID, new Boolean(n60TAS02_UPD_DATETIME), A60TAS02_UPD_DATETIME, new Boolean(n84TAS02_UPD_USER_ID), A84TAS02_UPD_USER_ID, new Boolean(n116TAS02_UPD_CNT), new Long(A116TAS02_UPD_CNT), new Boolean(n23TAS02_GNGO_NM), A23TAS02_GNGO_NM, new Boolean(n56TAS02_GNGO_RYAK_NM), A56TAS02_GNGO_RYAK_NM, new Boolean(n26TAS02_HNKAN_NEN), new Short(A26TAS02_HNKAN_NEN), new Boolean(n24TAS02_DATE_START), A24TAS02_DATE_START, new Boolean(n25TAS02_DATE_END), A25TAS02_DATE_END, new Boolean(n63TAS02_DATE_W_START), A63TAS02_DATE_W_START, new Boolean(n64TAS02_DATE_W_END), A64TAS02_DATE_W_END, new Boolean(n115TAS02_DEL_FLG), A115TAS02_DEL_FLG, new Boolean(n59TAS02_CRT_PROG_NM), A59TAS02_CRT_PROG_NM, new Boolean(n62TAS02_UPD_PROG_NM), A62TAS02_UPD_PROG_NM, A22TAS02_GNGO_KBN});
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TAS02_GENG"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate066( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     new tas02_pc01_datalog(remoteHandle, context).execute( AV14Pgmname, Gx_mode, A22TAS02_GNGO_KBN, A23TAS02_GNGO_NM, A56TAS02_GNGO_RYAK_NM, A26TAS02_HNKAN_NEN, A24TAS02_DATE_START, A25TAS02_DATE_END, A63TAS02_DATE_W_START, A64TAS02_DATE_W_END, A115TAS02_DEL_FLG, A57TAS02_CRT_DATETIME, A83TAS02_CRT_USER_ID, A59TAS02_CRT_PROG_NM, A60TAS02_UPD_DATETIME, A84TAS02_UPD_USER_ID, A62TAS02_UPD_PROG_NM, A116TAS02_UPD_CNT) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     httpContext.ajax_rsp_assign_attri("", false, "A22TAS02_GNGO_KBN", A22TAS02_GNGO_KBN);
                     httpContext.ajax_rsp_assign_attri("", false, "A23TAS02_GNGO_NM", A23TAS02_GNGO_NM);
                     httpContext.ajax_rsp_assign_attri("", false, "A56TAS02_GNGO_RYAK_NM", A56TAS02_GNGO_RYAK_NM);
                     httpContext.ajax_rsp_assign_attri("", false, "A26TAS02_HNKAN_NEN", GXutil.ltrim( GXutil.str( A26TAS02_HNKAN_NEN, 4, 0)));
                     httpContext.ajax_rsp_assign_attri("", false, "A24TAS02_DATE_START", A24TAS02_DATE_START);
                     httpContext.ajax_rsp_assign_attri("", false, "A25TAS02_DATE_END", A25TAS02_DATE_END);
                     httpContext.ajax_rsp_assign_attri("", false, "A63TAS02_DATE_W_START", A63TAS02_DATE_W_START);
                     httpContext.ajax_rsp_assign_attri("", false, "A64TAS02_DATE_W_END", A64TAS02_DATE_W_END);
                     httpContext.ajax_rsp_assign_attri("", false, "A115TAS02_DEL_FLG", A115TAS02_DEL_FLG);
                     httpContext.ajax_rsp_assign_attri("", false, "A57TAS02_CRT_DATETIME", localUtil.ttoc( A57TAS02_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
                     httpContext.ajax_rsp_assign_attri("", false, "A83TAS02_CRT_USER_ID", A83TAS02_CRT_USER_ID);
                     httpContext.ajax_rsp_assign_attri("", false, "A59TAS02_CRT_PROG_NM", A59TAS02_CRT_PROG_NM);
                     httpContext.ajax_rsp_assign_attri("", false, "A60TAS02_UPD_DATETIME", localUtil.ttoc( A60TAS02_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
                     httpContext.ajax_rsp_assign_attri("", false, "A84TAS02_UPD_USER_ID", A84TAS02_UPD_USER_ID);
                     httpContext.ajax_rsp_assign_attri("", false, "A62TAS02_UPD_PROG_NM", A62TAS02_UPD_PROG_NM);
                     httpContext.ajax_rsp_assign_attri("", false, "A116TAS02_UPD_CNT", GXutil.ltrim( GXutil.str( A116TAS02_UPD_CNT, 10, 0)));
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "");
                        resetCaption060( ) ;
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
         endLevel066( ) ;
      }
      closeExtendedTableCursors066( ) ;
   }

   public void deferredUpdate066( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate066( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency066( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls066( ) ;
         afterConfirm066( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete066( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000610 */
               pr_default.execute(8, new Object[] {A22TAS02_GNGO_KBN});
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  new tas02_pc01_datalog(remoteHandle, context).execute( AV14Pgmname, Gx_mode, A22TAS02_GNGO_KBN, A23TAS02_GNGO_NM, A56TAS02_GNGO_RYAK_NM, A26TAS02_HNKAN_NEN, A24TAS02_DATE_START, A25TAS02_DATE_END, A63TAS02_DATE_W_START, A64TAS02_DATE_W_END, A115TAS02_DEL_FLG, A57TAS02_CRT_DATETIME, A83TAS02_CRT_USER_ID, A59TAS02_CRT_PROG_NM, A60TAS02_UPD_DATETIME, A84TAS02_UPD_USER_ID, A62TAS02_UPD_PROG_NM, A116TAS02_UPD_CNT) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "A22TAS02_GNGO_KBN", A22TAS02_GNGO_KBN);
                  httpContext.ajax_rsp_assign_attri("", false, "A23TAS02_GNGO_NM", A23TAS02_GNGO_NM);
                  httpContext.ajax_rsp_assign_attri("", false, "A56TAS02_GNGO_RYAK_NM", A56TAS02_GNGO_RYAK_NM);
                  httpContext.ajax_rsp_assign_attri("", false, "A26TAS02_HNKAN_NEN", GXutil.ltrim( GXutil.str( A26TAS02_HNKAN_NEN, 4, 0)));
                  httpContext.ajax_rsp_assign_attri("", false, "A24TAS02_DATE_START", A24TAS02_DATE_START);
                  httpContext.ajax_rsp_assign_attri("", false, "A25TAS02_DATE_END", A25TAS02_DATE_END);
                  httpContext.ajax_rsp_assign_attri("", false, "A63TAS02_DATE_W_START", A63TAS02_DATE_W_START);
                  httpContext.ajax_rsp_assign_attri("", false, "A64TAS02_DATE_W_END", A64TAS02_DATE_W_END);
                  httpContext.ajax_rsp_assign_attri("", false, "A115TAS02_DEL_FLG", A115TAS02_DEL_FLG);
                  httpContext.ajax_rsp_assign_attri("", false, "A57TAS02_CRT_DATETIME", localUtil.ttoc( A57TAS02_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
                  httpContext.ajax_rsp_assign_attri("", false, "A83TAS02_CRT_USER_ID", A83TAS02_CRT_USER_ID);
                  httpContext.ajax_rsp_assign_attri("", false, "A59TAS02_CRT_PROG_NM", A59TAS02_CRT_PROG_NM);
                  httpContext.ajax_rsp_assign_attri("", false, "A60TAS02_UPD_DATETIME", localUtil.ttoc( A60TAS02_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
                  httpContext.ajax_rsp_assign_attri("", false, "A84TAS02_UPD_USER_ID", A84TAS02_UPD_USER_ID);
                  httpContext.ajax_rsp_assign_attri("", false, "A62TAS02_UPD_PROG_NM", A62TAS02_UPD_PROG_NM);
                  httpContext.ajax_rsp_assign_attri("", false, "A116TAS02_UPD_CNT", GXutil.ltrim( GXutil.str( A116TAS02_UPD_CNT, 10, 0)));
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound6 == 0 )
                     {
                        initAll066( ) ;
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
                     resetCaption060( ) ;
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
      sMode6 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel066( ) ;
      Gx_mode = sMode6 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls066( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV14Pgmname = "TAS02_GENG" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
      }
   }

   public void endLevel066( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete066( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "tas02_geng");
         if ( AnyError == 0 )
         {
            confirmValues060( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "tas02_geng");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart066( )
   {
      /* Using cursor T000611 */
      pr_default.execute(9);
      RcdFound6 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound6 = (short)(1) ;
         A22TAS02_GNGO_KBN = T000611_A22TAS02_GNGO_KBN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A22TAS02_GNGO_KBN", A22TAS02_GNGO_KBN);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext066( )
   {
      pr_default.readNext(9);
      RcdFound6 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound6 = (short)(1) ;
         A22TAS02_GNGO_KBN = T000611_A22TAS02_GNGO_KBN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A22TAS02_GNGO_KBN", A22TAS02_GNGO_KBN);
      }
   }

   public void scanEnd066( )
   {
      pr_default.close(9);
   }

   public void afterConfirm066( )
   {
      /* After Confirm Rules */
      if ( (GXutil.strcmp("", A22TAS02_GNGO_KBN)==0) )
      {
         httpContext.GX_msglist.addItem("元号区分を入力してください", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( 1 < GXutil.byteCount( A22TAS02_GNGO_KBN, "Shift-JIS") )
      {
         httpContext.GX_msglist.addItem("元号区分は半角1桁以内になるようにしてください。", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( (GXutil.strcmp("", A23TAS02_GNGO_NM)==0) )
      {
         httpContext.GX_msglist.addItem("元号名称を入力してください", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( 10 < GXutil.byteCount( A23TAS02_GNGO_NM, "Shift-JIS") )
      {
         httpContext.GX_msglist.addItem("元号名称は全角5桁又は半角10桁以内になるようにしてください。", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( 10 < GXutil.byteCount( A56TAS02_GNGO_RYAK_NM, "Shift-JIS") )
      {
         httpContext.GX_msglist.addItem("元号略称は全角5桁又は半角10桁以内になるようにしてください。", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( (0==A26TAS02_HNKAN_NEN) )
      {
         httpContext.GX_msglist.addItem("和暦変換用減算年数を入力してください", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( 4 < GXutil.byteCount( GXutil.ltrim( GXutil.str( A26TAS02_HNKAN_NEN, 4, 0)), "Shift-JIS") )
      {
         httpContext.GX_msglist.addItem("和暦変換用減算年数は半角4桁以内になるようにしてください。", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( (GXutil.strcmp("", A24TAS02_DATE_START)==0) )
      {
         httpContext.GX_msglist.addItem("開始年月日（西暦）を入力してください", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( 8 < GXutil.byteCount( A24TAS02_DATE_START, "Shift-JIS") )
      {
         httpContext.GX_msglist.addItem("開始年月日（西暦）は半角8桁以内になるようにしてください。", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( (GXutil.strcmp("", A25TAS02_DATE_END)==0) )
      {
         httpContext.GX_msglist.addItem("終了年月日（西暦）を入力してください", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( 8 < GXutil.byteCount( A25TAS02_DATE_END, "Shift-JIS") )
      {
         httpContext.GX_msglist.addItem("終了年月日（西暦）は半角8桁以内になるようにしてください。", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( 6 < GXutil.byteCount( A63TAS02_DATE_W_START, "Shift-JIS") )
      {
         httpContext.GX_msglist.addItem("開始年月日（和暦）は半角6桁以内になるようにしてください。", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( 6 < GXutil.byteCount( A64TAS02_DATE_W_END, "Shift-JIS") )
      {
         httpContext.GX_msglist.addItem("終了年月日（和暦）は半角6桁以内になるようにしてください。", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
   }

   public void beforeInsert066( )
   {
      /* Before Insert Rules */
      A57TAS02_CRT_DATETIME = GXutil.now( ) ;
      n57TAS02_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A57TAS02_CRT_DATETIME", localUtil.ttoc( A57TAS02_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char2 = A83TAS02_CRT_USER_ID ;
      GXv_char5[0] = GXt_char2 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char5) ;
      tas02_geng_impl.this.GXt_char2 = GXv_char5[0] ;
      A83TAS02_CRT_USER_ID = GXt_char2 ;
      n83TAS02_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A83TAS02_CRT_USER_ID", A83TAS02_CRT_USER_ID);
      A60TAS02_UPD_DATETIME = GXutil.now( ) ;
      n60TAS02_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A60TAS02_UPD_DATETIME", localUtil.ttoc( A60TAS02_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char2 = A84TAS02_UPD_USER_ID ;
      GXv_char5[0] = GXt_char2 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char5) ;
      tas02_geng_impl.this.GXt_char2 = GXv_char5[0] ;
      A84TAS02_UPD_USER_ID = GXt_char2 ;
      n84TAS02_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A84TAS02_UPD_USER_ID", A84TAS02_UPD_USER_ID);
      A116TAS02_UPD_CNT = (long)(O116TAS02_UPD_CNT+1) ;
      n116TAS02_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A116TAS02_UPD_CNT", GXutil.ltrim( GXutil.str( A116TAS02_UPD_CNT, 10, 0)));
   }

   public void beforeUpdate066( )
   {
      /* Before Update Rules */
      A60TAS02_UPD_DATETIME = GXutil.now( ) ;
      n60TAS02_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A60TAS02_UPD_DATETIME", localUtil.ttoc( A60TAS02_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char2 = A84TAS02_UPD_USER_ID ;
      GXv_char5[0] = GXt_char2 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char5) ;
      tas02_geng_impl.this.GXt_char2 = GXv_char5[0] ;
      A84TAS02_UPD_USER_ID = GXt_char2 ;
      n84TAS02_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A84TAS02_UPD_USER_ID", A84TAS02_UPD_USER_ID);
      A116TAS02_UPD_CNT = (long)(O116TAS02_UPD_CNT+1) ;
      n116TAS02_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A116TAS02_UPD_CNT", GXutil.ltrim( GXutil.str( A116TAS02_UPD_CNT, 10, 0)));
   }

   public void beforeDelete066( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete066( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate066( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes066( )
   {
      edtTAS02_GNGO_KBN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAS02_GNGO_KBN_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAS02_GNGO_KBN_Enabled, 5, 0)));
      edtTAS02_GNGO_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAS02_GNGO_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAS02_GNGO_NM_Enabled, 5, 0)));
      edtTAS02_GNGO_RYAK_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAS02_GNGO_RYAK_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAS02_GNGO_RYAK_NM_Enabled, 5, 0)));
      edtTAS02_HNKAN_NEN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAS02_HNKAN_NEN_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAS02_HNKAN_NEN_Enabled, 5, 0)));
      edtTAS02_DATE_START_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAS02_DATE_START_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAS02_DATE_START_Enabled, 5, 0)));
      edtTAS02_DATE_END_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAS02_DATE_END_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAS02_DATE_END_Enabled, 5, 0)));
      edtTAS02_DATE_W_START_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAS02_DATE_W_START_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAS02_DATE_W_START_Enabled, 5, 0)));
      edtTAS02_DATE_W_END_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAS02_DATE_W_END_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAS02_DATE_W_END_Enabled, 5, 0)));
      radTAS02_DEL_FLG.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, radTAS02_DEL_FLG.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( radTAS02_DEL_FLG.getEnabled(), 5, 0)));
      edtTAS02_CRT_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAS02_CRT_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAS02_CRT_DATETIME_Enabled, 5, 0)));
      edtTAS02_CRT_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAS02_CRT_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAS02_CRT_USER_ID_Enabled, 5, 0)));
      edtTAS02_CRT_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAS02_CRT_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAS02_CRT_PROG_NM_Enabled, 5, 0)));
      edtTAS02_UPD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAS02_UPD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAS02_UPD_DATETIME_Enabled, 5, 0)));
      edtTAS02_UPD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAS02_UPD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAS02_UPD_USER_ID_Enabled, 5, 0)));
      edtTAS02_UPD_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAS02_UPD_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAS02_UPD_PROG_NM_Enabled, 5, 0)));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues060( )
   {
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), "IE=EmulateIE7");
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeText( "和暦元号マスタ") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" onsubmit=\"try{return gx.csv.validForm()}catch(e){return true;}\" name=\"MAINFORM\" method=\"post\" action=\""+formatLink("tas02_geng") +"\" class=\""+"Form"+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
   }

   public void renderHtmlCloseForm066( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z22TAS02_GNGO_KBN", GXutil.rtrim( Z22TAS02_GNGO_KBN));
      GxWebStd.gx_hidden_field( httpContext, "Z57TAS02_CRT_DATETIME", localUtil.ttoc( Z57TAS02_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z83TAS02_CRT_USER_ID", GXutil.rtrim( Z83TAS02_CRT_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z60TAS02_UPD_DATETIME", localUtil.ttoc( Z60TAS02_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z84TAS02_UPD_USER_ID", GXutil.rtrim( Z84TAS02_UPD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z116TAS02_UPD_CNT", GXutil.ltrim( localUtil.ntoc( Z116TAS02_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z23TAS02_GNGO_NM", GXutil.rtrim( Z23TAS02_GNGO_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z56TAS02_GNGO_RYAK_NM", GXutil.rtrim( Z56TAS02_GNGO_RYAK_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z26TAS02_HNKAN_NEN", GXutil.ltrim( localUtil.ntoc( Z26TAS02_HNKAN_NEN, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z24TAS02_DATE_START", GXutil.rtrim( Z24TAS02_DATE_START));
      GxWebStd.gx_hidden_field( httpContext, "Z25TAS02_DATE_END", GXutil.rtrim( Z25TAS02_DATE_END));
      GxWebStd.gx_hidden_field( httpContext, "Z63TAS02_DATE_W_START", GXutil.rtrim( Z63TAS02_DATE_W_START));
      GxWebStd.gx_hidden_field( httpContext, "Z64TAS02_DATE_W_END", GXutil.rtrim( Z64TAS02_DATE_W_END));
      GxWebStd.gx_hidden_field( httpContext, "Z115TAS02_DEL_FLG", GXutil.rtrim( Z115TAS02_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z59TAS02_CRT_PROG_NM", GXutil.rtrim( Z59TAS02_CRT_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z62TAS02_UPD_PROG_NM", GXutil.rtrim( Z62TAS02_UPD_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "O116TAS02_UPD_CNT", GXutil.ltrim( localUtil.ntoc( O116TAS02_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      GxWebStd.gx_hidden_field( httpContext, "TAS02_UPD_CNT", GXutil.ltrim( localUtil.ntoc( A116TAS02_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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

   public void initializeNonKey066( )
   {
      A57TAS02_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n57TAS02_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A57TAS02_CRT_DATETIME", localUtil.ttoc( A57TAS02_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n57TAS02_CRT_DATETIME = (GXutil.nullDate().equals(A57TAS02_CRT_DATETIME) ? true : false) ;
      A83TAS02_CRT_USER_ID = "" ;
      n83TAS02_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A83TAS02_CRT_USER_ID", A83TAS02_CRT_USER_ID);
      n83TAS02_CRT_USER_ID = ((GXutil.strcmp("", A83TAS02_CRT_USER_ID)==0) ? true : false) ;
      A60TAS02_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n60TAS02_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A60TAS02_UPD_DATETIME", localUtil.ttoc( A60TAS02_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n60TAS02_UPD_DATETIME = (GXutil.nullDate().equals(A60TAS02_UPD_DATETIME) ? true : false) ;
      A84TAS02_UPD_USER_ID = "" ;
      n84TAS02_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A84TAS02_UPD_USER_ID", A84TAS02_UPD_USER_ID);
      n84TAS02_UPD_USER_ID = ((GXutil.strcmp("", A84TAS02_UPD_USER_ID)==0) ? true : false) ;
      A116TAS02_UPD_CNT = 0 ;
      n116TAS02_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A116TAS02_UPD_CNT", GXutil.ltrim( GXutil.str( A116TAS02_UPD_CNT, 10, 0)));
      A23TAS02_GNGO_NM = "" ;
      n23TAS02_GNGO_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A23TAS02_GNGO_NM", A23TAS02_GNGO_NM);
      n23TAS02_GNGO_NM = ((GXutil.strcmp("", A23TAS02_GNGO_NM)==0) ? true : false) ;
      A56TAS02_GNGO_RYAK_NM = "" ;
      n56TAS02_GNGO_RYAK_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A56TAS02_GNGO_RYAK_NM", A56TAS02_GNGO_RYAK_NM);
      n56TAS02_GNGO_RYAK_NM = ((GXutil.strcmp("", A56TAS02_GNGO_RYAK_NM)==0) ? true : false) ;
      A26TAS02_HNKAN_NEN = (short)(0) ;
      n26TAS02_HNKAN_NEN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A26TAS02_HNKAN_NEN", GXutil.ltrim( GXutil.str( A26TAS02_HNKAN_NEN, 4, 0)));
      n26TAS02_HNKAN_NEN = ((0==A26TAS02_HNKAN_NEN) ? true : false) ;
      A24TAS02_DATE_START = "" ;
      n24TAS02_DATE_START = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A24TAS02_DATE_START", A24TAS02_DATE_START);
      n24TAS02_DATE_START = ((GXutil.strcmp("", A24TAS02_DATE_START)==0) ? true : false) ;
      A25TAS02_DATE_END = "" ;
      n25TAS02_DATE_END = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A25TAS02_DATE_END", A25TAS02_DATE_END);
      n25TAS02_DATE_END = ((GXutil.strcmp("", A25TAS02_DATE_END)==0) ? true : false) ;
      A63TAS02_DATE_W_START = "" ;
      n63TAS02_DATE_W_START = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A63TAS02_DATE_W_START", A63TAS02_DATE_W_START);
      n63TAS02_DATE_W_START = ((GXutil.strcmp("", A63TAS02_DATE_W_START)==0) ? true : false) ;
      A64TAS02_DATE_W_END = "" ;
      n64TAS02_DATE_W_END = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A64TAS02_DATE_W_END", A64TAS02_DATE_W_END);
      n64TAS02_DATE_W_END = ((GXutil.strcmp("", A64TAS02_DATE_W_END)==0) ? true : false) ;
      A115TAS02_DEL_FLG = "0" ;
      n115TAS02_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A115TAS02_DEL_FLG", A115TAS02_DEL_FLG);
      A59TAS02_CRT_PROG_NM = AV14Pgmname ;
      n59TAS02_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A59TAS02_CRT_PROG_NM", A59TAS02_CRT_PROG_NM);
      A62TAS02_UPD_PROG_NM = AV14Pgmname ;
      n62TAS02_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A62TAS02_UPD_PROG_NM", A62TAS02_UPD_PROG_NM);
      O116TAS02_UPD_CNT = A116TAS02_UPD_CNT ;
      n116TAS02_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A116TAS02_UPD_CNT", GXutil.ltrim( GXutil.str( A116TAS02_UPD_CNT, 10, 0)));
   }

   public void initAll066( )
   {
      A22TAS02_GNGO_KBN = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A22TAS02_GNGO_KBN", A22TAS02_GNGO_KBN);
      initializeNonKey066( ) ;
   }

   public void standaloneModalInsert( )
   {
      A115TAS02_DEL_FLG = i115TAS02_DEL_FLG ;
      n115TAS02_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A115TAS02_DEL_FLG", A115TAS02_DEL_FLG);
      A59TAS02_CRT_PROG_NM = i59TAS02_CRT_PROG_NM ;
      n59TAS02_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A59TAS02_CRT_PROG_NM", A59TAS02_CRT_PROG_NM);
      A62TAS02_UPD_PROG_NM = i62TAS02_UPD_PROG_NM ;
      n62TAS02_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A62TAS02_UPD_PROG_NM", A62TAS02_UPD_PROG_NM);
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("calendar-system.css", "?225080");
      httpContext.AddThemeStyleSheetFile("", "Style2.css", "?14454892");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?14534939");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?58720");
      httpContext.AddJavascriptSource("tas02_geng.js", "?14534939");
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
      lblTextblocktas02_gngo_kbn_Internalname = "TEXTBLOCKTAS02_GNGO_KBN" ;
      edtTAS02_GNGO_KBN_Internalname = "TAS02_GNGO_KBN" ;
      imgImage20_Internalname = "IMAGE20" ;
      lblTextblocktas02_gngo_nm_Internalname = "TEXTBLOCKTAS02_GNGO_NM" ;
      edtTAS02_GNGO_NM_Internalname = "TAS02_GNGO_NM" ;
      lblTextblocktas02_gngo_ryak_nm_Internalname = "TEXTBLOCKTAS02_GNGO_RYAK_NM" ;
      edtTAS02_GNGO_RYAK_NM_Internalname = "TAS02_GNGO_RYAK_NM" ;
      imgImage21_Internalname = "IMAGE21" ;
      lblTextblocktas02_hnkan_nen_Internalname = "TEXTBLOCKTAS02_HNKAN_NEN" ;
      edtTAS02_HNKAN_NEN_Internalname = "TAS02_HNKAN_NEN" ;
      imgImage22_Internalname = "IMAGE22" ;
      lblTextblocktas02_date_start_Internalname = "TEXTBLOCKTAS02_DATE_START" ;
      edtTAS02_DATE_START_Internalname = "TAS02_DATE_START" ;
      imgImage23_Internalname = "IMAGE23" ;
      lblTextblocktas02_date_end_Internalname = "TEXTBLOCKTAS02_DATE_END" ;
      edtTAS02_DATE_END_Internalname = "TAS02_DATE_END" ;
      lblTextblocktas02_date_w_start_Internalname = "TEXTBLOCKTAS02_DATE_W_START" ;
      edtTAS02_DATE_W_START_Internalname = "TAS02_DATE_W_START" ;
      lblTextblocktas02_date_w_end_Internalname = "TEXTBLOCKTAS02_DATE_W_END" ;
      edtTAS02_DATE_W_END_Internalname = "TAS02_DATE_W_END" ;
      lblTextblocktas02_del_flg_Internalname = "TEXTBLOCKTAS02_DEL_FLG" ;
      radTAS02_DEL_FLG.setInternalname( "TAS02_DEL_FLG" );
      lblTextblocktas02_crt_datetime_Internalname = "TEXTBLOCKTAS02_CRT_DATETIME" ;
      edtTAS02_CRT_DATETIME_Internalname = "TAS02_CRT_DATETIME" ;
      lblTextblocktas02_crt_user_id_Internalname = "TEXTBLOCKTAS02_CRT_USER_ID" ;
      edtTAS02_CRT_USER_ID_Internalname = "TAS02_CRT_USER_ID" ;
      lblTextblocktas02_crt_prog_nm_Internalname = "TEXTBLOCKTAS02_CRT_PROG_NM" ;
      edtTAS02_CRT_PROG_NM_Internalname = "TAS02_CRT_PROG_NM" ;
      lblTextblocktas02_upd_datetime_Internalname = "TEXTBLOCKTAS02_UPD_DATETIME" ;
      edtTAS02_UPD_DATETIME_Internalname = "TAS02_UPD_DATETIME" ;
      lblTextblocktas02_upd_user_id_Internalname = "TEXTBLOCKTAS02_UPD_USER_ID" ;
      edtTAS02_UPD_USER_ID_Internalname = "TAS02_UPD_USER_ID" ;
      lblTextblocktas02_upd_prog_nm_Internalname = "TEXTBLOCKTAS02_UPD_PROG_NM" ;
      edtTAS02_UPD_PROG_NM_Internalname = "TAS02_UPD_PROG_NM" ;
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
      edtTAS02_UPD_PROG_NM_Jsonclick = "" ;
      edtTAS02_UPD_PROG_NM_Enabled = 0 ;
      edtTAS02_UPD_PROG_NM_Visible = 1 ;
      edtTAS02_UPD_USER_ID_Jsonclick = "" ;
      edtTAS02_UPD_USER_ID_Enabled = 0 ;
      edtTAS02_UPD_DATETIME_Jsonclick = "" ;
      edtTAS02_UPD_DATETIME_Enabled = 0 ;
      edtTAS02_UPD_DATETIME_Visible = 1 ;
      edtTAS02_CRT_PROG_NM_Jsonclick = "" ;
      edtTAS02_CRT_PROG_NM_Enabled = 0 ;
      edtTAS02_CRT_PROG_NM_Visible = 1 ;
      edtTAS02_CRT_USER_ID_Jsonclick = "" ;
      edtTAS02_CRT_USER_ID_Enabled = 0 ;
      edtTAS02_CRT_DATETIME_Jsonclick = "" ;
      edtTAS02_CRT_DATETIME_Enabled = 0 ;
      edtTAS02_CRT_DATETIME_Visible = 1 ;
      radTAS02_DEL_FLG.setJsonclick( "" );
      radTAS02_DEL_FLG.setEnabled( 1 );
      edtTAS02_DATE_W_END_Jsonclick = "" ;
      edtTAS02_DATE_W_END_Enabled = 1 ;
      edtTAS02_DATE_W_START_Jsonclick = "" ;
      edtTAS02_DATE_W_START_Enabled = 1 ;
      edtTAS02_DATE_END_Jsonclick = "" ;
      edtTAS02_DATE_END_Enabled = 1 ;
      imgImage23_Visible = 1 ;
      edtTAS02_DATE_START_Jsonclick = "" ;
      edtTAS02_DATE_START_Enabled = 1 ;
      imgImage22_Visible = 1 ;
      edtTAS02_HNKAN_NEN_Jsonclick = "" ;
      edtTAS02_HNKAN_NEN_Enabled = 1 ;
      imgImage21_Visible = 1 ;
      edtTAS02_GNGO_RYAK_NM_Jsonclick = "" ;
      edtTAS02_GNGO_RYAK_NM_Enabled = 1 ;
      edtTAS02_GNGO_NM_Jsonclick = "" ;
      edtTAS02_GNGO_NM_Enabled = 1 ;
      imgImage20_Visible = 1 ;
      edtTAS02_GNGO_KBN_Jsonclick = "" ;
      edtTAS02_GNGO_KBN_Enabled = 1 ;
      imgImage19_Visible = 1 ;
      lblBtn_cancel_Enabled = 1 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gx7asatas02_crt_user_id066( String Gx_mode )
   {
      GXt_char6 = A83TAS02_CRT_USER_ID ;
      GXv_char5[0] = GXt_char6 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char5) ;
      tas02_geng_impl.this.GXt_char6 = GXv_char5[0] ;
      A83TAS02_CRT_USER_ID = GXt_char6 ;
      n83TAS02_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A83TAS02_CRT_USER_ID", A83TAS02_CRT_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A83TAS02_CRT_USER_ID))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void gx9asatas02_upd_user_id066( String Gx_mode )
   {
      GXt_char6 = A84TAS02_UPD_USER_ID ;
      GXv_char5[0] = GXt_char6 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char5) ;
      tas02_geng_impl.this.GXt_char6 = GXv_char5[0] ;
      A84TAS02_UPD_USER_ID = GXt_char6 ;
      n84TAS02_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A84TAS02_UPD_USER_ID", A84TAS02_UPD_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A84TAS02_UPD_USER_ID))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void xc_33_066( String AV14Pgmname ,
                          String Gx_mode ,
                          String A22TAS02_GNGO_KBN ,
                          String A23TAS02_GNGO_NM ,
                          String A56TAS02_GNGO_RYAK_NM ,
                          short A26TAS02_HNKAN_NEN ,
                          String A24TAS02_DATE_START ,
                          String A25TAS02_DATE_END ,
                          String A63TAS02_DATE_W_START ,
                          String A64TAS02_DATE_W_END ,
                          String A115TAS02_DEL_FLG ,
                          java.util.Date A57TAS02_CRT_DATETIME ,
                          String A83TAS02_CRT_USER_ID ,
                          String A59TAS02_CRT_PROG_NM ,
                          java.util.Date A60TAS02_UPD_DATETIME ,
                          String A84TAS02_UPD_USER_ID ,
                          String A62TAS02_UPD_PROG_NM ,
                          long A116TAS02_UPD_CNT )
   {
      new tas02_pc01_datalog(remoteHandle, context).execute( AV14Pgmname, Gx_mode, A22TAS02_GNGO_KBN, A23TAS02_GNGO_NM, A56TAS02_GNGO_RYAK_NM, A26TAS02_HNKAN_NEN, A24TAS02_DATE_START, A25TAS02_DATE_END, A63TAS02_DATE_W_START, A64TAS02_DATE_W_END, A115TAS02_DEL_FLG, A57TAS02_CRT_DATETIME, A83TAS02_CRT_USER_ID, A59TAS02_CRT_PROG_NM, A60TAS02_UPD_DATETIME, A84TAS02_UPD_USER_ID, A62TAS02_UPD_PROG_NM, A116TAS02_UPD_CNT) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "A22TAS02_GNGO_KBN", A22TAS02_GNGO_KBN);
      httpContext.ajax_rsp_assign_attri("", false, "A23TAS02_GNGO_NM", A23TAS02_GNGO_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A56TAS02_GNGO_RYAK_NM", A56TAS02_GNGO_RYAK_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A26TAS02_HNKAN_NEN", GXutil.ltrim( GXutil.str( A26TAS02_HNKAN_NEN, 4, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "A24TAS02_DATE_START", A24TAS02_DATE_START);
      httpContext.ajax_rsp_assign_attri("", false, "A25TAS02_DATE_END", A25TAS02_DATE_END);
      httpContext.ajax_rsp_assign_attri("", false, "A63TAS02_DATE_W_START", A63TAS02_DATE_W_START);
      httpContext.ajax_rsp_assign_attri("", false, "A64TAS02_DATE_W_END", A64TAS02_DATE_W_END);
      httpContext.ajax_rsp_assign_attri("", false, "A115TAS02_DEL_FLG", A115TAS02_DEL_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "A57TAS02_CRT_DATETIME", localUtil.ttoc( A57TAS02_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A83TAS02_CRT_USER_ID", A83TAS02_CRT_USER_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A59TAS02_CRT_PROG_NM", A59TAS02_CRT_PROG_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A60TAS02_UPD_DATETIME", localUtil.ttoc( A60TAS02_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A84TAS02_UPD_USER_ID", A84TAS02_UPD_USER_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A62TAS02_UPD_PROG_NM", A62TAS02_UPD_PROG_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A116TAS02_UPD_CNT", GXutil.ltrim( GXutil.str( A116TAS02_UPD_CNT, 10, 0)));
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

   public void xc_34_066( String AV14Pgmname ,
                          String Gx_mode ,
                          String A22TAS02_GNGO_KBN ,
                          String A23TAS02_GNGO_NM ,
                          String A56TAS02_GNGO_RYAK_NM ,
                          short A26TAS02_HNKAN_NEN ,
                          String A24TAS02_DATE_START ,
                          String A25TAS02_DATE_END ,
                          String A63TAS02_DATE_W_START ,
                          String A64TAS02_DATE_W_END ,
                          String A115TAS02_DEL_FLG ,
                          java.util.Date A57TAS02_CRT_DATETIME ,
                          String A83TAS02_CRT_USER_ID ,
                          String A59TAS02_CRT_PROG_NM ,
                          java.util.Date A60TAS02_UPD_DATETIME ,
                          String A84TAS02_UPD_USER_ID ,
                          String A62TAS02_UPD_PROG_NM ,
                          long A116TAS02_UPD_CNT )
   {
      new tas02_pc01_datalog(remoteHandle, context).execute( AV14Pgmname, Gx_mode, A22TAS02_GNGO_KBN, A23TAS02_GNGO_NM, A56TAS02_GNGO_RYAK_NM, A26TAS02_HNKAN_NEN, A24TAS02_DATE_START, A25TAS02_DATE_END, A63TAS02_DATE_W_START, A64TAS02_DATE_W_END, A115TAS02_DEL_FLG, A57TAS02_CRT_DATETIME, A83TAS02_CRT_USER_ID, A59TAS02_CRT_PROG_NM, A60TAS02_UPD_DATETIME, A84TAS02_UPD_USER_ID, A62TAS02_UPD_PROG_NM, A116TAS02_UPD_CNT) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "A22TAS02_GNGO_KBN", A22TAS02_GNGO_KBN);
      httpContext.ajax_rsp_assign_attri("", false, "A23TAS02_GNGO_NM", A23TAS02_GNGO_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A56TAS02_GNGO_RYAK_NM", A56TAS02_GNGO_RYAK_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A26TAS02_HNKAN_NEN", GXutil.ltrim( GXutil.str( A26TAS02_HNKAN_NEN, 4, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "A24TAS02_DATE_START", A24TAS02_DATE_START);
      httpContext.ajax_rsp_assign_attri("", false, "A25TAS02_DATE_END", A25TAS02_DATE_END);
      httpContext.ajax_rsp_assign_attri("", false, "A63TAS02_DATE_W_START", A63TAS02_DATE_W_START);
      httpContext.ajax_rsp_assign_attri("", false, "A64TAS02_DATE_W_END", A64TAS02_DATE_W_END);
      httpContext.ajax_rsp_assign_attri("", false, "A115TAS02_DEL_FLG", A115TAS02_DEL_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "A57TAS02_CRT_DATETIME", localUtil.ttoc( A57TAS02_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A83TAS02_CRT_USER_ID", A83TAS02_CRT_USER_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A59TAS02_CRT_PROG_NM", A59TAS02_CRT_PROG_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A60TAS02_UPD_DATETIME", localUtil.ttoc( A60TAS02_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A84TAS02_UPD_USER_ID", A84TAS02_UPD_USER_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A62TAS02_UPD_PROG_NM", A62TAS02_UPD_PROG_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A116TAS02_UPD_CNT", GXutil.ltrim( GXutil.str( A116TAS02_UPD_CNT, 10, 0)));
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

   public void xc_35_066( String AV14Pgmname ,
                          String Gx_mode ,
                          String A22TAS02_GNGO_KBN ,
                          String A23TAS02_GNGO_NM ,
                          String A56TAS02_GNGO_RYAK_NM ,
                          short A26TAS02_HNKAN_NEN ,
                          String A24TAS02_DATE_START ,
                          String A25TAS02_DATE_END ,
                          String A63TAS02_DATE_W_START ,
                          String A64TAS02_DATE_W_END ,
                          String A115TAS02_DEL_FLG ,
                          java.util.Date A57TAS02_CRT_DATETIME ,
                          String A83TAS02_CRT_USER_ID ,
                          String A59TAS02_CRT_PROG_NM ,
                          java.util.Date A60TAS02_UPD_DATETIME ,
                          String A84TAS02_UPD_USER_ID ,
                          String A62TAS02_UPD_PROG_NM ,
                          long A116TAS02_UPD_CNT )
   {
      new tas02_pc01_datalog(remoteHandle, context).execute( AV14Pgmname, Gx_mode, A22TAS02_GNGO_KBN, A23TAS02_GNGO_NM, A56TAS02_GNGO_RYAK_NM, A26TAS02_HNKAN_NEN, A24TAS02_DATE_START, A25TAS02_DATE_END, A63TAS02_DATE_W_START, A64TAS02_DATE_W_END, A115TAS02_DEL_FLG, A57TAS02_CRT_DATETIME, A83TAS02_CRT_USER_ID, A59TAS02_CRT_PROG_NM, A60TAS02_UPD_DATETIME, A84TAS02_UPD_USER_ID, A62TAS02_UPD_PROG_NM, A116TAS02_UPD_CNT) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "A22TAS02_GNGO_KBN", A22TAS02_GNGO_KBN);
      httpContext.ajax_rsp_assign_attri("", false, "A23TAS02_GNGO_NM", A23TAS02_GNGO_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A56TAS02_GNGO_RYAK_NM", A56TAS02_GNGO_RYAK_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A26TAS02_HNKAN_NEN", GXutil.ltrim( GXutil.str( A26TAS02_HNKAN_NEN, 4, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "A24TAS02_DATE_START", A24TAS02_DATE_START);
      httpContext.ajax_rsp_assign_attri("", false, "A25TAS02_DATE_END", A25TAS02_DATE_END);
      httpContext.ajax_rsp_assign_attri("", false, "A63TAS02_DATE_W_START", A63TAS02_DATE_W_START);
      httpContext.ajax_rsp_assign_attri("", false, "A64TAS02_DATE_W_END", A64TAS02_DATE_W_END);
      httpContext.ajax_rsp_assign_attri("", false, "A115TAS02_DEL_FLG", A115TAS02_DEL_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "A57TAS02_CRT_DATETIME", localUtil.ttoc( A57TAS02_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A83TAS02_CRT_USER_ID", A83TAS02_CRT_USER_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A59TAS02_CRT_PROG_NM", A59TAS02_CRT_PROG_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A60TAS02_UPD_DATETIME", localUtil.ttoc( A60TAS02_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A84TAS02_UPD_USER_ID", A84TAS02_UPD_USER_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A62TAS02_UPD_PROG_NM", A62TAS02_UPD_PROG_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A116TAS02_UPD_CNT", GXutil.ltrim( GXutil.str( A116TAS02_UPD_CNT, 10, 0)));
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
      GX_FocusControl = edtTAS02_GNGO_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Tas02_gngo_kbn( String GX_Parm1 ,
                                     java.util.Date GX_Parm2 ,
                                     String GX_Parm3 ,
                                     java.util.Date GX_Parm4 ,
                                     String GX_Parm5 ,
                                     long GX_Parm6 ,
                                     String GX_Parm7 ,
                                     String GX_Parm8 ,
                                     short GX_Parm9 ,
                                     String GX_Parm10 ,
                                     String GX_Parm11 ,
                                     String GX_Parm12 ,
                                     String GX_Parm13 ,
                                     String GX_Parm14 ,
                                     String GX_Parm15 ,
                                     String GX_Parm16 )
   {
      A22TAS02_GNGO_KBN = GX_Parm1 ;
      A57TAS02_CRT_DATETIME = GX_Parm2 ;
      n57TAS02_CRT_DATETIME = false ;
      A83TAS02_CRT_USER_ID = GX_Parm3 ;
      n83TAS02_CRT_USER_ID = false ;
      A60TAS02_UPD_DATETIME = GX_Parm4 ;
      n60TAS02_UPD_DATETIME = false ;
      A84TAS02_UPD_USER_ID = GX_Parm5 ;
      n84TAS02_UPD_USER_ID = false ;
      A116TAS02_UPD_CNT = GX_Parm6 ;
      n116TAS02_UPD_CNT = false ;
      A23TAS02_GNGO_NM = GX_Parm7 ;
      n23TAS02_GNGO_NM = false ;
      A56TAS02_GNGO_RYAK_NM = GX_Parm8 ;
      n56TAS02_GNGO_RYAK_NM = false ;
      A26TAS02_HNKAN_NEN = GX_Parm9 ;
      n26TAS02_HNKAN_NEN = false ;
      A24TAS02_DATE_START = GX_Parm10 ;
      n24TAS02_DATE_START = false ;
      A25TAS02_DATE_END = GX_Parm11 ;
      n25TAS02_DATE_END = false ;
      A63TAS02_DATE_W_START = GX_Parm12 ;
      n63TAS02_DATE_W_START = false ;
      A64TAS02_DATE_W_END = GX_Parm13 ;
      n64TAS02_DATE_W_END = false ;
      A115TAS02_DEL_FLG = GX_Parm14 ;
      n115TAS02_DEL_FLG = false ;
      A59TAS02_CRT_PROG_NM = GX_Parm15 ;
      n59TAS02_CRT_PROG_NM = false ;
      A62TAS02_UPD_PROG_NM = GX_Parm16 ;
      n62TAS02_UPD_PROG_NM = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(localUtil.format(A57TAS02_CRT_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A83TAS02_CRT_USER_ID));
      isValidOutput.add(localUtil.format(A60TAS02_UPD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A84TAS02_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A116TAS02_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A23TAS02_GNGO_NM));
      isValidOutput.add(GXutil.rtrim( A56TAS02_GNGO_RYAK_NM));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A26TAS02_HNKAN_NEN, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A24TAS02_DATE_START));
      isValidOutput.add(GXutil.rtrim( A25TAS02_DATE_END));
      isValidOutput.add(GXutil.rtrim( A63TAS02_DATE_W_START));
      isValidOutput.add(GXutil.rtrim( A64TAS02_DATE_W_END));
      isValidOutput.add(GXutil.rtrim( A115TAS02_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( A59TAS02_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( A62TAS02_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( AV14Pgmname));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.rtrim( Z22TAS02_GNGO_KBN));
      isValidOutput.add(localUtil.ttoc( Z57TAS02_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z83TAS02_CRT_USER_ID));
      isValidOutput.add(localUtil.ttoc( Z60TAS02_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z84TAS02_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z116TAS02_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z23TAS02_GNGO_NM));
      isValidOutput.add(GXutil.rtrim( Z56TAS02_GNGO_RYAK_NM));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z26TAS02_HNKAN_NEN, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z24TAS02_DATE_START));
      isValidOutput.add(GXutil.rtrim( Z25TAS02_DATE_END));
      isValidOutput.add(GXutil.rtrim( Z63TAS02_DATE_W_START));
      isValidOutput.add(GXutil.rtrim( Z64TAS02_DATE_W_END));
      isValidOutput.add(GXutil.rtrim( Z115TAS02_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( Z59TAS02_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( Z62TAS02_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( ZV14Pgmname));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( O116TAS02_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(edtTAS02_GNGO_KBN_Enabled);
      isValidOutput.add(edtTAS02_CRT_DATETIME_Visible);
      isValidOutput.add(edtTAS02_CRT_PROG_NM_Visible);
      isValidOutput.add(edtTAS02_UPD_DATETIME_Visible);
      isValidOutput.add(edtTAS02_UPD_PROG_NM_Visible);
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
      A22TAS02_GNGO_KBN = "" ;
      A23TAS02_GNGO_NM = "" ;
      A56TAS02_GNGO_RYAK_NM = "" ;
      A24TAS02_DATE_START = "" ;
      A25TAS02_DATE_END = "" ;
      A63TAS02_DATE_W_START = "" ;
      A64TAS02_DATE_W_END = "" ;
      A115TAS02_DEL_FLG = "" ;
      A57TAS02_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A83TAS02_CRT_USER_ID = "" ;
      A59TAS02_CRT_PROG_NM = "" ;
      A60TAS02_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A84TAS02_UPD_USER_ID = "" ;
      A62TAS02_UPD_PROG_NM = "" ;
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
      lblTextblocktas02_gngo_kbn_Jsonclick = "" ;
      TempTags = "" ;
      lblTextblocktas02_gngo_nm_Jsonclick = "" ;
      lblTextblocktas02_gngo_ryak_nm_Jsonclick = "" ;
      lblTextblocktas02_hnkan_nen_Jsonclick = "" ;
      lblTextblocktas02_date_start_Jsonclick = "" ;
      lblTextblocktas02_date_end_Jsonclick = "" ;
      lblTextblocktas02_date_w_start_Jsonclick = "" ;
      lblTextblocktas02_date_w_end_Jsonclick = "" ;
      lblTextblocktas02_del_flg_Jsonclick = "" ;
      lblTextblocktas02_crt_datetime_Jsonclick = "" ;
      lblTextblocktas02_crt_user_id_Jsonclick = "" ;
      lblTextblocktas02_crt_prog_nm_Jsonclick = "" ;
      lblTextblocktas02_upd_datetime_Jsonclick = "" ;
      lblTextblocktas02_upd_user_id_Jsonclick = "" ;
      lblTextblocktas02_upd_prog_nm_Jsonclick = "" ;
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
      Z22TAS02_GNGO_KBN = "" ;
      Z57TAS02_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z83TAS02_CRT_USER_ID = "" ;
      Z60TAS02_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z84TAS02_UPD_USER_ID = "" ;
      Z23TAS02_GNGO_NM = "" ;
      Z56TAS02_GNGO_RYAK_NM = "" ;
      Z24TAS02_DATE_START = "" ;
      Z25TAS02_DATE_END = "" ;
      Z63TAS02_DATE_W_START = "" ;
      Z64TAS02_DATE_W_END = "" ;
      Z115TAS02_DEL_FLG = "" ;
      Z59TAS02_CRT_PROG_NM = "" ;
      Z62TAS02_UPD_PROG_NM = "" ;
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
      T00064_A22TAS02_GNGO_KBN = new String[] {""} ;
      T00064_A57TAS02_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00064_n57TAS02_CRT_DATETIME = new boolean[] {false} ;
      T00064_A83TAS02_CRT_USER_ID = new String[] {""} ;
      T00064_n83TAS02_CRT_USER_ID = new boolean[] {false} ;
      T00064_A60TAS02_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00064_n60TAS02_UPD_DATETIME = new boolean[] {false} ;
      T00064_A84TAS02_UPD_USER_ID = new String[] {""} ;
      T00064_n84TAS02_UPD_USER_ID = new boolean[] {false} ;
      T00064_A116TAS02_UPD_CNT = new long[1] ;
      T00064_n116TAS02_UPD_CNT = new boolean[] {false} ;
      T00064_A23TAS02_GNGO_NM = new String[] {""} ;
      T00064_n23TAS02_GNGO_NM = new boolean[] {false} ;
      T00064_A56TAS02_GNGO_RYAK_NM = new String[] {""} ;
      T00064_n56TAS02_GNGO_RYAK_NM = new boolean[] {false} ;
      T00064_A26TAS02_HNKAN_NEN = new short[1] ;
      T00064_n26TAS02_HNKAN_NEN = new boolean[] {false} ;
      T00064_A24TAS02_DATE_START = new String[] {""} ;
      T00064_n24TAS02_DATE_START = new boolean[] {false} ;
      T00064_A25TAS02_DATE_END = new String[] {""} ;
      T00064_n25TAS02_DATE_END = new boolean[] {false} ;
      T00064_A63TAS02_DATE_W_START = new String[] {""} ;
      T00064_n63TAS02_DATE_W_START = new boolean[] {false} ;
      T00064_A64TAS02_DATE_W_END = new String[] {""} ;
      T00064_n64TAS02_DATE_W_END = new boolean[] {false} ;
      T00064_A115TAS02_DEL_FLG = new String[] {""} ;
      T00064_n115TAS02_DEL_FLG = new boolean[] {false} ;
      T00064_A59TAS02_CRT_PROG_NM = new String[] {""} ;
      T00064_n59TAS02_CRT_PROG_NM = new boolean[] {false} ;
      T00064_A62TAS02_UPD_PROG_NM = new String[] {""} ;
      T00064_n62TAS02_UPD_PROG_NM = new boolean[] {false} ;
      T00065_A22TAS02_GNGO_KBN = new String[] {""} ;
      T00063_A22TAS02_GNGO_KBN = new String[] {""} ;
      T00063_A57TAS02_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00063_n57TAS02_CRT_DATETIME = new boolean[] {false} ;
      T00063_A83TAS02_CRT_USER_ID = new String[] {""} ;
      T00063_n83TAS02_CRT_USER_ID = new boolean[] {false} ;
      T00063_A60TAS02_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00063_n60TAS02_UPD_DATETIME = new boolean[] {false} ;
      T00063_A84TAS02_UPD_USER_ID = new String[] {""} ;
      T00063_n84TAS02_UPD_USER_ID = new boolean[] {false} ;
      T00063_A116TAS02_UPD_CNT = new long[1] ;
      T00063_n116TAS02_UPD_CNT = new boolean[] {false} ;
      T00063_A23TAS02_GNGO_NM = new String[] {""} ;
      T00063_n23TAS02_GNGO_NM = new boolean[] {false} ;
      T00063_A56TAS02_GNGO_RYAK_NM = new String[] {""} ;
      T00063_n56TAS02_GNGO_RYAK_NM = new boolean[] {false} ;
      T00063_A26TAS02_HNKAN_NEN = new short[1] ;
      T00063_n26TAS02_HNKAN_NEN = new boolean[] {false} ;
      T00063_A24TAS02_DATE_START = new String[] {""} ;
      T00063_n24TAS02_DATE_START = new boolean[] {false} ;
      T00063_A25TAS02_DATE_END = new String[] {""} ;
      T00063_n25TAS02_DATE_END = new boolean[] {false} ;
      T00063_A63TAS02_DATE_W_START = new String[] {""} ;
      T00063_n63TAS02_DATE_W_START = new boolean[] {false} ;
      T00063_A64TAS02_DATE_W_END = new String[] {""} ;
      T00063_n64TAS02_DATE_W_END = new boolean[] {false} ;
      T00063_A115TAS02_DEL_FLG = new String[] {""} ;
      T00063_n115TAS02_DEL_FLG = new boolean[] {false} ;
      T00063_A59TAS02_CRT_PROG_NM = new String[] {""} ;
      T00063_n59TAS02_CRT_PROG_NM = new boolean[] {false} ;
      T00063_A62TAS02_UPD_PROG_NM = new String[] {""} ;
      T00063_n62TAS02_UPD_PROG_NM = new boolean[] {false} ;
      sMode6 = "" ;
      T00066_A22TAS02_GNGO_KBN = new String[] {""} ;
      T00067_A22TAS02_GNGO_KBN = new String[] {""} ;
      T00062_A22TAS02_GNGO_KBN = new String[] {""} ;
      T00062_A57TAS02_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00062_n57TAS02_CRT_DATETIME = new boolean[] {false} ;
      T00062_A83TAS02_CRT_USER_ID = new String[] {""} ;
      T00062_n83TAS02_CRT_USER_ID = new boolean[] {false} ;
      T00062_A60TAS02_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00062_n60TAS02_UPD_DATETIME = new boolean[] {false} ;
      T00062_A84TAS02_UPD_USER_ID = new String[] {""} ;
      T00062_n84TAS02_UPD_USER_ID = new boolean[] {false} ;
      T00062_A116TAS02_UPD_CNT = new long[1] ;
      T00062_n116TAS02_UPD_CNT = new boolean[] {false} ;
      T00062_A23TAS02_GNGO_NM = new String[] {""} ;
      T00062_n23TAS02_GNGO_NM = new boolean[] {false} ;
      T00062_A56TAS02_GNGO_RYAK_NM = new String[] {""} ;
      T00062_n56TAS02_GNGO_RYAK_NM = new boolean[] {false} ;
      T00062_A26TAS02_HNKAN_NEN = new short[1] ;
      T00062_n26TAS02_HNKAN_NEN = new boolean[] {false} ;
      T00062_A24TAS02_DATE_START = new String[] {""} ;
      T00062_n24TAS02_DATE_START = new boolean[] {false} ;
      T00062_A25TAS02_DATE_END = new String[] {""} ;
      T00062_n25TAS02_DATE_END = new boolean[] {false} ;
      T00062_A63TAS02_DATE_W_START = new String[] {""} ;
      T00062_n63TAS02_DATE_W_START = new boolean[] {false} ;
      T00062_A64TAS02_DATE_W_END = new String[] {""} ;
      T00062_n64TAS02_DATE_W_END = new boolean[] {false} ;
      T00062_A115TAS02_DEL_FLG = new String[] {""} ;
      T00062_n115TAS02_DEL_FLG = new boolean[] {false} ;
      T00062_A59TAS02_CRT_PROG_NM = new String[] {""} ;
      T00062_n59TAS02_CRT_PROG_NM = new boolean[] {false} ;
      T00062_A62TAS02_UPD_PROG_NM = new String[] {""} ;
      T00062_n62TAS02_UPD_PROG_NM = new boolean[] {false} ;
      T000611_A22TAS02_GNGO_KBN = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      GXt_char2 = "" ;
      GXt_char1 = "" ;
      i115TAS02_DEL_FLG = "" ;
      i59TAS02_CRT_PROG_NM = "" ;
      i62TAS02_UPD_PROG_NM = "" ;
      GXv_char5 = new String [1] ;
      GXt_char6 = "" ;
      ZV14Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tas02_geng__default(),
         new Object[] {
             new Object[] {
            T00062_A22TAS02_GNGO_KBN, T00062_A57TAS02_CRT_DATETIME, T00062_n57TAS02_CRT_DATETIME, T00062_A83TAS02_CRT_USER_ID, T00062_n83TAS02_CRT_USER_ID, T00062_A60TAS02_UPD_DATETIME, T00062_n60TAS02_UPD_DATETIME, T00062_A84TAS02_UPD_USER_ID, T00062_n84TAS02_UPD_USER_ID, T00062_A116TAS02_UPD_CNT,
            T00062_n116TAS02_UPD_CNT, T00062_A23TAS02_GNGO_NM, T00062_n23TAS02_GNGO_NM, T00062_A56TAS02_GNGO_RYAK_NM, T00062_n56TAS02_GNGO_RYAK_NM, T00062_A26TAS02_HNKAN_NEN, T00062_n26TAS02_HNKAN_NEN, T00062_A24TAS02_DATE_START, T00062_n24TAS02_DATE_START, T00062_A25TAS02_DATE_END,
            T00062_n25TAS02_DATE_END, T00062_A63TAS02_DATE_W_START, T00062_n63TAS02_DATE_W_START, T00062_A64TAS02_DATE_W_END, T00062_n64TAS02_DATE_W_END, T00062_A115TAS02_DEL_FLG, T00062_n115TAS02_DEL_FLG, T00062_A59TAS02_CRT_PROG_NM, T00062_n59TAS02_CRT_PROG_NM, T00062_A62TAS02_UPD_PROG_NM,
            T00062_n62TAS02_UPD_PROG_NM
            }
            , new Object[] {
            T00063_A22TAS02_GNGO_KBN, T00063_A57TAS02_CRT_DATETIME, T00063_n57TAS02_CRT_DATETIME, T00063_A83TAS02_CRT_USER_ID, T00063_n83TAS02_CRT_USER_ID, T00063_A60TAS02_UPD_DATETIME, T00063_n60TAS02_UPD_DATETIME, T00063_A84TAS02_UPD_USER_ID, T00063_n84TAS02_UPD_USER_ID, T00063_A116TAS02_UPD_CNT,
            T00063_n116TAS02_UPD_CNT, T00063_A23TAS02_GNGO_NM, T00063_n23TAS02_GNGO_NM, T00063_A56TAS02_GNGO_RYAK_NM, T00063_n56TAS02_GNGO_RYAK_NM, T00063_A26TAS02_HNKAN_NEN, T00063_n26TAS02_HNKAN_NEN, T00063_A24TAS02_DATE_START, T00063_n24TAS02_DATE_START, T00063_A25TAS02_DATE_END,
            T00063_n25TAS02_DATE_END, T00063_A63TAS02_DATE_W_START, T00063_n63TAS02_DATE_W_START, T00063_A64TAS02_DATE_W_END, T00063_n64TAS02_DATE_W_END, T00063_A115TAS02_DEL_FLG, T00063_n115TAS02_DEL_FLG, T00063_A59TAS02_CRT_PROG_NM, T00063_n59TAS02_CRT_PROG_NM, T00063_A62TAS02_UPD_PROG_NM,
            T00063_n62TAS02_UPD_PROG_NM
            }
            , new Object[] {
            T00064_A22TAS02_GNGO_KBN, T00064_A57TAS02_CRT_DATETIME, T00064_n57TAS02_CRT_DATETIME, T00064_A83TAS02_CRT_USER_ID, T00064_n83TAS02_CRT_USER_ID, T00064_A60TAS02_UPD_DATETIME, T00064_n60TAS02_UPD_DATETIME, T00064_A84TAS02_UPD_USER_ID, T00064_n84TAS02_UPD_USER_ID, T00064_A116TAS02_UPD_CNT,
            T00064_n116TAS02_UPD_CNT, T00064_A23TAS02_GNGO_NM, T00064_n23TAS02_GNGO_NM, T00064_A56TAS02_GNGO_RYAK_NM, T00064_n56TAS02_GNGO_RYAK_NM, T00064_A26TAS02_HNKAN_NEN, T00064_n26TAS02_HNKAN_NEN, T00064_A24TAS02_DATE_START, T00064_n24TAS02_DATE_START, T00064_A25TAS02_DATE_END,
            T00064_n25TAS02_DATE_END, T00064_A63TAS02_DATE_W_START, T00064_n63TAS02_DATE_W_START, T00064_A64TAS02_DATE_W_END, T00064_n64TAS02_DATE_W_END, T00064_A115TAS02_DEL_FLG, T00064_n115TAS02_DEL_FLG, T00064_A59TAS02_CRT_PROG_NM, T00064_n59TAS02_CRT_PROG_NM, T00064_A62TAS02_UPD_PROG_NM,
            T00064_n62TAS02_UPD_PROG_NM
            }
            , new Object[] {
            T00065_A22TAS02_GNGO_KBN
            }
            , new Object[] {
            T00066_A22TAS02_GNGO_KBN
            }
            , new Object[] {
            T00067_A22TAS02_GNGO_KBN
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000611_A22TAS02_GNGO_KBN
            }
         }
      );
      pr_default.setErrorHandler(this);
      Z62TAS02_UPD_PROG_NM = AV14Pgmname ;
      n62TAS02_UPD_PROG_NM = false ;
      Z59TAS02_CRT_PROG_NM = AV14Pgmname ;
      n59TAS02_CRT_PROG_NM = false ;
      AV14Pgmname = "TAS02_GENG" ;
      Z115TAS02_DEL_FLG = "0" ;
      n115TAS02_DEL_FLG = false ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short A26TAS02_HNKAN_NEN ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short Z26TAS02_HNKAN_NEN ;
   private short RcdFound6 ;
   private short Gx_err ;
   private int trnEnded ;
   private int lblBtn_cancel_Enabled ;
   private int imgImage19_Visible ;
   private int edtTAS02_GNGO_KBN_Enabled ;
   private int imgImage20_Visible ;
   private int edtTAS02_GNGO_NM_Enabled ;
   private int edtTAS02_GNGO_RYAK_NM_Enabled ;
   private int imgImage21_Visible ;
   private int edtTAS02_HNKAN_NEN_Enabled ;
   private int imgImage22_Visible ;
   private int edtTAS02_DATE_START_Enabled ;
   private int imgImage23_Visible ;
   private int edtTAS02_DATE_END_Enabled ;
   private int edtTAS02_DATE_W_START_Enabled ;
   private int edtTAS02_DATE_W_END_Enabled ;
   private int edtTAS02_CRT_DATETIME_Visible ;
   private int edtTAS02_CRT_DATETIME_Enabled ;
   private int edtTAS02_CRT_USER_ID_Enabled ;
   private int edtTAS02_CRT_PROG_NM_Visible ;
   private int edtTAS02_CRT_PROG_NM_Enabled ;
   private int edtTAS02_UPD_DATETIME_Visible ;
   private int edtTAS02_UPD_DATETIME_Enabled ;
   private int edtTAS02_UPD_USER_ID_Enabled ;
   private int edtTAS02_UPD_PROG_NM_Visible ;
   private int edtTAS02_UPD_PROG_NM_Enabled ;
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
   private long A116TAS02_UPD_CNT ;
   private long Z116TAS02_UPD_CNT ;
   private long O116TAS02_UPD_CNT ;
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
   private String edtTAS02_GNGO_KBN_Internalname ;
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
   private String lblTextblocktas02_gngo_kbn_Internalname ;
   private String lblTextblocktas02_gngo_kbn_Jsonclick ;
   private String TempTags ;
   private String edtTAS02_GNGO_KBN_Jsonclick ;
   private String imgImage20_Internalname ;
   private String lblTextblocktas02_gngo_nm_Internalname ;
   private String lblTextblocktas02_gngo_nm_Jsonclick ;
   private String edtTAS02_GNGO_NM_Internalname ;
   private String edtTAS02_GNGO_NM_Jsonclick ;
   private String lblTextblocktas02_gngo_ryak_nm_Internalname ;
   private String lblTextblocktas02_gngo_ryak_nm_Jsonclick ;
   private String edtTAS02_GNGO_RYAK_NM_Internalname ;
   private String edtTAS02_GNGO_RYAK_NM_Jsonclick ;
   private String imgImage21_Internalname ;
   private String lblTextblocktas02_hnkan_nen_Internalname ;
   private String lblTextblocktas02_hnkan_nen_Jsonclick ;
   private String edtTAS02_HNKAN_NEN_Internalname ;
   private String edtTAS02_HNKAN_NEN_Jsonclick ;
   private String imgImage22_Internalname ;
   private String lblTextblocktas02_date_start_Internalname ;
   private String lblTextblocktas02_date_start_Jsonclick ;
   private String edtTAS02_DATE_START_Internalname ;
   private String edtTAS02_DATE_START_Jsonclick ;
   private String imgImage23_Internalname ;
   private String lblTextblocktas02_date_end_Internalname ;
   private String lblTextblocktas02_date_end_Jsonclick ;
   private String edtTAS02_DATE_END_Internalname ;
   private String edtTAS02_DATE_END_Jsonclick ;
   private String lblTextblocktas02_date_w_start_Internalname ;
   private String lblTextblocktas02_date_w_start_Jsonclick ;
   private String edtTAS02_DATE_W_START_Internalname ;
   private String edtTAS02_DATE_W_START_Jsonclick ;
   private String lblTextblocktas02_date_w_end_Internalname ;
   private String lblTextblocktas02_date_w_end_Jsonclick ;
   private String edtTAS02_DATE_W_END_Internalname ;
   private String edtTAS02_DATE_W_END_Jsonclick ;
   private String lblTextblocktas02_del_flg_Internalname ;
   private String lblTextblocktas02_del_flg_Jsonclick ;
   private String lblTextblocktas02_crt_datetime_Internalname ;
   private String lblTextblocktas02_crt_datetime_Jsonclick ;
   private String edtTAS02_CRT_DATETIME_Internalname ;
   private String edtTAS02_CRT_DATETIME_Jsonclick ;
   private String lblTextblocktas02_crt_user_id_Internalname ;
   private String lblTextblocktas02_crt_user_id_Jsonclick ;
   private String edtTAS02_CRT_USER_ID_Internalname ;
   private String edtTAS02_CRT_USER_ID_Jsonclick ;
   private String lblTextblocktas02_crt_prog_nm_Internalname ;
   private String lblTextblocktas02_crt_prog_nm_Jsonclick ;
   private String edtTAS02_CRT_PROG_NM_Internalname ;
   private String edtTAS02_CRT_PROG_NM_Jsonclick ;
   private String lblTextblocktas02_upd_datetime_Internalname ;
   private String lblTextblocktas02_upd_datetime_Jsonclick ;
   private String edtTAS02_UPD_DATETIME_Internalname ;
   private String edtTAS02_UPD_DATETIME_Jsonclick ;
   private String lblTextblocktas02_upd_user_id_Internalname ;
   private String lblTextblocktas02_upd_user_id_Jsonclick ;
   private String edtTAS02_UPD_USER_ID_Internalname ;
   private String edtTAS02_UPD_USER_ID_Jsonclick ;
   private String lblTextblocktas02_upd_prog_nm_Internalname ;
   private String lblTextblocktas02_upd_prog_nm_Jsonclick ;
   private String edtTAS02_UPD_PROG_NM_Internalname ;
   private String edtTAS02_UPD_PROG_NM_Jsonclick ;
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
   private String sMode6 ;
   private String sDynURL ;
   private String FormProcess ;
   private String GXt_char2 ;
   private String GXt_char1 ;
   private String GXv_char5[] ;
   private String GXt_char6 ;
   private String ZV14Pgmname ;
   private String Gx_emsg ;
   private java.util.Date A57TAS02_CRT_DATETIME ;
   private java.util.Date A60TAS02_UPD_DATETIME ;
   private java.util.Date Z57TAS02_CRT_DATETIME ;
   private java.util.Date Z60TAS02_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean n23TAS02_GNGO_NM ;
   private boolean n56TAS02_GNGO_RYAK_NM ;
   private boolean n26TAS02_HNKAN_NEN ;
   private boolean n24TAS02_DATE_START ;
   private boolean n25TAS02_DATE_END ;
   private boolean n63TAS02_DATE_W_START ;
   private boolean n64TAS02_DATE_W_END ;
   private boolean n115TAS02_DEL_FLG ;
   private boolean n57TAS02_CRT_DATETIME ;
   private boolean n83TAS02_CRT_USER_ID ;
   private boolean n59TAS02_CRT_PROG_NM ;
   private boolean n60TAS02_UPD_DATETIME ;
   private boolean n84TAS02_UPD_USER_ID ;
   private boolean n62TAS02_UPD_PROG_NM ;
   private boolean n116TAS02_UPD_CNT ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String A22TAS02_GNGO_KBN ;
   private String A23TAS02_GNGO_NM ;
   private String A56TAS02_GNGO_RYAK_NM ;
   private String A24TAS02_DATE_START ;
   private String A25TAS02_DATE_END ;
   private String A63TAS02_DATE_W_START ;
   private String A64TAS02_DATE_W_END ;
   private String A115TAS02_DEL_FLG ;
   private String A83TAS02_CRT_USER_ID ;
   private String A59TAS02_CRT_PROG_NM ;
   private String A84TAS02_UPD_USER_ID ;
   private String A62TAS02_UPD_PROG_NM ;
   private String Z22TAS02_GNGO_KBN ;
   private String Z83TAS02_CRT_USER_ID ;
   private String Z84TAS02_UPD_USER_ID ;
   private String Z23TAS02_GNGO_NM ;
   private String Z56TAS02_GNGO_RYAK_NM ;
   private String Z24TAS02_DATE_START ;
   private String Z25TAS02_DATE_END ;
   private String Z63TAS02_DATE_W_START ;
   private String Z64TAS02_DATE_W_END ;
   private String Z115TAS02_DEL_FLG ;
   private String Z59TAS02_CRT_PROG_NM ;
   private String Z62TAS02_UPD_PROG_NM ;
   private String AV7C_TAM02_APP_ID ;
   private String AV9W_ERRCD ;
   private String AV12W_MSG ;
   private String AV10W_KNGN_FLG ;
   private String i115TAS02_DEL_FLG ;
   private String i59TAS02_CRT_PROG_NM ;
   private String i62TAS02_UPD_PROG_NM ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private HTMLChoice radTAS02_DEL_FLG ;
   private IDataStoreProvider pr_default ;
   private String[] T00064_A22TAS02_GNGO_KBN ;
   private java.util.Date[] T00064_A57TAS02_CRT_DATETIME ;
   private boolean[] T00064_n57TAS02_CRT_DATETIME ;
   private String[] T00064_A83TAS02_CRT_USER_ID ;
   private boolean[] T00064_n83TAS02_CRT_USER_ID ;
   private java.util.Date[] T00064_A60TAS02_UPD_DATETIME ;
   private boolean[] T00064_n60TAS02_UPD_DATETIME ;
   private String[] T00064_A84TAS02_UPD_USER_ID ;
   private boolean[] T00064_n84TAS02_UPD_USER_ID ;
   private long[] T00064_A116TAS02_UPD_CNT ;
   private boolean[] T00064_n116TAS02_UPD_CNT ;
   private String[] T00064_A23TAS02_GNGO_NM ;
   private boolean[] T00064_n23TAS02_GNGO_NM ;
   private String[] T00064_A56TAS02_GNGO_RYAK_NM ;
   private boolean[] T00064_n56TAS02_GNGO_RYAK_NM ;
   private short[] T00064_A26TAS02_HNKAN_NEN ;
   private boolean[] T00064_n26TAS02_HNKAN_NEN ;
   private String[] T00064_A24TAS02_DATE_START ;
   private boolean[] T00064_n24TAS02_DATE_START ;
   private String[] T00064_A25TAS02_DATE_END ;
   private boolean[] T00064_n25TAS02_DATE_END ;
   private String[] T00064_A63TAS02_DATE_W_START ;
   private boolean[] T00064_n63TAS02_DATE_W_START ;
   private String[] T00064_A64TAS02_DATE_W_END ;
   private boolean[] T00064_n64TAS02_DATE_W_END ;
   private String[] T00064_A115TAS02_DEL_FLG ;
   private boolean[] T00064_n115TAS02_DEL_FLG ;
   private String[] T00064_A59TAS02_CRT_PROG_NM ;
   private boolean[] T00064_n59TAS02_CRT_PROG_NM ;
   private String[] T00064_A62TAS02_UPD_PROG_NM ;
   private boolean[] T00064_n62TAS02_UPD_PROG_NM ;
   private String[] T00065_A22TAS02_GNGO_KBN ;
   private String[] T00063_A22TAS02_GNGO_KBN ;
   private java.util.Date[] T00063_A57TAS02_CRT_DATETIME ;
   private boolean[] T00063_n57TAS02_CRT_DATETIME ;
   private String[] T00063_A83TAS02_CRT_USER_ID ;
   private boolean[] T00063_n83TAS02_CRT_USER_ID ;
   private java.util.Date[] T00063_A60TAS02_UPD_DATETIME ;
   private boolean[] T00063_n60TAS02_UPD_DATETIME ;
   private String[] T00063_A84TAS02_UPD_USER_ID ;
   private boolean[] T00063_n84TAS02_UPD_USER_ID ;
   private long[] T00063_A116TAS02_UPD_CNT ;
   private boolean[] T00063_n116TAS02_UPD_CNT ;
   private String[] T00063_A23TAS02_GNGO_NM ;
   private boolean[] T00063_n23TAS02_GNGO_NM ;
   private String[] T00063_A56TAS02_GNGO_RYAK_NM ;
   private boolean[] T00063_n56TAS02_GNGO_RYAK_NM ;
   private short[] T00063_A26TAS02_HNKAN_NEN ;
   private boolean[] T00063_n26TAS02_HNKAN_NEN ;
   private String[] T00063_A24TAS02_DATE_START ;
   private boolean[] T00063_n24TAS02_DATE_START ;
   private String[] T00063_A25TAS02_DATE_END ;
   private boolean[] T00063_n25TAS02_DATE_END ;
   private String[] T00063_A63TAS02_DATE_W_START ;
   private boolean[] T00063_n63TAS02_DATE_W_START ;
   private String[] T00063_A64TAS02_DATE_W_END ;
   private boolean[] T00063_n64TAS02_DATE_W_END ;
   private String[] T00063_A115TAS02_DEL_FLG ;
   private boolean[] T00063_n115TAS02_DEL_FLG ;
   private String[] T00063_A59TAS02_CRT_PROG_NM ;
   private boolean[] T00063_n59TAS02_CRT_PROG_NM ;
   private String[] T00063_A62TAS02_UPD_PROG_NM ;
   private boolean[] T00063_n62TAS02_UPD_PROG_NM ;
   private String[] T00066_A22TAS02_GNGO_KBN ;
   private String[] T00067_A22TAS02_GNGO_KBN ;
   private String[] T00062_A22TAS02_GNGO_KBN ;
   private java.util.Date[] T00062_A57TAS02_CRT_DATETIME ;
   private boolean[] T00062_n57TAS02_CRT_DATETIME ;
   private String[] T00062_A83TAS02_CRT_USER_ID ;
   private boolean[] T00062_n83TAS02_CRT_USER_ID ;
   private java.util.Date[] T00062_A60TAS02_UPD_DATETIME ;
   private boolean[] T00062_n60TAS02_UPD_DATETIME ;
   private String[] T00062_A84TAS02_UPD_USER_ID ;
   private boolean[] T00062_n84TAS02_UPD_USER_ID ;
   private long[] T00062_A116TAS02_UPD_CNT ;
   private boolean[] T00062_n116TAS02_UPD_CNT ;
   private String[] T00062_A23TAS02_GNGO_NM ;
   private boolean[] T00062_n23TAS02_GNGO_NM ;
   private String[] T00062_A56TAS02_GNGO_RYAK_NM ;
   private boolean[] T00062_n56TAS02_GNGO_RYAK_NM ;
   private short[] T00062_A26TAS02_HNKAN_NEN ;
   private boolean[] T00062_n26TAS02_HNKAN_NEN ;
   private String[] T00062_A24TAS02_DATE_START ;
   private boolean[] T00062_n24TAS02_DATE_START ;
   private String[] T00062_A25TAS02_DATE_END ;
   private boolean[] T00062_n25TAS02_DATE_END ;
   private String[] T00062_A63TAS02_DATE_W_START ;
   private boolean[] T00062_n63TAS02_DATE_W_START ;
   private String[] T00062_A64TAS02_DATE_W_END ;
   private boolean[] T00062_n64TAS02_DATE_W_END ;
   private String[] T00062_A115TAS02_DEL_FLG ;
   private boolean[] T00062_n115TAS02_DEL_FLG ;
   private String[] T00062_A59TAS02_CRT_PROG_NM ;
   private boolean[] T00062_n59TAS02_CRT_PROG_NM ;
   private String[] T00062_A62TAS02_UPD_PROG_NM ;
   private boolean[] T00062_n62TAS02_UPD_PROG_NM ;
   private String[] T000611_A22TAS02_GNGO_KBN ;
   private SdtA_LOGIN_SDT AV8W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT4[] ;
}

final  class tas02_geng__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00062", "SELECT `TAS02_GNGO_KBN`, `TAS02_CRT_DATETIME`, `TAS02_CRT_USER_ID`, `TAS02_UPD_DATETIME`, `TAS02_UPD_USER_ID`, `TAS02_UPD_CNT`, `TAS02_GNGO_NM`, `TAS02_GNGO_RYAK_NM`, `TAS02_HNKAN_NEN`, `TAS02_DATE_START`, `TAS02_DATE_END`, `TAS02_DATE_W_START`, `TAS02_DATE_W_END`, `TAS02_DEL_FLG`, `TAS02_CRT_PROG_NM`, `TAS02_UPD_PROG_NM` FROM `TAS02_GENG` WHERE `TAS02_GNGO_KBN` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00063", "SELECT `TAS02_GNGO_KBN`, `TAS02_CRT_DATETIME`, `TAS02_CRT_USER_ID`, `TAS02_UPD_DATETIME`, `TAS02_UPD_USER_ID`, `TAS02_UPD_CNT`, `TAS02_GNGO_NM`, `TAS02_GNGO_RYAK_NM`, `TAS02_HNKAN_NEN`, `TAS02_DATE_START`, `TAS02_DATE_END`, `TAS02_DATE_W_START`, `TAS02_DATE_W_END`, `TAS02_DEL_FLG`, `TAS02_CRT_PROG_NM`, `TAS02_UPD_PROG_NM` FROM `TAS02_GENG` WHERE `TAS02_GNGO_KBN` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00064", "SELECT TM1.`TAS02_GNGO_KBN`, TM1.`TAS02_CRT_DATETIME`, TM1.`TAS02_CRT_USER_ID`, TM1.`TAS02_UPD_DATETIME`, TM1.`TAS02_UPD_USER_ID`, TM1.`TAS02_UPD_CNT`, TM1.`TAS02_GNGO_NM`, TM1.`TAS02_GNGO_RYAK_NM`, TM1.`TAS02_HNKAN_NEN`, TM1.`TAS02_DATE_START`, TM1.`TAS02_DATE_END`, TM1.`TAS02_DATE_W_START`, TM1.`TAS02_DATE_W_END`, TM1.`TAS02_DEL_FLG`, TM1.`TAS02_CRT_PROG_NM`, TM1.`TAS02_UPD_PROG_NM` FROM `TAS02_GENG` TM1 WHERE TM1.`TAS02_GNGO_KBN` = ? ORDER BY TM1.`TAS02_GNGO_KBN` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("T00065", "SELECT `TAS02_GNGO_KBN` FROM `TAS02_GENG` WHERE `TAS02_GNGO_KBN` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00066", "SELECT `TAS02_GNGO_KBN` FROM `TAS02_GENG` WHERE ( `TAS02_GNGO_KBN` > ?) ORDER BY `TAS02_GNGO_KBN`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T00067", "SELECT `TAS02_GNGO_KBN` FROM `TAS02_GENG` WHERE ( `TAS02_GNGO_KBN` < ?) ORDER BY `TAS02_GNGO_KBN` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T00068", "INSERT INTO `TAS02_GENG` (`TAS02_GNGO_KBN`, `TAS02_CRT_DATETIME`, `TAS02_CRT_USER_ID`, `TAS02_UPD_DATETIME`, `TAS02_UPD_USER_ID`, `TAS02_UPD_CNT`, `TAS02_GNGO_NM`, `TAS02_GNGO_RYAK_NM`, `TAS02_HNKAN_NEN`, `TAS02_DATE_START`, `TAS02_DATE_END`, `TAS02_DATE_W_START`, `TAS02_DATE_W_END`, `TAS02_DEL_FLG`, `TAS02_CRT_PROG_NM`, `TAS02_UPD_PROG_NM`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T00069", "UPDATE `TAS02_GENG` SET `TAS02_CRT_DATETIME`=?, `TAS02_CRT_USER_ID`=?, `TAS02_UPD_DATETIME`=?, `TAS02_UPD_USER_ID`=?, `TAS02_UPD_CNT`=?, `TAS02_GNGO_NM`=?, `TAS02_GNGO_RYAK_NM`=?, `TAS02_HNKAN_NEN`=?, `TAS02_DATE_START`=?, `TAS02_DATE_END`=?, `TAS02_DATE_W_START`=?, `TAS02_DATE_W_END`=?, `TAS02_DEL_FLG`=?, `TAS02_CRT_PROG_NM`=?, `TAS02_UPD_PROG_NM`=?  WHERE `TAS02_GNGO_KBN` = ?", GX_NOMASK)
         ,new UpdateCursor("T000610", "DELETE FROM `TAS02_GENG`  WHERE `TAS02_GNGO_KBN` = ?", GX_NOMASK)
         ,new ForEachCursor("T000611", "SELECT `TAS02_GNGO_KBN` FROM `TAS02_GENG` ORDER BY `TAS02_GNGO_KBN` ",true, GX_NOMASK, false, this,10,0,false )
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
               ((short[]) buf[15])[0] = rslt.getShort(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
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
               ((short[]) buf[15])[0] = rslt.getShort(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
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
               ((short[]) buf[15])[0] = rslt.getShort(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
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
               stmt.setVarchar(1, (String)parms[0], 1, false);
               break;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 1, false);
               break;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 1, false);
               break;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 1, false);
               break;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 1, false);
               break;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 1, false);
               break;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 1, false);
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
                  stmt.setVarchar(7, (String)parms[12], 10);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[14], 10);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[16]).shortValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[18], 8);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[20], 8);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[22], 6);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[24], 6);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[26], 1);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[28], 40);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[30], 40);
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
                  stmt.setVarchar(6, (String)parms[11], 10);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[13], 10);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[15]).shortValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[17], 8);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[19], 8);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[21], 6);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[23], 6);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[25], 1);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[27], 40);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[29], 40);
               }
               stmt.setVarchar(16, (String)parms[30], 1, false);
               break;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 1, false);
               break;
      }
   }

}

