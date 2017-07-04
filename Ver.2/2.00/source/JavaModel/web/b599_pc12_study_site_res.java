/*
               File: B599_PC12_STUDY_SITE_RES
        Description: ééå±é¿é{é{ê›É}ÉXÉ^éÊìæ
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:12:54.76
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b599_pc12_study_site_res extends GXProcedure
{
   public b599_pc12_study_site_res( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b599_pc12_study_site_res.class ), "" );
   }

   public b599_pc12_study_site_res( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( long aP0 ,
                             String aP1 ,
                             GxObjectCollection[] aP2 ,
                             short[] aP3 )
   {
      b599_pc12_study_site_res.this.AV9P_STUDY_ID = aP0;
      b599_pc12_study_site_res.this.AV8P_SITE_ID = aP1;
      b599_pc12_study_site_res.this.AV11W_RTN_CSV = aP2[0];
      this.aP2 = aP2;
      b599_pc12_study_site_res.this.aP3 = aP3;
      b599_pc12_study_site_res.this.aP4 = aP4;
      b599_pc12_study_site_res.this.aP4 = new String[] {""};
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
      b599_pc12_study_site_res.this.AV9P_STUDY_ID = aP0;
      b599_pc12_study_site_res.this.AV8P_SITE_ID = aP1;
      b599_pc12_study_site_res.this.AV11W_RTN_CSV = aP2[0];
      this.aP2 = aP2;
      b599_pc12_study_site_res.this.aP3 = aP3;
      b599_pc12_study_site_res.this.aP4 = aP4;
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
      /* Execute user subroutine: S111 */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV20GXLvl31 = (byte)(0) ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV8P_SITE_ID ,
                                           A18TBM22_SITE_ID ,
                                           A377TBM22_DEL_FLG ,
                                           new Long(AV9P_STUDY_ID) ,
                                           new Long(A17TBM22_STUDY_ID) },
                                           new int[] {
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.LONG
                                           }
      });
      Gx_ope = "Fetch" ;
      Gx_etb = "TBM22_STUDY_SITE" ;
      /* Using cursor P002N2 */
      pr_default.execute(0, new Object[] {new Long(AV9P_STUDY_ID), AV8P_SITE_ID});
      if ( Gx_err != 0 )
      {
         AV20GXLvl31 = (byte)(1) ;
      }
      while ( (pr_default.getStatus(0) != 101) )
      {
         A377TBM22_DEL_FLG = P002N2_A377TBM22_DEL_FLG[0] ;
         n377TBM22_DEL_FLG = P002N2_n377TBM22_DEL_FLG[0] ;
         A18TBM22_SITE_ID = P002N2_A18TBM22_SITE_ID[0] ;
         A17TBM22_STUDY_ID = P002N2_A17TBM22_STUDY_ID[0] ;
         A384TBM22_UPD_CNT = P002N2_A384TBM22_UPD_CNT[0] ;
         n384TBM22_UPD_CNT = P002N2_n384TBM22_UPD_CNT[0] ;
         A383TBM22_UPD_PROG_NM = P002N2_A383TBM22_UPD_PROG_NM[0] ;
         n383TBM22_UPD_PROG_NM = P002N2_n383TBM22_UPD_PROG_NM[0] ;
         A382TBM22_UPD_USER_ID = P002N2_A382TBM22_UPD_USER_ID[0] ;
         n382TBM22_UPD_USER_ID = P002N2_n382TBM22_UPD_USER_ID[0] ;
         A381TBM22_UPD_DATETIME = P002N2_A381TBM22_UPD_DATETIME[0] ;
         n381TBM22_UPD_DATETIME = P002N2_n381TBM22_UPD_DATETIME[0] ;
         A380TBM22_CRT_PROG_NM = P002N2_A380TBM22_CRT_PROG_NM[0] ;
         n380TBM22_CRT_PROG_NM = P002N2_n380TBM22_CRT_PROG_NM[0] ;
         A379TBM22_CRT_USER_ID = P002N2_A379TBM22_CRT_USER_ID[0] ;
         n379TBM22_CRT_USER_ID = P002N2_n379TBM22_CRT_USER_ID[0] ;
         A378TBM22_CRT_DATETIME = P002N2_A378TBM22_CRT_DATETIME[0] ;
         n378TBM22_CRT_DATETIME = P002N2_n378TBM22_CRT_DATETIME[0] ;
         AV20GXLvl31 = (byte)(1) ;
         GXt_char1 = AV13W_STR ;
         GXv_char2[0] = GXt_char1 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A18TBM22_SITE_ID, GXv_char2) ;
         b599_pc12_study_site_res.this.GXt_char1 = GXv_char2[0] ;
         GXt_char3 = AV13W_STR ;
         GXv_char4[0] = GXt_char3 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A377TBM22_DEL_FLG, GXv_char4) ;
         b599_pc12_study_site_res.this.GXt_char3 = GXv_char4[0] ;
         GXt_char5 = AV13W_STR ;
         GXv_char6[0] = GXt_char5 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A378TBM22_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char6) ;
         b599_pc12_study_site_res.this.GXt_char5 = GXv_char6[0] ;
         GXt_char7 = AV13W_STR ;
         GXv_char8[0] = GXt_char7 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A379TBM22_CRT_USER_ID, GXv_char8) ;
         b599_pc12_study_site_res.this.GXt_char7 = GXv_char8[0] ;
         GXt_char9 = AV13W_STR ;
         GXv_char10[0] = GXt_char9 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A380TBM22_CRT_PROG_NM, GXv_char10) ;
         b599_pc12_study_site_res.this.GXt_char9 = GXv_char10[0] ;
         GXt_char11 = AV13W_STR ;
         GXv_char12[0] = GXt_char11 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A381TBM22_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char12) ;
         b599_pc12_study_site_res.this.GXt_char11 = GXv_char12[0] ;
         GXt_char13 = AV13W_STR ;
         GXv_char14[0] = GXt_char13 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A382TBM22_UPD_USER_ID, GXv_char14) ;
         b599_pc12_study_site_res.this.GXt_char13 = GXv_char14[0] ;
         GXt_char15 = AV13W_STR ;
         GXv_char16[0] = GXt_char15 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A383TBM22_UPD_PROG_NM, GXv_char16) ;
         b599_pc12_study_site_res.this.GXt_char15 = GXv_char16[0] ;
         AV13W_STR = GXutil.trim( GXutil.str( A17TBM22_STUDY_ID, 10, 0)) + "," + GXt_char1 + "," + GXt_char3 + "," + GXt_char5 + "," + GXt_char7 + "," + GXt_char9 + "," + GXt_char11 + "," + GXt_char13 + "," + GXt_char15 + "," + GXutil.trim( GXutil.str( A384TBM22_UPD_CNT, 10, 0)) ;
         AV11W_RTN_CSV.add(AV13W_STR, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV20GXLvl31 == 0 )
      {
         AV10W_RTN_CD = (short)(1) ;
         GXt_char15 = AV12W_RTN_MSG ;
         GXv_char16[0] = GXt_char15 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char16) ;
         b599_pc12_study_site_res.this.GXt_char15 = GXv_char16[0] ;
         AV12W_RTN_MSG = GXt_char15 ;
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
      AV16W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( GXutil.trim( GXutil.str( AV9P_STUDY_ID, 10, 0)) );
      AV15W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV16W_PARMS_ITEM, 0);
      AV16W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV16W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_SITE_ID" );
      AV16W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV8P_SITE_ID );
      AV15W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV16W_PARMS_ITEM, 0);
      AV17W_MSG = "SUB_INIT" ;
      GXv_SdtB808_SD01_EXTRA_INFO17[0] = AV15W_EXTRA_INFO;
      GXv_int18[0] = AV10W_RTN_CD ;
      GXv_char16[0] = AV12W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV21Pgmname, (short)(1), AV17W_MSG, GXv_SdtB808_SD01_EXTRA_INFO17, GXv_int18, GXv_char16) ;
      AV15W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO17[0] ;
      b599_pc12_study_site_res.this.AV10W_RTN_CD = GXv_int18[0] ;
      b599_pc12_study_site_res.this.AV12W_RTN_MSG = GXv_char16[0] ;
   }

   public void S121( )
   {
      /* 'SUB_ERROR' Routine */
      AV17W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO17[0] = AV15W_EXTRA_INFO;
      GXv_int18[0] = AV10W_RTN_CD ;
      GXv_char16[0] = AV12W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV21Pgmname, (short)(0), AV17W_MSG, GXv_SdtB808_SD01_EXTRA_INFO17, GXv_int18, GXv_char16) ;
      AV15W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO17[0] ;
      b599_pc12_study_site_res.this.AV10W_RTN_CD = GXv_int18[0] ;
      b599_pc12_study_site_res.this.AV12W_RTN_MSG = GXv_char16[0] ;
      context.globals.Gx_eop = (byte)(0) ;
   }

   protected void cleanup( )
   {
      this.aP2[0] = b599_pc12_study_site_res.this.AV11W_RTN_CSV;
      this.aP3[0] = b599_pc12_study_site_res.this.AV10W_RTN_CD;
      this.aP4[0] = b599_pc12_study_site_res.this.AV12W_RTN_MSG;
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
      AV12W_RTN_MSG = "" ;
      AV14C_APP_ID = "" ;
      AV15W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      scmdbuf = "" ;
      A18TBM22_SITE_ID = "" ;
      A377TBM22_DEL_FLG = "" ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      P002N2_A377TBM22_DEL_FLG = new String[] {""} ;
      P002N2_n377TBM22_DEL_FLG = new boolean[] {false} ;
      P002N2_A18TBM22_SITE_ID = new String[] {""} ;
      P002N2_A17TBM22_STUDY_ID = new long[1] ;
      P002N2_A384TBM22_UPD_CNT = new long[1] ;
      P002N2_n384TBM22_UPD_CNT = new boolean[] {false} ;
      P002N2_A383TBM22_UPD_PROG_NM = new String[] {""} ;
      P002N2_n383TBM22_UPD_PROG_NM = new boolean[] {false} ;
      P002N2_A382TBM22_UPD_USER_ID = new String[] {""} ;
      P002N2_n382TBM22_UPD_USER_ID = new boolean[] {false} ;
      P002N2_A381TBM22_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P002N2_n381TBM22_UPD_DATETIME = new boolean[] {false} ;
      P002N2_A380TBM22_CRT_PROG_NM = new String[] {""} ;
      P002N2_n380TBM22_CRT_PROG_NM = new boolean[] {false} ;
      P002N2_A379TBM22_CRT_USER_ID = new String[] {""} ;
      P002N2_n379TBM22_CRT_USER_ID = new boolean[] {false} ;
      P002N2_A378TBM22_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P002N2_n378TBM22_CRT_DATETIME = new boolean[] {false} ;
      A383TBM22_UPD_PROG_NM = "" ;
      A382TBM22_UPD_USER_ID = "" ;
      A381TBM22_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A380TBM22_CRT_PROG_NM = "" ;
      A379TBM22_CRT_USER_ID = "" ;
      A378TBM22_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
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
      AV16W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV17W_MSG = "" ;
      AV21Pgmname = "" ;
      GXv_SdtB808_SD01_EXTRA_INFO17 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int18 = new short [1] ;
      GXv_char16 = new String [1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b599_pc12_study_site_res__default(),
         new Object[] {
             new Object[] {
            P002N2_A377TBM22_DEL_FLG, P002N2_n377TBM22_DEL_FLG, P002N2_A18TBM22_SITE_ID, P002N2_A17TBM22_STUDY_ID, P002N2_A384TBM22_UPD_CNT, P002N2_n384TBM22_UPD_CNT, P002N2_A383TBM22_UPD_PROG_NM, P002N2_n383TBM22_UPD_PROG_NM, P002N2_A382TBM22_UPD_USER_ID, P002N2_n382TBM22_UPD_USER_ID,
            P002N2_A381TBM22_UPD_DATETIME, P002N2_n381TBM22_UPD_DATETIME, P002N2_A380TBM22_CRT_PROG_NM, P002N2_n380TBM22_CRT_PROG_NM, P002N2_A379TBM22_CRT_USER_ID, P002N2_n379TBM22_CRT_USER_ID, P002N2_A378TBM22_CRT_DATETIME, P002N2_n378TBM22_CRT_DATETIME
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV21Pgmname = "B599_PC12_STUDY_SITE_RES" ;
      /* GeneXus formulas. */
      AV21Pgmname = "B599_PC12_STUDY_SITE_RES" ;
      Gx_err = (short)(0) ;
   }

   private byte AV20GXLvl31 ;
   private short AV10W_RTN_CD ;
   private short Gx_err ;
   private short GXv_int18[] ;
   private int GXActiveErrHndl ;
   private long AV9P_STUDY_ID ;
   private long A17TBM22_STUDY_ID ;
   private long A384TBM22_UPD_CNT ;
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
   private String AV21Pgmname ;
   private String GXv_char16[] ;
   private String Gx_emsg ;
   private java.util.Date A381TBM22_UPD_DATETIME ;
   private java.util.Date A378TBM22_CRT_DATETIME ;
   private boolean returnInSub ;
   private boolean n377TBM22_DEL_FLG ;
   private boolean n384TBM22_UPD_CNT ;
   private boolean n383TBM22_UPD_PROG_NM ;
   private boolean n382TBM22_UPD_USER_ID ;
   private boolean n381TBM22_UPD_DATETIME ;
   private boolean n380TBM22_CRT_PROG_NM ;
   private boolean n379TBM22_CRT_USER_ID ;
   private boolean n378TBM22_CRT_DATETIME ;
   private String AV8P_SITE_ID ;
   private String AV12W_RTN_MSG ;
   private String AV14C_APP_ID ;
   private String A18TBM22_SITE_ID ;
   private String A377TBM22_DEL_FLG ;
   private String A383TBM22_UPD_PROG_NM ;
   private String A382TBM22_UPD_USER_ID ;
   private String A380TBM22_CRT_PROG_NM ;
   private String A379TBM22_CRT_USER_ID ;
   private String AV13W_STR ;
   private String AV17W_MSG ;
   private GxObjectCollection[] aP2 ;
   private short[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P002N2_A377TBM22_DEL_FLG ;
   private boolean[] P002N2_n377TBM22_DEL_FLG ;
   private String[] P002N2_A18TBM22_SITE_ID ;
   private long[] P002N2_A17TBM22_STUDY_ID ;
   private long[] P002N2_A384TBM22_UPD_CNT ;
   private boolean[] P002N2_n384TBM22_UPD_CNT ;
   private String[] P002N2_A383TBM22_UPD_PROG_NM ;
   private boolean[] P002N2_n383TBM22_UPD_PROG_NM ;
   private String[] P002N2_A382TBM22_UPD_USER_ID ;
   private boolean[] P002N2_n382TBM22_UPD_USER_ID ;
   private java.util.Date[] P002N2_A381TBM22_UPD_DATETIME ;
   private boolean[] P002N2_n381TBM22_UPD_DATETIME ;
   private String[] P002N2_A380TBM22_CRT_PROG_NM ;
   private boolean[] P002N2_n380TBM22_CRT_PROG_NM ;
   private String[] P002N2_A379TBM22_CRT_USER_ID ;
   private boolean[] P002N2_n379TBM22_CRT_USER_ID ;
   private java.util.Date[] P002N2_A378TBM22_CRT_DATETIME ;
   private boolean[] P002N2_n378TBM22_CRT_DATETIME ;
   private GxObjectCollection AV11W_RTN_CSV ;
   private SdtB808_SD01_EXTRA_INFO AV15W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO17[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV16W_PARMS_ITEM ;
}

final  class b599_pc12_study_site_res__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P002N2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV8P_SITE_ID ,
                                          String A18TBM22_SITE_ID ,
                                          String A377TBM22_DEL_FLG ,
                                          long AV9P_STUDY_ID ,
                                          long A17TBM22_STUDY_ID )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int19 ;
      GXv_int19 = new byte [2] ;
      Object[] GXv_Object20 ;
      GXv_Object20 = new Object [2] ;
      Gx_ope = "Declare" ;
      Gx_etb = "TBM22_STUDY_SITE" ;
      scmdbuf = "SELECT `TBM22_DEL_FLG`, `TBM22_SITE_ID`, `TBM22_STUDY_ID`, `TBM22_UPD_CNT`, `TBM22_UPD_PROG_NM`," ;
      scmdbuf = scmdbuf + " `TBM22_UPD_USER_ID`, `TBM22_UPD_DATETIME`, `TBM22_CRT_PROG_NM`, `TBM22_CRT_USER_ID`," ;
      scmdbuf = scmdbuf + " `TBM22_CRT_DATETIME` FROM `TBM22_STUDY_SITE`" ;
      scmdbuf = scmdbuf + " WHERE (`TBM22_STUDY_ID` = ?)" ;
      scmdbuf = scmdbuf + " and (`TBM22_DEL_FLG` = '0')" ;
      if ( ! (GXutil.strcmp("", AV8P_SITE_ID)==0) )
      {
         sWhereString = sWhereString + " and (`TBM22_SITE_ID` = ?)" ;
      }
      else
      {
         GXv_int19[1] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TBM22_STUDY_ID`, `TBM22_SITE_ID`" ;
      GXv_Object20[0] = scmdbuf ;
      GXv_Object20[1] = GXv_int19 ;
      return GXv_Object20 ;
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
                  return conditional_P002N2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).longValue() , ((Number) dynConstraints[4]).longValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P002N2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
                  stmt.setVarchar(sIdx, (String)parms[3], 20);
               }
               return;
      }
   }

}

