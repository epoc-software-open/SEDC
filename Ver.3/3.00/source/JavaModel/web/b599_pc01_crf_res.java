/*
               File: B599_PC01_CRF_RES
        Description: CRFƒ}ƒXƒ^Žæ“¾
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:16:22.11
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b599_pc01_crf_res extends GXProcedure
{
   public b599_pc01_crf_res( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b599_pc01_crf_res.class ), "" );
   }

   public b599_pc01_crf_res( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( long aP0 ,
                             String aP1 ,
                             GxObjectCollection[] aP2 ,
                             short[] aP3 )
   {
      b599_pc01_crf_res.this.AV9P_STUDY_ID = aP0;
      b599_pc01_crf_res.this.AV8P_CRF_ID = aP1;
      b599_pc01_crf_res.this.AV12W_RTN_CSV = aP2[0];
      this.aP2 = aP2;
      b599_pc01_crf_res.this.aP3 = aP3;
      b599_pc01_crf_res.this.aP4 = aP4;
      b599_pc01_crf_res.this.aP4 = new String[] {""};
      initialize();
      privateExecute();
      return aP4[0];
   }

   public void execute( long aP0 ,
                        String aP1 ,
                        GxObjectCollection[] aP2 ,
                        short[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( long aP0 ,
                             String aP1 ,
                             GxObjectCollection[] aP2 ,
                             short[] aP3 ,
                             String[] aP4 )
   {
      b599_pc01_crf_res.this.AV9P_STUDY_ID = aP0;
      b599_pc01_crf_res.this.AV8P_CRF_ID = aP1;
      b599_pc01_crf_res.this.AV12W_RTN_CSV = aP2[0];
      this.aP2 = aP2;
      b599_pc01_crf_res.this.aP3 = aP3;
      b599_pc01_crf_res.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15C_APP_ID = "B599" ;
      AV11W_RTN_CD = (short)(0) ;
      AV13W_RTN_MSG = "" ;
      AV16W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV16W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV15C_APP_ID );
      /* Execute user subroutine: S111 */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV10W_CRF_ID = (short)(GXutil.lval( AV8P_CRF_ID)) ;
      AV21GXLvl33 = (byte)(0) ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV8P_CRF_ID ,
                                           new Short(A69TBM31_CRF_ID) ,
                                           new Short(AV10W_CRF_ID) ,
                                           A397TBM31_DEL_FLG ,
                                           new Long(AV9P_STUDY_ID) ,
                                           new Long(A68TBM31_STUDY_ID) },
                                           new int[] {
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.LONG
                                           }
      });
      Gx_ope = "Fetch" ;
      Gx_etb = "TBM31_CRF" ;
      /* Using cursor P001W2 */
      pr_default.execute(0, new Object[] {new Long(AV9P_STUDY_ID), new Short(AV10W_CRF_ID)});
      if ( Gx_err != 0 )
      {
         AV21GXLvl33 = (byte)(1) ;
      }
      while ( (pr_default.getStatus(0) != 101) )
      {
         A68TBM31_STUDY_ID = P001W2_A68TBM31_STUDY_ID[0] ;
         A397TBM31_DEL_FLG = P001W2_A397TBM31_DEL_FLG[0] ;
         n397TBM31_DEL_FLG = P001W2_n397TBM31_DEL_FLG[0] ;
         A69TBM31_CRF_ID = P001W2_A69TBM31_CRF_ID[0] ;
         A404TBM31_UPD_CNT = P001W2_A404TBM31_UPD_CNT[0] ;
         n404TBM31_UPD_CNT = P001W2_n404TBM31_UPD_CNT[0] ;
         A403TBM31_UPD_PROG_NM = P001W2_A403TBM31_UPD_PROG_NM[0] ;
         n403TBM31_UPD_PROG_NM = P001W2_n403TBM31_UPD_PROG_NM[0] ;
         A402TBM31_UPD_USER_ID = P001W2_A402TBM31_UPD_USER_ID[0] ;
         n402TBM31_UPD_USER_ID = P001W2_n402TBM31_UPD_USER_ID[0] ;
         A401TBM31_UPD_DATETIME = P001W2_A401TBM31_UPD_DATETIME[0] ;
         n401TBM31_UPD_DATETIME = P001W2_n401TBM31_UPD_DATETIME[0] ;
         A400TBM31_CRT_PROG_NM = P001W2_A400TBM31_CRT_PROG_NM[0] ;
         n400TBM31_CRT_PROG_NM = P001W2_n400TBM31_CRT_PROG_NM[0] ;
         A399TBM31_CRT_USER_ID = P001W2_A399TBM31_CRT_USER_ID[0] ;
         n399TBM31_CRT_USER_ID = P001W2_n399TBM31_CRT_USER_ID[0] ;
         A398TBM31_CRT_DATETIME = P001W2_A398TBM31_CRT_DATETIME[0] ;
         n398TBM31_CRT_DATETIME = P001W2_n398TBM31_CRT_DATETIME[0] ;
         A396TBM31_NOTE = P001W2_A396TBM31_NOTE[0] ;
         n396TBM31_NOTE = P001W2_n396TBM31_NOTE[0] ;
         A643TBM31_STATUS = P001W2_A643TBM31_STATUS[0] ;
         n643TBM31_STATUS = P001W2_n643TBM31_STATUS[0] ;
         A529TBM31_DEF_DOMAIN_CD = P001W2_A529TBM31_DEF_DOMAIN_CD[0] ;
         n529TBM31_DEF_DOMAIN_CD = P001W2_n529TBM31_DEF_DOMAIN_CD[0] ;
         A528TBM31_DEF_VISIT_NO = P001W2_A528TBM31_DEF_VISIT_NO[0] ;
         n528TBM31_DEF_VISIT_NO = P001W2_n528TBM31_DEF_VISIT_NO[0] ;
         A394TBM31_GRID_SIZE = P001W2_A394TBM31_GRID_SIZE[0] ;
         n394TBM31_GRID_SIZE = P001W2_n394TBM31_GRID_SIZE[0] ;
         A642TBM31_CRF_SNM = P001W2_A642TBM31_CRF_SNM[0] ;
         n642TBM31_CRF_SNM = P001W2_n642TBM31_CRF_SNM[0] ;
         A393TBM31_CRF_NM = P001W2_A393TBM31_CRF_NM[0] ;
         n393TBM31_CRF_NM = P001W2_n393TBM31_CRF_NM[0] ;
         A395TBM31_ORDER = P001W2_A395TBM31_ORDER[0] ;
         n395TBM31_ORDER = P001W2_n395TBM31_ORDER[0] ;
         AV21GXLvl33 = (byte)(1) ;
         GXt_char1 = AV14W_STR ;
         GXv_char2[0] = GXt_char1 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A393TBM31_CRF_NM, GXv_char2) ;
         b599_pc01_crf_res.this.GXt_char1 = GXv_char2[0] ;
         GXt_char3 = AV14W_STR ;
         GXv_char4[0] = GXt_char3 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A642TBM31_CRF_SNM, GXv_char4) ;
         b599_pc01_crf_res.this.GXt_char3 = GXv_char4[0] ;
         GXt_char5 = AV14W_STR ;
         GXv_char6[0] = GXt_char5 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A529TBM31_DEF_DOMAIN_CD, GXv_char6) ;
         b599_pc01_crf_res.this.GXt_char5 = GXv_char6[0] ;
         GXt_char7 = AV14W_STR ;
         GXv_char8[0] = GXt_char7 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A643TBM31_STATUS, GXv_char8) ;
         b599_pc01_crf_res.this.GXt_char7 = GXv_char8[0] ;
         GXt_char9 = AV14W_STR ;
         GXv_char10[0] = GXt_char9 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A396TBM31_NOTE, GXv_char10) ;
         b599_pc01_crf_res.this.GXt_char9 = GXv_char10[0] ;
         GXt_char11 = AV14W_STR ;
         GXv_char12[0] = GXt_char11 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A397TBM31_DEL_FLG, GXv_char12) ;
         b599_pc01_crf_res.this.GXt_char11 = GXv_char12[0] ;
         GXt_char13 = AV14W_STR ;
         GXv_char14[0] = GXt_char13 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A398TBM31_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char14) ;
         b599_pc01_crf_res.this.GXt_char13 = GXv_char14[0] ;
         GXt_char15 = AV14W_STR ;
         GXv_char16[0] = GXt_char15 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A399TBM31_CRT_USER_ID, GXv_char16) ;
         b599_pc01_crf_res.this.GXt_char15 = GXv_char16[0] ;
         GXt_char17 = AV14W_STR ;
         GXv_char18[0] = GXt_char17 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A400TBM31_CRT_PROG_NM, GXv_char18) ;
         b599_pc01_crf_res.this.GXt_char17 = GXv_char18[0] ;
         GXt_char19 = AV14W_STR ;
         GXv_char20[0] = GXt_char19 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A401TBM31_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char20) ;
         b599_pc01_crf_res.this.GXt_char19 = GXv_char20[0] ;
         GXt_char21 = AV14W_STR ;
         GXv_char22[0] = GXt_char21 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A402TBM31_UPD_USER_ID, GXv_char22) ;
         b599_pc01_crf_res.this.GXt_char21 = GXv_char22[0] ;
         GXt_char23 = AV14W_STR ;
         GXv_char24[0] = GXt_char23 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A403TBM31_UPD_PROG_NM, GXv_char24) ;
         b599_pc01_crf_res.this.GXt_char23 = GXv_char24[0] ;
         AV14W_STR = GXutil.trim( GXutil.str( A68TBM31_STUDY_ID, 10, 0)) + "," + GXutil.trim( GXutil.str( A69TBM31_CRF_ID, 10, 0)) + "," + GXt_char1 + "," + GXt_char3 + "," + GXutil.trim( GXutil.str( A394TBM31_GRID_SIZE, 10, 0)) + "," + GXutil.trim( GXutil.str( A395TBM31_ORDER, 10, 0)) + "," + GXutil.trim( GXutil.str( A528TBM31_DEF_VISIT_NO, 10, 0)) + "," + GXt_char5 + "," + GXt_char7 + "," + GXt_char9 + "," + GXt_char11 + "," + GXt_char13 + "," + GXt_char15 + "," + GXt_char17 + "," + GXt_char19 + "," + GXt_char21 + "," + GXt_char23 + "," + GXutil.trim( GXutil.str( A404TBM31_UPD_CNT, 10, 0)) ;
         AV12W_RTN_CSV.add(AV14W_STR, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV21GXLvl33 == 0 )
      {
         AV11W_RTN_CD = (short)(1) ;
         GXt_char23 = AV13W_RTN_MSG ;
         GXv_char24[0] = GXt_char23 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char24) ;
         b599_pc01_crf_res.this.GXt_char23 = GXv_char24[0] ;
         AV13W_RTN_MSG = GXt_char23 ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      AV16W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      AV17W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV17W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_STUDY_ID" );
      AV17W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( GXutil.trim( GXutil.str( AV9P_STUDY_ID, 10, 0)) );
      AV16W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV17W_PARMS_ITEM, 0);
      AV17W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV17W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_CRF_ID" );
      AV17W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV8P_CRF_ID );
      AV16W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV17W_PARMS_ITEM, 0);
      AV18W_MSG = "SUB_INIT" ;
      GXv_SdtB808_SD01_EXTRA_INFO25[0] = AV16W_EXTRA_INFO;
      GXv_int26[0] = AV11W_RTN_CD ;
      GXv_char24[0] = AV13W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV22Pgmname, (short)(1), AV18W_MSG, GXv_SdtB808_SD01_EXTRA_INFO25, GXv_int26, GXv_char24) ;
      AV16W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO25[0] ;
      b599_pc01_crf_res.this.AV11W_RTN_CD = GXv_int26[0] ;
      b599_pc01_crf_res.this.AV13W_RTN_MSG = GXv_char24[0] ;
   }

   public void S121( )
   {
      /* 'SUB_ERROR' Routine */
      AV18W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO25[0] = AV16W_EXTRA_INFO;
      GXv_int26[0] = AV11W_RTN_CD ;
      GXv_char24[0] = AV13W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV22Pgmname, (short)(0), AV18W_MSG, GXv_SdtB808_SD01_EXTRA_INFO25, GXv_int26, GXv_char24) ;
      AV16W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO25[0] ;
      b599_pc01_crf_res.this.AV11W_RTN_CD = GXv_int26[0] ;
      b599_pc01_crf_res.this.AV13W_RTN_MSG = GXv_char24[0] ;
      context.globals.Gx_eop = (byte)(0) ;
   }

   protected void cleanup( )
   {
      this.aP2[0] = b599_pc01_crf_res.this.AV12W_RTN_CSV;
      this.aP3[0] = b599_pc01_crf_res.this.AV11W_RTN_CD;
      this.aP4[0] = b599_pc01_crf_res.this.AV13W_RTN_MSG;
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
      AV13W_RTN_MSG = "" ;
      AV15C_APP_ID = "" ;
      AV16W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      scmdbuf = "" ;
      A397TBM31_DEL_FLG = "" ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      P001W2_A68TBM31_STUDY_ID = new long[1] ;
      P001W2_A397TBM31_DEL_FLG = new String[] {""} ;
      P001W2_n397TBM31_DEL_FLG = new boolean[] {false} ;
      P001W2_A69TBM31_CRF_ID = new short[1] ;
      P001W2_A404TBM31_UPD_CNT = new long[1] ;
      P001W2_n404TBM31_UPD_CNT = new boolean[] {false} ;
      P001W2_A403TBM31_UPD_PROG_NM = new String[] {""} ;
      P001W2_n403TBM31_UPD_PROG_NM = new boolean[] {false} ;
      P001W2_A402TBM31_UPD_USER_ID = new String[] {""} ;
      P001W2_n402TBM31_UPD_USER_ID = new boolean[] {false} ;
      P001W2_A401TBM31_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P001W2_n401TBM31_UPD_DATETIME = new boolean[] {false} ;
      P001W2_A400TBM31_CRT_PROG_NM = new String[] {""} ;
      P001W2_n400TBM31_CRT_PROG_NM = new boolean[] {false} ;
      P001W2_A399TBM31_CRT_USER_ID = new String[] {""} ;
      P001W2_n399TBM31_CRT_USER_ID = new boolean[] {false} ;
      P001W2_A398TBM31_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P001W2_n398TBM31_CRT_DATETIME = new boolean[] {false} ;
      P001W2_A396TBM31_NOTE = new String[] {""} ;
      P001W2_n396TBM31_NOTE = new boolean[] {false} ;
      P001W2_A643TBM31_STATUS = new String[] {""} ;
      P001W2_n643TBM31_STATUS = new boolean[] {false} ;
      P001W2_A529TBM31_DEF_DOMAIN_CD = new String[] {""} ;
      P001W2_n529TBM31_DEF_DOMAIN_CD = new boolean[] {false} ;
      P001W2_A528TBM31_DEF_VISIT_NO = new int[1] ;
      P001W2_n528TBM31_DEF_VISIT_NO = new boolean[] {false} ;
      P001W2_A394TBM31_GRID_SIZE = new short[1] ;
      P001W2_n394TBM31_GRID_SIZE = new boolean[] {false} ;
      P001W2_A642TBM31_CRF_SNM = new String[] {""} ;
      P001W2_n642TBM31_CRF_SNM = new boolean[] {false} ;
      P001W2_A393TBM31_CRF_NM = new String[] {""} ;
      P001W2_n393TBM31_CRF_NM = new boolean[] {false} ;
      P001W2_A395TBM31_ORDER = new int[1] ;
      P001W2_n395TBM31_ORDER = new boolean[] {false} ;
      A403TBM31_UPD_PROG_NM = "" ;
      A402TBM31_UPD_USER_ID = "" ;
      A401TBM31_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A400TBM31_CRT_PROG_NM = "" ;
      A399TBM31_CRT_USER_ID = "" ;
      A398TBM31_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A396TBM31_NOTE = "" ;
      A643TBM31_STATUS = "" ;
      A529TBM31_DEF_DOMAIN_CD = "" ;
      A642TBM31_CRF_SNM = "" ;
      A393TBM31_CRF_NM = "" ;
      AV14W_STR = "" ;
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
      AV17W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV18W_MSG = "" ;
      AV22Pgmname = "" ;
      GXv_SdtB808_SD01_EXTRA_INFO25 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int26 = new short [1] ;
      GXv_char24 = new String [1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b599_pc01_crf_res__default(),
         new Object[] {
             new Object[] {
            P001W2_A68TBM31_STUDY_ID, P001W2_A397TBM31_DEL_FLG, P001W2_n397TBM31_DEL_FLG, P001W2_A69TBM31_CRF_ID, P001W2_A404TBM31_UPD_CNT, P001W2_n404TBM31_UPD_CNT, P001W2_A403TBM31_UPD_PROG_NM, P001W2_n403TBM31_UPD_PROG_NM, P001W2_A402TBM31_UPD_USER_ID, P001W2_n402TBM31_UPD_USER_ID,
            P001W2_A401TBM31_UPD_DATETIME, P001W2_n401TBM31_UPD_DATETIME, P001W2_A400TBM31_CRT_PROG_NM, P001W2_n400TBM31_CRT_PROG_NM, P001W2_A399TBM31_CRT_USER_ID, P001W2_n399TBM31_CRT_USER_ID, P001W2_A398TBM31_CRT_DATETIME, P001W2_n398TBM31_CRT_DATETIME, P001W2_A396TBM31_NOTE, P001W2_n396TBM31_NOTE,
            P001W2_A643TBM31_STATUS, P001W2_n643TBM31_STATUS, P001W2_A529TBM31_DEF_DOMAIN_CD, P001W2_n529TBM31_DEF_DOMAIN_CD, P001W2_A528TBM31_DEF_VISIT_NO, P001W2_n528TBM31_DEF_VISIT_NO, P001W2_A394TBM31_GRID_SIZE, P001W2_n394TBM31_GRID_SIZE, P001W2_A642TBM31_CRF_SNM, P001W2_n642TBM31_CRF_SNM,
            P001W2_A393TBM31_CRF_NM, P001W2_n393TBM31_CRF_NM, P001W2_A395TBM31_ORDER, P001W2_n395TBM31_ORDER
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV22Pgmname = "B599_PC01_CRF_RES" ;
      /* GeneXus formulas. */
      AV22Pgmname = "B599_PC01_CRF_RES" ;
      Gx_err = (short)(0) ;
   }

   private byte AV21GXLvl33 ;
   private short AV11W_RTN_CD ;
   private short AV10W_CRF_ID ;
   private short A69TBM31_CRF_ID ;
   private short Gx_err ;
   private short A394TBM31_GRID_SIZE ;
   private short GXv_int26[] ;
   private int A528TBM31_DEF_VISIT_NO ;
   private int A395TBM31_ORDER ;
   private int GXActiveErrHndl ;
   private long AV9P_STUDY_ID ;
   private long A68TBM31_STUDY_ID ;
   private long A404TBM31_UPD_CNT ;
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
   private String AV22Pgmname ;
   private String GXv_char24[] ;
   private String Gx_emsg ;
   private java.util.Date A401TBM31_UPD_DATETIME ;
   private java.util.Date A398TBM31_CRT_DATETIME ;
   private boolean returnInSub ;
   private boolean n397TBM31_DEL_FLG ;
   private boolean n404TBM31_UPD_CNT ;
   private boolean n403TBM31_UPD_PROG_NM ;
   private boolean n402TBM31_UPD_USER_ID ;
   private boolean n401TBM31_UPD_DATETIME ;
   private boolean n400TBM31_CRT_PROG_NM ;
   private boolean n399TBM31_CRT_USER_ID ;
   private boolean n398TBM31_CRT_DATETIME ;
   private boolean n396TBM31_NOTE ;
   private boolean n643TBM31_STATUS ;
   private boolean n529TBM31_DEF_DOMAIN_CD ;
   private boolean n528TBM31_DEF_VISIT_NO ;
   private boolean n394TBM31_GRID_SIZE ;
   private boolean n642TBM31_CRF_SNM ;
   private boolean n393TBM31_CRF_NM ;
   private boolean n395TBM31_ORDER ;
   private String AV8P_CRF_ID ;
   private String AV13W_RTN_MSG ;
   private String AV15C_APP_ID ;
   private String A397TBM31_DEL_FLG ;
   private String A403TBM31_UPD_PROG_NM ;
   private String A402TBM31_UPD_USER_ID ;
   private String A400TBM31_CRT_PROG_NM ;
   private String A399TBM31_CRT_USER_ID ;
   private String A396TBM31_NOTE ;
   private String A643TBM31_STATUS ;
   private String A529TBM31_DEF_DOMAIN_CD ;
   private String A642TBM31_CRF_SNM ;
   private String A393TBM31_CRF_NM ;
   private String AV14W_STR ;
   private String AV18W_MSG ;
   private GxObjectCollection[] aP2 ;
   private short[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private long[] P001W2_A68TBM31_STUDY_ID ;
   private String[] P001W2_A397TBM31_DEL_FLG ;
   private boolean[] P001W2_n397TBM31_DEL_FLG ;
   private short[] P001W2_A69TBM31_CRF_ID ;
   private long[] P001W2_A404TBM31_UPD_CNT ;
   private boolean[] P001W2_n404TBM31_UPD_CNT ;
   private String[] P001W2_A403TBM31_UPD_PROG_NM ;
   private boolean[] P001W2_n403TBM31_UPD_PROG_NM ;
   private String[] P001W2_A402TBM31_UPD_USER_ID ;
   private boolean[] P001W2_n402TBM31_UPD_USER_ID ;
   private java.util.Date[] P001W2_A401TBM31_UPD_DATETIME ;
   private boolean[] P001W2_n401TBM31_UPD_DATETIME ;
   private String[] P001W2_A400TBM31_CRT_PROG_NM ;
   private boolean[] P001W2_n400TBM31_CRT_PROG_NM ;
   private String[] P001W2_A399TBM31_CRT_USER_ID ;
   private boolean[] P001W2_n399TBM31_CRT_USER_ID ;
   private java.util.Date[] P001W2_A398TBM31_CRT_DATETIME ;
   private boolean[] P001W2_n398TBM31_CRT_DATETIME ;
   private String[] P001W2_A396TBM31_NOTE ;
   private boolean[] P001W2_n396TBM31_NOTE ;
   private String[] P001W2_A643TBM31_STATUS ;
   private boolean[] P001W2_n643TBM31_STATUS ;
   private String[] P001W2_A529TBM31_DEF_DOMAIN_CD ;
   private boolean[] P001W2_n529TBM31_DEF_DOMAIN_CD ;
   private int[] P001W2_A528TBM31_DEF_VISIT_NO ;
   private boolean[] P001W2_n528TBM31_DEF_VISIT_NO ;
   private short[] P001W2_A394TBM31_GRID_SIZE ;
   private boolean[] P001W2_n394TBM31_GRID_SIZE ;
   private String[] P001W2_A642TBM31_CRF_SNM ;
   private boolean[] P001W2_n642TBM31_CRF_SNM ;
   private String[] P001W2_A393TBM31_CRF_NM ;
   private boolean[] P001W2_n393TBM31_CRF_NM ;
   private int[] P001W2_A395TBM31_ORDER ;
   private boolean[] P001W2_n395TBM31_ORDER ;
   private GxObjectCollection AV12W_RTN_CSV ;
   private SdtB808_SD01_EXTRA_INFO AV16W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO25[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV17W_PARMS_ITEM ;
}

final  class b599_pc01_crf_res__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P001W2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV8P_CRF_ID ,
                                          short A69TBM31_CRF_ID ,
                                          short AV10W_CRF_ID ,
                                          String A397TBM31_DEL_FLG ,
                                          long AV9P_STUDY_ID ,
                                          long A68TBM31_STUDY_ID )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int27 ;
      GXv_int27 = new byte [2] ;
      Object[] GXv_Object28 ;
      GXv_Object28 = new Object [2] ;
      Gx_ope = "Declare" ;
      Gx_etb = "TBM31_CRF" ;
      scmdbuf = "SELECT `TBM31_STUDY_ID`, `TBM31_DEL_FLG`, `TBM31_CRF_ID`, `TBM31_UPD_CNT`, `TBM31_UPD_PROG_NM`," ;
      scmdbuf = scmdbuf + " `TBM31_UPD_USER_ID`, `TBM31_UPD_DATETIME`, `TBM31_CRT_PROG_NM`, `TBM31_CRT_USER_ID`," ;
      scmdbuf = scmdbuf + " `TBM31_CRT_DATETIME`, `TBM31_NOTE`, `TBM31_STATUS`, `TBM31_DEF_DOMAIN_CD`, `TBM31_DEF_VISIT_NO`," ;
      scmdbuf = scmdbuf + " `TBM31_GRID_SIZE`, `TBM31_CRF_SNM`, `TBM31_CRF_NM`, `TBM31_ORDER` FROM `TBM31_CRF`" ;
      scmdbuf = scmdbuf + " WHERE (`TBM31_STUDY_ID` = ?)" ;
      scmdbuf = scmdbuf + " and (`TBM31_DEL_FLG` = '0')" ;
      if ( ! (GXutil.strcmp("", AV8P_CRF_ID)==0) )
      {
         sWhereString = sWhereString + " and (`TBM31_CRF_ID` = ?)" ;
      }
      else
      {
         GXv_int27[1] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TBM31_STUDY_ID`, `TBM31_ORDER`, `TBM31_CRF_ID`" ;
      GXv_Object28[0] = scmdbuf ;
      GXv_Object28[1] = GXv_int27 ;
      return GXv_Object28 ;
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
                  return conditional_P001W2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , ((Number) dynConstraints[4]).longValue() , ((Number) dynConstraints[5]).longValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001W2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
               ((long[]) buf[4])[0] = rslt.getLong(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDateTime(10) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((int[]) buf[24])[0] = rslt.getInt(14) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((short[]) buf[26])[0] = rslt.getShort(15) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((int[]) buf[32])[0] = rslt.getInt(18) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
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
                  stmt.setLong(sIdx, ((Number) parms[2]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[3]).shortValue());
               }
               return;
      }
   }

}

