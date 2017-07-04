/*
               File: B599_PC03_CRF_COND_RES
        Description: CRFèåèÉ}ÉXÉ^éÊìæ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:51:54.9
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b599_pc03_crf_cond_res extends GXProcedure
{
   public b599_pc03_crf_cond_res( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b599_pc03_crf_cond_res.class ), "" );
   }

   public b599_pc03_crf_cond_res( int remoteHandle ,
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
      b599_pc03_crf_cond_res.this.AV10P_STUDY_ID = aP0;
      b599_pc03_crf_cond_res.this.AV9P_CRF_ID = aP1;
      b599_pc03_crf_cond_res.this.AV8P_COND_NO = aP2;
      b599_pc03_crf_cond_res.this.AV14W_RTN_CSV = aP3[0];
      b599_pc03_crf_cond_res.this.aP5 = new String[] {""};
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
      b599_pc03_crf_cond_res.this.AV10P_STUDY_ID = aP0;
      b599_pc03_crf_cond_res.this.AV9P_CRF_ID = aP1;
      b599_pc03_crf_cond_res.this.AV8P_COND_NO = aP2;
      b599_pc03_crf_cond_res.this.AV14W_RTN_CSV = aP3[0];
      this.aP3 = aP3;
      b599_pc03_crf_cond_res.this.aP4 = aP4;
      b599_pc03_crf_cond_res.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV17C_APP_ID = "B599" ;
      AV13W_RTN_CD = (short)(0) ;
      AV15W_RTN_MSG = "" ;
      AV18W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV18W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV17C_APP_ID );
      /* Execute user subroutine: S1173 */
      S1173 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV12W_CRF_ID = (short)(GXutil.lval( AV9P_CRF_ID)) ;
      AV11W_COND_NO = (short)(GXutil.lval( AV8P_COND_NO)) ;
      AV23GXLvl34 = (byte)(0) ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV9P_CRF_ID ,
                                           AV8P_COND_NO ,
                                           new Short(A247TBM33_CRF_ID) ,
                                           new Short(AV12W_CRF_ID) ,
                                           new Short(A248TBM33_COND_NO) ,
                                           new Short(AV11W_COND_NO) ,
                                           A251TBM33_DEL_FLG ,
                                           new Long(AV10P_STUDY_ID) ,
                                           new Long(A246TBM33_STUDY_ID) },
                                           new int[] {
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.LONG
                                           }
      });
      Gx_ope = "Fetch" ;
      Gx_etb = "TBM33_CRF_COND" ;
      /* Using cursor P001X2 */
      pr_default.execute(0, new Object[] {new Long(AV10P_STUDY_ID), new Short(AV12W_CRF_ID), new Short(AV11W_COND_NO)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A246TBM33_STUDY_ID = P001X2_A246TBM33_STUDY_ID[0] ;
         A251TBM33_DEL_FLG = P001X2_A251TBM33_DEL_FLG[0] ;
         n251TBM33_DEL_FLG = P001X2_n251TBM33_DEL_FLG[0] ;
         A248TBM33_COND_NO = P001X2_A248TBM33_COND_NO[0] ;
         A247TBM33_CRF_ID = P001X2_A247TBM33_CRF_ID[0] ;
         A258TBM33_UPD_CNT = P001X2_A258TBM33_UPD_CNT[0] ;
         n258TBM33_UPD_CNT = P001X2_n258TBM33_UPD_CNT[0] ;
         A257TBM33_UPD_PROG_NM = P001X2_A257TBM33_UPD_PROG_NM[0] ;
         n257TBM33_UPD_PROG_NM = P001X2_n257TBM33_UPD_PROG_NM[0] ;
         A256TBM33_UPD_USER_ID = P001X2_A256TBM33_UPD_USER_ID[0] ;
         n256TBM33_UPD_USER_ID = P001X2_n256TBM33_UPD_USER_ID[0] ;
         A255TBM33_UPD_DATETIME = P001X2_A255TBM33_UPD_DATETIME[0] ;
         n255TBM33_UPD_DATETIME = P001X2_n255TBM33_UPD_DATETIME[0] ;
         A254TBM33_CRT_PROG_NM = P001X2_A254TBM33_CRT_PROG_NM[0] ;
         n254TBM33_CRT_PROG_NM = P001X2_n254TBM33_CRT_PROG_NM[0] ;
         A253TBM33_CRT_USER_ID = P001X2_A253TBM33_CRT_USER_ID[0] ;
         n253TBM33_CRT_USER_ID = P001X2_n253TBM33_CRT_USER_ID[0] ;
         A252TBM33_CRT_DATETIME = P001X2_A252TBM33_CRT_DATETIME[0] ;
         n252TBM33_CRT_DATETIME = P001X2_n252TBM33_CRT_DATETIME[0] ;
         A611TBM33_NUMERIC_RANGE_FLG = P001X2_A611TBM33_NUMERIC_RANGE_FLG[0] ;
         n611TBM33_NUMERIC_RANGE_FLG = P001X2_n611TBM33_NUMERIC_RANGE_FLG[0] ;
         A610TBM33_REQUIRED_INPUT_FLG = P001X2_A610TBM33_REQUIRED_INPUT_FLG[0] ;
         n610TBM33_REQUIRED_INPUT_FLG = P001X2_n610TBM33_REQUIRED_INPUT_FLG[0] ;
         A554TBM33_ENABLED_FLG = P001X2_A554TBM33_ENABLED_FLG[0] ;
         n554TBM33_ENABLED_FLG = P001X2_n554TBM33_ENABLED_FLG[0] ;
         A383TBM33_ERR_MSG = P001X2_A383TBM33_ERR_MSG[0] ;
         n383TBM33_ERR_MSG = P001X2_n383TBM33_ERR_MSG[0] ;
         A382TBM33_ERR_DIV = P001X2_A382TBM33_ERR_DIV[0] ;
         n382TBM33_ERR_DIV = P001X2_n382TBM33_ERR_DIV[0] ;
         A381TBM33_CRF_ITEM_CD = P001X2_A381TBM33_CRF_ITEM_CD[0] ;
         n381TBM33_CRF_ITEM_CD = P001X2_n381TBM33_CRF_ITEM_CD[0] ;
         A380TBM33_COND_DIV = P001X2_A380TBM33_COND_DIV[0] ;
         n380TBM33_COND_DIV = P001X2_n380TBM33_COND_DIV[0] ;
         A249TBM33_EXPRESSION = P001X2_A249TBM33_EXPRESSION[0] ;
         n249TBM33_EXPRESSION = P001X2_n249TBM33_EXPRESSION[0] ;
         A379TBM33_COND_NM = P001X2_A379TBM33_COND_NM[0] ;
         n379TBM33_COND_NM = P001X2_n379TBM33_COND_NM[0] ;
         A250TBM33_PRIOR_NO = P001X2_A250TBM33_PRIOR_NO[0] ;
         n250TBM33_PRIOR_NO = P001X2_n250TBM33_PRIOR_NO[0] ;
         AV23GXLvl34 = (byte)(1) ;
         GXt_char1 = AV16W_STR ;
         GXv_char2[0] = GXt_char1 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A379TBM33_COND_NM, GXv_char2) ;
         b599_pc03_crf_cond_res.this.GXt_char1 = GXv_char2[0] ;
         GXt_char3 = AV16W_STR ;
         GXv_char4[0] = GXt_char3 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A249TBM33_EXPRESSION, GXv_char4) ;
         b599_pc03_crf_cond_res.this.GXt_char3 = GXv_char4[0] ;
         GXt_char5 = AV16W_STR ;
         GXv_char6[0] = GXt_char5 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A380TBM33_COND_DIV, GXv_char6) ;
         b599_pc03_crf_cond_res.this.GXt_char5 = GXv_char6[0] ;
         GXt_char7 = AV16W_STR ;
         GXv_char8[0] = GXt_char7 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A381TBM33_CRF_ITEM_CD, GXv_char8) ;
         b599_pc03_crf_cond_res.this.GXt_char7 = GXv_char8[0] ;
         GXt_char9 = AV16W_STR ;
         GXv_char10[0] = GXt_char9 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A382TBM33_ERR_DIV, GXv_char10) ;
         b599_pc03_crf_cond_res.this.GXt_char9 = GXv_char10[0] ;
         GXt_char11 = AV16W_STR ;
         GXv_char12[0] = GXt_char11 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A383TBM33_ERR_MSG, GXv_char12) ;
         b599_pc03_crf_cond_res.this.GXt_char11 = GXv_char12[0] ;
         GXt_char13 = AV16W_STR ;
         GXv_char14[0] = GXt_char13 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A554TBM33_ENABLED_FLG, GXv_char14) ;
         b599_pc03_crf_cond_res.this.GXt_char13 = GXv_char14[0] ;
         GXt_char15 = AV16W_STR ;
         GXv_char16[0] = GXt_char15 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A610TBM33_REQUIRED_INPUT_FLG, GXv_char16) ;
         b599_pc03_crf_cond_res.this.GXt_char15 = GXv_char16[0] ;
         GXt_char17 = AV16W_STR ;
         GXv_char18[0] = GXt_char17 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A611TBM33_NUMERIC_RANGE_FLG, GXv_char18) ;
         b599_pc03_crf_cond_res.this.GXt_char17 = GXv_char18[0] ;
         GXt_char19 = AV16W_STR ;
         GXv_char20[0] = GXt_char19 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A251TBM33_DEL_FLG, GXv_char20) ;
         b599_pc03_crf_cond_res.this.GXt_char19 = GXv_char20[0] ;
         GXt_char21 = AV16W_STR ;
         GXv_char22[0] = GXt_char21 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A252TBM33_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char22) ;
         b599_pc03_crf_cond_res.this.GXt_char21 = GXv_char22[0] ;
         GXt_char23 = AV16W_STR ;
         GXv_char24[0] = GXt_char23 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A253TBM33_CRT_USER_ID, GXv_char24) ;
         b599_pc03_crf_cond_res.this.GXt_char23 = GXv_char24[0] ;
         GXt_char25 = AV16W_STR ;
         GXv_char26[0] = GXt_char25 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A254TBM33_CRT_PROG_NM, GXv_char26) ;
         b599_pc03_crf_cond_res.this.GXt_char25 = GXv_char26[0] ;
         GXt_char27 = AV16W_STR ;
         GXv_char28[0] = GXt_char27 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A255TBM33_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char28) ;
         b599_pc03_crf_cond_res.this.GXt_char27 = GXv_char28[0] ;
         GXt_char29 = AV16W_STR ;
         GXv_char30[0] = GXt_char29 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A256TBM33_UPD_USER_ID, GXv_char30) ;
         b599_pc03_crf_cond_res.this.GXt_char29 = GXv_char30[0] ;
         GXt_char31 = AV16W_STR ;
         GXv_char32[0] = GXt_char31 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A257TBM33_UPD_PROG_NM, GXv_char32) ;
         b599_pc03_crf_cond_res.this.GXt_char31 = GXv_char32[0] ;
         AV16W_STR = GXutil.trim( GXutil.str( A246TBM33_STUDY_ID, 10, 0)) + "," + GXutil.trim( GXutil.str( A247TBM33_CRF_ID, 10, 0)) + "," + GXutil.trim( GXutil.str( A248TBM33_COND_NO, 10, 0)) + "," + GXt_char1 + "," + GXt_char3 + "," + GXt_char5 + "," + GXt_char7 + "," + GXutil.trim( GXutil.str( A250TBM33_PRIOR_NO, 10, 0)) + "," + GXt_char9 + "," + GXt_char11 + "," + GXt_char13 + "," + GXt_char15 + "," + GXt_char17 + "," + GXt_char19 + "," + GXt_char21 + "," + GXt_char23 + "," + GXt_char25 + "," + GXt_char27 + "," + GXt_char29 + "," + GXt_char31 + "," + GXutil.trim( GXutil.str( A258TBM33_UPD_CNT, 10, 0)) ;
         AV14W_RTN_CSV.add(AV16W_STR, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV23GXLvl34 == 0 )
      {
         AV13W_RTN_CD = (short)(1) ;
         GXt_char31 = AV15W_RTN_MSG ;
         GXv_char32[0] = GXt_char31 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char32) ;
         b599_pc03_crf_cond_res.this.GXt_char31 = GXv_char32[0] ;
         AV15W_RTN_MSG = GXt_char31 ;
      }
      cleanup();
   }

   public void S1173( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      AV18W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      AV19W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV19W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_STUDY_ID" );
      AV19W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( GXutil.trim( GXutil.str( AV10P_STUDY_ID, 10, 0)) );
      AV18W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV19W_PARMS_ITEM, 0);
      AV19W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV19W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_CRF_ID" );
      AV19W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV9P_CRF_ID );
      AV18W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV19W_PARMS_ITEM, 0);
      AV19W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV19W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_COND_NO" );
      AV19W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV8P_COND_NO );
      AV18W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV19W_PARMS_ITEM, 0);
      AV20W_MSG = "SUB_INIT" ;
      GXv_SdtB808_SD01_EXTRA_INFO33[0] = AV18W_EXTRA_INFO;
      GXv_int34[0] = AV13W_RTN_CD ;
      GXv_char32[0] = AV15W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV24Pgmname, (short)(1), AV20W_MSG, GXv_SdtB808_SD01_EXTRA_INFO33, GXv_int34, GXv_char32) ;
      AV18W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO33[0] ;
      b599_pc03_crf_cond_res.this.AV13W_RTN_CD = GXv_int34[0] ;
      b599_pc03_crf_cond_res.this.AV15W_RTN_MSG = GXv_char32[0] ;
   }

   public void S12101( )
   {
      /* 'SUB_ERROR' Routine */
      AV20W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO33[0] = AV18W_EXTRA_INFO;
      GXv_int34[0] = AV13W_RTN_CD ;
      GXv_char32[0] = AV15W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV24Pgmname, (short)(0), AV20W_MSG, GXv_SdtB808_SD01_EXTRA_INFO33, GXv_int34, GXv_char32) ;
      AV18W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO33[0] ;
      b599_pc03_crf_cond_res.this.AV13W_RTN_CD = GXv_int34[0] ;
      b599_pc03_crf_cond_res.this.AV15W_RTN_MSG = GXv_char32[0] ;
      context.globals.Gx_eop = (byte)(0) ;
   }

   protected void cleanup( )
   {
      this.aP3[0] = b599_pc03_crf_cond_res.this.AV14W_RTN_CSV;
      this.aP4[0] = b599_pc03_crf_cond_res.this.AV13W_RTN_CD;
      this.aP5[0] = b599_pc03_crf_cond_res.this.AV15W_RTN_MSG;
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
                  /* Execute user subroutine: S12101 */
                  S12101 ();
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
      AV15W_RTN_MSG = "" ;
      AV17C_APP_ID = "" ;
      AV18W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      scmdbuf = "" ;
      A251TBM33_DEL_FLG = "" ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      P001X2_A246TBM33_STUDY_ID = new long[1] ;
      P001X2_A251TBM33_DEL_FLG = new String[] {""} ;
      P001X2_n251TBM33_DEL_FLG = new boolean[] {false} ;
      P001X2_A248TBM33_COND_NO = new short[1] ;
      P001X2_A247TBM33_CRF_ID = new short[1] ;
      P001X2_A258TBM33_UPD_CNT = new long[1] ;
      P001X2_n258TBM33_UPD_CNT = new boolean[] {false} ;
      P001X2_A257TBM33_UPD_PROG_NM = new String[] {""} ;
      P001X2_n257TBM33_UPD_PROG_NM = new boolean[] {false} ;
      P001X2_A256TBM33_UPD_USER_ID = new String[] {""} ;
      P001X2_n256TBM33_UPD_USER_ID = new boolean[] {false} ;
      P001X2_A255TBM33_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P001X2_n255TBM33_UPD_DATETIME = new boolean[] {false} ;
      P001X2_A254TBM33_CRT_PROG_NM = new String[] {""} ;
      P001X2_n254TBM33_CRT_PROG_NM = new boolean[] {false} ;
      P001X2_A253TBM33_CRT_USER_ID = new String[] {""} ;
      P001X2_n253TBM33_CRT_USER_ID = new boolean[] {false} ;
      P001X2_A252TBM33_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P001X2_n252TBM33_CRT_DATETIME = new boolean[] {false} ;
      P001X2_A611TBM33_NUMERIC_RANGE_FLG = new String[] {""} ;
      P001X2_n611TBM33_NUMERIC_RANGE_FLG = new boolean[] {false} ;
      P001X2_A610TBM33_REQUIRED_INPUT_FLG = new String[] {""} ;
      P001X2_n610TBM33_REQUIRED_INPUT_FLG = new boolean[] {false} ;
      P001X2_A554TBM33_ENABLED_FLG = new String[] {""} ;
      P001X2_n554TBM33_ENABLED_FLG = new boolean[] {false} ;
      P001X2_A383TBM33_ERR_MSG = new String[] {""} ;
      P001X2_n383TBM33_ERR_MSG = new boolean[] {false} ;
      P001X2_A382TBM33_ERR_DIV = new String[] {""} ;
      P001X2_n382TBM33_ERR_DIV = new boolean[] {false} ;
      P001X2_A381TBM33_CRF_ITEM_CD = new String[] {""} ;
      P001X2_n381TBM33_CRF_ITEM_CD = new boolean[] {false} ;
      P001X2_A380TBM33_COND_DIV = new String[] {""} ;
      P001X2_n380TBM33_COND_DIV = new boolean[] {false} ;
      P001X2_A249TBM33_EXPRESSION = new String[] {""} ;
      P001X2_n249TBM33_EXPRESSION = new boolean[] {false} ;
      P001X2_A379TBM33_COND_NM = new String[] {""} ;
      P001X2_n379TBM33_COND_NM = new boolean[] {false} ;
      P001X2_A250TBM33_PRIOR_NO = new byte[1] ;
      P001X2_n250TBM33_PRIOR_NO = new boolean[] {false} ;
      A257TBM33_UPD_PROG_NM = "" ;
      A256TBM33_UPD_USER_ID = "" ;
      A255TBM33_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A254TBM33_CRT_PROG_NM = "" ;
      A253TBM33_CRT_USER_ID = "" ;
      A252TBM33_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A611TBM33_NUMERIC_RANGE_FLG = "" ;
      A610TBM33_REQUIRED_INPUT_FLG = "" ;
      A554TBM33_ENABLED_FLG = "" ;
      A383TBM33_ERR_MSG = "" ;
      A382TBM33_ERR_DIV = "" ;
      A381TBM33_CRF_ITEM_CD = "" ;
      A380TBM33_COND_DIV = "" ;
      A249TBM33_EXPRESSION = "" ;
      A379TBM33_COND_NM = "" ;
      AV16W_STR = "" ;
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
      AV19W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV20W_MSG = "" ;
      AV24Pgmname = "" ;
      GXv_SdtB808_SD01_EXTRA_INFO33 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int34 = new short [1] ;
      GXv_char32 = new String [1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b599_pc03_crf_cond_res__default(),
         new Object[] {
             new Object[] {
            P001X2_A246TBM33_STUDY_ID, P001X2_A251TBM33_DEL_FLG, P001X2_n251TBM33_DEL_FLG, P001X2_A248TBM33_COND_NO, P001X2_A247TBM33_CRF_ID, P001X2_A258TBM33_UPD_CNT, P001X2_n258TBM33_UPD_CNT, P001X2_A257TBM33_UPD_PROG_NM, P001X2_n257TBM33_UPD_PROG_NM, P001X2_A256TBM33_UPD_USER_ID,
            P001X2_n256TBM33_UPD_USER_ID, P001X2_A255TBM33_UPD_DATETIME, P001X2_n255TBM33_UPD_DATETIME, P001X2_A254TBM33_CRT_PROG_NM, P001X2_n254TBM33_CRT_PROG_NM, P001X2_A253TBM33_CRT_USER_ID, P001X2_n253TBM33_CRT_USER_ID, P001X2_A252TBM33_CRT_DATETIME, P001X2_n252TBM33_CRT_DATETIME, P001X2_A611TBM33_NUMERIC_RANGE_FLG,
            P001X2_n611TBM33_NUMERIC_RANGE_FLG, P001X2_A610TBM33_REQUIRED_INPUT_FLG, P001X2_n610TBM33_REQUIRED_INPUT_FLG, P001X2_A554TBM33_ENABLED_FLG, P001X2_n554TBM33_ENABLED_FLG, P001X2_A383TBM33_ERR_MSG, P001X2_n383TBM33_ERR_MSG, P001X2_A382TBM33_ERR_DIV, P001X2_n382TBM33_ERR_DIV, P001X2_A381TBM33_CRF_ITEM_CD,
            P001X2_n381TBM33_CRF_ITEM_CD, P001X2_A380TBM33_COND_DIV, P001X2_n380TBM33_COND_DIV, P001X2_A249TBM33_EXPRESSION, P001X2_n249TBM33_EXPRESSION, P001X2_A379TBM33_COND_NM, P001X2_n379TBM33_COND_NM, P001X2_A250TBM33_PRIOR_NO, P001X2_n250TBM33_PRIOR_NO
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV24Pgmname = "B599_PC03_CRF_COND_RES" ;
      /* GeneXus formulas. */
      AV24Pgmname = "B599_PC03_CRF_COND_RES" ;
      Gx_err = (short)(0) ;
   }

   private byte AV23GXLvl34 ;
   private byte A250TBM33_PRIOR_NO ;
   private short AV13W_RTN_CD ;
   private short AV12W_CRF_ID ;
   private short AV11W_COND_NO ;
   private short A247TBM33_CRF_ID ;
   private short A248TBM33_COND_NO ;
   private short GXv_int34[] ;
   private short Gx_err ;
   private int GXActiveErrHndl ;
   private long AV10P_STUDY_ID ;
   private long A246TBM33_STUDY_ID ;
   private long A258TBM33_UPD_CNT ;
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
   private String AV24Pgmname ;
   private String GXv_char32[] ;
   private String Gx_emsg ;
   private java.util.Date A255TBM33_UPD_DATETIME ;
   private java.util.Date A252TBM33_CRT_DATETIME ;
   private boolean returnInSub ;
   private boolean n251TBM33_DEL_FLG ;
   private boolean n258TBM33_UPD_CNT ;
   private boolean n257TBM33_UPD_PROG_NM ;
   private boolean n256TBM33_UPD_USER_ID ;
   private boolean n255TBM33_UPD_DATETIME ;
   private boolean n254TBM33_CRT_PROG_NM ;
   private boolean n253TBM33_CRT_USER_ID ;
   private boolean n252TBM33_CRT_DATETIME ;
   private boolean n611TBM33_NUMERIC_RANGE_FLG ;
   private boolean n610TBM33_REQUIRED_INPUT_FLG ;
   private boolean n554TBM33_ENABLED_FLG ;
   private boolean n383TBM33_ERR_MSG ;
   private boolean n382TBM33_ERR_DIV ;
   private boolean n381TBM33_CRF_ITEM_CD ;
   private boolean n380TBM33_COND_DIV ;
   private boolean n249TBM33_EXPRESSION ;
   private boolean n379TBM33_COND_NM ;
   private boolean n250TBM33_PRIOR_NO ;
   private String AV9P_CRF_ID ;
   private String AV8P_COND_NO ;
   private String AV15W_RTN_MSG ;
   private String AV17C_APP_ID ;
   private String A251TBM33_DEL_FLG ;
   private String A257TBM33_UPD_PROG_NM ;
   private String A256TBM33_UPD_USER_ID ;
   private String A254TBM33_CRT_PROG_NM ;
   private String A253TBM33_CRT_USER_ID ;
   private String A611TBM33_NUMERIC_RANGE_FLG ;
   private String A610TBM33_REQUIRED_INPUT_FLG ;
   private String A554TBM33_ENABLED_FLG ;
   private String A383TBM33_ERR_MSG ;
   private String A382TBM33_ERR_DIV ;
   private String A381TBM33_CRF_ITEM_CD ;
   private String A380TBM33_COND_DIV ;
   private String A249TBM33_EXPRESSION ;
   private String A379TBM33_COND_NM ;
   private String AV16W_STR ;
   private String AV20W_MSG ;
   private GxObjectCollection[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private long[] P001X2_A246TBM33_STUDY_ID ;
   private String[] P001X2_A251TBM33_DEL_FLG ;
   private boolean[] P001X2_n251TBM33_DEL_FLG ;
   private short[] P001X2_A248TBM33_COND_NO ;
   private short[] P001X2_A247TBM33_CRF_ID ;
   private long[] P001X2_A258TBM33_UPD_CNT ;
   private boolean[] P001X2_n258TBM33_UPD_CNT ;
   private String[] P001X2_A257TBM33_UPD_PROG_NM ;
   private boolean[] P001X2_n257TBM33_UPD_PROG_NM ;
   private String[] P001X2_A256TBM33_UPD_USER_ID ;
   private boolean[] P001X2_n256TBM33_UPD_USER_ID ;
   private java.util.Date[] P001X2_A255TBM33_UPD_DATETIME ;
   private boolean[] P001X2_n255TBM33_UPD_DATETIME ;
   private String[] P001X2_A254TBM33_CRT_PROG_NM ;
   private boolean[] P001X2_n254TBM33_CRT_PROG_NM ;
   private String[] P001X2_A253TBM33_CRT_USER_ID ;
   private boolean[] P001X2_n253TBM33_CRT_USER_ID ;
   private java.util.Date[] P001X2_A252TBM33_CRT_DATETIME ;
   private boolean[] P001X2_n252TBM33_CRT_DATETIME ;
   private String[] P001X2_A611TBM33_NUMERIC_RANGE_FLG ;
   private boolean[] P001X2_n611TBM33_NUMERIC_RANGE_FLG ;
   private String[] P001X2_A610TBM33_REQUIRED_INPUT_FLG ;
   private boolean[] P001X2_n610TBM33_REQUIRED_INPUT_FLG ;
   private String[] P001X2_A554TBM33_ENABLED_FLG ;
   private boolean[] P001X2_n554TBM33_ENABLED_FLG ;
   private String[] P001X2_A383TBM33_ERR_MSG ;
   private boolean[] P001X2_n383TBM33_ERR_MSG ;
   private String[] P001X2_A382TBM33_ERR_DIV ;
   private boolean[] P001X2_n382TBM33_ERR_DIV ;
   private String[] P001X2_A381TBM33_CRF_ITEM_CD ;
   private boolean[] P001X2_n381TBM33_CRF_ITEM_CD ;
   private String[] P001X2_A380TBM33_COND_DIV ;
   private boolean[] P001X2_n380TBM33_COND_DIV ;
   private String[] P001X2_A249TBM33_EXPRESSION ;
   private boolean[] P001X2_n249TBM33_EXPRESSION ;
   private String[] P001X2_A379TBM33_COND_NM ;
   private boolean[] P001X2_n379TBM33_COND_NM ;
   private byte[] P001X2_A250TBM33_PRIOR_NO ;
   private boolean[] P001X2_n250TBM33_PRIOR_NO ;
   private GxObjectCollection AV14W_RTN_CSV ;
   private SdtB808_SD01_EXTRA_INFO AV18W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO33[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV19W_PARMS_ITEM ;
}

final  class b599_pc03_crf_cond_res__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P001X2( com.genexus.internet.HttpContext httpContext ,
                                          String AV9P_CRF_ID ,
                                          String AV8P_COND_NO ,
                                          short A247TBM33_CRF_ID ,
                                          short AV12W_CRF_ID ,
                                          short A248TBM33_COND_NO ,
                                          short AV11W_COND_NO ,
                                          String A251TBM33_DEL_FLG ,
                                          long AV10P_STUDY_ID ,
                                          long A246TBM33_STUDY_ID )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int35 ;
      GXv_int35 = new byte [3] ;
      Object[] GXv_Object36 ;
      GXv_Object36 = new Object [2] ;
      Gx_ope = "Declare" ;
      Gx_etb = "TBM33_CRF_COND" ;
      scmdbuf = "SELECT `TBM33_STUDY_ID`, `TBM33_DEL_FLG`, `TBM33_COND_NO`, `TBM33_CRF_ID`, `TBM33_UPD_CNT`," ;
      scmdbuf = scmdbuf + " `TBM33_UPD_PROG_NM`, `TBM33_UPD_USER_ID`, `TBM33_UPD_DATETIME`, `TBM33_CRT_PROG_NM`," ;
      scmdbuf = scmdbuf + " `TBM33_CRT_USER_ID`, `TBM33_CRT_DATETIME`, `TBM33_NUMERIC_RANGE_FLG`, `TBM33_REQUIRED_INPUT_FLG`," ;
      scmdbuf = scmdbuf + " `TBM33_ENABLED_FLG`, `TBM33_ERR_MSG`, `TBM33_ERR_DIV`, `TBM33_CRF_ITEM_CD`, `TBM33_COND_DIV`," ;
      scmdbuf = scmdbuf + " `TBM33_EXPRESSION`, `TBM33_COND_NM`, `TBM33_PRIOR_NO` FROM `TBM33_CRF_COND`" ;
      scmdbuf = scmdbuf + " WHERE (`TBM33_STUDY_ID` = ?)" ;
      scmdbuf = scmdbuf + " and (`TBM33_DEL_FLG` = '0')" ;
      if ( ! (GXutil.strcmp("", AV9P_CRF_ID)==0) )
      {
         sWhereString = sWhereString + " and (`TBM33_CRF_ID` = ?)" ;
      }
      else
      {
         GXv_int35[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV8P_COND_NO)==0) )
      {
         sWhereString = sWhereString + " and (`TBM33_COND_NO` = ?)" ;
      }
      else
      {
         GXv_int35[2] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TBM33_STUDY_ID`, `TBM33_CRF_ID`, `TBM33_PRIOR_NO`, `TBM33_COND_NO`" ;
      GXv_Object36[0] = scmdbuf ;
      GXv_Object36[1] = GXv_int35 ;
      return GXv_Object36 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         com.genexus.internet.HttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_P001X2(httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).shortValue() , ((Number) dynConstraints[5]).shortValue() , (String)dynConstraints[6] , ((Number) dynConstraints[7]).longValue() , ((Number) dynConstraints[8]).longValue() );
      }
      return super.getDynamicStatement(cursor, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001X2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3) ;
               ((short[]) buf[4])[0] = rslt.getShort(4) ;
               ((long[]) buf[5])[0] = rslt.getLong(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((byte[]) buf[37])[0] = rslt.getByte(21) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
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
                  stmt.setShort(sIdx, ((Number) parms[4]).shortValue());
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

