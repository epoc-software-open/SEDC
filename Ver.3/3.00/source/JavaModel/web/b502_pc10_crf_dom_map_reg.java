/*
               File: B502_PC10_CRF_DOM_MAP_REG
        Description: CRF-ドメインマッピングマスタ登録
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:16:33.18
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
      b502_pc10_crf_dom_map_reg.this.aP3 = aP3;
      b502_pc10_crf_dom_map_reg.this.AV24W_RTN_MSG = aP4[0];
      this.aP4 = aP4;
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
            b502_pc10_crf_dom_map_reg.this.GXt_char1 = GXv_char2[0] ;
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
      Gx_etb = "TBM37_CRF_DOM_MAP" ;
      /* Using cursor P002J2 */
      pr_default.execute(0, new Object[] {new Long(AV25W_STUDY_ID), new Short(AV13W_CRF_ID)});
      if ( Gx_err != 0 )
      {
         AV41GXLvl89 = (byte)(1) ;
      }
      while ( (pr_default.getStatus(0) != 101) )
      {
         A82TBM37_CRF_ITEM_GRP_CD = P002J2_A82TBM37_CRF_ITEM_GRP_CD[0] ;
         A81TBM37_CRF_ITEM_GRP_DIV = P002J2_A81TBM37_CRF_ITEM_GRP_DIV[0] ;
         A80TBM37_CRF_ID = P002J2_A80TBM37_CRF_ID[0] ;
         A79TBM37_STUDY_ID = P002J2_A79TBM37_STUDY_ID[0] ;
         A434TBM37_CRT_DATETIME = P002J2_A434TBM37_CRT_DATETIME[0] ;
         n434TBM37_CRT_DATETIME = P002J2_n434TBM37_CRT_DATETIME[0] ;
         A435TBM37_CRT_USER_ID = P002J2_A435TBM37_CRT_USER_ID[0] ;
         n435TBM37_CRT_USER_ID = P002J2_n435TBM37_CRT_USER_ID[0] ;
         A436TBM37_CRT_PROG_NM = P002J2_A436TBM37_CRT_PROG_NM[0] ;
         n436TBM37_CRT_PROG_NM = P002J2_n436TBM37_CRT_PROG_NM[0] ;
         A440TBM37_UPD_CNT = P002J2_A440TBM37_UPD_CNT[0] ;
         n440TBM37_UPD_CNT = P002J2_n440TBM37_UPD_CNT[0] ;
         A83TBM37_VISIT_NO = P002J2_A83TBM37_VISIT_NO[0] ;
         n83TBM37_VISIT_NO = P002J2_n83TBM37_VISIT_NO[0] ;
         A84TBM37_DOM_CD = P002J2_A84TBM37_DOM_CD[0] ;
         n84TBM37_DOM_CD = P002J2_n84TBM37_DOM_CD[0] ;
         A500TBM37_DOM_VAR_NM = P002J2_A500TBM37_DOM_VAR_NM[0] ;
         n500TBM37_DOM_VAR_NM = P002J2_n500TBM37_DOM_VAR_NM[0] ;
         A85TBM37_DOM_ITM_GRP_OID = P002J2_A85TBM37_DOM_ITM_GRP_OID[0] ;
         n85TBM37_DOM_ITM_GRP_OID = P002J2_n85TBM37_DOM_ITM_GRP_OID[0] ;
         A501TBM37_DOM_ITM_GRP_ATTR_SEQ = P002J2_A501TBM37_DOM_ITM_GRP_ATTR_SEQ[0] ;
         n501TBM37_DOM_ITM_GRP_ATTR_SEQ = P002J2_n501TBM37_DOM_ITM_GRP_ATTR_SEQ[0] ;
         A86TBM37_DOM_ITM_GRP_ROWNO = P002J2_A86TBM37_DOM_ITM_GRP_ROWNO[0] ;
         n86TBM37_DOM_ITM_GRP_ROWNO = P002J2_n86TBM37_DOM_ITM_GRP_ROWNO[0] ;
         A433TBM37_DEL_FLG = P002J2_A433TBM37_DEL_FLG[0] ;
         n433TBM37_DEL_FLG = P002J2_n433TBM37_DEL_FLG[0] ;
         A437TBM37_UPD_DATETIME = P002J2_A437TBM37_UPD_DATETIME[0] ;
         n437TBM37_UPD_DATETIME = P002J2_n437TBM37_UPD_DATETIME[0] ;
         A438TBM37_UPD_USER_ID = P002J2_A438TBM37_UPD_USER_ID[0] ;
         n438TBM37_UPD_USER_ID = P002J2_n438TBM37_UPD_USER_ID[0] ;
         A439TBM37_UPD_PROG_NM = P002J2_A439TBM37_UPD_PROG_NM[0] ;
         n439TBM37_UPD_PROG_NM = P002J2_n439TBM37_UPD_PROG_NM[0] ;
         if ( GXutil.strcmp(A81TBM37_CRF_ITEM_GRP_DIV, (String)AV14W_CSV_COL.elementAt(-1+3)) == 0 )
         {
            if ( GXutil.strcmp(A82TBM37_CRF_ITEM_GRP_CD, (String)AV14W_CSV_COL.elementAt(-1+4)) == 0 )
            {
               AV41GXLvl89 = (byte)(1) ;
               AV37P_LOGKBN = "UPD" ;
               AV30W_CRT_DATETIME = A434TBM37_CRT_DATETIME ;
               AV31W_CRT_USER_ID = A435TBM37_CRT_USER_ID ;
               AV32W_CRT_PROG_NM = A436TBM37_CRT_PROG_NM ;
               AV29W_UPD_CNT = (long)(A440TBM37_UPD_CNT+1) ;
               A83TBM37_VISIT_NO = (int)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+5))) ;
               n83TBM37_VISIT_NO = false ;
               A84TBM37_DOM_CD = (String)AV14W_CSV_COL.elementAt(-1+6) ;
               n84TBM37_DOM_CD = false ;
               A500TBM37_DOM_VAR_NM = (String)AV14W_CSV_COL.elementAt(-1+7) ;
               n500TBM37_DOM_VAR_NM = false ;
               A85TBM37_DOM_ITM_GRP_OID = (String)AV14W_CSV_COL.elementAt(-1+8) ;
               n85TBM37_DOM_ITM_GRP_OID = false ;
               A501TBM37_DOM_ITM_GRP_ATTR_SEQ = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+9))) ;
               n501TBM37_DOM_ITM_GRP_ATTR_SEQ = false ;
               A86TBM37_DOM_ITM_GRP_ROWNO = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+10))) ;
               n86TBM37_DOM_ITM_GRP_ROWNO = false ;
               A433TBM37_DEL_FLG = (String)AV14W_CSV_COL.elementAt(-1+11) ;
               n433TBM37_DEL_FLG = false ;
               A437TBM37_UPD_DATETIME = GXutil.now( ) ;
               n437TBM37_UPD_DATETIME = false ;
               A438TBM37_UPD_USER_ID = AV27W_USER_ID ;
               n438TBM37_UPD_USER_ID = false ;
               A439TBM37_UPD_PROG_NM = AV40Pgmname ;
               n439TBM37_UPD_PROG_NM = false ;
               A440TBM37_UPD_CNT = AV29W_UPD_CNT ;
               n440TBM37_UPD_CNT = false ;
               Gx_ope = "Update" ;
               Gx_etb = "TBM37_CRF_DOM_MAP" ;
               /* Using cursor P002J3 */
               pr_default.execute(1, new Object[] {new Boolean(n440TBM37_UPD_CNT), new Long(A440TBM37_UPD_CNT), new Boolean(n83TBM37_VISIT_NO), new Integer(A83TBM37_VISIT_NO), new Boolean(n84TBM37_DOM_CD), A84TBM37_DOM_CD, new Boolean(n500TBM37_DOM_VAR_NM), A500TBM37_DOM_VAR_NM, new Boolean(n85TBM37_DOM_ITM_GRP_OID), A85TBM37_DOM_ITM_GRP_OID, new Boolean(n501TBM37_DOM_ITM_GRP_ATTR_SEQ), new Short(A501TBM37_DOM_ITM_GRP_ATTR_SEQ), new Boolean(n86TBM37_DOM_ITM_GRP_ROWNO), new Short(A86TBM37_DOM_ITM_GRP_ROWNO), new Boolean(n433TBM37_DEL_FLG), A433TBM37_DEL_FLG, new Boolean(n437TBM37_UPD_DATETIME), A437TBM37_UPD_DATETIME, new Boolean(n438TBM37_UPD_USER_ID), A438TBM37_UPD_USER_ID, new Boolean(n439TBM37_UPD_PROG_NM), A439TBM37_UPD_PROG_NM, new Long(A79TBM37_STUDY_ID), new Short(A80TBM37_CRF_ID), A81TBM37_CRF_ITEM_GRP_DIV, A82TBM37_CRF_ITEM_GRP_CD});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM37_CRF_DOM_MAP") ;
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
         A79TBM37_STUDY_ID = GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+1)) ;
         A80TBM37_CRF_ID = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+2))) ;
         A81TBM37_CRF_ITEM_GRP_DIV = (String)AV14W_CSV_COL.elementAt(-1+3) ;
         A82TBM37_CRF_ITEM_GRP_CD = (String)AV14W_CSV_COL.elementAt(-1+4) ;
         A83TBM37_VISIT_NO = (int)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+5))) ;
         n83TBM37_VISIT_NO = false ;
         A84TBM37_DOM_CD = (String)AV14W_CSV_COL.elementAt(-1+6) ;
         n84TBM37_DOM_CD = false ;
         A500TBM37_DOM_VAR_NM = (String)AV14W_CSV_COL.elementAt(-1+7) ;
         n500TBM37_DOM_VAR_NM = false ;
         A85TBM37_DOM_ITM_GRP_OID = (String)AV14W_CSV_COL.elementAt(-1+8) ;
         n85TBM37_DOM_ITM_GRP_OID = false ;
         A501TBM37_DOM_ITM_GRP_ATTR_SEQ = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+9))) ;
         n501TBM37_DOM_ITM_GRP_ATTR_SEQ = false ;
         A86TBM37_DOM_ITM_GRP_ROWNO = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+10))) ;
         n86TBM37_DOM_ITM_GRP_ROWNO = false ;
         A433TBM37_DEL_FLG = (String)AV14W_CSV_COL.elementAt(-1+11) ;
         n433TBM37_DEL_FLG = false ;
         A434TBM37_CRT_DATETIME = GXutil.now( ) ;
         n434TBM37_CRT_DATETIME = false ;
         A435TBM37_CRT_USER_ID = AV27W_USER_ID ;
         n435TBM37_CRT_USER_ID = false ;
         A436TBM37_CRT_PROG_NM = AV40Pgmname ;
         n436TBM37_CRT_PROG_NM = false ;
         A437TBM37_UPD_DATETIME = GXutil.now( ) ;
         n437TBM37_UPD_DATETIME = false ;
         A438TBM37_UPD_USER_ID = AV27W_USER_ID ;
         n438TBM37_UPD_USER_ID = false ;
         A439TBM37_UPD_PROG_NM = AV40Pgmname ;
         n439TBM37_UPD_PROG_NM = false ;
         A440TBM37_UPD_CNT = 1 ;
         n440TBM37_UPD_CNT = false ;
         Gx_ope = "Insert" ;
         Gx_etb = "TBM37_CRF_DOM_MAP" ;
         /* Using cursor P002J4 */
         pr_default.execute(2, new Object[] {new Long(A79TBM37_STUDY_ID), new Short(A80TBM37_CRF_ID), A81TBM37_CRF_ITEM_GRP_DIV, A82TBM37_CRF_ITEM_GRP_CD, new Boolean(n83TBM37_VISIT_NO), new Integer(A83TBM37_VISIT_NO), new Boolean(n84TBM37_DOM_CD), A84TBM37_DOM_CD, new Boolean(n500TBM37_DOM_VAR_NM), A500TBM37_DOM_VAR_NM, new Boolean(n85TBM37_DOM_ITM_GRP_OID), A85TBM37_DOM_ITM_GRP_OID, new Boolean(n501TBM37_DOM_ITM_GRP_ATTR_SEQ), new Short(A501TBM37_DOM_ITM_GRP_ATTR_SEQ), new Boolean(n86TBM37_DOM_ITM_GRP_ROWNO), new Short(A86TBM37_DOM_ITM_GRP_ROWNO), new Boolean(n433TBM37_DEL_FLG), A433TBM37_DEL_FLG, new Boolean(n434TBM37_CRT_DATETIME), A434TBM37_CRT_DATETIME, new Boolean(n435TBM37_CRT_USER_ID), A435TBM37_CRT_USER_ID, new Boolean(n436TBM37_CRT_PROG_NM), A436TBM37_CRT_PROG_NM, new Boolean(n437TBM37_UPD_DATETIME), A437TBM37_UPD_DATETIME, new Boolean(n438TBM37_UPD_USER_ID), A438TBM37_UPD_USER_ID, new Boolean(n439TBM37_UPD_PROG_NM), A439TBM37_UPD_PROG_NM, new Boolean(n440TBM37_UPD_CNT), new Long(A440TBM37_UPD_CNT)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM37_CRF_DOM_MAP") ;
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

   public void S121( )
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

   public void S131( )
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
      A434TBM37_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A435TBM37_CRT_USER_ID = "" ;
      A436TBM37_CRT_PROG_NM = "" ;
      A84TBM37_DOM_CD = "" ;
      A500TBM37_DOM_VAR_NM = "" ;
      A85TBM37_DOM_ITM_GRP_OID = "" ;
      A433TBM37_DEL_FLG = "" ;
      A437TBM37_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A438TBM37_UPD_USER_ID = "" ;
      A439TBM37_UPD_PROG_NM = "" ;
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
      P002J2_A82TBM37_CRF_ITEM_GRP_CD = new String[] {""} ;
      P002J2_A81TBM37_CRF_ITEM_GRP_DIV = new String[] {""} ;
      P002J2_A80TBM37_CRF_ID = new short[1] ;
      P002J2_A79TBM37_STUDY_ID = new long[1] ;
      P002J2_A434TBM37_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P002J2_n434TBM37_CRT_DATETIME = new boolean[] {false} ;
      P002J2_A435TBM37_CRT_USER_ID = new String[] {""} ;
      P002J2_n435TBM37_CRT_USER_ID = new boolean[] {false} ;
      P002J2_A436TBM37_CRT_PROG_NM = new String[] {""} ;
      P002J2_n436TBM37_CRT_PROG_NM = new boolean[] {false} ;
      P002J2_A440TBM37_UPD_CNT = new long[1] ;
      P002J2_n440TBM37_UPD_CNT = new boolean[] {false} ;
      P002J2_A83TBM37_VISIT_NO = new int[1] ;
      P002J2_n83TBM37_VISIT_NO = new boolean[] {false} ;
      P002J2_A84TBM37_DOM_CD = new String[] {""} ;
      P002J2_n84TBM37_DOM_CD = new boolean[] {false} ;
      P002J2_A500TBM37_DOM_VAR_NM = new String[] {""} ;
      P002J2_n500TBM37_DOM_VAR_NM = new boolean[] {false} ;
      P002J2_A85TBM37_DOM_ITM_GRP_OID = new String[] {""} ;
      P002J2_n85TBM37_DOM_ITM_GRP_OID = new boolean[] {false} ;
      P002J2_A501TBM37_DOM_ITM_GRP_ATTR_SEQ = new short[1] ;
      P002J2_n501TBM37_DOM_ITM_GRP_ATTR_SEQ = new boolean[] {false} ;
      P002J2_A86TBM37_DOM_ITM_GRP_ROWNO = new short[1] ;
      P002J2_n86TBM37_DOM_ITM_GRP_ROWNO = new boolean[] {false} ;
      P002J2_A433TBM37_DEL_FLG = new String[] {""} ;
      P002J2_n433TBM37_DEL_FLG = new boolean[] {false} ;
      P002J2_A437TBM37_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P002J2_n437TBM37_UPD_DATETIME = new boolean[] {false} ;
      P002J2_A438TBM37_UPD_USER_ID = new String[] {""} ;
      P002J2_n438TBM37_UPD_USER_ID = new boolean[] {false} ;
      P002J2_A439TBM37_UPD_PROG_NM = new String[] {""} ;
      P002J2_n439TBM37_UPD_PROG_NM = new boolean[] {false} ;
      A82TBM37_CRF_ITEM_GRP_CD = "" ;
      A81TBM37_CRF_ITEM_GRP_DIV = "" ;
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
            P002J2_A82TBM37_CRF_ITEM_GRP_CD, P002J2_A81TBM37_CRF_ITEM_GRP_DIV, P002J2_A80TBM37_CRF_ID, P002J2_A79TBM37_STUDY_ID, P002J2_A434TBM37_CRT_DATETIME, P002J2_n434TBM37_CRT_DATETIME, P002J2_A435TBM37_CRT_USER_ID, P002J2_n435TBM37_CRT_USER_ID, P002J2_A436TBM37_CRT_PROG_NM, P002J2_n436TBM37_CRT_PROG_NM,
            P002J2_A440TBM37_UPD_CNT, P002J2_n440TBM37_UPD_CNT, P002J2_A83TBM37_VISIT_NO, P002J2_n83TBM37_VISIT_NO, P002J2_A84TBM37_DOM_CD, P002J2_n84TBM37_DOM_CD, P002J2_A500TBM37_DOM_VAR_NM, P002J2_n500TBM37_DOM_VAR_NM, P002J2_A85TBM37_DOM_ITM_GRP_OID, P002J2_n85TBM37_DOM_ITM_GRP_OID,
            P002J2_A501TBM37_DOM_ITM_GRP_ATTR_SEQ, P002J2_n501TBM37_DOM_ITM_GRP_ATTR_SEQ, P002J2_A86TBM37_DOM_ITM_GRP_ROWNO, P002J2_n86TBM37_DOM_ITM_GRP_ROWNO, P002J2_A433TBM37_DEL_FLG, P002J2_n433TBM37_DEL_FLG, P002J2_A437TBM37_UPD_DATETIME, P002J2_n437TBM37_UPD_DATETIME, P002J2_A438TBM37_UPD_USER_ID, P002J2_n438TBM37_UPD_USER_ID,
            P002J2_A439TBM37_UPD_PROG_NM, P002J2_n439TBM37_UPD_PROG_NM
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
   private short A501TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private short A86TBM37_DOM_ITM_GRP_ROWNO ;
   private short AV13W_CRF_ID ;
   private short Gx_err ;
   private short A80TBM37_CRF_ID ;
   private short GXv_int5[] ;
   private int A83TBM37_VISIT_NO ;
   private int GX_INS22 ;
   private int GXActiveErrHndl ;
   private long AV12W_CNT ;
   private long AV19W_MAX_ERROR_COUNT ;
   private long A440TBM37_UPD_CNT ;
   private long AV25W_STUDY_ID ;
   private long AV29W_UPD_CNT ;
   private long A79TBM37_STUDY_ID ;
   private String AV40Pgmname ;
   private String scmdbuf ;
   private String Gx_ope ;
   private String Gx_etb ;
   private String Gx_emsg ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private java.util.Date AV28W_UPDATE_TIME ;
   private java.util.Date A434TBM37_CRT_DATETIME ;
   private java.util.Date A437TBM37_UPD_DATETIME ;
   private java.util.Date AV30W_CRT_DATETIME ;
   private java.util.Date AV33W_UPD_DATETIME ;
   private boolean returnInSub ;
   private boolean n434TBM37_CRT_DATETIME ;
   private boolean n435TBM37_CRT_USER_ID ;
   private boolean n436TBM37_CRT_PROG_NM ;
   private boolean n440TBM37_UPD_CNT ;
   private boolean n83TBM37_VISIT_NO ;
   private boolean n84TBM37_DOM_CD ;
   private boolean n500TBM37_DOM_VAR_NM ;
   private boolean n85TBM37_DOM_ITM_GRP_OID ;
   private boolean n501TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private boolean n86TBM37_DOM_ITM_GRP_ROWNO ;
   private boolean n433TBM37_DEL_FLG ;
   private boolean n437TBM37_UPD_DATETIME ;
   private boolean n438TBM37_UPD_USER_ID ;
   private boolean n439TBM37_UPD_PROG_NM ;
   private String AV11P_STUDY_ID ;
   private String AV10P_CRF_ID ;
   private String AV9P_CRF_DOM_MAP ;
   private String AV8C_APP_ID ;
   private String AV21W_NEWLINE ;
   private String AV27W_USER_ID ;
   private String AV20W_MSG ;
   private String A435TBM37_CRT_USER_ID ;
   private String A436TBM37_CRT_PROG_NM ;
   private String A84TBM37_DOM_CD ;
   private String A500TBM37_DOM_VAR_NM ;
   private String A85TBM37_DOM_ITM_GRP_OID ;
   private String A433TBM37_DEL_FLG ;
   private String A438TBM37_UPD_USER_ID ;
   private String A439TBM37_UPD_PROG_NM ;
   private String AV31W_CRT_USER_ID ;
   private String AV32W_CRT_PROG_NM ;
   private String AV34W_UPD_USER_ID ;
   private String AV35W_UPD_PROG_NM ;
   private String A82TBM37_CRF_ITEM_GRP_CD ;
   private String A81TBM37_CRF_ITEM_GRP_DIV ;
   private String AV37P_LOGKBN ;
   private String AV26W_SYS_VALUE ;
   private String AV17W_ERR_MSG ;
   private short[] aP3 ;
   private GxObjectCollection[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P002J2_A82TBM37_CRF_ITEM_GRP_CD ;
   private String[] P002J2_A81TBM37_CRF_ITEM_GRP_DIV ;
   private short[] P002J2_A80TBM37_CRF_ID ;
   private long[] P002J2_A79TBM37_STUDY_ID ;
   private java.util.Date[] P002J2_A434TBM37_CRT_DATETIME ;
   private boolean[] P002J2_n434TBM37_CRT_DATETIME ;
   private String[] P002J2_A435TBM37_CRT_USER_ID ;
   private boolean[] P002J2_n435TBM37_CRT_USER_ID ;
   private String[] P002J2_A436TBM37_CRT_PROG_NM ;
   private boolean[] P002J2_n436TBM37_CRT_PROG_NM ;
   private long[] P002J2_A440TBM37_UPD_CNT ;
   private boolean[] P002J2_n440TBM37_UPD_CNT ;
   private int[] P002J2_A83TBM37_VISIT_NO ;
   private boolean[] P002J2_n83TBM37_VISIT_NO ;
   private String[] P002J2_A84TBM37_DOM_CD ;
   private boolean[] P002J2_n84TBM37_DOM_CD ;
   private String[] P002J2_A500TBM37_DOM_VAR_NM ;
   private boolean[] P002J2_n500TBM37_DOM_VAR_NM ;
   private String[] P002J2_A85TBM37_DOM_ITM_GRP_OID ;
   private boolean[] P002J2_n85TBM37_DOM_ITM_GRP_OID ;
   private short[] P002J2_A501TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private boolean[] P002J2_n501TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private short[] P002J2_A86TBM37_DOM_ITM_GRP_ROWNO ;
   private boolean[] P002J2_n86TBM37_DOM_ITM_GRP_ROWNO ;
   private String[] P002J2_A433TBM37_DEL_FLG ;
   private boolean[] P002J2_n433TBM37_DEL_FLG ;
   private java.util.Date[] P002J2_A437TBM37_UPD_DATETIME ;
   private boolean[] P002J2_n437TBM37_UPD_DATETIME ;
   private String[] P002J2_A438TBM37_UPD_USER_ID ;
   private boolean[] P002J2_n438TBM37_UPD_USER_ID ;
   private String[] P002J2_A439TBM37_UPD_PROG_NM ;
   private boolean[] P002J2_n439TBM37_UPD_PROG_NM ;
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
          new ForEachCursor("P002J2", "SELECT `TBM37_CRF_ITEM_GRP_CD`, `TBM37_CRF_ITEM_GRP_DIV`, `TBM37_CRF_ID`, `TBM37_STUDY_ID`, `TBM37_CRT_DATETIME`, `TBM37_CRT_USER_ID`, `TBM37_CRT_PROG_NM`, `TBM37_UPD_CNT`, `TBM37_VISIT_NO`, `TBM37_DOM_CD`, `TBM37_DOM_VAR_NM`, `TBM37_DOM_ITM_GRP_OID`, `TBM37_DOM_ITM_GRP_ATTR_SEQ`, `TBM37_DOM_ITM_GRP_ROWNO`, `TBM37_DEL_FLG`, `TBM37_UPD_DATETIME`, `TBM37_UPD_USER_ID`, `TBM37_UPD_PROG_NM` FROM `TBM37_CRF_DOM_MAP` WHERE `TBM37_STUDY_ID` = ? and `TBM37_CRF_ID` = ? ORDER BY `TBM37_STUDY_ID`, `TBM37_CRF_ID`  FOR UPDATE ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new UpdateCursor("P002J3", "UPDATE `TBM37_CRF_DOM_MAP` SET `TBM37_UPD_CNT`=?, `TBM37_VISIT_NO`=?, `TBM37_DOM_CD`=?, `TBM37_DOM_VAR_NM`=?, `TBM37_DOM_ITM_GRP_OID`=?, `TBM37_DOM_ITM_GRP_ATTR_SEQ`=?, `TBM37_DOM_ITM_GRP_ROWNO`=?, `TBM37_DEL_FLG`=?, `TBM37_UPD_DATETIME`=?, `TBM37_UPD_USER_ID`=?, `TBM37_UPD_PROG_NM`=?  WHERE `TBM37_STUDY_ID` = ? AND `TBM37_CRF_ID` = ? AND `TBM37_CRF_ITEM_GRP_DIV` = ? AND `TBM37_CRF_ITEM_GRP_CD` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P002J4", "INSERT INTO `TBM37_CRF_DOM_MAP`(`TBM37_STUDY_ID`, `TBM37_CRF_ID`, `TBM37_CRF_ITEM_GRP_DIV`, `TBM37_CRF_ITEM_GRP_CD`, `TBM37_VISIT_NO`, `TBM37_DOM_CD`, `TBM37_DOM_VAR_NM`, `TBM37_DOM_ITM_GRP_OID`, `TBM37_DOM_ITM_GRP_ATTR_SEQ`, `TBM37_DOM_ITM_GRP_ROWNO`, `TBM37_DEL_FLG`, `TBM37_CRT_DATETIME`, `TBM37_CRT_USER_ID`, `TBM37_CRT_PROG_NM`, `TBM37_UPD_DATETIME`, `TBM37_UPD_USER_ID`, `TBM37_UPD_PROG_NM`, `TBM37_UPD_CNT`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
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
               ((int[]) buf[12])[0] = rslt.getInt(9) ;
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
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[5], 16);
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
               return;
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
                  stmt.setInt(5, ((Number) parms[5]).intValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[7], 16);
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
               return;
      }
   }

}

