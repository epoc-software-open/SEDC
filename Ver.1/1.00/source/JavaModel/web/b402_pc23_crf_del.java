/*
               File: B402_PC23_CRF_DEL
        Description: CRF関連データ全物理削除
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:54:46.58
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b402_pc23_crf_del extends GXProcedure
{
   public b402_pc23_crf_del( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b402_pc23_crf_del.class ), "" );
   }

   public b402_pc23_crf_del( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( SdtTBM31_CRF aP0 ,
                             short[] aP1 )
   {
      b402_pc23_crf_del.this.AV18P_BC_CRF = aP0;
      b402_pc23_crf_del.this.aP2 = new String[] {""};
      initialize();
      privateExecute();
      return aP2[0];
   }

   public void execute( SdtTBM31_CRF aP0 ,
                        short[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( SdtTBM31_CRF aP0 ,
                             short[] aP1 ,
                             String[] aP2 )
   {
      b402_pc23_crf_del.this.AV18P_BC_CRF = aP0;
      b402_pc23_crf_del.this.aP1 = aP1;
      b402_pc23_crf_del.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8C_APP_ID = "B402" ;
      /* Execute user subroutine: S11280 */
      S11280 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV12W_RTN_CD = (short)(0) ;
      AV13W_RTN_MSG = "" ;
      /* Optimized DELETE. */
      Gx_ope = "Delete" ;
      Gx_etb = "TBT13_CRF_RES_HIS" ;
      /* Using cursor P00592 */
      pr_default.execute(0, new Object[] {new Long(AV18P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_study_id()), new Short(AV18P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crf_id())});
      /* End optimized DELETE. */
      /* Optimized DELETE. */
      Gx_ope = "Delete" ;
      Gx_etb = "TBT12_CRF_RESULT" ;
      /* Using cursor P00593 */
      pr_default.execute(1, new Object[] {new Long(AV18P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_study_id()), new Short(AV18P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crf_id())});
      /* End optimized DELETE. */
      /* Optimized DELETE. */
      Gx_ope = "Delete" ;
      Gx_etb = "TBT11_CRF_HISTORY" ;
      /* Using cursor P00594 */
      pr_default.execute(2, new Object[] {new Long(AV18P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_study_id()), new Short(AV18P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crf_id())});
      /* End optimized DELETE. */
      /* Optimized DELETE. */
      Gx_ope = "Delete" ;
      Gx_etb = "TBT15_CRF_MEMO_LOC" ;
      /* Using cursor P00595 */
      pr_default.execute(3, new Object[] {new Long(AV18P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_study_id()), new Short(AV18P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crf_id())});
      /* End optimized DELETE. */
      /* Optimized DELETE. */
      Gx_ope = "Delete" ;
      Gx_etb = "TBT14_CRF_MEMO" ;
      /* Using cursor P00596 */
      pr_default.execute(4, new Object[] {new Long(AV18P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_study_id()), new Short(AV18P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crf_id())});
      /* End optimized DELETE. */
      /* Optimized DELETE. */
      Gx_ope = "Delete" ;
      Gx_etb = "TBT02_CRF" ;
      /* Using cursor P00597 */
      pr_default.execute(5, new Object[] {new Long(AV18P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_study_id()), new Short(AV18P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crf_id())});
      /* End optimized DELETE. */
      Gx_ope = "Fetch" ;
      Gx_etb = "TBM35_CRF_ITEM_AUTH" ;
      /* Using cursor P00598 */
      pr_default.execute(6, new Object[] {new Long(AV18P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_study_id()), new Short(AV18P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crf_id())});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A472TBM35_CRF_ID = P00598_A472TBM35_CRF_ID[0] ;
         A471TBM35_STUDY_ID = P00598_A471TBM35_STUDY_ID[0] ;
         A473TBM35_CRF_ITEM_CD = P00598_A473TBM35_CRF_ITEM_CD[0] ;
         A474TBM35_STUDY_AUTH_CD = P00598_A474TBM35_STUDY_AUTH_CD[0] ;
         A475TBM35_DISPLAY_FLG = P00598_A475TBM35_DISPLAY_FLG[0] ;
         n475TBM35_DISPLAY_FLG = P00598_n475TBM35_DISPLAY_FLG[0] ;
         A476TBM35_DEL_FLG = P00598_A476TBM35_DEL_FLG[0] ;
         n476TBM35_DEL_FLG = P00598_n476TBM35_DEL_FLG[0] ;
         A483TBM35_UPD_CNT = P00598_A483TBM35_UPD_CNT[0] ;
         n483TBM35_UPD_CNT = P00598_n483TBM35_UPD_CNT[0] ;
         A482TBM35_UPD_PROG_NM = P00598_A482TBM35_UPD_PROG_NM[0] ;
         n482TBM35_UPD_PROG_NM = P00598_n482TBM35_UPD_PROG_NM[0] ;
         A481TBM35_UPD_USER_ID = P00598_A481TBM35_UPD_USER_ID[0] ;
         n481TBM35_UPD_USER_ID = P00598_n481TBM35_UPD_USER_ID[0] ;
         A480TBM35_UPD_DATETIME = P00598_A480TBM35_UPD_DATETIME[0] ;
         n480TBM35_UPD_DATETIME = P00598_n480TBM35_UPD_DATETIME[0] ;
         A479TBM35_CRT_PROG_NM = P00598_A479TBM35_CRT_PROG_NM[0] ;
         n479TBM35_CRT_PROG_NM = P00598_n479TBM35_CRT_PROG_NM[0] ;
         A478TBM35_CRT_USER_ID = P00598_A478TBM35_CRT_USER_ID[0] ;
         n478TBM35_CRT_USER_ID = P00598_n478TBM35_CRT_USER_ID[0] ;
         A477TBM35_CRT_DATETIME = P00598_A477TBM35_CRT_DATETIME[0] ;
         n477TBM35_CRT_DATETIME = P00598_n477TBM35_CRT_DATETIME[0] ;
         AV11W_ITEMS.clear();
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A471TBM35_STUDY_ID, 10, 0)), 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A472TBM35_CRF_ID, 10, 0)), 0);
         AV11W_ITEMS.add(A473TBM35_CRF_ITEM_CD, 0);
         AV11W_ITEMS.add(A474TBM35_STUDY_AUTH_CD, 0);
         AV11W_ITEMS.add(A475TBM35_DISPLAY_FLG, 0);
         AV11W_ITEMS.add(A476TBM35_DEL_FLG, 0);
         new b808_pc02_data_log(remoteHandle, context).execute( AV28Pgmname, "DLT", "TBM35_CRF_ITEM_AUTH", AV11W_ITEMS, A477TBM35_CRT_DATETIME, A478TBM35_CRT_USER_ID, A479TBM35_CRT_PROG_NM, A480TBM35_UPD_DATETIME, A481TBM35_UPD_USER_ID, A482TBM35_UPD_PROG_NM, A483TBM35_UPD_CNT) ;
         Gx_ope = "Delete" ;
         Gx_etb = "TBM35_CRF_ITEM_AUTH" ;
         /* Using cursor P00599 */
         pr_default.execute(7, new Object[] {new Long(A471TBM35_STUDY_ID), new Short(A472TBM35_CRF_ID), A473TBM35_CRF_ITEM_CD, A474TBM35_STUDY_AUTH_CD});
         pr_default.readNext(6);
      }
      pr_default.close(6);
      Gx_ope = "Fetch" ;
      Gx_etb = "TBM41_CRF_NCM_MAP" ;
      /* Using cursor P005910 */
      pr_default.execute(8, new Object[] {new Long(AV18P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_study_id()), new Short(AV18P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crf_id())});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A260TBM41_CRF_ID = P005910_A260TBM41_CRF_ID[0] ;
         A259TBM41_STUDY_ID = P005910_A259TBM41_STUDY_ID[0] ;
         A378TBM41_CRF_ITEM_GRP_DIV = P005910_A378TBM41_CRF_ITEM_GRP_DIV[0] ;
         A261TBM41_CRF_ITEM_GRP_CD = P005910_A261TBM41_CRF_ITEM_GRP_CD[0] ;
         A262TBM41_NCM_METADATA_ID = P005910_A262TBM41_NCM_METADATA_ID[0] ;
         n262TBM41_NCM_METADATA_ID = P005910_n262TBM41_NCM_METADATA_ID[0] ;
         A263TBM41_DEL_FLG = P005910_A263TBM41_DEL_FLG[0] ;
         n263TBM41_DEL_FLG = P005910_n263TBM41_DEL_FLG[0] ;
         A270TBM41_UPD_CNT = P005910_A270TBM41_UPD_CNT[0] ;
         n270TBM41_UPD_CNT = P005910_n270TBM41_UPD_CNT[0] ;
         A269TBM41_UPD_PROG_NM = P005910_A269TBM41_UPD_PROG_NM[0] ;
         n269TBM41_UPD_PROG_NM = P005910_n269TBM41_UPD_PROG_NM[0] ;
         A268TBM41_UPD_USER_ID = P005910_A268TBM41_UPD_USER_ID[0] ;
         n268TBM41_UPD_USER_ID = P005910_n268TBM41_UPD_USER_ID[0] ;
         A267TBM41_UPD_DATETIME = P005910_A267TBM41_UPD_DATETIME[0] ;
         n267TBM41_UPD_DATETIME = P005910_n267TBM41_UPD_DATETIME[0] ;
         A266TBM41_CRT_PROG_NM = P005910_A266TBM41_CRT_PROG_NM[0] ;
         n266TBM41_CRT_PROG_NM = P005910_n266TBM41_CRT_PROG_NM[0] ;
         A265TBM41_CRT_USER_ID = P005910_A265TBM41_CRT_USER_ID[0] ;
         n265TBM41_CRT_USER_ID = P005910_n265TBM41_CRT_USER_ID[0] ;
         A264TBM41_CRT_DATETIME = P005910_A264TBM41_CRT_DATETIME[0] ;
         n264TBM41_CRT_DATETIME = P005910_n264TBM41_CRT_DATETIME[0] ;
         AV11W_ITEMS.clear();
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A259TBM41_STUDY_ID, 10, 0)), 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A260TBM41_CRF_ID, 10, 0)), 0);
         AV11W_ITEMS.add(A378TBM41_CRF_ITEM_GRP_DIV, 0);
         AV11W_ITEMS.add(A261TBM41_CRF_ITEM_GRP_CD, 0);
         AV11W_ITEMS.add(A262TBM41_NCM_METADATA_ID, 0);
         AV11W_ITEMS.add(A263TBM41_DEL_FLG, 0);
         new b808_pc02_data_log(remoteHandle, context).execute( AV28Pgmname, "DLT", "TBM41_CRF_NCM_MAP", AV11W_ITEMS, A264TBM41_CRT_DATETIME, A265TBM41_CRT_USER_ID, A266TBM41_CRT_PROG_NM, A267TBM41_UPD_DATETIME, A268TBM41_UPD_USER_ID, A269TBM41_UPD_PROG_NM, A270TBM41_UPD_CNT) ;
         Gx_ope = "Delete" ;
         Gx_etb = "TBM41_CRF_NCM_MAP" ;
         /* Using cursor P005911 */
         pr_default.execute(9, new Object[] {new Long(A259TBM41_STUDY_ID), new Short(A260TBM41_CRF_ID), A378TBM41_CRF_ITEM_GRP_DIV, A261TBM41_CRF_ITEM_GRP_CD});
         pr_default.readNext(8);
      }
      pr_default.close(8);
      Gx_ope = "Fetch" ;
      Gx_etb = "TBM37_CRF_DOM_MAP" ;
      /* Using cursor P005912 */
      pr_default.execute(10, new Object[] {new Long(AV18P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_study_id()), new Short(AV18P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crf_id())});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A272TBM37_CRF_ID = P005912_A272TBM37_CRF_ID[0] ;
         A271TBM37_STUDY_ID = P005912_A271TBM37_STUDY_ID[0] ;
         A372TBM37_CRF_ITEM_GRP_DIV = P005912_A372TBM37_CRF_ITEM_GRP_DIV[0] ;
         A273TBM37_CRF_ITEM_GRP_CD = P005912_A273TBM37_CRF_ITEM_GRP_CD[0] ;
         A373TBM37_VISIT_NO = P005912_A373TBM37_VISIT_NO[0] ;
         n373TBM37_VISIT_NO = P005912_n373TBM37_VISIT_NO[0] ;
         A374TBM37_DOM_CD = P005912_A374TBM37_DOM_CD[0] ;
         n374TBM37_DOM_CD = P005912_n374TBM37_DOM_CD[0] ;
         A375TBM37_DOM_VAR_NM = P005912_A375TBM37_DOM_VAR_NM[0] ;
         n375TBM37_DOM_VAR_NM = P005912_n375TBM37_DOM_VAR_NM[0] ;
         A376TBM37_DOM_ITM_GRP_OID = P005912_A376TBM37_DOM_ITM_GRP_OID[0] ;
         n376TBM37_DOM_ITM_GRP_OID = P005912_n376TBM37_DOM_ITM_GRP_OID[0] ;
         A377TBM37_DOM_ITM_GRP_ATTR_SEQ = P005912_A377TBM37_DOM_ITM_GRP_ATTR_SEQ[0] ;
         n377TBM37_DOM_ITM_GRP_ATTR_SEQ = P005912_n377TBM37_DOM_ITM_GRP_ATTR_SEQ[0] ;
         A612TBM37_DOM_ITM_GRP_ROWNO = P005912_A612TBM37_DOM_ITM_GRP_ROWNO[0] ;
         n612TBM37_DOM_ITM_GRP_ROWNO = P005912_n612TBM37_DOM_ITM_GRP_ROWNO[0] ;
         A274TBM37_DEL_FLG = P005912_A274TBM37_DEL_FLG[0] ;
         n274TBM37_DEL_FLG = P005912_n274TBM37_DEL_FLG[0] ;
         A281TBM37_UPD_CNT = P005912_A281TBM37_UPD_CNT[0] ;
         n281TBM37_UPD_CNT = P005912_n281TBM37_UPD_CNT[0] ;
         A280TBM37_UPD_PROG_NM = P005912_A280TBM37_UPD_PROG_NM[0] ;
         n280TBM37_UPD_PROG_NM = P005912_n280TBM37_UPD_PROG_NM[0] ;
         A279TBM37_UPD_USER_ID = P005912_A279TBM37_UPD_USER_ID[0] ;
         n279TBM37_UPD_USER_ID = P005912_n279TBM37_UPD_USER_ID[0] ;
         A278TBM37_UPD_DATETIME = P005912_A278TBM37_UPD_DATETIME[0] ;
         n278TBM37_UPD_DATETIME = P005912_n278TBM37_UPD_DATETIME[0] ;
         A277TBM37_CRT_PROG_NM = P005912_A277TBM37_CRT_PROG_NM[0] ;
         n277TBM37_CRT_PROG_NM = P005912_n277TBM37_CRT_PROG_NM[0] ;
         A276TBM37_CRT_USER_ID = P005912_A276TBM37_CRT_USER_ID[0] ;
         n276TBM37_CRT_USER_ID = P005912_n276TBM37_CRT_USER_ID[0] ;
         A275TBM37_CRT_DATETIME = P005912_A275TBM37_CRT_DATETIME[0] ;
         n275TBM37_CRT_DATETIME = P005912_n275TBM37_CRT_DATETIME[0] ;
         AV11W_ITEMS.clear();
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A271TBM37_STUDY_ID, 10, 0)), 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A272TBM37_CRF_ID, 10, 0)), 0);
         AV11W_ITEMS.add(A372TBM37_CRF_ITEM_GRP_DIV, 0);
         AV11W_ITEMS.add(A273TBM37_CRF_ITEM_GRP_CD, 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A373TBM37_VISIT_NO, 10, 0)), 0);
         AV11W_ITEMS.add(A374TBM37_DOM_CD, 0);
         AV11W_ITEMS.add(A375TBM37_DOM_VAR_NM, 0);
         AV11W_ITEMS.add(A376TBM37_DOM_ITM_GRP_OID, 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A377TBM37_DOM_ITM_GRP_ATTR_SEQ, 10, 0)), 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A612TBM37_DOM_ITM_GRP_ROWNO, 10, 0)), 0);
         AV11W_ITEMS.add(A274TBM37_DEL_FLG, 0);
         new b808_pc02_data_log(remoteHandle, context).execute( AV28Pgmname, "DLT", "TBM37_CRF_DOM_MAP", AV11W_ITEMS, A275TBM37_CRT_DATETIME, A276TBM37_CRT_USER_ID, A277TBM37_CRT_PROG_NM, A278TBM37_UPD_DATETIME, A279TBM37_UPD_USER_ID, A280TBM37_UPD_PROG_NM, A281TBM37_UPD_CNT) ;
         Gx_ope = "Delete" ;
         Gx_etb = "TBM37_CRF_DOM_MAP" ;
         /* Using cursor P005913 */
         pr_default.execute(11, new Object[] {new Long(A271TBM37_STUDY_ID), new Short(A272TBM37_CRF_ID), A372TBM37_CRF_ITEM_GRP_DIV, A273TBM37_CRF_ITEM_GRP_CD});
         pr_default.readNext(10);
      }
      pr_default.close(10);
      Gx_ope = "Fetch" ;
      Gx_etb = "TBM36_CRF_SELECT" ;
      /* Using cursor P005914 */
      pr_default.execute(12, new Object[] {new Long(AV18P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_study_id()), new Short(AV18P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crf_id())});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A487TBM36_SELECT_CRF_ID = P005914_A487TBM36_SELECT_CRF_ID[0] ;
         A484TBM36_STUDY_ID = P005914_A484TBM36_STUDY_ID[0] ;
         A485TBM36_CRF_ID = P005914_A485TBM36_CRF_ID[0] ;
         A486TBM36_COND_NO = P005914_A486TBM36_COND_NO[0] ;
         A488TBM36_DEL_FLG = P005914_A488TBM36_DEL_FLG[0] ;
         n488TBM36_DEL_FLG = P005914_n488TBM36_DEL_FLG[0] ;
         A495TBM36_UPD_CNT = P005914_A495TBM36_UPD_CNT[0] ;
         n495TBM36_UPD_CNT = P005914_n495TBM36_UPD_CNT[0] ;
         A494TBM36_UPD_PROG_NM = P005914_A494TBM36_UPD_PROG_NM[0] ;
         n494TBM36_UPD_PROG_NM = P005914_n494TBM36_UPD_PROG_NM[0] ;
         A493TBM36_UPD_USER_ID = P005914_A493TBM36_UPD_USER_ID[0] ;
         n493TBM36_UPD_USER_ID = P005914_n493TBM36_UPD_USER_ID[0] ;
         A492TBM36_UPD_DATETIME = P005914_A492TBM36_UPD_DATETIME[0] ;
         n492TBM36_UPD_DATETIME = P005914_n492TBM36_UPD_DATETIME[0] ;
         A491TBM36_CRT_PROG_NM = P005914_A491TBM36_CRT_PROG_NM[0] ;
         n491TBM36_CRT_PROG_NM = P005914_n491TBM36_CRT_PROG_NM[0] ;
         A490TBM36_CRT_USER_ID = P005914_A490TBM36_CRT_USER_ID[0] ;
         n490TBM36_CRT_USER_ID = P005914_n490TBM36_CRT_USER_ID[0] ;
         A489TBM36_CRT_DATETIME = P005914_A489TBM36_CRT_DATETIME[0] ;
         n489TBM36_CRT_DATETIME = P005914_n489TBM36_CRT_DATETIME[0] ;
         AV11W_ITEMS.clear();
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A484TBM36_STUDY_ID, 10, 0)), 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A485TBM36_CRF_ID, 10, 0)), 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A486TBM36_COND_NO, 10, 0)), 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A487TBM36_SELECT_CRF_ID, 10, 0)), 0);
         AV11W_ITEMS.add(A488TBM36_DEL_FLG, 0);
         new b808_pc02_data_log(remoteHandle, context).execute( AV28Pgmname, "DLT", "TBM36_CRF_SELECT", AV11W_ITEMS, A489TBM36_CRT_DATETIME, A490TBM36_CRT_USER_ID, A491TBM36_CRT_PROG_NM, A492TBM36_UPD_DATETIME, A493TBM36_UPD_USER_ID, A494TBM36_UPD_PROG_NM, A495TBM36_UPD_CNT) ;
         Gx_ope = "Delete" ;
         Gx_etb = "TBM36_CRF_SELECT" ;
         /* Using cursor P005915 */
         pr_default.execute(13, new Object[] {new Long(A484TBM36_STUDY_ID), new Short(A485TBM36_CRF_ID), new Short(A486TBM36_COND_NO), new Short(A487TBM36_SELECT_CRF_ID)});
         pr_default.readNext(12);
      }
      pr_default.close(12);
      Gx_ope = "Fetch" ;
      Gx_etb = "TBM33_CRF_COND" ;
      /* Using cursor P005916 */
      pr_default.execute(14, new Object[] {new Long(AV18P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_study_id()), new Short(AV18P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crf_id())});
      while ( (pr_default.getStatus(14) != 101) )
      {
         A247TBM33_CRF_ID = P005916_A247TBM33_CRF_ID[0] ;
         A246TBM33_STUDY_ID = P005916_A246TBM33_STUDY_ID[0] ;
         A248TBM33_COND_NO = P005916_A248TBM33_COND_NO[0] ;
         A379TBM33_COND_NM = P005916_A379TBM33_COND_NM[0] ;
         n379TBM33_COND_NM = P005916_n379TBM33_COND_NM[0] ;
         A249TBM33_EXPRESSION = P005916_A249TBM33_EXPRESSION[0] ;
         n249TBM33_EXPRESSION = P005916_n249TBM33_EXPRESSION[0] ;
         A380TBM33_COND_DIV = P005916_A380TBM33_COND_DIV[0] ;
         n380TBM33_COND_DIV = P005916_n380TBM33_COND_DIV[0] ;
         A381TBM33_CRF_ITEM_CD = P005916_A381TBM33_CRF_ITEM_CD[0] ;
         n381TBM33_CRF_ITEM_CD = P005916_n381TBM33_CRF_ITEM_CD[0] ;
         A250TBM33_PRIOR_NO = P005916_A250TBM33_PRIOR_NO[0] ;
         n250TBM33_PRIOR_NO = P005916_n250TBM33_PRIOR_NO[0] ;
         A382TBM33_ERR_DIV = P005916_A382TBM33_ERR_DIV[0] ;
         n382TBM33_ERR_DIV = P005916_n382TBM33_ERR_DIV[0] ;
         A383TBM33_ERR_MSG = P005916_A383TBM33_ERR_MSG[0] ;
         n383TBM33_ERR_MSG = P005916_n383TBM33_ERR_MSG[0] ;
         A554TBM33_ENABLED_FLG = P005916_A554TBM33_ENABLED_FLG[0] ;
         n554TBM33_ENABLED_FLG = P005916_n554TBM33_ENABLED_FLG[0] ;
         A610TBM33_REQUIRED_INPUT_FLG = P005916_A610TBM33_REQUIRED_INPUT_FLG[0] ;
         n610TBM33_REQUIRED_INPUT_FLG = P005916_n610TBM33_REQUIRED_INPUT_FLG[0] ;
         A611TBM33_NUMERIC_RANGE_FLG = P005916_A611TBM33_NUMERIC_RANGE_FLG[0] ;
         n611TBM33_NUMERIC_RANGE_FLG = P005916_n611TBM33_NUMERIC_RANGE_FLG[0] ;
         A251TBM33_DEL_FLG = P005916_A251TBM33_DEL_FLG[0] ;
         n251TBM33_DEL_FLG = P005916_n251TBM33_DEL_FLG[0] ;
         A258TBM33_UPD_CNT = P005916_A258TBM33_UPD_CNT[0] ;
         n258TBM33_UPD_CNT = P005916_n258TBM33_UPD_CNT[0] ;
         A257TBM33_UPD_PROG_NM = P005916_A257TBM33_UPD_PROG_NM[0] ;
         n257TBM33_UPD_PROG_NM = P005916_n257TBM33_UPD_PROG_NM[0] ;
         A256TBM33_UPD_USER_ID = P005916_A256TBM33_UPD_USER_ID[0] ;
         n256TBM33_UPD_USER_ID = P005916_n256TBM33_UPD_USER_ID[0] ;
         A255TBM33_UPD_DATETIME = P005916_A255TBM33_UPD_DATETIME[0] ;
         n255TBM33_UPD_DATETIME = P005916_n255TBM33_UPD_DATETIME[0] ;
         A254TBM33_CRT_PROG_NM = P005916_A254TBM33_CRT_PROG_NM[0] ;
         n254TBM33_CRT_PROG_NM = P005916_n254TBM33_CRT_PROG_NM[0] ;
         A253TBM33_CRT_USER_ID = P005916_A253TBM33_CRT_USER_ID[0] ;
         n253TBM33_CRT_USER_ID = P005916_n253TBM33_CRT_USER_ID[0] ;
         A252TBM33_CRT_DATETIME = P005916_A252TBM33_CRT_DATETIME[0] ;
         n252TBM33_CRT_DATETIME = P005916_n252TBM33_CRT_DATETIME[0] ;
         AV11W_ITEMS.clear();
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A246TBM33_STUDY_ID, 10, 0)), 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A247TBM33_CRF_ID, 10, 0)), 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A248TBM33_COND_NO, 10, 0)), 0);
         AV11W_ITEMS.add(A379TBM33_COND_NM, 0);
         AV11W_ITEMS.add(A249TBM33_EXPRESSION, 0);
         AV11W_ITEMS.add(A380TBM33_COND_DIV, 0);
         AV11W_ITEMS.add(A381TBM33_CRF_ITEM_CD, 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A250TBM33_PRIOR_NO, 10, 0)), 0);
         AV11W_ITEMS.add(A382TBM33_ERR_DIV, 0);
         AV11W_ITEMS.add(A383TBM33_ERR_MSG, 0);
         AV11W_ITEMS.add(A554TBM33_ENABLED_FLG, 0);
         AV11W_ITEMS.add(A610TBM33_REQUIRED_INPUT_FLG, 0);
         AV11W_ITEMS.add(A611TBM33_NUMERIC_RANGE_FLG, 0);
         AV11W_ITEMS.add(A251TBM33_DEL_FLG, 0);
         new b808_pc02_data_log(remoteHandle, context).execute( AV28Pgmname, "DLT", "TBM33_CRF_COND", AV11W_ITEMS, A252TBM33_CRT_DATETIME, A253TBM33_CRT_USER_ID, A254TBM33_CRT_PROG_NM, A255TBM33_UPD_DATETIME, A256TBM33_UPD_USER_ID, A257TBM33_UPD_PROG_NM, A258TBM33_UPD_CNT) ;
         Gx_ope = "Delete" ;
         Gx_etb = "TBM33_CRF_COND" ;
         /* Using cursor P005917 */
         pr_default.execute(15, new Object[] {new Long(A246TBM33_STUDY_ID), new Short(A247TBM33_CRF_ID), new Short(A248TBM33_COND_NO)});
         pr_default.readNext(14);
      }
      pr_default.close(14);
      Gx_ope = "Fetch" ;
      Gx_etb = "TBM32_CRF_ITEM" ;
      /* Using cursor P005918 */
      pr_default.execute(16, new Object[] {new Long(AV18P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_study_id()), new Short(AV18P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crf_id())});
      while ( (pr_default.getStatus(16) != 101) )
      {
         A232TBM32_CRF_ID = P005918_A232TBM32_CRF_ID[0] ;
         A231TBM32_STUDY_ID = P005918_A231TBM32_STUDY_ID[0] ;
         A233TBM32_CRF_ITEM_CD = P005918_A233TBM32_CRF_ITEM_CD[0] ;
         A234TBM32_CRF_ITEM_NM = P005918_A234TBM32_CRF_ITEM_NM[0] ;
         n234TBM32_CRF_ITEM_NM = P005918_n234TBM32_CRF_ITEM_NM[0] ;
         A235TBM32_CRF_ITEM_DIV = P005918_A235TBM32_CRF_ITEM_DIV[0] ;
         n235TBM32_CRF_ITEM_DIV = P005918_n235TBM32_CRF_ITEM_DIV[0] ;
         A236TBM32_CRF_ITEM_GRP_CD = P005918_A236TBM32_CRF_ITEM_GRP_CD[0] ;
         n236TBM32_CRF_ITEM_GRP_CD = P005918_n236TBM32_CRF_ITEM_GRP_CD[0] ;
         A384TBM32_CRF_ITEM_GRP_ORDER = P005918_A384TBM32_CRF_ITEM_GRP_ORDER[0] ;
         n384TBM32_CRF_ITEM_GRP_ORDER = P005918_n384TBM32_CRF_ITEM_GRP_ORDER[0] ;
         A385TBM32_LOCATION_X = P005918_A385TBM32_LOCATION_X[0] ;
         n385TBM32_LOCATION_X = P005918_n385TBM32_LOCATION_X[0] ;
         A386TBM32_LOCATION_Y = P005918_A386TBM32_LOCATION_Y[0] ;
         n386TBM32_LOCATION_Y = P005918_n386TBM32_LOCATION_Y[0] ;
         A387TBM32_LOCATION_X2 = P005918_A387TBM32_LOCATION_X2[0] ;
         n387TBM32_LOCATION_X2 = P005918_n387TBM32_LOCATION_X2[0] ;
         A388TBM32_LOCATION_Y2 = P005918_A388TBM32_LOCATION_Y2[0] ;
         n388TBM32_LOCATION_Y2 = P005918_n388TBM32_LOCATION_Y2[0] ;
         A389TBM32_TEXT_ALIGN_DIV = P005918_A389TBM32_TEXT_ALIGN_DIV[0] ;
         n389TBM32_TEXT_ALIGN_DIV = P005918_n389TBM32_TEXT_ALIGN_DIV[0] ;
         A393TBM32_TEXT_MAXROWS = P005918_A393TBM32_TEXT_MAXROWS[0] ;
         n393TBM32_TEXT_MAXROWS = P005918_n393TBM32_TEXT_MAXROWS[0] ;
         A394TBM32_TEXT_MAXLENGTH = P005918_A394TBM32_TEXT_MAXLENGTH[0] ;
         n394TBM32_TEXT_MAXLENGTH = P005918_n394TBM32_TEXT_MAXLENGTH[0] ;
         A395TBM32_DECIMAL_DIGITS = P005918_A395TBM32_DECIMAL_DIGITS[0] ;
         n395TBM32_DECIMAL_DIGITS = P005918_n395TBM32_DECIMAL_DIGITS[0] ;
         A399TBM32_CHK_TRUE_INNER_VALUE = P005918_A399TBM32_CHK_TRUE_INNER_VALUE[0] ;
         n399TBM32_CHK_TRUE_INNER_VALUE = P005918_n399TBM32_CHK_TRUE_INNER_VALUE[0] ;
         A400TBM32_CHK_FALSE_INNER_VALUE = P005918_A400TBM32_CHK_FALSE_INNER_VALUE[0] ;
         n400TBM32_CHK_FALSE_INNER_VALUE = P005918_n400TBM32_CHK_FALSE_INNER_VALUE[0] ;
         A404TBM32_FIXED_VALUE = P005918_A404TBM32_FIXED_VALUE[0] ;
         n404TBM32_FIXED_VALUE = P005918_n404TBM32_FIXED_VALUE[0] ;
         A402TBM32_LIST_CD = P005918_A402TBM32_LIST_CD[0] ;
         n402TBM32_LIST_CD = P005918_n402TBM32_LIST_CD[0] ;
         A403TBM32_IMAGE_CD = P005918_A403TBM32_IMAGE_CD[0] ;
         n403TBM32_IMAGE_CD = P005918_n403TBM32_IMAGE_CD[0] ;
         A401TBM32_TEXT = P005918_A401TBM32_TEXT[0] ;
         n401TBM32_TEXT = P005918_n401TBM32_TEXT[0] ;
         A390TBM32_FONT_SIZE = P005918_A390TBM32_FONT_SIZE[0] ;
         n390TBM32_FONT_SIZE = P005918_n390TBM32_FONT_SIZE[0] ;
         A391TBM32_FONT_UL_FLG = P005918_A391TBM32_FONT_UL_FLG[0] ;
         n391TBM32_FONT_UL_FLG = P005918_n391TBM32_FONT_UL_FLG[0] ;
         A392TBM32_FONT_COLOR_DIV = P005918_A392TBM32_FONT_COLOR_DIV[0] ;
         n392TBM32_FONT_COLOR_DIV = P005918_n392TBM32_FONT_COLOR_DIV[0] ;
         A398TBM32_LINE_SIZE_DIV = P005918_A398TBM32_LINE_SIZE_DIV[0] ;
         n398TBM32_LINE_SIZE_DIV = P005918_n398TBM32_LINE_SIZE_DIV[0] ;
         A603TBM32_LINE_COLOR_DIV = P005918_A603TBM32_LINE_COLOR_DIV[0] ;
         n603TBM32_LINE_COLOR_DIV = P005918_n603TBM32_LINE_COLOR_DIV[0] ;
         A396TBM32_LINE_START_POINT_DIV = P005918_A396TBM32_LINE_START_POINT_DIV[0] ;
         n396TBM32_LINE_START_POINT_DIV = P005918_n396TBM32_LINE_START_POINT_DIV[0] ;
         A397TBM32_LINE_END_POINT_DIV = P005918_A397TBM32_LINE_END_POINT_DIV[0] ;
         n397TBM32_LINE_END_POINT_DIV = P005918_n397TBM32_LINE_END_POINT_DIV[0] ;
         A604TBM32_LINE_ANGLE = P005918_A604TBM32_LINE_ANGLE[0] ;
         n604TBM32_LINE_ANGLE = P005918_n604TBM32_LINE_ANGLE[0] ;
         A552TBM32_AUTH_LVL_MIN = P005918_A552TBM32_AUTH_LVL_MIN[0] ;
         n552TBM32_AUTH_LVL_MIN = P005918_n552TBM32_AUTH_LVL_MIN[0] ;
         A553TBM32_ZORDER = P005918_A553TBM32_ZORDER[0] ;
         n553TBM32_ZORDER = P005918_n553TBM32_ZORDER[0] ;
         A605TBM32_TAB_ORDER = P005918_A605TBM32_TAB_ORDER[0] ;
         n605TBM32_TAB_ORDER = P005918_n605TBM32_TAB_ORDER[0] ;
         A606TBM32_TABSTOP_FLG = P005918_A606TBM32_TABSTOP_FLG[0] ;
         n606TBM32_TABSTOP_FLG = P005918_n606TBM32_TABSTOP_FLG[0] ;
         A607TBM32_REQUIRED_INPUT_FLG = P005918_A607TBM32_REQUIRED_INPUT_FLG[0] ;
         n607TBM32_REQUIRED_INPUT_FLG = P005918_n607TBM32_REQUIRED_INPUT_FLG[0] ;
         A608TBM32_MIN_VALUE = P005918_A608TBM32_MIN_VALUE[0] ;
         n608TBM32_MIN_VALUE = P005918_n608TBM32_MIN_VALUE[0] ;
         A609TBM32_MAX_VALUE = P005918_A609TBM32_MAX_VALUE[0] ;
         n609TBM32_MAX_VALUE = P005918_n609TBM32_MAX_VALUE[0] ;
         A237TBM32_CRF_ITEM_NOTE = P005918_A237TBM32_CRF_ITEM_NOTE[0] ;
         n237TBM32_CRF_ITEM_NOTE = P005918_n237TBM32_CRF_ITEM_NOTE[0] ;
         A746TBM32_REF_CRF_ID = P005918_A746TBM32_REF_CRF_ID[0] ;
         n746TBM32_REF_CRF_ID = P005918_n746TBM32_REF_CRF_ID[0] ;
         A747TBM32_REF_CRF_ITEM_CD = P005918_A747TBM32_REF_CRF_ITEM_CD[0] ;
         n747TBM32_REF_CRF_ITEM_CD = P005918_n747TBM32_REF_CRF_ITEM_CD[0] ;
         A238TBM32_DEL_FLG = P005918_A238TBM32_DEL_FLG[0] ;
         n238TBM32_DEL_FLG = P005918_n238TBM32_DEL_FLG[0] ;
         A245TBM32_UPD_CNT = P005918_A245TBM32_UPD_CNT[0] ;
         n245TBM32_UPD_CNT = P005918_n245TBM32_UPD_CNT[0] ;
         A244TBM32_UPD_PROG_NM = P005918_A244TBM32_UPD_PROG_NM[0] ;
         n244TBM32_UPD_PROG_NM = P005918_n244TBM32_UPD_PROG_NM[0] ;
         A243TBM32_UPD_USER_ID = P005918_A243TBM32_UPD_USER_ID[0] ;
         n243TBM32_UPD_USER_ID = P005918_n243TBM32_UPD_USER_ID[0] ;
         A242TBM32_UPD_DATETIME = P005918_A242TBM32_UPD_DATETIME[0] ;
         n242TBM32_UPD_DATETIME = P005918_n242TBM32_UPD_DATETIME[0] ;
         A241TBM32_CRT_PROG_NM = P005918_A241TBM32_CRT_PROG_NM[0] ;
         n241TBM32_CRT_PROG_NM = P005918_n241TBM32_CRT_PROG_NM[0] ;
         A240TBM32_CRT_USER_ID = P005918_A240TBM32_CRT_USER_ID[0] ;
         n240TBM32_CRT_USER_ID = P005918_n240TBM32_CRT_USER_ID[0] ;
         A239TBM32_CRT_DATETIME = P005918_A239TBM32_CRT_DATETIME[0] ;
         n239TBM32_CRT_DATETIME = P005918_n239TBM32_CRT_DATETIME[0] ;
         AV11W_ITEMS.clear();
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A231TBM32_STUDY_ID, 10, 0)), 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A232TBM32_CRF_ID, 10, 0)), 0);
         AV11W_ITEMS.add(A233TBM32_CRF_ITEM_CD, 0);
         AV11W_ITEMS.add(A234TBM32_CRF_ITEM_NM, 0);
         AV11W_ITEMS.add(A235TBM32_CRF_ITEM_DIV, 0);
         AV11W_ITEMS.add(A236TBM32_CRF_ITEM_GRP_CD, 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A384TBM32_CRF_ITEM_GRP_ORDER, 10, 0)), 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A385TBM32_LOCATION_X, 10, 0)), 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A386TBM32_LOCATION_Y, 10, 0)), 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A387TBM32_LOCATION_X2, 10, 0)), 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A388TBM32_LOCATION_Y2, 10, 0)), 0);
         AV11W_ITEMS.add(A389TBM32_TEXT_ALIGN_DIV, 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A393TBM32_TEXT_MAXROWS, 10, 0)), 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A394TBM32_TEXT_MAXLENGTH, 10, 0)), 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A395TBM32_DECIMAL_DIGITS, 10, 0)), 0);
         AV11W_ITEMS.add(A399TBM32_CHK_TRUE_INNER_VALUE, 0);
         AV11W_ITEMS.add(A400TBM32_CHK_FALSE_INNER_VALUE, 0);
         AV11W_ITEMS.add(A404TBM32_FIXED_VALUE, 0);
         AV11W_ITEMS.add(A402TBM32_LIST_CD, 0);
         AV11W_ITEMS.add(A403TBM32_IMAGE_CD, 0);
         AV11W_ITEMS.add(A401TBM32_TEXT, 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A390TBM32_FONT_SIZE, 10, 0)), 0);
         AV11W_ITEMS.add(A391TBM32_FONT_UL_FLG, 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A392TBM32_FONT_COLOR_DIV, 10, 0)), 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A398TBM32_LINE_SIZE_DIV, 10, 0)), 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A603TBM32_LINE_COLOR_DIV, 10, 0)), 0);
         AV11W_ITEMS.add(A396TBM32_LINE_START_POINT_DIV, 0);
         AV11W_ITEMS.add(A397TBM32_LINE_END_POINT_DIV, 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A604TBM32_LINE_ANGLE, 10, 0)), 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A552TBM32_AUTH_LVL_MIN, 10, 0)), 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A553TBM32_ZORDER, 10, 0)), 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A605TBM32_TAB_ORDER, 10, 0)), 0);
         AV11W_ITEMS.add(A606TBM32_TABSTOP_FLG, 0);
         AV11W_ITEMS.add(A607TBM32_REQUIRED_INPUT_FLG, 0);
         AV11W_ITEMS.add(A608TBM32_MIN_VALUE, 0);
         AV11W_ITEMS.add(A609TBM32_MAX_VALUE, 0);
         AV11W_ITEMS.add(A237TBM32_CRF_ITEM_NOTE, 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A746TBM32_REF_CRF_ID, 10, 0)), 0);
         AV11W_ITEMS.add(A747TBM32_REF_CRF_ITEM_CD, 0);
         AV11W_ITEMS.add(A238TBM32_DEL_FLG, 0);
         new b808_pc02_data_log(remoteHandle, context).execute( AV28Pgmname, "DLT", "TBM32_CRF_ITEM", AV11W_ITEMS, A239TBM32_CRT_DATETIME, A240TBM32_CRT_USER_ID, A241TBM32_CRT_PROG_NM, A242TBM32_UPD_DATETIME, A243TBM32_UPD_USER_ID, A244TBM32_UPD_PROG_NM, A245TBM32_UPD_CNT) ;
         Gx_ope = "Delete" ;
         Gx_etb = "TBM32_CRF_ITEM" ;
         /* Using cursor P005919 */
         pr_default.execute(17, new Object[] {new Long(A231TBM32_STUDY_ID), new Short(A232TBM32_CRF_ID), A233TBM32_CRF_ITEM_CD});
         pr_default.readNext(16);
      }
      pr_default.close(16);
      Gx_ope = "Fetch" ;
      Gx_etb = "TBM34_CRF_AUTH" ;
      /* Using cursor P005920 */
      pr_default.execute(18, new Object[] {new Long(AV18P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_study_id()), new Short(AV18P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crf_id())});
      while ( (pr_default.getStatus(18) != 101) )
      {
         A460TBM34_CRF_ID = P005920_A460TBM34_CRF_ID[0] ;
         A459TBM34_STUDY_ID = P005920_A459TBM34_STUDY_ID[0] ;
         A461TBM34_STYDY_AUTH_CD = P005920_A461TBM34_STYDY_AUTH_CD[0] ;
         A462TBM34_DISPLAY_FLG = P005920_A462TBM34_DISPLAY_FLG[0] ;
         n462TBM34_DISPLAY_FLG = P005920_n462TBM34_DISPLAY_FLG[0] ;
         A463TBM34_DEL_FLG = P005920_A463TBM34_DEL_FLG[0] ;
         n463TBM34_DEL_FLG = P005920_n463TBM34_DEL_FLG[0] ;
         A470TBM34_UPD_CNT = P005920_A470TBM34_UPD_CNT[0] ;
         n470TBM34_UPD_CNT = P005920_n470TBM34_UPD_CNT[0] ;
         A469TBM34_UPD_PROG_NM = P005920_A469TBM34_UPD_PROG_NM[0] ;
         n469TBM34_UPD_PROG_NM = P005920_n469TBM34_UPD_PROG_NM[0] ;
         A468TBM34_UPD_USER_ID = P005920_A468TBM34_UPD_USER_ID[0] ;
         n468TBM34_UPD_USER_ID = P005920_n468TBM34_UPD_USER_ID[0] ;
         A467TBM34_UPD_DATETIME = P005920_A467TBM34_UPD_DATETIME[0] ;
         n467TBM34_UPD_DATETIME = P005920_n467TBM34_UPD_DATETIME[0] ;
         A466TBM34_CRT_PROG_NM = P005920_A466TBM34_CRT_PROG_NM[0] ;
         n466TBM34_CRT_PROG_NM = P005920_n466TBM34_CRT_PROG_NM[0] ;
         A465TBM34_CRT_USER_ID = P005920_A465TBM34_CRT_USER_ID[0] ;
         n465TBM34_CRT_USER_ID = P005920_n465TBM34_CRT_USER_ID[0] ;
         A464TBM34_CRT_DATETIME = P005920_A464TBM34_CRT_DATETIME[0] ;
         n464TBM34_CRT_DATETIME = P005920_n464TBM34_CRT_DATETIME[0] ;
         AV11W_ITEMS.clear();
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A459TBM34_STUDY_ID, 10, 0)), 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A460TBM34_CRF_ID, 10, 0)), 0);
         AV11W_ITEMS.add(A461TBM34_STYDY_AUTH_CD, 0);
         AV11W_ITEMS.add(A462TBM34_DISPLAY_FLG, 0);
         AV11W_ITEMS.add(A463TBM34_DEL_FLG, 0);
         new b808_pc02_data_log(remoteHandle, context).execute( AV28Pgmname, "DLT", "TBM34_CRF_AUTH", AV11W_ITEMS, A464TBM34_CRT_DATETIME, A465TBM34_CRT_USER_ID, A466TBM34_CRT_PROG_NM, A467TBM34_UPD_DATETIME, A468TBM34_UPD_USER_ID, A469TBM34_UPD_PROG_NM, A470TBM34_UPD_CNT) ;
         Gx_ope = "Delete" ;
         Gx_etb = "TBM34_CRF_AUTH" ;
         /* Using cursor P005921 */
         pr_default.execute(19, new Object[] {new Long(A459TBM34_STUDY_ID), new Short(A460TBM34_CRF_ID), A461TBM34_STYDY_AUTH_CD});
         pr_default.readNext(18);
      }
      pr_default.close(18);
      AV18P_BC_CRF.Delete();
      if ( AV18P_BC_CRF.Fail() )
      {
         AV12W_RTN_CD = (short)(1) ;
         GXt_char1 = AV13W_RTN_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV18P_BC_CRF.GetMessages(), (byte)(0), GXv_char2) ;
         b402_pc23_crf_del.this.GXt_char1 = GXv_char2[0] ;
         AV13W_RTN_MSG = GXt_char1 ;
      }
      cleanup();
   }

   public void S11280( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT3[0] = AV9W_A_LOGIN_SDT;
      GXv_char2[0] = AV10W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT3, GXv_char2) ;
      AV9W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT3[0] ;
      b402_pc23_crf_del.this.AV10W_ERRCD = GXv_char2[0] ;
      if ( GXutil.strcmp(AV10W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("1")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void S12298( )
   {
      /* 'SUB_ERROR' Routine */
      AV14W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV14W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV8C_APP_ID );
      AV15W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO4[0] = AV14W_EXTRA_INFO;
      GXv_int5[0] = AV16W_ERR_CD ;
      GXv_char2[0] = AV17W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV28Pgmname, (short)(0), AV15W_MSG, GXv_SdtB808_SD01_EXTRA_INFO4, GXv_int5, GXv_char2) ;
      AV14W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO4[0] ;
      b402_pc23_crf_del.this.AV16W_ERR_CD = GXv_int5[0] ;
      b402_pc23_crf_del.this.AV17W_ERR_MSG = GXv_char2[0] ;
      Application.rollback(context, remoteHandle, "DEFAULT", "b402_pc23_crf_del");
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   protected void cleanup( )
   {
      this.aP1[0] = b402_pc23_crf_del.this.AV12W_RTN_CD;
      this.aP2[0] = b402_pc23_crf_del.this.AV13W_RTN_MSG;
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
                  /* Execute user subroutine: S12298 */
                  S12298 ();
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
      AV13W_RTN_MSG = "" ;
      AV8C_APP_ID = "" ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      scmdbuf = "" ;
      P00598_A472TBM35_CRF_ID = new short[1] ;
      P00598_A471TBM35_STUDY_ID = new long[1] ;
      P00598_A473TBM35_CRF_ITEM_CD = new String[] {""} ;
      P00598_A474TBM35_STUDY_AUTH_CD = new String[] {""} ;
      P00598_A475TBM35_DISPLAY_FLG = new String[] {""} ;
      P00598_n475TBM35_DISPLAY_FLG = new boolean[] {false} ;
      P00598_A476TBM35_DEL_FLG = new String[] {""} ;
      P00598_n476TBM35_DEL_FLG = new boolean[] {false} ;
      P00598_A483TBM35_UPD_CNT = new long[1] ;
      P00598_n483TBM35_UPD_CNT = new boolean[] {false} ;
      P00598_A482TBM35_UPD_PROG_NM = new String[] {""} ;
      P00598_n482TBM35_UPD_PROG_NM = new boolean[] {false} ;
      P00598_A481TBM35_UPD_USER_ID = new String[] {""} ;
      P00598_n481TBM35_UPD_USER_ID = new boolean[] {false} ;
      P00598_A480TBM35_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P00598_n480TBM35_UPD_DATETIME = new boolean[] {false} ;
      P00598_A479TBM35_CRT_PROG_NM = new String[] {""} ;
      P00598_n479TBM35_CRT_PROG_NM = new boolean[] {false} ;
      P00598_A478TBM35_CRT_USER_ID = new String[] {""} ;
      P00598_n478TBM35_CRT_USER_ID = new boolean[] {false} ;
      P00598_A477TBM35_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P00598_n477TBM35_CRT_DATETIME = new boolean[] {false} ;
      A473TBM35_CRF_ITEM_CD = "" ;
      A474TBM35_STUDY_AUTH_CD = "" ;
      A475TBM35_DISPLAY_FLG = "" ;
      A476TBM35_DEL_FLG = "" ;
      A482TBM35_UPD_PROG_NM = "" ;
      A481TBM35_UPD_USER_ID = "" ;
      A480TBM35_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A479TBM35_CRT_PROG_NM = "" ;
      A478TBM35_CRT_USER_ID = "" ;
      A477TBM35_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      AV11W_ITEMS = new GxObjectCollection(String.class, "internal", "");
      AV28Pgmname = "" ;
      P005910_A260TBM41_CRF_ID = new short[1] ;
      P005910_A259TBM41_STUDY_ID = new long[1] ;
      P005910_A378TBM41_CRF_ITEM_GRP_DIV = new String[] {""} ;
      P005910_A261TBM41_CRF_ITEM_GRP_CD = new String[] {""} ;
      P005910_A262TBM41_NCM_METADATA_ID = new String[] {""} ;
      P005910_n262TBM41_NCM_METADATA_ID = new boolean[] {false} ;
      P005910_A263TBM41_DEL_FLG = new String[] {""} ;
      P005910_n263TBM41_DEL_FLG = new boolean[] {false} ;
      P005910_A270TBM41_UPD_CNT = new long[1] ;
      P005910_n270TBM41_UPD_CNT = new boolean[] {false} ;
      P005910_A269TBM41_UPD_PROG_NM = new String[] {""} ;
      P005910_n269TBM41_UPD_PROG_NM = new boolean[] {false} ;
      P005910_A268TBM41_UPD_USER_ID = new String[] {""} ;
      P005910_n268TBM41_UPD_USER_ID = new boolean[] {false} ;
      P005910_A267TBM41_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P005910_n267TBM41_UPD_DATETIME = new boolean[] {false} ;
      P005910_A266TBM41_CRT_PROG_NM = new String[] {""} ;
      P005910_n266TBM41_CRT_PROG_NM = new boolean[] {false} ;
      P005910_A265TBM41_CRT_USER_ID = new String[] {""} ;
      P005910_n265TBM41_CRT_USER_ID = new boolean[] {false} ;
      P005910_A264TBM41_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P005910_n264TBM41_CRT_DATETIME = new boolean[] {false} ;
      A378TBM41_CRF_ITEM_GRP_DIV = "" ;
      A261TBM41_CRF_ITEM_GRP_CD = "" ;
      A262TBM41_NCM_METADATA_ID = "" ;
      A263TBM41_DEL_FLG = "" ;
      A269TBM41_UPD_PROG_NM = "" ;
      A268TBM41_UPD_USER_ID = "" ;
      A267TBM41_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A266TBM41_CRT_PROG_NM = "" ;
      A265TBM41_CRT_USER_ID = "" ;
      A264TBM41_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      P005912_A272TBM37_CRF_ID = new short[1] ;
      P005912_A271TBM37_STUDY_ID = new long[1] ;
      P005912_A372TBM37_CRF_ITEM_GRP_DIV = new String[] {""} ;
      P005912_A273TBM37_CRF_ITEM_GRP_CD = new String[] {""} ;
      P005912_A373TBM37_VISIT_NO = new short[1] ;
      P005912_n373TBM37_VISIT_NO = new boolean[] {false} ;
      P005912_A374TBM37_DOM_CD = new String[] {""} ;
      P005912_n374TBM37_DOM_CD = new boolean[] {false} ;
      P005912_A375TBM37_DOM_VAR_NM = new String[] {""} ;
      P005912_n375TBM37_DOM_VAR_NM = new boolean[] {false} ;
      P005912_A376TBM37_DOM_ITM_GRP_OID = new String[] {""} ;
      P005912_n376TBM37_DOM_ITM_GRP_OID = new boolean[] {false} ;
      P005912_A377TBM37_DOM_ITM_GRP_ATTR_SEQ = new short[1] ;
      P005912_n377TBM37_DOM_ITM_GRP_ATTR_SEQ = new boolean[] {false} ;
      P005912_A612TBM37_DOM_ITM_GRP_ROWNO = new short[1] ;
      P005912_n612TBM37_DOM_ITM_GRP_ROWNO = new boolean[] {false} ;
      P005912_A274TBM37_DEL_FLG = new String[] {""} ;
      P005912_n274TBM37_DEL_FLG = new boolean[] {false} ;
      P005912_A281TBM37_UPD_CNT = new long[1] ;
      P005912_n281TBM37_UPD_CNT = new boolean[] {false} ;
      P005912_A280TBM37_UPD_PROG_NM = new String[] {""} ;
      P005912_n280TBM37_UPD_PROG_NM = new boolean[] {false} ;
      P005912_A279TBM37_UPD_USER_ID = new String[] {""} ;
      P005912_n279TBM37_UPD_USER_ID = new boolean[] {false} ;
      P005912_A278TBM37_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P005912_n278TBM37_UPD_DATETIME = new boolean[] {false} ;
      P005912_A277TBM37_CRT_PROG_NM = new String[] {""} ;
      P005912_n277TBM37_CRT_PROG_NM = new boolean[] {false} ;
      P005912_A276TBM37_CRT_USER_ID = new String[] {""} ;
      P005912_n276TBM37_CRT_USER_ID = new boolean[] {false} ;
      P005912_A275TBM37_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P005912_n275TBM37_CRT_DATETIME = new boolean[] {false} ;
      A372TBM37_CRF_ITEM_GRP_DIV = "" ;
      A273TBM37_CRF_ITEM_GRP_CD = "" ;
      A374TBM37_DOM_CD = "" ;
      A375TBM37_DOM_VAR_NM = "" ;
      A376TBM37_DOM_ITM_GRP_OID = "" ;
      A274TBM37_DEL_FLG = "" ;
      A280TBM37_UPD_PROG_NM = "" ;
      A279TBM37_UPD_USER_ID = "" ;
      A278TBM37_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A277TBM37_CRT_PROG_NM = "" ;
      A276TBM37_CRT_USER_ID = "" ;
      A275TBM37_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      P005914_A487TBM36_SELECT_CRF_ID = new short[1] ;
      P005914_A484TBM36_STUDY_ID = new long[1] ;
      P005914_A485TBM36_CRF_ID = new short[1] ;
      P005914_A486TBM36_COND_NO = new short[1] ;
      P005914_A488TBM36_DEL_FLG = new String[] {""} ;
      P005914_n488TBM36_DEL_FLG = new boolean[] {false} ;
      P005914_A495TBM36_UPD_CNT = new long[1] ;
      P005914_n495TBM36_UPD_CNT = new boolean[] {false} ;
      P005914_A494TBM36_UPD_PROG_NM = new String[] {""} ;
      P005914_n494TBM36_UPD_PROG_NM = new boolean[] {false} ;
      P005914_A493TBM36_UPD_USER_ID = new String[] {""} ;
      P005914_n493TBM36_UPD_USER_ID = new boolean[] {false} ;
      P005914_A492TBM36_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P005914_n492TBM36_UPD_DATETIME = new boolean[] {false} ;
      P005914_A491TBM36_CRT_PROG_NM = new String[] {""} ;
      P005914_n491TBM36_CRT_PROG_NM = new boolean[] {false} ;
      P005914_A490TBM36_CRT_USER_ID = new String[] {""} ;
      P005914_n490TBM36_CRT_USER_ID = new boolean[] {false} ;
      P005914_A489TBM36_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P005914_n489TBM36_CRT_DATETIME = new boolean[] {false} ;
      A488TBM36_DEL_FLG = "" ;
      A494TBM36_UPD_PROG_NM = "" ;
      A493TBM36_UPD_USER_ID = "" ;
      A492TBM36_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A491TBM36_CRT_PROG_NM = "" ;
      A490TBM36_CRT_USER_ID = "" ;
      A489TBM36_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      P005916_A247TBM33_CRF_ID = new short[1] ;
      P005916_A246TBM33_STUDY_ID = new long[1] ;
      P005916_A248TBM33_COND_NO = new short[1] ;
      P005916_A379TBM33_COND_NM = new String[] {""} ;
      P005916_n379TBM33_COND_NM = new boolean[] {false} ;
      P005916_A249TBM33_EXPRESSION = new String[] {""} ;
      P005916_n249TBM33_EXPRESSION = new boolean[] {false} ;
      P005916_A380TBM33_COND_DIV = new String[] {""} ;
      P005916_n380TBM33_COND_DIV = new boolean[] {false} ;
      P005916_A381TBM33_CRF_ITEM_CD = new String[] {""} ;
      P005916_n381TBM33_CRF_ITEM_CD = new boolean[] {false} ;
      P005916_A250TBM33_PRIOR_NO = new byte[1] ;
      P005916_n250TBM33_PRIOR_NO = new boolean[] {false} ;
      P005916_A382TBM33_ERR_DIV = new String[] {""} ;
      P005916_n382TBM33_ERR_DIV = new boolean[] {false} ;
      P005916_A383TBM33_ERR_MSG = new String[] {""} ;
      P005916_n383TBM33_ERR_MSG = new boolean[] {false} ;
      P005916_A554TBM33_ENABLED_FLG = new String[] {""} ;
      P005916_n554TBM33_ENABLED_FLG = new boolean[] {false} ;
      P005916_A610TBM33_REQUIRED_INPUT_FLG = new String[] {""} ;
      P005916_n610TBM33_REQUIRED_INPUT_FLG = new boolean[] {false} ;
      P005916_A611TBM33_NUMERIC_RANGE_FLG = new String[] {""} ;
      P005916_n611TBM33_NUMERIC_RANGE_FLG = new boolean[] {false} ;
      P005916_A251TBM33_DEL_FLG = new String[] {""} ;
      P005916_n251TBM33_DEL_FLG = new boolean[] {false} ;
      P005916_A258TBM33_UPD_CNT = new long[1] ;
      P005916_n258TBM33_UPD_CNT = new boolean[] {false} ;
      P005916_A257TBM33_UPD_PROG_NM = new String[] {""} ;
      P005916_n257TBM33_UPD_PROG_NM = new boolean[] {false} ;
      P005916_A256TBM33_UPD_USER_ID = new String[] {""} ;
      P005916_n256TBM33_UPD_USER_ID = new boolean[] {false} ;
      P005916_A255TBM33_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P005916_n255TBM33_UPD_DATETIME = new boolean[] {false} ;
      P005916_A254TBM33_CRT_PROG_NM = new String[] {""} ;
      P005916_n254TBM33_CRT_PROG_NM = new boolean[] {false} ;
      P005916_A253TBM33_CRT_USER_ID = new String[] {""} ;
      P005916_n253TBM33_CRT_USER_ID = new boolean[] {false} ;
      P005916_A252TBM33_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P005916_n252TBM33_CRT_DATETIME = new boolean[] {false} ;
      A379TBM33_COND_NM = "" ;
      A249TBM33_EXPRESSION = "" ;
      A380TBM33_COND_DIV = "" ;
      A381TBM33_CRF_ITEM_CD = "" ;
      A382TBM33_ERR_DIV = "" ;
      A383TBM33_ERR_MSG = "" ;
      A554TBM33_ENABLED_FLG = "" ;
      A610TBM33_REQUIRED_INPUT_FLG = "" ;
      A611TBM33_NUMERIC_RANGE_FLG = "" ;
      A251TBM33_DEL_FLG = "" ;
      A257TBM33_UPD_PROG_NM = "" ;
      A256TBM33_UPD_USER_ID = "" ;
      A255TBM33_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A254TBM33_CRT_PROG_NM = "" ;
      A253TBM33_CRT_USER_ID = "" ;
      A252TBM33_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      P005918_A232TBM32_CRF_ID = new short[1] ;
      P005918_A231TBM32_STUDY_ID = new long[1] ;
      P005918_A233TBM32_CRF_ITEM_CD = new String[] {""} ;
      P005918_A234TBM32_CRF_ITEM_NM = new String[] {""} ;
      P005918_n234TBM32_CRF_ITEM_NM = new boolean[] {false} ;
      P005918_A235TBM32_CRF_ITEM_DIV = new String[] {""} ;
      P005918_n235TBM32_CRF_ITEM_DIV = new boolean[] {false} ;
      P005918_A236TBM32_CRF_ITEM_GRP_CD = new String[] {""} ;
      P005918_n236TBM32_CRF_ITEM_GRP_CD = new boolean[] {false} ;
      P005918_A384TBM32_CRF_ITEM_GRP_ORDER = new short[1] ;
      P005918_n384TBM32_CRF_ITEM_GRP_ORDER = new boolean[] {false} ;
      P005918_A385TBM32_LOCATION_X = new short[1] ;
      P005918_n385TBM32_LOCATION_X = new boolean[] {false} ;
      P005918_A386TBM32_LOCATION_Y = new short[1] ;
      P005918_n386TBM32_LOCATION_Y = new boolean[] {false} ;
      P005918_A387TBM32_LOCATION_X2 = new short[1] ;
      P005918_n387TBM32_LOCATION_X2 = new boolean[] {false} ;
      P005918_A388TBM32_LOCATION_Y2 = new short[1] ;
      P005918_n388TBM32_LOCATION_Y2 = new boolean[] {false} ;
      P005918_A389TBM32_TEXT_ALIGN_DIV = new String[] {""} ;
      P005918_n389TBM32_TEXT_ALIGN_DIV = new boolean[] {false} ;
      P005918_A393TBM32_TEXT_MAXROWS = new byte[1] ;
      P005918_n393TBM32_TEXT_MAXROWS = new boolean[] {false} ;
      P005918_A394TBM32_TEXT_MAXLENGTH = new short[1] ;
      P005918_n394TBM32_TEXT_MAXLENGTH = new boolean[] {false} ;
      P005918_A395TBM32_DECIMAL_DIGITS = new byte[1] ;
      P005918_n395TBM32_DECIMAL_DIGITS = new boolean[] {false} ;
      P005918_A399TBM32_CHK_TRUE_INNER_VALUE = new String[] {""} ;
      P005918_n399TBM32_CHK_TRUE_INNER_VALUE = new boolean[] {false} ;
      P005918_A400TBM32_CHK_FALSE_INNER_VALUE = new String[] {""} ;
      P005918_n400TBM32_CHK_FALSE_INNER_VALUE = new boolean[] {false} ;
      P005918_A404TBM32_FIXED_VALUE = new String[] {""} ;
      P005918_n404TBM32_FIXED_VALUE = new boolean[] {false} ;
      P005918_A402TBM32_LIST_CD = new String[] {""} ;
      P005918_n402TBM32_LIST_CD = new boolean[] {false} ;
      P005918_A403TBM32_IMAGE_CD = new String[] {""} ;
      P005918_n403TBM32_IMAGE_CD = new boolean[] {false} ;
      P005918_A401TBM32_TEXT = new String[] {""} ;
      P005918_n401TBM32_TEXT = new boolean[] {false} ;
      P005918_A390TBM32_FONT_SIZE = new byte[1] ;
      P005918_n390TBM32_FONT_SIZE = new boolean[] {false} ;
      P005918_A391TBM32_FONT_UL_FLG = new String[] {""} ;
      P005918_n391TBM32_FONT_UL_FLG = new boolean[] {false} ;
      P005918_A392TBM32_FONT_COLOR_DIV = new long[1] ;
      P005918_n392TBM32_FONT_COLOR_DIV = new boolean[] {false} ;
      P005918_A398TBM32_LINE_SIZE_DIV = new byte[1] ;
      P005918_n398TBM32_LINE_SIZE_DIV = new boolean[] {false} ;
      P005918_A603TBM32_LINE_COLOR_DIV = new long[1] ;
      P005918_n603TBM32_LINE_COLOR_DIV = new boolean[] {false} ;
      P005918_A396TBM32_LINE_START_POINT_DIV = new String[] {""} ;
      P005918_n396TBM32_LINE_START_POINT_DIV = new boolean[] {false} ;
      P005918_A397TBM32_LINE_END_POINT_DIV = new String[] {""} ;
      P005918_n397TBM32_LINE_END_POINT_DIV = new boolean[] {false} ;
      P005918_A604TBM32_LINE_ANGLE = new short[1] ;
      P005918_n604TBM32_LINE_ANGLE = new boolean[] {false} ;
      P005918_A552TBM32_AUTH_LVL_MIN = new byte[1] ;
      P005918_n552TBM32_AUTH_LVL_MIN = new boolean[] {false} ;
      P005918_A553TBM32_ZORDER = new short[1] ;
      P005918_n553TBM32_ZORDER = new boolean[] {false} ;
      P005918_A605TBM32_TAB_ORDER = new short[1] ;
      P005918_n605TBM32_TAB_ORDER = new boolean[] {false} ;
      P005918_A606TBM32_TABSTOP_FLG = new String[] {""} ;
      P005918_n606TBM32_TABSTOP_FLG = new boolean[] {false} ;
      P005918_A607TBM32_REQUIRED_INPUT_FLG = new String[] {""} ;
      P005918_n607TBM32_REQUIRED_INPUT_FLG = new boolean[] {false} ;
      P005918_A608TBM32_MIN_VALUE = new String[] {""} ;
      P005918_n608TBM32_MIN_VALUE = new boolean[] {false} ;
      P005918_A609TBM32_MAX_VALUE = new String[] {""} ;
      P005918_n609TBM32_MAX_VALUE = new boolean[] {false} ;
      P005918_A237TBM32_CRF_ITEM_NOTE = new String[] {""} ;
      P005918_n237TBM32_CRF_ITEM_NOTE = new boolean[] {false} ;
      P005918_A746TBM32_REF_CRF_ID = new short[1] ;
      P005918_n746TBM32_REF_CRF_ID = new boolean[] {false} ;
      P005918_A747TBM32_REF_CRF_ITEM_CD = new String[] {""} ;
      P005918_n747TBM32_REF_CRF_ITEM_CD = new boolean[] {false} ;
      P005918_A238TBM32_DEL_FLG = new String[] {""} ;
      P005918_n238TBM32_DEL_FLG = new boolean[] {false} ;
      P005918_A245TBM32_UPD_CNT = new long[1] ;
      P005918_n245TBM32_UPD_CNT = new boolean[] {false} ;
      P005918_A244TBM32_UPD_PROG_NM = new String[] {""} ;
      P005918_n244TBM32_UPD_PROG_NM = new boolean[] {false} ;
      P005918_A243TBM32_UPD_USER_ID = new String[] {""} ;
      P005918_n243TBM32_UPD_USER_ID = new boolean[] {false} ;
      P005918_A242TBM32_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P005918_n242TBM32_UPD_DATETIME = new boolean[] {false} ;
      P005918_A241TBM32_CRT_PROG_NM = new String[] {""} ;
      P005918_n241TBM32_CRT_PROG_NM = new boolean[] {false} ;
      P005918_A240TBM32_CRT_USER_ID = new String[] {""} ;
      P005918_n240TBM32_CRT_USER_ID = new boolean[] {false} ;
      P005918_A239TBM32_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P005918_n239TBM32_CRT_DATETIME = new boolean[] {false} ;
      A233TBM32_CRF_ITEM_CD = "" ;
      A234TBM32_CRF_ITEM_NM = "" ;
      A235TBM32_CRF_ITEM_DIV = "" ;
      A236TBM32_CRF_ITEM_GRP_CD = "" ;
      A389TBM32_TEXT_ALIGN_DIV = "" ;
      A399TBM32_CHK_TRUE_INNER_VALUE = "" ;
      A400TBM32_CHK_FALSE_INNER_VALUE = "" ;
      A404TBM32_FIXED_VALUE = "" ;
      A402TBM32_LIST_CD = "" ;
      A403TBM32_IMAGE_CD = "" ;
      A401TBM32_TEXT = "" ;
      A391TBM32_FONT_UL_FLG = "" ;
      A396TBM32_LINE_START_POINT_DIV = "" ;
      A397TBM32_LINE_END_POINT_DIV = "" ;
      A606TBM32_TABSTOP_FLG = "" ;
      A607TBM32_REQUIRED_INPUT_FLG = "" ;
      A608TBM32_MIN_VALUE = "" ;
      A609TBM32_MAX_VALUE = "" ;
      A237TBM32_CRF_ITEM_NOTE = "" ;
      A747TBM32_REF_CRF_ITEM_CD = "" ;
      A238TBM32_DEL_FLG = "" ;
      A244TBM32_UPD_PROG_NM = "" ;
      A243TBM32_UPD_USER_ID = "" ;
      A242TBM32_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A241TBM32_CRT_PROG_NM = "" ;
      A240TBM32_CRT_USER_ID = "" ;
      A239TBM32_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      P005920_A460TBM34_CRF_ID = new short[1] ;
      P005920_A459TBM34_STUDY_ID = new long[1] ;
      P005920_A461TBM34_STYDY_AUTH_CD = new String[] {""} ;
      P005920_A462TBM34_DISPLAY_FLG = new String[] {""} ;
      P005920_n462TBM34_DISPLAY_FLG = new boolean[] {false} ;
      P005920_A463TBM34_DEL_FLG = new String[] {""} ;
      P005920_n463TBM34_DEL_FLG = new boolean[] {false} ;
      P005920_A470TBM34_UPD_CNT = new long[1] ;
      P005920_n470TBM34_UPD_CNT = new boolean[] {false} ;
      P005920_A469TBM34_UPD_PROG_NM = new String[] {""} ;
      P005920_n469TBM34_UPD_PROG_NM = new boolean[] {false} ;
      P005920_A468TBM34_UPD_USER_ID = new String[] {""} ;
      P005920_n468TBM34_UPD_USER_ID = new boolean[] {false} ;
      P005920_A467TBM34_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P005920_n467TBM34_UPD_DATETIME = new boolean[] {false} ;
      P005920_A466TBM34_CRT_PROG_NM = new String[] {""} ;
      P005920_n466TBM34_CRT_PROG_NM = new boolean[] {false} ;
      P005920_A465TBM34_CRT_USER_ID = new String[] {""} ;
      P005920_n465TBM34_CRT_USER_ID = new boolean[] {false} ;
      P005920_A464TBM34_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P005920_n464TBM34_CRT_DATETIME = new boolean[] {false} ;
      A461TBM34_STYDY_AUTH_CD = "" ;
      A462TBM34_DISPLAY_FLG = "" ;
      A463TBM34_DEL_FLG = "" ;
      A469TBM34_UPD_PROG_NM = "" ;
      A468TBM34_UPD_USER_ID = "" ;
      A467TBM34_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A466TBM34_CRT_PROG_NM = "" ;
      A465TBM34_CRT_USER_ID = "" ;
      A464TBM34_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      AV9W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      GXv_SdtA_LOGIN_SDT3 = new SdtA_LOGIN_SDT [1] ;
      AV10W_ERRCD = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV14W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV15W_MSG = "" ;
      GXv_SdtB808_SD01_EXTRA_INFO4 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int5 = new short [1] ;
      AV17W_ERR_MSG = "" ;
      GXv_char2 = new String [1] ;
      GXt_char1 = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b402_pc23_crf_del__default(),
         new Object[] {
             new Object[] {
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
            , new Object[] {
            P00598_A472TBM35_CRF_ID, P00598_A471TBM35_STUDY_ID, P00598_A473TBM35_CRF_ITEM_CD, P00598_A474TBM35_STUDY_AUTH_CD, P00598_A475TBM35_DISPLAY_FLG, P00598_n475TBM35_DISPLAY_FLG, P00598_A476TBM35_DEL_FLG, P00598_n476TBM35_DEL_FLG, P00598_A483TBM35_UPD_CNT, P00598_n483TBM35_UPD_CNT,
            P00598_A482TBM35_UPD_PROG_NM, P00598_n482TBM35_UPD_PROG_NM, P00598_A481TBM35_UPD_USER_ID, P00598_n481TBM35_UPD_USER_ID, P00598_A480TBM35_UPD_DATETIME, P00598_n480TBM35_UPD_DATETIME, P00598_A479TBM35_CRT_PROG_NM, P00598_n479TBM35_CRT_PROG_NM, P00598_A478TBM35_CRT_USER_ID, P00598_n478TBM35_CRT_USER_ID,
            P00598_A477TBM35_CRT_DATETIME, P00598_n477TBM35_CRT_DATETIME
            }
            , new Object[] {
            }
            , new Object[] {
            P005910_A260TBM41_CRF_ID, P005910_A259TBM41_STUDY_ID, P005910_A378TBM41_CRF_ITEM_GRP_DIV, P005910_A261TBM41_CRF_ITEM_GRP_CD, P005910_A262TBM41_NCM_METADATA_ID, P005910_n262TBM41_NCM_METADATA_ID, P005910_A263TBM41_DEL_FLG, P005910_n263TBM41_DEL_FLG, P005910_A270TBM41_UPD_CNT, P005910_n270TBM41_UPD_CNT,
            P005910_A269TBM41_UPD_PROG_NM, P005910_n269TBM41_UPD_PROG_NM, P005910_A268TBM41_UPD_USER_ID, P005910_n268TBM41_UPD_USER_ID, P005910_A267TBM41_UPD_DATETIME, P005910_n267TBM41_UPD_DATETIME, P005910_A266TBM41_CRT_PROG_NM, P005910_n266TBM41_CRT_PROG_NM, P005910_A265TBM41_CRT_USER_ID, P005910_n265TBM41_CRT_USER_ID,
            P005910_A264TBM41_CRT_DATETIME, P005910_n264TBM41_CRT_DATETIME
            }
            , new Object[] {
            }
            , new Object[] {
            P005912_A272TBM37_CRF_ID, P005912_A271TBM37_STUDY_ID, P005912_A372TBM37_CRF_ITEM_GRP_DIV, P005912_A273TBM37_CRF_ITEM_GRP_CD, P005912_A373TBM37_VISIT_NO, P005912_n373TBM37_VISIT_NO, P005912_A374TBM37_DOM_CD, P005912_n374TBM37_DOM_CD, P005912_A375TBM37_DOM_VAR_NM, P005912_n375TBM37_DOM_VAR_NM,
            P005912_A376TBM37_DOM_ITM_GRP_OID, P005912_n376TBM37_DOM_ITM_GRP_OID, P005912_A377TBM37_DOM_ITM_GRP_ATTR_SEQ, P005912_n377TBM37_DOM_ITM_GRP_ATTR_SEQ, P005912_A612TBM37_DOM_ITM_GRP_ROWNO, P005912_n612TBM37_DOM_ITM_GRP_ROWNO, P005912_A274TBM37_DEL_FLG, P005912_n274TBM37_DEL_FLG, P005912_A281TBM37_UPD_CNT, P005912_n281TBM37_UPD_CNT,
            P005912_A280TBM37_UPD_PROG_NM, P005912_n280TBM37_UPD_PROG_NM, P005912_A279TBM37_UPD_USER_ID, P005912_n279TBM37_UPD_USER_ID, P005912_A278TBM37_UPD_DATETIME, P005912_n278TBM37_UPD_DATETIME, P005912_A277TBM37_CRT_PROG_NM, P005912_n277TBM37_CRT_PROG_NM, P005912_A276TBM37_CRT_USER_ID, P005912_n276TBM37_CRT_USER_ID,
            P005912_A275TBM37_CRT_DATETIME, P005912_n275TBM37_CRT_DATETIME
            }
            , new Object[] {
            }
            , new Object[] {
            P005914_A487TBM36_SELECT_CRF_ID, P005914_A484TBM36_STUDY_ID, P005914_A485TBM36_CRF_ID, P005914_A486TBM36_COND_NO, P005914_A488TBM36_DEL_FLG, P005914_n488TBM36_DEL_FLG, P005914_A495TBM36_UPD_CNT, P005914_n495TBM36_UPD_CNT, P005914_A494TBM36_UPD_PROG_NM, P005914_n494TBM36_UPD_PROG_NM,
            P005914_A493TBM36_UPD_USER_ID, P005914_n493TBM36_UPD_USER_ID, P005914_A492TBM36_UPD_DATETIME, P005914_n492TBM36_UPD_DATETIME, P005914_A491TBM36_CRT_PROG_NM, P005914_n491TBM36_CRT_PROG_NM, P005914_A490TBM36_CRT_USER_ID, P005914_n490TBM36_CRT_USER_ID, P005914_A489TBM36_CRT_DATETIME, P005914_n489TBM36_CRT_DATETIME
            }
            , new Object[] {
            }
            , new Object[] {
            P005916_A247TBM33_CRF_ID, P005916_A246TBM33_STUDY_ID, P005916_A248TBM33_COND_NO, P005916_A379TBM33_COND_NM, P005916_n379TBM33_COND_NM, P005916_A249TBM33_EXPRESSION, P005916_n249TBM33_EXPRESSION, P005916_A380TBM33_COND_DIV, P005916_n380TBM33_COND_DIV, P005916_A381TBM33_CRF_ITEM_CD,
            P005916_n381TBM33_CRF_ITEM_CD, P005916_A250TBM33_PRIOR_NO, P005916_n250TBM33_PRIOR_NO, P005916_A382TBM33_ERR_DIV, P005916_n382TBM33_ERR_DIV, P005916_A383TBM33_ERR_MSG, P005916_n383TBM33_ERR_MSG, P005916_A554TBM33_ENABLED_FLG, P005916_n554TBM33_ENABLED_FLG, P005916_A610TBM33_REQUIRED_INPUT_FLG,
            P005916_n610TBM33_REQUIRED_INPUT_FLG, P005916_A611TBM33_NUMERIC_RANGE_FLG, P005916_n611TBM33_NUMERIC_RANGE_FLG, P005916_A251TBM33_DEL_FLG, P005916_n251TBM33_DEL_FLG, P005916_A258TBM33_UPD_CNT, P005916_n258TBM33_UPD_CNT, P005916_A257TBM33_UPD_PROG_NM, P005916_n257TBM33_UPD_PROG_NM, P005916_A256TBM33_UPD_USER_ID,
            P005916_n256TBM33_UPD_USER_ID, P005916_A255TBM33_UPD_DATETIME, P005916_n255TBM33_UPD_DATETIME, P005916_A254TBM33_CRT_PROG_NM, P005916_n254TBM33_CRT_PROG_NM, P005916_A253TBM33_CRT_USER_ID, P005916_n253TBM33_CRT_USER_ID, P005916_A252TBM33_CRT_DATETIME, P005916_n252TBM33_CRT_DATETIME
            }
            , new Object[] {
            }
            , new Object[] {
            P005918_A232TBM32_CRF_ID, P005918_A231TBM32_STUDY_ID, P005918_A233TBM32_CRF_ITEM_CD, P005918_A234TBM32_CRF_ITEM_NM, P005918_n234TBM32_CRF_ITEM_NM, P005918_A235TBM32_CRF_ITEM_DIV, P005918_n235TBM32_CRF_ITEM_DIV, P005918_A236TBM32_CRF_ITEM_GRP_CD, P005918_n236TBM32_CRF_ITEM_GRP_CD, P005918_A384TBM32_CRF_ITEM_GRP_ORDER,
            P005918_n384TBM32_CRF_ITEM_GRP_ORDER, P005918_A385TBM32_LOCATION_X, P005918_n385TBM32_LOCATION_X, P005918_A386TBM32_LOCATION_Y, P005918_n386TBM32_LOCATION_Y, P005918_A387TBM32_LOCATION_X2, P005918_n387TBM32_LOCATION_X2, P005918_A388TBM32_LOCATION_Y2, P005918_n388TBM32_LOCATION_Y2, P005918_A389TBM32_TEXT_ALIGN_DIV,
            P005918_n389TBM32_TEXT_ALIGN_DIV, P005918_A393TBM32_TEXT_MAXROWS, P005918_n393TBM32_TEXT_MAXROWS, P005918_A394TBM32_TEXT_MAXLENGTH, P005918_n394TBM32_TEXT_MAXLENGTH, P005918_A395TBM32_DECIMAL_DIGITS, P005918_n395TBM32_DECIMAL_DIGITS, P005918_A399TBM32_CHK_TRUE_INNER_VALUE, P005918_n399TBM32_CHK_TRUE_INNER_VALUE, P005918_A400TBM32_CHK_FALSE_INNER_VALUE,
            P005918_n400TBM32_CHK_FALSE_INNER_VALUE, P005918_A404TBM32_FIXED_VALUE, P005918_n404TBM32_FIXED_VALUE, P005918_A402TBM32_LIST_CD, P005918_n402TBM32_LIST_CD, P005918_A403TBM32_IMAGE_CD, P005918_n403TBM32_IMAGE_CD, P005918_A401TBM32_TEXT, P005918_n401TBM32_TEXT, P005918_A390TBM32_FONT_SIZE,
            P005918_n390TBM32_FONT_SIZE, P005918_A391TBM32_FONT_UL_FLG, P005918_n391TBM32_FONT_UL_FLG, P005918_A392TBM32_FONT_COLOR_DIV, P005918_n392TBM32_FONT_COLOR_DIV, P005918_A398TBM32_LINE_SIZE_DIV, P005918_n398TBM32_LINE_SIZE_DIV, P005918_A603TBM32_LINE_COLOR_DIV, P005918_n603TBM32_LINE_COLOR_DIV, P005918_A396TBM32_LINE_START_POINT_DIV,
            P005918_n396TBM32_LINE_START_POINT_DIV, P005918_A397TBM32_LINE_END_POINT_DIV, P005918_n397TBM32_LINE_END_POINT_DIV, P005918_A604TBM32_LINE_ANGLE, P005918_n604TBM32_LINE_ANGLE, P005918_A552TBM32_AUTH_LVL_MIN, P005918_n552TBM32_AUTH_LVL_MIN, P005918_A553TBM32_ZORDER, P005918_n553TBM32_ZORDER, P005918_A605TBM32_TAB_ORDER,
            P005918_n605TBM32_TAB_ORDER, P005918_A606TBM32_TABSTOP_FLG, P005918_n606TBM32_TABSTOP_FLG, P005918_A607TBM32_REQUIRED_INPUT_FLG, P005918_n607TBM32_REQUIRED_INPUT_FLG, P005918_A608TBM32_MIN_VALUE, P005918_n608TBM32_MIN_VALUE, P005918_A609TBM32_MAX_VALUE, P005918_n609TBM32_MAX_VALUE, P005918_A237TBM32_CRF_ITEM_NOTE,
            P005918_n237TBM32_CRF_ITEM_NOTE, P005918_A746TBM32_REF_CRF_ID, P005918_n746TBM32_REF_CRF_ID, P005918_A747TBM32_REF_CRF_ITEM_CD, P005918_n747TBM32_REF_CRF_ITEM_CD, P005918_A238TBM32_DEL_FLG, P005918_n238TBM32_DEL_FLG, P005918_A245TBM32_UPD_CNT, P005918_n245TBM32_UPD_CNT, P005918_A244TBM32_UPD_PROG_NM,
            P005918_n244TBM32_UPD_PROG_NM, P005918_A243TBM32_UPD_USER_ID, P005918_n243TBM32_UPD_USER_ID, P005918_A242TBM32_UPD_DATETIME, P005918_n242TBM32_UPD_DATETIME, P005918_A241TBM32_CRT_PROG_NM, P005918_n241TBM32_CRT_PROG_NM, P005918_A240TBM32_CRT_USER_ID, P005918_n240TBM32_CRT_USER_ID, P005918_A239TBM32_CRT_DATETIME,
            P005918_n239TBM32_CRT_DATETIME
            }
            , new Object[] {
            }
            , new Object[] {
            P005920_A460TBM34_CRF_ID, P005920_A459TBM34_STUDY_ID, P005920_A461TBM34_STYDY_AUTH_CD, P005920_A462TBM34_DISPLAY_FLG, P005920_n462TBM34_DISPLAY_FLG, P005920_A463TBM34_DEL_FLG, P005920_n463TBM34_DEL_FLG, P005920_A470TBM34_UPD_CNT, P005920_n470TBM34_UPD_CNT, P005920_A469TBM34_UPD_PROG_NM,
            P005920_n469TBM34_UPD_PROG_NM, P005920_A468TBM34_UPD_USER_ID, P005920_n468TBM34_UPD_USER_ID, P005920_A467TBM34_UPD_DATETIME, P005920_n467TBM34_UPD_DATETIME, P005920_A466TBM34_CRT_PROG_NM, P005920_n466TBM34_CRT_PROG_NM, P005920_A465TBM34_CRT_USER_ID, P005920_n465TBM34_CRT_USER_ID, P005920_A464TBM34_CRT_DATETIME,
            P005920_n464TBM34_CRT_DATETIME
            }
            , new Object[] {
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV28Pgmname = "B402_PC23_CRF_DEL" ;
      /* GeneXus formulas. */
      AV28Pgmname = "B402_PC23_CRF_DEL" ;
      Gx_err = (short)(0) ;
   }

   private byte A250TBM33_PRIOR_NO ;
   private byte A393TBM32_TEXT_MAXROWS ;
   private byte A395TBM32_DECIMAL_DIGITS ;
   private byte A390TBM32_FONT_SIZE ;
   private byte A398TBM32_LINE_SIZE_DIV ;
   private byte A552TBM32_AUTH_LVL_MIN ;
   private short AV12W_RTN_CD ;
   private short A472TBM35_CRF_ID ;
   private short A260TBM41_CRF_ID ;
   private short A272TBM37_CRF_ID ;
   private short A373TBM37_VISIT_NO ;
   private short A377TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private short A612TBM37_DOM_ITM_GRP_ROWNO ;
   private short A487TBM36_SELECT_CRF_ID ;
   private short A485TBM36_CRF_ID ;
   private short A486TBM36_COND_NO ;
   private short A247TBM33_CRF_ID ;
   private short A248TBM33_COND_NO ;
   private short A232TBM32_CRF_ID ;
   private short A384TBM32_CRF_ITEM_GRP_ORDER ;
   private short A385TBM32_LOCATION_X ;
   private short A386TBM32_LOCATION_Y ;
   private short A387TBM32_LOCATION_X2 ;
   private short A388TBM32_LOCATION_Y2 ;
   private short A394TBM32_TEXT_MAXLENGTH ;
   private short A604TBM32_LINE_ANGLE ;
   private short A553TBM32_ZORDER ;
   private short A605TBM32_TAB_ORDER ;
   private short A746TBM32_REF_CRF_ID ;
   private short A460TBM34_CRF_ID ;
   private short AV16W_ERR_CD ;
   private short GXv_int5[] ;
   private short Gx_err ;
   private int GXActiveErrHndl ;
   private long A471TBM35_STUDY_ID ;
   private long A483TBM35_UPD_CNT ;
   private long A259TBM41_STUDY_ID ;
   private long A270TBM41_UPD_CNT ;
   private long A271TBM37_STUDY_ID ;
   private long A281TBM37_UPD_CNT ;
   private long A484TBM36_STUDY_ID ;
   private long A495TBM36_UPD_CNT ;
   private long A246TBM33_STUDY_ID ;
   private long A258TBM33_UPD_CNT ;
   private long A231TBM32_STUDY_ID ;
   private long A392TBM32_FONT_COLOR_DIV ;
   private long A603TBM32_LINE_COLOR_DIV ;
   private long A245TBM32_UPD_CNT ;
   private long A459TBM34_STUDY_ID ;
   private long A470TBM34_UPD_CNT ;
   private String Gx_ope ;
   private String Gx_etb ;
   private String scmdbuf ;
   private String AV28Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String GXv_char2[] ;
   private String GXt_char1 ;
   private String Gx_emsg ;
   private java.util.Date A480TBM35_UPD_DATETIME ;
   private java.util.Date A477TBM35_CRT_DATETIME ;
   private java.util.Date A267TBM41_UPD_DATETIME ;
   private java.util.Date A264TBM41_CRT_DATETIME ;
   private java.util.Date A278TBM37_UPD_DATETIME ;
   private java.util.Date A275TBM37_CRT_DATETIME ;
   private java.util.Date A492TBM36_UPD_DATETIME ;
   private java.util.Date A489TBM36_CRT_DATETIME ;
   private java.util.Date A255TBM33_UPD_DATETIME ;
   private java.util.Date A252TBM33_CRT_DATETIME ;
   private java.util.Date A242TBM32_UPD_DATETIME ;
   private java.util.Date A239TBM32_CRT_DATETIME ;
   private java.util.Date A467TBM34_UPD_DATETIME ;
   private java.util.Date A464TBM34_CRT_DATETIME ;
   private boolean returnInSub ;
   private boolean n475TBM35_DISPLAY_FLG ;
   private boolean n476TBM35_DEL_FLG ;
   private boolean n483TBM35_UPD_CNT ;
   private boolean n482TBM35_UPD_PROG_NM ;
   private boolean n481TBM35_UPD_USER_ID ;
   private boolean n480TBM35_UPD_DATETIME ;
   private boolean n479TBM35_CRT_PROG_NM ;
   private boolean n478TBM35_CRT_USER_ID ;
   private boolean n477TBM35_CRT_DATETIME ;
   private boolean n262TBM41_NCM_METADATA_ID ;
   private boolean n263TBM41_DEL_FLG ;
   private boolean n270TBM41_UPD_CNT ;
   private boolean n269TBM41_UPD_PROG_NM ;
   private boolean n268TBM41_UPD_USER_ID ;
   private boolean n267TBM41_UPD_DATETIME ;
   private boolean n266TBM41_CRT_PROG_NM ;
   private boolean n265TBM41_CRT_USER_ID ;
   private boolean n264TBM41_CRT_DATETIME ;
   private boolean n373TBM37_VISIT_NO ;
   private boolean n374TBM37_DOM_CD ;
   private boolean n375TBM37_DOM_VAR_NM ;
   private boolean n376TBM37_DOM_ITM_GRP_OID ;
   private boolean n377TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private boolean n612TBM37_DOM_ITM_GRP_ROWNO ;
   private boolean n274TBM37_DEL_FLG ;
   private boolean n281TBM37_UPD_CNT ;
   private boolean n280TBM37_UPD_PROG_NM ;
   private boolean n279TBM37_UPD_USER_ID ;
   private boolean n278TBM37_UPD_DATETIME ;
   private boolean n277TBM37_CRT_PROG_NM ;
   private boolean n276TBM37_CRT_USER_ID ;
   private boolean n275TBM37_CRT_DATETIME ;
   private boolean n488TBM36_DEL_FLG ;
   private boolean n495TBM36_UPD_CNT ;
   private boolean n494TBM36_UPD_PROG_NM ;
   private boolean n493TBM36_UPD_USER_ID ;
   private boolean n492TBM36_UPD_DATETIME ;
   private boolean n491TBM36_CRT_PROG_NM ;
   private boolean n490TBM36_CRT_USER_ID ;
   private boolean n489TBM36_CRT_DATETIME ;
   private boolean n379TBM33_COND_NM ;
   private boolean n249TBM33_EXPRESSION ;
   private boolean n380TBM33_COND_DIV ;
   private boolean n381TBM33_CRF_ITEM_CD ;
   private boolean n250TBM33_PRIOR_NO ;
   private boolean n382TBM33_ERR_DIV ;
   private boolean n383TBM33_ERR_MSG ;
   private boolean n554TBM33_ENABLED_FLG ;
   private boolean n610TBM33_REQUIRED_INPUT_FLG ;
   private boolean n611TBM33_NUMERIC_RANGE_FLG ;
   private boolean n251TBM33_DEL_FLG ;
   private boolean n258TBM33_UPD_CNT ;
   private boolean n257TBM33_UPD_PROG_NM ;
   private boolean n256TBM33_UPD_USER_ID ;
   private boolean n255TBM33_UPD_DATETIME ;
   private boolean n254TBM33_CRT_PROG_NM ;
   private boolean n253TBM33_CRT_USER_ID ;
   private boolean n252TBM33_CRT_DATETIME ;
   private boolean n234TBM32_CRF_ITEM_NM ;
   private boolean n235TBM32_CRF_ITEM_DIV ;
   private boolean n236TBM32_CRF_ITEM_GRP_CD ;
   private boolean n384TBM32_CRF_ITEM_GRP_ORDER ;
   private boolean n385TBM32_LOCATION_X ;
   private boolean n386TBM32_LOCATION_Y ;
   private boolean n387TBM32_LOCATION_X2 ;
   private boolean n388TBM32_LOCATION_Y2 ;
   private boolean n389TBM32_TEXT_ALIGN_DIV ;
   private boolean n393TBM32_TEXT_MAXROWS ;
   private boolean n394TBM32_TEXT_MAXLENGTH ;
   private boolean n395TBM32_DECIMAL_DIGITS ;
   private boolean n399TBM32_CHK_TRUE_INNER_VALUE ;
   private boolean n400TBM32_CHK_FALSE_INNER_VALUE ;
   private boolean n404TBM32_FIXED_VALUE ;
   private boolean n402TBM32_LIST_CD ;
   private boolean n403TBM32_IMAGE_CD ;
   private boolean n401TBM32_TEXT ;
   private boolean n390TBM32_FONT_SIZE ;
   private boolean n391TBM32_FONT_UL_FLG ;
   private boolean n392TBM32_FONT_COLOR_DIV ;
   private boolean n398TBM32_LINE_SIZE_DIV ;
   private boolean n603TBM32_LINE_COLOR_DIV ;
   private boolean n396TBM32_LINE_START_POINT_DIV ;
   private boolean n397TBM32_LINE_END_POINT_DIV ;
   private boolean n604TBM32_LINE_ANGLE ;
   private boolean n552TBM32_AUTH_LVL_MIN ;
   private boolean n553TBM32_ZORDER ;
   private boolean n605TBM32_TAB_ORDER ;
   private boolean n606TBM32_TABSTOP_FLG ;
   private boolean n607TBM32_REQUIRED_INPUT_FLG ;
   private boolean n608TBM32_MIN_VALUE ;
   private boolean n609TBM32_MAX_VALUE ;
   private boolean n237TBM32_CRF_ITEM_NOTE ;
   private boolean n746TBM32_REF_CRF_ID ;
   private boolean n747TBM32_REF_CRF_ITEM_CD ;
   private boolean n238TBM32_DEL_FLG ;
   private boolean n245TBM32_UPD_CNT ;
   private boolean n244TBM32_UPD_PROG_NM ;
   private boolean n243TBM32_UPD_USER_ID ;
   private boolean n242TBM32_UPD_DATETIME ;
   private boolean n241TBM32_CRT_PROG_NM ;
   private boolean n240TBM32_CRT_USER_ID ;
   private boolean n239TBM32_CRT_DATETIME ;
   private boolean n462TBM34_DISPLAY_FLG ;
   private boolean n463TBM34_DEL_FLG ;
   private boolean n470TBM34_UPD_CNT ;
   private boolean n469TBM34_UPD_PROG_NM ;
   private boolean n468TBM34_UPD_USER_ID ;
   private boolean n467TBM34_UPD_DATETIME ;
   private boolean n466TBM34_CRT_PROG_NM ;
   private boolean n465TBM34_CRT_USER_ID ;
   private boolean n464TBM34_CRT_DATETIME ;
   private String AV13W_RTN_MSG ;
   private String AV8C_APP_ID ;
   private String A473TBM35_CRF_ITEM_CD ;
   private String A474TBM35_STUDY_AUTH_CD ;
   private String A475TBM35_DISPLAY_FLG ;
   private String A476TBM35_DEL_FLG ;
   private String A482TBM35_UPD_PROG_NM ;
   private String A481TBM35_UPD_USER_ID ;
   private String A479TBM35_CRT_PROG_NM ;
   private String A478TBM35_CRT_USER_ID ;
   private String A378TBM41_CRF_ITEM_GRP_DIV ;
   private String A261TBM41_CRF_ITEM_GRP_CD ;
   private String A262TBM41_NCM_METADATA_ID ;
   private String A263TBM41_DEL_FLG ;
   private String A269TBM41_UPD_PROG_NM ;
   private String A268TBM41_UPD_USER_ID ;
   private String A266TBM41_CRT_PROG_NM ;
   private String A265TBM41_CRT_USER_ID ;
   private String A372TBM37_CRF_ITEM_GRP_DIV ;
   private String A273TBM37_CRF_ITEM_GRP_CD ;
   private String A374TBM37_DOM_CD ;
   private String A375TBM37_DOM_VAR_NM ;
   private String A376TBM37_DOM_ITM_GRP_OID ;
   private String A274TBM37_DEL_FLG ;
   private String A280TBM37_UPD_PROG_NM ;
   private String A279TBM37_UPD_USER_ID ;
   private String A277TBM37_CRT_PROG_NM ;
   private String A276TBM37_CRT_USER_ID ;
   private String A488TBM36_DEL_FLG ;
   private String A494TBM36_UPD_PROG_NM ;
   private String A493TBM36_UPD_USER_ID ;
   private String A491TBM36_CRT_PROG_NM ;
   private String A490TBM36_CRT_USER_ID ;
   private String A379TBM33_COND_NM ;
   private String A249TBM33_EXPRESSION ;
   private String A380TBM33_COND_DIV ;
   private String A381TBM33_CRF_ITEM_CD ;
   private String A382TBM33_ERR_DIV ;
   private String A383TBM33_ERR_MSG ;
   private String A554TBM33_ENABLED_FLG ;
   private String A610TBM33_REQUIRED_INPUT_FLG ;
   private String A611TBM33_NUMERIC_RANGE_FLG ;
   private String A251TBM33_DEL_FLG ;
   private String A257TBM33_UPD_PROG_NM ;
   private String A256TBM33_UPD_USER_ID ;
   private String A254TBM33_CRT_PROG_NM ;
   private String A253TBM33_CRT_USER_ID ;
   private String A233TBM32_CRF_ITEM_CD ;
   private String A234TBM32_CRF_ITEM_NM ;
   private String A235TBM32_CRF_ITEM_DIV ;
   private String A236TBM32_CRF_ITEM_GRP_CD ;
   private String A389TBM32_TEXT_ALIGN_DIV ;
   private String A399TBM32_CHK_TRUE_INNER_VALUE ;
   private String A400TBM32_CHK_FALSE_INNER_VALUE ;
   private String A404TBM32_FIXED_VALUE ;
   private String A402TBM32_LIST_CD ;
   private String A403TBM32_IMAGE_CD ;
   private String A401TBM32_TEXT ;
   private String A391TBM32_FONT_UL_FLG ;
   private String A396TBM32_LINE_START_POINT_DIV ;
   private String A397TBM32_LINE_END_POINT_DIV ;
   private String A606TBM32_TABSTOP_FLG ;
   private String A607TBM32_REQUIRED_INPUT_FLG ;
   private String A608TBM32_MIN_VALUE ;
   private String A609TBM32_MAX_VALUE ;
   private String A237TBM32_CRF_ITEM_NOTE ;
   private String A747TBM32_REF_CRF_ITEM_CD ;
   private String A238TBM32_DEL_FLG ;
   private String A244TBM32_UPD_PROG_NM ;
   private String A243TBM32_UPD_USER_ID ;
   private String A241TBM32_CRT_PROG_NM ;
   private String A240TBM32_CRT_USER_ID ;
   private String A461TBM34_STYDY_AUTH_CD ;
   private String A462TBM34_DISPLAY_FLG ;
   private String A463TBM34_DEL_FLG ;
   private String A469TBM34_UPD_PROG_NM ;
   private String A468TBM34_UPD_USER_ID ;
   private String A466TBM34_CRT_PROG_NM ;
   private String A465TBM34_CRT_USER_ID ;
   private String AV10W_ERRCD ;
   private String AV15W_MSG ;
   private String AV17W_ERR_MSG ;
   private short[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private short[] P00598_A472TBM35_CRF_ID ;
   private long[] P00598_A471TBM35_STUDY_ID ;
   private String[] P00598_A473TBM35_CRF_ITEM_CD ;
   private String[] P00598_A474TBM35_STUDY_AUTH_CD ;
   private String[] P00598_A475TBM35_DISPLAY_FLG ;
   private boolean[] P00598_n475TBM35_DISPLAY_FLG ;
   private String[] P00598_A476TBM35_DEL_FLG ;
   private boolean[] P00598_n476TBM35_DEL_FLG ;
   private long[] P00598_A483TBM35_UPD_CNT ;
   private boolean[] P00598_n483TBM35_UPD_CNT ;
   private String[] P00598_A482TBM35_UPD_PROG_NM ;
   private boolean[] P00598_n482TBM35_UPD_PROG_NM ;
   private String[] P00598_A481TBM35_UPD_USER_ID ;
   private boolean[] P00598_n481TBM35_UPD_USER_ID ;
   private java.util.Date[] P00598_A480TBM35_UPD_DATETIME ;
   private boolean[] P00598_n480TBM35_UPD_DATETIME ;
   private String[] P00598_A479TBM35_CRT_PROG_NM ;
   private boolean[] P00598_n479TBM35_CRT_PROG_NM ;
   private String[] P00598_A478TBM35_CRT_USER_ID ;
   private boolean[] P00598_n478TBM35_CRT_USER_ID ;
   private java.util.Date[] P00598_A477TBM35_CRT_DATETIME ;
   private boolean[] P00598_n477TBM35_CRT_DATETIME ;
   private short[] P005910_A260TBM41_CRF_ID ;
   private long[] P005910_A259TBM41_STUDY_ID ;
   private String[] P005910_A378TBM41_CRF_ITEM_GRP_DIV ;
   private String[] P005910_A261TBM41_CRF_ITEM_GRP_CD ;
   private String[] P005910_A262TBM41_NCM_METADATA_ID ;
   private boolean[] P005910_n262TBM41_NCM_METADATA_ID ;
   private String[] P005910_A263TBM41_DEL_FLG ;
   private boolean[] P005910_n263TBM41_DEL_FLG ;
   private long[] P005910_A270TBM41_UPD_CNT ;
   private boolean[] P005910_n270TBM41_UPD_CNT ;
   private String[] P005910_A269TBM41_UPD_PROG_NM ;
   private boolean[] P005910_n269TBM41_UPD_PROG_NM ;
   private String[] P005910_A268TBM41_UPD_USER_ID ;
   private boolean[] P005910_n268TBM41_UPD_USER_ID ;
   private java.util.Date[] P005910_A267TBM41_UPD_DATETIME ;
   private boolean[] P005910_n267TBM41_UPD_DATETIME ;
   private String[] P005910_A266TBM41_CRT_PROG_NM ;
   private boolean[] P005910_n266TBM41_CRT_PROG_NM ;
   private String[] P005910_A265TBM41_CRT_USER_ID ;
   private boolean[] P005910_n265TBM41_CRT_USER_ID ;
   private java.util.Date[] P005910_A264TBM41_CRT_DATETIME ;
   private boolean[] P005910_n264TBM41_CRT_DATETIME ;
   private short[] P005912_A272TBM37_CRF_ID ;
   private long[] P005912_A271TBM37_STUDY_ID ;
   private String[] P005912_A372TBM37_CRF_ITEM_GRP_DIV ;
   private String[] P005912_A273TBM37_CRF_ITEM_GRP_CD ;
   private short[] P005912_A373TBM37_VISIT_NO ;
   private boolean[] P005912_n373TBM37_VISIT_NO ;
   private String[] P005912_A374TBM37_DOM_CD ;
   private boolean[] P005912_n374TBM37_DOM_CD ;
   private String[] P005912_A375TBM37_DOM_VAR_NM ;
   private boolean[] P005912_n375TBM37_DOM_VAR_NM ;
   private String[] P005912_A376TBM37_DOM_ITM_GRP_OID ;
   private boolean[] P005912_n376TBM37_DOM_ITM_GRP_OID ;
   private short[] P005912_A377TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private boolean[] P005912_n377TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private short[] P005912_A612TBM37_DOM_ITM_GRP_ROWNO ;
   private boolean[] P005912_n612TBM37_DOM_ITM_GRP_ROWNO ;
   private String[] P005912_A274TBM37_DEL_FLG ;
   private boolean[] P005912_n274TBM37_DEL_FLG ;
   private long[] P005912_A281TBM37_UPD_CNT ;
   private boolean[] P005912_n281TBM37_UPD_CNT ;
   private String[] P005912_A280TBM37_UPD_PROG_NM ;
   private boolean[] P005912_n280TBM37_UPD_PROG_NM ;
   private String[] P005912_A279TBM37_UPD_USER_ID ;
   private boolean[] P005912_n279TBM37_UPD_USER_ID ;
   private java.util.Date[] P005912_A278TBM37_UPD_DATETIME ;
   private boolean[] P005912_n278TBM37_UPD_DATETIME ;
   private String[] P005912_A277TBM37_CRT_PROG_NM ;
   private boolean[] P005912_n277TBM37_CRT_PROG_NM ;
   private String[] P005912_A276TBM37_CRT_USER_ID ;
   private boolean[] P005912_n276TBM37_CRT_USER_ID ;
   private java.util.Date[] P005912_A275TBM37_CRT_DATETIME ;
   private boolean[] P005912_n275TBM37_CRT_DATETIME ;
   private short[] P005914_A487TBM36_SELECT_CRF_ID ;
   private long[] P005914_A484TBM36_STUDY_ID ;
   private short[] P005914_A485TBM36_CRF_ID ;
   private short[] P005914_A486TBM36_COND_NO ;
   private String[] P005914_A488TBM36_DEL_FLG ;
   private boolean[] P005914_n488TBM36_DEL_FLG ;
   private long[] P005914_A495TBM36_UPD_CNT ;
   private boolean[] P005914_n495TBM36_UPD_CNT ;
   private String[] P005914_A494TBM36_UPD_PROG_NM ;
   private boolean[] P005914_n494TBM36_UPD_PROG_NM ;
   private String[] P005914_A493TBM36_UPD_USER_ID ;
   private boolean[] P005914_n493TBM36_UPD_USER_ID ;
   private java.util.Date[] P005914_A492TBM36_UPD_DATETIME ;
   private boolean[] P005914_n492TBM36_UPD_DATETIME ;
   private String[] P005914_A491TBM36_CRT_PROG_NM ;
   private boolean[] P005914_n491TBM36_CRT_PROG_NM ;
   private String[] P005914_A490TBM36_CRT_USER_ID ;
   private boolean[] P005914_n490TBM36_CRT_USER_ID ;
   private java.util.Date[] P005914_A489TBM36_CRT_DATETIME ;
   private boolean[] P005914_n489TBM36_CRT_DATETIME ;
   private short[] P005916_A247TBM33_CRF_ID ;
   private long[] P005916_A246TBM33_STUDY_ID ;
   private short[] P005916_A248TBM33_COND_NO ;
   private String[] P005916_A379TBM33_COND_NM ;
   private boolean[] P005916_n379TBM33_COND_NM ;
   private String[] P005916_A249TBM33_EXPRESSION ;
   private boolean[] P005916_n249TBM33_EXPRESSION ;
   private String[] P005916_A380TBM33_COND_DIV ;
   private boolean[] P005916_n380TBM33_COND_DIV ;
   private String[] P005916_A381TBM33_CRF_ITEM_CD ;
   private boolean[] P005916_n381TBM33_CRF_ITEM_CD ;
   private byte[] P005916_A250TBM33_PRIOR_NO ;
   private boolean[] P005916_n250TBM33_PRIOR_NO ;
   private String[] P005916_A382TBM33_ERR_DIV ;
   private boolean[] P005916_n382TBM33_ERR_DIV ;
   private String[] P005916_A383TBM33_ERR_MSG ;
   private boolean[] P005916_n383TBM33_ERR_MSG ;
   private String[] P005916_A554TBM33_ENABLED_FLG ;
   private boolean[] P005916_n554TBM33_ENABLED_FLG ;
   private String[] P005916_A610TBM33_REQUIRED_INPUT_FLG ;
   private boolean[] P005916_n610TBM33_REQUIRED_INPUT_FLG ;
   private String[] P005916_A611TBM33_NUMERIC_RANGE_FLG ;
   private boolean[] P005916_n611TBM33_NUMERIC_RANGE_FLG ;
   private String[] P005916_A251TBM33_DEL_FLG ;
   private boolean[] P005916_n251TBM33_DEL_FLG ;
   private long[] P005916_A258TBM33_UPD_CNT ;
   private boolean[] P005916_n258TBM33_UPD_CNT ;
   private String[] P005916_A257TBM33_UPD_PROG_NM ;
   private boolean[] P005916_n257TBM33_UPD_PROG_NM ;
   private String[] P005916_A256TBM33_UPD_USER_ID ;
   private boolean[] P005916_n256TBM33_UPD_USER_ID ;
   private java.util.Date[] P005916_A255TBM33_UPD_DATETIME ;
   private boolean[] P005916_n255TBM33_UPD_DATETIME ;
   private String[] P005916_A254TBM33_CRT_PROG_NM ;
   private boolean[] P005916_n254TBM33_CRT_PROG_NM ;
   private String[] P005916_A253TBM33_CRT_USER_ID ;
   private boolean[] P005916_n253TBM33_CRT_USER_ID ;
   private java.util.Date[] P005916_A252TBM33_CRT_DATETIME ;
   private boolean[] P005916_n252TBM33_CRT_DATETIME ;
   private short[] P005918_A232TBM32_CRF_ID ;
   private long[] P005918_A231TBM32_STUDY_ID ;
   private String[] P005918_A233TBM32_CRF_ITEM_CD ;
   private String[] P005918_A234TBM32_CRF_ITEM_NM ;
   private boolean[] P005918_n234TBM32_CRF_ITEM_NM ;
   private String[] P005918_A235TBM32_CRF_ITEM_DIV ;
   private boolean[] P005918_n235TBM32_CRF_ITEM_DIV ;
   private String[] P005918_A236TBM32_CRF_ITEM_GRP_CD ;
   private boolean[] P005918_n236TBM32_CRF_ITEM_GRP_CD ;
   private short[] P005918_A384TBM32_CRF_ITEM_GRP_ORDER ;
   private boolean[] P005918_n384TBM32_CRF_ITEM_GRP_ORDER ;
   private short[] P005918_A385TBM32_LOCATION_X ;
   private boolean[] P005918_n385TBM32_LOCATION_X ;
   private short[] P005918_A386TBM32_LOCATION_Y ;
   private boolean[] P005918_n386TBM32_LOCATION_Y ;
   private short[] P005918_A387TBM32_LOCATION_X2 ;
   private boolean[] P005918_n387TBM32_LOCATION_X2 ;
   private short[] P005918_A388TBM32_LOCATION_Y2 ;
   private boolean[] P005918_n388TBM32_LOCATION_Y2 ;
   private String[] P005918_A389TBM32_TEXT_ALIGN_DIV ;
   private boolean[] P005918_n389TBM32_TEXT_ALIGN_DIV ;
   private byte[] P005918_A393TBM32_TEXT_MAXROWS ;
   private boolean[] P005918_n393TBM32_TEXT_MAXROWS ;
   private short[] P005918_A394TBM32_TEXT_MAXLENGTH ;
   private boolean[] P005918_n394TBM32_TEXT_MAXLENGTH ;
   private byte[] P005918_A395TBM32_DECIMAL_DIGITS ;
   private boolean[] P005918_n395TBM32_DECIMAL_DIGITS ;
   private String[] P005918_A399TBM32_CHK_TRUE_INNER_VALUE ;
   private boolean[] P005918_n399TBM32_CHK_TRUE_INNER_VALUE ;
   private String[] P005918_A400TBM32_CHK_FALSE_INNER_VALUE ;
   private boolean[] P005918_n400TBM32_CHK_FALSE_INNER_VALUE ;
   private String[] P005918_A404TBM32_FIXED_VALUE ;
   private boolean[] P005918_n404TBM32_FIXED_VALUE ;
   private String[] P005918_A402TBM32_LIST_CD ;
   private boolean[] P005918_n402TBM32_LIST_CD ;
   private String[] P005918_A403TBM32_IMAGE_CD ;
   private boolean[] P005918_n403TBM32_IMAGE_CD ;
   private String[] P005918_A401TBM32_TEXT ;
   private boolean[] P005918_n401TBM32_TEXT ;
   private byte[] P005918_A390TBM32_FONT_SIZE ;
   private boolean[] P005918_n390TBM32_FONT_SIZE ;
   private String[] P005918_A391TBM32_FONT_UL_FLG ;
   private boolean[] P005918_n391TBM32_FONT_UL_FLG ;
   private long[] P005918_A392TBM32_FONT_COLOR_DIV ;
   private boolean[] P005918_n392TBM32_FONT_COLOR_DIV ;
   private byte[] P005918_A398TBM32_LINE_SIZE_DIV ;
   private boolean[] P005918_n398TBM32_LINE_SIZE_DIV ;
   private long[] P005918_A603TBM32_LINE_COLOR_DIV ;
   private boolean[] P005918_n603TBM32_LINE_COLOR_DIV ;
   private String[] P005918_A396TBM32_LINE_START_POINT_DIV ;
   private boolean[] P005918_n396TBM32_LINE_START_POINT_DIV ;
   private String[] P005918_A397TBM32_LINE_END_POINT_DIV ;
   private boolean[] P005918_n397TBM32_LINE_END_POINT_DIV ;
   private short[] P005918_A604TBM32_LINE_ANGLE ;
   private boolean[] P005918_n604TBM32_LINE_ANGLE ;
   private byte[] P005918_A552TBM32_AUTH_LVL_MIN ;
   private boolean[] P005918_n552TBM32_AUTH_LVL_MIN ;
   private short[] P005918_A553TBM32_ZORDER ;
   private boolean[] P005918_n553TBM32_ZORDER ;
   private short[] P005918_A605TBM32_TAB_ORDER ;
   private boolean[] P005918_n605TBM32_TAB_ORDER ;
   private String[] P005918_A606TBM32_TABSTOP_FLG ;
   private boolean[] P005918_n606TBM32_TABSTOP_FLG ;
   private String[] P005918_A607TBM32_REQUIRED_INPUT_FLG ;
   private boolean[] P005918_n607TBM32_REQUIRED_INPUT_FLG ;
   private String[] P005918_A608TBM32_MIN_VALUE ;
   private boolean[] P005918_n608TBM32_MIN_VALUE ;
   private String[] P005918_A609TBM32_MAX_VALUE ;
   private boolean[] P005918_n609TBM32_MAX_VALUE ;
   private String[] P005918_A237TBM32_CRF_ITEM_NOTE ;
   private boolean[] P005918_n237TBM32_CRF_ITEM_NOTE ;
   private short[] P005918_A746TBM32_REF_CRF_ID ;
   private boolean[] P005918_n746TBM32_REF_CRF_ID ;
   private String[] P005918_A747TBM32_REF_CRF_ITEM_CD ;
   private boolean[] P005918_n747TBM32_REF_CRF_ITEM_CD ;
   private String[] P005918_A238TBM32_DEL_FLG ;
   private boolean[] P005918_n238TBM32_DEL_FLG ;
   private long[] P005918_A245TBM32_UPD_CNT ;
   private boolean[] P005918_n245TBM32_UPD_CNT ;
   private String[] P005918_A244TBM32_UPD_PROG_NM ;
   private boolean[] P005918_n244TBM32_UPD_PROG_NM ;
   private String[] P005918_A243TBM32_UPD_USER_ID ;
   private boolean[] P005918_n243TBM32_UPD_USER_ID ;
   private java.util.Date[] P005918_A242TBM32_UPD_DATETIME ;
   private boolean[] P005918_n242TBM32_UPD_DATETIME ;
   private String[] P005918_A241TBM32_CRT_PROG_NM ;
   private boolean[] P005918_n241TBM32_CRT_PROG_NM ;
   private String[] P005918_A240TBM32_CRT_USER_ID ;
   private boolean[] P005918_n240TBM32_CRT_USER_ID ;
   private java.util.Date[] P005918_A239TBM32_CRT_DATETIME ;
   private boolean[] P005918_n239TBM32_CRT_DATETIME ;
   private short[] P005920_A460TBM34_CRF_ID ;
   private long[] P005920_A459TBM34_STUDY_ID ;
   private String[] P005920_A461TBM34_STYDY_AUTH_CD ;
   private String[] P005920_A462TBM34_DISPLAY_FLG ;
   private boolean[] P005920_n462TBM34_DISPLAY_FLG ;
   private String[] P005920_A463TBM34_DEL_FLG ;
   private boolean[] P005920_n463TBM34_DEL_FLG ;
   private long[] P005920_A470TBM34_UPD_CNT ;
   private boolean[] P005920_n470TBM34_UPD_CNT ;
   private String[] P005920_A469TBM34_UPD_PROG_NM ;
   private boolean[] P005920_n469TBM34_UPD_PROG_NM ;
   private String[] P005920_A468TBM34_UPD_USER_ID ;
   private boolean[] P005920_n468TBM34_UPD_USER_ID ;
   private java.util.Date[] P005920_A467TBM34_UPD_DATETIME ;
   private boolean[] P005920_n467TBM34_UPD_DATETIME ;
   private String[] P005920_A466TBM34_CRT_PROG_NM ;
   private boolean[] P005920_n466TBM34_CRT_PROG_NM ;
   private String[] P005920_A465TBM34_CRT_USER_ID ;
   private boolean[] P005920_n465TBM34_CRT_USER_ID ;
   private java.util.Date[] P005920_A464TBM34_CRT_DATETIME ;
   private boolean[] P005920_n464TBM34_CRT_DATETIME ;
   private GxObjectCollection AV11W_ITEMS ;
   private SdtA_LOGIN_SDT AV9W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT3[] ;
   private SdtB808_SD01_EXTRA_INFO AV14W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO4[] ;
   private SdtTBM31_CRF AV18P_BC_CRF ;
}

final  class b402_pc23_crf_del__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P00592", "DELETE FROM `TBT13_CRF_RES_HIS`  WHERE (`TBT13_STUDY_ID` = ?) AND (`TBT13_CRF_ID` = ?)", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P00593", "DELETE FROM `TBT12_CRF_RESULT`  WHERE (`TBT12_STUDY_ID` = ?) AND (`TBT12_CRF_ID` = ?)", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P00594", "DELETE FROM `TBT11_CRF_HISTORY`  WHERE (`TBT11_STUDY_ID` = ?) AND (`TBT11_CRF_ID` = ?)", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P00595", "DELETE FROM `TBT15_CRF_MEMO_LOC`  WHERE (`TBT15_STUDY_ID` = ?) AND (`TBT15_CRF_ID` = ?)", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P00596", "DELETE FROM `TBT14_CRF_MEMO`  WHERE `TBT14_STUDY_ID` = ? and `TBT14_SUBJECT_ID` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P00597", "DELETE FROM `TBT02_CRF`  WHERE (`TBT02_STUDY_ID` = ?) AND (`TBT02_CRF_ID` = ?)", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new ForEachCursor("P00598", "SELECT `TBM35_CRF_ID`, `TBM35_STUDY_ID`, `TBM35_CRF_ITEM_CD`, `TBM35_STUDY_AUTH_CD`, `TBM35_DISPLAY_FLG`, `TBM35_DEL_FLG`, `TBM35_UPD_CNT`, `TBM35_UPD_PROG_NM`, `TBM35_UPD_USER_ID`, `TBM35_UPD_DATETIME`, `TBM35_CRT_PROG_NM`, `TBM35_CRT_USER_ID`, `TBM35_CRT_DATETIME` FROM `TBM35_CRF_ITEM_AUTH` WHERE `TBM35_STUDY_ID` = ? and `TBM35_CRF_ID` = ? ORDER BY `TBM35_STUDY_ID`, `TBM35_CRF_ID`  FOR UPDATE ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new UpdateCursor("P00599", "DELETE FROM `TBM35_CRF_ITEM_AUTH`  WHERE `TBM35_STUDY_ID` = ? AND `TBM35_CRF_ID` = ? AND `TBM35_CRF_ITEM_CD` = ? AND `TBM35_STUDY_AUTH_CD` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new ForEachCursor("P005910", "SELECT `TBM41_CRF_ID`, `TBM41_STUDY_ID`, `TBM41_CRF_ITEM_GRP_DIV`, `TBM41_CRF_ITEM_GRP_CD`, `TBM41_NCM_METADATA_ID`, `TBM41_DEL_FLG`, `TBM41_UPD_CNT`, `TBM41_UPD_PROG_NM`, `TBM41_UPD_USER_ID`, `TBM41_UPD_DATETIME`, `TBM41_CRT_PROG_NM`, `TBM41_CRT_USER_ID`, `TBM41_CRT_DATETIME` FROM `TBM41_CRF_NCM_MAP` WHERE `TBM41_STUDY_ID` = ? and `TBM41_CRF_ID` = ? ORDER BY `TBM41_STUDY_ID`, `TBM41_CRF_ID`  FOR UPDATE ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new UpdateCursor("P005911", "DELETE FROM `TBM41_CRF_NCM_MAP`  WHERE `TBM41_STUDY_ID` = ? AND `TBM41_CRF_ID` = ? AND `TBM41_CRF_ITEM_GRP_DIV` = ? AND `TBM41_CRF_ITEM_GRP_CD` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new ForEachCursor("P005912", "SELECT `TBM37_CRF_ID`, `TBM37_STUDY_ID`, `TBM37_CRF_ITEM_GRP_DIV`, `TBM37_CRF_ITEM_GRP_CD`, `TBM37_VISIT_NO`, `TBM37_DOM_CD`, `TBM37_DOM_VAR_NM`, `TBM37_DOM_ITM_GRP_OID`, `TBM37_DOM_ITM_GRP_ATTR_SEQ`, `TBM37_DOM_ITM_GRP_ROWNO`, `TBM37_DEL_FLG`, `TBM37_UPD_CNT`, `TBM37_UPD_PROG_NM`, `TBM37_UPD_USER_ID`, `TBM37_UPD_DATETIME`, `TBM37_CRT_PROG_NM`, `TBM37_CRT_USER_ID`, `TBM37_CRT_DATETIME` FROM `TBM37_CRF_DOM_MAP` WHERE `TBM37_STUDY_ID` = ? and `TBM37_CRF_ID` = ? ORDER BY `TBM37_STUDY_ID`, `TBM37_CRF_ID`  FOR UPDATE ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new UpdateCursor("P005913", "DELETE FROM `TBM37_CRF_DOM_MAP`  WHERE `TBM37_STUDY_ID` = ? AND `TBM37_CRF_ID` = ? AND `TBM37_CRF_ITEM_GRP_DIV` = ? AND `TBM37_CRF_ITEM_GRP_CD` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new ForEachCursor("P005914", "SELECT `TBM36_SELECT_CRF_ID`, `TBM36_STUDY_ID`, `TBM36_CRF_ID`, `TBM36_COND_NO`, `TBM36_DEL_FLG`, `TBM36_UPD_CNT`, `TBM36_UPD_PROG_NM`, `TBM36_UPD_USER_ID`, `TBM36_UPD_DATETIME`, `TBM36_CRT_PROG_NM`, `TBM36_CRT_USER_ID`, `TBM36_CRT_DATETIME` FROM `TBM36_CRF_SELECT` WHERE (`TBM36_STUDY_ID` = ?) AND (`TBM36_SELECT_CRF_ID` = ?) ORDER BY `TBM36_STUDY_ID`  FOR UPDATE ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new UpdateCursor("P005915", "DELETE FROM `TBM36_CRF_SELECT`  WHERE `TBM36_STUDY_ID` = ? AND `TBM36_CRF_ID` = ? AND `TBM36_COND_NO` = ? AND `TBM36_SELECT_CRF_ID` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new ForEachCursor("P005916", "SELECT `TBM33_CRF_ID`, `TBM33_STUDY_ID`, `TBM33_COND_NO`, `TBM33_COND_NM`, `TBM33_EXPRESSION`, `TBM33_COND_DIV`, `TBM33_CRF_ITEM_CD`, `TBM33_PRIOR_NO`, `TBM33_ERR_DIV`, `TBM33_ERR_MSG`, `TBM33_ENABLED_FLG`, `TBM33_REQUIRED_INPUT_FLG`, `TBM33_NUMERIC_RANGE_FLG`, `TBM33_DEL_FLG`, `TBM33_UPD_CNT`, `TBM33_UPD_PROG_NM`, `TBM33_UPD_USER_ID`, `TBM33_UPD_DATETIME`, `TBM33_CRT_PROG_NM`, `TBM33_CRT_USER_ID`, `TBM33_CRT_DATETIME` FROM `TBM33_CRF_COND` WHERE `TBM33_STUDY_ID` = ? and `TBM33_CRF_ID` = ? ORDER BY `TBM33_STUDY_ID`, `TBM33_CRF_ID`  FOR UPDATE ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new UpdateCursor("P005917", "DELETE FROM `TBM33_CRF_COND`  WHERE `TBM33_STUDY_ID` = ? AND `TBM33_CRF_ID` = ? AND `TBM33_COND_NO` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new ForEachCursor("P005918", "SELECT `TBM32_CRF_ID`, `TBM32_STUDY_ID`, `TBM32_CRF_ITEM_CD`, `TBM32_CRF_ITEM_NM`, `TBM32_CRF_ITEM_DIV`, `TBM32_CRF_ITEM_GRP_CD`, `TBM32_CRF_ITEM_GRP_ORDER`, `TBM32_LOCATION_X`, `TBM32_LOCATION_Y`, `TBM32_LOCATION_X2`, `TBM32_LOCATION_Y2`, `TBM32_TEXT_ALIGN_DIV`, `TBM32_TEXT_MAXROWS`, `TBM32_TEXT_MAXLENGTH`, `TBM32_DECIMAL_DIGITS`, `TBM32_CHK_TRUE_INNER_VALUE`, `TBM32_CHK_FALSE_INNER_VALUE`, `TBM32_FIXED_VALUE`, `TBM32_LIST_CD`, `TBM32_IMAGE_CD`, `TBM32_TEXT`, `TBM32_FONT_SIZE`, `TBM32_FONT_UL_FLG`, `TBM32_FONT_COLOR_DIV`, `TBM32_LINE_SIZE_DIV`, `TBM32_LINE_COLOR_DIV`, `TBM32_LINE_START_POINT_DIV`, `TBM32_LINE_END_POINT_DIV`, `TBM32_LINE_ANGLE`, `TBM32_AUTH_LVL_MIN`, `TBM32_ZORDER`, `TBM32_TAB_ORDER`, `TBM32_TABSTOP_FLG`, `TBM32_REQUIRED_INPUT_FLG`, `TBM32_MIN_VALUE`, `TBM32_MAX_VALUE`, `TBM32_CRF_ITEM_NOTE`, `TBM32_REF_CRF_ID`, `TBM32_REF_CRF_ITEM_CD`, `TBM32_DEL_FLG`, `TBM32_UPD_CNT`, `TBM32_UPD_PROG_NM`, `TBM32_UPD_USER_ID`, `TBM32_UPD_DATETIME`, `TBM32_CRT_PROG_NM`, `TBM32_CRT_USER_ID`, `TBM32_CRT_DATETIME` FROM `TBM32_CRF_ITEM` WHERE `TBM32_STUDY_ID` = ? and `TBM32_CRF_ID` = ? ORDER BY `TBM32_STUDY_ID`, `TBM32_CRF_ID`  FOR UPDATE ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new UpdateCursor("P005919", "DELETE FROM `TBM32_CRF_ITEM`  WHERE `TBM32_STUDY_ID` = ? AND `TBM32_CRF_ID` = ? AND `TBM32_CRF_ITEM_CD` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new ForEachCursor("P005920", "SELECT `TBM34_CRF_ID`, `TBM34_STUDY_ID`, `TBM34_STYDY_AUTH_CD`, `TBM34_DISPLAY_FLG`, `TBM34_DEL_FLG`, `TBM34_UPD_CNT`, `TBM34_UPD_PROG_NM`, `TBM34_UPD_USER_ID`, `TBM34_UPD_DATETIME`, `TBM34_CRT_PROG_NM`, `TBM34_CRT_USER_ID`, `TBM34_CRT_DATETIME` FROM `TBM34_CRF_AUTH` WHERE `TBM34_STUDY_ID` = ? and `TBM34_CRF_ID` = ? ORDER BY `TBM34_STUDY_ID`, `TBM34_CRF_ID`  FOR UPDATE ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new UpdateCursor("P005921", "DELETE FROM `TBM34_CRF_AUTH`  WHERE `TBM34_STUDY_ID` = ? AND `TBM34_CRF_ID` = ? AND `TBM34_STYDY_AUTH_CD` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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
               break;
            case 8 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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
               break;
            case 10 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
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
               ((long[]) buf[18])[0] = rslt.getLong(12) ;
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
               ((java.util.Date[]) buf[30])[0] = rslt.getGXDateTime(18) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               break;
            case 12 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((long[]) buf[6])[0] = rslt.getLong(6) ;
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
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDateTime(12) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               break;
            case 14 :
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
               ((byte[]) buf[11])[0] = rslt.getByte(8) ;
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
               ((long[]) buf[25])[0] = rslt.getLong(15) ;
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
               ((java.util.Date[]) buf[37])[0] = rslt.getGXDateTime(21) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               break;
            case 16 :
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
               ((long[]) buf[77])[0] = rslt.getLong(41) ;
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
               ((java.util.Date[]) buf[89])[0] = rslt.getGXDateTime(47) ;
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               break;
            case 18 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((long[]) buf[7])[0] = rslt.getLong(6) ;
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
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDateTime(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               break;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               break;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               break;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               break;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               break;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               break;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               break;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 50, false);
               stmt.setVarchar(4, (String)parms[3], 2, false);
               break;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               break;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 1, false);
               stmt.setVarchar(4, (String)parms[3], 50, false);
               break;
            case 10 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               break;
            case 11 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 1, false);
               stmt.setVarchar(4, (String)parms[3], 50, false);
               break;
            case 12 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               break;
            case 13 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               break;
            case 14 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               break;
            case 15 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 16 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               break;
            case 17 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 50, false);
               break;
            case 18 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               break;
            case 19 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 2, false);
               break;
      }
   }

}

