/*
               File: B599_PC02_CRF_ITEM_RES
        Description: CRFçÄñ⁄É}ÉXÉ^éÊìæ
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:16:22.29
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b599_pc02_crf_item_res extends GXProcedure
{
   public b599_pc02_crf_item_res( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b599_pc02_crf_item_res.class ), "" );
   }

   public b599_pc02_crf_item_res( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( long aP0 ,
                             String aP1 ,
                             String aP2 ,
                             GxObjectCollection[] aP3 ,
                             short[] aP4 )
   {
      b599_pc02_crf_item_res.this.AV10P_STUDY_ID = aP0;
      b599_pc02_crf_item_res.this.AV8P_CRF_ID = aP1;
      b599_pc02_crf_item_res.this.AV9P_CRF_ITEM_CD = aP2;
      b599_pc02_crf_item_res.this.AV13W_RTN_CSV = aP3[0];
      this.aP3 = aP3;
      b599_pc02_crf_item_res.this.aP4 = aP4;
      b599_pc02_crf_item_res.this.aP5 = aP5;
      b599_pc02_crf_item_res.this.aP5 = new String[] {""};
      initialize();
      privateExecute();
      return aP5[0];
   }

   public void execute( long aP0 ,
                        String aP1 ,
                        String aP2 ,
                        GxObjectCollection[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( long aP0 ,
                             String aP1 ,
                             String aP2 ,
                             GxObjectCollection[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 )
   {
      b599_pc02_crf_item_res.this.AV10P_STUDY_ID = aP0;
      b599_pc02_crf_item_res.this.AV8P_CRF_ID = aP1;
      b599_pc02_crf_item_res.this.AV9P_CRF_ITEM_CD = aP2;
      b599_pc02_crf_item_res.this.AV13W_RTN_CSV = aP3[0];
      this.aP3 = aP3;
      b599_pc02_crf_item_res.this.aP4 = aP4;
      b599_pc02_crf_item_res.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16C_APP_ID = "B599" ;
      AV12W_RTN_CD = (short)(0) ;
      AV14W_RTN_MSG = "" ;
      AV17W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV17W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV16C_APP_ID );
      /* Execute user subroutine: S111 */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV11W_CRF_ID = (short)(GXutil.lval( AV8P_CRF_ID)) ;
      AV22GXLvl33 = (byte)(0) ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV8P_CRF_ID ,
                                           AV9P_CRF_ITEM_CD ,
                                           new Short(A71TBM32_CRF_ID) ,
                                           new Short(AV11W_CRF_ID) ,
                                           A72TBM32_CRF_ITEM_CD ,
                                           A75TBM32_DEL_FLG ,
                                           new Long(AV10P_STUDY_ID) ,
                                           new Long(A70TBM32_STUDY_ID) },
                                           new int[] {
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.LONG
                                           }
      });
      Gx_ope = "Fetch" ;
      Gx_etb = "TBM32_CRF_ITEM" ;
      /* Using cursor P001X2 */
      pr_default.execute(0, new Object[] {new Long(AV10P_STUDY_ID), new Short(AV11W_CRF_ID), AV9P_CRF_ITEM_CD});
      if ( Gx_err != 0 )
      {
         AV22GXLvl33 = (byte)(1) ;
      }
      while ( (pr_default.getStatus(0) != 101) )
      {
         A75TBM32_DEL_FLG = P001X2_A75TBM32_DEL_FLG[0] ;
         n75TBM32_DEL_FLG = P001X2_n75TBM32_DEL_FLG[0] ;
         A72TBM32_CRF_ITEM_CD = P001X2_A72TBM32_CRF_ITEM_CD[0] ;
         A71TBM32_CRF_ID = P001X2_A71TBM32_CRF_ID[0] ;
         A70TBM32_STUDY_ID = P001X2_A70TBM32_STUDY_ID[0] ;
         A413TBM32_UPD_CNT = P001X2_A413TBM32_UPD_CNT[0] ;
         n413TBM32_UPD_CNT = P001X2_n413TBM32_UPD_CNT[0] ;
         A412TBM32_UPD_PROG_NM = P001X2_A412TBM32_UPD_PROG_NM[0] ;
         n412TBM32_UPD_PROG_NM = P001X2_n412TBM32_UPD_PROG_NM[0] ;
         A411TBM32_UPD_USER_ID = P001X2_A411TBM32_UPD_USER_ID[0] ;
         n411TBM32_UPD_USER_ID = P001X2_n411TBM32_UPD_USER_ID[0] ;
         A410TBM32_UPD_DATETIME = P001X2_A410TBM32_UPD_DATETIME[0] ;
         n410TBM32_UPD_DATETIME = P001X2_n410TBM32_UPD_DATETIME[0] ;
         A409TBM32_CRT_PROG_NM = P001X2_A409TBM32_CRT_PROG_NM[0] ;
         n409TBM32_CRT_PROG_NM = P001X2_n409TBM32_CRT_PROG_NM[0] ;
         A408TBM32_CRT_USER_ID = P001X2_A408TBM32_CRT_USER_ID[0] ;
         n408TBM32_CRT_USER_ID = P001X2_n408TBM32_CRT_USER_ID[0] ;
         A407TBM32_CRT_DATETIME = P001X2_A407TBM32_CRT_DATETIME[0] ;
         n407TBM32_CRT_DATETIME = P001X2_n407TBM32_CRT_DATETIME[0] ;
         A775TBM32_REF_CRF_ITEM_CD = P001X2_A775TBM32_REF_CRF_ITEM_CD[0] ;
         n775TBM32_REF_CRF_ITEM_CD = P001X2_n775TBM32_REF_CRF_ITEM_CD[0] ;
         A774TBM32_REF_CRF_ID = P001X2_A774TBM32_REF_CRF_ID[0] ;
         n774TBM32_REF_CRF_ID = P001X2_n774TBM32_REF_CRF_ID[0] ;
         A406TBM32_CRF_ITEM_NOTE = P001X2_A406TBM32_CRF_ITEM_NOTE[0] ;
         n406TBM32_CRF_ITEM_NOTE = P001X2_n406TBM32_CRF_ITEM_NOTE[0] ;
         A695TBM32_MAX_VALUE = P001X2_A695TBM32_MAX_VALUE[0] ;
         n695TBM32_MAX_VALUE = P001X2_n695TBM32_MAX_VALUE[0] ;
         A694TBM32_MIN_VALUE = P001X2_A694TBM32_MIN_VALUE[0] ;
         n694TBM32_MIN_VALUE = P001X2_n694TBM32_MIN_VALUE[0] ;
         A693TBM32_REQUIRED_INPUT_FLG = P001X2_A693TBM32_REQUIRED_INPUT_FLG[0] ;
         n693TBM32_REQUIRED_INPUT_FLG = P001X2_n693TBM32_REQUIRED_INPUT_FLG[0] ;
         A692TBM32_TABSTOP_FLG = P001X2_A692TBM32_TABSTOP_FLG[0] ;
         n692TBM32_TABSTOP_FLG = P001X2_n692TBM32_TABSTOP_FLG[0] ;
         A691TBM32_TAB_ORDER = P001X2_A691TBM32_TAB_ORDER[0] ;
         n691TBM32_TAB_ORDER = P001X2_n691TBM32_TAB_ORDER[0] ;
         A645TBM32_ZORDER = P001X2_A645TBM32_ZORDER[0] ;
         n645TBM32_ZORDER = P001X2_n645TBM32_ZORDER[0] ;
         A644TBM32_AUTH_LVL_MIN = P001X2_A644TBM32_AUTH_LVL_MIN[0] ;
         n644TBM32_AUTH_LVL_MIN = P001X2_n644TBM32_AUTH_LVL_MIN[0] ;
         A690TBM32_LINE_ANGLE = P001X2_A690TBM32_LINE_ANGLE[0] ;
         n690TBM32_LINE_ANGLE = P001X2_n690TBM32_LINE_ANGLE[0] ;
         A520TBM32_LINE_END_POINT_DIV = P001X2_A520TBM32_LINE_END_POINT_DIV[0] ;
         n520TBM32_LINE_END_POINT_DIV = P001X2_n520TBM32_LINE_END_POINT_DIV[0] ;
         A519TBM32_LINE_START_POINT_DIV = P001X2_A519TBM32_LINE_START_POINT_DIV[0] ;
         n519TBM32_LINE_START_POINT_DIV = P001X2_n519TBM32_LINE_START_POINT_DIV[0] ;
         A689TBM32_LINE_COLOR_DIV = P001X2_A689TBM32_LINE_COLOR_DIV[0] ;
         n689TBM32_LINE_COLOR_DIV = P001X2_n689TBM32_LINE_COLOR_DIV[0] ;
         A521TBM32_LINE_SIZE_DIV = P001X2_A521TBM32_LINE_SIZE_DIV[0] ;
         n521TBM32_LINE_SIZE_DIV = P001X2_n521TBM32_LINE_SIZE_DIV[0] ;
         A515TBM32_FONT_COLOR_DIV = P001X2_A515TBM32_FONT_COLOR_DIV[0] ;
         n515TBM32_FONT_COLOR_DIV = P001X2_n515TBM32_FONT_COLOR_DIV[0] ;
         A514TBM32_FONT_UL_FLG = P001X2_A514TBM32_FONT_UL_FLG[0] ;
         n514TBM32_FONT_UL_FLG = P001X2_n514TBM32_FONT_UL_FLG[0] ;
         A513TBM32_FONT_SIZE = P001X2_A513TBM32_FONT_SIZE[0] ;
         n513TBM32_FONT_SIZE = P001X2_n513TBM32_FONT_SIZE[0] ;
         A524TBM32_TEXT = P001X2_A524TBM32_TEXT[0] ;
         n524TBM32_TEXT = P001X2_n524TBM32_TEXT[0] ;
         A526TBM32_IMAGE_CD = P001X2_A526TBM32_IMAGE_CD[0] ;
         n526TBM32_IMAGE_CD = P001X2_n526TBM32_IMAGE_CD[0] ;
         A525TBM32_LIST_CD = P001X2_A525TBM32_LIST_CD[0] ;
         n525TBM32_LIST_CD = P001X2_n525TBM32_LIST_CD[0] ;
         A527TBM32_FIXED_VALUE = P001X2_A527TBM32_FIXED_VALUE[0] ;
         n527TBM32_FIXED_VALUE = P001X2_n527TBM32_FIXED_VALUE[0] ;
         A523TBM32_CHK_FALSE_INNER_VALUE = P001X2_A523TBM32_CHK_FALSE_INNER_VALUE[0] ;
         n523TBM32_CHK_FALSE_INNER_VALUE = P001X2_n523TBM32_CHK_FALSE_INNER_VALUE[0] ;
         A522TBM32_CHK_TRUE_INNER_VALUE = P001X2_A522TBM32_CHK_TRUE_INNER_VALUE[0] ;
         n522TBM32_CHK_TRUE_INNER_VALUE = P001X2_n522TBM32_CHK_TRUE_INNER_VALUE[0] ;
         A518TBM32_DECIMAL_DIGITS = P001X2_A518TBM32_DECIMAL_DIGITS[0] ;
         n518TBM32_DECIMAL_DIGITS = P001X2_n518TBM32_DECIMAL_DIGITS[0] ;
         A517TBM32_TEXT_MAXLENGTH = P001X2_A517TBM32_TEXT_MAXLENGTH[0] ;
         n517TBM32_TEXT_MAXLENGTH = P001X2_n517TBM32_TEXT_MAXLENGTH[0] ;
         A516TBM32_TEXT_MAXROWS = P001X2_A516TBM32_TEXT_MAXROWS[0] ;
         n516TBM32_TEXT_MAXROWS = P001X2_n516TBM32_TEXT_MAXROWS[0] ;
         A512TBM32_TEXT_ALIGN_DIV = P001X2_A512TBM32_TEXT_ALIGN_DIV[0] ;
         n512TBM32_TEXT_ALIGN_DIV = P001X2_n512TBM32_TEXT_ALIGN_DIV[0] ;
         A511TBM32_LOCATION_Y2 = P001X2_A511TBM32_LOCATION_Y2[0] ;
         n511TBM32_LOCATION_Y2 = P001X2_n511TBM32_LOCATION_Y2[0] ;
         A510TBM32_LOCATION_X2 = P001X2_A510TBM32_LOCATION_X2[0] ;
         n510TBM32_LOCATION_X2 = P001X2_n510TBM32_LOCATION_X2[0] ;
         A509TBM32_LOCATION_Y = P001X2_A509TBM32_LOCATION_Y[0] ;
         n509TBM32_LOCATION_Y = P001X2_n509TBM32_LOCATION_Y[0] ;
         A508TBM32_LOCATION_X = P001X2_A508TBM32_LOCATION_X[0] ;
         n508TBM32_LOCATION_X = P001X2_n508TBM32_LOCATION_X[0] ;
         A507TBM32_CRF_ITEM_GRP_ORDER = P001X2_A507TBM32_CRF_ITEM_GRP_ORDER[0] ;
         n507TBM32_CRF_ITEM_GRP_ORDER = P001X2_n507TBM32_CRF_ITEM_GRP_ORDER[0] ;
         A73TBM32_CRF_ITEM_GRP_CD = P001X2_A73TBM32_CRF_ITEM_GRP_CD[0] ;
         n73TBM32_CRF_ITEM_GRP_CD = P001X2_n73TBM32_CRF_ITEM_GRP_CD[0] ;
         A74TBM32_CRF_ITEM_DIV = P001X2_A74TBM32_CRF_ITEM_DIV[0] ;
         n74TBM32_CRF_ITEM_DIV = P001X2_n74TBM32_CRF_ITEM_DIV[0] ;
         A405TBM32_CRF_ITEM_NM = P001X2_A405TBM32_CRF_ITEM_NM[0] ;
         n405TBM32_CRF_ITEM_NM = P001X2_n405TBM32_CRF_ITEM_NM[0] ;
         AV22GXLvl33 = (byte)(1) ;
         GXt_char1 = AV15W_STR ;
         GXv_char2[0] = GXt_char1 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A72TBM32_CRF_ITEM_CD, GXv_char2) ;
         b599_pc02_crf_item_res.this.GXt_char1 = GXv_char2[0] ;
         GXt_char3 = AV15W_STR ;
         GXv_char4[0] = GXt_char3 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A405TBM32_CRF_ITEM_NM, GXv_char4) ;
         b599_pc02_crf_item_res.this.GXt_char3 = GXv_char4[0] ;
         GXt_char5 = AV15W_STR ;
         GXv_char6[0] = GXt_char5 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A74TBM32_CRF_ITEM_DIV, GXv_char6) ;
         b599_pc02_crf_item_res.this.GXt_char5 = GXv_char6[0] ;
         GXt_char7 = AV15W_STR ;
         GXv_char8[0] = GXt_char7 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A73TBM32_CRF_ITEM_GRP_CD, GXv_char8) ;
         b599_pc02_crf_item_res.this.GXt_char7 = GXv_char8[0] ;
         GXt_char9 = AV15W_STR ;
         GXv_char10[0] = GXt_char9 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A512TBM32_TEXT_ALIGN_DIV, GXv_char10) ;
         b599_pc02_crf_item_res.this.GXt_char9 = GXv_char10[0] ;
         GXt_char11 = AV15W_STR ;
         GXv_char12[0] = GXt_char11 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A522TBM32_CHK_TRUE_INNER_VALUE, GXv_char12) ;
         b599_pc02_crf_item_res.this.GXt_char11 = GXv_char12[0] ;
         GXt_char13 = AV15W_STR ;
         GXv_char14[0] = GXt_char13 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A523TBM32_CHK_FALSE_INNER_VALUE, GXv_char14) ;
         b599_pc02_crf_item_res.this.GXt_char13 = GXv_char14[0] ;
         GXt_char15 = AV15W_STR ;
         GXv_char16[0] = GXt_char15 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A527TBM32_FIXED_VALUE, GXv_char16) ;
         b599_pc02_crf_item_res.this.GXt_char15 = GXv_char16[0] ;
         GXt_char17 = AV15W_STR ;
         GXv_char18[0] = GXt_char17 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A525TBM32_LIST_CD, GXv_char18) ;
         b599_pc02_crf_item_res.this.GXt_char17 = GXv_char18[0] ;
         GXt_char19 = AV15W_STR ;
         GXv_char20[0] = GXt_char19 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A526TBM32_IMAGE_CD, GXv_char20) ;
         b599_pc02_crf_item_res.this.GXt_char19 = GXv_char20[0] ;
         GXt_char21 = AV15W_STR ;
         GXv_char22[0] = GXt_char21 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A524TBM32_TEXT, GXv_char22) ;
         b599_pc02_crf_item_res.this.GXt_char21 = GXv_char22[0] ;
         GXt_char23 = AV15W_STR ;
         GXv_char24[0] = GXt_char23 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A514TBM32_FONT_UL_FLG, GXv_char24) ;
         b599_pc02_crf_item_res.this.GXt_char23 = GXv_char24[0] ;
         GXt_char25 = AV15W_STR ;
         GXv_char26[0] = GXt_char25 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A519TBM32_LINE_START_POINT_DIV, GXv_char26) ;
         b599_pc02_crf_item_res.this.GXt_char25 = GXv_char26[0] ;
         GXt_char27 = AV15W_STR ;
         GXv_char28[0] = GXt_char27 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A520TBM32_LINE_END_POINT_DIV, GXv_char28) ;
         b599_pc02_crf_item_res.this.GXt_char27 = GXv_char28[0] ;
         GXt_char29 = AV15W_STR ;
         GXv_char30[0] = GXt_char29 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A692TBM32_TABSTOP_FLG, GXv_char30) ;
         b599_pc02_crf_item_res.this.GXt_char29 = GXv_char30[0] ;
         GXt_char31 = AV15W_STR ;
         GXv_char32[0] = GXt_char31 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A693TBM32_REQUIRED_INPUT_FLG, GXv_char32) ;
         b599_pc02_crf_item_res.this.GXt_char31 = GXv_char32[0] ;
         GXt_char33 = AV15W_STR ;
         GXv_char34[0] = GXt_char33 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A694TBM32_MIN_VALUE, GXv_char34) ;
         b599_pc02_crf_item_res.this.GXt_char33 = GXv_char34[0] ;
         GXt_char35 = AV15W_STR ;
         GXv_char36[0] = GXt_char35 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A695TBM32_MAX_VALUE, GXv_char36) ;
         b599_pc02_crf_item_res.this.GXt_char35 = GXv_char36[0] ;
         GXt_char37 = AV15W_STR ;
         GXv_char38[0] = GXt_char37 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A406TBM32_CRF_ITEM_NOTE, GXv_char38) ;
         b599_pc02_crf_item_res.this.GXt_char37 = GXv_char38[0] ;
         GXt_char39 = AV15W_STR ;
         GXv_char40[0] = GXt_char39 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A775TBM32_REF_CRF_ITEM_CD, GXv_char40) ;
         b599_pc02_crf_item_res.this.GXt_char39 = GXv_char40[0] ;
         GXt_char41 = AV15W_STR ;
         GXv_char42[0] = GXt_char41 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A75TBM32_DEL_FLG, GXv_char42) ;
         b599_pc02_crf_item_res.this.GXt_char41 = GXv_char42[0] ;
         GXt_char43 = AV15W_STR ;
         GXv_char44[0] = GXt_char43 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A407TBM32_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char44) ;
         b599_pc02_crf_item_res.this.GXt_char43 = GXv_char44[0] ;
         GXt_char45 = AV15W_STR ;
         GXv_char46[0] = GXt_char45 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A408TBM32_CRT_USER_ID, GXv_char46) ;
         b599_pc02_crf_item_res.this.GXt_char45 = GXv_char46[0] ;
         GXt_char47 = AV15W_STR ;
         GXv_char48[0] = GXt_char47 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A409TBM32_CRT_PROG_NM, GXv_char48) ;
         b599_pc02_crf_item_res.this.GXt_char47 = GXv_char48[0] ;
         GXt_char49 = AV15W_STR ;
         GXv_char50[0] = GXt_char49 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A410TBM32_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char50) ;
         b599_pc02_crf_item_res.this.GXt_char49 = GXv_char50[0] ;
         GXt_char51 = AV15W_STR ;
         GXv_char52[0] = GXt_char51 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A411TBM32_UPD_USER_ID, GXv_char52) ;
         b599_pc02_crf_item_res.this.GXt_char51 = GXv_char52[0] ;
         GXt_char53 = AV15W_STR ;
         GXv_char54[0] = GXt_char53 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A412TBM32_UPD_PROG_NM, GXv_char54) ;
         b599_pc02_crf_item_res.this.GXt_char53 = GXv_char54[0] ;
         AV15W_STR = GXutil.trim( GXutil.str( A70TBM32_STUDY_ID, 10, 0)) + "," + GXutil.trim( GXutil.str( A71TBM32_CRF_ID, 10, 0)) + "," + GXt_char1 + "," + GXt_char3 + "," + GXt_char5 + "," + GXt_char7 + "," + GXutil.trim( GXutil.str( A507TBM32_CRF_ITEM_GRP_ORDER, 10, 0)) + "," + GXutil.trim( GXutil.str( A508TBM32_LOCATION_X, 10, 0)) + "," + GXutil.trim( GXutil.str( A509TBM32_LOCATION_Y, 10, 0)) + "," + GXutil.trim( GXutil.str( A510TBM32_LOCATION_X2, 10, 0)) + "," + GXutil.trim( GXutil.str( A511TBM32_LOCATION_Y2, 10, 0)) + "," + GXt_char9 + "," + GXutil.trim( GXutil.str( A516TBM32_TEXT_MAXROWS, 10, 0)) + "," + GXutil.trim( GXutil.str( A517TBM32_TEXT_MAXLENGTH, 10, 0)) + "," + GXutil.trim( GXutil.str( A518TBM32_DECIMAL_DIGITS, 10, 0)) + "," + GXt_char11 + "," + GXt_char13 + "," + GXt_char15 + "," + GXt_char17 + "," + GXt_char19 + "," + GXt_char21 + "," + GXutil.trim( GXutil.str( A513TBM32_FONT_SIZE, 10, 0)) + "," + GXt_char23 + "," + GXutil.trim( GXutil.str( A515TBM32_FONT_COLOR_DIV, 10, 0)) + "," + GXutil.trim( GXutil.str( A521TBM32_LINE_SIZE_DIV, 10, 0)) + "," + GXutil.trim( GXutil.str( A689TBM32_LINE_COLOR_DIV, 10, 0)) + "," + GXt_char25 + "," + GXt_char27 + "," + GXutil.trim( GXutil.str( A690TBM32_LINE_ANGLE, 10, 0)) + "," + GXutil.trim( GXutil.str( A644TBM32_AUTH_LVL_MIN, 10, 0)) + "," + GXutil.trim( GXutil.str( A645TBM32_ZORDER, 10, 0)) + "," + GXutil.trim( GXutil.str( A691TBM32_TAB_ORDER, 10, 0)) + "," + GXt_char29 + "," + GXt_char31 + "," + GXt_char33 + "," + GXt_char35 + "," + GXt_char37 + "," + GXutil.trim( GXutil.str( A774TBM32_REF_CRF_ID, 10, 0)) + "," + GXt_char39 + "," + GXt_char41 + "," + GXt_char43 + "," + GXt_char45 + "," + GXt_char47 + "," + GXt_char49 + "," + GXt_char51 + "," + GXt_char53 + "," + GXutil.trim( GXutil.str( A413TBM32_UPD_CNT, 10, 0)) ;
         AV13W_RTN_CSV.add(AV15W_STR, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV22GXLvl33 == 0 )
      {
         AV12W_RTN_CD = (short)(1) ;
         GXt_char53 = AV14W_RTN_MSG ;
         GXv_char54[0] = GXt_char53 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char54) ;
         b599_pc02_crf_item_res.this.GXt_char53 = GXv_char54[0] ;
         AV14W_RTN_MSG = GXt_char53 ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      AV17W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      AV18W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV18W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_STUDY_ID" );
      AV18W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( GXutil.trim( GXutil.str( AV10P_STUDY_ID, 10, 0)) );
      AV17W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV18W_PARMS_ITEM, 0);
      AV18W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV18W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_CRF_ID" );
      AV18W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV8P_CRF_ID );
      AV17W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV18W_PARMS_ITEM, 0);
      AV18W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV18W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_CRF_ITEM_CD" );
      AV18W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV9P_CRF_ITEM_CD );
      AV17W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV18W_PARMS_ITEM, 0);
      AV19W_MSG = "SUB_INIT" ;
      GXv_SdtB808_SD01_EXTRA_INFO55[0] = AV17W_EXTRA_INFO;
      GXv_int56[0] = AV12W_RTN_CD ;
      GXv_char54[0] = AV14W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV23Pgmname, (short)(1), AV19W_MSG, GXv_SdtB808_SD01_EXTRA_INFO55, GXv_int56, GXv_char54) ;
      AV17W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO55[0] ;
      b599_pc02_crf_item_res.this.AV12W_RTN_CD = GXv_int56[0] ;
      b599_pc02_crf_item_res.this.AV14W_RTN_MSG = GXv_char54[0] ;
   }

   public void S121( )
   {
      /* 'SUB_ERROR' Routine */
      AV19W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO55[0] = AV17W_EXTRA_INFO;
      GXv_int56[0] = AV12W_RTN_CD ;
      GXv_char54[0] = AV14W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV23Pgmname, (short)(0), AV19W_MSG, GXv_SdtB808_SD01_EXTRA_INFO55, GXv_int56, GXv_char54) ;
      AV17W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO55[0] ;
      b599_pc02_crf_item_res.this.AV12W_RTN_CD = GXv_int56[0] ;
      b599_pc02_crf_item_res.this.AV14W_RTN_MSG = GXv_char54[0] ;
      context.globals.Gx_eop = (byte)(0) ;
   }

   protected void cleanup( )
   {
      this.aP3[0] = b599_pc02_crf_item_res.this.AV13W_RTN_CSV;
      this.aP4[0] = b599_pc02_crf_item_res.this.AV12W_RTN_CD;
      this.aP5[0] = b599_pc02_crf_item_res.this.AV14W_RTN_MSG;
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
      AV16C_APP_ID = "" ;
      AV17W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      scmdbuf = "" ;
      A72TBM32_CRF_ITEM_CD = "" ;
      A75TBM32_DEL_FLG = "" ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      P001X2_A75TBM32_DEL_FLG = new String[] {""} ;
      P001X2_n75TBM32_DEL_FLG = new boolean[] {false} ;
      P001X2_A72TBM32_CRF_ITEM_CD = new String[] {""} ;
      P001X2_A71TBM32_CRF_ID = new short[1] ;
      P001X2_A70TBM32_STUDY_ID = new long[1] ;
      P001X2_A413TBM32_UPD_CNT = new long[1] ;
      P001X2_n413TBM32_UPD_CNT = new boolean[] {false} ;
      P001X2_A412TBM32_UPD_PROG_NM = new String[] {""} ;
      P001X2_n412TBM32_UPD_PROG_NM = new boolean[] {false} ;
      P001X2_A411TBM32_UPD_USER_ID = new String[] {""} ;
      P001X2_n411TBM32_UPD_USER_ID = new boolean[] {false} ;
      P001X2_A410TBM32_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P001X2_n410TBM32_UPD_DATETIME = new boolean[] {false} ;
      P001X2_A409TBM32_CRT_PROG_NM = new String[] {""} ;
      P001X2_n409TBM32_CRT_PROG_NM = new boolean[] {false} ;
      P001X2_A408TBM32_CRT_USER_ID = new String[] {""} ;
      P001X2_n408TBM32_CRT_USER_ID = new boolean[] {false} ;
      P001X2_A407TBM32_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P001X2_n407TBM32_CRT_DATETIME = new boolean[] {false} ;
      P001X2_A775TBM32_REF_CRF_ITEM_CD = new String[] {""} ;
      P001X2_n775TBM32_REF_CRF_ITEM_CD = new boolean[] {false} ;
      P001X2_A774TBM32_REF_CRF_ID = new short[1] ;
      P001X2_n774TBM32_REF_CRF_ID = new boolean[] {false} ;
      P001X2_A406TBM32_CRF_ITEM_NOTE = new String[] {""} ;
      P001X2_n406TBM32_CRF_ITEM_NOTE = new boolean[] {false} ;
      P001X2_A695TBM32_MAX_VALUE = new String[] {""} ;
      P001X2_n695TBM32_MAX_VALUE = new boolean[] {false} ;
      P001X2_A694TBM32_MIN_VALUE = new String[] {""} ;
      P001X2_n694TBM32_MIN_VALUE = new boolean[] {false} ;
      P001X2_A693TBM32_REQUIRED_INPUT_FLG = new String[] {""} ;
      P001X2_n693TBM32_REQUIRED_INPUT_FLG = new boolean[] {false} ;
      P001X2_A692TBM32_TABSTOP_FLG = new String[] {""} ;
      P001X2_n692TBM32_TABSTOP_FLG = new boolean[] {false} ;
      P001X2_A691TBM32_TAB_ORDER = new short[1] ;
      P001X2_n691TBM32_TAB_ORDER = new boolean[] {false} ;
      P001X2_A645TBM32_ZORDER = new short[1] ;
      P001X2_n645TBM32_ZORDER = new boolean[] {false} ;
      P001X2_A644TBM32_AUTH_LVL_MIN = new byte[1] ;
      P001X2_n644TBM32_AUTH_LVL_MIN = new boolean[] {false} ;
      P001X2_A690TBM32_LINE_ANGLE = new short[1] ;
      P001X2_n690TBM32_LINE_ANGLE = new boolean[] {false} ;
      P001X2_A520TBM32_LINE_END_POINT_DIV = new String[] {""} ;
      P001X2_n520TBM32_LINE_END_POINT_DIV = new boolean[] {false} ;
      P001X2_A519TBM32_LINE_START_POINT_DIV = new String[] {""} ;
      P001X2_n519TBM32_LINE_START_POINT_DIV = new boolean[] {false} ;
      P001X2_A689TBM32_LINE_COLOR_DIV = new long[1] ;
      P001X2_n689TBM32_LINE_COLOR_DIV = new boolean[] {false} ;
      P001X2_A521TBM32_LINE_SIZE_DIV = new byte[1] ;
      P001X2_n521TBM32_LINE_SIZE_DIV = new boolean[] {false} ;
      P001X2_A515TBM32_FONT_COLOR_DIV = new long[1] ;
      P001X2_n515TBM32_FONT_COLOR_DIV = new boolean[] {false} ;
      P001X2_A514TBM32_FONT_UL_FLG = new String[] {""} ;
      P001X2_n514TBM32_FONT_UL_FLG = new boolean[] {false} ;
      P001X2_A513TBM32_FONT_SIZE = new byte[1] ;
      P001X2_n513TBM32_FONT_SIZE = new boolean[] {false} ;
      P001X2_A524TBM32_TEXT = new String[] {""} ;
      P001X2_n524TBM32_TEXT = new boolean[] {false} ;
      P001X2_A526TBM32_IMAGE_CD = new String[] {""} ;
      P001X2_n526TBM32_IMAGE_CD = new boolean[] {false} ;
      P001X2_A525TBM32_LIST_CD = new String[] {""} ;
      P001X2_n525TBM32_LIST_CD = new boolean[] {false} ;
      P001X2_A527TBM32_FIXED_VALUE = new String[] {""} ;
      P001X2_n527TBM32_FIXED_VALUE = new boolean[] {false} ;
      P001X2_A523TBM32_CHK_FALSE_INNER_VALUE = new String[] {""} ;
      P001X2_n523TBM32_CHK_FALSE_INNER_VALUE = new boolean[] {false} ;
      P001X2_A522TBM32_CHK_TRUE_INNER_VALUE = new String[] {""} ;
      P001X2_n522TBM32_CHK_TRUE_INNER_VALUE = new boolean[] {false} ;
      P001X2_A518TBM32_DECIMAL_DIGITS = new byte[1] ;
      P001X2_n518TBM32_DECIMAL_DIGITS = new boolean[] {false} ;
      P001X2_A517TBM32_TEXT_MAXLENGTH = new short[1] ;
      P001X2_n517TBM32_TEXT_MAXLENGTH = new boolean[] {false} ;
      P001X2_A516TBM32_TEXT_MAXROWS = new byte[1] ;
      P001X2_n516TBM32_TEXT_MAXROWS = new boolean[] {false} ;
      P001X2_A512TBM32_TEXT_ALIGN_DIV = new String[] {""} ;
      P001X2_n512TBM32_TEXT_ALIGN_DIV = new boolean[] {false} ;
      P001X2_A511TBM32_LOCATION_Y2 = new short[1] ;
      P001X2_n511TBM32_LOCATION_Y2 = new boolean[] {false} ;
      P001X2_A510TBM32_LOCATION_X2 = new short[1] ;
      P001X2_n510TBM32_LOCATION_X2 = new boolean[] {false} ;
      P001X2_A509TBM32_LOCATION_Y = new short[1] ;
      P001X2_n509TBM32_LOCATION_Y = new boolean[] {false} ;
      P001X2_A508TBM32_LOCATION_X = new short[1] ;
      P001X2_n508TBM32_LOCATION_X = new boolean[] {false} ;
      P001X2_A507TBM32_CRF_ITEM_GRP_ORDER = new short[1] ;
      P001X2_n507TBM32_CRF_ITEM_GRP_ORDER = new boolean[] {false} ;
      P001X2_A73TBM32_CRF_ITEM_GRP_CD = new String[] {""} ;
      P001X2_n73TBM32_CRF_ITEM_GRP_CD = new boolean[] {false} ;
      P001X2_A74TBM32_CRF_ITEM_DIV = new String[] {""} ;
      P001X2_n74TBM32_CRF_ITEM_DIV = new boolean[] {false} ;
      P001X2_A405TBM32_CRF_ITEM_NM = new String[] {""} ;
      P001X2_n405TBM32_CRF_ITEM_NM = new boolean[] {false} ;
      A412TBM32_UPD_PROG_NM = "" ;
      A411TBM32_UPD_USER_ID = "" ;
      A410TBM32_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A409TBM32_CRT_PROG_NM = "" ;
      A408TBM32_CRT_USER_ID = "" ;
      A407TBM32_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A775TBM32_REF_CRF_ITEM_CD = "" ;
      A406TBM32_CRF_ITEM_NOTE = "" ;
      A695TBM32_MAX_VALUE = "" ;
      A694TBM32_MIN_VALUE = "" ;
      A693TBM32_REQUIRED_INPUT_FLG = "" ;
      A692TBM32_TABSTOP_FLG = "" ;
      A520TBM32_LINE_END_POINT_DIV = "" ;
      A519TBM32_LINE_START_POINT_DIV = "" ;
      A514TBM32_FONT_UL_FLG = "" ;
      A524TBM32_TEXT = "" ;
      A526TBM32_IMAGE_CD = "" ;
      A525TBM32_LIST_CD = "" ;
      A527TBM32_FIXED_VALUE = "" ;
      A523TBM32_CHK_FALSE_INNER_VALUE = "" ;
      A522TBM32_CHK_TRUE_INNER_VALUE = "" ;
      A512TBM32_TEXT_ALIGN_DIV = "" ;
      A73TBM32_CRF_ITEM_GRP_CD = "" ;
      A74TBM32_CRF_ITEM_DIV = "" ;
      A405TBM32_CRF_ITEM_NM = "" ;
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
      GXv_char18 = new String [1] ;
      GXt_char19 = "" ;
      GXv_char20 = new String [1] ;
      GXt_char21 = "" ;
      GXv_char22 = new String [1] ;
      GXt_char23 = "" ;
      GXv_char24 = new String [1] ;
      GXt_char25 = "" ;
      GXv_char26 = new String [1] ;
      GXt_char27 = "" ;
      GXv_char28 = new String [1] ;
      GXt_char29 = "" ;
      GXv_char30 = new String [1] ;
      GXt_char31 = "" ;
      GXv_char32 = new String [1] ;
      GXt_char33 = "" ;
      GXv_char34 = new String [1] ;
      GXt_char35 = "" ;
      GXv_char36 = new String [1] ;
      GXt_char37 = "" ;
      GXv_char38 = new String [1] ;
      GXt_char39 = "" ;
      GXv_char40 = new String [1] ;
      GXt_char41 = "" ;
      GXv_char42 = new String [1] ;
      GXt_char43 = "" ;
      GXv_char44 = new String [1] ;
      GXt_char45 = "" ;
      GXv_char46 = new String [1] ;
      GXt_char47 = "" ;
      GXv_char48 = new String [1] ;
      GXt_char49 = "" ;
      GXv_char50 = new String [1] ;
      GXt_char51 = "" ;
      GXv_char52 = new String [1] ;
      GXt_char53 = "" ;
      AV18W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV19W_MSG = "" ;
      AV23Pgmname = "" ;
      GXv_SdtB808_SD01_EXTRA_INFO55 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int56 = new short [1] ;
      GXv_char54 = new String [1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b599_pc02_crf_item_res__default(),
         new Object[] {
             new Object[] {
            P001X2_A75TBM32_DEL_FLG, P001X2_n75TBM32_DEL_FLG, P001X2_A72TBM32_CRF_ITEM_CD, P001X2_A71TBM32_CRF_ID, P001X2_A70TBM32_STUDY_ID, P001X2_A413TBM32_UPD_CNT, P001X2_n413TBM32_UPD_CNT, P001X2_A412TBM32_UPD_PROG_NM, P001X2_n412TBM32_UPD_PROG_NM, P001X2_A411TBM32_UPD_USER_ID,
            P001X2_n411TBM32_UPD_USER_ID, P001X2_A410TBM32_UPD_DATETIME, P001X2_n410TBM32_UPD_DATETIME, P001X2_A409TBM32_CRT_PROG_NM, P001X2_n409TBM32_CRT_PROG_NM, P001X2_A408TBM32_CRT_USER_ID, P001X2_n408TBM32_CRT_USER_ID, P001X2_A407TBM32_CRT_DATETIME, P001X2_n407TBM32_CRT_DATETIME, P001X2_A775TBM32_REF_CRF_ITEM_CD,
            P001X2_n775TBM32_REF_CRF_ITEM_CD, P001X2_A774TBM32_REF_CRF_ID, P001X2_n774TBM32_REF_CRF_ID, P001X2_A406TBM32_CRF_ITEM_NOTE, P001X2_n406TBM32_CRF_ITEM_NOTE, P001X2_A695TBM32_MAX_VALUE, P001X2_n695TBM32_MAX_VALUE, P001X2_A694TBM32_MIN_VALUE, P001X2_n694TBM32_MIN_VALUE, P001X2_A693TBM32_REQUIRED_INPUT_FLG,
            P001X2_n693TBM32_REQUIRED_INPUT_FLG, P001X2_A692TBM32_TABSTOP_FLG, P001X2_n692TBM32_TABSTOP_FLG, P001X2_A691TBM32_TAB_ORDER, P001X2_n691TBM32_TAB_ORDER, P001X2_A645TBM32_ZORDER, P001X2_n645TBM32_ZORDER, P001X2_A644TBM32_AUTH_LVL_MIN, P001X2_n644TBM32_AUTH_LVL_MIN, P001X2_A690TBM32_LINE_ANGLE,
            P001X2_n690TBM32_LINE_ANGLE, P001X2_A520TBM32_LINE_END_POINT_DIV, P001X2_n520TBM32_LINE_END_POINT_DIV, P001X2_A519TBM32_LINE_START_POINT_DIV, P001X2_n519TBM32_LINE_START_POINT_DIV, P001X2_A689TBM32_LINE_COLOR_DIV, P001X2_n689TBM32_LINE_COLOR_DIV, P001X2_A521TBM32_LINE_SIZE_DIV, P001X2_n521TBM32_LINE_SIZE_DIV, P001X2_A515TBM32_FONT_COLOR_DIV,
            P001X2_n515TBM32_FONT_COLOR_DIV, P001X2_A514TBM32_FONT_UL_FLG, P001X2_n514TBM32_FONT_UL_FLG, P001X2_A513TBM32_FONT_SIZE, P001X2_n513TBM32_FONT_SIZE, P001X2_A524TBM32_TEXT, P001X2_n524TBM32_TEXT, P001X2_A526TBM32_IMAGE_CD, P001X2_n526TBM32_IMAGE_CD, P001X2_A525TBM32_LIST_CD,
            P001X2_n525TBM32_LIST_CD, P001X2_A527TBM32_FIXED_VALUE, P001X2_n527TBM32_FIXED_VALUE, P001X2_A523TBM32_CHK_FALSE_INNER_VALUE, P001X2_n523TBM32_CHK_FALSE_INNER_VALUE, P001X2_A522TBM32_CHK_TRUE_INNER_VALUE, P001X2_n522TBM32_CHK_TRUE_INNER_VALUE, P001X2_A518TBM32_DECIMAL_DIGITS, P001X2_n518TBM32_DECIMAL_DIGITS, P001X2_A517TBM32_TEXT_MAXLENGTH,
            P001X2_n517TBM32_TEXT_MAXLENGTH, P001X2_A516TBM32_TEXT_MAXROWS, P001X2_n516TBM32_TEXT_MAXROWS, P001X2_A512TBM32_TEXT_ALIGN_DIV, P001X2_n512TBM32_TEXT_ALIGN_DIV, P001X2_A511TBM32_LOCATION_Y2, P001X2_n511TBM32_LOCATION_Y2, P001X2_A510TBM32_LOCATION_X2, P001X2_n510TBM32_LOCATION_X2, P001X2_A509TBM32_LOCATION_Y,
            P001X2_n509TBM32_LOCATION_Y, P001X2_A508TBM32_LOCATION_X, P001X2_n508TBM32_LOCATION_X, P001X2_A507TBM32_CRF_ITEM_GRP_ORDER, P001X2_n507TBM32_CRF_ITEM_GRP_ORDER, P001X2_A73TBM32_CRF_ITEM_GRP_CD, P001X2_n73TBM32_CRF_ITEM_GRP_CD, P001X2_A74TBM32_CRF_ITEM_DIV, P001X2_n74TBM32_CRF_ITEM_DIV, P001X2_A405TBM32_CRF_ITEM_NM,
            P001X2_n405TBM32_CRF_ITEM_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV23Pgmname = "B599_PC02_CRF_ITEM_RES" ;
      /* GeneXus formulas. */
      AV23Pgmname = "B599_PC02_CRF_ITEM_RES" ;
      Gx_err = (short)(0) ;
   }

   private byte AV22GXLvl33 ;
   private byte A644TBM32_AUTH_LVL_MIN ;
   private byte A521TBM32_LINE_SIZE_DIV ;
   private byte A513TBM32_FONT_SIZE ;
   private byte A518TBM32_DECIMAL_DIGITS ;
   private byte A516TBM32_TEXT_MAXROWS ;
   private short AV12W_RTN_CD ;
   private short AV11W_CRF_ID ;
   private short A71TBM32_CRF_ID ;
   private short Gx_err ;
   private short A774TBM32_REF_CRF_ID ;
   private short A691TBM32_TAB_ORDER ;
   private short A645TBM32_ZORDER ;
   private short A690TBM32_LINE_ANGLE ;
   private short A517TBM32_TEXT_MAXLENGTH ;
   private short A511TBM32_LOCATION_Y2 ;
   private short A510TBM32_LOCATION_X2 ;
   private short A509TBM32_LOCATION_Y ;
   private short A508TBM32_LOCATION_X ;
   private short A507TBM32_CRF_ITEM_GRP_ORDER ;
   private short GXv_int56[] ;
   private int GXActiveErrHndl ;
   private long AV10P_STUDY_ID ;
   private long A70TBM32_STUDY_ID ;
   private long A413TBM32_UPD_CNT ;
   private long A689TBM32_LINE_COLOR_DIV ;
   private long A515TBM32_FONT_COLOR_DIV ;
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
   private String GXv_char20[] ;
   private String GXt_char21 ;
   private String GXv_char22[] ;
   private String GXt_char23 ;
   private String GXv_char24[] ;
   private String GXt_char25 ;
   private String GXv_char26[] ;
   private String GXt_char27 ;
   private String GXv_char28[] ;
   private String GXt_char29 ;
   private String GXv_char30[] ;
   private String GXt_char31 ;
   private String GXv_char32[] ;
   private String GXt_char33 ;
   private String GXv_char34[] ;
   private String GXt_char35 ;
   private String GXv_char36[] ;
   private String GXt_char37 ;
   private String GXv_char38[] ;
   private String GXt_char39 ;
   private String GXv_char40[] ;
   private String GXt_char41 ;
   private String GXv_char42[] ;
   private String GXt_char43 ;
   private String GXv_char44[] ;
   private String GXt_char45 ;
   private String GXv_char46[] ;
   private String GXt_char47 ;
   private String GXv_char48[] ;
   private String GXt_char49 ;
   private String GXv_char50[] ;
   private String GXt_char51 ;
   private String GXv_char52[] ;
   private String GXt_char53 ;
   private String AV23Pgmname ;
   private String GXv_char54[] ;
   private String Gx_emsg ;
   private java.util.Date A410TBM32_UPD_DATETIME ;
   private java.util.Date A407TBM32_CRT_DATETIME ;
   private boolean returnInSub ;
   private boolean n75TBM32_DEL_FLG ;
   private boolean n413TBM32_UPD_CNT ;
   private boolean n412TBM32_UPD_PROG_NM ;
   private boolean n411TBM32_UPD_USER_ID ;
   private boolean n410TBM32_UPD_DATETIME ;
   private boolean n409TBM32_CRT_PROG_NM ;
   private boolean n408TBM32_CRT_USER_ID ;
   private boolean n407TBM32_CRT_DATETIME ;
   private boolean n775TBM32_REF_CRF_ITEM_CD ;
   private boolean n774TBM32_REF_CRF_ID ;
   private boolean n406TBM32_CRF_ITEM_NOTE ;
   private boolean n695TBM32_MAX_VALUE ;
   private boolean n694TBM32_MIN_VALUE ;
   private boolean n693TBM32_REQUIRED_INPUT_FLG ;
   private boolean n692TBM32_TABSTOP_FLG ;
   private boolean n691TBM32_TAB_ORDER ;
   private boolean n645TBM32_ZORDER ;
   private boolean n644TBM32_AUTH_LVL_MIN ;
   private boolean n690TBM32_LINE_ANGLE ;
   private boolean n520TBM32_LINE_END_POINT_DIV ;
   private boolean n519TBM32_LINE_START_POINT_DIV ;
   private boolean n689TBM32_LINE_COLOR_DIV ;
   private boolean n521TBM32_LINE_SIZE_DIV ;
   private boolean n515TBM32_FONT_COLOR_DIV ;
   private boolean n514TBM32_FONT_UL_FLG ;
   private boolean n513TBM32_FONT_SIZE ;
   private boolean n524TBM32_TEXT ;
   private boolean n526TBM32_IMAGE_CD ;
   private boolean n525TBM32_LIST_CD ;
   private boolean n527TBM32_FIXED_VALUE ;
   private boolean n523TBM32_CHK_FALSE_INNER_VALUE ;
   private boolean n522TBM32_CHK_TRUE_INNER_VALUE ;
   private boolean n518TBM32_DECIMAL_DIGITS ;
   private boolean n517TBM32_TEXT_MAXLENGTH ;
   private boolean n516TBM32_TEXT_MAXROWS ;
   private boolean n512TBM32_TEXT_ALIGN_DIV ;
   private boolean n511TBM32_LOCATION_Y2 ;
   private boolean n510TBM32_LOCATION_X2 ;
   private boolean n509TBM32_LOCATION_Y ;
   private boolean n508TBM32_LOCATION_X ;
   private boolean n507TBM32_CRF_ITEM_GRP_ORDER ;
   private boolean n73TBM32_CRF_ITEM_GRP_CD ;
   private boolean n74TBM32_CRF_ITEM_DIV ;
   private boolean n405TBM32_CRF_ITEM_NM ;
   private String AV8P_CRF_ID ;
   private String AV9P_CRF_ITEM_CD ;
   private String AV14W_RTN_MSG ;
   private String AV16C_APP_ID ;
   private String A72TBM32_CRF_ITEM_CD ;
   private String A75TBM32_DEL_FLG ;
   private String A412TBM32_UPD_PROG_NM ;
   private String A411TBM32_UPD_USER_ID ;
   private String A409TBM32_CRT_PROG_NM ;
   private String A408TBM32_CRT_USER_ID ;
   private String A775TBM32_REF_CRF_ITEM_CD ;
   private String A406TBM32_CRF_ITEM_NOTE ;
   private String A695TBM32_MAX_VALUE ;
   private String A694TBM32_MIN_VALUE ;
   private String A693TBM32_REQUIRED_INPUT_FLG ;
   private String A692TBM32_TABSTOP_FLG ;
   private String A520TBM32_LINE_END_POINT_DIV ;
   private String A519TBM32_LINE_START_POINT_DIV ;
   private String A514TBM32_FONT_UL_FLG ;
   private String A524TBM32_TEXT ;
   private String A526TBM32_IMAGE_CD ;
   private String A525TBM32_LIST_CD ;
   private String A527TBM32_FIXED_VALUE ;
   private String A523TBM32_CHK_FALSE_INNER_VALUE ;
   private String A522TBM32_CHK_TRUE_INNER_VALUE ;
   private String A512TBM32_TEXT_ALIGN_DIV ;
   private String A73TBM32_CRF_ITEM_GRP_CD ;
   private String A74TBM32_CRF_ITEM_DIV ;
   private String A405TBM32_CRF_ITEM_NM ;
   private String AV15W_STR ;
   private String AV19W_MSG ;
   private GxObjectCollection[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P001X2_A75TBM32_DEL_FLG ;
   private boolean[] P001X2_n75TBM32_DEL_FLG ;
   private String[] P001X2_A72TBM32_CRF_ITEM_CD ;
   private short[] P001X2_A71TBM32_CRF_ID ;
   private long[] P001X2_A70TBM32_STUDY_ID ;
   private long[] P001X2_A413TBM32_UPD_CNT ;
   private boolean[] P001X2_n413TBM32_UPD_CNT ;
   private String[] P001X2_A412TBM32_UPD_PROG_NM ;
   private boolean[] P001X2_n412TBM32_UPD_PROG_NM ;
   private String[] P001X2_A411TBM32_UPD_USER_ID ;
   private boolean[] P001X2_n411TBM32_UPD_USER_ID ;
   private java.util.Date[] P001X2_A410TBM32_UPD_DATETIME ;
   private boolean[] P001X2_n410TBM32_UPD_DATETIME ;
   private String[] P001X2_A409TBM32_CRT_PROG_NM ;
   private boolean[] P001X2_n409TBM32_CRT_PROG_NM ;
   private String[] P001X2_A408TBM32_CRT_USER_ID ;
   private boolean[] P001X2_n408TBM32_CRT_USER_ID ;
   private java.util.Date[] P001X2_A407TBM32_CRT_DATETIME ;
   private boolean[] P001X2_n407TBM32_CRT_DATETIME ;
   private String[] P001X2_A775TBM32_REF_CRF_ITEM_CD ;
   private boolean[] P001X2_n775TBM32_REF_CRF_ITEM_CD ;
   private short[] P001X2_A774TBM32_REF_CRF_ID ;
   private boolean[] P001X2_n774TBM32_REF_CRF_ID ;
   private String[] P001X2_A406TBM32_CRF_ITEM_NOTE ;
   private boolean[] P001X2_n406TBM32_CRF_ITEM_NOTE ;
   private String[] P001X2_A695TBM32_MAX_VALUE ;
   private boolean[] P001X2_n695TBM32_MAX_VALUE ;
   private String[] P001X2_A694TBM32_MIN_VALUE ;
   private boolean[] P001X2_n694TBM32_MIN_VALUE ;
   private String[] P001X2_A693TBM32_REQUIRED_INPUT_FLG ;
   private boolean[] P001X2_n693TBM32_REQUIRED_INPUT_FLG ;
   private String[] P001X2_A692TBM32_TABSTOP_FLG ;
   private boolean[] P001X2_n692TBM32_TABSTOP_FLG ;
   private short[] P001X2_A691TBM32_TAB_ORDER ;
   private boolean[] P001X2_n691TBM32_TAB_ORDER ;
   private short[] P001X2_A645TBM32_ZORDER ;
   private boolean[] P001X2_n645TBM32_ZORDER ;
   private byte[] P001X2_A644TBM32_AUTH_LVL_MIN ;
   private boolean[] P001X2_n644TBM32_AUTH_LVL_MIN ;
   private short[] P001X2_A690TBM32_LINE_ANGLE ;
   private boolean[] P001X2_n690TBM32_LINE_ANGLE ;
   private String[] P001X2_A520TBM32_LINE_END_POINT_DIV ;
   private boolean[] P001X2_n520TBM32_LINE_END_POINT_DIV ;
   private String[] P001X2_A519TBM32_LINE_START_POINT_DIV ;
   private boolean[] P001X2_n519TBM32_LINE_START_POINT_DIV ;
   private long[] P001X2_A689TBM32_LINE_COLOR_DIV ;
   private boolean[] P001X2_n689TBM32_LINE_COLOR_DIV ;
   private byte[] P001X2_A521TBM32_LINE_SIZE_DIV ;
   private boolean[] P001X2_n521TBM32_LINE_SIZE_DIV ;
   private long[] P001X2_A515TBM32_FONT_COLOR_DIV ;
   private boolean[] P001X2_n515TBM32_FONT_COLOR_DIV ;
   private String[] P001X2_A514TBM32_FONT_UL_FLG ;
   private boolean[] P001X2_n514TBM32_FONT_UL_FLG ;
   private byte[] P001X2_A513TBM32_FONT_SIZE ;
   private boolean[] P001X2_n513TBM32_FONT_SIZE ;
   private String[] P001X2_A524TBM32_TEXT ;
   private boolean[] P001X2_n524TBM32_TEXT ;
   private String[] P001X2_A526TBM32_IMAGE_CD ;
   private boolean[] P001X2_n526TBM32_IMAGE_CD ;
   private String[] P001X2_A525TBM32_LIST_CD ;
   private boolean[] P001X2_n525TBM32_LIST_CD ;
   private String[] P001X2_A527TBM32_FIXED_VALUE ;
   private boolean[] P001X2_n527TBM32_FIXED_VALUE ;
   private String[] P001X2_A523TBM32_CHK_FALSE_INNER_VALUE ;
   private boolean[] P001X2_n523TBM32_CHK_FALSE_INNER_VALUE ;
   private String[] P001X2_A522TBM32_CHK_TRUE_INNER_VALUE ;
   private boolean[] P001X2_n522TBM32_CHK_TRUE_INNER_VALUE ;
   private byte[] P001X2_A518TBM32_DECIMAL_DIGITS ;
   private boolean[] P001X2_n518TBM32_DECIMAL_DIGITS ;
   private short[] P001X2_A517TBM32_TEXT_MAXLENGTH ;
   private boolean[] P001X2_n517TBM32_TEXT_MAXLENGTH ;
   private byte[] P001X2_A516TBM32_TEXT_MAXROWS ;
   private boolean[] P001X2_n516TBM32_TEXT_MAXROWS ;
   private String[] P001X2_A512TBM32_TEXT_ALIGN_DIV ;
   private boolean[] P001X2_n512TBM32_TEXT_ALIGN_DIV ;
   private short[] P001X2_A511TBM32_LOCATION_Y2 ;
   private boolean[] P001X2_n511TBM32_LOCATION_Y2 ;
   private short[] P001X2_A510TBM32_LOCATION_X2 ;
   private boolean[] P001X2_n510TBM32_LOCATION_X2 ;
   private short[] P001X2_A509TBM32_LOCATION_Y ;
   private boolean[] P001X2_n509TBM32_LOCATION_Y ;
   private short[] P001X2_A508TBM32_LOCATION_X ;
   private boolean[] P001X2_n508TBM32_LOCATION_X ;
   private short[] P001X2_A507TBM32_CRF_ITEM_GRP_ORDER ;
   private boolean[] P001X2_n507TBM32_CRF_ITEM_GRP_ORDER ;
   private String[] P001X2_A73TBM32_CRF_ITEM_GRP_CD ;
   private boolean[] P001X2_n73TBM32_CRF_ITEM_GRP_CD ;
   private String[] P001X2_A74TBM32_CRF_ITEM_DIV ;
   private boolean[] P001X2_n74TBM32_CRF_ITEM_DIV ;
   private String[] P001X2_A405TBM32_CRF_ITEM_NM ;
   private boolean[] P001X2_n405TBM32_CRF_ITEM_NM ;
   private GxObjectCollection AV13W_RTN_CSV ;
   private SdtB808_SD01_EXTRA_INFO AV17W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO55[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV18W_PARMS_ITEM ;
}

final  class b599_pc02_crf_item_res__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P001X2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV8P_CRF_ID ,
                                          String AV9P_CRF_ITEM_CD ,
                                          short A71TBM32_CRF_ID ,
                                          short AV11W_CRF_ID ,
                                          String A72TBM32_CRF_ITEM_CD ,
                                          String A75TBM32_DEL_FLG ,
                                          long AV10P_STUDY_ID ,
                                          long A70TBM32_STUDY_ID )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int57 ;
      GXv_int57 = new byte [3] ;
      Object[] GXv_Object58 ;
      GXv_Object58 = new Object [2] ;
      Gx_ope = "Declare" ;
      Gx_etb = "TBM32_CRF_ITEM" ;
      scmdbuf = "SELECT `TBM32_DEL_FLG`, `TBM32_CRF_ITEM_CD`, `TBM32_CRF_ID`, `TBM32_STUDY_ID`, `TBM32_UPD_CNT`," ;
      scmdbuf = scmdbuf + " `TBM32_UPD_PROG_NM`, `TBM32_UPD_USER_ID`, `TBM32_UPD_DATETIME`, `TBM32_CRT_PROG_NM`," ;
      scmdbuf = scmdbuf + " `TBM32_CRT_USER_ID`, `TBM32_CRT_DATETIME`, `TBM32_REF_CRF_ITEM_CD`, `TBM32_REF_CRF_ID`," ;
      scmdbuf = scmdbuf + " `TBM32_CRF_ITEM_NOTE`, `TBM32_MAX_VALUE`, `TBM32_MIN_VALUE`, `TBM32_REQUIRED_INPUT_FLG`," ;
      scmdbuf = scmdbuf + " `TBM32_TABSTOP_FLG`, `TBM32_TAB_ORDER`, `TBM32_ZORDER`, `TBM32_AUTH_LVL_MIN`, `TBM32_LINE_ANGLE`," ;
      scmdbuf = scmdbuf + " `TBM32_LINE_END_POINT_DIV`, `TBM32_LINE_START_POINT_DIV`, `TBM32_LINE_COLOR_DIV`," ;
      scmdbuf = scmdbuf + " `TBM32_LINE_SIZE_DIV`, `TBM32_FONT_COLOR_DIV`, `TBM32_FONT_UL_FLG`, `TBM32_FONT_SIZE`," ;
      scmdbuf = scmdbuf + " `TBM32_TEXT`, `TBM32_IMAGE_CD`, `TBM32_LIST_CD`, `TBM32_FIXED_VALUE`, `TBM32_CHK_FALSE_INNER_VALUE`," ;
      scmdbuf = scmdbuf + " `TBM32_CHK_TRUE_INNER_VALUE`, `TBM32_DECIMAL_DIGITS`, `TBM32_TEXT_MAXLENGTH`, `TBM32_TEXT_MAXROWS`," ;
      scmdbuf = scmdbuf + " `TBM32_TEXT_ALIGN_DIV`, `TBM32_LOCATION_Y2`, `TBM32_LOCATION_X2`, `TBM32_LOCATION_Y`," ;
      scmdbuf = scmdbuf + " `TBM32_LOCATION_X`, `TBM32_CRF_ITEM_GRP_ORDER`, `TBM32_CRF_ITEM_GRP_CD`, `TBM32_CRF_ITEM_DIV`," ;
      scmdbuf = scmdbuf + " `TBM32_CRF_ITEM_NM` FROM `TBM32_CRF_ITEM`" ;
      scmdbuf = scmdbuf + " WHERE (`TBM32_STUDY_ID` = ?)" ;
      scmdbuf = scmdbuf + " and (`TBM32_DEL_FLG` = '0')" ;
      if ( ! (GXutil.strcmp("", AV8P_CRF_ID)==0) )
      {
         sWhereString = sWhereString + " and (`TBM32_CRF_ID` = ?)" ;
      }
      else
      {
         GXv_int57[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV9P_CRF_ITEM_CD)==0) )
      {
         sWhereString = sWhereString + " and (`TBM32_CRF_ITEM_CD` = ?)" ;
      }
      else
      {
         GXv_int57[2] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TBM32_STUDY_ID`, `TBM32_CRF_ID`, `TBM32_CRF_ITEM_CD`" ;
      GXv_Object58[0] = scmdbuf ;
      GXv_Object58[1] = GXv_int57 ;
      return GXv_Object58 ;
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
                  return conditional_P001X2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).longValue() , ((Number) dynConstraints[7]).longValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001X2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
               ((short[]) buf[3])[0] = rslt.getShort(3) ;
               ((long[]) buf[4])[0] = rslt.getLong(4) ;
               ((long[]) buf[5])[0] = rslt.getLong(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(13) ;
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
               ((short[]) buf[33])[0] = rslt.getShort(19) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((short[]) buf[35])[0] = rslt.getShort(20) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((byte[]) buf[37])[0] = rslt.getByte(21) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((short[]) buf[39])[0] = rslt.getShort(22) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((long[]) buf[45])[0] = rslt.getLong(25) ;
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((byte[]) buf[47])[0] = rslt.getByte(26) ;
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((long[]) buf[49])[0] = rslt.getLong(27) ;
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getVarchar(28) ;
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((byte[]) buf[53])[0] = rslt.getByte(29) ;
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getVarchar(30) ;
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getVarchar(31) ;
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getVarchar(32) ;
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getVarchar(33) ;
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getVarchar(34) ;
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((String[]) buf[65])[0] = rslt.getVarchar(35) ;
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((byte[]) buf[67])[0] = rslt.getByte(36) ;
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((short[]) buf[69])[0] = rslt.getShort(37) ;
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((byte[]) buf[71])[0] = rslt.getByte(38) ;
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((String[]) buf[73])[0] = rslt.getVarchar(39) ;
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((short[]) buf[75])[0] = rslt.getShort(40) ;
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((short[]) buf[77])[0] = rslt.getShort(41) ;
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((short[]) buf[79])[0] = rslt.getShort(42) ;
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((short[]) buf[81])[0] = rslt.getShort(43) ;
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((short[]) buf[83])[0] = rslt.getShort(44) ;
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((String[]) buf[85])[0] = rslt.getVarchar(45) ;
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
      short sIdx ;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[3]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[4]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[5], 50);
               }
               return;
      }
   }

}

