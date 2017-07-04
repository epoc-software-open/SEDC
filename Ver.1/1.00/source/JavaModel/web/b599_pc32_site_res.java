/*
               File: B599_PC32_SITE_RES
        Description: 施設マスタ取得
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:46.39
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b599_pc32_site_res extends GXProcedure
{
   public b599_pc32_site_res( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b599_pc32_site_res.class ), "" );
   }

   public b599_pc32_site_res( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 ,
                             GxObjectCollection[] aP1 ,
                             short[] aP2 )
   {
      b599_pc32_site_res.this.AV16P_SITE_ID = aP0;
      b599_pc32_site_res.this.AV13W_RTN_CSV = aP1[0];
      b599_pc32_site_res.this.aP3 = new String[] {""};
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
      b599_pc32_site_res.this.AV16P_SITE_ID = aP0;
      b599_pc32_site_res.this.AV13W_RTN_CSV = aP1[0];
      this.aP1 = aP1;
      b599_pc32_site_res.this.aP2 = aP2;
      b599_pc32_site_res.this.aP3 = aP3;
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
      /* Execute user subroutine: S1159 */
      S1159 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV19GXLvl31 = (byte)(0) ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV16P_SITE_ID ,
                                           A132TAM08_SITE_ID ,
                                           A139TAM08_DEL_FLG },
                                           new int[] {
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      Gx_ope = "Fetch" ;
      Gx_etb = "TAM08_SITE" ;
      /* Using cursor P00522 */
      pr_default.execute(0, new Object[] {AV16P_SITE_ID});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A139TAM08_DEL_FLG = P00522_A139TAM08_DEL_FLG[0] ;
         n139TAM08_DEL_FLG = P00522_n139TAM08_DEL_FLG[0] ;
         A132TAM08_SITE_ID = P00522_A132TAM08_SITE_ID[0] ;
         A146TAM08_UPD_CNT = P00522_A146TAM08_UPD_CNT[0] ;
         n146TAM08_UPD_CNT = P00522_n146TAM08_UPD_CNT[0] ;
         A145TAM08_UPD_PROG_NM = P00522_A145TAM08_UPD_PROG_NM[0] ;
         n145TAM08_UPD_PROG_NM = P00522_n145TAM08_UPD_PROG_NM[0] ;
         A144TAM08_UPD_USER_ID = P00522_A144TAM08_UPD_USER_ID[0] ;
         n144TAM08_UPD_USER_ID = P00522_n144TAM08_UPD_USER_ID[0] ;
         A143TAM08_UPD_DATETIME = P00522_A143TAM08_UPD_DATETIME[0] ;
         n143TAM08_UPD_DATETIME = P00522_n143TAM08_UPD_DATETIME[0] ;
         A142TAM08_CRT_PROG_NM = P00522_A142TAM08_CRT_PROG_NM[0] ;
         n142TAM08_CRT_PROG_NM = P00522_n142TAM08_CRT_PROG_NM[0] ;
         A141TAM08_CRT_USER_ID = P00522_A141TAM08_CRT_USER_ID[0] ;
         n141TAM08_CRT_USER_ID = P00522_n141TAM08_CRT_USER_ID[0] ;
         A140TAM08_CRT_DATETIME = P00522_A140TAM08_CRT_DATETIME[0] ;
         n140TAM08_CRT_DATETIME = P00522_n140TAM08_CRT_DATETIME[0] ;
         A594TAM08_OUTER_SITE_ID = P00522_A594TAM08_OUTER_SITE_ID[0] ;
         n594TAM08_OUTER_SITE_ID = P00522_n594TAM08_OUTER_SITE_ID[0] ;
         A134TAM08_SITE_SNM = P00522_A134TAM08_SITE_SNM[0] ;
         n134TAM08_SITE_SNM = P00522_n134TAM08_SITE_SNM[0] ;
         A133TAM08_SITE_NM = P00522_A133TAM08_SITE_NM[0] ;
         n133TAM08_SITE_NM = P00522_n133TAM08_SITE_NM[0] ;
         AV19GXLvl31 = (byte)(1) ;
         GXt_char1 = AV15W_STR ;
         GXv_char2[0] = GXt_char1 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A132TAM08_SITE_ID, GXv_char2) ;
         b599_pc32_site_res.this.GXt_char1 = GXv_char2[0] ;
         GXt_char3 = AV15W_STR ;
         GXv_char4[0] = GXt_char3 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A133TAM08_SITE_NM, GXv_char4) ;
         b599_pc32_site_res.this.GXt_char3 = GXv_char4[0] ;
         GXt_char5 = AV15W_STR ;
         GXv_char6[0] = GXt_char5 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A134TAM08_SITE_SNM, GXv_char6) ;
         b599_pc32_site_res.this.GXt_char5 = GXv_char6[0] ;
         GXt_char7 = AV15W_STR ;
         GXv_char8[0] = GXt_char7 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A594TAM08_OUTER_SITE_ID, GXv_char8) ;
         b599_pc32_site_res.this.GXt_char7 = GXv_char8[0] ;
         GXt_char9 = AV15W_STR ;
         GXv_char10[0] = GXt_char9 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A140TAM08_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char10) ;
         b599_pc32_site_res.this.GXt_char9 = GXv_char10[0] ;
         GXt_char11 = AV15W_STR ;
         GXv_char12[0] = GXt_char11 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A141TAM08_CRT_USER_ID, GXv_char12) ;
         b599_pc32_site_res.this.GXt_char11 = GXv_char12[0] ;
         GXt_char13 = AV15W_STR ;
         GXv_char14[0] = GXt_char13 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A142TAM08_CRT_PROG_NM, GXv_char14) ;
         b599_pc32_site_res.this.GXt_char13 = GXv_char14[0] ;
         GXt_char15 = AV15W_STR ;
         GXv_char16[0] = GXt_char15 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A143TAM08_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char16) ;
         b599_pc32_site_res.this.GXt_char15 = GXv_char16[0] ;
         GXt_char17 = AV15W_STR ;
         GXv_char18[0] = GXt_char17 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A144TAM08_UPD_USER_ID, GXv_char18) ;
         b599_pc32_site_res.this.GXt_char17 = GXv_char18[0] ;
         GXt_char19 = AV15W_STR ;
         GXv_char20[0] = GXt_char19 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A145TAM08_UPD_PROG_NM, GXv_char20) ;
         b599_pc32_site_res.this.GXt_char19 = GXv_char20[0] ;
         AV15W_STR = GXt_char1 + "," + GXt_char3 + "," + GXt_char5 + "," + GXt_char7 + "," + A139TAM08_DEL_FLG + "," + GXt_char9 + "," + GXt_char11 + "," + GXt_char13 + "," + GXt_char15 + "," + GXt_char17 + "," + GXt_char19 + "," + GXutil.trim( GXutil.str( A146TAM08_UPD_CNT, 10, 0)) ;
         AV13W_RTN_CSV.add(AV15W_STR, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV19GXLvl31 == 0 )
      {
         AV12W_RTN_CD = (short)(1) ;
         GXt_char19 = AV14W_RTN_MSG ;
         GXv_char20[0] = GXt_char19 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char20) ;
         b599_pc32_site_res.this.GXt_char19 = GXv_char20[0] ;
         AV14W_RTN_MSG = GXt_char19 ;
      }
      cleanup();
   }

   public void S1159( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      AV9W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      AV11W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV11W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_SITE_ID" );
      AV11W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV16P_SITE_ID );
      AV9W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV11W_PARMS_ITEM, 0);
      AV10W_MSG = "SUB_INIT" ;
      GXv_SdtB808_SD01_EXTRA_INFO21[0] = AV9W_EXTRA_INFO;
      GXv_int22[0] = AV12W_RTN_CD ;
      GXv_char20[0] = AV14W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV20Pgmname, (short)(1), AV10W_MSG, GXv_SdtB808_SD01_EXTRA_INFO21, GXv_int22, GXv_char20) ;
      AV9W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO21[0] ;
      b599_pc32_site_res.this.AV12W_RTN_CD = GXv_int22[0] ;
      b599_pc32_site_res.this.AV14W_RTN_MSG = GXv_char20[0] ;
   }

   public void S1279( )
   {
      /* 'SUB_ERROR' Routine */
      AV10W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO21[0] = AV9W_EXTRA_INFO;
      GXv_int22[0] = AV12W_RTN_CD ;
      GXv_char20[0] = AV14W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV20Pgmname, (short)(0), AV10W_MSG, GXv_SdtB808_SD01_EXTRA_INFO21, GXv_int22, GXv_char20) ;
      AV9W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO21[0] ;
      b599_pc32_site_res.this.AV12W_RTN_CD = GXv_int22[0] ;
      b599_pc32_site_res.this.AV14W_RTN_MSG = GXv_char20[0] ;
      context.globals.Gx_eop = (byte)(0) ;
   }

   protected void cleanup( )
   {
      this.aP1[0] = b599_pc32_site_res.this.AV13W_RTN_CSV;
      this.aP2[0] = b599_pc32_site_res.this.AV12W_RTN_CD;
      this.aP3[0] = b599_pc32_site_res.this.AV14W_RTN_MSG;
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
                  /* Execute user subroutine: S1279 */
                  S1279 ();
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
      A132TAM08_SITE_ID = "" ;
      A139TAM08_DEL_FLG = "" ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      P00522_A139TAM08_DEL_FLG = new String[] {""} ;
      P00522_n139TAM08_DEL_FLG = new boolean[] {false} ;
      P00522_A132TAM08_SITE_ID = new String[] {""} ;
      P00522_A146TAM08_UPD_CNT = new long[1] ;
      P00522_n146TAM08_UPD_CNT = new boolean[] {false} ;
      P00522_A145TAM08_UPD_PROG_NM = new String[] {""} ;
      P00522_n145TAM08_UPD_PROG_NM = new boolean[] {false} ;
      P00522_A144TAM08_UPD_USER_ID = new String[] {""} ;
      P00522_n144TAM08_UPD_USER_ID = new boolean[] {false} ;
      P00522_A143TAM08_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P00522_n143TAM08_UPD_DATETIME = new boolean[] {false} ;
      P00522_A142TAM08_CRT_PROG_NM = new String[] {""} ;
      P00522_n142TAM08_CRT_PROG_NM = new boolean[] {false} ;
      P00522_A141TAM08_CRT_USER_ID = new String[] {""} ;
      P00522_n141TAM08_CRT_USER_ID = new boolean[] {false} ;
      P00522_A140TAM08_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P00522_n140TAM08_CRT_DATETIME = new boolean[] {false} ;
      P00522_A594TAM08_OUTER_SITE_ID = new String[] {""} ;
      P00522_n594TAM08_OUTER_SITE_ID = new boolean[] {false} ;
      P00522_A134TAM08_SITE_SNM = new String[] {""} ;
      P00522_n134TAM08_SITE_SNM = new boolean[] {false} ;
      P00522_A133TAM08_SITE_NM = new String[] {""} ;
      P00522_n133TAM08_SITE_NM = new boolean[] {false} ;
      A145TAM08_UPD_PROG_NM = "" ;
      A144TAM08_UPD_USER_ID = "" ;
      A143TAM08_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A142TAM08_CRT_PROG_NM = "" ;
      A141TAM08_CRT_USER_ID = "" ;
      A140TAM08_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A594TAM08_OUTER_SITE_ID = "" ;
      A134TAM08_SITE_SNM = "" ;
      A133TAM08_SITE_NM = "" ;
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
      AV11W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV10W_MSG = "" ;
      AV20Pgmname = "" ;
      GXv_SdtB808_SD01_EXTRA_INFO21 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int22 = new short [1] ;
      GXv_char20 = new String [1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b599_pc32_site_res__default(),
         new Object[] {
             new Object[] {
            P00522_A139TAM08_DEL_FLG, P00522_n139TAM08_DEL_FLG, P00522_A132TAM08_SITE_ID, P00522_A146TAM08_UPD_CNT, P00522_n146TAM08_UPD_CNT, P00522_A145TAM08_UPD_PROG_NM, P00522_n145TAM08_UPD_PROG_NM, P00522_A144TAM08_UPD_USER_ID, P00522_n144TAM08_UPD_USER_ID, P00522_A143TAM08_UPD_DATETIME,
            P00522_n143TAM08_UPD_DATETIME, P00522_A142TAM08_CRT_PROG_NM, P00522_n142TAM08_CRT_PROG_NM, P00522_A141TAM08_CRT_USER_ID, P00522_n141TAM08_CRT_USER_ID, P00522_A140TAM08_CRT_DATETIME, P00522_n140TAM08_CRT_DATETIME, P00522_A594TAM08_OUTER_SITE_ID, P00522_n594TAM08_OUTER_SITE_ID, P00522_A134TAM08_SITE_SNM,
            P00522_n134TAM08_SITE_SNM, P00522_A133TAM08_SITE_NM, P00522_n133TAM08_SITE_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV20Pgmname = "B599_PC32_SITE_RES" ;
      /* GeneXus formulas. */
      AV20Pgmname = "B599_PC32_SITE_RES" ;
      Gx_err = (short)(0) ;
   }

   private byte AV19GXLvl31 ;
   private short AV12W_RTN_CD ;
   private short GXv_int22[] ;
   private short Gx_err ;
   private int GXActiveErrHndl ;
   private long A146TAM08_UPD_CNT ;
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
   private String AV20Pgmname ;
   private String GXv_char20[] ;
   private String Gx_emsg ;
   private java.util.Date A143TAM08_UPD_DATETIME ;
   private java.util.Date A140TAM08_CRT_DATETIME ;
   private boolean returnInSub ;
   private boolean n139TAM08_DEL_FLG ;
   private boolean n146TAM08_UPD_CNT ;
   private boolean n145TAM08_UPD_PROG_NM ;
   private boolean n144TAM08_UPD_USER_ID ;
   private boolean n143TAM08_UPD_DATETIME ;
   private boolean n142TAM08_CRT_PROG_NM ;
   private boolean n141TAM08_CRT_USER_ID ;
   private boolean n140TAM08_CRT_DATETIME ;
   private boolean n594TAM08_OUTER_SITE_ID ;
   private boolean n134TAM08_SITE_SNM ;
   private boolean n133TAM08_SITE_NM ;
   private String AV16P_SITE_ID ;
   private String AV14W_RTN_MSG ;
   private String AV8C_APP_ID ;
   private String A132TAM08_SITE_ID ;
   private String A139TAM08_DEL_FLG ;
   private String A145TAM08_UPD_PROG_NM ;
   private String A144TAM08_UPD_USER_ID ;
   private String A142TAM08_CRT_PROG_NM ;
   private String A141TAM08_CRT_USER_ID ;
   private String A594TAM08_OUTER_SITE_ID ;
   private String A134TAM08_SITE_SNM ;
   private String A133TAM08_SITE_NM ;
   private String AV15W_STR ;
   private String AV10W_MSG ;
   private GxObjectCollection[] aP1 ;
   private short[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P00522_A139TAM08_DEL_FLG ;
   private boolean[] P00522_n139TAM08_DEL_FLG ;
   private String[] P00522_A132TAM08_SITE_ID ;
   private long[] P00522_A146TAM08_UPD_CNT ;
   private boolean[] P00522_n146TAM08_UPD_CNT ;
   private String[] P00522_A145TAM08_UPD_PROG_NM ;
   private boolean[] P00522_n145TAM08_UPD_PROG_NM ;
   private String[] P00522_A144TAM08_UPD_USER_ID ;
   private boolean[] P00522_n144TAM08_UPD_USER_ID ;
   private java.util.Date[] P00522_A143TAM08_UPD_DATETIME ;
   private boolean[] P00522_n143TAM08_UPD_DATETIME ;
   private String[] P00522_A142TAM08_CRT_PROG_NM ;
   private boolean[] P00522_n142TAM08_CRT_PROG_NM ;
   private String[] P00522_A141TAM08_CRT_USER_ID ;
   private boolean[] P00522_n141TAM08_CRT_USER_ID ;
   private java.util.Date[] P00522_A140TAM08_CRT_DATETIME ;
   private boolean[] P00522_n140TAM08_CRT_DATETIME ;
   private String[] P00522_A594TAM08_OUTER_SITE_ID ;
   private boolean[] P00522_n594TAM08_OUTER_SITE_ID ;
   private String[] P00522_A134TAM08_SITE_SNM ;
   private boolean[] P00522_n134TAM08_SITE_SNM ;
   private String[] P00522_A133TAM08_SITE_NM ;
   private boolean[] P00522_n133TAM08_SITE_NM ;
   private GxObjectCollection AV13W_RTN_CSV ;
   private SdtB808_SD01_EXTRA_INFO AV9W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO21[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV11W_PARMS_ITEM ;
}

final  class b599_pc32_site_res__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P00522( com.genexus.internet.HttpContext httpContext ,
                                          String AV16P_SITE_ID ,
                                          String A132TAM08_SITE_ID ,
                                          String A139TAM08_DEL_FLG )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int23 ;
      GXv_int23 = new byte [1] ;
      Object[] GXv_Object24 ;
      GXv_Object24 = new Object [2] ;
      Gx_ope = "Declare" ;
      Gx_etb = "TAM08_SITE" ;
      scmdbuf = "SELECT `TAM08_DEL_FLG`, `TAM08_SITE_ID`, `TAM08_UPD_CNT`, `TAM08_UPD_PROG_NM`, `TAM08_UPD_USER_ID`," ;
      scmdbuf = scmdbuf + " `TAM08_UPD_DATETIME`, `TAM08_CRT_PROG_NM`, `TAM08_CRT_USER_ID`, `TAM08_CRT_DATETIME`," ;
      scmdbuf = scmdbuf + " `TAM08_OUTER_SITE_ID`, `TAM08_SITE_SNM`, `TAM08_SITE_NM` FROM `TAM08_SITE`" ;
      scmdbuf = scmdbuf + " WHERE (`TAM08_DEL_FLG` = '0')" ;
      if ( ! (GXutil.strcmp("", AV16P_SITE_ID)==0) )
      {
         sWhereString = sWhereString + " and (`TAM08_SITE_ID` = ?)" ;
      }
      else
      {
         GXv_int23[0] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TAM08_SITE_ID`" ;
      GXv_Object24[0] = scmdbuf ;
      GXv_Object24[1] = GXv_int23 ;
      return GXv_Object24 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         com.genexus.internet.HttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_P00522(httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] );
      }
      return super.getDynamicStatement(cursor, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00522", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
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
                  stmt.setVarchar(sIdx, (String)parms[1], 20);
               }
               break;
      }
   }

}

