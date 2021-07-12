/*
               File: B406_PC01_DESIGN_EXPORT_CSV
        Description: CRFî•ñCSVo—Íˆ—
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:17:44.9
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b406_pc01_design_export_csv extends GXProcedure
{
   public b406_pc01_design_export_csv( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b406_pc01_design_export_csv.class ), "" );
   }

   public b406_pc01_design_export_csv( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( long aP0 ,
                             GxObjectCollection aP1 ,
                             boolean aP2 ,
                             boolean aP3 ,
                             boolean aP4 ,
                             boolean aP5 ,
                             boolean aP6 ,
                             String[] aP7 )
   {
      b406_pc01_design_export_csv.this.AV12P_STUDY_ID = aP0;
      b406_pc01_design_export_csv.this.AV10P_B406_SD01_EXPORT_LIST = aP1;
      b406_pc01_design_export_csv.this.AV35P_BASE_FLG = aP2;
      b406_pc01_design_export_csv.this.AV33P_SITE_FLG = aP3;
      b406_pc01_design_export_csv.this.AV34P_STAFF_FLG = aP4;
      b406_pc01_design_export_csv.this.AV11P_LIST_CHK = aP5;
      b406_pc01_design_export_csv.this.AV13P_SUBJECT_CHK = aP6;
      b406_pc01_design_export_csv.this.aP7 = aP7;
      b406_pc01_design_export_csv.this.aP8 = aP8;
      b406_pc01_design_export_csv.this.aP8 = new String[] {""};
      initialize();
      privateExecute();
      return aP8[0];
   }

   public void execute( long aP0 ,
                        GxObjectCollection aP1 ,
                        boolean aP2 ,
                        boolean aP3 ,
                        boolean aP4 ,
                        boolean aP5 ,
                        boolean aP6 ,
                        String[] aP7 ,
                        String[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( long aP0 ,
                             GxObjectCollection aP1 ,
                             boolean aP2 ,
                             boolean aP3 ,
                             boolean aP4 ,
                             boolean aP5 ,
                             boolean aP6 ,
                             String[] aP7 ,
                             String[] aP8 )
   {
      b406_pc01_design_export_csv.this.AV12P_STUDY_ID = aP0;
      b406_pc01_design_export_csv.this.AV10P_B406_SD01_EXPORT_LIST = aP1;
      b406_pc01_design_export_csv.this.AV35P_BASE_FLG = aP2;
      b406_pc01_design_export_csv.this.AV33P_SITE_FLG = aP3;
      b406_pc01_design_export_csv.this.AV34P_STAFF_FLG = aP4;
      b406_pc01_design_export_csv.this.AV11P_LIST_CHK = aP5;
      b406_pc01_design_export_csv.this.AV13P_SUBJECT_CHK = aP6;
      b406_pc01_design_export_csv.this.aP7 = aP7;
      b406_pc01_design_export_csv.this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9C_TAM02_APP_ID = "B406" ;
      /* Execute user subroutine: S381 */
      S381 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV16PO_ERRCD = "0" ;
      AV17PO_ERRMSG = "" ;
      AV25W_CSV_SDEL = "\"" ;
      AV23W_CSV_FDEL = "," ;
      AV24W_CSV_KAK = ".csv" ;
      AV21W_CSV_CNT = 0 ;
      AV41W_NUM = GXutil.strSearch( AV40W_HTTPREQUEST.getScriptPath(), "/test", 1) ;
      if ( AV41W_NUM >= 1 )
      {
         AV28W_FILE_NAME = "Test_sedc" ;
      }
      else
      {
         AV28W_FILE_NAME = "Prod_sedc" ;
      }
      GXt_char1 = AV28W_FILE_NAME ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( GXutil.now( ), "YYYYMMDDHHMISS", GXv_char2) ;
      b406_pc01_design_export_csv.this.GXt_char1 = GXv_char2[0] ;
      AV28W_FILE_NAME = AV28W_FILE_NAME + "_export_study" + GXutil.trim( GXutil.str( AV12P_STUDY_ID, 10, 0)) + "_" + GXt_char1 + AV24W_CSV_KAK ;
      AV32W_TBM31_CRF_ID.clear();
      AV44GXV1 = 1 ;
      while ( AV44GXV1 <= AV10P_B406_SD01_EXPORT_LIST.size() )
      {
         AV8B406_SD01_EXPORT_LIST_I = (SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem)((SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem)AV10P_B406_SD01_EXPORT_LIST.elementAt(-1+AV44GXV1));
         if ( AV8B406_SD01_EXPORT_LIST_I.getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Check() )
         {
            AV32W_TBM31_CRF_ID.add((short)(AV8B406_SD01_EXPORT_LIST_I.getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_crf_id()), 0);
         }
         AV44GXV1 = (int)(AV44GXV1+1) ;
      }
      AV19W_A812_SD01_CSV_OUTPUT.clear();
      AV21W_CSV_CNT = 0 ;
      if ( AV32W_TBM31_CRF_ID.size() > 0 )
      {
         AV32W_TBM31_CRF_ID.add((short)(9999), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM = (SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem)new SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem(remoteHandle, context);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("S", 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( AV8B406_SD01_EXPORT_LIST_I.getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id(), 10, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(AV8B406_SD01_EXPORT_LIST_I.getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm21_study_nm(), 0);
         AV19W_A812_SD01_CSV_OUTPUT.add(AV20W_A812_SD01_CSV_OUTPUT_ITEM, 0);
         if ( AV35P_BASE_FLG )
         {
            AV31W_TABLE_NM = "TBM21_STUDY" ;
            /* Execute user subroutine: S131 */
            S131 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         if ( AV33P_SITE_FLG )
         {
            AV31W_TABLE_NM = "TBM22_STUDY_SITE" ;
            /* Execute user subroutine: S141 */
            S141 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         if ( AV34P_STAFF_FLG )
         {
            AV31W_TABLE_NM = "TBM23_STUDY_STAFF" ;
            /* Execute user subroutine: S151 */
            S151 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         AV31W_TABLE_NM = "TBM24_MAP_ITEM" ;
         /* Execute user subroutine: S161 */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( AV11P_LIST_CHK )
         {
            AV31W_TABLE_NM = "TBM25_SEL_LIST" ;
            /* Execute user subroutine: S171 */
            S171 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV31W_TABLE_NM = "TBM26_SEL_LIST_ITEM" ;
            /* Execute user subroutine: S181 */
            S181 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         AV31W_TABLE_NM = "TBM31_CRF" ;
         /* Execute user subroutine: S191 */
         S191 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV31W_TABLE_NM = "TBM32_CRF_ITEM" ;
         /* Execute user subroutine: S201 */
         S201 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV31W_TABLE_NM = "TBM33_CRF_COND" ;
         /* Execute user subroutine: S211 */
         S211 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV31W_TABLE_NM = "TBM34_CRF_AUTH" ;
         /* Execute user subroutine: S221 */
         S221 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV31W_TABLE_NM = "TBM35_CRF_ITEM_AUTH" ;
         /* Execute user subroutine: S231 */
         S231 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV31W_TABLE_NM = "TBM36_CRF_SELECT" ;
         /* Execute user subroutine: S241 */
         S241 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV31W_TABLE_NM = "TBM37_CRF_DOM_MAP" ;
         /* Execute user subroutine: S251 */
         S251 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV31W_TABLE_NM = "TBM41_CRF_NCM_MAP" ;
         /* Execute user subroutine: S261 */
         S261 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV31W_TABLE_NM = "TBM42_STUDY_CDISC_DOMAIN" ;
         /* Execute user subroutine: S271 */
         S271 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV31W_TABLE_NM = "TBM43_STUDY_CDISC_ITEM" ;
         /* Execute user subroutine: S281 */
         S281 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV31W_TABLE_NM = "TBM44_CRF_VISIT" ;
         /* Execute user subroutine: S291 */
         S291 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV31W_TABLE_NM = "TBM45_CRF_FILETR" ;
         /* Execute user subroutine: S301 */
         S301 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( AV13P_SUBJECT_CHK )
         {
            AV31W_TABLE_NM = "TBT01_SUBJECT" ;
            /* Execute user subroutine: S311 */
            S311 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV31W_TABLE_NM = "TBT02_CRF" ;
            /* Execute user subroutine: S321 */
            S321 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV31W_TABLE_NM = "TBT11_CRF_HISTORY" ;
            /* Execute user subroutine: S331 */
            S331 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV31W_TABLE_NM = "TBT12_CRF_RESULT" ;
            /* Execute user subroutine: S341 */
            S341 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV31W_TABLE_NM = "TBT13_CRF_RES_HIS" ;
            /* Execute user subroutine: S351 */
            S351 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV31W_TABLE_NM = "TBT14_CRF_MEMO" ;
            /* Execute user subroutine: S361 */
            S361 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV31W_TABLE_NM = "TBT15_CRF_MEMO_LOC" ;
            /* Execute user subroutine: S371 */
            S371 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
      }
      if ( AV21W_CSV_CNT > 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV45Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
         /* Execute user subroutine: S391 */
         S391 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: S401 */
         S401 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else
      {
         AV16PO_ERRCD = "1" ;
         GXt_char1 = AV17PO_ERRMSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00004", "", "", "", "", "", GXv_char2) ;
         b406_pc01_design_export_csv.this.GXt_char1 = GXv_char2[0] ;
         AV17PO_ERRMSG = GXt_char1 ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_SET_CSV_DATA_TABLENM' Routine */
      if ( AV26W_DATA_CNT == 0 )
      {
         AV20W_A812_SD01_CSV_OUTPUT_ITEM = (SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem)new SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem(remoteHandle, context);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("H", 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(AV31W_TABLE_NM, 0);
         AV19W_A812_SD01_CSV_OUTPUT.add(AV20W_A812_SD01_CSV_OUTPUT_ITEM, 0);
      }
   }

   public void S121( )
   {
      /* 'SUB_CSV_CNT' Routine */
      if ( AV26W_DATA_CNT > 0 )
      {
         AV21W_CSV_CNT = (long)(AV21W_CSV_CNT+AV26W_DATA_CNT) ;
      }
   }

   public void S131( )
   {
      /* 'SUB_SET_TBM21_STUDY' Routine */
      AV26W_DATA_CNT = 0 ;
      /* Using cursor P007B2 */
      pr_default.execute(0, new Object[] {new Long(AV8B406_SD01_EXPORT_LIST_I.getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id())});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A63TBM21_STUDY_ID = P007B2_A63TBM21_STUDY_ID[0] ;
         A367TBM21_STUDY_NM = P007B2_A367TBM21_STUDY_NM[0] ;
         n367TBM21_STUDY_NM = P007B2_n367TBM21_STUDY_NM[0] ;
         A530TBM21_OUTER_STUDY_ID = P007B2_A530TBM21_OUTER_STUDY_ID[0] ;
         n530TBM21_OUTER_STUDY_ID = P007B2_n530TBM21_OUTER_STUDY_ID[0] ;
         A531TBM21_PROC_NM = P007B2_A531TBM21_PROC_NM[0] ;
         n531TBM21_PROC_NM = P007B2_n531TBM21_PROC_NM[0] ;
         A368TBM21_NOTE = P007B2_A368TBM21_NOTE[0] ;
         n368TBM21_NOTE = P007B2_n368TBM21_NOTE[0] ;
         A607TBM21_STATUS = P007B2_A607TBM21_STATUS[0] ;
         n607TBM21_STATUS = P007B2_n607TBM21_STATUS[0] ;
         A369TBM21_DEL_FLG = P007B2_A369TBM21_DEL_FLG[0] ;
         n369TBM21_DEL_FLG = P007B2_n369TBM21_DEL_FLG[0] ;
         A370TBM21_CRT_DATETIME = P007B2_A370TBM21_CRT_DATETIME[0] ;
         n370TBM21_CRT_DATETIME = P007B2_n370TBM21_CRT_DATETIME[0] ;
         A371TBM21_CRT_USER_ID = P007B2_A371TBM21_CRT_USER_ID[0] ;
         n371TBM21_CRT_USER_ID = P007B2_n371TBM21_CRT_USER_ID[0] ;
         A372TBM21_CRT_PROG_NM = P007B2_A372TBM21_CRT_PROG_NM[0] ;
         n372TBM21_CRT_PROG_NM = P007B2_n372TBM21_CRT_PROG_NM[0] ;
         A373TBM21_UPD_DATETIME = P007B2_A373TBM21_UPD_DATETIME[0] ;
         n373TBM21_UPD_DATETIME = P007B2_n373TBM21_UPD_DATETIME[0] ;
         A374TBM21_UPD_USER_ID = P007B2_A374TBM21_UPD_USER_ID[0] ;
         n374TBM21_UPD_USER_ID = P007B2_n374TBM21_UPD_USER_ID[0] ;
         A375TBM21_UPD_PROG_NM = P007B2_A375TBM21_UPD_PROG_NM[0] ;
         n375TBM21_UPD_PROG_NM = P007B2_n375TBM21_UPD_PROG_NM[0] ;
         A376TBM21_UPD_CNT = P007B2_A376TBM21_UPD_CNT[0] ;
         n376TBM21_UPD_CNT = P007B2_n376TBM21_UPD_CNT[0] ;
         /* Execute user subroutine: S111 */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV26W_DATA_CNT = (long)(AV26W_DATA_CNT+1) ;
         AV20W_A812_SD01_CSV_OUTPUT_ITEM = (SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem)new SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem(remoteHandle, context);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("D", 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A63TBM21_STUDY_ID, 10, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A367TBM21_STUDY_NM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A530TBM21_OUTER_STUDY_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A531TBM21_PROC_NM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A368TBM21_NOTE, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A607TBM21_STATUS, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A369TBM21_DEL_FLG, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.format( A370TBM21_CRT_DATETIME, "9999/99/99 99:99:99"), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A371TBM21_CRT_USER_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A372TBM21_CRT_PROG_NM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.format( A373TBM21_UPD_DATETIME, "9999/99/99 99:99:99"), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A374TBM21_UPD_USER_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A375TBM21_UPD_PROG_NM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A376TBM21_UPD_CNT, 10, 0)), 0);
         AV19W_A812_SD01_CSV_OUTPUT.add(AV20W_A812_SD01_CSV_OUTPUT_ITEM, 0);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Execute user subroutine: S121 */
      S121 ();
      if (returnInSub) return;
   }

   public void S141( )
   {
      /* 'SUB_SET_TBM22_STUDY_SITE' Routine */
      AV26W_DATA_CNT = 0 ;
      /* Using cursor P007B3 */
      pr_default.execute(1, new Object[] {new Long(AV8B406_SD01_EXPORT_LIST_I.getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id())});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A17TBM22_STUDY_ID = P007B3_A17TBM22_STUDY_ID[0] ;
         A18TBM22_SITE_ID = P007B3_A18TBM22_SITE_ID[0] ;
         A377TBM22_DEL_FLG = P007B3_A377TBM22_DEL_FLG[0] ;
         n377TBM22_DEL_FLG = P007B3_n377TBM22_DEL_FLG[0] ;
         A378TBM22_CRT_DATETIME = P007B3_A378TBM22_CRT_DATETIME[0] ;
         n378TBM22_CRT_DATETIME = P007B3_n378TBM22_CRT_DATETIME[0] ;
         A379TBM22_CRT_USER_ID = P007B3_A379TBM22_CRT_USER_ID[0] ;
         n379TBM22_CRT_USER_ID = P007B3_n379TBM22_CRT_USER_ID[0] ;
         A380TBM22_CRT_PROG_NM = P007B3_A380TBM22_CRT_PROG_NM[0] ;
         n380TBM22_CRT_PROG_NM = P007B3_n380TBM22_CRT_PROG_NM[0] ;
         A381TBM22_UPD_DATETIME = P007B3_A381TBM22_UPD_DATETIME[0] ;
         n381TBM22_UPD_DATETIME = P007B3_n381TBM22_UPD_DATETIME[0] ;
         A382TBM22_UPD_USER_ID = P007B3_A382TBM22_UPD_USER_ID[0] ;
         n382TBM22_UPD_USER_ID = P007B3_n382TBM22_UPD_USER_ID[0] ;
         A383TBM22_UPD_PROG_NM = P007B3_A383TBM22_UPD_PROG_NM[0] ;
         n383TBM22_UPD_PROG_NM = P007B3_n383TBM22_UPD_PROG_NM[0] ;
         A384TBM22_UPD_CNT = P007B3_A384TBM22_UPD_CNT[0] ;
         n384TBM22_UPD_CNT = P007B3_n384TBM22_UPD_CNT[0] ;
         /* Execute user subroutine: S111 */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            returnInSub = true;
            if (true) return;
         }
         AV26W_DATA_CNT = (long)(AV26W_DATA_CNT+1) ;
         AV20W_A812_SD01_CSV_OUTPUT_ITEM = (SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem)new SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem(remoteHandle, context);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("D", 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A17TBM22_STUDY_ID, 10, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A18TBM22_SITE_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A377TBM22_DEL_FLG, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.format( A378TBM22_CRT_DATETIME, "9999/99/99 99:99:99"), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A379TBM22_CRT_USER_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A380TBM22_CRT_PROG_NM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.format( A381TBM22_UPD_DATETIME, "9999/99/99 99:99:99"), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A382TBM22_UPD_USER_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A383TBM22_UPD_PROG_NM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A384TBM22_UPD_CNT, 10, 0)), 0);
         AV19W_A812_SD01_CSV_OUTPUT.add(AV20W_A812_SD01_CSV_OUTPUT_ITEM, 0);
         pr_default.readNext(1);
      }
      pr_default.close(1);
      /* Execute user subroutine: S121 */
      S121 ();
      if (returnInSub) return;
   }

   public void S151( )
   {
      /* 'SUB_SET_TBM23_STUDY_STAFF' Routine */
      AV26W_DATA_CNT = 0 ;
      /* Using cursor P007B4 */
      pr_default.execute(2, new Object[] {new Long(AV8B406_SD01_EXPORT_LIST_I.getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id())});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A107TBM23_STUDY_ID = P007B4_A107TBM23_STUDY_ID[0] ;
         A108TBM23_USER_ID = P007B4_A108TBM23_USER_ID[0] ;
         A109TBM23_STYDY_AUTH_CD = P007B4_A109TBM23_STYDY_AUTH_CD[0] ;
         A385TBM23_DEL_FLG = P007B4_A385TBM23_DEL_FLG[0] ;
         n385TBM23_DEL_FLG = P007B4_n385TBM23_DEL_FLG[0] ;
         A386TBM23_CRT_DATETIME = P007B4_A386TBM23_CRT_DATETIME[0] ;
         n386TBM23_CRT_DATETIME = P007B4_n386TBM23_CRT_DATETIME[0] ;
         A387TBM23_CRT_USER_ID = P007B4_A387TBM23_CRT_USER_ID[0] ;
         n387TBM23_CRT_USER_ID = P007B4_n387TBM23_CRT_USER_ID[0] ;
         A388TBM23_CRT_PROG_NM = P007B4_A388TBM23_CRT_PROG_NM[0] ;
         n388TBM23_CRT_PROG_NM = P007B4_n388TBM23_CRT_PROG_NM[0] ;
         A389TBM23_UPD_DATETIME = P007B4_A389TBM23_UPD_DATETIME[0] ;
         n389TBM23_UPD_DATETIME = P007B4_n389TBM23_UPD_DATETIME[0] ;
         A390TBM23_UPD_USER_ID = P007B4_A390TBM23_UPD_USER_ID[0] ;
         n390TBM23_UPD_USER_ID = P007B4_n390TBM23_UPD_USER_ID[0] ;
         A391TBM23_UPD_PROG_NM = P007B4_A391TBM23_UPD_PROG_NM[0] ;
         n391TBM23_UPD_PROG_NM = P007B4_n391TBM23_UPD_PROG_NM[0] ;
         A392TBM23_UPD_CNT = P007B4_A392TBM23_UPD_CNT[0] ;
         n392TBM23_UPD_CNT = P007B4_n392TBM23_UPD_CNT[0] ;
         /* Execute user subroutine: S111 */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(2);
            returnInSub = true;
            if (true) return;
         }
         AV26W_DATA_CNT = (long)(AV26W_DATA_CNT+1) ;
         AV20W_A812_SD01_CSV_OUTPUT_ITEM = (SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem)new SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem(remoteHandle, context);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("D", 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A107TBM23_STUDY_ID, 10, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A108TBM23_USER_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A109TBM23_STYDY_AUTH_CD, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A385TBM23_DEL_FLG, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.format( A386TBM23_CRT_DATETIME, "9999/99/99 99:99:99"), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A387TBM23_CRT_USER_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A388TBM23_CRT_PROG_NM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.format( A389TBM23_UPD_DATETIME, "9999/99/99 99:99:99"), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A390TBM23_UPD_USER_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A391TBM23_UPD_PROG_NM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A392TBM23_UPD_CNT, 10, 0)), 0);
         AV19W_A812_SD01_CSV_OUTPUT.add(AV20W_A812_SD01_CSV_OUTPUT_ITEM, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      /* Execute user subroutine: S121 */
      S121 ();
      if (returnInSub) return;
   }

   public void S161( )
   {
      /* 'SUB_SET_TBM24_MAP_ITEM' Routine */
      AV26W_DATA_CNT = 0 ;
      /* Using cursor P007B5 */
      pr_default.execute(3, new Object[] {new Long(AV8B406_SD01_EXPORT_LIST_I.getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id())});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A64TBM24_STUDY_ID = P007B5_A64TBM24_STUDY_ID[0] ;
         A65TBM24_DOM_CD = P007B5_A65TBM24_DOM_CD[0] ;
         A66TBM24_DOM_VAR_NM = P007B5_A66TBM24_DOM_VAR_NM[0] ;
         A702TBM24_DOM_ITM_GRP_OID = P007B5_A702TBM24_DOM_ITM_GRP_OID[0] ;
         n702TBM24_DOM_ITM_GRP_OID = P007B5_n702TBM24_DOM_ITM_GRP_OID[0] ;
         A703TBM24_DOM_ITM_GRP_ATTR_SEQ = P007B5_A703TBM24_DOM_ITM_GRP_ATTR_SEQ[0] ;
         n703TBM24_DOM_ITM_GRP_ATTR_SEQ = P007B5_n703TBM24_DOM_ITM_GRP_ATTR_SEQ[0] ;
         A704TBM24_DOM_ITM_GRP_ROWNO = P007B5_A704TBM24_DOM_ITM_GRP_ROWNO[0] ;
         n704TBM24_DOM_ITM_GRP_ROWNO = P007B5_n704TBM24_DOM_ITM_GRP_ROWNO[0] ;
         A705TBM24_CRF_ITEM_NM = P007B5_A705TBM24_CRF_ITEM_NM[0] ;
         n705TBM24_CRF_ITEM_NM = P007B5_n705TBM24_CRF_ITEM_NM[0] ;
         A67TBM24_CRF_ITEM_DIV = P007B5_A67TBM24_CRF_ITEM_DIV[0] ;
         A635TBM24_IDENTIFICATION_CD = P007B5_A635TBM24_IDENTIFICATION_CD[0] ;
         n635TBM24_IDENTIFICATION_CD = P007B5_n635TBM24_IDENTIFICATION_CD[0] ;
         A636TBM24_TEXT_MAXLENGTH = P007B5_A636TBM24_TEXT_MAXLENGTH[0] ;
         n636TBM24_TEXT_MAXLENGTH = P007B5_n636TBM24_TEXT_MAXLENGTH[0] ;
         A637TBM24_TEXT_MAXROWS = P007B5_A637TBM24_TEXT_MAXROWS[0] ;
         n637TBM24_TEXT_MAXROWS = P007B5_n637TBM24_TEXT_MAXROWS[0] ;
         A638TBM24_DECIMAL_DIGITS = P007B5_A638TBM24_DECIMAL_DIGITS[0] ;
         n638TBM24_DECIMAL_DIGITS = P007B5_n638TBM24_DECIMAL_DIGITS[0] ;
         A639TBM24_TEXT = P007B5_A639TBM24_TEXT[0] ;
         n639TBM24_TEXT = P007B5_n639TBM24_TEXT[0] ;
         A640TBM24_FIXED_VALUE = P007B5_A640TBM24_FIXED_VALUE[0] ;
         n640TBM24_FIXED_VALUE = P007B5_n640TBM24_FIXED_VALUE[0] ;
         A641TBM24_CHK_FALSE_INNER_VALUE = P007B5_A641TBM24_CHK_FALSE_INNER_VALUE[0] ;
         n641TBM24_CHK_FALSE_INNER_VALUE = P007B5_n641TBM24_CHK_FALSE_INNER_VALUE[0] ;
         A706TBM24_REQUIRED_INPUT_FLG = P007B5_A706TBM24_REQUIRED_INPUT_FLG[0] ;
         n706TBM24_REQUIRED_INPUT_FLG = P007B5_n706TBM24_REQUIRED_INPUT_FLG[0] ;
         A707TBM24_MIN_VALUE = P007B5_A707TBM24_MIN_VALUE[0] ;
         n707TBM24_MIN_VALUE = P007B5_n707TBM24_MIN_VALUE[0] ;
         A708TBM24_MAX_VALUE = P007B5_A708TBM24_MAX_VALUE[0] ;
         n708TBM24_MAX_VALUE = P007B5_n708TBM24_MAX_VALUE[0] ;
         A543TBM24_ORDER = P007B5_A543TBM24_ORDER[0] ;
         n543TBM24_ORDER = P007B5_n543TBM24_ORDER[0] ;
         A544TBM24_DEL_FLG = P007B5_A544TBM24_DEL_FLG[0] ;
         n544TBM24_DEL_FLG = P007B5_n544TBM24_DEL_FLG[0] ;
         A545TBM24_CRT_DATETIME = P007B5_A545TBM24_CRT_DATETIME[0] ;
         n545TBM24_CRT_DATETIME = P007B5_n545TBM24_CRT_DATETIME[0] ;
         A546TBM24_CRT_USER_ID = P007B5_A546TBM24_CRT_USER_ID[0] ;
         n546TBM24_CRT_USER_ID = P007B5_n546TBM24_CRT_USER_ID[0] ;
         A547TBM24_CRT_PROG_NM = P007B5_A547TBM24_CRT_PROG_NM[0] ;
         n547TBM24_CRT_PROG_NM = P007B5_n547TBM24_CRT_PROG_NM[0] ;
         A548TBM24_UPD_DATETIME = P007B5_A548TBM24_UPD_DATETIME[0] ;
         n548TBM24_UPD_DATETIME = P007B5_n548TBM24_UPD_DATETIME[0] ;
         A549TBM24_UPD_USER_ID = P007B5_A549TBM24_UPD_USER_ID[0] ;
         n549TBM24_UPD_USER_ID = P007B5_n549TBM24_UPD_USER_ID[0] ;
         A550TBM24_UPD_PROG_NM = P007B5_A550TBM24_UPD_PROG_NM[0] ;
         n550TBM24_UPD_PROG_NM = P007B5_n550TBM24_UPD_PROG_NM[0] ;
         A551TBM24_UPD_CNT = P007B5_A551TBM24_UPD_CNT[0] ;
         n551TBM24_UPD_CNT = P007B5_n551TBM24_UPD_CNT[0] ;
         /* Execute user subroutine: S111 */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(3);
            returnInSub = true;
            if (true) return;
         }
         AV26W_DATA_CNT = (long)(AV26W_DATA_CNT+1) ;
         AV20W_A812_SD01_CSV_OUTPUT_ITEM = (SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem)new SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem(remoteHandle, context);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("D", 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A64TBM24_STUDY_ID, 10, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A65TBM24_DOM_CD, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A66TBM24_DOM_VAR_NM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A702TBM24_DOM_ITM_GRP_OID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A703TBM24_DOM_ITM_GRP_ATTR_SEQ, 4, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A704TBM24_DOM_ITM_GRP_ROWNO, 4, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A705TBM24_CRF_ITEM_NM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A67TBM24_CRF_ITEM_DIV, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A635TBM24_IDENTIFICATION_CD, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A636TBM24_TEXT_MAXLENGTH, 3, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A637TBM24_TEXT_MAXROWS, 2, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A638TBM24_DECIMAL_DIGITS, 2, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A639TBM24_TEXT, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A640TBM24_FIXED_VALUE, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A641TBM24_CHK_FALSE_INNER_VALUE, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A706TBM24_REQUIRED_INPUT_FLG, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A707TBM24_MIN_VALUE, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A708TBM24_MAX_VALUE, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A543TBM24_ORDER, 5, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A544TBM24_DEL_FLG, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.format( A545TBM24_CRT_DATETIME, "9999/99/99 99:99:99"), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A546TBM24_CRT_USER_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A547TBM24_CRT_PROG_NM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.format( A548TBM24_UPD_DATETIME, "9999/99/99 99:99:99"), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A549TBM24_UPD_USER_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A550TBM24_UPD_PROG_NM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A551TBM24_UPD_CNT, 10, 0)), 0);
         AV19W_A812_SD01_CSV_OUTPUT.add(AV20W_A812_SD01_CSV_OUTPUT_ITEM, 0);
         pr_default.readNext(3);
      }
      pr_default.close(3);
      /* Execute user subroutine: S121 */
      S121 ();
      if (returnInSub) return;
   }

   public void S171( )
   {
      /* 'SUB_SET_TBM25_SEL_LIST' Routine */
      AV26W_DATA_CNT = 0 ;
      /* Using cursor P007B6 */
      pr_default.execute(4, new Object[] {new Long(AV8B406_SD01_EXPORT_LIST_I.getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id())});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A23TBM25_STUDY_ID = P007B6_A23TBM25_STUDY_ID[0] ;
         A24TBM25_LIST_CD = P007B6_A24TBM25_LIST_CD[0] ;
         A552TBM25_LIST_NM = P007B6_A552TBM25_LIST_NM[0] ;
         n552TBM25_LIST_NM = P007B6_n552TBM25_LIST_NM[0] ;
         A553TBM25_DEL_FLG = P007B6_A553TBM25_DEL_FLG[0] ;
         n553TBM25_DEL_FLG = P007B6_n553TBM25_DEL_FLG[0] ;
         A554TBM25_CRT_DATETIME = P007B6_A554TBM25_CRT_DATETIME[0] ;
         n554TBM25_CRT_DATETIME = P007B6_n554TBM25_CRT_DATETIME[0] ;
         A555TBM25_CRT_USER_ID = P007B6_A555TBM25_CRT_USER_ID[0] ;
         n555TBM25_CRT_USER_ID = P007B6_n555TBM25_CRT_USER_ID[0] ;
         A556TBM25_CRT_PROG_NM = P007B6_A556TBM25_CRT_PROG_NM[0] ;
         n556TBM25_CRT_PROG_NM = P007B6_n556TBM25_CRT_PROG_NM[0] ;
         A557TBM25_UPD_DATETIME = P007B6_A557TBM25_UPD_DATETIME[0] ;
         n557TBM25_UPD_DATETIME = P007B6_n557TBM25_UPD_DATETIME[0] ;
         A558TBM25_UPD_USER_ID = P007B6_A558TBM25_UPD_USER_ID[0] ;
         n558TBM25_UPD_USER_ID = P007B6_n558TBM25_UPD_USER_ID[0] ;
         A559TBM25_UPD_PROG_NM = P007B6_A559TBM25_UPD_PROG_NM[0] ;
         n559TBM25_UPD_PROG_NM = P007B6_n559TBM25_UPD_PROG_NM[0] ;
         A560TBM25_UPD_CNT = P007B6_A560TBM25_UPD_CNT[0] ;
         n560TBM25_UPD_CNT = P007B6_n560TBM25_UPD_CNT[0] ;
         /* Execute user subroutine: S111 */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(4);
            returnInSub = true;
            if (true) return;
         }
         AV26W_DATA_CNT = (long)(AV26W_DATA_CNT+1) ;
         AV20W_A812_SD01_CSV_OUTPUT_ITEM = (SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem)new SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem(remoteHandle, context);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("D", 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A23TBM25_STUDY_ID, 10, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A24TBM25_LIST_CD, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A552TBM25_LIST_NM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A553TBM25_DEL_FLG, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.format( A554TBM25_CRT_DATETIME, "9999/99/99 99:99:99"), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A555TBM25_CRT_USER_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A556TBM25_CRT_PROG_NM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.format( A557TBM25_UPD_DATETIME, "9999/99/99 99:99:99"), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A558TBM25_UPD_USER_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A559TBM25_UPD_PROG_NM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A560TBM25_UPD_CNT, 10, 0)), 0);
         AV19W_A812_SD01_CSV_OUTPUT.add(AV20W_A812_SD01_CSV_OUTPUT_ITEM, 0);
         pr_default.readNext(4);
      }
      pr_default.close(4);
      /* Execute user subroutine: S121 */
      S121 ();
      if (returnInSub) return;
   }

   public void S181( )
   {
      /* 'SUB_SET_TBM26_SEL_LIST_ITEM' Routine */
      AV26W_DATA_CNT = 0 ;
      /* Using cursor P007B7 */
      pr_default.execute(5, new Object[] {new Long(AV8B406_SD01_EXPORT_LIST_I.getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id())});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A25TBM26_STUDY_ID = P007B7_A25TBM26_STUDY_ID[0] ;
         A26TBM26_LIST_CD = P007B7_A26TBM26_LIST_CD[0] ;
         A27TBM26_LIST_ITEM_NO = P007B7_A27TBM26_LIST_ITEM_NO[0] ;
         A561TBM26_LIST_ITEM_NAME = P007B7_A561TBM26_LIST_ITEM_NAME[0] ;
         n561TBM26_LIST_ITEM_NAME = P007B7_n561TBM26_LIST_ITEM_NAME[0] ;
         A562TBM26_INNER_VALUE = P007B7_A562TBM26_INNER_VALUE[0] ;
         n562TBM26_INNER_VALUE = P007B7_n562TBM26_INNER_VALUE[0] ;
         A563TBM26_DEL_FLG = P007B7_A563TBM26_DEL_FLG[0] ;
         n563TBM26_DEL_FLG = P007B7_n563TBM26_DEL_FLG[0] ;
         A564TBM26_CRT_DATETIME = P007B7_A564TBM26_CRT_DATETIME[0] ;
         n564TBM26_CRT_DATETIME = P007B7_n564TBM26_CRT_DATETIME[0] ;
         A565TBM26_CRT_USER_ID = P007B7_A565TBM26_CRT_USER_ID[0] ;
         n565TBM26_CRT_USER_ID = P007B7_n565TBM26_CRT_USER_ID[0] ;
         A566TBM26_CRT_PROG_NM = P007B7_A566TBM26_CRT_PROG_NM[0] ;
         n566TBM26_CRT_PROG_NM = P007B7_n566TBM26_CRT_PROG_NM[0] ;
         A567TBM26_UPD_DATETIME = P007B7_A567TBM26_UPD_DATETIME[0] ;
         n567TBM26_UPD_DATETIME = P007B7_n567TBM26_UPD_DATETIME[0] ;
         A568TBM26_UPD_USER_ID = P007B7_A568TBM26_UPD_USER_ID[0] ;
         n568TBM26_UPD_USER_ID = P007B7_n568TBM26_UPD_USER_ID[0] ;
         A569TBM26_UPD_PROG_NM = P007B7_A569TBM26_UPD_PROG_NM[0] ;
         n569TBM26_UPD_PROG_NM = P007B7_n569TBM26_UPD_PROG_NM[0] ;
         A570TBM26_UPD_CNT = P007B7_A570TBM26_UPD_CNT[0] ;
         n570TBM26_UPD_CNT = P007B7_n570TBM26_UPD_CNT[0] ;
         /* Execute user subroutine: S111 */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(5);
            returnInSub = true;
            if (true) return;
         }
         AV26W_DATA_CNT = (long)(AV26W_DATA_CNT+1) ;
         AV20W_A812_SD01_CSV_OUTPUT_ITEM = (SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem)new SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem(remoteHandle, context);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("D", 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A25TBM26_STUDY_ID, 10, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A26TBM26_LIST_CD, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A27TBM26_LIST_ITEM_NO, 3, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A561TBM26_LIST_ITEM_NAME, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A562TBM26_INNER_VALUE, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A563TBM26_DEL_FLG, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.format( A564TBM26_CRT_DATETIME, "9999/99/99 99:99:99"), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A565TBM26_CRT_USER_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A566TBM26_CRT_PROG_NM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.format( A567TBM26_UPD_DATETIME, "9999/99/99 99:99:99"), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A568TBM26_UPD_USER_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A569TBM26_UPD_PROG_NM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A570TBM26_UPD_CNT, 10, 0)), 0);
         AV19W_A812_SD01_CSV_OUTPUT.add(AV20W_A812_SD01_CSV_OUTPUT_ITEM, 0);
         pr_default.readNext(5);
      }
      pr_default.close(5);
      /* Execute user subroutine: S121 */
      S121 ();
      if (returnInSub) return;
   }

   public void S191( )
   {
      /* 'SUB_SET_TBM31_CRF' Routine */
      AV26W_DATA_CNT = 0 ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           new Short(A69TBM31_CRF_ID) ,
                                           AV32W_TBM31_CRF_ID ,
                                           new Long(A68TBM31_STUDY_ID) ,
                                           new Long(AV8B406_SD01_EXPORT_LIST_I.getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id()) },
                                           new int[] {
                                           TypeConstants.SHORT, TypeConstants.OBJECT_COLLECTION, TypeConstants.LONG, TypeConstants.LONG
                                           }
      });
      /* Using cursor P007B8 */
      pr_default.execute(6, new Object[] {new Long(AV8B406_SD01_EXPORT_LIST_I.getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id())});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A69TBM31_CRF_ID = P007B8_A69TBM31_CRF_ID[0] ;
         A68TBM31_STUDY_ID = P007B8_A68TBM31_STUDY_ID[0] ;
         A393TBM31_CRF_NM = P007B8_A393TBM31_CRF_NM[0] ;
         n393TBM31_CRF_NM = P007B8_n393TBM31_CRF_NM[0] ;
         A642TBM31_CRF_SNM = P007B8_A642TBM31_CRF_SNM[0] ;
         n642TBM31_CRF_SNM = P007B8_n642TBM31_CRF_SNM[0] ;
         A394TBM31_GRID_SIZE = P007B8_A394TBM31_GRID_SIZE[0] ;
         n394TBM31_GRID_SIZE = P007B8_n394TBM31_GRID_SIZE[0] ;
         A528TBM31_DEF_VISIT_NO = P007B8_A528TBM31_DEF_VISIT_NO[0] ;
         n528TBM31_DEF_VISIT_NO = P007B8_n528TBM31_DEF_VISIT_NO[0] ;
         A529TBM31_DEF_DOMAIN_CD = P007B8_A529TBM31_DEF_DOMAIN_CD[0] ;
         n529TBM31_DEF_DOMAIN_CD = P007B8_n529TBM31_DEF_DOMAIN_CD[0] ;
         A643TBM31_STATUS = P007B8_A643TBM31_STATUS[0] ;
         n643TBM31_STATUS = P007B8_n643TBM31_STATUS[0] ;
         A396TBM31_NOTE = P007B8_A396TBM31_NOTE[0] ;
         n396TBM31_NOTE = P007B8_n396TBM31_NOTE[0] ;
         A943TBM31_REPEAT_FLG = P007B8_A943TBM31_REPEAT_FLG[0] ;
         n943TBM31_REPEAT_FLG = P007B8_n943TBM31_REPEAT_FLG[0] ;
         A944TBM31_REPEAT_MAX = P007B8_A944TBM31_REPEAT_MAX[0] ;
         n944TBM31_REPEAT_MAX = P007B8_n944TBM31_REPEAT_MAX[0] ;
         A979TBM31_DM_EXCP_NO_DISP_FLG = P007B8_A979TBM31_DM_EXCP_NO_DISP_FLG[0] ;
         n979TBM31_DM_EXCP_NO_DISP_FLG = P007B8_n979TBM31_DM_EXCP_NO_DISP_FLG[0] ;
         A397TBM31_DEL_FLG = P007B8_A397TBM31_DEL_FLG[0] ;
         n397TBM31_DEL_FLG = P007B8_n397TBM31_DEL_FLG[0] ;
         A398TBM31_CRT_DATETIME = P007B8_A398TBM31_CRT_DATETIME[0] ;
         n398TBM31_CRT_DATETIME = P007B8_n398TBM31_CRT_DATETIME[0] ;
         A399TBM31_CRT_USER_ID = P007B8_A399TBM31_CRT_USER_ID[0] ;
         n399TBM31_CRT_USER_ID = P007B8_n399TBM31_CRT_USER_ID[0] ;
         A400TBM31_CRT_PROG_NM = P007B8_A400TBM31_CRT_PROG_NM[0] ;
         n400TBM31_CRT_PROG_NM = P007B8_n400TBM31_CRT_PROG_NM[0] ;
         A401TBM31_UPD_DATETIME = P007B8_A401TBM31_UPD_DATETIME[0] ;
         n401TBM31_UPD_DATETIME = P007B8_n401TBM31_UPD_DATETIME[0] ;
         A402TBM31_UPD_USER_ID = P007B8_A402TBM31_UPD_USER_ID[0] ;
         n402TBM31_UPD_USER_ID = P007B8_n402TBM31_UPD_USER_ID[0] ;
         A403TBM31_UPD_PROG_NM = P007B8_A403TBM31_UPD_PROG_NM[0] ;
         n403TBM31_UPD_PROG_NM = P007B8_n403TBM31_UPD_PROG_NM[0] ;
         A404TBM31_UPD_CNT = P007B8_A404TBM31_UPD_CNT[0] ;
         n404TBM31_UPD_CNT = P007B8_n404TBM31_UPD_CNT[0] ;
         A395TBM31_ORDER = P007B8_A395TBM31_ORDER[0] ;
         n395TBM31_ORDER = P007B8_n395TBM31_ORDER[0] ;
         /* Execute user subroutine: S111 */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(6);
            returnInSub = true;
            if (true) return;
         }
         AV26W_DATA_CNT = (long)(AV26W_DATA_CNT+1) ;
         AV20W_A812_SD01_CSV_OUTPUT_ITEM = (SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem)new SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem(remoteHandle, context);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("D", 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A68TBM31_STUDY_ID, 10, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A69TBM31_CRF_ID, 4, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A393TBM31_CRF_NM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A642TBM31_CRF_SNM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A394TBM31_GRID_SIZE, 3, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A395TBM31_ORDER, 5, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A528TBM31_DEF_VISIT_NO, 6, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A529TBM31_DEF_DOMAIN_CD, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A643TBM31_STATUS, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A396TBM31_NOTE, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A943TBM31_REPEAT_FLG, 1, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A944TBM31_REPEAT_MAX, 2, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A979TBM31_DM_EXCP_NO_DISP_FLG, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A397TBM31_DEL_FLG, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.format( A398TBM31_CRT_DATETIME, "9999/99/99 99:99:99"), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A399TBM31_CRT_USER_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A400TBM31_CRT_PROG_NM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.format( A401TBM31_UPD_DATETIME, "9999/99/99 99:99:99"), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A402TBM31_UPD_USER_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A403TBM31_UPD_PROG_NM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A404TBM31_UPD_CNT, 10, 0)), 0);
         AV19W_A812_SD01_CSV_OUTPUT.add(AV20W_A812_SD01_CSV_OUTPUT_ITEM, 0);
         pr_default.readNext(6);
      }
      pr_default.close(6);
      /* Execute user subroutine: S121 */
      S121 ();
      if (returnInSub) return;
   }

   public void S201( )
   {
      /* 'SUB_SET_TBM32_CRF_ITEM' Routine */
      AV26W_DATA_CNT = 0 ;
      pr_default.dynParam(7, new Object[]{ new Object[]{
                                           new Short(A71TBM32_CRF_ID) ,
                                           AV32W_TBM31_CRF_ID ,
                                           new Long(AV8B406_SD01_EXPORT_LIST_I.getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id()) ,
                                           new Long(A70TBM32_STUDY_ID) },
                                           new int[] {
                                           TypeConstants.SHORT, TypeConstants.OBJECT_COLLECTION, TypeConstants.LONG, TypeConstants.LONG
                                           }
      });
      /* Using cursor P007B9 */
      pr_default.execute(7, new Object[] {new Long(AV8B406_SD01_EXPORT_LIST_I.getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id())});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A71TBM32_CRF_ID = P007B9_A71TBM32_CRF_ID[0] ;
         A70TBM32_STUDY_ID = P007B9_A70TBM32_STUDY_ID[0] ;
         A72TBM32_CRF_ITEM_CD = P007B9_A72TBM32_CRF_ITEM_CD[0] ;
         A405TBM32_CRF_ITEM_NM = P007B9_A405TBM32_CRF_ITEM_NM[0] ;
         n405TBM32_CRF_ITEM_NM = P007B9_n405TBM32_CRF_ITEM_NM[0] ;
         A74TBM32_CRF_ITEM_DIV = P007B9_A74TBM32_CRF_ITEM_DIV[0] ;
         n74TBM32_CRF_ITEM_DIV = P007B9_n74TBM32_CRF_ITEM_DIV[0] ;
         A73TBM32_CRF_ITEM_GRP_CD = P007B9_A73TBM32_CRF_ITEM_GRP_CD[0] ;
         n73TBM32_CRF_ITEM_GRP_CD = P007B9_n73TBM32_CRF_ITEM_GRP_CD[0] ;
         A507TBM32_CRF_ITEM_GRP_ORDER = P007B9_A507TBM32_CRF_ITEM_GRP_ORDER[0] ;
         n507TBM32_CRF_ITEM_GRP_ORDER = P007B9_n507TBM32_CRF_ITEM_GRP_ORDER[0] ;
         A508TBM32_LOCATION_X = P007B9_A508TBM32_LOCATION_X[0] ;
         n508TBM32_LOCATION_X = P007B9_n508TBM32_LOCATION_X[0] ;
         A509TBM32_LOCATION_Y = P007B9_A509TBM32_LOCATION_Y[0] ;
         n509TBM32_LOCATION_Y = P007B9_n509TBM32_LOCATION_Y[0] ;
         A510TBM32_LOCATION_X2 = P007B9_A510TBM32_LOCATION_X2[0] ;
         n510TBM32_LOCATION_X2 = P007B9_n510TBM32_LOCATION_X2[0] ;
         A511TBM32_LOCATION_Y2 = P007B9_A511TBM32_LOCATION_Y2[0] ;
         n511TBM32_LOCATION_Y2 = P007B9_n511TBM32_LOCATION_Y2[0] ;
         A512TBM32_TEXT_ALIGN_DIV = P007B9_A512TBM32_TEXT_ALIGN_DIV[0] ;
         n512TBM32_TEXT_ALIGN_DIV = P007B9_n512TBM32_TEXT_ALIGN_DIV[0] ;
         A516TBM32_TEXT_MAXROWS = P007B9_A516TBM32_TEXT_MAXROWS[0] ;
         n516TBM32_TEXT_MAXROWS = P007B9_n516TBM32_TEXT_MAXROWS[0] ;
         A517TBM32_TEXT_MAXLENGTH = P007B9_A517TBM32_TEXT_MAXLENGTH[0] ;
         n517TBM32_TEXT_MAXLENGTH = P007B9_n517TBM32_TEXT_MAXLENGTH[0] ;
         A518TBM32_DECIMAL_DIGITS = P007B9_A518TBM32_DECIMAL_DIGITS[0] ;
         n518TBM32_DECIMAL_DIGITS = P007B9_n518TBM32_DECIMAL_DIGITS[0] ;
         A522TBM32_CHK_TRUE_INNER_VALUE = P007B9_A522TBM32_CHK_TRUE_INNER_VALUE[0] ;
         n522TBM32_CHK_TRUE_INNER_VALUE = P007B9_n522TBM32_CHK_TRUE_INNER_VALUE[0] ;
         A523TBM32_CHK_FALSE_INNER_VALUE = P007B9_A523TBM32_CHK_FALSE_INNER_VALUE[0] ;
         n523TBM32_CHK_FALSE_INNER_VALUE = P007B9_n523TBM32_CHK_FALSE_INNER_VALUE[0] ;
         A527TBM32_FIXED_VALUE = P007B9_A527TBM32_FIXED_VALUE[0] ;
         n527TBM32_FIXED_VALUE = P007B9_n527TBM32_FIXED_VALUE[0] ;
         A525TBM32_LIST_CD = P007B9_A525TBM32_LIST_CD[0] ;
         n525TBM32_LIST_CD = P007B9_n525TBM32_LIST_CD[0] ;
         A526TBM32_IMAGE_CD = P007B9_A526TBM32_IMAGE_CD[0] ;
         n526TBM32_IMAGE_CD = P007B9_n526TBM32_IMAGE_CD[0] ;
         A524TBM32_TEXT = P007B9_A524TBM32_TEXT[0] ;
         n524TBM32_TEXT = P007B9_n524TBM32_TEXT[0] ;
         A513TBM32_FONT_SIZE = P007B9_A513TBM32_FONT_SIZE[0] ;
         n513TBM32_FONT_SIZE = P007B9_n513TBM32_FONT_SIZE[0] ;
         A514TBM32_FONT_UL_FLG = P007B9_A514TBM32_FONT_UL_FLG[0] ;
         n514TBM32_FONT_UL_FLG = P007B9_n514TBM32_FONT_UL_FLG[0] ;
         A515TBM32_FONT_COLOR_DIV = P007B9_A515TBM32_FONT_COLOR_DIV[0] ;
         n515TBM32_FONT_COLOR_DIV = P007B9_n515TBM32_FONT_COLOR_DIV[0] ;
         A521TBM32_LINE_SIZE_DIV = P007B9_A521TBM32_LINE_SIZE_DIV[0] ;
         n521TBM32_LINE_SIZE_DIV = P007B9_n521TBM32_LINE_SIZE_DIV[0] ;
         A689TBM32_LINE_COLOR_DIV = P007B9_A689TBM32_LINE_COLOR_DIV[0] ;
         n689TBM32_LINE_COLOR_DIV = P007B9_n689TBM32_LINE_COLOR_DIV[0] ;
         A519TBM32_LINE_START_POINT_DIV = P007B9_A519TBM32_LINE_START_POINT_DIV[0] ;
         n519TBM32_LINE_START_POINT_DIV = P007B9_n519TBM32_LINE_START_POINT_DIV[0] ;
         A520TBM32_LINE_END_POINT_DIV = P007B9_A520TBM32_LINE_END_POINT_DIV[0] ;
         n520TBM32_LINE_END_POINT_DIV = P007B9_n520TBM32_LINE_END_POINT_DIV[0] ;
         A690TBM32_LINE_ANGLE = P007B9_A690TBM32_LINE_ANGLE[0] ;
         n690TBM32_LINE_ANGLE = P007B9_n690TBM32_LINE_ANGLE[0] ;
         A644TBM32_AUTH_LVL_MIN = P007B9_A644TBM32_AUTH_LVL_MIN[0] ;
         n644TBM32_AUTH_LVL_MIN = P007B9_n644TBM32_AUTH_LVL_MIN[0] ;
         A645TBM32_ZORDER = P007B9_A645TBM32_ZORDER[0] ;
         n645TBM32_ZORDER = P007B9_n645TBM32_ZORDER[0] ;
         A691TBM32_TAB_ORDER = P007B9_A691TBM32_TAB_ORDER[0] ;
         n691TBM32_TAB_ORDER = P007B9_n691TBM32_TAB_ORDER[0] ;
         A692TBM32_TABSTOP_FLG = P007B9_A692TBM32_TABSTOP_FLG[0] ;
         n692TBM32_TABSTOP_FLG = P007B9_n692TBM32_TABSTOP_FLG[0] ;
         A693TBM32_REQUIRED_INPUT_FLG = P007B9_A693TBM32_REQUIRED_INPUT_FLG[0] ;
         n693TBM32_REQUIRED_INPUT_FLG = P007B9_n693TBM32_REQUIRED_INPUT_FLG[0] ;
         A694TBM32_MIN_VALUE = P007B9_A694TBM32_MIN_VALUE[0] ;
         n694TBM32_MIN_VALUE = P007B9_n694TBM32_MIN_VALUE[0] ;
         A695TBM32_MAX_VALUE = P007B9_A695TBM32_MAX_VALUE[0] ;
         n695TBM32_MAX_VALUE = P007B9_n695TBM32_MAX_VALUE[0] ;
         A406TBM32_CRF_ITEM_NOTE = P007B9_A406TBM32_CRF_ITEM_NOTE[0] ;
         n406TBM32_CRF_ITEM_NOTE = P007B9_n406TBM32_CRF_ITEM_NOTE[0] ;
         A774TBM32_REF_CRF_ID = P007B9_A774TBM32_REF_CRF_ID[0] ;
         n774TBM32_REF_CRF_ID = P007B9_n774TBM32_REF_CRF_ID[0] ;
         A775TBM32_REF_CRF_ITEM_CD = P007B9_A775TBM32_REF_CRF_ITEM_CD[0] ;
         n775TBM32_REF_CRF_ITEM_CD = P007B9_n775TBM32_REF_CRF_ITEM_CD[0] ;
         A75TBM32_DEL_FLG = P007B9_A75TBM32_DEL_FLG[0] ;
         n75TBM32_DEL_FLG = P007B9_n75TBM32_DEL_FLG[0] ;
         A407TBM32_CRT_DATETIME = P007B9_A407TBM32_CRT_DATETIME[0] ;
         n407TBM32_CRT_DATETIME = P007B9_n407TBM32_CRT_DATETIME[0] ;
         A408TBM32_CRT_USER_ID = P007B9_A408TBM32_CRT_USER_ID[0] ;
         n408TBM32_CRT_USER_ID = P007B9_n408TBM32_CRT_USER_ID[0] ;
         A409TBM32_CRT_PROG_NM = P007B9_A409TBM32_CRT_PROG_NM[0] ;
         n409TBM32_CRT_PROG_NM = P007B9_n409TBM32_CRT_PROG_NM[0] ;
         A410TBM32_UPD_DATETIME = P007B9_A410TBM32_UPD_DATETIME[0] ;
         n410TBM32_UPD_DATETIME = P007B9_n410TBM32_UPD_DATETIME[0] ;
         A411TBM32_UPD_USER_ID = P007B9_A411TBM32_UPD_USER_ID[0] ;
         n411TBM32_UPD_USER_ID = P007B9_n411TBM32_UPD_USER_ID[0] ;
         A412TBM32_UPD_PROG_NM = P007B9_A412TBM32_UPD_PROG_NM[0] ;
         n412TBM32_UPD_PROG_NM = P007B9_n412TBM32_UPD_PROG_NM[0] ;
         A413TBM32_UPD_CNT = P007B9_A413TBM32_UPD_CNT[0] ;
         n413TBM32_UPD_CNT = P007B9_n413TBM32_UPD_CNT[0] ;
         /* Execute user subroutine: S111 */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(7);
            returnInSub = true;
            if (true) return;
         }
         AV26W_DATA_CNT = (long)(AV26W_DATA_CNT+1) ;
         AV20W_A812_SD01_CSV_OUTPUT_ITEM = (SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem)new SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem(remoteHandle, context);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("D", 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A70TBM32_STUDY_ID, 10, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A71TBM32_CRF_ID, 4, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A72TBM32_CRF_ITEM_CD, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A405TBM32_CRF_ITEM_NM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A74TBM32_CRF_ITEM_DIV, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A73TBM32_CRF_ITEM_GRP_CD, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A507TBM32_CRF_ITEM_GRP_ORDER, 3, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A508TBM32_LOCATION_X, 4, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A509TBM32_LOCATION_Y, 4, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A510TBM32_LOCATION_X2, 4, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A511TBM32_LOCATION_Y2, 4, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A512TBM32_TEXT_ALIGN_DIV, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A516TBM32_TEXT_MAXROWS, 2, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A517TBM32_TEXT_MAXLENGTH, 3, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A518TBM32_DECIMAL_DIGITS, 2, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A522TBM32_CHK_TRUE_INNER_VALUE, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A523TBM32_CHK_FALSE_INNER_VALUE, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A527TBM32_FIXED_VALUE, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A525TBM32_LIST_CD, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A526TBM32_IMAGE_CD, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A524TBM32_TEXT, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A513TBM32_FONT_SIZE, 2, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A514TBM32_FONT_UL_FLG, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A515TBM32_FONT_COLOR_DIV, 10, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A521TBM32_LINE_SIZE_DIV, 2, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A689TBM32_LINE_COLOR_DIV, 10, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A519TBM32_LINE_START_POINT_DIV, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A520TBM32_LINE_END_POINT_DIV, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A690TBM32_LINE_ANGLE, 4, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A644TBM32_AUTH_LVL_MIN, 2, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A645TBM32_ZORDER, 3, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A691TBM32_TAB_ORDER, 3, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A692TBM32_TABSTOP_FLG, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A693TBM32_REQUIRED_INPUT_FLG, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A694TBM32_MIN_VALUE, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A695TBM32_MAX_VALUE, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A406TBM32_CRF_ITEM_NOTE, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A774TBM32_REF_CRF_ID, 4, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A775TBM32_REF_CRF_ITEM_CD, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A75TBM32_DEL_FLG, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.format( A407TBM32_CRT_DATETIME, "9999/99/99 99:99:99"), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A408TBM32_CRT_USER_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A409TBM32_CRT_PROG_NM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.format( A410TBM32_UPD_DATETIME, "9999/99/99 99:99:99"), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A411TBM32_UPD_USER_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A412TBM32_UPD_PROG_NM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A413TBM32_UPD_CNT, 10, 0)), 0);
         AV19W_A812_SD01_CSV_OUTPUT.add(AV20W_A812_SD01_CSV_OUTPUT_ITEM, 0);
         pr_default.readNext(7);
      }
      pr_default.close(7);
      /* Execute user subroutine: S121 */
      S121 ();
      if (returnInSub) return;
   }

   public void S211( )
   {
      /* 'SUB_SET_TBM33_CRF_COND' Routine */
      AV26W_DATA_CNT = 0 ;
      pr_default.dynParam(8, new Object[]{ new Object[]{
                                           new Short(A77TBM33_CRF_ID) ,
                                           AV32W_TBM31_CRF_ID ,
                                           new Long(AV8B406_SD01_EXPORT_LIST_I.getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id()) ,
                                           new Long(A76TBM33_STUDY_ID) },
                                           new int[] {
                                           TypeConstants.SHORT, TypeConstants.OBJECT_COLLECTION, TypeConstants.LONG, TypeConstants.LONG
                                           }
      });
      /* Using cursor P007B10 */
      pr_default.execute(8, new Object[] {new Long(AV8B406_SD01_EXPORT_LIST_I.getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id())});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A77TBM33_CRF_ID = P007B10_A77TBM33_CRF_ID[0] ;
         A76TBM33_STUDY_ID = P007B10_A76TBM33_STUDY_ID[0] ;
         A78TBM33_COND_NO = P007B10_A78TBM33_COND_NO[0] ;
         A502TBM33_COND_NM = P007B10_A502TBM33_COND_NM[0] ;
         n502TBM33_COND_NM = P007B10_n502TBM33_COND_NM[0] ;
         A414TBM33_EXPRESSION = P007B10_A414TBM33_EXPRESSION[0] ;
         n414TBM33_EXPRESSION = P007B10_n414TBM33_EXPRESSION[0] ;
         A503TBM33_COND_DIV = P007B10_A503TBM33_COND_DIV[0] ;
         n503TBM33_COND_DIV = P007B10_n503TBM33_COND_DIV[0] ;
         A504TBM33_CRF_ITEM_CD = P007B10_A504TBM33_CRF_ITEM_CD[0] ;
         n504TBM33_CRF_ITEM_CD = P007B10_n504TBM33_CRF_ITEM_CD[0] ;
         A415TBM33_PRIOR_NO = P007B10_A415TBM33_PRIOR_NO[0] ;
         n415TBM33_PRIOR_NO = P007B10_n415TBM33_PRIOR_NO[0] ;
         A505TBM33_ERR_DIV = P007B10_A505TBM33_ERR_DIV[0] ;
         n505TBM33_ERR_DIV = P007B10_n505TBM33_ERR_DIV[0] ;
         A506TBM33_ERR_MSG = P007B10_A506TBM33_ERR_MSG[0] ;
         n506TBM33_ERR_MSG = P007B10_n506TBM33_ERR_MSG[0] ;
         A646TBM33_ENABLED_FLG = P007B10_A646TBM33_ENABLED_FLG[0] ;
         n646TBM33_ENABLED_FLG = P007B10_n646TBM33_ENABLED_FLG[0] ;
         A696TBM33_REQUIRED_INPUT_FLG = P007B10_A696TBM33_REQUIRED_INPUT_FLG[0] ;
         n696TBM33_REQUIRED_INPUT_FLG = P007B10_n696TBM33_REQUIRED_INPUT_FLG[0] ;
         A697TBM33_NUMERIC_RANGE_FLG = P007B10_A697TBM33_NUMERIC_RANGE_FLG[0] ;
         n697TBM33_NUMERIC_RANGE_FLG = P007B10_n697TBM33_NUMERIC_RANGE_FLG[0] ;
         A416TBM33_DEL_FLG = P007B10_A416TBM33_DEL_FLG[0] ;
         n416TBM33_DEL_FLG = P007B10_n416TBM33_DEL_FLG[0] ;
         A417TBM33_CRT_DATETIME = P007B10_A417TBM33_CRT_DATETIME[0] ;
         n417TBM33_CRT_DATETIME = P007B10_n417TBM33_CRT_DATETIME[0] ;
         A418TBM33_CRT_USER_ID = P007B10_A418TBM33_CRT_USER_ID[0] ;
         n418TBM33_CRT_USER_ID = P007B10_n418TBM33_CRT_USER_ID[0] ;
         A419TBM33_CRT_PROG_NM = P007B10_A419TBM33_CRT_PROG_NM[0] ;
         n419TBM33_CRT_PROG_NM = P007B10_n419TBM33_CRT_PROG_NM[0] ;
         A420TBM33_UPD_DATETIME = P007B10_A420TBM33_UPD_DATETIME[0] ;
         n420TBM33_UPD_DATETIME = P007B10_n420TBM33_UPD_DATETIME[0] ;
         A421TBM33_UPD_USER_ID = P007B10_A421TBM33_UPD_USER_ID[0] ;
         n421TBM33_UPD_USER_ID = P007B10_n421TBM33_UPD_USER_ID[0] ;
         A422TBM33_UPD_PROG_NM = P007B10_A422TBM33_UPD_PROG_NM[0] ;
         n422TBM33_UPD_PROG_NM = P007B10_n422TBM33_UPD_PROG_NM[0] ;
         A423TBM33_UPD_CNT = P007B10_A423TBM33_UPD_CNT[0] ;
         n423TBM33_UPD_CNT = P007B10_n423TBM33_UPD_CNT[0] ;
         /* Execute user subroutine: S111 */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(8);
            returnInSub = true;
            if (true) return;
         }
         AV26W_DATA_CNT = (long)(AV26W_DATA_CNT+1) ;
         AV20W_A812_SD01_CSV_OUTPUT_ITEM = (SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem)new SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem(remoteHandle, context);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("D", 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A76TBM33_STUDY_ID, 10, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A77TBM33_CRF_ID, 4, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A78TBM33_COND_NO, 4, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A502TBM33_COND_NM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A414TBM33_EXPRESSION, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A503TBM33_COND_DIV, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A504TBM33_CRF_ITEM_CD, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A415TBM33_PRIOR_NO, 3, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A505TBM33_ERR_DIV, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A506TBM33_ERR_MSG, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A646TBM33_ENABLED_FLG, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A696TBM33_REQUIRED_INPUT_FLG, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A697TBM33_NUMERIC_RANGE_FLG, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A416TBM33_DEL_FLG, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.format( A417TBM33_CRT_DATETIME, "9999/99/99 99:99:99"), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A418TBM33_CRT_USER_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A419TBM33_CRT_PROG_NM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.format( A420TBM33_UPD_DATETIME, "9999/99/99 99:99:99"), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A421TBM33_UPD_USER_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A422TBM33_UPD_PROG_NM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A423TBM33_UPD_CNT, 10, 0)), 0);
         AV19W_A812_SD01_CSV_OUTPUT.add(AV20W_A812_SD01_CSV_OUTPUT_ITEM, 0);
         pr_default.readNext(8);
      }
      pr_default.close(8);
      /* Execute user subroutine: S121 */
      S121 ();
      if (returnInSub) return;
   }

   public void S221( )
   {
      /* 'SUB_SET_TBM34_CRF_AUTH' Routine */
      AV26W_DATA_CNT = 0 ;
      pr_default.dynParam(9, new Object[]{ new Object[]{
                                           new Short(A29TBM34_CRF_ID) ,
                                           AV32W_TBM31_CRF_ID ,
                                           new Long(AV8B406_SD01_EXPORT_LIST_I.getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id()) ,
                                           new Long(A28TBM34_STUDY_ID) },
                                           new int[] {
                                           TypeConstants.SHORT, TypeConstants.OBJECT_COLLECTION, TypeConstants.LONG, TypeConstants.LONG
                                           }
      });
      /* Using cursor P007B11 */
      pr_default.execute(9, new Object[] {new Long(AV8B406_SD01_EXPORT_LIST_I.getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id())});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A29TBM34_CRF_ID = P007B11_A29TBM34_CRF_ID[0] ;
         A28TBM34_STUDY_ID = P007B11_A28TBM34_STUDY_ID[0] ;
         A30TBM34_STYDY_AUTH_CD = P007B11_A30TBM34_STYDY_AUTH_CD[0] ;
         A571TBM34_DISPLAY_FLG = P007B11_A571TBM34_DISPLAY_FLG[0] ;
         n571TBM34_DISPLAY_FLG = P007B11_n571TBM34_DISPLAY_FLG[0] ;
         A572TBM34_DEL_FLG = P007B11_A572TBM34_DEL_FLG[0] ;
         n572TBM34_DEL_FLG = P007B11_n572TBM34_DEL_FLG[0] ;
         A573TBM34_CRT_DATETIME = P007B11_A573TBM34_CRT_DATETIME[0] ;
         n573TBM34_CRT_DATETIME = P007B11_n573TBM34_CRT_DATETIME[0] ;
         A574TBM34_CRT_USER_ID = P007B11_A574TBM34_CRT_USER_ID[0] ;
         n574TBM34_CRT_USER_ID = P007B11_n574TBM34_CRT_USER_ID[0] ;
         A575TBM34_CRT_PROG_NM = P007B11_A575TBM34_CRT_PROG_NM[0] ;
         n575TBM34_CRT_PROG_NM = P007B11_n575TBM34_CRT_PROG_NM[0] ;
         A576TBM34_UPD_DATETIME = P007B11_A576TBM34_UPD_DATETIME[0] ;
         n576TBM34_UPD_DATETIME = P007B11_n576TBM34_UPD_DATETIME[0] ;
         A577TBM34_UPD_USER_ID = P007B11_A577TBM34_UPD_USER_ID[0] ;
         n577TBM34_UPD_USER_ID = P007B11_n577TBM34_UPD_USER_ID[0] ;
         A578TBM34_UPD_PROG_NM = P007B11_A578TBM34_UPD_PROG_NM[0] ;
         n578TBM34_UPD_PROG_NM = P007B11_n578TBM34_UPD_PROG_NM[0] ;
         A579TBM34_UPD_CNT = P007B11_A579TBM34_UPD_CNT[0] ;
         n579TBM34_UPD_CNT = P007B11_n579TBM34_UPD_CNT[0] ;
         /* Execute user subroutine: S111 */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(9);
            returnInSub = true;
            if (true) return;
         }
         AV26W_DATA_CNT = (long)(AV26W_DATA_CNT+1) ;
         AV20W_A812_SD01_CSV_OUTPUT_ITEM = (SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem)new SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem(remoteHandle, context);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("D", 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A28TBM34_STUDY_ID, 10, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A29TBM34_CRF_ID, 4, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A30TBM34_STYDY_AUTH_CD, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A571TBM34_DISPLAY_FLG, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A572TBM34_DEL_FLG, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.format( A573TBM34_CRT_DATETIME, "9999/99/99 99:99:99"), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A574TBM34_CRT_USER_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A575TBM34_CRT_PROG_NM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.format( A576TBM34_UPD_DATETIME, "9999/99/99 99:99:99"), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A577TBM34_UPD_USER_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A578TBM34_UPD_PROG_NM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A579TBM34_UPD_CNT, 10, 0)), 0);
         AV19W_A812_SD01_CSV_OUTPUT.add(AV20W_A812_SD01_CSV_OUTPUT_ITEM, 0);
         pr_default.readNext(9);
      }
      pr_default.close(9);
      /* Execute user subroutine: S121 */
      S121 ();
      if (returnInSub) return;
   }

   public void S231( )
   {
      /* 'SUB_SET_TBM35_CRF_ITEM_AUTH' Routine */
      AV26W_DATA_CNT = 0 ;
      pr_default.dynParam(10, new Object[]{ new Object[]{
                                           new Short(A32TBM35_CRF_ID) ,
                                           AV32W_TBM31_CRF_ID ,
                                           new Long(AV8B406_SD01_EXPORT_LIST_I.getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id()) ,
                                           new Long(A31TBM35_STUDY_ID) },
                                           new int[] {
                                           TypeConstants.SHORT, TypeConstants.OBJECT_COLLECTION, TypeConstants.LONG, TypeConstants.LONG
                                           }
      });
      /* Using cursor P007B12 */
      pr_default.execute(10, new Object[] {new Long(AV8B406_SD01_EXPORT_LIST_I.getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id())});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A32TBM35_CRF_ID = P007B12_A32TBM35_CRF_ID[0] ;
         A31TBM35_STUDY_ID = P007B12_A31TBM35_STUDY_ID[0] ;
         A33TBM35_CRF_ITEM_CD = P007B12_A33TBM35_CRF_ITEM_CD[0] ;
         A34TBM35_STUDY_AUTH_CD = P007B12_A34TBM35_STUDY_AUTH_CD[0] ;
         A580TBM35_DISPLAY_FLG = P007B12_A580TBM35_DISPLAY_FLG[0] ;
         n580TBM35_DISPLAY_FLG = P007B12_n580TBM35_DISPLAY_FLG[0] ;
         A581TBM35_DEL_FLG = P007B12_A581TBM35_DEL_FLG[0] ;
         n581TBM35_DEL_FLG = P007B12_n581TBM35_DEL_FLG[0] ;
         A582TBM35_CRT_DATETIME = P007B12_A582TBM35_CRT_DATETIME[0] ;
         n582TBM35_CRT_DATETIME = P007B12_n582TBM35_CRT_DATETIME[0] ;
         A583TBM35_CRT_USER_ID = P007B12_A583TBM35_CRT_USER_ID[0] ;
         n583TBM35_CRT_USER_ID = P007B12_n583TBM35_CRT_USER_ID[0] ;
         A584TBM35_CRT_PROG_NM = P007B12_A584TBM35_CRT_PROG_NM[0] ;
         n584TBM35_CRT_PROG_NM = P007B12_n584TBM35_CRT_PROG_NM[0] ;
         A585TBM35_UPD_DATETIME = P007B12_A585TBM35_UPD_DATETIME[0] ;
         n585TBM35_UPD_DATETIME = P007B12_n585TBM35_UPD_DATETIME[0] ;
         A586TBM35_UPD_USER_ID = P007B12_A586TBM35_UPD_USER_ID[0] ;
         n586TBM35_UPD_USER_ID = P007B12_n586TBM35_UPD_USER_ID[0] ;
         A587TBM35_UPD_PROG_NM = P007B12_A587TBM35_UPD_PROG_NM[0] ;
         n587TBM35_UPD_PROG_NM = P007B12_n587TBM35_UPD_PROG_NM[0] ;
         A588TBM35_UPD_CNT = P007B12_A588TBM35_UPD_CNT[0] ;
         n588TBM35_UPD_CNT = P007B12_n588TBM35_UPD_CNT[0] ;
         /* Execute user subroutine: S111 */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(10);
            returnInSub = true;
            if (true) return;
         }
         AV26W_DATA_CNT = (long)(AV26W_DATA_CNT+1) ;
         AV20W_A812_SD01_CSV_OUTPUT_ITEM = (SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem)new SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem(remoteHandle, context);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("D", 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A31TBM35_STUDY_ID, 10, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A32TBM35_CRF_ID, 4, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A33TBM35_CRF_ITEM_CD, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A34TBM35_STUDY_AUTH_CD, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A580TBM35_DISPLAY_FLG, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A581TBM35_DEL_FLG, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.format( A582TBM35_CRT_DATETIME, "9999/99/99 99:99:99"), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A583TBM35_CRT_USER_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A584TBM35_CRT_PROG_NM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.format( A585TBM35_UPD_DATETIME, "9999/99/99 99:99:99"), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A586TBM35_UPD_USER_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A587TBM35_UPD_PROG_NM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A588TBM35_UPD_CNT, 10, 0)), 0);
         AV19W_A812_SD01_CSV_OUTPUT.add(AV20W_A812_SD01_CSV_OUTPUT_ITEM, 0);
         pr_default.readNext(10);
      }
      pr_default.close(10);
      /* Execute user subroutine: S121 */
      S121 ();
      if (returnInSub) return;
   }

   public void S241( )
   {
      /* 'SUB_SET_TBM36_CRF_SELECT' Routine */
      AV26W_DATA_CNT = 0 ;
      pr_default.dynParam(11, new Object[]{ new Object[]{
                                           new Short(A36TBM36_CRF_ID) ,
                                           AV32W_TBM31_CRF_ID ,
                                           new Long(AV8B406_SD01_EXPORT_LIST_I.getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id()) ,
                                           new Long(A35TBM36_STUDY_ID) },
                                           new int[] {
                                           TypeConstants.SHORT, TypeConstants.OBJECT_COLLECTION, TypeConstants.LONG, TypeConstants.LONG
                                           }
      });
      /* Using cursor P007B13 */
      pr_default.execute(11, new Object[] {new Long(AV8B406_SD01_EXPORT_LIST_I.getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id())});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A36TBM36_CRF_ID = P007B13_A36TBM36_CRF_ID[0] ;
         A35TBM36_STUDY_ID = P007B13_A35TBM36_STUDY_ID[0] ;
         A37TBM36_COND_NO = P007B13_A37TBM36_COND_NO[0] ;
         A38TBM36_SELECT_CRF_ID = P007B13_A38TBM36_SELECT_CRF_ID[0] ;
         A589TBM36_DEL_FLG = P007B13_A589TBM36_DEL_FLG[0] ;
         n589TBM36_DEL_FLG = P007B13_n589TBM36_DEL_FLG[0] ;
         A590TBM36_CRT_DATETIME = P007B13_A590TBM36_CRT_DATETIME[0] ;
         n590TBM36_CRT_DATETIME = P007B13_n590TBM36_CRT_DATETIME[0] ;
         A591TBM36_CRT_USER_ID = P007B13_A591TBM36_CRT_USER_ID[0] ;
         n591TBM36_CRT_USER_ID = P007B13_n591TBM36_CRT_USER_ID[0] ;
         A592TBM36_CRT_PROG_NM = P007B13_A592TBM36_CRT_PROG_NM[0] ;
         n592TBM36_CRT_PROG_NM = P007B13_n592TBM36_CRT_PROG_NM[0] ;
         A593TBM36_UPD_DATETIME = P007B13_A593TBM36_UPD_DATETIME[0] ;
         n593TBM36_UPD_DATETIME = P007B13_n593TBM36_UPD_DATETIME[0] ;
         A594TBM36_UPD_USER_ID = P007B13_A594TBM36_UPD_USER_ID[0] ;
         n594TBM36_UPD_USER_ID = P007B13_n594TBM36_UPD_USER_ID[0] ;
         A595TBM36_UPD_PROG_NM = P007B13_A595TBM36_UPD_PROG_NM[0] ;
         n595TBM36_UPD_PROG_NM = P007B13_n595TBM36_UPD_PROG_NM[0] ;
         A596TBM36_UPD_CNT = P007B13_A596TBM36_UPD_CNT[0] ;
         n596TBM36_UPD_CNT = P007B13_n596TBM36_UPD_CNT[0] ;
         /* Execute user subroutine: S111 */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(11);
            returnInSub = true;
            if (true) return;
         }
         AV26W_DATA_CNT = (long)(AV26W_DATA_CNT+1) ;
         AV20W_A812_SD01_CSV_OUTPUT_ITEM = (SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem)new SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem(remoteHandle, context);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("D", 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A35TBM36_STUDY_ID, 10, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A36TBM36_CRF_ID, 4, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A37TBM36_COND_NO, 4, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A38TBM36_SELECT_CRF_ID, 4, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A589TBM36_DEL_FLG, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.format( A590TBM36_CRT_DATETIME, "9999/99/99 99:99:99"), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A591TBM36_CRT_USER_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A592TBM36_CRT_PROG_NM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.format( A593TBM36_UPD_DATETIME, "9999/99/99 99:99:99"), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A594TBM36_UPD_USER_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A595TBM36_UPD_PROG_NM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A596TBM36_UPD_CNT, 10, 0)), 0);
         AV19W_A812_SD01_CSV_OUTPUT.add(AV20W_A812_SD01_CSV_OUTPUT_ITEM, 0);
         pr_default.readNext(11);
      }
      pr_default.close(11);
      /* Execute user subroutine: S121 */
      S121 ();
      if (returnInSub) return;
   }

   public void S251( )
   {
      /* 'SUB_SET_TBM37_CRF_DOM_MAP' Routine */
      AV26W_DATA_CNT = 0 ;
      pr_default.dynParam(12, new Object[]{ new Object[]{
                                           new Short(A80TBM37_CRF_ID) ,
                                           AV32W_TBM31_CRF_ID ,
                                           new Long(AV8B406_SD01_EXPORT_LIST_I.getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id()) ,
                                           new Long(A79TBM37_STUDY_ID) },
                                           new int[] {
                                           TypeConstants.SHORT, TypeConstants.OBJECT_COLLECTION, TypeConstants.LONG, TypeConstants.LONG
                                           }
      });
      /* Using cursor P007B14 */
      pr_default.execute(12, new Object[] {new Long(AV8B406_SD01_EXPORT_LIST_I.getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id())});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A80TBM37_CRF_ID = P007B14_A80TBM37_CRF_ID[0] ;
         A79TBM37_STUDY_ID = P007B14_A79TBM37_STUDY_ID[0] ;
         A81TBM37_CRF_ITEM_GRP_DIV = P007B14_A81TBM37_CRF_ITEM_GRP_DIV[0] ;
         A82TBM37_CRF_ITEM_GRP_CD = P007B14_A82TBM37_CRF_ITEM_GRP_CD[0] ;
         A83TBM37_VISIT_NO = P007B14_A83TBM37_VISIT_NO[0] ;
         n83TBM37_VISIT_NO = P007B14_n83TBM37_VISIT_NO[0] ;
         A84TBM37_DOM_CD = P007B14_A84TBM37_DOM_CD[0] ;
         n84TBM37_DOM_CD = P007B14_n84TBM37_DOM_CD[0] ;
         A500TBM37_DOM_VAR_NM = P007B14_A500TBM37_DOM_VAR_NM[0] ;
         n500TBM37_DOM_VAR_NM = P007B14_n500TBM37_DOM_VAR_NM[0] ;
         A85TBM37_DOM_ITM_GRP_OID = P007B14_A85TBM37_DOM_ITM_GRP_OID[0] ;
         n85TBM37_DOM_ITM_GRP_OID = P007B14_n85TBM37_DOM_ITM_GRP_OID[0] ;
         A501TBM37_DOM_ITM_GRP_ATTR_SEQ = P007B14_A501TBM37_DOM_ITM_GRP_ATTR_SEQ[0] ;
         n501TBM37_DOM_ITM_GRP_ATTR_SEQ = P007B14_n501TBM37_DOM_ITM_GRP_ATTR_SEQ[0] ;
         A86TBM37_DOM_ITM_GRP_ROWNO = P007B14_A86TBM37_DOM_ITM_GRP_ROWNO[0] ;
         n86TBM37_DOM_ITM_GRP_ROWNO = P007B14_n86TBM37_DOM_ITM_GRP_ROWNO[0] ;
         A433TBM37_DEL_FLG = P007B14_A433TBM37_DEL_FLG[0] ;
         n433TBM37_DEL_FLG = P007B14_n433TBM37_DEL_FLG[0] ;
         A434TBM37_CRT_DATETIME = P007B14_A434TBM37_CRT_DATETIME[0] ;
         n434TBM37_CRT_DATETIME = P007B14_n434TBM37_CRT_DATETIME[0] ;
         A435TBM37_CRT_USER_ID = P007B14_A435TBM37_CRT_USER_ID[0] ;
         n435TBM37_CRT_USER_ID = P007B14_n435TBM37_CRT_USER_ID[0] ;
         A436TBM37_CRT_PROG_NM = P007B14_A436TBM37_CRT_PROG_NM[0] ;
         n436TBM37_CRT_PROG_NM = P007B14_n436TBM37_CRT_PROG_NM[0] ;
         A437TBM37_UPD_DATETIME = P007B14_A437TBM37_UPD_DATETIME[0] ;
         n437TBM37_UPD_DATETIME = P007B14_n437TBM37_UPD_DATETIME[0] ;
         A438TBM37_UPD_USER_ID = P007B14_A438TBM37_UPD_USER_ID[0] ;
         n438TBM37_UPD_USER_ID = P007B14_n438TBM37_UPD_USER_ID[0] ;
         A439TBM37_UPD_PROG_NM = P007B14_A439TBM37_UPD_PROG_NM[0] ;
         n439TBM37_UPD_PROG_NM = P007B14_n439TBM37_UPD_PROG_NM[0] ;
         A440TBM37_UPD_CNT = P007B14_A440TBM37_UPD_CNT[0] ;
         n440TBM37_UPD_CNT = P007B14_n440TBM37_UPD_CNT[0] ;
         /* Execute user subroutine: S111 */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(12);
            returnInSub = true;
            if (true) return;
         }
         AV26W_DATA_CNT = (long)(AV26W_DATA_CNT+1) ;
         AV20W_A812_SD01_CSV_OUTPUT_ITEM = (SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem)new SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem(remoteHandle, context);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("D", 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A79TBM37_STUDY_ID, 10, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A80TBM37_CRF_ID, 4, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A81TBM37_CRF_ITEM_GRP_DIV, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A82TBM37_CRF_ITEM_GRP_CD, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A83TBM37_VISIT_NO, 6, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A84TBM37_DOM_CD, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A500TBM37_DOM_VAR_NM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A85TBM37_DOM_ITM_GRP_OID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A501TBM37_DOM_ITM_GRP_ATTR_SEQ, 4, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A86TBM37_DOM_ITM_GRP_ROWNO, 4, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A433TBM37_DEL_FLG, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.format( A434TBM37_CRT_DATETIME, "9999/99/99 99:99:99"), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A435TBM37_CRT_USER_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A436TBM37_CRT_PROG_NM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.format( A437TBM37_UPD_DATETIME, "9999/99/99 99:99:99"), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A438TBM37_UPD_USER_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A439TBM37_UPD_PROG_NM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A440TBM37_UPD_CNT, 10, 0)), 0);
         AV19W_A812_SD01_CSV_OUTPUT.add(AV20W_A812_SD01_CSV_OUTPUT_ITEM, 0);
         pr_default.readNext(12);
      }
      pr_default.close(12);
      /* Execute user subroutine: S121 */
      S121 ();
      if (returnInSub) return;
   }

   public void S261( )
   {
      /* 'SUB_SET_TBM41_CRF_NCM_MAP' Routine */
      AV26W_DATA_CNT = 0 ;
      pr_default.dynParam(13, new Object[]{ new Object[]{
                                           new Short(A20TBM41_CRF_ID) ,
                                           AV32W_TBM31_CRF_ID ,
                                           new Long(AV8B406_SD01_EXPORT_LIST_I.getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id()) ,
                                           new Long(A19TBM41_STUDY_ID) },
                                           new int[] {
                                           TypeConstants.SHORT, TypeConstants.OBJECT_COLLECTION, TypeConstants.LONG, TypeConstants.LONG
                                           }
      });
      /* Using cursor P007B15 */
      pr_default.execute(13, new Object[] {new Long(AV8B406_SD01_EXPORT_LIST_I.getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id())});
      while ( (pr_default.getStatus(13) != 101) )
      {
         A20TBM41_CRF_ID = P007B15_A20TBM41_CRF_ID[0] ;
         A19TBM41_STUDY_ID = P007B15_A19TBM41_STUDY_ID[0] ;
         A21TBM41_CRF_ITEM_GRP_DIV = P007B15_A21TBM41_CRF_ITEM_GRP_DIV[0] ;
         A22TBM41_CRF_ITEM_GRP_CD = P007B15_A22TBM41_CRF_ITEM_GRP_CD[0] ;
         A424TBM41_NCM_METADATA_ID = P007B15_A424TBM41_NCM_METADATA_ID[0] ;
         n424TBM41_NCM_METADATA_ID = P007B15_n424TBM41_NCM_METADATA_ID[0] ;
         A425TBM41_DEL_FLG = P007B15_A425TBM41_DEL_FLG[0] ;
         n425TBM41_DEL_FLG = P007B15_n425TBM41_DEL_FLG[0] ;
         A426TBM41_CRT_DATETIME = P007B15_A426TBM41_CRT_DATETIME[0] ;
         n426TBM41_CRT_DATETIME = P007B15_n426TBM41_CRT_DATETIME[0] ;
         A427TBM41_CRT_USER_ID = P007B15_A427TBM41_CRT_USER_ID[0] ;
         n427TBM41_CRT_USER_ID = P007B15_n427TBM41_CRT_USER_ID[0] ;
         A428TBM41_CRT_PROG_NM = P007B15_A428TBM41_CRT_PROG_NM[0] ;
         n428TBM41_CRT_PROG_NM = P007B15_n428TBM41_CRT_PROG_NM[0] ;
         A429TBM41_UPD_DATETIME = P007B15_A429TBM41_UPD_DATETIME[0] ;
         n429TBM41_UPD_DATETIME = P007B15_n429TBM41_UPD_DATETIME[0] ;
         A430TBM41_UPD_USER_ID = P007B15_A430TBM41_UPD_USER_ID[0] ;
         n430TBM41_UPD_USER_ID = P007B15_n430TBM41_UPD_USER_ID[0] ;
         A431TBM41_UPD_PROG_NM = P007B15_A431TBM41_UPD_PROG_NM[0] ;
         n431TBM41_UPD_PROG_NM = P007B15_n431TBM41_UPD_PROG_NM[0] ;
         A432TBM41_UPD_CNT = P007B15_A432TBM41_UPD_CNT[0] ;
         n432TBM41_UPD_CNT = P007B15_n432TBM41_UPD_CNT[0] ;
         /* Execute user subroutine: S111 */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(13);
            returnInSub = true;
            if (true) return;
         }
         AV26W_DATA_CNT = (long)(AV26W_DATA_CNT+1) ;
         AV20W_A812_SD01_CSV_OUTPUT_ITEM = (SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem)new SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem(remoteHandle, context);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("D", 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A19TBM41_STUDY_ID, 10, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A20TBM41_CRF_ID, 4, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A21TBM41_CRF_ITEM_GRP_DIV, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A22TBM41_CRF_ITEM_GRP_CD, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A424TBM41_NCM_METADATA_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A425TBM41_DEL_FLG, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.format( A426TBM41_CRT_DATETIME, "9999/99/99 99:99:99"), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A427TBM41_CRT_USER_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A428TBM41_CRT_PROG_NM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.format( A429TBM41_UPD_DATETIME, "9999/99/99 99:99:99"), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A430TBM41_UPD_USER_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A431TBM41_UPD_PROG_NM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A432TBM41_UPD_CNT, 10, 0)), 0);
         AV19W_A812_SD01_CSV_OUTPUT.add(AV20W_A812_SD01_CSV_OUTPUT_ITEM, 0);
         pr_default.readNext(13);
      }
      pr_default.close(13);
      /* Execute user subroutine: S121 */
      S121 ();
      if (returnInSub) return;
   }

   public void S271( )
   {
      /* 'SUB_SET_TBM42_STUDY_CDISC_DOMAIN' Routine */
      AV26W_DATA_CNT = 0 ;
      /* Using cursor P007B16 */
      pr_default.execute(14, new Object[] {new Long(AV8B406_SD01_EXPORT_LIST_I.getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id())});
      while ( (pr_default.getStatus(14) != 101) )
      {
         A203TBM42_STUDY_ID = P007B16_A203TBM42_STUDY_ID[0] ;
         A204TBM42_DOM_CD = P007B16_A204TBM42_DOM_CD[0] ;
         A905TBM42_DOM_ENM = P007B16_A905TBM42_DOM_ENM[0] ;
         n905TBM42_DOM_ENM = P007B16_n905TBM42_DOM_ENM[0] ;
         A906TBM42_DOM_JNM = P007B16_A906TBM42_DOM_JNM[0] ;
         n906TBM42_DOM_JNM = P007B16_n906TBM42_DOM_JNM[0] ;
         A907TBM42_DOM_GRP_NM = P007B16_A907TBM42_DOM_GRP_NM[0] ;
         n907TBM42_DOM_GRP_NM = P007B16_n907TBM42_DOM_GRP_NM[0] ;
         A908TBM42_NOTE = P007B16_A908TBM42_NOTE[0] ;
         n908TBM42_NOTE = P007B16_n908TBM42_NOTE[0] ;
         A909TBM42_ORDER = P007B16_A909TBM42_ORDER[0] ;
         n909TBM42_ORDER = P007B16_n909TBM42_ORDER[0] ;
         A893TBM42_DEL_FLG = P007B16_A893TBM42_DEL_FLG[0] ;
         n893TBM42_DEL_FLG = P007B16_n893TBM42_DEL_FLG[0] ;
         A894TBM42_CRT_DATETIME = P007B16_A894TBM42_CRT_DATETIME[0] ;
         n894TBM42_CRT_DATETIME = P007B16_n894TBM42_CRT_DATETIME[0] ;
         A895TBM42_CRT_USER_ID = P007B16_A895TBM42_CRT_USER_ID[0] ;
         n895TBM42_CRT_USER_ID = P007B16_n895TBM42_CRT_USER_ID[0] ;
         A896TBM42_CRT_PROG_NM = P007B16_A896TBM42_CRT_PROG_NM[0] ;
         n896TBM42_CRT_PROG_NM = P007B16_n896TBM42_CRT_PROG_NM[0] ;
         A897TBM42_UPD_DATETIME = P007B16_A897TBM42_UPD_DATETIME[0] ;
         n897TBM42_UPD_DATETIME = P007B16_n897TBM42_UPD_DATETIME[0] ;
         A898TBM42_UPD_USER_ID = P007B16_A898TBM42_UPD_USER_ID[0] ;
         n898TBM42_UPD_USER_ID = P007B16_n898TBM42_UPD_USER_ID[0] ;
         A899TBM42_UPD_PROG_NM = P007B16_A899TBM42_UPD_PROG_NM[0] ;
         n899TBM42_UPD_PROG_NM = P007B16_n899TBM42_UPD_PROG_NM[0] ;
         A900TBM42_UPD_CNT = P007B16_A900TBM42_UPD_CNT[0] ;
         n900TBM42_UPD_CNT = P007B16_n900TBM42_UPD_CNT[0] ;
         /* Execute user subroutine: S111 */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(14);
            returnInSub = true;
            if (true) return;
         }
         AV26W_DATA_CNT = (long)(AV26W_DATA_CNT+1) ;
         AV20W_A812_SD01_CSV_OUTPUT_ITEM = (SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem)new SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem(remoteHandle, context);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("D", 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A203TBM42_STUDY_ID, 10, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A204TBM42_DOM_CD, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A905TBM42_DOM_ENM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A906TBM42_DOM_JNM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A907TBM42_DOM_GRP_NM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A908TBM42_NOTE, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A909TBM42_ORDER, 5, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A893TBM42_DEL_FLG, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.format( A894TBM42_CRT_DATETIME, "9999/99/99 99:99:99"), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A895TBM42_CRT_USER_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A896TBM42_CRT_PROG_NM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.format( A897TBM42_UPD_DATETIME, "9999/99/99 99:99:99"), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A898TBM42_UPD_USER_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A899TBM42_UPD_PROG_NM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A900TBM42_UPD_CNT, 10, 0)), 0);
         AV19W_A812_SD01_CSV_OUTPUT.add(AV20W_A812_SD01_CSV_OUTPUT_ITEM, 0);
         pr_default.readNext(14);
      }
      pr_default.close(14);
      /* Execute user subroutine: S121 */
      S121 ();
      if (returnInSub) return;
   }

   public void S281( )
   {
      /* 'SUB_SET_TBM43_STUDY_CDISC_ITEM' Routine */
      AV26W_DATA_CNT = 0 ;
      /* Using cursor P007B17 */
      pr_default.execute(15, new Object[] {new Long(AV8B406_SD01_EXPORT_LIST_I.getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id())});
      while ( (pr_default.getStatus(15) != 101) )
      {
         A200TBM43_STUDY_ID = P007B17_A200TBM43_STUDY_ID[0] ;
         A201TBM43_DOM_CD = P007B17_A201TBM43_DOM_CD[0] ;
         A202TBM43_DOM_VAR_NM = P007B17_A202TBM43_DOM_VAR_NM[0] ;
         A910TBM43_VAR_DESC = P007B17_A910TBM43_VAR_DESC[0] ;
         n910TBM43_VAR_DESC = P007B17_n910TBM43_VAR_DESC[0] ;
         A911TBM43_SDTM_FLG = P007B17_A911TBM43_SDTM_FLG[0] ;
         n911TBM43_SDTM_FLG = P007B17_n911TBM43_SDTM_FLG[0] ;
         A912TBM43_CDASH_FLG = P007B17_A912TBM43_CDASH_FLG[0] ;
         n912TBM43_CDASH_FLG = P007B17_n912TBM43_CDASH_FLG[0] ;
         A913TBM43_INPUT_TYPE_DIV = P007B17_A913TBM43_INPUT_TYPE_DIV[0] ;
         n913TBM43_INPUT_TYPE_DIV = P007B17_n913TBM43_INPUT_TYPE_DIV[0] ;
         A914TBM43_REQUIRED_FLG = P007B17_A914TBM43_REQUIRED_FLG[0] ;
         n914TBM43_REQUIRED_FLG = P007B17_n914TBM43_REQUIRED_FLG[0] ;
         A915TBM43_SAS_FIELD_NM = P007B17_A915TBM43_SAS_FIELD_NM[0] ;
         n915TBM43_SAS_FIELD_NM = P007B17_n915TBM43_SAS_FIELD_NM[0] ;
         A916TBM43_ODM_DATA_TYPE = P007B17_A916TBM43_ODM_DATA_TYPE[0] ;
         n916TBM43_ODM_DATA_TYPE = P007B17_n916TBM43_ODM_DATA_TYPE[0] ;
         A917TBM43_NOTE = P007B17_A917TBM43_NOTE[0] ;
         n917TBM43_NOTE = P007B17_n917TBM43_NOTE[0] ;
         A918TBM43_ORDER = P007B17_A918TBM43_ORDER[0] ;
         n918TBM43_ORDER = P007B17_n918TBM43_ORDER[0] ;
         A933TBM43_VERSION = P007B17_A933TBM43_VERSION[0] ;
         n933TBM43_VERSION = P007B17_n933TBM43_VERSION[0] ;
         A919TBM43_DEL_FLG = P007B17_A919TBM43_DEL_FLG[0] ;
         n919TBM43_DEL_FLG = P007B17_n919TBM43_DEL_FLG[0] ;
         A920TBM43_CRT_DATETIME = P007B17_A920TBM43_CRT_DATETIME[0] ;
         n920TBM43_CRT_DATETIME = P007B17_n920TBM43_CRT_DATETIME[0] ;
         A921TBM43_CRT_USER_ID = P007B17_A921TBM43_CRT_USER_ID[0] ;
         n921TBM43_CRT_USER_ID = P007B17_n921TBM43_CRT_USER_ID[0] ;
         A922TBM43_CRT_PROG_NM = P007B17_A922TBM43_CRT_PROG_NM[0] ;
         n922TBM43_CRT_PROG_NM = P007B17_n922TBM43_CRT_PROG_NM[0] ;
         A923TBM43_UPD_DATETIME = P007B17_A923TBM43_UPD_DATETIME[0] ;
         n923TBM43_UPD_DATETIME = P007B17_n923TBM43_UPD_DATETIME[0] ;
         A924TBM43_UPD_USER_ID = P007B17_A924TBM43_UPD_USER_ID[0] ;
         n924TBM43_UPD_USER_ID = P007B17_n924TBM43_UPD_USER_ID[0] ;
         A925TBM43_UPD_PROG_NM = P007B17_A925TBM43_UPD_PROG_NM[0] ;
         n925TBM43_UPD_PROG_NM = P007B17_n925TBM43_UPD_PROG_NM[0] ;
         A926TBM43_UPD_CNT = P007B17_A926TBM43_UPD_CNT[0] ;
         n926TBM43_UPD_CNT = P007B17_n926TBM43_UPD_CNT[0] ;
         /* Execute user subroutine: S111 */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(15);
            returnInSub = true;
            if (true) return;
         }
         AV26W_DATA_CNT = (long)(AV26W_DATA_CNT+1) ;
         AV20W_A812_SD01_CSV_OUTPUT_ITEM = (SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem)new SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem(remoteHandle, context);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("D", 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A200TBM43_STUDY_ID, 10, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A201TBM43_DOM_CD, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A202TBM43_DOM_VAR_NM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A910TBM43_VAR_DESC, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A911TBM43_SDTM_FLG, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A912TBM43_CDASH_FLG, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A913TBM43_INPUT_TYPE_DIV, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A914TBM43_REQUIRED_FLG, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A915TBM43_SAS_FIELD_NM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A916TBM43_ODM_DATA_TYPE, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A917TBM43_NOTE, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A918TBM43_ORDER, 5, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A933TBM43_VERSION, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A919TBM43_DEL_FLG, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.format( A920TBM43_CRT_DATETIME, "9999/99/99 99:99:99"), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A921TBM43_CRT_USER_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A922TBM43_CRT_PROG_NM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.format( A923TBM43_UPD_DATETIME, "9999/99/99 99:99:99"), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A924TBM43_UPD_USER_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A925TBM43_UPD_PROG_NM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A926TBM43_UPD_CNT, 10, 0)), 0);
         AV19W_A812_SD01_CSV_OUTPUT.add(AV20W_A812_SD01_CSV_OUTPUT_ITEM, 0);
         pr_default.readNext(15);
      }
      pr_default.close(15);
      /* Execute user subroutine: S121 */
      S121 ();
      if (returnInSub) return;
   }

   public void S291( )
   {
      /* 'SUB_SET_TBM44_CRF_VISIT' Routine */
      AV26W_DATA_CNT = 0 ;
      pr_default.dynParam(16, new Object[]{ new Object[]{
                                           new Short(A946TBM44_CRF_ID) ,
                                           AV32W_TBM31_CRF_ID ,
                                           new Long(AV8B406_SD01_EXPORT_LIST_I.getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id()) ,
                                           new Long(A945TBM44_STUDY_ID) },
                                           new int[] {
                                           TypeConstants.SHORT, TypeConstants.OBJECT_COLLECTION, TypeConstants.LONG, TypeConstants.LONG
                                           }
      });
      /* Using cursor P007B18 */
      pr_default.execute(16, new Object[] {new Long(AV8B406_SD01_EXPORT_LIST_I.getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id())});
      while ( (pr_default.getStatus(16) != 101) )
      {
         A946TBM44_CRF_ID = P007B18_A946TBM44_CRF_ID[0] ;
         A945TBM44_STUDY_ID = P007B18_A945TBM44_STUDY_ID[0] ;
         A947TBM44_CRF_EDA_NO = P007B18_A947TBM44_CRF_EDA_NO[0] ;
         A948TBM44_VISIT_NO = P007B18_A948TBM44_VISIT_NO[0] ;
         n948TBM44_VISIT_NO = P007B18_n948TBM44_VISIT_NO[0] ;
         A949TBM44_DEL_FLG = P007B18_A949TBM44_DEL_FLG[0] ;
         n949TBM44_DEL_FLG = P007B18_n949TBM44_DEL_FLG[0] ;
         A950TBM44_CRT_DATETIME = P007B18_A950TBM44_CRT_DATETIME[0] ;
         n950TBM44_CRT_DATETIME = P007B18_n950TBM44_CRT_DATETIME[0] ;
         A951TBM44_CRT_USER_ID = P007B18_A951TBM44_CRT_USER_ID[0] ;
         n951TBM44_CRT_USER_ID = P007B18_n951TBM44_CRT_USER_ID[0] ;
         A952TBM44_CRT_PROG_NM = P007B18_A952TBM44_CRT_PROG_NM[0] ;
         n952TBM44_CRT_PROG_NM = P007B18_n952TBM44_CRT_PROG_NM[0] ;
         A953TBM44_UPD_DATETIME = P007B18_A953TBM44_UPD_DATETIME[0] ;
         n953TBM44_UPD_DATETIME = P007B18_n953TBM44_UPD_DATETIME[0] ;
         A954TBM44_UPD_USER_ID = P007B18_A954TBM44_UPD_USER_ID[0] ;
         n954TBM44_UPD_USER_ID = P007B18_n954TBM44_UPD_USER_ID[0] ;
         A955TBM44_UPD_PROG_NM = P007B18_A955TBM44_UPD_PROG_NM[0] ;
         n955TBM44_UPD_PROG_NM = P007B18_n955TBM44_UPD_PROG_NM[0] ;
         A956TBM44_UPD_CNT = P007B18_A956TBM44_UPD_CNT[0] ;
         n956TBM44_UPD_CNT = P007B18_n956TBM44_UPD_CNT[0] ;
         /* Execute user subroutine: S111 */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(16);
            returnInSub = true;
            if (true) return;
         }
         AV26W_DATA_CNT = (long)(AV26W_DATA_CNT+1) ;
         AV20W_A812_SD01_CSV_OUTPUT_ITEM = (SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem)new SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem(remoteHandle, context);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("D", 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A945TBM44_STUDY_ID, 10, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A946TBM44_CRF_ID, 4, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A947TBM44_CRF_EDA_NO, 2, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A948TBM44_VISIT_NO, 6, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A949TBM44_DEL_FLG, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.format( A950TBM44_CRT_DATETIME, "9999/99/99 99:99:99"), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A951TBM44_CRT_USER_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A952TBM44_CRT_PROG_NM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.format( A953TBM44_UPD_DATETIME, "9999/99/99 99:99:99"), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A954TBM44_UPD_USER_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A955TBM44_UPD_PROG_NM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A956TBM44_UPD_CNT, 10, 0)), 0);
         AV19W_A812_SD01_CSV_OUTPUT.add(AV20W_A812_SD01_CSV_OUTPUT_ITEM, 0);
         pr_default.readNext(16);
      }
      pr_default.close(16);
      /* Execute user subroutine: S121 */
      S121 ();
      if (returnInSub) return;
   }

   public void S301( )
   {
      /* 'SUB_SET_TBM45_CRF_FILETR' Routine */
      AV26W_DATA_CNT = 0 ;
      /* Using cursor P007B19 */
      pr_default.execute(17, new Object[] {new Long(AV8B406_SD01_EXPORT_LIST_I.getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id())});
      while ( (pr_default.getStatus(17) != 101) )
      {
         A977TBM45_STUDY_ID = P007B19_A977TBM45_STUDY_ID[0] ;
         A978TBM45_FILTER_NO = P007B19_A978TBM45_FILTER_NO[0] ;
         A980TBM45_FILETR_NM = P007B19_A980TBM45_FILETR_NM[0] ;
         n980TBM45_FILETR_NM = P007B19_n980TBM45_FILETR_NM[0] ;
         A981TBM45_IN_CRF_ID = P007B19_A981TBM45_IN_CRF_ID[0] ;
         n981TBM45_IN_CRF_ID = P007B19_n981TBM45_IN_CRF_ID[0] ;
         A982TBM45_DEL_FLG = P007B19_A982TBM45_DEL_FLG[0] ;
         n982TBM45_DEL_FLG = P007B19_n982TBM45_DEL_FLG[0] ;
         A983TBM45_CRT_DATETIME = P007B19_A983TBM45_CRT_DATETIME[0] ;
         n983TBM45_CRT_DATETIME = P007B19_n983TBM45_CRT_DATETIME[0] ;
         A984TBM45_CRT_USER_ID = P007B19_A984TBM45_CRT_USER_ID[0] ;
         n984TBM45_CRT_USER_ID = P007B19_n984TBM45_CRT_USER_ID[0] ;
         A985TBM45_CRT_PROG_NM = P007B19_A985TBM45_CRT_PROG_NM[0] ;
         n985TBM45_CRT_PROG_NM = P007B19_n985TBM45_CRT_PROG_NM[0] ;
         A986TBM45_UPD_DATETIME = P007B19_A986TBM45_UPD_DATETIME[0] ;
         n986TBM45_UPD_DATETIME = P007B19_n986TBM45_UPD_DATETIME[0] ;
         A987TBM45_UPD_USER_ID = P007B19_A987TBM45_UPD_USER_ID[0] ;
         n987TBM45_UPD_USER_ID = P007B19_n987TBM45_UPD_USER_ID[0] ;
         A988TBM45_UPD_PROG_NM = P007B19_A988TBM45_UPD_PROG_NM[0] ;
         n988TBM45_UPD_PROG_NM = P007B19_n988TBM45_UPD_PROG_NM[0] ;
         A989TBM45_UPD_CNT = P007B19_A989TBM45_UPD_CNT[0] ;
         n989TBM45_UPD_CNT = P007B19_n989TBM45_UPD_CNT[0] ;
         /* Execute user subroutine: S111 */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(17);
            returnInSub = true;
            if (true) return;
         }
         AV26W_DATA_CNT = (long)(AV26W_DATA_CNT+1) ;
         AV20W_A812_SD01_CSV_OUTPUT_ITEM = (SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem)new SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem(remoteHandle, context);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("D", 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A977TBM45_STUDY_ID, 10, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A978TBM45_FILTER_NO, 4, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A980TBM45_FILETR_NM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A981TBM45_IN_CRF_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A982TBM45_DEL_FLG, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.format( A983TBM45_CRT_DATETIME, "9999/99/99 99:99:99"), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A984TBM45_CRT_USER_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A985TBM45_CRT_PROG_NM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.format( A986TBM45_UPD_DATETIME, "9999/99/99 99:99:99"), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A987TBM45_UPD_USER_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A988TBM45_UPD_PROG_NM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A989TBM45_UPD_CNT, 10, 0)), 0);
         AV19W_A812_SD01_CSV_OUTPUT.add(AV20W_A812_SD01_CSV_OUTPUT_ITEM, 0);
         pr_default.readNext(17);
      }
      pr_default.close(17);
      /* Execute user subroutine: S121 */
      S121 ();
      if (returnInSub) return;
   }

   public void S311( )
   {
      /* 'SUB_SET_TBT01_SUBJECT' Routine */
      AV26W_DATA_CNT = 0 ;
      /* Using cursor P007B20 */
      pr_default.execute(18, new Object[] {new Long(AV8B406_SD01_EXPORT_LIST_I.getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id())});
      while ( (pr_default.getStatus(18) != 101) )
      {
         A87TBT01_STUDY_ID = P007B20_A87TBT01_STUDY_ID[0] ;
         A88TBT01_SUBJECT_ID = P007B20_A88TBT01_SUBJECT_ID[0] ;
         A647TBT01_OUTER_SUBJECT_ID = P007B20_A647TBT01_OUTER_SUBJECT_ID[0] ;
         n647TBT01_OUTER_SUBJECT_ID = P007B20_n647TBT01_OUTER_SUBJECT_ID[0] ;
         A698TBT01_SITE_ID = P007B20_A698TBT01_SITE_ID[0] ;
         n698TBT01_SITE_ID = P007B20_n698TBT01_SITE_ID[0] ;
         A441TBT01_DEL_FLG = P007B20_A441TBT01_DEL_FLG[0] ;
         n441TBT01_DEL_FLG = P007B20_n441TBT01_DEL_FLG[0] ;
         A442TBT01_CRT_DATETIME = P007B20_A442TBT01_CRT_DATETIME[0] ;
         n442TBT01_CRT_DATETIME = P007B20_n442TBT01_CRT_DATETIME[0] ;
         A443TBT01_CRT_USER_ID = P007B20_A443TBT01_CRT_USER_ID[0] ;
         n443TBT01_CRT_USER_ID = P007B20_n443TBT01_CRT_USER_ID[0] ;
         A444TBT01_CRT_PROG_NM = P007B20_A444TBT01_CRT_PROG_NM[0] ;
         n444TBT01_CRT_PROG_NM = P007B20_n444TBT01_CRT_PROG_NM[0] ;
         A445TBT01_UPD_DATETIME = P007B20_A445TBT01_UPD_DATETIME[0] ;
         n445TBT01_UPD_DATETIME = P007B20_n445TBT01_UPD_DATETIME[0] ;
         A446TBT01_UPD_USER_ID = P007B20_A446TBT01_UPD_USER_ID[0] ;
         n446TBT01_UPD_USER_ID = P007B20_n446TBT01_UPD_USER_ID[0] ;
         A447TBT01_UPD_PROG_NM = P007B20_A447TBT01_UPD_PROG_NM[0] ;
         n447TBT01_UPD_PROG_NM = P007B20_n447TBT01_UPD_PROG_NM[0] ;
         A448TBT01_UPD_CNT = P007B20_A448TBT01_UPD_CNT[0] ;
         n448TBT01_UPD_CNT = P007B20_n448TBT01_UPD_CNT[0] ;
         /* Execute user subroutine: S111 */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(18);
            returnInSub = true;
            if (true) return;
         }
         AV26W_DATA_CNT = (long)(AV26W_DATA_CNT+1) ;
         AV20W_A812_SD01_CSV_OUTPUT_ITEM = (SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem)new SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem(remoteHandle, context);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("D", 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A87TBT01_STUDY_ID, 10, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A88TBT01_SUBJECT_ID, 6, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A647TBT01_OUTER_SUBJECT_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A698TBT01_SITE_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A441TBT01_DEL_FLG, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.format( A442TBT01_CRT_DATETIME, "9999/99/99 99:99:99"), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A443TBT01_CRT_USER_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A444TBT01_CRT_PROG_NM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.format( A445TBT01_UPD_DATETIME, "9999/99/99 99:99:99"), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A446TBT01_UPD_USER_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A447TBT01_UPD_PROG_NM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A448TBT01_UPD_CNT, 10, 0)), 0);
         AV19W_A812_SD01_CSV_OUTPUT.add(AV20W_A812_SD01_CSV_OUTPUT_ITEM, 0);
         pr_default.readNext(18);
      }
      pr_default.close(18);
      /* Execute user subroutine: S121 */
      S121 ();
      if (returnInSub) return;
   }

   public void S321( )
   {
      /* 'SUB_SET_TBT02_CRF' Routine */
      AV26W_DATA_CNT = 0 ;
      pr_default.dynParam(19, new Object[]{ new Object[]{
                                           new Short(A91TBT02_CRF_ID) ,
                                           AV32W_TBM31_CRF_ID ,
                                           new Long(AV8B406_SD01_EXPORT_LIST_I.getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id()) ,
                                           new Long(A89TBT02_STUDY_ID) },
                                           new int[] {
                                           TypeConstants.SHORT, TypeConstants.OBJECT_COLLECTION, TypeConstants.LONG, TypeConstants.LONG
                                           }
      });
      /* Using cursor P007B21 */
      pr_default.execute(19, new Object[] {new Long(AV8B406_SD01_EXPORT_LIST_I.getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id())});
      while ( (pr_default.getStatus(19) != 101) )
      {
         A91TBT02_CRF_ID = P007B21_A91TBT02_CRF_ID[0] ;
         A89TBT02_STUDY_ID = P007B21_A89TBT02_STUDY_ID[0] ;
         A90TBT02_SUBJECT_ID = P007B21_A90TBT02_SUBJECT_ID[0] ;
         A935TBT02_CRF_EDA_NO = P007B21_A935TBT02_CRF_EDA_NO[0] ;
         A498TBT02_CRF_LATEST_VERSION = P007B21_A498TBT02_CRF_LATEST_VERSION[0] ;
         n498TBT02_CRF_LATEST_VERSION = P007B21_n498TBT02_CRF_LATEST_VERSION[0] ;
         A499TBT02_CRF_INPUT_LEVEL = P007B21_A499TBT02_CRF_INPUT_LEVEL[0] ;
         n499TBT02_CRF_INPUT_LEVEL = P007B21_n499TBT02_CRF_INPUT_LEVEL[0] ;
         A648TBT02_LOCK_FLG = P007B21_A648TBT02_LOCK_FLG[0] ;
         n648TBT02_LOCK_FLG = P007B21_n648TBT02_LOCK_FLG[0] ;
         A649TBT02_LOCK_DATETIME = P007B21_A649TBT02_LOCK_DATETIME[0] ;
         n649TBT02_LOCK_DATETIME = P007B21_n649TBT02_LOCK_DATETIME[0] ;
         A650TBT02_LOCK_USER_ID = P007B21_A650TBT02_LOCK_USER_ID[0] ;
         n650TBT02_LOCK_USER_ID = P007B21_n650TBT02_LOCK_USER_ID[0] ;
         A651TBT02_LOCK_AUTH_CD = P007B21_A651TBT02_LOCK_AUTH_CD[0] ;
         n651TBT02_LOCK_AUTH_CD = P007B21_n651TBT02_LOCK_AUTH_CD[0] ;
         A652TBT02_UPLOAD_DATETIME = P007B21_A652TBT02_UPLOAD_DATETIME[0] ;
         n652TBT02_UPLOAD_DATETIME = P007B21_n652TBT02_UPLOAD_DATETIME[0] ;
         A653TBT02_UPLOAD_USER_ID = P007B21_A653TBT02_UPLOAD_USER_ID[0] ;
         n653TBT02_UPLOAD_USER_ID = P007B21_n653TBT02_UPLOAD_USER_ID[0] ;
         A654TBT02_UPLOAD_AUTH_CD = P007B21_A654TBT02_UPLOAD_AUTH_CD[0] ;
         n654TBT02_UPLOAD_AUTH_CD = P007B21_n654TBT02_UPLOAD_AUTH_CD[0] ;
         A655TBT02_DM_ARRIVAL_FLG = P007B21_A655TBT02_DM_ARRIVAL_FLG[0] ;
         n655TBT02_DM_ARRIVAL_FLG = P007B21_n655TBT02_DM_ARRIVAL_FLG[0] ;
         A656TBT02_DM_ARRIVAL_DATETIME = P007B21_A656TBT02_DM_ARRIVAL_DATETIME[0] ;
         n656TBT02_DM_ARRIVAL_DATETIME = P007B21_n656TBT02_DM_ARRIVAL_DATETIME[0] ;
         A657TBT02_APPROVAL_FLG = P007B21_A657TBT02_APPROVAL_FLG[0] ;
         n657TBT02_APPROVAL_FLG = P007B21_n657TBT02_APPROVAL_FLG[0] ;
         A658TBT02_APPROVAL_DATETIME = P007B21_A658TBT02_APPROVAL_DATETIME[0] ;
         n658TBT02_APPROVAL_DATETIME = P007B21_n658TBT02_APPROVAL_DATETIME[0] ;
         A659TBT02_APPROVAL_USER_ID = P007B21_A659TBT02_APPROVAL_USER_ID[0] ;
         n659TBT02_APPROVAL_USER_ID = P007B21_n659TBT02_APPROVAL_USER_ID[0] ;
         A660TBT02_APPROVAL_AUTH_CD = P007B21_A660TBT02_APPROVAL_AUTH_CD[0] ;
         n660TBT02_APPROVAL_AUTH_CD = P007B21_n660TBT02_APPROVAL_AUTH_CD[0] ;
         A990TBT02_SIGNATURE_FLG = P007B21_A990TBT02_SIGNATURE_FLG[0] ;
         n990TBT02_SIGNATURE_FLG = P007B21_n990TBT02_SIGNATURE_FLG[0] ;
         A991TBT02_SIGNATURE_DATETIME = P007B21_A991TBT02_SIGNATURE_DATETIME[0] ;
         n991TBT02_SIGNATURE_DATETIME = P007B21_n991TBT02_SIGNATURE_DATETIME[0] ;
         A992TBT02_SIGNATURE_USER_ID = P007B21_A992TBT02_SIGNATURE_USER_ID[0] ;
         n992TBT02_SIGNATURE_USER_ID = P007B21_n992TBT02_SIGNATURE_USER_ID[0] ;
         A661TBT02_INPUT_END_FLG = P007B21_A661TBT02_INPUT_END_FLG[0] ;
         n661TBT02_INPUT_END_FLG = P007B21_n661TBT02_INPUT_END_FLG[0] ;
         A662TBT02_INPUT_END_DATETIME = P007B21_A662TBT02_INPUT_END_DATETIME[0] ;
         n662TBT02_INPUT_END_DATETIME = P007B21_n662TBT02_INPUT_END_DATETIME[0] ;
         A663TBT02_INPUT_END_USER_ID = P007B21_A663TBT02_INPUT_END_USER_ID[0] ;
         n663TBT02_INPUT_END_USER_ID = P007B21_n663TBT02_INPUT_END_USER_ID[0] ;
         A664TBT02_INPUT_END_AUTH_CD = P007B21_A664TBT02_INPUT_END_AUTH_CD[0] ;
         n664TBT02_INPUT_END_AUTH_CD = P007B21_n664TBT02_INPUT_END_AUTH_CD[0] ;
         A449TBT02_DEL_FLG = P007B21_A449TBT02_DEL_FLG[0] ;
         n449TBT02_DEL_FLG = P007B21_n449TBT02_DEL_FLG[0] ;
         A450TBT02_CRT_DATETIME = P007B21_A450TBT02_CRT_DATETIME[0] ;
         n450TBT02_CRT_DATETIME = P007B21_n450TBT02_CRT_DATETIME[0] ;
         A451TBT02_CRT_USER_ID = P007B21_A451TBT02_CRT_USER_ID[0] ;
         n451TBT02_CRT_USER_ID = P007B21_n451TBT02_CRT_USER_ID[0] ;
         A452TBT02_CRT_PROG_NM = P007B21_A452TBT02_CRT_PROG_NM[0] ;
         n452TBT02_CRT_PROG_NM = P007B21_n452TBT02_CRT_PROG_NM[0] ;
         A453TBT02_UPD_DATETIME = P007B21_A453TBT02_UPD_DATETIME[0] ;
         n453TBT02_UPD_DATETIME = P007B21_n453TBT02_UPD_DATETIME[0] ;
         A454TBT02_UPD_USER_ID = P007B21_A454TBT02_UPD_USER_ID[0] ;
         n454TBT02_UPD_USER_ID = P007B21_n454TBT02_UPD_USER_ID[0] ;
         A455TBT02_UPD_PROG_NM = P007B21_A455TBT02_UPD_PROG_NM[0] ;
         n455TBT02_UPD_PROG_NM = P007B21_n455TBT02_UPD_PROG_NM[0] ;
         A456TBT02_UPD_CNT = P007B21_A456TBT02_UPD_CNT[0] ;
         n456TBT02_UPD_CNT = P007B21_n456TBT02_UPD_CNT[0] ;
         /* Execute user subroutine: S111 */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(19);
            returnInSub = true;
            if (true) return;
         }
         AV26W_DATA_CNT = (long)(AV26W_DATA_CNT+1) ;
         AV20W_A812_SD01_CSV_OUTPUT_ITEM = (SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem)new SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem(remoteHandle, context);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("D", 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A89TBT02_STUDY_ID, 10, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A90TBT02_SUBJECT_ID, 6, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A91TBT02_CRF_ID, 4, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A935TBT02_CRF_EDA_NO, 2, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A498TBT02_CRF_LATEST_VERSION, 4, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A499TBT02_CRF_INPUT_LEVEL, 2, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A648TBT02_LOCK_FLG, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.ttoc( A649TBT02_LOCK_DATETIME, 10, 8, 0, 1, "/", ":", " "), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A650TBT02_LOCK_USER_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A651TBT02_LOCK_AUTH_CD, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.ttoc( A652TBT02_UPLOAD_DATETIME, 10, 8, 0, 1, "/", ":", " "), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A653TBT02_UPLOAD_USER_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A654TBT02_UPLOAD_AUTH_CD, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A655TBT02_DM_ARRIVAL_FLG, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.ttoc( A656TBT02_DM_ARRIVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A657TBT02_APPROVAL_FLG, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.ttoc( A658TBT02_APPROVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A659TBT02_APPROVAL_USER_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A660TBT02_APPROVAL_AUTH_CD, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A990TBT02_SIGNATURE_FLG, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.ttoc( A991TBT02_SIGNATURE_DATETIME, 10, 8, 0, 1, "/", ":", " "), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A992TBT02_SIGNATURE_USER_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A661TBT02_INPUT_END_FLG, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.ttoc( A662TBT02_INPUT_END_DATETIME, 10, 8, 0, 1, "/", ":", " "), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A663TBT02_INPUT_END_USER_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A664TBT02_INPUT_END_AUTH_CD, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A449TBT02_DEL_FLG, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.format( A450TBT02_CRT_DATETIME, "9999/99/99 99:99:99"), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A451TBT02_CRT_USER_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A452TBT02_CRT_PROG_NM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.format( A453TBT02_UPD_DATETIME, "9999/99/99 99:99:99"), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A454TBT02_UPD_USER_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A455TBT02_UPD_PROG_NM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A456TBT02_UPD_CNT, 10, 0)), 0);
         AV19W_A812_SD01_CSV_OUTPUT.add(AV20W_A812_SD01_CSV_OUTPUT_ITEM, 0);
         pr_default.readNext(19);
      }
      pr_default.close(19);
      /* Execute user subroutine: S121 */
      S121 ();
      if (returnInSub) return;
   }

   public void S331( )
   {
      /* 'SUB_SET_TBT11_CRF_HISTORY' Routine */
      AV26W_DATA_CNT = 0 ;
      pr_default.dynParam(20, new Object[]{ new Object[]{
                                           new Short(A94TBT11_CRF_ID) ,
                                           AV32W_TBM31_CRF_ID ,
                                           new Long(AV8B406_SD01_EXPORT_LIST_I.getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id()) ,
                                           new Long(A92TBT11_STUDY_ID) },
                                           new int[] {
                                           TypeConstants.SHORT, TypeConstants.OBJECT_COLLECTION, TypeConstants.LONG, TypeConstants.LONG
                                           }
      });
      /* Using cursor P007B22 */
      pr_default.execute(20, new Object[] {new Long(AV8B406_SD01_EXPORT_LIST_I.getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id())});
      while ( (pr_default.getStatus(20) != 101) )
      {
         A94TBT11_CRF_ID = P007B22_A94TBT11_CRF_ID[0] ;
         A92TBT11_STUDY_ID = P007B22_A92TBT11_STUDY_ID[0] ;
         A93TBT11_SUBJECT_ID = P007B22_A93TBT11_SUBJECT_ID[0] ;
         A936TBT11_CRF_EDA_NO = P007B22_A936TBT11_CRF_EDA_NO[0] ;
         A95TBT11_CRF_VERSION = P007B22_A95TBT11_CRF_VERSION[0] ;
         A665TBT11_CRF_INPUT_LEVEL = P007B22_A665TBT11_CRF_INPUT_LEVEL[0] ;
         n665TBT11_CRF_INPUT_LEVEL = P007B22_n665TBT11_CRF_INPUT_LEVEL[0] ;
         A666TBT11_UPLOAD_DATETIME = P007B22_A666TBT11_UPLOAD_DATETIME[0] ;
         n666TBT11_UPLOAD_DATETIME = P007B22_n666TBT11_UPLOAD_DATETIME[0] ;
         A667TBT11_UPLOAD_USER_ID = P007B22_A667TBT11_UPLOAD_USER_ID[0] ;
         n667TBT11_UPLOAD_USER_ID = P007B22_n667TBT11_UPLOAD_USER_ID[0] ;
         A668TBT11_UPLOAD_AUTH_CD = P007B22_A668TBT11_UPLOAD_AUTH_CD[0] ;
         n668TBT11_UPLOAD_AUTH_CD = P007B22_n668TBT11_UPLOAD_AUTH_CD[0] ;
         A669TBT11_DM_ARRIVAL_FLG = P007B22_A669TBT11_DM_ARRIVAL_FLG[0] ;
         n669TBT11_DM_ARRIVAL_FLG = P007B22_n669TBT11_DM_ARRIVAL_FLG[0] ;
         A670TBT11_DM_ARRIVAL_DATETIME = P007B22_A670TBT11_DM_ARRIVAL_DATETIME[0] ;
         n670TBT11_DM_ARRIVAL_DATETIME = P007B22_n670TBT11_DM_ARRIVAL_DATETIME[0] ;
         A671TBT11_APPROVAL_FLG = P007B22_A671TBT11_APPROVAL_FLG[0] ;
         n671TBT11_APPROVAL_FLG = P007B22_n671TBT11_APPROVAL_FLG[0] ;
         A672TBT11_APPROVAL_DATETIME = P007B22_A672TBT11_APPROVAL_DATETIME[0] ;
         n672TBT11_APPROVAL_DATETIME = P007B22_n672TBT11_APPROVAL_DATETIME[0] ;
         A673TBT11_APPROVAL_USER_ID = P007B22_A673TBT11_APPROVAL_USER_ID[0] ;
         n673TBT11_APPROVAL_USER_ID = P007B22_n673TBT11_APPROVAL_USER_ID[0] ;
         A674TBT11_APPROVAL_AUTH_CD = P007B22_A674TBT11_APPROVAL_AUTH_CD[0] ;
         n674TBT11_APPROVAL_AUTH_CD = P007B22_n674TBT11_APPROVAL_AUTH_CD[0] ;
         A993TBT11_SIGNATURE_FLG = P007B22_A993TBT11_SIGNATURE_FLG[0] ;
         n993TBT11_SIGNATURE_FLG = P007B22_n993TBT11_SIGNATURE_FLG[0] ;
         A994TBT11_SIGNATURE_DATETIME = P007B22_A994TBT11_SIGNATURE_DATETIME[0] ;
         n994TBT11_SIGNATURE_DATETIME = P007B22_n994TBT11_SIGNATURE_DATETIME[0] ;
         A995TBT11_SIGNATURE_USER_ID = P007B22_A995TBT11_SIGNATURE_USER_ID[0] ;
         n995TBT11_SIGNATURE_USER_ID = P007B22_n995TBT11_SIGNATURE_USER_ID[0] ;
         A675TBT11_INPUT_END_FLG = P007B22_A675TBT11_INPUT_END_FLG[0] ;
         n675TBT11_INPUT_END_FLG = P007B22_n675TBT11_INPUT_END_FLG[0] ;
         A676TBT11_INPUT_END_DATETIME = P007B22_A676TBT11_INPUT_END_DATETIME[0] ;
         n676TBT11_INPUT_END_DATETIME = P007B22_n676TBT11_INPUT_END_DATETIME[0] ;
         A677TBT11_INPUT_END_USER_ID = P007B22_A677TBT11_INPUT_END_USER_ID[0] ;
         n677TBT11_INPUT_END_USER_ID = P007B22_n677TBT11_INPUT_END_USER_ID[0] ;
         A678TBT11_INPUT_END_AUTH_CD = P007B22_A678TBT11_INPUT_END_AUTH_CD[0] ;
         n678TBT11_INPUT_END_AUTH_CD = P007B22_n678TBT11_INPUT_END_AUTH_CD[0] ;
         A891TBT11_UPD_RIYU = P007B22_A891TBT11_UPD_RIYU[0] ;
         n891TBT11_UPD_RIYU = P007B22_n891TBT11_UPD_RIYU[0] ;
         A457TBT11_DEL_FLG = P007B22_A457TBT11_DEL_FLG[0] ;
         n457TBT11_DEL_FLG = P007B22_n457TBT11_DEL_FLG[0] ;
         A458TBT11_CRT_DATETIME = P007B22_A458TBT11_CRT_DATETIME[0] ;
         n458TBT11_CRT_DATETIME = P007B22_n458TBT11_CRT_DATETIME[0] ;
         A459TBT11_CRT_USER_ID = P007B22_A459TBT11_CRT_USER_ID[0] ;
         n459TBT11_CRT_USER_ID = P007B22_n459TBT11_CRT_USER_ID[0] ;
         A460TBT11_CRT_PROG_NM = P007B22_A460TBT11_CRT_PROG_NM[0] ;
         n460TBT11_CRT_PROG_NM = P007B22_n460TBT11_CRT_PROG_NM[0] ;
         A461TBT11_UPD_DATETIME = P007B22_A461TBT11_UPD_DATETIME[0] ;
         n461TBT11_UPD_DATETIME = P007B22_n461TBT11_UPD_DATETIME[0] ;
         A462TBT11_UPD_USER_ID = P007B22_A462TBT11_UPD_USER_ID[0] ;
         n462TBT11_UPD_USER_ID = P007B22_n462TBT11_UPD_USER_ID[0] ;
         A463TBT11_UPD_PROG_NM = P007B22_A463TBT11_UPD_PROG_NM[0] ;
         n463TBT11_UPD_PROG_NM = P007B22_n463TBT11_UPD_PROG_NM[0] ;
         A464TBT11_UPD_CNT = P007B22_A464TBT11_UPD_CNT[0] ;
         n464TBT11_UPD_CNT = P007B22_n464TBT11_UPD_CNT[0] ;
         /* Execute user subroutine: S111 */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(20);
            returnInSub = true;
            if (true) return;
         }
         AV26W_DATA_CNT = (long)(AV26W_DATA_CNT+1) ;
         AV20W_A812_SD01_CSV_OUTPUT_ITEM = (SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem)new SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem(remoteHandle, context);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("D", 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A92TBT11_STUDY_ID, 10, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A93TBT11_SUBJECT_ID, 6, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A94TBT11_CRF_ID, 4, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A936TBT11_CRF_EDA_NO, 2, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A95TBT11_CRF_VERSION, 4, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A665TBT11_CRF_INPUT_LEVEL, 2, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.ttoc( A666TBT11_UPLOAD_DATETIME, 10, 8, 0, 1, "/", ":", " "), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A667TBT11_UPLOAD_USER_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A668TBT11_UPLOAD_AUTH_CD, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A669TBT11_DM_ARRIVAL_FLG, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.ttoc( A670TBT11_DM_ARRIVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A671TBT11_APPROVAL_FLG, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.ttoc( A672TBT11_APPROVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A673TBT11_APPROVAL_USER_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A674TBT11_APPROVAL_AUTH_CD, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A993TBT11_SIGNATURE_FLG, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.ttoc( A994TBT11_SIGNATURE_DATETIME, 10, 8, 0, 1, "/", ":", " "), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A995TBT11_SIGNATURE_USER_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A675TBT11_INPUT_END_FLG, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.ttoc( A676TBT11_INPUT_END_DATETIME, 10, 8, 0, 1, "/", ":", " "), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A677TBT11_INPUT_END_USER_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A678TBT11_INPUT_END_AUTH_CD, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A891TBT11_UPD_RIYU, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A457TBT11_DEL_FLG, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.format( A458TBT11_CRT_DATETIME, "9999/99/99 99:99:99"), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A459TBT11_CRT_USER_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A460TBT11_CRT_PROG_NM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.format( A461TBT11_UPD_DATETIME, "9999/99/99 99:99:99"), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A462TBT11_UPD_USER_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A463TBT11_UPD_PROG_NM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A464TBT11_UPD_CNT, 10, 0)), 0);
         AV19W_A812_SD01_CSV_OUTPUT.add(AV20W_A812_SD01_CSV_OUTPUT_ITEM, 0);
         pr_default.readNext(20);
      }
      pr_default.close(20);
      /* Execute user subroutine: S121 */
      S121 ();
      if (returnInSub) return;
   }

   public void S341( )
   {
      /* 'SUB_SET_TBT12_CRF_RESULT' Routine */
      AV26W_DATA_CNT = 0 ;
      pr_default.dynParam(21, new Object[]{ new Object[]{
                                           new Short(A98TBT12_CRF_ID) ,
                                           AV32W_TBM31_CRF_ID ,
                                           new Long(AV8B406_SD01_EXPORT_LIST_I.getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id()) ,
                                           new Long(A96TBT12_STUDY_ID) },
                                           new int[] {
                                           TypeConstants.SHORT, TypeConstants.OBJECT_COLLECTION, TypeConstants.LONG, TypeConstants.LONG
                                           }
      });
      /* Using cursor P007B23 */
      pr_default.execute(21, new Object[] {new Long(AV8B406_SD01_EXPORT_LIST_I.getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id())});
      while ( (pr_default.getStatus(21) != 101) )
      {
         A98TBT12_CRF_ID = P007B23_A98TBT12_CRF_ID[0] ;
         A96TBT12_STUDY_ID = P007B23_A96TBT12_STUDY_ID[0] ;
         A97TBT12_SUBJECT_ID = P007B23_A97TBT12_SUBJECT_ID[0] ;
         A937TBT12_CRF_EDA_NO = P007B23_A937TBT12_CRF_EDA_NO[0] ;
         A99TBT12_CRF_ITEM_GRP_DIV = P007B23_A99TBT12_CRF_ITEM_GRP_DIV[0] ;
         A100TBT12_CRF_ITEM_GRP_CD = P007B23_A100TBT12_CRF_ITEM_GRP_CD[0] ;
         A465TBT12_CRF_VALUE = P007B23_A465TBT12_CRF_VALUE[0] ;
         n465TBT12_CRF_VALUE = P007B23_n465TBT12_CRF_VALUE[0] ;
         A679TBT12_EDIT_FLG = P007B23_A679TBT12_EDIT_FLG[0] ;
         n679TBT12_EDIT_FLG = P007B23_n679TBT12_EDIT_FLG[0] ;
         A473TBT12_DEL_FLG = P007B23_A473TBT12_DEL_FLG[0] ;
         n473TBT12_DEL_FLG = P007B23_n473TBT12_DEL_FLG[0] ;
         A466TBT12_CRT_DATETIME = P007B23_A466TBT12_CRT_DATETIME[0] ;
         n466TBT12_CRT_DATETIME = P007B23_n466TBT12_CRT_DATETIME[0] ;
         A467TBT12_CRT_USER_ID = P007B23_A467TBT12_CRT_USER_ID[0] ;
         n467TBT12_CRT_USER_ID = P007B23_n467TBT12_CRT_USER_ID[0] ;
         A468TBT12_CRT_PROG_NM = P007B23_A468TBT12_CRT_PROG_NM[0] ;
         n468TBT12_CRT_PROG_NM = P007B23_n468TBT12_CRT_PROG_NM[0] ;
         A469TBT12_UPD_DATETIME = P007B23_A469TBT12_UPD_DATETIME[0] ;
         n469TBT12_UPD_DATETIME = P007B23_n469TBT12_UPD_DATETIME[0] ;
         A470TBT12_UPD_USER_ID = P007B23_A470TBT12_UPD_USER_ID[0] ;
         n470TBT12_UPD_USER_ID = P007B23_n470TBT12_UPD_USER_ID[0] ;
         A471TBT12_UPD_PROG_NM = P007B23_A471TBT12_UPD_PROG_NM[0] ;
         n471TBT12_UPD_PROG_NM = P007B23_n471TBT12_UPD_PROG_NM[0] ;
         A472TBT12_UPD_CNT = P007B23_A472TBT12_UPD_CNT[0] ;
         n472TBT12_UPD_CNT = P007B23_n472TBT12_UPD_CNT[0] ;
         /* Execute user subroutine: S111 */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(21);
            returnInSub = true;
            if (true) return;
         }
         AV26W_DATA_CNT = (long)(AV26W_DATA_CNT+1) ;
         AV20W_A812_SD01_CSV_OUTPUT_ITEM = (SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem)new SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem(remoteHandle, context);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("D", 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A96TBT12_STUDY_ID, 10, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A97TBT12_SUBJECT_ID, 6, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A98TBT12_CRF_ID, 4, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A937TBT12_CRF_EDA_NO, 2, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A99TBT12_CRF_ITEM_GRP_DIV, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A100TBT12_CRF_ITEM_GRP_CD, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A465TBT12_CRF_VALUE, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A679TBT12_EDIT_FLG, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A473TBT12_DEL_FLG, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.format( A466TBT12_CRT_DATETIME, "9999/99/99 99:99:99"), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A467TBT12_CRT_USER_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A468TBT12_CRT_PROG_NM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.format( A469TBT12_UPD_DATETIME, "9999/99/99 99:99:99"), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A470TBT12_UPD_USER_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A471TBT12_UPD_PROG_NM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A472TBT12_UPD_CNT, 10, 0)), 0);
         AV19W_A812_SD01_CSV_OUTPUT.add(AV20W_A812_SD01_CSV_OUTPUT_ITEM, 0);
         pr_default.readNext(21);
      }
      pr_default.close(21);
      /* Execute user subroutine: S121 */
      S121 ();
      if (returnInSub) return;
   }

   public void S351( )
   {
      /* 'SUB_SET_TBT13_CRF_RES_HIS' Routine */
      AV26W_DATA_CNT = 0 ;
      pr_default.dynParam(22, new Object[]{ new Object[]{
                                           new Short(A103TBT13_CRF_ID) ,
                                           AV32W_TBM31_CRF_ID ,
                                           new Long(AV8B406_SD01_EXPORT_LIST_I.getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id()) ,
                                           new Long(A101TBT13_STUDY_ID) },
                                           new int[] {
                                           TypeConstants.SHORT, TypeConstants.OBJECT_COLLECTION, TypeConstants.LONG, TypeConstants.LONG
                                           }
      });
      /* Using cursor P007B24 */
      pr_default.execute(22, new Object[] {new Long(AV8B406_SD01_EXPORT_LIST_I.getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id())});
      while ( (pr_default.getStatus(22) != 101) )
      {
         A103TBT13_CRF_ID = P007B24_A103TBT13_CRF_ID[0] ;
         A101TBT13_STUDY_ID = P007B24_A101TBT13_STUDY_ID[0] ;
         A102TBT13_SUBJECT_ID = P007B24_A102TBT13_SUBJECT_ID[0] ;
         A938TBT13_CRF_EDA_NO = P007B24_A938TBT13_CRF_EDA_NO[0] ;
         A104TBT13_CRF_VERSION = P007B24_A104TBT13_CRF_VERSION[0] ;
         A105TBT13_CRF_ITEM_GRP_DIV = P007B24_A105TBT13_CRF_ITEM_GRP_DIV[0] ;
         A106TBT13_CRF_ITEM_GRP_CD = P007B24_A106TBT13_CRF_ITEM_GRP_CD[0] ;
         A597TBT13_CRF_VALUE = P007B24_A597TBT13_CRF_VALUE[0] ;
         n597TBT13_CRF_VALUE = P007B24_n597TBT13_CRF_VALUE[0] ;
         A680TBT13_EDIT_FLG = P007B24_A680TBT13_EDIT_FLG[0] ;
         n680TBT13_EDIT_FLG = P007B24_n680TBT13_EDIT_FLG[0] ;
         A598TBT13_DEL_FLG = P007B24_A598TBT13_DEL_FLG[0] ;
         n598TBT13_DEL_FLG = P007B24_n598TBT13_DEL_FLG[0] ;
         A599TBT13_CRT_DATETIME = P007B24_A599TBT13_CRT_DATETIME[0] ;
         n599TBT13_CRT_DATETIME = P007B24_n599TBT13_CRT_DATETIME[0] ;
         A600TBT13_CRT_USER_ID = P007B24_A600TBT13_CRT_USER_ID[0] ;
         n600TBT13_CRT_USER_ID = P007B24_n600TBT13_CRT_USER_ID[0] ;
         A601TBT13_CRT_PROG_NM = P007B24_A601TBT13_CRT_PROG_NM[0] ;
         n601TBT13_CRT_PROG_NM = P007B24_n601TBT13_CRT_PROG_NM[0] ;
         A602TBT13_UPD_DATETIME = P007B24_A602TBT13_UPD_DATETIME[0] ;
         n602TBT13_UPD_DATETIME = P007B24_n602TBT13_UPD_DATETIME[0] ;
         A603TBT13_UPD_USER_ID = P007B24_A603TBT13_UPD_USER_ID[0] ;
         n603TBT13_UPD_USER_ID = P007B24_n603TBT13_UPD_USER_ID[0] ;
         A604TBT13_UPD_PROG_NM = P007B24_A604TBT13_UPD_PROG_NM[0] ;
         n604TBT13_UPD_PROG_NM = P007B24_n604TBT13_UPD_PROG_NM[0] ;
         A605TBT13_UPD_CNT = P007B24_A605TBT13_UPD_CNT[0] ;
         n605TBT13_UPD_CNT = P007B24_n605TBT13_UPD_CNT[0] ;
         /* Execute user subroutine: S111 */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(22);
            returnInSub = true;
            if (true) return;
         }
         AV26W_DATA_CNT = (long)(AV26W_DATA_CNT+1) ;
         AV20W_A812_SD01_CSV_OUTPUT_ITEM = (SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem)new SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem(remoteHandle, context);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("D", 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A101TBT13_STUDY_ID, 10, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A102TBT13_SUBJECT_ID, 6, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A103TBT13_CRF_ID, 4, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A938TBT13_CRF_EDA_NO, 2, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A104TBT13_CRF_VERSION, 4, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A105TBT13_CRF_ITEM_GRP_DIV, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A106TBT13_CRF_ITEM_GRP_CD, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A597TBT13_CRF_VALUE, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A680TBT13_EDIT_FLG, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A598TBT13_DEL_FLG, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.format( A599TBT13_CRT_DATETIME, "9999/99/99 99:99:99"), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A600TBT13_CRT_USER_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A601TBT13_CRT_PROG_NM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.format( A602TBT13_UPD_DATETIME, "9999/99/99 99:99:99"), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A603TBT13_UPD_USER_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A604TBT13_UPD_PROG_NM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A605TBT13_UPD_CNT, 10, 0)), 0);
         AV19W_A812_SD01_CSV_OUTPUT.add(AV20W_A812_SD01_CSV_OUTPUT_ITEM, 0);
         pr_default.readNext(22);
      }
      pr_default.close(22);
      /* Execute user subroutine: S121 */
      S121 ();
      if (returnInSub) return;
   }

   public void S361( )
   {
      /* 'SUB_SET_TBT14_CRF_MEMO' Routine */
      AV26W_DATA_CNT = 0 ;
      pr_default.dynParam(23, new Object[]{ new Object[]{
                                           new Short(A474TBT14_CRF_ID) ,
                                           AV32W_TBM31_CRF_ID ,
                                           new Long(AV8B406_SD01_EXPORT_LIST_I.getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id()) ,
                                           new Long(A140TBT14_STUDY_ID) },
                                           new int[] {
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.OBJECT_COLLECTION, TypeConstants.LONG, TypeConstants.LONG
                                           }
      });
      /* Using cursor P007B25 */
      pr_default.execute(23, new Object[] {new Long(AV8B406_SD01_EXPORT_LIST_I.getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id())});
      while ( (pr_default.getStatus(23) != 101) )
      {
         A474TBT14_CRF_ID = P007B25_A474TBT14_CRF_ID[0] ;
         n474TBT14_CRF_ID = P007B25_n474TBT14_CRF_ID[0] ;
         A140TBT14_STUDY_ID = P007B25_A140TBT14_STUDY_ID[0] ;
         A142TBT14_SUBJECT_ID = P007B25_A142TBT14_SUBJECT_ID[0] ;
         A198TBT14_MEMO_NO = P007B25_A198TBT14_MEMO_NO[0] ;
         A941TBT14_CRF_EDA_NO = P007B25_A941TBT14_CRF_EDA_NO[0] ;
         n941TBT14_CRF_EDA_NO = P007B25_n941TBT14_CRF_EDA_NO[0] ;
         A475TBT14_CRF_VERSION = P007B25_A475TBT14_CRF_VERSION[0] ;
         n475TBT14_CRF_VERSION = P007B25_n475TBT14_CRF_VERSION[0] ;
         A901TBT14_MEMO_KBN = P007B25_A901TBT14_MEMO_KBN[0] ;
         n901TBT14_MEMO_KBN = P007B25_n901TBT14_MEMO_KBN[0] ;
         A477TBT14_MEMO = P007B25_A477TBT14_MEMO[0] ;
         n477TBT14_MEMO = P007B25_n477TBT14_MEMO[0] ;
         A929TBT14_REQUEST_SITE_ID = P007B25_A929TBT14_REQUEST_SITE_ID[0] ;
         n929TBT14_REQUEST_SITE_ID = P007B25_n929TBT14_REQUEST_SITE_ID[0] ;
         A930TBT14_REQUEST_AUTH_CD = P007B25_A930TBT14_REQUEST_AUTH_CD[0] ;
         n930TBT14_REQUEST_AUTH_CD = P007B25_n930TBT14_REQUEST_AUTH_CD[0] ;
         A931TBT14_CRT_AUTH_CD = P007B25_A931TBT14_CRT_AUTH_CD[0] ;
         n931TBT14_CRT_AUTH_CD = P007B25_n931TBT14_CRT_AUTH_CD[0] ;
         A927TBT14_KAKUNIN_FLG = P007B25_A927TBT14_KAKUNIN_FLG[0] ;
         n927TBT14_KAKUNIN_FLG = P007B25_n927TBT14_KAKUNIN_FLG[0] ;
         A928TBT14_KAKUNIN_USER_ID = P007B25_A928TBT14_KAKUNIN_USER_ID[0] ;
         n928TBT14_KAKUNIN_USER_ID = P007B25_n928TBT14_KAKUNIN_USER_ID[0] ;
         A934TBT14_KAKUNIN_COMMENT = P007B25_A934TBT14_KAKUNIN_COMMENT[0] ;
         n934TBT14_KAKUNIN_COMMENT = P007B25_n934TBT14_KAKUNIN_COMMENT[0] ;
         A902TBT14_KANRYO_FLG = P007B25_A902TBT14_KANRYO_FLG[0] ;
         n902TBT14_KANRYO_FLG = P007B25_n902TBT14_KANRYO_FLG[0] ;
         A479TBT14_DEL_FLG = P007B25_A479TBT14_DEL_FLG[0] ;
         n479TBT14_DEL_FLG = P007B25_n479TBT14_DEL_FLG[0] ;
         A480TBT14_CRT_DATETIME = P007B25_A480TBT14_CRT_DATETIME[0] ;
         n480TBT14_CRT_DATETIME = P007B25_n480TBT14_CRT_DATETIME[0] ;
         A481TBT14_CRT_USER_ID = P007B25_A481TBT14_CRT_USER_ID[0] ;
         n481TBT14_CRT_USER_ID = P007B25_n481TBT14_CRT_USER_ID[0] ;
         A482TBT14_CRT_PROG_NM = P007B25_A482TBT14_CRT_PROG_NM[0] ;
         n482TBT14_CRT_PROG_NM = P007B25_n482TBT14_CRT_PROG_NM[0] ;
         A483TBT14_UPD_DATETIME = P007B25_A483TBT14_UPD_DATETIME[0] ;
         n483TBT14_UPD_DATETIME = P007B25_n483TBT14_UPD_DATETIME[0] ;
         A484TBT14_UPD_USER_ID = P007B25_A484TBT14_UPD_USER_ID[0] ;
         n484TBT14_UPD_USER_ID = P007B25_n484TBT14_UPD_USER_ID[0] ;
         A485TBT14_UPD_PROG_NM = P007B25_A485TBT14_UPD_PROG_NM[0] ;
         n485TBT14_UPD_PROG_NM = P007B25_n485TBT14_UPD_PROG_NM[0] ;
         A486TBT14_UPD_CNT = P007B25_A486TBT14_UPD_CNT[0] ;
         n486TBT14_UPD_CNT = P007B25_n486TBT14_UPD_CNT[0] ;
         /* Execute user subroutine: S111 */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(23);
            returnInSub = true;
            if (true) return;
         }
         AV26W_DATA_CNT = (long)(AV26W_DATA_CNT+1) ;
         AV20W_A812_SD01_CSV_OUTPUT_ITEM = (SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem)new SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem(remoteHandle, context);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("D", 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A140TBT14_STUDY_ID, 10, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A142TBT14_SUBJECT_ID, 6, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A198TBT14_MEMO_NO, 3, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A474TBT14_CRF_ID, 4, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A941TBT14_CRF_EDA_NO, 2, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A475TBT14_CRF_VERSION, 4, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A901TBT14_MEMO_KBN, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A477TBT14_MEMO, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A929TBT14_REQUEST_SITE_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A930TBT14_REQUEST_AUTH_CD, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A931TBT14_CRT_AUTH_CD, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A927TBT14_KAKUNIN_FLG, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A928TBT14_KAKUNIN_USER_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A934TBT14_KAKUNIN_COMMENT, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A902TBT14_KANRYO_FLG, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A479TBT14_DEL_FLG, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.format( A480TBT14_CRT_DATETIME, "9999/99/99 99:99:99"), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A481TBT14_CRT_USER_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A482TBT14_CRT_PROG_NM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.format( A483TBT14_UPD_DATETIME, "9999/99/99 99:99:99"), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A484TBT14_UPD_USER_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A485TBT14_UPD_PROG_NM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A486TBT14_UPD_CNT, 10, 0)), 0);
         AV19W_A812_SD01_CSV_OUTPUT.add(AV20W_A812_SD01_CSV_OUTPUT_ITEM, 0);
         pr_default.readNext(23);
      }
      pr_default.close(23);
      /* Execute user subroutine: S121 */
      S121 ();
      if (returnInSub) return;
   }

   public void S371( )
   {
      /* 'SUB_SET_TBT15_CRF_MEMO_LOC' Routine */
      AV26W_DATA_CNT = 0 ;
      pr_default.dynParam(24, new Object[]{ new Object[]{
                                           new Short(A155TBT15_CRF_ID) ,
                                           AV32W_TBM31_CRF_ID ,
                                           new Long(AV8B406_SD01_EXPORT_LIST_I.getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id()) ,
                                           new Long(A149TBT15_STUDY_ID) },
                                           new int[] {
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.OBJECT_COLLECTION, TypeConstants.LONG, TypeConstants.LONG
                                           }
      });
      /* Using cursor P007B26 */
      pr_default.execute(24, new Object[] {new Long(AV8B406_SD01_EXPORT_LIST_I.getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id())});
      while ( (pr_default.getStatus(24) != 101) )
      {
         A155TBT15_CRF_ID = P007B26_A155TBT15_CRF_ID[0] ;
         n155TBT15_CRF_ID = P007B26_n155TBT15_CRF_ID[0] ;
         A149TBT15_STUDY_ID = P007B26_A149TBT15_STUDY_ID[0] ;
         A151TBT15_SUBJECT_ID = P007B26_A151TBT15_SUBJECT_ID[0] ;
         A199TBT15_MEMO_NO = P007B26_A199TBT15_MEMO_NO[0] ;
         A942TBT15_CRF_EDA_NO = P007B26_A942TBT15_CRF_EDA_NO[0] ;
         n942TBT15_CRF_EDA_NO = P007B26_n942TBT15_CRF_EDA_NO[0] ;
         A157TBT15_CRF_VERSION = P007B26_A157TBT15_CRF_VERSION[0] ;
         n157TBT15_CRF_VERSION = P007B26_n157TBT15_CRF_VERSION[0] ;
         A903TBT15_CRF_ITEM_GRP_DIV = P007B26_A903TBT15_CRF_ITEM_GRP_DIV[0] ;
         n903TBT15_CRF_ITEM_GRP_DIV = P007B26_n903TBT15_CRF_ITEM_GRP_DIV[0] ;
         A904TBT15_CRF_ITEM_GRP_CD = P007B26_A904TBT15_CRF_ITEM_GRP_CD[0] ;
         n904TBT15_CRF_ITEM_GRP_CD = P007B26_n904TBT15_CRF_ITEM_GRP_CD[0] ;
         A488TBT15_DEL_FLG = P007B26_A488TBT15_DEL_FLG[0] ;
         n488TBT15_DEL_FLG = P007B26_n488TBT15_DEL_FLG[0] ;
         A489TBT15_CRT_DATETIME = P007B26_A489TBT15_CRT_DATETIME[0] ;
         n489TBT15_CRT_DATETIME = P007B26_n489TBT15_CRT_DATETIME[0] ;
         A490TBT15_CRT_USER_ID = P007B26_A490TBT15_CRT_USER_ID[0] ;
         n490TBT15_CRT_USER_ID = P007B26_n490TBT15_CRT_USER_ID[0] ;
         A491TBT15_CRT_PROG_NM = P007B26_A491TBT15_CRT_PROG_NM[0] ;
         n491TBT15_CRT_PROG_NM = P007B26_n491TBT15_CRT_PROG_NM[0] ;
         A492TBT15_UPD_DATETIME = P007B26_A492TBT15_UPD_DATETIME[0] ;
         n492TBT15_UPD_DATETIME = P007B26_n492TBT15_UPD_DATETIME[0] ;
         A493TBT15_UPD_USER_ID = P007B26_A493TBT15_UPD_USER_ID[0] ;
         n493TBT15_UPD_USER_ID = P007B26_n493TBT15_UPD_USER_ID[0] ;
         A494TBT15_UPD_PROG_NM = P007B26_A494TBT15_UPD_PROG_NM[0] ;
         n494TBT15_UPD_PROG_NM = P007B26_n494TBT15_UPD_PROG_NM[0] ;
         A495TBT15_UPD_CNT = P007B26_A495TBT15_UPD_CNT[0] ;
         n495TBT15_UPD_CNT = P007B26_n495TBT15_UPD_CNT[0] ;
         /* Execute user subroutine: S111 */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(24);
            returnInSub = true;
            if (true) return;
         }
         AV26W_DATA_CNT = (long)(AV26W_DATA_CNT+1) ;
         AV20W_A812_SD01_CSV_OUTPUT_ITEM = (SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem)new SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem(remoteHandle, context);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("D", 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A149TBT15_STUDY_ID, 10, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A151TBT15_SUBJECT_ID, 6, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A199TBT15_MEMO_NO, 3, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A155TBT15_CRF_ID, 4, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A942TBT15_CRF_EDA_NO, 2, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A157TBT15_CRF_VERSION, 4, 0)), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A903TBT15_CRF_ITEM_GRP_DIV, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A904TBT15_CRF_ITEM_GRP_CD, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A488TBT15_DEL_FLG, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.format( A489TBT15_CRT_DATETIME, "9999/99/99 99:99:99"), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A490TBT15_CRT_USER_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A491TBT15_CRT_PROG_NM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.format( A492TBT15_UPD_DATETIME, "9999/99/99 99:99:99"), 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A493TBT15_UPD_USER_ID, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A494TBT15_UPD_PROG_NM, 0);
         AV20W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A495TBT15_UPD_CNT, 10, 0)), 0);
         AV19W_A812_SD01_CSV_OUTPUT.add(AV20W_A812_SD01_CSV_OUTPUT_ITEM, 0);
         pr_default.readNext(24);
      }
      pr_default.close(24);
      /* Execute user subroutine: S121 */
      S121 ();
      if (returnInSub) return;
   }

   public void S381( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT3[0] = AV18W_A_LOGIN_SDT;
      GXv_char2[0] = AV27W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT3, GXv_char2) ;
      AV18W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT3[0] ;
      b406_pc01_design_export_csv.this.AV27W_ERRCD = GXv_char2[0] ;
      if ( GXutil.strcmp(AV27W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("1")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void S391( )
   {
      /* 'SUB_CSV_OUTPUT' Routine */
      GXv_char2[0] = AV29W_FILE_PATH ;
      GXv_char4[0] = AV17PO_ERRMSG ;
      new a812_pc04_csv_output_esc(remoteHandle, context).execute( AV18W_A_LOGIN_SDT, "", AV19W_A812_SD01_CSV_OUTPUT, AV28W_FILE_NAME, GXv_char2, GXv_char4) ;
      b406_pc01_design_export_csv.this.AV29W_FILE_PATH = GXv_char2[0] ;
      b406_pc01_design_export_csv.this.AV17PO_ERRMSG = GXv_char4[0] ;
      if ( ! (GXutil.strcmp("", AV17PO_ERRMSG)==0) )
      {
         AV16PO_ERRCD = "1" ;
         returnInSub = true;
         if (true) return;
      }
      else
      {
         AV37W_ZIP_FILENAME = AV29W_FILE_PATH + "/" + AV28W_FILE_NAME ;
         AV37W_ZIP_FILENAME = GXutil.strReplace( AV37W_ZIP_FILENAME, ".csv", ".zip") ;
         AV36W_ZIP_FILE_PATH = AV29W_FILE_PATH ;
         AV38WeZipFile.compress(AV37W_ZIP_FILENAME, AV36W_ZIP_FILE_PATH, AV29W_FILE_PATH+"/"+AV28W_FILE_NAME);
         AV39W_FILE.setSource( AV29W_FILE_PATH+"/"+AV28W_FILE_NAME );
         AV39W_FILE.delete();
         AV28W_FILE_NAME = GXutil.strReplace( AV28W_FILE_NAME, ".csv", ".zip") ;
      }
   }

   public void S401( )
   {
      /* 'SUB_CSV_DAWNLOAD' Routine */
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "aa811_pc01_download_dialog"+GXutil.URLEncode(GXutil.rtrim(AV29W_FILE_PATH)) + "," + GXutil.URLEncode(GXutil.rtrim(AV28W_FILE_NAME)) ;
      httpContext.wjLoc = formatLink("aa811_pc01_download_dialog") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void S411( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV45Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   protected void cleanup( )
   {
      this.aP7[0] = b406_pc01_design_export_csv.this.AV16PO_ERRCD;
      this.aP8[0] = b406_pc01_design_export_csv.this.AV17PO_ERRMSG;
      CloseOpenCursors();
      exitApplication();
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
                  /* Execute user subroutine: S411 */
                  S411 ();
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
      AV16PO_ERRCD = "" ;
      AV17PO_ERRMSG = "" ;
      AV9C_TAM02_APP_ID = "" ;
      AV25W_CSV_SDEL = "" ;
      AV23W_CSV_FDEL = "" ;
      AV24W_CSV_KAK = "" ;
      AV40W_HTTPREQUEST = httpContext.getHttpRequest();
      AV28W_FILE_NAME = "" ;
      AV32W_TBM31_CRF_ID = new GxObjectCollection(Short.class, "internal", "");
      AV8B406_SD01_EXPORT_LIST_I = new SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem(remoteHandle, context);
      AV19W_A812_SD01_CSV_OUTPUT = new GxObjectCollection(SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem.class, "A812_SD01_CSV_OUTPUT.A812_SD01_CSV_OUTPUTItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      AV20W_A812_SD01_CSV_OUTPUT_ITEM = new SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem(remoteHandle, context);
      AV31W_TABLE_NM = "" ;
      AV45Pgmname = "" ;
      GXt_char1 = "" ;
      scmdbuf = "" ;
      P007B2_A63TBM21_STUDY_ID = new long[1] ;
      P007B2_A367TBM21_STUDY_NM = new String[] {""} ;
      P007B2_n367TBM21_STUDY_NM = new boolean[] {false} ;
      P007B2_A530TBM21_OUTER_STUDY_ID = new String[] {""} ;
      P007B2_n530TBM21_OUTER_STUDY_ID = new boolean[] {false} ;
      P007B2_A531TBM21_PROC_NM = new String[] {""} ;
      P007B2_n531TBM21_PROC_NM = new boolean[] {false} ;
      P007B2_A368TBM21_NOTE = new String[] {""} ;
      P007B2_n368TBM21_NOTE = new boolean[] {false} ;
      P007B2_A607TBM21_STATUS = new String[] {""} ;
      P007B2_n607TBM21_STATUS = new boolean[] {false} ;
      P007B2_A369TBM21_DEL_FLG = new String[] {""} ;
      P007B2_n369TBM21_DEL_FLG = new boolean[] {false} ;
      P007B2_A370TBM21_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007B2_n370TBM21_CRT_DATETIME = new boolean[] {false} ;
      P007B2_A371TBM21_CRT_USER_ID = new String[] {""} ;
      P007B2_n371TBM21_CRT_USER_ID = new boolean[] {false} ;
      P007B2_A372TBM21_CRT_PROG_NM = new String[] {""} ;
      P007B2_n372TBM21_CRT_PROG_NM = new boolean[] {false} ;
      P007B2_A373TBM21_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007B2_n373TBM21_UPD_DATETIME = new boolean[] {false} ;
      P007B2_A374TBM21_UPD_USER_ID = new String[] {""} ;
      P007B2_n374TBM21_UPD_USER_ID = new boolean[] {false} ;
      P007B2_A375TBM21_UPD_PROG_NM = new String[] {""} ;
      P007B2_n375TBM21_UPD_PROG_NM = new boolean[] {false} ;
      P007B2_A376TBM21_UPD_CNT = new long[1] ;
      P007B2_n376TBM21_UPD_CNT = new boolean[] {false} ;
      A367TBM21_STUDY_NM = "" ;
      A530TBM21_OUTER_STUDY_ID = "" ;
      A531TBM21_PROC_NM = "" ;
      A368TBM21_NOTE = "" ;
      A607TBM21_STATUS = "" ;
      A369TBM21_DEL_FLG = "" ;
      A370TBM21_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A371TBM21_CRT_USER_ID = "" ;
      A372TBM21_CRT_PROG_NM = "" ;
      A373TBM21_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A374TBM21_UPD_USER_ID = "" ;
      A375TBM21_UPD_PROG_NM = "" ;
      P007B3_A17TBM22_STUDY_ID = new long[1] ;
      P007B3_A18TBM22_SITE_ID = new String[] {""} ;
      P007B3_A377TBM22_DEL_FLG = new String[] {""} ;
      P007B3_n377TBM22_DEL_FLG = new boolean[] {false} ;
      P007B3_A378TBM22_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007B3_n378TBM22_CRT_DATETIME = new boolean[] {false} ;
      P007B3_A379TBM22_CRT_USER_ID = new String[] {""} ;
      P007B3_n379TBM22_CRT_USER_ID = new boolean[] {false} ;
      P007B3_A380TBM22_CRT_PROG_NM = new String[] {""} ;
      P007B3_n380TBM22_CRT_PROG_NM = new boolean[] {false} ;
      P007B3_A381TBM22_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007B3_n381TBM22_UPD_DATETIME = new boolean[] {false} ;
      P007B3_A382TBM22_UPD_USER_ID = new String[] {""} ;
      P007B3_n382TBM22_UPD_USER_ID = new boolean[] {false} ;
      P007B3_A383TBM22_UPD_PROG_NM = new String[] {""} ;
      P007B3_n383TBM22_UPD_PROG_NM = new boolean[] {false} ;
      P007B3_A384TBM22_UPD_CNT = new long[1] ;
      P007B3_n384TBM22_UPD_CNT = new boolean[] {false} ;
      A18TBM22_SITE_ID = "" ;
      A377TBM22_DEL_FLG = "" ;
      A378TBM22_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A379TBM22_CRT_USER_ID = "" ;
      A380TBM22_CRT_PROG_NM = "" ;
      A381TBM22_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A382TBM22_UPD_USER_ID = "" ;
      A383TBM22_UPD_PROG_NM = "" ;
      P007B4_A107TBM23_STUDY_ID = new long[1] ;
      P007B4_A108TBM23_USER_ID = new String[] {""} ;
      P007B4_A109TBM23_STYDY_AUTH_CD = new String[] {""} ;
      P007B4_A385TBM23_DEL_FLG = new String[] {""} ;
      P007B4_n385TBM23_DEL_FLG = new boolean[] {false} ;
      P007B4_A386TBM23_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007B4_n386TBM23_CRT_DATETIME = new boolean[] {false} ;
      P007B4_A387TBM23_CRT_USER_ID = new String[] {""} ;
      P007B4_n387TBM23_CRT_USER_ID = new boolean[] {false} ;
      P007B4_A388TBM23_CRT_PROG_NM = new String[] {""} ;
      P007B4_n388TBM23_CRT_PROG_NM = new boolean[] {false} ;
      P007B4_A389TBM23_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007B4_n389TBM23_UPD_DATETIME = new boolean[] {false} ;
      P007B4_A390TBM23_UPD_USER_ID = new String[] {""} ;
      P007B4_n390TBM23_UPD_USER_ID = new boolean[] {false} ;
      P007B4_A391TBM23_UPD_PROG_NM = new String[] {""} ;
      P007B4_n391TBM23_UPD_PROG_NM = new boolean[] {false} ;
      P007B4_A392TBM23_UPD_CNT = new long[1] ;
      P007B4_n392TBM23_UPD_CNT = new boolean[] {false} ;
      A108TBM23_USER_ID = "" ;
      A109TBM23_STYDY_AUTH_CD = "" ;
      A385TBM23_DEL_FLG = "" ;
      A386TBM23_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A387TBM23_CRT_USER_ID = "" ;
      A388TBM23_CRT_PROG_NM = "" ;
      A389TBM23_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A390TBM23_UPD_USER_ID = "" ;
      A391TBM23_UPD_PROG_NM = "" ;
      P007B5_A64TBM24_STUDY_ID = new long[1] ;
      P007B5_A65TBM24_DOM_CD = new String[] {""} ;
      P007B5_A66TBM24_DOM_VAR_NM = new String[] {""} ;
      P007B5_A702TBM24_DOM_ITM_GRP_OID = new String[] {""} ;
      P007B5_n702TBM24_DOM_ITM_GRP_OID = new boolean[] {false} ;
      P007B5_A703TBM24_DOM_ITM_GRP_ATTR_SEQ = new short[1] ;
      P007B5_n703TBM24_DOM_ITM_GRP_ATTR_SEQ = new boolean[] {false} ;
      P007B5_A704TBM24_DOM_ITM_GRP_ROWNO = new short[1] ;
      P007B5_n704TBM24_DOM_ITM_GRP_ROWNO = new boolean[] {false} ;
      P007B5_A705TBM24_CRF_ITEM_NM = new String[] {""} ;
      P007B5_n705TBM24_CRF_ITEM_NM = new boolean[] {false} ;
      P007B5_A67TBM24_CRF_ITEM_DIV = new String[] {""} ;
      P007B5_A635TBM24_IDENTIFICATION_CD = new String[] {""} ;
      P007B5_n635TBM24_IDENTIFICATION_CD = new boolean[] {false} ;
      P007B5_A636TBM24_TEXT_MAXLENGTH = new short[1] ;
      P007B5_n636TBM24_TEXT_MAXLENGTH = new boolean[] {false} ;
      P007B5_A637TBM24_TEXT_MAXROWS = new byte[1] ;
      P007B5_n637TBM24_TEXT_MAXROWS = new boolean[] {false} ;
      P007B5_A638TBM24_DECIMAL_DIGITS = new byte[1] ;
      P007B5_n638TBM24_DECIMAL_DIGITS = new boolean[] {false} ;
      P007B5_A639TBM24_TEXT = new String[] {""} ;
      P007B5_n639TBM24_TEXT = new boolean[] {false} ;
      P007B5_A640TBM24_FIXED_VALUE = new String[] {""} ;
      P007B5_n640TBM24_FIXED_VALUE = new boolean[] {false} ;
      P007B5_A641TBM24_CHK_FALSE_INNER_VALUE = new String[] {""} ;
      P007B5_n641TBM24_CHK_FALSE_INNER_VALUE = new boolean[] {false} ;
      P007B5_A706TBM24_REQUIRED_INPUT_FLG = new String[] {""} ;
      P007B5_n706TBM24_REQUIRED_INPUT_FLG = new boolean[] {false} ;
      P007B5_A707TBM24_MIN_VALUE = new String[] {""} ;
      P007B5_n707TBM24_MIN_VALUE = new boolean[] {false} ;
      P007B5_A708TBM24_MAX_VALUE = new String[] {""} ;
      P007B5_n708TBM24_MAX_VALUE = new boolean[] {false} ;
      P007B5_A543TBM24_ORDER = new int[1] ;
      P007B5_n543TBM24_ORDER = new boolean[] {false} ;
      P007B5_A544TBM24_DEL_FLG = new String[] {""} ;
      P007B5_n544TBM24_DEL_FLG = new boolean[] {false} ;
      P007B5_A545TBM24_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007B5_n545TBM24_CRT_DATETIME = new boolean[] {false} ;
      P007B5_A546TBM24_CRT_USER_ID = new String[] {""} ;
      P007B5_n546TBM24_CRT_USER_ID = new boolean[] {false} ;
      P007B5_A547TBM24_CRT_PROG_NM = new String[] {""} ;
      P007B5_n547TBM24_CRT_PROG_NM = new boolean[] {false} ;
      P007B5_A548TBM24_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007B5_n548TBM24_UPD_DATETIME = new boolean[] {false} ;
      P007B5_A549TBM24_UPD_USER_ID = new String[] {""} ;
      P007B5_n549TBM24_UPD_USER_ID = new boolean[] {false} ;
      P007B5_A550TBM24_UPD_PROG_NM = new String[] {""} ;
      P007B5_n550TBM24_UPD_PROG_NM = new boolean[] {false} ;
      P007B5_A551TBM24_UPD_CNT = new long[1] ;
      P007B5_n551TBM24_UPD_CNT = new boolean[] {false} ;
      A65TBM24_DOM_CD = "" ;
      A66TBM24_DOM_VAR_NM = "" ;
      A702TBM24_DOM_ITM_GRP_OID = "" ;
      A705TBM24_CRF_ITEM_NM = "" ;
      A67TBM24_CRF_ITEM_DIV = "" ;
      A635TBM24_IDENTIFICATION_CD = "" ;
      A639TBM24_TEXT = "" ;
      A640TBM24_FIXED_VALUE = "" ;
      A641TBM24_CHK_FALSE_INNER_VALUE = "" ;
      A706TBM24_REQUIRED_INPUT_FLG = "" ;
      A707TBM24_MIN_VALUE = "" ;
      A708TBM24_MAX_VALUE = "" ;
      A544TBM24_DEL_FLG = "" ;
      A545TBM24_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A546TBM24_CRT_USER_ID = "" ;
      A547TBM24_CRT_PROG_NM = "" ;
      A548TBM24_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A549TBM24_UPD_USER_ID = "" ;
      A550TBM24_UPD_PROG_NM = "" ;
      P007B6_A23TBM25_STUDY_ID = new long[1] ;
      P007B6_A24TBM25_LIST_CD = new String[] {""} ;
      P007B6_A552TBM25_LIST_NM = new String[] {""} ;
      P007B6_n552TBM25_LIST_NM = new boolean[] {false} ;
      P007B6_A553TBM25_DEL_FLG = new String[] {""} ;
      P007B6_n553TBM25_DEL_FLG = new boolean[] {false} ;
      P007B6_A554TBM25_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007B6_n554TBM25_CRT_DATETIME = new boolean[] {false} ;
      P007B6_A555TBM25_CRT_USER_ID = new String[] {""} ;
      P007B6_n555TBM25_CRT_USER_ID = new boolean[] {false} ;
      P007B6_A556TBM25_CRT_PROG_NM = new String[] {""} ;
      P007B6_n556TBM25_CRT_PROG_NM = new boolean[] {false} ;
      P007B6_A557TBM25_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007B6_n557TBM25_UPD_DATETIME = new boolean[] {false} ;
      P007B6_A558TBM25_UPD_USER_ID = new String[] {""} ;
      P007B6_n558TBM25_UPD_USER_ID = new boolean[] {false} ;
      P007B6_A559TBM25_UPD_PROG_NM = new String[] {""} ;
      P007B6_n559TBM25_UPD_PROG_NM = new boolean[] {false} ;
      P007B6_A560TBM25_UPD_CNT = new long[1] ;
      P007B6_n560TBM25_UPD_CNT = new boolean[] {false} ;
      A24TBM25_LIST_CD = "" ;
      A552TBM25_LIST_NM = "" ;
      A553TBM25_DEL_FLG = "" ;
      A554TBM25_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A555TBM25_CRT_USER_ID = "" ;
      A556TBM25_CRT_PROG_NM = "" ;
      A557TBM25_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A558TBM25_UPD_USER_ID = "" ;
      A559TBM25_UPD_PROG_NM = "" ;
      P007B7_A25TBM26_STUDY_ID = new long[1] ;
      P007B7_A26TBM26_LIST_CD = new String[] {""} ;
      P007B7_A27TBM26_LIST_ITEM_NO = new short[1] ;
      P007B7_A561TBM26_LIST_ITEM_NAME = new String[] {""} ;
      P007B7_n561TBM26_LIST_ITEM_NAME = new boolean[] {false} ;
      P007B7_A562TBM26_INNER_VALUE = new String[] {""} ;
      P007B7_n562TBM26_INNER_VALUE = new boolean[] {false} ;
      P007B7_A563TBM26_DEL_FLG = new String[] {""} ;
      P007B7_n563TBM26_DEL_FLG = new boolean[] {false} ;
      P007B7_A564TBM26_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007B7_n564TBM26_CRT_DATETIME = new boolean[] {false} ;
      P007B7_A565TBM26_CRT_USER_ID = new String[] {""} ;
      P007B7_n565TBM26_CRT_USER_ID = new boolean[] {false} ;
      P007B7_A566TBM26_CRT_PROG_NM = new String[] {""} ;
      P007B7_n566TBM26_CRT_PROG_NM = new boolean[] {false} ;
      P007B7_A567TBM26_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007B7_n567TBM26_UPD_DATETIME = new boolean[] {false} ;
      P007B7_A568TBM26_UPD_USER_ID = new String[] {""} ;
      P007B7_n568TBM26_UPD_USER_ID = new boolean[] {false} ;
      P007B7_A569TBM26_UPD_PROG_NM = new String[] {""} ;
      P007B7_n569TBM26_UPD_PROG_NM = new boolean[] {false} ;
      P007B7_A570TBM26_UPD_CNT = new long[1] ;
      P007B7_n570TBM26_UPD_CNT = new boolean[] {false} ;
      A26TBM26_LIST_CD = "" ;
      A561TBM26_LIST_ITEM_NAME = "" ;
      A562TBM26_INNER_VALUE = "" ;
      A563TBM26_DEL_FLG = "" ;
      A564TBM26_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A565TBM26_CRT_USER_ID = "" ;
      A566TBM26_CRT_PROG_NM = "" ;
      A567TBM26_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A568TBM26_UPD_USER_ID = "" ;
      A569TBM26_UPD_PROG_NM = "" ;
      P007B8_A69TBM31_CRF_ID = new short[1] ;
      P007B8_A68TBM31_STUDY_ID = new long[1] ;
      P007B8_A393TBM31_CRF_NM = new String[] {""} ;
      P007B8_n393TBM31_CRF_NM = new boolean[] {false} ;
      P007B8_A642TBM31_CRF_SNM = new String[] {""} ;
      P007B8_n642TBM31_CRF_SNM = new boolean[] {false} ;
      P007B8_A394TBM31_GRID_SIZE = new short[1] ;
      P007B8_n394TBM31_GRID_SIZE = new boolean[] {false} ;
      P007B8_A528TBM31_DEF_VISIT_NO = new int[1] ;
      P007B8_n528TBM31_DEF_VISIT_NO = new boolean[] {false} ;
      P007B8_A529TBM31_DEF_DOMAIN_CD = new String[] {""} ;
      P007B8_n529TBM31_DEF_DOMAIN_CD = new boolean[] {false} ;
      P007B8_A643TBM31_STATUS = new String[] {""} ;
      P007B8_n643TBM31_STATUS = new boolean[] {false} ;
      P007B8_A396TBM31_NOTE = new String[] {""} ;
      P007B8_n396TBM31_NOTE = new boolean[] {false} ;
      P007B8_A943TBM31_REPEAT_FLG = new byte[1] ;
      P007B8_n943TBM31_REPEAT_FLG = new boolean[] {false} ;
      P007B8_A944TBM31_REPEAT_MAX = new byte[1] ;
      P007B8_n944TBM31_REPEAT_MAX = new boolean[] {false} ;
      P007B8_A979TBM31_DM_EXCP_NO_DISP_FLG = new String[] {""} ;
      P007B8_n979TBM31_DM_EXCP_NO_DISP_FLG = new boolean[] {false} ;
      P007B8_A397TBM31_DEL_FLG = new String[] {""} ;
      P007B8_n397TBM31_DEL_FLG = new boolean[] {false} ;
      P007B8_A398TBM31_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007B8_n398TBM31_CRT_DATETIME = new boolean[] {false} ;
      P007B8_A399TBM31_CRT_USER_ID = new String[] {""} ;
      P007B8_n399TBM31_CRT_USER_ID = new boolean[] {false} ;
      P007B8_A400TBM31_CRT_PROG_NM = new String[] {""} ;
      P007B8_n400TBM31_CRT_PROG_NM = new boolean[] {false} ;
      P007B8_A401TBM31_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007B8_n401TBM31_UPD_DATETIME = new boolean[] {false} ;
      P007B8_A402TBM31_UPD_USER_ID = new String[] {""} ;
      P007B8_n402TBM31_UPD_USER_ID = new boolean[] {false} ;
      P007B8_A403TBM31_UPD_PROG_NM = new String[] {""} ;
      P007B8_n403TBM31_UPD_PROG_NM = new boolean[] {false} ;
      P007B8_A404TBM31_UPD_CNT = new long[1] ;
      P007B8_n404TBM31_UPD_CNT = new boolean[] {false} ;
      P007B8_A395TBM31_ORDER = new int[1] ;
      P007B8_n395TBM31_ORDER = new boolean[] {false} ;
      A393TBM31_CRF_NM = "" ;
      A642TBM31_CRF_SNM = "" ;
      A529TBM31_DEF_DOMAIN_CD = "" ;
      A643TBM31_STATUS = "" ;
      A396TBM31_NOTE = "" ;
      A979TBM31_DM_EXCP_NO_DISP_FLG = "" ;
      A397TBM31_DEL_FLG = "" ;
      A398TBM31_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A399TBM31_CRT_USER_ID = "" ;
      A400TBM31_CRT_PROG_NM = "" ;
      A401TBM31_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A402TBM31_UPD_USER_ID = "" ;
      A403TBM31_UPD_PROG_NM = "" ;
      P007B9_A71TBM32_CRF_ID = new short[1] ;
      P007B9_A70TBM32_STUDY_ID = new long[1] ;
      P007B9_A72TBM32_CRF_ITEM_CD = new String[] {""} ;
      P007B9_A405TBM32_CRF_ITEM_NM = new String[] {""} ;
      P007B9_n405TBM32_CRF_ITEM_NM = new boolean[] {false} ;
      P007B9_A74TBM32_CRF_ITEM_DIV = new String[] {""} ;
      P007B9_n74TBM32_CRF_ITEM_DIV = new boolean[] {false} ;
      P007B9_A73TBM32_CRF_ITEM_GRP_CD = new String[] {""} ;
      P007B9_n73TBM32_CRF_ITEM_GRP_CD = new boolean[] {false} ;
      P007B9_A507TBM32_CRF_ITEM_GRP_ORDER = new short[1] ;
      P007B9_n507TBM32_CRF_ITEM_GRP_ORDER = new boolean[] {false} ;
      P007B9_A508TBM32_LOCATION_X = new short[1] ;
      P007B9_n508TBM32_LOCATION_X = new boolean[] {false} ;
      P007B9_A509TBM32_LOCATION_Y = new short[1] ;
      P007B9_n509TBM32_LOCATION_Y = new boolean[] {false} ;
      P007B9_A510TBM32_LOCATION_X2 = new short[1] ;
      P007B9_n510TBM32_LOCATION_X2 = new boolean[] {false} ;
      P007B9_A511TBM32_LOCATION_Y2 = new short[1] ;
      P007B9_n511TBM32_LOCATION_Y2 = new boolean[] {false} ;
      P007B9_A512TBM32_TEXT_ALIGN_DIV = new String[] {""} ;
      P007B9_n512TBM32_TEXT_ALIGN_DIV = new boolean[] {false} ;
      P007B9_A516TBM32_TEXT_MAXROWS = new byte[1] ;
      P007B9_n516TBM32_TEXT_MAXROWS = new boolean[] {false} ;
      P007B9_A517TBM32_TEXT_MAXLENGTH = new short[1] ;
      P007B9_n517TBM32_TEXT_MAXLENGTH = new boolean[] {false} ;
      P007B9_A518TBM32_DECIMAL_DIGITS = new byte[1] ;
      P007B9_n518TBM32_DECIMAL_DIGITS = new boolean[] {false} ;
      P007B9_A522TBM32_CHK_TRUE_INNER_VALUE = new String[] {""} ;
      P007B9_n522TBM32_CHK_TRUE_INNER_VALUE = new boolean[] {false} ;
      P007B9_A523TBM32_CHK_FALSE_INNER_VALUE = new String[] {""} ;
      P007B9_n523TBM32_CHK_FALSE_INNER_VALUE = new boolean[] {false} ;
      P007B9_A527TBM32_FIXED_VALUE = new String[] {""} ;
      P007B9_n527TBM32_FIXED_VALUE = new boolean[] {false} ;
      P007B9_A525TBM32_LIST_CD = new String[] {""} ;
      P007B9_n525TBM32_LIST_CD = new boolean[] {false} ;
      P007B9_A526TBM32_IMAGE_CD = new String[] {""} ;
      P007B9_n526TBM32_IMAGE_CD = new boolean[] {false} ;
      P007B9_A524TBM32_TEXT = new String[] {""} ;
      P007B9_n524TBM32_TEXT = new boolean[] {false} ;
      P007B9_A513TBM32_FONT_SIZE = new byte[1] ;
      P007B9_n513TBM32_FONT_SIZE = new boolean[] {false} ;
      P007B9_A514TBM32_FONT_UL_FLG = new String[] {""} ;
      P007B9_n514TBM32_FONT_UL_FLG = new boolean[] {false} ;
      P007B9_A515TBM32_FONT_COLOR_DIV = new long[1] ;
      P007B9_n515TBM32_FONT_COLOR_DIV = new boolean[] {false} ;
      P007B9_A521TBM32_LINE_SIZE_DIV = new byte[1] ;
      P007B9_n521TBM32_LINE_SIZE_DIV = new boolean[] {false} ;
      P007B9_A689TBM32_LINE_COLOR_DIV = new long[1] ;
      P007B9_n689TBM32_LINE_COLOR_DIV = new boolean[] {false} ;
      P007B9_A519TBM32_LINE_START_POINT_DIV = new String[] {""} ;
      P007B9_n519TBM32_LINE_START_POINT_DIV = new boolean[] {false} ;
      P007B9_A520TBM32_LINE_END_POINT_DIV = new String[] {""} ;
      P007B9_n520TBM32_LINE_END_POINT_DIV = new boolean[] {false} ;
      P007B9_A690TBM32_LINE_ANGLE = new short[1] ;
      P007B9_n690TBM32_LINE_ANGLE = new boolean[] {false} ;
      P007B9_A644TBM32_AUTH_LVL_MIN = new byte[1] ;
      P007B9_n644TBM32_AUTH_LVL_MIN = new boolean[] {false} ;
      P007B9_A645TBM32_ZORDER = new short[1] ;
      P007B9_n645TBM32_ZORDER = new boolean[] {false} ;
      P007B9_A691TBM32_TAB_ORDER = new short[1] ;
      P007B9_n691TBM32_TAB_ORDER = new boolean[] {false} ;
      P007B9_A692TBM32_TABSTOP_FLG = new String[] {""} ;
      P007B9_n692TBM32_TABSTOP_FLG = new boolean[] {false} ;
      P007B9_A693TBM32_REQUIRED_INPUT_FLG = new String[] {""} ;
      P007B9_n693TBM32_REQUIRED_INPUT_FLG = new boolean[] {false} ;
      P007B9_A694TBM32_MIN_VALUE = new String[] {""} ;
      P007B9_n694TBM32_MIN_VALUE = new boolean[] {false} ;
      P007B9_A695TBM32_MAX_VALUE = new String[] {""} ;
      P007B9_n695TBM32_MAX_VALUE = new boolean[] {false} ;
      P007B9_A406TBM32_CRF_ITEM_NOTE = new String[] {""} ;
      P007B9_n406TBM32_CRF_ITEM_NOTE = new boolean[] {false} ;
      P007B9_A774TBM32_REF_CRF_ID = new short[1] ;
      P007B9_n774TBM32_REF_CRF_ID = new boolean[] {false} ;
      P007B9_A775TBM32_REF_CRF_ITEM_CD = new String[] {""} ;
      P007B9_n775TBM32_REF_CRF_ITEM_CD = new boolean[] {false} ;
      P007B9_A75TBM32_DEL_FLG = new String[] {""} ;
      P007B9_n75TBM32_DEL_FLG = new boolean[] {false} ;
      P007B9_A407TBM32_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007B9_n407TBM32_CRT_DATETIME = new boolean[] {false} ;
      P007B9_A408TBM32_CRT_USER_ID = new String[] {""} ;
      P007B9_n408TBM32_CRT_USER_ID = new boolean[] {false} ;
      P007B9_A409TBM32_CRT_PROG_NM = new String[] {""} ;
      P007B9_n409TBM32_CRT_PROG_NM = new boolean[] {false} ;
      P007B9_A410TBM32_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007B9_n410TBM32_UPD_DATETIME = new boolean[] {false} ;
      P007B9_A411TBM32_UPD_USER_ID = new String[] {""} ;
      P007B9_n411TBM32_UPD_USER_ID = new boolean[] {false} ;
      P007B9_A412TBM32_UPD_PROG_NM = new String[] {""} ;
      P007B9_n412TBM32_UPD_PROG_NM = new boolean[] {false} ;
      P007B9_A413TBM32_UPD_CNT = new long[1] ;
      P007B9_n413TBM32_UPD_CNT = new boolean[] {false} ;
      A72TBM32_CRF_ITEM_CD = "" ;
      A405TBM32_CRF_ITEM_NM = "" ;
      A74TBM32_CRF_ITEM_DIV = "" ;
      A73TBM32_CRF_ITEM_GRP_CD = "" ;
      A512TBM32_TEXT_ALIGN_DIV = "" ;
      A522TBM32_CHK_TRUE_INNER_VALUE = "" ;
      A523TBM32_CHK_FALSE_INNER_VALUE = "" ;
      A527TBM32_FIXED_VALUE = "" ;
      A525TBM32_LIST_CD = "" ;
      A526TBM32_IMAGE_CD = "" ;
      A524TBM32_TEXT = "" ;
      A514TBM32_FONT_UL_FLG = "" ;
      A519TBM32_LINE_START_POINT_DIV = "" ;
      A520TBM32_LINE_END_POINT_DIV = "" ;
      A692TBM32_TABSTOP_FLG = "" ;
      A693TBM32_REQUIRED_INPUT_FLG = "" ;
      A694TBM32_MIN_VALUE = "" ;
      A695TBM32_MAX_VALUE = "" ;
      A406TBM32_CRF_ITEM_NOTE = "" ;
      A775TBM32_REF_CRF_ITEM_CD = "" ;
      A75TBM32_DEL_FLG = "" ;
      A407TBM32_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A408TBM32_CRT_USER_ID = "" ;
      A409TBM32_CRT_PROG_NM = "" ;
      A410TBM32_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A411TBM32_UPD_USER_ID = "" ;
      A412TBM32_UPD_PROG_NM = "" ;
      P007B10_A77TBM33_CRF_ID = new short[1] ;
      P007B10_A76TBM33_STUDY_ID = new long[1] ;
      P007B10_A78TBM33_COND_NO = new short[1] ;
      P007B10_A502TBM33_COND_NM = new String[] {""} ;
      P007B10_n502TBM33_COND_NM = new boolean[] {false} ;
      P007B10_A414TBM33_EXPRESSION = new String[] {""} ;
      P007B10_n414TBM33_EXPRESSION = new boolean[] {false} ;
      P007B10_A503TBM33_COND_DIV = new String[] {""} ;
      P007B10_n503TBM33_COND_DIV = new boolean[] {false} ;
      P007B10_A504TBM33_CRF_ITEM_CD = new String[] {""} ;
      P007B10_n504TBM33_CRF_ITEM_CD = new boolean[] {false} ;
      P007B10_A415TBM33_PRIOR_NO = new short[1] ;
      P007B10_n415TBM33_PRIOR_NO = new boolean[] {false} ;
      P007B10_A505TBM33_ERR_DIV = new String[] {""} ;
      P007B10_n505TBM33_ERR_DIV = new boolean[] {false} ;
      P007B10_A506TBM33_ERR_MSG = new String[] {""} ;
      P007B10_n506TBM33_ERR_MSG = new boolean[] {false} ;
      P007B10_A646TBM33_ENABLED_FLG = new String[] {""} ;
      P007B10_n646TBM33_ENABLED_FLG = new boolean[] {false} ;
      P007B10_A696TBM33_REQUIRED_INPUT_FLG = new String[] {""} ;
      P007B10_n696TBM33_REQUIRED_INPUT_FLG = new boolean[] {false} ;
      P007B10_A697TBM33_NUMERIC_RANGE_FLG = new String[] {""} ;
      P007B10_n697TBM33_NUMERIC_RANGE_FLG = new boolean[] {false} ;
      P007B10_A416TBM33_DEL_FLG = new String[] {""} ;
      P007B10_n416TBM33_DEL_FLG = new boolean[] {false} ;
      P007B10_A417TBM33_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007B10_n417TBM33_CRT_DATETIME = new boolean[] {false} ;
      P007B10_A418TBM33_CRT_USER_ID = new String[] {""} ;
      P007B10_n418TBM33_CRT_USER_ID = new boolean[] {false} ;
      P007B10_A419TBM33_CRT_PROG_NM = new String[] {""} ;
      P007B10_n419TBM33_CRT_PROG_NM = new boolean[] {false} ;
      P007B10_A420TBM33_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007B10_n420TBM33_UPD_DATETIME = new boolean[] {false} ;
      P007B10_A421TBM33_UPD_USER_ID = new String[] {""} ;
      P007B10_n421TBM33_UPD_USER_ID = new boolean[] {false} ;
      P007B10_A422TBM33_UPD_PROG_NM = new String[] {""} ;
      P007B10_n422TBM33_UPD_PROG_NM = new boolean[] {false} ;
      P007B10_A423TBM33_UPD_CNT = new long[1] ;
      P007B10_n423TBM33_UPD_CNT = new boolean[] {false} ;
      A502TBM33_COND_NM = "" ;
      A414TBM33_EXPRESSION = "" ;
      A503TBM33_COND_DIV = "" ;
      A504TBM33_CRF_ITEM_CD = "" ;
      A505TBM33_ERR_DIV = "" ;
      A506TBM33_ERR_MSG = "" ;
      A646TBM33_ENABLED_FLG = "" ;
      A696TBM33_REQUIRED_INPUT_FLG = "" ;
      A697TBM33_NUMERIC_RANGE_FLG = "" ;
      A416TBM33_DEL_FLG = "" ;
      A417TBM33_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A418TBM33_CRT_USER_ID = "" ;
      A419TBM33_CRT_PROG_NM = "" ;
      A420TBM33_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A421TBM33_UPD_USER_ID = "" ;
      A422TBM33_UPD_PROG_NM = "" ;
      P007B11_A29TBM34_CRF_ID = new short[1] ;
      P007B11_A28TBM34_STUDY_ID = new long[1] ;
      P007B11_A30TBM34_STYDY_AUTH_CD = new String[] {""} ;
      P007B11_A571TBM34_DISPLAY_FLG = new String[] {""} ;
      P007B11_n571TBM34_DISPLAY_FLG = new boolean[] {false} ;
      P007B11_A572TBM34_DEL_FLG = new String[] {""} ;
      P007B11_n572TBM34_DEL_FLG = new boolean[] {false} ;
      P007B11_A573TBM34_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007B11_n573TBM34_CRT_DATETIME = new boolean[] {false} ;
      P007B11_A574TBM34_CRT_USER_ID = new String[] {""} ;
      P007B11_n574TBM34_CRT_USER_ID = new boolean[] {false} ;
      P007B11_A575TBM34_CRT_PROG_NM = new String[] {""} ;
      P007B11_n575TBM34_CRT_PROG_NM = new boolean[] {false} ;
      P007B11_A576TBM34_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007B11_n576TBM34_UPD_DATETIME = new boolean[] {false} ;
      P007B11_A577TBM34_UPD_USER_ID = new String[] {""} ;
      P007B11_n577TBM34_UPD_USER_ID = new boolean[] {false} ;
      P007B11_A578TBM34_UPD_PROG_NM = new String[] {""} ;
      P007B11_n578TBM34_UPD_PROG_NM = new boolean[] {false} ;
      P007B11_A579TBM34_UPD_CNT = new long[1] ;
      P007B11_n579TBM34_UPD_CNT = new boolean[] {false} ;
      A30TBM34_STYDY_AUTH_CD = "" ;
      A571TBM34_DISPLAY_FLG = "" ;
      A572TBM34_DEL_FLG = "" ;
      A573TBM34_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A574TBM34_CRT_USER_ID = "" ;
      A575TBM34_CRT_PROG_NM = "" ;
      A576TBM34_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A577TBM34_UPD_USER_ID = "" ;
      A578TBM34_UPD_PROG_NM = "" ;
      P007B12_A32TBM35_CRF_ID = new short[1] ;
      P007B12_A31TBM35_STUDY_ID = new long[1] ;
      P007B12_A33TBM35_CRF_ITEM_CD = new String[] {""} ;
      P007B12_A34TBM35_STUDY_AUTH_CD = new String[] {""} ;
      P007B12_A580TBM35_DISPLAY_FLG = new String[] {""} ;
      P007B12_n580TBM35_DISPLAY_FLG = new boolean[] {false} ;
      P007B12_A581TBM35_DEL_FLG = new String[] {""} ;
      P007B12_n581TBM35_DEL_FLG = new boolean[] {false} ;
      P007B12_A582TBM35_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007B12_n582TBM35_CRT_DATETIME = new boolean[] {false} ;
      P007B12_A583TBM35_CRT_USER_ID = new String[] {""} ;
      P007B12_n583TBM35_CRT_USER_ID = new boolean[] {false} ;
      P007B12_A584TBM35_CRT_PROG_NM = new String[] {""} ;
      P007B12_n584TBM35_CRT_PROG_NM = new boolean[] {false} ;
      P007B12_A585TBM35_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007B12_n585TBM35_UPD_DATETIME = new boolean[] {false} ;
      P007B12_A586TBM35_UPD_USER_ID = new String[] {""} ;
      P007B12_n586TBM35_UPD_USER_ID = new boolean[] {false} ;
      P007B12_A587TBM35_UPD_PROG_NM = new String[] {""} ;
      P007B12_n587TBM35_UPD_PROG_NM = new boolean[] {false} ;
      P007B12_A588TBM35_UPD_CNT = new long[1] ;
      P007B12_n588TBM35_UPD_CNT = new boolean[] {false} ;
      A33TBM35_CRF_ITEM_CD = "" ;
      A34TBM35_STUDY_AUTH_CD = "" ;
      A580TBM35_DISPLAY_FLG = "" ;
      A581TBM35_DEL_FLG = "" ;
      A582TBM35_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A583TBM35_CRT_USER_ID = "" ;
      A584TBM35_CRT_PROG_NM = "" ;
      A585TBM35_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A586TBM35_UPD_USER_ID = "" ;
      A587TBM35_UPD_PROG_NM = "" ;
      P007B13_A36TBM36_CRF_ID = new short[1] ;
      P007B13_A35TBM36_STUDY_ID = new long[1] ;
      P007B13_A37TBM36_COND_NO = new short[1] ;
      P007B13_A38TBM36_SELECT_CRF_ID = new short[1] ;
      P007B13_A589TBM36_DEL_FLG = new String[] {""} ;
      P007B13_n589TBM36_DEL_FLG = new boolean[] {false} ;
      P007B13_A590TBM36_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007B13_n590TBM36_CRT_DATETIME = new boolean[] {false} ;
      P007B13_A591TBM36_CRT_USER_ID = new String[] {""} ;
      P007B13_n591TBM36_CRT_USER_ID = new boolean[] {false} ;
      P007B13_A592TBM36_CRT_PROG_NM = new String[] {""} ;
      P007B13_n592TBM36_CRT_PROG_NM = new boolean[] {false} ;
      P007B13_A593TBM36_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007B13_n593TBM36_UPD_DATETIME = new boolean[] {false} ;
      P007B13_A594TBM36_UPD_USER_ID = new String[] {""} ;
      P007B13_n594TBM36_UPD_USER_ID = new boolean[] {false} ;
      P007B13_A595TBM36_UPD_PROG_NM = new String[] {""} ;
      P007B13_n595TBM36_UPD_PROG_NM = new boolean[] {false} ;
      P007B13_A596TBM36_UPD_CNT = new long[1] ;
      P007B13_n596TBM36_UPD_CNT = new boolean[] {false} ;
      A589TBM36_DEL_FLG = "" ;
      A590TBM36_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A591TBM36_CRT_USER_ID = "" ;
      A592TBM36_CRT_PROG_NM = "" ;
      A593TBM36_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A594TBM36_UPD_USER_ID = "" ;
      A595TBM36_UPD_PROG_NM = "" ;
      P007B14_A80TBM37_CRF_ID = new short[1] ;
      P007B14_A79TBM37_STUDY_ID = new long[1] ;
      P007B14_A81TBM37_CRF_ITEM_GRP_DIV = new String[] {""} ;
      P007B14_A82TBM37_CRF_ITEM_GRP_CD = new String[] {""} ;
      P007B14_A83TBM37_VISIT_NO = new int[1] ;
      P007B14_n83TBM37_VISIT_NO = new boolean[] {false} ;
      P007B14_A84TBM37_DOM_CD = new String[] {""} ;
      P007B14_n84TBM37_DOM_CD = new boolean[] {false} ;
      P007B14_A500TBM37_DOM_VAR_NM = new String[] {""} ;
      P007B14_n500TBM37_DOM_VAR_NM = new boolean[] {false} ;
      P007B14_A85TBM37_DOM_ITM_GRP_OID = new String[] {""} ;
      P007B14_n85TBM37_DOM_ITM_GRP_OID = new boolean[] {false} ;
      P007B14_A501TBM37_DOM_ITM_GRP_ATTR_SEQ = new short[1] ;
      P007B14_n501TBM37_DOM_ITM_GRP_ATTR_SEQ = new boolean[] {false} ;
      P007B14_A86TBM37_DOM_ITM_GRP_ROWNO = new short[1] ;
      P007B14_n86TBM37_DOM_ITM_GRP_ROWNO = new boolean[] {false} ;
      P007B14_A433TBM37_DEL_FLG = new String[] {""} ;
      P007B14_n433TBM37_DEL_FLG = new boolean[] {false} ;
      P007B14_A434TBM37_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007B14_n434TBM37_CRT_DATETIME = new boolean[] {false} ;
      P007B14_A435TBM37_CRT_USER_ID = new String[] {""} ;
      P007B14_n435TBM37_CRT_USER_ID = new boolean[] {false} ;
      P007B14_A436TBM37_CRT_PROG_NM = new String[] {""} ;
      P007B14_n436TBM37_CRT_PROG_NM = new boolean[] {false} ;
      P007B14_A437TBM37_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007B14_n437TBM37_UPD_DATETIME = new boolean[] {false} ;
      P007B14_A438TBM37_UPD_USER_ID = new String[] {""} ;
      P007B14_n438TBM37_UPD_USER_ID = new boolean[] {false} ;
      P007B14_A439TBM37_UPD_PROG_NM = new String[] {""} ;
      P007B14_n439TBM37_UPD_PROG_NM = new boolean[] {false} ;
      P007B14_A440TBM37_UPD_CNT = new long[1] ;
      P007B14_n440TBM37_UPD_CNT = new boolean[] {false} ;
      A81TBM37_CRF_ITEM_GRP_DIV = "" ;
      A82TBM37_CRF_ITEM_GRP_CD = "" ;
      A84TBM37_DOM_CD = "" ;
      A500TBM37_DOM_VAR_NM = "" ;
      A85TBM37_DOM_ITM_GRP_OID = "" ;
      A433TBM37_DEL_FLG = "" ;
      A434TBM37_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A435TBM37_CRT_USER_ID = "" ;
      A436TBM37_CRT_PROG_NM = "" ;
      A437TBM37_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A438TBM37_UPD_USER_ID = "" ;
      A439TBM37_UPD_PROG_NM = "" ;
      P007B15_A20TBM41_CRF_ID = new short[1] ;
      P007B15_A19TBM41_STUDY_ID = new long[1] ;
      P007B15_A21TBM41_CRF_ITEM_GRP_DIV = new String[] {""} ;
      P007B15_A22TBM41_CRF_ITEM_GRP_CD = new String[] {""} ;
      P007B15_A424TBM41_NCM_METADATA_ID = new String[] {""} ;
      P007B15_n424TBM41_NCM_METADATA_ID = new boolean[] {false} ;
      P007B15_A425TBM41_DEL_FLG = new String[] {""} ;
      P007B15_n425TBM41_DEL_FLG = new boolean[] {false} ;
      P007B15_A426TBM41_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007B15_n426TBM41_CRT_DATETIME = new boolean[] {false} ;
      P007B15_A427TBM41_CRT_USER_ID = new String[] {""} ;
      P007B15_n427TBM41_CRT_USER_ID = new boolean[] {false} ;
      P007B15_A428TBM41_CRT_PROG_NM = new String[] {""} ;
      P007B15_n428TBM41_CRT_PROG_NM = new boolean[] {false} ;
      P007B15_A429TBM41_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007B15_n429TBM41_UPD_DATETIME = new boolean[] {false} ;
      P007B15_A430TBM41_UPD_USER_ID = new String[] {""} ;
      P007B15_n430TBM41_UPD_USER_ID = new boolean[] {false} ;
      P007B15_A431TBM41_UPD_PROG_NM = new String[] {""} ;
      P007B15_n431TBM41_UPD_PROG_NM = new boolean[] {false} ;
      P007B15_A432TBM41_UPD_CNT = new long[1] ;
      P007B15_n432TBM41_UPD_CNT = new boolean[] {false} ;
      A21TBM41_CRF_ITEM_GRP_DIV = "" ;
      A22TBM41_CRF_ITEM_GRP_CD = "" ;
      A424TBM41_NCM_METADATA_ID = "" ;
      A425TBM41_DEL_FLG = "" ;
      A426TBM41_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A427TBM41_CRT_USER_ID = "" ;
      A428TBM41_CRT_PROG_NM = "" ;
      A429TBM41_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A430TBM41_UPD_USER_ID = "" ;
      A431TBM41_UPD_PROG_NM = "" ;
      P007B16_A203TBM42_STUDY_ID = new long[1] ;
      P007B16_A204TBM42_DOM_CD = new String[] {""} ;
      P007B16_A905TBM42_DOM_ENM = new String[] {""} ;
      P007B16_n905TBM42_DOM_ENM = new boolean[] {false} ;
      P007B16_A906TBM42_DOM_JNM = new String[] {""} ;
      P007B16_n906TBM42_DOM_JNM = new boolean[] {false} ;
      P007B16_A907TBM42_DOM_GRP_NM = new String[] {""} ;
      P007B16_n907TBM42_DOM_GRP_NM = new boolean[] {false} ;
      P007B16_A908TBM42_NOTE = new String[] {""} ;
      P007B16_n908TBM42_NOTE = new boolean[] {false} ;
      P007B16_A909TBM42_ORDER = new int[1] ;
      P007B16_n909TBM42_ORDER = new boolean[] {false} ;
      P007B16_A893TBM42_DEL_FLG = new String[] {""} ;
      P007B16_n893TBM42_DEL_FLG = new boolean[] {false} ;
      P007B16_A894TBM42_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007B16_n894TBM42_CRT_DATETIME = new boolean[] {false} ;
      P007B16_A895TBM42_CRT_USER_ID = new String[] {""} ;
      P007B16_n895TBM42_CRT_USER_ID = new boolean[] {false} ;
      P007B16_A896TBM42_CRT_PROG_NM = new String[] {""} ;
      P007B16_n896TBM42_CRT_PROG_NM = new boolean[] {false} ;
      P007B16_A897TBM42_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007B16_n897TBM42_UPD_DATETIME = new boolean[] {false} ;
      P007B16_A898TBM42_UPD_USER_ID = new String[] {""} ;
      P007B16_n898TBM42_UPD_USER_ID = new boolean[] {false} ;
      P007B16_A899TBM42_UPD_PROG_NM = new String[] {""} ;
      P007B16_n899TBM42_UPD_PROG_NM = new boolean[] {false} ;
      P007B16_A900TBM42_UPD_CNT = new long[1] ;
      P007B16_n900TBM42_UPD_CNT = new boolean[] {false} ;
      A204TBM42_DOM_CD = "" ;
      A905TBM42_DOM_ENM = "" ;
      A906TBM42_DOM_JNM = "" ;
      A907TBM42_DOM_GRP_NM = "" ;
      A908TBM42_NOTE = "" ;
      A893TBM42_DEL_FLG = "" ;
      A894TBM42_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A895TBM42_CRT_USER_ID = "" ;
      A896TBM42_CRT_PROG_NM = "" ;
      A897TBM42_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A898TBM42_UPD_USER_ID = "" ;
      A899TBM42_UPD_PROG_NM = "" ;
      P007B17_A200TBM43_STUDY_ID = new long[1] ;
      P007B17_A201TBM43_DOM_CD = new String[] {""} ;
      P007B17_A202TBM43_DOM_VAR_NM = new String[] {""} ;
      P007B17_A910TBM43_VAR_DESC = new String[] {""} ;
      P007B17_n910TBM43_VAR_DESC = new boolean[] {false} ;
      P007B17_A911TBM43_SDTM_FLG = new String[] {""} ;
      P007B17_n911TBM43_SDTM_FLG = new boolean[] {false} ;
      P007B17_A912TBM43_CDASH_FLG = new String[] {""} ;
      P007B17_n912TBM43_CDASH_FLG = new boolean[] {false} ;
      P007B17_A913TBM43_INPUT_TYPE_DIV = new String[] {""} ;
      P007B17_n913TBM43_INPUT_TYPE_DIV = new boolean[] {false} ;
      P007B17_A914TBM43_REQUIRED_FLG = new String[] {""} ;
      P007B17_n914TBM43_REQUIRED_FLG = new boolean[] {false} ;
      P007B17_A915TBM43_SAS_FIELD_NM = new String[] {""} ;
      P007B17_n915TBM43_SAS_FIELD_NM = new boolean[] {false} ;
      P007B17_A916TBM43_ODM_DATA_TYPE = new String[] {""} ;
      P007B17_n916TBM43_ODM_DATA_TYPE = new boolean[] {false} ;
      P007B17_A917TBM43_NOTE = new String[] {""} ;
      P007B17_n917TBM43_NOTE = new boolean[] {false} ;
      P007B17_A918TBM43_ORDER = new int[1] ;
      P007B17_n918TBM43_ORDER = new boolean[] {false} ;
      P007B17_A933TBM43_VERSION = new String[] {""} ;
      P007B17_n933TBM43_VERSION = new boolean[] {false} ;
      P007B17_A919TBM43_DEL_FLG = new String[] {""} ;
      P007B17_n919TBM43_DEL_FLG = new boolean[] {false} ;
      P007B17_A920TBM43_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007B17_n920TBM43_CRT_DATETIME = new boolean[] {false} ;
      P007B17_A921TBM43_CRT_USER_ID = new String[] {""} ;
      P007B17_n921TBM43_CRT_USER_ID = new boolean[] {false} ;
      P007B17_A922TBM43_CRT_PROG_NM = new String[] {""} ;
      P007B17_n922TBM43_CRT_PROG_NM = new boolean[] {false} ;
      P007B17_A923TBM43_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007B17_n923TBM43_UPD_DATETIME = new boolean[] {false} ;
      P007B17_A924TBM43_UPD_USER_ID = new String[] {""} ;
      P007B17_n924TBM43_UPD_USER_ID = new boolean[] {false} ;
      P007B17_A925TBM43_UPD_PROG_NM = new String[] {""} ;
      P007B17_n925TBM43_UPD_PROG_NM = new boolean[] {false} ;
      P007B17_A926TBM43_UPD_CNT = new long[1] ;
      P007B17_n926TBM43_UPD_CNT = new boolean[] {false} ;
      A201TBM43_DOM_CD = "" ;
      A202TBM43_DOM_VAR_NM = "" ;
      A910TBM43_VAR_DESC = "" ;
      A911TBM43_SDTM_FLG = "" ;
      A912TBM43_CDASH_FLG = "" ;
      A913TBM43_INPUT_TYPE_DIV = "" ;
      A914TBM43_REQUIRED_FLG = "" ;
      A915TBM43_SAS_FIELD_NM = "" ;
      A916TBM43_ODM_DATA_TYPE = "" ;
      A917TBM43_NOTE = "" ;
      A933TBM43_VERSION = "" ;
      A919TBM43_DEL_FLG = "" ;
      A920TBM43_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A921TBM43_CRT_USER_ID = "" ;
      A922TBM43_CRT_PROG_NM = "" ;
      A923TBM43_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A924TBM43_UPD_USER_ID = "" ;
      A925TBM43_UPD_PROG_NM = "" ;
      P007B18_A946TBM44_CRF_ID = new short[1] ;
      P007B18_A945TBM44_STUDY_ID = new long[1] ;
      P007B18_A947TBM44_CRF_EDA_NO = new byte[1] ;
      P007B18_A948TBM44_VISIT_NO = new int[1] ;
      P007B18_n948TBM44_VISIT_NO = new boolean[] {false} ;
      P007B18_A949TBM44_DEL_FLG = new String[] {""} ;
      P007B18_n949TBM44_DEL_FLG = new boolean[] {false} ;
      P007B18_A950TBM44_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007B18_n950TBM44_CRT_DATETIME = new boolean[] {false} ;
      P007B18_A951TBM44_CRT_USER_ID = new String[] {""} ;
      P007B18_n951TBM44_CRT_USER_ID = new boolean[] {false} ;
      P007B18_A952TBM44_CRT_PROG_NM = new String[] {""} ;
      P007B18_n952TBM44_CRT_PROG_NM = new boolean[] {false} ;
      P007B18_A953TBM44_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007B18_n953TBM44_UPD_DATETIME = new boolean[] {false} ;
      P007B18_A954TBM44_UPD_USER_ID = new String[] {""} ;
      P007B18_n954TBM44_UPD_USER_ID = new boolean[] {false} ;
      P007B18_A955TBM44_UPD_PROG_NM = new String[] {""} ;
      P007B18_n955TBM44_UPD_PROG_NM = new boolean[] {false} ;
      P007B18_A956TBM44_UPD_CNT = new long[1] ;
      P007B18_n956TBM44_UPD_CNT = new boolean[] {false} ;
      A949TBM44_DEL_FLG = "" ;
      A950TBM44_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A951TBM44_CRT_USER_ID = "" ;
      A952TBM44_CRT_PROG_NM = "" ;
      A953TBM44_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A954TBM44_UPD_USER_ID = "" ;
      A955TBM44_UPD_PROG_NM = "" ;
      P007B19_A977TBM45_STUDY_ID = new long[1] ;
      P007B19_A978TBM45_FILTER_NO = new short[1] ;
      P007B19_A980TBM45_FILETR_NM = new String[] {""} ;
      P007B19_n980TBM45_FILETR_NM = new boolean[] {false} ;
      P007B19_A981TBM45_IN_CRF_ID = new String[] {""} ;
      P007B19_n981TBM45_IN_CRF_ID = new boolean[] {false} ;
      P007B19_A982TBM45_DEL_FLG = new String[] {""} ;
      P007B19_n982TBM45_DEL_FLG = new boolean[] {false} ;
      P007B19_A983TBM45_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007B19_n983TBM45_CRT_DATETIME = new boolean[] {false} ;
      P007B19_A984TBM45_CRT_USER_ID = new String[] {""} ;
      P007B19_n984TBM45_CRT_USER_ID = new boolean[] {false} ;
      P007B19_A985TBM45_CRT_PROG_NM = new String[] {""} ;
      P007B19_n985TBM45_CRT_PROG_NM = new boolean[] {false} ;
      P007B19_A986TBM45_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007B19_n986TBM45_UPD_DATETIME = new boolean[] {false} ;
      P007B19_A987TBM45_UPD_USER_ID = new String[] {""} ;
      P007B19_n987TBM45_UPD_USER_ID = new boolean[] {false} ;
      P007B19_A988TBM45_UPD_PROG_NM = new String[] {""} ;
      P007B19_n988TBM45_UPD_PROG_NM = new boolean[] {false} ;
      P007B19_A989TBM45_UPD_CNT = new long[1] ;
      P007B19_n989TBM45_UPD_CNT = new boolean[] {false} ;
      A980TBM45_FILETR_NM = "" ;
      A981TBM45_IN_CRF_ID = "" ;
      A982TBM45_DEL_FLG = "" ;
      A983TBM45_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A984TBM45_CRT_USER_ID = "" ;
      A985TBM45_CRT_PROG_NM = "" ;
      A986TBM45_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A987TBM45_UPD_USER_ID = "" ;
      A988TBM45_UPD_PROG_NM = "" ;
      P007B20_A87TBT01_STUDY_ID = new long[1] ;
      P007B20_A88TBT01_SUBJECT_ID = new int[1] ;
      P007B20_A647TBT01_OUTER_SUBJECT_ID = new String[] {""} ;
      P007B20_n647TBT01_OUTER_SUBJECT_ID = new boolean[] {false} ;
      P007B20_A698TBT01_SITE_ID = new String[] {""} ;
      P007B20_n698TBT01_SITE_ID = new boolean[] {false} ;
      P007B20_A441TBT01_DEL_FLG = new String[] {""} ;
      P007B20_n441TBT01_DEL_FLG = new boolean[] {false} ;
      P007B20_A442TBT01_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007B20_n442TBT01_CRT_DATETIME = new boolean[] {false} ;
      P007B20_A443TBT01_CRT_USER_ID = new String[] {""} ;
      P007B20_n443TBT01_CRT_USER_ID = new boolean[] {false} ;
      P007B20_A444TBT01_CRT_PROG_NM = new String[] {""} ;
      P007B20_n444TBT01_CRT_PROG_NM = new boolean[] {false} ;
      P007B20_A445TBT01_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007B20_n445TBT01_UPD_DATETIME = new boolean[] {false} ;
      P007B20_A446TBT01_UPD_USER_ID = new String[] {""} ;
      P007B20_n446TBT01_UPD_USER_ID = new boolean[] {false} ;
      P007B20_A447TBT01_UPD_PROG_NM = new String[] {""} ;
      P007B20_n447TBT01_UPD_PROG_NM = new boolean[] {false} ;
      P007B20_A448TBT01_UPD_CNT = new long[1] ;
      P007B20_n448TBT01_UPD_CNT = new boolean[] {false} ;
      A647TBT01_OUTER_SUBJECT_ID = "" ;
      A698TBT01_SITE_ID = "" ;
      A441TBT01_DEL_FLG = "" ;
      A442TBT01_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A443TBT01_CRT_USER_ID = "" ;
      A444TBT01_CRT_PROG_NM = "" ;
      A445TBT01_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A446TBT01_UPD_USER_ID = "" ;
      A447TBT01_UPD_PROG_NM = "" ;
      P007B21_A91TBT02_CRF_ID = new short[1] ;
      P007B21_A89TBT02_STUDY_ID = new long[1] ;
      P007B21_A90TBT02_SUBJECT_ID = new int[1] ;
      P007B21_A935TBT02_CRF_EDA_NO = new byte[1] ;
      P007B21_A498TBT02_CRF_LATEST_VERSION = new short[1] ;
      P007B21_n498TBT02_CRF_LATEST_VERSION = new boolean[] {false} ;
      P007B21_A499TBT02_CRF_INPUT_LEVEL = new byte[1] ;
      P007B21_n499TBT02_CRF_INPUT_LEVEL = new boolean[] {false} ;
      P007B21_A648TBT02_LOCK_FLG = new String[] {""} ;
      P007B21_n648TBT02_LOCK_FLG = new boolean[] {false} ;
      P007B21_A649TBT02_LOCK_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007B21_n649TBT02_LOCK_DATETIME = new boolean[] {false} ;
      P007B21_A650TBT02_LOCK_USER_ID = new String[] {""} ;
      P007B21_n650TBT02_LOCK_USER_ID = new boolean[] {false} ;
      P007B21_A651TBT02_LOCK_AUTH_CD = new String[] {""} ;
      P007B21_n651TBT02_LOCK_AUTH_CD = new boolean[] {false} ;
      P007B21_A652TBT02_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007B21_n652TBT02_UPLOAD_DATETIME = new boolean[] {false} ;
      P007B21_A653TBT02_UPLOAD_USER_ID = new String[] {""} ;
      P007B21_n653TBT02_UPLOAD_USER_ID = new boolean[] {false} ;
      P007B21_A654TBT02_UPLOAD_AUTH_CD = new String[] {""} ;
      P007B21_n654TBT02_UPLOAD_AUTH_CD = new boolean[] {false} ;
      P007B21_A655TBT02_DM_ARRIVAL_FLG = new String[] {""} ;
      P007B21_n655TBT02_DM_ARRIVAL_FLG = new boolean[] {false} ;
      P007B21_A656TBT02_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007B21_n656TBT02_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      P007B21_A657TBT02_APPROVAL_FLG = new String[] {""} ;
      P007B21_n657TBT02_APPROVAL_FLG = new boolean[] {false} ;
      P007B21_A658TBT02_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007B21_n658TBT02_APPROVAL_DATETIME = new boolean[] {false} ;
      P007B21_A659TBT02_APPROVAL_USER_ID = new String[] {""} ;
      P007B21_n659TBT02_APPROVAL_USER_ID = new boolean[] {false} ;
      P007B21_A660TBT02_APPROVAL_AUTH_CD = new String[] {""} ;
      P007B21_n660TBT02_APPROVAL_AUTH_CD = new boolean[] {false} ;
      P007B21_A990TBT02_SIGNATURE_FLG = new String[] {""} ;
      P007B21_n990TBT02_SIGNATURE_FLG = new boolean[] {false} ;
      P007B21_A991TBT02_SIGNATURE_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007B21_n991TBT02_SIGNATURE_DATETIME = new boolean[] {false} ;
      P007B21_A992TBT02_SIGNATURE_USER_ID = new String[] {""} ;
      P007B21_n992TBT02_SIGNATURE_USER_ID = new boolean[] {false} ;
      P007B21_A661TBT02_INPUT_END_FLG = new String[] {""} ;
      P007B21_n661TBT02_INPUT_END_FLG = new boolean[] {false} ;
      P007B21_A662TBT02_INPUT_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007B21_n662TBT02_INPUT_END_DATETIME = new boolean[] {false} ;
      P007B21_A663TBT02_INPUT_END_USER_ID = new String[] {""} ;
      P007B21_n663TBT02_INPUT_END_USER_ID = new boolean[] {false} ;
      P007B21_A664TBT02_INPUT_END_AUTH_CD = new String[] {""} ;
      P007B21_n664TBT02_INPUT_END_AUTH_CD = new boolean[] {false} ;
      P007B21_A449TBT02_DEL_FLG = new String[] {""} ;
      P007B21_n449TBT02_DEL_FLG = new boolean[] {false} ;
      P007B21_A450TBT02_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007B21_n450TBT02_CRT_DATETIME = new boolean[] {false} ;
      P007B21_A451TBT02_CRT_USER_ID = new String[] {""} ;
      P007B21_n451TBT02_CRT_USER_ID = new boolean[] {false} ;
      P007B21_A452TBT02_CRT_PROG_NM = new String[] {""} ;
      P007B21_n452TBT02_CRT_PROG_NM = new boolean[] {false} ;
      P007B21_A453TBT02_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007B21_n453TBT02_UPD_DATETIME = new boolean[] {false} ;
      P007B21_A454TBT02_UPD_USER_ID = new String[] {""} ;
      P007B21_n454TBT02_UPD_USER_ID = new boolean[] {false} ;
      P007B21_A455TBT02_UPD_PROG_NM = new String[] {""} ;
      P007B21_n455TBT02_UPD_PROG_NM = new boolean[] {false} ;
      P007B21_A456TBT02_UPD_CNT = new long[1] ;
      P007B21_n456TBT02_UPD_CNT = new boolean[] {false} ;
      A648TBT02_LOCK_FLG = "" ;
      A649TBT02_LOCK_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A650TBT02_LOCK_USER_ID = "" ;
      A651TBT02_LOCK_AUTH_CD = "" ;
      A652TBT02_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A653TBT02_UPLOAD_USER_ID = "" ;
      A654TBT02_UPLOAD_AUTH_CD = "" ;
      A655TBT02_DM_ARRIVAL_FLG = "" ;
      A656TBT02_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A657TBT02_APPROVAL_FLG = "" ;
      A658TBT02_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A659TBT02_APPROVAL_USER_ID = "" ;
      A660TBT02_APPROVAL_AUTH_CD = "" ;
      A990TBT02_SIGNATURE_FLG = "" ;
      A991TBT02_SIGNATURE_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A992TBT02_SIGNATURE_USER_ID = "" ;
      A661TBT02_INPUT_END_FLG = "" ;
      A662TBT02_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A663TBT02_INPUT_END_USER_ID = "" ;
      A664TBT02_INPUT_END_AUTH_CD = "" ;
      A449TBT02_DEL_FLG = "" ;
      A450TBT02_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A451TBT02_CRT_USER_ID = "" ;
      A452TBT02_CRT_PROG_NM = "" ;
      A453TBT02_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A454TBT02_UPD_USER_ID = "" ;
      A455TBT02_UPD_PROG_NM = "" ;
      P007B22_A94TBT11_CRF_ID = new short[1] ;
      P007B22_A92TBT11_STUDY_ID = new long[1] ;
      P007B22_A93TBT11_SUBJECT_ID = new int[1] ;
      P007B22_A936TBT11_CRF_EDA_NO = new byte[1] ;
      P007B22_A95TBT11_CRF_VERSION = new short[1] ;
      P007B22_A665TBT11_CRF_INPUT_LEVEL = new byte[1] ;
      P007B22_n665TBT11_CRF_INPUT_LEVEL = new boolean[] {false} ;
      P007B22_A666TBT11_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007B22_n666TBT11_UPLOAD_DATETIME = new boolean[] {false} ;
      P007B22_A667TBT11_UPLOAD_USER_ID = new String[] {""} ;
      P007B22_n667TBT11_UPLOAD_USER_ID = new boolean[] {false} ;
      P007B22_A668TBT11_UPLOAD_AUTH_CD = new String[] {""} ;
      P007B22_n668TBT11_UPLOAD_AUTH_CD = new boolean[] {false} ;
      P007B22_A669TBT11_DM_ARRIVAL_FLG = new String[] {""} ;
      P007B22_n669TBT11_DM_ARRIVAL_FLG = new boolean[] {false} ;
      P007B22_A670TBT11_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007B22_n670TBT11_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      P007B22_A671TBT11_APPROVAL_FLG = new String[] {""} ;
      P007B22_n671TBT11_APPROVAL_FLG = new boolean[] {false} ;
      P007B22_A672TBT11_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007B22_n672TBT11_APPROVAL_DATETIME = new boolean[] {false} ;
      P007B22_A673TBT11_APPROVAL_USER_ID = new String[] {""} ;
      P007B22_n673TBT11_APPROVAL_USER_ID = new boolean[] {false} ;
      P007B22_A674TBT11_APPROVAL_AUTH_CD = new String[] {""} ;
      P007B22_n674TBT11_APPROVAL_AUTH_CD = new boolean[] {false} ;
      P007B22_A993TBT11_SIGNATURE_FLG = new String[] {""} ;
      P007B22_n993TBT11_SIGNATURE_FLG = new boolean[] {false} ;
      P007B22_A994TBT11_SIGNATURE_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007B22_n994TBT11_SIGNATURE_DATETIME = new boolean[] {false} ;
      P007B22_A995TBT11_SIGNATURE_USER_ID = new String[] {""} ;
      P007B22_n995TBT11_SIGNATURE_USER_ID = new boolean[] {false} ;
      P007B22_A675TBT11_INPUT_END_FLG = new String[] {""} ;
      P007B22_n675TBT11_INPUT_END_FLG = new boolean[] {false} ;
      P007B22_A676TBT11_INPUT_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007B22_n676TBT11_INPUT_END_DATETIME = new boolean[] {false} ;
      P007B22_A677TBT11_INPUT_END_USER_ID = new String[] {""} ;
      P007B22_n677TBT11_INPUT_END_USER_ID = new boolean[] {false} ;
      P007B22_A678TBT11_INPUT_END_AUTH_CD = new String[] {""} ;
      P007B22_n678TBT11_INPUT_END_AUTH_CD = new boolean[] {false} ;
      P007B22_A891TBT11_UPD_RIYU = new String[] {""} ;
      P007B22_n891TBT11_UPD_RIYU = new boolean[] {false} ;
      P007B22_A457TBT11_DEL_FLG = new String[] {""} ;
      P007B22_n457TBT11_DEL_FLG = new boolean[] {false} ;
      P007B22_A458TBT11_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007B22_n458TBT11_CRT_DATETIME = new boolean[] {false} ;
      P007B22_A459TBT11_CRT_USER_ID = new String[] {""} ;
      P007B22_n459TBT11_CRT_USER_ID = new boolean[] {false} ;
      P007B22_A460TBT11_CRT_PROG_NM = new String[] {""} ;
      P007B22_n460TBT11_CRT_PROG_NM = new boolean[] {false} ;
      P007B22_A461TBT11_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007B22_n461TBT11_UPD_DATETIME = new boolean[] {false} ;
      P007B22_A462TBT11_UPD_USER_ID = new String[] {""} ;
      P007B22_n462TBT11_UPD_USER_ID = new boolean[] {false} ;
      P007B22_A463TBT11_UPD_PROG_NM = new String[] {""} ;
      P007B22_n463TBT11_UPD_PROG_NM = new boolean[] {false} ;
      P007B22_A464TBT11_UPD_CNT = new long[1] ;
      P007B22_n464TBT11_UPD_CNT = new boolean[] {false} ;
      A666TBT11_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A667TBT11_UPLOAD_USER_ID = "" ;
      A668TBT11_UPLOAD_AUTH_CD = "" ;
      A669TBT11_DM_ARRIVAL_FLG = "" ;
      A670TBT11_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A671TBT11_APPROVAL_FLG = "" ;
      A672TBT11_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A673TBT11_APPROVAL_USER_ID = "" ;
      A674TBT11_APPROVAL_AUTH_CD = "" ;
      A993TBT11_SIGNATURE_FLG = "" ;
      A994TBT11_SIGNATURE_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A995TBT11_SIGNATURE_USER_ID = "" ;
      A675TBT11_INPUT_END_FLG = "" ;
      A676TBT11_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A677TBT11_INPUT_END_USER_ID = "" ;
      A678TBT11_INPUT_END_AUTH_CD = "" ;
      A891TBT11_UPD_RIYU = "" ;
      A457TBT11_DEL_FLG = "" ;
      A458TBT11_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A459TBT11_CRT_USER_ID = "" ;
      A460TBT11_CRT_PROG_NM = "" ;
      A461TBT11_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A462TBT11_UPD_USER_ID = "" ;
      A463TBT11_UPD_PROG_NM = "" ;
      P007B23_A98TBT12_CRF_ID = new short[1] ;
      P007B23_A96TBT12_STUDY_ID = new long[1] ;
      P007B23_A97TBT12_SUBJECT_ID = new int[1] ;
      P007B23_A937TBT12_CRF_EDA_NO = new byte[1] ;
      P007B23_A99TBT12_CRF_ITEM_GRP_DIV = new String[] {""} ;
      P007B23_A100TBT12_CRF_ITEM_GRP_CD = new String[] {""} ;
      P007B23_A465TBT12_CRF_VALUE = new String[] {""} ;
      P007B23_n465TBT12_CRF_VALUE = new boolean[] {false} ;
      P007B23_A679TBT12_EDIT_FLG = new String[] {""} ;
      P007B23_n679TBT12_EDIT_FLG = new boolean[] {false} ;
      P007B23_A473TBT12_DEL_FLG = new String[] {""} ;
      P007B23_n473TBT12_DEL_FLG = new boolean[] {false} ;
      P007B23_A466TBT12_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007B23_n466TBT12_CRT_DATETIME = new boolean[] {false} ;
      P007B23_A467TBT12_CRT_USER_ID = new String[] {""} ;
      P007B23_n467TBT12_CRT_USER_ID = new boolean[] {false} ;
      P007B23_A468TBT12_CRT_PROG_NM = new String[] {""} ;
      P007B23_n468TBT12_CRT_PROG_NM = new boolean[] {false} ;
      P007B23_A469TBT12_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007B23_n469TBT12_UPD_DATETIME = new boolean[] {false} ;
      P007B23_A470TBT12_UPD_USER_ID = new String[] {""} ;
      P007B23_n470TBT12_UPD_USER_ID = new boolean[] {false} ;
      P007B23_A471TBT12_UPD_PROG_NM = new String[] {""} ;
      P007B23_n471TBT12_UPD_PROG_NM = new boolean[] {false} ;
      P007B23_A472TBT12_UPD_CNT = new long[1] ;
      P007B23_n472TBT12_UPD_CNT = new boolean[] {false} ;
      A99TBT12_CRF_ITEM_GRP_DIV = "" ;
      A100TBT12_CRF_ITEM_GRP_CD = "" ;
      A465TBT12_CRF_VALUE = "" ;
      A679TBT12_EDIT_FLG = "" ;
      A473TBT12_DEL_FLG = "" ;
      A466TBT12_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A467TBT12_CRT_USER_ID = "" ;
      A468TBT12_CRT_PROG_NM = "" ;
      A469TBT12_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A470TBT12_UPD_USER_ID = "" ;
      A471TBT12_UPD_PROG_NM = "" ;
      P007B24_A103TBT13_CRF_ID = new short[1] ;
      P007B24_A101TBT13_STUDY_ID = new long[1] ;
      P007B24_A102TBT13_SUBJECT_ID = new int[1] ;
      P007B24_A938TBT13_CRF_EDA_NO = new byte[1] ;
      P007B24_A104TBT13_CRF_VERSION = new short[1] ;
      P007B24_A105TBT13_CRF_ITEM_GRP_DIV = new String[] {""} ;
      P007B24_A106TBT13_CRF_ITEM_GRP_CD = new String[] {""} ;
      P007B24_A597TBT13_CRF_VALUE = new String[] {""} ;
      P007B24_n597TBT13_CRF_VALUE = new boolean[] {false} ;
      P007B24_A680TBT13_EDIT_FLG = new String[] {""} ;
      P007B24_n680TBT13_EDIT_FLG = new boolean[] {false} ;
      P007B24_A598TBT13_DEL_FLG = new String[] {""} ;
      P007B24_n598TBT13_DEL_FLG = new boolean[] {false} ;
      P007B24_A599TBT13_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007B24_n599TBT13_CRT_DATETIME = new boolean[] {false} ;
      P007B24_A600TBT13_CRT_USER_ID = new String[] {""} ;
      P007B24_n600TBT13_CRT_USER_ID = new boolean[] {false} ;
      P007B24_A601TBT13_CRT_PROG_NM = new String[] {""} ;
      P007B24_n601TBT13_CRT_PROG_NM = new boolean[] {false} ;
      P007B24_A602TBT13_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007B24_n602TBT13_UPD_DATETIME = new boolean[] {false} ;
      P007B24_A603TBT13_UPD_USER_ID = new String[] {""} ;
      P007B24_n603TBT13_UPD_USER_ID = new boolean[] {false} ;
      P007B24_A604TBT13_UPD_PROG_NM = new String[] {""} ;
      P007B24_n604TBT13_UPD_PROG_NM = new boolean[] {false} ;
      P007B24_A605TBT13_UPD_CNT = new long[1] ;
      P007B24_n605TBT13_UPD_CNT = new boolean[] {false} ;
      A105TBT13_CRF_ITEM_GRP_DIV = "" ;
      A106TBT13_CRF_ITEM_GRP_CD = "" ;
      A597TBT13_CRF_VALUE = "" ;
      A680TBT13_EDIT_FLG = "" ;
      A598TBT13_DEL_FLG = "" ;
      A599TBT13_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A600TBT13_CRT_USER_ID = "" ;
      A601TBT13_CRT_PROG_NM = "" ;
      A602TBT13_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A603TBT13_UPD_USER_ID = "" ;
      A604TBT13_UPD_PROG_NM = "" ;
      P007B25_A474TBT14_CRF_ID = new short[1] ;
      P007B25_n474TBT14_CRF_ID = new boolean[] {false} ;
      P007B25_A140TBT14_STUDY_ID = new long[1] ;
      P007B25_A142TBT14_SUBJECT_ID = new int[1] ;
      P007B25_A198TBT14_MEMO_NO = new short[1] ;
      P007B25_A941TBT14_CRF_EDA_NO = new byte[1] ;
      P007B25_n941TBT14_CRF_EDA_NO = new boolean[] {false} ;
      P007B25_A475TBT14_CRF_VERSION = new short[1] ;
      P007B25_n475TBT14_CRF_VERSION = new boolean[] {false} ;
      P007B25_A901TBT14_MEMO_KBN = new String[] {""} ;
      P007B25_n901TBT14_MEMO_KBN = new boolean[] {false} ;
      P007B25_A477TBT14_MEMO = new String[] {""} ;
      P007B25_n477TBT14_MEMO = new boolean[] {false} ;
      P007B25_A929TBT14_REQUEST_SITE_ID = new String[] {""} ;
      P007B25_n929TBT14_REQUEST_SITE_ID = new boolean[] {false} ;
      P007B25_A930TBT14_REQUEST_AUTH_CD = new String[] {""} ;
      P007B25_n930TBT14_REQUEST_AUTH_CD = new boolean[] {false} ;
      P007B25_A931TBT14_CRT_AUTH_CD = new String[] {""} ;
      P007B25_n931TBT14_CRT_AUTH_CD = new boolean[] {false} ;
      P007B25_A927TBT14_KAKUNIN_FLG = new String[] {""} ;
      P007B25_n927TBT14_KAKUNIN_FLG = new boolean[] {false} ;
      P007B25_A928TBT14_KAKUNIN_USER_ID = new String[] {""} ;
      P007B25_n928TBT14_KAKUNIN_USER_ID = new boolean[] {false} ;
      P007B25_A934TBT14_KAKUNIN_COMMENT = new String[] {""} ;
      P007B25_n934TBT14_KAKUNIN_COMMENT = new boolean[] {false} ;
      P007B25_A902TBT14_KANRYO_FLG = new String[] {""} ;
      P007B25_n902TBT14_KANRYO_FLG = new boolean[] {false} ;
      P007B25_A479TBT14_DEL_FLG = new String[] {""} ;
      P007B25_n479TBT14_DEL_FLG = new boolean[] {false} ;
      P007B25_A480TBT14_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007B25_n480TBT14_CRT_DATETIME = new boolean[] {false} ;
      P007B25_A481TBT14_CRT_USER_ID = new String[] {""} ;
      P007B25_n481TBT14_CRT_USER_ID = new boolean[] {false} ;
      P007B25_A482TBT14_CRT_PROG_NM = new String[] {""} ;
      P007B25_n482TBT14_CRT_PROG_NM = new boolean[] {false} ;
      P007B25_A483TBT14_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007B25_n483TBT14_UPD_DATETIME = new boolean[] {false} ;
      P007B25_A484TBT14_UPD_USER_ID = new String[] {""} ;
      P007B25_n484TBT14_UPD_USER_ID = new boolean[] {false} ;
      P007B25_A485TBT14_UPD_PROG_NM = new String[] {""} ;
      P007B25_n485TBT14_UPD_PROG_NM = new boolean[] {false} ;
      P007B25_A486TBT14_UPD_CNT = new long[1] ;
      P007B25_n486TBT14_UPD_CNT = new boolean[] {false} ;
      A901TBT14_MEMO_KBN = "" ;
      A477TBT14_MEMO = "" ;
      A929TBT14_REQUEST_SITE_ID = "" ;
      A930TBT14_REQUEST_AUTH_CD = "" ;
      A931TBT14_CRT_AUTH_CD = "" ;
      A927TBT14_KAKUNIN_FLG = "" ;
      A928TBT14_KAKUNIN_USER_ID = "" ;
      A934TBT14_KAKUNIN_COMMENT = "" ;
      A902TBT14_KANRYO_FLG = "" ;
      A479TBT14_DEL_FLG = "" ;
      A480TBT14_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A481TBT14_CRT_USER_ID = "" ;
      A482TBT14_CRT_PROG_NM = "" ;
      A483TBT14_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A484TBT14_UPD_USER_ID = "" ;
      A485TBT14_UPD_PROG_NM = "" ;
      P007B26_A155TBT15_CRF_ID = new short[1] ;
      P007B26_n155TBT15_CRF_ID = new boolean[] {false} ;
      P007B26_A149TBT15_STUDY_ID = new long[1] ;
      P007B26_A151TBT15_SUBJECT_ID = new int[1] ;
      P007B26_A199TBT15_MEMO_NO = new short[1] ;
      P007B26_A942TBT15_CRF_EDA_NO = new byte[1] ;
      P007B26_n942TBT15_CRF_EDA_NO = new boolean[] {false} ;
      P007B26_A157TBT15_CRF_VERSION = new short[1] ;
      P007B26_n157TBT15_CRF_VERSION = new boolean[] {false} ;
      P007B26_A903TBT15_CRF_ITEM_GRP_DIV = new String[] {""} ;
      P007B26_n903TBT15_CRF_ITEM_GRP_DIV = new boolean[] {false} ;
      P007B26_A904TBT15_CRF_ITEM_GRP_CD = new String[] {""} ;
      P007B26_n904TBT15_CRF_ITEM_GRP_CD = new boolean[] {false} ;
      P007B26_A488TBT15_DEL_FLG = new String[] {""} ;
      P007B26_n488TBT15_DEL_FLG = new boolean[] {false} ;
      P007B26_A489TBT15_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007B26_n489TBT15_CRT_DATETIME = new boolean[] {false} ;
      P007B26_A490TBT15_CRT_USER_ID = new String[] {""} ;
      P007B26_n490TBT15_CRT_USER_ID = new boolean[] {false} ;
      P007B26_A491TBT15_CRT_PROG_NM = new String[] {""} ;
      P007B26_n491TBT15_CRT_PROG_NM = new boolean[] {false} ;
      P007B26_A492TBT15_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007B26_n492TBT15_UPD_DATETIME = new boolean[] {false} ;
      P007B26_A493TBT15_UPD_USER_ID = new String[] {""} ;
      P007B26_n493TBT15_UPD_USER_ID = new boolean[] {false} ;
      P007B26_A494TBT15_UPD_PROG_NM = new String[] {""} ;
      P007B26_n494TBT15_UPD_PROG_NM = new boolean[] {false} ;
      P007B26_A495TBT15_UPD_CNT = new long[1] ;
      P007B26_n495TBT15_UPD_CNT = new boolean[] {false} ;
      A903TBT15_CRF_ITEM_GRP_DIV = "" ;
      A904TBT15_CRF_ITEM_GRP_CD = "" ;
      A488TBT15_DEL_FLG = "" ;
      A489TBT15_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A490TBT15_CRT_USER_ID = "" ;
      A491TBT15_CRT_PROG_NM = "" ;
      A492TBT15_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A493TBT15_UPD_USER_ID = "" ;
      A494TBT15_UPD_PROG_NM = "" ;
      AV18W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      GXv_SdtA_LOGIN_SDT3 = new SdtA_LOGIN_SDT [1] ;
      AV27W_ERRCD = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV29W_FILE_PATH = "" ;
      GXv_char2 = new String [1] ;
      GXv_char4 = new String [1] ;
      AV37W_ZIP_FILENAME = "" ;
      AV36W_ZIP_FILE_PATH = "" ;
      AV38WeZipFile = new SdtWeZipFile(remoteHandle, context);
      AV39W_FILE = new com.genexus.util.GXFile();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b406_pc01_design_export_csv__default(),
         new Object[] {
             new Object[] {
            P007B2_A63TBM21_STUDY_ID, P007B2_A367TBM21_STUDY_NM, P007B2_n367TBM21_STUDY_NM, P007B2_A530TBM21_OUTER_STUDY_ID, P007B2_n530TBM21_OUTER_STUDY_ID, P007B2_A531TBM21_PROC_NM, P007B2_n531TBM21_PROC_NM, P007B2_A368TBM21_NOTE, P007B2_n368TBM21_NOTE, P007B2_A607TBM21_STATUS,
            P007B2_n607TBM21_STATUS, P007B2_A369TBM21_DEL_FLG, P007B2_n369TBM21_DEL_FLG, P007B2_A370TBM21_CRT_DATETIME, P007B2_n370TBM21_CRT_DATETIME, P007B2_A371TBM21_CRT_USER_ID, P007B2_n371TBM21_CRT_USER_ID, P007B2_A372TBM21_CRT_PROG_NM, P007B2_n372TBM21_CRT_PROG_NM, P007B2_A373TBM21_UPD_DATETIME,
            P007B2_n373TBM21_UPD_DATETIME, P007B2_A374TBM21_UPD_USER_ID, P007B2_n374TBM21_UPD_USER_ID, P007B2_A375TBM21_UPD_PROG_NM, P007B2_n375TBM21_UPD_PROG_NM, P007B2_A376TBM21_UPD_CNT, P007B2_n376TBM21_UPD_CNT
            }
            , new Object[] {
            P007B3_A17TBM22_STUDY_ID, P007B3_A18TBM22_SITE_ID, P007B3_A377TBM22_DEL_FLG, P007B3_n377TBM22_DEL_FLG, P007B3_A378TBM22_CRT_DATETIME, P007B3_n378TBM22_CRT_DATETIME, P007B3_A379TBM22_CRT_USER_ID, P007B3_n379TBM22_CRT_USER_ID, P007B3_A380TBM22_CRT_PROG_NM, P007B3_n380TBM22_CRT_PROG_NM,
            P007B3_A381TBM22_UPD_DATETIME, P007B3_n381TBM22_UPD_DATETIME, P007B3_A382TBM22_UPD_USER_ID, P007B3_n382TBM22_UPD_USER_ID, P007B3_A383TBM22_UPD_PROG_NM, P007B3_n383TBM22_UPD_PROG_NM, P007B3_A384TBM22_UPD_CNT, P007B3_n384TBM22_UPD_CNT
            }
            , new Object[] {
            P007B4_A107TBM23_STUDY_ID, P007B4_A108TBM23_USER_ID, P007B4_A109TBM23_STYDY_AUTH_CD, P007B4_A385TBM23_DEL_FLG, P007B4_n385TBM23_DEL_FLG, P007B4_A386TBM23_CRT_DATETIME, P007B4_n386TBM23_CRT_DATETIME, P007B4_A387TBM23_CRT_USER_ID, P007B4_n387TBM23_CRT_USER_ID, P007B4_A388TBM23_CRT_PROG_NM,
            P007B4_n388TBM23_CRT_PROG_NM, P007B4_A389TBM23_UPD_DATETIME, P007B4_n389TBM23_UPD_DATETIME, P007B4_A390TBM23_UPD_USER_ID, P007B4_n390TBM23_UPD_USER_ID, P007B4_A391TBM23_UPD_PROG_NM, P007B4_n391TBM23_UPD_PROG_NM, P007B4_A392TBM23_UPD_CNT, P007B4_n392TBM23_UPD_CNT
            }
            , new Object[] {
            P007B5_A64TBM24_STUDY_ID, P007B5_A65TBM24_DOM_CD, P007B5_A66TBM24_DOM_VAR_NM, P007B5_A702TBM24_DOM_ITM_GRP_OID, P007B5_n702TBM24_DOM_ITM_GRP_OID, P007B5_A703TBM24_DOM_ITM_GRP_ATTR_SEQ, P007B5_n703TBM24_DOM_ITM_GRP_ATTR_SEQ, P007B5_A704TBM24_DOM_ITM_GRP_ROWNO, P007B5_n704TBM24_DOM_ITM_GRP_ROWNO, P007B5_A705TBM24_CRF_ITEM_NM,
            P007B5_n705TBM24_CRF_ITEM_NM, P007B5_A67TBM24_CRF_ITEM_DIV, P007B5_A635TBM24_IDENTIFICATION_CD, P007B5_n635TBM24_IDENTIFICATION_CD, P007B5_A636TBM24_TEXT_MAXLENGTH, P007B5_n636TBM24_TEXT_MAXLENGTH, P007B5_A637TBM24_TEXT_MAXROWS, P007B5_n637TBM24_TEXT_MAXROWS, P007B5_A638TBM24_DECIMAL_DIGITS, P007B5_n638TBM24_DECIMAL_DIGITS,
            P007B5_A639TBM24_TEXT, P007B5_n639TBM24_TEXT, P007B5_A640TBM24_FIXED_VALUE, P007B5_n640TBM24_FIXED_VALUE, P007B5_A641TBM24_CHK_FALSE_INNER_VALUE, P007B5_n641TBM24_CHK_FALSE_INNER_VALUE, P007B5_A706TBM24_REQUIRED_INPUT_FLG, P007B5_n706TBM24_REQUIRED_INPUT_FLG, P007B5_A707TBM24_MIN_VALUE, P007B5_n707TBM24_MIN_VALUE,
            P007B5_A708TBM24_MAX_VALUE, P007B5_n708TBM24_MAX_VALUE, P007B5_A543TBM24_ORDER, P007B5_n543TBM24_ORDER, P007B5_A544TBM24_DEL_FLG, P007B5_n544TBM24_DEL_FLG, P007B5_A545TBM24_CRT_DATETIME, P007B5_n545TBM24_CRT_DATETIME, P007B5_A546TBM24_CRT_USER_ID, P007B5_n546TBM24_CRT_USER_ID,
            P007B5_A547TBM24_CRT_PROG_NM, P007B5_n547TBM24_CRT_PROG_NM, P007B5_A548TBM24_UPD_DATETIME, P007B5_n548TBM24_UPD_DATETIME, P007B5_A549TBM24_UPD_USER_ID, P007B5_n549TBM24_UPD_USER_ID, P007B5_A550TBM24_UPD_PROG_NM, P007B5_n550TBM24_UPD_PROG_NM, P007B5_A551TBM24_UPD_CNT, P007B5_n551TBM24_UPD_CNT
            }
            , new Object[] {
            P007B6_A23TBM25_STUDY_ID, P007B6_A24TBM25_LIST_CD, P007B6_A552TBM25_LIST_NM, P007B6_n552TBM25_LIST_NM, P007B6_A553TBM25_DEL_FLG, P007B6_n553TBM25_DEL_FLG, P007B6_A554TBM25_CRT_DATETIME, P007B6_n554TBM25_CRT_DATETIME, P007B6_A555TBM25_CRT_USER_ID, P007B6_n555TBM25_CRT_USER_ID,
            P007B6_A556TBM25_CRT_PROG_NM, P007B6_n556TBM25_CRT_PROG_NM, P007B6_A557TBM25_UPD_DATETIME, P007B6_n557TBM25_UPD_DATETIME, P007B6_A558TBM25_UPD_USER_ID, P007B6_n558TBM25_UPD_USER_ID, P007B6_A559TBM25_UPD_PROG_NM, P007B6_n559TBM25_UPD_PROG_NM, P007B6_A560TBM25_UPD_CNT, P007B6_n560TBM25_UPD_CNT
            }
            , new Object[] {
            P007B7_A25TBM26_STUDY_ID, P007B7_A26TBM26_LIST_CD, P007B7_A27TBM26_LIST_ITEM_NO, P007B7_A561TBM26_LIST_ITEM_NAME, P007B7_n561TBM26_LIST_ITEM_NAME, P007B7_A562TBM26_INNER_VALUE, P007B7_n562TBM26_INNER_VALUE, P007B7_A563TBM26_DEL_FLG, P007B7_n563TBM26_DEL_FLG, P007B7_A564TBM26_CRT_DATETIME,
            P007B7_n564TBM26_CRT_DATETIME, P007B7_A565TBM26_CRT_USER_ID, P007B7_n565TBM26_CRT_USER_ID, P007B7_A566TBM26_CRT_PROG_NM, P007B7_n566TBM26_CRT_PROG_NM, P007B7_A567TBM26_UPD_DATETIME, P007B7_n567TBM26_UPD_DATETIME, P007B7_A568TBM26_UPD_USER_ID, P007B7_n568TBM26_UPD_USER_ID, P007B7_A569TBM26_UPD_PROG_NM,
            P007B7_n569TBM26_UPD_PROG_NM, P007B7_A570TBM26_UPD_CNT, P007B7_n570TBM26_UPD_CNT
            }
            , new Object[] {
            P007B8_A69TBM31_CRF_ID, P007B8_A68TBM31_STUDY_ID, P007B8_A393TBM31_CRF_NM, P007B8_n393TBM31_CRF_NM, P007B8_A642TBM31_CRF_SNM, P007B8_n642TBM31_CRF_SNM, P007B8_A394TBM31_GRID_SIZE, P007B8_n394TBM31_GRID_SIZE, P007B8_A528TBM31_DEF_VISIT_NO, P007B8_n528TBM31_DEF_VISIT_NO,
            P007B8_A529TBM31_DEF_DOMAIN_CD, P007B8_n529TBM31_DEF_DOMAIN_CD, P007B8_A643TBM31_STATUS, P007B8_n643TBM31_STATUS, P007B8_A396TBM31_NOTE, P007B8_n396TBM31_NOTE, P007B8_A943TBM31_REPEAT_FLG, P007B8_n943TBM31_REPEAT_FLG, P007B8_A944TBM31_REPEAT_MAX, P007B8_n944TBM31_REPEAT_MAX,
            P007B8_A979TBM31_DM_EXCP_NO_DISP_FLG, P007B8_n979TBM31_DM_EXCP_NO_DISP_FLG, P007B8_A397TBM31_DEL_FLG, P007B8_n397TBM31_DEL_FLG, P007B8_A398TBM31_CRT_DATETIME, P007B8_n398TBM31_CRT_DATETIME, P007B8_A399TBM31_CRT_USER_ID, P007B8_n399TBM31_CRT_USER_ID, P007B8_A400TBM31_CRT_PROG_NM, P007B8_n400TBM31_CRT_PROG_NM,
            P007B8_A401TBM31_UPD_DATETIME, P007B8_n401TBM31_UPD_DATETIME, P007B8_A402TBM31_UPD_USER_ID, P007B8_n402TBM31_UPD_USER_ID, P007B8_A403TBM31_UPD_PROG_NM, P007B8_n403TBM31_UPD_PROG_NM, P007B8_A404TBM31_UPD_CNT, P007B8_n404TBM31_UPD_CNT, P007B8_A395TBM31_ORDER, P007B8_n395TBM31_ORDER
            }
            , new Object[] {
            P007B9_A71TBM32_CRF_ID, P007B9_A70TBM32_STUDY_ID, P007B9_A72TBM32_CRF_ITEM_CD, P007B9_A405TBM32_CRF_ITEM_NM, P007B9_n405TBM32_CRF_ITEM_NM, P007B9_A74TBM32_CRF_ITEM_DIV, P007B9_n74TBM32_CRF_ITEM_DIV, P007B9_A73TBM32_CRF_ITEM_GRP_CD, P007B9_n73TBM32_CRF_ITEM_GRP_CD, P007B9_A507TBM32_CRF_ITEM_GRP_ORDER,
            P007B9_n507TBM32_CRF_ITEM_GRP_ORDER, P007B9_A508TBM32_LOCATION_X, P007B9_n508TBM32_LOCATION_X, P007B9_A509TBM32_LOCATION_Y, P007B9_n509TBM32_LOCATION_Y, P007B9_A510TBM32_LOCATION_X2, P007B9_n510TBM32_LOCATION_X2, P007B9_A511TBM32_LOCATION_Y2, P007B9_n511TBM32_LOCATION_Y2, P007B9_A512TBM32_TEXT_ALIGN_DIV,
            P007B9_n512TBM32_TEXT_ALIGN_DIV, P007B9_A516TBM32_TEXT_MAXROWS, P007B9_n516TBM32_TEXT_MAXROWS, P007B9_A517TBM32_TEXT_MAXLENGTH, P007B9_n517TBM32_TEXT_MAXLENGTH, P007B9_A518TBM32_DECIMAL_DIGITS, P007B9_n518TBM32_DECIMAL_DIGITS, P007B9_A522TBM32_CHK_TRUE_INNER_VALUE, P007B9_n522TBM32_CHK_TRUE_INNER_VALUE, P007B9_A523TBM32_CHK_FALSE_INNER_VALUE,
            P007B9_n523TBM32_CHK_FALSE_INNER_VALUE, P007B9_A527TBM32_FIXED_VALUE, P007B9_n527TBM32_FIXED_VALUE, P007B9_A525TBM32_LIST_CD, P007B9_n525TBM32_LIST_CD, P007B9_A526TBM32_IMAGE_CD, P007B9_n526TBM32_IMAGE_CD, P007B9_A524TBM32_TEXT, P007B9_n524TBM32_TEXT, P007B9_A513TBM32_FONT_SIZE,
            P007B9_n513TBM32_FONT_SIZE, P007B9_A514TBM32_FONT_UL_FLG, P007B9_n514TBM32_FONT_UL_FLG, P007B9_A515TBM32_FONT_COLOR_DIV, P007B9_n515TBM32_FONT_COLOR_DIV, P007B9_A521TBM32_LINE_SIZE_DIV, P007B9_n521TBM32_LINE_SIZE_DIV, P007B9_A689TBM32_LINE_COLOR_DIV, P007B9_n689TBM32_LINE_COLOR_DIV, P007B9_A519TBM32_LINE_START_POINT_DIV,
            P007B9_n519TBM32_LINE_START_POINT_DIV, P007B9_A520TBM32_LINE_END_POINT_DIV, P007B9_n520TBM32_LINE_END_POINT_DIV, P007B9_A690TBM32_LINE_ANGLE, P007B9_n690TBM32_LINE_ANGLE, P007B9_A644TBM32_AUTH_LVL_MIN, P007B9_n644TBM32_AUTH_LVL_MIN, P007B9_A645TBM32_ZORDER, P007B9_n645TBM32_ZORDER, P007B9_A691TBM32_TAB_ORDER,
            P007B9_n691TBM32_TAB_ORDER, P007B9_A692TBM32_TABSTOP_FLG, P007B9_n692TBM32_TABSTOP_FLG, P007B9_A693TBM32_REQUIRED_INPUT_FLG, P007B9_n693TBM32_REQUIRED_INPUT_FLG, P007B9_A694TBM32_MIN_VALUE, P007B9_n694TBM32_MIN_VALUE, P007B9_A695TBM32_MAX_VALUE, P007B9_n695TBM32_MAX_VALUE, P007B9_A406TBM32_CRF_ITEM_NOTE,
            P007B9_n406TBM32_CRF_ITEM_NOTE, P007B9_A774TBM32_REF_CRF_ID, P007B9_n774TBM32_REF_CRF_ID, P007B9_A775TBM32_REF_CRF_ITEM_CD, P007B9_n775TBM32_REF_CRF_ITEM_CD, P007B9_A75TBM32_DEL_FLG, P007B9_n75TBM32_DEL_FLG, P007B9_A407TBM32_CRT_DATETIME, P007B9_n407TBM32_CRT_DATETIME, P007B9_A408TBM32_CRT_USER_ID,
            P007B9_n408TBM32_CRT_USER_ID, P007B9_A409TBM32_CRT_PROG_NM, P007B9_n409TBM32_CRT_PROG_NM, P007B9_A410TBM32_UPD_DATETIME, P007B9_n410TBM32_UPD_DATETIME, P007B9_A411TBM32_UPD_USER_ID, P007B9_n411TBM32_UPD_USER_ID, P007B9_A412TBM32_UPD_PROG_NM, P007B9_n412TBM32_UPD_PROG_NM, P007B9_A413TBM32_UPD_CNT,
            P007B9_n413TBM32_UPD_CNT
            }
            , new Object[] {
            P007B10_A77TBM33_CRF_ID, P007B10_A76TBM33_STUDY_ID, P007B10_A78TBM33_COND_NO, P007B10_A502TBM33_COND_NM, P007B10_n502TBM33_COND_NM, P007B10_A414TBM33_EXPRESSION, P007B10_n414TBM33_EXPRESSION, P007B10_A503TBM33_COND_DIV, P007B10_n503TBM33_COND_DIV, P007B10_A504TBM33_CRF_ITEM_CD,
            P007B10_n504TBM33_CRF_ITEM_CD, P007B10_A415TBM33_PRIOR_NO, P007B10_n415TBM33_PRIOR_NO, P007B10_A505TBM33_ERR_DIV, P007B10_n505TBM33_ERR_DIV, P007B10_A506TBM33_ERR_MSG, P007B10_n506TBM33_ERR_MSG, P007B10_A646TBM33_ENABLED_FLG, P007B10_n646TBM33_ENABLED_FLG, P007B10_A696TBM33_REQUIRED_INPUT_FLG,
            P007B10_n696TBM33_REQUIRED_INPUT_FLG, P007B10_A697TBM33_NUMERIC_RANGE_FLG, P007B10_n697TBM33_NUMERIC_RANGE_FLG, P007B10_A416TBM33_DEL_FLG, P007B10_n416TBM33_DEL_FLG, P007B10_A417TBM33_CRT_DATETIME, P007B10_n417TBM33_CRT_DATETIME, P007B10_A418TBM33_CRT_USER_ID, P007B10_n418TBM33_CRT_USER_ID, P007B10_A419TBM33_CRT_PROG_NM,
            P007B10_n419TBM33_CRT_PROG_NM, P007B10_A420TBM33_UPD_DATETIME, P007B10_n420TBM33_UPD_DATETIME, P007B10_A421TBM33_UPD_USER_ID, P007B10_n421TBM33_UPD_USER_ID, P007B10_A422TBM33_UPD_PROG_NM, P007B10_n422TBM33_UPD_PROG_NM, P007B10_A423TBM33_UPD_CNT, P007B10_n423TBM33_UPD_CNT
            }
            , new Object[] {
            P007B11_A29TBM34_CRF_ID, P007B11_A28TBM34_STUDY_ID, P007B11_A30TBM34_STYDY_AUTH_CD, P007B11_A571TBM34_DISPLAY_FLG, P007B11_n571TBM34_DISPLAY_FLG, P007B11_A572TBM34_DEL_FLG, P007B11_n572TBM34_DEL_FLG, P007B11_A573TBM34_CRT_DATETIME, P007B11_n573TBM34_CRT_DATETIME, P007B11_A574TBM34_CRT_USER_ID,
            P007B11_n574TBM34_CRT_USER_ID, P007B11_A575TBM34_CRT_PROG_NM, P007B11_n575TBM34_CRT_PROG_NM, P007B11_A576TBM34_UPD_DATETIME, P007B11_n576TBM34_UPD_DATETIME, P007B11_A577TBM34_UPD_USER_ID, P007B11_n577TBM34_UPD_USER_ID, P007B11_A578TBM34_UPD_PROG_NM, P007B11_n578TBM34_UPD_PROG_NM, P007B11_A579TBM34_UPD_CNT,
            P007B11_n579TBM34_UPD_CNT
            }
            , new Object[] {
            P007B12_A32TBM35_CRF_ID, P007B12_A31TBM35_STUDY_ID, P007B12_A33TBM35_CRF_ITEM_CD, P007B12_A34TBM35_STUDY_AUTH_CD, P007B12_A580TBM35_DISPLAY_FLG, P007B12_n580TBM35_DISPLAY_FLG, P007B12_A581TBM35_DEL_FLG, P007B12_n581TBM35_DEL_FLG, P007B12_A582TBM35_CRT_DATETIME, P007B12_n582TBM35_CRT_DATETIME,
            P007B12_A583TBM35_CRT_USER_ID, P007B12_n583TBM35_CRT_USER_ID, P007B12_A584TBM35_CRT_PROG_NM, P007B12_n584TBM35_CRT_PROG_NM, P007B12_A585TBM35_UPD_DATETIME, P007B12_n585TBM35_UPD_DATETIME, P007B12_A586TBM35_UPD_USER_ID, P007B12_n586TBM35_UPD_USER_ID, P007B12_A587TBM35_UPD_PROG_NM, P007B12_n587TBM35_UPD_PROG_NM,
            P007B12_A588TBM35_UPD_CNT, P007B12_n588TBM35_UPD_CNT
            }
            , new Object[] {
            P007B13_A36TBM36_CRF_ID, P007B13_A35TBM36_STUDY_ID, P007B13_A37TBM36_COND_NO, P007B13_A38TBM36_SELECT_CRF_ID, P007B13_A589TBM36_DEL_FLG, P007B13_n589TBM36_DEL_FLG, P007B13_A590TBM36_CRT_DATETIME, P007B13_n590TBM36_CRT_DATETIME, P007B13_A591TBM36_CRT_USER_ID, P007B13_n591TBM36_CRT_USER_ID,
            P007B13_A592TBM36_CRT_PROG_NM, P007B13_n592TBM36_CRT_PROG_NM, P007B13_A593TBM36_UPD_DATETIME, P007B13_n593TBM36_UPD_DATETIME, P007B13_A594TBM36_UPD_USER_ID, P007B13_n594TBM36_UPD_USER_ID, P007B13_A595TBM36_UPD_PROG_NM, P007B13_n595TBM36_UPD_PROG_NM, P007B13_A596TBM36_UPD_CNT, P007B13_n596TBM36_UPD_CNT
            }
            , new Object[] {
            P007B14_A80TBM37_CRF_ID, P007B14_A79TBM37_STUDY_ID, P007B14_A81TBM37_CRF_ITEM_GRP_DIV, P007B14_A82TBM37_CRF_ITEM_GRP_CD, P007B14_A83TBM37_VISIT_NO, P007B14_n83TBM37_VISIT_NO, P007B14_A84TBM37_DOM_CD, P007B14_n84TBM37_DOM_CD, P007B14_A500TBM37_DOM_VAR_NM, P007B14_n500TBM37_DOM_VAR_NM,
            P007B14_A85TBM37_DOM_ITM_GRP_OID, P007B14_n85TBM37_DOM_ITM_GRP_OID, P007B14_A501TBM37_DOM_ITM_GRP_ATTR_SEQ, P007B14_n501TBM37_DOM_ITM_GRP_ATTR_SEQ, P007B14_A86TBM37_DOM_ITM_GRP_ROWNO, P007B14_n86TBM37_DOM_ITM_GRP_ROWNO, P007B14_A433TBM37_DEL_FLG, P007B14_n433TBM37_DEL_FLG, P007B14_A434TBM37_CRT_DATETIME, P007B14_n434TBM37_CRT_DATETIME,
            P007B14_A435TBM37_CRT_USER_ID, P007B14_n435TBM37_CRT_USER_ID, P007B14_A436TBM37_CRT_PROG_NM, P007B14_n436TBM37_CRT_PROG_NM, P007B14_A437TBM37_UPD_DATETIME, P007B14_n437TBM37_UPD_DATETIME, P007B14_A438TBM37_UPD_USER_ID, P007B14_n438TBM37_UPD_USER_ID, P007B14_A439TBM37_UPD_PROG_NM, P007B14_n439TBM37_UPD_PROG_NM,
            P007B14_A440TBM37_UPD_CNT, P007B14_n440TBM37_UPD_CNT
            }
            , new Object[] {
            P007B15_A20TBM41_CRF_ID, P007B15_A19TBM41_STUDY_ID, P007B15_A21TBM41_CRF_ITEM_GRP_DIV, P007B15_A22TBM41_CRF_ITEM_GRP_CD, P007B15_A424TBM41_NCM_METADATA_ID, P007B15_n424TBM41_NCM_METADATA_ID, P007B15_A425TBM41_DEL_FLG, P007B15_n425TBM41_DEL_FLG, P007B15_A426TBM41_CRT_DATETIME, P007B15_n426TBM41_CRT_DATETIME,
            P007B15_A427TBM41_CRT_USER_ID, P007B15_n427TBM41_CRT_USER_ID, P007B15_A428TBM41_CRT_PROG_NM, P007B15_n428TBM41_CRT_PROG_NM, P007B15_A429TBM41_UPD_DATETIME, P007B15_n429TBM41_UPD_DATETIME, P007B15_A430TBM41_UPD_USER_ID, P007B15_n430TBM41_UPD_USER_ID, P007B15_A431TBM41_UPD_PROG_NM, P007B15_n431TBM41_UPD_PROG_NM,
            P007B15_A432TBM41_UPD_CNT, P007B15_n432TBM41_UPD_CNT
            }
            , new Object[] {
            P007B16_A203TBM42_STUDY_ID, P007B16_A204TBM42_DOM_CD, P007B16_A905TBM42_DOM_ENM, P007B16_n905TBM42_DOM_ENM, P007B16_A906TBM42_DOM_JNM, P007B16_n906TBM42_DOM_JNM, P007B16_A907TBM42_DOM_GRP_NM, P007B16_n907TBM42_DOM_GRP_NM, P007B16_A908TBM42_NOTE, P007B16_n908TBM42_NOTE,
            P007B16_A909TBM42_ORDER, P007B16_n909TBM42_ORDER, P007B16_A893TBM42_DEL_FLG, P007B16_n893TBM42_DEL_FLG, P007B16_A894TBM42_CRT_DATETIME, P007B16_n894TBM42_CRT_DATETIME, P007B16_A895TBM42_CRT_USER_ID, P007B16_n895TBM42_CRT_USER_ID, P007B16_A896TBM42_CRT_PROG_NM, P007B16_n896TBM42_CRT_PROG_NM,
            P007B16_A897TBM42_UPD_DATETIME, P007B16_n897TBM42_UPD_DATETIME, P007B16_A898TBM42_UPD_USER_ID, P007B16_n898TBM42_UPD_USER_ID, P007B16_A899TBM42_UPD_PROG_NM, P007B16_n899TBM42_UPD_PROG_NM, P007B16_A900TBM42_UPD_CNT, P007B16_n900TBM42_UPD_CNT
            }
            , new Object[] {
            P007B17_A200TBM43_STUDY_ID, P007B17_A201TBM43_DOM_CD, P007B17_A202TBM43_DOM_VAR_NM, P007B17_A910TBM43_VAR_DESC, P007B17_n910TBM43_VAR_DESC, P007B17_A911TBM43_SDTM_FLG, P007B17_n911TBM43_SDTM_FLG, P007B17_A912TBM43_CDASH_FLG, P007B17_n912TBM43_CDASH_FLG, P007B17_A913TBM43_INPUT_TYPE_DIV,
            P007B17_n913TBM43_INPUT_TYPE_DIV, P007B17_A914TBM43_REQUIRED_FLG, P007B17_n914TBM43_REQUIRED_FLG, P007B17_A915TBM43_SAS_FIELD_NM, P007B17_n915TBM43_SAS_FIELD_NM, P007B17_A916TBM43_ODM_DATA_TYPE, P007B17_n916TBM43_ODM_DATA_TYPE, P007B17_A917TBM43_NOTE, P007B17_n917TBM43_NOTE, P007B17_A918TBM43_ORDER,
            P007B17_n918TBM43_ORDER, P007B17_A933TBM43_VERSION, P007B17_n933TBM43_VERSION, P007B17_A919TBM43_DEL_FLG, P007B17_n919TBM43_DEL_FLG, P007B17_A920TBM43_CRT_DATETIME, P007B17_n920TBM43_CRT_DATETIME, P007B17_A921TBM43_CRT_USER_ID, P007B17_n921TBM43_CRT_USER_ID, P007B17_A922TBM43_CRT_PROG_NM,
            P007B17_n922TBM43_CRT_PROG_NM, P007B17_A923TBM43_UPD_DATETIME, P007B17_n923TBM43_UPD_DATETIME, P007B17_A924TBM43_UPD_USER_ID, P007B17_n924TBM43_UPD_USER_ID, P007B17_A925TBM43_UPD_PROG_NM, P007B17_n925TBM43_UPD_PROG_NM, P007B17_A926TBM43_UPD_CNT, P007B17_n926TBM43_UPD_CNT
            }
            , new Object[] {
            P007B18_A946TBM44_CRF_ID, P007B18_A945TBM44_STUDY_ID, P007B18_A947TBM44_CRF_EDA_NO, P007B18_A948TBM44_VISIT_NO, P007B18_n948TBM44_VISIT_NO, P007B18_A949TBM44_DEL_FLG, P007B18_n949TBM44_DEL_FLG, P007B18_A950TBM44_CRT_DATETIME, P007B18_n950TBM44_CRT_DATETIME, P007B18_A951TBM44_CRT_USER_ID,
            P007B18_n951TBM44_CRT_USER_ID, P007B18_A952TBM44_CRT_PROG_NM, P007B18_n952TBM44_CRT_PROG_NM, P007B18_A953TBM44_UPD_DATETIME, P007B18_n953TBM44_UPD_DATETIME, P007B18_A954TBM44_UPD_USER_ID, P007B18_n954TBM44_UPD_USER_ID, P007B18_A955TBM44_UPD_PROG_NM, P007B18_n955TBM44_UPD_PROG_NM, P007B18_A956TBM44_UPD_CNT,
            P007B18_n956TBM44_UPD_CNT
            }
            , new Object[] {
            P007B19_A977TBM45_STUDY_ID, P007B19_A978TBM45_FILTER_NO, P007B19_A980TBM45_FILETR_NM, P007B19_n980TBM45_FILETR_NM, P007B19_A981TBM45_IN_CRF_ID, P007B19_n981TBM45_IN_CRF_ID, P007B19_A982TBM45_DEL_FLG, P007B19_n982TBM45_DEL_FLG, P007B19_A983TBM45_CRT_DATETIME, P007B19_n983TBM45_CRT_DATETIME,
            P007B19_A984TBM45_CRT_USER_ID, P007B19_n984TBM45_CRT_USER_ID, P007B19_A985TBM45_CRT_PROG_NM, P007B19_n985TBM45_CRT_PROG_NM, P007B19_A986TBM45_UPD_DATETIME, P007B19_n986TBM45_UPD_DATETIME, P007B19_A987TBM45_UPD_USER_ID, P007B19_n987TBM45_UPD_USER_ID, P007B19_A988TBM45_UPD_PROG_NM, P007B19_n988TBM45_UPD_PROG_NM,
            P007B19_A989TBM45_UPD_CNT, P007B19_n989TBM45_UPD_CNT
            }
            , new Object[] {
            P007B20_A87TBT01_STUDY_ID, P007B20_A88TBT01_SUBJECT_ID, P007B20_A647TBT01_OUTER_SUBJECT_ID, P007B20_n647TBT01_OUTER_SUBJECT_ID, P007B20_A698TBT01_SITE_ID, P007B20_n698TBT01_SITE_ID, P007B20_A441TBT01_DEL_FLG, P007B20_n441TBT01_DEL_FLG, P007B20_A442TBT01_CRT_DATETIME, P007B20_n442TBT01_CRT_DATETIME,
            P007B20_A443TBT01_CRT_USER_ID, P007B20_n443TBT01_CRT_USER_ID, P007B20_A444TBT01_CRT_PROG_NM, P007B20_n444TBT01_CRT_PROG_NM, P007B20_A445TBT01_UPD_DATETIME, P007B20_n445TBT01_UPD_DATETIME, P007B20_A446TBT01_UPD_USER_ID, P007B20_n446TBT01_UPD_USER_ID, P007B20_A447TBT01_UPD_PROG_NM, P007B20_n447TBT01_UPD_PROG_NM,
            P007B20_A448TBT01_UPD_CNT, P007B20_n448TBT01_UPD_CNT
            }
            , new Object[] {
            P007B21_A91TBT02_CRF_ID, P007B21_A89TBT02_STUDY_ID, P007B21_A90TBT02_SUBJECT_ID, P007B21_A935TBT02_CRF_EDA_NO, P007B21_A498TBT02_CRF_LATEST_VERSION, P007B21_n498TBT02_CRF_LATEST_VERSION, P007B21_A499TBT02_CRF_INPUT_LEVEL, P007B21_n499TBT02_CRF_INPUT_LEVEL, P007B21_A648TBT02_LOCK_FLG, P007B21_n648TBT02_LOCK_FLG,
            P007B21_A649TBT02_LOCK_DATETIME, P007B21_n649TBT02_LOCK_DATETIME, P007B21_A650TBT02_LOCK_USER_ID, P007B21_n650TBT02_LOCK_USER_ID, P007B21_A651TBT02_LOCK_AUTH_CD, P007B21_n651TBT02_LOCK_AUTH_CD, P007B21_A652TBT02_UPLOAD_DATETIME, P007B21_n652TBT02_UPLOAD_DATETIME, P007B21_A653TBT02_UPLOAD_USER_ID, P007B21_n653TBT02_UPLOAD_USER_ID,
            P007B21_A654TBT02_UPLOAD_AUTH_CD, P007B21_n654TBT02_UPLOAD_AUTH_CD, P007B21_A655TBT02_DM_ARRIVAL_FLG, P007B21_n655TBT02_DM_ARRIVAL_FLG, P007B21_A656TBT02_DM_ARRIVAL_DATETIME, P007B21_n656TBT02_DM_ARRIVAL_DATETIME, P007B21_A657TBT02_APPROVAL_FLG, P007B21_n657TBT02_APPROVAL_FLG, P007B21_A658TBT02_APPROVAL_DATETIME, P007B21_n658TBT02_APPROVAL_DATETIME,
            P007B21_A659TBT02_APPROVAL_USER_ID, P007B21_n659TBT02_APPROVAL_USER_ID, P007B21_A660TBT02_APPROVAL_AUTH_CD, P007B21_n660TBT02_APPROVAL_AUTH_CD, P007B21_A990TBT02_SIGNATURE_FLG, P007B21_n990TBT02_SIGNATURE_FLG, P007B21_A991TBT02_SIGNATURE_DATETIME, P007B21_n991TBT02_SIGNATURE_DATETIME, P007B21_A992TBT02_SIGNATURE_USER_ID, P007B21_n992TBT02_SIGNATURE_USER_ID,
            P007B21_A661TBT02_INPUT_END_FLG, P007B21_n661TBT02_INPUT_END_FLG, P007B21_A662TBT02_INPUT_END_DATETIME, P007B21_n662TBT02_INPUT_END_DATETIME, P007B21_A663TBT02_INPUT_END_USER_ID, P007B21_n663TBT02_INPUT_END_USER_ID, P007B21_A664TBT02_INPUT_END_AUTH_CD, P007B21_n664TBT02_INPUT_END_AUTH_CD, P007B21_A449TBT02_DEL_FLG, P007B21_n449TBT02_DEL_FLG,
            P007B21_A450TBT02_CRT_DATETIME, P007B21_n450TBT02_CRT_DATETIME, P007B21_A451TBT02_CRT_USER_ID, P007B21_n451TBT02_CRT_USER_ID, P007B21_A452TBT02_CRT_PROG_NM, P007B21_n452TBT02_CRT_PROG_NM, P007B21_A453TBT02_UPD_DATETIME, P007B21_n453TBT02_UPD_DATETIME, P007B21_A454TBT02_UPD_USER_ID, P007B21_n454TBT02_UPD_USER_ID,
            P007B21_A455TBT02_UPD_PROG_NM, P007B21_n455TBT02_UPD_PROG_NM, P007B21_A456TBT02_UPD_CNT, P007B21_n456TBT02_UPD_CNT
            }
            , new Object[] {
            P007B22_A94TBT11_CRF_ID, P007B22_A92TBT11_STUDY_ID, P007B22_A93TBT11_SUBJECT_ID, P007B22_A936TBT11_CRF_EDA_NO, P007B22_A95TBT11_CRF_VERSION, P007B22_A665TBT11_CRF_INPUT_LEVEL, P007B22_n665TBT11_CRF_INPUT_LEVEL, P007B22_A666TBT11_UPLOAD_DATETIME, P007B22_n666TBT11_UPLOAD_DATETIME, P007B22_A667TBT11_UPLOAD_USER_ID,
            P007B22_n667TBT11_UPLOAD_USER_ID, P007B22_A668TBT11_UPLOAD_AUTH_CD, P007B22_n668TBT11_UPLOAD_AUTH_CD, P007B22_A669TBT11_DM_ARRIVAL_FLG, P007B22_n669TBT11_DM_ARRIVAL_FLG, P007B22_A670TBT11_DM_ARRIVAL_DATETIME, P007B22_n670TBT11_DM_ARRIVAL_DATETIME, P007B22_A671TBT11_APPROVAL_FLG, P007B22_n671TBT11_APPROVAL_FLG, P007B22_A672TBT11_APPROVAL_DATETIME,
            P007B22_n672TBT11_APPROVAL_DATETIME, P007B22_A673TBT11_APPROVAL_USER_ID, P007B22_n673TBT11_APPROVAL_USER_ID, P007B22_A674TBT11_APPROVAL_AUTH_CD, P007B22_n674TBT11_APPROVAL_AUTH_CD, P007B22_A993TBT11_SIGNATURE_FLG, P007B22_n993TBT11_SIGNATURE_FLG, P007B22_A994TBT11_SIGNATURE_DATETIME, P007B22_n994TBT11_SIGNATURE_DATETIME, P007B22_A995TBT11_SIGNATURE_USER_ID,
            P007B22_n995TBT11_SIGNATURE_USER_ID, P007B22_A675TBT11_INPUT_END_FLG, P007B22_n675TBT11_INPUT_END_FLG, P007B22_A676TBT11_INPUT_END_DATETIME, P007B22_n676TBT11_INPUT_END_DATETIME, P007B22_A677TBT11_INPUT_END_USER_ID, P007B22_n677TBT11_INPUT_END_USER_ID, P007B22_A678TBT11_INPUT_END_AUTH_CD, P007B22_n678TBT11_INPUT_END_AUTH_CD, P007B22_A891TBT11_UPD_RIYU,
            P007B22_n891TBT11_UPD_RIYU, P007B22_A457TBT11_DEL_FLG, P007B22_n457TBT11_DEL_FLG, P007B22_A458TBT11_CRT_DATETIME, P007B22_n458TBT11_CRT_DATETIME, P007B22_A459TBT11_CRT_USER_ID, P007B22_n459TBT11_CRT_USER_ID, P007B22_A460TBT11_CRT_PROG_NM, P007B22_n460TBT11_CRT_PROG_NM, P007B22_A461TBT11_UPD_DATETIME,
            P007B22_n461TBT11_UPD_DATETIME, P007B22_A462TBT11_UPD_USER_ID, P007B22_n462TBT11_UPD_USER_ID, P007B22_A463TBT11_UPD_PROG_NM, P007B22_n463TBT11_UPD_PROG_NM, P007B22_A464TBT11_UPD_CNT, P007B22_n464TBT11_UPD_CNT
            }
            , new Object[] {
            P007B23_A98TBT12_CRF_ID, P007B23_A96TBT12_STUDY_ID, P007B23_A97TBT12_SUBJECT_ID, P007B23_A937TBT12_CRF_EDA_NO, P007B23_A99TBT12_CRF_ITEM_GRP_DIV, P007B23_A100TBT12_CRF_ITEM_GRP_CD, P007B23_A465TBT12_CRF_VALUE, P007B23_n465TBT12_CRF_VALUE, P007B23_A679TBT12_EDIT_FLG, P007B23_n679TBT12_EDIT_FLG,
            P007B23_A473TBT12_DEL_FLG, P007B23_n473TBT12_DEL_FLG, P007B23_A466TBT12_CRT_DATETIME, P007B23_n466TBT12_CRT_DATETIME, P007B23_A467TBT12_CRT_USER_ID, P007B23_n467TBT12_CRT_USER_ID, P007B23_A468TBT12_CRT_PROG_NM, P007B23_n468TBT12_CRT_PROG_NM, P007B23_A469TBT12_UPD_DATETIME, P007B23_n469TBT12_UPD_DATETIME,
            P007B23_A470TBT12_UPD_USER_ID, P007B23_n470TBT12_UPD_USER_ID, P007B23_A471TBT12_UPD_PROG_NM, P007B23_n471TBT12_UPD_PROG_NM, P007B23_A472TBT12_UPD_CNT, P007B23_n472TBT12_UPD_CNT
            }
            , new Object[] {
            P007B24_A103TBT13_CRF_ID, P007B24_A101TBT13_STUDY_ID, P007B24_A102TBT13_SUBJECT_ID, P007B24_A938TBT13_CRF_EDA_NO, P007B24_A104TBT13_CRF_VERSION, P007B24_A105TBT13_CRF_ITEM_GRP_DIV, P007B24_A106TBT13_CRF_ITEM_GRP_CD, P007B24_A597TBT13_CRF_VALUE, P007B24_n597TBT13_CRF_VALUE, P007B24_A680TBT13_EDIT_FLG,
            P007B24_n680TBT13_EDIT_FLG, P007B24_A598TBT13_DEL_FLG, P007B24_n598TBT13_DEL_FLG, P007B24_A599TBT13_CRT_DATETIME, P007B24_n599TBT13_CRT_DATETIME, P007B24_A600TBT13_CRT_USER_ID, P007B24_n600TBT13_CRT_USER_ID, P007B24_A601TBT13_CRT_PROG_NM, P007B24_n601TBT13_CRT_PROG_NM, P007B24_A602TBT13_UPD_DATETIME,
            P007B24_n602TBT13_UPD_DATETIME, P007B24_A603TBT13_UPD_USER_ID, P007B24_n603TBT13_UPD_USER_ID, P007B24_A604TBT13_UPD_PROG_NM, P007B24_n604TBT13_UPD_PROG_NM, P007B24_A605TBT13_UPD_CNT, P007B24_n605TBT13_UPD_CNT
            }
            , new Object[] {
            P007B25_A474TBT14_CRF_ID, P007B25_n474TBT14_CRF_ID, P007B25_A140TBT14_STUDY_ID, P007B25_A142TBT14_SUBJECT_ID, P007B25_A198TBT14_MEMO_NO, P007B25_A941TBT14_CRF_EDA_NO, P007B25_n941TBT14_CRF_EDA_NO, P007B25_A475TBT14_CRF_VERSION, P007B25_n475TBT14_CRF_VERSION, P007B25_A901TBT14_MEMO_KBN,
            P007B25_n901TBT14_MEMO_KBN, P007B25_A477TBT14_MEMO, P007B25_n477TBT14_MEMO, P007B25_A929TBT14_REQUEST_SITE_ID, P007B25_n929TBT14_REQUEST_SITE_ID, P007B25_A930TBT14_REQUEST_AUTH_CD, P007B25_n930TBT14_REQUEST_AUTH_CD, P007B25_A931TBT14_CRT_AUTH_CD, P007B25_n931TBT14_CRT_AUTH_CD, P007B25_A927TBT14_KAKUNIN_FLG,
            P007B25_n927TBT14_KAKUNIN_FLG, P007B25_A928TBT14_KAKUNIN_USER_ID, P007B25_n928TBT14_KAKUNIN_USER_ID, P007B25_A934TBT14_KAKUNIN_COMMENT, P007B25_n934TBT14_KAKUNIN_COMMENT, P007B25_A902TBT14_KANRYO_FLG, P007B25_n902TBT14_KANRYO_FLG, P007B25_A479TBT14_DEL_FLG, P007B25_n479TBT14_DEL_FLG, P007B25_A480TBT14_CRT_DATETIME,
            P007B25_n480TBT14_CRT_DATETIME, P007B25_A481TBT14_CRT_USER_ID, P007B25_n481TBT14_CRT_USER_ID, P007B25_A482TBT14_CRT_PROG_NM, P007B25_n482TBT14_CRT_PROG_NM, P007B25_A483TBT14_UPD_DATETIME, P007B25_n483TBT14_UPD_DATETIME, P007B25_A484TBT14_UPD_USER_ID, P007B25_n484TBT14_UPD_USER_ID, P007B25_A485TBT14_UPD_PROG_NM,
            P007B25_n485TBT14_UPD_PROG_NM, P007B25_A486TBT14_UPD_CNT, P007B25_n486TBT14_UPD_CNT
            }
            , new Object[] {
            P007B26_A155TBT15_CRF_ID, P007B26_n155TBT15_CRF_ID, P007B26_A149TBT15_STUDY_ID, P007B26_A151TBT15_SUBJECT_ID, P007B26_A199TBT15_MEMO_NO, P007B26_A942TBT15_CRF_EDA_NO, P007B26_n942TBT15_CRF_EDA_NO, P007B26_A157TBT15_CRF_VERSION, P007B26_n157TBT15_CRF_VERSION, P007B26_A903TBT15_CRF_ITEM_GRP_DIV,
            P007B26_n903TBT15_CRF_ITEM_GRP_DIV, P007B26_A904TBT15_CRF_ITEM_GRP_CD, P007B26_n904TBT15_CRF_ITEM_GRP_CD, P007B26_A488TBT15_DEL_FLG, P007B26_n488TBT15_DEL_FLG, P007B26_A489TBT15_CRT_DATETIME, P007B26_n489TBT15_CRT_DATETIME, P007B26_A490TBT15_CRT_USER_ID, P007B26_n490TBT15_CRT_USER_ID, P007B26_A491TBT15_CRT_PROG_NM,
            P007B26_n491TBT15_CRT_PROG_NM, P007B26_A492TBT15_UPD_DATETIME, P007B26_n492TBT15_UPD_DATETIME, P007B26_A493TBT15_UPD_USER_ID, P007B26_n493TBT15_UPD_USER_ID, P007B26_A494TBT15_UPD_PROG_NM, P007B26_n494TBT15_UPD_PROG_NM, P007B26_A495TBT15_UPD_CNT, P007B26_n495TBT15_UPD_CNT
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV45Pgmname = "B406_PC01_DESIGN_EXPORT_CSV" ;
      /* GeneXus formulas. */
      AV45Pgmname = "B406_PC01_DESIGN_EXPORT_CSV" ;
      Gx_err = (short)(0) ;
   }

   private byte A637TBM24_TEXT_MAXROWS ;
   private byte A638TBM24_DECIMAL_DIGITS ;
   private byte A943TBM31_REPEAT_FLG ;
   private byte A944TBM31_REPEAT_MAX ;
   private byte A516TBM32_TEXT_MAXROWS ;
   private byte A518TBM32_DECIMAL_DIGITS ;
   private byte A513TBM32_FONT_SIZE ;
   private byte A521TBM32_LINE_SIZE_DIV ;
   private byte A644TBM32_AUTH_LVL_MIN ;
   private byte A947TBM44_CRF_EDA_NO ;
   private byte A935TBT02_CRF_EDA_NO ;
   private byte A499TBT02_CRF_INPUT_LEVEL ;
   private byte A936TBT11_CRF_EDA_NO ;
   private byte A665TBT11_CRF_INPUT_LEVEL ;
   private byte A937TBT12_CRF_EDA_NO ;
   private byte A938TBT13_CRF_EDA_NO ;
   private byte A941TBT14_CRF_EDA_NO ;
   private byte A942TBT15_CRF_EDA_NO ;
   private short A703TBM24_DOM_ITM_GRP_ATTR_SEQ ;
   private short A704TBM24_DOM_ITM_GRP_ROWNO ;
   private short A636TBM24_TEXT_MAXLENGTH ;
   private short A27TBM26_LIST_ITEM_NO ;
   private short A69TBM31_CRF_ID ;
   private short A394TBM31_GRID_SIZE ;
   private short A71TBM32_CRF_ID ;
   private short A507TBM32_CRF_ITEM_GRP_ORDER ;
   private short A508TBM32_LOCATION_X ;
   private short A509TBM32_LOCATION_Y ;
   private short A510TBM32_LOCATION_X2 ;
   private short A511TBM32_LOCATION_Y2 ;
   private short A517TBM32_TEXT_MAXLENGTH ;
   private short A690TBM32_LINE_ANGLE ;
   private short A645TBM32_ZORDER ;
   private short A691TBM32_TAB_ORDER ;
   private short A774TBM32_REF_CRF_ID ;
   private short A77TBM33_CRF_ID ;
   private short A78TBM33_COND_NO ;
   private short A415TBM33_PRIOR_NO ;
   private short A29TBM34_CRF_ID ;
   private short A32TBM35_CRF_ID ;
   private short A36TBM36_CRF_ID ;
   private short A37TBM36_COND_NO ;
   private short A38TBM36_SELECT_CRF_ID ;
   private short A80TBM37_CRF_ID ;
   private short A501TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private short A86TBM37_DOM_ITM_GRP_ROWNO ;
   private short A20TBM41_CRF_ID ;
   private short A946TBM44_CRF_ID ;
   private short A978TBM45_FILTER_NO ;
   private short A91TBT02_CRF_ID ;
   private short A498TBT02_CRF_LATEST_VERSION ;
   private short A94TBT11_CRF_ID ;
   private short A95TBT11_CRF_VERSION ;
   private short A98TBT12_CRF_ID ;
   private short A103TBT13_CRF_ID ;
   private short A104TBT13_CRF_VERSION ;
   private short A474TBT14_CRF_ID ;
   private short A198TBT14_MEMO_NO ;
   private short A475TBT14_CRF_VERSION ;
   private short A155TBT15_CRF_ID ;
   private short A199TBT15_MEMO_NO ;
   private short A157TBT15_CRF_VERSION ;
   private short Gx_err ;
   private int AV41W_NUM ;
   private int AV44GXV1 ;
   private int A543TBM24_ORDER ;
   private int A528TBM31_DEF_VISIT_NO ;
   private int A395TBM31_ORDER ;
   private int A83TBM37_VISIT_NO ;
   private int A909TBM42_ORDER ;
   private int A918TBM43_ORDER ;
   private int A948TBM44_VISIT_NO ;
   private int A88TBT01_SUBJECT_ID ;
   private int A90TBT02_SUBJECT_ID ;
   private int A93TBT11_SUBJECT_ID ;
   private int A97TBT12_SUBJECT_ID ;
   private int A102TBT13_SUBJECT_ID ;
   private int A142TBT14_SUBJECT_ID ;
   private int A151TBT15_SUBJECT_ID ;
   private int GXActiveErrHndl ;
   private long AV12P_STUDY_ID ;
   private long AV21W_CSV_CNT ;
   private long AV26W_DATA_CNT ;
   private long A63TBM21_STUDY_ID ;
   private long A376TBM21_UPD_CNT ;
   private long A17TBM22_STUDY_ID ;
   private long A384TBM22_UPD_CNT ;
   private long A107TBM23_STUDY_ID ;
   private long A392TBM23_UPD_CNT ;
   private long A64TBM24_STUDY_ID ;
   private long A551TBM24_UPD_CNT ;
   private long A23TBM25_STUDY_ID ;
   private long A560TBM25_UPD_CNT ;
   private long A25TBM26_STUDY_ID ;
   private long A570TBM26_UPD_CNT ;
   private long AV8B406_SD01_EXPORT_LIST_I_getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id ;
   private long A68TBM31_STUDY_ID ;
   private long A404TBM31_UPD_CNT ;
   private long A70TBM32_STUDY_ID ;
   private long A515TBM32_FONT_COLOR_DIV ;
   private long A689TBM32_LINE_COLOR_DIV ;
   private long A413TBM32_UPD_CNT ;
   private long A76TBM33_STUDY_ID ;
   private long A423TBM33_UPD_CNT ;
   private long A28TBM34_STUDY_ID ;
   private long A579TBM34_UPD_CNT ;
   private long A31TBM35_STUDY_ID ;
   private long A588TBM35_UPD_CNT ;
   private long A35TBM36_STUDY_ID ;
   private long A596TBM36_UPD_CNT ;
   private long A79TBM37_STUDY_ID ;
   private long A440TBM37_UPD_CNT ;
   private long A19TBM41_STUDY_ID ;
   private long A432TBM41_UPD_CNT ;
   private long A203TBM42_STUDY_ID ;
   private long A900TBM42_UPD_CNT ;
   private long A200TBM43_STUDY_ID ;
   private long A926TBM43_UPD_CNT ;
   private long A945TBM44_STUDY_ID ;
   private long A956TBM44_UPD_CNT ;
   private long A977TBM45_STUDY_ID ;
   private long A989TBM45_UPD_CNT ;
   private long A87TBT01_STUDY_ID ;
   private long A448TBT01_UPD_CNT ;
   private long A89TBT02_STUDY_ID ;
   private long A456TBT02_UPD_CNT ;
   private long A92TBT11_STUDY_ID ;
   private long A464TBT11_UPD_CNT ;
   private long A96TBT12_STUDY_ID ;
   private long A472TBT12_UPD_CNT ;
   private long A101TBT13_STUDY_ID ;
   private long A605TBT13_UPD_CNT ;
   private long A140TBT14_STUDY_ID ;
   private long A486TBT14_UPD_CNT ;
   private long A149TBT15_STUDY_ID ;
   private long A495TBT15_UPD_CNT ;
   private String AV45Pgmname ;
   private String GXt_char1 ;
   private String scmdbuf ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String Gx_emsg ;
   private java.util.Date A370TBM21_CRT_DATETIME ;
   private java.util.Date A373TBM21_UPD_DATETIME ;
   private java.util.Date A378TBM22_CRT_DATETIME ;
   private java.util.Date A381TBM22_UPD_DATETIME ;
   private java.util.Date A386TBM23_CRT_DATETIME ;
   private java.util.Date A389TBM23_UPD_DATETIME ;
   private java.util.Date A545TBM24_CRT_DATETIME ;
   private java.util.Date A548TBM24_UPD_DATETIME ;
   private java.util.Date A554TBM25_CRT_DATETIME ;
   private java.util.Date A557TBM25_UPD_DATETIME ;
   private java.util.Date A564TBM26_CRT_DATETIME ;
   private java.util.Date A567TBM26_UPD_DATETIME ;
   private java.util.Date A398TBM31_CRT_DATETIME ;
   private java.util.Date A401TBM31_UPD_DATETIME ;
   private java.util.Date A407TBM32_CRT_DATETIME ;
   private java.util.Date A410TBM32_UPD_DATETIME ;
   private java.util.Date A417TBM33_CRT_DATETIME ;
   private java.util.Date A420TBM33_UPD_DATETIME ;
   private java.util.Date A573TBM34_CRT_DATETIME ;
   private java.util.Date A576TBM34_UPD_DATETIME ;
   private java.util.Date A582TBM35_CRT_DATETIME ;
   private java.util.Date A585TBM35_UPD_DATETIME ;
   private java.util.Date A590TBM36_CRT_DATETIME ;
   private java.util.Date A593TBM36_UPD_DATETIME ;
   private java.util.Date A434TBM37_CRT_DATETIME ;
   private java.util.Date A437TBM37_UPD_DATETIME ;
   private java.util.Date A426TBM41_CRT_DATETIME ;
   private java.util.Date A429TBM41_UPD_DATETIME ;
   private java.util.Date A894TBM42_CRT_DATETIME ;
   private java.util.Date A897TBM42_UPD_DATETIME ;
   private java.util.Date A920TBM43_CRT_DATETIME ;
   private java.util.Date A923TBM43_UPD_DATETIME ;
   private java.util.Date A950TBM44_CRT_DATETIME ;
   private java.util.Date A953TBM44_UPD_DATETIME ;
   private java.util.Date A983TBM45_CRT_DATETIME ;
   private java.util.Date A986TBM45_UPD_DATETIME ;
   private java.util.Date A442TBT01_CRT_DATETIME ;
   private java.util.Date A445TBT01_UPD_DATETIME ;
   private java.util.Date A649TBT02_LOCK_DATETIME ;
   private java.util.Date A652TBT02_UPLOAD_DATETIME ;
   private java.util.Date A656TBT02_DM_ARRIVAL_DATETIME ;
   private java.util.Date A658TBT02_APPROVAL_DATETIME ;
   private java.util.Date A991TBT02_SIGNATURE_DATETIME ;
   private java.util.Date A662TBT02_INPUT_END_DATETIME ;
   private java.util.Date A450TBT02_CRT_DATETIME ;
   private java.util.Date A453TBT02_UPD_DATETIME ;
   private java.util.Date A666TBT11_UPLOAD_DATETIME ;
   private java.util.Date A670TBT11_DM_ARRIVAL_DATETIME ;
   private java.util.Date A672TBT11_APPROVAL_DATETIME ;
   private java.util.Date A994TBT11_SIGNATURE_DATETIME ;
   private java.util.Date A676TBT11_INPUT_END_DATETIME ;
   private java.util.Date A458TBT11_CRT_DATETIME ;
   private java.util.Date A461TBT11_UPD_DATETIME ;
   private java.util.Date A466TBT12_CRT_DATETIME ;
   private java.util.Date A469TBT12_UPD_DATETIME ;
   private java.util.Date A599TBT13_CRT_DATETIME ;
   private java.util.Date A602TBT13_UPD_DATETIME ;
   private java.util.Date A480TBT14_CRT_DATETIME ;
   private java.util.Date A483TBT14_UPD_DATETIME ;
   private java.util.Date A489TBT15_CRT_DATETIME ;
   private java.util.Date A492TBT15_UPD_DATETIME ;
   private boolean AV35P_BASE_FLG ;
   private boolean AV33P_SITE_FLG ;
   private boolean AV34P_STAFF_FLG ;
   private boolean AV11P_LIST_CHK ;
   private boolean AV13P_SUBJECT_CHK ;
   private boolean returnInSub ;
   private boolean n367TBM21_STUDY_NM ;
   private boolean n530TBM21_OUTER_STUDY_ID ;
   private boolean n531TBM21_PROC_NM ;
   private boolean n368TBM21_NOTE ;
   private boolean n607TBM21_STATUS ;
   private boolean n369TBM21_DEL_FLG ;
   private boolean n370TBM21_CRT_DATETIME ;
   private boolean n371TBM21_CRT_USER_ID ;
   private boolean n372TBM21_CRT_PROG_NM ;
   private boolean n373TBM21_UPD_DATETIME ;
   private boolean n374TBM21_UPD_USER_ID ;
   private boolean n375TBM21_UPD_PROG_NM ;
   private boolean n376TBM21_UPD_CNT ;
   private boolean n377TBM22_DEL_FLG ;
   private boolean n378TBM22_CRT_DATETIME ;
   private boolean n379TBM22_CRT_USER_ID ;
   private boolean n380TBM22_CRT_PROG_NM ;
   private boolean n381TBM22_UPD_DATETIME ;
   private boolean n382TBM22_UPD_USER_ID ;
   private boolean n383TBM22_UPD_PROG_NM ;
   private boolean n384TBM22_UPD_CNT ;
   private boolean n385TBM23_DEL_FLG ;
   private boolean n386TBM23_CRT_DATETIME ;
   private boolean n387TBM23_CRT_USER_ID ;
   private boolean n388TBM23_CRT_PROG_NM ;
   private boolean n389TBM23_UPD_DATETIME ;
   private boolean n390TBM23_UPD_USER_ID ;
   private boolean n391TBM23_UPD_PROG_NM ;
   private boolean n392TBM23_UPD_CNT ;
   private boolean n702TBM24_DOM_ITM_GRP_OID ;
   private boolean n703TBM24_DOM_ITM_GRP_ATTR_SEQ ;
   private boolean n704TBM24_DOM_ITM_GRP_ROWNO ;
   private boolean n705TBM24_CRF_ITEM_NM ;
   private boolean n635TBM24_IDENTIFICATION_CD ;
   private boolean n636TBM24_TEXT_MAXLENGTH ;
   private boolean n637TBM24_TEXT_MAXROWS ;
   private boolean n638TBM24_DECIMAL_DIGITS ;
   private boolean n639TBM24_TEXT ;
   private boolean n640TBM24_FIXED_VALUE ;
   private boolean n641TBM24_CHK_FALSE_INNER_VALUE ;
   private boolean n706TBM24_REQUIRED_INPUT_FLG ;
   private boolean n707TBM24_MIN_VALUE ;
   private boolean n708TBM24_MAX_VALUE ;
   private boolean n543TBM24_ORDER ;
   private boolean n544TBM24_DEL_FLG ;
   private boolean n545TBM24_CRT_DATETIME ;
   private boolean n546TBM24_CRT_USER_ID ;
   private boolean n547TBM24_CRT_PROG_NM ;
   private boolean n548TBM24_UPD_DATETIME ;
   private boolean n549TBM24_UPD_USER_ID ;
   private boolean n550TBM24_UPD_PROG_NM ;
   private boolean n551TBM24_UPD_CNT ;
   private boolean n552TBM25_LIST_NM ;
   private boolean n553TBM25_DEL_FLG ;
   private boolean n554TBM25_CRT_DATETIME ;
   private boolean n555TBM25_CRT_USER_ID ;
   private boolean n556TBM25_CRT_PROG_NM ;
   private boolean n557TBM25_UPD_DATETIME ;
   private boolean n558TBM25_UPD_USER_ID ;
   private boolean n559TBM25_UPD_PROG_NM ;
   private boolean n560TBM25_UPD_CNT ;
   private boolean n561TBM26_LIST_ITEM_NAME ;
   private boolean n562TBM26_INNER_VALUE ;
   private boolean n563TBM26_DEL_FLG ;
   private boolean n564TBM26_CRT_DATETIME ;
   private boolean n565TBM26_CRT_USER_ID ;
   private boolean n566TBM26_CRT_PROG_NM ;
   private boolean n567TBM26_UPD_DATETIME ;
   private boolean n568TBM26_UPD_USER_ID ;
   private boolean n569TBM26_UPD_PROG_NM ;
   private boolean n570TBM26_UPD_CNT ;
   private boolean n393TBM31_CRF_NM ;
   private boolean n642TBM31_CRF_SNM ;
   private boolean n394TBM31_GRID_SIZE ;
   private boolean n528TBM31_DEF_VISIT_NO ;
   private boolean n529TBM31_DEF_DOMAIN_CD ;
   private boolean n643TBM31_STATUS ;
   private boolean n396TBM31_NOTE ;
   private boolean n943TBM31_REPEAT_FLG ;
   private boolean n944TBM31_REPEAT_MAX ;
   private boolean n979TBM31_DM_EXCP_NO_DISP_FLG ;
   private boolean n397TBM31_DEL_FLG ;
   private boolean n398TBM31_CRT_DATETIME ;
   private boolean n399TBM31_CRT_USER_ID ;
   private boolean n400TBM31_CRT_PROG_NM ;
   private boolean n401TBM31_UPD_DATETIME ;
   private boolean n402TBM31_UPD_USER_ID ;
   private boolean n403TBM31_UPD_PROG_NM ;
   private boolean n404TBM31_UPD_CNT ;
   private boolean n395TBM31_ORDER ;
   private boolean n405TBM32_CRF_ITEM_NM ;
   private boolean n74TBM32_CRF_ITEM_DIV ;
   private boolean n73TBM32_CRF_ITEM_GRP_CD ;
   private boolean n507TBM32_CRF_ITEM_GRP_ORDER ;
   private boolean n508TBM32_LOCATION_X ;
   private boolean n509TBM32_LOCATION_Y ;
   private boolean n510TBM32_LOCATION_X2 ;
   private boolean n511TBM32_LOCATION_Y2 ;
   private boolean n512TBM32_TEXT_ALIGN_DIV ;
   private boolean n516TBM32_TEXT_MAXROWS ;
   private boolean n517TBM32_TEXT_MAXLENGTH ;
   private boolean n518TBM32_DECIMAL_DIGITS ;
   private boolean n522TBM32_CHK_TRUE_INNER_VALUE ;
   private boolean n523TBM32_CHK_FALSE_INNER_VALUE ;
   private boolean n527TBM32_FIXED_VALUE ;
   private boolean n525TBM32_LIST_CD ;
   private boolean n526TBM32_IMAGE_CD ;
   private boolean n524TBM32_TEXT ;
   private boolean n513TBM32_FONT_SIZE ;
   private boolean n514TBM32_FONT_UL_FLG ;
   private boolean n515TBM32_FONT_COLOR_DIV ;
   private boolean n521TBM32_LINE_SIZE_DIV ;
   private boolean n689TBM32_LINE_COLOR_DIV ;
   private boolean n519TBM32_LINE_START_POINT_DIV ;
   private boolean n520TBM32_LINE_END_POINT_DIV ;
   private boolean n690TBM32_LINE_ANGLE ;
   private boolean n644TBM32_AUTH_LVL_MIN ;
   private boolean n645TBM32_ZORDER ;
   private boolean n691TBM32_TAB_ORDER ;
   private boolean n692TBM32_TABSTOP_FLG ;
   private boolean n693TBM32_REQUIRED_INPUT_FLG ;
   private boolean n694TBM32_MIN_VALUE ;
   private boolean n695TBM32_MAX_VALUE ;
   private boolean n406TBM32_CRF_ITEM_NOTE ;
   private boolean n774TBM32_REF_CRF_ID ;
   private boolean n775TBM32_REF_CRF_ITEM_CD ;
   private boolean n75TBM32_DEL_FLG ;
   private boolean n407TBM32_CRT_DATETIME ;
   private boolean n408TBM32_CRT_USER_ID ;
   private boolean n409TBM32_CRT_PROG_NM ;
   private boolean n410TBM32_UPD_DATETIME ;
   private boolean n411TBM32_UPD_USER_ID ;
   private boolean n412TBM32_UPD_PROG_NM ;
   private boolean n413TBM32_UPD_CNT ;
   private boolean n502TBM33_COND_NM ;
   private boolean n414TBM33_EXPRESSION ;
   private boolean n503TBM33_COND_DIV ;
   private boolean n504TBM33_CRF_ITEM_CD ;
   private boolean n415TBM33_PRIOR_NO ;
   private boolean n505TBM33_ERR_DIV ;
   private boolean n506TBM33_ERR_MSG ;
   private boolean n646TBM33_ENABLED_FLG ;
   private boolean n696TBM33_REQUIRED_INPUT_FLG ;
   private boolean n697TBM33_NUMERIC_RANGE_FLG ;
   private boolean n416TBM33_DEL_FLG ;
   private boolean n417TBM33_CRT_DATETIME ;
   private boolean n418TBM33_CRT_USER_ID ;
   private boolean n419TBM33_CRT_PROG_NM ;
   private boolean n420TBM33_UPD_DATETIME ;
   private boolean n421TBM33_UPD_USER_ID ;
   private boolean n422TBM33_UPD_PROG_NM ;
   private boolean n423TBM33_UPD_CNT ;
   private boolean n571TBM34_DISPLAY_FLG ;
   private boolean n572TBM34_DEL_FLG ;
   private boolean n573TBM34_CRT_DATETIME ;
   private boolean n574TBM34_CRT_USER_ID ;
   private boolean n575TBM34_CRT_PROG_NM ;
   private boolean n576TBM34_UPD_DATETIME ;
   private boolean n577TBM34_UPD_USER_ID ;
   private boolean n578TBM34_UPD_PROG_NM ;
   private boolean n579TBM34_UPD_CNT ;
   private boolean n580TBM35_DISPLAY_FLG ;
   private boolean n581TBM35_DEL_FLG ;
   private boolean n582TBM35_CRT_DATETIME ;
   private boolean n583TBM35_CRT_USER_ID ;
   private boolean n584TBM35_CRT_PROG_NM ;
   private boolean n585TBM35_UPD_DATETIME ;
   private boolean n586TBM35_UPD_USER_ID ;
   private boolean n587TBM35_UPD_PROG_NM ;
   private boolean n588TBM35_UPD_CNT ;
   private boolean n589TBM36_DEL_FLG ;
   private boolean n590TBM36_CRT_DATETIME ;
   private boolean n591TBM36_CRT_USER_ID ;
   private boolean n592TBM36_CRT_PROG_NM ;
   private boolean n593TBM36_UPD_DATETIME ;
   private boolean n594TBM36_UPD_USER_ID ;
   private boolean n595TBM36_UPD_PROG_NM ;
   private boolean n596TBM36_UPD_CNT ;
   private boolean n83TBM37_VISIT_NO ;
   private boolean n84TBM37_DOM_CD ;
   private boolean n500TBM37_DOM_VAR_NM ;
   private boolean n85TBM37_DOM_ITM_GRP_OID ;
   private boolean n501TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private boolean n86TBM37_DOM_ITM_GRP_ROWNO ;
   private boolean n433TBM37_DEL_FLG ;
   private boolean n434TBM37_CRT_DATETIME ;
   private boolean n435TBM37_CRT_USER_ID ;
   private boolean n436TBM37_CRT_PROG_NM ;
   private boolean n437TBM37_UPD_DATETIME ;
   private boolean n438TBM37_UPD_USER_ID ;
   private boolean n439TBM37_UPD_PROG_NM ;
   private boolean n440TBM37_UPD_CNT ;
   private boolean n424TBM41_NCM_METADATA_ID ;
   private boolean n425TBM41_DEL_FLG ;
   private boolean n426TBM41_CRT_DATETIME ;
   private boolean n427TBM41_CRT_USER_ID ;
   private boolean n428TBM41_CRT_PROG_NM ;
   private boolean n429TBM41_UPD_DATETIME ;
   private boolean n430TBM41_UPD_USER_ID ;
   private boolean n431TBM41_UPD_PROG_NM ;
   private boolean n432TBM41_UPD_CNT ;
   private boolean n905TBM42_DOM_ENM ;
   private boolean n906TBM42_DOM_JNM ;
   private boolean n907TBM42_DOM_GRP_NM ;
   private boolean n908TBM42_NOTE ;
   private boolean n909TBM42_ORDER ;
   private boolean n893TBM42_DEL_FLG ;
   private boolean n894TBM42_CRT_DATETIME ;
   private boolean n895TBM42_CRT_USER_ID ;
   private boolean n896TBM42_CRT_PROG_NM ;
   private boolean n897TBM42_UPD_DATETIME ;
   private boolean n898TBM42_UPD_USER_ID ;
   private boolean n899TBM42_UPD_PROG_NM ;
   private boolean n900TBM42_UPD_CNT ;
   private boolean n910TBM43_VAR_DESC ;
   private boolean n911TBM43_SDTM_FLG ;
   private boolean n912TBM43_CDASH_FLG ;
   private boolean n913TBM43_INPUT_TYPE_DIV ;
   private boolean n914TBM43_REQUIRED_FLG ;
   private boolean n915TBM43_SAS_FIELD_NM ;
   private boolean n916TBM43_ODM_DATA_TYPE ;
   private boolean n917TBM43_NOTE ;
   private boolean n918TBM43_ORDER ;
   private boolean n933TBM43_VERSION ;
   private boolean n919TBM43_DEL_FLG ;
   private boolean n920TBM43_CRT_DATETIME ;
   private boolean n921TBM43_CRT_USER_ID ;
   private boolean n922TBM43_CRT_PROG_NM ;
   private boolean n923TBM43_UPD_DATETIME ;
   private boolean n924TBM43_UPD_USER_ID ;
   private boolean n925TBM43_UPD_PROG_NM ;
   private boolean n926TBM43_UPD_CNT ;
   private boolean n948TBM44_VISIT_NO ;
   private boolean n949TBM44_DEL_FLG ;
   private boolean n950TBM44_CRT_DATETIME ;
   private boolean n951TBM44_CRT_USER_ID ;
   private boolean n952TBM44_CRT_PROG_NM ;
   private boolean n953TBM44_UPD_DATETIME ;
   private boolean n954TBM44_UPD_USER_ID ;
   private boolean n955TBM44_UPD_PROG_NM ;
   private boolean n956TBM44_UPD_CNT ;
   private boolean n980TBM45_FILETR_NM ;
   private boolean n981TBM45_IN_CRF_ID ;
   private boolean n982TBM45_DEL_FLG ;
   private boolean n983TBM45_CRT_DATETIME ;
   private boolean n984TBM45_CRT_USER_ID ;
   private boolean n985TBM45_CRT_PROG_NM ;
   private boolean n986TBM45_UPD_DATETIME ;
   private boolean n987TBM45_UPD_USER_ID ;
   private boolean n988TBM45_UPD_PROG_NM ;
   private boolean n989TBM45_UPD_CNT ;
   private boolean n647TBT01_OUTER_SUBJECT_ID ;
   private boolean n698TBT01_SITE_ID ;
   private boolean n441TBT01_DEL_FLG ;
   private boolean n442TBT01_CRT_DATETIME ;
   private boolean n443TBT01_CRT_USER_ID ;
   private boolean n444TBT01_CRT_PROG_NM ;
   private boolean n445TBT01_UPD_DATETIME ;
   private boolean n446TBT01_UPD_USER_ID ;
   private boolean n447TBT01_UPD_PROG_NM ;
   private boolean n448TBT01_UPD_CNT ;
   private boolean n498TBT02_CRF_LATEST_VERSION ;
   private boolean n499TBT02_CRF_INPUT_LEVEL ;
   private boolean n648TBT02_LOCK_FLG ;
   private boolean n649TBT02_LOCK_DATETIME ;
   private boolean n650TBT02_LOCK_USER_ID ;
   private boolean n651TBT02_LOCK_AUTH_CD ;
   private boolean n652TBT02_UPLOAD_DATETIME ;
   private boolean n653TBT02_UPLOAD_USER_ID ;
   private boolean n654TBT02_UPLOAD_AUTH_CD ;
   private boolean n655TBT02_DM_ARRIVAL_FLG ;
   private boolean n656TBT02_DM_ARRIVAL_DATETIME ;
   private boolean n657TBT02_APPROVAL_FLG ;
   private boolean n658TBT02_APPROVAL_DATETIME ;
   private boolean n659TBT02_APPROVAL_USER_ID ;
   private boolean n660TBT02_APPROVAL_AUTH_CD ;
   private boolean n990TBT02_SIGNATURE_FLG ;
   private boolean n991TBT02_SIGNATURE_DATETIME ;
   private boolean n992TBT02_SIGNATURE_USER_ID ;
   private boolean n661TBT02_INPUT_END_FLG ;
   private boolean n662TBT02_INPUT_END_DATETIME ;
   private boolean n663TBT02_INPUT_END_USER_ID ;
   private boolean n664TBT02_INPUT_END_AUTH_CD ;
   private boolean n449TBT02_DEL_FLG ;
   private boolean n450TBT02_CRT_DATETIME ;
   private boolean n451TBT02_CRT_USER_ID ;
   private boolean n452TBT02_CRT_PROG_NM ;
   private boolean n453TBT02_UPD_DATETIME ;
   private boolean n454TBT02_UPD_USER_ID ;
   private boolean n455TBT02_UPD_PROG_NM ;
   private boolean n456TBT02_UPD_CNT ;
   private boolean n665TBT11_CRF_INPUT_LEVEL ;
   private boolean n666TBT11_UPLOAD_DATETIME ;
   private boolean n667TBT11_UPLOAD_USER_ID ;
   private boolean n668TBT11_UPLOAD_AUTH_CD ;
   private boolean n669TBT11_DM_ARRIVAL_FLG ;
   private boolean n670TBT11_DM_ARRIVAL_DATETIME ;
   private boolean n671TBT11_APPROVAL_FLG ;
   private boolean n672TBT11_APPROVAL_DATETIME ;
   private boolean n673TBT11_APPROVAL_USER_ID ;
   private boolean n674TBT11_APPROVAL_AUTH_CD ;
   private boolean n993TBT11_SIGNATURE_FLG ;
   private boolean n994TBT11_SIGNATURE_DATETIME ;
   private boolean n995TBT11_SIGNATURE_USER_ID ;
   private boolean n675TBT11_INPUT_END_FLG ;
   private boolean n676TBT11_INPUT_END_DATETIME ;
   private boolean n677TBT11_INPUT_END_USER_ID ;
   private boolean n678TBT11_INPUT_END_AUTH_CD ;
   private boolean n891TBT11_UPD_RIYU ;
   private boolean n457TBT11_DEL_FLG ;
   private boolean n458TBT11_CRT_DATETIME ;
   private boolean n459TBT11_CRT_USER_ID ;
   private boolean n460TBT11_CRT_PROG_NM ;
   private boolean n461TBT11_UPD_DATETIME ;
   private boolean n462TBT11_UPD_USER_ID ;
   private boolean n463TBT11_UPD_PROG_NM ;
   private boolean n464TBT11_UPD_CNT ;
   private boolean n465TBT12_CRF_VALUE ;
   private boolean n679TBT12_EDIT_FLG ;
   private boolean n473TBT12_DEL_FLG ;
   private boolean n466TBT12_CRT_DATETIME ;
   private boolean n467TBT12_CRT_USER_ID ;
   private boolean n468TBT12_CRT_PROG_NM ;
   private boolean n469TBT12_UPD_DATETIME ;
   private boolean n470TBT12_UPD_USER_ID ;
   private boolean n471TBT12_UPD_PROG_NM ;
   private boolean n472TBT12_UPD_CNT ;
   private boolean n597TBT13_CRF_VALUE ;
   private boolean n680TBT13_EDIT_FLG ;
   private boolean n598TBT13_DEL_FLG ;
   private boolean n599TBT13_CRT_DATETIME ;
   private boolean n600TBT13_CRT_USER_ID ;
   private boolean n601TBT13_CRT_PROG_NM ;
   private boolean n602TBT13_UPD_DATETIME ;
   private boolean n603TBT13_UPD_USER_ID ;
   private boolean n604TBT13_UPD_PROG_NM ;
   private boolean n605TBT13_UPD_CNT ;
   private boolean n474TBT14_CRF_ID ;
   private boolean n941TBT14_CRF_EDA_NO ;
   private boolean n475TBT14_CRF_VERSION ;
   private boolean n901TBT14_MEMO_KBN ;
   private boolean n477TBT14_MEMO ;
   private boolean n929TBT14_REQUEST_SITE_ID ;
   private boolean n930TBT14_REQUEST_AUTH_CD ;
   private boolean n931TBT14_CRT_AUTH_CD ;
   private boolean n927TBT14_KAKUNIN_FLG ;
   private boolean n928TBT14_KAKUNIN_USER_ID ;
   private boolean n934TBT14_KAKUNIN_COMMENT ;
   private boolean n902TBT14_KANRYO_FLG ;
   private boolean n479TBT14_DEL_FLG ;
   private boolean n480TBT14_CRT_DATETIME ;
   private boolean n481TBT14_CRT_USER_ID ;
   private boolean n482TBT14_CRT_PROG_NM ;
   private boolean n483TBT14_UPD_DATETIME ;
   private boolean n484TBT14_UPD_USER_ID ;
   private boolean n485TBT14_UPD_PROG_NM ;
   private boolean n486TBT14_UPD_CNT ;
   private boolean n155TBT15_CRF_ID ;
   private boolean n942TBT15_CRF_EDA_NO ;
   private boolean n157TBT15_CRF_VERSION ;
   private boolean n903TBT15_CRF_ITEM_GRP_DIV ;
   private boolean n904TBT15_CRF_ITEM_GRP_CD ;
   private boolean n488TBT15_DEL_FLG ;
   private boolean n489TBT15_CRT_DATETIME ;
   private boolean n490TBT15_CRT_USER_ID ;
   private boolean n491TBT15_CRT_PROG_NM ;
   private boolean n492TBT15_UPD_DATETIME ;
   private boolean n493TBT15_UPD_USER_ID ;
   private boolean n494TBT15_UPD_PROG_NM ;
   private boolean n495TBT15_UPD_CNT ;
   private String AV16PO_ERRCD ;
   private String AV17PO_ERRMSG ;
   private String AV9C_TAM02_APP_ID ;
   private String AV25W_CSV_SDEL ;
   private String AV23W_CSV_FDEL ;
   private String AV24W_CSV_KAK ;
   private String AV28W_FILE_NAME ;
   private String AV31W_TABLE_NM ;
   private String A367TBM21_STUDY_NM ;
   private String A530TBM21_OUTER_STUDY_ID ;
   private String A531TBM21_PROC_NM ;
   private String A368TBM21_NOTE ;
   private String A607TBM21_STATUS ;
   private String A369TBM21_DEL_FLG ;
   private String A371TBM21_CRT_USER_ID ;
   private String A372TBM21_CRT_PROG_NM ;
   private String A374TBM21_UPD_USER_ID ;
   private String A375TBM21_UPD_PROG_NM ;
   private String A18TBM22_SITE_ID ;
   private String A377TBM22_DEL_FLG ;
   private String A379TBM22_CRT_USER_ID ;
   private String A380TBM22_CRT_PROG_NM ;
   private String A382TBM22_UPD_USER_ID ;
   private String A383TBM22_UPD_PROG_NM ;
   private String A108TBM23_USER_ID ;
   private String A109TBM23_STYDY_AUTH_CD ;
   private String A385TBM23_DEL_FLG ;
   private String A387TBM23_CRT_USER_ID ;
   private String A388TBM23_CRT_PROG_NM ;
   private String A390TBM23_UPD_USER_ID ;
   private String A391TBM23_UPD_PROG_NM ;
   private String A65TBM24_DOM_CD ;
   private String A66TBM24_DOM_VAR_NM ;
   private String A702TBM24_DOM_ITM_GRP_OID ;
   private String A705TBM24_CRF_ITEM_NM ;
   private String A67TBM24_CRF_ITEM_DIV ;
   private String A635TBM24_IDENTIFICATION_CD ;
   private String A639TBM24_TEXT ;
   private String A640TBM24_FIXED_VALUE ;
   private String A641TBM24_CHK_FALSE_INNER_VALUE ;
   private String A706TBM24_REQUIRED_INPUT_FLG ;
   private String A707TBM24_MIN_VALUE ;
   private String A708TBM24_MAX_VALUE ;
   private String A544TBM24_DEL_FLG ;
   private String A546TBM24_CRT_USER_ID ;
   private String A547TBM24_CRT_PROG_NM ;
   private String A549TBM24_UPD_USER_ID ;
   private String A550TBM24_UPD_PROG_NM ;
   private String A24TBM25_LIST_CD ;
   private String A552TBM25_LIST_NM ;
   private String A553TBM25_DEL_FLG ;
   private String A555TBM25_CRT_USER_ID ;
   private String A556TBM25_CRT_PROG_NM ;
   private String A558TBM25_UPD_USER_ID ;
   private String A559TBM25_UPD_PROG_NM ;
   private String A26TBM26_LIST_CD ;
   private String A561TBM26_LIST_ITEM_NAME ;
   private String A562TBM26_INNER_VALUE ;
   private String A563TBM26_DEL_FLG ;
   private String A565TBM26_CRT_USER_ID ;
   private String A566TBM26_CRT_PROG_NM ;
   private String A568TBM26_UPD_USER_ID ;
   private String A569TBM26_UPD_PROG_NM ;
   private String A393TBM31_CRF_NM ;
   private String A642TBM31_CRF_SNM ;
   private String A529TBM31_DEF_DOMAIN_CD ;
   private String A643TBM31_STATUS ;
   private String A396TBM31_NOTE ;
   private String A979TBM31_DM_EXCP_NO_DISP_FLG ;
   private String A397TBM31_DEL_FLG ;
   private String A399TBM31_CRT_USER_ID ;
   private String A400TBM31_CRT_PROG_NM ;
   private String A402TBM31_UPD_USER_ID ;
   private String A403TBM31_UPD_PROG_NM ;
   private String A72TBM32_CRF_ITEM_CD ;
   private String A405TBM32_CRF_ITEM_NM ;
   private String A74TBM32_CRF_ITEM_DIV ;
   private String A73TBM32_CRF_ITEM_GRP_CD ;
   private String A512TBM32_TEXT_ALIGN_DIV ;
   private String A522TBM32_CHK_TRUE_INNER_VALUE ;
   private String A523TBM32_CHK_FALSE_INNER_VALUE ;
   private String A527TBM32_FIXED_VALUE ;
   private String A525TBM32_LIST_CD ;
   private String A526TBM32_IMAGE_CD ;
   private String A524TBM32_TEXT ;
   private String A514TBM32_FONT_UL_FLG ;
   private String A519TBM32_LINE_START_POINT_DIV ;
   private String A520TBM32_LINE_END_POINT_DIV ;
   private String A692TBM32_TABSTOP_FLG ;
   private String A693TBM32_REQUIRED_INPUT_FLG ;
   private String A694TBM32_MIN_VALUE ;
   private String A695TBM32_MAX_VALUE ;
   private String A406TBM32_CRF_ITEM_NOTE ;
   private String A775TBM32_REF_CRF_ITEM_CD ;
   private String A75TBM32_DEL_FLG ;
   private String A408TBM32_CRT_USER_ID ;
   private String A409TBM32_CRT_PROG_NM ;
   private String A411TBM32_UPD_USER_ID ;
   private String A412TBM32_UPD_PROG_NM ;
   private String A502TBM33_COND_NM ;
   private String A414TBM33_EXPRESSION ;
   private String A503TBM33_COND_DIV ;
   private String A504TBM33_CRF_ITEM_CD ;
   private String A505TBM33_ERR_DIV ;
   private String A506TBM33_ERR_MSG ;
   private String A646TBM33_ENABLED_FLG ;
   private String A696TBM33_REQUIRED_INPUT_FLG ;
   private String A697TBM33_NUMERIC_RANGE_FLG ;
   private String A416TBM33_DEL_FLG ;
   private String A418TBM33_CRT_USER_ID ;
   private String A419TBM33_CRT_PROG_NM ;
   private String A421TBM33_UPD_USER_ID ;
   private String A422TBM33_UPD_PROG_NM ;
   private String A30TBM34_STYDY_AUTH_CD ;
   private String A571TBM34_DISPLAY_FLG ;
   private String A572TBM34_DEL_FLG ;
   private String A574TBM34_CRT_USER_ID ;
   private String A575TBM34_CRT_PROG_NM ;
   private String A577TBM34_UPD_USER_ID ;
   private String A578TBM34_UPD_PROG_NM ;
   private String A33TBM35_CRF_ITEM_CD ;
   private String A34TBM35_STUDY_AUTH_CD ;
   private String A580TBM35_DISPLAY_FLG ;
   private String A581TBM35_DEL_FLG ;
   private String A583TBM35_CRT_USER_ID ;
   private String A584TBM35_CRT_PROG_NM ;
   private String A586TBM35_UPD_USER_ID ;
   private String A587TBM35_UPD_PROG_NM ;
   private String A589TBM36_DEL_FLG ;
   private String A591TBM36_CRT_USER_ID ;
   private String A592TBM36_CRT_PROG_NM ;
   private String A594TBM36_UPD_USER_ID ;
   private String A595TBM36_UPD_PROG_NM ;
   private String A81TBM37_CRF_ITEM_GRP_DIV ;
   private String A82TBM37_CRF_ITEM_GRP_CD ;
   private String A84TBM37_DOM_CD ;
   private String A500TBM37_DOM_VAR_NM ;
   private String A85TBM37_DOM_ITM_GRP_OID ;
   private String A433TBM37_DEL_FLG ;
   private String A435TBM37_CRT_USER_ID ;
   private String A436TBM37_CRT_PROG_NM ;
   private String A438TBM37_UPD_USER_ID ;
   private String A439TBM37_UPD_PROG_NM ;
   private String A21TBM41_CRF_ITEM_GRP_DIV ;
   private String A22TBM41_CRF_ITEM_GRP_CD ;
   private String A424TBM41_NCM_METADATA_ID ;
   private String A425TBM41_DEL_FLG ;
   private String A427TBM41_CRT_USER_ID ;
   private String A428TBM41_CRT_PROG_NM ;
   private String A430TBM41_UPD_USER_ID ;
   private String A431TBM41_UPD_PROG_NM ;
   private String A204TBM42_DOM_CD ;
   private String A905TBM42_DOM_ENM ;
   private String A906TBM42_DOM_JNM ;
   private String A907TBM42_DOM_GRP_NM ;
   private String A908TBM42_NOTE ;
   private String A893TBM42_DEL_FLG ;
   private String A895TBM42_CRT_USER_ID ;
   private String A896TBM42_CRT_PROG_NM ;
   private String A898TBM42_UPD_USER_ID ;
   private String A899TBM42_UPD_PROG_NM ;
   private String A201TBM43_DOM_CD ;
   private String A202TBM43_DOM_VAR_NM ;
   private String A910TBM43_VAR_DESC ;
   private String A911TBM43_SDTM_FLG ;
   private String A912TBM43_CDASH_FLG ;
   private String A913TBM43_INPUT_TYPE_DIV ;
   private String A914TBM43_REQUIRED_FLG ;
   private String A915TBM43_SAS_FIELD_NM ;
   private String A916TBM43_ODM_DATA_TYPE ;
   private String A917TBM43_NOTE ;
   private String A933TBM43_VERSION ;
   private String A919TBM43_DEL_FLG ;
   private String A921TBM43_CRT_USER_ID ;
   private String A922TBM43_CRT_PROG_NM ;
   private String A924TBM43_UPD_USER_ID ;
   private String A925TBM43_UPD_PROG_NM ;
   private String A949TBM44_DEL_FLG ;
   private String A951TBM44_CRT_USER_ID ;
   private String A952TBM44_CRT_PROG_NM ;
   private String A954TBM44_UPD_USER_ID ;
   private String A955TBM44_UPD_PROG_NM ;
   private String A980TBM45_FILETR_NM ;
   private String A981TBM45_IN_CRF_ID ;
   private String A982TBM45_DEL_FLG ;
   private String A984TBM45_CRT_USER_ID ;
   private String A985TBM45_CRT_PROG_NM ;
   private String A987TBM45_UPD_USER_ID ;
   private String A988TBM45_UPD_PROG_NM ;
   private String A647TBT01_OUTER_SUBJECT_ID ;
   private String A698TBT01_SITE_ID ;
   private String A441TBT01_DEL_FLG ;
   private String A443TBT01_CRT_USER_ID ;
   private String A444TBT01_CRT_PROG_NM ;
   private String A446TBT01_UPD_USER_ID ;
   private String A447TBT01_UPD_PROG_NM ;
   private String A648TBT02_LOCK_FLG ;
   private String A650TBT02_LOCK_USER_ID ;
   private String A651TBT02_LOCK_AUTH_CD ;
   private String A653TBT02_UPLOAD_USER_ID ;
   private String A654TBT02_UPLOAD_AUTH_CD ;
   private String A655TBT02_DM_ARRIVAL_FLG ;
   private String A657TBT02_APPROVAL_FLG ;
   private String A659TBT02_APPROVAL_USER_ID ;
   private String A660TBT02_APPROVAL_AUTH_CD ;
   private String A990TBT02_SIGNATURE_FLG ;
   private String A992TBT02_SIGNATURE_USER_ID ;
   private String A661TBT02_INPUT_END_FLG ;
   private String A663TBT02_INPUT_END_USER_ID ;
   private String A664TBT02_INPUT_END_AUTH_CD ;
   private String A449TBT02_DEL_FLG ;
   private String A451TBT02_CRT_USER_ID ;
   private String A452TBT02_CRT_PROG_NM ;
   private String A454TBT02_UPD_USER_ID ;
   private String A455TBT02_UPD_PROG_NM ;
   private String A667TBT11_UPLOAD_USER_ID ;
   private String A668TBT11_UPLOAD_AUTH_CD ;
   private String A669TBT11_DM_ARRIVAL_FLG ;
   private String A671TBT11_APPROVAL_FLG ;
   private String A673TBT11_APPROVAL_USER_ID ;
   private String A674TBT11_APPROVAL_AUTH_CD ;
   private String A993TBT11_SIGNATURE_FLG ;
   private String A995TBT11_SIGNATURE_USER_ID ;
   private String A675TBT11_INPUT_END_FLG ;
   private String A677TBT11_INPUT_END_USER_ID ;
   private String A678TBT11_INPUT_END_AUTH_CD ;
   private String A891TBT11_UPD_RIYU ;
   private String A457TBT11_DEL_FLG ;
   private String A459TBT11_CRT_USER_ID ;
   private String A460TBT11_CRT_PROG_NM ;
   private String A462TBT11_UPD_USER_ID ;
   private String A463TBT11_UPD_PROG_NM ;
   private String A99TBT12_CRF_ITEM_GRP_DIV ;
   private String A100TBT12_CRF_ITEM_GRP_CD ;
   private String A465TBT12_CRF_VALUE ;
   private String A679TBT12_EDIT_FLG ;
   private String A473TBT12_DEL_FLG ;
   private String A467TBT12_CRT_USER_ID ;
   private String A468TBT12_CRT_PROG_NM ;
   private String A470TBT12_UPD_USER_ID ;
   private String A471TBT12_UPD_PROG_NM ;
   private String A105TBT13_CRF_ITEM_GRP_DIV ;
   private String A106TBT13_CRF_ITEM_GRP_CD ;
   private String A597TBT13_CRF_VALUE ;
   private String A680TBT13_EDIT_FLG ;
   private String A598TBT13_DEL_FLG ;
   private String A600TBT13_CRT_USER_ID ;
   private String A601TBT13_CRT_PROG_NM ;
   private String A603TBT13_UPD_USER_ID ;
   private String A604TBT13_UPD_PROG_NM ;
   private String A901TBT14_MEMO_KBN ;
   private String A477TBT14_MEMO ;
   private String A929TBT14_REQUEST_SITE_ID ;
   private String A930TBT14_REQUEST_AUTH_CD ;
   private String A931TBT14_CRT_AUTH_CD ;
   private String A927TBT14_KAKUNIN_FLG ;
   private String A928TBT14_KAKUNIN_USER_ID ;
   private String A934TBT14_KAKUNIN_COMMENT ;
   private String A902TBT14_KANRYO_FLG ;
   private String A479TBT14_DEL_FLG ;
   private String A481TBT14_CRT_USER_ID ;
   private String A482TBT14_CRT_PROG_NM ;
   private String A484TBT14_UPD_USER_ID ;
   private String A485TBT14_UPD_PROG_NM ;
   private String A903TBT15_CRF_ITEM_GRP_DIV ;
   private String A904TBT15_CRF_ITEM_GRP_CD ;
   private String A488TBT15_DEL_FLG ;
   private String A490TBT15_CRT_USER_ID ;
   private String A491TBT15_CRT_PROG_NM ;
   private String A493TBT15_UPD_USER_ID ;
   private String A494TBT15_UPD_PROG_NM ;
   private String AV27W_ERRCD ;
   private String AV29W_FILE_PATH ;
   private String AV37W_ZIP_FILENAME ;
   private String AV36W_ZIP_FILE_PATH ;
   private com.genexus.internet.HttpRequest AV40W_HTTPREQUEST ;
   private com.genexus.util.GXFile AV39W_FILE ;
   private String[] aP7 ;
   private String[] aP8 ;
   private IDataStoreProvider pr_default ;
   private long[] P007B2_A63TBM21_STUDY_ID ;
   private String[] P007B2_A367TBM21_STUDY_NM ;
   private boolean[] P007B2_n367TBM21_STUDY_NM ;
   private String[] P007B2_A530TBM21_OUTER_STUDY_ID ;
   private boolean[] P007B2_n530TBM21_OUTER_STUDY_ID ;
   private String[] P007B2_A531TBM21_PROC_NM ;
   private boolean[] P007B2_n531TBM21_PROC_NM ;
   private String[] P007B2_A368TBM21_NOTE ;
   private boolean[] P007B2_n368TBM21_NOTE ;
   private String[] P007B2_A607TBM21_STATUS ;
   private boolean[] P007B2_n607TBM21_STATUS ;
   private String[] P007B2_A369TBM21_DEL_FLG ;
   private boolean[] P007B2_n369TBM21_DEL_FLG ;
   private java.util.Date[] P007B2_A370TBM21_CRT_DATETIME ;
   private boolean[] P007B2_n370TBM21_CRT_DATETIME ;
   private String[] P007B2_A371TBM21_CRT_USER_ID ;
   private boolean[] P007B2_n371TBM21_CRT_USER_ID ;
   private String[] P007B2_A372TBM21_CRT_PROG_NM ;
   private boolean[] P007B2_n372TBM21_CRT_PROG_NM ;
   private java.util.Date[] P007B2_A373TBM21_UPD_DATETIME ;
   private boolean[] P007B2_n373TBM21_UPD_DATETIME ;
   private String[] P007B2_A374TBM21_UPD_USER_ID ;
   private boolean[] P007B2_n374TBM21_UPD_USER_ID ;
   private String[] P007B2_A375TBM21_UPD_PROG_NM ;
   private boolean[] P007B2_n375TBM21_UPD_PROG_NM ;
   private long[] P007B2_A376TBM21_UPD_CNT ;
   private boolean[] P007B2_n376TBM21_UPD_CNT ;
   private long[] P007B3_A17TBM22_STUDY_ID ;
   private String[] P007B3_A18TBM22_SITE_ID ;
   private String[] P007B3_A377TBM22_DEL_FLG ;
   private boolean[] P007B3_n377TBM22_DEL_FLG ;
   private java.util.Date[] P007B3_A378TBM22_CRT_DATETIME ;
   private boolean[] P007B3_n378TBM22_CRT_DATETIME ;
   private String[] P007B3_A379TBM22_CRT_USER_ID ;
   private boolean[] P007B3_n379TBM22_CRT_USER_ID ;
   private String[] P007B3_A380TBM22_CRT_PROG_NM ;
   private boolean[] P007B3_n380TBM22_CRT_PROG_NM ;
   private java.util.Date[] P007B3_A381TBM22_UPD_DATETIME ;
   private boolean[] P007B3_n381TBM22_UPD_DATETIME ;
   private String[] P007B3_A382TBM22_UPD_USER_ID ;
   private boolean[] P007B3_n382TBM22_UPD_USER_ID ;
   private String[] P007B3_A383TBM22_UPD_PROG_NM ;
   private boolean[] P007B3_n383TBM22_UPD_PROG_NM ;
   private long[] P007B3_A384TBM22_UPD_CNT ;
   private boolean[] P007B3_n384TBM22_UPD_CNT ;
   private long[] P007B4_A107TBM23_STUDY_ID ;
   private String[] P007B4_A108TBM23_USER_ID ;
   private String[] P007B4_A109TBM23_STYDY_AUTH_CD ;
   private String[] P007B4_A385TBM23_DEL_FLG ;
   private boolean[] P007B4_n385TBM23_DEL_FLG ;
   private java.util.Date[] P007B4_A386TBM23_CRT_DATETIME ;
   private boolean[] P007B4_n386TBM23_CRT_DATETIME ;
   private String[] P007B4_A387TBM23_CRT_USER_ID ;
   private boolean[] P007B4_n387TBM23_CRT_USER_ID ;
   private String[] P007B4_A388TBM23_CRT_PROG_NM ;
   private boolean[] P007B4_n388TBM23_CRT_PROG_NM ;
   private java.util.Date[] P007B4_A389TBM23_UPD_DATETIME ;
   private boolean[] P007B4_n389TBM23_UPD_DATETIME ;
   private String[] P007B4_A390TBM23_UPD_USER_ID ;
   private boolean[] P007B4_n390TBM23_UPD_USER_ID ;
   private String[] P007B4_A391TBM23_UPD_PROG_NM ;
   private boolean[] P007B4_n391TBM23_UPD_PROG_NM ;
   private long[] P007B4_A392TBM23_UPD_CNT ;
   private boolean[] P007B4_n392TBM23_UPD_CNT ;
   private long[] P007B5_A64TBM24_STUDY_ID ;
   private String[] P007B5_A65TBM24_DOM_CD ;
   private String[] P007B5_A66TBM24_DOM_VAR_NM ;
   private String[] P007B5_A702TBM24_DOM_ITM_GRP_OID ;
   private boolean[] P007B5_n702TBM24_DOM_ITM_GRP_OID ;
   private short[] P007B5_A703TBM24_DOM_ITM_GRP_ATTR_SEQ ;
   private boolean[] P007B5_n703TBM24_DOM_ITM_GRP_ATTR_SEQ ;
   private short[] P007B5_A704TBM24_DOM_ITM_GRP_ROWNO ;
   private boolean[] P007B5_n704TBM24_DOM_ITM_GRP_ROWNO ;
   private String[] P007B5_A705TBM24_CRF_ITEM_NM ;
   private boolean[] P007B5_n705TBM24_CRF_ITEM_NM ;
   private String[] P007B5_A67TBM24_CRF_ITEM_DIV ;
   private String[] P007B5_A635TBM24_IDENTIFICATION_CD ;
   private boolean[] P007B5_n635TBM24_IDENTIFICATION_CD ;
   private short[] P007B5_A636TBM24_TEXT_MAXLENGTH ;
   private boolean[] P007B5_n636TBM24_TEXT_MAXLENGTH ;
   private byte[] P007B5_A637TBM24_TEXT_MAXROWS ;
   private boolean[] P007B5_n637TBM24_TEXT_MAXROWS ;
   private byte[] P007B5_A638TBM24_DECIMAL_DIGITS ;
   private boolean[] P007B5_n638TBM24_DECIMAL_DIGITS ;
   private String[] P007B5_A639TBM24_TEXT ;
   private boolean[] P007B5_n639TBM24_TEXT ;
   private String[] P007B5_A640TBM24_FIXED_VALUE ;
   private boolean[] P007B5_n640TBM24_FIXED_VALUE ;
   private String[] P007B5_A641TBM24_CHK_FALSE_INNER_VALUE ;
   private boolean[] P007B5_n641TBM24_CHK_FALSE_INNER_VALUE ;
   private String[] P007B5_A706TBM24_REQUIRED_INPUT_FLG ;
   private boolean[] P007B5_n706TBM24_REQUIRED_INPUT_FLG ;
   private String[] P007B5_A707TBM24_MIN_VALUE ;
   private boolean[] P007B5_n707TBM24_MIN_VALUE ;
   private String[] P007B5_A708TBM24_MAX_VALUE ;
   private boolean[] P007B5_n708TBM24_MAX_VALUE ;
   private int[] P007B5_A543TBM24_ORDER ;
   private boolean[] P007B5_n543TBM24_ORDER ;
   private String[] P007B5_A544TBM24_DEL_FLG ;
   private boolean[] P007B5_n544TBM24_DEL_FLG ;
   private java.util.Date[] P007B5_A545TBM24_CRT_DATETIME ;
   private boolean[] P007B5_n545TBM24_CRT_DATETIME ;
   private String[] P007B5_A546TBM24_CRT_USER_ID ;
   private boolean[] P007B5_n546TBM24_CRT_USER_ID ;
   private String[] P007B5_A547TBM24_CRT_PROG_NM ;
   private boolean[] P007B5_n547TBM24_CRT_PROG_NM ;
   private java.util.Date[] P007B5_A548TBM24_UPD_DATETIME ;
   private boolean[] P007B5_n548TBM24_UPD_DATETIME ;
   private String[] P007B5_A549TBM24_UPD_USER_ID ;
   private boolean[] P007B5_n549TBM24_UPD_USER_ID ;
   private String[] P007B5_A550TBM24_UPD_PROG_NM ;
   private boolean[] P007B5_n550TBM24_UPD_PROG_NM ;
   private long[] P007B5_A551TBM24_UPD_CNT ;
   private boolean[] P007B5_n551TBM24_UPD_CNT ;
   private long[] P007B6_A23TBM25_STUDY_ID ;
   private String[] P007B6_A24TBM25_LIST_CD ;
   private String[] P007B6_A552TBM25_LIST_NM ;
   private boolean[] P007B6_n552TBM25_LIST_NM ;
   private String[] P007B6_A553TBM25_DEL_FLG ;
   private boolean[] P007B6_n553TBM25_DEL_FLG ;
   private java.util.Date[] P007B6_A554TBM25_CRT_DATETIME ;
   private boolean[] P007B6_n554TBM25_CRT_DATETIME ;
   private String[] P007B6_A555TBM25_CRT_USER_ID ;
   private boolean[] P007B6_n555TBM25_CRT_USER_ID ;
   private String[] P007B6_A556TBM25_CRT_PROG_NM ;
   private boolean[] P007B6_n556TBM25_CRT_PROG_NM ;
   private java.util.Date[] P007B6_A557TBM25_UPD_DATETIME ;
   private boolean[] P007B6_n557TBM25_UPD_DATETIME ;
   private String[] P007B6_A558TBM25_UPD_USER_ID ;
   private boolean[] P007B6_n558TBM25_UPD_USER_ID ;
   private String[] P007B6_A559TBM25_UPD_PROG_NM ;
   private boolean[] P007B6_n559TBM25_UPD_PROG_NM ;
   private long[] P007B6_A560TBM25_UPD_CNT ;
   private boolean[] P007B6_n560TBM25_UPD_CNT ;
   private long[] P007B7_A25TBM26_STUDY_ID ;
   private String[] P007B7_A26TBM26_LIST_CD ;
   private short[] P007B7_A27TBM26_LIST_ITEM_NO ;
   private String[] P007B7_A561TBM26_LIST_ITEM_NAME ;
   private boolean[] P007B7_n561TBM26_LIST_ITEM_NAME ;
   private String[] P007B7_A562TBM26_INNER_VALUE ;
   private boolean[] P007B7_n562TBM26_INNER_VALUE ;
   private String[] P007B7_A563TBM26_DEL_FLG ;
   private boolean[] P007B7_n563TBM26_DEL_FLG ;
   private java.util.Date[] P007B7_A564TBM26_CRT_DATETIME ;
   private boolean[] P007B7_n564TBM26_CRT_DATETIME ;
   private String[] P007B7_A565TBM26_CRT_USER_ID ;
   private boolean[] P007B7_n565TBM26_CRT_USER_ID ;
   private String[] P007B7_A566TBM26_CRT_PROG_NM ;
   private boolean[] P007B7_n566TBM26_CRT_PROG_NM ;
   private java.util.Date[] P007B7_A567TBM26_UPD_DATETIME ;
   private boolean[] P007B7_n567TBM26_UPD_DATETIME ;
   private String[] P007B7_A568TBM26_UPD_USER_ID ;
   private boolean[] P007B7_n568TBM26_UPD_USER_ID ;
   private String[] P007B7_A569TBM26_UPD_PROG_NM ;
   private boolean[] P007B7_n569TBM26_UPD_PROG_NM ;
   private long[] P007B7_A570TBM26_UPD_CNT ;
   private boolean[] P007B7_n570TBM26_UPD_CNT ;
   private short[] P007B8_A69TBM31_CRF_ID ;
   private long[] P007B8_A68TBM31_STUDY_ID ;
   private String[] P007B8_A393TBM31_CRF_NM ;
   private boolean[] P007B8_n393TBM31_CRF_NM ;
   private String[] P007B8_A642TBM31_CRF_SNM ;
   private boolean[] P007B8_n642TBM31_CRF_SNM ;
   private short[] P007B8_A394TBM31_GRID_SIZE ;
   private boolean[] P007B8_n394TBM31_GRID_SIZE ;
   private int[] P007B8_A528TBM31_DEF_VISIT_NO ;
   private boolean[] P007B8_n528TBM31_DEF_VISIT_NO ;
   private String[] P007B8_A529TBM31_DEF_DOMAIN_CD ;
   private boolean[] P007B8_n529TBM31_DEF_DOMAIN_CD ;
   private String[] P007B8_A643TBM31_STATUS ;
   private boolean[] P007B8_n643TBM31_STATUS ;
   private String[] P007B8_A396TBM31_NOTE ;
   private boolean[] P007B8_n396TBM31_NOTE ;
   private byte[] P007B8_A943TBM31_REPEAT_FLG ;
   private boolean[] P007B8_n943TBM31_REPEAT_FLG ;
   private byte[] P007B8_A944TBM31_REPEAT_MAX ;
   private boolean[] P007B8_n944TBM31_REPEAT_MAX ;
   private String[] P007B8_A979TBM31_DM_EXCP_NO_DISP_FLG ;
   private boolean[] P007B8_n979TBM31_DM_EXCP_NO_DISP_FLG ;
   private String[] P007B8_A397TBM31_DEL_FLG ;
   private boolean[] P007B8_n397TBM31_DEL_FLG ;
   private java.util.Date[] P007B8_A398TBM31_CRT_DATETIME ;
   private boolean[] P007B8_n398TBM31_CRT_DATETIME ;
   private String[] P007B8_A399TBM31_CRT_USER_ID ;
   private boolean[] P007B8_n399TBM31_CRT_USER_ID ;
   private String[] P007B8_A400TBM31_CRT_PROG_NM ;
   private boolean[] P007B8_n400TBM31_CRT_PROG_NM ;
   private java.util.Date[] P007B8_A401TBM31_UPD_DATETIME ;
   private boolean[] P007B8_n401TBM31_UPD_DATETIME ;
   private String[] P007B8_A402TBM31_UPD_USER_ID ;
   private boolean[] P007B8_n402TBM31_UPD_USER_ID ;
   private String[] P007B8_A403TBM31_UPD_PROG_NM ;
   private boolean[] P007B8_n403TBM31_UPD_PROG_NM ;
   private long[] P007B8_A404TBM31_UPD_CNT ;
   private boolean[] P007B8_n404TBM31_UPD_CNT ;
   private int[] P007B8_A395TBM31_ORDER ;
   private boolean[] P007B8_n395TBM31_ORDER ;
   private short[] P007B9_A71TBM32_CRF_ID ;
   private long[] P007B9_A70TBM32_STUDY_ID ;
   private String[] P007B9_A72TBM32_CRF_ITEM_CD ;
   private String[] P007B9_A405TBM32_CRF_ITEM_NM ;
   private boolean[] P007B9_n405TBM32_CRF_ITEM_NM ;
   private String[] P007B9_A74TBM32_CRF_ITEM_DIV ;
   private boolean[] P007B9_n74TBM32_CRF_ITEM_DIV ;
   private String[] P007B9_A73TBM32_CRF_ITEM_GRP_CD ;
   private boolean[] P007B9_n73TBM32_CRF_ITEM_GRP_CD ;
   private short[] P007B9_A507TBM32_CRF_ITEM_GRP_ORDER ;
   private boolean[] P007B9_n507TBM32_CRF_ITEM_GRP_ORDER ;
   private short[] P007B9_A508TBM32_LOCATION_X ;
   private boolean[] P007B9_n508TBM32_LOCATION_X ;
   private short[] P007B9_A509TBM32_LOCATION_Y ;
   private boolean[] P007B9_n509TBM32_LOCATION_Y ;
   private short[] P007B9_A510TBM32_LOCATION_X2 ;
   private boolean[] P007B9_n510TBM32_LOCATION_X2 ;
   private short[] P007B9_A511TBM32_LOCATION_Y2 ;
   private boolean[] P007B9_n511TBM32_LOCATION_Y2 ;
   private String[] P007B9_A512TBM32_TEXT_ALIGN_DIV ;
   private boolean[] P007B9_n512TBM32_TEXT_ALIGN_DIV ;
   private byte[] P007B9_A516TBM32_TEXT_MAXROWS ;
   private boolean[] P007B9_n516TBM32_TEXT_MAXROWS ;
   private short[] P007B9_A517TBM32_TEXT_MAXLENGTH ;
   private boolean[] P007B9_n517TBM32_TEXT_MAXLENGTH ;
   private byte[] P007B9_A518TBM32_DECIMAL_DIGITS ;
   private boolean[] P007B9_n518TBM32_DECIMAL_DIGITS ;
   private String[] P007B9_A522TBM32_CHK_TRUE_INNER_VALUE ;
   private boolean[] P007B9_n522TBM32_CHK_TRUE_INNER_VALUE ;
   private String[] P007B9_A523TBM32_CHK_FALSE_INNER_VALUE ;
   private boolean[] P007B9_n523TBM32_CHK_FALSE_INNER_VALUE ;
   private String[] P007B9_A527TBM32_FIXED_VALUE ;
   private boolean[] P007B9_n527TBM32_FIXED_VALUE ;
   private String[] P007B9_A525TBM32_LIST_CD ;
   private boolean[] P007B9_n525TBM32_LIST_CD ;
   private String[] P007B9_A526TBM32_IMAGE_CD ;
   private boolean[] P007B9_n526TBM32_IMAGE_CD ;
   private String[] P007B9_A524TBM32_TEXT ;
   private boolean[] P007B9_n524TBM32_TEXT ;
   private byte[] P007B9_A513TBM32_FONT_SIZE ;
   private boolean[] P007B9_n513TBM32_FONT_SIZE ;
   private String[] P007B9_A514TBM32_FONT_UL_FLG ;
   private boolean[] P007B9_n514TBM32_FONT_UL_FLG ;
   private long[] P007B9_A515TBM32_FONT_COLOR_DIV ;
   private boolean[] P007B9_n515TBM32_FONT_COLOR_DIV ;
   private byte[] P007B9_A521TBM32_LINE_SIZE_DIV ;
   private boolean[] P007B9_n521TBM32_LINE_SIZE_DIV ;
   private long[] P007B9_A689TBM32_LINE_COLOR_DIV ;
   private boolean[] P007B9_n689TBM32_LINE_COLOR_DIV ;
   private String[] P007B9_A519TBM32_LINE_START_POINT_DIV ;
   private boolean[] P007B9_n519TBM32_LINE_START_POINT_DIV ;
   private String[] P007B9_A520TBM32_LINE_END_POINT_DIV ;
   private boolean[] P007B9_n520TBM32_LINE_END_POINT_DIV ;
   private short[] P007B9_A690TBM32_LINE_ANGLE ;
   private boolean[] P007B9_n690TBM32_LINE_ANGLE ;
   private byte[] P007B9_A644TBM32_AUTH_LVL_MIN ;
   private boolean[] P007B9_n644TBM32_AUTH_LVL_MIN ;
   private short[] P007B9_A645TBM32_ZORDER ;
   private boolean[] P007B9_n645TBM32_ZORDER ;
   private short[] P007B9_A691TBM32_TAB_ORDER ;
   private boolean[] P007B9_n691TBM32_TAB_ORDER ;
   private String[] P007B9_A692TBM32_TABSTOP_FLG ;
   private boolean[] P007B9_n692TBM32_TABSTOP_FLG ;
   private String[] P007B9_A693TBM32_REQUIRED_INPUT_FLG ;
   private boolean[] P007B9_n693TBM32_REQUIRED_INPUT_FLG ;
   private String[] P007B9_A694TBM32_MIN_VALUE ;
   private boolean[] P007B9_n694TBM32_MIN_VALUE ;
   private String[] P007B9_A695TBM32_MAX_VALUE ;
   private boolean[] P007B9_n695TBM32_MAX_VALUE ;
   private String[] P007B9_A406TBM32_CRF_ITEM_NOTE ;
   private boolean[] P007B9_n406TBM32_CRF_ITEM_NOTE ;
   private short[] P007B9_A774TBM32_REF_CRF_ID ;
   private boolean[] P007B9_n774TBM32_REF_CRF_ID ;
   private String[] P007B9_A775TBM32_REF_CRF_ITEM_CD ;
   private boolean[] P007B9_n775TBM32_REF_CRF_ITEM_CD ;
   private String[] P007B9_A75TBM32_DEL_FLG ;
   private boolean[] P007B9_n75TBM32_DEL_FLG ;
   private java.util.Date[] P007B9_A407TBM32_CRT_DATETIME ;
   private boolean[] P007B9_n407TBM32_CRT_DATETIME ;
   private String[] P007B9_A408TBM32_CRT_USER_ID ;
   private boolean[] P007B9_n408TBM32_CRT_USER_ID ;
   private String[] P007B9_A409TBM32_CRT_PROG_NM ;
   private boolean[] P007B9_n409TBM32_CRT_PROG_NM ;
   private java.util.Date[] P007B9_A410TBM32_UPD_DATETIME ;
   private boolean[] P007B9_n410TBM32_UPD_DATETIME ;
   private String[] P007B9_A411TBM32_UPD_USER_ID ;
   private boolean[] P007B9_n411TBM32_UPD_USER_ID ;
   private String[] P007B9_A412TBM32_UPD_PROG_NM ;
   private boolean[] P007B9_n412TBM32_UPD_PROG_NM ;
   private long[] P007B9_A413TBM32_UPD_CNT ;
   private boolean[] P007B9_n413TBM32_UPD_CNT ;
   private short[] P007B10_A77TBM33_CRF_ID ;
   private long[] P007B10_A76TBM33_STUDY_ID ;
   private short[] P007B10_A78TBM33_COND_NO ;
   private String[] P007B10_A502TBM33_COND_NM ;
   private boolean[] P007B10_n502TBM33_COND_NM ;
   private String[] P007B10_A414TBM33_EXPRESSION ;
   private boolean[] P007B10_n414TBM33_EXPRESSION ;
   private String[] P007B10_A503TBM33_COND_DIV ;
   private boolean[] P007B10_n503TBM33_COND_DIV ;
   private String[] P007B10_A504TBM33_CRF_ITEM_CD ;
   private boolean[] P007B10_n504TBM33_CRF_ITEM_CD ;
   private short[] P007B10_A415TBM33_PRIOR_NO ;
   private boolean[] P007B10_n415TBM33_PRIOR_NO ;
   private String[] P007B10_A505TBM33_ERR_DIV ;
   private boolean[] P007B10_n505TBM33_ERR_DIV ;
   private String[] P007B10_A506TBM33_ERR_MSG ;
   private boolean[] P007B10_n506TBM33_ERR_MSG ;
   private String[] P007B10_A646TBM33_ENABLED_FLG ;
   private boolean[] P007B10_n646TBM33_ENABLED_FLG ;
   private String[] P007B10_A696TBM33_REQUIRED_INPUT_FLG ;
   private boolean[] P007B10_n696TBM33_REQUIRED_INPUT_FLG ;
   private String[] P007B10_A697TBM33_NUMERIC_RANGE_FLG ;
   private boolean[] P007B10_n697TBM33_NUMERIC_RANGE_FLG ;
   private String[] P007B10_A416TBM33_DEL_FLG ;
   private boolean[] P007B10_n416TBM33_DEL_FLG ;
   private java.util.Date[] P007B10_A417TBM33_CRT_DATETIME ;
   private boolean[] P007B10_n417TBM33_CRT_DATETIME ;
   private String[] P007B10_A418TBM33_CRT_USER_ID ;
   private boolean[] P007B10_n418TBM33_CRT_USER_ID ;
   private String[] P007B10_A419TBM33_CRT_PROG_NM ;
   private boolean[] P007B10_n419TBM33_CRT_PROG_NM ;
   private java.util.Date[] P007B10_A420TBM33_UPD_DATETIME ;
   private boolean[] P007B10_n420TBM33_UPD_DATETIME ;
   private String[] P007B10_A421TBM33_UPD_USER_ID ;
   private boolean[] P007B10_n421TBM33_UPD_USER_ID ;
   private String[] P007B10_A422TBM33_UPD_PROG_NM ;
   private boolean[] P007B10_n422TBM33_UPD_PROG_NM ;
   private long[] P007B10_A423TBM33_UPD_CNT ;
   private boolean[] P007B10_n423TBM33_UPD_CNT ;
   private short[] P007B11_A29TBM34_CRF_ID ;
   private long[] P007B11_A28TBM34_STUDY_ID ;
   private String[] P007B11_A30TBM34_STYDY_AUTH_CD ;
   private String[] P007B11_A571TBM34_DISPLAY_FLG ;
   private boolean[] P007B11_n571TBM34_DISPLAY_FLG ;
   private String[] P007B11_A572TBM34_DEL_FLG ;
   private boolean[] P007B11_n572TBM34_DEL_FLG ;
   private java.util.Date[] P007B11_A573TBM34_CRT_DATETIME ;
   private boolean[] P007B11_n573TBM34_CRT_DATETIME ;
   private String[] P007B11_A574TBM34_CRT_USER_ID ;
   private boolean[] P007B11_n574TBM34_CRT_USER_ID ;
   private String[] P007B11_A575TBM34_CRT_PROG_NM ;
   private boolean[] P007B11_n575TBM34_CRT_PROG_NM ;
   private java.util.Date[] P007B11_A576TBM34_UPD_DATETIME ;
   private boolean[] P007B11_n576TBM34_UPD_DATETIME ;
   private String[] P007B11_A577TBM34_UPD_USER_ID ;
   private boolean[] P007B11_n577TBM34_UPD_USER_ID ;
   private String[] P007B11_A578TBM34_UPD_PROG_NM ;
   private boolean[] P007B11_n578TBM34_UPD_PROG_NM ;
   private long[] P007B11_A579TBM34_UPD_CNT ;
   private boolean[] P007B11_n579TBM34_UPD_CNT ;
   private short[] P007B12_A32TBM35_CRF_ID ;
   private long[] P007B12_A31TBM35_STUDY_ID ;
   private String[] P007B12_A33TBM35_CRF_ITEM_CD ;
   private String[] P007B12_A34TBM35_STUDY_AUTH_CD ;
   private String[] P007B12_A580TBM35_DISPLAY_FLG ;
   private boolean[] P007B12_n580TBM35_DISPLAY_FLG ;
   private String[] P007B12_A581TBM35_DEL_FLG ;
   private boolean[] P007B12_n581TBM35_DEL_FLG ;
   private java.util.Date[] P007B12_A582TBM35_CRT_DATETIME ;
   private boolean[] P007B12_n582TBM35_CRT_DATETIME ;
   private String[] P007B12_A583TBM35_CRT_USER_ID ;
   private boolean[] P007B12_n583TBM35_CRT_USER_ID ;
   private String[] P007B12_A584TBM35_CRT_PROG_NM ;
   private boolean[] P007B12_n584TBM35_CRT_PROG_NM ;
   private java.util.Date[] P007B12_A585TBM35_UPD_DATETIME ;
   private boolean[] P007B12_n585TBM35_UPD_DATETIME ;
   private String[] P007B12_A586TBM35_UPD_USER_ID ;
   private boolean[] P007B12_n586TBM35_UPD_USER_ID ;
   private String[] P007B12_A587TBM35_UPD_PROG_NM ;
   private boolean[] P007B12_n587TBM35_UPD_PROG_NM ;
   private long[] P007B12_A588TBM35_UPD_CNT ;
   private boolean[] P007B12_n588TBM35_UPD_CNT ;
   private short[] P007B13_A36TBM36_CRF_ID ;
   private long[] P007B13_A35TBM36_STUDY_ID ;
   private short[] P007B13_A37TBM36_COND_NO ;
   private short[] P007B13_A38TBM36_SELECT_CRF_ID ;
   private String[] P007B13_A589TBM36_DEL_FLG ;
   private boolean[] P007B13_n589TBM36_DEL_FLG ;
   private java.util.Date[] P007B13_A590TBM36_CRT_DATETIME ;
   private boolean[] P007B13_n590TBM36_CRT_DATETIME ;
   private String[] P007B13_A591TBM36_CRT_USER_ID ;
   private boolean[] P007B13_n591TBM36_CRT_USER_ID ;
   private String[] P007B13_A592TBM36_CRT_PROG_NM ;
   private boolean[] P007B13_n592TBM36_CRT_PROG_NM ;
   private java.util.Date[] P007B13_A593TBM36_UPD_DATETIME ;
   private boolean[] P007B13_n593TBM36_UPD_DATETIME ;
   private String[] P007B13_A594TBM36_UPD_USER_ID ;
   private boolean[] P007B13_n594TBM36_UPD_USER_ID ;
   private String[] P007B13_A595TBM36_UPD_PROG_NM ;
   private boolean[] P007B13_n595TBM36_UPD_PROG_NM ;
   private long[] P007B13_A596TBM36_UPD_CNT ;
   private boolean[] P007B13_n596TBM36_UPD_CNT ;
   private short[] P007B14_A80TBM37_CRF_ID ;
   private long[] P007B14_A79TBM37_STUDY_ID ;
   private String[] P007B14_A81TBM37_CRF_ITEM_GRP_DIV ;
   private String[] P007B14_A82TBM37_CRF_ITEM_GRP_CD ;
   private int[] P007B14_A83TBM37_VISIT_NO ;
   private boolean[] P007B14_n83TBM37_VISIT_NO ;
   private String[] P007B14_A84TBM37_DOM_CD ;
   private boolean[] P007B14_n84TBM37_DOM_CD ;
   private String[] P007B14_A500TBM37_DOM_VAR_NM ;
   private boolean[] P007B14_n500TBM37_DOM_VAR_NM ;
   private String[] P007B14_A85TBM37_DOM_ITM_GRP_OID ;
   private boolean[] P007B14_n85TBM37_DOM_ITM_GRP_OID ;
   private short[] P007B14_A501TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private boolean[] P007B14_n501TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private short[] P007B14_A86TBM37_DOM_ITM_GRP_ROWNO ;
   private boolean[] P007B14_n86TBM37_DOM_ITM_GRP_ROWNO ;
   private String[] P007B14_A433TBM37_DEL_FLG ;
   private boolean[] P007B14_n433TBM37_DEL_FLG ;
   private java.util.Date[] P007B14_A434TBM37_CRT_DATETIME ;
   private boolean[] P007B14_n434TBM37_CRT_DATETIME ;
   private String[] P007B14_A435TBM37_CRT_USER_ID ;
   private boolean[] P007B14_n435TBM37_CRT_USER_ID ;
   private String[] P007B14_A436TBM37_CRT_PROG_NM ;
   private boolean[] P007B14_n436TBM37_CRT_PROG_NM ;
   private java.util.Date[] P007B14_A437TBM37_UPD_DATETIME ;
   private boolean[] P007B14_n437TBM37_UPD_DATETIME ;
   private String[] P007B14_A438TBM37_UPD_USER_ID ;
   private boolean[] P007B14_n438TBM37_UPD_USER_ID ;
   private String[] P007B14_A439TBM37_UPD_PROG_NM ;
   private boolean[] P007B14_n439TBM37_UPD_PROG_NM ;
   private long[] P007B14_A440TBM37_UPD_CNT ;
   private boolean[] P007B14_n440TBM37_UPD_CNT ;
   private short[] P007B15_A20TBM41_CRF_ID ;
   private long[] P007B15_A19TBM41_STUDY_ID ;
   private String[] P007B15_A21TBM41_CRF_ITEM_GRP_DIV ;
   private String[] P007B15_A22TBM41_CRF_ITEM_GRP_CD ;
   private String[] P007B15_A424TBM41_NCM_METADATA_ID ;
   private boolean[] P007B15_n424TBM41_NCM_METADATA_ID ;
   private String[] P007B15_A425TBM41_DEL_FLG ;
   private boolean[] P007B15_n425TBM41_DEL_FLG ;
   private java.util.Date[] P007B15_A426TBM41_CRT_DATETIME ;
   private boolean[] P007B15_n426TBM41_CRT_DATETIME ;
   private String[] P007B15_A427TBM41_CRT_USER_ID ;
   private boolean[] P007B15_n427TBM41_CRT_USER_ID ;
   private String[] P007B15_A428TBM41_CRT_PROG_NM ;
   private boolean[] P007B15_n428TBM41_CRT_PROG_NM ;
   private java.util.Date[] P007B15_A429TBM41_UPD_DATETIME ;
   private boolean[] P007B15_n429TBM41_UPD_DATETIME ;
   private String[] P007B15_A430TBM41_UPD_USER_ID ;
   private boolean[] P007B15_n430TBM41_UPD_USER_ID ;
   private String[] P007B15_A431TBM41_UPD_PROG_NM ;
   private boolean[] P007B15_n431TBM41_UPD_PROG_NM ;
   private long[] P007B15_A432TBM41_UPD_CNT ;
   private boolean[] P007B15_n432TBM41_UPD_CNT ;
   private long[] P007B16_A203TBM42_STUDY_ID ;
   private String[] P007B16_A204TBM42_DOM_CD ;
   private String[] P007B16_A905TBM42_DOM_ENM ;
   private boolean[] P007B16_n905TBM42_DOM_ENM ;
   private String[] P007B16_A906TBM42_DOM_JNM ;
   private boolean[] P007B16_n906TBM42_DOM_JNM ;
   private String[] P007B16_A907TBM42_DOM_GRP_NM ;
   private boolean[] P007B16_n907TBM42_DOM_GRP_NM ;
   private String[] P007B16_A908TBM42_NOTE ;
   private boolean[] P007B16_n908TBM42_NOTE ;
   private int[] P007B16_A909TBM42_ORDER ;
   private boolean[] P007B16_n909TBM42_ORDER ;
   private String[] P007B16_A893TBM42_DEL_FLG ;
   private boolean[] P007B16_n893TBM42_DEL_FLG ;
   private java.util.Date[] P007B16_A894TBM42_CRT_DATETIME ;
   private boolean[] P007B16_n894TBM42_CRT_DATETIME ;
   private String[] P007B16_A895TBM42_CRT_USER_ID ;
   private boolean[] P007B16_n895TBM42_CRT_USER_ID ;
   private String[] P007B16_A896TBM42_CRT_PROG_NM ;
   private boolean[] P007B16_n896TBM42_CRT_PROG_NM ;
   private java.util.Date[] P007B16_A897TBM42_UPD_DATETIME ;
   private boolean[] P007B16_n897TBM42_UPD_DATETIME ;
   private String[] P007B16_A898TBM42_UPD_USER_ID ;
   private boolean[] P007B16_n898TBM42_UPD_USER_ID ;
   private String[] P007B16_A899TBM42_UPD_PROG_NM ;
   private boolean[] P007B16_n899TBM42_UPD_PROG_NM ;
   private long[] P007B16_A900TBM42_UPD_CNT ;
   private boolean[] P007B16_n900TBM42_UPD_CNT ;
   private long[] P007B17_A200TBM43_STUDY_ID ;
   private String[] P007B17_A201TBM43_DOM_CD ;
   private String[] P007B17_A202TBM43_DOM_VAR_NM ;
   private String[] P007B17_A910TBM43_VAR_DESC ;
   private boolean[] P007B17_n910TBM43_VAR_DESC ;
   private String[] P007B17_A911TBM43_SDTM_FLG ;
   private boolean[] P007B17_n911TBM43_SDTM_FLG ;
   private String[] P007B17_A912TBM43_CDASH_FLG ;
   private boolean[] P007B17_n912TBM43_CDASH_FLG ;
   private String[] P007B17_A913TBM43_INPUT_TYPE_DIV ;
   private boolean[] P007B17_n913TBM43_INPUT_TYPE_DIV ;
   private String[] P007B17_A914TBM43_REQUIRED_FLG ;
   private boolean[] P007B17_n914TBM43_REQUIRED_FLG ;
   private String[] P007B17_A915TBM43_SAS_FIELD_NM ;
   private boolean[] P007B17_n915TBM43_SAS_FIELD_NM ;
   private String[] P007B17_A916TBM43_ODM_DATA_TYPE ;
   private boolean[] P007B17_n916TBM43_ODM_DATA_TYPE ;
   private String[] P007B17_A917TBM43_NOTE ;
   private boolean[] P007B17_n917TBM43_NOTE ;
   private int[] P007B17_A918TBM43_ORDER ;
   private boolean[] P007B17_n918TBM43_ORDER ;
   private String[] P007B17_A933TBM43_VERSION ;
   private boolean[] P007B17_n933TBM43_VERSION ;
   private String[] P007B17_A919TBM43_DEL_FLG ;
   private boolean[] P007B17_n919TBM43_DEL_FLG ;
   private java.util.Date[] P007B17_A920TBM43_CRT_DATETIME ;
   private boolean[] P007B17_n920TBM43_CRT_DATETIME ;
   private String[] P007B17_A921TBM43_CRT_USER_ID ;
   private boolean[] P007B17_n921TBM43_CRT_USER_ID ;
   private String[] P007B17_A922TBM43_CRT_PROG_NM ;
   private boolean[] P007B17_n922TBM43_CRT_PROG_NM ;
   private java.util.Date[] P007B17_A923TBM43_UPD_DATETIME ;
   private boolean[] P007B17_n923TBM43_UPD_DATETIME ;
   private String[] P007B17_A924TBM43_UPD_USER_ID ;
   private boolean[] P007B17_n924TBM43_UPD_USER_ID ;
   private String[] P007B17_A925TBM43_UPD_PROG_NM ;
   private boolean[] P007B17_n925TBM43_UPD_PROG_NM ;
   private long[] P007B17_A926TBM43_UPD_CNT ;
   private boolean[] P007B17_n926TBM43_UPD_CNT ;
   private short[] P007B18_A946TBM44_CRF_ID ;
   private long[] P007B18_A945TBM44_STUDY_ID ;
   private byte[] P007B18_A947TBM44_CRF_EDA_NO ;
   private int[] P007B18_A948TBM44_VISIT_NO ;
   private boolean[] P007B18_n948TBM44_VISIT_NO ;
   private String[] P007B18_A949TBM44_DEL_FLG ;
   private boolean[] P007B18_n949TBM44_DEL_FLG ;
   private java.util.Date[] P007B18_A950TBM44_CRT_DATETIME ;
   private boolean[] P007B18_n950TBM44_CRT_DATETIME ;
   private String[] P007B18_A951TBM44_CRT_USER_ID ;
   private boolean[] P007B18_n951TBM44_CRT_USER_ID ;
   private String[] P007B18_A952TBM44_CRT_PROG_NM ;
   private boolean[] P007B18_n952TBM44_CRT_PROG_NM ;
   private java.util.Date[] P007B18_A953TBM44_UPD_DATETIME ;
   private boolean[] P007B18_n953TBM44_UPD_DATETIME ;
   private String[] P007B18_A954TBM44_UPD_USER_ID ;
   private boolean[] P007B18_n954TBM44_UPD_USER_ID ;
   private String[] P007B18_A955TBM44_UPD_PROG_NM ;
   private boolean[] P007B18_n955TBM44_UPD_PROG_NM ;
   private long[] P007B18_A956TBM44_UPD_CNT ;
   private boolean[] P007B18_n956TBM44_UPD_CNT ;
   private long[] P007B19_A977TBM45_STUDY_ID ;
   private short[] P007B19_A978TBM45_FILTER_NO ;
   private String[] P007B19_A980TBM45_FILETR_NM ;
   private boolean[] P007B19_n980TBM45_FILETR_NM ;
   private String[] P007B19_A981TBM45_IN_CRF_ID ;
   private boolean[] P007B19_n981TBM45_IN_CRF_ID ;
   private String[] P007B19_A982TBM45_DEL_FLG ;
   private boolean[] P007B19_n982TBM45_DEL_FLG ;
   private java.util.Date[] P007B19_A983TBM45_CRT_DATETIME ;
   private boolean[] P007B19_n983TBM45_CRT_DATETIME ;
   private String[] P007B19_A984TBM45_CRT_USER_ID ;
   private boolean[] P007B19_n984TBM45_CRT_USER_ID ;
   private String[] P007B19_A985TBM45_CRT_PROG_NM ;
   private boolean[] P007B19_n985TBM45_CRT_PROG_NM ;
   private java.util.Date[] P007B19_A986TBM45_UPD_DATETIME ;
   private boolean[] P007B19_n986TBM45_UPD_DATETIME ;
   private String[] P007B19_A987TBM45_UPD_USER_ID ;
   private boolean[] P007B19_n987TBM45_UPD_USER_ID ;
   private String[] P007B19_A988TBM45_UPD_PROG_NM ;
   private boolean[] P007B19_n988TBM45_UPD_PROG_NM ;
   private long[] P007B19_A989TBM45_UPD_CNT ;
   private boolean[] P007B19_n989TBM45_UPD_CNT ;
   private long[] P007B20_A87TBT01_STUDY_ID ;
   private int[] P007B20_A88TBT01_SUBJECT_ID ;
   private String[] P007B20_A647TBT01_OUTER_SUBJECT_ID ;
   private boolean[] P007B20_n647TBT01_OUTER_SUBJECT_ID ;
   private String[] P007B20_A698TBT01_SITE_ID ;
   private boolean[] P007B20_n698TBT01_SITE_ID ;
   private String[] P007B20_A441TBT01_DEL_FLG ;
   private boolean[] P007B20_n441TBT01_DEL_FLG ;
   private java.util.Date[] P007B20_A442TBT01_CRT_DATETIME ;
   private boolean[] P007B20_n442TBT01_CRT_DATETIME ;
   private String[] P007B20_A443TBT01_CRT_USER_ID ;
   private boolean[] P007B20_n443TBT01_CRT_USER_ID ;
   private String[] P007B20_A444TBT01_CRT_PROG_NM ;
   private boolean[] P007B20_n444TBT01_CRT_PROG_NM ;
   private java.util.Date[] P007B20_A445TBT01_UPD_DATETIME ;
   private boolean[] P007B20_n445TBT01_UPD_DATETIME ;
   private String[] P007B20_A446TBT01_UPD_USER_ID ;
   private boolean[] P007B20_n446TBT01_UPD_USER_ID ;
   private String[] P007B20_A447TBT01_UPD_PROG_NM ;
   private boolean[] P007B20_n447TBT01_UPD_PROG_NM ;
   private long[] P007B20_A448TBT01_UPD_CNT ;
   private boolean[] P007B20_n448TBT01_UPD_CNT ;
   private short[] P007B21_A91TBT02_CRF_ID ;
   private long[] P007B21_A89TBT02_STUDY_ID ;
   private int[] P007B21_A90TBT02_SUBJECT_ID ;
   private byte[] P007B21_A935TBT02_CRF_EDA_NO ;
   private short[] P007B21_A498TBT02_CRF_LATEST_VERSION ;
   private boolean[] P007B21_n498TBT02_CRF_LATEST_VERSION ;
   private byte[] P007B21_A499TBT02_CRF_INPUT_LEVEL ;
   private boolean[] P007B21_n499TBT02_CRF_INPUT_LEVEL ;
   private String[] P007B21_A648TBT02_LOCK_FLG ;
   private boolean[] P007B21_n648TBT02_LOCK_FLG ;
   private java.util.Date[] P007B21_A649TBT02_LOCK_DATETIME ;
   private boolean[] P007B21_n649TBT02_LOCK_DATETIME ;
   private String[] P007B21_A650TBT02_LOCK_USER_ID ;
   private boolean[] P007B21_n650TBT02_LOCK_USER_ID ;
   private String[] P007B21_A651TBT02_LOCK_AUTH_CD ;
   private boolean[] P007B21_n651TBT02_LOCK_AUTH_CD ;
   private java.util.Date[] P007B21_A652TBT02_UPLOAD_DATETIME ;
   private boolean[] P007B21_n652TBT02_UPLOAD_DATETIME ;
   private String[] P007B21_A653TBT02_UPLOAD_USER_ID ;
   private boolean[] P007B21_n653TBT02_UPLOAD_USER_ID ;
   private String[] P007B21_A654TBT02_UPLOAD_AUTH_CD ;
   private boolean[] P007B21_n654TBT02_UPLOAD_AUTH_CD ;
   private String[] P007B21_A655TBT02_DM_ARRIVAL_FLG ;
   private boolean[] P007B21_n655TBT02_DM_ARRIVAL_FLG ;
   private java.util.Date[] P007B21_A656TBT02_DM_ARRIVAL_DATETIME ;
   private boolean[] P007B21_n656TBT02_DM_ARRIVAL_DATETIME ;
   private String[] P007B21_A657TBT02_APPROVAL_FLG ;
   private boolean[] P007B21_n657TBT02_APPROVAL_FLG ;
   private java.util.Date[] P007B21_A658TBT02_APPROVAL_DATETIME ;
   private boolean[] P007B21_n658TBT02_APPROVAL_DATETIME ;
   private String[] P007B21_A659TBT02_APPROVAL_USER_ID ;
   private boolean[] P007B21_n659TBT02_APPROVAL_USER_ID ;
   private String[] P007B21_A660TBT02_APPROVAL_AUTH_CD ;
   private boolean[] P007B21_n660TBT02_APPROVAL_AUTH_CD ;
   private String[] P007B21_A990TBT02_SIGNATURE_FLG ;
   private boolean[] P007B21_n990TBT02_SIGNATURE_FLG ;
   private java.util.Date[] P007B21_A991TBT02_SIGNATURE_DATETIME ;
   private boolean[] P007B21_n991TBT02_SIGNATURE_DATETIME ;
   private String[] P007B21_A992TBT02_SIGNATURE_USER_ID ;
   private boolean[] P007B21_n992TBT02_SIGNATURE_USER_ID ;
   private String[] P007B21_A661TBT02_INPUT_END_FLG ;
   private boolean[] P007B21_n661TBT02_INPUT_END_FLG ;
   private java.util.Date[] P007B21_A662TBT02_INPUT_END_DATETIME ;
   private boolean[] P007B21_n662TBT02_INPUT_END_DATETIME ;
   private String[] P007B21_A663TBT02_INPUT_END_USER_ID ;
   private boolean[] P007B21_n663TBT02_INPUT_END_USER_ID ;
   private String[] P007B21_A664TBT02_INPUT_END_AUTH_CD ;
   private boolean[] P007B21_n664TBT02_INPUT_END_AUTH_CD ;
   private String[] P007B21_A449TBT02_DEL_FLG ;
   private boolean[] P007B21_n449TBT02_DEL_FLG ;
   private java.util.Date[] P007B21_A450TBT02_CRT_DATETIME ;
   private boolean[] P007B21_n450TBT02_CRT_DATETIME ;
   private String[] P007B21_A451TBT02_CRT_USER_ID ;
   private boolean[] P007B21_n451TBT02_CRT_USER_ID ;
   private String[] P007B21_A452TBT02_CRT_PROG_NM ;
   private boolean[] P007B21_n452TBT02_CRT_PROG_NM ;
   private java.util.Date[] P007B21_A453TBT02_UPD_DATETIME ;
   private boolean[] P007B21_n453TBT02_UPD_DATETIME ;
   private String[] P007B21_A454TBT02_UPD_USER_ID ;
   private boolean[] P007B21_n454TBT02_UPD_USER_ID ;
   private String[] P007B21_A455TBT02_UPD_PROG_NM ;
   private boolean[] P007B21_n455TBT02_UPD_PROG_NM ;
   private long[] P007B21_A456TBT02_UPD_CNT ;
   private boolean[] P007B21_n456TBT02_UPD_CNT ;
   private short[] P007B22_A94TBT11_CRF_ID ;
   private long[] P007B22_A92TBT11_STUDY_ID ;
   private int[] P007B22_A93TBT11_SUBJECT_ID ;
   private byte[] P007B22_A936TBT11_CRF_EDA_NO ;
   private short[] P007B22_A95TBT11_CRF_VERSION ;
   private byte[] P007B22_A665TBT11_CRF_INPUT_LEVEL ;
   private boolean[] P007B22_n665TBT11_CRF_INPUT_LEVEL ;
   private java.util.Date[] P007B22_A666TBT11_UPLOAD_DATETIME ;
   private boolean[] P007B22_n666TBT11_UPLOAD_DATETIME ;
   private String[] P007B22_A667TBT11_UPLOAD_USER_ID ;
   private boolean[] P007B22_n667TBT11_UPLOAD_USER_ID ;
   private String[] P007B22_A668TBT11_UPLOAD_AUTH_CD ;
   private boolean[] P007B22_n668TBT11_UPLOAD_AUTH_CD ;
   private String[] P007B22_A669TBT11_DM_ARRIVAL_FLG ;
   private boolean[] P007B22_n669TBT11_DM_ARRIVAL_FLG ;
   private java.util.Date[] P007B22_A670TBT11_DM_ARRIVAL_DATETIME ;
   private boolean[] P007B22_n670TBT11_DM_ARRIVAL_DATETIME ;
   private String[] P007B22_A671TBT11_APPROVAL_FLG ;
   private boolean[] P007B22_n671TBT11_APPROVAL_FLG ;
   private java.util.Date[] P007B22_A672TBT11_APPROVAL_DATETIME ;
   private boolean[] P007B22_n672TBT11_APPROVAL_DATETIME ;
   private String[] P007B22_A673TBT11_APPROVAL_USER_ID ;
   private boolean[] P007B22_n673TBT11_APPROVAL_USER_ID ;
   private String[] P007B22_A674TBT11_APPROVAL_AUTH_CD ;
   private boolean[] P007B22_n674TBT11_APPROVAL_AUTH_CD ;
   private String[] P007B22_A993TBT11_SIGNATURE_FLG ;
   private boolean[] P007B22_n993TBT11_SIGNATURE_FLG ;
   private java.util.Date[] P007B22_A994TBT11_SIGNATURE_DATETIME ;
   private boolean[] P007B22_n994TBT11_SIGNATURE_DATETIME ;
   private String[] P007B22_A995TBT11_SIGNATURE_USER_ID ;
   private boolean[] P007B22_n995TBT11_SIGNATURE_USER_ID ;
   private String[] P007B22_A675TBT11_INPUT_END_FLG ;
   private boolean[] P007B22_n675TBT11_INPUT_END_FLG ;
   private java.util.Date[] P007B22_A676TBT11_INPUT_END_DATETIME ;
   private boolean[] P007B22_n676TBT11_INPUT_END_DATETIME ;
   private String[] P007B22_A677TBT11_INPUT_END_USER_ID ;
   private boolean[] P007B22_n677TBT11_INPUT_END_USER_ID ;
   private String[] P007B22_A678TBT11_INPUT_END_AUTH_CD ;
   private boolean[] P007B22_n678TBT11_INPUT_END_AUTH_CD ;
   private String[] P007B22_A891TBT11_UPD_RIYU ;
   private boolean[] P007B22_n891TBT11_UPD_RIYU ;
   private String[] P007B22_A457TBT11_DEL_FLG ;
   private boolean[] P007B22_n457TBT11_DEL_FLG ;
   private java.util.Date[] P007B22_A458TBT11_CRT_DATETIME ;
   private boolean[] P007B22_n458TBT11_CRT_DATETIME ;
   private String[] P007B22_A459TBT11_CRT_USER_ID ;
   private boolean[] P007B22_n459TBT11_CRT_USER_ID ;
   private String[] P007B22_A460TBT11_CRT_PROG_NM ;
   private boolean[] P007B22_n460TBT11_CRT_PROG_NM ;
   private java.util.Date[] P007B22_A461TBT11_UPD_DATETIME ;
   private boolean[] P007B22_n461TBT11_UPD_DATETIME ;
   private String[] P007B22_A462TBT11_UPD_USER_ID ;
   private boolean[] P007B22_n462TBT11_UPD_USER_ID ;
   private String[] P007B22_A463TBT11_UPD_PROG_NM ;
   private boolean[] P007B22_n463TBT11_UPD_PROG_NM ;
   private long[] P007B22_A464TBT11_UPD_CNT ;
   private boolean[] P007B22_n464TBT11_UPD_CNT ;
   private short[] P007B23_A98TBT12_CRF_ID ;
   private long[] P007B23_A96TBT12_STUDY_ID ;
   private int[] P007B23_A97TBT12_SUBJECT_ID ;
   private byte[] P007B23_A937TBT12_CRF_EDA_NO ;
   private String[] P007B23_A99TBT12_CRF_ITEM_GRP_DIV ;
   private String[] P007B23_A100TBT12_CRF_ITEM_GRP_CD ;
   private String[] P007B23_A465TBT12_CRF_VALUE ;
   private boolean[] P007B23_n465TBT12_CRF_VALUE ;
   private String[] P007B23_A679TBT12_EDIT_FLG ;
   private boolean[] P007B23_n679TBT12_EDIT_FLG ;
   private String[] P007B23_A473TBT12_DEL_FLG ;
   private boolean[] P007B23_n473TBT12_DEL_FLG ;
   private java.util.Date[] P007B23_A466TBT12_CRT_DATETIME ;
   private boolean[] P007B23_n466TBT12_CRT_DATETIME ;
   private String[] P007B23_A467TBT12_CRT_USER_ID ;
   private boolean[] P007B23_n467TBT12_CRT_USER_ID ;
   private String[] P007B23_A468TBT12_CRT_PROG_NM ;
   private boolean[] P007B23_n468TBT12_CRT_PROG_NM ;
   private java.util.Date[] P007B23_A469TBT12_UPD_DATETIME ;
   private boolean[] P007B23_n469TBT12_UPD_DATETIME ;
   private String[] P007B23_A470TBT12_UPD_USER_ID ;
   private boolean[] P007B23_n470TBT12_UPD_USER_ID ;
   private String[] P007B23_A471TBT12_UPD_PROG_NM ;
   private boolean[] P007B23_n471TBT12_UPD_PROG_NM ;
   private long[] P007B23_A472TBT12_UPD_CNT ;
   private boolean[] P007B23_n472TBT12_UPD_CNT ;
   private short[] P007B24_A103TBT13_CRF_ID ;
   private long[] P007B24_A101TBT13_STUDY_ID ;
   private int[] P007B24_A102TBT13_SUBJECT_ID ;
   private byte[] P007B24_A938TBT13_CRF_EDA_NO ;
   private short[] P007B24_A104TBT13_CRF_VERSION ;
   private String[] P007B24_A105TBT13_CRF_ITEM_GRP_DIV ;
   private String[] P007B24_A106TBT13_CRF_ITEM_GRP_CD ;
   private String[] P007B24_A597TBT13_CRF_VALUE ;
   private boolean[] P007B24_n597TBT13_CRF_VALUE ;
   private String[] P007B24_A680TBT13_EDIT_FLG ;
   private boolean[] P007B24_n680TBT13_EDIT_FLG ;
   private String[] P007B24_A598TBT13_DEL_FLG ;
   private boolean[] P007B24_n598TBT13_DEL_FLG ;
   private java.util.Date[] P007B24_A599TBT13_CRT_DATETIME ;
   private boolean[] P007B24_n599TBT13_CRT_DATETIME ;
   private String[] P007B24_A600TBT13_CRT_USER_ID ;
   private boolean[] P007B24_n600TBT13_CRT_USER_ID ;
   private String[] P007B24_A601TBT13_CRT_PROG_NM ;
   private boolean[] P007B24_n601TBT13_CRT_PROG_NM ;
   private java.util.Date[] P007B24_A602TBT13_UPD_DATETIME ;
   private boolean[] P007B24_n602TBT13_UPD_DATETIME ;
   private String[] P007B24_A603TBT13_UPD_USER_ID ;
   private boolean[] P007B24_n603TBT13_UPD_USER_ID ;
   private String[] P007B24_A604TBT13_UPD_PROG_NM ;
   private boolean[] P007B24_n604TBT13_UPD_PROG_NM ;
   private long[] P007B24_A605TBT13_UPD_CNT ;
   private boolean[] P007B24_n605TBT13_UPD_CNT ;
   private short[] P007B25_A474TBT14_CRF_ID ;
   private boolean[] P007B25_n474TBT14_CRF_ID ;
   private long[] P007B25_A140TBT14_STUDY_ID ;
   private int[] P007B25_A142TBT14_SUBJECT_ID ;
   private short[] P007B25_A198TBT14_MEMO_NO ;
   private byte[] P007B25_A941TBT14_CRF_EDA_NO ;
   private boolean[] P007B25_n941TBT14_CRF_EDA_NO ;
   private short[] P007B25_A475TBT14_CRF_VERSION ;
   private boolean[] P007B25_n475TBT14_CRF_VERSION ;
   private String[] P007B25_A901TBT14_MEMO_KBN ;
   private boolean[] P007B25_n901TBT14_MEMO_KBN ;
   private String[] P007B25_A477TBT14_MEMO ;
   private boolean[] P007B25_n477TBT14_MEMO ;
   private String[] P007B25_A929TBT14_REQUEST_SITE_ID ;
   private boolean[] P007B25_n929TBT14_REQUEST_SITE_ID ;
   private String[] P007B25_A930TBT14_REQUEST_AUTH_CD ;
   private boolean[] P007B25_n930TBT14_REQUEST_AUTH_CD ;
   private String[] P007B25_A931TBT14_CRT_AUTH_CD ;
   private boolean[] P007B25_n931TBT14_CRT_AUTH_CD ;
   private String[] P007B25_A927TBT14_KAKUNIN_FLG ;
   private boolean[] P007B25_n927TBT14_KAKUNIN_FLG ;
   private String[] P007B25_A928TBT14_KAKUNIN_USER_ID ;
   private boolean[] P007B25_n928TBT14_KAKUNIN_USER_ID ;
   private String[] P007B25_A934TBT14_KAKUNIN_COMMENT ;
   private boolean[] P007B25_n934TBT14_KAKUNIN_COMMENT ;
   private String[] P007B25_A902TBT14_KANRYO_FLG ;
   private boolean[] P007B25_n902TBT14_KANRYO_FLG ;
   private String[] P007B25_A479TBT14_DEL_FLG ;
   private boolean[] P007B25_n479TBT14_DEL_FLG ;
   private java.util.Date[] P007B25_A480TBT14_CRT_DATETIME ;
   private boolean[] P007B25_n480TBT14_CRT_DATETIME ;
   private String[] P007B25_A481TBT14_CRT_USER_ID ;
   private boolean[] P007B25_n481TBT14_CRT_USER_ID ;
   private String[] P007B25_A482TBT14_CRT_PROG_NM ;
   private boolean[] P007B25_n482TBT14_CRT_PROG_NM ;
   private java.util.Date[] P007B25_A483TBT14_UPD_DATETIME ;
   private boolean[] P007B25_n483TBT14_UPD_DATETIME ;
   private String[] P007B25_A484TBT14_UPD_USER_ID ;
   private boolean[] P007B25_n484TBT14_UPD_USER_ID ;
   private String[] P007B25_A485TBT14_UPD_PROG_NM ;
   private boolean[] P007B25_n485TBT14_UPD_PROG_NM ;
   private long[] P007B25_A486TBT14_UPD_CNT ;
   private boolean[] P007B25_n486TBT14_UPD_CNT ;
   private short[] P007B26_A155TBT15_CRF_ID ;
   private boolean[] P007B26_n155TBT15_CRF_ID ;
   private long[] P007B26_A149TBT15_STUDY_ID ;
   private int[] P007B26_A151TBT15_SUBJECT_ID ;
   private short[] P007B26_A199TBT15_MEMO_NO ;
   private byte[] P007B26_A942TBT15_CRF_EDA_NO ;
   private boolean[] P007B26_n942TBT15_CRF_EDA_NO ;
   private short[] P007B26_A157TBT15_CRF_VERSION ;
   private boolean[] P007B26_n157TBT15_CRF_VERSION ;
   private String[] P007B26_A903TBT15_CRF_ITEM_GRP_DIV ;
   private boolean[] P007B26_n903TBT15_CRF_ITEM_GRP_DIV ;
   private String[] P007B26_A904TBT15_CRF_ITEM_GRP_CD ;
   private boolean[] P007B26_n904TBT15_CRF_ITEM_GRP_CD ;
   private String[] P007B26_A488TBT15_DEL_FLG ;
   private boolean[] P007B26_n488TBT15_DEL_FLG ;
   private java.util.Date[] P007B26_A489TBT15_CRT_DATETIME ;
   private boolean[] P007B26_n489TBT15_CRT_DATETIME ;
   private String[] P007B26_A490TBT15_CRT_USER_ID ;
   private boolean[] P007B26_n490TBT15_CRT_USER_ID ;
   private String[] P007B26_A491TBT15_CRT_PROG_NM ;
   private boolean[] P007B26_n491TBT15_CRT_PROG_NM ;
   private java.util.Date[] P007B26_A492TBT15_UPD_DATETIME ;
   private boolean[] P007B26_n492TBT15_UPD_DATETIME ;
   private String[] P007B26_A493TBT15_UPD_USER_ID ;
   private boolean[] P007B26_n493TBT15_UPD_USER_ID ;
   private String[] P007B26_A494TBT15_UPD_PROG_NM ;
   private boolean[] P007B26_n494TBT15_UPD_PROG_NM ;
   private long[] P007B26_A495TBT15_UPD_CNT ;
   private boolean[] P007B26_n495TBT15_UPD_CNT ;
   private GxObjectCollection AV10P_B406_SD01_EXPORT_LIST ;
   private GxObjectCollection AV32W_TBM31_CRF_ID ;
   private GxObjectCollection AV19W_A812_SD01_CSV_OUTPUT ;
   private SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem AV8B406_SD01_EXPORT_LIST_I ;
   private SdtA_LOGIN_SDT AV18W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT3[] ;
   private SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem AV20W_A812_SD01_CSV_OUTPUT_ITEM ;
   private SdtWeZipFile AV38WeZipFile ;
}

final  class b406_pc01_design_export_csv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P007B8( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          short A69TBM31_CRF_ID ,
                                          GxObjectCollection AV32W_TBM31_CRF_ID ,
                                          long A68TBM31_STUDY_ID ,
                                          long AV8B406_SD01_EXPORT_LIST_I_getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int5 ;
      GXv_int5 = new byte [1] ;
      Object[] GXv_Object6 ;
      GXv_Object6 = new Object [2] ;
      scmdbuf = "SELECT `TBM31_CRF_ID`, `TBM31_STUDY_ID`, `TBM31_CRF_NM`, `TBM31_CRF_SNM`, `TBM31_GRID_SIZE`," ;
      scmdbuf = scmdbuf + " `TBM31_DEF_VISIT_NO`, `TBM31_DEF_DOMAIN_CD`, `TBM31_STATUS`, `TBM31_NOTE`, `TBM31_REPEAT_FLG`," ;
      scmdbuf = scmdbuf + " `TBM31_REPEAT_MAX`, `TBM31_DM_EXCP_NO_DISP_FLG`, `TBM31_DEL_FLG`, `TBM31_CRT_DATETIME`," ;
      scmdbuf = scmdbuf + " `TBM31_CRT_USER_ID`, `TBM31_CRT_PROG_NM`, `TBM31_UPD_DATETIME`, `TBM31_UPD_USER_ID`," ;
      scmdbuf = scmdbuf + " `TBM31_UPD_PROG_NM`, `TBM31_UPD_CNT`, `TBM31_ORDER` FROM `TBM31_CRF`" ;
      scmdbuf = scmdbuf + " WHERE (" + GXutil.toValueList("mysql", AV32W_TBM31_CRF_ID, "`TBM31_CRF_ID` IN (", ")") + ")" ;
      scmdbuf = scmdbuf + " and (`TBM31_STUDY_ID` = ?)" ;
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TBM31_ORDER`" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P007B9( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          short A71TBM32_CRF_ID ,
                                          GxObjectCollection AV32W_TBM31_CRF_ID ,
                                          long AV8B406_SD01_EXPORT_LIST_I_getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id ,
                                          long A70TBM32_STUDY_ID )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int8 ;
      GXv_int8 = new byte [1] ;
      Object[] GXv_Object9 ;
      GXv_Object9 = new Object [2] ;
      scmdbuf = "SELECT `TBM32_CRF_ID`, `TBM32_STUDY_ID`, `TBM32_CRF_ITEM_CD`, `TBM32_CRF_ITEM_NM`," ;
      scmdbuf = scmdbuf + " `TBM32_CRF_ITEM_DIV`, `TBM32_CRF_ITEM_GRP_CD`, `TBM32_CRF_ITEM_GRP_ORDER`, `TBM32_LOCATION_X`," ;
      scmdbuf = scmdbuf + " `TBM32_LOCATION_Y`, `TBM32_LOCATION_X2`, `TBM32_LOCATION_Y2`, `TBM32_TEXT_ALIGN_DIV`," ;
      scmdbuf = scmdbuf + " `TBM32_TEXT_MAXROWS`, `TBM32_TEXT_MAXLENGTH`, `TBM32_DECIMAL_DIGITS`, `TBM32_CHK_TRUE_INNER_VALUE`," ;
      scmdbuf = scmdbuf + " `TBM32_CHK_FALSE_INNER_VALUE`, `TBM32_FIXED_VALUE`, `TBM32_LIST_CD`, `TBM32_IMAGE_CD`," ;
      scmdbuf = scmdbuf + " `TBM32_TEXT`, `TBM32_FONT_SIZE`, `TBM32_FONT_UL_FLG`, `TBM32_FONT_COLOR_DIV`, `TBM32_LINE_SIZE_DIV`," ;
      scmdbuf = scmdbuf + " `TBM32_LINE_COLOR_DIV`, `TBM32_LINE_START_POINT_DIV`, `TBM32_LINE_END_POINT_DIV`," ;
      scmdbuf = scmdbuf + " `TBM32_LINE_ANGLE`, `TBM32_AUTH_LVL_MIN`, `TBM32_ZORDER`, `TBM32_TAB_ORDER`, `TBM32_TABSTOP_FLG`," ;
      scmdbuf = scmdbuf + " `TBM32_REQUIRED_INPUT_FLG`, `TBM32_MIN_VALUE`, `TBM32_MAX_VALUE`, `TBM32_CRF_ITEM_NOTE`," ;
      scmdbuf = scmdbuf + " `TBM32_REF_CRF_ID`, `TBM32_REF_CRF_ITEM_CD`, `TBM32_DEL_FLG`, `TBM32_CRT_DATETIME`," ;
      scmdbuf = scmdbuf + " `TBM32_CRT_USER_ID`, `TBM32_CRT_PROG_NM`, `TBM32_UPD_DATETIME`, `TBM32_UPD_USER_ID`," ;
      scmdbuf = scmdbuf + " `TBM32_UPD_PROG_NM`, `TBM32_UPD_CNT` FROM `TBM32_CRF_ITEM`" ;
      scmdbuf = scmdbuf + " WHERE (`TBM32_STUDY_ID` = ?)" ;
      scmdbuf = scmdbuf + " and (" + GXutil.toValueList("mysql", AV32W_TBM31_CRF_ID, "`TBM32_CRF_ID` IN (", ")") + ")" ;
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TBM32_STUDY_ID`" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P007B10( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.internet.HttpContext httpContext ,
                                           short A77TBM33_CRF_ID ,
                                           GxObjectCollection AV32W_TBM31_CRF_ID ,
                                           long AV8B406_SD01_EXPORT_LIST_I_getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id ,
                                           long A76TBM33_STUDY_ID )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int11 ;
      GXv_int11 = new byte [1] ;
      Object[] GXv_Object12 ;
      GXv_Object12 = new Object [2] ;
      scmdbuf = "SELECT `TBM33_CRF_ID`, `TBM33_STUDY_ID`, `TBM33_COND_NO`, `TBM33_COND_NM`, `TBM33_EXPRESSION`," ;
      scmdbuf = scmdbuf + " `TBM33_COND_DIV`, `TBM33_CRF_ITEM_CD`, `TBM33_PRIOR_NO`, `TBM33_ERR_DIV`, `TBM33_ERR_MSG`," ;
      scmdbuf = scmdbuf + " `TBM33_ENABLED_FLG`, `TBM33_REQUIRED_INPUT_FLG`, `TBM33_NUMERIC_RANGE_FLG`, `TBM33_DEL_FLG`," ;
      scmdbuf = scmdbuf + " `TBM33_CRT_DATETIME`, `TBM33_CRT_USER_ID`, `TBM33_CRT_PROG_NM`, `TBM33_UPD_DATETIME`," ;
      scmdbuf = scmdbuf + " `TBM33_UPD_USER_ID`, `TBM33_UPD_PROG_NM`, `TBM33_UPD_CNT` FROM `TBM33_CRF_COND`" ;
      scmdbuf = scmdbuf + " WHERE (`TBM33_STUDY_ID` = ?)" ;
      scmdbuf = scmdbuf + " and (" + GXutil.toValueList("mysql", AV32W_TBM31_CRF_ID, "`TBM33_CRF_ID` IN (", ")") + ")" ;
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TBM33_STUDY_ID`" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
   }

   protected Object[] conditional_P007B11( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.internet.HttpContext httpContext ,
                                           short A29TBM34_CRF_ID ,
                                           GxObjectCollection AV32W_TBM31_CRF_ID ,
                                           long AV8B406_SD01_EXPORT_LIST_I_getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id ,
                                           long A28TBM34_STUDY_ID )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int14 ;
      GXv_int14 = new byte [1] ;
      Object[] GXv_Object15 ;
      GXv_Object15 = new Object [2] ;
      scmdbuf = "SELECT `TBM34_CRF_ID`, `TBM34_STUDY_ID`, `TBM34_STYDY_AUTH_CD`, `TBM34_DISPLAY_FLG`," ;
      scmdbuf = scmdbuf + " `TBM34_DEL_FLG`, `TBM34_CRT_DATETIME`, `TBM34_CRT_USER_ID`, `TBM34_CRT_PROG_NM`," ;
      scmdbuf = scmdbuf + " `TBM34_UPD_DATETIME`, `TBM34_UPD_USER_ID`, `TBM34_UPD_PROG_NM`, `TBM34_UPD_CNT`" ;
      scmdbuf = scmdbuf + " FROM `TBM34_CRF_AUTH`" ;
      scmdbuf = scmdbuf + " WHERE (`TBM34_STUDY_ID` = ?)" ;
      scmdbuf = scmdbuf + " and (" + GXutil.toValueList("mysql", AV32W_TBM31_CRF_ID, "`TBM34_CRF_ID` IN (", ")") + ")" ;
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TBM34_STUDY_ID`" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_P007B12( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.internet.HttpContext httpContext ,
                                           short A32TBM35_CRF_ID ,
                                           GxObjectCollection AV32W_TBM31_CRF_ID ,
                                           long AV8B406_SD01_EXPORT_LIST_I_getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id ,
                                           long A31TBM35_STUDY_ID )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int17 ;
      GXv_int17 = new byte [1] ;
      Object[] GXv_Object18 ;
      GXv_Object18 = new Object [2] ;
      scmdbuf = "SELECT `TBM35_CRF_ID`, `TBM35_STUDY_ID`, `TBM35_CRF_ITEM_CD`, `TBM35_STUDY_AUTH_CD`," ;
      scmdbuf = scmdbuf + " `TBM35_DISPLAY_FLG`, `TBM35_DEL_FLG`, `TBM35_CRT_DATETIME`, `TBM35_CRT_USER_ID`," ;
      scmdbuf = scmdbuf + " `TBM35_CRT_PROG_NM`, `TBM35_UPD_DATETIME`, `TBM35_UPD_USER_ID`, `TBM35_UPD_PROG_NM`," ;
      scmdbuf = scmdbuf + " `TBM35_UPD_CNT` FROM `TBM35_CRF_ITEM_AUTH`" ;
      scmdbuf = scmdbuf + " WHERE (`TBM35_STUDY_ID` = ?)" ;
      scmdbuf = scmdbuf + " and (" + GXutil.toValueList("mysql", AV32W_TBM31_CRF_ID, "`TBM35_CRF_ID` IN (", ")") + ")" ;
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TBM35_STUDY_ID`" ;
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
   }

   protected Object[] conditional_P007B13( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.internet.HttpContext httpContext ,
                                           short A36TBM36_CRF_ID ,
                                           GxObjectCollection AV32W_TBM31_CRF_ID ,
                                           long AV8B406_SD01_EXPORT_LIST_I_getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id ,
                                           long A35TBM36_STUDY_ID )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int20 ;
      GXv_int20 = new byte [1] ;
      Object[] GXv_Object21 ;
      GXv_Object21 = new Object [2] ;
      scmdbuf = "SELECT `TBM36_CRF_ID`, `TBM36_STUDY_ID`, `TBM36_COND_NO`, `TBM36_SELECT_CRF_ID`," ;
      scmdbuf = scmdbuf + " `TBM36_DEL_FLG`, `TBM36_CRT_DATETIME`, `TBM36_CRT_USER_ID`, `TBM36_CRT_PROG_NM`," ;
      scmdbuf = scmdbuf + " `TBM36_UPD_DATETIME`, `TBM36_UPD_USER_ID`, `TBM36_UPD_PROG_NM`, `TBM36_UPD_CNT`" ;
      scmdbuf = scmdbuf + " FROM `TBM36_CRF_SELECT`" ;
      scmdbuf = scmdbuf + " WHERE (`TBM36_STUDY_ID` = ?)" ;
      scmdbuf = scmdbuf + " and (" + GXutil.toValueList("mysql", AV32W_TBM31_CRF_ID, "`TBM36_CRF_ID` IN (", ")") + ")" ;
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TBM36_STUDY_ID`" ;
      GXv_Object21[0] = scmdbuf ;
      GXv_Object21[1] = GXv_int20 ;
      return GXv_Object21 ;
   }

   protected Object[] conditional_P007B14( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.internet.HttpContext httpContext ,
                                           short A80TBM37_CRF_ID ,
                                           GxObjectCollection AV32W_TBM31_CRF_ID ,
                                           long AV8B406_SD01_EXPORT_LIST_I_getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id ,
                                           long A79TBM37_STUDY_ID )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int23 ;
      GXv_int23 = new byte [1] ;
      Object[] GXv_Object24 ;
      GXv_Object24 = new Object [2] ;
      scmdbuf = "SELECT `TBM37_CRF_ID`, `TBM37_STUDY_ID`, `TBM37_CRF_ITEM_GRP_DIV`, `TBM37_CRF_ITEM_GRP_CD`," ;
      scmdbuf = scmdbuf + " `TBM37_VISIT_NO`, `TBM37_DOM_CD`, `TBM37_DOM_VAR_NM`, `TBM37_DOM_ITM_GRP_OID`, `TBM37_DOM_ITM_GRP_ATTR_SEQ`," ;
      scmdbuf = scmdbuf + " `TBM37_DOM_ITM_GRP_ROWNO`, `TBM37_DEL_FLG`, `TBM37_CRT_DATETIME`, `TBM37_CRT_USER_ID`," ;
      scmdbuf = scmdbuf + " `TBM37_CRT_PROG_NM`, `TBM37_UPD_DATETIME`, `TBM37_UPD_USER_ID`, `TBM37_UPD_PROG_NM`," ;
      scmdbuf = scmdbuf + " `TBM37_UPD_CNT` FROM `TBM37_CRF_DOM_MAP`" ;
      scmdbuf = scmdbuf + " WHERE (`TBM37_STUDY_ID` = ?)" ;
      scmdbuf = scmdbuf + " and (" + GXutil.toValueList("mysql", AV32W_TBM31_CRF_ID, "`TBM37_CRF_ID` IN (", ")") + ")" ;
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TBM37_STUDY_ID`" ;
      GXv_Object24[0] = scmdbuf ;
      GXv_Object24[1] = GXv_int23 ;
      return GXv_Object24 ;
   }

   protected Object[] conditional_P007B15( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.internet.HttpContext httpContext ,
                                           short A20TBM41_CRF_ID ,
                                           GxObjectCollection AV32W_TBM31_CRF_ID ,
                                           long AV8B406_SD01_EXPORT_LIST_I_getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id ,
                                           long A19TBM41_STUDY_ID )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int26 ;
      GXv_int26 = new byte [1] ;
      Object[] GXv_Object27 ;
      GXv_Object27 = new Object [2] ;
      scmdbuf = "SELECT `TBM41_CRF_ID`, `TBM41_STUDY_ID`, `TBM41_CRF_ITEM_GRP_DIV`, `TBM41_CRF_ITEM_GRP_CD`," ;
      scmdbuf = scmdbuf + " `TBM41_NCM_METADATA_ID`, `TBM41_DEL_FLG`, `TBM41_CRT_DATETIME`, `TBM41_CRT_USER_ID`," ;
      scmdbuf = scmdbuf + " `TBM41_CRT_PROG_NM`, `TBM41_UPD_DATETIME`, `TBM41_UPD_USER_ID`, `TBM41_UPD_PROG_NM`," ;
      scmdbuf = scmdbuf + " `TBM41_UPD_CNT` FROM `TBM41_CRF_NCM_MAP`" ;
      scmdbuf = scmdbuf + " WHERE (`TBM41_STUDY_ID` = ?)" ;
      scmdbuf = scmdbuf + " and (" + GXutil.toValueList("mysql", AV32W_TBM31_CRF_ID, "`TBM41_CRF_ID` IN (", ")") + ")" ;
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TBM41_STUDY_ID`" ;
      GXv_Object27[0] = scmdbuf ;
      GXv_Object27[1] = GXv_int26 ;
      return GXv_Object27 ;
   }

   protected Object[] conditional_P007B18( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.internet.HttpContext httpContext ,
                                           short A946TBM44_CRF_ID ,
                                           GxObjectCollection AV32W_TBM31_CRF_ID ,
                                           long AV8B406_SD01_EXPORT_LIST_I_getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id ,
                                           long A945TBM44_STUDY_ID )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int29 ;
      GXv_int29 = new byte [1] ;
      Object[] GXv_Object30 ;
      GXv_Object30 = new Object [2] ;
      scmdbuf = "SELECT `TBM44_CRF_ID`, `TBM44_STUDY_ID`, `TBM44_CRF_EDA_NO`, `TBM44_VISIT_NO`, `TBM44_DEL_FLG`," ;
      scmdbuf = scmdbuf + " `TBM44_CRT_DATETIME`, `TBM44_CRT_USER_ID`, `TBM44_CRT_PROG_NM`, `TBM44_UPD_DATETIME`," ;
      scmdbuf = scmdbuf + " `TBM44_UPD_USER_ID`, `TBM44_UPD_PROG_NM`, `TBM44_UPD_CNT` FROM `TBM44_CRF_VISIT`" ;
      scmdbuf = scmdbuf + " WHERE (`TBM44_STUDY_ID` = ?)" ;
      scmdbuf = scmdbuf + " and (" + GXutil.toValueList("mysql", AV32W_TBM31_CRF_ID, "`TBM44_CRF_ID` IN (", ")") + ")" ;
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TBM44_STUDY_ID`" ;
      GXv_Object30[0] = scmdbuf ;
      GXv_Object30[1] = GXv_int29 ;
      return GXv_Object30 ;
   }

   protected Object[] conditional_P007B21( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.internet.HttpContext httpContext ,
                                           short A91TBT02_CRF_ID ,
                                           GxObjectCollection AV32W_TBM31_CRF_ID ,
                                           long AV8B406_SD01_EXPORT_LIST_I_getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id ,
                                           long A89TBT02_STUDY_ID )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int32 ;
      GXv_int32 = new byte [1] ;
      Object[] GXv_Object33 ;
      GXv_Object33 = new Object [2] ;
      scmdbuf = "SELECT `TBT02_CRF_ID`, `TBT02_STUDY_ID`, `TBT02_SUBJECT_ID`, `TBT02_CRF_EDA_NO`," ;
      scmdbuf = scmdbuf + " `TBT02_CRF_LATEST_VERSION`, `TBT02_CRF_INPUT_LEVEL`, `TBT02_LOCK_FLG`, `TBT02_LOCK_DATETIME`," ;
      scmdbuf = scmdbuf + " `TBT02_LOCK_USER_ID`, `TBT02_LOCK_AUTH_CD`, `TBT02_UPLOAD_DATETIME`, `TBT02_UPLOAD_USER_ID`," ;
      scmdbuf = scmdbuf + " `TBT02_UPLOAD_AUTH_CD`, `TBT02_DM_ARRIVAL_FLG`, `TBT02_DM_ARRIVAL_DATETIME`, `TBT02_APPROVAL_FLG`," ;
      scmdbuf = scmdbuf + " `TBT02_APPROVAL_DATETIME`, `TBT02_APPROVAL_USER_ID`, `TBT02_APPROVAL_AUTH_CD`, `TBT02_SIGNATURE_FLG`," ;
      scmdbuf = scmdbuf + " `TBT02_SIGNATURE_DATETIME`, `TBT02_SIGNATURE_USER_ID`, `TBT02_INPUT_END_FLG`, `TBT02_INPUT_END_DATETIME`," ;
      scmdbuf = scmdbuf + " `TBT02_INPUT_END_USER_ID`, `TBT02_INPUT_END_AUTH_CD`, `TBT02_DEL_FLG`, `TBT02_CRT_DATETIME`," ;
      scmdbuf = scmdbuf + " `TBT02_CRT_USER_ID`, `TBT02_CRT_PROG_NM`, `TBT02_UPD_DATETIME`, `TBT02_UPD_USER_ID`," ;
      scmdbuf = scmdbuf + " `TBT02_UPD_PROG_NM`, `TBT02_UPD_CNT` FROM `TBT02_CRF`" ;
      scmdbuf = scmdbuf + " WHERE (`TBT02_STUDY_ID` = ?)" ;
      scmdbuf = scmdbuf + " and (" + GXutil.toValueList("mysql", AV32W_TBM31_CRF_ID, "`TBT02_CRF_ID` IN (", ")") + ")" ;
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TBT02_STUDY_ID`" ;
      GXv_Object33[0] = scmdbuf ;
      GXv_Object33[1] = GXv_int32 ;
      return GXv_Object33 ;
   }

   protected Object[] conditional_P007B22( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.internet.HttpContext httpContext ,
                                           short A94TBT11_CRF_ID ,
                                           GxObjectCollection AV32W_TBM31_CRF_ID ,
                                           long AV8B406_SD01_EXPORT_LIST_I_getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id ,
                                           long A92TBT11_STUDY_ID )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int35 ;
      GXv_int35 = new byte [1] ;
      Object[] GXv_Object36 ;
      GXv_Object36 = new Object [2] ;
      scmdbuf = "SELECT `TBT11_CRF_ID`, `TBT11_STUDY_ID`, `TBT11_SUBJECT_ID`, `TBT11_CRF_EDA_NO`," ;
      scmdbuf = scmdbuf + " `TBT11_CRF_VERSION`, `TBT11_CRF_INPUT_LEVEL`, `TBT11_UPLOAD_DATETIME`, `TBT11_UPLOAD_USER_ID`," ;
      scmdbuf = scmdbuf + " `TBT11_UPLOAD_AUTH_CD`, `TBT11_DM_ARRIVAL_FLG`, `TBT11_DM_ARRIVAL_DATETIME`, `TBT11_APPROVAL_FLG`," ;
      scmdbuf = scmdbuf + " `TBT11_APPROVAL_DATETIME`, `TBT11_APPROVAL_USER_ID`, `TBT11_APPROVAL_AUTH_CD`, `TBT11_SIGNATURE_FLG`," ;
      scmdbuf = scmdbuf + " `TBT11_SIGNATURE_DATETIME`, `TBT11_SIGNATURE_USER_ID`, `TBT11_INPUT_END_FLG`, `TBT11_INPUT_END_DATETIME`," ;
      scmdbuf = scmdbuf + " `TBT11_INPUT_END_USER_ID`, `TBT11_INPUT_END_AUTH_CD`, `TBT11_UPD_RIYU`, `TBT11_DEL_FLG`," ;
      scmdbuf = scmdbuf + " `TBT11_CRT_DATETIME`, `TBT11_CRT_USER_ID`, `TBT11_CRT_PROG_NM`, `TBT11_UPD_DATETIME`," ;
      scmdbuf = scmdbuf + " `TBT11_UPD_USER_ID`, `TBT11_UPD_PROG_NM`, `TBT11_UPD_CNT` FROM `TBT11_CRF_HISTORY`" ;
      scmdbuf = scmdbuf + " WHERE (`TBT11_STUDY_ID` = ?)" ;
      scmdbuf = scmdbuf + " and (" + GXutil.toValueList("mysql", AV32W_TBM31_CRF_ID, "`TBT11_CRF_ID` IN (", ")") + ")" ;
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TBT11_STUDY_ID`" ;
      GXv_Object36[0] = scmdbuf ;
      GXv_Object36[1] = GXv_int35 ;
      return GXv_Object36 ;
   }

   protected Object[] conditional_P007B23( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.internet.HttpContext httpContext ,
                                           short A98TBT12_CRF_ID ,
                                           GxObjectCollection AV32W_TBM31_CRF_ID ,
                                           long AV8B406_SD01_EXPORT_LIST_I_getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id ,
                                           long A96TBT12_STUDY_ID )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int38 ;
      GXv_int38 = new byte [1] ;
      Object[] GXv_Object39 ;
      GXv_Object39 = new Object [2] ;
      scmdbuf = "SELECT `TBT12_CRF_ID`, `TBT12_STUDY_ID`, `TBT12_SUBJECT_ID`, `TBT12_CRF_EDA_NO`," ;
      scmdbuf = scmdbuf + " `TBT12_CRF_ITEM_GRP_DIV`, `TBT12_CRF_ITEM_GRP_CD`, `TBT12_CRF_VALUE`, `TBT12_EDIT_FLG`," ;
      scmdbuf = scmdbuf + " `TBT12_DEL_FLG`, `TBT12_CRT_DATETIME`, `TBT12_CRT_USER_ID`, `TBT12_CRT_PROG_NM`," ;
      scmdbuf = scmdbuf + " `TBT12_UPD_DATETIME`, `TBT12_UPD_USER_ID`, `TBT12_UPD_PROG_NM`, `TBT12_UPD_CNT`" ;
      scmdbuf = scmdbuf + " FROM `TBT12_CRF_RESULT`" ;
      scmdbuf = scmdbuf + " WHERE (`TBT12_STUDY_ID` = ?)" ;
      scmdbuf = scmdbuf + " and (" + GXutil.toValueList("mysql", AV32W_TBM31_CRF_ID, "`TBT12_CRF_ID` IN (", ")") + ")" ;
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TBT12_STUDY_ID`" ;
      GXv_Object39[0] = scmdbuf ;
      GXv_Object39[1] = GXv_int38 ;
      return GXv_Object39 ;
   }

   protected Object[] conditional_P007B24( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.internet.HttpContext httpContext ,
                                           short A103TBT13_CRF_ID ,
                                           GxObjectCollection AV32W_TBM31_CRF_ID ,
                                           long AV8B406_SD01_EXPORT_LIST_I_getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id ,
                                           long A101TBT13_STUDY_ID )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int41 ;
      GXv_int41 = new byte [1] ;
      Object[] GXv_Object42 ;
      GXv_Object42 = new Object [2] ;
      scmdbuf = "SELECT `TBT13_CRF_ID`, `TBT13_STUDY_ID`, `TBT13_SUBJECT_ID`, `TBT13_CRF_EDA_NO`," ;
      scmdbuf = scmdbuf + " `TBT13_CRF_VERSION`, `TBT13_CRF_ITEM_GRP_DIV`, `TBT13_CRF_ITEM_GRP_CD`, `TBT13_CRF_VALUE`," ;
      scmdbuf = scmdbuf + " `TBT13_EDIT_FLG`, `TBT13_DEL_FLG`, `TBT13_CRT_DATETIME`, `TBT13_CRT_USER_ID`, `TBT13_CRT_PROG_NM`," ;
      scmdbuf = scmdbuf + " `TBT13_UPD_DATETIME`, `TBT13_UPD_USER_ID`, `TBT13_UPD_PROG_NM`, `TBT13_UPD_CNT`" ;
      scmdbuf = scmdbuf + " FROM `TBT13_CRF_RES_HIS`" ;
      scmdbuf = scmdbuf + " WHERE (`TBT13_STUDY_ID` = ?)" ;
      scmdbuf = scmdbuf + " and (" + GXutil.toValueList("mysql", AV32W_TBM31_CRF_ID, "`TBT13_CRF_ID` IN (", ")") + ")" ;
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TBT13_STUDY_ID`" ;
      GXv_Object42[0] = scmdbuf ;
      GXv_Object42[1] = GXv_int41 ;
      return GXv_Object42 ;
   }

   protected Object[] conditional_P007B25( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.internet.HttpContext httpContext ,
                                           short A474TBT14_CRF_ID ,
                                           GxObjectCollection AV32W_TBM31_CRF_ID ,
                                           long AV8B406_SD01_EXPORT_LIST_I_getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id ,
                                           long A140TBT14_STUDY_ID )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int44 ;
      GXv_int44 = new byte [1] ;
      Object[] GXv_Object45 ;
      GXv_Object45 = new Object [2] ;
      scmdbuf = "SELECT `TBT14_CRF_ID`, `TBT14_STUDY_ID`, `TBT14_SUBJECT_ID`, `TBT14_MEMO_NO`, `TBT14_CRF_EDA_NO`," ;
      scmdbuf = scmdbuf + " `TBT14_CRF_VERSION`, `TBT14_MEMO_KBN`, `TBT14_MEMO`, `TBT14_REQUEST_SITE_ID`, `TBT14_REQUEST_AUTH_CD`," ;
      scmdbuf = scmdbuf + " `TBT14_CRT_AUTH_CD`, `TBT14_KAKUNIN_FLG`, `TBT14_KAKUNIN_USER_ID`, `TBT14_KAKUNIN_COMMENT`," ;
      scmdbuf = scmdbuf + " `TBT14_KANRYO_FLG`, `TBT14_DEL_FLG`, `TBT14_CRT_DATETIME`, `TBT14_CRT_USER_ID`," ;
      scmdbuf = scmdbuf + " `TBT14_CRT_PROG_NM`, `TBT14_UPD_DATETIME`, `TBT14_UPD_USER_ID`, `TBT14_UPD_PROG_NM`," ;
      scmdbuf = scmdbuf + " `TBT14_UPD_CNT` FROM `TBT14_CRF_MEMO`" ;
      scmdbuf = scmdbuf + " WHERE (`TBT14_STUDY_ID` = ?)" ;
      scmdbuf = scmdbuf + " and (" + GXutil.toValueList("mysql", AV32W_TBM31_CRF_ID, "`TBT14_CRF_ID` IN (", ")") + ")" ;
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TBT14_STUDY_ID`" ;
      GXv_Object45[0] = scmdbuf ;
      GXv_Object45[1] = GXv_int44 ;
      return GXv_Object45 ;
   }

   protected Object[] conditional_P007B26( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.internet.HttpContext httpContext ,
                                           short A155TBT15_CRF_ID ,
                                           GxObjectCollection AV32W_TBM31_CRF_ID ,
                                           long AV8B406_SD01_EXPORT_LIST_I_getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id ,
                                           long A149TBT15_STUDY_ID )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int47 ;
      GXv_int47 = new byte [1] ;
      Object[] GXv_Object48 ;
      GXv_Object48 = new Object [2] ;
      scmdbuf = "SELECT `TBT15_CRF_ID`, `TBT15_STUDY_ID`, `TBT15_SUBJECT_ID`, `TBT15_MEMO_NO`, `TBT15_CRF_EDA_NO`," ;
      scmdbuf = scmdbuf + " `TBT15_CRF_VERSION`, `TBT15_CRF_ITEM_GRP_DIV`, `TBT15_CRF_ITEM_GRP_CD`, `TBT15_DEL_FLG`," ;
      scmdbuf = scmdbuf + " `TBT15_CRT_DATETIME`, `TBT15_CRT_USER_ID`, `TBT15_CRT_PROG_NM`, `TBT15_UPD_DATETIME`," ;
      scmdbuf = scmdbuf + " `TBT15_UPD_USER_ID`, `TBT15_UPD_PROG_NM`, `TBT15_UPD_CNT` FROM `TBT15_CRF_MEMO_LOC`" ;
      scmdbuf = scmdbuf + " WHERE (`TBT15_STUDY_ID` = ?)" ;
      scmdbuf = scmdbuf + " and (" + GXutil.toValueList("mysql", AV32W_TBM31_CRF_ID, "`TBT15_CRF_ID` IN (", ")") + ")" ;
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TBT15_STUDY_ID`" ;
      GXv_Object48[0] = scmdbuf ;
      GXv_Object48[1] = GXv_int47 ;
      return GXv_Object48 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.internet.HttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 6 :
                  return conditional_P007B8(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , (GxObjectCollection)dynConstraints[1] , ((Number) dynConstraints[2]).longValue() , ((Number) dynConstraints[3]).longValue() );
            case 7 :
                  return conditional_P007B9(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , (GxObjectCollection)dynConstraints[1] , ((Number) dynConstraints[2]).longValue() , ((Number) dynConstraints[3]).longValue() );
            case 8 :
                  return conditional_P007B10(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , (GxObjectCollection)dynConstraints[1] , ((Number) dynConstraints[2]).longValue() , ((Number) dynConstraints[3]).longValue() );
            case 9 :
                  return conditional_P007B11(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , (GxObjectCollection)dynConstraints[1] , ((Number) dynConstraints[2]).longValue() , ((Number) dynConstraints[3]).longValue() );
            case 10 :
                  return conditional_P007B12(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , (GxObjectCollection)dynConstraints[1] , ((Number) dynConstraints[2]).longValue() , ((Number) dynConstraints[3]).longValue() );
            case 11 :
                  return conditional_P007B13(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , (GxObjectCollection)dynConstraints[1] , ((Number) dynConstraints[2]).longValue() , ((Number) dynConstraints[3]).longValue() );
            case 12 :
                  return conditional_P007B14(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , (GxObjectCollection)dynConstraints[1] , ((Number) dynConstraints[2]).longValue() , ((Number) dynConstraints[3]).longValue() );
            case 13 :
                  return conditional_P007B15(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , (GxObjectCollection)dynConstraints[1] , ((Number) dynConstraints[2]).longValue() , ((Number) dynConstraints[3]).longValue() );
            case 16 :
                  return conditional_P007B18(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , (GxObjectCollection)dynConstraints[1] , ((Number) dynConstraints[2]).longValue() , ((Number) dynConstraints[3]).longValue() );
            case 19 :
                  return conditional_P007B21(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , (GxObjectCollection)dynConstraints[1] , ((Number) dynConstraints[2]).longValue() , ((Number) dynConstraints[3]).longValue() );
            case 20 :
                  return conditional_P007B22(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , (GxObjectCollection)dynConstraints[1] , ((Number) dynConstraints[2]).longValue() , ((Number) dynConstraints[3]).longValue() );
            case 21 :
                  return conditional_P007B23(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , (GxObjectCollection)dynConstraints[1] , ((Number) dynConstraints[2]).longValue() , ((Number) dynConstraints[3]).longValue() );
            case 22 :
                  return conditional_P007B24(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , (GxObjectCollection)dynConstraints[1] , ((Number) dynConstraints[2]).longValue() , ((Number) dynConstraints[3]).longValue() );
            case 23 :
                  return conditional_P007B25(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , (GxObjectCollection)dynConstraints[1] , ((Number) dynConstraints[2]).longValue() , ((Number) dynConstraints[3]).longValue() );
            case 24 :
                  return conditional_P007B26(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , (GxObjectCollection)dynConstraints[1] , ((Number) dynConstraints[2]).longValue() , ((Number) dynConstraints[3]).longValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P007B2", "SELECT `TBM21_STUDY_ID`, `TBM21_STUDY_NM`, `TBM21_OUTER_STUDY_ID`, `TBM21_PROC_NM`, `TBM21_NOTE`, `TBM21_STATUS`, `TBM21_DEL_FLG`, `TBM21_CRT_DATETIME`, `TBM21_CRT_USER_ID`, `TBM21_CRT_PROG_NM`, `TBM21_UPD_DATETIME`, `TBM21_UPD_USER_ID`, `TBM21_UPD_PROG_NM`, `TBM21_UPD_CNT` FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ORDER BY `TBM21_STUDY_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P007B3", "SELECT `TBM22_STUDY_ID`, `TBM22_SITE_ID`, `TBM22_DEL_FLG`, `TBM22_CRT_DATETIME`, `TBM22_CRT_USER_ID`, `TBM22_CRT_PROG_NM`, `TBM22_UPD_DATETIME`, `TBM22_UPD_USER_ID`, `TBM22_UPD_PROG_NM`, `TBM22_UPD_CNT` FROM `TBM22_STUDY_SITE` WHERE `TBM22_STUDY_ID` = ? ORDER BY `TBM22_STUDY_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P007B4", "SELECT `TBM23_STUDY_ID`, `TBM23_USER_ID`, `TBM23_STYDY_AUTH_CD`, `TBM23_DEL_FLG`, `TBM23_CRT_DATETIME`, `TBM23_CRT_USER_ID`, `TBM23_CRT_PROG_NM`, `TBM23_UPD_DATETIME`, `TBM23_UPD_USER_ID`, `TBM23_UPD_PROG_NM`, `TBM23_UPD_CNT` FROM `TBM23_STUDY_STAFF` WHERE `TBM23_STUDY_ID` = ? ORDER BY `TBM23_STUDY_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P007B5", "SELECT `TBM24_STUDY_ID`, `TBM24_DOM_CD`, `TBM24_DOM_VAR_NM`, `TBM24_DOM_ITM_GRP_OID`, `TBM24_DOM_ITM_GRP_ATTR_SEQ`, `TBM24_DOM_ITM_GRP_ROWNO`, `TBM24_CRF_ITEM_NM`, `TBM24_CRF_ITEM_DIV`, `TBM24_IDENTIFICATION_CD`, `TBM24_TEXT_MAXLENGTH`, `TBM24_TEXT_MAXROWS`, `TBM24_DECIMAL_DIGITS`, `TBM24_TEXT`, `TBM24_FIXED_VALUE`, `TBM24_CHK_FALSE_INNER_VALUE`, `TBM24_REQUIRED_INPUT_FLG`, `TBM24_MIN_VALUE`, `TBM24_MAX_VALUE`, `TBM24_ORDER`, `TBM24_DEL_FLG`, `TBM24_CRT_DATETIME`, `TBM24_CRT_USER_ID`, `TBM24_CRT_PROG_NM`, `TBM24_UPD_DATETIME`, `TBM24_UPD_USER_ID`, `TBM24_UPD_PROG_NM`, `TBM24_UPD_CNT` FROM `TBM24_MAP_ITEM` WHERE `TBM24_STUDY_ID` = ? ORDER BY `TBM24_STUDY_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P007B6", "SELECT `TBM25_STUDY_ID`, `TBM25_LIST_CD`, `TBM25_LIST_NM`, `TBM25_DEL_FLG`, `TBM25_CRT_DATETIME`, `TBM25_CRT_USER_ID`, `TBM25_CRT_PROG_NM`, `TBM25_UPD_DATETIME`, `TBM25_UPD_USER_ID`, `TBM25_UPD_PROG_NM`, `TBM25_UPD_CNT` FROM `TBM25_SEL_LIST` WHERE `TBM25_STUDY_ID` = ? ORDER BY `TBM25_STUDY_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P007B7", "SELECT `TBM26_STUDY_ID`, `TBM26_LIST_CD`, `TBM26_LIST_ITEM_NO`, `TBM26_LIST_ITEM_NAME`, `TBM26_INNER_VALUE`, `TBM26_DEL_FLG`, `TBM26_CRT_DATETIME`, `TBM26_CRT_USER_ID`, `TBM26_CRT_PROG_NM`, `TBM26_UPD_DATETIME`, `TBM26_UPD_USER_ID`, `TBM26_UPD_PROG_NM`, `TBM26_UPD_CNT` FROM `TBM26_SEL_LIST_ITEM` WHERE `TBM26_STUDY_ID` = ? ORDER BY `TBM26_STUDY_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P007B8", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P007B9", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P007B10", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P007B11", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P007B12", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P007B13", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P007B14", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P007B15", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P007B16", "SELECT `TBM42_STUDY_ID`, `TBM42_DOM_CD`, `TBM42_DOM_ENM`, `TBM42_DOM_JNM`, `TBM42_DOM_GRP_NM`, `TBM42_NOTE`, `TBM42_ORDER`, `TBM42_DEL_FLG`, `TBM42_CRT_DATETIME`, `TBM42_CRT_USER_ID`, `TBM42_CRT_PROG_NM`, `TBM42_UPD_DATETIME`, `TBM42_UPD_USER_ID`, `TBM42_UPD_PROG_NM`, `TBM42_UPD_CNT` FROM `TBM42_STUDY_CDISC_DOMAIN` WHERE `TBM42_STUDY_ID` = ? ORDER BY `TBM42_STUDY_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P007B17", "SELECT `TBM43_STUDY_ID`, `TBM43_DOM_CD`, `TBM43_DOM_VAR_NM`, `TBM43_VAR_DESC`, `TBM43_SDTM_FLG`, `TBM43_CDASH_FLG`, `TBM43_INPUT_TYPE_DIV`, `TBM43_REQUIRED_FLG`, `TBM43_SAS_FIELD_NM`, `TBM43_ODM_DATA_TYPE`, `TBM43_NOTE`, `TBM43_ORDER`, `TBM43_VERSION`, `TBM43_DEL_FLG`, `TBM43_CRT_DATETIME`, `TBM43_CRT_USER_ID`, `TBM43_CRT_PROG_NM`, `TBM43_UPD_DATETIME`, `TBM43_UPD_USER_ID`, `TBM43_UPD_PROG_NM`, `TBM43_UPD_CNT` FROM `TBM43_STUDY_CDISC_ITEM` WHERE `TBM43_STUDY_ID` = ? ORDER BY `TBM43_STUDY_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P007B18", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P007B19", "SELECT `TBM45_STUDY_ID`, `TBM45_FILTER_NO`, `TBM45_FILETR_NM`, `TBM45_IN_CRF_ID`, `TBM45_DEL_FLG`, `TBM45_CRT_DATETIME`, `TBM45_CRT_USER_ID`, `TBM45_CRT_PROG_NM`, `TBM45_UPD_DATETIME`, `TBM45_UPD_USER_ID`, `TBM45_UPD_PROG_NM`, `TBM45_UPD_CNT` FROM `TBM45_CRF_FILETR` WHERE `TBM45_STUDY_ID` = ? ORDER BY `TBM45_STUDY_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P007B20", "SELECT `TBT01_STUDY_ID`, `TBT01_SUBJECT_ID`, `TBT01_OUTER_SUBJECT_ID`, `TBT01_SITE_ID`, `TBT01_DEL_FLG`, `TBT01_CRT_DATETIME`, `TBT01_CRT_USER_ID`, `TBT01_CRT_PROG_NM`, `TBT01_UPD_DATETIME`, `TBT01_UPD_USER_ID`, `TBT01_UPD_PROG_NM`, `TBT01_UPD_CNT` FROM `TBT01_SUBJECT` WHERE `TBT01_STUDY_ID` = ? ORDER BY `TBT01_STUDY_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P007B21", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P007B22", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P007B23", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P007B24", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P007B25", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P007B26", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDateTime(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((long[]) buf[25])[0] = rslt.getLong(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((long[]) buf[16])[0] = rslt.getLong(10) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((long[]) buf[17])[0] = rslt.getLong(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[12])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(10) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((byte[]) buf[16])[0] = rslt.getByte(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((byte[]) buf[18])[0] = rslt.getByte(12) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((int[]) buf[32])[0] = rslt.getInt(19) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[36])[0] = rslt.getGXDateTime(21) ;
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[42])[0] = rslt.getGXDateTime(24) ;
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((long[]) buf[48])[0] = rslt.getLong(27) ;
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(8) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((long[]) buf[18])[0] = rslt.getLong(11) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((long[]) buf[21])[0] = rslt.getLong(13) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((byte[]) buf[16])[0] = rslt.getByte(10) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((byte[]) buf[18])[0] = rslt.getByte(11) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDateTime(14) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[30])[0] = rslt.getGXDateTime(17) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((long[]) buf[36])[0] = rslt.getLong(20) ;
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((int[]) buf[38])[0] = rslt.getInt(21) ;
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               return;
            case 7 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(13) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(14) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((byte[]) buf[25])[0] = rslt.getByte(15) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((byte[]) buf[39])[0] = rslt.getByte(22) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((long[]) buf[43])[0] = rslt.getLong(24) ;
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((byte[]) buf[45])[0] = rslt.getByte(25) ;
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((long[]) buf[47])[0] = rslt.getLong(26) ;
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getVarchar(27) ;
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getVarchar(28) ;
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((short[]) buf[53])[0] = rslt.getShort(29) ;
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((byte[]) buf[55])[0] = rslt.getByte(30) ;
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((short[]) buf[57])[0] = rslt.getShort(31) ;
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((short[]) buf[59])[0] = rslt.getShort(32) ;
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getVarchar(33) ;
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getVarchar(34) ;
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((String[]) buf[65])[0] = rslt.getVarchar(35) ;
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((String[]) buf[67])[0] = rslt.getVarchar(36) ;
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((String[]) buf[69])[0] = rslt.getVarchar(37) ;
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((short[]) buf[71])[0] = rslt.getShort(38) ;
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((String[]) buf[73])[0] = rslt.getVarchar(39) ;
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((String[]) buf[75])[0] = rslt.getVarchar(40) ;
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[77])[0] = rslt.getGXDateTime(41) ;
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((String[]) buf[79])[0] = rslt.getVarchar(42) ;
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((String[]) buf[81])[0] = rslt.getVarchar(43) ;
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[83])[0] = rslt.getGXDateTime(44) ;
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((String[]) buf[85])[0] = rslt.getVarchar(45) ;
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((String[]) buf[87])[0] = rslt.getVarchar(46) ;
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((long[]) buf[89])[0] = rslt.getLong(47) ;
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               return;
            case 8 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8) ;
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
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDateTime(15) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[31])[0] = rslt.getGXDateTime(18) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((long[]) buf[37])[0] = rslt.getLong(21) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               return;
            case 9 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((long[]) buf[19])[0] = rslt.getLong(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 10 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(7) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDateTime(10) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((long[]) buf[20])[0] = rslt.getLong(13) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               return;
            case 11 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(9) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((long[]) buf[18])[0] = rslt.getLong(12) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               return;
            case 12 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(9) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(10) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDateTime(12) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDateTime(15) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((long[]) buf[30])[0] = rslt.getLong(18) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               return;
            case 13 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(7) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDateTime(10) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((long[]) buf[20])[0] = rslt.getLong(13) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               return;
            case 14 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDateTime(9) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDateTime(12) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((long[]) buf[26])[0] = rslt.getLong(15) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               return;
            case 15 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDateTime(15) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[31])[0] = rslt.getGXDateTime(18) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((long[]) buf[37])[0] = rslt.getLong(21) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               return;
            case 16 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((byte[]) buf[2])[0] = rslt.getByte(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((long[]) buf[19])[0] = rslt.getLong(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 17 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDateTime(9) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((long[]) buf[20])[0] = rslt.getLong(12) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               return;
            case 18 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDateTime(9) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((long[]) buf[20])[0] = rslt.getLong(12) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               return;
            case 19 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((int[]) buf[2])[0] = rslt.getInt(3) ;
               ((byte[]) buf[3])[0] = rslt.getByte(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(8) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDateTime(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDateTime(15) ;
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
               ((String[]) buf[40])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[42])[0] = rslt.getGXDateTime(24) ;
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getVarchar(27) ;
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[50])[0] = rslt.getGXDateTime(28) ;
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
               ((long[]) buf[62])[0] = rslt.getLong(34) ;
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               return;
            case 20 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((int[]) buf[2])[0] = rslt.getInt(3) ;
               ((byte[]) buf[3])[0] = rslt.getByte(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((byte[]) buf[5])[0] = rslt.getByte(6) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(7) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(11) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDateTime(13) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[27])[0] = rslt.getGXDateTime(17) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[33])[0] = rslt.getGXDateTime(20) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[43])[0] = rslt.getGXDateTime(25) ;
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getVarchar(27) ;
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[49])[0] = rslt.getGXDateTime(28) ;
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getVarchar(29) ;
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getVarchar(30) ;
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((long[]) buf[55])[0] = rslt.getLong(31) ;
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               return;
            case 21 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((int[]) buf[2])[0] = rslt.getInt(3) ;
               ((byte[]) buf[3])[0] = rslt.getByte(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(10) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDateTime(13) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((long[]) buf[24])[0] = rslt.getLong(16) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               return;
            case 22 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((int[]) buf[2])[0] = rslt.getInt(3) ;
               ((byte[]) buf[3])[0] = rslt.getByte(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(11) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDateTime(14) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((long[]) buf[25])[0] = rslt.getLong(17) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               return;
            case 23 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((int[]) buf[3])[0] = rslt.getInt(3) ;
               ((short[]) buf[4])[0] = rslt.getShort(4) ;
               ((byte[]) buf[5])[0] = rslt.getByte(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(8) ;
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
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[29])[0] = rslt.getGXDateTime(17) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[35])[0] = rslt.getGXDateTime(20) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((long[]) buf[41])[0] = rslt.getLong(23) ;
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               return;
            case 24 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((int[]) buf[3])[0] = rslt.getInt(3) ;
               ((short[]) buf[4])[0] = rslt.getShort(4) ;
               ((byte[]) buf[5])[0] = rslt.getByte(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDateTime(13) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((long[]) buf[27])[0] = rslt.getLong(16) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx ;
      switch ( cursor )
      {
            case 0 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[1]).longValue());
               }
               return;
            case 7 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[1]).longValue());
               }
               return;
            case 8 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[1]).longValue());
               }
               return;
            case 9 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[1]).longValue());
               }
               return;
            case 10 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[1]).longValue());
               }
               return;
            case 11 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[1]).longValue());
               }
               return;
            case 12 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[1]).longValue());
               }
               return;
            case 13 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[1]).longValue());
               }
               return;
            case 14 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 15 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 16 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[1]).longValue());
               }
               return;
            case 17 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 18 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 19 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[1]).longValue());
               }
               return;
            case 20 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[1]).longValue());
               }
               return;
            case 21 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[1]).longValue());
               }
               return;
            case 22 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[1]).longValue());
               }
               return;
            case 23 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[1]).longValue());
               }
               return;
            case 24 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[1]).longValue());
               }
               return;
      }
   }

}

