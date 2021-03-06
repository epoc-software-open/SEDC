/*
               File: B714_PC03_INPUT_END_CRF
        Description: CRFÅè
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:56:30.3
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
      /* Execute user subroutine: S11189 */
      S11189 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV21W_RTN_CD = (byte)(0) ;
      AV22W_RTN_MSG = "" ;
      AV19W_DATETIME = GXutil.now( ) ;
      /* Execute user subroutine: S12215 */
      S12215 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( AV21W_RTN_CD == 0 )
      {
         AV27GXV1 = 1 ;
         while ( AV27GXV1 <= AV14P_B714_SD1_CRF_INFO.size() )
         {
            AV18W_B714_SD1_CRF_INFO_Item = (SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem)((SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem)AV14P_B714_SD1_CRF_INFO.elementAt(-1+AV27GXV1));
            AV28GXLvl38 = (byte)(0) ;
            /* Using cursor P00632 */
            pr_default.execute(0, new Object[] {new Long(AV16P_STUDY_ID), new Integer(AV18W_B714_SD1_CRF_INFO_Item.getgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_subject_id()), new Short(AV18W_B714_SD1_CRF_INFO_Item.getgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_crf_id())});
            while ( (pr_default.getStatus(0) != 101) )
            {
               A295TBT02_DEL_FLG = P00632_A295TBT02_DEL_FLG[0] ;
               n295TBT02_DEL_FLG = P00632_n295TBT02_DEL_FLG[0] ;
               A294TBT02_CRF_ID = P00632_A294TBT02_CRF_ID[0] ;
               A293TBT02_SUBJECT_ID = P00632_A293TBT02_SUBJECT_ID[0] ;
               A292TBT02_STUDY_ID = P00632_A292TBT02_STUDY_ID[0] ;
               A302TBT02_UPD_CNT = P00632_A302TBT02_UPD_CNT[0] ;
               n302TBT02_UPD_CNT = P00632_n302TBT02_UPD_CNT[0] ;
               A371TBT02_CRF_INPUT_LEVEL = P00632_A371TBT02_CRF_INPUT_LEVEL[0] ;
               n371TBT02_CRF_INPUT_LEVEL = P00632_n371TBT02_CRF_INPUT_LEVEL[0] ;
               A563TBT02_DM_ARRIVAL_FLG = P00632_A563TBT02_DM_ARRIVAL_FLG[0] ;
               n563TBT02_DM_ARRIVAL_FLG = P00632_n563TBT02_DM_ARRIVAL_FLG[0] ;
               A564TBT02_DM_ARRIVAL_DATETIME = P00632_A564TBT02_DM_ARRIVAL_DATETIME[0] ;
               n564TBT02_DM_ARRIVAL_DATETIME = P00632_n564TBT02_DM_ARRIVAL_DATETIME[0] ;
               A565TBT02_APPROVAL_FLG = P00632_A565TBT02_APPROVAL_FLG[0] ;
               n565TBT02_APPROVAL_FLG = P00632_n565TBT02_APPROVAL_FLG[0] ;
               A566TBT02_APPROVAL_DATETIME = P00632_A566TBT02_APPROVAL_DATETIME[0] ;
               n566TBT02_APPROVAL_DATETIME = P00632_n566TBT02_APPROVAL_DATETIME[0] ;
               A567TBT02_APPROVAL_USER_ID = P00632_A567TBT02_APPROVAL_USER_ID[0] ;
               n567TBT02_APPROVAL_USER_ID = P00632_n567TBT02_APPROVAL_USER_ID[0] ;
               A568TBT02_APPROVAL_AUTH_CD = P00632_A568TBT02_APPROVAL_AUTH_CD[0] ;
               n568TBT02_APPROVAL_AUTH_CD = P00632_n568TBT02_APPROVAL_AUTH_CD[0] ;
               AV28GXLvl38 = (byte)(1) ;
               if ( AV18W_B714_SD1_CRF_INFO_Item.getgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_upd_cnt() != A302TBT02_UPD_CNT )
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
               AV8BC_TBT02_CRF.Load(AV16P_STUDY_ID, AV18W_B714_SD1_CRF_INFO_Item.getgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_subject_id(), AV18W_B714_SD1_CRF_INFO_Item.getgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_crf_id());
               /* Execute user subroutine: S13242 */
               S13242 ();
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
               AV8BC_TBT02_CRF.setgxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm( AV29Pgmname );
               AV8BC_TBT02_CRF.Save();
               /* Execute user subroutine: S13242 */
               S13242 ();
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
               AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_study_id( A292TBT02_STUDY_ID );
               AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_subject_id( A293TBT02_SUBJECT_ID );
               AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_id( A294TBT02_CRF_ID );
               AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_version( AV8BC_TBT02_CRF.getgxTv_SdtTBT02_CRF_Tbt02_crf_latest_version() );
               AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level( A371TBT02_CRF_INPUT_LEVEL );
               AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime( AV8BC_TBT02_CRF.getgxTv_SdtTBT02_CRF_Tbt02_upload_datetime() );
               AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id( AV8BC_TBT02_CRF.getgxTv_SdtTBT02_CRF_Tbt02_upload_user_id() );
               AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd( AV8BC_TBT02_CRF.getgxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd() );
               AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg( A563TBT02_DM_ARRIVAL_FLG );
               AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime( A564TBT02_DM_ARRIVAL_DATETIME );
               AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg( A565TBT02_APPROVAL_FLG );
               AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime( A566TBT02_APPROVAL_DATETIME );
               AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id( A567TBT02_APPROVAL_USER_ID );
               AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd( A568TBT02_APPROVAL_AUTH_CD );
               AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg( AV8BC_TBT02_CRF.getgxTv_SdtTBT02_CRF_Tbt02_input_end_flg() );
               AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime( AV8BC_TBT02_CRF.getgxTv_SdtTBT02_CRF_Tbt02_input_end_datetime() );
               AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id( AV8BC_TBT02_CRF.getgxTv_SdtTBT02_CRF_Tbt02_input_end_user_id() );
               AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd( AV8BC_TBT02_CRF.getgxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd() );
               if ( AV15P_SHOR_KBN == 0 )
               {
                  AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu( "CRFÅèð" );
               }
               else
               {
                  AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu( "CRFÅè" );
               }
               AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg( "0" );
               AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm( AV29Pgmname );
               AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm( AV29Pgmname );
               AV9BC_TBT11_CRF_HISTORY.Save();
               /* Execute user subroutine: S14254 */
               S14254 ();
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
               /* Using cursor P00633 */
               pr_default.execute(1, new Object[] {new Long(AV16P_STUDY_ID), new Integer(AV18W_B714_SD1_CRF_INFO_Item.getgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_subject_id()), new Short(AV18W_B714_SD1_CRF_INFO_Item.getgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_crf_id())});
               while ( (pr_default.getStatus(1) != 101) )
               {
                  A328TBT12_DEL_FLG = P00633_A328TBT12_DEL_FLG[0] ;
                  n328TBT12_DEL_FLG = P00633_n328TBT12_DEL_FLG[0] ;
                  A317TBT12_CRF_ID = P00633_A317TBT12_CRF_ID[0] ;
                  A316TBT12_SUBJECT_ID = P00633_A316TBT12_SUBJECT_ID[0] ;
                  A315TBT12_STUDY_ID = P00633_A315TBT12_STUDY_ID[0] ;
                  A318TBT12_CRF_ITEM_GRP_DIV = P00633_A318TBT12_CRF_ITEM_GRP_DIV[0] ;
                  A319TBT12_CRF_ITEM_GRP_CD = P00633_A319TBT12_CRF_ITEM_GRP_CD[0] ;
                  A320TBT12_CRF_VALUE = P00633_A320TBT12_CRF_VALUE[0] ;
                  n320TBT12_CRF_VALUE = P00633_n320TBT12_CRF_VALUE[0] ;
                  AV10BC_TBT13_CRF_RES_HIS = (SdtTBT13_CRF_RES_HIS)new SdtTBT13_CRF_RES_HIS( remoteHandle, context);
                  AV10BC_TBT13_CRF_RES_HIS.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_study_id( A315TBT12_STUDY_ID );
                  AV10BC_TBT13_CRF_RES_HIS.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_subject_id( A316TBT12_SUBJECT_ID );
                  AV10BC_TBT13_CRF_RES_HIS.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_id( A317TBT12_CRF_ID );
                  AV10BC_TBT13_CRF_RES_HIS.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_version( AV8BC_TBT02_CRF.getgxTv_SdtTBT02_CRF_Tbt02_crf_latest_version() );
                  AV10BC_TBT13_CRF_RES_HIS.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_div( A318TBT12_CRF_ITEM_GRP_DIV );
                  AV10BC_TBT13_CRF_RES_HIS.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_cd( A319TBT12_CRF_ITEM_GRP_CD );
                  AV10BC_TBT13_CRF_RES_HIS.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value( A320TBT12_CRF_VALUE );
                  AV10BC_TBT13_CRF_RES_HIS.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg( "0" );
                  AV10BC_TBT13_CRF_RES_HIS.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg( "0" );
                  AV10BC_TBT13_CRF_RES_HIS.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm( AV29Pgmname );
                  AV10BC_TBT13_CRF_RES_HIS.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm( AV29Pgmname );
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
                  AV23W_LOGTEXT = AV23W_LOGTEXT + "DM_ARRIVAL_FLG:" + A563TBT02_DM_ARRIVAL_FLG + GXutil.chr( (short)(9)) ;
                  if ( AV15P_SHOR_KBN == 0 )
                  {
                     AV23W_LOGTEXT = AV23W_LOGTEXT + "UPD_RIYU:" + "CRFÅèð" + GXutil.chr( (short)(9)) ;
                  }
                  else
                  {
                     AV23W_LOGTEXT = AV23W_LOGTEXT + "UPD_RIYU:" + "CRFÅè" + GXutil.chr( (short)(9)) ;
                  }
                  AV23W_LOGTEXT = GXutil.strReplace( AV23W_LOGTEXT, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "@br@") ;
                  new a804_pc03_datalog(remoteHandle, context).execute( AV29Pgmname, "UPD", AV23W_LOGTEXT) ;
               }
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(0);
            if ( AV28GXLvl38 == 0 )
            {
               AV21W_RTN_CD = (byte)(1) ;
               GXt_char1 = AV22W_RTN_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc02_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char2) ;
               b714_pc03_input_end_crf.this.GXt_char1 = GXv_char2[0] ;
               AV22W_RTN_MSG = GXt_char1 ;
            }
            AV27GXV1 = (int)(AV27GXV1+1) ;
         }
      }
      /* Execute user subroutine: S16281 */
      S16281 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S11189( )
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
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("1")) ;
         httpContext.wjLoc = formatLink("b790_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
      GXv_char2[0] = AV11C_DM_AUTH_CD ;
      GXv_int4[0] = AV12C_DM_INPUT_LEVEL ;
      new b799_pc06_dm_info_get(remoteHandle, context).execute( GXv_char2, GXv_int4) ;
      b714_pc03_input_end_crf.this.AV11C_DM_AUTH_CD = GXv_char2[0] ;
      b714_pc03_input_end_crf.this.AV12C_DM_INPUT_LEVEL = GXv_int4[0] ;
      new a804_pc02_log_start(remoteHandle, context).execute( AV29Pgmname) ;
   }

   public void S12215( )
   {
      /* 'SUB_MAST_CHK' Routine */
      AV31GXLvl218 = (byte)(0) ;
      /* Using cursor P00634 */
      pr_default.execute(2, new Object[] {new Long(AV16P_STUDY_ID)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A189TBM21_DEL_FLG = P00634_A189TBM21_DEL_FLG[0] ;
         n189TBM21_DEL_FLG = P00634_n189TBM21_DEL_FLG[0] ;
         A186TBM21_STUDY_ID = P00634_A186TBM21_STUDY_ID[0] ;
         A513TBM21_STATUS = P00634_A513TBM21_STATUS[0] ;
         n513TBM21_STATUS = P00634_n513TBM21_STATUS[0] ;
         AV31GXLvl218 = (byte)(1) ;
         if ( GXutil.strcmp(A513TBM21_STATUS, "2") == 0 )
         {
            AV21W_RTN_CD = (byte)(1) ;
            GXt_char1 = AV22W_RTN_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00038", "±ÌóÔ", "uI¹v", "XV", "", "", GXv_char2) ;
            b714_pc03_input_end_crf.this.GXt_char1 = GXv_char2[0] ;
            AV22W_RTN_MSG = GXt_char1 ;
         }
         else if ( GXutil.strcmp(A513TBM21_STATUS, "9") == 0 )
         {
            AV21W_RTN_CD = (byte)(1) ;
            GXt_char1 = AV22W_RTN_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00038", "±ÌóÔ", "u~v", "XV", "", "", GXv_char2) ;
            b714_pc03_input_end_crf.this.GXt_char1 = GXv_char2[0] ;
            AV22W_RTN_MSG = GXt_char1 ;
         }
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      if ( AV31GXLvl218 == 0 )
      {
         AV21W_RTN_CD = (byte)(1) ;
         GXt_char1 = AV22W_RTN_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc02_msg_get(remoteHandle, context).execute( "AE00038", "Ið³ê½±", "psÂ", "XV", "", "", GXv_char2) ;
         b714_pc03_input_end_crf.this.GXt_char1 = GXv_char2[0] ;
         AV22W_RTN_MSG = GXt_char1 ;
      }
   }

   public void S13242( )
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

   public void S14254( )
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

   public void S15266( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV29Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("b790_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      returnInSub = true;
      if (true) return;
   }

   public void S16281( )
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
                  /* Execute user subroutine: S15266 */
                  S15266 ();
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
      P00632_A295TBT02_DEL_FLG = new String[] {""} ;
      P00632_n295TBT02_DEL_FLG = new boolean[] {false} ;
      P00632_A294TBT02_CRF_ID = new short[1] ;
      P00632_A293TBT02_SUBJECT_ID = new int[1] ;
      P00632_A292TBT02_STUDY_ID = new long[1] ;
      P00632_A302TBT02_UPD_CNT = new long[1] ;
      P00632_n302TBT02_UPD_CNT = new boolean[] {false} ;
      P00632_A371TBT02_CRF_INPUT_LEVEL = new byte[1] ;
      P00632_n371TBT02_CRF_INPUT_LEVEL = new boolean[] {false} ;
      P00632_A563TBT02_DM_ARRIVAL_FLG = new String[] {""} ;
      P00632_n563TBT02_DM_ARRIVAL_FLG = new boolean[] {false} ;
      P00632_A564TBT02_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P00632_n564TBT02_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      P00632_A565TBT02_APPROVAL_FLG = new String[] {""} ;
      P00632_n565TBT02_APPROVAL_FLG = new boolean[] {false} ;
      P00632_A566TBT02_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P00632_n566TBT02_APPROVAL_DATETIME = new boolean[] {false} ;
      P00632_A567TBT02_APPROVAL_USER_ID = new String[] {""} ;
      P00632_n567TBT02_APPROVAL_USER_ID = new boolean[] {false} ;
      P00632_A568TBT02_APPROVAL_AUTH_CD = new String[] {""} ;
      P00632_n568TBT02_APPROVAL_AUTH_CD = new boolean[] {false} ;
      A295TBT02_DEL_FLG = "" ;
      A563TBT02_DM_ARRIVAL_FLG = "" ;
      A564TBT02_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A565TBT02_APPROVAL_FLG = "" ;
      A566TBT02_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A567TBT02_APPROVAL_USER_ID = "" ;
      A568TBT02_APPROVAL_AUTH_CD = "" ;
      AV8BC_TBT02_CRF = new SdtTBT02_CRF(remoteHandle);
      AV17W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV11C_DM_AUTH_CD = "" ;
      AV29Pgmname = "" ;
      AV9BC_TBT11_CRF_HISTORY = new SdtTBT11_CRF_HISTORY(remoteHandle);
      P00633_A328TBT12_DEL_FLG = new String[] {""} ;
      P00633_n328TBT12_DEL_FLG = new boolean[] {false} ;
      P00633_A317TBT12_CRF_ID = new short[1] ;
      P00633_A316TBT12_SUBJECT_ID = new int[1] ;
      P00633_A315TBT12_STUDY_ID = new long[1] ;
      P00633_A318TBT12_CRF_ITEM_GRP_DIV = new String[] {""} ;
      P00633_A319TBT12_CRF_ITEM_GRP_CD = new String[] {""} ;
      P00633_A320TBT12_CRF_VALUE = new String[] {""} ;
      P00633_n320TBT12_CRF_VALUE = new boolean[] {false} ;
      A328TBT12_DEL_FLG = "" ;
      A318TBT12_CRF_ITEM_GRP_DIV = "" ;
      A319TBT12_CRF_ITEM_GRP_CD = "" ;
      A320TBT12_CRF_VALUE = "" ;
      AV10BC_TBT13_CRF_RES_HIS = new SdtTBT13_CRF_RES_HIS(remoteHandle);
      AV23W_LOGTEXT = "" ;
      GXv_SdtA_LOGIN_SDT3 = new SdtA_LOGIN_SDT [1] ;
      AV20W_ERRCD = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      GXv_int4 = new byte [1] ;
      P00634_A189TBM21_DEL_FLG = new String[] {""} ;
      P00634_n189TBM21_DEL_FLG = new boolean[] {false} ;
      P00634_A186TBM21_STUDY_ID = new long[1] ;
      P00634_A513TBM21_STATUS = new String[] {""} ;
      P00634_n513TBM21_STATUS = new boolean[] {false} ;
      A189TBM21_DEL_FLG = "" ;
      A513TBM21_STATUS = "" ;
      GXv_char2 = new String [1] ;
      GXt_char1 = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b714_pc03_input_end_crf__default(),
         new Object[] {
             new Object[] {
            P00632_A295TBT02_DEL_FLG, P00632_n295TBT02_DEL_FLG, P00632_A294TBT02_CRF_ID, P00632_A293TBT02_SUBJECT_ID, P00632_A292TBT02_STUDY_ID, P00632_A302TBT02_UPD_CNT, P00632_n302TBT02_UPD_CNT, P00632_A371TBT02_CRF_INPUT_LEVEL, P00632_n371TBT02_CRF_INPUT_LEVEL, P00632_A563TBT02_DM_ARRIVAL_FLG,
            P00632_n563TBT02_DM_ARRIVAL_FLG, P00632_A564TBT02_DM_ARRIVAL_DATETIME, P00632_n564TBT02_DM_ARRIVAL_DATETIME, P00632_A565TBT02_APPROVAL_FLG, P00632_n565TBT02_APPROVAL_FLG, P00632_A566TBT02_APPROVAL_DATETIME, P00632_n566TBT02_APPROVAL_DATETIME, P00632_A567TBT02_APPROVAL_USER_ID, P00632_n567TBT02_APPROVAL_USER_ID, P00632_A568TBT02_APPROVAL_AUTH_CD,
            P00632_n568TBT02_APPROVAL_AUTH_CD
            }
            , new Object[] {
            P00633_A328TBT12_DEL_FLG, P00633_n328TBT12_DEL_FLG, P00633_A317TBT12_CRF_ID, P00633_A316TBT12_SUBJECT_ID, P00633_A315TBT12_STUDY_ID, P00633_A318TBT12_CRF_ITEM_GRP_DIV, P00633_A319TBT12_CRF_ITEM_GRP_CD, P00633_A320TBT12_CRF_VALUE, P00633_n320TBT12_CRF_VALUE
            }
            , new Object[] {
            P00634_A189TBM21_DEL_FLG, P00634_n189TBM21_DEL_FLG, P00634_A186TBM21_STUDY_ID, P00634_A513TBM21_STATUS, P00634_n513TBM21_STATUS
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV29Pgmname = "B714_PC03_INPUT_END_CRF" ;
      /* GeneXus formulas. */
      AV29Pgmname = "B714_PC03_INPUT_END_CRF" ;
      Gx_err = (short)(0) ;
   }

   private byte AV15P_SHOR_KBN ;
   private byte AV21W_RTN_CD ;
   private byte AV28GXLvl38 ;
   private byte A371TBT02_CRF_INPUT_LEVEL ;
   private byte AV12C_DM_INPUT_LEVEL ;
   private byte GXv_int4[] ;
   private byte AV31GXLvl218 ;
   private short A294TBT02_CRF_ID ;
   private short A317TBT12_CRF_ID ;
   private short Gx_err ;
   private int AV27GXV1 ;
   private int A293TBT02_SUBJECT_ID ;
   private int A316TBT12_SUBJECT_ID ;
   private int GXActiveErrHndl ;
   private long AV16P_STUDY_ID ;
   private long A292TBT02_STUDY_ID ;
   private long A302TBT02_UPD_CNT ;
   private long A315TBT12_STUDY_ID ;
   private long A186TBM21_STUDY_ID ;
   private String scmdbuf ;
   private String AV29Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String GXv_char2[] ;
   private String GXt_char1 ;
   private String Gx_emsg ;
   private java.util.Date AV19W_DATETIME ;
   private java.util.Date A564TBT02_DM_ARRIVAL_DATETIME ;
   private java.util.Date A566TBT02_APPROVAL_DATETIME ;
   private boolean returnInSub ;
   private boolean n295TBT02_DEL_FLG ;
   private boolean n302TBT02_UPD_CNT ;
   private boolean n371TBT02_CRF_INPUT_LEVEL ;
   private boolean n563TBT02_DM_ARRIVAL_FLG ;
   private boolean n564TBT02_DM_ARRIVAL_DATETIME ;
   private boolean n565TBT02_APPROVAL_FLG ;
   private boolean n566TBT02_APPROVAL_DATETIME ;
   private boolean n567TBT02_APPROVAL_USER_ID ;
   private boolean n568TBT02_APPROVAL_AUTH_CD ;
   private boolean n328TBT12_DEL_FLG ;
   private boolean n320TBT12_CRF_VALUE ;
   private boolean n189TBM21_DEL_FLG ;
   private boolean n513TBM21_STATUS ;
   private String AV22W_RTN_MSG ;
   private String AV13C_TAM02_APP_ID ;
   private String A295TBT02_DEL_FLG ;
   private String A563TBT02_DM_ARRIVAL_FLG ;
   private String A565TBT02_APPROVAL_FLG ;
   private String A567TBT02_APPROVAL_USER_ID ;
   private String A568TBT02_APPROVAL_AUTH_CD ;
   private String AV11C_DM_AUTH_CD ;
   private String A328TBT12_DEL_FLG ;
   private String A318TBT12_CRF_ITEM_GRP_DIV ;
   private String A319TBT12_CRF_ITEM_GRP_CD ;
   private String A320TBT12_CRF_VALUE ;
   private String AV23W_LOGTEXT ;
   private String AV20W_ERRCD ;
   private String A189TBM21_DEL_FLG ;
   private String A513TBM21_STATUS ;
   private SdtA_LOGIN_SDT AV17W_A_LOGIN_SDT ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P00632_A295TBT02_DEL_FLG ;
   private boolean[] P00632_n295TBT02_DEL_FLG ;
   private short[] P00632_A294TBT02_CRF_ID ;
   private int[] P00632_A293TBT02_SUBJECT_ID ;
   private long[] P00632_A292TBT02_STUDY_ID ;
   private long[] P00632_A302TBT02_UPD_CNT ;
   private boolean[] P00632_n302TBT02_UPD_CNT ;
   private byte[] P00632_A371TBT02_CRF_INPUT_LEVEL ;
   private boolean[] P00632_n371TBT02_CRF_INPUT_LEVEL ;
   private String[] P00632_A563TBT02_DM_ARRIVAL_FLG ;
   private boolean[] P00632_n563TBT02_DM_ARRIVAL_FLG ;
   private java.util.Date[] P00632_A564TBT02_DM_ARRIVAL_DATETIME ;
   private boolean[] P00632_n564TBT02_DM_ARRIVAL_DATETIME ;
   private String[] P00632_A565TBT02_APPROVAL_FLG ;
   private boolean[] P00632_n565TBT02_APPROVAL_FLG ;
   private java.util.Date[] P00632_A566TBT02_APPROVAL_DATETIME ;
   private boolean[] P00632_n566TBT02_APPROVAL_DATETIME ;
   private String[] P00632_A567TBT02_APPROVAL_USER_ID ;
   private boolean[] P00632_n567TBT02_APPROVAL_USER_ID ;
   private String[] P00632_A568TBT02_APPROVAL_AUTH_CD ;
   private boolean[] P00632_n568TBT02_APPROVAL_AUTH_CD ;
   private String[] P00633_A328TBT12_DEL_FLG ;
   private boolean[] P00633_n328TBT12_DEL_FLG ;
   private short[] P00633_A317TBT12_CRF_ID ;
   private int[] P00633_A316TBT12_SUBJECT_ID ;
   private long[] P00633_A315TBT12_STUDY_ID ;
   private String[] P00633_A318TBT12_CRF_ITEM_GRP_DIV ;
   private String[] P00633_A319TBT12_CRF_ITEM_GRP_CD ;
   private String[] P00633_A320TBT12_CRF_VALUE ;
   private boolean[] P00633_n320TBT12_CRF_VALUE ;
   private String[] P00634_A189TBM21_DEL_FLG ;
   private boolean[] P00634_n189TBM21_DEL_FLG ;
   private long[] P00634_A186TBM21_STUDY_ID ;
   private String[] P00634_A513TBM21_STATUS ;
   private boolean[] P00634_n513TBM21_STATUS ;
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
          new ForEachCursor("P00632", "SELECT `TBT02_DEL_FLG`, `TBT02_CRF_ID`, `TBT02_SUBJECT_ID`, `TBT02_STUDY_ID`, `TBT02_UPD_CNT`, `TBT02_CRF_INPUT_LEVEL`, `TBT02_DM_ARRIVAL_FLG`, `TBT02_DM_ARRIVAL_DATETIME`, `TBT02_APPROVAL_FLG`, `TBT02_APPROVAL_DATETIME`, `TBT02_APPROVAL_USER_ID`, `TBT02_APPROVAL_AUTH_CD` FROM `TBT02_CRF` WHERE (`TBT02_STUDY_ID` = ? and `TBT02_SUBJECT_ID` = ? and `TBT02_CRF_ID` = ?) AND (`TBT02_DEL_FLG` = '0') ORDER BY `TBT02_STUDY_ID`, `TBT02_SUBJECT_ID`, `TBT02_CRF_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P00633", "SELECT `TBT12_DEL_FLG`, `TBT12_CRF_ID`, `TBT12_SUBJECT_ID`, `TBT12_STUDY_ID`, `TBT12_CRF_ITEM_GRP_DIV`, `TBT12_CRF_ITEM_GRP_CD`, `TBT12_CRF_VALUE` FROM `TBT12_CRF_RESULT` WHERE (`TBT12_STUDY_ID` = ? and `TBT12_SUBJECT_ID` = ? and `TBT12_CRF_ID` = ?) AND (`TBT12_DEL_FLG` = '0') ORDER BY `TBT12_STUDY_ID`, `TBT12_SUBJECT_ID`, `TBT12_CRF_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
         ,new ForEachCursor("P00634", "SELECT `TBM21_DEL_FLG`, `TBM21_STUDY_ID`, `TBM21_STATUS` FROM `TBM21_STUDY` WHERE (`TBM21_STUDY_ID` = ?) AND (`TBM21_DEL_FLG` = '0') ORDER BY `TBM21_STUDY_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((int[]) buf[3])[0] = rslt.getInt(3) ;
               ((long[]) buf[4])[0] = rslt.getLong(4) ;
               ((long[]) buf[5])[0] = rslt.getLong(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               break;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2) ;
               ((int[]) buf[3])[0] = rslt.getInt(3) ;
               ((long[]) buf[4])[0] = rslt.getLong(4) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               break;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
      }
   }

}

