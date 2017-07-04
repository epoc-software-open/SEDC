/*
               File: B402_PC15_CRF_MST_CHK
        Description: CRFマスタ入力チェック
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:14:31.30
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
      b402_pc15_crf_mst_chk.this.aP2 = aP2;
      b402_pc15_crf_mst_chk.this.aP3 = aP3;
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
      /* Execute user subroutine: S191 */
      S191 ();
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
      /* Execute user subroutine: S111 */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( AV10P_DEL_FLG )
      {
         /* Execute user subroutine: S121 */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else
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
         /* Execute user subroutine: S161 */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_MST_CHK' Routine */
      if ( GXutil.strcmp(AV9P_BC_CRF.GetMode(), "INS") == 0 )
      {
         /* Using cursor P004C2 */
         pr_default.execute(0, new Object[] {new Long(AV9P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_study_id()), new Short(AV9P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crf_id())});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A69TBM31_CRF_ID = P004C2_A69TBM31_CRF_ID[0] ;
            A68TBM31_STUDY_ID = P004C2_A68TBM31_STUDY_ID[0] ;
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
         /* Using cursor P004C3 */
         pr_default.execute(1, new Object[] {new Long(AV9P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_study_id()), new Short(AV9P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crf_id())});
         if ( Gx_err != 0 )
         {
            AV25GXLvl79 = (byte)(1) ;
         }
         while ( (pr_default.getStatus(1) != 101) )
         {
            A69TBM31_CRF_ID = P004C3_A69TBM31_CRF_ID[0] ;
            A68TBM31_STUDY_ID = P004C3_A68TBM31_STUDY_ID[0] ;
            A401TBM31_UPD_DATETIME = P004C3_A401TBM31_UPD_DATETIME[0] ;
            n401TBM31_UPD_DATETIME = P004C3_n401TBM31_UPD_DATETIME[0] ;
            AV25GXLvl79 = (byte)(1) ;
            if ( !( AV9P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_upd_datetime().equals( A401TBM31_UPD_DATETIME ) ) )
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

   public void S121( )
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

   public void S131( )
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

   public void S151( )
   {
      /* 'SUB_ITEM_CHK' Routine */
   }

   public void S161( )
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
      if ( GXutil.strcmp(AV9P_BC_CRF.GetMode(), "INS") != 0 )
      {
         if ( ( AV9P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_repeat_flg_Z() != AV9P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_repeat_flg() ) || ( AV9P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_repeat_max_Z() != AV9P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_repeat_max() ) )
         {
            /* Using cursor P004C4 */
            pr_default.execute(2, new Object[] {new Long(AV9P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_study_id()), new Short(AV9P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crf_id())});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A89TBT02_STUDY_ID = P004C4_A89TBT02_STUDY_ID[0] ;
               A91TBT02_CRF_ID = P004C4_A91TBT02_CRF_ID[0] ;
               A935TBT02_CRF_EDA_NO = P004C4_A935TBT02_CRF_EDA_NO[0] ;
               A90TBT02_SUBJECT_ID = P004C4_A90TBT02_SUBJECT_ID[0] ;
               if ( AV9P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_repeat_flg() == 0 )
               {
                  AV14W_A_CHK_RESULT_SDT_ITEM = (SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem)new SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem(remoteHandle, context);
                  AV14W_A_CHK_RESULT_SDT_ITEM.setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id( "TBM31_REPEAT_FLG" );
                  AV14W_A_CHK_RESULT_SDT_ITEM.setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus( AV20W_FOCUS_FLG );
                  AV13W_A_CHK_RESULT_SDT.add(AV14W_A_CHK_RESULT_SDT_ITEM, 0);
                  AV17W_A_RESULT_MSG_SDT_ITEM = (SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)new SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem(remoteHandle, context);
                  GXt_char1 = "" ;
                  GXv_char2[0] = GXt_char1 ;
                  new a805_pc01_msg_get(remoteHandle, context).execute( "AE00038", "CRF", "繰返し使用中の", "繰り返し不可に", "", "", GXv_char2) ;
                  b402_pc15_crf_mst_chk.this.GXt_char1 = GXv_char2[0] ;
                  AV17W_A_RESULT_MSG_SDT_ITEM.setgxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg( GXt_char1 );
                  AV16W_A_RESULT_MSG_SDT.add(AV17W_A_RESULT_MSG_SDT_ITEM, 0);
                  AV20W_FOCUS_FLG = false ;
               }
               else
               {
                  if ( A935TBT02_CRF_EDA_NO > AV9P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_repeat_max() )
                  {
                     AV14W_A_CHK_RESULT_SDT_ITEM = (SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem)new SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem(remoteHandle, context);
                     AV14W_A_CHK_RESULT_SDT_ITEM.setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id( "TBM31_REPEAT_MAX" );
                     AV14W_A_CHK_RESULT_SDT_ITEM.setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus( AV20W_FOCUS_FLG );
                     AV13W_A_CHK_RESULT_SDT.add(AV14W_A_CHK_RESULT_SDT_ITEM, 0);
                     AV17W_A_RESULT_MSG_SDT_ITEM = (SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)new SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem(remoteHandle, context);
                     GXt_char1 = "" ;
                     GXv_char2[0] = GXt_char1 ;
                     new a805_pc01_msg_get(remoteHandle, context).execute( "AE00038", "CRF", "繰返し使用中の", "最大繰り返し数を"+GXutil.trim( GXutil.str( A935TBT02_CRF_EDA_NO, 10, 0))+"以下に", "", "", GXv_char2) ;
                     b402_pc15_crf_mst_chk.this.GXt_char1 = GXv_char2[0] ;
                     AV17W_A_RESULT_MSG_SDT_ITEM.setgxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg( GXt_char1 );
                     AV16W_A_RESULT_MSG_SDT.add(AV17W_A_RESULT_MSG_SDT_ITEM, 0);
                     AV20W_FOCUS_FLG = false ;
                  }
               }
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               pr_default.readNext(2);
            }
            pr_default.close(2);
         }
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
      AV28GXLvl375 = (byte)(0) ;
      /* Using cursor P004C5 */
      pr_default.execute(3, new Object[] {new Long(AV9P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_study_id()), new Short(AV9P_BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crf_id())});
      if ( Gx_err != 0 )
      {
         AV28GXLvl375 = (byte)(1) ;
      }
      while ( (pr_default.getStatus(3) != 101) )
      {
         A75TBM32_DEL_FLG = P004C5_A75TBM32_DEL_FLG[0] ;
         n75TBM32_DEL_FLG = P004C5_n75TBM32_DEL_FLG[0] ;
         A71TBM32_CRF_ID = P004C5_A71TBM32_CRF_ID[0] ;
         A70TBM32_STUDY_ID = P004C5_A70TBM32_STUDY_ID[0] ;
         A72TBM32_CRF_ITEM_CD = P004C5_A72TBM32_CRF_ITEM_CD[0] ;
         AV28GXLvl375 = (byte)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(3);
      }
      pr_default.close(3);
      if ( AV28GXLvl375 == 0 )
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

   public void S191( )
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
         GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("1")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void S201( )
   {
      /* 'SUB_ERROR' Routine */
      Application.rollback(context, remoteHandle, "DEFAULT", "b402_pc15_crf_mst_chk");
      new a804_pc01_syslog(remoteHandle, context).execute( AV29Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
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
                  /* Execute user subroutine: S201 */
                  S201 ();
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
      AV13W_A_CHK_RESULT_SDT = new GxObjectCollection(SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem.class, "A_CHK_RESULT_SDT.A_CHK_RESULT_SDTItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      AV16W_A_RESULT_MSG_SDT = new GxObjectCollection(SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem.class, "A_RESULT_MSG_SDT.A_RESULT_MSG_SDTItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      AV8C_APP_ID = "" ;
      AV11W_A_CHK_INFO_SDT = new GxObjectCollection(SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem.class, "A_CHK_INFO_SDT.A_CHK_INFO_SDTItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      A401TBM31_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      P004C2_A69TBM31_CRF_ID = new short[1] ;
      P004C2_A68TBM31_STUDY_ID = new long[1] ;
      AV14W_A_CHK_RESULT_SDT_ITEM = new SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem(remoteHandle, context);
      AV17W_A_RESULT_MSG_SDT_ITEM = new SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem(remoteHandle, context);
      P004C3_A69TBM31_CRF_ID = new short[1] ;
      P004C3_A68TBM31_STUDY_ID = new long[1] ;
      P004C3_A401TBM31_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P004C3_n401TBM31_UPD_DATETIME = new boolean[] {false} ;
      GXv_objcol_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem3 = new GxObjectCollection [1] ;
      AV12W_A_CHK_INFO_SDT_ITEM = new SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem(remoteHandle, context);
      AV21W_SYS_VALUE = "" ;
      P004C4_A89TBT02_STUDY_ID = new long[1] ;
      P004C4_A91TBT02_CRF_ID = new short[1] ;
      P004C4_A935TBT02_CRF_EDA_NO = new byte[1] ;
      P004C4_A90TBT02_SUBJECT_ID = new int[1] ;
      P004C5_A75TBM32_DEL_FLG = new String[] {""} ;
      P004C5_n75TBM32_DEL_FLG = new boolean[] {false} ;
      P004C5_A71TBM32_CRF_ID = new short[1] ;
      P004C5_A70TBM32_STUDY_ID = new long[1] ;
      P004C5_A72TBM32_CRF_ITEM_CD = new String[] {""} ;
      A75TBM32_DEL_FLG = "" ;
      A72TBM32_CRF_ITEM_CD = "" ;
      GXt_char1 = "" ;
      AV15W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      GXv_SdtA_LOGIN_SDT4 = new SdtA_LOGIN_SDT [1] ;
      AV19W_ERRCD = "" ;
      GXv_char2 = new String [1] ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV29Pgmname = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b402_pc15_crf_mst_chk__default(),
         new Object[] {
             new Object[] {
            P004C2_A69TBM31_CRF_ID, P004C2_A68TBM31_STUDY_ID
            }
            , new Object[] {
            P004C3_A69TBM31_CRF_ID, P004C3_A68TBM31_STUDY_ID, P004C3_A401TBM31_UPD_DATETIME, P004C3_n401TBM31_UPD_DATETIME
            }
            , new Object[] {
            P004C4_A89TBT02_STUDY_ID, P004C4_A91TBT02_CRF_ID, P004C4_A935TBT02_CRF_EDA_NO, P004C4_A90TBT02_SUBJECT_ID
            }
            , new Object[] {
            P004C5_A75TBM32_DEL_FLG, P004C5_n75TBM32_DEL_FLG, P004C5_A71TBM32_CRF_ID, P004C5_A70TBM32_STUDY_ID, P004C5_A72TBM32_CRF_ITEM_CD
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV29Pgmname = "B402_PC15_CRF_MST_CHK" ;
      /* GeneXus formulas. */
      AV29Pgmname = "B402_PC15_CRF_MST_CHK" ;
      Gx_err = (short)(0) ;
   }

   private byte AV25GXLvl79 ;
   private byte A935TBT02_CRF_EDA_NO ;
   private byte AV28GXLvl375 ;
   private short A69TBM31_CRF_ID ;
   private short Gx_err ;
   private short AV18W_CRF_ID ;
   private short A91TBT02_CRF_ID ;
   private short A71TBM32_CRF_ID ;
   private int AV26GXV1 ;
   private int A90TBT02_SUBJECT_ID ;
   private int GXActiveErrHndl ;
   private long A68TBM31_STUDY_ID ;
   private long A89TBT02_STUDY_ID ;
   private long A70TBM32_STUDY_ID ;
   private String scmdbuf ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String AV29Pgmname ;
   private String Gx_emsg ;
   private java.util.Date A401TBM31_UPD_DATETIME ;
   private boolean AV10P_DEL_FLG ;
   private boolean returnInSub ;
   private boolean AV20W_FOCUS_FLG ;
   private boolean n401TBM31_UPD_DATETIME ;
   private boolean n75TBM32_DEL_FLG ;
   private String AV8C_APP_ID ;
   private String AV21W_SYS_VALUE ;
   private String A75TBM32_DEL_FLG ;
   private String A72TBM32_CRF_ITEM_CD ;
   private String AV19W_ERRCD ;
   private GxObjectCollection[] aP2 ;
   private GxObjectCollection[] aP3 ;
   private IDataStoreProvider pr_default ;
   private short[] P004C2_A69TBM31_CRF_ID ;
   private long[] P004C2_A68TBM31_STUDY_ID ;
   private short[] P004C3_A69TBM31_CRF_ID ;
   private long[] P004C3_A68TBM31_STUDY_ID ;
   private java.util.Date[] P004C3_A401TBM31_UPD_DATETIME ;
   private boolean[] P004C3_n401TBM31_UPD_DATETIME ;
   private long[] P004C4_A89TBT02_STUDY_ID ;
   private short[] P004C4_A91TBT02_CRF_ID ;
   private byte[] P004C4_A935TBT02_CRF_EDA_NO ;
   private int[] P004C4_A90TBT02_SUBJECT_ID ;
   private String[] P004C5_A75TBM32_DEL_FLG ;
   private boolean[] P004C5_n75TBM32_DEL_FLG ;
   private short[] P004C5_A71TBM32_CRF_ID ;
   private long[] P004C5_A70TBM32_STUDY_ID ;
   private String[] P004C5_A72TBM32_CRF_ITEM_CD ;
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
          new ForEachCursor("P004C2", "SELECT `TBM31_CRF_ID`, `TBM31_STUDY_ID` FROM `TBM31_CRF` WHERE `TBM31_STUDY_ID` = ? and `TBM31_CRF_ID` = ? ORDER BY `TBM31_STUDY_ID`, `TBM31_CRF_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P004C3", "SELECT `TBM31_CRF_ID`, `TBM31_STUDY_ID`, `TBM31_UPD_DATETIME` FROM `TBM31_CRF` WHERE `TBM31_STUDY_ID` = ? and `TBM31_CRF_ID` = ? ORDER BY `TBM31_STUDY_ID`, `TBM31_CRF_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P004C4", "SELECT `TBT02_STUDY_ID`, `TBT02_CRF_ID`, `TBT02_CRF_EDA_NO`, `TBT02_SUBJECT_ID` FROM `TBT02_CRF` WHERE (`TBT02_STUDY_ID` = ?) AND (`TBT02_CRF_ID` = ?) ORDER BY `TBT02_CRF_EDA_NO` DESC  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P004C5", "SELECT `TBM32_DEL_FLG`, `TBM32_CRF_ID`, `TBM32_STUDY_ID`, `TBM32_CRF_ITEM_CD` FROM `TBM32_CRF_ITEM` WHERE (`TBM32_STUDY_ID` = ? and `TBM32_CRF_ID` = ?) AND (`TBM32_DEL_FLG` = '0') ORDER BY `TBM32_STUDY_ID`, `TBM32_CRF_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((byte[]) buf[2])[0] = rslt.getByte(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2) ;
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
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
      }
   }

}

