/*
               File: B599_PC13_STUDY_STAFF_RES
        Description: 試験参加スタッフマスタ取得
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:12:58.97
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b599_pc13_study_staff_res extends GXProcedure
{
   public b599_pc13_study_staff_res( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b599_pc13_study_staff_res.class ), "" );
   }

   public b599_pc13_study_staff_res( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             GxObjectCollection[] aP3 ,
                             short[] aP4 )
   {
      b599_pc13_study_staff_res.this.AV8P_STUDY_ID = aP0;
      b599_pc13_study_staff_res.this.AV10P_USER_ID = aP1;
      b599_pc13_study_staff_res.this.AV9P_STYDY_AUTH_CD = aP2;
      b599_pc13_study_staff_res.this.AV12W_RTN_CSV = aP3[0];
      this.aP3 = aP3;
      b599_pc13_study_staff_res.this.aP4 = aP4;
      b599_pc13_study_staff_res.this.aP5 = aP5;
      b599_pc13_study_staff_res.this.aP5 = new String[] {""};
      initialize();
      privateExecute();
      return aP5[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        GxObjectCollection[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             GxObjectCollection[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 )
   {
      b599_pc13_study_staff_res.this.AV8P_STUDY_ID = aP0;
      b599_pc13_study_staff_res.this.AV10P_USER_ID = aP1;
      b599_pc13_study_staff_res.this.AV9P_STYDY_AUTH_CD = aP2;
      b599_pc13_study_staff_res.this.AV12W_RTN_CSV = aP3[0];
      this.aP3 = aP3;
      b599_pc13_study_staff_res.this.aP4 = aP4;
      b599_pc13_study_staff_res.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16C_APP_ID = "B599" ;
      AV11W_RTN_CD = (short)(0) ;
      AV13W_RTN_MSG = "" ;
      AV17W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV17W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV16C_APP_ID );
      /* Execute user subroutine: S111 */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV15W_STUDY_ID = GXutil.lval( AV8P_STUDY_ID) ;
      AV22GXLvl33 = (byte)(0) ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV8P_STUDY_ID ,
                                           AV10P_USER_ID ,
                                           AV9P_STYDY_AUTH_CD ,
                                           new Long(A107TBM23_STUDY_ID) ,
                                           new Long(AV15W_STUDY_ID) ,
                                           A108TBM23_USER_ID ,
                                           A109TBM23_STYDY_AUTH_CD ,
                                           A385TBM23_DEL_FLG },
                                           new int[] {
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      Gx_ope = "Fetch" ;
      Gx_etb = "TBM23_STUDY_STAFF" ;
      /* Using cursor P00372 */
      pr_default.execute(0, new Object[] {new Long(AV15W_STUDY_ID), AV10P_USER_ID, AV9P_STYDY_AUTH_CD});
      if ( Gx_err != 0 )
      {
         AV22GXLvl33 = (byte)(1) ;
      }
      while ( (pr_default.getStatus(0) != 101) )
      {
         A385TBM23_DEL_FLG = P00372_A385TBM23_DEL_FLG[0] ;
         n385TBM23_DEL_FLG = P00372_n385TBM23_DEL_FLG[0] ;
         A109TBM23_STYDY_AUTH_CD = P00372_A109TBM23_STYDY_AUTH_CD[0] ;
         A108TBM23_USER_ID = P00372_A108TBM23_USER_ID[0] ;
         A107TBM23_STUDY_ID = P00372_A107TBM23_STUDY_ID[0] ;
         A392TBM23_UPD_CNT = P00372_A392TBM23_UPD_CNT[0] ;
         n392TBM23_UPD_CNT = P00372_n392TBM23_UPD_CNT[0] ;
         A391TBM23_UPD_PROG_NM = P00372_A391TBM23_UPD_PROG_NM[0] ;
         n391TBM23_UPD_PROG_NM = P00372_n391TBM23_UPD_PROG_NM[0] ;
         A390TBM23_UPD_USER_ID = P00372_A390TBM23_UPD_USER_ID[0] ;
         n390TBM23_UPD_USER_ID = P00372_n390TBM23_UPD_USER_ID[0] ;
         A389TBM23_UPD_DATETIME = P00372_A389TBM23_UPD_DATETIME[0] ;
         n389TBM23_UPD_DATETIME = P00372_n389TBM23_UPD_DATETIME[0] ;
         A388TBM23_CRT_PROG_NM = P00372_A388TBM23_CRT_PROG_NM[0] ;
         n388TBM23_CRT_PROG_NM = P00372_n388TBM23_CRT_PROG_NM[0] ;
         A387TBM23_CRT_USER_ID = P00372_A387TBM23_CRT_USER_ID[0] ;
         n387TBM23_CRT_USER_ID = P00372_n387TBM23_CRT_USER_ID[0] ;
         A386TBM23_CRT_DATETIME = P00372_A386TBM23_CRT_DATETIME[0] ;
         n386TBM23_CRT_DATETIME = P00372_n386TBM23_CRT_DATETIME[0] ;
         AV22GXLvl33 = (byte)(1) ;
         GXt_char1 = AV14W_STR ;
         GXv_char2[0] = GXt_char1 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A108TBM23_USER_ID, GXv_char2) ;
         b599_pc13_study_staff_res.this.GXt_char1 = GXv_char2[0] ;
         GXt_char3 = AV14W_STR ;
         GXv_char4[0] = GXt_char3 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A109TBM23_STYDY_AUTH_CD, GXv_char4) ;
         b599_pc13_study_staff_res.this.GXt_char3 = GXv_char4[0] ;
         GXt_char5 = AV14W_STR ;
         GXv_char6[0] = GXt_char5 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A385TBM23_DEL_FLG, GXv_char6) ;
         b599_pc13_study_staff_res.this.GXt_char5 = GXv_char6[0] ;
         GXt_char7 = AV14W_STR ;
         GXv_char8[0] = GXt_char7 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A386TBM23_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char8) ;
         b599_pc13_study_staff_res.this.GXt_char7 = GXv_char8[0] ;
         GXt_char9 = AV14W_STR ;
         GXv_char10[0] = GXt_char9 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A387TBM23_CRT_USER_ID, GXv_char10) ;
         b599_pc13_study_staff_res.this.GXt_char9 = GXv_char10[0] ;
         GXt_char11 = AV14W_STR ;
         GXv_char12[0] = GXt_char11 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A388TBM23_CRT_PROG_NM, GXv_char12) ;
         b599_pc13_study_staff_res.this.GXt_char11 = GXv_char12[0] ;
         GXt_char13 = AV14W_STR ;
         GXv_char14[0] = GXt_char13 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A389TBM23_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char14) ;
         b599_pc13_study_staff_res.this.GXt_char13 = GXv_char14[0] ;
         GXt_char15 = AV14W_STR ;
         GXv_char16[0] = GXt_char15 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A390TBM23_UPD_USER_ID, GXv_char16) ;
         b599_pc13_study_staff_res.this.GXt_char15 = GXv_char16[0] ;
         GXt_char17 = AV14W_STR ;
         GXv_char18[0] = GXt_char17 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A391TBM23_UPD_PROG_NM, GXv_char18) ;
         b599_pc13_study_staff_res.this.GXt_char17 = GXv_char18[0] ;
         AV14W_STR = GXutil.trim( GXutil.str( A107TBM23_STUDY_ID, 10, 0)) + "," + GXt_char1 + "," + GXt_char3 + "," + GXt_char5 + "," + GXt_char7 + "," + GXt_char9 + "," + GXt_char11 + "," + GXt_char13 + "," + GXt_char15 + "," + GXt_char17 + "," + GXutil.trim( GXutil.str( A392TBM23_UPD_CNT, 10, 0)) ;
         AV12W_RTN_CSV.add(AV14W_STR, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV22GXLvl33 == 0 )
      {
         AV11W_RTN_CD = (short)(1) ;
         GXt_char17 = AV13W_RTN_MSG ;
         GXv_char18[0] = GXt_char17 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char18) ;
         b599_pc13_study_staff_res.this.GXt_char17 = GXv_char18[0] ;
         AV13W_RTN_MSG = GXt_char17 ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      AV17W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      AV18W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV18W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_STUDY_ID" );
      AV18W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV8P_STUDY_ID );
      AV17W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV18W_PARMS_ITEM, 0);
      AV18W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV18W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_USER_ID" );
      AV18W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV10P_USER_ID );
      AV17W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV18W_PARMS_ITEM, 0);
      AV18W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV18W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_STYDY_AUTH_CD" );
      AV18W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV9P_STYDY_AUTH_CD );
      AV17W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV18W_PARMS_ITEM, 0);
      AV19W_MSG = "SUB_INIT" ;
      GXv_SdtB808_SD01_EXTRA_INFO19[0] = AV17W_EXTRA_INFO;
      GXv_int20[0] = AV11W_RTN_CD ;
      GXv_char18[0] = AV13W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV23Pgmname, (short)(1), AV19W_MSG, GXv_SdtB808_SD01_EXTRA_INFO19, GXv_int20, GXv_char18) ;
      AV17W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO19[0] ;
      b599_pc13_study_staff_res.this.AV11W_RTN_CD = GXv_int20[0] ;
      b599_pc13_study_staff_res.this.AV13W_RTN_MSG = GXv_char18[0] ;
   }

   public void S121( )
   {
      /* 'SUB_ERROR' Routine */
      AV19W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO19[0] = AV17W_EXTRA_INFO;
      GXv_int20[0] = AV11W_RTN_CD ;
      GXv_char18[0] = AV13W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV23Pgmname, (short)(0), AV19W_MSG, GXv_SdtB808_SD01_EXTRA_INFO19, GXv_int20, GXv_char18) ;
      AV17W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO19[0] ;
      b599_pc13_study_staff_res.this.AV11W_RTN_CD = GXv_int20[0] ;
      b599_pc13_study_staff_res.this.AV13W_RTN_MSG = GXv_char18[0] ;
      context.globals.Gx_eop = (byte)(0) ;
   }

   protected void cleanup( )
   {
      this.aP3[0] = b599_pc13_study_staff_res.this.AV12W_RTN_CSV;
      this.aP4[0] = b599_pc13_study_staff_res.this.AV11W_RTN_CD;
      this.aP5[0] = b599_pc13_study_staff_res.this.AV13W_RTN_MSG;
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
      AV13W_RTN_MSG = "" ;
      AV16C_APP_ID = "" ;
      AV17W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      scmdbuf = "" ;
      A108TBM23_USER_ID = "" ;
      A109TBM23_STYDY_AUTH_CD = "" ;
      A385TBM23_DEL_FLG = "" ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      P00372_A385TBM23_DEL_FLG = new String[] {""} ;
      P00372_n385TBM23_DEL_FLG = new boolean[] {false} ;
      P00372_A109TBM23_STYDY_AUTH_CD = new String[] {""} ;
      P00372_A108TBM23_USER_ID = new String[] {""} ;
      P00372_A107TBM23_STUDY_ID = new long[1] ;
      P00372_A392TBM23_UPD_CNT = new long[1] ;
      P00372_n392TBM23_UPD_CNT = new boolean[] {false} ;
      P00372_A391TBM23_UPD_PROG_NM = new String[] {""} ;
      P00372_n391TBM23_UPD_PROG_NM = new boolean[] {false} ;
      P00372_A390TBM23_UPD_USER_ID = new String[] {""} ;
      P00372_n390TBM23_UPD_USER_ID = new boolean[] {false} ;
      P00372_A389TBM23_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P00372_n389TBM23_UPD_DATETIME = new boolean[] {false} ;
      P00372_A388TBM23_CRT_PROG_NM = new String[] {""} ;
      P00372_n388TBM23_CRT_PROG_NM = new boolean[] {false} ;
      P00372_A387TBM23_CRT_USER_ID = new String[] {""} ;
      P00372_n387TBM23_CRT_USER_ID = new boolean[] {false} ;
      P00372_A386TBM23_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P00372_n386TBM23_CRT_DATETIME = new boolean[] {false} ;
      A391TBM23_UPD_PROG_NM = "" ;
      A390TBM23_UPD_USER_ID = "" ;
      A389TBM23_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A388TBM23_CRT_PROG_NM = "" ;
      A387TBM23_CRT_USER_ID = "" ;
      A386TBM23_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      AV14W_STR = "" ;
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
      AV18W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV19W_MSG = "" ;
      AV23Pgmname = "" ;
      GXv_SdtB808_SD01_EXTRA_INFO19 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int20 = new short [1] ;
      GXv_char18 = new String [1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b599_pc13_study_staff_res__default(),
         new Object[] {
             new Object[] {
            P00372_A385TBM23_DEL_FLG, P00372_n385TBM23_DEL_FLG, P00372_A109TBM23_STYDY_AUTH_CD, P00372_A108TBM23_USER_ID, P00372_A107TBM23_STUDY_ID, P00372_A392TBM23_UPD_CNT, P00372_n392TBM23_UPD_CNT, P00372_A391TBM23_UPD_PROG_NM, P00372_n391TBM23_UPD_PROG_NM, P00372_A390TBM23_UPD_USER_ID,
            P00372_n390TBM23_UPD_USER_ID, P00372_A389TBM23_UPD_DATETIME, P00372_n389TBM23_UPD_DATETIME, P00372_A388TBM23_CRT_PROG_NM, P00372_n388TBM23_CRT_PROG_NM, P00372_A387TBM23_CRT_USER_ID, P00372_n387TBM23_CRT_USER_ID, P00372_A386TBM23_CRT_DATETIME, P00372_n386TBM23_CRT_DATETIME
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV23Pgmname = "B599_PC13_STUDY_STAFF_RES" ;
      /* GeneXus formulas. */
      AV23Pgmname = "B599_PC13_STUDY_STAFF_RES" ;
      Gx_err = (short)(0) ;
   }

   private byte AV22GXLvl33 ;
   private short AV11W_RTN_CD ;
   private short Gx_err ;
   private short GXv_int20[] ;
   private int GXActiveErrHndl ;
   private long AV15W_STUDY_ID ;
   private long A107TBM23_STUDY_ID ;
   private long A392TBM23_UPD_CNT ;
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
   private String AV23Pgmname ;
   private String GXv_char18[] ;
   private String Gx_emsg ;
   private java.util.Date A389TBM23_UPD_DATETIME ;
   private java.util.Date A386TBM23_CRT_DATETIME ;
   private boolean returnInSub ;
   private boolean n385TBM23_DEL_FLG ;
   private boolean n392TBM23_UPD_CNT ;
   private boolean n391TBM23_UPD_PROG_NM ;
   private boolean n390TBM23_UPD_USER_ID ;
   private boolean n389TBM23_UPD_DATETIME ;
   private boolean n388TBM23_CRT_PROG_NM ;
   private boolean n387TBM23_CRT_USER_ID ;
   private boolean n386TBM23_CRT_DATETIME ;
   private String AV8P_STUDY_ID ;
   private String AV10P_USER_ID ;
   private String AV9P_STYDY_AUTH_CD ;
   private String AV13W_RTN_MSG ;
   private String AV16C_APP_ID ;
   private String A108TBM23_USER_ID ;
   private String A109TBM23_STYDY_AUTH_CD ;
   private String A385TBM23_DEL_FLG ;
   private String A391TBM23_UPD_PROG_NM ;
   private String A390TBM23_UPD_USER_ID ;
   private String A388TBM23_CRT_PROG_NM ;
   private String A387TBM23_CRT_USER_ID ;
   private String AV14W_STR ;
   private String AV19W_MSG ;
   private GxObjectCollection[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P00372_A385TBM23_DEL_FLG ;
   private boolean[] P00372_n385TBM23_DEL_FLG ;
   private String[] P00372_A109TBM23_STYDY_AUTH_CD ;
   private String[] P00372_A108TBM23_USER_ID ;
   private long[] P00372_A107TBM23_STUDY_ID ;
   private long[] P00372_A392TBM23_UPD_CNT ;
   private boolean[] P00372_n392TBM23_UPD_CNT ;
   private String[] P00372_A391TBM23_UPD_PROG_NM ;
   private boolean[] P00372_n391TBM23_UPD_PROG_NM ;
   private String[] P00372_A390TBM23_UPD_USER_ID ;
   private boolean[] P00372_n390TBM23_UPD_USER_ID ;
   private java.util.Date[] P00372_A389TBM23_UPD_DATETIME ;
   private boolean[] P00372_n389TBM23_UPD_DATETIME ;
   private String[] P00372_A388TBM23_CRT_PROG_NM ;
   private boolean[] P00372_n388TBM23_CRT_PROG_NM ;
   private String[] P00372_A387TBM23_CRT_USER_ID ;
   private boolean[] P00372_n387TBM23_CRT_USER_ID ;
   private java.util.Date[] P00372_A386TBM23_CRT_DATETIME ;
   private boolean[] P00372_n386TBM23_CRT_DATETIME ;
   private GxObjectCollection AV12W_RTN_CSV ;
   private SdtB808_SD01_EXTRA_INFO AV17W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO19[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV18W_PARMS_ITEM ;
}

final  class b599_pc13_study_staff_res__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P00372( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV8P_STUDY_ID ,
                                          String AV10P_USER_ID ,
                                          String AV9P_STYDY_AUTH_CD ,
                                          long A107TBM23_STUDY_ID ,
                                          long AV15W_STUDY_ID ,
                                          String A108TBM23_USER_ID ,
                                          String A109TBM23_STYDY_AUTH_CD ,
                                          String A385TBM23_DEL_FLG )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int21 ;
      GXv_int21 = new byte [3] ;
      Object[] GXv_Object22 ;
      GXv_Object22 = new Object [2] ;
      Gx_ope = "Declare" ;
      Gx_etb = "TBM23_STUDY_STAFF" ;
      scmdbuf = "SELECT `TBM23_DEL_FLG`, `TBM23_STYDY_AUTH_CD`, `TBM23_USER_ID`, `TBM23_STUDY_ID`," ;
      scmdbuf = scmdbuf + " `TBM23_UPD_CNT`, `TBM23_UPD_PROG_NM`, `TBM23_UPD_USER_ID`, `TBM23_UPD_DATETIME`," ;
      scmdbuf = scmdbuf + " `TBM23_CRT_PROG_NM`, `TBM23_CRT_USER_ID`, `TBM23_CRT_DATETIME` FROM `TBM23_STUDY_STAFF`" ;
      scmdbuf = scmdbuf + " WHERE (`TBM23_DEL_FLG` = '0')" ;
      if ( ! (GXutil.strcmp("", AV8P_STUDY_ID)==0) )
      {
         sWhereString = sWhereString + " and (`TBM23_STUDY_ID` = ?)" ;
      }
      else
      {
         GXv_int21[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV10P_USER_ID)==0) )
      {
         sWhereString = sWhereString + " and (`TBM23_USER_ID` = ?)" ;
      }
      else
      {
         GXv_int21[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV9P_STYDY_AUTH_CD)==0) )
      {
         sWhereString = sWhereString + " and (`TBM23_STYDY_AUTH_CD` = ?)" ;
      }
      else
      {
         GXv_int21[2] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TBM23_STUDY_ID`, `TBM23_USER_ID`, `TBM23_STYDY_AUTH_CD`" ;
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
                  return conditional_P00372(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).longValue() , ((Number) dynConstraints[4]).longValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00372", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
               ((long[]) buf[5])[0] = rslt.getLong(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
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
                  stmt.setLong(sIdx, ((Number) parms[3]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[4], 128);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[5], 2);
               }
               return;
      }
   }

}

