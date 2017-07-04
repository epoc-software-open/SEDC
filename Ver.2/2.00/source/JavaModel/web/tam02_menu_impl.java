/*
               File: tam02_menu_impl
        Description: メニューIDマスタ
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:13:43.68
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tam02_menu_impl extends GXWebPanel
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action34") == 0 )
      {
         AV14Pgmname = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A1TAM01_SYS_ID = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1TAM01_SYS_ID", A1TAM01_SYS_ID);
         A2TAM02_MENU_ID_TREE_1 = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2TAM02_MENU_ID_TREE_1", A2TAM02_MENU_ID_TREE_1);
         A3TAM02_MENU_ID_TREE_2 = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3TAM02_MENU_ID_TREE_2", A3TAM02_MENU_ID_TREE_2);
         A4TAM02_MENU_ID_TREE_3 = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4TAM02_MENU_ID_TREE_3", A4TAM02_MENU_ID_TREE_3);
         A211TAM02_MENU_NM = httpContext.GetNextPar( ) ;
         n211TAM02_MENU_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A211TAM02_MENU_NM", A211TAM02_MENU_NM);
         A5TAM02_APP_ID = httpContext.GetNextPar( ) ;
         n5TAM02_APP_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5TAM02_APP_ID", A5TAM02_APP_ID);
         A212TAM02_DEL_FLG = httpContext.GetNextPar( ) ;
         n212TAM02_DEL_FLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A212TAM02_DEL_FLG", A212TAM02_DEL_FLG);
         A225TAM02_CRT_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
         n225TAM02_CRT_DATETIME = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A225TAM02_CRT_DATETIME", localUtil.ttoc( A225TAM02_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         A262TAM02_CRT_USER_ID = httpContext.GetNextPar( ) ;
         n262TAM02_CRT_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A262TAM02_CRT_USER_ID", A262TAM02_CRT_USER_ID);
         A226TAM02_CRT_PROG_NM = httpContext.GetNextPar( ) ;
         n226TAM02_CRT_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A226TAM02_CRT_PROG_NM", A226TAM02_CRT_PROG_NM);
         A227TAM02_UPD_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
         n227TAM02_UPD_DATETIME = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A227TAM02_UPD_DATETIME", localUtil.ttoc( A227TAM02_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         A263TAM02_UPD_USER_ID = httpContext.GetNextPar( ) ;
         n263TAM02_UPD_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A263TAM02_UPD_USER_ID", A263TAM02_UPD_USER_ID);
         A228TAM02_UPD_PROG_NM = httpContext.GetNextPar( ) ;
         n228TAM02_UPD_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A228TAM02_UPD_PROG_NM", A228TAM02_UPD_PROG_NM);
         A275TAM02_UPD_CNT = GXutil.lval( httpContext.GetNextPar( )) ;
         n275TAM02_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A275TAM02_UPD_CNT", GXutil.ltrim( GXutil.str( A275TAM02_UPD_CNT, 10, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_34_022( AV14Pgmname, Gx_mode, A1TAM01_SYS_ID, A2TAM02_MENU_ID_TREE_1, A3TAM02_MENU_ID_TREE_2, A4TAM02_MENU_ID_TREE_3, A211TAM02_MENU_NM, A5TAM02_APP_ID, A212TAM02_DEL_FLG, A225TAM02_CRT_DATETIME, A262TAM02_CRT_USER_ID, A226TAM02_CRT_PROG_NM, A227TAM02_UPD_DATETIME, A263TAM02_UPD_USER_ID, A228TAM02_UPD_PROG_NM, A275TAM02_UPD_CNT) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action35") == 0 )
      {
         AV14Pgmname = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A1TAM01_SYS_ID = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1TAM01_SYS_ID", A1TAM01_SYS_ID);
         A2TAM02_MENU_ID_TREE_1 = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2TAM02_MENU_ID_TREE_1", A2TAM02_MENU_ID_TREE_1);
         A3TAM02_MENU_ID_TREE_2 = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3TAM02_MENU_ID_TREE_2", A3TAM02_MENU_ID_TREE_2);
         A4TAM02_MENU_ID_TREE_3 = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4TAM02_MENU_ID_TREE_3", A4TAM02_MENU_ID_TREE_3);
         A211TAM02_MENU_NM = httpContext.GetNextPar( ) ;
         n211TAM02_MENU_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A211TAM02_MENU_NM", A211TAM02_MENU_NM);
         A5TAM02_APP_ID = httpContext.GetNextPar( ) ;
         n5TAM02_APP_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5TAM02_APP_ID", A5TAM02_APP_ID);
         A212TAM02_DEL_FLG = httpContext.GetNextPar( ) ;
         n212TAM02_DEL_FLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A212TAM02_DEL_FLG", A212TAM02_DEL_FLG);
         A225TAM02_CRT_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
         n225TAM02_CRT_DATETIME = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A225TAM02_CRT_DATETIME", localUtil.ttoc( A225TAM02_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         A262TAM02_CRT_USER_ID = httpContext.GetNextPar( ) ;
         n262TAM02_CRT_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A262TAM02_CRT_USER_ID", A262TAM02_CRT_USER_ID);
         A226TAM02_CRT_PROG_NM = httpContext.GetNextPar( ) ;
         n226TAM02_CRT_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A226TAM02_CRT_PROG_NM", A226TAM02_CRT_PROG_NM);
         A227TAM02_UPD_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
         n227TAM02_UPD_DATETIME = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A227TAM02_UPD_DATETIME", localUtil.ttoc( A227TAM02_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         A263TAM02_UPD_USER_ID = httpContext.GetNextPar( ) ;
         n263TAM02_UPD_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A263TAM02_UPD_USER_ID", A263TAM02_UPD_USER_ID);
         A228TAM02_UPD_PROG_NM = httpContext.GetNextPar( ) ;
         n228TAM02_UPD_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A228TAM02_UPD_PROG_NM", A228TAM02_UPD_PROG_NM);
         A275TAM02_UPD_CNT = GXutil.lval( httpContext.GetNextPar( )) ;
         n275TAM02_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A275TAM02_UPD_CNT", GXutil.ltrim( GXutil.str( A275TAM02_UPD_CNT, 10, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_35_022( AV14Pgmname, Gx_mode, A1TAM01_SYS_ID, A2TAM02_MENU_ID_TREE_1, A3TAM02_MENU_ID_TREE_2, A4TAM02_MENU_ID_TREE_3, A211TAM02_MENU_NM, A5TAM02_APP_ID, A212TAM02_DEL_FLG, A225TAM02_CRT_DATETIME, A262TAM02_CRT_USER_ID, A226TAM02_CRT_PROG_NM, A227TAM02_UPD_DATETIME, A263TAM02_UPD_USER_ID, A228TAM02_UPD_PROG_NM, A275TAM02_UPD_CNT) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action36") == 0 )
      {
         AV14Pgmname = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A1TAM01_SYS_ID = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1TAM01_SYS_ID", A1TAM01_SYS_ID);
         A2TAM02_MENU_ID_TREE_1 = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2TAM02_MENU_ID_TREE_1", A2TAM02_MENU_ID_TREE_1);
         A3TAM02_MENU_ID_TREE_2 = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3TAM02_MENU_ID_TREE_2", A3TAM02_MENU_ID_TREE_2);
         A4TAM02_MENU_ID_TREE_3 = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4TAM02_MENU_ID_TREE_3", A4TAM02_MENU_ID_TREE_3);
         A211TAM02_MENU_NM = httpContext.GetNextPar( ) ;
         n211TAM02_MENU_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A211TAM02_MENU_NM", A211TAM02_MENU_NM);
         A5TAM02_APP_ID = httpContext.GetNextPar( ) ;
         n5TAM02_APP_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5TAM02_APP_ID", A5TAM02_APP_ID);
         A212TAM02_DEL_FLG = httpContext.GetNextPar( ) ;
         n212TAM02_DEL_FLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A212TAM02_DEL_FLG", A212TAM02_DEL_FLG);
         A225TAM02_CRT_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
         n225TAM02_CRT_DATETIME = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A225TAM02_CRT_DATETIME", localUtil.ttoc( A225TAM02_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         A262TAM02_CRT_USER_ID = httpContext.GetNextPar( ) ;
         n262TAM02_CRT_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A262TAM02_CRT_USER_ID", A262TAM02_CRT_USER_ID);
         A226TAM02_CRT_PROG_NM = httpContext.GetNextPar( ) ;
         n226TAM02_CRT_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A226TAM02_CRT_PROG_NM", A226TAM02_CRT_PROG_NM);
         A227TAM02_UPD_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
         n227TAM02_UPD_DATETIME = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A227TAM02_UPD_DATETIME", localUtil.ttoc( A227TAM02_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         A263TAM02_UPD_USER_ID = httpContext.GetNextPar( ) ;
         n263TAM02_UPD_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A263TAM02_UPD_USER_ID", A263TAM02_UPD_USER_ID);
         A228TAM02_UPD_PROG_NM = httpContext.GetNextPar( ) ;
         n228TAM02_UPD_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A228TAM02_UPD_PROG_NM", A228TAM02_UPD_PROG_NM);
         A275TAM02_UPD_CNT = GXutil.lval( httpContext.GetNextPar( )) ;
         n275TAM02_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A275TAM02_UPD_CNT", GXutil.ltrim( GXutil.str( A275TAM02_UPD_CNT, 10, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_36_022( AV14Pgmname, Gx_mode, A1TAM01_SYS_ID, A2TAM02_MENU_ID_TREE_1, A3TAM02_MENU_ID_TREE_2, A4TAM02_MENU_ID_TREE_3, A211TAM02_MENU_NM, A5TAM02_APP_ID, A212TAM02_DEL_FLG, A225TAM02_CRT_DATETIME, A262TAM02_CRT_USER_ID, A226TAM02_CRT_PROG_NM, A227TAM02_UPD_DATETIME, A263TAM02_UPD_USER_ID, A228TAM02_UPD_PROG_NM, A275TAM02_UPD_CNT) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel10"+"_"+"TAM02_CRT_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx10asatam02_crt_user_id022( Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel12"+"_"+"TAM02_UPD_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx12asatam02_upd_user_id022( Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_38") == 0 )
      {
         A1TAM01_SYS_ID = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1TAM01_SYS_ID", A1TAM01_SYS_ID);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_38( A1TAM01_SYS_ID) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_39") == 0 )
      {
         A5TAM02_APP_ID = httpContext.GetNextPar( ) ;
         n5TAM02_APP_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5TAM02_APP_ID", A5TAM02_APP_ID);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_39( A5TAM02_APP_ID) ;
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
      dynTAM01_SYS_ID.setName( "TAM01_SYS_ID" );
      dynTAM01_SYS_ID.setWebtags( "" );
      dynTAM01_SYS_ID.removeAllItems();
      /* Using cursor T00026 */
      pr_default.execute(4);
      while ( (pr_default.getStatus(4) != 101) )
      {
         dynTAM01_SYS_ID.addItem(T00026_A1TAM01_SYS_ID[0], T00026_A206TAM01_SYS_NM[0], (short)(0));
         pr_default.readNext(4);
      }
      pr_default.close(4);
      if ( dynTAM01_SYS_ID.getItemCount() > 0 )
      {
         A1TAM01_SYS_ID = dynTAM01_SYS_ID.getValidValue(A1TAM01_SYS_ID) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1TAM01_SYS_ID", A1TAM01_SYS_ID);
      }
      radTAM02_DEL_FLG.setName( "TAM02_DEL_FLG" );
      radTAM02_DEL_FLG.setWebtags( "" );
      radTAM02_DEL_FLG.addItem("0", "利用可能", (short)(0));
      radTAM02_DEL_FLG.addItem("1", "利用不可", (short)(0));
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 10_3_3-92797", (short)(0)) ;
         Form.getMeta().addItem("description", "メニューIDマスタ", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = dynTAM01_SYS_ID.getInternalname() ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Style2");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tam02_menu_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tam02_menu_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tam02_menu_impl.class ));
   }

   public tam02_menu_impl( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      dynTAM01_SYS_ID = new HTMLChoice();
      radTAM02_DEL_FLG = new HTMLChoice();
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
         wb_table1_2_022( true) ;
      }
      return  ;
   }

   public void wb_table1_2_022e( boolean wbgen )
   {
      if ( wbgen )
      {
         renderHtmlCloseForm022( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void wb_table1_2_022( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableBorder100x100", 0, "left", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_022( true) ;
      }
      return  ;
   }

   public void wb_table2_5_022e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Control Group */
         GxWebStd.gx_group_start( httpContext, grpGroupdata_Internalname, "メニューIDマスタ", 1, 0, "px", 0, "px", "Group", "", "HLP_TAM02_MENU.htm");
         wb_table3_28_022( true) ;
      }
      return  ;
   }

   public void wb_table3_28_022e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_022e( true) ;
      }
      else
      {
         wb_table1_2_022e( false) ;
      }
   }

   public void wb_table3_28_022( boolean wbgen )
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
         wb_table4_34_022( true) ;
      }
      return  ;
   }

   public void wb_table4_34_022e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table5_132_022( true) ;
      }
      return  ;
   }

   public void wb_table5_132_022e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_28_022e( true) ;
      }
      else
      {
         wb_table3_28_022e( false) ;
      }
   }

   public void wb_table5_132_022( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock44_Internalname, "実行", "", "", lblTextblock44_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", "", "TextBlockBtn060", 5, "", 1, 1, (short)(0), "HLP_TAM02_MENU.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "&nbsp;") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock45_Internalname, "クリア", "", "", lblTextblock45_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_CLER\\'."+"'", "", "TextBlockBtn060", 5, "", 1, 1, (short)(0), "HLP_TAM02_MENU.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "&nbsp;") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_cancel_Internalname, "終了", "", "", lblBtn_cancel_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", "", "TextBlockBtn060", 5, "", 1, lblBtn_cancel_Enabled, (short)(0), "HLP_TAM02_MENU.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_132_022e( true) ;
      }
      else
      {
         wb_table5_132_022e( false) ;
      }
   }

   public void wb_table4_34_022( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable2_Internalname, tblTable2_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:130px\">") ;
         /* Static images/pictures */
         ClassString = "ImageRequiredMark" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage19_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgImage19_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, "HLP_TAM02_MENU.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam01_sys_id_Internalname, "システムID", "", "", lblTextblocktam01_sys_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM02_MENU.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
         /* ComboBox */
         GxWebStd.gx_combobox_ctrl1( httpContext, dynTAM01_SYS_ID, dynTAM01_SYS_ID.getInternalname(), GXutil.rtrim( A1TAM01_SYS_ID), 1, dynTAM01_SYS_ID.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", 1, dynTAM01_SYS_ID.getEnabled(), 1, (short)(0), 40, "chr", 0, "", "", "AttributeImeOff", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(40);\"", "", true, "HLP_TAM02_MENU.htm");
         dynTAM01_SYS_ID.setValue( GXutil.rtrim( A1TAM01_SYS_ID) );
         httpContext.ajax_rsp_assign_prop("", false, dynTAM01_SYS_ID.getInternalname(), "Values", dynTAM01_SYS_ID.ToJavascriptSource());
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top\">") ;
         /* Static images/pictures */
         ClassString = "ImageRequiredMark" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage20_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgImage20_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, "HLP_TAM02_MENU.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam02_menu_id_tree_1_Internalname, "メニューID（階層１）", "", "", lblTextblocktam02_menu_id_tree_1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM02_MENU.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM02_MENU_ID_TREE_1_Internalname, GXutil.rtrim( A2TAM02_MENU_ID_TREE_1), GXutil.rtrim( localUtil.format( A2TAM02_MENU_ID_TREE_1, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM02_MENU_ID_TREE_1_Jsonclick, 0, "AttributeImeOff", "", "", "", 1, edtTAM02_MENU_ID_TREE_1_Enabled, 1, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TAM02_MENU.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top\">") ;
         /* Static images/pictures */
         ClassString = "ImageRequiredMark" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage21_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgImage21_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, "HLP_TAM02_MENU.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam02_menu_id_tree_2_Internalname, "メニューID（階層２）", "", "", lblTextblocktam02_menu_id_tree_2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM02_MENU.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM02_MENU_ID_TREE_2_Internalname, GXutil.rtrim( A3TAM02_MENU_ID_TREE_2), GXutil.rtrim( localUtil.format( A3TAM02_MENU_ID_TREE_2, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(52);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM02_MENU_ID_TREE_2_Jsonclick, 0, "AttributeImeOff", "", "", "", 1, edtTAM02_MENU_ID_TREE_2_Enabled, 1, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TAM02_MENU.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top\">") ;
         /* Static images/pictures */
         ClassString = "ImageRequiredMark" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage22_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgImage22_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, "HLP_TAM02_MENU.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam02_menu_id_tree_3_Internalname, "メニューID（階層３）", "", "", lblTextblocktam02_menu_id_tree_3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM02_MENU.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM02_MENU_ID_TREE_3_Internalname, GXutil.rtrim( A4TAM02_MENU_ID_TREE_3), GXutil.rtrim( localUtil.format( A4TAM02_MENU_ID_TREE_3, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(58);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM02_MENU_ID_TREE_3_Jsonclick, 0, "AttributeImeOff", "", "", "", 1, edtTAM02_MENU_ID_TREE_3_Enabled, 1, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TAM02_MENU.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top\">") ;
         /* Static images/pictures */
         ClassString = "ImageRequiredMark" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage23_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgImage23_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, "HLP_TAM02_MENU.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam02_app_id_Internalname, "アプリケーションID", "", "", lblTextblocktam02_app_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM02_MENU.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table6_64_022( true) ;
      }
      return  ;
   }

   public void wb_table6_64_022e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table7_74_022( true) ;
      }
      return  ;
   }

   public void wb_table7_74_022e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top\">") ;
         /* Static images/pictures */
         ClassString = "ImageRequiredMark" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage24_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgImage24_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, "HLP_TAM02_MENU.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam02_menu_nm_Internalname, "メニュー名", "", "", lblTextblocktam02_menu_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM02_MENU.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM02_MENU_NM_Internalname, GXutil.rtrim( A211TAM02_MENU_NM), GXutil.rtrim( localUtil.format( A211TAM02_MENU_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(85);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM02_MENU_NM_Jsonclick, 0, "AttributeImeOn", "", "", "", 1, edtTAM02_MENU_NM_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TAM02_MENU.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\" >") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam01_del_flg_Internalname, "削除フラグ", "", "", lblTextblocktam01_del_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM02_MENU.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Radio button */
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
         GxWebStd.gx_radio_ctrl( httpContext, radTAM02_DEL_FLG, radTAM02_DEL_FLG.getInternalname(), GXutil.rtrim( A212TAM02_DEL_FLG), "", 1, radTAM02_DEL_FLG.getEnabled(), 0, 0, StyleString, ClassString, "", 0, radTAM02_DEL_FLG.getJsonclick(), "'"+""+"'"+",false,"+"'"+""+"'", TempTags+" onclick=\"gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(93);\"", "HLP_TAM02_MENU.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam02_crt_datetime_Internalname, "作成日時", "", "", lblTextblocktam02_crt_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM02_MENU.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtTAM02_CRT_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM02_CRT_DATETIME_Internalname, localUtil.format(A225TAM02_CRT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A225TAM02_CRT_DATETIME, "9999/99/99 99:99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM02_CRT_DATETIME_Jsonclick, 0, "ReadonlyAttribute", "", "", "", edtTAM02_CRT_DATETIME_Visible, edtTAM02_CRT_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TAM02_MENU.htm");
         GxWebStd.gx_bitmap( httpContext, edtTAM02_CRT_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtTAM02_CRT_DATETIME_Visible==0)||(edtTAM02_CRT_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TAM02_MENU.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam02_crt_user_id_Internalname, "作成ユーザーID", "", "", lblTextblocktam02_crt_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM02_MENU.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         GxWebStd.gx_single_line_edit( httpContext, edtTAM02_CRT_USER_ID_Internalname, GXutil.rtrim( A262TAM02_CRT_USER_ID), GXutil.rtrim( localUtil.format( A262TAM02_CRT_USER_ID, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM02_CRT_USER_ID_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTAM02_CRT_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_USER_ID", "left", "HLP_TAM02_MENU.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam02_crt_prog_nm_Internalname, "作成プログラム名", "", "", lblTextblocktam02_crt_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM02_MENU.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         GxWebStd.gx_single_line_edit( httpContext, edtTAM02_CRT_PROG_NM_Internalname, GXutil.rtrim( A226TAM02_CRT_PROG_NM), GXutil.rtrim( localUtil.format( A226TAM02_CRT_PROG_NM, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM02_CRT_PROG_NM_Jsonclick, 0, "ReadonlyAttribute", "", "", "", edtTAM02_CRT_PROG_NM_Visible, edtTAM02_CRT_PROG_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_PG_NM", "left", "HLP_TAM02_MENU.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam02_upd_datetime_Internalname, "更新日時", "", "", lblTextblocktam02_upd_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM02_MENU.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtTAM02_UPD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM02_UPD_DATETIME_Internalname, localUtil.format(A227TAM02_UPD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A227TAM02_UPD_DATETIME, "9999/99/99 99:99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM02_UPD_DATETIME_Jsonclick, 0, "ReadonlyAttribute", "", "", "", edtTAM02_UPD_DATETIME_Visible, edtTAM02_UPD_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TAM02_MENU.htm");
         GxWebStd.gx_bitmap( httpContext, edtTAM02_UPD_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtTAM02_UPD_DATETIME_Visible==0)||(edtTAM02_UPD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TAM02_MENU.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam02_upd_user_id_Internalname, "更新ユーザーID", "", "", lblTextblocktam02_upd_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM02_MENU.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         GxWebStd.gx_single_line_edit( httpContext, edtTAM02_UPD_USER_ID_Internalname, GXutil.rtrim( A263TAM02_UPD_USER_ID), GXutil.rtrim( localUtil.format( A263TAM02_UPD_USER_ID, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM02_UPD_USER_ID_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTAM02_UPD_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_USER_ID", "left", "HLP_TAM02_MENU.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam02_upd_prog_nm_Internalname, "更新プログラム名", "", "", lblTextblocktam02_upd_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM02_MENU.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         GxWebStd.gx_single_line_edit( httpContext, edtTAM02_UPD_PROG_NM_Internalname, GXutil.rtrim( A228TAM02_UPD_PROG_NM), GXutil.rtrim( localUtil.format( A228TAM02_UPD_PROG_NM, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM02_UPD_PROG_NM_Jsonclick, 0, "ReadonlyAttribute", "", "", "", edtTAM02_UPD_PROG_NM_Visible, edtTAM02_UPD_PROG_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_PG_NM", "left", "HLP_TAM02_MENU.htm");
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
         wb_table4_34_022e( true) ;
      }
      else
      {
         wb_table4_34_022e( false) ;
      }
   }

   public void wb_table7_74_022( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable5_Internalname, tblTable5_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"vertical-align:top\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, "※", "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_TAM02_MENU.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, "中間階層のサブメニューについても、<br>アプリケーションマスタへ登録してIDを設定して下さい。", "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(1), "HLP_TAM02_MENU.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table7_74_022e( true) ;
      }
      else
      {
         wb_table7_74_022e( false) ;
      }
   }

   public void wb_table6_64_022( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable3_Internalname, tblTable3_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM02_APP_ID_Internalname, GXutil.rtrim( A5TAM02_APP_ID), GXutil.rtrim( localUtil.format( A5TAM02_APP_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(67);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM02_APP_ID_Jsonclick, 0, "AttributeImeOff", "", "", "", 1, edtTAM02_APP_ID_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TAM02_MENU.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "&nbsp;") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         GxWebStd.gx_single_line_edit( httpContext, edtTAM02_APP_NM_Internalname, GXutil.rtrim( A318TAM02_APP_NM), GXutil.rtrim( localUtil.format( A318TAM02_APP_NM, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM02_APP_NM_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTAM02_APP_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TAM02_MENU.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_64_022e( true) ;
      }
      else
      {
         wb_table6_64_022e( false) ;
      }
   }

   public void wb_table2_5_022( boolean wbgen )
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
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM02_MENU.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM02_MENU.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM02_MENU.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM02_MENU.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM02_MENU.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM02_MENU.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM02_MENU.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM02_MENU.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_SELECT\\'."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM02_MENU.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM02_MENU.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM02_MENU.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM02_MENU.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM02_MENU.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM02_MENU.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM02_MENU.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM02_MENU.htm");
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
         wb_table2_5_022e( true) ;
      }
      else
      {
         wb_table2_5_022e( false) ;
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
      /* Execute user event: e11022 */
      e11022 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            dynTAM01_SYS_ID.setValue( httpContext.cgiGet( dynTAM01_SYS_ID.getInternalname()) );
            A1TAM01_SYS_ID = httpContext.cgiGet( dynTAM01_SYS_ID.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1TAM01_SYS_ID", A1TAM01_SYS_ID);
            A2TAM02_MENU_ID_TREE_1 = httpContext.cgiGet( edtTAM02_MENU_ID_TREE_1_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2TAM02_MENU_ID_TREE_1", A2TAM02_MENU_ID_TREE_1);
            A3TAM02_MENU_ID_TREE_2 = httpContext.cgiGet( edtTAM02_MENU_ID_TREE_2_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3TAM02_MENU_ID_TREE_2", A3TAM02_MENU_ID_TREE_2);
            A4TAM02_MENU_ID_TREE_3 = httpContext.cgiGet( edtTAM02_MENU_ID_TREE_3_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4TAM02_MENU_ID_TREE_3", A4TAM02_MENU_ID_TREE_3);
            A5TAM02_APP_ID = httpContext.cgiGet( edtTAM02_APP_ID_Internalname) ;
            n5TAM02_APP_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5TAM02_APP_ID", A5TAM02_APP_ID);
            n5TAM02_APP_ID = ((GXutil.strcmp("", A5TAM02_APP_ID)==0) ? true : false) ;
            A318TAM02_APP_NM = httpContext.cgiGet( edtTAM02_APP_NM_Internalname) ;
            n318TAM02_APP_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A318TAM02_APP_NM", A318TAM02_APP_NM);
            A211TAM02_MENU_NM = httpContext.cgiGet( edtTAM02_MENU_NM_Internalname) ;
            n211TAM02_MENU_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A211TAM02_MENU_NM", A211TAM02_MENU_NM);
            n211TAM02_MENU_NM = ((GXutil.strcmp("", A211TAM02_MENU_NM)==0) ? true : false) ;
            A212TAM02_DEL_FLG = httpContext.cgiGet( radTAM02_DEL_FLG.getInternalname()) ;
            n212TAM02_DEL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A212TAM02_DEL_FLG", A212TAM02_DEL_FLG);
            n212TAM02_DEL_FLG = ((GXutil.strcmp("", A212TAM02_DEL_FLG)==0) ? true : false) ;
            A225TAM02_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTAM02_CRT_DATETIME_Internalname)) ;
            n225TAM02_CRT_DATETIME = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A225TAM02_CRT_DATETIME", localUtil.ttoc( A225TAM02_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            A262TAM02_CRT_USER_ID = httpContext.cgiGet( edtTAM02_CRT_USER_ID_Internalname) ;
            n262TAM02_CRT_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A262TAM02_CRT_USER_ID", A262TAM02_CRT_USER_ID);
            A226TAM02_CRT_PROG_NM = httpContext.cgiGet( edtTAM02_CRT_PROG_NM_Internalname) ;
            n226TAM02_CRT_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A226TAM02_CRT_PROG_NM", A226TAM02_CRT_PROG_NM);
            A227TAM02_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTAM02_UPD_DATETIME_Internalname)) ;
            n227TAM02_UPD_DATETIME = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A227TAM02_UPD_DATETIME", localUtil.ttoc( A227TAM02_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            A263TAM02_UPD_USER_ID = httpContext.cgiGet( edtTAM02_UPD_USER_ID_Internalname) ;
            n263TAM02_UPD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A263TAM02_UPD_USER_ID", A263TAM02_UPD_USER_ID);
            A228TAM02_UPD_PROG_NM = httpContext.cgiGet( edtTAM02_UPD_PROG_NM_Internalname) ;
            n228TAM02_UPD_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A228TAM02_UPD_PROG_NM", A228TAM02_UPD_PROG_NM);
            /* Read saved values. */
            Z1TAM01_SYS_ID = httpContext.cgiGet( "Z1TAM01_SYS_ID") ;
            Z2TAM02_MENU_ID_TREE_1 = httpContext.cgiGet( "Z2TAM02_MENU_ID_TREE_1") ;
            Z3TAM02_MENU_ID_TREE_2 = httpContext.cgiGet( "Z3TAM02_MENU_ID_TREE_2") ;
            Z4TAM02_MENU_ID_TREE_3 = httpContext.cgiGet( "Z4TAM02_MENU_ID_TREE_3") ;
            Z225TAM02_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z225TAM02_CRT_DATETIME"), 0) ;
            n225TAM02_CRT_DATETIME = (GXutil.nullDate().equals(A225TAM02_CRT_DATETIME) ? true : false) ;
            Z262TAM02_CRT_USER_ID = httpContext.cgiGet( "Z262TAM02_CRT_USER_ID") ;
            n262TAM02_CRT_USER_ID = ((GXutil.strcmp("", A262TAM02_CRT_USER_ID)==0) ? true : false) ;
            Z227TAM02_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z227TAM02_UPD_DATETIME"), 0) ;
            n227TAM02_UPD_DATETIME = (GXutil.nullDate().equals(A227TAM02_UPD_DATETIME) ? true : false) ;
            Z263TAM02_UPD_USER_ID = httpContext.cgiGet( "Z263TAM02_UPD_USER_ID") ;
            n263TAM02_UPD_USER_ID = ((GXutil.strcmp("", A263TAM02_UPD_USER_ID)==0) ? true : false) ;
            Z275TAM02_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z275TAM02_UPD_CNT"), ".", ",") ;
            n275TAM02_UPD_CNT = ((0==A275TAM02_UPD_CNT) ? true : false) ;
            Z211TAM02_MENU_NM = httpContext.cgiGet( "Z211TAM02_MENU_NM") ;
            n211TAM02_MENU_NM = ((GXutil.strcmp("", A211TAM02_MENU_NM)==0) ? true : false) ;
            Z212TAM02_DEL_FLG = httpContext.cgiGet( "Z212TAM02_DEL_FLG") ;
            n212TAM02_DEL_FLG = ((GXutil.strcmp("", A212TAM02_DEL_FLG)==0) ? true : false) ;
            Z226TAM02_CRT_PROG_NM = httpContext.cgiGet( "Z226TAM02_CRT_PROG_NM") ;
            n226TAM02_CRT_PROG_NM = ((GXutil.strcmp("", A226TAM02_CRT_PROG_NM)==0) ? true : false) ;
            Z228TAM02_UPD_PROG_NM = httpContext.cgiGet( "Z228TAM02_UPD_PROG_NM") ;
            n228TAM02_UPD_PROG_NM = ((GXutil.strcmp("", A228TAM02_UPD_PROG_NM)==0) ? true : false) ;
            Z5TAM02_APP_ID = httpContext.cgiGet( "Z5TAM02_APP_ID") ;
            n5TAM02_APP_ID = ((GXutil.strcmp("", A5TAM02_APP_ID)==0) ? true : false) ;
            A275TAM02_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z275TAM02_UPD_CNT"), ".", ",") ;
            n275TAM02_UPD_CNT = false ;
            n275TAM02_UPD_CNT = ((0==A275TAM02_UPD_CNT) ? true : false) ;
            O275TAM02_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "O275TAM02_UPD_CNT"), ".", ",") ;
            n275TAM02_UPD_CNT = ((0==A275TAM02_UPD_CNT) ? true : false) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ".", ",")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ".", ",")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            A275TAM02_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "TAM02_UPD_CNT"), ".", ",") ;
            n275TAM02_UPD_CNT = ((0==A275TAM02_UPD_CNT) ? true : false) ;
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
               A1TAM01_SYS_ID = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1TAM01_SYS_ID", A1TAM01_SYS_ID);
               A2TAM02_MENU_ID_TREE_1 = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2TAM02_MENU_ID_TREE_1", A2TAM02_MENU_ID_TREE_1);
               A3TAM02_MENU_ID_TREE_2 = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3TAM02_MENU_ID_TREE_2", A3TAM02_MENU_ID_TREE_2);
               A4TAM02_MENU_ID_TREE_3 = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4TAM02_MENU_ID_TREE_3", A4TAM02_MENU_ID_TREE_3);
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
                     /* Execute user event: e11022 */
                     e11022 ();
                  }
                  else if ( GXutil.strcmp(sEvt, "'BTN_SELECT'") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     dynload_actions( ) ;
                     /* Execute user event: e12022 */
                     e12022 ();
                  }
                  else if ( GXutil.strcmp(sEvt, "'BTN_CLER'") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     dynload_actions( ) ;
                     /* Execute user event: e13022 */
                     e13022 ();
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
            initAll022( ) ;
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
      disableAttributes022( ) ;
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

   public void confirm_020( )
   {
      beforeValidate022( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls022( ) ;
         }
         else
         {
            checkExtendedTable022( ) ;
            if ( AnyError == 0 )
            {
               zm022( 38) ;
               zm022( 39) ;
            }
            closeExtendedTableCursors022( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      }
      if ( AnyError == 0 )
      {
         confirmValues020( ) ;
      }
   }

   public void resetCaption020( )
   {
   }

   public void e11022( )
   {
      /* Start Routine */
      AV7C_TAM02_APP_ID = "TAM02" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7C_TAM02_APP_ID", AV7C_TAM02_APP_ID);
      /* Execute user subroutine: S112 */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(3);
         pr_default.close(2);
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
            pr_default.close(3);
            pr_default.close(2);
            pr_default.close(1);
            returnInSub = true;
            if (true) return;
         }
      }
      GXt_char1 = AV12W_MSG ;
      GXv_char2[0] = GXt_char1 ;
      new a805_pc01_msg_get(remoteHandle, context).execute( "AG00005", "", "", "", "", "", GXv_char2) ;
      tam02_menu_impl.this.GXt_char1 = GXv_char2[0] ;
      AV12W_MSG = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12W_MSG", AV12W_MSG);
      imgBtn_delete2_Jsonclick = "confirm('"+AV12W_MSG+"')" ;
      httpContext.ajax_rsp_assign_prop("", false, imgBtn_delete2_Internalname, "Jsonclick", imgBtn_delete2_Jsonclick);
   }

   public void e12022( )
   {
      /* 'BTN_SELECT' Routine */
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "tam02_sel"+GXutil.URLEncode(GXutil.rtrim(A1TAM01_SYS_ID)) + "," + GXutil.URLEncode(GXutil.rtrim(A2TAM02_MENU_ID_TREE_1)) + "," + GXutil.URLEncode(GXutil.rtrim(A3TAM02_MENU_ID_TREE_2)) + "," + GXutil.URLEncode(GXutil.rtrim(A4TAM02_MENU_ID_TREE_3)) ;
      httpContext.popup(formatLink("tam02_sel") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey), new Object[] {"A1TAM01_SYS_ID","A2TAM02_MENU_ID_TREE_1","A3TAM02_MENU_ID_TREE_2","A4TAM02_MENU_ID_TREE_3"});
   }

   public void e13022( )
   {
      /* 'BTN_CLER' Routine */
      httpContext.wjLoc = formatLink("tam02_menu")  ;
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
      tam02_menu_impl.this.AV9W_ERRCD = GXv_char2[0] ;
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
      tam02_menu_impl.this.AV10W_KNGN_FLG = GXv_char2[0] ;
      tam02_menu_impl.this.AV9W_ERRCD = GXv_char4[0] ;
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

   public void zm022( int GX_JID )
   {
      if ( ( GX_JID == 37 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z225TAM02_CRT_DATETIME = T00023_A225TAM02_CRT_DATETIME[0] ;
            Z262TAM02_CRT_USER_ID = T00023_A262TAM02_CRT_USER_ID[0] ;
            Z227TAM02_UPD_DATETIME = T00023_A227TAM02_UPD_DATETIME[0] ;
            Z263TAM02_UPD_USER_ID = T00023_A263TAM02_UPD_USER_ID[0] ;
            Z275TAM02_UPD_CNT = T00023_A275TAM02_UPD_CNT[0] ;
            Z211TAM02_MENU_NM = T00023_A211TAM02_MENU_NM[0] ;
            Z212TAM02_DEL_FLG = T00023_A212TAM02_DEL_FLG[0] ;
            Z226TAM02_CRT_PROG_NM = T00023_A226TAM02_CRT_PROG_NM[0] ;
            Z228TAM02_UPD_PROG_NM = T00023_A228TAM02_UPD_PROG_NM[0] ;
            Z5TAM02_APP_ID = T00023_A5TAM02_APP_ID[0] ;
         }
         else
         {
            Z225TAM02_CRT_DATETIME = A225TAM02_CRT_DATETIME ;
            Z262TAM02_CRT_USER_ID = A262TAM02_CRT_USER_ID ;
            Z227TAM02_UPD_DATETIME = A227TAM02_UPD_DATETIME ;
            Z263TAM02_UPD_USER_ID = A263TAM02_UPD_USER_ID ;
            Z275TAM02_UPD_CNT = A275TAM02_UPD_CNT ;
            Z211TAM02_MENU_NM = A211TAM02_MENU_NM ;
            Z212TAM02_DEL_FLG = A212TAM02_DEL_FLG ;
            Z226TAM02_CRT_PROG_NM = A226TAM02_CRT_PROG_NM ;
            Z228TAM02_UPD_PROG_NM = A228TAM02_UPD_PROG_NM ;
            Z5TAM02_APP_ID = A5TAM02_APP_ID ;
         }
      }
      if ( GX_JID == -37 )
      {
         Z2TAM02_MENU_ID_TREE_1 = A2TAM02_MENU_ID_TREE_1 ;
         Z3TAM02_MENU_ID_TREE_2 = A3TAM02_MENU_ID_TREE_2 ;
         Z4TAM02_MENU_ID_TREE_3 = A4TAM02_MENU_ID_TREE_3 ;
         Z225TAM02_CRT_DATETIME = A225TAM02_CRT_DATETIME ;
         Z262TAM02_CRT_USER_ID = A262TAM02_CRT_USER_ID ;
         Z227TAM02_UPD_DATETIME = A227TAM02_UPD_DATETIME ;
         Z263TAM02_UPD_USER_ID = A263TAM02_UPD_USER_ID ;
         Z275TAM02_UPD_CNT = A275TAM02_UPD_CNT ;
         Z211TAM02_MENU_NM = A211TAM02_MENU_NM ;
         Z212TAM02_DEL_FLG = A212TAM02_DEL_FLG ;
         Z226TAM02_CRT_PROG_NM = A226TAM02_CRT_PROG_NM ;
         Z228TAM02_UPD_PROG_NM = A228TAM02_UPD_PROG_NM ;
         Z1TAM01_SYS_ID = A1TAM01_SYS_ID ;
         Z5TAM02_APP_ID = A5TAM02_APP_ID ;
         Z318TAM02_APP_NM = A318TAM02_APP_NM ;
      }
   }

   public void standaloneNotModal( )
   {
      edtTAM02_APP_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM02_APP_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM02_APP_NM_Enabled, 5, 0)));
      edtTAM02_CRT_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM02_CRT_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM02_CRT_DATETIME_Enabled, 5, 0)));
      edtTAM02_CRT_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM02_CRT_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM02_CRT_USER_ID_Enabled, 5, 0)));
      edtTAM02_CRT_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM02_CRT_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM02_CRT_PROG_NM_Enabled, 5, 0)));
      edtTAM02_UPD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM02_UPD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM02_UPD_DATETIME_Enabled, 5, 0)));
      edtTAM02_UPD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM02_UPD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM02_UPD_USER_ID_Enabled, 5, 0)));
      edtTAM02_UPD_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM02_UPD_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM02_UPD_PROG_NM_Enabled, 5, 0)));
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtTAM02_APP_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM02_APP_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM02_APP_NM_Enabled, 5, 0)));
      edtTAM02_CRT_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM02_CRT_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM02_CRT_DATETIME_Enabled, 5, 0)));
      edtTAM02_CRT_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM02_CRT_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM02_CRT_USER_ID_Enabled, 5, 0)));
      edtTAM02_CRT_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM02_CRT_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM02_CRT_PROG_NM_Enabled, 5, 0)));
      edtTAM02_UPD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM02_UPD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM02_UPD_DATETIME_Enabled, 5, 0)));
      edtTAM02_UPD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM02_UPD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM02_UPD_USER_ID_Enabled, 5, 0)));
      edtTAM02_UPD_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM02_UPD_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM02_UPD_PROG_NM_Enabled, 5, 0)));
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 )  )
      {
         dynTAM01_SYS_ID.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, dynTAM01_SYS_ID.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( dynTAM01_SYS_ID.getEnabled(), 5, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 )  )
      {
         edtTAM02_MENU_ID_TREE_1_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTAM02_MENU_ID_TREE_1_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM02_MENU_ID_TREE_1_Enabled, 5, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 )  )
      {
         edtTAM02_MENU_ID_TREE_2_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTAM02_MENU_ID_TREE_2_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM02_MENU_ID_TREE_2_Enabled, 5, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 )  )
      {
         edtTAM02_MENU_ID_TREE_3_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTAM02_MENU_ID_TREE_3_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM02_MENU_ID_TREE_3_Enabled, 5, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
      {
         edtTAM02_CRT_DATETIME_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTAM02_CRT_DATETIME_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTAM02_CRT_DATETIME_Visible, 5, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
      {
         edtTAM02_CRT_PROG_NM_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTAM02_CRT_PROG_NM_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTAM02_CRT_PROG_NM_Visible, 5, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
      {
         edtTAM02_UPD_DATETIME_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTAM02_UPD_DATETIME_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTAM02_UPD_DATETIME_Visible, 5, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
      {
         edtTAM02_UPD_PROG_NM_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTAM02_UPD_PROG_NM_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTAM02_UPD_PROG_NM_Visible, 5, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  && (GXutil.strcmp("", A212TAM02_DEL_FLG)==0) && ( Gx_BScreen == 0 ) )
      {
         A212TAM02_DEL_FLG = "0" ;
         n212TAM02_DEL_FLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A212TAM02_DEL_FLG", A212TAM02_DEL_FLG);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  && (GXutil.strcmp("", A226TAM02_CRT_PROG_NM)==0) && ( Gx_BScreen == 0 ) )
      {
         A226TAM02_CRT_PROG_NM = AV14Pgmname ;
         n226TAM02_CRT_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A226TAM02_CRT_PROG_NM", A226TAM02_CRT_PROG_NM);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  && (GXutil.strcmp("", A228TAM02_UPD_PROG_NM)==0) && ( Gx_BScreen == 0 ) )
      {
         A228TAM02_UPD_PROG_NM = AV14Pgmname ;
         n228TAM02_UPD_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A228TAM02_UPD_PROG_NM", A228TAM02_UPD_PROG_NM);
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

   public void load022( )
   {
      /* Using cursor T00027 */
      pr_default.execute(5, new Object[] {A1TAM01_SYS_ID, A2TAM02_MENU_ID_TREE_1, A3TAM02_MENU_ID_TREE_2, A4TAM02_MENU_ID_TREE_3});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound2 = (short)(1) ;
         A225TAM02_CRT_DATETIME = T00027_A225TAM02_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A225TAM02_CRT_DATETIME", localUtil.ttoc( A225TAM02_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n225TAM02_CRT_DATETIME = T00027_n225TAM02_CRT_DATETIME[0] ;
         A262TAM02_CRT_USER_ID = T00027_A262TAM02_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A262TAM02_CRT_USER_ID", A262TAM02_CRT_USER_ID);
         n262TAM02_CRT_USER_ID = T00027_n262TAM02_CRT_USER_ID[0] ;
         A227TAM02_UPD_DATETIME = T00027_A227TAM02_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A227TAM02_UPD_DATETIME", localUtil.ttoc( A227TAM02_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n227TAM02_UPD_DATETIME = T00027_n227TAM02_UPD_DATETIME[0] ;
         A263TAM02_UPD_USER_ID = T00027_A263TAM02_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A263TAM02_UPD_USER_ID", A263TAM02_UPD_USER_ID);
         n263TAM02_UPD_USER_ID = T00027_n263TAM02_UPD_USER_ID[0] ;
         A275TAM02_UPD_CNT = T00027_A275TAM02_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A275TAM02_UPD_CNT", GXutil.ltrim( GXutil.str( A275TAM02_UPD_CNT, 10, 0)));
         n275TAM02_UPD_CNT = T00027_n275TAM02_UPD_CNT[0] ;
         A211TAM02_MENU_NM = T00027_A211TAM02_MENU_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A211TAM02_MENU_NM", A211TAM02_MENU_NM);
         n211TAM02_MENU_NM = T00027_n211TAM02_MENU_NM[0] ;
         A318TAM02_APP_NM = T00027_A318TAM02_APP_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A318TAM02_APP_NM", A318TAM02_APP_NM);
         n318TAM02_APP_NM = T00027_n318TAM02_APP_NM[0] ;
         A212TAM02_DEL_FLG = T00027_A212TAM02_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A212TAM02_DEL_FLG", A212TAM02_DEL_FLG);
         n212TAM02_DEL_FLG = T00027_n212TAM02_DEL_FLG[0] ;
         A226TAM02_CRT_PROG_NM = T00027_A226TAM02_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A226TAM02_CRT_PROG_NM", A226TAM02_CRT_PROG_NM);
         n226TAM02_CRT_PROG_NM = T00027_n226TAM02_CRT_PROG_NM[0] ;
         A228TAM02_UPD_PROG_NM = T00027_A228TAM02_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A228TAM02_UPD_PROG_NM", A228TAM02_UPD_PROG_NM);
         n228TAM02_UPD_PROG_NM = T00027_n228TAM02_UPD_PROG_NM[0] ;
         A5TAM02_APP_ID = T00027_A5TAM02_APP_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5TAM02_APP_ID", A5TAM02_APP_ID);
         n5TAM02_APP_ID = T00027_n5TAM02_APP_ID[0] ;
         zm022( -37) ;
      }
      pr_default.close(5);
      onLoadActions022( ) ;
   }

   public void onLoadActions022( )
   {
      AV14Pgmname = "TAM02_MENU" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
   }

   public void checkExtendedTable022( )
   {
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      AV14Pgmname = "TAM02_MENU" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
      /* Using cursor T00024 */
      pr_default.execute(2, new Object[] {A1TAM01_SYS_ID});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem("'システムIDマスタ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TAM01_SYS_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = dynTAM01_SYS_ID.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
      /* Using cursor T00025 */
      pr_default.execute(3, new Object[] {new Boolean(n5TAM02_APP_ID), A5TAM02_APP_ID});
      if ( (pr_default.getStatus(3) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A5TAM02_APP_ID)==0) ) )
         {
            httpContext.GX_msglist.addItem("'メニューIDマスタ・アプリケーションサブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TAM02_APP_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTAM02_APP_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A318TAM02_APP_NM = T00025_A318TAM02_APP_NM[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A318TAM02_APP_NM", A318TAM02_APP_NM);
      n318TAM02_APP_NM = T00025_n318TAM02_APP_NM[0] ;
      pr_default.close(3);
   }

   public void closeExtendedTableCursors022( )
   {
   }

   public void enableDisable( )
   {
   }

   public void gxload_38( String A1TAM01_SYS_ID )
   {
      /* Using cursor T00024 */
      pr_default.execute(2, new Object[] {A1TAM01_SYS_ID});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem("'システムIDマスタ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TAM01_SYS_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = dynTAM01_SYS_ID.getInternalname() ;
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

   public void gxload_39( String A5TAM02_APP_ID )
   {
      /* Using cursor T00025 */
      pr_default.execute(3, new Object[] {new Boolean(n5TAM02_APP_ID), A5TAM02_APP_ID});
      if ( (pr_default.getStatus(3) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A5TAM02_APP_ID)==0) ) )
         {
            httpContext.GX_msglist.addItem("'メニューIDマスタ・アプリケーションサブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TAM02_APP_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTAM02_APP_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A318TAM02_APP_NM = T00025_A318TAM02_APP_NM[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A318TAM02_APP_NM", A318TAM02_APP_NM);
      n318TAM02_APP_NM = T00025_n318TAM02_APP_NM[0] ;
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A318TAM02_APP_NM))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(3);
   }

   public void getKey022( )
   {
      /* Using cursor T00028 */
      pr_default.execute(6, new Object[] {A1TAM01_SYS_ID, A2TAM02_MENU_ID_TREE_1, A3TAM02_MENU_ID_TREE_2, A4TAM02_MENU_ID_TREE_3});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound2 = (short)(1) ;
      }
      else
      {
         RcdFound2 = (short)(0) ;
      }
      pr_default.close(6);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00023 */
      pr_default.execute(1, new Object[] {A1TAM01_SYS_ID, A2TAM02_MENU_ID_TREE_1, A3TAM02_MENU_ID_TREE_2, A4TAM02_MENU_ID_TREE_3});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm022( 37) ;
         RcdFound2 = (short)(1) ;
         A2TAM02_MENU_ID_TREE_1 = T00023_A2TAM02_MENU_ID_TREE_1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2TAM02_MENU_ID_TREE_1", A2TAM02_MENU_ID_TREE_1);
         A3TAM02_MENU_ID_TREE_2 = T00023_A3TAM02_MENU_ID_TREE_2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3TAM02_MENU_ID_TREE_2", A3TAM02_MENU_ID_TREE_2);
         A4TAM02_MENU_ID_TREE_3 = T00023_A4TAM02_MENU_ID_TREE_3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4TAM02_MENU_ID_TREE_3", A4TAM02_MENU_ID_TREE_3);
         A225TAM02_CRT_DATETIME = T00023_A225TAM02_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A225TAM02_CRT_DATETIME", localUtil.ttoc( A225TAM02_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n225TAM02_CRT_DATETIME = T00023_n225TAM02_CRT_DATETIME[0] ;
         A262TAM02_CRT_USER_ID = T00023_A262TAM02_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A262TAM02_CRT_USER_ID", A262TAM02_CRT_USER_ID);
         n262TAM02_CRT_USER_ID = T00023_n262TAM02_CRT_USER_ID[0] ;
         A227TAM02_UPD_DATETIME = T00023_A227TAM02_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A227TAM02_UPD_DATETIME", localUtil.ttoc( A227TAM02_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n227TAM02_UPD_DATETIME = T00023_n227TAM02_UPD_DATETIME[0] ;
         A263TAM02_UPD_USER_ID = T00023_A263TAM02_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A263TAM02_UPD_USER_ID", A263TAM02_UPD_USER_ID);
         n263TAM02_UPD_USER_ID = T00023_n263TAM02_UPD_USER_ID[0] ;
         A275TAM02_UPD_CNT = T00023_A275TAM02_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A275TAM02_UPD_CNT", GXutil.ltrim( GXutil.str( A275TAM02_UPD_CNT, 10, 0)));
         n275TAM02_UPD_CNT = T00023_n275TAM02_UPD_CNT[0] ;
         A211TAM02_MENU_NM = T00023_A211TAM02_MENU_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A211TAM02_MENU_NM", A211TAM02_MENU_NM);
         n211TAM02_MENU_NM = T00023_n211TAM02_MENU_NM[0] ;
         A212TAM02_DEL_FLG = T00023_A212TAM02_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A212TAM02_DEL_FLG", A212TAM02_DEL_FLG);
         n212TAM02_DEL_FLG = T00023_n212TAM02_DEL_FLG[0] ;
         A226TAM02_CRT_PROG_NM = T00023_A226TAM02_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A226TAM02_CRT_PROG_NM", A226TAM02_CRT_PROG_NM);
         n226TAM02_CRT_PROG_NM = T00023_n226TAM02_CRT_PROG_NM[0] ;
         A228TAM02_UPD_PROG_NM = T00023_A228TAM02_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A228TAM02_UPD_PROG_NM", A228TAM02_UPD_PROG_NM);
         n228TAM02_UPD_PROG_NM = T00023_n228TAM02_UPD_PROG_NM[0] ;
         A1TAM01_SYS_ID = T00023_A1TAM01_SYS_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1TAM01_SYS_ID", A1TAM01_SYS_ID);
         A5TAM02_APP_ID = T00023_A5TAM02_APP_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5TAM02_APP_ID", A5TAM02_APP_ID);
         n5TAM02_APP_ID = T00023_n5TAM02_APP_ID[0] ;
         O275TAM02_UPD_CNT = A275TAM02_UPD_CNT ;
         n275TAM02_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A275TAM02_UPD_CNT", GXutil.ltrim( GXutil.str( A275TAM02_UPD_CNT, 10, 0)));
         Z1TAM01_SYS_ID = A1TAM01_SYS_ID ;
         Z2TAM02_MENU_ID_TREE_1 = A2TAM02_MENU_ID_TREE_1 ;
         Z3TAM02_MENU_ID_TREE_2 = A3TAM02_MENU_ID_TREE_2 ;
         Z4TAM02_MENU_ID_TREE_3 = A4TAM02_MENU_ID_TREE_3 ;
         sMode2 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load022( ) ;
         if ( AnyError == 1 )
         {
            RcdFound2 = (short)(0) ;
            initializeNonKey022( ) ;
         }
         Gx_mode = sMode2 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound2 = (short)(0) ;
         initializeNonKey022( ) ;
         sMode2 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode2 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey022( ) ;
      if ( RcdFound2 == 0 )
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
      RcdFound2 = (short)(0) ;
      /* Using cursor T00029 */
      pr_default.execute(7, new Object[] {A1TAM01_SYS_ID, A1TAM01_SYS_ID, A2TAM02_MENU_ID_TREE_1, A2TAM02_MENU_ID_TREE_1, A1TAM01_SYS_ID, A3TAM02_MENU_ID_TREE_2, A3TAM02_MENU_ID_TREE_2, A2TAM02_MENU_ID_TREE_1, A1TAM01_SYS_ID, A4TAM02_MENU_ID_TREE_3});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T00029_A1TAM01_SYS_ID[0], A1TAM01_SYS_ID) < 0 ) || ( GXutil.strcmp(T00029_A1TAM01_SYS_ID[0], A1TAM01_SYS_ID) == 0 ) && ( GXutil.strcmp(T00029_A2TAM02_MENU_ID_TREE_1[0], A2TAM02_MENU_ID_TREE_1) < 0 ) || ( GXutil.strcmp(T00029_A2TAM02_MENU_ID_TREE_1[0], A2TAM02_MENU_ID_TREE_1) == 0 ) && ( GXutil.strcmp(T00029_A1TAM01_SYS_ID[0], A1TAM01_SYS_ID) == 0 ) && ( GXutil.strcmp(T00029_A3TAM02_MENU_ID_TREE_2[0], A3TAM02_MENU_ID_TREE_2) < 0 ) || ( GXutil.strcmp(T00029_A3TAM02_MENU_ID_TREE_2[0], A3TAM02_MENU_ID_TREE_2) == 0 ) && ( GXutil.strcmp(T00029_A2TAM02_MENU_ID_TREE_1[0], A2TAM02_MENU_ID_TREE_1) == 0 ) && ( GXutil.strcmp(T00029_A1TAM01_SYS_ID[0], A1TAM01_SYS_ID) == 0 ) && ( GXutil.strcmp(T00029_A4TAM02_MENU_ID_TREE_3[0], A4TAM02_MENU_ID_TREE_3) < 0 ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T00029_A1TAM01_SYS_ID[0], A1TAM01_SYS_ID) > 0 ) || ( GXutil.strcmp(T00029_A1TAM01_SYS_ID[0], A1TAM01_SYS_ID) == 0 ) && ( GXutil.strcmp(T00029_A2TAM02_MENU_ID_TREE_1[0], A2TAM02_MENU_ID_TREE_1) > 0 ) || ( GXutil.strcmp(T00029_A2TAM02_MENU_ID_TREE_1[0], A2TAM02_MENU_ID_TREE_1) == 0 ) && ( GXutil.strcmp(T00029_A1TAM01_SYS_ID[0], A1TAM01_SYS_ID) == 0 ) && ( GXutil.strcmp(T00029_A3TAM02_MENU_ID_TREE_2[0], A3TAM02_MENU_ID_TREE_2) > 0 ) || ( GXutil.strcmp(T00029_A3TAM02_MENU_ID_TREE_2[0], A3TAM02_MENU_ID_TREE_2) == 0 ) && ( GXutil.strcmp(T00029_A2TAM02_MENU_ID_TREE_1[0], A2TAM02_MENU_ID_TREE_1) == 0 ) && ( GXutil.strcmp(T00029_A1TAM01_SYS_ID[0], A1TAM01_SYS_ID) == 0 ) && ( GXutil.strcmp(T00029_A4TAM02_MENU_ID_TREE_3[0], A4TAM02_MENU_ID_TREE_3) > 0 ) ) )
         {
            A1TAM01_SYS_ID = T00029_A1TAM01_SYS_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1TAM01_SYS_ID", A1TAM01_SYS_ID);
            A2TAM02_MENU_ID_TREE_1 = T00029_A2TAM02_MENU_ID_TREE_1[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2TAM02_MENU_ID_TREE_1", A2TAM02_MENU_ID_TREE_1);
            A3TAM02_MENU_ID_TREE_2 = T00029_A3TAM02_MENU_ID_TREE_2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3TAM02_MENU_ID_TREE_2", A3TAM02_MENU_ID_TREE_2);
            A4TAM02_MENU_ID_TREE_3 = T00029_A4TAM02_MENU_ID_TREE_3[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4TAM02_MENU_ID_TREE_3", A4TAM02_MENU_ID_TREE_3);
            RcdFound2 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void move_previous( )
   {
      RcdFound2 = (short)(0) ;
      /* Using cursor T000210 */
      pr_default.execute(8, new Object[] {A1TAM01_SYS_ID, A1TAM01_SYS_ID, A2TAM02_MENU_ID_TREE_1, A2TAM02_MENU_ID_TREE_1, A1TAM01_SYS_ID, A3TAM02_MENU_ID_TREE_2, A3TAM02_MENU_ID_TREE_2, A2TAM02_MENU_ID_TREE_1, A1TAM01_SYS_ID, A4TAM02_MENU_ID_TREE_3});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T000210_A1TAM01_SYS_ID[0], A1TAM01_SYS_ID) > 0 ) || ( GXutil.strcmp(T000210_A1TAM01_SYS_ID[0], A1TAM01_SYS_ID) == 0 ) && ( GXutil.strcmp(T000210_A2TAM02_MENU_ID_TREE_1[0], A2TAM02_MENU_ID_TREE_1) > 0 ) || ( GXutil.strcmp(T000210_A2TAM02_MENU_ID_TREE_1[0], A2TAM02_MENU_ID_TREE_1) == 0 ) && ( GXutil.strcmp(T000210_A1TAM01_SYS_ID[0], A1TAM01_SYS_ID) == 0 ) && ( GXutil.strcmp(T000210_A3TAM02_MENU_ID_TREE_2[0], A3TAM02_MENU_ID_TREE_2) > 0 ) || ( GXutil.strcmp(T000210_A3TAM02_MENU_ID_TREE_2[0], A3TAM02_MENU_ID_TREE_2) == 0 ) && ( GXutil.strcmp(T000210_A2TAM02_MENU_ID_TREE_1[0], A2TAM02_MENU_ID_TREE_1) == 0 ) && ( GXutil.strcmp(T000210_A1TAM01_SYS_ID[0], A1TAM01_SYS_ID) == 0 ) && ( GXutil.strcmp(T000210_A4TAM02_MENU_ID_TREE_3[0], A4TAM02_MENU_ID_TREE_3) > 0 ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T000210_A1TAM01_SYS_ID[0], A1TAM01_SYS_ID) < 0 ) || ( GXutil.strcmp(T000210_A1TAM01_SYS_ID[0], A1TAM01_SYS_ID) == 0 ) && ( GXutil.strcmp(T000210_A2TAM02_MENU_ID_TREE_1[0], A2TAM02_MENU_ID_TREE_1) < 0 ) || ( GXutil.strcmp(T000210_A2TAM02_MENU_ID_TREE_1[0], A2TAM02_MENU_ID_TREE_1) == 0 ) && ( GXutil.strcmp(T000210_A1TAM01_SYS_ID[0], A1TAM01_SYS_ID) == 0 ) && ( GXutil.strcmp(T000210_A3TAM02_MENU_ID_TREE_2[0], A3TAM02_MENU_ID_TREE_2) < 0 ) || ( GXutil.strcmp(T000210_A3TAM02_MENU_ID_TREE_2[0], A3TAM02_MENU_ID_TREE_2) == 0 ) && ( GXutil.strcmp(T000210_A2TAM02_MENU_ID_TREE_1[0], A2TAM02_MENU_ID_TREE_1) == 0 ) && ( GXutil.strcmp(T000210_A1TAM01_SYS_ID[0], A1TAM01_SYS_ID) == 0 ) && ( GXutil.strcmp(T000210_A4TAM02_MENU_ID_TREE_3[0], A4TAM02_MENU_ID_TREE_3) < 0 ) ) )
         {
            A1TAM01_SYS_ID = T000210_A1TAM01_SYS_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1TAM01_SYS_ID", A1TAM01_SYS_ID);
            A2TAM02_MENU_ID_TREE_1 = T000210_A2TAM02_MENU_ID_TREE_1[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2TAM02_MENU_ID_TREE_1", A2TAM02_MENU_ID_TREE_1);
            A3TAM02_MENU_ID_TREE_2 = T000210_A3TAM02_MENU_ID_TREE_2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3TAM02_MENU_ID_TREE_2", A3TAM02_MENU_ID_TREE_2);
            A4TAM02_MENU_ID_TREE_3 = T000210_A4TAM02_MENU_ID_TREE_3[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4TAM02_MENU_ID_TREE_3", A4TAM02_MENU_ID_TREE_3);
            RcdFound2 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey022( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = dynTAM01_SYS_ID.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert022( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound2 == 1 )
         {
            if ( ( GXutil.strcmp(A1TAM01_SYS_ID, Z1TAM01_SYS_ID) != 0 ) || ( GXutil.strcmp(A2TAM02_MENU_ID_TREE_1, Z2TAM02_MENU_ID_TREE_1) != 0 ) || ( GXutil.strcmp(A3TAM02_MENU_ID_TREE_2, Z3TAM02_MENU_ID_TREE_2) != 0 ) || ( GXutil.strcmp(A4TAM02_MENU_ID_TREE_3, Z4TAM02_MENU_ID_TREE_3) != 0 ) )
            {
               A1TAM01_SYS_ID = Z1TAM01_SYS_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A1TAM01_SYS_ID", A1TAM01_SYS_ID);
               A2TAM02_MENU_ID_TREE_1 = Z2TAM02_MENU_ID_TREE_1 ;
               httpContext.ajax_rsp_assign_attri("", false, "A2TAM02_MENU_ID_TREE_1", A2TAM02_MENU_ID_TREE_1);
               A3TAM02_MENU_ID_TREE_2 = Z3TAM02_MENU_ID_TREE_2 ;
               httpContext.ajax_rsp_assign_attri("", false, "A3TAM02_MENU_ID_TREE_2", A3TAM02_MENU_ID_TREE_2);
               A4TAM02_MENU_ID_TREE_3 = Z4TAM02_MENU_ID_TREE_3 ;
               httpContext.ajax_rsp_assign_attri("", false, "A4TAM02_MENU_ID_TREE_3", A4TAM02_MENU_ID_TREE_3);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TAM01_SYS_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = dynTAM01_SYS_ID.getInternalname() ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = dynTAM01_SYS_ID.getInternalname() ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update022( ) ;
               GX_FocusControl = dynTAM01_SYS_ID.getInternalname() ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A1TAM01_SYS_ID, Z1TAM01_SYS_ID) != 0 ) || ( GXutil.strcmp(A2TAM02_MENU_ID_TREE_1, Z2TAM02_MENU_ID_TREE_1) != 0 ) || ( GXutil.strcmp(A3TAM02_MENU_ID_TREE_2, Z3TAM02_MENU_ID_TREE_2) != 0 ) || ( GXutil.strcmp(A4TAM02_MENU_ID_TREE_3, Z4TAM02_MENU_ID_TREE_3) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = dynTAM01_SYS_ID.getInternalname() ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert022( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TAM01_SYS_ID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = dynTAM01_SYS_ID.getInternalname() ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = dynTAM01_SYS_ID.getInternalname() ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert022( ) ;
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
      if ( ( GXutil.strcmp(A1TAM01_SYS_ID, Z1TAM01_SYS_ID) != 0 ) || ( GXutil.strcmp(A2TAM02_MENU_ID_TREE_1, Z2TAM02_MENU_ID_TREE_1) != 0 ) || ( GXutil.strcmp(A3TAM02_MENU_ID_TREE_2, Z3TAM02_MENU_ID_TREE_2) != 0 ) || ( GXutil.strcmp(A4TAM02_MENU_ID_TREE_3, Z4TAM02_MENU_ID_TREE_3) != 0 ) )
      {
         A1TAM01_SYS_ID = Z1TAM01_SYS_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A1TAM01_SYS_ID", A1TAM01_SYS_ID);
         A2TAM02_MENU_ID_TREE_1 = Z2TAM02_MENU_ID_TREE_1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A2TAM02_MENU_ID_TREE_1", A2TAM02_MENU_ID_TREE_1);
         A3TAM02_MENU_ID_TREE_2 = Z3TAM02_MENU_ID_TREE_2 ;
         httpContext.ajax_rsp_assign_attri("", false, "A3TAM02_MENU_ID_TREE_2", A3TAM02_MENU_ID_TREE_2);
         A4TAM02_MENU_ID_TREE_3 = Z4TAM02_MENU_ID_TREE_3 ;
         httpContext.ajax_rsp_assign_attri("", false, "A4TAM02_MENU_ID_TREE_3", A4TAM02_MENU_ID_TREE_3);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TAM01_SYS_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = dynTAM01_SYS_ID.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = dynTAM01_SYS_ID.getInternalname() ;
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
      getKey022( ) ;
      if ( RcdFound2 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "TAM01_SYS_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = dynTAM01_SYS_ID.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A1TAM01_SYS_ID, Z1TAM01_SYS_ID) != 0 ) || ( GXutil.strcmp(A2TAM02_MENU_ID_TREE_1, Z2TAM02_MENU_ID_TREE_1) != 0 ) || ( GXutil.strcmp(A3TAM02_MENU_ID_TREE_2, Z3TAM02_MENU_ID_TREE_2) != 0 ) || ( GXutil.strcmp(A4TAM02_MENU_ID_TREE_3, Z4TAM02_MENU_ID_TREE_3) != 0 ) )
         {
            A1TAM01_SYS_ID = Z1TAM01_SYS_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A1TAM01_SYS_ID", A1TAM01_SYS_ID);
            A2TAM02_MENU_ID_TREE_1 = Z2TAM02_MENU_ID_TREE_1 ;
            httpContext.ajax_rsp_assign_attri("", false, "A2TAM02_MENU_ID_TREE_1", A2TAM02_MENU_ID_TREE_1);
            A3TAM02_MENU_ID_TREE_2 = Z3TAM02_MENU_ID_TREE_2 ;
            httpContext.ajax_rsp_assign_attri("", false, "A3TAM02_MENU_ID_TREE_2", A3TAM02_MENU_ID_TREE_2);
            A4TAM02_MENU_ID_TREE_3 = Z4TAM02_MENU_ID_TREE_3 ;
            httpContext.ajax_rsp_assign_attri("", false, "A4TAM02_MENU_ID_TREE_3", A4TAM02_MENU_ID_TREE_3);
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "TAM01_SYS_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = dynTAM01_SYS_ID.getInternalname() ;
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
         if ( ( GXutil.strcmp(A1TAM01_SYS_ID, Z1TAM01_SYS_ID) != 0 ) || ( GXutil.strcmp(A2TAM02_MENU_ID_TREE_1, Z2TAM02_MENU_ID_TREE_1) != 0 ) || ( GXutil.strcmp(A3TAM02_MENU_ID_TREE_2, Z3TAM02_MENU_ID_TREE_2) != 0 ) || ( GXutil.strcmp(A4TAM02_MENU_ID_TREE_3, Z4TAM02_MENU_ID_TREE_3) != 0 ) )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            insert_check( ) ;
         }
         else
         {
            if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TAM01_SYS_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = dynTAM01_SYS_ID.getInternalname() ;
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
      Application.rollback(context, remoteHandle, "DEFAULT", "tam02_menu");
      GX_FocusControl = edtTAM02_APP_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_020( ) ;
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
      if ( RcdFound2 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TAM01_SYS_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = dynTAM01_SYS_ID.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtTAM02_APP_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart022( ) ;
      if ( RcdFound2 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTAM02_APP_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd022( ) ;
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
      if ( RcdFound2 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTAM02_APP_ID_Internalname ;
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
      if ( RcdFound2 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTAM02_APP_ID_Internalname ;
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
      scanStart022( ) ;
      if ( RcdFound2 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound2 != 0 )
         {
            scanNext022( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTAM02_APP_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd022( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency022( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T00022 */
         pr_default.execute(0, new Object[] {A1TAM01_SYS_ID, A2TAM02_MENU_ID_TREE_1, A3TAM02_MENU_ID_TREE_2, A4TAM02_MENU_ID_TREE_3});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TAM02_MENU"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z225TAM02_CRT_DATETIME.equals( T00022_A225TAM02_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z262TAM02_CRT_USER_ID, T00022_A262TAM02_CRT_USER_ID[0]) != 0 ) || !( Z227TAM02_UPD_DATETIME.equals( T00022_A227TAM02_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z263TAM02_UPD_USER_ID, T00022_A263TAM02_UPD_USER_ID[0]) != 0 ) || ( Z275TAM02_UPD_CNT != T00022_A275TAM02_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z211TAM02_MENU_NM, T00022_A211TAM02_MENU_NM[0]) != 0 ) || ( GXutil.strcmp(Z212TAM02_DEL_FLG, T00022_A212TAM02_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z226TAM02_CRT_PROG_NM, T00022_A226TAM02_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z228TAM02_UPD_PROG_NM, T00022_A228TAM02_UPD_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z5TAM02_APP_ID, T00022_A5TAM02_APP_ID[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TAM02_MENU"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert022( )
   {
      beforeValidate022( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable022( ) ;
      }
      if ( AnyError == 0 )
      {
         zm022( 0) ;
         checkOptimisticConcurrency022( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm022( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert022( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000211 */
                  pr_default.execute(9, new Object[] {A2TAM02_MENU_ID_TREE_1, A3TAM02_MENU_ID_TREE_2, A4TAM02_MENU_ID_TREE_3, new Boolean(n225TAM02_CRT_DATETIME), A225TAM02_CRT_DATETIME, new Boolean(n262TAM02_CRT_USER_ID), A262TAM02_CRT_USER_ID, new Boolean(n227TAM02_UPD_DATETIME), A227TAM02_UPD_DATETIME, new Boolean(n263TAM02_UPD_USER_ID), A263TAM02_UPD_USER_ID, new Boolean(n275TAM02_UPD_CNT), new Long(A275TAM02_UPD_CNT), new Boolean(n211TAM02_MENU_NM), A211TAM02_MENU_NM, new Boolean(n212TAM02_DEL_FLG), A212TAM02_DEL_FLG, new Boolean(n226TAM02_CRT_PROG_NM), A226TAM02_CRT_PROG_NM, new Boolean(n228TAM02_UPD_PROG_NM), A228TAM02_UPD_PROG_NM, A1TAM01_SYS_ID, new Boolean(n5TAM02_APP_ID), A5TAM02_APP_ID});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TAM02_MENU") ;
                  if ( (pr_default.getStatus(9) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     new tam02_pc01_datalog(remoteHandle, context).execute( AV14Pgmname, Gx_mode, A1TAM01_SYS_ID, A2TAM02_MENU_ID_TREE_1, A3TAM02_MENU_ID_TREE_2, A4TAM02_MENU_ID_TREE_3, A211TAM02_MENU_NM, A5TAM02_APP_ID, A212TAM02_DEL_FLG, A225TAM02_CRT_DATETIME, A262TAM02_CRT_USER_ID, A226TAM02_CRT_PROG_NM, A227TAM02_UPD_DATETIME, A263TAM02_UPD_USER_ID, A228TAM02_UPD_PROG_NM, A275TAM02_UPD_CNT) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     httpContext.ajax_rsp_assign_attri("", false, "A1TAM01_SYS_ID", A1TAM01_SYS_ID);
                     httpContext.ajax_rsp_assign_attri("", false, "A2TAM02_MENU_ID_TREE_1", A2TAM02_MENU_ID_TREE_1);
                     httpContext.ajax_rsp_assign_attri("", false, "A3TAM02_MENU_ID_TREE_2", A3TAM02_MENU_ID_TREE_2);
                     httpContext.ajax_rsp_assign_attri("", false, "A4TAM02_MENU_ID_TREE_3", A4TAM02_MENU_ID_TREE_3);
                     httpContext.ajax_rsp_assign_attri("", false, "A211TAM02_MENU_NM", A211TAM02_MENU_NM);
                     httpContext.ajax_rsp_assign_attri("", false, "A5TAM02_APP_ID", A5TAM02_APP_ID);
                     httpContext.ajax_rsp_assign_attri("", false, "A212TAM02_DEL_FLG", A212TAM02_DEL_FLG);
                     httpContext.ajax_rsp_assign_attri("", false, "A225TAM02_CRT_DATETIME", localUtil.ttoc( A225TAM02_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
                     httpContext.ajax_rsp_assign_attri("", false, "A262TAM02_CRT_USER_ID", A262TAM02_CRT_USER_ID);
                     httpContext.ajax_rsp_assign_attri("", false, "A226TAM02_CRT_PROG_NM", A226TAM02_CRT_PROG_NM);
                     httpContext.ajax_rsp_assign_attri("", false, "A227TAM02_UPD_DATETIME", localUtil.ttoc( A227TAM02_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
                     httpContext.ajax_rsp_assign_attri("", false, "A263TAM02_UPD_USER_ID", A263TAM02_UPD_USER_ID);
                     httpContext.ajax_rsp_assign_attri("", false, "A228TAM02_UPD_PROG_NM", A228TAM02_UPD_PROG_NM);
                     httpContext.ajax_rsp_assign_attri("", false, "A275TAM02_UPD_CNT", GXutil.ltrim( GXutil.str( A275TAM02_UPD_CNT, 10, 0)));
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucadded"), 0, "", true);
                        resetCaption020( ) ;
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
            load022( ) ;
         }
         endLevel022( ) ;
      }
      closeExtendedTableCursors022( ) ;
   }

   public void update022( )
   {
      beforeValidate022( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable022( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency022( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm022( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate022( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000212 */
                  pr_default.execute(10, new Object[] {new Boolean(n225TAM02_CRT_DATETIME), A225TAM02_CRT_DATETIME, new Boolean(n262TAM02_CRT_USER_ID), A262TAM02_CRT_USER_ID, new Boolean(n227TAM02_UPD_DATETIME), A227TAM02_UPD_DATETIME, new Boolean(n263TAM02_UPD_USER_ID), A263TAM02_UPD_USER_ID, new Boolean(n275TAM02_UPD_CNT), new Long(A275TAM02_UPD_CNT), new Boolean(n211TAM02_MENU_NM), A211TAM02_MENU_NM, new Boolean(n212TAM02_DEL_FLG), A212TAM02_DEL_FLG, new Boolean(n226TAM02_CRT_PROG_NM), A226TAM02_CRT_PROG_NM, new Boolean(n228TAM02_UPD_PROG_NM), A228TAM02_UPD_PROG_NM, new Boolean(n5TAM02_APP_ID), A5TAM02_APP_ID, A1TAM01_SYS_ID, A2TAM02_MENU_ID_TREE_1, A3TAM02_MENU_ID_TREE_2, A4TAM02_MENU_ID_TREE_3});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TAM02_MENU") ;
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TAM02_MENU"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate022( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     new tam02_pc01_datalog(remoteHandle, context).execute( AV14Pgmname, Gx_mode, A1TAM01_SYS_ID, A2TAM02_MENU_ID_TREE_1, A3TAM02_MENU_ID_TREE_2, A4TAM02_MENU_ID_TREE_3, A211TAM02_MENU_NM, A5TAM02_APP_ID, A212TAM02_DEL_FLG, A225TAM02_CRT_DATETIME, A262TAM02_CRT_USER_ID, A226TAM02_CRT_PROG_NM, A227TAM02_UPD_DATETIME, A263TAM02_UPD_USER_ID, A228TAM02_UPD_PROG_NM, A275TAM02_UPD_CNT) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     httpContext.ajax_rsp_assign_attri("", false, "A1TAM01_SYS_ID", A1TAM01_SYS_ID);
                     httpContext.ajax_rsp_assign_attri("", false, "A2TAM02_MENU_ID_TREE_1", A2TAM02_MENU_ID_TREE_1);
                     httpContext.ajax_rsp_assign_attri("", false, "A3TAM02_MENU_ID_TREE_2", A3TAM02_MENU_ID_TREE_2);
                     httpContext.ajax_rsp_assign_attri("", false, "A4TAM02_MENU_ID_TREE_3", A4TAM02_MENU_ID_TREE_3);
                     httpContext.ajax_rsp_assign_attri("", false, "A211TAM02_MENU_NM", A211TAM02_MENU_NM);
                     httpContext.ajax_rsp_assign_attri("", false, "A5TAM02_APP_ID", A5TAM02_APP_ID);
                     httpContext.ajax_rsp_assign_attri("", false, "A212TAM02_DEL_FLG", A212TAM02_DEL_FLG);
                     httpContext.ajax_rsp_assign_attri("", false, "A225TAM02_CRT_DATETIME", localUtil.ttoc( A225TAM02_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
                     httpContext.ajax_rsp_assign_attri("", false, "A262TAM02_CRT_USER_ID", A262TAM02_CRT_USER_ID);
                     httpContext.ajax_rsp_assign_attri("", false, "A226TAM02_CRT_PROG_NM", A226TAM02_CRT_PROG_NM);
                     httpContext.ajax_rsp_assign_attri("", false, "A227TAM02_UPD_DATETIME", localUtil.ttoc( A227TAM02_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
                     httpContext.ajax_rsp_assign_attri("", false, "A263TAM02_UPD_USER_ID", A263TAM02_UPD_USER_ID);
                     httpContext.ajax_rsp_assign_attri("", false, "A228TAM02_UPD_PROG_NM", A228TAM02_UPD_PROG_NM);
                     httpContext.ajax_rsp_assign_attri("", false, "A275TAM02_UPD_CNT", GXutil.ltrim( GXutil.str( A275TAM02_UPD_CNT, 10, 0)));
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "", true);
                        resetCaption020( ) ;
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
         endLevel022( ) ;
      }
      closeExtendedTableCursors022( ) ;
   }

   public void deferredUpdate022( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate022( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency022( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls022( ) ;
         afterConfirm022( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete022( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000213 */
               pr_default.execute(11, new Object[] {A1TAM01_SYS_ID, A2TAM02_MENU_ID_TREE_1, A3TAM02_MENU_ID_TREE_2, A4TAM02_MENU_ID_TREE_3});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TAM02_MENU") ;
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  new tam02_pc01_datalog(remoteHandle, context).execute( AV14Pgmname, Gx_mode, A1TAM01_SYS_ID, A2TAM02_MENU_ID_TREE_1, A3TAM02_MENU_ID_TREE_2, A4TAM02_MENU_ID_TREE_3, A211TAM02_MENU_NM, A5TAM02_APP_ID, A212TAM02_DEL_FLG, A225TAM02_CRT_DATETIME, A262TAM02_CRT_USER_ID, A226TAM02_CRT_PROG_NM, A227TAM02_UPD_DATETIME, A263TAM02_UPD_USER_ID, A228TAM02_UPD_PROG_NM, A275TAM02_UPD_CNT) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "A1TAM01_SYS_ID", A1TAM01_SYS_ID);
                  httpContext.ajax_rsp_assign_attri("", false, "A2TAM02_MENU_ID_TREE_1", A2TAM02_MENU_ID_TREE_1);
                  httpContext.ajax_rsp_assign_attri("", false, "A3TAM02_MENU_ID_TREE_2", A3TAM02_MENU_ID_TREE_2);
                  httpContext.ajax_rsp_assign_attri("", false, "A4TAM02_MENU_ID_TREE_3", A4TAM02_MENU_ID_TREE_3);
                  httpContext.ajax_rsp_assign_attri("", false, "A211TAM02_MENU_NM", A211TAM02_MENU_NM);
                  httpContext.ajax_rsp_assign_attri("", false, "A5TAM02_APP_ID", A5TAM02_APP_ID);
                  httpContext.ajax_rsp_assign_attri("", false, "A212TAM02_DEL_FLG", A212TAM02_DEL_FLG);
                  httpContext.ajax_rsp_assign_attri("", false, "A225TAM02_CRT_DATETIME", localUtil.ttoc( A225TAM02_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
                  httpContext.ajax_rsp_assign_attri("", false, "A262TAM02_CRT_USER_ID", A262TAM02_CRT_USER_ID);
                  httpContext.ajax_rsp_assign_attri("", false, "A226TAM02_CRT_PROG_NM", A226TAM02_CRT_PROG_NM);
                  httpContext.ajax_rsp_assign_attri("", false, "A227TAM02_UPD_DATETIME", localUtil.ttoc( A227TAM02_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
                  httpContext.ajax_rsp_assign_attri("", false, "A263TAM02_UPD_USER_ID", A263TAM02_UPD_USER_ID);
                  httpContext.ajax_rsp_assign_attri("", false, "A228TAM02_UPD_PROG_NM", A228TAM02_UPD_PROG_NM);
                  httpContext.ajax_rsp_assign_attri("", false, "A275TAM02_UPD_CNT", GXutil.ltrim( GXutil.str( A275TAM02_UPD_CNT, 10, 0)));
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound2 == 0 )
                     {
                        initAll022( ) ;
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
                     resetCaption020( ) ;
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
      sMode2 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel022( ) ;
      Gx_mode = sMode2 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls022( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV14Pgmname = "TAM02_MENU" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
         /* Using cursor T000214 */
         pr_default.execute(12, new Object[] {new Boolean(n5TAM02_APP_ID), A5TAM02_APP_ID});
         A318TAM02_APP_NM = T000214_A318TAM02_APP_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A318TAM02_APP_NM", A318TAM02_APP_NM);
         n318TAM02_APP_NM = T000214_n318TAM02_APP_NM[0] ;
         pr_default.close(12);
      }
   }

   public void endLevel022( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete022( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "tam02_menu");
         if ( AnyError == 0 )
         {
            confirmValues020( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "tam02_menu");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart022( )
   {
      /* Scan By routine */
      /* Using cursor T000215 */
      pr_default.execute(13);
      RcdFound2 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound2 = (short)(1) ;
         A1TAM01_SYS_ID = T000215_A1TAM01_SYS_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1TAM01_SYS_ID", A1TAM01_SYS_ID);
         A2TAM02_MENU_ID_TREE_1 = T000215_A2TAM02_MENU_ID_TREE_1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2TAM02_MENU_ID_TREE_1", A2TAM02_MENU_ID_TREE_1);
         A3TAM02_MENU_ID_TREE_2 = T000215_A3TAM02_MENU_ID_TREE_2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3TAM02_MENU_ID_TREE_2", A3TAM02_MENU_ID_TREE_2);
         A4TAM02_MENU_ID_TREE_3 = T000215_A4TAM02_MENU_ID_TREE_3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4TAM02_MENU_ID_TREE_3", A4TAM02_MENU_ID_TREE_3);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext022( )
   {
      /* Scan next routine */
      pr_default.readNext(13);
      RcdFound2 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound2 = (short)(1) ;
         A1TAM01_SYS_ID = T000215_A1TAM01_SYS_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1TAM01_SYS_ID", A1TAM01_SYS_ID);
         A2TAM02_MENU_ID_TREE_1 = T000215_A2TAM02_MENU_ID_TREE_1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2TAM02_MENU_ID_TREE_1", A2TAM02_MENU_ID_TREE_1);
         A3TAM02_MENU_ID_TREE_2 = T000215_A3TAM02_MENU_ID_TREE_2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3TAM02_MENU_ID_TREE_2", A3TAM02_MENU_ID_TREE_2);
         A4TAM02_MENU_ID_TREE_3 = T000215_A4TAM02_MENU_ID_TREE_3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4TAM02_MENU_ID_TREE_3", A4TAM02_MENU_ID_TREE_3);
      }
   }

   public void scanEnd022( )
   {
      pr_default.close(13);
   }

   public void afterConfirm022( )
   {
      /* After Confirm Rules */
      if ( (GXutil.strcmp("", A2TAM02_MENU_ID_TREE_1)==0) )
      {
         httpContext.GX_msglist.addItem("メニューID（階層１）を入力してください", 1, "TAM02_MENU_ID_TREE_1");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAM02_MENU_ID_TREE_1_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( 2 < GXutil.byteCount( A2TAM02_MENU_ID_TREE_1, "Shift-JIS") )
      {
         httpContext.GX_msglist.addItem("メニューID（階層１）は半角2桁以内になるようにしてください。", 1, "TAM02_MENU_ID_TREE_1");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAM02_MENU_ID_TREE_1_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( (GXutil.strcmp("", A3TAM02_MENU_ID_TREE_2)==0) )
      {
         httpContext.GX_msglist.addItem("メニューID（階層２）を入力してください", 1, "TAM02_MENU_ID_TREE_2");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAM02_MENU_ID_TREE_2_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( 2 < GXutil.byteCount( A3TAM02_MENU_ID_TREE_2, "Shift-JIS") )
      {
         httpContext.GX_msglist.addItem("メニューID（階層２）は半角2桁以内になるようにしてください。", 1, "TAM02_MENU_ID_TREE_2");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAM02_MENU_ID_TREE_2_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( (GXutil.strcmp("", A4TAM02_MENU_ID_TREE_3)==0) )
      {
         httpContext.GX_msglist.addItem("メニューID（階層３）を入力してください", 1, "TAM02_MENU_ID_TREE_3");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAM02_MENU_ID_TREE_3_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( 2 < GXutil.byteCount( A4TAM02_MENU_ID_TREE_3, "Shift-JIS") )
      {
         httpContext.GX_msglist.addItem("メニューID（階層３）は半角2桁以内になるようにしてください。", 1, "TAM02_MENU_ID_TREE_3");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAM02_MENU_ID_TREE_3_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( (GXutil.strcmp("", A211TAM02_MENU_NM)==0) )
      {
         httpContext.GX_msglist.addItem("メニュー名を入力してください", 1, "TAM02_MENU_NM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAM02_MENU_NM_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( 40 < GXutil.byteCount( A211TAM02_MENU_NM, "Shift-JIS") )
      {
         httpContext.GX_msglist.addItem("メニュー名は全角20桁又は半角40桁以内になるようにしてください。", 1, "TAM02_MENU_NM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAM02_MENU_NM_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( (GXutil.strcmp("", A5TAM02_APP_ID)==0) )
      {
         httpContext.GX_msglist.addItem("アプリケーションIDを入力してください", 1, "TAM02_APP_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAM02_APP_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( 7 < GXutil.byteCount( A5TAM02_APP_ID, "Shift-JIS") )
      {
         httpContext.GX_msglist.addItem("アプリケーションIDは半角7桁以内になるようにしてください。", 1, "TAM02_APP_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAM02_APP_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
   }

   public void beforeInsert022( )
   {
      /* Before Insert Rules */
      A225TAM02_CRT_DATETIME = GXutil.now( ) ;
      n225TAM02_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A225TAM02_CRT_DATETIME", localUtil.ttoc( A225TAM02_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A262TAM02_CRT_USER_ID ;
      GXv_char4[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tam02_menu_impl.this.GXt_char1 = GXv_char4[0] ;
      A262TAM02_CRT_USER_ID = GXt_char1 ;
      n262TAM02_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A262TAM02_CRT_USER_ID", A262TAM02_CRT_USER_ID);
      A227TAM02_UPD_DATETIME = GXutil.now( ) ;
      n227TAM02_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A227TAM02_UPD_DATETIME", localUtil.ttoc( A227TAM02_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A263TAM02_UPD_USER_ID ;
      GXv_char4[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tam02_menu_impl.this.GXt_char1 = GXv_char4[0] ;
      A263TAM02_UPD_USER_ID = GXt_char1 ;
      n263TAM02_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A263TAM02_UPD_USER_ID", A263TAM02_UPD_USER_ID);
      A275TAM02_UPD_CNT = (long)(O275TAM02_UPD_CNT+1) ;
      n275TAM02_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A275TAM02_UPD_CNT", GXutil.ltrim( GXutil.str( A275TAM02_UPD_CNT, 10, 0)));
   }

   public void beforeUpdate022( )
   {
      /* Before Update Rules */
      A227TAM02_UPD_DATETIME = GXutil.now( ) ;
      n227TAM02_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A227TAM02_UPD_DATETIME", localUtil.ttoc( A227TAM02_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A263TAM02_UPD_USER_ID ;
      GXv_char4[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tam02_menu_impl.this.GXt_char1 = GXv_char4[0] ;
      A263TAM02_UPD_USER_ID = GXt_char1 ;
      n263TAM02_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A263TAM02_UPD_USER_ID", A263TAM02_UPD_USER_ID);
      A275TAM02_UPD_CNT = (long)(O275TAM02_UPD_CNT+1) ;
      n275TAM02_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A275TAM02_UPD_CNT", GXutil.ltrim( GXutil.str( A275TAM02_UPD_CNT, 10, 0)));
   }

   public void beforeDelete022( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete022( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate022( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes022( )
   {
      dynTAM01_SYS_ID.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, dynTAM01_SYS_ID.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( dynTAM01_SYS_ID.getEnabled(), 5, 0)));
      edtTAM02_MENU_ID_TREE_1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM02_MENU_ID_TREE_1_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM02_MENU_ID_TREE_1_Enabled, 5, 0)));
      edtTAM02_MENU_ID_TREE_2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM02_MENU_ID_TREE_2_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM02_MENU_ID_TREE_2_Enabled, 5, 0)));
      edtTAM02_MENU_ID_TREE_3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM02_MENU_ID_TREE_3_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM02_MENU_ID_TREE_3_Enabled, 5, 0)));
      edtTAM02_APP_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM02_APP_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM02_APP_ID_Enabled, 5, 0)));
      edtTAM02_APP_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM02_APP_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM02_APP_NM_Enabled, 5, 0)));
      edtTAM02_MENU_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM02_MENU_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM02_MENU_NM_Enabled, 5, 0)));
      radTAM02_DEL_FLG.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, radTAM02_DEL_FLG.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( radTAM02_DEL_FLG.getEnabled(), 5, 0)));
      edtTAM02_CRT_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM02_CRT_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM02_CRT_DATETIME_Enabled, 5, 0)));
      edtTAM02_CRT_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM02_CRT_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM02_CRT_USER_ID_Enabled, 5, 0)));
      edtTAM02_CRT_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM02_CRT_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM02_CRT_PROG_NM_Enabled, 5, 0)));
      edtTAM02_UPD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM02_UPD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM02_UPD_DATETIME_Enabled, 5, 0)));
      edtTAM02_UPD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM02_UPD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM02_UPD_USER_ID_Enabled, 5, 0)));
      edtTAM02_UPD_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM02_UPD_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM02_UPD_PROG_NM_Enabled, 5, 0)));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues020( )
   {
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv());
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( "メニューIDマスタ") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?20177317134688");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("tam02_menu") +"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm022( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z1TAM01_SYS_ID", GXutil.rtrim( Z1TAM01_SYS_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z2TAM02_MENU_ID_TREE_1", GXutil.rtrim( Z2TAM02_MENU_ID_TREE_1));
      GxWebStd.gx_hidden_field( httpContext, "Z3TAM02_MENU_ID_TREE_2", GXutil.rtrim( Z3TAM02_MENU_ID_TREE_2));
      GxWebStd.gx_hidden_field( httpContext, "Z4TAM02_MENU_ID_TREE_3", GXutil.rtrim( Z4TAM02_MENU_ID_TREE_3));
      GxWebStd.gx_hidden_field( httpContext, "Z225TAM02_CRT_DATETIME", localUtil.ttoc( Z225TAM02_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z262TAM02_CRT_USER_ID", GXutil.rtrim( Z262TAM02_CRT_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z227TAM02_UPD_DATETIME", localUtil.ttoc( Z227TAM02_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z263TAM02_UPD_USER_ID", GXutil.rtrim( Z263TAM02_UPD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z275TAM02_UPD_CNT", GXutil.ltrim( localUtil.ntoc( Z275TAM02_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z211TAM02_MENU_NM", GXutil.rtrim( Z211TAM02_MENU_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z212TAM02_DEL_FLG", GXutil.rtrim( Z212TAM02_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z226TAM02_CRT_PROG_NM", GXutil.rtrim( Z226TAM02_CRT_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z228TAM02_UPD_PROG_NM", GXutil.rtrim( Z228TAM02_UPD_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z5TAM02_APP_ID", GXutil.rtrim( Z5TAM02_APP_ID));
      GxWebStd.gx_hidden_field( httpContext, "O275TAM02_UPD_CNT", GXutil.ltrim( localUtil.ntoc( O275TAM02_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      GxWebStd.gx_hidden_field( httpContext, "TAM02_UPD_CNT", GXutil.ltrim( localUtil.ntoc( A275TAM02_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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
      return "TAM02_MENU" ;
   }

   public String getPgmdesc( )
   {
      return "メニューIDマスタ" ;
   }

   public void initializeNonKey022( )
   {
      A225TAM02_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n225TAM02_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A225TAM02_CRT_DATETIME", localUtil.ttoc( A225TAM02_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n225TAM02_CRT_DATETIME = (GXutil.nullDate().equals(A225TAM02_CRT_DATETIME) ? true : false) ;
      A262TAM02_CRT_USER_ID = "" ;
      n262TAM02_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A262TAM02_CRT_USER_ID", A262TAM02_CRT_USER_ID);
      n262TAM02_CRT_USER_ID = ((GXutil.strcmp("", A262TAM02_CRT_USER_ID)==0) ? true : false) ;
      A227TAM02_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n227TAM02_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A227TAM02_UPD_DATETIME", localUtil.ttoc( A227TAM02_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n227TAM02_UPD_DATETIME = (GXutil.nullDate().equals(A227TAM02_UPD_DATETIME) ? true : false) ;
      A263TAM02_UPD_USER_ID = "" ;
      n263TAM02_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A263TAM02_UPD_USER_ID", A263TAM02_UPD_USER_ID);
      n263TAM02_UPD_USER_ID = ((GXutil.strcmp("", A263TAM02_UPD_USER_ID)==0) ? true : false) ;
      A275TAM02_UPD_CNT = 0 ;
      n275TAM02_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A275TAM02_UPD_CNT", GXutil.ltrim( GXutil.str( A275TAM02_UPD_CNT, 10, 0)));
      A211TAM02_MENU_NM = "" ;
      n211TAM02_MENU_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A211TAM02_MENU_NM", A211TAM02_MENU_NM);
      n211TAM02_MENU_NM = ((GXutil.strcmp("", A211TAM02_MENU_NM)==0) ? true : false) ;
      A5TAM02_APP_ID = "" ;
      n5TAM02_APP_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5TAM02_APP_ID", A5TAM02_APP_ID);
      n5TAM02_APP_ID = ((GXutil.strcmp("", A5TAM02_APP_ID)==0) ? true : false) ;
      A318TAM02_APP_NM = "" ;
      n318TAM02_APP_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A318TAM02_APP_NM", A318TAM02_APP_NM);
      A212TAM02_DEL_FLG = "0" ;
      n212TAM02_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A212TAM02_DEL_FLG", A212TAM02_DEL_FLG);
      A226TAM02_CRT_PROG_NM = AV14Pgmname ;
      n226TAM02_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A226TAM02_CRT_PROG_NM", A226TAM02_CRT_PROG_NM);
      A228TAM02_UPD_PROG_NM = AV14Pgmname ;
      n228TAM02_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A228TAM02_UPD_PROG_NM", A228TAM02_UPD_PROG_NM);
      O275TAM02_UPD_CNT = A275TAM02_UPD_CNT ;
      n275TAM02_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A275TAM02_UPD_CNT", GXutil.ltrim( GXutil.str( A275TAM02_UPD_CNT, 10, 0)));
   }

   public void initAll022( )
   {
      A1TAM01_SYS_ID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1TAM01_SYS_ID", A1TAM01_SYS_ID);
      A2TAM02_MENU_ID_TREE_1 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2TAM02_MENU_ID_TREE_1", A2TAM02_MENU_ID_TREE_1);
      A3TAM02_MENU_ID_TREE_2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3TAM02_MENU_ID_TREE_2", A3TAM02_MENU_ID_TREE_2);
      A4TAM02_MENU_ID_TREE_3 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4TAM02_MENU_ID_TREE_3", A4TAM02_MENU_ID_TREE_3);
      initializeNonKey022( ) ;
   }

   public void standaloneModalInsert( )
   {
      A212TAM02_DEL_FLG = i212TAM02_DEL_FLG ;
      n212TAM02_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A212TAM02_DEL_FLG", A212TAM02_DEL_FLG);
      A226TAM02_CRT_PROG_NM = i226TAM02_CRT_PROG_NM ;
      n226TAM02_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A226TAM02_CRT_PROG_NM", A226TAM02_CRT_PROG_NM);
      A228TAM02_UPD_PROG_NM = i228TAM02_UPD_PROG_NM ;
      n228TAM02_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A228TAM02_UPD_PROG_NM", A228TAM02_UPD_PROG_NM);
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("calendar-system.css", "?8960");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?17122662");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2017731713472");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("tam02_menu.js", "?2017731713474");
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
      lblTextblocktam01_sys_id_Internalname = "TEXTBLOCKTAM01_SYS_ID" ;
      dynTAM01_SYS_ID.setInternalname( "TAM01_SYS_ID" );
      imgImage20_Internalname = "IMAGE20" ;
      lblTextblocktam02_menu_id_tree_1_Internalname = "TEXTBLOCKTAM02_MENU_ID_TREE_1" ;
      edtTAM02_MENU_ID_TREE_1_Internalname = "TAM02_MENU_ID_TREE_1" ;
      imgImage21_Internalname = "IMAGE21" ;
      lblTextblocktam02_menu_id_tree_2_Internalname = "TEXTBLOCKTAM02_MENU_ID_TREE_2" ;
      edtTAM02_MENU_ID_TREE_2_Internalname = "TAM02_MENU_ID_TREE_2" ;
      imgImage22_Internalname = "IMAGE22" ;
      lblTextblocktam02_menu_id_tree_3_Internalname = "TEXTBLOCKTAM02_MENU_ID_TREE_3" ;
      edtTAM02_MENU_ID_TREE_3_Internalname = "TAM02_MENU_ID_TREE_3" ;
      imgImage23_Internalname = "IMAGE23" ;
      lblTextblocktam02_app_id_Internalname = "TEXTBLOCKTAM02_APP_ID" ;
      edtTAM02_APP_ID_Internalname = "TAM02_APP_ID" ;
      edtTAM02_APP_NM_Internalname = "TAM02_APP_NM" ;
      tblTable3_Internalname = "TABLE3" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      lblTextblock1_Internalname = "TEXTBLOCK1" ;
      tblTable5_Internalname = "TABLE5" ;
      imgImage24_Internalname = "IMAGE24" ;
      lblTextblocktam02_menu_nm_Internalname = "TEXTBLOCKTAM02_MENU_NM" ;
      edtTAM02_MENU_NM_Internalname = "TAM02_MENU_NM" ;
      lblTextblocktam01_del_flg_Internalname = "TEXTBLOCKTAM01_DEL_FLG" ;
      radTAM02_DEL_FLG.setInternalname( "TAM02_DEL_FLG" );
      lblTextblocktam02_crt_datetime_Internalname = "TEXTBLOCKTAM02_CRT_DATETIME" ;
      edtTAM02_CRT_DATETIME_Internalname = "TAM02_CRT_DATETIME" ;
      lblTextblocktam02_crt_user_id_Internalname = "TEXTBLOCKTAM02_CRT_USER_ID" ;
      edtTAM02_CRT_USER_ID_Internalname = "TAM02_CRT_USER_ID" ;
      lblTextblocktam02_crt_prog_nm_Internalname = "TEXTBLOCKTAM02_CRT_PROG_NM" ;
      edtTAM02_CRT_PROG_NM_Internalname = "TAM02_CRT_PROG_NM" ;
      lblTextblocktam02_upd_datetime_Internalname = "TEXTBLOCKTAM02_UPD_DATETIME" ;
      edtTAM02_UPD_DATETIME_Internalname = "TAM02_UPD_DATETIME" ;
      lblTextblocktam02_upd_user_id_Internalname = "TEXTBLOCKTAM02_UPD_USER_ID" ;
      edtTAM02_UPD_USER_ID_Internalname = "TAM02_UPD_USER_ID" ;
      lblTextblocktam02_upd_prog_nm_Internalname = "TEXTBLOCKTAM02_UPD_PROG_NM" ;
      edtTAM02_UPD_PROG_NM_Internalname = "TAM02_UPD_PROG_NM" ;
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
      edtTAM02_APP_NM_Jsonclick = "" ;
      edtTAM02_APP_NM_Enabled = 0 ;
      edtTAM02_APP_ID_Jsonclick = "" ;
      edtTAM02_APP_ID_Enabled = 1 ;
      edtTAM02_UPD_PROG_NM_Jsonclick = "" ;
      edtTAM02_UPD_PROG_NM_Enabled = 0 ;
      edtTAM02_UPD_PROG_NM_Visible = 1 ;
      edtTAM02_UPD_USER_ID_Jsonclick = "" ;
      edtTAM02_UPD_USER_ID_Enabled = 0 ;
      edtTAM02_UPD_DATETIME_Jsonclick = "" ;
      edtTAM02_UPD_DATETIME_Enabled = 0 ;
      edtTAM02_UPD_DATETIME_Visible = 1 ;
      edtTAM02_CRT_PROG_NM_Jsonclick = "" ;
      edtTAM02_CRT_PROG_NM_Enabled = 0 ;
      edtTAM02_CRT_PROG_NM_Visible = 1 ;
      edtTAM02_CRT_USER_ID_Jsonclick = "" ;
      edtTAM02_CRT_USER_ID_Enabled = 0 ;
      edtTAM02_CRT_DATETIME_Jsonclick = "" ;
      edtTAM02_CRT_DATETIME_Enabled = 0 ;
      edtTAM02_CRT_DATETIME_Visible = 1 ;
      radTAM02_DEL_FLG.setJsonclick( "" );
      radTAM02_DEL_FLG.setEnabled( 1 );
      edtTAM02_MENU_NM_Jsonclick = "" ;
      edtTAM02_MENU_NM_Enabled = 1 ;
      imgImage24_Visible = 1 ;
      imgImage23_Visible = 1 ;
      edtTAM02_MENU_ID_TREE_3_Jsonclick = "" ;
      edtTAM02_MENU_ID_TREE_3_Enabled = 1 ;
      imgImage22_Visible = 1 ;
      edtTAM02_MENU_ID_TREE_2_Jsonclick = "" ;
      edtTAM02_MENU_ID_TREE_2_Enabled = 1 ;
      imgImage21_Visible = 1 ;
      edtTAM02_MENU_ID_TREE_1_Jsonclick = "" ;
      edtTAM02_MENU_ID_TREE_1_Enabled = 1 ;
      imgImage20_Visible = 1 ;
      dynTAM01_SYS_ID.setJsonclick( "" );
      dynTAM01_SYS_ID.setEnabled( 1 );
      imgImage19_Visible = 1 ;
      lblBtn_cancel_Enabled = 1 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxdlatam01_sys_id021( )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "max-age=0");
      }
      httpContext.GX_webresponse.addString("(new Array( new Array(");
      gxdlatam01_sys_id_data021( ) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         httpContext.GX_webresponse.addString(gxwrpcisep+"{c:\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",d:\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}");
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      httpContext.GX_webresponse.addString(")");
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         httpContext.GX_webresponse.addString(",101");
      }
      httpContext.GX_webresponse.addString("))");
   }

   public void gxatam01_sys_id_html021( )
   {
      String gxdynajaxvalue ;
      gxdlatam01_sys_id_data021( ) ;
      gxdynajaxindex = 1 ;
      dynTAM01_SYS_ID.removeAllItems();
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = gxdynajaxctrlcodr.item(gxdynajaxindex) ;
         dynTAM01_SYS_ID.addItem(gxdynajaxvalue, gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
   }

   protected void gxdlatam01_sys_id_data021( )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      /* Using cursor T000216 */
      pr_default.execute(14);
      while ( (pr_default.getStatus(14) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.rtrim( T000216_A1TAM01_SYS_ID[0]));
         gxdynajaxctrldescr.add(GXutil.rtrim( T000216_A206TAM01_SYS_NM[0]));
         pr_default.readNext(14);
      }
      pr_default.close(14);
   }

   public void gx10asatam02_crt_user_id022( String Gx_mode )
   {
      GXt_char1 = A262TAM02_CRT_USER_ID ;
      GXv_char4[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tam02_menu_impl.this.GXt_char1 = GXv_char4[0] ;
      A262TAM02_CRT_USER_ID = GXt_char1 ;
      n262TAM02_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A262TAM02_CRT_USER_ID", A262TAM02_CRT_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A262TAM02_CRT_USER_ID))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void gx12asatam02_upd_user_id022( String Gx_mode )
   {
      GXt_char1 = A263TAM02_UPD_USER_ID ;
      GXv_char4[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tam02_menu_impl.this.GXt_char1 = GXv_char4[0] ;
      A263TAM02_UPD_USER_ID = GXt_char1 ;
      n263TAM02_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A263TAM02_UPD_USER_ID", A263TAM02_UPD_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A263TAM02_UPD_USER_ID))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void xc_34_022( String AV14Pgmname ,
                          String Gx_mode ,
                          String A1TAM01_SYS_ID ,
                          String A2TAM02_MENU_ID_TREE_1 ,
                          String A3TAM02_MENU_ID_TREE_2 ,
                          String A4TAM02_MENU_ID_TREE_3 ,
                          String A211TAM02_MENU_NM ,
                          String A5TAM02_APP_ID ,
                          String A212TAM02_DEL_FLG ,
                          java.util.Date A225TAM02_CRT_DATETIME ,
                          String A262TAM02_CRT_USER_ID ,
                          String A226TAM02_CRT_PROG_NM ,
                          java.util.Date A227TAM02_UPD_DATETIME ,
                          String A263TAM02_UPD_USER_ID ,
                          String A228TAM02_UPD_PROG_NM ,
                          long A275TAM02_UPD_CNT )
   {
      new tam02_pc01_datalog(remoteHandle, context).execute( AV14Pgmname, Gx_mode, A1TAM01_SYS_ID, A2TAM02_MENU_ID_TREE_1, A3TAM02_MENU_ID_TREE_2, A4TAM02_MENU_ID_TREE_3, A211TAM02_MENU_NM, A5TAM02_APP_ID, A212TAM02_DEL_FLG, A225TAM02_CRT_DATETIME, A262TAM02_CRT_USER_ID, A226TAM02_CRT_PROG_NM, A227TAM02_UPD_DATETIME, A263TAM02_UPD_USER_ID, A228TAM02_UPD_PROG_NM, A275TAM02_UPD_CNT) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "A1TAM01_SYS_ID", A1TAM01_SYS_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A2TAM02_MENU_ID_TREE_1", A2TAM02_MENU_ID_TREE_1);
      httpContext.ajax_rsp_assign_attri("", false, "A3TAM02_MENU_ID_TREE_2", A3TAM02_MENU_ID_TREE_2);
      httpContext.ajax_rsp_assign_attri("", false, "A4TAM02_MENU_ID_TREE_3", A4TAM02_MENU_ID_TREE_3);
      httpContext.ajax_rsp_assign_attri("", false, "A211TAM02_MENU_NM", A211TAM02_MENU_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A5TAM02_APP_ID", A5TAM02_APP_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A212TAM02_DEL_FLG", A212TAM02_DEL_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "A225TAM02_CRT_DATETIME", localUtil.ttoc( A225TAM02_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A262TAM02_CRT_USER_ID", A262TAM02_CRT_USER_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A226TAM02_CRT_PROG_NM", A226TAM02_CRT_PROG_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A227TAM02_UPD_DATETIME", localUtil.ttoc( A227TAM02_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A263TAM02_UPD_USER_ID", A263TAM02_UPD_USER_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A228TAM02_UPD_PROG_NM", A228TAM02_UPD_PROG_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A275TAM02_UPD_CNT", GXutil.ltrim( GXutil.str( A275TAM02_UPD_CNT, 10, 0)));
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

   public void xc_35_022( String AV14Pgmname ,
                          String Gx_mode ,
                          String A1TAM01_SYS_ID ,
                          String A2TAM02_MENU_ID_TREE_1 ,
                          String A3TAM02_MENU_ID_TREE_2 ,
                          String A4TAM02_MENU_ID_TREE_3 ,
                          String A211TAM02_MENU_NM ,
                          String A5TAM02_APP_ID ,
                          String A212TAM02_DEL_FLG ,
                          java.util.Date A225TAM02_CRT_DATETIME ,
                          String A262TAM02_CRT_USER_ID ,
                          String A226TAM02_CRT_PROG_NM ,
                          java.util.Date A227TAM02_UPD_DATETIME ,
                          String A263TAM02_UPD_USER_ID ,
                          String A228TAM02_UPD_PROG_NM ,
                          long A275TAM02_UPD_CNT )
   {
      new tam02_pc01_datalog(remoteHandle, context).execute( AV14Pgmname, Gx_mode, A1TAM01_SYS_ID, A2TAM02_MENU_ID_TREE_1, A3TAM02_MENU_ID_TREE_2, A4TAM02_MENU_ID_TREE_3, A211TAM02_MENU_NM, A5TAM02_APP_ID, A212TAM02_DEL_FLG, A225TAM02_CRT_DATETIME, A262TAM02_CRT_USER_ID, A226TAM02_CRT_PROG_NM, A227TAM02_UPD_DATETIME, A263TAM02_UPD_USER_ID, A228TAM02_UPD_PROG_NM, A275TAM02_UPD_CNT) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "A1TAM01_SYS_ID", A1TAM01_SYS_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A2TAM02_MENU_ID_TREE_1", A2TAM02_MENU_ID_TREE_1);
      httpContext.ajax_rsp_assign_attri("", false, "A3TAM02_MENU_ID_TREE_2", A3TAM02_MENU_ID_TREE_2);
      httpContext.ajax_rsp_assign_attri("", false, "A4TAM02_MENU_ID_TREE_3", A4TAM02_MENU_ID_TREE_3);
      httpContext.ajax_rsp_assign_attri("", false, "A211TAM02_MENU_NM", A211TAM02_MENU_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A5TAM02_APP_ID", A5TAM02_APP_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A212TAM02_DEL_FLG", A212TAM02_DEL_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "A225TAM02_CRT_DATETIME", localUtil.ttoc( A225TAM02_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A262TAM02_CRT_USER_ID", A262TAM02_CRT_USER_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A226TAM02_CRT_PROG_NM", A226TAM02_CRT_PROG_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A227TAM02_UPD_DATETIME", localUtil.ttoc( A227TAM02_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A263TAM02_UPD_USER_ID", A263TAM02_UPD_USER_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A228TAM02_UPD_PROG_NM", A228TAM02_UPD_PROG_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A275TAM02_UPD_CNT", GXutil.ltrim( GXutil.str( A275TAM02_UPD_CNT, 10, 0)));
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

   public void xc_36_022( String AV14Pgmname ,
                          String Gx_mode ,
                          String A1TAM01_SYS_ID ,
                          String A2TAM02_MENU_ID_TREE_1 ,
                          String A3TAM02_MENU_ID_TREE_2 ,
                          String A4TAM02_MENU_ID_TREE_3 ,
                          String A211TAM02_MENU_NM ,
                          String A5TAM02_APP_ID ,
                          String A212TAM02_DEL_FLG ,
                          java.util.Date A225TAM02_CRT_DATETIME ,
                          String A262TAM02_CRT_USER_ID ,
                          String A226TAM02_CRT_PROG_NM ,
                          java.util.Date A227TAM02_UPD_DATETIME ,
                          String A263TAM02_UPD_USER_ID ,
                          String A228TAM02_UPD_PROG_NM ,
                          long A275TAM02_UPD_CNT )
   {
      new tam02_pc01_datalog(remoteHandle, context).execute( AV14Pgmname, Gx_mode, A1TAM01_SYS_ID, A2TAM02_MENU_ID_TREE_1, A3TAM02_MENU_ID_TREE_2, A4TAM02_MENU_ID_TREE_3, A211TAM02_MENU_NM, A5TAM02_APP_ID, A212TAM02_DEL_FLG, A225TAM02_CRT_DATETIME, A262TAM02_CRT_USER_ID, A226TAM02_CRT_PROG_NM, A227TAM02_UPD_DATETIME, A263TAM02_UPD_USER_ID, A228TAM02_UPD_PROG_NM, A275TAM02_UPD_CNT) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "A1TAM01_SYS_ID", A1TAM01_SYS_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A2TAM02_MENU_ID_TREE_1", A2TAM02_MENU_ID_TREE_1);
      httpContext.ajax_rsp_assign_attri("", false, "A3TAM02_MENU_ID_TREE_2", A3TAM02_MENU_ID_TREE_2);
      httpContext.ajax_rsp_assign_attri("", false, "A4TAM02_MENU_ID_TREE_3", A4TAM02_MENU_ID_TREE_3);
      httpContext.ajax_rsp_assign_attri("", false, "A211TAM02_MENU_NM", A211TAM02_MENU_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A5TAM02_APP_ID", A5TAM02_APP_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A212TAM02_DEL_FLG", A212TAM02_DEL_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "A225TAM02_CRT_DATETIME", localUtil.ttoc( A225TAM02_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A262TAM02_CRT_USER_ID", A262TAM02_CRT_USER_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A226TAM02_CRT_PROG_NM", A226TAM02_CRT_PROG_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A227TAM02_UPD_DATETIME", localUtil.ttoc( A227TAM02_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A263TAM02_UPD_USER_ID", A263TAM02_UPD_USER_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A228TAM02_UPD_PROG_NM", A228TAM02_UPD_PROG_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A275TAM02_UPD_CNT", GXutil.ltrim( GXutil.str( A275TAM02_UPD_CNT, 10, 0)));
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
      /* Using cursor T000217 */
      pr_default.execute(15, new Object[] {A1TAM01_SYS_ID});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem("'システムIDマスタ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TAM01_SYS_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = dynTAM01_SYS_ID.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(15);
      GX_FocusControl = edtTAM02_APP_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Tam01_sys_id( com.genexus.webpanels.HTMLChoice GX_Parm1 )
   {
      dynTAM01_SYS_ID = GX_Parm1 ;
      A1TAM01_SYS_ID = dynTAM01_SYS_ID.getValue() ;
      /* Using cursor T000217 */
      pr_default.execute(15, new Object[] {A1TAM01_SYS_ID});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem("'システムIDマスタ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TAM01_SYS_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = dynTAM01_SYS_ID.getInternalname() ;
      }
      pr_default.close(15);
      dynload_actions( ) ;
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Tam02_menu_id_tree_3( com.genexus.webpanels.HTMLChoice GX_Parm1 ,
                                           String GX_Parm2 ,
                                           String GX_Parm3 ,
                                           String GX_Parm4 ,
                                           java.util.Date GX_Parm5 ,
                                           String GX_Parm6 ,
                                           java.util.Date GX_Parm7 ,
                                           String GX_Parm8 ,
                                           long GX_Parm9 ,
                                           String GX_Parm10 ,
                                           String GX_Parm11 ,
                                           String GX_Parm12 ,
                                           String GX_Parm13 ,
                                           String GX_Parm14 )
   {
      dynTAM01_SYS_ID = GX_Parm1 ;
      A1TAM01_SYS_ID = dynTAM01_SYS_ID.getValue() ;
      A2TAM02_MENU_ID_TREE_1 = GX_Parm2 ;
      A3TAM02_MENU_ID_TREE_2 = GX_Parm3 ;
      A4TAM02_MENU_ID_TREE_3 = GX_Parm4 ;
      A225TAM02_CRT_DATETIME = GX_Parm5 ;
      n225TAM02_CRT_DATETIME = false ;
      A262TAM02_CRT_USER_ID = GX_Parm6 ;
      n262TAM02_CRT_USER_ID = false ;
      A227TAM02_UPD_DATETIME = GX_Parm7 ;
      n227TAM02_UPD_DATETIME = false ;
      A263TAM02_UPD_USER_ID = GX_Parm8 ;
      n263TAM02_UPD_USER_ID = false ;
      A275TAM02_UPD_CNT = GX_Parm9 ;
      n275TAM02_UPD_CNT = false ;
      A211TAM02_MENU_NM = GX_Parm10 ;
      n211TAM02_MENU_NM = false ;
      A212TAM02_DEL_FLG = GX_Parm11 ;
      n212TAM02_DEL_FLG = false ;
      A226TAM02_CRT_PROG_NM = GX_Parm12 ;
      n226TAM02_CRT_PROG_NM = false ;
      A228TAM02_UPD_PROG_NM = GX_Parm13 ;
      n228TAM02_UPD_PROG_NM = false ;
      A5TAM02_APP_ID = GX_Parm14 ;
      n5TAM02_APP_ID = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A318TAM02_APP_NM = "" ;
         n318TAM02_APP_NM = false ;
      }
      isValidOutput.add(localUtil.format(A225TAM02_CRT_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A262TAM02_CRT_USER_ID));
      isValidOutput.add(localUtil.format(A227TAM02_UPD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A263TAM02_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A275TAM02_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A211TAM02_MENU_NM));
      isValidOutput.add(GXutil.rtrim( A5TAM02_APP_ID));
      isValidOutput.add(GXutil.rtrim( A212TAM02_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( A226TAM02_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( A228TAM02_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( AV14Pgmname));
      isValidOutput.add(GXutil.rtrim( A318TAM02_APP_NM));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.rtrim( Z1TAM01_SYS_ID));
      isValidOutput.add(GXutil.rtrim( Z2TAM02_MENU_ID_TREE_1));
      isValidOutput.add(GXutil.rtrim( Z3TAM02_MENU_ID_TREE_2));
      isValidOutput.add(GXutil.rtrim( Z4TAM02_MENU_ID_TREE_3));
      isValidOutput.add(localUtil.ttoc( Z225TAM02_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z262TAM02_CRT_USER_ID));
      isValidOutput.add(localUtil.ttoc( Z227TAM02_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z263TAM02_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z275TAM02_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z211TAM02_MENU_NM));
      isValidOutput.add(GXutil.rtrim( Z5TAM02_APP_ID));
      isValidOutput.add(GXutil.rtrim( Z212TAM02_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( Z226TAM02_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( Z228TAM02_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( ZV14Pgmname));
      isValidOutput.add(GXutil.rtrim( Z318TAM02_APP_NM));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( O275TAM02_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(dynTAM01_SYS_ID.getEnabled());
      isValidOutput.add(edtTAM02_MENU_ID_TREE_1_Enabled);
      isValidOutput.add(edtTAM02_MENU_ID_TREE_2_Enabled);
      isValidOutput.add(edtTAM02_MENU_ID_TREE_3_Enabled);
      isValidOutput.add(edtTAM02_CRT_DATETIME_Visible);
      isValidOutput.add(edtTAM02_CRT_PROG_NM_Visible);
      isValidOutput.add(edtTAM02_UPD_DATETIME_Visible);
      isValidOutput.add(edtTAM02_UPD_PROG_NM_Visible);
      isValidOutput.add(imgBtn_delete2_Enabled);
      isValidOutput.add(imgBtn_enter2_Enabled);
      isValidOutput.add(lblBtn_cancel_Enabled);
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Tam02_app_id( String GX_Parm1 ,
                                   String GX_Parm2 )
   {
      A5TAM02_APP_ID = GX_Parm1 ;
      n5TAM02_APP_ID = false ;
      A318TAM02_APP_NM = GX_Parm2 ;
      n318TAM02_APP_NM = false ;
      /* Using cursor T000214 */
      pr_default.execute(12, new Object[] {new Boolean(n5TAM02_APP_ID), A5TAM02_APP_ID});
      if ( (pr_default.getStatus(12) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A5TAM02_APP_ID)==0) ) )
         {
            httpContext.GX_msglist.addItem("'メニューIDマスタ・アプリケーションサブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TAM02_APP_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTAM02_APP_ID_Internalname ;
         }
      }
      A318TAM02_APP_NM = T000214_A318TAM02_APP_NM[0] ;
      n318TAM02_APP_NM = T000214_n318TAM02_APP_NM[0] ;
      pr_default.close(12);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A318TAM02_APP_NM = "" ;
         n318TAM02_APP_NM = false ;
      }
      isValidOutput.add(GXutil.rtrim( A318TAM02_APP_NM));
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
      pr_default.close(15);
      pr_default.close(12);
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
      Z1TAM01_SYS_ID = "" ;
      Z2TAM02_MENU_ID_TREE_1 = "" ;
      Z3TAM02_MENU_ID_TREE_2 = "" ;
      Z4TAM02_MENU_ID_TREE_3 = "" ;
      Z225TAM02_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z262TAM02_CRT_USER_ID = "" ;
      Z227TAM02_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z263TAM02_UPD_USER_ID = "" ;
      Z211TAM02_MENU_NM = "" ;
      Z212TAM02_DEL_FLG = "" ;
      Z226TAM02_CRT_PROG_NM = "" ;
      Z228TAM02_UPD_PROG_NM = "" ;
      Z5TAM02_APP_ID = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV14Pgmname = "" ;
      Gx_mode = "" ;
      A1TAM01_SYS_ID = "" ;
      A2TAM02_MENU_ID_TREE_1 = "" ;
      A3TAM02_MENU_ID_TREE_2 = "" ;
      A4TAM02_MENU_ID_TREE_3 = "" ;
      A211TAM02_MENU_NM = "" ;
      A5TAM02_APP_ID = "" ;
      A212TAM02_DEL_FLG = "" ;
      A225TAM02_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A262TAM02_CRT_USER_ID = "" ;
      A226TAM02_CRT_PROG_NM = "" ;
      A227TAM02_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A263TAM02_UPD_USER_ID = "" ;
      A228TAM02_UPD_PROG_NM = "" ;
      GXKey = "" ;
      T00026_A1TAM01_SYS_ID = new String[] {""} ;
      T00026_A206TAM01_SYS_NM = new String[] {""} ;
      T00026_n206TAM01_SYS_NM = new boolean[] {false} ;
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
      lblTextblocktam01_sys_id_Jsonclick = "" ;
      TempTags = "" ;
      lblTextblocktam02_menu_id_tree_1_Jsonclick = "" ;
      lblTextblocktam02_menu_id_tree_2_Jsonclick = "" ;
      lblTextblocktam02_menu_id_tree_3_Jsonclick = "" ;
      lblTextblocktam02_app_id_Jsonclick = "" ;
      lblTextblocktam02_menu_nm_Jsonclick = "" ;
      lblTextblocktam01_del_flg_Jsonclick = "" ;
      lblTextblocktam02_crt_datetime_Jsonclick = "" ;
      lblTextblocktam02_crt_user_id_Jsonclick = "" ;
      lblTextblocktam02_crt_prog_nm_Jsonclick = "" ;
      lblTextblocktam02_upd_datetime_Jsonclick = "" ;
      lblTextblocktam02_upd_user_id_Jsonclick = "" ;
      lblTextblocktam02_upd_prog_nm_Jsonclick = "" ;
      lblTextblock2_Jsonclick = "" ;
      lblTextblock1_Jsonclick = "" ;
      A318TAM02_APP_NM = "" ;
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
      Z318TAM02_APP_NM = "" ;
      T00027_A2TAM02_MENU_ID_TREE_1 = new String[] {""} ;
      T00027_A3TAM02_MENU_ID_TREE_2 = new String[] {""} ;
      T00027_A4TAM02_MENU_ID_TREE_3 = new String[] {""} ;
      T00027_A225TAM02_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00027_n225TAM02_CRT_DATETIME = new boolean[] {false} ;
      T00027_A262TAM02_CRT_USER_ID = new String[] {""} ;
      T00027_n262TAM02_CRT_USER_ID = new boolean[] {false} ;
      T00027_A227TAM02_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00027_n227TAM02_UPD_DATETIME = new boolean[] {false} ;
      T00027_A263TAM02_UPD_USER_ID = new String[] {""} ;
      T00027_n263TAM02_UPD_USER_ID = new boolean[] {false} ;
      T00027_A275TAM02_UPD_CNT = new long[1] ;
      T00027_n275TAM02_UPD_CNT = new boolean[] {false} ;
      T00027_A211TAM02_MENU_NM = new String[] {""} ;
      T00027_n211TAM02_MENU_NM = new boolean[] {false} ;
      T00027_A318TAM02_APP_NM = new String[] {""} ;
      T00027_n318TAM02_APP_NM = new boolean[] {false} ;
      T00027_A212TAM02_DEL_FLG = new String[] {""} ;
      T00027_n212TAM02_DEL_FLG = new boolean[] {false} ;
      T00027_A226TAM02_CRT_PROG_NM = new String[] {""} ;
      T00027_n226TAM02_CRT_PROG_NM = new boolean[] {false} ;
      T00027_A228TAM02_UPD_PROG_NM = new String[] {""} ;
      T00027_n228TAM02_UPD_PROG_NM = new boolean[] {false} ;
      T00027_A1TAM01_SYS_ID = new String[] {""} ;
      T00027_A5TAM02_APP_ID = new String[] {""} ;
      T00027_n5TAM02_APP_ID = new boolean[] {false} ;
      T00024_A1TAM01_SYS_ID = new String[] {""} ;
      T00025_A318TAM02_APP_NM = new String[] {""} ;
      T00025_n318TAM02_APP_NM = new boolean[] {false} ;
      T00028_A1TAM01_SYS_ID = new String[] {""} ;
      T00028_A2TAM02_MENU_ID_TREE_1 = new String[] {""} ;
      T00028_A3TAM02_MENU_ID_TREE_2 = new String[] {""} ;
      T00028_A4TAM02_MENU_ID_TREE_3 = new String[] {""} ;
      T00023_A2TAM02_MENU_ID_TREE_1 = new String[] {""} ;
      T00023_A3TAM02_MENU_ID_TREE_2 = new String[] {""} ;
      T00023_A4TAM02_MENU_ID_TREE_3 = new String[] {""} ;
      T00023_A225TAM02_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00023_n225TAM02_CRT_DATETIME = new boolean[] {false} ;
      T00023_A262TAM02_CRT_USER_ID = new String[] {""} ;
      T00023_n262TAM02_CRT_USER_ID = new boolean[] {false} ;
      T00023_A227TAM02_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00023_n227TAM02_UPD_DATETIME = new boolean[] {false} ;
      T00023_A263TAM02_UPD_USER_ID = new String[] {""} ;
      T00023_n263TAM02_UPD_USER_ID = new boolean[] {false} ;
      T00023_A275TAM02_UPD_CNT = new long[1] ;
      T00023_n275TAM02_UPD_CNT = new boolean[] {false} ;
      T00023_A211TAM02_MENU_NM = new String[] {""} ;
      T00023_n211TAM02_MENU_NM = new boolean[] {false} ;
      T00023_A212TAM02_DEL_FLG = new String[] {""} ;
      T00023_n212TAM02_DEL_FLG = new boolean[] {false} ;
      T00023_A226TAM02_CRT_PROG_NM = new String[] {""} ;
      T00023_n226TAM02_CRT_PROG_NM = new boolean[] {false} ;
      T00023_A228TAM02_UPD_PROG_NM = new String[] {""} ;
      T00023_n228TAM02_UPD_PROG_NM = new boolean[] {false} ;
      T00023_A1TAM01_SYS_ID = new String[] {""} ;
      T00023_A5TAM02_APP_ID = new String[] {""} ;
      T00023_n5TAM02_APP_ID = new boolean[] {false} ;
      sMode2 = "" ;
      T00029_A1TAM01_SYS_ID = new String[] {""} ;
      T00029_A2TAM02_MENU_ID_TREE_1 = new String[] {""} ;
      T00029_A3TAM02_MENU_ID_TREE_2 = new String[] {""} ;
      T00029_A4TAM02_MENU_ID_TREE_3 = new String[] {""} ;
      T000210_A1TAM01_SYS_ID = new String[] {""} ;
      T000210_A2TAM02_MENU_ID_TREE_1 = new String[] {""} ;
      T000210_A3TAM02_MENU_ID_TREE_2 = new String[] {""} ;
      T000210_A4TAM02_MENU_ID_TREE_3 = new String[] {""} ;
      T00022_A2TAM02_MENU_ID_TREE_1 = new String[] {""} ;
      T00022_A3TAM02_MENU_ID_TREE_2 = new String[] {""} ;
      T00022_A4TAM02_MENU_ID_TREE_3 = new String[] {""} ;
      T00022_A225TAM02_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00022_n225TAM02_CRT_DATETIME = new boolean[] {false} ;
      T00022_A262TAM02_CRT_USER_ID = new String[] {""} ;
      T00022_n262TAM02_CRT_USER_ID = new boolean[] {false} ;
      T00022_A227TAM02_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00022_n227TAM02_UPD_DATETIME = new boolean[] {false} ;
      T00022_A263TAM02_UPD_USER_ID = new String[] {""} ;
      T00022_n263TAM02_UPD_USER_ID = new boolean[] {false} ;
      T00022_A275TAM02_UPD_CNT = new long[1] ;
      T00022_n275TAM02_UPD_CNT = new boolean[] {false} ;
      T00022_A211TAM02_MENU_NM = new String[] {""} ;
      T00022_n211TAM02_MENU_NM = new boolean[] {false} ;
      T00022_A212TAM02_DEL_FLG = new String[] {""} ;
      T00022_n212TAM02_DEL_FLG = new boolean[] {false} ;
      T00022_A226TAM02_CRT_PROG_NM = new String[] {""} ;
      T00022_n226TAM02_CRT_PROG_NM = new boolean[] {false} ;
      T00022_A228TAM02_UPD_PROG_NM = new String[] {""} ;
      T00022_n228TAM02_UPD_PROG_NM = new boolean[] {false} ;
      T00022_A1TAM01_SYS_ID = new String[] {""} ;
      T00022_A5TAM02_APP_ID = new String[] {""} ;
      T00022_n5TAM02_APP_ID = new boolean[] {false} ;
      T000214_A318TAM02_APP_NM = new String[] {""} ;
      T000214_n318TAM02_APP_NM = new boolean[] {false} ;
      T000215_A1TAM01_SYS_ID = new String[] {""} ;
      T000215_A2TAM02_MENU_ID_TREE_1 = new String[] {""} ;
      T000215_A3TAM02_MENU_ID_TREE_2 = new String[] {""} ;
      T000215_A4TAM02_MENU_ID_TREE_3 = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i212TAM02_DEL_FLG = "" ;
      i226TAM02_CRT_PROG_NM = "" ;
      i228TAM02_UPD_PROG_NM = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      T000216_A1TAM01_SYS_ID = new String[] {""} ;
      T000216_A206TAM01_SYS_NM = new String[] {""} ;
      T000216_n206TAM01_SYS_NM = new boolean[] {false} ;
      GXt_char1 = "" ;
      GXv_char4 = new String [1] ;
      T000217_A1TAM01_SYS_ID = new String[] {""} ;
      ZV14Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tam02_menu__default(),
         new Object[] {
             new Object[] {
            T00022_A2TAM02_MENU_ID_TREE_1, T00022_A3TAM02_MENU_ID_TREE_2, T00022_A4TAM02_MENU_ID_TREE_3, T00022_A225TAM02_CRT_DATETIME, T00022_n225TAM02_CRT_DATETIME, T00022_A262TAM02_CRT_USER_ID, T00022_n262TAM02_CRT_USER_ID, T00022_A227TAM02_UPD_DATETIME, T00022_n227TAM02_UPD_DATETIME, T00022_A263TAM02_UPD_USER_ID,
            T00022_n263TAM02_UPD_USER_ID, T00022_A275TAM02_UPD_CNT, T00022_n275TAM02_UPD_CNT, T00022_A211TAM02_MENU_NM, T00022_n211TAM02_MENU_NM, T00022_A212TAM02_DEL_FLG, T00022_n212TAM02_DEL_FLG, T00022_A226TAM02_CRT_PROG_NM, T00022_n226TAM02_CRT_PROG_NM, T00022_A228TAM02_UPD_PROG_NM,
            T00022_n228TAM02_UPD_PROG_NM, T00022_A1TAM01_SYS_ID, T00022_A5TAM02_APP_ID, T00022_n5TAM02_APP_ID
            }
            , new Object[] {
            T00023_A2TAM02_MENU_ID_TREE_1, T00023_A3TAM02_MENU_ID_TREE_2, T00023_A4TAM02_MENU_ID_TREE_3, T00023_A225TAM02_CRT_DATETIME, T00023_n225TAM02_CRT_DATETIME, T00023_A262TAM02_CRT_USER_ID, T00023_n262TAM02_CRT_USER_ID, T00023_A227TAM02_UPD_DATETIME, T00023_n227TAM02_UPD_DATETIME, T00023_A263TAM02_UPD_USER_ID,
            T00023_n263TAM02_UPD_USER_ID, T00023_A275TAM02_UPD_CNT, T00023_n275TAM02_UPD_CNT, T00023_A211TAM02_MENU_NM, T00023_n211TAM02_MENU_NM, T00023_A212TAM02_DEL_FLG, T00023_n212TAM02_DEL_FLG, T00023_A226TAM02_CRT_PROG_NM, T00023_n226TAM02_CRT_PROG_NM, T00023_A228TAM02_UPD_PROG_NM,
            T00023_n228TAM02_UPD_PROG_NM, T00023_A1TAM01_SYS_ID, T00023_A5TAM02_APP_ID, T00023_n5TAM02_APP_ID
            }
            , new Object[] {
            T00024_A1TAM01_SYS_ID
            }
            , new Object[] {
            T00025_A318TAM02_APP_NM, T00025_n318TAM02_APP_NM
            }
            , new Object[] {
            T00026_A1TAM01_SYS_ID, T00026_A206TAM01_SYS_NM, T00026_n206TAM01_SYS_NM
            }
            , new Object[] {
            T00027_A2TAM02_MENU_ID_TREE_1, T00027_A3TAM02_MENU_ID_TREE_2, T00027_A4TAM02_MENU_ID_TREE_3, T00027_A225TAM02_CRT_DATETIME, T00027_n225TAM02_CRT_DATETIME, T00027_A262TAM02_CRT_USER_ID, T00027_n262TAM02_CRT_USER_ID, T00027_A227TAM02_UPD_DATETIME, T00027_n227TAM02_UPD_DATETIME, T00027_A263TAM02_UPD_USER_ID,
            T00027_n263TAM02_UPD_USER_ID, T00027_A275TAM02_UPD_CNT, T00027_n275TAM02_UPD_CNT, T00027_A211TAM02_MENU_NM, T00027_n211TAM02_MENU_NM, T00027_A318TAM02_APP_NM, T00027_n318TAM02_APP_NM, T00027_A212TAM02_DEL_FLG, T00027_n212TAM02_DEL_FLG, T00027_A226TAM02_CRT_PROG_NM,
            T00027_n226TAM02_CRT_PROG_NM, T00027_A228TAM02_UPD_PROG_NM, T00027_n228TAM02_UPD_PROG_NM, T00027_A1TAM01_SYS_ID, T00027_A5TAM02_APP_ID, T00027_n5TAM02_APP_ID
            }
            , new Object[] {
            T00028_A1TAM01_SYS_ID, T00028_A2TAM02_MENU_ID_TREE_1, T00028_A3TAM02_MENU_ID_TREE_2, T00028_A4TAM02_MENU_ID_TREE_3
            }
            , new Object[] {
            T00029_A1TAM01_SYS_ID, T00029_A2TAM02_MENU_ID_TREE_1, T00029_A3TAM02_MENU_ID_TREE_2, T00029_A4TAM02_MENU_ID_TREE_3
            }
            , new Object[] {
            T000210_A1TAM01_SYS_ID, T000210_A2TAM02_MENU_ID_TREE_1, T000210_A3TAM02_MENU_ID_TREE_2, T000210_A4TAM02_MENU_ID_TREE_3
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000214_A318TAM02_APP_NM, T000214_n318TAM02_APP_NM
            }
            , new Object[] {
            T000215_A1TAM01_SYS_ID, T000215_A2TAM02_MENU_ID_TREE_1, T000215_A3TAM02_MENU_ID_TREE_2, T000215_A4TAM02_MENU_ID_TREE_3
            }
            , new Object[] {
            T000216_A1TAM01_SYS_ID, T000216_A206TAM01_SYS_NM, T000216_n206TAM01_SYS_NM
            }
            , new Object[] {
            T000217_A1TAM01_SYS_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      Z228TAM02_UPD_PROG_NM = AV14Pgmname ;
      n228TAM02_UPD_PROG_NM = false ;
      Z226TAM02_CRT_PROG_NM = AV14Pgmname ;
      n226TAM02_CRT_PROG_NM = false ;
      AV14Pgmname = "TAM02_MENU" ;
      Z212TAM02_DEL_FLG = "0" ;
      n212TAM02_DEL_FLG = false ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound2 ;
   private short Gx_err ;
   private int trnEnded ;
   private int lblBtn_cancel_Enabled ;
   private int imgImage19_Visible ;
   private int imgImage20_Visible ;
   private int edtTAM02_MENU_ID_TREE_1_Enabled ;
   private int imgImage21_Visible ;
   private int edtTAM02_MENU_ID_TREE_2_Enabled ;
   private int imgImage22_Visible ;
   private int edtTAM02_MENU_ID_TREE_3_Enabled ;
   private int imgImage23_Visible ;
   private int imgImage24_Visible ;
   private int edtTAM02_MENU_NM_Enabled ;
   private int edtTAM02_CRT_DATETIME_Visible ;
   private int edtTAM02_CRT_DATETIME_Enabled ;
   private int edtTAM02_CRT_USER_ID_Enabled ;
   private int edtTAM02_CRT_PROG_NM_Visible ;
   private int edtTAM02_CRT_PROG_NM_Enabled ;
   private int edtTAM02_UPD_DATETIME_Visible ;
   private int edtTAM02_UPD_DATETIME_Enabled ;
   private int edtTAM02_UPD_USER_ID_Enabled ;
   private int edtTAM02_UPD_PROG_NM_Visible ;
   private int edtTAM02_UPD_PROG_NM_Enabled ;
   private int edtTAM02_APP_ID_Enabled ;
   private int edtTAM02_APP_NM_Enabled ;
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
   private int gxdynajaxindex ;
   private long Z275TAM02_UPD_CNT ;
   private long O275TAM02_UPD_CNT ;
   private long A275TAM02_UPD_CNT ;
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
   private String lblTextblocktam01_sys_id_Internalname ;
   private String lblTextblocktam01_sys_id_Jsonclick ;
   private String TempTags ;
   private String imgImage20_Internalname ;
   private String lblTextblocktam02_menu_id_tree_1_Internalname ;
   private String lblTextblocktam02_menu_id_tree_1_Jsonclick ;
   private String edtTAM02_MENU_ID_TREE_1_Internalname ;
   private String edtTAM02_MENU_ID_TREE_1_Jsonclick ;
   private String imgImage21_Internalname ;
   private String lblTextblocktam02_menu_id_tree_2_Internalname ;
   private String lblTextblocktam02_menu_id_tree_2_Jsonclick ;
   private String edtTAM02_MENU_ID_TREE_2_Internalname ;
   private String edtTAM02_MENU_ID_TREE_2_Jsonclick ;
   private String imgImage22_Internalname ;
   private String lblTextblocktam02_menu_id_tree_3_Internalname ;
   private String lblTextblocktam02_menu_id_tree_3_Jsonclick ;
   private String edtTAM02_MENU_ID_TREE_3_Internalname ;
   private String edtTAM02_MENU_ID_TREE_3_Jsonclick ;
   private String imgImage23_Internalname ;
   private String lblTextblocktam02_app_id_Internalname ;
   private String lblTextblocktam02_app_id_Jsonclick ;
   private String imgImage24_Internalname ;
   private String lblTextblocktam02_menu_nm_Internalname ;
   private String lblTextblocktam02_menu_nm_Jsonclick ;
   private String edtTAM02_MENU_NM_Internalname ;
   private String edtTAM02_MENU_NM_Jsonclick ;
   private String lblTextblocktam01_del_flg_Internalname ;
   private String lblTextblocktam01_del_flg_Jsonclick ;
   private String lblTextblocktam02_crt_datetime_Internalname ;
   private String lblTextblocktam02_crt_datetime_Jsonclick ;
   private String edtTAM02_CRT_DATETIME_Internalname ;
   private String edtTAM02_CRT_DATETIME_Jsonclick ;
   private String lblTextblocktam02_crt_user_id_Internalname ;
   private String lblTextblocktam02_crt_user_id_Jsonclick ;
   private String edtTAM02_CRT_USER_ID_Internalname ;
   private String edtTAM02_CRT_USER_ID_Jsonclick ;
   private String lblTextblocktam02_crt_prog_nm_Internalname ;
   private String lblTextblocktam02_crt_prog_nm_Jsonclick ;
   private String edtTAM02_CRT_PROG_NM_Internalname ;
   private String edtTAM02_CRT_PROG_NM_Jsonclick ;
   private String lblTextblocktam02_upd_datetime_Internalname ;
   private String lblTextblocktam02_upd_datetime_Jsonclick ;
   private String edtTAM02_UPD_DATETIME_Internalname ;
   private String edtTAM02_UPD_DATETIME_Jsonclick ;
   private String lblTextblocktam02_upd_user_id_Internalname ;
   private String lblTextblocktam02_upd_user_id_Jsonclick ;
   private String edtTAM02_UPD_USER_ID_Internalname ;
   private String edtTAM02_UPD_USER_ID_Jsonclick ;
   private String lblTextblocktam02_upd_prog_nm_Internalname ;
   private String lblTextblocktam02_upd_prog_nm_Jsonclick ;
   private String edtTAM02_UPD_PROG_NM_Internalname ;
   private String edtTAM02_UPD_PROG_NM_Jsonclick ;
   private String tblTable5_Internalname ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String lblTextblock1_Internalname ;
   private String lblTextblock1_Jsonclick ;
   private String tblTable3_Internalname ;
   private String edtTAM02_APP_ID_Internalname ;
   private String edtTAM02_APP_ID_Jsonclick ;
   private String edtTAM02_APP_NM_Internalname ;
   private String edtTAM02_APP_NM_Jsonclick ;
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
   private String sMode2 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String div_Internalname ;
   private String gxwrpcisep ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String ZV14Pgmname ;
   private String Gx_emsg ;
   private java.util.Date Z225TAM02_CRT_DATETIME ;
   private java.util.Date Z227TAM02_UPD_DATETIME ;
   private java.util.Date A225TAM02_CRT_DATETIME ;
   private java.util.Date A227TAM02_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean n211TAM02_MENU_NM ;
   private boolean n5TAM02_APP_ID ;
   private boolean n212TAM02_DEL_FLG ;
   private boolean n225TAM02_CRT_DATETIME ;
   private boolean n262TAM02_CRT_USER_ID ;
   private boolean n226TAM02_CRT_PROG_NM ;
   private boolean n227TAM02_UPD_DATETIME ;
   private boolean n263TAM02_UPD_USER_ID ;
   private boolean n228TAM02_UPD_PROG_NM ;
   private boolean n275TAM02_UPD_CNT ;
   private boolean wbErr ;
   private boolean n318TAM02_APP_NM ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean toggleJsOutput ;
   private String Z1TAM01_SYS_ID ;
   private String Z2TAM02_MENU_ID_TREE_1 ;
   private String Z3TAM02_MENU_ID_TREE_2 ;
   private String Z4TAM02_MENU_ID_TREE_3 ;
   private String Z262TAM02_CRT_USER_ID ;
   private String Z263TAM02_UPD_USER_ID ;
   private String Z211TAM02_MENU_NM ;
   private String Z212TAM02_DEL_FLG ;
   private String Z226TAM02_CRT_PROG_NM ;
   private String Z228TAM02_UPD_PROG_NM ;
   private String Z5TAM02_APP_ID ;
   private String A1TAM01_SYS_ID ;
   private String A2TAM02_MENU_ID_TREE_1 ;
   private String A3TAM02_MENU_ID_TREE_2 ;
   private String A4TAM02_MENU_ID_TREE_3 ;
   private String A211TAM02_MENU_NM ;
   private String A5TAM02_APP_ID ;
   private String A212TAM02_DEL_FLG ;
   private String A262TAM02_CRT_USER_ID ;
   private String A226TAM02_CRT_PROG_NM ;
   private String A263TAM02_UPD_USER_ID ;
   private String A228TAM02_UPD_PROG_NM ;
   private String A318TAM02_APP_NM ;
   private String AV7C_TAM02_APP_ID ;
   private String AV9W_ERRCD ;
   private String AV12W_MSG ;
   private String AV10W_KNGN_FLG ;
   private String Z318TAM02_APP_NM ;
   private String i212TAM02_DEL_FLG ;
   private String i226TAM02_CRT_PROG_NM ;
   private String i228TAM02_UPD_PROG_NM ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private String[] T00026_A1TAM01_SYS_ID ;
   private String[] T00026_A206TAM01_SYS_NM ;
   private boolean[] T00026_n206TAM01_SYS_NM ;
   private HTMLChoice dynTAM01_SYS_ID ;
   private HTMLChoice radTAM02_DEL_FLG ;
   private String[] T00027_A2TAM02_MENU_ID_TREE_1 ;
   private String[] T00027_A3TAM02_MENU_ID_TREE_2 ;
   private String[] T00027_A4TAM02_MENU_ID_TREE_3 ;
   private java.util.Date[] T00027_A225TAM02_CRT_DATETIME ;
   private boolean[] T00027_n225TAM02_CRT_DATETIME ;
   private String[] T00027_A262TAM02_CRT_USER_ID ;
   private boolean[] T00027_n262TAM02_CRT_USER_ID ;
   private java.util.Date[] T00027_A227TAM02_UPD_DATETIME ;
   private boolean[] T00027_n227TAM02_UPD_DATETIME ;
   private String[] T00027_A263TAM02_UPD_USER_ID ;
   private boolean[] T00027_n263TAM02_UPD_USER_ID ;
   private long[] T00027_A275TAM02_UPD_CNT ;
   private boolean[] T00027_n275TAM02_UPD_CNT ;
   private String[] T00027_A211TAM02_MENU_NM ;
   private boolean[] T00027_n211TAM02_MENU_NM ;
   private String[] T00027_A318TAM02_APP_NM ;
   private boolean[] T00027_n318TAM02_APP_NM ;
   private String[] T00027_A212TAM02_DEL_FLG ;
   private boolean[] T00027_n212TAM02_DEL_FLG ;
   private String[] T00027_A226TAM02_CRT_PROG_NM ;
   private boolean[] T00027_n226TAM02_CRT_PROG_NM ;
   private String[] T00027_A228TAM02_UPD_PROG_NM ;
   private boolean[] T00027_n228TAM02_UPD_PROG_NM ;
   private String[] T00027_A1TAM01_SYS_ID ;
   private String[] T00027_A5TAM02_APP_ID ;
   private boolean[] T00027_n5TAM02_APP_ID ;
   private String[] T00024_A1TAM01_SYS_ID ;
   private String[] T00025_A318TAM02_APP_NM ;
   private boolean[] T00025_n318TAM02_APP_NM ;
   private String[] T00028_A1TAM01_SYS_ID ;
   private String[] T00028_A2TAM02_MENU_ID_TREE_1 ;
   private String[] T00028_A3TAM02_MENU_ID_TREE_2 ;
   private String[] T00028_A4TAM02_MENU_ID_TREE_3 ;
   private String[] T00023_A2TAM02_MENU_ID_TREE_1 ;
   private String[] T00023_A3TAM02_MENU_ID_TREE_2 ;
   private String[] T00023_A4TAM02_MENU_ID_TREE_3 ;
   private java.util.Date[] T00023_A225TAM02_CRT_DATETIME ;
   private boolean[] T00023_n225TAM02_CRT_DATETIME ;
   private String[] T00023_A262TAM02_CRT_USER_ID ;
   private boolean[] T00023_n262TAM02_CRT_USER_ID ;
   private java.util.Date[] T00023_A227TAM02_UPD_DATETIME ;
   private boolean[] T00023_n227TAM02_UPD_DATETIME ;
   private String[] T00023_A263TAM02_UPD_USER_ID ;
   private boolean[] T00023_n263TAM02_UPD_USER_ID ;
   private long[] T00023_A275TAM02_UPD_CNT ;
   private boolean[] T00023_n275TAM02_UPD_CNT ;
   private String[] T00023_A211TAM02_MENU_NM ;
   private boolean[] T00023_n211TAM02_MENU_NM ;
   private String[] T00023_A212TAM02_DEL_FLG ;
   private boolean[] T00023_n212TAM02_DEL_FLG ;
   private String[] T00023_A226TAM02_CRT_PROG_NM ;
   private boolean[] T00023_n226TAM02_CRT_PROG_NM ;
   private String[] T00023_A228TAM02_UPD_PROG_NM ;
   private boolean[] T00023_n228TAM02_UPD_PROG_NM ;
   private String[] T00023_A1TAM01_SYS_ID ;
   private String[] T00023_A5TAM02_APP_ID ;
   private boolean[] T00023_n5TAM02_APP_ID ;
   private String[] T00029_A1TAM01_SYS_ID ;
   private String[] T00029_A2TAM02_MENU_ID_TREE_1 ;
   private String[] T00029_A3TAM02_MENU_ID_TREE_2 ;
   private String[] T00029_A4TAM02_MENU_ID_TREE_3 ;
   private String[] T000210_A1TAM01_SYS_ID ;
   private String[] T000210_A2TAM02_MENU_ID_TREE_1 ;
   private String[] T000210_A3TAM02_MENU_ID_TREE_2 ;
   private String[] T000210_A4TAM02_MENU_ID_TREE_3 ;
   private String[] T00022_A2TAM02_MENU_ID_TREE_1 ;
   private String[] T00022_A3TAM02_MENU_ID_TREE_2 ;
   private String[] T00022_A4TAM02_MENU_ID_TREE_3 ;
   private java.util.Date[] T00022_A225TAM02_CRT_DATETIME ;
   private boolean[] T00022_n225TAM02_CRT_DATETIME ;
   private String[] T00022_A262TAM02_CRT_USER_ID ;
   private boolean[] T00022_n262TAM02_CRT_USER_ID ;
   private java.util.Date[] T00022_A227TAM02_UPD_DATETIME ;
   private boolean[] T00022_n227TAM02_UPD_DATETIME ;
   private String[] T00022_A263TAM02_UPD_USER_ID ;
   private boolean[] T00022_n263TAM02_UPD_USER_ID ;
   private long[] T00022_A275TAM02_UPD_CNT ;
   private boolean[] T00022_n275TAM02_UPD_CNT ;
   private String[] T00022_A211TAM02_MENU_NM ;
   private boolean[] T00022_n211TAM02_MENU_NM ;
   private String[] T00022_A212TAM02_DEL_FLG ;
   private boolean[] T00022_n212TAM02_DEL_FLG ;
   private String[] T00022_A226TAM02_CRT_PROG_NM ;
   private boolean[] T00022_n226TAM02_CRT_PROG_NM ;
   private String[] T00022_A228TAM02_UPD_PROG_NM ;
   private boolean[] T00022_n228TAM02_UPD_PROG_NM ;
   private String[] T00022_A1TAM01_SYS_ID ;
   private String[] T00022_A5TAM02_APP_ID ;
   private boolean[] T00022_n5TAM02_APP_ID ;
   private String[] T000214_A318TAM02_APP_NM ;
   private boolean[] T000214_n318TAM02_APP_NM ;
   private String[] T000215_A1TAM01_SYS_ID ;
   private String[] T000215_A2TAM02_MENU_ID_TREE_1 ;
   private String[] T000215_A3TAM02_MENU_ID_TREE_2 ;
   private String[] T000215_A4TAM02_MENU_ID_TREE_3 ;
   private String[] T000216_A1TAM01_SYS_ID ;
   private String[] T000216_A206TAM01_SYS_NM ;
   private boolean[] T000216_n206TAM01_SYS_NM ;
   private String[] T000217_A1TAM01_SYS_ID ;
   private SdtA_LOGIN_SDT AV8W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT3[] ;
}

final  class tam02_menu__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00022", "SELECT `TAM02_MENU_ID_TREE_1`, `TAM02_MENU_ID_TREE_2`, `TAM02_MENU_ID_TREE_3`, `TAM02_CRT_DATETIME`, `TAM02_CRT_USER_ID`, `TAM02_UPD_DATETIME`, `TAM02_UPD_USER_ID`, `TAM02_UPD_CNT`, `TAM02_MENU_NM`, `TAM02_DEL_FLG`, `TAM02_CRT_PROG_NM`, `TAM02_UPD_PROG_NM`, `TAM01_SYS_ID`, `TAM02_APP_ID` AS TAM02_APP_ID FROM `TAM02_MENU` WHERE `TAM01_SYS_ID` = ? AND `TAM02_MENU_ID_TREE_1` = ? AND `TAM02_MENU_ID_TREE_2` = ? AND `TAM02_MENU_ID_TREE_3` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00023", "SELECT `TAM02_MENU_ID_TREE_1`, `TAM02_MENU_ID_TREE_2`, `TAM02_MENU_ID_TREE_3`, `TAM02_CRT_DATETIME`, `TAM02_CRT_USER_ID`, `TAM02_UPD_DATETIME`, `TAM02_UPD_USER_ID`, `TAM02_UPD_CNT`, `TAM02_MENU_NM`, `TAM02_DEL_FLG`, `TAM02_CRT_PROG_NM`, `TAM02_UPD_PROG_NM`, `TAM01_SYS_ID`, `TAM02_APP_ID` AS TAM02_APP_ID FROM `TAM02_MENU` WHERE `TAM01_SYS_ID` = ? AND `TAM02_MENU_ID_TREE_1` = ? AND `TAM02_MENU_ID_TREE_2` = ? AND `TAM02_MENU_ID_TREE_3` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00024", "SELECT `TAM01_SYS_ID` FROM `TAM01_SYS` WHERE `TAM01_SYS_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00025", "SELECT `TAM03_APP_NM` AS TAM02_APP_NM FROM `TAM03_APPLI` WHERE `TAM03_APP_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00026", "SELECT `TAM01_SYS_ID`, `TAM01_SYS_NM` FROM `TAM01_SYS` ",true, GX_NOMASK, false, this,0,0,false )
         ,new ForEachCursor("T00027", "SELECT TM1.`TAM02_MENU_ID_TREE_1`, TM1.`TAM02_MENU_ID_TREE_2`, TM1.`TAM02_MENU_ID_TREE_3`, TM1.`TAM02_CRT_DATETIME`, TM1.`TAM02_CRT_USER_ID`, TM1.`TAM02_UPD_DATETIME`, TM1.`TAM02_UPD_USER_ID`, TM1.`TAM02_UPD_CNT`, TM1.`TAM02_MENU_NM`, T2.`TAM03_APP_NM` AS TAM02_APP_NM, TM1.`TAM02_DEL_FLG`, TM1.`TAM02_CRT_PROG_NM`, TM1.`TAM02_UPD_PROG_NM`, TM1.`TAM01_SYS_ID`, TM1.`TAM02_APP_ID` AS TAM02_APP_ID FROM (`TAM02_MENU` TM1 LEFT JOIN `TAM03_APPLI` T2 ON T2.`TAM03_APP_ID` = TM1.`TAM02_APP_ID`) WHERE TM1.`TAM01_SYS_ID` = ? and TM1.`TAM02_MENU_ID_TREE_1` = ? and TM1.`TAM02_MENU_ID_TREE_2` = ? and TM1.`TAM02_MENU_ID_TREE_3` = ? ORDER BY TM1.`TAM01_SYS_ID`, TM1.`TAM02_MENU_ID_TREE_1`, TM1.`TAM02_MENU_ID_TREE_2`, TM1.`TAM02_MENU_ID_TREE_3` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T00028", "SELECT `TAM01_SYS_ID`, `TAM02_MENU_ID_TREE_1`, `TAM02_MENU_ID_TREE_2`, `TAM02_MENU_ID_TREE_3` FROM `TAM02_MENU` WHERE `TAM01_SYS_ID` = ? AND `TAM02_MENU_ID_TREE_1` = ? AND `TAM02_MENU_ID_TREE_2` = ? AND `TAM02_MENU_ID_TREE_3` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00029", "SELECT `TAM01_SYS_ID`, `TAM02_MENU_ID_TREE_1`, `TAM02_MENU_ID_TREE_2`, `TAM02_MENU_ID_TREE_3` FROM `TAM02_MENU` WHERE ( `TAM01_SYS_ID` > ? or `TAM01_SYS_ID` = ? and `TAM02_MENU_ID_TREE_1` > ? or `TAM02_MENU_ID_TREE_1` = ? and `TAM01_SYS_ID` = ? and `TAM02_MENU_ID_TREE_2` > ? or `TAM02_MENU_ID_TREE_2` = ? and `TAM02_MENU_ID_TREE_1` = ? and `TAM01_SYS_ID` = ? and `TAM02_MENU_ID_TREE_3` > ?) ORDER BY `TAM01_SYS_ID`, `TAM02_MENU_ID_TREE_1`, `TAM02_MENU_ID_TREE_2`, `TAM02_MENU_ID_TREE_3`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000210", "SELECT `TAM01_SYS_ID`, `TAM02_MENU_ID_TREE_1`, `TAM02_MENU_ID_TREE_2`, `TAM02_MENU_ID_TREE_3` FROM `TAM02_MENU` WHERE ( `TAM01_SYS_ID` < ? or `TAM01_SYS_ID` = ? and `TAM02_MENU_ID_TREE_1` < ? or `TAM02_MENU_ID_TREE_1` = ? and `TAM01_SYS_ID` = ? and `TAM02_MENU_ID_TREE_2` < ? or `TAM02_MENU_ID_TREE_2` = ? and `TAM02_MENU_ID_TREE_1` = ? and `TAM01_SYS_ID` = ? and `TAM02_MENU_ID_TREE_3` < ?) ORDER BY `TAM01_SYS_ID` DESC, `TAM02_MENU_ID_TREE_1` DESC, `TAM02_MENU_ID_TREE_2` DESC, `TAM02_MENU_ID_TREE_3` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000211", "INSERT INTO `TAM02_MENU`(`TAM02_MENU_ID_TREE_1`, `TAM02_MENU_ID_TREE_2`, `TAM02_MENU_ID_TREE_3`, `TAM02_CRT_DATETIME`, `TAM02_CRT_USER_ID`, `TAM02_UPD_DATETIME`, `TAM02_UPD_USER_ID`, `TAM02_UPD_CNT`, `TAM02_MENU_NM`, `TAM02_DEL_FLG`, `TAM02_CRT_PROG_NM`, `TAM02_UPD_PROG_NM`, `TAM01_SYS_ID`, `TAM02_APP_ID`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T000212", "UPDATE `TAM02_MENU` SET `TAM02_CRT_DATETIME`=?, `TAM02_CRT_USER_ID`=?, `TAM02_UPD_DATETIME`=?, `TAM02_UPD_USER_ID`=?, `TAM02_UPD_CNT`=?, `TAM02_MENU_NM`=?, `TAM02_DEL_FLG`=?, `TAM02_CRT_PROG_NM`=?, `TAM02_UPD_PROG_NM`=?, `TAM02_APP_ID`=?  WHERE `TAM01_SYS_ID` = ? AND `TAM02_MENU_ID_TREE_1` = ? AND `TAM02_MENU_ID_TREE_2` = ? AND `TAM02_MENU_ID_TREE_3` = ?", GX_NOMASK)
         ,new UpdateCursor("T000213", "DELETE FROM `TAM02_MENU`  WHERE `TAM01_SYS_ID` = ? AND `TAM02_MENU_ID_TREE_1` = ? AND `TAM02_MENU_ID_TREE_2` = ? AND `TAM02_MENU_ID_TREE_3` = ?", GX_NOMASK)
         ,new ForEachCursor("T000214", "SELECT `TAM03_APP_NM` AS TAM02_APP_NM FROM `TAM03_APPLI` WHERE `TAM03_APP_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000215", "SELECT `TAM01_SYS_ID`, `TAM02_MENU_ID_TREE_1`, `TAM02_MENU_ID_TREE_2`, `TAM02_MENU_ID_TREE_3` FROM `TAM02_MENU` ORDER BY `TAM01_SYS_ID`, `TAM02_MENU_ID_TREE_1`, `TAM02_MENU_ID_TREE_2`, `TAM02_MENU_ID_TREE_3` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000216", "SELECT `TAM01_SYS_ID`, `TAM01_SYS_NM` FROM `TAM01_SYS` ",true, GX_NOMASK, false, this,0,0,false )
         ,new ForEachCursor("T000217", "SELECT `TAM01_SYS_ID` FROM `TAM01_SYS` WHERE `TAM01_SYS_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
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
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((long[]) buf[11])[0] = rslt.getLong(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(13) ;
               ((String[]) buf[22])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((long[]) buf[11])[0] = rslt.getLong(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(13) ;
               ((String[]) buf[22])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((long[]) buf[11])[0] = rslt.getLong(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(14) ;
               ((String[]) buf[24])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 15 :
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
               stmt.setVarchar(2, (String)parms[1], 2, false);
               stmt.setVarchar(3, (String)parms[2], 2, false);
               stmt.setVarchar(4, (String)parms[3], 2, false);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               stmt.setVarchar(2, (String)parms[1], 2, false);
               stmt.setVarchar(3, (String)parms[2], 2, false);
               stmt.setVarchar(4, (String)parms[3], 2, false);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 7, false);
               }
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               stmt.setVarchar(2, (String)parms[1], 2, false);
               stmt.setVarchar(3, (String)parms[2], 2, false);
               stmt.setVarchar(4, (String)parms[3], 2, false);
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               stmt.setVarchar(2, (String)parms[1], 2, false);
               stmt.setVarchar(3, (String)parms[2], 2, false);
               stmt.setVarchar(4, (String)parms[3], 2, false);
               return;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               stmt.setVarchar(2, (String)parms[1], 2, false);
               stmt.setVarchar(3, (String)parms[2], 2, false);
               stmt.setVarchar(4, (String)parms[3], 2, false);
               stmt.setVarchar(5, (String)parms[4], 2, false);
               stmt.setVarchar(6, (String)parms[5], 2, false);
               stmt.setVarchar(7, (String)parms[6], 2, false);
               stmt.setVarchar(8, (String)parms[7], 2, false);
               stmt.setVarchar(9, (String)parms[8], 2, false);
               stmt.setVarchar(10, (String)parms[9], 2, false);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               stmt.setVarchar(2, (String)parms[1], 2, false);
               stmt.setVarchar(3, (String)parms[2], 2, false);
               stmt.setVarchar(4, (String)parms[3], 2, false);
               stmt.setVarchar(5, (String)parms[4], 2, false);
               stmt.setVarchar(6, (String)parms[5], 2, false);
               stmt.setVarchar(7, (String)parms[6], 2, false);
               stmt.setVarchar(8, (String)parms[7], 2, false);
               stmt.setVarchar(9, (String)parms[8], 2, false);
               stmt.setVarchar(10, (String)parms[9], 2, false);
               return;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               stmt.setVarchar(2, (String)parms[1], 2, false);
               stmt.setVarchar(3, (String)parms[2], 2, false);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[4], false);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[6], 128);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(6, (java.util.Date)parms[8], false);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[10], 128);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(8, ((Number) parms[12]).longValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[14], 50);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[16], 1);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[18], 40);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[20], 40);
               }
               stmt.setVarchar(13, (String)parms[21], 2, false);
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[23], 7);
               }
               return;
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
                  stmt.setVarchar(6, (String)parms[11], 50);
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
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[19], 7);
               }
               stmt.setVarchar(11, (String)parms[20], 2, false);
               stmt.setVarchar(12, (String)parms[21], 2, false);
               stmt.setVarchar(13, (String)parms[22], 2, false);
               stmt.setVarchar(14, (String)parms[23], 2, false);
               return;
            case 11 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               stmt.setVarchar(2, (String)parms[1], 2, false);
               stmt.setVarchar(3, (String)parms[2], 2, false);
               stmt.setVarchar(4, (String)parms[3], 2, false);
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 7, false);
               }
               return;
            case 15 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
      }
   }

}

