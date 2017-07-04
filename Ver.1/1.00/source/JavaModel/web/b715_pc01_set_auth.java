/*
               File: B715_PC01_SET_AUTH
        Description: DM到着解除処理
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:56:31.38
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b715_pc01_set_auth extends GXProcedure
{
   public b715_pc01_set_auth( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b715_pc01_set_auth.class ), "" );
   }

   public b715_pc01_set_auth( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( long aP0 ,
                             GxObjectCollection aP1 ,
                             byte[] aP2 )
   {
      b715_pc01_set_auth.this.AV16P_STUDY_ID = aP0;
      b715_pc01_set_auth.this.AV15P_B714_SD1_CRF_INFO = aP1;
      b715_pc01_set_auth.this.aP3 = new String[] {""};
      initialize();
      privateExecute();
      return aP3[0];
   }

   public void execute( long aP0 ,
                        GxObjectCollection aP1 ,
                        byte[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( long aP0 ,
                             GxObjectCollection aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      b715_pc01_set_auth.this.AV16P_STUDY_ID = aP0;
      b715_pc01_set_auth.this.AV15P_B714_SD1_CRF_INFO = aP1;
      b715_pc01_set_auth.this.aP2 = aP2;
      b715_pc01_set_auth.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV14C_TAM02_APP_ID = "B715" ;
      /* Execute user subroutine: S11164 */
      S11164 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV21W_RTN_CD = (byte)(0) ;
      AV22W_RTN_MSG = "" ;
      AV19W_DATETIME = GXutil.now( ) ;
      /* Execute user subroutine: S12206 */
      S12206 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( AV21W_RTN_CD == 0 )
      {
         AV26GXV1 = 1 ;
         while ( AV26GXV1 <= AV15P_B714_SD1_CRF_INFO.size() )
         {
            AV18W_B714_SD1_CRF_INFO_Item = (SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem)((SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem)AV15P_B714_SD1_CRF_INFO.elementAt(-1+AV26GXV1));
            AV27GXLvl38 = (byte)(0) ;
            /* Using cursor P00692 */
            pr_default.execute(0, new Object[] {new Long(AV16P_STUDY_ID), new Integer(AV18W_B714_SD1_CRF_INFO_Item.getgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_subject_id()), new Short(AV18W_B714_SD1_CRF_INFO_Item.getgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_crf_id())});
            while ( (pr_default.getStatus(0) != 101) )
            {
               A295TBT02_DEL_FLG = P00692_A295TBT02_DEL_FLG[0] ;
               n295TBT02_DEL_FLG = P00692_n295TBT02_DEL_FLG[0] ;
               A294TBT02_CRF_ID = P00692_A294TBT02_CRF_ID[0] ;
               A293TBT02_SUBJECT_ID = P00692_A293TBT02_SUBJECT_ID[0] ;
               A292TBT02_STUDY_ID = P00692_A292TBT02_STUDY_ID[0] ;
               A302TBT02_UPD_CNT = P00692_A302TBT02_UPD_CNT[0] ;
               n302TBT02_UPD_CNT = P00692_n302TBT02_UPD_CNT[0] ;
               A564TBT02_DM_ARRIVAL_DATETIME = P00692_A564TBT02_DM_ARRIVAL_DATETIME[0] ;
               n564TBT02_DM_ARRIVAL_DATETIME = P00692_n564TBT02_DM_ARRIVAL_DATETIME[0] ;
               A565TBT02_APPROVAL_FLG = P00692_A565TBT02_APPROVAL_FLG[0] ;
               n565TBT02_APPROVAL_FLG = P00692_n565TBT02_APPROVAL_FLG[0] ;
               A566TBT02_APPROVAL_DATETIME = P00692_A566TBT02_APPROVAL_DATETIME[0] ;
               n566TBT02_APPROVAL_DATETIME = P00692_n566TBT02_APPROVAL_DATETIME[0] ;
               A567TBT02_APPROVAL_USER_ID = P00692_A567TBT02_APPROVAL_USER_ID[0] ;
               n567TBT02_APPROVAL_USER_ID = P00692_n567TBT02_APPROVAL_USER_ID[0] ;
               A568TBT02_APPROVAL_AUTH_CD = P00692_A568TBT02_APPROVAL_AUTH_CD[0] ;
               n568TBT02_APPROVAL_AUTH_CD = P00692_n568TBT02_APPROVAL_AUTH_CD[0] ;
               A569TBT02_INPUT_END_FLG = P00692_A569TBT02_INPUT_END_FLG[0] ;
               n569TBT02_INPUT_END_FLG = P00692_n569TBT02_INPUT_END_FLG[0] ;
               A570TBT02_INPUT_END_DATETIME = P00692_A570TBT02_INPUT_END_DATETIME[0] ;
               n570TBT02_INPUT_END_DATETIME = P00692_n570TBT02_INPUT_END_DATETIME[0] ;
               A571TBT02_INPUT_END_USER_ID = P00692_A571TBT02_INPUT_END_USER_ID[0] ;
               n571TBT02_INPUT_END_USER_ID = P00692_n571TBT02_INPUT_END_USER_ID[0] ;
               A572TBT02_INPUT_END_AUTH_CD = P00692_A572TBT02_INPUT_END_AUTH_CD[0] ;
               n572TBT02_INPUT_END_AUTH_CD = P00692_n572TBT02_INPUT_END_AUTH_CD[0] ;
               AV27GXLvl38 = (byte)(1) ;
               if ( AV18W_B714_SD1_CRF_INFO_Item.getgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_upd_cnt() != A302TBT02_UPD_CNT )
               {
                  AV21W_RTN_CD = (byte)(1) ;
                  GXt_char1 = AV22W_RTN_MSG ;
                  GXv_char2[0] = GXt_char1 ;
                  new a805_pc02_msg_get(remoteHandle, context).execute( "AX00007", "", "", "", "", "", GXv_char2) ;
                  b715_pc01_set_auth.this.GXt_char1 = GXv_char2[0] ;
                  AV22W_RTN_MSG = GXt_char1 ;
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               AV8BC_TBT02_CRF.Load(AV16P_STUDY_ID, AV18W_B714_SD1_CRF_INFO_Item.getgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_subject_id(), AV18W_B714_SD1_CRF_INFO_Item.getgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_crf_id());
               /* Execute user subroutine: S13233 */
               S13233 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               AV8BC_TBT02_CRF.setgxTv_SdtTBT02_CRF_Tbt02_crf_latest_version( (short)(AV8BC_TBT02_CRF.getgxTv_SdtTBT02_CRF_Tbt02_crf_latest_version()+1) );
               AV8BC_TBT02_CRF.setgxTv_SdtTBT02_CRF_Tbt02_crf_input_level( AV11C_CRC_INPUT_LEVEL );
               AV8BC_TBT02_CRF.setgxTv_SdtTBT02_CRF_Tbt02_upload_datetime( AV19W_DATETIME );
               AV8BC_TBT02_CRF.setgxTv_SdtTBT02_CRF_Tbt02_upload_user_id( AV17W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() );
               AV8BC_TBT02_CRF.setgxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd( AV12C_DM_AUTH_CD );
               AV8BC_TBT02_CRF.setgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg( "0" );
               AV8BC_TBT02_CRF.setgxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm( AV28Pgmname );
               AV8BC_TBT02_CRF.Save();
               /* Execute user subroutine: S13233 */
               S13233 ();
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
               AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level( AV8BC_TBT02_CRF.getgxTv_SdtTBT02_CRF_Tbt02_crf_input_level() );
               AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime( AV8BC_TBT02_CRF.getgxTv_SdtTBT02_CRF_Tbt02_upload_datetime() );
               AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id( AV8BC_TBT02_CRF.getgxTv_SdtTBT02_CRF_Tbt02_upload_user_id() );
               AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd( AV8BC_TBT02_CRF.getgxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd() );
               AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg( AV8BC_TBT02_CRF.getgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg() );
               AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime( A564TBT02_DM_ARRIVAL_DATETIME );
               AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg( A565TBT02_APPROVAL_FLG );
               AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime( A566TBT02_APPROVAL_DATETIME );
               AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id( A567TBT02_APPROVAL_USER_ID );
               AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd( A568TBT02_APPROVAL_AUTH_CD );
               AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg( A569TBT02_INPUT_END_FLG );
               AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime( A570TBT02_INPUT_END_DATETIME );
               AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id( A571TBT02_INPUT_END_USER_ID );
               AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd( A572TBT02_INPUT_END_AUTH_CD );
               AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu( "DM到着解除" );
               AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg( "0" );
               AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm( AV28Pgmname );
               AV9BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm( AV28Pgmname );
               AV9BC_TBT11_CRF_HISTORY.Save();
               /* Execute user subroutine: S14245 */
               S14245 ();
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
               /* Using cursor P00693 */
               pr_default.execute(1, new Object[] {new Long(AV16P_STUDY_ID), new Integer(AV18W_B714_SD1_CRF_INFO_Item.getgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_subject_id()), new Short(AV18W_B714_SD1_CRF_INFO_Item.getgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_crf_id())});
               while ( (pr_default.getStatus(1) != 101) )
               {
                  A328TBT12_DEL_FLG = P00693_A328TBT12_DEL_FLG[0] ;
                  n328TBT12_DEL_FLG = P00693_n328TBT12_DEL_FLG[0] ;
                  A317TBT12_CRF_ID = P00693_A317TBT12_CRF_ID[0] ;
                  A316TBT12_SUBJECT_ID = P00693_A316TBT12_SUBJECT_ID[0] ;
                  A315TBT12_STUDY_ID = P00693_A315TBT12_STUDY_ID[0] ;
                  A318TBT12_CRF_ITEM_GRP_DIV = P00693_A318TBT12_CRF_ITEM_GRP_DIV[0] ;
                  A319TBT12_CRF_ITEM_GRP_CD = P00693_A319TBT12_CRF_ITEM_GRP_CD[0] ;
                  A320TBT12_CRF_VALUE = P00693_A320TBT12_CRF_VALUE[0] ;
                  n320TBT12_CRF_VALUE = P00693_n320TBT12_CRF_VALUE[0] ;
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
                  AV10BC_TBT13_CRF_RES_HIS.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm( AV28Pgmname );
                  AV10BC_TBT13_CRF_RES_HIS.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm( AV28Pgmname );
                  AV10BC_TBT13_CRF_RES_HIS.Save();
                  pr_default.readNext(1);
               }
               pr_default.close(1);
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(0);
            if ( AV27GXLvl38 == 0 )
            {
               AV21W_RTN_CD = (byte)(1) ;
               GXt_char1 = AV22W_RTN_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc02_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char2) ;
               b715_pc01_set_auth.this.GXt_char1 = GXv_char2[0] ;
               AV22W_RTN_MSG = GXt_char1 ;
            }
            if ( AV21W_RTN_CD == 0 )
            {
               AV23W_LOGTEXT = "" ;
               AV23W_LOGTEXT = AV23W_LOGTEXT + "STUDY_ID:" + GXutil.trim( GXutil.str( AV16P_STUDY_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
               AV23W_LOGTEXT = AV23W_LOGTEXT + "SUBJECT_ID:" + GXutil.trim( GXutil.str( AV18W_B714_SD1_CRF_INFO_Item.getgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_subject_id(), 6, 0)) + GXutil.chr( (short)(9)) ;
               AV23W_LOGTEXT = AV23W_LOGTEXT + "CRF_ID:" + GXutil.trim( GXutil.str( AV18W_B714_SD1_CRF_INFO_Item.getgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_crf_id(), 4, 0)) + GXutil.chr( (short)(9)) ;
               AV23W_LOGTEXT = AV23W_LOGTEXT + "DM_ARRIVAL_FLG:" + "0" + GXutil.chr( (short)(9)) ;
               AV23W_LOGTEXT = AV23W_LOGTEXT + "UPD_RIYU:" + "DM到着解除" + GXutil.chr( (short)(9)) ;
               AV23W_LOGTEXT = GXutil.strReplace( AV23W_LOGTEXT, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "@br@") ;
               new a804_pc03_datalog(remoteHandle, context).execute( AV28Pgmname, "UPD", AV23W_LOGTEXT) ;
            }
            AV26GXV1 = (int)(AV26GXV1+1) ;
         }
      }
      /* Execute user subroutine: S16272 */
      S16272 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S11164( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT3[0] = AV17W_A_LOGIN_SDT;
      GXv_char2[0] = AV20W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT3, GXv_char2) ;
      AV17W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT3[0] ;
      b715_pc01_set_auth.this.AV20W_ERRCD = GXv_char2[0] ;
      if ( GXutil.strcmp(AV20W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("1")) ;
         httpContext.wjLoc = formatLink("b790_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
      AV11C_CRC_INPUT_LEVEL = (byte)(0) ;
      /* Using cursor P00694 */
      pr_default.execute(2);
      while ( (pr_default.getStatus(2) != 101) )
      {
         A514TBM01_SYS_VALUE = P00694_A514TBM01_SYS_VALUE[0] ;
         n514TBM01_SYS_VALUE = P00694_n514TBM01_SYS_VALUE[0] ;
         A161TBM01_SYS_ID = P00694_A161TBM01_SYS_ID[0] ;
         /* Using cursor P00695 */
         pr_default.execute(3, new Object[] {new Boolean(n514TBM01_SYS_VALUE), A514TBM01_SYS_VALUE});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A17TAM04_AUTH_CD = P00695_A17TAM04_AUTH_CD[0] ;
            A601TAM04_AUTH_LVL = P00695_A601TAM04_AUTH_LVL[0] ;
            n601TAM04_AUTH_LVL = P00695_n601TAM04_AUTH_LVL[0] ;
            AV11C_CRC_INPUT_LEVEL = A601TAM04_AUTH_LVL ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      GXv_char2[0] = AV12C_DM_AUTH_CD ;
      GXv_int4[0] = AV13C_DM_INPUT_LEVEL ;
      new b799_pc06_dm_info_get(remoteHandle, context).execute( GXv_char2, GXv_int4) ;
      b715_pc01_set_auth.this.AV12C_DM_AUTH_CD = GXv_char2[0] ;
      b715_pc01_set_auth.this.AV13C_DM_INPUT_LEVEL = GXv_int4[0] ;
      new a804_pc02_log_start(remoteHandle, context).execute( AV28Pgmname) ;
   }

   public void S12206( )
   {
      /* 'SUB_MAST_CHK' Routine */
      AV32GXLvl209 = (byte)(0) ;
      /* Using cursor P00696 */
      pr_default.execute(4, new Object[] {new Long(AV16P_STUDY_ID)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A189TBM21_DEL_FLG = P00696_A189TBM21_DEL_FLG[0] ;
         n189TBM21_DEL_FLG = P00696_n189TBM21_DEL_FLG[0] ;
         A186TBM21_STUDY_ID = P00696_A186TBM21_STUDY_ID[0] ;
         A513TBM21_STATUS = P00696_A513TBM21_STATUS[0] ;
         n513TBM21_STATUS = P00696_n513TBM21_STATUS[0] ;
         AV32GXLvl209 = (byte)(1) ;
         if ( GXutil.strcmp(A513TBM21_STATUS, "2") == 0 )
         {
            AV21W_RTN_CD = (byte)(1) ;
            GXt_char1 = AV22W_RTN_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00038", "試験の状態", "「終了」", "更新", "", "", GXv_char2) ;
            b715_pc01_set_auth.this.GXt_char1 = GXv_char2[0] ;
            AV22W_RTN_MSG = GXt_char1 ;
         }
         else if ( GXutil.strcmp(A513TBM21_STATUS, "9") == 0 )
         {
            AV21W_RTN_CD = (byte)(1) ;
            GXt_char1 = AV22W_RTN_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00038", "試験の状態", "「中止」", "更新", "", "", GXv_char2) ;
            b715_pc01_set_auth.this.GXt_char1 = GXv_char2[0] ;
            AV22W_RTN_MSG = GXt_char1 ;
         }
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
      if ( AV32GXLvl209 == 0 )
      {
         AV21W_RTN_CD = (byte)(1) ;
         GXt_char1 = AV22W_RTN_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc02_msg_get(remoteHandle, context).execute( "AE00038", "選択された試験", "利用不可", "更新", "", "", GXv_char2) ;
         b715_pc01_set_auth.this.GXt_char1 = GXv_char2[0] ;
         AV22W_RTN_MSG = GXt_char1 ;
      }
   }

   public void S13233( )
   {
      /* 'SUB_TBT02_CHECK_ERROR' Routine */
      if ( AV8BC_TBT02_CRF.Fail() )
      {
         AV21W_RTN_CD = (byte)(1) ;
         GXt_char1 = AV22W_RTN_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV8BC_TBT02_CRF.GetMessages(), (byte)(0), GXv_char2) ;
         b715_pc01_set_auth.this.GXt_char1 = GXv_char2[0] ;
         AV22W_RTN_MSG = GXt_char1 + " (TBT02)" ;
      }
   }

   public void S14245( )
   {
      /* 'SUB_TBT11_CHECK_ERROR' Routine */
      if ( AV9BC_TBT11_CRF_HISTORY.Fail() )
      {
         AV21W_RTN_CD = (byte)(1) ;
         GXt_char1 = AV22W_RTN_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV9BC_TBT11_CRF_HISTORY.GetMessages(), (byte)(0), GXv_char2) ;
         b715_pc01_set_auth.this.GXt_char1 = GXv_char2[0] ;
         AV22W_RTN_MSG = GXt_char1 + " (TBT11)" ;
      }
   }

   public void S15257( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV28Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("b790_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      returnInSub = true;
      if (true) return;
   }

   public void S16272( )
   {
      /* 'SUB_TERMINATE' Routine */
      if ( AV21W_RTN_CD == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "b715_pc01_set_auth");
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "b715_pc01_set_auth");
      }
   }

   protected void cleanup( )
   {
      this.aP2[0] = b715_pc01_set_auth.this.AV21W_RTN_CD;
      this.aP3[0] = b715_pc01_set_auth.this.AV22W_RTN_MSG;
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
                  /* Execute user subroutine: S15257 */
                  S15257 ();
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
      AV14C_TAM02_APP_ID = "" ;
      AV19W_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      AV18W_B714_SD1_CRF_INFO_Item = new SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem(remoteHandle, context);
      scmdbuf = "" ;
      P00692_A295TBT02_DEL_FLG = new String[] {""} ;
      P00692_n295TBT02_DEL_FLG = new boolean[] {false} ;
      P00692_A294TBT02_CRF_ID = new short[1] ;
      P00692_A293TBT02_SUBJECT_ID = new int[1] ;
      P00692_A292TBT02_STUDY_ID = new long[1] ;
      P00692_A302TBT02_UPD_CNT = new long[1] ;
      P00692_n302TBT02_UPD_CNT = new boolean[] {false} ;
      P00692_A564TBT02_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P00692_n564TBT02_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      P00692_A565TBT02_APPROVAL_FLG = new String[] {""} ;
      P00692_n565TBT02_APPROVAL_FLG = new boolean[] {false} ;
      P00692_A566TBT02_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P00692_n566TBT02_APPROVAL_DATETIME = new boolean[] {false} ;
      P00692_A567TBT02_APPROVAL_USER_ID = new String[] {""} ;
      P00692_n567TBT02_APPROVAL_USER_ID = new boolean[] {false} ;
      P00692_A568TBT02_APPROVAL_AUTH_CD = new String[] {""} ;
      P00692_n568TBT02_APPROVAL_AUTH_CD = new boolean[] {false} ;
      P00692_A569TBT02_INPUT_END_FLG = new String[] {""} ;
      P00692_n569TBT02_INPUT_END_FLG = new boolean[] {false} ;
      P00692_A570TBT02_INPUT_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P00692_n570TBT02_INPUT_END_DATETIME = new boolean[] {false} ;
      P00692_A571TBT02_INPUT_END_USER_ID = new String[] {""} ;
      P00692_n571TBT02_INPUT_END_USER_ID = new boolean[] {false} ;
      P00692_A572TBT02_INPUT_END_AUTH_CD = new String[] {""} ;
      P00692_n572TBT02_INPUT_END_AUTH_CD = new boolean[] {false} ;
      A295TBT02_DEL_FLG = "" ;
      A564TBT02_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A565TBT02_APPROVAL_FLG = "" ;
      A566TBT02_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A567TBT02_APPROVAL_USER_ID = "" ;
      A568TBT02_APPROVAL_AUTH_CD = "" ;
      A569TBT02_INPUT_END_FLG = "" ;
      A570TBT02_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A571TBT02_INPUT_END_USER_ID = "" ;
      A572TBT02_INPUT_END_AUTH_CD = "" ;
      AV8BC_TBT02_CRF = new SdtTBT02_CRF(remoteHandle);
      AV17W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV12C_DM_AUTH_CD = "" ;
      AV28Pgmname = "" ;
      AV9BC_TBT11_CRF_HISTORY = new SdtTBT11_CRF_HISTORY(remoteHandle);
      P00693_A328TBT12_DEL_FLG = new String[] {""} ;
      P00693_n328TBT12_DEL_FLG = new boolean[] {false} ;
      P00693_A317TBT12_CRF_ID = new short[1] ;
      P00693_A316TBT12_SUBJECT_ID = new int[1] ;
      P00693_A315TBT12_STUDY_ID = new long[1] ;
      P00693_A318TBT12_CRF_ITEM_GRP_DIV = new String[] {""} ;
      P00693_A319TBT12_CRF_ITEM_GRP_CD = new String[] {""} ;
      P00693_A320TBT12_CRF_VALUE = new String[] {""} ;
      P00693_n320TBT12_CRF_VALUE = new boolean[] {false} ;
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
      P00694_A514TBM01_SYS_VALUE = new String[] {""} ;
      P00694_n514TBM01_SYS_VALUE = new boolean[] {false} ;
      P00694_A161TBM01_SYS_ID = new String[] {""} ;
      A514TBM01_SYS_VALUE = "" ;
      A161TBM01_SYS_ID = "" ;
      P00695_A17TAM04_AUTH_CD = new String[] {""} ;
      P00695_A601TAM04_AUTH_LVL = new byte[1] ;
      P00695_n601TAM04_AUTH_LVL = new boolean[] {false} ;
      A17TAM04_AUTH_CD = "" ;
      GXv_int4 = new byte [1] ;
      P00696_A189TBM21_DEL_FLG = new String[] {""} ;
      P00696_n189TBM21_DEL_FLG = new boolean[] {false} ;
      P00696_A186TBM21_STUDY_ID = new long[1] ;
      P00696_A513TBM21_STATUS = new String[] {""} ;
      P00696_n513TBM21_STATUS = new boolean[] {false} ;
      A189TBM21_DEL_FLG = "" ;
      A513TBM21_STATUS = "" ;
      GXv_char2 = new String [1] ;
      GXt_char1 = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b715_pc01_set_auth__default(),
         new Object[] {
             new Object[] {
            P00692_A295TBT02_DEL_FLG, P00692_n295TBT02_DEL_FLG, P00692_A294TBT02_CRF_ID, P00692_A293TBT02_SUBJECT_ID, P00692_A292TBT02_STUDY_ID, P00692_A302TBT02_UPD_CNT, P00692_n302TBT02_UPD_CNT, P00692_A564TBT02_DM_ARRIVAL_DATETIME, P00692_n564TBT02_DM_ARRIVAL_DATETIME, P00692_A565TBT02_APPROVAL_FLG,
            P00692_n565TBT02_APPROVAL_FLG, P00692_A566TBT02_APPROVAL_DATETIME, P00692_n566TBT02_APPROVAL_DATETIME, P00692_A567TBT02_APPROVAL_USER_ID, P00692_n567TBT02_APPROVAL_USER_ID, P00692_A568TBT02_APPROVAL_AUTH_CD, P00692_n568TBT02_APPROVAL_AUTH_CD, P00692_A569TBT02_INPUT_END_FLG, P00692_n569TBT02_INPUT_END_FLG, P00692_A570TBT02_INPUT_END_DATETIME,
            P00692_n570TBT02_INPUT_END_DATETIME, P00692_A571TBT02_INPUT_END_USER_ID, P00692_n571TBT02_INPUT_END_USER_ID, P00692_A572TBT02_INPUT_END_AUTH_CD, P00692_n572TBT02_INPUT_END_AUTH_CD
            }
            , new Object[] {
            P00693_A328TBT12_DEL_FLG, P00693_n328TBT12_DEL_FLG, P00693_A317TBT12_CRF_ID, P00693_A316TBT12_SUBJECT_ID, P00693_A315TBT12_STUDY_ID, P00693_A318TBT12_CRF_ITEM_GRP_DIV, P00693_A319TBT12_CRF_ITEM_GRP_CD, P00693_A320TBT12_CRF_VALUE, P00693_n320TBT12_CRF_VALUE
            }
            , new Object[] {
            P00694_A514TBM01_SYS_VALUE, P00694_n514TBM01_SYS_VALUE, P00694_A161TBM01_SYS_ID
            }
            , new Object[] {
            P00695_A17TAM04_AUTH_CD, P00695_A601TAM04_AUTH_LVL, P00695_n601TAM04_AUTH_LVL
            }
            , new Object[] {
            P00696_A189TBM21_DEL_FLG, P00696_n189TBM21_DEL_FLG, P00696_A186TBM21_STUDY_ID, P00696_A513TBM21_STATUS, P00696_n513TBM21_STATUS
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV28Pgmname = "B715_PC01_SET_AUTH" ;
      /* GeneXus formulas. */
      AV28Pgmname = "B715_PC01_SET_AUTH" ;
      Gx_err = (short)(0) ;
   }

   private byte AV21W_RTN_CD ;
   private byte AV27GXLvl38 ;
   private byte AV11C_CRC_INPUT_LEVEL ;
   private byte A601TAM04_AUTH_LVL ;
   private byte AV13C_DM_INPUT_LEVEL ;
   private byte GXv_int4[] ;
   private byte AV32GXLvl209 ;
   private short A294TBT02_CRF_ID ;
   private short A317TBT12_CRF_ID ;
   private short Gx_err ;
   private int AV26GXV1 ;
   private int A293TBT02_SUBJECT_ID ;
   private int A316TBT12_SUBJECT_ID ;
   private int GXActiveErrHndl ;
   private long AV16P_STUDY_ID ;
   private long A292TBT02_STUDY_ID ;
   private long A302TBT02_UPD_CNT ;
   private long A315TBT12_STUDY_ID ;
   private long A186TBM21_STUDY_ID ;
   private String scmdbuf ;
   private String AV28Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String GXv_char2[] ;
   private String GXt_char1 ;
   private String Gx_emsg ;
   private java.util.Date AV19W_DATETIME ;
   private java.util.Date A564TBT02_DM_ARRIVAL_DATETIME ;
   private java.util.Date A566TBT02_APPROVAL_DATETIME ;
   private java.util.Date A570TBT02_INPUT_END_DATETIME ;
   private boolean returnInSub ;
   private boolean n295TBT02_DEL_FLG ;
   private boolean n302TBT02_UPD_CNT ;
   private boolean n564TBT02_DM_ARRIVAL_DATETIME ;
   private boolean n565TBT02_APPROVAL_FLG ;
   private boolean n566TBT02_APPROVAL_DATETIME ;
   private boolean n567TBT02_APPROVAL_USER_ID ;
   private boolean n568TBT02_APPROVAL_AUTH_CD ;
   private boolean n569TBT02_INPUT_END_FLG ;
   private boolean n570TBT02_INPUT_END_DATETIME ;
   private boolean n571TBT02_INPUT_END_USER_ID ;
   private boolean n572TBT02_INPUT_END_AUTH_CD ;
   private boolean n328TBT12_DEL_FLG ;
   private boolean n320TBT12_CRF_VALUE ;
   private boolean n514TBM01_SYS_VALUE ;
   private boolean n601TAM04_AUTH_LVL ;
   private boolean n189TBM21_DEL_FLG ;
   private boolean n513TBM21_STATUS ;
   private String AV22W_RTN_MSG ;
   private String AV14C_TAM02_APP_ID ;
   private String A295TBT02_DEL_FLG ;
   private String A565TBT02_APPROVAL_FLG ;
   private String A567TBT02_APPROVAL_USER_ID ;
   private String A568TBT02_APPROVAL_AUTH_CD ;
   private String A569TBT02_INPUT_END_FLG ;
   private String A571TBT02_INPUT_END_USER_ID ;
   private String A572TBT02_INPUT_END_AUTH_CD ;
   private String AV12C_DM_AUTH_CD ;
   private String A328TBT12_DEL_FLG ;
   private String A318TBT12_CRF_ITEM_GRP_DIV ;
   private String A319TBT12_CRF_ITEM_GRP_CD ;
   private String A320TBT12_CRF_VALUE ;
   private String AV23W_LOGTEXT ;
   private String AV20W_ERRCD ;
   private String A514TBM01_SYS_VALUE ;
   private String A161TBM01_SYS_ID ;
   private String A17TAM04_AUTH_CD ;
   private String A189TBM21_DEL_FLG ;
   private String A513TBM21_STATUS ;
   private SdtA_LOGIN_SDT AV17W_A_LOGIN_SDT ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P00692_A295TBT02_DEL_FLG ;
   private boolean[] P00692_n295TBT02_DEL_FLG ;
   private short[] P00692_A294TBT02_CRF_ID ;
   private int[] P00692_A293TBT02_SUBJECT_ID ;
   private long[] P00692_A292TBT02_STUDY_ID ;
   private long[] P00692_A302TBT02_UPD_CNT ;
   private boolean[] P00692_n302TBT02_UPD_CNT ;
   private java.util.Date[] P00692_A564TBT02_DM_ARRIVAL_DATETIME ;
   private boolean[] P00692_n564TBT02_DM_ARRIVAL_DATETIME ;
   private String[] P00692_A565TBT02_APPROVAL_FLG ;
   private boolean[] P00692_n565TBT02_APPROVAL_FLG ;
   private java.util.Date[] P00692_A566TBT02_APPROVAL_DATETIME ;
   private boolean[] P00692_n566TBT02_APPROVAL_DATETIME ;
   private String[] P00692_A567TBT02_APPROVAL_USER_ID ;
   private boolean[] P00692_n567TBT02_APPROVAL_USER_ID ;
   private String[] P00692_A568TBT02_APPROVAL_AUTH_CD ;
   private boolean[] P00692_n568TBT02_APPROVAL_AUTH_CD ;
   private String[] P00692_A569TBT02_INPUT_END_FLG ;
   private boolean[] P00692_n569TBT02_INPUT_END_FLG ;
   private java.util.Date[] P00692_A570TBT02_INPUT_END_DATETIME ;
   private boolean[] P00692_n570TBT02_INPUT_END_DATETIME ;
   private String[] P00692_A571TBT02_INPUT_END_USER_ID ;
   private boolean[] P00692_n571TBT02_INPUT_END_USER_ID ;
   private String[] P00692_A572TBT02_INPUT_END_AUTH_CD ;
   private boolean[] P00692_n572TBT02_INPUT_END_AUTH_CD ;
   private String[] P00693_A328TBT12_DEL_FLG ;
   private boolean[] P00693_n328TBT12_DEL_FLG ;
   private short[] P00693_A317TBT12_CRF_ID ;
   private int[] P00693_A316TBT12_SUBJECT_ID ;
   private long[] P00693_A315TBT12_STUDY_ID ;
   private String[] P00693_A318TBT12_CRF_ITEM_GRP_DIV ;
   private String[] P00693_A319TBT12_CRF_ITEM_GRP_CD ;
   private String[] P00693_A320TBT12_CRF_VALUE ;
   private boolean[] P00693_n320TBT12_CRF_VALUE ;
   private String[] P00694_A514TBM01_SYS_VALUE ;
   private boolean[] P00694_n514TBM01_SYS_VALUE ;
   private String[] P00694_A161TBM01_SYS_ID ;
   private String[] P00695_A17TAM04_AUTH_CD ;
   private byte[] P00695_A601TAM04_AUTH_LVL ;
   private boolean[] P00695_n601TAM04_AUTH_LVL ;
   private String[] P00696_A189TBM21_DEL_FLG ;
   private boolean[] P00696_n189TBM21_DEL_FLG ;
   private long[] P00696_A186TBM21_STUDY_ID ;
   private String[] P00696_A513TBM21_STATUS ;
   private boolean[] P00696_n513TBM21_STATUS ;
   private GxObjectCollection AV15P_B714_SD1_CRF_INFO ;
   private SdtTBT02_CRF AV8BC_TBT02_CRF ;
   private SdtTBT11_CRF_HISTORY AV9BC_TBT11_CRF_HISTORY ;
   private SdtTBT13_CRF_RES_HIS AV10BC_TBT13_CRF_RES_HIS ;
   private SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem AV18W_B714_SD1_CRF_INFO_Item ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT3[] ;
}

final  class b715_pc01_set_auth__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00692", "SELECT `TBT02_DEL_FLG`, `TBT02_CRF_ID`, `TBT02_SUBJECT_ID`, `TBT02_STUDY_ID`, `TBT02_UPD_CNT`, `TBT02_DM_ARRIVAL_DATETIME`, `TBT02_APPROVAL_FLG`, `TBT02_APPROVAL_DATETIME`, `TBT02_APPROVAL_USER_ID`, `TBT02_APPROVAL_AUTH_CD`, `TBT02_INPUT_END_FLG`, `TBT02_INPUT_END_DATETIME`, `TBT02_INPUT_END_USER_ID`, `TBT02_INPUT_END_AUTH_CD` FROM `TBT02_CRF` WHERE (`TBT02_STUDY_ID` = ? and `TBT02_SUBJECT_ID` = ? and `TBT02_CRF_ID` = ?) AND (`TBT02_DEL_FLG` = '0') ORDER BY `TBT02_STUDY_ID`, `TBT02_SUBJECT_ID`, `TBT02_CRF_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P00693", "SELECT `TBT12_DEL_FLG`, `TBT12_CRF_ID`, `TBT12_SUBJECT_ID`, `TBT12_STUDY_ID`, `TBT12_CRF_ITEM_GRP_DIV`, `TBT12_CRF_ITEM_GRP_CD`, `TBT12_CRF_VALUE` FROM `TBT12_CRF_RESULT` WHERE (`TBT12_STUDY_ID` = ? and `TBT12_SUBJECT_ID` = ? and `TBT12_CRF_ID` = ?) AND (`TBT12_DEL_FLG` = '0') ORDER BY `TBT12_STUDY_ID`, `TBT12_SUBJECT_ID`, `TBT12_CRF_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
         ,new ForEachCursor("P00694", "SELECT `TBM01_SYS_VALUE`, `TBM01_SYS_ID` FROM `TBM01_SYSTEM` WHERE `TBM01_SYS_ID` = '021' ORDER BY `TBM01_SYS_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P00695", "SELECT `TAM04_AUTH_CD`, `TAM04_AUTH_LVL` FROM `TAM04_KNGN` WHERE `TAM04_AUTH_CD` = ? ORDER BY `TAM04_AUTH_CD`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P00696", "SELECT `TBM21_DEL_FLG`, `TBM21_STUDY_ID`, `TBM21_STATUS` FROM `TBM21_STUDY` WHERE (`TBM21_STUDY_ID` = ?) AND (`TBM21_DEL_FLG` = '0') ORDER BY `TBM21_STUDY_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDateTime(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
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
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               break;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((byte[]) buf[1])[0] = rslt.getByte(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               break;
            case 4 :
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
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 100);
               }
               break;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
      }
   }

}

