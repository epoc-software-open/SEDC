/*
               File: B599_PC11_STUDY_RES
        Description: ŽŽŒ±ƒ}ƒXƒ^Žæ“¾
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:20.55
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
      /* Execute user subroutine: S1163 */
      S1163 ();
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
                                           new Long(A186TBM21_STUDY_ID) ,
                                           new Long(AV13W_STUDY_ID) ,
                                           A189TBM21_DEL_FLG },
                                           new int[] {
                                           TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      Gx_ope = "Fetch" ;
      Gx_etb = "TBM21_STUDY" ;
      /* Using cursor P00382 */
      pr_default.execute(0, new Object[] {new Long(AV13W_STUDY_ID)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A189TBM21_DEL_FLG = P00382_A189TBM21_DEL_FLG[0] ;
         n189TBM21_DEL_FLG = P00382_n189TBM21_DEL_FLG[0] ;
         A186TBM21_STUDY_ID = P00382_A186TBM21_STUDY_ID[0] ;
         A196TBM21_UPD_CNT = P00382_A196TBM21_UPD_CNT[0] ;
         n196TBM21_UPD_CNT = P00382_n196TBM21_UPD_CNT[0] ;
         A195TBM21_UPD_PROG_NM = P00382_A195TBM21_UPD_PROG_NM[0] ;
         n195TBM21_UPD_PROG_NM = P00382_n195TBM21_UPD_PROG_NM[0] ;
         A194TBM21_UPD_USER_ID = P00382_A194TBM21_UPD_USER_ID[0] ;
         n194TBM21_UPD_USER_ID = P00382_n194TBM21_UPD_USER_ID[0] ;
         A193TBM21_UPD_DATETIME = P00382_A193TBM21_UPD_DATETIME[0] ;
         n193TBM21_UPD_DATETIME = P00382_n193TBM21_UPD_DATETIME[0] ;
         A192TBM21_CRT_PROG_NM = P00382_A192TBM21_CRT_PROG_NM[0] ;
         n192TBM21_CRT_PROG_NM = P00382_n192TBM21_CRT_PROG_NM[0] ;
         A191TBM21_CRT_USER_ID = P00382_A191TBM21_CRT_USER_ID[0] ;
         n191TBM21_CRT_USER_ID = P00382_n191TBM21_CRT_USER_ID[0] ;
         A190TBM21_CRT_DATETIME = P00382_A190TBM21_CRT_DATETIME[0] ;
         n190TBM21_CRT_DATETIME = P00382_n190TBM21_CRT_DATETIME[0] ;
         A513TBM21_STATUS = P00382_A513TBM21_STATUS[0] ;
         n513TBM21_STATUS = P00382_n513TBM21_STATUS[0] ;
         A188TBM21_NOTE = P00382_A188TBM21_NOTE[0] ;
         n188TBM21_NOTE = P00382_n188TBM21_NOTE[0] ;
         A409TBM21_PROC_NM = P00382_A409TBM21_PROC_NM[0] ;
         n409TBM21_PROC_NM = P00382_n409TBM21_PROC_NM[0] ;
         A408TBM21_OUTER_STUDY_ID = P00382_A408TBM21_OUTER_STUDY_ID[0] ;
         n408TBM21_OUTER_STUDY_ID = P00382_n408TBM21_OUTER_STUDY_ID[0] ;
         A187TBM21_STUDY_NM = P00382_A187TBM21_STUDY_NM[0] ;
         n187TBM21_STUDY_NM = P00382_n187TBM21_STUDY_NM[0] ;
         AV20GXLvl33 = (byte)(1) ;
         GXt_char1 = AV12W_STR ;
         GXv_char2[0] = GXt_char1 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A187TBM21_STUDY_NM, GXv_char2) ;
         b599_pc11_study_res.this.GXt_char1 = GXv_char2[0] ;
         GXt_char3 = AV12W_STR ;
         GXv_char4[0] = GXt_char3 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A408TBM21_OUTER_STUDY_ID, GXv_char4) ;
         b599_pc11_study_res.this.GXt_char3 = GXv_char4[0] ;
         GXt_char5 = AV12W_STR ;
         GXv_char6[0] = GXt_char5 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A409TBM21_PROC_NM, GXv_char6) ;
         b599_pc11_study_res.this.GXt_char5 = GXv_char6[0] ;
         GXt_char7 = AV12W_STR ;
         GXv_char8[0] = GXt_char7 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A188TBM21_NOTE, GXv_char8) ;
         b599_pc11_study_res.this.GXt_char7 = GXv_char8[0] ;
         GXt_char9 = AV12W_STR ;
         GXv_char10[0] = GXt_char9 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A513TBM21_STATUS, GXv_char10) ;
         b599_pc11_study_res.this.GXt_char9 = GXv_char10[0] ;
         GXt_char11 = AV12W_STR ;
         GXv_char12[0] = GXt_char11 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A189TBM21_DEL_FLG, GXv_char12) ;
         b599_pc11_study_res.this.GXt_char11 = GXv_char12[0] ;
         GXt_char13 = AV12W_STR ;
         GXv_char14[0] = GXt_char13 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A190TBM21_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char14) ;
         b599_pc11_study_res.this.GXt_char13 = GXv_char14[0] ;
         GXt_char15 = AV12W_STR ;
         GXv_char16[0] = GXt_char15 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A191TBM21_CRT_USER_ID, GXv_char16) ;
         b599_pc11_study_res.this.GXt_char15 = GXv_char16[0] ;
         GXt_char17 = AV12W_STR ;
         GXv_char18[0] = GXt_char17 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A192TBM21_CRT_PROG_NM, GXv_char18) ;
         b599_pc11_study_res.this.GXt_char17 = GXv_char18[0] ;
         GXt_char19 = AV12W_STR ;
         GXv_char20[0] = GXt_char19 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A193TBM21_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char20) ;
         b599_pc11_study_res.this.GXt_char19 = GXv_char20[0] ;
         GXt_char21 = AV12W_STR ;
         GXv_char22[0] = GXt_char21 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A194TBM21_UPD_USER_ID, GXv_char22) ;
         b599_pc11_study_res.this.GXt_char21 = GXv_char22[0] ;
         GXt_char23 = AV12W_STR ;
         GXv_char24[0] = GXt_char23 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A195TBM21_UPD_PROG_NM, GXv_char24) ;
         b599_pc11_study_res.this.GXt_char23 = GXv_char24[0] ;
         AV12W_STR = GXutil.trim( GXutil.str( A186TBM21_STUDY_ID, 10, 0)) + "," + GXt_char1 + "," + GXt_char3 + "," + GXt_char5 + "," + GXt_char7 + "," + GXt_char9 + "," + GXt_char11 + "," + GXt_char13 + "," + GXt_char15 + "," + GXt_char17 + "," + GXt_char19 + "," + GXt_char21 + "," + GXt_char23 + "," + GXutil.trim( GXutil.str( A196TBM21_UPD_CNT, 10, 0)) ;
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

   public void S1163( )
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

   public void S1283( )
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
                  /* Execute user subroutine: S1283 */
                  S1283 ();
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
      A189TBM21_DEL_FLG = "" ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      P00382_A189TBM21_DEL_FLG = new String[] {""} ;
      P00382_n189TBM21_DEL_FLG = new boolean[] {false} ;
      P00382_A186TBM21_STUDY_ID = new long[1] ;
      P00382_A196TBM21_UPD_CNT = new long[1] ;
      P00382_n196TBM21_UPD_CNT = new boolean[] {false} ;
      P00382_A195TBM21_UPD_PROG_NM = new String[] {""} ;
      P00382_n195TBM21_UPD_PROG_NM = new boolean[] {false} ;
      P00382_A194TBM21_UPD_USER_ID = new String[] {""} ;
      P00382_n194TBM21_UPD_USER_ID = new boolean[] {false} ;
      P00382_A193TBM21_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P00382_n193TBM21_UPD_DATETIME = new boolean[] {false} ;
      P00382_A192TBM21_CRT_PROG_NM = new String[] {""} ;
      P00382_n192TBM21_CRT_PROG_NM = new boolean[] {false} ;
      P00382_A191TBM21_CRT_USER_ID = new String[] {""} ;
      P00382_n191TBM21_CRT_USER_ID = new boolean[] {false} ;
      P00382_A190TBM21_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P00382_n190TBM21_CRT_DATETIME = new boolean[] {false} ;
      P00382_A513TBM21_STATUS = new String[] {""} ;
      P00382_n513TBM21_STATUS = new boolean[] {false} ;
      P00382_A188TBM21_NOTE = new String[] {""} ;
      P00382_n188TBM21_NOTE = new boolean[] {false} ;
      P00382_A409TBM21_PROC_NM = new String[] {""} ;
      P00382_n409TBM21_PROC_NM = new boolean[] {false} ;
      P00382_A408TBM21_OUTER_STUDY_ID = new String[] {""} ;
      P00382_n408TBM21_OUTER_STUDY_ID = new boolean[] {false} ;
      P00382_A187TBM21_STUDY_NM = new String[] {""} ;
      P00382_n187TBM21_STUDY_NM = new boolean[] {false} ;
      A195TBM21_UPD_PROG_NM = "" ;
      A194TBM21_UPD_USER_ID = "" ;
      A193TBM21_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A192TBM21_CRT_PROG_NM = "" ;
      A191TBM21_CRT_USER_ID = "" ;
      A190TBM21_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A513TBM21_STATUS = "" ;
      A188TBM21_NOTE = "" ;
      A409TBM21_PROC_NM = "" ;
      A408TBM21_OUTER_STUDY_ID = "" ;
      A187TBM21_STUDY_NM = "" ;
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
            P00382_A189TBM21_DEL_FLG, P00382_n189TBM21_DEL_FLG, P00382_A186TBM21_STUDY_ID, P00382_A196TBM21_UPD_CNT, P00382_n196TBM21_UPD_CNT, P00382_A195TBM21_UPD_PROG_NM, P00382_n195TBM21_UPD_PROG_NM, P00382_A194TBM21_UPD_USER_ID, P00382_n194TBM21_UPD_USER_ID, P00382_A193TBM21_UPD_DATETIME,
            P00382_n193TBM21_UPD_DATETIME, P00382_A192TBM21_CRT_PROG_NM, P00382_n192TBM21_CRT_PROG_NM, P00382_A191TBM21_CRT_USER_ID, P00382_n191TBM21_CRT_USER_ID, P00382_A190TBM21_CRT_DATETIME, P00382_n190TBM21_CRT_DATETIME, P00382_A513TBM21_STATUS, P00382_n513TBM21_STATUS, P00382_A188TBM21_NOTE,
            P00382_n188TBM21_NOTE, P00382_A409TBM21_PROC_NM, P00382_n409TBM21_PROC_NM, P00382_A408TBM21_OUTER_STUDY_ID, P00382_n408TBM21_OUTER_STUDY_ID, P00382_A187TBM21_STUDY_NM, P00382_n187TBM21_STUDY_NM
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
   private short GXv_int26[] ;
   private short Gx_err ;
   private int GXActiveErrHndl ;
   private long AV13W_STUDY_ID ;
   private long A186TBM21_STUDY_ID ;
   private long A196TBM21_UPD_CNT ;
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
   private java.util.Date A193TBM21_UPD_DATETIME ;
   private java.util.Date A190TBM21_CRT_DATETIME ;
   private boolean returnInSub ;
   private boolean n189TBM21_DEL_FLG ;
   private boolean n196TBM21_UPD_CNT ;
   private boolean n195TBM21_UPD_PROG_NM ;
   private boolean n194TBM21_UPD_USER_ID ;
   private boolean n193TBM21_UPD_DATETIME ;
   private boolean n192TBM21_CRT_PROG_NM ;
   private boolean n191TBM21_CRT_USER_ID ;
   private boolean n190TBM21_CRT_DATETIME ;
   private boolean n513TBM21_STATUS ;
   private boolean n188TBM21_NOTE ;
   private boolean n409TBM21_PROC_NM ;
   private boolean n408TBM21_OUTER_STUDY_ID ;
   private boolean n187TBM21_STUDY_NM ;
   private String AV8P_STUDY_ID ;
   private String AV11W_RTN_MSG ;
   private String AV14C_APP_ID ;
   private String A189TBM21_DEL_FLG ;
   private String A195TBM21_UPD_PROG_NM ;
   private String A194TBM21_UPD_USER_ID ;
   private String A192TBM21_CRT_PROG_NM ;
   private String A191TBM21_CRT_USER_ID ;
   private String A513TBM21_STATUS ;
   private String A188TBM21_NOTE ;
   private String A409TBM21_PROC_NM ;
   private String A408TBM21_OUTER_STUDY_ID ;
   private String A187TBM21_STUDY_NM ;
   private String AV12W_STR ;
   private String AV17W_MSG ;
   private GxObjectCollection[] aP1 ;
   private short[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P00382_A189TBM21_DEL_FLG ;
   private boolean[] P00382_n189TBM21_DEL_FLG ;
   private long[] P00382_A186TBM21_STUDY_ID ;
   private long[] P00382_A196TBM21_UPD_CNT ;
   private boolean[] P00382_n196TBM21_UPD_CNT ;
   private String[] P00382_A195TBM21_UPD_PROG_NM ;
   private boolean[] P00382_n195TBM21_UPD_PROG_NM ;
   private String[] P00382_A194TBM21_UPD_USER_ID ;
   private boolean[] P00382_n194TBM21_UPD_USER_ID ;
   private java.util.Date[] P00382_A193TBM21_UPD_DATETIME ;
   private boolean[] P00382_n193TBM21_UPD_DATETIME ;
   private String[] P00382_A192TBM21_CRT_PROG_NM ;
   private boolean[] P00382_n192TBM21_CRT_PROG_NM ;
   private String[] P00382_A191TBM21_CRT_USER_ID ;
   private boolean[] P00382_n191TBM21_CRT_USER_ID ;
   private java.util.Date[] P00382_A190TBM21_CRT_DATETIME ;
   private boolean[] P00382_n190TBM21_CRT_DATETIME ;
   private String[] P00382_A513TBM21_STATUS ;
   private boolean[] P00382_n513TBM21_STATUS ;
   private String[] P00382_A188TBM21_NOTE ;
   private boolean[] P00382_n188TBM21_NOTE ;
   private String[] P00382_A409TBM21_PROC_NM ;
   private boolean[] P00382_n409TBM21_PROC_NM ;
   private String[] P00382_A408TBM21_OUTER_STUDY_ID ;
   private boolean[] P00382_n408TBM21_OUTER_STUDY_ID ;
   private String[] P00382_A187TBM21_STUDY_NM ;
   private boolean[] P00382_n187TBM21_STUDY_NM ;
   private GxObjectCollection AV10W_RTN_CSV ;
   private SdtB808_SD01_EXTRA_INFO AV15W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO25[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV16W_PARMS_ITEM ;
}

final  class b599_pc11_study_res__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P00382( com.genexus.internet.HttpContext httpContext ,
                                          String AV8P_STUDY_ID ,
                                          long A186TBM21_STUDY_ID ,
                                          long AV13W_STUDY_ID ,
                                          String A189TBM21_DEL_FLG )
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
                                         com.genexus.internet.HttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_P00382(httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).longValue() , (String)dynConstraints[3] );
      }
      return super.getDynamicStatement(cursor, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00382", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
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
                  stmt.setLong(sIdx, ((Number) parms[1]).longValue());
               }
               break;
      }
   }

}

