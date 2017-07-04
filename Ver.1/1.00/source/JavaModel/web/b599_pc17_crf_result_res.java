/*
               File: B599_PC17_CRF_RESULT_RES
        Description: CRFì¸óÕåãâ ÉeÅ[ÉuÉãéÊìæ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:16.67
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b599_pc17_crf_result_res extends GXProcedure
{
   public b599_pc17_crf_result_res( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b599_pc17_crf_result_res.class ), "" );
   }

   public b599_pc17_crf_result_res( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( long aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String aP3 ,
                             String aP4 ,
                             GxObjectCollection[] aP5 ,
                             short[] aP6 )
   {
      b599_pc17_crf_result_res.this.AV11P_STUDY_ID = aP0;
      b599_pc17_crf_result_res.this.AV12P_SUBJECT_ID = aP1;
      b599_pc17_crf_result_res.this.AV8P_CRF_ID = aP2;
      b599_pc17_crf_result_res.this.AV10P_CRF_ITEM_GRP_DIV = aP3;
      b599_pc17_crf_result_res.this.AV9P_CRF_ITEM_GRP_CD = aP4;
      b599_pc17_crf_result_res.this.AV15W_RTN_CSV = aP5[0];
      b599_pc17_crf_result_res.this.aP7 = new String[] {""};
      initialize();
      privateExecute();
      return aP7[0];
   }

   public void execute( long aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String aP3 ,
                        String aP4 ,
                        GxObjectCollection[] aP5 ,
                        short[] aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( long aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String aP3 ,
                             String aP4 ,
                             GxObjectCollection[] aP5 ,
                             short[] aP6 ,
                             String[] aP7 )
   {
      b599_pc17_crf_result_res.this.AV11P_STUDY_ID = aP0;
      b599_pc17_crf_result_res.this.AV12P_SUBJECT_ID = aP1;
      b599_pc17_crf_result_res.this.AV8P_CRF_ID = aP2;
      b599_pc17_crf_result_res.this.AV10P_CRF_ITEM_GRP_DIV = aP3;
      b599_pc17_crf_result_res.this.AV9P_CRF_ITEM_GRP_CD = aP4;
      b599_pc17_crf_result_res.this.AV15W_RTN_CSV = aP5[0];
      this.aP5 = aP5;
      b599_pc17_crf_result_res.this.aP6 = aP6;
      b599_pc17_crf_result_res.this.aP7 = aP7;
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
      /* Execute user subroutine: S1168 */
      S1168 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV18W_SUBJECT_ID = (int)(GXutil.lval( AV12P_SUBJECT_ID)) ;
      AV13W_CRF_ID = (short)(GXutil.lval( AV8P_CRF_ID)) ;
      AV25GXLvl34 = (byte)(0) ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV12P_SUBJECT_ID ,
                                           AV8P_CRF_ID ,
                                           AV10P_CRF_ITEM_GRP_DIV ,
                                           AV9P_CRF_ITEM_GRP_CD ,
                                           new Integer(A316TBT12_SUBJECT_ID) ,
                                           new Integer(AV18W_SUBJECT_ID) ,
                                           new Short(A317TBT12_CRF_ID) ,
                                           new Short(AV13W_CRF_ID) ,
                                           A318TBT12_CRF_ITEM_GRP_DIV ,
                                           A319TBT12_CRF_ITEM_GRP_CD ,
                                           new Long(AV11P_STUDY_ID) ,
                                           new Long(A315TBT12_STUDY_ID) },
                                           new int[] {
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.LONG, TypeConstants.LONG
                                           }
      });
      Gx_ope = "Fetch" ;
      Gx_etb = "TBT12_CRF_RESULT" ;
      /* Using cursor P002X2 */
      pr_default.execute(0, new Object[] {new Long(AV11P_STUDY_ID), new Integer(AV18W_SUBJECT_ID), new Short(AV13W_CRF_ID), AV10P_CRF_ITEM_GRP_DIV, AV9P_CRF_ITEM_GRP_CD});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A319TBT12_CRF_ITEM_GRP_CD = P002X2_A319TBT12_CRF_ITEM_GRP_CD[0] ;
         A318TBT12_CRF_ITEM_GRP_DIV = P002X2_A318TBT12_CRF_ITEM_GRP_DIV[0] ;
         A317TBT12_CRF_ID = P002X2_A317TBT12_CRF_ID[0] ;
         A316TBT12_SUBJECT_ID = P002X2_A316TBT12_SUBJECT_ID[0] ;
         A315TBT12_STUDY_ID = P002X2_A315TBT12_STUDY_ID[0] ;
         A327TBT12_UPD_CNT = P002X2_A327TBT12_UPD_CNT[0] ;
         n327TBT12_UPD_CNT = P002X2_n327TBT12_UPD_CNT[0] ;
         A326TBT12_UPD_PROG_NM = P002X2_A326TBT12_UPD_PROG_NM[0] ;
         n326TBT12_UPD_PROG_NM = P002X2_n326TBT12_UPD_PROG_NM[0] ;
         A325TBT12_UPD_USER_ID = P002X2_A325TBT12_UPD_USER_ID[0] ;
         n325TBT12_UPD_USER_ID = P002X2_n325TBT12_UPD_USER_ID[0] ;
         A324TBT12_UPD_DATETIME = P002X2_A324TBT12_UPD_DATETIME[0] ;
         n324TBT12_UPD_DATETIME = P002X2_n324TBT12_UPD_DATETIME[0] ;
         A323TBT12_CRT_PROG_NM = P002X2_A323TBT12_CRT_PROG_NM[0] ;
         n323TBT12_CRT_PROG_NM = P002X2_n323TBT12_CRT_PROG_NM[0] ;
         A322TBT12_CRT_USER_ID = P002X2_A322TBT12_CRT_USER_ID[0] ;
         n322TBT12_CRT_USER_ID = P002X2_n322TBT12_CRT_USER_ID[0] ;
         A321TBT12_CRT_DATETIME = P002X2_A321TBT12_CRT_DATETIME[0] ;
         n321TBT12_CRT_DATETIME = P002X2_n321TBT12_CRT_DATETIME[0] ;
         A328TBT12_DEL_FLG = P002X2_A328TBT12_DEL_FLG[0] ;
         n328TBT12_DEL_FLG = P002X2_n328TBT12_DEL_FLG[0] ;
         A587TBT12_EDIT_FLG = P002X2_A587TBT12_EDIT_FLG[0] ;
         n587TBT12_EDIT_FLG = P002X2_n587TBT12_EDIT_FLG[0] ;
         A320TBT12_CRF_VALUE = P002X2_A320TBT12_CRF_VALUE[0] ;
         n320TBT12_CRF_VALUE = P002X2_n320TBT12_CRF_VALUE[0] ;
         AV25GXLvl34 = (byte)(1) ;
         GXt_char1 = AV17W_STR ;
         GXv_char2[0] = GXt_char1 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A318TBT12_CRF_ITEM_GRP_DIV, GXv_char2) ;
         b599_pc17_crf_result_res.this.GXt_char1 = GXv_char2[0] ;
         GXt_char3 = AV17W_STR ;
         GXv_char4[0] = GXt_char3 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A319TBT12_CRF_ITEM_GRP_CD, GXv_char4) ;
         b599_pc17_crf_result_res.this.GXt_char3 = GXv_char4[0] ;
         GXt_char5 = AV17W_STR ;
         GXv_char6[0] = GXt_char5 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A320TBT12_CRF_VALUE, GXv_char6) ;
         b599_pc17_crf_result_res.this.GXt_char5 = GXv_char6[0] ;
         GXt_char7 = AV17W_STR ;
         GXv_char8[0] = GXt_char7 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A587TBT12_EDIT_FLG, GXv_char8) ;
         b599_pc17_crf_result_res.this.GXt_char7 = GXv_char8[0] ;
         GXt_char9 = AV17W_STR ;
         GXv_char10[0] = GXt_char9 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A328TBT12_DEL_FLG, GXv_char10) ;
         b599_pc17_crf_result_res.this.GXt_char9 = GXv_char10[0] ;
         GXt_char11 = AV17W_STR ;
         GXv_char12[0] = GXt_char11 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A321TBT12_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char12) ;
         b599_pc17_crf_result_res.this.GXt_char11 = GXv_char12[0] ;
         GXt_char13 = AV17W_STR ;
         GXv_char14[0] = GXt_char13 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A322TBT12_CRT_USER_ID, GXv_char14) ;
         b599_pc17_crf_result_res.this.GXt_char13 = GXv_char14[0] ;
         GXt_char15 = AV17W_STR ;
         GXv_char16[0] = GXt_char15 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A323TBT12_CRT_PROG_NM, GXv_char16) ;
         b599_pc17_crf_result_res.this.GXt_char15 = GXv_char16[0] ;
         GXt_char17 = AV17W_STR ;
         GXv_char18[0] = GXt_char17 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A324TBT12_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char18) ;
         b599_pc17_crf_result_res.this.GXt_char17 = GXv_char18[0] ;
         GXt_char19 = AV17W_STR ;
         GXv_char20[0] = GXt_char19 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A325TBT12_UPD_USER_ID, GXv_char20) ;
         b599_pc17_crf_result_res.this.GXt_char19 = GXv_char20[0] ;
         GXt_char21 = AV17W_STR ;
         GXv_char22[0] = GXt_char21 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A326TBT12_UPD_PROG_NM, GXv_char22) ;
         b599_pc17_crf_result_res.this.GXt_char21 = GXv_char22[0] ;
         AV17W_STR = GXutil.trim( GXutil.str( A315TBT12_STUDY_ID, 10, 0)) + "," + GXutil.trim( GXutil.str( A316TBT12_SUBJECT_ID, 10, 0)) + "," + GXutil.trim( GXutil.str( A317TBT12_CRF_ID, 10, 0)) + "," + GXt_char1 + "," + GXt_char3 + "," + GXt_char5 + "," + GXt_char7 + "," + GXt_char9 + "," + GXt_char11 + "," + GXt_char13 + "," + GXt_char15 + "," + GXt_char17 + "," + GXt_char19 + "," + GXt_char21 + "," + GXutil.trim( GXutil.str( A327TBT12_UPD_CNT, 10, 0)) ;
         AV15W_RTN_CSV.add(AV17W_STR, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV25GXLvl34 == 0 )
      {
         AV14W_RTN_CD = (short)(1) ;
         GXt_char21 = AV16W_RTN_MSG ;
         GXv_char22[0] = GXt_char21 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char22) ;
         b599_pc17_crf_result_res.this.GXt_char21 = GXv_char22[0] ;
         AV16W_RTN_MSG = GXt_char21 ;
      }
      cleanup();
   }

   public void S1168( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      AV20W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      AV21W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV21W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_STUDY_ID" );
      AV21W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( GXutil.trim( GXutil.str( AV11P_STUDY_ID, 10, 0)) );
      AV20W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV21W_PARMS_ITEM, 0);
      AV21W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV21W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_SUBJECT_ID" );
      AV21W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV12P_SUBJECT_ID );
      AV20W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV21W_PARMS_ITEM, 0);
      AV21W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV21W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_CRF_ID" );
      AV21W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV8P_CRF_ID );
      AV20W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV21W_PARMS_ITEM, 0);
      AV21W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV21W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_CRF_ITEM_GRP_DIV" );
      AV21W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV10P_CRF_ITEM_GRP_DIV );
      AV20W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV21W_PARMS_ITEM, 0);
      AV21W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV21W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_CRF_ITEM_GRP_CD" );
      AV21W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV9P_CRF_ITEM_GRP_CD );
      AV20W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV21W_PARMS_ITEM, 0);
      AV22W_MSG = "SUB_INIT" ;
      GXv_SdtB808_SD01_EXTRA_INFO23[0] = AV20W_EXTRA_INFO;
      GXv_int24[0] = AV14W_RTN_CD ;
      GXv_char22[0] = AV16W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV26Pgmname, (short)(1), AV22W_MSG, GXv_SdtB808_SD01_EXTRA_INFO23, GXv_int24, GXv_char22) ;
      AV20W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO23[0] ;
      b599_pc17_crf_result_res.this.AV14W_RTN_CD = GXv_int24[0] ;
      b599_pc17_crf_result_res.this.AV16W_RTN_MSG = GXv_char22[0] ;
   }

   public void S12104( )
   {
      /* 'SUB_ERROR' Routine */
      AV22W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO23[0] = AV20W_EXTRA_INFO;
      GXv_int24[0] = AV14W_RTN_CD ;
      GXv_char22[0] = AV16W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV26Pgmname, (short)(0), AV22W_MSG, GXv_SdtB808_SD01_EXTRA_INFO23, GXv_int24, GXv_char22) ;
      AV20W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO23[0] ;
      b599_pc17_crf_result_res.this.AV14W_RTN_CD = GXv_int24[0] ;
      b599_pc17_crf_result_res.this.AV16W_RTN_MSG = GXv_char22[0] ;
      context.globals.Gx_eop = (byte)(0) ;
   }

   protected void cleanup( )
   {
      this.aP5[0] = b599_pc17_crf_result_res.this.AV15W_RTN_CSV;
      this.aP6[0] = b599_pc17_crf_result_res.this.AV14W_RTN_CD;
      this.aP7[0] = b599_pc17_crf_result_res.this.AV16W_RTN_MSG;
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
                  /* Execute user subroutine: S12104 */
                  S12104 ();
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
      A318TBT12_CRF_ITEM_GRP_DIV = "" ;
      A319TBT12_CRF_ITEM_GRP_CD = "" ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      P002X2_A319TBT12_CRF_ITEM_GRP_CD = new String[] {""} ;
      P002X2_A318TBT12_CRF_ITEM_GRP_DIV = new String[] {""} ;
      P002X2_A317TBT12_CRF_ID = new short[1] ;
      P002X2_A316TBT12_SUBJECT_ID = new int[1] ;
      P002X2_A315TBT12_STUDY_ID = new long[1] ;
      P002X2_A327TBT12_UPD_CNT = new long[1] ;
      P002X2_n327TBT12_UPD_CNT = new boolean[] {false} ;
      P002X2_A326TBT12_UPD_PROG_NM = new String[] {""} ;
      P002X2_n326TBT12_UPD_PROG_NM = new boolean[] {false} ;
      P002X2_A325TBT12_UPD_USER_ID = new String[] {""} ;
      P002X2_n325TBT12_UPD_USER_ID = new boolean[] {false} ;
      P002X2_A324TBT12_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P002X2_n324TBT12_UPD_DATETIME = new boolean[] {false} ;
      P002X2_A323TBT12_CRT_PROG_NM = new String[] {""} ;
      P002X2_n323TBT12_CRT_PROG_NM = new boolean[] {false} ;
      P002X2_A322TBT12_CRT_USER_ID = new String[] {""} ;
      P002X2_n322TBT12_CRT_USER_ID = new boolean[] {false} ;
      P002X2_A321TBT12_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P002X2_n321TBT12_CRT_DATETIME = new boolean[] {false} ;
      P002X2_A328TBT12_DEL_FLG = new String[] {""} ;
      P002X2_n328TBT12_DEL_FLG = new boolean[] {false} ;
      P002X2_A587TBT12_EDIT_FLG = new String[] {""} ;
      P002X2_n587TBT12_EDIT_FLG = new boolean[] {false} ;
      P002X2_A320TBT12_CRF_VALUE = new String[] {""} ;
      P002X2_n320TBT12_CRF_VALUE = new boolean[] {false} ;
      A326TBT12_UPD_PROG_NM = "" ;
      A325TBT12_UPD_USER_ID = "" ;
      A324TBT12_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A323TBT12_CRT_PROG_NM = "" ;
      A322TBT12_CRT_USER_ID = "" ;
      A321TBT12_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A328TBT12_DEL_FLG = "" ;
      A587TBT12_EDIT_FLG = "" ;
      A320TBT12_CRF_VALUE = "" ;
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
      AV21W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV22W_MSG = "" ;
      AV26Pgmname = "" ;
      GXv_SdtB808_SD01_EXTRA_INFO23 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int24 = new short [1] ;
      GXv_char22 = new String [1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b599_pc17_crf_result_res__default(),
         new Object[] {
             new Object[] {
            P002X2_A319TBT12_CRF_ITEM_GRP_CD, P002X2_A318TBT12_CRF_ITEM_GRP_DIV, P002X2_A317TBT12_CRF_ID, P002X2_A316TBT12_SUBJECT_ID, P002X2_A315TBT12_STUDY_ID, P002X2_A327TBT12_UPD_CNT, P002X2_n327TBT12_UPD_CNT, P002X2_A326TBT12_UPD_PROG_NM, P002X2_n326TBT12_UPD_PROG_NM, P002X2_A325TBT12_UPD_USER_ID,
            P002X2_n325TBT12_UPD_USER_ID, P002X2_A324TBT12_UPD_DATETIME, P002X2_n324TBT12_UPD_DATETIME, P002X2_A323TBT12_CRT_PROG_NM, P002X2_n323TBT12_CRT_PROG_NM, P002X2_A322TBT12_CRT_USER_ID, P002X2_n322TBT12_CRT_USER_ID, P002X2_A321TBT12_CRT_DATETIME, P002X2_n321TBT12_CRT_DATETIME, P002X2_A328TBT12_DEL_FLG,
            P002X2_n328TBT12_DEL_FLG, P002X2_A587TBT12_EDIT_FLG, P002X2_n587TBT12_EDIT_FLG, P002X2_A320TBT12_CRF_VALUE, P002X2_n320TBT12_CRF_VALUE
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV26Pgmname = "B599_PC17_CRF_RESULT_RES" ;
      /* GeneXus formulas. */
      AV26Pgmname = "B599_PC17_CRF_RESULT_RES" ;
      Gx_err = (short)(0) ;
   }

   private byte AV25GXLvl34 ;
   private short AV14W_RTN_CD ;
   private short AV13W_CRF_ID ;
   private short A317TBT12_CRF_ID ;
   private short GXv_int24[] ;
   private short Gx_err ;
   private int AV18W_SUBJECT_ID ;
   private int A316TBT12_SUBJECT_ID ;
   private int GXActiveErrHndl ;
   private long AV11P_STUDY_ID ;
   private long A315TBT12_STUDY_ID ;
   private long A327TBT12_UPD_CNT ;
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
   private String AV26Pgmname ;
   private String GXv_char22[] ;
   private String Gx_emsg ;
   private java.util.Date A324TBT12_UPD_DATETIME ;
   private java.util.Date A321TBT12_CRT_DATETIME ;
   private boolean returnInSub ;
   private boolean n327TBT12_UPD_CNT ;
   private boolean n326TBT12_UPD_PROG_NM ;
   private boolean n325TBT12_UPD_USER_ID ;
   private boolean n324TBT12_UPD_DATETIME ;
   private boolean n323TBT12_CRT_PROG_NM ;
   private boolean n322TBT12_CRT_USER_ID ;
   private boolean n321TBT12_CRT_DATETIME ;
   private boolean n328TBT12_DEL_FLG ;
   private boolean n587TBT12_EDIT_FLG ;
   private boolean n320TBT12_CRF_VALUE ;
   private String AV12P_SUBJECT_ID ;
   private String AV8P_CRF_ID ;
   private String AV10P_CRF_ITEM_GRP_DIV ;
   private String AV9P_CRF_ITEM_GRP_CD ;
   private String AV16W_RTN_MSG ;
   private String AV19C_APP_ID ;
   private String A318TBT12_CRF_ITEM_GRP_DIV ;
   private String A319TBT12_CRF_ITEM_GRP_CD ;
   private String A326TBT12_UPD_PROG_NM ;
   private String A325TBT12_UPD_USER_ID ;
   private String A323TBT12_CRT_PROG_NM ;
   private String A322TBT12_CRT_USER_ID ;
   private String A328TBT12_DEL_FLG ;
   private String A587TBT12_EDIT_FLG ;
   private String A320TBT12_CRF_VALUE ;
   private String AV17W_STR ;
   private String AV22W_MSG ;
   private GxObjectCollection[] aP5 ;
   private short[] aP6 ;
   private String[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P002X2_A319TBT12_CRF_ITEM_GRP_CD ;
   private String[] P002X2_A318TBT12_CRF_ITEM_GRP_DIV ;
   private short[] P002X2_A317TBT12_CRF_ID ;
   private int[] P002X2_A316TBT12_SUBJECT_ID ;
   private long[] P002X2_A315TBT12_STUDY_ID ;
   private long[] P002X2_A327TBT12_UPD_CNT ;
   private boolean[] P002X2_n327TBT12_UPD_CNT ;
   private String[] P002X2_A326TBT12_UPD_PROG_NM ;
   private boolean[] P002X2_n326TBT12_UPD_PROG_NM ;
   private String[] P002X2_A325TBT12_UPD_USER_ID ;
   private boolean[] P002X2_n325TBT12_UPD_USER_ID ;
   private java.util.Date[] P002X2_A324TBT12_UPD_DATETIME ;
   private boolean[] P002X2_n324TBT12_UPD_DATETIME ;
   private String[] P002X2_A323TBT12_CRT_PROG_NM ;
   private boolean[] P002X2_n323TBT12_CRT_PROG_NM ;
   private String[] P002X2_A322TBT12_CRT_USER_ID ;
   private boolean[] P002X2_n322TBT12_CRT_USER_ID ;
   private java.util.Date[] P002X2_A321TBT12_CRT_DATETIME ;
   private boolean[] P002X2_n321TBT12_CRT_DATETIME ;
   private String[] P002X2_A328TBT12_DEL_FLG ;
   private boolean[] P002X2_n328TBT12_DEL_FLG ;
   private String[] P002X2_A587TBT12_EDIT_FLG ;
   private boolean[] P002X2_n587TBT12_EDIT_FLG ;
   private String[] P002X2_A320TBT12_CRF_VALUE ;
   private boolean[] P002X2_n320TBT12_CRF_VALUE ;
   private GxObjectCollection AV15W_RTN_CSV ;
   private SdtB808_SD01_EXTRA_INFO AV20W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO23[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV21W_PARMS_ITEM ;
}

final  class b599_pc17_crf_result_res__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P002X2( com.genexus.internet.HttpContext httpContext ,
                                          String AV12P_SUBJECT_ID ,
                                          String AV8P_CRF_ID ,
                                          String AV10P_CRF_ITEM_GRP_DIV ,
                                          String AV9P_CRF_ITEM_GRP_CD ,
                                          int A316TBT12_SUBJECT_ID ,
                                          int AV18W_SUBJECT_ID ,
                                          short A317TBT12_CRF_ID ,
                                          short AV13W_CRF_ID ,
                                          String A318TBT12_CRF_ITEM_GRP_DIV ,
                                          String A319TBT12_CRF_ITEM_GRP_CD ,
                                          long AV11P_STUDY_ID ,
                                          long A315TBT12_STUDY_ID )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int25 ;
      GXv_int25 = new byte [5] ;
      Object[] GXv_Object26 ;
      GXv_Object26 = new Object [2] ;
      Gx_ope = "Declare" ;
      Gx_etb = "TBT12_CRF_RESULT" ;
      scmdbuf = "SELECT `TBT12_CRF_ITEM_GRP_CD`, `TBT12_CRF_ITEM_GRP_DIV`, `TBT12_CRF_ID`, `TBT12_SUBJECT_ID`," ;
      scmdbuf = scmdbuf + " `TBT12_STUDY_ID`, `TBT12_UPD_CNT`, `TBT12_UPD_PROG_NM`, `TBT12_UPD_USER_ID`, `TBT12_UPD_DATETIME`," ;
      scmdbuf = scmdbuf + " `TBT12_CRT_PROG_NM`, `TBT12_CRT_USER_ID`, `TBT12_CRT_DATETIME`, `TBT12_DEL_FLG`," ;
      scmdbuf = scmdbuf + " `TBT12_EDIT_FLG`, `TBT12_CRF_VALUE` FROM `TBT12_CRF_RESULT`" ;
      scmdbuf = scmdbuf + " WHERE (`TBT12_STUDY_ID` = ?)" ;
      if ( ! (GXutil.strcmp("", AV12P_SUBJECT_ID)==0) )
      {
         sWhereString = sWhereString + " and (`TBT12_SUBJECT_ID` = ?)" ;
      }
      else
      {
         GXv_int25[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV8P_CRF_ID)==0) )
      {
         sWhereString = sWhereString + " and (`TBT12_CRF_ID` = ?)" ;
      }
      else
      {
         GXv_int25[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV10P_CRF_ITEM_GRP_DIV)==0) )
      {
         sWhereString = sWhereString + " and (`TBT12_CRF_ITEM_GRP_DIV` = ?)" ;
      }
      else
      {
         GXv_int25[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV9P_CRF_ITEM_GRP_CD)==0) )
      {
         sWhereString = sWhereString + " and (`TBT12_CRF_ITEM_GRP_CD` = ?)" ;
      }
      else
      {
         GXv_int25[4] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TBT12_STUDY_ID`, `TBT12_SUBJECT_ID`, `TBT12_CRF_ID`, `TBT12_CRF_ITEM_GRP_DIV`, `TBT12_CRF_ITEM_GRP_CD`" ;
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
                  return conditional_P002X2(httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).longValue() , ((Number) dynConstraints[11]).longValue() );
      }
      return super.getDynamicStatement(cursor, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P002X2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
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
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((long[]) buf[4])[0] = rslt.getLong(5) ;
               ((long[]) buf[5])[0] = rslt.getLong(6) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(9) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(12) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
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
                  stmt.setLong(sIdx, ((Number) parms[5]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[6]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[7]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[8], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[9], 50);
               }
               break;
      }
   }

}

