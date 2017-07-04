/*
               File: B502_PC10_CRF_DOM_MAP_REG
        Description: CRF-ドメインマッピングマスタ登録
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:7.65
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b502_pc10_crf_dom_map_reg extends GXProcedure
{
   public b502_pc10_crf_dom_map_reg( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b502_pc10_crf_dom_map_reg.class ), "" );
   }

   public b502_pc10_crf_dom_map_reg( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public GxObjectCollection executeUdp( String aP0 ,
                                         String aP1 ,
                                         String aP2 ,
                                         short[] aP3 )
   {
      b502_pc10_crf_dom_map_reg.this.AV11P_STUDY_ID = aP0;
      b502_pc10_crf_dom_map_reg.this.AV10P_CRF_ID = aP1;
      b502_pc10_crf_dom_map_reg.this.AV9P_CRF_DOM_MAP = aP2;
      b502_pc10_crf_dom_map_reg.this.AV24W_RTN_MSG = aP4[0];
      b502_pc10_crf_dom_map_reg.this.aP4 = new GxObjectCollection[] {new GxObjectCollection()};
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
      b502_pc10_crf_dom_map_reg.this.AV11P_STUDY_ID = aP0;
      b502_pc10_crf_dom_map_reg.this.AV10P_CRF_ID = aP1;
      b502_pc10_crf_dom_map_reg.this.AV9P_CRF_DOM_MAP = aP2;
      b502_pc10_crf_dom_map_reg.this.aP3 = aP3;
      b502_pc10_crf_dom_map_reg.this.AV24W_RTN_MSG = aP4[0];
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
      b502_pc10_crf_dom_map_reg.this.GXt_char1 = GXv_char2[0] ;
      AV21W_NEWLINE = GXt_char1 ;
      AV18W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV18W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV8C_APP_ID );
      GXt_char1 = AV27W_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      b502_pc10_crf_dom_map_reg.this.GXt_char1 = GXv_char2[0] ;
      AV27W_USER_ID = GXt_char1 ;
      AV28W_UPDATE_TIME = GXutil.now( ) ;
      /* Execute user subroutine: S12150 */
      S12150 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      GXt_objcol_char3 = AV15W_CSV_ROW ;
      GXv_objcol_char4[0] = GXt_objcol_char3 ;
      new b807_pc01_csv_row_parse(remoteHandle, context).execute( AV9P_CRF_DOM_MAP, GXv_objcol_char4) ;
      GXt_objcol_char3 = GXv_objcol_char4[0] ;
      AV15W_CSV_ROW = GXt_objcol_char3 ;
      AV12W_CNT = 1 ;
      while ( AV12W_CNT <= AV15W_CSV_ROW.size() )
      {
         AV16W_ERR_CD = (short)(0) ;
         GXv_objcol_char4[0] = AV14W_CSV_COL ;
         GXv_int5[0] = AV16W_ERR_CD ;
         GXv_char2[0] = AV20W_MSG ;
         new b807_pc02_csv_col_parse_air(remoteHandle, context).execute( (String)AV15W_CSV_ROW.elementAt(-1+(int)(AV12W_CNT)), 11, "CSV", GXv_objcol_char4, GXv_int5, GXv_char2) ;
         AV14W_CSV_COL = GXv_objcol_char4[0] ;
         b502_pc10_crf_dom_map_reg.this.AV16W_ERR_CD = GXv_int5[0] ;
         b502_pc10_crf_dom_map_reg.this.AV20W_MSG = GXv_char2[0] ;
         if ( AV16W_ERR_CD == 0 )
         {
            if ( ! (GXutil.strcmp("", AV11P_STUDY_ID)==0) && ( GXutil.strcmp(AV11P_STUDY_ID, (String)AV14W_CSV_COL.elementAt(-1+1)) != 0 ) )
            {
               AV16W_ERR_CD = (short)(1) ;
               GXt_char1 = AV20W_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AE00063", "試験", "", "", "", "", GXv_char2) ;
               b502_pc10_crf_dom_map_reg.this.GXt_char1 = GXv_char2[0] ;
               AV20W_MSG = GXt_char1 ;
            }
            if ( ! (GXutil.strcmp("", AV10P_CRF_ID)==0) && ( GXutil.strcmp(AV10P_CRF_ID, (String)AV14W_CSV_COL.elementAt(-1+2)) != 0 ) )
            {
               AV16W_ERR_CD = (short)(1) ;
               GXt_char1 = AV20W_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AE00063", "CRF", "", "", "", "", GXv_char2) ;
               b502_pc10_crf_dom_map_reg.this.GXt_char1 = GXv_char2[0] ;
               AV20W_MSG = GXt_char1 ;
            }
         }
         if ( AV16W_ERR_CD != 0 )
         {
            AV23W_RTN_CD = (short)(1) ;
            AV20W_MSG = "CRF-ドメインマッピングマスタ：" + GXutil.trim( GXutil.str( AV12W_CNT, 10, 0)) + "行目：" + AV20W_MSG ;
            AV24W_RTN_MSG.add(AV20W_MSG, 0);
         }
         if ( AV23W_RTN_CD == 0 )
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
         if ( ( AV23W_RTN_CD != 0 ) && ( AV24W_RTN_MSG.size() > AV19W_MAX_ERROR_COUNT ) )
         {
            GXt_char1 = AV20W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00044", GXutil.trim( GXutil.str( AV19W_MAX_ERROR_COUNT, 10, 0)), "", "", "", "", GXv_char2) ;
            b502_pc10_crf_dom_map_reg.this.GXt_char1 = GXv_char2[0] ;
            AV20W_MSG = GXt_char1 ;
            AV24W_RTN_MSG.add(AV20W_MSG, 0);
            if (true) break;
         }
         AV12W_CNT = (long)(AV12W_CNT+1) ;
      }
      cleanup();
   }

   public void S1175( )
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
      Gx_etb = "TBM37_CRF_DOM_MAP" ;
      /* Using cursor P002L2 */
      pr_default.execute(0, new Object[] {new Long(AV25W_STUDY_ID), new Short(AV13W_CRF_ID)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A273TBM37_CRF_ITEM_GRP_CD = P002L2_A273TBM37_CRF_ITEM_GRP_CD[0] ;
         A372TBM37_CRF_ITEM_GRP_DIV = P002L2_A372TBM37_CRF_ITEM_GRP_DIV[0] ;
         A272TBM37_CRF_ID = P002L2_A272TBM37_CRF_ID[0] ;
         A271TBM37_STUDY_ID = P002L2_A271TBM37_STUDY_ID[0] ;
         A275TBM37_CRT_DATETIME = P002L2_A275TBM37_CRT_DATETIME[0] ;
         n275TBM37_CRT_DATETIME = P002L2_n275TBM37_CRT_DATETIME[0] ;
         A276TBM37_CRT_USER_ID = P002L2_A276TBM37_CRT_USER_ID[0] ;
         n276TBM37_CRT_USER_ID = P002L2_n276TBM37_CRT_USER_ID[0] ;
         A277TBM37_CRT_PROG_NM = P002L2_A277TBM37_CRT_PROG_NM[0] ;
         n277TBM37_CRT_PROG_NM = P002L2_n277TBM37_CRT_PROG_NM[0] ;
         A281TBM37_UPD_CNT = P002L2_A281TBM37_UPD_CNT[0] ;
         n281TBM37_UPD_CNT = P002L2_n281TBM37_UPD_CNT[0] ;
         A373TBM37_VISIT_NO = P002L2_A373TBM37_VISIT_NO[0] ;
         n373TBM37_VISIT_NO = P002L2_n373TBM37_VISIT_NO[0] ;
         A374TBM37_DOM_CD = P002L2_A374TBM37_DOM_CD[0] ;
         n374TBM37_DOM_CD = P002L2_n374TBM37_DOM_CD[0] ;
         A375TBM37_DOM_VAR_NM = P002L2_A375TBM37_DOM_VAR_NM[0] ;
         n375TBM37_DOM_VAR_NM = P002L2_n375TBM37_DOM_VAR_NM[0] ;
         A376TBM37_DOM_ITM_GRP_OID = P002L2_A376TBM37_DOM_ITM_GRP_OID[0] ;
         n376TBM37_DOM_ITM_GRP_OID = P002L2_n376TBM37_DOM_ITM_GRP_OID[0] ;
         A377TBM37_DOM_ITM_GRP_ATTR_SEQ = P002L2_A377TBM37_DOM_ITM_GRP_ATTR_SEQ[0] ;
         n377TBM37_DOM_ITM_GRP_ATTR_SEQ = P002L2_n377TBM37_DOM_ITM_GRP_ATTR_SEQ[0] ;
         A612TBM37_DOM_ITM_GRP_ROWNO = P002L2_A612TBM37_DOM_ITM_GRP_ROWNO[0] ;
         n612TBM37_DOM_ITM_GRP_ROWNO = P002L2_n612TBM37_DOM_ITM_GRP_ROWNO[0] ;
         A274TBM37_DEL_FLG = P002L2_A274TBM37_DEL_FLG[0] ;
         n274TBM37_DEL_FLG = P002L2_n274TBM37_DEL_FLG[0] ;
         A278TBM37_UPD_DATETIME = P002L2_A278TBM37_UPD_DATETIME[0] ;
         n278TBM37_UPD_DATETIME = P002L2_n278TBM37_UPD_DATETIME[0] ;
         A279TBM37_UPD_USER_ID = P002L2_A279TBM37_UPD_USER_ID[0] ;
         n279TBM37_UPD_USER_ID = P002L2_n279TBM37_UPD_USER_ID[0] ;
         A280TBM37_UPD_PROG_NM = P002L2_A280TBM37_UPD_PROG_NM[0] ;
         n280TBM37_UPD_PROG_NM = P002L2_n280TBM37_UPD_PROG_NM[0] ;
         if ( GXutil.strcmp(A372TBM37_CRF_ITEM_GRP_DIV, (String)AV14W_CSV_COL.elementAt(-1+3)) == 0 )
         {
            if ( GXutil.strcmp(A273TBM37_CRF_ITEM_GRP_CD, (String)AV14W_CSV_COL.elementAt(-1+4)) == 0 )
            {
               AV41GXLvl89 = (byte)(1) ;
               AV37P_LOGKBN = "UPD" ;
               AV30W_CRT_DATETIME = A275TBM37_CRT_DATETIME ;
               AV31W_CRT_USER_ID = A276TBM37_CRT_USER_ID ;
               AV32W_CRT_PROG_NM = A277TBM37_CRT_PROG_NM ;
               AV29W_UPD_CNT = (long)(A281TBM37_UPD_CNT+1) ;
               A373TBM37_VISIT_NO = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+5))) ;
               n373TBM37_VISIT_NO = false ;
               A374TBM37_DOM_CD = (String)AV14W_CSV_COL.elementAt(-1+6) ;
               n374TBM37_DOM_CD = false ;
               A375TBM37_DOM_VAR_NM = (String)AV14W_CSV_COL.elementAt(-1+7) ;
               n375TBM37_DOM_VAR_NM = false ;
               A376TBM37_DOM_ITM_GRP_OID = (String)AV14W_CSV_COL.elementAt(-1+8) ;
               n376TBM37_DOM_ITM_GRP_OID = false ;
               A377TBM37_DOM_ITM_GRP_ATTR_SEQ = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+9))) ;
               n377TBM37_DOM_ITM_GRP_ATTR_SEQ = false ;
               A612TBM37_DOM_ITM_GRP_ROWNO = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+10))) ;
               n612TBM37_DOM_ITM_GRP_ROWNO = false ;
               A274TBM37_DEL_FLG = (String)AV14W_CSV_COL.elementAt(-1+11) ;
               n274TBM37_DEL_FLG = false ;
               A278TBM37_UPD_DATETIME = GXutil.now( ) ;
               n278TBM37_UPD_DATETIME = false ;
               A279TBM37_UPD_USER_ID = AV27W_USER_ID ;
               n279TBM37_UPD_USER_ID = false ;
               A280TBM37_UPD_PROG_NM = AV40Pgmname ;
               n280TBM37_UPD_PROG_NM = false ;
               A281TBM37_UPD_CNT = AV29W_UPD_CNT ;
               n281TBM37_UPD_CNT = false ;
               Gx_ope = "Update" ;
               Gx_etb = "TBM37_CRF_DOM_MAP" ;
               /* Using cursor P002L3 */
               pr_default.execute(1, new Object[] {new Boolean(n281TBM37_UPD_CNT), new Long(A281TBM37_UPD_CNT), new Boolean(n373TBM37_VISIT_NO), new Short(A373TBM37_VISIT_NO), new Boolean(n374TBM37_DOM_CD), A374TBM37_DOM_CD, new Boolean(n375TBM37_DOM_VAR_NM), A375TBM37_DOM_VAR_NM, new Boolean(n376TBM37_DOM_ITM_GRP_OID), A376TBM37_DOM_ITM_GRP_OID, new Boolean(n377TBM37_DOM_ITM_GRP_ATTR_SEQ), new Short(A377TBM37_DOM_ITM_GRP_ATTR_SEQ), new Boolean(n612TBM37_DOM_ITM_GRP_ROWNO), new Short(A612TBM37_DOM_ITM_GRP_ROWNO), new Boolean(n274TBM37_DEL_FLG), A274TBM37_DEL_FLG, new Boolean(n278TBM37_UPD_DATETIME), A278TBM37_UPD_DATETIME, new Boolean(n279TBM37_UPD_USER_ID), A279TBM37_UPD_USER_ID, new Boolean(n280TBM37_UPD_PROG_NM), A280TBM37_UPD_PROG_NM, new Long(A271TBM37_STUDY_ID), new Short(A272TBM37_CRF_ID), A372TBM37_CRF_ITEM_GRP_DIV, A273TBM37_CRF_ITEM_GRP_CD});
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV41GXLvl89 == 0 )
      {
         AV37P_LOGKBN = "INS" ;
         /*
            INSERT RECORD ON TABLE TBM37_CRF_DOM_MAP

         */
         A271TBM37_STUDY_ID = GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+1)) ;
         A272TBM37_CRF_ID = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+2))) ;
         A372TBM37_CRF_ITEM_GRP_DIV = (String)AV14W_CSV_COL.elementAt(-1+3) ;
         A273TBM37_CRF_ITEM_GRP_CD = (String)AV14W_CSV_COL.elementAt(-1+4) ;
         A373TBM37_VISIT_NO = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+5))) ;
         n373TBM37_VISIT_NO = false ;
         A374TBM37_DOM_CD = (String)AV14W_CSV_COL.elementAt(-1+6) ;
         n374TBM37_DOM_CD = false ;
         A375TBM37_DOM_VAR_NM = (String)AV14W_CSV_COL.elementAt(-1+7) ;
         n375TBM37_DOM_VAR_NM = false ;
         A376TBM37_DOM_ITM_GRP_OID = (String)AV14W_CSV_COL.elementAt(-1+8) ;
         n376TBM37_DOM_ITM_GRP_OID = false ;
         A377TBM37_DOM_ITM_GRP_ATTR_SEQ = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+9))) ;
         n377TBM37_DOM_ITM_GRP_ATTR_SEQ = false ;
         A612TBM37_DOM_ITM_GRP_ROWNO = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+10))) ;
         n612TBM37_DOM_ITM_GRP_ROWNO = false ;
         A274TBM37_DEL_FLG = (String)AV14W_CSV_COL.elementAt(-1+11) ;
         n274TBM37_DEL_FLG = false ;
         A275TBM37_CRT_DATETIME = GXutil.now( ) ;
         n275TBM37_CRT_DATETIME = false ;
         A276TBM37_CRT_USER_ID = AV27W_USER_ID ;
         n276TBM37_CRT_USER_ID = false ;
         A277TBM37_CRT_PROG_NM = AV40Pgmname ;
         n277TBM37_CRT_PROG_NM = false ;
         A278TBM37_UPD_DATETIME = GXutil.now( ) ;
         n278TBM37_UPD_DATETIME = false ;
         A279TBM37_UPD_USER_ID = AV27W_USER_ID ;
         n279TBM37_UPD_USER_ID = false ;
         A280TBM37_UPD_PROG_NM = AV40Pgmname ;
         n280TBM37_UPD_PROG_NM = false ;
         A281TBM37_UPD_CNT = 1 ;
         n281TBM37_UPD_CNT = false ;
         Gx_ope = "Insert" ;
         Gx_etb = "TBM37_CRF_DOM_MAP" ;
         /* Using cursor P002L4 */
         pr_default.execute(2, new Object[] {new Long(A271TBM37_STUDY_ID), new Short(A272TBM37_CRF_ID), A372TBM37_CRF_ITEM_GRP_DIV, A273TBM37_CRF_ITEM_GRP_CD, new Boolean(n373TBM37_VISIT_NO), new Short(A373TBM37_VISIT_NO), new Boolean(n374TBM37_DOM_CD), A374TBM37_DOM_CD, new Boolean(n375TBM37_DOM_VAR_NM), A375TBM37_DOM_VAR_NM, new Boolean(n376TBM37_DOM_ITM_GRP_OID), A376TBM37_DOM_ITM_GRP_OID, new Boolean(n377TBM37_DOM_ITM_GRP_ATTR_SEQ), new Short(A377TBM37_DOM_ITM_GRP_ATTR_SEQ), new Boolean(n612TBM37_DOM_ITM_GRP_ROWNO), new Short(A612TBM37_DOM_ITM_GRP_ROWNO), new Boolean(n274TBM37_DEL_FLG), A274TBM37_DEL_FLG, new Boolean(n275TBM37_CRT_DATETIME), A275TBM37_CRT_DATETIME, new Boolean(n276TBM37_CRT_USER_ID), A276TBM37_CRT_USER_ID, new Boolean(n277TBM37_CRT_PROG_NM), A277TBM37_CRT_PROG_NM, new Boolean(n278TBM37_UPD_DATETIME), A278TBM37_UPD_DATETIME, new Boolean(n279TBM37_UPD_USER_ID), A279TBM37_UPD_USER_ID, new Boolean(n280TBM37_UPD_PROG_NM), A280TBM37_UPD_PROG_NM, new Boolean(n281TBM37_UPD_CNT), new Long(A281TBM37_UPD_CNT)});
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
         new b808_pc02_data_log(remoteHandle, context).execute( AV40Pgmname, AV37P_LOGKBN, "TBM37_CRF_DOM_MAP", AV14W_CSV_COL, AV30W_CRT_DATETIME, AV31W_CRT_USER_ID, AV32W_CRT_PROG_NM, AV33W_UPD_DATETIME, AV34W_UPD_USER_ID, AV35W_UPD_PROG_NM, AV29W_UPD_CNT) ;
      }
   }

   public void S12150( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXt_char1 = AV26W_SYS_VALUE ;
      GXv_char2[0] = GXt_char1 ;
      new b806_pc01_get_ctrl_val(remoteHandle, context).execute( "015", GXv_char2) ;
      b502_pc10_crf_dom_map_reg.this.GXt_char1 = GXv_char2[0] ;
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
      AV22W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_CRF_DOM_MAP" );
      AV22W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV9P_CRF_DOM_MAP );
      AV18W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV22W_PARMS_ITEM, 0);
      AV20W_MSG = "SUB_INIT" ;
      GXv_SdtB808_SD01_EXTRA_INFO6[0] = AV18W_EXTRA_INFO;
      GXv_int5[0] = AV16W_ERR_CD ;
      GXv_char2[0] = AV17W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV40Pgmname, (short)(1), AV20W_MSG, GXv_SdtB808_SD01_EXTRA_INFO6, GXv_int5, GXv_char2) ;
      AV18W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO6[0] ;
      b502_pc10_crf_dom_map_reg.this.AV16W_ERR_CD = GXv_int5[0] ;
      b502_pc10_crf_dom_map_reg.this.AV17W_ERR_MSG = GXv_char2[0] ;
   }

   public void S13182( )
   {
      /* 'SUB_ERROR' Routine */
      AV20W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO6[0] = AV18W_EXTRA_INFO;
      GXv_int5[0] = AV23W_RTN_CD ;
      GXv_char2[0] = AV17W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV40Pgmname, (short)(0), AV20W_MSG, GXv_SdtB808_SD01_EXTRA_INFO6, GXv_int5, GXv_char2) ;
      AV18W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO6[0] ;
      b502_pc10_crf_dom_map_reg.this.AV23W_RTN_CD = GXv_int5[0] ;
      b502_pc10_crf_dom_map_reg.this.AV17W_ERR_MSG = GXv_char2[0] ;
      AV24W_RTN_MSG.add(AV17W_ERR_MSG, 0);
      context.globals.Gx_eop = (byte)(0) ;
   }

   protected void cleanup( )
   {
      this.aP3[0] = b502_pc10_crf_dom_map_reg.this.AV23W_RTN_CD;
      this.aP4[0] = b502_pc10_crf_dom_map_reg.this.AV24W_RTN_MSG;
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
                  /* Execute user subroutine: S13182 */
                  S13182 ();
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
      P002L2_A273TBM37_CRF_ITEM_GRP_CD = new String[] {""} ;
      P002L2_A372TBM37_CRF_ITEM_GRP_DIV = new String[] {""} ;
      P002L2_A272TBM37_CRF_ID = new short[1] ;
      P002L2_A271TBM37_STUDY_ID = new long[1] ;
      P002L2_A275TBM37_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P002L2_n275TBM37_CRT_DATETIME = new boolean[] {false} ;
      P002L2_A276TBM37_CRT_USER_ID = new String[] {""} ;
      P002L2_n276TBM37_CRT_USER_ID = new boolean[] {false} ;
      P002L2_A277TBM37_CRT_PROG_NM = new String[] {""} ;
      P002L2_n277TBM37_CRT_PROG_NM = new boolean[] {false} ;
      P002L2_A281TBM37_UPD_CNT = new long[1] ;
      P002L2_n281TBM37_UPD_CNT = new boolean[] {false} ;
      P002L2_A373TBM37_VISIT_NO = new short[1] ;
      P002L2_n373TBM37_VISIT_NO = new boolean[] {false} ;
      P002L2_A374TBM37_DOM_CD = new String[] {""} ;
      P002L2_n374TBM37_DOM_CD = new boolean[] {false} ;
      P002L2_A375TBM37_DOM_VAR_NM = new String[] {""} ;
      P002L2_n375TBM37_DOM_VAR_NM = new boolean[] {false} ;
      P002L2_A376TBM37_DOM_ITM_GRP_OID = new String[] {""} ;
      P002L2_n376TBM37_DOM_ITM_GRP_OID = new boolean[] {false} ;
      P002L2_A377TBM37_DOM_ITM_GRP_ATTR_SEQ = new short[1] ;
      P002L2_n377TBM37_DOM_ITM_GRP_ATTR_SEQ = new boolean[] {false} ;
      P002L2_A612TBM37_DOM_ITM_GRP_ROWNO = new short[1] ;
      P002L2_n612TBM37_DOM_ITM_GRP_ROWNO = new boolean[] {false} ;
      P002L2_A274TBM37_DEL_FLG = new String[] {""} ;
      P002L2_n274TBM37_DEL_FLG = new boolean[] {false} ;
      P002L2_A278TBM37_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P002L2_n278TBM37_UPD_DATETIME = new boolean[] {false} ;
      P002L2_A279TBM37_UPD_USER_ID = new String[] {""} ;
      P002L2_n279TBM37_UPD_USER_ID = new boolean[] {false} ;
      P002L2_A280TBM37_UPD_PROG_NM = new String[] {""} ;
      P002L2_n280TBM37_UPD_PROG_NM = new boolean[] {false} ;
      A273TBM37_CRF_ITEM_GRP_CD = "" ;
      A372TBM37_CRF_ITEM_GRP_DIV = "" ;
      A275TBM37_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A276TBM37_CRT_USER_ID = "" ;
      A277TBM37_CRT_PROG_NM = "" ;
      A374TBM37_DOM_CD = "" ;
      A375TBM37_DOM_VAR_NM = "" ;
      A376TBM37_DOM_ITM_GRP_OID = "" ;
      A274TBM37_DEL_FLG = "" ;
      A278TBM37_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A279TBM37_UPD_USER_ID = "" ;
      A280TBM37_UPD_PROG_NM = "" ;
      AV37P_LOGKBN = "" ;
      Gx_emsg = "" ;
      AV26W_SYS_VALUE = "" ;
      GXt_char1 = "" ;
      AV22W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV17W_ERR_MSG = "" ;
      GXv_SdtB808_SD01_EXTRA_INFO6 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int5 = new short [1] ;
      GXv_char2 = new String [1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b502_pc10_crf_dom_map_reg__default(),
         new Object[] {
             new Object[] {
            P002L2_A273TBM37_CRF_ITEM_GRP_CD, P002L2_A372TBM37_CRF_ITEM_GRP_DIV, P002L2_A272TBM37_CRF_ID, P002L2_A271TBM37_STUDY_ID, P002L2_A275TBM37_CRT_DATETIME, P002L2_n275TBM37_CRT_DATETIME, P002L2_A276TBM37_CRT_USER_ID, P002L2_n276TBM37_CRT_USER_ID, P002L2_A277TBM37_CRT_PROG_NM, P002L2_n277TBM37_CRT_PROG_NM,
            P002L2_A281TBM37_UPD_CNT, P002L2_n281TBM37_UPD_CNT, P002L2_A373TBM37_VISIT_NO, P002L2_n373TBM37_VISIT_NO, P002L2_A374TBM37_DOM_CD, P002L2_n374TBM37_DOM_CD, P002L2_A375TBM37_DOM_VAR_NM, P002L2_n375TBM37_DOM_VAR_NM, P002L2_A376TBM37_DOM_ITM_GRP_OID, P002L2_n376TBM37_DOM_ITM_GRP_OID,
            P002L2_A377TBM37_DOM_ITM_GRP_ATTR_SEQ, P002L2_n377TBM37_DOM_ITM_GRP_ATTR_SEQ, P002L2_A612TBM37_DOM_ITM_GRP_ROWNO, P002L2_n612TBM37_DOM_ITM_GRP_ROWNO, P002L2_A274TBM37_DEL_FLG, P002L2_n274TBM37_DEL_FLG, P002L2_A278TBM37_UPD_DATETIME, P002L2_n278TBM37_UPD_DATETIME, P002L2_A279TBM37_UPD_USER_ID, P002L2_n279TBM37_UPD_USER_ID,
            P002L2_A280TBM37_UPD_PROG_NM, P002L2_n280TBM37_UPD_PROG_NM
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV40Pgmname = "B502_PC10_CRF_DOM_MAP_REG" ;
      /* GeneXus formulas. */
      AV40Pgmname = "B502_PC10_CRF_DOM_MAP_REG" ;
      Gx_err = (short)(0) ;
   }

   private byte AV41GXLvl89 ;
   private short AV23W_RTN_CD ;
   private short AV16W_ERR_CD ;
   private short AV13W_CRF_ID ;
   private short A272TBM37_CRF_ID ;
   private short A373TBM37_VISIT_NO ;
   private short A377TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private short A612TBM37_DOM_ITM_GRP_ROWNO ;
   private short Gx_err ;
   private short GXv_int5[] ;
   private int GX_INS22 ;
   private int GXActiveErrHndl ;
   private long AV12W_CNT ;
   private long AV19W_MAX_ERROR_COUNT ;
   private long AV25W_STUDY_ID ;
   private long AV29W_UPD_CNT ;
   private long A271TBM37_STUDY_ID ;
   private long A281TBM37_UPD_CNT ;
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
   private java.util.Date A275TBM37_CRT_DATETIME ;
   private java.util.Date A278TBM37_UPD_DATETIME ;
   private boolean returnInSub ;
   private boolean n275TBM37_CRT_DATETIME ;
   private boolean n276TBM37_CRT_USER_ID ;
   private boolean n277TBM37_CRT_PROG_NM ;
   private boolean n281TBM37_UPD_CNT ;
   private boolean n373TBM37_VISIT_NO ;
   private boolean n374TBM37_DOM_CD ;
   private boolean n375TBM37_DOM_VAR_NM ;
   private boolean n376TBM37_DOM_ITM_GRP_OID ;
   private boolean n377TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private boolean n612TBM37_DOM_ITM_GRP_ROWNO ;
   private boolean n274TBM37_DEL_FLG ;
   private boolean n278TBM37_UPD_DATETIME ;
   private boolean n279TBM37_UPD_USER_ID ;
   private boolean n280TBM37_UPD_PROG_NM ;
   private String AV11P_STUDY_ID ;
   private String AV10P_CRF_ID ;
   private String AV9P_CRF_DOM_MAP ;
   private String AV8C_APP_ID ;
   private String AV21W_NEWLINE ;
   private String AV27W_USER_ID ;
   private String AV20W_MSG ;
   private String AV31W_CRT_USER_ID ;
   private String AV32W_CRT_PROG_NM ;
   private String AV34W_UPD_USER_ID ;
   private String AV35W_UPD_PROG_NM ;
   private String A273TBM37_CRF_ITEM_GRP_CD ;
   private String A372TBM37_CRF_ITEM_GRP_DIV ;
   private String A276TBM37_CRT_USER_ID ;
   private String A277TBM37_CRT_PROG_NM ;
   private String A374TBM37_DOM_CD ;
   private String A375TBM37_DOM_VAR_NM ;
   private String A376TBM37_DOM_ITM_GRP_OID ;
   private String A274TBM37_DEL_FLG ;
   private String A279TBM37_UPD_USER_ID ;
   private String A280TBM37_UPD_PROG_NM ;
   private String AV37P_LOGKBN ;
   private String AV26W_SYS_VALUE ;
   private String AV17W_ERR_MSG ;
   private short[] aP3 ;
   private GxObjectCollection[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P002L2_A273TBM37_CRF_ITEM_GRP_CD ;
   private String[] P002L2_A372TBM37_CRF_ITEM_GRP_DIV ;
   private short[] P002L2_A272TBM37_CRF_ID ;
   private long[] P002L2_A271TBM37_STUDY_ID ;
   private java.util.Date[] P002L2_A275TBM37_CRT_DATETIME ;
   private boolean[] P002L2_n275TBM37_CRT_DATETIME ;
   private String[] P002L2_A276TBM37_CRT_USER_ID ;
   private boolean[] P002L2_n276TBM37_CRT_USER_ID ;
   private String[] P002L2_A277TBM37_CRT_PROG_NM ;
   private boolean[] P002L2_n277TBM37_CRT_PROG_NM ;
   private long[] P002L2_A281TBM37_UPD_CNT ;
   private boolean[] P002L2_n281TBM37_UPD_CNT ;
   private short[] P002L2_A373TBM37_VISIT_NO ;
   private boolean[] P002L2_n373TBM37_VISIT_NO ;
   private String[] P002L2_A374TBM37_DOM_CD ;
   private boolean[] P002L2_n374TBM37_DOM_CD ;
   private String[] P002L2_A375TBM37_DOM_VAR_NM ;
   private boolean[] P002L2_n375TBM37_DOM_VAR_NM ;
   private String[] P002L2_A376TBM37_DOM_ITM_GRP_OID ;
   private boolean[] P002L2_n376TBM37_DOM_ITM_GRP_OID ;
   private short[] P002L2_A377TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private boolean[] P002L2_n377TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private short[] P002L2_A612TBM37_DOM_ITM_GRP_ROWNO ;
   private boolean[] P002L2_n612TBM37_DOM_ITM_GRP_ROWNO ;
   private String[] P002L2_A274TBM37_DEL_FLG ;
   private boolean[] P002L2_n274TBM37_DEL_FLG ;
   private java.util.Date[] P002L2_A278TBM37_UPD_DATETIME ;
   private boolean[] P002L2_n278TBM37_UPD_DATETIME ;
   private String[] P002L2_A279TBM37_UPD_USER_ID ;
   private boolean[] P002L2_n279TBM37_UPD_USER_ID ;
   private String[] P002L2_A280TBM37_UPD_PROG_NM ;
   private boolean[] P002L2_n280TBM37_UPD_PROG_NM ;
   private GxObjectCollection AV24W_RTN_MSG ;
   private GxObjectCollection AV15W_CSV_ROW ;
   private GxObjectCollection GXt_objcol_char3 ;
   private GxObjectCollection AV14W_CSV_COL ;
   private GxObjectCollection GXv_objcol_char4[] ;
   private SdtB808_SD01_EXTRA_INFO AV18W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO6[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV22W_PARMS_ITEM ;
}

final  class b502_pc10_crf_dom_map_reg__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P002L2", "SELECT `TBM37_CRF_ITEM_GRP_CD`, `TBM37_CRF_ITEM_GRP_DIV`, `TBM37_CRF_ID`, `TBM37_STUDY_ID`, `TBM37_CRT_DATETIME`, `TBM37_CRT_USER_ID`, `TBM37_CRT_PROG_NM`, `TBM37_UPD_CNT`, `TBM37_VISIT_NO`, `TBM37_DOM_CD`, `TBM37_DOM_VAR_NM`, `TBM37_DOM_ITM_GRP_OID`, `TBM37_DOM_ITM_GRP_ATTR_SEQ`, `TBM37_DOM_ITM_GRP_ROWNO`, `TBM37_DEL_FLG`, `TBM37_UPD_DATETIME`, `TBM37_UPD_USER_ID`, `TBM37_UPD_PROG_NM` FROM `TBM37_CRF_DOM_MAP` WHERE `TBM37_STUDY_ID` = ? and `TBM37_CRF_ID` = ? ORDER BY `TBM37_STUDY_ID`, `TBM37_CRF_ID`  FOR UPDATE ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new UpdateCursor("P002L3", "UPDATE `TBM37_CRF_DOM_MAP` SET `TBM37_UPD_CNT`=?, `TBM37_VISIT_NO`=?, `TBM37_DOM_CD`=?, `TBM37_DOM_VAR_NM`=?, `TBM37_DOM_ITM_GRP_OID`=?, `TBM37_DOM_ITM_GRP_ATTR_SEQ`=?, `TBM37_DOM_ITM_GRP_ROWNO`=?, `TBM37_DEL_FLG`=?, `TBM37_UPD_DATETIME`=?, `TBM37_UPD_USER_ID`=?, `TBM37_UPD_PROG_NM`=?  WHERE `TBM37_STUDY_ID` = ? AND `TBM37_CRF_ID` = ? AND `TBM37_CRF_ITEM_GRP_DIV` = ? AND `TBM37_CRF_ITEM_GRP_CD` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P002L4", "INSERT INTO `TBM37_CRF_DOM_MAP` (`TBM37_STUDY_ID`, `TBM37_CRF_ID`, `TBM37_CRF_ITEM_GRP_DIV`, `TBM37_CRF_ITEM_GRP_CD`, `TBM37_VISIT_NO`, `TBM37_DOM_CD`, `TBM37_DOM_VAR_NM`, `TBM37_DOM_ITM_GRP_OID`, `TBM37_DOM_ITM_GRP_ATTR_SEQ`, `TBM37_DOM_ITM_GRP_ROWNO`, `TBM37_DEL_FLG`, `TBM37_CRT_DATETIME`, `TBM37_CRT_USER_ID`, `TBM37_CRT_PROG_NM`, `TBM37_UPD_DATETIME`, `TBM37_UPD_USER_ID`, `TBM37_UPD_PROG_NM`, `TBM37_UPD_CNT`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((long[]) buf[10])[0] = rslt.getLong(8) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(9) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(13) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((short[]) buf[22])[0] = rslt.getShort(14) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[26])[0] = rslt.getGXDateTime(16) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
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
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[5], 2);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[7], 50);
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
                  stmt.setShort(6, ((Number) parms[11]).shortValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[13]).shortValue());
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
                  stmt.setNull( 9 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(9, (java.util.Date)parms[17], false);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[19], 128);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[21], 40);
               }
               stmt.setLong(12, ((Number) parms[22]).longValue());
               stmt.setShort(13, ((Number) parms[23]).shortValue());
               stmt.setVarchar(14, (String)parms[24], 1, false);
               stmt.setVarchar(15, (String)parms[25], 50, false);
               break;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 1, false);
               stmt.setVarchar(4, (String)parms[3], 50, false);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[9], 50);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[11], 50);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[13]).shortValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[15]).shortValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[17], 1);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(12, (java.util.Date)parms[19], false);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[21], 128);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[23], 40);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(15, (java.util.Date)parms[25], false);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[27], 128);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[29], 40);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(18, ((Number) parms[31]).longValue());
               }
               break;
      }
   }

}

