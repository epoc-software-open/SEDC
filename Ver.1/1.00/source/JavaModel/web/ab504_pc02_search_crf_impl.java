/*
               File: ab504_pc02_search_crf_impl
        Description: CRF検索
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:10.67
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ab504_pc02_search_crf_impl extends GXWebProcedure
{
   public ab504_pc02_search_crf_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public void webExecute( )
   {
      GXKey = context.getSiteKey( ) ;
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetNextPar( ) ;
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV25C_APP_ID = "B504" ;
      AV18W_ERR_CD = (short)(0) ;
      AV19W_ERR_MSG = "" ;
      GXt_char1 = AV22W_NEWLINE ;
      GXv_char2[0] = GXt_char1 ;
      new b802_pc02_nl_airres(remoteHandle, context).execute( GXv_char2) ;
      ab504_pc02_search_crf_impl.this.GXt_char1 = GXv_char2[0] ;
      AV22W_NEWLINE = GXt_char1 ;
      AV26W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV26W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV25C_APP_ID );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26W_EXTRA_INFO", AV26W_EXTRA_INFO);
      /* Execute user subroutine: S12117 */
      S12117 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: S13172 */
      S13172 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      new a804_pc01_syslog(remoteHandle, context).execute( AV31Pgmname, "INFO", AV32Pgmdesc) ;
      AV23W_RTN_CSV.clear();
      if ( AV18W_ERR_CD == 0 )
      {
         /* Execute user subroutine: S1165 */
         S1165 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      if ( AV18W_ERR_CD == 0 )
      {
         GXv_objcol_svchar3[0] = AV23W_RTN_CSV ;
         GXv_int4[0] = AV18W_ERR_CD ;
         GXv_char2[0] = AV19W_ERR_MSG ;
         new b599_pc27_search_crf_res(remoteHandle, context).execute( AV16P_USER_ID, AV14P_STUDY_ID, AV8P_AUTH_CD, AV12P_SITE, AV15P_SUBJECT, AV9P_CRF, AV11P_QUICK_SEARCH, AV13P_SORT, GXv_objcol_svchar3, GXv_int4, GXv_char2) ;
         AV23W_RTN_CSV = GXv_objcol_svchar3[0] ;
         ab504_pc02_search_crf_impl.this.AV18W_ERR_CD = GXv_int4[0] ;
         ab504_pc02_search_crf_impl.this.AV19W_ERR_MSG = GXv_char2[0] ;
      }
      AV21W_HTTP_RES.addString(GXutil.trim( GXutil.str( AV18W_ERR_CD, 10, 0))+AV22W_NEWLINE);
      AV21W_HTTP_RES.addString(AV19W_ERR_MSG);
      if ( AV18W_ERR_CD == 0 )
      {
         AV17W_CNT = 1 ;
         while ( AV17W_CNT <= AV23W_RTN_CSV.size() )
         {
            AV21W_HTTP_RES.addString(AV22W_NEWLINE+(String)AV23W_RTN_CSV.elementAt(-1+(int)(AV17W_CNT)));
            AV17W_CNT = (long)(AV17W_CNT+1) ;
         }
      }
      /* Execute user subroutine: S14188 */
      S14188 ();
      if ( returnInSub )
      {
      }
      if ( ! (GXutil.strcmp("", httpContext.wjLoc)==0) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
   }

   public void S1165( )
   {
      /* 'SUB_CHECK_PARM' Routine */
      if ( AV18W_ERR_CD == 0 )
      {
         if ( (GXutil.strcmp("", AV14P_STUDY_ID)==0) )
         {
            AV18W_ERR_CD = (short)(1) ;
            GXt_char1 = AV19W_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00001", "試験ID", "", "", "", "", GXv_char2) ;
            ab504_pc02_search_crf_impl.this.GXt_char1 = GXv_char2[0] ;
            AV19W_ERR_MSG = GXt_char1 ;
         }
      }
      if ( AV18W_ERR_CD == 0 )
      {
         if ( (GXutil.strcmp("", AV13P_SORT)==0) )
         {
            AV18W_ERR_CD = (short)(1) ;
            GXt_char1 = AV19W_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00007", "ソート条件", "", "", "", "", GXv_char2) ;
            ab504_pc02_search_crf_impl.this.GXt_char1 = GXv_char2[0] ;
            AV19W_ERR_MSG = GXt_char1 ;
         }
      }
      if ( ( AV18W_ERR_CD == 0 ) && ! (GXutil.strcmp("", AV13P_SORT)==0) )
      {
         if ( ! ((GXutil.strcmp(AV13P_SORT, "1")==0)||(GXutil.strcmp(AV13P_SORT, "2")==0)||(GXutil.strcmp(AV13P_SORT, "3")==0)||(GXutil.strcmp(AV13P_SORT, "4")==0)||(GXutil.strcmp(AV13P_SORT, "5")==0)) )
         {
            AV18W_ERR_CD = (short)(1) ;
            GXt_char1 = AV19W_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00026", "ソート条件", "", "", "", "", GXv_char2) ;
            ab504_pc02_search_crf_impl.this.GXt_char1 = GXv_char2[0] ;
            AV19W_ERR_MSG = GXt_char1 ;
         }
      }
      if ( ( AV18W_ERR_CD == 0 ) && ! (GXutil.strcmp("", AV11P_QUICK_SEARCH)==0) )
      {
         if ( ! ((GXutil.strcmp(AV11P_QUICK_SEARCH, "1")==0)||(GXutil.strcmp(AV11P_QUICK_SEARCH, "2")==0)||(GXutil.strcmp(AV11P_QUICK_SEARCH, "3")==0)||(GXutil.strcmp(AV11P_QUICK_SEARCH, "4")==0)||(GXutil.strcmp(AV11P_QUICK_SEARCH, "5")==0)||(GXutil.strcmp(AV11P_QUICK_SEARCH, "6")==0)) )
         {
            AV18W_ERR_CD = (short)(1) ;
            GXt_char1 = AV19W_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00026", "簡易検索", "", "", "", "", GXv_char2) ;
            ab504_pc02_search_crf_impl.this.GXt_char1 = GXv_char2[0] ;
            AV19W_ERR_MSG = GXt_char1 ;
         }
      }
      if ( AV18W_ERR_CD == 0 )
      {
         if ( GXutil.strcmp(AV11P_QUICK_SEARCH, "1") == 0 )
         {
            AV24W_STUDY_ID = GXutil.lval( AV14P_STUDY_ID) ;
            AV33GXLvl100 = (byte)(0) ;
            Gx_ope = "Fetch" ;
            Gx_etb = "TBM23_STUDY_STAFF" ;
            /* Using cursor P002S2 */
            pr_default.execute(0, new Object[] {new Long(AV24W_STUDY_ID), AV16P_USER_ID, AV8P_AUTH_CD});
            while ( (pr_default.getStatus(0) != 101) )
            {
               A209TBM23_DEL_FLG = P002S2_A209TBM23_DEL_FLG[0] ;
               n209TBM23_DEL_FLG = P002S2_n209TBM23_DEL_FLG[0] ;
               A407TBM23_STYDY_AUTH_CD = P002S2_A407TBM23_STYDY_AUTH_CD[0] ;
               A208TBM23_USER_ID = P002S2_A208TBM23_USER_ID[0] ;
               A207TBM23_STUDY_ID = P002S2_A207TBM23_STUDY_ID[0] ;
               AV33GXLvl100 = (byte)(1) ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(0);
            if ( AV33GXLvl100 == 0 )
            {
               AV18W_ERR_CD = (short)(1) ;
               GXt_char1 = AV19W_ERR_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AE00039", "", "", "", "", "", GXv_char2) ;
               ab504_pc02_search_crf_impl.this.GXt_char1 = GXv_char2[0] ;
               AV19W_ERR_MSG = GXt_char1 ;
            }
         }
      }
   }

   public void S12117( )
   {
      /* 'SUB_GET_PARM' Routine */
      AV16P_USER_ID = AV20W_HTTP_REQ.getVariable("USER_ID") ;
      AV10P_PWD = AV20W_HTTP_REQ.getVariable("PW") ;
      AV14P_STUDY_ID = AV20W_HTTP_REQ.getVariable("STUDY_ID") ;
      AV8P_AUTH_CD = AV20W_HTTP_REQ.getVariable("AUTH_CD") ;
      AV12P_SITE = AV20W_HTTP_REQ.getVariable("SITE") ;
      AV15P_SUBJECT = AV20W_HTTP_REQ.getVariable("SUBJECT") ;
      AV9P_CRF = AV20W_HTTP_REQ.getVariable("CRF") ;
      AV11P_QUICK_SEARCH = AV20W_HTTP_REQ.getVariable("QUICK") ;
      AV13P_SORT = AV20W_HTTP_REQ.getVariable("SORT") ;
      AV26W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      AV28W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV28W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "USER_ID" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28W_PARMS_ITEM", AV28W_PARMS_ITEM);
      AV28W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV16P_USER_ID );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28W_PARMS_ITEM", AV28W_PARMS_ITEM);
      AV26W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV28W_PARMS_ITEM, 0);
      AV28W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV28W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "STUDY_ID" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28W_PARMS_ITEM", AV28W_PARMS_ITEM);
      AV28W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV14P_STUDY_ID );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28W_PARMS_ITEM", AV28W_PARMS_ITEM);
      AV26W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV28W_PARMS_ITEM, 0);
      AV28W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV28W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "AUTH_CD" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28W_PARMS_ITEM", AV28W_PARMS_ITEM);
      AV28W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV8P_AUTH_CD );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28W_PARMS_ITEM", AV28W_PARMS_ITEM);
      AV26W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV28W_PARMS_ITEM, 0);
      AV28W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV28W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "SITE" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28W_PARMS_ITEM", AV28W_PARMS_ITEM);
      AV28W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV12P_SITE );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28W_PARMS_ITEM", AV28W_PARMS_ITEM);
      AV26W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV28W_PARMS_ITEM, 0);
      AV28W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV28W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "SUBJECT" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28W_PARMS_ITEM", AV28W_PARMS_ITEM);
      AV28W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV15P_SUBJECT );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28W_PARMS_ITEM", AV28W_PARMS_ITEM);
      AV26W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV28W_PARMS_ITEM, 0);
      AV28W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV28W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "CRF" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28W_PARMS_ITEM", AV28W_PARMS_ITEM);
      AV28W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV9P_CRF );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28W_PARMS_ITEM", AV28W_PARMS_ITEM);
      AV26W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV28W_PARMS_ITEM, 0);
      AV28W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV28W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "QUICK" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28W_PARMS_ITEM", AV28W_PARMS_ITEM);
      AV28W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV11P_QUICK_SEARCH );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28W_PARMS_ITEM", AV28W_PARMS_ITEM);
      AV26W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV28W_PARMS_ITEM, 0);
      AV28W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV28W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "SORT" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28W_PARMS_ITEM", AV28W_PARMS_ITEM);
      AV28W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV13P_SORT );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28W_PARMS_ITEM", AV28W_PARMS_ITEM);
      AV26W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV28W_PARMS_ITEM, 0);
      AV27W_MSG = "SUB_GET_PARM" ;
      GXv_SdtB808_SD01_EXTRA_INFO5[0] = AV26W_EXTRA_INFO;
      GXv_int4[0] = AV18W_ERR_CD ;
      GXv_char2[0] = AV19W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV31Pgmname, (short)(1), AV27W_MSG, GXv_SdtB808_SD01_EXTRA_INFO5, GXv_int4, GXv_char2) ;
      AV26W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO5[0] ;
      ab504_pc02_search_crf_impl.this.AV18W_ERR_CD = GXv_int4[0] ;
      ab504_pc02_search_crf_impl.this.AV19W_ERR_MSG = GXv_char2[0] ;
   }

   public void S13172( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      if ( ! httpContext.isAjaxRequest( ) )
      {
         AV21W_HTTP_RES.addHeader("Content-Type", "text/plain; charset=UTF-8");
      }
      GXv_char2[0] = AV16P_USER_ID ;
      GXv_int4[0] = AV18W_ERR_CD ;
      GXv_char6[0] = AV19W_ERR_MSG ;
      new b101_pc01_login(remoteHandle, context).execute( GXv_char2, AV10P_PWD, GXv_int4, GXv_char6) ;
      ab504_pc02_search_crf_impl.this.AV16P_USER_ID = GXv_char2[0] ;
      ab504_pc02_search_crf_impl.this.AV18W_ERR_CD = GXv_int4[0] ;
      ab504_pc02_search_crf_impl.this.AV19W_ERR_MSG = GXv_char6[0] ;
   }

   public void S14188( )
   {
      /* 'SUB_TERMINATE' Routine */
      if ( AV18W_ERR_CD == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "ab504_pc02_search_crf");
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "ab504_pc02_search_crf");
      }
      AV27W_MSG = "Error Result" + GXutil.chr( (short)(9)) + " Code:" + GXutil.trim( GXutil.str( AV18W_ERR_CD, 10, 0)) + GXutil.chr( (short)(9)) + "Message:" + AV19W_ERR_MSG ;
      GXv_SdtB808_SD01_EXTRA_INFO5[0] = AV26W_EXTRA_INFO;
      GXv_int4[0] = AV18W_ERR_CD ;
      GXv_char6[0] = AV19W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV31Pgmname, (short)(1), AV27W_MSG, GXv_SdtB808_SD01_EXTRA_INFO5, GXv_int4, GXv_char6) ;
      AV26W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO5[0] ;
      ab504_pc02_search_crf_impl.this.AV18W_ERR_CD = GXv_int4[0] ;
      ab504_pc02_search_crf_impl.this.AV19W_ERR_MSG = GXv_char6[0] ;
      GXv_int4[0] = AV18W_ERR_CD ;
      GXv_char6[0] = AV19W_ERR_MSG ;
      new b101_pc02_logout(remoteHandle, context).execute( GXv_int4, GXv_char6) ;
      ab504_pc02_search_crf_impl.this.AV18W_ERR_CD = GXv_int4[0] ;
      ab504_pc02_search_crf_impl.this.AV19W_ERR_MSG = GXv_char6[0] ;
   }

   public void S15207( )
   {
      /* 'SUB_ERROR' Routine */
      AV27W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO5[0] = AV26W_EXTRA_INFO;
      GXv_int4[0] = AV18W_ERR_CD ;
      GXv_char6[0] = AV19W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV31Pgmname, (short)(0), AV27W_MSG, GXv_SdtB808_SD01_EXTRA_INFO5, GXv_int4, GXv_char6) ;
      AV26W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO5[0] ;
      ab504_pc02_search_crf_impl.this.AV18W_ERR_CD = GXv_int4[0] ;
      ab504_pc02_search_crf_impl.this.AV19W_ERR_MSG = GXv_char6[0] ;
      context.globals.Gx_eop = (byte)(0) ;
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      super.cleanup();
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
                  /* Execute user subroutine: S15207 */
                  S15207 ();
                  if ( returnInSub )
                  {
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
                  break;
         }
      }
   }

   public void initialize( )
   {
      GXKey = "" ;
      gxfirstwebparm = "" ;
      AV25C_APP_ID = "" ;
      AV19W_ERR_MSG = "" ;
      AV22W_NEWLINE = "" ;
      AV26W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV31Pgmname = "" ;
      AV32Pgmdesc = "" ;
      AV23W_RTN_CSV = new GxObjectCollection(String.class, "internal", "");
      AV16P_USER_ID = "" ;
      AV14P_STUDY_ID = "" ;
      AV8P_AUTH_CD = "" ;
      AV12P_SITE = "" ;
      AV15P_SUBJECT = "" ;
      AV9P_CRF = "" ;
      AV11P_QUICK_SEARCH = "" ;
      AV13P_SORT = "" ;
      GXv_objcol_svchar3 = new GxObjectCollection [1] ;
      AV21W_HTTP_RES = httpContext.getHttpResponse();
      scmdbuf = "" ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      P002S2_A209TBM23_DEL_FLG = new String[] {""} ;
      P002S2_n209TBM23_DEL_FLG = new boolean[] {false} ;
      P002S2_A407TBM23_STYDY_AUTH_CD = new String[] {""} ;
      P002S2_A208TBM23_USER_ID = new String[] {""} ;
      P002S2_A207TBM23_STUDY_ID = new long[1] ;
      A209TBM23_DEL_FLG = "" ;
      A407TBM23_STYDY_AUTH_CD = "" ;
      A208TBM23_USER_ID = "" ;
      GXt_char1 = "" ;
      AV20W_HTTP_REQ = httpContext.getHttpRequest();
      AV10P_PWD = "" ;
      AV28W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV27W_MSG = "" ;
      GXv_char2 = new String [1] ;
      GXv_SdtB808_SD01_EXTRA_INFO5 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int4 = new short [1] ;
      GXv_char6 = new String [1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new ab504_pc02_search_crf__default(),
         new Object[] {
             new Object[] {
            P002S2_A209TBM23_DEL_FLG, P002S2_n209TBM23_DEL_FLG, P002S2_A407TBM23_STYDY_AUTH_CD, P002S2_A208TBM23_USER_ID, P002S2_A207TBM23_STUDY_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV32Pgmdesc = "CRF検索" ;
      AV31Pgmname = "AB504_PC02_SEARCH_CRF" ;
      /* GeneXus formulas. */
      AV32Pgmdesc = "CRF検索" ;
      AV31Pgmname = "AB504_PC02_SEARCH_CRF" ;
      Gx_err = (short)(0) ;
   }

   private byte AV33GXLvl100 ;
   private short AV18W_ERR_CD ;
   private short GXv_int4[] ;
   private short Gx_err ;
   private int GXActiveErrHndl ;
   private long AV17W_CNT ;
   private long AV24W_STUDY_ID ;
   private long A207TBM23_STUDY_ID ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV31Pgmname ;
   private String AV32Pgmdesc ;
   private String scmdbuf ;
   private String Gx_ope ;
   private String Gx_etb ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char6[] ;
   private String Gx_emsg ;
   private boolean entryPointCalled ;
   private boolean returnInSub ;
   private boolean n209TBM23_DEL_FLG ;
   private String AV25C_APP_ID ;
   private String AV19W_ERR_MSG ;
   private String AV22W_NEWLINE ;
   private String AV16P_USER_ID ;
   private String AV14P_STUDY_ID ;
   private String AV8P_AUTH_CD ;
   private String AV12P_SITE ;
   private String AV15P_SUBJECT ;
   private String AV9P_CRF ;
   private String AV11P_QUICK_SEARCH ;
   private String AV13P_SORT ;
   private String A209TBM23_DEL_FLG ;
   private String A407TBM23_STYDY_AUTH_CD ;
   private String A208TBM23_USER_ID ;
   private String AV10P_PWD ;
   private String AV27W_MSG ;
   private com.genexus.internet.HttpRequest AV20W_HTTP_REQ ;
   private IDataStoreProvider pr_default ;
   private String[] P002S2_A209TBM23_DEL_FLG ;
   private boolean[] P002S2_n209TBM23_DEL_FLG ;
   private String[] P002S2_A407TBM23_STYDY_AUTH_CD ;
   private String[] P002S2_A208TBM23_USER_ID ;
   private long[] P002S2_A207TBM23_STUDY_ID ;
   private com.genexus.internet.HttpResponse AV21W_HTTP_RES ;
   private GxObjectCollection AV23W_RTN_CSV ;
   private GxObjectCollection GXv_objcol_svchar3[] ;
   private SdtB808_SD01_EXTRA_INFO AV26W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO5[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV28W_PARMS_ITEM ;
}

final  class ab504_pc02_search_crf__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P002S2", "SELECT `TBM23_DEL_FLG`, `TBM23_STYDY_AUTH_CD`, `TBM23_USER_ID`, `TBM23_STUDY_ID` FROM `TBM23_STUDY_STAFF` WHERE (`TBM23_STUDY_ID` = ? and `TBM23_USER_ID` = ? and `TBM23_STYDY_AUTH_CD` = ?) AND (`TBM23_DEL_FLG` = '0') ORDER BY `TBM23_STUDY_ID`, `TBM23_USER_ID`, `TBM23_STYDY_AUTH_CD` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[4])[0] = rslt.getLong(4) ;
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 128);
               stmt.setVarchar(3, (String)parms[2], 2);
               break;
      }
   }

}

