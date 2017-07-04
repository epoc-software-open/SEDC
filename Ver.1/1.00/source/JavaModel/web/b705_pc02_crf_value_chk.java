/*
               File: B705_PC02_CRF_VALUE_CHK
        Description: CRF入力値チェック処理
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:53:10.90
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b705_pc02_crf_value_chk extends GXProcedure
{
   public b705_pc02_crf_value_chk( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b705_pc02_crf_value_chk.class ), "" );
   }

   public b705_pc02_crf_value_chk( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( long aP0 ,
                             int aP1 ,
                             short aP2 ,
                             String aP3 ,
                             SdtB792_SD01_CRF aP4 ,
                             SdtB705_SD01_ERRCHK_RES[] aP5 )
   {
      b705_pc02_crf_value_chk.this.AV13P_STUDY_ID = aP0;
      b705_pc02_crf_value_chk.this.AV14P_SUBJECT_ID = aP1;
      b705_pc02_crf_value_chk.this.AV12P_CRF_ID = aP2;
      b705_pc02_crf_value_chk.this.AV11P_AUTH_CD = aP3;
      b705_pc02_crf_value_chk.this.AV22SD_B792_SD01_CRF = aP4;
      b705_pc02_crf_value_chk.this.aP6 = new String[] {""};
      initialize();
      privateExecute();
      return aP6[0];
   }

   public void execute( long aP0 ,
                        int aP1 ,
                        short aP2 ,
                        String aP3 ,
                        SdtB792_SD01_CRF aP4 ,
                        SdtB705_SD01_ERRCHK_RES[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( long aP0 ,
                             int aP1 ,
                             short aP2 ,
                             String aP3 ,
                             SdtB792_SD01_CRF aP4 ,
                             SdtB705_SD01_ERRCHK_RES[] aP5 ,
                             String[] aP6 )
   {
      b705_pc02_crf_value_chk.this.AV13P_STUDY_ID = aP0;
      b705_pc02_crf_value_chk.this.AV14P_SUBJECT_ID = aP1;
      b705_pc02_crf_value_chk.this.AV12P_CRF_ID = aP2;
      b705_pc02_crf_value_chk.this.AV11P_AUTH_CD = aP3;
      b705_pc02_crf_value_chk.this.AV22SD_B792_SD01_CRF = aP4;
      b705_pc02_crf_value_chk.this.aP5 = aP5;
      b705_pc02_crf_value_chk.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Execute user subroutine: S19772 */
      S19772 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      GXv_char1[0] = AV8C_DM_AUTH_CD ;
      GXv_int2[0] = (byte)(AV9C_DM_INPUT_LEVEL) ;
      new b799_pc06_dm_info_get(remoteHandle, context).execute( GXv_char1, GXv_int2) ;
      b705_pc02_crf_value_chk.this.AV8C_DM_AUTH_CD = GXv_char1[0] ;
      b705_pc02_crf_value_chk.this.AV9C_DM_INPUT_LEVEL = GXv_int2[0] ;
      /* Using cursor P005W2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A161TBM01_SYS_ID = P005W2_A161TBM01_SYS_ID[0] ;
         A514TBM01_SYS_VALUE = P005W2_A514TBM01_SYS_VALUE[0] ;
         n514TBM01_SYS_VALUE = P005W2_n514TBM01_SYS_VALUE[0] ;
         AV10C_HOJOSYA_AUTH_CD = A514TBM01_SYS_VALUE ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P005W3 */
      pr_default.execute(1, new Object[] {AV11P_AUTH_CD});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A17TAM04_AUTH_CD = P005W3_A17TAM04_AUTH_CD[0] ;
         A601TAM04_AUTH_LVL = P005W3_A601TAM04_AUTH_LVL[0] ;
         n601TAM04_AUTH_LVL = P005W3_n601TAM04_AUTH_LVL[0] ;
         AV53W_TAM04_AUTH_LVL = A601TAM04_AUTH_LVL ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      AV48W_RTN_CD = "0" ;
      AV15SD_B705_SD01_ERRCHK_RES.getgxTv_SdtB705_SD01_ERRCHK_RES_Err_items().clear();
      AV32W_ERR_FLG = "0" ;
      AV36W_ERR_MSG = "" ;
      AV17SD_B705_SD03_CHK_COND.clear();
      /* Execute user subroutine: S1183 */
      S1183 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV64GXV1 = 1 ;
      while ( AV64GXV1 <= AV17SD_B705_SD03_CHK_COND.size() )
      {
         AV18SD_B705_SD03_CHK_COND_I = (SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem)((SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem)AV17SD_B705_SD03_CHK_COND.elementAt(-1+AV64GXV1));
         if ( GXutil.strcmp(AV18SD_B705_SD03_CHK_COND_I.getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Enabled_flg(), "1") == 0 )
         {
            if ( (GXutil.strcmp("", AV18SD_B705_SD03_CHK_COND_I.getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Expression())==0) )
            {
               if ( ( GXutil.strcmp(AV18SD_B705_SD03_CHK_COND_I.getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_div(), "Group") == 0 ) || ( GXutil.strcmp(AV18SD_B705_SD03_CHK_COND_I.getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_div(), "DateGroup") == 0 ) || ( GXutil.strcmp(AV18SD_B705_SD03_CHK_COND_I.getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_div(), "TimeGroup") == 0 ) || ( GXutil.strcmp(AV18SD_B705_SD03_CHK_COND_I.getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_div(), "RadioGroup") == 0 ) )
               {
                  /* Execute user subroutine: S13184 */
                  S13184 ();
                  if ( returnInSub )
                  {
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
               }
               else
               {
                  /* Execute user subroutine: S15281 */
                  S15281 ();
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
               /* Execute user subroutine: S17574 */
               S17574 ();
               if ( returnInSub )
               {
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
         }
         AV64GXV1 = (int)(AV64GXV1+1) ;
      }
      if ( GXutil.strcmp(AV32W_ERR_FLG, "0") == 0 )
      {
         AV48W_RTN_CD = "0" ;
      }
      else
      {
         AV48W_RTN_CD = "1" ;
      }
      cleanup();
   }

   public void S1183( )
   {
      /* 'SUB_GET_CRF_CHK_COND' Routine */
      /* Using cursor P005W4 */
      pr_default.execute(2, new Object[] {new Long(AV13P_STUDY_ID), new Short(AV12P_CRF_ID)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A238TBM32_DEL_FLG = P005W4_A238TBM32_DEL_FLG[0] ;
         n238TBM32_DEL_FLG = P005W4_n238TBM32_DEL_FLG[0] ;
         A235TBM32_CRF_ITEM_DIV = P005W4_A235TBM32_CRF_ITEM_DIV[0] ;
         n235TBM32_CRF_ITEM_DIV = P005W4_n235TBM32_CRF_ITEM_DIV[0] ;
         A232TBM32_CRF_ID = P005W4_A232TBM32_CRF_ID[0] ;
         A231TBM32_STUDY_ID = P005W4_A231TBM32_STUDY_ID[0] ;
         A233TBM32_CRF_ITEM_CD = P005W4_A233TBM32_CRF_ITEM_CD[0] ;
         A234TBM32_CRF_ITEM_NM = P005W4_A234TBM32_CRF_ITEM_NM[0] ;
         n234TBM32_CRF_ITEM_NM = P005W4_n234TBM32_CRF_ITEM_NM[0] ;
         A236TBM32_CRF_ITEM_GRP_CD = P005W4_A236TBM32_CRF_ITEM_GRP_CD[0] ;
         n236TBM32_CRF_ITEM_GRP_CD = P005W4_n236TBM32_CRF_ITEM_GRP_CD[0] ;
         A607TBM32_REQUIRED_INPUT_FLG = P005W4_A607TBM32_REQUIRED_INPUT_FLG[0] ;
         n607TBM32_REQUIRED_INPUT_FLG = P005W4_n607TBM32_REQUIRED_INPUT_FLG[0] ;
         A394TBM32_TEXT_MAXLENGTH = P005W4_A394TBM32_TEXT_MAXLENGTH[0] ;
         n394TBM32_TEXT_MAXLENGTH = P005W4_n394TBM32_TEXT_MAXLENGTH[0] ;
         A395TBM32_DECIMAL_DIGITS = P005W4_A395TBM32_DECIMAL_DIGITS[0] ;
         n395TBM32_DECIMAL_DIGITS = P005W4_n395TBM32_DECIMAL_DIGITS[0] ;
         A608TBM32_MIN_VALUE = P005W4_A608TBM32_MIN_VALUE[0] ;
         n608TBM32_MIN_VALUE = P005W4_n608TBM32_MIN_VALUE[0] ;
         A609TBM32_MAX_VALUE = P005W4_A609TBM32_MAX_VALUE[0] ;
         n609TBM32_MAX_VALUE = P005W4_n609TBM32_MAX_VALUE[0] ;
         AV18SD_B705_SD03_CHK_COND_I = (SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem)new SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem(remoteHandle, context);
         AV18SD_B705_SD03_CHK_COND_I.setgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_cd( A233TBM32_CRF_ITEM_CD );
         AV18SD_B705_SD03_CHK_COND_I.setgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_nm( A234TBM32_CRF_ITEM_NM );
         AV18SD_B705_SD03_CHK_COND_I.setgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_div( A235TBM32_CRF_ITEM_DIV );
         AV18SD_B705_SD03_CHK_COND_I.setgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_grp_cd( A236TBM32_CRF_ITEM_GRP_CD );
         AV18SD_B705_SD03_CHK_COND_I.setgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Enabled_flg( "1" );
         AV18SD_B705_SD03_CHK_COND_I.setgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Required_input_flg( A607TBM32_REQUIRED_INPUT_FLG );
         AV18SD_B705_SD03_CHK_COND_I.setgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Text_maxlength( A394TBM32_TEXT_MAXLENGTH );
         AV18SD_B705_SD03_CHK_COND_I.setgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Decimal_digits( A395TBM32_DECIMAL_DIGITS );
         AV18SD_B705_SD03_CHK_COND_I.setgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Min_value( A608TBM32_MIN_VALUE );
         AV18SD_B705_SD03_CHK_COND_I.setgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Max_value( A609TBM32_MAX_VALUE );
         AV18SD_B705_SD03_CHK_COND_I.setgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Prior_no( (byte)(0) );
         AV17SD_B705_SD03_CHK_COND.add(AV18SD_B705_SD03_CHK_COND_I, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      /* Using cursor P005W5 */
      pr_default.execute(3, new Object[] {new Long(AV13P_STUDY_ID), new Short(AV12P_CRF_ID)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A246TBM33_STUDY_ID = P005W5_A246TBM33_STUDY_ID[0] ;
         A247TBM33_CRF_ID = P005W5_A247TBM33_CRF_ID[0] ;
         A251TBM33_DEL_FLG = P005W5_A251TBM33_DEL_FLG[0] ;
         n251TBM33_DEL_FLG = P005W5_n251TBM33_DEL_FLG[0] ;
         A380TBM33_COND_DIV = P005W5_A380TBM33_COND_DIV[0] ;
         n380TBM33_COND_DIV = P005W5_n380TBM33_COND_DIV[0] ;
         A381TBM33_CRF_ITEM_CD = P005W5_A381TBM33_CRF_ITEM_CD[0] ;
         n381TBM33_CRF_ITEM_CD = P005W5_n381TBM33_CRF_ITEM_CD[0] ;
         A554TBM33_ENABLED_FLG = P005W5_A554TBM33_ENABLED_FLG[0] ;
         n554TBM33_ENABLED_FLG = P005W5_n554TBM33_ENABLED_FLG[0] ;
         A382TBM33_ERR_DIV = P005W5_A382TBM33_ERR_DIV[0] ;
         n382TBM33_ERR_DIV = P005W5_n382TBM33_ERR_DIV[0] ;
         A383TBM33_ERR_MSG = P005W5_A383TBM33_ERR_MSG[0] ;
         n383TBM33_ERR_MSG = P005W5_n383TBM33_ERR_MSG[0] ;
         A249TBM33_EXPRESSION = P005W5_A249TBM33_EXPRESSION[0] ;
         n249TBM33_EXPRESSION = P005W5_n249TBM33_EXPRESSION[0] ;
         A611TBM33_NUMERIC_RANGE_FLG = P005W5_A611TBM33_NUMERIC_RANGE_FLG[0] ;
         n611TBM33_NUMERIC_RANGE_FLG = P005W5_n611TBM33_NUMERIC_RANGE_FLG[0] ;
         A610TBM33_REQUIRED_INPUT_FLG = P005W5_A610TBM33_REQUIRED_INPUT_FLG[0] ;
         n610TBM33_REQUIRED_INPUT_FLG = P005W5_n610TBM33_REQUIRED_INPUT_FLG[0] ;
         A250TBM33_PRIOR_NO = P005W5_A250TBM33_PRIOR_NO[0] ;
         n250TBM33_PRIOR_NO = P005W5_n250TBM33_PRIOR_NO[0] ;
         A248TBM33_COND_NO = P005W5_A248TBM33_COND_NO[0] ;
         AV39W_FLG = "0" ;
         if ( ! (GXutil.strcmp("", A381TBM33_CRF_ITEM_CD)==0) )
         {
            AV67GXV2 = 1 ;
            while ( AV67GXV2 <= AV17SD_B705_SD03_CHK_COND.size() )
            {
               AV18SD_B705_SD03_CHK_COND_I = (SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem)((SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem)AV17SD_B705_SD03_CHK_COND.elementAt(-1+AV67GXV2));
               if ( GXutil.strcmp(AV18SD_B705_SD03_CHK_COND_I.getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_cd(), A381TBM33_CRF_ITEM_CD) == 0 )
               {
                  AV18SD_B705_SD03_CHK_COND_I.setgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Cond_div( A380TBM33_COND_DIV );
                  AV18SD_B705_SD03_CHK_COND_I.setgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Enabled_flg( A554TBM33_ENABLED_FLG );
                  AV18SD_B705_SD03_CHK_COND_I.setgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Err_div( A382TBM33_ERR_DIV );
                  AV18SD_B705_SD03_CHK_COND_I.setgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Err_msg( A383TBM33_ERR_MSG );
                  AV18SD_B705_SD03_CHK_COND_I.setgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Expression( A249TBM33_EXPRESSION );
                  AV18SD_B705_SD03_CHK_COND_I.setgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Numeric_range_flg( A611TBM33_NUMERIC_RANGE_FLG );
                  AV18SD_B705_SD03_CHK_COND_I.setgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Prior_no( A250TBM33_PRIOR_NO );
                  AV39W_FLG = "1" ;
                  if (true) break;
               }
               AV67GXV2 = (int)(AV67GXV2+1) ;
            }
         }
         if ( GXutil.strcmp(AV39W_FLG, "0") == 0 )
         {
            AV18SD_B705_SD03_CHK_COND_I = (SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem)new SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem(remoteHandle, context);
            AV18SD_B705_SD03_CHK_COND_I.setgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_cd( A381TBM33_CRF_ITEM_CD );
            AV18SD_B705_SD03_CHK_COND_I.setgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Required_input_flg( A610TBM33_REQUIRED_INPUT_FLG );
            AV18SD_B705_SD03_CHK_COND_I.setgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Cond_div( A380TBM33_COND_DIV );
            AV18SD_B705_SD03_CHK_COND_I.setgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Enabled_flg( A554TBM33_ENABLED_FLG );
            AV18SD_B705_SD03_CHK_COND_I.setgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Err_div( A382TBM33_ERR_DIV );
            AV18SD_B705_SD03_CHK_COND_I.setgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Err_msg( A383TBM33_ERR_MSG );
            AV18SD_B705_SD03_CHK_COND_I.setgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Expression( A249TBM33_EXPRESSION );
            AV18SD_B705_SD03_CHK_COND_I.setgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Numeric_range_flg( A611TBM33_NUMERIC_RANGE_FLG );
            AV18SD_B705_SD03_CHK_COND_I.setgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Prior_no( A250TBM33_PRIOR_NO );
            AV17SD_B705_SD03_CHK_COND.add(AV18SD_B705_SD03_CHK_COND_I, 0);
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
      AV17SD_B705_SD03_CHK_COND.sort("PRIOR_NO");
   }

   public void S12164( )
   {
      /* 'SUB_CRF_VALUE_GET' Routine */
      AV57W_TBT12_CRF_VALUE = "" ;
      AV68GXV3 = 1 ;
      while ( AV68GXV3 <= AV22SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Crf_results().size() )
      {
         AV23SD_B792_SD02_CRF_RESULT_I = (SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem)((SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem)AV22SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Crf_results().elementAt(-1+AV68GXV3));
         if ( GXutil.strcmp(AV23SD_B792_SD02_CRF_RESULT_I.getgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_item_grp_cd(), AV56W_TBT12_CRF_ITEM_GRP_CD) == 0 )
         {
            AV57W_TBT12_CRF_VALUE = AV23SD_B792_SD02_CRF_RESULT_I.getgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_value() ;
            if (true) break;
         }
         AV68GXV3 = (int)(AV68GXV3+1) ;
      }
   }

   public void S13184( )
   {
      /* 'SUB_CRF_ITEM_GRP_CHK' Routine */
      AV33W_ERR_FLG_GRP = "0" ;
      AV26W_CHK_KBN = "1" ;
      AV54W_TBM32_CRF_ITEM_CD = AV18SD_B705_SD03_CHK_COND_I.getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_cd() ;
      /* Execute user subroutine: S141 */
      S141 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV25W_CHK_EXEC_FLG, "1") == 0 )
      {
         if ( GXutil.strcmp(AV18SD_B705_SD03_CHK_COND_I.getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Required_input_flg(), "1") == 0 )
         {
            AV59W_CHKBOX_CNT = (short)(0) ;
            AV58W_CHKBOX_ON_CNT = (short)(0) ;
            AV69GXV4 = 1 ;
            while ( AV69GXV4 <= AV17SD_B705_SD03_CHK_COND.size() )
            {
               AV19SD_B705_SD03_CHK_COND_I_GRP = (SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem)((SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem)AV17SD_B705_SD03_CHK_COND.elementAt(-1+AV69GXV4));
               if ( ( GXutil.strcmp(AV19SD_B705_SD03_CHK_COND_I_GRP.getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_grp_cd(), AV18SD_B705_SD03_CHK_COND_I.getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_grp_cd()) == 0 ) && ( GXutil.strcmp(AV19SD_B705_SD03_CHK_COND_I_GRP.getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_cd(), AV18SD_B705_SD03_CHK_COND_I.getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_cd()) != 0 ) )
               {
                  if ( GXutil.strcmp(AV19SD_B705_SD03_CHK_COND_I_GRP.getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_div(), "RadioBox") == 0 )
                  {
                     AV56W_TBT12_CRF_ITEM_GRP_CD = AV18SD_B705_SD03_CHK_COND_I.getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_cd() ;
                     /* Execute user subroutine: S12164 */
                     S12164 ();
                     if (returnInSub) return;
                     if ( (GXutil.strcmp("", AV57W_TBT12_CRF_VALUE)==0) )
                     {
                        AV33W_ERR_FLG_GRP = "1" ;
                     }
                     if (true) break;
                  }
                  else if ( ( GXutil.strcmp(AV19SD_B705_SD03_CHK_COND_I_GRP.getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_div(), "TextArea") == 0 ) || ( GXutil.strcmp(AV19SD_B705_SD03_CHK_COND_I_GRP.getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_div(), "NumericTextBox") == 0 ) )
                  {
                  }
                  else
                  {
                     if ( GXutil.strcmp(AV19SD_B705_SD03_CHK_COND_I_GRP.getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Required_input_flg(), "1") == 0 )
                     {
                        if (true) break;
                     }
                     else
                     {
                        AV56W_TBT12_CRF_ITEM_GRP_CD = AV19SD_B705_SD03_CHK_COND_I_GRP.getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_cd() ;
                        /* Execute user subroutine: S12164 */
                        S12164 ();
                        if (returnInSub) return;
                        if ( GXutil.strcmp(AV19SD_B705_SD03_CHK_COND_I_GRP.getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_div(), "CheckBox") == 0 )
                        {
                           AV59W_CHKBOX_CNT = (short)(AV59W_CHKBOX_CNT+1) ;
                           if ( ! (GXutil.strcmp("", AV57W_TBT12_CRF_VALUE)==0) )
                           {
                              AV58W_CHKBOX_ON_CNT = (short)(AV58W_CHKBOX_ON_CNT+1) ;
                           }
                        }
                        else
                        {
                           if ( (GXutil.strcmp("", AV57W_TBT12_CRF_VALUE)==0) )
                           {
                              AV33W_ERR_FLG_GRP = "1" ;
                              if (true) break;
                           }
                        }
                     }
                  }
               }
               AV69GXV4 = (int)(AV69GXV4+1) ;
            }
            if ( AV59W_CHKBOX_CNT > 0 )
            {
               if ( AV58W_CHKBOX_ON_CNT == 0 )
               {
                  AV33W_ERR_FLG_GRP = "1" ;
               }
            }
            if ( GXutil.strcmp(AV33W_ERR_FLG_GRP, "1") == 0 )
            {
               GXt_char3 = AV36W_ERR_MSG ;
               GXv_char1[0] = GXt_char3 ;
               new a805_pc02_msg_get(remoteHandle, context).execute( "AE00007", AV18SD_B705_SD03_CHK_COND_I.getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_nm(), "", "", "", "", GXv_char1) ;
               b705_pc02_crf_value_chk.this.GXt_char3 = GXv_char1[0] ;
               AV36W_ERR_MSG = GXt_char3 ;
               AV32W_ERR_FLG = "1" ;
               AV16SD_B705_SD02_ERRCHK_ITEM_I = (SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem)new SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem(remoteHandle, context);
               AV16SD_B705_SD02_ERRCHK_ITEM_I.setgxTv_SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem_Crf_item_grp_cd( AV18SD_B705_SD03_CHK_COND_I.getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_cd() );
               AV16SD_B705_SD02_ERRCHK_ITEM_I.setgxTv_SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem_Err_msg( AV36W_ERR_MSG );
               AV15SD_B705_SD01_ERRCHK_RES.getgxTv_SdtB705_SD01_ERRCHK_RES_Err_items().add(AV16SD_B705_SD02_ERRCHK_ITEM_I, 0);
            }
         }
      }
   }

   public void S15281( )
   {
      /* 'SUB_CRF_ITEM_CHK' Routine */
      AV34W_ERR_FLG_ITEM = "0" ;
      if ( (GXutil.strcmp("", AV18SD_B705_SD03_CHK_COND_I.getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_grp_cd())==0) )
      {
         AV26W_CHK_KBN = "1" ;
         AV54W_TBM32_CRF_ITEM_CD = AV18SD_B705_SD03_CHK_COND_I.getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_cd() ;
      }
      else
      {
         AV26W_CHK_KBN = "2" ;
         AV55W_TBM32_CRF_ITEM_GRP_CD = AV18SD_B705_SD03_CHK_COND_I.getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_grp_cd() ;
      }
      /* Execute user subroutine: S141 */
      S141 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV25W_CHK_EXEC_FLG, "1") == 0 )
      {
         AV56W_TBT12_CRF_ITEM_GRP_CD = AV18SD_B705_SD03_CHK_COND_I.getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_cd() ;
         /* Execute user subroutine: S12164 */
         S12164 ();
         if (returnInSub) return;
         if ( GXutil.strcmp(AV18SD_B705_SD03_CHK_COND_I.getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Required_input_flg(), "1") == 0 )
         {
            if ( (GXutil.strcmp("", AV57W_TBT12_CRF_VALUE)==0) )
            {
               AV34W_ERR_FLG_ITEM = "0" ;
               AV32W_ERR_FLG = "1" ;
               GXt_char3 = AV36W_ERR_MSG ;
               GXv_char1[0] = GXt_char3 ;
               new a805_pc02_msg_get(remoteHandle, context).execute( "AE00001", AV18SD_B705_SD03_CHK_COND_I.getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_nm(), "", "", "", "", GXv_char1) ;
               b705_pc02_crf_value_chk.this.GXt_char3 = GXv_char1[0] ;
               AV36W_ERR_MSG = GXt_char3 ;
               AV16SD_B705_SD02_ERRCHK_ITEM_I = (SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem)new SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem(remoteHandle, context);
               AV16SD_B705_SD02_ERRCHK_ITEM_I.setgxTv_SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem_Crf_item_grp_cd( AV18SD_B705_SD03_CHK_COND_I.getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_cd() );
               AV16SD_B705_SD02_ERRCHK_ITEM_I.setgxTv_SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem_Err_msg( AV36W_ERR_MSG );
               AV15SD_B705_SD01_ERRCHK_RES.getgxTv_SdtB705_SD01_ERRCHK_RES_Err_items().add(AV16SD_B705_SD02_ERRCHK_ITEM_I, 0);
            }
         }
         if ( GXutil.strcmp(AV34W_ERR_FLG_ITEM, "0") == 0 )
         {
            if ( GXutil.strcmp(AV18SD_B705_SD03_CHK_COND_I.getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_div(), "NumericTextBox") == 0 )
            {
               if ( ! (GXutil.strcmp("", AV57W_TBT12_CRF_VALUE)==0) )
               {
                  /* Execute user subroutine: S161 */
                  S161 ();
                  if (returnInSub) return;
               }
            }
         }
      }
   }

   public void S141( )
   {
      /* 'SUB_ITEM_CHK_EXEC_CHK' Routine */
      AV25W_CHK_EXEC_FLG = "1" ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV26W_CHK_KBN ,
                                           A233TBM32_CRF_ITEM_CD ,
                                           AV54W_TBM32_CRF_ITEM_CD ,
                                           A235TBM32_CRF_ITEM_DIV ,
                                           A236TBM32_CRF_ITEM_GRP_CD ,
                                           AV55W_TBM32_CRF_ITEM_GRP_CD ,
                                           A238TBM32_DEL_FLG ,
                                           new Long(AV13P_STUDY_ID) ,
                                           new Short(AV12P_CRF_ID) ,
                                           new Long(A231TBM32_STUDY_ID) ,
                                           new Short(A232TBM32_CRF_ID) },
                                           new int[] {
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.LONG, TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.SHORT
                                           }
      });
      /* Using cursor P005W6 */
      pr_default.execute(4, new Object[] {new Long(AV13P_STUDY_ID), new Short(AV12P_CRF_ID), AV54W_TBM32_CRF_ITEM_CD, AV55W_TBM32_CRF_ITEM_GRP_CD});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A233TBM32_CRF_ITEM_CD = P005W6_A233TBM32_CRF_ITEM_CD[0] ;
         A232TBM32_CRF_ID = P005W6_A232TBM32_CRF_ID[0] ;
         A231TBM32_STUDY_ID = P005W6_A231TBM32_STUDY_ID[0] ;
         A238TBM32_DEL_FLG = P005W6_A238TBM32_DEL_FLG[0] ;
         n238TBM32_DEL_FLG = P005W6_n238TBM32_DEL_FLG[0] ;
         A236TBM32_CRF_ITEM_GRP_CD = P005W6_A236TBM32_CRF_ITEM_GRP_CD[0] ;
         n236TBM32_CRF_ITEM_GRP_CD = P005W6_n236TBM32_CRF_ITEM_GRP_CD[0] ;
         A235TBM32_CRF_ITEM_DIV = P005W6_A235TBM32_CRF_ITEM_DIV[0] ;
         n235TBM32_CRF_ITEM_DIV = P005W6_n235TBM32_CRF_ITEM_DIV[0] ;
         A234TBM32_CRF_ITEM_NM = P005W6_A234TBM32_CRF_ITEM_NM[0] ;
         n234TBM32_CRF_ITEM_NM = P005W6_n234TBM32_CRF_ITEM_NM[0] ;
         A552TBM32_AUTH_LVL_MIN = P005W6_A552TBM32_AUTH_LVL_MIN[0] ;
         n552TBM32_AUTH_LVL_MIN = P005W6_n552TBM32_AUTH_LVL_MIN[0] ;
         if ( (GXutil.strcmp("", AV37W_ERR_MSG_ITEM_NM)==0) )
         {
            AV37W_ERR_MSG_ITEM_NM = A234TBM32_CRF_ITEM_NM ;
         }
         else
         {
            AV37W_ERR_MSG_ITEM_NM = AV37W_ERR_MSG_ITEM_NM + "," + A234TBM32_CRF_ITEM_NM ;
         }
         if ( A552TBM32_AUTH_LVL_MIN > AV53W_TAM04_AUTH_LVL )
         {
            AV25W_CHK_EXEC_FLG = "0" ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         /* Using cursor P005W7 */
         pr_default.execute(5, new Object[] {new Long(A231TBM32_STUDY_ID), new Short(A232TBM32_CRF_ID), A233TBM32_CRF_ITEM_CD});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A471TBM35_STUDY_ID = P005W7_A471TBM35_STUDY_ID[0] ;
            A472TBM35_CRF_ID = P005W7_A472TBM35_CRF_ID[0] ;
            A473TBM35_CRF_ITEM_CD = P005W7_A473TBM35_CRF_ITEM_CD[0] ;
            A476TBM35_DEL_FLG = P005W7_A476TBM35_DEL_FLG[0] ;
            n476TBM35_DEL_FLG = P005W7_n476TBM35_DEL_FLG[0] ;
            A475TBM35_DISPLAY_FLG = P005W7_A475TBM35_DISPLAY_FLG[0] ;
            n475TBM35_DISPLAY_FLG = P005W7_n475TBM35_DISPLAY_FLG[0] ;
            A474TBM35_STUDY_AUTH_CD = P005W7_A474TBM35_STUDY_AUTH_CD[0] ;
            if ( GXutil.strcmp(A475TBM35_DISPLAY_FLG, "0") == 0 )
            {
            }
            else if ( GXutil.strcmp(A475TBM35_DISPLAY_FLG, "1") == 0 )
            {
               if ( GXutil.strcmp(AV11P_AUTH_CD, AV10C_HOJOSYA_AUTH_CD) == 0 )
               {
                  AV25W_CHK_EXEC_FLG = "0" ;
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
            else if ( GXutil.strcmp(A475TBM35_DISPLAY_FLG, "2") == 0 )
            {
               if ( GXutil.strcmp(AV11P_AUTH_CD, AV8C_DM_AUTH_CD) != 0 )
               {
                  AV25W_CHK_EXEC_FLG = "0" ;
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(5);
         }
         pr_default.close(5);
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   public void S161( )
   {
      /* 'SUB_NUM_TEXT_CHK' Routine */
      AV43W_NUM_CHK_KBN = (short)(0) ;
      AV35W_ERR_FLG_NUM = "0" ;
      if ( GXutil.strcmp(AV35W_ERR_FLG_NUM, "0") == 0 )
      {
         if ( GxRegex.IsMatch(AV57W_TBT12_CRF_VALUE,"[^0-9.-]") )
         {
            AV35W_ERR_FLG_NUM = "1" ;
         }
         if ( GXutil.strcmp(AV35W_ERR_FLG_NUM, "0") == 0 )
         {
            AV47W_REPLACE = GXutil.strReplace( AV57W_TBT12_CRF_VALUE, ".", "") ;
            AV31W_DEFF_LEN = (short)(GXutil.len( AV57W_TBT12_CRF_VALUE)-GXutil.len( AV47W_REPLACE)) ;
            if ( AV31W_DEFF_LEN == 0 )
            {
            }
            else if ( AV31W_DEFF_LEN == 1 )
            {
               AV44W_POS = (short)(GXutil.strSearch( AV57W_TBT12_CRF_VALUE, ".", 1)) ;
               if ( ( AV44W_POS == 1 ) || ( AV44W_POS == GXutil.len( AV57W_TBT12_CRF_VALUE) ) )
               {
                  AV35W_ERR_FLG_NUM = "1" ;
               }
            }
            else
            {
               AV35W_ERR_FLG_NUM = "1" ;
            }
         }
         if ( GXutil.strcmp(AV35W_ERR_FLG_NUM, "0") == 0 )
         {
            AV44W_POS = (short)(GXutil.strSearch( AV57W_TBT12_CRF_VALUE, "-", 1)) ;
            if ( AV44W_POS == 0 )
            {
            }
            else if ( AV44W_POS == 1 )
            {
               if ( GXutil.len( AV57W_TBT12_CRF_VALUE) == 1 )
               {
                  AV35W_ERR_FLG_NUM = "1" ;
               }
            }
            else
            {
               AV35W_ERR_FLG_NUM = "1" ;
            }
         }
         if ( GXutil.strcmp(AV35W_ERR_FLG_NUM, "1") == 0 )
         {
            AV32W_ERR_FLG = "1" ;
            AV16SD_B705_SD02_ERRCHK_ITEM_I = (SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem)new SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem(remoteHandle, context);
            AV16SD_B705_SD02_ERRCHK_ITEM_I.setgxTv_SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem_Crf_item_grp_cd( AV18SD_B705_SD03_CHK_COND_I.getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_cd() );
            GXt_char3 = "" ;
            GXv_char1[0] = GXt_char3 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00026", AV18SD_B705_SD03_CHK_COND_I.getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_nm(), "", "", "", "", GXv_char1) ;
            b705_pc02_crf_value_chk.this.GXt_char3 = GXv_char1[0] ;
            AV16SD_B705_SD02_ERRCHK_ITEM_I.setgxTv_SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem_Err_msg( GXt_char3 );
            AV15SD_B705_SD01_ERRCHK_RES.getgxTv_SdtB705_SD01_ERRCHK_RES_Err_items().add(AV16SD_B705_SD02_ERRCHK_ITEM_I, 0);
         }
      }
      if ( GXutil.strcmp(AV35W_ERR_FLG_NUM, "0") == 0 )
      {
         AV47W_REPLACE = GXutil.strReplace( AV57W_TBT12_CRF_VALUE, "-", "") ;
         GXv_int4[0] = AV45W_POSTIVE_DIGITS ;
         GXv_int5[0] = AV30W_DECIMAL_DIGITS ;
         new b799_pc03_num_text_digits(remoteHandle, context).execute( AV47W_REPLACE, GXv_int4, GXv_int5) ;
         b705_pc02_crf_value_chk.this.AV45W_POSTIVE_DIGITS = GXv_int4[0] ;
         b705_pc02_crf_value_chk.this.AV30W_DECIMAL_DIGITS = GXv_int5[0] ;
         AV46W_POSTIVE_DIGITS_CHK = AV18SD_B705_SD03_CHK_COND_I.getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Text_maxlength() ;
         if ( AV45W_POSTIVE_DIGITS > AV46W_POSTIVE_DIGITS_CHK )
         {
            AV43W_NUM_CHK_KBN = (short)(1) ;
            AV35W_ERR_FLG_NUM = "1" ;
         }
         if ( AV18SD_B705_SD03_CHK_COND_I.getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Decimal_digits() != 0 )
         {
            if ( AV30W_DECIMAL_DIGITS > AV18SD_B705_SD03_CHK_COND_I.getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Decimal_digits() )
            {
               AV43W_NUM_CHK_KBN = (short)(2) ;
               AV35W_ERR_FLG_NUM = "1" ;
            }
         }
         if ( GXutil.strcmp(AV35W_ERR_FLG_NUM, "1") == 0 )
         {
            AV32W_ERR_FLG = "1" ;
            if ( AV43W_NUM_CHK_KBN == 1 )
            {
               AV40W_ITEM_NM = AV18SD_B705_SD03_CHK_COND_I.getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_nm() + "の整数部" ;
               GXt_char3 = AV36W_ERR_MSG ;
               GXv_char1[0] = GXt_char3 ;
               new a805_pc02_msg_get(remoteHandle, context).execute( "AE00027", AV40W_ITEM_NM, GXutil.trim( GXutil.str( AV46W_POSTIVE_DIGITS_CHK, 4, 0)), "", "", "", GXv_char1) ;
               b705_pc02_crf_value_chk.this.GXt_char3 = GXv_char1[0] ;
               AV36W_ERR_MSG = GXt_char3 ;
            }
            else if ( AV43W_NUM_CHK_KBN == 2 )
            {
               AV40W_ITEM_NM = AV18SD_B705_SD03_CHK_COND_I.getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_nm() + "の少数部" ;
               GXt_char3 = AV36W_ERR_MSG ;
               GXv_char1[0] = GXt_char3 ;
               new a805_pc02_msg_get(remoteHandle, context).execute( "AE00027", AV40W_ITEM_NM, GXutil.trim( GXutil.str( AV18SD_B705_SD03_CHK_COND_I.getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Decimal_digits(), 2, 0)), "", "", "", GXv_char1) ;
               b705_pc02_crf_value_chk.this.GXt_char3 = GXv_char1[0] ;
               AV36W_ERR_MSG = GXt_char3 ;
            }
            AV16SD_B705_SD02_ERRCHK_ITEM_I = (SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem)new SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem(remoteHandle, context);
            AV16SD_B705_SD02_ERRCHK_ITEM_I.setgxTv_SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem_Crf_item_grp_cd( AV18SD_B705_SD03_CHK_COND_I.getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_cd() );
            AV16SD_B705_SD02_ERRCHK_ITEM_I.setgxTv_SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem_Err_msg( AV36W_ERR_MSG );
            AV15SD_B705_SD01_ERRCHK_RES.getgxTv_SdtB705_SD01_ERRCHK_RES_Err_items().add(AV16SD_B705_SD02_ERRCHK_ITEM_I, 0);
         }
      }
      if ( GXutil.strcmp(AV35W_ERR_FLG_NUM, "0") == 0 )
      {
         if ( ! (GXutil.strcmp("", AV18SD_B705_SD03_CHK_COND_I.getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Min_value())==0) )
         {
            AV43W_NUM_CHK_KBN = (short)(AV43W_NUM_CHK_KBN+1) ;
            if ( GXutil.val( AV57W_TBT12_CRF_VALUE, ".") < GXutil.val( AV18SD_B705_SD03_CHK_COND_I.getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Min_value(), ".") )
            {
               AV35W_ERR_FLG_NUM = "1" ;
            }
         }
         if ( ! (GXutil.strcmp("", AV18SD_B705_SD03_CHK_COND_I.getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Max_value())==0) )
         {
            AV43W_NUM_CHK_KBN = (short)(AV43W_NUM_CHK_KBN+2) ;
            if ( GXutil.val( AV57W_TBT12_CRF_VALUE, ".") > GXutil.val( AV18SD_B705_SD03_CHK_COND_I.getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Max_value(), ".") )
            {
               AV35W_ERR_FLG_NUM = "1" ;
            }
         }
         if ( GXutil.strcmp(AV35W_ERR_FLG_NUM, "1") == 0 )
         {
            AV32W_ERR_FLG = "1" ;
            if ( AV43W_NUM_CHK_KBN == 1 )
            {
               GXt_char3 = AV36W_ERR_MSG ;
               GXv_char1[0] = GXt_char3 ;
               new a805_pc02_msg_get(remoteHandle, context).execute( "AE00083", AV18SD_B705_SD03_CHK_COND_I.getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_nm(), AV18SD_B705_SD03_CHK_COND_I.getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Min_value(), "", "", "", GXv_char1) ;
               b705_pc02_crf_value_chk.this.GXt_char3 = GXv_char1[0] ;
               AV36W_ERR_MSG = GXt_char3 ;
            }
            else if ( AV43W_NUM_CHK_KBN == 2 )
            {
               GXt_char3 = AV36W_ERR_MSG ;
               GXv_char1[0] = GXt_char3 ;
               new a805_pc02_msg_get(remoteHandle, context).execute( "AE00084", AV18SD_B705_SD03_CHK_COND_I.getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_nm(), AV18SD_B705_SD03_CHK_COND_I.getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Max_value(), "", "", "", GXv_char1) ;
               b705_pc02_crf_value_chk.this.GXt_char3 = GXv_char1[0] ;
               AV36W_ERR_MSG = GXt_char3 ;
            }
            else
            {
               GXt_char3 = AV36W_ERR_MSG ;
               GXv_char1[0] = GXt_char3 ;
               new a805_pc02_msg_get(remoteHandle, context).execute( "AE00085", AV18SD_B705_SD03_CHK_COND_I.getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_nm(), AV18SD_B705_SD03_CHK_COND_I.getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Min_value(), AV18SD_B705_SD03_CHK_COND_I.getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Max_value(), "", "", GXv_char1) ;
               b705_pc02_crf_value_chk.this.GXt_char3 = GXv_char1[0] ;
               AV36W_ERR_MSG = GXt_char3 ;
            }
            AV16SD_B705_SD02_ERRCHK_ITEM_I = (SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem)new SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem(remoteHandle, context);
            AV16SD_B705_SD02_ERRCHK_ITEM_I.setgxTv_SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem_Crf_item_grp_cd( AV18SD_B705_SD03_CHK_COND_I.getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_cd() );
            AV16SD_B705_SD02_ERRCHK_ITEM_I.setgxTv_SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem_Err_msg( AV36W_ERR_MSG );
            AV15SD_B705_SD01_ERRCHK_RES.getgxTv_SdtB705_SD01_ERRCHK_RES_Err_items().add(AV16SD_B705_SD02_ERRCHK_ITEM_I, 0);
         }
      }
   }

   public void S17574( )
   {
      /* 'SUB_EXPRESSION_CHK' Routine */
      AV27W_CHK_KEKKA = (short)(0) ;
      AV37W_ERR_MSG_ITEM_NM = "" ;
      GXv_objcol_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem6[0] = AV20SD_B705_SD04_EXPRESSION ;
      new b799_pc04_cond_get(remoteHandle, context).execute( AV18SD_B705_SD03_CHK_COND_I.getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Expression(), GXv_objcol_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem6) ;
      AV20SD_B705_SD04_EXPRESSION = GXv_objcol_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem6[0] ;
      /* Execute user subroutine: S181 */
      S181 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV25W_CHK_EXEC_FLG, "1") == 0 )
      {
         AV72GXV5 = 1 ;
         while ( AV72GXV5 <= AV20SD_B705_SD04_EXPRESSION.size() )
         {
            AV21SD_B705_SD04_EXPRESSION_I = (SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem)((SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem)AV20SD_B705_SD04_EXPRESSION.elementAt(-1+AV72GXV5));
            AV39W_FLG = "0" ;
            AV73GXV6 = 1 ;
            while ( AV73GXV6 <= AV22SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Crf_results().size() )
            {
               AV23SD_B792_SD02_CRF_RESULT_I = (SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem)((SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem)AV22SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Crf_results().elementAt(-1+AV73GXV6));
               if ( GXutil.strcmp(AV21SD_B705_SD04_EXPRESSION_I.getgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Crf_item_cd(), AV23SD_B792_SD02_CRF_RESULT_I.getgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_item_grp_cd()) == 0 )
               {
                  AV21SD_B705_SD04_EXPRESSION_I.setgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Crf_value( AV23SD_B792_SD02_CRF_RESULT_I.getgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_value() );
                  AV39W_FLG = "1" ;
                  if (true) break;
               }
               AV73GXV6 = (int)(AV73GXV6+1) ;
            }
            if ( GXutil.strcmp(AV39W_FLG, "0") == 0 )
            {
               /* Using cursor P005W8 */
               pr_default.execute(6, new Object[] {new Long(AV13P_STUDY_ID), new Short(AV12P_CRF_ID), AV21SD_B705_SD04_EXPRESSION_I.getgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Crf_item_cd()});
               while ( (pr_default.getStatus(6) != 101) )
               {
                  A747TBM32_REF_CRF_ITEM_CD = P005W8_A747TBM32_REF_CRF_ITEM_CD[0] ;
                  n747TBM32_REF_CRF_ITEM_CD = P005W8_n747TBM32_REF_CRF_ITEM_CD[0] ;
                  A746TBM32_REF_CRF_ID = P005W8_A746TBM32_REF_CRF_ID[0] ;
                  n746TBM32_REF_CRF_ID = P005W8_n746TBM32_REF_CRF_ID[0] ;
                  A233TBM32_CRF_ITEM_CD = P005W8_A233TBM32_CRF_ITEM_CD[0] ;
                  A232TBM32_CRF_ID = P005W8_A232TBM32_CRF_ID[0] ;
                  A231TBM32_STUDY_ID = P005W8_A231TBM32_STUDY_ID[0] ;
                  A235TBM32_CRF_ITEM_DIV = P005W8_A235TBM32_CRF_ITEM_DIV[0] ;
                  n235TBM32_CRF_ITEM_DIV = P005W8_n235TBM32_CRF_ITEM_DIV[0] ;
                  A404TBM32_FIXED_VALUE = P005W8_A404TBM32_FIXED_VALUE[0] ;
                  n404TBM32_FIXED_VALUE = P005W8_n404TBM32_FIXED_VALUE[0] ;
                  if ( (GXutil.strcmp("", A747TBM32_REF_CRF_ITEM_CD)==0) )
                  {
                     if ( GXutil.strcmp(A235TBM32_CRF_ITEM_DIV, "Label") == 0 )
                     {
                        AV21SD_B705_SD04_EXPRESSION_I.setgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Crf_value( A404TBM32_FIXED_VALUE );
                     }
                     else
                     {
                        AV21SD_B705_SD04_EXPRESSION_I.setgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Crf_value( "" );
                     }
                  }
                  else
                  {
                     if ( A746TBM32_REF_CRF_ID == AV12P_CRF_ID )
                     {
                        AV75GXV7 = 1 ;
                        while ( AV75GXV7 <= AV22SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Crf_results().size() )
                        {
                           AV23SD_B792_SD02_CRF_RESULT_I = (SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem)((SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem)AV22SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Crf_results().elementAt(-1+AV75GXV7));
                           if ( GXutil.strcmp(AV23SD_B792_SD02_CRF_RESULT_I.getgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_item_grp_cd(), A747TBM32_REF_CRF_ITEM_CD) == 0 )
                           {
                              AV21SD_B705_SD04_EXPRESSION_I.setgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Crf_value( AV23SD_B792_SD02_CRF_RESULT_I.getgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_value() );
                              if (true) break;
                           }
                           AV75GXV7 = (int)(AV75GXV7+1) ;
                        }
                     }
                     else
                     {
                        /* Using cursor P005W9 */
                        pr_default.execute(7, new Object[] {new Long(AV13P_STUDY_ID), new Integer(AV14P_SUBJECT_ID), new Boolean(n746TBM32_REF_CRF_ID), new Short(A746TBM32_REF_CRF_ID), new Boolean(n747TBM32_REF_CRF_ITEM_CD), A747TBM32_REF_CRF_ITEM_CD});
                        while ( (pr_default.getStatus(7) != 101) )
                        {
                           A317TBT12_CRF_ID = P005W9_A317TBT12_CRF_ID[0] ;
                           A319TBT12_CRF_ITEM_GRP_CD = P005W9_A319TBT12_CRF_ITEM_GRP_CD[0] ;
                           A316TBT12_SUBJECT_ID = P005W9_A316TBT12_SUBJECT_ID[0] ;
                           A315TBT12_STUDY_ID = P005W9_A315TBT12_STUDY_ID[0] ;
                           A320TBT12_CRF_VALUE = P005W9_A320TBT12_CRF_VALUE[0] ;
                           n320TBT12_CRF_VALUE = P005W9_n320TBT12_CRF_VALUE[0] ;
                           A318TBT12_CRF_ITEM_GRP_DIV = P005W9_A318TBT12_CRF_ITEM_GRP_DIV[0] ;
                           AV21SD_B705_SD04_EXPRESSION_I.setgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Crf_value( A320TBT12_CRF_VALUE );
                           /* Exit For each command. Update data (if necessary), close cursors & exit. */
                           if (true) break;
                           pr_default.readNext(7);
                        }
                        pr_default.close(7);
                     }
                  }
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(6);
            }
            if ( GXutil.strcmp(AV21SD_B705_SD04_EXPRESSION_I.getgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Cond(), "==") == 0 )
            {
               if ( GXutil.strcmp(AV21SD_B705_SD04_EXPRESSION_I.getgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Chk_val(), "|null|") == 0 )
               {
                  if ( (GXutil.strcmp("", AV21SD_B705_SD04_EXPRESSION_I.getgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Crf_value())==0) )
                  {
                     AV21SD_B705_SD04_EXPRESSION_I.setgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Kekka( (short)(1) );
                  }
                  else
                  {
                     AV21SD_B705_SD04_EXPRESSION_I.setgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Kekka( (short)(0) );
                  }
               }
               else if ( GXutil.val( AV21SD_B705_SD04_EXPRESSION_I.getgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Chk_val(), ".") == 0 )
               {
                  if ( GXutil.strcmp(AV21SD_B705_SD04_EXPRESSION_I.getgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Crf_value(), AV21SD_B705_SD04_EXPRESSION_I.getgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Chk_val()) == 0 )
                  {
                     AV21SD_B705_SD04_EXPRESSION_I.setgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Kekka( (short)(1) );
                  }
                  else
                  {
                     AV21SD_B705_SD04_EXPRESSION_I.setgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Kekka( (short)(0) );
                  }
               }
               else
               {
                  if ( GXutil.val( GXutil.trim( AV21SD_B705_SD04_EXPRESSION_I.getgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Crf_value()), ".") == GXutil.val( GXutil.trim( AV21SD_B705_SD04_EXPRESSION_I.getgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Chk_val()), ".") )
                  {
                     AV21SD_B705_SD04_EXPRESSION_I.setgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Kekka( (short)(1) );
                  }
                  else
                  {
                     AV21SD_B705_SD04_EXPRESSION_I.setgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Kekka( (short)(0) );
                  }
               }
            }
            else if ( GXutil.strcmp(AV21SD_B705_SD04_EXPRESSION_I.getgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Cond(), "!=") == 0 )
            {
               if ( GXutil.strcmp(AV21SD_B705_SD04_EXPRESSION_I.getgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Chk_val(), "|null|") == 0 )
               {
                  if ( ! (GXutil.strcmp("", AV21SD_B705_SD04_EXPRESSION_I.getgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Crf_value())==0) )
                  {
                     AV21SD_B705_SD04_EXPRESSION_I.setgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Kekka( (short)(1) );
                  }
                  else
                  {
                     AV21SD_B705_SD04_EXPRESSION_I.setgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Kekka( (short)(0) );
                  }
               }
               else if ( GXutil.val( AV21SD_B705_SD04_EXPRESSION_I.getgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Chk_val(), ".") == 0 )
               {
                  if ( GXutil.strcmp(GXutil.trim( AV21SD_B705_SD04_EXPRESSION_I.getgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Crf_value()), GXutil.trim( AV21SD_B705_SD04_EXPRESSION_I.getgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Chk_val())) != 0 )
                  {
                     AV21SD_B705_SD04_EXPRESSION_I.setgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Kekka( (short)(1) );
                  }
                  else
                  {
                     AV21SD_B705_SD04_EXPRESSION_I.setgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Kekka( (short)(0) );
                  }
               }
               else
               {
                  if ( GXutil.val( GXutil.trim( AV21SD_B705_SD04_EXPRESSION_I.getgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Crf_value()), ".") != GXutil.val( GXutil.trim( AV21SD_B705_SD04_EXPRESSION_I.getgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Chk_val()), ".") )
                  {
                     AV21SD_B705_SD04_EXPRESSION_I.setgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Kekka( (short)(1) );
                  }
                  else
                  {
                     AV21SD_B705_SD04_EXPRESSION_I.setgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Kekka( (short)(0) );
                  }
               }
            }
            else if ( GXutil.strcmp(AV21SD_B705_SD04_EXPRESSION_I.getgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Cond(), ">") == 0 )
            {
               if ( GXutil.val( GXutil.trim( AV21SD_B705_SD04_EXPRESSION_I.getgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Crf_value()), ".") > GXutil.val( GXutil.trim( AV21SD_B705_SD04_EXPRESSION_I.getgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Chk_val()), ".") )
               {
                  AV21SD_B705_SD04_EXPRESSION_I.setgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Kekka( (short)(1) );
               }
               else
               {
                  AV21SD_B705_SD04_EXPRESSION_I.setgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Kekka( (short)(0) );
               }
            }
            else if ( GXutil.strcmp(AV21SD_B705_SD04_EXPRESSION_I.getgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Cond(), "<") == 0 )
            {
               if ( GXutil.val( GXutil.trim( AV21SD_B705_SD04_EXPRESSION_I.getgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Crf_value()), ".") < GXutil.val( GXutil.trim( AV21SD_B705_SD04_EXPRESSION_I.getgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Chk_val()), ".") )
               {
                  AV21SD_B705_SD04_EXPRESSION_I.setgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Kekka( (short)(1) );
               }
               else
               {
                  AV21SD_B705_SD04_EXPRESSION_I.setgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Kekka( (short)(0) );
               }
            }
            else if ( GXutil.strcmp(AV21SD_B705_SD04_EXPRESSION_I.getgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Cond(), ">=") == 0 )
            {
               if ( GXutil.val( GXutil.trim( AV21SD_B705_SD04_EXPRESSION_I.getgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Crf_value()), ".") >= GXutil.val( GXutil.trim( AV21SD_B705_SD04_EXPRESSION_I.getgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Chk_val()), ".") )
               {
                  AV21SD_B705_SD04_EXPRESSION_I.setgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Kekka( (short)(1) );
               }
               else
               {
                  AV21SD_B705_SD04_EXPRESSION_I.setgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Kekka( (short)(0) );
               }
            }
            else if ( GXutil.strcmp(AV21SD_B705_SD04_EXPRESSION_I.getgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Cond(), "<=") == 0 )
            {
               if ( GXutil.val( GXutil.trim( AV21SD_B705_SD04_EXPRESSION_I.getgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Crf_value()), ".") <= GXutil.val( GXutil.trim( AV21SD_B705_SD04_EXPRESSION_I.getgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Chk_val()), ".") )
               {
                  AV21SD_B705_SD04_EXPRESSION_I.setgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Kekka( (short)(1) );
               }
               else
               {
                  AV21SD_B705_SD04_EXPRESSION_I.setgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Kekka( (short)(0) );
               }
            }
            if ( GXutil.strcmp(AV21SD_B705_SD04_EXPRESSION_I.getgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Union_cond(), "and") == 0 )
            {
               AV27W_CHK_KEKKA = (short)(AV27W_CHK_KEKKA*AV21SD_B705_SD04_EXPRESSION_I.getgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Kekka()) ;
            }
            else
            {
               AV27W_CHK_KEKKA = (short)(AV27W_CHK_KEKKA+AV21SD_B705_SD04_EXPRESSION_I.getgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Kekka()) ;
            }
            AV72GXV5 = (int)(AV72GXV5+1) ;
         }
         if ( AV27W_CHK_KEKKA != 0 )
         {
            AV32W_ERR_FLG = "1" ;
            AV16SD_B705_SD02_ERRCHK_ITEM_I = (SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem)new SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem(remoteHandle, context);
            if ( (GXutil.strcmp("", AV18SD_B705_SD03_CHK_COND_I.getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Err_msg())==0) )
            {
               GXt_char3 = "" ;
               GXv_char1[0] = GXt_char3 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AE00002", AV37W_ERR_MSG_ITEM_NM, "", "", "", "", GXv_char1) ;
               b705_pc02_crf_value_chk.this.GXt_char3 = GXv_char1[0] ;
               AV16SD_B705_SD02_ERRCHK_ITEM_I.setgxTv_SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem_Err_msg( GXt_char3 );
            }
            else
            {
               AV16SD_B705_SD02_ERRCHK_ITEM_I.setgxTv_SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem_Err_msg( AV18SD_B705_SD03_CHK_COND_I.getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Err_msg() );
            }
            AV15SD_B705_SD01_ERRCHK_RES.getgxTv_SdtB705_SD01_ERRCHK_RES_Err_items().add(AV16SD_B705_SD02_ERRCHK_ITEM_I, 0);
         }
      }
   }

   public void S181( )
   {
      /* 'SUB_COND_CHK_EXEC_CHK' Routine */
      AV25W_CHK_EXEC_FLG = "1" ;
      AV77GXV8 = 1 ;
      while ( AV77GXV8 <= AV20SD_B705_SD04_EXPRESSION.size() )
      {
         AV21SD_B705_SD04_EXPRESSION_I = (SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem)((SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem)AV20SD_B705_SD04_EXPRESSION.elementAt(-1+AV77GXV8));
         AV26W_CHK_KBN = "1" ;
         AV54W_TBM32_CRF_ITEM_CD = AV21SD_B705_SD04_EXPRESSION_I.getgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Crf_item_cd() ;
         /* Execute user subroutine: S141 */
         S141 ();
         if (returnInSub) return;
         if ( GXutil.strcmp(AV25W_CHK_EXEC_FLG, "0") == 0 )
         {
            if (true) break;
         }
         AV77GXV8 = (int)(AV77GXV8+1) ;
      }
   }

   public void S19772( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
   }

   public void S20782( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV78Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("b790_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      returnInSub = true;
      if (true) return;
   }

   protected void cleanup( )
   {
      this.aP5[0] = b705_pc02_crf_value_chk.this.AV15SD_B705_SD01_ERRCHK_RES;
      this.aP6[0] = b705_pc02_crf_value_chk.this.AV48W_RTN_CD;
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
                  /* Execute user subroutine: S20782 */
                  S20782 ();
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
      AV15SD_B705_SD01_ERRCHK_RES = new SdtB705_SD01_ERRCHK_RES(remoteHandle, context);
      AV48W_RTN_CD = "" ;
      AV8C_DM_AUTH_CD = "" ;
      GXv_int2 = new byte [1] ;
      scmdbuf = "" ;
      P005W2_A161TBM01_SYS_ID = new String[] {""} ;
      P005W2_A514TBM01_SYS_VALUE = new String[] {""} ;
      P005W2_n514TBM01_SYS_VALUE = new boolean[] {false} ;
      A161TBM01_SYS_ID = "" ;
      A514TBM01_SYS_VALUE = "" ;
      AV10C_HOJOSYA_AUTH_CD = "" ;
      P005W3_A17TAM04_AUTH_CD = new String[] {""} ;
      P005W3_A601TAM04_AUTH_LVL = new byte[1] ;
      P005W3_n601TAM04_AUTH_LVL = new boolean[] {false} ;
      A17TAM04_AUTH_CD = "" ;
      AV32W_ERR_FLG = "" ;
      AV36W_ERR_MSG = "" ;
      AV17SD_B705_SD03_CHK_COND = new GxObjectCollection(SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem.class, "B705_SD03_CHK_COND.B705_SD03_CHK_CONDItem", "SmartEDC_SHIZUOKA", remoteHandle);
      AV18SD_B705_SD03_CHK_COND_I = new SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem(remoteHandle, context);
      P005W4_A238TBM32_DEL_FLG = new String[] {""} ;
      P005W4_n238TBM32_DEL_FLG = new boolean[] {false} ;
      P005W4_A235TBM32_CRF_ITEM_DIV = new String[] {""} ;
      P005W4_n235TBM32_CRF_ITEM_DIV = new boolean[] {false} ;
      P005W4_A232TBM32_CRF_ID = new short[1] ;
      P005W4_A231TBM32_STUDY_ID = new long[1] ;
      P005W4_A233TBM32_CRF_ITEM_CD = new String[] {""} ;
      P005W4_A234TBM32_CRF_ITEM_NM = new String[] {""} ;
      P005W4_n234TBM32_CRF_ITEM_NM = new boolean[] {false} ;
      P005W4_A236TBM32_CRF_ITEM_GRP_CD = new String[] {""} ;
      P005W4_n236TBM32_CRF_ITEM_GRP_CD = new boolean[] {false} ;
      P005W4_A607TBM32_REQUIRED_INPUT_FLG = new String[] {""} ;
      P005W4_n607TBM32_REQUIRED_INPUT_FLG = new boolean[] {false} ;
      P005W4_A394TBM32_TEXT_MAXLENGTH = new short[1] ;
      P005W4_n394TBM32_TEXT_MAXLENGTH = new boolean[] {false} ;
      P005W4_A395TBM32_DECIMAL_DIGITS = new byte[1] ;
      P005W4_n395TBM32_DECIMAL_DIGITS = new boolean[] {false} ;
      P005W4_A608TBM32_MIN_VALUE = new String[] {""} ;
      P005W4_n608TBM32_MIN_VALUE = new boolean[] {false} ;
      P005W4_A609TBM32_MAX_VALUE = new String[] {""} ;
      P005W4_n609TBM32_MAX_VALUE = new boolean[] {false} ;
      A238TBM32_DEL_FLG = "" ;
      A235TBM32_CRF_ITEM_DIV = "" ;
      A233TBM32_CRF_ITEM_CD = "" ;
      A234TBM32_CRF_ITEM_NM = "" ;
      A236TBM32_CRF_ITEM_GRP_CD = "" ;
      A607TBM32_REQUIRED_INPUT_FLG = "" ;
      A608TBM32_MIN_VALUE = "" ;
      A609TBM32_MAX_VALUE = "" ;
      P005W5_A246TBM33_STUDY_ID = new long[1] ;
      P005W5_A247TBM33_CRF_ID = new short[1] ;
      P005W5_A251TBM33_DEL_FLG = new String[] {""} ;
      P005W5_n251TBM33_DEL_FLG = new boolean[] {false} ;
      P005W5_A380TBM33_COND_DIV = new String[] {""} ;
      P005W5_n380TBM33_COND_DIV = new boolean[] {false} ;
      P005W5_A381TBM33_CRF_ITEM_CD = new String[] {""} ;
      P005W5_n381TBM33_CRF_ITEM_CD = new boolean[] {false} ;
      P005W5_A554TBM33_ENABLED_FLG = new String[] {""} ;
      P005W5_n554TBM33_ENABLED_FLG = new boolean[] {false} ;
      P005W5_A382TBM33_ERR_DIV = new String[] {""} ;
      P005W5_n382TBM33_ERR_DIV = new boolean[] {false} ;
      P005W5_A383TBM33_ERR_MSG = new String[] {""} ;
      P005W5_n383TBM33_ERR_MSG = new boolean[] {false} ;
      P005W5_A249TBM33_EXPRESSION = new String[] {""} ;
      P005W5_n249TBM33_EXPRESSION = new boolean[] {false} ;
      P005W5_A611TBM33_NUMERIC_RANGE_FLG = new String[] {""} ;
      P005W5_n611TBM33_NUMERIC_RANGE_FLG = new boolean[] {false} ;
      P005W5_A610TBM33_REQUIRED_INPUT_FLG = new String[] {""} ;
      P005W5_n610TBM33_REQUIRED_INPUT_FLG = new boolean[] {false} ;
      P005W5_A250TBM33_PRIOR_NO = new byte[1] ;
      P005W5_n250TBM33_PRIOR_NO = new boolean[] {false} ;
      P005W5_A248TBM33_COND_NO = new short[1] ;
      A251TBM33_DEL_FLG = "" ;
      A380TBM33_COND_DIV = "" ;
      A381TBM33_CRF_ITEM_CD = "" ;
      A554TBM33_ENABLED_FLG = "" ;
      A382TBM33_ERR_DIV = "" ;
      A383TBM33_ERR_MSG = "" ;
      A249TBM33_EXPRESSION = "" ;
      A611TBM33_NUMERIC_RANGE_FLG = "" ;
      A610TBM33_REQUIRED_INPUT_FLG = "" ;
      AV39W_FLG = "" ;
      AV57W_TBT12_CRF_VALUE = "" ;
      AV23SD_B792_SD02_CRF_RESULT_I = new SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem(remoteHandle, context);
      AV56W_TBT12_CRF_ITEM_GRP_CD = "" ;
      AV33W_ERR_FLG_GRP = "" ;
      AV26W_CHK_KBN = "" ;
      AV54W_TBM32_CRF_ITEM_CD = "" ;
      AV25W_CHK_EXEC_FLG = "" ;
      AV19SD_B705_SD03_CHK_COND_I_GRP = new SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem(remoteHandle, context);
      AV16SD_B705_SD02_ERRCHK_ITEM_I = new SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem(remoteHandle, context);
      AV34W_ERR_FLG_ITEM = "" ;
      AV55W_TBM32_CRF_ITEM_GRP_CD = "" ;
      P005W6_A233TBM32_CRF_ITEM_CD = new String[] {""} ;
      P005W6_A232TBM32_CRF_ID = new short[1] ;
      P005W6_A231TBM32_STUDY_ID = new long[1] ;
      P005W6_A238TBM32_DEL_FLG = new String[] {""} ;
      P005W6_n238TBM32_DEL_FLG = new boolean[] {false} ;
      P005W6_A236TBM32_CRF_ITEM_GRP_CD = new String[] {""} ;
      P005W6_n236TBM32_CRF_ITEM_GRP_CD = new boolean[] {false} ;
      P005W6_A235TBM32_CRF_ITEM_DIV = new String[] {""} ;
      P005W6_n235TBM32_CRF_ITEM_DIV = new boolean[] {false} ;
      P005W6_A234TBM32_CRF_ITEM_NM = new String[] {""} ;
      P005W6_n234TBM32_CRF_ITEM_NM = new boolean[] {false} ;
      P005W6_A552TBM32_AUTH_LVL_MIN = new byte[1] ;
      P005W6_n552TBM32_AUTH_LVL_MIN = new boolean[] {false} ;
      AV37W_ERR_MSG_ITEM_NM = "" ;
      P005W7_A471TBM35_STUDY_ID = new long[1] ;
      P005W7_A472TBM35_CRF_ID = new short[1] ;
      P005W7_A473TBM35_CRF_ITEM_CD = new String[] {""} ;
      P005W7_A476TBM35_DEL_FLG = new String[] {""} ;
      P005W7_n476TBM35_DEL_FLG = new boolean[] {false} ;
      P005W7_A475TBM35_DISPLAY_FLG = new String[] {""} ;
      P005W7_n475TBM35_DISPLAY_FLG = new boolean[] {false} ;
      P005W7_A474TBM35_STUDY_AUTH_CD = new String[] {""} ;
      A473TBM35_CRF_ITEM_CD = "" ;
      A476TBM35_DEL_FLG = "" ;
      A475TBM35_DISPLAY_FLG = "" ;
      A474TBM35_STUDY_AUTH_CD = "" ;
      AV35W_ERR_FLG_NUM = "" ;
      AV47W_REPLACE = "" ;
      GXv_int4 = new short [1] ;
      GXv_int5 = new short [1] ;
      AV40W_ITEM_NM = "" ;
      AV20SD_B705_SD04_EXPRESSION = new GxObjectCollection(SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem.class, "B705_SD04_EXPRESSION.B705_SD04_EXPRESSIONItem", "SmartEDC_SHIZUOKA", remoteHandle);
      GXv_objcol_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem6 = new GxObjectCollection [1] ;
      AV21SD_B705_SD04_EXPRESSION_I = new SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem(remoteHandle, context);
      P005W8_A747TBM32_REF_CRF_ITEM_CD = new String[] {""} ;
      P005W8_n747TBM32_REF_CRF_ITEM_CD = new boolean[] {false} ;
      P005W8_A746TBM32_REF_CRF_ID = new short[1] ;
      P005W8_n746TBM32_REF_CRF_ID = new boolean[] {false} ;
      P005W8_A233TBM32_CRF_ITEM_CD = new String[] {""} ;
      P005W8_A232TBM32_CRF_ID = new short[1] ;
      P005W8_A231TBM32_STUDY_ID = new long[1] ;
      P005W8_A235TBM32_CRF_ITEM_DIV = new String[] {""} ;
      P005W8_n235TBM32_CRF_ITEM_DIV = new boolean[] {false} ;
      P005W8_A404TBM32_FIXED_VALUE = new String[] {""} ;
      P005W8_n404TBM32_FIXED_VALUE = new boolean[] {false} ;
      A747TBM32_REF_CRF_ITEM_CD = "" ;
      A404TBM32_FIXED_VALUE = "" ;
      P005W9_A317TBT12_CRF_ID = new short[1] ;
      P005W9_A319TBT12_CRF_ITEM_GRP_CD = new String[] {""} ;
      P005W9_A316TBT12_SUBJECT_ID = new int[1] ;
      P005W9_A315TBT12_STUDY_ID = new long[1] ;
      P005W9_A320TBT12_CRF_VALUE = new String[] {""} ;
      P005W9_n320TBT12_CRF_VALUE = new boolean[] {false} ;
      P005W9_A318TBT12_CRF_ITEM_GRP_DIV = new String[] {""} ;
      A319TBT12_CRF_ITEM_GRP_CD = "" ;
      A320TBT12_CRF_VALUE = "" ;
      A318TBT12_CRF_ITEM_GRP_DIV = "" ;
      GXv_char1 = new String [1] ;
      AV78Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      GXt_char3 = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b705_pc02_crf_value_chk__default(),
         new Object[] {
             new Object[] {
            P005W2_A161TBM01_SYS_ID, P005W2_A514TBM01_SYS_VALUE, P005W2_n514TBM01_SYS_VALUE
            }
            , new Object[] {
            P005W3_A17TAM04_AUTH_CD, P005W3_A601TAM04_AUTH_LVL, P005W3_n601TAM04_AUTH_LVL
            }
            , new Object[] {
            P005W4_A238TBM32_DEL_FLG, P005W4_n238TBM32_DEL_FLG, P005W4_A235TBM32_CRF_ITEM_DIV, P005W4_n235TBM32_CRF_ITEM_DIV, P005W4_A232TBM32_CRF_ID, P005W4_A231TBM32_STUDY_ID, P005W4_A233TBM32_CRF_ITEM_CD, P005W4_A234TBM32_CRF_ITEM_NM, P005W4_n234TBM32_CRF_ITEM_NM, P005W4_A236TBM32_CRF_ITEM_GRP_CD,
            P005W4_n236TBM32_CRF_ITEM_GRP_CD, P005W4_A607TBM32_REQUIRED_INPUT_FLG, P005W4_n607TBM32_REQUIRED_INPUT_FLG, P005W4_A394TBM32_TEXT_MAXLENGTH, P005W4_n394TBM32_TEXT_MAXLENGTH, P005W4_A395TBM32_DECIMAL_DIGITS, P005W4_n395TBM32_DECIMAL_DIGITS, P005W4_A608TBM32_MIN_VALUE, P005W4_n608TBM32_MIN_VALUE, P005W4_A609TBM32_MAX_VALUE,
            P005W4_n609TBM32_MAX_VALUE
            }
            , new Object[] {
            P005W5_A246TBM33_STUDY_ID, P005W5_A247TBM33_CRF_ID, P005W5_A251TBM33_DEL_FLG, P005W5_n251TBM33_DEL_FLG, P005W5_A380TBM33_COND_DIV, P005W5_n380TBM33_COND_DIV, P005W5_A381TBM33_CRF_ITEM_CD, P005W5_n381TBM33_CRF_ITEM_CD, P005W5_A554TBM33_ENABLED_FLG, P005W5_n554TBM33_ENABLED_FLG,
            P005W5_A382TBM33_ERR_DIV, P005W5_n382TBM33_ERR_DIV, P005W5_A383TBM33_ERR_MSG, P005W5_n383TBM33_ERR_MSG, P005W5_A249TBM33_EXPRESSION, P005W5_n249TBM33_EXPRESSION, P005W5_A611TBM33_NUMERIC_RANGE_FLG, P005W5_n611TBM33_NUMERIC_RANGE_FLG, P005W5_A610TBM33_REQUIRED_INPUT_FLG, P005W5_n610TBM33_REQUIRED_INPUT_FLG,
            P005W5_A250TBM33_PRIOR_NO, P005W5_n250TBM33_PRIOR_NO, P005W5_A248TBM33_COND_NO
            }
            , new Object[] {
            P005W6_A233TBM32_CRF_ITEM_CD, P005W6_A232TBM32_CRF_ID, P005W6_A231TBM32_STUDY_ID, P005W6_A238TBM32_DEL_FLG, P005W6_n238TBM32_DEL_FLG, P005W6_A236TBM32_CRF_ITEM_GRP_CD, P005W6_n236TBM32_CRF_ITEM_GRP_CD, P005W6_A235TBM32_CRF_ITEM_DIV, P005W6_n235TBM32_CRF_ITEM_DIV, P005W6_A234TBM32_CRF_ITEM_NM,
            P005W6_n234TBM32_CRF_ITEM_NM, P005W6_A552TBM32_AUTH_LVL_MIN, P005W6_n552TBM32_AUTH_LVL_MIN
            }
            , new Object[] {
            P005W7_A471TBM35_STUDY_ID, P005W7_A472TBM35_CRF_ID, P005W7_A473TBM35_CRF_ITEM_CD, P005W7_A476TBM35_DEL_FLG, P005W7_n476TBM35_DEL_FLG, P005W7_A475TBM35_DISPLAY_FLG, P005W7_n475TBM35_DISPLAY_FLG, P005W7_A474TBM35_STUDY_AUTH_CD
            }
            , new Object[] {
            P005W8_A747TBM32_REF_CRF_ITEM_CD, P005W8_n747TBM32_REF_CRF_ITEM_CD, P005W8_A746TBM32_REF_CRF_ID, P005W8_n746TBM32_REF_CRF_ID, P005W8_A233TBM32_CRF_ITEM_CD, P005W8_A232TBM32_CRF_ID, P005W8_A231TBM32_STUDY_ID, P005W8_A235TBM32_CRF_ITEM_DIV, P005W8_n235TBM32_CRF_ITEM_DIV, P005W8_A404TBM32_FIXED_VALUE,
            P005W8_n404TBM32_FIXED_VALUE
            }
            , new Object[] {
            P005W9_A317TBT12_CRF_ID, P005W9_A319TBT12_CRF_ITEM_GRP_CD, P005W9_A316TBT12_SUBJECT_ID, P005W9_A315TBT12_STUDY_ID, P005W9_A320TBT12_CRF_VALUE, P005W9_n320TBT12_CRF_VALUE, P005W9_A318TBT12_CRF_ITEM_GRP_DIV
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV78Pgmname = "B705_PC02_CRF_VALUE_CHK" ;
      /* GeneXus formulas. */
      AV78Pgmname = "B705_PC02_CRF_VALUE_CHK" ;
      Gx_err = (short)(0) ;
   }

   private byte GXv_int2[] ;
   private byte A601TAM04_AUTH_LVL ;
   private byte AV53W_TAM04_AUTH_LVL ;
   private byte A395TBM32_DECIMAL_DIGITS ;
   private byte A250TBM33_PRIOR_NO ;
   private byte A552TBM32_AUTH_LVL_MIN ;
   private short AV12P_CRF_ID ;
   private short AV9C_DM_INPUT_LEVEL ;
   private short A232TBM32_CRF_ID ;
   private short A394TBM32_TEXT_MAXLENGTH ;
   private short A247TBM33_CRF_ID ;
   private short A248TBM33_COND_NO ;
   private short AV59W_CHKBOX_CNT ;
   private short AV58W_CHKBOX_ON_CNT ;
   private short A472TBM35_CRF_ID ;
   private short AV43W_NUM_CHK_KBN ;
   private short AV31W_DEFF_LEN ;
   private short AV44W_POS ;
   private short AV45W_POSTIVE_DIGITS ;
   private short GXv_int4[] ;
   private short AV30W_DECIMAL_DIGITS ;
   private short GXv_int5[] ;
   private short AV46W_POSTIVE_DIGITS_CHK ;
   private short AV27W_CHK_KEKKA ;
   private short A746TBM32_REF_CRF_ID ;
   private short A317TBT12_CRF_ID ;
   private short Gx_err ;
   private int AV14P_SUBJECT_ID ;
   private int AV64GXV1 ;
   private int AV67GXV2 ;
   private int AV68GXV3 ;
   private int AV69GXV4 ;
   private int AV72GXV5 ;
   private int AV73GXV6 ;
   private int AV75GXV7 ;
   private int A316TBT12_SUBJECT_ID ;
   private int AV77GXV8 ;
   private int GXActiveErrHndl ;
   private long AV13P_STUDY_ID ;
   private long A231TBM32_STUDY_ID ;
   private long A246TBM33_STUDY_ID ;
   private long A471TBM35_STUDY_ID ;
   private long A315TBT12_STUDY_ID ;
   private String scmdbuf ;
   private String GXv_char1[] ;
   private String AV78Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String GXt_char3 ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private boolean n514TBM01_SYS_VALUE ;
   private boolean n601TAM04_AUTH_LVL ;
   private boolean n238TBM32_DEL_FLG ;
   private boolean n235TBM32_CRF_ITEM_DIV ;
   private boolean n234TBM32_CRF_ITEM_NM ;
   private boolean n236TBM32_CRF_ITEM_GRP_CD ;
   private boolean n607TBM32_REQUIRED_INPUT_FLG ;
   private boolean n394TBM32_TEXT_MAXLENGTH ;
   private boolean n395TBM32_DECIMAL_DIGITS ;
   private boolean n608TBM32_MIN_VALUE ;
   private boolean n609TBM32_MAX_VALUE ;
   private boolean n251TBM33_DEL_FLG ;
   private boolean n380TBM33_COND_DIV ;
   private boolean n381TBM33_CRF_ITEM_CD ;
   private boolean n554TBM33_ENABLED_FLG ;
   private boolean n382TBM33_ERR_DIV ;
   private boolean n383TBM33_ERR_MSG ;
   private boolean n249TBM33_EXPRESSION ;
   private boolean n611TBM33_NUMERIC_RANGE_FLG ;
   private boolean n610TBM33_REQUIRED_INPUT_FLG ;
   private boolean n250TBM33_PRIOR_NO ;
   private boolean n552TBM32_AUTH_LVL_MIN ;
   private boolean n476TBM35_DEL_FLG ;
   private boolean n475TBM35_DISPLAY_FLG ;
   private boolean n747TBM32_REF_CRF_ITEM_CD ;
   private boolean n746TBM32_REF_CRF_ID ;
   private boolean n404TBM32_FIXED_VALUE ;
   private boolean n320TBT12_CRF_VALUE ;
   private String AV11P_AUTH_CD ;
   private String AV48W_RTN_CD ;
   private String AV8C_DM_AUTH_CD ;
   private String A161TBM01_SYS_ID ;
   private String A514TBM01_SYS_VALUE ;
   private String AV10C_HOJOSYA_AUTH_CD ;
   private String A17TAM04_AUTH_CD ;
   private String AV32W_ERR_FLG ;
   private String AV36W_ERR_MSG ;
   private String A238TBM32_DEL_FLG ;
   private String A235TBM32_CRF_ITEM_DIV ;
   private String A233TBM32_CRF_ITEM_CD ;
   private String A234TBM32_CRF_ITEM_NM ;
   private String A236TBM32_CRF_ITEM_GRP_CD ;
   private String A607TBM32_REQUIRED_INPUT_FLG ;
   private String A608TBM32_MIN_VALUE ;
   private String A609TBM32_MAX_VALUE ;
   private String A251TBM33_DEL_FLG ;
   private String A380TBM33_COND_DIV ;
   private String A381TBM33_CRF_ITEM_CD ;
   private String A554TBM33_ENABLED_FLG ;
   private String A382TBM33_ERR_DIV ;
   private String A383TBM33_ERR_MSG ;
   private String A249TBM33_EXPRESSION ;
   private String A611TBM33_NUMERIC_RANGE_FLG ;
   private String A610TBM33_REQUIRED_INPUT_FLG ;
   private String AV39W_FLG ;
   private String AV57W_TBT12_CRF_VALUE ;
   private String AV56W_TBT12_CRF_ITEM_GRP_CD ;
   private String AV33W_ERR_FLG_GRP ;
   private String AV26W_CHK_KBN ;
   private String AV54W_TBM32_CRF_ITEM_CD ;
   private String AV25W_CHK_EXEC_FLG ;
   private String AV34W_ERR_FLG_ITEM ;
   private String AV55W_TBM32_CRF_ITEM_GRP_CD ;
   private String AV37W_ERR_MSG_ITEM_NM ;
   private String A473TBM35_CRF_ITEM_CD ;
   private String A476TBM35_DEL_FLG ;
   private String A475TBM35_DISPLAY_FLG ;
   private String A474TBM35_STUDY_AUTH_CD ;
   private String AV35W_ERR_FLG_NUM ;
   private String AV47W_REPLACE ;
   private String AV40W_ITEM_NM ;
   private String A747TBM32_REF_CRF_ITEM_CD ;
   private String A404TBM32_FIXED_VALUE ;
   private String A319TBT12_CRF_ITEM_GRP_CD ;
   private String A320TBT12_CRF_VALUE ;
   private String A318TBT12_CRF_ITEM_GRP_DIV ;
   private SdtB705_SD01_ERRCHK_RES[] aP5 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P005W2_A161TBM01_SYS_ID ;
   private String[] P005W2_A514TBM01_SYS_VALUE ;
   private boolean[] P005W2_n514TBM01_SYS_VALUE ;
   private String[] P005W3_A17TAM04_AUTH_CD ;
   private byte[] P005W3_A601TAM04_AUTH_LVL ;
   private boolean[] P005W3_n601TAM04_AUTH_LVL ;
   private String[] P005W4_A238TBM32_DEL_FLG ;
   private boolean[] P005W4_n238TBM32_DEL_FLG ;
   private String[] P005W4_A235TBM32_CRF_ITEM_DIV ;
   private boolean[] P005W4_n235TBM32_CRF_ITEM_DIV ;
   private short[] P005W4_A232TBM32_CRF_ID ;
   private long[] P005W4_A231TBM32_STUDY_ID ;
   private String[] P005W4_A233TBM32_CRF_ITEM_CD ;
   private String[] P005W4_A234TBM32_CRF_ITEM_NM ;
   private boolean[] P005W4_n234TBM32_CRF_ITEM_NM ;
   private String[] P005W4_A236TBM32_CRF_ITEM_GRP_CD ;
   private boolean[] P005W4_n236TBM32_CRF_ITEM_GRP_CD ;
   private String[] P005W4_A607TBM32_REQUIRED_INPUT_FLG ;
   private boolean[] P005W4_n607TBM32_REQUIRED_INPUT_FLG ;
   private short[] P005W4_A394TBM32_TEXT_MAXLENGTH ;
   private boolean[] P005W4_n394TBM32_TEXT_MAXLENGTH ;
   private byte[] P005W4_A395TBM32_DECIMAL_DIGITS ;
   private boolean[] P005W4_n395TBM32_DECIMAL_DIGITS ;
   private String[] P005W4_A608TBM32_MIN_VALUE ;
   private boolean[] P005W4_n608TBM32_MIN_VALUE ;
   private String[] P005W4_A609TBM32_MAX_VALUE ;
   private boolean[] P005W4_n609TBM32_MAX_VALUE ;
   private long[] P005W5_A246TBM33_STUDY_ID ;
   private short[] P005W5_A247TBM33_CRF_ID ;
   private String[] P005W5_A251TBM33_DEL_FLG ;
   private boolean[] P005W5_n251TBM33_DEL_FLG ;
   private String[] P005W5_A380TBM33_COND_DIV ;
   private boolean[] P005W5_n380TBM33_COND_DIV ;
   private String[] P005W5_A381TBM33_CRF_ITEM_CD ;
   private boolean[] P005W5_n381TBM33_CRF_ITEM_CD ;
   private String[] P005W5_A554TBM33_ENABLED_FLG ;
   private boolean[] P005W5_n554TBM33_ENABLED_FLG ;
   private String[] P005W5_A382TBM33_ERR_DIV ;
   private boolean[] P005W5_n382TBM33_ERR_DIV ;
   private String[] P005W5_A383TBM33_ERR_MSG ;
   private boolean[] P005W5_n383TBM33_ERR_MSG ;
   private String[] P005W5_A249TBM33_EXPRESSION ;
   private boolean[] P005W5_n249TBM33_EXPRESSION ;
   private String[] P005W5_A611TBM33_NUMERIC_RANGE_FLG ;
   private boolean[] P005W5_n611TBM33_NUMERIC_RANGE_FLG ;
   private String[] P005W5_A610TBM33_REQUIRED_INPUT_FLG ;
   private boolean[] P005W5_n610TBM33_REQUIRED_INPUT_FLG ;
   private byte[] P005W5_A250TBM33_PRIOR_NO ;
   private boolean[] P005W5_n250TBM33_PRIOR_NO ;
   private short[] P005W5_A248TBM33_COND_NO ;
   private String[] P005W6_A233TBM32_CRF_ITEM_CD ;
   private short[] P005W6_A232TBM32_CRF_ID ;
   private long[] P005W6_A231TBM32_STUDY_ID ;
   private String[] P005W6_A238TBM32_DEL_FLG ;
   private boolean[] P005W6_n238TBM32_DEL_FLG ;
   private String[] P005W6_A236TBM32_CRF_ITEM_GRP_CD ;
   private boolean[] P005W6_n236TBM32_CRF_ITEM_GRP_CD ;
   private String[] P005W6_A235TBM32_CRF_ITEM_DIV ;
   private boolean[] P005W6_n235TBM32_CRF_ITEM_DIV ;
   private String[] P005W6_A234TBM32_CRF_ITEM_NM ;
   private boolean[] P005W6_n234TBM32_CRF_ITEM_NM ;
   private byte[] P005W6_A552TBM32_AUTH_LVL_MIN ;
   private boolean[] P005W6_n552TBM32_AUTH_LVL_MIN ;
   private long[] P005W7_A471TBM35_STUDY_ID ;
   private short[] P005W7_A472TBM35_CRF_ID ;
   private String[] P005W7_A473TBM35_CRF_ITEM_CD ;
   private String[] P005W7_A476TBM35_DEL_FLG ;
   private boolean[] P005W7_n476TBM35_DEL_FLG ;
   private String[] P005W7_A475TBM35_DISPLAY_FLG ;
   private boolean[] P005W7_n475TBM35_DISPLAY_FLG ;
   private String[] P005W7_A474TBM35_STUDY_AUTH_CD ;
   private String[] P005W8_A747TBM32_REF_CRF_ITEM_CD ;
   private boolean[] P005W8_n747TBM32_REF_CRF_ITEM_CD ;
   private short[] P005W8_A746TBM32_REF_CRF_ID ;
   private boolean[] P005W8_n746TBM32_REF_CRF_ID ;
   private String[] P005W8_A233TBM32_CRF_ITEM_CD ;
   private short[] P005W8_A232TBM32_CRF_ID ;
   private long[] P005W8_A231TBM32_STUDY_ID ;
   private String[] P005W8_A235TBM32_CRF_ITEM_DIV ;
   private boolean[] P005W8_n235TBM32_CRF_ITEM_DIV ;
   private String[] P005W8_A404TBM32_FIXED_VALUE ;
   private boolean[] P005W8_n404TBM32_FIXED_VALUE ;
   private short[] P005W9_A317TBT12_CRF_ID ;
   private String[] P005W9_A319TBT12_CRF_ITEM_GRP_CD ;
   private int[] P005W9_A316TBT12_SUBJECT_ID ;
   private long[] P005W9_A315TBT12_STUDY_ID ;
   private String[] P005W9_A320TBT12_CRF_VALUE ;
   private boolean[] P005W9_n320TBT12_CRF_VALUE ;
   private String[] P005W9_A318TBT12_CRF_ITEM_GRP_DIV ;
   private GxObjectCollection AV17SD_B705_SD03_CHK_COND ;
   private GxObjectCollection AV20SD_B705_SD04_EXPRESSION ;
   private GxObjectCollection GXv_objcol_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem6[] ;
   private SdtB705_SD01_ERRCHK_RES AV15SD_B705_SD01_ERRCHK_RES ;
   private SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem AV16SD_B705_SD02_ERRCHK_ITEM_I ;
   private SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem AV18SD_B705_SD03_CHK_COND_I ;
   private SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem AV19SD_B705_SD03_CHK_COND_I_GRP ;
   private SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem AV21SD_B705_SD04_EXPRESSION_I ;
   private SdtB792_SD01_CRF AV22SD_B792_SD01_CRF ;
   private SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem AV23SD_B792_SD02_CRF_RESULT_I ;
}

final  class b705_pc02_crf_value_chk__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P005W6( com.genexus.internet.HttpContext httpContext ,
                                          String AV26W_CHK_KBN ,
                                          String A233TBM32_CRF_ITEM_CD ,
                                          String AV54W_TBM32_CRF_ITEM_CD ,
                                          String A235TBM32_CRF_ITEM_DIV ,
                                          String A236TBM32_CRF_ITEM_GRP_CD ,
                                          String AV55W_TBM32_CRF_ITEM_GRP_CD ,
                                          String A238TBM32_DEL_FLG ,
                                          long AV13P_STUDY_ID ,
                                          short AV12P_CRF_ID ,
                                          long A231TBM32_STUDY_ID ,
                                          short A232TBM32_CRF_ID )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int7 ;
      GXv_int7 = new byte [4] ;
      Object[] GXv_Object8 ;
      GXv_Object8 = new Object [2] ;
      scmdbuf = "SELECT `TBM32_CRF_ITEM_CD`, `TBM32_CRF_ID`, `TBM32_STUDY_ID`, `TBM32_DEL_FLG`, `TBM32_CRF_ITEM_GRP_CD`," ;
      scmdbuf = scmdbuf + " `TBM32_CRF_ITEM_DIV`, `TBM32_CRF_ITEM_NM`, `TBM32_AUTH_LVL_MIN` FROM `TBM32_CRF_ITEM`" ;
      scmdbuf = scmdbuf + " WHERE (`TBM32_STUDY_ID` = ? and `TBM32_CRF_ID` = ?)" ;
      scmdbuf = scmdbuf + " and (`TBM32_DEL_FLG` = '0')" ;
      if ( GXutil.strcmp(AV26W_CHK_KBN, "1") == 0 )
      {
         sWhereString = sWhereString + " and (`TBM32_CRF_ITEM_CD` = ?)" ;
      }
      else
      {
         GXv_int7[2] = (byte)(1) ;
      }
      if ( GXutil.strcmp(AV26W_CHK_KBN, "2") == 0 )
      {
         sWhereString = sWhereString + " and (`TBM32_CRF_ITEM_DIV` = 'Group')" ;
      }
      if ( GXutil.strcmp(AV26W_CHK_KBN, "2") == 0 )
      {
         sWhereString = sWhereString + " and (`TBM32_CRF_ITEM_GRP_CD` = ?)" ;
      }
      else
      {
         GXv_int7[3] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TBM32_STUDY_ID`, `TBM32_CRF_ID`" ;
      GXv_Object8[0] = scmdbuf ;
      GXv_Object8[1] = GXv_int7 ;
      return GXv_Object8 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         com.genexus.internet.HttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 4 :
                  return conditional_P005W6(httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).longValue() , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).longValue() , ((Number) dynConstraints[10]).shortValue() );
      }
      return super.getDynamicStatement(cursor, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P005W2", "SELECT `TBM01_SYS_ID`, `TBM01_SYS_VALUE` FROM `TBM01_SYSTEM` WHERE `TBM01_SYS_ID` = '014' ORDER BY `TBM01_SYS_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P005W3", "SELECT `TAM04_AUTH_CD`, `TAM04_AUTH_LVL` FROM `TAM04_KNGN` WHERE `TAM04_AUTH_CD` = ? ORDER BY `TAM04_AUTH_CD`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P005W4", "SELECT `TBM32_DEL_FLG`, `TBM32_CRF_ITEM_DIV`, `TBM32_CRF_ID`, `TBM32_STUDY_ID`, `TBM32_CRF_ITEM_CD`, `TBM32_CRF_ITEM_NM`, `TBM32_CRF_ITEM_GRP_CD`, `TBM32_REQUIRED_INPUT_FLG`, `TBM32_TEXT_MAXLENGTH`, `TBM32_DECIMAL_DIGITS`, `TBM32_MIN_VALUE`, `TBM32_MAX_VALUE` FROM `TBM32_CRF_ITEM` WHERE (`TBM32_STUDY_ID` = ? and `TBM32_CRF_ID` = ?) AND (`TBM32_CRF_ITEM_DIV` <> 'Label') AND (`TBM32_CRF_ITEM_DIV` <> 'Line') AND (`TBM32_CRF_ITEM_DIV` <> 'Rectangle') AND (`TBM32_CRF_ITEM_DIV` <> 'Image') AND (`TBM32_CRF_ITEM_DIV` <> 'Brackets') AND (`TBM32_DEL_FLG` = '0') ORDER BY `TBM32_STUDY_ID`, `TBM32_CRF_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
         ,new ForEachCursor("P005W5", "SELECT `TBM33_STUDY_ID`, `TBM33_CRF_ID`, `TBM33_DEL_FLG`, `TBM33_COND_DIV`, `TBM33_CRF_ITEM_CD`, `TBM33_ENABLED_FLG`, `TBM33_ERR_DIV`, `TBM33_ERR_MSG`, `TBM33_EXPRESSION`, `TBM33_NUMERIC_RANGE_FLG`, `TBM33_REQUIRED_INPUT_FLG`, `TBM33_PRIOR_NO`, `TBM33_COND_NO` FROM `TBM33_CRF_COND` WHERE (`TBM33_COND_DIV` <> '2') AND (`TBM33_STUDY_ID` = ?) AND (`TBM33_CRF_ID` = ?) AND (`TBM33_DEL_FLG` = '0') ORDER BY `TBM33_PRIOR_NO` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
         ,new ForEachCursor("P005W6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
         ,new ForEachCursor("P005W7", "SELECT `TBM35_STUDY_ID`, `TBM35_CRF_ID`, `TBM35_CRF_ITEM_CD`, `TBM35_DEL_FLG`, `TBM35_DISPLAY_FLG`, `TBM35_STUDY_AUTH_CD` FROM `TBM35_CRF_ITEM_AUTH` WHERE (`TBM35_STUDY_ID` = ? and `TBM35_CRF_ID` = ? and `TBM35_CRF_ITEM_CD` = ?) AND (`TBM35_DEL_FLG` = '0') ORDER BY `TBM35_STUDY_ID`, `TBM35_CRF_ID`, `TBM35_CRF_ITEM_CD` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
         ,new ForEachCursor("P005W8", "SELECT `TBM32_REF_CRF_ITEM_CD`, `TBM32_REF_CRF_ID`, `TBM32_CRF_ITEM_CD`, `TBM32_CRF_ID`, `TBM32_STUDY_ID`, `TBM32_CRF_ITEM_DIV`, `TBM32_FIXED_VALUE` FROM `TBM32_CRF_ITEM` WHERE `TBM32_STUDY_ID` = ? and `TBM32_CRF_ID` = ? and `TBM32_CRF_ITEM_CD` = ? ORDER BY `TBM32_STUDY_ID`, `TBM32_CRF_ID`, `TBM32_CRF_ITEM_CD`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P005W9", "SELECT `TBT12_CRF_ID`, `TBT12_CRF_ITEM_GRP_CD`, `TBT12_SUBJECT_ID`, `TBT12_STUDY_ID`, `TBT12_CRF_VALUE`, `TBT12_CRF_ITEM_GRP_DIV` FROM `TBT12_CRF_RESULT` WHERE (`TBT12_STUDY_ID` = ? and `TBT12_SUBJECT_ID` = ? and `TBT12_CRF_ID` = ?) AND (`TBT12_CRF_ITEM_GRP_CD` = ?) ORDER BY `TBT12_STUDY_ID`, `TBT12_SUBJECT_ID`, `TBT12_CRF_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               break;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((byte[]) buf[1])[0] = rslt.getByte(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               break;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3) ;
               ((long[]) buf[5])[0] = rslt.getLong(4) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               break;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((byte[]) buf[20])[0] = rslt.getByte(12) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((short[]) buf[22])[0] = rslt.getShort(13) ;
               break;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
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
               break;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               break;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3) ;
               ((short[]) buf[5])[0] = rslt.getShort(4) ;
               ((long[]) buf[6])[0] = rslt.getLong(5) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               break;
            case 7 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((int[]) buf[2])[0] = rslt.getInt(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               break;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx ;
      switch ( cursor )
      {
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 2);
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
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[4]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[5]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[6], 50);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[7], 50);
               }
               break;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 50);
               break;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 50);
               break;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[3]).shortValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[5], 50);
               }
               break;
      }
   }

}

