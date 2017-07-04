/*
               File: B599_PC04_CRF_AUTH_RES
        Description: CRFŒ ŒÀƒ}ƒXƒ^Žæ“¾
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:12:50.7
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b599_pc04_crf_auth_res extends GXProcedure
{
   public b599_pc04_crf_auth_res( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b599_pc04_crf_auth_res.class ), "" );
   }

   public b599_pc04_crf_auth_res( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( long aP0 ,
                             String aP1 ,
                             String aP2 ,
                             GxObjectCollection[] aP3 ,
                             short[] aP4 )
   {
      b599_pc04_crf_auth_res.this.AV9P_STUDY_ID = aP0;
      b599_pc04_crf_auth_res.this.AV8P_CRF_ID = aP1;
      b599_pc04_crf_auth_res.this.AV10P_STYDY_AUTH_CD = aP2;
      b599_pc04_crf_auth_res.this.AV13W_RTN_CSV = aP3[0];
      this.aP3 = aP3;
      b599_pc04_crf_auth_res.this.aP4 = aP4;
      b599_pc04_crf_auth_res.this.aP5 = aP5;
      b599_pc04_crf_auth_res.this.aP5 = new String[] {""};
      initialize();
      privateExecute();
      return aP5[0];
   }

   public void execute( long aP0 ,
                        String aP1 ,
                        String aP2 ,
                        GxObjectCollection[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( long aP0 ,
                             String aP1 ,
                             String aP2 ,
                             GxObjectCollection[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 )
   {
      b599_pc04_crf_auth_res.this.AV9P_STUDY_ID = aP0;
      b599_pc04_crf_auth_res.this.AV8P_CRF_ID = aP1;
      b599_pc04_crf_auth_res.this.AV10P_STYDY_AUTH_CD = aP2;
      b599_pc04_crf_auth_res.this.AV13W_RTN_CSV = aP3[0];
      this.aP3 = aP3;
      b599_pc04_crf_auth_res.this.aP4 = aP4;
      b599_pc04_crf_auth_res.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16C_APP_ID = "B599" ;
      AV12W_RTN_CD = (short)(0) ;
      AV14W_RTN_MSG = "" ;
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
      AV11W_CRF_ID = (short)(GXutil.lval( AV8P_CRF_ID)) ;
      AV22GXLvl33 = (byte)(0) ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV8P_CRF_ID ,
                                           AV10P_STYDY_AUTH_CD ,
                                           new Short(A29TBM34_CRF_ID) ,
                                           new Short(AV11W_CRF_ID) ,
                                           A30TBM34_STYDY_AUTH_CD ,
                                           A572TBM34_DEL_FLG ,
                                           new Long(AV9P_STUDY_ID) ,
                                           new Long(A28TBM34_STUDY_ID) },
                                           new int[] {
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.LONG
                                           }
      });
      Gx_ope = "Fetch" ;
      Gx_etb = "TBM34_CRF_AUTH" ;
      /* Using cursor P001Z2 */
      pr_default.execute(0, new Object[] {new Long(AV9P_STUDY_ID), new Short(AV11W_CRF_ID), AV10P_STYDY_AUTH_CD});
      if ( Gx_err != 0 )
      {
         AV22GXLvl33 = (byte)(1) ;
      }
      while ( (pr_default.getStatus(0) != 101) )
      {
         A572TBM34_DEL_FLG = P001Z2_A572TBM34_DEL_FLG[0] ;
         n572TBM34_DEL_FLG = P001Z2_n572TBM34_DEL_FLG[0] ;
         A30TBM34_STYDY_AUTH_CD = P001Z2_A30TBM34_STYDY_AUTH_CD[0] ;
         A29TBM34_CRF_ID = P001Z2_A29TBM34_CRF_ID[0] ;
         A28TBM34_STUDY_ID = P001Z2_A28TBM34_STUDY_ID[0] ;
         A579TBM34_UPD_CNT = P001Z2_A579TBM34_UPD_CNT[0] ;
         n579TBM34_UPD_CNT = P001Z2_n579TBM34_UPD_CNT[0] ;
         A578TBM34_UPD_PROG_NM = P001Z2_A578TBM34_UPD_PROG_NM[0] ;
         n578TBM34_UPD_PROG_NM = P001Z2_n578TBM34_UPD_PROG_NM[0] ;
         A577TBM34_UPD_USER_ID = P001Z2_A577TBM34_UPD_USER_ID[0] ;
         n577TBM34_UPD_USER_ID = P001Z2_n577TBM34_UPD_USER_ID[0] ;
         A576TBM34_UPD_DATETIME = P001Z2_A576TBM34_UPD_DATETIME[0] ;
         n576TBM34_UPD_DATETIME = P001Z2_n576TBM34_UPD_DATETIME[0] ;
         A575TBM34_CRT_PROG_NM = P001Z2_A575TBM34_CRT_PROG_NM[0] ;
         n575TBM34_CRT_PROG_NM = P001Z2_n575TBM34_CRT_PROG_NM[0] ;
         A574TBM34_CRT_USER_ID = P001Z2_A574TBM34_CRT_USER_ID[0] ;
         n574TBM34_CRT_USER_ID = P001Z2_n574TBM34_CRT_USER_ID[0] ;
         A573TBM34_CRT_DATETIME = P001Z2_A573TBM34_CRT_DATETIME[0] ;
         n573TBM34_CRT_DATETIME = P001Z2_n573TBM34_CRT_DATETIME[0] ;
         A571TBM34_DISPLAY_FLG = P001Z2_A571TBM34_DISPLAY_FLG[0] ;
         n571TBM34_DISPLAY_FLG = P001Z2_n571TBM34_DISPLAY_FLG[0] ;
         AV22GXLvl33 = (byte)(1) ;
         GXt_char1 = AV15W_STR ;
         GXv_char2[0] = GXt_char1 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A30TBM34_STYDY_AUTH_CD, GXv_char2) ;
         b599_pc04_crf_auth_res.this.GXt_char1 = GXv_char2[0] ;
         GXt_char3 = AV15W_STR ;
         GXv_char4[0] = GXt_char3 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A571TBM34_DISPLAY_FLG, GXv_char4) ;
         b599_pc04_crf_auth_res.this.GXt_char3 = GXv_char4[0] ;
         GXt_char5 = AV15W_STR ;
         GXv_char6[0] = GXt_char5 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A572TBM34_DEL_FLG, GXv_char6) ;
         b599_pc04_crf_auth_res.this.GXt_char5 = GXv_char6[0] ;
         GXt_char7 = AV15W_STR ;
         GXv_char8[0] = GXt_char7 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A573TBM34_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char8) ;
         b599_pc04_crf_auth_res.this.GXt_char7 = GXv_char8[0] ;
         GXt_char9 = AV15W_STR ;
         GXv_char10[0] = GXt_char9 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A574TBM34_CRT_USER_ID, GXv_char10) ;
         b599_pc04_crf_auth_res.this.GXt_char9 = GXv_char10[0] ;
         GXt_char11 = AV15W_STR ;
         GXv_char12[0] = GXt_char11 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A575TBM34_CRT_PROG_NM, GXv_char12) ;
         b599_pc04_crf_auth_res.this.GXt_char11 = GXv_char12[0] ;
         GXt_char13 = AV15W_STR ;
         GXv_char14[0] = GXt_char13 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A576TBM34_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char14) ;
         b599_pc04_crf_auth_res.this.GXt_char13 = GXv_char14[0] ;
         GXt_char15 = AV15W_STR ;
         GXv_char16[0] = GXt_char15 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A577TBM34_UPD_USER_ID, GXv_char16) ;
         b599_pc04_crf_auth_res.this.GXt_char15 = GXv_char16[0] ;
         GXt_char17 = AV15W_STR ;
         GXv_char18[0] = GXt_char17 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A578TBM34_UPD_PROG_NM, GXv_char18) ;
         b599_pc04_crf_auth_res.this.GXt_char17 = GXv_char18[0] ;
         AV15W_STR = GXutil.trim( GXutil.str( A28TBM34_STUDY_ID, 10, 0)) + "," + GXutil.trim( GXutil.str( A29TBM34_CRF_ID, 10, 0)) + "," + GXt_char1 + "," + GXt_char3 + "," + GXt_char5 + "," + GXt_char7 + "," + GXt_char9 + "," + GXt_char11 + "," + GXt_char13 + "," + GXt_char15 + "," + GXt_char17 + "," + GXutil.trim( GXutil.str( A579TBM34_UPD_CNT, 10, 0)) ;
         AV13W_RTN_CSV.add(AV15W_STR, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV22GXLvl33 == 0 )
      {
         AV12W_RTN_CD = (short)(1) ;
         GXt_char17 = AV14W_RTN_MSG ;
         GXv_char18[0] = GXt_char17 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char18) ;
         b599_pc04_crf_auth_res.this.GXt_char17 = GXv_char18[0] ;
         AV14W_RTN_MSG = GXt_char17 ;
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
      AV18W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( GXutil.trim( GXutil.str( AV9P_STUDY_ID, 10, 0)) );
      AV17W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV18W_PARMS_ITEM, 0);
      AV18W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV18W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_CRF_ID" );
      AV18W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV8P_CRF_ID );
      AV17W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV18W_PARMS_ITEM, 0);
      AV18W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV18W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_STYDY_AUTH_CD" );
      AV18W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV10P_STYDY_AUTH_CD );
      AV17W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV18W_PARMS_ITEM, 0);
      AV19W_MSG = "SUB_INIT" ;
      GXv_SdtB808_SD01_EXTRA_INFO19[0] = AV17W_EXTRA_INFO;
      GXv_int20[0] = AV12W_RTN_CD ;
      GXv_char18[0] = AV14W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV23Pgmname, (short)(1), AV19W_MSG, GXv_SdtB808_SD01_EXTRA_INFO19, GXv_int20, GXv_char18) ;
      AV17W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO19[0] ;
      b599_pc04_crf_auth_res.this.AV12W_RTN_CD = GXv_int20[0] ;
      b599_pc04_crf_auth_res.this.AV14W_RTN_MSG = GXv_char18[0] ;
   }

   public void S121( )
   {
      /* 'SUB_ERROR' Routine */
      AV19W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO19[0] = AV17W_EXTRA_INFO;
      GXv_int20[0] = AV12W_RTN_CD ;
      GXv_char18[0] = AV14W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV23Pgmname, (short)(0), AV19W_MSG, GXv_SdtB808_SD01_EXTRA_INFO19, GXv_int20, GXv_char18) ;
      AV17W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO19[0] ;
      b599_pc04_crf_auth_res.this.AV12W_RTN_CD = GXv_int20[0] ;
      b599_pc04_crf_auth_res.this.AV14W_RTN_MSG = GXv_char18[0] ;
      context.globals.Gx_eop = (byte)(0) ;
   }

   protected void cleanup( )
   {
      this.aP3[0] = b599_pc04_crf_auth_res.this.AV13W_RTN_CSV;
      this.aP4[0] = b599_pc04_crf_auth_res.this.AV12W_RTN_CD;
      this.aP5[0] = b599_pc04_crf_auth_res.this.AV14W_RTN_MSG;
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
      AV16C_APP_ID = "" ;
      AV17W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      scmdbuf = "" ;
      A30TBM34_STYDY_AUTH_CD = "" ;
      A572TBM34_DEL_FLG = "" ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      P001Z2_A572TBM34_DEL_FLG = new String[] {""} ;
      P001Z2_n572TBM34_DEL_FLG = new boolean[] {false} ;
      P001Z2_A30TBM34_STYDY_AUTH_CD = new String[] {""} ;
      P001Z2_A29TBM34_CRF_ID = new short[1] ;
      P001Z2_A28TBM34_STUDY_ID = new long[1] ;
      P001Z2_A579TBM34_UPD_CNT = new long[1] ;
      P001Z2_n579TBM34_UPD_CNT = new boolean[] {false} ;
      P001Z2_A578TBM34_UPD_PROG_NM = new String[] {""} ;
      P001Z2_n578TBM34_UPD_PROG_NM = new boolean[] {false} ;
      P001Z2_A577TBM34_UPD_USER_ID = new String[] {""} ;
      P001Z2_n577TBM34_UPD_USER_ID = new boolean[] {false} ;
      P001Z2_A576TBM34_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P001Z2_n576TBM34_UPD_DATETIME = new boolean[] {false} ;
      P001Z2_A575TBM34_CRT_PROG_NM = new String[] {""} ;
      P001Z2_n575TBM34_CRT_PROG_NM = new boolean[] {false} ;
      P001Z2_A574TBM34_CRT_USER_ID = new String[] {""} ;
      P001Z2_n574TBM34_CRT_USER_ID = new boolean[] {false} ;
      P001Z2_A573TBM34_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P001Z2_n573TBM34_CRT_DATETIME = new boolean[] {false} ;
      P001Z2_A571TBM34_DISPLAY_FLG = new String[] {""} ;
      P001Z2_n571TBM34_DISPLAY_FLG = new boolean[] {false} ;
      A578TBM34_UPD_PROG_NM = "" ;
      A577TBM34_UPD_USER_ID = "" ;
      A576TBM34_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A575TBM34_CRT_PROG_NM = "" ;
      A574TBM34_CRT_USER_ID = "" ;
      A573TBM34_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A571TBM34_DISPLAY_FLG = "" ;
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
      AV18W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV19W_MSG = "" ;
      AV23Pgmname = "" ;
      GXv_SdtB808_SD01_EXTRA_INFO19 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int20 = new short [1] ;
      GXv_char18 = new String [1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b599_pc04_crf_auth_res__default(),
         new Object[] {
             new Object[] {
            P001Z2_A572TBM34_DEL_FLG, P001Z2_n572TBM34_DEL_FLG, P001Z2_A30TBM34_STYDY_AUTH_CD, P001Z2_A29TBM34_CRF_ID, P001Z2_A28TBM34_STUDY_ID, P001Z2_A579TBM34_UPD_CNT, P001Z2_n579TBM34_UPD_CNT, P001Z2_A578TBM34_UPD_PROG_NM, P001Z2_n578TBM34_UPD_PROG_NM, P001Z2_A577TBM34_UPD_USER_ID,
            P001Z2_n577TBM34_UPD_USER_ID, P001Z2_A576TBM34_UPD_DATETIME, P001Z2_n576TBM34_UPD_DATETIME, P001Z2_A575TBM34_CRT_PROG_NM, P001Z2_n575TBM34_CRT_PROG_NM, P001Z2_A574TBM34_CRT_USER_ID, P001Z2_n574TBM34_CRT_USER_ID, P001Z2_A573TBM34_CRT_DATETIME, P001Z2_n573TBM34_CRT_DATETIME, P001Z2_A571TBM34_DISPLAY_FLG,
            P001Z2_n571TBM34_DISPLAY_FLG
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV23Pgmname = "B599_PC04_CRF_AUTH_RES" ;
      /* GeneXus formulas. */
      AV23Pgmname = "B599_PC04_CRF_AUTH_RES" ;
      Gx_err = (short)(0) ;
   }

   private byte AV22GXLvl33 ;
   private short AV12W_RTN_CD ;
   private short AV11W_CRF_ID ;
   private short A29TBM34_CRF_ID ;
   private short Gx_err ;
   private short GXv_int20[] ;
   private int GXActiveErrHndl ;
   private long AV9P_STUDY_ID ;
   private long A28TBM34_STUDY_ID ;
   private long A579TBM34_UPD_CNT ;
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
   private java.util.Date A576TBM34_UPD_DATETIME ;
   private java.util.Date A573TBM34_CRT_DATETIME ;
   private boolean returnInSub ;
   private boolean n572TBM34_DEL_FLG ;
   private boolean n579TBM34_UPD_CNT ;
   private boolean n578TBM34_UPD_PROG_NM ;
   private boolean n577TBM34_UPD_USER_ID ;
   private boolean n576TBM34_UPD_DATETIME ;
   private boolean n575TBM34_CRT_PROG_NM ;
   private boolean n574TBM34_CRT_USER_ID ;
   private boolean n573TBM34_CRT_DATETIME ;
   private boolean n571TBM34_DISPLAY_FLG ;
   private String AV8P_CRF_ID ;
   private String AV10P_STYDY_AUTH_CD ;
   private String AV14W_RTN_MSG ;
   private String AV16C_APP_ID ;
   private String A30TBM34_STYDY_AUTH_CD ;
   private String A572TBM34_DEL_FLG ;
   private String A578TBM34_UPD_PROG_NM ;
   private String A577TBM34_UPD_USER_ID ;
   private String A575TBM34_CRT_PROG_NM ;
   private String A574TBM34_CRT_USER_ID ;
   private String A571TBM34_DISPLAY_FLG ;
   private String AV15W_STR ;
   private String AV19W_MSG ;
   private GxObjectCollection[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P001Z2_A572TBM34_DEL_FLG ;
   private boolean[] P001Z2_n572TBM34_DEL_FLG ;
   private String[] P001Z2_A30TBM34_STYDY_AUTH_CD ;
   private short[] P001Z2_A29TBM34_CRF_ID ;
   private long[] P001Z2_A28TBM34_STUDY_ID ;
   private long[] P001Z2_A579TBM34_UPD_CNT ;
   private boolean[] P001Z2_n579TBM34_UPD_CNT ;
   private String[] P001Z2_A578TBM34_UPD_PROG_NM ;
   private boolean[] P001Z2_n578TBM34_UPD_PROG_NM ;
   private String[] P001Z2_A577TBM34_UPD_USER_ID ;
   private boolean[] P001Z2_n577TBM34_UPD_USER_ID ;
   private java.util.Date[] P001Z2_A576TBM34_UPD_DATETIME ;
   private boolean[] P001Z2_n576TBM34_UPD_DATETIME ;
   private String[] P001Z2_A575TBM34_CRT_PROG_NM ;
   private boolean[] P001Z2_n575TBM34_CRT_PROG_NM ;
   private String[] P001Z2_A574TBM34_CRT_USER_ID ;
   private boolean[] P001Z2_n574TBM34_CRT_USER_ID ;
   private java.util.Date[] P001Z2_A573TBM34_CRT_DATETIME ;
   private boolean[] P001Z2_n573TBM34_CRT_DATETIME ;
   private String[] P001Z2_A571TBM34_DISPLAY_FLG ;
   private boolean[] P001Z2_n571TBM34_DISPLAY_FLG ;
   private GxObjectCollection AV13W_RTN_CSV ;
   private SdtB808_SD01_EXTRA_INFO AV17W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO19[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV18W_PARMS_ITEM ;
}

final  class b599_pc04_crf_auth_res__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P001Z2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV8P_CRF_ID ,
                                          String AV10P_STYDY_AUTH_CD ,
                                          short A29TBM34_CRF_ID ,
                                          short AV11W_CRF_ID ,
                                          String A30TBM34_STYDY_AUTH_CD ,
                                          String A572TBM34_DEL_FLG ,
                                          long AV9P_STUDY_ID ,
                                          long A28TBM34_STUDY_ID )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int21 ;
      GXv_int21 = new byte [3] ;
      Object[] GXv_Object22 ;
      GXv_Object22 = new Object [2] ;
      Gx_ope = "Declare" ;
      Gx_etb = "TBM34_CRF_AUTH" ;
      scmdbuf = "SELECT `TBM34_DEL_FLG`, `TBM34_STYDY_AUTH_CD`, `TBM34_CRF_ID`, `TBM34_STUDY_ID`," ;
      scmdbuf = scmdbuf + " `TBM34_UPD_CNT`, `TBM34_UPD_PROG_NM`, `TBM34_UPD_USER_ID`, `TBM34_UPD_DATETIME`," ;
      scmdbuf = scmdbuf + " `TBM34_CRT_PROG_NM`, `TBM34_CRT_USER_ID`, `TBM34_CRT_DATETIME`, `TBM34_DISPLAY_FLG`" ;
      scmdbuf = scmdbuf + " FROM `TBM34_CRF_AUTH`" ;
      scmdbuf = scmdbuf + " WHERE (`TBM34_STUDY_ID` = ?)" ;
      scmdbuf = scmdbuf + " and (`TBM34_DEL_FLG` = '0')" ;
      if ( ! (GXutil.strcmp("", AV8P_CRF_ID)==0) )
      {
         sWhereString = sWhereString + " and (`TBM34_CRF_ID` = ?)" ;
      }
      else
      {
         GXv_int21[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV10P_STYDY_AUTH_CD)==0) )
      {
         sWhereString = sWhereString + " and (`TBM34_STYDY_AUTH_CD` = ?)" ;
      }
      else
      {
         GXv_int21[2] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TBM34_STUDY_ID`, `TBM34_CRF_ID`, `TBM34_STYDY_AUTH_CD`" ;
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
                  return conditional_P001Z2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).longValue() , ((Number) dynConstraints[7]).longValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001Z2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
               ((short[]) buf[3])[0] = rslt.getShort(3) ;
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
               ((String[]) buf[19])[0] = rslt.getVarchar(12) ;
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
                  stmt.setLong(sIdx, ((Number) parms[3]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[4]).shortValue());
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

