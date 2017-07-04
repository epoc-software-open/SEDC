/*
               File: B202_PC01_IMAGE_MST_CHK
        Description: 画像マスタ入力チェック
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:55:53.3
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b202_pc01_image_mst_chk extends GXProcedure
{
   public b202_pc01_image_mst_chk( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b202_pc01_image_mst_chk.class ), "" );
   }

   public b202_pc01_image_mst_chk( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public GxObjectCollection executeUdp( SdtTBM11_IMAGE aP0 ,
                                         boolean aP1 ,
                                         boolean[] aP2 ,
                                         GxObjectCollection[] aP3 )
   {
      b202_pc01_image_mst_chk.this.AV9P_BC_IMAGE = aP0;
      b202_pc01_image_mst_chk.this.AV27P_DEL_FLG = aP1;
      b202_pc01_image_mst_chk.this.aP4 = new GxObjectCollection[] {new GxObjectCollection()};
      initialize();
      privateExecute();
      return aP4[0];
   }

   public void execute( SdtTBM11_IMAGE aP0 ,
                        boolean aP1 ,
                        boolean[] aP2 ,
                        GxObjectCollection[] aP3 ,
                        GxObjectCollection[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( SdtTBM11_IMAGE aP0 ,
                             boolean aP1 ,
                             boolean[] aP2 ,
                             GxObjectCollection[] aP3 ,
                             GxObjectCollection[] aP4 )
   {
      b202_pc01_image_mst_chk.this.AV9P_BC_IMAGE = aP0;
      b202_pc01_image_mst_chk.this.AV27P_DEL_FLG = aP1;
      b202_pc01_image_mst_chk.this.aP2 = aP2;
      b202_pc01_image_mst_chk.this.aP3 = aP3;
      b202_pc01_image_mst_chk.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8C_APP_ID = "B202" ;
      /* Execute user subroutine: S16320 */
      S16320 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV10W_A_CHK_INFO_SDT.clear();
      AV12W_A_CHK_RESULT_SDT.clear();
      AV15W_A_RESULT_MSG_SDT.clear();
      AV25W_FOCUS_FLG = true ;
      AV24W_FILEUP_ERR_FLG = false ;
      /* Execute user subroutine: S1149 */
      S1149 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( ! AV27P_DEL_FLG )
      {
         /* Execute user subroutine: S12115 */
         S12115 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: S14194 */
         S14194 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: S15226 */
         S15226 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      cleanup();
   }

   public void S1149( )
   {
      /* 'SUB_MST_CHK' Routine */
      if ( ! (GXutil.strcmp("", AV9P_BC_IMAGE.getgxTv_SdtTBM11_IMAGE_Tbm11_image_cd())==0) )
      {
         if ( GXutil.strcmp(AV9P_BC_IMAGE.GetMode(), "INS") == 0 )
         {
            /* Using cursor P00562 */
            pr_default.execute(0, new Object[] {AV9P_BC_IMAGE.getgxTv_SdtTBM11_IMAGE_Tbm11_image_cd()});
            while ( (pr_default.getStatus(0) != 101) )
            {
               A411TBM11_IMAGE_CD = P00562_A411TBM11_IMAGE_CD[0] ;
               AV13W_A_CHK_RESULT_SDT_ITEM = (SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem)new SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem(remoteHandle, context);
               AV13W_A_CHK_RESULT_SDT_ITEM.setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id( "TBM11_IMAGE_CD" );
               AV13W_A_CHK_RESULT_SDT_ITEM.setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus( AV25W_FOCUS_FLG );
               AV12W_A_CHK_RESULT_SDT.add(AV13W_A_CHK_RESULT_SDT_ITEM, 0);
               AV16W_A_RESULT_MSG_SDT_ITEM = (SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)new SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem(remoteHandle, context);
               GXt_char1 = "" ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AX00100", "", "", "", "", "", GXv_char2) ;
               b202_pc01_image_mst_chk.this.GXt_char1 = GXv_char2[0] ;
               AV16W_A_RESULT_MSG_SDT_ITEM.setgxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg( GXt_char1 );
               AV15W_A_RESULT_MSG_SDT.add(AV16W_A_RESULT_MSG_SDT_ITEM, 0);
               AV25W_FOCUS_FLG = false ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(0);
         }
         else
         {
            AV31GXLvl77 = (byte)(0) ;
            /* Using cursor P00563 */
            pr_default.execute(1, new Object[] {AV9P_BC_IMAGE.getgxTv_SdtTBM11_IMAGE_Tbm11_image_cd()});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A411TBM11_IMAGE_CD = P00563_A411TBM11_IMAGE_CD[0] ;
               A418TBM11_UPD_DATETIME = P00563_A418TBM11_UPD_DATETIME[0] ;
               n418TBM11_UPD_DATETIME = P00563_n418TBM11_UPD_DATETIME[0] ;
               AV31GXLvl77 = (byte)(1) ;
               if ( !( AV9P_BC_IMAGE.getgxTv_SdtTBM11_IMAGE_Tbm11_upd_datetime().equals( A418TBM11_UPD_DATETIME ) ) )
               {
                  AV13W_A_CHK_RESULT_SDT_ITEM = (SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem)new SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem(remoteHandle, context);
                  AV13W_A_CHK_RESULT_SDT_ITEM.setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id( "TBM11_IMAGE_CD" );
                  AV13W_A_CHK_RESULT_SDT_ITEM.setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus( false );
                  AV12W_A_CHK_RESULT_SDT.add(AV13W_A_CHK_RESULT_SDT_ITEM, 0);
                  AV16W_A_RESULT_MSG_SDT_ITEM = (SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)new SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem(remoteHandle, context);
                  GXt_char1 = "" ;
                  GXv_char2[0] = GXt_char1 ;
                  new a805_pc01_msg_get(remoteHandle, context).execute( "AX00007", "", "", "", "", "", GXv_char2) ;
                  b202_pc01_image_mst_chk.this.GXt_char1 = GXv_char2[0] ;
                  AV16W_A_RESULT_MSG_SDT_ITEM.setgxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg( GXt_char1 );
                  AV15W_A_RESULT_MSG_SDT.add(AV16W_A_RESULT_MSG_SDT_ITEM, 0);
               }
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(1);
            if ( AV31GXLvl77 == 0 )
            {
               AV13W_A_CHK_RESULT_SDT_ITEM = (SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem)new SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem(remoteHandle, context);
               AV13W_A_CHK_RESULT_SDT_ITEM.setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id( "TBM11_IMAGE_CD" );
               AV13W_A_CHK_RESULT_SDT_ITEM.setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus( false );
               AV12W_A_CHK_RESULT_SDT.add(AV13W_A_CHK_RESULT_SDT_ITEM, 0);
               AV16W_A_RESULT_MSG_SDT_ITEM = (SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)new SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem(remoteHandle, context);
               GXt_char1 = "" ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AX00102", "", "", "", "", "", GXv_char2) ;
               b202_pc01_image_mst_chk.this.GXt_char1 = GXv_char2[0] ;
               AV16W_A_RESULT_MSG_SDT_ITEM.setgxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg( GXt_char1 );
               AV15W_A_RESULT_MSG_SDT.add(AV16W_A_RESULT_MSG_SDT_ITEM, 0);
            }
         }
      }
   }

   public void S12115( )
   {
      /* 'SUB_ATTRIBUTE_CHK' Routine */
      /* Execute user subroutine: S131 */
      S131 ();
      if (returnInSub) return;
      GXv_objcol_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem3[0] = AV10W_A_CHK_INFO_SDT ;
      new a823_pc01_data_tyep_check(remoteHandle, context).execute( GXv_objcol_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem3) ;
      AV10W_A_CHK_INFO_SDT = GXv_objcol_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem3[0] ;
      AV32GXV1 = 1 ;
      while ( AV32GXV1 <= AV10W_A_CHK_INFO_SDT.size() )
      {
         AV11W_A_CHK_INFO_SDT_ITEM = (SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)((SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)AV10W_A_CHK_INFO_SDT.elementAt(-1+AV32GXV1));
         if ( AV11W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result() != 0 )
         {
            AV13W_A_CHK_RESULT_SDT_ITEM = (SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem)new SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem(remoteHandle, context);
            AV13W_A_CHK_RESULT_SDT_ITEM.setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id( AV11W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id() );
            AV13W_A_CHK_RESULT_SDT_ITEM.setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus( AV25W_FOCUS_FLG );
            AV12W_A_CHK_RESULT_SDT.add(AV13W_A_CHK_RESULT_SDT_ITEM, 0);
            AV16W_A_RESULT_MSG_SDT_ITEM = (SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)new SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem(remoteHandle, context);
            AV16W_A_RESULT_MSG_SDT_ITEM.setgxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg( AV11W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result_msg() );
            AV15W_A_RESULT_MSG_SDT.add(AV16W_A_RESULT_MSG_SDT_ITEM, 0);
            AV25W_FOCUS_FLG = false ;
         }
         AV32GXV1 = (int)(AV32GXV1+1) ;
      }
   }

   public void S131( )
   {
      /* 'SUB_CHK_INFO_SET' Routine */
      AV11W_A_CHK_INFO_SDT_ITEM = (SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)new SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem(remoteHandle, context);
      AV11W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id( "TBM11_IMAGE_CD" );
      AV11W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm( "画像コード" );
      AV11W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str( AV9P_BC_IMAGE.getgxTv_SdtTBM11_IMAGE_Tbm11_image_cd() );
      AV11W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn( "STR_ALPNUM" );
      AV11W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( (byte)(1) );
      AV11W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte( (short)(50) );
      AV10W_A_CHK_INFO_SDT.add(AV11W_A_CHK_INFO_SDT_ITEM, 0);
      AV11W_A_CHK_INFO_SDT_ITEM = (SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)new SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem(remoteHandle, context);
      AV11W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id( "TBM11_IMAGE_NM" );
      AV11W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm( "画像名" );
      AV11W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str( AV9P_BC_IMAGE.getgxTv_SdtTBM11_IMAGE_Tbm11_image_nm() );
      AV11W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn( "STR" );
      AV11W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( (byte)(1) );
      AV11W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte( (short)(50) );
      AV10W_A_CHK_INFO_SDT.add(AV11W_A_CHK_INFO_SDT_ITEM, 0);
      AV11W_A_CHK_INFO_SDT_ITEM = (SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)new SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem(remoteHandle, context);
      AV11W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id( "TBM11_IMAGE" );
      AV11W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm( "ファイル名" );
      AV11W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str( AV9P_BC_IMAGE.getgxTv_SdtTBM11_IMAGE_Tbm11_file_name() );
      AV11W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn( "STR" );
      AV11W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( (byte)(0) );
      AV11W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte( (short)(100) );
      AV10W_A_CHK_INFO_SDT.add(AV11W_A_CHK_INFO_SDT_ITEM, 0);
      AV11W_A_CHK_INFO_SDT_ITEM = (SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)new SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem(remoteHandle, context);
      AV11W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id( "TBM11_STUDY_ID" );
      AV11W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm( "試験ID" );
      AV11W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_num( DecimalUtil.doubleToDec(AV9P_BC_IMAGE.getgxTv_SdtTBM11_IMAGE_Tbm11_study_id()) );
      AV11W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn( "NUM" );
      AV11W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( (byte)(0) );
      AV11W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_unit( DecimalUtil.doubleToDec(0) );
      AV10W_A_CHK_INFO_SDT.add(AV11W_A_CHK_INFO_SDT_ITEM, 0);
   }

   public void S14194( )
   {
      /* 'SUB_ITEM_CHK' Routine */
      if ( ! (0==AV9P_BC_IMAGE.getgxTv_SdtTBM11_IMAGE_Tbm11_study_id()) )
      {
         AV33GXLvl199 = (byte)(0) ;
         /* Using cursor P00564 */
         pr_default.execute(2, new Object[] {new Long(AV9P_BC_IMAGE.getgxTv_SdtTBM11_IMAGE_Tbm11_study_id())});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A186TBM21_STUDY_ID = P00564_A186TBM21_STUDY_ID[0] ;
            AV33GXLvl199 = (byte)(1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
         if ( AV33GXLvl199 == 0 )
         {
            AV13W_A_CHK_RESULT_SDT_ITEM = (SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem)new SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem(remoteHandle, context);
            AV13W_A_CHK_RESULT_SDT_ITEM.setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id( "TBM11_STUDY_ID" );
            AV13W_A_CHK_RESULT_SDT_ITEM.setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus( AV25W_FOCUS_FLG );
            AV12W_A_CHK_RESULT_SDT.add(AV13W_A_CHK_RESULT_SDT_ITEM, 0);
            AV16W_A_RESULT_MSG_SDT_ITEM = (SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)new SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem(remoteHandle, context);
            GXt_char1 = "" ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00062", "試験", "", "", "", "", GXv_char2) ;
            b202_pc01_image_mst_chk.this.GXt_char1 = GXv_char2[0] ;
            AV16W_A_RESULT_MSG_SDT_ITEM.setgxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg( GXt_char1 );
            AV15W_A_RESULT_MSG_SDT.add(AV16W_A_RESULT_MSG_SDT_ITEM, 0);
            AV25W_FOCUS_FLG = false ;
         }
      }
   }

   public void S15226( )
   {
      /* 'SUB_SPECIAL_CHK' Routine */
      AV20W_EXTENSIONS.clear();
      AV20W_EXTENSIONS.add("JPG", 0);
      AV20W_EXTENSIONS.add("JPEG", 0);
      AV26W_REG_STR = "" ;
      AV19W_EXT_STR = "" ;
      if ( AV20W_EXTENSIONS.size() > 0 )
      {
         AV26W_REG_STR = "^.*\\.(" ;
         AV17W_CNT = (short)(1) ;
         while ( AV17W_CNT <= AV20W_EXTENSIONS.size() )
         {
            if ( AV17W_CNT != 1 )
            {
               AV26W_REG_STR = AV26W_REG_STR + "|" ;
               AV19W_EXT_STR = AV19W_EXT_STR + "/" ;
            }
            AV26W_REG_STR = AV26W_REG_STR + GXutil.upper( (String)AV20W_EXTENSIONS.elementAt(-1+AV17W_CNT)) ;
            AV19W_EXT_STR = AV19W_EXT_STR + GXutil.upper( (String)AV20W_EXTENSIONS.elementAt(-1+AV17W_CNT)) ;
            AV17W_CNT = (short)(AV17W_CNT+1) ;
         }
         AV26W_REG_STR = AV26W_REG_STR + ")$" ;
      }
      if ( ! (GXutil.strcmp("", AV9P_BC_IMAGE.getgxTv_SdtTBM11_IMAGE_Tbm11_file_name())==0) )
      {
         AV22W_FILE_NAME = GXutil.upper( AV9P_BC_IMAGE.getgxTv_SdtTBM11_IMAGE_Tbm11_file_name()) ;
         if ( ! GxRegex.IsMatch(AV22W_FILE_NAME,AV26W_REG_STR) )
         {
            AV13W_A_CHK_RESULT_SDT_ITEM = (SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem)new SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem(remoteHandle, context);
            AV13W_A_CHK_RESULT_SDT_ITEM.setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id( "TBM11_IMAGE" );
            AV13W_A_CHK_RESULT_SDT_ITEM.setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus( AV25W_FOCUS_FLG );
            AV12W_A_CHK_RESULT_SDT.add(AV13W_A_CHK_RESULT_SDT_ITEM, 0);
            AV16W_A_RESULT_MSG_SDT_ITEM = (SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)new SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem(remoteHandle, context);
            GXt_char1 = "" ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00067", AV19W_EXT_STR, "", "", "", "", GXv_char2) ;
            b202_pc01_image_mst_chk.this.GXt_char1 = GXv_char2[0] ;
            AV16W_A_RESULT_MSG_SDT_ITEM.setgxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg( GXt_char1 );
            AV15W_A_RESULT_MSG_SDT.add(AV16W_A_RESULT_MSG_SDT_ITEM, 0);
            AV25W_FOCUS_FLG = false ;
            AV24W_FILEUP_ERR_FLG = true ;
         }
      }
      AV23W_FILE_SIZE = 512 ;
      if ( ! (GXutil.strcmp("", AV9P_BC_IMAGE.getgxTv_SdtTBM11_IMAGE_Tbm11_image())==0) )
      {
         AV21W_FILE.setSource( AV9P_BC_IMAGE.getgxTv_SdtTBM11_IMAGE_Tbm11_image() );
         if ( ( AV21W_FILE.getLength() > AV23W_FILE_SIZE * 1024 ) && ( AV23W_FILE_SIZE != 0 ) )
         {
            AV13W_A_CHK_RESULT_SDT_ITEM = (SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem)new SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem(remoteHandle, context);
            AV13W_A_CHK_RESULT_SDT_ITEM.setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id( "TBM11_IMAGE" );
            AV13W_A_CHK_RESULT_SDT_ITEM.setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus( AV25W_FOCUS_FLG );
            AV12W_A_CHK_RESULT_SDT.add(AV13W_A_CHK_RESULT_SDT_ITEM, 0);
            AV16W_A_RESULT_MSG_SDT_ITEM = (SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)new SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem(remoteHandle, context);
            GXt_char1 = "" ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00067", GXutil.trim( GXutil.str( AV23W_FILE_SIZE, 10, 0))+"KB以下", "", "", "", "", GXv_char2) ;
            b202_pc01_image_mst_chk.this.GXt_char1 = GXv_char2[0] ;
            AV16W_A_RESULT_MSG_SDT_ITEM.setgxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg( GXt_char1 );
            AV15W_A_RESULT_MSG_SDT.add(AV16W_A_RESULT_MSG_SDT_ITEM, 0);
            AV25W_FOCUS_FLG = false ;
            AV24W_FILEUP_ERR_FLG = true ;
         }
      }
      else
      {
         if ( GXutil.strcmp(AV9P_BC_IMAGE.GetMode(), "INS") == 0 )
         {
            AV13W_A_CHK_RESULT_SDT_ITEM = (SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem)new SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem(remoteHandle, context);
            AV13W_A_CHK_RESULT_SDT_ITEM.setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id( "TBM11_IMAGE" );
            AV13W_A_CHK_RESULT_SDT_ITEM.setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus( AV25W_FOCUS_FLG );
            AV12W_A_CHK_RESULT_SDT.add(AV13W_A_CHK_RESULT_SDT_ITEM, 0);
            AV16W_A_RESULT_MSG_SDT_ITEM = (SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)new SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem(remoteHandle, context);
            GXt_char4 = "" ;
            GXv_char2[0] = GXt_char4 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00010", "", "", "", "", "", GXv_char2) ;
            b202_pc01_image_mst_chk.this.GXt_char4 = GXv_char2[0] ;
            AV16W_A_RESULT_MSG_SDT_ITEM.setgxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg( GXt_char4 );
            AV15W_A_RESULT_MSG_SDT.add(AV16W_A_RESULT_MSG_SDT_ITEM, 0);
            AV25W_FOCUS_FLG = false ;
         }
      }
   }

   public void S16320( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT5[0] = AV14W_A_LOGIN_SDT;
      GXv_char2[0] = AV18W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT5, GXv_char2) ;
      AV14W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT5[0] ;
      b202_pc01_image_mst_chk.this.AV18W_ERRCD = GXv_char2[0] ;
      if ( GXutil.strcmp(AV18W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("1")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void S17338( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV34Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      returnInSub = true;
      if (true) return;
   }

   protected void cleanup( )
   {
      this.aP2[0] = b202_pc01_image_mst_chk.this.AV24W_FILEUP_ERR_FLG;
      this.aP3[0] = b202_pc01_image_mst_chk.this.AV12W_A_CHK_RESULT_SDT;
      this.aP4[0] = b202_pc01_image_mst_chk.this.AV15W_A_RESULT_MSG_SDT;
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
                  /* Execute user subroutine: S17338 */
                  S17338 ();
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
      AV12W_A_CHK_RESULT_SDT = new GxObjectCollection(SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem.class, "A_CHK_RESULT_SDT.A_CHK_RESULT_SDTItem", "SmartEDC_SHIZUOKA", remoteHandle);
      AV15W_A_RESULT_MSG_SDT = new GxObjectCollection(SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem.class, "A_RESULT_MSG_SDT.A_RESULT_MSG_SDTItem", "SmartEDC_SHIZUOKA", remoteHandle);
      AV8C_APP_ID = "" ;
      AV10W_A_CHK_INFO_SDT = new GxObjectCollection(SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem.class, "A_CHK_INFO_SDT.A_CHK_INFO_SDTItem", "SmartEDC_SHIZUOKA", remoteHandle);
      scmdbuf = "" ;
      P00562_A411TBM11_IMAGE_CD = new String[] {""} ;
      A411TBM11_IMAGE_CD = "" ;
      AV13W_A_CHK_RESULT_SDT_ITEM = new SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem(remoteHandle, context);
      AV16W_A_RESULT_MSG_SDT_ITEM = new SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem(remoteHandle, context);
      P00563_A411TBM11_IMAGE_CD = new String[] {""} ;
      P00563_A418TBM11_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P00563_n418TBM11_UPD_DATETIME = new boolean[] {false} ;
      A418TBM11_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      GXv_objcol_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem3 = new GxObjectCollection [1] ;
      AV11W_A_CHK_INFO_SDT_ITEM = new SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem(remoteHandle, context);
      P00564_A186TBM21_STUDY_ID = new long[1] ;
      AV20W_EXTENSIONS = new GxObjectCollection(String.class, "internal", "");
      AV26W_REG_STR = "" ;
      AV19W_EXT_STR = "" ;
      AV22W_FILE_NAME = "" ;
      AV21W_FILE = new com.genexus.util.GXFile();
      GXt_char1 = "" ;
      AV14W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      GXv_SdtA_LOGIN_SDT5 = new SdtA_LOGIN_SDT [1] ;
      AV18W_ERRCD = "" ;
      GXv_char2 = new String [1] ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV34Pgmname = "" ;
      GXt_char4 = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b202_pc01_image_mst_chk__default(),
         new Object[] {
             new Object[] {
            P00562_A411TBM11_IMAGE_CD
            }
            , new Object[] {
            P00563_A411TBM11_IMAGE_CD, P00563_A418TBM11_UPD_DATETIME, P00563_n418TBM11_UPD_DATETIME
            }
            , new Object[] {
            P00564_A186TBM21_STUDY_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV34Pgmname = "B202_PC01_IMAGE_MST_CHK" ;
      /* GeneXus formulas. */
      AV34Pgmname = "B202_PC01_IMAGE_MST_CHK" ;
      Gx_err = (short)(0) ;
   }

   private byte AV31GXLvl77 ;
   private byte AV33GXLvl199 ;
   private short AV17W_CNT ;
   private short Gx_err ;
   private int AV32GXV1 ;
   private int GXActiveErrHndl ;
   private long A186TBM21_STUDY_ID ;
   private long AV23W_FILE_SIZE ;
   private String scmdbuf ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String AV34Pgmname ;
   private String GXt_char4 ;
   private String Gx_emsg ;
   private java.util.Date A418TBM11_UPD_DATETIME ;
   private boolean AV27P_DEL_FLG ;
   private boolean AV24W_FILEUP_ERR_FLG ;
   private boolean returnInSub ;
   private boolean AV25W_FOCUS_FLG ;
   private boolean n418TBM11_UPD_DATETIME ;
   private String AV8C_APP_ID ;
   private String A411TBM11_IMAGE_CD ;
   private String AV26W_REG_STR ;
   private String AV19W_EXT_STR ;
   private String AV22W_FILE_NAME ;
   private String AV18W_ERRCD ;
   private com.genexus.util.GXFile AV21W_FILE ;
   private boolean[] aP2 ;
   private GxObjectCollection[] aP3 ;
   private GxObjectCollection[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P00562_A411TBM11_IMAGE_CD ;
   private String[] P00563_A411TBM11_IMAGE_CD ;
   private java.util.Date[] P00563_A418TBM11_UPD_DATETIME ;
   private boolean[] P00563_n418TBM11_UPD_DATETIME ;
   private long[] P00564_A186TBM21_STUDY_ID ;
   private GxObjectCollection AV12W_A_CHK_RESULT_SDT ;
   private GxObjectCollection AV15W_A_RESULT_MSG_SDT ;
   private GxObjectCollection AV10W_A_CHK_INFO_SDT ;
   private GxObjectCollection GXv_objcol_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem3[] ;
   private GxObjectCollection AV20W_EXTENSIONS ;
   private SdtTBM11_IMAGE AV9P_BC_IMAGE ;
   private SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem AV11W_A_CHK_INFO_SDT_ITEM ;
   private SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem AV13W_A_CHK_RESULT_SDT_ITEM ;
   private SdtA_LOGIN_SDT AV14W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT5[] ;
   private SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem AV16W_A_RESULT_MSG_SDT_ITEM ;
}

final  class b202_pc01_image_mst_chk__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00562", "SELECT `TBM11_IMAGE_CD` FROM `TBM11_IMAGE` WHERE `TBM11_IMAGE_CD` = ? ORDER BY `TBM11_IMAGE_CD` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P00563", "SELECT `TBM11_IMAGE_CD`, `TBM11_UPD_DATETIME` FROM `TBM11_IMAGE` WHERE `TBM11_IMAGE_CD` = ? ORDER BY `TBM11_IMAGE_CD` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P00564", "SELECT `TBM21_STUDY_ID` FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ORDER BY `TBM21_STUDY_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               break;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               break;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
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
               stmt.setVarchar(1, (String)parms[0], 50);
               break;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 50);
               break;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
      }
   }

}

