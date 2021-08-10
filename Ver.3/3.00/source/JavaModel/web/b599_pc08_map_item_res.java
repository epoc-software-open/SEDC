/*
               File: B599_PC08_MAP_ITEM_RES
        Description: マッピング済部品マスタ取得
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:16:25.3
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b599_pc08_map_item_res extends GXProcedure
{
   public b599_pc08_map_item_res( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b599_pc08_map_item_res.class ), "" );
   }

   public b599_pc08_map_item_res( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( long aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String aP3 ,
                             GxObjectCollection[] aP4 ,
                             short[] aP5 )
   {
      b599_pc08_map_item_res.this.AV11P_STUDY_ID = aP0;
      b599_pc08_map_item_res.this.AV9P_DOM_CD = aP1;
      b599_pc08_map_item_res.this.AV10P_DOM_VAR_NM = aP2;
      b599_pc08_map_item_res.this.AV8P_CRF_ITEM_DIV = aP3;
      b599_pc08_map_item_res.this.AV13W_RTN_CSV = aP4[0];
      this.aP4 = aP4;
      b599_pc08_map_item_res.this.aP5 = aP5;
      b599_pc08_map_item_res.this.aP6 = aP6;
      b599_pc08_map_item_res.this.aP6 = new String[] {""};
      initialize();
      privateExecute();
      return aP6[0];
   }

   public void execute( long aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String aP3 ,
                        GxObjectCollection[] aP4 ,
                        short[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( long aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String aP3 ,
                             GxObjectCollection[] aP4 ,
                             short[] aP5 ,
                             String[] aP6 )
   {
      b599_pc08_map_item_res.this.AV11P_STUDY_ID = aP0;
      b599_pc08_map_item_res.this.AV9P_DOM_CD = aP1;
      b599_pc08_map_item_res.this.AV10P_DOM_VAR_NM = aP2;
      b599_pc08_map_item_res.this.AV8P_CRF_ITEM_DIV = aP3;
      b599_pc08_map_item_res.this.AV13W_RTN_CSV = aP4[0];
      this.aP4 = aP4;
      b599_pc08_map_item_res.this.aP5 = aP5;
      b599_pc08_map_item_res.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16C_APP_ID = "B599" ;
      AV12W_RTN_CD = (short)(0) ;
      AV14W_RTN_MSG = "" ;
      AV17W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV17W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV16C_APP_ID );
      /* Execute user subroutine: S111 */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV22GXLvl31 = (byte)(0) ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV9P_DOM_CD ,
                                           AV10P_DOM_VAR_NM ,
                                           AV8P_CRF_ITEM_DIV ,
                                           A65TBM24_DOM_CD ,
                                           A66TBM24_DOM_VAR_NM ,
                                           A67TBM24_CRF_ITEM_DIV ,
                                           A544TBM24_DEL_FLG ,
                                           new Long(AV11P_STUDY_ID) ,
                                           new Long(A64TBM24_STUDY_ID) },
                                           new int[] {
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.LONG
                                           }
      });
      Gx_ope = "Fetch" ;
      Gx_etb = "TBM24_MAP_ITEM" ;
      /* Using cursor P00232 */
      pr_default.execute(0, new Object[] {new Long(AV11P_STUDY_ID), AV9P_DOM_CD, AV10P_DOM_VAR_NM, AV8P_CRF_ITEM_DIV});
      if ( Gx_err != 0 )
      {
         AV22GXLvl31 = (byte)(1) ;
      }
      while ( (pr_default.getStatus(0) != 101) )
      {
         A635TBM24_IDENTIFICATION_CD = P00232_A635TBM24_IDENTIFICATION_CD[0] ;
         n635TBM24_IDENTIFICATION_CD = P00232_n635TBM24_IDENTIFICATION_CD[0] ;
         A544TBM24_DEL_FLG = P00232_A544TBM24_DEL_FLG[0] ;
         n544TBM24_DEL_FLG = P00232_n544TBM24_DEL_FLG[0] ;
         A67TBM24_CRF_ITEM_DIV = P00232_A67TBM24_CRF_ITEM_DIV[0] ;
         A66TBM24_DOM_VAR_NM = P00232_A66TBM24_DOM_VAR_NM[0] ;
         A65TBM24_DOM_CD = P00232_A65TBM24_DOM_CD[0] ;
         A64TBM24_STUDY_ID = P00232_A64TBM24_STUDY_ID[0] ;
         A551TBM24_UPD_CNT = P00232_A551TBM24_UPD_CNT[0] ;
         n551TBM24_UPD_CNT = P00232_n551TBM24_UPD_CNT[0] ;
         A550TBM24_UPD_PROG_NM = P00232_A550TBM24_UPD_PROG_NM[0] ;
         n550TBM24_UPD_PROG_NM = P00232_n550TBM24_UPD_PROG_NM[0] ;
         A549TBM24_UPD_USER_ID = P00232_A549TBM24_UPD_USER_ID[0] ;
         n549TBM24_UPD_USER_ID = P00232_n549TBM24_UPD_USER_ID[0] ;
         A548TBM24_UPD_DATETIME = P00232_A548TBM24_UPD_DATETIME[0] ;
         n548TBM24_UPD_DATETIME = P00232_n548TBM24_UPD_DATETIME[0] ;
         A547TBM24_CRT_PROG_NM = P00232_A547TBM24_CRT_PROG_NM[0] ;
         n547TBM24_CRT_PROG_NM = P00232_n547TBM24_CRT_PROG_NM[0] ;
         A546TBM24_CRT_USER_ID = P00232_A546TBM24_CRT_USER_ID[0] ;
         n546TBM24_CRT_USER_ID = P00232_n546TBM24_CRT_USER_ID[0] ;
         A545TBM24_CRT_DATETIME = P00232_A545TBM24_CRT_DATETIME[0] ;
         n545TBM24_CRT_DATETIME = P00232_n545TBM24_CRT_DATETIME[0] ;
         A543TBM24_ORDER = P00232_A543TBM24_ORDER[0] ;
         n543TBM24_ORDER = P00232_n543TBM24_ORDER[0] ;
         A708TBM24_MAX_VALUE = P00232_A708TBM24_MAX_VALUE[0] ;
         n708TBM24_MAX_VALUE = P00232_n708TBM24_MAX_VALUE[0] ;
         A707TBM24_MIN_VALUE = P00232_A707TBM24_MIN_VALUE[0] ;
         n707TBM24_MIN_VALUE = P00232_n707TBM24_MIN_VALUE[0] ;
         A706TBM24_REQUIRED_INPUT_FLG = P00232_A706TBM24_REQUIRED_INPUT_FLG[0] ;
         n706TBM24_REQUIRED_INPUT_FLG = P00232_n706TBM24_REQUIRED_INPUT_FLG[0] ;
         A641TBM24_CHK_FALSE_INNER_VALUE = P00232_A641TBM24_CHK_FALSE_INNER_VALUE[0] ;
         n641TBM24_CHK_FALSE_INNER_VALUE = P00232_n641TBM24_CHK_FALSE_INNER_VALUE[0] ;
         A640TBM24_FIXED_VALUE = P00232_A640TBM24_FIXED_VALUE[0] ;
         n640TBM24_FIXED_VALUE = P00232_n640TBM24_FIXED_VALUE[0] ;
         A639TBM24_TEXT = P00232_A639TBM24_TEXT[0] ;
         n639TBM24_TEXT = P00232_n639TBM24_TEXT[0] ;
         A638TBM24_DECIMAL_DIGITS = P00232_A638TBM24_DECIMAL_DIGITS[0] ;
         n638TBM24_DECIMAL_DIGITS = P00232_n638TBM24_DECIMAL_DIGITS[0] ;
         A637TBM24_TEXT_MAXROWS = P00232_A637TBM24_TEXT_MAXROWS[0] ;
         n637TBM24_TEXT_MAXROWS = P00232_n637TBM24_TEXT_MAXROWS[0] ;
         A636TBM24_TEXT_MAXLENGTH = P00232_A636TBM24_TEXT_MAXLENGTH[0] ;
         n636TBM24_TEXT_MAXLENGTH = P00232_n636TBM24_TEXT_MAXLENGTH[0] ;
         A705TBM24_CRF_ITEM_NM = P00232_A705TBM24_CRF_ITEM_NM[0] ;
         n705TBM24_CRF_ITEM_NM = P00232_n705TBM24_CRF_ITEM_NM[0] ;
         A704TBM24_DOM_ITM_GRP_ROWNO = P00232_A704TBM24_DOM_ITM_GRP_ROWNO[0] ;
         n704TBM24_DOM_ITM_GRP_ROWNO = P00232_n704TBM24_DOM_ITM_GRP_ROWNO[0] ;
         A703TBM24_DOM_ITM_GRP_ATTR_SEQ = P00232_A703TBM24_DOM_ITM_GRP_ATTR_SEQ[0] ;
         n703TBM24_DOM_ITM_GRP_ATTR_SEQ = P00232_n703TBM24_DOM_ITM_GRP_ATTR_SEQ[0] ;
         A702TBM24_DOM_ITM_GRP_OID = P00232_A702TBM24_DOM_ITM_GRP_OID[0] ;
         n702TBM24_DOM_ITM_GRP_OID = P00232_n702TBM24_DOM_ITM_GRP_OID[0] ;
         AV22GXLvl31 = (byte)(1) ;
         GXt_char1 = AV15W_STR ;
         GXv_char2[0] = GXt_char1 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A65TBM24_DOM_CD, GXv_char2) ;
         b599_pc08_map_item_res.this.GXt_char1 = GXv_char2[0] ;
         GXt_char3 = AV15W_STR ;
         GXv_char4[0] = GXt_char3 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A66TBM24_DOM_VAR_NM, GXv_char4) ;
         b599_pc08_map_item_res.this.GXt_char3 = GXv_char4[0] ;
         GXt_char5 = AV15W_STR ;
         GXv_char6[0] = GXt_char5 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A702TBM24_DOM_ITM_GRP_OID, GXv_char6) ;
         b599_pc08_map_item_res.this.GXt_char5 = GXv_char6[0] ;
         GXt_char7 = AV15W_STR ;
         GXv_char8[0] = GXt_char7 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A705TBM24_CRF_ITEM_NM, GXv_char8) ;
         b599_pc08_map_item_res.this.GXt_char7 = GXv_char8[0] ;
         GXt_char9 = AV15W_STR ;
         GXv_char10[0] = GXt_char9 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A67TBM24_CRF_ITEM_DIV, GXv_char10) ;
         b599_pc08_map_item_res.this.GXt_char9 = GXv_char10[0] ;
         GXt_char11 = AV15W_STR ;
         GXv_char12[0] = GXt_char11 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A635TBM24_IDENTIFICATION_CD, GXv_char12) ;
         b599_pc08_map_item_res.this.GXt_char11 = GXv_char12[0] ;
         GXt_char13 = AV15W_STR ;
         GXv_char14[0] = GXt_char13 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A639TBM24_TEXT, GXv_char14) ;
         b599_pc08_map_item_res.this.GXt_char13 = GXv_char14[0] ;
         GXt_char15 = AV15W_STR ;
         GXv_char16[0] = GXt_char15 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A640TBM24_FIXED_VALUE, GXv_char16) ;
         b599_pc08_map_item_res.this.GXt_char15 = GXv_char16[0] ;
         GXt_char17 = AV15W_STR ;
         GXv_char18[0] = GXt_char17 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A641TBM24_CHK_FALSE_INNER_VALUE, GXv_char18) ;
         b599_pc08_map_item_res.this.GXt_char17 = GXv_char18[0] ;
         GXt_char19 = AV15W_STR ;
         GXv_char20[0] = GXt_char19 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A706TBM24_REQUIRED_INPUT_FLG, GXv_char20) ;
         b599_pc08_map_item_res.this.GXt_char19 = GXv_char20[0] ;
         GXt_char21 = AV15W_STR ;
         GXv_char22[0] = GXt_char21 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A707TBM24_MIN_VALUE, GXv_char22) ;
         b599_pc08_map_item_res.this.GXt_char21 = GXv_char22[0] ;
         GXt_char23 = AV15W_STR ;
         GXv_char24[0] = GXt_char23 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A708TBM24_MAX_VALUE, GXv_char24) ;
         b599_pc08_map_item_res.this.GXt_char23 = GXv_char24[0] ;
         GXt_char25 = AV15W_STR ;
         GXv_char26[0] = GXt_char25 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A544TBM24_DEL_FLG, GXv_char26) ;
         b599_pc08_map_item_res.this.GXt_char25 = GXv_char26[0] ;
         GXt_char27 = AV15W_STR ;
         GXv_char28[0] = GXt_char27 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A545TBM24_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char28) ;
         b599_pc08_map_item_res.this.GXt_char27 = GXv_char28[0] ;
         GXt_char29 = AV15W_STR ;
         GXv_char30[0] = GXt_char29 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A546TBM24_CRT_USER_ID, GXv_char30) ;
         b599_pc08_map_item_res.this.GXt_char29 = GXv_char30[0] ;
         GXt_char31 = AV15W_STR ;
         GXv_char32[0] = GXt_char31 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A547TBM24_CRT_PROG_NM, GXv_char32) ;
         b599_pc08_map_item_res.this.GXt_char31 = GXv_char32[0] ;
         GXt_char33 = AV15W_STR ;
         GXv_char34[0] = GXt_char33 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A548TBM24_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char34) ;
         b599_pc08_map_item_res.this.GXt_char33 = GXv_char34[0] ;
         GXt_char35 = AV15W_STR ;
         GXv_char36[0] = GXt_char35 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A549TBM24_UPD_USER_ID, GXv_char36) ;
         b599_pc08_map_item_res.this.GXt_char35 = GXv_char36[0] ;
         GXt_char37 = AV15W_STR ;
         GXv_char38[0] = GXt_char37 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A550TBM24_UPD_PROG_NM, GXv_char38) ;
         b599_pc08_map_item_res.this.GXt_char37 = GXv_char38[0] ;
         AV15W_STR = GXutil.trim( GXutil.str( A64TBM24_STUDY_ID, 10, 0)) + "," + GXt_char1 + "," + GXt_char3 + "," + GXt_char5 + "," + GXutil.trim( GXutil.str( A703TBM24_DOM_ITM_GRP_ATTR_SEQ, 10, 0)) + "," + GXutil.trim( GXutil.str( A704TBM24_DOM_ITM_GRP_ROWNO, 10, 0)) + "," + GXt_char7 + "," + GXt_char9 + "," + GXt_char11 + "," + GXutil.trim( GXutil.str( A636TBM24_TEXT_MAXLENGTH, 10, 0)) + "," + GXutil.trim( GXutil.str( A637TBM24_TEXT_MAXROWS, 10, 0)) + "," + GXutil.trim( GXutil.str( A638TBM24_DECIMAL_DIGITS, 10, 0)) + "," + GXt_char13 + "," + GXt_char15 + "," + GXt_char17 + "," + GXt_char19 + "," + GXt_char21 + "," + GXt_char23 + "," + GXutil.trim( GXutil.str( A543TBM24_ORDER, 10, 0)) + "," + GXt_char25 + "," + GXt_char27 + "," + GXt_char29 + "," + GXt_char31 + "," + GXt_char33 + "," + GXt_char35 + "," + GXt_char37 + "," + GXutil.trim( GXutil.str( A551TBM24_UPD_CNT, 10, 0)) + "," ;
         if ( ((GXutil.strcmp(A67TBM24_CRF_ITEM_DIV, "SelectBox")==0)||(GXutil.strcmp(A67TBM24_CRF_ITEM_DIV, "RadioGroup")==0)) && ! (GXutil.strcmp("", A635TBM24_IDENTIFICATION_CD)==0) )
         {
            Gx_ope = "Fetch" ;
            Gx_etb = "TBM25_SEL_LIST" ;
            /* Using cursor P00233 */
            pr_default.execute(1, new Object[] {new Long(AV11P_STUDY_ID), new Boolean(n635TBM24_IDENTIFICATION_CD), A635TBM24_IDENTIFICATION_CD});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A24TBM25_LIST_CD = P00233_A24TBM25_LIST_CD[0] ;
               A553TBM25_DEL_FLG = P00233_A553TBM25_DEL_FLG[0] ;
               n553TBM25_DEL_FLG = P00233_n553TBM25_DEL_FLG[0] ;
               A23TBM25_STUDY_ID = P00233_A23TBM25_STUDY_ID[0] ;
               A552TBM25_LIST_NM = P00233_A552TBM25_LIST_NM[0] ;
               n552TBM25_LIST_NM = P00233_n552TBM25_LIST_NM[0] ;
               GXt_char37 = AV15W_STR ;
               GXv_char38[0] = GXt_char37 ;
               new b804_pc01_esc_airres(remoteHandle, context).execute( A552TBM25_LIST_NM, GXv_char38) ;
               b599_pc08_map_item_res.this.GXt_char37 = GXv_char38[0] ;
               AV15W_STR = AV15W_STR + GXt_char37 ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(1);
         }
         AV13W_RTN_CSV.add(AV15W_STR, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV22GXLvl31 == 0 )
      {
         AV12W_RTN_CD = (short)(1) ;
         GXt_char37 = AV14W_RTN_MSG ;
         GXv_char38[0] = GXt_char37 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char38) ;
         b599_pc08_map_item_res.this.GXt_char37 = GXv_char38[0] ;
         AV14W_RTN_MSG = GXt_char37 ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      AV17W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      AV18W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV18W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_STUDY_ID" );
      AV18W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( GXutil.trim( GXutil.str( AV11P_STUDY_ID, 10, 0)) );
      AV17W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV18W_PARMS_ITEM, 0);
      AV18W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV18W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_DOM_CD" );
      AV18W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV9P_DOM_CD );
      AV17W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV18W_PARMS_ITEM, 0);
      AV18W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV18W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_DOM_VAR_NM" );
      AV18W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV10P_DOM_VAR_NM );
      AV17W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV18W_PARMS_ITEM, 0);
      AV18W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV18W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_CRF_ITEM_DIV" );
      AV18W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV8P_CRF_ITEM_DIV );
      AV17W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV18W_PARMS_ITEM, 0);
      AV19W_MSG = "SUB_INIT" ;
      GXv_SdtB808_SD01_EXTRA_INFO39[0] = AV17W_EXTRA_INFO;
      GXv_int40[0] = AV12W_RTN_CD ;
      GXv_char38[0] = AV14W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV24Pgmname, (short)(1), AV19W_MSG, GXv_SdtB808_SD01_EXTRA_INFO39, GXv_int40, GXv_char38) ;
      AV17W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO39[0] ;
      b599_pc08_map_item_res.this.AV12W_RTN_CD = GXv_int40[0] ;
      b599_pc08_map_item_res.this.AV14W_RTN_MSG = GXv_char38[0] ;
   }

   public void S121( )
   {
      /* 'SUB_ERROR' Routine */
      AV19W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO39[0] = AV17W_EXTRA_INFO;
      GXv_int40[0] = AV12W_RTN_CD ;
      GXv_char38[0] = AV14W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV24Pgmname, (short)(0), AV19W_MSG, GXv_SdtB808_SD01_EXTRA_INFO39, GXv_int40, GXv_char38) ;
      AV17W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO39[0] ;
      b599_pc08_map_item_res.this.AV12W_RTN_CD = GXv_int40[0] ;
      b599_pc08_map_item_res.this.AV14W_RTN_MSG = GXv_char38[0] ;
      context.globals.Gx_eop = (byte)(0) ;
   }

   protected void cleanup( )
   {
      this.aP4[0] = b599_pc08_map_item_res.this.AV13W_RTN_CSV;
      this.aP5[0] = b599_pc08_map_item_res.this.AV12W_RTN_CD;
      this.aP6[0] = b599_pc08_map_item_res.this.AV14W_RTN_MSG;
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
                  /* Execute user subroutine: S121 */
                  S121 ();
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
      AV14W_RTN_MSG = "" ;
      AV16C_APP_ID = "" ;
      AV17W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      scmdbuf = "" ;
      A65TBM24_DOM_CD = "" ;
      A66TBM24_DOM_VAR_NM = "" ;
      A67TBM24_CRF_ITEM_DIV = "" ;
      A544TBM24_DEL_FLG = "" ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      P00232_A635TBM24_IDENTIFICATION_CD = new String[] {""} ;
      P00232_n635TBM24_IDENTIFICATION_CD = new boolean[] {false} ;
      P00232_A544TBM24_DEL_FLG = new String[] {""} ;
      P00232_n544TBM24_DEL_FLG = new boolean[] {false} ;
      P00232_A67TBM24_CRF_ITEM_DIV = new String[] {""} ;
      P00232_A66TBM24_DOM_VAR_NM = new String[] {""} ;
      P00232_A65TBM24_DOM_CD = new String[] {""} ;
      P00232_A64TBM24_STUDY_ID = new long[1] ;
      P00232_A551TBM24_UPD_CNT = new long[1] ;
      P00232_n551TBM24_UPD_CNT = new boolean[] {false} ;
      P00232_A550TBM24_UPD_PROG_NM = new String[] {""} ;
      P00232_n550TBM24_UPD_PROG_NM = new boolean[] {false} ;
      P00232_A549TBM24_UPD_USER_ID = new String[] {""} ;
      P00232_n549TBM24_UPD_USER_ID = new boolean[] {false} ;
      P00232_A548TBM24_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P00232_n548TBM24_UPD_DATETIME = new boolean[] {false} ;
      P00232_A547TBM24_CRT_PROG_NM = new String[] {""} ;
      P00232_n547TBM24_CRT_PROG_NM = new boolean[] {false} ;
      P00232_A546TBM24_CRT_USER_ID = new String[] {""} ;
      P00232_n546TBM24_CRT_USER_ID = new boolean[] {false} ;
      P00232_A545TBM24_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P00232_n545TBM24_CRT_DATETIME = new boolean[] {false} ;
      P00232_A543TBM24_ORDER = new int[1] ;
      P00232_n543TBM24_ORDER = new boolean[] {false} ;
      P00232_A708TBM24_MAX_VALUE = new String[] {""} ;
      P00232_n708TBM24_MAX_VALUE = new boolean[] {false} ;
      P00232_A707TBM24_MIN_VALUE = new String[] {""} ;
      P00232_n707TBM24_MIN_VALUE = new boolean[] {false} ;
      P00232_A706TBM24_REQUIRED_INPUT_FLG = new String[] {""} ;
      P00232_n706TBM24_REQUIRED_INPUT_FLG = new boolean[] {false} ;
      P00232_A641TBM24_CHK_FALSE_INNER_VALUE = new String[] {""} ;
      P00232_n641TBM24_CHK_FALSE_INNER_VALUE = new boolean[] {false} ;
      P00232_A640TBM24_FIXED_VALUE = new String[] {""} ;
      P00232_n640TBM24_FIXED_VALUE = new boolean[] {false} ;
      P00232_A639TBM24_TEXT = new String[] {""} ;
      P00232_n639TBM24_TEXT = new boolean[] {false} ;
      P00232_A638TBM24_DECIMAL_DIGITS = new byte[1] ;
      P00232_n638TBM24_DECIMAL_DIGITS = new boolean[] {false} ;
      P00232_A637TBM24_TEXT_MAXROWS = new byte[1] ;
      P00232_n637TBM24_TEXT_MAXROWS = new boolean[] {false} ;
      P00232_A636TBM24_TEXT_MAXLENGTH = new short[1] ;
      P00232_n636TBM24_TEXT_MAXLENGTH = new boolean[] {false} ;
      P00232_A705TBM24_CRF_ITEM_NM = new String[] {""} ;
      P00232_n705TBM24_CRF_ITEM_NM = new boolean[] {false} ;
      P00232_A704TBM24_DOM_ITM_GRP_ROWNO = new short[1] ;
      P00232_n704TBM24_DOM_ITM_GRP_ROWNO = new boolean[] {false} ;
      P00232_A703TBM24_DOM_ITM_GRP_ATTR_SEQ = new short[1] ;
      P00232_n703TBM24_DOM_ITM_GRP_ATTR_SEQ = new boolean[] {false} ;
      P00232_A702TBM24_DOM_ITM_GRP_OID = new String[] {""} ;
      P00232_n702TBM24_DOM_ITM_GRP_OID = new boolean[] {false} ;
      A635TBM24_IDENTIFICATION_CD = "" ;
      A550TBM24_UPD_PROG_NM = "" ;
      A549TBM24_UPD_USER_ID = "" ;
      A548TBM24_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A547TBM24_CRT_PROG_NM = "" ;
      A546TBM24_CRT_USER_ID = "" ;
      A545TBM24_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A708TBM24_MAX_VALUE = "" ;
      A707TBM24_MIN_VALUE = "" ;
      A706TBM24_REQUIRED_INPUT_FLG = "" ;
      A641TBM24_CHK_FALSE_INNER_VALUE = "" ;
      A640TBM24_FIXED_VALUE = "" ;
      A639TBM24_TEXT = "" ;
      A705TBM24_CRF_ITEM_NM = "" ;
      A702TBM24_DOM_ITM_GRP_OID = "" ;
      AV15W_STR = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      GXt_char3 = "" ;
      GXv_char4 = new String [1] ;
      GXt_char5 = "" ;
      GXv_char6 = new String [1] ;
      GXt_char7 = "" ;
      GXv_char8 = new String [1] ;
      GXt_char9 = "" ;
      GXv_char10 = new String [1] ;
      GXt_char11 = "" ;
      GXv_char12 = new String [1] ;
      GXt_char13 = "" ;
      GXv_char14 = new String [1] ;
      GXt_char15 = "" ;
      GXv_char16 = new String [1] ;
      GXt_char17 = "" ;
      GXv_char18 = new String [1] ;
      GXt_char19 = "" ;
      GXv_char20 = new String [1] ;
      GXt_char21 = "" ;
      GXv_char22 = new String [1] ;
      GXt_char23 = "" ;
      GXv_char24 = new String [1] ;
      GXt_char25 = "" ;
      GXv_char26 = new String [1] ;
      GXt_char27 = "" ;
      GXv_char28 = new String [1] ;
      GXt_char29 = "" ;
      GXv_char30 = new String [1] ;
      GXt_char31 = "" ;
      GXv_char32 = new String [1] ;
      GXt_char33 = "" ;
      GXv_char34 = new String [1] ;
      GXt_char35 = "" ;
      GXv_char36 = new String [1] ;
      P00233_A24TBM25_LIST_CD = new String[] {""} ;
      P00233_A553TBM25_DEL_FLG = new String[] {""} ;
      P00233_n553TBM25_DEL_FLG = new boolean[] {false} ;
      P00233_A23TBM25_STUDY_ID = new long[1] ;
      P00233_A552TBM25_LIST_NM = new String[] {""} ;
      P00233_n552TBM25_LIST_NM = new boolean[] {false} ;
      A24TBM25_LIST_CD = "" ;
      A553TBM25_DEL_FLG = "" ;
      A552TBM25_LIST_NM = "" ;
      GXt_char37 = "" ;
      AV18W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV19W_MSG = "" ;
      AV24Pgmname = "" ;
      GXv_SdtB808_SD01_EXTRA_INFO39 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int40 = new short [1] ;
      GXv_char38 = new String [1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b599_pc08_map_item_res__default(),
         new Object[] {
             new Object[] {
            P00232_A635TBM24_IDENTIFICATION_CD, P00232_n635TBM24_IDENTIFICATION_CD, P00232_A544TBM24_DEL_FLG, P00232_n544TBM24_DEL_FLG, P00232_A67TBM24_CRF_ITEM_DIV, P00232_A66TBM24_DOM_VAR_NM, P00232_A65TBM24_DOM_CD, P00232_A64TBM24_STUDY_ID, P00232_A551TBM24_UPD_CNT, P00232_n551TBM24_UPD_CNT,
            P00232_A550TBM24_UPD_PROG_NM, P00232_n550TBM24_UPD_PROG_NM, P00232_A549TBM24_UPD_USER_ID, P00232_n549TBM24_UPD_USER_ID, P00232_A548TBM24_UPD_DATETIME, P00232_n548TBM24_UPD_DATETIME, P00232_A547TBM24_CRT_PROG_NM, P00232_n547TBM24_CRT_PROG_NM, P00232_A546TBM24_CRT_USER_ID, P00232_n546TBM24_CRT_USER_ID,
            P00232_A545TBM24_CRT_DATETIME, P00232_n545TBM24_CRT_DATETIME, P00232_A543TBM24_ORDER, P00232_n543TBM24_ORDER, P00232_A708TBM24_MAX_VALUE, P00232_n708TBM24_MAX_VALUE, P00232_A707TBM24_MIN_VALUE, P00232_n707TBM24_MIN_VALUE, P00232_A706TBM24_REQUIRED_INPUT_FLG, P00232_n706TBM24_REQUIRED_INPUT_FLG,
            P00232_A641TBM24_CHK_FALSE_INNER_VALUE, P00232_n641TBM24_CHK_FALSE_INNER_VALUE, P00232_A640TBM24_FIXED_VALUE, P00232_n640TBM24_FIXED_VALUE, P00232_A639TBM24_TEXT, P00232_n639TBM24_TEXT, P00232_A638TBM24_DECIMAL_DIGITS, P00232_n638TBM24_DECIMAL_DIGITS, P00232_A637TBM24_TEXT_MAXROWS, P00232_n637TBM24_TEXT_MAXROWS,
            P00232_A636TBM24_TEXT_MAXLENGTH, P00232_n636TBM24_TEXT_MAXLENGTH, P00232_A705TBM24_CRF_ITEM_NM, P00232_n705TBM24_CRF_ITEM_NM, P00232_A704TBM24_DOM_ITM_GRP_ROWNO, P00232_n704TBM24_DOM_ITM_GRP_ROWNO, P00232_A703TBM24_DOM_ITM_GRP_ATTR_SEQ, P00232_n703TBM24_DOM_ITM_GRP_ATTR_SEQ, P00232_A702TBM24_DOM_ITM_GRP_OID, P00232_n702TBM24_DOM_ITM_GRP_OID
            }
            , new Object[] {
            P00233_A24TBM25_LIST_CD, P00233_A553TBM25_DEL_FLG, P00233_n553TBM25_DEL_FLG, P00233_A23TBM25_STUDY_ID, P00233_A552TBM25_LIST_NM, P00233_n552TBM25_LIST_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV24Pgmname = "B599_PC08_MAP_ITEM_RES" ;
      /* GeneXus formulas. */
      AV24Pgmname = "B599_PC08_MAP_ITEM_RES" ;
      Gx_err = (short)(0) ;
   }

   private byte AV22GXLvl31 ;
   private byte A638TBM24_DECIMAL_DIGITS ;
   private byte A637TBM24_TEXT_MAXROWS ;
   private short AV12W_RTN_CD ;
   private short Gx_err ;
   private short A636TBM24_TEXT_MAXLENGTH ;
   private short A704TBM24_DOM_ITM_GRP_ROWNO ;
   private short A703TBM24_DOM_ITM_GRP_ATTR_SEQ ;
   private short GXv_int40[] ;
   private int A543TBM24_ORDER ;
   private int GXActiveErrHndl ;
   private long AV11P_STUDY_ID ;
   private long A64TBM24_STUDY_ID ;
   private long A551TBM24_UPD_CNT ;
   private long A23TBM25_STUDY_ID ;
   private String scmdbuf ;
   private String Gx_ope ;
   private String Gx_etb ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String GXt_char5 ;
   private String GXv_char6[] ;
   private String GXt_char7 ;
   private String GXv_char8[] ;
   private String GXt_char9 ;
   private String GXv_char10[] ;
   private String GXt_char11 ;
   private String GXv_char12[] ;
   private String GXt_char13 ;
   private String GXv_char14[] ;
   private String GXt_char15 ;
   private String GXv_char16[] ;
   private String GXt_char17 ;
   private String GXv_char18[] ;
   private String GXt_char19 ;
   private String GXv_char20[] ;
   private String GXt_char21 ;
   private String GXv_char22[] ;
   private String GXt_char23 ;
   private String GXv_char24[] ;
   private String GXt_char25 ;
   private String GXv_char26[] ;
   private String GXt_char27 ;
   private String GXv_char28[] ;
   private String GXt_char29 ;
   private String GXv_char30[] ;
   private String GXt_char31 ;
   private String GXv_char32[] ;
   private String GXt_char33 ;
   private String GXv_char34[] ;
   private String GXt_char35 ;
   private String GXv_char36[] ;
   private String GXt_char37 ;
   private String AV24Pgmname ;
   private String GXv_char38[] ;
   private String Gx_emsg ;
   private java.util.Date A548TBM24_UPD_DATETIME ;
   private java.util.Date A545TBM24_CRT_DATETIME ;
   private boolean returnInSub ;
   private boolean n635TBM24_IDENTIFICATION_CD ;
   private boolean n544TBM24_DEL_FLG ;
   private boolean n551TBM24_UPD_CNT ;
   private boolean n550TBM24_UPD_PROG_NM ;
   private boolean n549TBM24_UPD_USER_ID ;
   private boolean n548TBM24_UPD_DATETIME ;
   private boolean n547TBM24_CRT_PROG_NM ;
   private boolean n546TBM24_CRT_USER_ID ;
   private boolean n545TBM24_CRT_DATETIME ;
   private boolean n543TBM24_ORDER ;
   private boolean n708TBM24_MAX_VALUE ;
   private boolean n707TBM24_MIN_VALUE ;
   private boolean n706TBM24_REQUIRED_INPUT_FLG ;
   private boolean n641TBM24_CHK_FALSE_INNER_VALUE ;
   private boolean n640TBM24_FIXED_VALUE ;
   private boolean n639TBM24_TEXT ;
   private boolean n638TBM24_DECIMAL_DIGITS ;
   private boolean n637TBM24_TEXT_MAXROWS ;
   private boolean n636TBM24_TEXT_MAXLENGTH ;
   private boolean n705TBM24_CRF_ITEM_NM ;
   private boolean n704TBM24_DOM_ITM_GRP_ROWNO ;
   private boolean n703TBM24_DOM_ITM_GRP_ATTR_SEQ ;
   private boolean n702TBM24_DOM_ITM_GRP_OID ;
   private boolean n553TBM25_DEL_FLG ;
   private boolean n552TBM25_LIST_NM ;
   private String AV9P_DOM_CD ;
   private String AV10P_DOM_VAR_NM ;
   private String AV8P_CRF_ITEM_DIV ;
   private String AV14W_RTN_MSG ;
   private String AV16C_APP_ID ;
   private String A65TBM24_DOM_CD ;
   private String A66TBM24_DOM_VAR_NM ;
   private String A67TBM24_CRF_ITEM_DIV ;
   private String A544TBM24_DEL_FLG ;
   private String A635TBM24_IDENTIFICATION_CD ;
   private String A550TBM24_UPD_PROG_NM ;
   private String A549TBM24_UPD_USER_ID ;
   private String A547TBM24_CRT_PROG_NM ;
   private String A546TBM24_CRT_USER_ID ;
   private String A708TBM24_MAX_VALUE ;
   private String A707TBM24_MIN_VALUE ;
   private String A706TBM24_REQUIRED_INPUT_FLG ;
   private String A641TBM24_CHK_FALSE_INNER_VALUE ;
   private String A640TBM24_FIXED_VALUE ;
   private String A639TBM24_TEXT ;
   private String A705TBM24_CRF_ITEM_NM ;
   private String A702TBM24_DOM_ITM_GRP_OID ;
   private String AV15W_STR ;
   private String A24TBM25_LIST_CD ;
   private String A553TBM25_DEL_FLG ;
   private String A552TBM25_LIST_NM ;
   private String AV19W_MSG ;
   private GxObjectCollection[] aP4 ;
   private short[] aP5 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P00232_A635TBM24_IDENTIFICATION_CD ;
   private boolean[] P00232_n635TBM24_IDENTIFICATION_CD ;
   private String[] P00232_A544TBM24_DEL_FLG ;
   private boolean[] P00232_n544TBM24_DEL_FLG ;
   private String[] P00232_A67TBM24_CRF_ITEM_DIV ;
   private String[] P00232_A66TBM24_DOM_VAR_NM ;
   private String[] P00232_A65TBM24_DOM_CD ;
   private long[] P00232_A64TBM24_STUDY_ID ;
   private long[] P00232_A551TBM24_UPD_CNT ;
   private boolean[] P00232_n551TBM24_UPD_CNT ;
   private String[] P00232_A550TBM24_UPD_PROG_NM ;
   private boolean[] P00232_n550TBM24_UPD_PROG_NM ;
   private String[] P00232_A549TBM24_UPD_USER_ID ;
   private boolean[] P00232_n549TBM24_UPD_USER_ID ;
   private java.util.Date[] P00232_A548TBM24_UPD_DATETIME ;
   private boolean[] P00232_n548TBM24_UPD_DATETIME ;
   private String[] P00232_A547TBM24_CRT_PROG_NM ;
   private boolean[] P00232_n547TBM24_CRT_PROG_NM ;
   private String[] P00232_A546TBM24_CRT_USER_ID ;
   private boolean[] P00232_n546TBM24_CRT_USER_ID ;
   private java.util.Date[] P00232_A545TBM24_CRT_DATETIME ;
   private boolean[] P00232_n545TBM24_CRT_DATETIME ;
   private int[] P00232_A543TBM24_ORDER ;
   private boolean[] P00232_n543TBM24_ORDER ;
   private String[] P00232_A708TBM24_MAX_VALUE ;
   private boolean[] P00232_n708TBM24_MAX_VALUE ;
   private String[] P00232_A707TBM24_MIN_VALUE ;
   private boolean[] P00232_n707TBM24_MIN_VALUE ;
   private String[] P00232_A706TBM24_REQUIRED_INPUT_FLG ;
   private boolean[] P00232_n706TBM24_REQUIRED_INPUT_FLG ;
   private String[] P00232_A641TBM24_CHK_FALSE_INNER_VALUE ;
   private boolean[] P00232_n641TBM24_CHK_FALSE_INNER_VALUE ;
   private String[] P00232_A640TBM24_FIXED_VALUE ;
   private boolean[] P00232_n640TBM24_FIXED_VALUE ;
   private String[] P00232_A639TBM24_TEXT ;
   private boolean[] P00232_n639TBM24_TEXT ;
   private byte[] P00232_A638TBM24_DECIMAL_DIGITS ;
   private boolean[] P00232_n638TBM24_DECIMAL_DIGITS ;
   private byte[] P00232_A637TBM24_TEXT_MAXROWS ;
   private boolean[] P00232_n637TBM24_TEXT_MAXROWS ;
   private short[] P00232_A636TBM24_TEXT_MAXLENGTH ;
   private boolean[] P00232_n636TBM24_TEXT_MAXLENGTH ;
   private String[] P00232_A705TBM24_CRF_ITEM_NM ;
   private boolean[] P00232_n705TBM24_CRF_ITEM_NM ;
   private short[] P00232_A704TBM24_DOM_ITM_GRP_ROWNO ;
   private boolean[] P00232_n704TBM24_DOM_ITM_GRP_ROWNO ;
   private short[] P00232_A703TBM24_DOM_ITM_GRP_ATTR_SEQ ;
   private boolean[] P00232_n703TBM24_DOM_ITM_GRP_ATTR_SEQ ;
   private String[] P00232_A702TBM24_DOM_ITM_GRP_OID ;
   private boolean[] P00232_n702TBM24_DOM_ITM_GRP_OID ;
   private String[] P00233_A24TBM25_LIST_CD ;
   private String[] P00233_A553TBM25_DEL_FLG ;
   private boolean[] P00233_n553TBM25_DEL_FLG ;
   private long[] P00233_A23TBM25_STUDY_ID ;
   private String[] P00233_A552TBM25_LIST_NM ;
   private boolean[] P00233_n552TBM25_LIST_NM ;
   private GxObjectCollection AV13W_RTN_CSV ;
   private SdtB808_SD01_EXTRA_INFO AV17W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO39[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV18W_PARMS_ITEM ;
}

final  class b599_pc08_map_item_res__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P00232( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV9P_DOM_CD ,
                                          String AV10P_DOM_VAR_NM ,
                                          String AV8P_CRF_ITEM_DIV ,
                                          String A65TBM24_DOM_CD ,
                                          String A66TBM24_DOM_VAR_NM ,
                                          String A67TBM24_CRF_ITEM_DIV ,
                                          String A544TBM24_DEL_FLG ,
                                          long AV11P_STUDY_ID ,
                                          long A64TBM24_STUDY_ID )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int41 ;
      GXv_int41 = new byte [4] ;
      Object[] GXv_Object42 ;
      GXv_Object42 = new Object [2] ;
      Gx_ope = "Declare" ;
      Gx_etb = "TBM24_MAP_ITEM" ;
      scmdbuf = "SELECT `TBM24_IDENTIFICATION_CD`, `TBM24_DEL_FLG`, `TBM24_CRF_ITEM_DIV`, `TBM24_DOM_VAR_NM`," ;
      scmdbuf = scmdbuf + " `TBM24_DOM_CD`, `TBM24_STUDY_ID`, `TBM24_UPD_CNT`, `TBM24_UPD_PROG_NM`, `TBM24_UPD_USER_ID`," ;
      scmdbuf = scmdbuf + " `TBM24_UPD_DATETIME`, `TBM24_CRT_PROG_NM`, `TBM24_CRT_USER_ID`, `TBM24_CRT_DATETIME`," ;
      scmdbuf = scmdbuf + " `TBM24_ORDER`, `TBM24_MAX_VALUE`, `TBM24_MIN_VALUE`, `TBM24_REQUIRED_INPUT_FLG`," ;
      scmdbuf = scmdbuf + " `TBM24_CHK_FALSE_INNER_VALUE`, `TBM24_FIXED_VALUE`, `TBM24_TEXT`, `TBM24_DECIMAL_DIGITS`," ;
      scmdbuf = scmdbuf + " `TBM24_TEXT_MAXROWS`, `TBM24_TEXT_MAXLENGTH`, `TBM24_CRF_ITEM_NM`, `TBM24_DOM_ITM_GRP_ROWNO`," ;
      scmdbuf = scmdbuf + " `TBM24_DOM_ITM_GRP_ATTR_SEQ`, `TBM24_DOM_ITM_GRP_OID` FROM `TBM24_MAP_ITEM`" ;
      scmdbuf = scmdbuf + " WHERE (`TBM24_STUDY_ID` = ?)" ;
      scmdbuf = scmdbuf + " and (`TBM24_DEL_FLG` = '0')" ;
      if ( ! (GXutil.strcmp("", AV9P_DOM_CD)==0) )
      {
         sWhereString = sWhereString + " and (`TBM24_DOM_CD` = ?)" ;
      }
      else
      {
         GXv_int41[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV10P_DOM_VAR_NM)==0) )
      {
         sWhereString = sWhereString + " and (`TBM24_DOM_VAR_NM` = ?)" ;
      }
      else
      {
         GXv_int41[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV8P_CRF_ITEM_DIV)==0) )
      {
         sWhereString = sWhereString + " and (`TBM24_CRF_ITEM_DIV` = ?)" ;
      }
      else
      {
         GXv_int41[3] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TBM24_STUDY_ID`, `TBM24_DOM_CD`, `TBM24_DOM_VAR_NM`, `TBM24_CRF_ITEM_DIV`" ;
      GXv_Object42[0] = scmdbuf ;
      GXv_Object42[1] = GXv_int41 ;
      return GXv_Object42 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.internet.HttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_P00232(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).longValue() , ((Number) dynConstraints[8]).longValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00232", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P00233", "SELECT `TBM25_LIST_CD`, `TBM25_DEL_FLG`, `TBM25_STUDY_ID`, `TBM25_LIST_NM` FROM `TBM25_SEL_LIST` WHERE (`TBM25_STUDY_ID` = ? and `TBM25_LIST_CD` = ?) AND (`TBM25_DEL_FLG` = '0') ORDER BY `TBM25_STUDY_ID`, `TBM25_LIST_CD`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((long[]) buf[7])[0] = rslt.getLong(6) ;
               ((long[]) buf[8])[0] = rslt.getLong(7) ;
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
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDateTime(13) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((int[]) buf[22])[0] = rslt.getInt(14) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((byte[]) buf[36])[0] = rslt.getByte(21) ;
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((byte[]) buf[38])[0] = rslt.getByte(22) ;
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((short[]) buf[40])[0] = rslt.getShort(23) ;
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((short[]) buf[44])[0] = rslt.getShort(25) ;
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((short[]) buf[46])[0] = rslt.getShort(26) ;
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getVarchar(27) ;
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[4]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[5], 16);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[6], 50);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[7], 20);
               }
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[2], 50);
               }
               return;
      }
   }

}

