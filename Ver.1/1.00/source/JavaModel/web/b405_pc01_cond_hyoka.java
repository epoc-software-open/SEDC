/*
               File: B405_PC01_COND_HYOKA
        Description: 条件式判定ロジック
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:41.6
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b405_pc01_cond_hyoka extends GXProcedure
{
   public b405_pc01_cond_hyoka( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b405_pc01_cond_hyoka.class ), "" );
   }

   public b405_pc01_cond_hyoka( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( long aP0 ,
                             int aP1 ,
                             String aP2 ,
                             short[] aP3 )
   {
      b405_pc01_cond_hyoka.this.AV10P_STUDY_ID = aP0;
      b405_pc01_cond_hyoka.this.AV11P_SUBJECT_ID = aP1;
      b405_pc01_cond_hyoka.this.AV8P_EXPRESSION = aP2;
      b405_pc01_cond_hyoka.this.aP4 = new String[] {""};
      initialize();
      privateExecute();
      return aP4[0];
   }

   public void execute( long aP0 ,
                        int aP1 ,
                        String aP2 ,
                        short[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( long aP0 ,
                             int aP1 ,
                             String aP2 ,
                             short[] aP3 ,
                             String[] aP4 )
   {
      b405_pc01_cond_hyoka.this.AV10P_STUDY_ID = aP0;
      b405_pc01_cond_hyoka.this.AV11P_SUBJECT_ID = aP1;
      b405_pc01_cond_hyoka.this.AV8P_EXPRESSION = aP2;
      b405_pc01_cond_hyoka.this.aP3 = aP3;
      b405_pc01_cond_hyoka.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Execute user subroutine: S14467 */
      S14467 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      GXt_char1 = AV50W_SYS_CRF_ID ;
      GXv_char2[0] = GXt_char1 ;
      new b806_pc01_get_ctrl_val(remoteHandle, context).execute( "004", GXv_char2) ;
      b405_pc01_cond_hyoka.this.GXt_char1 = GXv_char2[0] ;
      AV50W_SYS_CRF_ID = GXt_char1 ;
      AV28W_EnzansiAry.add("==", 0);
      AV28W_EnzansiAry.add("<=", 0);
      AV28W_EnzansiAry.add(">=", 0);
      AV28W_EnzansiAry.add(">", 0);
      AV28W_EnzansiAry.add("<", 0);
      AV28W_EnzansiAry.add("!=", 0);
      AV48W_NGEnzansiAry.add("<>", 0);
      AV48W_NGEnzansiAry.add("><", 0);
      AV48W_NGEnzansiAry.add(">>", 0);
      AV48W_NGEnzansiAry.add("<<", 0);
      AV48W_NGEnzansiAry.add("=>", 0);
      AV48W_NGEnzansiAry.add("=<", 0);
      AV48W_NGEnzansiAry.add("=!", 0);
      AV48W_NGEnzansiAry.add("===", 0);
      AV48W_NGEnzansiAry.add("!==", 0);
      AV48W_NGEnzansiAry.add("==!", 0);
      AV48W_NGEnzansiAry.add("<==", 0);
      AV48W_NGEnzansiAry.add(">==", 0);
      AV34W_ITEM_DIV_LIST.clear();
      /* Using cursor P004O2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A113TAS01_DEL_FLG = P004O2_A113TAS01_DEL_FLG[0] ;
         n113TAS01_DEL_FLG = P004O2_n113TAS01_DEL_FLG[0] ;
         A54TAS01_DATA_KIND = P004O2_A54TAS01_DATA_KIND[0] ;
         A19TAS01_ITEM_NM = P004O2_A19TAS01_ITEM_NM[0] ;
         n19TAS01_ITEM_NM = P004O2_n19TAS01_ITEM_NM[0] ;
         A151TAS01_CHAR_2 = P004O2_A151TAS01_CHAR_2[0] ;
         n151TAS01_CHAR_2 = P004O2_n151TAS01_CHAR_2[0] ;
         A55TAS01_ITEM_CD = P004O2_A55TAS01_ITEM_CD[0] ;
         if ( GxRegex.IsMatch(A151TAS01_CHAR_2,"^.1...1.*$") )
         {
            AV33W_ITEM_DIV = (SdtB402_SD04_ITEM_DIV)new SdtB402_SD04_ITEM_DIV(remoteHandle, context);
            AV33W_ITEM_DIV.setgxTv_SdtB402_SD04_ITEM_DIV_Crf_imte_div( A19TAS01_ITEM_NM );
            AV33W_ITEM_DIV.setgxTv_SdtB402_SD04_ITEM_DIV_Use_confing( A151TAS01_CHAR_2 );
            AV34W_ITEM_DIV_LIST.add(AV33W_ITEM_DIV, 0);
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV34W_ITEM_DIV_LIST.size() < 1 )
      {
         GXt_char1 = AV29W_ERRMSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00075", "B06", "", "", "", "", GXv_char2) ;
         b405_pc01_cond_hyoka.this.GXt_char1 = GXv_char2[0] ;
         AV29W_ERRMSG = GXt_char1 ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV37W_KAKKO_IN = AV8P_EXPRESSION ;
      AV37W_KAKKO_IN = GxRegex.Replace(AV37W_KAKKO_IN,"　","") ;
      AV37W_KAKKO_IN = GxRegex.Replace(AV37W_KAKKO_IN," ","") ;
      AV37W_KAKKO_IN = GxRegex.Replace(AV37W_KAKKO_IN,"\\n","") ;
      AV37W_KAKKO_IN = GxRegex.Replace(AV37W_KAKKO_IN,"\\r","") ;
      AV37W_KAKKO_IN = GxRegex.Replace(AV37W_KAKKO_IN,"\\t","") ;
      if ( (GXutil.strcmp("", AV37W_KAKKO_IN)==0) )
      {
         AV9W_RES = (short)(1) ;
      }
      else
      {
         /* Execute user subroutine: S1186 */
         S1186 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      cleanup();
   }

   public void S1186( )
   {
      /* 'SUB_KAKKO' Routine */
      AV38W_KAKKO_index1 = (short)(GXutil.strSearch( AV37W_KAKKO_IN, "(", 1)) ;
      AV38W_KAKKO_index1 = (short)(AV38W_KAKKO_index1+(GXutil.strSearch( AV37W_KAKKO_IN, ")", 1))) ;
      if ( AV38W_KAKKO_index1 == 0 )
      {
         AV18W_BUNKATU_IN = AV37W_KAKKO_IN ;
         /* Execute user subroutine: S121 */
         S121 ();
         if (returnInSub) return;
         AV9W_RES = AV19W_BUNKATU_OUT ;
      }
      else
      {
         AV35W_KAKKO_from = (short)(1) ;
         AV36W_KAKKO_hidari = (short)(0) ;
         AV40W_KAKKO_LAry.clear();
         AV31W_Index = (short)(1) ;
         while ( AV31W_Index <= GXutil.len( AV37W_KAKKO_IN) )
         {
            AV35W_KAKKO_from = (short)(GXutil.strSearch( AV37W_KAKKO_IN, "(", AV35W_KAKKO_from)) ;
            if ( AV35W_KAKKO_from > 0 )
            {
               AV40W_KAKKO_LAry.add((short)(AV35W_KAKKO_from), 0);
               AV35W_KAKKO_from = (short)(AV35W_KAKKO_from+1) ;
               AV36W_KAKKO_hidari = (short)(AV36W_KAKKO_hidari+1) ;
            }
            else
            {
               if (true) break;
            }
            AV31W_Index = (short)(AV31W_Index+1) ;
         }
         AV35W_KAKKO_from = (short)(1) ;
         AV41W_KAKKO_migi = (short)(0) ;
         AV43W_KAKKO_RAry.clear();
         AV31W_Index = (short)(1) ;
         while ( AV31W_Index <= GXutil.len( AV37W_KAKKO_IN) )
         {
            AV35W_KAKKO_from = (short)(GXutil.strSearch( AV37W_KAKKO_IN, ")", AV35W_KAKKO_from)) ;
            if ( AV35W_KAKKO_from > 0 )
            {
               AV43W_KAKKO_RAry.add((short)(AV35W_KAKKO_from), 0);
               AV35W_KAKKO_from = (short)(AV35W_KAKKO_from+1) ;
               AV41W_KAKKO_migi = (short)(AV41W_KAKKO_migi+1) ;
            }
            else
            {
               if (true) break;
            }
            AV31W_Index = (short)(AV31W_Index+1) ;
         }
         if ( AV36W_KAKKO_hidari != AV41W_KAKKO_migi )
         {
            GXt_char1 = AV29W_ERRMSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE01001", "", "", "", "", "", GXv_char2) ;
            b405_pc01_cond_hyoka.this.GXt_char1 = GXv_char2[0] ;
            AV29W_ERRMSG = GXt_char1 ;
         }
         if ( (GXutil.strcmp("", AV29W_ERRMSG)==0) )
         {
            AV39W_KAKKO_kaisi = ((Number) AV40W_KAKKO_LAry.elementAt(-1+AV40W_KAKKO_LAry.size())).shortValue() ;
            AV31W_Index = (short)(1) ;
            while ( AV31W_Index <= AV43W_KAKKO_RAry.size() )
            {
               if ( AV39W_KAKKO_kaisi < ((Number) AV43W_KAKKO_RAry.elementAt(-1+AV31W_Index)).shortValue() )
               {
                  AV42W_KAKKO_owari = ((Number) AV43W_KAKKO_RAry.elementAt(-1+AV31W_Index)).shortValue() ;
                  if (true) break;
               }
               AV31W_Index = (short)(AV31W_Index+1) ;
            }
            if ( AV42W_KAKKO_owari - AV39W_KAKKO_kaisi < 2 )
            {
               GXt_char1 = AV29W_ERRMSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AE01002", "", "", "", "", "", GXv_char2) ;
               b405_pc01_cond_hyoka.this.GXt_char1 = GXv_char2[0] ;
               AV29W_ERRMSG = GXt_char1 ;
            }
         }
         if ( (GXutil.strcmp("", AV29W_ERRMSG)==0) )
         {
            AV44W_KAKKO_t1 = GXutil.substring( AV37W_KAKKO_IN, 1, AV39W_KAKKO_kaisi-1) ;
            AV45W_KAKKO_t2 = GXutil.substring( AV37W_KAKKO_IN, AV39W_KAKKO_kaisi+1, AV42W_KAKKO_owari-AV39W_KAKKO_kaisi-1) ;
            AV46W_KAKKO_t3 = GXutil.substring( AV37W_KAKKO_IN, AV42W_KAKKO_owari+1, GXutil.len( AV37W_KAKKO_IN)-AV42W_KAKKO_owari) ;
            AV18W_BUNKATU_IN = AV45W_KAKKO_t2 ;
            /* Execute user subroutine: S121 */
            S121 ();
            if (returnInSub) return;
            AV45W_KAKKO_t2 = GXutil.trim( GXutil.str( AV19W_BUNKATU_OUT, 10, 0)) ;
            AV37W_KAKKO_IN = AV44W_KAKKO_t1 + AV45W_KAKKO_t2 + AV46W_KAKKO_t3 ;
            /* Execute user subroutine: S1186 */
            S1186 ();
            if (returnInSub) return;
         }
      }
   }

   public void S121( )
   {
      /* 'SUB_BUNKATU' Routine */
      AV19W_BUNKATU_OUT = (byte)(0) ;
      AV13W_BUNKATU_Ary0 = new GxObjectCollection(String.class, "internal", "", GxRegex.Split(AV18W_BUNKATU_IN,"\\|or\\|")) ;
      AV54GXV1 = 1 ;
      while ( AV54GXV1 <= AV13W_BUNKATU_Ary0.size() )
      {
         AV14W_BUNKATU_Ary0_ITEM = (String)AV13W_BUNKATU_Ary0.elementAt(-1+AV54GXV1) ;
         AV15W_BUNKATU_Ary1 = new GxObjectCollection(String.class, "internal", "", GxRegex.Split(AV14W_BUNKATU_Ary0_ITEM,"\\|and\\|")) ;
         if ( AV19W_BUNKATU_OUT != -1 )
         {
            AV16W_BUNKATU_Ary1_INDEX = (short)(0) ;
            AV55GXV2 = 1 ;
            while ( AV55GXV2 <= AV15W_BUNKATU_Ary1.size() )
            {
               AV17W_BUNKATU_Ary1_ITEM = (String)AV15W_BUNKATU_Ary1.elementAt(-1+AV55GXV2) ;
               AV16W_BUNKATU_Ary1_INDEX = (short)(AV16W_BUNKATU_Ary1_INDEX+1) ;
               AV24W_Decision_IN = AV17W_BUNKATU_Ary1_ITEM ;
               /* Execute user subroutine: S131 */
               S131 ();
               if (returnInSub) return;
               if ( AV25W_Decision_OUT == -1 )
               {
                  AV19W_BUNKATU_OUT = (byte)(-1) ;
                  if (true) break;
               }
               if ( AV16W_BUNKATU_Ary1_INDEX == 1 )
               {
                  AV20W_BUNKATU_tmp = AV25W_Decision_OUT ;
               }
               else
               {
                  AV20W_BUNKATU_tmp = (int)(AV25W_Decision_OUT*AV20W_BUNKATU_tmp) ;
               }
               AV55GXV2 = (int)(AV55GXV2+1) ;
            }
         }
         AV19W_BUNKATU_OUT = (byte)(AV19W_BUNKATU_OUT+AV20W_BUNKATU_tmp) ;
         AV54GXV1 = (int)(AV54GXV1+1) ;
      }
   }

   public void S131( )
   {
      /* 'SUB_DECISION' Routine */
      AV25W_Decision_OUT = (byte)(0) ;
      if ( GxRegex.IsMatch(AV24W_Decision_IN,"^[-+]?\\d+$") )
      {
         AV25W_Decision_OUT = (byte)(GXutil.lval( AV24W_Decision_IN)) ;
      }
      else
      {
         AV32W_index1 = (short)(GXutil.strSearch( AV24W_Decision_IN, "(", 1)) ;
         if ( AV32W_index1 > 0 )
         {
            AV25W_Decision_OUT = (byte)(-1) ;
         }
         if ( AV25W_Decision_OUT == 0 )
         {
            AV32W_index1 = (short)(GXutil.strSearch( AV24W_Decision_IN, ")", 1)) ;
            if ( AV32W_index1 > 0 )
            {
               AV25W_Decision_OUT = (byte)(-1) ;
            }
         }
         if ( AV25W_Decision_OUT == 0 )
         {
            AV56GXV3 = 1 ;
            while ( AV56GXV3 <= AV48W_NGEnzansiAry.size() )
            {
               AV27W_Enzansi_ITEM = (String)AV48W_NGEnzansiAry.elementAt(-1+AV56GXV3) ;
               AV32W_index1 = (short)(GXutil.strSearch( AV24W_Decision_IN, AV27W_Enzansi_ITEM, 1)) ;
               if ( AV32W_index1 > 0 )
               {
                  GXt_char1 = AV29W_ERRMSG ;
                  GXv_char2[0] = GXt_char1 ;
                  new a805_pc01_msg_get(remoteHandle, context).execute( "AE01003", "", "", "", "", "", GXv_char2) ;
                  b405_pc01_cond_hyoka.this.GXt_char1 = GXv_char2[0] ;
                  AV29W_ERRMSG = GXt_char1 ;
                  AV25W_Decision_OUT = (byte)(-1) ;
                  if (true) break;
               }
               AV56GXV3 = (int)(AV56GXV3+1) ;
            }
         }
         AV26W_Enzansi = "" ;
         if ( AV25W_Decision_OUT == 0 )
         {
            AV57GXV4 = 1 ;
            while ( AV57GXV4 <= AV28W_EnzansiAry.size() )
            {
               AV27W_Enzansi_ITEM = (String)AV28W_EnzansiAry.elementAt(-1+AV57GXV4) ;
               AV32W_index1 = (short)(GXutil.strSearch( AV24W_Decision_IN, AV27W_Enzansi_ITEM, 1)) ;
               if ( AV32W_index1 > 0 )
               {
                  AV26W_Enzansi = AV27W_Enzansi_ITEM ;
                  if (true) break;
               }
               AV57GXV4 = (int)(AV57GXV4+1) ;
            }
            if ( (GXutil.strcmp("", AV26W_Enzansi)==0) )
            {
               GXt_char1 = AV29W_ERRMSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AE01004", "", "", "", "", "", GXv_char2) ;
               b405_pc01_cond_hyoka.this.GXt_char1 = GXv_char2[0] ;
               AV29W_ERRMSG = GXt_char1 ;
               AV25W_Decision_OUT = (byte)(-1) ;
            }
         }
         if ( AV25W_Decision_OUT == 0 )
         {
            AV12W_Ary = new GxObjectCollection(String.class, "internal", "", GxRegex.Split(AV24W_Decision_IN,AV26W_Enzansi)) ;
            if ( AV12W_Ary.size() < 2 )
            {
               GXt_char1 = AV29W_ERRMSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AE01011", "", "", "", "", "", GXv_char2) ;
               b405_pc01_cond_hyoka.this.GXt_char1 = GXv_char2[0] ;
               AV29W_ERRMSG = GXt_char1 ;
               AV25W_Decision_OUT = (byte)(-1) ;
            }
         }
         if ( AV25W_Decision_OUT == 0 )
         {
            if ( GXutil.strSearch( (String)AV12W_Ary.elementAt(-1+2), "@", 1) > 0 )
            {
               GXt_char1 = AV29W_ERRMSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AE01005", "", "", "", "", "", GXv_char2) ;
               b405_pc01_cond_hyoka.this.GXt_char1 = GXv_char2[0] ;
               AV29W_ERRMSG = GXt_char1 ;
               AV25W_Decision_OUT = (byte)(-1) ;
            }
         }
         if ( AV25W_Decision_OUT == 0 )
         {
            if ( GXutil.strSearch( (String)AV12W_Ary.elementAt(-1+1), "@", 1) == 0 )
            {
               GXt_char1 = AV29W_ERRMSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AE01006", "", "", "", "", "", GXv_char2) ;
               b405_pc01_cond_hyoka.this.GXt_char1 = GXv_char2[0] ;
               AV29W_ERRMSG = GXt_char1 ;
               AV25W_Decision_OUT = (byte)(-1) ;
            }
         }
         if ( AV25W_Decision_OUT == 0 )
         {
            AV21W_CRF_ITEM_CD = GXutil.strReplace( (String)AV12W_Ary.elementAt(-1+1), "@", "") ;
            AV58GXLvl309 = (byte)(0) ;
            /* Using cursor P004O3 */
            pr_default.execute(1, new Object[] {new Long(AV10P_STUDY_ID), AV50W_SYS_CRF_ID, AV21W_CRF_ITEM_CD});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A233TBM32_CRF_ITEM_CD = P004O3_A233TBM32_CRF_ITEM_CD[0] ;
               A232TBM32_CRF_ID = P004O3_A232TBM32_CRF_ID[0] ;
               A231TBM32_STUDY_ID = P004O3_A231TBM32_STUDY_ID[0] ;
               A235TBM32_CRF_ITEM_DIV = P004O3_A235TBM32_CRF_ITEM_DIV[0] ;
               n235TBM32_CRF_ITEM_DIV = P004O3_n235TBM32_CRF_ITEM_DIV[0] ;
               AV58GXLvl309 = (byte)(1) ;
               AV23W_DATA_TYPE = "C" ;
               AV59GXV5 = 1 ;
               while ( AV59GXV5 <= AV34W_ITEM_DIV_LIST.size() )
               {
                  AV33W_ITEM_DIV = (SdtB402_SD04_ITEM_DIV)((SdtB402_SD04_ITEM_DIV)AV34W_ITEM_DIV_LIST.elementAt(-1+AV59GXV5));
                  if ( GXutil.strcmp(A235TBM32_CRF_ITEM_DIV, AV33W_ITEM_DIV.getgxTv_SdtB402_SD04_ITEM_DIV_Crf_imte_div()) == 0 )
                  {
                     AV23W_DATA_TYPE = "N" ;
                     AV30W_FLG = "1" ;
                     if (true) break;
                  }
                  AV59GXV5 = (int)(AV59GXV5+1) ;
               }
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               pr_default.readNext(1);
            }
            pr_default.close(1);
            if ( AV58GXLvl309 == 0 )
            {
               GXt_char1 = AV29W_ERRMSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AE01010", AV21W_CRF_ITEM_CD, "", "", "", "", GXv_char2) ;
               b405_pc01_cond_hyoka.this.GXt_char1 = GXv_char2[0] ;
               AV29W_ERRMSG = GXt_char1 ;
               AV25W_Decision_OUT = (byte)(-1) ;
            }
            AV60GXLvl333 = (byte)(0) ;
            /* Using cursor P004O4 */
            pr_default.execute(2, new Object[] {new Long(AV10P_STUDY_ID), new Integer(AV11P_SUBJECT_ID), AV50W_SYS_CRF_ID, AV21W_CRF_ITEM_CD});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A319TBT12_CRF_ITEM_GRP_CD = P004O4_A319TBT12_CRF_ITEM_GRP_CD[0] ;
               A317TBT12_CRF_ID = P004O4_A317TBT12_CRF_ID[0] ;
               A316TBT12_SUBJECT_ID = P004O4_A316TBT12_SUBJECT_ID[0] ;
               A315TBT12_STUDY_ID = P004O4_A315TBT12_STUDY_ID[0] ;
               A320TBT12_CRF_VALUE = P004O4_A320TBT12_CRF_VALUE[0] ;
               n320TBT12_CRF_VALUE = P004O4_n320TBT12_CRF_VALUE[0] ;
               A318TBT12_CRF_ITEM_GRP_DIV = P004O4_A318TBT12_CRF_ITEM_GRP_DIV[0] ;
               AV60GXLvl333 = (byte)(1) ;
               AV22W_CRF_VALUE = A320TBT12_CRF_VALUE ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            if ( AV60GXLvl333 == 0 )
            {
               AV22W_CRF_VALUE = "" ;
               if ( GXutil.strcmp(AV23W_DATA_TYPE, "N") == 0 )
               {
                  AV22W_CRF_VALUE = "0" ;
               }
            }
         }
         if ( AV25W_Decision_OUT == 0 )
         {
            if ( GXutil.strcmp(AV23W_DATA_TYPE, "C") == 0 )
            {
               if ( ! ((GXutil.strcmp(AV26W_Enzansi, "==")==0)||(GXutil.strcmp(AV26W_Enzansi, "!=")==0)) )
               {
                  GXt_char1 = AV29W_ERRMSG ;
                  GXv_char2[0] = GXt_char1 ;
                  new a805_pc01_msg_get(remoteHandle, context).execute( "AE01007", "", "", "", "", "", GXv_char2) ;
                  b405_pc01_cond_hyoka.this.GXt_char1 = GXv_char2[0] ;
                  AV29W_ERRMSG = GXt_char1 ;
                  AV25W_Decision_OUT = (byte)(-1) ;
               }
            }
         }
         if ( GXutil.strcmp(AV23W_DATA_TYPE, "N") == 0 )
         {
            if ( AV25W_Decision_OUT == 0 )
            {
               if ( ! GxRegex.IsMatch((String)AV12W_Ary.elementAt(-1+2),"^[-+]?\\d+$") )
               {
                  GXt_char1 = AV29W_ERRMSG ;
                  GXv_char2[0] = GXt_char1 ;
                  new a805_pc01_msg_get(remoteHandle, context).execute( "AE01008", (String)AV12W_Ary.elementAt(-1+2), "", "", "", "", GXv_char2) ;
                  b405_pc01_cond_hyoka.this.GXt_char1 = GXv_char2[0] ;
                  AV29W_ERRMSG = GXt_char1 ;
                  AV25W_Decision_OUT = (byte)(-1) ;
               }
            }
            if ( AV25W_Decision_OUT == 0 )
            {
               if ( ! GxRegex.IsMatch(AV22W_CRF_VALUE,"^[-+]?\\d+$") )
               {
                  GXt_char1 = AV29W_ERRMSG ;
                  GXv_char2[0] = GXt_char1 ;
                  new a805_pc01_msg_get(remoteHandle, context).execute( "AE01009", "", "", "", "", "", GXv_char2) ;
                  b405_pc01_cond_hyoka.this.GXt_char1 = GXv_char2[0] ;
                  AV29W_ERRMSG = GXt_char1 ;
                  AV25W_Decision_OUT = (byte)(-1) ;
               }
            }
         }
         if ( AV25W_Decision_OUT == 0 )
         {
            if ( GXutil.strcmp(AV26W_Enzansi, "==") == 0 )
            {
               if ( GXutil.strcmp((String)AV12W_Ary.elementAt(-1+2), "|null|") == 0 )
               {
                  if ( (GXutil.strcmp("", AV22W_CRF_VALUE)==0) )
                  {
                     AV47W_kekka = true ;
                  }
                  else
                  {
                     AV47W_kekka = false ;
                  }
               }
               else if ( GXutil.strcmp(AV23W_DATA_TYPE, "C") == 0 )
               {
                  if ( GXutil.strcmp(GXutil.trim( AV22W_CRF_VALUE), (String)AV12W_Ary.elementAt(-1+2)) == 0 )
                  {
                     AV47W_kekka = true ;
                  }
                  else
                  {
                     AV47W_kekka = false ;
                  }
               }
               else if ( GXutil.strcmp(AV23W_DATA_TYPE, "N") == 0 )
               {
                  if ( GXutil.val( GXutil.trim( AV22W_CRF_VALUE), ".") == GXutil.val( (String)AV12W_Ary.elementAt(-1+2), ".") )
                  {
                     AV47W_kekka = true ;
                  }
                  else
                  {
                     AV47W_kekka = false ;
                  }
               }
            }
            else if ( GXutil.strcmp(AV26W_Enzansi, "!=") == 0 )
            {
               if ( GXutil.strcmp((String)AV12W_Ary.elementAt(-1+2), "|null|") == 0 )
               {
                  if ( ! (GXutil.strcmp("", AV22W_CRF_VALUE)==0) )
                  {
                     AV47W_kekka = true ;
                  }
                  else
                  {
                     AV47W_kekka = false ;
                  }
               }
               else if ( GXutil.strcmp(AV23W_DATA_TYPE, "C") == 0 )
               {
                  if ( GXutil.strcmp(GXutil.trim( AV22W_CRF_VALUE), (String)AV12W_Ary.elementAt(-1+2)) != 0 )
                  {
                     AV47W_kekka = true ;
                  }
                  else
                  {
                     AV47W_kekka = false ;
                  }
               }
               else if ( GXutil.strcmp(AV23W_DATA_TYPE, "N") == 0 )
               {
                  if ( GXutil.val( GXutil.trim( AV22W_CRF_VALUE), ".") != GXutil.val( (String)AV12W_Ary.elementAt(-1+2), ".") )
                  {
                     AV47W_kekka = true ;
                  }
                  else
                  {
                     AV47W_kekka = false ;
                  }
               }
            }
            else if ( GXutil.strcmp(AV26W_Enzansi, ">") == 0 )
            {
               if ( GXutil.val( GXutil.trim( AV22W_CRF_VALUE), ".") > GXutil.val( (String)AV12W_Ary.elementAt(-1+2), ".") )
               {
                  AV47W_kekka = true ;
               }
               else
               {
                  AV47W_kekka = false ;
               }
            }
            else if ( GXutil.strcmp(AV26W_Enzansi, "<") == 0 )
            {
               if ( GXutil.val( GXutil.trim( AV22W_CRF_VALUE), ".") < GXutil.val( (String)AV12W_Ary.elementAt(-1+2), ".") )
               {
                  AV47W_kekka = true ;
               }
               else
               {
                  AV47W_kekka = false ;
               }
            }
            else if ( GXutil.strcmp(AV26W_Enzansi, ">=") == 0 )
            {
               if ( GXutil.val( GXutil.trim( AV22W_CRF_VALUE), ".") >= GXutil.val( (String)AV12W_Ary.elementAt(-1+2), ".") )
               {
                  AV47W_kekka = true ;
               }
               else
               {
                  AV47W_kekka = false ;
               }
            }
            else if ( GXutil.strcmp(AV26W_Enzansi, "<=") == 0 )
            {
               if ( GXutil.val( GXutil.trim( AV22W_CRF_VALUE), ".") <= GXutil.val( (String)AV12W_Ary.elementAt(-1+2), ".") )
               {
                  AV47W_kekka = true ;
               }
               else
               {
                  AV47W_kekka = false ;
               }
            }
            if ( AV47W_kekka )
            {
               AV25W_Decision_OUT = (byte)(1) ;
            }
            else
            {
               AV25W_Decision_OUT = (byte)(0) ;
            }
         }
      }
   }

   public void S14467( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
   }

   public void S15485( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV61Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "b405_pc01_cond_hyoka");
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   protected void cleanup( )
   {
      this.aP3[0] = b405_pc01_cond_hyoka.this.AV9W_RES;
      this.aP4[0] = b405_pc01_cond_hyoka.this.AV29W_ERRMSG;
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
                  /* Execute user subroutine: S15485 */
                  S15485 ();
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
      AV29W_ERRMSG = "" ;
      AV50W_SYS_CRF_ID = "" ;
      AV28W_EnzansiAry = new GxObjectCollection(String.class, "internal", "");
      AV48W_NGEnzansiAry = new GxObjectCollection(String.class, "internal", "");
      AV34W_ITEM_DIV_LIST = new GxObjectCollection(SdtB402_SD04_ITEM_DIV.class, "B402_SD04_ITEM_DIV", "SmartEDC_SHIZUOKA", remoteHandle);
      scmdbuf = "" ;
      P004O2_A113TAS01_DEL_FLG = new String[] {""} ;
      P004O2_n113TAS01_DEL_FLG = new boolean[] {false} ;
      P004O2_A54TAS01_DATA_KIND = new String[] {""} ;
      P004O2_A19TAS01_ITEM_NM = new String[] {""} ;
      P004O2_n19TAS01_ITEM_NM = new boolean[] {false} ;
      P004O2_A151TAS01_CHAR_2 = new String[] {""} ;
      P004O2_n151TAS01_CHAR_2 = new boolean[] {false} ;
      P004O2_A55TAS01_ITEM_CD = new String[] {""} ;
      A113TAS01_DEL_FLG = "" ;
      A54TAS01_DATA_KIND = "" ;
      A19TAS01_ITEM_NM = "" ;
      A151TAS01_CHAR_2 = "" ;
      A55TAS01_ITEM_CD = "" ;
      AV33W_ITEM_DIV = new SdtB402_SD04_ITEM_DIV(remoteHandle, context);
      AV37W_KAKKO_IN = "" ;
      AV18W_BUNKATU_IN = "" ;
      AV40W_KAKKO_LAry = new GxObjectCollection(Short.class, "internal", "");
      AV43W_KAKKO_RAry = new GxObjectCollection(Short.class, "internal", "");
      AV44W_KAKKO_t1 = "" ;
      AV45W_KAKKO_t2 = "" ;
      AV46W_KAKKO_t3 = "" ;
      AV13W_BUNKATU_Ary0 = new GxObjectCollection(String.class, "internal", "");
      AV14W_BUNKATU_Ary0_ITEM = "" ;
      AV15W_BUNKATU_Ary1 = new GxObjectCollection(String.class, "internal", "");
      AV17W_BUNKATU_Ary1_ITEM = "" ;
      AV24W_Decision_IN = "" ;
      AV27W_Enzansi_ITEM = "" ;
      AV26W_Enzansi = "" ;
      AV12W_Ary = new GxObjectCollection(String.class, "internal", "");
      AV21W_CRF_ITEM_CD = "" ;
      P004O3_A233TBM32_CRF_ITEM_CD = new String[] {""} ;
      P004O3_A232TBM32_CRF_ID = new short[1] ;
      P004O3_A231TBM32_STUDY_ID = new long[1] ;
      P004O3_A235TBM32_CRF_ITEM_DIV = new String[] {""} ;
      P004O3_n235TBM32_CRF_ITEM_DIV = new boolean[] {false} ;
      A233TBM32_CRF_ITEM_CD = "" ;
      A235TBM32_CRF_ITEM_DIV = "" ;
      AV23W_DATA_TYPE = "" ;
      AV30W_FLG = "" ;
      P004O4_A319TBT12_CRF_ITEM_GRP_CD = new String[] {""} ;
      P004O4_A317TBT12_CRF_ID = new short[1] ;
      P004O4_A316TBT12_SUBJECT_ID = new int[1] ;
      P004O4_A315TBT12_STUDY_ID = new long[1] ;
      P004O4_A320TBT12_CRF_VALUE = new String[] {""} ;
      P004O4_n320TBT12_CRF_VALUE = new boolean[] {false} ;
      P004O4_A318TBT12_CRF_ITEM_GRP_DIV = new String[] {""} ;
      A319TBT12_CRF_ITEM_GRP_CD = "" ;
      A320TBT12_CRF_VALUE = "" ;
      A318TBT12_CRF_ITEM_GRP_DIV = "" ;
      AV22W_CRF_VALUE = "" ;
      GXv_char2 = new String [1] ;
      AV61Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      GXt_char1 = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b405_pc01_cond_hyoka__default(),
         new Object[] {
             new Object[] {
            P004O2_A113TAS01_DEL_FLG, P004O2_n113TAS01_DEL_FLG, P004O2_A54TAS01_DATA_KIND, P004O2_A19TAS01_ITEM_NM, P004O2_n19TAS01_ITEM_NM, P004O2_A151TAS01_CHAR_2, P004O2_n151TAS01_CHAR_2, P004O2_A55TAS01_ITEM_CD
            }
            , new Object[] {
            P004O3_A233TBM32_CRF_ITEM_CD, P004O3_A232TBM32_CRF_ID, P004O3_A231TBM32_STUDY_ID, P004O3_A235TBM32_CRF_ITEM_DIV, P004O3_n235TBM32_CRF_ITEM_DIV
            }
            , new Object[] {
            P004O4_A319TBT12_CRF_ITEM_GRP_CD, P004O4_A317TBT12_CRF_ID, P004O4_A316TBT12_SUBJECT_ID, P004O4_A315TBT12_STUDY_ID, P004O4_A320TBT12_CRF_VALUE, P004O4_n320TBT12_CRF_VALUE, P004O4_A318TBT12_CRF_ITEM_GRP_DIV
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV61Pgmname = "B405_PC01_COND_HYOKA" ;
      /* GeneXus formulas. */
      AV61Pgmname = "B405_PC01_COND_HYOKA" ;
      Gx_err = (short)(0) ;
   }

   private byte AV19W_BUNKATU_OUT ;
   private byte AV25W_Decision_OUT ;
   private byte AV58GXLvl309 ;
   private byte AV60GXLvl333 ;
   private short AV9W_RES ;
   private short AV38W_KAKKO_index1 ;
   private short AV35W_KAKKO_from ;
   private short AV36W_KAKKO_hidari ;
   private short AV31W_Index ;
   private short AV41W_KAKKO_migi ;
   private short AV39W_KAKKO_kaisi ;
   private short AV42W_KAKKO_owari ;
   private short AV16W_BUNKATU_Ary1_INDEX ;
   private short AV32W_index1 ;
   private short A232TBM32_CRF_ID ;
   private short A317TBT12_CRF_ID ;
   private short Gx_err ;
   private int AV11P_SUBJECT_ID ;
   private int AV54GXV1 ;
   private int AV55GXV2 ;
   private int AV20W_BUNKATU_tmp ;
   private int AV56GXV3 ;
   private int AV57GXV4 ;
   private int AV59GXV5 ;
   private int A316TBT12_SUBJECT_ID ;
   private int GXActiveErrHndl ;
   private long AV10P_STUDY_ID ;
   private long A231TBM32_STUDY_ID ;
   private long A315TBT12_STUDY_ID ;
   private String scmdbuf ;
   private String AV23W_DATA_TYPE ;
   private String GXv_char2[] ;
   private String AV61Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String GXt_char1 ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private boolean n113TAS01_DEL_FLG ;
   private boolean n19TAS01_ITEM_NM ;
   private boolean n151TAS01_CHAR_2 ;
   private boolean n235TBM32_CRF_ITEM_DIV ;
   private boolean n320TBT12_CRF_VALUE ;
   private boolean AV47W_kekka ;
   private String AV8P_EXPRESSION ;
   private String AV29W_ERRMSG ;
   private String AV50W_SYS_CRF_ID ;
   private String A113TAS01_DEL_FLG ;
   private String A54TAS01_DATA_KIND ;
   private String A19TAS01_ITEM_NM ;
   private String A151TAS01_CHAR_2 ;
   private String A55TAS01_ITEM_CD ;
   private String AV37W_KAKKO_IN ;
   private String AV18W_BUNKATU_IN ;
   private String AV44W_KAKKO_t1 ;
   private String AV45W_KAKKO_t2 ;
   private String AV46W_KAKKO_t3 ;
   private String AV14W_BUNKATU_Ary0_ITEM ;
   private String AV17W_BUNKATU_Ary1_ITEM ;
   private String AV24W_Decision_IN ;
   private String AV27W_Enzansi_ITEM ;
   private String AV26W_Enzansi ;
   private String AV21W_CRF_ITEM_CD ;
   private String A233TBM32_CRF_ITEM_CD ;
   private String A235TBM32_CRF_ITEM_DIV ;
   private String AV30W_FLG ;
   private String A319TBT12_CRF_ITEM_GRP_CD ;
   private String A320TBT12_CRF_VALUE ;
   private String A318TBT12_CRF_ITEM_GRP_DIV ;
   private String AV22W_CRF_VALUE ;
   private short[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P004O2_A113TAS01_DEL_FLG ;
   private boolean[] P004O2_n113TAS01_DEL_FLG ;
   private String[] P004O2_A54TAS01_DATA_KIND ;
   private String[] P004O2_A19TAS01_ITEM_NM ;
   private boolean[] P004O2_n19TAS01_ITEM_NM ;
   private String[] P004O2_A151TAS01_CHAR_2 ;
   private boolean[] P004O2_n151TAS01_CHAR_2 ;
   private String[] P004O2_A55TAS01_ITEM_CD ;
   private String[] P004O3_A233TBM32_CRF_ITEM_CD ;
   private short[] P004O3_A232TBM32_CRF_ID ;
   private long[] P004O3_A231TBM32_STUDY_ID ;
   private String[] P004O3_A235TBM32_CRF_ITEM_DIV ;
   private boolean[] P004O3_n235TBM32_CRF_ITEM_DIV ;
   private String[] P004O4_A319TBT12_CRF_ITEM_GRP_CD ;
   private short[] P004O4_A317TBT12_CRF_ID ;
   private int[] P004O4_A316TBT12_SUBJECT_ID ;
   private long[] P004O4_A315TBT12_STUDY_ID ;
   private String[] P004O4_A320TBT12_CRF_VALUE ;
   private boolean[] P004O4_n320TBT12_CRF_VALUE ;
   private String[] P004O4_A318TBT12_CRF_ITEM_GRP_DIV ;
   private GxObjectCollection AV28W_EnzansiAry ;
   private GxObjectCollection AV48W_NGEnzansiAry ;
   private GxObjectCollection AV34W_ITEM_DIV_LIST ;
   private GxObjectCollection AV40W_KAKKO_LAry ;
   private GxObjectCollection AV43W_KAKKO_RAry ;
   private GxObjectCollection AV13W_BUNKATU_Ary0 ;
   private GxObjectCollection AV15W_BUNKATU_Ary1 ;
   private GxObjectCollection AV12W_Ary ;
   private SdtB402_SD04_ITEM_DIV AV33W_ITEM_DIV ;
}

final  class b405_pc01_cond_hyoka__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P004O2", "SELECT `TAS01_DEL_FLG`, `TAS01_DATA_KIND`, `TAS01_ITEM_NM`, `TAS01_CHAR_2`, `TAS01_ITEM_CD` FROM `TAS01_CDNM` WHERE (`TAS01_DATA_KIND` = 'B06') AND (`TAS01_DEL_FLG` = '0') ORDER BY `TAS01_DATA_KIND` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
         ,new ForEachCursor("P004O3", "SELECT `TBM32_CRF_ITEM_CD`, `TBM32_CRF_ID`, `TBM32_STUDY_ID`, `TBM32_CRF_ITEM_DIV` FROM `TBM32_CRF_ITEM` WHERE (`TBM32_STUDY_ID` = ?) AND (`TBM32_CRF_ID` = ?) AND (`TBM32_CRF_ITEM_CD` = ?) ORDER BY `TBM32_STUDY_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P004O4", "SELECT `TBT12_CRF_ITEM_GRP_CD`, `TBT12_CRF_ID`, `TBT12_SUBJECT_ID`, `TBT12_STUDY_ID`, `TBT12_CRF_VALUE`, `TBT12_CRF_ITEM_GRP_DIV` FROM `TBT12_CRF_RESULT` WHERE (`TBT12_STUDY_ID` = ? and `TBT12_SUBJECT_ID` = ?) AND (`TBT12_CRF_ID` = ?) AND (`TBT12_CRF_ITEM_GRP_CD` = ?) ORDER BY `TBT12_STUDY_ID`, `TBT12_SUBJECT_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               break;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               break;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
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
      switch ( cursor )
      {
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 100);
               stmt.setVarchar(3, (String)parms[2], 50);
               break;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setVarchar(3, (String)parms[2], 100);
               stmt.setVarchar(4, (String)parms[3], 50);
               break;
      }
   }

}

