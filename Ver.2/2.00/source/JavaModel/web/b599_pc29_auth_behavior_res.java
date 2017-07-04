/*
               File: B599_PC29_AUTH_BEHAVIOR_RES
        Description: å†å¿ï êUïëÉ}ÉXÉ^éÊìæ
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:13:9.57
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b599_pc29_auth_behavior_res extends GXProcedure
{
   public b599_pc29_auth_behavior_res( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b599_pc29_auth_behavior_res.class ), "" );
   }

   public b599_pc29_auth_behavior_res( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 ,
                             GxObjectCollection[] aP1 ,
                             short[] aP2 )
   {
      b599_pc29_auth_behavior_res.this.AV16P_AUTH_CD = aP0;
      b599_pc29_auth_behavior_res.this.AV13W_RTN_CSV = aP1[0];
      this.aP1 = aP1;
      b599_pc29_auth_behavior_res.this.aP2 = aP2;
      b599_pc29_auth_behavior_res.this.aP3 = aP3;
      b599_pc29_auth_behavior_res.this.aP3 = new String[] {""};
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
      b599_pc29_auth_behavior_res.this.AV16P_AUTH_CD = aP0;
      b599_pc29_auth_behavior_res.this.AV13W_RTN_CSV = aP1[0];
      this.aP1 = aP1;
      b599_pc29_auth_behavior_res.this.aP2 = aP2;
      b599_pc29_auth_behavior_res.this.aP3 = aP3;
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
      AV19GXLvl31 = (byte)(0) ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV16P_AUTH_CD ,
                                           A50TBM07_AUTH_CD ,
                                           A626TBM07_DEL_FLG },
                                           new int[] {
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      Gx_ope = "Fetch" ;
      Gx_etb = "TBM07_AUTH_BEHAVIOR" ;
      /* Using cursor P004X2 */
      pr_default.execute(0, new Object[] {AV16P_AUTH_CD});
      if ( Gx_err != 0 )
      {
         AV19GXLvl31 = (byte)(1) ;
      }
      while ( (pr_default.getStatus(0) != 101) )
      {
         A626TBM07_DEL_FLG = P004X2_A626TBM07_DEL_FLG[0] ;
         n626TBM07_DEL_FLG = P004X2_n626TBM07_DEL_FLG[0] ;
         A50TBM07_AUTH_CD = P004X2_A50TBM07_AUTH_CD[0] ;
         A633TBM07_UPD_CNT = P004X2_A633TBM07_UPD_CNT[0] ;
         n633TBM07_UPD_CNT = P004X2_n633TBM07_UPD_CNT[0] ;
         A632TBM07_UPD_PROG_NM = P004X2_A632TBM07_UPD_PROG_NM[0] ;
         n632TBM07_UPD_PROG_NM = P004X2_n632TBM07_UPD_PROG_NM[0] ;
         A631TBM07_UPD_USER_ID = P004X2_A631TBM07_UPD_USER_ID[0] ;
         n631TBM07_UPD_USER_ID = P004X2_n631TBM07_UPD_USER_ID[0] ;
         A630TBM07_UPD_DATETIME = P004X2_A630TBM07_UPD_DATETIME[0] ;
         n630TBM07_UPD_DATETIME = P004X2_n630TBM07_UPD_DATETIME[0] ;
         A629TBM07_CRT_PROG_NM = P004X2_A629TBM07_CRT_PROG_NM[0] ;
         n629TBM07_CRT_PROG_NM = P004X2_n629TBM07_CRT_PROG_NM[0] ;
         A628TBM07_CRT_USER_ID = P004X2_A628TBM07_CRT_USER_ID[0] ;
         n628TBM07_CRT_USER_ID = P004X2_n628TBM07_CRT_USER_ID[0] ;
         A627TBM07_CRT_DATETIME = P004X2_A627TBM07_CRT_DATETIME[0] ;
         n627TBM07_CRT_DATETIME = P004X2_n627TBM07_CRT_DATETIME[0] ;
         A625TBM07_OTHER_SITE_VIEW_FLG = P004X2_A625TBM07_OTHER_SITE_VIEW_FLG[0] ;
         n625TBM07_OTHER_SITE_VIEW_FLG = P004X2_n625TBM07_OTHER_SITE_VIEW_FLG[0] ;
         A624TBM07_CRF_EDIT_AUTH_FLG = P004X2_A624TBM07_CRF_EDIT_AUTH_FLG[0] ;
         n624TBM07_CRF_EDIT_AUTH_FLG = P004X2_n624TBM07_CRF_EDIT_AUTH_FLG[0] ;
         A623TBM07_CRF_INP_AUTH_FLG = P004X2_A623TBM07_CRF_INP_AUTH_FLG[0] ;
         n623TBM07_CRF_INP_AUTH_FLG = P004X2_n623TBM07_CRF_INP_AUTH_FLG[0] ;
         AV19GXLvl31 = (byte)(1) ;
         GXt_char1 = AV15W_STR ;
         GXv_char2[0] = GXt_char1 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A50TBM07_AUTH_CD, GXv_char2) ;
         b599_pc29_auth_behavior_res.this.GXt_char1 = GXv_char2[0] ;
         GXt_char3 = AV15W_STR ;
         GXv_char4[0] = GXt_char3 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A627TBM07_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char4) ;
         b599_pc29_auth_behavior_res.this.GXt_char3 = GXv_char4[0] ;
         GXt_char5 = AV15W_STR ;
         GXv_char6[0] = GXt_char5 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A628TBM07_CRT_USER_ID, GXv_char6) ;
         b599_pc29_auth_behavior_res.this.GXt_char5 = GXv_char6[0] ;
         GXt_char7 = AV15W_STR ;
         GXv_char8[0] = GXt_char7 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A629TBM07_CRT_PROG_NM, GXv_char8) ;
         b599_pc29_auth_behavior_res.this.GXt_char7 = GXv_char8[0] ;
         GXt_char9 = AV15W_STR ;
         GXv_char10[0] = GXt_char9 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A630TBM07_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char10) ;
         b599_pc29_auth_behavior_res.this.GXt_char9 = GXv_char10[0] ;
         GXt_char11 = AV15W_STR ;
         GXv_char12[0] = GXt_char11 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A631TBM07_UPD_USER_ID, GXv_char12) ;
         b599_pc29_auth_behavior_res.this.GXt_char11 = GXv_char12[0] ;
         GXt_char13 = AV15W_STR ;
         GXv_char14[0] = GXt_char13 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A632TBM07_UPD_PROG_NM, GXv_char14) ;
         b599_pc29_auth_behavior_res.this.GXt_char13 = GXv_char14[0] ;
         AV15W_STR = GXt_char1 + "," + A623TBM07_CRF_INP_AUTH_FLG + "," + A624TBM07_CRF_EDIT_AUTH_FLG + "," + A625TBM07_OTHER_SITE_VIEW_FLG + "," + A626TBM07_DEL_FLG + "," + GXt_char3 + "," + GXt_char5 + "," + GXt_char7 + "," + GXt_char9 + "," + GXt_char11 + "," + GXt_char13 + "," + GXutil.trim( GXutil.str( A633TBM07_UPD_CNT, 10, 0)) ;
         AV13W_RTN_CSV.add(AV15W_STR, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV19GXLvl31 == 0 )
      {
         AV12W_RTN_CD = (short)(1) ;
         GXt_char13 = AV14W_RTN_MSG ;
         GXv_char14[0] = GXt_char13 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char14) ;
         b599_pc29_auth_behavior_res.this.GXt_char13 = GXv_char14[0] ;
         AV14W_RTN_MSG = GXt_char13 ;
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
      AV10W_MSG = "SUB_INIT" ;
      GXv_SdtB808_SD01_EXTRA_INFO15[0] = AV9W_EXTRA_INFO;
      GXv_int16[0] = AV12W_RTN_CD ;
      GXv_char14[0] = AV14W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV20Pgmname, (short)(1), AV10W_MSG, GXv_SdtB808_SD01_EXTRA_INFO15, GXv_int16, GXv_char14) ;
      AV9W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO15[0] ;
      b599_pc29_auth_behavior_res.this.AV12W_RTN_CD = GXv_int16[0] ;
      b599_pc29_auth_behavior_res.this.AV14W_RTN_MSG = GXv_char14[0] ;
   }

   public void S121( )
   {
      /* 'SUB_ERROR' Routine */
      AV10W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO15[0] = AV9W_EXTRA_INFO;
      GXv_int16[0] = AV12W_RTN_CD ;
      GXv_char14[0] = AV14W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV20Pgmname, (short)(0), AV10W_MSG, GXv_SdtB808_SD01_EXTRA_INFO15, GXv_int16, GXv_char14) ;
      AV9W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO15[0] ;
      b599_pc29_auth_behavior_res.this.AV12W_RTN_CD = GXv_int16[0] ;
      b599_pc29_auth_behavior_res.this.AV14W_RTN_MSG = GXv_char14[0] ;
      context.globals.Gx_eop = (byte)(0) ;
   }

   protected void cleanup( )
   {
      this.aP1[0] = b599_pc29_auth_behavior_res.this.AV13W_RTN_CSV;
      this.aP2[0] = b599_pc29_auth_behavior_res.this.AV12W_RTN_CD;
      this.aP3[0] = b599_pc29_auth_behavior_res.this.AV14W_RTN_MSG;
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
      A50TBM07_AUTH_CD = "" ;
      A626TBM07_DEL_FLG = "" ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      P004X2_A626TBM07_DEL_FLG = new String[] {""} ;
      P004X2_n626TBM07_DEL_FLG = new boolean[] {false} ;
      P004X2_A50TBM07_AUTH_CD = new String[] {""} ;
      P004X2_A633TBM07_UPD_CNT = new long[1] ;
      P004X2_n633TBM07_UPD_CNT = new boolean[] {false} ;
      P004X2_A632TBM07_UPD_PROG_NM = new String[] {""} ;
      P004X2_n632TBM07_UPD_PROG_NM = new boolean[] {false} ;
      P004X2_A631TBM07_UPD_USER_ID = new String[] {""} ;
      P004X2_n631TBM07_UPD_USER_ID = new boolean[] {false} ;
      P004X2_A630TBM07_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P004X2_n630TBM07_UPD_DATETIME = new boolean[] {false} ;
      P004X2_A629TBM07_CRT_PROG_NM = new String[] {""} ;
      P004X2_n629TBM07_CRT_PROG_NM = new boolean[] {false} ;
      P004X2_A628TBM07_CRT_USER_ID = new String[] {""} ;
      P004X2_n628TBM07_CRT_USER_ID = new boolean[] {false} ;
      P004X2_A627TBM07_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P004X2_n627TBM07_CRT_DATETIME = new boolean[] {false} ;
      P004X2_A625TBM07_OTHER_SITE_VIEW_FLG = new String[] {""} ;
      P004X2_n625TBM07_OTHER_SITE_VIEW_FLG = new boolean[] {false} ;
      P004X2_A624TBM07_CRF_EDIT_AUTH_FLG = new String[] {""} ;
      P004X2_n624TBM07_CRF_EDIT_AUTH_FLG = new boolean[] {false} ;
      P004X2_A623TBM07_CRF_INP_AUTH_FLG = new String[] {""} ;
      P004X2_n623TBM07_CRF_INP_AUTH_FLG = new boolean[] {false} ;
      A632TBM07_UPD_PROG_NM = "" ;
      A631TBM07_UPD_USER_ID = "" ;
      A630TBM07_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A629TBM07_CRT_PROG_NM = "" ;
      A628TBM07_CRT_USER_ID = "" ;
      A627TBM07_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A625TBM07_OTHER_SITE_VIEW_FLG = "" ;
      A624TBM07_CRF_EDIT_AUTH_FLG = "" ;
      A623TBM07_CRF_INP_AUTH_FLG = "" ;
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
      AV11W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV10W_MSG = "" ;
      AV20Pgmname = "" ;
      GXv_SdtB808_SD01_EXTRA_INFO15 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int16 = new short [1] ;
      GXv_char14 = new String [1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b599_pc29_auth_behavior_res__default(),
         new Object[] {
             new Object[] {
            P004X2_A626TBM07_DEL_FLG, P004X2_n626TBM07_DEL_FLG, P004X2_A50TBM07_AUTH_CD, P004X2_A633TBM07_UPD_CNT, P004X2_n633TBM07_UPD_CNT, P004X2_A632TBM07_UPD_PROG_NM, P004X2_n632TBM07_UPD_PROG_NM, P004X2_A631TBM07_UPD_USER_ID, P004X2_n631TBM07_UPD_USER_ID, P004X2_A630TBM07_UPD_DATETIME,
            P004X2_n630TBM07_UPD_DATETIME, P004X2_A629TBM07_CRT_PROG_NM, P004X2_n629TBM07_CRT_PROG_NM, P004X2_A628TBM07_CRT_USER_ID, P004X2_n628TBM07_CRT_USER_ID, P004X2_A627TBM07_CRT_DATETIME, P004X2_n627TBM07_CRT_DATETIME, P004X2_A625TBM07_OTHER_SITE_VIEW_FLG, P004X2_n625TBM07_OTHER_SITE_VIEW_FLG, P004X2_A624TBM07_CRF_EDIT_AUTH_FLG,
            P004X2_n624TBM07_CRF_EDIT_AUTH_FLG, P004X2_A623TBM07_CRF_INP_AUTH_FLG, P004X2_n623TBM07_CRF_INP_AUTH_FLG
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV20Pgmname = "B599_PC29_AUTH_BEHAVIOR_RES" ;
      /* GeneXus formulas. */
      AV20Pgmname = "B599_PC29_AUTH_BEHAVIOR_RES" ;
      Gx_err = (short)(0) ;
   }

   private byte AV19GXLvl31 ;
   private short AV12W_RTN_CD ;
   private short Gx_err ;
   private short GXv_int16[] ;
   private int GXActiveErrHndl ;
   private long A633TBM07_UPD_CNT ;
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
   private String AV20Pgmname ;
   private String GXv_char14[] ;
   private String Gx_emsg ;
   private java.util.Date A630TBM07_UPD_DATETIME ;
   private java.util.Date A627TBM07_CRT_DATETIME ;
   private boolean returnInSub ;
   private boolean n626TBM07_DEL_FLG ;
   private boolean n633TBM07_UPD_CNT ;
   private boolean n632TBM07_UPD_PROG_NM ;
   private boolean n631TBM07_UPD_USER_ID ;
   private boolean n630TBM07_UPD_DATETIME ;
   private boolean n629TBM07_CRT_PROG_NM ;
   private boolean n628TBM07_CRT_USER_ID ;
   private boolean n627TBM07_CRT_DATETIME ;
   private boolean n625TBM07_OTHER_SITE_VIEW_FLG ;
   private boolean n624TBM07_CRF_EDIT_AUTH_FLG ;
   private boolean n623TBM07_CRF_INP_AUTH_FLG ;
   private String AV16P_AUTH_CD ;
   private String AV14W_RTN_MSG ;
   private String AV8C_APP_ID ;
   private String A50TBM07_AUTH_CD ;
   private String A626TBM07_DEL_FLG ;
   private String A632TBM07_UPD_PROG_NM ;
   private String A631TBM07_UPD_USER_ID ;
   private String A629TBM07_CRT_PROG_NM ;
   private String A628TBM07_CRT_USER_ID ;
   private String A625TBM07_OTHER_SITE_VIEW_FLG ;
   private String A624TBM07_CRF_EDIT_AUTH_FLG ;
   private String A623TBM07_CRF_INP_AUTH_FLG ;
   private String AV15W_STR ;
   private String AV10W_MSG ;
   private GxObjectCollection[] aP1 ;
   private short[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P004X2_A626TBM07_DEL_FLG ;
   private boolean[] P004X2_n626TBM07_DEL_FLG ;
   private String[] P004X2_A50TBM07_AUTH_CD ;
   private long[] P004X2_A633TBM07_UPD_CNT ;
   private boolean[] P004X2_n633TBM07_UPD_CNT ;
   private String[] P004X2_A632TBM07_UPD_PROG_NM ;
   private boolean[] P004X2_n632TBM07_UPD_PROG_NM ;
   private String[] P004X2_A631TBM07_UPD_USER_ID ;
   private boolean[] P004X2_n631TBM07_UPD_USER_ID ;
   private java.util.Date[] P004X2_A630TBM07_UPD_DATETIME ;
   private boolean[] P004X2_n630TBM07_UPD_DATETIME ;
   private String[] P004X2_A629TBM07_CRT_PROG_NM ;
   private boolean[] P004X2_n629TBM07_CRT_PROG_NM ;
   private String[] P004X2_A628TBM07_CRT_USER_ID ;
   private boolean[] P004X2_n628TBM07_CRT_USER_ID ;
   private java.util.Date[] P004X2_A627TBM07_CRT_DATETIME ;
   private boolean[] P004X2_n627TBM07_CRT_DATETIME ;
   private String[] P004X2_A625TBM07_OTHER_SITE_VIEW_FLG ;
   private boolean[] P004X2_n625TBM07_OTHER_SITE_VIEW_FLG ;
   private String[] P004X2_A624TBM07_CRF_EDIT_AUTH_FLG ;
   private boolean[] P004X2_n624TBM07_CRF_EDIT_AUTH_FLG ;
   private String[] P004X2_A623TBM07_CRF_INP_AUTH_FLG ;
   private boolean[] P004X2_n623TBM07_CRF_INP_AUTH_FLG ;
   private GxObjectCollection AV13W_RTN_CSV ;
   private SdtB808_SD01_EXTRA_INFO AV9W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO15[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV11W_PARMS_ITEM ;
}

final  class b599_pc29_auth_behavior_res__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P004X2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV16P_AUTH_CD ,
                                          String A50TBM07_AUTH_CD ,
                                          String A626TBM07_DEL_FLG )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int17 ;
      GXv_int17 = new byte [1] ;
      Object[] GXv_Object18 ;
      GXv_Object18 = new Object [2] ;
      Gx_ope = "Declare" ;
      Gx_etb = "TBM07_AUTH_BEHAVIOR" ;
      scmdbuf = "SELECT `TBM07_DEL_FLG`, `TBM07_AUTH_CD`, `TBM07_UPD_CNT`, `TBM07_UPD_PROG_NM`, `TBM07_UPD_USER_ID`," ;
      scmdbuf = scmdbuf + " `TBM07_UPD_DATETIME`, `TBM07_CRT_PROG_NM`, `TBM07_CRT_USER_ID`, `TBM07_CRT_DATETIME`," ;
      scmdbuf = scmdbuf + " `TBM07_OTHER_SITE_VIEW_FLG`, `TBM07_CRF_EDIT_AUTH_FLG`, `TBM07_CRF_INP_AUTH_FLG`" ;
      scmdbuf = scmdbuf + " FROM `TBM07_AUTH_BEHAVIOR`" ;
      scmdbuf = scmdbuf + " WHERE (`TBM07_DEL_FLG` = '0')" ;
      if ( ! (GXutil.strcmp("", AV16P_AUTH_CD)==0) )
      {
         sWhereString = sWhereString + " and (`TBM07_AUTH_CD` = ?)" ;
      }
      else
      {
         GXv_int17[0] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TBM07_AUTH_CD`" ;
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
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
                  return conditional_P004X2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P004X2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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

