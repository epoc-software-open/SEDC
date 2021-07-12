/*
               File: B599_PC11_STUDY_RES
        Description: ŽŽŒ±ƒ}ƒXƒ^Žæ“¾
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:16:40.61
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b599_pc11_study_res extends GXProcedure
{
   public b599_pc11_study_res( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b599_pc11_study_res.class ), "" );
   }

   public b599_pc11_study_res( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 ,
                             GxObjectCollection[] aP1 ,
                             short[] aP2 )
   {
      b599_pc11_study_res.this.AV8P_STUDY_ID = aP0;
      b599_pc11_study_res.this.AV10W_RTN_CSV = aP1[0];
      this.aP1 = aP1;
      b599_pc11_study_res.this.aP2 = aP2;
      b599_pc11_study_res.this.aP3 = aP3;
      b599_pc11_study_res.this.aP3 = new String[] {""};
      initialize();
      privateExecute();
      return aP3[0];
   }

   public void execute( String aP0 ,
                        GxObjectCollection[] aP1 ,
                        short[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             GxObjectCollection[] aP1 ,
                             short[] aP2 ,
                             String[] aP3 )
   {
      b599_pc11_study_res.this.AV8P_STUDY_ID = aP0;
      b599_pc11_study_res.this.AV10W_RTN_CSV = aP1[0];
      this.aP1 = aP1;
      b599_pc11_study_res.this.aP2 = aP2;
      b599_pc11_study_res.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV14C_APP_ID = "B599" ;
      AV9W_RTN_CD = (short)(0) ;
      AV11W_RTN_MSG = "" ;
      AV15W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV15W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV14C_APP_ID );
      /* Execute user subroutine: S111 */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV13W_STUDY_ID = GXutil.lval( AV8P_STUDY_ID) ;
      AV20GXLvl33 = (byte)(0) ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV8P_STUDY_ID ,
                                           new Long(A63TBM21_STUDY_ID) ,
                                           new Long(AV13W_STUDY_ID) ,
                                           A369TBM21_DEL_FLG },
                                           new int[] {
                                           TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      Gx_ope = "Fetch" ;
      Gx_etb = "TBM21_STUDY" ;
      /* Using cursor P00362 */
      pr_default.execute(0, new Object[] {new Long(AV13W_STUDY_ID)});
      if ( Gx_err != 0 )
      {
         AV20GXLvl33 = (byte)(1) ;
      }
      while ( (pr_default.getStatus(0) != 101) )
      {
         A369TBM21_DEL_FLG = P00362_A369TBM21_DEL_FLG[0] ;
         n369TBM21_DEL_FLG = P00362_n369TBM21_DEL_FLG[0] ;
         A63TBM21_STUDY_ID = P00362_A63TBM21_STUDY_ID[0] ;
         A376TBM21_UPD_CNT = P00362_A376TBM21_UPD_CNT[0] ;
         n376TBM21_UPD_CNT = P00362_n376TBM21_UPD_CNT[0] ;
         A375TBM21_UPD_PROG_NM = P00362_A375TBM21_UPD_PROG_NM[0] ;
         n375TBM21_UPD_PROG_NM = P00362_n375TBM21_UPD_PROG_NM[0] ;
         A374TBM21_UPD_USER_ID = P00362_A374TBM21_UPD_USER_ID[0] ;
         n374TBM21_UPD_USER_ID = P00362_n374TBM21_UPD_USER_ID[0] ;
         A373TBM21_UPD_DATETIME = P00362_A373TBM21_UPD_DATETIME[0] ;
         n373TBM21_UPD_DATETIME = P00362_n373TBM21_UPD_DATETIME[0] ;
         A372TBM21_CRT_PROG_NM = P00362_A372TBM21_CRT_PROG_NM[0] ;
         n372TBM21_CRT_PROG_NM = P00362_n372TBM21_CRT_PROG_NM[0] ;
         A371TBM21_CRT_USER_ID = P00362_A371TBM21_CRT_USER_ID[0] ;
         n371TBM21_CRT_USER_ID = P00362_n371TBM21_CRT_USER_ID[0] ;
         A370TBM21_CRT_DATETIME = P00362_A370TBM21_CRT_DATETIME[0] ;
         n370TBM21_CRT_DATETIME = P00362_n370TBM21_CRT_DATETIME[0] ;
         A607TBM21_STATUS = P00362_A607TBM21_STATUS[0] ;
         n607TBM21_STATUS = P00362_n607TBM21_STATUS[0] ;
         A368TBM21_NOTE = P00362_A368TBM21_NOTE[0] ;
         n368TBM21_NOTE = P00362_n368TBM21_NOTE[0] ;
         A531TBM21_PROC_NM = P00362_A531TBM21_PROC_NM[0] ;
         n531TBM21_PROC_NM = P00362_n531TBM21_PROC_NM[0] ;
         A530TBM21_OUTER_STUDY_ID = P00362_A530TBM21_OUTER_STUDY_ID[0] ;
         n530TBM21_OUTER_STUDY_ID = P00362_n530TBM21_OUTER_STUDY_ID[0] ;
         A367TBM21_STUDY_NM = P00362_A367TBM21_STUDY_NM[0] ;
         n367TBM21_STUDY_NM = P00362_n367TBM21_STUDY_NM[0] ;
         AV20GXLvl33 = (byte)(1) ;
         GXt_char1 = AV12W_STR ;
         GXv_char2[0] = GXt_char1 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A367TBM21_STUDY_NM, GXv_char2) ;
         b599_pc11_study_res.this.GXt_char1 = GXv_char2[0] ;
         GXt_char3 = AV12W_STR ;
         GXv_char4[0] = GXt_char3 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A530TBM21_OUTER_STUDY_ID, GXv_char4) ;
         b599_pc11_study_res.this.GXt_char3 = GXv_char4[0] ;
         GXt_char5 = AV12W_STR ;
         GXv_char6[0] = GXt_char5 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A531TBM21_PROC_NM, GXv_char6) ;
         b599_pc11_study_res.this.GXt_char5 = GXv_char6[0] ;
         GXt_char7 = AV12W_STR ;
         GXv_char8[0] = GXt_char7 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A368TBM21_NOTE, GXv_char8) ;
         b599_pc11_study_res.this.GXt_char7 = GXv_char8[0] ;
         GXt_char9 = AV12W_STR ;
         GXv_char10[0] = GXt_char9 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A607TBM21_STATUS, GXv_char10) ;
         b599_pc11_study_res.this.GXt_char9 = GXv_char10[0] ;
         GXt_char11 = AV12W_STR ;
         GXv_char12[0] = GXt_char11 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A369TBM21_DEL_FLG, GXv_char12) ;
         b599_pc11_study_res.this.GXt_char11 = GXv_char12[0] ;
         GXt_char13 = AV12W_STR ;
         GXv_char14[0] = GXt_char13 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A370TBM21_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char14) ;
         b599_pc11_study_res.this.GXt_char13 = GXv_char14[0] ;
         GXt_char15 = AV12W_STR ;
         GXv_char16[0] = GXt_char15 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A371TBM21_CRT_USER_ID, GXv_char16) ;
         b599_pc11_study_res.this.GXt_char15 = GXv_char16[0] ;
         GXt_char17 = AV12W_STR ;
         GXv_char18[0] = GXt_char17 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A372TBM21_CRT_PROG_NM, GXv_char18) ;
         b599_pc11_study_res.this.GXt_char17 = GXv_char18[0] ;
         GXt_char19 = AV12W_STR ;
         GXv_char20[0] = GXt_char19 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A373TBM21_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char20) ;
         b599_pc11_study_res.this.GXt_char19 = GXv_char20[0] ;
         GXt_char21 = AV12W_STR ;
         GXv_char22[0] = GXt_char21 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A374TBM21_UPD_USER_ID, GXv_char22) ;
         b599_pc11_study_res.this.GXt_char21 = GXv_char22[0] ;
         GXt_char23 = AV12W_STR ;
         GXv_char24[0] = GXt_char23 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A375TBM21_UPD_PROG_NM, GXv_char24) ;
         b599_pc11_study_res.this.GXt_char23 = GXv_char24[0] ;
         AV12W_STR = GXutil.trim( GXutil.str( A63TBM21_STUDY_ID, 10, 0)) + "," + GXt_char1 + "," + GXt_char3 + "," + GXt_char5 + "," + GXt_char7 + "," + GXt_char9 + "," + GXt_char11 + "," + GXt_char13 + "," + GXt_char15 + "," + GXt_char17 + "," + GXt_char19 + "," + GXt_char21 + "," + GXt_char23 + "," + GXutil.trim( GXutil.str( A376TBM21_UPD_CNT, 10, 0)) ;
         AV10W_RTN_CSV.add(AV12W_STR, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV20GXLvl33 == 0 )
      {
         AV9W_RTN_CD = (short)(1) ;
         GXt_char23 = AV11W_RTN_MSG ;
         GXv_char24[0] = GXt_char23 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char24) ;
         b599_pc11_study_res.this.GXt_char23 = GXv_char24[0] ;
         AV11W_RTN_MSG = GXt_char23 ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      AV15W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      AV16W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV16W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_STUDY_ID" );
      AV16W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV8P_STUDY_ID );
      AV15W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV16W_PARMS_ITEM, 0);
      AV17W_MSG = "SUB_INIT" ;
      GXv_SdtB808_SD01_EXTRA_INFO25[0] = AV15W_EXTRA_INFO;
      GXv_int26[0] = AV9W_RTN_CD ;
      GXv_char24[0] = AV11W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV21Pgmname, (short)(1), AV17W_MSG, GXv_SdtB808_SD01_EXTRA_INFO25, GXv_int26, GXv_char24) ;
      AV15W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO25[0] ;
      b599_pc11_study_res.this.AV9W_RTN_CD = GXv_int26[0] ;
      b599_pc11_study_res.this.AV11W_RTN_MSG = GXv_char24[0] ;
   }

   public void S121( )
   {
      /* 'SUB_ERROR' Routine */
      AV17W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO25[0] = AV15W_EXTRA_INFO;
      GXv_int26[0] = AV9W_RTN_CD ;
      GXv_char24[0] = AV11W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV21Pgmname, (short)(0), AV17W_MSG, GXv_SdtB808_SD01_EXTRA_INFO25, GXv_int26, GXv_char24) ;
      AV15W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO25[0] ;
      b599_pc11_study_res.this.AV9W_RTN_CD = GXv_int26[0] ;
      b599_pc11_study_res.this.AV11W_RTN_MSG = GXv_char24[0] ;
      context.globals.Gx_eop = (byte)(0) ;
   }

   protected void cleanup( )
   {
      this.aP1[0] = b599_pc11_study_res.this.AV10W_RTN_CSV;
      this.aP2[0] = b599_pc11_study_res.this.AV9W_RTN_CD;
      this.aP3[0] = b599_pc11_study_res.this.AV11W_RTN_MSG;
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
      AV11W_RTN_MSG = "" ;
      AV14C_APP_ID = "" ;
      AV15W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      scmdbuf = "" ;
      A369TBM21_DEL_FLG = "" ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      P00362_A369TBM21_DEL_FLG = new String[] {""} ;
      P00362_n369TBM21_DEL_FLG = new boolean[] {false} ;
      P00362_A63TBM21_STUDY_ID = new long[1] ;
      P00362_A376TBM21_UPD_CNT = new long[1] ;
      P00362_n376TBM21_UPD_CNT = new boolean[] {false} ;
      P00362_A375TBM21_UPD_PROG_NM = new String[] {""} ;
      P00362_n375TBM21_UPD_PROG_NM = new boolean[] {false} ;
      P00362_A374TBM21_UPD_USER_ID = new String[] {""} ;
      P00362_n374TBM21_UPD_USER_ID = new boolean[] {false} ;
      P00362_A373TBM21_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P00362_n373TBM21_UPD_DATETIME = new boolean[] {false} ;
      P00362_A372TBM21_CRT_PROG_NM = new String[] {""} ;
      P00362_n372TBM21_CRT_PROG_NM = new boolean[] {false} ;
      P00362_A371TBM21_CRT_USER_ID = new String[] {""} ;
      P00362_n371TBM21_CRT_USER_ID = new boolean[] {false} ;
      P00362_A370TBM21_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P00362_n370TBM21_CRT_DATETIME = new boolean[] {false} ;
      P00362_A607TBM21_STATUS = new String[] {""} ;
      P00362_n607TBM21_STATUS = new boolean[] {false} ;
      P00362_A368TBM21_NOTE = new String[] {""} ;
      P00362_n368TBM21_NOTE = new boolean[] {false} ;
      P00362_A531TBM21_PROC_NM = new String[] {""} ;
      P00362_n531TBM21_PROC_NM = new boolean[] {false} ;
      P00362_A530TBM21_OUTER_STUDY_ID = new String[] {""} ;
      P00362_n530TBM21_OUTER_STUDY_ID = new boolean[] {false} ;
      P00362_A367TBM21_STUDY_NM = new String[] {""} ;
      P00362_n367TBM21_STUDY_NM = new boolean[] {false} ;
      A375TBM21_UPD_PROG_NM = "" ;
      A374TBM21_UPD_USER_ID = "" ;
      A373TBM21_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A372TBM21_CRT_PROG_NM = "" ;
      A371TBM21_CRT_USER_ID = "" ;
      A370TBM21_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A607TBM21_STATUS = "" ;
      A368TBM21_NOTE = "" ;
      A531TBM21_PROC_NM = "" ;
      A530TBM21_OUTER_STUDY_ID = "" ;
      A367TBM21_STUDY_NM = "" ;
      AV12W_STR = "" ;
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
      AV16W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV17W_MSG = "" ;
      AV21Pgmname = "" ;
      GXv_SdtB808_SD01_EXTRA_INFO25 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int26 = new short [1] ;
      GXv_char24 = new String [1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b599_pc11_study_res__default(),
         new Object[] {
             new Object[] {
            P00362_A369TBM21_DEL_FLG, P00362_n369TBM21_DEL_FLG, P00362_A63TBM21_STUDY_ID, P00362_A376TBM21_UPD_CNT, P00362_n376TBM21_UPD_CNT, P00362_A375TBM21_UPD_PROG_NM, P00362_n375TBM21_UPD_PROG_NM, P00362_A374TBM21_UPD_USER_ID, P00362_n374TBM21_UPD_USER_ID, P00362_A373TBM21_UPD_DATETIME,
            P00362_n373TBM21_UPD_DATETIME, P00362_A372TBM21_CRT_PROG_NM, P00362_n372TBM21_CRT_PROG_NM, P00362_A371TBM21_CRT_USER_ID, P00362_n371TBM21_CRT_USER_ID, P00362_A370TBM21_CRT_DATETIME, P00362_n370TBM21_CRT_DATETIME, P00362_A607TBM21_STATUS, P00362_n607TBM21_STATUS, P00362_A368TBM21_NOTE,
            P00362_n368TBM21_NOTE, P00362_A531TBM21_PROC_NM, P00362_n531TBM21_PROC_NM, P00362_A530TBM21_OUTER_STUDY_ID, P00362_n530TBM21_OUTER_STUDY_ID, P00362_A367TBM21_STUDY_NM, P00362_n367TBM21_STUDY_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV21Pgmname = "B599_PC11_STUDY_RES" ;
      /* GeneXus formulas. */
      AV21Pgmname = "B599_PC11_STUDY_RES" ;
      Gx_err = (short)(0) ;
   }

   private byte AV20GXLvl33 ;
   private short AV9W_RTN_CD ;
   private short Gx_err ;
   private short GXv_int26[] ;
   private int GXActiveErrHndl ;
   private long AV13W_STUDY_ID ;
   private long A63TBM21_STUDY_ID ;
   private long A376TBM21_UPD_CNT ;
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
   private String AV21Pgmname ;
   private String GXv_char24[] ;
   private String Gx_emsg ;
   private java.util.Date A373TBM21_UPD_DATETIME ;
   private java.util.Date A370TBM21_CRT_DATETIME ;
   private boolean returnInSub ;
   private boolean n369TBM21_DEL_FLG ;
   private boolean n376TBM21_UPD_CNT ;
   private boolean n375TBM21_UPD_PROG_NM ;
   private boolean n374TBM21_UPD_USER_ID ;
   private boolean n373TBM21_UPD_DATETIME ;
   private boolean n372TBM21_CRT_PROG_NM ;
   private boolean n371TBM21_CRT_USER_ID ;
   private boolean n370TBM21_CRT_DATETIME ;
   private boolean n607TBM21_STATUS ;
   private boolean n368TBM21_NOTE ;
   private boolean n531TBM21_PROC_NM ;
   private boolean n530TBM21_OUTER_STUDY_ID ;
   private boolean n367TBM21_STUDY_NM ;
   private String AV8P_STUDY_ID ;
   private String AV11W_RTN_MSG ;
   private String AV14C_APP_ID ;
   private String A369TBM21_DEL_FLG ;
   private String A375TBM21_UPD_PROG_NM ;
   private String A374TBM21_UPD_USER_ID ;
   private String A372TBM21_CRT_PROG_NM ;
   private String A371TBM21_CRT_USER_ID ;
   private String A607TBM21_STATUS ;
   private String A368TBM21_NOTE ;
   private String A531TBM21_PROC_NM ;
   private String A530TBM21_OUTER_STUDY_ID ;
   private String A367TBM21_STUDY_NM ;
   private String AV12W_STR ;
   private String AV17W_MSG ;
   private GxObjectCollection[] aP1 ;
   private short[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P00362_A369TBM21_DEL_FLG ;
   private boolean[] P00362_n369TBM21_DEL_FLG ;
   private long[] P00362_A63TBM21_STUDY_ID ;
   private long[] P00362_A376TBM21_UPD_CNT ;
   private boolean[] P00362_n376TBM21_UPD_CNT ;
   private String[] P00362_A375TBM21_UPD_PROG_NM ;
   private boolean[] P00362_n375TBM21_UPD_PROG_NM ;
   private String[] P00362_A374TBM21_UPD_USER_ID ;
   private boolean[] P00362_n374TBM21_UPD_USER_ID ;
   private java.util.Date[] P00362_A373TBM21_UPD_DATETIME ;
   private boolean[] P00362_n373TBM21_UPD_DATETIME ;
   private String[] P00362_A372TBM21_CRT_PROG_NM ;
   private boolean[] P00362_n372TBM21_CRT_PROG_NM ;
   private String[] P00362_A371TBM21_CRT_USER_ID ;
   private boolean[] P00362_n371TBM21_CRT_USER_ID ;
   private java.util.Date[] P00362_A370TBM21_CRT_DATETIME ;
   private boolean[] P00362_n370TBM21_CRT_DATETIME ;
   private String[] P00362_A607TBM21_STATUS ;
   private boolean[] P00362_n607TBM21_STATUS ;
   private String[] P00362_A368TBM21_NOTE ;
   private boolean[] P00362_n368TBM21_NOTE ;
   private String[] P00362_A531TBM21_PROC_NM ;
   private boolean[] P00362_n531TBM21_PROC_NM ;
   private String[] P00362_A530TBM21_OUTER_STUDY_ID ;
   private boolean[] P00362_n530TBM21_OUTER_STUDY_ID ;
   private String[] P00362_A367TBM21_STUDY_NM ;
   private boolean[] P00362_n367TBM21_STUDY_NM ;
   private GxObjectCollection AV10W_RTN_CSV ;
   private SdtB808_SD01_EXTRA_INFO AV15W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO25[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV16W_PARMS_ITEM ;
}

final  class b599_pc11_study_res__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P00362( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV8P_STUDY_ID ,
                                          long A63TBM21_STUDY_ID ,
                                          long AV13W_STUDY_ID ,
                                          String A369TBM21_DEL_FLG )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int27 ;
      GXv_int27 = new byte [1] ;
      Object[] GXv_Object28 ;
      GXv_Object28 = new Object [2] ;
      Gx_ope = "Declare" ;
      Gx_etb = "TBM21_STUDY" ;
      scmdbuf = "SELECT `TBM21_DEL_FLG`, `TBM21_STUDY_ID`, `TBM21_UPD_CNT`, `TBM21_UPD_PROG_NM`, `TBM21_UPD_USER_ID`," ;
      scmdbuf = scmdbuf + " `TBM21_UPD_DATETIME`, `TBM21_CRT_PROG_NM`, `TBM21_CRT_USER_ID`, `TBM21_CRT_DATETIME`," ;
      scmdbuf = scmdbuf + " `TBM21_STATUS`, `TBM21_NOTE`, `TBM21_PROC_NM`, `TBM21_OUTER_STUDY_ID`, `TBM21_STUDY_NM`" ;
      scmdbuf = scmdbuf + " FROM `TBM21_STUDY`" ;
      scmdbuf = scmdbuf + " WHERE (`TBM21_DEL_FLG` = '0')" ;
      if ( ! (GXutil.strcmp("", AV8P_STUDY_ID)==0) )
      {
         sWhereString = sWhereString + " and (`TBM21_STUDY_ID` = ?)" ;
      }
      else
      {
         GXv_int27[0] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TBM21_STUDY_ID`" ;
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
                  return conditional_P00362(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).longValue() , (String)dynConstraints[3] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00362", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
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
                  stmt.setLong(sIdx, ((Number) parms[1]).longValue());
               }
               return;
      }
   }

}

