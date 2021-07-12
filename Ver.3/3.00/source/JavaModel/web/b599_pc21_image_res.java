/*
               File: B599_PC21_IMAGE_RES
        Description: ‰æ‘œƒ}ƒXƒ^Žæ“¾
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:16:45.54
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b599_pc21_image_res extends GXProcedure
{
   public b599_pc21_image_res( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b599_pc21_image_res.class ), "" );
   }

   public b599_pc21_image_res( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 ,
                             String aP1 ,
                             GxObjectCollection[] aP2 ,
                             short[] aP3 )
   {
      b599_pc21_image_res.this.AV9P_IMAGE_CD = aP0;
      b599_pc21_image_res.this.AV10P_STUDY_ID = aP1;
      b599_pc21_image_res.this.AV13W_RTN_CSV = aP2[0];
      this.aP2 = aP2;
      b599_pc21_image_res.this.aP3 = aP3;
      b599_pc21_image_res.this.aP4 = aP4;
      b599_pc21_image_res.this.aP4 = new String[] {""};
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
      b599_pc21_image_res.this.AV9P_IMAGE_CD = aP0;
      b599_pc21_image_res.this.AV10P_STUDY_ID = aP1;
      b599_pc21_image_res.this.AV13W_RTN_CSV = aP2[0];
      this.aP2 = aP2;
      b599_pc21_image_res.this.aP3 = aP3;
      b599_pc21_image_res.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV17C_APP_ID = "B599" ;
      AV12W_RTN_CD = (short)(0) ;
      AV14W_RTN_MSG = "" ;
      AV18W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV18W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV17C_APP_ID );
      /* Execute user subroutine: S111 */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV16W_STUDY_ID = GXutil.lval( AV10P_STUDY_ID) ;
      AV23GXLvl33 = (byte)(0) ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV9P_IMAGE_CD ,
                                           AV10P_STUDY_ID ,
                                           A62TBM11_IMAGE_CD ,
                                           new Long(A606TBM11_STUDY_ID) ,
                                           new Long(AV16W_STUDY_ID) ,
                                           A535TBM11_DEL_FLG },
                                           new int[] {
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      Gx_ope = "Fetch" ;
      Gx_etb = "TBM11_IMAGE" ;
      /* Using cursor P003Q2 */
      pr_default.execute(0, new Object[] {AV9P_IMAGE_CD, new Long(AV16W_STUDY_ID)});
      if ( Gx_err != 0 )
      {
         AV23GXLvl33 = (byte)(1) ;
      }
      while ( (pr_default.getStatus(0) != 101) )
      {
         A535TBM11_DEL_FLG = P003Q2_A535TBM11_DEL_FLG[0] ;
         n535TBM11_DEL_FLG = P003Q2_n535TBM11_DEL_FLG[0] ;
         A606TBM11_STUDY_ID = P003Q2_A606TBM11_STUDY_ID[0] ;
         n606TBM11_STUDY_ID = P003Q2_n606TBM11_STUDY_ID[0] ;
         A62TBM11_IMAGE_CD = P003Q2_A62TBM11_IMAGE_CD[0] ;
         A533TBM11_IMAGE = P003Q2_A533TBM11_IMAGE[0] ;
         n533TBM11_IMAGE = P003Q2_n533TBM11_IMAGE[0] ;
         A542TBM11_UPD_CNT = P003Q2_A542TBM11_UPD_CNT[0] ;
         n542TBM11_UPD_CNT = P003Q2_n542TBM11_UPD_CNT[0] ;
         A541TBM11_UPD_PROG_NM = P003Q2_A541TBM11_UPD_PROG_NM[0] ;
         n541TBM11_UPD_PROG_NM = P003Q2_n541TBM11_UPD_PROG_NM[0] ;
         A540TBM11_UPD_USER_ID = P003Q2_A540TBM11_UPD_USER_ID[0] ;
         n540TBM11_UPD_USER_ID = P003Q2_n540TBM11_UPD_USER_ID[0] ;
         A539TBM11_UPD_DATETIME = P003Q2_A539TBM11_UPD_DATETIME[0] ;
         n539TBM11_UPD_DATETIME = P003Q2_n539TBM11_UPD_DATETIME[0] ;
         A538TBM11_CRT_PROG_NM = P003Q2_A538TBM11_CRT_PROG_NM[0] ;
         n538TBM11_CRT_PROG_NM = P003Q2_n538TBM11_CRT_PROG_NM[0] ;
         A537TBM11_CRT_USER_ID = P003Q2_A537TBM11_CRT_USER_ID[0] ;
         n537TBM11_CRT_USER_ID = P003Q2_n537TBM11_CRT_USER_ID[0] ;
         A536TBM11_CRT_DATETIME = P003Q2_A536TBM11_CRT_DATETIME[0] ;
         n536TBM11_CRT_DATETIME = P003Q2_n536TBM11_CRT_DATETIME[0] ;
         A534TBM11_FILE_NAME = P003Q2_A534TBM11_FILE_NAME[0] ;
         n534TBM11_FILE_NAME = P003Q2_n534TBM11_FILE_NAME[0] ;
         A634TBM11_IMAGE_NM = P003Q2_A634TBM11_IMAGE_NM[0] ;
         n634TBM11_IMAGE_NM = P003Q2_n634TBM11_IMAGE_NM[0] ;
         AV23GXLvl33 = (byte)(1) ;
         GXt_char1 = AV15W_STR ;
         GXv_char2[0] = GXt_char1 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A62TBM11_IMAGE_CD, GXv_char2) ;
         b599_pc21_image_res.this.GXt_char1 = GXv_char2[0] ;
         GXt_char3 = AV15W_STR ;
         GXv_char4[0] = GXt_char3 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A634TBM11_IMAGE_NM, GXv_char4) ;
         b599_pc21_image_res.this.GXt_char3 = GXv_char4[0] ;
         GXt_char5 = AV15W_STR ;
         GXv_char6[0] = GXt_char5 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A534TBM11_FILE_NAME, GXv_char6) ;
         b599_pc21_image_res.this.GXt_char5 = GXv_char6[0] ;
         GXt_char7 = AV15W_STR ;
         GXv_char8[0] = GXt_char7 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A536TBM11_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char8) ;
         b599_pc21_image_res.this.GXt_char7 = GXv_char8[0] ;
         GXt_char9 = AV15W_STR ;
         GXv_char10[0] = GXt_char9 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A537TBM11_CRT_USER_ID, GXv_char10) ;
         b599_pc21_image_res.this.GXt_char9 = GXv_char10[0] ;
         GXt_char11 = AV15W_STR ;
         GXv_char12[0] = GXt_char11 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A538TBM11_CRT_PROG_NM, GXv_char12) ;
         b599_pc21_image_res.this.GXt_char11 = GXv_char12[0] ;
         GXt_char13 = AV15W_STR ;
         GXv_char14[0] = GXt_char13 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A539TBM11_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char14) ;
         b599_pc21_image_res.this.GXt_char13 = GXv_char14[0] ;
         GXt_char15 = AV15W_STR ;
         GXv_char16[0] = GXt_char15 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A540TBM11_UPD_USER_ID, GXv_char16) ;
         b599_pc21_image_res.this.GXt_char15 = GXv_char16[0] ;
         GXt_char17 = AV15W_STR ;
         GXv_char18[0] = GXt_char17 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A541TBM11_UPD_PROG_NM, GXv_char18) ;
         b599_pc21_image_res.this.GXt_char17 = GXv_char18[0] ;
         AV15W_STR = GXt_char1 + "," + GXt_char3 + "," + GXutil.blobToBase64( A533TBM11_IMAGE) + "," + GXt_char5 + "," + GXutil.trim( GXutil.str( A606TBM11_STUDY_ID, 10, 0)) + "," + A535TBM11_DEL_FLG + "," + GXt_char7 + "," + GXt_char9 + "," + GXt_char11 + "," + GXt_char13 + "," + GXt_char15 + "," + GXt_char17 + "," + GXutil.trim( GXutil.str( A542TBM11_UPD_CNT, 10, 0)) ;
         AV13W_RTN_CSV.add(AV15W_STR, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV23GXLvl33 == 0 )
      {
         AV12W_RTN_CD = (short)(1) ;
         GXt_char17 = AV14W_RTN_MSG ;
         GXv_char18[0] = GXt_char17 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char18) ;
         b599_pc21_image_res.this.GXt_char17 = GXv_char18[0] ;
         AV14W_RTN_MSG = GXt_char17 ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      AV18W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      AV19W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV19W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_IMAGE_CD" );
      AV19W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV9P_IMAGE_CD );
      AV18W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV19W_PARMS_ITEM, 0);
      AV19W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV19W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_STUDY_ID" );
      AV19W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV10P_STUDY_ID );
      AV18W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV19W_PARMS_ITEM, 0);
      AV20W_MSG = "SUB_INIT" ;
      GXv_SdtB808_SD01_EXTRA_INFO19[0] = AV18W_EXTRA_INFO;
      GXv_int20[0] = AV12W_RTN_CD ;
      GXv_char18[0] = AV14W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV24Pgmname, (short)(1), AV20W_MSG, GXv_SdtB808_SD01_EXTRA_INFO19, GXv_int20, GXv_char18) ;
      AV18W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO19[0] ;
      b599_pc21_image_res.this.AV12W_RTN_CD = GXv_int20[0] ;
      b599_pc21_image_res.this.AV14W_RTN_MSG = GXv_char18[0] ;
   }

   public void S121( )
   {
      /* 'SUB_ERROR' Routine */
      AV20W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO19[0] = AV18W_EXTRA_INFO;
      GXv_int20[0] = AV12W_RTN_CD ;
      GXv_char18[0] = AV14W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV24Pgmname, (short)(0), AV20W_MSG, GXv_SdtB808_SD01_EXTRA_INFO19, GXv_int20, GXv_char18) ;
      AV18W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO19[0] ;
      b599_pc21_image_res.this.AV12W_RTN_CD = GXv_int20[0] ;
      b599_pc21_image_res.this.AV14W_RTN_MSG = GXv_char18[0] ;
      context.globals.Gx_eop = (byte)(0) ;
   }

   protected void cleanup( )
   {
      this.aP2[0] = b599_pc21_image_res.this.AV13W_RTN_CSV;
      this.aP3[0] = b599_pc21_image_res.this.AV12W_RTN_CD;
      this.aP4[0] = b599_pc21_image_res.this.AV14W_RTN_MSG;
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
      AV17C_APP_ID = "" ;
      AV18W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      scmdbuf = "" ;
      A62TBM11_IMAGE_CD = "" ;
      A535TBM11_DEL_FLG = "" ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      P003Q2_A535TBM11_DEL_FLG = new String[] {""} ;
      P003Q2_n535TBM11_DEL_FLG = new boolean[] {false} ;
      P003Q2_A606TBM11_STUDY_ID = new long[1] ;
      P003Q2_n606TBM11_STUDY_ID = new boolean[] {false} ;
      P003Q2_A62TBM11_IMAGE_CD = new String[] {""} ;
      P003Q2_A533TBM11_IMAGE = new String[] {""} ;
      P003Q2_n533TBM11_IMAGE = new boolean[] {false} ;
      P003Q2_A542TBM11_UPD_CNT = new long[1] ;
      P003Q2_n542TBM11_UPD_CNT = new boolean[] {false} ;
      P003Q2_A541TBM11_UPD_PROG_NM = new String[] {""} ;
      P003Q2_n541TBM11_UPD_PROG_NM = new boolean[] {false} ;
      P003Q2_A540TBM11_UPD_USER_ID = new String[] {""} ;
      P003Q2_n540TBM11_UPD_USER_ID = new boolean[] {false} ;
      P003Q2_A539TBM11_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P003Q2_n539TBM11_UPD_DATETIME = new boolean[] {false} ;
      P003Q2_A538TBM11_CRT_PROG_NM = new String[] {""} ;
      P003Q2_n538TBM11_CRT_PROG_NM = new boolean[] {false} ;
      P003Q2_A537TBM11_CRT_USER_ID = new String[] {""} ;
      P003Q2_n537TBM11_CRT_USER_ID = new boolean[] {false} ;
      P003Q2_A536TBM11_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P003Q2_n536TBM11_CRT_DATETIME = new boolean[] {false} ;
      P003Q2_A534TBM11_FILE_NAME = new String[] {""} ;
      P003Q2_n534TBM11_FILE_NAME = new boolean[] {false} ;
      P003Q2_A634TBM11_IMAGE_NM = new String[] {""} ;
      P003Q2_n634TBM11_IMAGE_NM = new boolean[] {false} ;
      A533TBM11_IMAGE = "" ;
      A541TBM11_UPD_PROG_NM = "" ;
      A540TBM11_UPD_USER_ID = "" ;
      A539TBM11_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A538TBM11_CRT_PROG_NM = "" ;
      A537TBM11_CRT_USER_ID = "" ;
      A536TBM11_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A534TBM11_FILE_NAME = "" ;
      A634TBM11_IMAGE_NM = "" ;
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
      AV19W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV20W_MSG = "" ;
      AV24Pgmname = "" ;
      GXv_SdtB808_SD01_EXTRA_INFO19 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int20 = new short [1] ;
      GXv_char18 = new String [1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b599_pc21_image_res__default(),
         new Object[] {
             new Object[] {
            P003Q2_A535TBM11_DEL_FLG, P003Q2_n535TBM11_DEL_FLG, P003Q2_A606TBM11_STUDY_ID, P003Q2_n606TBM11_STUDY_ID, P003Q2_A62TBM11_IMAGE_CD, P003Q2_A533TBM11_IMAGE, P003Q2_n533TBM11_IMAGE, P003Q2_A542TBM11_UPD_CNT, P003Q2_n542TBM11_UPD_CNT, P003Q2_A541TBM11_UPD_PROG_NM,
            P003Q2_n541TBM11_UPD_PROG_NM, P003Q2_A540TBM11_UPD_USER_ID, P003Q2_n540TBM11_UPD_USER_ID, P003Q2_A539TBM11_UPD_DATETIME, P003Q2_n539TBM11_UPD_DATETIME, P003Q2_A538TBM11_CRT_PROG_NM, P003Q2_n538TBM11_CRT_PROG_NM, P003Q2_A537TBM11_CRT_USER_ID, P003Q2_n537TBM11_CRT_USER_ID, P003Q2_A536TBM11_CRT_DATETIME,
            P003Q2_n536TBM11_CRT_DATETIME, P003Q2_A534TBM11_FILE_NAME, P003Q2_n534TBM11_FILE_NAME, P003Q2_A634TBM11_IMAGE_NM, P003Q2_n634TBM11_IMAGE_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV24Pgmname = "B599_PC21_IMAGE_RES" ;
      /* GeneXus formulas. */
      AV24Pgmname = "B599_PC21_IMAGE_RES" ;
      Gx_err = (short)(0) ;
   }

   private byte AV23GXLvl33 ;
   private short AV12W_RTN_CD ;
   private short Gx_err ;
   private short GXv_int20[] ;
   private int GXActiveErrHndl ;
   private long AV16W_STUDY_ID ;
   private long A606TBM11_STUDY_ID ;
   private long A542TBM11_UPD_CNT ;
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
   private String AV24Pgmname ;
   private String GXv_char18[] ;
   private String Gx_emsg ;
   private java.util.Date A539TBM11_UPD_DATETIME ;
   private java.util.Date A536TBM11_CRT_DATETIME ;
   private boolean returnInSub ;
   private boolean n535TBM11_DEL_FLG ;
   private boolean n606TBM11_STUDY_ID ;
   private boolean n533TBM11_IMAGE ;
   private boolean n542TBM11_UPD_CNT ;
   private boolean n541TBM11_UPD_PROG_NM ;
   private boolean n540TBM11_UPD_USER_ID ;
   private boolean n539TBM11_UPD_DATETIME ;
   private boolean n538TBM11_CRT_PROG_NM ;
   private boolean n537TBM11_CRT_USER_ID ;
   private boolean n536TBM11_CRT_DATETIME ;
   private boolean n534TBM11_FILE_NAME ;
   private boolean n634TBM11_IMAGE_NM ;
   private String A533TBM11_IMAGE ;
   private String AV9P_IMAGE_CD ;
   private String AV10P_STUDY_ID ;
   private String AV14W_RTN_MSG ;
   private String AV17C_APP_ID ;
   private String A62TBM11_IMAGE_CD ;
   private String A535TBM11_DEL_FLG ;
   private String A541TBM11_UPD_PROG_NM ;
   private String A540TBM11_UPD_USER_ID ;
   private String A538TBM11_CRT_PROG_NM ;
   private String A537TBM11_CRT_USER_ID ;
   private String A534TBM11_FILE_NAME ;
   private String A634TBM11_IMAGE_NM ;
   private String AV15W_STR ;
   private String AV20W_MSG ;
   private GxObjectCollection[] aP2 ;
   private short[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P003Q2_A535TBM11_DEL_FLG ;
   private boolean[] P003Q2_n535TBM11_DEL_FLG ;
   private long[] P003Q2_A606TBM11_STUDY_ID ;
   private boolean[] P003Q2_n606TBM11_STUDY_ID ;
   private String[] P003Q2_A62TBM11_IMAGE_CD ;
   private String[] P003Q2_A533TBM11_IMAGE ;
   private boolean[] P003Q2_n533TBM11_IMAGE ;
   private long[] P003Q2_A542TBM11_UPD_CNT ;
   private boolean[] P003Q2_n542TBM11_UPD_CNT ;
   private String[] P003Q2_A541TBM11_UPD_PROG_NM ;
   private boolean[] P003Q2_n541TBM11_UPD_PROG_NM ;
   private String[] P003Q2_A540TBM11_UPD_USER_ID ;
   private boolean[] P003Q2_n540TBM11_UPD_USER_ID ;
   private java.util.Date[] P003Q2_A539TBM11_UPD_DATETIME ;
   private boolean[] P003Q2_n539TBM11_UPD_DATETIME ;
   private String[] P003Q2_A538TBM11_CRT_PROG_NM ;
   private boolean[] P003Q2_n538TBM11_CRT_PROG_NM ;
   private String[] P003Q2_A537TBM11_CRT_USER_ID ;
   private boolean[] P003Q2_n537TBM11_CRT_USER_ID ;
   private java.util.Date[] P003Q2_A536TBM11_CRT_DATETIME ;
   private boolean[] P003Q2_n536TBM11_CRT_DATETIME ;
   private String[] P003Q2_A534TBM11_FILE_NAME ;
   private boolean[] P003Q2_n534TBM11_FILE_NAME ;
   private String[] P003Q2_A634TBM11_IMAGE_NM ;
   private boolean[] P003Q2_n634TBM11_IMAGE_NM ;
   private GxObjectCollection AV13W_RTN_CSV ;
   private SdtB808_SD01_EXTRA_INFO AV18W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO19[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV19W_PARMS_ITEM ;
}

final  class b599_pc21_image_res__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P003Q2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV9P_IMAGE_CD ,
                                          String AV10P_STUDY_ID ,
                                          String A62TBM11_IMAGE_CD ,
                                          long A606TBM11_STUDY_ID ,
                                          long AV16W_STUDY_ID ,
                                          String A535TBM11_DEL_FLG )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int21 ;
      GXv_int21 = new byte [2] ;
      Object[] GXv_Object22 ;
      GXv_Object22 = new Object [2] ;
      Gx_ope = "Declare" ;
      Gx_etb = "TBM11_IMAGE" ;
      scmdbuf = "SELECT `TBM11_DEL_FLG`, `TBM11_STUDY_ID`, `TBM11_IMAGE_CD`, `TBM11_IMAGE`, `TBM11_UPD_CNT`," ;
      scmdbuf = scmdbuf + " `TBM11_UPD_PROG_NM`, `TBM11_UPD_USER_ID`, `TBM11_UPD_DATETIME`, `TBM11_CRT_PROG_NM`," ;
      scmdbuf = scmdbuf + " `TBM11_CRT_USER_ID`, `TBM11_CRT_DATETIME`, `TBM11_FILE_NAME`, `TBM11_IMAGE_NM` FROM" ;
      scmdbuf = scmdbuf + " `TBM11_IMAGE`" ;
      scmdbuf = scmdbuf + " WHERE (`TBM11_DEL_FLG` = '0')" ;
      if ( ! (GXutil.strcmp("", AV9P_IMAGE_CD)==0) )
      {
         sWhereString = sWhereString + " and (`TBM11_IMAGE_CD` = ?)" ;
      }
      else
      {
         GXv_int21[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV10P_STUDY_ID)==0) )
      {
         sWhereString = sWhereString + " and (`TBM11_STUDY_ID` = ? or (`TBM11_STUDY_ID` = 0) or `TBM11_STUDY_ID` IS NULL)" ;
      }
      else
      {
         GXv_int21[1] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TBM11_IMAGE_CD`" ;
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
                  return conditional_P003Q2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).longValue() , ((Number) dynConstraints[4]).longValue() , (String)dynConstraints[5] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P003Q2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[5])[0] = rslt.getBLOBFile(4, "tmp", "") ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((long[]) buf[7])[0] = rslt.getLong(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDateTime(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
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
                  stmt.setVarchar(sIdx, (String)parms[2], 50);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[3]).longValue());
               }
               return;
      }
   }

}

