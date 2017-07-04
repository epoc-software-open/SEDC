/*
               File: B402_PC20_CRF_COPY
        Description: CRFéQè∆çÏê¨
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:56:19.55
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b402_pc20_crf_copy extends GXProcedure
{
   public b402_pc20_crf_copy( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b402_pc20_crf_copy.class ), "" );
   }

   public b402_pc20_crf_copy( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( long aP0 ,
                             short aP1 ,
                             long aP2 ,
                             short aP3 ,
                             short[] aP4 )
   {
      b402_pc20_crf_copy.this.AV20P_STUDY_ID = aP0;
      b402_pc20_crf_copy.this.AV19P_CRF_ID = aP1;
      b402_pc20_crf_copy.this.AV18P_BASE_STUDY_ID = aP2;
      b402_pc20_crf_copy.this.AV17P_BASE_CRF_ID = aP3;
      b402_pc20_crf_copy.this.aP5 = new String[] {""};
      initialize();
      privateExecute();
      return aP5[0];
   }

   public void execute( long aP0 ,
                        short aP1 ,
                        long aP2 ,
                        short aP3 ,
                        short[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( long aP0 ,
                             short aP1 ,
                             long aP2 ,
                             short aP3 ,
                             short[] aP4 ,
                             String[] aP5 )
   {
      b402_pc20_crf_copy.this.AV20P_STUDY_ID = aP0;
      b402_pc20_crf_copy.this.AV19P_CRF_ID = aP1;
      b402_pc20_crf_copy.this.AV18P_BASE_STUDY_ID = aP2;
      b402_pc20_crf_copy.this.AV17P_BASE_CRF_ID = aP3;
      b402_pc20_crf_copy.this.aP4 = aP4;
      b402_pc20_crf_copy.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16C_TAM02_APP_ID = "B402" ;
      /* Execute user subroutine: S1140 */
      S1140 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV39W_RTN_CD = (short)(0) ;
      AV40W_RTN_MSG = "" ;
      /* Execute user subroutine: S1373 */
      S1373 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: S14282 */
      S14282 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      Application.commit(context, remoteHandle, "DEFAULT", "b402_pc20_crf_copy");
      cleanup();
   }

   public void S1140( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT1[0] = AV35W_A_LOGIN_SDT;
      GXv_char2[0] = AV36W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT1, GXv_char2) ;
      AV35W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT1[0] ;
      b402_pc20_crf_copy.this.AV36W_ERRCD = GXv_char2[0] ;
      if ( GXutil.strcmp(AV36W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("1")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void S1258( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV43Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      returnInSub = true;
      if (true) return;
   }

   public void S1373( )
   {
      /* 'SUB_CRF_SELECT' Routine */
      AV46GXLvl76 = (byte)(0) ;
      /* Using cursor P00532 */
      pr_default.execute(0, new Object[] {new Long(AV18P_BASE_STUDY_ID), new Short(AV17P_BASE_CRF_ID)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A223TBM31_DEL_FLG = P00532_A223TBM31_DEL_FLG[0] ;
         n223TBM31_DEL_FLG = P00532_n223TBM31_DEL_FLG[0] ;
         A218TBM31_CRF_ID = P00532_A218TBM31_CRF_ID[0] ;
         A217TBM31_STUDY_ID = P00532_A217TBM31_STUDY_ID[0] ;
         A405TBM31_DEF_VISIT_NO = P00532_A405TBM31_DEF_VISIT_NO[0] ;
         n405TBM31_DEF_VISIT_NO = P00532_n405TBM31_DEF_VISIT_NO[0] ;
         A406TBM31_DEF_DOMAIN_CD = P00532_A406TBM31_DEF_DOMAIN_CD[0] ;
         n406TBM31_DEF_DOMAIN_CD = P00532_n406TBM31_DEF_DOMAIN_CD[0] ;
         AV46GXLvl76 = (byte)(1) ;
         AV38W_TBM31_DEF_VISIT_NO = A405TBM31_DEF_VISIT_NO ;
         AV37W_TBM31_DEF_DOMAIN_CD = A406TBM31_DEF_DOMAIN_CD ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV46GXLvl76 == 0 )
      {
         AV39W_RTN_CD = (short)(9) ;
         GXt_char3 = AV40W_RTN_MSG ;
         GXv_char2[0] = GXt_char3 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AX00107", "", "", "", "", "", GXv_char2) ;
         b402_pc20_crf_copy.this.GXt_char3 = GXv_char2[0] ;
         AV40W_RTN_MSG = GXt_char3 ;
         returnInSub = true;
         if (true) return;
      }
      /* Using cursor P00533 */
      pr_default.execute(1, new Object[] {new Long(AV18P_BASE_STUDY_ID), new Short(AV17P_BASE_CRF_ID)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A238TBM32_DEL_FLG = P00533_A238TBM32_DEL_FLG[0] ;
         n238TBM32_DEL_FLG = P00533_n238TBM32_DEL_FLG[0] ;
         A232TBM32_CRF_ID = P00533_A232TBM32_CRF_ID[0] ;
         A231TBM32_STUDY_ID = P00533_A231TBM32_STUDY_ID[0] ;
         A234TBM32_CRF_ITEM_NM = P00533_A234TBM32_CRF_ITEM_NM[0] ;
         n234TBM32_CRF_ITEM_NM = P00533_n234TBM32_CRF_ITEM_NM[0] ;
         A235TBM32_CRF_ITEM_DIV = P00533_A235TBM32_CRF_ITEM_DIV[0] ;
         n235TBM32_CRF_ITEM_DIV = P00533_n235TBM32_CRF_ITEM_DIV[0] ;
         A236TBM32_CRF_ITEM_GRP_CD = P00533_A236TBM32_CRF_ITEM_GRP_CD[0] ;
         n236TBM32_CRF_ITEM_GRP_CD = P00533_n236TBM32_CRF_ITEM_GRP_CD[0] ;
         A384TBM32_CRF_ITEM_GRP_ORDER = P00533_A384TBM32_CRF_ITEM_GRP_ORDER[0] ;
         n384TBM32_CRF_ITEM_GRP_ORDER = P00533_n384TBM32_CRF_ITEM_GRP_ORDER[0] ;
         A385TBM32_LOCATION_X = P00533_A385TBM32_LOCATION_X[0] ;
         n385TBM32_LOCATION_X = P00533_n385TBM32_LOCATION_X[0] ;
         A386TBM32_LOCATION_Y = P00533_A386TBM32_LOCATION_Y[0] ;
         n386TBM32_LOCATION_Y = P00533_n386TBM32_LOCATION_Y[0] ;
         A387TBM32_LOCATION_X2 = P00533_A387TBM32_LOCATION_X2[0] ;
         n387TBM32_LOCATION_X2 = P00533_n387TBM32_LOCATION_X2[0] ;
         A388TBM32_LOCATION_Y2 = P00533_A388TBM32_LOCATION_Y2[0] ;
         n388TBM32_LOCATION_Y2 = P00533_n388TBM32_LOCATION_Y2[0] ;
         A389TBM32_TEXT_ALIGN_DIV = P00533_A389TBM32_TEXT_ALIGN_DIV[0] ;
         n389TBM32_TEXT_ALIGN_DIV = P00533_n389TBM32_TEXT_ALIGN_DIV[0] ;
         A393TBM32_TEXT_MAXROWS = P00533_A393TBM32_TEXT_MAXROWS[0] ;
         n393TBM32_TEXT_MAXROWS = P00533_n393TBM32_TEXT_MAXROWS[0] ;
         A394TBM32_TEXT_MAXLENGTH = P00533_A394TBM32_TEXT_MAXLENGTH[0] ;
         n394TBM32_TEXT_MAXLENGTH = P00533_n394TBM32_TEXT_MAXLENGTH[0] ;
         A395TBM32_DECIMAL_DIGITS = P00533_A395TBM32_DECIMAL_DIGITS[0] ;
         n395TBM32_DECIMAL_DIGITS = P00533_n395TBM32_DECIMAL_DIGITS[0] ;
         A399TBM32_CHK_TRUE_INNER_VALUE = P00533_A399TBM32_CHK_TRUE_INNER_VALUE[0] ;
         n399TBM32_CHK_TRUE_INNER_VALUE = P00533_n399TBM32_CHK_TRUE_INNER_VALUE[0] ;
         A400TBM32_CHK_FALSE_INNER_VALUE = P00533_A400TBM32_CHK_FALSE_INNER_VALUE[0] ;
         n400TBM32_CHK_FALSE_INNER_VALUE = P00533_n400TBM32_CHK_FALSE_INNER_VALUE[0] ;
         A404TBM32_FIXED_VALUE = P00533_A404TBM32_FIXED_VALUE[0] ;
         n404TBM32_FIXED_VALUE = P00533_n404TBM32_FIXED_VALUE[0] ;
         A402TBM32_LIST_CD = P00533_A402TBM32_LIST_CD[0] ;
         n402TBM32_LIST_CD = P00533_n402TBM32_LIST_CD[0] ;
         A403TBM32_IMAGE_CD = P00533_A403TBM32_IMAGE_CD[0] ;
         n403TBM32_IMAGE_CD = P00533_n403TBM32_IMAGE_CD[0] ;
         A401TBM32_TEXT = P00533_A401TBM32_TEXT[0] ;
         n401TBM32_TEXT = P00533_n401TBM32_TEXT[0] ;
         A390TBM32_FONT_SIZE = P00533_A390TBM32_FONT_SIZE[0] ;
         n390TBM32_FONT_SIZE = P00533_n390TBM32_FONT_SIZE[0] ;
         A391TBM32_FONT_UL_FLG = P00533_A391TBM32_FONT_UL_FLG[0] ;
         n391TBM32_FONT_UL_FLG = P00533_n391TBM32_FONT_UL_FLG[0] ;
         A392TBM32_FONT_COLOR_DIV = P00533_A392TBM32_FONT_COLOR_DIV[0] ;
         n392TBM32_FONT_COLOR_DIV = P00533_n392TBM32_FONT_COLOR_DIV[0] ;
         A398TBM32_LINE_SIZE_DIV = P00533_A398TBM32_LINE_SIZE_DIV[0] ;
         n398TBM32_LINE_SIZE_DIV = P00533_n398TBM32_LINE_SIZE_DIV[0] ;
         A603TBM32_LINE_COLOR_DIV = P00533_A603TBM32_LINE_COLOR_DIV[0] ;
         n603TBM32_LINE_COLOR_DIV = P00533_n603TBM32_LINE_COLOR_DIV[0] ;
         A396TBM32_LINE_START_POINT_DIV = P00533_A396TBM32_LINE_START_POINT_DIV[0] ;
         n396TBM32_LINE_START_POINT_DIV = P00533_n396TBM32_LINE_START_POINT_DIV[0] ;
         A397TBM32_LINE_END_POINT_DIV = P00533_A397TBM32_LINE_END_POINT_DIV[0] ;
         n397TBM32_LINE_END_POINT_DIV = P00533_n397TBM32_LINE_END_POINT_DIV[0] ;
         A604TBM32_LINE_ANGLE = P00533_A604TBM32_LINE_ANGLE[0] ;
         n604TBM32_LINE_ANGLE = P00533_n604TBM32_LINE_ANGLE[0] ;
         A552TBM32_AUTH_LVL_MIN = P00533_A552TBM32_AUTH_LVL_MIN[0] ;
         n552TBM32_AUTH_LVL_MIN = P00533_n552TBM32_AUTH_LVL_MIN[0] ;
         A553TBM32_ZORDER = P00533_A553TBM32_ZORDER[0] ;
         n553TBM32_ZORDER = P00533_n553TBM32_ZORDER[0] ;
         A605TBM32_TAB_ORDER = P00533_A605TBM32_TAB_ORDER[0] ;
         n605TBM32_TAB_ORDER = P00533_n605TBM32_TAB_ORDER[0] ;
         A606TBM32_TABSTOP_FLG = P00533_A606TBM32_TABSTOP_FLG[0] ;
         n606TBM32_TABSTOP_FLG = P00533_n606TBM32_TABSTOP_FLG[0] ;
         A607TBM32_REQUIRED_INPUT_FLG = P00533_A607TBM32_REQUIRED_INPUT_FLG[0] ;
         n607TBM32_REQUIRED_INPUT_FLG = P00533_n607TBM32_REQUIRED_INPUT_FLG[0] ;
         A608TBM32_MIN_VALUE = P00533_A608TBM32_MIN_VALUE[0] ;
         n608TBM32_MIN_VALUE = P00533_n608TBM32_MIN_VALUE[0] ;
         A609TBM32_MAX_VALUE = P00533_A609TBM32_MAX_VALUE[0] ;
         n609TBM32_MAX_VALUE = P00533_n609TBM32_MAX_VALUE[0] ;
         A237TBM32_CRF_ITEM_NOTE = P00533_A237TBM32_CRF_ITEM_NOTE[0] ;
         n237TBM32_CRF_ITEM_NOTE = P00533_n237TBM32_CRF_ITEM_NOTE[0] ;
         A746TBM32_REF_CRF_ID = P00533_A746TBM32_REF_CRF_ID[0] ;
         n746TBM32_REF_CRF_ID = P00533_n746TBM32_REF_CRF_ID[0] ;
         A747TBM32_REF_CRF_ITEM_CD = P00533_A747TBM32_REF_CRF_ITEM_CD[0] ;
         n747TBM32_REF_CRF_ITEM_CD = P00533_n747TBM32_REF_CRF_ITEM_CD[0] ;
         A233TBM32_CRF_ITEM_CD = P00533_A233TBM32_CRF_ITEM_CD[0] ;
         AV22SDT_TBM32_I = (SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem)new SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem(remoteHandle, context);
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_study_id( AV20P_STUDY_ID );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_id( AV19P_CRF_ID );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_cd( A233TBM32_CRF_ITEM_CD );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_nm( A234TBM32_CRF_ITEM_NM );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_div( A235TBM32_CRF_ITEM_DIV );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_grp_cd( A236TBM32_CRF_ITEM_GRP_CD );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_grp_order( A384TBM32_CRF_ITEM_GRP_ORDER );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_location_x( A385TBM32_LOCATION_X );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_location_y( A386TBM32_LOCATION_Y );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_location_x2( A387TBM32_LOCATION_X2 );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_location_y2( A388TBM32_LOCATION_Y2 );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_text_align_div( A389TBM32_TEXT_ALIGN_DIV );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_text_maxrows( A393TBM32_TEXT_MAXROWS );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_text_maxlength( A394TBM32_TEXT_MAXLENGTH );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_decimal_digits( A395TBM32_DECIMAL_DIGITS );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_chk_true_inner_value( A399TBM32_CHK_TRUE_INNER_VALUE );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_chk_false_inner_value( A400TBM32_CHK_FALSE_INNER_VALUE );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_fixed_value( A404TBM32_FIXED_VALUE );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_list_cd( A402TBM32_LIST_CD );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_image_cd( A403TBM32_IMAGE_CD );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_text( A401TBM32_TEXT );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_font_size( A390TBM32_FONT_SIZE );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_font_ul_flg( A391TBM32_FONT_UL_FLG );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_font_color_div( A392TBM32_FONT_COLOR_DIV );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_size_div( A398TBM32_LINE_SIZE_DIV );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_color_div( A603TBM32_LINE_COLOR_DIV );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_start_point_div( A396TBM32_LINE_START_POINT_DIV );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_end_point_div( A397TBM32_LINE_END_POINT_DIV );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_angle( A604TBM32_LINE_ANGLE );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_auth_lvl_min( A552TBM32_AUTH_LVL_MIN );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_zorder( A553TBM32_ZORDER );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_tab_order( A605TBM32_TAB_ORDER );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_tabstop_flg( A606TBM32_TABSTOP_FLG );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_required_input_flg( A607TBM32_REQUIRED_INPUT_FLG );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_min_value( A608TBM32_MIN_VALUE );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_max_value( A609TBM32_MAX_VALUE );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_note( A237TBM32_CRF_ITEM_NOTE );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_ref_crf_id( A746TBM32_REF_CRF_ID );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_ref_crf_item_cd( A747TBM32_REF_CRF_ITEM_CD );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_del_flg( A238TBM32_DEL_FLG );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crt_prog_nm( AV43Pgmname );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_prog_nm( AV43Pgmname );
         AV21SDT_TBM32_C.add(AV22SDT_TBM32_I, 0);
         pr_default.readNext(1);
      }
      pr_default.close(1);
      /* Using cursor P00534 */
      pr_default.execute(2, new Object[] {new Long(AV18P_BASE_STUDY_ID), new Short(AV17P_BASE_CRF_ID)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A251TBM33_DEL_FLG = P00534_A251TBM33_DEL_FLG[0] ;
         n251TBM33_DEL_FLG = P00534_n251TBM33_DEL_FLG[0] ;
         A247TBM33_CRF_ID = P00534_A247TBM33_CRF_ID[0] ;
         A246TBM33_STUDY_ID = P00534_A246TBM33_STUDY_ID[0] ;
         A379TBM33_COND_NM = P00534_A379TBM33_COND_NM[0] ;
         n379TBM33_COND_NM = P00534_n379TBM33_COND_NM[0] ;
         A249TBM33_EXPRESSION = P00534_A249TBM33_EXPRESSION[0] ;
         n249TBM33_EXPRESSION = P00534_n249TBM33_EXPRESSION[0] ;
         A380TBM33_COND_DIV = P00534_A380TBM33_COND_DIV[0] ;
         n380TBM33_COND_DIV = P00534_n380TBM33_COND_DIV[0] ;
         A381TBM33_CRF_ITEM_CD = P00534_A381TBM33_CRF_ITEM_CD[0] ;
         n381TBM33_CRF_ITEM_CD = P00534_n381TBM33_CRF_ITEM_CD[0] ;
         A250TBM33_PRIOR_NO = P00534_A250TBM33_PRIOR_NO[0] ;
         n250TBM33_PRIOR_NO = P00534_n250TBM33_PRIOR_NO[0] ;
         A382TBM33_ERR_DIV = P00534_A382TBM33_ERR_DIV[0] ;
         n382TBM33_ERR_DIV = P00534_n382TBM33_ERR_DIV[0] ;
         A383TBM33_ERR_MSG = P00534_A383TBM33_ERR_MSG[0] ;
         n383TBM33_ERR_MSG = P00534_n383TBM33_ERR_MSG[0] ;
         A554TBM33_ENABLED_FLG = P00534_A554TBM33_ENABLED_FLG[0] ;
         n554TBM33_ENABLED_FLG = P00534_n554TBM33_ENABLED_FLG[0] ;
         A610TBM33_REQUIRED_INPUT_FLG = P00534_A610TBM33_REQUIRED_INPUT_FLG[0] ;
         n610TBM33_REQUIRED_INPUT_FLG = P00534_n610TBM33_REQUIRED_INPUT_FLG[0] ;
         A611TBM33_NUMERIC_RANGE_FLG = P00534_A611TBM33_NUMERIC_RANGE_FLG[0] ;
         n611TBM33_NUMERIC_RANGE_FLG = P00534_n611TBM33_NUMERIC_RANGE_FLG[0] ;
         A248TBM33_COND_NO = P00534_A248TBM33_COND_NO[0] ;
         AV24SDT_TBM33_I = (SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem)new SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem(remoteHandle, context);
         AV24SDT_TBM33_I.setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_study_id( AV20P_STUDY_ID );
         AV24SDT_TBM33_I.setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crf_id( AV19P_CRF_ID );
         AV24SDT_TBM33_I.setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_cond_no( A248TBM33_COND_NO );
         AV24SDT_TBM33_I.setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_cond_nm( A379TBM33_COND_NM );
         AV24SDT_TBM33_I.setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_expression( A249TBM33_EXPRESSION );
         AV24SDT_TBM33_I.setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_cond_div( A380TBM33_COND_DIV );
         AV24SDT_TBM33_I.setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crf_item_cd( A381TBM33_CRF_ITEM_CD );
         AV24SDT_TBM33_I.setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_prior_no( A250TBM33_PRIOR_NO );
         AV24SDT_TBM33_I.setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_err_div( A382TBM33_ERR_DIV );
         AV24SDT_TBM33_I.setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_err_msg( A383TBM33_ERR_MSG );
         AV24SDT_TBM33_I.setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_enabled_flg( A554TBM33_ENABLED_FLG );
         AV24SDT_TBM33_I.setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_required_input_flg( A610TBM33_REQUIRED_INPUT_FLG );
         AV24SDT_TBM33_I.setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_numeric_range_flg( A611TBM33_NUMERIC_RANGE_FLG );
         AV24SDT_TBM33_I.setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_del_flg( A251TBM33_DEL_FLG );
         AV24SDT_TBM33_I.setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crt_prog_nm( AV43Pgmname );
         AV24SDT_TBM33_I.setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_prog_nm( AV43Pgmname );
         AV23SDT_TBM33_C.add(AV24SDT_TBM33_I, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      /* Using cursor P00535 */
      pr_default.execute(3, new Object[] {new Long(AV18P_BASE_STUDY_ID), new Short(AV17P_BASE_CRF_ID)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A463TBM34_DEL_FLG = P00535_A463TBM34_DEL_FLG[0] ;
         n463TBM34_DEL_FLG = P00535_n463TBM34_DEL_FLG[0] ;
         A460TBM34_CRF_ID = P00535_A460TBM34_CRF_ID[0] ;
         A459TBM34_STUDY_ID = P00535_A459TBM34_STUDY_ID[0] ;
         A462TBM34_DISPLAY_FLG = P00535_A462TBM34_DISPLAY_FLG[0] ;
         n462TBM34_DISPLAY_FLG = P00535_n462TBM34_DISPLAY_FLG[0] ;
         A461TBM34_STYDY_AUTH_CD = P00535_A461TBM34_STYDY_AUTH_CD[0] ;
         AV26SDT_TBM34_I = (SdtB_TBM34_CRF_AUTH_B_TBM34_CRF_AUTHItem)new SdtB_TBM34_CRF_AUTH_B_TBM34_CRF_AUTHItem(remoteHandle, context);
         AV26SDT_TBM34_I.setgxTv_SdtB_TBM34_CRF_AUTH_B_TBM34_CRF_AUTHItem_Tbm34_study_id( AV20P_STUDY_ID );
         AV26SDT_TBM34_I.setgxTv_SdtB_TBM34_CRF_AUTH_B_TBM34_CRF_AUTHItem_Tbm34_crf_id( AV19P_CRF_ID );
         AV26SDT_TBM34_I.setgxTv_SdtB_TBM34_CRF_AUTH_B_TBM34_CRF_AUTHItem_Tbm34_stydy_auth_cd( A461TBM34_STYDY_AUTH_CD );
         AV26SDT_TBM34_I.setgxTv_SdtB_TBM34_CRF_AUTH_B_TBM34_CRF_AUTHItem_Tbm34_display_flg( A462TBM34_DISPLAY_FLG );
         AV26SDT_TBM34_I.setgxTv_SdtB_TBM34_CRF_AUTH_B_TBM34_CRF_AUTHItem_Tbm34_del_flg( A463TBM34_DEL_FLG );
         AV26SDT_TBM34_I.setgxTv_SdtB_TBM34_CRF_AUTH_B_TBM34_CRF_AUTHItem_Tbm34_crt_prog_nm( AV43Pgmname );
         AV26SDT_TBM34_I.setgxTv_SdtB_TBM34_CRF_AUTH_B_TBM34_CRF_AUTHItem_Tbm34_upd_prog_nm( AV43Pgmname );
         AV25SDT_TBM34_C.add(AV26SDT_TBM34_I, 0);
         pr_default.readNext(3);
      }
      pr_default.close(3);
      /* Using cursor P00536 */
      pr_default.execute(4, new Object[] {new Long(AV18P_BASE_STUDY_ID), new Short(AV17P_BASE_CRF_ID)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A476TBM35_DEL_FLG = P00536_A476TBM35_DEL_FLG[0] ;
         n476TBM35_DEL_FLG = P00536_n476TBM35_DEL_FLG[0] ;
         A472TBM35_CRF_ID = P00536_A472TBM35_CRF_ID[0] ;
         A471TBM35_STUDY_ID = P00536_A471TBM35_STUDY_ID[0] ;
         A475TBM35_DISPLAY_FLG = P00536_A475TBM35_DISPLAY_FLG[0] ;
         n475TBM35_DISPLAY_FLG = P00536_n475TBM35_DISPLAY_FLG[0] ;
         A474TBM35_STUDY_AUTH_CD = P00536_A474TBM35_STUDY_AUTH_CD[0] ;
         A473TBM35_CRF_ITEM_CD = P00536_A473TBM35_CRF_ITEM_CD[0] ;
         AV28SDT_TBM35_I = (SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem)new SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem(remoteHandle, context);
         AV28SDT_TBM35_I.setgxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_study_id( AV20P_STUDY_ID );
         AV28SDT_TBM35_I.setgxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_crf_id( AV19P_CRF_ID );
         AV28SDT_TBM35_I.setgxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_crf_item_cd( A473TBM35_CRF_ITEM_CD );
         AV28SDT_TBM35_I.setgxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_study_auth_cd( A474TBM35_STUDY_AUTH_CD );
         AV28SDT_TBM35_I.setgxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_display_flg( A475TBM35_DISPLAY_FLG );
         AV28SDT_TBM35_I.setgxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_del_flg( A476TBM35_DEL_FLG );
         AV28SDT_TBM35_I.setgxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_crt_prog_nm( AV43Pgmname );
         AV28SDT_TBM35_I.setgxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_upd_prog_nm( AV43Pgmname );
         AV27SDT_TBM35_C.add(AV28SDT_TBM35_I, 0);
         pr_default.readNext(4);
      }
      pr_default.close(4);
      /* Using cursor P00537 */
      pr_default.execute(5, new Object[] {new Long(AV18P_BASE_STUDY_ID), new Short(AV17P_BASE_CRF_ID)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A488TBM36_DEL_FLG = P00537_A488TBM36_DEL_FLG[0] ;
         n488TBM36_DEL_FLG = P00537_n488TBM36_DEL_FLG[0] ;
         A485TBM36_CRF_ID = P00537_A485TBM36_CRF_ID[0] ;
         A484TBM36_STUDY_ID = P00537_A484TBM36_STUDY_ID[0] ;
         A487TBM36_SELECT_CRF_ID = P00537_A487TBM36_SELECT_CRF_ID[0] ;
         A486TBM36_COND_NO = P00537_A486TBM36_COND_NO[0] ;
         AV30SDT_TBM36_I = (SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem)new SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem(remoteHandle, context);
         AV30SDT_TBM36_I.setgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_study_id( AV20P_STUDY_ID );
         AV30SDT_TBM36_I.setgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crf_id( AV19P_CRF_ID );
         AV30SDT_TBM36_I.setgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_cond_no( A486TBM36_COND_NO );
         AV30SDT_TBM36_I.setgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_select_crf_id( A487TBM36_SELECT_CRF_ID );
         AV30SDT_TBM36_I.setgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_del_flg( A488TBM36_DEL_FLG );
         AV30SDT_TBM36_I.setgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_prog_nm( AV43Pgmname );
         AV30SDT_TBM36_I.setgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_prog_nm( AV43Pgmname );
         AV29SDT_TBM36_C.add(AV30SDT_TBM36_I, 0);
         pr_default.readNext(5);
      }
      pr_default.close(5);
      /* Using cursor P00538 */
      pr_default.execute(6, new Object[] {new Long(AV18P_BASE_STUDY_ID), new Short(AV17P_BASE_CRF_ID)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A271TBM37_STUDY_ID = P00538_A271TBM37_STUDY_ID[0] ;
         A272TBM37_CRF_ID = P00538_A272TBM37_CRF_ID[0] ;
         A274TBM37_DEL_FLG = P00538_A274TBM37_DEL_FLG[0] ;
         n274TBM37_DEL_FLG = P00538_n274TBM37_DEL_FLG[0] ;
         A372TBM37_CRF_ITEM_GRP_DIV = P00538_A372TBM37_CRF_ITEM_GRP_DIV[0] ;
         A373TBM37_VISIT_NO = P00538_A373TBM37_VISIT_NO[0] ;
         n373TBM37_VISIT_NO = P00538_n373TBM37_VISIT_NO[0] ;
         A374TBM37_DOM_CD = P00538_A374TBM37_DOM_CD[0] ;
         n374TBM37_DOM_CD = P00538_n374TBM37_DOM_CD[0] ;
         A375TBM37_DOM_VAR_NM = P00538_A375TBM37_DOM_VAR_NM[0] ;
         n375TBM37_DOM_VAR_NM = P00538_n375TBM37_DOM_VAR_NM[0] ;
         A376TBM37_DOM_ITM_GRP_OID = P00538_A376TBM37_DOM_ITM_GRP_OID[0] ;
         n376TBM37_DOM_ITM_GRP_OID = P00538_n376TBM37_DOM_ITM_GRP_OID[0] ;
         A377TBM37_DOM_ITM_GRP_ATTR_SEQ = P00538_A377TBM37_DOM_ITM_GRP_ATTR_SEQ[0] ;
         n377TBM37_DOM_ITM_GRP_ATTR_SEQ = P00538_n377TBM37_DOM_ITM_GRP_ATTR_SEQ[0] ;
         A612TBM37_DOM_ITM_GRP_ROWNO = P00538_A612TBM37_DOM_ITM_GRP_ROWNO[0] ;
         n612TBM37_DOM_ITM_GRP_ROWNO = P00538_n612TBM37_DOM_ITM_GRP_ROWNO[0] ;
         A273TBM37_CRF_ITEM_GRP_CD = P00538_A273TBM37_CRF_ITEM_GRP_CD[0] ;
         AV32SDT_TBM37_I = (SdtB_TBM37_CRF_DOM_MAP_B_TBM37_CRF_DOM_MAPItem)new SdtB_TBM37_CRF_DOM_MAP_B_TBM37_CRF_DOM_MAPItem(remoteHandle, context);
         AV32SDT_TBM37_I.setgxTv_SdtB_TBM37_CRF_DOM_MAP_B_TBM37_CRF_DOM_MAPItem_Tbm37_study_id( AV20P_STUDY_ID );
         AV32SDT_TBM37_I.setgxTv_SdtB_TBM37_CRF_DOM_MAP_B_TBM37_CRF_DOM_MAPItem_Tbm37_crf_id( AV19P_CRF_ID );
         AV32SDT_TBM37_I.setgxTv_SdtB_TBM37_CRF_DOM_MAP_B_TBM37_CRF_DOM_MAPItem_Tbm37_crf_item_grp_div( A372TBM37_CRF_ITEM_GRP_DIV );
         AV32SDT_TBM37_I.setgxTv_SdtB_TBM37_CRF_DOM_MAP_B_TBM37_CRF_DOM_MAPItem_Tbm37_crf_item_grp_cd( A273TBM37_CRF_ITEM_GRP_CD );
         AV32SDT_TBM37_I.setgxTv_SdtB_TBM37_CRF_DOM_MAP_B_TBM37_CRF_DOM_MAPItem_Tbm37_visit_no( A373TBM37_VISIT_NO );
         AV32SDT_TBM37_I.setgxTv_SdtB_TBM37_CRF_DOM_MAP_B_TBM37_CRF_DOM_MAPItem_Tbm37_dom_cd( A374TBM37_DOM_CD );
         AV32SDT_TBM37_I.setgxTv_SdtB_TBM37_CRF_DOM_MAP_B_TBM37_CRF_DOM_MAPItem_Tbm37_dom_var_nm( A375TBM37_DOM_VAR_NM );
         AV32SDT_TBM37_I.setgxTv_SdtB_TBM37_CRF_DOM_MAP_B_TBM37_CRF_DOM_MAPItem_Tbm37_dom_itm_grp_oid( A376TBM37_DOM_ITM_GRP_OID );
         AV32SDT_TBM37_I.setgxTv_SdtB_TBM37_CRF_DOM_MAP_B_TBM37_CRF_DOM_MAPItem_Tbm37_dom_itm_grp_attr_seq( A377TBM37_DOM_ITM_GRP_ATTR_SEQ );
         AV32SDT_TBM37_I.setgxTv_SdtB_TBM37_CRF_DOM_MAP_B_TBM37_CRF_DOM_MAPItem_Tbm37_dom_itm_grp_rowno( A612TBM37_DOM_ITM_GRP_ROWNO );
         AV32SDT_TBM37_I.setgxTv_SdtB_TBM37_CRF_DOM_MAP_B_TBM37_CRF_DOM_MAPItem_Tbm37_del_flg( A274TBM37_DEL_FLG );
         AV32SDT_TBM37_I.setgxTv_SdtB_TBM37_CRF_DOM_MAP_B_TBM37_CRF_DOM_MAPItem_Tbm37_crt_prog_nm( AV43Pgmname );
         AV32SDT_TBM37_I.setgxTv_SdtB_TBM37_CRF_DOM_MAP_B_TBM37_CRF_DOM_MAPItem_Tbm37_upd_prog_nm( AV43Pgmname );
         AV31SDT_TBM37_C.add(AV32SDT_TBM37_I, 0);
         pr_default.readNext(6);
      }
      pr_default.close(6);
      /* Using cursor P00539 */
      pr_default.execute(7, new Object[] {new Long(AV18P_BASE_STUDY_ID), new Short(AV17P_BASE_CRF_ID)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A259TBM41_STUDY_ID = P00539_A259TBM41_STUDY_ID[0] ;
         A260TBM41_CRF_ID = P00539_A260TBM41_CRF_ID[0] ;
         A263TBM41_DEL_FLG = P00539_A263TBM41_DEL_FLG[0] ;
         n263TBM41_DEL_FLG = P00539_n263TBM41_DEL_FLG[0] ;
         A378TBM41_CRF_ITEM_GRP_DIV = P00539_A378TBM41_CRF_ITEM_GRP_DIV[0] ;
         A262TBM41_NCM_METADATA_ID = P00539_A262TBM41_NCM_METADATA_ID[0] ;
         n262TBM41_NCM_METADATA_ID = P00539_n262TBM41_NCM_METADATA_ID[0] ;
         A261TBM41_CRF_ITEM_GRP_CD = P00539_A261TBM41_CRF_ITEM_GRP_CD[0] ;
         AV34SDT_TBM41_I = (SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem)new SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem(remoteHandle, context);
         AV34SDT_TBM41_I.setgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_study_id( AV20P_STUDY_ID );
         AV34SDT_TBM41_I.setgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crf_id( AV19P_CRF_ID );
         AV34SDT_TBM41_I.setgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crf_item_grp_div( A378TBM41_CRF_ITEM_GRP_DIV );
         AV34SDT_TBM41_I.setgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crf_item_grp_cd( A261TBM41_CRF_ITEM_GRP_CD );
         AV34SDT_TBM41_I.setgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_ncm_metadata_id( A262TBM41_NCM_METADATA_ID );
         AV34SDT_TBM41_I.setgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_del_flg( A263TBM41_DEL_FLG );
         AV34SDT_TBM41_I.setgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crt_prog_nm( AV43Pgmname );
         AV34SDT_TBM41_I.setgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_prog_nm( AV43Pgmname );
         AV33SDT_TBM41_C.add(AV34SDT_TBM41_I, 0);
         pr_default.readNext(7);
      }
      pr_default.close(7);
   }

   public void S14282( )
   {
      /* 'SUB_CRF_INSERT' Routine */
      AV54GXV1 = 1 ;
      while ( AV54GXV1 <= AV21SDT_TBM32_C.size() )
      {
         AV22SDT_TBM32_I = (SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem)((SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem)AV21SDT_TBM32_C.elementAt(-1+AV54GXV1));
         AV9BC_TBM32_CRF_ITEM = (SdtTBM32_CRF_ITEM)new SdtTBM32_CRF_ITEM( remoteHandle, context);
         AV9BC_TBM32_CRF_ITEM.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_study_id( AV22SDT_TBM32_I.getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_study_id() );
         AV9BC_TBM32_CRF_ITEM.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_id( AV22SDT_TBM32_I.getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_id() );
         AV9BC_TBM32_CRF_ITEM.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_cd( AV22SDT_TBM32_I.getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_cd() );
         AV9BC_TBM32_CRF_ITEM.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_nm( AV22SDT_TBM32_I.getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_nm() );
         AV9BC_TBM32_CRF_ITEM.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_div( AV22SDT_TBM32_I.getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_div() );
         AV9BC_TBM32_CRF_ITEM.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_cd( AV22SDT_TBM32_I.getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_grp_cd() );
         AV9BC_TBM32_CRF_ITEM.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_order( AV22SDT_TBM32_I.getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_grp_order() );
         AV9BC_TBM32_CRF_ITEM.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x( AV22SDT_TBM32_I.getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_location_x() );
         AV9BC_TBM32_CRF_ITEM.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y( AV22SDT_TBM32_I.getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_location_y() );
         AV9BC_TBM32_CRF_ITEM.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x2( AV22SDT_TBM32_I.getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_location_x2() );
         AV9BC_TBM32_CRF_ITEM.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y2( AV22SDT_TBM32_I.getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_location_y2() );
         AV9BC_TBM32_CRF_ITEM.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_align_div( AV22SDT_TBM32_I.getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_text_align_div() );
         AV9BC_TBM32_CRF_ITEM.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxrows( AV22SDT_TBM32_I.getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_text_maxrows() );
         AV9BC_TBM32_CRF_ITEM.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxlength( AV22SDT_TBM32_I.getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_text_maxlength() );
         AV9BC_TBM32_CRF_ITEM.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_decimal_digits( AV22SDT_TBM32_I.getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_decimal_digits() );
         AV9BC_TBM32_CRF_ITEM.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_true_inner_value( AV22SDT_TBM32_I.getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_chk_true_inner_value() );
         AV9BC_TBM32_CRF_ITEM.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_false_inner_value( AV22SDT_TBM32_I.getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_chk_false_inner_value() );
         AV9BC_TBM32_CRF_ITEM.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_fixed_value( AV22SDT_TBM32_I.getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_fixed_value() );
         AV9BC_TBM32_CRF_ITEM.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_list_cd( AV22SDT_TBM32_I.getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_list_cd() );
         AV9BC_TBM32_CRF_ITEM.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_image_cd( AV22SDT_TBM32_I.getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_image_cd() );
         AV9BC_TBM32_CRF_ITEM.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text( AV22SDT_TBM32_I.getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_text() );
         AV9BC_TBM32_CRF_ITEM.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_size( AV22SDT_TBM32_I.getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_font_size() );
         AV9BC_TBM32_CRF_ITEM.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_ul_flg( AV22SDT_TBM32_I.getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_font_ul_flg() );
         AV9BC_TBM32_CRF_ITEM.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_color_div( AV22SDT_TBM32_I.getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_font_color_div() );
         AV9BC_TBM32_CRF_ITEM.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_size_div( AV22SDT_TBM32_I.getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_size_div() );
         AV9BC_TBM32_CRF_ITEM.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_color_div( AV22SDT_TBM32_I.getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_color_div() );
         AV9BC_TBM32_CRF_ITEM.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_start_point_div( AV22SDT_TBM32_I.getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_start_point_div() );
         AV9BC_TBM32_CRF_ITEM.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_end_point_div( AV22SDT_TBM32_I.getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_end_point_div() );
         AV9BC_TBM32_CRF_ITEM.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_angle( AV22SDT_TBM32_I.getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_angle() );
         AV9BC_TBM32_CRF_ITEM.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_auth_lvl_min( AV22SDT_TBM32_I.getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_auth_lvl_min() );
         AV9BC_TBM32_CRF_ITEM.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_zorder( AV22SDT_TBM32_I.getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_zorder() );
         AV9BC_TBM32_CRF_ITEM.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_tab_order( AV22SDT_TBM32_I.getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_tab_order() );
         AV9BC_TBM32_CRF_ITEM.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_tabstop_flg( AV22SDT_TBM32_I.getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_tabstop_flg() );
         AV9BC_TBM32_CRF_ITEM.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_required_input_flg( AV22SDT_TBM32_I.getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_required_input_flg() );
         AV9BC_TBM32_CRF_ITEM.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_min_value( AV22SDT_TBM32_I.getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_min_value() );
         AV9BC_TBM32_CRF_ITEM.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_max_value( AV22SDT_TBM32_I.getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_max_value() );
         AV9BC_TBM32_CRF_ITEM.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_note( AV22SDT_TBM32_I.getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_note() );
         AV9BC_TBM32_CRF_ITEM.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_id( AV22SDT_TBM32_I.getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_ref_crf_id() );
         AV9BC_TBM32_CRF_ITEM.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_item_cd( AV22SDT_TBM32_I.getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_ref_crf_item_cd() );
         AV9BC_TBM32_CRF_ITEM.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_del_flg( AV22SDT_TBM32_I.getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_del_flg() );
         AV9BC_TBM32_CRF_ITEM.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_prog_nm( AV22SDT_TBM32_I.getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crt_prog_nm() );
         AV9BC_TBM32_CRF_ITEM.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_prog_nm( AV22SDT_TBM32_I.getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_prog_nm() );
         AV9BC_TBM32_CRF_ITEM.Save();
         if ( AV9BC_TBM32_CRF_ITEM.Fail() )
         {
            AV39W_RTN_CD = (short)(2) ;
            GXt_char3 = AV40W_RTN_MSG ;
            GXv_char2[0] = GXt_char3 ;
            new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV9BC_TBM32_CRF_ITEM.GetMessages(), (byte)(0), GXv_char2) ;
            b402_pc20_crf_copy.this.GXt_char3 = GXv_char2[0] ;
            AV40W_RTN_MSG = GXt_char3 ;
            returnInSub = true;
            if (true) return;
         }
         AV54GXV1 = (int)(AV54GXV1+1) ;
      }
      AV55GXV2 = 1 ;
      while ( AV55GXV2 <= AV23SDT_TBM33_C.size() )
      {
         AV24SDT_TBM33_I = (SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem)((SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem)AV23SDT_TBM33_C.elementAt(-1+AV55GXV2));
         AV10BC_TBM33_CRF_COND = (SdtTBM33_CRF_COND)new SdtTBM33_CRF_COND( remoteHandle, context);
         AV10BC_TBM33_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_study_id( AV24SDT_TBM33_I.getgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_study_id() );
         AV10BC_TBM33_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_crf_id( AV24SDT_TBM33_I.getgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crf_id() );
         AV10BC_TBM33_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_cond_no( AV24SDT_TBM33_I.getgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_cond_no() );
         AV10BC_TBM33_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm( AV24SDT_TBM33_I.getgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_cond_nm() );
         AV10BC_TBM33_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_expression( AV24SDT_TBM33_I.getgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_expression() );
         AV10BC_TBM33_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_cond_div( AV24SDT_TBM33_I.getgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_cond_div() );
         AV10BC_TBM33_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_crf_item_cd( AV24SDT_TBM33_I.getgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crf_item_cd() );
         AV10BC_TBM33_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_prior_no( AV24SDT_TBM33_I.getgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_prior_no() );
         AV10BC_TBM33_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_err_div( AV24SDT_TBM33_I.getgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_err_div() );
         AV10BC_TBM33_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_err_msg( AV24SDT_TBM33_I.getgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_err_msg() );
         AV10BC_TBM33_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_enabled_flg( AV24SDT_TBM33_I.getgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_enabled_flg() );
         AV10BC_TBM33_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_required_input_flg( AV24SDT_TBM33_I.getgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_required_input_flg() );
         AV10BC_TBM33_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_numeric_range_flg( AV24SDT_TBM33_I.getgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_numeric_range_flg() );
         AV10BC_TBM33_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_del_flg( AV24SDT_TBM33_I.getgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_del_flg() );
         AV10BC_TBM33_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm( AV24SDT_TBM33_I.getgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crt_prog_nm() );
         AV10BC_TBM33_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm( AV24SDT_TBM33_I.getgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_prog_nm() );
         AV10BC_TBM33_CRF_COND.Save();
         if ( AV10BC_TBM33_CRF_COND.Fail() )
         {
            AV39W_RTN_CD = (short)(3) ;
            GXt_char3 = AV40W_RTN_MSG ;
            GXv_char2[0] = GXt_char3 ;
            new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV10BC_TBM33_CRF_COND.GetMessages(), (byte)(0), GXv_char2) ;
            b402_pc20_crf_copy.this.GXt_char3 = GXv_char2[0] ;
            AV40W_RTN_MSG = GXt_char3 ;
            returnInSub = true;
            if (true) return;
         }
         AV55GXV2 = (int)(AV55GXV2+1) ;
      }
      AV56GXV3 = 1 ;
      while ( AV56GXV3 <= AV25SDT_TBM34_C.size() )
      {
         AV26SDT_TBM34_I = (SdtB_TBM34_CRF_AUTH_B_TBM34_CRF_AUTHItem)((SdtB_TBM34_CRF_AUTH_B_TBM34_CRF_AUTHItem)AV25SDT_TBM34_C.elementAt(-1+AV56GXV3));
         AV11BC_TBM34_CRF_AUTH = (SdtTBM34_CRF_AUTH)new SdtTBM34_CRF_AUTH( remoteHandle, context);
         AV11BC_TBM34_CRF_AUTH.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_study_id( AV26SDT_TBM34_I.getgxTv_SdtB_TBM34_CRF_AUTH_B_TBM34_CRF_AUTHItem_Tbm34_study_id() );
         AV11BC_TBM34_CRF_AUTH.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_crf_id( AV26SDT_TBM34_I.getgxTv_SdtB_TBM34_CRF_AUTH_B_TBM34_CRF_AUTHItem_Tbm34_crf_id() );
         AV11BC_TBM34_CRF_AUTH.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_stydy_auth_cd( AV26SDT_TBM34_I.getgxTv_SdtB_TBM34_CRF_AUTH_B_TBM34_CRF_AUTHItem_Tbm34_stydy_auth_cd() );
         AV11BC_TBM34_CRF_AUTH.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_display_flg( AV26SDT_TBM34_I.getgxTv_SdtB_TBM34_CRF_AUTH_B_TBM34_CRF_AUTHItem_Tbm34_display_flg() );
         AV11BC_TBM34_CRF_AUTH.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_del_flg( AV26SDT_TBM34_I.getgxTv_SdtB_TBM34_CRF_AUTH_B_TBM34_CRF_AUTHItem_Tbm34_del_flg() );
         AV11BC_TBM34_CRF_AUTH.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_prog_nm( AV26SDT_TBM34_I.getgxTv_SdtB_TBM34_CRF_AUTH_B_TBM34_CRF_AUTHItem_Tbm34_crt_prog_nm() );
         AV11BC_TBM34_CRF_AUTH.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_prog_nm( AV26SDT_TBM34_I.getgxTv_SdtB_TBM34_CRF_AUTH_B_TBM34_CRF_AUTHItem_Tbm34_upd_prog_nm() );
         AV11BC_TBM34_CRF_AUTH.Save();
         if ( AV11BC_TBM34_CRF_AUTH.Fail() )
         {
            AV39W_RTN_CD = (short)(4) ;
            GXt_char3 = AV40W_RTN_MSG ;
            GXv_char2[0] = GXt_char3 ;
            new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV11BC_TBM34_CRF_AUTH.GetMessages(), (byte)(0), GXv_char2) ;
            b402_pc20_crf_copy.this.GXt_char3 = GXv_char2[0] ;
            AV40W_RTN_MSG = GXt_char3 ;
            returnInSub = true;
            if (true) return;
         }
         AV56GXV3 = (int)(AV56GXV3+1) ;
      }
      AV57GXV4 = 1 ;
      while ( AV57GXV4 <= AV27SDT_TBM35_C.size() )
      {
         AV28SDT_TBM35_I = (SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem)((SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem)AV27SDT_TBM35_C.elementAt(-1+AV57GXV4));
         AV12BC_TBM35_CRF_ITEM_AUTH = (SdtTBM35_CRF_ITEM_AUTH)new SdtTBM35_CRF_ITEM_AUTH( remoteHandle, context);
         AV12BC_TBM35_CRF_ITEM_AUTH.setgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_study_id( AV28SDT_TBM35_I.getgxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_study_id() );
         AV12BC_TBM35_CRF_ITEM_AUTH.setgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_crf_id( AV28SDT_TBM35_I.getgxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_crf_id() );
         AV12BC_TBM35_CRF_ITEM_AUTH.setgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_crf_item_cd( AV28SDT_TBM35_I.getgxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_crf_item_cd() );
         AV12BC_TBM35_CRF_ITEM_AUTH.setgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_study_auth_cd( AV28SDT_TBM35_I.getgxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_study_auth_cd() );
         AV12BC_TBM35_CRF_ITEM_AUTH.setgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_display_flg( AV28SDT_TBM35_I.getgxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_display_flg() );
         AV12BC_TBM35_CRF_ITEM_AUTH.setgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_del_flg( AV28SDT_TBM35_I.getgxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_del_flg() );
         AV12BC_TBM35_CRF_ITEM_AUTH.setgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_crt_prog_nm( AV28SDT_TBM35_I.getgxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_crt_prog_nm() );
         AV12BC_TBM35_CRF_ITEM_AUTH.setgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_upd_prog_nm( AV28SDT_TBM35_I.getgxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_upd_prog_nm() );
         AV12BC_TBM35_CRF_ITEM_AUTH.Save();
         if ( AV12BC_TBM35_CRF_ITEM_AUTH.Fail() )
         {
            AV39W_RTN_CD = (short)(5) ;
            GXt_char3 = AV40W_RTN_MSG ;
            GXv_char2[0] = GXt_char3 ;
            new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV12BC_TBM35_CRF_ITEM_AUTH.GetMessages(), (byte)(0), GXv_char2) ;
            b402_pc20_crf_copy.this.GXt_char3 = GXv_char2[0] ;
            AV40W_RTN_MSG = GXt_char3 ;
            returnInSub = true;
            if (true) return;
         }
         AV57GXV4 = (int)(AV57GXV4+1) ;
      }
      AV58GXV5 = 1 ;
      while ( AV58GXV5 <= AV29SDT_TBM36_C.size() )
      {
         AV30SDT_TBM36_I = (SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem)((SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem)AV29SDT_TBM36_C.elementAt(-1+AV58GXV5));
         AV13BC_TBM36_CRF_SELECT = (SdtTBM36_CRF_SELECT)new SdtTBM36_CRF_SELECT( remoteHandle, context);
         AV13BC_TBM36_CRF_SELECT.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_study_id( AV30SDT_TBM36_I.getgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_study_id() );
         AV13BC_TBM36_CRF_SELECT.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_crf_id( AV30SDT_TBM36_I.getgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crf_id() );
         AV13BC_TBM36_CRF_SELECT.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_cond_no( AV30SDT_TBM36_I.getgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_cond_no() );
         AV13BC_TBM36_CRF_SELECT.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_select_crf_id( AV30SDT_TBM36_I.getgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_select_crf_id() );
         AV13BC_TBM36_CRF_SELECT.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_del_flg( AV30SDT_TBM36_I.getgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_del_flg() );
         AV13BC_TBM36_CRF_SELECT.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_prog_nm( AV30SDT_TBM36_I.getgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_prog_nm() );
         AV13BC_TBM36_CRF_SELECT.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_prog_nm( AV30SDT_TBM36_I.getgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_prog_nm() );
         AV13BC_TBM36_CRF_SELECT.Save();
         if ( AV13BC_TBM36_CRF_SELECT.Fail() )
         {
            AV39W_RTN_CD = (short)(6) ;
            GXt_char3 = AV40W_RTN_MSG ;
            GXv_char2[0] = GXt_char3 ;
            new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV13BC_TBM36_CRF_SELECT.GetMessages(), (byte)(0), GXv_char2) ;
            b402_pc20_crf_copy.this.GXt_char3 = GXv_char2[0] ;
            AV40W_RTN_MSG = GXt_char3 ;
            returnInSub = true;
            if (true) return;
         }
         AV58GXV5 = (int)(AV58GXV5+1) ;
      }
      AV59GXV6 = 1 ;
      while ( AV59GXV6 <= AV31SDT_TBM37_C.size() )
      {
         AV32SDT_TBM37_I = (SdtB_TBM37_CRF_DOM_MAP_B_TBM37_CRF_DOM_MAPItem)((SdtB_TBM37_CRF_DOM_MAP_B_TBM37_CRF_DOM_MAPItem)AV31SDT_TBM37_C.elementAt(-1+AV59GXV6));
         AV14BC_TBM37_CRF_DOM_MAP = (SdtTBM37_CRF_DOM_MAP)new SdtTBM37_CRF_DOM_MAP( remoteHandle, context);
         AV14BC_TBM37_CRF_DOM_MAP.setgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_study_id( AV32SDT_TBM37_I.getgxTv_SdtB_TBM37_CRF_DOM_MAP_B_TBM37_CRF_DOM_MAPItem_Tbm37_study_id() );
         AV14BC_TBM37_CRF_DOM_MAP.setgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crf_id( AV32SDT_TBM37_I.getgxTv_SdtB_TBM37_CRF_DOM_MAP_B_TBM37_CRF_DOM_MAPItem_Tbm37_crf_id() );
         AV14BC_TBM37_CRF_DOM_MAP.setgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crf_item_grp_div( AV32SDT_TBM37_I.getgxTv_SdtB_TBM37_CRF_DOM_MAP_B_TBM37_CRF_DOM_MAPItem_Tbm37_crf_item_grp_div() );
         AV14BC_TBM37_CRF_DOM_MAP.setgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crf_item_grp_cd( AV32SDT_TBM37_I.getgxTv_SdtB_TBM37_CRF_DOM_MAP_B_TBM37_CRF_DOM_MAPItem_Tbm37_crf_item_grp_cd() );
         AV14BC_TBM37_CRF_DOM_MAP.setgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_visit_no( AV32SDT_TBM37_I.getgxTv_SdtB_TBM37_CRF_DOM_MAP_B_TBM37_CRF_DOM_MAPItem_Tbm37_visit_no() );
         AV14BC_TBM37_CRF_DOM_MAP.setgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_cd( AV32SDT_TBM37_I.getgxTv_SdtB_TBM37_CRF_DOM_MAP_B_TBM37_CRF_DOM_MAPItem_Tbm37_dom_cd() );
         AV14BC_TBM37_CRF_DOM_MAP.setgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_var_nm( AV32SDT_TBM37_I.getgxTv_SdtB_TBM37_CRF_DOM_MAP_B_TBM37_CRF_DOM_MAPItem_Tbm37_dom_var_nm() );
         AV14BC_TBM37_CRF_DOM_MAP.setgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_itm_grp_oid( AV32SDT_TBM37_I.getgxTv_SdtB_TBM37_CRF_DOM_MAP_B_TBM37_CRF_DOM_MAPItem_Tbm37_dom_itm_grp_oid() );
         AV14BC_TBM37_CRF_DOM_MAP.setgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_itm_grp_attr_seq( AV32SDT_TBM37_I.getgxTv_SdtB_TBM37_CRF_DOM_MAP_B_TBM37_CRF_DOM_MAPItem_Tbm37_dom_itm_grp_attr_seq() );
         AV14BC_TBM37_CRF_DOM_MAP.setgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_itm_grp_rowno( AV32SDT_TBM37_I.getgxTv_SdtB_TBM37_CRF_DOM_MAP_B_TBM37_CRF_DOM_MAPItem_Tbm37_dom_itm_grp_rowno() );
         AV14BC_TBM37_CRF_DOM_MAP.setgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_del_flg( AV32SDT_TBM37_I.getgxTv_SdtB_TBM37_CRF_DOM_MAP_B_TBM37_CRF_DOM_MAPItem_Tbm37_del_flg() );
         AV14BC_TBM37_CRF_DOM_MAP.setgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crt_prog_nm( AV32SDT_TBM37_I.getgxTv_SdtB_TBM37_CRF_DOM_MAP_B_TBM37_CRF_DOM_MAPItem_Tbm37_crt_prog_nm() );
         AV14BC_TBM37_CRF_DOM_MAP.setgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_prog_nm( AV32SDT_TBM37_I.getgxTv_SdtB_TBM37_CRF_DOM_MAP_B_TBM37_CRF_DOM_MAPItem_Tbm37_upd_prog_nm() );
         AV14BC_TBM37_CRF_DOM_MAP.Save();
         if ( AV14BC_TBM37_CRF_DOM_MAP.Fail() )
         {
            AV39W_RTN_CD = (short)(7) ;
            GXt_char3 = AV40W_RTN_MSG ;
            GXv_char2[0] = GXt_char3 ;
            new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV14BC_TBM37_CRF_DOM_MAP.GetMessages(), (byte)(0), GXv_char2) ;
            b402_pc20_crf_copy.this.GXt_char3 = GXv_char2[0] ;
            AV40W_RTN_MSG = GXt_char3 ;
            returnInSub = true;
            if (true) return;
         }
         AV59GXV6 = (int)(AV59GXV6+1) ;
      }
      AV60GXV7 = 1 ;
      while ( AV60GXV7 <= AV33SDT_TBM41_C.size() )
      {
         AV34SDT_TBM41_I = (SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem)((SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem)AV33SDT_TBM41_C.elementAt(-1+AV60GXV7));
         AV15BC_TBM41_CRF_NCM_MAP = (SdtTBM41_CRF_NCM_MAP)new SdtTBM41_CRF_NCM_MAP( remoteHandle, context);
         AV15BC_TBM41_CRF_NCM_MAP.setgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_study_id( AV34SDT_TBM41_I.getgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_study_id() );
         AV15BC_TBM41_CRF_NCM_MAP.setgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_crf_id( AV34SDT_TBM41_I.getgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crf_id() );
         AV15BC_TBM41_CRF_NCM_MAP.setgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_crf_item_grp_div( AV34SDT_TBM41_I.getgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crf_item_grp_div() );
         AV15BC_TBM41_CRF_NCM_MAP.setgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_crf_item_grp_cd( AV34SDT_TBM41_I.getgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crf_item_grp_cd() );
         AV15BC_TBM41_CRF_NCM_MAP.setgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_ncm_metadata_id( AV34SDT_TBM41_I.getgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_ncm_metadata_id() );
         AV15BC_TBM41_CRF_NCM_MAP.setgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_del_flg( AV34SDT_TBM41_I.getgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_del_flg() );
         AV15BC_TBM41_CRF_NCM_MAP.setgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_crt_prog_nm( AV34SDT_TBM41_I.getgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crt_prog_nm() );
         AV15BC_TBM41_CRF_NCM_MAP.setgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_upd_prog_nm( AV34SDT_TBM41_I.getgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_prog_nm() );
         AV15BC_TBM41_CRF_NCM_MAP.Save();
         if ( AV15BC_TBM41_CRF_NCM_MAP.Fail() )
         {
            AV39W_RTN_CD = (short)(8) ;
            GXt_char3 = AV40W_RTN_MSG ;
            GXv_char2[0] = GXt_char3 ;
            new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV15BC_TBM41_CRF_NCM_MAP.GetMessages(), (byte)(0), GXv_char2) ;
            b402_pc20_crf_copy.this.GXt_char3 = GXv_char2[0] ;
            AV40W_RTN_MSG = GXt_char3 ;
            returnInSub = true;
            if (true) return;
         }
         AV60GXV7 = (int)(AV60GXV7+1) ;
      }
      AV8BC_TBM31_CRF.Load(AV20P_STUDY_ID, AV19P_CRF_ID);
      if ( AV8BC_TBM31_CRF.Success() )
      {
         AV8BC_TBM31_CRF.setgxTv_SdtTBM31_CRF_Tbm31_def_visit_no( AV38W_TBM31_DEF_VISIT_NO );
         AV8BC_TBM31_CRF.setgxTv_SdtTBM31_CRF_Tbm31_def_domain_cd( AV37W_TBM31_DEF_DOMAIN_CD );
         AV8BC_TBM31_CRF.Save();
         if ( AV8BC_TBM31_CRF.Fail() )
         {
            AV39W_RTN_CD = (short)(1) ;
            GXt_char3 = AV40W_RTN_MSG ;
            GXv_char2[0] = GXt_char3 ;
            new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV8BC_TBM31_CRF.GetMessages(), (byte)(0), GXv_char2) ;
            b402_pc20_crf_copy.this.GXt_char3 = GXv_char2[0] ;
            AV40W_RTN_MSG = GXt_char3 ;
            returnInSub = true;
            if (true) return;
         }
      }
      else
      {
         AV39W_RTN_CD = (short)(9) ;
         GXt_char3 = AV40W_RTN_MSG ;
         GXv_char2[0] = GXt_char3 ;
         new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV8BC_TBM31_CRF.GetMessages(), (byte)(0), GXv_char2) ;
         b402_pc20_crf_copy.this.GXt_char3 = GXv_char2[0] ;
         AV40W_RTN_MSG = GXt_char3 ;
         returnInSub = true;
         if (true) return;
      }
   }

   protected void cleanup( )
   {
      this.aP4[0] = b402_pc20_crf_copy.this.AV39W_RTN_CD;
      this.aP5[0] = b402_pc20_crf_copy.this.AV40W_RTN_MSG;
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
                  /* Execute user subroutine: S1258 */
                  S1258 ();
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
      AV40W_RTN_MSG = "" ;
      AV16C_TAM02_APP_ID = "" ;
      AV35W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      GXv_SdtA_LOGIN_SDT1 = new SdtA_LOGIN_SDT [1] ;
      AV36W_ERRCD = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV43Pgmname = "" ;
      scmdbuf = "" ;
      P00532_A223TBM31_DEL_FLG = new String[] {""} ;
      P00532_n223TBM31_DEL_FLG = new boolean[] {false} ;
      P00532_A218TBM31_CRF_ID = new short[1] ;
      P00532_A217TBM31_STUDY_ID = new long[1] ;
      P00532_A405TBM31_DEF_VISIT_NO = new short[1] ;
      P00532_n405TBM31_DEF_VISIT_NO = new boolean[] {false} ;
      P00532_A406TBM31_DEF_DOMAIN_CD = new String[] {""} ;
      P00532_n406TBM31_DEF_DOMAIN_CD = new boolean[] {false} ;
      A223TBM31_DEL_FLG = "" ;
      A406TBM31_DEF_DOMAIN_CD = "" ;
      AV37W_TBM31_DEF_DOMAIN_CD = "" ;
      P00533_A238TBM32_DEL_FLG = new String[] {""} ;
      P00533_n238TBM32_DEL_FLG = new boolean[] {false} ;
      P00533_A232TBM32_CRF_ID = new short[1] ;
      P00533_A231TBM32_STUDY_ID = new long[1] ;
      P00533_A234TBM32_CRF_ITEM_NM = new String[] {""} ;
      P00533_n234TBM32_CRF_ITEM_NM = new boolean[] {false} ;
      P00533_A235TBM32_CRF_ITEM_DIV = new String[] {""} ;
      P00533_n235TBM32_CRF_ITEM_DIV = new boolean[] {false} ;
      P00533_A236TBM32_CRF_ITEM_GRP_CD = new String[] {""} ;
      P00533_n236TBM32_CRF_ITEM_GRP_CD = new boolean[] {false} ;
      P00533_A384TBM32_CRF_ITEM_GRP_ORDER = new short[1] ;
      P00533_n384TBM32_CRF_ITEM_GRP_ORDER = new boolean[] {false} ;
      P00533_A385TBM32_LOCATION_X = new short[1] ;
      P00533_n385TBM32_LOCATION_X = new boolean[] {false} ;
      P00533_A386TBM32_LOCATION_Y = new short[1] ;
      P00533_n386TBM32_LOCATION_Y = new boolean[] {false} ;
      P00533_A387TBM32_LOCATION_X2 = new short[1] ;
      P00533_n387TBM32_LOCATION_X2 = new boolean[] {false} ;
      P00533_A388TBM32_LOCATION_Y2 = new short[1] ;
      P00533_n388TBM32_LOCATION_Y2 = new boolean[] {false} ;
      P00533_A389TBM32_TEXT_ALIGN_DIV = new String[] {""} ;
      P00533_n389TBM32_TEXT_ALIGN_DIV = new boolean[] {false} ;
      P00533_A393TBM32_TEXT_MAXROWS = new byte[1] ;
      P00533_n393TBM32_TEXT_MAXROWS = new boolean[] {false} ;
      P00533_A394TBM32_TEXT_MAXLENGTH = new short[1] ;
      P00533_n394TBM32_TEXT_MAXLENGTH = new boolean[] {false} ;
      P00533_A395TBM32_DECIMAL_DIGITS = new byte[1] ;
      P00533_n395TBM32_DECIMAL_DIGITS = new boolean[] {false} ;
      P00533_A399TBM32_CHK_TRUE_INNER_VALUE = new String[] {""} ;
      P00533_n399TBM32_CHK_TRUE_INNER_VALUE = new boolean[] {false} ;
      P00533_A400TBM32_CHK_FALSE_INNER_VALUE = new String[] {""} ;
      P00533_n400TBM32_CHK_FALSE_INNER_VALUE = new boolean[] {false} ;
      P00533_A404TBM32_FIXED_VALUE = new String[] {""} ;
      P00533_n404TBM32_FIXED_VALUE = new boolean[] {false} ;
      P00533_A402TBM32_LIST_CD = new String[] {""} ;
      P00533_n402TBM32_LIST_CD = new boolean[] {false} ;
      P00533_A403TBM32_IMAGE_CD = new String[] {""} ;
      P00533_n403TBM32_IMAGE_CD = new boolean[] {false} ;
      P00533_A401TBM32_TEXT = new String[] {""} ;
      P00533_n401TBM32_TEXT = new boolean[] {false} ;
      P00533_A390TBM32_FONT_SIZE = new byte[1] ;
      P00533_n390TBM32_FONT_SIZE = new boolean[] {false} ;
      P00533_A391TBM32_FONT_UL_FLG = new String[] {""} ;
      P00533_n391TBM32_FONT_UL_FLG = new boolean[] {false} ;
      P00533_A392TBM32_FONT_COLOR_DIV = new long[1] ;
      P00533_n392TBM32_FONT_COLOR_DIV = new boolean[] {false} ;
      P00533_A398TBM32_LINE_SIZE_DIV = new byte[1] ;
      P00533_n398TBM32_LINE_SIZE_DIV = new boolean[] {false} ;
      P00533_A603TBM32_LINE_COLOR_DIV = new long[1] ;
      P00533_n603TBM32_LINE_COLOR_DIV = new boolean[] {false} ;
      P00533_A396TBM32_LINE_START_POINT_DIV = new String[] {""} ;
      P00533_n396TBM32_LINE_START_POINT_DIV = new boolean[] {false} ;
      P00533_A397TBM32_LINE_END_POINT_DIV = new String[] {""} ;
      P00533_n397TBM32_LINE_END_POINT_DIV = new boolean[] {false} ;
      P00533_A604TBM32_LINE_ANGLE = new short[1] ;
      P00533_n604TBM32_LINE_ANGLE = new boolean[] {false} ;
      P00533_A552TBM32_AUTH_LVL_MIN = new byte[1] ;
      P00533_n552TBM32_AUTH_LVL_MIN = new boolean[] {false} ;
      P00533_A553TBM32_ZORDER = new short[1] ;
      P00533_n553TBM32_ZORDER = new boolean[] {false} ;
      P00533_A605TBM32_TAB_ORDER = new short[1] ;
      P00533_n605TBM32_TAB_ORDER = new boolean[] {false} ;
      P00533_A606TBM32_TABSTOP_FLG = new String[] {""} ;
      P00533_n606TBM32_TABSTOP_FLG = new boolean[] {false} ;
      P00533_A607TBM32_REQUIRED_INPUT_FLG = new String[] {""} ;
      P00533_n607TBM32_REQUIRED_INPUT_FLG = new boolean[] {false} ;
      P00533_A608TBM32_MIN_VALUE = new String[] {""} ;
      P00533_n608TBM32_MIN_VALUE = new boolean[] {false} ;
      P00533_A609TBM32_MAX_VALUE = new String[] {""} ;
      P00533_n609TBM32_MAX_VALUE = new boolean[] {false} ;
      P00533_A237TBM32_CRF_ITEM_NOTE = new String[] {""} ;
      P00533_n237TBM32_CRF_ITEM_NOTE = new boolean[] {false} ;
      P00533_A746TBM32_REF_CRF_ID = new short[1] ;
      P00533_n746TBM32_REF_CRF_ID = new boolean[] {false} ;
      P00533_A747TBM32_REF_CRF_ITEM_CD = new String[] {""} ;
      P00533_n747TBM32_REF_CRF_ITEM_CD = new boolean[] {false} ;
      P00533_A233TBM32_CRF_ITEM_CD = new String[] {""} ;
      A238TBM32_DEL_FLG = "" ;
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
      A233TBM32_CRF_ITEM_CD = "" ;
      AV22SDT_TBM32_I = new SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem(remoteHandle, context);
      AV21SDT_TBM32_C = new GxObjectCollection(SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem.class, "B_TBM32_CRF_ITEM_SDT.B_TBM32_CRF_ITEM_SDTItem", "SmartEDC_SHIZUOKA", remoteHandle);
      P00534_A251TBM33_DEL_FLG = new String[] {""} ;
      P00534_n251TBM33_DEL_FLG = new boolean[] {false} ;
      P00534_A247TBM33_CRF_ID = new short[1] ;
      P00534_A246TBM33_STUDY_ID = new long[1] ;
      P00534_A379TBM33_COND_NM = new String[] {""} ;
      P00534_n379TBM33_COND_NM = new boolean[] {false} ;
      P00534_A249TBM33_EXPRESSION = new String[] {""} ;
      P00534_n249TBM33_EXPRESSION = new boolean[] {false} ;
      P00534_A380TBM33_COND_DIV = new String[] {""} ;
      P00534_n380TBM33_COND_DIV = new boolean[] {false} ;
      P00534_A381TBM33_CRF_ITEM_CD = new String[] {""} ;
      P00534_n381TBM33_CRF_ITEM_CD = new boolean[] {false} ;
      P00534_A250TBM33_PRIOR_NO = new byte[1] ;
      P00534_n250TBM33_PRIOR_NO = new boolean[] {false} ;
      P00534_A382TBM33_ERR_DIV = new String[] {""} ;
      P00534_n382TBM33_ERR_DIV = new boolean[] {false} ;
      P00534_A383TBM33_ERR_MSG = new String[] {""} ;
      P00534_n383TBM33_ERR_MSG = new boolean[] {false} ;
      P00534_A554TBM33_ENABLED_FLG = new String[] {""} ;
      P00534_n554TBM33_ENABLED_FLG = new boolean[] {false} ;
      P00534_A610TBM33_REQUIRED_INPUT_FLG = new String[] {""} ;
      P00534_n610TBM33_REQUIRED_INPUT_FLG = new boolean[] {false} ;
      P00534_A611TBM33_NUMERIC_RANGE_FLG = new String[] {""} ;
      P00534_n611TBM33_NUMERIC_RANGE_FLG = new boolean[] {false} ;
      P00534_A248TBM33_COND_NO = new short[1] ;
      A251TBM33_DEL_FLG = "" ;
      A379TBM33_COND_NM = "" ;
      A249TBM33_EXPRESSION = "" ;
      A380TBM33_COND_DIV = "" ;
      A381TBM33_CRF_ITEM_CD = "" ;
      A382TBM33_ERR_DIV = "" ;
      A383TBM33_ERR_MSG = "" ;
      A554TBM33_ENABLED_FLG = "" ;
      A610TBM33_REQUIRED_INPUT_FLG = "" ;
      A611TBM33_NUMERIC_RANGE_FLG = "" ;
      AV24SDT_TBM33_I = new SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem(remoteHandle, context);
      AV23SDT_TBM33_C = new GxObjectCollection(SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem.class, "B_TBM33_CRF_COND.B_TBM33_CRF_CONDItem", "SmartEDC_SHIZUOKA", remoteHandle);
      P00535_A463TBM34_DEL_FLG = new String[] {""} ;
      P00535_n463TBM34_DEL_FLG = new boolean[] {false} ;
      P00535_A460TBM34_CRF_ID = new short[1] ;
      P00535_A459TBM34_STUDY_ID = new long[1] ;
      P00535_A462TBM34_DISPLAY_FLG = new String[] {""} ;
      P00535_n462TBM34_DISPLAY_FLG = new boolean[] {false} ;
      P00535_A461TBM34_STYDY_AUTH_CD = new String[] {""} ;
      A463TBM34_DEL_FLG = "" ;
      A462TBM34_DISPLAY_FLG = "" ;
      A461TBM34_STYDY_AUTH_CD = "" ;
      AV26SDT_TBM34_I = new SdtB_TBM34_CRF_AUTH_B_TBM34_CRF_AUTHItem(remoteHandle, context);
      AV25SDT_TBM34_C = new GxObjectCollection(SdtB_TBM34_CRF_AUTH_B_TBM34_CRF_AUTHItem.class, "B_TBM34_CRF_AUTH.B_TBM34_CRF_AUTHItem", "SmartEDC_SHIZUOKA", remoteHandle);
      P00536_A476TBM35_DEL_FLG = new String[] {""} ;
      P00536_n476TBM35_DEL_FLG = new boolean[] {false} ;
      P00536_A472TBM35_CRF_ID = new short[1] ;
      P00536_A471TBM35_STUDY_ID = new long[1] ;
      P00536_A475TBM35_DISPLAY_FLG = new String[] {""} ;
      P00536_n475TBM35_DISPLAY_FLG = new boolean[] {false} ;
      P00536_A474TBM35_STUDY_AUTH_CD = new String[] {""} ;
      P00536_A473TBM35_CRF_ITEM_CD = new String[] {""} ;
      A476TBM35_DEL_FLG = "" ;
      A475TBM35_DISPLAY_FLG = "" ;
      A474TBM35_STUDY_AUTH_CD = "" ;
      A473TBM35_CRF_ITEM_CD = "" ;
      AV28SDT_TBM35_I = new SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem(remoteHandle, context);
      AV27SDT_TBM35_C = new GxObjectCollection(SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem.class, "B_TBM35_CRF_ITEM_AUTH.B_TBM35_CRF_ITEM_AUTHItem", "SmartEDC_SHIZUOKA", remoteHandle);
      P00537_A488TBM36_DEL_FLG = new String[] {""} ;
      P00537_n488TBM36_DEL_FLG = new boolean[] {false} ;
      P00537_A485TBM36_CRF_ID = new short[1] ;
      P00537_A484TBM36_STUDY_ID = new long[1] ;
      P00537_A487TBM36_SELECT_CRF_ID = new short[1] ;
      P00537_A486TBM36_COND_NO = new short[1] ;
      A488TBM36_DEL_FLG = "" ;
      AV30SDT_TBM36_I = new SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem(remoteHandle, context);
      AV29SDT_TBM36_C = new GxObjectCollection(SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem.class, "B_TBM36_CRF_SELECT.B_TBM36_CRF_SELECTItem", "SmartEDC_SHIZUOKA", remoteHandle);
      P00538_A271TBM37_STUDY_ID = new long[1] ;
      P00538_A272TBM37_CRF_ID = new short[1] ;
      P00538_A274TBM37_DEL_FLG = new String[] {""} ;
      P00538_n274TBM37_DEL_FLG = new boolean[] {false} ;
      P00538_A372TBM37_CRF_ITEM_GRP_DIV = new String[] {""} ;
      P00538_A373TBM37_VISIT_NO = new short[1] ;
      P00538_n373TBM37_VISIT_NO = new boolean[] {false} ;
      P00538_A374TBM37_DOM_CD = new String[] {""} ;
      P00538_n374TBM37_DOM_CD = new boolean[] {false} ;
      P00538_A375TBM37_DOM_VAR_NM = new String[] {""} ;
      P00538_n375TBM37_DOM_VAR_NM = new boolean[] {false} ;
      P00538_A376TBM37_DOM_ITM_GRP_OID = new String[] {""} ;
      P00538_n376TBM37_DOM_ITM_GRP_OID = new boolean[] {false} ;
      P00538_A377TBM37_DOM_ITM_GRP_ATTR_SEQ = new short[1] ;
      P00538_n377TBM37_DOM_ITM_GRP_ATTR_SEQ = new boolean[] {false} ;
      P00538_A612TBM37_DOM_ITM_GRP_ROWNO = new short[1] ;
      P00538_n612TBM37_DOM_ITM_GRP_ROWNO = new boolean[] {false} ;
      P00538_A273TBM37_CRF_ITEM_GRP_CD = new String[] {""} ;
      A274TBM37_DEL_FLG = "" ;
      A372TBM37_CRF_ITEM_GRP_DIV = "" ;
      A374TBM37_DOM_CD = "" ;
      A375TBM37_DOM_VAR_NM = "" ;
      A376TBM37_DOM_ITM_GRP_OID = "" ;
      A273TBM37_CRF_ITEM_GRP_CD = "" ;
      AV32SDT_TBM37_I = new SdtB_TBM37_CRF_DOM_MAP_B_TBM37_CRF_DOM_MAPItem(remoteHandle, context);
      AV31SDT_TBM37_C = new GxObjectCollection(SdtB_TBM37_CRF_DOM_MAP_B_TBM37_CRF_DOM_MAPItem.class, "B_TBM37_CRF_DOM_MAP.B_TBM37_CRF_DOM_MAPItem", "SmartEDC_SHIZUOKA", remoteHandle);
      P00539_A259TBM41_STUDY_ID = new long[1] ;
      P00539_A260TBM41_CRF_ID = new short[1] ;
      P00539_A263TBM41_DEL_FLG = new String[] {""} ;
      P00539_n263TBM41_DEL_FLG = new boolean[] {false} ;
      P00539_A378TBM41_CRF_ITEM_GRP_DIV = new String[] {""} ;
      P00539_A262TBM41_NCM_METADATA_ID = new String[] {""} ;
      P00539_n262TBM41_NCM_METADATA_ID = new boolean[] {false} ;
      P00539_A261TBM41_CRF_ITEM_GRP_CD = new String[] {""} ;
      A263TBM41_DEL_FLG = "" ;
      A378TBM41_CRF_ITEM_GRP_DIV = "" ;
      A262TBM41_NCM_METADATA_ID = "" ;
      A261TBM41_CRF_ITEM_GRP_CD = "" ;
      AV34SDT_TBM41_I = new SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem(remoteHandle, context);
      AV33SDT_TBM41_C = new GxObjectCollection(SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem.class, "B_TBM41_CRF_NCM_MAP.B_TBM41_CRF_NCM_MAPItem", "SmartEDC_SHIZUOKA", remoteHandle);
      AV9BC_TBM32_CRF_ITEM = new SdtTBM32_CRF_ITEM(remoteHandle);
      AV10BC_TBM33_CRF_COND = new SdtTBM33_CRF_COND(remoteHandle);
      AV11BC_TBM34_CRF_AUTH = new SdtTBM34_CRF_AUTH(remoteHandle);
      AV12BC_TBM35_CRF_ITEM_AUTH = new SdtTBM35_CRF_ITEM_AUTH(remoteHandle);
      AV13BC_TBM36_CRF_SELECT = new SdtTBM36_CRF_SELECT(remoteHandle);
      AV14BC_TBM37_CRF_DOM_MAP = new SdtTBM37_CRF_DOM_MAP(remoteHandle);
      AV15BC_TBM41_CRF_NCM_MAP = new SdtTBM41_CRF_NCM_MAP(remoteHandle);
      AV8BC_TBM31_CRF = new SdtTBM31_CRF(remoteHandle);
      GXt_char3 = "" ;
      GXv_char2 = new String [1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b402_pc20_crf_copy__default(),
         new Object[] {
             new Object[] {
            P00532_A223TBM31_DEL_FLG, P00532_n223TBM31_DEL_FLG, P00532_A218TBM31_CRF_ID, P00532_A217TBM31_STUDY_ID, P00532_A405TBM31_DEF_VISIT_NO, P00532_n405TBM31_DEF_VISIT_NO, P00532_A406TBM31_DEF_DOMAIN_CD, P00532_n406TBM31_DEF_DOMAIN_CD
            }
            , new Object[] {
            P00533_A238TBM32_DEL_FLG, P00533_n238TBM32_DEL_FLG, P00533_A232TBM32_CRF_ID, P00533_A231TBM32_STUDY_ID, P00533_A234TBM32_CRF_ITEM_NM, P00533_n234TBM32_CRF_ITEM_NM, P00533_A235TBM32_CRF_ITEM_DIV, P00533_n235TBM32_CRF_ITEM_DIV, P00533_A236TBM32_CRF_ITEM_GRP_CD, P00533_n236TBM32_CRF_ITEM_GRP_CD,
            P00533_A384TBM32_CRF_ITEM_GRP_ORDER, P00533_n384TBM32_CRF_ITEM_GRP_ORDER, P00533_A385TBM32_LOCATION_X, P00533_n385TBM32_LOCATION_X, P00533_A386TBM32_LOCATION_Y, P00533_n386TBM32_LOCATION_Y, P00533_A387TBM32_LOCATION_X2, P00533_n387TBM32_LOCATION_X2, P00533_A388TBM32_LOCATION_Y2, P00533_n388TBM32_LOCATION_Y2,
            P00533_A389TBM32_TEXT_ALIGN_DIV, P00533_n389TBM32_TEXT_ALIGN_DIV, P00533_A393TBM32_TEXT_MAXROWS, P00533_n393TBM32_TEXT_MAXROWS, P00533_A394TBM32_TEXT_MAXLENGTH, P00533_n394TBM32_TEXT_MAXLENGTH, P00533_A395TBM32_DECIMAL_DIGITS, P00533_n395TBM32_DECIMAL_DIGITS, P00533_A399TBM32_CHK_TRUE_INNER_VALUE, P00533_n399TBM32_CHK_TRUE_INNER_VALUE,
            P00533_A400TBM32_CHK_FALSE_INNER_VALUE, P00533_n400TBM32_CHK_FALSE_INNER_VALUE, P00533_A404TBM32_FIXED_VALUE, P00533_n404TBM32_FIXED_VALUE, P00533_A402TBM32_LIST_CD, P00533_n402TBM32_LIST_CD, P00533_A403TBM32_IMAGE_CD, P00533_n403TBM32_IMAGE_CD, P00533_A401TBM32_TEXT, P00533_n401TBM32_TEXT,
            P00533_A390TBM32_FONT_SIZE, P00533_n390TBM32_FONT_SIZE, P00533_A391TBM32_FONT_UL_FLG, P00533_n391TBM32_FONT_UL_FLG, P00533_A392TBM32_FONT_COLOR_DIV, P00533_n392TBM32_FONT_COLOR_DIV, P00533_A398TBM32_LINE_SIZE_DIV, P00533_n398TBM32_LINE_SIZE_DIV, P00533_A603TBM32_LINE_COLOR_DIV, P00533_n603TBM32_LINE_COLOR_DIV,
            P00533_A396TBM32_LINE_START_POINT_DIV, P00533_n396TBM32_LINE_START_POINT_DIV, P00533_A397TBM32_LINE_END_POINT_DIV, P00533_n397TBM32_LINE_END_POINT_DIV, P00533_A604TBM32_LINE_ANGLE, P00533_n604TBM32_LINE_ANGLE, P00533_A552TBM32_AUTH_LVL_MIN, P00533_n552TBM32_AUTH_LVL_MIN, P00533_A553TBM32_ZORDER, P00533_n553TBM32_ZORDER,
            P00533_A605TBM32_TAB_ORDER, P00533_n605TBM32_TAB_ORDER, P00533_A606TBM32_TABSTOP_FLG, P00533_n606TBM32_TABSTOP_FLG, P00533_A607TBM32_REQUIRED_INPUT_FLG, P00533_n607TBM32_REQUIRED_INPUT_FLG, P00533_A608TBM32_MIN_VALUE, P00533_n608TBM32_MIN_VALUE, P00533_A609TBM32_MAX_VALUE, P00533_n609TBM32_MAX_VALUE,
            P00533_A237TBM32_CRF_ITEM_NOTE, P00533_n237TBM32_CRF_ITEM_NOTE, P00533_A746TBM32_REF_CRF_ID, P00533_n746TBM32_REF_CRF_ID, P00533_A747TBM32_REF_CRF_ITEM_CD, P00533_n747TBM32_REF_CRF_ITEM_CD, P00533_A233TBM32_CRF_ITEM_CD
            }
            , new Object[] {
            P00534_A251TBM33_DEL_FLG, P00534_n251TBM33_DEL_FLG, P00534_A247TBM33_CRF_ID, P00534_A246TBM33_STUDY_ID, P00534_A379TBM33_COND_NM, P00534_n379TBM33_COND_NM, P00534_A249TBM33_EXPRESSION, P00534_n249TBM33_EXPRESSION, P00534_A380TBM33_COND_DIV, P00534_n380TBM33_COND_DIV,
            P00534_A381TBM33_CRF_ITEM_CD, P00534_n381TBM33_CRF_ITEM_CD, P00534_A250TBM33_PRIOR_NO, P00534_n250TBM33_PRIOR_NO, P00534_A382TBM33_ERR_DIV, P00534_n382TBM33_ERR_DIV, P00534_A383TBM33_ERR_MSG, P00534_n383TBM33_ERR_MSG, P00534_A554TBM33_ENABLED_FLG, P00534_n554TBM33_ENABLED_FLG,
            P00534_A610TBM33_REQUIRED_INPUT_FLG, P00534_n610TBM33_REQUIRED_INPUT_FLG, P00534_A611TBM33_NUMERIC_RANGE_FLG, P00534_n611TBM33_NUMERIC_RANGE_FLG, P00534_A248TBM33_COND_NO
            }
            , new Object[] {
            P00535_A463TBM34_DEL_FLG, P00535_n463TBM34_DEL_FLG, P00535_A460TBM34_CRF_ID, P00535_A459TBM34_STUDY_ID, P00535_A462TBM34_DISPLAY_FLG, P00535_n462TBM34_DISPLAY_FLG, P00535_A461TBM34_STYDY_AUTH_CD
            }
            , new Object[] {
            P00536_A476TBM35_DEL_FLG, P00536_n476TBM35_DEL_FLG, P00536_A472TBM35_CRF_ID, P00536_A471TBM35_STUDY_ID, P00536_A475TBM35_DISPLAY_FLG, P00536_n475TBM35_DISPLAY_FLG, P00536_A474TBM35_STUDY_AUTH_CD, P00536_A473TBM35_CRF_ITEM_CD
            }
            , new Object[] {
            P00537_A488TBM36_DEL_FLG, P00537_n488TBM36_DEL_FLG, P00537_A485TBM36_CRF_ID, P00537_A484TBM36_STUDY_ID, P00537_A487TBM36_SELECT_CRF_ID, P00537_A486TBM36_COND_NO
            }
            , new Object[] {
            P00538_A271TBM37_STUDY_ID, P00538_A272TBM37_CRF_ID, P00538_A274TBM37_DEL_FLG, P00538_n274TBM37_DEL_FLG, P00538_A372TBM37_CRF_ITEM_GRP_DIV, P00538_A373TBM37_VISIT_NO, P00538_n373TBM37_VISIT_NO, P00538_A374TBM37_DOM_CD, P00538_n374TBM37_DOM_CD, P00538_A375TBM37_DOM_VAR_NM,
            P00538_n375TBM37_DOM_VAR_NM, P00538_A376TBM37_DOM_ITM_GRP_OID, P00538_n376TBM37_DOM_ITM_GRP_OID, P00538_A377TBM37_DOM_ITM_GRP_ATTR_SEQ, P00538_n377TBM37_DOM_ITM_GRP_ATTR_SEQ, P00538_A612TBM37_DOM_ITM_GRP_ROWNO, P00538_n612TBM37_DOM_ITM_GRP_ROWNO, P00538_A273TBM37_CRF_ITEM_GRP_CD
            }
            , new Object[] {
            P00539_A259TBM41_STUDY_ID, P00539_A260TBM41_CRF_ID, P00539_A263TBM41_DEL_FLG, P00539_n263TBM41_DEL_FLG, P00539_A378TBM41_CRF_ITEM_GRP_DIV, P00539_A262TBM41_NCM_METADATA_ID, P00539_n262TBM41_NCM_METADATA_ID, P00539_A261TBM41_CRF_ITEM_GRP_CD
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV43Pgmname = "B402_PC20_CRF_COPY" ;
      /* GeneXus formulas. */
      AV43Pgmname = "B402_PC20_CRF_COPY" ;
      Gx_err = (short)(0) ;
   }

   private byte AV46GXLvl76 ;
   private byte A393TBM32_TEXT_MAXROWS ;
   private byte A395TBM32_DECIMAL_DIGITS ;
   private byte A390TBM32_FONT_SIZE ;
   private byte A398TBM32_LINE_SIZE_DIV ;
   private byte A552TBM32_AUTH_LVL_MIN ;
   private byte A250TBM33_PRIOR_NO ;
   private short AV19P_CRF_ID ;
   private short AV17P_BASE_CRF_ID ;
   private short AV39W_RTN_CD ;
   private short A218TBM31_CRF_ID ;
   private short A405TBM31_DEF_VISIT_NO ;
   private short AV38W_TBM31_DEF_VISIT_NO ;
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
   private short A247TBM33_CRF_ID ;
   private short A248TBM33_COND_NO ;
   private short A460TBM34_CRF_ID ;
   private short A472TBM35_CRF_ID ;
   private short A485TBM36_CRF_ID ;
   private short A487TBM36_SELECT_CRF_ID ;
   private short A486TBM36_COND_NO ;
   private short A272TBM37_CRF_ID ;
   private short A373TBM37_VISIT_NO ;
   private short A377TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private short A612TBM37_DOM_ITM_GRP_ROWNO ;
   private short A260TBM41_CRF_ID ;
   private short Gx_err ;
   private int GXActiveErrHndl ;
   private int AV54GXV1 ;
   private int AV55GXV2 ;
   private int AV56GXV3 ;
   private int AV57GXV4 ;
   private int AV58GXV5 ;
   private int AV59GXV6 ;
   private int AV60GXV7 ;
   private long AV20P_STUDY_ID ;
   private long AV18P_BASE_STUDY_ID ;
   private long A217TBM31_STUDY_ID ;
   private long A231TBM32_STUDY_ID ;
   private long A392TBM32_FONT_COLOR_DIV ;
   private long A603TBM32_LINE_COLOR_DIV ;
   private long A246TBM33_STUDY_ID ;
   private long A459TBM34_STUDY_ID ;
   private long A471TBM35_STUDY_ID ;
   private long A484TBM36_STUDY_ID ;
   private long A271TBM37_STUDY_ID ;
   private long A259TBM41_STUDY_ID ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String AV43Pgmname ;
   private String scmdbuf ;
   private String GXt_char3 ;
   private String GXv_char2[] ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private boolean n223TBM31_DEL_FLG ;
   private boolean n405TBM31_DEF_VISIT_NO ;
   private boolean n406TBM31_DEF_DOMAIN_CD ;
   private boolean n238TBM32_DEL_FLG ;
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
   private boolean n251TBM33_DEL_FLG ;
   private boolean n379TBM33_COND_NM ;
   private boolean n249TBM33_EXPRESSION ;
   private boolean n380TBM33_COND_DIV ;
   private boolean n381TBM33_CRF_ITEM_CD ;
   private boolean n250TBM33_PRIOR_NO ;
   private boolean n382TBM33_ERR_DIV ;
   private boolean n383TBM33_ERR_MSG ;
   private boolean n554TBM33_ENABLED_FLG ;
   private boolean n610TBM33_REQUIRED_INPUT_FLG ;
   private boolean n611TBM33_NUMERIC_RANGE_FLG ;
   private boolean n463TBM34_DEL_FLG ;
   private boolean n462TBM34_DISPLAY_FLG ;
   private boolean n476TBM35_DEL_FLG ;
   private boolean n475TBM35_DISPLAY_FLG ;
   private boolean n488TBM36_DEL_FLG ;
   private boolean n274TBM37_DEL_FLG ;
   private boolean n373TBM37_VISIT_NO ;
   private boolean n374TBM37_DOM_CD ;
   private boolean n375TBM37_DOM_VAR_NM ;
   private boolean n376TBM37_DOM_ITM_GRP_OID ;
   private boolean n377TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private boolean n612TBM37_DOM_ITM_GRP_ROWNO ;
   private boolean n263TBM41_DEL_FLG ;
   private boolean n262TBM41_NCM_METADATA_ID ;
   private String AV40W_RTN_MSG ;
   private String AV16C_TAM02_APP_ID ;
   private String AV36W_ERRCD ;
   private String A223TBM31_DEL_FLG ;
   private String A406TBM31_DEF_DOMAIN_CD ;
   private String AV37W_TBM31_DEF_DOMAIN_CD ;
   private String A238TBM32_DEL_FLG ;
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
   private String A233TBM32_CRF_ITEM_CD ;
   private String A251TBM33_DEL_FLG ;
   private String A379TBM33_COND_NM ;
   private String A249TBM33_EXPRESSION ;
   private String A380TBM33_COND_DIV ;
   private String A381TBM33_CRF_ITEM_CD ;
   private String A382TBM33_ERR_DIV ;
   private String A383TBM33_ERR_MSG ;
   private String A554TBM33_ENABLED_FLG ;
   private String A610TBM33_REQUIRED_INPUT_FLG ;
   private String A611TBM33_NUMERIC_RANGE_FLG ;
   private String A463TBM34_DEL_FLG ;
   private String A462TBM34_DISPLAY_FLG ;
   private String A461TBM34_STYDY_AUTH_CD ;
   private String A476TBM35_DEL_FLG ;
   private String A475TBM35_DISPLAY_FLG ;
   private String A474TBM35_STUDY_AUTH_CD ;
   private String A473TBM35_CRF_ITEM_CD ;
   private String A488TBM36_DEL_FLG ;
   private String A274TBM37_DEL_FLG ;
   private String A372TBM37_CRF_ITEM_GRP_DIV ;
   private String A374TBM37_DOM_CD ;
   private String A375TBM37_DOM_VAR_NM ;
   private String A376TBM37_DOM_ITM_GRP_OID ;
   private String A273TBM37_CRF_ITEM_GRP_CD ;
   private String A263TBM41_DEL_FLG ;
   private String A378TBM41_CRF_ITEM_GRP_DIV ;
   private String A262TBM41_NCM_METADATA_ID ;
   private String A261TBM41_CRF_ITEM_GRP_CD ;
   private short[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P00532_A223TBM31_DEL_FLG ;
   private boolean[] P00532_n223TBM31_DEL_FLG ;
   private short[] P00532_A218TBM31_CRF_ID ;
   private long[] P00532_A217TBM31_STUDY_ID ;
   private short[] P00532_A405TBM31_DEF_VISIT_NO ;
   private boolean[] P00532_n405TBM31_DEF_VISIT_NO ;
   private String[] P00532_A406TBM31_DEF_DOMAIN_CD ;
   private boolean[] P00532_n406TBM31_DEF_DOMAIN_CD ;
   private String[] P00533_A238TBM32_DEL_FLG ;
   private boolean[] P00533_n238TBM32_DEL_FLG ;
   private short[] P00533_A232TBM32_CRF_ID ;
   private long[] P00533_A231TBM32_STUDY_ID ;
   private String[] P00533_A234TBM32_CRF_ITEM_NM ;
   private boolean[] P00533_n234TBM32_CRF_ITEM_NM ;
   private String[] P00533_A235TBM32_CRF_ITEM_DIV ;
   private boolean[] P00533_n235TBM32_CRF_ITEM_DIV ;
   private String[] P00533_A236TBM32_CRF_ITEM_GRP_CD ;
   private boolean[] P00533_n236TBM32_CRF_ITEM_GRP_CD ;
   private short[] P00533_A384TBM32_CRF_ITEM_GRP_ORDER ;
   private boolean[] P00533_n384TBM32_CRF_ITEM_GRP_ORDER ;
   private short[] P00533_A385TBM32_LOCATION_X ;
   private boolean[] P00533_n385TBM32_LOCATION_X ;
   private short[] P00533_A386TBM32_LOCATION_Y ;
   private boolean[] P00533_n386TBM32_LOCATION_Y ;
   private short[] P00533_A387TBM32_LOCATION_X2 ;
   private boolean[] P00533_n387TBM32_LOCATION_X2 ;
   private short[] P00533_A388TBM32_LOCATION_Y2 ;
   private boolean[] P00533_n388TBM32_LOCATION_Y2 ;
   private String[] P00533_A389TBM32_TEXT_ALIGN_DIV ;
   private boolean[] P00533_n389TBM32_TEXT_ALIGN_DIV ;
   private byte[] P00533_A393TBM32_TEXT_MAXROWS ;
   private boolean[] P00533_n393TBM32_TEXT_MAXROWS ;
   private short[] P00533_A394TBM32_TEXT_MAXLENGTH ;
   private boolean[] P00533_n394TBM32_TEXT_MAXLENGTH ;
   private byte[] P00533_A395TBM32_DECIMAL_DIGITS ;
   private boolean[] P00533_n395TBM32_DECIMAL_DIGITS ;
   private String[] P00533_A399TBM32_CHK_TRUE_INNER_VALUE ;
   private boolean[] P00533_n399TBM32_CHK_TRUE_INNER_VALUE ;
   private String[] P00533_A400TBM32_CHK_FALSE_INNER_VALUE ;
   private boolean[] P00533_n400TBM32_CHK_FALSE_INNER_VALUE ;
   private String[] P00533_A404TBM32_FIXED_VALUE ;
   private boolean[] P00533_n404TBM32_FIXED_VALUE ;
   private String[] P00533_A402TBM32_LIST_CD ;
   private boolean[] P00533_n402TBM32_LIST_CD ;
   private String[] P00533_A403TBM32_IMAGE_CD ;
   private boolean[] P00533_n403TBM32_IMAGE_CD ;
   private String[] P00533_A401TBM32_TEXT ;
   private boolean[] P00533_n401TBM32_TEXT ;
   private byte[] P00533_A390TBM32_FONT_SIZE ;
   private boolean[] P00533_n390TBM32_FONT_SIZE ;
   private String[] P00533_A391TBM32_FONT_UL_FLG ;
   private boolean[] P00533_n391TBM32_FONT_UL_FLG ;
   private long[] P00533_A392TBM32_FONT_COLOR_DIV ;
   private boolean[] P00533_n392TBM32_FONT_COLOR_DIV ;
   private byte[] P00533_A398TBM32_LINE_SIZE_DIV ;
   private boolean[] P00533_n398TBM32_LINE_SIZE_DIV ;
   private long[] P00533_A603TBM32_LINE_COLOR_DIV ;
   private boolean[] P00533_n603TBM32_LINE_COLOR_DIV ;
   private String[] P00533_A396TBM32_LINE_START_POINT_DIV ;
   private boolean[] P00533_n396TBM32_LINE_START_POINT_DIV ;
   private String[] P00533_A397TBM32_LINE_END_POINT_DIV ;
   private boolean[] P00533_n397TBM32_LINE_END_POINT_DIV ;
   private short[] P00533_A604TBM32_LINE_ANGLE ;
   private boolean[] P00533_n604TBM32_LINE_ANGLE ;
   private byte[] P00533_A552TBM32_AUTH_LVL_MIN ;
   private boolean[] P00533_n552TBM32_AUTH_LVL_MIN ;
   private short[] P00533_A553TBM32_ZORDER ;
   private boolean[] P00533_n553TBM32_ZORDER ;
   private short[] P00533_A605TBM32_TAB_ORDER ;
   private boolean[] P00533_n605TBM32_TAB_ORDER ;
   private String[] P00533_A606TBM32_TABSTOP_FLG ;
   private boolean[] P00533_n606TBM32_TABSTOP_FLG ;
   private String[] P00533_A607TBM32_REQUIRED_INPUT_FLG ;
   private boolean[] P00533_n607TBM32_REQUIRED_INPUT_FLG ;
   private String[] P00533_A608TBM32_MIN_VALUE ;
   private boolean[] P00533_n608TBM32_MIN_VALUE ;
   private String[] P00533_A609TBM32_MAX_VALUE ;
   private boolean[] P00533_n609TBM32_MAX_VALUE ;
   private String[] P00533_A237TBM32_CRF_ITEM_NOTE ;
   private boolean[] P00533_n237TBM32_CRF_ITEM_NOTE ;
   private short[] P00533_A746TBM32_REF_CRF_ID ;
   private boolean[] P00533_n746TBM32_REF_CRF_ID ;
   private String[] P00533_A747TBM32_REF_CRF_ITEM_CD ;
   private boolean[] P00533_n747TBM32_REF_CRF_ITEM_CD ;
   private String[] P00533_A233TBM32_CRF_ITEM_CD ;
   private String[] P00534_A251TBM33_DEL_FLG ;
   private boolean[] P00534_n251TBM33_DEL_FLG ;
   private short[] P00534_A247TBM33_CRF_ID ;
   private long[] P00534_A246TBM33_STUDY_ID ;
   private String[] P00534_A379TBM33_COND_NM ;
   private boolean[] P00534_n379TBM33_COND_NM ;
   private String[] P00534_A249TBM33_EXPRESSION ;
   private boolean[] P00534_n249TBM33_EXPRESSION ;
   private String[] P00534_A380TBM33_COND_DIV ;
   private boolean[] P00534_n380TBM33_COND_DIV ;
   private String[] P00534_A381TBM33_CRF_ITEM_CD ;
   private boolean[] P00534_n381TBM33_CRF_ITEM_CD ;
   private byte[] P00534_A250TBM33_PRIOR_NO ;
   private boolean[] P00534_n250TBM33_PRIOR_NO ;
   private String[] P00534_A382TBM33_ERR_DIV ;
   private boolean[] P00534_n382TBM33_ERR_DIV ;
   private String[] P00534_A383TBM33_ERR_MSG ;
   private boolean[] P00534_n383TBM33_ERR_MSG ;
   private String[] P00534_A554TBM33_ENABLED_FLG ;
   private boolean[] P00534_n554TBM33_ENABLED_FLG ;
   private String[] P00534_A610TBM33_REQUIRED_INPUT_FLG ;
   private boolean[] P00534_n610TBM33_REQUIRED_INPUT_FLG ;
   private String[] P00534_A611TBM33_NUMERIC_RANGE_FLG ;
   private boolean[] P00534_n611TBM33_NUMERIC_RANGE_FLG ;
   private short[] P00534_A248TBM33_COND_NO ;
   private String[] P00535_A463TBM34_DEL_FLG ;
   private boolean[] P00535_n463TBM34_DEL_FLG ;
   private short[] P00535_A460TBM34_CRF_ID ;
   private long[] P00535_A459TBM34_STUDY_ID ;
   private String[] P00535_A462TBM34_DISPLAY_FLG ;
   private boolean[] P00535_n462TBM34_DISPLAY_FLG ;
   private String[] P00535_A461TBM34_STYDY_AUTH_CD ;
   private String[] P00536_A476TBM35_DEL_FLG ;
   private boolean[] P00536_n476TBM35_DEL_FLG ;
   private short[] P00536_A472TBM35_CRF_ID ;
   private long[] P00536_A471TBM35_STUDY_ID ;
   private String[] P00536_A475TBM35_DISPLAY_FLG ;
   private boolean[] P00536_n475TBM35_DISPLAY_FLG ;
   private String[] P00536_A474TBM35_STUDY_AUTH_CD ;
   private String[] P00536_A473TBM35_CRF_ITEM_CD ;
   private String[] P00537_A488TBM36_DEL_FLG ;
   private boolean[] P00537_n488TBM36_DEL_FLG ;
   private short[] P00537_A485TBM36_CRF_ID ;
   private long[] P00537_A484TBM36_STUDY_ID ;
   private short[] P00537_A487TBM36_SELECT_CRF_ID ;
   private short[] P00537_A486TBM36_COND_NO ;
   private long[] P00538_A271TBM37_STUDY_ID ;
   private short[] P00538_A272TBM37_CRF_ID ;
   private String[] P00538_A274TBM37_DEL_FLG ;
   private boolean[] P00538_n274TBM37_DEL_FLG ;
   private String[] P00538_A372TBM37_CRF_ITEM_GRP_DIV ;
   private short[] P00538_A373TBM37_VISIT_NO ;
   private boolean[] P00538_n373TBM37_VISIT_NO ;
   private String[] P00538_A374TBM37_DOM_CD ;
   private boolean[] P00538_n374TBM37_DOM_CD ;
   private String[] P00538_A375TBM37_DOM_VAR_NM ;
   private boolean[] P00538_n375TBM37_DOM_VAR_NM ;
   private String[] P00538_A376TBM37_DOM_ITM_GRP_OID ;
   private boolean[] P00538_n376TBM37_DOM_ITM_GRP_OID ;
   private short[] P00538_A377TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private boolean[] P00538_n377TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private short[] P00538_A612TBM37_DOM_ITM_GRP_ROWNO ;
   private boolean[] P00538_n612TBM37_DOM_ITM_GRP_ROWNO ;
   private String[] P00538_A273TBM37_CRF_ITEM_GRP_CD ;
   private long[] P00539_A259TBM41_STUDY_ID ;
   private short[] P00539_A260TBM41_CRF_ID ;
   private String[] P00539_A263TBM41_DEL_FLG ;
   private boolean[] P00539_n263TBM41_DEL_FLG ;
   private String[] P00539_A378TBM41_CRF_ITEM_GRP_DIV ;
   private String[] P00539_A262TBM41_NCM_METADATA_ID ;
   private boolean[] P00539_n262TBM41_NCM_METADATA_ID ;
   private String[] P00539_A261TBM41_CRF_ITEM_GRP_CD ;
   private GxObjectCollection AV21SDT_TBM32_C ;
   private GxObjectCollection AV23SDT_TBM33_C ;
   private GxObjectCollection AV25SDT_TBM34_C ;
   private GxObjectCollection AV27SDT_TBM35_C ;
   private GxObjectCollection AV29SDT_TBM36_C ;
   private GxObjectCollection AV31SDT_TBM37_C ;
   private GxObjectCollection AV33SDT_TBM41_C ;
   private SdtTBM31_CRF AV8BC_TBM31_CRF ;
   private SdtTBM32_CRF_ITEM AV9BC_TBM32_CRF_ITEM ;
   private SdtTBM33_CRF_COND AV10BC_TBM33_CRF_COND ;
   private SdtTBM34_CRF_AUTH AV11BC_TBM34_CRF_AUTH ;
   private SdtTBM35_CRF_ITEM_AUTH AV12BC_TBM35_CRF_ITEM_AUTH ;
   private SdtTBM36_CRF_SELECT AV13BC_TBM36_CRF_SELECT ;
   private SdtTBM37_CRF_DOM_MAP AV14BC_TBM37_CRF_DOM_MAP ;
   private SdtTBM41_CRF_NCM_MAP AV15BC_TBM41_CRF_NCM_MAP ;
   private SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem AV22SDT_TBM32_I ;
   private SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem AV24SDT_TBM33_I ;
   private SdtB_TBM34_CRF_AUTH_B_TBM34_CRF_AUTHItem AV26SDT_TBM34_I ;
   private SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem AV28SDT_TBM35_I ;
   private SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem AV30SDT_TBM36_I ;
   private SdtB_TBM37_CRF_DOM_MAP_B_TBM37_CRF_DOM_MAPItem AV32SDT_TBM37_I ;
   private SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem AV34SDT_TBM41_I ;
   private SdtA_LOGIN_SDT AV35W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT1[] ;
}

final  class b402_pc20_crf_copy__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00532", "SELECT `TBM31_DEL_FLG`, `TBM31_CRF_ID`, `TBM31_STUDY_ID`, `TBM31_DEF_VISIT_NO`, `TBM31_DEF_DOMAIN_CD` FROM `TBM31_CRF` WHERE (`TBM31_STUDY_ID` = ? and `TBM31_CRF_ID` = ?) AND (`TBM31_DEL_FLG` = '0') ORDER BY `TBM31_STUDY_ID`, `TBM31_CRF_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P00533", "SELECT `TBM32_DEL_FLG`, `TBM32_CRF_ID`, `TBM32_STUDY_ID`, `TBM32_CRF_ITEM_NM`, `TBM32_CRF_ITEM_DIV`, `TBM32_CRF_ITEM_GRP_CD`, `TBM32_CRF_ITEM_GRP_ORDER`, `TBM32_LOCATION_X`, `TBM32_LOCATION_Y`, `TBM32_LOCATION_X2`, `TBM32_LOCATION_Y2`, `TBM32_TEXT_ALIGN_DIV`, `TBM32_TEXT_MAXROWS`, `TBM32_TEXT_MAXLENGTH`, `TBM32_DECIMAL_DIGITS`, `TBM32_CHK_TRUE_INNER_VALUE`, `TBM32_CHK_FALSE_INNER_VALUE`, `TBM32_FIXED_VALUE`, `TBM32_LIST_CD`, `TBM32_IMAGE_CD`, `TBM32_TEXT`, `TBM32_FONT_SIZE`, `TBM32_FONT_UL_FLG`, `TBM32_FONT_COLOR_DIV`, `TBM32_LINE_SIZE_DIV`, `TBM32_LINE_COLOR_DIV`, `TBM32_LINE_START_POINT_DIV`, `TBM32_LINE_END_POINT_DIV`, `TBM32_LINE_ANGLE`, `TBM32_AUTH_LVL_MIN`, `TBM32_ZORDER`, `TBM32_TAB_ORDER`, `TBM32_TABSTOP_FLG`, `TBM32_REQUIRED_INPUT_FLG`, `TBM32_MIN_VALUE`, `TBM32_MAX_VALUE`, `TBM32_CRF_ITEM_NOTE`, `TBM32_REF_CRF_ID`, `TBM32_REF_CRF_ITEM_CD`, `TBM32_CRF_ITEM_CD` FROM `TBM32_CRF_ITEM` WHERE (`TBM32_STUDY_ID` = ? and `TBM32_CRF_ID` = ?) AND (`TBM32_DEL_FLG` = '0') ORDER BY `TBM32_STUDY_ID`, `TBM32_CRF_ID`, `TBM32_CRF_ITEM_CD` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
         ,new ForEachCursor("P00534", "SELECT `TBM33_DEL_FLG`, `TBM33_CRF_ID`, `TBM33_STUDY_ID`, `TBM33_COND_NM`, `TBM33_EXPRESSION`, `TBM33_COND_DIV`, `TBM33_CRF_ITEM_CD`, `TBM33_PRIOR_NO`, `TBM33_ERR_DIV`, `TBM33_ERR_MSG`, `TBM33_ENABLED_FLG`, `TBM33_REQUIRED_INPUT_FLG`, `TBM33_NUMERIC_RANGE_FLG`, `TBM33_COND_NO` FROM `TBM33_CRF_COND` WHERE (`TBM33_STUDY_ID` = ? and `TBM33_CRF_ID` = ?) AND (`TBM33_DEL_FLG` = '0') ORDER BY `TBM33_STUDY_ID`, `TBM33_CRF_ID`, `TBM33_COND_NO` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
         ,new ForEachCursor("P00535", "SELECT `TBM34_DEL_FLG`, `TBM34_CRF_ID`, `TBM34_STUDY_ID`, `TBM34_DISPLAY_FLG`, `TBM34_STYDY_AUTH_CD` FROM `TBM34_CRF_AUTH` WHERE (`TBM34_STUDY_ID` = ? and `TBM34_CRF_ID` = ?) AND (`TBM34_DEL_FLG` = '0') ORDER BY `TBM34_STUDY_ID`, `TBM34_CRF_ID`, `TBM34_STYDY_AUTH_CD` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
         ,new ForEachCursor("P00536", "SELECT `TBM35_DEL_FLG`, `TBM35_CRF_ID`, `TBM35_STUDY_ID`, `TBM35_DISPLAY_FLG`, `TBM35_STUDY_AUTH_CD`, `TBM35_CRF_ITEM_CD` FROM `TBM35_CRF_ITEM_AUTH` WHERE (`TBM35_STUDY_ID` = ? and `TBM35_CRF_ID` = ?) AND (`TBM35_DEL_FLG` = '0') ORDER BY `TBM35_STUDY_ID`, `TBM35_CRF_ID`, `TBM35_CRF_ITEM_CD`, `TBM35_STUDY_AUTH_CD` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
         ,new ForEachCursor("P00537", "SELECT `TBM36_DEL_FLG`, `TBM36_CRF_ID`, `TBM36_STUDY_ID`, `TBM36_SELECT_CRF_ID`, `TBM36_COND_NO` FROM `TBM36_CRF_SELECT` WHERE (`TBM36_STUDY_ID` = ? and `TBM36_CRF_ID` = ?) AND (`TBM36_DEL_FLG` = '0') ORDER BY `TBM36_STUDY_ID`, `TBM36_CRF_ID`, `TBM36_COND_NO`, `TBM36_SELECT_CRF_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
         ,new ForEachCursor("P00538", "SELECT `TBM37_STUDY_ID`, `TBM37_CRF_ID`, `TBM37_DEL_FLG`, `TBM37_CRF_ITEM_GRP_DIV`, `TBM37_VISIT_NO`, `TBM37_DOM_CD`, `TBM37_DOM_VAR_NM`, `TBM37_DOM_ITM_GRP_OID`, `TBM37_DOM_ITM_GRP_ATTR_SEQ`, `TBM37_DOM_ITM_GRP_ROWNO`, `TBM37_CRF_ITEM_GRP_CD` FROM `TBM37_CRF_DOM_MAP` WHERE (`TBM37_STUDY_ID` = ? and `TBM37_CRF_ID` = ?) AND (`TBM37_DEL_FLG` = '0') ORDER BY `TBM37_STUDY_ID`, `TBM37_CRF_ID`, `TBM37_CRF_ITEM_GRP_CD` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
         ,new ForEachCursor("P00539", "SELECT `TBM41_STUDY_ID`, `TBM41_CRF_ID`, `TBM41_DEL_FLG`, `TBM41_CRF_ITEM_GRP_DIV`, `TBM41_NCM_METADATA_ID`, `TBM41_CRF_ITEM_GRP_CD` FROM `TBM41_CRF_NCM_MAP` WHERE (`TBM41_STUDY_ID` = ? and `TBM41_CRF_ID` = ?) AND (`TBM41_DEL_FLG` = '0') ORDER BY `TBM41_STUDY_ID`, `TBM41_CRF_ID`, `TBM41_CRF_ITEM_GRP_CD` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
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
               ((short[]) buf[2])[0] = rslt.getShort(2) ;
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               ((short[]) buf[4])[0] = rslt.getShort(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               break;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2) ;
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(8) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(9) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(10) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(11) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((byte[]) buf[22])[0] = rslt.getByte(13) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(14) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((byte[]) buf[26])[0] = rslt.getByte(15) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((byte[]) buf[40])[0] = rslt.getByte(22) ;
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((long[]) buf[44])[0] = rslt.getLong(24) ;
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((byte[]) buf[46])[0] = rslt.getByte(25) ;
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((long[]) buf[48])[0] = rslt.getLong(26) ;
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((String[]) buf[50])[0] = rslt.getVarchar(27) ;
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((String[]) buf[52])[0] = rslt.getVarchar(28) ;
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((short[]) buf[54])[0] = rslt.getShort(29) ;
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((byte[]) buf[56])[0] = rslt.getByte(30) ;
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((short[]) buf[58])[0] = rslt.getShort(31) ;
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((short[]) buf[60])[0] = rslt.getShort(32) ;
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((String[]) buf[62])[0] = rslt.getVarchar(33) ;
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((String[]) buf[64])[0] = rslt.getVarchar(34) ;
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((String[]) buf[66])[0] = rslt.getVarchar(35) ;
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((String[]) buf[68])[0] = rslt.getVarchar(36) ;
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((String[]) buf[70])[0] = rslt.getVarchar(37) ;
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((short[]) buf[72])[0] = rslt.getShort(38) ;
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((String[]) buf[74])[0] = rslt.getVarchar(39) ;
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((String[]) buf[76])[0] = rslt.getVarchar(40) ;
               break;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2) ;
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(8) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(14) ;
               break;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2) ;
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               break;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2) ;
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               break;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2) ;
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               ((short[]) buf[4])[0] = rslt.getShort(4) ;
               ((short[]) buf[5])[0] = rslt.getShort(5) ;
               break;
            case 6 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((short[]) buf[5])[0] = rslt.getShort(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(11) ;
               break;
            case 7 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               break;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               break;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               break;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               break;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               break;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               break;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               break;
      }
   }

}

