/*
               File: B599_PC15_CRF_RES
        Description: CRFÉeÅ[ÉuÉãéÊìæ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:15.84
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b599_pc15_crf_res extends GXProcedure
{
   public b599_pc15_crf_res( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b599_pc15_crf_res.class ), "" );
   }

   public b599_pc15_crf_res( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( long aP0 ,
                             String aP1 ,
                             String aP2 ,
                             GxObjectCollection[] aP3 ,
                             short[] aP4 )
   {
      b599_pc15_crf_res.this.AV9P_STUDY_ID = aP0;
      b599_pc15_crf_res.this.AV10P_SUBJECT_ID = aP1;
      b599_pc15_crf_res.this.AV8P_CRF_ID = aP2;
      b599_pc15_crf_res.this.AV13W_RTN_CSV = aP3[0];
      b599_pc15_crf_res.this.aP5 = new String[] {""};
      initialize();
      privateExecute();
      return aP5[0];
   }

   public void execute( long aP0 ,
                        String aP1 ,
                        String aP2 ,
                        GxObjectCollection[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( long aP0 ,
                             String aP1 ,
                             String aP2 ,
                             GxObjectCollection[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 )
   {
      b599_pc15_crf_res.this.AV9P_STUDY_ID = aP0;
      b599_pc15_crf_res.this.AV10P_SUBJECT_ID = aP1;
      b599_pc15_crf_res.this.AV8P_CRF_ID = aP2;
      b599_pc15_crf_res.this.AV13W_RTN_CSV = aP3[0];
      this.aP3 = aP3;
      b599_pc15_crf_res.this.aP4 = aP4;
      b599_pc15_crf_res.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV17C_APP_ID = "B599" ;
      AV12W_RTN_CD = (short)(0) ;
      AV14W_RTN_MSG = "" ;
      AV18W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV18W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV17C_APP_ID );
      /* Execute user subroutine: S1181 */
      S1181 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV16W_SUBJECT_ID = (int)(GXutil.lval( AV10P_SUBJECT_ID)) ;
      AV11W_CRF_ID = (short)(GXutil.lval( AV8P_CRF_ID)) ;
      AV23GXLvl34 = (byte)(0) ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV10P_SUBJECT_ID ,
                                           AV8P_CRF_ID ,
                                           new Integer(A293TBT02_SUBJECT_ID) ,
                                           new Integer(AV16W_SUBJECT_ID) ,
                                           new Short(A294TBT02_CRF_ID) ,
                                           new Short(AV11W_CRF_ID) ,
                                           new Long(AV9P_STUDY_ID) ,
                                           new Long(A292TBT02_STUDY_ID) },
                                           new int[] {
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.LONG
                                           }
      });
      Gx_ope = "Fetch" ;
      Gx_etb = "TBT02_CRF" ;
      /* Using cursor P002V2 */
      pr_default.execute(0, new Object[] {new Long(AV9P_STUDY_ID), new Integer(AV16W_SUBJECT_ID), new Short(AV11W_CRF_ID)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A294TBT02_CRF_ID = P002V2_A294TBT02_CRF_ID[0] ;
         A293TBT02_SUBJECT_ID = P002V2_A293TBT02_SUBJECT_ID[0] ;
         A292TBT02_STUDY_ID = P002V2_A292TBT02_STUDY_ID[0] ;
         A302TBT02_UPD_CNT = P002V2_A302TBT02_UPD_CNT[0] ;
         n302TBT02_UPD_CNT = P002V2_n302TBT02_UPD_CNT[0] ;
         A301TBT02_UPD_PROG_NM = P002V2_A301TBT02_UPD_PROG_NM[0] ;
         n301TBT02_UPD_PROG_NM = P002V2_n301TBT02_UPD_PROG_NM[0] ;
         A300TBT02_UPD_USER_ID = P002V2_A300TBT02_UPD_USER_ID[0] ;
         n300TBT02_UPD_USER_ID = P002V2_n300TBT02_UPD_USER_ID[0] ;
         A299TBT02_UPD_DATETIME = P002V2_A299TBT02_UPD_DATETIME[0] ;
         n299TBT02_UPD_DATETIME = P002V2_n299TBT02_UPD_DATETIME[0] ;
         A298TBT02_CRT_PROG_NM = P002V2_A298TBT02_CRT_PROG_NM[0] ;
         n298TBT02_CRT_PROG_NM = P002V2_n298TBT02_CRT_PROG_NM[0] ;
         A297TBT02_CRT_USER_ID = P002V2_A297TBT02_CRT_USER_ID[0] ;
         n297TBT02_CRT_USER_ID = P002V2_n297TBT02_CRT_USER_ID[0] ;
         A296TBT02_CRT_DATETIME = P002V2_A296TBT02_CRT_DATETIME[0] ;
         n296TBT02_CRT_DATETIME = P002V2_n296TBT02_CRT_DATETIME[0] ;
         A295TBT02_DEL_FLG = P002V2_A295TBT02_DEL_FLG[0] ;
         n295TBT02_DEL_FLG = P002V2_n295TBT02_DEL_FLG[0] ;
         A572TBT02_INPUT_END_AUTH_CD = P002V2_A572TBT02_INPUT_END_AUTH_CD[0] ;
         n572TBT02_INPUT_END_AUTH_CD = P002V2_n572TBT02_INPUT_END_AUTH_CD[0] ;
         A571TBT02_INPUT_END_USER_ID = P002V2_A571TBT02_INPUT_END_USER_ID[0] ;
         n571TBT02_INPUT_END_USER_ID = P002V2_n571TBT02_INPUT_END_USER_ID[0] ;
         A570TBT02_INPUT_END_DATETIME = P002V2_A570TBT02_INPUT_END_DATETIME[0] ;
         n570TBT02_INPUT_END_DATETIME = P002V2_n570TBT02_INPUT_END_DATETIME[0] ;
         A569TBT02_INPUT_END_FLG = P002V2_A569TBT02_INPUT_END_FLG[0] ;
         n569TBT02_INPUT_END_FLG = P002V2_n569TBT02_INPUT_END_FLG[0] ;
         A568TBT02_APPROVAL_AUTH_CD = P002V2_A568TBT02_APPROVAL_AUTH_CD[0] ;
         n568TBT02_APPROVAL_AUTH_CD = P002V2_n568TBT02_APPROVAL_AUTH_CD[0] ;
         A567TBT02_APPROVAL_USER_ID = P002V2_A567TBT02_APPROVAL_USER_ID[0] ;
         n567TBT02_APPROVAL_USER_ID = P002V2_n567TBT02_APPROVAL_USER_ID[0] ;
         A566TBT02_APPROVAL_DATETIME = P002V2_A566TBT02_APPROVAL_DATETIME[0] ;
         n566TBT02_APPROVAL_DATETIME = P002V2_n566TBT02_APPROVAL_DATETIME[0] ;
         A565TBT02_APPROVAL_FLG = P002V2_A565TBT02_APPROVAL_FLG[0] ;
         n565TBT02_APPROVAL_FLG = P002V2_n565TBT02_APPROVAL_FLG[0] ;
         A564TBT02_DM_ARRIVAL_DATETIME = P002V2_A564TBT02_DM_ARRIVAL_DATETIME[0] ;
         n564TBT02_DM_ARRIVAL_DATETIME = P002V2_n564TBT02_DM_ARRIVAL_DATETIME[0] ;
         A563TBT02_DM_ARRIVAL_FLG = P002V2_A563TBT02_DM_ARRIVAL_FLG[0] ;
         n563TBT02_DM_ARRIVAL_FLG = P002V2_n563TBT02_DM_ARRIVAL_FLG[0] ;
         A562TBT02_UPLOAD_AUTH_CD = P002V2_A562TBT02_UPLOAD_AUTH_CD[0] ;
         n562TBT02_UPLOAD_AUTH_CD = P002V2_n562TBT02_UPLOAD_AUTH_CD[0] ;
         A561TBT02_UPLOAD_USER_ID = P002V2_A561TBT02_UPLOAD_USER_ID[0] ;
         n561TBT02_UPLOAD_USER_ID = P002V2_n561TBT02_UPLOAD_USER_ID[0] ;
         A560TBT02_UPLOAD_DATETIME = P002V2_A560TBT02_UPLOAD_DATETIME[0] ;
         n560TBT02_UPLOAD_DATETIME = P002V2_n560TBT02_UPLOAD_DATETIME[0] ;
         A559TBT02_LOCK_AUTH_CD = P002V2_A559TBT02_LOCK_AUTH_CD[0] ;
         n559TBT02_LOCK_AUTH_CD = P002V2_n559TBT02_LOCK_AUTH_CD[0] ;
         A558TBT02_LOCK_USER_ID = P002V2_A558TBT02_LOCK_USER_ID[0] ;
         n558TBT02_LOCK_USER_ID = P002V2_n558TBT02_LOCK_USER_ID[0] ;
         A557TBT02_LOCK_DATETIME = P002V2_A557TBT02_LOCK_DATETIME[0] ;
         n557TBT02_LOCK_DATETIME = P002V2_n557TBT02_LOCK_DATETIME[0] ;
         A556TBT02_LOCK_FLG = P002V2_A556TBT02_LOCK_FLG[0] ;
         n556TBT02_LOCK_FLG = P002V2_n556TBT02_LOCK_FLG[0] ;
         A371TBT02_CRF_INPUT_LEVEL = P002V2_A371TBT02_CRF_INPUT_LEVEL[0] ;
         n371TBT02_CRF_INPUT_LEVEL = P002V2_n371TBT02_CRF_INPUT_LEVEL[0] ;
         A370TBT02_CRF_LATEST_VERSION = P002V2_A370TBT02_CRF_LATEST_VERSION[0] ;
         n370TBT02_CRF_LATEST_VERSION = P002V2_n370TBT02_CRF_LATEST_VERSION[0] ;
         AV23GXLvl34 = (byte)(1) ;
         GXt_char1 = AV15W_STR ;
         GXv_char2[0] = GXt_char1 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A556TBT02_LOCK_FLG, GXv_char2) ;
         b599_pc15_crf_res.this.GXt_char1 = GXv_char2[0] ;
         GXt_char3 = AV15W_STR ;
         GXv_char4[0] = GXt_char3 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A557TBT02_LOCK_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char4) ;
         b599_pc15_crf_res.this.GXt_char3 = GXv_char4[0] ;
         GXt_char5 = AV15W_STR ;
         GXv_char6[0] = GXt_char5 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A558TBT02_LOCK_USER_ID, GXv_char6) ;
         b599_pc15_crf_res.this.GXt_char5 = GXv_char6[0] ;
         GXt_char7 = AV15W_STR ;
         GXv_char8[0] = GXt_char7 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A559TBT02_LOCK_AUTH_CD, GXv_char8) ;
         b599_pc15_crf_res.this.GXt_char7 = GXv_char8[0] ;
         GXt_char9 = AV15W_STR ;
         GXv_char10[0] = GXt_char9 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A560TBT02_UPLOAD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char10) ;
         b599_pc15_crf_res.this.GXt_char9 = GXv_char10[0] ;
         GXt_char11 = AV15W_STR ;
         GXv_char12[0] = GXt_char11 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A561TBT02_UPLOAD_USER_ID, GXv_char12) ;
         b599_pc15_crf_res.this.GXt_char11 = GXv_char12[0] ;
         GXt_char13 = AV15W_STR ;
         GXv_char14[0] = GXt_char13 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A562TBT02_UPLOAD_AUTH_CD, GXv_char14) ;
         b599_pc15_crf_res.this.GXt_char13 = GXv_char14[0] ;
         GXt_char15 = AV15W_STR ;
         GXv_char16[0] = GXt_char15 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A563TBT02_DM_ARRIVAL_FLG, GXv_char16) ;
         b599_pc15_crf_res.this.GXt_char15 = GXv_char16[0] ;
         GXt_char17 = AV15W_STR ;
         GXv_char18[0] = GXt_char17 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A564TBT02_DM_ARRIVAL_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char18) ;
         b599_pc15_crf_res.this.GXt_char17 = GXv_char18[0] ;
         GXt_char19 = AV15W_STR ;
         GXv_char20[0] = GXt_char19 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A565TBT02_APPROVAL_FLG, GXv_char20) ;
         b599_pc15_crf_res.this.GXt_char19 = GXv_char20[0] ;
         GXt_char21 = AV15W_STR ;
         GXv_char22[0] = GXt_char21 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A566TBT02_APPROVAL_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char22) ;
         b599_pc15_crf_res.this.GXt_char21 = GXv_char22[0] ;
         GXt_char23 = AV15W_STR ;
         GXv_char24[0] = GXt_char23 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A567TBT02_APPROVAL_USER_ID, GXv_char24) ;
         b599_pc15_crf_res.this.GXt_char23 = GXv_char24[0] ;
         GXt_char25 = AV15W_STR ;
         GXv_char26[0] = GXt_char25 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A568TBT02_APPROVAL_AUTH_CD, GXv_char26) ;
         b599_pc15_crf_res.this.GXt_char25 = GXv_char26[0] ;
         GXt_char27 = AV15W_STR ;
         GXv_char28[0] = GXt_char27 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A569TBT02_INPUT_END_FLG, GXv_char28) ;
         b599_pc15_crf_res.this.GXt_char27 = GXv_char28[0] ;
         GXt_char29 = AV15W_STR ;
         GXv_char30[0] = GXt_char29 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A570TBT02_INPUT_END_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char30) ;
         b599_pc15_crf_res.this.GXt_char29 = GXv_char30[0] ;
         GXt_char31 = AV15W_STR ;
         GXv_char32[0] = GXt_char31 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A571TBT02_INPUT_END_USER_ID, GXv_char32) ;
         b599_pc15_crf_res.this.GXt_char31 = GXv_char32[0] ;
         GXt_char33 = AV15W_STR ;
         GXv_char34[0] = GXt_char33 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A572TBT02_INPUT_END_AUTH_CD, GXv_char34) ;
         b599_pc15_crf_res.this.GXt_char33 = GXv_char34[0] ;
         GXt_char35 = AV15W_STR ;
         GXv_char36[0] = GXt_char35 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A295TBT02_DEL_FLG, GXv_char36) ;
         b599_pc15_crf_res.this.GXt_char35 = GXv_char36[0] ;
         GXt_char37 = AV15W_STR ;
         GXv_char38[0] = GXt_char37 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A296TBT02_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char38) ;
         b599_pc15_crf_res.this.GXt_char37 = GXv_char38[0] ;
         GXt_char39 = AV15W_STR ;
         GXv_char40[0] = GXt_char39 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A297TBT02_CRT_USER_ID, GXv_char40) ;
         b599_pc15_crf_res.this.GXt_char39 = GXv_char40[0] ;
         GXt_char41 = AV15W_STR ;
         GXv_char42[0] = GXt_char41 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A298TBT02_CRT_PROG_NM, GXv_char42) ;
         b599_pc15_crf_res.this.GXt_char41 = GXv_char42[0] ;
         GXt_char43 = AV15W_STR ;
         GXv_char44[0] = GXt_char43 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A299TBT02_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char44) ;
         b599_pc15_crf_res.this.GXt_char43 = GXv_char44[0] ;
         GXt_char45 = AV15W_STR ;
         GXv_char46[0] = GXt_char45 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A300TBT02_UPD_USER_ID, GXv_char46) ;
         b599_pc15_crf_res.this.GXt_char45 = GXv_char46[0] ;
         GXt_char47 = AV15W_STR ;
         GXv_char48[0] = GXt_char47 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A301TBT02_UPD_PROG_NM, GXv_char48) ;
         b599_pc15_crf_res.this.GXt_char47 = GXv_char48[0] ;
         AV15W_STR = GXutil.trim( GXutil.str( A292TBT02_STUDY_ID, 10, 0)) + "," + GXutil.trim( GXutil.str( A293TBT02_SUBJECT_ID, 10, 0)) + "," + GXutil.trim( GXutil.str( A294TBT02_CRF_ID, 10, 0)) + "," + GXutil.trim( GXutil.str( A370TBT02_CRF_LATEST_VERSION, 10, 0)) + "," + GXutil.trim( GXutil.str( A371TBT02_CRF_INPUT_LEVEL, 10, 0)) + "," + GXt_char1 + "," + GXt_char3 + "," + GXt_char5 + "," + GXt_char7 + "," + GXt_char9 + "," + GXt_char11 + "," + GXt_char13 + "," + GXt_char15 + "," + GXt_char17 + "," + GXt_char19 + "," + GXt_char21 + "," + GXt_char23 + "," + GXt_char25 + "," + GXt_char27 + "," + GXt_char29 + "," + GXt_char31 + "," + GXt_char33 + "," + GXt_char35 + "," + GXt_char37 + "," + GXt_char39 + "," + GXt_char41 + "," + GXt_char43 + "," + GXt_char45 + "," + GXt_char47 + "," + GXutil.trim( GXutil.str( A302TBT02_UPD_CNT, 10, 0)) ;
         AV13W_RTN_CSV.add(AV15W_STR, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV23GXLvl34 == 0 )
      {
         AV12W_RTN_CD = (short)(1) ;
         GXt_char47 = AV14W_RTN_MSG ;
         GXv_char48[0] = GXt_char47 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char48) ;
         b599_pc15_crf_res.this.GXt_char47 = GXv_char48[0] ;
         AV14W_RTN_MSG = GXt_char47 ;
      }
      cleanup();
   }

   public void S1181( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      AV18W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      AV19W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV19W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_STUDY_ID" );
      AV19W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( GXutil.trim( GXutil.str( AV9P_STUDY_ID, 10, 0)) );
      AV18W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV19W_PARMS_ITEM, 0);
      AV19W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV19W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_SUBJECT_ID" );
      AV19W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV10P_SUBJECT_ID );
      AV18W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV19W_PARMS_ITEM, 0);
      AV19W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV19W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_CRF_ID" );
      AV19W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV8P_CRF_ID );
      AV18W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV19W_PARMS_ITEM, 0);
      AV20W_MSG = "SUB_INIT" ;
      GXv_SdtB808_SD01_EXTRA_INFO49[0] = AV18W_EXTRA_INFO;
      GXv_int50[0] = AV12W_RTN_CD ;
      GXv_char48[0] = AV14W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV24Pgmname, (short)(1), AV20W_MSG, GXv_SdtB808_SD01_EXTRA_INFO49, GXv_int50, GXv_char48) ;
      AV18W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO49[0] ;
      b599_pc15_crf_res.this.AV12W_RTN_CD = GXv_int50[0] ;
      b599_pc15_crf_res.this.AV14W_RTN_MSG = GXv_char48[0] ;
   }

   public void S12109( )
   {
      /* 'SUB_ERROR' Routine */
      AV20W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO49[0] = AV18W_EXTRA_INFO;
      GXv_int50[0] = AV12W_RTN_CD ;
      GXv_char48[0] = AV14W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV24Pgmname, (short)(0), AV20W_MSG, GXv_SdtB808_SD01_EXTRA_INFO49, GXv_int50, GXv_char48) ;
      AV18W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO49[0] ;
      b599_pc15_crf_res.this.AV12W_RTN_CD = GXv_int50[0] ;
      b599_pc15_crf_res.this.AV14W_RTN_MSG = GXv_char48[0] ;
      context.globals.Gx_eop = (byte)(0) ;
   }

   protected void cleanup( )
   {
      this.aP3[0] = b599_pc15_crf_res.this.AV13W_RTN_CSV;
      this.aP4[0] = b599_pc15_crf_res.this.AV12W_RTN_CD;
      this.aP5[0] = b599_pc15_crf_res.this.AV14W_RTN_MSG;
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
                  /* Execute user subroutine: S12109 */
                  S12109 ();
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
      AV14W_RTN_MSG = "" ;
      AV17C_APP_ID = "" ;
      AV18W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      scmdbuf = "" ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      P002V2_A294TBT02_CRF_ID = new short[1] ;
      P002V2_A293TBT02_SUBJECT_ID = new int[1] ;
      P002V2_A292TBT02_STUDY_ID = new long[1] ;
      P002V2_A302TBT02_UPD_CNT = new long[1] ;
      P002V2_n302TBT02_UPD_CNT = new boolean[] {false} ;
      P002V2_A301TBT02_UPD_PROG_NM = new String[] {""} ;
      P002V2_n301TBT02_UPD_PROG_NM = new boolean[] {false} ;
      P002V2_A300TBT02_UPD_USER_ID = new String[] {""} ;
      P002V2_n300TBT02_UPD_USER_ID = new boolean[] {false} ;
      P002V2_A299TBT02_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P002V2_n299TBT02_UPD_DATETIME = new boolean[] {false} ;
      P002V2_A298TBT02_CRT_PROG_NM = new String[] {""} ;
      P002V2_n298TBT02_CRT_PROG_NM = new boolean[] {false} ;
      P002V2_A297TBT02_CRT_USER_ID = new String[] {""} ;
      P002V2_n297TBT02_CRT_USER_ID = new boolean[] {false} ;
      P002V2_A296TBT02_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P002V2_n296TBT02_CRT_DATETIME = new boolean[] {false} ;
      P002V2_A295TBT02_DEL_FLG = new String[] {""} ;
      P002V2_n295TBT02_DEL_FLG = new boolean[] {false} ;
      P002V2_A572TBT02_INPUT_END_AUTH_CD = new String[] {""} ;
      P002V2_n572TBT02_INPUT_END_AUTH_CD = new boolean[] {false} ;
      P002V2_A571TBT02_INPUT_END_USER_ID = new String[] {""} ;
      P002V2_n571TBT02_INPUT_END_USER_ID = new boolean[] {false} ;
      P002V2_A570TBT02_INPUT_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P002V2_n570TBT02_INPUT_END_DATETIME = new boolean[] {false} ;
      P002V2_A569TBT02_INPUT_END_FLG = new String[] {""} ;
      P002V2_n569TBT02_INPUT_END_FLG = new boolean[] {false} ;
      P002V2_A568TBT02_APPROVAL_AUTH_CD = new String[] {""} ;
      P002V2_n568TBT02_APPROVAL_AUTH_CD = new boolean[] {false} ;
      P002V2_A567TBT02_APPROVAL_USER_ID = new String[] {""} ;
      P002V2_n567TBT02_APPROVAL_USER_ID = new boolean[] {false} ;
      P002V2_A566TBT02_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P002V2_n566TBT02_APPROVAL_DATETIME = new boolean[] {false} ;
      P002V2_A565TBT02_APPROVAL_FLG = new String[] {""} ;
      P002V2_n565TBT02_APPROVAL_FLG = new boolean[] {false} ;
      P002V2_A564TBT02_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P002V2_n564TBT02_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      P002V2_A563TBT02_DM_ARRIVAL_FLG = new String[] {""} ;
      P002V2_n563TBT02_DM_ARRIVAL_FLG = new boolean[] {false} ;
      P002V2_A562TBT02_UPLOAD_AUTH_CD = new String[] {""} ;
      P002V2_n562TBT02_UPLOAD_AUTH_CD = new boolean[] {false} ;
      P002V2_A561TBT02_UPLOAD_USER_ID = new String[] {""} ;
      P002V2_n561TBT02_UPLOAD_USER_ID = new boolean[] {false} ;
      P002V2_A560TBT02_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P002V2_n560TBT02_UPLOAD_DATETIME = new boolean[] {false} ;
      P002V2_A559TBT02_LOCK_AUTH_CD = new String[] {""} ;
      P002V2_n559TBT02_LOCK_AUTH_CD = new boolean[] {false} ;
      P002V2_A558TBT02_LOCK_USER_ID = new String[] {""} ;
      P002V2_n558TBT02_LOCK_USER_ID = new boolean[] {false} ;
      P002V2_A557TBT02_LOCK_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P002V2_n557TBT02_LOCK_DATETIME = new boolean[] {false} ;
      P002V2_A556TBT02_LOCK_FLG = new String[] {""} ;
      P002V2_n556TBT02_LOCK_FLG = new boolean[] {false} ;
      P002V2_A371TBT02_CRF_INPUT_LEVEL = new byte[1] ;
      P002V2_n371TBT02_CRF_INPUT_LEVEL = new boolean[] {false} ;
      P002V2_A370TBT02_CRF_LATEST_VERSION = new short[1] ;
      P002V2_n370TBT02_CRF_LATEST_VERSION = new boolean[] {false} ;
      A301TBT02_UPD_PROG_NM = "" ;
      A300TBT02_UPD_USER_ID = "" ;
      A299TBT02_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A298TBT02_CRT_PROG_NM = "" ;
      A297TBT02_CRT_USER_ID = "" ;
      A296TBT02_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A295TBT02_DEL_FLG = "" ;
      A572TBT02_INPUT_END_AUTH_CD = "" ;
      A571TBT02_INPUT_END_USER_ID = "" ;
      A570TBT02_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A569TBT02_INPUT_END_FLG = "" ;
      A568TBT02_APPROVAL_AUTH_CD = "" ;
      A567TBT02_APPROVAL_USER_ID = "" ;
      A566TBT02_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A565TBT02_APPROVAL_FLG = "" ;
      A564TBT02_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A563TBT02_DM_ARRIVAL_FLG = "" ;
      A562TBT02_UPLOAD_AUTH_CD = "" ;
      A561TBT02_UPLOAD_USER_ID = "" ;
      A560TBT02_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A559TBT02_LOCK_AUTH_CD = "" ;
      A558TBT02_LOCK_USER_ID = "" ;
      A557TBT02_LOCK_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A556TBT02_LOCK_FLG = "" ;
      AV15W_STR = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      GXt_char3 = "" ;
      GXv_char4 = new String [1] ;
      GXt_char5 = "" ;
      GXv_char6 = new String [1] ;
      GXt_char7 = "" ;
      GXv_char8 = new String [1] ;
      GXt_char9 = "" ;
      GXv_char10 = new String [1] ;
      GXt_char11 = "" ;
      GXv_char12 = new String [1] ;
      GXt_char13 = "" ;
      GXv_char14 = new String [1] ;
      GXt_char15 = "" ;
      GXv_char16 = new String [1] ;
      GXt_char17 = "" ;
      GXv_char18 = new String [1] ;
      GXt_char19 = "" ;
      GXv_char20 = new String [1] ;
      GXt_char21 = "" ;
      GXv_char22 = new String [1] ;
      GXt_char23 = "" ;
      GXv_char24 = new String [1] ;
      GXt_char25 = "" ;
      GXv_char26 = new String [1] ;
      GXt_char27 = "" ;
      GXv_char28 = new String [1] ;
      GXt_char29 = "" ;
      GXv_char30 = new String [1] ;
      GXt_char31 = "" ;
      GXv_char32 = new String [1] ;
      GXt_char33 = "" ;
      GXv_char34 = new String [1] ;
      GXt_char35 = "" ;
      GXv_char36 = new String [1] ;
      GXt_char37 = "" ;
      GXv_char38 = new String [1] ;
      GXt_char39 = "" ;
      GXv_char40 = new String [1] ;
      GXt_char41 = "" ;
      GXv_char42 = new String [1] ;
      GXt_char43 = "" ;
      GXv_char44 = new String [1] ;
      GXt_char45 = "" ;
      GXv_char46 = new String [1] ;
      GXt_char47 = "" ;
      AV19W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV20W_MSG = "" ;
      AV24Pgmname = "" ;
      GXv_SdtB808_SD01_EXTRA_INFO49 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int50 = new short [1] ;
      GXv_char48 = new String [1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b599_pc15_crf_res__default(),
         new Object[] {
             new Object[] {
            P002V2_A294TBT02_CRF_ID, P002V2_A293TBT02_SUBJECT_ID, P002V2_A292TBT02_STUDY_ID, P002V2_A302TBT02_UPD_CNT, P002V2_n302TBT02_UPD_CNT, P002V2_A301TBT02_UPD_PROG_NM, P002V2_n301TBT02_UPD_PROG_NM, P002V2_A300TBT02_UPD_USER_ID, P002V2_n300TBT02_UPD_USER_ID, P002V2_A299TBT02_UPD_DATETIME,
            P002V2_n299TBT02_UPD_DATETIME, P002V2_A298TBT02_CRT_PROG_NM, P002V2_n298TBT02_CRT_PROG_NM, P002V2_A297TBT02_CRT_USER_ID, P002V2_n297TBT02_CRT_USER_ID, P002V2_A296TBT02_CRT_DATETIME, P002V2_n296TBT02_CRT_DATETIME, P002V2_A295TBT02_DEL_FLG, P002V2_n295TBT02_DEL_FLG, P002V2_A572TBT02_INPUT_END_AUTH_CD,
            P002V2_n572TBT02_INPUT_END_AUTH_CD, P002V2_A571TBT02_INPUT_END_USER_ID, P002V2_n571TBT02_INPUT_END_USER_ID, P002V2_A570TBT02_INPUT_END_DATETIME, P002V2_n570TBT02_INPUT_END_DATETIME, P002V2_A569TBT02_INPUT_END_FLG, P002V2_n569TBT02_INPUT_END_FLG, P002V2_A568TBT02_APPROVAL_AUTH_CD, P002V2_n568TBT02_APPROVAL_AUTH_CD, P002V2_A567TBT02_APPROVAL_USER_ID,
            P002V2_n567TBT02_APPROVAL_USER_ID, P002V2_A566TBT02_APPROVAL_DATETIME, P002V2_n566TBT02_APPROVAL_DATETIME, P002V2_A565TBT02_APPROVAL_FLG, P002V2_n565TBT02_APPROVAL_FLG, P002V2_A564TBT02_DM_ARRIVAL_DATETIME, P002V2_n564TBT02_DM_ARRIVAL_DATETIME, P002V2_A563TBT02_DM_ARRIVAL_FLG, P002V2_n563TBT02_DM_ARRIVAL_FLG, P002V2_A562TBT02_UPLOAD_AUTH_CD,
            P002V2_n562TBT02_UPLOAD_AUTH_CD, P002V2_A561TBT02_UPLOAD_USER_ID, P002V2_n561TBT02_UPLOAD_USER_ID, P002V2_A560TBT02_UPLOAD_DATETIME, P002V2_n560TBT02_UPLOAD_DATETIME, P002V2_A559TBT02_LOCK_AUTH_CD, P002V2_n559TBT02_LOCK_AUTH_CD, P002V2_A558TBT02_LOCK_USER_ID, P002V2_n558TBT02_LOCK_USER_ID, P002V2_A557TBT02_LOCK_DATETIME,
            P002V2_n557TBT02_LOCK_DATETIME, P002V2_A556TBT02_LOCK_FLG, P002V2_n556TBT02_LOCK_FLG, P002V2_A371TBT02_CRF_INPUT_LEVEL, P002V2_n371TBT02_CRF_INPUT_LEVEL, P002V2_A370TBT02_CRF_LATEST_VERSION, P002V2_n370TBT02_CRF_LATEST_VERSION
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV24Pgmname = "B599_PC15_CRF_RES" ;
      /* GeneXus formulas. */
      AV24Pgmname = "B599_PC15_CRF_RES" ;
      Gx_err = (short)(0) ;
   }

   private byte AV23GXLvl34 ;
   private byte A371TBT02_CRF_INPUT_LEVEL ;
   private short AV12W_RTN_CD ;
   private short AV11W_CRF_ID ;
   private short A294TBT02_CRF_ID ;
   private short A370TBT02_CRF_LATEST_VERSION ;
   private short GXv_int50[] ;
   private short Gx_err ;
   private int AV16W_SUBJECT_ID ;
   private int A293TBT02_SUBJECT_ID ;
   private int GXActiveErrHndl ;
   private long AV9P_STUDY_ID ;
   private long A292TBT02_STUDY_ID ;
   private long A302TBT02_UPD_CNT ;
   private String scmdbuf ;
   private String Gx_ope ;
   private String Gx_etb ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String GXt_char5 ;
   private String GXv_char6[] ;
   private String GXt_char7 ;
   private String GXv_char8[] ;
   private String GXt_char9 ;
   private String GXv_char10[] ;
   private String GXt_char11 ;
   private String GXv_char12[] ;
   private String GXt_char13 ;
   private String GXv_char14[] ;
   private String GXt_char15 ;
   private String GXv_char16[] ;
   private String GXt_char17 ;
   private String GXv_char18[] ;
   private String GXt_char19 ;
   private String GXv_char20[] ;
   private String GXt_char21 ;
   private String GXv_char22[] ;
   private String GXt_char23 ;
   private String GXv_char24[] ;
   private String GXt_char25 ;
   private String GXv_char26[] ;
   private String GXt_char27 ;
   private String GXv_char28[] ;
   private String GXt_char29 ;
   private String GXv_char30[] ;
   private String GXt_char31 ;
   private String GXv_char32[] ;
   private String GXt_char33 ;
   private String GXv_char34[] ;
   private String GXt_char35 ;
   private String GXv_char36[] ;
   private String GXt_char37 ;
   private String GXv_char38[] ;
   private String GXt_char39 ;
   private String GXv_char40[] ;
   private String GXt_char41 ;
   private String GXv_char42[] ;
   private String GXt_char43 ;
   private String GXv_char44[] ;
   private String GXt_char45 ;
   private String GXv_char46[] ;
   private String GXt_char47 ;
   private String AV24Pgmname ;
   private String GXv_char48[] ;
   private String Gx_emsg ;
   private java.util.Date A299TBT02_UPD_DATETIME ;
   private java.util.Date A296TBT02_CRT_DATETIME ;
   private java.util.Date A570TBT02_INPUT_END_DATETIME ;
   private java.util.Date A566TBT02_APPROVAL_DATETIME ;
   private java.util.Date A564TBT02_DM_ARRIVAL_DATETIME ;
   private java.util.Date A560TBT02_UPLOAD_DATETIME ;
   private java.util.Date A557TBT02_LOCK_DATETIME ;
   private boolean returnInSub ;
   private boolean n302TBT02_UPD_CNT ;
   private boolean n301TBT02_UPD_PROG_NM ;
   private boolean n300TBT02_UPD_USER_ID ;
   private boolean n299TBT02_UPD_DATETIME ;
   private boolean n298TBT02_CRT_PROG_NM ;
   private boolean n297TBT02_CRT_USER_ID ;
   private boolean n296TBT02_CRT_DATETIME ;
   private boolean n295TBT02_DEL_FLG ;
   private boolean n572TBT02_INPUT_END_AUTH_CD ;
   private boolean n571TBT02_INPUT_END_USER_ID ;
   private boolean n570TBT02_INPUT_END_DATETIME ;
   private boolean n569TBT02_INPUT_END_FLG ;
   private boolean n568TBT02_APPROVAL_AUTH_CD ;
   private boolean n567TBT02_APPROVAL_USER_ID ;
   private boolean n566TBT02_APPROVAL_DATETIME ;
   private boolean n565TBT02_APPROVAL_FLG ;
   private boolean n564TBT02_DM_ARRIVAL_DATETIME ;
   private boolean n563TBT02_DM_ARRIVAL_FLG ;
   private boolean n562TBT02_UPLOAD_AUTH_CD ;
   private boolean n561TBT02_UPLOAD_USER_ID ;
   private boolean n560TBT02_UPLOAD_DATETIME ;
   private boolean n559TBT02_LOCK_AUTH_CD ;
   private boolean n558TBT02_LOCK_USER_ID ;
   private boolean n557TBT02_LOCK_DATETIME ;
   private boolean n556TBT02_LOCK_FLG ;
   private boolean n371TBT02_CRF_INPUT_LEVEL ;
   private boolean n370TBT02_CRF_LATEST_VERSION ;
   private String AV10P_SUBJECT_ID ;
   private String AV8P_CRF_ID ;
   private String AV14W_RTN_MSG ;
   private String AV17C_APP_ID ;
   private String A301TBT02_UPD_PROG_NM ;
   private String A300TBT02_UPD_USER_ID ;
   private String A298TBT02_CRT_PROG_NM ;
   private String A297TBT02_CRT_USER_ID ;
   private String A295TBT02_DEL_FLG ;
   private String A572TBT02_INPUT_END_AUTH_CD ;
   private String A571TBT02_INPUT_END_USER_ID ;
   private String A569TBT02_INPUT_END_FLG ;
   private String A568TBT02_APPROVAL_AUTH_CD ;
   private String A567TBT02_APPROVAL_USER_ID ;
   private String A565TBT02_APPROVAL_FLG ;
   private String A563TBT02_DM_ARRIVAL_FLG ;
   private String A562TBT02_UPLOAD_AUTH_CD ;
   private String A561TBT02_UPLOAD_USER_ID ;
   private String A559TBT02_LOCK_AUTH_CD ;
   private String A558TBT02_LOCK_USER_ID ;
   private String A556TBT02_LOCK_FLG ;
   private String AV15W_STR ;
   private String AV20W_MSG ;
   private GxObjectCollection[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private short[] P002V2_A294TBT02_CRF_ID ;
   private int[] P002V2_A293TBT02_SUBJECT_ID ;
   private long[] P002V2_A292TBT02_STUDY_ID ;
   private long[] P002V2_A302TBT02_UPD_CNT ;
   private boolean[] P002V2_n302TBT02_UPD_CNT ;
   private String[] P002V2_A301TBT02_UPD_PROG_NM ;
   private boolean[] P002V2_n301TBT02_UPD_PROG_NM ;
   private String[] P002V2_A300TBT02_UPD_USER_ID ;
   private boolean[] P002V2_n300TBT02_UPD_USER_ID ;
   private java.util.Date[] P002V2_A299TBT02_UPD_DATETIME ;
   private boolean[] P002V2_n299TBT02_UPD_DATETIME ;
   private String[] P002V2_A298TBT02_CRT_PROG_NM ;
   private boolean[] P002V2_n298TBT02_CRT_PROG_NM ;
   private String[] P002V2_A297TBT02_CRT_USER_ID ;
   private boolean[] P002V2_n297TBT02_CRT_USER_ID ;
   private java.util.Date[] P002V2_A296TBT02_CRT_DATETIME ;
   private boolean[] P002V2_n296TBT02_CRT_DATETIME ;
   private String[] P002V2_A295TBT02_DEL_FLG ;
   private boolean[] P002V2_n295TBT02_DEL_FLG ;
   private String[] P002V2_A572TBT02_INPUT_END_AUTH_CD ;
   private boolean[] P002V2_n572TBT02_INPUT_END_AUTH_CD ;
   private String[] P002V2_A571TBT02_INPUT_END_USER_ID ;
   private boolean[] P002V2_n571TBT02_INPUT_END_USER_ID ;
   private java.util.Date[] P002V2_A570TBT02_INPUT_END_DATETIME ;
   private boolean[] P002V2_n570TBT02_INPUT_END_DATETIME ;
   private String[] P002V2_A569TBT02_INPUT_END_FLG ;
   private boolean[] P002V2_n569TBT02_INPUT_END_FLG ;
   private String[] P002V2_A568TBT02_APPROVAL_AUTH_CD ;
   private boolean[] P002V2_n568TBT02_APPROVAL_AUTH_CD ;
   private String[] P002V2_A567TBT02_APPROVAL_USER_ID ;
   private boolean[] P002V2_n567TBT02_APPROVAL_USER_ID ;
   private java.util.Date[] P002V2_A566TBT02_APPROVAL_DATETIME ;
   private boolean[] P002V2_n566TBT02_APPROVAL_DATETIME ;
   private String[] P002V2_A565TBT02_APPROVAL_FLG ;
   private boolean[] P002V2_n565TBT02_APPROVAL_FLG ;
   private java.util.Date[] P002V2_A564TBT02_DM_ARRIVAL_DATETIME ;
   private boolean[] P002V2_n564TBT02_DM_ARRIVAL_DATETIME ;
   private String[] P002V2_A563TBT02_DM_ARRIVAL_FLG ;
   private boolean[] P002V2_n563TBT02_DM_ARRIVAL_FLG ;
   private String[] P002V2_A562TBT02_UPLOAD_AUTH_CD ;
   private boolean[] P002V2_n562TBT02_UPLOAD_AUTH_CD ;
   private String[] P002V2_A561TBT02_UPLOAD_USER_ID ;
   private boolean[] P002V2_n561TBT02_UPLOAD_USER_ID ;
   private java.util.Date[] P002V2_A560TBT02_UPLOAD_DATETIME ;
   private boolean[] P002V2_n560TBT02_UPLOAD_DATETIME ;
   private String[] P002V2_A559TBT02_LOCK_AUTH_CD ;
   private boolean[] P002V2_n559TBT02_LOCK_AUTH_CD ;
   private String[] P002V2_A558TBT02_LOCK_USER_ID ;
   private boolean[] P002V2_n558TBT02_LOCK_USER_ID ;
   private java.util.Date[] P002V2_A557TBT02_LOCK_DATETIME ;
   private boolean[] P002V2_n557TBT02_LOCK_DATETIME ;
   private String[] P002V2_A556TBT02_LOCK_FLG ;
   private boolean[] P002V2_n556TBT02_LOCK_FLG ;
   private byte[] P002V2_A371TBT02_CRF_INPUT_LEVEL ;
   private boolean[] P002V2_n371TBT02_CRF_INPUT_LEVEL ;
   private short[] P002V2_A370TBT02_CRF_LATEST_VERSION ;
   private boolean[] P002V2_n370TBT02_CRF_LATEST_VERSION ;
   private GxObjectCollection AV13W_RTN_CSV ;
   private SdtB808_SD01_EXTRA_INFO AV18W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO49[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV19W_PARMS_ITEM ;
}

final  class b599_pc15_crf_res__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P002V2( com.genexus.internet.HttpContext httpContext ,
                                          String AV10P_SUBJECT_ID ,
                                          String AV8P_CRF_ID ,
                                          int A293TBT02_SUBJECT_ID ,
                                          int AV16W_SUBJECT_ID ,
                                          short A294TBT02_CRF_ID ,
                                          short AV11W_CRF_ID ,
                                          long AV9P_STUDY_ID ,
                                          long A292TBT02_STUDY_ID )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int51 ;
      GXv_int51 = new byte [3] ;
      Object[] GXv_Object52 ;
      GXv_Object52 = new Object [2] ;
      Gx_ope = "Declare" ;
      Gx_etb = "TBT02_CRF" ;
      scmdbuf = "SELECT `TBT02_CRF_ID`, `TBT02_SUBJECT_ID`, `TBT02_STUDY_ID`, `TBT02_UPD_CNT`, `TBT02_UPD_PROG_NM`," ;
      scmdbuf = scmdbuf + " `TBT02_UPD_USER_ID`, `TBT02_UPD_DATETIME`, `TBT02_CRT_PROG_NM`, `TBT02_CRT_USER_ID`," ;
      scmdbuf = scmdbuf + " `TBT02_CRT_DATETIME`, `TBT02_DEL_FLG`, `TBT02_INPUT_END_AUTH_CD`, `TBT02_INPUT_END_USER_ID`," ;
      scmdbuf = scmdbuf + " `TBT02_INPUT_END_DATETIME`, `TBT02_INPUT_END_FLG`, `TBT02_APPROVAL_AUTH_CD`, `TBT02_APPROVAL_USER_ID`," ;
      scmdbuf = scmdbuf + " `TBT02_APPROVAL_DATETIME`, `TBT02_APPROVAL_FLG`, `TBT02_DM_ARRIVAL_DATETIME`, `TBT02_DM_ARRIVAL_FLG`," ;
      scmdbuf = scmdbuf + " `TBT02_UPLOAD_AUTH_CD`, `TBT02_UPLOAD_USER_ID`, `TBT02_UPLOAD_DATETIME`, `TBT02_LOCK_AUTH_CD`," ;
      scmdbuf = scmdbuf + " `TBT02_LOCK_USER_ID`, `TBT02_LOCK_DATETIME`, `TBT02_LOCK_FLG`, `TBT02_CRF_INPUT_LEVEL`," ;
      scmdbuf = scmdbuf + " `TBT02_CRF_LATEST_VERSION` FROM `TBT02_CRF`" ;
      scmdbuf = scmdbuf + " WHERE (`TBT02_STUDY_ID` = ?)" ;
      if ( ! (GXutil.strcmp("", AV10P_SUBJECT_ID)==0) )
      {
         sWhereString = sWhereString + " and (`TBT02_SUBJECT_ID` = ?)" ;
      }
      else
      {
         GXv_int51[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV8P_CRF_ID)==0) )
      {
         sWhereString = sWhereString + " and (`TBT02_CRF_ID` = ?)" ;
      }
      else
      {
         GXv_int51[2] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TBT02_STUDY_ID`, `TBT02_SUBJECT_ID`, `TBT02_CRF_ID`" ;
      GXv_Object52[0] = scmdbuf ;
      GXv_Object52[1] = GXv_int51 ;
      return GXv_Object52 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         com.genexus.internet.HttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_P002V2(httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).shortValue() , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).longValue() , ((Number) dynConstraints[7]).longValue() );
      }
      return super.getDynamicStatement(cursor, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P002V2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDateTime(14) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[31])[0] = rslt.getGXDateTime(18) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[35])[0] = rslt.getGXDateTime(20) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[43])[0] = rslt.getGXDateTime(24) ;
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[49])[0] = rslt.getGXDateTime(27) ;
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getVarchar(28) ;
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((byte[]) buf[53])[0] = rslt.getByte(29) ;
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((short[]) buf[55])[0] = rslt.getShort(30) ;
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               break;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx ;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[3]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[4]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[5]).shortValue());
               }
               break;
      }
   }

}

