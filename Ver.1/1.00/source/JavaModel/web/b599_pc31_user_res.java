/*
               File: B599_PC31_USER_RES
        Description: ユーザーマスタ取得
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:45.54
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b599_pc31_user_res extends GXProcedure
{
   public b599_pc31_user_res( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b599_pc31_user_res.class ), "" );
   }

   public b599_pc31_user_res( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 ,
                             GxObjectCollection[] aP1 ,
                             short[] aP2 )
   {
      b599_pc31_user_res.this.AV16P_USER_ID = aP0;
      b599_pc31_user_res.this.AV13W_RTN_CSV = aP1[0];
      b599_pc31_user_res.this.aP3 = new String[] {""};
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
      b599_pc31_user_res.this.AV16P_USER_ID = aP0;
      b599_pc31_user_res.this.AV13W_RTN_CSV = aP1[0];
      this.aP1 = aP1;
      b599_pc31_user_res.this.aP2 = aP2;
      b599_pc31_user_res.this.aP3 = aP3;
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
      /* Execute user subroutine: S1162 */
      S1162 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV19GXLvl31 = (byte)(0) ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV16P_USER_ID ,
                                           A8TAM07_USER_ID ,
                                           A16TAM07_DEL_FLG },
                                           new int[] {
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      Gx_ope = "Fetch" ;
      Gx_etb = "TAM07_USER" ;
      /* Using cursor P00502 */
      pr_default.execute(0, new Object[] {AV16P_USER_ID});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A16TAM07_DEL_FLG = P00502_A16TAM07_DEL_FLG[0] ;
         n16TAM07_DEL_FLG = P00502_n16TAM07_DEL_FLG[0] ;
         A8TAM07_USER_ID = P00502_A8TAM07_USER_ID[0] ;
         A112TAM07_UPD_CNT = P00502_A112TAM07_UPD_CNT[0] ;
         n112TAM07_UPD_CNT = P00502_n112TAM07_UPD_CNT[0] ;
         A38TAM07_UPD_PROG_NM = P00502_A38TAM07_UPD_PROG_NM[0] ;
         n38TAM07_UPD_PROG_NM = P00502_n38TAM07_UPD_PROG_NM[0] ;
         A77TAM07_UPD_USER_ID = P00502_A77TAM07_UPD_USER_ID[0] ;
         n77TAM07_UPD_USER_ID = P00502_n77TAM07_UPD_USER_ID[0] ;
         A37TAM07_UPD_DATETIME = P00502_A37TAM07_UPD_DATETIME[0] ;
         n37TAM07_UPD_DATETIME = P00502_n37TAM07_UPD_DATETIME[0] ;
         A36TAM07_CRT_PROG_NM = P00502_A36TAM07_CRT_PROG_NM[0] ;
         n36TAM07_CRT_PROG_NM = P00502_n36TAM07_CRT_PROG_NM[0] ;
         A76TAM07_CRT_USER_ID = P00502_A76TAM07_CRT_USER_ID[0] ;
         n76TAM07_CRT_USER_ID = P00502_n76TAM07_CRT_USER_ID[0] ;
         A35TAM07_CRT_DATETIME = P00502_A35TAM07_CRT_DATETIME[0] ;
         n35TAM07_CRT_DATETIME = P00502_n35TAM07_CRT_DATETIME[0] ;
         A593TAM07_EMAIL = P00502_A593TAM07_EMAIL[0] ;
         n593TAM07_EMAIL = P00502_n593TAM07_EMAIL[0] ;
         A147TAM07_SITE_ID = P00502_A147TAM07_SITE_ID[0] ;
         n147TAM07_SITE_ID = P00502_n147TAM07_SITE_ID[0] ;
         A14TAM07_AUTH_CD = P00502_A14TAM07_AUTH_CD[0] ;
         n14TAM07_AUTH_CD = P00502_n14TAM07_AUTH_CD[0] ;
         A126TAM07_USER_KANA_NM = P00502_A126TAM07_USER_KANA_NM[0] ;
         n126TAM07_USER_KANA_NM = P00502_n126TAM07_USER_KANA_NM[0] ;
         A2TAM07_USER_NM = P00502_A2TAM07_USER_NM[0] ;
         n2TAM07_USER_NM = P00502_n2TAM07_USER_NM[0] ;
         AV19GXLvl31 = (byte)(1) ;
         GXt_char1 = AV15W_STR ;
         GXv_char2[0] = GXt_char1 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A8TAM07_USER_ID, GXv_char2) ;
         b599_pc31_user_res.this.GXt_char1 = GXv_char2[0] ;
         GXt_char3 = AV15W_STR ;
         GXv_char4[0] = GXt_char3 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A2TAM07_USER_NM, GXv_char4) ;
         b599_pc31_user_res.this.GXt_char3 = GXv_char4[0] ;
         GXt_char5 = AV15W_STR ;
         GXv_char6[0] = GXt_char5 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A126TAM07_USER_KANA_NM, GXv_char6) ;
         b599_pc31_user_res.this.GXt_char5 = GXv_char6[0] ;
         GXt_char7 = AV15W_STR ;
         GXv_char8[0] = GXt_char7 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A14TAM07_AUTH_CD, GXv_char8) ;
         b599_pc31_user_res.this.GXt_char7 = GXv_char8[0] ;
         GXt_char9 = AV15W_STR ;
         GXv_char10[0] = GXt_char9 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A147TAM07_SITE_ID, GXv_char10) ;
         b599_pc31_user_res.this.GXt_char9 = GXv_char10[0] ;
         GXt_char11 = AV15W_STR ;
         GXv_char12[0] = GXt_char11 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A593TAM07_EMAIL, GXv_char12) ;
         b599_pc31_user_res.this.GXt_char11 = GXv_char12[0] ;
         GXt_char13 = AV15W_STR ;
         GXv_char14[0] = GXt_char13 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A35TAM07_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char14) ;
         b599_pc31_user_res.this.GXt_char13 = GXv_char14[0] ;
         GXt_char15 = AV15W_STR ;
         GXv_char16[0] = GXt_char15 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A76TAM07_CRT_USER_ID, GXv_char16) ;
         b599_pc31_user_res.this.GXt_char15 = GXv_char16[0] ;
         GXt_char17 = AV15W_STR ;
         GXv_char18[0] = GXt_char17 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A36TAM07_CRT_PROG_NM, GXv_char18) ;
         b599_pc31_user_res.this.GXt_char17 = GXv_char18[0] ;
         GXt_char19 = AV15W_STR ;
         GXv_char20[0] = GXt_char19 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A37TAM07_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char20) ;
         b599_pc31_user_res.this.GXt_char19 = GXv_char20[0] ;
         GXt_char21 = AV15W_STR ;
         GXv_char22[0] = GXt_char21 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A77TAM07_UPD_USER_ID, GXv_char22) ;
         b599_pc31_user_res.this.GXt_char21 = GXv_char22[0] ;
         GXt_char23 = AV15W_STR ;
         GXv_char24[0] = GXt_char23 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A38TAM07_UPD_PROG_NM, GXv_char24) ;
         b599_pc31_user_res.this.GXt_char23 = GXv_char24[0] ;
         AV15W_STR = GXt_char1 + "," + GXt_char3 + "," + GXt_char5 + "," + GXt_char7 + "," + GXt_char9 + "," + GXt_char11 + "," + A16TAM07_DEL_FLG + "," + GXt_char13 + "," + GXt_char15 + "," + GXt_char17 + "," + GXt_char19 + "," + GXt_char21 + "," + GXt_char23 + "," + GXutil.trim( GXutil.str( A112TAM07_UPD_CNT, 10, 0)) ;
         AV13W_RTN_CSV.add(AV15W_STR, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV19GXLvl31 == 0 )
      {
         AV12W_RTN_CD = (short)(1) ;
         GXt_char23 = AV14W_RTN_MSG ;
         GXv_char24[0] = GXt_char23 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char24) ;
         b599_pc31_user_res.this.GXt_char23 = GXv_char24[0] ;
         AV14W_RTN_MSG = GXt_char23 ;
      }
      cleanup();
   }

   public void S1162( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      AV9W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      AV11W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV11W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_USER_ID" );
      AV11W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV16P_USER_ID );
      AV9W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV11W_PARMS_ITEM, 0);
      AV10W_MSG = "SUB_INIT" ;
      GXv_SdtB808_SD01_EXTRA_INFO25[0] = AV9W_EXTRA_INFO;
      GXv_int26[0] = AV12W_RTN_CD ;
      GXv_char24[0] = AV14W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV20Pgmname, (short)(1), AV10W_MSG, GXv_SdtB808_SD01_EXTRA_INFO25, GXv_int26, GXv_char24) ;
      AV9W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO25[0] ;
      b599_pc31_user_res.this.AV12W_RTN_CD = GXv_int26[0] ;
      b599_pc31_user_res.this.AV14W_RTN_MSG = GXv_char24[0] ;
   }

   public void S1282( )
   {
      /* 'SUB_ERROR' Routine */
      AV10W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO25[0] = AV9W_EXTRA_INFO;
      GXv_int26[0] = AV12W_RTN_CD ;
      GXv_char24[0] = AV14W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV20Pgmname, (short)(0), AV10W_MSG, GXv_SdtB808_SD01_EXTRA_INFO25, GXv_int26, GXv_char24) ;
      AV9W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO25[0] ;
      b599_pc31_user_res.this.AV12W_RTN_CD = GXv_int26[0] ;
      b599_pc31_user_res.this.AV14W_RTN_MSG = GXv_char24[0] ;
      context.globals.Gx_eop = (byte)(0) ;
   }

   protected void cleanup( )
   {
      this.aP1[0] = b599_pc31_user_res.this.AV13W_RTN_CSV;
      this.aP2[0] = b599_pc31_user_res.this.AV12W_RTN_CD;
      this.aP3[0] = b599_pc31_user_res.this.AV14W_RTN_MSG;
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
                  /* Execute user subroutine: S1282 */
                  S1282 ();
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
      A8TAM07_USER_ID = "" ;
      A16TAM07_DEL_FLG = "" ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      P00502_A16TAM07_DEL_FLG = new String[] {""} ;
      P00502_n16TAM07_DEL_FLG = new boolean[] {false} ;
      P00502_A8TAM07_USER_ID = new String[] {""} ;
      P00502_A112TAM07_UPD_CNT = new long[1] ;
      P00502_n112TAM07_UPD_CNT = new boolean[] {false} ;
      P00502_A38TAM07_UPD_PROG_NM = new String[] {""} ;
      P00502_n38TAM07_UPD_PROG_NM = new boolean[] {false} ;
      P00502_A77TAM07_UPD_USER_ID = new String[] {""} ;
      P00502_n77TAM07_UPD_USER_ID = new boolean[] {false} ;
      P00502_A37TAM07_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P00502_n37TAM07_UPD_DATETIME = new boolean[] {false} ;
      P00502_A36TAM07_CRT_PROG_NM = new String[] {""} ;
      P00502_n36TAM07_CRT_PROG_NM = new boolean[] {false} ;
      P00502_A76TAM07_CRT_USER_ID = new String[] {""} ;
      P00502_n76TAM07_CRT_USER_ID = new boolean[] {false} ;
      P00502_A35TAM07_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P00502_n35TAM07_CRT_DATETIME = new boolean[] {false} ;
      P00502_A593TAM07_EMAIL = new String[] {""} ;
      P00502_n593TAM07_EMAIL = new boolean[] {false} ;
      P00502_A147TAM07_SITE_ID = new String[] {""} ;
      P00502_n147TAM07_SITE_ID = new boolean[] {false} ;
      P00502_A14TAM07_AUTH_CD = new String[] {""} ;
      P00502_n14TAM07_AUTH_CD = new boolean[] {false} ;
      P00502_A126TAM07_USER_KANA_NM = new String[] {""} ;
      P00502_n126TAM07_USER_KANA_NM = new boolean[] {false} ;
      P00502_A2TAM07_USER_NM = new String[] {""} ;
      P00502_n2TAM07_USER_NM = new boolean[] {false} ;
      A38TAM07_UPD_PROG_NM = "" ;
      A77TAM07_UPD_USER_ID = "" ;
      A37TAM07_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A36TAM07_CRT_PROG_NM = "" ;
      A76TAM07_CRT_USER_ID = "" ;
      A35TAM07_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A593TAM07_EMAIL = "" ;
      A147TAM07_SITE_ID = "" ;
      A14TAM07_AUTH_CD = "" ;
      A126TAM07_USER_KANA_NM = "" ;
      A2TAM07_USER_NM = "" ;
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
      GXv_char20 = new String [1] ;
      GXt_char21 = "" ;
      GXv_char22 = new String [1] ;
      GXt_char23 = "" ;
      AV11W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV10W_MSG = "" ;
      AV20Pgmname = "" ;
      GXv_SdtB808_SD01_EXTRA_INFO25 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int26 = new short [1] ;
      GXv_char24 = new String [1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b599_pc31_user_res__default(),
         new Object[] {
             new Object[] {
            P00502_A16TAM07_DEL_FLG, P00502_n16TAM07_DEL_FLG, P00502_A8TAM07_USER_ID, P00502_A112TAM07_UPD_CNT, P00502_n112TAM07_UPD_CNT, P00502_A38TAM07_UPD_PROG_NM, P00502_n38TAM07_UPD_PROG_NM, P00502_A77TAM07_UPD_USER_ID, P00502_n77TAM07_UPD_USER_ID, P00502_A37TAM07_UPD_DATETIME,
            P00502_n37TAM07_UPD_DATETIME, P00502_A36TAM07_CRT_PROG_NM, P00502_n36TAM07_CRT_PROG_NM, P00502_A76TAM07_CRT_USER_ID, P00502_n76TAM07_CRT_USER_ID, P00502_A35TAM07_CRT_DATETIME, P00502_n35TAM07_CRT_DATETIME, P00502_A593TAM07_EMAIL, P00502_n593TAM07_EMAIL, P00502_A147TAM07_SITE_ID,
            P00502_n147TAM07_SITE_ID, P00502_A14TAM07_AUTH_CD, P00502_n14TAM07_AUTH_CD, P00502_A126TAM07_USER_KANA_NM, P00502_n126TAM07_USER_KANA_NM, P00502_A2TAM07_USER_NM, P00502_n2TAM07_USER_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV20Pgmname = "B599_PC31_USER_RES" ;
      /* GeneXus formulas. */
      AV20Pgmname = "B599_PC31_USER_RES" ;
      Gx_err = (short)(0) ;
   }

   private byte AV19GXLvl31 ;
   private short AV12W_RTN_CD ;
   private short GXv_int26[] ;
   private short Gx_err ;
   private int GXActiveErrHndl ;
   private long A112TAM07_UPD_CNT ;
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
   private String GXv_char20[] ;
   private String GXt_char21 ;
   private String GXv_char22[] ;
   private String GXt_char23 ;
   private String AV20Pgmname ;
   private String GXv_char24[] ;
   private String Gx_emsg ;
   private java.util.Date A37TAM07_UPD_DATETIME ;
   private java.util.Date A35TAM07_CRT_DATETIME ;
   private boolean returnInSub ;
   private boolean n16TAM07_DEL_FLG ;
   private boolean n112TAM07_UPD_CNT ;
   private boolean n38TAM07_UPD_PROG_NM ;
   private boolean n77TAM07_UPD_USER_ID ;
   private boolean n37TAM07_UPD_DATETIME ;
   private boolean n36TAM07_CRT_PROG_NM ;
   private boolean n76TAM07_CRT_USER_ID ;
   private boolean n35TAM07_CRT_DATETIME ;
   private boolean n593TAM07_EMAIL ;
   private boolean n147TAM07_SITE_ID ;
   private boolean n14TAM07_AUTH_CD ;
   private boolean n126TAM07_USER_KANA_NM ;
   private boolean n2TAM07_USER_NM ;
   private String AV16P_USER_ID ;
   private String AV14W_RTN_MSG ;
   private String AV8C_APP_ID ;
   private String A8TAM07_USER_ID ;
   private String A16TAM07_DEL_FLG ;
   private String A38TAM07_UPD_PROG_NM ;
   private String A77TAM07_UPD_USER_ID ;
   private String A36TAM07_CRT_PROG_NM ;
   private String A76TAM07_CRT_USER_ID ;
   private String A593TAM07_EMAIL ;
   private String A147TAM07_SITE_ID ;
   private String A14TAM07_AUTH_CD ;
   private String A126TAM07_USER_KANA_NM ;
   private String A2TAM07_USER_NM ;
   private String AV15W_STR ;
   private String AV10W_MSG ;
   private GxObjectCollection[] aP1 ;
   private short[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P00502_A16TAM07_DEL_FLG ;
   private boolean[] P00502_n16TAM07_DEL_FLG ;
   private String[] P00502_A8TAM07_USER_ID ;
   private long[] P00502_A112TAM07_UPD_CNT ;
   private boolean[] P00502_n112TAM07_UPD_CNT ;
   private String[] P00502_A38TAM07_UPD_PROG_NM ;
   private boolean[] P00502_n38TAM07_UPD_PROG_NM ;
   private String[] P00502_A77TAM07_UPD_USER_ID ;
   private boolean[] P00502_n77TAM07_UPD_USER_ID ;
   private java.util.Date[] P00502_A37TAM07_UPD_DATETIME ;
   private boolean[] P00502_n37TAM07_UPD_DATETIME ;
   private String[] P00502_A36TAM07_CRT_PROG_NM ;
   private boolean[] P00502_n36TAM07_CRT_PROG_NM ;
   private String[] P00502_A76TAM07_CRT_USER_ID ;
   private boolean[] P00502_n76TAM07_CRT_USER_ID ;
   private java.util.Date[] P00502_A35TAM07_CRT_DATETIME ;
   private boolean[] P00502_n35TAM07_CRT_DATETIME ;
   private String[] P00502_A593TAM07_EMAIL ;
   private boolean[] P00502_n593TAM07_EMAIL ;
   private String[] P00502_A147TAM07_SITE_ID ;
   private boolean[] P00502_n147TAM07_SITE_ID ;
   private String[] P00502_A14TAM07_AUTH_CD ;
   private boolean[] P00502_n14TAM07_AUTH_CD ;
   private String[] P00502_A126TAM07_USER_KANA_NM ;
   private boolean[] P00502_n126TAM07_USER_KANA_NM ;
   private String[] P00502_A2TAM07_USER_NM ;
   private boolean[] P00502_n2TAM07_USER_NM ;
   private GxObjectCollection AV13W_RTN_CSV ;
   private SdtB808_SD01_EXTRA_INFO AV9W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO25[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV11W_PARMS_ITEM ;
}

final  class b599_pc31_user_res__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P00502( com.genexus.internet.HttpContext httpContext ,
                                          String AV16P_USER_ID ,
                                          String A8TAM07_USER_ID ,
                                          String A16TAM07_DEL_FLG )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int27 ;
      GXv_int27 = new byte [1] ;
      Object[] GXv_Object28 ;
      GXv_Object28 = new Object [2] ;
      Gx_ope = "Declare" ;
      Gx_etb = "TAM07_USER" ;
      scmdbuf = "SELECT `TAM07_DEL_FLG`, `TAM07_USER_ID`, `TAM07_UPD_CNT`, `TAM07_UPD_PROG_NM`, `TAM07_UPD_USER_ID`," ;
      scmdbuf = scmdbuf + " `TAM07_UPD_DATETIME`, `TAM07_CRT_PROG_NM`, `TAM07_CRT_USER_ID`, `TAM07_CRT_DATETIME`," ;
      scmdbuf = scmdbuf + " `TAM07_EMAIL`, `TAM07_SITE_ID`, `TAM07_AUTH_CD`, `TAM07_USER_KANA_NM`, `TAM07_USER_NM`" ;
      scmdbuf = scmdbuf + " FROM `TAM07_USER`" ;
      scmdbuf = scmdbuf + " WHERE (`TAM07_DEL_FLG` = '0')" ;
      if ( ! (GXutil.strcmp("", AV16P_USER_ID)==0) )
      {
         sWhereString = sWhereString + " and (`TAM07_USER_ID` = ?)" ;
      }
      else
      {
         GXv_int27[0] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TAM07_USER_ID`" ;
      GXv_Object28[0] = scmdbuf ;
      GXv_Object28[1] = GXv_int27 ;
      return GXv_Object28 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         com.genexus.internet.HttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_P00502(httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] );
      }
      return super.getDynamicStatement(cursor, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00502", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
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
               ((String[]) buf[23])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
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
                  stmt.setVarchar(sIdx, (String)parms[1], 128);
               }
               break;
      }
   }

}

