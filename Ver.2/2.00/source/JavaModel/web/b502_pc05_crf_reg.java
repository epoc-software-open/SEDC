/*
               File: B502_PC05_CRF_REG
        Description: CRFマスタ登録
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:12:52.3
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
      b502_pc05_crf_reg.this.aP3 = aP3;
      b502_pc05_crf_reg.this.AV23W_RTN_MSG = aP4[0];
      this.aP4 = aP4;
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
      /* Execute user subroutine: S121 */
      S121 ();
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
            /* Execute user subroutine: S111 */
            S111 ();
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
      if ( AV22W_RTN_CD == 0 )
      {
         AV41GXLvl73 = (byte)(0) ;
         Gx_ope = "Fetch" ;
         Gx_etb = "TBM44_CRF_VISIT" ;
         /* Using cursor P002E2 */
         pr_default.execute(0, new Object[] {new Long(AV25W_STUDY_ID), new Short(AV26W_CRF_ID)});
         if ( Gx_err != 0 )
         {
            AV41GXLvl73 = (byte)(1) ;
         }
         while ( (pr_default.getStatus(0) != 101) )
         {
            A947TBM44_CRF_EDA_NO = P002E2_A947TBM44_CRF_EDA_NO[0] ;
            A946TBM44_CRF_ID = P002E2_A946TBM44_CRF_ID[0] ;
            A945TBM44_STUDY_ID = P002E2_A945TBM44_STUDY_ID[0] ;
            A948TBM44_VISIT_NO = P002E2_A948TBM44_VISIT_NO[0] ;
            n948TBM44_VISIT_NO = P002E2_n948TBM44_VISIT_NO[0] ;
            A953TBM44_UPD_DATETIME = P002E2_A953TBM44_UPD_DATETIME[0] ;
            n953TBM44_UPD_DATETIME = P002E2_n953TBM44_UPD_DATETIME[0] ;
            A954TBM44_UPD_USER_ID = P002E2_A954TBM44_UPD_USER_ID[0] ;
            n954TBM44_UPD_USER_ID = P002E2_n954TBM44_UPD_USER_ID[0] ;
            A955TBM44_UPD_PROG_NM = P002E2_A955TBM44_UPD_PROG_NM[0] ;
            n955TBM44_UPD_PROG_NM = P002E2_n955TBM44_UPD_PROG_NM[0] ;
            A956TBM44_UPD_CNT = P002E2_A956TBM44_UPD_CNT[0] ;
            n956TBM44_UPD_CNT = P002E2_n956TBM44_UPD_CNT[0] ;
            AV41GXLvl73 = (byte)(1) ;
            if ( A948TBM44_VISIT_NO != AV38W_VISIT_NO )
            {
               A948TBM44_VISIT_NO = AV38W_VISIT_NO ;
               n948TBM44_VISIT_NO = false ;
               A953TBM44_UPD_DATETIME = GXutil.now( ) ;
               n953TBM44_UPD_DATETIME = false ;
               A954TBM44_UPD_USER_ID = AV27W_USER_ID ;
               n954TBM44_UPD_USER_ID = false ;
               A955TBM44_UPD_PROG_NM = AV42Pgmname ;
               n955TBM44_UPD_PROG_NM = false ;
               A956TBM44_UPD_CNT = (long)(A956TBM44_UPD_CNT+1) ;
               n956TBM44_UPD_CNT = false ;
            }
            Gx_ope = "Update" ;
            Gx_etb = "TBM44_CRF_VISIT" ;
            /* Using cursor P002E3 */
            pr_default.execute(1, new Object[] {new Boolean(n948TBM44_VISIT_NO), new Integer(A948TBM44_VISIT_NO), new Boolean(n953TBM44_UPD_DATETIME), A953TBM44_UPD_DATETIME, new Boolean(n954TBM44_UPD_USER_ID), A954TBM44_UPD_USER_ID, new Boolean(n955TBM44_UPD_PROG_NM), A955TBM44_UPD_PROG_NM, new Boolean(n956TBM44_UPD_CNT), new Long(A956TBM44_UPD_CNT), new Long(A945TBM44_STUDY_ID), new Short(A946TBM44_CRF_ID), new Byte(A947TBM44_CRF_EDA_NO)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM44_CRF_VISIT") ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         if ( AV41GXLvl73 == 0 )
         {
            /*
               INSERT RECORD ON TABLE TBM44_CRF_VISIT

            */
            A945TBM44_STUDY_ID = AV25W_STUDY_ID ;
            A946TBM44_CRF_ID = AV26W_CRF_ID ;
            A947TBM44_CRF_EDA_NO = (byte)(1) ;
            A948TBM44_VISIT_NO = AV38W_VISIT_NO ;
            n948TBM44_VISIT_NO = false ;
            A949TBM44_DEL_FLG = "0" ;
            n949TBM44_DEL_FLG = false ;
            A950TBM44_CRT_DATETIME = GXutil.now( ) ;
            n950TBM44_CRT_DATETIME = false ;
            A951TBM44_CRT_USER_ID = AV27W_USER_ID ;
            n951TBM44_CRT_USER_ID = false ;
            A952TBM44_CRT_PROG_NM = AV42Pgmname ;
            n952TBM44_CRT_PROG_NM = false ;
            A953TBM44_UPD_DATETIME = GXutil.now( ) ;
            n953TBM44_UPD_DATETIME = false ;
            A954TBM44_UPD_USER_ID = AV27W_USER_ID ;
            n954TBM44_UPD_USER_ID = false ;
            A955TBM44_UPD_PROG_NM = AV42Pgmname ;
            n955TBM44_UPD_PROG_NM = false ;
            A956TBM44_UPD_CNT = 1 ;
            n956TBM44_UPD_CNT = false ;
            Gx_ope = "Insert" ;
            Gx_etb = "TBM44_CRF_VISIT" ;
            /* Using cursor P002E4 */
            pr_default.execute(2, new Object[] {new Long(A945TBM44_STUDY_ID), new Short(A946TBM44_CRF_ID), new Byte(A947TBM44_CRF_EDA_NO), new Boolean(n948TBM44_VISIT_NO), new Integer(A948TBM44_VISIT_NO), new Boolean(n949TBM44_DEL_FLG), A949TBM44_DEL_FLG, new Boolean(n950TBM44_CRT_DATETIME), A950TBM44_CRT_DATETIME, new Boolean(n951TBM44_CRT_USER_ID), A951TBM44_CRT_USER_ID, new Boolean(n952TBM44_CRT_PROG_NM), A952TBM44_CRT_PROG_NM, new Boolean(n953TBM44_UPD_DATETIME), A953TBM44_UPD_DATETIME, new Boolean(n954TBM44_UPD_USER_ID), A954TBM44_UPD_USER_ID, new Boolean(n955TBM44_UPD_PROG_NM), A955TBM44_UPD_PROG_NM, new Boolean(n956TBM44_UPD_CNT), new Long(A956TBM44_UPD_CNT)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM44_CRF_VISIT") ;
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
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_REG' Routine */
      AV25W_STUDY_ID = GXutil.lval( (String)AV13W_CSV_COL.elementAt(-1+1)) ;
      AV26W_CRF_ID = (short)(GXutil.lval( (String)AV13W_CSV_COL.elementAt(-1+2))) ;
      AV30W_CRT_DATETIME = AV28W_UPDATE_TIME ;
      AV31W_CRT_USER_ID = AV27W_USER_ID ;
      AV32W_CRT_PROG_NM = AV42Pgmname ;
      AV33W_UPD_DATETIME = AV28W_UPDATE_TIME ;
      AV34W_UPD_USER_ID = AV27W_USER_ID ;
      AV35W_UPD_PROG_NM = AV42Pgmname ;
      AV29W_UPD_CNT = 1 ;
      if ( GXutil.val( (String)AV13W_CSV_COL.elementAt(-1+7), ".") > 0 )
      {
         AV38W_VISIT_NO = (int)(GXutil.lval( (String)AV13W_CSV_COL.elementAt(-1+7))) ;
      }
      AV43GXLvl126 = (byte)(0) ;
      Gx_ope = "Fetch" ;
      Gx_etb = "TBM31_CRF" ;
      /* Using cursor P002E5 */
      pr_default.execute(3, new Object[] {new Long(AV25W_STUDY_ID), new Short(AV26W_CRF_ID)});
      if ( Gx_err != 0 )
      {
         AV43GXLvl126 = (byte)(1) ;
      }
      while ( (pr_default.getStatus(3) != 101) )
      {
         A69TBM31_CRF_ID = P002E5_A69TBM31_CRF_ID[0] ;
         A68TBM31_STUDY_ID = P002E5_A68TBM31_STUDY_ID[0] ;
         A398TBM31_CRT_DATETIME = P002E5_A398TBM31_CRT_DATETIME[0] ;
         n398TBM31_CRT_DATETIME = P002E5_n398TBM31_CRT_DATETIME[0] ;
         A399TBM31_CRT_USER_ID = P002E5_A399TBM31_CRT_USER_ID[0] ;
         n399TBM31_CRT_USER_ID = P002E5_n399TBM31_CRT_USER_ID[0] ;
         A400TBM31_CRT_PROG_NM = P002E5_A400TBM31_CRT_PROG_NM[0] ;
         n400TBM31_CRT_PROG_NM = P002E5_n400TBM31_CRT_PROG_NM[0] ;
         A404TBM31_UPD_CNT = P002E5_A404TBM31_UPD_CNT[0] ;
         n404TBM31_UPD_CNT = P002E5_n404TBM31_UPD_CNT[0] ;
         A393TBM31_CRF_NM = P002E5_A393TBM31_CRF_NM[0] ;
         n393TBM31_CRF_NM = P002E5_n393TBM31_CRF_NM[0] ;
         A642TBM31_CRF_SNM = P002E5_A642TBM31_CRF_SNM[0] ;
         n642TBM31_CRF_SNM = P002E5_n642TBM31_CRF_SNM[0] ;
         A394TBM31_GRID_SIZE = P002E5_A394TBM31_GRID_SIZE[0] ;
         n394TBM31_GRID_SIZE = P002E5_n394TBM31_GRID_SIZE[0] ;
         A395TBM31_ORDER = P002E5_A395TBM31_ORDER[0] ;
         n395TBM31_ORDER = P002E5_n395TBM31_ORDER[0] ;
         A528TBM31_DEF_VISIT_NO = P002E5_A528TBM31_DEF_VISIT_NO[0] ;
         n528TBM31_DEF_VISIT_NO = P002E5_n528TBM31_DEF_VISIT_NO[0] ;
         A529TBM31_DEF_DOMAIN_CD = P002E5_A529TBM31_DEF_DOMAIN_CD[0] ;
         n529TBM31_DEF_DOMAIN_CD = P002E5_n529TBM31_DEF_DOMAIN_CD[0] ;
         A643TBM31_STATUS = P002E5_A643TBM31_STATUS[0] ;
         n643TBM31_STATUS = P002E5_n643TBM31_STATUS[0] ;
         A396TBM31_NOTE = P002E5_A396TBM31_NOTE[0] ;
         n396TBM31_NOTE = P002E5_n396TBM31_NOTE[0] ;
         A397TBM31_DEL_FLG = P002E5_A397TBM31_DEL_FLG[0] ;
         n397TBM31_DEL_FLG = P002E5_n397TBM31_DEL_FLG[0] ;
         A401TBM31_UPD_DATETIME = P002E5_A401TBM31_UPD_DATETIME[0] ;
         n401TBM31_UPD_DATETIME = P002E5_n401TBM31_UPD_DATETIME[0] ;
         A402TBM31_UPD_USER_ID = P002E5_A402TBM31_UPD_USER_ID[0] ;
         n402TBM31_UPD_USER_ID = P002E5_n402TBM31_UPD_USER_ID[0] ;
         A403TBM31_UPD_PROG_NM = P002E5_A403TBM31_UPD_PROG_NM[0] ;
         n403TBM31_UPD_PROG_NM = P002E5_n403TBM31_UPD_PROG_NM[0] ;
         AV43GXLvl126 = (byte)(1) ;
         AV37P_LOGKBN = "UPD" ;
         AV30W_CRT_DATETIME = A398TBM31_CRT_DATETIME ;
         AV31W_CRT_USER_ID = A399TBM31_CRT_USER_ID ;
         AV32W_CRT_PROG_NM = A400TBM31_CRT_PROG_NM ;
         AV29W_UPD_CNT = (long)(A404TBM31_UPD_CNT+1) ;
         A393TBM31_CRF_NM = (String)AV13W_CSV_COL.elementAt(-1+3) ;
         n393TBM31_CRF_NM = false ;
         A642TBM31_CRF_SNM = (String)AV13W_CSV_COL.elementAt(-1+4) ;
         n642TBM31_CRF_SNM = false ;
         A394TBM31_GRID_SIZE = (short)(GXutil.lval( (String)AV13W_CSV_COL.elementAt(-1+5))) ;
         n394TBM31_GRID_SIZE = false ;
         A395TBM31_ORDER = (int)(GXutil.lval( (String)AV13W_CSV_COL.elementAt(-1+6))) ;
         n395TBM31_ORDER = false ;
         A528TBM31_DEF_VISIT_NO = (int)(GXutil.lval( (String)AV13W_CSV_COL.elementAt(-1+7))) ;
         n528TBM31_DEF_VISIT_NO = false ;
         A529TBM31_DEF_DOMAIN_CD = (String)AV13W_CSV_COL.elementAt(-1+8) ;
         n529TBM31_DEF_DOMAIN_CD = false ;
         A643TBM31_STATUS = (String)AV13W_CSV_COL.elementAt(-1+9) ;
         n643TBM31_STATUS = false ;
         A396TBM31_NOTE = (String)AV13W_CSV_COL.elementAt(-1+10) ;
         n396TBM31_NOTE = false ;
         A397TBM31_DEL_FLG = (String)AV13W_CSV_COL.elementAt(-1+11) ;
         n397TBM31_DEL_FLG = false ;
         A401TBM31_UPD_DATETIME = AV33W_UPD_DATETIME ;
         n401TBM31_UPD_DATETIME = false ;
         A402TBM31_UPD_USER_ID = AV34W_UPD_USER_ID ;
         n402TBM31_UPD_USER_ID = false ;
         A403TBM31_UPD_PROG_NM = AV35W_UPD_PROG_NM ;
         n403TBM31_UPD_PROG_NM = false ;
         A404TBM31_UPD_CNT = AV29W_UPD_CNT ;
         n404TBM31_UPD_CNT = false ;
         Gx_ope = "Update" ;
         Gx_etb = "TBM31_CRF" ;
         /* Using cursor P002E6 */
         pr_default.execute(4, new Object[] {new Boolean(n404TBM31_UPD_CNT), new Long(A404TBM31_UPD_CNT), new Boolean(n393TBM31_CRF_NM), A393TBM31_CRF_NM, new Boolean(n642TBM31_CRF_SNM), A642TBM31_CRF_SNM, new Boolean(n394TBM31_GRID_SIZE), new Short(A394TBM31_GRID_SIZE), new Boolean(n395TBM31_ORDER), new Integer(A395TBM31_ORDER), new Boolean(n528TBM31_DEF_VISIT_NO), new Integer(A528TBM31_DEF_VISIT_NO), new Boolean(n529TBM31_DEF_DOMAIN_CD), A529TBM31_DEF_DOMAIN_CD, new Boolean(n643TBM31_STATUS), A643TBM31_STATUS, new Boolean(n396TBM31_NOTE), A396TBM31_NOTE, new Boolean(n397TBM31_DEL_FLG), A397TBM31_DEL_FLG, new Boolean(n401TBM31_UPD_DATETIME), A401TBM31_UPD_DATETIME, new Boolean(n402TBM31_UPD_USER_ID), A402TBM31_UPD_USER_ID, new Boolean(n403TBM31_UPD_PROG_NM), A403TBM31_UPD_PROG_NM, new Long(A68TBM31_STUDY_ID), new Short(A69TBM31_CRF_ID)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM31_CRF") ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      if ( AV43GXLvl126 == 0 )
      {
         AV37P_LOGKBN = "INS" ;
         /*
            INSERT RECORD ON TABLE TBM31_CRF

         */
         A68TBM31_STUDY_ID = GXutil.lval( (String)AV13W_CSV_COL.elementAt(-1+1)) ;
         A69TBM31_CRF_ID = (short)(GXutil.lval( (String)AV13W_CSV_COL.elementAt(-1+2))) ;
         A393TBM31_CRF_NM = (String)AV13W_CSV_COL.elementAt(-1+3) ;
         n393TBM31_CRF_NM = false ;
         A642TBM31_CRF_SNM = (String)AV13W_CSV_COL.elementAt(-1+4) ;
         n642TBM31_CRF_SNM = false ;
         A394TBM31_GRID_SIZE = (short)(GXutil.lval( (String)AV13W_CSV_COL.elementAt(-1+5))) ;
         n394TBM31_GRID_SIZE = false ;
         A395TBM31_ORDER = (int)(GXutil.lval( (String)AV13W_CSV_COL.elementAt(-1+6))) ;
         n395TBM31_ORDER = false ;
         A528TBM31_DEF_VISIT_NO = (int)(GXutil.lval( (String)AV13W_CSV_COL.elementAt(-1+7))) ;
         n528TBM31_DEF_VISIT_NO = false ;
         A529TBM31_DEF_DOMAIN_CD = (String)AV13W_CSV_COL.elementAt(-1+8) ;
         n529TBM31_DEF_DOMAIN_CD = false ;
         A643TBM31_STATUS = (String)AV13W_CSV_COL.elementAt(-1+9) ;
         n643TBM31_STATUS = false ;
         A396TBM31_NOTE = (String)AV13W_CSV_COL.elementAt(-1+10) ;
         n396TBM31_NOTE = false ;
         A397TBM31_DEL_FLG = (String)AV13W_CSV_COL.elementAt(-1+11) ;
         n397TBM31_DEL_FLG = false ;
         A398TBM31_CRT_DATETIME = AV30W_CRT_DATETIME ;
         n398TBM31_CRT_DATETIME = false ;
         A399TBM31_CRT_USER_ID = AV31W_CRT_USER_ID ;
         n399TBM31_CRT_USER_ID = false ;
         A400TBM31_CRT_PROG_NM = AV32W_CRT_PROG_NM ;
         n400TBM31_CRT_PROG_NM = false ;
         A401TBM31_UPD_DATETIME = AV33W_UPD_DATETIME ;
         n401TBM31_UPD_DATETIME = false ;
         A402TBM31_UPD_USER_ID = AV34W_UPD_USER_ID ;
         n402TBM31_UPD_USER_ID = false ;
         A403TBM31_UPD_PROG_NM = AV35W_UPD_PROG_NM ;
         n403TBM31_UPD_PROG_NM = false ;
         A404TBM31_UPD_CNT = AV29W_UPD_CNT ;
         n404TBM31_UPD_CNT = false ;
         Gx_ope = "Insert" ;
         Gx_etb = "TBM31_CRF" ;
         /* Using cursor P002E7 */
         pr_default.execute(5, new Object[] {new Long(A68TBM31_STUDY_ID), new Short(A69TBM31_CRF_ID), new Boolean(n393TBM31_CRF_NM), A393TBM31_CRF_NM, new Boolean(n642TBM31_CRF_SNM), A642TBM31_CRF_SNM, new Boolean(n394TBM31_GRID_SIZE), new Short(A394TBM31_GRID_SIZE), new Boolean(n395TBM31_ORDER), new Integer(A395TBM31_ORDER), new Boolean(n528TBM31_DEF_VISIT_NO), new Integer(A528TBM31_DEF_VISIT_NO), new Boolean(n529TBM31_DEF_DOMAIN_CD), A529TBM31_DEF_DOMAIN_CD, new Boolean(n643TBM31_STATUS), A643TBM31_STATUS, new Boolean(n396TBM31_NOTE), A396TBM31_NOTE, new Boolean(n397TBM31_DEL_FLG), A397TBM31_DEL_FLG, new Boolean(n398TBM31_CRT_DATETIME), A398TBM31_CRT_DATETIME, new Boolean(n399TBM31_CRT_USER_ID), A399TBM31_CRT_USER_ID, new Boolean(n400TBM31_CRT_PROG_NM), A400TBM31_CRT_PROG_NM, new Boolean(n401TBM31_UPD_DATETIME), A401TBM31_UPD_DATETIME, new Boolean(n402TBM31_UPD_USER_ID), A402TBM31_UPD_USER_ID, new Boolean(n403TBM31_UPD_PROG_NM), A403TBM31_UPD_PROG_NM, new Boolean(n404TBM31_UPD_CNT), new Long(A404TBM31_UPD_CNT)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM31_CRF") ;
         if ( (pr_default.getStatus(5) == 1) )
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
         new b808_pc02_data_log(remoteHandle, context).execute( AV42Pgmname, AV37P_LOGKBN, "TBM31_CRF", AV13W_CSV_COL, AV30W_CRT_DATETIME, AV31W_CRT_USER_ID, AV32W_CRT_PROG_NM, AV33W_UPD_DATETIME, AV34W_UPD_USER_ID, AV35W_UPD_PROG_NM, AV29W_UPD_CNT) ;
      }
   }

   public void S121( )
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
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV42Pgmname, (short)(1), AV19W_MSG, GXv_SdtB808_SD01_EXTRA_INFO6, GXv_int5, GXv_char2) ;
      AV17W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO6[0] ;
      b502_pc05_crf_reg.this.AV15W_ERR_CD = GXv_int5[0] ;
      b502_pc05_crf_reg.this.AV16W_ERR_MSG = GXv_char2[0] ;
   }

   public void S131( )
   {
      /* 'SUB_ERROR' Routine */
      AV19W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO6[0] = AV17W_EXTRA_INFO;
      GXv_int5[0] = AV22W_RTN_CD ;
      GXv_char2[0] = AV16W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV42Pgmname, (short)(0), AV19W_MSG, GXv_SdtB808_SD01_EXTRA_INFO6, GXv_int5, GXv_char2) ;
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
      AV20W_NEWLINE = "" ;
      AV17W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV27W_USER_ID = "" ;
      AV28W_UPDATE_TIME = GXutil.resetTime( GXutil.nullDate() );
      AV14W_CSV_ROW = new GxObjectCollection(String.class, "internal", "");
      GXt_objcol_char3 = new GxObjectCollection(String.class, "internal", "");
      AV13W_CSV_COL = new GxObjectCollection(String.class, "internal", "");
      GXv_objcol_char4 = new GxObjectCollection [1] ;
      AV19W_MSG = "" ;
      scmdbuf = "" ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      P002E2_A947TBM44_CRF_EDA_NO = new byte[1] ;
      P002E2_A946TBM44_CRF_ID = new short[1] ;
      P002E2_A945TBM44_STUDY_ID = new long[1] ;
      P002E2_A948TBM44_VISIT_NO = new int[1] ;
      P002E2_n948TBM44_VISIT_NO = new boolean[] {false} ;
      P002E2_A953TBM44_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P002E2_n953TBM44_UPD_DATETIME = new boolean[] {false} ;
      P002E2_A954TBM44_UPD_USER_ID = new String[] {""} ;
      P002E2_n954TBM44_UPD_USER_ID = new boolean[] {false} ;
      P002E2_A955TBM44_UPD_PROG_NM = new String[] {""} ;
      P002E2_n955TBM44_UPD_PROG_NM = new boolean[] {false} ;
      P002E2_A956TBM44_UPD_CNT = new long[1] ;
      P002E2_n956TBM44_UPD_CNT = new boolean[] {false} ;
      A953TBM44_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A954TBM44_UPD_USER_ID = "" ;
      A955TBM44_UPD_PROG_NM = "" ;
      AV42Pgmname = "" ;
      A949TBM44_DEL_FLG = "" ;
      A950TBM44_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A951TBM44_CRT_USER_ID = "" ;
      A952TBM44_CRT_PROG_NM = "" ;
      Gx_emsg = "" ;
      A398TBM31_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A399TBM31_CRT_USER_ID = "" ;
      A400TBM31_CRT_PROG_NM = "" ;
      A393TBM31_CRF_NM = "" ;
      A642TBM31_CRF_SNM = "" ;
      A529TBM31_DEF_DOMAIN_CD = "" ;
      A643TBM31_STATUS = "" ;
      A396TBM31_NOTE = "" ;
      A397TBM31_DEL_FLG = "" ;
      A401TBM31_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A402TBM31_UPD_USER_ID = "" ;
      A403TBM31_UPD_PROG_NM = "" ;
      AV30W_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      AV31W_CRT_USER_ID = "" ;
      AV32W_CRT_PROG_NM = "" ;
      AV33W_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      AV34W_UPD_USER_ID = "" ;
      AV35W_UPD_PROG_NM = "" ;
      P002E5_A69TBM31_CRF_ID = new short[1] ;
      P002E5_A68TBM31_STUDY_ID = new long[1] ;
      P002E5_A398TBM31_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P002E5_n398TBM31_CRT_DATETIME = new boolean[] {false} ;
      P002E5_A399TBM31_CRT_USER_ID = new String[] {""} ;
      P002E5_n399TBM31_CRT_USER_ID = new boolean[] {false} ;
      P002E5_A400TBM31_CRT_PROG_NM = new String[] {""} ;
      P002E5_n400TBM31_CRT_PROG_NM = new boolean[] {false} ;
      P002E5_A404TBM31_UPD_CNT = new long[1] ;
      P002E5_n404TBM31_UPD_CNT = new boolean[] {false} ;
      P002E5_A393TBM31_CRF_NM = new String[] {""} ;
      P002E5_n393TBM31_CRF_NM = new boolean[] {false} ;
      P002E5_A642TBM31_CRF_SNM = new String[] {""} ;
      P002E5_n642TBM31_CRF_SNM = new boolean[] {false} ;
      P002E5_A394TBM31_GRID_SIZE = new short[1] ;
      P002E5_n394TBM31_GRID_SIZE = new boolean[] {false} ;
      P002E5_A395TBM31_ORDER = new int[1] ;
      P002E5_n395TBM31_ORDER = new boolean[] {false} ;
      P002E5_A528TBM31_DEF_VISIT_NO = new int[1] ;
      P002E5_n528TBM31_DEF_VISIT_NO = new boolean[] {false} ;
      P002E5_A529TBM31_DEF_DOMAIN_CD = new String[] {""} ;
      P002E5_n529TBM31_DEF_DOMAIN_CD = new boolean[] {false} ;
      P002E5_A643TBM31_STATUS = new String[] {""} ;
      P002E5_n643TBM31_STATUS = new boolean[] {false} ;
      P002E5_A396TBM31_NOTE = new String[] {""} ;
      P002E5_n396TBM31_NOTE = new boolean[] {false} ;
      P002E5_A397TBM31_DEL_FLG = new String[] {""} ;
      P002E5_n397TBM31_DEL_FLG = new boolean[] {false} ;
      P002E5_A401TBM31_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P002E5_n401TBM31_UPD_DATETIME = new boolean[] {false} ;
      P002E5_A402TBM31_UPD_USER_ID = new String[] {""} ;
      P002E5_n402TBM31_UPD_USER_ID = new boolean[] {false} ;
      P002E5_A403TBM31_UPD_PROG_NM = new String[] {""} ;
      P002E5_n403TBM31_UPD_PROG_NM = new boolean[] {false} ;
      AV37P_LOGKBN = "" ;
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
            P002E2_A947TBM44_CRF_EDA_NO, P002E2_A946TBM44_CRF_ID, P002E2_A945TBM44_STUDY_ID, P002E2_A948TBM44_VISIT_NO, P002E2_n948TBM44_VISIT_NO, P002E2_A953TBM44_UPD_DATETIME, P002E2_n953TBM44_UPD_DATETIME, P002E2_A954TBM44_UPD_USER_ID, P002E2_n954TBM44_UPD_USER_ID, P002E2_A955TBM44_UPD_PROG_NM,
            P002E2_n955TBM44_UPD_PROG_NM, P002E2_A956TBM44_UPD_CNT, P002E2_n956TBM44_UPD_CNT
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P002E5_A69TBM31_CRF_ID, P002E5_A68TBM31_STUDY_ID, P002E5_A398TBM31_CRT_DATETIME, P002E5_n398TBM31_CRT_DATETIME, P002E5_A399TBM31_CRT_USER_ID, P002E5_n399TBM31_CRT_USER_ID, P002E5_A400TBM31_CRT_PROG_NM, P002E5_n400TBM31_CRT_PROG_NM, P002E5_A404TBM31_UPD_CNT, P002E5_n404TBM31_UPD_CNT,
            P002E5_A393TBM31_CRF_NM, P002E5_n393TBM31_CRF_NM, P002E5_A642TBM31_CRF_SNM, P002E5_n642TBM31_CRF_SNM, P002E5_A394TBM31_GRID_SIZE, P002E5_n394TBM31_GRID_SIZE, P002E5_A395TBM31_ORDER, P002E5_n395TBM31_ORDER, P002E5_A528TBM31_DEF_VISIT_NO, P002E5_n528TBM31_DEF_VISIT_NO,
            P002E5_A529TBM31_DEF_DOMAIN_CD, P002E5_n529TBM31_DEF_DOMAIN_CD, P002E5_A643TBM31_STATUS, P002E5_n643TBM31_STATUS, P002E5_A396TBM31_NOTE, P002E5_n396TBM31_NOTE, P002E5_A397TBM31_DEL_FLG, P002E5_n397TBM31_DEL_FLG, P002E5_A401TBM31_UPD_DATETIME, P002E5_n401TBM31_UPD_DATETIME,
            P002E5_A402TBM31_UPD_USER_ID, P002E5_n402TBM31_UPD_USER_ID, P002E5_A403TBM31_UPD_PROG_NM, P002E5_n403TBM31_UPD_PROG_NM
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV42Pgmname = "B502_PC05_CRF_REG" ;
      /* GeneXus formulas. */
      AV42Pgmname = "B502_PC05_CRF_REG" ;
      Gx_err = (short)(0) ;
   }

   private byte AV41GXLvl73 ;
   private byte A947TBM44_CRF_EDA_NO ;
   private byte AV43GXLvl126 ;
   private short AV22W_RTN_CD ;
   private short AV15W_ERR_CD ;
   private short AV26W_CRF_ID ;
   private short Gx_err ;
   private short A946TBM44_CRF_ID ;
   private short A394TBM31_GRID_SIZE ;
   private short A69TBM31_CRF_ID ;
   private short GXv_int5[] ;
   private int A948TBM44_VISIT_NO ;
   private int AV38W_VISIT_NO ;
   private int GX_INS61 ;
   private int A395TBM31_ORDER ;
   private int A528TBM31_DEF_VISIT_NO ;
   private int GX_INS18 ;
   private int GXActiveErrHndl ;
   private long AV12W_CNT ;
   private long AV18W_MAX_ERROR_COUNT ;
   private long AV25W_STUDY_ID ;
   private long A945TBM44_STUDY_ID ;
   private long A956TBM44_UPD_CNT ;
   private long A404TBM31_UPD_CNT ;
   private long AV29W_UPD_CNT ;
   private long A68TBM31_STUDY_ID ;
   private String scmdbuf ;
   private String Gx_ope ;
   private String Gx_etb ;
   private String AV42Pgmname ;
   private String Gx_emsg ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private java.util.Date AV28W_UPDATE_TIME ;
   private java.util.Date A953TBM44_UPD_DATETIME ;
   private java.util.Date A950TBM44_CRT_DATETIME ;
   private java.util.Date A398TBM31_CRT_DATETIME ;
   private java.util.Date A401TBM31_UPD_DATETIME ;
   private java.util.Date AV30W_CRT_DATETIME ;
   private java.util.Date AV33W_UPD_DATETIME ;
   private boolean returnInSub ;
   private boolean n948TBM44_VISIT_NO ;
   private boolean n953TBM44_UPD_DATETIME ;
   private boolean n954TBM44_UPD_USER_ID ;
   private boolean n955TBM44_UPD_PROG_NM ;
   private boolean n956TBM44_UPD_CNT ;
   private boolean n949TBM44_DEL_FLG ;
   private boolean n950TBM44_CRT_DATETIME ;
   private boolean n951TBM44_CRT_USER_ID ;
   private boolean n952TBM44_CRT_PROG_NM ;
   private boolean n398TBM31_CRT_DATETIME ;
   private boolean n399TBM31_CRT_USER_ID ;
   private boolean n400TBM31_CRT_PROG_NM ;
   private boolean n404TBM31_UPD_CNT ;
   private boolean n393TBM31_CRF_NM ;
   private boolean n642TBM31_CRF_SNM ;
   private boolean n394TBM31_GRID_SIZE ;
   private boolean n395TBM31_ORDER ;
   private boolean n528TBM31_DEF_VISIT_NO ;
   private boolean n529TBM31_DEF_DOMAIN_CD ;
   private boolean n643TBM31_STATUS ;
   private boolean n396TBM31_NOTE ;
   private boolean n397TBM31_DEL_FLG ;
   private boolean n401TBM31_UPD_DATETIME ;
   private boolean n402TBM31_UPD_USER_ID ;
   private boolean n403TBM31_UPD_PROG_NM ;
   private String AV11P_STUDY_ID ;
   private String AV10P_CRF_ID ;
   private String AV9P_CRF ;
   private String AV8C_APP_ID ;
   private String AV20W_NEWLINE ;
   private String AV27W_USER_ID ;
   private String AV19W_MSG ;
   private String A954TBM44_UPD_USER_ID ;
   private String A955TBM44_UPD_PROG_NM ;
   private String A949TBM44_DEL_FLG ;
   private String A951TBM44_CRT_USER_ID ;
   private String A952TBM44_CRT_PROG_NM ;
   private String A399TBM31_CRT_USER_ID ;
   private String A400TBM31_CRT_PROG_NM ;
   private String A393TBM31_CRF_NM ;
   private String A642TBM31_CRF_SNM ;
   private String A529TBM31_DEF_DOMAIN_CD ;
   private String A643TBM31_STATUS ;
   private String A396TBM31_NOTE ;
   private String A397TBM31_DEL_FLG ;
   private String A402TBM31_UPD_USER_ID ;
   private String A403TBM31_UPD_PROG_NM ;
   private String AV31W_CRT_USER_ID ;
   private String AV32W_CRT_PROG_NM ;
   private String AV34W_UPD_USER_ID ;
   private String AV35W_UPD_PROG_NM ;
   private String AV37P_LOGKBN ;
   private String AV24W_SYS_VALUE ;
   private String AV16W_ERR_MSG ;
   private short[] aP3 ;
   private GxObjectCollection[] aP4 ;
   private IDataStoreProvider pr_default ;
   private byte[] P002E2_A947TBM44_CRF_EDA_NO ;
   private short[] P002E2_A946TBM44_CRF_ID ;
   private long[] P002E2_A945TBM44_STUDY_ID ;
   private int[] P002E2_A948TBM44_VISIT_NO ;
   private boolean[] P002E2_n948TBM44_VISIT_NO ;
   private java.util.Date[] P002E2_A953TBM44_UPD_DATETIME ;
   private boolean[] P002E2_n953TBM44_UPD_DATETIME ;
   private String[] P002E2_A954TBM44_UPD_USER_ID ;
   private boolean[] P002E2_n954TBM44_UPD_USER_ID ;
   private String[] P002E2_A955TBM44_UPD_PROG_NM ;
   private boolean[] P002E2_n955TBM44_UPD_PROG_NM ;
   private long[] P002E2_A956TBM44_UPD_CNT ;
   private boolean[] P002E2_n956TBM44_UPD_CNT ;
   private short[] P002E5_A69TBM31_CRF_ID ;
   private long[] P002E5_A68TBM31_STUDY_ID ;
   private java.util.Date[] P002E5_A398TBM31_CRT_DATETIME ;
   private boolean[] P002E5_n398TBM31_CRT_DATETIME ;
   private String[] P002E5_A399TBM31_CRT_USER_ID ;
   private boolean[] P002E5_n399TBM31_CRT_USER_ID ;
   private String[] P002E5_A400TBM31_CRT_PROG_NM ;
   private boolean[] P002E5_n400TBM31_CRT_PROG_NM ;
   private long[] P002E5_A404TBM31_UPD_CNT ;
   private boolean[] P002E5_n404TBM31_UPD_CNT ;
   private String[] P002E5_A393TBM31_CRF_NM ;
   private boolean[] P002E5_n393TBM31_CRF_NM ;
   private String[] P002E5_A642TBM31_CRF_SNM ;
   private boolean[] P002E5_n642TBM31_CRF_SNM ;
   private short[] P002E5_A394TBM31_GRID_SIZE ;
   private boolean[] P002E5_n394TBM31_GRID_SIZE ;
   private int[] P002E5_A395TBM31_ORDER ;
   private boolean[] P002E5_n395TBM31_ORDER ;
   private int[] P002E5_A528TBM31_DEF_VISIT_NO ;
   private boolean[] P002E5_n528TBM31_DEF_VISIT_NO ;
   private String[] P002E5_A529TBM31_DEF_DOMAIN_CD ;
   private boolean[] P002E5_n529TBM31_DEF_DOMAIN_CD ;
   private String[] P002E5_A643TBM31_STATUS ;
   private boolean[] P002E5_n643TBM31_STATUS ;
   private String[] P002E5_A396TBM31_NOTE ;
   private boolean[] P002E5_n396TBM31_NOTE ;
   private String[] P002E5_A397TBM31_DEL_FLG ;
   private boolean[] P002E5_n397TBM31_DEL_FLG ;
   private java.util.Date[] P002E5_A401TBM31_UPD_DATETIME ;
   private boolean[] P002E5_n401TBM31_UPD_DATETIME ;
   private String[] P002E5_A402TBM31_UPD_USER_ID ;
   private boolean[] P002E5_n402TBM31_UPD_USER_ID ;
   private String[] P002E5_A403TBM31_UPD_PROG_NM ;
   private boolean[] P002E5_n403TBM31_UPD_PROG_NM ;
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
          new ForEachCursor("P002E2", "SELECT `TBM44_CRF_EDA_NO`, `TBM44_CRF_ID`, `TBM44_STUDY_ID`, `TBM44_VISIT_NO`, `TBM44_UPD_DATETIME`, `TBM44_UPD_USER_ID`, `TBM44_UPD_PROG_NM`, `TBM44_UPD_CNT` FROM `TBM44_CRF_VISIT` WHERE `TBM44_STUDY_ID` = ? and `TBM44_CRF_ID` = ? and `TBM44_CRF_EDA_NO` = 1 ORDER BY `TBM44_STUDY_ID`, `TBM44_CRF_ID`, `TBM44_CRF_EDA_NO`  FOR UPDATE ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P002E3", "UPDATE `TBM44_CRF_VISIT` SET `TBM44_VISIT_NO`=?, `TBM44_UPD_DATETIME`=?, `TBM44_UPD_USER_ID`=?, `TBM44_UPD_PROG_NM`=?, `TBM44_UPD_CNT`=?  WHERE `TBM44_STUDY_ID` = ? AND `TBM44_CRF_ID` = ? AND `TBM44_CRF_EDA_NO` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P002E4", "INSERT INTO `TBM44_CRF_VISIT`(`TBM44_STUDY_ID`, `TBM44_CRF_ID`, `TBM44_CRF_EDA_NO`, `TBM44_VISIT_NO`, `TBM44_DEL_FLG`, `TBM44_CRT_DATETIME`, `TBM44_CRT_USER_ID`, `TBM44_CRT_PROG_NM`, `TBM44_UPD_DATETIME`, `TBM44_UPD_USER_ID`, `TBM44_UPD_PROG_NM`, `TBM44_UPD_CNT`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new ForEachCursor("P002E5", "SELECT `TBM31_CRF_ID`, `TBM31_STUDY_ID`, `TBM31_CRT_DATETIME`, `TBM31_CRT_USER_ID`, `TBM31_CRT_PROG_NM`, `TBM31_UPD_CNT`, `TBM31_CRF_NM`, `TBM31_CRF_SNM`, `TBM31_GRID_SIZE`, `TBM31_ORDER`, `TBM31_DEF_VISIT_NO`, `TBM31_DEF_DOMAIN_CD`, `TBM31_STATUS`, `TBM31_NOTE`, `TBM31_DEL_FLG`, `TBM31_UPD_DATETIME`, `TBM31_UPD_USER_ID`, `TBM31_UPD_PROG_NM` FROM `TBM31_CRF` WHERE `TBM31_STUDY_ID` = ? and `TBM31_CRF_ID` = ? ORDER BY `TBM31_STUDY_ID`, `TBM31_CRF_ID`  FOR UPDATE ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P002E6", "UPDATE `TBM31_CRF` SET `TBM31_UPD_CNT`=?, `TBM31_CRF_NM`=?, `TBM31_CRF_SNM`=?, `TBM31_GRID_SIZE`=?, `TBM31_ORDER`=?, `TBM31_DEF_VISIT_NO`=?, `TBM31_DEF_DOMAIN_CD`=?, `TBM31_STATUS`=?, `TBM31_NOTE`=?, `TBM31_DEL_FLG`=?, `TBM31_UPD_DATETIME`=?, `TBM31_UPD_USER_ID`=?, `TBM31_UPD_PROG_NM`=?  WHERE `TBM31_STUDY_ID` = ? AND `TBM31_CRF_ID` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P002E7", "INSERT INTO `TBM31_CRF`(`TBM31_STUDY_ID`, `TBM31_CRF_ID`, `TBM31_CRF_NM`, `TBM31_CRF_SNM`, `TBM31_GRID_SIZE`, `TBM31_ORDER`, `TBM31_DEF_VISIT_NO`, `TBM31_DEF_DOMAIN_CD`, `TBM31_STATUS`, `TBM31_NOTE`, `TBM31_DEL_FLG`, `TBM31_CRT_DATETIME`, `TBM31_CRT_USER_ID`, `TBM31_CRT_PROG_NM`, `TBM31_UPD_DATETIME`, `TBM31_UPD_USER_ID`, `TBM31_UPD_PROG_NM`, `TBM31_UPD_CNT`, `TBM31_REPEAT_FLG`, `TBM31_REPEAT_MAX`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK)
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((long[]) buf[11])[0] = rslt.getLong(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 3 :
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
               ((int[]) buf[18])[0] = rslt.getInt(11) ;
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
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(2, (java.util.Date)parms[3], false);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[5], 128);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[7], 40);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(5, ((Number) parms[9]).longValue());
               }
               stmt.setLong(6, ((Number) parms[10]).longValue());
               stmt.setShort(7, ((Number) parms[11]).shortValue());
               stmt.setByte(8, ((Number) parms[12]).byteValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[4]).intValue());
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
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 4 :
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
                  stmt.setInt(6, ((Number) parms[11]).intValue());
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
               return;
            case 5 :
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
                  stmt.setInt(7, ((Number) parms[11]).intValue());
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
               return;
      }
   }

}

