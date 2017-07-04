/*
               File: B402_PC15_CRF_MST_CHK
        Description: CRFマスタ入力チェック
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:54:45.91
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b402_pc15_crf_mst_chk extends GXProcedure
{
   public b402_pc15_crf_mst_chk( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b402_pc15_crf_mst_chk.class ), "" );
   }

   public b402_pc15_crf_mst_chk( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public GxObjectCollection executeUdp( SdtTBM31_CRF aP0 ,
                                         boolean aP1 ,
                                         GxObjectCollection[] aP2 )
   {
      b402_pc15_crf_mst_chk.this.AV9P_BC_CRF = aP0;
      b402_pc15_crf_mst_chk.this.AV10P_DEL_FLG = aP1;
      b402_pc15_crf_mst_chk.this.aP3 = new GxObjectCollection[] {new GxObjectCollection()};
      initialize();
      privateExecute();
      return aP3[0];
   }

   public void execute( SdtTBM31_CRF aP0 ,
                        boolean aP1 ,
                        GxObjectCollection[] aP2 ,
                        GxObjectCollection[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( SdtTBM31_CRF aP0 ,
                             boolean aP1 ,
                             GxObjectCollection[] aP2 ,
                             GxObjectCollection[] aP3 )
   {
      b402_pc15_crf_mst_chk.this.AV9P_BC_CRF = aP0;
      b402_pc15_crf_mst_chk.this.AV10P_DEL_FLG = aP1;
      b402_pc15_crf_mst_chk.this.aP2 = aP2;
      b402_pc15_crf_mst_chk.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8C_APP_ID = "B402" ;
      /* Execute user subroutine: S19349 */
      S19349 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV11W_A_CHK_INFO_SDT.clear();
      AV13W_A_CHK_RESULT_SDT.clear();
      AV16W_A_RESULT_MSG_SDT.clear();
      AV20W_FOCUS_FLG = true ;
      /* Execute user subroutine: S1151 */
      S1151 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( AV10P_DEL_FLG )
      {
         /* Execute user subroutine: S12117 */
         S12117 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else
      {
         /* Execute user subroutine: S13132 */
         S13132 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: S15219 */
         S15219 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: S16226 */
         S16226 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      cleanup();
   }

   public void S1151( )
   {
      /* 'SUB_MST_CHK' Routine */
      if ( GXutil.strcmp(AV9P_BC_CRF.GetMode(), "INS") == 0 )
      {
         /* Using cursor P004B2 */
         pr_default.execute(0, new Object[] {new Long(AV9P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_study_id()), new Short(AV9P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crf_id())});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A218TBM31_CRF_ID = P004B2_A218TBM31_CRF_ID[0] ;
            A217TBM31_STUDY_ID = P004B2_A217TBM31_STUDY_ID[0] ;
            AV14W_A_CHK_RESULT_SDT_ITEM = (SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem)new SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem(remoteHandle, context);
            AV14W_A_CHK_RESULT_SDT_ITEM.setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id( "TBM31_CRF_ID" );
            AV14W_A_CHK_RESULT_SDT_ITEM.setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus( AV20W_FOCUS_FLG );
            AV13W_A_CHK_RESULT_SDT.add(AV14W_A_CHK_RESULT_SDT_ITEM, 0);
            AV17W_A_RESULT_MSG_SDT_ITEM = (SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)new SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem(remoteHandle, context);
            GXt_char1 = "" ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AX00100", "", "", "", "", "", GXv_char2) ;
            b402_pc15_crf_mst_chk.this.GXt_char1 = GXv_char2[0] ;
            AV17W_A_RESULT_MSG_SDT_ITEM.setgxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg( GXt_char1 );
            AV16W_A_RESULT_MSG_SDT.add(AV17W_A_RESULT_MSG_SDT_ITEM, 0);
            AV20W_FOCUS_FLG = false ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
      }
      else
      {
         AV25GXLvl79 = (byte)(0) ;
         /* Using cursor P004B3 */
         pr_default.execute(1, new Object[] {new Long(AV9P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_study_id()), new Short(AV9P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crf_id())});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A218TBM31_CRF_ID = P004B3_A218TBM31_CRF_ID[0] ;
            A217TBM31_STUDY_ID = P004B3_A217TBM31_STUDY_ID[0] ;
            A227TBM31_UPD_DATETIME = P004B3_A227TBM31_UPD_DATETIME[0] ;
            n227TBM31_UPD_DATETIME = P004B3_n227TBM31_UPD_DATETIME[0] ;
            AV25GXLvl79 = (byte)(1) ;
            if ( !( AV9P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_upd_datetime().equals( A227TBM31_UPD_DATETIME ) ) )
            {
               AV14W_A_CHK_RESULT_SDT_ITEM = (SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem)new SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem(remoteHandle, context);
               AV14W_A_CHK_RESULT_SDT_ITEM.setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id( "TBM31_STUDY_ID" );
               AV14W_A_CHK_RESULT_SDT_ITEM.setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus( false );
               AV13W_A_CHK_RESULT_SDT.add(AV14W_A_CHK_RESULT_SDT_ITEM, 0);
               AV17W_A_RESULT_MSG_SDT_ITEM = (SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)new SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem(remoteHandle, context);
               GXt_char1 = "" ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AX00007", "", "", "", "", "", GXv_char2) ;
               b402_pc15_crf_mst_chk.this.GXt_char1 = GXv_char2[0] ;
               AV17W_A_RESULT_MSG_SDT_ITEM.setgxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg( GXt_char1 );
               AV16W_A_RESULT_MSG_SDT.add(AV17W_A_RESULT_MSG_SDT_ITEM, 0);
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         if ( AV25GXLvl79 == 0 )
         {
            AV14W_A_CHK_RESULT_SDT_ITEM = (SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem)new SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem(remoteHandle, context);
            AV14W_A_CHK_RESULT_SDT_ITEM.setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id( "TBM31_CRF_ID" );
            AV14W_A_CHK_RESULT_SDT_ITEM.setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus( false );
            AV13W_A_CHK_RESULT_SDT.add(AV14W_A_CHK_RESULT_SDT_ITEM, 0);
            AV17W_A_RESULT_MSG_SDT_ITEM = (SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)new SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem(remoteHandle, context);
            GXt_char1 = "" ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AX00102", "", "", "", "", "", GXv_char2) ;
            b402_pc15_crf_mst_chk.this.GXt_char1 = GXv_char2[0] ;
            AV17W_A_RESULT_MSG_SDT_ITEM.setgxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg( GXt_char1 );
            AV16W_A_RESULT_MSG_SDT.add(AV17W_A_RESULT_MSG_SDT_ITEM, 0);
         }
      }
   }

   public void S12117( )
   {
      /* 'SUB_DELETE_CHK' Routine */
      if ( GXutil.strcmp(AV9P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_status_Z(), "1") == 0 )
      {
         AV17W_A_RESULT_MSG_SDT_ITEM = (SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)new SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem(remoteHandle, context);
         GXt_char1 = "" ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00073", "", "", "", "", "", GXv_char2) ;
         b402_pc15_crf_mst_chk.this.GXt_char1 = GXv_char2[0] ;
         AV17W_A_RESULT_MSG_SDT_ITEM.setgxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg( GXt_char1 );
         AV16W_A_RESULT_MSG_SDT.add(AV17W_A_RESULT_MSG_SDT_ITEM, 0);
      }
   }

   public void S13132( )
   {
      /* 'SUB_ATTRIBUTE_CHK' Routine */
      /* Execute user subroutine: S141 */
      S141 ();
      if (returnInSub) return;
      GXv_objcol_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem3[0] = AV11W_A_CHK_INFO_SDT ;
      new a823_pc01_data_tyep_check(remoteHandle, context).execute( GXv_objcol_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem3) ;
      AV11W_A_CHK_INFO_SDT = GXv_objcol_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem3[0] ;
      AV26GXV1 = 1 ;
      while ( AV26GXV1 <= AV11W_A_CHK_INFO_SDT.size() )
      {
         AV12W_A_CHK_INFO_SDT_ITEM = (SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)((SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)AV11W_A_CHK_INFO_SDT.elementAt(-1+AV26GXV1));
         if ( AV12W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result() != 0 )
         {
            AV14W_A_CHK_RESULT_SDT_ITEM = (SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem)new SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem(remoteHandle, context);
            AV14W_A_CHK_RESULT_SDT_ITEM.setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id( AV12W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id() );
            AV14W_A_CHK_RESULT_SDT_ITEM.setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus( AV20W_FOCUS_FLG );
            AV13W_A_CHK_RESULT_SDT.add(AV14W_A_CHK_RESULT_SDT_ITEM, 0);
            AV17W_A_RESULT_MSG_SDT_ITEM = (SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)new SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem(remoteHandle, context);
            AV17W_A_RESULT_MSG_SDT_ITEM.setgxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg( AV12W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result_msg() );
            AV16W_A_RESULT_MSG_SDT.add(AV17W_A_RESULT_MSG_SDT_ITEM, 0);
            AV20W_FOCUS_FLG = false ;
         }
         AV26GXV1 = (int)(AV26GXV1+1) ;
      }
   }

   public void S141( )
   {
      /* 'SUB_CHK_INFO_SET' Routine */
      AV12W_A_CHK_INFO_SDT_ITEM = (SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)new SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem(remoteHandle, context);
      AV12W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id( "TBM31_CRF_ID" );
      AV12W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm( "CRFID" );
      AV12W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_num( DecimalUtil.doubleToDec(AV9P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crf_id()) );
      AV12W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn( "NUM" );
      AV12W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( (byte)(0) );
      AV12W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_unit( DecimalUtil.doubleToDec(0) );
      AV11W_A_CHK_INFO_SDT.add(AV12W_A_CHK_INFO_SDT_ITEM, 0);
      AV12W_A_CHK_INFO_SDT_ITEM = (SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)new SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem(remoteHandle, context);
      AV12W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id( "TBM31_CRF_NM" );
      AV12W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm( "CRF名称" );
      AV12W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str( AV9P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crf_nm() );
      AV12W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn( "STR" );
      AV12W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( (byte)(1) );
      AV12W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte( (short)(100) );
      AV11W_A_CHK_INFO_SDT.add(AV12W_A_CHK_INFO_SDT_ITEM, 0);
      AV12W_A_CHK_INFO_SDT_ITEM = (SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)new SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem(remoteHandle, context);
      AV12W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id( "TBM31_CRF_SNM" );
      AV12W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm( "CRF略称" );
      AV12W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str( AV9P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crf_snm() );
      AV12W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn( "STR" );
      AV12W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( (byte)(1) );
      AV12W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte( (short)(20) );
      AV11W_A_CHK_INFO_SDT.add(AV12W_A_CHK_INFO_SDT_ITEM, 0);
      AV12W_A_CHK_INFO_SDT_ITEM = (SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)new SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem(remoteHandle, context);
      AV12W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id( "TBM31_ORDER" );
      AV12W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm( "表示順" );
      AV12W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_num( DecimalUtil.doubleToDec(AV9P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_order()) );
      AV12W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn( "NUM" );
      AV12W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( (byte)(0) );
      AV12W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_unit( DecimalUtil.doubleToDec(0) );
      AV11W_A_CHK_INFO_SDT.add(AV12W_A_CHK_INFO_SDT_ITEM, 0);
      AV12W_A_CHK_INFO_SDT_ITEM = (SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)new SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem(remoteHandle, context);
      AV12W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id( "TBM31_NOTE" );
      AV12W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm( "備考" );
      AV12W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str( AV9P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_note() );
      AV12W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn( "STR" );
      AV12W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( (byte)(0) );
      AV12W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte( (short)(1000) );
      AV11W_A_CHK_INFO_SDT.add(AV12W_A_CHK_INFO_SDT_ITEM, 0);
   }

   public void S15219( )
   {
      /* 'SUB_ITEM_CHK' Routine */
   }

   public void S16226( )
   {
      /* 'SUB_SPECIAL_CHK' Routine */
      if ( GXutil.strcmp(AV9P_BC_CRF.GetMode(), "INS") == 0 )
      {
         GXt_char1 = AV21W_SYS_VALUE ;
         GXv_char2[0] = GXt_char1 ;
         new b806_pc01_get_ctrl_val(remoteHandle, context).execute( "016", GXv_char2) ;
         b402_pc15_crf_mst_chk.this.GXt_char1 = GXv_char2[0] ;
         AV21W_SYS_VALUE = GXt_char1 ;
         if ( GxRegex.IsMatch(AV21W_SYS_VALUE,"^\\d+$") )
         {
            AV18W_CRF_ID = (short)(GXutil.lval( AV21W_SYS_VALUE)) ;
            if ( AV9P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crf_id() == AV18W_CRF_ID )
            {
               AV14W_A_CHK_RESULT_SDT_ITEM = (SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem)new SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem(remoteHandle, context);
               AV14W_A_CHK_RESULT_SDT_ITEM.setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id( "TBM31_CRF_ID" );
               AV14W_A_CHK_RESULT_SDT_ITEM.setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus( AV20W_FOCUS_FLG );
               AV13W_A_CHK_RESULT_SDT.add(AV14W_A_CHK_RESULT_SDT_ITEM, 0);
               AV17W_A_RESULT_MSG_SDT_ITEM = (SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)new SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem(remoteHandle, context);
               GXt_char1 = "" ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AE00038", "CRFID", "使用不可な値の", "登録", "", "", GXv_char2) ;
               b402_pc15_crf_mst_chk.this.GXt_char1 = GXv_char2[0] ;
               AV17W_A_RESULT_MSG_SDT_ITEM.setgxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg( GXt_char1 );
               AV16W_A_RESULT_MSG_SDT.add(AV17W_A_RESULT_MSG_SDT_ITEM, 0);
            }
         }
      }
      if ( ( GXutil.strcmp(AV9P_BC_CRF.GetMode(), "INS") != 0 ) && ( GXutil.strcmp(AV9P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_status_Z(), AV9P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_status()) != 0 ) )
      {
         if ( ((GXutil.strcmp(AV9P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_status(), "0")==0)||(GXutil.strcmp(AV9P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_status(), "9")==0)) )
         {
            /* Execute user subroutine: S171 */
            S171 ();
            if (returnInSub) return;
         }
         else if ( ((GXutil.strcmp(AV9P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_status(), "1")==0)) )
         {
            /* Execute user subroutine: S181 */
            S181 ();
            if (returnInSub) return;
         }
      }
      if ( ( GXutil.strcmp(AV9P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_del_flg(), "0") != 0 ) && ( GXutil.strcmp(AV9P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_status_Z(), "1") == 0 ) )
      {
         AV14W_A_CHK_RESULT_SDT_ITEM = (SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem)new SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem(remoteHandle, context);
         AV14W_A_CHK_RESULT_SDT_ITEM.setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id( "TBM31_DEL_FLG" );
         AV14W_A_CHK_RESULT_SDT_ITEM.setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus( AV20W_FOCUS_FLG );
         AV13W_A_CHK_RESULT_SDT.add(AV14W_A_CHK_RESULT_SDT_ITEM, 0);
         AV17W_A_RESULT_MSG_SDT_ITEM = (SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)new SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem(remoteHandle, context);
         GXt_char1 = "" ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00072", "", "", "", "", "", GXv_char2) ;
         b402_pc15_crf_mst_chk.this.GXt_char1 = GXv_char2[0] ;
         AV17W_A_RESULT_MSG_SDT_ITEM.setgxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg( GXt_char1 );
         AV16W_A_RESULT_MSG_SDT.add(AV17W_A_RESULT_MSG_SDT_ITEM, 0);
         AV20W_FOCUS_FLG = false ;
      }
   }

   public void S171( )
   {
      /* 'SUB_CRF_LOCK_CHK' Routine */
   }

   public void S181( )
   {
      /* 'SUB_STUDY_START_CHK' Routine */
      if ( GXutil.strcmp(AV9P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_del_flg(), "0") != 0 )
      {
         AV14W_A_CHK_RESULT_SDT_ITEM = (SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem)new SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem(remoteHandle, context);
         AV14W_A_CHK_RESULT_SDT_ITEM.setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id( "TBM31_STATUS" );
         AV14W_A_CHK_RESULT_SDT_ITEM.setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus( AV20W_FOCUS_FLG );
         AV13W_A_CHK_RESULT_SDT.add(AV14W_A_CHK_RESULT_SDT_ITEM, 0);
         AV17W_A_RESULT_MSG_SDT_ITEM = (SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)new SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem(remoteHandle, context);
         GXt_char1 = "" ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00069", "", "", "", "", "", GXv_char2) ;
         b402_pc15_crf_mst_chk.this.GXt_char1 = GXv_char2[0] ;
         AV17W_A_RESULT_MSG_SDT_ITEM.setgxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg( GXt_char1 );
         AV16W_A_RESULT_MSG_SDT.add(AV17W_A_RESULT_MSG_SDT_ITEM, 0);
         AV20W_FOCUS_FLG = false ;
      }
      AV27GXLvl331 = (byte)(0) ;
      /* Using cursor P004B4 */
      pr_default.execute(2, new Object[] {new Long(AV9P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_study_id()), new Short(AV9P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crf_id())});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A238TBM32_DEL_FLG = P004B4_A238TBM32_DEL_FLG[0] ;
         n238TBM32_DEL_FLG = P004B4_n238TBM32_DEL_FLG[0] ;
         A232TBM32_CRF_ID = P004B4_A232TBM32_CRF_ID[0] ;
         A231TBM32_STUDY_ID = P004B4_A231TBM32_STUDY_ID[0] ;
         A233TBM32_CRF_ITEM_CD = P004B4_A233TBM32_CRF_ITEM_CD[0] ;
         AV27GXLvl331 = (byte)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      if ( AV27GXLvl331 == 0 )
      {
         AV17W_A_RESULT_MSG_SDT_ITEM = (SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)new SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem(remoteHandle, context);
         GXt_char1 = "" ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00076", "", "", "", "", "", GXv_char2) ;
         b402_pc15_crf_mst_chk.this.GXt_char1 = GXv_char2[0] ;
         AV17W_A_RESULT_MSG_SDT_ITEM.setgxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg( GXt_char1 );
         AV16W_A_RESULT_MSG_SDT.add(AV17W_A_RESULT_MSG_SDT_ITEM, 0);
      }
   }

   public void S19349( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT4[0] = AV15W_A_LOGIN_SDT;
      GXv_char2[0] = AV19W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT4, GXv_char2) ;
      AV15W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT4[0] ;
      b402_pc15_crf_mst_chk.this.AV19W_ERRCD = GXv_char2[0] ;
      if ( GXutil.strcmp(AV19W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("1")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void S20367( )
   {
      /* 'SUB_ERROR' Routine */
      Application.rollback(context, remoteHandle, "DEFAULT", "b402_pc15_crf_mst_chk");
      new a804_pc01_syslog(remoteHandle, context).execute( AV28Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   protected void cleanup( )
   {
      this.aP2[0] = b402_pc15_crf_mst_chk.this.AV13W_A_CHK_RESULT_SDT;
      this.aP3[0] = b402_pc15_crf_mst_chk.this.AV16W_A_RESULT_MSG_SDT;
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
                  /* Execute user subroutine: S20367 */
                  S20367 ();
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
      AV13W_A_CHK_RESULT_SDT = new GxObjectCollection(SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem.class, "A_CHK_RESULT_SDT.A_CHK_RESULT_SDTItem", "SmartEDC_SHIZUOKA", remoteHandle);
      AV16W_A_RESULT_MSG_SDT = new GxObjectCollection(SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem.class, "A_RESULT_MSG_SDT.A_RESULT_MSG_SDTItem", "SmartEDC_SHIZUOKA", remoteHandle);
      AV8C_APP_ID = "" ;
      AV11W_A_CHK_INFO_SDT = new GxObjectCollection(SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem.class, "A_CHK_INFO_SDT.A_CHK_INFO_SDTItem", "SmartEDC_SHIZUOKA", remoteHandle);
      scmdbuf = "" ;
      P004B2_A218TBM31_CRF_ID = new short[1] ;
      P004B2_A217TBM31_STUDY_ID = new long[1] ;
      AV14W_A_CHK_RESULT_SDT_ITEM = new SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem(remoteHandle, context);
      AV17W_A_RESULT_MSG_SDT_ITEM = new SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem(remoteHandle, context);
      P004B3_A218TBM31_CRF_ID = new short[1] ;
      P004B3_A217TBM31_STUDY_ID = new long[1] ;
      P004B3_A227TBM31_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P004B3_n227TBM31_UPD_DATETIME = new boolean[] {false} ;
      A227TBM31_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      GXv_objcol_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem3 = new GxObjectCollection [1] ;
      AV12W_A_CHK_INFO_SDT_ITEM = new SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem(remoteHandle, context);
      AV21W_SYS_VALUE = "" ;
      P004B4_A238TBM32_DEL_FLG = new String[] {""} ;
      P004B4_n238TBM32_DEL_FLG = new boolean[] {false} ;
      P004B4_A232TBM32_CRF_ID = new short[1] ;
      P004B4_A231TBM32_STUDY_ID = new long[1] ;
      P004B4_A233TBM32_CRF_ITEM_CD = new String[] {""} ;
      A238TBM32_DEL_FLG = "" ;
      A233TBM32_CRF_ITEM_CD = "" ;
      AV15W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      GXv_SdtA_LOGIN_SDT4 = new SdtA_LOGIN_SDT [1] ;
      AV19W_ERRCD = "" ;
      GXv_char2 = new String [1] ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV28Pgmname = "" ;
      GXt_char1 = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b402_pc15_crf_mst_chk__default(),
         new Object[] {
             new Object[] {
            P004B2_A218TBM31_CRF_ID, P004B2_A217TBM31_STUDY_ID
            }
            , new Object[] {
            P004B3_A218TBM31_CRF_ID, P004B3_A217TBM31_STUDY_ID, P004B3_A227TBM31_UPD_DATETIME, P004B3_n227TBM31_UPD_DATETIME
            }
            , new Object[] {
            P004B4_A238TBM32_DEL_FLG, P004B4_n238TBM32_DEL_FLG, P004B4_A232TBM32_CRF_ID, P004B4_A231TBM32_STUDY_ID, P004B4_A233TBM32_CRF_ITEM_CD
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV28Pgmname = "B402_PC15_CRF_MST_CHK" ;
      /* GeneXus formulas. */
      AV28Pgmname = "B402_PC15_CRF_MST_CHK" ;
      Gx_err = (short)(0) ;
   }

   private byte AV25GXLvl79 ;
   private byte AV27GXLvl331 ;
   private short A218TBM31_CRF_ID ;
   private short AV18W_CRF_ID ;
   private short A232TBM32_CRF_ID ;
   private short Gx_err ;
   private int AV26GXV1 ;
   private int GXActiveErrHndl ;
   private long A217TBM31_STUDY_ID ;
   private long A231TBM32_STUDY_ID ;
   private String scmdbuf ;
   private String GXv_char2[] ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String AV28Pgmname ;
   private String GXt_char1 ;
   private String Gx_emsg ;
   private java.util.Date A227TBM31_UPD_DATETIME ;
   private boolean AV10P_DEL_FLG ;
   private boolean returnInSub ;
   private boolean AV20W_FOCUS_FLG ;
   private boolean n227TBM31_UPD_DATETIME ;
   private boolean n238TBM32_DEL_FLG ;
   private String AV8C_APP_ID ;
   private String AV21W_SYS_VALUE ;
   private String A238TBM32_DEL_FLG ;
   private String A233TBM32_CRF_ITEM_CD ;
   private String AV19W_ERRCD ;
   private GxObjectCollection[] aP2 ;
   private GxObjectCollection[] aP3 ;
   private IDataStoreProvider pr_default ;
   private short[] P004B2_A218TBM31_CRF_ID ;
   private long[] P004B2_A217TBM31_STUDY_ID ;
   private short[] P004B3_A218TBM31_CRF_ID ;
   private long[] P004B3_A217TBM31_STUDY_ID ;
   private java.util.Date[] P004B3_A227TBM31_UPD_DATETIME ;
   private boolean[] P004B3_n227TBM31_UPD_DATETIME ;
   private String[] P004B4_A238TBM32_DEL_FLG ;
   private boolean[] P004B4_n238TBM32_DEL_FLG ;
   private short[] P004B4_A232TBM32_CRF_ID ;
   private long[] P004B4_A231TBM32_STUDY_ID ;
   private String[] P004B4_A233TBM32_CRF_ITEM_CD ;
   private GxObjectCollection AV13W_A_CHK_RESULT_SDT ;
   private GxObjectCollection AV16W_A_RESULT_MSG_SDT ;
   private GxObjectCollection AV11W_A_CHK_INFO_SDT ;
   private GxObjectCollection GXv_objcol_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem3[] ;
   private SdtTBM31_CRF AV9P_BC_CRF ;
   private SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem AV12W_A_CHK_INFO_SDT_ITEM ;
   private SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem AV14W_A_CHK_RESULT_SDT_ITEM ;
   private SdtA_LOGIN_SDT AV15W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT4[] ;
   private SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem AV17W_A_RESULT_MSG_SDT_ITEM ;
}

final  class b402_pc15_crf_mst_chk__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P004B2", "SELECT `TBM31_CRF_ID`, `TBM31_STUDY_ID` FROM `TBM31_CRF` WHERE `TBM31_STUDY_ID` = ? and `TBM31_CRF_ID` = ? ORDER BY `TBM31_STUDY_ID`, `TBM31_CRF_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P004B3", "SELECT `TBM31_CRF_ID`, `TBM31_STUDY_ID`, `TBM31_UPD_DATETIME` FROM `TBM31_CRF` WHERE `TBM31_STUDY_ID` = ? and `TBM31_CRF_ID` = ? ORDER BY `TBM31_STUDY_ID`, `TBM31_CRF_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P004B4", "SELECT `TBM32_DEL_FLG`, `TBM32_CRF_ID`, `TBM32_STUDY_ID`, `TBM32_CRF_ITEM_CD` FROM `TBM32_CRF_ITEM` WHERE (`TBM32_STUDY_ID` = ? and `TBM32_CRF_ID` = ?) AND (`TBM32_DEL_FLG` = '0') ORDER BY `TBM32_STUDY_ID`, `TBM32_CRF_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               break;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               break;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2) ;
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
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
      }
   }

}

