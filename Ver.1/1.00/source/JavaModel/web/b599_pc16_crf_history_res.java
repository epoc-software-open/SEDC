/*
               File: B599_PC16_CRF_HISTORY_RES
        Description: CRFèCê≥óöóÉeÅ[ÉuÉãéÊìæ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:16.28
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b599_pc16_crf_history_res extends GXProcedure
{
   public b599_pc16_crf_history_res( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b599_pc16_crf_history_res.class ), "" );
   }

   public b599_pc16_crf_history_res( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( long aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String aP3 ,
                             GxObjectCollection[] aP4 ,
                             short[] aP5 )
   {
      b599_pc16_crf_history_res.this.AV10P_STUDY_ID = aP0;
      b599_pc16_crf_history_res.this.AV11P_SUBJECT_ID = aP1;
      b599_pc16_crf_history_res.this.AV8P_CRF_ID = aP2;
      b599_pc16_crf_history_res.this.AV9P_CRF_VERSION = aP3;
      b599_pc16_crf_history_res.this.AV15W_RTN_CSV = aP4[0];
      b599_pc16_crf_history_res.this.aP6 = new String[] {""};
      initialize();
      privateExecute();
      return aP6[0];
   }

   public void execute( long aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String aP3 ,
                        GxObjectCollection[] aP4 ,
                        short[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( long aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String aP3 ,
                             GxObjectCollection[] aP4 ,
                             short[] aP5 ,
                             String[] aP6 )
   {
      b599_pc16_crf_history_res.this.AV10P_STUDY_ID = aP0;
      b599_pc16_crf_history_res.this.AV11P_SUBJECT_ID = aP1;
      b599_pc16_crf_history_res.this.AV8P_CRF_ID = aP2;
      b599_pc16_crf_history_res.this.AV9P_CRF_VERSION = aP3;
      b599_pc16_crf_history_res.this.AV15W_RTN_CSV = aP4[0];
      this.aP4 = aP4;
      b599_pc16_crf_history_res.this.aP5 = aP5;
      b599_pc16_crf_history_res.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV19C_APP_ID = "B599" ;
      AV14W_RTN_CD = (short)(0) ;
      AV16W_RTN_MSG = "" ;
      AV20W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV20W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV19C_APP_ID );
      /* Execute user subroutine: S1179 */
      S1179 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV18W_SUBJECT_ID = (int)(GXutil.lval( AV11P_SUBJECT_ID)) ;
      AV12W_CRF_ID = (short)(GXutil.lval( AV8P_CRF_ID)) ;
      AV13W_CRF_VERSION = (short)(GXutil.lval( AV9P_CRF_VERSION)) ;
      AV25GXLvl35 = (byte)(0) ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV11P_SUBJECT_ID ,
                                           AV8P_CRF_ID ,
                                           AV9P_CRF_VERSION ,
                                           new Integer(A304TBT11_SUBJECT_ID) ,
                                           new Integer(AV18W_SUBJECT_ID) ,
                                           new Short(A305TBT11_CRF_ID) ,
                                           new Short(AV12W_CRF_ID) ,
                                           new Short(A306TBT11_CRF_VERSION) ,
                                           new Short(AV13W_CRF_VERSION) ,
                                           new Long(AV10P_STUDY_ID) ,
                                           new Long(A303TBT11_STUDY_ID) },
                                           new int[] {
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.LONG,
                                           TypeConstants.LONG
                                           }
      });
      Gx_ope = "Fetch" ;
      Gx_etb = "TBT11_CRF_HISTORY" ;
      /* Using cursor P002W2 */
      pr_default.execute(0, new Object[] {new Long(AV10P_STUDY_ID), new Integer(AV18W_SUBJECT_ID), new Short(AV12W_CRF_ID), new Short(AV13W_CRF_VERSION)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A306TBT11_CRF_VERSION = P002W2_A306TBT11_CRF_VERSION[0] ;
         A305TBT11_CRF_ID = P002W2_A305TBT11_CRF_ID[0] ;
         A304TBT11_SUBJECT_ID = P002W2_A304TBT11_SUBJECT_ID[0] ;
         A303TBT11_STUDY_ID = P002W2_A303TBT11_STUDY_ID[0] ;
         A314TBT11_UPD_CNT = P002W2_A314TBT11_UPD_CNT[0] ;
         n314TBT11_UPD_CNT = P002W2_n314TBT11_UPD_CNT[0] ;
         A313TBT11_UPD_PROG_NM = P002W2_A313TBT11_UPD_PROG_NM[0] ;
         n313TBT11_UPD_PROG_NM = P002W2_n313TBT11_UPD_PROG_NM[0] ;
         A312TBT11_UPD_USER_ID = P002W2_A312TBT11_UPD_USER_ID[0] ;
         n312TBT11_UPD_USER_ID = P002W2_n312TBT11_UPD_USER_ID[0] ;
         A311TBT11_UPD_DATETIME = P002W2_A311TBT11_UPD_DATETIME[0] ;
         n311TBT11_UPD_DATETIME = P002W2_n311TBT11_UPD_DATETIME[0] ;
         A310TBT11_CRT_PROG_NM = P002W2_A310TBT11_CRT_PROG_NM[0] ;
         n310TBT11_CRT_PROG_NM = P002W2_n310TBT11_CRT_PROG_NM[0] ;
         A309TBT11_CRT_USER_ID = P002W2_A309TBT11_CRT_USER_ID[0] ;
         n309TBT11_CRT_USER_ID = P002W2_n309TBT11_CRT_USER_ID[0] ;
         A308TBT11_CRT_DATETIME = P002W2_A308TBT11_CRT_DATETIME[0] ;
         n308TBT11_CRT_DATETIME = P002W2_n308TBT11_CRT_DATETIME[0] ;
         A307TBT11_DEL_FLG = P002W2_A307TBT11_DEL_FLG[0] ;
         n307TBT11_DEL_FLG = P002W2_n307TBT11_DEL_FLG[0] ;
         A586TBT11_INPUT_END_AUTH_CD = P002W2_A586TBT11_INPUT_END_AUTH_CD[0] ;
         n586TBT11_INPUT_END_AUTH_CD = P002W2_n586TBT11_INPUT_END_AUTH_CD[0] ;
         A585TBT11_INPUT_END_USER_ID = P002W2_A585TBT11_INPUT_END_USER_ID[0] ;
         n585TBT11_INPUT_END_USER_ID = P002W2_n585TBT11_INPUT_END_USER_ID[0] ;
         A584TBT11_INPUT_END_DATETIME = P002W2_A584TBT11_INPUT_END_DATETIME[0] ;
         n584TBT11_INPUT_END_DATETIME = P002W2_n584TBT11_INPUT_END_DATETIME[0] ;
         A583TBT11_INPUT_END_FLG = P002W2_A583TBT11_INPUT_END_FLG[0] ;
         n583TBT11_INPUT_END_FLG = P002W2_n583TBT11_INPUT_END_FLG[0] ;
         A582TBT11_APPROVAL_AUTH_CD = P002W2_A582TBT11_APPROVAL_AUTH_CD[0] ;
         n582TBT11_APPROVAL_AUTH_CD = P002W2_n582TBT11_APPROVAL_AUTH_CD[0] ;
         A581TBT11_APPROVAL_USER_ID = P002W2_A581TBT11_APPROVAL_USER_ID[0] ;
         n581TBT11_APPROVAL_USER_ID = P002W2_n581TBT11_APPROVAL_USER_ID[0] ;
         A580TBT11_APPROVAL_DATETIME = P002W2_A580TBT11_APPROVAL_DATETIME[0] ;
         n580TBT11_APPROVAL_DATETIME = P002W2_n580TBT11_APPROVAL_DATETIME[0] ;
         A579TBT11_APPROVAL_FLG = P002W2_A579TBT11_APPROVAL_FLG[0] ;
         n579TBT11_APPROVAL_FLG = P002W2_n579TBT11_APPROVAL_FLG[0] ;
         A578TBT11_DM_ARRIVAL_DATETIME = P002W2_A578TBT11_DM_ARRIVAL_DATETIME[0] ;
         n578TBT11_DM_ARRIVAL_DATETIME = P002W2_n578TBT11_DM_ARRIVAL_DATETIME[0] ;
         A577TBT11_DM_ARRIVAL_FLG = P002W2_A577TBT11_DM_ARRIVAL_FLG[0] ;
         n577TBT11_DM_ARRIVAL_FLG = P002W2_n577TBT11_DM_ARRIVAL_FLG[0] ;
         A576TBT11_UPLOAD_AUTH_CD = P002W2_A576TBT11_UPLOAD_AUTH_CD[0] ;
         n576TBT11_UPLOAD_AUTH_CD = P002W2_n576TBT11_UPLOAD_AUTH_CD[0] ;
         A575TBT11_UPLOAD_USER_ID = P002W2_A575TBT11_UPLOAD_USER_ID[0] ;
         n575TBT11_UPLOAD_USER_ID = P002W2_n575TBT11_UPLOAD_USER_ID[0] ;
         A574TBT11_UPLOAD_DATETIME = P002W2_A574TBT11_UPLOAD_DATETIME[0] ;
         n574TBT11_UPLOAD_DATETIME = P002W2_n574TBT11_UPLOAD_DATETIME[0] ;
         A573TBT11_CRF_INPUT_LEVEL = P002W2_A573TBT11_CRF_INPUT_LEVEL[0] ;
         n573TBT11_CRF_INPUT_LEVEL = P002W2_n573TBT11_CRF_INPUT_LEVEL[0] ;
         AV25GXLvl35 = (byte)(1) ;
         GXt_char1 = AV17W_STR ;
         GXv_char2[0] = GXt_char1 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A574TBT11_UPLOAD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
         b599_pc16_crf_history_res.this.GXt_char1 = GXv_char2[0] ;
         GXt_char3 = AV17W_STR ;
         GXv_char4[0] = GXt_char3 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A575TBT11_UPLOAD_USER_ID, GXv_char4) ;
         b599_pc16_crf_history_res.this.GXt_char3 = GXv_char4[0] ;
         GXt_char5 = AV17W_STR ;
         GXv_char6[0] = GXt_char5 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A576TBT11_UPLOAD_AUTH_CD, GXv_char6) ;
         b599_pc16_crf_history_res.this.GXt_char5 = GXv_char6[0] ;
         GXt_char7 = AV17W_STR ;
         GXv_char8[0] = GXt_char7 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A577TBT11_DM_ARRIVAL_FLG, GXv_char8) ;
         b599_pc16_crf_history_res.this.GXt_char7 = GXv_char8[0] ;
         GXt_char9 = AV17W_STR ;
         GXv_char10[0] = GXt_char9 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A578TBT11_DM_ARRIVAL_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char10) ;
         b599_pc16_crf_history_res.this.GXt_char9 = GXv_char10[0] ;
         GXt_char11 = AV17W_STR ;
         GXv_char12[0] = GXt_char11 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A579TBT11_APPROVAL_FLG, GXv_char12) ;
         b599_pc16_crf_history_res.this.GXt_char11 = GXv_char12[0] ;
         GXt_char13 = AV17W_STR ;
         GXv_char14[0] = GXt_char13 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A580TBT11_APPROVAL_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char14) ;
         b599_pc16_crf_history_res.this.GXt_char13 = GXv_char14[0] ;
         GXt_char15 = AV17W_STR ;
         GXv_char16[0] = GXt_char15 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A581TBT11_APPROVAL_USER_ID, GXv_char16) ;
         b599_pc16_crf_history_res.this.GXt_char15 = GXv_char16[0] ;
         GXt_char17 = AV17W_STR ;
         GXv_char18[0] = GXt_char17 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A582TBT11_APPROVAL_AUTH_CD, GXv_char18) ;
         b599_pc16_crf_history_res.this.GXt_char17 = GXv_char18[0] ;
         GXt_char19 = AV17W_STR ;
         GXv_char20[0] = GXt_char19 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A583TBT11_INPUT_END_FLG, GXv_char20) ;
         b599_pc16_crf_history_res.this.GXt_char19 = GXv_char20[0] ;
         GXt_char21 = AV17W_STR ;
         GXv_char22[0] = GXt_char21 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A584TBT11_INPUT_END_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char22) ;
         b599_pc16_crf_history_res.this.GXt_char21 = GXv_char22[0] ;
         GXt_char23 = AV17W_STR ;
         GXv_char24[0] = GXt_char23 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A585TBT11_INPUT_END_USER_ID, GXv_char24) ;
         b599_pc16_crf_history_res.this.GXt_char23 = GXv_char24[0] ;
         GXt_char25 = AV17W_STR ;
         GXv_char26[0] = GXt_char25 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A586TBT11_INPUT_END_AUTH_CD, GXv_char26) ;
         b599_pc16_crf_history_res.this.GXt_char25 = GXv_char26[0] ;
         GXt_char27 = AV17W_STR ;
         GXv_char28[0] = GXt_char27 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A307TBT11_DEL_FLG, GXv_char28) ;
         b599_pc16_crf_history_res.this.GXt_char27 = GXv_char28[0] ;
         GXt_char29 = AV17W_STR ;
         GXv_char30[0] = GXt_char29 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A308TBT11_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char30) ;
         b599_pc16_crf_history_res.this.GXt_char29 = GXv_char30[0] ;
         GXt_char31 = AV17W_STR ;
         GXv_char32[0] = GXt_char31 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A309TBT11_CRT_USER_ID, GXv_char32) ;
         b599_pc16_crf_history_res.this.GXt_char31 = GXv_char32[0] ;
         GXt_char33 = AV17W_STR ;
         GXv_char34[0] = GXt_char33 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A310TBT11_CRT_PROG_NM, GXv_char34) ;
         b599_pc16_crf_history_res.this.GXt_char33 = GXv_char34[0] ;
         GXt_char35 = AV17W_STR ;
         GXv_char36[0] = GXt_char35 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A311TBT11_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char36) ;
         b599_pc16_crf_history_res.this.GXt_char35 = GXv_char36[0] ;
         GXt_char37 = AV17W_STR ;
         GXv_char38[0] = GXt_char37 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A312TBT11_UPD_USER_ID, GXv_char38) ;
         b599_pc16_crf_history_res.this.GXt_char37 = GXv_char38[0] ;
         GXt_char39 = AV17W_STR ;
         GXv_char40[0] = GXt_char39 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A313TBT11_UPD_PROG_NM, GXv_char40) ;
         b599_pc16_crf_history_res.this.GXt_char39 = GXv_char40[0] ;
         AV17W_STR = GXutil.trim( GXutil.str( A303TBT11_STUDY_ID, 10, 0)) + "," + GXutil.trim( GXutil.str( A304TBT11_SUBJECT_ID, 10, 0)) + "," + GXutil.trim( GXutil.str( A305TBT11_CRF_ID, 10, 0)) + "," + GXutil.trim( GXutil.str( A306TBT11_CRF_VERSION, 10, 0)) + "," + GXutil.trim( GXutil.str( A573TBT11_CRF_INPUT_LEVEL, 10, 0)) + "," + GXt_char1 + "," + GXt_char3 + "," + GXt_char5 + "," + GXt_char7 + "," + GXt_char9 + "," + GXt_char11 + "," + GXt_char13 + "," + GXt_char15 + "," + GXt_char17 + "," + GXt_char19 + "," + GXt_char21 + "," + GXt_char23 + "," + GXt_char25 + "," + GXt_char27 + "," + GXt_char29 + "," + GXt_char31 + "," + GXt_char33 + "," + GXt_char35 + "," + GXt_char37 + "," + GXt_char39 + "," + GXutil.trim( GXutil.str( A314TBT11_UPD_CNT, 10, 0)) ;
         AV15W_RTN_CSV.add(AV17W_STR, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV25GXLvl35 == 0 )
      {
         AV14W_RTN_CD = (short)(1) ;
         GXt_char39 = AV16W_RTN_MSG ;
         GXv_char40[0] = GXt_char39 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char40) ;
         b599_pc16_crf_history_res.this.GXt_char39 = GXv_char40[0] ;
         AV16W_RTN_MSG = GXt_char39 ;
      }
      cleanup();
   }

   public void S1179( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      AV20W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      AV21W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV21W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_STUDY_ID" );
      AV21W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( GXutil.trim( GXutil.str( AV10P_STUDY_ID, 10, 0)) );
      AV20W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV21W_PARMS_ITEM, 0);
      AV21W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV21W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_SUBJECT_ID" );
      AV21W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV11P_SUBJECT_ID );
      AV20W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV21W_PARMS_ITEM, 0);
      AV21W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV21W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_CRF_ID" );
      AV21W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV8P_CRF_ID );
      AV20W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV21W_PARMS_ITEM, 0);
      AV21W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV21W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_CRF_VERSION" );
      AV21W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV9P_CRF_VERSION );
      AV20W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV21W_PARMS_ITEM, 0);
      AV22W_MSG = "SUB_INIT" ;
      GXv_SdtB808_SD01_EXTRA_INFO41[0] = AV20W_EXTRA_INFO;
      GXv_int42[0] = AV14W_RTN_CD ;
      GXv_char40[0] = AV16W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV26Pgmname, (short)(1), AV22W_MSG, GXv_SdtB808_SD01_EXTRA_INFO41, GXv_int42, GXv_char40) ;
      AV20W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO41[0] ;
      b599_pc16_crf_history_res.this.AV14W_RTN_CD = GXv_int42[0] ;
      b599_pc16_crf_history_res.this.AV16W_RTN_MSG = GXv_char40[0] ;
   }

   public void S12111( )
   {
      /* 'SUB_ERROR' Routine */
      AV22W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO41[0] = AV20W_EXTRA_INFO;
      GXv_int42[0] = AV14W_RTN_CD ;
      GXv_char40[0] = AV16W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV26Pgmname, (short)(0), AV22W_MSG, GXv_SdtB808_SD01_EXTRA_INFO41, GXv_int42, GXv_char40) ;
      AV20W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO41[0] ;
      b599_pc16_crf_history_res.this.AV14W_RTN_CD = GXv_int42[0] ;
      b599_pc16_crf_history_res.this.AV16W_RTN_MSG = GXv_char40[0] ;
      context.globals.Gx_eop = (byte)(0) ;
   }

   protected void cleanup( )
   {
      this.aP4[0] = b599_pc16_crf_history_res.this.AV15W_RTN_CSV;
      this.aP5[0] = b599_pc16_crf_history_res.this.AV14W_RTN_CD;
      this.aP6[0] = b599_pc16_crf_history_res.this.AV16W_RTN_MSG;
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
                  /* Execute user subroutine: S12111 */
                  S12111 ();
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
      AV16W_RTN_MSG = "" ;
      AV19C_APP_ID = "" ;
      AV20W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      scmdbuf = "" ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      P002W2_A306TBT11_CRF_VERSION = new short[1] ;
      P002W2_A305TBT11_CRF_ID = new short[1] ;
      P002W2_A304TBT11_SUBJECT_ID = new int[1] ;
      P002W2_A303TBT11_STUDY_ID = new long[1] ;
      P002W2_A314TBT11_UPD_CNT = new long[1] ;
      P002W2_n314TBT11_UPD_CNT = new boolean[] {false} ;
      P002W2_A313TBT11_UPD_PROG_NM = new String[] {""} ;
      P002W2_n313TBT11_UPD_PROG_NM = new boolean[] {false} ;
      P002W2_A312TBT11_UPD_USER_ID = new String[] {""} ;
      P002W2_n312TBT11_UPD_USER_ID = new boolean[] {false} ;
      P002W2_A311TBT11_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P002W2_n311TBT11_UPD_DATETIME = new boolean[] {false} ;
      P002W2_A310TBT11_CRT_PROG_NM = new String[] {""} ;
      P002W2_n310TBT11_CRT_PROG_NM = new boolean[] {false} ;
      P002W2_A309TBT11_CRT_USER_ID = new String[] {""} ;
      P002W2_n309TBT11_CRT_USER_ID = new boolean[] {false} ;
      P002W2_A308TBT11_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P002W2_n308TBT11_CRT_DATETIME = new boolean[] {false} ;
      P002W2_A307TBT11_DEL_FLG = new String[] {""} ;
      P002W2_n307TBT11_DEL_FLG = new boolean[] {false} ;
      P002W2_A586TBT11_INPUT_END_AUTH_CD = new String[] {""} ;
      P002W2_n586TBT11_INPUT_END_AUTH_CD = new boolean[] {false} ;
      P002W2_A585TBT11_INPUT_END_USER_ID = new String[] {""} ;
      P002W2_n585TBT11_INPUT_END_USER_ID = new boolean[] {false} ;
      P002W2_A584TBT11_INPUT_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P002W2_n584TBT11_INPUT_END_DATETIME = new boolean[] {false} ;
      P002W2_A583TBT11_INPUT_END_FLG = new String[] {""} ;
      P002W2_n583TBT11_INPUT_END_FLG = new boolean[] {false} ;
      P002W2_A582TBT11_APPROVAL_AUTH_CD = new String[] {""} ;
      P002W2_n582TBT11_APPROVAL_AUTH_CD = new boolean[] {false} ;
      P002W2_A581TBT11_APPROVAL_USER_ID = new String[] {""} ;
      P002W2_n581TBT11_APPROVAL_USER_ID = new boolean[] {false} ;
      P002W2_A580TBT11_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P002W2_n580TBT11_APPROVAL_DATETIME = new boolean[] {false} ;
      P002W2_A579TBT11_APPROVAL_FLG = new String[] {""} ;
      P002W2_n579TBT11_APPROVAL_FLG = new boolean[] {false} ;
      P002W2_A578TBT11_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P002W2_n578TBT11_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      P002W2_A577TBT11_DM_ARRIVAL_FLG = new String[] {""} ;
      P002W2_n577TBT11_DM_ARRIVAL_FLG = new boolean[] {false} ;
      P002W2_A576TBT11_UPLOAD_AUTH_CD = new String[] {""} ;
      P002W2_n576TBT11_UPLOAD_AUTH_CD = new boolean[] {false} ;
      P002W2_A575TBT11_UPLOAD_USER_ID = new String[] {""} ;
      P002W2_n575TBT11_UPLOAD_USER_ID = new boolean[] {false} ;
      P002W2_A574TBT11_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P002W2_n574TBT11_UPLOAD_DATETIME = new boolean[] {false} ;
      P002W2_A573TBT11_CRF_INPUT_LEVEL = new byte[1] ;
      P002W2_n573TBT11_CRF_INPUT_LEVEL = new boolean[] {false} ;
      A313TBT11_UPD_PROG_NM = "" ;
      A312TBT11_UPD_USER_ID = "" ;
      A311TBT11_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A310TBT11_CRT_PROG_NM = "" ;
      A309TBT11_CRT_USER_ID = "" ;
      A308TBT11_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A307TBT11_DEL_FLG = "" ;
      A586TBT11_INPUT_END_AUTH_CD = "" ;
      A585TBT11_INPUT_END_USER_ID = "" ;
      A584TBT11_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A583TBT11_INPUT_END_FLG = "" ;
      A582TBT11_APPROVAL_AUTH_CD = "" ;
      A581TBT11_APPROVAL_USER_ID = "" ;
      A580TBT11_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A579TBT11_APPROVAL_FLG = "" ;
      A578TBT11_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A577TBT11_DM_ARRIVAL_FLG = "" ;
      A576TBT11_UPLOAD_AUTH_CD = "" ;
      A575TBT11_UPLOAD_USER_ID = "" ;
      A574TBT11_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      AV17W_STR = "" ;
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
      AV21W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV22W_MSG = "" ;
      AV26Pgmname = "" ;
      GXv_SdtB808_SD01_EXTRA_INFO41 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int42 = new short [1] ;
      GXv_char40 = new String [1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b599_pc16_crf_history_res__default(),
         new Object[] {
             new Object[] {
            P002W2_A306TBT11_CRF_VERSION, P002W2_A305TBT11_CRF_ID, P002W2_A304TBT11_SUBJECT_ID, P002W2_A303TBT11_STUDY_ID, P002W2_A314TBT11_UPD_CNT, P002W2_n314TBT11_UPD_CNT, P002W2_A313TBT11_UPD_PROG_NM, P002W2_n313TBT11_UPD_PROG_NM, P002W2_A312TBT11_UPD_USER_ID, P002W2_n312TBT11_UPD_USER_ID,
            P002W2_A311TBT11_UPD_DATETIME, P002W2_n311TBT11_UPD_DATETIME, P002W2_A310TBT11_CRT_PROG_NM, P002W2_n310TBT11_CRT_PROG_NM, P002W2_A309TBT11_CRT_USER_ID, P002W2_n309TBT11_CRT_USER_ID, P002W2_A308TBT11_CRT_DATETIME, P002W2_n308TBT11_CRT_DATETIME, P002W2_A307TBT11_DEL_FLG, P002W2_n307TBT11_DEL_FLG,
            P002W2_A586TBT11_INPUT_END_AUTH_CD, P002W2_n586TBT11_INPUT_END_AUTH_CD, P002W2_A585TBT11_INPUT_END_USER_ID, P002W2_n585TBT11_INPUT_END_USER_ID, P002W2_A584TBT11_INPUT_END_DATETIME, P002W2_n584TBT11_INPUT_END_DATETIME, P002W2_A583TBT11_INPUT_END_FLG, P002W2_n583TBT11_INPUT_END_FLG, P002W2_A582TBT11_APPROVAL_AUTH_CD, P002W2_n582TBT11_APPROVAL_AUTH_CD,
            P002W2_A581TBT11_APPROVAL_USER_ID, P002W2_n581TBT11_APPROVAL_USER_ID, P002W2_A580TBT11_APPROVAL_DATETIME, P002W2_n580TBT11_APPROVAL_DATETIME, P002W2_A579TBT11_APPROVAL_FLG, P002W2_n579TBT11_APPROVAL_FLG, P002W2_A578TBT11_DM_ARRIVAL_DATETIME, P002W2_n578TBT11_DM_ARRIVAL_DATETIME, P002W2_A577TBT11_DM_ARRIVAL_FLG, P002W2_n577TBT11_DM_ARRIVAL_FLG,
            P002W2_A576TBT11_UPLOAD_AUTH_CD, P002W2_n576TBT11_UPLOAD_AUTH_CD, P002W2_A575TBT11_UPLOAD_USER_ID, P002W2_n575TBT11_UPLOAD_USER_ID, P002W2_A574TBT11_UPLOAD_DATETIME, P002W2_n574TBT11_UPLOAD_DATETIME, P002W2_A573TBT11_CRF_INPUT_LEVEL, P002W2_n573TBT11_CRF_INPUT_LEVEL
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV26Pgmname = "B599_PC16_CRF_HISTORY_RES" ;
      /* GeneXus formulas. */
      AV26Pgmname = "B599_PC16_CRF_HISTORY_RES" ;
      Gx_err = (short)(0) ;
   }

   private byte AV25GXLvl35 ;
   private byte A573TBT11_CRF_INPUT_LEVEL ;
   private short AV14W_RTN_CD ;
   private short AV12W_CRF_ID ;
   private short AV13W_CRF_VERSION ;
   private short A305TBT11_CRF_ID ;
   private short A306TBT11_CRF_VERSION ;
   private short GXv_int42[] ;
   private short Gx_err ;
   private int AV18W_SUBJECT_ID ;
   private int A304TBT11_SUBJECT_ID ;
   private int GXActiveErrHndl ;
   private long AV10P_STUDY_ID ;
   private long A303TBT11_STUDY_ID ;
   private long A314TBT11_UPD_CNT ;
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
   private String AV26Pgmname ;
   private String GXv_char40[] ;
   private String Gx_emsg ;
   private java.util.Date A311TBT11_UPD_DATETIME ;
   private java.util.Date A308TBT11_CRT_DATETIME ;
   private java.util.Date A584TBT11_INPUT_END_DATETIME ;
   private java.util.Date A580TBT11_APPROVAL_DATETIME ;
   private java.util.Date A578TBT11_DM_ARRIVAL_DATETIME ;
   private java.util.Date A574TBT11_UPLOAD_DATETIME ;
   private boolean returnInSub ;
   private boolean n314TBT11_UPD_CNT ;
   private boolean n313TBT11_UPD_PROG_NM ;
   private boolean n312TBT11_UPD_USER_ID ;
   private boolean n311TBT11_UPD_DATETIME ;
   private boolean n310TBT11_CRT_PROG_NM ;
   private boolean n309TBT11_CRT_USER_ID ;
   private boolean n308TBT11_CRT_DATETIME ;
   private boolean n307TBT11_DEL_FLG ;
   private boolean n586TBT11_INPUT_END_AUTH_CD ;
   private boolean n585TBT11_INPUT_END_USER_ID ;
   private boolean n584TBT11_INPUT_END_DATETIME ;
   private boolean n583TBT11_INPUT_END_FLG ;
   private boolean n582TBT11_APPROVAL_AUTH_CD ;
   private boolean n581TBT11_APPROVAL_USER_ID ;
   private boolean n580TBT11_APPROVAL_DATETIME ;
   private boolean n579TBT11_APPROVAL_FLG ;
   private boolean n578TBT11_DM_ARRIVAL_DATETIME ;
   private boolean n577TBT11_DM_ARRIVAL_FLG ;
   private boolean n576TBT11_UPLOAD_AUTH_CD ;
   private boolean n575TBT11_UPLOAD_USER_ID ;
   private boolean n574TBT11_UPLOAD_DATETIME ;
   private boolean n573TBT11_CRF_INPUT_LEVEL ;
   private String AV11P_SUBJECT_ID ;
   private String AV8P_CRF_ID ;
   private String AV9P_CRF_VERSION ;
   private String AV16W_RTN_MSG ;
   private String AV19C_APP_ID ;
   private String A313TBT11_UPD_PROG_NM ;
   private String A312TBT11_UPD_USER_ID ;
   private String A310TBT11_CRT_PROG_NM ;
   private String A309TBT11_CRT_USER_ID ;
   private String A307TBT11_DEL_FLG ;
   private String A586TBT11_INPUT_END_AUTH_CD ;
   private String A585TBT11_INPUT_END_USER_ID ;
   private String A583TBT11_INPUT_END_FLG ;
   private String A582TBT11_APPROVAL_AUTH_CD ;
   private String A581TBT11_APPROVAL_USER_ID ;
   private String A579TBT11_APPROVAL_FLG ;
   private String A577TBT11_DM_ARRIVAL_FLG ;
   private String A576TBT11_UPLOAD_AUTH_CD ;
   private String A575TBT11_UPLOAD_USER_ID ;
   private String AV17W_STR ;
   private String AV22W_MSG ;
   private GxObjectCollection[] aP4 ;
   private short[] aP5 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private short[] P002W2_A306TBT11_CRF_VERSION ;
   private short[] P002W2_A305TBT11_CRF_ID ;
   private int[] P002W2_A304TBT11_SUBJECT_ID ;
   private long[] P002W2_A303TBT11_STUDY_ID ;
   private long[] P002W2_A314TBT11_UPD_CNT ;
   private boolean[] P002W2_n314TBT11_UPD_CNT ;
   private String[] P002W2_A313TBT11_UPD_PROG_NM ;
   private boolean[] P002W2_n313TBT11_UPD_PROG_NM ;
   private String[] P002W2_A312TBT11_UPD_USER_ID ;
   private boolean[] P002W2_n312TBT11_UPD_USER_ID ;
   private java.util.Date[] P002W2_A311TBT11_UPD_DATETIME ;
   private boolean[] P002W2_n311TBT11_UPD_DATETIME ;
   private String[] P002W2_A310TBT11_CRT_PROG_NM ;
   private boolean[] P002W2_n310TBT11_CRT_PROG_NM ;
   private String[] P002W2_A309TBT11_CRT_USER_ID ;
   private boolean[] P002W2_n309TBT11_CRT_USER_ID ;
   private java.util.Date[] P002W2_A308TBT11_CRT_DATETIME ;
   private boolean[] P002W2_n308TBT11_CRT_DATETIME ;
   private String[] P002W2_A307TBT11_DEL_FLG ;
   private boolean[] P002W2_n307TBT11_DEL_FLG ;
   private String[] P002W2_A586TBT11_INPUT_END_AUTH_CD ;
   private boolean[] P002W2_n586TBT11_INPUT_END_AUTH_CD ;
   private String[] P002W2_A585TBT11_INPUT_END_USER_ID ;
   private boolean[] P002W2_n585TBT11_INPUT_END_USER_ID ;
   private java.util.Date[] P002W2_A584TBT11_INPUT_END_DATETIME ;
   private boolean[] P002W2_n584TBT11_INPUT_END_DATETIME ;
   private String[] P002W2_A583TBT11_INPUT_END_FLG ;
   private boolean[] P002W2_n583TBT11_INPUT_END_FLG ;
   private String[] P002W2_A582TBT11_APPROVAL_AUTH_CD ;
   private boolean[] P002W2_n582TBT11_APPROVAL_AUTH_CD ;
   private String[] P002W2_A581TBT11_APPROVAL_USER_ID ;
   private boolean[] P002W2_n581TBT11_APPROVAL_USER_ID ;
   private java.util.Date[] P002W2_A580TBT11_APPROVAL_DATETIME ;
   private boolean[] P002W2_n580TBT11_APPROVAL_DATETIME ;
   private String[] P002W2_A579TBT11_APPROVAL_FLG ;
   private boolean[] P002W2_n579TBT11_APPROVAL_FLG ;
   private java.util.Date[] P002W2_A578TBT11_DM_ARRIVAL_DATETIME ;
   private boolean[] P002W2_n578TBT11_DM_ARRIVAL_DATETIME ;
   private String[] P002W2_A577TBT11_DM_ARRIVAL_FLG ;
   private boolean[] P002W2_n577TBT11_DM_ARRIVAL_FLG ;
   private String[] P002W2_A576TBT11_UPLOAD_AUTH_CD ;
   private boolean[] P002W2_n576TBT11_UPLOAD_AUTH_CD ;
   private String[] P002W2_A575TBT11_UPLOAD_USER_ID ;
   private boolean[] P002W2_n575TBT11_UPLOAD_USER_ID ;
   private java.util.Date[] P002W2_A574TBT11_UPLOAD_DATETIME ;
   private boolean[] P002W2_n574TBT11_UPLOAD_DATETIME ;
   private byte[] P002W2_A573TBT11_CRF_INPUT_LEVEL ;
   private boolean[] P002W2_n573TBT11_CRF_INPUT_LEVEL ;
   private GxObjectCollection AV15W_RTN_CSV ;
   private SdtB808_SD01_EXTRA_INFO AV20W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO41[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV21W_PARMS_ITEM ;
}

final  class b599_pc16_crf_history_res__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P002W2( com.genexus.internet.HttpContext httpContext ,
                                          String AV11P_SUBJECT_ID ,
                                          String AV8P_CRF_ID ,
                                          String AV9P_CRF_VERSION ,
                                          int A304TBT11_SUBJECT_ID ,
                                          int AV18W_SUBJECT_ID ,
                                          short A305TBT11_CRF_ID ,
                                          short AV12W_CRF_ID ,
                                          short A306TBT11_CRF_VERSION ,
                                          short AV13W_CRF_VERSION ,
                                          long AV10P_STUDY_ID ,
                                          long A303TBT11_STUDY_ID )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int43 ;
      GXv_int43 = new byte [4] ;
      Object[] GXv_Object44 ;
      GXv_Object44 = new Object [2] ;
      Gx_ope = "Declare" ;
      Gx_etb = "TBT11_CRF_HISTORY" ;
      scmdbuf = "SELECT `TBT11_CRF_VERSION`, `TBT11_CRF_ID`, `TBT11_SUBJECT_ID`, `TBT11_STUDY_ID`," ;
      scmdbuf = scmdbuf + " `TBT11_UPD_CNT`, `TBT11_UPD_PROG_NM`, `TBT11_UPD_USER_ID`, `TBT11_UPD_DATETIME`," ;
      scmdbuf = scmdbuf + " `TBT11_CRT_PROG_NM`, `TBT11_CRT_USER_ID`, `TBT11_CRT_DATETIME`, `TBT11_DEL_FLG`," ;
      scmdbuf = scmdbuf + " `TBT11_INPUT_END_AUTH_CD`, `TBT11_INPUT_END_USER_ID`, `TBT11_INPUT_END_DATETIME`," ;
      scmdbuf = scmdbuf + " `TBT11_INPUT_END_FLG`, `TBT11_APPROVAL_AUTH_CD`, `TBT11_APPROVAL_USER_ID`, `TBT11_APPROVAL_DATETIME`," ;
      scmdbuf = scmdbuf + " `TBT11_APPROVAL_FLG`, `TBT11_DM_ARRIVAL_DATETIME`, `TBT11_DM_ARRIVAL_FLG`, `TBT11_UPLOAD_AUTH_CD`," ;
      scmdbuf = scmdbuf + " `TBT11_UPLOAD_USER_ID`, `TBT11_UPLOAD_DATETIME`, `TBT11_CRF_INPUT_LEVEL` FROM `TBT11_CRF_HISTORY`" ;
      scmdbuf = scmdbuf + " WHERE (`TBT11_STUDY_ID` = ?)" ;
      if ( ! (GXutil.strcmp("", AV11P_SUBJECT_ID)==0) )
      {
         sWhereString = sWhereString + " and (`TBT11_SUBJECT_ID` = ?)" ;
      }
      else
      {
         GXv_int43[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV8P_CRF_ID)==0) )
      {
         sWhereString = sWhereString + " and (`TBT11_CRF_ID` = ?)" ;
      }
      else
      {
         GXv_int43[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV9P_CRF_VERSION)==0) )
      {
         sWhereString = sWhereString + " and (`TBT11_CRF_VERSION` = ?)" ;
      }
      else
      {
         GXv_int43[3] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TBT11_STUDY_ID`, `TBT11_SUBJECT_ID`, `TBT11_CRF_ID`, `TBT11_CRF_VERSION`" ;
      GXv_Object44[0] = scmdbuf ;
      GXv_Object44[1] = GXv_int43 ;
      return GXv_Object44 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         com.genexus.internet.HttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_P002W2(httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).longValue() , ((Number) dynConstraints[10]).longValue() );
      }
      return super.getDynamicStatement(cursor, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P002W2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((int[]) buf[2])[0] = rslt.getInt(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((long[]) buf[4])[0] = rslt.getLong(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(8) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDateTime(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDateTime(15) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[32])[0] = rslt.getGXDateTime(19) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[36])[0] = rslt.getGXDateTime(21) ;
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[44])[0] = rslt.getGXDateTime(25) ;
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((byte[]) buf[46])[0] = rslt.getByte(26) ;
               ((boolean[]) buf[47])[0] = rslt.wasNull();
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
                  stmt.setLong(sIdx, ((Number) parms[4]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[5]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[6]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[7]).shortValue());
               }
               break;
      }
   }

}

