/*
               File: B716_PC01_CSV_OUTPUT
        Description: CSV出力処理
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:13:33.61
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b716_pc01_csv_output extends GXProcedure
{
   public b716_pc01_csv_output( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b716_pc01_csv_output.class ), "" );
   }

   public b716_pc01_csv_output( int remoteHandle ,
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
      b716_pc01_csv_output.this.AV20P_STUDY_ID = aP0;
      b716_pc01_csv_output.this.AV18P_B716_SD1_CRF_INFO = aP1;
      b716_pc01_csv_output.this.aP2 = aP2;
      b716_pc01_csv_output.this.aP3 = aP3;
      b716_pc01_csv_output.this.aP4 = aP4;
      b716_pc01_csv_output.this.aP5 = aP5;
      b716_pc01_csv_output.this.aP5 = new String[] {""};
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
      b716_pc01_csv_output.this.AV20P_STUDY_ID = aP0;
      b716_pc01_csv_output.this.AV18P_B716_SD1_CRF_INFO = aP1;
      b716_pc01_csv_output.this.aP2 = aP2;
      b716_pc01_csv_output.this.aP3 = aP3;
      b716_pc01_csv_output.this.aP4 = aP4;
      b716_pc01_csv_output.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8C_TAM02_APP_ID = "B716" ;
      AV29W_ERR_CD = (short)(0) ;
      AV30W_ERR_MSG = "" ;
      AV40W_SESSION_ID = "" ;
      AV26W_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      AV32W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV32W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV8C_TAM02_APP_ID );
      AV42W_ZIP_FILE_PATH = "" ;
      AV43W_ZIP_FILENAME = "" ;
      AV40W_SESSION_ID = AV21SESSION.getId() ;
      AV26W_DATETIME = GXutil.now( ) ;
      /* Execute user subroutine: S161 */
      S161 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( AV29W_ERR_CD == 0 )
      {
         /* Execute user subroutine: S111 */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      if ( AV29W_ERR_CD == 0 )
      {
         /* Using cursor P00642 */
         pr_default.execute(0, new Object[] {AV40W_SESSION_ID, AV26W_DATETIME, new Short(AV29W_ERR_CD)});
         AV40W_SESSION_ID = P00642_AV40W_SESSION_ID[0] ;
         AV26W_DATETIME = P00642_AV26W_DATETIME[0] ;
         AV29W_ERR_CD = P00642_AV29W_ERR_CD[0] ;
         if ( AV29W_ERR_CD != 0 )
         {
            GXt_char1 = AV30W_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00051", "ストアドプロシージャの", GXutil.str( AV29W_ERR_CD, 4, 0), "", "", "", GXv_char2) ;
            b716_pc01_csv_output.this.GXt_char1 = GXv_char2[0] ;
            AV30W_ERR_MSG = GXt_char1 ;
            AV29W_ERR_CD = (short)(1) ;
         }
      }
      if ( AV29W_ERR_CD == 0 )
      {
         /* Execute user subroutine: S121 */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      if ( AV29W_ERR_CD == 0 )
      {
         /* Execute user subroutine: S131 */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      if ( AV29W_ERR_CD == 0 )
      {
         /* Execute user subroutine: S141 */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      if ( AV29W_ERR_CD == 0 )
      {
         /* Execute user subroutine: S151 */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      /* Execute user subroutine: S181 */
      S181 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_SET_PARM' Routine */
      AV64GXV1 = 1 ;
      while ( AV64GXV1 <= AV18P_B716_SD1_CRF_INFO.size() )
      {
         AV23W_B716_SD1_CRF_INFO_Item = (SdtB716_SD1_CRF_INFO_B716_SD1_CRF_INFOItem)((SdtB716_SD1_CRF_INFO_B716_SD1_CRF_INFOItem)AV18P_B716_SD1_CRF_INFO.elementAt(-1+AV64GXV1));
         /*
            INSERT RECORD ON TABLE TBW11_COND_WORK

         */
         A174TBW11_SESSION_ID = AV40W_SESSION_ID ;
         A175TBW11_DATETIME = AV26W_DATETIME ;
         A176TBW11_STUDY_ID = AV20P_STUDY_ID ;
         A177TBW11_SUBJECT_ID = AV23W_B716_SD1_CRF_INFO_Item.getgxTv_SdtB716_SD1_CRF_INFO_B716_SD1_CRF_INFOItem_Tbt02_subject_id() ;
         A178TBW11_CRF_ID = AV23W_B716_SD1_CRF_INFO_Item.getgxTv_SdtB716_SD1_CRF_INFO_B716_SD1_CRF_INFOItem_Tbt02_crf_id() ;
         A939TBW11_CRF_EDA_NO = AV23W_B716_SD1_CRF_INFO_Item.getgxTv_SdtB716_SD1_CRF_INFO_B716_SD1_CRF_INFOItem_Tbt02_crf_eda_no() ;
         /* Using cursor P00643 */
         pr_default.execute(1, new Object[] {A174TBW11_SESSION_ID, A175TBW11_DATETIME, new Long(A176TBW11_STUDY_ID), new Integer(A177TBW11_SUBJECT_ID), new Short(A178TBW11_CRF_ID), new Byte(A939TBW11_CRF_EDA_NO)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBW11_COND_WORK") ;
         if ( (pr_default.getStatus(1) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
         AV64GXV1 = (int)(AV64GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'SUB_INIT_CSV_CONF' Routine */
      GXt_char1 = AV38W_OUTPUT_PATH ;
      GXv_char2[0] = GXt_char1 ;
      new b806_pc01_get_ctrl_val(remoteHandle, context).execute( "007", GXv_char2) ;
      b716_pc01_csv_output.this.GXt_char1 = GXv_char2[0] ;
      AV38W_OUTPUT_PATH = GXt_char1 ;
      if ( GXutil.strcmp(GXutil.substring( AV38W_OUTPUT_PATH, GXutil.len( AV38W_OUTPUT_PATH), 1), AV33W_FILE.getSeparator()) != 0 )
      {
         AV38W_OUTPUT_PATH = AV38W_OUTPUT_PATH + AV33W_FILE.getSeparator() ;
      }
      AV42W_ZIP_FILE_PATH = AV38W_OUTPUT_PATH ;
      /* Using cursor P00644 */
      pr_default.execute(2, new Object[] {AV40W_SESSION_ID, AV26W_DATETIME});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A183TBW13_DATETIME = P00644_A183TBW13_DATETIME[0] ;
         A182TBW13_SESSION_ID = P00644_A182TBW13_SESSION_ID[0] ;
         A184TBW13_STUDY_ID = P00644_A184TBW13_STUDY_ID[0] ;
         A185TBW13_SUBJECT_ID = P00644_A185TBW13_SUBJECT_ID[0] ;
         A186TBW13_VISIT_NO = P00644_A186TBW13_VISIT_NO[0] ;
         A187TBW13_DOM_CD = P00644_A187TBW13_DOM_CD[0] ;
         A188TBW13_DOM_ITM_GRP_OID = P00644_A188TBW13_DOM_ITM_GRP_OID[0] ;
         A189TBW13_DOM_ITM_GRP_ROWNO = P00644_A189TBW13_DOM_ITM_GRP_ROWNO[0] ;
         AV38W_OUTPUT_PATH = AV38W_OUTPUT_PATH + GXutil.trim( GXutil.str( A184TBW13_STUDY_ID, 10, 0)) + "_" ;
         AV43W_ZIP_FILENAME = GXutil.trim( GXutil.str( A184TBW13_STUDY_ID, 10, 0)) + "_" ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      GXt_char1 = AV38W_OUTPUT_PATH ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( GXutil.now( ), "YYYYMMDDHHMISS", GXv_char2) ;
      b716_pc01_csv_output.this.GXt_char1 = GXv_char2[0] ;
      AV38W_OUTPUT_PATH = AV38W_OUTPUT_PATH + GXt_char1 ;
      GXt_char1 = AV43W_ZIP_FILENAME ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( GXutil.now( ), "YYYYMMDDHHMISS", GXv_char2) ;
      b716_pc01_csv_output.this.GXt_char1 = GXv_char2[0] ;
      AV43W_ZIP_FILENAME = AV43W_ZIP_FILENAME + GXt_char1 + ".zip" ;
      AV27W_DIR.setSource( AV38W_OUTPUT_PATH );
      if ( ! AV27W_DIR.exists() )
      {
         AV27W_DIR.create();
      }
      AV44W_ZIP_PATH = AV38W_OUTPUT_PATH ;
      AV38W_OUTPUT_PATH = AV38W_OUTPUT_PATH + AV33W_FILE.getSeparator() ;
      GXt_char1 = AV25W_CSV_SEP ;
      GXv_char2[0] = GXt_char1 ;
      new b806_pc01_get_ctrl_val(remoteHandle, context).execute( "019", GXv_char2) ;
      b716_pc01_csv_output.this.GXt_char1 = GXv_char2[0] ;
      AV25W_CSV_SEP = GXt_char1 ;
      if ( (GXutil.strcmp("", AV25W_CSV_SEP)==0) )
      {
         AV25W_CSV_SEP = "," ;
      }
      AV24W_CHAR_SET = "UTF-8 BOM" ;
   }

   public void S131( )
   {
      /* 'SUB_OUT_CSV' Routine */
      /* Using cursor P00645 */
      pr_default.execute(3, new Object[] {AV40W_SESSION_ID, AV26W_DATETIME});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk644 = false ;
         A836TBW13_VALUE = P00645_A836TBW13_VALUE[0] ;
         n836TBW13_VALUE = P00645_n836TBW13_VALUE[0] ;
         A189TBW13_DOM_ITM_GRP_ROWNO = P00645_A189TBW13_DOM_ITM_GRP_ROWNO[0] ;
         A188TBW13_DOM_ITM_GRP_OID = P00645_A188TBW13_DOM_ITM_GRP_OID[0] ;
         A186TBW13_VISIT_NO = P00645_A186TBW13_VISIT_NO[0] ;
         A185TBW13_SUBJECT_ID = P00645_A185TBW13_SUBJECT_ID[0] ;
         A184TBW13_STUDY_ID = P00645_A184TBW13_STUDY_ID[0] ;
         A187TBW13_DOM_CD = P00645_A187TBW13_DOM_CD[0] ;
         A183TBW13_DATETIME = P00645_A183TBW13_DATETIME[0] ;
         A182TBW13_SESSION_ID = P00645_A182TBW13_SESSION_ID[0] ;
         if ( AV29W_ERR_CD != 0 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         AV34W_FILE_PATH = AV38W_OUTPUT_PATH + A187TBW13_DOM_CD + ".csv" ;
         AV29W_ERR_CD = context.getSessionInstances().getDelimitedFiles().dfwopen( AV34W_FILE_PATH, "", "", (byte)(0), AV24W_CHAR_SET) ;
         if ( AV29W_ERR_CD != 0 )
         {
            GXt_char1 = AV30W_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AX00003", "", "", "", "", "", GXv_char2) ;
            b716_pc01_csv_output.this.GXt_char1 = GXv_char2[0] ;
            AV30W_ERR_MSG = GXt_char1 ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         GXv_objcol_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem3[0] = AV46B716_SD2_DOM_MAP_C ;
         GXv_int4[0] = AV50W_SEQ_POS ;
         new b716_pc02_dom_map_get(remoteHandle, context).execute( AV20P_STUDY_ID, A187TBW13_DOM_CD, GXv_objcol_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem3, GXv_int4) ;
         AV46B716_SD2_DOM_MAP_C = GXv_objcol_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem3[0] ;
         b716_pc01_csv_output.this.AV50W_SEQ_POS = GXv_int4[0] ;
         AV51W_CSV_DATA = "" ;
         AV67GXV2 = 1 ;
         while ( AV67GXV2 <= AV46B716_SD2_DOM_MAP_C.size() )
         {
            AV47B716_SD2_DOM_MAP_I = (SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem)((SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem)AV46B716_SD2_DOM_MAP_C.elementAt(-1+AV67GXV2));
            AV55W_CNT = (short)(1) ;
            while ( AV55W_CNT <= AV47B716_SD2_DOM_MAP_I.getgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_var().size() )
            {
               AV51W_CSV_DATA = AV51W_CSV_DATA + ((GXutil.strcmp("", AV51W_CSV_DATA)==0) ? "" : AV25W_CSV_SEP) ;
               AV51W_CSV_DATA = AV51W_CSV_DATA + ((SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem)AV47B716_SD2_DOM_MAP_I.getgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_var().elementAt(-1+AV55W_CNT)).getgxTv_SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem_Dom_var_nm() ;
               AV55W_CNT = (short)(AV55W_CNT+1) ;
            }
            if (true) break;
            AV67GXV2 = (int)(AV67GXV2+1) ;
         }
         AV29W_ERR_CD = context.getSessionInstances().getDelimitedFiles().dfwptxt( AV51W_CSV_DATA, (short)(GXutil.byteCount( AV51W_CSV_DATA, AV24W_CHAR_SET))) ;
         if ( AV29W_ERR_CD != 0 )
         {
            GXt_char1 = AV30W_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AX00004", "", "", "", "", "", GXv_char2) ;
            b716_pc01_csv_output.this.GXt_char1 = GXv_char2[0] ;
            AV30W_ERR_MSG = GXt_char1 ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         AV29W_ERR_CD = context.getSessionInstances().getDelimitedFiles().dfwnext( ) ;
         if ( AV29W_ERR_CD != 0 )
         {
            GXt_char1 = AV30W_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AX00004", "", "", "", "", "", GXv_char2) ;
            b716_pc01_csv_output.this.GXt_char1 = GXv_char2[0] ;
            AV30W_ERR_MSG = GXt_char1 ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         AV57W_TBW13_SUBJECT_ID = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P00645_A187TBW13_DOM_CD[0], A187TBW13_DOM_CD) == 0 ) )
         {
            brk644 = false ;
            A836TBW13_VALUE = P00645_A836TBW13_VALUE[0] ;
            n836TBW13_VALUE = P00645_n836TBW13_VALUE[0] ;
            A189TBW13_DOM_ITM_GRP_ROWNO = P00645_A189TBW13_DOM_ITM_GRP_ROWNO[0] ;
            A188TBW13_DOM_ITM_GRP_OID = P00645_A188TBW13_DOM_ITM_GRP_OID[0] ;
            A186TBW13_VISIT_NO = P00645_A186TBW13_VISIT_NO[0] ;
            A185TBW13_SUBJECT_ID = P00645_A185TBW13_SUBJECT_ID[0] ;
            A184TBW13_STUDY_ID = P00645_A184TBW13_STUDY_ID[0] ;
            A183TBW13_DATETIME = P00645_A183TBW13_DATETIME[0] ;
            A182TBW13_SESSION_ID = P00645_A182TBW13_SESSION_ID[0] ;
            if ( AV29W_ERR_CD != 0 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            AV51W_CSV_DATA = "" ;
            AV56W_DATA_OUT_FLG = false ;
            if ( AV50W_SEQ_POS == 0 )
            {
               AV56W_DATA_OUT_FLG = true ;
               AV51W_CSV_DATA = A836TBW13_VALUE ;
            }
            else
            {
               GXv_objcol_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem3[0] = AV52W_RAW_STR ;
               GXv_int4[0] = AV39W_RTN_CD ;
               GXv_char2[0] = AV53W_RTN_MSG ;
               new b807_pc03_csv_col_parse(remoteHandle, context).execute( A836TBW13_VALUE, 0, "CSV", GXv_objcol_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem3, GXv_int4, GXv_char2) ;
               AV52W_RAW_STR = GXv_objcol_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem3[0] ;
               b716_pc01_csv_output.this.AV39W_RTN_CD = GXv_int4[0] ;
               b716_pc01_csv_output.this.AV53W_RTN_MSG = GXv_char2[0] ;
               AV69GXV3 = 1 ;
               while ( AV69GXV3 <= AV46B716_SD2_DOM_MAP_C.size() )
               {
                  AV47B716_SD2_DOM_MAP_I = (SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem)((SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem)AV46B716_SD2_DOM_MAP_C.elementAt(-1+AV69GXV3));
                  if ( ( AV47B716_SD2_DOM_MAP_I.getgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Visit_no() == A186TBW13_VISIT_NO ) && ( GXutil.strcmp(AV47B716_SD2_DOM_MAP_I.getgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_itm_grp_oid(), A188TBW13_DOM_ITM_GRP_OID) == 0 ) && ( AV47B716_SD2_DOM_MAP_I.getgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_itm_grp_rowno() == A189TBW13_DOM_ITM_GRP_ROWNO ) )
                  {
                     AV55W_CNT = (short)(1) ;
                     while ( AV55W_CNT <= AV47B716_SD2_DOM_MAP_I.getgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_var().size() )
                     {
                        if ( ! (GXutil.strcmp("", ((SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem)AV47B716_SD2_DOM_MAP_I.getgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_var().elementAt(-1+AV55W_CNT)).getgxTv_SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem_Crf_item_grp_cd())==0) )
                        {
                           if ( (GXutil.strcmp("", (String)AV52W_RAW_STR.elementAt(-1+AV55W_CNT))==0) )
                           {
                           }
                           else
                           {
                              AV56W_DATA_OUT_FLG = true ;
                              if (true) break;
                           }
                        }
                        AV55W_CNT = (short)(AV55W_CNT+1) ;
                     }
                     if (true) break;
                  }
                  AV69GXV3 = (int)(AV69GXV3+1) ;
               }
               if ( AV56W_DATA_OUT_FLG )
               {
                  if ( AV57W_TBW13_SUBJECT_ID != A185TBW13_SUBJECT_ID )
                  {
                     AV57W_TBW13_SUBJECT_ID = A185TBW13_SUBJECT_ID ;
                     AV58W_SEQ = 1 ;
                  }
                  else
                  {
                     AV58W_SEQ = (long)(AV58W_SEQ+1) ;
                  }
                  AV55W_CNT = (short)(1) ;
                  while ( AV55W_CNT <= AV52W_RAW_STR.size() )
                  {
                     AV51W_CSV_DATA = AV51W_CSV_DATA + ((AV55W_CNT==1) ? "" : AV25W_CSV_SEP) ;
                     if ( AV55W_CNT == AV50W_SEQ_POS )
                     {
                        AV51W_CSV_DATA = AV51W_CSV_DATA + GXutil.trim( GXutil.str( AV58W_SEQ, 10, 0)) ;
                     }
                     else
                     {
                        AV51W_CSV_DATA = AV51W_CSV_DATA + GXutil.trim( (String)AV52W_RAW_STR.elementAt(-1+AV55W_CNT)) ;
                     }
                     AV55W_CNT = (short)(AV55W_CNT+1) ;
                  }
               }
            }
            if ( AV56W_DATA_OUT_FLG )
            {
               AV51W_CSV_DATA = GXutil.strReplace( AV51W_CSV_DATA, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "") ;
               AV51W_CSV_DATA = GXutil.strReplace( AV51W_CSV_DATA, GXutil.chr( (short)(13)), "") ;
               AV51W_CSV_DATA = GXutil.strReplace( AV51W_CSV_DATA, GXutil.chr( (short)(10)), "") ;
               AV29W_ERR_CD = context.getSessionInstances().getDelimitedFiles().dfwptxt( AV51W_CSV_DATA, (short)(GXutil.byteCount( AV51W_CSV_DATA, AV24W_CHAR_SET))) ;
               AV29W_ERR_CD = context.getSessionInstances().getDelimitedFiles().dfwnext( ) ;
               if ( AV29W_ERR_CD != 0 )
               {
                  GXt_char1 = AV30W_ERR_MSG ;
                  GXv_char2[0] = GXt_char1 ;
                  new a805_pc01_msg_get(remoteHandle, context).execute( "AX00004", "", "", "", "", "", GXv_char2) ;
                  b716_pc01_csv_output.this.GXt_char1 = GXv_char2[0] ;
                  AV30W_ERR_MSG = GXt_char1 ;
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
            brk644 = true ;
            pr_default.readNext(3);
         }
         AV29W_ERR_CD = context.getSessionInstances().getDelimitedFiles().dfwclose( ) ;
         if ( AV29W_ERR_CD != 0 )
         {
            GXt_char1 = AV30W_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AX00004", "", "", "", "", "", GXv_char2) ;
            b716_pc01_csv_output.this.GXt_char1 = GXv_char2[0] ;
            AV30W_ERR_MSG = GXt_char1 ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk644 )
         {
            brk644 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S141( )
   {
      /* 'SUB_ZIP' Routine */
      AV27W_DIR.setSource( AV44W_ZIP_PATH );
      AV71GXV5 = 1 ;
      AV70GXV4 = (com.genexus.util.GXFileCollection)AV27W_DIR.getFiles("");
      while ( AV71GXV5 <= AV70GXV4.getItemCount() )
      {
         AV33W_FILE = (com.genexus.util.GXFile)AV70GXV4.item(AV71GXV5);
         AV35W_FILES.add(AV33W_FILE.getAbsoluteName(), 0);
         AV71GXV5 = (int)(AV71GXV5+1) ;
      }
      if ( AV35W_FILES.size() > 0 )
      {
         AV34W_FILE_PATH = AV42W_ZIP_FILE_PATH + AV43W_ZIP_FILENAME ;
         new SdtGXzip(remoteHandle, context).compress(AV35W_FILES, AV34W_FILE_PATH, 9) ;
         AV55W_CNT = (short)(1) ;
         while ( AV55W_CNT <= AV35W_FILES.size() )
         {
            AV33W_FILE.setSource( (String)AV35W_FILES.elementAt(-1+AV55W_CNT) );
            AV33W_FILE.delete();
            AV55W_CNT = (short)(AV55W_CNT+1) ;
         }
         AV27W_DIR.delete();
      }
      else
      {
         GXt_char1 = AV30W_ERR_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00004", "", "", "", "", "", GXv_char2) ;
         b716_pc01_csv_output.this.GXt_char1 = GXv_char2[0] ;
         AV30W_ERR_MSG = GXt_char1 ;
         AV29W_ERR_CD = (short)(1) ;
      }
   }

   public void S151( )
   {
      /* 'SUB_DEL_WORK' Routine */
      /* Optimized DELETE. */
      /* Using cursor P00646 */
      pr_default.execute(4, new Object[] {AV40W_SESSION_ID, AV26W_DATETIME});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TBW10_CSV_WORK") ;
      /* End optimized DELETE. */
      /* Optimized DELETE. */
      /* Using cursor P00647 */
      pr_default.execute(5, new Object[] {AV40W_SESSION_ID, AV26W_DATETIME});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TBW11_COND_WORK") ;
      /* End optimized DELETE. */
      /* Optimized DELETE. */
      /* Using cursor P00648 */
      pr_default.execute(6, new Object[] {AV40W_SESSION_ID, AV26W_DATETIME});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TBW13_CSV_RECORD") ;
      /* End optimized DELETE. */
      /* Optimized DELETE. */
      /* Using cursor P00649 */
      pr_default.execute(7, new Object[] {AV40W_SESSION_ID, AV26W_DATETIME});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TBW15_TBM37REFMIN") ;
      /* End optimized DELETE. */
      /* Optimized DELETE. */
      /* Using cursor P006410 */
      pr_default.execute(8, new Object[] {AV40W_SESSION_ID, AV26W_DATETIME});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TBW16_DOM_MAP_VISIT") ;
      /* End optimized DELETE. */
   }

   public void S161( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT5[0] = AV22W_A_LOGIN_SDT;
      GXv_char2[0] = AV31W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT5, GXv_char2) ;
      AV22W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT5[0] ;
      b716_pc01_csv_output.this.AV31W_ERRCD = GXv_char2[0] ;
      if ( GXutil.strcmp(AV31W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "b790_wp01_error"+GXutil.URLEncode(GXutil.rtrim("1")) ;
         httpContext.wjLoc = formatLink("b790_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
         AV29W_ERR_CD = (short)(1) ;
      }
   }

   public void S171( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV77Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "b790_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("b790_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S181( )
   {
      /* 'SUB_TERMINATE' Routine */
      if ( AV29W_ERR_CD == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "b716_pc01_csv_output");
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "b716_pc01_csv_output");
         GXv_SdtB808_SD01_EXTRA_INFO6[0] = AV32W_EXTRA_INFO;
         GXv_int4[0] = AV29W_ERR_CD ;
         GXv_char2[0] = AV30W_ERR_MSG ;
         new b808_pc01_dbg_log(remoteHandle, context).execute( AV77Pgmname, (short)(1), AV37W_MSG, GXv_SdtB808_SD01_EXTRA_INFO6, GXv_int4, GXv_char2) ;
         AV32W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO6[0] ;
         b716_pc01_csv_output.this.AV29W_ERR_CD = GXv_int4[0] ;
         b716_pc01_csv_output.this.AV30W_ERR_MSG = GXv_char2[0] ;
      }
   }

   protected void cleanup( )
   {
      this.aP2[0] = b716_pc01_csv_output.this.AV42W_ZIP_FILE_PATH;
      this.aP3[0] = b716_pc01_csv_output.this.AV43W_ZIP_FILENAME;
      this.aP4[0] = b716_pc01_csv_output.this.AV29W_ERR_CD;
      this.aP5[0] = b716_pc01_csv_output.this.AV30W_ERR_MSG;
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
                  /* Execute user subroutine: S171 */
                  S171 ();
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
      AV42W_ZIP_FILE_PATH = "" ;
      AV43W_ZIP_FILENAME = "" ;
      AV30W_ERR_MSG = "" ;
      AV8C_TAM02_APP_ID = "" ;
      AV40W_SESSION_ID = "" ;
      AV26W_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      AV32W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV21SESSION = httpContext.getWebSession();
      P00642_AV40W_SESSION_ID = new String[] {""} ;
      P00642_AV26W_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P00642_AV29W_ERR_CD = new short[1] ;
      AV23W_B716_SD1_CRF_INFO_Item = new SdtB716_SD1_CRF_INFO_B716_SD1_CRF_INFOItem(remoteHandle, context);
      A174TBW11_SESSION_ID = "" ;
      A175TBW11_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Gx_emsg = "" ;
      AV38W_OUTPUT_PATH = "" ;
      AV33W_FILE = new com.genexus.util.GXFile();
      scmdbuf = "" ;
      P00644_A183TBW13_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P00644_A182TBW13_SESSION_ID = new String[] {""} ;
      P00644_A184TBW13_STUDY_ID = new long[1] ;
      P00644_A185TBW13_SUBJECT_ID = new int[1] ;
      P00644_A186TBW13_VISIT_NO = new int[1] ;
      P00644_A187TBW13_DOM_CD = new String[] {""} ;
      P00644_A188TBW13_DOM_ITM_GRP_OID = new String[] {""} ;
      P00644_A189TBW13_DOM_ITM_GRP_ROWNO = new short[1] ;
      A183TBW13_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A182TBW13_SESSION_ID = "" ;
      A187TBW13_DOM_CD = "" ;
      A188TBW13_DOM_ITM_GRP_OID = "" ;
      AV27W_DIR = new com.genexus.util.GXDirectory();
      AV44W_ZIP_PATH = "" ;
      AV25W_CSV_SEP = "" ;
      AV24W_CHAR_SET = "" ;
      P00645_A836TBW13_VALUE = new String[] {""} ;
      P00645_n836TBW13_VALUE = new boolean[] {false} ;
      P00645_A189TBW13_DOM_ITM_GRP_ROWNO = new short[1] ;
      P00645_A188TBW13_DOM_ITM_GRP_OID = new String[] {""} ;
      P00645_A186TBW13_VISIT_NO = new int[1] ;
      P00645_A185TBW13_SUBJECT_ID = new int[1] ;
      P00645_A184TBW13_STUDY_ID = new long[1] ;
      P00645_A187TBW13_DOM_CD = new String[] {""} ;
      P00645_A183TBW13_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P00645_A182TBW13_SESSION_ID = new String[] {""} ;
      A836TBW13_VALUE = "" ;
      AV34W_FILE_PATH = "" ;
      AV46B716_SD2_DOM_MAP_C = new GxObjectCollection(SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem.class, "B716_SD2_DOM_MAP.B716_SD2_DOM_MAPItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      AV51W_CSV_DATA = "" ;
      AV47B716_SD2_DOM_MAP_I = new SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem(remoteHandle, context);
      AV52W_RAW_STR = new GxObjectCollection(String.class, "internal", "");
      GXv_objcol_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem3 = new GxObjectCollection [1] ;
      AV53W_RTN_MSG = "" ;
      AV70GXV4 = new com.genexus.util.GXFileCollection();
      AV35W_FILES = new GxObjectCollection(String.class, "internal", "");
      GXt_char1 = "" ;
      AV22W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      GXv_SdtA_LOGIN_SDT5 = new SdtA_LOGIN_SDT [1] ;
      AV31W_ERRCD = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV77Pgmname = "" ;
      AV37W_MSG = "" ;
      GXv_SdtB808_SD01_EXTRA_INFO6 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int4 = new short [1] ;
      GXv_char2 = new String [1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b716_pc01_csv_output__default(),
         new Object[] {
             new Object[] {
            P00642_AV40W_SESSION_ID, P00642_AV26W_DATETIME, P00642_AV29W_ERR_CD
            }
            , new Object[] {
            }
            , new Object[] {
            P00644_A183TBW13_DATETIME, P00644_A182TBW13_SESSION_ID, P00644_A184TBW13_STUDY_ID, P00644_A185TBW13_SUBJECT_ID, P00644_A186TBW13_VISIT_NO, P00644_A187TBW13_DOM_CD, P00644_A188TBW13_DOM_ITM_GRP_OID, P00644_A189TBW13_DOM_ITM_GRP_ROWNO
            }
            , new Object[] {
            P00645_A836TBW13_VALUE, P00645_n836TBW13_VALUE, P00645_A189TBW13_DOM_ITM_GRP_ROWNO, P00645_A188TBW13_DOM_ITM_GRP_OID, P00645_A186TBW13_VISIT_NO, P00645_A185TBW13_SUBJECT_ID, P00645_A184TBW13_STUDY_ID, P00645_A187TBW13_DOM_CD, P00645_A183TBW13_DATETIME, P00645_A182TBW13_SESSION_ID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV77Pgmname = "B716_PC01_CSV_OUTPUT" ;
      /* GeneXus formulas. */
      AV77Pgmname = "B716_PC01_CSV_OUTPUT" ;
      Gx_err = (short)(0) ;
   }

   private byte A939TBW11_CRF_EDA_NO ;
   private short AV29W_ERR_CD ;
   private short A178TBW11_CRF_ID ;
   private short Gx_err ;
   private short A189TBW13_DOM_ITM_GRP_ROWNO ;
   private short AV50W_SEQ_POS ;
   private short AV55W_CNT ;
   private short AV39W_RTN_CD ;
   private short GXv_int4[] ;
   private int AV64GXV1 ;
   private int GX_INS59 ;
   private int A177TBW11_SUBJECT_ID ;
   private int A185TBW13_SUBJECT_ID ;
   private int A186TBW13_VISIT_NO ;
   private int AV67GXV2 ;
   private int AV57W_TBW13_SUBJECT_ID ;
   private int AV69GXV3 ;
   private int AV71GXV5 ;
   private int GXActiveErrHndl ;
   private long AV20P_STUDY_ID ;
   private long A176TBW11_STUDY_ID ;
   private long A184TBW13_STUDY_ID ;
   private long AV58W_SEQ ;
   private String Gx_emsg ;
   private String scmdbuf ;
   private String GXt_char1 ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String AV77Pgmname ;
   private String GXv_char2[] ;
   private java.util.Date AV26W_DATETIME ;
   private java.util.Date A175TBW11_DATETIME ;
   private java.util.Date A183TBW13_DATETIME ;
   private boolean returnInSub ;
   private boolean brk644 ;
   private boolean n836TBW13_VALUE ;
   private boolean AV56W_DATA_OUT_FLG ;
   private String A836TBW13_VALUE ;
   private String AV42W_ZIP_FILE_PATH ;
   private String AV43W_ZIP_FILENAME ;
   private String AV30W_ERR_MSG ;
   private String AV8C_TAM02_APP_ID ;
   private String AV40W_SESSION_ID ;
   private String A174TBW11_SESSION_ID ;
   private String AV38W_OUTPUT_PATH ;
   private String A182TBW13_SESSION_ID ;
   private String A187TBW13_DOM_CD ;
   private String A188TBW13_DOM_ITM_GRP_OID ;
   private String AV44W_ZIP_PATH ;
   private String AV25W_CSV_SEP ;
   private String AV24W_CHAR_SET ;
   private String AV34W_FILE_PATH ;
   private String AV51W_CSV_DATA ;
   private String AV53W_RTN_MSG ;
   private String AV31W_ERRCD ;
   private String AV37W_MSG ;
   private com.genexus.webpanels.WebSession AV21SESSION ;
   private com.genexus.util.GXFile AV33W_FILE ;
   private com.genexus.util.GXDirectory AV27W_DIR ;
   private String[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P00642_AV40W_SESSION_ID ;
   private java.util.Date[] P00642_AV26W_DATETIME ;
   private short[] P00642_AV29W_ERR_CD ;
   private java.util.Date[] P00644_A183TBW13_DATETIME ;
   private String[] P00644_A182TBW13_SESSION_ID ;
   private long[] P00644_A184TBW13_STUDY_ID ;
   private int[] P00644_A185TBW13_SUBJECT_ID ;
   private int[] P00644_A186TBW13_VISIT_NO ;
   private String[] P00644_A187TBW13_DOM_CD ;
   private String[] P00644_A188TBW13_DOM_ITM_GRP_OID ;
   private short[] P00644_A189TBW13_DOM_ITM_GRP_ROWNO ;
   private String[] P00645_A836TBW13_VALUE ;
   private boolean[] P00645_n836TBW13_VALUE ;
   private short[] P00645_A189TBW13_DOM_ITM_GRP_ROWNO ;
   private String[] P00645_A188TBW13_DOM_ITM_GRP_OID ;
   private int[] P00645_A186TBW13_VISIT_NO ;
   private int[] P00645_A185TBW13_SUBJECT_ID ;
   private long[] P00645_A184TBW13_STUDY_ID ;
   private String[] P00645_A187TBW13_DOM_CD ;
   private java.util.Date[] P00645_A183TBW13_DATETIME ;
   private String[] P00645_A182TBW13_SESSION_ID ;
   private com.genexus.util.GXFileCollection AV70GXV4 ;
   private GxObjectCollection AV18P_B716_SD1_CRF_INFO ;
   private GxObjectCollection AV46B716_SD2_DOM_MAP_C ;
   private GxObjectCollection AV52W_RAW_STR ;
   private GxObjectCollection GXv_objcol_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem3[] ;
   private GxObjectCollection AV35W_FILES ;
   private SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem AV47B716_SD2_DOM_MAP_I ;
   private SdtB716_SD1_CRF_INFO_B716_SD1_CRF_INFOItem AV23W_B716_SD1_CRF_INFO_Item ;
   private SdtA_LOGIN_SDT AV22W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT5[] ;
   private SdtB808_SD01_EXTRA_INFO AV32W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO6[] ;
}

final  class b716_pc01_csv_output__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new CallCursor("P00642", "CALL PROC_MASTER_CSV ( ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK,0)
         ,new UpdateCursor("P00643", "INSERT INTO `TBW11_COND_WORK`(`TBW11_SESSION_ID`, `TBW11_DATETIME`, `TBW11_STUDY_ID`, `TBW11_SUBJECT_ID`, `TBW11_CRF_ID`, `TBW11_CRF_EDA_NO`) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new ForEachCursor("P00644", "SELECT `TBW13_DATETIME`, `TBW13_SESSION_ID`, `TBW13_STUDY_ID`, `TBW13_SUBJECT_ID`, `TBW13_VISIT_NO`, `TBW13_DOM_CD`, `TBW13_DOM_ITM_GRP_OID`, `TBW13_DOM_ITM_GRP_ROWNO` FROM `TBW13_CSV_RECORD` WHERE `TBW13_SESSION_ID` = ? and `TBW13_DATETIME` = ? ORDER BY `TBW13_SESSION_ID`, `TBW13_DATETIME`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P00645", "SELECT `TBW13_VALUE`, `TBW13_DOM_ITM_GRP_ROWNO`, `TBW13_DOM_ITM_GRP_OID`, `TBW13_VISIT_NO`, `TBW13_SUBJECT_ID`, `TBW13_STUDY_ID`, `TBW13_DOM_CD`, `TBW13_DATETIME`, `TBW13_SESSION_ID` FROM `TBW13_CSV_RECORD` WHERE (`TBW13_SESSION_ID` = ?) AND (`TBW13_DATETIME` = ?) ORDER BY `TBW13_DOM_CD`, `TBW13_STUDY_ID`, `TBW13_SUBJECT_ID`, `TBW13_VISIT_NO`, `TBW13_DOM_ITM_GRP_OID`, `TBW13_DOM_ITM_GRP_ROWNO` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new UpdateCursor("P00646", "DELETE FROM `TBW10_CSV_WORK`  WHERE `TBW10_SESSION_ID` = ? and `TBW10_DATETIME` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P00647", "DELETE FROM `TBW11_COND_WORK`  WHERE `TBW11_SESSION_ID` = ? and `TBW11_DATETIME` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P00648", "DELETE FROM `TBW13_CSV_RECORD`  WHERE `TBW13_SESSION_ID` = ? and `TBW13_DATETIME` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P00649", "DELETE FROM `TBW15_TBM37REFMIN`  WHERE `TBW15_SESSION_ID` = ? and `TBW15_DATETIME` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P006410", "DELETE FROM `TBW16_DOM_MAP_VISIT`  WHERE `TBW16_SESSION_ID` = ? and `TBW16_DATETIME` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
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
               return;
            case 2 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((short[]) buf[7])[0] = rslt.getShort(8) ;
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((int[]) buf[4])[0] = rslt.getInt(4) ;
               ((int[]) buf[5])[0] = rslt.getInt(5) ;
               ((long[]) buf[6])[0] = rslt.getLong(6) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(7) ;
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(8) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(9) ;
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
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 1 , Types.VARCHAR );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 2 , Types.TIMESTAMP );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 3 , Types.NUMERIC, 0 );
               stmt.setVarchar(1, (String)parms[0], 50);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 50);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 50);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 50);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 50);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 50);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               return;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 50);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 50);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               return;
      }
   }

}

