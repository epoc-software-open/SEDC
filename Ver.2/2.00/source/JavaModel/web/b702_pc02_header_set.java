/*
               File: B702_PC02_HEADER_SET
        Description: ÉwÉbÉ_Å[èÓïÒê›íËèàóù
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:13:16.24
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b702_pc02_header_set extends GXProcedure
{
   public b702_pc02_header_set( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b702_pc02_header_set.class ), "" );
   }

   public b702_pc02_header_set( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( SdtA_LOGIN_SDT aP0 ,
                             String aP1 ,
                             long aP2 ,
                             int aP3 ,
                             short aP4 ,
                             byte aP5 ,
                             String aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 ,
                             String[] aP11 ,
                             short[] aP12 ,
                             String[] aP13 )
   {
      b702_pc02_header_set.this.AV15W_A_LOGIN_SDT = aP0;
      b702_pc02_header_set.this.AV12P_EXEC_KBN = aP1;
      b702_pc02_header_set.this.AV13P_STUDY_ID = aP2;
      b702_pc02_header_set.this.AV14P_SUBJECT_ID = aP3;
      b702_pc02_header_set.this.AV11P_CRF_ID = aP4;
      b702_pc02_header_set.this.AV35P_CRF_EDA_NO = aP5;
      b702_pc02_header_set.this.AV10P_AUTH_CD = aP6;
      b702_pc02_header_set.this.aP7 = aP7;
      b702_pc02_header_set.this.aP8 = aP8;
      b702_pc02_header_set.this.aP9 = aP9;
      b702_pc02_header_set.this.aP10 = aP10;
      b702_pc02_header_set.this.aP11 = aP11;
      b702_pc02_header_set.this.aP12 = aP12;
      b702_pc02_header_set.this.aP13 = aP13;
      b702_pc02_header_set.this.aP14 = aP14;
      b702_pc02_header_set.this.aP14 = new String[] {""};
      initialize();
      privateExecute();
      return aP14[0];
   }

   public void execute( SdtA_LOGIN_SDT aP0 ,
                        String aP1 ,
                        long aP2 ,
                        int aP3 ,
                        short aP4 ,
                        byte aP5 ,
                        String aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 ,
                        String[] aP10 ,
                        String[] aP11 ,
                        short[] aP12 ,
                        String[] aP13 ,
                        String[] aP14 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14);
   }

   private void execute_int( SdtA_LOGIN_SDT aP0 ,
                             String aP1 ,
                             long aP2 ,
                             int aP3 ,
                             short aP4 ,
                             byte aP5 ,
                             String aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 ,
                             String[] aP11 ,
                             short[] aP12 ,
                             String[] aP13 ,
                             String[] aP14 )
   {
      b702_pc02_header_set.this.AV15W_A_LOGIN_SDT = aP0;
      b702_pc02_header_set.this.AV12P_EXEC_KBN = aP1;
      b702_pc02_header_set.this.AV13P_STUDY_ID = aP2;
      b702_pc02_header_set.this.AV14P_SUBJECT_ID = aP3;
      b702_pc02_header_set.this.AV11P_CRF_ID = aP4;
      b702_pc02_header_set.this.AV35P_CRF_EDA_NO = aP5;
      b702_pc02_header_set.this.AV10P_AUTH_CD = aP6;
      b702_pc02_header_set.this.aP7 = aP7;
      b702_pc02_header_set.this.aP8 = aP8;
      b702_pc02_header_set.this.aP9 = aP9;
      b702_pc02_header_set.this.aP10 = aP10;
      b702_pc02_header_set.this.aP11 = aP11;
      b702_pc02_header_set.this.aP12 = aP12;
      b702_pc02_header_set.this.aP13 = aP13;
      b702_pc02_header_set.this.aP14 = aP14;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Execute user subroutine: S161 */
      S161 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV21W_ERR_FLG = "0" ;
      AV22W_ERR_MSG = "" ;
      /* Execute user subroutine: S111 */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( GXutil.strcmp(AV21W_ERR_FLG, "0") == 0 )
      {
         if ( GXutil.strcmp(AV12P_EXEC_KBN, "1") == 0 )
         {
            /* Execute user subroutine: S121 */
            S121 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( GXutil.strcmp(AV21W_ERR_FLG, "0") == 0 )
            {
               /* Execute user subroutine: S131 */
               S131 ();
               if ( returnInSub )
               {
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               /* Execute user subroutine: S151 */
               S151 ();
               if ( returnInSub )
               {
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
         }
         else
         {
            AV27W_MODE_KBN = "0" ;
            AV26W_MEMO_INP_FLG = "0" ;
            AV17W_DM_ARRI_INP_FLG = "0" ;
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_TBM31_CRF' Routine */
      AV38GXLvl59 = (byte)(0) ;
      /* Using cursor P005L2 */
      pr_default.execute(0, new Object[] {new Long(AV13P_STUDY_ID), new Short(AV11P_CRF_ID)});
      if ( Gx_err != 0 )
      {
         AV38GXLvl59 = (byte)(1) ;
      }
      while ( (pr_default.getStatus(0) != 101) )
      {
         A397TBM31_DEL_FLG = P005L2_A397TBM31_DEL_FLG[0] ;
         n397TBM31_DEL_FLG = P005L2_n397TBM31_DEL_FLG[0] ;
         A69TBM31_CRF_ID = P005L2_A69TBM31_CRF_ID[0] ;
         A68TBM31_STUDY_ID = P005L2_A68TBM31_STUDY_ID[0] ;
         A367TBM21_STUDY_NM = P005L2_A367TBM21_STUDY_NM[0] ;
         n367TBM21_STUDY_NM = P005L2_n367TBM21_STUDY_NM[0] ;
         A642TBM31_CRF_SNM = P005L2_A642TBM31_CRF_SNM[0] ;
         n642TBM31_CRF_SNM = P005L2_n642TBM31_CRF_SNM[0] ;
         A643TBM31_STATUS = P005L2_A643TBM31_STATUS[0] ;
         n643TBM31_STATUS = P005L2_n643TBM31_STATUS[0] ;
         A607TBM21_STATUS = P005L2_A607TBM21_STATUS[0] ;
         n607TBM21_STATUS = P005L2_n607TBM21_STATUS[0] ;
         A394TBM31_GRID_SIZE = P005L2_A394TBM31_GRID_SIZE[0] ;
         n394TBM31_GRID_SIZE = P005L2_n394TBM31_GRID_SIZE[0] ;
         A367TBM21_STUDY_NM = P005L2_A367TBM21_STUDY_NM[0] ;
         n367TBM21_STUDY_NM = P005L2_n367TBM21_STUDY_NM[0] ;
         A607TBM21_STATUS = P005L2_A607TBM21_STATUS[0] ;
         n607TBM21_STATUS = P005L2_n607TBM21_STATUS[0] ;
         AV38GXLvl59 = (byte)(1) ;
         AV28W_STUDY_NM = A367TBM21_STUDY_NM ;
         AV16W_CRF_SNM = A642TBM31_CRF_SNM ;
         AV32W_TBM31_STATUS = A643TBM31_STATUS ;
         AV30W_TBM21_STATUS = A607TBM21_STATUS ;
         AV31W_TBM31_GRID_SIZE = A394TBM31_GRID_SIZE ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV38GXLvl59 == 0 )
      {
         AV21W_ERR_FLG = "1" ;
         GXt_char1 = AV22W_ERR_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char2) ;
         b702_pc02_header_set.this.GXt_char1 = GXv_char2[0] ;
         AV22W_ERR_MSG = GXt_char1 ;
      }
      /* Using cursor P005L3 */
      pr_default.execute(1, new Object[] {new Long(AV13P_STUDY_ID), new Short(AV11P_CRF_ID), new Byte(AV35P_CRF_EDA_NO)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A947TBM44_CRF_EDA_NO = P005L3_A947TBM44_CRF_EDA_NO[0] ;
         A946TBM44_CRF_ID = P005L3_A946TBM44_CRF_ID[0] ;
         A945TBM44_STUDY_ID = P005L3_A945TBM44_STUDY_ID[0] ;
         A948TBM44_VISIT_NO = P005L3_A948TBM44_VISIT_NO[0] ;
         n948TBM44_VISIT_NO = P005L3_n948TBM44_VISIT_NO[0] ;
         AV16W_CRF_SNM = AV16W_CRF_SNM + "(" + GXutil.trim( GXutil.str( A948TBM44_VISIT_NO, 10, 0)) + ")" ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   public void S121( )
   {
      /* 'SUB_TBT02_CRF' Routine */
      AV40GXLvl97 = (byte)(0) ;
      /* Using cursor P005L4 */
      pr_default.execute(2, new Object[] {new Long(AV13P_STUDY_ID), new Integer(AV14P_SUBJECT_ID), new Short(AV11P_CRF_ID), new Byte(AV35P_CRF_EDA_NO)});
      if ( Gx_err != 0 )
      {
         AV40GXLvl97 = (byte)(1) ;
      }
      while ( (pr_default.getStatus(2) != 101) )
      {
         A449TBT02_DEL_FLG = P005L4_A449TBT02_DEL_FLG[0] ;
         n449TBT02_DEL_FLG = P005L4_n449TBT02_DEL_FLG[0] ;
         A935TBT02_CRF_EDA_NO = P005L4_A935TBT02_CRF_EDA_NO[0] ;
         A91TBT02_CRF_ID = P005L4_A91TBT02_CRF_ID[0] ;
         A90TBT02_SUBJECT_ID = P005L4_A90TBT02_SUBJECT_ID[0] ;
         A89TBT02_STUDY_ID = P005L4_A89TBT02_STUDY_ID[0] ;
         A661TBT02_INPUT_END_FLG = P005L4_A661TBT02_INPUT_END_FLG[0] ;
         n661TBT02_INPUT_END_FLG = P005L4_n661TBT02_INPUT_END_FLG[0] ;
         A655TBT02_DM_ARRIVAL_FLG = P005L4_A655TBT02_DM_ARRIVAL_FLG[0] ;
         n655TBT02_DM_ARRIVAL_FLG = P005L4_n655TBT02_DM_ARRIVAL_FLG[0] ;
         A656TBT02_DM_ARRIVAL_DATETIME = P005L4_A656TBT02_DM_ARRIVAL_DATETIME[0] ;
         n656TBT02_DM_ARRIVAL_DATETIME = P005L4_n656TBT02_DM_ARRIVAL_DATETIME[0] ;
         AV40GXLvl97 = (byte)(1) ;
         AV33W_TBT02_INPUT_END_FLG = A661TBT02_INPUT_END_FLG ;
         if ( GXutil.strcmp(A655TBT02_DM_ARRIVAL_FLG, "1") == 0 )
         {
            AV18W_DM_ARRIVAL_JYOTAI = "2" ;
         }
         else
         {
            if ( GXutil.nullDate().equals(A656TBT02_DM_ARRIVAL_DATETIME) )
            {
               AV18W_DM_ARRIVAL_JYOTAI = "1" ;
            }
            else
            {
               AV18W_DM_ARRIVAL_JYOTAI = "3" ;
            }
         }
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      if ( AV40GXLvl97 == 0 )
      {
         AV21W_ERR_FLG = "1" ;
         GXt_char1 = AV22W_ERR_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char2) ;
         b702_pc02_header_set.this.GXt_char1 = GXv_char2[0] ;
         AV22W_ERR_MSG = GXt_char1 ;
      }
   }

   public void S131( )
   {
      /* 'SUB_KNGN_INFO' Routine */
      AV23W_FLG_CRF_INP = "0" ;
      AV25W_FLG_MEMO_INP = "0" ;
      AV24W_FLG_DM_ARRI = "0" ;
      /* Using cursor P005L5 */
      pr_default.execute(3, new Object[] {AV10P_AUTH_CD});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A191TBM08_AUTH_CD = P005L5_A191TBM08_AUTH_CD[0] ;
         A863TBM08_DM_MICHAKU_CRF_FLG = P005L5_A863TBM08_DM_MICHAKU_CRF_FLG[0] ;
         n863TBM08_DM_MICHAKU_CRF_FLG = P005L5_n863TBM08_DM_MICHAKU_CRF_FLG[0] ;
         A864TBM08_DM_MICHAKU_MEMO_FLG = P005L5_A864TBM08_DM_MICHAKU_MEMO_FLG[0] ;
         n864TBM08_DM_MICHAKU_MEMO_FLG = P005L5_n864TBM08_DM_MICHAKU_MEMO_FLG[0] ;
         A865TBM08_DM_MICHAKU_DM_FLG = P005L5_A865TBM08_DM_MICHAKU_DM_FLG[0] ;
         n865TBM08_DM_MICHAKU_DM_FLG = P005L5_n865TBM08_DM_MICHAKU_DM_FLG[0] ;
         A866TBM08_DM_ARRI_CRF_FLG = P005L5_A866TBM08_DM_ARRI_CRF_FLG[0] ;
         n866TBM08_DM_ARRI_CRF_FLG = P005L5_n866TBM08_DM_ARRI_CRF_FLG[0] ;
         A867TBM08_DM_ARRI_MEMO_FLG = P005L5_A867TBM08_DM_ARRI_MEMO_FLG[0] ;
         n867TBM08_DM_ARRI_MEMO_FLG = P005L5_n867TBM08_DM_ARRI_MEMO_FLG[0] ;
         A868TBM08_DM_ARRI_DM_FLG = P005L5_A868TBM08_DM_ARRI_DM_FLG[0] ;
         n868TBM08_DM_ARRI_DM_FLG = P005L5_n868TBM08_DM_ARRI_DM_FLG[0] ;
         A869TBM08_DM_KAIJO_CRF_FLG = P005L5_A869TBM08_DM_KAIJO_CRF_FLG[0] ;
         n869TBM08_DM_KAIJO_CRF_FLG = P005L5_n869TBM08_DM_KAIJO_CRF_FLG[0] ;
         A870TBM08_DM_KAIJO_MEMO_FLG = P005L5_A870TBM08_DM_KAIJO_MEMO_FLG[0] ;
         n870TBM08_DM_KAIJO_MEMO_FLG = P005L5_n870TBM08_DM_KAIJO_MEMO_FLG[0] ;
         A871TBM08_DM_KAIJO_DM_FLG = P005L5_A871TBM08_DM_KAIJO_DM_FLG[0] ;
         n871TBM08_DM_KAIJO_DM_FLG = P005L5_n871TBM08_DM_KAIJO_DM_FLG[0] ;
         if ( GXutil.strcmp(AV18W_DM_ARRIVAL_JYOTAI, "1") == 0 )
         {
            AV23W_FLG_CRF_INP = A863TBM08_DM_MICHAKU_CRF_FLG ;
            AV25W_FLG_MEMO_INP = A864TBM08_DM_MICHAKU_MEMO_FLG ;
            AV24W_FLG_DM_ARRI = A865TBM08_DM_MICHAKU_DM_FLG ;
         }
         else if ( GXutil.strcmp(AV18W_DM_ARRIVAL_JYOTAI, "2") == 0 )
         {
            AV23W_FLG_CRF_INP = A866TBM08_DM_ARRI_CRF_FLG ;
            AV25W_FLG_MEMO_INP = A867TBM08_DM_ARRI_MEMO_FLG ;
            AV24W_FLG_DM_ARRI = A868TBM08_DM_ARRI_DM_FLG ;
         }
         else if ( GXutil.strcmp(AV18W_DM_ARRIVAL_JYOTAI, "3") == 0 )
         {
            AV23W_FLG_CRF_INP = A869TBM08_DM_KAIJO_CRF_FLG ;
            AV25W_FLG_MEMO_INP = A870TBM08_DM_KAIJO_MEMO_FLG ;
            AV24W_FLG_DM_ARRI = A871TBM08_DM_KAIJO_DM_FLG ;
         }
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      /* Using cursor P005L6 */
      pr_default.execute(4);
      while ( (pr_default.getStatus(4) != 101) )
      {
         A58TBM01_SYS_ID = P005L6_A58TBM01_SYS_ID[0] ;
         A608TBM01_SYS_VALUE = P005L6_A608TBM01_SYS_VALUE[0] ;
         n608TBM01_SYS_VALUE = P005L6_n608TBM01_SYS_VALUE[0] ;
         if ( GXutil.strcmp(A608TBM01_SYS_VALUE, AV10P_AUTH_CD) == 0 )
         {
            /* Execute user subroutine: S146 */
            S146 ();
            if ( returnInSub )
            {
               pr_default.close(4);
               returnInSub = true;
               if (true) return;
            }
            if ( GXutil.strcmp(AV15W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_site_id(), AV34W_TBT01_SITE_ID) != 0 )
            {
               AV23W_FLG_CRF_INP = "0" ;
            }
         }
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
   }

   public void S146( )
   {
      /* 'SUB_GET_SITE_ID' Routine */
      AV43GXLvl194 = (byte)(0) ;
      /* Using cursor P005L7 */
      pr_default.execute(5, new Object[] {new Long(AV13P_STUDY_ID), new Integer(AV14P_SUBJECT_ID)});
      if ( Gx_err != 0 )
      {
         AV43GXLvl194 = (byte)(1) ;
      }
      while ( (pr_default.getStatus(5) != 101) )
      {
         A88TBT01_SUBJECT_ID = P005L7_A88TBT01_SUBJECT_ID[0] ;
         A87TBT01_STUDY_ID = P005L7_A87TBT01_STUDY_ID[0] ;
         A698TBT01_SITE_ID = P005L7_A698TBT01_SITE_ID[0] ;
         n698TBT01_SITE_ID = P005L7_n698TBT01_SITE_ID[0] ;
         AV43GXLvl194 = (byte)(1) ;
         AV34W_TBT01_SITE_ID = A698TBT01_SITE_ID ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
      if ( AV43GXLvl194 == 0 )
      {
         AV34W_TBT01_SITE_ID = "" ;
      }
   }

   public void S151( )
   {
      /* 'SUB_OUT_PARM_SET' Routine */
      if ( GXutil.strcmp(AV33W_TBT02_INPUT_END_FLG, "1") == 0 )
      {
         AV27W_MODE_KBN = "0" ;
         AV26W_MEMO_INP_FLG = "0" ;
         AV17W_DM_ARRI_INP_FLG = "0" ;
      }
      else
      {
         if ( ( GXutil.strcmp(AV30W_TBM21_STATUS, "0") == 0 ) || ( GXutil.strcmp(AV32W_TBM31_STATUS, "0") == 0 ) )
         {
            if ( GXutil.strcmp(AV15W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_kngn_ptn_kbn(), AV8C_DM_AUTH_CD) == 0 )
            {
               if ( GXutil.strcmp(AV23W_FLG_CRF_INP, "1") == 0 )
               {
                  AV27W_MODE_KBN = "2" ;
                  AV26W_MEMO_INP_FLG = AV25W_FLG_MEMO_INP ;
                  AV17W_DM_ARRI_INP_FLG = AV24W_FLG_DM_ARRI ;
               }
               else
               {
                  AV27W_MODE_KBN = "0" ;
                  AV26W_MEMO_INP_FLG = "0" ;
                  AV17W_DM_ARRI_INP_FLG = "0" ;
               }
            }
            else
            {
               AV27W_MODE_KBN = "0" ;
               AV26W_MEMO_INP_FLG = "0" ;
               AV17W_DM_ARRI_INP_FLG = "0" ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(AV30W_TBM21_STATUS, "1") == 0 ) && ( GXutil.strcmp(AV32W_TBM31_STATUS, "1") == 0 ) )
            {
               if ( GXutil.strcmp(AV23W_FLG_CRF_INP, "1") == 0 )
               {
                  AV27W_MODE_KBN = "1" ;
                  AV26W_MEMO_INP_FLG = AV25W_FLG_MEMO_INP ;
                  AV17W_DM_ARRI_INP_FLG = AV24W_FLG_DM_ARRI ;
               }
               else
               {
                  AV27W_MODE_KBN = "0" ;
                  AV26W_MEMO_INP_FLG = "0" ;
                  AV17W_DM_ARRI_INP_FLG = "0" ;
               }
            }
            else
            {
               AV21W_ERR_FLG = "1" ;
               GXt_char1 = AV22W_ERR_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char2) ;
               b702_pc02_header_set.this.GXt_char1 = GXv_char2[0] ;
               AV22W_ERR_MSG = GXt_char1 ;
            }
         }
      }
   }

   public void S161( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_char2[0] = AV8C_DM_AUTH_CD ;
      GXv_int3[0] = (byte)(AV9C_DM_INPUT_LEVEL) ;
      new b799_pc06_dm_info_get(remoteHandle, context).execute( GXv_char2, GXv_int3) ;
      b702_pc02_header_set.this.AV8C_DM_AUTH_CD = GXv_char2[0] ;
      b702_pc02_header_set.this.AV9C_DM_INPUT_LEVEL = GXv_int3[0] ;
   }

   public void S171( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV44Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "b790_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("b790_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   protected void cleanup( )
   {
      this.aP7[0] = b702_pc02_header_set.this.AV27W_MODE_KBN;
      this.aP8[0] = b702_pc02_header_set.this.AV26W_MEMO_INP_FLG;
      this.aP9[0] = b702_pc02_header_set.this.AV17W_DM_ARRI_INP_FLG;
      this.aP10[0] = b702_pc02_header_set.this.AV28W_STUDY_NM;
      this.aP11[0] = b702_pc02_header_set.this.AV16W_CRF_SNM;
      this.aP12[0] = b702_pc02_header_set.this.AV31W_TBM31_GRID_SIZE;
      this.aP13[0] = b702_pc02_header_set.this.AV21W_ERR_FLG;
      this.aP14[0] = b702_pc02_header_set.this.AV22W_ERR_MSG;
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
      AV27W_MODE_KBN = "" ;
      AV26W_MEMO_INP_FLG = "" ;
      AV17W_DM_ARRI_INP_FLG = "" ;
      AV28W_STUDY_NM = "" ;
      AV16W_CRF_SNM = "" ;
      AV21W_ERR_FLG = "" ;
      AV22W_ERR_MSG = "" ;
      A367TBM21_STUDY_NM = "" ;
      A642TBM31_CRF_SNM = "" ;
      A643TBM31_STATUS = "" ;
      A607TBM21_STATUS = "" ;
      scmdbuf = "" ;
      P005L2_A397TBM31_DEL_FLG = new String[] {""} ;
      P005L2_n397TBM31_DEL_FLG = new boolean[] {false} ;
      P005L2_A69TBM31_CRF_ID = new short[1] ;
      P005L2_A68TBM31_STUDY_ID = new long[1] ;
      P005L2_A367TBM21_STUDY_NM = new String[] {""} ;
      P005L2_n367TBM21_STUDY_NM = new boolean[] {false} ;
      P005L2_A642TBM31_CRF_SNM = new String[] {""} ;
      P005L2_n642TBM31_CRF_SNM = new boolean[] {false} ;
      P005L2_A643TBM31_STATUS = new String[] {""} ;
      P005L2_n643TBM31_STATUS = new boolean[] {false} ;
      P005L2_A607TBM21_STATUS = new String[] {""} ;
      P005L2_n607TBM21_STATUS = new boolean[] {false} ;
      P005L2_A394TBM31_GRID_SIZE = new short[1] ;
      P005L2_n394TBM31_GRID_SIZE = new boolean[] {false} ;
      A397TBM31_DEL_FLG = "" ;
      AV32W_TBM31_STATUS = "" ;
      AV30W_TBM21_STATUS = "" ;
      P005L3_A947TBM44_CRF_EDA_NO = new byte[1] ;
      P005L3_A946TBM44_CRF_ID = new short[1] ;
      P005L3_A945TBM44_STUDY_ID = new long[1] ;
      P005L3_A948TBM44_VISIT_NO = new int[1] ;
      P005L3_n948TBM44_VISIT_NO = new boolean[] {false} ;
      A661TBT02_INPUT_END_FLG = "" ;
      A655TBT02_DM_ARRIVAL_FLG = "" ;
      A656TBT02_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      P005L4_A449TBT02_DEL_FLG = new String[] {""} ;
      P005L4_n449TBT02_DEL_FLG = new boolean[] {false} ;
      P005L4_A935TBT02_CRF_EDA_NO = new byte[1] ;
      P005L4_A91TBT02_CRF_ID = new short[1] ;
      P005L4_A90TBT02_SUBJECT_ID = new int[1] ;
      P005L4_A89TBT02_STUDY_ID = new long[1] ;
      P005L4_A661TBT02_INPUT_END_FLG = new String[] {""} ;
      P005L4_n661TBT02_INPUT_END_FLG = new boolean[] {false} ;
      P005L4_A655TBT02_DM_ARRIVAL_FLG = new String[] {""} ;
      P005L4_n655TBT02_DM_ARRIVAL_FLG = new boolean[] {false} ;
      P005L4_A656TBT02_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P005L4_n656TBT02_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      A449TBT02_DEL_FLG = "" ;
      AV33W_TBT02_INPUT_END_FLG = "" ;
      AV18W_DM_ARRIVAL_JYOTAI = "" ;
      A698TBT01_SITE_ID = "" ;
      AV23W_FLG_CRF_INP = "" ;
      AV25W_FLG_MEMO_INP = "" ;
      AV24W_FLG_DM_ARRI = "" ;
      P005L5_A191TBM08_AUTH_CD = new String[] {""} ;
      P005L5_A863TBM08_DM_MICHAKU_CRF_FLG = new String[] {""} ;
      P005L5_n863TBM08_DM_MICHAKU_CRF_FLG = new boolean[] {false} ;
      P005L5_A864TBM08_DM_MICHAKU_MEMO_FLG = new String[] {""} ;
      P005L5_n864TBM08_DM_MICHAKU_MEMO_FLG = new boolean[] {false} ;
      P005L5_A865TBM08_DM_MICHAKU_DM_FLG = new String[] {""} ;
      P005L5_n865TBM08_DM_MICHAKU_DM_FLG = new boolean[] {false} ;
      P005L5_A866TBM08_DM_ARRI_CRF_FLG = new String[] {""} ;
      P005L5_n866TBM08_DM_ARRI_CRF_FLG = new boolean[] {false} ;
      P005L5_A867TBM08_DM_ARRI_MEMO_FLG = new String[] {""} ;
      P005L5_n867TBM08_DM_ARRI_MEMO_FLG = new boolean[] {false} ;
      P005L5_A868TBM08_DM_ARRI_DM_FLG = new String[] {""} ;
      P005L5_n868TBM08_DM_ARRI_DM_FLG = new boolean[] {false} ;
      P005L5_A869TBM08_DM_KAIJO_CRF_FLG = new String[] {""} ;
      P005L5_n869TBM08_DM_KAIJO_CRF_FLG = new boolean[] {false} ;
      P005L5_A870TBM08_DM_KAIJO_MEMO_FLG = new String[] {""} ;
      P005L5_n870TBM08_DM_KAIJO_MEMO_FLG = new boolean[] {false} ;
      P005L5_A871TBM08_DM_KAIJO_DM_FLG = new String[] {""} ;
      P005L5_n871TBM08_DM_KAIJO_DM_FLG = new boolean[] {false} ;
      A191TBM08_AUTH_CD = "" ;
      A863TBM08_DM_MICHAKU_CRF_FLG = "" ;
      A864TBM08_DM_MICHAKU_MEMO_FLG = "" ;
      A865TBM08_DM_MICHAKU_DM_FLG = "" ;
      A866TBM08_DM_ARRI_CRF_FLG = "" ;
      A867TBM08_DM_ARRI_MEMO_FLG = "" ;
      A868TBM08_DM_ARRI_DM_FLG = "" ;
      A869TBM08_DM_KAIJO_CRF_FLG = "" ;
      A870TBM08_DM_KAIJO_MEMO_FLG = "" ;
      A871TBM08_DM_KAIJO_DM_FLG = "" ;
      P005L6_A58TBM01_SYS_ID = new String[] {""} ;
      P005L6_A608TBM01_SYS_VALUE = new String[] {""} ;
      P005L6_n608TBM01_SYS_VALUE = new boolean[] {false} ;
      A58TBM01_SYS_ID = "" ;
      A608TBM01_SYS_VALUE = "" ;
      AV34W_TBT01_SITE_ID = "" ;
      P005L7_A88TBT01_SUBJECT_ID = new int[1] ;
      P005L7_A87TBT01_STUDY_ID = new long[1] ;
      P005L7_A698TBT01_SITE_ID = new String[] {""} ;
      P005L7_n698TBT01_SITE_ID = new boolean[] {false} ;
      AV8C_DM_AUTH_CD = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      GXv_int3 = new byte [1] ;
      AV44Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b702_pc02_header_set__default(),
         new Object[] {
             new Object[] {
            P005L2_A397TBM31_DEL_FLG, P005L2_n397TBM31_DEL_FLG, P005L2_A69TBM31_CRF_ID, P005L2_A68TBM31_STUDY_ID, P005L2_A367TBM21_STUDY_NM, P005L2_n367TBM21_STUDY_NM, P005L2_A642TBM31_CRF_SNM, P005L2_n642TBM31_CRF_SNM, P005L2_A643TBM31_STATUS, P005L2_n643TBM31_STATUS,
            P005L2_A607TBM21_STATUS, P005L2_n607TBM21_STATUS, P005L2_A394TBM31_GRID_SIZE, P005L2_n394TBM31_GRID_SIZE
            }
            , new Object[] {
            P005L3_A947TBM44_CRF_EDA_NO, P005L3_A946TBM44_CRF_ID, P005L3_A945TBM44_STUDY_ID, P005L3_A948TBM44_VISIT_NO, P005L3_n948TBM44_VISIT_NO
            }
            , new Object[] {
            P005L4_A449TBT02_DEL_FLG, P005L4_n449TBT02_DEL_FLG, P005L4_A935TBT02_CRF_EDA_NO, P005L4_A91TBT02_CRF_ID, P005L4_A90TBT02_SUBJECT_ID, P005L4_A89TBT02_STUDY_ID, P005L4_A661TBT02_INPUT_END_FLG, P005L4_n661TBT02_INPUT_END_FLG, P005L4_A655TBT02_DM_ARRIVAL_FLG, P005L4_n655TBT02_DM_ARRIVAL_FLG,
            P005L4_A656TBT02_DM_ARRIVAL_DATETIME, P005L4_n656TBT02_DM_ARRIVAL_DATETIME
            }
            , new Object[] {
            P005L5_A191TBM08_AUTH_CD, P005L5_A863TBM08_DM_MICHAKU_CRF_FLG, P005L5_n863TBM08_DM_MICHAKU_CRF_FLG, P005L5_A864TBM08_DM_MICHAKU_MEMO_FLG, P005L5_n864TBM08_DM_MICHAKU_MEMO_FLG, P005L5_A865TBM08_DM_MICHAKU_DM_FLG, P005L5_n865TBM08_DM_MICHAKU_DM_FLG, P005L5_A866TBM08_DM_ARRI_CRF_FLG, P005L5_n866TBM08_DM_ARRI_CRF_FLG, P005L5_A867TBM08_DM_ARRI_MEMO_FLG,
            P005L5_n867TBM08_DM_ARRI_MEMO_FLG, P005L5_A868TBM08_DM_ARRI_DM_FLG, P005L5_n868TBM08_DM_ARRI_DM_FLG, P005L5_A869TBM08_DM_KAIJO_CRF_FLG, P005L5_n869TBM08_DM_KAIJO_CRF_FLG, P005L5_A870TBM08_DM_KAIJO_MEMO_FLG, P005L5_n870TBM08_DM_KAIJO_MEMO_FLG, P005L5_A871TBM08_DM_KAIJO_DM_FLG, P005L5_n871TBM08_DM_KAIJO_DM_FLG
            }
            , new Object[] {
            P005L6_A58TBM01_SYS_ID, P005L6_A608TBM01_SYS_VALUE, P005L6_n608TBM01_SYS_VALUE
            }
            , new Object[] {
            P005L7_A88TBT01_SUBJECT_ID, P005L7_A87TBT01_STUDY_ID, P005L7_A698TBT01_SITE_ID, P005L7_n698TBT01_SITE_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV44Pgmname = "B702_PC02_HEADER_SET" ;
      /* GeneXus formulas. */
      AV44Pgmname = "B702_PC02_HEADER_SET" ;
      Gx_err = (short)(0) ;
   }

   private byte AV35P_CRF_EDA_NO ;
   private byte AV38GXLvl59 ;
   private byte A947TBM44_CRF_EDA_NO ;
   private byte AV40GXLvl97 ;
   private byte A935TBT02_CRF_EDA_NO ;
   private byte AV43GXLvl194 ;
   private byte GXv_int3[] ;
   private short AV11P_CRF_ID ;
   private short AV31W_TBM31_GRID_SIZE ;
   private short A394TBM31_GRID_SIZE ;
   private short Gx_err ;
   private short A69TBM31_CRF_ID ;
   private short A946TBM44_CRF_ID ;
   private short A91TBT02_CRF_ID ;
   private short AV9C_DM_INPUT_LEVEL ;
   private int AV14P_SUBJECT_ID ;
   private int A948TBM44_VISIT_NO ;
   private int A90TBT02_SUBJECT_ID ;
   private int A88TBT01_SUBJECT_ID ;
   private int GXActiveErrHndl ;
   private long AV13P_STUDY_ID ;
   private long A68TBM31_STUDY_ID ;
   private long A945TBM44_STUDY_ID ;
   private long A89TBT02_STUDY_ID ;
   private long A87TBT01_STUDY_ID ;
   private String scmdbuf ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV44Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String Gx_emsg ;
   private java.util.Date A656TBT02_DM_ARRIVAL_DATETIME ;
   private boolean returnInSub ;
   private boolean n397TBM31_DEL_FLG ;
   private boolean n367TBM21_STUDY_NM ;
   private boolean n642TBM31_CRF_SNM ;
   private boolean n643TBM31_STATUS ;
   private boolean n607TBM21_STATUS ;
   private boolean n394TBM31_GRID_SIZE ;
   private boolean n948TBM44_VISIT_NO ;
   private boolean n449TBT02_DEL_FLG ;
   private boolean n661TBT02_INPUT_END_FLG ;
   private boolean n655TBT02_DM_ARRIVAL_FLG ;
   private boolean n656TBT02_DM_ARRIVAL_DATETIME ;
   private boolean n863TBM08_DM_MICHAKU_CRF_FLG ;
   private boolean n864TBM08_DM_MICHAKU_MEMO_FLG ;
   private boolean n865TBM08_DM_MICHAKU_DM_FLG ;
   private boolean n866TBM08_DM_ARRI_CRF_FLG ;
   private boolean n867TBM08_DM_ARRI_MEMO_FLG ;
   private boolean n868TBM08_DM_ARRI_DM_FLG ;
   private boolean n869TBM08_DM_KAIJO_CRF_FLG ;
   private boolean n870TBM08_DM_KAIJO_MEMO_FLG ;
   private boolean n871TBM08_DM_KAIJO_DM_FLG ;
   private boolean n608TBM01_SYS_VALUE ;
   private boolean n698TBT01_SITE_ID ;
   private String AV12P_EXEC_KBN ;
   private String AV10P_AUTH_CD ;
   private String AV27W_MODE_KBN ;
   private String AV26W_MEMO_INP_FLG ;
   private String AV17W_DM_ARRI_INP_FLG ;
   private String AV28W_STUDY_NM ;
   private String AV16W_CRF_SNM ;
   private String AV21W_ERR_FLG ;
   private String AV22W_ERR_MSG ;
   private String A367TBM21_STUDY_NM ;
   private String A642TBM31_CRF_SNM ;
   private String A643TBM31_STATUS ;
   private String A607TBM21_STATUS ;
   private String A397TBM31_DEL_FLG ;
   private String AV32W_TBM31_STATUS ;
   private String AV30W_TBM21_STATUS ;
   private String A661TBT02_INPUT_END_FLG ;
   private String A655TBT02_DM_ARRIVAL_FLG ;
   private String A449TBT02_DEL_FLG ;
   private String AV33W_TBT02_INPUT_END_FLG ;
   private String AV18W_DM_ARRIVAL_JYOTAI ;
   private String A698TBT01_SITE_ID ;
   private String AV23W_FLG_CRF_INP ;
   private String AV25W_FLG_MEMO_INP ;
   private String AV24W_FLG_DM_ARRI ;
   private String A191TBM08_AUTH_CD ;
   private String A863TBM08_DM_MICHAKU_CRF_FLG ;
   private String A864TBM08_DM_MICHAKU_MEMO_FLG ;
   private String A865TBM08_DM_MICHAKU_DM_FLG ;
   private String A866TBM08_DM_ARRI_CRF_FLG ;
   private String A867TBM08_DM_ARRI_MEMO_FLG ;
   private String A868TBM08_DM_ARRI_DM_FLG ;
   private String A869TBM08_DM_KAIJO_CRF_FLG ;
   private String A870TBM08_DM_KAIJO_MEMO_FLG ;
   private String A871TBM08_DM_KAIJO_DM_FLG ;
   private String A58TBM01_SYS_ID ;
   private String A608TBM01_SYS_VALUE ;
   private String AV34W_TBT01_SITE_ID ;
   private String AV8C_DM_AUTH_CD ;
   private String[] aP7 ;
   private String[] aP8 ;
   private String[] aP9 ;
   private String[] aP10 ;
   private String[] aP11 ;
   private short[] aP12 ;
   private String[] aP13 ;
   private String[] aP14 ;
   private IDataStoreProvider pr_default ;
   private String[] P005L2_A397TBM31_DEL_FLG ;
   private boolean[] P005L2_n397TBM31_DEL_FLG ;
   private short[] P005L2_A69TBM31_CRF_ID ;
   private long[] P005L2_A68TBM31_STUDY_ID ;
   private String[] P005L2_A367TBM21_STUDY_NM ;
   private boolean[] P005L2_n367TBM21_STUDY_NM ;
   private String[] P005L2_A642TBM31_CRF_SNM ;
   private boolean[] P005L2_n642TBM31_CRF_SNM ;
   private String[] P005L2_A643TBM31_STATUS ;
   private boolean[] P005L2_n643TBM31_STATUS ;
   private String[] P005L2_A607TBM21_STATUS ;
   private boolean[] P005L2_n607TBM21_STATUS ;
   private short[] P005L2_A394TBM31_GRID_SIZE ;
   private boolean[] P005L2_n394TBM31_GRID_SIZE ;
   private byte[] P005L3_A947TBM44_CRF_EDA_NO ;
   private short[] P005L3_A946TBM44_CRF_ID ;
   private long[] P005L3_A945TBM44_STUDY_ID ;
   private int[] P005L3_A948TBM44_VISIT_NO ;
   private boolean[] P005L3_n948TBM44_VISIT_NO ;
   private String[] P005L4_A449TBT02_DEL_FLG ;
   private boolean[] P005L4_n449TBT02_DEL_FLG ;
   private byte[] P005L4_A935TBT02_CRF_EDA_NO ;
   private short[] P005L4_A91TBT02_CRF_ID ;
   private int[] P005L4_A90TBT02_SUBJECT_ID ;
   private long[] P005L4_A89TBT02_STUDY_ID ;
   private String[] P005L4_A661TBT02_INPUT_END_FLG ;
   private boolean[] P005L4_n661TBT02_INPUT_END_FLG ;
   private String[] P005L4_A655TBT02_DM_ARRIVAL_FLG ;
   private boolean[] P005L4_n655TBT02_DM_ARRIVAL_FLG ;
   private java.util.Date[] P005L4_A656TBT02_DM_ARRIVAL_DATETIME ;
   private boolean[] P005L4_n656TBT02_DM_ARRIVAL_DATETIME ;
   private String[] P005L5_A191TBM08_AUTH_CD ;
   private String[] P005L5_A863TBM08_DM_MICHAKU_CRF_FLG ;
   private boolean[] P005L5_n863TBM08_DM_MICHAKU_CRF_FLG ;
   private String[] P005L5_A864TBM08_DM_MICHAKU_MEMO_FLG ;
   private boolean[] P005L5_n864TBM08_DM_MICHAKU_MEMO_FLG ;
   private String[] P005L5_A865TBM08_DM_MICHAKU_DM_FLG ;
   private boolean[] P005L5_n865TBM08_DM_MICHAKU_DM_FLG ;
   private String[] P005L5_A866TBM08_DM_ARRI_CRF_FLG ;
   private boolean[] P005L5_n866TBM08_DM_ARRI_CRF_FLG ;
   private String[] P005L5_A867TBM08_DM_ARRI_MEMO_FLG ;
   private boolean[] P005L5_n867TBM08_DM_ARRI_MEMO_FLG ;
   private String[] P005L5_A868TBM08_DM_ARRI_DM_FLG ;
   private boolean[] P005L5_n868TBM08_DM_ARRI_DM_FLG ;
   private String[] P005L5_A869TBM08_DM_KAIJO_CRF_FLG ;
   private boolean[] P005L5_n869TBM08_DM_KAIJO_CRF_FLG ;
   private String[] P005L5_A870TBM08_DM_KAIJO_MEMO_FLG ;
   private boolean[] P005L5_n870TBM08_DM_KAIJO_MEMO_FLG ;
   private String[] P005L5_A871TBM08_DM_KAIJO_DM_FLG ;
   private boolean[] P005L5_n871TBM08_DM_KAIJO_DM_FLG ;
   private String[] P005L6_A58TBM01_SYS_ID ;
   private String[] P005L6_A608TBM01_SYS_VALUE ;
   private boolean[] P005L6_n608TBM01_SYS_VALUE ;
   private int[] P005L7_A88TBT01_SUBJECT_ID ;
   private long[] P005L7_A87TBT01_STUDY_ID ;
   private String[] P005L7_A698TBT01_SITE_ID ;
   private boolean[] P005L7_n698TBT01_SITE_ID ;
   private SdtA_LOGIN_SDT AV15W_A_LOGIN_SDT ;
}

final  class b702_pc02_header_set__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P005L2", "SELECT T1.`TBM31_DEL_FLG`, T1.`TBM31_CRF_ID`, T1.`TBM31_STUDY_ID` AS TBM31_STUDY_ID, T2.`TBM21_STUDY_NM`, T1.`TBM31_CRF_SNM`, T1.`TBM31_STATUS`, T2.`TBM21_STATUS`, T1.`TBM31_GRID_SIZE` FROM (`TBM31_CRF` T1 INNER JOIN `TBM21_STUDY` T2 ON T2.`TBM21_STUDY_ID` = T1.`TBM31_STUDY_ID`) WHERE (T1.`TBM31_STUDY_ID` = ? and T1.`TBM31_CRF_ID` = ?) AND (T1.`TBM31_DEL_FLG` = '0') ORDER BY T1.`TBM31_STUDY_ID`, T1.`TBM31_CRF_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P005L3", "SELECT `TBM44_CRF_EDA_NO`, `TBM44_CRF_ID`, `TBM44_STUDY_ID`, `TBM44_VISIT_NO` FROM `TBM44_CRF_VISIT` WHERE `TBM44_STUDY_ID` = ? and `TBM44_CRF_ID` = ? and `TBM44_CRF_EDA_NO` = ? ORDER BY `TBM44_STUDY_ID`, `TBM44_CRF_ID`, `TBM44_CRF_EDA_NO`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P005L4", "SELECT `TBT02_DEL_FLG`, `TBT02_CRF_EDA_NO`, `TBT02_CRF_ID`, `TBT02_SUBJECT_ID`, `TBT02_STUDY_ID`, `TBT02_INPUT_END_FLG`, `TBT02_DM_ARRIVAL_FLG`, `TBT02_DM_ARRIVAL_DATETIME` FROM `TBT02_CRF` WHERE (`TBT02_STUDY_ID` = ? and `TBT02_SUBJECT_ID` = ? and `TBT02_CRF_ID` = ? and `TBT02_CRF_EDA_NO` = ?) AND (`TBT02_DEL_FLG` = '0') ORDER BY `TBT02_STUDY_ID`, `TBT02_SUBJECT_ID`, `TBT02_CRF_ID`, `TBT02_CRF_EDA_NO`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P005L5", "SELECT `TBM08_AUTH_CD`, `TBM08_DM_MICHAKU_CRF_FLG`, `TBM08_DM_MICHAKU_MEMO_FLG`, `TBM08_DM_MICHAKU_DM_FLG`, `TBM08_DM_ARRI_CRF_FLG`, `TBM08_DM_ARRI_MEMO_FLG`, `TBM08_DM_ARRI_DM_FLG`, `TBM08_DM_KAIJO_CRF_FLG`, `TBM08_DM_KAIJO_MEMO_FLG`, `TBM08_DM_KAIJO_DM_FLG` FROM `TBM08_AUTH_INP_LVL` WHERE `TBM08_AUTH_CD` = ? ORDER BY `TBM08_AUTH_CD`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P005L6", "SELECT `TBM01_SYS_ID`, `TBM01_SYS_VALUE` FROM `TBM01_SYSTEM` WHERE `TBM01_SYS_ID` = '014' ORDER BY `TBM01_SYS_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P005L7", "SELECT `TBT01_SUBJECT_ID`, `TBT01_STUDY_ID`, `TBT01_SITE_ID` FROM `TBT01_SUBJECT` WHERE `TBT01_STUDY_ID` = ? and `TBT01_SUBJECT_ID` = ? ORDER BY `TBT01_STUDY_ID`, `TBT01_SUBJECT_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((short[]) buf[2])[0] = rslt.getShort(2) ;
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(8) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2) ;
               ((short[]) buf[3])[0] = rslt.getShort(3) ;
               ((int[]) buf[4])[0] = rslt.getInt(4) ;
               ((long[]) buf[5])[0] = rslt.getLong(5) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(8) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
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
               ((String[]) buf[13])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 2);
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

