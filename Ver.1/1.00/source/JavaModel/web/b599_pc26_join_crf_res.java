/*
               File: B599_PC26_JOIN_CRF_RES
        Description: CRFÉ}ÉXÉ^åãçáéÊìæ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:36.48
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b599_pc26_join_crf_res extends GXProcedure
{
   public b599_pc26_join_crf_res( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b599_pc26_join_crf_res.class ), "" );
   }

   public b599_pc26_join_crf_res( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             GxObjectCollection[] aP3 ,
                             short[] aP4 )
   {
      b599_pc26_join_crf_res.this.AV11P_STUDY_ID = aP0;
      b599_pc26_join_crf_res.this.AV9P_CRF_ID = aP1;
      b599_pc26_join_crf_res.this.AV10P_CRF_ITEM_CD = aP2;
      b599_pc26_join_crf_res.this.AV16W_RTN_CSV = aP3[0];
      b599_pc26_join_crf_res.this.aP5 = new String[] {""};
      initialize();
      privateExecute();
      return aP5[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        GxObjectCollection[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             GxObjectCollection[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 )
   {
      b599_pc26_join_crf_res.this.AV11P_STUDY_ID = aP0;
      b599_pc26_join_crf_res.this.AV9P_CRF_ID = aP1;
      b599_pc26_join_crf_res.this.AV10P_CRF_ITEM_CD = aP2;
      b599_pc26_join_crf_res.this.AV16W_RTN_CSV = aP3[0];
      this.aP3 = aP3;
      b599_pc26_join_crf_res.this.aP4 = aP4;
      b599_pc26_join_crf_res.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV20C_APP_ID = "B599" ;
      AV15W_RTN_CD = (short)(0) ;
      AV17W_RTN_MSG = "" ;
      AV21W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV21W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV20C_APP_ID );
      /* Execute user subroutine: S11154 */
      S11154 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV13W_CRF_ID = (short)(GXutil.lval( AV9P_CRF_ID)) ;
      AV19W_STUDY_ID = GXutil.lval( AV11P_STUDY_ID) ;
      AV26GXLvl41 = (byte)(0) ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV10P_CRF_ITEM_CD ,
                                           A233TBM32_CRF_ITEM_CD ,
                                           A238TBM32_DEL_FLG ,
                                           new Long(AV19W_STUDY_ID) ,
                                           new Short(AV13W_CRF_ID) ,
                                           new Long(A231TBM32_STUDY_ID) ,
                                           new Short(A232TBM32_CRF_ID) },
                                           new int[] {
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.SHORT
                                           }
      });
      Gx_ope = "Fetch" ;
      Gx_etb = "TBM32_CRF_ITEM" ;
      /* Using cursor P004I2 */
      pr_default.execute(0, new Object[] {new Long(AV19W_STUDY_ID), new Short(AV13W_CRF_ID), AV10P_CRF_ITEM_CD});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A402TBM32_LIST_CD = P004I2_A402TBM32_LIST_CD[0] ;
         n402TBM32_LIST_CD = P004I2_n402TBM32_LIST_CD[0] ;
         A233TBM32_CRF_ITEM_CD = P004I2_A233TBM32_CRF_ITEM_CD[0] ;
         A232TBM32_CRF_ID = P004I2_A232TBM32_CRF_ID[0] ;
         A231TBM32_STUDY_ID = P004I2_A231TBM32_STUDY_ID[0] ;
         A238TBM32_DEL_FLG = P004I2_A238TBM32_DEL_FLG[0] ;
         n238TBM32_DEL_FLG = P004I2_n238TBM32_DEL_FLG[0] ;
         A747TBM32_REF_CRF_ITEM_CD = P004I2_A747TBM32_REF_CRF_ITEM_CD[0] ;
         n747TBM32_REF_CRF_ITEM_CD = P004I2_n747TBM32_REF_CRF_ITEM_CD[0] ;
         A746TBM32_REF_CRF_ID = P004I2_A746TBM32_REF_CRF_ID[0] ;
         n746TBM32_REF_CRF_ID = P004I2_n746TBM32_REF_CRF_ID[0] ;
         A237TBM32_CRF_ITEM_NOTE = P004I2_A237TBM32_CRF_ITEM_NOTE[0] ;
         n237TBM32_CRF_ITEM_NOTE = P004I2_n237TBM32_CRF_ITEM_NOTE[0] ;
         A609TBM32_MAX_VALUE = P004I2_A609TBM32_MAX_VALUE[0] ;
         n609TBM32_MAX_VALUE = P004I2_n609TBM32_MAX_VALUE[0] ;
         A608TBM32_MIN_VALUE = P004I2_A608TBM32_MIN_VALUE[0] ;
         n608TBM32_MIN_VALUE = P004I2_n608TBM32_MIN_VALUE[0] ;
         A607TBM32_REQUIRED_INPUT_FLG = P004I2_A607TBM32_REQUIRED_INPUT_FLG[0] ;
         n607TBM32_REQUIRED_INPUT_FLG = P004I2_n607TBM32_REQUIRED_INPUT_FLG[0] ;
         A606TBM32_TABSTOP_FLG = P004I2_A606TBM32_TABSTOP_FLG[0] ;
         n606TBM32_TABSTOP_FLG = P004I2_n606TBM32_TABSTOP_FLG[0] ;
         A605TBM32_TAB_ORDER = P004I2_A605TBM32_TAB_ORDER[0] ;
         n605TBM32_TAB_ORDER = P004I2_n605TBM32_TAB_ORDER[0] ;
         A553TBM32_ZORDER = P004I2_A553TBM32_ZORDER[0] ;
         n553TBM32_ZORDER = P004I2_n553TBM32_ZORDER[0] ;
         A552TBM32_AUTH_LVL_MIN = P004I2_A552TBM32_AUTH_LVL_MIN[0] ;
         n552TBM32_AUTH_LVL_MIN = P004I2_n552TBM32_AUTH_LVL_MIN[0] ;
         A604TBM32_LINE_ANGLE = P004I2_A604TBM32_LINE_ANGLE[0] ;
         n604TBM32_LINE_ANGLE = P004I2_n604TBM32_LINE_ANGLE[0] ;
         A397TBM32_LINE_END_POINT_DIV = P004I2_A397TBM32_LINE_END_POINT_DIV[0] ;
         n397TBM32_LINE_END_POINT_DIV = P004I2_n397TBM32_LINE_END_POINT_DIV[0] ;
         A396TBM32_LINE_START_POINT_DIV = P004I2_A396TBM32_LINE_START_POINT_DIV[0] ;
         n396TBM32_LINE_START_POINT_DIV = P004I2_n396TBM32_LINE_START_POINT_DIV[0] ;
         A603TBM32_LINE_COLOR_DIV = P004I2_A603TBM32_LINE_COLOR_DIV[0] ;
         n603TBM32_LINE_COLOR_DIV = P004I2_n603TBM32_LINE_COLOR_DIV[0] ;
         A398TBM32_LINE_SIZE_DIV = P004I2_A398TBM32_LINE_SIZE_DIV[0] ;
         n398TBM32_LINE_SIZE_DIV = P004I2_n398TBM32_LINE_SIZE_DIV[0] ;
         A392TBM32_FONT_COLOR_DIV = P004I2_A392TBM32_FONT_COLOR_DIV[0] ;
         n392TBM32_FONT_COLOR_DIV = P004I2_n392TBM32_FONT_COLOR_DIV[0] ;
         A391TBM32_FONT_UL_FLG = P004I2_A391TBM32_FONT_UL_FLG[0] ;
         n391TBM32_FONT_UL_FLG = P004I2_n391TBM32_FONT_UL_FLG[0] ;
         A390TBM32_FONT_SIZE = P004I2_A390TBM32_FONT_SIZE[0] ;
         n390TBM32_FONT_SIZE = P004I2_n390TBM32_FONT_SIZE[0] ;
         A401TBM32_TEXT = P004I2_A401TBM32_TEXT[0] ;
         n401TBM32_TEXT = P004I2_n401TBM32_TEXT[0] ;
         A403TBM32_IMAGE_CD = P004I2_A403TBM32_IMAGE_CD[0] ;
         n403TBM32_IMAGE_CD = P004I2_n403TBM32_IMAGE_CD[0] ;
         A404TBM32_FIXED_VALUE = P004I2_A404TBM32_FIXED_VALUE[0] ;
         n404TBM32_FIXED_VALUE = P004I2_n404TBM32_FIXED_VALUE[0] ;
         A400TBM32_CHK_FALSE_INNER_VALUE = P004I2_A400TBM32_CHK_FALSE_INNER_VALUE[0] ;
         n400TBM32_CHK_FALSE_INNER_VALUE = P004I2_n400TBM32_CHK_FALSE_INNER_VALUE[0] ;
         A399TBM32_CHK_TRUE_INNER_VALUE = P004I2_A399TBM32_CHK_TRUE_INNER_VALUE[0] ;
         n399TBM32_CHK_TRUE_INNER_VALUE = P004I2_n399TBM32_CHK_TRUE_INNER_VALUE[0] ;
         A395TBM32_DECIMAL_DIGITS = P004I2_A395TBM32_DECIMAL_DIGITS[0] ;
         n395TBM32_DECIMAL_DIGITS = P004I2_n395TBM32_DECIMAL_DIGITS[0] ;
         A394TBM32_TEXT_MAXLENGTH = P004I2_A394TBM32_TEXT_MAXLENGTH[0] ;
         n394TBM32_TEXT_MAXLENGTH = P004I2_n394TBM32_TEXT_MAXLENGTH[0] ;
         A393TBM32_TEXT_MAXROWS = P004I2_A393TBM32_TEXT_MAXROWS[0] ;
         n393TBM32_TEXT_MAXROWS = P004I2_n393TBM32_TEXT_MAXROWS[0] ;
         A389TBM32_TEXT_ALIGN_DIV = P004I2_A389TBM32_TEXT_ALIGN_DIV[0] ;
         n389TBM32_TEXT_ALIGN_DIV = P004I2_n389TBM32_TEXT_ALIGN_DIV[0] ;
         A388TBM32_LOCATION_Y2 = P004I2_A388TBM32_LOCATION_Y2[0] ;
         n388TBM32_LOCATION_Y2 = P004I2_n388TBM32_LOCATION_Y2[0] ;
         A387TBM32_LOCATION_X2 = P004I2_A387TBM32_LOCATION_X2[0] ;
         n387TBM32_LOCATION_X2 = P004I2_n387TBM32_LOCATION_X2[0] ;
         A386TBM32_LOCATION_Y = P004I2_A386TBM32_LOCATION_Y[0] ;
         n386TBM32_LOCATION_Y = P004I2_n386TBM32_LOCATION_Y[0] ;
         A385TBM32_LOCATION_X = P004I2_A385TBM32_LOCATION_X[0] ;
         n385TBM32_LOCATION_X = P004I2_n385TBM32_LOCATION_X[0] ;
         A384TBM32_CRF_ITEM_GRP_ORDER = P004I2_A384TBM32_CRF_ITEM_GRP_ORDER[0] ;
         n384TBM32_CRF_ITEM_GRP_ORDER = P004I2_n384TBM32_CRF_ITEM_GRP_ORDER[0] ;
         A236TBM32_CRF_ITEM_GRP_CD = P004I2_A236TBM32_CRF_ITEM_GRP_CD[0] ;
         n236TBM32_CRF_ITEM_GRP_CD = P004I2_n236TBM32_CRF_ITEM_GRP_CD[0] ;
         A235TBM32_CRF_ITEM_DIV = P004I2_A235TBM32_CRF_ITEM_DIV[0] ;
         n235TBM32_CRF_ITEM_DIV = P004I2_n235TBM32_CRF_ITEM_DIV[0] ;
         A234TBM32_CRF_ITEM_NM = P004I2_A234TBM32_CRF_ITEM_NM[0] ;
         n234TBM32_CRF_ITEM_NM = P004I2_n234TBM32_CRF_ITEM_NM[0] ;
         AV26GXLvl41 = (byte)(1) ;
         GXt_char1 = AV18W_STR ;
         GXv_char2[0] = GXt_char1 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A233TBM32_CRF_ITEM_CD, GXv_char2) ;
         b599_pc26_join_crf_res.this.GXt_char1 = GXv_char2[0] ;
         GXt_char3 = AV18W_STR ;
         GXv_char4[0] = GXt_char3 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A234TBM32_CRF_ITEM_NM, GXv_char4) ;
         b599_pc26_join_crf_res.this.GXt_char3 = GXv_char4[0] ;
         GXt_char5 = AV18W_STR ;
         GXv_char6[0] = GXt_char5 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A235TBM32_CRF_ITEM_DIV, GXv_char6) ;
         b599_pc26_join_crf_res.this.GXt_char5 = GXv_char6[0] ;
         GXt_char7 = AV18W_STR ;
         GXv_char8[0] = GXt_char7 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A236TBM32_CRF_ITEM_GRP_CD, GXv_char8) ;
         b599_pc26_join_crf_res.this.GXt_char7 = GXv_char8[0] ;
         GXt_char9 = AV18W_STR ;
         GXv_char10[0] = GXt_char9 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A389TBM32_TEXT_ALIGN_DIV, GXv_char10) ;
         b599_pc26_join_crf_res.this.GXt_char9 = GXv_char10[0] ;
         GXt_char11 = AV18W_STR ;
         GXv_char12[0] = GXt_char11 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A399TBM32_CHK_TRUE_INNER_VALUE, GXv_char12) ;
         b599_pc26_join_crf_res.this.GXt_char11 = GXv_char12[0] ;
         GXt_char13 = AV18W_STR ;
         GXv_char14[0] = GXt_char13 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A400TBM32_CHK_FALSE_INNER_VALUE, GXv_char14) ;
         b599_pc26_join_crf_res.this.GXt_char13 = GXv_char14[0] ;
         GXt_char15 = AV18W_STR ;
         GXv_char16[0] = GXt_char15 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A404TBM32_FIXED_VALUE, GXv_char16) ;
         b599_pc26_join_crf_res.this.GXt_char15 = GXv_char16[0] ;
         GXt_char17 = AV18W_STR ;
         GXv_char18[0] = GXt_char17 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A402TBM32_LIST_CD, GXv_char18) ;
         b599_pc26_join_crf_res.this.GXt_char17 = GXv_char18[0] ;
         GXt_char19 = AV18W_STR ;
         GXv_char20[0] = GXt_char19 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A403TBM32_IMAGE_CD, GXv_char20) ;
         b599_pc26_join_crf_res.this.GXt_char19 = GXv_char20[0] ;
         GXt_char21 = AV18W_STR ;
         GXv_char22[0] = GXt_char21 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A401TBM32_TEXT, GXv_char22) ;
         b599_pc26_join_crf_res.this.GXt_char21 = GXv_char22[0] ;
         GXt_char23 = AV18W_STR ;
         GXv_char24[0] = GXt_char23 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A391TBM32_FONT_UL_FLG, GXv_char24) ;
         b599_pc26_join_crf_res.this.GXt_char23 = GXv_char24[0] ;
         GXt_char25 = AV18W_STR ;
         GXv_char26[0] = GXt_char25 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A396TBM32_LINE_START_POINT_DIV, GXv_char26) ;
         b599_pc26_join_crf_res.this.GXt_char25 = GXv_char26[0] ;
         GXt_char27 = AV18W_STR ;
         GXv_char28[0] = GXt_char27 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A397TBM32_LINE_END_POINT_DIV, GXv_char28) ;
         b599_pc26_join_crf_res.this.GXt_char27 = GXv_char28[0] ;
         GXt_char29 = AV18W_STR ;
         GXv_char30[0] = GXt_char29 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A606TBM32_TABSTOP_FLG, GXv_char30) ;
         b599_pc26_join_crf_res.this.GXt_char29 = GXv_char30[0] ;
         GXt_char31 = AV18W_STR ;
         GXv_char32[0] = GXt_char31 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A607TBM32_REQUIRED_INPUT_FLG, GXv_char32) ;
         b599_pc26_join_crf_res.this.GXt_char31 = GXv_char32[0] ;
         GXt_char33 = AV18W_STR ;
         GXv_char34[0] = GXt_char33 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A608TBM32_MIN_VALUE, GXv_char34) ;
         b599_pc26_join_crf_res.this.GXt_char33 = GXv_char34[0] ;
         GXt_char35 = AV18W_STR ;
         GXv_char36[0] = GXt_char35 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A609TBM32_MAX_VALUE, GXv_char36) ;
         b599_pc26_join_crf_res.this.GXt_char35 = GXv_char36[0] ;
         GXt_char37 = AV18W_STR ;
         GXv_char38[0] = GXt_char37 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A237TBM32_CRF_ITEM_NOTE, GXv_char38) ;
         b599_pc26_join_crf_res.this.GXt_char37 = GXv_char38[0] ;
         GXt_char39 = AV18W_STR ;
         GXv_char40[0] = GXt_char39 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A747TBM32_REF_CRF_ITEM_CD, GXv_char40) ;
         b599_pc26_join_crf_res.this.GXt_char39 = GXv_char40[0] ;
         AV18W_STR = GXutil.trim( GXutil.str( A231TBM32_STUDY_ID, 10, 0)) + "," + GXutil.trim( GXutil.str( A232TBM32_CRF_ID, 10, 0)) + "," + GXt_char1 + "," + GXt_char3 + "," + GXt_char5 + "," + GXt_char7 + "," + GXutil.trim( GXutil.str( A384TBM32_CRF_ITEM_GRP_ORDER, 10, 0)) + "," + GXutil.trim( GXutil.str( A385TBM32_LOCATION_X, 10, 0)) + "," + GXutil.trim( GXutil.str( A386TBM32_LOCATION_Y, 10, 0)) + "," + GXutil.trim( GXutil.str( A387TBM32_LOCATION_X2, 10, 0)) + "," + GXutil.trim( GXutil.str( A388TBM32_LOCATION_Y2, 10, 0)) + "," + GXt_char9 + "," + GXutil.trim( GXutil.str( A393TBM32_TEXT_MAXROWS, 10, 0)) + "," + GXutil.trim( GXutil.str( A394TBM32_TEXT_MAXLENGTH, 10, 0)) + "," + GXutil.trim( GXutil.str( A395TBM32_DECIMAL_DIGITS, 10, 0)) + "," + GXt_char11 + "," + GXt_char13 + "," + GXt_char15 + "," + GXt_char17 + "," + GXt_char19 + "," + GXt_char21 + "," + GXutil.trim( GXutil.str( A390TBM32_FONT_SIZE, 10, 0)) + "," + GXt_char23 + "," + GXutil.trim( GXutil.str( A392TBM32_FONT_COLOR_DIV, 10, 0)) + "," + GXutil.trim( GXutil.str( A398TBM32_LINE_SIZE_DIV, 10, 0)) + "," + GXutil.trim( GXutil.str( A603TBM32_LINE_COLOR_DIV, 10, 0)) + "," + GXt_char25 + "," + GXt_char27 + "," + GXutil.trim( GXutil.str( A604TBM32_LINE_ANGLE, 10, 0)) + "," + GXutil.trim( GXutil.str( A552TBM32_AUTH_LVL_MIN, 10, 0)) + "," + GXutil.trim( GXutil.str( A553TBM32_ZORDER, 10, 0)) + "," + GXutil.trim( GXutil.str( A605TBM32_TAB_ORDER, 10, 0)) + "," + GXt_char29 + "," + GXt_char31 + "," + GXt_char33 + "," + GXt_char35 + "," + GXt_char37 + "," + GXutil.trim( GXutil.str( A746TBM32_REF_CRF_ID, 10, 0)) + "," + GXt_char39 ;
         AV27GXLvl88 = (byte)(0) ;
         Gx_ope = "Fetch" ;
         Gx_etb = "TBM37_CRF_DOM_MAP" ;
         /* Using cursor P004I3 */
         pr_default.execute(1, new Object[] {new Long(A231TBM32_STUDY_ID), new Short(A232TBM32_CRF_ID), A233TBM32_CRF_ITEM_CD});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A271TBM37_STUDY_ID = P004I3_A271TBM37_STUDY_ID[0] ;
            A272TBM37_CRF_ID = P004I3_A272TBM37_CRF_ID[0] ;
            A273TBM37_CRF_ITEM_GRP_CD = P004I3_A273TBM37_CRF_ITEM_GRP_CD[0] ;
            A274TBM37_DEL_FLG = P004I3_A274TBM37_DEL_FLG[0] ;
            n274TBM37_DEL_FLG = P004I3_n274TBM37_DEL_FLG[0] ;
            A612TBM37_DOM_ITM_GRP_ROWNO = P004I3_A612TBM37_DOM_ITM_GRP_ROWNO[0] ;
            n612TBM37_DOM_ITM_GRP_ROWNO = P004I3_n612TBM37_DOM_ITM_GRP_ROWNO[0] ;
            A377TBM37_DOM_ITM_GRP_ATTR_SEQ = P004I3_A377TBM37_DOM_ITM_GRP_ATTR_SEQ[0] ;
            n377TBM37_DOM_ITM_GRP_ATTR_SEQ = P004I3_n377TBM37_DOM_ITM_GRP_ATTR_SEQ[0] ;
            A376TBM37_DOM_ITM_GRP_OID = P004I3_A376TBM37_DOM_ITM_GRP_OID[0] ;
            n376TBM37_DOM_ITM_GRP_OID = P004I3_n376TBM37_DOM_ITM_GRP_OID[0] ;
            A375TBM37_DOM_VAR_NM = P004I3_A375TBM37_DOM_VAR_NM[0] ;
            n375TBM37_DOM_VAR_NM = P004I3_n375TBM37_DOM_VAR_NM[0] ;
            A374TBM37_DOM_CD = P004I3_A374TBM37_DOM_CD[0] ;
            n374TBM37_DOM_CD = P004I3_n374TBM37_DOM_CD[0] ;
            A373TBM37_VISIT_NO = P004I3_A373TBM37_VISIT_NO[0] ;
            n373TBM37_VISIT_NO = P004I3_n373TBM37_VISIT_NO[0] ;
            A372TBM37_CRF_ITEM_GRP_DIV = P004I3_A372TBM37_CRF_ITEM_GRP_DIV[0] ;
            AV27GXLvl88 = (byte)(1) ;
            GXt_char39 = AV18W_STR ;
            GXv_char40[0] = GXt_char39 ;
            new b804_pc01_esc_airres(remoteHandle, context).execute( A372TBM37_CRF_ITEM_GRP_DIV, GXv_char40) ;
            b599_pc26_join_crf_res.this.GXt_char39 = GXv_char40[0] ;
            GXt_char37 = AV18W_STR ;
            GXv_char38[0] = GXt_char37 ;
            new b804_pc01_esc_airres(remoteHandle, context).execute( A374TBM37_DOM_CD, GXv_char38) ;
            b599_pc26_join_crf_res.this.GXt_char37 = GXv_char38[0] ;
            GXt_char35 = AV18W_STR ;
            GXv_char36[0] = GXt_char35 ;
            new b804_pc01_esc_airres(remoteHandle, context).execute( A375TBM37_DOM_VAR_NM, GXv_char36) ;
            b599_pc26_join_crf_res.this.GXt_char35 = GXv_char36[0] ;
            GXt_char33 = AV18W_STR ;
            GXv_char34[0] = GXt_char33 ;
            new b804_pc01_esc_airres(remoteHandle, context).execute( A376TBM37_DOM_ITM_GRP_OID, GXv_char34) ;
            b599_pc26_join_crf_res.this.GXt_char33 = GXv_char34[0] ;
            AV18W_STR = AV18W_STR + "," + GXt_char39 + "," + GXutil.trim( GXutil.str( A373TBM37_VISIT_NO, 10, 0)) + "," + GXt_char37 + "," + GXt_char35 + "," + GXt_char33 + "," + GXutil.trim( GXutil.str( A377TBM37_DOM_ITM_GRP_ATTR_SEQ, 10, 0)) + "," + GXutil.trim( GXutil.str( A612TBM37_DOM_ITM_GRP_ROWNO, 10, 0)) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( AV27GXLvl88 == 0 )
         {
            AV12W_CNT = (short)(1) ;
            while ( AV12W_CNT <= 7 )
            {
               AV18W_STR = AV18W_STR + "," ;
               AV12W_CNT = (short)(AV12W_CNT+1) ;
            }
         }
         AV28GXLvl110 = (byte)(0) ;
         Gx_ope = "Fetch" ;
         Gx_etb = "TBM41_CRF_NCM_MAP" ;
         /* Using cursor P004I4 */
         pr_default.execute(2, new Object[] {new Long(A231TBM32_STUDY_ID), new Short(A232TBM32_CRF_ID), A233TBM32_CRF_ITEM_CD});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A259TBM41_STUDY_ID = P004I4_A259TBM41_STUDY_ID[0] ;
            A260TBM41_CRF_ID = P004I4_A260TBM41_CRF_ID[0] ;
            A261TBM41_CRF_ITEM_GRP_CD = P004I4_A261TBM41_CRF_ITEM_GRP_CD[0] ;
            A263TBM41_DEL_FLG = P004I4_A263TBM41_DEL_FLG[0] ;
            n263TBM41_DEL_FLG = P004I4_n263TBM41_DEL_FLG[0] ;
            A262TBM41_NCM_METADATA_ID = P004I4_A262TBM41_NCM_METADATA_ID[0] ;
            n262TBM41_NCM_METADATA_ID = P004I4_n262TBM41_NCM_METADATA_ID[0] ;
            A378TBM41_CRF_ITEM_GRP_DIV = P004I4_A378TBM41_CRF_ITEM_GRP_DIV[0] ;
            AV28GXLvl110 = (byte)(1) ;
            GXt_char39 = AV18W_STR ;
            GXv_char40[0] = GXt_char39 ;
            new b804_pc01_esc_airres(remoteHandle, context).execute( A378TBM41_CRF_ITEM_GRP_DIV, GXv_char40) ;
            b599_pc26_join_crf_res.this.GXt_char39 = GXv_char40[0] ;
            GXt_char37 = AV18W_STR ;
            GXv_char38[0] = GXt_char37 ;
            new b804_pc01_esc_airres(remoteHandle, context).execute( A262TBM41_NCM_METADATA_ID, GXv_char38) ;
            b599_pc26_join_crf_res.this.GXt_char37 = GXv_char38[0] ;
            AV18W_STR = AV18W_STR + "," + GXt_char39 + "," + GXt_char37 ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(2);
         }
         pr_default.close(2);
         if ( AV28GXLvl110 == 0 )
         {
            AV12W_CNT = (short)(1) ;
            while ( AV12W_CNT <= 2 )
            {
               AV18W_STR = AV18W_STR + "," ;
               AV12W_CNT = (short)(AV12W_CNT+1) ;
            }
         }
         AV18W_STR = AV18W_STR + "," ;
         if ( ((GXutil.strcmp(A235TBM32_CRF_ITEM_DIV, "SelectBox")==0)||(GXutil.strcmp(A235TBM32_CRF_ITEM_DIV, "Group")==0)) && ! (GXutil.strcmp("", A402TBM32_LIST_CD)==0) )
         {
            Gx_ope = "Fetch" ;
            Gx_etb = "TBM25_SEL_LIST" ;
            /* Using cursor P004I5 */
            pr_default.execute(3, new Object[] {new Long(A231TBM32_STUDY_ID), new Boolean(n402TBM32_LIST_CD), A402TBM32_LIST_CD});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A435TBM25_STUDY_ID = P004I5_A435TBM25_STUDY_ID[0] ;
               A436TBM25_LIST_CD = P004I5_A436TBM25_LIST_CD[0] ;
               A438TBM25_DEL_FLG = P004I5_A438TBM25_DEL_FLG[0] ;
               n438TBM25_DEL_FLG = P004I5_n438TBM25_DEL_FLG[0] ;
               A437TBM25_LIST_NM = P004I5_A437TBM25_LIST_NM[0] ;
               n437TBM25_LIST_NM = P004I5_n437TBM25_LIST_NM[0] ;
               GXt_char39 = AV18W_STR ;
               GXv_char40[0] = GXt_char39 ;
               new b804_pc01_esc_airres(remoteHandle, context).execute( A437TBM25_LIST_NM, GXv_char40) ;
               b599_pc26_join_crf_res.this.GXt_char39 = GXv_char40[0] ;
               AV18W_STR = AV18W_STR + GXt_char39 ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(3);
         }
         AV16W_RTN_CSV.add(AV18W_STR, 0);
         if ( AV15W_RTN_CD != 0 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV26GXLvl41 == 0 )
      {
         AV15W_RTN_CD = (short)(1) ;
         GXt_char39 = AV17W_RTN_MSG ;
         GXv_char40[0] = GXt_char39 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char40) ;
         b599_pc26_join_crf_res.this.GXt_char39 = GXv_char40[0] ;
         AV17W_RTN_MSG = GXt_char39 ;
      }
      cleanup();
   }

   public void S11154( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      AV21W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      AV22W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV22W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_STUDY_ID" );
      AV22W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV11P_STUDY_ID );
      AV21W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV22W_PARMS_ITEM, 0);
      AV22W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV22W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_CRF_ID" );
      AV22W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV9P_CRF_ID );
      AV21W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV22W_PARMS_ITEM, 0);
      AV22W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV22W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_CRF_ITEM_CD" );
      AV22W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV10P_CRF_ITEM_CD );
      AV21W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV22W_PARMS_ITEM, 0);
      AV14W_MSG = "SUB_INIT" ;
      GXv_SdtB808_SD01_EXTRA_INFO41[0] = AV21W_EXTRA_INFO;
      GXv_int42[0] = AV15W_RTN_CD ;
      GXv_char40[0] = AV17W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV30Pgmname, (short)(1), AV14W_MSG, GXv_SdtB808_SD01_EXTRA_INFO41, GXv_int42, GXv_char40) ;
      AV21W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO41[0] ;
      b599_pc26_join_crf_res.this.AV15W_RTN_CD = GXv_int42[0] ;
      b599_pc26_join_crf_res.this.AV17W_RTN_MSG = GXv_char40[0] ;
   }

   public void S12182( )
   {
      /* 'SUB_ERROR' Routine */
      AV14W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO41[0] = AV21W_EXTRA_INFO;
      GXv_int42[0] = AV15W_RTN_CD ;
      GXv_char40[0] = AV17W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV30Pgmname, (short)(0), AV14W_MSG, GXv_SdtB808_SD01_EXTRA_INFO41, GXv_int42, GXv_char40) ;
      AV21W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO41[0] ;
      b599_pc26_join_crf_res.this.AV15W_RTN_CD = GXv_int42[0] ;
      b599_pc26_join_crf_res.this.AV17W_RTN_MSG = GXv_char40[0] ;
      context.globals.Gx_eop = (byte)(0) ;
   }

   protected void cleanup( )
   {
      this.aP3[0] = b599_pc26_join_crf_res.this.AV16W_RTN_CSV;
      this.aP4[0] = b599_pc26_join_crf_res.this.AV15W_RTN_CD;
      this.aP5[0] = b599_pc26_join_crf_res.this.AV17W_RTN_MSG;
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
                  /* Execute user subroutine: S12182 */
                  S12182 ();
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
      AV17W_RTN_MSG = "" ;
      AV20C_APP_ID = "" ;
      AV21W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      scmdbuf = "" ;
      A233TBM32_CRF_ITEM_CD = "" ;
      A238TBM32_DEL_FLG = "" ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      P004I2_A402TBM32_LIST_CD = new String[] {""} ;
      P004I2_n402TBM32_LIST_CD = new boolean[] {false} ;
      P004I2_A233TBM32_CRF_ITEM_CD = new String[] {""} ;
      P004I2_A232TBM32_CRF_ID = new short[1] ;
      P004I2_A231TBM32_STUDY_ID = new long[1] ;
      P004I2_A238TBM32_DEL_FLG = new String[] {""} ;
      P004I2_n238TBM32_DEL_FLG = new boolean[] {false} ;
      P004I2_A747TBM32_REF_CRF_ITEM_CD = new String[] {""} ;
      P004I2_n747TBM32_REF_CRF_ITEM_CD = new boolean[] {false} ;
      P004I2_A746TBM32_REF_CRF_ID = new short[1] ;
      P004I2_n746TBM32_REF_CRF_ID = new boolean[] {false} ;
      P004I2_A237TBM32_CRF_ITEM_NOTE = new String[] {""} ;
      P004I2_n237TBM32_CRF_ITEM_NOTE = new boolean[] {false} ;
      P004I2_A609TBM32_MAX_VALUE = new String[] {""} ;
      P004I2_n609TBM32_MAX_VALUE = new boolean[] {false} ;
      P004I2_A608TBM32_MIN_VALUE = new String[] {""} ;
      P004I2_n608TBM32_MIN_VALUE = new boolean[] {false} ;
      P004I2_A607TBM32_REQUIRED_INPUT_FLG = new String[] {""} ;
      P004I2_n607TBM32_REQUIRED_INPUT_FLG = new boolean[] {false} ;
      P004I2_A606TBM32_TABSTOP_FLG = new String[] {""} ;
      P004I2_n606TBM32_TABSTOP_FLG = new boolean[] {false} ;
      P004I2_A605TBM32_TAB_ORDER = new short[1] ;
      P004I2_n605TBM32_TAB_ORDER = new boolean[] {false} ;
      P004I2_A553TBM32_ZORDER = new short[1] ;
      P004I2_n553TBM32_ZORDER = new boolean[] {false} ;
      P004I2_A552TBM32_AUTH_LVL_MIN = new byte[1] ;
      P004I2_n552TBM32_AUTH_LVL_MIN = new boolean[] {false} ;
      P004I2_A604TBM32_LINE_ANGLE = new short[1] ;
      P004I2_n604TBM32_LINE_ANGLE = new boolean[] {false} ;
      P004I2_A397TBM32_LINE_END_POINT_DIV = new String[] {""} ;
      P004I2_n397TBM32_LINE_END_POINT_DIV = new boolean[] {false} ;
      P004I2_A396TBM32_LINE_START_POINT_DIV = new String[] {""} ;
      P004I2_n396TBM32_LINE_START_POINT_DIV = new boolean[] {false} ;
      P004I2_A603TBM32_LINE_COLOR_DIV = new long[1] ;
      P004I2_n603TBM32_LINE_COLOR_DIV = new boolean[] {false} ;
      P004I2_A398TBM32_LINE_SIZE_DIV = new byte[1] ;
      P004I2_n398TBM32_LINE_SIZE_DIV = new boolean[] {false} ;
      P004I2_A392TBM32_FONT_COLOR_DIV = new long[1] ;
      P004I2_n392TBM32_FONT_COLOR_DIV = new boolean[] {false} ;
      P004I2_A391TBM32_FONT_UL_FLG = new String[] {""} ;
      P004I2_n391TBM32_FONT_UL_FLG = new boolean[] {false} ;
      P004I2_A390TBM32_FONT_SIZE = new byte[1] ;
      P004I2_n390TBM32_FONT_SIZE = new boolean[] {false} ;
      P004I2_A401TBM32_TEXT = new String[] {""} ;
      P004I2_n401TBM32_TEXT = new boolean[] {false} ;
      P004I2_A403TBM32_IMAGE_CD = new String[] {""} ;
      P004I2_n403TBM32_IMAGE_CD = new boolean[] {false} ;
      P004I2_A404TBM32_FIXED_VALUE = new String[] {""} ;
      P004I2_n404TBM32_FIXED_VALUE = new boolean[] {false} ;
      P004I2_A400TBM32_CHK_FALSE_INNER_VALUE = new String[] {""} ;
      P004I2_n400TBM32_CHK_FALSE_INNER_VALUE = new boolean[] {false} ;
      P004I2_A399TBM32_CHK_TRUE_INNER_VALUE = new String[] {""} ;
      P004I2_n399TBM32_CHK_TRUE_INNER_VALUE = new boolean[] {false} ;
      P004I2_A395TBM32_DECIMAL_DIGITS = new byte[1] ;
      P004I2_n395TBM32_DECIMAL_DIGITS = new boolean[] {false} ;
      P004I2_A394TBM32_TEXT_MAXLENGTH = new short[1] ;
      P004I2_n394TBM32_TEXT_MAXLENGTH = new boolean[] {false} ;
      P004I2_A393TBM32_TEXT_MAXROWS = new byte[1] ;
      P004I2_n393TBM32_TEXT_MAXROWS = new boolean[] {false} ;
      P004I2_A389TBM32_TEXT_ALIGN_DIV = new String[] {""} ;
      P004I2_n389TBM32_TEXT_ALIGN_DIV = new boolean[] {false} ;
      P004I2_A388TBM32_LOCATION_Y2 = new short[1] ;
      P004I2_n388TBM32_LOCATION_Y2 = new boolean[] {false} ;
      P004I2_A387TBM32_LOCATION_X2 = new short[1] ;
      P004I2_n387TBM32_LOCATION_X2 = new boolean[] {false} ;
      P004I2_A386TBM32_LOCATION_Y = new short[1] ;
      P004I2_n386TBM32_LOCATION_Y = new boolean[] {false} ;
      P004I2_A385TBM32_LOCATION_X = new short[1] ;
      P004I2_n385TBM32_LOCATION_X = new boolean[] {false} ;
      P004I2_A384TBM32_CRF_ITEM_GRP_ORDER = new short[1] ;
      P004I2_n384TBM32_CRF_ITEM_GRP_ORDER = new boolean[] {false} ;
      P004I2_A236TBM32_CRF_ITEM_GRP_CD = new String[] {""} ;
      P004I2_n236TBM32_CRF_ITEM_GRP_CD = new boolean[] {false} ;
      P004I2_A235TBM32_CRF_ITEM_DIV = new String[] {""} ;
      P004I2_n235TBM32_CRF_ITEM_DIV = new boolean[] {false} ;
      P004I2_A234TBM32_CRF_ITEM_NM = new String[] {""} ;
      P004I2_n234TBM32_CRF_ITEM_NM = new boolean[] {false} ;
      A402TBM32_LIST_CD = "" ;
      A747TBM32_REF_CRF_ITEM_CD = "" ;
      A237TBM32_CRF_ITEM_NOTE = "" ;
      A609TBM32_MAX_VALUE = "" ;
      A608TBM32_MIN_VALUE = "" ;
      A607TBM32_REQUIRED_INPUT_FLG = "" ;
      A606TBM32_TABSTOP_FLG = "" ;
      A397TBM32_LINE_END_POINT_DIV = "" ;
      A396TBM32_LINE_START_POINT_DIV = "" ;
      A391TBM32_FONT_UL_FLG = "" ;
      A401TBM32_TEXT = "" ;
      A403TBM32_IMAGE_CD = "" ;
      A404TBM32_FIXED_VALUE = "" ;
      A400TBM32_CHK_FALSE_INNER_VALUE = "" ;
      A399TBM32_CHK_TRUE_INNER_VALUE = "" ;
      A389TBM32_TEXT_ALIGN_DIV = "" ;
      A236TBM32_CRF_ITEM_GRP_CD = "" ;
      A235TBM32_CRF_ITEM_DIV = "" ;
      A234TBM32_CRF_ITEM_NM = "" ;
      AV18W_STR = "" ;
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
      P004I3_A271TBM37_STUDY_ID = new long[1] ;
      P004I3_A272TBM37_CRF_ID = new short[1] ;
      P004I3_A273TBM37_CRF_ITEM_GRP_CD = new String[] {""} ;
      P004I3_A274TBM37_DEL_FLG = new String[] {""} ;
      P004I3_n274TBM37_DEL_FLG = new boolean[] {false} ;
      P004I3_A612TBM37_DOM_ITM_GRP_ROWNO = new short[1] ;
      P004I3_n612TBM37_DOM_ITM_GRP_ROWNO = new boolean[] {false} ;
      P004I3_A377TBM37_DOM_ITM_GRP_ATTR_SEQ = new short[1] ;
      P004I3_n377TBM37_DOM_ITM_GRP_ATTR_SEQ = new boolean[] {false} ;
      P004I3_A376TBM37_DOM_ITM_GRP_OID = new String[] {""} ;
      P004I3_n376TBM37_DOM_ITM_GRP_OID = new boolean[] {false} ;
      P004I3_A375TBM37_DOM_VAR_NM = new String[] {""} ;
      P004I3_n375TBM37_DOM_VAR_NM = new boolean[] {false} ;
      P004I3_A374TBM37_DOM_CD = new String[] {""} ;
      P004I3_n374TBM37_DOM_CD = new boolean[] {false} ;
      P004I3_A373TBM37_VISIT_NO = new short[1] ;
      P004I3_n373TBM37_VISIT_NO = new boolean[] {false} ;
      P004I3_A372TBM37_CRF_ITEM_GRP_DIV = new String[] {""} ;
      A273TBM37_CRF_ITEM_GRP_CD = "" ;
      A274TBM37_DEL_FLG = "" ;
      A376TBM37_DOM_ITM_GRP_OID = "" ;
      A375TBM37_DOM_VAR_NM = "" ;
      A374TBM37_DOM_CD = "" ;
      A372TBM37_CRF_ITEM_GRP_DIV = "" ;
      GXt_char35 = "" ;
      GXv_char36 = new String [1] ;
      GXt_char33 = "" ;
      GXv_char34 = new String [1] ;
      P004I4_A259TBM41_STUDY_ID = new long[1] ;
      P004I4_A260TBM41_CRF_ID = new short[1] ;
      P004I4_A261TBM41_CRF_ITEM_GRP_CD = new String[] {""} ;
      P004I4_A263TBM41_DEL_FLG = new String[] {""} ;
      P004I4_n263TBM41_DEL_FLG = new boolean[] {false} ;
      P004I4_A262TBM41_NCM_METADATA_ID = new String[] {""} ;
      P004I4_n262TBM41_NCM_METADATA_ID = new boolean[] {false} ;
      P004I4_A378TBM41_CRF_ITEM_GRP_DIV = new String[] {""} ;
      A261TBM41_CRF_ITEM_GRP_CD = "" ;
      A263TBM41_DEL_FLG = "" ;
      A262TBM41_NCM_METADATA_ID = "" ;
      A378TBM41_CRF_ITEM_GRP_DIV = "" ;
      GXt_char37 = "" ;
      GXv_char38 = new String [1] ;
      P004I5_A435TBM25_STUDY_ID = new long[1] ;
      P004I5_A436TBM25_LIST_CD = new String[] {""} ;
      P004I5_A438TBM25_DEL_FLG = new String[] {""} ;
      P004I5_n438TBM25_DEL_FLG = new boolean[] {false} ;
      P004I5_A437TBM25_LIST_NM = new String[] {""} ;
      P004I5_n437TBM25_LIST_NM = new boolean[] {false} ;
      A436TBM25_LIST_CD = "" ;
      A438TBM25_DEL_FLG = "" ;
      A437TBM25_LIST_NM = "" ;
      GXt_char39 = "" ;
      AV22W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV14W_MSG = "" ;
      AV30Pgmname = "" ;
      GXv_SdtB808_SD01_EXTRA_INFO41 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int42 = new short [1] ;
      GXv_char40 = new String [1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b599_pc26_join_crf_res__default(),
         new Object[] {
             new Object[] {
            P004I2_A402TBM32_LIST_CD, P004I2_n402TBM32_LIST_CD, P004I2_A233TBM32_CRF_ITEM_CD, P004I2_A232TBM32_CRF_ID, P004I2_A231TBM32_STUDY_ID, P004I2_A238TBM32_DEL_FLG, P004I2_n238TBM32_DEL_FLG, P004I2_A747TBM32_REF_CRF_ITEM_CD, P004I2_n747TBM32_REF_CRF_ITEM_CD, P004I2_A746TBM32_REF_CRF_ID,
            P004I2_n746TBM32_REF_CRF_ID, P004I2_A237TBM32_CRF_ITEM_NOTE, P004I2_n237TBM32_CRF_ITEM_NOTE, P004I2_A609TBM32_MAX_VALUE, P004I2_n609TBM32_MAX_VALUE, P004I2_A608TBM32_MIN_VALUE, P004I2_n608TBM32_MIN_VALUE, P004I2_A607TBM32_REQUIRED_INPUT_FLG, P004I2_n607TBM32_REQUIRED_INPUT_FLG, P004I2_A606TBM32_TABSTOP_FLG,
            P004I2_n606TBM32_TABSTOP_FLG, P004I2_A605TBM32_TAB_ORDER, P004I2_n605TBM32_TAB_ORDER, P004I2_A553TBM32_ZORDER, P004I2_n553TBM32_ZORDER, P004I2_A552TBM32_AUTH_LVL_MIN, P004I2_n552TBM32_AUTH_LVL_MIN, P004I2_A604TBM32_LINE_ANGLE, P004I2_n604TBM32_LINE_ANGLE, P004I2_A397TBM32_LINE_END_POINT_DIV,
            P004I2_n397TBM32_LINE_END_POINT_DIV, P004I2_A396TBM32_LINE_START_POINT_DIV, P004I2_n396TBM32_LINE_START_POINT_DIV, P004I2_A603TBM32_LINE_COLOR_DIV, P004I2_n603TBM32_LINE_COLOR_DIV, P004I2_A398TBM32_LINE_SIZE_DIV, P004I2_n398TBM32_LINE_SIZE_DIV, P004I2_A392TBM32_FONT_COLOR_DIV, P004I2_n392TBM32_FONT_COLOR_DIV, P004I2_A391TBM32_FONT_UL_FLG,
            P004I2_n391TBM32_FONT_UL_FLG, P004I2_A390TBM32_FONT_SIZE, P004I2_n390TBM32_FONT_SIZE, P004I2_A401TBM32_TEXT, P004I2_n401TBM32_TEXT, P004I2_A403TBM32_IMAGE_CD, P004I2_n403TBM32_IMAGE_CD, P004I2_A404TBM32_FIXED_VALUE, P004I2_n404TBM32_FIXED_VALUE, P004I2_A400TBM32_CHK_FALSE_INNER_VALUE,
            P004I2_n400TBM32_CHK_FALSE_INNER_VALUE, P004I2_A399TBM32_CHK_TRUE_INNER_VALUE, P004I2_n399TBM32_CHK_TRUE_INNER_VALUE, P004I2_A395TBM32_DECIMAL_DIGITS, P004I2_n395TBM32_DECIMAL_DIGITS, P004I2_A394TBM32_TEXT_MAXLENGTH, P004I2_n394TBM32_TEXT_MAXLENGTH, P004I2_A393TBM32_TEXT_MAXROWS, P004I2_n393TBM32_TEXT_MAXROWS, P004I2_A389TBM32_TEXT_ALIGN_DIV,
            P004I2_n389TBM32_TEXT_ALIGN_DIV, P004I2_A388TBM32_LOCATION_Y2, P004I2_n388TBM32_LOCATION_Y2, P004I2_A387TBM32_LOCATION_X2, P004I2_n387TBM32_LOCATION_X2, P004I2_A386TBM32_LOCATION_Y, P004I2_n386TBM32_LOCATION_Y, P004I2_A385TBM32_LOCATION_X, P004I2_n385TBM32_LOCATION_X, P004I2_A384TBM32_CRF_ITEM_GRP_ORDER,
            P004I2_n384TBM32_CRF_ITEM_GRP_ORDER, P004I2_A236TBM32_CRF_ITEM_GRP_CD, P004I2_n236TBM32_CRF_ITEM_GRP_CD, P004I2_A235TBM32_CRF_ITEM_DIV, P004I2_n235TBM32_CRF_ITEM_DIV, P004I2_A234TBM32_CRF_ITEM_NM, P004I2_n234TBM32_CRF_ITEM_NM
            }
            , new Object[] {
            P004I3_A271TBM37_STUDY_ID, P004I3_A272TBM37_CRF_ID, P004I3_A273TBM37_CRF_ITEM_GRP_CD, P004I3_A274TBM37_DEL_FLG, P004I3_n274TBM37_DEL_FLG, P004I3_A612TBM37_DOM_ITM_GRP_ROWNO, P004I3_n612TBM37_DOM_ITM_GRP_ROWNO, P004I3_A377TBM37_DOM_ITM_GRP_ATTR_SEQ, P004I3_n377TBM37_DOM_ITM_GRP_ATTR_SEQ, P004I3_A376TBM37_DOM_ITM_GRP_OID,
            P004I3_n376TBM37_DOM_ITM_GRP_OID, P004I3_A375TBM37_DOM_VAR_NM, P004I3_n375TBM37_DOM_VAR_NM, P004I3_A374TBM37_DOM_CD, P004I3_n374TBM37_DOM_CD, P004I3_A373TBM37_VISIT_NO, P004I3_n373TBM37_VISIT_NO, P004I3_A372TBM37_CRF_ITEM_GRP_DIV
            }
            , new Object[] {
            P004I4_A259TBM41_STUDY_ID, P004I4_A260TBM41_CRF_ID, P004I4_A261TBM41_CRF_ITEM_GRP_CD, P004I4_A263TBM41_DEL_FLG, P004I4_n263TBM41_DEL_FLG, P004I4_A262TBM41_NCM_METADATA_ID, P004I4_n262TBM41_NCM_METADATA_ID, P004I4_A378TBM41_CRF_ITEM_GRP_DIV
            }
            , new Object[] {
            P004I5_A435TBM25_STUDY_ID, P004I5_A436TBM25_LIST_CD, P004I5_A438TBM25_DEL_FLG, P004I5_n438TBM25_DEL_FLG, P004I5_A437TBM25_LIST_NM, P004I5_n437TBM25_LIST_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV30Pgmname = "B599_PC26_JOIN_CRF_RES" ;
      /* GeneXus formulas. */
      AV30Pgmname = "B599_PC26_JOIN_CRF_RES" ;
      Gx_err = (short)(0) ;
   }

   private byte AV26GXLvl41 ;
   private byte A552TBM32_AUTH_LVL_MIN ;
   private byte A398TBM32_LINE_SIZE_DIV ;
   private byte A390TBM32_FONT_SIZE ;
   private byte A395TBM32_DECIMAL_DIGITS ;
   private byte A393TBM32_TEXT_MAXROWS ;
   private byte AV27GXLvl88 ;
   private byte AV28GXLvl110 ;
   private short AV15W_RTN_CD ;
   private short AV13W_CRF_ID ;
   private short A232TBM32_CRF_ID ;
   private short A746TBM32_REF_CRF_ID ;
   private short A605TBM32_TAB_ORDER ;
   private short A553TBM32_ZORDER ;
   private short A604TBM32_LINE_ANGLE ;
   private short A394TBM32_TEXT_MAXLENGTH ;
   private short A388TBM32_LOCATION_Y2 ;
   private short A387TBM32_LOCATION_X2 ;
   private short A386TBM32_LOCATION_Y ;
   private short A385TBM32_LOCATION_X ;
   private short A384TBM32_CRF_ITEM_GRP_ORDER ;
   private short A272TBM37_CRF_ID ;
   private short A612TBM37_DOM_ITM_GRP_ROWNO ;
   private short A377TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private short A373TBM37_VISIT_NO ;
   private short AV12W_CNT ;
   private short A260TBM41_CRF_ID ;
   private short GXv_int42[] ;
   private short Gx_err ;
   private int GXActiveErrHndl ;
   private long AV19W_STUDY_ID ;
   private long A231TBM32_STUDY_ID ;
   private long A603TBM32_LINE_COLOR_DIV ;
   private long A392TBM32_FONT_COLOR_DIV ;
   private long A271TBM37_STUDY_ID ;
   private long A259TBM41_STUDY_ID ;
   private long A435TBM25_STUDY_ID ;
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
   private String GXt_char35 ;
   private String GXv_char36[] ;
   private String GXt_char33 ;
   private String GXv_char34[] ;
   private String GXt_char37 ;
   private String GXv_char38[] ;
   private String GXt_char39 ;
   private String AV30Pgmname ;
   private String GXv_char40[] ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private boolean n402TBM32_LIST_CD ;
   private boolean n238TBM32_DEL_FLG ;
   private boolean n747TBM32_REF_CRF_ITEM_CD ;
   private boolean n746TBM32_REF_CRF_ID ;
   private boolean n237TBM32_CRF_ITEM_NOTE ;
   private boolean n609TBM32_MAX_VALUE ;
   private boolean n608TBM32_MIN_VALUE ;
   private boolean n607TBM32_REQUIRED_INPUT_FLG ;
   private boolean n606TBM32_TABSTOP_FLG ;
   private boolean n605TBM32_TAB_ORDER ;
   private boolean n553TBM32_ZORDER ;
   private boolean n552TBM32_AUTH_LVL_MIN ;
   private boolean n604TBM32_LINE_ANGLE ;
   private boolean n397TBM32_LINE_END_POINT_DIV ;
   private boolean n396TBM32_LINE_START_POINT_DIV ;
   private boolean n603TBM32_LINE_COLOR_DIV ;
   private boolean n398TBM32_LINE_SIZE_DIV ;
   private boolean n392TBM32_FONT_COLOR_DIV ;
   private boolean n391TBM32_FONT_UL_FLG ;
   private boolean n390TBM32_FONT_SIZE ;
   private boolean n401TBM32_TEXT ;
   private boolean n403TBM32_IMAGE_CD ;
   private boolean n404TBM32_FIXED_VALUE ;
   private boolean n400TBM32_CHK_FALSE_INNER_VALUE ;
   private boolean n399TBM32_CHK_TRUE_INNER_VALUE ;
   private boolean n395TBM32_DECIMAL_DIGITS ;
   private boolean n394TBM32_TEXT_MAXLENGTH ;
   private boolean n393TBM32_TEXT_MAXROWS ;
   private boolean n389TBM32_TEXT_ALIGN_DIV ;
   private boolean n388TBM32_LOCATION_Y2 ;
   private boolean n387TBM32_LOCATION_X2 ;
   private boolean n386TBM32_LOCATION_Y ;
   private boolean n385TBM32_LOCATION_X ;
   private boolean n384TBM32_CRF_ITEM_GRP_ORDER ;
   private boolean n236TBM32_CRF_ITEM_GRP_CD ;
   private boolean n235TBM32_CRF_ITEM_DIV ;
   private boolean n234TBM32_CRF_ITEM_NM ;
   private boolean n274TBM37_DEL_FLG ;
   private boolean n612TBM37_DOM_ITM_GRP_ROWNO ;
   private boolean n377TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private boolean n376TBM37_DOM_ITM_GRP_OID ;
   private boolean n375TBM37_DOM_VAR_NM ;
   private boolean n374TBM37_DOM_CD ;
   private boolean n373TBM37_VISIT_NO ;
   private boolean n263TBM41_DEL_FLG ;
   private boolean n262TBM41_NCM_METADATA_ID ;
   private boolean n438TBM25_DEL_FLG ;
   private boolean n437TBM25_LIST_NM ;
   private String AV11P_STUDY_ID ;
   private String AV9P_CRF_ID ;
   private String AV10P_CRF_ITEM_CD ;
   private String AV17W_RTN_MSG ;
   private String AV20C_APP_ID ;
   private String A233TBM32_CRF_ITEM_CD ;
   private String A238TBM32_DEL_FLG ;
   private String A402TBM32_LIST_CD ;
   private String A747TBM32_REF_CRF_ITEM_CD ;
   private String A237TBM32_CRF_ITEM_NOTE ;
   private String A609TBM32_MAX_VALUE ;
   private String A608TBM32_MIN_VALUE ;
   private String A607TBM32_REQUIRED_INPUT_FLG ;
   private String A606TBM32_TABSTOP_FLG ;
   private String A397TBM32_LINE_END_POINT_DIV ;
   private String A396TBM32_LINE_START_POINT_DIV ;
   private String A391TBM32_FONT_UL_FLG ;
   private String A401TBM32_TEXT ;
   private String A403TBM32_IMAGE_CD ;
   private String A404TBM32_FIXED_VALUE ;
   private String A400TBM32_CHK_FALSE_INNER_VALUE ;
   private String A399TBM32_CHK_TRUE_INNER_VALUE ;
   private String A389TBM32_TEXT_ALIGN_DIV ;
   private String A236TBM32_CRF_ITEM_GRP_CD ;
   private String A235TBM32_CRF_ITEM_DIV ;
   private String A234TBM32_CRF_ITEM_NM ;
   private String AV18W_STR ;
   private String A273TBM37_CRF_ITEM_GRP_CD ;
   private String A274TBM37_DEL_FLG ;
   private String A376TBM37_DOM_ITM_GRP_OID ;
   private String A375TBM37_DOM_VAR_NM ;
   private String A374TBM37_DOM_CD ;
   private String A372TBM37_CRF_ITEM_GRP_DIV ;
   private String A261TBM41_CRF_ITEM_GRP_CD ;
   private String A263TBM41_DEL_FLG ;
   private String A262TBM41_NCM_METADATA_ID ;
   private String A378TBM41_CRF_ITEM_GRP_DIV ;
   private String A436TBM25_LIST_CD ;
   private String A438TBM25_DEL_FLG ;
   private String A437TBM25_LIST_NM ;
   private String AV14W_MSG ;
   private GxObjectCollection[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P004I2_A402TBM32_LIST_CD ;
   private boolean[] P004I2_n402TBM32_LIST_CD ;
   private String[] P004I2_A233TBM32_CRF_ITEM_CD ;
   private short[] P004I2_A232TBM32_CRF_ID ;
   private long[] P004I2_A231TBM32_STUDY_ID ;
   private String[] P004I2_A238TBM32_DEL_FLG ;
   private boolean[] P004I2_n238TBM32_DEL_FLG ;
   private String[] P004I2_A747TBM32_REF_CRF_ITEM_CD ;
   private boolean[] P004I2_n747TBM32_REF_CRF_ITEM_CD ;
   private short[] P004I2_A746TBM32_REF_CRF_ID ;
   private boolean[] P004I2_n746TBM32_REF_CRF_ID ;
   private String[] P004I2_A237TBM32_CRF_ITEM_NOTE ;
   private boolean[] P004I2_n237TBM32_CRF_ITEM_NOTE ;
   private String[] P004I2_A609TBM32_MAX_VALUE ;
   private boolean[] P004I2_n609TBM32_MAX_VALUE ;
   private String[] P004I2_A608TBM32_MIN_VALUE ;
   private boolean[] P004I2_n608TBM32_MIN_VALUE ;
   private String[] P004I2_A607TBM32_REQUIRED_INPUT_FLG ;
   private boolean[] P004I2_n607TBM32_REQUIRED_INPUT_FLG ;
   private String[] P004I2_A606TBM32_TABSTOP_FLG ;
   private boolean[] P004I2_n606TBM32_TABSTOP_FLG ;
   private short[] P004I2_A605TBM32_TAB_ORDER ;
   private boolean[] P004I2_n605TBM32_TAB_ORDER ;
   private short[] P004I2_A553TBM32_ZORDER ;
   private boolean[] P004I2_n553TBM32_ZORDER ;
   private byte[] P004I2_A552TBM32_AUTH_LVL_MIN ;
   private boolean[] P004I2_n552TBM32_AUTH_LVL_MIN ;
   private short[] P004I2_A604TBM32_LINE_ANGLE ;
   private boolean[] P004I2_n604TBM32_LINE_ANGLE ;
   private String[] P004I2_A397TBM32_LINE_END_POINT_DIV ;
   private boolean[] P004I2_n397TBM32_LINE_END_POINT_DIV ;
   private String[] P004I2_A396TBM32_LINE_START_POINT_DIV ;
   private boolean[] P004I2_n396TBM32_LINE_START_POINT_DIV ;
   private long[] P004I2_A603TBM32_LINE_COLOR_DIV ;
   private boolean[] P004I2_n603TBM32_LINE_COLOR_DIV ;
   private byte[] P004I2_A398TBM32_LINE_SIZE_DIV ;
   private boolean[] P004I2_n398TBM32_LINE_SIZE_DIV ;
   private long[] P004I2_A392TBM32_FONT_COLOR_DIV ;
   private boolean[] P004I2_n392TBM32_FONT_COLOR_DIV ;
   private String[] P004I2_A391TBM32_FONT_UL_FLG ;
   private boolean[] P004I2_n391TBM32_FONT_UL_FLG ;
   private byte[] P004I2_A390TBM32_FONT_SIZE ;
   private boolean[] P004I2_n390TBM32_FONT_SIZE ;
   private String[] P004I2_A401TBM32_TEXT ;
   private boolean[] P004I2_n401TBM32_TEXT ;
   private String[] P004I2_A403TBM32_IMAGE_CD ;
   private boolean[] P004I2_n403TBM32_IMAGE_CD ;
   private String[] P004I2_A404TBM32_FIXED_VALUE ;
   private boolean[] P004I2_n404TBM32_FIXED_VALUE ;
   private String[] P004I2_A400TBM32_CHK_FALSE_INNER_VALUE ;
   private boolean[] P004I2_n400TBM32_CHK_FALSE_INNER_VALUE ;
   private String[] P004I2_A399TBM32_CHK_TRUE_INNER_VALUE ;
   private boolean[] P004I2_n399TBM32_CHK_TRUE_INNER_VALUE ;
   private byte[] P004I2_A395TBM32_DECIMAL_DIGITS ;
   private boolean[] P004I2_n395TBM32_DECIMAL_DIGITS ;
   private short[] P004I2_A394TBM32_TEXT_MAXLENGTH ;
   private boolean[] P004I2_n394TBM32_TEXT_MAXLENGTH ;
   private byte[] P004I2_A393TBM32_TEXT_MAXROWS ;
   private boolean[] P004I2_n393TBM32_TEXT_MAXROWS ;
   private String[] P004I2_A389TBM32_TEXT_ALIGN_DIV ;
   private boolean[] P004I2_n389TBM32_TEXT_ALIGN_DIV ;
   private short[] P004I2_A388TBM32_LOCATION_Y2 ;
   private boolean[] P004I2_n388TBM32_LOCATION_Y2 ;
   private short[] P004I2_A387TBM32_LOCATION_X2 ;
   private boolean[] P004I2_n387TBM32_LOCATION_X2 ;
   private short[] P004I2_A386TBM32_LOCATION_Y ;
   private boolean[] P004I2_n386TBM32_LOCATION_Y ;
   private short[] P004I2_A385TBM32_LOCATION_X ;
   private boolean[] P004I2_n385TBM32_LOCATION_X ;
   private short[] P004I2_A384TBM32_CRF_ITEM_GRP_ORDER ;
   private boolean[] P004I2_n384TBM32_CRF_ITEM_GRP_ORDER ;
   private String[] P004I2_A236TBM32_CRF_ITEM_GRP_CD ;
   private boolean[] P004I2_n236TBM32_CRF_ITEM_GRP_CD ;
   private String[] P004I2_A235TBM32_CRF_ITEM_DIV ;
   private boolean[] P004I2_n235TBM32_CRF_ITEM_DIV ;
   private String[] P004I2_A234TBM32_CRF_ITEM_NM ;
   private boolean[] P004I2_n234TBM32_CRF_ITEM_NM ;
   private long[] P004I3_A271TBM37_STUDY_ID ;
   private short[] P004I3_A272TBM37_CRF_ID ;
   private String[] P004I3_A273TBM37_CRF_ITEM_GRP_CD ;
   private String[] P004I3_A274TBM37_DEL_FLG ;
   private boolean[] P004I3_n274TBM37_DEL_FLG ;
   private short[] P004I3_A612TBM37_DOM_ITM_GRP_ROWNO ;
   private boolean[] P004I3_n612TBM37_DOM_ITM_GRP_ROWNO ;
   private short[] P004I3_A377TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private boolean[] P004I3_n377TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private String[] P004I3_A376TBM37_DOM_ITM_GRP_OID ;
   private boolean[] P004I3_n376TBM37_DOM_ITM_GRP_OID ;
   private String[] P004I3_A375TBM37_DOM_VAR_NM ;
   private boolean[] P004I3_n375TBM37_DOM_VAR_NM ;
   private String[] P004I3_A374TBM37_DOM_CD ;
   private boolean[] P004I3_n374TBM37_DOM_CD ;
   private short[] P004I3_A373TBM37_VISIT_NO ;
   private boolean[] P004I3_n373TBM37_VISIT_NO ;
   private String[] P004I3_A372TBM37_CRF_ITEM_GRP_DIV ;
   private long[] P004I4_A259TBM41_STUDY_ID ;
   private short[] P004I4_A260TBM41_CRF_ID ;
   private String[] P004I4_A261TBM41_CRF_ITEM_GRP_CD ;
   private String[] P004I4_A263TBM41_DEL_FLG ;
   private boolean[] P004I4_n263TBM41_DEL_FLG ;
   private String[] P004I4_A262TBM41_NCM_METADATA_ID ;
   private boolean[] P004I4_n262TBM41_NCM_METADATA_ID ;
   private String[] P004I4_A378TBM41_CRF_ITEM_GRP_DIV ;
   private long[] P004I5_A435TBM25_STUDY_ID ;
   private String[] P004I5_A436TBM25_LIST_CD ;
   private String[] P004I5_A438TBM25_DEL_FLG ;
   private boolean[] P004I5_n438TBM25_DEL_FLG ;
   private String[] P004I5_A437TBM25_LIST_NM ;
   private boolean[] P004I5_n437TBM25_LIST_NM ;
   private GxObjectCollection AV16W_RTN_CSV ;
   private SdtB808_SD01_EXTRA_INFO AV21W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO41[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV22W_PARMS_ITEM ;
}

final  class b599_pc26_join_crf_res__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P004I2( com.genexus.internet.HttpContext httpContext ,
                                          String AV10P_CRF_ITEM_CD ,
                                          String A233TBM32_CRF_ITEM_CD ,
                                          String A238TBM32_DEL_FLG ,
                                          long AV19W_STUDY_ID ,
                                          short AV13W_CRF_ID ,
                                          long A231TBM32_STUDY_ID ,
                                          short A232TBM32_CRF_ID )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int43 ;
      GXv_int43 = new byte [3] ;
      Object[] GXv_Object44 ;
      GXv_Object44 = new Object [2] ;
      Gx_ope = "Declare" ;
      Gx_etb = "TBM32_CRF_ITEM" ;
      scmdbuf = "SELECT `TBM32_LIST_CD`, `TBM32_CRF_ITEM_CD`, `TBM32_CRF_ID`, `TBM32_STUDY_ID`, `TBM32_DEL_FLG`," ;
      scmdbuf = scmdbuf + " `TBM32_REF_CRF_ITEM_CD`, `TBM32_REF_CRF_ID`, `TBM32_CRF_ITEM_NOTE`, `TBM32_MAX_VALUE`," ;
      scmdbuf = scmdbuf + " `TBM32_MIN_VALUE`, `TBM32_REQUIRED_INPUT_FLG`, `TBM32_TABSTOP_FLG`, `TBM32_TAB_ORDER`," ;
      scmdbuf = scmdbuf + " `TBM32_ZORDER`, `TBM32_AUTH_LVL_MIN`, `TBM32_LINE_ANGLE`, `TBM32_LINE_END_POINT_DIV`," ;
      scmdbuf = scmdbuf + " `TBM32_LINE_START_POINT_DIV`, `TBM32_LINE_COLOR_DIV`, `TBM32_LINE_SIZE_DIV`, `TBM32_FONT_COLOR_DIV`," ;
      scmdbuf = scmdbuf + " `TBM32_FONT_UL_FLG`, `TBM32_FONT_SIZE`, `TBM32_TEXT`, `TBM32_IMAGE_CD`, `TBM32_FIXED_VALUE`," ;
      scmdbuf = scmdbuf + " `TBM32_CHK_FALSE_INNER_VALUE`, `TBM32_CHK_TRUE_INNER_VALUE`, `TBM32_DECIMAL_DIGITS`," ;
      scmdbuf = scmdbuf + " `TBM32_TEXT_MAXLENGTH`, `TBM32_TEXT_MAXROWS`, `TBM32_TEXT_ALIGN_DIV`, `TBM32_LOCATION_Y2`," ;
      scmdbuf = scmdbuf + " `TBM32_LOCATION_X2`, `TBM32_LOCATION_Y`, `TBM32_LOCATION_X`, `TBM32_CRF_ITEM_GRP_ORDER`," ;
      scmdbuf = scmdbuf + " `TBM32_CRF_ITEM_GRP_CD`, `TBM32_CRF_ITEM_DIV`, `TBM32_CRF_ITEM_NM` FROM `TBM32_CRF_ITEM`" ;
      scmdbuf = scmdbuf + " WHERE (`TBM32_STUDY_ID` = ? and `TBM32_CRF_ID` = ?)" ;
      scmdbuf = scmdbuf + " and (`TBM32_DEL_FLG` = '0')" ;
      if ( ! (GXutil.strcmp("", AV10P_CRF_ITEM_CD)==0) )
      {
         sWhereString = sWhereString + " and (`TBM32_CRF_ITEM_CD` = ?)" ;
      }
      else
      {
         GXv_int43[2] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TBM32_STUDY_ID`, `TBM32_CRF_ID`, `TBM32_CRF_ITEM_CD`" ;
      GXv_Object44[0] = scmdbuf ;
      GXv_Object44[1] = GXv_int43 ;
      return GXv_Object44 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         com.genexus.internet.HttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_P004I2(httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).longValue() , ((Number) dynConstraints[4]).shortValue() , ((Number) dynConstraints[5]).longValue() , ((Number) dynConstraints[6]).shortValue() );
      }
      return super.getDynamicStatement(cursor, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P004I2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
         ,new ForEachCursor("P004I3", "SELECT `TBM37_STUDY_ID`, `TBM37_CRF_ID`, `TBM37_CRF_ITEM_GRP_CD`, `TBM37_DEL_FLG`, `TBM37_DOM_ITM_GRP_ROWNO`, `TBM37_DOM_ITM_GRP_ATTR_SEQ`, `TBM37_DOM_ITM_GRP_OID`, `TBM37_DOM_VAR_NM`, `TBM37_DOM_CD`, `TBM37_VISIT_NO`, `TBM37_CRF_ITEM_GRP_DIV` FROM `TBM37_CRF_DOM_MAP` WHERE (`TBM37_STUDY_ID` = ? and `TBM37_CRF_ID` = ?) AND (`TBM37_CRF_ITEM_GRP_CD` = ?) AND (`TBM37_DEL_FLG` = '0') ORDER BY `TBM37_STUDY_ID`, `TBM37_CRF_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P004I4", "SELECT `TBM41_STUDY_ID`, `TBM41_CRF_ID`, `TBM41_CRF_ITEM_GRP_CD`, `TBM41_DEL_FLG`, `TBM41_NCM_METADATA_ID`, `TBM41_CRF_ITEM_GRP_DIV` FROM `TBM41_CRF_NCM_MAP` WHERE (`TBM41_STUDY_ID` = ? and `TBM41_CRF_ID` = ?) AND (`TBM41_CRF_ITEM_GRP_CD` = ?) AND (`TBM41_DEL_FLG` = '0') ORDER BY `TBM41_STUDY_ID`, `TBM41_CRF_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P004I5", "SELECT `TBM25_STUDY_ID`, `TBM25_LIST_CD`, `TBM25_DEL_FLG`, `TBM25_LIST_NM` FROM `TBM25_SEL_LIST` WHERE (`TBM25_STUDY_ID` = ? and `TBM25_LIST_CD` = ?) AND (`TBM25_DEL_FLG` = '0') ORDER BY `TBM25_STUDY_ID`, `TBM25_LIST_CD`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(13) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(14) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((byte[]) buf[25])[0] = rslt.getByte(15) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(16) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((long[]) buf[33])[0] = rslt.getLong(19) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((byte[]) buf[35])[0] = rslt.getByte(20) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((long[]) buf[37])[0] = rslt.getLong(21) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((byte[]) buf[41])[0] = rslt.getByte(23) ;
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getVarchar(27) ;
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getVarchar(28) ;
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((byte[]) buf[53])[0] = rslt.getByte(29) ;
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((short[]) buf[55])[0] = rslt.getShort(30) ;
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((byte[]) buf[57])[0] = rslt.getByte(31) ;
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getVarchar(32) ;
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((short[]) buf[61])[0] = rslt.getShort(33) ;
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((short[]) buf[63])[0] = rslt.getShort(34) ;
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((short[]) buf[65])[0] = rslt.getShort(35) ;
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((short[]) buf[67])[0] = rslt.getShort(36) ;
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((short[]) buf[69])[0] = rslt.getShort(37) ;
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((String[]) buf[71])[0] = rslt.getVarchar(38) ;
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((String[]) buf[73])[0] = rslt.getVarchar(39) ;
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((String[]) buf[75])[0] = rslt.getVarchar(40) ;
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               break;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(11) ;
               break;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               break;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               break;
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
               break;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 50);
               break;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 50);
               break;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[2], 20);
               }
               break;
      }
   }

}

