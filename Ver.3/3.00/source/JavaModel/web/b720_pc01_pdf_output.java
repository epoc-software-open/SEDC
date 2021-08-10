/*
               File: B720_PC01_PDF_OUTPUT
        Description: PDF出力処理
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: March 3, 2021 14:42:25.22
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b720_pc01_pdf_output extends GXProcedure
{
   public b720_pc01_pdf_output( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b720_pc01_pdf_output.class ), "" );
   }

   public b720_pc01_pdf_output( int remoteHandle ,
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
      b720_pc01_pdf_output.this.AV15P_STUDY_ID = aP0;
      b720_pc01_pdf_output.this.AV10B720_SD02_CRF_INFO_C = aP1;
      b720_pc01_pdf_output.this.aP2 = aP2;
      b720_pc01_pdf_output.this.aP3 = aP3;
      b720_pc01_pdf_output.this.aP4 = aP4;
      b720_pc01_pdf_output.this.aP5 = aP5;
      b720_pc01_pdf_output.this.aP5 = new String[] {""};
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
      b720_pc01_pdf_output.this.AV15P_STUDY_ID = aP0;
      b720_pc01_pdf_output.this.AV10B720_SD02_CRF_INFO_C = aP1;
      b720_pc01_pdf_output.this.aP2 = aP2;
      b720_pc01_pdf_output.this.aP3 = aP3;
      b720_pc01_pdf_output.this.aP4 = aP4;
      b720_pc01_pdf_output.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12C_TAM02_APP_ID = "B720" ;
      AV26W_ERR_CD = (short)(0) ;
      AV27W_ERR_MSG = "" ;
      AV37W_SESSION_ID = "" ;
      AV22W_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      AV44W_ZIP_FILE_PATH = "" ;
      AV45W_ZIP_FILENAME = "" ;
      AV37W_SESSION_ID = AV16SESSION.getId() ;
      AV22W_DATETIME = GXutil.now( ) ;
      /* Execute user subroutine: S201 */
      S201 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: S111 */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Using cursor P00732 */
      pr_default.execute(0, new Object[] {new Long(AV15P_STUDY_ID)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A63TBM21_STUDY_ID = P00732_A63TBM21_STUDY_ID[0] ;
         A367TBM21_STUDY_NM = P00732_A367TBM21_STUDY_NM[0] ;
         n367TBM21_STUDY_NM = P00732_n367TBM21_STUDY_NM[0] ;
         AV42W_TBM21_STUDY_NM = A367TBM21_STUDY_NM ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Execute user subroutine: S121 */
      S121 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV10B720_SD02_CRF_INFO_C.sort("TBT02_CRF_ID, TBT01_SITE_ID");
      AV19W_CRF_ID = (short)(0) ;
      AV39W_SITE_ID = "" ;
      AV58GXV1 = 1 ;
      while ( AV58GXV1 <= AV10B720_SD02_CRF_INFO_C.size() )
      {
         AV11B720_SD02_CRF_INFO_I = (SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem)((SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem)AV10B720_SD02_CRF_INFO_C.elementAt(-1+AV58GXV1));
         /* Execute user subroutine: S151 */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( (0==AV19W_CRF_ID) || ( AV19W_CRF_ID != AV11B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_id() ) )
         {
            AV8B720_SD01_DESIGN_C.clear();
            GXv_objcol_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem1[0] = AV8B720_SD01_DESIGN_C ;
            GXv_int2[0] = AV26W_ERR_CD ;
            GXv_char3[0] = AV27W_ERR_MSG ;
            new b720_pc02_get_crf_design(remoteHandle, context).execute( AV15P_STUDY_ID, AV11B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_id(), AV11B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_eda_no(), GXv_objcol_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem1, GXv_int2, GXv_char3) ;
            AV8B720_SD01_DESIGN_C = GXv_objcol_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem1[0] ;
            b720_pc01_pdf_output.this.AV26W_ERR_CD = GXv_int2[0] ;
            b720_pc01_pdf_output.this.AV27W_ERR_MSG = GXv_char3[0] ;
            /* Execute user subroutine: S171 */
            S171 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         AV19W_CRF_ID = AV11B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_id() ;
         GXv_objcol_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem1[0] = AV8B720_SD01_DESIGN_C ;
         GXv_int2[0] = AV26W_ERR_CD ;
         GXv_char3[0] = AV27W_ERR_MSG ;
         new b720_pc03_get_crf_value(remoteHandle, context).execute( AV15P_STUDY_ID, AV11B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_id(), AV11B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_eda_no(), AV11B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt01_subject_id(), GXv_objcol_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem1, GXv_int2, GXv_char3) ;
         AV8B720_SD01_DESIGN_C = GXv_objcol_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem1[0] ;
         b720_pc01_pdf_output.this.AV26W_ERR_CD = GXv_int2[0] ;
         b720_pc01_pdf_output.this.AV27W_ERR_MSG = GXv_char3[0] ;
         /* Execute user subroutine: S141 */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: S131 */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV31W_FILE_NAME = AV32W_FILE_PATH + AV29W_FILE.getSeparator() + AV50W_CRF_ORDER + "_" + AV20W_CRF_NM + "(" + GXutil.trim( GXutil.str( AV11B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Visit_no(), 10, 0)) + ").pdf" ;
         GXv_char3[0] = AV27W_ERR_MSG ;
         new b720_rp01_pdf(remoteHandle, context).execute( AV31W_FILE_NAME, AV42W_TBM21_STUDY_NM, AV11B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Crf_name(), AV11B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt01_subject_id(), AV38W_SIGNER_INFO, AV8B720_SD01_DESIGN_C, AV53B720_SD04_MARK_DISP_C, GXv_char3) ;
         b720_pc01_pdf_output.this.AV27W_ERR_MSG = GXv_char3[0] ;
         AV58GXV1 = (int)(AV58GXV1+1) ;
      }
      if ( AV26W_ERR_CD == 0 )
      {
         /* Execute user subroutine: S181 */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: S191 */
         S191 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      /* Execute user subroutine: S221 */
      S221 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_INIT_PDF_CONF' Routine */
      GXt_char4 = AV35W_OUTPUT_PATH ;
      GXv_char3[0] = GXt_char4 ;
      new b806_pc01_get_ctrl_val(remoteHandle, context).execute( "007", GXv_char3) ;
      b720_pc01_pdf_output.this.GXt_char4 = GXv_char3[0] ;
      AV35W_OUTPUT_PATH = GXt_char4 + AV29W_FILE.getSeparator() ;
      AV44W_ZIP_FILE_PATH = AV35W_OUTPUT_PATH ;
      GXt_char4 = AV35W_OUTPUT_PATH ;
      GXv_char3[0] = GXt_char4 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( AV22W_DATETIME, "YYYYMMDDHHMISS", GXv_char3) ;
      b720_pc01_pdf_output.this.GXt_char4 = GXv_char3[0] ;
      AV35W_OUTPUT_PATH = AV35W_OUTPUT_PATH + GXutil.trim( GXutil.str( AV15P_STUDY_ID, 10, 0)) + "pdf_" + GXt_char4 ;
      AV24W_DIR.setSource( AV35W_OUTPUT_PATH );
      if ( ! AV24W_DIR.exists() )
      {
         AV24W_DIR.create();
      }
      AV46W_ZIP_PATH = AV35W_OUTPUT_PATH ;
      AV35W_OUTPUT_PATH = AV35W_OUTPUT_PATH + AV29W_FILE.getSeparator() ;
   }

   public void S121( )
   {
      /* 'SUB_GET_CRF_ORDER' Routine */
      AV51B720_SD03_CRF_ORDER_C.clear();
      /* Using cursor P00733 */
      pr_default.execute(1, new Object[] {new Long(AV15P_STUDY_ID)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A69TBM31_CRF_ID = P00733_A69TBM31_CRF_ID[0] ;
         A68TBM31_STUDY_ID = P00733_A68TBM31_STUDY_ID[0] ;
         A395TBM31_ORDER = P00733_A395TBM31_ORDER[0] ;
         n395TBM31_ORDER = P00733_n395TBM31_ORDER[0] ;
         A397TBM31_DEL_FLG = P00733_A397TBM31_DEL_FLG[0] ;
         n397TBM31_DEL_FLG = P00733_n397TBM31_DEL_FLG[0] ;
         /* Using cursor P00734 */
         pr_default.execute(2, new Object[] {new Long(A68TBM31_STUDY_ID), new Short(A69TBM31_CRF_ID)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A945TBM44_STUDY_ID = P00734_A945TBM44_STUDY_ID[0] ;
            A946TBM44_CRF_ID = P00734_A946TBM44_CRF_ID[0] ;
            A949TBM44_DEL_FLG = P00734_A949TBM44_DEL_FLG[0] ;
            n949TBM44_DEL_FLG = P00734_n949TBM44_DEL_FLG[0] ;
            A948TBM44_VISIT_NO = P00734_A948TBM44_VISIT_NO[0] ;
            n948TBM44_VISIT_NO = P00734_n948TBM44_VISIT_NO[0] ;
            A947TBM44_CRF_EDA_NO = P00734_A947TBM44_CRF_EDA_NO[0] ;
            AV52B720_SD03_CRF_ORDER_I = (SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem)new SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem(remoteHandle, context);
            AV52B720_SD03_CRF_ORDER_I.setgxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_Crf_id( A946TBM44_CRF_ID );
            AV52B720_SD03_CRF_ORDER_I.setgxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_Crf_order( A395TBM31_ORDER );
            AV52B720_SD03_CRF_ORDER_I.setgxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_Visit_no( A948TBM44_VISIT_NO );
            AV51B720_SD03_CRF_ORDER_C.add(AV52B720_SD03_CRF_ORDER_I, 0);
            pr_default.readNext(2);
         }
         pr_default.close(2);
         pr_default.readNext(1);
      }
      pr_default.close(1);
      AV51B720_SD03_CRF_ORDER_C.sort("VISIT_NO, CRF_ORDER");
      AV18W_CNT = (short)(0) ;
      AV61GXV2 = 1 ;
      while ( AV61GXV2 <= AV51B720_SD03_CRF_ORDER_C.size() )
      {
         AV52B720_SD03_CRF_ORDER_I = (SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem)((SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem)AV51B720_SD03_CRF_ORDER_C.elementAt(-1+AV61GXV2));
         AV18W_CNT = (short)(AV18W_CNT+1) ;
         AV52B720_SD03_CRF_ORDER_I.setgxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_File_no( AV18W_CNT );
         AV61GXV2 = (int)(AV61GXV2+1) ;
      }
   }

   public void S131( )
   {
      /* 'SUB_GET_FILE_NO' Routine */
      AV50W_CRF_ORDER = "" ;
      AV62GXV3 = 1 ;
      while ( AV62GXV3 <= AV51B720_SD03_CRF_ORDER_C.size() )
      {
         AV52B720_SD03_CRF_ORDER_I = (SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem)((SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem)AV51B720_SD03_CRF_ORDER_C.elementAt(-1+AV62GXV3));
         if ( ( AV52B720_SD03_CRF_ORDER_I.getgxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_Crf_id() == AV11B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_id() ) && ( AV52B720_SD03_CRF_ORDER_I.getgxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_Visit_no() == AV11B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Visit_no() ) )
         {
            AV50W_CRF_ORDER = GXutil.padl( GXutil.trim( GXutil.str( AV52B720_SD03_CRF_ORDER_I.getgxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_File_no(), 10, 0)), (short)(3), "0") ;
            if (true) break;
         }
         AV62GXV3 = (int)(AV62GXV3+1) ;
      }
   }

   public void S141( )
   {
      /* 'SUB_GET_SIGNER_INFO' Routine */
      AV38W_SIGNER_INFO = "" ;
      /* Using cursor P00736 */
      pr_default.execute(3, new Object[] {new Long(AV15P_STUDY_ID), new Integer(AV11B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt01_subject_id()), new Short(AV11B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_id()), new Byte(AV11B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_eda_no())});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A992TBT02_SIGNATURE_USER_ID = P00736_A992TBT02_SIGNATURE_USER_ID[0] ;
         n992TBT02_SIGNATURE_USER_ID = P00736_n992TBT02_SIGNATURE_USER_ID[0] ;
         A449TBT02_DEL_FLG = P00736_A449TBT02_DEL_FLG[0] ;
         n449TBT02_DEL_FLG = P00736_n449TBT02_DEL_FLG[0] ;
         A935TBT02_CRF_EDA_NO = P00736_A935TBT02_CRF_EDA_NO[0] ;
         A91TBT02_CRF_ID = P00736_A91TBT02_CRF_ID[0] ;
         A90TBT02_SUBJECT_ID = P00736_A90TBT02_SUBJECT_ID[0] ;
         A89TBT02_STUDY_ID = P00736_A89TBT02_STUDY_ID[0] ;
         A991TBT02_SIGNATURE_DATETIME = P00736_A991TBT02_SIGNATURE_DATETIME[0] ;
         n991TBT02_SIGNATURE_DATETIME = P00736_n991TBT02_SIGNATURE_DATETIME[0] ;
         A40000TAM07_USER_NM = P00736_A40000TAM07_USER_NM[0] ;
         n40000TAM07_USER_NM = P00736_n40000TAM07_USER_NM[0] ;
         A40000TAM07_USER_NM = P00736_A40000TAM07_USER_NM[0] ;
         n40000TAM07_USER_NM = P00736_n40000TAM07_USER_NM[0] ;
         GXt_char4 = AV38W_SIGNER_INFO ;
         GXv_char3[0] = GXt_char4 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A991TBT02_SIGNATURE_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char3) ;
         b720_pc01_pdf_output.this.GXt_char4 = GXv_char3[0] ;
         AV38W_SIGNER_INFO = A40000TAM07_USER_NM + " " + GXt_char4 ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
   }

   public void S151( )
   {
      /* 'SUB_CRT_DIR' Routine */
      if ( (GXutil.strcmp("", AV39W_SITE_ID)==0) || ( GXutil.strcmp(AV39W_SITE_ID, AV11B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt01_site_id()) != 0 ) )
      {
         /* Execute user subroutine: S161 */
         S161 ();
         if (returnInSub) return;
      }
      AV39W_SITE_ID = AV11B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt01_site_id() ;
      AV32W_FILE_PATH = AV35W_OUTPUT_PATH + AV40W_SITE_NM ;
      AV24W_DIR.setSource( AV32W_FILE_PATH );
      if ( ! AV24W_DIR.exists() )
      {
         AV24W_DIR.create();
      }
      AV32W_FILE_PATH = AV32W_FILE_PATH + AV29W_FILE.getSeparator() + "患者No_" + GXutil.trim( GXutil.str( AV11B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt01_subject_id(), 10, 0)) ;
      AV24W_DIR.setSource( AV32W_FILE_PATH );
      if ( ! AV24W_DIR.exists() )
      {
         AV24W_DIR.create();
      }
   }

   public void S161( )
   {
      /* 'SUB_GET_SITE_NM' Routine */
      AV40W_SITE_NM = AV11B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt01_site_id() ;
      /* Using cursor P00737 */
      pr_default.execute(4, new Object[] {AV11B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt01_site_id()});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A57TAM08_SITE_ID = P00737_A57TAM08_SITE_ID[0] ;
         A319TAM08_SITE_NM = P00737_A319TAM08_SITE_NM[0] ;
         n319TAM08_SITE_NM = P00737_n319TAM08_SITE_NM[0] ;
         GXt_char4 = AV40W_SITE_NM ;
         GXv_char3[0] = GXt_char4 ;
         new a835_pc01_filenm_prohibition(remoteHandle, context).execute( A319TAM08_SITE_NM, GXv_char3) ;
         b720_pc01_pdf_output.this.GXt_char4 = GXv_char3[0] ;
         AV40W_SITE_NM = GXt_char4 ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'SUB_GET_CRF_NM' Routine */
      AV20W_CRF_NM = GXutil.trim( GXutil.str( AV11B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_id(), 10, 0)) ;
      /* Using cursor P00738 */
      pr_default.execute(5, new Object[] {new Long(AV15P_STUDY_ID), new Short(AV11B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_id())});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A69TBM31_CRF_ID = P00738_A69TBM31_CRF_ID[0] ;
         A68TBM31_STUDY_ID = P00738_A68TBM31_STUDY_ID[0] ;
         A393TBM31_CRF_NM = P00738_A393TBM31_CRF_NM[0] ;
         n393TBM31_CRF_NM = P00738_n393TBM31_CRF_NM[0] ;
         GXt_char4 = AV20W_CRF_NM ;
         GXv_char3[0] = GXt_char4 ;
         new a835_pc01_filenm_prohibition(remoteHandle, context).execute( A393TBM31_CRF_NM, GXv_char3) ;
         b720_pc01_pdf_output.this.GXt_char4 = GXv_char3[0] ;
         AV20W_CRF_NM = GXt_char4 ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'SUB_ZIP' Routine */
      GXt_char4 = AV45W_ZIP_FILENAME ;
      GXv_char3[0] = GXt_char4 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( AV22W_DATETIME, "YYYYMMDDHHMISS", GXv_char3) ;
      b720_pc01_pdf_output.this.GXt_char4 = GXv_char3[0] ;
      AV45W_ZIP_FILENAME = GXutil.trim( GXutil.str( AV15P_STUDY_ID, 10, 0)) + "pdf_" + GXt_char4 + ".zip" ;
      AV32W_FILE_PATH = AV44W_ZIP_FILE_PATH + AV45W_ZIP_FILENAME ;
      AV47WeZipFile.compress(AV32W_FILE_PATH, AV44W_ZIP_FILE_PATH, AV46W_ZIP_PATH);
   }

   public void S191( )
   {
      /* 'SUB_PDF_DEL' Routine */
      AV24W_DIR.setSource( AV46W_ZIP_PATH );
      AV67GXV5 = 1 ;
      AV66GXV4 = (com.genexus.util.GXDirectoryCollection)AV24W_DIR.getDirectories();
      while ( AV67GXV5 <= AV66GXV4.getItemCount() )
      {
         AV48W_SITE_DIR = (com.genexus.util.GXDirectory)AV66GXV4.item(AV67GXV5);
         AV69GXV7 = 1 ;
         AV68GXV6 = (com.genexus.util.GXDirectoryCollection)AV48W_SITE_DIR.getDirectories();
         while ( AV69GXV7 <= AV68GXV6.getItemCount() )
         {
            AV49W_SUBJECT_DIR = (com.genexus.util.GXDirectory)AV68GXV6.item(AV69GXV7);
            AV71GXV9 = 1 ;
            AV70GXV8 = (com.genexus.util.GXFileCollection)AV49W_SUBJECT_DIR.getFiles("");
            while ( AV71GXV9 <= AV70GXV8.getItemCount() )
            {
               AV29W_FILE = (com.genexus.util.GXFile)AV70GXV8.item(AV71GXV9);
               AV29W_FILE.delete();
               AV71GXV9 = (int)(AV71GXV9+1) ;
            }
            AV49W_SUBJECT_DIR.delete();
            AV69GXV7 = (int)(AV69GXV7+1) ;
         }
         AV48W_SITE_DIR.delete();
         AV67GXV5 = (int)(AV67GXV5+1) ;
      }
      AV24W_DIR.delete();
   }

   public void S201( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT5[0] = AV17W_A_LOGIN_SDT;
      GXv_char3[0] = AV28W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT5, GXv_char3) ;
      AV17W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT5[0] ;
      b720_pc01_pdf_output.this.AV28W_ERRCD = GXv_char3[0] ;
      if ( GXutil.strcmp(AV28W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "b790_wp01_error"+GXutil.URLEncode(GXutil.rtrim("1")) ;
         httpContext.wjLoc = formatLink("b790_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
         AV26W_ERR_CD = (short)(1) ;
      }
      new a804_pc01_syslog(remoteHandle, context).execute( AV72Pgmname, "INFO", "PDF出力開始") ;
   }

   public void S211( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV72Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "b790_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("b790_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S221( )
   {
      /* 'SUB_TERMINATE' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV72Pgmname, "INFO", "PDF出力終了") ;
   }

   protected void cleanup( )
   {
      this.aP2[0] = b720_pc01_pdf_output.this.AV44W_ZIP_FILE_PATH;
      this.aP3[0] = b720_pc01_pdf_output.this.AV45W_ZIP_FILENAME;
      this.aP4[0] = b720_pc01_pdf_output.this.AV26W_ERR_CD;
      this.aP5[0] = b720_pc01_pdf_output.this.AV27W_ERR_MSG;
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
                  /* Execute user subroutine: S211 */
                  S211 ();
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
      AV44W_ZIP_FILE_PATH = "" ;
      AV45W_ZIP_FILENAME = "" ;
      AV27W_ERR_MSG = "" ;
      AV12C_TAM02_APP_ID = "" ;
      AV37W_SESSION_ID = "" ;
      AV22W_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      AV16SESSION = httpContext.getWebSession();
      scmdbuf = "" ;
      P00732_A63TBM21_STUDY_ID = new long[1] ;
      P00732_A367TBM21_STUDY_NM = new String[] {""} ;
      P00732_n367TBM21_STUDY_NM = new boolean[] {false} ;
      A367TBM21_STUDY_NM = "" ;
      AV42W_TBM21_STUDY_NM = "" ;
      AV39W_SITE_ID = "" ;
      AV11B720_SD02_CRF_INFO_I = new SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem(remoteHandle, context);
      AV8B720_SD01_DESIGN_C = new GxObjectCollection(SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem.class, "B720_SD01_DESIGN.B720_SD01_DESIGNItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      GXv_objcol_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem1 = new GxObjectCollection [1] ;
      GXv_int2 = new short [1] ;
      AV31W_FILE_NAME = "" ;
      AV32W_FILE_PATH = "" ;
      AV29W_FILE = new com.genexus.util.GXFile();
      AV50W_CRF_ORDER = "" ;
      AV20W_CRF_NM = "" ;
      AV38W_SIGNER_INFO = "" ;
      AV53B720_SD04_MARK_DISP_C = new GxObjectCollection(SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem.class, "B720_SD04_MARK_DISP.B720_SD04_MARK_DISPItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      AV35W_OUTPUT_PATH = "" ;
      AV24W_DIR = new com.genexus.util.GXDirectory();
      AV46W_ZIP_PATH = "" ;
      AV51B720_SD03_CRF_ORDER_C = new GxObjectCollection(SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem.class, "B720_SD03_CRF_ORDER.B720_SD03_CRF_ORDERItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      P00733_A69TBM31_CRF_ID = new short[1] ;
      P00733_A68TBM31_STUDY_ID = new long[1] ;
      P00733_A395TBM31_ORDER = new int[1] ;
      P00733_n395TBM31_ORDER = new boolean[] {false} ;
      P00733_A397TBM31_DEL_FLG = new String[] {""} ;
      P00733_n397TBM31_DEL_FLG = new boolean[] {false} ;
      A397TBM31_DEL_FLG = "" ;
      P00734_A945TBM44_STUDY_ID = new long[1] ;
      P00734_A946TBM44_CRF_ID = new short[1] ;
      P00734_A949TBM44_DEL_FLG = new String[] {""} ;
      P00734_n949TBM44_DEL_FLG = new boolean[] {false} ;
      P00734_A948TBM44_VISIT_NO = new int[1] ;
      P00734_n948TBM44_VISIT_NO = new boolean[] {false} ;
      P00734_A947TBM44_CRF_EDA_NO = new byte[1] ;
      A949TBM44_DEL_FLG = "" ;
      AV52B720_SD03_CRF_ORDER_I = new SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem(remoteHandle, context);
      P00736_A992TBT02_SIGNATURE_USER_ID = new String[] {""} ;
      P00736_n992TBT02_SIGNATURE_USER_ID = new boolean[] {false} ;
      P00736_A449TBT02_DEL_FLG = new String[] {""} ;
      P00736_n449TBT02_DEL_FLG = new boolean[] {false} ;
      P00736_A935TBT02_CRF_EDA_NO = new byte[1] ;
      P00736_A91TBT02_CRF_ID = new short[1] ;
      P00736_A90TBT02_SUBJECT_ID = new int[1] ;
      P00736_A89TBT02_STUDY_ID = new long[1] ;
      P00736_A991TBT02_SIGNATURE_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P00736_n991TBT02_SIGNATURE_DATETIME = new boolean[] {false} ;
      P00736_A40000TAM07_USER_NM = new String[] {""} ;
      P00736_n40000TAM07_USER_NM = new boolean[] {false} ;
      A992TBT02_SIGNATURE_USER_ID = "" ;
      A449TBT02_DEL_FLG = "" ;
      A991TBT02_SIGNATURE_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A40000TAM07_USER_NM = "" ;
      AV40W_SITE_NM = "" ;
      P00737_A57TAM08_SITE_ID = new String[] {""} ;
      P00737_A319TAM08_SITE_NM = new String[] {""} ;
      P00737_n319TAM08_SITE_NM = new boolean[] {false} ;
      A57TAM08_SITE_ID = "" ;
      A319TAM08_SITE_NM = "" ;
      P00738_A69TBM31_CRF_ID = new short[1] ;
      P00738_A68TBM31_STUDY_ID = new long[1] ;
      P00738_A393TBM31_CRF_NM = new String[] {""} ;
      P00738_n393TBM31_CRF_NM = new boolean[] {false} ;
      A393TBM31_CRF_NM = "" ;
      GXt_char4 = "" ;
      AV47WeZipFile = new SdtWeZipFile(remoteHandle, context);
      AV66GXV4 = new com.genexus.util.GXDirectoryCollection();
      AV48W_SITE_DIR = new com.genexus.util.GXDirectory();
      AV68GXV6 = new com.genexus.util.GXDirectoryCollection();
      AV49W_SUBJECT_DIR = new com.genexus.util.GXDirectory();
      AV70GXV8 = new com.genexus.util.GXFileCollection();
      AV17W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      GXv_SdtA_LOGIN_SDT5 = new SdtA_LOGIN_SDT [1] ;
      AV28W_ERRCD = "" ;
      GXv_char3 = new String [1] ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV72Pgmname = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b720_pc01_pdf_output__default(),
         new Object[] {
             new Object[] {
            P00732_A63TBM21_STUDY_ID, P00732_A367TBM21_STUDY_NM, P00732_n367TBM21_STUDY_NM
            }
            , new Object[] {
            P00733_A69TBM31_CRF_ID, P00733_A68TBM31_STUDY_ID, P00733_A395TBM31_ORDER, P00733_n395TBM31_ORDER, P00733_A397TBM31_DEL_FLG, P00733_n397TBM31_DEL_FLG
            }
            , new Object[] {
            P00734_A945TBM44_STUDY_ID, P00734_A946TBM44_CRF_ID, P00734_A949TBM44_DEL_FLG, P00734_n949TBM44_DEL_FLG, P00734_A948TBM44_VISIT_NO, P00734_n948TBM44_VISIT_NO, P00734_A947TBM44_CRF_EDA_NO
            }
            , new Object[] {
            P00736_A992TBT02_SIGNATURE_USER_ID, P00736_n992TBT02_SIGNATURE_USER_ID, P00736_A449TBT02_DEL_FLG, P00736_n449TBT02_DEL_FLG, P00736_A935TBT02_CRF_EDA_NO, P00736_A91TBT02_CRF_ID, P00736_A90TBT02_SUBJECT_ID, P00736_A89TBT02_STUDY_ID, P00736_A991TBT02_SIGNATURE_DATETIME, P00736_n991TBT02_SIGNATURE_DATETIME,
            P00736_A40000TAM07_USER_NM, P00736_n40000TAM07_USER_NM
            }
            , new Object[] {
            P00737_A57TAM08_SITE_ID, P00737_A319TAM08_SITE_NM, P00737_n319TAM08_SITE_NM
            }
            , new Object[] {
            P00738_A69TBM31_CRF_ID, P00738_A68TBM31_STUDY_ID, P00738_A393TBM31_CRF_NM, P00738_n393TBM31_CRF_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV72Pgmname = "B720_PC01_PDF_OUTPUT" ;
      /* GeneXus formulas. */
      AV72Pgmname = "B720_PC01_PDF_OUTPUT" ;
      Gx_err = (short)(0) ;
   }

   private byte A947TBM44_CRF_EDA_NO ;
   private byte A935TBT02_CRF_EDA_NO ;
   private short AV26W_ERR_CD ;
   private short AV19W_CRF_ID ;
   private short GXv_int2[] ;
   private short A69TBM31_CRF_ID ;
   private short A946TBM44_CRF_ID ;
   private short AV18W_CNT ;
   private short A91TBT02_CRF_ID ;
   private short Gx_err ;
   private int AV58GXV1 ;
   private int A395TBM31_ORDER ;
   private int A948TBM44_VISIT_NO ;
   private int AV61GXV2 ;
   private int AV62GXV3 ;
   private int A90TBT02_SUBJECT_ID ;
   private int AV67GXV5 ;
   private int AV69GXV7 ;
   private int AV71GXV9 ;
   private int GXActiveErrHndl ;
   private long AV15P_STUDY_ID ;
   private long A63TBM21_STUDY_ID ;
   private long A68TBM31_STUDY_ID ;
   private long A945TBM44_STUDY_ID ;
   private long A89TBT02_STUDY_ID ;
   private String scmdbuf ;
   private String GXt_char4 ;
   private String GXv_char3[] ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String AV72Pgmname ;
   private String Gx_emsg ;
   private java.util.Date AV22W_DATETIME ;
   private java.util.Date A991TBT02_SIGNATURE_DATETIME ;
   private boolean returnInSub ;
   private boolean n367TBM21_STUDY_NM ;
   private boolean n395TBM31_ORDER ;
   private boolean n397TBM31_DEL_FLG ;
   private boolean n949TBM44_DEL_FLG ;
   private boolean n948TBM44_VISIT_NO ;
   private boolean n992TBT02_SIGNATURE_USER_ID ;
   private boolean n449TBT02_DEL_FLG ;
   private boolean n991TBT02_SIGNATURE_DATETIME ;
   private boolean n40000TAM07_USER_NM ;
   private boolean n319TAM08_SITE_NM ;
   private boolean n393TBM31_CRF_NM ;
   private String AV44W_ZIP_FILE_PATH ;
   private String AV45W_ZIP_FILENAME ;
   private String AV27W_ERR_MSG ;
   private String AV12C_TAM02_APP_ID ;
   private String AV37W_SESSION_ID ;
   private String A367TBM21_STUDY_NM ;
   private String AV42W_TBM21_STUDY_NM ;
   private String AV39W_SITE_ID ;
   private String AV31W_FILE_NAME ;
   private String AV32W_FILE_PATH ;
   private String AV50W_CRF_ORDER ;
   private String AV20W_CRF_NM ;
   private String AV38W_SIGNER_INFO ;
   private String AV35W_OUTPUT_PATH ;
   private String AV46W_ZIP_PATH ;
   private String A397TBM31_DEL_FLG ;
   private String A949TBM44_DEL_FLG ;
   private String A992TBT02_SIGNATURE_USER_ID ;
   private String A449TBT02_DEL_FLG ;
   private String A40000TAM07_USER_NM ;
   private String AV40W_SITE_NM ;
   private String A57TAM08_SITE_ID ;
   private String A319TAM08_SITE_NM ;
   private String A393TBM31_CRF_NM ;
   private String AV28W_ERRCD ;
   private com.genexus.webpanels.WebSession AV16SESSION ;
   private com.genexus.util.GXFile AV29W_FILE ;
   private com.genexus.util.GXDirectory AV24W_DIR ;
   private String[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private long[] P00732_A63TBM21_STUDY_ID ;
   private String[] P00732_A367TBM21_STUDY_NM ;
   private boolean[] P00732_n367TBM21_STUDY_NM ;
   private short[] P00733_A69TBM31_CRF_ID ;
   private long[] P00733_A68TBM31_STUDY_ID ;
   private int[] P00733_A395TBM31_ORDER ;
   private boolean[] P00733_n395TBM31_ORDER ;
   private String[] P00733_A397TBM31_DEL_FLG ;
   private boolean[] P00733_n397TBM31_DEL_FLG ;
   private long[] P00734_A945TBM44_STUDY_ID ;
   private short[] P00734_A946TBM44_CRF_ID ;
   private String[] P00734_A949TBM44_DEL_FLG ;
   private boolean[] P00734_n949TBM44_DEL_FLG ;
   private int[] P00734_A948TBM44_VISIT_NO ;
   private boolean[] P00734_n948TBM44_VISIT_NO ;
   private byte[] P00734_A947TBM44_CRF_EDA_NO ;
   private String[] P00736_A992TBT02_SIGNATURE_USER_ID ;
   private boolean[] P00736_n992TBT02_SIGNATURE_USER_ID ;
   private String[] P00736_A449TBT02_DEL_FLG ;
   private boolean[] P00736_n449TBT02_DEL_FLG ;
   private byte[] P00736_A935TBT02_CRF_EDA_NO ;
   private short[] P00736_A91TBT02_CRF_ID ;
   private int[] P00736_A90TBT02_SUBJECT_ID ;
   private long[] P00736_A89TBT02_STUDY_ID ;
   private java.util.Date[] P00736_A991TBT02_SIGNATURE_DATETIME ;
   private boolean[] P00736_n991TBT02_SIGNATURE_DATETIME ;
   private String[] P00736_A40000TAM07_USER_NM ;
   private boolean[] P00736_n40000TAM07_USER_NM ;
   private String[] P00737_A57TAM08_SITE_ID ;
   private String[] P00737_A319TAM08_SITE_NM ;
   private boolean[] P00737_n319TAM08_SITE_NM ;
   private short[] P00738_A69TBM31_CRF_ID ;
   private long[] P00738_A68TBM31_STUDY_ID ;
   private String[] P00738_A393TBM31_CRF_NM ;
   private boolean[] P00738_n393TBM31_CRF_NM ;
   private com.genexus.util.GXFileCollection AV70GXV8 ;
   private com.genexus.util.GXDirectory AV48W_SITE_DIR ;
   private com.genexus.util.GXDirectory AV49W_SUBJECT_DIR ;
   private com.genexus.util.GXDirectoryCollection AV66GXV4 ;
   private com.genexus.util.GXDirectoryCollection AV68GXV6 ;
   private GxObjectCollection AV10B720_SD02_CRF_INFO_C ;
   private GxObjectCollection AV8B720_SD01_DESIGN_C ;
   private GxObjectCollection GXv_objcol_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem1[] ;
   private GxObjectCollection AV53B720_SD04_MARK_DISP_C ;
   private GxObjectCollection AV51B720_SD03_CRF_ORDER_C ;
   private SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem AV11B720_SD02_CRF_INFO_I ;
   private SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem AV52B720_SD03_CRF_ORDER_I ;
   private SdtA_LOGIN_SDT AV17W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT5[] ;
   private SdtWeZipFile AV47WeZipFile ;
}

final  class b720_pc01_pdf_output__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00732", "SELECT `TBM21_STUDY_ID`, `TBM21_STUDY_NM` FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ORDER BY `TBM21_STUDY_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P00733", "SELECT `TBM31_CRF_ID`, `TBM31_STUDY_ID`, `TBM31_ORDER`, `TBM31_DEL_FLG` FROM `TBM31_CRF` WHERE (`TBM31_STUDY_ID` = ?) AND (`TBM31_DEL_FLG` = '0') ORDER BY `TBM31_STUDY_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P00734", "SELECT `TBM44_STUDY_ID`, `TBM44_CRF_ID`, `TBM44_DEL_FLG`, `TBM44_VISIT_NO`, `TBM44_CRF_EDA_NO` FROM `TBM44_CRF_VISIT` WHERE (`TBM44_STUDY_ID` = ? and `TBM44_CRF_ID` = ?) AND (`TBM44_DEL_FLG` = '0') ORDER BY `TBM44_STUDY_ID`, `TBM44_CRF_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P00736", "SELECT T1.`TBT02_SIGNATURE_USER_ID`, T1.`TBT02_DEL_FLG`, T1.`TBT02_CRF_EDA_NO`, T1.`TBT02_CRF_ID`, T1.`TBT02_SUBJECT_ID`, T1.`TBT02_STUDY_ID`, T1.`TBT02_SIGNATURE_DATETIME`, COALESCE( T2.`TAM07_USER_NM`, '') AS TAM07_USER_NM FROM (`TBT02_CRF` T1 LEFT JOIN (SELECT `TAM07_USER_NM` AS TAM07_USER_NM, `TAM07_USER_ID`, `TAM07_DEL_FLG` FROM `TAM07_USER` WHERE `TAM07_DEL_FLG` = '0' ) T2 ON T2.`TAM07_USER_ID` = T1.`TBT02_SIGNATURE_USER_ID`) WHERE (T1.`TBT02_STUDY_ID` = ? and T1.`TBT02_SUBJECT_ID` = ? and T1.`TBT02_CRF_ID` = ? and T1.`TBT02_CRF_EDA_NO` = ?) AND (T1.`TBT02_DEL_FLG` = '0') ORDER BY T1.`TBT02_STUDY_ID`, T1.`TBT02_SUBJECT_ID`, T1.`TBT02_CRF_ID`, T1.`TBT02_CRF_EDA_NO`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P00737", "SELECT `TAM08_SITE_ID`, `TAM08_SITE_NM` FROM `TAM08_SITE` WHERE `TAM08_SITE_ID` = ? ORDER BY `TAM08_SITE_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P00738", "SELECT `TBM31_CRF_ID`, `TBM31_STUDY_ID`, `TBM31_CRF_NM` FROM `TBM31_CRF` WHERE `TBM31_STUDY_ID` = ? and `TBM31_CRF_ID` = ? ORDER BY `TBM31_STUDY_ID`, `TBM31_CRF_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((int[]) buf[2])[0] = rslt.getInt(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(5) ;
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(3) ;
               ((short[]) buf[5])[0] = rslt.getShort(4) ;
               ((int[]) buf[6])[0] = rslt.getInt(5) ;
               ((long[]) buf[7])[0] = rslt.getLong(6) ;
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(7) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 20);
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

