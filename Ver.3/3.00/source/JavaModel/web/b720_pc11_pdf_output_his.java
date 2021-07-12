/*
               File: B720_PC11_PDF_OUTPUT_HIS
        Description: 履歴PDF出力処理
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:18:17.93
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b720_pc11_pdf_output_his extends GXProcedure
{
   public b720_pc11_pdf_output_his( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b720_pc11_pdf_output_his.class ), "" );
   }

   public b720_pc11_pdf_output_his( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( long aP0 ,
                             GxObjectCollection aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 )
   {
      b720_pc11_pdf_output_his.this.AV15P_STUDY_ID = aP0;
      b720_pc11_pdf_output_his.this.AV10B720_SD02_CRF_INFO_C = aP1;
      b720_pc11_pdf_output_his.this.aP2 = aP2;
      b720_pc11_pdf_output_his.this.aP3 = aP3;
      b720_pc11_pdf_output_his.this.aP4 = aP4;
      b720_pc11_pdf_output_his.this.aP5 = aP5;
      b720_pc11_pdf_output_his.this.aP5 = new String[] {""};
      initialize();
      privateExecute();
      return aP5[0];
   }

   public void execute( long aP0 ,
                        GxObjectCollection aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( long aP0 ,
                             GxObjectCollection aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 )
   {
      b720_pc11_pdf_output_his.this.AV15P_STUDY_ID = aP0;
      b720_pc11_pdf_output_his.this.AV10B720_SD02_CRF_INFO_C = aP1;
      b720_pc11_pdf_output_his.this.aP2 = aP2;
      b720_pc11_pdf_output_his.this.aP3 = aP3;
      b720_pc11_pdf_output_his.this.aP4 = aP4;
      b720_pc11_pdf_output_his.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12C_TAM02_APP_ID = "B720" ;
      AV27W_ERR_CD = (short)(0) ;
      AV28W_ERR_MSG = "" ;
      AV38W_SESSION_ID = "" ;
      AV23W_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      AV47W_ZIP_FILE_PATH = "" ;
      AV48W_ZIP_FILENAME = "" ;
      AV38W_SESSION_ID = AV16SESSION.getId() ;
      AV23W_DATETIME = GXutil.now( ) ;
      /* Execute user subroutine: S251 */
      S251 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: S121 */
      S121 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Using cursor P007K2 */
      pr_default.execute(0, new Object[] {new Long(AV15P_STUDY_ID)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A63TBM21_STUDY_ID = P007K2_A63TBM21_STUDY_ID[0] ;
         A367TBM21_STUDY_NM = P007K2_A367TBM21_STUDY_NM[0] ;
         n367TBM21_STUDY_NM = P007K2_n367TBM21_STUDY_NM[0] ;
         AV45W_TBM21_STUDY_NM = A367TBM21_STUDY_NM ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Execute user subroutine: S131 */
      S131 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV10B720_SD02_CRF_INFO_C.sort("TBT02_CRF_ID, TBT01_SITE_ID");
      AV19W_CRF_ID = (short)(-1) ;
      AV41W_SITE_ID = "" ;
      AV79GXV1 = 1 ;
      while ( AV79GXV1 <= AV10B720_SD02_CRF_INFO_C.size() )
      {
         AV11B720_SD02_CRF_INFO_I = (SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem)((SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem)AV10B720_SD02_CRF_INFO_C.elementAt(-1+AV79GXV1));
         /* Execute user subroutine: S111 */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( AV73W_PDF_OUT_FLG )
         {
            /* Execute user subroutine: S181 */
            S181 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            /* Execute user subroutine: S141 */
            S141 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            /* Execute user subroutine: S161 */
            S161 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV71W_FOLDER_FILE_NO = (short)(0) ;
            AV32W_FILE_NAME = AV33W_FILE_PATH + AV30W_FILE.getSeparator() + GXutil.padl( GXutil.trim( GXutil.str( AV71W_FOLDER_FILE_NO, 4, 0)), (short)(2), "0") + "_" + AV20W_CRF_NM + "(" + GXutil.trim( GXutil.str( AV11B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Visit_no(), 10, 0)) + ")_変更履歴.pdf" ;
            new a804_pc01_syslog(remoteHandle, context).execute( AV80Pgmname, "DEBUG", "CRF詳細情報PDF出力ファイル:"+AV32W_FILE_NAME) ;
            new b720_rp02_rekiinfo_crf_pdf(remoteHandle, context).execute( AV32W_FILE_NAME, AV15P_STUDY_ID, AV11B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt01_subject_id(), AV11B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_id(), AV11B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_eda_no()) ;
            if ( ( AV19W_CRF_ID == -1 ) || ( AV19W_CRF_ID != AV11B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_id() ) )
            {
               AV8B720_SD01_DESIGN_C.clear();
               GXv_objcol_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem1[0] = AV8B720_SD01_DESIGN_C ;
               GXv_int2[0] = AV27W_ERR_CD ;
               GXv_char3[0] = AV28W_ERR_MSG ;
               new b720_pc02_get_crf_design(remoteHandle, context).execute( AV15P_STUDY_ID, AV11B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_id(), AV11B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_eda_no(), GXv_objcol_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem1, GXv_int2, GXv_char3) ;
               AV8B720_SD01_DESIGN_C = GXv_objcol_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem1[0] ;
               b720_pc11_pdf_output_his.this.AV27W_ERR_CD = GXv_int2[0] ;
               b720_pc11_pdf_output_his.this.AV28W_ERR_MSG = GXv_char3[0] ;
            }
            AV19W_CRF_ID = AV11B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_id() ;
            AV53W_OUTPUT_FLG = false ;
            AV18W_CNT = (short)(0) ;
            AV61W_CRF_VERSION_FROM = (short)(0) ;
            /* Using cursor P007K3 */
            pr_default.execute(1, new Object[] {new Long(AV15P_STUDY_ID), new Integer(AV11B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt01_subject_id()), new Short(AV11B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_id()), new Byte(AV11B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_eda_no())});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A936TBT11_CRF_EDA_NO = P007K3_A936TBT11_CRF_EDA_NO[0] ;
               A94TBT11_CRF_ID = P007K3_A94TBT11_CRF_ID[0] ;
               A93TBT11_SUBJECT_ID = P007K3_A93TBT11_SUBJECT_ID[0] ;
               A92TBT11_STUDY_ID = P007K3_A92TBT11_STUDY_ID[0] ;
               A669TBT11_DM_ARRIVAL_FLG = P007K3_A669TBT11_DM_ARRIVAL_FLG[0] ;
               n669TBT11_DM_ARRIVAL_FLG = P007K3_n669TBT11_DM_ARRIVAL_FLG[0] ;
               A666TBT11_UPLOAD_DATETIME = P007K3_A666TBT11_UPLOAD_DATETIME[0] ;
               n666TBT11_UPLOAD_DATETIME = P007K3_n666TBT11_UPLOAD_DATETIME[0] ;
               A95TBT11_CRF_VERSION = P007K3_A95TBT11_CRF_VERSION[0] ;
               if ( ! AV53W_OUTPUT_FLG && ( GXutil.strcmp(A669TBT11_DM_ARRIVAL_FLG, "1") == 0 ) )
               {
                  AV53W_OUTPUT_FLG = true ;
               }
               if ( AV53W_OUTPUT_FLG )
               {
                  AV18W_CNT = (short)(AV18W_CNT+1) ;
                  AV54W_CRF_VERSION = A95TBT11_CRF_VERSION ;
                  AV58B720_SD04_MARK_DISP_C.clear();
                  AV59B720_SD04_MARK_DISP_I = (SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem)new SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem(remoteHandle, context);
                  AV59B720_SD04_MARK_DISP_I.setgxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Page_no( (short)(1) );
                  AV59B720_SD04_MARK_DISP_I.setgxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_location_x( (short)(696) );
                  AV59B720_SD04_MARK_DISP_I.setgxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_location_y( (short)(8) );
                  AV59B720_SD04_MARK_DISP_I.setgxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_location_x2( (short)(1017) );
                  AV59B720_SD04_MARK_DISP_I.setgxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_location_y2( (short)(29) );
                  GXt_char4 = "" ;
                  GXv_char3[0] = GXt_char4 ;
                  new a802_pc02_datetime_edit(remoteHandle, context).execute( A666TBT11_UPLOAD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char3) ;
                  b720_pc11_pdf_output_his.this.GXt_char4 = GXv_char3[0] ;
                  AV59B720_SD04_MARK_DISP_I.setgxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_text( "更新Ver."+GXutil.padr( GXutil.trim( GXutil.str( AV18W_CNT, 4, 0)), 4, " ")+"更新日時:"+GXt_char4 );
                  AV58B720_SD04_MARK_DISP_C.add(AV59B720_SD04_MARK_DISP_I, 0);
                  GXv_objcol_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem1[0] = AV8B720_SD01_DESIGN_C ;
                  GXv_int2[0] = AV27W_ERR_CD ;
                  GXv_char3[0] = AV28W_ERR_MSG ;
                  new b720_pc13_get_crf_value_his(remoteHandle, context).execute( AV54W_CRF_VERSION, AV15P_STUDY_ID, AV11B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_id(), AV11B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_eda_no(), AV11B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt01_subject_id(), GXv_objcol_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem1, GXv_int2, GXv_char3) ;
                  AV8B720_SD01_DESIGN_C = GXv_objcol_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem1[0] ;
                  b720_pc11_pdf_output_his.this.AV27W_ERR_CD = GXv_int2[0] ;
                  b720_pc11_pdf_output_his.this.AV28W_ERR_MSG = GXv_char3[0] ;
                  AV68W_EDIT_FLG = false ;
                  if ( ! (0==AV61W_CRF_VERSION_FROM) )
                  {
                     AV66W_SUBJECT_ID = 0 ;
                     AV67W_CRF_EDA_NO = (byte)(0) ;
                     AV66W_SUBJECT_ID = AV11B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt01_subject_id() ;
                     AV67W_CRF_EDA_NO = AV11B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_eda_no() ;
                     /* Execute user subroutine: S211 */
                     S211 ();
                     if ( returnInSub )
                     {
                        pr_default.close(1);
                        returnInSub = true;
                        cleanup();
                        if (true) return;
                     }
                  }
                  AV61W_CRF_VERSION_FROM = AV54W_CRF_VERSION ;
                  /* Execute user subroutine: S151 */
                  S151 ();
                  if ( returnInSub )
                  {
                     pr_default.close(1);
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
                  AV71W_FOLDER_FILE_NO = (short)(AV71W_FOLDER_FILE_NO+1) ;
                  if ( ! AV68W_EDIT_FLG )
                  {
                     AV32W_FILE_NAME = AV33W_FILE_PATH + AV30W_FILE.getSeparator() + GXutil.padl( GXutil.trim( GXutil.str( AV71W_FOLDER_FILE_NO, 4, 0)), (short)(2), "0") + "_" + AV20W_CRF_NM + "(" + GXutil.trim( GXutil.str( AV11B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Visit_no(), 10, 0)) + ")_更新Ver" + GXutil.trim( GXutil.str( AV18W_CNT, 10, 0)) + ".pdf" ;
                  }
                  else
                  {
                     AV32W_FILE_NAME = AV33W_FILE_PATH + AV30W_FILE.getSeparator() + GXutil.padl( GXutil.trim( GXutil.str( AV71W_FOLDER_FILE_NO, 4, 0)), (short)(2), "0") + "_" + AV20W_CRF_NM + "(" + GXutil.trim( GXutil.str( AV11B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Visit_no(), 10, 0)) + ")_更新Ver" + GXutil.trim( GXutil.str( AV18W_CNT, 10, 0)) + "_データ変更有" + ".pdf" ;
                  }
                  GXv_char3[0] = AV28W_ERR_MSG ;
                  new b720_rp01_pdf(remoteHandle, context).execute( AV32W_FILE_NAME, AV45W_TBM21_STUDY_NM, AV11B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Crf_name(), AV11B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt01_subject_id(), AV39W_SIGNER_INFO, AV8B720_SD01_DESIGN_C, AV58B720_SD04_MARK_DISP_C, GXv_char3) ;
                  b720_pc11_pdf_output_his.this.AV28W_ERR_MSG = GXv_char3[0] ;
               }
               pr_default.readNext(1);
            }
            pr_default.close(1);
         }
         AV79GXV1 = (int)(AV79GXV1+1) ;
      }
      if ( AV27W_ERR_CD == 0 )
      {
         /* Execute user subroutine: S191 */
         S191 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: S201 */
         S201 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      /* Execute user subroutine: S271 */
      S271 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_CHK_PDF_OUT' Routine */
      AV73W_PDF_OUT_FLG = false ;
      /* Using cursor P007K4 */
      pr_default.execute(2, new Object[] {new Long(AV15P_STUDY_ID), new Integer(AV11B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt01_subject_id()), new Short(AV11B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_id()), new Byte(AV11B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_eda_no())});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A661TBT02_INPUT_END_FLG = P007K4_A661TBT02_INPUT_END_FLG[0] ;
         n661TBT02_INPUT_END_FLG = P007K4_n661TBT02_INPUT_END_FLG[0] ;
         A935TBT02_CRF_EDA_NO = P007K4_A935TBT02_CRF_EDA_NO[0] ;
         A91TBT02_CRF_ID = P007K4_A91TBT02_CRF_ID[0] ;
         A90TBT02_SUBJECT_ID = P007K4_A90TBT02_SUBJECT_ID[0] ;
         A89TBT02_STUDY_ID = P007K4_A89TBT02_STUDY_ID[0] ;
         /* Using cursor P007K5 */
         pr_default.execute(3, new Object[] {new Long(AV15P_STUDY_ID), new Integer(AV11B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt01_subject_id()), new Short(AV11B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_id()), new Byte(AV11B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_eda_no())});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A669TBT11_DM_ARRIVAL_FLG = P007K5_A669TBT11_DM_ARRIVAL_FLG[0] ;
            n669TBT11_DM_ARRIVAL_FLG = P007K5_n669TBT11_DM_ARRIVAL_FLG[0] ;
            A936TBT11_CRF_EDA_NO = P007K5_A936TBT11_CRF_EDA_NO[0] ;
            A94TBT11_CRF_ID = P007K5_A94TBT11_CRF_ID[0] ;
            A93TBT11_SUBJECT_ID = P007K5_A93TBT11_SUBJECT_ID[0] ;
            A92TBT11_STUDY_ID = P007K5_A92TBT11_STUDY_ID[0] ;
            A95TBT11_CRF_VERSION = P007K5_A95TBT11_CRF_VERSION[0] ;
            AV73W_PDF_OUT_FLG = true ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(3);
         }
         pr_default.close(3);
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
   }

   public void S121( )
   {
      /* 'SUB_INIT_PDF_CONF' Routine */
      GXt_char4 = AV36W_OUTPUT_PATH ;
      GXv_char3[0] = GXt_char4 ;
      new b806_pc01_get_ctrl_val(remoteHandle, context).execute( "007", GXv_char3) ;
      b720_pc11_pdf_output_his.this.GXt_char4 = GXv_char3[0] ;
      AV36W_OUTPUT_PATH = GXt_char4 + AV30W_FILE.getSeparator() ;
      AV47W_ZIP_FILE_PATH = AV36W_OUTPUT_PATH ;
      GXt_char4 = AV36W_OUTPUT_PATH ;
      GXv_char3[0] = GXt_char4 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( AV23W_DATETIME, "YYYYMMDDHHMISS", GXv_char3) ;
      b720_pc11_pdf_output_his.this.GXt_char4 = GXv_char3[0] ;
      AV36W_OUTPUT_PATH = AV36W_OUTPUT_PATH + GXutil.trim( GXutil.str( AV15P_STUDY_ID, 10, 0)) + "pdf_" + GXt_char4 ;
      AV25W_DIR.setSource( AV36W_OUTPUT_PATH );
      if ( ! AV25W_DIR.exists() )
      {
         AV25W_DIR.create();
      }
      AV49W_ZIP_PATH = AV36W_OUTPUT_PATH ;
      AV36W_OUTPUT_PATH = AV36W_OUTPUT_PATH + AV30W_FILE.getSeparator() ;
   }

   public void S131( )
   {
      /* 'SUB_GET_CRF_ORDER' Routine */
      AV51B720_SD03_CRF_ORDER_C.clear();
      /* Using cursor P007K6 */
      pr_default.execute(4, new Object[] {new Long(AV15P_STUDY_ID)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A69TBM31_CRF_ID = P007K6_A69TBM31_CRF_ID[0] ;
         A68TBM31_STUDY_ID = P007K6_A68TBM31_STUDY_ID[0] ;
         A395TBM31_ORDER = P007K6_A395TBM31_ORDER[0] ;
         n395TBM31_ORDER = P007K6_n395TBM31_ORDER[0] ;
         A397TBM31_DEL_FLG = P007K6_A397TBM31_DEL_FLG[0] ;
         n397TBM31_DEL_FLG = P007K6_n397TBM31_DEL_FLG[0] ;
         /* Using cursor P007K7 */
         pr_default.execute(5, new Object[] {new Long(A68TBM31_STUDY_ID), new Short(A69TBM31_CRF_ID)});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A945TBM44_STUDY_ID = P007K7_A945TBM44_STUDY_ID[0] ;
            A946TBM44_CRF_ID = P007K7_A946TBM44_CRF_ID[0] ;
            A949TBM44_DEL_FLG = P007K7_A949TBM44_DEL_FLG[0] ;
            n949TBM44_DEL_FLG = P007K7_n949TBM44_DEL_FLG[0] ;
            A948TBM44_VISIT_NO = P007K7_A948TBM44_VISIT_NO[0] ;
            n948TBM44_VISIT_NO = P007K7_n948TBM44_VISIT_NO[0] ;
            A947TBM44_CRF_EDA_NO = P007K7_A947TBM44_CRF_EDA_NO[0] ;
            AV52B720_SD03_CRF_ORDER_I = (SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem)new SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem(remoteHandle, context);
            AV52B720_SD03_CRF_ORDER_I.setgxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_Crf_id( A946TBM44_CRF_ID );
            AV52B720_SD03_CRF_ORDER_I.setgxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_Crf_order( A395TBM31_ORDER );
            AV52B720_SD03_CRF_ORDER_I.setgxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_Visit_no( A948TBM44_VISIT_NO );
            AV51B720_SD03_CRF_ORDER_C.add(AV52B720_SD03_CRF_ORDER_I, 0);
            pr_default.readNext(5);
         }
         pr_default.close(5);
         pr_default.readNext(4);
      }
      pr_default.close(4);
      AV51B720_SD03_CRF_ORDER_C.sort("VISIT_NO, CRF_ORDER");
      AV18W_CNT = (short)(0) ;
      AV86GXV2 = 1 ;
      while ( AV86GXV2 <= AV51B720_SD03_CRF_ORDER_C.size() )
      {
         AV52B720_SD03_CRF_ORDER_I = (SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem)((SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem)AV51B720_SD03_CRF_ORDER_C.elementAt(-1+AV86GXV2));
         AV18W_CNT = (short)(AV18W_CNT+1) ;
         AV52B720_SD03_CRF_ORDER_I.setgxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_File_no( AV18W_CNT );
         AV86GXV2 = (int)(AV86GXV2+1) ;
      }
   }

   public void S141( )
   {
      /* 'SUB_GET_FILE_NO' Routine */
      AV21W_CRF_ORDER = "" ;
      AV87GXV3 = 1 ;
      while ( AV87GXV3 <= AV51B720_SD03_CRF_ORDER_C.size() )
      {
         AV52B720_SD03_CRF_ORDER_I = (SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem)((SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem)AV51B720_SD03_CRF_ORDER_C.elementAt(-1+AV87GXV3));
         if ( ( AV52B720_SD03_CRF_ORDER_I.getgxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_Crf_id() == AV11B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_id() ) && ( AV52B720_SD03_CRF_ORDER_I.getgxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_Visit_no() == AV11B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Visit_no() ) )
         {
            AV21W_CRF_ORDER = GXutil.padl( GXutil.trim( GXutil.str( AV52B720_SD03_CRF_ORDER_I.getgxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_File_no(), 10, 0)), (short)(3), "0") ;
            if (true) break;
         }
         AV87GXV3 = (int)(AV87GXV3+1) ;
      }
   }

   public void S151( )
   {
      /* 'SUB_GET_SIGNER_INFO' Routine */
      AV39W_SIGNER_INFO = "" ;
      /* Using cursor P007K9 */
      pr_default.execute(6, new Object[] {new Long(AV15P_STUDY_ID), new Integer(AV11B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt01_subject_id()), new Short(AV11B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_id()), new Byte(AV11B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_eda_no()), new Short(AV54W_CRF_VERSION)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A995TBT11_SIGNATURE_USER_ID = P007K9_A995TBT11_SIGNATURE_USER_ID[0] ;
         n995TBT11_SIGNATURE_USER_ID = P007K9_n995TBT11_SIGNATURE_USER_ID[0] ;
         A95TBT11_CRF_VERSION = P007K9_A95TBT11_CRF_VERSION[0] ;
         A936TBT11_CRF_EDA_NO = P007K9_A936TBT11_CRF_EDA_NO[0] ;
         A94TBT11_CRF_ID = P007K9_A94TBT11_CRF_ID[0] ;
         A93TBT11_SUBJECT_ID = P007K9_A93TBT11_SUBJECT_ID[0] ;
         A92TBT11_STUDY_ID = P007K9_A92TBT11_STUDY_ID[0] ;
         A994TBT11_SIGNATURE_DATETIME = P007K9_A994TBT11_SIGNATURE_DATETIME[0] ;
         n994TBT11_SIGNATURE_DATETIME = P007K9_n994TBT11_SIGNATURE_DATETIME[0] ;
         A40000TAM07_USER_NM = P007K9_A40000TAM07_USER_NM[0] ;
         n40000TAM07_USER_NM = P007K9_n40000TAM07_USER_NM[0] ;
         A40000TAM07_USER_NM = P007K9_A40000TAM07_USER_NM[0] ;
         n40000TAM07_USER_NM = P007K9_n40000TAM07_USER_NM[0] ;
         GXt_char4 = AV39W_SIGNER_INFO ;
         GXv_char3[0] = GXt_char4 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A994TBT11_SIGNATURE_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char3) ;
         b720_pc11_pdf_output_his.this.GXt_char4 = GXv_char3[0] ;
         AV39W_SIGNER_INFO = A40000TAM07_USER_NM + " " + GXt_char4 ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(6);
   }

   public void S161( )
   {
      /* 'SUB_CRT_DIR' Routine */
      if ( (GXutil.strcmp("", AV41W_SITE_ID)==0) || ( GXutil.strcmp(AV41W_SITE_ID, AV11B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt01_site_id()) != 0 ) )
      {
         /* Execute user subroutine: S171 */
         S171 ();
         if (returnInSub) return;
      }
      AV41W_SITE_ID = AV11B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt01_site_id() ;
      AV33W_FILE_PATH = AV36W_OUTPUT_PATH + AV42W_SITE_NM ;
      AV25W_DIR.setSource( AV33W_FILE_PATH );
      if ( ! AV25W_DIR.exists() )
      {
         AV25W_DIR.create();
      }
      AV33W_FILE_PATH = AV33W_FILE_PATH + AV30W_FILE.getSeparator() + "患者No_" + GXutil.trim( GXutil.str( AV11B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt01_subject_id(), 10, 0)) ;
      AV25W_DIR.setSource( AV33W_FILE_PATH );
      if ( ! AV25W_DIR.exists() )
      {
         AV25W_DIR.create();
      }
      AV33W_FILE_PATH = AV33W_FILE_PATH + AV30W_FILE.getSeparator() + AV21W_CRF_ORDER + "_" + AV20W_CRF_NM + "(" + GXutil.trim( GXutil.str( AV11B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Visit_no(), 10, 0)) + ")" ;
      AV25W_DIR.setSource( AV33W_FILE_PATH );
      if ( ! AV25W_DIR.exists() )
      {
         AV25W_DIR.create();
      }
   }

   public void S171( )
   {
      /* 'SUB_GET_SITE_NM' Routine */
      AV42W_SITE_NM = AV11B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt01_site_id() ;
      /* Using cursor P007K10 */
      pr_default.execute(7, new Object[] {AV11B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt01_site_id()});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A57TAM08_SITE_ID = P007K10_A57TAM08_SITE_ID[0] ;
         A319TAM08_SITE_NM = P007K10_A319TAM08_SITE_NM[0] ;
         n319TAM08_SITE_NM = P007K10_n319TAM08_SITE_NM[0] ;
         GXt_char4 = AV42W_SITE_NM ;
         GXv_char3[0] = GXt_char4 ;
         new a835_pc01_filenm_prohibition(remoteHandle, context).execute( A319TAM08_SITE_NM, GXv_char3) ;
         b720_pc11_pdf_output_his.this.GXt_char4 = GXv_char3[0] ;
         AV42W_SITE_NM = GXt_char4 ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(7);
   }

   public void S181( )
   {
      /* 'SUB_GET_CRF_NM' Routine */
      AV20W_CRF_NM = GXutil.trim( GXutil.str( AV11B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_id(), 10, 0)) ;
      /* Using cursor P007K11 */
      pr_default.execute(8, new Object[] {new Long(AV15P_STUDY_ID), new Short(AV11B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_id())});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A69TBM31_CRF_ID = P007K11_A69TBM31_CRF_ID[0] ;
         A68TBM31_STUDY_ID = P007K11_A68TBM31_STUDY_ID[0] ;
         A393TBM31_CRF_NM = P007K11_A393TBM31_CRF_NM[0] ;
         n393TBM31_CRF_NM = P007K11_n393TBM31_CRF_NM[0] ;
         GXt_char4 = AV20W_CRF_NM ;
         GXv_char3[0] = GXt_char4 ;
         new a835_pc01_filenm_prohibition(remoteHandle, context).execute( A393TBM31_CRF_NM, GXv_char3) ;
         b720_pc11_pdf_output_his.this.GXt_char4 = GXv_char3[0] ;
         AV20W_CRF_NM = GXt_char4 ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(8);
   }

   public void S191( )
   {
      /* 'SUB_ZIP' Routine */
      GXt_char4 = AV48W_ZIP_FILENAME ;
      GXv_char3[0] = GXt_char4 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( AV23W_DATETIME, "YYYYMMDDHHMISS", GXv_char3) ;
      b720_pc11_pdf_output_his.this.GXt_char4 = GXv_char3[0] ;
      AV48W_ZIP_FILENAME = GXutil.trim( GXutil.str( AV15P_STUDY_ID, 10, 0)) + "pdf_" + GXt_char4 + ".zip" ;
      AV33W_FILE_PATH = AV47W_ZIP_FILE_PATH + AV48W_ZIP_FILENAME ;
      AV50WeZipFile.compress(AV33W_FILE_PATH, AV47W_ZIP_FILE_PATH, AV49W_ZIP_PATH);
   }

   public void S201( )
   {
      /* 'SUB_PDF_DEL' Routine */
      AV25W_DIR.setSource( AV49W_ZIP_PATH );
      AV92GXV5 = 1 ;
      AV91GXV4 = (com.genexus.util.GXDirectoryCollection)AV25W_DIR.getDirectories();
      while ( AV92GXV5 <= AV91GXV4.getItemCount() )
      {
         AV40W_SITE_DIR = (com.genexus.util.GXDirectory)AV91GXV4.item(AV92GXV5);
         AV94GXV7 = 1 ;
         AV93GXV6 = (com.genexus.util.GXDirectoryCollection)AV40W_SITE_DIR.getDirectories();
         while ( AV94GXV7 <= AV93GXV6.getItemCount() )
         {
            AV44W_SUBJECT_DIR = (com.genexus.util.GXDirectory)AV93GXV6.item(AV94GXV7);
            AV96GXV9 = 1 ;
            AV95GXV8 = (com.genexus.util.GXDirectoryCollection)AV44W_SUBJECT_DIR.getDirectories();
            while ( AV96GXV9 <= AV95GXV8.getItemCount() )
            {
               AV75W_CRF_DIR = (com.genexus.util.GXDirectory)AV95GXV8.item(AV96GXV9);
               AV98GXV11 = 1 ;
               AV97GXV10 = (com.genexus.util.GXFileCollection)AV75W_CRF_DIR.getFiles("");
               while ( AV98GXV11 <= AV97GXV10.getItemCount() )
               {
                  AV30W_FILE = (com.genexus.util.GXFile)AV97GXV10.item(AV98GXV11);
                  AV30W_FILE.delete();
                  AV98GXV11 = (int)(AV98GXV11+1) ;
               }
               AV75W_CRF_DIR.delete();
               AV96GXV9 = (int)(AV96GXV9+1) ;
            }
            AV44W_SUBJECT_DIR.delete();
            AV94GXV7 = (int)(AV94GXV7+1) ;
         }
         AV40W_SITE_DIR.delete();
         AV92GXV5 = (int)(AV92GXV5+1) ;
      }
      AV25W_DIR.delete();
   }

   public void S211( )
   {
      /* 'SUB_GET_CRF_VALUE' Routine */
      /* Using cursor P007K12 */
      pr_default.execute(9, new Object[] {new Long(AV15P_STUDY_ID), new Integer(AV66W_SUBJECT_ID), new Short(AV19W_CRF_ID), new Byte(AV67W_CRF_EDA_NO), new Short(AV54W_CRF_VERSION)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A598TBT13_DEL_FLG = P007K12_A598TBT13_DEL_FLG[0] ;
         n598TBT13_DEL_FLG = P007K12_n598TBT13_DEL_FLG[0] ;
         A104TBT13_CRF_VERSION = P007K12_A104TBT13_CRF_VERSION[0] ;
         A938TBT13_CRF_EDA_NO = P007K12_A938TBT13_CRF_EDA_NO[0] ;
         A103TBT13_CRF_ID = P007K12_A103TBT13_CRF_ID[0] ;
         A102TBT13_SUBJECT_ID = P007K12_A102TBT13_SUBJECT_ID[0] ;
         A101TBT13_STUDY_ID = P007K12_A101TBT13_STUDY_ID[0] ;
         A597TBT13_CRF_VALUE = P007K12_A597TBT13_CRF_VALUE[0] ;
         n597TBT13_CRF_VALUE = P007K12_n597TBT13_CRF_VALUE[0] ;
         A106TBT13_CRF_ITEM_GRP_CD = P007K12_A106TBT13_CRF_ITEM_GRP_CD[0] ;
         A105TBT13_CRF_ITEM_GRP_DIV = P007K12_A105TBT13_CRF_ITEM_GRP_DIV[0] ;
         AV62W_CRF_VALUE = A597TBT13_CRF_VALUE ;
         AV65W_CRF_ITEM_GRP_CD = A106TBT13_CRF_ITEM_GRP_CD ;
         /* Execute user subroutine: S2211 */
         S2211 ();
         if ( returnInSub )
         {
            pr_default.close(9);
            returnInSub = true;
            if (true) return;
         }
         if ( GXutil.strcmp(AV62W_CRF_VALUE, AV63W_CRF_VALUE_FROM) != 0 )
         {
            /* Execute user subroutine: S2311 */
            S2311 ();
            if ( returnInSub )
            {
               pr_default.close(9);
               returnInSub = true;
               if (true) return;
            }
         }
         pr_default.readNext(9);
      }
      pr_default.close(9);
   }

   public void S2211( )
   {
      /* 'SUB_GET_CRF_VALUE_FROM' Routine */
      AV100GXLvl544 = (byte)(0) ;
      /* Using cursor P007K13 */
      pr_default.execute(10, new Object[] {new Long(AV15P_STUDY_ID), new Integer(AV66W_SUBJECT_ID), new Short(AV19W_CRF_ID), new Byte(AV67W_CRF_EDA_NO), new Short(AV61W_CRF_VERSION_FROM), AV65W_CRF_ITEM_GRP_CD});
      if ( Gx_err != 0 )
      {
         AV100GXLvl544 = (byte)(1) ;
      }
      while ( (pr_default.getStatus(10) != 101) )
      {
         A598TBT13_DEL_FLG = P007K13_A598TBT13_DEL_FLG[0] ;
         n598TBT13_DEL_FLG = P007K13_n598TBT13_DEL_FLG[0] ;
         A106TBT13_CRF_ITEM_GRP_CD = P007K13_A106TBT13_CRF_ITEM_GRP_CD[0] ;
         A104TBT13_CRF_VERSION = P007K13_A104TBT13_CRF_VERSION[0] ;
         A938TBT13_CRF_EDA_NO = P007K13_A938TBT13_CRF_EDA_NO[0] ;
         A103TBT13_CRF_ID = P007K13_A103TBT13_CRF_ID[0] ;
         A102TBT13_SUBJECT_ID = P007K13_A102TBT13_SUBJECT_ID[0] ;
         A101TBT13_STUDY_ID = P007K13_A101TBT13_STUDY_ID[0] ;
         A597TBT13_CRF_VALUE = P007K13_A597TBT13_CRF_VALUE[0] ;
         n597TBT13_CRF_VALUE = P007K13_n597TBT13_CRF_VALUE[0] ;
         A105TBT13_CRF_ITEM_GRP_DIV = P007K13_A105TBT13_CRF_ITEM_GRP_DIV[0] ;
         AV100GXLvl544 = (byte)(1) ;
         AV63W_CRF_VALUE_FROM = A597TBT13_CRF_VALUE ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(10);
      }
      pr_default.close(10);
      if ( AV100GXLvl544 == 0 )
      {
         AV63W_CRF_VALUE_FROM = "" ;
      }
   }

   public void S2311( )
   {
      /* 'SUB_EDIT_MARK_SET' Routine */
      AV101GXV12 = 1 ;
      while ( AV101GXV12 <= AV8B720_SD01_DESIGN_C.size() )
      {
         AV9B720_SD01_DESIGN_I = (SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem)((SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem)AV8B720_SD01_DESIGN_C.elementAt(-1+AV101GXV12));
         if ( GXutil.strcmp(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_cd(), AV65W_CRF_ITEM_GRP_CD) == 0 )
         {
            AV72W_MARK_SET_FLG = false ;
            AV74W_RADIO_FLG = false ;
            if ( (GXutil.strcmp("", AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_grp_cd())==0) )
            {
               AV72W_MARK_SET_FLG = true ;
            }
            else
            {
               AV69W_TBM32_CRF_ITEM_GRP_CD = AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_grp_cd() ;
               /* Execute user subroutine: S241 */
               S241 ();
               if (returnInSub) return;
               if ( ( ( AV74W_RADIO_FLG ) ) || ( ! AV74W_RADIO_FLG && ( GXutil.strcmp(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div(), "Group") != 0 ) ) )
               {
                  AV72W_MARK_SET_FLG = true ;
               }
            }
            if ( AV72W_MARK_SET_FLG )
            {
               AV68W_EDIT_FLG = true ;
               AV59B720_SD04_MARK_DISP_I = (SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem)new SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem(remoteHandle, context);
               AV59B720_SD04_MARK_DISP_I.setgxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Page_no( AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Page_no() );
               if ( GXutil.strcmp(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div(), "CheckBox") == 0 )
               {
                  AV59B720_SD04_MARK_DISP_I.setgxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_location_x( (short)(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_x()+27) );
                  AV59B720_SD04_MARK_DISP_I.setgxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_location_x2( (short)(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_x()+48) );
                  AV59B720_SD04_MARK_DISP_I.setgxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_location_y( AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_y() );
                  AV59B720_SD04_MARK_DISP_I.setgxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_location_y2( AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_y2() );
               }
               else if ( AV74W_RADIO_FLG )
               {
                  AV59B720_SD04_MARK_DISP_I.setgxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_location_x( (short)(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_x2()-27) );
                  AV59B720_SD04_MARK_DISP_I.setgxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_location_x2( (short)(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_x2()-6) );
                  AV59B720_SD04_MARK_DISP_I.setgxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_location_y( (short)(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_y2()-30) );
                  AV59B720_SD04_MARK_DISP_I.setgxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_location_y2( AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_y2() );
               }
               else
               {
                  AV59B720_SD04_MARK_DISP_I.setgxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_location_x( AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_x2() );
                  AV59B720_SD04_MARK_DISP_I.setgxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_location_x2( (short)(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_x2()+21) );
                  AV59B720_SD04_MARK_DISP_I.setgxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_location_y( (short)(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_y2()-30) );
                  AV59B720_SD04_MARK_DISP_I.setgxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_location_y2( AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_y2() );
               }
               AV58B720_SD04_MARK_DISP_C.add(AV59B720_SD04_MARK_DISP_I, 0);
               if (true) break;
            }
         }
         AV101GXV12 = (int)(AV101GXV12+1) ;
      }
   }

   public void S241( )
   {
      /* 'SUB_CHK_RADIO_GROUP' Routine */
      AV74W_RADIO_FLG = false ;
      AV102GXV13 = 1 ;
      while ( AV102GXV13 <= AV8B720_SD01_DESIGN_C.size() )
      {
         AV70B720_SD01_DESIGN_ICHK = (SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem)((SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem)AV8B720_SD01_DESIGN_C.elementAt(-1+AV102GXV13));
         if ( ( GXutil.strcmp(AV70B720_SD01_DESIGN_ICHK.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div(), "RadioBox") == 0 ) && ( GXutil.strcmp(AV70B720_SD01_DESIGN_ICHK.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_grp_cd(), AV69W_TBM32_CRF_ITEM_GRP_CD) == 0 ) )
         {
            AV74W_RADIO_FLG = true ;
            if (true) break;
         }
         AV102GXV13 = (int)(AV102GXV13+1) ;
      }
   }

   public void S251( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT5[0] = AV17W_A_LOGIN_SDT;
      GXv_char3[0] = AV29W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT5, GXv_char3) ;
      AV17W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT5[0] ;
      b720_pc11_pdf_output_his.this.AV29W_ERRCD = GXv_char3[0] ;
      if ( GXutil.strcmp(AV29W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "b790_wp01_error"+GXutil.URLEncode(GXutil.rtrim("1")) ;
         httpContext.wjLoc = formatLink("b790_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
         AV27W_ERR_CD = (short)(1) ;
      }
      new a804_pc01_syslog(remoteHandle, context).execute( AV80Pgmname, "INFO", "PDF出力開始") ;
   }

   public void S261( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV80Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "b790_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("b790_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S271( )
   {
      /* 'SUB_TERMINATE' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV80Pgmname, "INFO", "PDF出力終了") ;
   }

   protected void cleanup( )
   {
      this.aP2[0] = b720_pc11_pdf_output_his.this.AV47W_ZIP_FILE_PATH;
      this.aP3[0] = b720_pc11_pdf_output_his.this.AV48W_ZIP_FILENAME;
      this.aP4[0] = b720_pc11_pdf_output_his.this.AV27W_ERR_CD;
      this.aP5[0] = b720_pc11_pdf_output_his.this.AV28W_ERR_MSG;
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
                  /* Execute user subroutine: S261 */
                  S261 ();
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
      AV47W_ZIP_FILE_PATH = "" ;
      AV48W_ZIP_FILENAME = "" ;
      AV28W_ERR_MSG = "" ;
      AV12C_TAM02_APP_ID = "" ;
      AV38W_SESSION_ID = "" ;
      AV23W_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      AV16SESSION = httpContext.getWebSession();
      scmdbuf = "" ;
      P007K2_A63TBM21_STUDY_ID = new long[1] ;
      P007K2_A367TBM21_STUDY_NM = new String[] {""} ;
      P007K2_n367TBM21_STUDY_NM = new boolean[] {false} ;
      A367TBM21_STUDY_NM = "" ;
      AV45W_TBM21_STUDY_NM = "" ;
      AV41W_SITE_ID = "" ;
      AV11B720_SD02_CRF_INFO_I = new SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem(remoteHandle, context);
      AV32W_FILE_NAME = "" ;
      AV33W_FILE_PATH = "" ;
      AV30W_FILE = new com.genexus.util.GXFile();
      AV20W_CRF_NM = "" ;
      AV80Pgmname = "" ;
      AV8B720_SD01_DESIGN_C = new GxObjectCollection(SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem.class, "B720_SD01_DESIGN.B720_SD01_DESIGNItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      P007K3_A936TBT11_CRF_EDA_NO = new byte[1] ;
      P007K3_A94TBT11_CRF_ID = new short[1] ;
      P007K3_A93TBT11_SUBJECT_ID = new int[1] ;
      P007K3_A92TBT11_STUDY_ID = new long[1] ;
      P007K3_A669TBT11_DM_ARRIVAL_FLG = new String[] {""} ;
      P007K3_n669TBT11_DM_ARRIVAL_FLG = new boolean[] {false} ;
      P007K3_A666TBT11_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007K3_n666TBT11_UPLOAD_DATETIME = new boolean[] {false} ;
      P007K3_A95TBT11_CRF_VERSION = new short[1] ;
      A669TBT11_DM_ARRIVAL_FLG = "" ;
      A666TBT11_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      AV58B720_SD04_MARK_DISP_C = new GxObjectCollection(SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem.class, "B720_SD04_MARK_DISP.B720_SD04_MARK_DISPItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      AV59B720_SD04_MARK_DISP_I = new SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem(remoteHandle, context);
      GXv_objcol_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem1 = new GxObjectCollection [1] ;
      GXv_int2 = new short [1] ;
      AV39W_SIGNER_INFO = "" ;
      P007K4_A661TBT02_INPUT_END_FLG = new String[] {""} ;
      P007K4_n661TBT02_INPUT_END_FLG = new boolean[] {false} ;
      P007K4_A935TBT02_CRF_EDA_NO = new byte[1] ;
      P007K4_A91TBT02_CRF_ID = new short[1] ;
      P007K4_A90TBT02_SUBJECT_ID = new int[1] ;
      P007K4_A89TBT02_STUDY_ID = new long[1] ;
      A661TBT02_INPUT_END_FLG = "" ;
      P007K5_A669TBT11_DM_ARRIVAL_FLG = new String[] {""} ;
      P007K5_n669TBT11_DM_ARRIVAL_FLG = new boolean[] {false} ;
      P007K5_A936TBT11_CRF_EDA_NO = new byte[1] ;
      P007K5_A94TBT11_CRF_ID = new short[1] ;
      P007K5_A93TBT11_SUBJECT_ID = new int[1] ;
      P007K5_A92TBT11_STUDY_ID = new long[1] ;
      P007K5_A95TBT11_CRF_VERSION = new short[1] ;
      AV36W_OUTPUT_PATH = "" ;
      AV25W_DIR = new com.genexus.util.GXDirectory();
      AV49W_ZIP_PATH = "" ;
      AV51B720_SD03_CRF_ORDER_C = new GxObjectCollection(SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem.class, "B720_SD03_CRF_ORDER.B720_SD03_CRF_ORDERItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      P007K6_A69TBM31_CRF_ID = new short[1] ;
      P007K6_A68TBM31_STUDY_ID = new long[1] ;
      P007K6_A395TBM31_ORDER = new int[1] ;
      P007K6_n395TBM31_ORDER = new boolean[] {false} ;
      P007K6_A397TBM31_DEL_FLG = new String[] {""} ;
      P007K6_n397TBM31_DEL_FLG = new boolean[] {false} ;
      A397TBM31_DEL_FLG = "" ;
      P007K7_A945TBM44_STUDY_ID = new long[1] ;
      P007K7_A946TBM44_CRF_ID = new short[1] ;
      P007K7_A949TBM44_DEL_FLG = new String[] {""} ;
      P007K7_n949TBM44_DEL_FLG = new boolean[] {false} ;
      P007K7_A948TBM44_VISIT_NO = new int[1] ;
      P007K7_n948TBM44_VISIT_NO = new boolean[] {false} ;
      P007K7_A947TBM44_CRF_EDA_NO = new byte[1] ;
      A949TBM44_DEL_FLG = "" ;
      AV52B720_SD03_CRF_ORDER_I = new SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem(remoteHandle, context);
      AV21W_CRF_ORDER = "" ;
      P007K9_A995TBT11_SIGNATURE_USER_ID = new String[] {""} ;
      P007K9_n995TBT11_SIGNATURE_USER_ID = new boolean[] {false} ;
      P007K9_A95TBT11_CRF_VERSION = new short[1] ;
      P007K9_A936TBT11_CRF_EDA_NO = new byte[1] ;
      P007K9_A94TBT11_CRF_ID = new short[1] ;
      P007K9_A93TBT11_SUBJECT_ID = new int[1] ;
      P007K9_A92TBT11_STUDY_ID = new long[1] ;
      P007K9_A994TBT11_SIGNATURE_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007K9_n994TBT11_SIGNATURE_DATETIME = new boolean[] {false} ;
      P007K9_A40000TAM07_USER_NM = new String[] {""} ;
      P007K9_n40000TAM07_USER_NM = new boolean[] {false} ;
      A995TBT11_SIGNATURE_USER_ID = "" ;
      A994TBT11_SIGNATURE_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A40000TAM07_USER_NM = "" ;
      AV42W_SITE_NM = "" ;
      P007K10_A57TAM08_SITE_ID = new String[] {""} ;
      P007K10_A319TAM08_SITE_NM = new String[] {""} ;
      P007K10_n319TAM08_SITE_NM = new boolean[] {false} ;
      A57TAM08_SITE_ID = "" ;
      A319TAM08_SITE_NM = "" ;
      P007K11_A69TBM31_CRF_ID = new short[1] ;
      P007K11_A68TBM31_STUDY_ID = new long[1] ;
      P007K11_A393TBM31_CRF_NM = new String[] {""} ;
      P007K11_n393TBM31_CRF_NM = new boolean[] {false} ;
      A393TBM31_CRF_NM = "" ;
      GXt_char4 = "" ;
      AV50WeZipFile = new SdtWeZipFile(remoteHandle, context);
      AV91GXV4 = new com.genexus.util.GXDirectoryCollection();
      AV40W_SITE_DIR = new com.genexus.util.GXDirectory();
      AV93GXV6 = new com.genexus.util.GXDirectoryCollection();
      AV44W_SUBJECT_DIR = new com.genexus.util.GXDirectory();
      AV95GXV8 = new com.genexus.util.GXDirectoryCollection();
      AV75W_CRF_DIR = new com.genexus.util.GXDirectory();
      AV97GXV10 = new com.genexus.util.GXFileCollection();
      P007K12_A598TBT13_DEL_FLG = new String[] {""} ;
      P007K12_n598TBT13_DEL_FLG = new boolean[] {false} ;
      P007K12_A104TBT13_CRF_VERSION = new short[1] ;
      P007K12_A938TBT13_CRF_EDA_NO = new byte[1] ;
      P007K12_A103TBT13_CRF_ID = new short[1] ;
      P007K12_A102TBT13_SUBJECT_ID = new int[1] ;
      P007K12_A101TBT13_STUDY_ID = new long[1] ;
      P007K12_A597TBT13_CRF_VALUE = new String[] {""} ;
      P007K12_n597TBT13_CRF_VALUE = new boolean[] {false} ;
      P007K12_A106TBT13_CRF_ITEM_GRP_CD = new String[] {""} ;
      P007K12_A105TBT13_CRF_ITEM_GRP_DIV = new String[] {""} ;
      A598TBT13_DEL_FLG = "" ;
      A597TBT13_CRF_VALUE = "" ;
      A106TBT13_CRF_ITEM_GRP_CD = "" ;
      A105TBT13_CRF_ITEM_GRP_DIV = "" ;
      AV62W_CRF_VALUE = "" ;
      AV65W_CRF_ITEM_GRP_CD = "" ;
      AV63W_CRF_VALUE_FROM = "" ;
      P007K13_A598TBT13_DEL_FLG = new String[] {""} ;
      P007K13_n598TBT13_DEL_FLG = new boolean[] {false} ;
      P007K13_A106TBT13_CRF_ITEM_GRP_CD = new String[] {""} ;
      P007K13_A104TBT13_CRF_VERSION = new short[1] ;
      P007K13_A938TBT13_CRF_EDA_NO = new byte[1] ;
      P007K13_A103TBT13_CRF_ID = new short[1] ;
      P007K13_A102TBT13_SUBJECT_ID = new int[1] ;
      P007K13_A101TBT13_STUDY_ID = new long[1] ;
      P007K13_A597TBT13_CRF_VALUE = new String[] {""} ;
      P007K13_n597TBT13_CRF_VALUE = new boolean[] {false} ;
      P007K13_A105TBT13_CRF_ITEM_GRP_DIV = new String[] {""} ;
      AV9B720_SD01_DESIGN_I = new SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem(remoteHandle, context);
      AV69W_TBM32_CRF_ITEM_GRP_CD = "" ;
      AV70B720_SD01_DESIGN_ICHK = new SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem(remoteHandle, context);
      AV17W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      GXv_SdtA_LOGIN_SDT5 = new SdtA_LOGIN_SDT [1] ;
      AV29W_ERRCD = "" ;
      GXv_char3 = new String [1] ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b720_pc11_pdf_output_his__default(),
         new Object[] {
             new Object[] {
            P007K2_A63TBM21_STUDY_ID, P007K2_A367TBM21_STUDY_NM, P007K2_n367TBM21_STUDY_NM
            }
            , new Object[] {
            P007K3_A936TBT11_CRF_EDA_NO, P007K3_A94TBT11_CRF_ID, P007K3_A93TBT11_SUBJECT_ID, P007K3_A92TBT11_STUDY_ID, P007K3_A669TBT11_DM_ARRIVAL_FLG, P007K3_n669TBT11_DM_ARRIVAL_FLG, P007K3_A666TBT11_UPLOAD_DATETIME, P007K3_n666TBT11_UPLOAD_DATETIME, P007K3_A95TBT11_CRF_VERSION
            }
            , new Object[] {
            P007K4_A661TBT02_INPUT_END_FLG, P007K4_n661TBT02_INPUT_END_FLG, P007K4_A935TBT02_CRF_EDA_NO, P007K4_A91TBT02_CRF_ID, P007K4_A90TBT02_SUBJECT_ID, P007K4_A89TBT02_STUDY_ID
            }
            , new Object[] {
            P007K5_A669TBT11_DM_ARRIVAL_FLG, P007K5_n669TBT11_DM_ARRIVAL_FLG, P007K5_A936TBT11_CRF_EDA_NO, P007K5_A94TBT11_CRF_ID, P007K5_A93TBT11_SUBJECT_ID, P007K5_A92TBT11_STUDY_ID, P007K5_A95TBT11_CRF_VERSION
            }
            , new Object[] {
            P007K6_A69TBM31_CRF_ID, P007K6_A68TBM31_STUDY_ID, P007K6_A395TBM31_ORDER, P007K6_n395TBM31_ORDER, P007K6_A397TBM31_DEL_FLG, P007K6_n397TBM31_DEL_FLG
            }
            , new Object[] {
            P007K7_A945TBM44_STUDY_ID, P007K7_A946TBM44_CRF_ID, P007K7_A949TBM44_DEL_FLG, P007K7_n949TBM44_DEL_FLG, P007K7_A948TBM44_VISIT_NO, P007K7_n948TBM44_VISIT_NO, P007K7_A947TBM44_CRF_EDA_NO
            }
            , new Object[] {
            P007K9_A995TBT11_SIGNATURE_USER_ID, P007K9_n995TBT11_SIGNATURE_USER_ID, P007K9_A95TBT11_CRF_VERSION, P007K9_A936TBT11_CRF_EDA_NO, P007K9_A94TBT11_CRF_ID, P007K9_A93TBT11_SUBJECT_ID, P007K9_A92TBT11_STUDY_ID, P007K9_A994TBT11_SIGNATURE_DATETIME, P007K9_n994TBT11_SIGNATURE_DATETIME, P007K9_A40000TAM07_USER_NM,
            P007K9_n40000TAM07_USER_NM
            }
            , new Object[] {
            P007K10_A57TAM08_SITE_ID, P007K10_A319TAM08_SITE_NM, P007K10_n319TAM08_SITE_NM
            }
            , new Object[] {
            P007K11_A69TBM31_CRF_ID, P007K11_A68TBM31_STUDY_ID, P007K11_A393TBM31_CRF_NM, P007K11_n393TBM31_CRF_NM
            }
            , new Object[] {
            P007K12_A598TBT13_DEL_FLG, P007K12_n598TBT13_DEL_FLG, P007K12_A104TBT13_CRF_VERSION, P007K12_A938TBT13_CRF_EDA_NO, P007K12_A103TBT13_CRF_ID, P007K12_A102TBT13_SUBJECT_ID, P007K12_A101TBT13_STUDY_ID, P007K12_A597TBT13_CRF_VALUE, P007K12_n597TBT13_CRF_VALUE, P007K12_A106TBT13_CRF_ITEM_GRP_CD,
            P007K12_A105TBT13_CRF_ITEM_GRP_DIV
            }
            , new Object[] {
            P007K13_A598TBT13_DEL_FLG, P007K13_n598TBT13_DEL_FLG, P007K13_A106TBT13_CRF_ITEM_GRP_CD, P007K13_A104TBT13_CRF_VERSION, P007K13_A938TBT13_CRF_EDA_NO, P007K13_A103TBT13_CRF_ID, P007K13_A102TBT13_SUBJECT_ID, P007K13_A101TBT13_STUDY_ID, P007K13_A597TBT13_CRF_VALUE, P007K13_n597TBT13_CRF_VALUE,
            P007K13_A105TBT13_CRF_ITEM_GRP_DIV
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV80Pgmname = "B720_PC11_PDF_OUTPUT_HIS" ;
      /* GeneXus formulas. */
      AV80Pgmname = "B720_PC11_PDF_OUTPUT_HIS" ;
      Gx_err = (short)(0) ;
   }

   private byte A936TBT11_CRF_EDA_NO ;
   private byte AV67W_CRF_EDA_NO ;
   private byte A935TBT02_CRF_EDA_NO ;
   private byte A947TBM44_CRF_EDA_NO ;
   private byte A938TBT13_CRF_EDA_NO ;
   private byte AV100GXLvl544 ;
   private short AV27W_ERR_CD ;
   private short AV19W_CRF_ID ;
   private short AV71W_FOLDER_FILE_NO ;
   private short AV18W_CNT ;
   private short AV61W_CRF_VERSION_FROM ;
   private short A94TBT11_CRF_ID ;
   private short A95TBT11_CRF_VERSION ;
   private short AV54W_CRF_VERSION ;
   private short GXv_int2[] ;
   private short A91TBT02_CRF_ID ;
   private short A69TBM31_CRF_ID ;
   private short A946TBM44_CRF_ID ;
   private short A104TBT13_CRF_VERSION ;
   private short A103TBT13_CRF_ID ;
   private short Gx_err ;
   private int AV79GXV1 ;
   private int A93TBT11_SUBJECT_ID ;
   private int AV66W_SUBJECT_ID ;
   private int A90TBT02_SUBJECT_ID ;
   private int A395TBM31_ORDER ;
   private int A948TBM44_VISIT_NO ;
   private int AV86GXV2 ;
   private int AV87GXV3 ;
   private int AV92GXV5 ;
   private int AV94GXV7 ;
   private int AV96GXV9 ;
   private int AV98GXV11 ;
   private int A102TBT13_SUBJECT_ID ;
   private int AV101GXV12 ;
   private int AV102GXV13 ;
   private int GXActiveErrHndl ;
   private long AV15P_STUDY_ID ;
   private long A63TBM21_STUDY_ID ;
   private long A92TBT11_STUDY_ID ;
   private long A89TBT02_STUDY_ID ;
   private long A68TBM31_STUDY_ID ;
   private long A945TBM44_STUDY_ID ;
   private long A101TBT13_STUDY_ID ;
   private String scmdbuf ;
   private String AV80Pgmname ;
   private String GXt_char4 ;
   private String GXv_char3[] ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String Gx_emsg ;
   private java.util.Date AV23W_DATETIME ;
   private java.util.Date A666TBT11_UPLOAD_DATETIME ;
   private java.util.Date A994TBT11_SIGNATURE_DATETIME ;
   private boolean returnInSub ;
   private boolean n367TBM21_STUDY_NM ;
   private boolean AV73W_PDF_OUT_FLG ;
   private boolean AV53W_OUTPUT_FLG ;
   private boolean n669TBT11_DM_ARRIVAL_FLG ;
   private boolean n666TBT11_UPLOAD_DATETIME ;
   private boolean AV68W_EDIT_FLG ;
   private boolean n661TBT02_INPUT_END_FLG ;
   private boolean n395TBM31_ORDER ;
   private boolean n397TBM31_DEL_FLG ;
   private boolean n949TBM44_DEL_FLG ;
   private boolean n948TBM44_VISIT_NO ;
   private boolean n995TBT11_SIGNATURE_USER_ID ;
   private boolean n994TBT11_SIGNATURE_DATETIME ;
   private boolean n40000TAM07_USER_NM ;
   private boolean n319TAM08_SITE_NM ;
   private boolean n393TBM31_CRF_NM ;
   private boolean n598TBT13_DEL_FLG ;
   private boolean n597TBT13_CRF_VALUE ;
   private boolean AV72W_MARK_SET_FLG ;
   private boolean AV74W_RADIO_FLG ;
   private String AV47W_ZIP_FILE_PATH ;
   private String AV48W_ZIP_FILENAME ;
   private String AV28W_ERR_MSG ;
   private String AV12C_TAM02_APP_ID ;
   private String AV38W_SESSION_ID ;
   private String A367TBM21_STUDY_NM ;
   private String AV45W_TBM21_STUDY_NM ;
   private String AV41W_SITE_ID ;
   private String AV32W_FILE_NAME ;
   private String AV33W_FILE_PATH ;
   private String AV20W_CRF_NM ;
   private String A669TBT11_DM_ARRIVAL_FLG ;
   private String AV39W_SIGNER_INFO ;
   private String A661TBT02_INPUT_END_FLG ;
   private String AV36W_OUTPUT_PATH ;
   private String AV49W_ZIP_PATH ;
   private String A397TBM31_DEL_FLG ;
   private String A949TBM44_DEL_FLG ;
   private String AV21W_CRF_ORDER ;
   private String A995TBT11_SIGNATURE_USER_ID ;
   private String A40000TAM07_USER_NM ;
   private String AV42W_SITE_NM ;
   private String A57TAM08_SITE_ID ;
   private String A319TAM08_SITE_NM ;
   private String A393TBM31_CRF_NM ;
   private String A598TBT13_DEL_FLG ;
   private String A597TBT13_CRF_VALUE ;
   private String A106TBT13_CRF_ITEM_GRP_CD ;
   private String A105TBT13_CRF_ITEM_GRP_DIV ;
   private String AV62W_CRF_VALUE ;
   private String AV65W_CRF_ITEM_GRP_CD ;
   private String AV63W_CRF_VALUE_FROM ;
   private String AV69W_TBM32_CRF_ITEM_GRP_CD ;
   private String AV29W_ERRCD ;
   private com.genexus.webpanels.WebSession AV16SESSION ;
   private com.genexus.util.GXFile AV30W_FILE ;
   private com.genexus.util.GXDirectory AV25W_DIR ;
   private String[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private long[] P007K2_A63TBM21_STUDY_ID ;
   private String[] P007K2_A367TBM21_STUDY_NM ;
   private boolean[] P007K2_n367TBM21_STUDY_NM ;
   private byte[] P007K3_A936TBT11_CRF_EDA_NO ;
   private short[] P007K3_A94TBT11_CRF_ID ;
   private int[] P007K3_A93TBT11_SUBJECT_ID ;
   private long[] P007K3_A92TBT11_STUDY_ID ;
   private String[] P007K3_A669TBT11_DM_ARRIVAL_FLG ;
   private boolean[] P007K3_n669TBT11_DM_ARRIVAL_FLG ;
   private java.util.Date[] P007K3_A666TBT11_UPLOAD_DATETIME ;
   private boolean[] P007K3_n666TBT11_UPLOAD_DATETIME ;
   private short[] P007K3_A95TBT11_CRF_VERSION ;
   private String[] P007K4_A661TBT02_INPUT_END_FLG ;
   private boolean[] P007K4_n661TBT02_INPUT_END_FLG ;
   private byte[] P007K4_A935TBT02_CRF_EDA_NO ;
   private short[] P007K4_A91TBT02_CRF_ID ;
   private int[] P007K4_A90TBT02_SUBJECT_ID ;
   private long[] P007K4_A89TBT02_STUDY_ID ;
   private String[] P007K5_A669TBT11_DM_ARRIVAL_FLG ;
   private boolean[] P007K5_n669TBT11_DM_ARRIVAL_FLG ;
   private byte[] P007K5_A936TBT11_CRF_EDA_NO ;
   private short[] P007K5_A94TBT11_CRF_ID ;
   private int[] P007K5_A93TBT11_SUBJECT_ID ;
   private long[] P007K5_A92TBT11_STUDY_ID ;
   private short[] P007K5_A95TBT11_CRF_VERSION ;
   private short[] P007K6_A69TBM31_CRF_ID ;
   private long[] P007K6_A68TBM31_STUDY_ID ;
   private int[] P007K6_A395TBM31_ORDER ;
   private boolean[] P007K6_n395TBM31_ORDER ;
   private String[] P007K6_A397TBM31_DEL_FLG ;
   private boolean[] P007K6_n397TBM31_DEL_FLG ;
   private long[] P007K7_A945TBM44_STUDY_ID ;
   private short[] P007K7_A946TBM44_CRF_ID ;
   private String[] P007K7_A949TBM44_DEL_FLG ;
   private boolean[] P007K7_n949TBM44_DEL_FLG ;
   private int[] P007K7_A948TBM44_VISIT_NO ;
   private boolean[] P007K7_n948TBM44_VISIT_NO ;
   private byte[] P007K7_A947TBM44_CRF_EDA_NO ;
   private String[] P007K9_A995TBT11_SIGNATURE_USER_ID ;
   private boolean[] P007K9_n995TBT11_SIGNATURE_USER_ID ;
   private short[] P007K9_A95TBT11_CRF_VERSION ;
   private byte[] P007K9_A936TBT11_CRF_EDA_NO ;
   private short[] P007K9_A94TBT11_CRF_ID ;
   private int[] P007K9_A93TBT11_SUBJECT_ID ;
   private long[] P007K9_A92TBT11_STUDY_ID ;
   private java.util.Date[] P007K9_A994TBT11_SIGNATURE_DATETIME ;
   private boolean[] P007K9_n994TBT11_SIGNATURE_DATETIME ;
   private String[] P007K9_A40000TAM07_USER_NM ;
   private boolean[] P007K9_n40000TAM07_USER_NM ;
   private String[] P007K10_A57TAM08_SITE_ID ;
   private String[] P007K10_A319TAM08_SITE_NM ;
   private boolean[] P007K10_n319TAM08_SITE_NM ;
   private short[] P007K11_A69TBM31_CRF_ID ;
   private long[] P007K11_A68TBM31_STUDY_ID ;
   private String[] P007K11_A393TBM31_CRF_NM ;
   private boolean[] P007K11_n393TBM31_CRF_NM ;
   private String[] P007K12_A598TBT13_DEL_FLG ;
   private boolean[] P007K12_n598TBT13_DEL_FLG ;
   private short[] P007K12_A104TBT13_CRF_VERSION ;
   private byte[] P007K12_A938TBT13_CRF_EDA_NO ;
   private short[] P007K12_A103TBT13_CRF_ID ;
   private int[] P007K12_A102TBT13_SUBJECT_ID ;
   private long[] P007K12_A101TBT13_STUDY_ID ;
   private String[] P007K12_A597TBT13_CRF_VALUE ;
   private boolean[] P007K12_n597TBT13_CRF_VALUE ;
   private String[] P007K12_A106TBT13_CRF_ITEM_GRP_CD ;
   private String[] P007K12_A105TBT13_CRF_ITEM_GRP_DIV ;
   private String[] P007K13_A598TBT13_DEL_FLG ;
   private boolean[] P007K13_n598TBT13_DEL_FLG ;
   private String[] P007K13_A106TBT13_CRF_ITEM_GRP_CD ;
   private short[] P007K13_A104TBT13_CRF_VERSION ;
   private byte[] P007K13_A938TBT13_CRF_EDA_NO ;
   private short[] P007K13_A103TBT13_CRF_ID ;
   private int[] P007K13_A102TBT13_SUBJECT_ID ;
   private long[] P007K13_A101TBT13_STUDY_ID ;
   private String[] P007K13_A597TBT13_CRF_VALUE ;
   private boolean[] P007K13_n597TBT13_CRF_VALUE ;
   private String[] P007K13_A105TBT13_CRF_ITEM_GRP_DIV ;
   private com.genexus.util.GXFileCollection AV97GXV10 ;
   private com.genexus.util.GXDirectory AV40W_SITE_DIR ;
   private com.genexus.util.GXDirectory AV44W_SUBJECT_DIR ;
   private com.genexus.util.GXDirectory AV75W_CRF_DIR ;
   private com.genexus.util.GXDirectoryCollection AV91GXV4 ;
   private com.genexus.util.GXDirectoryCollection AV93GXV6 ;
   private com.genexus.util.GXDirectoryCollection AV95GXV8 ;
   private GxObjectCollection AV10B720_SD02_CRF_INFO_C ;
   private GxObjectCollection AV8B720_SD01_DESIGN_C ;
   private GxObjectCollection AV58B720_SD04_MARK_DISP_C ;
   private GxObjectCollection GXv_objcol_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem1[] ;
   private GxObjectCollection AV51B720_SD03_CRF_ORDER_C ;
   private SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem AV9B720_SD01_DESIGN_I ;
   private SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem AV70B720_SD01_DESIGN_ICHK ;
   private SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem AV11B720_SD02_CRF_INFO_I ;
   private SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem AV52B720_SD03_CRF_ORDER_I ;
   private SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem AV59B720_SD04_MARK_DISP_I ;
   private SdtA_LOGIN_SDT AV17W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT5[] ;
   private SdtWeZipFile AV50WeZipFile ;
}

final  class b720_pc11_pdf_output_his__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P007K2", "SELECT `TBM21_STUDY_ID`, `TBM21_STUDY_NM` FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ORDER BY `TBM21_STUDY_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P007K3", "SELECT `TBT11_CRF_EDA_NO`, `TBT11_CRF_ID`, `TBT11_SUBJECT_ID`, `TBT11_STUDY_ID`, `TBT11_DM_ARRIVAL_FLG`, `TBT11_UPLOAD_DATETIME`, `TBT11_CRF_VERSION` FROM `TBT11_CRF_HISTORY` WHERE `TBT11_STUDY_ID` = ? and `TBT11_SUBJECT_ID` = ? and `TBT11_CRF_ID` = ? and `TBT11_CRF_EDA_NO` = ? ORDER BY `TBT11_STUDY_ID`, `TBT11_SUBJECT_ID`, `TBT11_CRF_ID`, `TBT11_CRF_EDA_NO`, `TBT11_CRF_VERSION` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P007K4", "SELECT `TBT02_INPUT_END_FLG`, `TBT02_CRF_EDA_NO`, `TBT02_CRF_ID`, `TBT02_SUBJECT_ID`, `TBT02_STUDY_ID` FROM `TBT02_CRF` WHERE (`TBT02_STUDY_ID` = ? and `TBT02_SUBJECT_ID` = ? and `TBT02_CRF_ID` = ? and `TBT02_CRF_EDA_NO` = ?) AND (`TBT02_INPUT_END_FLG` = '1') ORDER BY `TBT02_STUDY_ID`, `TBT02_SUBJECT_ID`, `TBT02_CRF_ID`, `TBT02_CRF_EDA_NO`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P007K5", "SELECT `TBT11_DM_ARRIVAL_FLG`, `TBT11_CRF_EDA_NO`, `TBT11_CRF_ID`, `TBT11_SUBJECT_ID`, `TBT11_STUDY_ID`, `TBT11_CRF_VERSION` FROM `TBT11_CRF_HISTORY` WHERE (`TBT11_STUDY_ID` = ? and `TBT11_SUBJECT_ID` = ? and `TBT11_CRF_ID` = ? and `TBT11_CRF_EDA_NO` = ?) AND (`TBT11_DM_ARRIVAL_FLG` = '1') ORDER BY `TBT11_STUDY_ID`, `TBT11_SUBJECT_ID`, `TBT11_CRF_ID`, `TBT11_CRF_EDA_NO`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P007K6", "SELECT `TBM31_CRF_ID`, `TBM31_STUDY_ID`, `TBM31_ORDER`, `TBM31_DEL_FLG` FROM `TBM31_CRF` WHERE (`TBM31_STUDY_ID` = ?) AND (`TBM31_DEL_FLG` = '0') ORDER BY `TBM31_STUDY_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P007K7", "SELECT `TBM44_STUDY_ID`, `TBM44_CRF_ID`, `TBM44_DEL_FLG`, `TBM44_VISIT_NO`, `TBM44_CRF_EDA_NO` FROM `TBM44_CRF_VISIT` WHERE (`TBM44_STUDY_ID` = ? and `TBM44_CRF_ID` = ?) AND (`TBM44_DEL_FLG` = '0') ORDER BY `TBM44_STUDY_ID`, `TBM44_CRF_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P007K9", "SELECT T1.`TBT11_SIGNATURE_USER_ID`, T1.`TBT11_CRF_VERSION`, T1.`TBT11_CRF_EDA_NO`, T1.`TBT11_CRF_ID`, T1.`TBT11_SUBJECT_ID`, T1.`TBT11_STUDY_ID`, T1.`TBT11_SIGNATURE_DATETIME`, COALESCE( T2.`TAM07_USER_NM`, '') AS TAM07_USER_NM FROM (`TBT11_CRF_HISTORY` T1 LEFT JOIN (SELECT `TAM07_USER_NM` AS TAM07_USER_NM, `TAM07_USER_ID`, `TAM07_DEL_FLG` FROM `TAM07_USER` WHERE `TAM07_DEL_FLG` = '0' ) T2 ON T2.`TAM07_USER_ID` = T1.`TBT11_SIGNATURE_USER_ID`) WHERE T1.`TBT11_STUDY_ID` = ? and T1.`TBT11_SUBJECT_ID` = ? and T1.`TBT11_CRF_ID` = ? and T1.`TBT11_CRF_EDA_NO` = ? and T1.`TBT11_CRF_VERSION` = ? ORDER BY T1.`TBT11_STUDY_ID`, T1.`TBT11_SUBJECT_ID`, T1.`TBT11_CRF_ID`, T1.`TBT11_CRF_EDA_NO`, T1.`TBT11_CRF_VERSION`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P007K10", "SELECT `TAM08_SITE_ID`, `TAM08_SITE_NM` FROM `TAM08_SITE` WHERE `TAM08_SITE_ID` = ? ORDER BY `TAM08_SITE_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P007K11", "SELECT `TBM31_CRF_ID`, `TBM31_STUDY_ID`, `TBM31_CRF_NM` FROM `TBM31_CRF` WHERE `TBM31_STUDY_ID` = ? and `TBM31_CRF_ID` = ? ORDER BY `TBM31_STUDY_ID`, `TBM31_CRF_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P007K12", "SELECT `TBT13_DEL_FLG`, `TBT13_CRF_VERSION`, `TBT13_CRF_EDA_NO`, `TBT13_CRF_ID`, `TBT13_SUBJECT_ID`, `TBT13_STUDY_ID`, `TBT13_CRF_VALUE`, `TBT13_CRF_ITEM_GRP_CD`, `TBT13_CRF_ITEM_GRP_DIV` FROM `TBT13_CRF_RES_HIS` WHERE (`TBT13_STUDY_ID` = ? and `TBT13_SUBJECT_ID` = ? and `TBT13_CRF_ID` = ? and `TBT13_CRF_EDA_NO` = ? and `TBT13_CRF_VERSION` = ?) AND (`TBT13_DEL_FLG` = '0') ORDER BY `TBT13_STUDY_ID`, `TBT13_SUBJECT_ID`, `TBT13_CRF_ID`, `TBT13_CRF_EDA_NO`, `TBT13_CRF_VERSION` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P007K13", "SELECT `TBT13_DEL_FLG`, `TBT13_CRF_ITEM_GRP_CD`, `TBT13_CRF_VERSION`, `TBT13_CRF_EDA_NO`, `TBT13_CRF_ID`, `TBT13_SUBJECT_ID`, `TBT13_STUDY_ID`, `TBT13_CRF_VALUE`, `TBT13_CRF_ITEM_GRP_DIV` FROM `TBT13_CRF_RES_HIS` WHERE (`TBT13_STUDY_ID` = ? and `TBT13_SUBJECT_ID` = ? and `TBT13_CRF_ID` = ? and `TBT13_CRF_EDA_NO` = ? and `TBT13_CRF_VERSION` = ?) AND (`TBT13_CRF_ITEM_GRP_CD` = ?) AND (`TBT13_DEL_FLG` = '0') ORDER BY `TBT13_STUDY_ID`, `TBT13_SUBJECT_ID`, `TBT13_CRF_ID`, `TBT13_CRF_EDA_NO`, `TBT13_CRF_VERSION`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((int[]) buf[2])[0] = rslt.getInt(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7) ;
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2) ;
               ((short[]) buf[3])[0] = rslt.getShort(3) ;
               ((int[]) buf[4])[0] = rslt.getInt(4) ;
               ((long[]) buf[5])[0] = rslt.getLong(5) ;
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2) ;
               ((short[]) buf[3])[0] = rslt.getShort(3) ;
               ((int[]) buf[4])[0] = rslt.getInt(4) ;
               ((long[]) buf[5])[0] = rslt.getLong(5) ;
               ((short[]) buf[6])[0] = rslt.getShort(6) ;
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((int[]) buf[2])[0] = rslt.getInt(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(5) ;
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2) ;
               ((byte[]) buf[3])[0] = rslt.getByte(3) ;
               ((short[]) buf[4])[0] = rslt.getShort(4) ;
               ((int[]) buf[5])[0] = rslt.getInt(5) ;
               ((long[]) buf[6])[0] = rslt.getLong(6) ;
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(7) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 8 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2) ;
               ((byte[]) buf[3])[0] = rslt.getByte(3) ;
               ((short[]) buf[4])[0] = rslt.getShort(4) ;
               ((int[]) buf[5])[0] = rslt.getInt(5) ;
               ((long[]) buf[6])[0] = rslt.getLong(6) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(9) ;
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((short[]) buf[3])[0] = rslt.getShort(3) ;
               ((byte[]) buf[4])[0] = rslt.getByte(4) ;
               ((short[]) buf[5])[0] = rslt.getShort(5) ;
               ((int[]) buf[6])[0] = rslt.getInt(6) ;
               ((long[]) buf[7])[0] = rslt.getLong(7) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(9) ;
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 20);
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 10 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setVarchar(6, (String)parms[5], 50);
               return;
      }
   }

}

