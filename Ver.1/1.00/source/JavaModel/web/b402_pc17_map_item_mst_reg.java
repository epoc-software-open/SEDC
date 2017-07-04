/*
               File: B402_PC17_MAP_ITEM_MST_REG
        Description: マッピング済部品マスタ登録
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:56:0.47
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b402_pc17_map_item_mst_reg extends GXProcedure
{
   public b402_pc17_map_item_mst_reg( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b402_pc17_map_item_mst_reg.class ), "" );
   }

   public b402_pc17_map_item_mst_reg( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public GxObjectCollection executeUdp( long aP0 ,
                                         String aP1 ,
                                         String aP2 ,
                                         short[] aP3 )
   {
      b402_pc17_map_item_mst_reg.this.AV12P_STUDY_ID = aP0;
      b402_pc17_map_item_mst_reg.this.AV11P_FILE_NAME = aP1;
      b402_pc17_map_item_mst_reg.this.AV39P_MOJI_CD = aP2;
      b402_pc17_map_item_mst_reg.this.aP4 = new GxObjectCollection[] {new GxObjectCollection()};
      initialize();
      privateExecute();
      return aP4[0];
   }

   public void execute( long aP0 ,
                        String aP1 ,
                        String aP2 ,
                        short[] aP3 ,
                        GxObjectCollection[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( long aP0 ,
                             String aP1 ,
                             String aP2 ,
                             short[] aP3 ,
                             GxObjectCollection[] aP4 )
   {
      b402_pc17_map_item_mst_reg.this.AV12P_STUDY_ID = aP0;
      b402_pc17_map_item_mst_reg.this.AV11P_FILE_NAME = aP1;
      b402_pc17_map_item_mst_reg.this.AV39P_MOJI_CD = aP2;
      b402_pc17_map_item_mst_reg.this.aP3 = aP3;
      b402_pc17_map_item_mst_reg.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10C_APP_ID = "B402" ;
      /* Execute user subroutine: S19503 */
      S19503 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV36W_RTN_CD = (short)(0) ;
      AV37W_RTN_MSG.clear();
      if ( AV36W_RTN_CD == 0 )
      {
         /* Execute user subroutine: S1148 */
         S1148 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      if ( AV36W_RTN_CD == 0 )
      {
         /* Execute user subroutine: S12103 */
         S12103 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      if ( AV36W_RTN_CD == 0 )
      {
         /* Execute user subroutine: S15156 */
         S15156 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      cleanup();
   }

   public void S1148( )
   {
      /* 'SUB_SETTING' Routine */
      AV16W_CNT = 0 ;
      AV9BC_MAP_ITEM_C.clear();
      /* Optimized DELETE. */
      Gx_ope = "Delete" ;
      Gx_etb = "TBM24_MAP_ITEM" ;
      /* Using cursor P004D2 */
      pr_default.execute(0, new Object[] {new Long(AV12P_STUDY_ID)});
      /* End optimized DELETE. */
      AV30W_ITEM_DIV_LIST.clear();
      Gx_ope = "Fetch" ;
      Gx_etb = "TAS01_CDNM" ;
      /* Using cursor P004D3 */
      pr_default.execute(1);
      while ( (pr_default.getStatus(1) != 101) )
      {
         A113TAS01_DEL_FLG = P004D3_A113TAS01_DEL_FLG[0] ;
         n113TAS01_DEL_FLG = P004D3_n113TAS01_DEL_FLG[0] ;
         A54TAS01_DATA_KIND = P004D3_A54TAS01_DATA_KIND[0] ;
         A19TAS01_ITEM_NM = P004D3_A19TAS01_ITEM_NM[0] ;
         n19TAS01_ITEM_NM = P004D3_n19TAS01_ITEM_NM[0] ;
         A151TAS01_CHAR_2 = P004D3_A151TAS01_CHAR_2[0] ;
         n151TAS01_CHAR_2 = P004D3_n151TAS01_CHAR_2[0] ;
         A55TAS01_ITEM_CD = P004D3_A55TAS01_ITEM_CD[0] ;
         if ( GxRegex.IsMatch(A151TAS01_CHAR_2,"^1[01]{9}$") )
         {
            AV29W_ITEM_DIV = (SdtB402_SD04_ITEM_DIV)new SdtB402_SD04_ITEM_DIV(remoteHandle, context);
            AV29W_ITEM_DIV.setgxTv_SdtB402_SD04_ITEM_DIV_Crf_imte_div( A19TAS01_ITEM_NM );
            AV29W_ITEM_DIV.setgxTv_SdtB402_SD04_ITEM_DIV_Use_confing( A151TAS01_CHAR_2 );
            AV30W_ITEM_DIV_LIST.add(AV29W_ITEM_DIV, 0);
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      if ( AV30W_ITEM_DIV_LIST.size() < 1 )
      {
         AV36W_RTN_CD = (short)(1) ;
         GXt_char1 = AV34W_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00075", "B06", "", "", "", "", GXv_char2) ;
         b402_pc17_map_item_mst_reg.this.GXt_char1 = GXv_char2[0] ;
         AV34W_MSG = GXt_char1 ;
         AV37W_RTN_MSG.add(AV34W_MSG, 0);
         returnInSub = true;
         if (true) return;
      }
      AV26W_FILE.setSource( AV11P_FILE_NAME );
      if ( ! AV26W_FILE.exists() || ( AV26W_FILE.getLength() == 0 ) )
      {
         AV36W_RTN_CD = (short)(1) ;
         GXt_char1 = AV34W_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00011", "", "", "", "", "", GXv_char2) ;
         b402_pc17_map_item_mst_reg.this.GXt_char1 = GXv_char2[0] ;
         AV34W_MSG = GXt_char1 ;
         AV37W_RTN_MSG.add(AV34W_MSG, 0);
         returnInSub = true;
         if (true) return;
      }
      GXt_char1 = AV38W_SYS_VALUE ;
      GXv_char2[0] = GXt_char1 ;
      new b806_pc01_get_ctrl_val(remoteHandle, context).execute( "015", GXv_char2) ;
      b402_pc17_map_item_mst_reg.this.GXt_char1 = GXv_char2[0] ;
      AV38W_SYS_VALUE = GXt_char1 ;
      if ( GxRegex.IsMatch(AV38W_SYS_VALUE,"^\\d+$") )
      {
         AV33W_MAX_ERROR_COUNT = GXutil.lval( AV38W_SYS_VALUE) ;
      }
      else
      {
         AV33W_MAX_ERROR_COUNT = 100 ;
      }
   }

   public void S12103( )
   {
      /* 'SUB_READ_FILE' Routine */
      AV27W_FILE_HANDLE = context.getSessionInstances().getDelimitedFiles().dfropen( AV11P_FILE_NAME, 4096, "", "", AV39P_MOJI_CD) ;
      /* Execute user subroutine: S131 */
      S131 ();
      if (returnInSub) return;
      AV27W_FILE_HANDLE = context.getSessionInstances().getDelimitedFiles().dfrnext( ) ;
      GXv_char2[0] = AV18W_CSV_DATA ;
      GXt_int3 = context.getSessionInstances().getDelimitedFiles().dfrgtxt( GXv_char2, (short)(1000000)) ;
      AV18W_CSV_DATA = GXv_char2[0] ;
      AV27W_FILE_HANDLE = GXt_int3 ;
      /* Execute user subroutine: S131 */
      S131 ();
      if (returnInSub) return;
      while ( context.getSessionInstances().getDelimitedFiles().dfrnext( ) == 0 )
      {
         AV16W_CNT = (long)(AV16W_CNT+1) ;
         AV31W_LINE_MSG = GXutil.trim( GXutil.str( AV16W_CNT, 10, 0)) + "行目：" ;
         GXv_char2[0] = AV18W_CSV_DATA ;
         GXt_int3 = context.getSessionInstances().getDelimitedFiles().dfrgtxt( GXv_char2, (short)(1000000)) ;
         AV18W_CSV_DATA = GXv_char2[0] ;
         AV27W_FILE_HANDLE = GXt_int3 ;
         if ( AV27W_FILE_HANDLE == -5 )
         {
            AV36W_RTN_CD = (short)(1) ;
            GXt_char1 = AV34W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00026", "CSV", "", "", "", "", GXv_char2) ;
            b402_pc17_map_item_mst_reg.this.GXt_char1 = GXv_char2[0] ;
            AV34W_MSG = AV31W_LINE_MSG + GXt_char1 ;
            AV37W_RTN_MSG.add(AV34W_MSG, 0);
         }
         else
         {
            /* Execute user subroutine: S131 */
            S131 ();
            if (returnInSub) return;
         }
         if ( AV27W_FILE_HANDLE == 0 )
         {
            GXv_objcol_svchar4[0] = AV17W_CSV_COL ;
            GXv_int5[0] = AV21W_ERR_CD ;
            GXv_char2[0] = AV34W_MSG ;
            new b807_pc03_csv_col_parse(remoteHandle, context).execute( AV18W_CSV_DATA, 17, "CSV", GXv_objcol_svchar4, GXv_int5, GXv_char2) ;
            AV17W_CSV_COL = GXv_objcol_svchar4[0] ;
            b402_pc17_map_item_mst_reg.this.AV21W_ERR_CD = GXv_int5[0] ;
            b402_pc17_map_item_mst_reg.this.AV34W_MSG = GXv_char2[0] ;
            if ( AV21W_ERR_CD != 0 )
            {
               AV36W_RTN_CD = (short)(1) ;
               AV34W_MSG = AV31W_LINE_MSG + AV34W_MSG ;
               AV37W_RTN_MSG.add(AV34W_MSG, 0);
            }
            else
            {
               /* Execute user subroutine: S141 */
               S141 ();
               if (returnInSub) return;
            }
         }
         if ( AV37W_RTN_MSG.size() > AV33W_MAX_ERROR_COUNT )
         {
            AV36W_RTN_CD = (short)(1) ;
            GXt_char1 = AV34W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00044", GXutil.trim( GXutil.str( AV33W_MAX_ERROR_COUNT, 10, 0)), "", "", "", "", GXv_char2) ;
            b402_pc17_map_item_mst_reg.this.GXt_char1 = GXv_char2[0] ;
            AV34W_MSG = GXt_char1 ;
            AV37W_RTN_MSG.add(AV34W_MSG, 0);
            if (true) break;
         }
      }
      AV27W_FILE_HANDLE = context.getSessionInstances().getDelimitedFiles().dfrclose( ) ;
   }

   public void S15156( )
   {
      /* 'SUB_REG' Routine */
      if ( AV36W_RTN_CD == 0 )
      {
         AV44GXV1 = 1 ;
         while ( AV44GXV1 <= AV9BC_MAP_ITEM_C.size() )
         {
            AV8BC_MAP_ITEM = (SdtTBM24_MAP_ITEM)((SdtTBM24_MAP_ITEM)AV9BC_MAP_ITEM_C.elementAt(-1+AV44GXV1));
            AV8BC_MAP_ITEM.Save();
            if ( AV8BC_MAP_ITEM.Fail() )
            {
               AV36W_RTN_CD = (short)(1) ;
               GXt_char1 = AV34W_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new b803_pc02_get_bcmsg_airres(remoteHandle, context).execute( AV8BC_MAP_ITEM.GetMessages(), GXv_char2) ;
               b402_pc17_map_item_mst_reg.this.GXt_char1 = GXv_char2[0] ;
               AV34W_MSG = GXt_char1 ;
               AV37W_RTN_MSG.add(AV34W_MSG, 0);
               if (true) break;
            }
            AV44GXV1 = (int)(AV44GXV1+1) ;
         }
      }
   }

   public void S131( )
   {
      /* 'SUB_FILE_HANDLE_CHECK' Routine */
      if ( AV27W_FILE_HANDLE != 0 )
      {
         AV36W_RTN_CD = (short)(1) ;
         AV27W_FILE_HANDLE = context.getSessionInstances().getDelimitedFiles().dfrclose( ) ;
         GXt_char1 = AV34W_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AX00003", "", "", "", "", "", GXv_char2) ;
         b402_pc17_map_item_mst_reg.this.GXt_char1 = GXv_char2[0] ;
         AV34W_MSG = GXt_char1 ;
         AV37W_RTN_MSG.add(AV34W_MSG, 0);
         returnInSub = true;
         if (true) return;
      }
   }

   public void S141( )
   {
      /* 'SUB_DATA_CHECK' Routine */
      /* Execute user subroutine: S161 */
      S161 ();
      if (returnInSub) return;
      AV19W_DOM_CD = (String)AV17W_CSV_COL.elementAt(-1+1) ;
      AV45GXLvl198 = (byte)(0) ;
      Gx_ope = "Fetch" ;
      Gx_etb = "TBM02_CDISC_DOMAIN" ;
      /* Using cursor P004D4 */
      pr_default.execute(2, new Object[] {AV19W_DOM_CD});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A522TBM02_DEL_FLG = P004D4_A522TBM02_DEL_FLG[0] ;
         n522TBM02_DEL_FLG = P004D4_n522TBM02_DEL_FLG[0] ;
         A516TBM02_DOM_CD = P004D4_A516TBM02_DOM_CD[0] ;
         AV45GXLvl198 = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      if ( AV45GXLvl198 == 0 )
      {
         AV36W_RTN_CD = (short)(1) ;
         GXt_char1 = AV34W_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00003", "ドメインコード", "", "", "", "", GXv_char2) ;
         b402_pc17_map_item_mst_reg.this.GXt_char1 = GXv_char2[0] ;
         AV34W_MSG = AV31W_LINE_MSG + GXt_char1 ;
         AV37W_RTN_MSG.add(AV34W_MSG, 0);
      }
      AV19W_DOM_CD = (String)AV17W_CSV_COL.elementAt(-1+1) ;
      AV20W_DOM_VAR_NM = (String)AV17W_CSV_COL.elementAt(-1+2) ;
      AV46GXLvl211 = (byte)(0) ;
      Gx_ope = "Fetch" ;
      Gx_etb = "TBM03_CDISC_ITEM" ;
      /* Using cursor P004D5 */
      pr_default.execute(3, new Object[] {AV19W_DOM_CD, AV20W_DOM_VAR_NM});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A178TBM03_DEL_FLG = P004D5_A178TBM03_DEL_FLG[0] ;
         n178TBM03_DEL_FLG = P004D5_n178TBM03_DEL_FLG[0] ;
         A163TBM03_DOM_VAR_NM = P004D5_A163TBM03_DOM_VAR_NM[0] ;
         A162TBM03_DOM_CD = P004D5_A162TBM03_DOM_CD[0] ;
         AV46GXLvl211 = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      if ( AV46GXLvl211 == 0 )
      {
         AV36W_RTN_CD = (short)(1) ;
         GXt_char1 = AV34W_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00003", "ドメイン変数名", "", "", "", "", GXv_char2) ;
         b402_pc17_map_item_mst_reg.this.GXt_char1 = GXv_char2[0] ;
         AV34W_MSG = AV31W_LINE_MSG + GXt_char1 ;
         AV37W_RTN_MSG.add(AV34W_MSG, 0);
      }
      AV24W_EXISTS = false ;
      AV47GXV2 = 1 ;
      while ( AV47GXV2 <= AV30W_ITEM_DIV_LIST.size() )
      {
         AV29W_ITEM_DIV = (SdtB402_SD04_ITEM_DIV)((SdtB402_SD04_ITEM_DIV)AV30W_ITEM_DIV_LIST.elementAt(-1+AV47GXV2));
         if ( GXutil.strcmp(GXutil.upper( (String)AV17W_CSV_COL.elementAt(-1+7)), GXutil.upper( AV29W_ITEM_DIV.getgxTv_SdtB402_SD04_ITEM_DIV_Crf_imte_div())) == 0 )
         {
            AV24W_EXISTS = true ;
            if (true) break;
         }
         AV47GXV2 = (int)(AV47GXV2+1) ;
      }
      if ( ! AV24W_EXISTS )
      {
         AV36W_RTN_CD = (short)(1) ;
         GXt_char1 = AV34W_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00026", "CRF項目区分", "", "", "", "", GXv_char2) ;
         b402_pc17_map_item_mst_reg.this.GXt_char1 = GXv_char2[0] ;
         AV34W_MSG = AV31W_LINE_MSG + GXt_char1 ;
         AV37W_RTN_MSG.add(AV34W_MSG, 0);
      }
      if ( GxRegex.IsMatch(AV29W_ITEM_DIV.getgxTv_SdtB402_SD04_ITEM_DIV_Use_confing(),"^..1......0.*$") && AV24W_EXISTS )
      {
         AV32W_LIST_CD = (String)AV17W_CSV_COL.elementAt(-1+8) ;
         AV48GXLvl240 = (byte)(0) ;
         Gx_ope = "Fetch" ;
         Gx_etb = "TBM25_SEL_LIST" ;
         /* Using cursor P004D6 */
         pr_default.execute(4, new Object[] {new Long(AV12P_STUDY_ID), AV32W_LIST_CD});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A438TBM25_DEL_FLG = P004D6_A438TBM25_DEL_FLG[0] ;
            n438TBM25_DEL_FLG = P004D6_n438TBM25_DEL_FLG[0] ;
            A436TBM25_LIST_CD = P004D6_A436TBM25_LIST_CD[0] ;
            A435TBM25_STUDY_ID = P004D6_A435TBM25_STUDY_ID[0] ;
            AV48GXLvl240 = (byte)(1) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(4);
         if ( AV48GXLvl240 == 0 )
         {
            AV36W_RTN_CD = (short)(1) ;
            GXt_char1 = AV34W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00003", "識別・選択リストコード", "", "", "", "", GXv_char2) ;
            b402_pc17_map_item_mst_reg.this.GXt_char1 = GXv_char2[0] ;
            AV34W_MSG = AV31W_LINE_MSG + GXt_char1 ;
            AV37W_RTN_MSG.add(AV34W_MSG, 0);
         }
      }
      if ( GxRegex.IsMatch(AV29W_ITEM_DIV.getgxTv_SdtB402_SD04_ITEM_DIV_Use_confing(),"^..1......1.*$") && AV24W_EXISTS )
      {
         AV28W_IMAGE_CD = (String)AV17W_CSV_COL.elementAt(-1+8) ;
         AV49GXLvl254 = (byte)(0) ;
         Gx_ope = "Fetch" ;
         Gx_etb = "TBM11_IMAGE" ;
         /* Using cursor P004D7 */
         pr_default.execute(5, new Object[] {AV28W_IMAGE_CD, new Long(AV12P_STUDY_ID)});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A414TBM11_DEL_FLG = P004D7_A414TBM11_DEL_FLG[0] ;
            n414TBM11_DEL_FLG = P004D7_n414TBM11_DEL_FLG[0] ;
            A512TBM11_STUDY_ID = P004D7_A512TBM11_STUDY_ID[0] ;
            n512TBM11_STUDY_ID = P004D7_n512TBM11_STUDY_ID[0] ;
            A411TBM11_IMAGE_CD = P004D7_A411TBM11_IMAGE_CD[0] ;
            AV49GXLvl254 = (byte)(1) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(5);
         if ( AV49GXLvl254 == 0 )
         {
            AV36W_RTN_CD = (short)(1) ;
            GXt_char1 = AV34W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00003", "識別・選択リストコード", "", "", "", "", GXv_char2) ;
            b402_pc17_map_item_mst_reg.this.GXt_char1 = GXv_char2[0] ;
            AV34W_MSG = AV31W_LINE_MSG + GXt_char1 ;
            AV37W_RTN_MSG.add(AV34W_MSG, 0);
         }
      }
      if ( AV36W_RTN_CD == 0 )
      {
         /* Execute user subroutine: S171 */
         S171 ();
         if (returnInSub) return;
      }
   }

   public void S161( )
   {
      /* 'SUB_ATTRIBUTE_CHK' Routine */
      AV13W_A_CHK_INFO_SDT.clear();
      /* Execute user subroutine: S181 */
      S181 ();
      if (returnInSub) return;
      GXv_objcol_svchar4[0] = AV13W_A_CHK_INFO_SDT ;
      new a823_pc01_data_tyep_check(remoteHandle, context).execute( GXv_objcol_svchar4) ;
      AV13W_A_CHK_INFO_SDT = GXv_objcol_svchar4[0] ;
      AV50GXV3 = 1 ;
      while ( AV50GXV3 <= AV13W_A_CHK_INFO_SDT.size() )
      {
         AV14W_A_CHK_INFO_SDT_ITEM = (SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)((SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)AV13W_A_CHK_INFO_SDT.elementAt(-1+AV50GXV3));
         if ( AV14W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result() != 0 )
         {
            AV36W_RTN_CD = (short)(1) ;
            AV34W_MSG = AV31W_LINE_MSG + AV14W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result_msg() ;
            AV37W_RTN_MSG.add(AV34W_MSG, 0);
         }
         AV50GXV3 = (int)(AV50GXV3+1) ;
      }
   }

   public void S181( )
   {
      /* 'SUB_CHK_INFO_SET' Routine */
      AV14W_A_CHK_INFO_SDT_ITEM = (SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)new SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem(remoteHandle, context);
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id( "" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm( "ドメインコード" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str( GXutil.trim( (String)AV17W_CSV_COL.elementAt(-1+1)) );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn( "STR" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( (byte)(1) );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte( (short)(2) );
      AV13W_A_CHK_INFO_SDT.add(AV14W_A_CHK_INFO_SDT_ITEM, 0);
      AV14W_A_CHK_INFO_SDT_ITEM = (SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)new SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem(remoteHandle, context);
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id( "" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm( "ドメイン変数名" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str( GXutil.trim( (String)AV17W_CSV_COL.elementAt(-1+2)) );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn( "STR" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( (byte)(1) );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte( (short)(50) );
      AV13W_A_CHK_INFO_SDT.add(AV14W_A_CHK_INFO_SDT_ITEM, 0);
      AV14W_A_CHK_INFO_SDT_ITEM = (SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)new SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem(remoteHandle, context);
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id( "" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm( "ドメイン内項目グループOID" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str( GXutil.trim( (String)AV17W_CSV_COL.elementAt(-1+3)) );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn( "STR" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( (byte)(1) );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte( (short)(50) );
      AV13W_A_CHK_INFO_SDT.add(AV14W_A_CHK_INFO_SDT_ITEM, 0);
      AV14W_A_CHK_INFO_SDT_ITEM = (SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)new SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem(remoteHandle, context);
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id( "" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm( "ドメイン内項目グループ内連番" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str( GXutil.trim( (String)AV17W_CSV_COL.elementAt(-1+4)) );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn( "STR" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( (byte)(0) );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte( (short)(4) );
      AV13W_A_CHK_INFO_SDT.add(AV14W_A_CHK_INFO_SDT_ITEM, 0);
      AV14W_A_CHK_INFO_SDT_ITEM = (SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)new SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem(remoteHandle, context);
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id( "" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm( "項目グループ行番号" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str( GXutil.trim( (String)AV17W_CSV_COL.elementAt(-1+5)) );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn( "STR" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( (byte)(0) );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte( (short)(4) );
      AV13W_A_CHK_INFO_SDT.add(AV14W_A_CHK_INFO_SDT_ITEM, 0);
      AV14W_A_CHK_INFO_SDT_ITEM = (SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)new SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem(remoteHandle, context);
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id( "" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm( "CRF項目名" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str( GXutil.trim( (String)AV17W_CSV_COL.elementAt(-1+6)) );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn( "STR" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( (byte)(0) );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte( (short)(200) );
      AV13W_A_CHK_INFO_SDT.add(AV14W_A_CHK_INFO_SDT_ITEM, 0);
      AV14W_A_CHK_INFO_SDT_ITEM = (SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)new SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem(remoteHandle, context);
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id( "" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm( "CRF項目区分名" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str( GXutil.trim( (String)AV17W_CSV_COL.elementAt(-1+7)) );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn( "STR" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( (byte)(1) );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte( (short)(50) );
      AV13W_A_CHK_INFO_SDT.add(AV14W_A_CHK_INFO_SDT_ITEM, 0);
      AV14W_A_CHK_INFO_SDT_ITEM = (SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)new SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem(remoteHandle, context);
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id( "" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm( "識別・選択リストコード" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str( GXutil.trim( (String)AV17W_CSV_COL.elementAt(-1+8)) );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn( "STR" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( (byte)(0) );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte( (short)(50) );
      AV13W_A_CHK_INFO_SDT.add(AV14W_A_CHK_INFO_SDT_ITEM, 0);
      AV14W_A_CHK_INFO_SDT_ITEM = (SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)new SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem(remoteHandle, context);
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id( "" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm( "テキスト文字数" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str( GXutil.trim( (String)AV17W_CSV_COL.elementAt(-1+9)) );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn( "STR" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( (byte)(0) );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte( (short)(3) );
      AV13W_A_CHK_INFO_SDT.add(AV14W_A_CHK_INFO_SDT_ITEM, 0);
      AV14W_A_CHK_INFO_SDT_ITEM = (SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)new SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem(remoteHandle, context);
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id( "" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm( "テキスト行数" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str( GXutil.trim( (String)AV17W_CSV_COL.elementAt(-1+10)) );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn( "STR" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( (byte)(0) );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte( (short)(2) );
      AV13W_A_CHK_INFO_SDT.add(AV14W_A_CHK_INFO_SDT_ITEM, 0);
      AV14W_A_CHK_INFO_SDT_ITEM = (SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)new SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem(remoteHandle, context);
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id( "" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm( "小数点以下桁数" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str( GXutil.trim( (String)AV17W_CSV_COL.elementAt(-1+11)) );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn( "STR" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( (byte)(0) );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte( (short)(2) );
      AV13W_A_CHK_INFO_SDT.add(AV14W_A_CHK_INFO_SDT_ITEM, 0);
      AV14W_A_CHK_INFO_SDT_ITEM = (SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)new SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem(remoteHandle, context);
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id( "" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm( "表示テキスト" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str( GXutil.trim( (String)AV17W_CSV_COL.elementAt(-1+12)) );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn( "STR" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( (byte)(0) );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte( (short)(200) );
      AV13W_A_CHK_INFO_SDT.add(AV14W_A_CHK_INFO_SDT_ITEM, 0);
      AV14W_A_CHK_INFO_SDT_ITEM = (SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)new SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem(remoteHandle, context);
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id( "" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm( "固定値" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str( GXutil.trim( (String)AV17W_CSV_COL.elementAt(-1+13)) );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn( "STR" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( (byte)(0) );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte( (short)(100) );
      AV13W_A_CHK_INFO_SDT.add(AV14W_A_CHK_INFO_SDT_ITEM, 0);
      AV14W_A_CHK_INFO_SDT_ITEM = (SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)new SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem(remoteHandle, context);
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id( "" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm( "固定値(OFF)" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str( GXutil.trim( (String)AV17W_CSV_COL.elementAt(-1+14)) );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn( "STR" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( (byte)(0) );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte( (short)(100) );
      AV13W_A_CHK_INFO_SDT.add(AV14W_A_CHK_INFO_SDT_ITEM, 0);
      AV14W_A_CHK_INFO_SDT_ITEM = (SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)new SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem(remoteHandle, context);
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id( "" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm( "必須入力フラグ" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str( GXutil.trim( (String)AV17W_CSV_COL.elementAt(-1+15)) );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn( "STR" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( (byte)(0) );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte( (short)(1) );
      AV13W_A_CHK_INFO_SDT.add(AV14W_A_CHK_INFO_SDT_ITEM, 0);
      AV14W_A_CHK_INFO_SDT_ITEM = (SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)new SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem(remoteHandle, context);
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id( "" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm( "入力下限値" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str( GXutil.trim( (String)AV17W_CSV_COL.elementAt(-1+16)) );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn( "STR" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( (byte)(0) );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte( (short)(10) );
      AV13W_A_CHK_INFO_SDT.add(AV14W_A_CHK_INFO_SDT_ITEM, 0);
      AV14W_A_CHK_INFO_SDT_ITEM = (SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)new SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem(remoteHandle, context);
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id( "" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm( "入力上限値" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str( GXutil.trim( (String)AV17W_CSV_COL.elementAt(-1+17)) );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn( "STR" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( (byte)(0) );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte( (short)(10) );
      AV13W_A_CHK_INFO_SDT.add(AV14W_A_CHK_INFO_SDT_ITEM, 0);
   }

   public void S171( )
   {
      /* 'SUB_SET_DATA' Routine */
      AV8BC_MAP_ITEM = (SdtTBM24_MAP_ITEM)new SdtTBM24_MAP_ITEM( remoteHandle, context);
      AV8BC_MAP_ITEM.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_study_id( AV12P_STUDY_ID );
      AV8BC_MAP_ITEM.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_cd( (String)AV17W_CSV_COL.elementAt(-1+1) );
      AV8BC_MAP_ITEM.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_var_nm( (String)AV17W_CSV_COL.elementAt(-1+2) );
      AV8BC_MAP_ITEM.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_oid( (String)AV17W_CSV_COL.elementAt(-1+3) );
      AV8BC_MAP_ITEM.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_attr_seq( (short)((GxRegex.IsMatch((String)AV17W_CSV_COL.elementAt(-1+4),"^\\d{1,4}$") ? GXutil.val( (String)AV17W_CSV_COL.elementAt(-1+4), ".") : 1)) );
      AV8BC_MAP_ITEM.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_rowno( (short)((GxRegex.IsMatch((String)AV17W_CSV_COL.elementAt(-1+5),"^\\d{1,4}$") ? GXutil.val( (String)AV17W_CSV_COL.elementAt(-1+5), ".") : 1)) );
      AV8BC_MAP_ITEM.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_nm( (String)AV17W_CSV_COL.elementAt(-1+6) );
      AV8BC_MAP_ITEM.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_div( AV29W_ITEM_DIV.getgxTv_SdtB402_SD04_ITEM_DIV_Crf_imte_div() );
      AV8BC_MAP_ITEM.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_identification_cd( (GxRegex.IsMatch(AV29W_ITEM_DIV.getgxTv_SdtB402_SD04_ITEM_DIV_Use_confing(),"^..1.*$") ? (String)AV17W_CSV_COL.elementAt(-1+8) : "") );
      AV8BC_MAP_ITEM.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxlength( (short)((GxRegex.IsMatch(AV29W_ITEM_DIV.getgxTv_SdtB402_SD04_ITEM_DIV_Use_confing(),"^...1.*$") ? (GxRegex.IsMatch((String)AV17W_CSV_COL.elementAt(-1+9),"^\\d{1,3}$") ? GXutil.val( (String)AV17W_CSV_COL.elementAt(-1+9), ".") : 10) : 0)) );
      AV8BC_MAP_ITEM.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxrows( (byte)((GxRegex.IsMatch(AV29W_ITEM_DIV.getgxTv_SdtB402_SD04_ITEM_DIV_Use_confing(),"^....1.*$") ? (GxRegex.IsMatch((String)AV17W_CSV_COL.elementAt(-1+10),"^\\d{1,2}$") ? GXutil.val( (String)AV17W_CSV_COL.elementAt(-1+10), ".") : 1) : 0)) );
      AV8BC_MAP_ITEM.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_decimal_digits( (byte)((GxRegex.IsMatch(AV29W_ITEM_DIV.getgxTv_SdtB402_SD04_ITEM_DIV_Use_confing(),"^.....1.*$") ? (GxRegex.IsMatch((String)AV17W_CSV_COL.elementAt(-1+11),"^\\d{1,2}$") ? GXutil.val( (String)AV17W_CSV_COL.elementAt(-1+11), ".") : 0) : 0)) );
      AV8BC_MAP_ITEM.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_text( (GxRegex.IsMatch(AV29W_ITEM_DIV.getgxTv_SdtB402_SD04_ITEM_DIV_Use_confing(),"^......1.*$") ? (String)AV17W_CSV_COL.elementAt(-1+12) : "") );
      AV8BC_MAP_ITEM.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_fixed_value( (GxRegex.IsMatch(AV29W_ITEM_DIV.getgxTv_SdtB402_SD04_ITEM_DIV_Use_confing(),"^.......1.*$") ? (String)AV17W_CSV_COL.elementAt(-1+13) : "") );
      AV8BC_MAP_ITEM.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_chk_false_inner_value( (GxRegex.IsMatch(AV29W_ITEM_DIV.getgxTv_SdtB402_SD04_ITEM_DIV_Use_confing(),"^........1.*$") ? (String)AV17W_CSV_COL.elementAt(-1+14) : "") );
      AV8BC_MAP_ITEM.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_required_input_flg( ((GXutil.strcmp((String)AV17W_CSV_COL.elementAt(-1+15), "1")==0) ? "1" : "0") );
      AV8BC_MAP_ITEM.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_min_value( (GxRegex.IsMatch(AV29W_ITEM_DIV.getgxTv_SdtB402_SD04_ITEM_DIV_Use_confing(),"^.....1.*$") ? (String)AV17W_CSV_COL.elementAt(-1+16) : "") );
      AV8BC_MAP_ITEM.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_max_value( (GxRegex.IsMatch(AV29W_ITEM_DIV.getgxTv_SdtB402_SD04_ITEM_DIV_Use_confing(),"^.....1.*$") ? (String)AV17W_CSV_COL.elementAt(-1+17) : "") );
      AV8BC_MAP_ITEM.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_order( (int)(AV16W_CNT) );
      AV8BC_MAP_ITEM.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_del_flg( "0" );
      AV8BC_MAP_ITEM.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_prog_nm( AV51Pgmname );
      AV8BC_MAP_ITEM.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_prog_nm( AV51Pgmname );
      AV9BC_MAP_ITEM_C.add(AV8BC_MAP_ITEM, 0);
   }

   public void S19503( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT6[0] = AV15W_A_LOGIN_SDT;
      GXv_char2[0] = AV23W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT6, GXv_char2) ;
      AV15W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT6[0] ;
      b402_pc17_map_item_mst_reg.this.AV23W_ERRCD = GXv_char2[0] ;
      if ( GXutil.strcmp(AV23W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("1")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void S20521( )
   {
      /* 'SUB_ERROR' Routine */
      AV25W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV25W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV10C_APP_ID );
      AV25W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      AV35W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV35W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_STUDY_ID" );
      AV35W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( GXutil.trim( GXutil.str( AV12P_STUDY_ID, 10, 0)) );
      AV25W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV35W_PARMS_ITEM, 0);
      AV35W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV35W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_FILE_NAME" );
      AV35W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV11P_FILE_NAME );
      AV25W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV35W_PARMS_ITEM, 0);
      AV34W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO7[0] = AV25W_EXTRA_INFO;
      GXv_int5[0] = AV21W_ERR_CD ;
      GXv_char2[0] = AV22W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV51Pgmname, (short)(0), AV34W_MSG, GXv_SdtB808_SD01_EXTRA_INFO7, GXv_int5, GXv_char2) ;
      AV25W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO7[0] ;
      b402_pc17_map_item_mst_reg.this.AV21W_ERR_CD = GXv_int5[0] ;
      b402_pc17_map_item_mst_reg.this.AV22W_ERR_MSG = GXv_char2[0] ;
      AV37W_RTN_MSG.add(AV22W_ERR_MSG, 0);
      Application.rollback(context, remoteHandle, "DEFAULT", "b402_pc17_map_item_mst_reg");
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   protected void cleanup( )
   {
      this.aP3[0] = b402_pc17_map_item_mst_reg.this.AV36W_RTN_CD;
      this.aP4[0] = b402_pc17_map_item_mst_reg.this.AV37W_RTN_MSG;
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
                  /* Execute user subroutine: S20521 */
                  S20521 ();
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
      AV37W_RTN_MSG = new GxObjectCollection(String.class, "internal", "");
      AV10C_APP_ID = "" ;
      AV9BC_MAP_ITEM_C = new GxObjectCollection(SdtTBM24_MAP_ITEM.class, "TBM24_MAP_ITEM", "SmartEDC_SHIZUOKA", remoteHandle);
      Gx_ope = "" ;
      Gx_etb = "" ;
      AV30W_ITEM_DIV_LIST = new GxObjectCollection(SdtB402_SD04_ITEM_DIV.class, "B402_SD04_ITEM_DIV", "SmartEDC_SHIZUOKA", remoteHandle);
      scmdbuf = "" ;
      P004D3_A113TAS01_DEL_FLG = new String[] {""} ;
      P004D3_n113TAS01_DEL_FLG = new boolean[] {false} ;
      P004D3_A54TAS01_DATA_KIND = new String[] {""} ;
      P004D3_A19TAS01_ITEM_NM = new String[] {""} ;
      P004D3_n19TAS01_ITEM_NM = new boolean[] {false} ;
      P004D3_A151TAS01_CHAR_2 = new String[] {""} ;
      P004D3_n151TAS01_CHAR_2 = new boolean[] {false} ;
      P004D3_A55TAS01_ITEM_CD = new String[] {""} ;
      A113TAS01_DEL_FLG = "" ;
      A54TAS01_DATA_KIND = "" ;
      A19TAS01_ITEM_NM = "" ;
      A151TAS01_CHAR_2 = "" ;
      A55TAS01_ITEM_CD = "" ;
      AV29W_ITEM_DIV = new SdtB402_SD04_ITEM_DIV(remoteHandle, context);
      AV34W_MSG = "" ;
      AV26W_FILE = new com.genexus.util.GXFile();
      AV38W_SYS_VALUE = "" ;
      AV18W_CSV_DATA = "" ;
      AV31W_LINE_MSG = "" ;
      AV17W_CSV_COL = new GxObjectCollection(String.class, "internal", "");
      AV8BC_MAP_ITEM = new SdtTBM24_MAP_ITEM(remoteHandle);
      AV19W_DOM_CD = "" ;
      P004D4_A522TBM02_DEL_FLG = new String[] {""} ;
      P004D4_n522TBM02_DEL_FLG = new boolean[] {false} ;
      P004D4_A516TBM02_DOM_CD = new String[] {""} ;
      A522TBM02_DEL_FLG = "" ;
      A516TBM02_DOM_CD = "" ;
      AV20W_DOM_VAR_NM = "" ;
      P004D5_A178TBM03_DEL_FLG = new String[] {""} ;
      P004D5_n178TBM03_DEL_FLG = new boolean[] {false} ;
      P004D5_A163TBM03_DOM_VAR_NM = new String[] {""} ;
      P004D5_A162TBM03_DOM_CD = new String[] {""} ;
      A178TBM03_DEL_FLG = "" ;
      A163TBM03_DOM_VAR_NM = "" ;
      A162TBM03_DOM_CD = "" ;
      AV32W_LIST_CD = "" ;
      P004D6_A438TBM25_DEL_FLG = new String[] {""} ;
      P004D6_n438TBM25_DEL_FLG = new boolean[] {false} ;
      P004D6_A436TBM25_LIST_CD = new String[] {""} ;
      P004D6_A435TBM25_STUDY_ID = new long[1] ;
      A438TBM25_DEL_FLG = "" ;
      A436TBM25_LIST_CD = "" ;
      AV28W_IMAGE_CD = "" ;
      P004D7_A414TBM11_DEL_FLG = new String[] {""} ;
      P004D7_n414TBM11_DEL_FLG = new boolean[] {false} ;
      P004D7_A512TBM11_STUDY_ID = new long[1] ;
      P004D7_n512TBM11_STUDY_ID = new boolean[] {false} ;
      P004D7_A411TBM11_IMAGE_CD = new String[] {""} ;
      A414TBM11_DEL_FLG = "" ;
      A411TBM11_IMAGE_CD = "" ;
      AV13W_A_CHK_INFO_SDT = new GxObjectCollection(SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem.class, "A_CHK_INFO_SDT.A_CHK_INFO_SDTItem", "SmartEDC_SHIZUOKA", remoteHandle);
      GXv_objcol_svchar4 = new GxObjectCollection [1] ;
      AV14W_A_CHK_INFO_SDT_ITEM = new SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem(remoteHandle, context);
      AV51Pgmname = "" ;
      AV15W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      GXv_SdtA_LOGIN_SDT6 = new SdtA_LOGIN_SDT [1] ;
      AV23W_ERRCD = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV25W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV35W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      GXv_SdtB808_SD01_EXTRA_INFO7 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int5 = new short [1] ;
      AV22W_ERR_MSG = "" ;
      GXv_char2 = new String [1] ;
      GXt_char1 = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b402_pc17_map_item_mst_reg__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            P004D3_A113TAS01_DEL_FLG, P004D3_n113TAS01_DEL_FLG, P004D3_A54TAS01_DATA_KIND, P004D3_A19TAS01_ITEM_NM, P004D3_n19TAS01_ITEM_NM, P004D3_A151TAS01_CHAR_2, P004D3_n151TAS01_CHAR_2, P004D3_A55TAS01_ITEM_CD
            }
            , new Object[] {
            P004D4_A522TBM02_DEL_FLG, P004D4_n522TBM02_DEL_FLG, P004D4_A516TBM02_DOM_CD
            }
            , new Object[] {
            P004D5_A178TBM03_DEL_FLG, P004D5_n178TBM03_DEL_FLG, P004D5_A163TBM03_DOM_VAR_NM, P004D5_A162TBM03_DOM_CD
            }
            , new Object[] {
            P004D6_A438TBM25_DEL_FLG, P004D6_n438TBM25_DEL_FLG, P004D6_A436TBM25_LIST_CD, P004D6_A435TBM25_STUDY_ID
            }
            , new Object[] {
            P004D7_A414TBM11_DEL_FLG, P004D7_n414TBM11_DEL_FLG, P004D7_A512TBM11_STUDY_ID, P004D7_n512TBM11_STUDY_ID, P004D7_A411TBM11_IMAGE_CD
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV51Pgmname = "B402_PC17_MAP_ITEM_MST_REG" ;
      /* GeneXus formulas. */
      AV51Pgmname = "B402_PC17_MAP_ITEM_MST_REG" ;
      Gx_err = (short)(0) ;
   }

   private byte AV45GXLvl198 ;
   private byte AV46GXLvl211 ;
   private byte AV48GXLvl240 ;
   private byte AV49GXLvl254 ;
   private short AV36W_RTN_CD ;
   private short AV27W_FILE_HANDLE ;
   private short GXt_int3 ;
   private short AV21W_ERR_CD ;
   private short GXv_int5[] ;
   private short Gx_err ;
   private int AV44GXV1 ;
   private int AV47GXV2 ;
   private int AV50GXV3 ;
   private int GXActiveErrHndl ;
   private long AV12P_STUDY_ID ;
   private long AV16W_CNT ;
   private long AV33W_MAX_ERROR_COUNT ;
   private long A435TBM25_STUDY_ID ;
   private long A512TBM11_STUDY_ID ;
   private String Gx_ope ;
   private String Gx_etb ;
   private String scmdbuf ;
   private String AV51Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String GXv_char2[] ;
   private String GXt_char1 ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private boolean n113TAS01_DEL_FLG ;
   private boolean n19TAS01_ITEM_NM ;
   private boolean n151TAS01_CHAR_2 ;
   private boolean n522TBM02_DEL_FLG ;
   private boolean n178TBM03_DEL_FLG ;
   private boolean AV24W_EXISTS ;
   private boolean n438TBM25_DEL_FLG ;
   private boolean n414TBM11_DEL_FLG ;
   private boolean n512TBM11_STUDY_ID ;
   private String AV11P_FILE_NAME ;
   private String AV39P_MOJI_CD ;
   private String AV10C_APP_ID ;
   private String A113TAS01_DEL_FLG ;
   private String A54TAS01_DATA_KIND ;
   private String A19TAS01_ITEM_NM ;
   private String A151TAS01_CHAR_2 ;
   private String A55TAS01_ITEM_CD ;
   private String AV34W_MSG ;
   private String AV38W_SYS_VALUE ;
   private String AV18W_CSV_DATA ;
   private String AV31W_LINE_MSG ;
   private String AV19W_DOM_CD ;
   private String A522TBM02_DEL_FLG ;
   private String A516TBM02_DOM_CD ;
   private String AV20W_DOM_VAR_NM ;
   private String A178TBM03_DEL_FLG ;
   private String A163TBM03_DOM_VAR_NM ;
   private String A162TBM03_DOM_CD ;
   private String AV32W_LIST_CD ;
   private String A438TBM25_DEL_FLG ;
   private String A436TBM25_LIST_CD ;
   private String AV28W_IMAGE_CD ;
   private String A414TBM11_DEL_FLG ;
   private String A411TBM11_IMAGE_CD ;
   private String AV23W_ERRCD ;
   private String AV22W_ERR_MSG ;
   private com.genexus.util.GXFile AV26W_FILE ;
   private short[] aP3 ;
   private GxObjectCollection[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P004D3_A113TAS01_DEL_FLG ;
   private boolean[] P004D3_n113TAS01_DEL_FLG ;
   private String[] P004D3_A54TAS01_DATA_KIND ;
   private String[] P004D3_A19TAS01_ITEM_NM ;
   private boolean[] P004D3_n19TAS01_ITEM_NM ;
   private String[] P004D3_A151TAS01_CHAR_2 ;
   private boolean[] P004D3_n151TAS01_CHAR_2 ;
   private String[] P004D3_A55TAS01_ITEM_CD ;
   private String[] P004D4_A522TBM02_DEL_FLG ;
   private boolean[] P004D4_n522TBM02_DEL_FLG ;
   private String[] P004D4_A516TBM02_DOM_CD ;
   private String[] P004D5_A178TBM03_DEL_FLG ;
   private boolean[] P004D5_n178TBM03_DEL_FLG ;
   private String[] P004D5_A163TBM03_DOM_VAR_NM ;
   private String[] P004D5_A162TBM03_DOM_CD ;
   private String[] P004D6_A438TBM25_DEL_FLG ;
   private boolean[] P004D6_n438TBM25_DEL_FLG ;
   private String[] P004D6_A436TBM25_LIST_CD ;
   private long[] P004D6_A435TBM25_STUDY_ID ;
   private String[] P004D7_A414TBM11_DEL_FLG ;
   private boolean[] P004D7_n414TBM11_DEL_FLG ;
   private long[] P004D7_A512TBM11_STUDY_ID ;
   private boolean[] P004D7_n512TBM11_STUDY_ID ;
   private String[] P004D7_A411TBM11_IMAGE_CD ;
   private GxObjectCollection AV37W_RTN_MSG ;
   private GxObjectCollection AV9BC_MAP_ITEM_C ;
   private GxObjectCollection AV30W_ITEM_DIV_LIST ;
   private GxObjectCollection AV17W_CSV_COL ;
   private GxObjectCollection AV13W_A_CHK_INFO_SDT ;
   private GxObjectCollection GXv_objcol_svchar4[] ;
   private SdtTBM24_MAP_ITEM AV8BC_MAP_ITEM ;
   private SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem AV14W_A_CHK_INFO_SDT_ITEM ;
   private SdtA_LOGIN_SDT AV15W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT6[] ;
   private SdtB808_SD01_EXTRA_INFO AV25W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO7[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV35W_PARMS_ITEM ;
   private SdtB402_SD04_ITEM_DIV AV29W_ITEM_DIV ;
}

final  class b402_pc17_map_item_mst_reg__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P004D2", "DELETE FROM `TBM24_MAP_ITEM`  WHERE `TBM24_STUDY_ID` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new ForEachCursor("P004D3", "SELECT `TAS01_DEL_FLG`, `TAS01_DATA_KIND`, `TAS01_ITEM_NM`, `TAS01_CHAR_2`, `TAS01_ITEM_CD` FROM `TAS01_CDNM` WHERE (`TAS01_DATA_KIND` = 'B06') AND (`TAS01_DEL_FLG` = '0') ORDER BY `TAS01_DATA_KIND` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
         ,new ForEachCursor("P004D4", "SELECT `TBM02_DEL_FLG`, `TBM02_DOM_CD` FROM `TBM02_CDISC_DOMAIN` WHERE (`TBM02_DOM_CD` = ?) AND (`TBM02_DEL_FLG` = '0') ORDER BY `TBM02_DOM_CD` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P004D5", "SELECT `TBM03_DEL_FLG`, `TBM03_DOM_VAR_NM`, `TBM03_DOM_CD` FROM `TBM03_CDISC_ITEM` WHERE (`TBM03_DOM_CD` = ? and `TBM03_DOM_VAR_NM` = ?) AND (`TBM03_DEL_FLG` = '0') ORDER BY `TBM03_DOM_CD`, `TBM03_DOM_VAR_NM` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P004D6", "SELECT `TBM25_DEL_FLG`, `TBM25_LIST_CD`, `TBM25_STUDY_ID` FROM `TBM25_SEL_LIST` WHERE (`TBM25_STUDY_ID` = ? and `TBM25_LIST_CD` = ?) AND (`TBM25_DEL_FLG` = '0') ORDER BY `TBM25_STUDY_ID`, `TBM25_LIST_CD` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P004D7", "SELECT `TBM11_DEL_FLG`, `TBM11_STUDY_ID`, `TBM11_IMAGE_CD` FROM `TBM11_IMAGE` WHERE (`TBM11_IMAGE_CD` = ?) AND (`TBM11_STUDY_ID` = ? or (`TBM11_STUDY_ID` = 0) or `TBM11_STUDY_ID` IS NULL) AND (`TBM11_DEL_FLG` = '0') ORDER BY `TBM11_IMAGE_CD` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               break;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               break;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               break;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               break;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3) ;
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
               break;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 2);
               break;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 2);
               stmt.setVarchar(2, (String)parms[1], 50);
               break;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 20);
               break;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 50);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               break;
      }
   }

}

