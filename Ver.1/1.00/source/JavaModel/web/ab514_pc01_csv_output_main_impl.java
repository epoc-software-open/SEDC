/*
               File: ab514_pc01_csv_output_main_impl
        Description: CSV出力メイン処理
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:43.3
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ab514_pc01_csv_output_main_impl extends GXWebProcedure
{
   public ab514_pc01_csv_output_main_impl( com.genexus.internet.HttpContext context )
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
      AV8C_TAM02_APP_ID = "B514" ;
      AV30W_ERR_CD = (short)(0) ;
      AV31W_ERR_MSG = "" ;
      AV40W_SESSION_ID = "" ;
      AV27W_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      GXt_char1 = AV36W_NEWLINE ;
      GXv_char2[0] = GXt_char1 ;
      new b802_pc02_nl_airres(remoteHandle, context).execute( GXv_char2) ;
      ab514_pc01_csv_output_main_impl.this.GXt_char1 = GXv_char2[0] ;
      AV36W_NEWLINE = GXt_char1 ;
      AV32W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV32W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV8C_TAM02_APP_ID );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV32W_EXTRA_INFO", AV32W_EXTRA_INFO);
      AV40W_SESSION_ID = AV26SESSION.getId() ;
      AV27W_DATETIME = GXutil.now( ) ;
      /* Execute user subroutine: S13240 */
      S13240 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: S14265 */
      S14265 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      new a804_pc01_syslog(remoteHandle, context).execute( AV62Pgmname, "INFO", AV63Pgmdesc) ;
      if ( AV30W_ERR_CD == 0 )
      {
         GXv_int3[0] = AV30W_ERR_CD ;
         GXv_char2[0] = AV31W_ERR_MSG ;
         new b514_pc02_insert_cond(remoteHandle, context).execute( AV40W_SESSION_ID, AV27W_DATETIME, AV20P_CSV_COND, GXv_int3, GXv_char2) ;
         ab514_pc01_csv_output_main_impl.this.AV30W_ERR_CD = GXv_int3[0] ;
         ab514_pc01_csv_output_main_impl.this.AV31W_ERR_MSG = GXv_char2[0] ;
      }
      if ( AV30W_ERR_CD == 0 )
      {
         /* Execute user subroutine: S11158 */
         S11158 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      if ( AV30W_ERR_CD == 0 )
      {
         /* Using cursor P004S2 */
         pr_default.execute(0, new Object[] {AV40W_SESSION_ID, AV27W_DATETIME, new Short(AV30W_ERR_CD)});
         AV40W_SESSION_ID = P004S2_AV40W_SESSION_ID[0] ;
         AV27W_DATETIME = P004S2_AV27W_DATETIME[0] ;
         AV30W_ERR_CD = P004S2_AV30W_ERR_CD[0] ;
         if ( AV30W_ERR_CD != 0 )
         {
            GXt_char1 = AV31W_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00051", "ストアドプロシージャの", GXutil.str( AV30W_ERR_CD, 4, 0), "", "", "", GXv_char2) ;
            ab514_pc01_csv_output_main_impl.this.GXt_char1 = GXv_char2[0] ;
            AV31W_ERR_MSG = GXt_char1 ;
            AV30W_ERR_CD = (short)(1) ;
         }
      }
      if ( AV30W_ERR_CD == 0 )
      {
         /* Execute user subroutine: S12196 */
         S12196 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      if ( AV30W_ERR_CD == 0 )
      {
         Gx_ope = "Fetch" ;
         Gx_etb = "TBW13_CSV_RECORD" ;
         /* Using cursor P004S3 */
         pr_default.execute(1, new Object[] {AV40W_SESSION_ID, AV27W_DATETIME});
         while ( (pr_default.getStatus(1) != 101) )
         {
            brk4S2 = false ;
            A821TBW13_VALUE = P004S3_A821TBW13_VALUE[0] ;
            n821TBW13_VALUE = P004S3_n821TBW13_VALUE[0] ;
            A820TBW13_DOM_ITM_GRP_ROWNO = P004S3_A820TBW13_DOM_ITM_GRP_ROWNO[0] ;
            A819TBW13_DOM_ITM_GRP_OID = P004S3_A819TBW13_DOM_ITM_GRP_OID[0] ;
            A817TBW13_VISIT_NO = P004S3_A817TBW13_VISIT_NO[0] ;
            A816TBW13_SUBJECT_ID = P004S3_A816TBW13_SUBJECT_ID[0] ;
            A815TBW13_STUDY_ID = P004S3_A815TBW13_STUDY_ID[0] ;
            A818TBW13_DOM_CD = P004S3_A818TBW13_DOM_CD[0] ;
            A814TBW13_DATETIME = P004S3_A814TBW13_DATETIME[0] ;
            A813TBW13_SESSION_ID = P004S3_A813TBW13_SESSION_ID[0] ;
            if ( AV30W_ERR_CD != 0 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            AV55W_FILE_PATH = AV37W_OUTPUT_PATH + A818TBW13_DOM_CD + ".csv" ;
            AV30W_ERR_CD = context.getSessionInstances().getDelimitedFiles().dfwopen( AV55W_FILE_PATH, "", "", (byte)(0), AV59W_CHAR_SET) ;
            if ( AV30W_ERR_CD != 0 )
            {
               GXt_char1 = AV31W_ERR_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AX00003", "", "", "", "", "", GXv_char2) ;
               ab514_pc01_csv_output_main_impl.this.GXt_char1 = GXv_char2[0] ;
               AV31W_ERR_MSG = GXt_char1 ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            AV58W_HEADER_INIT = true ;
            Gx_ope = "Fetch" ;
            Gx_etb = "TBM03_CDISC_ITEM" ;
            /* Using cursor P004S4 */
            pr_default.execute(2, new Object[] {A818TBW13_DOM_CD});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A162TBM03_DOM_CD = P004S4_A162TBM03_DOM_CD[0] ;
               A178TBM03_DEL_FLG = P004S4_A178TBM03_DEL_FLG[0] ;
               n178TBM03_DEL_FLG = P004S4_n178TBM03_DEL_FLG[0] ;
               A163TBM03_DOM_VAR_NM = P004S4_A163TBM03_DOM_VAR_NM[0] ;
               A169TBM03_ORDER = P004S4_A169TBM03_ORDER[0] ;
               n169TBM03_ORDER = P004S4_n169TBM03_ORDER[0] ;
               if ( AV30W_ERR_CD != 0 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               if ( AV58W_HEADER_INIT )
               {
                  AV58W_HEADER_INIT = false ;
                  AV30W_ERR_CD = context.getSessionInstances().getDelimitedFiles().dfwptxt( A163TBM03_DOM_VAR_NM, (short)(GXutil.byteCount( A163TBM03_DOM_VAR_NM, AV59W_CHAR_SET))) ;
               }
               else
               {
                  AV30W_ERR_CD = context.getSessionInstances().getDelimitedFiles().dfwptxt( AV57W_CSV_SEP+A163TBM03_DOM_VAR_NM, (short)(GXutil.byteCount( AV57W_CSV_SEP, AV59W_CHAR_SET)+GXutil.byteCount( A163TBM03_DOM_VAR_NM, AV59W_CHAR_SET))) ;
               }
               if ( AV30W_ERR_CD != 0 )
               {
                  GXt_char1 = AV31W_ERR_MSG ;
                  GXv_char2[0] = GXt_char1 ;
                  new a805_pc01_msg_get(remoteHandle, context).execute( "AX00004", "", "", "", "", "", GXv_char2) ;
                  ab514_pc01_csv_output_main_impl.this.GXt_char1 = GXv_char2[0] ;
                  AV31W_ERR_MSG = GXt_char1 ;
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               pr_default.readNext(2);
            }
            pr_default.close(2);
            if ( AV30W_ERR_CD != 0 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            AV30W_ERR_CD = context.getSessionInstances().getDelimitedFiles().dfwnext( ) ;
            if ( AV30W_ERR_CD != 0 )
            {
               GXt_char1 = AV31W_ERR_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AX00004", "", "", "", "", "", GXv_char2) ;
               ab514_pc01_csv_output_main_impl.this.GXt_char1 = GXv_char2[0] ;
               AV31W_ERR_MSG = GXt_char1 ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P004S3_A818TBW13_DOM_CD[0], A818TBW13_DOM_CD) == 0 ) )
            {
               brk4S2 = false ;
               A821TBW13_VALUE = P004S3_A821TBW13_VALUE[0] ;
               n821TBW13_VALUE = P004S3_n821TBW13_VALUE[0] ;
               A820TBW13_DOM_ITM_GRP_ROWNO = P004S3_A820TBW13_DOM_ITM_GRP_ROWNO[0] ;
               A819TBW13_DOM_ITM_GRP_OID = P004S3_A819TBW13_DOM_ITM_GRP_OID[0] ;
               A817TBW13_VISIT_NO = P004S3_A817TBW13_VISIT_NO[0] ;
               A816TBW13_SUBJECT_ID = P004S3_A816TBW13_SUBJECT_ID[0] ;
               A815TBW13_STUDY_ID = P004S3_A815TBW13_STUDY_ID[0] ;
               A814TBW13_DATETIME = P004S3_A814TBW13_DATETIME[0] ;
               A813TBW13_SESSION_ID = P004S3_A813TBW13_SESSION_ID[0] ;
               if ( AV30W_ERR_CD != 0 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               AV30W_ERR_CD = context.getSessionInstances().getDelimitedFiles().dfwptxt( A821TBW13_VALUE, (short)(GXutil.byteCount( A821TBW13_VALUE, AV59W_CHAR_SET))) ;
               AV30W_ERR_CD = context.getSessionInstances().getDelimitedFiles().dfwnext( ) ;
               if ( AV30W_ERR_CD != 0 )
               {
                  GXt_char1 = AV31W_ERR_MSG ;
                  GXv_char2[0] = GXt_char1 ;
                  new a805_pc01_msg_get(remoteHandle, context).execute( "AX00004", "", "", "", "", "", GXv_char2) ;
                  ab514_pc01_csv_output_main_impl.this.GXt_char1 = GXv_char2[0] ;
                  AV31W_ERR_MSG = GXt_char1 ;
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               brk4S2 = true ;
               pr_default.readNext(1);
            }
            AV30W_ERR_CD = context.getSessionInstances().getDelimitedFiles().dfwclose( ) ;
            if ( AV30W_ERR_CD != 0 )
            {
               GXt_char1 = AV31W_ERR_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AX00004", "", "", "", "", "", GXv_char2) ;
               ab514_pc01_csv_output_main_impl.this.GXt_char1 = GXv_char2[0] ;
               AV31W_ERR_MSG = GXt_char1 ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            if ( ! brk4S2 )
            {
               brk4S2 = true ;
               pr_default.readNext(1);
            }
         }
         pr_default.close(1);
      }
      if ( AV30W_ERR_CD == 0 )
      {
         GXv_int4[0] = (byte)(AV30W_ERR_CD) ;
         GXv_char2[0] = AV31W_ERR_MSG ;
         new b514_pc03_delete_work(remoteHandle, context).execute( AV40W_SESSION_ID, AV27W_DATETIME, GXv_int4, GXv_char2) ;
         ab514_pc01_csv_output_main_impl.this.AV30W_ERR_CD = GXv_int4[0] ;
         ab514_pc01_csv_output_main_impl.this.AV31W_ERR_MSG = GXv_char2[0] ;
      }
      AV34W_HTTP_RES.addString(GXutil.trim( GXutil.str( AV30W_ERR_CD, 10, 0))+AV36W_NEWLINE);
      AV34W_HTTP_RES.addString(AV31W_ERR_MSG);
      /* Execute user subroutine: S15281 */
      S15281 ();
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

   public void S11158( )
   {
      /* 'SUB_ERR_CHK_CSV' Routine */
      /* Using cursor P004S5 */
      pr_default.execute(3, new Object[] {new Short(AV39W_RTN_CD), new Long(AV16ERR_STUDY_ID), new Integer(AV17ERR_SUBJECT_ID), new Short(AV10ERR_CRF_ID), AV11ERR_CRF_ITEM_GRP_CD, new Short(AV18ERR_VISIT_NO), AV12ERR_DOM_CD, AV15ERR_DOM_VER_NM, AV13ERR_DOM_ITM_GRP_OID, new Short(AV14ERR_DOM_ITM_GRP_ROWNO), AV40W_SESSION_ID, AV27W_DATETIME});
      AV39W_RTN_CD = P004S5_AV39W_RTN_CD[0] ;
      AV16ERR_STUDY_ID = P004S5_AV16ERR_STUDY_ID[0] ;
      AV17ERR_SUBJECT_ID = P004S5_AV17ERR_SUBJECT_ID[0] ;
      AV10ERR_CRF_ID = P004S5_AV10ERR_CRF_ID[0] ;
      AV11ERR_CRF_ITEM_GRP_CD = P004S5_AV11ERR_CRF_ITEM_GRP_CD[0] ;
      AV18ERR_VISIT_NO = P004S5_AV18ERR_VISIT_NO[0] ;
      AV12ERR_DOM_CD = P004S5_AV12ERR_DOM_CD[0] ;
      AV15ERR_DOM_VER_NM = P004S5_AV15ERR_DOM_VER_NM[0] ;
      AV13ERR_DOM_ITM_GRP_OID = P004S5_AV13ERR_DOM_ITM_GRP_OID[0] ;
      AV14ERR_DOM_ITM_GRP_ROWNO = P004S5_AV14ERR_DOM_ITM_GRP_ROWNO[0] ;
      AV40W_SESSION_ID = P004S5_AV40W_SESSION_ID[0] ;
      AV27W_DATETIME = P004S5_AV27W_DATETIME[0] ;
      if ( AV39W_RTN_CD != 0 )
      {
         AV30W_ERR_CD = (short)(1) ;
         if ( AV39W_RTN_CD == 4 )
         {
            AV35W_MSG = "エラーコード：" + GXutil.trim( GXutil.str( AV30W_ERR_CD, 4, 0)) + ",患者ID：" + GXutil.trim( GXutil.str( AV17ERR_SUBJECT_ID, 6, 0)) + ",試験ID:" + GXutil.trim( GXutil.str( AV16ERR_STUDY_ID, 10, 0)) + ",CRFID:" + GXutil.trim( GXutil.str( AV10ERR_CRF_ID, 4, 0)) + ",項目CD:" + AV11ERR_CRF_ITEM_GRP_CD + ",VISIT番号：" + GXutil.trim( GXutil.str( AV17ERR_SUBJECT_ID, 6, 0)) + ",ドメインコード:" + AV12ERR_DOM_CD + ",ドメイン変数名:" + AV15ERR_DOM_VER_NM + ",OID:" + AV13ERR_DOM_ITM_GRP_OID + ",行番号:" + GXutil.trim( GXutil.str( AV14ERR_DOM_ITM_GRP_ROWNO, 4, 0)) ;
            GXt_char1 = AV31W_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00049", AV35W_MSG, "", "", "", "", GXv_char2) ;
            ab514_pc01_csv_output_main_impl.this.GXt_char1 = GXv_char2[0] ;
            AV31W_ERR_MSG = GXt_char1 ;
         }
         else if ( AV39W_RTN_CD == 8 )
         {
            AV35W_MSG = "エラーコード：" + GXutil.trim( GXutil.str( AV30W_ERR_CD, 4, 0)) + ",患者ID：" + GXutil.trim( GXutil.str( AV17ERR_SUBJECT_ID, 6, 0)) + ",試験ID:" + GXutil.trim( GXutil.str( AV16ERR_STUDY_ID, 10, 0)) + ",CRFID:" + GXutil.trim( GXutil.str( AV10ERR_CRF_ID, 4, 0)) + ",項目CD:" + AV11ERR_CRF_ITEM_GRP_CD + ",VISIT番号：" + GXutil.trim( GXutil.str( AV17ERR_SUBJECT_ID, 6, 0)) + ",ドメインコード:" + AV12ERR_DOM_CD + ",ドメイン変数名:" + AV15ERR_DOM_VER_NM + ",OID:" + AV13ERR_DOM_ITM_GRP_OID + ",行番号:" + GXutil.trim( GXutil.str( AV14ERR_DOM_ITM_GRP_ROWNO, 4, 0)) ;
            GXt_char1 = AV31W_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00050", AV35W_MSG, "", "", "", "", GXv_char2) ;
            ab514_pc01_csv_output_main_impl.this.GXt_char1 = GXv_char2[0] ;
            AV31W_ERR_MSG = GXt_char1 ;
         }
      }
   }

   public void S12196( )
   {
      /* 'SUB_INIT_CSV_CONF' Routine */
      GXt_char1 = AV37W_OUTPUT_PATH ;
      GXv_char2[0] = GXt_char1 ;
      new b806_pc01_get_ctrl_val(remoteHandle, context).execute( "007", GXv_char2) ;
      ab514_pc01_csv_output_main_impl.this.GXt_char1 = GXv_char2[0] ;
      AV37W_OUTPUT_PATH = GXt_char1 ;
      if ( GXutil.strcmp(GXutil.substring( AV37W_OUTPUT_PATH, GXutil.len( AV37W_OUTPUT_PATH), 1), AV54W_FILE.getSeparator()) != 0 )
      {
         AV37W_OUTPUT_PATH = AV37W_OUTPUT_PATH + AV54W_FILE.getSeparator() ;
      }
      Gx_ope = "Fetch" ;
      Gx_etb = "TBW13_CSV_RECORD" ;
      /* Using cursor P004S6 */
      pr_default.execute(4, new Object[] {AV40W_SESSION_ID, AV27W_DATETIME});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A814TBW13_DATETIME = P004S6_A814TBW13_DATETIME[0] ;
         A813TBW13_SESSION_ID = P004S6_A813TBW13_SESSION_ID[0] ;
         A815TBW13_STUDY_ID = P004S6_A815TBW13_STUDY_ID[0] ;
         A816TBW13_SUBJECT_ID = P004S6_A816TBW13_SUBJECT_ID[0] ;
         A817TBW13_VISIT_NO = P004S6_A817TBW13_VISIT_NO[0] ;
         A818TBW13_DOM_CD = P004S6_A818TBW13_DOM_CD[0] ;
         A819TBW13_DOM_ITM_GRP_OID = P004S6_A819TBW13_DOM_ITM_GRP_OID[0] ;
         A820TBW13_DOM_ITM_GRP_ROWNO = P004S6_A820TBW13_DOM_ITM_GRP_ROWNO[0] ;
         AV37W_OUTPUT_PATH = AV37W_OUTPUT_PATH + GXutil.trim( GXutil.str( A815TBW13_STUDY_ID, 10, 0)) + "_" ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(4);
      }
      pr_default.close(4);
      GXt_char1 = AV37W_OUTPUT_PATH ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( GXutil.now( ), "YYYYMMDDHHMISS", GXv_char2) ;
      ab514_pc01_csv_output_main_impl.this.GXt_char1 = GXv_char2[0] ;
      AV37W_OUTPUT_PATH = AV37W_OUTPUT_PATH + GXt_char1 ;
      AV56W_DIR.setSource( AV37W_OUTPUT_PATH );
      if ( ! AV56W_DIR.exists() )
      {
         AV56W_DIR.create();
      }
      AV37W_OUTPUT_PATH = AV37W_OUTPUT_PATH + AV54W_FILE.getSeparator() ;
      GXt_char1 = AV57W_CSV_SEP ;
      GXv_char2[0] = GXt_char1 ;
      new b806_pc01_get_ctrl_val(remoteHandle, context).execute( "019", GXv_char2) ;
      ab514_pc01_csv_output_main_impl.this.GXt_char1 = GXv_char2[0] ;
      AV57W_CSV_SEP = GXt_char1 ;
      if ( (GXutil.strcmp("", AV57W_CSV_SEP)==0) )
      {
         AV57W_CSV_SEP = "," ;
      }
      AV59W_CHAR_SET = "UTF8" ;
   }

   public void S13240( )
   {
      /* 'SUB_GET_PARM' Routine */
      AV23P_USER_ID = AV33W_HTTP_REQ.getVariable("USER_ID") ;
      AV21P_PWD = AV33W_HTTP_REQ.getVariable("PW") ;
      AV20P_CSV_COND = AV33W_HTTP_REQ.getVariable("CSV_COND") ;
      AV32W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      AV38W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV38W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "USER_ID" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV38W_PARMS_ITEM", AV38W_PARMS_ITEM);
      AV38W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV23P_USER_ID );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV38W_PARMS_ITEM", AV38W_PARMS_ITEM);
      AV32W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV38W_PARMS_ITEM, 0);
      AV38W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV38W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "CSV_COND" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV38W_PARMS_ITEM", AV38W_PARMS_ITEM);
      AV38W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV20P_CSV_COND );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV38W_PARMS_ITEM", AV38W_PARMS_ITEM);
      AV32W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV38W_PARMS_ITEM, 0);
      AV35W_MSG = "SUB_GET_PARM" ;
      GXv_SdtB808_SD01_EXTRA_INFO5[0] = AV32W_EXTRA_INFO;
      GXv_int3[0] = AV30W_ERR_CD ;
      GXv_char2[0] = AV31W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV62Pgmname, (short)(1), AV35W_MSG, GXv_SdtB808_SD01_EXTRA_INFO5, GXv_int3, GXv_char2) ;
      AV32W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO5[0] ;
      ab514_pc01_csv_output_main_impl.this.AV30W_ERR_CD = GXv_int3[0] ;
      ab514_pc01_csv_output_main_impl.this.AV31W_ERR_MSG = GXv_char2[0] ;
   }

   public void S14265( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      if ( ! httpContext.isAjaxRequest( ) )
      {
         AV34W_HTTP_RES.addHeader("Content-Type", "text/plain; charset=UTF-8");
      }
      GXv_char2[0] = AV23P_USER_ID ;
      GXv_int3[0] = AV30W_ERR_CD ;
      GXv_char6[0] = AV31W_ERR_MSG ;
      new b101_pc01_login(remoteHandle, context).execute( GXv_char2, AV21P_PWD, GXv_int3, GXv_char6) ;
      ab514_pc01_csv_output_main_impl.this.AV23P_USER_ID = GXv_char2[0] ;
      ab514_pc01_csv_output_main_impl.this.AV30W_ERR_CD = GXv_int3[0] ;
      ab514_pc01_csv_output_main_impl.this.AV31W_ERR_MSG = GXv_char6[0] ;
   }

   public void S15281( )
   {
      /* 'SUB_TERMINATE' Routine */
      if ( AV30W_ERR_CD == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "ab514_pc01_csv_output_main");
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "ab514_pc01_csv_output_main");
      }
      AV35W_MSG = "Error Result" + GXutil.chr( (short)(9)) + " Code:" + GXutil.trim( GXutil.str( AV30W_ERR_CD, 10, 0)) + GXutil.chr( (short)(9)) + "Message:" + AV31W_ERR_MSG ;
      GXv_SdtB808_SD01_EXTRA_INFO5[0] = AV32W_EXTRA_INFO;
      GXv_int3[0] = AV30W_ERR_CD ;
      GXv_char6[0] = AV31W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV62Pgmname, (short)(1), AV35W_MSG, GXv_SdtB808_SD01_EXTRA_INFO5, GXv_int3, GXv_char6) ;
      AV32W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO5[0] ;
      ab514_pc01_csv_output_main_impl.this.AV30W_ERR_CD = GXv_int3[0] ;
      ab514_pc01_csv_output_main_impl.this.AV31W_ERR_MSG = GXv_char6[0] ;
      GXv_int3[0] = AV30W_ERR_CD ;
      GXv_char6[0] = AV31W_ERR_MSG ;
      new b101_pc02_logout(remoteHandle, context).execute( GXv_int3, GXv_char6) ;
      ab514_pc01_csv_output_main_impl.this.AV30W_ERR_CD = GXv_int3[0] ;
      ab514_pc01_csv_output_main_impl.this.AV31W_ERR_MSG = GXv_char6[0] ;
   }

   public void S16300( )
   {
      /* 'SUB_ERROR' Routine */
      AV35W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO5[0] = AV32W_EXTRA_INFO;
      GXv_int3[0] = AV30W_ERR_CD ;
      GXv_char6[0] = AV31W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV62Pgmname, (short)(0), AV35W_MSG, GXv_SdtB808_SD01_EXTRA_INFO5, GXv_int3, GXv_char6) ;
      AV32W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO5[0] ;
      ab514_pc01_csv_output_main_impl.this.AV30W_ERR_CD = GXv_int3[0] ;
      ab514_pc01_csv_output_main_impl.this.AV31W_ERR_MSG = GXv_char6[0] ;
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
                  /* Execute user subroutine: S16300 */
                  S16300 ();
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
      AV8C_TAM02_APP_ID = "" ;
      AV31W_ERR_MSG = "" ;
      AV40W_SESSION_ID = "" ;
      AV27W_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      AV36W_NEWLINE = "" ;
      AV32W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV26SESSION = httpContext.getWebSession();
      AV62Pgmname = "" ;
      AV63Pgmdesc = "" ;
      AV20P_CSV_COND = "" ;
      P004S2_AV40W_SESSION_ID = new String[] {""} ;
      P004S2_AV27W_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P004S2_AV30W_ERR_CD = new short[1] ;
      scmdbuf = "" ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      P004S3_A821TBW13_VALUE = new String[] {""} ;
      P004S3_n821TBW13_VALUE = new boolean[] {false} ;
      P004S3_A820TBW13_DOM_ITM_GRP_ROWNO = new short[1] ;
      P004S3_A819TBW13_DOM_ITM_GRP_OID = new String[] {""} ;
      P004S3_A817TBW13_VISIT_NO = new short[1] ;
      P004S3_A816TBW13_SUBJECT_ID = new int[1] ;
      P004S3_A815TBW13_STUDY_ID = new long[1] ;
      P004S3_A818TBW13_DOM_CD = new String[] {""} ;
      P004S3_A814TBW13_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P004S3_A813TBW13_SESSION_ID = new String[] {""} ;
      A821TBW13_VALUE = "" ;
      A819TBW13_DOM_ITM_GRP_OID = "" ;
      A818TBW13_DOM_CD = "" ;
      A814TBW13_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A813TBW13_SESSION_ID = "" ;
      AV55W_FILE_PATH = "" ;
      AV37W_OUTPUT_PATH = "" ;
      AV59W_CHAR_SET = "" ;
      P004S4_A162TBM03_DOM_CD = new String[] {""} ;
      P004S4_A178TBM03_DEL_FLG = new String[] {""} ;
      P004S4_n178TBM03_DEL_FLG = new boolean[] {false} ;
      P004S4_A163TBM03_DOM_VAR_NM = new String[] {""} ;
      P004S4_A169TBM03_ORDER = new int[1] ;
      P004S4_n169TBM03_ORDER = new boolean[] {false} ;
      A162TBM03_DOM_CD = "" ;
      A178TBM03_DEL_FLG = "" ;
      A163TBM03_DOM_VAR_NM = "" ;
      AV57W_CSV_SEP = "" ;
      GXv_int4 = new byte [1] ;
      AV34W_HTTP_RES = httpContext.getHttpResponse();
      AV11ERR_CRF_ITEM_GRP_CD = "" ;
      AV12ERR_DOM_CD = "" ;
      AV15ERR_DOM_VER_NM = "" ;
      AV13ERR_DOM_ITM_GRP_OID = "" ;
      P004S5_AV39W_RTN_CD = new short[1] ;
      P004S5_AV16ERR_STUDY_ID = new long[1] ;
      P004S5_AV17ERR_SUBJECT_ID = new int[1] ;
      P004S5_AV10ERR_CRF_ID = new short[1] ;
      P004S5_AV11ERR_CRF_ITEM_GRP_CD = new String[] {""} ;
      P004S5_AV18ERR_VISIT_NO = new short[1] ;
      P004S5_AV12ERR_DOM_CD = new String[] {""} ;
      P004S5_AV15ERR_DOM_VER_NM = new String[] {""} ;
      P004S5_AV13ERR_DOM_ITM_GRP_OID = new String[] {""} ;
      P004S5_AV14ERR_DOM_ITM_GRP_ROWNO = new short[1] ;
      P004S5_AV40W_SESSION_ID = new String[] {""} ;
      P004S5_AV27W_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      AV35W_MSG = "" ;
      AV54W_FILE = new com.genexus.util.GXFile();
      P004S6_A814TBW13_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P004S6_A813TBW13_SESSION_ID = new String[] {""} ;
      P004S6_A815TBW13_STUDY_ID = new long[1] ;
      P004S6_A816TBW13_SUBJECT_ID = new int[1] ;
      P004S6_A817TBW13_VISIT_NO = new short[1] ;
      P004S6_A818TBW13_DOM_CD = new String[] {""} ;
      P004S6_A819TBW13_DOM_ITM_GRP_OID = new String[] {""} ;
      P004S6_A820TBW13_DOM_ITM_GRP_ROWNO = new short[1] ;
      AV56W_DIR = new com.genexus.util.GXDirectory();
      GXt_char1 = "" ;
      AV23P_USER_ID = "" ;
      AV33W_HTTP_REQ = httpContext.getHttpRequest();
      AV21P_PWD = "" ;
      AV38W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      GXv_char2 = new String [1] ;
      GXv_SdtB808_SD01_EXTRA_INFO5 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int3 = new short [1] ;
      GXv_char6 = new String [1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new ab514_pc01_csv_output_main__default(),
         new Object[] {
             new Object[] {
            P004S2_AV40W_SESSION_ID, P004S2_AV27W_DATETIME, P004S2_AV30W_ERR_CD
            }
            , new Object[] {
            P004S3_A821TBW13_VALUE, P004S3_n821TBW13_VALUE, P004S3_A820TBW13_DOM_ITM_GRP_ROWNO, P004S3_A819TBW13_DOM_ITM_GRP_OID, P004S3_A817TBW13_VISIT_NO, P004S3_A816TBW13_SUBJECT_ID, P004S3_A815TBW13_STUDY_ID, P004S3_A818TBW13_DOM_CD, P004S3_A814TBW13_DATETIME, P004S3_A813TBW13_SESSION_ID
            }
            , new Object[] {
            P004S4_A162TBM03_DOM_CD, P004S4_A178TBM03_DEL_FLG, P004S4_n178TBM03_DEL_FLG, P004S4_A163TBM03_DOM_VAR_NM, P004S4_A169TBM03_ORDER, P004S4_n169TBM03_ORDER
            }
            , new Object[] {
            P004S5_AV39W_RTN_CD, P004S5_AV16ERR_STUDY_ID, P004S5_AV17ERR_SUBJECT_ID, P004S5_AV10ERR_CRF_ID, P004S5_AV11ERR_CRF_ITEM_GRP_CD, P004S5_AV18ERR_VISIT_NO, P004S5_AV12ERR_DOM_CD, P004S5_AV15ERR_DOM_VER_NM, P004S5_AV13ERR_DOM_ITM_GRP_OID, P004S5_AV14ERR_DOM_ITM_GRP_ROWNO,
            P004S5_AV40W_SESSION_ID, P004S5_AV27W_DATETIME
            }
            , new Object[] {
            P004S6_A814TBW13_DATETIME, P004S6_A813TBW13_SESSION_ID, P004S6_A815TBW13_STUDY_ID, P004S6_A816TBW13_SUBJECT_ID, P004S6_A817TBW13_VISIT_NO, P004S6_A818TBW13_DOM_CD, P004S6_A819TBW13_DOM_ITM_GRP_OID, P004S6_A820TBW13_DOM_ITM_GRP_ROWNO
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV63Pgmdesc = "CSV出力メイン処理" ;
      AV62Pgmname = "AB514_PC01_CSV_OUTPUT_MAIN" ;
      /* GeneXus formulas. */
      AV63Pgmdesc = "CSV出力メイン処理" ;
      AV62Pgmname = "AB514_PC01_CSV_OUTPUT_MAIN" ;
      Gx_err = (short)(0) ;
   }

   private byte GXv_int4[] ;
   private short AV30W_ERR_CD ;
   private short A820TBW13_DOM_ITM_GRP_ROWNO ;
   private short A817TBW13_VISIT_NO ;
   private short AV39W_RTN_CD ;
   private short AV10ERR_CRF_ID ;
   private short AV18ERR_VISIT_NO ;
   private short AV14ERR_DOM_ITM_GRP_ROWNO ;
   private short GXv_int3[] ;
   private short Gx_err ;
   private int A816TBW13_SUBJECT_ID ;
   private int A169TBM03_ORDER ;
   private int AV17ERR_SUBJECT_ID ;
   private int GXActiveErrHndl ;
   private long A815TBW13_STUDY_ID ;
   private long AV16ERR_STUDY_ID ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV62Pgmname ;
   private String AV63Pgmdesc ;
   private String scmdbuf ;
   private String Gx_ope ;
   private String Gx_etb ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char6[] ;
   private String Gx_emsg ;
   private java.util.Date AV27W_DATETIME ;
   private java.util.Date A814TBW13_DATETIME ;
   private boolean entryPointCalled ;
   private boolean returnInSub ;
   private boolean brk4S2 ;
   private boolean n821TBW13_VALUE ;
   private boolean AV58W_HEADER_INIT ;
   private boolean n178TBM03_DEL_FLG ;
   private boolean n169TBM03_ORDER ;
   private String A821TBW13_VALUE ;
   private String AV8C_TAM02_APP_ID ;
   private String AV31W_ERR_MSG ;
   private String AV40W_SESSION_ID ;
   private String AV36W_NEWLINE ;
   private String AV20P_CSV_COND ;
   private String A819TBW13_DOM_ITM_GRP_OID ;
   private String A818TBW13_DOM_CD ;
   private String A813TBW13_SESSION_ID ;
   private String AV55W_FILE_PATH ;
   private String AV37W_OUTPUT_PATH ;
   private String AV59W_CHAR_SET ;
   private String A162TBM03_DOM_CD ;
   private String A178TBM03_DEL_FLG ;
   private String A163TBM03_DOM_VAR_NM ;
   private String AV57W_CSV_SEP ;
   private String AV11ERR_CRF_ITEM_GRP_CD ;
   private String AV12ERR_DOM_CD ;
   private String AV15ERR_DOM_VER_NM ;
   private String AV13ERR_DOM_ITM_GRP_OID ;
   private String AV35W_MSG ;
   private String AV23P_USER_ID ;
   private String AV21P_PWD ;
   private com.genexus.internet.HttpRequest AV33W_HTTP_REQ ;
   private com.genexus.webpanels.WebSession AV26SESSION ;
   private com.genexus.util.GXFile AV54W_FILE ;
   private com.genexus.util.GXDirectory AV56W_DIR ;
   private IDataStoreProvider pr_default ;
   private String[] P004S2_AV40W_SESSION_ID ;
   private java.util.Date[] P004S2_AV27W_DATETIME ;
   private short[] P004S2_AV30W_ERR_CD ;
   private String[] P004S3_A821TBW13_VALUE ;
   private boolean[] P004S3_n821TBW13_VALUE ;
   private short[] P004S3_A820TBW13_DOM_ITM_GRP_ROWNO ;
   private String[] P004S3_A819TBW13_DOM_ITM_GRP_OID ;
   private short[] P004S3_A817TBW13_VISIT_NO ;
   private int[] P004S3_A816TBW13_SUBJECT_ID ;
   private long[] P004S3_A815TBW13_STUDY_ID ;
   private String[] P004S3_A818TBW13_DOM_CD ;
   private java.util.Date[] P004S3_A814TBW13_DATETIME ;
   private String[] P004S3_A813TBW13_SESSION_ID ;
   private String[] P004S4_A162TBM03_DOM_CD ;
   private String[] P004S4_A178TBM03_DEL_FLG ;
   private boolean[] P004S4_n178TBM03_DEL_FLG ;
   private String[] P004S4_A163TBM03_DOM_VAR_NM ;
   private int[] P004S4_A169TBM03_ORDER ;
   private boolean[] P004S4_n169TBM03_ORDER ;
   private short[] P004S5_AV39W_RTN_CD ;
   private long[] P004S5_AV16ERR_STUDY_ID ;
   private int[] P004S5_AV17ERR_SUBJECT_ID ;
   private short[] P004S5_AV10ERR_CRF_ID ;
   private String[] P004S5_AV11ERR_CRF_ITEM_GRP_CD ;
   private short[] P004S5_AV18ERR_VISIT_NO ;
   private String[] P004S5_AV12ERR_DOM_CD ;
   private String[] P004S5_AV15ERR_DOM_VER_NM ;
   private String[] P004S5_AV13ERR_DOM_ITM_GRP_OID ;
   private short[] P004S5_AV14ERR_DOM_ITM_GRP_ROWNO ;
   private String[] P004S5_AV40W_SESSION_ID ;
   private java.util.Date[] P004S5_AV27W_DATETIME ;
   private java.util.Date[] P004S6_A814TBW13_DATETIME ;
   private String[] P004S6_A813TBW13_SESSION_ID ;
   private long[] P004S6_A815TBW13_STUDY_ID ;
   private int[] P004S6_A816TBW13_SUBJECT_ID ;
   private short[] P004S6_A817TBW13_VISIT_NO ;
   private String[] P004S6_A818TBW13_DOM_CD ;
   private String[] P004S6_A819TBW13_DOM_ITM_GRP_OID ;
   private short[] P004S6_A820TBW13_DOM_ITM_GRP_ROWNO ;
   private com.genexus.internet.HttpResponse AV34W_HTTP_RES ;
   private SdtB808_SD01_EXTRA_INFO AV32W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO5[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV38W_PARMS_ITEM ;
}

final  class ab514_pc01_csv_output_main__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new CallCursor("P004S2", "CALL PROC_MASTER_CSV ( ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK,0)
         ,new ForEachCursor("P004S3", "SELECT `TBW13_VALUE`, `TBW13_DOM_ITM_GRP_ROWNO`, `TBW13_DOM_ITM_GRP_OID`, `TBW13_VISIT_NO`, `TBW13_SUBJECT_ID`, `TBW13_STUDY_ID`, `TBW13_DOM_CD`, `TBW13_DATETIME`, `TBW13_SESSION_ID` FROM `TBW13_CSV_RECORD` WHERE (`TBW13_SESSION_ID` = ?) AND (`TBW13_DATETIME` = ?) ORDER BY `TBW13_DOM_CD`, `TBW13_STUDY_ID`, `TBW13_SUBJECT_ID`, `TBW13_VISIT_NO`, `TBW13_DOM_ITM_GRP_OID`, `TBW13_DOM_ITM_GRP_ROWNO` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
         ,new ForEachCursor("P004S4", "SELECT `TBM03_DOM_CD`, `TBM03_DEL_FLG`, `TBM03_DOM_VAR_NM`, `TBM03_ORDER` FROM `TBM03_CDISC_ITEM` WHERE (`TBM03_DOM_CD` = ?) AND (`TBM03_DEL_FLG` = '0') ORDER BY `TBM03_ORDER` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
         ,new CallCursor("P004S5", "CALL PROC_ERR_CHK_CSV ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK,0)
         ,new ForEachCursor("P004S6", "SELECT `TBW13_DATETIME`, `TBW13_SESSION_ID`, `TBW13_STUDY_ID`, `TBW13_SUBJECT_ID`, `TBW13_VISIT_NO`, `TBW13_DOM_CD`, `TBW13_DOM_ITM_GRP_OID`, `TBW13_DOM_ITM_GRP_ROWNO` FROM `TBW13_CSV_RECORD` WHERE `TBW13_SESSION_ID` = ? and `TBW13_DATETIME` = ? ORDER BY `TBW13_SESSION_ID`, `TBW13_DATETIME`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               break;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((short[]) buf[4])[0] = rslt.getShort(4) ;
               ((int[]) buf[5])[0] = rslt.getInt(5) ;
               ((long[]) buf[6])[0] = rslt.getLong(6) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(7) ;
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(8) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(9) ;
               break;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((int[]) buf[4])[0] = rslt.getInt(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               break;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((int[]) buf[2])[0] = rslt.getInt(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(9) ;
               ((short[]) buf[9])[0] = rslt.getShort(10) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(11) ;
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(12) ;
               break;
            case 4 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((short[]) buf[7])[0] = rslt.getShort(8) ;
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
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 1 , Types.VARCHAR );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 2 , Types.TIMESTAMP );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 3 , Types.NUMERIC, 0 );
               stmt.setVarchar(1, (String)parms[0], 50);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 50);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               break;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 2);
               break;
            case 3 :
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 1 , Types.NUMERIC, 0 );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 2 , Types.NUMERIC, 0 );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 3 , Types.NUMERIC, 0 );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 4 , Types.NUMERIC, 0 );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 5 , Types.VARCHAR );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 6 , Types.NUMERIC, 0 );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 7 , Types.VARCHAR );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 8 , Types.VARCHAR );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 9 , Types.VARCHAR );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 10 , Types.NUMERIC, 0 );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 11 , Types.VARCHAR );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 12 , Types.TIMESTAMP );
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setVarchar(5, (String)parms[4], 50);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setVarchar(7, (String)parms[6], 2);
               stmt.setVarchar(8, (String)parms[7], 50);
               stmt.setVarchar(9, (String)parms[8], 50);
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setVarchar(11, (String)parms[10], 50);
               stmt.setDateTime(12, (java.util.Date)parms[11], false);
               break;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 50);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               break;
      }
   }

}

