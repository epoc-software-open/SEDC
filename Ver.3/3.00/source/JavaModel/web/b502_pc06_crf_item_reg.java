/*
               File: B502_PC06_CRF_ITEM_REG
        Description: CRF項目マスタ登録
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:16:30.81
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
      b502_pc06_crf_item_reg.this.aP3 = aP3;
      b502_pc06_crf_item_reg.this.AV24W_RTN_MSG = aP4[0];
      this.aP4 = aP4;
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
            b502_pc06_crf_item_reg.this.GXt_char1 = GXv_char2[0] ;
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
      AV41GXLvl90 = (byte)(0) ;
      Gx_ope = "Fetch" ;
      Gx_etb = "TBM32_CRF_ITEM" ;
      /* Using cursor P002F2 */
      pr_default.execute(0, new Object[] {new Long(AV25W_STUDY_ID), new Short(AV13W_CRF_ID)});
      if ( Gx_err != 0 )
      {
         AV41GXLvl90 = (byte)(1) ;
      }
      while ( (pr_default.getStatus(0) != 101) )
      {
         A72TBM32_CRF_ITEM_CD = P002F2_A72TBM32_CRF_ITEM_CD[0] ;
         A71TBM32_CRF_ID = P002F2_A71TBM32_CRF_ID[0] ;
         A70TBM32_STUDY_ID = P002F2_A70TBM32_STUDY_ID[0] ;
         A407TBM32_CRT_DATETIME = P002F2_A407TBM32_CRT_DATETIME[0] ;
         n407TBM32_CRT_DATETIME = P002F2_n407TBM32_CRT_DATETIME[0] ;
         A408TBM32_CRT_USER_ID = P002F2_A408TBM32_CRT_USER_ID[0] ;
         n408TBM32_CRT_USER_ID = P002F2_n408TBM32_CRT_USER_ID[0] ;
         A409TBM32_CRT_PROG_NM = P002F2_A409TBM32_CRT_PROG_NM[0] ;
         n409TBM32_CRT_PROG_NM = P002F2_n409TBM32_CRT_PROG_NM[0] ;
         A413TBM32_UPD_CNT = P002F2_A413TBM32_UPD_CNT[0] ;
         n413TBM32_UPD_CNT = P002F2_n413TBM32_UPD_CNT[0] ;
         A405TBM32_CRF_ITEM_NM = P002F2_A405TBM32_CRF_ITEM_NM[0] ;
         n405TBM32_CRF_ITEM_NM = P002F2_n405TBM32_CRF_ITEM_NM[0] ;
         A74TBM32_CRF_ITEM_DIV = P002F2_A74TBM32_CRF_ITEM_DIV[0] ;
         n74TBM32_CRF_ITEM_DIV = P002F2_n74TBM32_CRF_ITEM_DIV[0] ;
         A73TBM32_CRF_ITEM_GRP_CD = P002F2_A73TBM32_CRF_ITEM_GRP_CD[0] ;
         n73TBM32_CRF_ITEM_GRP_CD = P002F2_n73TBM32_CRF_ITEM_GRP_CD[0] ;
         A507TBM32_CRF_ITEM_GRP_ORDER = P002F2_A507TBM32_CRF_ITEM_GRP_ORDER[0] ;
         n507TBM32_CRF_ITEM_GRP_ORDER = P002F2_n507TBM32_CRF_ITEM_GRP_ORDER[0] ;
         A508TBM32_LOCATION_X = P002F2_A508TBM32_LOCATION_X[0] ;
         n508TBM32_LOCATION_X = P002F2_n508TBM32_LOCATION_X[0] ;
         A509TBM32_LOCATION_Y = P002F2_A509TBM32_LOCATION_Y[0] ;
         n509TBM32_LOCATION_Y = P002F2_n509TBM32_LOCATION_Y[0] ;
         A510TBM32_LOCATION_X2 = P002F2_A510TBM32_LOCATION_X2[0] ;
         n510TBM32_LOCATION_X2 = P002F2_n510TBM32_LOCATION_X2[0] ;
         A511TBM32_LOCATION_Y2 = P002F2_A511TBM32_LOCATION_Y2[0] ;
         n511TBM32_LOCATION_Y2 = P002F2_n511TBM32_LOCATION_Y2[0] ;
         A512TBM32_TEXT_ALIGN_DIV = P002F2_A512TBM32_TEXT_ALIGN_DIV[0] ;
         n512TBM32_TEXT_ALIGN_DIV = P002F2_n512TBM32_TEXT_ALIGN_DIV[0] ;
         A516TBM32_TEXT_MAXROWS = P002F2_A516TBM32_TEXT_MAXROWS[0] ;
         n516TBM32_TEXT_MAXROWS = P002F2_n516TBM32_TEXT_MAXROWS[0] ;
         A517TBM32_TEXT_MAXLENGTH = P002F2_A517TBM32_TEXT_MAXLENGTH[0] ;
         n517TBM32_TEXT_MAXLENGTH = P002F2_n517TBM32_TEXT_MAXLENGTH[0] ;
         A518TBM32_DECIMAL_DIGITS = P002F2_A518TBM32_DECIMAL_DIGITS[0] ;
         n518TBM32_DECIMAL_DIGITS = P002F2_n518TBM32_DECIMAL_DIGITS[0] ;
         A522TBM32_CHK_TRUE_INNER_VALUE = P002F2_A522TBM32_CHK_TRUE_INNER_VALUE[0] ;
         n522TBM32_CHK_TRUE_INNER_VALUE = P002F2_n522TBM32_CHK_TRUE_INNER_VALUE[0] ;
         A523TBM32_CHK_FALSE_INNER_VALUE = P002F2_A523TBM32_CHK_FALSE_INNER_VALUE[0] ;
         n523TBM32_CHK_FALSE_INNER_VALUE = P002F2_n523TBM32_CHK_FALSE_INNER_VALUE[0] ;
         A527TBM32_FIXED_VALUE = P002F2_A527TBM32_FIXED_VALUE[0] ;
         n527TBM32_FIXED_VALUE = P002F2_n527TBM32_FIXED_VALUE[0] ;
         A525TBM32_LIST_CD = P002F2_A525TBM32_LIST_CD[0] ;
         n525TBM32_LIST_CD = P002F2_n525TBM32_LIST_CD[0] ;
         A526TBM32_IMAGE_CD = P002F2_A526TBM32_IMAGE_CD[0] ;
         n526TBM32_IMAGE_CD = P002F2_n526TBM32_IMAGE_CD[0] ;
         A524TBM32_TEXT = P002F2_A524TBM32_TEXT[0] ;
         n524TBM32_TEXT = P002F2_n524TBM32_TEXT[0] ;
         A513TBM32_FONT_SIZE = P002F2_A513TBM32_FONT_SIZE[0] ;
         n513TBM32_FONT_SIZE = P002F2_n513TBM32_FONT_SIZE[0] ;
         A514TBM32_FONT_UL_FLG = P002F2_A514TBM32_FONT_UL_FLG[0] ;
         n514TBM32_FONT_UL_FLG = P002F2_n514TBM32_FONT_UL_FLG[0] ;
         A515TBM32_FONT_COLOR_DIV = P002F2_A515TBM32_FONT_COLOR_DIV[0] ;
         n515TBM32_FONT_COLOR_DIV = P002F2_n515TBM32_FONT_COLOR_DIV[0] ;
         A521TBM32_LINE_SIZE_DIV = P002F2_A521TBM32_LINE_SIZE_DIV[0] ;
         n521TBM32_LINE_SIZE_DIV = P002F2_n521TBM32_LINE_SIZE_DIV[0] ;
         A689TBM32_LINE_COLOR_DIV = P002F2_A689TBM32_LINE_COLOR_DIV[0] ;
         n689TBM32_LINE_COLOR_DIV = P002F2_n689TBM32_LINE_COLOR_DIV[0] ;
         A519TBM32_LINE_START_POINT_DIV = P002F2_A519TBM32_LINE_START_POINT_DIV[0] ;
         n519TBM32_LINE_START_POINT_DIV = P002F2_n519TBM32_LINE_START_POINT_DIV[0] ;
         A520TBM32_LINE_END_POINT_DIV = P002F2_A520TBM32_LINE_END_POINT_DIV[0] ;
         n520TBM32_LINE_END_POINT_DIV = P002F2_n520TBM32_LINE_END_POINT_DIV[0] ;
         A690TBM32_LINE_ANGLE = P002F2_A690TBM32_LINE_ANGLE[0] ;
         n690TBM32_LINE_ANGLE = P002F2_n690TBM32_LINE_ANGLE[0] ;
         A644TBM32_AUTH_LVL_MIN = P002F2_A644TBM32_AUTH_LVL_MIN[0] ;
         n644TBM32_AUTH_LVL_MIN = P002F2_n644TBM32_AUTH_LVL_MIN[0] ;
         A645TBM32_ZORDER = P002F2_A645TBM32_ZORDER[0] ;
         n645TBM32_ZORDER = P002F2_n645TBM32_ZORDER[0] ;
         A691TBM32_TAB_ORDER = P002F2_A691TBM32_TAB_ORDER[0] ;
         n691TBM32_TAB_ORDER = P002F2_n691TBM32_TAB_ORDER[0] ;
         A692TBM32_TABSTOP_FLG = P002F2_A692TBM32_TABSTOP_FLG[0] ;
         n692TBM32_TABSTOP_FLG = P002F2_n692TBM32_TABSTOP_FLG[0] ;
         A693TBM32_REQUIRED_INPUT_FLG = P002F2_A693TBM32_REQUIRED_INPUT_FLG[0] ;
         n693TBM32_REQUIRED_INPUT_FLG = P002F2_n693TBM32_REQUIRED_INPUT_FLG[0] ;
         A694TBM32_MIN_VALUE = P002F2_A694TBM32_MIN_VALUE[0] ;
         n694TBM32_MIN_VALUE = P002F2_n694TBM32_MIN_VALUE[0] ;
         A695TBM32_MAX_VALUE = P002F2_A695TBM32_MAX_VALUE[0] ;
         n695TBM32_MAX_VALUE = P002F2_n695TBM32_MAX_VALUE[0] ;
         A406TBM32_CRF_ITEM_NOTE = P002F2_A406TBM32_CRF_ITEM_NOTE[0] ;
         n406TBM32_CRF_ITEM_NOTE = P002F2_n406TBM32_CRF_ITEM_NOTE[0] ;
         A774TBM32_REF_CRF_ID = P002F2_A774TBM32_REF_CRF_ID[0] ;
         n774TBM32_REF_CRF_ID = P002F2_n774TBM32_REF_CRF_ID[0] ;
         A775TBM32_REF_CRF_ITEM_CD = P002F2_A775TBM32_REF_CRF_ITEM_CD[0] ;
         n775TBM32_REF_CRF_ITEM_CD = P002F2_n775TBM32_REF_CRF_ITEM_CD[0] ;
         A75TBM32_DEL_FLG = P002F2_A75TBM32_DEL_FLG[0] ;
         n75TBM32_DEL_FLG = P002F2_n75TBM32_DEL_FLG[0] ;
         A410TBM32_UPD_DATETIME = P002F2_A410TBM32_UPD_DATETIME[0] ;
         n410TBM32_UPD_DATETIME = P002F2_n410TBM32_UPD_DATETIME[0] ;
         A411TBM32_UPD_USER_ID = P002F2_A411TBM32_UPD_USER_ID[0] ;
         n411TBM32_UPD_USER_ID = P002F2_n411TBM32_UPD_USER_ID[0] ;
         A412TBM32_UPD_PROG_NM = P002F2_A412TBM32_UPD_PROG_NM[0] ;
         n412TBM32_UPD_PROG_NM = P002F2_n412TBM32_UPD_PROG_NM[0] ;
         if ( GXutil.strcmp(A72TBM32_CRF_ITEM_CD, (String)AV14W_CSV_COL.elementAt(-1+3)) == 0 )
         {
            AV41GXLvl90 = (byte)(1) ;
            AV37P_LOGKBN = "UPD" ;
            AV30W_CRT_DATETIME = A407TBM32_CRT_DATETIME ;
            AV31W_CRT_USER_ID = A408TBM32_CRT_USER_ID ;
            AV32W_CRT_PROG_NM = A409TBM32_CRT_PROG_NM ;
            AV29W_UPD_CNT = (long)(A413TBM32_UPD_CNT+1) ;
            A405TBM32_CRF_ITEM_NM = (String)AV14W_CSV_COL.elementAt(-1+4) ;
            n405TBM32_CRF_ITEM_NM = false ;
            A74TBM32_CRF_ITEM_DIV = (String)AV14W_CSV_COL.elementAt(-1+5) ;
            n74TBM32_CRF_ITEM_DIV = false ;
            A73TBM32_CRF_ITEM_GRP_CD = (String)AV14W_CSV_COL.elementAt(-1+6) ;
            n73TBM32_CRF_ITEM_GRP_CD = false ;
            A507TBM32_CRF_ITEM_GRP_ORDER = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+7))) ;
            n507TBM32_CRF_ITEM_GRP_ORDER = false ;
            A508TBM32_LOCATION_X = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+8))) ;
            n508TBM32_LOCATION_X = false ;
            A509TBM32_LOCATION_Y = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+9))) ;
            n509TBM32_LOCATION_Y = false ;
            A510TBM32_LOCATION_X2 = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+10))) ;
            n510TBM32_LOCATION_X2 = false ;
            A511TBM32_LOCATION_Y2 = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+11))) ;
            n511TBM32_LOCATION_Y2 = false ;
            if ( GXutil.strcmp((String)AV14W_CSV_COL.elementAt(-1+5), "Group") == 0 )
            {
               if ( ( GXutil.val( (String)AV14W_CSV_COL.elementAt(-1+10), ".") > 9999 ) || ( GXutil.val( (String)AV14W_CSV_COL.elementAt(-1+10), ".") < 0 ) )
               {
                  A510TBM32_LOCATION_X2 = (short)(9999) ;
                  n510TBM32_LOCATION_X2 = false ;
               }
               if ( ( GXutil.val( (String)AV14W_CSV_COL.elementAt(-1+11), ".") > 9999 ) || ( GXutil.val( (String)AV14W_CSV_COL.elementAt(-1+11), ".") < 0 ) )
               {
                  A511TBM32_LOCATION_Y2 = (short)(9999) ;
                  n511TBM32_LOCATION_Y2 = false ;
               }
            }
            A512TBM32_TEXT_ALIGN_DIV = (String)AV14W_CSV_COL.elementAt(-1+12) ;
            n512TBM32_TEXT_ALIGN_DIV = false ;
            A516TBM32_TEXT_MAXROWS = (byte)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+13))) ;
            n516TBM32_TEXT_MAXROWS = false ;
            A517TBM32_TEXT_MAXLENGTH = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+14))) ;
            n517TBM32_TEXT_MAXLENGTH = false ;
            A518TBM32_DECIMAL_DIGITS = (byte)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+15))) ;
            n518TBM32_DECIMAL_DIGITS = false ;
            A522TBM32_CHK_TRUE_INNER_VALUE = (String)AV14W_CSV_COL.elementAt(-1+16) ;
            n522TBM32_CHK_TRUE_INNER_VALUE = false ;
            A523TBM32_CHK_FALSE_INNER_VALUE = (String)AV14W_CSV_COL.elementAt(-1+17) ;
            n523TBM32_CHK_FALSE_INNER_VALUE = false ;
            A527TBM32_FIXED_VALUE = (String)AV14W_CSV_COL.elementAt(-1+18) ;
            n527TBM32_FIXED_VALUE = false ;
            A525TBM32_LIST_CD = (String)AV14W_CSV_COL.elementAt(-1+19) ;
            n525TBM32_LIST_CD = false ;
            A526TBM32_IMAGE_CD = (String)AV14W_CSV_COL.elementAt(-1+20) ;
            n526TBM32_IMAGE_CD = false ;
            A524TBM32_TEXT = (String)AV14W_CSV_COL.elementAt(-1+21) ;
            n524TBM32_TEXT = false ;
            A513TBM32_FONT_SIZE = (byte)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+22))) ;
            n513TBM32_FONT_SIZE = false ;
            A514TBM32_FONT_UL_FLG = (String)AV14W_CSV_COL.elementAt(-1+23) ;
            n514TBM32_FONT_UL_FLG = false ;
            A515TBM32_FONT_COLOR_DIV = GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+24)) ;
            n515TBM32_FONT_COLOR_DIV = false ;
            A521TBM32_LINE_SIZE_DIV = (byte)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+25))) ;
            n521TBM32_LINE_SIZE_DIV = false ;
            A689TBM32_LINE_COLOR_DIV = GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+26)) ;
            n689TBM32_LINE_COLOR_DIV = false ;
            A519TBM32_LINE_START_POINT_DIV = (String)AV14W_CSV_COL.elementAt(-1+27) ;
            n519TBM32_LINE_START_POINT_DIV = false ;
            A520TBM32_LINE_END_POINT_DIV = (String)AV14W_CSV_COL.elementAt(-1+28) ;
            n520TBM32_LINE_END_POINT_DIV = false ;
            A690TBM32_LINE_ANGLE = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+29))) ;
            n690TBM32_LINE_ANGLE = false ;
            A644TBM32_AUTH_LVL_MIN = (byte)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+30))) ;
            n644TBM32_AUTH_LVL_MIN = false ;
            A645TBM32_ZORDER = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+31))) ;
            n645TBM32_ZORDER = false ;
            A691TBM32_TAB_ORDER = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+32))) ;
            n691TBM32_TAB_ORDER = false ;
            A692TBM32_TABSTOP_FLG = (String)AV14W_CSV_COL.elementAt(-1+33) ;
            n692TBM32_TABSTOP_FLG = false ;
            A693TBM32_REQUIRED_INPUT_FLG = (String)AV14W_CSV_COL.elementAt(-1+34) ;
            n693TBM32_REQUIRED_INPUT_FLG = false ;
            A694TBM32_MIN_VALUE = (String)AV14W_CSV_COL.elementAt(-1+35) ;
            n694TBM32_MIN_VALUE = false ;
            A695TBM32_MAX_VALUE = (String)AV14W_CSV_COL.elementAt(-1+36) ;
            n695TBM32_MAX_VALUE = false ;
            A406TBM32_CRF_ITEM_NOTE = (String)AV14W_CSV_COL.elementAt(-1+37) ;
            n406TBM32_CRF_ITEM_NOTE = false ;
            A774TBM32_REF_CRF_ID = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+38))) ;
            n774TBM32_REF_CRF_ID = false ;
            A775TBM32_REF_CRF_ITEM_CD = (String)AV14W_CSV_COL.elementAt(-1+39) ;
            n775TBM32_REF_CRF_ITEM_CD = false ;
            A75TBM32_DEL_FLG = (String)AV14W_CSV_COL.elementAt(-1+40) ;
            n75TBM32_DEL_FLG = false ;
            A410TBM32_UPD_DATETIME = GXutil.now( ) ;
            n410TBM32_UPD_DATETIME = false ;
            A411TBM32_UPD_USER_ID = AV27W_USER_ID ;
            n411TBM32_UPD_USER_ID = false ;
            A412TBM32_UPD_PROG_NM = AV40Pgmname ;
            n412TBM32_UPD_PROG_NM = false ;
            A413TBM32_UPD_CNT = AV29W_UPD_CNT ;
            n413TBM32_UPD_CNT = false ;
            Gx_ope = "Update" ;
            Gx_etb = "TBM32_CRF_ITEM" ;
            /* Using cursor P002F3 */
            pr_default.execute(1, new Object[] {new Boolean(n413TBM32_UPD_CNT), new Long(A413TBM32_UPD_CNT), new Boolean(n405TBM32_CRF_ITEM_NM), A405TBM32_CRF_ITEM_NM, new Boolean(n74TBM32_CRF_ITEM_DIV), A74TBM32_CRF_ITEM_DIV, new Boolean(n73TBM32_CRF_ITEM_GRP_CD), A73TBM32_CRF_ITEM_GRP_CD, new Boolean(n507TBM32_CRF_ITEM_GRP_ORDER), new Short(A507TBM32_CRF_ITEM_GRP_ORDER), new Boolean(n508TBM32_LOCATION_X), new Short(A508TBM32_LOCATION_X), new Boolean(n509TBM32_LOCATION_Y), new Short(A509TBM32_LOCATION_Y), new Boolean(n510TBM32_LOCATION_X2), new Short(A510TBM32_LOCATION_X2), new Boolean(n511TBM32_LOCATION_Y2), new Short(A511TBM32_LOCATION_Y2), new Boolean(n512TBM32_TEXT_ALIGN_DIV), A512TBM32_TEXT_ALIGN_DIV, new Boolean(n516TBM32_TEXT_MAXROWS), new Byte(A516TBM32_TEXT_MAXROWS), new Boolean(n517TBM32_TEXT_MAXLENGTH), new Short(A517TBM32_TEXT_MAXLENGTH), new Boolean(n518TBM32_DECIMAL_DIGITS), new Byte(A518TBM32_DECIMAL_DIGITS), new Boolean(n522TBM32_CHK_TRUE_INNER_VALUE), A522TBM32_CHK_TRUE_INNER_VALUE, new Boolean(n523TBM32_CHK_FALSE_INNER_VALUE), A523TBM32_CHK_FALSE_INNER_VALUE, new Boolean(n527TBM32_FIXED_VALUE), A527TBM32_FIXED_VALUE, new Boolean(n525TBM32_LIST_CD), A525TBM32_LIST_CD, new Boolean(n526TBM32_IMAGE_CD), A526TBM32_IMAGE_CD, new Boolean(n524TBM32_TEXT), A524TBM32_TEXT, new Boolean(n513TBM32_FONT_SIZE), new Byte(A513TBM32_FONT_SIZE), new Boolean(n514TBM32_FONT_UL_FLG), A514TBM32_FONT_UL_FLG, new Boolean(n515TBM32_FONT_COLOR_DIV), new Long(A515TBM32_FONT_COLOR_DIV), new Boolean(n521TBM32_LINE_SIZE_DIV), new Byte(A521TBM32_LINE_SIZE_DIV), new Boolean(n689TBM32_LINE_COLOR_DIV), new Long(A689TBM32_LINE_COLOR_DIV), new Boolean(n519TBM32_LINE_START_POINT_DIV), A519TBM32_LINE_START_POINT_DIV, new Boolean(n520TBM32_LINE_END_POINT_DIV), A520TBM32_LINE_END_POINT_DIV, new Boolean(n690TBM32_LINE_ANGLE), new Short(A690TBM32_LINE_ANGLE), new Boolean(n644TBM32_AUTH_LVL_MIN), new Byte(A644TBM32_AUTH_LVL_MIN), new Boolean(n645TBM32_ZORDER), new Short(A645TBM32_ZORDER), new Boolean(n691TBM32_TAB_ORDER), new Short(A691TBM32_TAB_ORDER), new Boolean(n692TBM32_TABSTOP_FLG), A692TBM32_TABSTOP_FLG, new Boolean(n693TBM32_REQUIRED_INPUT_FLG), A693TBM32_REQUIRED_INPUT_FLG, new Boolean(n694TBM32_MIN_VALUE), A694TBM32_MIN_VALUE, new Boolean(n695TBM32_MAX_VALUE), A695TBM32_MAX_VALUE, new Boolean(n406TBM32_CRF_ITEM_NOTE), A406TBM32_CRF_ITEM_NOTE, new Boolean(n774TBM32_REF_CRF_ID), new Short(A774TBM32_REF_CRF_ID), new Boolean(n775TBM32_REF_CRF_ITEM_CD), A775TBM32_REF_CRF_ITEM_CD, new Boolean(n75TBM32_DEL_FLG), A75TBM32_DEL_FLG, new Boolean(n410TBM32_UPD_DATETIME), A410TBM32_UPD_DATETIME, new Boolean(n411TBM32_UPD_USER_ID), A411TBM32_UPD_USER_ID, new Boolean(n412TBM32_UPD_PROG_NM), A412TBM32_UPD_PROG_NM, new Long(A70TBM32_STUDY_ID), new Short(A71TBM32_CRF_ID), A72TBM32_CRF_ITEM_CD});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM32_CRF_ITEM") ;
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
         A70TBM32_STUDY_ID = GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+1)) ;
         A71TBM32_CRF_ID = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+2))) ;
         A72TBM32_CRF_ITEM_CD = (String)AV14W_CSV_COL.elementAt(-1+3) ;
         A405TBM32_CRF_ITEM_NM = (String)AV14W_CSV_COL.elementAt(-1+4) ;
         n405TBM32_CRF_ITEM_NM = false ;
         A74TBM32_CRF_ITEM_DIV = (String)AV14W_CSV_COL.elementAt(-1+5) ;
         n74TBM32_CRF_ITEM_DIV = false ;
         A73TBM32_CRF_ITEM_GRP_CD = (String)AV14W_CSV_COL.elementAt(-1+6) ;
         n73TBM32_CRF_ITEM_GRP_CD = false ;
         A507TBM32_CRF_ITEM_GRP_ORDER = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+7))) ;
         n507TBM32_CRF_ITEM_GRP_ORDER = false ;
         A508TBM32_LOCATION_X = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+8))) ;
         n508TBM32_LOCATION_X = false ;
         A509TBM32_LOCATION_Y = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+9))) ;
         n509TBM32_LOCATION_Y = false ;
         A510TBM32_LOCATION_X2 = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+10))) ;
         n510TBM32_LOCATION_X2 = false ;
         A511TBM32_LOCATION_Y2 = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+11))) ;
         n511TBM32_LOCATION_Y2 = false ;
         A512TBM32_TEXT_ALIGN_DIV = (String)AV14W_CSV_COL.elementAt(-1+12) ;
         n512TBM32_TEXT_ALIGN_DIV = false ;
         A516TBM32_TEXT_MAXROWS = (byte)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+13))) ;
         n516TBM32_TEXT_MAXROWS = false ;
         A517TBM32_TEXT_MAXLENGTH = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+14))) ;
         n517TBM32_TEXT_MAXLENGTH = false ;
         A518TBM32_DECIMAL_DIGITS = (byte)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+15))) ;
         n518TBM32_DECIMAL_DIGITS = false ;
         A522TBM32_CHK_TRUE_INNER_VALUE = (String)AV14W_CSV_COL.elementAt(-1+16) ;
         n522TBM32_CHK_TRUE_INNER_VALUE = false ;
         A523TBM32_CHK_FALSE_INNER_VALUE = (String)AV14W_CSV_COL.elementAt(-1+17) ;
         n523TBM32_CHK_FALSE_INNER_VALUE = false ;
         A527TBM32_FIXED_VALUE = (String)AV14W_CSV_COL.elementAt(-1+18) ;
         n527TBM32_FIXED_VALUE = false ;
         A525TBM32_LIST_CD = (String)AV14W_CSV_COL.elementAt(-1+19) ;
         n525TBM32_LIST_CD = false ;
         A526TBM32_IMAGE_CD = (String)AV14W_CSV_COL.elementAt(-1+20) ;
         n526TBM32_IMAGE_CD = false ;
         A524TBM32_TEXT = (String)AV14W_CSV_COL.elementAt(-1+21) ;
         n524TBM32_TEXT = false ;
         A513TBM32_FONT_SIZE = (byte)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+22))) ;
         n513TBM32_FONT_SIZE = false ;
         A514TBM32_FONT_UL_FLG = (String)AV14W_CSV_COL.elementAt(-1+23) ;
         n514TBM32_FONT_UL_FLG = false ;
         A515TBM32_FONT_COLOR_DIV = GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+24)) ;
         n515TBM32_FONT_COLOR_DIV = false ;
         A521TBM32_LINE_SIZE_DIV = (byte)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+25))) ;
         n521TBM32_LINE_SIZE_DIV = false ;
         A689TBM32_LINE_COLOR_DIV = GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+26)) ;
         n689TBM32_LINE_COLOR_DIV = false ;
         A519TBM32_LINE_START_POINT_DIV = (String)AV14W_CSV_COL.elementAt(-1+27) ;
         n519TBM32_LINE_START_POINT_DIV = false ;
         A520TBM32_LINE_END_POINT_DIV = (String)AV14W_CSV_COL.elementAt(-1+28) ;
         n520TBM32_LINE_END_POINT_DIV = false ;
         A690TBM32_LINE_ANGLE = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+29))) ;
         n690TBM32_LINE_ANGLE = false ;
         A644TBM32_AUTH_LVL_MIN = (byte)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+30))) ;
         n644TBM32_AUTH_LVL_MIN = false ;
         A645TBM32_ZORDER = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+31))) ;
         n645TBM32_ZORDER = false ;
         A691TBM32_TAB_ORDER = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+32))) ;
         n691TBM32_TAB_ORDER = false ;
         A692TBM32_TABSTOP_FLG = (String)AV14W_CSV_COL.elementAt(-1+33) ;
         n692TBM32_TABSTOP_FLG = false ;
         A693TBM32_REQUIRED_INPUT_FLG = (String)AV14W_CSV_COL.elementAt(-1+34) ;
         n693TBM32_REQUIRED_INPUT_FLG = false ;
         A694TBM32_MIN_VALUE = (String)AV14W_CSV_COL.elementAt(-1+35) ;
         n694TBM32_MIN_VALUE = false ;
         A695TBM32_MAX_VALUE = (String)AV14W_CSV_COL.elementAt(-1+36) ;
         n695TBM32_MAX_VALUE = false ;
         A406TBM32_CRF_ITEM_NOTE = (String)AV14W_CSV_COL.elementAt(-1+37) ;
         n406TBM32_CRF_ITEM_NOTE = false ;
         A774TBM32_REF_CRF_ID = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+38))) ;
         n774TBM32_REF_CRF_ID = false ;
         A775TBM32_REF_CRF_ITEM_CD = (String)AV14W_CSV_COL.elementAt(-1+39) ;
         n775TBM32_REF_CRF_ITEM_CD = false ;
         A75TBM32_DEL_FLG = (String)AV14W_CSV_COL.elementAt(-1+40) ;
         n75TBM32_DEL_FLG = false ;
         A407TBM32_CRT_DATETIME = GXutil.now( ) ;
         n407TBM32_CRT_DATETIME = false ;
         A408TBM32_CRT_USER_ID = AV27W_USER_ID ;
         n408TBM32_CRT_USER_ID = false ;
         A409TBM32_CRT_PROG_NM = AV40Pgmname ;
         n409TBM32_CRT_PROG_NM = false ;
         A410TBM32_UPD_DATETIME = GXutil.now( ) ;
         n410TBM32_UPD_DATETIME = false ;
         A411TBM32_UPD_USER_ID = AV27W_USER_ID ;
         n411TBM32_UPD_USER_ID = false ;
         A412TBM32_UPD_PROG_NM = AV40Pgmname ;
         n412TBM32_UPD_PROG_NM = false ;
         A413TBM32_UPD_CNT = 1 ;
         n413TBM32_UPD_CNT = false ;
         Gx_ope = "Insert" ;
         Gx_etb = "TBM32_CRF_ITEM" ;
         /* Using cursor P002F4 */
         pr_default.execute(2, new Object[] {new Long(A70TBM32_STUDY_ID), new Short(A71TBM32_CRF_ID), A72TBM32_CRF_ITEM_CD, new Boolean(n405TBM32_CRF_ITEM_NM), A405TBM32_CRF_ITEM_NM, new Boolean(n74TBM32_CRF_ITEM_DIV), A74TBM32_CRF_ITEM_DIV, new Boolean(n73TBM32_CRF_ITEM_GRP_CD), A73TBM32_CRF_ITEM_GRP_CD, new Boolean(n507TBM32_CRF_ITEM_GRP_ORDER), new Short(A507TBM32_CRF_ITEM_GRP_ORDER), new Boolean(n508TBM32_LOCATION_X), new Short(A508TBM32_LOCATION_X), new Boolean(n509TBM32_LOCATION_Y), new Short(A509TBM32_LOCATION_Y), new Boolean(n510TBM32_LOCATION_X2), new Short(A510TBM32_LOCATION_X2), new Boolean(n511TBM32_LOCATION_Y2), new Short(A511TBM32_LOCATION_Y2), new Boolean(n512TBM32_TEXT_ALIGN_DIV), A512TBM32_TEXT_ALIGN_DIV, new Boolean(n516TBM32_TEXT_MAXROWS), new Byte(A516TBM32_TEXT_MAXROWS), new Boolean(n517TBM32_TEXT_MAXLENGTH), new Short(A517TBM32_TEXT_MAXLENGTH), new Boolean(n518TBM32_DECIMAL_DIGITS), new Byte(A518TBM32_DECIMAL_DIGITS), new Boolean(n522TBM32_CHK_TRUE_INNER_VALUE), A522TBM32_CHK_TRUE_INNER_VALUE, new Boolean(n523TBM32_CHK_FALSE_INNER_VALUE), A523TBM32_CHK_FALSE_INNER_VALUE, new Boolean(n527TBM32_FIXED_VALUE), A527TBM32_FIXED_VALUE, new Boolean(n525TBM32_LIST_CD), A525TBM32_LIST_CD, new Boolean(n526TBM32_IMAGE_CD), A526TBM32_IMAGE_CD, new Boolean(n524TBM32_TEXT), A524TBM32_TEXT, new Boolean(n513TBM32_FONT_SIZE), new Byte(A513TBM32_FONT_SIZE), new Boolean(n514TBM32_FONT_UL_FLG), A514TBM32_FONT_UL_FLG, new Boolean(n515TBM32_FONT_COLOR_DIV), new Long(A515TBM32_FONT_COLOR_DIV), new Boolean(n521TBM32_LINE_SIZE_DIV), new Byte(A521TBM32_LINE_SIZE_DIV), new Boolean(n689TBM32_LINE_COLOR_DIV), new Long(A689TBM32_LINE_COLOR_DIV), new Boolean(n519TBM32_LINE_START_POINT_DIV), A519TBM32_LINE_START_POINT_DIV, new Boolean(n520TBM32_LINE_END_POINT_DIV), A520TBM32_LINE_END_POINT_DIV, new Boolean(n690TBM32_LINE_ANGLE), new Short(A690TBM32_LINE_ANGLE), new Boolean(n644TBM32_AUTH_LVL_MIN), new Byte(A644TBM32_AUTH_LVL_MIN), new Boolean(n645TBM32_ZORDER), new Short(A645TBM32_ZORDER), new Boolean(n691TBM32_TAB_ORDER), new Short(A691TBM32_TAB_ORDER), new Boolean(n692TBM32_TABSTOP_FLG), A692TBM32_TABSTOP_FLG, new Boolean(n693TBM32_REQUIRED_INPUT_FLG), A693TBM32_REQUIRED_INPUT_FLG, new Boolean(n694TBM32_MIN_VALUE), A694TBM32_MIN_VALUE, new Boolean(n695TBM32_MAX_VALUE), A695TBM32_MAX_VALUE, new Boolean(n406TBM32_CRF_ITEM_NOTE), A406TBM32_CRF_ITEM_NOTE, new Boolean(n774TBM32_REF_CRF_ID), new Short(A774TBM32_REF_CRF_ID), new Boolean(n775TBM32_REF_CRF_ITEM_CD), A775TBM32_REF_CRF_ITEM_CD, new Boolean(n75TBM32_DEL_FLG), A75TBM32_DEL_FLG, new Boolean(n407TBM32_CRT_DATETIME), A407TBM32_CRT_DATETIME, new Boolean(n408TBM32_CRT_USER_ID), A408TBM32_CRT_USER_ID, new Boolean(n409TBM32_CRT_PROG_NM), A409TBM32_CRT_PROG_NM, new Boolean(n410TBM32_UPD_DATETIME), A410TBM32_UPD_DATETIME, new Boolean(n411TBM32_UPD_USER_ID), A411TBM32_UPD_USER_ID, new Boolean(n412TBM32_UPD_PROG_NM), A412TBM32_UPD_PROG_NM, new Boolean(n413TBM32_UPD_CNT), new Long(A413TBM32_UPD_CNT)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM32_CRF_ITEM") ;
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

   public void S121( )
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

   public void S131( )
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
      A407TBM32_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A408TBM32_CRT_USER_ID = "" ;
      A409TBM32_CRT_PROG_NM = "" ;
      A405TBM32_CRF_ITEM_NM = "" ;
      A74TBM32_CRF_ITEM_DIV = "" ;
      A73TBM32_CRF_ITEM_GRP_CD = "" ;
      A512TBM32_TEXT_ALIGN_DIV = "" ;
      A522TBM32_CHK_TRUE_INNER_VALUE = "" ;
      A523TBM32_CHK_FALSE_INNER_VALUE = "" ;
      A527TBM32_FIXED_VALUE = "" ;
      A525TBM32_LIST_CD = "" ;
      A526TBM32_IMAGE_CD = "" ;
      A524TBM32_TEXT = "" ;
      A514TBM32_FONT_UL_FLG = "" ;
      A519TBM32_LINE_START_POINT_DIV = "" ;
      A520TBM32_LINE_END_POINT_DIV = "" ;
      A692TBM32_TABSTOP_FLG = "" ;
      A693TBM32_REQUIRED_INPUT_FLG = "" ;
      A694TBM32_MIN_VALUE = "" ;
      A695TBM32_MAX_VALUE = "" ;
      A406TBM32_CRF_ITEM_NOTE = "" ;
      A775TBM32_REF_CRF_ITEM_CD = "" ;
      A75TBM32_DEL_FLG = "" ;
      A410TBM32_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A411TBM32_UPD_USER_ID = "" ;
      A412TBM32_UPD_PROG_NM = "" ;
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
      P002F2_A72TBM32_CRF_ITEM_CD = new String[] {""} ;
      P002F2_A71TBM32_CRF_ID = new short[1] ;
      P002F2_A70TBM32_STUDY_ID = new long[1] ;
      P002F2_A407TBM32_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P002F2_n407TBM32_CRT_DATETIME = new boolean[] {false} ;
      P002F2_A408TBM32_CRT_USER_ID = new String[] {""} ;
      P002F2_n408TBM32_CRT_USER_ID = new boolean[] {false} ;
      P002F2_A409TBM32_CRT_PROG_NM = new String[] {""} ;
      P002F2_n409TBM32_CRT_PROG_NM = new boolean[] {false} ;
      P002F2_A413TBM32_UPD_CNT = new long[1] ;
      P002F2_n413TBM32_UPD_CNT = new boolean[] {false} ;
      P002F2_A405TBM32_CRF_ITEM_NM = new String[] {""} ;
      P002F2_n405TBM32_CRF_ITEM_NM = new boolean[] {false} ;
      P002F2_A74TBM32_CRF_ITEM_DIV = new String[] {""} ;
      P002F2_n74TBM32_CRF_ITEM_DIV = new boolean[] {false} ;
      P002F2_A73TBM32_CRF_ITEM_GRP_CD = new String[] {""} ;
      P002F2_n73TBM32_CRF_ITEM_GRP_CD = new boolean[] {false} ;
      P002F2_A507TBM32_CRF_ITEM_GRP_ORDER = new short[1] ;
      P002F2_n507TBM32_CRF_ITEM_GRP_ORDER = new boolean[] {false} ;
      P002F2_A508TBM32_LOCATION_X = new short[1] ;
      P002F2_n508TBM32_LOCATION_X = new boolean[] {false} ;
      P002F2_A509TBM32_LOCATION_Y = new short[1] ;
      P002F2_n509TBM32_LOCATION_Y = new boolean[] {false} ;
      P002F2_A510TBM32_LOCATION_X2 = new short[1] ;
      P002F2_n510TBM32_LOCATION_X2 = new boolean[] {false} ;
      P002F2_A511TBM32_LOCATION_Y2 = new short[1] ;
      P002F2_n511TBM32_LOCATION_Y2 = new boolean[] {false} ;
      P002F2_A512TBM32_TEXT_ALIGN_DIV = new String[] {""} ;
      P002F2_n512TBM32_TEXT_ALIGN_DIV = new boolean[] {false} ;
      P002F2_A516TBM32_TEXT_MAXROWS = new byte[1] ;
      P002F2_n516TBM32_TEXT_MAXROWS = new boolean[] {false} ;
      P002F2_A517TBM32_TEXT_MAXLENGTH = new short[1] ;
      P002F2_n517TBM32_TEXT_MAXLENGTH = new boolean[] {false} ;
      P002F2_A518TBM32_DECIMAL_DIGITS = new byte[1] ;
      P002F2_n518TBM32_DECIMAL_DIGITS = new boolean[] {false} ;
      P002F2_A522TBM32_CHK_TRUE_INNER_VALUE = new String[] {""} ;
      P002F2_n522TBM32_CHK_TRUE_INNER_VALUE = new boolean[] {false} ;
      P002F2_A523TBM32_CHK_FALSE_INNER_VALUE = new String[] {""} ;
      P002F2_n523TBM32_CHK_FALSE_INNER_VALUE = new boolean[] {false} ;
      P002F2_A527TBM32_FIXED_VALUE = new String[] {""} ;
      P002F2_n527TBM32_FIXED_VALUE = new boolean[] {false} ;
      P002F2_A525TBM32_LIST_CD = new String[] {""} ;
      P002F2_n525TBM32_LIST_CD = new boolean[] {false} ;
      P002F2_A526TBM32_IMAGE_CD = new String[] {""} ;
      P002F2_n526TBM32_IMAGE_CD = new boolean[] {false} ;
      P002F2_A524TBM32_TEXT = new String[] {""} ;
      P002F2_n524TBM32_TEXT = new boolean[] {false} ;
      P002F2_A513TBM32_FONT_SIZE = new byte[1] ;
      P002F2_n513TBM32_FONT_SIZE = new boolean[] {false} ;
      P002F2_A514TBM32_FONT_UL_FLG = new String[] {""} ;
      P002F2_n514TBM32_FONT_UL_FLG = new boolean[] {false} ;
      P002F2_A515TBM32_FONT_COLOR_DIV = new long[1] ;
      P002F2_n515TBM32_FONT_COLOR_DIV = new boolean[] {false} ;
      P002F2_A521TBM32_LINE_SIZE_DIV = new byte[1] ;
      P002F2_n521TBM32_LINE_SIZE_DIV = new boolean[] {false} ;
      P002F2_A689TBM32_LINE_COLOR_DIV = new long[1] ;
      P002F2_n689TBM32_LINE_COLOR_DIV = new boolean[] {false} ;
      P002F2_A519TBM32_LINE_START_POINT_DIV = new String[] {""} ;
      P002F2_n519TBM32_LINE_START_POINT_DIV = new boolean[] {false} ;
      P002F2_A520TBM32_LINE_END_POINT_DIV = new String[] {""} ;
      P002F2_n520TBM32_LINE_END_POINT_DIV = new boolean[] {false} ;
      P002F2_A690TBM32_LINE_ANGLE = new short[1] ;
      P002F2_n690TBM32_LINE_ANGLE = new boolean[] {false} ;
      P002F2_A644TBM32_AUTH_LVL_MIN = new byte[1] ;
      P002F2_n644TBM32_AUTH_LVL_MIN = new boolean[] {false} ;
      P002F2_A645TBM32_ZORDER = new short[1] ;
      P002F2_n645TBM32_ZORDER = new boolean[] {false} ;
      P002F2_A691TBM32_TAB_ORDER = new short[1] ;
      P002F2_n691TBM32_TAB_ORDER = new boolean[] {false} ;
      P002F2_A692TBM32_TABSTOP_FLG = new String[] {""} ;
      P002F2_n692TBM32_TABSTOP_FLG = new boolean[] {false} ;
      P002F2_A693TBM32_REQUIRED_INPUT_FLG = new String[] {""} ;
      P002F2_n693TBM32_REQUIRED_INPUT_FLG = new boolean[] {false} ;
      P002F2_A694TBM32_MIN_VALUE = new String[] {""} ;
      P002F2_n694TBM32_MIN_VALUE = new boolean[] {false} ;
      P002F2_A695TBM32_MAX_VALUE = new String[] {""} ;
      P002F2_n695TBM32_MAX_VALUE = new boolean[] {false} ;
      P002F2_A406TBM32_CRF_ITEM_NOTE = new String[] {""} ;
      P002F2_n406TBM32_CRF_ITEM_NOTE = new boolean[] {false} ;
      P002F2_A774TBM32_REF_CRF_ID = new short[1] ;
      P002F2_n774TBM32_REF_CRF_ID = new boolean[] {false} ;
      P002F2_A775TBM32_REF_CRF_ITEM_CD = new String[] {""} ;
      P002F2_n775TBM32_REF_CRF_ITEM_CD = new boolean[] {false} ;
      P002F2_A75TBM32_DEL_FLG = new String[] {""} ;
      P002F2_n75TBM32_DEL_FLG = new boolean[] {false} ;
      P002F2_A410TBM32_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P002F2_n410TBM32_UPD_DATETIME = new boolean[] {false} ;
      P002F2_A411TBM32_UPD_USER_ID = new String[] {""} ;
      P002F2_n411TBM32_UPD_USER_ID = new boolean[] {false} ;
      P002F2_A412TBM32_UPD_PROG_NM = new String[] {""} ;
      P002F2_n412TBM32_UPD_PROG_NM = new boolean[] {false} ;
      A72TBM32_CRF_ITEM_CD = "" ;
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
            P002F2_A72TBM32_CRF_ITEM_CD, P002F2_A71TBM32_CRF_ID, P002F2_A70TBM32_STUDY_ID, P002F2_A407TBM32_CRT_DATETIME, P002F2_n407TBM32_CRT_DATETIME, P002F2_A408TBM32_CRT_USER_ID, P002F2_n408TBM32_CRT_USER_ID, P002F2_A409TBM32_CRT_PROG_NM, P002F2_n409TBM32_CRT_PROG_NM, P002F2_A413TBM32_UPD_CNT,
            P002F2_n413TBM32_UPD_CNT, P002F2_A405TBM32_CRF_ITEM_NM, P002F2_n405TBM32_CRF_ITEM_NM, P002F2_A74TBM32_CRF_ITEM_DIV, P002F2_n74TBM32_CRF_ITEM_DIV, P002F2_A73TBM32_CRF_ITEM_GRP_CD, P002F2_n73TBM32_CRF_ITEM_GRP_CD, P002F2_A507TBM32_CRF_ITEM_GRP_ORDER, P002F2_n507TBM32_CRF_ITEM_GRP_ORDER, P002F2_A508TBM32_LOCATION_X,
            P002F2_n508TBM32_LOCATION_X, P002F2_A509TBM32_LOCATION_Y, P002F2_n509TBM32_LOCATION_Y, P002F2_A510TBM32_LOCATION_X2, P002F2_n510TBM32_LOCATION_X2, P002F2_A511TBM32_LOCATION_Y2, P002F2_n511TBM32_LOCATION_Y2, P002F2_A512TBM32_TEXT_ALIGN_DIV, P002F2_n512TBM32_TEXT_ALIGN_DIV, P002F2_A516TBM32_TEXT_MAXROWS,
            P002F2_n516TBM32_TEXT_MAXROWS, P002F2_A517TBM32_TEXT_MAXLENGTH, P002F2_n517TBM32_TEXT_MAXLENGTH, P002F2_A518TBM32_DECIMAL_DIGITS, P002F2_n518TBM32_DECIMAL_DIGITS, P002F2_A522TBM32_CHK_TRUE_INNER_VALUE, P002F2_n522TBM32_CHK_TRUE_INNER_VALUE, P002F2_A523TBM32_CHK_FALSE_INNER_VALUE, P002F2_n523TBM32_CHK_FALSE_INNER_VALUE, P002F2_A527TBM32_FIXED_VALUE,
            P002F2_n527TBM32_FIXED_VALUE, P002F2_A525TBM32_LIST_CD, P002F2_n525TBM32_LIST_CD, P002F2_A526TBM32_IMAGE_CD, P002F2_n526TBM32_IMAGE_CD, P002F2_A524TBM32_TEXT, P002F2_n524TBM32_TEXT, P002F2_A513TBM32_FONT_SIZE, P002F2_n513TBM32_FONT_SIZE, P002F2_A514TBM32_FONT_UL_FLG,
            P002F2_n514TBM32_FONT_UL_FLG, P002F2_A515TBM32_FONT_COLOR_DIV, P002F2_n515TBM32_FONT_COLOR_DIV, P002F2_A521TBM32_LINE_SIZE_DIV, P002F2_n521TBM32_LINE_SIZE_DIV, P002F2_A689TBM32_LINE_COLOR_DIV, P002F2_n689TBM32_LINE_COLOR_DIV, P002F2_A519TBM32_LINE_START_POINT_DIV, P002F2_n519TBM32_LINE_START_POINT_DIV, P002F2_A520TBM32_LINE_END_POINT_DIV,
            P002F2_n520TBM32_LINE_END_POINT_DIV, P002F2_A690TBM32_LINE_ANGLE, P002F2_n690TBM32_LINE_ANGLE, P002F2_A644TBM32_AUTH_LVL_MIN, P002F2_n644TBM32_AUTH_LVL_MIN, P002F2_A645TBM32_ZORDER, P002F2_n645TBM32_ZORDER, P002F2_A691TBM32_TAB_ORDER, P002F2_n691TBM32_TAB_ORDER, P002F2_A692TBM32_TABSTOP_FLG,
            P002F2_n692TBM32_TABSTOP_FLG, P002F2_A693TBM32_REQUIRED_INPUT_FLG, P002F2_n693TBM32_REQUIRED_INPUT_FLG, P002F2_A694TBM32_MIN_VALUE, P002F2_n694TBM32_MIN_VALUE, P002F2_A695TBM32_MAX_VALUE, P002F2_n695TBM32_MAX_VALUE, P002F2_A406TBM32_CRF_ITEM_NOTE, P002F2_n406TBM32_CRF_ITEM_NOTE, P002F2_A774TBM32_REF_CRF_ID,
            P002F2_n774TBM32_REF_CRF_ID, P002F2_A775TBM32_REF_CRF_ITEM_CD, P002F2_n775TBM32_REF_CRF_ITEM_CD, P002F2_A75TBM32_DEL_FLG, P002F2_n75TBM32_DEL_FLG, P002F2_A410TBM32_UPD_DATETIME, P002F2_n410TBM32_UPD_DATETIME, P002F2_A411TBM32_UPD_USER_ID, P002F2_n411TBM32_UPD_USER_ID, P002F2_A412TBM32_UPD_PROG_NM,
            P002F2_n412TBM32_UPD_PROG_NM
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

   private byte A516TBM32_TEXT_MAXROWS ;
   private byte A518TBM32_DECIMAL_DIGITS ;
   private byte A513TBM32_FONT_SIZE ;
   private byte A521TBM32_LINE_SIZE_DIV ;
   private byte A644TBM32_AUTH_LVL_MIN ;
   private byte AV41GXLvl90 ;
   private short AV23W_RTN_CD ;
   private short AV16W_ERR_CD ;
   private short A507TBM32_CRF_ITEM_GRP_ORDER ;
   private short A508TBM32_LOCATION_X ;
   private short A509TBM32_LOCATION_Y ;
   private short A510TBM32_LOCATION_X2 ;
   private short A511TBM32_LOCATION_Y2 ;
   private short A517TBM32_TEXT_MAXLENGTH ;
   private short A690TBM32_LINE_ANGLE ;
   private short A645TBM32_ZORDER ;
   private short A691TBM32_TAB_ORDER ;
   private short A774TBM32_REF_CRF_ID ;
   private short AV13W_CRF_ID ;
   private short Gx_err ;
   private short A71TBM32_CRF_ID ;
   private short GXv_int5[] ;
   private int GX_INS19 ;
   private int GXActiveErrHndl ;
   private long AV12W_CNT ;
   private long AV19W_MAX_ERROR_COUNT ;
   private long A413TBM32_UPD_CNT ;
   private long A515TBM32_FONT_COLOR_DIV ;
   private long A689TBM32_LINE_COLOR_DIV ;
   private long AV25W_STUDY_ID ;
   private long AV29W_UPD_CNT ;
   private long A70TBM32_STUDY_ID ;
   private String AV40Pgmname ;
   private String scmdbuf ;
   private String Gx_ope ;
   private String Gx_etb ;
   private String Gx_emsg ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private java.util.Date AV28W_UPDATE_TIME ;
   private java.util.Date A407TBM32_CRT_DATETIME ;
   private java.util.Date A410TBM32_UPD_DATETIME ;
   private java.util.Date AV30W_CRT_DATETIME ;
   private java.util.Date AV33W_UPD_DATETIME ;
   private boolean returnInSub ;
   private boolean n407TBM32_CRT_DATETIME ;
   private boolean n408TBM32_CRT_USER_ID ;
   private boolean n409TBM32_CRT_PROG_NM ;
   private boolean n413TBM32_UPD_CNT ;
   private boolean n405TBM32_CRF_ITEM_NM ;
   private boolean n74TBM32_CRF_ITEM_DIV ;
   private boolean n73TBM32_CRF_ITEM_GRP_CD ;
   private boolean n507TBM32_CRF_ITEM_GRP_ORDER ;
   private boolean n508TBM32_LOCATION_X ;
   private boolean n509TBM32_LOCATION_Y ;
   private boolean n510TBM32_LOCATION_X2 ;
   private boolean n511TBM32_LOCATION_Y2 ;
   private boolean n512TBM32_TEXT_ALIGN_DIV ;
   private boolean n516TBM32_TEXT_MAXROWS ;
   private boolean n517TBM32_TEXT_MAXLENGTH ;
   private boolean n518TBM32_DECIMAL_DIGITS ;
   private boolean n522TBM32_CHK_TRUE_INNER_VALUE ;
   private boolean n523TBM32_CHK_FALSE_INNER_VALUE ;
   private boolean n527TBM32_FIXED_VALUE ;
   private boolean n525TBM32_LIST_CD ;
   private boolean n526TBM32_IMAGE_CD ;
   private boolean n524TBM32_TEXT ;
   private boolean n513TBM32_FONT_SIZE ;
   private boolean n514TBM32_FONT_UL_FLG ;
   private boolean n515TBM32_FONT_COLOR_DIV ;
   private boolean n521TBM32_LINE_SIZE_DIV ;
   private boolean n689TBM32_LINE_COLOR_DIV ;
   private boolean n519TBM32_LINE_START_POINT_DIV ;
   private boolean n520TBM32_LINE_END_POINT_DIV ;
   private boolean n690TBM32_LINE_ANGLE ;
   private boolean n644TBM32_AUTH_LVL_MIN ;
   private boolean n645TBM32_ZORDER ;
   private boolean n691TBM32_TAB_ORDER ;
   private boolean n692TBM32_TABSTOP_FLG ;
   private boolean n693TBM32_REQUIRED_INPUT_FLG ;
   private boolean n694TBM32_MIN_VALUE ;
   private boolean n695TBM32_MAX_VALUE ;
   private boolean n406TBM32_CRF_ITEM_NOTE ;
   private boolean n774TBM32_REF_CRF_ID ;
   private boolean n775TBM32_REF_CRF_ITEM_CD ;
   private boolean n75TBM32_DEL_FLG ;
   private boolean n410TBM32_UPD_DATETIME ;
   private boolean n411TBM32_UPD_USER_ID ;
   private boolean n412TBM32_UPD_PROG_NM ;
   private String AV11P_STUDY_ID ;
   private String AV9P_CRF_ID ;
   private String AV10P_CRF_ITEM ;
   private String AV8C_APP_ID ;
   private String AV21W_NEWLINE ;
   private String AV27W_USER_ID ;
   private String AV20W_MSG ;
   private String A408TBM32_CRT_USER_ID ;
   private String A409TBM32_CRT_PROG_NM ;
   private String A405TBM32_CRF_ITEM_NM ;
   private String A74TBM32_CRF_ITEM_DIV ;
   private String A73TBM32_CRF_ITEM_GRP_CD ;
   private String A512TBM32_TEXT_ALIGN_DIV ;
   private String A522TBM32_CHK_TRUE_INNER_VALUE ;
   private String A523TBM32_CHK_FALSE_INNER_VALUE ;
   private String A527TBM32_FIXED_VALUE ;
   private String A525TBM32_LIST_CD ;
   private String A526TBM32_IMAGE_CD ;
   private String A524TBM32_TEXT ;
   private String A514TBM32_FONT_UL_FLG ;
   private String A519TBM32_LINE_START_POINT_DIV ;
   private String A520TBM32_LINE_END_POINT_DIV ;
   private String A692TBM32_TABSTOP_FLG ;
   private String A693TBM32_REQUIRED_INPUT_FLG ;
   private String A694TBM32_MIN_VALUE ;
   private String A695TBM32_MAX_VALUE ;
   private String A406TBM32_CRF_ITEM_NOTE ;
   private String A775TBM32_REF_CRF_ITEM_CD ;
   private String A75TBM32_DEL_FLG ;
   private String A411TBM32_UPD_USER_ID ;
   private String A412TBM32_UPD_PROG_NM ;
   private String AV31W_CRT_USER_ID ;
   private String AV32W_CRT_PROG_NM ;
   private String AV34W_UPD_USER_ID ;
   private String AV35W_UPD_PROG_NM ;
   private String A72TBM32_CRF_ITEM_CD ;
   private String AV37P_LOGKBN ;
   private String AV26W_SYS_VALUE ;
   private String AV17W_ERR_MSG ;
   private short[] aP3 ;
   private GxObjectCollection[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P002F2_A72TBM32_CRF_ITEM_CD ;
   private short[] P002F2_A71TBM32_CRF_ID ;
   private long[] P002F2_A70TBM32_STUDY_ID ;
   private java.util.Date[] P002F2_A407TBM32_CRT_DATETIME ;
   private boolean[] P002F2_n407TBM32_CRT_DATETIME ;
   private String[] P002F2_A408TBM32_CRT_USER_ID ;
   private boolean[] P002F2_n408TBM32_CRT_USER_ID ;
   private String[] P002F2_A409TBM32_CRT_PROG_NM ;
   private boolean[] P002F2_n409TBM32_CRT_PROG_NM ;
   private long[] P002F2_A413TBM32_UPD_CNT ;
   private boolean[] P002F2_n413TBM32_UPD_CNT ;
   private String[] P002F2_A405TBM32_CRF_ITEM_NM ;
   private boolean[] P002F2_n405TBM32_CRF_ITEM_NM ;
   private String[] P002F2_A74TBM32_CRF_ITEM_DIV ;
   private boolean[] P002F2_n74TBM32_CRF_ITEM_DIV ;
   private String[] P002F2_A73TBM32_CRF_ITEM_GRP_CD ;
   private boolean[] P002F2_n73TBM32_CRF_ITEM_GRP_CD ;
   private short[] P002F2_A507TBM32_CRF_ITEM_GRP_ORDER ;
   private boolean[] P002F2_n507TBM32_CRF_ITEM_GRP_ORDER ;
   private short[] P002F2_A508TBM32_LOCATION_X ;
   private boolean[] P002F2_n508TBM32_LOCATION_X ;
   private short[] P002F2_A509TBM32_LOCATION_Y ;
   private boolean[] P002F2_n509TBM32_LOCATION_Y ;
   private short[] P002F2_A510TBM32_LOCATION_X2 ;
   private boolean[] P002F2_n510TBM32_LOCATION_X2 ;
   private short[] P002F2_A511TBM32_LOCATION_Y2 ;
   private boolean[] P002F2_n511TBM32_LOCATION_Y2 ;
   private String[] P002F2_A512TBM32_TEXT_ALIGN_DIV ;
   private boolean[] P002F2_n512TBM32_TEXT_ALIGN_DIV ;
   private byte[] P002F2_A516TBM32_TEXT_MAXROWS ;
   private boolean[] P002F2_n516TBM32_TEXT_MAXROWS ;
   private short[] P002F2_A517TBM32_TEXT_MAXLENGTH ;
   private boolean[] P002F2_n517TBM32_TEXT_MAXLENGTH ;
   private byte[] P002F2_A518TBM32_DECIMAL_DIGITS ;
   private boolean[] P002F2_n518TBM32_DECIMAL_DIGITS ;
   private String[] P002F2_A522TBM32_CHK_TRUE_INNER_VALUE ;
   private boolean[] P002F2_n522TBM32_CHK_TRUE_INNER_VALUE ;
   private String[] P002F2_A523TBM32_CHK_FALSE_INNER_VALUE ;
   private boolean[] P002F2_n523TBM32_CHK_FALSE_INNER_VALUE ;
   private String[] P002F2_A527TBM32_FIXED_VALUE ;
   private boolean[] P002F2_n527TBM32_FIXED_VALUE ;
   private String[] P002F2_A525TBM32_LIST_CD ;
   private boolean[] P002F2_n525TBM32_LIST_CD ;
   private String[] P002F2_A526TBM32_IMAGE_CD ;
   private boolean[] P002F2_n526TBM32_IMAGE_CD ;
   private String[] P002F2_A524TBM32_TEXT ;
   private boolean[] P002F2_n524TBM32_TEXT ;
   private byte[] P002F2_A513TBM32_FONT_SIZE ;
   private boolean[] P002F2_n513TBM32_FONT_SIZE ;
   private String[] P002F2_A514TBM32_FONT_UL_FLG ;
   private boolean[] P002F2_n514TBM32_FONT_UL_FLG ;
   private long[] P002F2_A515TBM32_FONT_COLOR_DIV ;
   private boolean[] P002F2_n515TBM32_FONT_COLOR_DIV ;
   private byte[] P002F2_A521TBM32_LINE_SIZE_DIV ;
   private boolean[] P002F2_n521TBM32_LINE_SIZE_DIV ;
   private long[] P002F2_A689TBM32_LINE_COLOR_DIV ;
   private boolean[] P002F2_n689TBM32_LINE_COLOR_DIV ;
   private String[] P002F2_A519TBM32_LINE_START_POINT_DIV ;
   private boolean[] P002F2_n519TBM32_LINE_START_POINT_DIV ;
   private String[] P002F2_A520TBM32_LINE_END_POINT_DIV ;
   private boolean[] P002F2_n520TBM32_LINE_END_POINT_DIV ;
   private short[] P002F2_A690TBM32_LINE_ANGLE ;
   private boolean[] P002F2_n690TBM32_LINE_ANGLE ;
   private byte[] P002F2_A644TBM32_AUTH_LVL_MIN ;
   private boolean[] P002F2_n644TBM32_AUTH_LVL_MIN ;
   private short[] P002F2_A645TBM32_ZORDER ;
   private boolean[] P002F2_n645TBM32_ZORDER ;
   private short[] P002F2_A691TBM32_TAB_ORDER ;
   private boolean[] P002F2_n691TBM32_TAB_ORDER ;
   private String[] P002F2_A692TBM32_TABSTOP_FLG ;
   private boolean[] P002F2_n692TBM32_TABSTOP_FLG ;
   private String[] P002F2_A693TBM32_REQUIRED_INPUT_FLG ;
   private boolean[] P002F2_n693TBM32_REQUIRED_INPUT_FLG ;
   private String[] P002F2_A694TBM32_MIN_VALUE ;
   private boolean[] P002F2_n694TBM32_MIN_VALUE ;
   private String[] P002F2_A695TBM32_MAX_VALUE ;
   private boolean[] P002F2_n695TBM32_MAX_VALUE ;
   private String[] P002F2_A406TBM32_CRF_ITEM_NOTE ;
   private boolean[] P002F2_n406TBM32_CRF_ITEM_NOTE ;
   private short[] P002F2_A774TBM32_REF_CRF_ID ;
   private boolean[] P002F2_n774TBM32_REF_CRF_ID ;
   private String[] P002F2_A775TBM32_REF_CRF_ITEM_CD ;
   private boolean[] P002F2_n775TBM32_REF_CRF_ITEM_CD ;
   private String[] P002F2_A75TBM32_DEL_FLG ;
   private boolean[] P002F2_n75TBM32_DEL_FLG ;
   private java.util.Date[] P002F2_A410TBM32_UPD_DATETIME ;
   private boolean[] P002F2_n410TBM32_UPD_DATETIME ;
   private String[] P002F2_A411TBM32_UPD_USER_ID ;
   private boolean[] P002F2_n411TBM32_UPD_USER_ID ;
   private String[] P002F2_A412TBM32_UPD_PROG_NM ;
   private boolean[] P002F2_n412TBM32_UPD_PROG_NM ;
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
          new ForEachCursor("P002F2", "SELECT `TBM32_CRF_ITEM_CD`, `TBM32_CRF_ID`, `TBM32_STUDY_ID`, `TBM32_CRT_DATETIME`, `TBM32_CRT_USER_ID`, `TBM32_CRT_PROG_NM`, `TBM32_UPD_CNT`, `TBM32_CRF_ITEM_NM`, `TBM32_CRF_ITEM_DIV`, `TBM32_CRF_ITEM_GRP_CD`, `TBM32_CRF_ITEM_GRP_ORDER`, `TBM32_LOCATION_X`, `TBM32_LOCATION_Y`, `TBM32_LOCATION_X2`, `TBM32_LOCATION_Y2`, `TBM32_TEXT_ALIGN_DIV`, `TBM32_TEXT_MAXROWS`, `TBM32_TEXT_MAXLENGTH`, `TBM32_DECIMAL_DIGITS`, `TBM32_CHK_TRUE_INNER_VALUE`, `TBM32_CHK_FALSE_INNER_VALUE`, `TBM32_FIXED_VALUE`, `TBM32_LIST_CD`, `TBM32_IMAGE_CD`, `TBM32_TEXT`, `TBM32_FONT_SIZE`, `TBM32_FONT_UL_FLG`, `TBM32_FONT_COLOR_DIV`, `TBM32_LINE_SIZE_DIV`, `TBM32_LINE_COLOR_DIV`, `TBM32_LINE_START_POINT_DIV`, `TBM32_LINE_END_POINT_DIV`, `TBM32_LINE_ANGLE`, `TBM32_AUTH_LVL_MIN`, `TBM32_ZORDER`, `TBM32_TAB_ORDER`, `TBM32_TABSTOP_FLG`, `TBM32_REQUIRED_INPUT_FLG`, `TBM32_MIN_VALUE`, `TBM32_MAX_VALUE`, `TBM32_CRF_ITEM_NOTE`, `TBM32_REF_CRF_ID`, `TBM32_REF_CRF_ITEM_CD`, `TBM32_DEL_FLG`, `TBM32_UPD_DATETIME`, `TBM32_UPD_USER_ID`, `TBM32_UPD_PROG_NM` FROM `TBM32_CRF_ITEM` WHERE `TBM32_STUDY_ID` = ? and `TBM32_CRF_ID` = ? ORDER BY `TBM32_STUDY_ID`, `TBM32_CRF_ID`  FOR UPDATE ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new UpdateCursor("P002F3", "UPDATE `TBM32_CRF_ITEM` SET `TBM32_UPD_CNT`=?, `TBM32_CRF_ITEM_NM`=?, `TBM32_CRF_ITEM_DIV`=?, `TBM32_CRF_ITEM_GRP_CD`=?, `TBM32_CRF_ITEM_GRP_ORDER`=?, `TBM32_LOCATION_X`=?, `TBM32_LOCATION_Y`=?, `TBM32_LOCATION_X2`=?, `TBM32_LOCATION_Y2`=?, `TBM32_TEXT_ALIGN_DIV`=?, `TBM32_TEXT_MAXROWS`=?, `TBM32_TEXT_MAXLENGTH`=?, `TBM32_DECIMAL_DIGITS`=?, `TBM32_CHK_TRUE_INNER_VALUE`=?, `TBM32_CHK_FALSE_INNER_VALUE`=?, `TBM32_FIXED_VALUE`=?, `TBM32_LIST_CD`=?, `TBM32_IMAGE_CD`=?, `TBM32_TEXT`=?, `TBM32_FONT_SIZE`=?, `TBM32_FONT_UL_FLG`=?, `TBM32_FONT_COLOR_DIV`=?, `TBM32_LINE_SIZE_DIV`=?, `TBM32_LINE_COLOR_DIV`=?, `TBM32_LINE_START_POINT_DIV`=?, `TBM32_LINE_END_POINT_DIV`=?, `TBM32_LINE_ANGLE`=?, `TBM32_AUTH_LVL_MIN`=?, `TBM32_ZORDER`=?, `TBM32_TAB_ORDER`=?, `TBM32_TABSTOP_FLG`=?, `TBM32_REQUIRED_INPUT_FLG`=?, `TBM32_MIN_VALUE`=?, `TBM32_MAX_VALUE`=?, `TBM32_CRF_ITEM_NOTE`=?, `TBM32_REF_CRF_ID`=?, `TBM32_REF_CRF_ITEM_CD`=?, `TBM32_DEL_FLG`=?, `TBM32_UPD_DATETIME`=?, `TBM32_UPD_USER_ID`=?, `TBM32_UPD_PROG_NM`=?  WHERE `TBM32_STUDY_ID` = ? AND `TBM32_CRF_ID` = ? AND `TBM32_CRF_ITEM_CD` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P002F4", "INSERT INTO `TBM32_CRF_ITEM`(`TBM32_STUDY_ID`, `TBM32_CRF_ID`, `TBM32_CRF_ITEM_CD`, `TBM32_CRF_ITEM_NM`, `TBM32_CRF_ITEM_DIV`, `TBM32_CRF_ITEM_GRP_CD`, `TBM32_CRF_ITEM_GRP_ORDER`, `TBM32_LOCATION_X`, `TBM32_LOCATION_Y`, `TBM32_LOCATION_X2`, `TBM32_LOCATION_Y2`, `TBM32_TEXT_ALIGN_DIV`, `TBM32_TEXT_MAXROWS`, `TBM32_TEXT_MAXLENGTH`, `TBM32_DECIMAL_DIGITS`, `TBM32_CHK_TRUE_INNER_VALUE`, `TBM32_CHK_FALSE_INNER_VALUE`, `TBM32_FIXED_VALUE`, `TBM32_LIST_CD`, `TBM32_IMAGE_CD`, `TBM32_TEXT`, `TBM32_FONT_SIZE`, `TBM32_FONT_UL_FLG`, `TBM32_FONT_COLOR_DIV`, `TBM32_LINE_SIZE_DIV`, `TBM32_LINE_COLOR_DIV`, `TBM32_LINE_START_POINT_DIV`, `TBM32_LINE_END_POINT_DIV`, `TBM32_LINE_ANGLE`, `TBM32_AUTH_LVL_MIN`, `TBM32_ZORDER`, `TBM32_TAB_ORDER`, `TBM32_TABSTOP_FLG`, `TBM32_REQUIRED_INPUT_FLG`, `TBM32_MIN_VALUE`, `TBM32_MAX_VALUE`, `TBM32_CRF_ITEM_NOTE`, `TBM32_REF_CRF_ID`, `TBM32_REF_CRF_ITEM_CD`, `TBM32_DEL_FLG`, `TBM32_CRT_DATETIME`, `TBM32_CRT_USER_ID`, `TBM32_CRT_PROG_NM`, `TBM32_UPD_DATETIME`, `TBM32_UPD_USER_ID`, `TBM32_UPD_PROG_NM`, `TBM32_UPD_CNT`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
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
               return;
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
               return;
      }
   }

}

