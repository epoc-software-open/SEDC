/*
               File: B714_PC03_INPUT_END_CRF
        Description: CRF�Œ菈��
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: March 15, 2021 18:9:33.93
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b714_pc03_input_end_crf extends GXProcedure
{
   public b714_pc03_input_end_crf( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b714_pc03_input_end_crf.class ), "" );
   }

   public b714_pc03_input_end_crf( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( byte aP0 ,
                             long aP1 ,
                             GxObjectCollection aP2 ,
                             byte[] aP3 )
   {
      b714_pc03_input_end_crf.this.AV15P_SHOR_KBN = aP0;
      b714_pc03_input_end_crf.this.AV16P_STUDY_ID = aP1;
      b714_pc03_input_end_crf.this.AV14P_B714_SD1_CRF_INFO = aP2;
      b714_pc03_input_end_crf.this.aP3 = aP3;
      b714_pc03_input_end_crf.this.aP4 = aP4;
      b714_pc03_input_end_crf.this.aP4 = new String[] {""};
      initialize();
      privateExecute();
      return aP4[0];
   }

   public void execute( byte aP0 ,
                        long aP1 ,
                        GxObjectCollection aP2 ,
                        byte[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( byte aP0 ,
                             long aP1 ,
                             GxObjectCollection aP2 ,
                             byte[] aP3 ,
                             String[] aP4 )
   {
      b714_pc03_input_end_crf.this.AV15P_SHOR_KBN = aP0;
      b714_pc03_input_end_crf.this.AV16P_STUDY_ID = aP1;
      b714_pc03_input_end_crf.this.AV14P_B714_SD1_CRF_INFO = aP2;
      b714_pc03_input_end_crf.this.aP3 = aP3;
      b714_pc03_input_end_crf.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13C_TAM02_APP_ID = "B714" ;
      /* Execute user subroutine: S111 */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV21W_RTN_CD = (byte)(0) ;
      AV22W_RTN_MSG = "" ;
      AV19W_DATETIME = GXutil.now( ) ;
      /* Execute user subroutine: S121 */
      S121 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( AV21W_RTN_CD == 0 )
      {
         AV28GXV1 = 1 ;
         while ( AV28GXV1 <= AV14P_B714_SD1_CRF_INFO.size() )
         {
            AV18W_B714_SD1_CRF_INFO_Item = (SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem)((SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem)AV14P_B714_SD1_CRF_INFO.elementAt(-1+AV28GXV1));
            AV29GXLvl39 = (byte)(0) ;
            /* Using cursor P00612 */
            pr_default.execute(0, new Object[] {new Long(AV16P_STUDY_ID), new Integer(AV18W_B714_SD1_CRF_INFO_Item.getgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_subject_id()), new Short(AV18W_B714_SD1_CRF_INFO_Item.getgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_crf_id()), new Byte(AV18W_B714_SD1_CRF_INFO_Item.getgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_crf_eda_no())});
            if ( Gx_err != 0 )
            {
               AV29GXLvl39 = (byte)(1) ;
            }
            while ( (pr_default.getStatus(0) != 101) )
            {
               A449TBT02_DEL_FLG = P00612_A449TBT02_DEL_FLG[0] ;
               n449TBT02_DEL_FLG = P00612_n449TBT02_DEL_FLG[0] ;
               A935TBT02_CRF_EDA_NO = P00612_A935TBT02_CRF_EDA_NO[0] ;
               A91TBT02_CRF_ID = P00612_A91TBT02_CRF_ID[0] ;
               A90TBT02_SUBJECT_ID = P00612_A90TBT02_SUBJECT_ID[0] ;
               A89TBT02_STUDY_ID = P00612_A89TBT02_STUDY_ID[0] ;
               A655TBT02_DM_ARRIVAL_FLG = P00612_A655TBT02_DM_ARRIVAL_FLG[0] ;
               n655TBT02_DM_ARRIVAL_FLG = P00612_n655TBT02_DM_ARRIVAL_FLG[0] ;
               A456TBT02_UPD_CNT = P00612_A456TBT02_UPD_CNT[0] ;
               n456TBT02_UPD_CNT = P00612_n456TBT02_UPD_CNT[0] ;
               A499TBT02_CRF_INPUT_LEVEL = P00612_A499TBT02_CRF_INPUT_LEVEL[0] ;
               n499TBT02_CRF_INPUT_LEVEL = P00612_n499TBT02_CRF_INPUT_LEVEL[0] ;
               A656TBT02_DM_ARRIVAL_DATETIME = P00612_A656TBT02_DM_ARRIVAL_DATETIME[0] ;
               n656TBT02_DM_ARRIVAL_DATETIME = P00612_n656TBT02_DM_ARRIVAL_DATETIME[0] ;
               A657TBT02_APPROVAL_FLG = P00612_A657TBT02_APPROVAL_FLG[0] ;
               n657TBT02_APPROVAL_FLG = P00612_n657TBT02_APPROVAL_FLG[0] ;
               A658TBT02_APPROVAL_DATETIME = P00612_A658TBT02_APPROVAL_DATETIME[0] ;
               n658TBT02_APPROVAL_DATETIME = P00612_n658TBT02_APPROVAL_DATETIME[0] ;
               A659TBT02_APPROVAL_USER_ID = P00612_A659TBT02_APPROVAL_USER_ID[0] ;
               n659TBT02_APPROVAL_USER_ID = P00612_n659TBT02_APPROVAL_USER_ID[0] ;
               A660TBT02_APPROVAL_AUTH_CD = P00612_A660TBT02_APPROVAL_AUTH_CD[0] ;
               n660TBT02_APPROVAL_AUTH_CD = P00612_n660TBT02_APPROVAL_AUTH_CD[0] ;
               AV29GXLvl39 = (byte)(1) ;
               AV25W_UPD_FLG = true ;
               if ( ( AV15P_SHOR_KBN == 1 ) && ( GXutil.strcmp(A655TBT02_DM_ARRIVAL_FLG, "0") == 0 ) )
               {
                  AV25W_UPD_FLG = false ;
               }
               if ( AV25W_UPD_FLG )
               {
                  if ( AV18W_B714_SD1_CRF_INFO_Item.getgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_upd_cnt() != A456TBT02_UPD_CNT )
                  {
                     AV21W_RTN_CD = (byte)(1) ;
                     GXt_char1 = AV22W_RTN_MSG ;
                     GXv_char2[0] = GXt_char1 ;
                     new a805_pc02_msg_get(remoteHandle, context).execute( "AX00007", "", "", "", "", "", GXv_char2) ;
                     b714_pc03_input_end_crf.this.GXt_char1 = GXv_char2[0] ;
                     AV22W_RTN_MSG = GXt_char1 ;
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
                  AV8BC_TBT02_CRF.Load(AV16P_STUDY_ID, AV18W_B714_SD1_CRF_INFO_Item.getgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_subject_id(), AV18W_B714_SD1_CRF_INFO_Item.getgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_crf_id(), AV18W_B714_SD1_CRF_INFO_Item.getgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_crf_eda_no());
                  /* Execute user subroutine: S131 */
                  S131 ();
                  if ( returnInSub )
                  {
                     pr_default.close(0);
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
                  if ( AV21W_RTN_CD != 0 )
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
                  AV8BC_TBT02_CRF.setgxTv_SdtTBT02_CRF_Tbt02_crf_latest_version( (short)(AV8BC_TBT02_CRF.getgxTv_SdtTBT02_CRF_Tbt02_crf_latest_version()+1) );
                  AV8BC_TBT02_CRF.setgxTv_SdtTBT02_CRF_Tbt02_upload_datetime( AV19W_DATETIME );
                  AV8BC_TBT02_CRF.setgxTv_SdtTBT02_CRF_Tbt02_upload_user_id( AV17W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() );
                  AV8BC_TBT02_CRF.setgxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd( AV11C_DM_AUTH_CD );
                  if ( AV15P_SHOR_KBN == 0 )
                  {
                     AV8BC_TBT02_CRF.setgxTv_SdtTBT02_CRF_Tbt02_input_end_flg( "0" );
                     AV8BC_TBT02_CRF.setgxTv_SdtTBT02_CRF_Tbt02_input_end_datetime_SetNull();
                     AV8BC_TBT02_CRF.setgxTv_SdtTBT02_CRF_Tbt02_input_end_user_id_SetNull();
                     AV8BC_TBT02_CRF.setgxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd_SetNull();
                  }
                  else
                  {
                     AV8BC_TBT02_CRF.setgxTv_SdtTBT02_CRF_Tbt02_input_end_flg( "1" );
                     AV8BC_TBT02_CRF.setgxTv_SdtTBT02_CRF_Tbt02_input_end_datetime( AV19W_DATETIME );
                     AV8BC_TBT02_CRF.setgxTv_SdtTBT02_CRF_Tbt02_input_end_user_id( AV17W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() );
                     AV8BC_TBT02_CRF.setgxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd( AV17W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_kngn_ptn_kbn() );
                  }
                  AV8BC_TBT02_CRF.setgxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm( AV30Pgmname );
                  AV8BC_TBT02_CRF.Save();
                  /* Execute user subroutine: S131 */
                  S131 ();
                  if ( returnInSub )
                  {
                     pr_default.close(0);
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
                  if ( AV21W_RTN_CD != 0 )
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
                  AV9BC_TBT11_CRF_HISTORY = (SdtTBT11_CRF_HISTORY)new SdtTBT11_CRF_HISTORY( remoteHandle, context);
                  AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_study_id( A89TBT02_STUDY_ID );
                  AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_subject_id( A90TBT02_SUBJECT_ID );
                  AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_id( A91TBT02_CRF_ID );
                  AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_eda_no( A935TBT02_CRF_EDA_NO );
                  AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_version( AV8BC_TBT02_CRF.getgxTv_SdtTBT02_CRF_Tbt02_crf_latest_version() );
                  AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level( A499TBT02_CRF_INPUT_LEVEL );
                  AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime( AV8BC_TBT02_CRF.getgxTv_SdtTBT02_CRF_Tbt02_upload_datetime() );
                  AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id( AV8BC_TBT02_CRF.getgxTv_SdtTBT02_CRF_Tbt02_upload_user_id() );
                  AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd( AV8BC_TBT02_CRF.getgxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd() );
                  AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg( A655TBT02_DM_ARRIVAL_FLG );
                  AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime( A656TBT02_DM_ARRIVAL_DATETIME );
                  AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg( A657TBT02_APPROVAL_FLG );
                  AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime( A658TBT02_APPROVAL_DATETIME );
                  AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id( A659TBT02_APPROVAL_USER_ID );
                  AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd( A660TBT02_APPROVAL_AUTH_CD );
                  AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg( AV8BC_TBT02_CRF.getgxTv_SdtTBT02_CRF_Tbt02_input_end_flg() );
                  AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime( AV8BC_TBT02_CRF.getgxTv_SdtTBT02_CRF_Tbt02_input_end_datetime() );
                  AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id( AV8BC_TBT02_CRF.getgxTv_SdtTBT02_CRF_Tbt02_input_end_user_id() );
                  AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd( AV8BC_TBT02_CRF.getgxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd() );
                  if ( AV15P_SHOR_KBN == 0 )
                  {
                     AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu( "CRF�Œ����" );
                  }
                  else
                  {
                     AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu( "CRF�Œ�" );
                  }
                  AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg( "0" );
                  AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm( AV30Pgmname );
                  AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm( AV30Pgmname );
                  AV9BC_TBT11_CRF_HISTORY.Save();
                  /* Execute user subroutine: S141 */
                  S141 ();
                  if ( returnInSub )
                  {
                     pr_default.close(0);
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
                  if ( AV21W_RTN_CD != 0 )
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
                  /* Using cursor P00613 */
                  pr_default.execute(1, new Object[] {new Long(AV16P_STUDY_ID), new Integer(AV18W_B714_SD1_CRF_INFO_Item.getgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_subject_id()), new Short(AV18W_B714_SD1_CRF_INFO_Item.getgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_crf_id()), new Byte(AV18W_B714_SD1_CRF_INFO_Item.getgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_crf_eda_no())});
                  while ( (pr_default.getStatus(1) != 101) )
                  {
                     A473TBT12_DEL_FLG = P00613_A473TBT12_DEL_FLG[0] ;
                     n473TBT12_DEL_FLG = P00613_n473TBT12_DEL_FLG[0] ;
                     A937TBT12_CRF_EDA_NO = P00613_A937TBT12_CRF_EDA_NO[0] ;
                     A98TBT12_CRF_ID = P00613_A98TBT12_CRF_ID[0] ;
                     A97TBT12_SUBJECT_ID = P00613_A97TBT12_SUBJECT_ID[0] ;
                     A96TBT12_STUDY_ID = P00613_A96TBT12_STUDY_ID[0] ;
                     A99TBT12_CRF_ITEM_GRP_DIV = P00613_A99TBT12_CRF_ITEM_GRP_DIV[0] ;
                     A100TBT12_CRF_ITEM_GRP_CD = P00613_A100TBT12_CRF_ITEM_GRP_CD[0] ;
                     A465TBT12_CRF_VALUE = P00613_A465TBT12_CRF_VALUE[0] ;
                     n465TBT12_CRF_VALUE = P00613_n465TBT12_CRF_VALUE[0] ;
                     AV10BC_TBT13_CRF_RES_HIS = (SdtTBT13_CRF_RES_HIS)new SdtTBT13_CRF_RES_HIS( remoteHandle, context);
                     AV10BC_TBT13_CRF_RES_HIS.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_study_id( A96TBT12_STUDY_ID );
                     AV10BC_TBT13_CRF_RES_HIS.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_subject_id( A97TBT12_SUBJECT_ID );
                     AV10BC_TBT13_CRF_RES_HIS.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_id( A98TBT12_CRF_ID );
                     AV10BC_TBT13_CRF_RES_HIS.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_eda_no( A937TBT12_CRF_EDA_NO );
                     AV10BC_TBT13_CRF_RES_HIS.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_version( AV8BC_TBT02_CRF.getgxTv_SdtTBT02_CRF_Tbt02_crf_latest_version() );
                     AV10BC_TBT13_CRF_RES_HIS.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_div( A99TBT12_CRF_ITEM_GRP_DIV );
                     AV10BC_TBT13_CRF_RES_HIS.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_cd( A100TBT12_CRF_ITEM_GRP_CD );
                     AV10BC_TBT13_CRF_RES_HIS.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value( A465TBT12_CRF_VALUE );
                     AV10BC_TBT13_CRF_RES_HIS.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg( "0" );
                     AV10BC_TBT13_CRF_RES_HIS.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg( "0" );
                     AV10BC_TBT13_CRF_RES_HIS.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm( AV30Pgmname );
                     AV10BC_TBT13_CRF_RES_HIS.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm( AV30Pgmname );
                     AV10BC_TBT13_CRF_RES_HIS.Save();
                     pr_default.readNext(1);
                  }
                  pr_default.close(1);
                  if ( AV21W_RTN_CD == 0 )
                  {
                     AV23W_LOGTEXT = "" ;
                     AV23W_LOGTEXT = AV23W_LOGTEXT + "STUDY_ID:" + GXutil.trim( GXutil.str( AV16P_STUDY_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
                     AV23W_LOGTEXT = AV23W_LOGTEXT + "SUBJECT_ID:" + GXutil.trim( GXutil.str( AV18W_B714_SD1_CRF_INFO_Item.getgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_subject_id(), 6, 0)) + GXutil.chr( (short)(9)) ;
                     AV23W_LOGTEXT = AV23W_LOGTEXT + "CRF_ID:" + GXutil.trim( GXutil.str( AV18W_B714_SD1_CRF_INFO_Item.getgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_crf_id(), 4, 0)) + GXutil.chr( (short)(9)) ;
                     AV23W_LOGTEXT = AV23W_LOGTEXT + "CRF_EDA_NO:" + GXutil.trim( GXutil.str( AV18W_B714_SD1_CRF_INFO_Item.getgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_crf_eda_no(), 2, 0)) + GXutil.chr( (short)(9)) ;
                     AV23W_LOGTEXT = AV23W_LOGTEXT + "DM_ARRIVAL_FLG:" + A655TBT02_DM_ARRIVAL_FLG + GXutil.chr( (short)(9)) ;
                     if ( AV15P_SHOR_KBN == 0 )
                     {
                        AV23W_LOGTEXT = AV23W_LOGTEXT + "UPD_RIYU:" + "CRF�Œ����" + GXutil.chr( (short)(9)) ;
                     }
                     else
                     {
                        AV23W_LOGTEXT = AV23W_LOGTEXT + "UPD_RIYU:" + "CRF�Œ�" + GXutil.chr( (short)(9)) ;
                     }
                     AV23W_LOGTEXT = GXutil.strReplace( AV23W_LOGTEXT, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "@br@") ;
                     new a804_pc03_datalog(remoteHandle, context).execute( AV30Pgmname, "UPD", AV23W_LOGTEXT) ;
                  }
               }
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(0);
            if ( AV29GXLvl39 == 0 )
            {
               AV21W_RTN_CD = (byte)(1) ;
               GXt_char1 = AV22W_RTN_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc02_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char2) ;
               b714_pc03_input_end_crf.this.GXt_char1 = GXv_char2[0] ;
               AV22W_RTN_MSG = GXt_char1 ;
            }
            AV28GXV1 = (int)(AV28GXV1+1) ;
         }
      }
      /* Execute user subroutine: S161 */
      S161 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT3[0] = AV17W_A_LOGIN_SDT;
      GXv_char2[0] = AV20W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT3, GXv_char2) ;
      AV17W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT3[0] ;
      b714_pc03_input_end_crf.this.AV20W_ERRCD = GXv_char2[0] ;
      if ( GXutil.strcmp(AV20W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "b790_wp01_error"+GXutil.URLEncode(GXutil.rtrim("1")) ;
         httpContext.wjLoc = formatLink("b790_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      GXv_char2[0] = AV11C_DM_AUTH_CD ;
      GXv_int4[0] = AV12C_DM_INPUT_LEVEL ;
      new b799_pc06_dm_info_get(remoteHandle, context).execute( GXv_char2, GXv_int4) ;
      b714_pc03_input_end_crf.this.AV11C_DM_AUTH_CD = GXv_char2[0] ;
      b714_pc03_input_end_crf.this.AV12C_DM_INPUT_LEVEL = GXv_int4[0] ;
      new a804_pc02_log_start(remoteHandle, context).execute( AV30Pgmname) ;
   }

   public void S121( )
   {
      /* 'SUB_MAST_CHK' Routine */
      AV32GXLvl237 = (byte)(0) ;
      /* Using cursor P00614 */
      pr_default.execute(2, new Object[] {new Long(AV16P_STUDY_ID)});
      if ( Gx_err != 0 )
      {
         AV32GXLvl237 = (byte)(1) ;
      }
      while ( (pr_default.getStatus(2) != 101) )
      {
         A369TBM21_DEL_FLG = P00614_A369TBM21_DEL_FLG[0] ;
         n369TBM21_DEL_FLG = P00614_n369TBM21_DEL_FLG[0] ;
         A63TBM21_STUDY_ID = P00614_A63TBM21_STUDY_ID[0] ;
         A607TBM21_STATUS = P00614_A607TBM21_STATUS[0] ;
         n607TBM21_STATUS = P00614_n607TBM21_STATUS[0] ;
         AV32GXLvl237 = (byte)(1) ;
         if ( GXutil.strcmp(A607TBM21_STATUS, "2") == 0 )
         {
            AV21W_RTN_CD = (byte)(1) ;
            GXt_char1 = AV22W_RTN_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00038", "�����̏��", "�u�I���v", "�X�V", "", "", GXv_char2) ;
            b714_pc03_input_end_crf.this.GXt_char1 = GXv_char2[0] ;
            AV22W_RTN_MSG = GXt_char1 ;
         }
         else if ( GXutil.strcmp(A607TBM21_STATUS, "9") == 0 )
         {
            AV21W_RTN_CD = (byte)(1) ;
            GXt_char1 = AV22W_RTN_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00038", "�����̏��", "�u���~�v", "�X�V", "", "", GXv_char2) ;
            b714_pc03_input_end_crf.this.GXt_char1 = GXv_char2[0] ;
            AV22W_RTN_MSG = GXt_char1 ;
         }
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      if ( AV32GXLvl237 == 0 )
      {
         AV21W_RTN_CD = (byte)(1) ;
         GXt_char1 = AV22W_RTN_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc02_msg_get(remoteHandle, context).execute( "AE00038", "�I�����ꂽ����", "���p�s��", "�X�V", "", "", GXv_char2) ;
         b714_pc03_input_end_crf.this.GXt_char1 = GXv_char2[0] ;
         AV22W_RTN_MSG = GXt_char1 ;
      }
   }

   public void S131( )
   {
      /* 'SUB_TBT02_CHECK_ERROR' Routine */
      if ( AV8BC_TBT02_CRF.Fail() )
      {
         AV21W_RTN_CD = (byte)(1) ;
         GXt_char1 = AV22W_RTN_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV8BC_TBT02_CRF.GetMessages(), (byte)(0), GXv_char2) ;
         b714_pc03_input_end_crf.this.GXt_char1 = GXv_char2[0] ;
         AV22W_RTN_MSG = GXt_char1 + " (TBT02)" ;
      }
   }

   public void S141( )
   {
      /* 'SUB_TBT11_CHECK_ERROR' Routine */
      if ( AV9BC_TBT11_CRF_HISTORY.Fail() )
      {
         AV21W_RTN_CD = (byte)(1) ;
         GXt_char1 = AV22W_RTN_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV9BC_TBT11_CRF_HISTORY.GetMessages(), (byte)(0), GXv_char2) ;
         b714_pc03_input_end_crf.this.GXt_char1 = GXv_char2[0] ;
         AV22W_RTN_MSG = GXt_char1 + " (TBT11)" ;
      }
   }

   public void S151( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV30Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "b790_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("b790_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S161( )
   {
      /* 'SUB_TERMINATE' Routine */
      if ( AV21W_RTN_CD == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "b714_pc03_input_end_crf");
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "b714_pc03_input_end_crf");
      }
   }

   protected void cleanup( )
   {
      this.aP3[0] = b714_pc03_input_end_crf.this.AV21W_RTN_CD;
      this.aP4[0] = b714_pc03_input_end_crf.this.AV22W_RTN_MSG;
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
                  /* Execute user subroutine: S151 */
                  S151 ();
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
      AV22W_RTN_MSG = "" ;
      AV13C_TAM02_APP_ID = "" ;
      AV19W_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      AV18W_B714_SD1_CRF_INFO_Item = new SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem(remoteHandle, context);
      scmdbuf = "" ;
      P00612_A449TBT02_DEL_FLG = new String[] {""} ;
      P00612_n449TBT02_DEL_FLG = new boolean[] {false} ;
      P00612_A935TBT02_CRF_EDA_NO = new byte[1] ;
      P00612_A91TBT02_CRF_ID = new short[1] ;
      P00612_A90TBT02_SUBJECT_ID = new int[1] ;
      P00612_A89TBT02_STUDY_ID = new long[1] ;
      P00612_A655TBT02_DM_ARRIVAL_FLG = new String[] {""} ;
      P00612_n655TBT02_DM_ARRIVAL_FLG = new boolean[] {false} ;
      P00612_A456TBT02_UPD_CNT = new long[1] ;
      P00612_n456TBT02_UPD_CNT = new boolean[] {false} ;
      P00612_A499TBT02_CRF_INPUT_LEVEL = new byte[1] ;
      P00612_n499TBT02_CRF_INPUT_LEVEL = new boolean[] {false} ;
      P00612_A656TBT02_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P00612_n656TBT02_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      P00612_A657TBT02_APPROVAL_FLG = new String[] {""} ;
      P00612_n657TBT02_APPROVAL_FLG = new boolean[] {false} ;
      P00612_A658TBT02_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P00612_n658TBT02_APPROVAL_DATETIME = new boolean[] {false} ;
      P00612_A659TBT02_APPROVAL_USER_ID = new String[] {""} ;
      P00612_n659TBT02_APPROVAL_USER_ID = new boolean[] {false} ;
      P00612_A660TBT02_APPROVAL_AUTH_CD = new String[] {""} ;
      P00612_n660TBT02_APPROVAL_AUTH_CD = new boolean[] {false} ;
      A449TBT02_DEL_FLG = "" ;
      A655TBT02_DM_ARRIVAL_FLG = "" ;
      A656TBT02_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A657TBT02_APPROVAL_FLG = "" ;
      A658TBT02_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A659TBT02_APPROVAL_USER_ID = "" ;
      A660TBT02_APPROVAL_AUTH_CD = "" ;
      AV8BC_TBT02_CRF = new SdtTBT02_CRF(remoteHandle);
      AV17W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV11C_DM_AUTH_CD = "" ;
      AV30Pgmname = "" ;
      AV9BC_TBT11_CRF_HISTORY = new SdtTBT11_CRF_HISTORY(remoteHandle);
      P00613_A473TBT12_DEL_FLG = new String[] {""} ;
      P00613_n473TBT12_DEL_FLG = new boolean[] {false} ;
      P00613_A937TBT12_CRF_EDA_NO = new byte[1] ;
      P00613_A98TBT12_CRF_ID = new short[1] ;
      P00613_A97TBT12_SUBJECT_ID = new int[1] ;
      P00613_A96TBT12_STUDY_ID = new long[1] ;
      P00613_A99TBT12_CRF_ITEM_GRP_DIV = new String[] {""} ;
      P00613_A100TBT12_CRF_ITEM_GRP_CD = new String[] {""} ;
      P00613_A465TBT12_CRF_VALUE = new String[] {""} ;
      P00613_n465TBT12_CRF_VALUE = new boolean[] {false} ;
      A473TBT12_DEL_FLG = "" ;
      A99TBT12_CRF_ITEM_GRP_DIV = "" ;
      A100TBT12_CRF_ITEM_GRP_CD = "" ;
      A465TBT12_CRF_VALUE = "" ;
      AV10BC_TBT13_CRF_RES_HIS = new SdtTBT13_CRF_RES_HIS(remoteHandle);
      AV23W_LOGTEXT = "" ;
      GXv_SdtA_LOGIN_SDT3 = new SdtA_LOGIN_SDT [1] ;
      AV20W_ERRCD = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      GXv_int4 = new byte [1] ;
      A607TBM21_STATUS = "" ;
      P00614_A369TBM21_DEL_FLG = new String[] {""} ;
      P00614_n369TBM21_DEL_FLG = new boolean[] {false} ;
      P00614_A63TBM21_STUDY_ID = new long[1] ;
      P00614_A607TBM21_STATUS = new String[] {""} ;
      P00614_n607TBM21_STATUS = new boolean[] {false} ;
      A369TBM21_DEL_FLG = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b714_pc03_input_end_crf__default(),
         new Object[] {
             new Object[] {
            P00612_A449TBT02_DEL_FLG, P00612_n449TBT02_DEL_FLG, P00612_A935TBT02_CRF_EDA_NO, P00612_A91TBT02_CRF_ID, P00612_A90TBT02_SUBJECT_ID, P00612_A89TBT02_STUDY_ID, P00612_A655TBT02_DM_ARRIVAL_FLG, P00612_n655TBT02_DM_ARRIVAL_FLG, P00612_A456TBT02_UPD_CNT, P00612_n456TBT02_UPD_CNT,
            P00612_A499TBT02_CRF_INPUT_LEVEL, P00612_n499TBT02_CRF_INPUT_LEVEL, P00612_A656TBT02_DM_ARRIVAL_DATETIME, P00612_n656TBT02_DM_ARRIVAL_DATETIME, P00612_A657TBT02_APPROVAL_FLG, P00612_n657TBT02_APPROVAL_FLG, P00612_A658TBT02_APPROVAL_DATETIME, P00612_n658TBT02_APPROVAL_DATETIME, P00612_A659TBT02_APPROVAL_USER_ID, P00612_n659TBT02_APPROVAL_USER_ID,
            P00612_A660TBT02_APPROVAL_AUTH_CD, P00612_n660TBT02_APPROVAL_AUTH_CD
            }
            , new Object[] {
            P00613_A473TBT12_DEL_FLG, P00613_n473TBT12_DEL_FLG, P00613_A937TBT12_CRF_EDA_NO, P00613_A98TBT12_CRF_ID, P00613_A97TBT12_SUBJECT_ID, P00613_A96TBT12_STUDY_ID, P00613_A99TBT12_CRF_ITEM_GRP_DIV, P00613_A100TBT12_CRF_ITEM_GRP_CD, P00613_A465TBT12_CRF_VALUE, P00613_n465TBT12_CRF_VALUE
            }
            , new Object[] {
            P00614_A369TBM21_DEL_FLG, P00614_n369TBM21_DEL_FLG, P00614_A63TBM21_STUDY_ID, P00614_A607TBM21_STATUS, P00614_n607TBM21_STATUS
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV30Pgmname = "B714_PC03_INPUT_END_CRF" ;
      /* GeneXus formulas. */
      AV30Pgmname = "B714_PC03_INPUT_END_CRF" ;
      Gx_err = (short)(0) ;
   }

   private byte AV15P_SHOR_KBN ;
   private byte AV21W_RTN_CD ;
   private byte AV29GXLvl39 ;
   private byte A935TBT02_CRF_EDA_NO ;
   private byte A499TBT02_CRF_INPUT_LEVEL ;
   private byte A937TBT12_CRF_EDA_NO ;
   private byte AV12C_DM_INPUT_LEVEL ;
   private byte GXv_int4[] ;
   private byte AV32GXLvl237 ;
   private short Gx_err ;
   private short A91TBT02_CRF_ID ;
   private short A98TBT12_CRF_ID ;
   private int AV28GXV1 ;
   private int A90TBT02_SUBJECT_ID ;
   private int A97TBT12_SUBJECT_ID ;
   private int GXActiveErrHndl ;
   private long AV16P_STUDY_ID ;
   private long A89TBT02_STUDY_ID ;
   private long A456TBT02_UPD_CNT ;
   private long A96TBT12_STUDY_ID ;
   private long A63TBM21_STUDY_ID ;
   private String scmdbuf ;
   private String AV30Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Gx_emsg ;
   private java.util.Date AV19W_DATETIME ;
   private java.util.Date A656TBT02_DM_ARRIVAL_DATETIME ;
   private java.util.Date A658TBT02_APPROVAL_DATETIME ;
   private boolean returnInSub ;
   private boolean n449TBT02_DEL_FLG ;
   private boolean n655TBT02_DM_ARRIVAL_FLG ;
   private boolean n456TBT02_UPD_CNT ;
   private boolean n499TBT02_CRF_INPUT_LEVEL ;
   private boolean n656TBT02_DM_ARRIVAL_DATETIME ;
   private boolean n657TBT02_APPROVAL_FLG ;
   private boolean n658TBT02_APPROVAL_DATETIME ;
   private boolean n659TBT02_APPROVAL_USER_ID ;
   private boolean n660TBT02_APPROVAL_AUTH_CD ;
   private boolean AV25W_UPD_FLG ;
   private boolean n473TBT12_DEL_FLG ;
   private boolean n465TBT12_CRF_VALUE ;
   private boolean n369TBM21_DEL_FLG ;
   private boolean n607TBM21_STATUS ;
   private String AV22W_RTN_MSG ;
   private String AV13C_TAM02_APP_ID ;
   private String A449TBT02_DEL_FLG ;
   private String A655TBT02_DM_ARRIVAL_FLG ;
   private String A657TBT02_APPROVAL_FLG ;
   private String A659TBT02_APPROVAL_USER_ID ;
   private String A660TBT02_APPROVAL_AUTH_CD ;
   private String AV11C_DM_AUTH_CD ;
   private String A473TBT12_DEL_FLG ;
   private String A99TBT12_CRF_ITEM_GRP_DIV ;
   private String A100TBT12_CRF_ITEM_GRP_CD ;
   private String A465TBT12_CRF_VALUE ;
   private String AV23W_LOGTEXT ;
   private String AV20W_ERRCD ;
   private String A607TBM21_STATUS ;
   private String A369TBM21_DEL_FLG ;
   private SdtA_LOGIN_SDT AV17W_A_LOGIN_SDT ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P00612_A449TBT02_DEL_FLG ;
   private boolean[] P00612_n449TBT02_DEL_FLG ;
   private byte[] P00612_A935TBT02_CRF_EDA_NO ;
   private short[] P00612_A91TBT02_CRF_ID ;
   private int[] P00612_A90TBT02_SUBJECT_ID ;
   private long[] P00612_A89TBT02_STUDY_ID ;
   private String[] P00612_A655TBT02_DM_ARRIVAL_FLG ;
   private boolean[] P00612_n655TBT02_DM_ARRIVAL_FLG ;
   private long[] P00612_A456TBT02_UPD_CNT ;
   private boolean[] P00612_n456TBT02_UPD_CNT ;
   private byte[] P00612_A499TBT02_CRF_INPUT_LEVEL ;
   private boolean[] P00612_n499TBT02_CRF_INPUT_LEVEL ;
   private java.util.Date[] P00612_A656TBT02_DM_ARRIVAL_DATETIME ;
   private boolean[] P00612_n656TBT02_DM_ARRIVAL_DATETIME ;
   private String[] P00612_A657TBT02_APPROVAL_FLG ;
   private boolean[] P00612_n657TBT02_APPROVAL_FLG ;
   private java.util.Date[] P00612_A658TBT02_APPROVAL_DATETIME ;
   private boolean[] P00612_n658TBT02_APPROVAL_DATETIME ;
   private String[] P00612_A659TBT02_APPROVAL_USER_ID ;
   private boolean[] P00612_n659TBT02_APPROVAL_USER_ID ;
   private String[] P00612_A660TBT02_APPROVAL_AUTH_CD ;
   private boolean[] P00612_n660TBT02_APPROVAL_AUTH_CD ;
   private String[] P00613_A473TBT12_DEL_FLG ;
   private boolean[] P00613_n473TBT12_DEL_FLG ;
   private byte[] P00613_A937TBT12_CRF_EDA_NO ;
   private short[] P00613_A98TBT12_CRF_ID ;
   private int[] P00613_A97TBT12_SUBJECT_ID ;
   private long[] P00613_A96TBT12_STUDY_ID ;
   private String[] P00613_A99TBT12_CRF_ITEM_GRP_DIV ;
   private String[] P00613_A100TBT12_CRF_ITEM_GRP_CD ;
   private String[] P00613_A465TBT12_CRF_VALUE ;
   private boolean[] P00613_n465TBT12_CRF_VALUE ;
   private String[] P00614_A369TBM21_DEL_FLG ;
   private boolean[] P00614_n369TBM21_DEL_FLG ;
   private long[] P00614_A63TBM21_STUDY_ID ;
   private String[] P00614_A607TBM21_STATUS ;
   private boolean[] P00614_n607TBM21_STATUS ;
   private GxObjectCollection AV14P_B714_SD1_CRF_INFO ;
   private SdtTBT02_CRF AV8BC_TBT02_CRF ;
   private SdtTBT11_CRF_HISTORY AV9BC_TBT11_CRF_HISTORY ;
   private SdtTBT13_CRF_RES_HIS AV10BC_TBT13_CRF_RES_HIS ;
   private SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem AV18W_B714_SD1_CRF_INFO_Item ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT3[] ;
}

final  class b714_pc03_input_end_crf__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00612", "SELECT `TBT02_DEL_FLG`, `TBT02_CRF_EDA_NO`, `TBT02_CRF_ID`, `TBT02_SUBJECT_ID`, `TBT02_STUDY_ID`, `TBT02_DM_ARRIVAL_FLG`, `TBT02_UPD_CNT`, `TBT02_CRF_INPUT_LEVEL`, `TBT02_DM_ARRIVAL_DATETIME`, `TBT02_APPROVAL_FLG`, `TBT02_APPROVAL_DATETIME`, `TBT02_APPROVAL_USER_ID`, `TBT02_APPROVAL_AUTH_CD` FROM `TBT02_CRF` WHERE (`TBT02_STUDY_ID` = ? and `TBT02_SUBJECT_ID` = ? and `TBT02_CRF_ID` = ? and `TBT02_CRF_EDA_NO` = ?) AND (`TBT02_DEL_FLG` = '0') ORDER BY `TBT02_STUDY_ID`, `TBT02_SUBJECT_ID`, `TBT02_CRF_ID`, `TBT02_CRF_EDA_NO` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P00613", "SELECT `TBT12_DEL_FLG`, `TBT12_CRF_EDA_NO`, `TBT12_CRF_ID`, `TBT12_SUBJECT_ID`, `TBT12_STUDY_ID`, `TBT12_CRF_ITEM_GRP_DIV`, `TBT12_CRF_ITEM_GRP_CD`, `TBT12_CRF_VALUE` FROM `TBT12_CRF_RESULT` WHERE (`TBT12_STUDY_ID` = ? and `TBT12_SUBJECT_ID` = ? and `TBT12_CRF_ID` = ? and `TBT12_CRF_EDA_NO` = ?) AND (`TBT12_DEL_FLG` = '0') ORDER BY `TBT12_STUDY_ID`, `TBT12_SUBJECT_ID`, `TBT12_CRF_ID`, `TBT12_CRF_EDA_NO` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P00614", "SELECT `TBM21_DEL_FLG`, `TBM21_STUDY_ID`, `TBM21_STATUS` FROM `TBM21_STUDY` WHERE (`TBM21_STUDY_ID` = ?) AND (`TBM21_DEL_FLG` = '0') ORDER BY `TBM21_STUDY_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((byte[]) buf[2])[0] = rslt.getByte(2) ;
               ((short[]) buf[3])[0] = rslt.getShort(3) ;
               ((int[]) buf[4])[0] = rslt.getInt(4) ;
               ((long[]) buf[5])[0] = rslt.getLong(5) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(7) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(8) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(9) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDateTime(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2) ;
               ((short[]) buf[3])[0] = rslt.getShort(3) ;
               ((int[]) buf[4])[0] = rslt.getInt(4) ;
               ((long[]) buf[5])[0] = rslt.getLong(5) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

