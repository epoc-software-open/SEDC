/*
               File: B599_PC14_SUBJECT_RES
        Description: ä≥é“ÉeÅ[ÉuÉãéÊìæ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:10.1
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b599_pc14_subject_res extends GXProcedure
{
   public b599_pc14_subject_res( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b599_pc14_subject_res.class ), "" );
   }

   public b599_pc14_subject_res( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( long aP0 ,
                             String aP1 ,
                             GxObjectCollection[] aP2 ,
                             short[] aP3 )
   {
      b599_pc14_subject_res.this.AV8P_STUDY_ID = aP0;
      b599_pc14_subject_res.this.AV9P_SUBJECT_ID = aP1;
      b599_pc14_subject_res.this.AV11W_RTN_CSV = aP2[0];
      b599_pc14_subject_res.this.aP4 = new String[] {""};
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
      b599_pc14_subject_res.this.AV8P_STUDY_ID = aP0;
      b599_pc14_subject_res.this.AV9P_SUBJECT_ID = aP1;
      b599_pc14_subject_res.this.AV11W_RTN_CSV = aP2[0];
      this.aP2 = aP2;
      b599_pc14_subject_res.this.aP3 = aP3;
      b599_pc14_subject_res.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15C_APP_ID = "B599" ;
      AV10W_RTN_CD = (short)(0) ;
      AV12W_RTN_MSG = "" ;
      AV16W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV16W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV15C_APP_ID );
      /* Execute user subroutine: S1161 */
      S1161 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV14W_SUBJECT_ID = (int)(GXutil.lval( AV9P_SUBJECT_ID)) ;
      AV21GXLvl33 = (byte)(0) ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV9P_SUBJECT_ID ,
                                           new Integer(A283TBT01_SUBJECT_ID) ,
                                           new Integer(AV14W_SUBJECT_ID) ,
                                           new Long(AV8P_STUDY_ID) ,
                                           new Long(A282TBT01_STUDY_ID) },
                                           new int[] {
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.LONG, TypeConstants.LONG
                                           }
      });
      Gx_ope = "Fetch" ;
      Gx_etb = "TBT01_SUBJECT" ;
      /* Using cursor P002R2 */
      pr_default.execute(0, new Object[] {new Long(AV8P_STUDY_ID), new Integer(AV14W_SUBJECT_ID)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A283TBT01_SUBJECT_ID = P002R2_A283TBT01_SUBJECT_ID[0] ;
         A282TBT01_STUDY_ID = P002R2_A282TBT01_STUDY_ID[0] ;
         A291TBT01_UPD_CNT = P002R2_A291TBT01_UPD_CNT[0] ;
         n291TBT01_UPD_CNT = P002R2_n291TBT01_UPD_CNT[0] ;
         A290TBT01_UPD_PROG_NM = P002R2_A290TBT01_UPD_PROG_NM[0] ;
         n290TBT01_UPD_PROG_NM = P002R2_n290TBT01_UPD_PROG_NM[0] ;
         A289TBT01_UPD_USER_ID = P002R2_A289TBT01_UPD_USER_ID[0] ;
         n289TBT01_UPD_USER_ID = P002R2_n289TBT01_UPD_USER_ID[0] ;
         A288TBT01_UPD_DATETIME = P002R2_A288TBT01_UPD_DATETIME[0] ;
         n288TBT01_UPD_DATETIME = P002R2_n288TBT01_UPD_DATETIME[0] ;
         A287TBT01_CRT_PROG_NM = P002R2_A287TBT01_CRT_PROG_NM[0] ;
         n287TBT01_CRT_PROG_NM = P002R2_n287TBT01_CRT_PROG_NM[0] ;
         A286TBT01_CRT_USER_ID = P002R2_A286TBT01_CRT_USER_ID[0] ;
         n286TBT01_CRT_USER_ID = P002R2_n286TBT01_CRT_USER_ID[0] ;
         A285TBT01_CRT_DATETIME = P002R2_A285TBT01_CRT_DATETIME[0] ;
         n285TBT01_CRT_DATETIME = P002R2_n285TBT01_CRT_DATETIME[0] ;
         A284TBT01_DEL_FLG = P002R2_A284TBT01_DEL_FLG[0] ;
         n284TBT01_DEL_FLG = P002R2_n284TBT01_DEL_FLG[0] ;
         A613TBT01_SITE_ID = P002R2_A613TBT01_SITE_ID[0] ;
         n613TBT01_SITE_ID = P002R2_n613TBT01_SITE_ID[0] ;
         A555TBT01_OUTER_SUBJECT_ID = P002R2_A555TBT01_OUTER_SUBJECT_ID[0] ;
         n555TBT01_OUTER_SUBJECT_ID = P002R2_n555TBT01_OUTER_SUBJECT_ID[0] ;
         AV21GXLvl33 = (byte)(1) ;
         GXt_char1 = AV13W_STR ;
         GXv_char2[0] = GXt_char1 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A555TBT01_OUTER_SUBJECT_ID, GXv_char2) ;
         b599_pc14_subject_res.this.GXt_char1 = GXv_char2[0] ;
         GXt_char3 = AV13W_STR ;
         GXv_char4[0] = GXt_char3 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A613TBT01_SITE_ID, GXv_char4) ;
         b599_pc14_subject_res.this.GXt_char3 = GXv_char4[0] ;
         GXt_char5 = AV13W_STR ;
         GXv_char6[0] = GXt_char5 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A284TBT01_DEL_FLG, GXv_char6) ;
         b599_pc14_subject_res.this.GXt_char5 = GXv_char6[0] ;
         GXt_char7 = AV13W_STR ;
         GXv_char8[0] = GXt_char7 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A285TBT01_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char8) ;
         b599_pc14_subject_res.this.GXt_char7 = GXv_char8[0] ;
         GXt_char9 = AV13W_STR ;
         GXv_char10[0] = GXt_char9 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A286TBT01_CRT_USER_ID, GXv_char10) ;
         b599_pc14_subject_res.this.GXt_char9 = GXv_char10[0] ;
         GXt_char11 = AV13W_STR ;
         GXv_char12[0] = GXt_char11 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A287TBT01_CRT_PROG_NM, GXv_char12) ;
         b599_pc14_subject_res.this.GXt_char11 = GXv_char12[0] ;
         GXt_char13 = AV13W_STR ;
         GXv_char14[0] = GXt_char13 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A288TBT01_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char14) ;
         b599_pc14_subject_res.this.GXt_char13 = GXv_char14[0] ;
         GXt_char15 = AV13W_STR ;
         GXv_char16[0] = GXt_char15 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A289TBT01_UPD_USER_ID, GXv_char16) ;
         b599_pc14_subject_res.this.GXt_char15 = GXv_char16[0] ;
         GXt_char17 = AV13W_STR ;
         GXv_char18[0] = GXt_char17 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A290TBT01_UPD_PROG_NM, GXv_char18) ;
         b599_pc14_subject_res.this.GXt_char17 = GXv_char18[0] ;
         AV13W_STR = GXutil.trim( GXutil.str( A282TBT01_STUDY_ID, 10, 0)) + "," + GXutil.trim( GXutil.str( A283TBT01_SUBJECT_ID, 10, 0)) + "," + GXt_char1 + "," + GXt_char3 + "," + GXt_char5 + "," + GXt_char7 + "," + GXt_char9 + "," + GXt_char11 + "," + GXt_char13 + "," + GXt_char15 + "," + GXt_char17 + "," + GXutil.trim( GXutil.str( A291TBT01_UPD_CNT, 10, 0)) ;
         AV11W_RTN_CSV.add(AV13W_STR, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV21GXLvl33 == 0 )
      {
         AV10W_RTN_CD = (short)(1) ;
         GXt_char17 = AV12W_RTN_MSG ;
         GXv_char18[0] = GXt_char17 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char18) ;
         b599_pc14_subject_res.this.GXt_char17 = GXv_char18[0] ;
         AV12W_RTN_MSG = GXt_char17 ;
      }
      cleanup();
   }

   public void S1161( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      AV16W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      AV17W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV17W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_STUDY_ID" );
      AV17W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( GXutil.trim( GXutil.str( AV8P_STUDY_ID, 10, 0)) );
      AV16W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV17W_PARMS_ITEM, 0);
      AV17W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV17W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_SUBJECT_ID" );
      AV17W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV9P_SUBJECT_ID );
      AV16W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV17W_PARMS_ITEM, 0);
      AV18W_MSG = "SUB_INIT" ;
      GXv_SdtB808_SD01_EXTRA_INFO19[0] = AV16W_EXTRA_INFO;
      GXv_int20[0] = AV10W_RTN_CD ;
      GXv_char18[0] = AV12W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV22Pgmname, (short)(1), AV18W_MSG, GXv_SdtB808_SD01_EXTRA_INFO19, GXv_int20, GXv_char18) ;
      AV16W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO19[0] ;
      b599_pc14_subject_res.this.AV10W_RTN_CD = GXv_int20[0] ;
      b599_pc14_subject_res.this.AV12W_RTN_MSG = GXv_char18[0] ;
   }

   public void S1285( )
   {
      /* 'SUB_ERROR' Routine */
      AV18W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO19[0] = AV16W_EXTRA_INFO;
      GXv_int20[0] = AV10W_RTN_CD ;
      GXv_char18[0] = AV12W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV22Pgmname, (short)(0), AV18W_MSG, GXv_SdtB808_SD01_EXTRA_INFO19, GXv_int20, GXv_char18) ;
      AV16W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO19[0] ;
      b599_pc14_subject_res.this.AV10W_RTN_CD = GXv_int20[0] ;
      b599_pc14_subject_res.this.AV12W_RTN_MSG = GXv_char18[0] ;
      context.globals.Gx_eop = (byte)(0) ;
   }

   protected void cleanup( )
   {
      this.aP2[0] = b599_pc14_subject_res.this.AV11W_RTN_CSV;
      this.aP3[0] = b599_pc14_subject_res.this.AV10W_RTN_CD;
      this.aP4[0] = b599_pc14_subject_res.this.AV12W_RTN_MSG;
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
                  /* Execute user subroutine: S1285 */
                  S1285 ();
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
      AV15C_APP_ID = "" ;
      AV16W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      scmdbuf = "" ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      P002R2_A283TBT01_SUBJECT_ID = new int[1] ;
      P002R2_A282TBT01_STUDY_ID = new long[1] ;
      P002R2_A291TBT01_UPD_CNT = new long[1] ;
      P002R2_n291TBT01_UPD_CNT = new boolean[] {false} ;
      P002R2_A290TBT01_UPD_PROG_NM = new String[] {""} ;
      P002R2_n290TBT01_UPD_PROG_NM = new boolean[] {false} ;
      P002R2_A289TBT01_UPD_USER_ID = new String[] {""} ;
      P002R2_n289TBT01_UPD_USER_ID = new boolean[] {false} ;
      P002R2_A288TBT01_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P002R2_n288TBT01_UPD_DATETIME = new boolean[] {false} ;
      P002R2_A287TBT01_CRT_PROG_NM = new String[] {""} ;
      P002R2_n287TBT01_CRT_PROG_NM = new boolean[] {false} ;
      P002R2_A286TBT01_CRT_USER_ID = new String[] {""} ;
      P002R2_n286TBT01_CRT_USER_ID = new boolean[] {false} ;
      P002R2_A285TBT01_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P002R2_n285TBT01_CRT_DATETIME = new boolean[] {false} ;
      P002R2_A284TBT01_DEL_FLG = new String[] {""} ;
      P002R2_n284TBT01_DEL_FLG = new boolean[] {false} ;
      P002R2_A613TBT01_SITE_ID = new String[] {""} ;
      P002R2_n613TBT01_SITE_ID = new boolean[] {false} ;
      P002R2_A555TBT01_OUTER_SUBJECT_ID = new String[] {""} ;
      P002R2_n555TBT01_OUTER_SUBJECT_ID = new boolean[] {false} ;
      A290TBT01_UPD_PROG_NM = "" ;
      A289TBT01_UPD_USER_ID = "" ;
      A288TBT01_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A287TBT01_CRT_PROG_NM = "" ;
      A286TBT01_CRT_USER_ID = "" ;
      A285TBT01_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A284TBT01_DEL_FLG = "" ;
      A613TBT01_SITE_ID = "" ;
      A555TBT01_OUTER_SUBJECT_ID = "" ;
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
      AV17W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV18W_MSG = "" ;
      AV22Pgmname = "" ;
      GXv_SdtB808_SD01_EXTRA_INFO19 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int20 = new short [1] ;
      GXv_char18 = new String [1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b599_pc14_subject_res__default(),
         new Object[] {
             new Object[] {
            P002R2_A283TBT01_SUBJECT_ID, P002R2_A282TBT01_STUDY_ID, P002R2_A291TBT01_UPD_CNT, P002R2_n291TBT01_UPD_CNT, P002R2_A290TBT01_UPD_PROG_NM, P002R2_n290TBT01_UPD_PROG_NM, P002R2_A289TBT01_UPD_USER_ID, P002R2_n289TBT01_UPD_USER_ID, P002R2_A288TBT01_UPD_DATETIME, P002R2_n288TBT01_UPD_DATETIME,
            P002R2_A287TBT01_CRT_PROG_NM, P002R2_n287TBT01_CRT_PROG_NM, P002R2_A286TBT01_CRT_USER_ID, P002R2_n286TBT01_CRT_USER_ID, P002R2_A285TBT01_CRT_DATETIME, P002R2_n285TBT01_CRT_DATETIME, P002R2_A284TBT01_DEL_FLG, P002R2_n284TBT01_DEL_FLG, P002R2_A613TBT01_SITE_ID, P002R2_n613TBT01_SITE_ID,
            P002R2_A555TBT01_OUTER_SUBJECT_ID, P002R2_n555TBT01_OUTER_SUBJECT_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV22Pgmname = "B599_PC14_SUBJECT_RES" ;
      /* GeneXus formulas. */
      AV22Pgmname = "B599_PC14_SUBJECT_RES" ;
      Gx_err = (short)(0) ;
   }

   private byte AV21GXLvl33 ;
   private short AV10W_RTN_CD ;
   private short GXv_int20[] ;
   private short Gx_err ;
   private int AV14W_SUBJECT_ID ;
   private int A283TBT01_SUBJECT_ID ;
   private int GXActiveErrHndl ;
   private long AV8P_STUDY_ID ;
   private long A282TBT01_STUDY_ID ;
   private long A291TBT01_UPD_CNT ;
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
   private String AV22Pgmname ;
   private String GXv_char18[] ;
   private String Gx_emsg ;
   private java.util.Date A288TBT01_UPD_DATETIME ;
   private java.util.Date A285TBT01_CRT_DATETIME ;
   private boolean returnInSub ;
   private boolean n291TBT01_UPD_CNT ;
   private boolean n290TBT01_UPD_PROG_NM ;
   private boolean n289TBT01_UPD_USER_ID ;
   private boolean n288TBT01_UPD_DATETIME ;
   private boolean n287TBT01_CRT_PROG_NM ;
   private boolean n286TBT01_CRT_USER_ID ;
   private boolean n285TBT01_CRT_DATETIME ;
   private boolean n284TBT01_DEL_FLG ;
   private boolean n613TBT01_SITE_ID ;
   private boolean n555TBT01_OUTER_SUBJECT_ID ;
   private String AV9P_SUBJECT_ID ;
   private String AV12W_RTN_MSG ;
   private String AV15C_APP_ID ;
   private String A290TBT01_UPD_PROG_NM ;
   private String A289TBT01_UPD_USER_ID ;
   private String A287TBT01_CRT_PROG_NM ;
   private String A286TBT01_CRT_USER_ID ;
   private String A284TBT01_DEL_FLG ;
   private String A613TBT01_SITE_ID ;
   private String A555TBT01_OUTER_SUBJECT_ID ;
   private String AV13W_STR ;
   private String AV18W_MSG ;
   private GxObjectCollection[] aP2 ;
   private short[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P002R2_A283TBT01_SUBJECT_ID ;
   private long[] P002R2_A282TBT01_STUDY_ID ;
   private long[] P002R2_A291TBT01_UPD_CNT ;
   private boolean[] P002R2_n291TBT01_UPD_CNT ;
   private String[] P002R2_A290TBT01_UPD_PROG_NM ;
   private boolean[] P002R2_n290TBT01_UPD_PROG_NM ;
   private String[] P002R2_A289TBT01_UPD_USER_ID ;
   private boolean[] P002R2_n289TBT01_UPD_USER_ID ;
   private java.util.Date[] P002R2_A288TBT01_UPD_DATETIME ;
   private boolean[] P002R2_n288TBT01_UPD_DATETIME ;
   private String[] P002R2_A287TBT01_CRT_PROG_NM ;
   private boolean[] P002R2_n287TBT01_CRT_PROG_NM ;
   private String[] P002R2_A286TBT01_CRT_USER_ID ;
   private boolean[] P002R2_n286TBT01_CRT_USER_ID ;
   private java.util.Date[] P002R2_A285TBT01_CRT_DATETIME ;
   private boolean[] P002R2_n285TBT01_CRT_DATETIME ;
   private String[] P002R2_A284TBT01_DEL_FLG ;
   private boolean[] P002R2_n284TBT01_DEL_FLG ;
   private String[] P002R2_A613TBT01_SITE_ID ;
   private boolean[] P002R2_n613TBT01_SITE_ID ;
   private String[] P002R2_A555TBT01_OUTER_SUBJECT_ID ;
   private boolean[] P002R2_n555TBT01_OUTER_SUBJECT_ID ;
   private GxObjectCollection AV11W_RTN_CSV ;
   private SdtB808_SD01_EXTRA_INFO AV16W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO19[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV17W_PARMS_ITEM ;
}

final  class b599_pc14_subject_res__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P002R2( com.genexus.internet.HttpContext httpContext ,
                                          String AV9P_SUBJECT_ID ,
                                          int A283TBT01_SUBJECT_ID ,
                                          int AV14W_SUBJECT_ID ,
                                          long AV8P_STUDY_ID ,
                                          long A282TBT01_STUDY_ID )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int21 ;
      GXv_int21 = new byte [2] ;
      Object[] GXv_Object22 ;
      GXv_Object22 = new Object [2] ;
      Gx_ope = "Declare" ;
      Gx_etb = "TBT01_SUBJECT" ;
      scmdbuf = "SELECT `TBT01_SUBJECT_ID`, `TBT01_STUDY_ID`, `TBT01_UPD_CNT`, `TBT01_UPD_PROG_NM`," ;
      scmdbuf = scmdbuf + " `TBT01_UPD_USER_ID`, `TBT01_UPD_DATETIME`, `TBT01_CRT_PROG_NM`, `TBT01_CRT_USER_ID`," ;
      scmdbuf = scmdbuf + " `TBT01_CRT_DATETIME`, `TBT01_DEL_FLG`, `TBT01_SITE_ID`, `TBT01_OUTER_SUBJECT_ID`" ;
      scmdbuf = scmdbuf + " FROM `TBT01_SUBJECT`" ;
      scmdbuf = scmdbuf + " WHERE (`TBT01_STUDY_ID` = ?)" ;
      if ( ! (GXutil.strcmp("", AV9P_SUBJECT_ID)==0) )
      {
         sWhereString = sWhereString + " and (`TBT01_SUBJECT_ID` = ?)" ;
      }
      else
      {
         GXv_int21[1] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TBT01_STUDY_ID`, `TBT01_SUBJECT_ID`" ;
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
                  return conditional_P002R2(httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).longValue() , ((Number) dynConstraints[4]).longValue() );
      }
      return super.getDynamicStatement(cursor, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P002R2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDateTime(9) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
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
                  stmt.setInt(sIdx, ((Number) parms[3]).intValue());
               }
               break;
      }
   }

}

