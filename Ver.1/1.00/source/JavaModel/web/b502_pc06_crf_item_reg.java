/*
               File: B502_PC06_CRF_ITEM_REG
        Description: CRF項目マスタ登録
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:4.79
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b502_pc06_crf_item_reg extends GXProcedure
{
   public b502_pc06_crf_item_reg( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b502_pc06_crf_item_reg.class ), "" );
   }

   public b502_pc06_crf_item_reg( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public GxObjectCollection executeUdp( String aP0 ,
                                         String aP1 ,
                                         String aP2 ,
                                         short[] aP3 )
   {
      b502_pc06_crf_item_reg.this.AV11P_STUDY_ID = aP0;
      b502_pc06_crf_item_reg.this.AV9P_CRF_ID = aP1;
      b502_pc06_crf_item_reg.this.AV10P_CRF_ITEM = aP2;
      b502_pc06_crf_item_reg.this.AV24W_RTN_MSG = aP4[0];
      b502_pc06_crf_item_reg.this.aP4 = new GxObjectCollection[] {new GxObjectCollection()};
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
      b502_pc06_crf_item_reg.this.AV11P_STUDY_ID = aP0;
      b502_pc06_crf_item_reg.this.AV9P_CRF_ID = aP1;
      b502_pc06_crf_item_reg.this.AV10P_CRF_ITEM = aP2;
      b502_pc06_crf_item_reg.this.aP3 = aP3;
      b502_pc06_crf_item_reg.this.AV24W_RTN_MSG = aP4[0];
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
      b502_pc06_crf_item_reg.this.GXt_char1 = GXv_char2[0] ;
      AV21W_NEWLINE = GXt_char1 ;
      AV18W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV18W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV8C_APP_ID );
      GXt_char1 = AV27W_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      b502_pc06_crf_item_reg.this.GXt_char1 = GXv_char2[0] ;
      AV27W_USER_ID = GXt_char1 ;
      AV28W_UPDATE_TIME = GXutil.now( ) ;
      /* Execute user subroutine: S12223 */
      S12223 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      GXt_objcol_char3 = AV15W_CSV_ROW ;
      GXv_objcol_char4[0] = GXt_objcol_char3 ;
      new b807_pc01_csv_row_parse(remoteHandle, context).execute( AV10P_CRF_ITEM, GXv_objcol_char4) ;
      GXt_objcol_char3 = GXv_objcol_char4[0] ;
      AV15W_CSV_ROW = GXt_objcol_char3 ;
      AV12W_CNT = 1 ;
      while ( AV12W_CNT <= AV15W_CSV_ROW.size() )
      {
         AV16W_ERR_CD = (short)(0) ;
         GXv_objcol_char4[0] = AV14W_CSV_COL ;
         GXv_int5[0] = AV16W_ERR_CD ;
         GXv_char2[0] = AV20W_MSG ;
         new b807_pc02_csv_col_parse_air(remoteHandle, context).execute( (String)AV15W_CSV_ROW.elementAt(-1+(int)(AV12W_CNT)), 40, "CSV", GXv_objcol_char4, GXv_int5, GXv_char2) ;
         AV14W_CSV_COL = GXv_objcol_char4[0] ;
         b502_pc06_crf_item_reg.this.AV16W_ERR_CD = GXv_int5[0] ;
         b502_pc06_crf_item_reg.this.AV20W_MSG = GXv_char2[0] ;
         if ( AV16W_ERR_CD == 0 )
         {
            if ( ! (GXutil.strcmp("", AV11P_STUDY_ID)==0) && ( GXutil.strcmp(AV11P_STUDY_ID, (String)AV14W_CSV_COL.elementAt(-1+1)) != 0 ) )
            {
               AV16W_ERR_CD = (short)(1) ;
               GXt_char1 = AV20W_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AE00063", "試験", "", "", "", "", GXv_char2) ;
               b502_pc06_crf_item_reg.this.GXt_char1 = GXv_char2[0] ;
               AV20W_MSG = GXt_char1 ;
            }
            if ( ! (GXutil.strcmp("", AV9P_CRF_ID)==0) && ( GXutil.strcmp(AV9P_CRF_ID, (String)AV14W_CSV_COL.elementAt(-1+2)) != 0 ) )
            {
               AV16W_ERR_CD = (short)(1) ;
               GXt_char1 = AV20W_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AE00063", "CRF", "", "", "", "", GXv_char2) ;
               b502_pc06_crf_item_reg.this.GXt_char1 = GXv_char2[0] ;
               AV20W_MSG = GXt_char1 ;
            }
         }
         if ( AV16W_ERR_CD != 0 )
         {
            AV23W_RTN_CD = (short)(1) ;
            AV20W_MSG = "CRF項目マスタ：" + GXutil.trim( GXutil.str( AV12W_CNT, 10, 0)) + "行目：" + AV20W_MSG ;
            AV24W_RTN_MSG.add(AV20W_MSG, 0);
         }
         if ( AV23W_RTN_CD == 0 )
         {
            /* Execute user subroutine: S1176 */
            S1176 ();
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
            b502_pc06_crf_item_reg.this.GXt_char1 = GXv_char2[0] ;
            AV20W_MSG = GXt_char1 ;
            AV24W_RTN_MSG.add(AV20W_MSG, 0);
            if (true) break;
         }
         AV12W_CNT = (long)(AV12W_CNT+1) ;
      }
      cleanup();
   }

   public void S1176( )
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
      AV41GXLvl90 = (byte)(0) ;
      Gx_ope = "Fetch" ;
      Gx_etb = "TBM32_CRF_ITEM" ;
      /* Using cursor P002H2 */
      pr_default.execute(0, new Object[] {new Long(AV25W_STUDY_ID), new Short(AV13W_CRF_ID)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A233TBM32_CRF_ITEM_CD = P002H2_A233TBM32_CRF_ITEM_CD[0] ;
         A232TBM32_CRF_ID = P002H2_A232TBM32_CRF_ID[0] ;
         A231TBM32_STUDY_ID = P002H2_A231TBM32_STUDY_ID[0] ;
         A239TBM32_CRT_DATETIME = P002H2_A239TBM32_CRT_DATETIME[0] ;
         n239TBM32_CRT_DATETIME = P002H2_n239TBM32_CRT_DATETIME[0] ;
         A240TBM32_CRT_USER_ID = P002H2_A240TBM32_CRT_USER_ID[0] ;
         n240TBM32_CRT_USER_ID = P002H2_n240TBM32_CRT_USER_ID[0] ;
         A241TBM32_CRT_PROG_NM = P002H2_A241TBM32_CRT_PROG_NM[0] ;
         n241TBM32_CRT_PROG_NM = P002H2_n241TBM32_CRT_PROG_NM[0] ;
         A245TBM32_UPD_CNT = P002H2_A245TBM32_UPD_CNT[0] ;
         n245TBM32_UPD_CNT = P002H2_n245TBM32_UPD_CNT[0] ;
         A234TBM32_CRF_ITEM_NM = P002H2_A234TBM32_CRF_ITEM_NM[0] ;
         n234TBM32_CRF_ITEM_NM = P002H2_n234TBM32_CRF_ITEM_NM[0] ;
         A235TBM32_CRF_ITEM_DIV = P002H2_A235TBM32_CRF_ITEM_DIV[0] ;
         n235TBM32_CRF_ITEM_DIV = P002H2_n235TBM32_CRF_ITEM_DIV[0] ;
         A236TBM32_CRF_ITEM_GRP_CD = P002H2_A236TBM32_CRF_ITEM_GRP_CD[0] ;
         n236TBM32_CRF_ITEM_GRP_CD = P002H2_n236TBM32_CRF_ITEM_GRP_CD[0] ;
         A384TBM32_CRF_ITEM_GRP_ORDER = P002H2_A384TBM32_CRF_ITEM_GRP_ORDER[0] ;
         n384TBM32_CRF_ITEM_GRP_ORDER = P002H2_n384TBM32_CRF_ITEM_GRP_ORDER[0] ;
         A385TBM32_LOCATION_X = P002H2_A385TBM32_LOCATION_X[0] ;
         n385TBM32_LOCATION_X = P002H2_n385TBM32_LOCATION_X[0] ;
         A386TBM32_LOCATION_Y = P002H2_A386TBM32_LOCATION_Y[0] ;
         n386TBM32_LOCATION_Y = P002H2_n386TBM32_LOCATION_Y[0] ;
         A387TBM32_LOCATION_X2 = P002H2_A387TBM32_LOCATION_X2[0] ;
         n387TBM32_LOCATION_X2 = P002H2_n387TBM32_LOCATION_X2[0] ;
         A388TBM32_LOCATION_Y2 = P002H2_A388TBM32_LOCATION_Y2[0] ;
         n388TBM32_LOCATION_Y2 = P002H2_n388TBM32_LOCATION_Y2[0] ;
         A389TBM32_TEXT_ALIGN_DIV = P002H2_A389TBM32_TEXT_ALIGN_DIV[0] ;
         n389TBM32_TEXT_ALIGN_DIV = P002H2_n389TBM32_TEXT_ALIGN_DIV[0] ;
         A393TBM32_TEXT_MAXROWS = P002H2_A393TBM32_TEXT_MAXROWS[0] ;
         n393TBM32_TEXT_MAXROWS = P002H2_n393TBM32_TEXT_MAXROWS[0] ;
         A394TBM32_TEXT_MAXLENGTH = P002H2_A394TBM32_TEXT_MAXLENGTH[0] ;
         n394TBM32_TEXT_MAXLENGTH = P002H2_n394TBM32_TEXT_MAXLENGTH[0] ;
         A395TBM32_DECIMAL_DIGITS = P002H2_A395TBM32_DECIMAL_DIGITS[0] ;
         n395TBM32_DECIMAL_DIGITS = P002H2_n395TBM32_DECIMAL_DIGITS[0] ;
         A399TBM32_CHK_TRUE_INNER_VALUE = P002H2_A399TBM32_CHK_TRUE_INNER_VALUE[0] ;
         n399TBM32_CHK_TRUE_INNER_VALUE = P002H2_n399TBM32_CHK_TRUE_INNER_VALUE[0] ;
         A400TBM32_CHK_FALSE_INNER_VALUE = P002H2_A400TBM32_CHK_FALSE_INNER_VALUE[0] ;
         n400TBM32_CHK_FALSE_INNER_VALUE = P002H2_n400TBM32_CHK_FALSE_INNER_VALUE[0] ;
         A404TBM32_FIXED_VALUE = P002H2_A404TBM32_FIXED_VALUE[0] ;
         n404TBM32_FIXED_VALUE = P002H2_n404TBM32_FIXED_VALUE[0] ;
         A402TBM32_LIST_CD = P002H2_A402TBM32_LIST_CD[0] ;
         n402TBM32_LIST_CD = P002H2_n402TBM32_LIST_CD[0] ;
         A403TBM32_IMAGE_CD = P002H2_A403TBM32_IMAGE_CD[0] ;
         n403TBM32_IMAGE_CD = P002H2_n403TBM32_IMAGE_CD[0] ;
         A401TBM32_TEXT = P002H2_A401TBM32_TEXT[0] ;
         n401TBM32_TEXT = P002H2_n401TBM32_TEXT[0] ;
         A390TBM32_FONT_SIZE = P002H2_A390TBM32_FONT_SIZE[0] ;
         n390TBM32_FONT_SIZE = P002H2_n390TBM32_FONT_SIZE[0] ;
         A391TBM32_FONT_UL_FLG = P002H2_A391TBM32_FONT_UL_FLG[0] ;
         n391TBM32_FONT_UL_FLG = P002H2_n391TBM32_FONT_UL_FLG[0] ;
         A392TBM32_FONT_COLOR_DIV = P002H2_A392TBM32_FONT_COLOR_DIV[0] ;
         n392TBM32_FONT_COLOR_DIV = P002H2_n392TBM32_FONT_COLOR_DIV[0] ;
         A398TBM32_LINE_SIZE_DIV = P002H2_A398TBM32_LINE_SIZE_DIV[0] ;
         n398TBM32_LINE_SIZE_DIV = P002H2_n398TBM32_LINE_SIZE_DIV[0] ;
         A603TBM32_LINE_COLOR_DIV = P002H2_A603TBM32_LINE_COLOR_DIV[0] ;
         n603TBM32_LINE_COLOR_DIV = P002H2_n603TBM32_LINE_COLOR_DIV[0] ;
         A396TBM32_LINE_START_POINT_DIV = P002H2_A396TBM32_LINE_START_POINT_DIV[0] ;
         n396TBM32_LINE_START_POINT_DIV = P002H2_n396TBM32_LINE_START_POINT_DIV[0] ;
         A397TBM32_LINE_END_POINT_DIV = P002H2_A397TBM32_LINE_END_POINT_DIV[0] ;
         n397TBM32_LINE_END_POINT_DIV = P002H2_n397TBM32_LINE_END_POINT_DIV[0] ;
         A604TBM32_LINE_ANGLE = P002H2_A604TBM32_LINE_ANGLE[0] ;
         n604TBM32_LINE_ANGLE = P002H2_n604TBM32_LINE_ANGLE[0] ;
         A552TBM32_AUTH_LVL_MIN = P002H2_A552TBM32_AUTH_LVL_MIN[0] ;
         n552TBM32_AUTH_LVL_MIN = P002H2_n552TBM32_AUTH_LVL_MIN[0] ;
         A553TBM32_ZORDER = P002H2_A553TBM32_ZORDER[0] ;
         n553TBM32_ZORDER = P002H2_n553TBM32_ZORDER[0] ;
         A605TBM32_TAB_ORDER = P002H2_A605TBM32_TAB_ORDER[0] ;
         n605TBM32_TAB_ORDER = P002H2_n605TBM32_TAB_ORDER[0] ;
         A606TBM32_TABSTOP_FLG = P002H2_A606TBM32_TABSTOP_FLG[0] ;
         n606TBM32_TABSTOP_FLG = P002H2_n606TBM32_TABSTOP_FLG[0] ;
         A607TBM32_REQUIRED_INPUT_FLG = P002H2_A607TBM32_REQUIRED_INPUT_FLG[0] ;
         n607TBM32_REQUIRED_INPUT_FLG = P002H2_n607TBM32_REQUIRED_INPUT_FLG[0] ;
         A608TBM32_MIN_VALUE = P002H2_A608TBM32_MIN_VALUE[0] ;
         n608TBM32_MIN_VALUE = P002H2_n608TBM32_MIN_VALUE[0] ;
         A609TBM32_MAX_VALUE = P002H2_A609TBM32_MAX_VALUE[0] ;
         n609TBM32_MAX_VALUE = P002H2_n609TBM32_MAX_VALUE[0] ;
         A237TBM32_CRF_ITEM_NOTE = P002H2_A237TBM32_CRF_ITEM_NOTE[0] ;
         n237TBM32_CRF_ITEM_NOTE = P002H2_n237TBM32_CRF_ITEM_NOTE[0] ;
         A746TBM32_REF_CRF_ID = P002H2_A746TBM32_REF_CRF_ID[0] ;
         n746TBM32_REF_CRF_ID = P002H2_n746TBM32_REF_CRF_ID[0] ;
         A747TBM32_REF_CRF_ITEM_CD = P002H2_A747TBM32_REF_CRF_ITEM_CD[0] ;
         n747TBM32_REF_CRF_ITEM_CD = P002H2_n747TBM32_REF_CRF_ITEM_CD[0] ;
         A238TBM32_DEL_FLG = P002H2_A238TBM32_DEL_FLG[0] ;
         n238TBM32_DEL_FLG = P002H2_n238TBM32_DEL_FLG[0] ;
         A242TBM32_UPD_DATETIME = P002H2_A242TBM32_UPD_DATETIME[0] ;
         n242TBM32_UPD_DATETIME = P002H2_n242TBM32_UPD_DATETIME[0] ;
         A243TBM32_UPD_USER_ID = P002H2_A243TBM32_UPD_USER_ID[0] ;
         n243TBM32_UPD_USER_ID = P002H2_n243TBM32_UPD_USER_ID[0] ;
         A244TBM32_UPD_PROG_NM = P002H2_A244TBM32_UPD_PROG_NM[0] ;
         n244TBM32_UPD_PROG_NM = P002H2_n244TBM32_UPD_PROG_NM[0] ;
         if ( GXutil.strcmp(A233TBM32_CRF_ITEM_CD, (String)AV14W_CSV_COL.elementAt(-1+3)) == 0 )
         {
            AV41GXLvl90 = (byte)(1) ;
            AV37P_LOGKBN = "UPD" ;
            AV30W_CRT_DATETIME = A239TBM32_CRT_DATETIME ;
            AV31W_CRT_USER_ID = A240TBM32_CRT_USER_ID ;
            AV32W_CRT_PROG_NM = A241TBM32_CRT_PROG_NM ;
            AV29W_UPD_CNT = (long)(A245TBM32_UPD_CNT+1) ;
            A234TBM32_CRF_ITEM_NM = (String)AV14W_CSV_COL.elementAt(-1+4) ;
            n234TBM32_CRF_ITEM_NM = false ;
            A235TBM32_CRF_ITEM_DIV = (String)AV14W_CSV_COL.elementAt(-1+5) ;
            n235TBM32_CRF_ITEM_DIV = false ;
            A236TBM32_CRF_ITEM_GRP_CD = (String)AV14W_CSV_COL.elementAt(-1+6) ;
            n236TBM32_CRF_ITEM_GRP_CD = false ;
            A384TBM32_CRF_ITEM_GRP_ORDER = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+7))) ;
            n384TBM32_CRF_ITEM_GRP_ORDER = false ;
            A385TBM32_LOCATION_X = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+8))) ;
            n385TBM32_LOCATION_X = false ;
            A386TBM32_LOCATION_Y = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+9))) ;
            n386TBM32_LOCATION_Y = false ;
            A387TBM32_LOCATION_X2 = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+10))) ;
            n387TBM32_LOCATION_X2 = false ;
            A388TBM32_LOCATION_Y2 = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+11))) ;
            n388TBM32_LOCATION_Y2 = false ;
            if ( GXutil.strcmp((String)AV14W_CSV_COL.elementAt(-1+5), "Group") == 0 )
            {
               if ( ( GXutil.val( (String)AV14W_CSV_COL.elementAt(-1+10), ".") > 9999 ) || ( GXutil.val( (String)AV14W_CSV_COL.elementAt(-1+10), ".") < 0 ) )
               {
                  A387TBM32_LOCATION_X2 = (short)(9999) ;
                  n387TBM32_LOCATION_X2 = false ;
               }
               if ( ( GXutil.val( (String)AV14W_CSV_COL.elementAt(-1+11), ".") > 9999 ) || ( GXutil.val( (String)AV14W_CSV_COL.elementAt(-1+11), ".") < 0 ) )
               {
                  A388TBM32_LOCATION_Y2 = (short)(9999) ;
                  n388TBM32_LOCATION_Y2 = false ;
               }
            }
            A389TBM32_TEXT_ALIGN_DIV = (String)AV14W_CSV_COL.elementAt(-1+12) ;
            n389TBM32_TEXT_ALIGN_DIV = false ;
            A393TBM32_TEXT_MAXROWS = (byte)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+13))) ;
            n393TBM32_TEXT_MAXROWS = false ;
            A394TBM32_TEXT_MAXLENGTH = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+14))) ;
            n394TBM32_TEXT_MAXLENGTH = false ;
            A395TBM32_DECIMAL_DIGITS = (byte)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+15))) ;
            n395TBM32_DECIMAL_DIGITS = false ;
            A399TBM32_CHK_TRUE_INNER_VALUE = (String)AV14W_CSV_COL.elementAt(-1+16) ;
            n399TBM32_CHK_TRUE_INNER_VALUE = false ;
            A400TBM32_CHK_FALSE_INNER_VALUE = (String)AV14W_CSV_COL.elementAt(-1+17) ;
            n400TBM32_CHK_FALSE_INNER_VALUE = false ;
            A404TBM32_FIXED_VALUE = (String)AV14W_CSV_COL.elementAt(-1+18) ;
            n404TBM32_FIXED_VALUE = false ;
            A402TBM32_LIST_CD = (String)AV14W_CSV_COL.elementAt(-1+19) ;
            n402TBM32_LIST_CD = false ;
            A403TBM32_IMAGE_CD = (String)AV14W_CSV_COL.elementAt(-1+20) ;
            n403TBM32_IMAGE_CD = false ;
            A401TBM32_TEXT = (String)AV14W_CSV_COL.elementAt(-1+21) ;
            n401TBM32_TEXT = false ;
            A390TBM32_FONT_SIZE = (byte)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+22))) ;
            n390TBM32_FONT_SIZE = false ;
            A391TBM32_FONT_UL_FLG = (String)AV14W_CSV_COL.elementAt(-1+23) ;
            n391TBM32_FONT_UL_FLG = false ;
            A392TBM32_FONT_COLOR_DIV = GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+24)) ;
            n392TBM32_FONT_COLOR_DIV = false ;
            A398TBM32_LINE_SIZE_DIV = (byte)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+25))) ;
            n398TBM32_LINE_SIZE_DIV = false ;
            A603TBM32_LINE_COLOR_DIV = GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+26)) ;
            n603TBM32_LINE_COLOR_DIV = false ;
            A396TBM32_LINE_START_POINT_DIV = (String)AV14W_CSV_COL.elementAt(-1+27) ;
            n396TBM32_LINE_START_POINT_DIV = false ;
            A397TBM32_LINE_END_POINT_DIV = (String)AV14W_CSV_COL.elementAt(-1+28) ;
            n397TBM32_LINE_END_POINT_DIV = false ;
            A604TBM32_LINE_ANGLE = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+29))) ;
            n604TBM32_LINE_ANGLE = false ;
            A552TBM32_AUTH_LVL_MIN = (byte)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+30))) ;
            n552TBM32_AUTH_LVL_MIN = false ;
            A553TBM32_ZORDER = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+31))) ;
            n553TBM32_ZORDER = false ;
            A605TBM32_TAB_ORDER = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+32))) ;
            n605TBM32_TAB_ORDER = false ;
            A606TBM32_TABSTOP_FLG = (String)AV14W_CSV_COL.elementAt(-1+33) ;
            n606TBM32_TABSTOP_FLG = false ;
            A607TBM32_REQUIRED_INPUT_FLG = (String)AV14W_CSV_COL.elementAt(-1+34) ;
            n607TBM32_REQUIRED_INPUT_FLG = false ;
            A608TBM32_MIN_VALUE = (String)AV14W_CSV_COL.elementAt(-1+35) ;
            n608TBM32_MIN_VALUE = false ;
            A609TBM32_MAX_VALUE = (String)AV14W_CSV_COL.elementAt(-1+36) ;
            n609TBM32_MAX_VALUE = false ;
            A237TBM32_CRF_ITEM_NOTE = (String)AV14W_CSV_COL.elementAt(-1+37) ;
            n237TBM32_CRF_ITEM_NOTE = false ;
            A746TBM32_REF_CRF_ID = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+38))) ;
            n746TBM32_REF_CRF_ID = false ;
            A747TBM32_REF_CRF_ITEM_CD = (String)AV14W_CSV_COL.elementAt(-1+39) ;
            n747TBM32_REF_CRF_ITEM_CD = false ;
            A238TBM32_DEL_FLG = (String)AV14W_CSV_COL.elementAt(-1+40) ;
            n238TBM32_DEL_FLG = false ;
            A242TBM32_UPD_DATETIME = GXutil.now( ) ;
            n242TBM32_UPD_DATETIME = false ;
            A243TBM32_UPD_USER_ID = AV27W_USER_ID ;
            n243TBM32_UPD_USER_ID = false ;
            A244TBM32_UPD_PROG_NM = AV40Pgmname ;
            n244TBM32_UPD_PROG_NM = false ;
            A245TBM32_UPD_CNT = AV29W_UPD_CNT ;
            n245TBM32_UPD_CNT = false ;
            Gx_ope = "Update" ;
            Gx_etb = "TBM32_CRF_ITEM" ;
            /* Using cursor P002H3 */
            pr_default.execute(1, new Object[] {new Boolean(n245TBM32_UPD_CNT), new Long(A245TBM32_UPD_CNT), new Boolean(n234TBM32_CRF_ITEM_NM), A234TBM32_CRF_ITEM_NM, new Boolean(n235TBM32_CRF_ITEM_DIV), A235TBM32_CRF_ITEM_DIV, new Boolean(n236TBM32_CRF_ITEM_GRP_CD), A236TBM32_CRF_ITEM_GRP_CD, new Boolean(n384TBM32_CRF_ITEM_GRP_ORDER), new Short(A384TBM32_CRF_ITEM_GRP_ORDER), new Boolean(n385TBM32_LOCATION_X), new Short(A385TBM32_LOCATION_X), new Boolean(n386TBM32_LOCATION_Y), new Short(A386TBM32_LOCATION_Y), new Boolean(n387TBM32_LOCATION_X2), new Short(A387TBM32_LOCATION_X2), new Boolean(n388TBM32_LOCATION_Y2), new Short(A388TBM32_LOCATION_Y2), new Boolean(n389TBM32_TEXT_ALIGN_DIV), A389TBM32_TEXT_ALIGN_DIV, new Boolean(n393TBM32_TEXT_MAXROWS), new Byte(A393TBM32_TEXT_MAXROWS), new Boolean(n394TBM32_TEXT_MAXLENGTH), new Short(A394TBM32_TEXT_MAXLENGTH), new Boolean(n395TBM32_DECIMAL_DIGITS), new Byte(A395TBM32_DECIMAL_DIGITS), new Boolean(n399TBM32_CHK_TRUE_INNER_VALUE), A399TBM32_CHK_TRUE_INNER_VALUE, new Boolean(n400TBM32_CHK_FALSE_INNER_VALUE), A400TBM32_CHK_FALSE_INNER_VALUE, new Boolean(n404TBM32_FIXED_VALUE), A404TBM32_FIXED_VALUE, new Boolean(n402TBM32_LIST_CD), A402TBM32_LIST_CD, new Boolean(n403TBM32_IMAGE_CD), A403TBM32_IMAGE_CD, new Boolean(n401TBM32_TEXT), A401TBM32_TEXT, new Boolean(n390TBM32_FONT_SIZE), new Byte(A390TBM32_FONT_SIZE), new Boolean(n391TBM32_FONT_UL_FLG), A391TBM32_FONT_UL_FLG, new Boolean(n392TBM32_FONT_COLOR_DIV), new Long(A392TBM32_FONT_COLOR_DIV), new Boolean(n398TBM32_LINE_SIZE_DIV), new Byte(A398TBM32_LINE_SIZE_DIV), new Boolean(n603TBM32_LINE_COLOR_DIV), new Long(A603TBM32_LINE_COLOR_DIV), new Boolean(n396TBM32_LINE_START_POINT_DIV), A396TBM32_LINE_START_POINT_DIV, new Boolean(n397TBM32_LINE_END_POINT_DIV), A397TBM32_LINE_END_POINT_DIV, new Boolean(n604TBM32_LINE_ANGLE), new Short(A604TBM32_LINE_ANGLE), new Boolean(n552TBM32_AUTH_LVL_MIN), new Byte(A552TBM32_AUTH_LVL_MIN), new Boolean(n553TBM32_ZORDER), new Short(A553TBM32_ZORDER), new Boolean(n605TBM32_TAB_ORDER), new Short(A605TBM32_TAB_ORDER), new Boolean(n606TBM32_TABSTOP_FLG), A606TBM32_TABSTOP_FLG, new Boolean(n607TBM32_REQUIRED_INPUT_FLG), A607TBM32_REQUIRED_INPUT_FLG, new Boolean(n608TBM32_MIN_VALUE), A608TBM32_MIN_VALUE, new Boolean(n609TBM32_MAX_VALUE), A609TBM32_MAX_VALUE, new Boolean(n237TBM32_CRF_ITEM_NOTE), A237TBM32_CRF_ITEM_NOTE, new Boolean(n746TBM32_REF_CRF_ID), new Short(A746TBM32_REF_CRF_ID), new Boolean(n747TBM32_REF_CRF_ITEM_CD), A747TBM32_REF_CRF_ITEM_CD, new Boolean(n238TBM32_DEL_FLG), A238TBM32_DEL_FLG, new Boolean(n242TBM32_UPD_DATETIME), A242TBM32_UPD_DATETIME, new Boolean(n243TBM32_UPD_USER_ID), A243TBM32_UPD_USER_ID, new Boolean(n244TBM32_UPD_PROG_NM), A244TBM32_UPD_PROG_NM, new Long(A231TBM32_STUDY_ID), new Short(A232TBM32_CRF_ID), A233TBM32_CRF_ITEM_CD});
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV41GXLvl90 == 0 )
      {
         AV37P_LOGKBN = "INS" ;
         /*
            INSERT RECORD ON TABLE TBM32_CRF_ITEM

         */
         A231TBM32_STUDY_ID = GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+1)) ;
         A232TBM32_CRF_ID = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+2))) ;
         A233TBM32_CRF_ITEM_CD = (String)AV14W_CSV_COL.elementAt(-1+3) ;
         A234TBM32_CRF_ITEM_NM = (String)AV14W_CSV_COL.elementAt(-1+4) ;
         n234TBM32_CRF_ITEM_NM = false ;
         A235TBM32_CRF_ITEM_DIV = (String)AV14W_CSV_COL.elementAt(-1+5) ;
         n235TBM32_CRF_ITEM_DIV = false ;
         A236TBM32_CRF_ITEM_GRP_CD = (String)AV14W_CSV_COL.elementAt(-1+6) ;
         n236TBM32_CRF_ITEM_GRP_CD = false ;
         A384TBM32_CRF_ITEM_GRP_ORDER = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+7))) ;
         n384TBM32_CRF_ITEM_GRP_ORDER = false ;
         A385TBM32_LOCATION_X = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+8))) ;
         n385TBM32_LOCATION_X = false ;
         A386TBM32_LOCATION_Y = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+9))) ;
         n386TBM32_LOCATION_Y = false ;
         A387TBM32_LOCATION_X2 = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+10))) ;
         n387TBM32_LOCATION_X2 = false ;
         A388TBM32_LOCATION_Y2 = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+11))) ;
         n388TBM32_LOCATION_Y2 = false ;
         A389TBM32_TEXT_ALIGN_DIV = (String)AV14W_CSV_COL.elementAt(-1+12) ;
         n389TBM32_TEXT_ALIGN_DIV = false ;
         A393TBM32_TEXT_MAXROWS = (byte)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+13))) ;
         n393TBM32_TEXT_MAXROWS = false ;
         A394TBM32_TEXT_MAXLENGTH = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+14))) ;
         n394TBM32_TEXT_MAXLENGTH = false ;
         A395TBM32_DECIMAL_DIGITS = (byte)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+15))) ;
         n395TBM32_DECIMAL_DIGITS = false ;
         A399TBM32_CHK_TRUE_INNER_VALUE = (String)AV14W_CSV_COL.elementAt(-1+16) ;
         n399TBM32_CHK_TRUE_INNER_VALUE = false ;
         A400TBM32_CHK_FALSE_INNER_VALUE = (String)AV14W_CSV_COL.elementAt(-1+17) ;
         n400TBM32_CHK_FALSE_INNER_VALUE = false ;
         A404TBM32_FIXED_VALUE = (String)AV14W_CSV_COL.elementAt(-1+18) ;
         n404TBM32_FIXED_VALUE = false ;
         A402TBM32_LIST_CD = (String)AV14W_CSV_COL.elementAt(-1+19) ;
         n402TBM32_LIST_CD = false ;
         A403TBM32_IMAGE_CD = (String)AV14W_CSV_COL.elementAt(-1+20) ;
         n403TBM32_IMAGE_CD = false ;
         A401TBM32_TEXT = (String)AV14W_CSV_COL.elementAt(-1+21) ;
         n401TBM32_TEXT = false ;
         A390TBM32_FONT_SIZE = (byte)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+22))) ;
         n390TBM32_FONT_SIZE = false ;
         A391TBM32_FONT_UL_FLG = (String)AV14W_CSV_COL.elementAt(-1+23) ;
         n391TBM32_FONT_UL_FLG = false ;
         A392TBM32_FONT_COLOR_DIV = GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+24)) ;
         n392TBM32_FONT_COLOR_DIV = false ;
         A398TBM32_LINE_SIZE_DIV = (byte)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+25))) ;
         n398TBM32_LINE_SIZE_DIV = false ;
         A603TBM32_LINE_COLOR_DIV = GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+26)) ;
         n603TBM32_LINE_COLOR_DIV = false ;
         A396TBM32_LINE_START_POINT_DIV = (String)AV14W_CSV_COL.elementAt(-1+27) ;
         n396TBM32_LINE_START_POINT_DIV = false ;
         A397TBM32_LINE_END_POINT_DIV = (String)AV14W_CSV_COL.elementAt(-1+28) ;
         n397TBM32_LINE_END_POINT_DIV = false ;
         A604TBM32_LINE_ANGLE = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+29))) ;
         n604TBM32_LINE_ANGLE = false ;
         A552TBM32_AUTH_LVL_MIN = (byte)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+30))) ;
         n552TBM32_AUTH_LVL_MIN = false ;
         A553TBM32_ZORDER = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+31))) ;
         n553TBM32_ZORDER = false ;
         A605TBM32_TAB_ORDER = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+32))) ;
         n605TBM32_TAB_ORDER = false ;
         A606TBM32_TABSTOP_FLG = (String)AV14W_CSV_COL.elementAt(-1+33) ;
         n606TBM32_TABSTOP_FLG = false ;
         A607TBM32_REQUIRED_INPUT_FLG = (String)AV14W_CSV_COL.elementAt(-1+34) ;
         n607TBM32_REQUIRED_INPUT_FLG = false ;
         A608TBM32_MIN_VALUE = (String)AV14W_CSV_COL.elementAt(-1+35) ;
         n608TBM32_MIN_VALUE = false ;
         A609TBM32_MAX_VALUE = (String)AV14W_CSV_COL.elementAt(-1+36) ;
         n609TBM32_MAX_VALUE = false ;
         A237TBM32_CRF_ITEM_NOTE = (String)AV14W_CSV_COL.elementAt(-1+37) ;
         n237TBM32_CRF_ITEM_NOTE = false ;
         A746TBM32_REF_CRF_ID = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+38))) ;
         n746TBM32_REF_CRF_ID = false ;
         A747TBM32_REF_CRF_ITEM_CD = (String)AV14W_CSV_COL.elementAt(-1+39) ;
         n747TBM32_REF_CRF_ITEM_CD = false ;
         A238TBM32_DEL_FLG = (String)AV14W_CSV_COL.elementAt(-1+40) ;
         n238TBM32_DEL_FLG = false ;
         A239TBM32_CRT_DATETIME = GXutil.now( ) ;
         n239TBM32_CRT_DATETIME = false ;
         A240TBM32_CRT_USER_ID = AV27W_USER_ID ;
         n240TBM32_CRT_USER_ID = false ;
         A241TBM32_CRT_PROG_NM = AV40Pgmname ;
         n241TBM32_CRT_PROG_NM = false ;
         A242TBM32_UPD_DATETIME = GXutil.now( ) ;
         n242TBM32_UPD_DATETIME = false ;
         A243TBM32_UPD_USER_ID = AV27W_USER_ID ;
         n243TBM32_UPD_USER_ID = false ;
         A244TBM32_UPD_PROG_NM = AV40Pgmname ;
         n244TBM32_UPD_PROG_NM = false ;
         A245TBM32_UPD_CNT = 1 ;
         n245TBM32_UPD_CNT = false ;
         Gx_ope = "Insert" ;
         Gx_etb = "TBM32_CRF_ITEM" ;
         /* Using cursor P002H4 */
         pr_default.execute(2, new Object[] {new Long(A231TBM32_STUDY_ID), new Short(A232TBM32_CRF_ID), A233TBM32_CRF_ITEM_CD, new Boolean(n234TBM32_CRF_ITEM_NM), A234TBM32_CRF_ITEM_NM, new Boolean(n235TBM32_CRF_ITEM_DIV), A235TBM32_CRF_ITEM_DIV, new Boolean(n236TBM32_CRF_ITEM_GRP_CD), A236TBM32_CRF_ITEM_GRP_CD, new Boolean(n384TBM32_CRF_ITEM_GRP_ORDER), new Short(A384TBM32_CRF_ITEM_GRP_ORDER), new Boolean(n385TBM32_LOCATION_X), new Short(A385TBM32_LOCATION_X), new Boolean(n386TBM32_LOCATION_Y), new Short(A386TBM32_LOCATION_Y), new Boolean(n387TBM32_LOCATION_X2), new Short(A387TBM32_LOCATION_X2), new Boolean(n388TBM32_LOCATION_Y2), new Short(A388TBM32_LOCATION_Y2), new Boolean(n389TBM32_TEXT_ALIGN_DIV), A389TBM32_TEXT_ALIGN_DIV, new Boolean(n393TBM32_TEXT_MAXROWS), new Byte(A393TBM32_TEXT_MAXROWS), new Boolean(n394TBM32_TEXT_MAXLENGTH), new Short(A394TBM32_TEXT_MAXLENGTH), new Boolean(n395TBM32_DECIMAL_DIGITS), new Byte(A395TBM32_DECIMAL_DIGITS), new Boolean(n399TBM32_CHK_TRUE_INNER_VALUE), A399TBM32_CHK_TRUE_INNER_VALUE, new Boolean(n400TBM32_CHK_FALSE_INNER_VALUE), A400TBM32_CHK_FALSE_INNER_VALUE, new Boolean(n404TBM32_FIXED_VALUE), A404TBM32_FIXED_VALUE, new Boolean(n402TBM32_LIST_CD), A402TBM32_LIST_CD, new Boolean(n403TBM32_IMAGE_CD), A403TBM32_IMAGE_CD, new Boolean(n401TBM32_TEXT), A401TBM32_TEXT, new Boolean(n390TBM32_FONT_SIZE), new Byte(A390TBM32_FONT_SIZE), new Boolean(n391TBM32_FONT_UL_FLG), A391TBM32_FONT_UL_FLG, new Boolean(n392TBM32_FONT_COLOR_DIV), new Long(A392TBM32_FONT_COLOR_DIV), new Boolean(n398TBM32_LINE_SIZE_DIV), new Byte(A398TBM32_LINE_SIZE_DIV), new Boolean(n603TBM32_LINE_COLOR_DIV), new Long(A603TBM32_LINE_COLOR_DIV), new Boolean(n396TBM32_LINE_START_POINT_DIV), A396TBM32_LINE_START_POINT_DIV, new Boolean(n397TBM32_LINE_END_POINT_DIV), A397TBM32_LINE_END_POINT_DIV, new Boolean(n604TBM32_LINE_ANGLE), new Short(A604TBM32_LINE_ANGLE), new Boolean(n552TBM32_AUTH_LVL_MIN), new Byte(A552TBM32_AUTH_LVL_MIN), new Boolean(n553TBM32_ZORDER), new Short(A553TBM32_ZORDER), new Boolean(n605TBM32_TAB_ORDER), new Short(A605TBM32_TAB_ORDER), new Boolean(n606TBM32_TABSTOP_FLG), A606TBM32_TABSTOP_FLG, new Boolean(n607TBM32_REQUIRED_INPUT_FLG), A607TBM32_REQUIRED_INPUT_FLG, new Boolean(n608TBM32_MIN_VALUE), A608TBM32_MIN_VALUE, new Boolean(n609TBM32_MAX_VALUE), A609TBM32_MAX_VALUE, new Boolean(n237TBM32_CRF_ITEM_NOTE), A237TBM32_CRF_ITEM_NOTE, new Boolean(n746TBM32_REF_CRF_ID), new Short(A746TBM32_REF_CRF_ID), new Boolean(n747TBM32_REF_CRF_ITEM_CD), A747TBM32_REF_CRF_ITEM_CD, new Boolean(n238TBM32_DEL_FLG), A238TBM32_DEL_FLG, new Boolean(n239TBM32_CRT_DATETIME), A239TBM32_CRT_DATETIME, new Boolean(n240TBM32_CRT_USER_ID), A240TBM32_CRT_USER_ID, new Boolean(n241TBM32_CRT_PROG_NM), A241TBM32_CRT_PROG_NM, new Boolean(n242TBM32_UPD_DATETIME), A242TBM32_UPD_DATETIME, new Boolean(n243TBM32_UPD_USER_ID), A243TBM32_UPD_USER_ID, new Boolean(n244TBM32_UPD_PROG_NM), A244TBM32_UPD_PROG_NM, new Boolean(n245TBM32_UPD_CNT), new Long(A245TBM32_UPD_CNT)});
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
         new b808_pc02_data_log(remoteHandle, context).execute( AV40Pgmname, AV37P_LOGKBN, "TBM32_CRF_ITEM", AV14W_CSV_COL, AV30W_CRT_DATETIME, AV31W_CRT_USER_ID, AV32W_CRT_PROG_NM, AV33W_UPD_DATETIME, AV34W_UPD_USER_ID, AV35W_UPD_PROG_NM, AV29W_UPD_CNT) ;
      }
   }

   public void S12223( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXt_char1 = AV26W_SYS_VALUE ;
      GXv_char2[0] = GXt_char1 ;
      new b806_pc01_get_ctrl_val(remoteHandle, context).execute( "015", GXv_char2) ;
      b502_pc06_crf_item_reg.this.GXt_char1 = GXv_char2[0] ;
      AV26W_SYS_VALUE = GXt_char1 ;
      AV19W_MAX_ERROR_COUNT = (long)((GxRegex.IsMatch(AV26W_SYS_VALUE,"^\\d+$") ? GXutil.val( AV26W_SYS_VALUE, ".") : 100)) ;
      AV18W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      AV22W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV22W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_STUDY_ID" );
      AV22W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV11P_STUDY_ID );
      AV18W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV22W_PARMS_ITEM, 0);
      AV22W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV22W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_CRF_ID" );
      AV22W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV9P_CRF_ID );
      AV18W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV22W_PARMS_ITEM, 0);
      AV22W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV22W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_CRF_ITEM" );
      AV22W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV10P_CRF_ITEM );
      AV18W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV22W_PARMS_ITEM, 0);
      AV20W_MSG = "SUB_INIT" ;
      GXv_SdtB808_SD01_EXTRA_INFO6[0] = AV18W_EXTRA_INFO;
      GXv_int5[0] = AV16W_ERR_CD ;
      GXv_char2[0] = AV17W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV40Pgmname, (short)(1), AV20W_MSG, GXv_SdtB808_SD01_EXTRA_INFO6, GXv_int5, GXv_char2) ;
      AV18W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO6[0] ;
      b502_pc06_crf_item_reg.this.AV16W_ERR_CD = GXv_int5[0] ;
      b502_pc06_crf_item_reg.this.AV17W_ERR_MSG = GXv_char2[0] ;
   }

   public void S13255( )
   {
      /* 'SUB_ERROR' Routine */
      AV20W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO6[0] = AV18W_EXTRA_INFO;
      GXv_int5[0] = AV23W_RTN_CD ;
      GXv_char2[0] = AV17W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV40Pgmname, (short)(0), AV20W_MSG, GXv_SdtB808_SD01_EXTRA_INFO6, GXv_int5, GXv_char2) ;
      AV18W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO6[0] ;
      b502_pc06_crf_item_reg.this.AV23W_RTN_CD = GXv_int5[0] ;
      b502_pc06_crf_item_reg.this.AV17W_ERR_MSG = GXv_char2[0] ;
      AV24W_RTN_MSG.add(AV17W_ERR_MSG, 0);
      context.globals.Gx_eop = (byte)(0) ;
   }

   protected void cleanup( )
   {
      this.aP3[0] = b502_pc06_crf_item_reg.this.AV23W_RTN_CD;
      this.aP4[0] = b502_pc06_crf_item_reg.this.AV24W_RTN_MSG;
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
                  /* Execute user subroutine: S13255 */
                  S13255 ();
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
      P002H2_A233TBM32_CRF_ITEM_CD = new String[] {""} ;
      P002H2_A232TBM32_CRF_ID = new short[1] ;
      P002H2_A231TBM32_STUDY_ID = new long[1] ;
      P002H2_A239TBM32_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P002H2_n239TBM32_CRT_DATETIME = new boolean[] {false} ;
      P002H2_A240TBM32_CRT_USER_ID = new String[] {""} ;
      P002H2_n240TBM32_CRT_USER_ID = new boolean[] {false} ;
      P002H2_A241TBM32_CRT_PROG_NM = new String[] {""} ;
      P002H2_n241TBM32_CRT_PROG_NM = new boolean[] {false} ;
      P002H2_A245TBM32_UPD_CNT = new long[1] ;
      P002H2_n245TBM32_UPD_CNT = new boolean[] {false} ;
      P002H2_A234TBM32_CRF_ITEM_NM = new String[] {""} ;
      P002H2_n234TBM32_CRF_ITEM_NM = new boolean[] {false} ;
      P002H2_A235TBM32_CRF_ITEM_DIV = new String[] {""} ;
      P002H2_n235TBM32_CRF_ITEM_DIV = new boolean[] {false} ;
      P002H2_A236TBM32_CRF_ITEM_GRP_CD = new String[] {""} ;
      P002H2_n236TBM32_CRF_ITEM_GRP_CD = new boolean[] {false} ;
      P002H2_A384TBM32_CRF_ITEM_GRP_ORDER = new short[1] ;
      P002H2_n384TBM32_CRF_ITEM_GRP_ORDER = new boolean[] {false} ;
      P002H2_A385TBM32_LOCATION_X = new short[1] ;
      P002H2_n385TBM32_LOCATION_X = new boolean[] {false} ;
      P002H2_A386TBM32_LOCATION_Y = new short[1] ;
      P002H2_n386TBM32_LOCATION_Y = new boolean[] {false} ;
      P002H2_A387TBM32_LOCATION_X2 = new short[1] ;
      P002H2_n387TBM32_LOCATION_X2 = new boolean[] {false} ;
      P002H2_A388TBM32_LOCATION_Y2 = new short[1] ;
      P002H2_n388TBM32_LOCATION_Y2 = new boolean[] {false} ;
      P002H2_A389TBM32_TEXT_ALIGN_DIV = new String[] {""} ;
      P002H2_n389TBM32_TEXT_ALIGN_DIV = new boolean[] {false} ;
      P002H2_A393TBM32_TEXT_MAXROWS = new byte[1] ;
      P002H2_n393TBM32_TEXT_MAXROWS = new boolean[] {false} ;
      P002H2_A394TBM32_TEXT_MAXLENGTH = new short[1] ;
      P002H2_n394TBM32_TEXT_MAXLENGTH = new boolean[] {false} ;
      P002H2_A395TBM32_DECIMAL_DIGITS = new byte[1] ;
      P002H2_n395TBM32_DECIMAL_DIGITS = new boolean[] {false} ;
      P002H2_A399TBM32_CHK_TRUE_INNER_VALUE = new String[] {""} ;
      P002H2_n399TBM32_CHK_TRUE_INNER_VALUE = new boolean[] {false} ;
      P002H2_A400TBM32_CHK_FALSE_INNER_VALUE = new String[] {""} ;
      P002H2_n400TBM32_CHK_FALSE_INNER_VALUE = new boolean[] {false} ;
      P002H2_A404TBM32_FIXED_VALUE = new String[] {""} ;
      P002H2_n404TBM32_FIXED_VALUE = new boolean[] {false} ;
      P002H2_A402TBM32_LIST_CD = new String[] {""} ;
      P002H2_n402TBM32_LIST_CD = new boolean[] {false} ;
      P002H2_A403TBM32_IMAGE_CD = new String[] {""} ;
      P002H2_n403TBM32_IMAGE_CD = new boolean[] {false} ;
      P002H2_A401TBM32_TEXT = new String[] {""} ;
      P002H2_n401TBM32_TEXT = new boolean[] {false} ;
      P002H2_A390TBM32_FONT_SIZE = new byte[1] ;
      P002H2_n390TBM32_FONT_SIZE = new boolean[] {false} ;
      P002H2_A391TBM32_FONT_UL_FLG = new String[] {""} ;
      P002H2_n391TBM32_FONT_UL_FLG = new boolean[] {false} ;
      P002H2_A392TBM32_FONT_COLOR_DIV = new long[1] ;
      P002H2_n392TBM32_FONT_COLOR_DIV = new boolean[] {false} ;
      P002H2_A398TBM32_LINE_SIZE_DIV = new byte[1] ;
      P002H2_n398TBM32_LINE_SIZE_DIV = new boolean[] {false} ;
      P002H2_A603TBM32_LINE_COLOR_DIV = new long[1] ;
      P002H2_n603TBM32_LINE_COLOR_DIV = new boolean[] {false} ;
      P002H2_A396TBM32_LINE_START_POINT_DIV = new String[] {""} ;
      P002H2_n396TBM32_LINE_START_POINT_DIV = new boolean[] {false} ;
      P002H2_A397TBM32_LINE_END_POINT_DIV = new String[] {""} ;
      P002H2_n397TBM32_LINE_END_POINT_DIV = new boolean[] {false} ;
      P002H2_A604TBM32_LINE_ANGLE = new short[1] ;
      P002H2_n604TBM32_LINE_ANGLE = new boolean[] {false} ;
      P002H2_A552TBM32_AUTH_LVL_MIN = new byte[1] ;
      P002H2_n552TBM32_AUTH_LVL_MIN = new boolean[] {false} ;
      P002H2_A553TBM32_ZORDER = new short[1] ;
      P002H2_n553TBM32_ZORDER = new boolean[] {false} ;
      P002H2_A605TBM32_TAB_ORDER = new short[1] ;
      P002H2_n605TBM32_TAB_ORDER = new boolean[] {false} ;
      P002H2_A606TBM32_TABSTOP_FLG = new String[] {""} ;
      P002H2_n606TBM32_TABSTOP_FLG = new boolean[] {false} ;
      P002H2_A607TBM32_REQUIRED_INPUT_FLG = new String[] {""} ;
      P002H2_n607TBM32_REQUIRED_INPUT_FLG = new boolean[] {false} ;
      P002H2_A608TBM32_MIN_VALUE = new String[] {""} ;
      P002H2_n608TBM32_MIN_VALUE = new boolean[] {false} ;
      P002H2_A609TBM32_MAX_VALUE = new String[] {""} ;
      P002H2_n609TBM32_MAX_VALUE = new boolean[] {false} ;
      P002H2_A237TBM32_CRF_ITEM_NOTE = new String[] {""} ;
      P002H2_n237TBM32_CRF_ITEM_NOTE = new boolean[] {false} ;
      P002H2_A746TBM32_REF_CRF_ID = new short[1] ;
      P002H2_n746TBM32_REF_CRF_ID = new boolean[] {false} ;
      P002H2_A747TBM32_REF_CRF_ITEM_CD = new String[] {""} ;
      P002H2_n747TBM32_REF_CRF_ITEM_CD = new boolean[] {false} ;
      P002H2_A238TBM32_DEL_FLG = new String[] {""} ;
      P002H2_n238TBM32_DEL_FLG = new boolean[] {false} ;
      P002H2_A242TBM32_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P002H2_n242TBM32_UPD_DATETIME = new boolean[] {false} ;
      P002H2_A243TBM32_UPD_USER_ID = new String[] {""} ;
      P002H2_n243TBM32_UPD_USER_ID = new boolean[] {false} ;
      P002H2_A244TBM32_UPD_PROG_NM = new String[] {""} ;
      P002H2_n244TBM32_UPD_PROG_NM = new boolean[] {false} ;
      A233TBM32_CRF_ITEM_CD = "" ;
      A239TBM32_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A240TBM32_CRT_USER_ID = "" ;
      A241TBM32_CRT_PROG_NM = "" ;
      A234TBM32_CRF_ITEM_NM = "" ;
      A235TBM32_CRF_ITEM_DIV = "" ;
      A236TBM32_CRF_ITEM_GRP_CD = "" ;
      A389TBM32_TEXT_ALIGN_DIV = "" ;
      A399TBM32_CHK_TRUE_INNER_VALUE = "" ;
      A400TBM32_CHK_FALSE_INNER_VALUE = "" ;
      A404TBM32_FIXED_VALUE = "" ;
      A402TBM32_LIST_CD = "" ;
      A403TBM32_IMAGE_CD = "" ;
      A401TBM32_TEXT = "" ;
      A391TBM32_FONT_UL_FLG = "" ;
      A396TBM32_LINE_START_POINT_DIV = "" ;
      A397TBM32_LINE_END_POINT_DIV = "" ;
      A606TBM32_TABSTOP_FLG = "" ;
      A607TBM32_REQUIRED_INPUT_FLG = "" ;
      A608TBM32_MIN_VALUE = "" ;
      A609TBM32_MAX_VALUE = "" ;
      A237TBM32_CRF_ITEM_NOTE = "" ;
      A747TBM32_REF_CRF_ITEM_CD = "" ;
      A238TBM32_DEL_FLG = "" ;
      A242TBM32_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A243TBM32_UPD_USER_ID = "" ;
      A244TBM32_UPD_PROG_NM = "" ;
      AV37P_LOGKBN = "" ;
      Gx_emsg = "" ;
      AV26W_SYS_VALUE = "" ;
      GXt_char1 = "" ;
      AV22W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV17W_ERR_MSG = "" ;
      GXv_SdtB808_SD01_EXTRA_INFO6 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int5 = new short [1] ;
      GXv_char2 = new String [1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b502_pc06_crf_item_reg__default(),
         new Object[] {
             new Object[] {
            P002H2_A233TBM32_CRF_ITEM_CD, P002H2_A232TBM32_CRF_ID, P002H2_A231TBM32_STUDY_ID, P002H2_A239TBM32_CRT_DATETIME, P002H2_n239TBM32_CRT_DATETIME, P002H2_A240TBM32_CRT_USER_ID, P002H2_n240TBM32_CRT_USER_ID, P002H2_A241TBM32_CRT_PROG_NM, P002H2_n241TBM32_CRT_PROG_NM, P002H2_A245TBM32_UPD_CNT,
            P002H2_n245TBM32_UPD_CNT, P002H2_A234TBM32_CRF_ITEM_NM, P002H2_n234TBM32_CRF_ITEM_NM, P002H2_A235TBM32_CRF_ITEM_DIV, P002H2_n235TBM32_CRF_ITEM_DIV, P002H2_A236TBM32_CRF_ITEM_GRP_CD, P002H2_n236TBM32_CRF_ITEM_GRP_CD, P002H2_A384TBM32_CRF_ITEM_GRP_ORDER, P002H2_n384TBM32_CRF_ITEM_GRP_ORDER, P002H2_A385TBM32_LOCATION_X,
            P002H2_n385TBM32_LOCATION_X, P002H2_A386TBM32_LOCATION_Y, P002H2_n386TBM32_LOCATION_Y, P002H2_A387TBM32_LOCATION_X2, P002H2_n387TBM32_LOCATION_X2, P002H2_A388TBM32_LOCATION_Y2, P002H2_n388TBM32_LOCATION_Y2, P002H2_A389TBM32_TEXT_ALIGN_DIV, P002H2_n389TBM32_TEXT_ALIGN_DIV, P002H2_A393TBM32_TEXT_MAXROWS,
            P002H2_n393TBM32_TEXT_MAXROWS, P002H2_A394TBM32_TEXT_MAXLENGTH, P002H2_n394TBM32_TEXT_MAXLENGTH, P002H2_A395TBM32_DECIMAL_DIGITS, P002H2_n395TBM32_DECIMAL_DIGITS, P002H2_A399TBM32_CHK_TRUE_INNER_VALUE, P002H2_n399TBM32_CHK_TRUE_INNER_VALUE, P002H2_A400TBM32_CHK_FALSE_INNER_VALUE, P002H2_n400TBM32_CHK_FALSE_INNER_VALUE, P002H2_A404TBM32_FIXED_VALUE,
            P002H2_n404TBM32_FIXED_VALUE, P002H2_A402TBM32_LIST_CD, P002H2_n402TBM32_LIST_CD, P002H2_A403TBM32_IMAGE_CD, P002H2_n403TBM32_IMAGE_CD, P002H2_A401TBM32_TEXT, P002H2_n401TBM32_TEXT, P002H2_A390TBM32_FONT_SIZE, P002H2_n390TBM32_FONT_SIZE, P002H2_A391TBM32_FONT_UL_FLG,
            P002H2_n391TBM32_FONT_UL_FLG, P002H2_A392TBM32_FONT_COLOR_DIV, P002H2_n392TBM32_FONT_COLOR_DIV, P002H2_A398TBM32_LINE_SIZE_DIV, P002H2_n398TBM32_LINE_SIZE_DIV, P002H2_A603TBM32_LINE_COLOR_DIV, P002H2_n603TBM32_LINE_COLOR_DIV, P002H2_A396TBM32_LINE_START_POINT_DIV, P002H2_n396TBM32_LINE_START_POINT_DIV, P002H2_A397TBM32_LINE_END_POINT_DIV,
            P002H2_n397TBM32_LINE_END_POINT_DIV, P002H2_A604TBM32_LINE_ANGLE, P002H2_n604TBM32_LINE_ANGLE, P002H2_A552TBM32_AUTH_LVL_MIN, P002H2_n552TBM32_AUTH_LVL_MIN, P002H2_A553TBM32_ZORDER, P002H2_n553TBM32_ZORDER, P002H2_A605TBM32_TAB_ORDER, P002H2_n605TBM32_TAB_ORDER, P002H2_A606TBM32_TABSTOP_FLG,
            P002H2_n606TBM32_TABSTOP_FLG, P002H2_A607TBM32_REQUIRED_INPUT_FLG, P002H2_n607TBM32_REQUIRED_INPUT_FLG, P002H2_A608TBM32_MIN_VALUE, P002H2_n608TBM32_MIN_VALUE, P002H2_A609TBM32_MAX_VALUE, P002H2_n609TBM32_MAX_VALUE, P002H2_A237TBM32_CRF_ITEM_NOTE, P002H2_n237TBM32_CRF_ITEM_NOTE, P002H2_A746TBM32_REF_CRF_ID,
            P002H2_n746TBM32_REF_CRF_ID, P002H2_A747TBM32_REF_CRF_ITEM_CD, P002H2_n747TBM32_REF_CRF_ITEM_CD, P002H2_A238TBM32_DEL_FLG, P002H2_n238TBM32_DEL_FLG, P002H2_A242TBM32_UPD_DATETIME, P002H2_n242TBM32_UPD_DATETIME, P002H2_A243TBM32_UPD_USER_ID, P002H2_n243TBM32_UPD_USER_ID, P002H2_A244TBM32_UPD_PROG_NM,
            P002H2_n244TBM32_UPD_PROG_NM
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV40Pgmname = "B502_PC06_CRF_ITEM_REG" ;
      /* GeneXus formulas. */
      AV40Pgmname = "B502_PC06_CRF_ITEM_REG" ;
      Gx_err = (short)(0) ;
   }

   private byte AV41GXLvl90 ;
   private byte A393TBM32_TEXT_MAXROWS ;
   private byte A395TBM32_DECIMAL_DIGITS ;
   private byte A390TBM32_FONT_SIZE ;
   private byte A398TBM32_LINE_SIZE_DIV ;
   private byte A552TBM32_AUTH_LVL_MIN ;
   private short AV23W_RTN_CD ;
   private short AV16W_ERR_CD ;
   private short AV13W_CRF_ID ;
   private short A232TBM32_CRF_ID ;
   private short A384TBM32_CRF_ITEM_GRP_ORDER ;
   private short A385TBM32_LOCATION_X ;
   private short A386TBM32_LOCATION_Y ;
   private short A387TBM32_LOCATION_X2 ;
   private short A388TBM32_LOCATION_Y2 ;
   private short A394TBM32_TEXT_MAXLENGTH ;
   private short A604TBM32_LINE_ANGLE ;
   private short A553TBM32_ZORDER ;
   private short A605TBM32_TAB_ORDER ;
   private short A746TBM32_REF_CRF_ID ;
   private short Gx_err ;
   private short GXv_int5[] ;
   private int GX_INS19 ;
   private int GXActiveErrHndl ;
   private long AV12W_CNT ;
   private long AV19W_MAX_ERROR_COUNT ;
   private long AV25W_STUDY_ID ;
   private long AV29W_UPD_CNT ;
   private long A231TBM32_STUDY_ID ;
   private long A245TBM32_UPD_CNT ;
   private long A392TBM32_FONT_COLOR_DIV ;
   private long A603TBM32_LINE_COLOR_DIV ;
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
   private java.util.Date A239TBM32_CRT_DATETIME ;
   private java.util.Date A242TBM32_UPD_DATETIME ;
   private boolean returnInSub ;
   private boolean n239TBM32_CRT_DATETIME ;
   private boolean n240TBM32_CRT_USER_ID ;
   private boolean n241TBM32_CRT_PROG_NM ;
   private boolean n245TBM32_UPD_CNT ;
   private boolean n234TBM32_CRF_ITEM_NM ;
   private boolean n235TBM32_CRF_ITEM_DIV ;
   private boolean n236TBM32_CRF_ITEM_GRP_CD ;
   private boolean n384TBM32_CRF_ITEM_GRP_ORDER ;
   private boolean n385TBM32_LOCATION_X ;
   private boolean n386TBM32_LOCATION_Y ;
   private boolean n387TBM32_LOCATION_X2 ;
   private boolean n388TBM32_LOCATION_Y2 ;
   private boolean n389TBM32_TEXT_ALIGN_DIV ;
   private boolean n393TBM32_TEXT_MAXROWS ;
   private boolean n394TBM32_TEXT_MAXLENGTH ;
   private boolean n395TBM32_DECIMAL_DIGITS ;
   private boolean n399TBM32_CHK_TRUE_INNER_VALUE ;
   private boolean n400TBM32_CHK_FALSE_INNER_VALUE ;
   private boolean n404TBM32_FIXED_VALUE ;
   private boolean n402TBM32_LIST_CD ;
   private boolean n403TBM32_IMAGE_CD ;
   private boolean n401TBM32_TEXT ;
   private boolean n390TBM32_FONT_SIZE ;
   private boolean n391TBM32_FONT_UL_FLG ;
   private boolean n392TBM32_FONT_COLOR_DIV ;
   private boolean n398TBM32_LINE_SIZE_DIV ;
   private boolean n603TBM32_LINE_COLOR_DIV ;
   private boolean n396TBM32_LINE_START_POINT_DIV ;
   private boolean n397TBM32_LINE_END_POINT_DIV ;
   private boolean n604TBM32_LINE_ANGLE ;
   private boolean n552TBM32_AUTH_LVL_MIN ;
   private boolean n553TBM32_ZORDER ;
   private boolean n605TBM32_TAB_ORDER ;
   private boolean n606TBM32_TABSTOP_FLG ;
   private boolean n607TBM32_REQUIRED_INPUT_FLG ;
   private boolean n608TBM32_MIN_VALUE ;
   private boolean n609TBM32_MAX_VALUE ;
   private boolean n237TBM32_CRF_ITEM_NOTE ;
   private boolean n746TBM32_REF_CRF_ID ;
   private boolean n747TBM32_REF_CRF_ITEM_CD ;
   private boolean n238TBM32_DEL_FLG ;
   private boolean n242TBM32_UPD_DATETIME ;
   private boolean n243TBM32_UPD_USER_ID ;
   private boolean n244TBM32_UPD_PROG_NM ;
   private String AV11P_STUDY_ID ;
   private String AV9P_CRF_ID ;
   private String AV10P_CRF_ITEM ;
   private String AV8C_APP_ID ;
   private String AV21W_NEWLINE ;
   private String AV27W_USER_ID ;
   private String AV20W_MSG ;
   private String AV31W_CRT_USER_ID ;
   private String AV32W_CRT_PROG_NM ;
   private String AV34W_UPD_USER_ID ;
   private String AV35W_UPD_PROG_NM ;
   private String A233TBM32_CRF_ITEM_CD ;
   private String A240TBM32_CRT_USER_ID ;
   private String A241TBM32_CRT_PROG_NM ;
   private String A234TBM32_CRF_ITEM_NM ;
   private String A235TBM32_CRF_ITEM_DIV ;
   private String A236TBM32_CRF_ITEM_GRP_CD ;
   private String A389TBM32_TEXT_ALIGN_DIV ;
   private String A399TBM32_CHK_TRUE_INNER_VALUE ;
   private String A400TBM32_CHK_FALSE_INNER_VALUE ;
   private String A404TBM32_FIXED_VALUE ;
   private String A402TBM32_LIST_CD ;
   private String A403TBM32_IMAGE_CD ;
   private String A401TBM32_TEXT ;
   private String A391TBM32_FONT_UL_FLG ;
   private String A396TBM32_LINE_START_POINT_DIV ;
   private String A397TBM32_LINE_END_POINT_DIV ;
   private String A606TBM32_TABSTOP_FLG ;
   private String A607TBM32_REQUIRED_INPUT_FLG ;
   private String A608TBM32_MIN_VALUE ;
   private String A609TBM32_MAX_VALUE ;
   private String A237TBM32_CRF_ITEM_NOTE ;
   private String A747TBM32_REF_CRF_ITEM_CD ;
   private String A238TBM32_DEL_FLG ;
   private String A243TBM32_UPD_USER_ID ;
   private String A244TBM32_UPD_PROG_NM ;
   private String AV37P_LOGKBN ;
   private String AV26W_SYS_VALUE ;
   private String AV17W_ERR_MSG ;
   private short[] aP3 ;
   private GxObjectCollection[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P002H2_A233TBM32_CRF_ITEM_CD ;
   private short[] P002H2_A232TBM32_CRF_ID ;
   private long[] P002H2_A231TBM32_STUDY_ID ;
   private java.util.Date[] P002H2_A239TBM32_CRT_DATETIME ;
   private boolean[] P002H2_n239TBM32_CRT_DATETIME ;
   private String[] P002H2_A240TBM32_CRT_USER_ID ;
   private boolean[] P002H2_n240TBM32_CRT_USER_ID ;
   private String[] P002H2_A241TBM32_CRT_PROG_NM ;
   private boolean[] P002H2_n241TBM32_CRT_PROG_NM ;
   private long[] P002H2_A245TBM32_UPD_CNT ;
   private boolean[] P002H2_n245TBM32_UPD_CNT ;
   private String[] P002H2_A234TBM32_CRF_ITEM_NM ;
   private boolean[] P002H2_n234TBM32_CRF_ITEM_NM ;
   private String[] P002H2_A235TBM32_CRF_ITEM_DIV ;
   private boolean[] P002H2_n235TBM32_CRF_ITEM_DIV ;
   private String[] P002H2_A236TBM32_CRF_ITEM_GRP_CD ;
   private boolean[] P002H2_n236TBM32_CRF_ITEM_GRP_CD ;
   private short[] P002H2_A384TBM32_CRF_ITEM_GRP_ORDER ;
   private boolean[] P002H2_n384TBM32_CRF_ITEM_GRP_ORDER ;
   private short[] P002H2_A385TBM32_LOCATION_X ;
   private boolean[] P002H2_n385TBM32_LOCATION_X ;
   private short[] P002H2_A386TBM32_LOCATION_Y ;
   private boolean[] P002H2_n386TBM32_LOCATION_Y ;
   private short[] P002H2_A387TBM32_LOCATION_X2 ;
   private boolean[] P002H2_n387TBM32_LOCATION_X2 ;
   private short[] P002H2_A388TBM32_LOCATION_Y2 ;
   private boolean[] P002H2_n388TBM32_LOCATION_Y2 ;
   private String[] P002H2_A389TBM32_TEXT_ALIGN_DIV ;
   private boolean[] P002H2_n389TBM32_TEXT_ALIGN_DIV ;
   private byte[] P002H2_A393TBM32_TEXT_MAXROWS ;
   private boolean[] P002H2_n393TBM32_TEXT_MAXROWS ;
   private short[] P002H2_A394TBM32_TEXT_MAXLENGTH ;
   private boolean[] P002H2_n394TBM32_TEXT_MAXLENGTH ;
   private byte[] P002H2_A395TBM32_DECIMAL_DIGITS ;
   private boolean[] P002H2_n395TBM32_DECIMAL_DIGITS ;
   private String[] P002H2_A399TBM32_CHK_TRUE_INNER_VALUE ;
   private boolean[] P002H2_n399TBM32_CHK_TRUE_INNER_VALUE ;
   private String[] P002H2_A400TBM32_CHK_FALSE_INNER_VALUE ;
   private boolean[] P002H2_n400TBM32_CHK_FALSE_INNER_VALUE ;
   private String[] P002H2_A404TBM32_FIXED_VALUE ;
   private boolean[] P002H2_n404TBM32_FIXED_VALUE ;
   private String[] P002H2_A402TBM32_LIST_CD ;
   private boolean[] P002H2_n402TBM32_LIST_CD ;
   private String[] P002H2_A403TBM32_IMAGE_CD ;
   private boolean[] P002H2_n403TBM32_IMAGE_CD ;
   private String[] P002H2_A401TBM32_TEXT ;
   private boolean[] P002H2_n401TBM32_TEXT ;
   private byte[] P002H2_A390TBM32_FONT_SIZE ;
   private boolean[] P002H2_n390TBM32_FONT_SIZE ;
   private String[] P002H2_A391TBM32_FONT_UL_FLG ;
   private boolean[] P002H2_n391TBM32_FONT_UL_FLG ;
   private long[] P002H2_A392TBM32_FONT_COLOR_DIV ;
   private boolean[] P002H2_n392TBM32_FONT_COLOR_DIV ;
   private byte[] P002H2_A398TBM32_LINE_SIZE_DIV ;
   private boolean[] P002H2_n398TBM32_LINE_SIZE_DIV ;
   private long[] P002H2_A603TBM32_LINE_COLOR_DIV ;
   private boolean[] P002H2_n603TBM32_LINE_COLOR_DIV ;
   private String[] P002H2_A396TBM32_LINE_START_POINT_DIV ;
   private boolean[] P002H2_n396TBM32_LINE_START_POINT_DIV ;
   private String[] P002H2_A397TBM32_LINE_END_POINT_DIV ;
   private boolean[] P002H2_n397TBM32_LINE_END_POINT_DIV ;
   private short[] P002H2_A604TBM32_LINE_ANGLE ;
   private boolean[] P002H2_n604TBM32_LINE_ANGLE ;
   private byte[] P002H2_A552TBM32_AUTH_LVL_MIN ;
   private boolean[] P002H2_n552TBM32_AUTH_LVL_MIN ;
   private short[] P002H2_A553TBM32_ZORDER ;
   private boolean[] P002H2_n553TBM32_ZORDER ;
   private short[] P002H2_A605TBM32_TAB_ORDER ;
   private boolean[] P002H2_n605TBM32_TAB_ORDER ;
   private String[] P002H2_A606TBM32_TABSTOP_FLG ;
   private boolean[] P002H2_n606TBM32_TABSTOP_FLG ;
   private String[] P002H2_A607TBM32_REQUIRED_INPUT_FLG ;
   private boolean[] P002H2_n607TBM32_REQUIRED_INPUT_FLG ;
   private String[] P002H2_A608TBM32_MIN_VALUE ;
   private boolean[] P002H2_n608TBM32_MIN_VALUE ;
   private String[] P002H2_A609TBM32_MAX_VALUE ;
   private boolean[] P002H2_n609TBM32_MAX_VALUE ;
   private String[] P002H2_A237TBM32_CRF_ITEM_NOTE ;
   private boolean[] P002H2_n237TBM32_CRF_ITEM_NOTE ;
   private short[] P002H2_A746TBM32_REF_CRF_ID ;
   private boolean[] P002H2_n746TBM32_REF_CRF_ID ;
   private String[] P002H2_A747TBM32_REF_CRF_ITEM_CD ;
   private boolean[] P002H2_n747TBM32_REF_CRF_ITEM_CD ;
   private String[] P002H2_A238TBM32_DEL_FLG ;
   private boolean[] P002H2_n238TBM32_DEL_FLG ;
   private java.util.Date[] P002H2_A242TBM32_UPD_DATETIME ;
   private boolean[] P002H2_n242TBM32_UPD_DATETIME ;
   private String[] P002H2_A243TBM32_UPD_USER_ID ;
   private boolean[] P002H2_n243TBM32_UPD_USER_ID ;
   private String[] P002H2_A244TBM32_UPD_PROG_NM ;
   private boolean[] P002H2_n244TBM32_UPD_PROG_NM ;
   private GxObjectCollection AV24W_RTN_MSG ;
   private GxObjectCollection AV15W_CSV_ROW ;
   private GxObjectCollection GXt_objcol_char3 ;
   private GxObjectCollection AV14W_CSV_COL ;
   private GxObjectCollection GXv_objcol_char4[] ;
   private SdtB808_SD01_EXTRA_INFO AV18W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO6[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV22W_PARMS_ITEM ;
}

final  class b502_pc06_crf_item_reg__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P002H2", "SELECT `TBM32_CRF_ITEM_CD`, `TBM32_CRF_ID`, `TBM32_STUDY_ID`, `TBM32_CRT_DATETIME`, `TBM32_CRT_USER_ID`, `TBM32_CRT_PROG_NM`, `TBM32_UPD_CNT`, `TBM32_CRF_ITEM_NM`, `TBM32_CRF_ITEM_DIV`, `TBM32_CRF_ITEM_GRP_CD`, `TBM32_CRF_ITEM_GRP_ORDER`, `TBM32_LOCATION_X`, `TBM32_LOCATION_Y`, `TBM32_LOCATION_X2`, `TBM32_LOCATION_Y2`, `TBM32_TEXT_ALIGN_DIV`, `TBM32_TEXT_MAXROWS`, `TBM32_TEXT_MAXLENGTH`, `TBM32_DECIMAL_DIGITS`, `TBM32_CHK_TRUE_INNER_VALUE`, `TBM32_CHK_FALSE_INNER_VALUE`, `TBM32_FIXED_VALUE`, `TBM32_LIST_CD`, `TBM32_IMAGE_CD`, `TBM32_TEXT`, `TBM32_FONT_SIZE`, `TBM32_FONT_UL_FLG`, `TBM32_FONT_COLOR_DIV`, `TBM32_LINE_SIZE_DIV`, `TBM32_LINE_COLOR_DIV`, `TBM32_LINE_START_POINT_DIV`, `TBM32_LINE_END_POINT_DIV`, `TBM32_LINE_ANGLE`, `TBM32_AUTH_LVL_MIN`, `TBM32_ZORDER`, `TBM32_TAB_ORDER`, `TBM32_TABSTOP_FLG`, `TBM32_REQUIRED_INPUT_FLG`, `TBM32_MIN_VALUE`, `TBM32_MAX_VALUE`, `TBM32_CRF_ITEM_NOTE`, `TBM32_REF_CRF_ID`, `TBM32_REF_CRF_ITEM_CD`, `TBM32_DEL_FLG`, `TBM32_UPD_DATETIME`, `TBM32_UPD_USER_ID`, `TBM32_UPD_PROG_NM` FROM `TBM32_CRF_ITEM` WHERE `TBM32_STUDY_ID` = ? and `TBM32_CRF_ID` = ? ORDER BY `TBM32_STUDY_ID`, `TBM32_CRF_ID`  FOR UPDATE ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new UpdateCursor("P002H3", "UPDATE `TBM32_CRF_ITEM` SET `TBM32_UPD_CNT`=?, `TBM32_CRF_ITEM_NM`=?, `TBM32_CRF_ITEM_DIV`=?, `TBM32_CRF_ITEM_GRP_CD`=?, `TBM32_CRF_ITEM_GRP_ORDER`=?, `TBM32_LOCATION_X`=?, `TBM32_LOCATION_Y`=?, `TBM32_LOCATION_X2`=?, `TBM32_LOCATION_Y2`=?, `TBM32_TEXT_ALIGN_DIV`=?, `TBM32_TEXT_MAXROWS`=?, `TBM32_TEXT_MAXLENGTH`=?, `TBM32_DECIMAL_DIGITS`=?, `TBM32_CHK_TRUE_INNER_VALUE`=?, `TBM32_CHK_FALSE_INNER_VALUE`=?, `TBM32_FIXED_VALUE`=?, `TBM32_LIST_CD`=?, `TBM32_IMAGE_CD`=?, `TBM32_TEXT`=?, `TBM32_FONT_SIZE`=?, `TBM32_FONT_UL_FLG`=?, `TBM32_FONT_COLOR_DIV`=?, `TBM32_LINE_SIZE_DIV`=?, `TBM32_LINE_COLOR_DIV`=?, `TBM32_LINE_START_POINT_DIV`=?, `TBM32_LINE_END_POINT_DIV`=?, `TBM32_LINE_ANGLE`=?, `TBM32_AUTH_LVL_MIN`=?, `TBM32_ZORDER`=?, `TBM32_TAB_ORDER`=?, `TBM32_TABSTOP_FLG`=?, `TBM32_REQUIRED_INPUT_FLG`=?, `TBM32_MIN_VALUE`=?, `TBM32_MAX_VALUE`=?, `TBM32_CRF_ITEM_NOTE`=?, `TBM32_REF_CRF_ID`=?, `TBM32_REF_CRF_ITEM_CD`=?, `TBM32_DEL_FLG`=?, `TBM32_UPD_DATETIME`=?, `TBM32_UPD_USER_ID`=?, `TBM32_UPD_PROG_NM`=?  WHERE `TBM32_STUDY_ID` = ? AND `TBM32_CRF_ID` = ? AND `TBM32_CRF_ITEM_CD` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P002H4", "INSERT INTO `TBM32_CRF_ITEM` (`TBM32_STUDY_ID`, `TBM32_CRF_ID`, `TBM32_CRF_ITEM_CD`, `TBM32_CRF_ITEM_NM`, `TBM32_CRF_ITEM_DIV`, `TBM32_CRF_ITEM_GRP_CD`, `TBM32_CRF_ITEM_GRP_ORDER`, `TBM32_LOCATION_X`, `TBM32_LOCATION_Y`, `TBM32_LOCATION_X2`, `TBM32_LOCATION_Y2`, `TBM32_TEXT_ALIGN_DIV`, `TBM32_TEXT_MAXROWS`, `TBM32_TEXT_MAXLENGTH`, `TBM32_DECIMAL_DIGITS`, `TBM32_CHK_TRUE_INNER_VALUE`, `TBM32_CHK_FALSE_INNER_VALUE`, `TBM32_FIXED_VALUE`, `TBM32_LIST_CD`, `TBM32_IMAGE_CD`, `TBM32_TEXT`, `TBM32_FONT_SIZE`, `TBM32_FONT_UL_FLG`, `TBM32_FONT_COLOR_DIV`, `TBM32_LINE_SIZE_DIV`, `TBM32_LINE_COLOR_DIV`, `TBM32_LINE_START_POINT_DIV`, `TBM32_LINE_END_POINT_DIV`, `TBM32_LINE_ANGLE`, `TBM32_AUTH_LVL_MIN`, `TBM32_ZORDER`, `TBM32_TAB_ORDER`, `TBM32_TABSTOP_FLG`, `TBM32_REQUIRED_INPUT_FLG`, `TBM32_MIN_VALUE`, `TBM32_MAX_VALUE`, `TBM32_CRF_ITEM_NOTE`, `TBM32_REF_CRF_ID`, `TBM32_REF_CRF_ITEM_CD`, `TBM32_DEL_FLG`, `TBM32_CRT_DATETIME`, `TBM32_CRT_USER_ID`, `TBM32_CRT_PROG_NM`, `TBM32_UPD_DATETIME`, `TBM32_UPD_USER_ID`, `TBM32_UPD_PROG_NM`, `TBM32_UPD_CNT`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
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
               ((String[]) buf[15])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(13) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(14) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(15) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((byte[]) buf[29])[0] = rslt.getByte(17) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((short[]) buf[31])[0] = rslt.getShort(18) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((byte[]) buf[33])[0] = rslt.getByte(19) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((byte[]) buf[47])[0] = rslt.getByte(26) ;
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getVarchar(27) ;
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((long[]) buf[51])[0] = rslt.getLong(28) ;
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((byte[]) buf[53])[0] = rslt.getByte(29) ;
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((long[]) buf[55])[0] = rslt.getLong(30) ;
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getVarchar(31) ;
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getVarchar(32) ;
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((short[]) buf[61])[0] = rslt.getShort(33) ;
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((byte[]) buf[63])[0] = rslt.getByte(34) ;
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((short[]) buf[65])[0] = rslt.getShort(35) ;
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((short[]) buf[67])[0] = rslt.getShort(36) ;
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((String[]) buf[69])[0] = rslt.getVarchar(37) ;
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((String[]) buf[71])[0] = rslt.getVarchar(38) ;
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((String[]) buf[73])[0] = rslt.getVarchar(39) ;
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((String[]) buf[75])[0] = rslt.getVarchar(40) ;
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((String[]) buf[77])[0] = rslt.getVarchar(41) ;
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((short[]) buf[79])[0] = rslt.getShort(42) ;
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((String[]) buf[81])[0] = rslt.getVarchar(43) ;
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((String[]) buf[83])[0] = rslt.getVarchar(44) ;
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[85])[0] = rslt.getGXDateTime(45) ;
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((String[]) buf[87])[0] = rslt.getVarchar(46) ;
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((String[]) buf[89])[0] = rslt.getVarchar(47) ;
               ((boolean[]) buf[90])[0] = rslt.wasNull();
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
                  stmt.setVarchar(2, (String)parms[3], 200);
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[7], 50);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[9]).shortValue());
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
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[15]).shortValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[17]).shortValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[19], 6);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(11, ((Number) parms[21]).byteValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[23]).shortValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(13, ((Number) parms[25]).byteValue());
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[27], 100);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[29], 100);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[31], 100);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[33], 20);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[35], 50);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[37], 200);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(20, ((Number) parms[39]).byteValue());
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[41], 1);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(22, ((Number) parms[43]).longValue());
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(23, ((Number) parms[45]).byteValue());
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(24, ((Number) parms[47]).longValue());
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(25, (String)parms[49], 2);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(26, (String)parms[51], 2);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(27, ((Number) parms[53]).shortValue());
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(28, ((Number) parms[55]).byteValue());
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(29, ((Number) parms[57]).shortValue());
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(30, ((Number) parms[59]).shortValue());
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(31, (String)parms[61], 1);
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(32, (String)parms[63], 1);
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(33, (String)parms[65], 10);
               }
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(34, (String)parms[67], 10);
               }
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(35, (String)parms[69], 1000);
               }
               if ( ((Boolean) parms[70]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(36, ((Number) parms[71]).shortValue());
               }
               if ( ((Boolean) parms[72]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(37, (String)parms[73], 50);
               }
               if ( ((Boolean) parms[74]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(38, (String)parms[75], 1);
               }
               if ( ((Boolean) parms[76]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(39, (java.util.Date)parms[77], false);
               }
               if ( ((Boolean) parms[78]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(40, (String)parms[79], 128);
               }
               if ( ((Boolean) parms[80]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(41, (String)parms[81], 40);
               }
               stmt.setLong(42, ((Number) parms[82]).longValue());
               stmt.setShort(43, ((Number) parms[83]).shortValue());
               stmt.setVarchar(44, (String)parms[84], 50, false);
               break;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 50, false);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[4], 200);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[6], 20);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[8], 50);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[10]).shortValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[12]).shortValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[14]).shortValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[16]).shortValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[18]).shortValue());
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[20], 6);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(13, ((Number) parms[22]).byteValue());
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(14, ((Number) parms[24]).shortValue());
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(15, ((Number) parms[26]).byteValue());
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[28], 100);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[30], 100);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[32], 100);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[34], 20);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[36], 50);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[38], 200);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(22, ((Number) parms[40]).byteValue());
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(23, (String)parms[42], 1);
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(24, ((Number) parms[44]).longValue());
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(25, ((Number) parms[46]).byteValue());
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(26, ((Number) parms[48]).longValue());
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(27, (String)parms[50], 2);
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(28, (String)parms[52], 2);
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(29, ((Number) parms[54]).shortValue());
               }
               if ( ((Boolean) parms[55]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(30, ((Number) parms[56]).byteValue());
               }
               if ( ((Boolean) parms[57]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(31, ((Number) parms[58]).shortValue());
               }
               if ( ((Boolean) parms[59]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(32, ((Number) parms[60]).shortValue());
               }
               if ( ((Boolean) parms[61]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(33, (String)parms[62], 1);
               }
               if ( ((Boolean) parms[63]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(34, (String)parms[64], 1);
               }
               if ( ((Boolean) parms[65]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(35, (String)parms[66], 10);
               }
               if ( ((Boolean) parms[67]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(36, (String)parms[68], 10);
               }
               if ( ((Boolean) parms[69]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(37, (String)parms[70], 1000);
               }
               if ( ((Boolean) parms[71]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(38, ((Number) parms[72]).shortValue());
               }
               if ( ((Boolean) parms[73]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(39, (String)parms[74], 50);
               }
               if ( ((Boolean) parms[75]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(40, (String)parms[76], 1);
               }
               if ( ((Boolean) parms[77]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(41, (java.util.Date)parms[78], false);
               }
               if ( ((Boolean) parms[79]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(42, (String)parms[80], 128);
               }
               if ( ((Boolean) parms[81]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(43, (String)parms[82], 40);
               }
               if ( ((Boolean) parms[83]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(44, (java.util.Date)parms[84], false);
               }
               if ( ((Boolean) parms[85]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(45, (String)parms[86], 128);
               }
               if ( ((Boolean) parms[87]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(46, (String)parms[88], 40);
               }
               if ( ((Boolean) parms[89]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(47, ((Number) parms[90]).longValue());
               }
               break;
      }
   }

}

