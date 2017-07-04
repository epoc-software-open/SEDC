/*
               File: B502_PC08_CRF_AUTH_REG
        Description: CRF権限マスタ登録
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:12:53.93
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b502_pc08_crf_auth_reg extends GXProcedure
{
   public b502_pc08_crf_auth_reg( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b502_pc08_crf_auth_reg.class ), "" );
   }

   public b502_pc08_crf_auth_reg( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public GxObjectCollection executeUdp( String aP0 ,
                                         String aP1 ,
                                         String aP2 ,
                                         short[] aP3 )
   {
      b502_pc08_crf_auth_reg.this.AV11P_STUDY_ID = aP0;
      b502_pc08_crf_auth_reg.this.AV10P_CRF_ID = aP1;
      b502_pc08_crf_auth_reg.this.AV9P_CRF_AUTH = aP2;
      b502_pc08_crf_auth_reg.this.aP3 = aP3;
      b502_pc08_crf_auth_reg.this.AV24W_RTN_MSG = aP4[0];
      this.aP4 = aP4;
      b502_pc08_crf_auth_reg.this.aP4 = new GxObjectCollection[] {new GxObjectCollection()};
      initialize();
      privateExecute();
      return aP4[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        short[] aP3 ,
                        GxObjectCollection[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             short[] aP3 ,
                             GxObjectCollection[] aP4 )
   {
      b502_pc08_crf_auth_reg.this.AV11P_STUDY_ID = aP0;
      b502_pc08_crf_auth_reg.this.AV10P_CRF_ID = aP1;
      b502_pc08_crf_auth_reg.this.AV9P_CRF_AUTH = aP2;
      b502_pc08_crf_auth_reg.this.aP3 = aP3;
      b502_pc08_crf_auth_reg.this.AV24W_RTN_MSG = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8C_APP_ID = "B502" ;
      AV23W_RTN_CD = (short)(0) ;
      GXt_char1 = AV21W_NEWLINE ;
      GXv_char2[0] = GXt_char1 ;
      new b802_pc02_nl_airres(remoteHandle, context).execute( GXv_char2) ;
      b502_pc08_crf_auth_reg.this.GXt_char1 = GXv_char2[0] ;
      AV21W_NEWLINE = GXt_char1 ;
      AV18W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV18W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV8C_APP_ID );
      GXt_char1 = AV27W_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      b502_pc08_crf_auth_reg.this.GXt_char1 = GXv_char2[0] ;
      AV27W_USER_ID = GXt_char1 ;
      AV28W_UPDATE_TIME = GXutil.now( ) ;
      /* Execute user subroutine: S121 */
      S121 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      GXt_objcol_char3 = AV15W_CSV_ROW ;
      GXv_objcol_char4[0] = GXt_objcol_char3 ;
      new b807_pc01_csv_row_parse(remoteHandle, context).execute( AV9P_CRF_AUTH, GXv_objcol_char4) ;
      GXt_objcol_char3 = GXv_objcol_char4[0] ;
      AV15W_CSV_ROW = GXt_objcol_char3 ;
      AV12W_CNT = 1 ;
      while ( AV12W_CNT <= AV15W_CSV_ROW.size() )
      {
         AV16W_ERR_CD = (short)(0) ;
         GXv_objcol_char4[0] = AV14W_CSV_COL ;
         GXv_int5[0] = AV16W_ERR_CD ;
         GXv_char2[0] = AV20W_MSG ;
         new b807_pc02_csv_col_parse_air(remoteHandle, context).execute( (String)AV15W_CSV_ROW.elementAt(-1+(int)(AV12W_CNT)), 5, "CSV", GXv_objcol_char4, GXv_int5, GXv_char2) ;
         AV14W_CSV_COL = GXv_objcol_char4[0] ;
         b502_pc08_crf_auth_reg.this.AV16W_ERR_CD = GXv_int5[0] ;
         b502_pc08_crf_auth_reg.this.AV20W_MSG = GXv_char2[0] ;
         if ( AV16W_ERR_CD == 0 )
         {
            if ( ! (GXutil.strcmp("", AV11P_STUDY_ID)==0) && ( GXutil.strcmp(AV11P_STUDY_ID, (String)AV14W_CSV_COL.elementAt(-1+1)) != 0 ) )
            {
               AV16W_ERR_CD = (short)(1) ;
               GXt_char1 = AV20W_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AE00063", "試験", "", "", "", "", GXv_char2) ;
               b502_pc08_crf_auth_reg.this.GXt_char1 = GXv_char2[0] ;
               AV20W_MSG = GXt_char1 ;
            }
            if ( ! (GXutil.strcmp("", AV10P_CRF_ID)==0) && ( GXutil.strcmp(AV10P_CRF_ID, (String)AV14W_CSV_COL.elementAt(-1+2)) != 0 ) )
            {
               AV16W_ERR_CD = (short)(1) ;
               GXt_char1 = AV20W_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AE00063", "CRF", "", "", "", "", GXv_char2) ;
               b502_pc08_crf_auth_reg.this.GXt_char1 = GXv_char2[0] ;
               AV20W_MSG = GXt_char1 ;
            }
         }
         if ( AV16W_ERR_CD != 0 )
         {
            AV23W_RTN_CD = (short)(1) ;
            AV20W_MSG = "CRF権限マスタ：" + GXutil.trim( GXutil.str( AV12W_CNT, 10, 0)) + "行目：" + AV20W_MSG ;
            AV24W_RTN_MSG.add(AV20W_MSG, 0);
         }
         if ( AV23W_RTN_CD == 0 )
         {
            /* Execute user subroutine: S111 */
            S111 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         if ( ( AV23W_RTN_CD != 0 ) && ( AV24W_RTN_MSG.size() > AV19W_MAX_ERROR_COUNT ) )
         {
            GXt_char1 = AV20W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00044", GXutil.trim( GXutil.str( AV19W_MAX_ERROR_COUNT, 10, 0)), "", "", "", "", GXv_char2) ;
            b502_pc08_crf_auth_reg.this.GXt_char1 = GXv_char2[0] ;
            AV20W_MSG = GXt_char1 ;
            AV24W_RTN_MSG.add(AV20W_MSG, 0);
            if (true) break;
         }
         AV12W_CNT = (long)(AV12W_CNT+1) ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_REG' Routine */
      AV25W_STUDY_ID = GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+1)) ;
      AV13W_CRF_ID = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+2))) ;
      AV30W_CRT_DATETIME = AV28W_UPDATE_TIME ;
      AV31W_CRT_USER_ID = AV27W_USER_ID ;
      AV32W_CRT_PROG_NM = AV40Pgmname ;
      AV33W_UPD_DATETIME = AV28W_UPDATE_TIME ;
      AV34W_UPD_USER_ID = AV27W_USER_ID ;
      AV35W_UPD_PROG_NM = AV40Pgmname ;
      AV29W_UPD_CNT = 1 ;
      AV41GXLvl89 = (byte)(0) ;
      Gx_ope = "Fetch" ;
      Gx_etb = "TBM34_CRF_AUTH" ;
      /* Using cursor P002H2 */
      pr_default.execute(0, new Object[] {new Long(AV25W_STUDY_ID), new Short(AV13W_CRF_ID)});
      if ( Gx_err != 0 )
      {
         AV41GXLvl89 = (byte)(1) ;
      }
      while ( (pr_default.getStatus(0) != 101) )
      {
         A30TBM34_STYDY_AUTH_CD = P002H2_A30TBM34_STYDY_AUTH_CD[0] ;
         A29TBM34_CRF_ID = P002H2_A29TBM34_CRF_ID[0] ;
         A28TBM34_STUDY_ID = P002H2_A28TBM34_STUDY_ID[0] ;
         A573TBM34_CRT_DATETIME = P002H2_A573TBM34_CRT_DATETIME[0] ;
         n573TBM34_CRT_DATETIME = P002H2_n573TBM34_CRT_DATETIME[0] ;
         A574TBM34_CRT_USER_ID = P002H2_A574TBM34_CRT_USER_ID[0] ;
         n574TBM34_CRT_USER_ID = P002H2_n574TBM34_CRT_USER_ID[0] ;
         A575TBM34_CRT_PROG_NM = P002H2_A575TBM34_CRT_PROG_NM[0] ;
         n575TBM34_CRT_PROG_NM = P002H2_n575TBM34_CRT_PROG_NM[0] ;
         A579TBM34_UPD_CNT = P002H2_A579TBM34_UPD_CNT[0] ;
         n579TBM34_UPD_CNT = P002H2_n579TBM34_UPD_CNT[0] ;
         A571TBM34_DISPLAY_FLG = P002H2_A571TBM34_DISPLAY_FLG[0] ;
         n571TBM34_DISPLAY_FLG = P002H2_n571TBM34_DISPLAY_FLG[0] ;
         A572TBM34_DEL_FLG = P002H2_A572TBM34_DEL_FLG[0] ;
         n572TBM34_DEL_FLG = P002H2_n572TBM34_DEL_FLG[0] ;
         A576TBM34_UPD_DATETIME = P002H2_A576TBM34_UPD_DATETIME[0] ;
         n576TBM34_UPD_DATETIME = P002H2_n576TBM34_UPD_DATETIME[0] ;
         A577TBM34_UPD_USER_ID = P002H2_A577TBM34_UPD_USER_ID[0] ;
         n577TBM34_UPD_USER_ID = P002H2_n577TBM34_UPD_USER_ID[0] ;
         A578TBM34_UPD_PROG_NM = P002H2_A578TBM34_UPD_PROG_NM[0] ;
         n578TBM34_UPD_PROG_NM = P002H2_n578TBM34_UPD_PROG_NM[0] ;
         if ( GXutil.strcmp(A30TBM34_STYDY_AUTH_CD, (String)AV14W_CSV_COL.elementAt(-1+3)) == 0 )
         {
            AV41GXLvl89 = (byte)(1) ;
            AV37P_LOGKBN = "UPD" ;
            AV30W_CRT_DATETIME = A573TBM34_CRT_DATETIME ;
            AV31W_CRT_USER_ID = A574TBM34_CRT_USER_ID ;
            AV32W_CRT_PROG_NM = A575TBM34_CRT_PROG_NM ;
            AV29W_UPD_CNT = (long)(A579TBM34_UPD_CNT+1) ;
            A571TBM34_DISPLAY_FLG = (String)AV14W_CSV_COL.elementAt(-1+4) ;
            n571TBM34_DISPLAY_FLG = false ;
            A572TBM34_DEL_FLG = (String)AV14W_CSV_COL.elementAt(-1+5) ;
            n572TBM34_DEL_FLG = false ;
            A576TBM34_UPD_DATETIME = GXutil.now( ) ;
            n576TBM34_UPD_DATETIME = false ;
            A577TBM34_UPD_USER_ID = AV27W_USER_ID ;
            n577TBM34_UPD_USER_ID = false ;
            A578TBM34_UPD_PROG_NM = AV40Pgmname ;
            n578TBM34_UPD_PROG_NM = false ;
            A579TBM34_UPD_CNT = AV29W_UPD_CNT ;
            n579TBM34_UPD_CNT = false ;
            Gx_ope = "Update" ;
            Gx_etb = "TBM34_CRF_AUTH" ;
            /* Using cursor P002H3 */
            pr_default.execute(1, new Object[] {new Boolean(n579TBM34_UPD_CNT), new Long(A579TBM34_UPD_CNT), new Boolean(n571TBM34_DISPLAY_FLG), A571TBM34_DISPLAY_FLG, new Boolean(n572TBM34_DEL_FLG), A572TBM34_DEL_FLG, new Boolean(n576TBM34_UPD_DATETIME), A576TBM34_UPD_DATETIME, new Boolean(n577TBM34_UPD_USER_ID), A577TBM34_UPD_USER_ID, new Boolean(n578TBM34_UPD_PROG_NM), A578TBM34_UPD_PROG_NM, new Long(A28TBM34_STUDY_ID), new Short(A29TBM34_CRF_ID), A30TBM34_STYDY_AUTH_CD});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM34_CRF_AUTH") ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV41GXLvl89 == 0 )
      {
         AV37P_LOGKBN = "INS" ;
         /*
            INSERT RECORD ON TABLE TBM34_CRF_AUTH

         */
         A28TBM34_STUDY_ID = GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+1)) ;
         A29TBM34_CRF_ID = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+2))) ;
         A30TBM34_STYDY_AUTH_CD = (String)AV14W_CSV_COL.elementAt(-1+3) ;
         A571TBM34_DISPLAY_FLG = (String)AV14W_CSV_COL.elementAt(-1+4) ;
         n571TBM34_DISPLAY_FLG = false ;
         A572TBM34_DEL_FLG = (String)AV14W_CSV_COL.elementAt(-1+5) ;
         n572TBM34_DEL_FLG = false ;
         A573TBM34_CRT_DATETIME = GXutil.now( ) ;
         n573TBM34_CRT_DATETIME = false ;
         A574TBM34_CRT_USER_ID = AV27W_USER_ID ;
         n574TBM34_CRT_USER_ID = false ;
         A575TBM34_CRT_PROG_NM = AV40Pgmname ;
         n575TBM34_CRT_PROG_NM = false ;
         A576TBM34_UPD_DATETIME = GXutil.now( ) ;
         n576TBM34_UPD_DATETIME = false ;
         A577TBM34_UPD_USER_ID = AV27W_USER_ID ;
         n577TBM34_UPD_USER_ID = false ;
         A578TBM34_UPD_PROG_NM = AV40Pgmname ;
         n578TBM34_UPD_PROG_NM = false ;
         A579TBM34_UPD_CNT = 1 ;
         n579TBM34_UPD_CNT = false ;
         Gx_ope = "Insert" ;
         Gx_etb = "TBM34_CRF_AUTH" ;
         /* Using cursor P002H4 */
         pr_default.execute(2, new Object[] {new Long(A28TBM34_STUDY_ID), new Short(A29TBM34_CRF_ID), A30TBM34_STYDY_AUTH_CD, new Boolean(n571TBM34_DISPLAY_FLG), A571TBM34_DISPLAY_FLG, new Boolean(n572TBM34_DEL_FLG), A572TBM34_DEL_FLG, new Boolean(n573TBM34_CRT_DATETIME), A573TBM34_CRT_DATETIME, new Boolean(n574TBM34_CRT_USER_ID), A574TBM34_CRT_USER_ID, new Boolean(n575TBM34_CRT_PROG_NM), A575TBM34_CRT_PROG_NM, new Boolean(n576TBM34_UPD_DATETIME), A576TBM34_UPD_DATETIME, new Boolean(n577TBM34_UPD_USER_ID), A577TBM34_UPD_USER_ID, new Boolean(n578TBM34_UPD_PROG_NM), A578TBM34_UPD_PROG_NM, new Boolean(n579TBM34_UPD_CNT), new Long(A579TBM34_UPD_CNT)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM34_CRF_AUTH") ;
         if ( (pr_default.getStatus(2) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
      }
      if ( AV23W_RTN_CD == 0 )
      {
         new b808_pc02_data_log(remoteHandle, context).execute( AV40Pgmname, AV37P_LOGKBN, "TBM34_CRF_AUTH", AV14W_CSV_COL, AV30W_CRT_DATETIME, AV31W_CRT_USER_ID, AV32W_CRT_PROG_NM, AV33W_UPD_DATETIME, AV34W_UPD_USER_ID, AV35W_UPD_PROG_NM, AV29W_UPD_CNT) ;
      }
   }

   public void S121( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXt_char1 = AV26W_SYS_VALUE ;
      GXv_char2[0] = GXt_char1 ;
      new b806_pc01_get_ctrl_val(remoteHandle, context).execute( "015", GXv_char2) ;
      b502_pc08_crf_auth_reg.this.GXt_char1 = GXv_char2[0] ;
      AV26W_SYS_VALUE = GXt_char1 ;
      AV19W_MAX_ERROR_COUNT = (long)((GxRegex.IsMatch(AV26W_SYS_VALUE,"^\\d+$") ? GXutil.val( AV26W_SYS_VALUE, ".") : 100)) ;
      AV18W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      AV22W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV22W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_STUDY_ID" );
      AV22W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV11P_STUDY_ID );
      AV18W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV22W_PARMS_ITEM, 0);
      AV22W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV22W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_CRF_ID" );
      AV22W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV10P_CRF_ID );
      AV18W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV22W_PARMS_ITEM, 0);
      AV22W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV22W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_CRF_AUTH" );
      AV22W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV9P_CRF_AUTH );
      AV18W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV22W_PARMS_ITEM, 0);
      AV20W_MSG = "SUB_INIT" ;
      GXv_SdtB808_SD01_EXTRA_INFO6[0] = AV18W_EXTRA_INFO;
      GXv_int5[0] = AV16W_ERR_CD ;
      GXv_char2[0] = AV17W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV40Pgmname, (short)(1), AV20W_MSG, GXv_SdtB808_SD01_EXTRA_INFO6, GXv_int5, GXv_char2) ;
      AV18W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO6[0] ;
      b502_pc08_crf_auth_reg.this.AV16W_ERR_CD = GXv_int5[0] ;
      b502_pc08_crf_auth_reg.this.AV17W_ERR_MSG = GXv_char2[0] ;
   }

   public void S131( )
   {
      /* 'SUB_ERROR' Routine */
      AV20W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO6[0] = AV18W_EXTRA_INFO;
      GXv_int5[0] = AV23W_RTN_CD ;
      GXv_char2[0] = AV17W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV40Pgmname, (short)(0), AV20W_MSG, GXv_SdtB808_SD01_EXTRA_INFO6, GXv_int5, GXv_char2) ;
      AV18W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO6[0] ;
      b502_pc08_crf_auth_reg.this.AV23W_RTN_CD = GXv_int5[0] ;
      b502_pc08_crf_auth_reg.this.AV17W_ERR_MSG = GXv_char2[0] ;
      AV24W_RTN_MSG.add(AV17W_ERR_MSG, 0);
      context.globals.Gx_eop = (byte)(0) ;
   }

   protected void cleanup( )
   {
      this.aP3[0] = b502_pc08_crf_auth_reg.this.AV23W_RTN_CD;
      this.aP4[0] = b502_pc08_crf_auth_reg.this.AV24W_RTN_MSG;
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
                  /* Execute user subroutine: S131 */
                  S131 ();
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
      AV8C_APP_ID = "" ;
      AV21W_NEWLINE = "" ;
      AV18W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV27W_USER_ID = "" ;
      AV28W_UPDATE_TIME = GXutil.resetTime( GXutil.nullDate() );
      AV15W_CSV_ROW = new GxObjectCollection(String.class, "internal", "");
      GXt_objcol_char3 = new GxObjectCollection(String.class, "internal", "");
      AV14W_CSV_COL = new GxObjectCollection(String.class, "internal", "");
      GXv_objcol_char4 = new GxObjectCollection [1] ;
      AV20W_MSG = "" ;
      A573TBM34_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A574TBM34_CRT_USER_ID = "" ;
      A575TBM34_CRT_PROG_NM = "" ;
      A571TBM34_DISPLAY_FLG = "" ;
      A572TBM34_DEL_FLG = "" ;
      A576TBM34_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A577TBM34_UPD_USER_ID = "" ;
      A578TBM34_UPD_PROG_NM = "" ;
      AV30W_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      AV31W_CRT_USER_ID = "" ;
      AV32W_CRT_PROG_NM = "" ;
      AV40Pgmname = "" ;
      AV33W_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      AV34W_UPD_USER_ID = "" ;
      AV35W_UPD_PROG_NM = "" ;
      scmdbuf = "" ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      P002H2_A30TBM34_STYDY_AUTH_CD = new String[] {""} ;
      P002H2_A29TBM34_CRF_ID = new short[1] ;
      P002H2_A28TBM34_STUDY_ID = new long[1] ;
      P002H2_A573TBM34_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P002H2_n573TBM34_CRT_DATETIME = new boolean[] {false} ;
      P002H2_A574TBM34_CRT_USER_ID = new String[] {""} ;
      P002H2_n574TBM34_CRT_USER_ID = new boolean[] {false} ;
      P002H2_A575TBM34_CRT_PROG_NM = new String[] {""} ;
      P002H2_n575TBM34_CRT_PROG_NM = new boolean[] {false} ;
      P002H2_A579TBM34_UPD_CNT = new long[1] ;
      P002H2_n579TBM34_UPD_CNT = new boolean[] {false} ;
      P002H2_A571TBM34_DISPLAY_FLG = new String[] {""} ;
      P002H2_n571TBM34_DISPLAY_FLG = new boolean[] {false} ;
      P002H2_A572TBM34_DEL_FLG = new String[] {""} ;
      P002H2_n572TBM34_DEL_FLG = new boolean[] {false} ;
      P002H2_A576TBM34_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P002H2_n576TBM34_UPD_DATETIME = new boolean[] {false} ;
      P002H2_A577TBM34_UPD_USER_ID = new String[] {""} ;
      P002H2_n577TBM34_UPD_USER_ID = new boolean[] {false} ;
      P002H2_A578TBM34_UPD_PROG_NM = new String[] {""} ;
      P002H2_n578TBM34_UPD_PROG_NM = new boolean[] {false} ;
      A30TBM34_STYDY_AUTH_CD = "" ;
      AV37P_LOGKBN = "" ;
      Gx_emsg = "" ;
      AV26W_SYS_VALUE = "" ;
      GXt_char1 = "" ;
      AV22W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV17W_ERR_MSG = "" ;
      GXv_SdtB808_SD01_EXTRA_INFO6 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int5 = new short [1] ;
      GXv_char2 = new String [1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b502_pc08_crf_auth_reg__default(),
         new Object[] {
             new Object[] {
            P002H2_A30TBM34_STYDY_AUTH_CD, P002H2_A29TBM34_CRF_ID, P002H2_A28TBM34_STUDY_ID, P002H2_A573TBM34_CRT_DATETIME, P002H2_n573TBM34_CRT_DATETIME, P002H2_A574TBM34_CRT_USER_ID, P002H2_n574TBM34_CRT_USER_ID, P002H2_A575TBM34_CRT_PROG_NM, P002H2_n575TBM34_CRT_PROG_NM, P002H2_A579TBM34_UPD_CNT,
            P002H2_n579TBM34_UPD_CNT, P002H2_A571TBM34_DISPLAY_FLG, P002H2_n571TBM34_DISPLAY_FLG, P002H2_A572TBM34_DEL_FLG, P002H2_n572TBM34_DEL_FLG, P002H2_A576TBM34_UPD_DATETIME, P002H2_n576TBM34_UPD_DATETIME, P002H2_A577TBM34_UPD_USER_ID, P002H2_n577TBM34_UPD_USER_ID, P002H2_A578TBM34_UPD_PROG_NM,
            P002H2_n578TBM34_UPD_PROG_NM
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV40Pgmname = "B502_PC08_CRF_AUTH_REG" ;
      /* GeneXus formulas. */
      AV40Pgmname = "B502_PC08_CRF_AUTH_REG" ;
      Gx_err = (short)(0) ;
   }

   private byte AV41GXLvl89 ;
   private short AV23W_RTN_CD ;
   private short AV16W_ERR_CD ;
   private short AV13W_CRF_ID ;
   private short Gx_err ;
   private short A29TBM34_CRF_ID ;
   private short GXv_int5[] ;
   private int GX_INS34 ;
   private int GXActiveErrHndl ;
   private long AV12W_CNT ;
   private long AV19W_MAX_ERROR_COUNT ;
   private long A579TBM34_UPD_CNT ;
   private long AV25W_STUDY_ID ;
   private long AV29W_UPD_CNT ;
   private long A28TBM34_STUDY_ID ;
   private String AV40Pgmname ;
   private String scmdbuf ;
   private String Gx_ope ;
   private String Gx_etb ;
   private String Gx_emsg ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private java.util.Date AV28W_UPDATE_TIME ;
   private java.util.Date A573TBM34_CRT_DATETIME ;
   private java.util.Date A576TBM34_UPD_DATETIME ;
   private java.util.Date AV30W_CRT_DATETIME ;
   private java.util.Date AV33W_UPD_DATETIME ;
   private boolean returnInSub ;
   private boolean n573TBM34_CRT_DATETIME ;
   private boolean n574TBM34_CRT_USER_ID ;
   private boolean n575TBM34_CRT_PROG_NM ;
   private boolean n579TBM34_UPD_CNT ;
   private boolean n571TBM34_DISPLAY_FLG ;
   private boolean n572TBM34_DEL_FLG ;
   private boolean n576TBM34_UPD_DATETIME ;
   private boolean n577TBM34_UPD_USER_ID ;
   private boolean n578TBM34_UPD_PROG_NM ;
   private String AV11P_STUDY_ID ;
   private String AV10P_CRF_ID ;
   private String AV9P_CRF_AUTH ;
   private String AV8C_APP_ID ;
   private String AV21W_NEWLINE ;
   private String AV27W_USER_ID ;
   private String AV20W_MSG ;
   private String A574TBM34_CRT_USER_ID ;
   private String A575TBM34_CRT_PROG_NM ;
   private String A571TBM34_DISPLAY_FLG ;
   private String A572TBM34_DEL_FLG ;
   private String A577TBM34_UPD_USER_ID ;
   private String A578TBM34_UPD_PROG_NM ;
   private String AV31W_CRT_USER_ID ;
   private String AV32W_CRT_PROG_NM ;
   private String AV34W_UPD_USER_ID ;
   private String AV35W_UPD_PROG_NM ;
   private String A30TBM34_STYDY_AUTH_CD ;
   private String AV37P_LOGKBN ;
   private String AV26W_SYS_VALUE ;
   private String AV17W_ERR_MSG ;
   private short[] aP3 ;
   private GxObjectCollection[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P002H2_A30TBM34_STYDY_AUTH_CD ;
   private short[] P002H2_A29TBM34_CRF_ID ;
   private long[] P002H2_A28TBM34_STUDY_ID ;
   private java.util.Date[] P002H2_A573TBM34_CRT_DATETIME ;
   private boolean[] P002H2_n573TBM34_CRT_DATETIME ;
   private String[] P002H2_A574TBM34_CRT_USER_ID ;
   private boolean[] P002H2_n574TBM34_CRT_USER_ID ;
   private String[] P002H2_A575TBM34_CRT_PROG_NM ;
   private boolean[] P002H2_n575TBM34_CRT_PROG_NM ;
   private long[] P002H2_A579TBM34_UPD_CNT ;
   private boolean[] P002H2_n579TBM34_UPD_CNT ;
   private String[] P002H2_A571TBM34_DISPLAY_FLG ;
   private boolean[] P002H2_n571TBM34_DISPLAY_FLG ;
   private String[] P002H2_A572TBM34_DEL_FLG ;
   private boolean[] P002H2_n572TBM34_DEL_FLG ;
   private java.util.Date[] P002H2_A576TBM34_UPD_DATETIME ;
   private boolean[] P002H2_n576TBM34_UPD_DATETIME ;
   private String[] P002H2_A577TBM34_UPD_USER_ID ;
   private boolean[] P002H2_n577TBM34_UPD_USER_ID ;
   private String[] P002H2_A578TBM34_UPD_PROG_NM ;
   private boolean[] P002H2_n578TBM34_UPD_PROG_NM ;
   private GxObjectCollection AV24W_RTN_MSG ;
   private GxObjectCollection AV15W_CSV_ROW ;
   private GxObjectCollection GXt_objcol_char3 ;
   private GxObjectCollection AV14W_CSV_COL ;
   private GxObjectCollection GXv_objcol_char4[] ;
   private SdtB808_SD01_EXTRA_INFO AV18W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO6[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV22W_PARMS_ITEM ;
}

final  class b502_pc08_crf_auth_reg__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P002H2", "SELECT `TBM34_STYDY_AUTH_CD`, `TBM34_CRF_ID`, `TBM34_STUDY_ID`, `TBM34_CRT_DATETIME`, `TBM34_CRT_USER_ID`, `TBM34_CRT_PROG_NM`, `TBM34_UPD_CNT`, `TBM34_DISPLAY_FLG`, `TBM34_DEL_FLG`, `TBM34_UPD_DATETIME`, `TBM34_UPD_USER_ID`, `TBM34_UPD_PROG_NM` FROM `TBM34_CRF_AUTH` WHERE `TBM34_STUDY_ID` = ? and `TBM34_CRF_ID` = ? ORDER BY `TBM34_STUDY_ID`, `TBM34_CRF_ID`  FOR UPDATE ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new UpdateCursor("P002H3", "UPDATE `TBM34_CRF_AUTH` SET `TBM34_UPD_CNT`=?, `TBM34_DISPLAY_FLG`=?, `TBM34_DEL_FLG`=?, `TBM34_UPD_DATETIME`=?, `TBM34_UPD_USER_ID`=?, `TBM34_UPD_PROG_NM`=?  WHERE `TBM34_STUDY_ID` = ? AND `TBM34_CRF_ID` = ? AND `TBM34_STYDY_AUTH_CD` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P002H4", "INSERT INTO `TBM34_CRF_AUTH`(`TBM34_STUDY_ID`, `TBM34_CRF_ID`, `TBM34_STYDY_AUTH_CD`, `TBM34_DISPLAY_FLG`, `TBM34_DEL_FLG`, `TBM34_CRT_DATETIME`, `TBM34_CRT_USER_ID`, `TBM34_CRT_PROG_NM`, `TBM34_UPD_DATETIME`, `TBM34_UPD_USER_ID`, `TBM34_UPD_PROG_NM`, `TBM34_UPD_CNT`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
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
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((long[]) buf[9])[0] = rslt.getLong(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(11) ;
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
      switch ( cursor )
      {
            case 0 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(1, ((Number) parms[1]).longValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 1);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[5], 1);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[7], false);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[9], 128);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[11], 40);
               }
               stmt.setLong(7, ((Number) parms[12]).longValue());
               stmt.setShort(8, ((Number) parms[13]).shortValue());
               stmt.setVarchar(9, (String)parms[14], 2, false);
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 2, false);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[4], 1);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[6], 1);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(6, (java.util.Date)parms[8], false);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[10], 128);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[12], 40);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(9, (java.util.Date)parms[14], false);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[16], 128);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[18], 40);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(12, ((Number) parms[20]).longValue());
               }
               return;
      }
   }

}

