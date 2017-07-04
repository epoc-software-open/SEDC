/*
               File: B599_PC06_CRF_DOM_MAP_RES
        Description: CRF-ドメインマッピングマスタ取得
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:51:56.21
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b599_pc06_crf_dom_map_res extends GXProcedure
{
   public b599_pc06_crf_dom_map_res( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b599_pc06_crf_dom_map_res.class ), "" );
   }

   public b599_pc06_crf_dom_map_res( int remoteHandle ,
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
      b599_pc06_crf_dom_map_res.this.AV10P_STUDY_ID = aP0;
      b599_pc06_crf_dom_map_res.this.AV8P_CRF_ID = aP1;
      b599_pc06_crf_dom_map_res.this.AV9P_CRF_ITEM_CD = aP2;
      b599_pc06_crf_dom_map_res.this.AV13W_RTN_CSV = aP3[0];
      b599_pc06_crf_dom_map_res.this.aP5 = new String[] {""};
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
      b599_pc06_crf_dom_map_res.this.AV10P_STUDY_ID = aP0;
      b599_pc06_crf_dom_map_res.this.AV8P_CRF_ID = aP1;
      b599_pc06_crf_dom_map_res.this.AV9P_CRF_ITEM_CD = aP2;
      b599_pc06_crf_dom_map_res.this.AV13W_RTN_CSV = aP3[0];
      this.aP3 = aP3;
      b599_pc06_crf_dom_map_res.this.aP4 = aP4;
      b599_pc06_crf_dom_map_res.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16C_APP_ID = "B599" ;
      AV12W_RTN_CD = (short)(0) ;
      AV14W_RTN_MSG = "" ;
      AV17W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV17W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV16C_APP_ID );
      /* Execute user subroutine: S1169 */
      S1169 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV11W_CRF_ID = (short)(GXutil.lval( AV8P_CRF_ID)) ;
      AV22GXLvl33 = (byte)(0) ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV8P_CRF_ID ,
                                           AV9P_CRF_ITEM_CD ,
                                           new Short(A272TBM37_CRF_ID) ,
                                           new Short(AV11W_CRF_ID) ,
                                           A273TBM37_CRF_ITEM_GRP_CD ,
                                           A274TBM37_DEL_FLG ,
                                           new Long(AV10P_STUDY_ID) ,
                                           new Long(A271TBM37_STUDY_ID) },
                                           new int[] {
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.LONG
                                           }
      });
      Gx_ope = "Fetch" ;
      Gx_etb = "TBM37_CRF_DOM_MAP" ;
      /* Using cursor P00202 */
      pr_default.execute(0, new Object[] {new Long(AV10P_STUDY_ID), new Short(AV11W_CRF_ID), AV9P_CRF_ITEM_CD});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A274TBM37_DEL_FLG = P00202_A274TBM37_DEL_FLG[0] ;
         n274TBM37_DEL_FLG = P00202_n274TBM37_DEL_FLG[0] ;
         A273TBM37_CRF_ITEM_GRP_CD = P00202_A273TBM37_CRF_ITEM_GRP_CD[0] ;
         A272TBM37_CRF_ID = P00202_A272TBM37_CRF_ID[0] ;
         A271TBM37_STUDY_ID = P00202_A271TBM37_STUDY_ID[0] ;
         A281TBM37_UPD_CNT = P00202_A281TBM37_UPD_CNT[0] ;
         n281TBM37_UPD_CNT = P00202_n281TBM37_UPD_CNT[0] ;
         A280TBM37_UPD_PROG_NM = P00202_A280TBM37_UPD_PROG_NM[0] ;
         n280TBM37_UPD_PROG_NM = P00202_n280TBM37_UPD_PROG_NM[0] ;
         A279TBM37_UPD_USER_ID = P00202_A279TBM37_UPD_USER_ID[0] ;
         n279TBM37_UPD_USER_ID = P00202_n279TBM37_UPD_USER_ID[0] ;
         A278TBM37_UPD_DATETIME = P00202_A278TBM37_UPD_DATETIME[0] ;
         n278TBM37_UPD_DATETIME = P00202_n278TBM37_UPD_DATETIME[0] ;
         A277TBM37_CRT_PROG_NM = P00202_A277TBM37_CRT_PROG_NM[0] ;
         n277TBM37_CRT_PROG_NM = P00202_n277TBM37_CRT_PROG_NM[0] ;
         A276TBM37_CRT_USER_ID = P00202_A276TBM37_CRT_USER_ID[0] ;
         n276TBM37_CRT_USER_ID = P00202_n276TBM37_CRT_USER_ID[0] ;
         A275TBM37_CRT_DATETIME = P00202_A275TBM37_CRT_DATETIME[0] ;
         n275TBM37_CRT_DATETIME = P00202_n275TBM37_CRT_DATETIME[0] ;
         A612TBM37_DOM_ITM_GRP_ROWNO = P00202_A612TBM37_DOM_ITM_GRP_ROWNO[0] ;
         n612TBM37_DOM_ITM_GRP_ROWNO = P00202_n612TBM37_DOM_ITM_GRP_ROWNO[0] ;
         A377TBM37_DOM_ITM_GRP_ATTR_SEQ = P00202_A377TBM37_DOM_ITM_GRP_ATTR_SEQ[0] ;
         n377TBM37_DOM_ITM_GRP_ATTR_SEQ = P00202_n377TBM37_DOM_ITM_GRP_ATTR_SEQ[0] ;
         A376TBM37_DOM_ITM_GRP_OID = P00202_A376TBM37_DOM_ITM_GRP_OID[0] ;
         n376TBM37_DOM_ITM_GRP_OID = P00202_n376TBM37_DOM_ITM_GRP_OID[0] ;
         A375TBM37_DOM_VAR_NM = P00202_A375TBM37_DOM_VAR_NM[0] ;
         n375TBM37_DOM_VAR_NM = P00202_n375TBM37_DOM_VAR_NM[0] ;
         A374TBM37_DOM_CD = P00202_A374TBM37_DOM_CD[0] ;
         n374TBM37_DOM_CD = P00202_n374TBM37_DOM_CD[0] ;
         A373TBM37_VISIT_NO = P00202_A373TBM37_VISIT_NO[0] ;
         n373TBM37_VISIT_NO = P00202_n373TBM37_VISIT_NO[0] ;
         A372TBM37_CRF_ITEM_GRP_DIV = P00202_A372TBM37_CRF_ITEM_GRP_DIV[0] ;
         AV22GXLvl33 = (byte)(1) ;
         GXt_char1 = AV15W_STR ;
         GXv_char2[0] = GXt_char1 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A372TBM37_CRF_ITEM_GRP_DIV, GXv_char2) ;
         b599_pc06_crf_dom_map_res.this.GXt_char1 = GXv_char2[0] ;
         GXt_char3 = AV15W_STR ;
         GXv_char4[0] = GXt_char3 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A273TBM37_CRF_ITEM_GRP_CD, GXv_char4) ;
         b599_pc06_crf_dom_map_res.this.GXt_char3 = GXv_char4[0] ;
         GXt_char5 = AV15W_STR ;
         GXv_char6[0] = GXt_char5 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A374TBM37_DOM_CD, GXv_char6) ;
         b599_pc06_crf_dom_map_res.this.GXt_char5 = GXv_char6[0] ;
         GXt_char7 = AV15W_STR ;
         GXv_char8[0] = GXt_char7 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A375TBM37_DOM_VAR_NM, GXv_char8) ;
         b599_pc06_crf_dom_map_res.this.GXt_char7 = GXv_char8[0] ;
         GXt_char9 = AV15W_STR ;
         GXv_char10[0] = GXt_char9 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A376TBM37_DOM_ITM_GRP_OID, GXv_char10) ;
         b599_pc06_crf_dom_map_res.this.GXt_char9 = GXv_char10[0] ;
         GXt_char11 = AV15W_STR ;
         GXv_char12[0] = GXt_char11 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A274TBM37_DEL_FLG, GXv_char12) ;
         b599_pc06_crf_dom_map_res.this.GXt_char11 = GXv_char12[0] ;
         GXt_char13 = AV15W_STR ;
         GXv_char14[0] = GXt_char13 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A275TBM37_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char14) ;
         b599_pc06_crf_dom_map_res.this.GXt_char13 = GXv_char14[0] ;
         GXt_char15 = AV15W_STR ;
         GXv_char16[0] = GXt_char15 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A276TBM37_CRT_USER_ID, GXv_char16) ;
         b599_pc06_crf_dom_map_res.this.GXt_char15 = GXv_char16[0] ;
         GXt_char17 = AV15W_STR ;
         GXv_char18[0] = GXt_char17 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A277TBM37_CRT_PROG_NM, GXv_char18) ;
         b599_pc06_crf_dom_map_res.this.GXt_char17 = GXv_char18[0] ;
         GXt_char19 = AV15W_STR ;
         GXv_char20[0] = GXt_char19 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A278TBM37_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char20) ;
         b599_pc06_crf_dom_map_res.this.GXt_char19 = GXv_char20[0] ;
         GXt_char21 = AV15W_STR ;
         GXv_char22[0] = GXt_char21 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A279TBM37_UPD_USER_ID, GXv_char22) ;
         b599_pc06_crf_dom_map_res.this.GXt_char21 = GXv_char22[0] ;
         GXt_char23 = AV15W_STR ;
         GXv_char24[0] = GXt_char23 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A280TBM37_UPD_PROG_NM, GXv_char24) ;
         b599_pc06_crf_dom_map_res.this.GXt_char23 = GXv_char24[0] ;
         AV15W_STR = GXutil.trim( GXutil.str( A271TBM37_STUDY_ID, 10, 0)) + "," + GXutil.trim( GXutil.str( A272TBM37_CRF_ID, 10, 0)) + "," + GXt_char1 + "," + GXt_char3 + "," + GXutil.trim( GXutil.str( A373TBM37_VISIT_NO, 10, 0)) + "," + GXt_char5 + "," + GXt_char7 + "," + GXt_char9 + "," + GXutil.trim( GXutil.str( A377TBM37_DOM_ITM_GRP_ATTR_SEQ, 10, 0)) + "," + GXutil.trim( GXutil.str( A612TBM37_DOM_ITM_GRP_ROWNO, 10, 0)) + "," + GXt_char11 + "," + GXt_char13 + "," + GXt_char15 + "," + GXt_char17 + "," + GXt_char19 + "," + GXt_char21 + "," + GXt_char23 + "," + GXutil.trim( GXutil.str( A281TBM37_UPD_CNT, 10, 0)) ;
         AV13W_RTN_CSV.add(AV15W_STR, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV22GXLvl33 == 0 )
      {
         AV12W_RTN_CD = (short)(1) ;
         GXt_char23 = AV14W_RTN_MSG ;
         GXv_char24[0] = GXt_char23 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char24) ;
         b599_pc06_crf_dom_map_res.this.GXt_char23 = GXv_char24[0] ;
         AV14W_RTN_MSG = GXt_char23 ;
      }
      cleanup();
   }

   public void S1169( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      AV17W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      AV18W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV18W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_STUDY_ID" );
      AV18W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( GXutil.trim( GXutil.str( AV10P_STUDY_ID, 10, 0)) );
      AV17W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV18W_PARMS_ITEM, 0);
      AV18W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV18W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_CRF_ID" );
      AV18W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV8P_CRF_ID );
      AV17W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV18W_PARMS_ITEM, 0);
      AV18W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV18W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_CRF_ITEM_CD" );
      AV18W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV9P_CRF_ITEM_CD );
      AV17W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV18W_PARMS_ITEM, 0);
      AV19W_MSG = "SUB_INIT" ;
      GXv_SdtB808_SD01_EXTRA_INFO25[0] = AV17W_EXTRA_INFO;
      GXv_int26[0] = AV12W_RTN_CD ;
      GXv_char24[0] = AV14W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV23Pgmname, (short)(1), AV19W_MSG, GXv_SdtB808_SD01_EXTRA_INFO25, GXv_int26, GXv_char24) ;
      AV17W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO25[0] ;
      b599_pc06_crf_dom_map_res.this.AV12W_RTN_CD = GXv_int26[0] ;
      b599_pc06_crf_dom_map_res.this.AV14W_RTN_MSG = GXv_char24[0] ;
   }

   public void S1297( )
   {
      /* 'SUB_ERROR' Routine */
      AV19W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO25[0] = AV17W_EXTRA_INFO;
      GXv_int26[0] = AV12W_RTN_CD ;
      GXv_char24[0] = AV14W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV23Pgmname, (short)(0), AV19W_MSG, GXv_SdtB808_SD01_EXTRA_INFO25, GXv_int26, GXv_char24) ;
      AV17W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO25[0] ;
      b599_pc06_crf_dom_map_res.this.AV12W_RTN_CD = GXv_int26[0] ;
      b599_pc06_crf_dom_map_res.this.AV14W_RTN_MSG = GXv_char24[0] ;
      context.globals.Gx_eop = (byte)(0) ;
   }

   protected void cleanup( )
   {
      this.aP3[0] = b599_pc06_crf_dom_map_res.this.AV13W_RTN_CSV;
      this.aP4[0] = b599_pc06_crf_dom_map_res.this.AV12W_RTN_CD;
      this.aP5[0] = b599_pc06_crf_dom_map_res.this.AV14W_RTN_MSG;
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
                  /* Execute user subroutine: S1297 */
                  S1297 ();
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
      AV16C_APP_ID = "" ;
      AV17W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      scmdbuf = "" ;
      A273TBM37_CRF_ITEM_GRP_CD = "" ;
      A274TBM37_DEL_FLG = "" ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      P00202_A274TBM37_DEL_FLG = new String[] {""} ;
      P00202_n274TBM37_DEL_FLG = new boolean[] {false} ;
      P00202_A273TBM37_CRF_ITEM_GRP_CD = new String[] {""} ;
      P00202_A272TBM37_CRF_ID = new short[1] ;
      P00202_A271TBM37_STUDY_ID = new long[1] ;
      P00202_A281TBM37_UPD_CNT = new long[1] ;
      P00202_n281TBM37_UPD_CNT = new boolean[] {false} ;
      P00202_A280TBM37_UPD_PROG_NM = new String[] {""} ;
      P00202_n280TBM37_UPD_PROG_NM = new boolean[] {false} ;
      P00202_A279TBM37_UPD_USER_ID = new String[] {""} ;
      P00202_n279TBM37_UPD_USER_ID = new boolean[] {false} ;
      P00202_A278TBM37_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P00202_n278TBM37_UPD_DATETIME = new boolean[] {false} ;
      P00202_A277TBM37_CRT_PROG_NM = new String[] {""} ;
      P00202_n277TBM37_CRT_PROG_NM = new boolean[] {false} ;
      P00202_A276TBM37_CRT_USER_ID = new String[] {""} ;
      P00202_n276TBM37_CRT_USER_ID = new boolean[] {false} ;
      P00202_A275TBM37_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P00202_n275TBM37_CRT_DATETIME = new boolean[] {false} ;
      P00202_A612TBM37_DOM_ITM_GRP_ROWNO = new short[1] ;
      P00202_n612TBM37_DOM_ITM_GRP_ROWNO = new boolean[] {false} ;
      P00202_A377TBM37_DOM_ITM_GRP_ATTR_SEQ = new short[1] ;
      P00202_n377TBM37_DOM_ITM_GRP_ATTR_SEQ = new boolean[] {false} ;
      P00202_A376TBM37_DOM_ITM_GRP_OID = new String[] {""} ;
      P00202_n376TBM37_DOM_ITM_GRP_OID = new boolean[] {false} ;
      P00202_A375TBM37_DOM_VAR_NM = new String[] {""} ;
      P00202_n375TBM37_DOM_VAR_NM = new boolean[] {false} ;
      P00202_A374TBM37_DOM_CD = new String[] {""} ;
      P00202_n374TBM37_DOM_CD = new boolean[] {false} ;
      P00202_A373TBM37_VISIT_NO = new short[1] ;
      P00202_n373TBM37_VISIT_NO = new boolean[] {false} ;
      P00202_A372TBM37_CRF_ITEM_GRP_DIV = new String[] {""} ;
      A280TBM37_UPD_PROG_NM = "" ;
      A279TBM37_UPD_USER_ID = "" ;
      A278TBM37_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A277TBM37_CRT_PROG_NM = "" ;
      A276TBM37_CRT_USER_ID = "" ;
      A275TBM37_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A376TBM37_DOM_ITM_GRP_OID = "" ;
      A375TBM37_DOM_VAR_NM = "" ;
      A374TBM37_DOM_CD = "" ;
      A372TBM37_CRF_ITEM_GRP_DIV = "" ;
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
      AV18W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV19W_MSG = "" ;
      AV23Pgmname = "" ;
      GXv_SdtB808_SD01_EXTRA_INFO25 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int26 = new short [1] ;
      GXv_char24 = new String [1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b599_pc06_crf_dom_map_res__default(),
         new Object[] {
             new Object[] {
            P00202_A274TBM37_DEL_FLG, P00202_n274TBM37_DEL_FLG, P00202_A273TBM37_CRF_ITEM_GRP_CD, P00202_A272TBM37_CRF_ID, P00202_A271TBM37_STUDY_ID, P00202_A281TBM37_UPD_CNT, P00202_n281TBM37_UPD_CNT, P00202_A280TBM37_UPD_PROG_NM, P00202_n280TBM37_UPD_PROG_NM, P00202_A279TBM37_UPD_USER_ID,
            P00202_n279TBM37_UPD_USER_ID, P00202_A278TBM37_UPD_DATETIME, P00202_n278TBM37_UPD_DATETIME, P00202_A277TBM37_CRT_PROG_NM, P00202_n277TBM37_CRT_PROG_NM, P00202_A276TBM37_CRT_USER_ID, P00202_n276TBM37_CRT_USER_ID, P00202_A275TBM37_CRT_DATETIME, P00202_n275TBM37_CRT_DATETIME, P00202_A612TBM37_DOM_ITM_GRP_ROWNO,
            P00202_n612TBM37_DOM_ITM_GRP_ROWNO, P00202_A377TBM37_DOM_ITM_GRP_ATTR_SEQ, P00202_n377TBM37_DOM_ITM_GRP_ATTR_SEQ, P00202_A376TBM37_DOM_ITM_GRP_OID, P00202_n376TBM37_DOM_ITM_GRP_OID, P00202_A375TBM37_DOM_VAR_NM, P00202_n375TBM37_DOM_VAR_NM, P00202_A374TBM37_DOM_CD, P00202_n374TBM37_DOM_CD, P00202_A373TBM37_VISIT_NO,
            P00202_n373TBM37_VISIT_NO, P00202_A372TBM37_CRF_ITEM_GRP_DIV
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV23Pgmname = "B599_PC06_CRF_DOM_MAP_RES" ;
      /* GeneXus formulas. */
      AV23Pgmname = "B599_PC06_CRF_DOM_MAP_RES" ;
      Gx_err = (short)(0) ;
   }

   private byte AV22GXLvl33 ;
   private short AV12W_RTN_CD ;
   private short AV11W_CRF_ID ;
   private short A272TBM37_CRF_ID ;
   private short A612TBM37_DOM_ITM_GRP_ROWNO ;
   private short A377TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private short A373TBM37_VISIT_NO ;
   private short GXv_int26[] ;
   private short Gx_err ;
   private int GXActiveErrHndl ;
   private long AV10P_STUDY_ID ;
   private long A271TBM37_STUDY_ID ;
   private long A281TBM37_UPD_CNT ;
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
   private String AV23Pgmname ;
   private String GXv_char24[] ;
   private String Gx_emsg ;
   private java.util.Date A278TBM37_UPD_DATETIME ;
   private java.util.Date A275TBM37_CRT_DATETIME ;
   private boolean returnInSub ;
   private boolean n274TBM37_DEL_FLG ;
   private boolean n281TBM37_UPD_CNT ;
   private boolean n280TBM37_UPD_PROG_NM ;
   private boolean n279TBM37_UPD_USER_ID ;
   private boolean n278TBM37_UPD_DATETIME ;
   private boolean n277TBM37_CRT_PROG_NM ;
   private boolean n276TBM37_CRT_USER_ID ;
   private boolean n275TBM37_CRT_DATETIME ;
   private boolean n612TBM37_DOM_ITM_GRP_ROWNO ;
   private boolean n377TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private boolean n376TBM37_DOM_ITM_GRP_OID ;
   private boolean n375TBM37_DOM_VAR_NM ;
   private boolean n374TBM37_DOM_CD ;
   private boolean n373TBM37_VISIT_NO ;
   private String AV8P_CRF_ID ;
   private String AV9P_CRF_ITEM_CD ;
   private String AV14W_RTN_MSG ;
   private String AV16C_APP_ID ;
   private String A273TBM37_CRF_ITEM_GRP_CD ;
   private String A274TBM37_DEL_FLG ;
   private String A280TBM37_UPD_PROG_NM ;
   private String A279TBM37_UPD_USER_ID ;
   private String A277TBM37_CRT_PROG_NM ;
   private String A276TBM37_CRT_USER_ID ;
   private String A376TBM37_DOM_ITM_GRP_OID ;
   private String A375TBM37_DOM_VAR_NM ;
   private String A374TBM37_DOM_CD ;
   private String A372TBM37_CRF_ITEM_GRP_DIV ;
   private String AV15W_STR ;
   private String AV19W_MSG ;
   private GxObjectCollection[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P00202_A274TBM37_DEL_FLG ;
   private boolean[] P00202_n274TBM37_DEL_FLG ;
   private String[] P00202_A273TBM37_CRF_ITEM_GRP_CD ;
   private short[] P00202_A272TBM37_CRF_ID ;
   private long[] P00202_A271TBM37_STUDY_ID ;
   private long[] P00202_A281TBM37_UPD_CNT ;
   private boolean[] P00202_n281TBM37_UPD_CNT ;
   private String[] P00202_A280TBM37_UPD_PROG_NM ;
   private boolean[] P00202_n280TBM37_UPD_PROG_NM ;
   private String[] P00202_A279TBM37_UPD_USER_ID ;
   private boolean[] P00202_n279TBM37_UPD_USER_ID ;
   private java.util.Date[] P00202_A278TBM37_UPD_DATETIME ;
   private boolean[] P00202_n278TBM37_UPD_DATETIME ;
   private String[] P00202_A277TBM37_CRT_PROG_NM ;
   private boolean[] P00202_n277TBM37_CRT_PROG_NM ;
   private String[] P00202_A276TBM37_CRT_USER_ID ;
   private boolean[] P00202_n276TBM37_CRT_USER_ID ;
   private java.util.Date[] P00202_A275TBM37_CRT_DATETIME ;
   private boolean[] P00202_n275TBM37_CRT_DATETIME ;
   private short[] P00202_A612TBM37_DOM_ITM_GRP_ROWNO ;
   private boolean[] P00202_n612TBM37_DOM_ITM_GRP_ROWNO ;
   private short[] P00202_A377TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private boolean[] P00202_n377TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private String[] P00202_A376TBM37_DOM_ITM_GRP_OID ;
   private boolean[] P00202_n376TBM37_DOM_ITM_GRP_OID ;
   private String[] P00202_A375TBM37_DOM_VAR_NM ;
   private boolean[] P00202_n375TBM37_DOM_VAR_NM ;
   private String[] P00202_A374TBM37_DOM_CD ;
   private boolean[] P00202_n374TBM37_DOM_CD ;
   private short[] P00202_A373TBM37_VISIT_NO ;
   private boolean[] P00202_n373TBM37_VISIT_NO ;
   private String[] P00202_A372TBM37_CRF_ITEM_GRP_DIV ;
   private GxObjectCollection AV13W_RTN_CSV ;
   private SdtB808_SD01_EXTRA_INFO AV17W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO25[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV18W_PARMS_ITEM ;
}

final  class b599_pc06_crf_dom_map_res__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P00202( com.genexus.internet.HttpContext httpContext ,
                                          String AV8P_CRF_ID ,
                                          String AV9P_CRF_ITEM_CD ,
                                          short A272TBM37_CRF_ID ,
                                          short AV11W_CRF_ID ,
                                          String A273TBM37_CRF_ITEM_GRP_CD ,
                                          String A274TBM37_DEL_FLG ,
                                          long AV10P_STUDY_ID ,
                                          long A271TBM37_STUDY_ID )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int27 ;
      GXv_int27 = new byte [3] ;
      Object[] GXv_Object28 ;
      GXv_Object28 = new Object [2] ;
      Gx_ope = "Declare" ;
      Gx_etb = "TBM37_CRF_DOM_MAP" ;
      scmdbuf = "SELECT `TBM37_DEL_FLG`, `TBM37_CRF_ITEM_GRP_CD`, `TBM37_CRF_ID`, `TBM37_STUDY_ID`," ;
      scmdbuf = scmdbuf + " `TBM37_UPD_CNT`, `TBM37_UPD_PROG_NM`, `TBM37_UPD_USER_ID`, `TBM37_UPD_DATETIME`," ;
      scmdbuf = scmdbuf + " `TBM37_CRT_PROG_NM`, `TBM37_CRT_USER_ID`, `TBM37_CRT_DATETIME`, `TBM37_DOM_ITM_GRP_ROWNO`," ;
      scmdbuf = scmdbuf + " `TBM37_DOM_ITM_GRP_ATTR_SEQ`, `TBM37_DOM_ITM_GRP_OID`, `TBM37_DOM_VAR_NM`, `TBM37_DOM_CD`," ;
      scmdbuf = scmdbuf + " `TBM37_VISIT_NO`, `TBM37_CRF_ITEM_GRP_DIV` FROM `TBM37_CRF_DOM_MAP`" ;
      scmdbuf = scmdbuf + " WHERE (`TBM37_STUDY_ID` = ?)" ;
      scmdbuf = scmdbuf + " and (`TBM37_DEL_FLG` = '0')" ;
      if ( ! (GXutil.strcmp("", AV8P_CRF_ID)==0) )
      {
         sWhereString = sWhereString + " and (`TBM37_CRF_ID` = ?)" ;
      }
      else
      {
         GXv_int27[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV9P_CRF_ITEM_CD)==0) )
      {
         sWhereString = sWhereString + " and (`TBM37_CRF_ITEM_GRP_CD` = ?)" ;
      }
      else
      {
         GXv_int27[2] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TBM37_STUDY_ID`, `TBM37_CRF_ID`, `TBM37_CRF_ITEM_GRP_DIV`, `TBM37_CRF_ITEM_GRP_CD`" ;
      GXv_Object28[0] = scmdbuf ;
      GXv_Object28[1] = GXv_int27 ;
      return GXv_Object28 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         com.genexus.internet.HttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_P00202(httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).longValue() , ((Number) dynConstraints[7]).longValue() );
      }
      return super.getDynamicStatement(cursor, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00202", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
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
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((short[]) buf[3])[0] = rslt.getShort(3) ;
               ((long[]) buf[4])[0] = rslt.getLong(4) ;
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
               ((short[]) buf[19])[0] = rslt.getShort(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(13) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((short[]) buf[29])[0] = rslt.getShort(17) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(18) ;
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
                  stmt.setVarchar(sIdx, (String)parms[5], 50);
               }
               break;
      }
   }

}

