/*
               File: B599_PC29_AUTH_BEHAVIOR_RES
        Description: å†å¿ï êUïëÉ}ÉXÉ^éÊìæ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:44.19
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
                                           AV16P_AUTH_CD ,
                                           A530TBM07_AUTH_CD ,
                                           A534TBM07_DEL_FLG },
                                           new int[] {
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      Gx_ope = "Fetch" ;
      Gx_etb = "TBM07_AUTH_BEHAVIOR" ;
      /* Using cursor P004W2 */
      pr_default.execute(0, new Object[] {AV16P_AUTH_CD});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A534TBM07_DEL_FLG = P004W2_A534TBM07_DEL_FLG[0] ;
         n534TBM07_DEL_FLG = P004W2_n534TBM07_DEL_FLG[0] ;
         A530TBM07_AUTH_CD = P004W2_A530TBM07_AUTH_CD[0] ;
         A541TBM07_UPD_CNT = P004W2_A541TBM07_UPD_CNT[0] ;
         n541TBM07_UPD_CNT = P004W2_n541TBM07_UPD_CNT[0] ;
         A540TBM07_UPD_PROG_NM = P004W2_A540TBM07_UPD_PROG_NM[0] ;
         n540TBM07_UPD_PROG_NM = P004W2_n540TBM07_UPD_PROG_NM[0] ;
         A539TBM07_UPD_USER_ID = P004W2_A539TBM07_UPD_USER_ID[0] ;
         n539TBM07_UPD_USER_ID = P004W2_n539TBM07_UPD_USER_ID[0] ;
         A538TBM07_UPD_DATETIME = P004W2_A538TBM07_UPD_DATETIME[0] ;
         n538TBM07_UPD_DATETIME = P004W2_n538TBM07_UPD_DATETIME[0] ;
         A537TBM07_CRT_PROG_NM = P004W2_A537TBM07_CRT_PROG_NM[0] ;
         n537TBM07_CRT_PROG_NM = P004W2_n537TBM07_CRT_PROG_NM[0] ;
         A536TBM07_CRT_USER_ID = P004W2_A536TBM07_CRT_USER_ID[0] ;
         n536TBM07_CRT_USER_ID = P004W2_n536TBM07_CRT_USER_ID[0] ;
         A535TBM07_CRT_DATETIME = P004W2_A535TBM07_CRT_DATETIME[0] ;
         n535TBM07_CRT_DATETIME = P004W2_n535TBM07_CRT_DATETIME[0] ;
         A533TBM07_OTHER_SITE_VIEW_FLG = P004W2_A533TBM07_OTHER_SITE_VIEW_FLG[0] ;
         n533TBM07_OTHER_SITE_VIEW_FLG = P004W2_n533TBM07_OTHER_SITE_VIEW_FLG[0] ;
         A532TBM07_CRF_EDIT_AUTH_FLG = P004W2_A532TBM07_CRF_EDIT_AUTH_FLG[0] ;
         n532TBM07_CRF_EDIT_AUTH_FLG = P004W2_n532TBM07_CRF_EDIT_AUTH_FLG[0] ;
         A531TBM07_CRF_INP_AUTH_FLG = P004W2_A531TBM07_CRF_INP_AUTH_FLG[0] ;
         n531TBM07_CRF_INP_AUTH_FLG = P004W2_n531TBM07_CRF_INP_AUTH_FLG[0] ;
         AV19GXLvl31 = (byte)(1) ;
         GXt_char1 = AV15W_STR ;
         GXv_char2[0] = GXt_char1 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A530TBM07_AUTH_CD, GXv_char2) ;
         b599_pc29_auth_behavior_res.this.GXt_char1 = GXv_char2[0] ;
         GXt_char3 = AV15W_STR ;
         GXv_char4[0] = GXt_char3 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A535TBM07_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char4) ;
         b599_pc29_auth_behavior_res.this.GXt_char3 = GXv_char4[0] ;
         GXt_char5 = AV15W_STR ;
         GXv_char6[0] = GXt_char5 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A536TBM07_CRT_USER_ID, GXv_char6) ;
         b599_pc29_auth_behavior_res.this.GXt_char5 = GXv_char6[0] ;
         GXt_char7 = AV15W_STR ;
         GXv_char8[0] = GXt_char7 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A537TBM07_CRT_PROG_NM, GXv_char8) ;
         b599_pc29_auth_behavior_res.this.GXt_char7 = GXv_char8[0] ;
         GXt_char9 = AV15W_STR ;
         GXv_char10[0] = GXt_char9 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A538TBM07_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char10) ;
         b599_pc29_auth_behavior_res.this.GXt_char9 = GXv_char10[0] ;
         GXt_char11 = AV15W_STR ;
         GXv_char12[0] = GXt_char11 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A539TBM07_UPD_USER_ID, GXv_char12) ;
         b599_pc29_auth_behavior_res.this.GXt_char11 = GXv_char12[0] ;
         GXt_char13 = AV15W_STR ;
         GXv_char14[0] = GXt_char13 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A540TBM07_UPD_PROG_NM, GXv_char14) ;
         b599_pc29_auth_behavior_res.this.GXt_char13 = GXv_char14[0] ;
         AV15W_STR = GXt_char1 + "," + A531TBM07_CRF_INP_AUTH_FLG + "," + A532TBM07_CRF_EDIT_AUTH_FLG + "," + A533TBM07_OTHER_SITE_VIEW_FLG + "," + A534TBM07_DEL_FLG + "," + GXt_char3 + "," + GXt_char5 + "," + GXt_char7 + "," + GXt_char9 + "," + GXt_char11 + "," + GXt_char13 + "," + GXutil.trim( GXutil.str( A541TBM07_UPD_CNT, 10, 0)) ;
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

   public void S1159( )
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

   public void S1279( )
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
      A530TBM07_AUTH_CD = "" ;
      A534TBM07_DEL_FLG = "" ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      P004W2_A534TBM07_DEL_FLG = new String[] {""} ;
      P004W2_n534TBM07_DEL_FLG = new boolean[] {false} ;
      P004W2_A530TBM07_AUTH_CD = new String[] {""} ;
      P004W2_A541TBM07_UPD_CNT = new long[1] ;
      P004W2_n541TBM07_UPD_CNT = new boolean[] {false} ;
      P004W2_A540TBM07_UPD_PROG_NM = new String[] {""} ;
      P004W2_n540TBM07_UPD_PROG_NM = new boolean[] {false} ;
      P004W2_A539TBM07_UPD_USER_ID = new String[] {""} ;
      P004W2_n539TBM07_UPD_USER_ID = new boolean[] {false} ;
      P004W2_A538TBM07_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P004W2_n538TBM07_UPD_DATETIME = new boolean[] {false} ;
      P004W2_A537TBM07_CRT_PROG_NM = new String[] {""} ;
      P004W2_n537TBM07_CRT_PROG_NM = new boolean[] {false} ;
      P004W2_A536TBM07_CRT_USER_ID = new String[] {""} ;
      P004W2_n536TBM07_CRT_USER_ID = new boolean[] {false} ;
      P004W2_A535TBM07_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P004W2_n535TBM07_CRT_DATETIME = new boolean[] {false} ;
      P004W2_A533TBM07_OTHER_SITE_VIEW_FLG = new String[] {""} ;
      P004W2_n533TBM07_OTHER_SITE_VIEW_FLG = new boolean[] {false} ;
      P004W2_A532TBM07_CRF_EDIT_AUTH_FLG = new String[] {""} ;
      P004W2_n532TBM07_CRF_EDIT_AUTH_FLG = new boolean[] {false} ;
      P004W2_A531TBM07_CRF_INP_AUTH_FLG = new String[] {""} ;
      P004W2_n531TBM07_CRF_INP_AUTH_FLG = new boolean[] {false} ;
      A540TBM07_UPD_PROG_NM = "" ;
      A539TBM07_UPD_USER_ID = "" ;
      A538TBM07_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A537TBM07_CRT_PROG_NM = "" ;
      A536TBM07_CRT_USER_ID = "" ;
      A535TBM07_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A533TBM07_OTHER_SITE_VIEW_FLG = "" ;
      A532TBM07_CRF_EDIT_AUTH_FLG = "" ;
      A531TBM07_CRF_INP_AUTH_FLG = "" ;
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
            P004W2_A534TBM07_DEL_FLG, P004W2_n534TBM07_DEL_FLG, P004W2_A530TBM07_AUTH_CD, P004W2_A541TBM07_UPD_CNT, P004W2_n541TBM07_UPD_CNT, P004W2_A540TBM07_UPD_PROG_NM, P004W2_n540TBM07_UPD_PROG_NM, P004W2_A539TBM07_UPD_USER_ID, P004W2_n539TBM07_UPD_USER_ID, P004W2_A538TBM07_UPD_DATETIME,
            P004W2_n538TBM07_UPD_DATETIME, P004W2_A537TBM07_CRT_PROG_NM, P004W2_n537TBM07_CRT_PROG_NM, P004W2_A536TBM07_CRT_USER_ID, P004W2_n536TBM07_CRT_USER_ID, P004W2_A535TBM07_CRT_DATETIME, P004W2_n535TBM07_CRT_DATETIME, P004W2_A533TBM07_OTHER_SITE_VIEW_FLG, P004W2_n533TBM07_OTHER_SITE_VIEW_FLG, P004W2_A532TBM07_CRF_EDIT_AUTH_FLG,
            P004W2_n532TBM07_CRF_EDIT_AUTH_FLG, P004W2_A531TBM07_CRF_INP_AUTH_FLG, P004W2_n531TBM07_CRF_INP_AUTH_FLG
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
   private short GXv_int16[] ;
   private short Gx_err ;
   private int GXActiveErrHndl ;
   private long A541TBM07_UPD_CNT ;
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
   private java.util.Date A538TBM07_UPD_DATETIME ;
   private java.util.Date A535TBM07_CRT_DATETIME ;
   private boolean returnInSub ;
   private boolean n534TBM07_DEL_FLG ;
   private boolean n541TBM07_UPD_CNT ;
   private boolean n540TBM07_UPD_PROG_NM ;
   private boolean n539TBM07_UPD_USER_ID ;
   private boolean n538TBM07_UPD_DATETIME ;
   private boolean n537TBM07_CRT_PROG_NM ;
   private boolean n536TBM07_CRT_USER_ID ;
   private boolean n535TBM07_CRT_DATETIME ;
   private boolean n533TBM07_OTHER_SITE_VIEW_FLG ;
   private boolean n532TBM07_CRF_EDIT_AUTH_FLG ;
   private boolean n531TBM07_CRF_INP_AUTH_FLG ;
   private String AV16P_AUTH_CD ;
   private String AV14W_RTN_MSG ;
   private String AV8C_APP_ID ;
   private String A530TBM07_AUTH_CD ;
   private String A534TBM07_DEL_FLG ;
   private String A540TBM07_UPD_PROG_NM ;
   private String A539TBM07_UPD_USER_ID ;
   private String A537TBM07_CRT_PROG_NM ;
   private String A536TBM07_CRT_USER_ID ;
   private String A533TBM07_OTHER_SITE_VIEW_FLG ;
   private String A532TBM07_CRF_EDIT_AUTH_FLG ;
   private String A531TBM07_CRF_INP_AUTH_FLG ;
   private String AV15W_STR ;
   private String AV10W_MSG ;
   private GxObjectCollection[] aP1 ;
   private short[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P004W2_A534TBM07_DEL_FLG ;
   private boolean[] P004W2_n534TBM07_DEL_FLG ;
   private String[] P004W2_A530TBM07_AUTH_CD ;
   private long[] P004W2_A541TBM07_UPD_CNT ;
   private boolean[] P004W2_n541TBM07_UPD_CNT ;
   private String[] P004W2_A540TBM07_UPD_PROG_NM ;
   private boolean[] P004W2_n540TBM07_UPD_PROG_NM ;
   private String[] P004W2_A539TBM07_UPD_USER_ID ;
   private boolean[] P004W2_n539TBM07_UPD_USER_ID ;
   private java.util.Date[] P004W2_A538TBM07_UPD_DATETIME ;
   private boolean[] P004W2_n538TBM07_UPD_DATETIME ;
   private String[] P004W2_A537TBM07_CRT_PROG_NM ;
   private boolean[] P004W2_n537TBM07_CRT_PROG_NM ;
   private String[] P004W2_A536TBM07_CRT_USER_ID ;
   private boolean[] P004W2_n536TBM07_CRT_USER_ID ;
   private java.util.Date[] P004W2_A535TBM07_CRT_DATETIME ;
   private boolean[] P004W2_n535TBM07_CRT_DATETIME ;
   private String[] P004W2_A533TBM07_OTHER_SITE_VIEW_FLG ;
   private boolean[] P004W2_n533TBM07_OTHER_SITE_VIEW_FLG ;
   private String[] P004W2_A532TBM07_CRF_EDIT_AUTH_FLG ;
   private boolean[] P004W2_n532TBM07_CRF_EDIT_AUTH_FLG ;
   private String[] P004W2_A531TBM07_CRF_INP_AUTH_FLG ;
   private boolean[] P004W2_n531TBM07_CRF_INP_AUTH_FLG ;
   private GxObjectCollection AV13W_RTN_CSV ;
   private SdtB808_SD01_EXTRA_INFO AV9W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO15[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV11W_PARMS_ITEM ;
}

final  class b599_pc29_auth_behavior_res__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P004W2( com.genexus.internet.HttpContext httpContext ,
                                          String AV16P_AUTH_CD ,
                                          String A530TBM07_AUTH_CD ,
                                          String A534TBM07_DEL_FLG )
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
                                         com.genexus.internet.HttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_P004W2(httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] );
      }
      return super.getDynamicStatement(cursor, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P004W2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
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
                  stmt.setVarchar(sIdx, (String)parms[1], 2);
               }
               break;
      }
   }

}

