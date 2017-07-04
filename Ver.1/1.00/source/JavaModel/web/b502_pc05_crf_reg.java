/*
               File: B502_PC05_CRF_REG
        Description: CRFマスタ登録
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:3.54
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b502_pc05_crf_reg extends GXProcedure
{
   public b502_pc05_crf_reg( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b502_pc05_crf_reg.class ), "" );
   }

   public b502_pc05_crf_reg( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public GxObjectCollection executeUdp( String aP0 ,
                                         String aP1 ,
                                         String aP2 ,
                                         short[] aP3 )
   {
      b502_pc05_crf_reg.this.AV11P_STUDY_ID = aP0;
      b502_pc05_crf_reg.this.AV10P_CRF_ID = aP1;
      b502_pc05_crf_reg.this.AV9P_CRF = aP2;
      b502_pc05_crf_reg.this.AV23W_RTN_MSG = aP4[0];
      b502_pc05_crf_reg.this.aP4 = new GxObjectCollection[] {new GxObjectCollection()};
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
      b502_pc05_crf_reg.this.AV11P_STUDY_ID = aP0;
      b502_pc05_crf_reg.this.AV10P_CRF_ID = aP1;
      b502_pc05_crf_reg.this.AV9P_CRF = aP2;
      b502_pc05_crf_reg.this.aP3 = aP3;
      b502_pc05_crf_reg.this.AV23W_RTN_MSG = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8C_APP_ID = "B502" ;
      AV22W_RTN_CD = (short)(0) ;
      GXt_char1 = AV20W_NEWLINE ;
      GXv_char2[0] = GXt_char1 ;
      new b802_pc02_nl_airres(remoteHandle, context).execute( GXv_char2) ;
      b502_pc05_crf_reg.this.GXt_char1 = GXv_char2[0] ;
      AV20W_NEWLINE = GXt_char1 ;
      AV17W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV17W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV8C_APP_ID );
      GXt_char1 = AV27W_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      b502_pc05_crf_reg.this.GXt_char1 = GXv_char2[0] ;
      AV27W_USER_ID = GXt_char1 ;
      AV28W_UPDATE_TIME = GXutil.now( ) ;
      /* Execute user subroutine: S12149 */
      S12149 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      GXt_objcol_char3 = AV14W_CSV_ROW ;
      GXv_objcol_char4[0] = GXt_objcol_char3 ;
      new b807_pc01_csv_row_parse(remoteHandle, context).execute( AV9P_CRF, GXv_objcol_char4) ;
      GXt_objcol_char3 = GXv_objcol_char4[0] ;
      AV14W_CSV_ROW = GXt_objcol_char3 ;
      AV12W_CNT = 1 ;
      while ( AV12W_CNT <= AV14W_CSV_ROW.size() )
      {
         AV15W_ERR_CD = (short)(0) ;
         GXv_objcol_char4[0] = AV13W_CSV_COL ;
         GXv_int5[0] = AV15W_ERR_CD ;
         GXv_char2[0] = AV19W_MSG ;
         new b807_pc02_csv_col_parse_air(remoteHandle, context).execute( (String)AV14W_CSV_ROW.elementAt(-1+(int)(AV12W_CNT)), 11, "CSV", GXv_objcol_char4, GXv_int5, GXv_char2) ;
         AV13W_CSV_COL = GXv_objcol_char4[0] ;
         b502_pc05_crf_reg.this.AV15W_ERR_CD = GXv_int5[0] ;
         b502_pc05_crf_reg.this.AV19W_MSG = GXv_char2[0] ;
         if ( AV15W_ERR_CD == 0 )
         {
            if ( ! (GXutil.strcmp("", AV11P_STUDY_ID)==0) && ( GXutil.strcmp(AV11P_STUDY_ID, (String)AV13W_CSV_COL.elementAt(-1+1)) != 0 ) )
            {
               AV15W_ERR_CD = (short)(1) ;
               GXt_char1 = AV19W_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AE00063", "試験", "", "", "", "", GXv_char2) ;
               b502_pc05_crf_reg.this.GXt_char1 = GXv_char2[0] ;
               AV19W_MSG = GXt_char1 ;
            }
            if ( ! (GXutil.strcmp("", AV10P_CRF_ID)==0) && ( GXutil.strcmp(AV10P_CRF_ID, (String)AV13W_CSV_COL.elementAt(-1+2)) != 0 ) )
            {
               AV15W_ERR_CD = (short)(1) ;
               GXt_char1 = AV19W_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AE00063", "CRF", "", "", "", "", GXv_char2) ;
               b502_pc05_crf_reg.this.GXt_char1 = GXv_char2[0] ;
               AV19W_MSG = GXt_char1 ;
            }
         }
         if ( AV15W_ERR_CD != 0 )
         {
            AV22W_RTN_CD = (short)(1) ;
            AV19W_MSG = "CRFマスタ：" + GXutil.trim( GXutil.str( AV12W_CNT, 10, 0)) + "行目：" + AV19W_MSG ;
            AV23W_RTN_MSG.add(AV19W_MSG, 0);
         }
         if ( AV22W_RTN_CD == 0 )
         {
            /* Execute user subroutine: S1175 */
            S1175 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         if ( ( AV22W_RTN_CD != 0 ) && ( AV23W_RTN_MSG.size() > AV18W_MAX_ERROR_COUNT ) )
         {
            GXt_char1 = AV19W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00044", GXutil.trim( GXutil.str( AV18W_MAX_ERROR_COUNT, 10, 0)), "", "", "", "", GXv_char2) ;
            b502_pc05_crf_reg.this.GXt_char1 = GXv_char2[0] ;
            AV19W_MSG = GXt_char1 ;
            AV23W_RTN_MSG.add(AV19W_MSG, 0);
            if (true) break;
         }
         AV12W_CNT = (long)(AV12W_CNT+1) ;
      }
      cleanup();
   }

   public void S1175( )
   {
      /* 'SUB_REG' Routine */
      AV25W_STUDY_ID = GXutil.lval( (String)AV13W_CSV_COL.elementAt(-1+1)) ;
      AV26W_CRF_ID = (short)(GXutil.lval( (String)AV13W_CSV_COL.elementAt(-1+2))) ;
      AV30W_CRT_DATETIME = AV28W_UPDATE_TIME ;
      AV31W_CRT_USER_ID = AV27W_USER_ID ;
      AV32W_CRT_PROG_NM = AV40Pgmname ;
      AV33W_UPD_DATETIME = AV28W_UPDATE_TIME ;
      AV34W_UPD_USER_ID = AV27W_USER_ID ;
      AV35W_UPD_PROG_NM = AV40Pgmname ;
      AV29W_UPD_CNT = 1 ;
      AV41GXLvl89 = (byte)(0) ;
      Gx_ope = "Fetch" ;
      Gx_etb = "TBM31_CRF" ;
      /* Using cursor P002G2 */
      pr_default.execute(0, new Object[] {new Long(AV25W_STUDY_ID), new Short(AV26W_CRF_ID)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A218TBM31_CRF_ID = P002G2_A218TBM31_CRF_ID[0] ;
         A217TBM31_STUDY_ID = P002G2_A217TBM31_STUDY_ID[0] ;
         A224TBM31_CRT_DATETIME = P002G2_A224TBM31_CRT_DATETIME[0] ;
         n224TBM31_CRT_DATETIME = P002G2_n224TBM31_CRT_DATETIME[0] ;
         A225TBM31_CRT_USER_ID = P002G2_A225TBM31_CRT_USER_ID[0] ;
         n225TBM31_CRT_USER_ID = P002G2_n225TBM31_CRT_USER_ID[0] ;
         A226TBM31_CRT_PROG_NM = P002G2_A226TBM31_CRT_PROG_NM[0] ;
         n226TBM31_CRT_PROG_NM = P002G2_n226TBM31_CRT_PROG_NM[0] ;
         A230TBM31_UPD_CNT = P002G2_A230TBM31_UPD_CNT[0] ;
         n230TBM31_UPD_CNT = P002G2_n230TBM31_UPD_CNT[0] ;
         A219TBM31_CRF_NM = P002G2_A219TBM31_CRF_NM[0] ;
         n219TBM31_CRF_NM = P002G2_n219TBM31_CRF_NM[0] ;
         A550TBM31_CRF_SNM = P002G2_A550TBM31_CRF_SNM[0] ;
         n550TBM31_CRF_SNM = P002G2_n550TBM31_CRF_SNM[0] ;
         A220TBM31_GRID_SIZE = P002G2_A220TBM31_GRID_SIZE[0] ;
         n220TBM31_GRID_SIZE = P002G2_n220TBM31_GRID_SIZE[0] ;
         A221TBM31_ORDER = P002G2_A221TBM31_ORDER[0] ;
         n221TBM31_ORDER = P002G2_n221TBM31_ORDER[0] ;
         A405TBM31_DEF_VISIT_NO = P002G2_A405TBM31_DEF_VISIT_NO[0] ;
         n405TBM31_DEF_VISIT_NO = P002G2_n405TBM31_DEF_VISIT_NO[0] ;
         A406TBM31_DEF_DOMAIN_CD = P002G2_A406TBM31_DEF_DOMAIN_CD[0] ;
         n406TBM31_DEF_DOMAIN_CD = P002G2_n406TBM31_DEF_DOMAIN_CD[0] ;
         A551TBM31_STATUS = P002G2_A551TBM31_STATUS[0] ;
         n551TBM31_STATUS = P002G2_n551TBM31_STATUS[0] ;
         A222TBM31_NOTE = P002G2_A222TBM31_NOTE[0] ;
         n222TBM31_NOTE = P002G2_n222TBM31_NOTE[0] ;
         A223TBM31_DEL_FLG = P002G2_A223TBM31_DEL_FLG[0] ;
         n223TBM31_DEL_FLG = P002G2_n223TBM31_DEL_FLG[0] ;
         A227TBM31_UPD_DATETIME = P002G2_A227TBM31_UPD_DATETIME[0] ;
         n227TBM31_UPD_DATETIME = P002G2_n227TBM31_UPD_DATETIME[0] ;
         A228TBM31_UPD_USER_ID = P002G2_A228TBM31_UPD_USER_ID[0] ;
         n228TBM31_UPD_USER_ID = P002G2_n228TBM31_UPD_USER_ID[0] ;
         A229TBM31_UPD_PROG_NM = P002G2_A229TBM31_UPD_PROG_NM[0] ;
         n229TBM31_UPD_PROG_NM = P002G2_n229TBM31_UPD_PROG_NM[0] ;
         AV41GXLvl89 = (byte)(1) ;
         AV37P_LOGKBN = "UPD" ;
         AV30W_CRT_DATETIME = A224TBM31_CRT_DATETIME ;
         AV31W_CRT_USER_ID = A225TBM31_CRT_USER_ID ;
         AV32W_CRT_PROG_NM = A226TBM31_CRT_PROG_NM ;
         AV29W_UPD_CNT = (long)(A230TBM31_UPD_CNT+1) ;
         A219TBM31_CRF_NM = (String)AV13W_CSV_COL.elementAt(-1+3) ;
         n219TBM31_CRF_NM = false ;
         A550TBM31_CRF_SNM = (String)AV13W_CSV_COL.elementAt(-1+4) ;
         n550TBM31_CRF_SNM = false ;
         A220TBM31_GRID_SIZE = (short)(GXutil.lval( (String)AV13W_CSV_COL.elementAt(-1+5))) ;
         n220TBM31_GRID_SIZE = false ;
         A221TBM31_ORDER = (int)(GXutil.lval( (String)AV13W_CSV_COL.elementAt(-1+6))) ;
         n221TBM31_ORDER = false ;
         A405TBM31_DEF_VISIT_NO = (short)(GXutil.lval( (String)AV13W_CSV_COL.elementAt(-1+7))) ;
         n405TBM31_DEF_VISIT_NO = false ;
         A406TBM31_DEF_DOMAIN_CD = (String)AV13W_CSV_COL.elementAt(-1+8) ;
         n406TBM31_DEF_DOMAIN_CD = false ;
         A551TBM31_STATUS = (String)AV13W_CSV_COL.elementAt(-1+9) ;
         n551TBM31_STATUS = false ;
         A222TBM31_NOTE = (String)AV13W_CSV_COL.elementAt(-1+10) ;
         n222TBM31_NOTE = false ;
         A223TBM31_DEL_FLG = (String)AV13W_CSV_COL.elementAt(-1+11) ;
         n223TBM31_DEL_FLG = false ;
         A227TBM31_UPD_DATETIME = AV33W_UPD_DATETIME ;
         n227TBM31_UPD_DATETIME = false ;
         A228TBM31_UPD_USER_ID = AV34W_UPD_USER_ID ;
         n228TBM31_UPD_USER_ID = false ;
         A229TBM31_UPD_PROG_NM = AV35W_UPD_PROG_NM ;
         n229TBM31_UPD_PROG_NM = false ;
         A230TBM31_UPD_CNT = AV29W_UPD_CNT ;
         n230TBM31_UPD_CNT = false ;
         Gx_ope = "Update" ;
         Gx_etb = "TBM31_CRF" ;
         /* Using cursor P002G3 */
         pr_default.execute(1, new Object[] {new Boolean(n230TBM31_UPD_CNT), new Long(A230TBM31_UPD_CNT), new Boolean(n219TBM31_CRF_NM), A219TBM31_CRF_NM, new Boolean(n550TBM31_CRF_SNM), A550TBM31_CRF_SNM, new Boolean(n220TBM31_GRID_SIZE), new Short(A220TBM31_GRID_SIZE), new Boolean(n221TBM31_ORDER), new Integer(A221TBM31_ORDER), new Boolean(n405TBM31_DEF_VISIT_NO), new Short(A405TBM31_DEF_VISIT_NO), new Boolean(n406TBM31_DEF_DOMAIN_CD), A406TBM31_DEF_DOMAIN_CD, new Boolean(n551TBM31_STATUS), A551TBM31_STATUS, new Boolean(n222TBM31_NOTE), A222TBM31_NOTE, new Boolean(n223TBM31_DEL_FLG), A223TBM31_DEL_FLG, new Boolean(n227TBM31_UPD_DATETIME), A227TBM31_UPD_DATETIME, new Boolean(n228TBM31_UPD_USER_ID), A228TBM31_UPD_USER_ID, new Boolean(n229TBM31_UPD_PROG_NM), A229TBM31_UPD_PROG_NM, new Long(A217TBM31_STUDY_ID), new Short(A218TBM31_CRF_ID)});
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV41GXLvl89 == 0 )
      {
         AV37P_LOGKBN = "INS" ;
         /*
            INSERT RECORD ON TABLE TBM31_CRF

         */
         A217TBM31_STUDY_ID = GXutil.lval( (String)AV13W_CSV_COL.elementAt(-1+1)) ;
         A218TBM31_CRF_ID = (short)(GXutil.lval( (String)AV13W_CSV_COL.elementAt(-1+2))) ;
         A219TBM31_CRF_NM = (String)AV13W_CSV_COL.elementAt(-1+3) ;
         n219TBM31_CRF_NM = false ;
         A550TBM31_CRF_SNM = (String)AV13W_CSV_COL.elementAt(-1+4) ;
         n550TBM31_CRF_SNM = false ;
         A220TBM31_GRID_SIZE = (short)(GXutil.lval( (String)AV13W_CSV_COL.elementAt(-1+5))) ;
         n220TBM31_GRID_SIZE = false ;
         A221TBM31_ORDER = (int)(GXutil.lval( (String)AV13W_CSV_COL.elementAt(-1+6))) ;
         n221TBM31_ORDER = false ;
         A405TBM31_DEF_VISIT_NO = (short)(GXutil.lval( (String)AV13W_CSV_COL.elementAt(-1+7))) ;
         n405TBM31_DEF_VISIT_NO = false ;
         A406TBM31_DEF_DOMAIN_CD = (String)AV13W_CSV_COL.elementAt(-1+8) ;
         n406TBM31_DEF_DOMAIN_CD = false ;
         A551TBM31_STATUS = (String)AV13W_CSV_COL.elementAt(-1+9) ;
         n551TBM31_STATUS = false ;
         A222TBM31_NOTE = (String)AV13W_CSV_COL.elementAt(-1+10) ;
         n222TBM31_NOTE = false ;
         A223TBM31_DEL_FLG = (String)AV13W_CSV_COL.elementAt(-1+11) ;
         n223TBM31_DEL_FLG = false ;
         A224TBM31_CRT_DATETIME = AV30W_CRT_DATETIME ;
         n224TBM31_CRT_DATETIME = false ;
         A225TBM31_CRT_USER_ID = AV31W_CRT_USER_ID ;
         n225TBM31_CRT_USER_ID = false ;
         A226TBM31_CRT_PROG_NM = AV32W_CRT_PROG_NM ;
         n226TBM31_CRT_PROG_NM = false ;
         A227TBM31_UPD_DATETIME = AV33W_UPD_DATETIME ;
         n227TBM31_UPD_DATETIME = false ;
         A228TBM31_UPD_USER_ID = AV34W_UPD_USER_ID ;
         n228TBM31_UPD_USER_ID = false ;
         A229TBM31_UPD_PROG_NM = AV35W_UPD_PROG_NM ;
         n229TBM31_UPD_PROG_NM = false ;
         A230TBM31_UPD_CNT = AV29W_UPD_CNT ;
         n230TBM31_UPD_CNT = false ;
         Gx_ope = "Insert" ;
         Gx_etb = "TBM31_CRF" ;
         /* Using cursor P002G4 */
         pr_default.execute(2, new Object[] {new Long(A217TBM31_STUDY_ID), new Short(A218TBM31_CRF_ID), new Boolean(n219TBM31_CRF_NM), A219TBM31_CRF_NM, new Boolean(n550TBM31_CRF_SNM), A550TBM31_CRF_SNM, new Boolean(n220TBM31_GRID_SIZE), new Short(A220TBM31_GRID_SIZE), new Boolean(n221TBM31_ORDER), new Integer(A221TBM31_ORDER), new Boolean(n405TBM31_DEF_VISIT_NO), new Short(A405TBM31_DEF_VISIT_NO), new Boolean(n406TBM31_DEF_DOMAIN_CD), A406TBM31_DEF_DOMAIN_CD, new Boolean(n551TBM31_STATUS), A551TBM31_STATUS, new Boolean(n222TBM31_NOTE), A222TBM31_NOTE, new Boolean(n223TBM31_DEL_FLG), A223TBM31_DEL_FLG, new Boolean(n224TBM31_CRT_DATETIME), A224TBM31_CRT_DATETIME, new Boolean(n225TBM31_CRT_USER_ID), A225TBM31_CRT_USER_ID, new Boolean(n226TBM31_CRT_PROG_NM), A226TBM31_CRT_PROG_NM, new Boolean(n227TBM31_UPD_DATETIME), A227TBM31_UPD_DATETIME, new Boolean(n228TBM31_UPD_USER_ID), A228TBM31_UPD_USER_ID, new Boolean(n229TBM31_UPD_PROG_NM), A229TBM31_UPD_PROG_NM, new Boolean(n230TBM31_UPD_CNT), new Long(A230TBM31_UPD_CNT)});
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
      if ( AV22W_RTN_CD == 0 )
      {
         new b808_pc02_data_log(remoteHandle, context).execute( AV40Pgmname, AV37P_LOGKBN, "TBM31_CRF", AV13W_CSV_COL, AV30W_CRT_DATETIME, AV31W_CRT_USER_ID, AV32W_CRT_PROG_NM, AV33W_UPD_DATETIME, AV34W_UPD_USER_ID, AV35W_UPD_PROG_NM, AV29W_UPD_CNT) ;
      }
   }

   public void S12149( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXt_char1 = AV24W_SYS_VALUE ;
      GXv_char2[0] = GXt_char1 ;
      new b806_pc01_get_ctrl_val(remoteHandle, context).execute( "015", GXv_char2) ;
      b502_pc05_crf_reg.this.GXt_char1 = GXv_char2[0] ;
      AV24W_SYS_VALUE = GXt_char1 ;
      AV18W_MAX_ERROR_COUNT = (long)((GxRegex.IsMatch(AV24W_SYS_VALUE,"^\\d+$") ? GXutil.val( AV24W_SYS_VALUE, ".") : 100)) ;
      AV17W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      AV21W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV21W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_STUDY_ID" );
      AV21W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV11P_STUDY_ID );
      AV17W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV21W_PARMS_ITEM, 0);
      AV21W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV21W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_CRF_ID" );
      AV21W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV10P_CRF_ID );
      AV17W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV21W_PARMS_ITEM, 0);
      AV21W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV21W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_CRF" );
      AV21W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV9P_CRF );
      AV17W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV21W_PARMS_ITEM, 0);
      AV19W_MSG = "SUB_INIT" ;
      GXv_SdtB808_SD01_EXTRA_INFO6[0] = AV17W_EXTRA_INFO;
      GXv_int5[0] = AV15W_ERR_CD ;
      GXv_char2[0] = AV16W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV40Pgmname, (short)(1), AV19W_MSG, GXv_SdtB808_SD01_EXTRA_INFO6, GXv_int5, GXv_char2) ;
      AV17W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO6[0] ;
      b502_pc05_crf_reg.this.AV15W_ERR_CD = GXv_int5[0] ;
      b502_pc05_crf_reg.this.AV16W_ERR_MSG = GXv_char2[0] ;
   }

   public void S13181( )
   {
      /* 'SUB_ERROR' Routine */
      AV19W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO6[0] = AV17W_EXTRA_INFO;
      GXv_int5[0] = AV22W_RTN_CD ;
      GXv_char2[0] = AV16W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV40Pgmname, (short)(0), AV19W_MSG, GXv_SdtB808_SD01_EXTRA_INFO6, GXv_int5, GXv_char2) ;
      AV17W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO6[0] ;
      b502_pc05_crf_reg.this.AV22W_RTN_CD = GXv_int5[0] ;
      b502_pc05_crf_reg.this.AV16W_ERR_MSG = GXv_char2[0] ;
      AV23W_RTN_MSG.add(AV16W_ERR_MSG, 0);
      context.globals.Gx_eop = (byte)(0) ;
   }

   protected void cleanup( )
   {
      this.aP3[0] = b502_pc05_crf_reg.this.AV22W_RTN_CD;
      this.aP4[0] = b502_pc05_crf_reg.this.AV23W_RTN_MSG;
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
                  /* Execute user subroutine: S13181 */
                  S13181 ();
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
      AV20W_NEWLINE = "" ;
      AV17W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV27W_USER_ID = "" ;
      AV28W_UPDATE_TIME = GXutil.resetTime( GXutil.nullDate() );
      AV14W_CSV_ROW = new GxObjectCollection(String.class, "internal", "");
      GXt_objcol_char3 = new GxObjectCollection(String.class, "internal", "");
      AV13W_CSV_COL = new GxObjectCollection(String.class, "internal", "");
      GXv_objcol_char4 = new GxObjectCollection [1] ;
      AV19W_MSG = "" ;
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
      P002G2_A218TBM31_CRF_ID = new short[1] ;
      P002G2_A217TBM31_STUDY_ID = new long[1] ;
      P002G2_A224TBM31_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P002G2_n224TBM31_CRT_DATETIME = new boolean[] {false} ;
      P002G2_A225TBM31_CRT_USER_ID = new String[] {""} ;
      P002G2_n225TBM31_CRT_USER_ID = new boolean[] {false} ;
      P002G2_A226TBM31_CRT_PROG_NM = new String[] {""} ;
      P002G2_n226TBM31_CRT_PROG_NM = new boolean[] {false} ;
      P002G2_A230TBM31_UPD_CNT = new long[1] ;
      P002G2_n230TBM31_UPD_CNT = new boolean[] {false} ;
      P002G2_A219TBM31_CRF_NM = new String[] {""} ;
      P002G2_n219TBM31_CRF_NM = new boolean[] {false} ;
      P002G2_A550TBM31_CRF_SNM = new String[] {""} ;
      P002G2_n550TBM31_CRF_SNM = new boolean[] {false} ;
      P002G2_A220TBM31_GRID_SIZE = new short[1] ;
      P002G2_n220TBM31_GRID_SIZE = new boolean[] {false} ;
      P002G2_A221TBM31_ORDER = new int[1] ;
      P002G2_n221TBM31_ORDER = new boolean[] {false} ;
      P002G2_A405TBM31_DEF_VISIT_NO = new short[1] ;
      P002G2_n405TBM31_DEF_VISIT_NO = new boolean[] {false} ;
      P002G2_A406TBM31_DEF_DOMAIN_CD = new String[] {""} ;
      P002G2_n406TBM31_DEF_DOMAIN_CD = new boolean[] {false} ;
      P002G2_A551TBM31_STATUS = new String[] {""} ;
      P002G2_n551TBM31_STATUS = new boolean[] {false} ;
      P002G2_A222TBM31_NOTE = new String[] {""} ;
      P002G2_n222TBM31_NOTE = new boolean[] {false} ;
      P002G2_A223TBM31_DEL_FLG = new String[] {""} ;
      P002G2_n223TBM31_DEL_FLG = new boolean[] {false} ;
      P002G2_A227TBM31_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P002G2_n227TBM31_UPD_DATETIME = new boolean[] {false} ;
      P002G2_A228TBM31_UPD_USER_ID = new String[] {""} ;
      P002G2_n228TBM31_UPD_USER_ID = new boolean[] {false} ;
      P002G2_A229TBM31_UPD_PROG_NM = new String[] {""} ;
      P002G2_n229TBM31_UPD_PROG_NM = new boolean[] {false} ;
      A224TBM31_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A225TBM31_CRT_USER_ID = "" ;
      A226TBM31_CRT_PROG_NM = "" ;
      A219TBM31_CRF_NM = "" ;
      A550TBM31_CRF_SNM = "" ;
      A406TBM31_DEF_DOMAIN_CD = "" ;
      A551TBM31_STATUS = "" ;
      A222TBM31_NOTE = "" ;
      A223TBM31_DEL_FLG = "" ;
      A227TBM31_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A228TBM31_UPD_USER_ID = "" ;
      A229TBM31_UPD_PROG_NM = "" ;
      AV37P_LOGKBN = "" ;
      Gx_emsg = "" ;
      AV24W_SYS_VALUE = "" ;
      GXt_char1 = "" ;
      AV21W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV16W_ERR_MSG = "" ;
      GXv_SdtB808_SD01_EXTRA_INFO6 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int5 = new short [1] ;
      GXv_char2 = new String [1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b502_pc05_crf_reg__default(),
         new Object[] {
             new Object[] {
            P002G2_A218TBM31_CRF_ID, P002G2_A217TBM31_STUDY_ID, P002G2_A224TBM31_CRT_DATETIME, P002G2_n224TBM31_CRT_DATETIME, P002G2_A225TBM31_CRT_USER_ID, P002G2_n225TBM31_CRT_USER_ID, P002G2_A226TBM31_CRT_PROG_NM, P002G2_n226TBM31_CRT_PROG_NM, P002G2_A230TBM31_UPD_CNT, P002G2_n230TBM31_UPD_CNT,
            P002G2_A219TBM31_CRF_NM, P002G2_n219TBM31_CRF_NM, P002G2_A550TBM31_CRF_SNM, P002G2_n550TBM31_CRF_SNM, P002G2_A220TBM31_GRID_SIZE, P002G2_n220TBM31_GRID_SIZE, P002G2_A221TBM31_ORDER, P002G2_n221TBM31_ORDER, P002G2_A405TBM31_DEF_VISIT_NO, P002G2_n405TBM31_DEF_VISIT_NO,
            P002G2_A406TBM31_DEF_DOMAIN_CD, P002G2_n406TBM31_DEF_DOMAIN_CD, P002G2_A551TBM31_STATUS, P002G2_n551TBM31_STATUS, P002G2_A222TBM31_NOTE, P002G2_n222TBM31_NOTE, P002G2_A223TBM31_DEL_FLG, P002G2_n223TBM31_DEL_FLG, P002G2_A227TBM31_UPD_DATETIME, P002G2_n227TBM31_UPD_DATETIME,
            P002G2_A228TBM31_UPD_USER_ID, P002G2_n228TBM31_UPD_USER_ID, P002G2_A229TBM31_UPD_PROG_NM, P002G2_n229TBM31_UPD_PROG_NM
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV40Pgmname = "B502_PC05_CRF_REG" ;
      /* GeneXus formulas. */
      AV40Pgmname = "B502_PC05_CRF_REG" ;
      Gx_err = (short)(0) ;
   }

   private byte AV41GXLvl89 ;
   private short AV22W_RTN_CD ;
   private short AV15W_ERR_CD ;
   private short AV26W_CRF_ID ;
   private short A218TBM31_CRF_ID ;
   private short A220TBM31_GRID_SIZE ;
   private short A405TBM31_DEF_VISIT_NO ;
   private short Gx_err ;
   private short GXv_int5[] ;
   private int A221TBM31_ORDER ;
   private int GX_INS18 ;
   private int GXActiveErrHndl ;
   private long AV12W_CNT ;
   private long AV18W_MAX_ERROR_COUNT ;
   private long AV25W_STUDY_ID ;
   private long AV29W_UPD_CNT ;
   private long A217TBM31_STUDY_ID ;
   private long A230TBM31_UPD_CNT ;
   private String AV40Pgmname ;
   private String scmdbuf ;
   private String Gx_ope ;
   private String Gx_etb ;
   private String Gx_emsg ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private java.util.Date AV28W_UPDATE_TIME ;
   private java.util.Date AV30W_CRT_DATETIME ;
   private java.util.Date AV33W_UPD_DATETIME ;
   private java.util.Date A224TBM31_CRT_DATETIME ;
   private java.util.Date A227TBM31_UPD_DATETIME ;
   private boolean returnInSub ;
   private boolean n224TBM31_CRT_DATETIME ;
   private boolean n225TBM31_CRT_USER_ID ;
   private boolean n226TBM31_CRT_PROG_NM ;
   private boolean n230TBM31_UPD_CNT ;
   private boolean n219TBM31_CRF_NM ;
   private boolean n550TBM31_CRF_SNM ;
   private boolean n220TBM31_GRID_SIZE ;
   private boolean n221TBM31_ORDER ;
   private boolean n405TBM31_DEF_VISIT_NO ;
   private boolean n406TBM31_DEF_DOMAIN_CD ;
   private boolean n551TBM31_STATUS ;
   private boolean n222TBM31_NOTE ;
   private boolean n223TBM31_DEL_FLG ;
   private boolean n227TBM31_UPD_DATETIME ;
   private boolean n228TBM31_UPD_USER_ID ;
   private boolean n229TBM31_UPD_PROG_NM ;
   private String AV11P_STUDY_ID ;
   private String AV10P_CRF_ID ;
   private String AV9P_CRF ;
   private String AV8C_APP_ID ;
   private String AV20W_NEWLINE ;
   private String AV27W_USER_ID ;
   private String AV19W_MSG ;
   private String AV31W_CRT_USER_ID ;
   private String AV32W_CRT_PROG_NM ;
   private String AV34W_UPD_USER_ID ;
   private String AV35W_UPD_PROG_NM ;
   private String A225TBM31_CRT_USER_ID ;
   private String A226TBM31_CRT_PROG_NM ;
   private String A219TBM31_CRF_NM ;
   private String A550TBM31_CRF_SNM ;
   private String A406TBM31_DEF_DOMAIN_CD ;
   private String A551TBM31_STATUS ;
   private String A222TBM31_NOTE ;
   private String A223TBM31_DEL_FLG ;
   private String A228TBM31_UPD_USER_ID ;
   private String A229TBM31_UPD_PROG_NM ;
   private String AV37P_LOGKBN ;
   private String AV24W_SYS_VALUE ;
   private String AV16W_ERR_MSG ;
   private short[] aP3 ;
   private GxObjectCollection[] aP4 ;
   private IDataStoreProvider pr_default ;
   private short[] P002G2_A218TBM31_CRF_ID ;
   private long[] P002G2_A217TBM31_STUDY_ID ;
   private java.util.Date[] P002G2_A224TBM31_CRT_DATETIME ;
   private boolean[] P002G2_n224TBM31_CRT_DATETIME ;
   private String[] P002G2_A225TBM31_CRT_USER_ID ;
   private boolean[] P002G2_n225TBM31_CRT_USER_ID ;
   private String[] P002G2_A226TBM31_CRT_PROG_NM ;
   private boolean[] P002G2_n226TBM31_CRT_PROG_NM ;
   private long[] P002G2_A230TBM31_UPD_CNT ;
   private boolean[] P002G2_n230TBM31_UPD_CNT ;
   private String[] P002G2_A219TBM31_CRF_NM ;
   private boolean[] P002G2_n219TBM31_CRF_NM ;
   private String[] P002G2_A550TBM31_CRF_SNM ;
   private boolean[] P002G2_n550TBM31_CRF_SNM ;
   private short[] P002G2_A220TBM31_GRID_SIZE ;
   private boolean[] P002G2_n220TBM31_GRID_SIZE ;
   private int[] P002G2_A221TBM31_ORDER ;
   private boolean[] P002G2_n221TBM31_ORDER ;
   private short[] P002G2_A405TBM31_DEF_VISIT_NO ;
   private boolean[] P002G2_n405TBM31_DEF_VISIT_NO ;
   private String[] P002G2_A406TBM31_DEF_DOMAIN_CD ;
   private boolean[] P002G2_n406TBM31_DEF_DOMAIN_CD ;
   private String[] P002G2_A551TBM31_STATUS ;
   private boolean[] P002G2_n551TBM31_STATUS ;
   private String[] P002G2_A222TBM31_NOTE ;
   private boolean[] P002G2_n222TBM31_NOTE ;
   private String[] P002G2_A223TBM31_DEL_FLG ;
   private boolean[] P002G2_n223TBM31_DEL_FLG ;
   private java.util.Date[] P002G2_A227TBM31_UPD_DATETIME ;
   private boolean[] P002G2_n227TBM31_UPD_DATETIME ;
   private String[] P002G2_A228TBM31_UPD_USER_ID ;
   private boolean[] P002G2_n228TBM31_UPD_USER_ID ;
   private String[] P002G2_A229TBM31_UPD_PROG_NM ;
   private boolean[] P002G2_n229TBM31_UPD_PROG_NM ;
   private GxObjectCollection AV23W_RTN_MSG ;
   private GxObjectCollection AV14W_CSV_ROW ;
   private GxObjectCollection GXt_objcol_char3 ;
   private GxObjectCollection AV13W_CSV_COL ;
   private GxObjectCollection GXv_objcol_char4[] ;
   private SdtB808_SD01_EXTRA_INFO AV17W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO6[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV21W_PARMS_ITEM ;
}

final  class b502_pc05_crf_reg__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P002G2", "SELECT `TBM31_CRF_ID`, `TBM31_STUDY_ID`, `TBM31_CRT_DATETIME`, `TBM31_CRT_USER_ID`, `TBM31_CRT_PROG_NM`, `TBM31_UPD_CNT`, `TBM31_CRF_NM`, `TBM31_CRF_SNM`, `TBM31_GRID_SIZE`, `TBM31_ORDER`, `TBM31_DEF_VISIT_NO`, `TBM31_DEF_DOMAIN_CD`, `TBM31_STATUS`, `TBM31_NOTE`, `TBM31_DEL_FLG`, `TBM31_UPD_DATETIME`, `TBM31_UPD_USER_ID`, `TBM31_UPD_PROG_NM` FROM `TBM31_CRF` WHERE `TBM31_STUDY_ID` = ? and `TBM31_CRF_ID` = ? ORDER BY `TBM31_STUDY_ID`, `TBM31_CRF_ID`  FOR UPDATE ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P002G3", "UPDATE `TBM31_CRF` SET `TBM31_UPD_CNT`=?, `TBM31_CRF_NM`=?, `TBM31_CRF_SNM`=?, `TBM31_GRID_SIZE`=?, `TBM31_ORDER`=?, `TBM31_DEF_VISIT_NO`=?, `TBM31_DEF_DOMAIN_CD`=?, `TBM31_STATUS`=?, `TBM31_NOTE`=?, `TBM31_DEL_FLG`=?, `TBM31_UPD_DATETIME`=?, `TBM31_UPD_USER_ID`=?, `TBM31_UPD_PROG_NM`=?  WHERE `TBM31_STUDY_ID` = ? AND `TBM31_CRF_ID` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P002G4", "INSERT INTO `TBM31_CRF` (`TBM31_STUDY_ID`, `TBM31_CRF_ID`, `TBM31_CRF_NM`, `TBM31_CRF_SNM`, `TBM31_GRID_SIZE`, `TBM31_ORDER`, `TBM31_DEF_VISIT_NO`, `TBM31_DEF_DOMAIN_CD`, `TBM31_STATUS`, `TBM31_NOTE`, `TBM31_DEL_FLG`, `TBM31_CRT_DATETIME`, `TBM31_CRT_USER_ID`, `TBM31_CRT_PROG_NM`, `TBM31_UPD_DATETIME`, `TBM31_UPD_USER_ID`, `TBM31_UPD_PROG_NM`, `TBM31_UPD_CNT`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(9) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(10) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(11) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[28])[0] = rslt.getGXDateTime(16) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               break;
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
               break;
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
                  stmt.setVarchar(2, (String)parms[3], 100);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[5], 20);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[7]).shortValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[9]).intValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[11]).shortValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[15], 1);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[17], 1000);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[19], 1);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(11, (java.util.Date)parms[21], false);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[23], 128);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[25], 40);
               }
               stmt.setLong(14, ((Number) parms[26]).longValue());
               stmt.setShort(15, ((Number) parms[27]).shortValue());
               break;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[3], 100);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[5], 20);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[7]).shortValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[9]).intValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[11]).shortValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[15], 1);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[17], 1000);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[19], 1);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(12, (java.util.Date)parms[21], false);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[23], 128);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[25], 40);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(15, (java.util.Date)parms[27], false);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[29], 128);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[31], 40);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(18, ((Number) parms[33]).longValue());
               }
               break;
      }
   }

}

