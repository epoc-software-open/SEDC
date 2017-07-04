/*
               File: B599_PC25_AUTH_PTN_RES
        Description: 権限パターンマスタ取得
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:13:9.38
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b599_pc25_auth_ptn_res extends GXProcedure
{
   public b599_pc25_auth_ptn_res( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b599_pc25_auth_ptn_res.class ), "" );
   }

   public b599_pc25_auth_ptn_res( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 ,
                             GxObjectCollection[] aP1 ,
                             short[] aP2 )
   {
      b599_pc25_auth_ptn_res.this.AV9P_AUTH_CD = aP0;
      b599_pc25_auth_ptn_res.this.AV11W_RTN_CSV = aP1[0];
      this.aP1 = aP1;
      b599_pc25_auth_ptn_res.this.aP2 = aP2;
      b599_pc25_auth_ptn_res.this.aP3 = aP3;
      b599_pc25_auth_ptn_res.this.aP3 = new String[] {""};
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
      b599_pc25_auth_ptn_res.this.AV9P_AUTH_CD = aP0;
      b599_pc25_auth_ptn_res.this.AV11W_RTN_CSV = aP1[0];
      this.aP1 = aP1;
      b599_pc25_auth_ptn_res.this.aP2 = aP2;
      b599_pc25_auth_ptn_res.this.aP3 = aP3;
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
                                           AV9P_AUTH_CD ,
                                           A13TAM04_AUTH_CD ,
                                           A215TAM04_DEL_FLG },
                                           new int[] {
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      Gx_ope = "Fetch" ;
      Gx_etb = "TAM04_KNGN" ;
      /* Using cursor P004N2 */
      pr_default.execute(0, new Object[] {AV9P_AUTH_CD});
      if ( Gx_err != 0 )
      {
         AV20GXLvl31 = (byte)(1) ;
      }
      while ( (pr_default.getStatus(0) != 101) )
      {
         A215TAM04_DEL_FLG = P004N2_A215TAM04_DEL_FLG[0] ;
         n215TAM04_DEL_FLG = P004N2_n215TAM04_DEL_FLG[0] ;
         A13TAM04_AUTH_CD = P004N2_A13TAM04_AUTH_CD[0] ;
         A286TAM04_UPD_CNT = P004N2_A286TAM04_UPD_CNT[0] ;
         n286TAM04_UPD_CNT = P004N2_n286TAM04_UPD_CNT[0] ;
         A236TAM04_UPD_PROG_NM = P004N2_A236TAM04_UPD_PROG_NM[0] ;
         n236TAM04_UPD_PROG_NM = P004N2_n236TAM04_UPD_PROG_NM[0] ;
         A267TAM04_UPD_USER_ID = P004N2_A267TAM04_UPD_USER_ID[0] ;
         n267TAM04_UPD_USER_ID = P004N2_n267TAM04_UPD_USER_ID[0] ;
         A235TAM04_UPD_DATETIME = P004N2_A235TAM04_UPD_DATETIME[0] ;
         n235TAM04_UPD_DATETIME = P004N2_n235TAM04_UPD_DATETIME[0] ;
         A234TAM04_CRT_PROG_NM = P004N2_A234TAM04_CRT_PROG_NM[0] ;
         n234TAM04_CRT_PROG_NM = P004N2_n234TAM04_CRT_PROG_NM[0] ;
         A266TAM04_CRT_USER_ID = P004N2_A266TAM04_CRT_USER_ID[0] ;
         n266TAM04_CRT_USER_ID = P004N2_n266TAM04_CRT_USER_ID[0] ;
         A233TAM04_CRT_DATETIME = P004N2_A233TAM04_CRT_DATETIME[0] ;
         n233TAM04_CRT_DATETIME = P004N2_n233TAM04_CRT_DATETIME[0] ;
         A687TAM04_AUTH_LVL = P004N2_A687TAM04_AUTH_LVL[0] ;
         n687TAM04_AUTH_LVL = P004N2_n687TAM04_AUTH_LVL[0] ;
         A285TAM04_AUTH_NM = P004N2_A285TAM04_AUTH_NM[0] ;
         n285TAM04_AUTH_NM = P004N2_n285TAM04_AUTH_NM[0] ;
         AV20GXLvl31 = (byte)(1) ;
         GXt_char1 = AV13W_STR ;
         GXv_char2[0] = GXt_char1 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A13TAM04_AUTH_CD, GXv_char2) ;
         b599_pc25_auth_ptn_res.this.GXt_char1 = GXv_char2[0] ;
         GXt_char3 = AV13W_STR ;
         GXv_char4[0] = GXt_char3 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A285TAM04_AUTH_NM, GXv_char4) ;
         b599_pc25_auth_ptn_res.this.GXt_char3 = GXv_char4[0] ;
         GXt_char5 = AV13W_STR ;
         GXv_char6[0] = GXt_char5 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A215TAM04_DEL_FLG, GXv_char6) ;
         b599_pc25_auth_ptn_res.this.GXt_char5 = GXv_char6[0] ;
         GXt_char7 = AV13W_STR ;
         GXv_char8[0] = GXt_char7 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A233TAM04_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char8) ;
         b599_pc25_auth_ptn_res.this.GXt_char7 = GXv_char8[0] ;
         GXt_char9 = AV13W_STR ;
         GXv_char10[0] = GXt_char9 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A266TAM04_CRT_USER_ID, GXv_char10) ;
         b599_pc25_auth_ptn_res.this.GXt_char9 = GXv_char10[0] ;
         GXt_char11 = AV13W_STR ;
         GXv_char12[0] = GXt_char11 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A234TAM04_CRT_PROG_NM, GXv_char12) ;
         b599_pc25_auth_ptn_res.this.GXt_char11 = GXv_char12[0] ;
         GXt_char13 = AV13W_STR ;
         GXv_char14[0] = GXt_char13 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A235TAM04_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char14) ;
         b599_pc25_auth_ptn_res.this.GXt_char13 = GXv_char14[0] ;
         GXt_char15 = AV13W_STR ;
         GXv_char16[0] = GXt_char15 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A267TAM04_UPD_USER_ID, GXv_char16) ;
         b599_pc25_auth_ptn_res.this.GXt_char15 = GXv_char16[0] ;
         GXt_char17 = AV13W_STR ;
         GXv_char18[0] = GXt_char17 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A236TAM04_UPD_PROG_NM, GXv_char18) ;
         b599_pc25_auth_ptn_res.this.GXt_char17 = GXv_char18[0] ;
         AV13W_STR = GXt_char1 + "," + GXt_char3 + "," + GXutil.trim( GXutil.str( A687TAM04_AUTH_LVL, 10, 0)) + "," + GXt_char5 + "," + GXt_char7 + "," + GXt_char9 + "," + GXt_char11 + "," + GXt_char13 + "," + GXt_char15 + "," + GXt_char17 + "," + GXutil.trim( GXutil.str( A286TAM04_UPD_CNT, 10, 0)) ;
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
         b599_pc25_auth_ptn_res.this.GXt_char17 = GXv_char18[0] ;
         AV12W_RTN_MSG = GXt_char17 ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      AV15W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      AV16W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV16W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_AUTH_CD" );
      AV16W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV9P_AUTH_CD );
      AV15W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV16W_PARMS_ITEM, 0);
      AV17W_MSG = "SUB_INIT" ;
      GXv_SdtB808_SD01_EXTRA_INFO19[0] = AV15W_EXTRA_INFO;
      GXv_int20[0] = AV10W_RTN_CD ;
      GXv_char18[0] = AV12W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV21Pgmname, (short)(1), AV17W_MSG, GXv_SdtB808_SD01_EXTRA_INFO19, GXv_int20, GXv_char18) ;
      AV15W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO19[0] ;
      b599_pc25_auth_ptn_res.this.AV10W_RTN_CD = GXv_int20[0] ;
      b599_pc25_auth_ptn_res.this.AV12W_RTN_MSG = GXv_char18[0] ;
   }

   public void S121( )
   {
      /* 'SUB_ERROR' Routine */
      AV17W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO19[0] = AV15W_EXTRA_INFO;
      GXv_int20[0] = AV10W_RTN_CD ;
      GXv_char18[0] = AV12W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV21Pgmname, (short)(0), AV17W_MSG, GXv_SdtB808_SD01_EXTRA_INFO19, GXv_int20, GXv_char18) ;
      AV15W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO19[0] ;
      b599_pc25_auth_ptn_res.this.AV10W_RTN_CD = GXv_int20[0] ;
      b599_pc25_auth_ptn_res.this.AV12W_RTN_MSG = GXv_char18[0] ;
      context.globals.Gx_eop = (byte)(0) ;
   }

   protected void cleanup( )
   {
      this.aP1[0] = b599_pc25_auth_ptn_res.this.AV11W_RTN_CSV;
      this.aP2[0] = b599_pc25_auth_ptn_res.this.AV10W_RTN_CD;
      this.aP3[0] = b599_pc25_auth_ptn_res.this.AV12W_RTN_MSG;
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
      A13TAM04_AUTH_CD = "" ;
      A215TAM04_DEL_FLG = "" ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      P004N2_A215TAM04_DEL_FLG = new String[] {""} ;
      P004N2_n215TAM04_DEL_FLG = new boolean[] {false} ;
      P004N2_A13TAM04_AUTH_CD = new String[] {""} ;
      P004N2_A286TAM04_UPD_CNT = new long[1] ;
      P004N2_n286TAM04_UPD_CNT = new boolean[] {false} ;
      P004N2_A236TAM04_UPD_PROG_NM = new String[] {""} ;
      P004N2_n236TAM04_UPD_PROG_NM = new boolean[] {false} ;
      P004N2_A267TAM04_UPD_USER_ID = new String[] {""} ;
      P004N2_n267TAM04_UPD_USER_ID = new boolean[] {false} ;
      P004N2_A235TAM04_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P004N2_n235TAM04_UPD_DATETIME = new boolean[] {false} ;
      P004N2_A234TAM04_CRT_PROG_NM = new String[] {""} ;
      P004N2_n234TAM04_CRT_PROG_NM = new boolean[] {false} ;
      P004N2_A266TAM04_CRT_USER_ID = new String[] {""} ;
      P004N2_n266TAM04_CRT_USER_ID = new boolean[] {false} ;
      P004N2_A233TAM04_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P004N2_n233TAM04_CRT_DATETIME = new boolean[] {false} ;
      P004N2_A687TAM04_AUTH_LVL = new byte[1] ;
      P004N2_n687TAM04_AUTH_LVL = new boolean[] {false} ;
      P004N2_A285TAM04_AUTH_NM = new String[] {""} ;
      P004N2_n285TAM04_AUTH_NM = new boolean[] {false} ;
      A236TAM04_UPD_PROG_NM = "" ;
      A267TAM04_UPD_USER_ID = "" ;
      A235TAM04_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A234TAM04_CRT_PROG_NM = "" ;
      A266TAM04_CRT_USER_ID = "" ;
      A233TAM04_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A285TAM04_AUTH_NM = "" ;
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
      pr_default = new DataStoreProvider(context, remoteHandle, new b599_pc25_auth_ptn_res__default(),
         new Object[] {
             new Object[] {
            P004N2_A215TAM04_DEL_FLG, P004N2_n215TAM04_DEL_FLG, P004N2_A13TAM04_AUTH_CD, P004N2_A286TAM04_UPD_CNT, P004N2_n286TAM04_UPD_CNT, P004N2_A236TAM04_UPD_PROG_NM, P004N2_n236TAM04_UPD_PROG_NM, P004N2_A267TAM04_UPD_USER_ID, P004N2_n267TAM04_UPD_USER_ID, P004N2_A235TAM04_UPD_DATETIME,
            P004N2_n235TAM04_UPD_DATETIME, P004N2_A234TAM04_CRT_PROG_NM, P004N2_n234TAM04_CRT_PROG_NM, P004N2_A266TAM04_CRT_USER_ID, P004N2_n266TAM04_CRT_USER_ID, P004N2_A233TAM04_CRT_DATETIME, P004N2_n233TAM04_CRT_DATETIME, P004N2_A687TAM04_AUTH_LVL, P004N2_n687TAM04_AUTH_LVL, P004N2_A285TAM04_AUTH_NM,
            P004N2_n285TAM04_AUTH_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV21Pgmname = "B599_PC25_AUTH_PTN_RES" ;
      /* GeneXus formulas. */
      AV21Pgmname = "B599_PC25_AUTH_PTN_RES" ;
      Gx_err = (short)(0) ;
   }

   private byte AV20GXLvl31 ;
   private byte A687TAM04_AUTH_LVL ;
   private short AV10W_RTN_CD ;
   private short Gx_err ;
   private short GXv_int20[] ;
   private int GXActiveErrHndl ;
   private long A286TAM04_UPD_CNT ;
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
   private java.util.Date A235TAM04_UPD_DATETIME ;
   private java.util.Date A233TAM04_CRT_DATETIME ;
   private boolean returnInSub ;
   private boolean n215TAM04_DEL_FLG ;
   private boolean n286TAM04_UPD_CNT ;
   private boolean n236TAM04_UPD_PROG_NM ;
   private boolean n267TAM04_UPD_USER_ID ;
   private boolean n235TAM04_UPD_DATETIME ;
   private boolean n234TAM04_CRT_PROG_NM ;
   private boolean n266TAM04_CRT_USER_ID ;
   private boolean n233TAM04_CRT_DATETIME ;
   private boolean n687TAM04_AUTH_LVL ;
   private boolean n285TAM04_AUTH_NM ;
   private String AV9P_AUTH_CD ;
   private String AV12W_RTN_MSG ;
   private String AV14C_APP_ID ;
   private String A13TAM04_AUTH_CD ;
   private String A215TAM04_DEL_FLG ;
   private String A236TAM04_UPD_PROG_NM ;
   private String A267TAM04_UPD_USER_ID ;
   private String A234TAM04_CRT_PROG_NM ;
   private String A266TAM04_CRT_USER_ID ;
   private String A285TAM04_AUTH_NM ;
   private String AV13W_STR ;
   private String AV17W_MSG ;
   private GxObjectCollection[] aP1 ;
   private short[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P004N2_A215TAM04_DEL_FLG ;
   private boolean[] P004N2_n215TAM04_DEL_FLG ;
   private String[] P004N2_A13TAM04_AUTH_CD ;
   private long[] P004N2_A286TAM04_UPD_CNT ;
   private boolean[] P004N2_n286TAM04_UPD_CNT ;
   private String[] P004N2_A236TAM04_UPD_PROG_NM ;
   private boolean[] P004N2_n236TAM04_UPD_PROG_NM ;
   private String[] P004N2_A267TAM04_UPD_USER_ID ;
   private boolean[] P004N2_n267TAM04_UPD_USER_ID ;
   private java.util.Date[] P004N2_A235TAM04_UPD_DATETIME ;
   private boolean[] P004N2_n235TAM04_UPD_DATETIME ;
   private String[] P004N2_A234TAM04_CRT_PROG_NM ;
   private boolean[] P004N2_n234TAM04_CRT_PROG_NM ;
   private String[] P004N2_A266TAM04_CRT_USER_ID ;
   private boolean[] P004N2_n266TAM04_CRT_USER_ID ;
   private java.util.Date[] P004N2_A233TAM04_CRT_DATETIME ;
   private boolean[] P004N2_n233TAM04_CRT_DATETIME ;
   private byte[] P004N2_A687TAM04_AUTH_LVL ;
   private boolean[] P004N2_n687TAM04_AUTH_LVL ;
   private String[] P004N2_A285TAM04_AUTH_NM ;
   private boolean[] P004N2_n285TAM04_AUTH_NM ;
   private GxObjectCollection AV11W_RTN_CSV ;
   private SdtB808_SD01_EXTRA_INFO AV15W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO19[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV16W_PARMS_ITEM ;
}

final  class b599_pc25_auth_ptn_res__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P004N2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV9P_AUTH_CD ,
                                          String A13TAM04_AUTH_CD ,
                                          String A215TAM04_DEL_FLG )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int21 ;
      GXv_int21 = new byte [1] ;
      Object[] GXv_Object22 ;
      GXv_Object22 = new Object [2] ;
      Gx_ope = "Declare" ;
      Gx_etb = "TAM04_KNGN" ;
      scmdbuf = "SELECT `TAM04_DEL_FLG`, `TAM04_AUTH_CD`, `TAM04_UPD_CNT`, `TAM04_UPD_PROG_NM`, `TAM04_UPD_USER_ID`," ;
      scmdbuf = scmdbuf + " `TAM04_UPD_DATETIME`, `TAM04_CRT_PROG_NM`, `TAM04_CRT_USER_ID`, `TAM04_CRT_DATETIME`," ;
      scmdbuf = scmdbuf + " `TAM04_AUTH_LVL`, `TAM04_AUTH_NM` FROM `TAM04_KNGN`" ;
      scmdbuf = scmdbuf + " WHERE (`TAM04_DEL_FLG` = '0')" ;
      if ( ! (GXutil.strcmp("", AV9P_AUTH_CD)==0) )
      {
         sWhereString = sWhereString + " and (`TAM04_AUTH_CD` = ?)" ;
      }
      else
      {
         GXv_int21[0] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TAM04_AUTH_CD`" ;
      GXv_Object22[0] = scmdbuf ;
      GXv_Object22[1] = GXv_int21 ;
      return GXv_Object22 ;
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
                  return conditional_P004N2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P004N2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
               ((byte[]) buf[17])[0] = rslt.getByte(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
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
                  stmt.setVarchar(sIdx, (String)parms[1], 2);
               }
               return;
      }
   }

}

