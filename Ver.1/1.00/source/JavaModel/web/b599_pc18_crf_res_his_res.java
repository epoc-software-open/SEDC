/*
               File: B599_PC18_CRF_RES_HIS_RES
        Description: CRFì¸óÕåãâ óöóÉeÅ[ÉuÉãéÊìæ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:17.3
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b599_pc18_crf_res_his_res extends GXProcedure
{
   public b599_pc18_crf_res_his_res( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b599_pc18_crf_res_his_res.class ), "" );
   }

   public b599_pc18_crf_res_his_res( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( long aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String aP3 ,
                             String aP4 ,
                             String aP5 ,
                             GxObjectCollection[] aP6 ,
                             short[] aP7 )
   {
      b599_pc18_crf_res_his_res.this.AV12P_STUDY_ID = aP0;
      b599_pc18_crf_res_his_res.this.AV13P_SUBJECT_ID = aP1;
      b599_pc18_crf_res_his_res.this.AV8P_CRF_ID = aP2;
      b599_pc18_crf_res_his_res.this.AV11P_CRF_VERSION = aP3;
      b599_pc18_crf_res_his_res.this.AV10P_CRF_ITEM_GRP_DIV = aP4;
      b599_pc18_crf_res_his_res.this.AV9P_CRF_ITEM_GRP_CD = aP5;
      b599_pc18_crf_res_his_res.this.AV17W_RTN_CSV = aP6[0];
      b599_pc18_crf_res_his_res.this.aP8 = new String[] {""};
      initialize();
      privateExecute();
      return aP8[0];
   }

   public void execute( long aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String aP3 ,
                        String aP4 ,
                        String aP5 ,
                        GxObjectCollection[] aP6 ,
                        short[] aP7 ,
                        String[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( long aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String aP3 ,
                             String aP4 ,
                             String aP5 ,
                             GxObjectCollection[] aP6 ,
                             short[] aP7 ,
                             String[] aP8 )
   {
      b599_pc18_crf_res_his_res.this.AV12P_STUDY_ID = aP0;
      b599_pc18_crf_res_his_res.this.AV13P_SUBJECT_ID = aP1;
      b599_pc18_crf_res_his_res.this.AV8P_CRF_ID = aP2;
      b599_pc18_crf_res_his_res.this.AV11P_CRF_VERSION = aP3;
      b599_pc18_crf_res_his_res.this.AV10P_CRF_ITEM_GRP_DIV = aP4;
      b599_pc18_crf_res_his_res.this.AV9P_CRF_ITEM_GRP_CD = aP5;
      b599_pc18_crf_res_his_res.this.AV17W_RTN_CSV = aP6[0];
      this.aP6 = aP6;
      b599_pc18_crf_res_his_res.this.aP7 = aP7;
      b599_pc18_crf_res_his_res.this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV21C_APP_ID = "B599" ;
      AV16W_RTN_CD = (short)(0) ;
      AV18W_RTN_MSG = "" ;
      AV22W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV22W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV21C_APP_ID );
      /* Execute user subroutine: S1171 */
      S1171 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV20W_SUBJECT_ID = (int)(GXutil.lval( AV13P_SUBJECT_ID)) ;
      AV14W_CRF_ID = (short)(GXutil.lval( AV8P_CRF_ID)) ;
      AV15W_CRF_VERSION = (short)(GXutil.lval( AV11P_CRF_VERSION)) ;
      AV27GXLvl35 = (byte)(0) ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV13P_SUBJECT_ID ,
                                           AV8P_CRF_ID ,
                                           AV11P_CRF_VERSION ,
                                           AV10P_CRF_ITEM_GRP_DIV ,
                                           AV9P_CRF_ITEM_GRP_CD ,
                                           new Integer(A497TBT13_SUBJECT_ID) ,
                                           new Integer(AV20W_SUBJECT_ID) ,
                                           new Short(A498TBT13_CRF_ID) ,
                                           new Short(AV14W_CRF_ID) ,
                                           new Short(A499TBT13_CRF_VERSION) ,
                                           new Short(AV15W_CRF_VERSION) ,
                                           A500TBT13_CRF_ITEM_GRP_DIV ,
                                           A501TBT13_CRF_ITEM_GRP_CD ,
                                           new Long(AV12P_STUDY_ID) ,
                                           new Long(A496TBT13_STUDY_ID) },
                                           new int[] {
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG
                                           }
      });
      Gx_ope = "Fetch" ;
      Gx_etb = "TBT13_CRF_RES_HIS" ;
      /* Using cursor P002Y2 */
      pr_default.execute(0, new Object[] {new Long(AV12P_STUDY_ID), new Integer(AV20W_SUBJECT_ID), new Short(AV14W_CRF_ID), new Short(AV15W_CRF_VERSION), AV10P_CRF_ITEM_GRP_DIV, AV9P_CRF_ITEM_GRP_CD});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A501TBT13_CRF_ITEM_GRP_CD = P002Y2_A501TBT13_CRF_ITEM_GRP_CD[0] ;
         A500TBT13_CRF_ITEM_GRP_DIV = P002Y2_A500TBT13_CRF_ITEM_GRP_DIV[0] ;
         A499TBT13_CRF_VERSION = P002Y2_A499TBT13_CRF_VERSION[0] ;
         A498TBT13_CRF_ID = P002Y2_A498TBT13_CRF_ID[0] ;
         A497TBT13_SUBJECT_ID = P002Y2_A497TBT13_SUBJECT_ID[0] ;
         A496TBT13_STUDY_ID = P002Y2_A496TBT13_STUDY_ID[0] ;
         A510TBT13_UPD_CNT = P002Y2_A510TBT13_UPD_CNT[0] ;
         n510TBT13_UPD_CNT = P002Y2_n510TBT13_UPD_CNT[0] ;
         A509TBT13_UPD_PROG_NM = P002Y2_A509TBT13_UPD_PROG_NM[0] ;
         n509TBT13_UPD_PROG_NM = P002Y2_n509TBT13_UPD_PROG_NM[0] ;
         A508TBT13_UPD_USER_ID = P002Y2_A508TBT13_UPD_USER_ID[0] ;
         n508TBT13_UPD_USER_ID = P002Y2_n508TBT13_UPD_USER_ID[0] ;
         A507TBT13_UPD_DATETIME = P002Y2_A507TBT13_UPD_DATETIME[0] ;
         n507TBT13_UPD_DATETIME = P002Y2_n507TBT13_UPD_DATETIME[0] ;
         A506TBT13_CRT_PROG_NM = P002Y2_A506TBT13_CRT_PROG_NM[0] ;
         n506TBT13_CRT_PROG_NM = P002Y2_n506TBT13_CRT_PROG_NM[0] ;
         A505TBT13_CRT_USER_ID = P002Y2_A505TBT13_CRT_USER_ID[0] ;
         n505TBT13_CRT_USER_ID = P002Y2_n505TBT13_CRT_USER_ID[0] ;
         A504TBT13_CRT_DATETIME = P002Y2_A504TBT13_CRT_DATETIME[0] ;
         n504TBT13_CRT_DATETIME = P002Y2_n504TBT13_CRT_DATETIME[0] ;
         A503TBT13_DEL_FLG = P002Y2_A503TBT13_DEL_FLG[0] ;
         n503TBT13_DEL_FLG = P002Y2_n503TBT13_DEL_FLG[0] ;
         A588TBT13_EDIT_FLG = P002Y2_A588TBT13_EDIT_FLG[0] ;
         n588TBT13_EDIT_FLG = P002Y2_n588TBT13_EDIT_FLG[0] ;
         A502TBT13_CRF_VALUE = P002Y2_A502TBT13_CRF_VALUE[0] ;
         n502TBT13_CRF_VALUE = P002Y2_n502TBT13_CRF_VALUE[0] ;
         AV27GXLvl35 = (byte)(1) ;
         GXt_char1 = AV19W_STR ;
         GXv_char2[0] = GXt_char1 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A500TBT13_CRF_ITEM_GRP_DIV, GXv_char2) ;
         b599_pc18_crf_res_his_res.this.GXt_char1 = GXv_char2[0] ;
         GXt_char3 = AV19W_STR ;
         GXv_char4[0] = GXt_char3 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A501TBT13_CRF_ITEM_GRP_CD, GXv_char4) ;
         b599_pc18_crf_res_his_res.this.GXt_char3 = GXv_char4[0] ;
         GXt_char5 = AV19W_STR ;
         GXv_char6[0] = GXt_char5 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A502TBT13_CRF_VALUE, GXv_char6) ;
         b599_pc18_crf_res_his_res.this.GXt_char5 = GXv_char6[0] ;
         GXt_char7 = AV19W_STR ;
         GXv_char8[0] = GXt_char7 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A588TBT13_EDIT_FLG, GXv_char8) ;
         b599_pc18_crf_res_his_res.this.GXt_char7 = GXv_char8[0] ;
         GXt_char9 = AV19W_STR ;
         GXv_char10[0] = GXt_char9 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A503TBT13_DEL_FLG, GXv_char10) ;
         b599_pc18_crf_res_his_res.this.GXt_char9 = GXv_char10[0] ;
         GXt_char11 = AV19W_STR ;
         GXv_char12[0] = GXt_char11 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A504TBT13_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char12) ;
         b599_pc18_crf_res_his_res.this.GXt_char11 = GXv_char12[0] ;
         GXt_char13 = AV19W_STR ;
         GXv_char14[0] = GXt_char13 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A505TBT13_CRT_USER_ID, GXv_char14) ;
         b599_pc18_crf_res_his_res.this.GXt_char13 = GXv_char14[0] ;
         GXt_char15 = AV19W_STR ;
         GXv_char16[0] = GXt_char15 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A506TBT13_CRT_PROG_NM, GXv_char16) ;
         b599_pc18_crf_res_his_res.this.GXt_char15 = GXv_char16[0] ;
         GXt_char17 = AV19W_STR ;
         GXv_char18[0] = GXt_char17 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A507TBT13_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char18) ;
         b599_pc18_crf_res_his_res.this.GXt_char17 = GXv_char18[0] ;
         GXt_char19 = AV19W_STR ;
         GXv_char20[0] = GXt_char19 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A508TBT13_UPD_USER_ID, GXv_char20) ;
         b599_pc18_crf_res_his_res.this.GXt_char19 = GXv_char20[0] ;
         GXt_char21 = AV19W_STR ;
         GXv_char22[0] = GXt_char21 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A509TBT13_UPD_PROG_NM, GXv_char22) ;
         b599_pc18_crf_res_his_res.this.GXt_char21 = GXv_char22[0] ;
         AV19W_STR = GXutil.trim( GXutil.str( A496TBT13_STUDY_ID, 10, 0)) + "," + GXutil.trim( GXutil.str( A497TBT13_SUBJECT_ID, 10, 0)) + "," + GXutil.trim( GXutil.str( A498TBT13_CRF_ID, 10, 0)) + "," + GXutil.trim( GXutil.str( A499TBT13_CRF_VERSION, 10, 0)) + "," + GXt_char1 + "," + GXt_char3 + "," + GXt_char5 + "," + GXt_char7 + "," + GXt_char9 + "," + GXt_char11 + "," + GXt_char13 + "," + GXt_char15 + "," + GXt_char17 + "," + GXt_char19 + "," + GXt_char21 + "," + GXutil.trim( GXutil.str( A510TBT13_UPD_CNT, 10, 0)) ;
         AV17W_RTN_CSV.add(AV19W_STR, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV27GXLvl35 == 0 )
      {
         AV16W_RTN_CD = (short)(1) ;
         GXt_char21 = AV18W_RTN_MSG ;
         GXv_char22[0] = GXt_char21 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char22) ;
         b599_pc18_crf_res_his_res.this.GXt_char21 = GXv_char22[0] ;
         AV18W_RTN_MSG = GXt_char21 ;
      }
      cleanup();
   }

   public void S1171( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      AV22W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      AV23W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV23W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_STUDY_ID" );
      AV23W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( GXutil.trim( GXutil.str( AV12P_STUDY_ID, 10, 0)) );
      AV22W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV23W_PARMS_ITEM, 0);
      AV23W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV23W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_SUBJECT_ID" );
      AV23W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV13P_SUBJECT_ID );
      AV22W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV23W_PARMS_ITEM, 0);
      AV23W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV23W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_CRF_ID" );
      AV23W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV8P_CRF_ID );
      AV22W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV23W_PARMS_ITEM, 0);
      AV23W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV23W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_CRF_VERSION" );
      AV23W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV11P_CRF_VERSION );
      AV22W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV23W_PARMS_ITEM, 0);
      AV23W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV23W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_CRF_ITEM_GRP_DIV" );
      AV23W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV10P_CRF_ITEM_GRP_DIV );
      AV22W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV23W_PARMS_ITEM, 0);
      AV23W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV23W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_CRF_ITEM_GRP_CD" );
      AV23W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV9P_CRF_ITEM_GRP_CD );
      AV22W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV23W_PARMS_ITEM, 0);
      AV24W_MSG = "SUB_INIT" ;
      GXv_SdtB808_SD01_EXTRA_INFO23[0] = AV22W_EXTRA_INFO;
      GXv_int24[0] = AV16W_RTN_CD ;
      GXv_char22[0] = AV18W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV28Pgmname, (short)(1), AV24W_MSG, GXv_SdtB808_SD01_EXTRA_INFO23, GXv_int24, GXv_char22) ;
      AV22W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO23[0] ;
      b599_pc18_crf_res_his_res.this.AV16W_RTN_CD = GXv_int24[0] ;
      b599_pc18_crf_res_his_res.this.AV18W_RTN_MSG = GXv_char22[0] ;
   }

   public void S12111( )
   {
      /* 'SUB_ERROR' Routine */
      AV24W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO23[0] = AV22W_EXTRA_INFO;
      GXv_int24[0] = AV16W_RTN_CD ;
      GXv_char22[0] = AV18W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV28Pgmname, (short)(0), AV24W_MSG, GXv_SdtB808_SD01_EXTRA_INFO23, GXv_int24, GXv_char22) ;
      AV22W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO23[0] ;
      b599_pc18_crf_res_his_res.this.AV16W_RTN_CD = GXv_int24[0] ;
      b599_pc18_crf_res_his_res.this.AV18W_RTN_MSG = GXv_char22[0] ;
      context.globals.Gx_eop = (byte)(0) ;
   }

   protected void cleanup( )
   {
      this.aP6[0] = b599_pc18_crf_res_his_res.this.AV17W_RTN_CSV;
      this.aP7[0] = b599_pc18_crf_res_his_res.this.AV16W_RTN_CD;
      this.aP8[0] = b599_pc18_crf_res_his_res.this.AV18W_RTN_MSG;
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
      AV18W_RTN_MSG = "" ;
      AV21C_APP_ID = "" ;
      AV22W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      scmdbuf = "" ;
      A500TBT13_CRF_ITEM_GRP_DIV = "" ;
      A501TBT13_CRF_ITEM_GRP_CD = "" ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      P002Y2_A501TBT13_CRF_ITEM_GRP_CD = new String[] {""} ;
      P002Y2_A500TBT13_CRF_ITEM_GRP_DIV = new String[] {""} ;
      P002Y2_A499TBT13_CRF_VERSION = new short[1] ;
      P002Y2_A498TBT13_CRF_ID = new short[1] ;
      P002Y2_A497TBT13_SUBJECT_ID = new int[1] ;
      P002Y2_A496TBT13_STUDY_ID = new long[1] ;
      P002Y2_A510TBT13_UPD_CNT = new long[1] ;
      P002Y2_n510TBT13_UPD_CNT = new boolean[] {false} ;
      P002Y2_A509TBT13_UPD_PROG_NM = new String[] {""} ;
      P002Y2_n509TBT13_UPD_PROG_NM = new boolean[] {false} ;
      P002Y2_A508TBT13_UPD_USER_ID = new String[] {""} ;
      P002Y2_n508TBT13_UPD_USER_ID = new boolean[] {false} ;
      P002Y2_A507TBT13_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P002Y2_n507TBT13_UPD_DATETIME = new boolean[] {false} ;
      P002Y2_A506TBT13_CRT_PROG_NM = new String[] {""} ;
      P002Y2_n506TBT13_CRT_PROG_NM = new boolean[] {false} ;
      P002Y2_A505TBT13_CRT_USER_ID = new String[] {""} ;
      P002Y2_n505TBT13_CRT_USER_ID = new boolean[] {false} ;
      P002Y2_A504TBT13_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P002Y2_n504TBT13_CRT_DATETIME = new boolean[] {false} ;
      P002Y2_A503TBT13_DEL_FLG = new String[] {""} ;
      P002Y2_n503TBT13_DEL_FLG = new boolean[] {false} ;
      P002Y2_A588TBT13_EDIT_FLG = new String[] {""} ;
      P002Y2_n588TBT13_EDIT_FLG = new boolean[] {false} ;
      P002Y2_A502TBT13_CRF_VALUE = new String[] {""} ;
      P002Y2_n502TBT13_CRF_VALUE = new boolean[] {false} ;
      A509TBT13_UPD_PROG_NM = "" ;
      A508TBT13_UPD_USER_ID = "" ;
      A507TBT13_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A506TBT13_CRT_PROG_NM = "" ;
      A505TBT13_CRT_USER_ID = "" ;
      A504TBT13_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A503TBT13_DEL_FLG = "" ;
      A588TBT13_EDIT_FLG = "" ;
      A502TBT13_CRF_VALUE = "" ;
      AV19W_STR = "" ;
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
      AV23W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV24W_MSG = "" ;
      AV28Pgmname = "" ;
      GXv_SdtB808_SD01_EXTRA_INFO23 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int24 = new short [1] ;
      GXv_char22 = new String [1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b599_pc18_crf_res_his_res__default(),
         new Object[] {
             new Object[] {
            P002Y2_A501TBT13_CRF_ITEM_GRP_CD, P002Y2_A500TBT13_CRF_ITEM_GRP_DIV, P002Y2_A499TBT13_CRF_VERSION, P002Y2_A498TBT13_CRF_ID, P002Y2_A497TBT13_SUBJECT_ID, P002Y2_A496TBT13_STUDY_ID, P002Y2_A510TBT13_UPD_CNT, P002Y2_n510TBT13_UPD_CNT, P002Y2_A509TBT13_UPD_PROG_NM, P002Y2_n509TBT13_UPD_PROG_NM,
            P002Y2_A508TBT13_UPD_USER_ID, P002Y2_n508TBT13_UPD_USER_ID, P002Y2_A507TBT13_UPD_DATETIME, P002Y2_n507TBT13_UPD_DATETIME, P002Y2_A506TBT13_CRT_PROG_NM, P002Y2_n506TBT13_CRT_PROG_NM, P002Y2_A505TBT13_CRT_USER_ID, P002Y2_n505TBT13_CRT_USER_ID, P002Y2_A504TBT13_CRT_DATETIME, P002Y2_n504TBT13_CRT_DATETIME,
            P002Y2_A503TBT13_DEL_FLG, P002Y2_n503TBT13_DEL_FLG, P002Y2_A588TBT13_EDIT_FLG, P002Y2_n588TBT13_EDIT_FLG, P002Y2_A502TBT13_CRF_VALUE, P002Y2_n502TBT13_CRF_VALUE
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV28Pgmname = "B599_PC18_CRF_RES_HIS_RES" ;
      /* GeneXus formulas. */
      AV28Pgmname = "B599_PC18_CRF_RES_HIS_RES" ;
      Gx_err = (short)(0) ;
   }

   private byte AV27GXLvl35 ;
   private short AV16W_RTN_CD ;
   private short AV14W_CRF_ID ;
   private short AV15W_CRF_VERSION ;
   private short A498TBT13_CRF_ID ;
   private short A499TBT13_CRF_VERSION ;
   private short GXv_int24[] ;
   private short Gx_err ;
   private int AV20W_SUBJECT_ID ;
   private int A497TBT13_SUBJECT_ID ;
   private int GXActiveErrHndl ;
   private long AV12P_STUDY_ID ;
   private long A496TBT13_STUDY_ID ;
   private long A510TBT13_UPD_CNT ;
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
   private String AV28Pgmname ;
   private String GXv_char22[] ;
   private String Gx_emsg ;
   private java.util.Date A507TBT13_UPD_DATETIME ;
   private java.util.Date A504TBT13_CRT_DATETIME ;
   private boolean returnInSub ;
   private boolean n510TBT13_UPD_CNT ;
   private boolean n509TBT13_UPD_PROG_NM ;
   private boolean n508TBT13_UPD_USER_ID ;
   private boolean n507TBT13_UPD_DATETIME ;
   private boolean n506TBT13_CRT_PROG_NM ;
   private boolean n505TBT13_CRT_USER_ID ;
   private boolean n504TBT13_CRT_DATETIME ;
   private boolean n503TBT13_DEL_FLG ;
   private boolean n588TBT13_EDIT_FLG ;
   private boolean n502TBT13_CRF_VALUE ;
   private String AV13P_SUBJECT_ID ;
   private String AV8P_CRF_ID ;
   private String AV11P_CRF_VERSION ;
   private String AV10P_CRF_ITEM_GRP_DIV ;
   private String AV9P_CRF_ITEM_GRP_CD ;
   private String AV18W_RTN_MSG ;
   private String AV21C_APP_ID ;
   private String A500TBT13_CRF_ITEM_GRP_DIV ;
   private String A501TBT13_CRF_ITEM_GRP_CD ;
   private String A509TBT13_UPD_PROG_NM ;
   private String A508TBT13_UPD_USER_ID ;
   private String A506TBT13_CRT_PROG_NM ;
   private String A505TBT13_CRT_USER_ID ;
   private String A503TBT13_DEL_FLG ;
   private String A588TBT13_EDIT_FLG ;
   private String A502TBT13_CRF_VALUE ;
   private String AV19W_STR ;
   private String AV24W_MSG ;
   private GxObjectCollection[] aP6 ;
   private short[] aP7 ;
   private String[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P002Y2_A501TBT13_CRF_ITEM_GRP_CD ;
   private String[] P002Y2_A500TBT13_CRF_ITEM_GRP_DIV ;
   private short[] P002Y2_A499TBT13_CRF_VERSION ;
   private short[] P002Y2_A498TBT13_CRF_ID ;
   private int[] P002Y2_A497TBT13_SUBJECT_ID ;
   private long[] P002Y2_A496TBT13_STUDY_ID ;
   private long[] P002Y2_A510TBT13_UPD_CNT ;
   private boolean[] P002Y2_n510TBT13_UPD_CNT ;
   private String[] P002Y2_A509TBT13_UPD_PROG_NM ;
   private boolean[] P002Y2_n509TBT13_UPD_PROG_NM ;
   private String[] P002Y2_A508TBT13_UPD_USER_ID ;
   private boolean[] P002Y2_n508TBT13_UPD_USER_ID ;
   private java.util.Date[] P002Y2_A507TBT13_UPD_DATETIME ;
   private boolean[] P002Y2_n507TBT13_UPD_DATETIME ;
   private String[] P002Y2_A506TBT13_CRT_PROG_NM ;
   private boolean[] P002Y2_n506TBT13_CRT_PROG_NM ;
   private String[] P002Y2_A505TBT13_CRT_USER_ID ;
   private boolean[] P002Y2_n505TBT13_CRT_USER_ID ;
   private java.util.Date[] P002Y2_A504TBT13_CRT_DATETIME ;
   private boolean[] P002Y2_n504TBT13_CRT_DATETIME ;
   private String[] P002Y2_A503TBT13_DEL_FLG ;
   private boolean[] P002Y2_n503TBT13_DEL_FLG ;
   private String[] P002Y2_A588TBT13_EDIT_FLG ;
   private boolean[] P002Y2_n588TBT13_EDIT_FLG ;
   private String[] P002Y2_A502TBT13_CRF_VALUE ;
   private boolean[] P002Y2_n502TBT13_CRF_VALUE ;
   private GxObjectCollection AV17W_RTN_CSV ;
   private SdtB808_SD01_EXTRA_INFO AV22W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO23[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV23W_PARMS_ITEM ;
}

final  class b599_pc18_crf_res_his_res__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P002Y2( com.genexus.internet.HttpContext httpContext ,
                                          String AV13P_SUBJECT_ID ,
                                          String AV8P_CRF_ID ,
                                          String AV11P_CRF_VERSION ,
                                          String AV10P_CRF_ITEM_GRP_DIV ,
                                          String AV9P_CRF_ITEM_GRP_CD ,
                                          int A497TBT13_SUBJECT_ID ,
                                          int AV20W_SUBJECT_ID ,
                                          short A498TBT13_CRF_ID ,
                                          short AV14W_CRF_ID ,
                                          short A499TBT13_CRF_VERSION ,
                                          short AV15W_CRF_VERSION ,
                                          String A500TBT13_CRF_ITEM_GRP_DIV ,
                                          String A501TBT13_CRF_ITEM_GRP_CD ,
                                          long AV12P_STUDY_ID ,
                                          long A496TBT13_STUDY_ID )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int25 ;
      GXv_int25 = new byte [6] ;
      Object[] GXv_Object26 ;
      GXv_Object26 = new Object [2] ;
      Gx_ope = "Declare" ;
      Gx_etb = "TBT13_CRF_RES_HIS" ;
      scmdbuf = "SELECT `TBT13_CRF_ITEM_GRP_CD`, `TBT13_CRF_ITEM_GRP_DIV`, `TBT13_CRF_VERSION`, `TBT13_CRF_ID`," ;
      scmdbuf = scmdbuf + " `TBT13_SUBJECT_ID`, `TBT13_STUDY_ID`, `TBT13_UPD_CNT`, `TBT13_UPD_PROG_NM`, `TBT13_UPD_USER_ID`," ;
      scmdbuf = scmdbuf + " `TBT13_UPD_DATETIME`, `TBT13_CRT_PROG_NM`, `TBT13_CRT_USER_ID`, `TBT13_CRT_DATETIME`," ;
      scmdbuf = scmdbuf + " `TBT13_DEL_FLG`, `TBT13_EDIT_FLG`, `TBT13_CRF_VALUE` FROM `TBT13_CRF_RES_HIS`" ;
      scmdbuf = scmdbuf + " WHERE (`TBT13_STUDY_ID` = ?)" ;
      if ( ! (GXutil.strcmp("", AV13P_SUBJECT_ID)==0) )
      {
         sWhereString = sWhereString + " and (`TBT13_SUBJECT_ID` = ?)" ;
      }
      else
      {
         GXv_int25[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV8P_CRF_ID)==0) )
      {
         sWhereString = sWhereString + " and (`TBT13_CRF_ID` = ?)" ;
      }
      else
      {
         GXv_int25[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11P_CRF_VERSION)==0) )
      {
         sWhereString = sWhereString + " and (`TBT13_CRF_VERSION` = ?)" ;
      }
      else
      {
         GXv_int25[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV10P_CRF_ITEM_GRP_DIV)==0) )
      {
         sWhereString = sWhereString + " and (`TBT13_CRF_ITEM_GRP_DIV` = ?)" ;
      }
      else
      {
         GXv_int25[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV9P_CRF_ITEM_GRP_CD)==0) )
      {
         sWhereString = sWhereString + " and (`TBT13_CRF_ITEM_GRP_CD` = ?)" ;
      }
      else
      {
         GXv_int25[5] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TBT13_STUDY_ID`, `TBT13_SUBJECT_ID`, `TBT13_CRF_ID`, `TBT13_CRF_VERSION`, `TBT13_CRF_ITEM_GRP_DIV`, `TBT13_CRF_ITEM_GRP_CD`" ;
      GXv_Object26[0] = scmdbuf ;
      GXv_Object26[1] = GXv_int25 ;
      return GXv_Object26 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         com.genexus.internet.HttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_P002Y2(httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).longValue() , ((Number) dynConstraints[14]).longValue() );
      }
      return super.getDynamicStatement(cursor, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P002Y2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((long[]) buf[5])[0] = rslt.getLong(6) ;
               ((long[]) buf[6])[0] = rslt.getLong(7) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(10) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDateTime(13) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
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
                  stmt.setLong(sIdx, ((Number) parms[6]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[7]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[8]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[9]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[10], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 50);
               }
               break;
      }
   }

}

