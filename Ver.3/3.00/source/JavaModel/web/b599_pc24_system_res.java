/*
               File: B599_PC24_SYSTEM_RES
        Description: システム規定値マスタ取得
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:16:49.92
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b599_pc24_system_res extends GXProcedure
{
   public b599_pc24_system_res( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b599_pc24_system_res.class ), "" );
   }

   public b599_pc24_system_res( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 ,
                             GxObjectCollection[] aP1 ,
                             short[] aP2 )
   {
      b599_pc24_system_res.this.AV9P_SYS_ID = aP0;
      b599_pc24_system_res.this.AV11W_RTN_CSV = aP1[0];
      this.aP1 = aP1;
      b599_pc24_system_res.this.aP2 = aP2;
      b599_pc24_system_res.this.aP3 = aP3;
      b599_pc24_system_res.this.aP3 = new String[] {""};
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
      b599_pc24_system_res.this.AV9P_SYS_ID = aP0;
      b599_pc24_system_res.this.AV11W_RTN_CSV = aP1[0];
      this.aP1 = aP1;
      b599_pc24_system_res.this.aP2 = aP2;
      b599_pc24_system_res.this.aP3 = aP3;
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
                                           AV9P_SYS_ID ,
                                           A58TBM01_SYS_ID ,
                                           A351TBM01_DEL_FLG },
                                           new int[] {
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      Gx_ope = "Fetch" ;
      Gx_etb = "TBM01_SYSTEM" ;
      /* Using cursor P004B2 */
      pr_default.execute(0, new Object[] {AV9P_SYS_ID});
      if ( Gx_err != 0 )
      {
         AV20GXLvl31 = (byte)(1) ;
      }
      while ( (pr_default.getStatus(0) != 101) )
      {
         A351TBM01_DEL_FLG = P004B2_A351TBM01_DEL_FLG[0] ;
         n351TBM01_DEL_FLG = P004B2_n351TBM01_DEL_FLG[0] ;
         A58TBM01_SYS_ID = P004B2_A58TBM01_SYS_ID[0] ;
         A358TBM01_UPD_CNT = P004B2_A358TBM01_UPD_CNT[0] ;
         n358TBM01_UPD_CNT = P004B2_n358TBM01_UPD_CNT[0] ;
         A357TBM01_UPD_PROG_NM = P004B2_A357TBM01_UPD_PROG_NM[0] ;
         n357TBM01_UPD_PROG_NM = P004B2_n357TBM01_UPD_PROG_NM[0] ;
         A356TBM01_UPD_USER_ID = P004B2_A356TBM01_UPD_USER_ID[0] ;
         n356TBM01_UPD_USER_ID = P004B2_n356TBM01_UPD_USER_ID[0] ;
         A355TBM01_UPD_DATETIME = P004B2_A355TBM01_UPD_DATETIME[0] ;
         n355TBM01_UPD_DATETIME = P004B2_n355TBM01_UPD_DATETIME[0] ;
         A354TBM01_CRT_PROG_NM = P004B2_A354TBM01_CRT_PROG_NM[0] ;
         n354TBM01_CRT_PROG_NM = P004B2_n354TBM01_CRT_PROG_NM[0] ;
         A353TBM01_CRT_USER_ID = P004B2_A353TBM01_CRT_USER_ID[0] ;
         n353TBM01_CRT_USER_ID = P004B2_n353TBM01_CRT_USER_ID[0] ;
         A352TBM01_CRT_DATETIME = P004B2_A352TBM01_CRT_DATETIME[0] ;
         n352TBM01_CRT_DATETIME = P004B2_n352TBM01_CRT_DATETIME[0] ;
         A609TBM01_NOTE = P004B2_A609TBM01_NOTE[0] ;
         n609TBM01_NOTE = P004B2_n609TBM01_NOTE[0] ;
         A608TBM01_SYS_VALUE = P004B2_A608TBM01_SYS_VALUE[0] ;
         n608TBM01_SYS_VALUE = P004B2_n608TBM01_SYS_VALUE[0] ;
         AV20GXLvl31 = (byte)(1) ;
         GXt_char1 = AV13W_STR ;
         GXv_char2[0] = GXt_char1 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A58TBM01_SYS_ID, GXv_char2) ;
         b599_pc24_system_res.this.GXt_char1 = GXv_char2[0] ;
         GXt_char3 = AV13W_STR ;
         GXv_char4[0] = GXt_char3 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A608TBM01_SYS_VALUE, GXv_char4) ;
         b599_pc24_system_res.this.GXt_char3 = GXv_char4[0] ;
         GXt_char5 = AV13W_STR ;
         GXv_char6[0] = GXt_char5 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A609TBM01_NOTE, GXv_char6) ;
         b599_pc24_system_res.this.GXt_char5 = GXv_char6[0] ;
         GXt_char7 = AV13W_STR ;
         GXv_char8[0] = GXt_char7 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A352TBM01_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char8) ;
         b599_pc24_system_res.this.GXt_char7 = GXv_char8[0] ;
         GXt_char9 = AV13W_STR ;
         GXv_char10[0] = GXt_char9 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A353TBM01_CRT_USER_ID, GXv_char10) ;
         b599_pc24_system_res.this.GXt_char9 = GXv_char10[0] ;
         GXt_char11 = AV13W_STR ;
         GXv_char12[0] = GXt_char11 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A354TBM01_CRT_PROG_NM, GXv_char12) ;
         b599_pc24_system_res.this.GXt_char11 = GXv_char12[0] ;
         GXt_char13 = AV13W_STR ;
         GXv_char14[0] = GXt_char13 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A355TBM01_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char14) ;
         b599_pc24_system_res.this.GXt_char13 = GXv_char14[0] ;
         GXt_char15 = AV13W_STR ;
         GXv_char16[0] = GXt_char15 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A356TBM01_UPD_USER_ID, GXv_char16) ;
         b599_pc24_system_res.this.GXt_char15 = GXv_char16[0] ;
         GXt_char17 = AV13W_STR ;
         GXv_char18[0] = GXt_char17 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A357TBM01_UPD_PROG_NM, GXv_char18) ;
         b599_pc24_system_res.this.GXt_char17 = GXv_char18[0] ;
         AV13W_STR = GXt_char1 + "," + GXt_char3 + "," + GXt_char5 + "," + A351TBM01_DEL_FLG + "," + GXt_char7 + "," + GXt_char9 + "," + GXt_char11 + "," + GXt_char13 + "," + GXt_char15 + "," + GXt_char17 + "," + GXutil.trim( GXutil.str( A358TBM01_UPD_CNT, 10, 0)) ;
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
         b599_pc24_system_res.this.GXt_char17 = GXv_char18[0] ;
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
      AV16W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_SYS_ID" );
      AV16W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV9P_SYS_ID );
      AV15W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV16W_PARMS_ITEM, 0);
      AV17W_MSG = "SUB_INIT" ;
      GXv_SdtB808_SD01_EXTRA_INFO19[0] = AV15W_EXTRA_INFO;
      GXv_int20[0] = AV10W_RTN_CD ;
      GXv_char18[0] = AV12W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV21Pgmname, (short)(1), AV17W_MSG, GXv_SdtB808_SD01_EXTRA_INFO19, GXv_int20, GXv_char18) ;
      AV15W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO19[0] ;
      b599_pc24_system_res.this.AV10W_RTN_CD = GXv_int20[0] ;
      b599_pc24_system_res.this.AV12W_RTN_MSG = GXv_char18[0] ;
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
      b599_pc24_system_res.this.AV10W_RTN_CD = GXv_int20[0] ;
      b599_pc24_system_res.this.AV12W_RTN_MSG = GXv_char18[0] ;
      context.globals.Gx_eop = (byte)(0) ;
   }

   protected void cleanup( )
   {
      this.aP1[0] = b599_pc24_system_res.this.AV11W_RTN_CSV;
      this.aP2[0] = b599_pc24_system_res.this.AV10W_RTN_CD;
      this.aP3[0] = b599_pc24_system_res.this.AV12W_RTN_MSG;
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
      A58TBM01_SYS_ID = "" ;
      A351TBM01_DEL_FLG = "" ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      P004B2_A351TBM01_DEL_FLG = new String[] {""} ;
      P004B2_n351TBM01_DEL_FLG = new boolean[] {false} ;
      P004B2_A58TBM01_SYS_ID = new String[] {""} ;
      P004B2_A358TBM01_UPD_CNT = new long[1] ;
      P004B2_n358TBM01_UPD_CNT = new boolean[] {false} ;
      P004B2_A357TBM01_UPD_PROG_NM = new String[] {""} ;
      P004B2_n357TBM01_UPD_PROG_NM = new boolean[] {false} ;
      P004B2_A356TBM01_UPD_USER_ID = new String[] {""} ;
      P004B2_n356TBM01_UPD_USER_ID = new boolean[] {false} ;
      P004B2_A355TBM01_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P004B2_n355TBM01_UPD_DATETIME = new boolean[] {false} ;
      P004B2_A354TBM01_CRT_PROG_NM = new String[] {""} ;
      P004B2_n354TBM01_CRT_PROG_NM = new boolean[] {false} ;
      P004B2_A353TBM01_CRT_USER_ID = new String[] {""} ;
      P004B2_n353TBM01_CRT_USER_ID = new boolean[] {false} ;
      P004B2_A352TBM01_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P004B2_n352TBM01_CRT_DATETIME = new boolean[] {false} ;
      P004B2_A609TBM01_NOTE = new String[] {""} ;
      P004B2_n609TBM01_NOTE = new boolean[] {false} ;
      P004B2_A608TBM01_SYS_VALUE = new String[] {""} ;
      P004B2_n608TBM01_SYS_VALUE = new boolean[] {false} ;
      A357TBM01_UPD_PROG_NM = "" ;
      A356TBM01_UPD_USER_ID = "" ;
      A355TBM01_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A354TBM01_CRT_PROG_NM = "" ;
      A353TBM01_CRT_USER_ID = "" ;
      A352TBM01_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A609TBM01_NOTE = "" ;
      A608TBM01_SYS_VALUE = "" ;
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
      pr_default = new DataStoreProvider(context, remoteHandle, new b599_pc24_system_res__default(),
         new Object[] {
             new Object[] {
            P004B2_A351TBM01_DEL_FLG, P004B2_n351TBM01_DEL_FLG, P004B2_A58TBM01_SYS_ID, P004B2_A358TBM01_UPD_CNT, P004B2_n358TBM01_UPD_CNT, P004B2_A357TBM01_UPD_PROG_NM, P004B2_n357TBM01_UPD_PROG_NM, P004B2_A356TBM01_UPD_USER_ID, P004B2_n356TBM01_UPD_USER_ID, P004B2_A355TBM01_UPD_DATETIME,
            P004B2_n355TBM01_UPD_DATETIME, P004B2_A354TBM01_CRT_PROG_NM, P004B2_n354TBM01_CRT_PROG_NM, P004B2_A353TBM01_CRT_USER_ID, P004B2_n353TBM01_CRT_USER_ID, P004B2_A352TBM01_CRT_DATETIME, P004B2_n352TBM01_CRT_DATETIME, P004B2_A609TBM01_NOTE, P004B2_n609TBM01_NOTE, P004B2_A608TBM01_SYS_VALUE,
            P004B2_n608TBM01_SYS_VALUE
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV21Pgmname = "B599_PC24_SYSTEM_RES" ;
      /* GeneXus formulas. */
      AV21Pgmname = "B599_PC24_SYSTEM_RES" ;
      Gx_err = (short)(0) ;
   }

   private byte AV20GXLvl31 ;
   private short AV10W_RTN_CD ;
   private short Gx_err ;
   private short GXv_int20[] ;
   private int GXActiveErrHndl ;
   private long A358TBM01_UPD_CNT ;
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
   private java.util.Date A355TBM01_UPD_DATETIME ;
   private java.util.Date A352TBM01_CRT_DATETIME ;
   private boolean returnInSub ;
   private boolean n351TBM01_DEL_FLG ;
   private boolean n358TBM01_UPD_CNT ;
   private boolean n357TBM01_UPD_PROG_NM ;
   private boolean n356TBM01_UPD_USER_ID ;
   private boolean n355TBM01_UPD_DATETIME ;
   private boolean n354TBM01_CRT_PROG_NM ;
   private boolean n353TBM01_CRT_USER_ID ;
   private boolean n352TBM01_CRT_DATETIME ;
   private boolean n609TBM01_NOTE ;
   private boolean n608TBM01_SYS_VALUE ;
   private String AV9P_SYS_ID ;
   private String AV12W_RTN_MSG ;
   private String AV14C_APP_ID ;
   private String A58TBM01_SYS_ID ;
   private String A351TBM01_DEL_FLG ;
   private String A357TBM01_UPD_PROG_NM ;
   private String A356TBM01_UPD_USER_ID ;
   private String A354TBM01_CRT_PROG_NM ;
   private String A353TBM01_CRT_USER_ID ;
   private String A609TBM01_NOTE ;
   private String A608TBM01_SYS_VALUE ;
   private String AV13W_STR ;
   private String AV17W_MSG ;
   private GxObjectCollection[] aP1 ;
   private short[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P004B2_A351TBM01_DEL_FLG ;
   private boolean[] P004B2_n351TBM01_DEL_FLG ;
   private String[] P004B2_A58TBM01_SYS_ID ;
   private long[] P004B2_A358TBM01_UPD_CNT ;
   private boolean[] P004B2_n358TBM01_UPD_CNT ;
   private String[] P004B2_A357TBM01_UPD_PROG_NM ;
   private boolean[] P004B2_n357TBM01_UPD_PROG_NM ;
   private String[] P004B2_A356TBM01_UPD_USER_ID ;
   private boolean[] P004B2_n356TBM01_UPD_USER_ID ;
   private java.util.Date[] P004B2_A355TBM01_UPD_DATETIME ;
   private boolean[] P004B2_n355TBM01_UPD_DATETIME ;
   private String[] P004B2_A354TBM01_CRT_PROG_NM ;
   private boolean[] P004B2_n354TBM01_CRT_PROG_NM ;
   private String[] P004B2_A353TBM01_CRT_USER_ID ;
   private boolean[] P004B2_n353TBM01_CRT_USER_ID ;
   private java.util.Date[] P004B2_A352TBM01_CRT_DATETIME ;
   private boolean[] P004B2_n352TBM01_CRT_DATETIME ;
   private String[] P004B2_A609TBM01_NOTE ;
   private boolean[] P004B2_n609TBM01_NOTE ;
   private String[] P004B2_A608TBM01_SYS_VALUE ;
   private boolean[] P004B2_n608TBM01_SYS_VALUE ;
   private GxObjectCollection AV11W_RTN_CSV ;
   private SdtB808_SD01_EXTRA_INFO AV15W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO19[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV16W_PARMS_ITEM ;
}

final  class b599_pc24_system_res__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P004B2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV9P_SYS_ID ,
                                          String A58TBM01_SYS_ID ,
                                          String A351TBM01_DEL_FLG )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int21 ;
      GXv_int21 = new byte [1] ;
      Object[] GXv_Object22 ;
      GXv_Object22 = new Object [2] ;
      Gx_ope = "Declare" ;
      Gx_etb = "TBM01_SYSTEM" ;
      scmdbuf = "SELECT `TBM01_DEL_FLG`, `TBM01_SYS_ID`, `TBM01_UPD_CNT`, `TBM01_UPD_PROG_NM`, `TBM01_UPD_USER_ID`," ;
      scmdbuf = scmdbuf + " `TBM01_UPD_DATETIME`, `TBM01_CRT_PROG_NM`, `TBM01_CRT_USER_ID`, `TBM01_CRT_DATETIME`," ;
      scmdbuf = scmdbuf + " `TBM01_NOTE`, `TBM01_SYS_VALUE` FROM `TBM01_SYSTEM`" ;
      scmdbuf = scmdbuf + " WHERE (`TBM01_DEL_FLG` = '0')" ;
      if ( ! (GXutil.strcmp("", AV9P_SYS_ID)==0) )
      {
         sWhereString = sWhereString + " and (`TBM01_SYS_ID` = ?)" ;
      }
      else
      {
         GXv_int21[0] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TBM01_SYS_ID`" ;
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
                  return conditional_P004B2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P004B2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
                  stmt.setVarchar(sIdx, (String)parms[1], 20);
               }
               return;
      }
   }

}

