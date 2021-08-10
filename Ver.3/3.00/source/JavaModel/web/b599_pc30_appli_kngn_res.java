/*
               File: B599_PC30_APPLI_KNGN_RES
        Description: アプリケーション権限マスタ取得
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:16:54.14
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b599_pc30_appli_kngn_res extends GXProcedure
{
   public b599_pc30_appli_kngn_res( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b599_pc30_appli_kngn_res.class ), "" );
   }

   public b599_pc30_appli_kngn_res( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 ,
                             String aP1 ,
                             GxObjectCollection[] aP2 ,
                             short[] aP3 )
   {
      b599_pc30_appli_kngn_res.this.AV16P_AUTH_CD = aP0;
      b599_pc30_appli_kngn_res.this.AV17P_APP_ID = aP1;
      b599_pc30_appli_kngn_res.this.AV13W_RTN_CSV = aP2[0];
      this.aP2 = aP2;
      b599_pc30_appli_kngn_res.this.aP3 = aP3;
      b599_pc30_appli_kngn_res.this.aP4 = aP4;
      b599_pc30_appli_kngn_res.this.aP4 = new String[] {""};
      initialize();
      privateExecute();
      return aP4[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        GxObjectCollection[] aP2 ,
                        short[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             GxObjectCollection[] aP2 ,
                             short[] aP3 ,
                             String[] aP4 )
   {
      b599_pc30_appli_kngn_res.this.AV16P_AUTH_CD = aP0;
      b599_pc30_appli_kngn_res.this.AV17P_APP_ID = aP1;
      b599_pc30_appli_kngn_res.this.AV13W_RTN_CSV = aP2[0];
      this.aP2 = aP2;
      b599_pc30_appli_kngn_res.this.aP3 = aP3;
      b599_pc30_appli_kngn_res.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8C_APP_ID = "B599" ;
      AV12W_RTN_CD = (short)(0) ;
      AV14W_RTN_MSG = "" ;
      AV9W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV9W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV8C_APP_ID );
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
                                           AV16P_AUTH_CD ,
                                           AV17P_APP_ID ,
                                           A13TAM04_AUTH_CD ,
                                           A12TAM03_APP_ID ,
                                           A289TAM05_DEL_FLG },
                                           new int[] {
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      Gx_ope = "Fetch" ;
      Gx_etb = "TAM05_APPLI_KNGN" ;
      /* Using cursor P004Z2 */
      pr_default.execute(0, new Object[] {AV16P_AUTH_CD, AV17P_APP_ID});
      if ( Gx_err != 0 )
      {
         AV20GXLvl31 = (byte)(1) ;
      }
      while ( (pr_default.getStatus(0) != 101) )
      {
         A289TAM05_DEL_FLG = P004Z2_A289TAM05_DEL_FLG[0] ;
         n289TAM05_DEL_FLG = P004Z2_n289TAM05_DEL_FLG[0] ;
         A12TAM03_APP_ID = P004Z2_A12TAM03_APP_ID[0] ;
         A13TAM04_AUTH_CD = P004Z2_A13TAM04_AUTH_CD[0] ;
         A296TAM05_UPD_CNT = P004Z2_A296TAM05_UPD_CNT[0] ;
         n296TAM05_UPD_CNT = P004Z2_n296TAM05_UPD_CNT[0] ;
         A295TAM05_UPD_PROG_NM = P004Z2_A295TAM05_UPD_PROG_NM[0] ;
         n295TAM05_UPD_PROG_NM = P004Z2_n295TAM05_UPD_PROG_NM[0] ;
         A294TAM05_UPD_USER_ID = P004Z2_A294TAM05_UPD_USER_ID[0] ;
         n294TAM05_UPD_USER_ID = P004Z2_n294TAM05_UPD_USER_ID[0] ;
         A293TAM05_UPD_DATETIME = P004Z2_A293TAM05_UPD_DATETIME[0] ;
         n293TAM05_UPD_DATETIME = P004Z2_n293TAM05_UPD_DATETIME[0] ;
         A292TAM05_CRT_PROG_NM = P004Z2_A292TAM05_CRT_PROG_NM[0] ;
         n292TAM05_CRT_PROG_NM = P004Z2_n292TAM05_CRT_PROG_NM[0] ;
         A291TAM05_CRT_USER_ID = P004Z2_A291TAM05_CRT_USER_ID[0] ;
         n291TAM05_CRT_USER_ID = P004Z2_n291TAM05_CRT_USER_ID[0] ;
         A290TAM05_CRT_DATETIME = P004Z2_A290TAM05_CRT_DATETIME[0] ;
         n290TAM05_CRT_DATETIME = P004Z2_n290TAM05_CRT_DATETIME[0] ;
         A288TAM05_KNGN_FLG = P004Z2_A288TAM05_KNGN_FLG[0] ;
         n288TAM05_KNGN_FLG = P004Z2_n288TAM05_KNGN_FLG[0] ;
         AV20GXLvl31 = (byte)(1) ;
         GXt_char1 = AV15W_STR ;
         GXv_char2[0] = GXt_char1 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A13TAM04_AUTH_CD, GXv_char2) ;
         b599_pc30_appli_kngn_res.this.GXt_char1 = GXv_char2[0] ;
         GXt_char3 = AV15W_STR ;
         GXv_char4[0] = GXt_char3 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A12TAM03_APP_ID, GXv_char4) ;
         b599_pc30_appli_kngn_res.this.GXt_char3 = GXv_char4[0] ;
         GXt_char5 = AV15W_STR ;
         GXv_char6[0] = GXt_char5 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A290TAM05_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char6) ;
         b599_pc30_appli_kngn_res.this.GXt_char5 = GXv_char6[0] ;
         GXt_char7 = AV15W_STR ;
         GXv_char8[0] = GXt_char7 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A291TAM05_CRT_USER_ID, GXv_char8) ;
         b599_pc30_appli_kngn_res.this.GXt_char7 = GXv_char8[0] ;
         GXt_char9 = AV15W_STR ;
         GXv_char10[0] = GXt_char9 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A292TAM05_CRT_PROG_NM, GXv_char10) ;
         b599_pc30_appli_kngn_res.this.GXt_char9 = GXv_char10[0] ;
         GXt_char11 = AV15W_STR ;
         GXv_char12[0] = GXt_char11 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A293TAM05_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char12) ;
         b599_pc30_appli_kngn_res.this.GXt_char11 = GXv_char12[0] ;
         GXt_char13 = AV15W_STR ;
         GXv_char14[0] = GXt_char13 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A294TAM05_UPD_USER_ID, GXv_char14) ;
         b599_pc30_appli_kngn_res.this.GXt_char13 = GXv_char14[0] ;
         GXt_char15 = AV15W_STR ;
         GXv_char16[0] = GXt_char15 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A295TAM05_UPD_PROG_NM, GXv_char16) ;
         b599_pc30_appli_kngn_res.this.GXt_char15 = GXv_char16[0] ;
         AV15W_STR = GXt_char1 + "," + GXt_char3 + "," + A288TAM05_KNGN_FLG + "," + A289TAM05_DEL_FLG + "," + GXt_char5 + "," + GXt_char7 + "," + GXt_char9 + "," + GXt_char11 + "," + GXt_char13 + "," + GXt_char15 + "," + GXutil.trim( GXutil.str( A296TAM05_UPD_CNT, 10, 0)) ;
         AV13W_RTN_CSV.add(AV15W_STR, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV20GXLvl31 == 0 )
      {
         AV12W_RTN_CD = (short)(1) ;
         GXt_char15 = AV14W_RTN_MSG ;
         GXv_char16[0] = GXt_char15 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char16) ;
         b599_pc30_appli_kngn_res.this.GXt_char15 = GXv_char16[0] ;
         AV14W_RTN_MSG = GXt_char15 ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      AV9W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      AV11W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV11W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_AUTH_CD" );
      AV11W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV16P_AUTH_CD );
      AV9W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV11W_PARMS_ITEM, 0);
      AV11W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV11W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_APP_ID" );
      AV11W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV17P_APP_ID );
      AV9W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV11W_PARMS_ITEM, 0);
      AV10W_MSG = "SUB_INIT" ;
      GXv_SdtB808_SD01_EXTRA_INFO17[0] = AV9W_EXTRA_INFO;
      GXv_int18[0] = AV12W_RTN_CD ;
      GXv_char16[0] = AV14W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV21Pgmname, (short)(1), AV10W_MSG, GXv_SdtB808_SD01_EXTRA_INFO17, GXv_int18, GXv_char16) ;
      AV9W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO17[0] ;
      b599_pc30_appli_kngn_res.this.AV12W_RTN_CD = GXv_int18[0] ;
      b599_pc30_appli_kngn_res.this.AV14W_RTN_MSG = GXv_char16[0] ;
   }

   public void S121( )
   {
      /* 'SUB_ERROR' Routine */
      AV10W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO17[0] = AV9W_EXTRA_INFO;
      GXv_int18[0] = AV12W_RTN_CD ;
      GXv_char16[0] = AV14W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV21Pgmname, (short)(0), AV10W_MSG, GXv_SdtB808_SD01_EXTRA_INFO17, GXv_int18, GXv_char16) ;
      AV9W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO17[0] ;
      b599_pc30_appli_kngn_res.this.AV12W_RTN_CD = GXv_int18[0] ;
      b599_pc30_appli_kngn_res.this.AV14W_RTN_MSG = GXv_char16[0] ;
      context.globals.Gx_eop = (byte)(0) ;
   }

   protected void cleanup( )
   {
      this.aP2[0] = b599_pc30_appli_kngn_res.this.AV13W_RTN_CSV;
      this.aP3[0] = b599_pc30_appli_kngn_res.this.AV12W_RTN_CD;
      this.aP4[0] = b599_pc30_appli_kngn_res.this.AV14W_RTN_MSG;
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
      AV14W_RTN_MSG = "" ;
      AV8C_APP_ID = "" ;
      AV9W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      scmdbuf = "" ;
      A13TAM04_AUTH_CD = "" ;
      A12TAM03_APP_ID = "" ;
      A289TAM05_DEL_FLG = "" ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      P004Z2_A289TAM05_DEL_FLG = new String[] {""} ;
      P004Z2_n289TAM05_DEL_FLG = new boolean[] {false} ;
      P004Z2_A12TAM03_APP_ID = new String[] {""} ;
      P004Z2_A13TAM04_AUTH_CD = new String[] {""} ;
      P004Z2_A296TAM05_UPD_CNT = new long[1] ;
      P004Z2_n296TAM05_UPD_CNT = new boolean[] {false} ;
      P004Z2_A295TAM05_UPD_PROG_NM = new String[] {""} ;
      P004Z2_n295TAM05_UPD_PROG_NM = new boolean[] {false} ;
      P004Z2_A294TAM05_UPD_USER_ID = new String[] {""} ;
      P004Z2_n294TAM05_UPD_USER_ID = new boolean[] {false} ;
      P004Z2_A293TAM05_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P004Z2_n293TAM05_UPD_DATETIME = new boolean[] {false} ;
      P004Z2_A292TAM05_CRT_PROG_NM = new String[] {""} ;
      P004Z2_n292TAM05_CRT_PROG_NM = new boolean[] {false} ;
      P004Z2_A291TAM05_CRT_USER_ID = new String[] {""} ;
      P004Z2_n291TAM05_CRT_USER_ID = new boolean[] {false} ;
      P004Z2_A290TAM05_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P004Z2_n290TAM05_CRT_DATETIME = new boolean[] {false} ;
      P004Z2_A288TAM05_KNGN_FLG = new String[] {""} ;
      P004Z2_n288TAM05_KNGN_FLG = new boolean[] {false} ;
      A295TAM05_UPD_PROG_NM = "" ;
      A294TAM05_UPD_USER_ID = "" ;
      A293TAM05_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A292TAM05_CRT_PROG_NM = "" ;
      A291TAM05_CRT_USER_ID = "" ;
      A290TAM05_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A288TAM05_KNGN_FLG = "" ;
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
      AV11W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV10W_MSG = "" ;
      AV21Pgmname = "" ;
      GXv_SdtB808_SD01_EXTRA_INFO17 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int18 = new short [1] ;
      GXv_char16 = new String [1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b599_pc30_appli_kngn_res__default(),
         new Object[] {
             new Object[] {
            P004Z2_A289TAM05_DEL_FLG, P004Z2_n289TAM05_DEL_FLG, P004Z2_A12TAM03_APP_ID, P004Z2_A13TAM04_AUTH_CD, P004Z2_A296TAM05_UPD_CNT, P004Z2_n296TAM05_UPD_CNT, P004Z2_A295TAM05_UPD_PROG_NM, P004Z2_n295TAM05_UPD_PROG_NM, P004Z2_A294TAM05_UPD_USER_ID, P004Z2_n294TAM05_UPD_USER_ID,
            P004Z2_A293TAM05_UPD_DATETIME, P004Z2_n293TAM05_UPD_DATETIME, P004Z2_A292TAM05_CRT_PROG_NM, P004Z2_n292TAM05_CRT_PROG_NM, P004Z2_A291TAM05_CRT_USER_ID, P004Z2_n291TAM05_CRT_USER_ID, P004Z2_A290TAM05_CRT_DATETIME, P004Z2_n290TAM05_CRT_DATETIME, P004Z2_A288TAM05_KNGN_FLG, P004Z2_n288TAM05_KNGN_FLG
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV21Pgmname = "B599_PC30_APPLI_KNGN_RES" ;
      /* GeneXus formulas. */
      AV21Pgmname = "B599_PC30_APPLI_KNGN_RES" ;
      Gx_err = (short)(0) ;
   }

   private byte AV20GXLvl31 ;
   private short AV12W_RTN_CD ;
   private short Gx_err ;
   private short GXv_int18[] ;
   private int GXActiveErrHndl ;
   private long A296TAM05_UPD_CNT ;
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
   private java.util.Date A293TAM05_UPD_DATETIME ;
   private java.util.Date A290TAM05_CRT_DATETIME ;
   private boolean returnInSub ;
   private boolean n289TAM05_DEL_FLG ;
   private boolean n296TAM05_UPD_CNT ;
   private boolean n295TAM05_UPD_PROG_NM ;
   private boolean n294TAM05_UPD_USER_ID ;
   private boolean n293TAM05_UPD_DATETIME ;
   private boolean n292TAM05_CRT_PROG_NM ;
   private boolean n291TAM05_CRT_USER_ID ;
   private boolean n290TAM05_CRT_DATETIME ;
   private boolean n288TAM05_KNGN_FLG ;
   private String AV16P_AUTH_CD ;
   private String AV17P_APP_ID ;
   private String AV14W_RTN_MSG ;
   private String AV8C_APP_ID ;
   private String A13TAM04_AUTH_CD ;
   private String A12TAM03_APP_ID ;
   private String A289TAM05_DEL_FLG ;
   private String A295TAM05_UPD_PROG_NM ;
   private String A294TAM05_UPD_USER_ID ;
   private String A292TAM05_CRT_PROG_NM ;
   private String A291TAM05_CRT_USER_ID ;
   private String A288TAM05_KNGN_FLG ;
   private String AV15W_STR ;
   private String AV10W_MSG ;
   private GxObjectCollection[] aP2 ;
   private short[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P004Z2_A289TAM05_DEL_FLG ;
   private boolean[] P004Z2_n289TAM05_DEL_FLG ;
   private String[] P004Z2_A12TAM03_APP_ID ;
   private String[] P004Z2_A13TAM04_AUTH_CD ;
   private long[] P004Z2_A296TAM05_UPD_CNT ;
   private boolean[] P004Z2_n296TAM05_UPD_CNT ;
   private String[] P004Z2_A295TAM05_UPD_PROG_NM ;
   private boolean[] P004Z2_n295TAM05_UPD_PROG_NM ;
   private String[] P004Z2_A294TAM05_UPD_USER_ID ;
   private boolean[] P004Z2_n294TAM05_UPD_USER_ID ;
   private java.util.Date[] P004Z2_A293TAM05_UPD_DATETIME ;
   private boolean[] P004Z2_n293TAM05_UPD_DATETIME ;
   private String[] P004Z2_A292TAM05_CRT_PROG_NM ;
   private boolean[] P004Z2_n292TAM05_CRT_PROG_NM ;
   private String[] P004Z2_A291TAM05_CRT_USER_ID ;
   private boolean[] P004Z2_n291TAM05_CRT_USER_ID ;
   private java.util.Date[] P004Z2_A290TAM05_CRT_DATETIME ;
   private boolean[] P004Z2_n290TAM05_CRT_DATETIME ;
   private String[] P004Z2_A288TAM05_KNGN_FLG ;
   private boolean[] P004Z2_n288TAM05_KNGN_FLG ;
   private GxObjectCollection AV13W_RTN_CSV ;
   private SdtB808_SD01_EXTRA_INFO AV9W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO17[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV11W_PARMS_ITEM ;
}

final  class b599_pc30_appli_kngn_res__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P004Z2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV16P_AUTH_CD ,
                                          String AV17P_APP_ID ,
                                          String A13TAM04_AUTH_CD ,
                                          String A12TAM03_APP_ID ,
                                          String A289TAM05_DEL_FLG )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int19 ;
      GXv_int19 = new byte [2] ;
      Object[] GXv_Object20 ;
      GXv_Object20 = new Object [2] ;
      Gx_ope = "Declare" ;
      Gx_etb = "TAM05_APPLI_KNGN" ;
      scmdbuf = "SELECT `TAM05_DEL_FLG`, `TAM03_APP_ID`, `TAM04_AUTH_CD`, `TAM05_UPD_CNT`, `TAM05_UPD_PROG_NM`," ;
      scmdbuf = scmdbuf + " `TAM05_UPD_USER_ID`, `TAM05_UPD_DATETIME`, `TAM05_CRT_PROG_NM`, `TAM05_CRT_USER_ID`," ;
      scmdbuf = scmdbuf + " `TAM05_CRT_DATETIME`, `TAM05_KNGN_FLG` FROM `TAM05_APPLI_KNGN`" ;
      scmdbuf = scmdbuf + " WHERE (`TAM05_DEL_FLG` = '0')" ;
      if ( ! (GXutil.strcmp("", AV16P_AUTH_CD)==0) )
      {
         sWhereString = sWhereString + " and (`TAM04_AUTH_CD` = ?)" ;
      }
      else
      {
         GXv_int19[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17P_APP_ID)==0) )
      {
         sWhereString = sWhereString + " and (`TAM03_APP_ID` = ?)" ;
      }
      else
      {
         GXv_int19[1] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TAM04_AUTH_CD`" ;
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
                  return conditional_P004Z2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P004Z2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
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
                  stmt.setVarchar(sIdx, (String)parms[2], 2);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[3], 7);
               }
               return;
      }
   }

}

