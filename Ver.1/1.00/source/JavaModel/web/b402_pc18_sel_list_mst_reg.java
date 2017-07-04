/*
               File: B402_PC18_SEL_LIST_MST_REG
        Description: 選択リストマスタ登録
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:56:8.39
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b402_pc18_sel_list_mst_reg extends GXProcedure
{
   public b402_pc18_sel_list_mst_reg( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b402_pc18_sel_list_mst_reg.class ), "" );
   }

   public b402_pc18_sel_list_mst_reg( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public GxObjectCollection executeUdp( long aP0 ,
                                         String aP1 ,
                                         String aP2 ,
                                         String[] aP3 ,
                                         short[] aP4 )
   {
      b402_pc18_sel_list_mst_reg.this.AV14P_STUDY_ID = aP0;
      b402_pc18_sel_list_mst_reg.this.AV13P_FILE_NAME = aP1;
      b402_pc18_sel_list_mst_reg.this.AV39P_MOJI_CD = aP2;
      b402_pc18_sel_list_mst_reg.this.aP5 = new GxObjectCollection[] {new GxObjectCollection()};
      initialize();
      privateExecute();
      return aP5[0];
   }

   public void execute( long aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        GxObjectCollection[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( long aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             GxObjectCollection[] aP5 )
   {
      b402_pc18_sel_list_mst_reg.this.AV14P_STUDY_ID = aP0;
      b402_pc18_sel_list_mst_reg.this.AV13P_FILE_NAME = aP1;
      b402_pc18_sel_list_mst_reg.this.AV39P_MOJI_CD = aP2;
      b402_pc18_sel_list_mst_reg.this.aP3 = aP3;
      b402_pc18_sel_list_mst_reg.this.aP4 = aP4;
      b402_pc18_sel_list_mst_reg.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12C_APP_ID = "B402" ;
      /* Execute user subroutine: S19328 */
      S19328 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV36W_RTN_CD = (short)(0) ;
      AV37W_RTN_MSG.clear();
      GXt_char1 = AV31W_FILE_PATH ;
      GXv_char2[0] = GXt_char1 ;
      new a801_pc02_sys_config_get(remoteHandle, context).execute( AV17W_A_LOGIN_SDT, "", "CSV_UPLOAD_PATH", GXv_char2) ;
      b402_pc18_sel_list_mst_reg.this.GXt_char1 = GXv_char2[0] ;
      AV31W_FILE_PATH = GXt_char1 ;
      GXt_char1 = AV30W_FILE_NAME ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( GXutil.now( ), "YYYYMMDDHHMISS", GXv_char2) ;
      b402_pc18_sel_list_mst_reg.this.GXt_char1 = GXv_char2[0] ;
      AV30W_FILE_NAME = "b402_import_" + GXt_char1 + ".csv" ;
      if ( AV36W_RTN_CD == 0 )
      {
         /* Execute user subroutine: S1155 */
         S1155 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      if ( AV36W_RTN_CD == 0 )
      {
         /* Execute user subroutine: S1297 */
         S1297 ();
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

   public void S1155( )
   {
      /* 'SUB_SETTING' Routine */
      AV20W_CNT = 0 ;
      AV24W_ERR_FLG = false ;
      AV9BC_SEL_LIST_C.clear();
      AV11BC_SEL_LIST_ITEM_C.clear();
      /* Optimized DELETE. */
      Gx_ope = "Delete" ;
      Gx_etb = "TBM26_SEL_LIST_ITEM" ;
      /* Using cursor P004F2 */
      pr_default.execute(0, new Object[] {new Long(AV14P_STUDY_ID)});
      /* End optimized DELETE. */
      /* Optimized DELETE. */
      Gx_ope = "Delete" ;
      Gx_etb = "TBM25_SEL_LIST" ;
      /* Using cursor P004F3 */
      pr_default.execute(1, new Object[] {new Long(AV14P_STUDY_ID)});
      /* End optimized DELETE. */
      AV28W_FILE.setSource( AV13P_FILE_NAME );
      if ( ! AV28W_FILE.exists() || ( AV28W_FILE.getLength() == 0 ) )
      {
         AV36W_RTN_CD = (short)(1) ;
         GXt_char1 = AV34W_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00011", "", "", "", "", "", GXv_char2) ;
         b402_pc18_sel_list_mst_reg.this.GXt_char1 = GXv_char2[0] ;
         AV34W_MSG = GXt_char1 ;
         AV37W_RTN_MSG.add(AV34W_MSG, 0);
         returnInSub = true;
         if (true) return;
      }
      GXt_char1 = AV38W_SYS_VALUE ;
      GXv_char2[0] = GXt_char1 ;
      new b806_pc01_get_ctrl_val(remoteHandle, context).execute( "015", GXv_char2) ;
      b402_pc18_sel_list_mst_reg.this.GXt_char1 = GXv_char2[0] ;
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

   public void S1297( )
   {
      /* 'SUB_READ_FILE' Routine */
      AV29W_FILE_HANDLE = context.getSessionInstances().getDelimitedFiles().dfropen( AV13P_FILE_NAME, 4096, "", "", AV39P_MOJI_CD) ;
      /* Execute user subroutine: S131 */
      S131 ();
      if (returnInSub) return;
      AV29W_FILE_HANDLE = context.getSessionInstances().getDelimitedFiles().dfrnext( ) ;
      GXv_char2[0] = AV22W_CSV_DATA ;
      GXt_int3 = context.getSessionInstances().getDelimitedFiles().dfrgtxt( GXv_char2, (short)(1000000)) ;
      AV22W_CSV_DATA = GXv_char2[0] ;
      AV29W_FILE_HANDLE = GXt_int3 ;
      /* Execute user subroutine: S131 */
      S131 ();
      if (returnInSub) return;
      while ( context.getSessionInstances().getDelimitedFiles().dfrnext( ) == 0 )
      {
         AV20W_CNT = (long)(AV20W_CNT+1) ;
         AV32W_LINE_MSG = GXutil.trim( GXutil.str( AV20W_CNT, 10, 0)) + "行目：" ;
         GXv_char2[0] = AV22W_CSV_DATA ;
         GXt_int3 = context.getSessionInstances().getDelimitedFiles().dfrgtxt( GXv_char2, (short)(1000000)) ;
         AV22W_CSV_DATA = GXv_char2[0] ;
         AV29W_FILE_HANDLE = GXt_int3 ;
         if ( AV29W_FILE_HANDLE == -5 )
         {
            AV36W_RTN_CD = (short)(1) ;
            GXt_char1 = AV34W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00026", "CSV", "", "", "", "", GXv_char2) ;
            b402_pc18_sel_list_mst_reg.this.GXt_char1 = GXv_char2[0] ;
            AV34W_MSG = AV32W_LINE_MSG + GXt_char1 ;
            AV37W_RTN_MSG.add(AV34W_MSG, 0);
         }
         else
         {
            /* Execute user subroutine: S131 */
            S131 ();
            if (returnInSub) return;
         }
         if ( AV29W_FILE_HANDLE == 0 )
         {
            GXv_objcol_svchar4[0] = AV21W_CSV_COL ;
            GXv_int5[0] = AV23W_ERR_CD ;
            GXv_char2[0] = AV34W_MSG ;
            new b807_pc03_csv_col_parse(remoteHandle, context).execute( AV22W_CSV_DATA, 4, "CSV", GXv_objcol_svchar4, GXv_int5, GXv_char2) ;
            AV21W_CSV_COL = GXv_objcol_svchar4[0] ;
            b402_pc18_sel_list_mst_reg.this.AV23W_ERR_CD = GXv_int5[0] ;
            b402_pc18_sel_list_mst_reg.this.AV34W_MSG = GXv_char2[0] ;
            if ( AV23W_ERR_CD != 0 )
            {
               AV36W_RTN_CD = (short)(1) ;
               AV34W_MSG = AV32W_LINE_MSG + AV34W_MSG ;
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
            b402_pc18_sel_list_mst_reg.this.GXt_char1 = GXv_char2[0] ;
            AV34W_MSG = GXt_char1 ;
            AV37W_RTN_MSG.add(AV34W_MSG, 0);
            if (true) break;
         }
      }
      AV29W_FILE_HANDLE = context.getSessionInstances().getDelimitedFiles().dfrclose( ) ;
      if ( AV36W_RTN_CD == 0 )
      {
         AV28W_FILE.rename(AV31W_FILE_PATH+AV30W_FILE_NAME);
      }
   }

   public void S15156( )
   {
      /* 'SUB_REG' Routine */
      AV44GXV1 = 1 ;
      while ( AV44GXV1 <= AV9BC_SEL_LIST_C.size() )
      {
         AV8BC_SEL_LIST = (SdtTBM25_SEL_LIST)((SdtTBM25_SEL_LIST)AV9BC_SEL_LIST_C.elementAt(-1+AV44GXV1));
         AV45GXLvl161 = (byte)(0) ;
         Gx_ope = "Fetch" ;
         Gx_etb = "TBM25_SEL_LIST" ;
         /* Using cursor P004F4 */
         pr_default.execute(2, new Object[] {new Long(AV8BC_SEL_LIST.getgxTv_SdtTBM25_SEL_LIST_Tbm25_study_id()), AV8BC_SEL_LIST.getgxTv_SdtTBM25_SEL_LIST_Tbm25_list_cd()});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A436TBM25_LIST_CD = P004F4_A436TBM25_LIST_CD[0] ;
            A435TBM25_STUDY_ID = P004F4_A435TBM25_STUDY_ID[0] ;
            AV45GXLvl161 = (byte)(1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
         if ( AV45GXLvl161 == 0 )
         {
            AV8BC_SEL_LIST.Save();
            if ( AV8BC_SEL_LIST.Fail() )
            {
               AV36W_RTN_CD = (short)(1) ;
               GXt_char1 = AV34W_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new b803_pc02_get_bcmsg_airres(remoteHandle, context).execute( AV8BC_SEL_LIST.GetMessages(), GXv_char2) ;
               b402_pc18_sel_list_mst_reg.this.GXt_char1 = GXv_char2[0] ;
               AV34W_MSG = GXt_char1 ;
               AV37W_RTN_MSG.add(AV34W_MSG, 0);
               returnInSub = true;
               if (true) return;
            }
         }
         AV44GXV1 = (int)(AV44GXV1+1) ;
      }
      AV46GXV2 = 1 ;
      while ( AV46GXV2 <= AV11BC_SEL_LIST_ITEM_C.size() )
      {
         AV10BC_SEL_LIST_ITEM = (SdtTBM26_SEL_LIST_ITEM)((SdtTBM26_SEL_LIST_ITEM)AV11BC_SEL_LIST_ITEM_C.elementAt(-1+AV46GXV2));
         AV47GXLvl179 = (byte)(0) ;
         Gx_ope = "Fetch" ;
         Gx_etb = "TBM26_SEL_LIST_ITEM" ;
         /* Using cursor P004F5 */
         pr_default.execute(3, new Object[] {new Long(AV10BC_SEL_LIST_ITEM.getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_study_id()), AV10BC_SEL_LIST_ITEM.getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_cd()});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A446TBM26_STUDY_ID = P004F5_A446TBM26_STUDY_ID[0] ;
            A447TBM26_LIST_CD = P004F5_A447TBM26_LIST_CD[0] ;
            A448TBM26_LIST_ITEM_NO = P004F5_A448TBM26_LIST_ITEM_NO[0] ;
            AV47GXLvl179 = (byte)(1) ;
            AV10BC_SEL_LIST_ITEM.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_no( (short)(A448TBM26_LIST_ITEM_NO+1) );
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(3);
         }
         pr_default.close(3);
         if ( AV47GXLvl179 == 0 )
         {
            AV10BC_SEL_LIST_ITEM.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_no( (short)(1) );
         }
         AV10BC_SEL_LIST_ITEM.Save();
         if ( AV10BC_SEL_LIST_ITEM.Fail() )
         {
            AV36W_RTN_CD = (short)(1) ;
            GXt_char1 = AV34W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new b803_pc02_get_bcmsg_airres(remoteHandle, context).execute( AV10BC_SEL_LIST_ITEM.GetMessages(), GXv_char2) ;
            b402_pc18_sel_list_mst_reg.this.GXt_char1 = GXv_char2[0] ;
            AV34W_MSG = GXt_char1 ;
            AV37W_RTN_MSG.add(AV34W_MSG, 0);
            returnInSub = true;
            if (true) return;
         }
         AV46GXV2 = (int)(AV46GXV2+1) ;
      }
   }

   public void S131( )
   {
      /* 'SUB_FILE_HANDLE_CHECK' Routine */
      if ( AV29W_FILE_HANDLE != 0 )
      {
         AV36W_RTN_CD = (short)(1) ;
         AV29W_FILE_HANDLE = context.getSessionInstances().getDelimitedFiles().dfrclose( ) ;
         GXt_char1 = AV34W_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AX00003", "", "", "", "", "", GXv_char2) ;
         b402_pc18_sel_list_mst_reg.this.GXt_char1 = GXv_char2[0] ;
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
      AV15W_A_CHK_INFO_SDT.clear();
      /* Execute user subroutine: S181 */
      S181 ();
      if (returnInSub) return;
      GXv_objcol_svchar4[0] = AV15W_A_CHK_INFO_SDT ;
      new a823_pc01_data_tyep_check(remoteHandle, context).execute( GXv_objcol_svchar4) ;
      AV15W_A_CHK_INFO_SDT = GXv_objcol_svchar4[0] ;
      AV48GXV3 = 1 ;
      while ( AV48GXV3 <= AV15W_A_CHK_INFO_SDT.size() )
      {
         AV16W_A_CHK_INFO_SDT_ITEM = (SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)((SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)AV15W_A_CHK_INFO_SDT.elementAt(-1+AV48GXV3));
         if ( AV16W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result() != 0 )
         {
            AV36W_RTN_CD = (short)(1) ;
            AV34W_MSG = AV32W_LINE_MSG + AV16W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result_msg() ;
            AV37W_RTN_MSG.add(AV34W_MSG, 0);
         }
         AV48GXV3 = (int)(AV48GXV3+1) ;
      }
   }

   public void S181( )
   {
      /* 'SUB_CHK_INFO_SET' Routine */
      AV16W_A_CHK_INFO_SDT_ITEM = (SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)new SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem(remoteHandle, context);
      AV16W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id( "" );
      AV16W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm( "選択リストコード" );
      AV16W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str( GXutil.trim( (String)AV21W_CSV_COL.elementAt(-1+1)) );
      AV16W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn( "STR" );
      AV16W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( (byte)(1) );
      AV16W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte( (short)(20) );
      AV15W_A_CHK_INFO_SDT.add(AV16W_A_CHK_INFO_SDT_ITEM, 0);
      AV16W_A_CHK_INFO_SDT_ITEM = (SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)new SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem(remoteHandle, context);
      AV16W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id( "" );
      AV16W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm( "選択リスト名" );
      AV16W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str( GXutil.trim( (String)AV21W_CSV_COL.elementAt(-1+2)) );
      AV16W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn( "STR" );
      AV16W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( (byte)(1) );
      AV16W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte( (short)(50) );
      AV15W_A_CHK_INFO_SDT.add(AV16W_A_CHK_INFO_SDT_ITEM, 0);
      AV16W_A_CHK_INFO_SDT_ITEM = (SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)new SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem(remoteHandle, context);
      AV16W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id( "" );
      AV16W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm( "リスト要素名" );
      AV16W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str( GXutil.trim( (String)AV21W_CSV_COL.elementAt(-1+3)) );
      AV16W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn( "STR" );
      AV16W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( (byte)(1) );
      AV16W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte( (short)(50) );
      AV15W_A_CHK_INFO_SDT.add(AV16W_A_CHK_INFO_SDT_ITEM, 0);
      AV16W_A_CHK_INFO_SDT_ITEM = (SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)new SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem(remoteHandle, context);
      AV16W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id( "" );
      AV16W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm( "内部値" );
      AV16W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str( GXutil.trim( (String)AV21W_CSV_COL.elementAt(-1+4)) );
      AV16W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn( "STR" );
      AV16W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( (byte)(1) );
      AV16W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte( (short)(100) );
      AV15W_A_CHK_INFO_SDT.add(AV16W_A_CHK_INFO_SDT_ITEM, 0);
   }

   public void S171( )
   {
      /* 'SUB_SET_DATA' Routine */
      AV8BC_SEL_LIST = (SdtTBM25_SEL_LIST)new SdtTBM25_SEL_LIST( remoteHandle, context);
      AV8BC_SEL_LIST.setgxTv_SdtTBM25_SEL_LIST_Tbm25_study_id( AV14P_STUDY_ID );
      AV8BC_SEL_LIST.setgxTv_SdtTBM25_SEL_LIST_Tbm25_list_cd( (String)AV21W_CSV_COL.elementAt(-1+1) );
      AV8BC_SEL_LIST.setgxTv_SdtTBM25_SEL_LIST_Tbm25_list_nm( (String)AV21W_CSV_COL.elementAt(-1+2) );
      AV8BC_SEL_LIST.setgxTv_SdtTBM25_SEL_LIST_Tbm25_del_flg( "0" );
      AV8BC_SEL_LIST.setgxTv_SdtTBM25_SEL_LIST_Tbm25_crt_prog_nm( AV49Pgmname );
      AV8BC_SEL_LIST.setgxTv_SdtTBM25_SEL_LIST_Tbm25_upd_prog_nm( AV49Pgmname );
      AV9BC_SEL_LIST_C.add(AV8BC_SEL_LIST, 0);
      AV10BC_SEL_LIST_ITEM = (SdtTBM26_SEL_LIST_ITEM)new SdtTBM26_SEL_LIST_ITEM( remoteHandle, context);
      AV10BC_SEL_LIST_ITEM.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_study_id( AV14P_STUDY_ID );
      AV10BC_SEL_LIST_ITEM.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_cd( (String)AV21W_CSV_COL.elementAt(-1+1) );
      AV10BC_SEL_LIST_ITEM.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name( (String)AV21W_CSV_COL.elementAt(-1+3) );
      AV10BC_SEL_LIST_ITEM.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value( (String)AV21W_CSV_COL.elementAt(-1+4) );
      AV10BC_SEL_LIST_ITEM.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg( "0" );
      AV10BC_SEL_LIST_ITEM.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm( AV49Pgmname );
      AV10BC_SEL_LIST_ITEM.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm( AV49Pgmname );
      AV11BC_SEL_LIST_ITEM_C.add(AV10BC_SEL_LIST_ITEM, 0);
   }

   public void S19328( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT6[0] = AV17W_A_LOGIN_SDT;
      GXv_char2[0] = AV26W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT6, GXv_char2) ;
      AV17W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT6[0] ;
      b402_pc18_sel_list_mst_reg.this.AV26W_ERRCD = GXv_char2[0] ;
      if ( GXutil.strcmp(AV26W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("1")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void S20346( )
   {
      /* 'SUB_ERROR' Routine */
      AV27W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV27W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV12C_APP_ID );
      AV27W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      AV35W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV35W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_STUDY_ID" );
      AV35W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( GXutil.trim( GXutil.str( AV14P_STUDY_ID, 10, 0)) );
      AV27W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV35W_PARMS_ITEM, 0);
      AV35W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV35W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_FILE_NAME" );
      AV35W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV13P_FILE_NAME );
      AV27W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV35W_PARMS_ITEM, 0);
      AV34W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO7[0] = AV27W_EXTRA_INFO;
      GXv_int5[0] = AV23W_ERR_CD ;
      GXv_char2[0] = AV25W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV49Pgmname, (short)(0), AV34W_MSG, GXv_SdtB808_SD01_EXTRA_INFO7, GXv_int5, GXv_char2) ;
      AV27W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO7[0] ;
      b402_pc18_sel_list_mst_reg.this.AV23W_ERR_CD = GXv_int5[0] ;
      b402_pc18_sel_list_mst_reg.this.AV25W_ERR_MSG = GXv_char2[0] ;
      AV37W_RTN_MSG.add(AV25W_ERR_MSG, 0);
      Application.rollback(context, remoteHandle, "DEFAULT", "b402_pc18_sel_list_mst_reg");
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   protected void cleanup( )
   {
      this.aP3[0] = b402_pc18_sel_list_mst_reg.this.AV30W_FILE_NAME;
      this.aP4[0] = b402_pc18_sel_list_mst_reg.this.AV36W_RTN_CD;
      this.aP5[0] = b402_pc18_sel_list_mst_reg.this.AV37W_RTN_MSG;
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
                  /* Execute user subroutine: S20346 */
                  S20346 ();
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
      AV30W_FILE_NAME = "" ;
      AV37W_RTN_MSG = new GxObjectCollection(String.class, "internal", "");
      AV12C_APP_ID = "" ;
      AV31W_FILE_PATH = "" ;
      AV17W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV9BC_SEL_LIST_C = new GxObjectCollection(SdtTBM25_SEL_LIST.class, "TBM25_SEL_LIST", "SmartEDC_SHIZUOKA", remoteHandle);
      AV11BC_SEL_LIST_ITEM_C = new GxObjectCollection(SdtTBM26_SEL_LIST_ITEM.class, "TBM26_SEL_LIST_ITEM", "SmartEDC_SHIZUOKA", remoteHandle);
      Gx_ope = "" ;
      Gx_etb = "" ;
      AV28W_FILE = new com.genexus.util.GXFile();
      AV34W_MSG = "" ;
      AV38W_SYS_VALUE = "" ;
      AV22W_CSV_DATA = "" ;
      AV32W_LINE_MSG = "" ;
      AV21W_CSV_COL = new GxObjectCollection(String.class, "internal", "");
      AV8BC_SEL_LIST = new SdtTBM25_SEL_LIST(remoteHandle);
      scmdbuf = "" ;
      P004F4_A436TBM25_LIST_CD = new String[] {""} ;
      P004F4_A435TBM25_STUDY_ID = new long[1] ;
      A436TBM25_LIST_CD = "" ;
      AV10BC_SEL_LIST_ITEM = new SdtTBM26_SEL_LIST_ITEM(remoteHandle);
      P004F5_A446TBM26_STUDY_ID = new long[1] ;
      P004F5_A447TBM26_LIST_CD = new String[] {""} ;
      P004F5_A448TBM26_LIST_ITEM_NO = new short[1] ;
      A447TBM26_LIST_CD = "" ;
      AV15W_A_CHK_INFO_SDT = new GxObjectCollection(SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem.class, "A_CHK_INFO_SDT.A_CHK_INFO_SDTItem", "SmartEDC_SHIZUOKA", remoteHandle);
      GXv_objcol_svchar4 = new GxObjectCollection [1] ;
      AV16W_A_CHK_INFO_SDT_ITEM = new SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem(remoteHandle, context);
      AV49Pgmname = "" ;
      GXv_SdtA_LOGIN_SDT6 = new SdtA_LOGIN_SDT [1] ;
      AV26W_ERRCD = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV27W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV35W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      GXv_SdtB808_SD01_EXTRA_INFO7 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int5 = new short [1] ;
      AV25W_ERR_MSG = "" ;
      GXv_char2 = new String [1] ;
      GXt_char1 = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b402_pc18_sel_list_mst_reg__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P004F4_A436TBM25_LIST_CD, P004F4_A435TBM25_STUDY_ID
            }
            , new Object[] {
            P004F5_A446TBM26_STUDY_ID, P004F5_A447TBM26_LIST_CD, P004F5_A448TBM26_LIST_ITEM_NO
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV49Pgmname = "B402_PC18_SEL_LIST_MST_REG" ;
      /* GeneXus formulas. */
      AV49Pgmname = "B402_PC18_SEL_LIST_MST_REG" ;
      Gx_err = (short)(0) ;
   }

   private byte AV45GXLvl161 ;
   private byte AV47GXLvl179 ;
   private short AV36W_RTN_CD ;
   private short AV29W_FILE_HANDLE ;
   private short GXt_int3 ;
   private short AV23W_ERR_CD ;
   private short A448TBM26_LIST_ITEM_NO ;
   private short GXv_int5[] ;
   private short Gx_err ;
   private int AV44GXV1 ;
   private int AV46GXV2 ;
   private int AV48GXV3 ;
   private int GXActiveErrHndl ;
   private long AV14P_STUDY_ID ;
   private long AV20W_CNT ;
   private long AV33W_MAX_ERROR_COUNT ;
   private long A435TBM25_STUDY_ID ;
   private long A446TBM26_STUDY_ID ;
   private String Gx_ope ;
   private String Gx_etb ;
   private String scmdbuf ;
   private String AV49Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String GXv_char2[] ;
   private String GXt_char1 ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private boolean AV24W_ERR_FLG ;
   private String AV13P_FILE_NAME ;
   private String AV39P_MOJI_CD ;
   private String AV30W_FILE_NAME ;
   private String AV12C_APP_ID ;
   private String AV31W_FILE_PATH ;
   private String AV34W_MSG ;
   private String AV38W_SYS_VALUE ;
   private String AV22W_CSV_DATA ;
   private String AV32W_LINE_MSG ;
   private String A436TBM25_LIST_CD ;
   private String A447TBM26_LIST_CD ;
   private String AV26W_ERRCD ;
   private String AV25W_ERR_MSG ;
   private com.genexus.util.GXFile AV28W_FILE ;
   private String[] aP3 ;
   private short[] aP4 ;
   private GxObjectCollection[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P004F4_A436TBM25_LIST_CD ;
   private long[] P004F4_A435TBM25_STUDY_ID ;
   private long[] P004F5_A446TBM26_STUDY_ID ;
   private String[] P004F5_A447TBM26_LIST_CD ;
   private short[] P004F5_A448TBM26_LIST_ITEM_NO ;
   private GxObjectCollection AV37W_RTN_MSG ;
   private GxObjectCollection AV9BC_SEL_LIST_C ;
   private GxObjectCollection AV11BC_SEL_LIST_ITEM_C ;
   private GxObjectCollection AV21W_CSV_COL ;
   private GxObjectCollection AV15W_A_CHK_INFO_SDT ;
   private GxObjectCollection GXv_objcol_svchar4[] ;
   private SdtTBM25_SEL_LIST AV8BC_SEL_LIST ;
   private SdtTBM26_SEL_LIST_ITEM AV10BC_SEL_LIST_ITEM ;
   private SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem AV16W_A_CHK_INFO_SDT_ITEM ;
   private SdtA_LOGIN_SDT AV17W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT6[] ;
   private SdtB808_SD01_EXTRA_INFO AV27W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO7[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV35W_PARMS_ITEM ;
}

final  class b402_pc18_sel_list_mst_reg__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P004F2", "DELETE FROM `TBM26_SEL_LIST_ITEM`  WHERE `TBM26_STUDY_ID` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P004F3", "DELETE FROM `TBM25_SEL_LIST`  WHERE `TBM25_STUDY_ID` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new ForEachCursor("P004F4", "SELECT `TBM25_LIST_CD`, `TBM25_STUDY_ID` FROM `TBM25_SEL_LIST` WHERE `TBM25_STUDY_ID` = ? and `TBM25_LIST_CD` = ? ORDER BY `TBM25_STUDY_ID`, `TBM25_LIST_CD`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P004F5", "SELECT `TBM26_STUDY_ID`, `TBM26_LIST_CD`, `TBM26_LIST_ITEM_NO` FROM `TBM26_SEL_LIST_ITEM` WHERE (`TBM26_STUDY_ID` = ?) AND (`TBM26_LIST_CD` = ?) ORDER BY `TBM26_LIST_ITEM_NO` DESC  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               break;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
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
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 20);
               break;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 20);
               break;
      }
   }

}

