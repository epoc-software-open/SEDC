/*
               File: B402_PC23_CRF_DEL
        Description: CRF関連データ全物理削除
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:19:27.31
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
      b402_pc23_crf_del.this.aP1 = aP1;
      b402_pc23_crf_del.this.aP2 = aP2;
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
      /* Execute user subroutine: S111 */
      S111 ();
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
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT13_CRF_RES_HIS") ;
      /* End optimized DELETE. */
      /* Optimized DELETE. */
      Gx_ope = "Delete" ;
      Gx_etb = "TBT12_CRF_RESULT" ;
      /* Using cursor P00593 */
      pr_default.execute(1, new Object[] {new Long(AV18P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_study_id()), new Short(AV18P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crf_id())});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT12_CRF_RESULT") ;
      /* End optimized DELETE. */
      /* Optimized DELETE. */
      Gx_ope = "Delete" ;
      Gx_etb = "TBT11_CRF_HISTORY" ;
      /* Using cursor P00594 */
      pr_default.execute(2, new Object[] {new Long(AV18P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_study_id()), new Short(AV18P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crf_id())});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT11_CRF_HISTORY") ;
      /* End optimized DELETE. */
      /* Optimized DELETE. */
      Gx_ope = "Delete" ;
      Gx_etb = "TBT15_CRF_MEMO_LOC" ;
      /* Using cursor P00595 */
      pr_default.execute(3, new Object[] {new Long(AV18P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_study_id()), new Short(AV18P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crf_id())});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT15_CRF_MEMO_LOC") ;
      /* End optimized DELETE. */
      /* Optimized DELETE. */
      Gx_ope = "Delete" ;
      Gx_etb = "TBT14_CRF_MEMO" ;
      /* Using cursor P00596 */
      pr_default.execute(4, new Object[] {new Long(AV18P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_study_id()), new Short(AV18P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crf_id())});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT14_CRF_MEMO") ;
      /* End optimized DELETE. */
      /* Optimized DELETE. */
      Gx_ope = "Delete" ;
      Gx_etb = "TBT02_CRF" ;
      /* Using cursor P00597 */
      pr_default.execute(5, new Object[] {new Long(AV18P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_study_id()), new Short(AV18P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crf_id())});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT02_CRF") ;
      /* End optimized DELETE. */
      Gx_ope = "Fetch" ;
      Gx_etb = "TBM35_CRF_ITEM_AUTH" ;
      /* Using cursor P00598 */
      pr_default.execute(6, new Object[] {new Long(AV18P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_study_id()), new Short(AV18P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crf_id())});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A32TBM35_CRF_ID = P00598_A32TBM35_CRF_ID[0] ;
         A31TBM35_STUDY_ID = P00598_A31TBM35_STUDY_ID[0] ;
         A33TBM35_CRF_ITEM_CD = P00598_A33TBM35_CRF_ITEM_CD[0] ;
         A34TBM35_STUDY_AUTH_CD = P00598_A34TBM35_STUDY_AUTH_CD[0] ;
         A580TBM35_DISPLAY_FLG = P00598_A580TBM35_DISPLAY_FLG[0] ;
         n580TBM35_DISPLAY_FLG = P00598_n580TBM35_DISPLAY_FLG[0] ;
         A581TBM35_DEL_FLG = P00598_A581TBM35_DEL_FLG[0] ;
         n581TBM35_DEL_FLG = P00598_n581TBM35_DEL_FLG[0] ;
         A582TBM35_CRT_DATETIME = P00598_A582TBM35_CRT_DATETIME[0] ;
         n582TBM35_CRT_DATETIME = P00598_n582TBM35_CRT_DATETIME[0] ;
         A583TBM35_CRT_USER_ID = P00598_A583TBM35_CRT_USER_ID[0] ;
         n583TBM35_CRT_USER_ID = P00598_n583TBM35_CRT_USER_ID[0] ;
         A584TBM35_CRT_PROG_NM = P00598_A584TBM35_CRT_PROG_NM[0] ;
         n584TBM35_CRT_PROG_NM = P00598_n584TBM35_CRT_PROG_NM[0] ;
         A585TBM35_UPD_DATETIME = P00598_A585TBM35_UPD_DATETIME[0] ;
         n585TBM35_UPD_DATETIME = P00598_n585TBM35_UPD_DATETIME[0] ;
         A586TBM35_UPD_USER_ID = P00598_A586TBM35_UPD_USER_ID[0] ;
         n586TBM35_UPD_USER_ID = P00598_n586TBM35_UPD_USER_ID[0] ;
         A587TBM35_UPD_PROG_NM = P00598_A587TBM35_UPD_PROG_NM[0] ;
         n587TBM35_UPD_PROG_NM = P00598_n587TBM35_UPD_PROG_NM[0] ;
         A588TBM35_UPD_CNT = P00598_A588TBM35_UPD_CNT[0] ;
         n588TBM35_UPD_CNT = P00598_n588TBM35_UPD_CNT[0] ;
         AV11W_ITEMS.clear();
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A31TBM35_STUDY_ID, 10, 0)), 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A32TBM35_CRF_ID, 10, 0)), 0);
         AV11W_ITEMS.add(A33TBM35_CRF_ITEM_CD, 0);
         AV11W_ITEMS.add(A34TBM35_STUDY_AUTH_CD, 0);
         AV11W_ITEMS.add(A580TBM35_DISPLAY_FLG, 0);
         AV11W_ITEMS.add(A581TBM35_DEL_FLG, 0);
         new b808_pc02_data_log(remoteHandle, context).execute( AV28Pgmname, "DLT", "TBM35_CRF_ITEM_AUTH", AV11W_ITEMS, A582TBM35_CRT_DATETIME, A583TBM35_CRT_USER_ID, A584TBM35_CRT_PROG_NM, A585TBM35_UPD_DATETIME, A586TBM35_UPD_USER_ID, A587TBM35_UPD_PROG_NM, A588TBM35_UPD_CNT) ;
         Gx_ope = "Delete" ;
         Gx_etb = "TBM35_CRF_ITEM_AUTH" ;
         /* Using cursor P00599 */
         pr_default.execute(7, new Object[] {new Long(A31TBM35_STUDY_ID), new Short(A32TBM35_CRF_ID), A33TBM35_CRF_ITEM_CD, A34TBM35_STUDY_AUTH_CD});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM35_CRF_ITEM_AUTH") ;
         pr_default.readNext(6);
      }
      pr_default.close(6);
      Gx_ope = "Fetch" ;
      Gx_etb = "TBM41_CRF_NCM_MAP" ;
      /* Using cursor P005910 */
      pr_default.execute(8, new Object[] {new Long(AV18P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_study_id()), new Short(AV18P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crf_id())});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A20TBM41_CRF_ID = P005910_A20TBM41_CRF_ID[0] ;
         A19TBM41_STUDY_ID = P005910_A19TBM41_STUDY_ID[0] ;
         A21TBM41_CRF_ITEM_GRP_DIV = P005910_A21TBM41_CRF_ITEM_GRP_DIV[0] ;
         A22TBM41_CRF_ITEM_GRP_CD = P005910_A22TBM41_CRF_ITEM_GRP_CD[0] ;
         A424TBM41_NCM_METADATA_ID = P005910_A424TBM41_NCM_METADATA_ID[0] ;
         n424TBM41_NCM_METADATA_ID = P005910_n424TBM41_NCM_METADATA_ID[0] ;
         A425TBM41_DEL_FLG = P005910_A425TBM41_DEL_FLG[0] ;
         n425TBM41_DEL_FLG = P005910_n425TBM41_DEL_FLG[0] ;
         A426TBM41_CRT_DATETIME = P005910_A426TBM41_CRT_DATETIME[0] ;
         n426TBM41_CRT_DATETIME = P005910_n426TBM41_CRT_DATETIME[0] ;
         A427TBM41_CRT_USER_ID = P005910_A427TBM41_CRT_USER_ID[0] ;
         n427TBM41_CRT_USER_ID = P005910_n427TBM41_CRT_USER_ID[0] ;
         A428TBM41_CRT_PROG_NM = P005910_A428TBM41_CRT_PROG_NM[0] ;
         n428TBM41_CRT_PROG_NM = P005910_n428TBM41_CRT_PROG_NM[0] ;
         A429TBM41_UPD_DATETIME = P005910_A429TBM41_UPD_DATETIME[0] ;
         n429TBM41_UPD_DATETIME = P005910_n429TBM41_UPD_DATETIME[0] ;
         A430TBM41_UPD_USER_ID = P005910_A430TBM41_UPD_USER_ID[0] ;
         n430TBM41_UPD_USER_ID = P005910_n430TBM41_UPD_USER_ID[0] ;
         A431TBM41_UPD_PROG_NM = P005910_A431TBM41_UPD_PROG_NM[0] ;
         n431TBM41_UPD_PROG_NM = P005910_n431TBM41_UPD_PROG_NM[0] ;
         A432TBM41_UPD_CNT = P005910_A432TBM41_UPD_CNT[0] ;
         n432TBM41_UPD_CNT = P005910_n432TBM41_UPD_CNT[0] ;
         AV11W_ITEMS.clear();
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A19TBM41_STUDY_ID, 10, 0)), 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A20TBM41_CRF_ID, 10, 0)), 0);
         AV11W_ITEMS.add(A21TBM41_CRF_ITEM_GRP_DIV, 0);
         AV11W_ITEMS.add(A22TBM41_CRF_ITEM_GRP_CD, 0);
         AV11W_ITEMS.add(A424TBM41_NCM_METADATA_ID, 0);
         AV11W_ITEMS.add(A425TBM41_DEL_FLG, 0);
         new b808_pc02_data_log(remoteHandle, context).execute( AV28Pgmname, "DLT", "TBM41_CRF_NCM_MAP", AV11W_ITEMS, A426TBM41_CRT_DATETIME, A427TBM41_CRT_USER_ID, A428TBM41_CRT_PROG_NM, A429TBM41_UPD_DATETIME, A430TBM41_UPD_USER_ID, A431TBM41_UPD_PROG_NM, A432TBM41_UPD_CNT) ;
         Gx_ope = "Delete" ;
         Gx_etb = "TBM41_CRF_NCM_MAP" ;
         /* Using cursor P005911 */
         pr_default.execute(9, new Object[] {new Long(A19TBM41_STUDY_ID), new Short(A20TBM41_CRF_ID), A21TBM41_CRF_ITEM_GRP_DIV, A22TBM41_CRF_ITEM_GRP_CD});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM41_CRF_NCM_MAP") ;
         pr_default.readNext(8);
      }
      pr_default.close(8);
      Gx_ope = "Fetch" ;
      Gx_etb = "TBM37_CRF_DOM_MAP" ;
      /* Using cursor P005912 */
      pr_default.execute(10, new Object[] {new Long(AV18P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_study_id()), new Short(AV18P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crf_id())});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A80TBM37_CRF_ID = P005912_A80TBM37_CRF_ID[0] ;
         A79TBM37_STUDY_ID = P005912_A79TBM37_STUDY_ID[0] ;
         A81TBM37_CRF_ITEM_GRP_DIV = P005912_A81TBM37_CRF_ITEM_GRP_DIV[0] ;
         A82TBM37_CRF_ITEM_GRP_CD = P005912_A82TBM37_CRF_ITEM_GRP_CD[0] ;
         A83TBM37_VISIT_NO = P005912_A83TBM37_VISIT_NO[0] ;
         n83TBM37_VISIT_NO = P005912_n83TBM37_VISIT_NO[0] ;
         A84TBM37_DOM_CD = P005912_A84TBM37_DOM_CD[0] ;
         n84TBM37_DOM_CD = P005912_n84TBM37_DOM_CD[0] ;
         A500TBM37_DOM_VAR_NM = P005912_A500TBM37_DOM_VAR_NM[0] ;
         n500TBM37_DOM_VAR_NM = P005912_n500TBM37_DOM_VAR_NM[0] ;
         A85TBM37_DOM_ITM_GRP_OID = P005912_A85TBM37_DOM_ITM_GRP_OID[0] ;
         n85TBM37_DOM_ITM_GRP_OID = P005912_n85TBM37_DOM_ITM_GRP_OID[0] ;
         A501TBM37_DOM_ITM_GRP_ATTR_SEQ = P005912_A501TBM37_DOM_ITM_GRP_ATTR_SEQ[0] ;
         n501TBM37_DOM_ITM_GRP_ATTR_SEQ = P005912_n501TBM37_DOM_ITM_GRP_ATTR_SEQ[0] ;
         A86TBM37_DOM_ITM_GRP_ROWNO = P005912_A86TBM37_DOM_ITM_GRP_ROWNO[0] ;
         n86TBM37_DOM_ITM_GRP_ROWNO = P005912_n86TBM37_DOM_ITM_GRP_ROWNO[0] ;
         A433TBM37_DEL_FLG = P005912_A433TBM37_DEL_FLG[0] ;
         n433TBM37_DEL_FLG = P005912_n433TBM37_DEL_FLG[0] ;
         A434TBM37_CRT_DATETIME = P005912_A434TBM37_CRT_DATETIME[0] ;
         n434TBM37_CRT_DATETIME = P005912_n434TBM37_CRT_DATETIME[0] ;
         A435TBM37_CRT_USER_ID = P005912_A435TBM37_CRT_USER_ID[0] ;
         n435TBM37_CRT_USER_ID = P005912_n435TBM37_CRT_USER_ID[0] ;
         A436TBM37_CRT_PROG_NM = P005912_A436TBM37_CRT_PROG_NM[0] ;
         n436TBM37_CRT_PROG_NM = P005912_n436TBM37_CRT_PROG_NM[0] ;
         A437TBM37_UPD_DATETIME = P005912_A437TBM37_UPD_DATETIME[0] ;
         n437TBM37_UPD_DATETIME = P005912_n437TBM37_UPD_DATETIME[0] ;
         A438TBM37_UPD_USER_ID = P005912_A438TBM37_UPD_USER_ID[0] ;
         n438TBM37_UPD_USER_ID = P005912_n438TBM37_UPD_USER_ID[0] ;
         A439TBM37_UPD_PROG_NM = P005912_A439TBM37_UPD_PROG_NM[0] ;
         n439TBM37_UPD_PROG_NM = P005912_n439TBM37_UPD_PROG_NM[0] ;
         A440TBM37_UPD_CNT = P005912_A440TBM37_UPD_CNT[0] ;
         n440TBM37_UPD_CNT = P005912_n440TBM37_UPD_CNT[0] ;
         AV11W_ITEMS.clear();
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A79TBM37_STUDY_ID, 10, 0)), 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A80TBM37_CRF_ID, 10, 0)), 0);
         AV11W_ITEMS.add(A81TBM37_CRF_ITEM_GRP_DIV, 0);
         AV11W_ITEMS.add(A82TBM37_CRF_ITEM_GRP_CD, 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A83TBM37_VISIT_NO, 10, 0)), 0);
         AV11W_ITEMS.add(A84TBM37_DOM_CD, 0);
         AV11W_ITEMS.add(A500TBM37_DOM_VAR_NM, 0);
         AV11W_ITEMS.add(A85TBM37_DOM_ITM_GRP_OID, 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A501TBM37_DOM_ITM_GRP_ATTR_SEQ, 10, 0)), 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A86TBM37_DOM_ITM_GRP_ROWNO, 10, 0)), 0);
         AV11W_ITEMS.add(A433TBM37_DEL_FLG, 0);
         new b808_pc02_data_log(remoteHandle, context).execute( AV28Pgmname, "DLT", "TBM37_CRF_DOM_MAP", AV11W_ITEMS, A434TBM37_CRT_DATETIME, A435TBM37_CRT_USER_ID, A436TBM37_CRT_PROG_NM, A437TBM37_UPD_DATETIME, A438TBM37_UPD_USER_ID, A439TBM37_UPD_PROG_NM, A440TBM37_UPD_CNT) ;
         Gx_ope = "Delete" ;
         Gx_etb = "TBM37_CRF_DOM_MAP" ;
         /* Using cursor P005913 */
         pr_default.execute(11, new Object[] {new Long(A79TBM37_STUDY_ID), new Short(A80TBM37_CRF_ID), A81TBM37_CRF_ITEM_GRP_DIV, A82TBM37_CRF_ITEM_GRP_CD});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM37_CRF_DOM_MAP") ;
         pr_default.readNext(10);
      }
      pr_default.close(10);
      Gx_ope = "Fetch" ;
      Gx_etb = "TBM36_CRF_SELECT" ;
      /* Using cursor P005914 */
      pr_default.execute(12, new Object[] {new Long(AV18P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_study_id()), new Short(AV18P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crf_id())});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A38TBM36_SELECT_CRF_ID = P005914_A38TBM36_SELECT_CRF_ID[0] ;
         A35TBM36_STUDY_ID = P005914_A35TBM36_STUDY_ID[0] ;
         A36TBM36_CRF_ID = P005914_A36TBM36_CRF_ID[0] ;
         A37TBM36_COND_NO = P005914_A37TBM36_COND_NO[0] ;
         A589TBM36_DEL_FLG = P005914_A589TBM36_DEL_FLG[0] ;
         n589TBM36_DEL_FLG = P005914_n589TBM36_DEL_FLG[0] ;
         A590TBM36_CRT_DATETIME = P005914_A590TBM36_CRT_DATETIME[0] ;
         n590TBM36_CRT_DATETIME = P005914_n590TBM36_CRT_DATETIME[0] ;
         A591TBM36_CRT_USER_ID = P005914_A591TBM36_CRT_USER_ID[0] ;
         n591TBM36_CRT_USER_ID = P005914_n591TBM36_CRT_USER_ID[0] ;
         A592TBM36_CRT_PROG_NM = P005914_A592TBM36_CRT_PROG_NM[0] ;
         n592TBM36_CRT_PROG_NM = P005914_n592TBM36_CRT_PROG_NM[0] ;
         A593TBM36_UPD_DATETIME = P005914_A593TBM36_UPD_DATETIME[0] ;
         n593TBM36_UPD_DATETIME = P005914_n593TBM36_UPD_DATETIME[0] ;
         A594TBM36_UPD_USER_ID = P005914_A594TBM36_UPD_USER_ID[0] ;
         n594TBM36_UPD_USER_ID = P005914_n594TBM36_UPD_USER_ID[0] ;
         A595TBM36_UPD_PROG_NM = P005914_A595TBM36_UPD_PROG_NM[0] ;
         n595TBM36_UPD_PROG_NM = P005914_n595TBM36_UPD_PROG_NM[0] ;
         A596TBM36_UPD_CNT = P005914_A596TBM36_UPD_CNT[0] ;
         n596TBM36_UPD_CNT = P005914_n596TBM36_UPD_CNT[0] ;
         AV11W_ITEMS.clear();
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A35TBM36_STUDY_ID, 10, 0)), 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A36TBM36_CRF_ID, 10, 0)), 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A37TBM36_COND_NO, 10, 0)), 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A38TBM36_SELECT_CRF_ID, 10, 0)), 0);
         AV11W_ITEMS.add(A589TBM36_DEL_FLG, 0);
         new b808_pc02_data_log(remoteHandle, context).execute( AV28Pgmname, "DLT", "TBM36_CRF_SELECT", AV11W_ITEMS, A590TBM36_CRT_DATETIME, A591TBM36_CRT_USER_ID, A592TBM36_CRT_PROG_NM, A593TBM36_UPD_DATETIME, A594TBM36_UPD_USER_ID, A595TBM36_UPD_PROG_NM, A596TBM36_UPD_CNT) ;
         Gx_ope = "Delete" ;
         Gx_etb = "TBM36_CRF_SELECT" ;
         /* Using cursor P005915 */
         pr_default.execute(13, new Object[] {new Long(A35TBM36_STUDY_ID), new Short(A36TBM36_CRF_ID), new Short(A37TBM36_COND_NO), new Short(A38TBM36_SELECT_CRF_ID)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM36_CRF_SELECT") ;
         pr_default.readNext(12);
      }
      pr_default.close(12);
      Gx_ope = "Fetch" ;
      Gx_etb = "TBM33_CRF_COND" ;
      /* Using cursor P005916 */
      pr_default.execute(14, new Object[] {new Long(AV18P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_study_id()), new Short(AV18P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crf_id())});
      while ( (pr_default.getStatus(14) != 101) )
      {
         A77TBM33_CRF_ID = P005916_A77TBM33_CRF_ID[0] ;
         A76TBM33_STUDY_ID = P005916_A76TBM33_STUDY_ID[0] ;
         A78TBM33_COND_NO = P005916_A78TBM33_COND_NO[0] ;
         A502TBM33_COND_NM = P005916_A502TBM33_COND_NM[0] ;
         n502TBM33_COND_NM = P005916_n502TBM33_COND_NM[0] ;
         A414TBM33_EXPRESSION = P005916_A414TBM33_EXPRESSION[0] ;
         n414TBM33_EXPRESSION = P005916_n414TBM33_EXPRESSION[0] ;
         A503TBM33_COND_DIV = P005916_A503TBM33_COND_DIV[0] ;
         n503TBM33_COND_DIV = P005916_n503TBM33_COND_DIV[0] ;
         A504TBM33_CRF_ITEM_CD = P005916_A504TBM33_CRF_ITEM_CD[0] ;
         n504TBM33_CRF_ITEM_CD = P005916_n504TBM33_CRF_ITEM_CD[0] ;
         A415TBM33_PRIOR_NO = P005916_A415TBM33_PRIOR_NO[0] ;
         n415TBM33_PRIOR_NO = P005916_n415TBM33_PRIOR_NO[0] ;
         A505TBM33_ERR_DIV = P005916_A505TBM33_ERR_DIV[0] ;
         n505TBM33_ERR_DIV = P005916_n505TBM33_ERR_DIV[0] ;
         A506TBM33_ERR_MSG = P005916_A506TBM33_ERR_MSG[0] ;
         n506TBM33_ERR_MSG = P005916_n506TBM33_ERR_MSG[0] ;
         A646TBM33_ENABLED_FLG = P005916_A646TBM33_ENABLED_FLG[0] ;
         n646TBM33_ENABLED_FLG = P005916_n646TBM33_ENABLED_FLG[0] ;
         A696TBM33_REQUIRED_INPUT_FLG = P005916_A696TBM33_REQUIRED_INPUT_FLG[0] ;
         n696TBM33_REQUIRED_INPUT_FLG = P005916_n696TBM33_REQUIRED_INPUT_FLG[0] ;
         A697TBM33_NUMERIC_RANGE_FLG = P005916_A697TBM33_NUMERIC_RANGE_FLG[0] ;
         n697TBM33_NUMERIC_RANGE_FLG = P005916_n697TBM33_NUMERIC_RANGE_FLG[0] ;
         A416TBM33_DEL_FLG = P005916_A416TBM33_DEL_FLG[0] ;
         n416TBM33_DEL_FLG = P005916_n416TBM33_DEL_FLG[0] ;
         A417TBM33_CRT_DATETIME = P005916_A417TBM33_CRT_DATETIME[0] ;
         n417TBM33_CRT_DATETIME = P005916_n417TBM33_CRT_DATETIME[0] ;
         A418TBM33_CRT_USER_ID = P005916_A418TBM33_CRT_USER_ID[0] ;
         n418TBM33_CRT_USER_ID = P005916_n418TBM33_CRT_USER_ID[0] ;
         A419TBM33_CRT_PROG_NM = P005916_A419TBM33_CRT_PROG_NM[0] ;
         n419TBM33_CRT_PROG_NM = P005916_n419TBM33_CRT_PROG_NM[0] ;
         A420TBM33_UPD_DATETIME = P005916_A420TBM33_UPD_DATETIME[0] ;
         n420TBM33_UPD_DATETIME = P005916_n420TBM33_UPD_DATETIME[0] ;
         A421TBM33_UPD_USER_ID = P005916_A421TBM33_UPD_USER_ID[0] ;
         n421TBM33_UPD_USER_ID = P005916_n421TBM33_UPD_USER_ID[0] ;
         A422TBM33_UPD_PROG_NM = P005916_A422TBM33_UPD_PROG_NM[0] ;
         n422TBM33_UPD_PROG_NM = P005916_n422TBM33_UPD_PROG_NM[0] ;
         A423TBM33_UPD_CNT = P005916_A423TBM33_UPD_CNT[0] ;
         n423TBM33_UPD_CNT = P005916_n423TBM33_UPD_CNT[0] ;
         AV11W_ITEMS.clear();
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A76TBM33_STUDY_ID, 10, 0)), 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A77TBM33_CRF_ID, 10, 0)), 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A78TBM33_COND_NO, 10, 0)), 0);
         AV11W_ITEMS.add(A502TBM33_COND_NM, 0);
         AV11W_ITEMS.add(A414TBM33_EXPRESSION, 0);
         AV11W_ITEMS.add(A503TBM33_COND_DIV, 0);
         AV11W_ITEMS.add(A504TBM33_CRF_ITEM_CD, 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A415TBM33_PRIOR_NO, 10, 0)), 0);
         AV11W_ITEMS.add(A505TBM33_ERR_DIV, 0);
         AV11W_ITEMS.add(A506TBM33_ERR_MSG, 0);
         AV11W_ITEMS.add(A646TBM33_ENABLED_FLG, 0);
         AV11W_ITEMS.add(A696TBM33_REQUIRED_INPUT_FLG, 0);
         AV11W_ITEMS.add(A697TBM33_NUMERIC_RANGE_FLG, 0);
         AV11W_ITEMS.add(A416TBM33_DEL_FLG, 0);
         new b808_pc02_data_log(remoteHandle, context).execute( AV28Pgmname, "DLT", "TBM33_CRF_COND", AV11W_ITEMS, A417TBM33_CRT_DATETIME, A418TBM33_CRT_USER_ID, A419TBM33_CRT_PROG_NM, A420TBM33_UPD_DATETIME, A421TBM33_UPD_USER_ID, A422TBM33_UPD_PROG_NM, A423TBM33_UPD_CNT) ;
         Gx_ope = "Delete" ;
         Gx_etb = "TBM33_CRF_COND" ;
         /* Using cursor P005917 */
         pr_default.execute(15, new Object[] {new Long(A76TBM33_STUDY_ID), new Short(A77TBM33_CRF_ID), new Short(A78TBM33_COND_NO)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM33_CRF_COND") ;
         pr_default.readNext(14);
      }
      pr_default.close(14);
      Gx_ope = "Fetch" ;
      Gx_etb = "TBM32_CRF_ITEM" ;
      /* Using cursor P005918 */
      pr_default.execute(16, new Object[] {new Long(AV18P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_study_id()), new Short(AV18P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crf_id())});
      while ( (pr_default.getStatus(16) != 101) )
      {
         A71TBM32_CRF_ID = P005918_A71TBM32_CRF_ID[0] ;
         A70TBM32_STUDY_ID = P005918_A70TBM32_STUDY_ID[0] ;
         A72TBM32_CRF_ITEM_CD = P005918_A72TBM32_CRF_ITEM_CD[0] ;
         A405TBM32_CRF_ITEM_NM = P005918_A405TBM32_CRF_ITEM_NM[0] ;
         n405TBM32_CRF_ITEM_NM = P005918_n405TBM32_CRF_ITEM_NM[0] ;
         A74TBM32_CRF_ITEM_DIV = P005918_A74TBM32_CRF_ITEM_DIV[0] ;
         n74TBM32_CRF_ITEM_DIV = P005918_n74TBM32_CRF_ITEM_DIV[0] ;
         A73TBM32_CRF_ITEM_GRP_CD = P005918_A73TBM32_CRF_ITEM_GRP_CD[0] ;
         n73TBM32_CRF_ITEM_GRP_CD = P005918_n73TBM32_CRF_ITEM_GRP_CD[0] ;
         A507TBM32_CRF_ITEM_GRP_ORDER = P005918_A507TBM32_CRF_ITEM_GRP_ORDER[0] ;
         n507TBM32_CRF_ITEM_GRP_ORDER = P005918_n507TBM32_CRF_ITEM_GRP_ORDER[0] ;
         A508TBM32_LOCATION_X = P005918_A508TBM32_LOCATION_X[0] ;
         n508TBM32_LOCATION_X = P005918_n508TBM32_LOCATION_X[0] ;
         A509TBM32_LOCATION_Y = P005918_A509TBM32_LOCATION_Y[0] ;
         n509TBM32_LOCATION_Y = P005918_n509TBM32_LOCATION_Y[0] ;
         A510TBM32_LOCATION_X2 = P005918_A510TBM32_LOCATION_X2[0] ;
         n510TBM32_LOCATION_X2 = P005918_n510TBM32_LOCATION_X2[0] ;
         A511TBM32_LOCATION_Y2 = P005918_A511TBM32_LOCATION_Y2[0] ;
         n511TBM32_LOCATION_Y2 = P005918_n511TBM32_LOCATION_Y2[0] ;
         A512TBM32_TEXT_ALIGN_DIV = P005918_A512TBM32_TEXT_ALIGN_DIV[0] ;
         n512TBM32_TEXT_ALIGN_DIV = P005918_n512TBM32_TEXT_ALIGN_DIV[0] ;
         A516TBM32_TEXT_MAXROWS = P005918_A516TBM32_TEXT_MAXROWS[0] ;
         n516TBM32_TEXT_MAXROWS = P005918_n516TBM32_TEXT_MAXROWS[0] ;
         A517TBM32_TEXT_MAXLENGTH = P005918_A517TBM32_TEXT_MAXLENGTH[0] ;
         n517TBM32_TEXT_MAXLENGTH = P005918_n517TBM32_TEXT_MAXLENGTH[0] ;
         A518TBM32_DECIMAL_DIGITS = P005918_A518TBM32_DECIMAL_DIGITS[0] ;
         n518TBM32_DECIMAL_DIGITS = P005918_n518TBM32_DECIMAL_DIGITS[0] ;
         A522TBM32_CHK_TRUE_INNER_VALUE = P005918_A522TBM32_CHK_TRUE_INNER_VALUE[0] ;
         n522TBM32_CHK_TRUE_INNER_VALUE = P005918_n522TBM32_CHK_TRUE_INNER_VALUE[0] ;
         A523TBM32_CHK_FALSE_INNER_VALUE = P005918_A523TBM32_CHK_FALSE_INNER_VALUE[0] ;
         n523TBM32_CHK_FALSE_INNER_VALUE = P005918_n523TBM32_CHK_FALSE_INNER_VALUE[0] ;
         A527TBM32_FIXED_VALUE = P005918_A527TBM32_FIXED_VALUE[0] ;
         n527TBM32_FIXED_VALUE = P005918_n527TBM32_FIXED_VALUE[0] ;
         A525TBM32_LIST_CD = P005918_A525TBM32_LIST_CD[0] ;
         n525TBM32_LIST_CD = P005918_n525TBM32_LIST_CD[0] ;
         A526TBM32_IMAGE_CD = P005918_A526TBM32_IMAGE_CD[0] ;
         n526TBM32_IMAGE_CD = P005918_n526TBM32_IMAGE_CD[0] ;
         A524TBM32_TEXT = P005918_A524TBM32_TEXT[0] ;
         n524TBM32_TEXT = P005918_n524TBM32_TEXT[0] ;
         A513TBM32_FONT_SIZE = P005918_A513TBM32_FONT_SIZE[0] ;
         n513TBM32_FONT_SIZE = P005918_n513TBM32_FONT_SIZE[0] ;
         A514TBM32_FONT_UL_FLG = P005918_A514TBM32_FONT_UL_FLG[0] ;
         n514TBM32_FONT_UL_FLG = P005918_n514TBM32_FONT_UL_FLG[0] ;
         A515TBM32_FONT_COLOR_DIV = P005918_A515TBM32_FONT_COLOR_DIV[0] ;
         n515TBM32_FONT_COLOR_DIV = P005918_n515TBM32_FONT_COLOR_DIV[0] ;
         A521TBM32_LINE_SIZE_DIV = P005918_A521TBM32_LINE_SIZE_DIV[0] ;
         n521TBM32_LINE_SIZE_DIV = P005918_n521TBM32_LINE_SIZE_DIV[0] ;
         A689TBM32_LINE_COLOR_DIV = P005918_A689TBM32_LINE_COLOR_DIV[0] ;
         n689TBM32_LINE_COLOR_DIV = P005918_n689TBM32_LINE_COLOR_DIV[0] ;
         A519TBM32_LINE_START_POINT_DIV = P005918_A519TBM32_LINE_START_POINT_DIV[0] ;
         n519TBM32_LINE_START_POINT_DIV = P005918_n519TBM32_LINE_START_POINT_DIV[0] ;
         A520TBM32_LINE_END_POINT_DIV = P005918_A520TBM32_LINE_END_POINT_DIV[0] ;
         n520TBM32_LINE_END_POINT_DIV = P005918_n520TBM32_LINE_END_POINT_DIV[0] ;
         A690TBM32_LINE_ANGLE = P005918_A690TBM32_LINE_ANGLE[0] ;
         n690TBM32_LINE_ANGLE = P005918_n690TBM32_LINE_ANGLE[0] ;
         A644TBM32_AUTH_LVL_MIN = P005918_A644TBM32_AUTH_LVL_MIN[0] ;
         n644TBM32_AUTH_LVL_MIN = P005918_n644TBM32_AUTH_LVL_MIN[0] ;
         A645TBM32_ZORDER = P005918_A645TBM32_ZORDER[0] ;
         n645TBM32_ZORDER = P005918_n645TBM32_ZORDER[0] ;
         A691TBM32_TAB_ORDER = P005918_A691TBM32_TAB_ORDER[0] ;
         n691TBM32_TAB_ORDER = P005918_n691TBM32_TAB_ORDER[0] ;
         A692TBM32_TABSTOP_FLG = P005918_A692TBM32_TABSTOP_FLG[0] ;
         n692TBM32_TABSTOP_FLG = P005918_n692TBM32_TABSTOP_FLG[0] ;
         A693TBM32_REQUIRED_INPUT_FLG = P005918_A693TBM32_REQUIRED_INPUT_FLG[0] ;
         n693TBM32_REQUIRED_INPUT_FLG = P005918_n693TBM32_REQUIRED_INPUT_FLG[0] ;
         A694TBM32_MIN_VALUE = P005918_A694TBM32_MIN_VALUE[0] ;
         n694TBM32_MIN_VALUE = P005918_n694TBM32_MIN_VALUE[0] ;
         A695TBM32_MAX_VALUE = P005918_A695TBM32_MAX_VALUE[0] ;
         n695TBM32_MAX_VALUE = P005918_n695TBM32_MAX_VALUE[0] ;
         A406TBM32_CRF_ITEM_NOTE = P005918_A406TBM32_CRF_ITEM_NOTE[0] ;
         n406TBM32_CRF_ITEM_NOTE = P005918_n406TBM32_CRF_ITEM_NOTE[0] ;
         A774TBM32_REF_CRF_ID = P005918_A774TBM32_REF_CRF_ID[0] ;
         n774TBM32_REF_CRF_ID = P005918_n774TBM32_REF_CRF_ID[0] ;
         A775TBM32_REF_CRF_ITEM_CD = P005918_A775TBM32_REF_CRF_ITEM_CD[0] ;
         n775TBM32_REF_CRF_ITEM_CD = P005918_n775TBM32_REF_CRF_ITEM_CD[0] ;
         A75TBM32_DEL_FLG = P005918_A75TBM32_DEL_FLG[0] ;
         n75TBM32_DEL_FLG = P005918_n75TBM32_DEL_FLG[0] ;
         A407TBM32_CRT_DATETIME = P005918_A407TBM32_CRT_DATETIME[0] ;
         n407TBM32_CRT_DATETIME = P005918_n407TBM32_CRT_DATETIME[0] ;
         A408TBM32_CRT_USER_ID = P005918_A408TBM32_CRT_USER_ID[0] ;
         n408TBM32_CRT_USER_ID = P005918_n408TBM32_CRT_USER_ID[0] ;
         A409TBM32_CRT_PROG_NM = P005918_A409TBM32_CRT_PROG_NM[0] ;
         n409TBM32_CRT_PROG_NM = P005918_n409TBM32_CRT_PROG_NM[0] ;
         A410TBM32_UPD_DATETIME = P005918_A410TBM32_UPD_DATETIME[0] ;
         n410TBM32_UPD_DATETIME = P005918_n410TBM32_UPD_DATETIME[0] ;
         A411TBM32_UPD_USER_ID = P005918_A411TBM32_UPD_USER_ID[0] ;
         n411TBM32_UPD_USER_ID = P005918_n411TBM32_UPD_USER_ID[0] ;
         A412TBM32_UPD_PROG_NM = P005918_A412TBM32_UPD_PROG_NM[0] ;
         n412TBM32_UPD_PROG_NM = P005918_n412TBM32_UPD_PROG_NM[0] ;
         A413TBM32_UPD_CNT = P005918_A413TBM32_UPD_CNT[0] ;
         n413TBM32_UPD_CNT = P005918_n413TBM32_UPD_CNT[0] ;
         AV11W_ITEMS.clear();
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A70TBM32_STUDY_ID, 10, 0)), 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A71TBM32_CRF_ID, 10, 0)), 0);
         AV11W_ITEMS.add(A72TBM32_CRF_ITEM_CD, 0);
         AV11W_ITEMS.add(A405TBM32_CRF_ITEM_NM, 0);
         AV11W_ITEMS.add(A74TBM32_CRF_ITEM_DIV, 0);
         AV11W_ITEMS.add(A73TBM32_CRF_ITEM_GRP_CD, 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A507TBM32_CRF_ITEM_GRP_ORDER, 10, 0)), 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A508TBM32_LOCATION_X, 10, 0)), 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A509TBM32_LOCATION_Y, 10, 0)), 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A510TBM32_LOCATION_X2, 10, 0)), 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A511TBM32_LOCATION_Y2, 10, 0)), 0);
         AV11W_ITEMS.add(A512TBM32_TEXT_ALIGN_DIV, 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A516TBM32_TEXT_MAXROWS, 10, 0)), 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A517TBM32_TEXT_MAXLENGTH, 10, 0)), 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A518TBM32_DECIMAL_DIGITS, 10, 0)), 0);
         AV11W_ITEMS.add(A522TBM32_CHK_TRUE_INNER_VALUE, 0);
         AV11W_ITEMS.add(A523TBM32_CHK_FALSE_INNER_VALUE, 0);
         AV11W_ITEMS.add(A527TBM32_FIXED_VALUE, 0);
         AV11W_ITEMS.add(A525TBM32_LIST_CD, 0);
         AV11W_ITEMS.add(A526TBM32_IMAGE_CD, 0);
         AV11W_ITEMS.add(A524TBM32_TEXT, 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A513TBM32_FONT_SIZE, 10, 0)), 0);
         AV11W_ITEMS.add(A514TBM32_FONT_UL_FLG, 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A515TBM32_FONT_COLOR_DIV, 10, 0)), 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A521TBM32_LINE_SIZE_DIV, 10, 0)), 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A689TBM32_LINE_COLOR_DIV, 10, 0)), 0);
         AV11W_ITEMS.add(A519TBM32_LINE_START_POINT_DIV, 0);
         AV11W_ITEMS.add(A520TBM32_LINE_END_POINT_DIV, 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A690TBM32_LINE_ANGLE, 10, 0)), 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A644TBM32_AUTH_LVL_MIN, 10, 0)), 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A645TBM32_ZORDER, 10, 0)), 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A691TBM32_TAB_ORDER, 10, 0)), 0);
         AV11W_ITEMS.add(A692TBM32_TABSTOP_FLG, 0);
         AV11W_ITEMS.add(A693TBM32_REQUIRED_INPUT_FLG, 0);
         AV11W_ITEMS.add(A694TBM32_MIN_VALUE, 0);
         AV11W_ITEMS.add(A695TBM32_MAX_VALUE, 0);
         AV11W_ITEMS.add(A406TBM32_CRF_ITEM_NOTE, 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A774TBM32_REF_CRF_ID, 10, 0)), 0);
         AV11W_ITEMS.add(A775TBM32_REF_CRF_ITEM_CD, 0);
         AV11W_ITEMS.add(A75TBM32_DEL_FLG, 0);
         new b808_pc02_data_log(remoteHandle, context).execute( AV28Pgmname, "DLT", "TBM32_CRF_ITEM", AV11W_ITEMS, A407TBM32_CRT_DATETIME, A408TBM32_CRT_USER_ID, A409TBM32_CRT_PROG_NM, A410TBM32_UPD_DATETIME, A411TBM32_UPD_USER_ID, A412TBM32_UPD_PROG_NM, A413TBM32_UPD_CNT) ;
         Gx_ope = "Delete" ;
         Gx_etb = "TBM32_CRF_ITEM" ;
         /* Using cursor P005919 */
         pr_default.execute(17, new Object[] {new Long(A70TBM32_STUDY_ID), new Short(A71TBM32_CRF_ID), A72TBM32_CRF_ITEM_CD});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM32_CRF_ITEM") ;
         pr_default.readNext(16);
      }
      pr_default.close(16);
      Gx_ope = "Fetch" ;
      Gx_etb = "TBM34_CRF_AUTH" ;
      /* Using cursor P005920 */
      pr_default.execute(18, new Object[] {new Long(AV18P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_study_id()), new Short(AV18P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crf_id())});
      while ( (pr_default.getStatus(18) != 101) )
      {
         A29TBM34_CRF_ID = P005920_A29TBM34_CRF_ID[0] ;
         A28TBM34_STUDY_ID = P005920_A28TBM34_STUDY_ID[0] ;
         A30TBM34_STYDY_AUTH_CD = P005920_A30TBM34_STYDY_AUTH_CD[0] ;
         A571TBM34_DISPLAY_FLG = P005920_A571TBM34_DISPLAY_FLG[0] ;
         n571TBM34_DISPLAY_FLG = P005920_n571TBM34_DISPLAY_FLG[0] ;
         A572TBM34_DEL_FLG = P005920_A572TBM34_DEL_FLG[0] ;
         n572TBM34_DEL_FLG = P005920_n572TBM34_DEL_FLG[0] ;
         A573TBM34_CRT_DATETIME = P005920_A573TBM34_CRT_DATETIME[0] ;
         n573TBM34_CRT_DATETIME = P005920_n573TBM34_CRT_DATETIME[0] ;
         A574TBM34_CRT_USER_ID = P005920_A574TBM34_CRT_USER_ID[0] ;
         n574TBM34_CRT_USER_ID = P005920_n574TBM34_CRT_USER_ID[0] ;
         A575TBM34_CRT_PROG_NM = P005920_A575TBM34_CRT_PROG_NM[0] ;
         n575TBM34_CRT_PROG_NM = P005920_n575TBM34_CRT_PROG_NM[0] ;
         A576TBM34_UPD_DATETIME = P005920_A576TBM34_UPD_DATETIME[0] ;
         n576TBM34_UPD_DATETIME = P005920_n576TBM34_UPD_DATETIME[0] ;
         A577TBM34_UPD_USER_ID = P005920_A577TBM34_UPD_USER_ID[0] ;
         n577TBM34_UPD_USER_ID = P005920_n577TBM34_UPD_USER_ID[0] ;
         A578TBM34_UPD_PROG_NM = P005920_A578TBM34_UPD_PROG_NM[0] ;
         n578TBM34_UPD_PROG_NM = P005920_n578TBM34_UPD_PROG_NM[0] ;
         A579TBM34_UPD_CNT = P005920_A579TBM34_UPD_CNT[0] ;
         n579TBM34_UPD_CNT = P005920_n579TBM34_UPD_CNT[0] ;
         AV11W_ITEMS.clear();
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A28TBM34_STUDY_ID, 10, 0)), 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A29TBM34_CRF_ID, 10, 0)), 0);
         AV11W_ITEMS.add(A30TBM34_STYDY_AUTH_CD, 0);
         AV11W_ITEMS.add(A571TBM34_DISPLAY_FLG, 0);
         AV11W_ITEMS.add(A572TBM34_DEL_FLG, 0);
         new b808_pc02_data_log(remoteHandle, context).execute( AV28Pgmname, "DLT", "TBM34_CRF_AUTH", AV11W_ITEMS, A573TBM34_CRT_DATETIME, A574TBM34_CRT_USER_ID, A575TBM34_CRT_PROG_NM, A576TBM34_UPD_DATETIME, A577TBM34_UPD_USER_ID, A578TBM34_UPD_PROG_NM, A579TBM34_UPD_CNT) ;
         Gx_ope = "Delete" ;
         Gx_etb = "TBM34_CRF_AUTH" ;
         /* Using cursor P005921 */
         pr_default.execute(19, new Object[] {new Long(A28TBM34_STUDY_ID), new Short(A29TBM34_CRF_ID), A30TBM34_STYDY_AUTH_CD});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM34_CRF_AUTH") ;
         pr_default.readNext(18);
      }
      pr_default.close(18);
      Gx_ope = "Fetch" ;
      Gx_etb = "TBM44_CRF_VISIT" ;
      /* Using cursor P005922 */
      pr_default.execute(20, new Object[] {new Long(AV18P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_study_id()), new Short(AV18P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crf_id())});
      while ( (pr_default.getStatus(20) != 101) )
      {
         A946TBM44_CRF_ID = P005922_A946TBM44_CRF_ID[0] ;
         A945TBM44_STUDY_ID = P005922_A945TBM44_STUDY_ID[0] ;
         A947TBM44_CRF_EDA_NO = P005922_A947TBM44_CRF_EDA_NO[0] ;
         A948TBM44_VISIT_NO = P005922_A948TBM44_VISIT_NO[0] ;
         n948TBM44_VISIT_NO = P005922_n948TBM44_VISIT_NO[0] ;
         A949TBM44_DEL_FLG = P005922_A949TBM44_DEL_FLG[0] ;
         n949TBM44_DEL_FLG = P005922_n949TBM44_DEL_FLG[0] ;
         A950TBM44_CRT_DATETIME = P005922_A950TBM44_CRT_DATETIME[0] ;
         n950TBM44_CRT_DATETIME = P005922_n950TBM44_CRT_DATETIME[0] ;
         A951TBM44_CRT_USER_ID = P005922_A951TBM44_CRT_USER_ID[0] ;
         n951TBM44_CRT_USER_ID = P005922_n951TBM44_CRT_USER_ID[0] ;
         A952TBM44_CRT_PROG_NM = P005922_A952TBM44_CRT_PROG_NM[0] ;
         n952TBM44_CRT_PROG_NM = P005922_n952TBM44_CRT_PROG_NM[0] ;
         A953TBM44_UPD_DATETIME = P005922_A953TBM44_UPD_DATETIME[0] ;
         n953TBM44_UPD_DATETIME = P005922_n953TBM44_UPD_DATETIME[0] ;
         A954TBM44_UPD_USER_ID = P005922_A954TBM44_UPD_USER_ID[0] ;
         n954TBM44_UPD_USER_ID = P005922_n954TBM44_UPD_USER_ID[0] ;
         A955TBM44_UPD_PROG_NM = P005922_A955TBM44_UPD_PROG_NM[0] ;
         n955TBM44_UPD_PROG_NM = P005922_n955TBM44_UPD_PROG_NM[0] ;
         A956TBM44_UPD_CNT = P005922_A956TBM44_UPD_CNT[0] ;
         n956TBM44_UPD_CNT = P005922_n956TBM44_UPD_CNT[0] ;
         AV11W_ITEMS.clear();
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A945TBM44_STUDY_ID, 10, 0)), 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A946TBM44_CRF_ID, 10, 0)), 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A947TBM44_CRF_EDA_NO, 10, 0)), 0);
         AV11W_ITEMS.add(GXutil.trim( GXutil.str( A948TBM44_VISIT_NO, 10, 0)), 0);
         AV11W_ITEMS.add(A949TBM44_DEL_FLG, 0);
         new b808_pc02_data_log(remoteHandle, context).execute( AV28Pgmname, "DLT", "TBM44_CRF_VISIT", AV11W_ITEMS, A950TBM44_CRT_DATETIME, A951TBM44_CRT_USER_ID, A952TBM44_CRT_PROG_NM, A953TBM44_UPD_DATETIME, A954TBM44_UPD_USER_ID, A955TBM44_UPD_PROG_NM, A956TBM44_UPD_CNT) ;
         Gx_ope = "Delete" ;
         Gx_etb = "TBM44_CRF_VISIT" ;
         /* Using cursor P005923 */
         pr_default.execute(21, new Object[] {new Long(A945TBM44_STUDY_ID), new Short(A946TBM44_CRF_ID), new Byte(A947TBM44_CRF_EDA_NO)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM44_CRF_VISIT") ;
         pr_default.readNext(20);
      }
      pr_default.close(20);
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

   public void S111( )
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
         GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("1")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void S121( )
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
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
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
      AV13W_RTN_MSG = "" ;
      AV8C_APP_ID = "" ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      scmdbuf = "" ;
      P00598_A32TBM35_CRF_ID = new short[1] ;
      P00598_A31TBM35_STUDY_ID = new long[1] ;
      P00598_A33TBM35_CRF_ITEM_CD = new String[] {""} ;
      P00598_A34TBM35_STUDY_AUTH_CD = new String[] {""} ;
      P00598_A580TBM35_DISPLAY_FLG = new String[] {""} ;
      P00598_n580TBM35_DISPLAY_FLG = new boolean[] {false} ;
      P00598_A581TBM35_DEL_FLG = new String[] {""} ;
      P00598_n581TBM35_DEL_FLG = new boolean[] {false} ;
      P00598_A582TBM35_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P00598_n582TBM35_CRT_DATETIME = new boolean[] {false} ;
      P00598_A583TBM35_CRT_USER_ID = new String[] {""} ;
      P00598_n583TBM35_CRT_USER_ID = new boolean[] {false} ;
      P00598_A584TBM35_CRT_PROG_NM = new String[] {""} ;
      P00598_n584TBM35_CRT_PROG_NM = new boolean[] {false} ;
      P00598_A585TBM35_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P00598_n585TBM35_UPD_DATETIME = new boolean[] {false} ;
      P00598_A586TBM35_UPD_USER_ID = new String[] {""} ;
      P00598_n586TBM35_UPD_USER_ID = new boolean[] {false} ;
      P00598_A587TBM35_UPD_PROG_NM = new String[] {""} ;
      P00598_n587TBM35_UPD_PROG_NM = new boolean[] {false} ;
      P00598_A588TBM35_UPD_CNT = new long[1] ;
      P00598_n588TBM35_UPD_CNT = new boolean[] {false} ;
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
      AV11W_ITEMS = new GxObjectCollection(String.class, "internal", "");
      AV28Pgmname = "" ;
      P005910_A20TBM41_CRF_ID = new short[1] ;
      P005910_A19TBM41_STUDY_ID = new long[1] ;
      P005910_A21TBM41_CRF_ITEM_GRP_DIV = new String[] {""} ;
      P005910_A22TBM41_CRF_ITEM_GRP_CD = new String[] {""} ;
      P005910_A424TBM41_NCM_METADATA_ID = new String[] {""} ;
      P005910_n424TBM41_NCM_METADATA_ID = new boolean[] {false} ;
      P005910_A425TBM41_DEL_FLG = new String[] {""} ;
      P005910_n425TBM41_DEL_FLG = new boolean[] {false} ;
      P005910_A426TBM41_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P005910_n426TBM41_CRT_DATETIME = new boolean[] {false} ;
      P005910_A427TBM41_CRT_USER_ID = new String[] {""} ;
      P005910_n427TBM41_CRT_USER_ID = new boolean[] {false} ;
      P005910_A428TBM41_CRT_PROG_NM = new String[] {""} ;
      P005910_n428TBM41_CRT_PROG_NM = new boolean[] {false} ;
      P005910_A429TBM41_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P005910_n429TBM41_UPD_DATETIME = new boolean[] {false} ;
      P005910_A430TBM41_UPD_USER_ID = new String[] {""} ;
      P005910_n430TBM41_UPD_USER_ID = new boolean[] {false} ;
      P005910_A431TBM41_UPD_PROG_NM = new String[] {""} ;
      P005910_n431TBM41_UPD_PROG_NM = new boolean[] {false} ;
      P005910_A432TBM41_UPD_CNT = new long[1] ;
      P005910_n432TBM41_UPD_CNT = new boolean[] {false} ;
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
      P005912_A80TBM37_CRF_ID = new short[1] ;
      P005912_A79TBM37_STUDY_ID = new long[1] ;
      P005912_A81TBM37_CRF_ITEM_GRP_DIV = new String[] {""} ;
      P005912_A82TBM37_CRF_ITEM_GRP_CD = new String[] {""} ;
      P005912_A83TBM37_VISIT_NO = new int[1] ;
      P005912_n83TBM37_VISIT_NO = new boolean[] {false} ;
      P005912_A84TBM37_DOM_CD = new String[] {""} ;
      P005912_n84TBM37_DOM_CD = new boolean[] {false} ;
      P005912_A500TBM37_DOM_VAR_NM = new String[] {""} ;
      P005912_n500TBM37_DOM_VAR_NM = new boolean[] {false} ;
      P005912_A85TBM37_DOM_ITM_GRP_OID = new String[] {""} ;
      P005912_n85TBM37_DOM_ITM_GRP_OID = new boolean[] {false} ;
      P005912_A501TBM37_DOM_ITM_GRP_ATTR_SEQ = new short[1] ;
      P005912_n501TBM37_DOM_ITM_GRP_ATTR_SEQ = new boolean[] {false} ;
      P005912_A86TBM37_DOM_ITM_GRP_ROWNO = new short[1] ;
      P005912_n86TBM37_DOM_ITM_GRP_ROWNO = new boolean[] {false} ;
      P005912_A433TBM37_DEL_FLG = new String[] {""} ;
      P005912_n433TBM37_DEL_FLG = new boolean[] {false} ;
      P005912_A434TBM37_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P005912_n434TBM37_CRT_DATETIME = new boolean[] {false} ;
      P005912_A435TBM37_CRT_USER_ID = new String[] {""} ;
      P005912_n435TBM37_CRT_USER_ID = new boolean[] {false} ;
      P005912_A436TBM37_CRT_PROG_NM = new String[] {""} ;
      P005912_n436TBM37_CRT_PROG_NM = new boolean[] {false} ;
      P005912_A437TBM37_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P005912_n437TBM37_UPD_DATETIME = new boolean[] {false} ;
      P005912_A438TBM37_UPD_USER_ID = new String[] {""} ;
      P005912_n438TBM37_UPD_USER_ID = new boolean[] {false} ;
      P005912_A439TBM37_UPD_PROG_NM = new String[] {""} ;
      P005912_n439TBM37_UPD_PROG_NM = new boolean[] {false} ;
      P005912_A440TBM37_UPD_CNT = new long[1] ;
      P005912_n440TBM37_UPD_CNT = new boolean[] {false} ;
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
      P005914_A38TBM36_SELECT_CRF_ID = new short[1] ;
      P005914_A35TBM36_STUDY_ID = new long[1] ;
      P005914_A36TBM36_CRF_ID = new short[1] ;
      P005914_A37TBM36_COND_NO = new short[1] ;
      P005914_A589TBM36_DEL_FLG = new String[] {""} ;
      P005914_n589TBM36_DEL_FLG = new boolean[] {false} ;
      P005914_A590TBM36_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P005914_n590TBM36_CRT_DATETIME = new boolean[] {false} ;
      P005914_A591TBM36_CRT_USER_ID = new String[] {""} ;
      P005914_n591TBM36_CRT_USER_ID = new boolean[] {false} ;
      P005914_A592TBM36_CRT_PROG_NM = new String[] {""} ;
      P005914_n592TBM36_CRT_PROG_NM = new boolean[] {false} ;
      P005914_A593TBM36_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P005914_n593TBM36_UPD_DATETIME = new boolean[] {false} ;
      P005914_A594TBM36_UPD_USER_ID = new String[] {""} ;
      P005914_n594TBM36_UPD_USER_ID = new boolean[] {false} ;
      P005914_A595TBM36_UPD_PROG_NM = new String[] {""} ;
      P005914_n595TBM36_UPD_PROG_NM = new boolean[] {false} ;
      P005914_A596TBM36_UPD_CNT = new long[1] ;
      P005914_n596TBM36_UPD_CNT = new boolean[] {false} ;
      A589TBM36_DEL_FLG = "" ;
      A590TBM36_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A591TBM36_CRT_USER_ID = "" ;
      A592TBM36_CRT_PROG_NM = "" ;
      A593TBM36_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A594TBM36_UPD_USER_ID = "" ;
      A595TBM36_UPD_PROG_NM = "" ;
      P005916_A77TBM33_CRF_ID = new short[1] ;
      P005916_A76TBM33_STUDY_ID = new long[1] ;
      P005916_A78TBM33_COND_NO = new short[1] ;
      P005916_A502TBM33_COND_NM = new String[] {""} ;
      P005916_n502TBM33_COND_NM = new boolean[] {false} ;
      P005916_A414TBM33_EXPRESSION = new String[] {""} ;
      P005916_n414TBM33_EXPRESSION = new boolean[] {false} ;
      P005916_A503TBM33_COND_DIV = new String[] {""} ;
      P005916_n503TBM33_COND_DIV = new boolean[] {false} ;
      P005916_A504TBM33_CRF_ITEM_CD = new String[] {""} ;
      P005916_n504TBM33_CRF_ITEM_CD = new boolean[] {false} ;
      P005916_A415TBM33_PRIOR_NO = new short[1] ;
      P005916_n415TBM33_PRIOR_NO = new boolean[] {false} ;
      P005916_A505TBM33_ERR_DIV = new String[] {""} ;
      P005916_n505TBM33_ERR_DIV = new boolean[] {false} ;
      P005916_A506TBM33_ERR_MSG = new String[] {""} ;
      P005916_n506TBM33_ERR_MSG = new boolean[] {false} ;
      P005916_A646TBM33_ENABLED_FLG = new String[] {""} ;
      P005916_n646TBM33_ENABLED_FLG = new boolean[] {false} ;
      P005916_A696TBM33_REQUIRED_INPUT_FLG = new String[] {""} ;
      P005916_n696TBM33_REQUIRED_INPUT_FLG = new boolean[] {false} ;
      P005916_A697TBM33_NUMERIC_RANGE_FLG = new String[] {""} ;
      P005916_n697TBM33_NUMERIC_RANGE_FLG = new boolean[] {false} ;
      P005916_A416TBM33_DEL_FLG = new String[] {""} ;
      P005916_n416TBM33_DEL_FLG = new boolean[] {false} ;
      P005916_A417TBM33_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P005916_n417TBM33_CRT_DATETIME = new boolean[] {false} ;
      P005916_A418TBM33_CRT_USER_ID = new String[] {""} ;
      P005916_n418TBM33_CRT_USER_ID = new boolean[] {false} ;
      P005916_A419TBM33_CRT_PROG_NM = new String[] {""} ;
      P005916_n419TBM33_CRT_PROG_NM = new boolean[] {false} ;
      P005916_A420TBM33_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P005916_n420TBM33_UPD_DATETIME = new boolean[] {false} ;
      P005916_A421TBM33_UPD_USER_ID = new String[] {""} ;
      P005916_n421TBM33_UPD_USER_ID = new boolean[] {false} ;
      P005916_A422TBM33_UPD_PROG_NM = new String[] {""} ;
      P005916_n422TBM33_UPD_PROG_NM = new boolean[] {false} ;
      P005916_A423TBM33_UPD_CNT = new long[1] ;
      P005916_n423TBM33_UPD_CNT = new boolean[] {false} ;
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
      P005918_A71TBM32_CRF_ID = new short[1] ;
      P005918_A70TBM32_STUDY_ID = new long[1] ;
      P005918_A72TBM32_CRF_ITEM_CD = new String[] {""} ;
      P005918_A405TBM32_CRF_ITEM_NM = new String[] {""} ;
      P005918_n405TBM32_CRF_ITEM_NM = new boolean[] {false} ;
      P005918_A74TBM32_CRF_ITEM_DIV = new String[] {""} ;
      P005918_n74TBM32_CRF_ITEM_DIV = new boolean[] {false} ;
      P005918_A73TBM32_CRF_ITEM_GRP_CD = new String[] {""} ;
      P005918_n73TBM32_CRF_ITEM_GRP_CD = new boolean[] {false} ;
      P005918_A507TBM32_CRF_ITEM_GRP_ORDER = new short[1] ;
      P005918_n507TBM32_CRF_ITEM_GRP_ORDER = new boolean[] {false} ;
      P005918_A508TBM32_LOCATION_X = new short[1] ;
      P005918_n508TBM32_LOCATION_X = new boolean[] {false} ;
      P005918_A509TBM32_LOCATION_Y = new short[1] ;
      P005918_n509TBM32_LOCATION_Y = new boolean[] {false} ;
      P005918_A510TBM32_LOCATION_X2 = new short[1] ;
      P005918_n510TBM32_LOCATION_X2 = new boolean[] {false} ;
      P005918_A511TBM32_LOCATION_Y2 = new short[1] ;
      P005918_n511TBM32_LOCATION_Y2 = new boolean[] {false} ;
      P005918_A512TBM32_TEXT_ALIGN_DIV = new String[] {""} ;
      P005918_n512TBM32_TEXT_ALIGN_DIV = new boolean[] {false} ;
      P005918_A516TBM32_TEXT_MAXROWS = new byte[1] ;
      P005918_n516TBM32_TEXT_MAXROWS = new boolean[] {false} ;
      P005918_A517TBM32_TEXT_MAXLENGTH = new short[1] ;
      P005918_n517TBM32_TEXT_MAXLENGTH = new boolean[] {false} ;
      P005918_A518TBM32_DECIMAL_DIGITS = new byte[1] ;
      P005918_n518TBM32_DECIMAL_DIGITS = new boolean[] {false} ;
      P005918_A522TBM32_CHK_TRUE_INNER_VALUE = new String[] {""} ;
      P005918_n522TBM32_CHK_TRUE_INNER_VALUE = new boolean[] {false} ;
      P005918_A523TBM32_CHK_FALSE_INNER_VALUE = new String[] {""} ;
      P005918_n523TBM32_CHK_FALSE_INNER_VALUE = new boolean[] {false} ;
      P005918_A527TBM32_FIXED_VALUE = new String[] {""} ;
      P005918_n527TBM32_FIXED_VALUE = new boolean[] {false} ;
      P005918_A525TBM32_LIST_CD = new String[] {""} ;
      P005918_n525TBM32_LIST_CD = new boolean[] {false} ;
      P005918_A526TBM32_IMAGE_CD = new String[] {""} ;
      P005918_n526TBM32_IMAGE_CD = new boolean[] {false} ;
      P005918_A524TBM32_TEXT = new String[] {""} ;
      P005918_n524TBM32_TEXT = new boolean[] {false} ;
      P005918_A513TBM32_FONT_SIZE = new byte[1] ;
      P005918_n513TBM32_FONT_SIZE = new boolean[] {false} ;
      P005918_A514TBM32_FONT_UL_FLG = new String[] {""} ;
      P005918_n514TBM32_FONT_UL_FLG = new boolean[] {false} ;
      P005918_A515TBM32_FONT_COLOR_DIV = new long[1] ;
      P005918_n515TBM32_FONT_COLOR_DIV = new boolean[] {false} ;
      P005918_A521TBM32_LINE_SIZE_DIV = new byte[1] ;
      P005918_n521TBM32_LINE_SIZE_DIV = new boolean[] {false} ;
      P005918_A689TBM32_LINE_COLOR_DIV = new long[1] ;
      P005918_n689TBM32_LINE_COLOR_DIV = new boolean[] {false} ;
      P005918_A519TBM32_LINE_START_POINT_DIV = new String[] {""} ;
      P005918_n519TBM32_LINE_START_POINT_DIV = new boolean[] {false} ;
      P005918_A520TBM32_LINE_END_POINT_DIV = new String[] {""} ;
      P005918_n520TBM32_LINE_END_POINT_DIV = new boolean[] {false} ;
      P005918_A690TBM32_LINE_ANGLE = new short[1] ;
      P005918_n690TBM32_LINE_ANGLE = new boolean[] {false} ;
      P005918_A644TBM32_AUTH_LVL_MIN = new byte[1] ;
      P005918_n644TBM32_AUTH_LVL_MIN = new boolean[] {false} ;
      P005918_A645TBM32_ZORDER = new short[1] ;
      P005918_n645TBM32_ZORDER = new boolean[] {false} ;
      P005918_A691TBM32_TAB_ORDER = new short[1] ;
      P005918_n691TBM32_TAB_ORDER = new boolean[] {false} ;
      P005918_A692TBM32_TABSTOP_FLG = new String[] {""} ;
      P005918_n692TBM32_TABSTOP_FLG = new boolean[] {false} ;
      P005918_A693TBM32_REQUIRED_INPUT_FLG = new String[] {""} ;
      P005918_n693TBM32_REQUIRED_INPUT_FLG = new boolean[] {false} ;
      P005918_A694TBM32_MIN_VALUE = new String[] {""} ;
      P005918_n694TBM32_MIN_VALUE = new boolean[] {false} ;
      P005918_A695TBM32_MAX_VALUE = new String[] {""} ;
      P005918_n695TBM32_MAX_VALUE = new boolean[] {false} ;
      P005918_A406TBM32_CRF_ITEM_NOTE = new String[] {""} ;
      P005918_n406TBM32_CRF_ITEM_NOTE = new boolean[] {false} ;
      P005918_A774TBM32_REF_CRF_ID = new short[1] ;
      P005918_n774TBM32_REF_CRF_ID = new boolean[] {false} ;
      P005918_A775TBM32_REF_CRF_ITEM_CD = new String[] {""} ;
      P005918_n775TBM32_REF_CRF_ITEM_CD = new boolean[] {false} ;
      P005918_A75TBM32_DEL_FLG = new String[] {""} ;
      P005918_n75TBM32_DEL_FLG = new boolean[] {false} ;
      P005918_A407TBM32_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P005918_n407TBM32_CRT_DATETIME = new boolean[] {false} ;
      P005918_A408TBM32_CRT_USER_ID = new String[] {""} ;
      P005918_n408TBM32_CRT_USER_ID = new boolean[] {false} ;
      P005918_A409TBM32_CRT_PROG_NM = new String[] {""} ;
      P005918_n409TBM32_CRT_PROG_NM = new boolean[] {false} ;
      P005918_A410TBM32_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P005918_n410TBM32_UPD_DATETIME = new boolean[] {false} ;
      P005918_A411TBM32_UPD_USER_ID = new String[] {""} ;
      P005918_n411TBM32_UPD_USER_ID = new boolean[] {false} ;
      P005918_A412TBM32_UPD_PROG_NM = new String[] {""} ;
      P005918_n412TBM32_UPD_PROG_NM = new boolean[] {false} ;
      P005918_A413TBM32_UPD_CNT = new long[1] ;
      P005918_n413TBM32_UPD_CNT = new boolean[] {false} ;
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
      P005920_A29TBM34_CRF_ID = new short[1] ;
      P005920_A28TBM34_STUDY_ID = new long[1] ;
      P005920_A30TBM34_STYDY_AUTH_CD = new String[] {""} ;
      P005920_A571TBM34_DISPLAY_FLG = new String[] {""} ;
      P005920_n571TBM34_DISPLAY_FLG = new boolean[] {false} ;
      P005920_A572TBM34_DEL_FLG = new String[] {""} ;
      P005920_n572TBM34_DEL_FLG = new boolean[] {false} ;
      P005920_A573TBM34_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P005920_n573TBM34_CRT_DATETIME = new boolean[] {false} ;
      P005920_A574TBM34_CRT_USER_ID = new String[] {""} ;
      P005920_n574TBM34_CRT_USER_ID = new boolean[] {false} ;
      P005920_A575TBM34_CRT_PROG_NM = new String[] {""} ;
      P005920_n575TBM34_CRT_PROG_NM = new boolean[] {false} ;
      P005920_A576TBM34_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P005920_n576TBM34_UPD_DATETIME = new boolean[] {false} ;
      P005920_A577TBM34_UPD_USER_ID = new String[] {""} ;
      P005920_n577TBM34_UPD_USER_ID = new boolean[] {false} ;
      P005920_A578TBM34_UPD_PROG_NM = new String[] {""} ;
      P005920_n578TBM34_UPD_PROG_NM = new boolean[] {false} ;
      P005920_A579TBM34_UPD_CNT = new long[1] ;
      P005920_n579TBM34_UPD_CNT = new boolean[] {false} ;
      A30TBM34_STYDY_AUTH_CD = "" ;
      A571TBM34_DISPLAY_FLG = "" ;
      A572TBM34_DEL_FLG = "" ;
      A573TBM34_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A574TBM34_CRT_USER_ID = "" ;
      A575TBM34_CRT_PROG_NM = "" ;
      A576TBM34_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A577TBM34_UPD_USER_ID = "" ;
      A578TBM34_UPD_PROG_NM = "" ;
      P005922_A946TBM44_CRF_ID = new short[1] ;
      P005922_A945TBM44_STUDY_ID = new long[1] ;
      P005922_A947TBM44_CRF_EDA_NO = new byte[1] ;
      P005922_A948TBM44_VISIT_NO = new int[1] ;
      P005922_n948TBM44_VISIT_NO = new boolean[] {false} ;
      P005922_A949TBM44_DEL_FLG = new String[] {""} ;
      P005922_n949TBM44_DEL_FLG = new boolean[] {false} ;
      P005922_A950TBM44_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P005922_n950TBM44_CRT_DATETIME = new boolean[] {false} ;
      P005922_A951TBM44_CRT_USER_ID = new String[] {""} ;
      P005922_n951TBM44_CRT_USER_ID = new boolean[] {false} ;
      P005922_A952TBM44_CRT_PROG_NM = new String[] {""} ;
      P005922_n952TBM44_CRT_PROG_NM = new boolean[] {false} ;
      P005922_A953TBM44_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P005922_n953TBM44_UPD_DATETIME = new boolean[] {false} ;
      P005922_A954TBM44_UPD_USER_ID = new String[] {""} ;
      P005922_n954TBM44_UPD_USER_ID = new boolean[] {false} ;
      P005922_A955TBM44_UPD_PROG_NM = new String[] {""} ;
      P005922_n955TBM44_UPD_PROG_NM = new boolean[] {false} ;
      P005922_A956TBM44_UPD_CNT = new long[1] ;
      P005922_n956TBM44_UPD_CNT = new boolean[] {false} ;
      A949TBM44_DEL_FLG = "" ;
      A950TBM44_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A951TBM44_CRT_USER_ID = "" ;
      A952TBM44_CRT_PROG_NM = "" ;
      A953TBM44_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A954TBM44_UPD_USER_ID = "" ;
      A955TBM44_UPD_PROG_NM = "" ;
      GXt_char1 = "" ;
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
            P00598_A32TBM35_CRF_ID, P00598_A31TBM35_STUDY_ID, P00598_A33TBM35_CRF_ITEM_CD, P00598_A34TBM35_STUDY_AUTH_CD, P00598_A580TBM35_DISPLAY_FLG, P00598_n580TBM35_DISPLAY_FLG, P00598_A581TBM35_DEL_FLG, P00598_n581TBM35_DEL_FLG, P00598_A582TBM35_CRT_DATETIME, P00598_n582TBM35_CRT_DATETIME,
            P00598_A583TBM35_CRT_USER_ID, P00598_n583TBM35_CRT_USER_ID, P00598_A584TBM35_CRT_PROG_NM, P00598_n584TBM35_CRT_PROG_NM, P00598_A585TBM35_UPD_DATETIME, P00598_n585TBM35_UPD_DATETIME, P00598_A586TBM35_UPD_USER_ID, P00598_n586TBM35_UPD_USER_ID, P00598_A587TBM35_UPD_PROG_NM, P00598_n587TBM35_UPD_PROG_NM,
            P00598_A588TBM35_UPD_CNT, P00598_n588TBM35_UPD_CNT
            }
            , new Object[] {
            }
            , new Object[] {
            P005910_A20TBM41_CRF_ID, P005910_A19TBM41_STUDY_ID, P005910_A21TBM41_CRF_ITEM_GRP_DIV, P005910_A22TBM41_CRF_ITEM_GRP_CD, P005910_A424TBM41_NCM_METADATA_ID, P005910_n424TBM41_NCM_METADATA_ID, P005910_A425TBM41_DEL_FLG, P005910_n425TBM41_DEL_FLG, P005910_A426TBM41_CRT_DATETIME, P005910_n426TBM41_CRT_DATETIME,
            P005910_A427TBM41_CRT_USER_ID, P005910_n427TBM41_CRT_USER_ID, P005910_A428TBM41_CRT_PROG_NM, P005910_n428TBM41_CRT_PROG_NM, P005910_A429TBM41_UPD_DATETIME, P005910_n429TBM41_UPD_DATETIME, P005910_A430TBM41_UPD_USER_ID, P005910_n430TBM41_UPD_USER_ID, P005910_A431TBM41_UPD_PROG_NM, P005910_n431TBM41_UPD_PROG_NM,
            P005910_A432TBM41_UPD_CNT, P005910_n432TBM41_UPD_CNT
            }
            , new Object[] {
            }
            , new Object[] {
            P005912_A80TBM37_CRF_ID, P005912_A79TBM37_STUDY_ID, P005912_A81TBM37_CRF_ITEM_GRP_DIV, P005912_A82TBM37_CRF_ITEM_GRP_CD, P005912_A83TBM37_VISIT_NO, P005912_n83TBM37_VISIT_NO, P005912_A84TBM37_DOM_CD, P005912_n84TBM37_DOM_CD, P005912_A500TBM37_DOM_VAR_NM, P005912_n500TBM37_DOM_VAR_NM,
            P005912_A85TBM37_DOM_ITM_GRP_OID, P005912_n85TBM37_DOM_ITM_GRP_OID, P005912_A501TBM37_DOM_ITM_GRP_ATTR_SEQ, P005912_n501TBM37_DOM_ITM_GRP_ATTR_SEQ, P005912_A86TBM37_DOM_ITM_GRP_ROWNO, P005912_n86TBM37_DOM_ITM_GRP_ROWNO, P005912_A433TBM37_DEL_FLG, P005912_n433TBM37_DEL_FLG, P005912_A434TBM37_CRT_DATETIME, P005912_n434TBM37_CRT_DATETIME,
            P005912_A435TBM37_CRT_USER_ID, P005912_n435TBM37_CRT_USER_ID, P005912_A436TBM37_CRT_PROG_NM, P005912_n436TBM37_CRT_PROG_NM, P005912_A437TBM37_UPD_DATETIME, P005912_n437TBM37_UPD_DATETIME, P005912_A438TBM37_UPD_USER_ID, P005912_n438TBM37_UPD_USER_ID, P005912_A439TBM37_UPD_PROG_NM, P005912_n439TBM37_UPD_PROG_NM,
            P005912_A440TBM37_UPD_CNT, P005912_n440TBM37_UPD_CNT
            }
            , new Object[] {
            }
            , new Object[] {
            P005914_A38TBM36_SELECT_CRF_ID, P005914_A35TBM36_STUDY_ID, P005914_A36TBM36_CRF_ID, P005914_A37TBM36_COND_NO, P005914_A589TBM36_DEL_FLG, P005914_n589TBM36_DEL_FLG, P005914_A590TBM36_CRT_DATETIME, P005914_n590TBM36_CRT_DATETIME, P005914_A591TBM36_CRT_USER_ID, P005914_n591TBM36_CRT_USER_ID,
            P005914_A592TBM36_CRT_PROG_NM, P005914_n592TBM36_CRT_PROG_NM, P005914_A593TBM36_UPD_DATETIME, P005914_n593TBM36_UPD_DATETIME, P005914_A594TBM36_UPD_USER_ID, P005914_n594TBM36_UPD_USER_ID, P005914_A595TBM36_UPD_PROG_NM, P005914_n595TBM36_UPD_PROG_NM, P005914_A596TBM36_UPD_CNT, P005914_n596TBM36_UPD_CNT
            }
            , new Object[] {
            }
            , new Object[] {
            P005916_A77TBM33_CRF_ID, P005916_A76TBM33_STUDY_ID, P005916_A78TBM33_COND_NO, P005916_A502TBM33_COND_NM, P005916_n502TBM33_COND_NM, P005916_A414TBM33_EXPRESSION, P005916_n414TBM33_EXPRESSION, P005916_A503TBM33_COND_DIV, P005916_n503TBM33_COND_DIV, P005916_A504TBM33_CRF_ITEM_CD,
            P005916_n504TBM33_CRF_ITEM_CD, P005916_A415TBM33_PRIOR_NO, P005916_n415TBM33_PRIOR_NO, P005916_A505TBM33_ERR_DIV, P005916_n505TBM33_ERR_DIV, P005916_A506TBM33_ERR_MSG, P005916_n506TBM33_ERR_MSG, P005916_A646TBM33_ENABLED_FLG, P005916_n646TBM33_ENABLED_FLG, P005916_A696TBM33_REQUIRED_INPUT_FLG,
            P005916_n696TBM33_REQUIRED_INPUT_FLG, P005916_A697TBM33_NUMERIC_RANGE_FLG, P005916_n697TBM33_NUMERIC_RANGE_FLG, P005916_A416TBM33_DEL_FLG, P005916_n416TBM33_DEL_FLG, P005916_A417TBM33_CRT_DATETIME, P005916_n417TBM33_CRT_DATETIME, P005916_A418TBM33_CRT_USER_ID, P005916_n418TBM33_CRT_USER_ID, P005916_A419TBM33_CRT_PROG_NM,
            P005916_n419TBM33_CRT_PROG_NM, P005916_A420TBM33_UPD_DATETIME, P005916_n420TBM33_UPD_DATETIME, P005916_A421TBM33_UPD_USER_ID, P005916_n421TBM33_UPD_USER_ID, P005916_A422TBM33_UPD_PROG_NM, P005916_n422TBM33_UPD_PROG_NM, P005916_A423TBM33_UPD_CNT, P005916_n423TBM33_UPD_CNT
            }
            , new Object[] {
            }
            , new Object[] {
            P005918_A71TBM32_CRF_ID, P005918_A70TBM32_STUDY_ID, P005918_A72TBM32_CRF_ITEM_CD, P005918_A405TBM32_CRF_ITEM_NM, P005918_n405TBM32_CRF_ITEM_NM, P005918_A74TBM32_CRF_ITEM_DIV, P005918_n74TBM32_CRF_ITEM_DIV, P005918_A73TBM32_CRF_ITEM_GRP_CD, P005918_n73TBM32_CRF_ITEM_GRP_CD, P005918_A507TBM32_CRF_ITEM_GRP_ORDER,
            P005918_n507TBM32_CRF_ITEM_GRP_ORDER, P005918_A508TBM32_LOCATION_X, P005918_n508TBM32_LOCATION_X, P005918_A509TBM32_LOCATION_Y, P005918_n509TBM32_LOCATION_Y, P005918_A510TBM32_LOCATION_X2, P005918_n510TBM32_LOCATION_X2, P005918_A511TBM32_LOCATION_Y2, P005918_n511TBM32_LOCATION_Y2, P005918_A512TBM32_TEXT_ALIGN_DIV,
            P005918_n512TBM32_TEXT_ALIGN_DIV, P005918_A516TBM32_TEXT_MAXROWS, P005918_n516TBM32_TEXT_MAXROWS, P005918_A517TBM32_TEXT_MAXLENGTH, P005918_n517TBM32_TEXT_MAXLENGTH, P005918_A518TBM32_DECIMAL_DIGITS, P005918_n518TBM32_DECIMAL_DIGITS, P005918_A522TBM32_CHK_TRUE_INNER_VALUE, P005918_n522TBM32_CHK_TRUE_INNER_VALUE, P005918_A523TBM32_CHK_FALSE_INNER_VALUE,
            P005918_n523TBM32_CHK_FALSE_INNER_VALUE, P005918_A527TBM32_FIXED_VALUE, P005918_n527TBM32_FIXED_VALUE, P005918_A525TBM32_LIST_CD, P005918_n525TBM32_LIST_CD, P005918_A526TBM32_IMAGE_CD, P005918_n526TBM32_IMAGE_CD, P005918_A524TBM32_TEXT, P005918_n524TBM32_TEXT, P005918_A513TBM32_FONT_SIZE,
            P005918_n513TBM32_FONT_SIZE, P005918_A514TBM32_FONT_UL_FLG, P005918_n514TBM32_FONT_UL_FLG, P005918_A515TBM32_FONT_COLOR_DIV, P005918_n515TBM32_FONT_COLOR_DIV, P005918_A521TBM32_LINE_SIZE_DIV, P005918_n521TBM32_LINE_SIZE_DIV, P005918_A689TBM32_LINE_COLOR_DIV, P005918_n689TBM32_LINE_COLOR_DIV, P005918_A519TBM32_LINE_START_POINT_DIV,
            P005918_n519TBM32_LINE_START_POINT_DIV, P005918_A520TBM32_LINE_END_POINT_DIV, P005918_n520TBM32_LINE_END_POINT_DIV, P005918_A690TBM32_LINE_ANGLE, P005918_n690TBM32_LINE_ANGLE, P005918_A644TBM32_AUTH_LVL_MIN, P005918_n644TBM32_AUTH_LVL_MIN, P005918_A645TBM32_ZORDER, P005918_n645TBM32_ZORDER, P005918_A691TBM32_TAB_ORDER,
            P005918_n691TBM32_TAB_ORDER, P005918_A692TBM32_TABSTOP_FLG, P005918_n692TBM32_TABSTOP_FLG, P005918_A693TBM32_REQUIRED_INPUT_FLG, P005918_n693TBM32_REQUIRED_INPUT_FLG, P005918_A694TBM32_MIN_VALUE, P005918_n694TBM32_MIN_VALUE, P005918_A695TBM32_MAX_VALUE, P005918_n695TBM32_MAX_VALUE, P005918_A406TBM32_CRF_ITEM_NOTE,
            P005918_n406TBM32_CRF_ITEM_NOTE, P005918_A774TBM32_REF_CRF_ID, P005918_n774TBM32_REF_CRF_ID, P005918_A775TBM32_REF_CRF_ITEM_CD, P005918_n775TBM32_REF_CRF_ITEM_CD, P005918_A75TBM32_DEL_FLG, P005918_n75TBM32_DEL_FLG, P005918_A407TBM32_CRT_DATETIME, P005918_n407TBM32_CRT_DATETIME, P005918_A408TBM32_CRT_USER_ID,
            P005918_n408TBM32_CRT_USER_ID, P005918_A409TBM32_CRT_PROG_NM, P005918_n409TBM32_CRT_PROG_NM, P005918_A410TBM32_UPD_DATETIME, P005918_n410TBM32_UPD_DATETIME, P005918_A411TBM32_UPD_USER_ID, P005918_n411TBM32_UPD_USER_ID, P005918_A412TBM32_UPD_PROG_NM, P005918_n412TBM32_UPD_PROG_NM, P005918_A413TBM32_UPD_CNT,
            P005918_n413TBM32_UPD_CNT
            }
            , new Object[] {
            }
            , new Object[] {
            P005920_A29TBM34_CRF_ID, P005920_A28TBM34_STUDY_ID, P005920_A30TBM34_STYDY_AUTH_CD, P005920_A571TBM34_DISPLAY_FLG, P005920_n571TBM34_DISPLAY_FLG, P005920_A572TBM34_DEL_FLG, P005920_n572TBM34_DEL_FLG, P005920_A573TBM34_CRT_DATETIME, P005920_n573TBM34_CRT_DATETIME, P005920_A574TBM34_CRT_USER_ID,
            P005920_n574TBM34_CRT_USER_ID, P005920_A575TBM34_CRT_PROG_NM, P005920_n575TBM34_CRT_PROG_NM, P005920_A576TBM34_UPD_DATETIME, P005920_n576TBM34_UPD_DATETIME, P005920_A577TBM34_UPD_USER_ID, P005920_n577TBM34_UPD_USER_ID, P005920_A578TBM34_UPD_PROG_NM, P005920_n578TBM34_UPD_PROG_NM, P005920_A579TBM34_UPD_CNT,
            P005920_n579TBM34_UPD_CNT
            }
            , new Object[] {
            }
            , new Object[] {
            P005922_A946TBM44_CRF_ID, P005922_A945TBM44_STUDY_ID, P005922_A947TBM44_CRF_EDA_NO, P005922_A948TBM44_VISIT_NO, P005922_n948TBM44_VISIT_NO, P005922_A949TBM44_DEL_FLG, P005922_n949TBM44_DEL_FLG, P005922_A950TBM44_CRT_DATETIME, P005922_n950TBM44_CRT_DATETIME, P005922_A951TBM44_CRT_USER_ID,
            P005922_n951TBM44_CRT_USER_ID, P005922_A952TBM44_CRT_PROG_NM, P005922_n952TBM44_CRT_PROG_NM, P005922_A953TBM44_UPD_DATETIME, P005922_n953TBM44_UPD_DATETIME, P005922_A954TBM44_UPD_USER_ID, P005922_n954TBM44_UPD_USER_ID, P005922_A955TBM44_UPD_PROG_NM, P005922_n955TBM44_UPD_PROG_NM, P005922_A956TBM44_UPD_CNT,
            P005922_n956TBM44_UPD_CNT
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

   private byte A516TBM32_TEXT_MAXROWS ;
   private byte A518TBM32_DECIMAL_DIGITS ;
   private byte A513TBM32_FONT_SIZE ;
   private byte A521TBM32_LINE_SIZE_DIV ;
   private byte A644TBM32_AUTH_LVL_MIN ;
   private byte A947TBM44_CRF_EDA_NO ;
   private short AV12W_RTN_CD ;
   private short A32TBM35_CRF_ID ;
   private short A20TBM41_CRF_ID ;
   private short A80TBM37_CRF_ID ;
   private short A501TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private short A86TBM37_DOM_ITM_GRP_ROWNO ;
   private short A38TBM36_SELECT_CRF_ID ;
   private short A36TBM36_CRF_ID ;
   private short A37TBM36_COND_NO ;
   private short A77TBM33_CRF_ID ;
   private short A78TBM33_COND_NO ;
   private short A415TBM33_PRIOR_NO ;
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
   private short A29TBM34_CRF_ID ;
   private short A946TBM44_CRF_ID ;
   private short AV16W_ERR_CD ;
   private short GXv_int5[] ;
   private short Gx_err ;
   private int A83TBM37_VISIT_NO ;
   private int A948TBM44_VISIT_NO ;
   private int GXActiveErrHndl ;
   private long A31TBM35_STUDY_ID ;
   private long A588TBM35_UPD_CNT ;
   private long A19TBM41_STUDY_ID ;
   private long A432TBM41_UPD_CNT ;
   private long A79TBM37_STUDY_ID ;
   private long A440TBM37_UPD_CNT ;
   private long A35TBM36_STUDY_ID ;
   private long A596TBM36_UPD_CNT ;
   private long A76TBM33_STUDY_ID ;
   private long A423TBM33_UPD_CNT ;
   private long A70TBM32_STUDY_ID ;
   private long A515TBM32_FONT_COLOR_DIV ;
   private long A689TBM32_LINE_COLOR_DIV ;
   private long A413TBM32_UPD_CNT ;
   private long A28TBM34_STUDY_ID ;
   private long A579TBM34_UPD_CNT ;
   private long A945TBM44_STUDY_ID ;
   private long A956TBM44_UPD_CNT ;
   private String Gx_ope ;
   private String Gx_etb ;
   private String scmdbuf ;
   private String AV28Pgmname ;
   private String GXt_char1 ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String GXv_char2[] ;
   private String Gx_emsg ;
   private java.util.Date A582TBM35_CRT_DATETIME ;
   private java.util.Date A585TBM35_UPD_DATETIME ;
   private java.util.Date A426TBM41_CRT_DATETIME ;
   private java.util.Date A429TBM41_UPD_DATETIME ;
   private java.util.Date A434TBM37_CRT_DATETIME ;
   private java.util.Date A437TBM37_UPD_DATETIME ;
   private java.util.Date A590TBM36_CRT_DATETIME ;
   private java.util.Date A593TBM36_UPD_DATETIME ;
   private java.util.Date A417TBM33_CRT_DATETIME ;
   private java.util.Date A420TBM33_UPD_DATETIME ;
   private java.util.Date A407TBM32_CRT_DATETIME ;
   private java.util.Date A410TBM32_UPD_DATETIME ;
   private java.util.Date A573TBM34_CRT_DATETIME ;
   private java.util.Date A576TBM34_UPD_DATETIME ;
   private java.util.Date A950TBM44_CRT_DATETIME ;
   private java.util.Date A953TBM44_UPD_DATETIME ;
   private boolean returnInSub ;
   private boolean n580TBM35_DISPLAY_FLG ;
   private boolean n581TBM35_DEL_FLG ;
   private boolean n582TBM35_CRT_DATETIME ;
   private boolean n583TBM35_CRT_USER_ID ;
   private boolean n584TBM35_CRT_PROG_NM ;
   private boolean n585TBM35_UPD_DATETIME ;
   private boolean n586TBM35_UPD_USER_ID ;
   private boolean n587TBM35_UPD_PROG_NM ;
   private boolean n588TBM35_UPD_CNT ;
   private boolean n424TBM41_NCM_METADATA_ID ;
   private boolean n425TBM41_DEL_FLG ;
   private boolean n426TBM41_CRT_DATETIME ;
   private boolean n427TBM41_CRT_USER_ID ;
   private boolean n428TBM41_CRT_PROG_NM ;
   private boolean n429TBM41_UPD_DATETIME ;
   private boolean n430TBM41_UPD_USER_ID ;
   private boolean n431TBM41_UPD_PROG_NM ;
   private boolean n432TBM41_UPD_CNT ;
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
   private boolean n589TBM36_DEL_FLG ;
   private boolean n590TBM36_CRT_DATETIME ;
   private boolean n591TBM36_CRT_USER_ID ;
   private boolean n592TBM36_CRT_PROG_NM ;
   private boolean n593TBM36_UPD_DATETIME ;
   private boolean n594TBM36_UPD_USER_ID ;
   private boolean n595TBM36_UPD_PROG_NM ;
   private boolean n596TBM36_UPD_CNT ;
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
   private boolean n571TBM34_DISPLAY_FLG ;
   private boolean n572TBM34_DEL_FLG ;
   private boolean n573TBM34_CRT_DATETIME ;
   private boolean n574TBM34_CRT_USER_ID ;
   private boolean n575TBM34_CRT_PROG_NM ;
   private boolean n576TBM34_UPD_DATETIME ;
   private boolean n577TBM34_UPD_USER_ID ;
   private boolean n578TBM34_UPD_PROG_NM ;
   private boolean n579TBM34_UPD_CNT ;
   private boolean n948TBM44_VISIT_NO ;
   private boolean n949TBM44_DEL_FLG ;
   private boolean n950TBM44_CRT_DATETIME ;
   private boolean n951TBM44_CRT_USER_ID ;
   private boolean n952TBM44_CRT_PROG_NM ;
   private boolean n953TBM44_UPD_DATETIME ;
   private boolean n954TBM44_UPD_USER_ID ;
   private boolean n955TBM44_UPD_PROG_NM ;
   private boolean n956TBM44_UPD_CNT ;
   private String AV13W_RTN_MSG ;
   private String AV8C_APP_ID ;
   private String A33TBM35_CRF_ITEM_CD ;
   private String A34TBM35_STUDY_AUTH_CD ;
   private String A580TBM35_DISPLAY_FLG ;
   private String A581TBM35_DEL_FLG ;
   private String A583TBM35_CRT_USER_ID ;
   private String A584TBM35_CRT_PROG_NM ;
   private String A586TBM35_UPD_USER_ID ;
   private String A587TBM35_UPD_PROG_NM ;
   private String A21TBM41_CRF_ITEM_GRP_DIV ;
   private String A22TBM41_CRF_ITEM_GRP_CD ;
   private String A424TBM41_NCM_METADATA_ID ;
   private String A425TBM41_DEL_FLG ;
   private String A427TBM41_CRT_USER_ID ;
   private String A428TBM41_CRT_PROG_NM ;
   private String A430TBM41_UPD_USER_ID ;
   private String A431TBM41_UPD_PROG_NM ;
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
   private String A589TBM36_DEL_FLG ;
   private String A591TBM36_CRT_USER_ID ;
   private String A592TBM36_CRT_PROG_NM ;
   private String A594TBM36_UPD_USER_ID ;
   private String A595TBM36_UPD_PROG_NM ;
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
   private String A30TBM34_STYDY_AUTH_CD ;
   private String A571TBM34_DISPLAY_FLG ;
   private String A572TBM34_DEL_FLG ;
   private String A574TBM34_CRT_USER_ID ;
   private String A575TBM34_CRT_PROG_NM ;
   private String A577TBM34_UPD_USER_ID ;
   private String A578TBM34_UPD_PROG_NM ;
   private String A949TBM44_DEL_FLG ;
   private String A951TBM44_CRT_USER_ID ;
   private String A952TBM44_CRT_PROG_NM ;
   private String A954TBM44_UPD_USER_ID ;
   private String A955TBM44_UPD_PROG_NM ;
   private String AV10W_ERRCD ;
   private String AV15W_MSG ;
   private String AV17W_ERR_MSG ;
   private short[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private short[] P00598_A32TBM35_CRF_ID ;
   private long[] P00598_A31TBM35_STUDY_ID ;
   private String[] P00598_A33TBM35_CRF_ITEM_CD ;
   private String[] P00598_A34TBM35_STUDY_AUTH_CD ;
   private String[] P00598_A580TBM35_DISPLAY_FLG ;
   private boolean[] P00598_n580TBM35_DISPLAY_FLG ;
   private String[] P00598_A581TBM35_DEL_FLG ;
   private boolean[] P00598_n581TBM35_DEL_FLG ;
   private java.util.Date[] P00598_A582TBM35_CRT_DATETIME ;
   private boolean[] P00598_n582TBM35_CRT_DATETIME ;
   private String[] P00598_A583TBM35_CRT_USER_ID ;
   private boolean[] P00598_n583TBM35_CRT_USER_ID ;
   private String[] P00598_A584TBM35_CRT_PROG_NM ;
   private boolean[] P00598_n584TBM35_CRT_PROG_NM ;
   private java.util.Date[] P00598_A585TBM35_UPD_DATETIME ;
   private boolean[] P00598_n585TBM35_UPD_DATETIME ;
   private String[] P00598_A586TBM35_UPD_USER_ID ;
   private boolean[] P00598_n586TBM35_UPD_USER_ID ;
   private String[] P00598_A587TBM35_UPD_PROG_NM ;
   private boolean[] P00598_n587TBM35_UPD_PROG_NM ;
   private long[] P00598_A588TBM35_UPD_CNT ;
   private boolean[] P00598_n588TBM35_UPD_CNT ;
   private short[] P005910_A20TBM41_CRF_ID ;
   private long[] P005910_A19TBM41_STUDY_ID ;
   private String[] P005910_A21TBM41_CRF_ITEM_GRP_DIV ;
   private String[] P005910_A22TBM41_CRF_ITEM_GRP_CD ;
   private String[] P005910_A424TBM41_NCM_METADATA_ID ;
   private boolean[] P005910_n424TBM41_NCM_METADATA_ID ;
   private String[] P005910_A425TBM41_DEL_FLG ;
   private boolean[] P005910_n425TBM41_DEL_FLG ;
   private java.util.Date[] P005910_A426TBM41_CRT_DATETIME ;
   private boolean[] P005910_n426TBM41_CRT_DATETIME ;
   private String[] P005910_A427TBM41_CRT_USER_ID ;
   private boolean[] P005910_n427TBM41_CRT_USER_ID ;
   private String[] P005910_A428TBM41_CRT_PROG_NM ;
   private boolean[] P005910_n428TBM41_CRT_PROG_NM ;
   private java.util.Date[] P005910_A429TBM41_UPD_DATETIME ;
   private boolean[] P005910_n429TBM41_UPD_DATETIME ;
   private String[] P005910_A430TBM41_UPD_USER_ID ;
   private boolean[] P005910_n430TBM41_UPD_USER_ID ;
   private String[] P005910_A431TBM41_UPD_PROG_NM ;
   private boolean[] P005910_n431TBM41_UPD_PROG_NM ;
   private long[] P005910_A432TBM41_UPD_CNT ;
   private boolean[] P005910_n432TBM41_UPD_CNT ;
   private short[] P005912_A80TBM37_CRF_ID ;
   private long[] P005912_A79TBM37_STUDY_ID ;
   private String[] P005912_A81TBM37_CRF_ITEM_GRP_DIV ;
   private String[] P005912_A82TBM37_CRF_ITEM_GRP_CD ;
   private int[] P005912_A83TBM37_VISIT_NO ;
   private boolean[] P005912_n83TBM37_VISIT_NO ;
   private String[] P005912_A84TBM37_DOM_CD ;
   private boolean[] P005912_n84TBM37_DOM_CD ;
   private String[] P005912_A500TBM37_DOM_VAR_NM ;
   private boolean[] P005912_n500TBM37_DOM_VAR_NM ;
   private String[] P005912_A85TBM37_DOM_ITM_GRP_OID ;
   private boolean[] P005912_n85TBM37_DOM_ITM_GRP_OID ;
   private short[] P005912_A501TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private boolean[] P005912_n501TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private short[] P005912_A86TBM37_DOM_ITM_GRP_ROWNO ;
   private boolean[] P005912_n86TBM37_DOM_ITM_GRP_ROWNO ;
   private String[] P005912_A433TBM37_DEL_FLG ;
   private boolean[] P005912_n433TBM37_DEL_FLG ;
   private java.util.Date[] P005912_A434TBM37_CRT_DATETIME ;
   private boolean[] P005912_n434TBM37_CRT_DATETIME ;
   private String[] P005912_A435TBM37_CRT_USER_ID ;
   private boolean[] P005912_n435TBM37_CRT_USER_ID ;
   private String[] P005912_A436TBM37_CRT_PROG_NM ;
   private boolean[] P005912_n436TBM37_CRT_PROG_NM ;
   private java.util.Date[] P005912_A437TBM37_UPD_DATETIME ;
   private boolean[] P005912_n437TBM37_UPD_DATETIME ;
   private String[] P005912_A438TBM37_UPD_USER_ID ;
   private boolean[] P005912_n438TBM37_UPD_USER_ID ;
   private String[] P005912_A439TBM37_UPD_PROG_NM ;
   private boolean[] P005912_n439TBM37_UPD_PROG_NM ;
   private long[] P005912_A440TBM37_UPD_CNT ;
   private boolean[] P005912_n440TBM37_UPD_CNT ;
   private short[] P005914_A38TBM36_SELECT_CRF_ID ;
   private long[] P005914_A35TBM36_STUDY_ID ;
   private short[] P005914_A36TBM36_CRF_ID ;
   private short[] P005914_A37TBM36_COND_NO ;
   private String[] P005914_A589TBM36_DEL_FLG ;
   private boolean[] P005914_n589TBM36_DEL_FLG ;
   private java.util.Date[] P005914_A590TBM36_CRT_DATETIME ;
   private boolean[] P005914_n590TBM36_CRT_DATETIME ;
   private String[] P005914_A591TBM36_CRT_USER_ID ;
   private boolean[] P005914_n591TBM36_CRT_USER_ID ;
   private String[] P005914_A592TBM36_CRT_PROG_NM ;
   private boolean[] P005914_n592TBM36_CRT_PROG_NM ;
   private java.util.Date[] P005914_A593TBM36_UPD_DATETIME ;
   private boolean[] P005914_n593TBM36_UPD_DATETIME ;
   private String[] P005914_A594TBM36_UPD_USER_ID ;
   private boolean[] P005914_n594TBM36_UPD_USER_ID ;
   private String[] P005914_A595TBM36_UPD_PROG_NM ;
   private boolean[] P005914_n595TBM36_UPD_PROG_NM ;
   private long[] P005914_A596TBM36_UPD_CNT ;
   private boolean[] P005914_n596TBM36_UPD_CNT ;
   private short[] P005916_A77TBM33_CRF_ID ;
   private long[] P005916_A76TBM33_STUDY_ID ;
   private short[] P005916_A78TBM33_COND_NO ;
   private String[] P005916_A502TBM33_COND_NM ;
   private boolean[] P005916_n502TBM33_COND_NM ;
   private String[] P005916_A414TBM33_EXPRESSION ;
   private boolean[] P005916_n414TBM33_EXPRESSION ;
   private String[] P005916_A503TBM33_COND_DIV ;
   private boolean[] P005916_n503TBM33_COND_DIV ;
   private String[] P005916_A504TBM33_CRF_ITEM_CD ;
   private boolean[] P005916_n504TBM33_CRF_ITEM_CD ;
   private short[] P005916_A415TBM33_PRIOR_NO ;
   private boolean[] P005916_n415TBM33_PRIOR_NO ;
   private String[] P005916_A505TBM33_ERR_DIV ;
   private boolean[] P005916_n505TBM33_ERR_DIV ;
   private String[] P005916_A506TBM33_ERR_MSG ;
   private boolean[] P005916_n506TBM33_ERR_MSG ;
   private String[] P005916_A646TBM33_ENABLED_FLG ;
   private boolean[] P005916_n646TBM33_ENABLED_FLG ;
   private String[] P005916_A696TBM33_REQUIRED_INPUT_FLG ;
   private boolean[] P005916_n696TBM33_REQUIRED_INPUT_FLG ;
   private String[] P005916_A697TBM33_NUMERIC_RANGE_FLG ;
   private boolean[] P005916_n697TBM33_NUMERIC_RANGE_FLG ;
   private String[] P005916_A416TBM33_DEL_FLG ;
   private boolean[] P005916_n416TBM33_DEL_FLG ;
   private java.util.Date[] P005916_A417TBM33_CRT_DATETIME ;
   private boolean[] P005916_n417TBM33_CRT_DATETIME ;
   private String[] P005916_A418TBM33_CRT_USER_ID ;
   private boolean[] P005916_n418TBM33_CRT_USER_ID ;
   private String[] P005916_A419TBM33_CRT_PROG_NM ;
   private boolean[] P005916_n419TBM33_CRT_PROG_NM ;
   private java.util.Date[] P005916_A420TBM33_UPD_DATETIME ;
   private boolean[] P005916_n420TBM33_UPD_DATETIME ;
   private String[] P005916_A421TBM33_UPD_USER_ID ;
   private boolean[] P005916_n421TBM33_UPD_USER_ID ;
   private String[] P005916_A422TBM33_UPD_PROG_NM ;
   private boolean[] P005916_n422TBM33_UPD_PROG_NM ;
   private long[] P005916_A423TBM33_UPD_CNT ;
   private boolean[] P005916_n423TBM33_UPD_CNT ;
   private short[] P005918_A71TBM32_CRF_ID ;
   private long[] P005918_A70TBM32_STUDY_ID ;
   private String[] P005918_A72TBM32_CRF_ITEM_CD ;
   private String[] P005918_A405TBM32_CRF_ITEM_NM ;
   private boolean[] P005918_n405TBM32_CRF_ITEM_NM ;
   private String[] P005918_A74TBM32_CRF_ITEM_DIV ;
   private boolean[] P005918_n74TBM32_CRF_ITEM_DIV ;
   private String[] P005918_A73TBM32_CRF_ITEM_GRP_CD ;
   private boolean[] P005918_n73TBM32_CRF_ITEM_GRP_CD ;
   private short[] P005918_A507TBM32_CRF_ITEM_GRP_ORDER ;
   private boolean[] P005918_n507TBM32_CRF_ITEM_GRP_ORDER ;
   private short[] P005918_A508TBM32_LOCATION_X ;
   private boolean[] P005918_n508TBM32_LOCATION_X ;
   private short[] P005918_A509TBM32_LOCATION_Y ;
   private boolean[] P005918_n509TBM32_LOCATION_Y ;
   private short[] P005918_A510TBM32_LOCATION_X2 ;
   private boolean[] P005918_n510TBM32_LOCATION_X2 ;
   private short[] P005918_A511TBM32_LOCATION_Y2 ;
   private boolean[] P005918_n511TBM32_LOCATION_Y2 ;
   private String[] P005918_A512TBM32_TEXT_ALIGN_DIV ;
   private boolean[] P005918_n512TBM32_TEXT_ALIGN_DIV ;
   private byte[] P005918_A516TBM32_TEXT_MAXROWS ;
   private boolean[] P005918_n516TBM32_TEXT_MAXROWS ;
   private short[] P005918_A517TBM32_TEXT_MAXLENGTH ;
   private boolean[] P005918_n517TBM32_TEXT_MAXLENGTH ;
   private byte[] P005918_A518TBM32_DECIMAL_DIGITS ;
   private boolean[] P005918_n518TBM32_DECIMAL_DIGITS ;
   private String[] P005918_A522TBM32_CHK_TRUE_INNER_VALUE ;
   private boolean[] P005918_n522TBM32_CHK_TRUE_INNER_VALUE ;
   private String[] P005918_A523TBM32_CHK_FALSE_INNER_VALUE ;
   private boolean[] P005918_n523TBM32_CHK_FALSE_INNER_VALUE ;
   private String[] P005918_A527TBM32_FIXED_VALUE ;
   private boolean[] P005918_n527TBM32_FIXED_VALUE ;
   private String[] P005918_A525TBM32_LIST_CD ;
   private boolean[] P005918_n525TBM32_LIST_CD ;
   private String[] P005918_A526TBM32_IMAGE_CD ;
   private boolean[] P005918_n526TBM32_IMAGE_CD ;
   private String[] P005918_A524TBM32_TEXT ;
   private boolean[] P005918_n524TBM32_TEXT ;
   private byte[] P005918_A513TBM32_FONT_SIZE ;
   private boolean[] P005918_n513TBM32_FONT_SIZE ;
   private String[] P005918_A514TBM32_FONT_UL_FLG ;
   private boolean[] P005918_n514TBM32_FONT_UL_FLG ;
   private long[] P005918_A515TBM32_FONT_COLOR_DIV ;
   private boolean[] P005918_n515TBM32_FONT_COLOR_DIV ;
   private byte[] P005918_A521TBM32_LINE_SIZE_DIV ;
   private boolean[] P005918_n521TBM32_LINE_SIZE_DIV ;
   private long[] P005918_A689TBM32_LINE_COLOR_DIV ;
   private boolean[] P005918_n689TBM32_LINE_COLOR_DIV ;
   private String[] P005918_A519TBM32_LINE_START_POINT_DIV ;
   private boolean[] P005918_n519TBM32_LINE_START_POINT_DIV ;
   private String[] P005918_A520TBM32_LINE_END_POINT_DIV ;
   private boolean[] P005918_n520TBM32_LINE_END_POINT_DIV ;
   private short[] P005918_A690TBM32_LINE_ANGLE ;
   private boolean[] P005918_n690TBM32_LINE_ANGLE ;
   private byte[] P005918_A644TBM32_AUTH_LVL_MIN ;
   private boolean[] P005918_n644TBM32_AUTH_LVL_MIN ;
   private short[] P005918_A645TBM32_ZORDER ;
   private boolean[] P005918_n645TBM32_ZORDER ;
   private short[] P005918_A691TBM32_TAB_ORDER ;
   private boolean[] P005918_n691TBM32_TAB_ORDER ;
   private String[] P005918_A692TBM32_TABSTOP_FLG ;
   private boolean[] P005918_n692TBM32_TABSTOP_FLG ;
   private String[] P005918_A693TBM32_REQUIRED_INPUT_FLG ;
   private boolean[] P005918_n693TBM32_REQUIRED_INPUT_FLG ;
   private String[] P005918_A694TBM32_MIN_VALUE ;
   private boolean[] P005918_n694TBM32_MIN_VALUE ;
   private String[] P005918_A695TBM32_MAX_VALUE ;
   private boolean[] P005918_n695TBM32_MAX_VALUE ;
   private String[] P005918_A406TBM32_CRF_ITEM_NOTE ;
   private boolean[] P005918_n406TBM32_CRF_ITEM_NOTE ;
   private short[] P005918_A774TBM32_REF_CRF_ID ;
   private boolean[] P005918_n774TBM32_REF_CRF_ID ;
   private String[] P005918_A775TBM32_REF_CRF_ITEM_CD ;
   private boolean[] P005918_n775TBM32_REF_CRF_ITEM_CD ;
   private String[] P005918_A75TBM32_DEL_FLG ;
   private boolean[] P005918_n75TBM32_DEL_FLG ;
   private java.util.Date[] P005918_A407TBM32_CRT_DATETIME ;
   private boolean[] P005918_n407TBM32_CRT_DATETIME ;
   private String[] P005918_A408TBM32_CRT_USER_ID ;
   private boolean[] P005918_n408TBM32_CRT_USER_ID ;
   private String[] P005918_A409TBM32_CRT_PROG_NM ;
   private boolean[] P005918_n409TBM32_CRT_PROG_NM ;
   private java.util.Date[] P005918_A410TBM32_UPD_DATETIME ;
   private boolean[] P005918_n410TBM32_UPD_DATETIME ;
   private String[] P005918_A411TBM32_UPD_USER_ID ;
   private boolean[] P005918_n411TBM32_UPD_USER_ID ;
   private String[] P005918_A412TBM32_UPD_PROG_NM ;
   private boolean[] P005918_n412TBM32_UPD_PROG_NM ;
   private long[] P005918_A413TBM32_UPD_CNT ;
   private boolean[] P005918_n413TBM32_UPD_CNT ;
   private short[] P005920_A29TBM34_CRF_ID ;
   private long[] P005920_A28TBM34_STUDY_ID ;
   private String[] P005920_A30TBM34_STYDY_AUTH_CD ;
   private String[] P005920_A571TBM34_DISPLAY_FLG ;
   private boolean[] P005920_n571TBM34_DISPLAY_FLG ;
   private String[] P005920_A572TBM34_DEL_FLG ;
   private boolean[] P005920_n572TBM34_DEL_FLG ;
   private java.util.Date[] P005920_A573TBM34_CRT_DATETIME ;
   private boolean[] P005920_n573TBM34_CRT_DATETIME ;
   private String[] P005920_A574TBM34_CRT_USER_ID ;
   private boolean[] P005920_n574TBM34_CRT_USER_ID ;
   private String[] P005920_A575TBM34_CRT_PROG_NM ;
   private boolean[] P005920_n575TBM34_CRT_PROG_NM ;
   private java.util.Date[] P005920_A576TBM34_UPD_DATETIME ;
   private boolean[] P005920_n576TBM34_UPD_DATETIME ;
   private String[] P005920_A577TBM34_UPD_USER_ID ;
   private boolean[] P005920_n577TBM34_UPD_USER_ID ;
   private String[] P005920_A578TBM34_UPD_PROG_NM ;
   private boolean[] P005920_n578TBM34_UPD_PROG_NM ;
   private long[] P005920_A579TBM34_UPD_CNT ;
   private boolean[] P005920_n579TBM34_UPD_CNT ;
   private short[] P005922_A946TBM44_CRF_ID ;
   private long[] P005922_A945TBM44_STUDY_ID ;
   private byte[] P005922_A947TBM44_CRF_EDA_NO ;
   private int[] P005922_A948TBM44_VISIT_NO ;
   private boolean[] P005922_n948TBM44_VISIT_NO ;
   private String[] P005922_A949TBM44_DEL_FLG ;
   private boolean[] P005922_n949TBM44_DEL_FLG ;
   private java.util.Date[] P005922_A950TBM44_CRT_DATETIME ;
   private boolean[] P005922_n950TBM44_CRT_DATETIME ;
   private String[] P005922_A951TBM44_CRT_USER_ID ;
   private boolean[] P005922_n951TBM44_CRT_USER_ID ;
   private String[] P005922_A952TBM44_CRT_PROG_NM ;
   private boolean[] P005922_n952TBM44_CRT_PROG_NM ;
   private java.util.Date[] P005922_A953TBM44_UPD_DATETIME ;
   private boolean[] P005922_n953TBM44_UPD_DATETIME ;
   private String[] P005922_A954TBM44_UPD_USER_ID ;
   private boolean[] P005922_n954TBM44_UPD_USER_ID ;
   private String[] P005922_A955TBM44_UPD_PROG_NM ;
   private boolean[] P005922_n955TBM44_UPD_PROG_NM ;
   private long[] P005922_A956TBM44_UPD_CNT ;
   private boolean[] P005922_n956TBM44_UPD_CNT ;
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
         ,new ForEachCursor("P00598", "SELECT `TBM35_CRF_ID`, `TBM35_STUDY_ID`, `TBM35_CRF_ITEM_CD`, `TBM35_STUDY_AUTH_CD`, `TBM35_DISPLAY_FLG`, `TBM35_DEL_FLG`, `TBM35_CRT_DATETIME`, `TBM35_CRT_USER_ID`, `TBM35_CRT_PROG_NM`, `TBM35_UPD_DATETIME`, `TBM35_UPD_USER_ID`, `TBM35_UPD_PROG_NM`, `TBM35_UPD_CNT` FROM `TBM35_CRF_ITEM_AUTH` WHERE `TBM35_STUDY_ID` = ? and `TBM35_CRF_ID` = ? ORDER BY `TBM35_STUDY_ID`, `TBM35_CRF_ID`  FOR UPDATE ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new UpdateCursor("P00599", "DELETE FROM `TBM35_CRF_ITEM_AUTH`  WHERE `TBM35_STUDY_ID` = ? AND `TBM35_CRF_ID` = ? AND `TBM35_CRF_ITEM_CD` = ? AND `TBM35_STUDY_AUTH_CD` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new ForEachCursor("P005910", "SELECT `TBM41_CRF_ID`, `TBM41_STUDY_ID`, `TBM41_CRF_ITEM_GRP_DIV`, `TBM41_CRF_ITEM_GRP_CD`, `TBM41_NCM_METADATA_ID`, `TBM41_DEL_FLG`, `TBM41_CRT_DATETIME`, `TBM41_CRT_USER_ID`, `TBM41_CRT_PROG_NM`, `TBM41_UPD_DATETIME`, `TBM41_UPD_USER_ID`, `TBM41_UPD_PROG_NM`, `TBM41_UPD_CNT` FROM `TBM41_CRF_NCM_MAP` WHERE `TBM41_STUDY_ID` = ? and `TBM41_CRF_ID` = ? ORDER BY `TBM41_STUDY_ID`, `TBM41_CRF_ID`  FOR UPDATE ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new UpdateCursor("P005911", "DELETE FROM `TBM41_CRF_NCM_MAP`  WHERE `TBM41_STUDY_ID` = ? AND `TBM41_CRF_ID` = ? AND `TBM41_CRF_ITEM_GRP_DIV` = ? AND `TBM41_CRF_ITEM_GRP_CD` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new ForEachCursor("P005912", "SELECT `TBM37_CRF_ID`, `TBM37_STUDY_ID`, `TBM37_CRF_ITEM_GRP_DIV`, `TBM37_CRF_ITEM_GRP_CD`, `TBM37_VISIT_NO`, `TBM37_DOM_CD`, `TBM37_DOM_VAR_NM`, `TBM37_DOM_ITM_GRP_OID`, `TBM37_DOM_ITM_GRP_ATTR_SEQ`, `TBM37_DOM_ITM_GRP_ROWNO`, `TBM37_DEL_FLG`, `TBM37_CRT_DATETIME`, `TBM37_CRT_USER_ID`, `TBM37_CRT_PROG_NM`, `TBM37_UPD_DATETIME`, `TBM37_UPD_USER_ID`, `TBM37_UPD_PROG_NM`, `TBM37_UPD_CNT` FROM `TBM37_CRF_DOM_MAP` WHERE `TBM37_STUDY_ID` = ? and `TBM37_CRF_ID` = ? ORDER BY `TBM37_STUDY_ID`, `TBM37_CRF_ID`  FOR UPDATE ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new UpdateCursor("P005913", "DELETE FROM `TBM37_CRF_DOM_MAP`  WHERE `TBM37_STUDY_ID` = ? AND `TBM37_CRF_ID` = ? AND `TBM37_CRF_ITEM_GRP_DIV` = ? AND `TBM37_CRF_ITEM_GRP_CD` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new ForEachCursor("P005914", "SELECT `TBM36_SELECT_CRF_ID`, `TBM36_STUDY_ID`, `TBM36_CRF_ID`, `TBM36_COND_NO`, `TBM36_DEL_FLG`, `TBM36_CRT_DATETIME`, `TBM36_CRT_USER_ID`, `TBM36_CRT_PROG_NM`, `TBM36_UPD_DATETIME`, `TBM36_UPD_USER_ID`, `TBM36_UPD_PROG_NM`, `TBM36_UPD_CNT` FROM `TBM36_CRF_SELECT` WHERE (`TBM36_STUDY_ID` = ?) AND (`TBM36_SELECT_CRF_ID` = ?) ORDER BY `TBM36_STUDY_ID`  FOR UPDATE ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new UpdateCursor("P005915", "DELETE FROM `TBM36_CRF_SELECT`  WHERE `TBM36_STUDY_ID` = ? AND `TBM36_CRF_ID` = ? AND `TBM36_COND_NO` = ? AND `TBM36_SELECT_CRF_ID` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new ForEachCursor("P005916", "SELECT `TBM33_CRF_ID`, `TBM33_STUDY_ID`, `TBM33_COND_NO`, `TBM33_COND_NM`, `TBM33_EXPRESSION`, `TBM33_COND_DIV`, `TBM33_CRF_ITEM_CD`, `TBM33_PRIOR_NO`, `TBM33_ERR_DIV`, `TBM33_ERR_MSG`, `TBM33_ENABLED_FLG`, `TBM33_REQUIRED_INPUT_FLG`, `TBM33_NUMERIC_RANGE_FLG`, `TBM33_DEL_FLG`, `TBM33_CRT_DATETIME`, `TBM33_CRT_USER_ID`, `TBM33_CRT_PROG_NM`, `TBM33_UPD_DATETIME`, `TBM33_UPD_USER_ID`, `TBM33_UPD_PROG_NM`, `TBM33_UPD_CNT` FROM `TBM33_CRF_COND` WHERE `TBM33_STUDY_ID` = ? and `TBM33_CRF_ID` = ? ORDER BY `TBM33_STUDY_ID`, `TBM33_CRF_ID`  FOR UPDATE ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new UpdateCursor("P005917", "DELETE FROM `TBM33_CRF_COND`  WHERE `TBM33_STUDY_ID` = ? AND `TBM33_CRF_ID` = ? AND `TBM33_COND_NO` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new ForEachCursor("P005918", "SELECT `TBM32_CRF_ID`, `TBM32_STUDY_ID`, `TBM32_CRF_ITEM_CD`, `TBM32_CRF_ITEM_NM`, `TBM32_CRF_ITEM_DIV`, `TBM32_CRF_ITEM_GRP_CD`, `TBM32_CRF_ITEM_GRP_ORDER`, `TBM32_LOCATION_X`, `TBM32_LOCATION_Y`, `TBM32_LOCATION_X2`, `TBM32_LOCATION_Y2`, `TBM32_TEXT_ALIGN_DIV`, `TBM32_TEXT_MAXROWS`, `TBM32_TEXT_MAXLENGTH`, `TBM32_DECIMAL_DIGITS`, `TBM32_CHK_TRUE_INNER_VALUE`, `TBM32_CHK_FALSE_INNER_VALUE`, `TBM32_FIXED_VALUE`, `TBM32_LIST_CD`, `TBM32_IMAGE_CD`, `TBM32_TEXT`, `TBM32_FONT_SIZE`, `TBM32_FONT_UL_FLG`, `TBM32_FONT_COLOR_DIV`, `TBM32_LINE_SIZE_DIV`, `TBM32_LINE_COLOR_DIV`, `TBM32_LINE_START_POINT_DIV`, `TBM32_LINE_END_POINT_DIV`, `TBM32_LINE_ANGLE`, `TBM32_AUTH_LVL_MIN`, `TBM32_ZORDER`, `TBM32_TAB_ORDER`, `TBM32_TABSTOP_FLG`, `TBM32_REQUIRED_INPUT_FLG`, `TBM32_MIN_VALUE`, `TBM32_MAX_VALUE`, `TBM32_CRF_ITEM_NOTE`, `TBM32_REF_CRF_ID`, `TBM32_REF_CRF_ITEM_CD`, `TBM32_DEL_FLG`, `TBM32_CRT_DATETIME`, `TBM32_CRT_USER_ID`, `TBM32_CRT_PROG_NM`, `TBM32_UPD_DATETIME`, `TBM32_UPD_USER_ID`, `TBM32_UPD_PROG_NM`, `TBM32_UPD_CNT` FROM `TBM32_CRF_ITEM` WHERE `TBM32_STUDY_ID` = ? and `TBM32_CRF_ID` = ? ORDER BY `TBM32_STUDY_ID`, `TBM32_CRF_ID`  FOR UPDATE ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new UpdateCursor("P005919", "DELETE FROM `TBM32_CRF_ITEM`  WHERE `TBM32_STUDY_ID` = ? AND `TBM32_CRF_ID` = ? AND `TBM32_CRF_ITEM_CD` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new ForEachCursor("P005920", "SELECT `TBM34_CRF_ID`, `TBM34_STUDY_ID`, `TBM34_STYDY_AUTH_CD`, `TBM34_DISPLAY_FLG`, `TBM34_DEL_FLG`, `TBM34_CRT_DATETIME`, `TBM34_CRT_USER_ID`, `TBM34_CRT_PROG_NM`, `TBM34_UPD_DATETIME`, `TBM34_UPD_USER_ID`, `TBM34_UPD_PROG_NM`, `TBM34_UPD_CNT` FROM `TBM34_CRF_AUTH` WHERE `TBM34_STUDY_ID` = ? and `TBM34_CRF_ID` = ? ORDER BY `TBM34_STUDY_ID`, `TBM34_CRF_ID`  FOR UPDATE ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new UpdateCursor("P005921", "DELETE FROM `TBM34_CRF_AUTH`  WHERE `TBM34_STUDY_ID` = ? AND `TBM34_CRF_ID` = ? AND `TBM34_STYDY_AUTH_CD` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new ForEachCursor("P005922", "SELECT `TBM44_CRF_ID`, `TBM44_STUDY_ID`, `TBM44_CRF_EDA_NO`, `TBM44_VISIT_NO`, `TBM44_DEL_FLG`, `TBM44_CRT_DATETIME`, `TBM44_CRT_USER_ID`, `TBM44_CRT_PROG_NM`, `TBM44_UPD_DATETIME`, `TBM44_UPD_USER_ID`, `TBM44_UPD_PROG_NM`, `TBM44_UPD_CNT` FROM `TBM44_CRF_VISIT` WHERE `TBM44_STUDY_ID` = ? and `TBM44_CRF_ID` = ? ORDER BY `TBM44_STUDY_ID`, `TBM44_CRF_ID`  FOR UPDATE ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new UpdateCursor("P005923", "DELETE FROM `TBM44_CRF_VISIT`  WHERE `TBM44_STUDY_ID` = ? AND `TBM44_CRF_ID` = ? AND `TBM44_CRF_EDA_NO` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
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
            case 8 :
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
            case 10 :
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
            case 12 :
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
            case 18 :
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
            case 20 :
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
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 50, false);
               stmt.setVarchar(4, (String)parms[3], 2, false);
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 1, false);
               stmt.setVarchar(4, (String)parms[3], 50, false);
               return;
            case 10 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 11 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 1, false);
               stmt.setVarchar(4, (String)parms[3], 50, false);
               return;
            case 12 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 13 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 14 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 15 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 16 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 17 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 50, false);
               return;
            case 18 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 19 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 2, false);
               return;
            case 20 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 21 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
      }
   }

}

