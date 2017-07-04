/*
               File: B702_PC02_HEADER_SET
        Description: ÉwÉbÉ_Å[èÓïÒê›íËèàóù
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:53:4.85
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
                             String aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 ,
                             short[] aP11 ,
                             String[] aP12 )
   {
      b702_pc02_header_set.this.AV15W_A_LOGIN_SDT = aP0;
      b702_pc02_header_set.this.AV12P_EXEC_KBN = aP1;
      b702_pc02_header_set.this.AV13P_STUDY_ID = aP2;
      b702_pc02_header_set.this.AV14P_SUBJECT_ID = aP3;
      b702_pc02_header_set.this.AV11P_CRF_ID = aP4;
      b702_pc02_header_set.this.AV10P_AUTH_CD = aP5;
      b702_pc02_header_set.this.aP13 = new String[] {""};
      initialize();
      privateExecute();
      return aP13[0];
   }

   public void execute( SdtA_LOGIN_SDT aP0 ,
                        String aP1 ,
                        long aP2 ,
                        int aP3 ,
                        short aP4 ,
                        String aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 ,
                        String[] aP10 ,
                        short[] aP11 ,
                        String[] aP12 ,
                        String[] aP13 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
   }

   private void execute_int( SdtA_LOGIN_SDT aP0 ,
                             String aP1 ,
                             long aP2 ,
                             int aP3 ,
                             short aP4 ,
                             String aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 ,
                             short[] aP11 ,
                             String[] aP12 ,
                             String[] aP13 )
   {
      b702_pc02_header_set.this.AV15W_A_LOGIN_SDT = aP0;
      b702_pc02_header_set.this.AV12P_EXEC_KBN = aP1;
      b702_pc02_header_set.this.AV13P_STUDY_ID = aP2;
      b702_pc02_header_set.this.AV14P_SUBJECT_ID = aP3;
      b702_pc02_header_set.this.AV11P_CRF_ID = aP4;
      b702_pc02_header_set.this.AV10P_AUTH_CD = aP5;
      b702_pc02_header_set.this.aP6 = aP6;
      b702_pc02_header_set.this.aP7 = aP7;
      b702_pc02_header_set.this.aP8 = aP8;
      b702_pc02_header_set.this.aP9 = aP9;
      b702_pc02_header_set.this.aP10 = aP10;
      b702_pc02_header_set.this.aP11 = aP11;
      b702_pc02_header_set.this.aP12 = aP12;
      b702_pc02_header_set.this.aP13 = aP13;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Execute user subroutine: S16263 */
      S16263 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV21W_ERR_FLG = "0" ;
      AV22W_ERR_MSG = "" ;
      /* Execute user subroutine: S1156 */
      S1156 ();
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
            /* Execute user subroutine: S1283 */
            S1283 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( GXutil.strcmp(AV21W_ERR_FLG, "0") == 0 )
            {
               /* Execute user subroutine: S13126 */
               S13126 ();
               if ( returnInSub )
               {
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               /* Execute user subroutine: S15197 */
               S15197 ();
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

   public void S1156( )
   {
      /* 'SUB_TBM31_CRF' Routine */
      AV37GXLvl59 = (byte)(0) ;
      /* Using cursor P005L2 */
      pr_default.execute(0, new Object[] {new Long(AV13P_STUDY_ID), new Short(AV11P_CRF_ID)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A223TBM31_DEL_FLG = P005L2_A223TBM31_DEL_FLG[0] ;
         n223TBM31_DEL_FLG = P005L2_n223TBM31_DEL_FLG[0] ;
         A218TBM31_CRF_ID = P005L2_A218TBM31_CRF_ID[0] ;
         A217TBM31_STUDY_ID = P005L2_A217TBM31_STUDY_ID[0] ;
         A187TBM21_STUDY_NM = P005L2_A187TBM21_STUDY_NM[0] ;
         n187TBM21_STUDY_NM = P005L2_n187TBM21_STUDY_NM[0] ;
         A550TBM31_CRF_SNM = P005L2_A550TBM31_CRF_SNM[0] ;
         n550TBM31_CRF_SNM = P005L2_n550TBM31_CRF_SNM[0] ;
         A551TBM31_STATUS = P005L2_A551TBM31_STATUS[0] ;
         n551TBM31_STATUS = P005L2_n551TBM31_STATUS[0] ;
         A513TBM21_STATUS = P005L2_A513TBM21_STATUS[0] ;
         n513TBM21_STATUS = P005L2_n513TBM21_STATUS[0] ;
         A220TBM31_GRID_SIZE = P005L2_A220TBM31_GRID_SIZE[0] ;
         n220TBM31_GRID_SIZE = P005L2_n220TBM31_GRID_SIZE[0] ;
         A187TBM21_STUDY_NM = P005L2_A187TBM21_STUDY_NM[0] ;
         n187TBM21_STUDY_NM = P005L2_n187TBM21_STUDY_NM[0] ;
         A513TBM21_STATUS = P005L2_A513TBM21_STATUS[0] ;
         n513TBM21_STATUS = P005L2_n513TBM21_STATUS[0] ;
         AV37GXLvl59 = (byte)(1) ;
         AV28W_STUDY_NM = A187TBM21_STUDY_NM ;
         AV16W_CRF_SNM = A550TBM31_CRF_SNM ;
         AV32W_TBM31_STATUS = A551TBM31_STATUS ;
         AV30W_TBM21_STATUS = A513TBM21_STATUS ;
         AV31W_TBM31_GRID_SIZE = A220TBM31_GRID_SIZE ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV37GXLvl59 == 0 )
      {
         AV21W_ERR_FLG = "1" ;
         GXt_char1 = AV22W_ERR_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char2) ;
         b702_pc02_header_set.this.GXt_char1 = GXv_char2[0] ;
         AV22W_ERR_MSG = GXt_char1 ;
      }
   }

   public void S1283( )
   {
      /* 'SUB_TBT02_CRF' Routine */
      AV38GXLvl86 = (byte)(0) ;
      /* Using cursor P005L3 */
      pr_default.execute(1, new Object[] {new Long(AV13P_STUDY_ID), new Integer(AV14P_SUBJECT_ID), new Short(AV11P_CRF_ID)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A295TBT02_DEL_FLG = P005L3_A295TBT02_DEL_FLG[0] ;
         n295TBT02_DEL_FLG = P005L3_n295TBT02_DEL_FLG[0] ;
         A294TBT02_CRF_ID = P005L3_A294TBT02_CRF_ID[0] ;
         A293TBT02_SUBJECT_ID = P005L3_A293TBT02_SUBJECT_ID[0] ;
         A292TBT02_STUDY_ID = P005L3_A292TBT02_STUDY_ID[0] ;
         A569TBT02_INPUT_END_FLG = P005L3_A569TBT02_INPUT_END_FLG[0] ;
         n569TBT02_INPUT_END_FLG = P005L3_n569TBT02_INPUT_END_FLG[0] ;
         A563TBT02_DM_ARRIVAL_FLG = P005L3_A563TBT02_DM_ARRIVAL_FLG[0] ;
         n563TBT02_DM_ARRIVAL_FLG = P005L3_n563TBT02_DM_ARRIVAL_FLG[0] ;
         A564TBT02_DM_ARRIVAL_DATETIME = P005L3_A564TBT02_DM_ARRIVAL_DATETIME[0] ;
         n564TBT02_DM_ARRIVAL_DATETIME = P005L3_n564TBT02_DM_ARRIVAL_DATETIME[0] ;
         AV38GXLvl86 = (byte)(1) ;
         AV33W_TBT02_INPUT_END_FLG = A569TBT02_INPUT_END_FLG ;
         if ( GXutil.strcmp(A563TBT02_DM_ARRIVAL_FLG, "1") == 0 )
         {
            AV18W_DM_ARRIVAL_JYOTAI = "2" ;
         }
         else
         {
            if ( GXutil.nullDate().equals(A564TBT02_DM_ARRIVAL_DATETIME) )
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
      pr_default.close(1);
      if ( AV38GXLvl86 == 0 )
      {
         AV21W_ERR_FLG = "1" ;
         GXt_char1 = AV22W_ERR_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char2) ;
         b702_pc02_header_set.this.GXt_char1 = GXv_char2[0] ;
         AV22W_ERR_MSG = GXt_char1 ;
      }
   }

   public void S13126( )
   {
      /* 'SUB_KNGN_INFO' Routine */
      AV23W_FLG_CRF_INP = "0" ;
      AV25W_FLG_MEMO_INP = "0" ;
      AV24W_FLG_DM_ARRI = "0" ;
      /* Using cursor P005L4 */
      pr_default.execute(2, new Object[] {AV10P_AUTH_CD});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A849TBM08_AUTH_CD = P005L4_A849TBM08_AUTH_CD[0] ;
         A850TBM08_DM_MICHAKU_CRF_FLG = P005L4_A850TBM08_DM_MICHAKU_CRF_FLG[0] ;
         n850TBM08_DM_MICHAKU_CRF_FLG = P005L4_n850TBM08_DM_MICHAKU_CRF_FLG[0] ;
         A851TBM08_DM_MICHAKU_MEMO_FLG = P005L4_A851TBM08_DM_MICHAKU_MEMO_FLG[0] ;
         n851TBM08_DM_MICHAKU_MEMO_FLG = P005L4_n851TBM08_DM_MICHAKU_MEMO_FLG[0] ;
         A852TBM08_DM_MICHAKU_DM_FLG = P005L4_A852TBM08_DM_MICHAKU_DM_FLG[0] ;
         n852TBM08_DM_MICHAKU_DM_FLG = P005L4_n852TBM08_DM_MICHAKU_DM_FLG[0] ;
         A853TBM08_DM_ARRI_CRF_FLG = P005L4_A853TBM08_DM_ARRI_CRF_FLG[0] ;
         n853TBM08_DM_ARRI_CRF_FLG = P005L4_n853TBM08_DM_ARRI_CRF_FLG[0] ;
         A854TBM08_DM_ARRI_MEMO_FLG = P005L4_A854TBM08_DM_ARRI_MEMO_FLG[0] ;
         n854TBM08_DM_ARRI_MEMO_FLG = P005L4_n854TBM08_DM_ARRI_MEMO_FLG[0] ;
         A855TBM08_DM_ARRI_DM_FLG = P005L4_A855TBM08_DM_ARRI_DM_FLG[0] ;
         n855TBM08_DM_ARRI_DM_FLG = P005L4_n855TBM08_DM_ARRI_DM_FLG[0] ;
         A856TBM08_DM_KAIJO_CRF_FLG = P005L4_A856TBM08_DM_KAIJO_CRF_FLG[0] ;
         n856TBM08_DM_KAIJO_CRF_FLG = P005L4_n856TBM08_DM_KAIJO_CRF_FLG[0] ;
         A857TBM08_DM_KAIJO_MEMO_FLG = P005L4_A857TBM08_DM_KAIJO_MEMO_FLG[0] ;
         n857TBM08_DM_KAIJO_MEMO_FLG = P005L4_n857TBM08_DM_KAIJO_MEMO_FLG[0] ;
         A858TBM08_DM_KAIJO_DM_FLG = P005L4_A858TBM08_DM_KAIJO_DM_FLG[0] ;
         n858TBM08_DM_KAIJO_DM_FLG = P005L4_n858TBM08_DM_KAIJO_DM_FLG[0] ;
         if ( GXutil.strcmp(AV18W_DM_ARRIVAL_JYOTAI, "1") == 0 )
         {
            AV23W_FLG_CRF_INP = A850TBM08_DM_MICHAKU_CRF_FLG ;
            AV25W_FLG_MEMO_INP = A851TBM08_DM_MICHAKU_MEMO_FLG ;
            AV24W_FLG_DM_ARRI = A852TBM08_DM_MICHAKU_DM_FLG ;
         }
         else if ( GXutil.strcmp(AV18W_DM_ARRIVAL_JYOTAI, "2") == 0 )
         {
            AV23W_FLG_CRF_INP = A853TBM08_DM_ARRI_CRF_FLG ;
            AV25W_FLG_MEMO_INP = A854TBM08_DM_ARRI_MEMO_FLG ;
            AV24W_FLG_DM_ARRI = A855TBM08_DM_ARRI_DM_FLG ;
         }
         else if ( GXutil.strcmp(AV18W_DM_ARRIVAL_JYOTAI, "3") == 0 )
         {
            AV23W_FLG_CRF_INP = A856TBM08_DM_KAIJO_CRF_FLG ;
            AV25W_FLG_MEMO_INP = A857TBM08_DM_KAIJO_MEMO_FLG ;
            AV24W_FLG_DM_ARRI = A858TBM08_DM_KAIJO_DM_FLG ;
         }
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      /* Using cursor P005L5 */
      pr_default.execute(3);
      while ( (pr_default.getStatus(3) != 101) )
      {
         A161TBM01_SYS_ID = P005L5_A161TBM01_SYS_ID[0] ;
         A514TBM01_SYS_VALUE = P005L5_A514TBM01_SYS_VALUE[0] ;
         n514TBM01_SYS_VALUE = P005L5_n514TBM01_SYS_VALUE[0] ;
         if ( GXutil.strcmp(A514TBM01_SYS_VALUE, AV10P_AUTH_CD) == 0 )
         {
            /* Execute user subroutine: S145 */
            S145 ();
            if ( returnInSub )
            {
               pr_default.close(3);
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
      pr_default.close(3);
   }

   public void S145( )
   {
      /* 'SUB_GET_SITE_ID' Routine */
      AV41GXLvl182 = (byte)(0) ;
      /* Using cursor P005L6 */
      pr_default.execute(4, new Object[] {new Long(AV13P_STUDY_ID), new Integer(AV14P_SUBJECT_ID)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A283TBT01_SUBJECT_ID = P005L6_A283TBT01_SUBJECT_ID[0] ;
         A282TBT01_STUDY_ID = P005L6_A282TBT01_STUDY_ID[0] ;
         A613TBT01_SITE_ID = P005L6_A613TBT01_SITE_ID[0] ;
         n613TBT01_SITE_ID = P005L6_n613TBT01_SITE_ID[0] ;
         AV41GXLvl182 = (byte)(1) ;
         AV34W_TBT01_SITE_ID = A613TBT01_SITE_ID ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
      if ( AV41GXLvl182 == 0 )
      {
         AV34W_TBT01_SITE_ID = "" ;
      }
   }

   public void S15197( )
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

   public void S16263( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_char2[0] = AV8C_DM_AUTH_CD ;
      GXv_int3[0] = (byte)(AV9C_DM_INPUT_LEVEL) ;
      new b799_pc06_dm_info_get(remoteHandle, context).execute( GXv_char2, GXv_int3) ;
      b702_pc02_header_set.this.AV8C_DM_AUTH_CD = GXv_char2[0] ;
      b702_pc02_header_set.this.AV9C_DM_INPUT_LEVEL = GXv_int3[0] ;
   }

   public void S17276( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV42Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("b790_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      returnInSub = true;
      if (true) return;
   }

   protected void cleanup( )
   {
      this.aP6[0] = b702_pc02_header_set.this.AV27W_MODE_KBN;
      this.aP7[0] = b702_pc02_header_set.this.AV26W_MEMO_INP_FLG;
      this.aP8[0] = b702_pc02_header_set.this.AV17W_DM_ARRI_INP_FLG;
      this.aP9[0] = b702_pc02_header_set.this.AV28W_STUDY_NM;
      this.aP10[0] = b702_pc02_header_set.this.AV16W_CRF_SNM;
      this.aP11[0] = b702_pc02_header_set.this.AV31W_TBM31_GRID_SIZE;
      this.aP12[0] = b702_pc02_header_set.this.AV21W_ERR_FLG;
      this.aP13[0] = b702_pc02_header_set.this.AV22W_ERR_MSG;
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
                  /* Execute user subroutine: S17276 */
                  S17276 ();
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
      scmdbuf = "" ;
      P005L2_A223TBM31_DEL_FLG = new String[] {""} ;
      P005L2_n223TBM31_DEL_FLG = new boolean[] {false} ;
      P005L2_A218TBM31_CRF_ID = new short[1] ;
      P005L2_A217TBM31_STUDY_ID = new long[1] ;
      P005L2_A187TBM21_STUDY_NM = new String[] {""} ;
      P005L2_n187TBM21_STUDY_NM = new boolean[] {false} ;
      P005L2_A550TBM31_CRF_SNM = new String[] {""} ;
      P005L2_n550TBM31_CRF_SNM = new boolean[] {false} ;
      P005L2_A551TBM31_STATUS = new String[] {""} ;
      P005L2_n551TBM31_STATUS = new boolean[] {false} ;
      P005L2_A513TBM21_STATUS = new String[] {""} ;
      P005L2_n513TBM21_STATUS = new boolean[] {false} ;
      P005L2_A220TBM31_GRID_SIZE = new short[1] ;
      P005L2_n220TBM31_GRID_SIZE = new boolean[] {false} ;
      A223TBM31_DEL_FLG = "" ;
      A187TBM21_STUDY_NM = "" ;
      A550TBM31_CRF_SNM = "" ;
      A551TBM31_STATUS = "" ;
      A513TBM21_STATUS = "" ;
      AV32W_TBM31_STATUS = "" ;
      AV30W_TBM21_STATUS = "" ;
      P005L3_A295TBT02_DEL_FLG = new String[] {""} ;
      P005L3_n295TBT02_DEL_FLG = new boolean[] {false} ;
      P005L3_A294TBT02_CRF_ID = new short[1] ;
      P005L3_A293TBT02_SUBJECT_ID = new int[1] ;
      P005L3_A292TBT02_STUDY_ID = new long[1] ;
      P005L3_A569TBT02_INPUT_END_FLG = new String[] {""} ;
      P005L3_n569TBT02_INPUT_END_FLG = new boolean[] {false} ;
      P005L3_A563TBT02_DM_ARRIVAL_FLG = new String[] {""} ;
      P005L3_n563TBT02_DM_ARRIVAL_FLG = new boolean[] {false} ;
      P005L3_A564TBT02_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P005L3_n564TBT02_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      A295TBT02_DEL_FLG = "" ;
      A569TBT02_INPUT_END_FLG = "" ;
      A563TBT02_DM_ARRIVAL_FLG = "" ;
      A564TBT02_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      AV33W_TBT02_INPUT_END_FLG = "" ;
      AV18W_DM_ARRIVAL_JYOTAI = "" ;
      AV23W_FLG_CRF_INP = "" ;
      AV25W_FLG_MEMO_INP = "" ;
      AV24W_FLG_DM_ARRI = "" ;
      P005L4_A849TBM08_AUTH_CD = new String[] {""} ;
      P005L4_A850TBM08_DM_MICHAKU_CRF_FLG = new String[] {""} ;
      P005L4_n850TBM08_DM_MICHAKU_CRF_FLG = new boolean[] {false} ;
      P005L4_A851TBM08_DM_MICHAKU_MEMO_FLG = new String[] {""} ;
      P005L4_n851TBM08_DM_MICHAKU_MEMO_FLG = new boolean[] {false} ;
      P005L4_A852TBM08_DM_MICHAKU_DM_FLG = new String[] {""} ;
      P005L4_n852TBM08_DM_MICHAKU_DM_FLG = new boolean[] {false} ;
      P005L4_A853TBM08_DM_ARRI_CRF_FLG = new String[] {""} ;
      P005L4_n853TBM08_DM_ARRI_CRF_FLG = new boolean[] {false} ;
      P005L4_A854TBM08_DM_ARRI_MEMO_FLG = new String[] {""} ;
      P005L4_n854TBM08_DM_ARRI_MEMO_FLG = new boolean[] {false} ;
      P005L4_A855TBM08_DM_ARRI_DM_FLG = new String[] {""} ;
      P005L4_n855TBM08_DM_ARRI_DM_FLG = new boolean[] {false} ;
      P005L4_A856TBM08_DM_KAIJO_CRF_FLG = new String[] {""} ;
      P005L4_n856TBM08_DM_KAIJO_CRF_FLG = new boolean[] {false} ;
      P005L4_A857TBM08_DM_KAIJO_MEMO_FLG = new String[] {""} ;
      P005L4_n857TBM08_DM_KAIJO_MEMO_FLG = new boolean[] {false} ;
      P005L4_A858TBM08_DM_KAIJO_DM_FLG = new String[] {""} ;
      P005L4_n858TBM08_DM_KAIJO_DM_FLG = new boolean[] {false} ;
      A849TBM08_AUTH_CD = "" ;
      A850TBM08_DM_MICHAKU_CRF_FLG = "" ;
      A851TBM08_DM_MICHAKU_MEMO_FLG = "" ;
      A852TBM08_DM_MICHAKU_DM_FLG = "" ;
      A853TBM08_DM_ARRI_CRF_FLG = "" ;
      A854TBM08_DM_ARRI_MEMO_FLG = "" ;
      A855TBM08_DM_ARRI_DM_FLG = "" ;
      A856TBM08_DM_KAIJO_CRF_FLG = "" ;
      A857TBM08_DM_KAIJO_MEMO_FLG = "" ;
      A858TBM08_DM_KAIJO_DM_FLG = "" ;
      P005L5_A161TBM01_SYS_ID = new String[] {""} ;
      P005L5_A514TBM01_SYS_VALUE = new String[] {""} ;
      P005L5_n514TBM01_SYS_VALUE = new boolean[] {false} ;
      A161TBM01_SYS_ID = "" ;
      A514TBM01_SYS_VALUE = "" ;
      AV34W_TBT01_SITE_ID = "" ;
      P005L6_A283TBT01_SUBJECT_ID = new int[1] ;
      P005L6_A282TBT01_STUDY_ID = new long[1] ;
      P005L6_A613TBT01_SITE_ID = new String[] {""} ;
      P005L6_n613TBT01_SITE_ID = new boolean[] {false} ;
      A613TBT01_SITE_ID = "" ;
      AV8C_DM_AUTH_CD = "" ;
      GXv_char2 = new String [1] ;
      GXv_int3 = new byte [1] ;
      AV42Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      GXt_char1 = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b702_pc02_header_set__default(),
         new Object[] {
             new Object[] {
            P005L2_A223TBM31_DEL_FLG, P005L2_n223TBM31_DEL_FLG, P005L2_A218TBM31_CRF_ID, P005L2_A217TBM31_STUDY_ID, P005L2_A187TBM21_STUDY_NM, P005L2_n187TBM21_STUDY_NM, P005L2_A550TBM31_CRF_SNM, P005L2_n550TBM31_CRF_SNM, P005L2_A551TBM31_STATUS, P005L2_n551TBM31_STATUS,
            P005L2_A513TBM21_STATUS, P005L2_n513TBM21_STATUS, P005L2_A220TBM31_GRID_SIZE, P005L2_n220TBM31_GRID_SIZE
            }
            , new Object[] {
            P005L3_A295TBT02_DEL_FLG, P005L3_n295TBT02_DEL_FLG, P005L3_A294TBT02_CRF_ID, P005L3_A293TBT02_SUBJECT_ID, P005L3_A292TBT02_STUDY_ID, P005L3_A569TBT02_INPUT_END_FLG, P005L3_n569TBT02_INPUT_END_FLG, P005L3_A563TBT02_DM_ARRIVAL_FLG, P005L3_n563TBT02_DM_ARRIVAL_FLG, P005L3_A564TBT02_DM_ARRIVAL_DATETIME,
            P005L3_n564TBT02_DM_ARRIVAL_DATETIME
            }
            , new Object[] {
            P005L4_A849TBM08_AUTH_CD, P005L4_A850TBM08_DM_MICHAKU_CRF_FLG, P005L4_n850TBM08_DM_MICHAKU_CRF_FLG, P005L4_A851TBM08_DM_MICHAKU_MEMO_FLG, P005L4_n851TBM08_DM_MICHAKU_MEMO_FLG, P005L4_A852TBM08_DM_MICHAKU_DM_FLG, P005L4_n852TBM08_DM_MICHAKU_DM_FLG, P005L4_A853TBM08_DM_ARRI_CRF_FLG, P005L4_n853TBM08_DM_ARRI_CRF_FLG, P005L4_A854TBM08_DM_ARRI_MEMO_FLG,
            P005L4_n854TBM08_DM_ARRI_MEMO_FLG, P005L4_A855TBM08_DM_ARRI_DM_FLG, P005L4_n855TBM08_DM_ARRI_DM_FLG, P005L4_A856TBM08_DM_KAIJO_CRF_FLG, P005L4_n856TBM08_DM_KAIJO_CRF_FLG, P005L4_A857TBM08_DM_KAIJO_MEMO_FLG, P005L4_n857TBM08_DM_KAIJO_MEMO_FLG, P005L4_A858TBM08_DM_KAIJO_DM_FLG, P005L4_n858TBM08_DM_KAIJO_DM_FLG
            }
            , new Object[] {
            P005L5_A161TBM01_SYS_ID, P005L5_A514TBM01_SYS_VALUE, P005L5_n514TBM01_SYS_VALUE
            }
            , new Object[] {
            P005L6_A283TBT01_SUBJECT_ID, P005L6_A282TBT01_STUDY_ID, P005L6_A613TBT01_SITE_ID, P005L6_n613TBT01_SITE_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV42Pgmname = "B702_PC02_HEADER_SET" ;
      /* GeneXus formulas. */
      AV42Pgmname = "B702_PC02_HEADER_SET" ;
      Gx_err = (short)(0) ;
   }

   private byte AV37GXLvl59 ;
   private byte AV38GXLvl86 ;
   private byte AV41GXLvl182 ;
   private byte GXv_int3[] ;
   private short AV11P_CRF_ID ;
   private short AV31W_TBM31_GRID_SIZE ;
   private short A218TBM31_CRF_ID ;
   private short A220TBM31_GRID_SIZE ;
   private short A294TBT02_CRF_ID ;
   private short AV9C_DM_INPUT_LEVEL ;
   private short Gx_err ;
   private int AV14P_SUBJECT_ID ;
   private int A293TBT02_SUBJECT_ID ;
   private int A283TBT01_SUBJECT_ID ;
   private int GXActiveErrHndl ;
   private long AV13P_STUDY_ID ;
   private long A217TBM31_STUDY_ID ;
   private long A292TBT02_STUDY_ID ;
   private long A282TBT01_STUDY_ID ;
   private String scmdbuf ;
   private String GXv_char2[] ;
   private String AV42Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String GXt_char1 ;
   private String Gx_emsg ;
   private java.util.Date A564TBT02_DM_ARRIVAL_DATETIME ;
   private boolean returnInSub ;
   private boolean n223TBM31_DEL_FLG ;
   private boolean n187TBM21_STUDY_NM ;
   private boolean n550TBM31_CRF_SNM ;
   private boolean n551TBM31_STATUS ;
   private boolean n513TBM21_STATUS ;
   private boolean n220TBM31_GRID_SIZE ;
   private boolean n295TBT02_DEL_FLG ;
   private boolean n569TBT02_INPUT_END_FLG ;
   private boolean n563TBT02_DM_ARRIVAL_FLG ;
   private boolean n564TBT02_DM_ARRIVAL_DATETIME ;
   private boolean n850TBM08_DM_MICHAKU_CRF_FLG ;
   private boolean n851TBM08_DM_MICHAKU_MEMO_FLG ;
   private boolean n852TBM08_DM_MICHAKU_DM_FLG ;
   private boolean n853TBM08_DM_ARRI_CRF_FLG ;
   private boolean n854TBM08_DM_ARRI_MEMO_FLG ;
   private boolean n855TBM08_DM_ARRI_DM_FLG ;
   private boolean n856TBM08_DM_KAIJO_CRF_FLG ;
   private boolean n857TBM08_DM_KAIJO_MEMO_FLG ;
   private boolean n858TBM08_DM_KAIJO_DM_FLG ;
   private boolean n514TBM01_SYS_VALUE ;
   private boolean n613TBT01_SITE_ID ;
   private String AV12P_EXEC_KBN ;
   private String AV10P_AUTH_CD ;
   private String AV27W_MODE_KBN ;
   private String AV26W_MEMO_INP_FLG ;
   private String AV17W_DM_ARRI_INP_FLG ;
   private String AV28W_STUDY_NM ;
   private String AV16W_CRF_SNM ;
   private String AV21W_ERR_FLG ;
   private String AV22W_ERR_MSG ;
   private String A223TBM31_DEL_FLG ;
   private String A187TBM21_STUDY_NM ;
   private String A550TBM31_CRF_SNM ;
   private String A551TBM31_STATUS ;
   private String A513TBM21_STATUS ;
   private String AV32W_TBM31_STATUS ;
   private String AV30W_TBM21_STATUS ;
   private String A295TBT02_DEL_FLG ;
   private String A569TBT02_INPUT_END_FLG ;
   private String A563TBT02_DM_ARRIVAL_FLG ;
   private String AV33W_TBT02_INPUT_END_FLG ;
   private String AV18W_DM_ARRIVAL_JYOTAI ;
   private String AV23W_FLG_CRF_INP ;
   private String AV25W_FLG_MEMO_INP ;
   private String AV24W_FLG_DM_ARRI ;
   private String A849TBM08_AUTH_CD ;
   private String A850TBM08_DM_MICHAKU_CRF_FLG ;
   private String A851TBM08_DM_MICHAKU_MEMO_FLG ;
   private String A852TBM08_DM_MICHAKU_DM_FLG ;
   private String A853TBM08_DM_ARRI_CRF_FLG ;
   private String A854TBM08_DM_ARRI_MEMO_FLG ;
   private String A855TBM08_DM_ARRI_DM_FLG ;
   private String A856TBM08_DM_KAIJO_CRF_FLG ;
   private String A857TBM08_DM_KAIJO_MEMO_FLG ;
   private String A858TBM08_DM_KAIJO_DM_FLG ;
   private String A161TBM01_SYS_ID ;
   private String A514TBM01_SYS_VALUE ;
   private String AV34W_TBT01_SITE_ID ;
   private String A613TBT01_SITE_ID ;
   private String AV8C_DM_AUTH_CD ;
   private String[] aP6 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private String[] aP9 ;
   private String[] aP10 ;
   private short[] aP11 ;
   private String[] aP12 ;
   private String[] aP13 ;
   private IDataStoreProvider pr_default ;
   private String[] P005L2_A223TBM31_DEL_FLG ;
   private boolean[] P005L2_n223TBM31_DEL_FLG ;
   private short[] P005L2_A218TBM31_CRF_ID ;
   private long[] P005L2_A217TBM31_STUDY_ID ;
   private String[] P005L2_A187TBM21_STUDY_NM ;
   private boolean[] P005L2_n187TBM21_STUDY_NM ;
   private String[] P005L2_A550TBM31_CRF_SNM ;
   private boolean[] P005L2_n550TBM31_CRF_SNM ;
   private String[] P005L2_A551TBM31_STATUS ;
   private boolean[] P005L2_n551TBM31_STATUS ;
   private String[] P005L2_A513TBM21_STATUS ;
   private boolean[] P005L2_n513TBM21_STATUS ;
   private short[] P005L2_A220TBM31_GRID_SIZE ;
   private boolean[] P005L2_n220TBM31_GRID_SIZE ;
   private String[] P005L3_A295TBT02_DEL_FLG ;
   private boolean[] P005L3_n295TBT02_DEL_FLG ;
   private short[] P005L3_A294TBT02_CRF_ID ;
   private int[] P005L3_A293TBT02_SUBJECT_ID ;
   private long[] P005L3_A292TBT02_STUDY_ID ;
   private String[] P005L3_A569TBT02_INPUT_END_FLG ;
   private boolean[] P005L3_n569TBT02_INPUT_END_FLG ;
   private String[] P005L3_A563TBT02_DM_ARRIVAL_FLG ;
   private boolean[] P005L3_n563TBT02_DM_ARRIVAL_FLG ;
   private java.util.Date[] P005L3_A564TBT02_DM_ARRIVAL_DATETIME ;
   private boolean[] P005L3_n564TBT02_DM_ARRIVAL_DATETIME ;
   private String[] P005L4_A849TBM08_AUTH_CD ;
   private String[] P005L4_A850TBM08_DM_MICHAKU_CRF_FLG ;
   private boolean[] P005L4_n850TBM08_DM_MICHAKU_CRF_FLG ;
   private String[] P005L4_A851TBM08_DM_MICHAKU_MEMO_FLG ;
   private boolean[] P005L4_n851TBM08_DM_MICHAKU_MEMO_FLG ;
   private String[] P005L4_A852TBM08_DM_MICHAKU_DM_FLG ;
   private boolean[] P005L4_n852TBM08_DM_MICHAKU_DM_FLG ;
   private String[] P005L4_A853TBM08_DM_ARRI_CRF_FLG ;
   private boolean[] P005L4_n853TBM08_DM_ARRI_CRF_FLG ;
   private String[] P005L4_A854TBM08_DM_ARRI_MEMO_FLG ;
   private boolean[] P005L4_n854TBM08_DM_ARRI_MEMO_FLG ;
   private String[] P005L4_A855TBM08_DM_ARRI_DM_FLG ;
   private boolean[] P005L4_n855TBM08_DM_ARRI_DM_FLG ;
   private String[] P005L4_A856TBM08_DM_KAIJO_CRF_FLG ;
   private boolean[] P005L4_n856TBM08_DM_KAIJO_CRF_FLG ;
   private String[] P005L4_A857TBM08_DM_KAIJO_MEMO_FLG ;
   private boolean[] P005L4_n857TBM08_DM_KAIJO_MEMO_FLG ;
   private String[] P005L4_A858TBM08_DM_KAIJO_DM_FLG ;
   private boolean[] P005L4_n858TBM08_DM_KAIJO_DM_FLG ;
   private String[] P005L5_A161TBM01_SYS_ID ;
   private String[] P005L5_A514TBM01_SYS_VALUE ;
   private boolean[] P005L5_n514TBM01_SYS_VALUE ;
   private int[] P005L6_A283TBT01_SUBJECT_ID ;
   private long[] P005L6_A282TBT01_STUDY_ID ;
   private String[] P005L6_A613TBT01_SITE_ID ;
   private boolean[] P005L6_n613TBT01_SITE_ID ;
   private SdtA_LOGIN_SDT AV15W_A_LOGIN_SDT ;
}

final  class b702_pc02_header_set__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P005L2", "SELECT T1.`TBM31_DEL_FLG`, T1.`TBM31_CRF_ID`, T1.`TBM31_STUDY_ID` AS TBM31_STUDY_ID, T2.`TBM21_STUDY_NM`, T1.`TBM31_CRF_SNM`, T1.`TBM31_STATUS`, T2.`TBM21_STATUS`, T1.`TBM31_GRID_SIZE` FROM (`TBM31_CRF` T1 INNER JOIN `TBM21_STUDY` T2 ON T2.`TBM21_STUDY_ID` = T1.`TBM31_STUDY_ID`) WHERE (T1.`TBM31_STUDY_ID` = ? and T1.`TBM31_CRF_ID` = ?) AND (T1.`TBM31_DEL_FLG` = '0') ORDER BY T1.`TBM31_STUDY_ID`, T1.`TBM31_CRF_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P005L3", "SELECT `TBT02_DEL_FLG`, `TBT02_CRF_ID`, `TBT02_SUBJECT_ID`, `TBT02_STUDY_ID`, `TBT02_INPUT_END_FLG`, `TBT02_DM_ARRIVAL_FLG`, `TBT02_DM_ARRIVAL_DATETIME` FROM `TBT02_CRF` WHERE (`TBT02_STUDY_ID` = ? and `TBT02_SUBJECT_ID` = ? and `TBT02_CRF_ID` = ?) AND (`TBT02_DEL_FLG` = '0') ORDER BY `TBT02_STUDY_ID`, `TBT02_SUBJECT_ID`, `TBT02_CRF_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P005L4", "SELECT `TBM08_AUTH_CD`, `TBM08_DM_MICHAKU_CRF_FLG`, `TBM08_DM_MICHAKU_MEMO_FLG`, `TBM08_DM_MICHAKU_DM_FLG`, `TBM08_DM_ARRI_CRF_FLG`, `TBM08_DM_ARRI_MEMO_FLG`, `TBM08_DM_ARRI_DM_FLG`, `TBM08_DM_KAIJO_CRF_FLG`, `TBM08_DM_KAIJO_MEMO_FLG`, `TBM08_DM_KAIJO_DM_FLG` FROM `TBM08_AUTH_INP_LVL` WHERE `TBM08_AUTH_CD` = ? ORDER BY `TBM08_AUTH_CD`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P005L5", "SELECT `TBM01_SYS_ID`, `TBM01_SYS_VALUE` FROM `TBM01_SYSTEM` WHERE `TBM01_SYS_ID` = '014' ORDER BY `TBM01_SYS_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P005L6", "SELECT `TBT01_SUBJECT_ID`, `TBT01_STUDY_ID`, `TBT01_SITE_ID` FROM `TBT01_SUBJECT` WHERE `TBT01_STUDY_ID` = ? and `TBT01_SUBJECT_ID` = ? ORDER BY `TBT01_STUDY_ID`, `TBT01_SUBJECT_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               break;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2) ;
               ((int[]) buf[3])[0] = rslt.getInt(3) ;
               ((long[]) buf[4])[0] = rslt.getLong(4) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               break;
            case 2 :
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
               break;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               break;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 2);
               break;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               break;
      }
   }

}

