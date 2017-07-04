/*
               File: B599_PC16_CRF_HISTORY_RES
        Description: CRFèCê≥óöóÉeÅ[ÉuÉãéÊìæ
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:12:56.15
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
      this.aP4 = aP4;
      b599_pc16_crf_history_res.this.aP5 = aP5;
      b599_pc16_crf_history_res.this.aP6 = aP6;
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
      /* Execute user subroutine: S111 */
      S111 ();
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
                                           new Integer(A93TBT11_SUBJECT_ID) ,
                                           new Integer(AV18W_SUBJECT_ID) ,
                                           new Short(A94TBT11_CRF_ID) ,
                                           new Short(AV12W_CRF_ID) ,
                                           new Short(A95TBT11_CRF_VERSION) ,
                                           new Short(AV13W_CRF_VERSION) ,
                                           new Long(AV10P_STUDY_ID) ,
                                           new Long(A92TBT11_STUDY_ID) },
                                           new int[] {
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.LONG,
                                           TypeConstants.LONG
                                           }
      });
      Gx_ope = "Fetch" ;
      Gx_etb = "TBT11_CRF_HISTORY" ;
      /* Using cursor P002T2 */
      pr_default.execute(0, new Object[] {new Long(AV10P_STUDY_ID), new Integer(AV18W_SUBJECT_ID), new Short(AV12W_CRF_ID), new Short(AV13W_CRF_VERSION)});
      if ( Gx_err != 0 )
      {
         AV25GXLvl35 = (byte)(1) ;
      }
      while ( (pr_default.getStatus(0) != 101) )
      {
         A92TBT11_STUDY_ID = P002T2_A92TBT11_STUDY_ID[0] ;
         A95TBT11_CRF_VERSION = P002T2_A95TBT11_CRF_VERSION[0] ;
         A94TBT11_CRF_ID = P002T2_A94TBT11_CRF_ID[0] ;
         A93TBT11_SUBJECT_ID = P002T2_A93TBT11_SUBJECT_ID[0] ;
         A464TBT11_UPD_CNT = P002T2_A464TBT11_UPD_CNT[0] ;
         n464TBT11_UPD_CNT = P002T2_n464TBT11_UPD_CNT[0] ;
         A463TBT11_UPD_PROG_NM = P002T2_A463TBT11_UPD_PROG_NM[0] ;
         n463TBT11_UPD_PROG_NM = P002T2_n463TBT11_UPD_PROG_NM[0] ;
         A462TBT11_UPD_USER_ID = P002T2_A462TBT11_UPD_USER_ID[0] ;
         n462TBT11_UPD_USER_ID = P002T2_n462TBT11_UPD_USER_ID[0] ;
         A461TBT11_UPD_DATETIME = P002T2_A461TBT11_UPD_DATETIME[0] ;
         n461TBT11_UPD_DATETIME = P002T2_n461TBT11_UPD_DATETIME[0] ;
         A460TBT11_CRT_PROG_NM = P002T2_A460TBT11_CRT_PROG_NM[0] ;
         n460TBT11_CRT_PROG_NM = P002T2_n460TBT11_CRT_PROG_NM[0] ;
         A459TBT11_CRT_USER_ID = P002T2_A459TBT11_CRT_USER_ID[0] ;
         n459TBT11_CRT_USER_ID = P002T2_n459TBT11_CRT_USER_ID[0] ;
         A458TBT11_CRT_DATETIME = P002T2_A458TBT11_CRT_DATETIME[0] ;
         n458TBT11_CRT_DATETIME = P002T2_n458TBT11_CRT_DATETIME[0] ;
         A457TBT11_DEL_FLG = P002T2_A457TBT11_DEL_FLG[0] ;
         n457TBT11_DEL_FLG = P002T2_n457TBT11_DEL_FLG[0] ;
         A678TBT11_INPUT_END_AUTH_CD = P002T2_A678TBT11_INPUT_END_AUTH_CD[0] ;
         n678TBT11_INPUT_END_AUTH_CD = P002T2_n678TBT11_INPUT_END_AUTH_CD[0] ;
         A677TBT11_INPUT_END_USER_ID = P002T2_A677TBT11_INPUT_END_USER_ID[0] ;
         n677TBT11_INPUT_END_USER_ID = P002T2_n677TBT11_INPUT_END_USER_ID[0] ;
         A676TBT11_INPUT_END_DATETIME = P002T2_A676TBT11_INPUT_END_DATETIME[0] ;
         n676TBT11_INPUT_END_DATETIME = P002T2_n676TBT11_INPUT_END_DATETIME[0] ;
         A675TBT11_INPUT_END_FLG = P002T2_A675TBT11_INPUT_END_FLG[0] ;
         n675TBT11_INPUT_END_FLG = P002T2_n675TBT11_INPUT_END_FLG[0] ;
         A674TBT11_APPROVAL_AUTH_CD = P002T2_A674TBT11_APPROVAL_AUTH_CD[0] ;
         n674TBT11_APPROVAL_AUTH_CD = P002T2_n674TBT11_APPROVAL_AUTH_CD[0] ;
         A673TBT11_APPROVAL_USER_ID = P002T2_A673TBT11_APPROVAL_USER_ID[0] ;
         n673TBT11_APPROVAL_USER_ID = P002T2_n673TBT11_APPROVAL_USER_ID[0] ;
         A672TBT11_APPROVAL_DATETIME = P002T2_A672TBT11_APPROVAL_DATETIME[0] ;
         n672TBT11_APPROVAL_DATETIME = P002T2_n672TBT11_APPROVAL_DATETIME[0] ;
         A671TBT11_APPROVAL_FLG = P002T2_A671TBT11_APPROVAL_FLG[0] ;
         n671TBT11_APPROVAL_FLG = P002T2_n671TBT11_APPROVAL_FLG[0] ;
         A670TBT11_DM_ARRIVAL_DATETIME = P002T2_A670TBT11_DM_ARRIVAL_DATETIME[0] ;
         n670TBT11_DM_ARRIVAL_DATETIME = P002T2_n670TBT11_DM_ARRIVAL_DATETIME[0] ;
         A669TBT11_DM_ARRIVAL_FLG = P002T2_A669TBT11_DM_ARRIVAL_FLG[0] ;
         n669TBT11_DM_ARRIVAL_FLG = P002T2_n669TBT11_DM_ARRIVAL_FLG[0] ;
         A668TBT11_UPLOAD_AUTH_CD = P002T2_A668TBT11_UPLOAD_AUTH_CD[0] ;
         n668TBT11_UPLOAD_AUTH_CD = P002T2_n668TBT11_UPLOAD_AUTH_CD[0] ;
         A667TBT11_UPLOAD_USER_ID = P002T2_A667TBT11_UPLOAD_USER_ID[0] ;
         n667TBT11_UPLOAD_USER_ID = P002T2_n667TBT11_UPLOAD_USER_ID[0] ;
         A666TBT11_UPLOAD_DATETIME = P002T2_A666TBT11_UPLOAD_DATETIME[0] ;
         n666TBT11_UPLOAD_DATETIME = P002T2_n666TBT11_UPLOAD_DATETIME[0] ;
         A665TBT11_CRF_INPUT_LEVEL = P002T2_A665TBT11_CRF_INPUT_LEVEL[0] ;
         n665TBT11_CRF_INPUT_LEVEL = P002T2_n665TBT11_CRF_INPUT_LEVEL[0] ;
         A936TBT11_CRF_EDA_NO = P002T2_A936TBT11_CRF_EDA_NO[0] ;
         AV25GXLvl35 = (byte)(1) ;
         GXt_char1 = AV17W_STR ;
         GXv_char2[0] = GXt_char1 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A666TBT11_UPLOAD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
         b599_pc16_crf_history_res.this.GXt_char1 = GXv_char2[0] ;
         GXt_char3 = AV17W_STR ;
         GXv_char4[0] = GXt_char3 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A667TBT11_UPLOAD_USER_ID, GXv_char4) ;
         b599_pc16_crf_history_res.this.GXt_char3 = GXv_char4[0] ;
         GXt_char5 = AV17W_STR ;
         GXv_char6[0] = GXt_char5 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A668TBT11_UPLOAD_AUTH_CD, GXv_char6) ;
         b599_pc16_crf_history_res.this.GXt_char5 = GXv_char6[0] ;
         GXt_char7 = AV17W_STR ;
         GXv_char8[0] = GXt_char7 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A669TBT11_DM_ARRIVAL_FLG, GXv_char8) ;
         b599_pc16_crf_history_res.this.GXt_char7 = GXv_char8[0] ;
         GXt_char9 = AV17W_STR ;
         GXv_char10[0] = GXt_char9 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A670TBT11_DM_ARRIVAL_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char10) ;
         b599_pc16_crf_history_res.this.GXt_char9 = GXv_char10[0] ;
         GXt_char11 = AV17W_STR ;
         GXv_char12[0] = GXt_char11 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A671TBT11_APPROVAL_FLG, GXv_char12) ;
         b599_pc16_crf_history_res.this.GXt_char11 = GXv_char12[0] ;
         GXt_char13 = AV17W_STR ;
         GXv_char14[0] = GXt_char13 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A672TBT11_APPROVAL_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char14) ;
         b599_pc16_crf_history_res.this.GXt_char13 = GXv_char14[0] ;
         GXt_char15 = AV17W_STR ;
         GXv_char16[0] = GXt_char15 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A673TBT11_APPROVAL_USER_ID, GXv_char16) ;
         b599_pc16_crf_history_res.this.GXt_char15 = GXv_char16[0] ;
         GXt_char17 = AV17W_STR ;
         GXv_char18[0] = GXt_char17 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A674TBT11_APPROVAL_AUTH_CD, GXv_char18) ;
         b599_pc16_crf_history_res.this.GXt_char17 = GXv_char18[0] ;
         GXt_char19 = AV17W_STR ;
         GXv_char20[0] = GXt_char19 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A675TBT11_INPUT_END_FLG, GXv_char20) ;
         b599_pc16_crf_history_res.this.GXt_char19 = GXv_char20[0] ;
         GXt_char21 = AV17W_STR ;
         GXv_char22[0] = GXt_char21 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A676TBT11_INPUT_END_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char22) ;
         b599_pc16_crf_history_res.this.GXt_char21 = GXv_char22[0] ;
         GXt_char23 = AV17W_STR ;
         GXv_char24[0] = GXt_char23 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A677TBT11_INPUT_END_USER_ID, GXv_char24) ;
         b599_pc16_crf_history_res.this.GXt_char23 = GXv_char24[0] ;
         GXt_char25 = AV17W_STR ;
         GXv_char26[0] = GXt_char25 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A678TBT11_INPUT_END_AUTH_CD, GXv_char26) ;
         b599_pc16_crf_history_res.this.GXt_char25 = GXv_char26[0] ;
         GXt_char27 = AV17W_STR ;
         GXv_char28[0] = GXt_char27 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A457TBT11_DEL_FLG, GXv_char28) ;
         b599_pc16_crf_history_res.this.GXt_char27 = GXv_char28[0] ;
         GXt_char29 = AV17W_STR ;
         GXv_char30[0] = GXt_char29 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A458TBT11_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char30) ;
         b599_pc16_crf_history_res.this.GXt_char29 = GXv_char30[0] ;
         GXt_char31 = AV17W_STR ;
         GXv_char32[0] = GXt_char31 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A459TBT11_CRT_USER_ID, GXv_char32) ;
         b599_pc16_crf_history_res.this.GXt_char31 = GXv_char32[0] ;
         GXt_char33 = AV17W_STR ;
         GXv_char34[0] = GXt_char33 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A460TBT11_CRT_PROG_NM, GXv_char34) ;
         b599_pc16_crf_history_res.this.GXt_char33 = GXv_char34[0] ;
         GXt_char35 = AV17W_STR ;
         GXv_char36[0] = GXt_char35 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A461TBT11_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char36) ;
         b599_pc16_crf_history_res.this.GXt_char35 = GXv_char36[0] ;
         GXt_char37 = AV17W_STR ;
         GXv_char38[0] = GXt_char37 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A462TBT11_UPD_USER_ID, GXv_char38) ;
         b599_pc16_crf_history_res.this.GXt_char37 = GXv_char38[0] ;
         GXt_char39 = AV17W_STR ;
         GXv_char40[0] = GXt_char39 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A463TBT11_UPD_PROG_NM, GXv_char40) ;
         b599_pc16_crf_history_res.this.GXt_char39 = GXv_char40[0] ;
         AV17W_STR = GXutil.trim( GXutil.str( A92TBT11_STUDY_ID, 10, 0)) + "," + GXutil.trim( GXutil.str( A93TBT11_SUBJECT_ID, 10, 0)) + "," + GXutil.trim( GXutil.str( A94TBT11_CRF_ID, 10, 0)) + "," + GXutil.trim( GXutil.str( A95TBT11_CRF_VERSION, 10, 0)) + "," + GXutil.trim( GXutil.str( A665TBT11_CRF_INPUT_LEVEL, 10, 0)) + "," + GXt_char1 + "," + GXt_char3 + "," + GXt_char5 + "," + GXt_char7 + "," + GXt_char9 + "," + GXt_char11 + "," + GXt_char13 + "," + GXt_char15 + "," + GXt_char17 + "," + GXt_char19 + "," + GXt_char21 + "," + GXt_char23 + "," + GXt_char25 + "," + GXt_char27 + "," + GXt_char29 + "," + GXt_char31 + "," + GXt_char33 + "," + GXt_char35 + "," + GXt_char37 + "," + GXt_char39 + "," + GXutil.trim( GXutil.str( A464TBT11_UPD_CNT, 10, 0)) ;
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

   public void S111( )
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

   public void S121( )
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
                  /* Execute user subroutine: S121 */
                  S121 ();
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
      P002T2_A92TBT11_STUDY_ID = new long[1] ;
      P002T2_A95TBT11_CRF_VERSION = new short[1] ;
      P002T2_A94TBT11_CRF_ID = new short[1] ;
      P002T2_A93TBT11_SUBJECT_ID = new int[1] ;
      P002T2_A464TBT11_UPD_CNT = new long[1] ;
      P002T2_n464TBT11_UPD_CNT = new boolean[] {false} ;
      P002T2_A463TBT11_UPD_PROG_NM = new String[] {""} ;
      P002T2_n463TBT11_UPD_PROG_NM = new boolean[] {false} ;
      P002T2_A462TBT11_UPD_USER_ID = new String[] {""} ;
      P002T2_n462TBT11_UPD_USER_ID = new boolean[] {false} ;
      P002T2_A461TBT11_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P002T2_n461TBT11_UPD_DATETIME = new boolean[] {false} ;
      P002T2_A460TBT11_CRT_PROG_NM = new String[] {""} ;
      P002T2_n460TBT11_CRT_PROG_NM = new boolean[] {false} ;
      P002T2_A459TBT11_CRT_USER_ID = new String[] {""} ;
      P002T2_n459TBT11_CRT_USER_ID = new boolean[] {false} ;
      P002T2_A458TBT11_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P002T2_n458TBT11_CRT_DATETIME = new boolean[] {false} ;
      P002T2_A457TBT11_DEL_FLG = new String[] {""} ;
      P002T2_n457TBT11_DEL_FLG = new boolean[] {false} ;
      P002T2_A678TBT11_INPUT_END_AUTH_CD = new String[] {""} ;
      P002T2_n678TBT11_INPUT_END_AUTH_CD = new boolean[] {false} ;
      P002T2_A677TBT11_INPUT_END_USER_ID = new String[] {""} ;
      P002T2_n677TBT11_INPUT_END_USER_ID = new boolean[] {false} ;
      P002T2_A676TBT11_INPUT_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P002T2_n676TBT11_INPUT_END_DATETIME = new boolean[] {false} ;
      P002T2_A675TBT11_INPUT_END_FLG = new String[] {""} ;
      P002T2_n675TBT11_INPUT_END_FLG = new boolean[] {false} ;
      P002T2_A674TBT11_APPROVAL_AUTH_CD = new String[] {""} ;
      P002T2_n674TBT11_APPROVAL_AUTH_CD = new boolean[] {false} ;
      P002T2_A673TBT11_APPROVAL_USER_ID = new String[] {""} ;
      P002T2_n673TBT11_APPROVAL_USER_ID = new boolean[] {false} ;
      P002T2_A672TBT11_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P002T2_n672TBT11_APPROVAL_DATETIME = new boolean[] {false} ;
      P002T2_A671TBT11_APPROVAL_FLG = new String[] {""} ;
      P002T2_n671TBT11_APPROVAL_FLG = new boolean[] {false} ;
      P002T2_A670TBT11_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P002T2_n670TBT11_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      P002T2_A669TBT11_DM_ARRIVAL_FLG = new String[] {""} ;
      P002T2_n669TBT11_DM_ARRIVAL_FLG = new boolean[] {false} ;
      P002T2_A668TBT11_UPLOAD_AUTH_CD = new String[] {""} ;
      P002T2_n668TBT11_UPLOAD_AUTH_CD = new boolean[] {false} ;
      P002T2_A667TBT11_UPLOAD_USER_ID = new String[] {""} ;
      P002T2_n667TBT11_UPLOAD_USER_ID = new boolean[] {false} ;
      P002T2_A666TBT11_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P002T2_n666TBT11_UPLOAD_DATETIME = new boolean[] {false} ;
      P002T2_A665TBT11_CRF_INPUT_LEVEL = new byte[1] ;
      P002T2_n665TBT11_CRF_INPUT_LEVEL = new boolean[] {false} ;
      P002T2_A936TBT11_CRF_EDA_NO = new byte[1] ;
      A463TBT11_UPD_PROG_NM = "" ;
      A462TBT11_UPD_USER_ID = "" ;
      A461TBT11_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A460TBT11_CRT_PROG_NM = "" ;
      A459TBT11_CRT_USER_ID = "" ;
      A458TBT11_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A457TBT11_DEL_FLG = "" ;
      A678TBT11_INPUT_END_AUTH_CD = "" ;
      A677TBT11_INPUT_END_USER_ID = "" ;
      A676TBT11_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A675TBT11_INPUT_END_FLG = "" ;
      A674TBT11_APPROVAL_AUTH_CD = "" ;
      A673TBT11_APPROVAL_USER_ID = "" ;
      A672TBT11_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A671TBT11_APPROVAL_FLG = "" ;
      A670TBT11_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A669TBT11_DM_ARRIVAL_FLG = "" ;
      A668TBT11_UPLOAD_AUTH_CD = "" ;
      A667TBT11_UPLOAD_USER_ID = "" ;
      A666TBT11_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
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
            P002T2_A92TBT11_STUDY_ID, P002T2_A95TBT11_CRF_VERSION, P002T2_A94TBT11_CRF_ID, P002T2_A93TBT11_SUBJECT_ID, P002T2_A464TBT11_UPD_CNT, P002T2_n464TBT11_UPD_CNT, P002T2_A463TBT11_UPD_PROG_NM, P002T2_n463TBT11_UPD_PROG_NM, P002T2_A462TBT11_UPD_USER_ID, P002T2_n462TBT11_UPD_USER_ID,
            P002T2_A461TBT11_UPD_DATETIME, P002T2_n461TBT11_UPD_DATETIME, P002T2_A460TBT11_CRT_PROG_NM, P002T2_n460TBT11_CRT_PROG_NM, P002T2_A459TBT11_CRT_USER_ID, P002T2_n459TBT11_CRT_USER_ID, P002T2_A458TBT11_CRT_DATETIME, P002T2_n458TBT11_CRT_DATETIME, P002T2_A457TBT11_DEL_FLG, P002T2_n457TBT11_DEL_FLG,
            P002T2_A678TBT11_INPUT_END_AUTH_CD, P002T2_n678TBT11_INPUT_END_AUTH_CD, P002T2_A677TBT11_INPUT_END_USER_ID, P002T2_n677TBT11_INPUT_END_USER_ID, P002T2_A676TBT11_INPUT_END_DATETIME, P002T2_n676TBT11_INPUT_END_DATETIME, P002T2_A675TBT11_INPUT_END_FLG, P002T2_n675TBT11_INPUT_END_FLG, P002T2_A674TBT11_APPROVAL_AUTH_CD, P002T2_n674TBT11_APPROVAL_AUTH_CD,
            P002T2_A673TBT11_APPROVAL_USER_ID, P002T2_n673TBT11_APPROVAL_USER_ID, P002T2_A672TBT11_APPROVAL_DATETIME, P002T2_n672TBT11_APPROVAL_DATETIME, P002T2_A671TBT11_APPROVAL_FLG, P002T2_n671TBT11_APPROVAL_FLG, P002T2_A670TBT11_DM_ARRIVAL_DATETIME, P002T2_n670TBT11_DM_ARRIVAL_DATETIME, P002T2_A669TBT11_DM_ARRIVAL_FLG, P002T2_n669TBT11_DM_ARRIVAL_FLG,
            P002T2_A668TBT11_UPLOAD_AUTH_CD, P002T2_n668TBT11_UPLOAD_AUTH_CD, P002T2_A667TBT11_UPLOAD_USER_ID, P002T2_n667TBT11_UPLOAD_USER_ID, P002T2_A666TBT11_UPLOAD_DATETIME, P002T2_n666TBT11_UPLOAD_DATETIME, P002T2_A665TBT11_CRF_INPUT_LEVEL, P002T2_n665TBT11_CRF_INPUT_LEVEL, P002T2_A936TBT11_CRF_EDA_NO
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
   private byte A665TBT11_CRF_INPUT_LEVEL ;
   private byte A936TBT11_CRF_EDA_NO ;
   private short AV14W_RTN_CD ;
   private short AV12W_CRF_ID ;
   private short AV13W_CRF_VERSION ;
   private short A94TBT11_CRF_ID ;
   private short A95TBT11_CRF_VERSION ;
   private short Gx_err ;
   private short GXv_int42[] ;
   private int AV18W_SUBJECT_ID ;
   private int A93TBT11_SUBJECT_ID ;
   private int GXActiveErrHndl ;
   private long AV10P_STUDY_ID ;
   private long A92TBT11_STUDY_ID ;
   private long A464TBT11_UPD_CNT ;
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
   private java.util.Date A461TBT11_UPD_DATETIME ;
   private java.util.Date A458TBT11_CRT_DATETIME ;
   private java.util.Date A676TBT11_INPUT_END_DATETIME ;
   private java.util.Date A672TBT11_APPROVAL_DATETIME ;
   private java.util.Date A670TBT11_DM_ARRIVAL_DATETIME ;
   private java.util.Date A666TBT11_UPLOAD_DATETIME ;
   private boolean returnInSub ;
   private boolean n464TBT11_UPD_CNT ;
   private boolean n463TBT11_UPD_PROG_NM ;
   private boolean n462TBT11_UPD_USER_ID ;
   private boolean n461TBT11_UPD_DATETIME ;
   private boolean n460TBT11_CRT_PROG_NM ;
   private boolean n459TBT11_CRT_USER_ID ;
   private boolean n458TBT11_CRT_DATETIME ;
   private boolean n457TBT11_DEL_FLG ;
   private boolean n678TBT11_INPUT_END_AUTH_CD ;
   private boolean n677TBT11_INPUT_END_USER_ID ;
   private boolean n676TBT11_INPUT_END_DATETIME ;
   private boolean n675TBT11_INPUT_END_FLG ;
   private boolean n674TBT11_APPROVAL_AUTH_CD ;
   private boolean n673TBT11_APPROVAL_USER_ID ;
   private boolean n672TBT11_APPROVAL_DATETIME ;
   private boolean n671TBT11_APPROVAL_FLG ;
   private boolean n670TBT11_DM_ARRIVAL_DATETIME ;
   private boolean n669TBT11_DM_ARRIVAL_FLG ;
   private boolean n668TBT11_UPLOAD_AUTH_CD ;
   private boolean n667TBT11_UPLOAD_USER_ID ;
   private boolean n666TBT11_UPLOAD_DATETIME ;
   private boolean n665TBT11_CRF_INPUT_LEVEL ;
   private String AV11P_SUBJECT_ID ;
   private String AV8P_CRF_ID ;
   private String AV9P_CRF_VERSION ;
   private String AV16W_RTN_MSG ;
   private String AV19C_APP_ID ;
   private String A463TBT11_UPD_PROG_NM ;
   private String A462TBT11_UPD_USER_ID ;
   private String A460TBT11_CRT_PROG_NM ;
   private String A459TBT11_CRT_USER_ID ;
   private String A457TBT11_DEL_FLG ;
   private String A678TBT11_INPUT_END_AUTH_CD ;
   private String A677TBT11_INPUT_END_USER_ID ;
   private String A675TBT11_INPUT_END_FLG ;
   private String A674TBT11_APPROVAL_AUTH_CD ;
   private String A673TBT11_APPROVAL_USER_ID ;
   private String A671TBT11_APPROVAL_FLG ;
   private String A669TBT11_DM_ARRIVAL_FLG ;
   private String A668TBT11_UPLOAD_AUTH_CD ;
   private String A667TBT11_UPLOAD_USER_ID ;
   private String AV17W_STR ;
   private String AV22W_MSG ;
   private GxObjectCollection[] aP4 ;
   private short[] aP5 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private long[] P002T2_A92TBT11_STUDY_ID ;
   private short[] P002T2_A95TBT11_CRF_VERSION ;
   private short[] P002T2_A94TBT11_CRF_ID ;
   private int[] P002T2_A93TBT11_SUBJECT_ID ;
   private long[] P002T2_A464TBT11_UPD_CNT ;
   private boolean[] P002T2_n464TBT11_UPD_CNT ;
   private String[] P002T2_A463TBT11_UPD_PROG_NM ;
   private boolean[] P002T2_n463TBT11_UPD_PROG_NM ;
   private String[] P002T2_A462TBT11_UPD_USER_ID ;
   private boolean[] P002T2_n462TBT11_UPD_USER_ID ;
   private java.util.Date[] P002T2_A461TBT11_UPD_DATETIME ;
   private boolean[] P002T2_n461TBT11_UPD_DATETIME ;
   private String[] P002T2_A460TBT11_CRT_PROG_NM ;
   private boolean[] P002T2_n460TBT11_CRT_PROG_NM ;
   private String[] P002T2_A459TBT11_CRT_USER_ID ;
   private boolean[] P002T2_n459TBT11_CRT_USER_ID ;
   private java.util.Date[] P002T2_A458TBT11_CRT_DATETIME ;
   private boolean[] P002T2_n458TBT11_CRT_DATETIME ;
   private String[] P002T2_A457TBT11_DEL_FLG ;
   private boolean[] P002T2_n457TBT11_DEL_FLG ;
   private String[] P002T2_A678TBT11_INPUT_END_AUTH_CD ;
   private boolean[] P002T2_n678TBT11_INPUT_END_AUTH_CD ;
   private String[] P002T2_A677TBT11_INPUT_END_USER_ID ;
   private boolean[] P002T2_n677TBT11_INPUT_END_USER_ID ;
   private java.util.Date[] P002T2_A676TBT11_INPUT_END_DATETIME ;
   private boolean[] P002T2_n676TBT11_INPUT_END_DATETIME ;
   private String[] P002T2_A675TBT11_INPUT_END_FLG ;
   private boolean[] P002T2_n675TBT11_INPUT_END_FLG ;
   private String[] P002T2_A674TBT11_APPROVAL_AUTH_CD ;
   private boolean[] P002T2_n674TBT11_APPROVAL_AUTH_CD ;
   private String[] P002T2_A673TBT11_APPROVAL_USER_ID ;
   private boolean[] P002T2_n673TBT11_APPROVAL_USER_ID ;
   private java.util.Date[] P002T2_A672TBT11_APPROVAL_DATETIME ;
   private boolean[] P002T2_n672TBT11_APPROVAL_DATETIME ;
   private String[] P002T2_A671TBT11_APPROVAL_FLG ;
   private boolean[] P002T2_n671TBT11_APPROVAL_FLG ;
   private java.util.Date[] P002T2_A670TBT11_DM_ARRIVAL_DATETIME ;
   private boolean[] P002T2_n670TBT11_DM_ARRIVAL_DATETIME ;
   private String[] P002T2_A669TBT11_DM_ARRIVAL_FLG ;
   private boolean[] P002T2_n669TBT11_DM_ARRIVAL_FLG ;
   private String[] P002T2_A668TBT11_UPLOAD_AUTH_CD ;
   private boolean[] P002T2_n668TBT11_UPLOAD_AUTH_CD ;
   private String[] P002T2_A667TBT11_UPLOAD_USER_ID ;
   private boolean[] P002T2_n667TBT11_UPLOAD_USER_ID ;
   private java.util.Date[] P002T2_A666TBT11_UPLOAD_DATETIME ;
   private boolean[] P002T2_n666TBT11_UPLOAD_DATETIME ;
   private byte[] P002T2_A665TBT11_CRF_INPUT_LEVEL ;
   private boolean[] P002T2_n665TBT11_CRF_INPUT_LEVEL ;
   private byte[] P002T2_A936TBT11_CRF_EDA_NO ;
   private GxObjectCollection AV15W_RTN_CSV ;
   private SdtB808_SD01_EXTRA_INFO AV20W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO41[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV21W_PARMS_ITEM ;
}

