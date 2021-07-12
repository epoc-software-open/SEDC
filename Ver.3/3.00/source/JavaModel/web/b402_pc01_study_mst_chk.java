/*
               File: B402_PC01_STUDY_MST_CHK
        Description: 試験マスタ入力チェック
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:19:10.86
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b402_pc01_study_mst_chk extends GXProcedure
{
   public b402_pc01_study_mst_chk( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b402_pc01_study_mst_chk.class ), "" );
   }

   public b402_pc01_study_mst_chk( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public GxObjectCollection executeUdp( SdtTBM21_STUDY aP0 ,
                                         boolean aP1 ,
                                         byte[] aP2 ,
                                         GxObjectCollection[] aP3 )
   {
      b402_pc01_study_mst_chk.this.AV9P_BC_STUDY = aP0;
      b402_pc01_study_mst_chk.this.AV24P_DEL_FLG = aP1;
      b402_pc01_study_mst_chk.this.aP2 = aP2;
      b402_pc01_study_mst_chk.this.aP3 = aP3;
      b402_pc01_study_mst_chk.this.aP4 = aP4;
      b402_pc01_study_mst_chk.this.aP4 = new GxObjectCollection[] {new GxObjectCollection()};
      initialize();
      privateExecute();
      return aP4[0];
   }

   public void execute( SdtTBM21_STUDY aP0 ,
                        boolean aP1 ,
                        byte[] aP2 ,
                        GxObjectCollection[] aP3 ,
                        GxObjectCollection[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( SdtTBM21_STUDY aP0 ,
                             boolean aP1 ,
                             byte[] aP2 ,
                             GxObjectCollection[] aP3 ,
                             GxObjectCollection[] aP4 )
   {
      b402_pc01_study_mst_chk.this.AV9P_BC_STUDY = aP0;
      b402_pc01_study_mst_chk.this.AV24P_DEL_FLG = aP1;
      b402_pc01_study_mst_chk.this.aP2 = aP2;
      b402_pc01_study_mst_chk.this.aP3 = aP3;
      b402_pc01_study_mst_chk.this.aP4 = aP4;
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
      AV13W_A_CHK_INFO_SDT.clear();
      AV15W_A_CHK_RESULT_SDT.clear();
      AV18W_A_RESULT_MSG_SDT.clear();
      AV21W_FOCUS_FLG = true ;
      AV22W_RTN_CD = (byte)(0) ;
      /* Execute user subroutine: S111 */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( AV24P_DEL_FLG )
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
      if ( ! (0==AV9P_BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_study_id()) )
      {
         if ( GXutil.strcmp(AV9P_BC_STUDY.GetMode(), "INS") == 0 )
         {
            /* Using cursor P001T2 */
            pr_default.execute(0, new Object[] {new Long(AV9P_BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_study_id())});
            while ( (pr_default.getStatus(0) != 101) )
            {
               A63TBM21_STUDY_ID = P001T2_A63TBM21_STUDY_ID[0] ;
               AV16W_A_CHK_RESULT_SDT_ITEM = (SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem)new SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem(remoteHandle, context);
               AV16W_A_CHK_RESULT_SDT_ITEM.setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id( "TBM21_STUDY_ID" );
               AV16W_A_CHK_RESULT_SDT_ITEM.setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus( AV21W_FOCUS_FLG );
               AV15W_A_CHK_RESULT_SDT.add(AV16W_A_CHK_RESULT_SDT_ITEM, 0);
               AV19W_A_RESULT_MSG_SDT_ITEM = (SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)new SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem(remoteHandle, context);
               GXt_char1 = "" ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AX00100", "", "", "", "", "", GXv_char2) ;
               b402_pc01_study_mst_chk.this.GXt_char1 = GXv_char2[0] ;
               AV19W_A_RESULT_MSG_SDT_ITEM.setgxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg( GXt_char1 );
               AV18W_A_RESULT_MSG_SDT.add(AV19W_A_RESULT_MSG_SDT_ITEM, 0);
               AV21W_FOCUS_FLG = false ;
               AV22W_RTN_CD = (byte)(1) ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(0);
         }
         else
         {
            AV30GXLvl81 = (byte)(0) ;
            /* Using cursor P001T3 */
            pr_default.execute(1, new Object[] {new Long(AV9P_BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_study_id())});
            if ( Gx_err != 0 )
            {
               AV30GXLvl81 = (byte)(1) ;
            }
            while ( (pr_default.getStatus(1) != 101) )
            {
               A63TBM21_STUDY_ID = P001T3_A63TBM21_STUDY_ID[0] ;
               A373TBM21_UPD_DATETIME = P001T3_A373TBM21_UPD_DATETIME[0] ;
               n373TBM21_UPD_DATETIME = P001T3_n373TBM21_UPD_DATETIME[0] ;
               AV30GXLvl81 = (byte)(1) ;
               if ( !( AV9P_BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_upd_datetime().equals( A373TBM21_UPD_DATETIME ) ) )
               {
                  AV16W_A_CHK_RESULT_SDT_ITEM = (SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem)new SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem(remoteHandle, context);
                  AV16W_A_CHK_RESULT_SDT_ITEM.setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id( "TBM21_STUDY_ID" );
                  AV16W_A_CHK_RESULT_SDT_ITEM.setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus( false );
                  AV15W_A_CHK_RESULT_SDT.add(AV16W_A_CHK_RESULT_SDT_ITEM, 0);
                  AV19W_A_RESULT_MSG_SDT_ITEM = (SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)new SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem(remoteHandle, context);
                  GXt_char1 = "" ;
                  GXv_char2[0] = GXt_char1 ;
                  new a805_pc01_msg_get(remoteHandle, context).execute( "AX00007", "", "", "", "", "", GXv_char2) ;
                  b402_pc01_study_mst_chk.this.GXt_char1 = GXv_char2[0] ;
                  AV19W_A_RESULT_MSG_SDT_ITEM.setgxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg( GXt_char1 );
                  AV18W_A_RESULT_MSG_SDT.add(AV19W_A_RESULT_MSG_SDT_ITEM, 0);
                  AV22W_RTN_CD = (byte)(1) ;
               }
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(1);
            if ( AV30GXLvl81 == 0 )
            {
               AV16W_A_CHK_RESULT_SDT_ITEM = (SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem)new SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem(remoteHandle, context);
               AV16W_A_CHK_RESULT_SDT_ITEM.setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id( "TBM21_STUDY_ID" );
               AV16W_A_CHK_RESULT_SDT_ITEM.setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus( false );
               AV15W_A_CHK_RESULT_SDT.add(AV16W_A_CHK_RESULT_SDT_ITEM, 0);
               AV19W_A_RESULT_MSG_SDT_ITEM = (SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)new SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem(remoteHandle, context);
               GXt_char1 = "" ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AX00102", "", "", "", "", "", GXv_char2) ;
               b402_pc01_study_mst_chk.this.GXt_char1 = GXv_char2[0] ;
               AV19W_A_RESULT_MSG_SDT_ITEM.setgxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg( GXt_char1 );
               AV18W_A_RESULT_MSG_SDT.add(AV19W_A_RESULT_MSG_SDT_ITEM, 0);
               AV22W_RTN_CD = (byte)(1) ;
            }
         }
      }
   }

   public void S121( )
   {
      /* 'SUB_DELETE_CHK' Routine */
      if ( GXutil.strcmp(AV9P_BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_status_Z(), "1") == 0 )
      {
         AV19W_A_RESULT_MSG_SDT_ITEM = (SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)new SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem(remoteHandle, context);
         GXt_char1 = "" ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00073", "", "", "", "", "", GXv_char2) ;
         b402_pc01_study_mst_chk.this.GXt_char1 = GXv_char2[0] ;
         AV19W_A_RESULT_MSG_SDT_ITEM.setgxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg( GXt_char1 );
         AV18W_A_RESULT_MSG_SDT.add(AV19W_A_RESULT_MSG_SDT_ITEM, 0);
         AV22W_RTN_CD = (byte)(1) ;
      }
   }

   public void S131( )
   {
      /* 'SUB_ATTRIBUTE_CHK' Routine */
      /* Execute user subroutine: S141 */
      S141 ();
      if (returnInSub) return;
      GXv_objcol_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem3[0] = AV13W_A_CHK_INFO_SDT ;
      new a823_pc01_data_tyep_check(remoteHandle, context).execute( GXv_objcol_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem3) ;
      AV13W_A_CHK_INFO_SDT = GXv_objcol_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem3[0] ;
      AV31GXV1 = 1 ;
      while ( AV31GXV1 <= AV13W_A_CHK_INFO_SDT.size() )
      {
         AV14W_A_CHK_INFO_SDT_ITEM = (SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)((SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)AV13W_A_CHK_INFO_SDT.elementAt(-1+AV31GXV1));
         if ( AV14W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result() != 0 )
         {
            AV16W_A_CHK_RESULT_SDT_ITEM = (SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem)new SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem(remoteHandle, context);
            AV16W_A_CHK_RESULT_SDT_ITEM.setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id( AV14W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id() );
            AV16W_A_CHK_RESULT_SDT_ITEM.setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus( AV21W_FOCUS_FLG );
            AV15W_A_CHK_RESULT_SDT.add(AV16W_A_CHK_RESULT_SDT_ITEM, 0);
            AV19W_A_RESULT_MSG_SDT_ITEM = (SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)new SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem(remoteHandle, context);
            AV19W_A_RESULT_MSG_SDT_ITEM.setgxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg( AV14W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result_msg() );
            AV18W_A_RESULT_MSG_SDT.add(AV19W_A_RESULT_MSG_SDT_ITEM, 0);
            AV21W_FOCUS_FLG = false ;
            AV22W_RTN_CD = (byte)(1) ;
         }
         AV31GXV1 = (int)(AV31GXV1+1) ;
      }
   }

   public void S141( )
   {
      /* 'SUB_CHK_INFO_SET' Routine */
      AV14W_A_CHK_INFO_SDT_ITEM = (SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)new SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem(remoteHandle, context);
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id( "TBM21_STUDY_ID" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm( "試験ID" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_num( DecimalUtil.doubleToDec(AV9P_BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_study_id()) );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn( "NUM" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( (byte)(1) );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_unit( DecimalUtil.doubleToDec(0) );
      AV13W_A_CHK_INFO_SDT.add(AV14W_A_CHK_INFO_SDT_ITEM, 0);
      AV14W_A_CHK_INFO_SDT_ITEM = (SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)new SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem(remoteHandle, context);
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id( "TBM21_STUDY_NM" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm( "試験名" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str( AV9P_BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_study_nm() );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn( "STR" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( (byte)(1) );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte( (short)(100) );
      AV13W_A_CHK_INFO_SDT.add(AV14W_A_CHK_INFO_SDT_ITEM, 0);
      AV14W_A_CHK_INFO_SDT_ITEM = (SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)new SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem(remoteHandle, context);
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id( "TBM21_OUTER_STUDY_ID" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm( "外部試験ID" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str( AV9P_BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_outer_study_id() );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn( "STR_ALPNUM" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( (byte)(0) );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte( (short)(20) );
      AV13W_A_CHK_INFO_SDT.add(AV14W_A_CHK_INFO_SDT_ITEM, 0);
      AV14W_A_CHK_INFO_SDT_ITEM = (SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)new SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem(remoteHandle, context);
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id( "TBM21_PROC_NM" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm( "プロトコール名" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str( AV9P_BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_proc_nm() );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn( "STR" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( (byte)(0) );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte( (short)(100) );
      AV13W_A_CHK_INFO_SDT.add(AV14W_A_CHK_INFO_SDT_ITEM, 0);
      AV14W_A_CHK_INFO_SDT_ITEM = (SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)new SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem(remoteHandle, context);
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id( "TBM21_NOTE" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm( "備考" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str( AV9P_BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_note() );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn( "STR" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( (byte)(0) );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte( (short)(1000) );
      AV13W_A_CHK_INFO_SDT.add(AV14W_A_CHK_INFO_SDT_ITEM, 0);
   }

   public void S151( )
   {
      /* 'SUB_ITEM_CHK' Routine */
   }

   public void S161( )
   {
      /* 'SUB_SPECIAL_CHK' Routine */
      if ( ( GXutil.strcmp(AV9P_BC_STUDY.GetMode(), "INS") != 0 ) && ( GXutil.strcmp(AV9P_BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_status_Z(), AV9P_BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_status()) != 0 ) )
      {
         if ( ((GXutil.strcmp(AV9P_BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_status(), "0")==0)||(GXutil.strcmp(AV9P_BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_status(), "2")==0)||(GXutil.strcmp(AV9P_BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_status(), "9")==0)) )
         {
            /* Execute user subroutine: S171 */
            S171 ();
            if (returnInSub) return;
         }
         else if ( ((GXutil.strcmp(AV9P_BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_status(), "1")==0)) )
         {
            /* Execute user subroutine: S181 */
            S181 ();
            if (returnInSub) return;
         }
      }
      if ( ( GXutil.strcmp(AV9P_BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_del_flg(), "0") != 0 ) && ( GXutil.strcmp(AV9P_BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_status_Z(), "1") == 0 ) )
      {
         AV16W_A_CHK_RESULT_SDT_ITEM = (SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem)new SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem(remoteHandle, context);
         AV16W_A_CHK_RESULT_SDT_ITEM.setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id( "TBM21_DEL_FLG" );
         AV16W_A_CHK_RESULT_SDT_ITEM.setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus( AV21W_FOCUS_FLG );
         AV15W_A_CHK_RESULT_SDT.add(AV16W_A_CHK_RESULT_SDT_ITEM, 0);
         AV19W_A_RESULT_MSG_SDT_ITEM = (SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)new SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem(remoteHandle, context);
         GXt_char1 = "" ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00072", "", "", "", "", "", GXv_char2) ;
         b402_pc01_study_mst_chk.this.GXt_char1 = GXv_char2[0] ;
         AV19W_A_RESULT_MSG_SDT_ITEM.setgxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg( GXt_char1 );
         AV18W_A_RESULT_MSG_SDT.add(AV19W_A_RESULT_MSG_SDT_ITEM, 0);
         AV21W_FOCUS_FLG = false ;
         AV22W_RTN_CD = (byte)(1) ;
      }
   }

   public void S171( )
   {
      /* 'SUB_CRF_LOCK_CHK' Routine */
   }

   public void S181( )
   {
      /* 'SUB_STUDY_START_CHK' Routine */
      if ( GXutil.strcmp(AV9P_BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_del_flg(), "0") != 0 )
      {
         AV16W_A_CHK_RESULT_SDT_ITEM = (SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem)new SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem(remoteHandle, context);
         AV16W_A_CHK_RESULT_SDT_ITEM.setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id( "TBM21_STATUS" );
         AV16W_A_CHK_RESULT_SDT_ITEM.setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus( AV21W_FOCUS_FLG );
         AV15W_A_CHK_RESULT_SDT.add(AV16W_A_CHK_RESULT_SDT_ITEM, 0);
         AV19W_A_RESULT_MSG_SDT_ITEM = (SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)new SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem(remoteHandle, context);
         GXt_char1 = "" ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00069", "", "", "", "", "", GXv_char2) ;
         b402_pc01_study_mst_chk.this.GXt_char1 = GXv_char2[0] ;
         AV19W_A_RESULT_MSG_SDT_ITEM.setgxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg( GXt_char1 );
         AV18W_A_RESULT_MSG_SDT.add(AV19W_A_RESULT_MSG_SDT_ITEM, 0);
         AV21W_FOCUS_FLG = false ;
         AV22W_RTN_CD = (byte)(1) ;
      }
      AV32GXLvl351 = (byte)(0) ;
      /* Using cursor P001T4 */
      pr_default.execute(2, new Object[] {new Long(AV9P_BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_study_id())});
      if ( Gx_err != 0 )
      {
         AV32GXLvl351 = (byte)(1) ;
      }
      while ( (pr_default.getStatus(2) != 101) )
      {
         A397TBM31_DEL_FLG = P001T4_A397TBM31_DEL_FLG[0] ;
         n397TBM31_DEL_FLG = P001T4_n397TBM31_DEL_FLG[0] ;
         A643TBM31_STATUS = P001T4_A643TBM31_STATUS[0] ;
         n643TBM31_STATUS = P001T4_n643TBM31_STATUS[0] ;
         A68TBM31_STUDY_ID = P001T4_A68TBM31_STUDY_ID[0] ;
         A69TBM31_CRF_ID = P001T4_A69TBM31_CRF_ID[0] ;
         AV32GXLvl351 = (byte)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      if ( AV32GXLvl351 == 0 )
      {
         AV16W_A_CHK_RESULT_SDT_ITEM = (SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem)new SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem(remoteHandle, context);
         AV16W_A_CHK_RESULT_SDT_ITEM.setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id( "TBM21_STATUS" );
         AV16W_A_CHK_RESULT_SDT_ITEM.setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus( AV21W_FOCUS_FLG );
         AV15W_A_CHK_RESULT_SDT.add(AV16W_A_CHK_RESULT_SDT_ITEM, 0);
         AV19W_A_RESULT_MSG_SDT_ITEM = (SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)new SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem(remoteHandle, context);
         GXt_char1 = "" ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00071", "", "", "", "", "", GXv_char2) ;
         b402_pc01_study_mst_chk.this.GXt_char1 = GXv_char2[0] ;
         AV19W_A_RESULT_MSG_SDT_ITEM.setgxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg( GXt_char1 );
         AV18W_A_RESULT_MSG_SDT.add(AV19W_A_RESULT_MSG_SDT_ITEM, 0);
         AV21W_FOCUS_FLG = false ;
      }
      AV10P_DATETIME = GXutil.now( ) ;
      AV11P_SESSION_ID = AV23W_SESSION.getId() ;
      AV12P_STUDY_ID = AV9P_BC_STUDY.getgxTv_SdtTBM21_STUDY_Tbm21_study_id() ;
      W_err_cd_int2_0 = (byte)(0) ;
      /* Using cursor P001T5 */
      pr_default.execute(3, new Object[] {new Byte(W_err_cd_int2_0), new Long(AV12P_STUDY_ID), AV11P_SESSION_ID, AV10P_DATETIME});
      W_err_cd_int2_0 = P001T5_AW_err_cd_int2_0[0] ;
      AV12P_STUDY_ID = P001T5_AV12P_STUDY_ID[0] ;
      AV11P_SESSION_ID = P001T5_AV11P_SESSION_ID[0] ;
      AV10P_DATETIME = P001T5_AV10P_DATETIME[0] ;
      AV25W_ERR_CD = W_err_cd_int2_0 ;
      if ( AV25W_ERR_CD != 0 )
      {
         /* Using cursor P001T6 */
         pr_default.execute(4, new Object[] {AV11P_SESSION_ID, AV10P_DATETIME});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A180TBW12_DATETIME = P001T6_A180TBW12_DATETIME[0] ;
            A179TBW12_SESSION_ID = P001T6_A179TBW12_SESSION_ID[0] ;
            A776TBW12_ERR_DIV = P001T6_A776TBW12_ERR_DIV[0] ;
            n776TBW12_ERR_DIV = P001T6_n776TBW12_ERR_DIV[0] ;
            A777TBW12_ERR_MSG = P001T6_A777TBW12_ERR_MSG[0] ;
            n777TBW12_ERR_MSG = P001T6_n777TBW12_ERR_MSG[0] ;
            A181TBW12_SEQ = P001T6_A181TBW12_SEQ[0] ;
            if ( A776TBW12_ERR_DIV == 1 )
            {
               AV22W_RTN_CD = (byte)(1) ;
            }
            if ( ( A776TBW12_ERR_DIV == 2 ) && ( AV22W_RTN_CD == 0 ) )
            {
               AV22W_RTN_CD = (byte)(2) ;
            }
            AV19W_A_RESULT_MSG_SDT_ITEM = (SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)new SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem(remoteHandle, context);
            AV19W_A_RESULT_MSG_SDT_ITEM.setgxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg( A777TBW12_ERR_MSG );
            AV18W_A_RESULT_MSG_SDT.add(AV19W_A_RESULT_MSG_SDT_ITEM, 0);
            /* Using cursor P001T7 */
            pr_default.execute(5, new Object[] {A179TBW12_SESSION_ID, A180TBW12_DATETIME, new Short(A181TBW12_SEQ)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TBW12_CRF_ERR_MSG") ;
            pr_default.readNext(4);
         }
         pr_default.close(4);
         Application.commit(context, remoteHandle, "DEFAULT", "b402_pc01_study_mst_chk");
      }
   }

   public void S191( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT4[0] = AV17W_A_LOGIN_SDT;
      GXv_char2[0] = AV20W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT4, GXv_char2) ;
      AV17W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT4[0] ;
      b402_pc01_study_mst_chk.this.AV20W_ERRCD = GXv_char2[0] ;
      if ( GXutil.strcmp(AV20W_ERRCD, "0") != 0 )
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
      new a804_pc01_syslog(remoteHandle, context).execute( AV34Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   protected void cleanup( )
   {
      this.aP2[0] = b402_pc01_study_mst_chk.this.AV22W_RTN_CD;
      this.aP3[0] = b402_pc01_study_mst_chk.this.AV15W_A_CHK_RESULT_SDT;
      this.aP4[0] = b402_pc01_study_mst_chk.this.AV18W_A_RESULT_MSG_SDT;
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
      AV15W_A_CHK_RESULT_SDT = new GxObjectCollection(SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem.class, "A_CHK_RESULT_SDT.A_CHK_RESULT_SDTItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      AV18W_A_RESULT_MSG_SDT = new GxObjectCollection(SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem.class, "A_RESULT_MSG_SDT.A_RESULT_MSG_SDTItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      AV8C_APP_ID = "" ;
      AV13W_A_CHK_INFO_SDT = new GxObjectCollection(SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem.class, "A_CHK_INFO_SDT.A_CHK_INFO_SDTItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      A373TBM21_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      P001T2_A63TBM21_STUDY_ID = new long[1] ;
      AV16W_A_CHK_RESULT_SDT_ITEM = new SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem(remoteHandle, context);
      AV19W_A_RESULT_MSG_SDT_ITEM = new SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem(remoteHandle, context);
      P001T3_A63TBM21_STUDY_ID = new long[1] ;
      P001T3_A373TBM21_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P001T3_n373TBM21_UPD_DATETIME = new boolean[] {false} ;
      GXv_objcol_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem3 = new GxObjectCollection [1] ;
      AV14W_A_CHK_INFO_SDT_ITEM = new SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem(remoteHandle, context);
      P001T4_A397TBM31_DEL_FLG = new String[] {""} ;
      P001T4_n397TBM31_DEL_FLG = new boolean[] {false} ;
      P001T4_A643TBM31_STATUS = new String[] {""} ;
      P001T4_n643TBM31_STATUS = new boolean[] {false} ;
      P001T4_A68TBM31_STUDY_ID = new long[1] ;
      P001T4_A69TBM31_CRF_ID = new short[1] ;
      A397TBM31_DEL_FLG = "" ;
      A643TBM31_STATUS = "" ;
      GXt_char1 = "" ;
      AV10P_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      AV11P_SESSION_ID = "" ;
      AV23W_SESSION = httpContext.getWebSession();
      P001T5_AW_err_cd_int2_0 = new byte[1] ;
      P001T5_AV12P_STUDY_ID = new long[1] ;
      P001T5_AV11P_SESSION_ID = new String[] {""} ;
      P001T5_AV10P_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P001T6_A180TBW12_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P001T6_A179TBW12_SESSION_ID = new String[] {""} ;
      P001T6_A776TBW12_ERR_DIV = new byte[1] ;
      P001T6_n776TBW12_ERR_DIV = new boolean[] {false} ;
      P001T6_A777TBW12_ERR_MSG = new String[] {""} ;
      P001T6_n777TBW12_ERR_MSG = new boolean[] {false} ;
      P001T6_A181TBW12_SEQ = new short[1] ;
      A180TBW12_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A179TBW12_SESSION_ID = "" ;
      A777TBW12_ERR_MSG = "" ;
      AV17W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      GXv_SdtA_LOGIN_SDT4 = new SdtA_LOGIN_SDT [1] ;
      AV20W_ERRCD = "" ;
      GXv_char2 = new String [1] ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV34Pgmname = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b402_pc01_study_mst_chk__default(),
         new Object[] {
             new Object[] {
            P001T2_A63TBM21_STUDY_ID
            }
            , new Object[] {
            P001T3_A63TBM21_STUDY_ID, P001T3_A373TBM21_UPD_DATETIME, P001T3_n373TBM21_UPD_DATETIME
            }
            , new Object[] {
            P001T4_A397TBM31_DEL_FLG, P001T4_n397TBM31_DEL_FLG, P001T4_A643TBM31_STATUS, P001T4_n643TBM31_STATUS, P001T4_A68TBM31_STUDY_ID, P001T4_A69TBM31_CRF_ID
            }
            , new Object[] {
            P001T5_AW_err_cd_int2_0, P001T5_AV12P_STUDY_ID, P001T5_AV11P_SESSION_ID, P001T5_AV10P_DATETIME
            }
            , new Object[] {
            P001T6_A180TBW12_DATETIME, P001T6_A179TBW12_SESSION_ID, P001T6_A776TBW12_ERR_DIV, P001T6_n776TBW12_ERR_DIV, P001T6_A777TBW12_ERR_MSG, P001T6_n777TBW12_ERR_MSG, P001T6_A181TBW12_SEQ
            }
            , new Object[] {
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV34Pgmname = "B402_PC01_STUDY_MST_CHK" ;
      /* GeneXus formulas. */
      AV34Pgmname = "B402_PC01_STUDY_MST_CHK" ;
      Gx_err = (short)(0) ;
   }

   private byte AV22W_RTN_CD ;
   private byte AV30GXLvl81 ;
   private byte AV32GXLvl351 ;
   private byte W_err_cd_int2_0 ;
   private byte AV25W_ERR_CD ;
   private byte A776TBW12_ERR_DIV ;
   private short Gx_err ;
   private short A69TBM31_CRF_ID ;
   private short A181TBW12_SEQ ;
   private int AV31GXV1 ;
   private int GXActiveErrHndl ;
   private long A63TBM21_STUDY_ID ;
   private long A68TBM31_STUDY_ID ;
   private long AV12P_STUDY_ID ;
   private String scmdbuf ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String AV34Pgmname ;
   private String Gx_emsg ;
   private java.util.Date A373TBM21_UPD_DATETIME ;
   private java.util.Date AV10P_DATETIME ;
   private java.util.Date A180TBW12_DATETIME ;
   private boolean AV24P_DEL_FLG ;
   private boolean returnInSub ;
   private boolean AV21W_FOCUS_FLG ;
   private boolean n373TBM21_UPD_DATETIME ;
   private boolean n397TBM31_DEL_FLG ;
   private boolean n643TBM31_STATUS ;
   private boolean n776TBW12_ERR_DIV ;
   private boolean n777TBW12_ERR_MSG ;
   private String AV8C_APP_ID ;
   private String A397TBM31_DEL_FLG ;
   private String A643TBM31_STATUS ;
   private String AV11P_SESSION_ID ;
   private String A179TBW12_SESSION_ID ;
   private String A777TBW12_ERR_MSG ;
   private String AV20W_ERRCD ;
   private com.genexus.webpanels.WebSession AV23W_SESSION ;
   private byte[] aP2 ;
   private GxObjectCollection[] aP3 ;
   private GxObjectCollection[] aP4 ;
   private IDataStoreProvider pr_default ;
   private long[] P001T2_A63TBM21_STUDY_ID ;
   private long[] P001T3_A63TBM21_STUDY_ID ;
   private java.util.Date[] P001T3_A373TBM21_UPD_DATETIME ;
   private boolean[] P001T3_n373TBM21_UPD_DATETIME ;
   private String[] P001T4_A397TBM31_DEL_FLG ;
   private boolean[] P001T4_n397TBM31_DEL_FLG ;
   private String[] P001T4_A643TBM31_STATUS ;
   private boolean[] P001T4_n643TBM31_STATUS ;
   private long[] P001T4_A68TBM31_STUDY_ID ;
   private short[] P001T4_A69TBM31_CRF_ID ;
   private byte[] P001T5_AW_err_cd_int2_0 ;
   private long[] P001T5_AV12P_STUDY_ID ;
   private String[] P001T5_AV11P_SESSION_ID ;
   private java.util.Date[] P001T5_AV10P_DATETIME ;
   private java.util.Date[] P001T6_A180TBW12_DATETIME ;
   private String[] P001T6_A179TBW12_SESSION_ID ;
   private byte[] P001T6_A776TBW12_ERR_DIV ;
   private boolean[] P001T6_n776TBW12_ERR_DIV ;
   private String[] P001T6_A777TBW12_ERR_MSG ;
   private boolean[] P001T6_n777TBW12_ERR_MSG ;
   private short[] P001T6_A181TBW12_SEQ ;
   private GxObjectCollection AV15W_A_CHK_RESULT_SDT ;
   private GxObjectCollection AV18W_A_RESULT_MSG_SDT ;
   private GxObjectCollection AV13W_A_CHK_INFO_SDT ;
   private GxObjectCollection GXv_objcol_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem3[] ;
   private SdtTBM21_STUDY AV9P_BC_STUDY ;
   private SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem AV14W_A_CHK_INFO_SDT_ITEM ;
   private SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem AV16W_A_CHK_RESULT_SDT_ITEM ;
   private SdtA_LOGIN_SDT AV17W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT4[] ;
   private SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem AV19W_A_RESULT_MSG_SDT_ITEM ;
}

final  class b402_pc01_study_mst_chk__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001T2", "SELECT `TBM21_STUDY_ID` FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ORDER BY `TBM21_STUDY_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P001T3", "SELECT `TBM21_STUDY_ID`, `TBM21_UPD_DATETIME` FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ORDER BY `TBM21_STUDY_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P001T4", "SELECT `TBM31_DEL_FLG`, `TBM31_STATUS`, `TBM31_STUDY_ID`, `TBM31_CRF_ID` FROM `TBM31_CRF` WHERE (`TBM31_STUDY_ID` = ?) AND (`TBM31_STATUS` = '1') AND (`TBM31_DEL_FLG` = '0') ORDER BY `TBM31_STUDY_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new CallCursor("P001T5", "CALL PROC_CHK_CRF ( ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK,0)
         ,new ForEachCursor("P001T6", "SELECT `TBW12_DATETIME`, `TBW12_SESSION_ID`, `TBW12_ERR_DIV`, `TBW12_ERR_MSG`, `TBW12_SEQ` FROM `TBW12_CRF_ERR_MSG` WHERE `TBW12_SESSION_ID` = ? and `TBW12_DATETIME` = ? ORDER BY `TBW12_SESSION_ID`, `TBW12_DATETIME`  FOR UPDATE ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new UpdateCursor("P001T7", "DELETE FROM `TBW12_CRF_ERR_MSG`  WHERE `TBW12_SESSION_ID` = ? AND `TBW12_DATETIME` = ? AND `TBW12_SEQ` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
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
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(3) ;
               ((short[]) buf[5])[0] = rslt.getShort(4) ;
               return;
            case 3 :
               ((byte[]) buf[0])[0] = rslt.getByte(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               return;
            case 4 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((byte[]) buf[2])[0] = rslt.getByte(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5) ;
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
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 3 :
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 1 , Types.NUMERIC, 0 );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 2 , Types.NUMERIC, 0 );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 3 , Types.VARCHAR );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 4 , Types.TIMESTAMP );
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setVarchar(3, (String)parms[2], 50);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 50);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

