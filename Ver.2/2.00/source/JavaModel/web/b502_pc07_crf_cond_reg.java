/*
               File: B502_PC07_CRF_COND_REG
        Description: CRF条件マスタ登録
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:12:52.70
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b502_pc07_crf_cond_reg extends GXProcedure
{
   public b502_pc07_crf_cond_reg( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b502_pc07_crf_cond_reg.class ), "" );
   }

   public b502_pc07_crf_cond_reg( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public GxObjectCollection executeUdp( String aP0 ,
                                         String aP1 ,
                                         String aP2 ,
                                         short[] aP3 )
   {
      b502_pc07_crf_cond_reg.this.AV11P_STUDY_ID = aP0;
      b502_pc07_crf_cond_reg.this.AV10P_CRF_ID = aP1;
      b502_pc07_crf_cond_reg.this.AV9P_CRF_COND = aP2;
      b502_pc07_crf_cond_reg.this.aP3 = aP3;
      b502_pc07_crf_cond_reg.this.AV25W_RTN_MSG = aP4[0];
      this.aP4 = aP4;
      b502_pc07_crf_cond_reg.this.aP4 = new GxObjectCollection[] {new GxObjectCollection()};
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
      b502_pc07_crf_cond_reg.this.AV11P_STUDY_ID = aP0;
      b502_pc07_crf_cond_reg.this.AV10P_CRF_ID = aP1;
      b502_pc07_crf_cond_reg.this.AV9P_CRF_COND = aP2;
      b502_pc07_crf_cond_reg.this.aP3 = aP3;
      b502_pc07_crf_cond_reg.this.AV25W_RTN_MSG = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8C_APP_ID = "B502" ;
      AV24W_RTN_CD = (short)(0) ;
      GXt_char1 = AV22W_NEWLINE ;
      GXv_char2[0] = GXt_char1 ;
      new b802_pc02_nl_airres(remoteHandle, context).execute( GXv_char2) ;
      b502_pc07_crf_cond_reg.this.GXt_char1 = GXv_char2[0] ;
      AV22W_NEWLINE = GXt_char1 ;
      AV19W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV19W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV8C_APP_ID );
      GXt_char1 = AV28W_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      b502_pc07_crf_cond_reg.this.GXt_char1 = GXv_char2[0] ;
      AV28W_USER_ID = GXt_char1 ;
      AV29W_UPDATE_TIME = GXutil.now( ) ;
      /* Execute user subroutine: S121 */
      S121 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      GXt_objcol_char3 = AV16W_CSV_ROW ;
      GXv_objcol_char4[0] = GXt_objcol_char3 ;
      new b807_pc01_csv_row_parse(remoteHandle, context).execute( AV9P_CRF_COND, GXv_objcol_char4) ;
      GXt_objcol_char3 = GXv_objcol_char4[0] ;
      AV16W_CSV_ROW = GXt_objcol_char3 ;
      AV12W_CNT = 1 ;
      while ( AV12W_CNT <= AV16W_CSV_ROW.size() )
      {
         AV17W_ERR_CD = (short)(0) ;
         GXv_objcol_char4[0] = AV15W_CSV_COL ;
         GXv_int5[0] = AV17W_ERR_CD ;
         GXv_char2[0] = AV21W_MSG ;
         new b807_pc02_csv_col_parse_air(remoteHandle, context).execute( (String)AV16W_CSV_ROW.elementAt(-1+(int)(AV12W_CNT)), 14, "CSV", GXv_objcol_char4, GXv_int5, GXv_char2) ;
         AV15W_CSV_COL = GXv_objcol_char4[0] ;
         b502_pc07_crf_cond_reg.this.AV17W_ERR_CD = GXv_int5[0] ;
         b502_pc07_crf_cond_reg.this.AV21W_MSG = GXv_char2[0] ;
         if ( AV17W_ERR_CD == 0 )
         {
            if ( ! (GXutil.strcmp("", AV11P_STUDY_ID)==0) && ( GXutil.strcmp(AV11P_STUDY_ID, (String)AV15W_CSV_COL.elementAt(-1+1)) != 0 ) )
            {
               AV17W_ERR_CD = (short)(1) ;
               GXt_char1 = AV21W_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AE00063", "試験", "", "", "", "", GXv_char2) ;
               b502_pc07_crf_cond_reg.this.GXt_char1 = GXv_char2[0] ;
               AV21W_MSG = GXt_char1 ;
            }
            if ( ! (GXutil.strcmp("", AV10P_CRF_ID)==0) && ( GXutil.strcmp(AV10P_CRF_ID, (String)AV15W_CSV_COL.elementAt(-1+2)) != 0 ) )
            {
               AV17W_ERR_CD = (short)(1) ;
               GXt_char1 = AV21W_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AE00063", "CRF", "", "", "", "", GXv_char2) ;
               b502_pc07_crf_cond_reg.this.GXt_char1 = GXv_char2[0] ;
               AV21W_MSG = GXt_char1 ;
            }
         }
         if ( AV17W_ERR_CD != 0 )
         {
            AV24W_RTN_CD = (short)(1) ;
            AV21W_MSG = "CRF条件マスタ：" + GXutil.trim( GXutil.str( AV12W_CNT, 10, 0)) + "行目：" + AV21W_MSG ;
            AV25W_RTN_MSG.add(AV21W_MSG, 0);
         }
         if ( AV24W_RTN_CD == 0 )
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
         if ( ( AV24W_RTN_CD != 0 ) && ( AV25W_RTN_MSG.size() > AV20W_MAX_ERROR_COUNT ) )
         {
            GXt_char1 = AV21W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00044", GXutil.trim( GXutil.str( AV20W_MAX_ERROR_COUNT, 10, 0)), "", "", "", "", GXv_char2) ;
            b502_pc07_crf_cond_reg.this.GXt_char1 = GXv_char2[0] ;
            AV21W_MSG = GXt_char1 ;
            AV25W_RTN_MSG.add(AV21W_MSG, 0);
            if (true) break;
         }
         AV12W_CNT = (long)(AV12W_CNT+1) ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_REG' Routine */
      AV26W_STUDY_ID = GXutil.lval( (String)AV15W_CSV_COL.elementAt(-1+1)) ;
      AV14W_CRF_ID = (short)(GXutil.lval( (String)AV15W_CSV_COL.elementAt(-1+2))) ;
      AV13W_COND_NO = (short)(GXutil.lval( (String)AV15W_CSV_COL.elementAt(-1+3))) ;
      AV31W_CRT_DATETIME = AV29W_UPDATE_TIME ;
      AV32W_CRT_USER_ID = AV28W_USER_ID ;
      AV33W_CRT_PROG_NM = AV41Pgmname ;
      AV34W_UPD_DATETIME = AV29W_UPDATE_TIME ;
      AV35W_UPD_USER_ID = AV28W_USER_ID ;
      AV36W_UPD_PROG_NM = AV41Pgmname ;
      AV30W_UPD_CNT = 1 ;
      AV42GXLvl89 = (byte)(0) ;
      Gx_ope = "Fetch" ;
      Gx_etb = "TBM33_CRF_COND" ;
      /* Using cursor P002G2 */
      pr_default.execute(0, new Object[] {new Long(AV26W_STUDY_ID), new Short(AV14W_CRF_ID), new Short(AV13W_COND_NO)});
      if ( Gx_err != 0 )
      {
         AV42GXLvl89 = (byte)(1) ;
      }
      while ( (pr_default.getStatus(0) != 101) )
      {
         A78TBM33_COND_NO = P002G2_A78TBM33_COND_NO[0] ;
         A77TBM33_CRF_ID = P002G2_A77TBM33_CRF_ID[0] ;
         A76TBM33_STUDY_ID = P002G2_A76TBM33_STUDY_ID[0] ;
         A417TBM33_CRT_DATETIME = P002G2_A417TBM33_CRT_DATETIME[0] ;
         n417TBM33_CRT_DATETIME = P002G2_n417TBM33_CRT_DATETIME[0] ;
         A418TBM33_CRT_USER_ID = P002G2_A418TBM33_CRT_USER_ID[0] ;
         n418TBM33_CRT_USER_ID = P002G2_n418TBM33_CRT_USER_ID[0] ;
         A419TBM33_CRT_PROG_NM = P002G2_A419TBM33_CRT_PROG_NM[0] ;
         n419TBM33_CRT_PROG_NM = P002G2_n419TBM33_CRT_PROG_NM[0] ;
         A423TBM33_UPD_CNT = P002G2_A423TBM33_UPD_CNT[0] ;
         n423TBM33_UPD_CNT = P002G2_n423TBM33_UPD_CNT[0] ;
         A502TBM33_COND_NM = P002G2_A502TBM33_COND_NM[0] ;
         n502TBM33_COND_NM = P002G2_n502TBM33_COND_NM[0] ;
         A414TBM33_EXPRESSION = P002G2_A414TBM33_EXPRESSION[0] ;
         n414TBM33_EXPRESSION = P002G2_n414TBM33_EXPRESSION[0] ;
         A503TBM33_COND_DIV = P002G2_A503TBM33_COND_DIV[0] ;
         n503TBM33_COND_DIV = P002G2_n503TBM33_COND_DIV[0] ;
         A504TBM33_CRF_ITEM_CD = P002G2_A504TBM33_CRF_ITEM_CD[0] ;
         n504TBM33_CRF_ITEM_CD = P002G2_n504TBM33_CRF_ITEM_CD[0] ;
         A415TBM33_PRIOR_NO = P002G2_A415TBM33_PRIOR_NO[0] ;
         n415TBM33_PRIOR_NO = P002G2_n415TBM33_PRIOR_NO[0] ;
         A505TBM33_ERR_DIV = P002G2_A505TBM33_ERR_DIV[0] ;
         n505TBM33_ERR_DIV = P002G2_n505TBM33_ERR_DIV[0] ;
         A506TBM33_ERR_MSG = P002G2_A506TBM33_ERR_MSG[0] ;
         n506TBM33_ERR_MSG = P002G2_n506TBM33_ERR_MSG[0] ;
         A646TBM33_ENABLED_FLG = P002G2_A646TBM33_ENABLED_FLG[0] ;
         n646TBM33_ENABLED_FLG = P002G2_n646TBM33_ENABLED_FLG[0] ;
         A696TBM33_REQUIRED_INPUT_FLG = P002G2_A696TBM33_REQUIRED_INPUT_FLG[0] ;
         n696TBM33_REQUIRED_INPUT_FLG = P002G2_n696TBM33_REQUIRED_INPUT_FLG[0] ;
         A697TBM33_NUMERIC_RANGE_FLG = P002G2_A697TBM33_NUMERIC_RANGE_FLG[0] ;
         n697TBM33_NUMERIC_RANGE_FLG = P002G2_n697TBM33_NUMERIC_RANGE_FLG[0] ;
         A416TBM33_DEL_FLG = P002G2_A416TBM33_DEL_FLG[0] ;
         n416TBM33_DEL_FLG = P002G2_n416TBM33_DEL_FLG[0] ;
         A420TBM33_UPD_DATETIME = P002G2_A420TBM33_UPD_DATETIME[0] ;
         n420TBM33_UPD_DATETIME = P002G2_n420TBM33_UPD_DATETIME[0] ;
         A421TBM33_UPD_USER_ID = P002G2_A421TBM33_UPD_USER_ID[0] ;
         n421TBM33_UPD_USER_ID = P002G2_n421TBM33_UPD_USER_ID[0] ;
         A422TBM33_UPD_PROG_NM = P002G2_A422TBM33_UPD_PROG_NM[0] ;
         n422TBM33_UPD_PROG_NM = P002G2_n422TBM33_UPD_PROG_NM[0] ;
         AV42GXLvl89 = (byte)(1) ;
         AV38P_LOGKBN = "UPD" ;
         AV31W_CRT_DATETIME = A417TBM33_CRT_DATETIME ;
         AV32W_CRT_USER_ID = A418TBM33_CRT_USER_ID ;
         AV33W_CRT_PROG_NM = A419TBM33_CRT_PROG_NM ;
         AV30W_UPD_CNT = (long)(A423TBM33_UPD_CNT+1) ;
         A502TBM33_COND_NM = (String)AV15W_CSV_COL.elementAt(-1+4) ;
         n502TBM33_COND_NM = false ;
         A414TBM33_EXPRESSION = (String)AV15W_CSV_COL.elementAt(-1+5) ;
         n414TBM33_EXPRESSION = false ;
         A503TBM33_COND_DIV = (String)AV15W_CSV_COL.elementAt(-1+6) ;
         n503TBM33_COND_DIV = false ;
         A504TBM33_CRF_ITEM_CD = (String)AV15W_CSV_COL.elementAt(-1+7) ;
         n504TBM33_CRF_ITEM_CD = false ;
         A415TBM33_PRIOR_NO = (byte)(GXutil.lval( (String)AV15W_CSV_COL.elementAt(-1+8))) ;
         n415TBM33_PRIOR_NO = false ;
         A505TBM33_ERR_DIV = (String)AV15W_CSV_COL.elementAt(-1+9) ;
         n505TBM33_ERR_DIV = false ;
         A506TBM33_ERR_MSG = (String)AV15W_CSV_COL.elementAt(-1+10) ;
         n506TBM33_ERR_MSG = false ;
         A646TBM33_ENABLED_FLG = (String)AV15W_CSV_COL.elementAt(-1+11) ;
         n646TBM33_ENABLED_FLG = false ;
         A696TBM33_REQUIRED_INPUT_FLG = (String)AV15W_CSV_COL.elementAt(-1+12) ;
         n696TBM33_REQUIRED_INPUT_FLG = false ;
         A697TBM33_NUMERIC_RANGE_FLG = (String)AV15W_CSV_COL.elementAt(-1+13) ;
         n697TBM33_NUMERIC_RANGE_FLG = false ;
         A416TBM33_DEL_FLG = (String)AV15W_CSV_COL.elementAt(-1+14) ;
         n416TBM33_DEL_FLG = false ;
         A420TBM33_UPD_DATETIME = GXutil.now( ) ;
         n420TBM33_UPD_DATETIME = false ;
         A421TBM33_UPD_USER_ID = AV28W_USER_ID ;
         n421TBM33_UPD_USER_ID = false ;
         A422TBM33_UPD_PROG_NM = AV41Pgmname ;
         n422TBM33_UPD_PROG_NM = false ;
         A423TBM33_UPD_CNT = AV30W_UPD_CNT ;
         n423TBM33_UPD_CNT = false ;
         Gx_ope = "Update" ;
         Gx_etb = "TBM33_CRF_COND" ;
         /* Using cursor P002G3 */
         pr_default.execute(1, new Object[] {new Boolean(n423TBM33_UPD_CNT), new Long(A423TBM33_UPD_CNT), new Boolean(n502TBM33_COND_NM), A502TBM33_COND_NM, new Boolean(n414TBM33_EXPRESSION), A414TBM33_EXPRESSION, new Boolean(n503TBM33_COND_DIV), A503TBM33_COND_DIV, new Boolean(n504TBM33_CRF_ITEM_CD), A504TBM33_CRF_ITEM_CD, new Boolean(n415TBM33_PRIOR_NO), new Byte(A415TBM33_PRIOR_NO), new Boolean(n505TBM33_ERR_DIV), A505TBM33_ERR_DIV, new Boolean(n506TBM33_ERR_MSG), A506TBM33_ERR_MSG, new Boolean(n646TBM33_ENABLED_FLG), A646TBM33_ENABLED_FLG, new Boolean(n696TBM33_REQUIRED_INPUT_FLG), A696TBM33_REQUIRED_INPUT_FLG, new Boolean(n697TBM33_NUMERIC_RANGE_FLG), A697TBM33_NUMERIC_RANGE_FLG, new Boolean(n416TBM33_DEL_FLG), A416TBM33_DEL_FLG, new Boolean(n420TBM33_UPD_DATETIME), A420TBM33_UPD_DATETIME, new Boolean(n421TBM33_UPD_USER_ID), A421TBM33_UPD_USER_ID, new Boolean(n422TBM33_UPD_PROG_NM), A422TBM33_UPD_PROG_NM, new Long(A76TBM33_STUDY_ID), new Short(A77TBM33_CRF_ID), new Short(A78TBM33_COND_NO)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM33_CRF_COND") ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV42GXLvl89 == 0 )
      {
         AV38P_LOGKBN = "INS" ;
         /*
            INSERT RECORD ON TABLE TBM33_CRF_COND

         */
         A76TBM33_STUDY_ID = GXutil.lval( (String)AV15W_CSV_COL.elementAt(-1+1)) ;
         A77TBM33_CRF_ID = (short)(GXutil.lval( (String)AV15W_CSV_COL.elementAt(-1+2))) ;
         A78TBM33_COND_NO = (short)(GXutil.lval( (String)AV15W_CSV_COL.elementAt(-1+3))) ;
         A502TBM33_COND_NM = (String)AV15W_CSV_COL.elementAt(-1+4) ;
         n502TBM33_COND_NM = false ;
         A414TBM33_EXPRESSION = (String)AV15W_CSV_COL.elementAt(-1+5) ;
         n414TBM33_EXPRESSION = false ;
         A503TBM33_COND_DIV = (String)AV15W_CSV_COL.elementAt(-1+6) ;
         n503TBM33_COND_DIV = false ;
         A504TBM33_CRF_ITEM_CD = (String)AV15W_CSV_COL.elementAt(-1+7) ;
         n504TBM33_CRF_ITEM_CD = false ;
         A415TBM33_PRIOR_NO = (byte)(GXutil.lval( (String)AV15W_CSV_COL.elementAt(-1+8))) ;
         n415TBM33_PRIOR_NO = false ;
         A505TBM33_ERR_DIV = (String)AV15W_CSV_COL.elementAt(-1+9) ;
         n505TBM33_ERR_DIV = false ;
         A506TBM33_ERR_MSG = (String)AV15W_CSV_COL.elementAt(-1+10) ;
         n506TBM33_ERR_MSG = false ;
         A646TBM33_ENABLED_FLG = (String)AV15W_CSV_COL.elementAt(-1+11) ;
         n646TBM33_ENABLED_FLG = false ;
         A696TBM33_REQUIRED_INPUT_FLG = (String)AV15W_CSV_COL.elementAt(-1+12) ;
         n696TBM33_REQUIRED_INPUT_FLG = false ;
         A697TBM33_NUMERIC_RANGE_FLG = (String)AV15W_CSV_COL.elementAt(-1+13) ;
         n697TBM33_NUMERIC_RANGE_FLG = false ;
         A416TBM33_DEL_FLG = (String)AV15W_CSV_COL.elementAt(-1+14) ;
         n416TBM33_DEL_FLG = false ;
         A417TBM33_CRT_DATETIME = GXutil.now( ) ;
         n417TBM33_CRT_DATETIME = false ;
         A418TBM33_CRT_USER_ID = AV28W_USER_ID ;
         n418TBM33_CRT_USER_ID = false ;
         A419TBM33_CRT_PROG_NM = AV41Pgmname ;
         n419TBM33_CRT_PROG_NM = false ;
         A420TBM33_UPD_DATETIME = GXutil.now( ) ;
         n420TBM33_UPD_DATETIME = false ;
         A421TBM33_UPD_USER_ID = AV28W_USER_ID ;
         n421TBM33_UPD_USER_ID = false ;
         A422TBM33_UPD_PROG_NM = AV41Pgmname ;
         n422TBM33_UPD_PROG_NM = false ;
         A423TBM33_UPD_CNT = 1 ;
         n423TBM33_UPD_CNT = false ;
         Gx_ope = "Insert" ;
         Gx_etb = "TBM33_CRF_COND" ;
         /* Using cursor P002G4 */
         pr_default.execute(2, new Object[] {new Long(A76TBM33_STUDY_ID), new Short(A77TBM33_CRF_ID), new Short(A78TBM33_COND_NO), new Boolean(n502TBM33_COND_NM), A502TBM33_COND_NM, new Boolean(n414TBM33_EXPRESSION), A414TBM33_EXPRESSION, new Boolean(n503TBM33_COND_DIV), A503TBM33_COND_DIV, new Boolean(n504TBM33_CRF_ITEM_CD), A504TBM33_CRF_ITEM_CD, new Boolean(n415TBM33_PRIOR_NO), new Byte(A415TBM33_PRIOR_NO), new Boolean(n505TBM33_ERR_DIV), A505TBM33_ERR_DIV, new Boolean(n506TBM33_ERR_MSG), A506TBM33_ERR_MSG, new Boolean(n646TBM33_ENABLED_FLG), A646TBM33_ENABLED_FLG, new Boolean(n696TBM33_REQUIRED_INPUT_FLG), A696TBM33_REQUIRED_INPUT_FLG, new Boolean(n697TBM33_NUMERIC_RANGE_FLG), A697TBM33_NUMERIC_RANGE_FLG, new Boolean(n416TBM33_DEL_FLG), A416TBM33_DEL_FLG, new Boolean(n417TBM33_CRT_DATETIME), A417TBM33_CRT_DATETIME, new Boolean(n418TBM33_CRT_USER_ID), A418TBM33_CRT_USER_ID, new Boolean(n419TBM33_CRT_PROG_NM), A419TBM33_CRT_PROG_NM, new Boolean(n420TBM33_UPD_DATETIME), A420TBM33_UPD_DATETIME, new Boolean(n421TBM33_UPD_USER_ID), A421TBM33_UPD_USER_ID, new Boolean(n422TBM33_UPD_PROG_NM), A422TBM33_UPD_PROG_NM, new Boolean(n423TBM33_UPD_CNT), new Long(A423TBM33_UPD_CNT)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM33_CRF_COND") ;
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
      if ( AV24W_RTN_CD == 0 )
      {
         new b808_pc02_data_log(remoteHandle, context).execute( AV41Pgmname, AV38P_LOGKBN, "TBM33_CRF_COND", AV15W_CSV_COL, AV31W_CRT_DATETIME, AV32W_CRT_USER_ID, AV33W_CRT_PROG_NM, AV34W_UPD_DATETIME, AV35W_UPD_USER_ID, AV36W_UPD_PROG_NM, AV30W_UPD_CNT) ;
      }
   }

   public void S121( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXt_char1 = AV27W_SYS_VALUE ;
      GXv_char2[0] = GXt_char1 ;
      new b806_pc01_get_ctrl_val(remoteHandle, context).execute( "015", GXv_char2) ;
      b502_pc07_crf_cond_reg.this.GXt_char1 = GXv_char2[0] ;
      AV27W_SYS_VALUE = GXt_char1 ;
      AV20W_MAX_ERROR_COUNT = (long)((GxRegex.IsMatch(AV27W_SYS_VALUE,"^\\d+$") ? GXutil.val( AV27W_SYS_VALUE, ".") : 100)) ;
      AV19W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      AV23W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV23W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_STUDY_ID" );
      AV23W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV11P_STUDY_ID );
      AV19W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV23W_PARMS_ITEM, 0);
      AV23W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV23W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_CRF_ID" );
      AV23W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV10P_CRF_ID );
      AV19W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV23W_PARMS_ITEM, 0);
      AV23W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV23W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_CRF_COND" );
      AV23W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV9P_CRF_COND );
      AV19W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV23W_PARMS_ITEM, 0);
      AV21W_MSG = "SUB_INIT" ;
      GXv_SdtB808_SD01_EXTRA_INFO6[0] = AV19W_EXTRA_INFO;
      GXv_int5[0] = AV17W_ERR_CD ;
      GXv_char2[0] = AV18W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV41Pgmname, (short)(1), AV21W_MSG, GXv_SdtB808_SD01_EXTRA_INFO6, GXv_int5, GXv_char2) ;
      AV19W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO6[0] ;
      b502_pc07_crf_cond_reg.this.AV17W_ERR_CD = GXv_int5[0] ;
      b502_pc07_crf_cond_reg.this.AV18W_ERR_MSG = GXv_char2[0] ;
   }

   public void S131( )
   {
      /* 'SUB_ERROR' Routine */
      AV21W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO6[0] = AV19W_EXTRA_INFO;
      GXv_int5[0] = AV24W_RTN_CD ;
      GXv_char2[0] = AV18W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV41Pgmname, (short)(0), AV21W_MSG, GXv_SdtB808_SD01_EXTRA_INFO6, GXv_int5, GXv_char2) ;
      AV19W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO6[0] ;
      b502_pc07_crf_cond_reg.this.AV24W_RTN_CD = GXv_int5[0] ;
      b502_pc07_crf_cond_reg.this.AV18W_ERR_MSG = GXv_char2[0] ;
      AV25W_RTN_MSG.add(AV18W_ERR_MSG, 0);
      context.globals.Gx_eop = (byte)(0) ;
   }

   protected void cleanup( )
   {
      this.aP3[0] = b502_pc07_crf_cond_reg.this.AV24W_RTN_CD;
      this.aP4[0] = b502_pc07_crf_cond_reg.this.AV25W_RTN_MSG;
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
      AV22W_NEWLINE = "" ;
      AV19W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV28W_USER_ID = "" ;
      AV29W_UPDATE_TIME = GXutil.resetTime( GXutil.nullDate() );
      AV16W_CSV_ROW = new GxObjectCollection(String.class, "internal", "");
      GXt_objcol_char3 = new GxObjectCollection(String.class, "internal", "");
      AV15W_CSV_COL = new GxObjectCollection(String.class, "internal", "");
      GXv_objcol_char4 = new GxObjectCollection [1] ;
      AV21W_MSG = "" ;
      A417TBM33_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A418TBM33_CRT_USER_ID = "" ;
      A419TBM33_CRT_PROG_NM = "" ;
      A502TBM33_COND_NM = "" ;
      A414TBM33_EXPRESSION = "" ;
      A503TBM33_COND_DIV = "" ;
      A504TBM33_CRF_ITEM_CD = "" ;
      A505TBM33_ERR_DIV = "" ;
      A506TBM33_ERR_MSG = "" ;
      A646TBM33_ENABLED_FLG = "" ;
      A696TBM33_REQUIRED_INPUT_FLG = "" ;
      A697TBM33_NUMERIC_RANGE_FLG = "" ;
      A416TBM33_DEL_FLG = "" ;
      A420TBM33_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A421TBM33_UPD_USER_ID = "" ;
      A422TBM33_UPD_PROG_NM = "" ;
      AV31W_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      AV32W_CRT_USER_ID = "" ;
      AV33W_CRT_PROG_NM = "" ;
      AV41Pgmname = "" ;
      AV34W_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      AV35W_UPD_USER_ID = "" ;
      AV36W_UPD_PROG_NM = "" ;
      scmdbuf = "" ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      P002G2_A78TBM33_COND_NO = new short[1] ;
      P002G2_A77TBM33_CRF_ID = new short[1] ;
      P002G2_A76TBM33_STUDY_ID = new long[1] ;
      P002G2_A417TBM33_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P002G2_n417TBM33_CRT_DATETIME = new boolean[] {false} ;
      P002G2_A418TBM33_CRT_USER_ID = new String[] {""} ;
      P002G2_n418TBM33_CRT_USER_ID = new boolean[] {false} ;
      P002G2_A419TBM33_CRT_PROG_NM = new String[] {""} ;
      P002G2_n419TBM33_CRT_PROG_NM = new boolean[] {false} ;
      P002G2_A423TBM33_UPD_CNT = new long[1] ;
      P002G2_n423TBM33_UPD_CNT = new boolean[] {false} ;
      P002G2_A502TBM33_COND_NM = new String[] {""} ;
      P002G2_n502TBM33_COND_NM = new boolean[] {false} ;
      P002G2_A414TBM33_EXPRESSION = new String[] {""} ;
      P002G2_n414TBM33_EXPRESSION = new boolean[] {false} ;
      P002G2_A503TBM33_COND_DIV = new String[] {""} ;
      P002G2_n503TBM33_COND_DIV = new boolean[] {false} ;
      P002G2_A504TBM33_CRF_ITEM_CD = new String[] {""} ;
      P002G2_n504TBM33_CRF_ITEM_CD = new boolean[] {false} ;
      P002G2_A415TBM33_PRIOR_NO = new byte[1] ;
      P002G2_n415TBM33_PRIOR_NO = new boolean[] {false} ;
      P002G2_A505TBM33_ERR_DIV = new String[] {""} ;
      P002G2_n505TBM33_ERR_DIV = new boolean[] {false} ;
      P002G2_A506TBM33_ERR_MSG = new String[] {""} ;
      P002G2_n506TBM33_ERR_MSG = new boolean[] {false} ;
      P002G2_A646TBM33_ENABLED_FLG = new String[] {""} ;
      P002G2_n646TBM33_ENABLED_FLG = new boolean[] {false} ;
      P002G2_A696TBM33_REQUIRED_INPUT_FLG = new String[] {""} ;
      P002G2_n696TBM33_REQUIRED_INPUT_FLG = new boolean[] {false} ;
      P002G2_A697TBM33_NUMERIC_RANGE_FLG = new String[] {""} ;
      P002G2_n697TBM33_NUMERIC_RANGE_FLG = new boolean[] {false} ;
      P002G2_A416TBM33_DEL_FLG = new String[] {""} ;
      P002G2_n416TBM33_DEL_FLG = new boolean[] {false} ;
      P002G2_A420TBM33_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P002G2_n420TBM33_UPD_DATETIME = new boolean[] {false} ;
      P002G2_A421TBM33_UPD_USER_ID = new String[] {""} ;
      P002G2_n421TBM33_UPD_USER_ID = new boolean[] {false} ;
      P002G2_A422TBM33_UPD_PROG_NM = new String[] {""} ;
      P002G2_n422TBM33_UPD_PROG_NM = new boolean[] {false} ;
      AV38P_LOGKBN = "" ;
      Gx_emsg = "" ;
      AV27W_SYS_VALUE = "" ;
      GXt_char1 = "" ;
      AV23W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV18W_ERR_MSG = "" ;
      GXv_SdtB808_SD01_EXTRA_INFO6 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int5 = new short [1] ;
      GXv_char2 = new String [1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b502_pc07_crf_cond_reg__default(),
         new Object[] {
             new Object[] {
            P002G2_A78TBM33_COND_NO, P002G2_A77TBM33_CRF_ID, P002G2_A76TBM33_STUDY_ID, P002G2_A417TBM33_CRT_DATETIME, P002G2_n417TBM33_CRT_DATETIME, P002G2_A418TBM33_CRT_USER_ID, P002G2_n418TBM33_CRT_USER_ID, P002G2_A419TBM33_CRT_PROG_NM, P002G2_n419TBM33_CRT_PROG_NM, P002G2_A423TBM33_UPD_CNT,
            P002G2_n423TBM33_UPD_CNT, P002G2_A502TBM33_COND_NM, P002G2_n502TBM33_COND_NM, P002G2_A414TBM33_EXPRESSION, P002G2_n414TBM33_EXPRESSION, P002G2_A503TBM33_COND_DIV, P002G2_n503TBM33_COND_DIV, P002G2_A504TBM33_CRF_ITEM_CD, P002G2_n504TBM33_CRF_ITEM_CD, P002G2_A415TBM33_PRIOR_NO,
            P002G2_n415TBM33_PRIOR_NO, P002G2_A505TBM33_ERR_DIV, P002G2_n505TBM33_ERR_DIV, P002G2_A506TBM33_ERR_MSG, P002G2_n506TBM33_ERR_MSG, P002G2_A646TBM33_ENABLED_FLG, P002G2_n646TBM33_ENABLED_FLG, P002G2_A696TBM33_REQUIRED_INPUT_FLG, P002G2_n696TBM33_REQUIRED_INPUT_FLG, P002G2_A697TBM33_NUMERIC_RANGE_FLG,
            P002G2_n697TBM33_NUMERIC_RANGE_FLG, P002G2_A416TBM33_DEL_FLG, P002G2_n416TBM33_DEL_FLG, P002G2_A420TBM33_UPD_DATETIME, P002G2_n420TBM33_UPD_DATETIME, P002G2_A421TBM33_UPD_USER_ID, P002G2_n421TBM33_UPD_USER_ID, P002G2_A422TBM33_UPD_PROG_NM, P002G2_n422TBM33_UPD_PROG_NM
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV41Pgmname = "B502_PC07_CRF_COND_REG" ;
      /* GeneXus formulas. */
      AV41Pgmname = "B502_PC07_CRF_COND_REG" ;
      Gx_err = (short)(0) ;
   }

   private byte A415TBM33_PRIOR_NO ;
   private byte AV42GXLvl89 ;
   private short AV24W_RTN_CD ;
   private short AV17W_ERR_CD ;
   private short AV14W_CRF_ID ;
   private short AV13W_COND_NO ;
   private short Gx_err ;
   private short A78TBM33_COND_NO ;
   private short A77TBM33_CRF_ID ;
   private short GXv_int5[] ;
   private int GX_INS20 ;
   private int GXActiveErrHndl ;
   private long AV12W_CNT ;
   private long AV20W_MAX_ERROR_COUNT ;
   private long A423TBM33_UPD_CNT ;
   private long AV26W_STUDY_ID ;
   private long AV30W_UPD_CNT ;
   private long A76TBM33_STUDY_ID ;
   private String AV41Pgmname ;
   private String scmdbuf ;
   private String Gx_ope ;
   private String Gx_etb ;
   private String Gx_emsg ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private java.util.Date AV29W_UPDATE_TIME ;
   private java.util.Date A417TBM33_CRT_DATETIME ;
   private java.util.Date A420TBM33_UPD_DATETIME ;
   private java.util.Date AV31W_CRT_DATETIME ;
   private java.util.Date AV34W_UPD_DATETIME ;
   private boolean returnInSub ;
   private boolean n417TBM33_CRT_DATETIME ;
   private boolean n418TBM33_CRT_USER_ID ;
   private boolean n419TBM33_CRT_PROG_NM ;
   private boolean n423TBM33_UPD_CNT ;
   private boolean n502TBM33_COND_NM ;
   private boolean n414TBM33_EXPRESSION ;
   private boolean n503TBM33_COND_DIV ;
   private boolean n504TBM33_CRF_ITEM_CD ;
   private boolean n415TBM33_PRIOR_NO ;
   private boolean n505TBM33_ERR_DIV ;
   private boolean n506TBM33_ERR_MSG ;
   private boolean n646TBM33_ENABLED_FLG ;
   private boolean n696TBM33_REQUIRED_INPUT_FLG ;
   private boolean n697TBM33_NUMERIC_RANGE_FLG ;
   private boolean n416TBM33_DEL_FLG ;
   private boolean n420TBM33_UPD_DATETIME ;
   private boolean n421TBM33_UPD_USER_ID ;
   private boolean n422TBM33_UPD_PROG_NM ;
   private String AV11P_STUDY_ID ;
   private String AV10P_CRF_ID ;
   private String AV9P_CRF_COND ;
   private String AV8C_APP_ID ;
   private String AV22W_NEWLINE ;
   private String AV28W_USER_ID ;
   private String AV21W_MSG ;
   private String A418TBM33_CRT_USER_ID ;
   private String A419TBM33_CRT_PROG_NM ;
   private String A502TBM33_COND_NM ;
   private String A414TBM33_EXPRESSION ;
   private String A503TBM33_COND_DIV ;
   private String A504TBM33_CRF_ITEM_CD ;
   private String A505TBM33_ERR_DIV ;
   private String A506TBM33_ERR_MSG ;
   private String A646TBM33_ENABLED_FLG ;
   private String A696TBM33_REQUIRED_INPUT_FLG ;
   private String A697TBM33_NUMERIC_RANGE_FLG ;
   private String A416TBM33_DEL_FLG ;
   private String A421TBM33_UPD_USER_ID ;
   private String A422TBM33_UPD_PROG_NM ;
   private String AV32W_CRT_USER_ID ;
   private String AV33W_CRT_PROG_NM ;
   private String AV35W_UPD_USER_ID ;
   private String AV36W_UPD_PROG_NM ;
   private String AV38P_LOGKBN ;
   private String AV27W_SYS_VALUE ;
   private String AV18W_ERR_MSG ;
   private short[] aP3 ;
   private GxObjectCollection[] aP4 ;
   private IDataStoreProvider pr_default ;
   private short[] P002G2_A78TBM33_COND_NO ;
   private short[] P002G2_A77TBM33_CRF_ID ;
   private long[] P002G2_A76TBM33_STUDY_ID ;
   private java.util.Date[] P002G2_A417TBM33_CRT_DATETIME ;
   private boolean[] P002G2_n417TBM33_CRT_DATETIME ;
   private String[] P002G2_A418TBM33_CRT_USER_ID ;
   private boolean[] P002G2_n418TBM33_CRT_USER_ID ;
   private String[] P002G2_A419TBM33_CRT_PROG_NM ;
   private boolean[] P002G2_n419TBM33_CRT_PROG_NM ;
   private long[] P002G2_A423TBM33_UPD_CNT ;
   private boolean[] P002G2_n423TBM33_UPD_CNT ;
   private String[] P002G2_A502TBM33_COND_NM ;
   private boolean[] P002G2_n502TBM33_COND_NM ;
   private String[] P002G2_A414TBM33_EXPRESSION ;
   private boolean[] P002G2_n414TBM33_EXPRESSION ;
   private String[] P002G2_A503TBM33_COND_DIV ;
   private boolean[] P002G2_n503TBM33_COND_DIV ;
   private String[] P002G2_A504TBM33_CRF_ITEM_CD ;
   private boolean[] P002G2_n504TBM33_CRF_ITEM_CD ;
   private byte[] P002G2_A415TBM33_PRIOR_NO ;
   private boolean[] P002G2_n415TBM33_PRIOR_NO ;
   private String[] P002G2_A505TBM33_ERR_DIV ;
   private boolean[] P002G2_n505TBM33_ERR_DIV ;
   private String[] P002G2_A506TBM33_ERR_MSG ;
   private boolean[] P002G2_n506TBM33_ERR_MSG ;
   private String[] P002G2_A646TBM33_ENABLED_FLG ;
   private boolean[] P002G2_n646TBM33_ENABLED_FLG ;
   private String[] P002G2_A696TBM33_REQUIRED_INPUT_FLG ;
   private boolean[] P002G2_n696TBM33_REQUIRED_INPUT_FLG ;
   private String[] P002G2_A697TBM33_NUMERIC_RANGE_FLG ;
   private boolean[] P002G2_n697TBM33_NUMERIC_RANGE_FLG ;
   private String[] P002G2_A416TBM33_DEL_FLG ;
   private boolean[] P002G2_n416TBM33_DEL_FLG ;
   private java.util.Date[] P002G2_A420TBM33_UPD_DATETIME ;
   private boolean[] P002G2_n420TBM33_UPD_DATETIME ;
   private String[] P002G2_A421TBM33_UPD_USER_ID ;
   private boolean[] P002G2_n421TBM33_UPD_USER_ID ;
   private String[] P002G2_A422TBM33_UPD_PROG_NM ;
   private boolean[] P002G2_n422TBM33_UPD_PROG_NM ;
   private GxObjectCollection AV25W_RTN_MSG ;
   private GxObjectCollection AV16W_CSV_ROW ;
   private GxObjectCollection GXt_objcol_char3 ;
   private GxObjectCollection AV15W_CSV_COL ;
   private GxObjectCollection GXv_objcol_char4[] ;
   private SdtB808_SD01_EXTRA_INFO AV19W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO6[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV23W_PARMS_ITEM ;
}

final  class b502_pc07_crf_cond_reg__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P002G2", "SELECT `TBM33_COND_NO`, `TBM33_CRF_ID`, `TBM33_STUDY_ID`, `TBM33_CRT_DATETIME`, `TBM33_CRT_USER_ID`, `TBM33_CRT_PROG_NM`, `TBM33_UPD_CNT`, `TBM33_COND_NM`, `TBM33_EXPRESSION`, `TBM33_COND_DIV`, `TBM33_CRF_ITEM_CD`, `TBM33_PRIOR_NO`, `TBM33_ERR_DIV`, `TBM33_ERR_MSG`, `TBM33_ENABLED_FLG`, `TBM33_REQUIRED_INPUT_FLG`, `TBM33_NUMERIC_RANGE_FLG`, `TBM33_DEL_FLG`, `TBM33_UPD_DATETIME`, `TBM33_UPD_USER_ID`, `TBM33_UPD_PROG_NM` FROM `TBM33_CRF_COND` WHERE `TBM33_STUDY_ID` = ? and `TBM33_CRF_ID` = ? and `TBM33_COND_NO` = ? ORDER BY `TBM33_STUDY_ID`, `TBM33_CRF_ID`, `TBM33_COND_NO`  FOR UPDATE ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P002G3", "UPDATE `TBM33_CRF_COND` SET `TBM33_UPD_CNT`=?, `TBM33_COND_NM`=?, `TBM33_EXPRESSION`=?, `TBM33_COND_DIV`=?, `TBM33_CRF_ITEM_CD`=?, `TBM33_PRIOR_NO`=?, `TBM33_ERR_DIV`=?, `TBM33_ERR_MSG`=?, `TBM33_ENABLED_FLG`=?, `TBM33_REQUIRED_INPUT_FLG`=?, `TBM33_NUMERIC_RANGE_FLG`=?, `TBM33_DEL_FLG`=?, `TBM33_UPD_DATETIME`=?, `TBM33_UPD_USER_ID`=?, `TBM33_UPD_PROG_NM`=?  WHERE `TBM33_STUDY_ID` = ? AND `TBM33_CRF_ID` = ? AND `TBM33_COND_NO` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P002G4", "INSERT INTO `TBM33_CRF_COND`(`TBM33_STUDY_ID`, `TBM33_CRF_ID`, `TBM33_COND_NO`, `TBM33_COND_NM`, `TBM33_EXPRESSION`, `TBM33_COND_DIV`, `TBM33_CRF_ITEM_CD`, `TBM33_PRIOR_NO`, `TBM33_ERR_DIV`, `TBM33_ERR_MSG`, `TBM33_ENABLED_FLG`, `TBM33_REQUIRED_INPUT_FLG`, `TBM33_NUMERIC_RANGE_FLG`, `TBM33_DEL_FLG`, `TBM33_CRT_DATETIME`, `TBM33_CRT_USER_ID`, `TBM33_CRT_PROG_NM`, `TBM33_UPD_DATETIME`, `TBM33_UPD_USER_ID`, `TBM33_UPD_PROG_NM`, `TBM33_UPD_CNT`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
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
               ((String[]) buf[15])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[33])[0] = rslt.getGXDateTime(19) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
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
                  stmt.setVarchar(2, (String)parms[3], 100);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[5], 1000);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[7], 1);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[9], 50);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[11]).byteValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[13], 1);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[15], 200);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[17], 1);
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
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[21], 1);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[23], 1);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(13, (java.util.Date)parms[25], false);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[27], 128);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[29], 40);
               }
               stmt.setLong(16, ((Number) parms[30]).longValue());
               stmt.setShort(17, ((Number) parms[31]).shortValue());
               stmt.setShort(18, ((Number) parms[32]).shortValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[4], 100);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[6], 1000);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[8], 1);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[10], 50);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[12]).byteValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[14], 1);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[16], 200);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[18], 1);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[20], 1);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[22], 1);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[24], 1);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(15, (java.util.Date)parms[26], false);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[28], 128);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[30], 40);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(18, (java.util.Date)parms[32], false);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[34], 128);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[36], 40);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(21, ((Number) parms[38]).longValue());
               }
               return;
      }
   }

}