final  class b599_pc16_crf_history_res__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P002T2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV11P_SUBJECT_ID ,
                                          String AV8P_CRF_ID ,
                                          String AV9P_CRF_VERSION ,
                                          int A93TBT11_SUBJECT_ID ,
                                          int AV18W_SUBJECT_ID ,
                                          short A94TBT11_CRF_ID ,
                                          short AV12W_CRF_ID ,
                                          short A95TBT11_CRF_VERSION ,
                                          short AV13W_CRF_VERSION ,
                                          long AV10P_STUDY_ID ,
                                          long A92TBT11_STUDY_ID )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int43 ;
      GXv_int43 = new byte [4] ;
      Object[] GXv_Object44 ;
      GXv_Object44 = new Object [2] ;
      Gx_ope = "Declare" ;
      Gx_etb = "TBT11_CRF_HISTORY" ;
      scmdbuf = "SELECT `TBT11_STUDY_ID`, `TBT11_CRF_VERSION`, `TBT11_CRF_ID`, `TBT11_SUBJECT_ID`," ;
      scmdbuf = scmdbuf + " `TBT11_UPD_CNT`, `TBT11_UPD_PROG_NM`, `TBT11_UPD_USER_ID`, `TBT11_UPD_DATETIME`," ;
      scmdbuf = scmdbuf + " `TBT11_CRT_PROG_NM`, `TBT11_CRT_USER_ID`, `TBT11_CRT_DATETIME`, `TBT11_DEL_FLG`," ;
      scmdbuf = scmdbuf + " `TBT11_INPUT_END_AUTH_CD`, `TBT11_INPUT_END_USER_ID`, `TBT11_INPUT_END_DATETIME`," ;
      scmdbuf = scmdbuf + " `TBT11_INPUT_END_FLG`, `TBT11_APPROVAL_AUTH_CD`, `TBT11_APPROVAL_USER_ID`, `TBT11_APPROVAL_DATETIME`," ;
      scmdbuf = scmdbuf + " `TBT11_APPROVAL_FLG`, `TBT11_DM_ARRIVAL_DATETIME`, `TBT11_DM_ARRIVAL_FLG`, `TBT11_UPLOAD_AUTH_CD`," ;
      scmdbuf = scmdbuf + " `TBT11_UPLOAD_USER_ID`, `TBT11_UPLOAD_DATETIME`, `TBT11_CRF_INPUT_LEVEL`, `TBT11_CRF_EDA_NO`" ;
      scmdbuf = scmdbuf + " FROM `TBT11_CRF_HISTORY`" ;
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
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.internet.HttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_P002T2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).longValue() , ((Number) dynConstraints[10]).longValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P002T2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
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
               ((byte[]) buf[48])[0] = rslt.getByte(27) ;
               return;
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
               return;
      }
   }

}

