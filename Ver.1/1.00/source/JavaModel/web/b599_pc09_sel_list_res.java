/*
               File: B599_PC09_SEL_LIST_RES
        Description: 選択リストマスタ取得
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:51:58.15
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b599_pc09_sel_list_res extends GXProcedure
{
   public b599_pc09_sel_list_res( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b599_pc09_sel_list_res.class ), "" );
   }

   public b599_pc09_sel_list_res( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( long aP0 ,
                             String aP1 ,
                             GxObjectCollection[] aP2 ,
                             short[] aP3 )
   {
      b599_pc09_sel_list_res.this.AV9P_STUDY_ID = aP0;
      b599_pc09_sel_list_res.this.AV8P_LIST_CD = aP1;
      b599_pc09_sel_list_res.this.AV11W_RTN_CSV = aP2[0];
      b599_pc09_sel_list_res.this.aP4 = new String[] {""};
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
      b599_pc09_sel_list_res.this.AV9P_STUDY_ID = aP0;
      b599_pc09_sel_list_res.this.AV8P_LIST_CD = aP1;
      b599_pc09_sel_list_res.this.AV11W_RTN_CSV = aP2[0];
      this.aP2 = aP2;
      b599_pc09_sel_list_res.this.aP3 = aP3;
      b599_pc09_sel_list_res.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV14C_APP_ID = "B599" ;
      AV10W_RTN_CD = (short)(0) ;
      AV12W_RTN_MSG = "" ;
      AV15W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV15W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV14C_APP_ID );
      /* Execute user subroutine: S1159 */
      S1159 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV20GXLvl31 = (byte)(0) ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV8P_LIST_CD ,
                                           A436TBM25_LIST_CD ,
                                           A438TBM25_DEL_FLG ,
                                           new Long(AV9P_STUDY_ID) ,
                                           new Long(A435TBM25_STUDY_ID) },
                                           new int[] {
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.LONG
                                           }
      });
      Gx_ope = "Fetch" ;
      Gx_etb = "TBM25_SEL_LIST" ;
      /* Using cursor P00232 */
      pr_default.execute(0, new Object[] {new Long(AV9P_STUDY_ID), AV8P_LIST_CD});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A438TBM25_DEL_FLG = P00232_A438TBM25_DEL_FLG[0] ;
         n438TBM25_DEL_FLG = P00232_n438TBM25_DEL_FLG[0] ;
         A436TBM25_LIST_CD = P00232_A436TBM25_LIST_CD[0] ;
         A435TBM25_STUDY_ID = P00232_A435TBM25_STUDY_ID[0] ;
         A445TBM25_UPD_CNT = P00232_A445TBM25_UPD_CNT[0] ;
         n445TBM25_UPD_CNT = P00232_n445TBM25_UPD_CNT[0] ;
         A444TBM25_UPD_PROG_NM = P00232_A444TBM25_UPD_PROG_NM[0] ;
         n444TBM25_UPD_PROG_NM = P00232_n444TBM25_UPD_PROG_NM[0] ;
         A443TBM25_UPD_USER_ID = P00232_A443TBM25_UPD_USER_ID[0] ;
         n443TBM25_UPD_USER_ID = P00232_n443TBM25_UPD_USER_ID[0] ;
         A442TBM25_UPD_DATETIME = P00232_A442TBM25_UPD_DATETIME[0] ;
         n442TBM25_UPD_DATETIME = P00232_n442TBM25_UPD_DATETIME[0] ;
         A441TBM25_CRT_PROG_NM = P00232_A441TBM25_CRT_PROG_NM[0] ;
         n441TBM25_CRT_PROG_NM = P00232_n441TBM25_CRT_PROG_NM[0] ;
         A440TBM25_CRT_USER_ID = P00232_A440TBM25_CRT_USER_ID[0] ;
         n440TBM25_CRT_USER_ID = P00232_n440TBM25_CRT_USER_ID[0] ;
         A439TBM25_CRT_DATETIME = P00232_A439TBM25_CRT_DATETIME[0] ;
         n439TBM25_CRT_DATETIME = P00232_n439TBM25_CRT_DATETIME[0] ;
         A437TBM25_LIST_NM = P00232_A437TBM25_LIST_NM[0] ;
         n437TBM25_LIST_NM = P00232_n437TBM25_LIST_NM[0] ;
         AV20GXLvl31 = (byte)(1) ;
         GXt_char1 = AV13W_STR ;
         GXv_char2[0] = GXt_char1 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A436TBM25_LIST_CD, GXv_char2) ;
         b599_pc09_sel_list_res.this.GXt_char1 = GXv_char2[0] ;
         GXt_char3 = AV13W_STR ;
         GXv_char4[0] = GXt_char3 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A437TBM25_LIST_NM, GXv_char4) ;
         b599_pc09_sel_list_res.this.GXt_char3 = GXv_char4[0] ;
         GXt_char5 = AV13W_STR ;
         GXv_char6[0] = GXt_char5 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A438TBM25_DEL_FLG, GXv_char6) ;
         b599_pc09_sel_list_res.this.GXt_char5 = GXv_char6[0] ;
         GXt_char7 = AV13W_STR ;
         GXv_char8[0] = GXt_char7 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A439TBM25_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char8) ;
         b599_pc09_sel_list_res.this.GXt_char7 = GXv_char8[0] ;
         GXt_char9 = AV13W_STR ;
         GXv_char10[0] = GXt_char9 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A440TBM25_CRT_USER_ID, GXv_char10) ;
         b599_pc09_sel_list_res.this.GXt_char9 = GXv_char10[0] ;
         GXt_char11 = AV13W_STR ;
         GXv_char12[0] = GXt_char11 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A441TBM25_CRT_PROG_NM, GXv_char12) ;
         b599_pc09_sel_list_res.this.GXt_char11 = GXv_char12[0] ;
         GXt_char13 = AV13W_STR ;
         GXv_char14[0] = GXt_char13 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A442TBM25_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char14) ;
         b599_pc09_sel_list_res.this.GXt_char13 = GXv_char14[0] ;
         GXt_char15 = AV13W_STR ;
         GXv_char16[0] = GXt_char15 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A443TBM25_UPD_USER_ID, GXv_char16) ;
         b599_pc09_sel_list_res.this.GXt_char15 = GXv_char16[0] ;
         GXt_char17 = AV13W_STR ;
         GXv_char18[0] = GXt_char17 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A444TBM25_UPD_PROG_NM, GXv_char18) ;
         b599_pc09_sel_list_res.this.GXt_char17 = GXv_char18[0] ;
         AV13W_STR = GXutil.trim( GXutil.str( A435TBM25_STUDY_ID, 10, 0)) + "," + GXt_char1 + "," + GXt_char3 + "," + GXt_char5 + "," + GXt_char7 + "," + GXt_char9 + "," + GXt_char11 + "," + GXt_char13 + "," + GXt_char15 + "," + GXt_char17 + "," + GXutil.trim( GXutil.str( A445TBM25_UPD_CNT, 10, 0)) ;
         AV11W_RTN_CSV.add(AV13W_STR, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV20GXLvl31 == 0 )
      {
         AV10W_RTN_CD = (short)(1) ;
         GXt_char17 = AV12W_RTN_MSG ;
         GXv_char18[0] = GXt_char17 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char18) ;
         b599_pc09_sel_list_res.this.GXt_char17 = GXv_char18[0] ;
         AV12W_RTN_MSG = GXt_char17 ;
      }
      cleanup();
   }

   public void S1159( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      AV15W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      AV16W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV16W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_STUDY_ID" );
      AV16W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( GXutil.trim( GXutil.str( AV9P_STUDY_ID, 10, 0)) );
      AV15W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV16W_PARMS_ITEM, 0);
      AV16W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV16W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_LIST_CD" );
      AV16W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV8P_LIST_CD );
      AV15W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV16W_PARMS_ITEM, 0);
      AV17W_MSG = "SUB_INIT" ;
      GXv_SdtB808_SD01_EXTRA_INFO19[0] = AV15W_EXTRA_INFO;
      GXv_int20[0] = AV10W_RTN_CD ;
      GXv_char18[0] = AV12W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV21Pgmname, (short)(1), AV17W_MSG, GXv_SdtB808_SD01_EXTRA_INFO19, GXv_int20, GXv_char18) ;
      AV15W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO19[0] ;
      b599_pc09_sel_list_res.this.AV10W_RTN_CD = GXv_int20[0] ;
      b599_pc09_sel_list_res.this.AV12W_RTN_MSG = GXv_char18[0] ;
   }

   public void S1283( )
   {
      /* 'SUB_ERROR' Routine */
      AV17W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO19[0] = AV15W_EXTRA_INFO;
      GXv_int20[0] = AV10W_RTN_CD ;
      GXv_char18[0] = AV12W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV21Pgmname, (short)(0), AV17W_MSG, GXv_SdtB808_SD01_EXTRA_INFO19, GXv_int20, GXv_char18) ;
      AV15W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO19[0] ;
      b599_pc09_sel_list_res.this.AV10W_RTN_CD = GXv_int20[0] ;
      b599_pc09_sel_list_res.this.AV12W_RTN_MSG = GXv_char18[0] ;
      context.globals.Gx_eop = (byte)(0) ;
   }

   protected void cleanup( )
   {
      this.aP2[0] = b599_pc09_sel_list_res.this.AV11W_RTN_CSV;
      this.aP3[0] = b599_pc09_sel_list_res.this.AV10W_RTN_CD;
      this.aP4[0] = b599_pc09_sel_list_res.this.AV12W_RTN_MSG;
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
      AV12W_RTN_MSG = "" ;
      AV14C_APP_ID = "" ;
      AV15W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      scmdbuf = "" ;
      A436TBM25_LIST_CD = "" ;
      A438TBM25_DEL_FLG = "" ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      P00232_A438TBM25_DEL_FLG = new String[] {""} ;
      P00232_n438TBM25_DEL_FLG = new boolean[] {false} ;
      P00232_A436TBM25_LIST_CD = new String[] {""} ;
      P00232_A435TBM25_STUDY_ID = new long[1] ;
      P00232_A445TBM25_UPD_CNT = new long[1] ;
      P00232_n445TBM25_UPD_CNT = new boolean[] {false} ;
      P00232_A444TBM25_UPD_PROG_NM = new String[] {""} ;
      P00232_n444TBM25_UPD_PROG_NM = new boolean[] {false} ;
      P00232_A443TBM25_UPD_USER_ID = new String[] {""} ;
      P00232_n443TBM25_UPD_USER_ID = new boolean[] {false} ;
      P00232_A442TBM25_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P00232_n442TBM25_UPD_DATETIME = new boolean[] {false} ;
      P00232_A441TBM25_CRT_PROG_NM = new String[] {""} ;
      P00232_n441TBM25_CRT_PROG_NM = new boolean[] {false} ;
      P00232_A440TBM25_CRT_USER_ID = new String[] {""} ;
      P00232_n440TBM25_CRT_USER_ID = new boolean[] {false} ;
      P00232_A439TBM25_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P00232_n439TBM25_CRT_DATETIME = new boolean[] {false} ;
      P00232_A437TBM25_LIST_NM = new String[] {""} ;
      P00232_n437TBM25_LIST_NM = new boolean[] {false} ;
      A444TBM25_UPD_PROG_NM = "" ;
      A443TBM25_UPD_USER_ID = "" ;
      A442TBM25_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A441TBM25_CRT_PROG_NM = "" ;
      A440TBM25_CRT_USER_ID = "" ;
      A439TBM25_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A437TBM25_LIST_NM = "" ;
      AV13W_STR = "" ;
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
      AV16W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV17W_MSG = "" ;
      AV21Pgmname = "" ;
      GXv_SdtB808_SD01_EXTRA_INFO19 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int20 = new short [1] ;
      GXv_char18 = new String [1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b599_pc09_sel_list_res__default(),
         new Object[] {
             new Object[] {
            P00232_A438TBM25_DEL_FLG, P00232_n438TBM25_DEL_FLG, P00232_A436TBM25_LIST_CD, P00232_A435TBM25_STUDY_ID, P00232_A445TBM25_UPD_CNT, P00232_n445TBM25_UPD_CNT, P00232_A444TBM25_UPD_PROG_NM, P00232_n444TBM25_UPD_PROG_NM, P00232_A443TBM25_UPD_USER_ID, P00232_n443TBM25_UPD_USER_ID,
            P00232_A442TBM25_UPD_DATETIME, P00232_n442TBM25_UPD_DATETIME, P00232_A441TBM25_CRT_PROG_NM, P00232_n441TBM25_CRT_PROG_NM, P00232_A440TBM25_CRT_USER_ID, P00232_n440TBM25_CRT_USER_ID, P00232_A439TBM25_CRT_DATETIME, P00232_n439TBM25_CRT_DATETIME, P00232_A437TBM25_LIST_NM, P00232_n437TBM25_LIST_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV21Pgmname = "B599_PC09_SEL_LIST_RES" ;
      /* GeneXus formulas. */
      AV21Pgmname = "B599_PC09_SEL_LIST_RES" ;
      Gx_err = (short)(0) ;
   }

   private byte AV20GXLvl31 ;
   private short AV10W_RTN_CD ;
   private short GXv_int20[] ;
   private short Gx_err ;
   private int GXActiveErrHndl ;
   private long AV9P_STUDY_ID ;
   private long A435TBM25_STUDY_ID ;
   private long A445TBM25_UPD_CNT ;
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
   private String AV21Pgmname ;
   private String GXv_char18[] ;
   private String Gx_emsg ;
   private java.util.Date A442TBM25_UPD_DATETIME ;
   private java.util.Date A439TBM25_CRT_DATETIME ;
   private boolean returnInSub ;
   private boolean n438TBM25_DEL_FLG ;
   private boolean n445TBM25_UPD_CNT ;
   private boolean n444TBM25_UPD_PROG_NM ;
   private boolean n443TBM25_UPD_USER_ID ;
   private boolean n442TBM25_UPD_DATETIME ;
   private boolean n441TBM25_CRT_PROG_NM ;
   private boolean n440TBM25_CRT_USER_ID ;
   private boolean n439TBM25_CRT_DATETIME ;
   private boolean n437TBM25_LIST_NM ;
   private String AV8P_LIST_CD ;
   private String AV12W_RTN_MSG ;
   private String AV14C_APP_ID ;
   private String A436TBM25_LIST_CD ;
   private String A438TBM25_DEL_FLG ;
   private String A444TBM25_UPD_PROG_NM ;
   private String A443TBM25_UPD_USER_ID ;
   private String A441TBM25_CRT_PROG_NM ;
   private String A440TBM25_CRT_USER_ID ;
   private String A437TBM25_LIST_NM ;
   private String AV13W_STR ;
   private String AV17W_MSG ;
   private GxObjectCollection[] aP2 ;
   private short[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P00232_A438TBM25_DEL_FLG ;
   private boolean[] P00232_n438TBM25_DEL_FLG ;
   private String[] P00232_A436TBM25_LIST_CD ;
   private long[] P00232_A435TBM25_STUDY_ID ;
   private long[] P00232_A445TBM25_UPD_CNT ;
   private boolean[] P00232_n445TBM25_UPD_CNT ;
   private String[] P00232_A444TBM25_UPD_PROG_NM ;
   private boolean[] P00232_n444TBM25_UPD_PROG_NM ;
   private String[] P00232_A443TBM25_UPD_USER_ID ;
   private boolean[] P00232_n443TBM25_UPD_USER_ID ;
   private java.util.Date[] P00232_A442TBM25_UPD_DATETIME ;
   private boolean[] P00232_n442TBM25_UPD_DATETIME ;
   private String[] P00232_A441TBM25_CRT_PROG_NM ;
   private boolean[] P00232_n441TBM25_CRT_PROG_NM ;
   private String[] P00232_A440TBM25_CRT_USER_ID ;
   private boolean[] P00232_n440TBM25_CRT_USER_ID ;
   private java.util.Date[] P00232_A439TBM25_CRT_DATETIME ;
   private boolean[] P00232_n439TBM25_CRT_DATETIME ;
   private String[] P00232_A437TBM25_LIST_NM ;
   private boolean[] P00232_n437TBM25_LIST_NM ;
   private GxObjectCollection AV11W_RTN_CSV ;
   private SdtB808_SD01_EXTRA_INFO AV15W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO19[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV16W_PARMS_ITEM ;
}

final  class b599_pc09_sel_list_res__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P00232( com.genexus.internet.HttpContext httpContext ,
                                          String AV8P_LIST_CD ,
                                          String A436TBM25_LIST_CD ,
                                          String A438TBM25_DEL_FLG ,
                                          long AV9P_STUDY_ID ,
                                          long A435TBM25_STUDY_ID )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int21 ;
      GXv_int21 = new byte [2] ;
      Object[] GXv_Object22 ;
      GXv_Object22 = new Object [2] ;
      Gx_ope = "Declare" ;
      Gx_etb = "TBM25_SEL_LIST" ;
      scmdbuf = "SELECT `TBM25_DEL_FLG`, `TBM25_LIST_CD`, `TBM25_STUDY_ID`, `TBM25_UPD_CNT`, `TBM25_UPD_PROG_NM`," ;
      scmdbuf = scmdbuf + " `TBM25_UPD_USER_ID`, `TBM25_UPD_DATETIME`, `TBM25_CRT_PROG_NM`, `TBM25_CRT_USER_ID`," ;
      scmdbuf = scmdbuf + " `TBM25_CRT_DATETIME`, `TBM25_LIST_NM` FROM `TBM25_SEL_LIST`" ;
      scmdbuf = scmdbuf + " WHERE (`TBM25_STUDY_ID` = ?)" ;
      scmdbuf = scmdbuf + " and (`TBM25_DEL_FLG` = '0')" ;
      if ( ! (GXutil.strcmp("", AV8P_LIST_CD)==0) )
      {
         sWhereString = sWhereString + " and (`TBM25_LIST_CD` = ?)" ;
      }
      else
      {
         GXv_int21[1] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TBM25_STUDY_ID`, `TBM25_LIST_CD`" ;
      GXv_Object22[0] = scmdbuf ;
      GXv_Object22[1] = GXv_int21 ;
      return GXv_Object22 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         com.genexus.internet.HttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_P00232(httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).longValue() , ((Number) dynConstraints[4]).longValue() );
      }
      return super.getDynamicStatement(cursor, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00232", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
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
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
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
                  stmt.setLong(sIdx, ((Number) parms[2]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[3], 20);
               }
               break;
      }
   }

}

