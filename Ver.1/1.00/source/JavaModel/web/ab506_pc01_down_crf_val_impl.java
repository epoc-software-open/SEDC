/*
               File: ab506_pc01_down_crf_val_impl
        Description: CRF入力データダウンロード
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:15.65
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ab506_pc01_down_crf_val_impl extends GXWebProcedure
{
   public ab506_pc01_down_crf_val_impl( com.genexus.internet.HttpContext context )
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
      AV8C_APP_ID = "B506" ;
      AV17W_ERR_CD = (short)(0) ;
      AV18W_ERR_MSG = "" ;
      GXt_char1 = AV23W_NEWLINE ;
      GXv_char2[0] = GXt_char1 ;
      new b802_pc02_nl_airres(remoteHandle, context).execute( GXv_char2) ;
      ab506_pc01_down_crf_val_impl.this.GXt_char1 = GXv_char2[0] ;
      AV23W_NEWLINE = GXt_char1 ;
      AV19W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV19W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV8C_APP_ID );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV19W_EXTRA_INFO", AV19W_EXTRA_INFO);
      /* Execute user subroutine: S13150 */
      S13150 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: S14180 */
      S14180 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      new a804_pc01_syslog(remoteHandle, context).execute( AV30Pgmname, "INFO", AV31Pgmdesc) ;
      if ( AV17W_ERR_CD == 0 )
      {
         /* Execute user subroutine: S1161 */
         S1161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      if ( AV17W_ERR_CD == 0 )
      {
         /* Execute user subroutine: S1282 */
         S1282 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV21W_HTTP_RES.addString(GXutil.trim( GXutil.str( AV17W_ERR_CD, 10, 0))+AV23W_NEWLINE);
      AV21W_HTTP_RES.addString(AV18W_ERR_MSG);
      if ( AV17W_ERR_CD == 0 )
      {
         AV13W_CNT = 1 ;
         while ( AV13W_CNT <= AV25W_RTN_CSV.size() )
         {
            AV21W_HTTP_RES.addString(AV23W_NEWLINE+(String)AV25W_RTN_CSV.elementAt(-1+(int)(AV13W_CNT)));
            AV13W_CNT = (long)(AV13W_CNT+1) ;
         }
      }
      /* Execute user subroutine: S15196 */
      S15196 ();
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

   public void S1161( )
   {
      /* 'SUB_CHECK_PARM' Routine */
      if ( AV17W_ERR_CD == 0 )
      {
         if ( (GXutil.strcmp("", AV9P_CRF_RECORD)==0) )
         {
            AV17W_ERR_CD = (short)(1) ;
            GXt_char1 = AV18W_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00001", "CRFテーブルキーCSV", "", "", "", "", GXv_char2) ;
            ab506_pc01_down_crf_val_impl.this.GXt_char1 = GXv_char2[0] ;
            AV18W_ERR_MSG = GXt_char1 ;
         }
      }
      if ( AV17W_ERR_CD == 0 )
      {
         if ( ! ((GXutil.strcmp(AV10P_DIV, "1")==0)||(GXutil.strcmp(AV10P_DIV, "2")==0)||(GXutil.strcmp(AV10P_DIV, "3")==0)||(GXutil.strcmp(AV10P_DIV, "4")==0)||(GXutil.strcmp(AV10P_DIV, "5")==0)||(GXutil.strcmp(AV10P_DIV, "6")==0)||(GXutil.strcmp(AV10P_DIV, "7")==0)) )
         {
            AV17W_ERR_CD = (short)(1) ;
            GXt_char1 = AV18W_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00026", "処理区分", "", "", "", "", GXv_char2) ;
            ab506_pc01_down_crf_val_impl.this.GXt_char1 = GXv_char2[0] ;
            AV18W_ERR_MSG = GXt_char1 ;
         }
      }
   }

   public void S1282( )
   {
      /* 'SUB_GET_RES_DATA' Routine */
      AV25W_RTN_CSV.clear();
      GXt_objcol_char3 = AV16W_CSV_ROW ;
      GXv_objcol_char4[0] = GXt_objcol_char3 ;
      new b807_pc01_csv_row_parse(remoteHandle, context).execute( AV9P_CRF_RECORD, GXv_objcol_char4) ;
      GXt_objcol_char3 = GXv_objcol_char4[0] ;
      AV16W_CSV_ROW = GXt_objcol_char3 ;
      AV13W_CNT = 1 ;
      while ( AV13W_CNT <= AV16W_CSV_ROW.size() )
      {
         GXv_objcol_char4[0] = AV15W_CSV_COL ;
         GXv_int5[0] = AV17W_ERR_CD ;
         GXv_char2[0] = AV18W_ERR_MSG ;
         new b807_pc02_csv_col_parse_air(remoteHandle, context).execute( (String)AV16W_CSV_ROW.elementAt(-1+(int)(AV13W_CNT)), 3, "CRFテーブルキーCSV", GXv_objcol_char4, GXv_int5, GXv_char2) ;
         AV15W_CSV_COL = GXv_objcol_char4[0] ;
         ab506_pc01_down_crf_val_impl.this.AV17W_ERR_CD = GXv_int5[0] ;
         ab506_pc01_down_crf_val_impl.this.AV18W_ERR_MSG = GXv_char2[0] ;
         if ( AV17W_ERR_CD != 0 )
         {
            if (true) break;
         }
         AV26W_STUDY_ID = GXutil.lval( (String)AV15W_CSV_COL.elementAt(-1+1)) ;
         AV27W_SUBJECT_ID = (int)(GXutil.lval( (String)AV15W_CSV_COL.elementAt(-1+2))) ;
         AV14W_CRF_ID = (short)(GXutil.lval( (String)AV15W_CSV_COL.elementAt(-1+3))) ;
         if ( GXutil.strcmp(AV10P_DIV, "1") == 0 )
         {
            GXv_objcol_char4[0] = AV25W_RTN_CSV ;
            GXv_int5[0] = AV17W_ERR_CD ;
            GXv_char2[0] = AV18W_ERR_MSG ;
            new b599_pc14_subject_res(remoteHandle, context).execute( AV26W_STUDY_ID, (String)AV15W_CSV_COL.elementAt(-1+2), GXv_objcol_char4, GXv_int5, GXv_char2) ;
            AV25W_RTN_CSV = GXv_objcol_char4[0] ;
            ab506_pc01_down_crf_val_impl.this.AV17W_ERR_CD = GXv_int5[0] ;
            ab506_pc01_down_crf_val_impl.this.AV18W_ERR_MSG = GXv_char2[0] ;
         }
         else if ( GXutil.strcmp(AV10P_DIV, "2") == 0 )
         {
            GXv_objcol_char4[0] = AV25W_RTN_CSV ;
            GXv_int5[0] = AV17W_ERR_CD ;
            GXv_char2[0] = AV18W_ERR_MSG ;
            new b599_pc15_crf_res(remoteHandle, context).execute( AV26W_STUDY_ID, (String)AV15W_CSV_COL.elementAt(-1+2), (String)AV15W_CSV_COL.elementAt(-1+3), GXv_objcol_char4, GXv_int5, GXv_char2) ;
            AV25W_RTN_CSV = GXv_objcol_char4[0] ;
            ab506_pc01_down_crf_val_impl.this.AV17W_ERR_CD = GXv_int5[0] ;
            ab506_pc01_down_crf_val_impl.this.AV18W_ERR_MSG = GXv_char2[0] ;
         }
         else if ( GXutil.strcmp(AV10P_DIV, "3") == 0 )
         {
            GXv_objcol_char4[0] = AV25W_RTN_CSV ;
            GXv_int5[0] = AV17W_ERR_CD ;
            GXv_char2[0] = AV18W_ERR_MSG ;
            new b599_pc16_crf_history_res(remoteHandle, context).execute( AV26W_STUDY_ID, (String)AV15W_CSV_COL.elementAt(-1+2), (String)AV15W_CSV_COL.elementAt(-1+3), "", GXv_objcol_char4, GXv_int5, GXv_char2) ;
            AV25W_RTN_CSV = GXv_objcol_char4[0] ;
            ab506_pc01_down_crf_val_impl.this.AV17W_ERR_CD = GXv_int5[0] ;
            ab506_pc01_down_crf_val_impl.this.AV18W_ERR_MSG = GXv_char2[0] ;
         }
         else if ( GXutil.strcmp(AV10P_DIV, "4") == 0 )
         {
            GXv_objcol_char4[0] = AV25W_RTN_CSV ;
            GXv_int5[0] = AV17W_ERR_CD ;
            GXv_char2[0] = AV18W_ERR_MSG ;
            new b599_pc17_crf_result_res(remoteHandle, context).execute( AV26W_STUDY_ID, (String)AV15W_CSV_COL.elementAt(-1+2), (String)AV15W_CSV_COL.elementAt(-1+3), "", "", GXv_objcol_char4, GXv_int5, GXv_char2) ;
            AV25W_RTN_CSV = GXv_objcol_char4[0] ;
            ab506_pc01_down_crf_val_impl.this.AV17W_ERR_CD = GXv_int5[0] ;
            ab506_pc01_down_crf_val_impl.this.AV18W_ERR_MSG = GXv_char2[0] ;
         }
         else if ( GXutil.strcmp(AV10P_DIV, "5") == 0 )
         {
            GXv_objcol_char4[0] = AV25W_RTN_CSV ;
            GXv_int5[0] = AV17W_ERR_CD ;
            GXv_char2[0] = AV18W_ERR_MSG ;
            new b599_pc18_crf_res_his_res(remoteHandle, context).execute( AV26W_STUDY_ID, (String)AV15W_CSV_COL.elementAt(-1+2), (String)AV15W_CSV_COL.elementAt(-1+3), "", "", "", GXv_objcol_char4, GXv_int5, GXv_char2) ;
            AV25W_RTN_CSV = GXv_objcol_char4[0] ;
            ab506_pc01_down_crf_val_impl.this.AV17W_ERR_CD = GXv_int5[0] ;
            ab506_pc01_down_crf_val_impl.this.AV18W_ERR_MSG = GXv_char2[0] ;
         }
         else if ( GXutil.strcmp(AV10P_DIV, "6") == 0 )
         {
            GXv_objcol_char4[0] = AV25W_RTN_CSV ;
            GXv_int5[0] = AV17W_ERR_CD ;
            GXv_char2[0] = AV18W_ERR_MSG ;
            new b599_pc19_crf_memo_res(remoteHandle, context).execute( AV26W_STUDY_ID, (String)AV15W_CSV_COL.elementAt(-1+2), "", GXv_objcol_char4, GXv_int5, GXv_char2) ;
            AV25W_RTN_CSV = GXv_objcol_char4[0] ;
            ab506_pc01_down_crf_val_impl.this.AV17W_ERR_CD = GXv_int5[0] ;
            ab506_pc01_down_crf_val_impl.this.AV18W_ERR_MSG = GXv_char2[0] ;
         }
         else if ( GXutil.strcmp(AV10P_DIV, "7") == 0 )
         {
            GXv_objcol_char4[0] = AV25W_RTN_CSV ;
            GXv_int5[0] = AV17W_ERR_CD ;
            GXv_char2[0] = AV18W_ERR_MSG ;
            new b599_pc20_crf_memo_loc_res(remoteHandle, context).execute( AV26W_STUDY_ID, (String)AV15W_CSV_COL.elementAt(-1+2), "", (String)AV15W_CSV_COL.elementAt(-1+3), "", "", "", GXv_objcol_char4, GXv_int5, GXv_char2) ;
            AV25W_RTN_CSV = GXv_objcol_char4[0] ;
            ab506_pc01_down_crf_val_impl.this.AV17W_ERR_CD = GXv_int5[0] ;
            ab506_pc01_down_crf_val_impl.this.AV18W_ERR_MSG = GXv_char2[0] ;
         }
         if ( AV17W_ERR_CD == 1 )
         {
            AV17W_ERR_CD = (short)(0) ;
            AV18W_ERR_MSG = "" ;
         }
         if ( AV17W_ERR_CD != 0 )
         {
            if (true) break;
         }
         AV13W_CNT = (long)(AV13W_CNT+1) ;
      }
      if ( AV17W_ERR_CD == 0 )
      {
         if ( AV25W_RTN_CSV.size() <= 0 )
         {
            AV17W_ERR_CD = (short)(1) ;
            GXt_char1 = AV18W_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char2) ;
            ab506_pc01_down_crf_val_impl.this.GXt_char1 = GXv_char2[0] ;
            AV18W_ERR_MSG = GXt_char1 ;
         }
      }
   }

   public void S13150( )
   {
      /* 'SUB_GET_PARM' Routine */
      AV12P_USER_ID = AV20W_HTTP_REQ.getVariable("USER_ID") ;
      AV11P_PWD = AV20W_HTTP_REQ.getVariable("PW") ;
      AV9P_CRF_RECORD = AV20W_HTTP_REQ.getVariable("CRF") ;
      AV10P_DIV = AV20W_HTTP_REQ.getVariable("PROC_DIV") ;
      AV19W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      AV24W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV24W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "USER_ID" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24W_PARMS_ITEM", AV24W_PARMS_ITEM);
      AV24W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV12P_USER_ID );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24W_PARMS_ITEM", AV24W_PARMS_ITEM);
      AV19W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV24W_PARMS_ITEM, 0);
      AV24W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV24W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "CRF" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24W_PARMS_ITEM", AV24W_PARMS_ITEM);
      AV24W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV9P_CRF_RECORD );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24W_PARMS_ITEM", AV24W_PARMS_ITEM);
      AV19W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV24W_PARMS_ITEM, 0);
      AV24W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV24W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "PROC_DIV" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24W_PARMS_ITEM", AV24W_PARMS_ITEM);
      AV24W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV10P_DIV );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24W_PARMS_ITEM", AV24W_PARMS_ITEM);
      AV19W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV24W_PARMS_ITEM, 0);
      AV22W_MSG = "SUB_GET_PARM" ;
      GXv_SdtB808_SD01_EXTRA_INFO6[0] = AV19W_EXTRA_INFO;
      GXv_int5[0] = AV17W_ERR_CD ;
      GXv_char2[0] = AV18W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV30Pgmname, (short)(1), AV22W_MSG, GXv_SdtB808_SD01_EXTRA_INFO6, GXv_int5, GXv_char2) ;
      AV19W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO6[0] ;
      ab506_pc01_down_crf_val_impl.this.AV17W_ERR_CD = GXv_int5[0] ;
      ab506_pc01_down_crf_val_impl.this.AV18W_ERR_MSG = GXv_char2[0] ;
   }

   public void S14180( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      if ( ! httpContext.isAjaxRequest( ) )
      {
         AV21W_HTTP_RES.addHeader("Content-Type", "text/plain; charset=UTF-8");
      }
      GXv_char2[0] = AV12P_USER_ID ;
      GXv_int5[0] = AV17W_ERR_CD ;
      GXv_char7[0] = AV18W_ERR_MSG ;
      new b101_pc01_login(remoteHandle, context).execute( GXv_char2, AV11P_PWD, GXv_int5, GXv_char7) ;
      ab506_pc01_down_crf_val_impl.this.AV12P_USER_ID = GXv_char2[0] ;
      ab506_pc01_down_crf_val_impl.this.AV17W_ERR_CD = GXv_int5[0] ;
      ab506_pc01_down_crf_val_impl.this.AV18W_ERR_MSG = GXv_char7[0] ;
   }

   public void S15196( )
   {
      /* 'SUB_TERMINATE' Routine */
      if ( AV17W_ERR_CD == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "ab506_pc01_down_crf_val");
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "ab506_pc01_down_crf_val");
      }
      AV22W_MSG = "Error Result" + GXutil.chr( (short)(9)) + " Code:" + GXutil.trim( GXutil.str( AV17W_ERR_CD, 10, 0)) + GXutil.chr( (short)(9)) + "Message:" + AV18W_ERR_MSG ;
      GXv_SdtB808_SD01_EXTRA_INFO6[0] = AV19W_EXTRA_INFO;
      GXv_int5[0] = AV17W_ERR_CD ;
      GXv_char7[0] = AV18W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV30Pgmname, (short)(1), AV22W_MSG, GXv_SdtB808_SD01_EXTRA_INFO6, GXv_int5, GXv_char7) ;
      AV19W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO6[0] ;
      ab506_pc01_down_crf_val_impl.this.AV17W_ERR_CD = GXv_int5[0] ;
      ab506_pc01_down_crf_val_impl.this.AV18W_ERR_MSG = GXv_char7[0] ;
      GXv_int5[0] = AV17W_ERR_CD ;
      GXv_char7[0] = AV18W_ERR_MSG ;
      new b101_pc02_logout(remoteHandle, context).execute( GXv_int5, GXv_char7) ;
      ab506_pc01_down_crf_val_impl.this.AV17W_ERR_CD = GXv_int5[0] ;
      ab506_pc01_down_crf_val_impl.this.AV18W_ERR_MSG = GXv_char7[0] ;
   }

   public void S16215( )
   {
      /* 'SUB_ERROR' Routine */
      AV22W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO6[0] = AV19W_EXTRA_INFO;
      GXv_int5[0] = AV17W_ERR_CD ;
      GXv_char7[0] = AV18W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV30Pgmname, (short)(0), AV22W_MSG, GXv_SdtB808_SD01_EXTRA_INFO6, GXv_int5, GXv_char7) ;
      AV19W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO6[0] ;
      ab506_pc01_down_crf_val_impl.this.AV17W_ERR_CD = GXv_int5[0] ;
      ab506_pc01_down_crf_val_impl.this.AV18W_ERR_MSG = GXv_char7[0] ;
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
                  /* Execute user subroutine: S16215 */
                  S16215 ();
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
      AV8C_APP_ID = "" ;
      AV18W_ERR_MSG = "" ;
      AV23W_NEWLINE = "" ;
      AV19W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV30Pgmname = "" ;
      AV31Pgmdesc = "" ;
      AV21W_HTTP_RES = httpContext.getHttpResponse();
      AV25W_RTN_CSV = new GxObjectCollection(String.class, "internal", "");
      AV9P_CRF_RECORD = "" ;
      AV10P_DIV = "" ;
      AV16W_CSV_ROW = new GxObjectCollection(String.class, "internal", "");
      GXt_objcol_char3 = new GxObjectCollection(String.class, "internal", "");
      AV15W_CSV_COL = new GxObjectCollection(String.class, "internal", "");
      GXv_objcol_char4 = new GxObjectCollection [1] ;
      GXt_char1 = "" ;
      AV12P_USER_ID = "" ;
      AV20W_HTTP_REQ = httpContext.getHttpRequest();
      AV11P_PWD = "" ;
      AV24W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV22W_MSG = "" ;
      GXv_char2 = new String [1] ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      GXv_SdtB808_SD01_EXTRA_INFO6 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int5 = new short [1] ;
      GXv_char7 = new String [1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new ab506_pc01_down_crf_val__default(),
         new Object[] {
         }
      );
      pr_default.setErrorHandler(this);
      AV31Pgmdesc = "CRF入力データダウンロード" ;
      AV30Pgmname = "AB506_PC01_DOWN_CRF_VAL" ;
      /* GeneXus formulas. */
      AV31Pgmdesc = "CRF入力データダウンロード" ;
      AV30Pgmname = "AB506_PC01_DOWN_CRF_VAL" ;
      Gx_err = (short)(0) ;
   }

   private short AV17W_ERR_CD ;
   private short AV14W_CRF_ID ;
   private short GXv_int5[] ;
   private short Gx_err ;
   private int AV27W_SUBJECT_ID ;
   private int GXActiveErrHndl ;
   private long AV13W_CNT ;
   private long AV26W_STUDY_ID ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV30Pgmname ;
   private String AV31Pgmdesc ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Gx_ope ;
   private String Gx_etb ;
   private String GXv_char7[] ;
   private String Gx_emsg ;
   private boolean entryPointCalled ;
   private boolean returnInSub ;
   private String AV8C_APP_ID ;
   private String AV18W_ERR_MSG ;
   private String AV23W_NEWLINE ;
   private String AV9P_CRF_RECORD ;
   private String AV10P_DIV ;
   private String AV12P_USER_ID ;
   private String AV11P_PWD ;
   private String AV22W_MSG ;
   private com.genexus.internet.HttpRequest AV20W_HTTP_REQ ;
   private GxObjectCollection AV25W_RTN_CSV ;
   private IDataStoreProvider pr_default ;
   private com.genexus.internet.HttpResponse AV21W_HTTP_RES ;
   private GxObjectCollection AV16W_CSV_ROW ;
   private GxObjectCollection GXt_objcol_char3 ;
   private GxObjectCollection AV15W_CSV_COL ;
   private GxObjectCollection GXv_objcol_char4[] ;
   private SdtB808_SD01_EXTRA_INFO AV19W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO6[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV24W_PARMS_ITEM ;
}

final  class ab506_pc01_down_crf_val__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

}

