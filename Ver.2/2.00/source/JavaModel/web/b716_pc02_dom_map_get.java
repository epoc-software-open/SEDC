/*
               File: B716_PC02_DOM_MAP_GET
        Description: ドメインマッピング情報取得
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:13:43.2
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b716_pc02_dom_map_get extends GXProcedure
{
   public b716_pc02_dom_map_get( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b716_pc02_dom_map_get.class ), "" );
   }

   public b716_pc02_dom_map_get( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public short executeUdp( long aP0 ,
                            String aP1 ,
                            GxObjectCollection[] aP2 )
   {
      b716_pc02_dom_map_get.this.AV9P_STUDY_ID = aP0;
      b716_pc02_dom_map_get.this.AV10P_DOM_CD = aP1;
      b716_pc02_dom_map_get.this.aP2 = aP2;
      b716_pc02_dom_map_get.this.aP3 = aP3;
      b716_pc02_dom_map_get.this.aP3 = new short[] {0};
      initialize();
      privateExecute();
      return aP3[0];
   }

   public void execute( long aP0 ,
                        String aP1 ,
                        GxObjectCollection[] aP2 ,
                        short[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( long aP0 ,
                             String aP1 ,
                             GxObjectCollection[] aP2 ,
                             short[] aP3 )
   {
      b716_pc02_dom_map_get.this.AV9P_STUDY_ID = aP0;
      b716_pc02_dom_map_get.this.AV10P_DOM_CD = aP1;
      b716_pc02_dom_map_get.this.aP2 = aP2;
      b716_pc02_dom_map_get.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13B716_SD2_DOM_MAP_C.clear();
      AV16B716_SD3_DOM_VAR_C.clear();
      AV22W_SEQ_POS = (short)(0) ;
      AV23W_CNT = (short)(0) ;
      /* Execute user subroutine: S141 */
      S141 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Using cursor P006X2 */
      pr_default.execute(0, new Object[] {new Long(AV9P_STUDY_ID), AV10P_DOM_CD});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A200TBM43_STUDY_ID = P006X2_A200TBM43_STUDY_ID[0] ;
         A201TBM43_DOM_CD = P006X2_A201TBM43_DOM_CD[0] ;
         A919TBM43_DEL_FLG = P006X2_A919TBM43_DEL_FLG[0] ;
         n919TBM43_DEL_FLG = P006X2_n919TBM43_DEL_FLG[0] ;
         A202TBM43_DOM_VAR_NM = P006X2_A202TBM43_DOM_VAR_NM[0] ;
         A918TBM43_ORDER = P006X2_A918TBM43_ORDER[0] ;
         n918TBM43_ORDER = P006X2_n918TBM43_ORDER[0] ;
         AV23W_CNT = (short)(AV23W_CNT+1) ;
         AV17B716_SD3_DOM_VAR_I = (SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem)new SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem(remoteHandle, context);
         AV17B716_SD3_DOM_VAR_I.setgxTv_SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem_Dom_var_nm( A202TBM43_DOM_VAR_NM );
         AV16B716_SD3_DOM_VAR_C.add(AV17B716_SD3_DOM_VAR_I, 0);
         if ( GXutil.like( A202TBM43_DOM_VAR_NM , GXutil.padr( "%SEQ" , 50 , "%"),  ' ' ) )
         {
            AV22W_SEQ_POS = AV23W_CNT ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV32W_TBM37_CRF_ID = (short)(0) ;
      AV19W_TBM37_VISIT_NO = 0 ;
      AV20W_TBM37_DOM_ITM_GRP_OID = "" ;
      AV21W_TBM37_DOM_ITM_GRP_ROWNO = (short)(0) ;
      AV33W_DATA_CNT = 0 ;
      /* Using cursor P006X3 */
      pr_default.execute(1, new Object[] {new Long(AV9P_STUDY_ID), AV10P_DOM_CD});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A79TBM37_STUDY_ID = P006X3_A79TBM37_STUDY_ID[0] ;
         A84TBM37_DOM_CD = P006X3_A84TBM37_DOM_CD[0] ;
         n84TBM37_DOM_CD = P006X3_n84TBM37_DOM_CD[0] ;
         A433TBM37_DEL_FLG = P006X3_A433TBM37_DEL_FLG[0] ;
         n433TBM37_DEL_FLG = P006X3_n433TBM37_DEL_FLG[0] ;
         A80TBM37_CRF_ID = P006X3_A80TBM37_CRF_ID[0] ;
         A86TBM37_DOM_ITM_GRP_ROWNO = P006X3_A86TBM37_DOM_ITM_GRP_ROWNO[0] ;
         n86TBM37_DOM_ITM_GRP_ROWNO = P006X3_n86TBM37_DOM_ITM_GRP_ROWNO[0] ;
         A85TBM37_DOM_ITM_GRP_OID = P006X3_A85TBM37_DOM_ITM_GRP_OID[0] ;
         n85TBM37_DOM_ITM_GRP_OID = P006X3_n85TBM37_DOM_ITM_GRP_OID[0] ;
         A83TBM37_VISIT_NO = P006X3_A83TBM37_VISIT_NO[0] ;
         n83TBM37_VISIT_NO = P006X3_n83TBM37_VISIT_NO[0] ;
         A81TBM37_CRF_ITEM_GRP_DIV = P006X3_A81TBM37_CRF_ITEM_GRP_DIV[0] ;
         A82TBM37_CRF_ITEM_GRP_CD = P006X3_A82TBM37_CRF_ITEM_GRP_CD[0] ;
         AV33W_DATA_CNT = (long)(AV33W_DATA_CNT+1) ;
         AV34W_DATA_SET_FLG = true ;
         if ( ( AV32W_TBM37_CRF_ID == A80TBM37_CRF_ID ) && ( AV19W_TBM37_VISIT_NO == A83TBM37_VISIT_NO ) && ( GXutil.strcmp(AV20W_TBM37_DOM_ITM_GRP_OID, A85TBM37_DOM_ITM_GRP_OID) == 0 ) && ( AV21W_TBM37_DOM_ITM_GRP_ROWNO == A86TBM37_DOM_ITM_GRP_ROWNO ) && ( AV33W_DATA_CNT > 1 ) )
         {
            AV34W_DATA_SET_FLG = false ;
         }
         if ( AV34W_DATA_SET_FLG )
         {
            AV32W_TBM37_CRF_ID = A80TBM37_CRF_ID ;
            AV19W_TBM37_VISIT_NO = A83TBM37_VISIT_NO ;
            AV20W_TBM37_DOM_ITM_GRP_OID = A85TBM37_DOM_ITM_GRP_OID ;
            AV21W_TBM37_DOM_ITM_GRP_ROWNO = A86TBM37_DOM_ITM_GRP_ROWNO ;
            /* Using cursor P006X4 */
            pr_default.execute(2, new Object[] {new Long(A79TBM37_STUDY_ID), new Short(A80TBM37_CRF_ID)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A68TBM31_STUDY_ID = P006X4_A68TBM31_STUDY_ID[0] ;
               A69TBM31_CRF_ID = P006X4_A69TBM31_CRF_ID[0] ;
               A397TBM31_DEL_FLG = P006X4_A397TBM31_DEL_FLG[0] ;
               n397TBM31_DEL_FLG = P006X4_n397TBM31_DEL_FLG[0] ;
               A943TBM31_REPEAT_FLG = P006X4_A943TBM31_REPEAT_FLG[0] ;
               n943TBM31_REPEAT_FLG = P006X4_n943TBM31_REPEAT_FLG[0] ;
               AV25W_TBM31_REPEAT_FLG = A943TBM31_REPEAT_FLG ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(2);
            if ( AV25W_TBM31_REPEAT_FLG == 0 )
            {
               /* Execute user subroutine: S131 */
               S131 ();
               if ( returnInSub )
               {
                  pr_default.close(1);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
            else
            {
               /* Using cursor P006X5 */
               pr_default.execute(3, new Object[] {new Long(A79TBM37_STUDY_ID), new Short(A80TBM37_CRF_ID)});
               while ( (pr_default.getStatus(3) != 101) )
               {
                  A945TBM44_STUDY_ID = P006X5_A945TBM44_STUDY_ID[0] ;
                  A946TBM44_CRF_ID = P006X5_A946TBM44_CRF_ID[0] ;
                  A949TBM44_DEL_FLG = P006X5_A949TBM44_DEL_FLG[0] ;
                  n949TBM44_DEL_FLG = P006X5_n949TBM44_DEL_FLG[0] ;
                  A948TBM44_VISIT_NO = P006X5_A948TBM44_VISIT_NO[0] ;
                  n948TBM44_VISIT_NO = P006X5_n948TBM44_VISIT_NO[0] ;
                  A947TBM44_CRF_EDA_NO = P006X5_A947TBM44_CRF_EDA_NO[0] ;
                  AV19W_TBM37_VISIT_NO = A948TBM44_VISIT_NO ;
                  /* Execute user subroutine: S131 */
                  S131 ();
                  if ( returnInSub )
                  {
                     pr_default.close(3);
                     pr_default.close(1);
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
                  pr_default.readNext(3);
               }
               pr_default.close(3);
            }
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      /* Execute user subroutine: S111 */
      S111 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_CRF_ITEM_GRP_CD_GET' Routine */
      /* Using cursor P006X6 */
      pr_default.execute(4, new Object[] {new Long(AV9P_STUDY_ID), AV10P_DOM_CD});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A82TBM37_CRF_ITEM_GRP_CD = P006X6_A82TBM37_CRF_ITEM_GRP_CD[0] ;
         A83TBM37_VISIT_NO = P006X6_A83TBM37_VISIT_NO[0] ;
         n83TBM37_VISIT_NO = P006X6_n83TBM37_VISIT_NO[0] ;
         A85TBM37_DOM_ITM_GRP_OID = P006X6_A85TBM37_DOM_ITM_GRP_OID[0] ;
         n85TBM37_DOM_ITM_GRP_OID = P006X6_n85TBM37_DOM_ITM_GRP_OID[0] ;
         A86TBM37_DOM_ITM_GRP_ROWNO = P006X6_A86TBM37_DOM_ITM_GRP_ROWNO[0] ;
         n86TBM37_DOM_ITM_GRP_ROWNO = P006X6_n86TBM37_DOM_ITM_GRP_ROWNO[0] ;
         A500TBM37_DOM_VAR_NM = P006X6_A500TBM37_DOM_VAR_NM[0] ;
         n500TBM37_DOM_VAR_NM = P006X6_n500TBM37_DOM_VAR_NM[0] ;
         A80TBM37_CRF_ID = P006X6_A80TBM37_CRF_ID[0] ;
         A79TBM37_STUDY_ID = P006X6_A79TBM37_STUDY_ID[0] ;
         A433TBM37_DEL_FLG = P006X6_A433TBM37_DEL_FLG[0] ;
         n433TBM37_DEL_FLG = P006X6_n433TBM37_DEL_FLG[0] ;
         A84TBM37_DOM_CD = P006X6_A84TBM37_DOM_CD[0] ;
         n84TBM37_DOM_CD = P006X6_n84TBM37_DOM_CD[0] ;
         A81TBM37_CRF_ITEM_GRP_DIV = P006X6_A81TBM37_CRF_ITEM_GRP_DIV[0] ;
         /* Using cursor P006X7 */
         pr_default.execute(5, new Object[] {new Long(A79TBM37_STUDY_ID), new Short(A80TBM37_CRF_ID)});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A68TBM31_STUDY_ID = P006X7_A68TBM31_STUDY_ID[0] ;
            A69TBM31_CRF_ID = P006X7_A69TBM31_CRF_ID[0] ;
            A397TBM31_DEL_FLG = P006X7_A397TBM31_DEL_FLG[0] ;
            n397TBM31_DEL_FLG = P006X7_n397TBM31_DEL_FLG[0] ;
            A943TBM31_REPEAT_FLG = P006X7_A943TBM31_REPEAT_FLG[0] ;
            n943TBM31_REPEAT_FLG = P006X7_n943TBM31_REPEAT_FLG[0] ;
            AV25W_TBM31_REPEAT_FLG = A943TBM31_REPEAT_FLG ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(5);
         /* Using cursor P006X8 */
         pr_default.execute(6, new Object[] {new Long(A79TBM37_STUDY_ID), new Short(A80TBM37_CRF_ID), A82TBM37_CRF_ITEM_GRP_CD});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A70TBM32_STUDY_ID = P006X8_A70TBM32_STUDY_ID[0] ;
            A71TBM32_CRF_ID = P006X8_A71TBM32_CRF_ID[0] ;
            A72TBM32_CRF_ITEM_CD = P006X8_A72TBM32_CRF_ITEM_CD[0] ;
            A75TBM32_DEL_FLG = P006X8_A75TBM32_DEL_FLG[0] ;
            n75TBM32_DEL_FLG = P006X8_n75TBM32_DEL_FLG[0] ;
            A74TBM32_CRF_ITEM_DIV = P006X8_A74TBM32_CRF_ITEM_DIV[0] ;
            n74TBM32_CRF_ITEM_DIV = P006X8_n74TBM32_CRF_ITEM_DIV[0] ;
            if ( AV25W_TBM31_REPEAT_FLG == 0 )
            {
               AV19W_TBM37_VISIT_NO = A83TBM37_VISIT_NO ;
               AV20W_TBM37_DOM_ITM_GRP_OID = A85TBM37_DOM_ITM_GRP_OID ;
               AV21W_TBM37_DOM_ITM_GRP_ROWNO = A86TBM37_DOM_ITM_GRP_ROWNO ;
               AV29W_TBM37_DOM_VAR_NM = A500TBM37_DOM_VAR_NM ;
               AV30W_TBM37_CRF_ITEM_GRP_CD = A82TBM37_CRF_ITEM_GRP_CD ;
               /* Execute user subroutine: S128 */
               S128 ();
               if ( returnInSub )
               {
                  pr_default.close(6);
                  pr_default.close(4);
                  returnInSub = true;
                  if (true) return;
               }
            }
            else
            {
               AV20W_TBM37_DOM_ITM_GRP_OID = A85TBM37_DOM_ITM_GRP_OID ;
               AV21W_TBM37_DOM_ITM_GRP_ROWNO = A86TBM37_DOM_ITM_GRP_ROWNO ;
               AV29W_TBM37_DOM_VAR_NM = A500TBM37_DOM_VAR_NM ;
               AV30W_TBM37_CRF_ITEM_GRP_CD = A82TBM37_CRF_ITEM_GRP_CD ;
               /* Using cursor P006X9 */
               pr_default.execute(7, new Object[] {new Long(A79TBM37_STUDY_ID), new Short(A80TBM37_CRF_ID)});
               while ( (pr_default.getStatus(7) != 101) )
               {
                  A945TBM44_STUDY_ID = P006X9_A945TBM44_STUDY_ID[0] ;
                  A946TBM44_CRF_ID = P006X9_A946TBM44_CRF_ID[0] ;
                  A949TBM44_DEL_FLG = P006X9_A949TBM44_DEL_FLG[0] ;
                  n949TBM44_DEL_FLG = P006X9_n949TBM44_DEL_FLG[0] ;
                  A948TBM44_VISIT_NO = P006X9_A948TBM44_VISIT_NO[0] ;
                  n948TBM44_VISIT_NO = P006X9_n948TBM44_VISIT_NO[0] ;
                  A947TBM44_CRF_EDA_NO = P006X9_A947TBM44_CRF_EDA_NO[0] ;
                  AV19W_TBM37_VISIT_NO = A948TBM44_VISIT_NO ;
                  /* Execute user subroutine: S128 */
                  S128 ();
                  if ( returnInSub )
                  {
                     pr_default.close(7);
                     pr_default.close(6);
                     pr_default.close(4);
                     returnInSub = true;
                     if (true) return;
                  }
                  pr_default.readNext(7);
               }
               pr_default.close(7);
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(6);
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   public void S131( )
   {
      /* 'SUB_SD2_ADD' Routine */
      AV26W_DATA_FLG = false ;
      AV45GXV1 = 1 ;
      while ( AV45GXV1 <= AV13B716_SD2_DOM_MAP_C.size() )
      {
         AV14B716_SD2_DOM_MAP_I = (SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem)((SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem)AV13B716_SD2_DOM_MAP_C.elementAt(-1+AV45GXV1));
         if ( ( AV14B716_SD2_DOM_MAP_I.getgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Visit_no() == AV19W_TBM37_VISIT_NO ) && ( GXutil.strcmp(AV14B716_SD2_DOM_MAP_I.getgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_itm_grp_oid(), AV20W_TBM37_DOM_ITM_GRP_OID) == 0 ) && ( AV14B716_SD2_DOM_MAP_I.getgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_itm_grp_rowno() == AV21W_TBM37_DOM_ITM_GRP_ROWNO ) )
         {
            AV26W_DATA_FLG = true ;
            if (true) break;
         }
         AV45GXV1 = (int)(AV45GXV1+1) ;
      }
      if ( ! AV26W_DATA_FLG )
      {
         AV14B716_SD2_DOM_MAP_I = (SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem)new SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem(remoteHandle, context);
         AV14B716_SD2_DOM_MAP_I.setgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Visit_no( AV19W_TBM37_VISIT_NO );
         AV14B716_SD2_DOM_MAP_I.setgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_itm_grp_oid( AV20W_TBM37_DOM_ITM_GRP_OID );
         AV14B716_SD2_DOM_MAP_I.setgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_itm_grp_rowno( AV21W_TBM37_DOM_ITM_GRP_ROWNO );
         AV14B716_SD2_DOM_MAP_I.getgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_var().clear();
         AV46GXV2 = 1 ;
         while ( AV46GXV2 <= AV16B716_SD3_DOM_VAR_C.size() )
         {
            AV17B716_SD3_DOM_VAR_I = (SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem)((SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem)AV16B716_SD3_DOM_VAR_C.elementAt(-1+AV46GXV2));
            AV18B716_SD3_DOM_VAR_I2 = AV17B716_SD3_DOM_VAR_I.Clone();
            AV14B716_SD2_DOM_MAP_I.getgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_var().add(AV18B716_SD3_DOM_VAR_I2, 0);
            AV46GXV2 = (int)(AV46GXV2+1) ;
         }
         AV13B716_SD2_DOM_MAP_C.add(AV14B716_SD2_DOM_MAP_I, 0);
      }
   }

   public void S128( )
   {
      /* 'SUB_SD3_UPD' Routine */
      AV47GXV3 = 1 ;
      while ( AV47GXV3 <= AV13B716_SD2_DOM_MAP_C.size() )
      {
         AV14B716_SD2_DOM_MAP_I = (SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem)((SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem)AV13B716_SD2_DOM_MAP_C.elementAt(-1+AV47GXV3));
         if ( ( AV14B716_SD2_DOM_MAP_I.getgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Visit_no() == AV19W_TBM37_VISIT_NO ) && ( GXutil.strcmp(AV14B716_SD2_DOM_MAP_I.getgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_itm_grp_oid(), AV20W_TBM37_DOM_ITM_GRP_OID) == 0 ) && ( AV14B716_SD2_DOM_MAP_I.getgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_itm_grp_rowno() == AV21W_TBM37_DOM_ITM_GRP_ROWNO ) )
         {
            AV48GXV4 = 1 ;
            while ( AV48GXV4 <= AV14B716_SD2_DOM_MAP_I.getgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_var().size() )
            {
               AV17B716_SD3_DOM_VAR_I = (SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem)((SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem)AV14B716_SD2_DOM_MAP_I.getgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_var().elementAt(-1+AV48GXV4));
               if ( GXutil.strcmp(AV17B716_SD3_DOM_VAR_I.getgxTv_SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem_Dom_var_nm(), AV29W_TBM37_DOM_VAR_NM) == 0 )
               {
                  AV17B716_SD3_DOM_VAR_I.setgxTv_SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem_Crf_item_grp_cd( AV30W_TBM37_CRF_ITEM_GRP_CD );
                  if (true) break;
               }
               AV48GXV4 = (int)(AV48GXV4+1) ;
            }
            if (true) break;
         }
         AV47GXV3 = (int)(AV47GXV3+1) ;
      }
   }

   public void S141( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
   }

   public void S151( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV49Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "b790_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("b790_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   protected void cleanup( )
   {
      this.aP2[0] = b716_pc02_dom_map_get.this.AV13B716_SD2_DOM_MAP_C;
      this.aP3[0] = b716_pc02_dom_map_get.this.AV22W_SEQ_POS;
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
                  /* Execute user subroutine: S151 */
                  S151 ();
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
      AV13B716_SD2_DOM_MAP_C = new GxObjectCollection(SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem.class, "B716_SD2_DOM_MAP.B716_SD2_DOM_MAPItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      AV16B716_SD3_DOM_VAR_C = new GxObjectCollection(SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem.class, "B716_SD3_DOM_VAR.B716_SD3_DOM_VARItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      scmdbuf = "" ;
      P006X2_A200TBM43_STUDY_ID = new long[1] ;
      P006X2_A201TBM43_DOM_CD = new String[] {""} ;
      P006X2_A919TBM43_DEL_FLG = new String[] {""} ;
      P006X2_n919TBM43_DEL_FLG = new boolean[] {false} ;
      P006X2_A202TBM43_DOM_VAR_NM = new String[] {""} ;
      P006X2_A918TBM43_ORDER = new int[1] ;
      P006X2_n918TBM43_ORDER = new boolean[] {false} ;
      A201TBM43_DOM_CD = "" ;
      A919TBM43_DEL_FLG = "" ;
      A202TBM43_DOM_VAR_NM = "" ;
      AV17B716_SD3_DOM_VAR_I = new SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem(remoteHandle, context);
      AV20W_TBM37_DOM_ITM_GRP_OID = "" ;
      P006X3_A79TBM37_STUDY_ID = new long[1] ;
      P006X3_A84TBM37_DOM_CD = new String[] {""} ;
      P006X3_n84TBM37_DOM_CD = new boolean[] {false} ;
      P006X3_A433TBM37_DEL_FLG = new String[] {""} ;
      P006X3_n433TBM37_DEL_FLG = new boolean[] {false} ;
      P006X3_A80TBM37_CRF_ID = new short[1] ;
      P006X3_A86TBM37_DOM_ITM_GRP_ROWNO = new short[1] ;
      P006X3_n86TBM37_DOM_ITM_GRP_ROWNO = new boolean[] {false} ;
      P006X3_A85TBM37_DOM_ITM_GRP_OID = new String[] {""} ;
      P006X3_n85TBM37_DOM_ITM_GRP_OID = new boolean[] {false} ;
      P006X3_A83TBM37_VISIT_NO = new int[1] ;
      P006X3_n83TBM37_VISIT_NO = new boolean[] {false} ;
      P006X3_A81TBM37_CRF_ITEM_GRP_DIV = new String[] {""} ;
      P006X3_A82TBM37_CRF_ITEM_GRP_CD = new String[] {""} ;
      A84TBM37_DOM_CD = "" ;
      A433TBM37_DEL_FLG = "" ;
      A85TBM37_DOM_ITM_GRP_OID = "" ;
      A81TBM37_CRF_ITEM_GRP_DIV = "" ;
      A82TBM37_CRF_ITEM_GRP_CD = "" ;
      P006X4_A68TBM31_STUDY_ID = new long[1] ;
      P006X4_A69TBM31_CRF_ID = new short[1] ;
      P006X4_A397TBM31_DEL_FLG = new String[] {""} ;
      P006X4_n397TBM31_DEL_FLG = new boolean[] {false} ;
      P006X4_A943TBM31_REPEAT_FLG = new byte[1] ;
      P006X4_n943TBM31_REPEAT_FLG = new boolean[] {false} ;
      A397TBM31_DEL_FLG = "" ;
      P006X5_A945TBM44_STUDY_ID = new long[1] ;
      P006X5_A946TBM44_CRF_ID = new short[1] ;
      P006X5_A949TBM44_DEL_FLG = new String[] {""} ;
      P006X5_n949TBM44_DEL_FLG = new boolean[] {false} ;
      P006X5_A948TBM44_VISIT_NO = new int[1] ;
      P006X5_n948TBM44_VISIT_NO = new boolean[] {false} ;
      P006X5_A947TBM44_CRF_EDA_NO = new byte[1] ;
      A949TBM44_DEL_FLG = "" ;
      P006X6_A82TBM37_CRF_ITEM_GRP_CD = new String[] {""} ;
      P006X6_A83TBM37_VISIT_NO = new int[1] ;
      P006X6_n83TBM37_VISIT_NO = new boolean[] {false} ;
      P006X6_A85TBM37_DOM_ITM_GRP_OID = new String[] {""} ;
      P006X6_n85TBM37_DOM_ITM_GRP_OID = new boolean[] {false} ;
      P006X6_A86TBM37_DOM_ITM_GRP_ROWNO = new short[1] ;
      P006X6_n86TBM37_DOM_ITM_GRP_ROWNO = new boolean[] {false} ;
      P006X6_A500TBM37_DOM_VAR_NM = new String[] {""} ;
      P006X6_n500TBM37_DOM_VAR_NM = new boolean[] {false} ;
      P006X6_A80TBM37_CRF_ID = new short[1] ;
      P006X6_A79TBM37_STUDY_ID = new long[1] ;
      P006X6_A433TBM37_DEL_FLG = new String[] {""} ;
      P006X6_n433TBM37_DEL_FLG = new boolean[] {false} ;
      P006X6_A84TBM37_DOM_CD = new String[] {""} ;
      P006X6_n84TBM37_DOM_CD = new boolean[] {false} ;
      P006X6_A81TBM37_CRF_ITEM_GRP_DIV = new String[] {""} ;
      A500TBM37_DOM_VAR_NM = "" ;
      P006X7_A68TBM31_STUDY_ID = new long[1] ;
      P006X7_A69TBM31_CRF_ID = new short[1] ;
      P006X7_A397TBM31_DEL_FLG = new String[] {""} ;
      P006X7_n397TBM31_DEL_FLG = new boolean[] {false} ;
      P006X7_A943TBM31_REPEAT_FLG = new byte[1] ;
      P006X7_n943TBM31_REPEAT_FLG = new boolean[] {false} ;
      P006X8_A70TBM32_STUDY_ID = new long[1] ;
      P006X8_A71TBM32_CRF_ID = new short[1] ;
      P006X8_A72TBM32_CRF_ITEM_CD = new String[] {""} ;
      P006X8_A75TBM32_DEL_FLG = new String[] {""} ;
      P006X8_n75TBM32_DEL_FLG = new boolean[] {false} ;
      P006X8_A74TBM32_CRF_ITEM_DIV = new String[] {""} ;
      P006X8_n74TBM32_CRF_ITEM_DIV = new boolean[] {false} ;
      A72TBM32_CRF_ITEM_CD = "" ;
      A75TBM32_DEL_FLG = "" ;
      A74TBM32_CRF_ITEM_DIV = "" ;
      AV29W_TBM37_DOM_VAR_NM = "" ;
      AV30W_TBM37_CRF_ITEM_GRP_CD = "" ;
      P006X9_A945TBM44_STUDY_ID = new long[1] ;
      P006X9_A946TBM44_CRF_ID = new short[1] ;
      P006X9_A949TBM44_DEL_FLG = new String[] {""} ;
      P006X9_n949TBM44_DEL_FLG = new boolean[] {false} ;
      P006X9_A948TBM44_VISIT_NO = new int[1] ;
      P006X9_n948TBM44_VISIT_NO = new boolean[] {false} ;
      P006X9_A947TBM44_CRF_EDA_NO = new byte[1] ;
      AV14B716_SD2_DOM_MAP_I = new SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem(remoteHandle, context);
      AV18B716_SD3_DOM_VAR_I2 = new SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem(remoteHandle, context);
      AV49Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b716_pc02_dom_map_get__default(),
         new Object[] {
             new Object[] {
            P006X2_A200TBM43_STUDY_ID, P006X2_A201TBM43_DOM_CD, P006X2_A919TBM43_DEL_FLG, P006X2_n919TBM43_DEL_FLG, P006X2_A202TBM43_DOM_VAR_NM, P006X2_A918TBM43_ORDER, P006X2_n918TBM43_ORDER
            }
            , new Object[] {
            P006X3_A79TBM37_STUDY_ID, P006X3_A84TBM37_DOM_CD, P006X3_n84TBM37_DOM_CD, P006X3_A433TBM37_DEL_FLG, P006X3_n433TBM37_DEL_FLG, P006X3_A80TBM37_CRF_ID, P006X3_A86TBM37_DOM_ITM_GRP_ROWNO, P006X3_n86TBM37_DOM_ITM_GRP_ROWNO, P006X3_A85TBM37_DOM_ITM_GRP_OID, P006X3_n85TBM37_DOM_ITM_GRP_OID,
            P006X3_A83TBM37_VISIT_NO, P006X3_n83TBM37_VISIT_NO, P006X3_A81TBM37_CRF_ITEM_GRP_DIV, P006X3_A82TBM37_CRF_ITEM_GRP_CD
            }
            , new Object[] {
            P006X4_A68TBM31_STUDY_ID, P006X4_A69TBM31_CRF_ID, P006X4_A397TBM31_DEL_FLG, P006X4_n397TBM31_DEL_FLG, P006X4_A943TBM31_REPEAT_FLG, P006X4_n943TBM31_REPEAT_FLG
            }
            , new Object[] {
            P006X5_A945TBM44_STUDY_ID, P006X5_A946TBM44_CRF_ID, P006X5_A949TBM44_DEL_FLG, P006X5_n949TBM44_DEL_FLG, P006X5_A948TBM44_VISIT_NO, P006X5_n948TBM44_VISIT_NO, P006X5_A947TBM44_CRF_EDA_NO
            }
            , new Object[] {
            P006X6_A82TBM37_CRF_ITEM_GRP_CD, P006X6_A83TBM37_VISIT_NO, P006X6_n83TBM37_VISIT_NO, P006X6_A85TBM37_DOM_ITM_GRP_OID, P006X6_n85TBM37_DOM_ITM_GRP_OID, P006X6_A86TBM37_DOM_ITM_GRP_ROWNO, P006X6_n86TBM37_DOM_ITM_GRP_ROWNO, P006X6_A500TBM37_DOM_VAR_NM, P006X6_n500TBM37_DOM_VAR_NM, P006X6_A80TBM37_CRF_ID,
            P006X6_A79TBM37_STUDY_ID, P006X6_A433TBM37_DEL_FLG, P006X6_n433TBM37_DEL_FLG, P006X6_A84TBM37_DOM_CD, P006X6_n84TBM37_DOM_CD, P006X6_A81TBM37_CRF_ITEM_GRP_DIV
            }
            , new Object[] {
            P006X7_A68TBM31_STUDY_ID, P006X7_A69TBM31_CRF_ID, P006X7_A397TBM31_DEL_FLG, P006X7_n397TBM31_DEL_FLG, P006X7_A943TBM31_REPEAT_FLG, P006X7_n943TBM31_REPEAT_FLG
            }
            , new Object[] {
            P006X8_A70TBM32_STUDY_ID, P006X8_A71TBM32_CRF_ID, P006X8_A72TBM32_CRF_ITEM_CD, P006X8_A75TBM32_DEL_FLG, P006X8_n75TBM32_DEL_FLG, P006X8_A74TBM32_CRF_ITEM_DIV, P006X8_n74TBM32_CRF_ITEM_DIV
            }
            , new Object[] {
            P006X9_A945TBM44_STUDY_ID, P006X9_A946TBM44_CRF_ID, P006X9_A949TBM44_DEL_FLG, P006X9_n949TBM44_DEL_FLG, P006X9_A948TBM44_VISIT_NO, P006X9_n948TBM44_VISIT_NO, P006X9_A947TBM44_CRF_EDA_NO
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV49Pgmname = "B716_PC02_DOM_MAP_GET" ;
      /* GeneXus formulas. */
      AV49Pgmname = "B716_PC02_DOM_MAP_GET" ;
      Gx_err = (short)(0) ;
   }

   private byte A943TBM31_REPEAT_FLG ;
   private byte AV25W_TBM31_REPEAT_FLG ;
   private byte A947TBM44_CRF_EDA_NO ;
   private short AV22W_SEQ_POS ;
   private short AV23W_CNT ;
   private short AV32W_TBM37_CRF_ID ;
   private short AV21W_TBM37_DOM_ITM_GRP_ROWNO ;
   private short A80TBM37_CRF_ID ;
   private short A86TBM37_DOM_ITM_GRP_ROWNO ;
   private short A69TBM31_CRF_ID ;
   private short A946TBM44_CRF_ID ;
   private short A71TBM32_CRF_ID ;
   private short Gx_err ;
   private int A918TBM43_ORDER ;
   private int AV19W_TBM37_VISIT_NO ;
   private int A83TBM37_VISIT_NO ;
   private int A948TBM44_VISIT_NO ;
   private int AV45GXV1 ;
   private int AV46GXV2 ;
   private int AV47GXV3 ;
   private int AV48GXV4 ;
   private int GXActiveErrHndl ;
   private long AV9P_STUDY_ID ;
   private long A200TBM43_STUDY_ID ;
   private long AV33W_DATA_CNT ;
   private long A79TBM37_STUDY_ID ;
   private long A68TBM31_STUDY_ID ;
   private long A945TBM44_STUDY_ID ;
   private long A70TBM32_STUDY_ID ;
   private String scmdbuf ;
   private String AV49Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private boolean n919TBM43_DEL_FLG ;
   private boolean n918TBM43_ORDER ;
   private boolean n84TBM37_DOM_CD ;
   private boolean n433TBM37_DEL_FLG ;
   private boolean n86TBM37_DOM_ITM_GRP_ROWNO ;
   private boolean n85TBM37_DOM_ITM_GRP_OID ;
   private boolean n83TBM37_VISIT_NO ;
   private boolean AV34W_DATA_SET_FLG ;
   private boolean n397TBM31_DEL_FLG ;
   private boolean n943TBM31_REPEAT_FLG ;
   private boolean n949TBM44_DEL_FLG ;
   private boolean n948TBM44_VISIT_NO ;
   private boolean n500TBM37_DOM_VAR_NM ;
   private boolean n75TBM32_DEL_FLG ;
   private boolean n74TBM32_CRF_ITEM_DIV ;
   private boolean AV26W_DATA_FLG ;
   private String AV10P_DOM_CD ;
   private String A201TBM43_DOM_CD ;
   private String A919TBM43_DEL_FLG ;
   private String A202TBM43_DOM_VAR_NM ;
   private String AV20W_TBM37_DOM_ITM_GRP_OID ;
   private String A84TBM37_DOM_CD ;
   private String A433TBM37_DEL_FLG ;
   private String A85TBM37_DOM_ITM_GRP_OID ;
   private String A81TBM37_CRF_ITEM_GRP_DIV ;
   private String A82TBM37_CRF_ITEM_GRP_CD ;
   private String A397TBM31_DEL_FLG ;
   private String A949TBM44_DEL_FLG ;
   private String A500TBM37_DOM_VAR_NM ;
   private String A72TBM32_CRF_ITEM_CD ;
   private String A75TBM32_DEL_FLG ;
   private String A74TBM32_CRF_ITEM_DIV ;
   private String AV29W_TBM37_DOM_VAR_NM ;
   private String AV30W_TBM37_CRF_ITEM_GRP_CD ;
   private GxObjectCollection[] aP2 ;
   private short[] aP3 ;
   private IDataStoreProvider pr_default ;
   private long[] P006X2_A200TBM43_STUDY_ID ;
   private String[] P006X2_A201TBM43_DOM_CD ;
   private String[] P006X2_A919TBM43_DEL_FLG ;
   private boolean[] P006X2_n919TBM43_DEL_FLG ;
   private String[] P006X2_A202TBM43_DOM_VAR_NM ;
   private int[] P006X2_A918TBM43_ORDER ;
   private boolean[] P006X2_n918TBM43_ORDER ;
   private long[] P006X3_A79TBM37_STUDY_ID ;
   private String[] P006X3_A84TBM37_DOM_CD ;
   private boolean[] P006X3_n84TBM37_DOM_CD ;
   private String[] P006X3_A433TBM37_DEL_FLG ;
   private boolean[] P006X3_n433TBM37_DEL_FLG ;
   private short[] P006X3_A80TBM37_CRF_ID ;
   private short[] P006X3_A86TBM37_DOM_ITM_GRP_ROWNO ;
   private boolean[] P006X3_n86TBM37_DOM_ITM_GRP_ROWNO ;
   private String[] P006X3_A85TBM37_DOM_ITM_GRP_OID ;
   private boolean[] P006X3_n85TBM37_DOM_ITM_GRP_OID ;
   private int[] P006X3_A83TBM37_VISIT_NO ;
   private boolean[] P006X3_n83TBM37_VISIT_NO ;
   private String[] P006X3_A81TBM37_CRF_ITEM_GRP_DIV ;
   private String[] P006X3_A82TBM37_CRF_ITEM_GRP_CD ;
   private long[] P006X4_A68TBM31_STUDY_ID ;
   private short[] P006X4_A69TBM31_CRF_ID ;
   private String[] P006X4_A397TBM31_DEL_FLG ;
   private boolean[] P006X4_n397TBM31_DEL_FLG ;
   private byte[] P006X4_A943TBM31_REPEAT_FLG ;
   private boolean[] P006X4_n943TBM31_REPEAT_FLG ;
   private long[] P006X5_A945TBM44_STUDY_ID ;
   private short[] P006X5_A946TBM44_CRF_ID ;
   private String[] P006X5_A949TBM44_DEL_FLG ;
   private boolean[] P006X5_n949TBM44_DEL_FLG ;
   private int[] P006X5_A948TBM44_VISIT_NO ;
   private boolean[] P006X5_n948TBM44_VISIT_NO ;
   private byte[] P006X5_A947TBM44_CRF_EDA_NO ;
   private String[] P006X6_A82TBM37_CRF_ITEM_GRP_CD ;
   private int[] P006X6_A83TBM37_VISIT_NO ;
   private boolean[] P006X6_n83TBM37_VISIT_NO ;
   private String[] P006X6_A85TBM37_DOM_ITM_GRP_OID ;
   private boolean[] P006X6_n85TBM37_DOM_ITM_GRP_OID ;
   private short[] P006X6_A86TBM37_DOM_ITM_GRP_ROWNO ;
   private boolean[] P006X6_n86TBM37_DOM_ITM_GRP_ROWNO ;
   private String[] P006X6_A500TBM37_DOM_VAR_NM ;
   private boolean[] P006X6_n500TBM37_DOM_VAR_NM ;
   private short[] P006X6_A80TBM37_CRF_ID ;
   private long[] P006X6_A79TBM37_STUDY_ID ;
   private String[] P006X6_A433TBM37_DEL_FLG ;
   private boolean[] P006X6_n433TBM37_DEL_FLG ;
   private String[] P006X6_A84TBM37_DOM_CD ;
   private boolean[] P006X6_n84TBM37_DOM_CD ;
   private String[] P006X6_A81TBM37_CRF_ITEM_GRP_DIV ;
   private long[] P006X7_A68TBM31_STUDY_ID ;
   private short[] P006X7_A69TBM31_CRF_ID ;
   private String[] P006X7_A397TBM31_DEL_FLG ;
   private boolean[] P006X7_n397TBM31_DEL_FLG ;
   private byte[] P006X7_A943TBM31_REPEAT_FLG ;
   private boolean[] P006X7_n943TBM31_REPEAT_FLG ;
   private long[] P006X8_A70TBM32_STUDY_ID ;
   private short[] P006X8_A71TBM32_CRF_ID ;
   private String[] P006X8_A72TBM32_CRF_ITEM_CD ;
   private String[] P006X8_A75TBM32_DEL_FLG ;
   private boolean[] P006X8_n75TBM32_DEL_FLG ;
   private String[] P006X8_A74TBM32_CRF_ITEM_DIV ;
   private boolean[] P006X8_n74TBM32_CRF_ITEM_DIV ;
   private long[] P006X9_A945TBM44_STUDY_ID ;
   private short[] P006X9_A946TBM44_CRF_ID ;
   private String[] P006X9_A949TBM44_DEL_FLG ;
   private boolean[] P006X9_n949TBM44_DEL_FLG ;
   private int[] P006X9_A948TBM44_VISIT_NO ;
   private boolean[] P006X9_n948TBM44_VISIT_NO ;
   private byte[] P006X9_A947TBM44_CRF_EDA_NO ;
   private GxObjectCollection AV13B716_SD2_DOM_MAP_C ;
   private GxObjectCollection AV16B716_SD3_DOM_VAR_C ;
   private SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem AV14B716_SD2_DOM_MAP_I ;
   private SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem AV17B716_SD3_DOM_VAR_I ;
   private SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem AV18B716_SD3_DOM_VAR_I2 ;
}

final  class b716_pc02_dom_map_get__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P006X2", "SELECT `TBM43_STUDY_ID`, `TBM43_DOM_CD`, `TBM43_DEL_FLG`, `TBM43_DOM_VAR_NM`, `TBM43_ORDER` FROM `TBM43_STUDY_CDISC_ITEM` WHERE (`TBM43_STUDY_ID` = ?) AND (`TBM43_DOM_CD` = ?) AND (`TBM43_DEL_FLG` = '0') ORDER BY `TBM43_ORDER` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P006X3", "SELECT `TBM37_STUDY_ID`, `TBM37_DOM_CD`, `TBM37_DEL_FLG`, `TBM37_CRF_ID`, `TBM37_DOM_ITM_GRP_ROWNO`, `TBM37_DOM_ITM_GRP_OID`, `TBM37_VISIT_NO`, `TBM37_CRF_ITEM_GRP_DIV`, `TBM37_CRF_ITEM_GRP_CD` FROM `TBM37_CRF_DOM_MAP` WHERE (`TBM37_STUDY_ID` = ?) AND (`TBM37_DOM_CD` = ?) AND (`TBM37_DEL_FLG` = '0') ORDER BY `TBM37_CRF_ID`, `TBM37_VISIT_NO`, `TBM37_DOM_ITM_GRP_OID`, `TBM37_DOM_ITM_GRP_ROWNO` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P006X4", "SELECT `TBM31_STUDY_ID`, `TBM31_CRF_ID`, `TBM31_DEL_FLG`, `TBM31_REPEAT_FLG` FROM `TBM31_CRF` WHERE (`TBM31_STUDY_ID` = ? and `TBM31_CRF_ID` = ?) AND (`TBM31_DEL_FLG` = '0') ORDER BY `TBM31_STUDY_ID`, `TBM31_CRF_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P006X5", "SELECT `TBM44_STUDY_ID`, `TBM44_CRF_ID`, `TBM44_DEL_FLG`, `TBM44_VISIT_NO`, `TBM44_CRF_EDA_NO` FROM `TBM44_CRF_VISIT` WHERE (`TBM44_STUDY_ID` = ? and `TBM44_CRF_ID` = ?) AND (`TBM44_DEL_FLG` = '0') ORDER BY `TBM44_STUDY_ID`, `TBM44_CRF_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P006X6", "SELECT `TBM37_CRF_ITEM_GRP_CD`, `TBM37_VISIT_NO`, `TBM37_DOM_ITM_GRP_OID`, `TBM37_DOM_ITM_GRP_ROWNO`, `TBM37_DOM_VAR_NM`, `TBM37_CRF_ID`, `TBM37_STUDY_ID`, `TBM37_DEL_FLG`, `TBM37_DOM_CD`, `TBM37_CRF_ITEM_GRP_DIV` FROM `TBM37_CRF_DOM_MAP` WHERE (`TBM37_STUDY_ID` = ?) AND (`TBM37_DOM_CD` = ?) AND (`TBM37_DEL_FLG` = '0') ORDER BY `TBM37_STUDY_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P006X7", "SELECT `TBM31_STUDY_ID`, `TBM31_CRF_ID`, `TBM31_DEL_FLG`, `TBM31_REPEAT_FLG` FROM `TBM31_CRF` WHERE (`TBM31_STUDY_ID` = ? and `TBM31_CRF_ID` = ?) AND (`TBM31_DEL_FLG` = '0') ORDER BY `TBM31_STUDY_ID`, `TBM31_CRF_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P006X8", "SELECT `TBM32_STUDY_ID`, `TBM32_CRF_ID`, `TBM32_CRF_ITEM_CD`, `TBM32_DEL_FLG`, `TBM32_CRF_ITEM_DIV` FROM `TBM32_CRF_ITEM` WHERE (`TBM32_STUDY_ID` = ? and `TBM32_CRF_ID` = ? and `TBM32_CRF_ITEM_CD` = ?) AND (Not ( `TBM32_CRF_ITEM_DIV` IN ('Label','Image'))) AND (`TBM32_DEL_FLG` = '0') ORDER BY `TBM32_STUDY_ID`, `TBM32_CRF_ID`, `TBM32_CRF_ITEM_CD` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P006X9", "SELECT `TBM44_STUDY_ID`, `TBM44_CRF_ID`, `TBM44_DEL_FLG`, `TBM44_VISIT_NO`, `TBM44_CRF_EDA_NO` FROM `TBM44_CRF_VISIT` WHERE (`TBM44_STUDY_ID` = ? and `TBM44_CRF_ID` = ?) AND (`TBM44_DEL_FLG` = '0') ORDER BY `TBM44_STUDY_ID`, `TBM44_CRF_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((int[]) buf[5])[0] = rslt.getInt(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4) ;
               ((short[]) buf[6])[0] = rslt.getShort(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[13])[0] = rslt.getVarchar(9) ;
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(5) ;
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6) ;
               ((long[]) buf[10])[0] = rslt.getLong(7) ;
               ((String[]) buf[11])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(10) ;
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 6 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 7 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(5) ;
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
               stmt.setVarchar(2, (String)parms[1], 2);
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 2);
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
               stmt.setVarchar(2, (String)parms[1], 2);
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 50);
               return;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

