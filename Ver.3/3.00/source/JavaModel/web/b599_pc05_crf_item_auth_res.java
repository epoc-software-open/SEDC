/*
               File: B599_PC05_CRF_ITEM_AUTH_RES
        Description: CRF���ڌ����}�X�^�擾
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:16:23.61
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b599_pc05_crf_item_auth_res extends GXProcedure
{
   public b599_pc05_crf_item_auth_res( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b599_pc05_crf_item_auth_res.class ), "" );
   }

   public b599_pc05_crf_item_auth_res( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( long aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String aP3 ,
                             GxObjectCollection[] aP4 ,
                             short[] aP5 )
   {
      b599_pc05_crf_item_auth_res.this.AV10P_STUDY_ID = aP0;
      b599_pc05_crf_item_auth_res.this.AV8P_CRF_ID = aP1;
      b599_pc05_crf_item_auth_res.this.AV9P_CRF_ITEM_CD = aP2;
      b599_pc05_crf_item_auth_res.this.AV11P_STYDY_AUTH_CD = aP3;
      b599_pc05_crf_item_auth_res.this.AV14W_RTN_CSV = aP4[0];
      this.aP4 = aP4;
      b599_pc05_crf_item_auth_res.this.aP5 = aP5;
      b599_pc05_crf_item_auth_res.this.aP6 = aP6;
      b599_pc05_crf_item_auth_res.this.aP6 = new String[] {""};
      initialize();
      privateExecute();
      return aP6[0];
   }

   public void execute( long aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String aP3 ,
                        GxObjectCollection[] aP4 ,
                        short[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( long aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String aP3 ,
                             GxObjectCollection[] aP4 ,
                             short[] aP5 ,
                             String[] aP6 )
   {
      b599_pc05_crf_item_auth_res.this.AV10P_STUDY_ID = aP0;
      b599_pc05_crf_item_auth_res.this.AV8P_CRF_ID = aP1;
      b599_pc05_crf_item_auth_res.this.AV9P_CRF_ITEM_CD = aP2;
      b599_pc05_crf_item_auth_res.this.AV11P_STYDY_AUTH_CD = aP3;
      b599_pc05_crf_item_auth_res.this.AV14W_RTN_CSV = aP4[0];
      this.aP4 = aP4;
      b599_pc05_crf_item_auth_res.this.aP5 = aP5;
      b599_pc05_crf_item_auth_res.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV17C_APP_ID = "B599" ;
      AV13W_RTN_CD = (short)(0) ;
      AV15W_RTN_MSG = "" ;
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
      AV12W_CRF_ID = (short)(GXutil.lval( AV8P_CRF_ID)) ;
      AV23GXLvl33 = (byte)(0) ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV8P_CRF_ID ,
                                           AV9P_CRF_ITEM_CD ,
                                           AV11P_STYDY_AUTH_CD ,
                                           new Short(A32TBM35_CRF_ID) ,
                                           new Short(AV12W_CRF_ID) ,
                                           A33TBM35_CRF_ITEM_CD ,
                                           A34TBM35_STUDY_AUTH_CD ,
                                           A581TBM35_DEL_FLG ,
                                           new Long(AV10P_STUDY_ID) ,
                                           new Long(A31TBM35_STUDY_ID) },
                                           new int[] {
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG,
                                           TypeConstants.LONG
                                           }
      });
      Gx_ope = "Fetch" ;
      Gx_etb = "TBM35_CRF_ITEM_AUTH" ;
      /* Using cursor P00202 */
      pr_default.execute(0, new Object[] {new Long(AV10P_STUDY_ID), new Short(AV12W_CRF_ID), AV9P_CRF_ITEM_CD, AV11P_STYDY_AUTH_CD});
      if ( Gx_err != 0 )
      {
         AV23GXLvl33 = (byte)(1) ;
      }
      while ( (pr_default.getStatus(0) != 101) )
      {
         A581TBM35_DEL_FLG = P00202_A581TBM35_DEL_FLG[0] ;
         n581TBM35_DEL_FLG = P00202_n581TBM35_DEL_FLG[0] ;
         A34TBM35_STUDY_AUTH_CD = P00202_A34TBM35_STUDY_AUTH_CD[0] ;
         A33TBM35_CRF_ITEM_CD = P00202_A33TBM35_CRF_ITEM_CD[0] ;
         A32TBM35_CRF_ID = P00202_A32TBM35_CRF_ID[0] ;
         A31TBM35_STUDY_ID = P00202_A31TBM35_STUDY_ID[0] ;
         A588TBM35_UPD_CNT = P00202_A588TBM35_UPD_CNT[0] ;
         n588TBM35_UPD_CNT = P00202_n588TBM35_UPD_CNT[0] ;
         A587TBM35_UPD_PROG_NM = P00202_A587TBM35_UPD_PROG_NM[0] ;
         n587TBM35_UPD_PROG_NM = P00202_n587TBM35_UPD_PROG_NM[0] ;
         A586TBM35_UPD_USER_ID = P00202_A586TBM35_UPD_USER_ID[0] ;
         n586TBM35_UPD_USER_ID = P00202_n586TBM35_UPD_USER_ID[0] ;
         A585TBM35_UPD_DATETIME = P00202_A585TBM35_UPD_DATETIME[0] ;
         n585TBM35_UPD_DATETIME = P00202_n585TBM35_UPD_DATETIME[0] ;
         A584TBM35_CRT_PROG_NM = P00202_A584TBM35_CRT_PROG_NM[0] ;
         n584TBM35_CRT_PROG_NM = P00202_n584TBM35_CRT_PROG_NM[0] ;
         A583TBM35_CRT_USER_ID = P00202_A583TBM35_CRT_USER_ID[0] ;
         n583TBM35_CRT_USER_ID = P00202_n583TBM35_CRT_USER_ID[0] ;
         A582TBM35_CRT_DATETIME = P00202_A582TBM35_CRT_DATETIME[0] ;
         n582TBM35_CRT_DATETIME = P00202_n582TBM35_CRT_DATETIME[0] ;
         A580TBM35_DISPLAY_FLG = P00202_A580TBM35_DISPLAY_FLG[0] ;
         n580TBM35_DISPLAY_FLG = P00202_n580TBM35_DISPLAY_FLG[0] ;
         AV23GXLvl33 = (byte)(1) ;
         GXt_char1 = AV16W_STR ;
         GXv_char2[0] = GXt_char1 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A33TBM35_CRF_ITEM_CD, GXv_char2) ;
         b599_pc05_crf_item_auth_res.this.GXt_char1 = GXv_char2[0] ;
         GXt_char3 = AV16W_STR ;
         GXv_char4[0] = GXt_char3 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A34TBM35_STUDY_AUTH_CD, GXv_char4) ;
         b599_pc05_crf_item_auth_res.this.GXt_char3 = GXv_char4[0] ;
         GXt_char5 = AV16W_STR ;
         GXv_char6[0] = GXt_char5 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A580TBM35_DISPLAY_FLG, GXv_char6) ;
         b599_pc05_crf_item_auth_res.this.GXt_char5 = GXv_char6[0] ;
         GXt_char7 = AV16W_STR ;
         GXv_char8[0] = GXt_char7 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A581TBM35_DEL_FLG, GXv_char8) ;
         b599_pc05_crf_item_auth_res.this.GXt_char7 = GXv_char8[0] ;
         GXt_char9 = AV16W_STR ;
         GXv_char10[0] = GXt_char9 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A582TBM35_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char10) ;
         b599_pc05_crf_item_auth_res.this.GXt_char9 = GXv_char10[0] ;
         GXt_char11 = AV16W_STR ;
         GXv_char12[0] = GXt_char11 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A583TBM35_CRT_USER_ID, GXv_char12) ;
         b599_pc05_crf_item_auth_res.this.GXt_char11 = GXv_char12[0] ;
         GXt_char13 = AV16W_STR ;
         GXv_char14[0] = GXt_char13 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A584TBM35_CRT_PROG_NM, GXv_char14) ;
         b599_pc05_crf_item_auth_res.this.GXt_char13 = GXv_char14[0] ;
         GXt_char15 = AV16W_STR ;
         GXv_char16[0] = GXt_char15 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A585TBM35_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char16) ;
         b599_pc05_crf_item_auth_res.this.GXt_char15 = GXv_char16[0] ;
         GXt_char17 = AV16W_STR ;
         GXv_char18[0] = GXt_char17 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A586TBM35_UPD_USER_ID, GXv_char18) ;
         b599_pc05_crf_item_auth_res.this.GXt_char17 = GXv_char18[0] ;
         GXt_char19 = AV16W_STR ;
         GXv_char20[0] = GXt_char19 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A587TBM35_UPD_PROG_NM, GXv_char20) ;
         b599_pc05_crf_item_auth_res.this.GXt_char19 = GXv_char20[0] ;
         AV16W_STR = GXutil.trim( GXutil.str( A31TBM35_STUDY_ID, 10, 0)) + "," + GXutil.trim( GXutil.str( A32TBM35_CRF_ID, 10, 0)) + "," + GXt_char1 + "," + GXt_char3 + "," + GXt_char5 + "," + GXt_char7 + "," + GXt_char9 + "," + GXt_char11 + "," + GXt_char13 + "," + GXt_char15 + "," + GXt_char17 + "," + GXt_char19 + "," + GXutil.trim( GXutil.str( A588TBM35_UPD_CNT, 10, 0)) ;
         AV14W_RTN_CSV.add(AV16W_STR, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV23GXLvl33 == 0 )
      {
         AV13W_RTN_CD = (short)(1) ;
         GXt_char19 = AV15W_RTN_MSG ;
         GXv_char20[0] = GXt_char19 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char20) ;
         b599_pc05_crf_item_auth_res.this.GXt_char19 = GXv_char20[0] ;
         AV15W_RTN_MSG = GXt_char19 ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      AV18W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      AV19W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV19W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_STUDY_ID" );
      AV19W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( GXutil.trim( GXutil.str( AV10P_STUDY_ID, 10, 0)) );
      AV18W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV19W_PARMS_ITEM, 0);
      AV19W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV19W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_CRF_ID" );
      AV19W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV8P_CRF_ID );
      AV18W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV19W_PARMS_ITEM, 0);
      AV19W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV19W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_CRF_ITEM_CD" );
      AV19W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV9P_CRF_ITEM_CD );
      AV18W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV19W_PARMS_ITEM, 0);
      AV19W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV19W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_STYDY_AUTH_CD" );
      AV19W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV11P_STYDY_AUTH_CD );
      AV18W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV19W_PARMS_ITEM, 0);
      AV20W_MSG = "SUB_INIT" ;
      GXv_SdtB808_SD01_EXTRA_INFO21[0] = AV18W_EXTRA_INFO;
      GXv_int22[0] = AV13W_RTN_CD ;
      GXv_char20[0] = AV15W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV24Pgmname, (short)(1), AV20W_MSG, GXv_SdtB808_SD01_EXTRA_INFO21, GXv_int22, GXv_char20) ;
      AV18W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO21[0] ;
      b599_pc05_crf_item_auth_res.this.AV13W_RTN_CD = GXv_int22[0] ;
      b599_pc05_crf_item_auth_res.this.AV15W_RTN_MSG = GXv_char20[0] ;
   }

   public void S121( )
   {
      /* 'SUB_ERROR' Routine */
      AV20W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO21[0] = AV18W_EXTRA_INFO;
      GXv_int22[0] = AV13W_RTN_CD ;
      GXv_char20[0] = AV15W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV24Pgmname, (short)(0), AV20W_MSG, GXv_SdtB808_SD01_EXTRA_INFO21, GXv_int22, GXv_char20) ;
      AV18W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO21[0] ;
      b599_pc05_crf_item_auth_res.this.AV13W_RTN_CD = GXv_int22[0] ;
      b599_pc05_crf_item_auth_res.this.AV15W_RTN_MSG = GXv_char20[0] ;
      context.globals.Gx_eop = (byte)(0) ;
   }

   protected void cleanup( )
   {
      this.aP4[0] = b599_pc05_crf_item_auth_res.this.AV14W_RTN_CSV;
      this.aP5[0] = b599_pc05_crf_item_auth_res.this.AV13W_RTN_CD;
      this.aP6[0] = b599_pc05_crf_item_auth_res.this.AV15W_RTN_MSG;
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
      AV15W_RTN_MSG = "" ;
      AV17C_APP_ID = "" ;
      AV18W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      scmdbuf = "" ;
      A33TBM35_CRF_ITEM_CD = "" ;
      A34TBM35_STUDY_AUTH_CD = "" ;
      A581TBM35_DEL_FLG = "" ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      P00202_A581TBM35_DEL_FLG = new String[] {""} ;
      P00202_n581TBM35_DEL_FLG = new boolean[] {false} ;
      P00202_A34TBM35_STUDY_AUTH_CD = new String[] {""} ;
      P00202_A33TBM35_CRF_ITEM_CD = new String[] {""} ;
      P00202_A32TBM35_CRF_ID = new short[1] ;
      P00202_A31TBM35_STUDY_ID = new long[1] ;
      P00202_A588TBM35_UPD_CNT = new long[1] ;
      P00202_n588TBM35_UPD_CNT = new boolean[] {false} ;
      P00202_A587TBM35_UPD_PROG_NM = new String[] {""} ;
      P00202_n587TBM35_UPD_PROG_NM = new boolean[] {false} ;
      P00202_A586TBM35_UPD_USER_ID = new String[] {""} ;
      P00202_n586TBM35_UPD_USER_ID = new boolean[] {false} ;
      P00202_A585TBM35_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P00202_n585TBM35_UPD_DATETIME = new boolean[] {false} ;
      P00202_A584TBM35_CRT_PROG_NM = new String[] {""} ;
      P00202_n584TBM35_CRT_PROG_NM = new boolean[] {false} ;
      P00202_A583TBM35_CRT_USER_ID = new String[] {""} ;
      P00202_n583TBM35_CRT_USER_ID = new boolean[] {false} ;
      P00202_A582TBM35_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P00202_n582TBM35_CRT_DATETIME = new boolean[] {false} ;
      P00202_A580TBM35_DISPLAY_FLG = new String[] {""} ;
      P00202_n580TBM35_DISPLAY_FLG = new boolean[] {false} ;
      A587TBM35_UPD_PROG_NM = "" ;
      A586TBM35_UPD_USER_ID = "" ;
      A585TBM35_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A584TBM35_CRT_PROG_NM = "" ;
      A583TBM35_CRT_USER_ID = "" ;
      A582TBM35_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A580TBM35_DISPLAY_FLG = "" ;
      AV16W_STR = "" ;
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
      AV19W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV20W_MSG = "" ;
      AV24Pgmname = "" ;
      GXv_SdtB808_SD01_EXTRA_INFO21 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int22 = new short [1] ;
      GXv_char20 = new String [1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b599_pc05_crf_item_auth_res__default(),
         new Object[] {
             new Object[] {
            P00202_A581TBM35_DEL_FLG, P00202_n581TBM35_DEL_FLG, P00202_A34TBM35_STUDY_AUTH_CD, P00202_A33TBM35_CRF_ITEM_CD, P00202_A32TBM35_CRF_ID, P00202_A31TBM35_STUDY_ID, P00202_A588TBM35_UPD_CNT, P00202_n588TBM35_UPD_CNT, P00202_A587TBM35_UPD_PROG_NM, P00202_n587TBM35_UPD_PROG_NM,
            P00202_A586TBM35_UPD_USER_ID, P00202_n586TBM35_UPD_USER_ID, P00202_A585TBM35_UPD_DATETIME, P00202_n585TBM35_UPD_DATETIME, P00202_A584TBM35_CRT_PROG_NM, P00202_n584TBM35_CRT_PROG_NM, P00202_A583TBM35_CRT_USER_ID, P00202_n583TBM35_CRT_USER_ID, P00202_A582TBM35_CRT_DATETIME, P00202_n582TBM35_CRT_DATETIME,
            P00202_A580TBM35_DISPLAY_FLG, P00202_n580TBM35_DISPLAY_FLG
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV24Pgmname = "B599_PC05_CRF_ITEM_AUTH_RES" ;
      /* GeneXus formulas. */
      AV24Pgmname = "B599_PC05_CRF_ITEM_AUTH_RES" ;
      Gx_err = (short)(0) ;
   }

   private byte AV23GXLvl33 ;
   private short AV13W_RTN_CD ;
   private short AV12W_CRF_ID ;
   private short A32TBM35_CRF_ID ;
   private short Gx_err ;
   private short GXv_int22[] ;
   private int GXActiveErrHndl ;
   private long AV10P_STUDY_ID ;
   private long A31TBM35_STUDY_ID ;
   private long A588TBM35_UPD_CNT ;
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
   private String AV24Pgmname ;
   private String GXv_char20[] ;
   private String Gx_emsg ;
   private java.util.Date A585TBM35_UPD_DATETIME ;
   private java.util.Date A582TBM35_CRT_DATETIME ;
   private boolean returnInSub ;
   private boolean n581TBM35_DEL_FLG ;
   private boolean n588TBM35_UPD_CNT ;
   private boolean n587TBM35_UPD_PROG_NM ;
   private boolean n586TBM35_UPD_USER_ID ;
   private boolean n585TBM35_UPD_DATETIME ;
   private boolean n584TBM35_CRT_PROG_NM ;
   private boolean n583TBM35_CRT_USER_ID ;
   private boolean n582TBM35_CRT_DATETIME ;
   private boolean n580TBM35_DISPLAY_FLG ;
   private String AV8P_CRF_ID ;
   private String AV9P_CRF_ITEM_CD ;
   private String AV11P_STYDY_AUTH_CD ;
   private String AV15W_RTN_MSG ;
   private String AV17C_APP_ID ;
   private String A33TBM35_CRF_ITEM_CD ;
   private String A34TBM35_STUDY_AUTH_CD ;
   private String A581TBM35_DEL_FLG ;
   private String A587TBM35_UPD_PROG_NM ;
   private String A586TBM35_UPD_USER_ID ;
   private String A584TBM35_CRT_PROG_NM ;
   private String A583TBM35_CRT_USER_ID ;
   private String A580TBM35_DISPLAY_FLG ;
   private String AV16W_STR ;
   private String AV20W_MSG ;
   private GxObjectCollection[] aP4 ;
   private short[] aP5 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P00202_A581TBM35_DEL_FLG ;
   private boolean[] P00202_n581TBM35_DEL_FLG ;
   private String[] P00202_A34TBM35_STUDY_AUTH_CD ;
   private String[] P00202_A33TBM35_CRF_ITEM_CD ;
   private short[] P00202_A32TBM35_CRF_ID ;
   private long[] P00202_A31TBM35_STUDY_ID ;
   private long[] P00202_A588TBM35_UPD_CNT ;
   private boolean[] P00202_n588TBM35_UPD_CNT ;
   private String[] P00202_A587TBM35_UPD_PROG_NM ;
   private boolean[] P00202_n587TBM35_UPD_PROG_NM ;
   private String[] P00202_A586TBM35_UPD_USER_ID ;
   private boolean[] P00202_n586TBM35_UPD_USER_ID ;
   private java.util.Date[] P00202_A585TBM35_UPD_DATETIME ;
   private boolean[] P00202_n585TBM35_UPD_DATETIME ;
   private String[] P00202_A584TBM35_CRT_PROG_NM ;
   private boolean[] P00202_n584TBM35_CRT_PROG_NM ;
   private String[] P00202_A583TBM35_CRT_USER_ID ;
   private boolean[] P00202_n583TBM35_CRT_USER_ID ;
   private java.util.Date[] P00202_A582TBM35_CRT_DATETIME ;
   private boolean[] P00202_n582TBM35_CRT_DATETIME ;
   private String[] P00202_A580TBM35_DISPLAY_FLG ;
   private boolean[] P00202_n580TBM35_DISPLAY_FLG ;
   private GxObjectCollection AV14W_RTN_CSV ;
   private SdtB808_SD01_EXTRA_INFO AV18W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO21[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV19W_PARMS_ITEM ;
}

final  class b599_pc05_crf_item_auth_res__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P00202( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV8P_CRF_ID ,
                                          String AV9P_CRF_ITEM_CD ,
                                          String AV11P_STYDY_AUTH_CD ,
                                          short A32TBM35_CRF_ID ,
                                          short AV12W_CRF_ID ,
                                          String A33TBM35_CRF_ITEM_CD ,
                                          String A34TBM35_STUDY_AUTH_CD ,
                                          String A581TBM35_DEL_FLG ,
                                          long AV10P_STUDY_ID ,
                                          long A31TBM35_STUDY_ID )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int23 ;
      GXv_int23 = new byte [4] ;
      Object[] GXv_Object24 ;
      GXv_Object24 = new Object [2] ;
      Gx_ope = "Declare" ;
      Gx_etb = "TBM35_CRF_ITEM_AUTH" ;
      scmdbuf = "SELECT `TBM35_DEL_FLG`, `TBM35_STUDY_AUTH_CD`, `TBM35_CRF_ITEM_CD`, `TBM35_CRF_ID`," ;
      scmdbuf = scmdbuf + " `TBM35_STUDY_ID`, `TBM35_UPD_CNT`, `TBM35_UPD_PROG_NM`, `TBM35_UPD_USER_ID`, `TBM35_UPD_DATETIME`," ;
      scmdbuf = scmdbuf + " `TBM35_CRT_PROG_NM`, `TBM35_CRT_USER_ID`, `TBM35_CRT_DATETIME`, `TBM35_DISPLAY_FLG`" ;
      scmdbuf = scmdbuf + " FROM `TBM35_CRF_ITEM_AUTH`" ;
      scmdbuf = scmdbuf + " WHERE (`TBM35_STUDY_ID` = ?)" ;
      scmdbuf = scmdbuf + " and (`TBM35_DEL_FLG` = '0')" ;
      if ( ! (GXutil.strcmp("", AV8P_CRF_ID)==0) )
      {
         sWhereString = sWhereString + " and (`TBM35_CRF_ID` = ?)" ;
      }
      else
      {
         GXv_int23[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV9P_CRF_ITEM_CD)==0) )
      {
         sWhereString = sWhereString + " and (`TBM35_CRF_ITEM_CD` = ?)" ;
      }
      else
      {
         GXv_int23[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11P_STYDY_AUTH_CD)==0) )
      {
         sWhereString = sWhereString + " and (`TBM35_STUDY_AUTH_CD` = ?)" ;
      }
      else
      {
         GXv_int23[3] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TBM35_STUDY_ID`, `TBM35_CRF_ID`, `TBM35_CRF_ITEM_CD`, `TBM35_STUDY_AUTH_CD`" ;
      GXv_Object24[0] = scmdbuf ;
      GXv_Object24[1] = GXv_int23 ;
      return GXv_Object24 ;
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
                  return conditional_P00202(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).longValue() , ((Number) dynConstraints[9]).longValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00202", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
               ((short[]) buf[4])[0] = rslt.getShort(4) ;
               ((long[]) buf[5])[0] = rslt.getLong(5) ;
               ((long[]) buf[6])[0] = rslt.getLong(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(9) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDateTime(12) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
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
                  stmt.setLong(sIdx, ((Number) parms[4]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[5]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[6], 50);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[7], 2);
               }
               return;
      }
   }

}

