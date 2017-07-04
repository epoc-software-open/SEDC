/*
               File: B402_PC20_CRF_COPY
        Description: CRFéQè∆çÏê¨
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:15:49.49
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
      b402_pc20_crf_copy.this.aP4 = aP4;
      b402_pc20_crf_copy.this.aP5 = aP5;
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
      /* Execute user subroutine: S111 */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV39W_RTN_CD = (short)(0) ;
      AV40W_RTN_MSG = "" ;
      /* Execute user subroutine: S131 */
      S131 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: S141 */
      S141 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      Application.commit(context, remoteHandle, "DEFAULT", "b402_pc20_crf_copy");
      cleanup();
   }

   public void S111( )
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
         GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("1")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void S121( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV43Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S131( )
   {
      /* 'SUB_CRF_SELECT' Routine */
      AV46GXLvl76 = (byte)(0) ;
      /* Using cursor P00542 */
      pr_default.execute(0, new Object[] {new Long(AV18P_BASE_STUDY_ID), new Short(AV17P_BASE_CRF_ID)});
      if ( Gx_err != 0 )
      {
         AV46GXLvl76 = (byte)(1) ;
      }
      while ( (pr_default.getStatus(0) != 101) )
      {
         A397TBM31_DEL_FLG = P00542_A397TBM31_DEL_FLG[0] ;
         n397TBM31_DEL_FLG = P00542_n397TBM31_DEL_FLG[0] ;
         A69TBM31_CRF_ID = P00542_A69TBM31_CRF_ID[0] ;
         A68TBM31_STUDY_ID = P00542_A68TBM31_STUDY_ID[0] ;
         A528TBM31_DEF_VISIT_NO = P00542_A528TBM31_DEF_VISIT_NO[0] ;
         n528TBM31_DEF_VISIT_NO = P00542_n528TBM31_DEF_VISIT_NO[0] ;
         A529TBM31_DEF_DOMAIN_CD = P00542_A529TBM31_DEF_DOMAIN_CD[0] ;
         n529TBM31_DEF_DOMAIN_CD = P00542_n529TBM31_DEF_DOMAIN_CD[0] ;
         AV46GXLvl76 = (byte)(1) ;
         AV38W_TBM31_DEF_VISIT_NO = A528TBM31_DEF_VISIT_NO ;
         AV37W_TBM31_DEF_DOMAIN_CD = A529TBM31_DEF_DOMAIN_CD ;
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
      /* Using cursor P00543 */
      pr_default.execute(1, new Object[] {new Long(AV18P_BASE_STUDY_ID), new Short(AV17P_BASE_CRF_ID)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A75TBM32_DEL_FLG = P00543_A75TBM32_DEL_FLG[0] ;
         n75TBM32_DEL_FLG = P00543_n75TBM32_DEL_FLG[0] ;
         A71TBM32_CRF_ID = P00543_A71TBM32_CRF_ID[0] ;
         A70TBM32_STUDY_ID = P00543_A70TBM32_STUDY_ID[0] ;
         A405TBM32_CRF_ITEM_NM = P00543_A405TBM32_CRF_ITEM_NM[0] ;
         n405TBM32_CRF_ITEM_NM = P00543_n405TBM32_CRF_ITEM_NM[0] ;
         A74TBM32_CRF_ITEM_DIV = P00543_A74TBM32_CRF_ITEM_DIV[0] ;
         n74TBM32_CRF_ITEM_DIV = P00543_n74TBM32_CRF_ITEM_DIV[0] ;
         A73TBM32_CRF_ITEM_GRP_CD = P00543_A73TBM32_CRF_ITEM_GRP_CD[0] ;
         n73TBM32_CRF_ITEM_GRP_CD = P00543_n73TBM32_CRF_ITEM_GRP_CD[0] ;
         A507TBM32_CRF_ITEM_GRP_ORDER = P00543_A507TBM32_CRF_ITEM_GRP_ORDER[0] ;
         n507TBM32_CRF_ITEM_GRP_ORDER = P00543_n507TBM32_CRF_ITEM_GRP_ORDER[0] ;
         A508TBM32_LOCATION_X = P00543_A508TBM32_LOCATION_X[0] ;
         n508TBM32_LOCATION_X = P00543_n508TBM32_LOCATION_X[0] ;
         A509TBM32_LOCATION_Y = P00543_A509TBM32_LOCATION_Y[0] ;
         n509TBM32_LOCATION_Y = P00543_n509TBM32_LOCATION_Y[0] ;
         A510TBM32_LOCATION_X2 = P00543_A510TBM32_LOCATION_X2[0] ;
         n510TBM32_LOCATION_X2 = P00543_n510TBM32_LOCATION_X2[0] ;
         A511TBM32_LOCATION_Y2 = P00543_A511TBM32_LOCATION_Y2[0] ;
         n511TBM32_LOCATION_Y2 = P00543_n511TBM32_LOCATION_Y2[0] ;
         A512TBM32_TEXT_ALIGN_DIV = P00543_A512TBM32_TEXT_ALIGN_DIV[0] ;
         n512TBM32_TEXT_ALIGN_DIV = P00543_n512TBM32_TEXT_ALIGN_DIV[0] ;
         A516TBM32_TEXT_MAXROWS = P00543_A516TBM32_TEXT_MAXROWS[0] ;
         n516TBM32_TEXT_MAXROWS = P00543_n516TBM32_TEXT_MAXROWS[0] ;
         A517TBM32_TEXT_MAXLENGTH = P00543_A517TBM32_TEXT_MAXLENGTH[0] ;
         n517TBM32_TEXT_MAXLENGTH = P00543_n517TBM32_TEXT_MAXLENGTH[0] ;
         A518TBM32_DECIMAL_DIGITS = P00543_A518TBM32_DECIMAL_DIGITS[0] ;
         n518TBM32_DECIMAL_DIGITS = P00543_n518TBM32_DECIMAL_DIGITS[0] ;
         A522TBM32_CHK_TRUE_INNER_VALUE = P00543_A522TBM32_CHK_TRUE_INNER_VALUE[0] ;
         n522TBM32_CHK_TRUE_INNER_VALUE = P00543_n522TBM32_CHK_TRUE_INNER_VALUE[0] ;
         A523TBM32_CHK_FALSE_INNER_VALUE = P00543_A523TBM32_CHK_FALSE_INNER_VALUE[0] ;
         n523TBM32_CHK_FALSE_INNER_VALUE = P00543_n523TBM32_CHK_FALSE_INNER_VALUE[0] ;
         A527TBM32_FIXED_VALUE = P00543_A527TBM32_FIXED_VALUE[0] ;
         n527TBM32_FIXED_VALUE = P00543_n527TBM32_FIXED_VALUE[0] ;
         A525TBM32_LIST_CD = P00543_A525TBM32_LIST_CD[0] ;
         n525TBM32_LIST_CD = P00543_n525TBM32_LIST_CD[0] ;
         A526TBM32_IMAGE_CD = P00543_A526TBM32_IMAGE_CD[0] ;
         n526TBM32_IMAGE_CD = P00543_n526TBM32_IMAGE_CD[0] ;
         A524TBM32_TEXT = P00543_A524TBM32_TEXT[0] ;
         n524TBM32_TEXT = P00543_n524TBM32_TEXT[0] ;
         A513TBM32_FONT_SIZE = P00543_A513TBM32_FONT_SIZE[0] ;
         n513TBM32_FONT_SIZE = P00543_n513TBM32_FONT_SIZE[0] ;
         A514TBM32_FONT_UL_FLG = P00543_A514TBM32_FONT_UL_FLG[0] ;
         n514TBM32_FONT_UL_FLG = P00543_n514TBM32_FONT_UL_FLG[0] ;
         A515TBM32_FONT_COLOR_DIV = P00543_A515TBM32_FONT_COLOR_DIV[0] ;
         n515TBM32_FONT_COLOR_DIV = P00543_n515TBM32_FONT_COLOR_DIV[0] ;
         A521TBM32_LINE_SIZE_DIV = P00543_A521TBM32_LINE_SIZE_DIV[0] ;
         n521TBM32_LINE_SIZE_DIV = P00543_n521TBM32_LINE_SIZE_DIV[0] ;
         A689TBM32_LINE_COLOR_DIV = P00543_A689TBM32_LINE_COLOR_DIV[0] ;
         n689TBM32_LINE_COLOR_DIV = P00543_n689TBM32_LINE_COLOR_DIV[0] ;
         A519TBM32_LINE_START_POINT_DIV = P00543_A519TBM32_LINE_START_POINT_DIV[0] ;
         n519TBM32_LINE_START_POINT_DIV = P00543_n519TBM32_LINE_START_POINT_DIV[0] ;
         A520TBM32_LINE_END_POINT_DIV = P00543_A520TBM32_LINE_END_POINT_DIV[0] ;
         n520TBM32_LINE_END_POINT_DIV = P00543_n520TBM32_LINE_END_POINT_DIV[0] ;
         A690TBM32_LINE_ANGLE = P00543_A690TBM32_LINE_ANGLE[0] ;
         n690TBM32_LINE_ANGLE = P00543_n690TBM32_LINE_ANGLE[0] ;
         A644TBM32_AUTH_LVL_MIN = P00543_A644TBM32_AUTH_LVL_MIN[0] ;
         n644TBM32_AUTH_LVL_MIN = P00543_n644TBM32_AUTH_LVL_MIN[0] ;
         A645TBM32_ZORDER = P00543_A645TBM32_ZORDER[0] ;
         n645TBM32_ZORDER = P00543_n645TBM32_ZORDER[0] ;
         A691TBM32_TAB_ORDER = P00543_A691TBM32_TAB_ORDER[0] ;
         n691TBM32_TAB_ORDER = P00543_n691TBM32_TAB_ORDER[0] ;
         A692TBM32_TABSTOP_FLG = P00543_A692TBM32_TABSTOP_FLG[0] ;
         n692TBM32_TABSTOP_FLG = P00543_n692TBM32_TABSTOP_FLG[0] ;
         A693TBM32_REQUIRED_INPUT_FLG = P00543_A693TBM32_REQUIRED_INPUT_FLG[0] ;
         n693TBM32_REQUIRED_INPUT_FLG = P00543_n693TBM32_REQUIRED_INPUT_FLG[0] ;
         A694TBM32_MIN_VALUE = P00543_A694TBM32_MIN_VALUE[0] ;
         n694TBM32_MIN_VALUE = P00543_n694TBM32_MIN_VALUE[0] ;
         A695TBM32_MAX_VALUE = P00543_A695TBM32_MAX_VALUE[0] ;
         n695TBM32_MAX_VALUE = P00543_n695TBM32_MAX_VALUE[0] ;
         A406TBM32_CRF_ITEM_NOTE = P00543_A406TBM32_CRF_ITEM_NOTE[0] ;
         n406TBM32_CRF_ITEM_NOTE = P00543_n406TBM32_CRF_ITEM_NOTE[0] ;
         A774TBM32_REF_CRF_ID = P00543_A774TBM32_REF_CRF_ID[0] ;
         n774TBM32_REF_CRF_ID = P00543_n774TBM32_REF_CRF_ID[0] ;
         A775TBM32_REF_CRF_ITEM_CD = P00543_A775TBM32_REF_CRF_ITEM_CD[0] ;
         n775TBM32_REF_CRF_ITEM_CD = P00543_n775TBM32_REF_CRF_ITEM_CD[0] ;
         A72TBM32_CRF_ITEM_CD = P00543_A72TBM32_CRF_ITEM_CD[0] ;
         AV22SDT_TBM32_I = (SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem)new SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem(remoteHandle, context);
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_study_id( AV20P_STUDY_ID );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_id( AV19P_CRF_ID );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_cd( A72TBM32_CRF_ITEM_CD );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_nm( A405TBM32_CRF_ITEM_NM );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_div( A74TBM32_CRF_ITEM_DIV );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_grp_cd( A73TBM32_CRF_ITEM_GRP_CD );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_grp_order( A507TBM32_CRF_ITEM_GRP_ORDER );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_location_x( A508TBM32_LOCATION_X );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_location_y( A509TBM32_LOCATION_Y );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_location_x2( A510TBM32_LOCATION_X2 );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_location_y2( A511TBM32_LOCATION_Y2 );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_text_align_div( A512TBM32_TEXT_ALIGN_DIV );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_text_maxrows( A516TBM32_TEXT_MAXROWS );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_text_maxlength( A517TBM32_TEXT_MAXLENGTH );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_decimal_digits( A518TBM32_DECIMAL_DIGITS );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_chk_true_inner_value( A522TBM32_CHK_TRUE_INNER_VALUE );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_chk_false_inner_value( A523TBM32_CHK_FALSE_INNER_VALUE );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_fixed_value( A527TBM32_FIXED_VALUE );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_list_cd( A525TBM32_LIST_CD );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_image_cd( A526TBM32_IMAGE_CD );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_text( A524TBM32_TEXT );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_font_size( A513TBM32_FONT_SIZE );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_font_ul_flg( A514TBM32_FONT_UL_FLG );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_font_color_div( A515TBM32_FONT_COLOR_DIV );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_size_div( A521TBM32_LINE_SIZE_DIV );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_color_div( A689TBM32_LINE_COLOR_DIV );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_start_point_div( A519TBM32_LINE_START_POINT_DIV );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_end_point_div( A520TBM32_LINE_END_POINT_DIV );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_angle( A690TBM32_LINE_ANGLE );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_auth_lvl_min( A644TBM32_AUTH_LVL_MIN );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_zorder( A645TBM32_ZORDER );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_tab_order( A691TBM32_TAB_ORDER );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_tabstop_flg( A692TBM32_TABSTOP_FLG );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_required_input_flg( A693TBM32_REQUIRED_INPUT_FLG );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_min_value( A694TBM32_MIN_VALUE );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_max_value( A695TBM32_MAX_VALUE );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_note( A406TBM32_CRF_ITEM_NOTE );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_ref_crf_id( A774TBM32_REF_CRF_ID );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_ref_crf_item_cd( A775TBM32_REF_CRF_ITEM_CD );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_del_flg( A75TBM32_DEL_FLG );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crt_prog_nm( AV43Pgmname );
         AV22SDT_TBM32_I.setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_prog_nm( AV43Pgmname );
         AV21SDT_TBM32_C.add(AV22SDT_TBM32_I, 0);
         pr_default.readNext(1);
      }
      pr_default.close(1);
      /* Using cursor P00544 */
      pr_default.execute(2, new Object[] {new Long(AV18P_BASE_STUDY_ID), new Short(AV17P_BASE_CRF_ID)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A416TBM33_DEL_FLG = P00544_A416TBM33_DEL_FLG[0] ;
         n416TBM33_DEL_FLG = P00544_n416TBM33_DEL_FLG[0] ;
         A77TBM33_CRF_ID = P00544_A77TBM33_CRF_ID[0] ;
         A76TBM33_STUDY_ID = P00544_A76TBM33_STUDY_ID[0] ;
         A502TBM33_COND_NM = P00544_A502TBM33_COND_NM[0] ;
         n502TBM33_COND_NM = P00544_n502TBM33_COND_NM[0] ;
         A414TBM33_EXPRESSION = P00544_A414TBM33_EXPRESSION[0] ;
         n414TBM33_EXPRESSION = P00544_n414TBM33_EXPRESSION[0] ;
         A503TBM33_COND_DIV = P00544_A503TBM33_COND_DIV[0] ;
         n503TBM33_COND_DIV = P00544_n503TBM33_COND_DIV[0] ;
         A504TBM33_CRF_ITEM_CD = P00544_A504TBM33_CRF_ITEM_CD[0] ;
         n504TBM33_CRF_ITEM_CD = P00544_n504TBM33_CRF_ITEM_CD[0] ;
         A415TBM33_PRIOR_NO = P00544_A415TBM33_PRIOR_NO[0] ;
         n415TBM33_PRIOR_NO = P00544_n415TBM33_PRIOR_NO[0] ;
         A505TBM33_ERR_DIV = P00544_A505TBM33_ERR_DIV[0] ;
         n505TBM33_ERR_DIV = P00544_n505TBM33_ERR_DIV[0] ;
         A506TBM33_ERR_MSG = P00544_A506TBM33_ERR_MSG[0] ;
         n506TBM33_ERR_MSG = P00544_n506TBM33_ERR_MSG[0] ;
         A646TBM33_ENABLED_FLG = P00544_A646TBM33_ENABLED_FLG[0] ;
         n646TBM33_ENABLED_FLG = P00544_n646TBM33_ENABLED_FLG[0] ;
         A696TBM33_REQUIRED_INPUT_FLG = P00544_A696TBM33_REQUIRED_INPUT_FLG[0] ;
         n696TBM33_REQUIRED_INPUT_FLG = P00544_n696TBM33_REQUIRED_INPUT_FLG[0] ;
         A697TBM33_NUMERIC_RANGE_FLG = P00544_A697TBM33_NUMERIC_RANGE_FLG[0] ;
         n697TBM33_NUMERIC_RANGE_FLG = P00544_n697TBM33_NUMERIC_RANGE_FLG[0] ;
         A78TBM33_COND_NO = P00544_A78TBM33_COND_NO[0] ;
         AV24SDT_TBM33_I = (SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem)new SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem(remoteHandle, context);
         AV24SDT_TBM33_I.setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_study_id( AV20P_STUDY_ID );
         AV24SDT_TBM33_I.setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crf_id( AV19P_CRF_ID );
         AV24SDT_TBM33_I.setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_cond_no( A78TBM33_COND_NO );
         AV24SDT_TBM33_I.setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_cond_nm( A502TBM33_COND_NM );
         AV24SDT_TBM33_I.setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_expression( A414TBM33_EXPRESSION );
         AV24SDT_TBM33_I.setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_cond_div( A503TBM33_COND_DIV );
         AV24SDT_TBM33_I.setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crf_item_cd( A504TBM33_CRF_ITEM_CD );
         AV24SDT_TBM33_I.setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_prior_no( A415TBM33_PRIOR_NO );
         AV24SDT_TBM33_I.setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_err_div( A505TBM33_ERR_DIV );
         AV24SDT_TBM33_I.setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_err_msg( A506TBM33_ERR_MSG );
         AV24SDT_TBM33_I.setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_enabled_flg( A646TBM33_ENABLED_FLG );
         AV24SDT_TBM33_I.setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_required_input_flg( A696TBM33_REQUIRED_INPUT_FLG );
         AV24SDT_TBM33_I.setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_numeric_range_flg( A697TBM33_NUMERIC_RANGE_FLG );
         AV24SDT_TBM33_I.setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_del_flg( A416TBM33_DEL_FLG );
         AV24SDT_TBM33_I.setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crt_prog_nm( AV43Pgmname );
         AV24SDT_TBM33_I.setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_prog_nm( AV43Pgmname );
         AV23SDT_TBM33_C.add(AV24SDT_TBM33_I, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      /* Using cursor P00545 */
      pr_default.execute(3, new Object[] {new Long(AV18P_BASE_STUDY_ID), new Short(AV17P_BASE_CRF_ID)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A572TBM34_DEL_FLG = P00545_A572TBM34_DEL_FLG[0] ;
         n572TBM34_DEL_FLG = P00545_n572TBM34_DEL_FLG[0] ;
         A29TBM34_CRF_ID = P00545_A29TBM34_CRF_ID[0] ;
         A28TBM34_STUDY_ID = P00545_A28TBM34_STUDY_ID[0] ;
         A571TBM34_DISPLAY_FLG = P00545_A571TBM34_DISPLAY_FLG[0] ;
         n571TBM34_DISPLAY_FLG = P00545_n571TBM34_DISPLAY_FLG[0] ;
         A30TBM34_STYDY_AUTH_CD = P00545_A30TBM34_STYDY_AUTH_CD[0] ;
         AV26SDT_TBM34_I = (SdtB_TBM34_CRF_AUTH_B_TBM34_CRF_AUTHItem)new SdtB_TBM34_CRF_AUTH_B_TBM34_CRF_AUTHItem(remoteHandle, context);
         AV26SDT_TBM34_I.setgxTv_SdtB_TBM34_CRF_AUTH_B_TBM34_CRF_AUTHItem_Tbm34_study_id( AV20P_STUDY_ID );
         AV26SDT_TBM34_I.setgxTv_SdtB_TBM34_CRF_AUTH_B_TBM34_CRF_AUTHItem_Tbm34_crf_id( AV19P_CRF_ID );
         AV26SDT_TBM34_I.setgxTv_SdtB_TBM34_CRF_AUTH_B_TBM34_CRF_AUTHItem_Tbm34_stydy_auth_cd( A30TBM34_STYDY_AUTH_CD );
         AV26SDT_TBM34_I.setgxTv_SdtB_TBM34_CRF_AUTH_B_TBM34_CRF_AUTHItem_Tbm34_display_flg( A571TBM34_DISPLAY_FLG );
         AV26SDT_TBM34_I.setgxTv_SdtB_TBM34_CRF_AUTH_B_TBM34_CRF_AUTHItem_Tbm34_del_flg( A572TBM34_DEL_FLG );
         AV26SDT_TBM34_I.setgxTv_SdtB_TBM34_CRF_AUTH_B_TBM34_CRF_AUTHItem_Tbm34_crt_prog_nm( AV43Pgmname );
         AV26SDT_TBM34_I.setgxTv_SdtB_TBM34_CRF_AUTH_B_TBM34_CRF_AUTHItem_Tbm34_upd_prog_nm( AV43Pgmname );
         AV25SDT_TBM34_C.add(AV26SDT_TBM34_I, 0);
         pr_default.readNext(3);
      }
      pr_default.close(3);
      /* Using cursor P00546 */
      pr_default.execute(4, new Object[] {new Long(AV18P_BASE_STUDY_ID), new Short(AV17P_BASE_CRF_ID)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A581TBM35_DEL_FLG = P00546_A581TBM35_DEL_FLG[0] ;
         n581TBM35_DEL_FLG = P00546_n581TBM35_DEL_FLG[0] ;
         A32TBM35_CRF_ID = P00546_A32TBM35_CRF_ID[0] ;
         A31TBM35_STUDY_ID = P00546_A31TBM35_STUDY_ID[0] ;
         A580TBM35_DISPLAY_FLG = P00546_A580TBM35_DISPLAY_FLG[0] ;
         n580TBM35_DISPLAY_FLG = P00546_n580TBM35_DISPLAY_FLG[0] ;
         A34TBM35_STUDY_AUTH_CD = P00546_A34TBM35_STUDY_AUTH_CD[0] ;
         A33TBM35_CRF_ITEM_CD = P00546_A33TBM35_CRF_ITEM_CD[0] ;
         AV28SDT_TBM35_I = (SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem)new SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem(remoteHandle, context);
         AV28SDT_TBM35_I.setgxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_study_id( AV20P_STUDY_ID );
         AV28SDT_TBM35_I.setgxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_crf_id( AV19P_CRF_ID );
         AV28SDT_TBM35_I.setgxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_crf_item_cd( A33TBM35_CRF_ITEM_CD );
         AV28SDT_TBM35_I.setgxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_study_auth_cd( A34TBM35_STUDY_AUTH_CD );
         AV28SDT_TBM35_I.setgxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_display_flg( A580TBM35_DISPLAY_FLG );
         AV28SDT_TBM35_I.setgxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_del_flg( A581TBM35_DEL_FLG );
         AV28SDT_TBM35_I.setgxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_crt_prog_nm( AV43Pgmname );
         AV28SDT_TBM35_I.setgxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_upd_prog_nm( AV43Pgmname );
         AV27SDT_TBM35_C.add(AV28SDT_TBM35_I, 0);
         pr_default.readNext(4);
      }
      pr_default.close(4);
      /* Using cursor P00547 */
      pr_default.execute(5, new Object[] {new Long(AV18P_BASE_STUDY_ID), new Short(AV17P_BASE_CRF_ID)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A589TBM36_DEL_FLG = P00547_A589TBM36_DEL_FLG[0] ;
         n589TBM36_DEL_FLG = P00547_n589TBM36_DEL_FLG[0] ;
         A36TBM36_CRF_ID = P00547_A36TBM36_CRF_ID[0] ;
         A35TBM36_STUDY_ID = P00547_A35TBM36_STUDY_ID[0] ;
         A38TBM36_SELECT_CRF_ID = P00547_A38TBM36_SELECT_CRF_ID[0] ;
         A37TBM36_COND_NO = P00547_A37TBM36_COND_NO[0] ;
         AV30SDT_TBM36_I = (SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem)new SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem(remoteHandle, context);
         AV30SDT_TBM36_I.setgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_study_id( AV20P_STUDY_ID );
         AV30SDT_TBM36_I.setgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crf_id( AV19P_CRF_ID );
         AV30SDT_TBM36_I.setgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_cond_no( A37TBM36_COND_NO );
         AV30SDT_TBM36_I.setgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_select_crf_id( A38TBM36_SELECT_CRF_ID );
         AV30SDT_TBM36_I.setgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_del_flg( A589TBM36_DEL_FLG );
         AV30SDT_TBM36_I.setgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_prog_nm( AV43Pgmname );
         AV30SDT_TBM36_I.setgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_prog_nm( AV43Pgmname );
         AV29SDT_TBM36_C.add(AV30SDT_TBM36_I, 0);
         pr_default.readNext(5);
      }
      pr_default.close(5);
      /* Using cursor P00548 */
      pr_default.execute(6, new Object[] {new Long(AV18P_BASE_STUDY_ID), new Short(AV17P_BASE_CRF_ID)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A79TBM37_STUDY_ID = P00548_A79TBM37_STUDY_ID[0] ;
         A80TBM37_CRF_ID = P00548_A80TBM37_CRF_ID[0] ;
         A433TBM37_DEL_FLG = P00548_A433TBM37_DEL_FLG[0] ;
         n433TBM37_DEL_FLG = P00548_n433TBM37_DEL_FLG[0] ;
         A81TBM37_CRF_ITEM_GRP_DIV = P00548_A81TBM37_CRF_ITEM_GRP_DIV[0] ;
         A83TBM37_VISIT_NO = P00548_A83TBM37_VISIT_NO[0] ;
         n83TBM37_VISIT_NO = P00548_n83TBM37_VISIT_NO[0] ;
         A84TBM37_DOM_CD = P00548_A84TBM37_DOM_CD[0] ;
         n84TBM37_DOM_CD = P00548_n84TBM37_DOM_CD[0] ;
         A500TBM37_DOM_VAR_NM = P00548_A500TBM37_DOM_VAR_NM[0] ;
         n500TBM37_DOM_VAR_NM = P00548_n500TBM37_DOM_VAR_NM[0] ;
         A85TBM37_DOM_ITM_GRP_OID = P00548_A85TBM37_DOM_ITM_GRP_OID[0] ;
         n85TBM37_DOM_ITM_GRP_OID = P00548_n85TBM37_DOM_ITM_GRP_OID[0] ;
         A501TBM37_DOM_ITM_GRP_ATTR_SEQ = P00548_A501TBM37_DOM_ITM_GRP_ATTR_SEQ[0] ;
         n501TBM37_DOM_ITM_GRP_ATTR_SEQ = P00548_n501TBM37_DOM_ITM_GRP_ATTR_SEQ[0] ;
         A86TBM37_DOM_ITM_GRP_ROWNO = P00548_A86TBM37_DOM_ITM_GRP_ROWNO[0] ;
         n86TBM37_DOM_ITM_GRP_ROWNO = P00548_n86TBM37_DOM_ITM_GRP_ROWNO[0] ;
         A82TBM37_CRF_ITEM_GRP_CD = P00548_A82TBM37_CRF_ITEM_GRP_CD[0] ;
         AV32SDT_TBM37_I = (SdtB_TBM37_CRF_DOM_MAP_B_TBM37_CRF_DOM_MAPItem)new SdtB_TBM37_CRF_DOM_MAP_B_TBM37_CRF_DOM_MAPItem(remoteHandle, context);
         AV32SDT_TBM37_I.setgxTv_SdtB_TBM37_CRF_DOM_MAP_B_TBM37_CRF_DOM_MAPItem_Tbm37_study_id( AV20P_STUDY_ID );
         AV32SDT_TBM37_I.setgxTv_SdtB_TBM37_CRF_DOM_MAP_B_TBM37_CRF_DOM_MAPItem_Tbm37_crf_id( AV19P_CRF_ID );
         AV32SDT_TBM37_I.setgxTv_SdtB_TBM37_CRF_DOM_MAP_B_TBM37_CRF_DOM_MAPItem_Tbm37_crf_item_grp_div( A81TBM37_CRF_ITEM_GRP_DIV );
         AV32SDT_TBM37_I.setgxTv_SdtB_TBM37_CRF_DOM_MAP_B_TBM37_CRF_DOM_MAPItem_Tbm37_crf_item_grp_cd( A82TBM37_CRF_ITEM_GRP_CD );
         AV32SDT_TBM37_I.setgxTv_SdtB_TBM37_CRF_DOM_MAP_B_TBM37_CRF_DOM_MAPItem_Tbm37_visit_no( A83TBM37_VISIT_NO );
         AV32SDT_TBM37_I.setgxTv_SdtB_TBM37_CRF_DOM_MAP_B_TBM37_CRF_DOM_MAPItem_Tbm37_dom_cd( A84TBM37_DOM_CD );
         AV32SDT_TBM37_I.setgxTv_SdtB_TBM37_CRF_DOM_MAP_B_TBM37_CRF_DOM_MAPItem_Tbm37_dom_var_nm( A500TBM37_DOM_VAR_NM );
         AV32SDT_TBM37_I.setgxTv_SdtB_TBM37_CRF_DOM_MAP_B_TBM37_CRF_DOM_MAPItem_Tbm37_dom_itm_grp_oid( A85TBM37_DOM_ITM_GRP_OID );
         AV32SDT_TBM37_I.setgxTv_SdtB_TBM37_CRF_DOM_MAP_B_TBM37_CRF_DOM_MAPItem_Tbm37_dom_itm_grp_attr_seq( A501TBM37_DOM_ITM_GRP_ATTR_SEQ );
         AV32SDT_TBM37_I.setgxTv_SdtB_TBM37_CRF_DOM_MAP_B_TBM37_CRF_DOM_MAPItem_Tbm37_dom_itm_grp_rowno( A86TBM37_DOM_ITM_GRP_ROWNO );
         AV32SDT_TBM37_I.setgxTv_SdtB_TBM37_CRF_DOM_MAP_B_TBM37_CRF_DOM_MAPItem_Tbm37_del_flg( A433TBM37_DEL_FLG );
         AV32SDT_TBM37_I.setgxTv_SdtB_TBM37_CRF_DOM_MAP_B_TBM37_CRF_DOM_MAPItem_Tbm37_crt_prog_nm( AV43Pgmname );
         AV32SDT_TBM37_I.setgxTv_SdtB_TBM37_CRF_DOM_MAP_B_TBM37_CRF_DOM_MAPItem_Tbm37_upd_prog_nm( AV43Pgmname );
         AV31SDT_TBM37_C.add(AV32SDT_TBM37_I, 0);
         pr_default.readNext(6);
      }
      pr_default.close(6);
      /* Using cursor P00549 */
      pr_default.execute(7, new Object[] {new Long(AV18P_BASE_STUDY_ID), new Short(AV17P_BASE_CRF_ID)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A19TBM41_STUDY_ID = P00549_A19TBM41_STUDY_ID[0] ;
         A20TBM41_CRF_ID = P00549_A20TBM41_CRF_ID[0] ;
         A425TBM41_DEL_FLG = P00549_A425TBM41_DEL_FLG[0] ;
         n425TBM41_DEL_FLG = P00549_n425TBM41_DEL_FLG[0] ;
         A21TBM41_CRF_ITEM_GRP_DIV = P00549_A21TBM41_CRF_ITEM_GRP_DIV[0] ;
         A424TBM41_NCM_METADATA_ID = P00549_A424TBM41_NCM_METADATA_ID[0] ;
         n424TBM41_NCM_METADATA_ID = P00549_n424TBM41_NCM_METADATA_ID[0] ;
         A22TBM41_CRF_ITEM_GRP_CD = P00549_A22TBM41_CRF_ITEM_GRP_CD[0] ;
         AV34SDT_TBM41_I = (SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem)new SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem(remoteHandle, context);
         AV34SDT_TBM41_I.setgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_study_id( AV20P_STUDY_ID );
         AV34SDT_TBM41_I.setgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crf_id( AV19P_CRF_ID );
         AV34SDT_TBM41_I.setgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crf_item_grp_div( A21TBM41_CRF_ITEM_GRP_DIV );
         AV34SDT_TBM41_I.setgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crf_item_grp_cd( A22TBM41_CRF_ITEM_GRP_CD );
         AV34SDT_TBM41_I.setgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_ncm_metadata_id( A424TBM41_NCM_METADATA_ID );
         AV34SDT_TBM41_I.setgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_del_flg( A425TBM41_DEL_FLG );
         AV34SDT_TBM41_I.setgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crt_prog_nm( AV43Pgmname );
         AV34SDT_TBM41_I.setgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_prog_nm( AV43Pgmname );
         AV33SDT_TBM41_C.add(AV34SDT_TBM41_I, 0);
         pr_default.readNext(7);
      }
      pr_default.close(7);
   }

   public void S141( )
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
      AV40W_RTN_MSG = "" ;
      AV16C_TAM02_APP_ID = "" ;
      AV35W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      GXv_SdtA_LOGIN_SDT1 = new SdtA_LOGIN_SDT [1] ;
      AV36W_ERRCD = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV43Pgmname = "" ;
      A529TBM31_DEF_DOMAIN_CD = "" ;
      scmdbuf = "" ;
      P00542_A397TBM31_DEL_FLG = new String[] {""} ;
      P00542_n397TBM31_DEL_FLG = new boolean[] {false} ;
      P00542_A69TBM31_CRF_ID = new short[1] ;
      P00542_A68TBM31_STUDY_ID = new long[1] ;
      P00542_A528TBM31_DEF_VISIT_NO = new int[1] ;
      P00542_n528TBM31_DEF_VISIT_NO = new boolean[] {false} ;
      P00542_A529TBM31_DEF_DOMAIN_CD = new String[] {""} ;
      P00542_n529TBM31_DEF_DOMAIN_CD = new boolean[] {false} ;
      A397TBM31_DEL_FLG = "" ;
      AV37W_TBM31_DEF_DOMAIN_CD = "" ;
      P00543_A75TBM32_DEL_FLG = new String[] {""} ;
      P00543_n75TBM32_DEL_FLG = new boolean[] {false} ;
      P00543_A71TBM32_CRF_ID = new short[1] ;
      P00543_A70TBM32_STUDY_ID = new long[1] ;
      P00543_A405TBM32_CRF_ITEM_NM = new String[] {""} ;
      P00543_n405TBM32_CRF_ITEM_NM = new boolean[] {false} ;
      P00543_A74TBM32_CRF_ITEM_DIV = new String[] {""} ;
      P00543_n74TBM32_CRF_ITEM_DIV = new boolean[] {false} ;
      P00543_A73TBM32_CRF_ITEM_GRP_CD = new String[] {""} ;
      P00543_n73TBM32_CRF_ITEM_GRP_CD = new boolean[] {false} ;
      P00543_A507TBM32_CRF_ITEM_GRP_ORDER = new short[1] ;
      P00543_n507TBM32_CRF_ITEM_GRP_ORDER = new boolean[] {false} ;
      P00543_A508TBM32_LOCATION_X = new short[1] ;
      P00543_n508TBM32_LOCATION_X = new boolean[] {false} ;
      P00543_A509TBM32_LOCATION_Y = new short[1] ;
      P00543_n509TBM32_LOCATION_Y = new boolean[] {false} ;
      P00543_A510TBM32_LOCATION_X2 = new short[1] ;
      P00543_n510TBM32_LOCATION_X2 = new boolean[] {false} ;
      P00543_A511TBM32_LOCATION_Y2 = new short[1] ;
      P00543_n511TBM32_LOCATION_Y2 = new boolean[] {false} ;
      P00543_A512TBM32_TEXT_ALIGN_DIV = new String[] {""} ;
      P00543_n512TBM32_TEXT_ALIGN_DIV = new boolean[] {false} ;
      P00543_A516TBM32_TEXT_MAXROWS = new byte[1] ;
      P00543_n516TBM32_TEXT_MAXROWS = new boolean[] {false} ;
      P00543_A517TBM32_TEXT_MAXLENGTH = new short[1] ;
      P00543_n517TBM32_TEXT_MAXLENGTH = new boolean[] {false} ;
      P00543_A518TBM32_DECIMAL_DIGITS = new byte[1] ;
      P00543_n518TBM32_DECIMAL_DIGITS = new boolean[] {false} ;
      P00543_A522TBM32_CHK_TRUE_INNER_VALUE = new String[] {""} ;
      P00543_n522TBM32_CHK_TRUE_INNER_VALUE = new boolean[] {false} ;
      P00543_A523TBM32_CHK_FALSE_INNER_VALUE = new String[] {""} ;
      P00543_n523TBM32_CHK_FALSE_INNER_VALUE = new boolean[] {false} ;
      P00543_A527TBM32_FIXED_VALUE = new String[] {""} ;
      P00543_n527TBM32_FIXED_VALUE = new boolean[] {false} ;
      P00543_A525TBM32_LIST_CD = new String[] {""} ;
      P00543_n525TBM32_LIST_CD = new boolean[] {false} ;
      P00543_A526TBM32_IMAGE_CD = new String[] {""} ;
      P00543_n526TBM32_IMAGE_CD = new boolean[] {false} ;
      P00543_A524TBM32_TEXT = new String[] {""} ;
      P00543_n524TBM32_TEXT = new boolean[] {false} ;
      P00543_A513TBM32_FONT_SIZE = new byte[1] ;
      P00543_n513TBM32_FONT_SIZE = new boolean[] {false} ;
      P00543_A514TBM32_FONT_UL_FLG = new String[] {""} ;
      P00543_n514TBM32_FONT_UL_FLG = new boolean[] {false} ;
      P00543_A515TBM32_FONT_COLOR_DIV = new long[1] ;
      P00543_n515TBM32_FONT_COLOR_DIV = new boolean[] {false} ;
      P00543_A521TBM32_LINE_SIZE_DIV = new byte[1] ;
      P00543_n521TBM32_LINE_SIZE_DIV = new boolean[] {false} ;
      P00543_A689TBM32_LINE_COLOR_DIV = new long[1] ;
      P00543_n689TBM32_LINE_COLOR_DIV = new boolean[] {false} ;
      P00543_A519TBM32_LINE_START_POINT_DIV = new String[] {""} ;
      P00543_n519TBM32_LINE_START_POINT_DIV = new boolean[] {false} ;
      P00543_A520TBM32_LINE_END_POINT_DIV = new String[] {""} ;
      P00543_n520TBM32_LINE_END_POINT_DIV = new boolean[] {false} ;
      P00543_A690TBM32_LINE_ANGLE = new short[1] ;
      P00543_n690TBM32_LINE_ANGLE = new boolean[] {false} ;
      P00543_A644TBM32_AUTH_LVL_MIN = new byte[1] ;
      P00543_n644TBM32_AUTH_LVL_MIN = new boolean[] {false} ;
      P00543_A645TBM32_ZORDER = new short[1] ;
      P00543_n645TBM32_ZORDER = new boolean[] {false} ;
      P00543_A691TBM32_TAB_ORDER = new short[1] ;
      P00543_n691TBM32_TAB_ORDER = new boolean[] {false} ;
      P00543_A692TBM32_TABSTOP_FLG = new String[] {""} ;
      P00543_n692TBM32_TABSTOP_FLG = new boolean[] {false} ;
      P00543_A693TBM32_REQUIRED_INPUT_FLG = new String[] {""} ;
      P00543_n693TBM32_REQUIRED_INPUT_FLG = new boolean[] {false} ;
      P00543_A694TBM32_MIN_VALUE = new String[] {""} ;
      P00543_n694TBM32_MIN_VALUE = new boolean[] {false} ;
      P00543_A695TBM32_MAX_VALUE = new String[] {""} ;
      P00543_n695TBM32_MAX_VALUE = new boolean[] {false} ;
      P00543_A406TBM32_CRF_ITEM_NOTE = new String[] {""} ;
      P00543_n406TBM32_CRF_ITEM_NOTE = new boolean[] {false} ;
      P00543_A774TBM32_REF_CRF_ID = new short[1] ;
      P00543_n774TBM32_REF_CRF_ID = new boolean[] {false} ;
      P00543_A775TBM32_REF_CRF_ITEM_CD = new String[] {""} ;
      P00543_n775TBM32_REF_CRF_ITEM_CD = new boolean[] {false} ;
      P00543_A72TBM32_CRF_ITEM_CD = new String[] {""} ;
      A75TBM32_DEL_FLG = "" ;
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
      A72TBM32_CRF_ITEM_CD = "" ;
      AV22SDT_TBM32_I = new SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem(remoteHandle, context);
      AV21SDT_TBM32_C = new GxObjectCollection(SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem.class, "B_TBM32_CRF_ITEM_SDT.B_TBM32_CRF_ITEM_SDTItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      P00544_A416TBM33_DEL_FLG = new String[] {""} ;
      P00544_n416TBM33_DEL_FLG = new boolean[] {false} ;
      P00544_A77TBM33_CRF_ID = new short[1] ;
      P00544_A76TBM33_STUDY_ID = new long[1] ;
      P00544_A502TBM33_COND_NM = new String[] {""} ;
      P00544_n502TBM33_COND_NM = new boolean[] {false} ;
      P00544_A414TBM33_EXPRESSION = new String[] {""} ;
      P00544_n414TBM33_EXPRESSION = new boolean[] {false} ;
      P00544_A503TBM33_COND_DIV = new String[] {""} ;
      P00544_n503TBM33_COND_DIV = new boolean[] {false} ;
      P00544_A504TBM33_CRF_ITEM_CD = new String[] {""} ;
      P00544_n504TBM33_CRF_ITEM_CD = new boolean[] {false} ;
      P00544_A415TBM33_PRIOR_NO = new byte[1] ;
      P00544_n415TBM33_PRIOR_NO = new boolean[] {false} ;
      P00544_A505TBM33_ERR_DIV = new String[] {""} ;
      P00544_n505TBM33_ERR_DIV = new boolean[] {false} ;
      P00544_A506TBM33_ERR_MSG = new String[] {""} ;
      P00544_n506TBM33_ERR_MSG = new boolean[] {false} ;
      P00544_A646TBM33_ENABLED_FLG = new String[] {""} ;
      P00544_n646TBM33_ENABLED_FLG = new boolean[] {false} ;
      P00544_A696TBM33_REQUIRED_INPUT_FLG = new String[] {""} ;
      P00544_n696TBM33_REQUIRED_INPUT_FLG = new boolean[] {false} ;
      P00544_A697TBM33_NUMERIC_RANGE_FLG = new String[] {""} ;
      P00544_n697TBM33_NUMERIC_RANGE_FLG = new boolean[] {false} ;
      P00544_A78TBM33_COND_NO = new short[1] ;
      A416TBM33_DEL_FLG = "" ;
      A502TBM33_COND_NM = "" ;
      A414TBM33_EXPRESSION = "" ;
      A503TBM33_COND_DIV = "" ;
      A504TBM33_CRF_ITEM_CD = "" ;
      A505TBM33_ERR_DIV = "" ;
      A506TBM33_ERR_MSG = "" ;
      A646TBM33_ENABLED_FLG = "" ;
      A696TBM33_REQUIRED_INPUT_FLG = "" ;
      A697TBM33_NUMERIC_RANGE_FLG = "" ;
      AV24SDT_TBM33_I = new SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem(remoteHandle, context);
      AV23SDT_TBM33_C = new GxObjectCollection(SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem.class, "B_TBM33_CRF_COND.B_TBM33_CRF_CONDItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      P00545_A572TBM34_DEL_FLG = new String[] {""} ;
      P00545_n572TBM34_DEL_FLG = new boolean[] {false} ;
      P00545_A29TBM34_CRF_ID = new short[1] ;
      P00545_A28TBM34_STUDY_ID = new long[1] ;
      P00545_A571TBM34_DISPLAY_FLG = new String[] {""} ;
      P00545_n571TBM34_DISPLAY_FLG = new boolean[] {false} ;
      P00545_A30TBM34_STYDY_AUTH_CD = new String[] {""} ;
      A572TBM34_DEL_FLG = "" ;
      A571TBM34_DISPLAY_FLG = "" ;
      A30TBM34_STYDY_AUTH_CD = "" ;
      AV26SDT_TBM34_I = new SdtB_TBM34_CRF_AUTH_B_TBM34_CRF_AUTHItem(remoteHandle, context);
      AV25SDT_TBM34_C = new GxObjectCollection(SdtB_TBM34_CRF_AUTH_B_TBM34_CRF_AUTHItem.class, "B_TBM34_CRF_AUTH.B_TBM34_CRF_AUTHItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      P00546_A581TBM35_DEL_FLG = new String[] {""} ;
      P00546_n581TBM35_DEL_FLG = new boolean[] {false} ;
      P00546_A32TBM35_CRF_ID = new short[1] ;
      P00546_A31TBM35_STUDY_ID = new long[1] ;
      P00546_A580TBM35_DISPLAY_FLG = new String[] {""} ;
      P00546_n580TBM35_DISPLAY_FLG = new boolean[] {false} ;
      P00546_A34TBM35_STUDY_AUTH_CD = new String[] {""} ;
      P00546_A33TBM35_CRF_ITEM_CD = new String[] {""} ;
      A581TBM35_DEL_FLG = "" ;
      A580TBM35_DISPLAY_FLG = "" ;
      A34TBM35_STUDY_AUTH_CD = "" ;
      A33TBM35_CRF_ITEM_CD = "" ;
      AV28SDT_TBM35_I = new SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem(remoteHandle, context);
      AV27SDT_TBM35_C = new GxObjectCollection(SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem.class, "B_TBM35_CRF_ITEM_AUTH.B_TBM35_CRF_ITEM_AUTHItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      P00547_A589TBM36_DEL_FLG = new String[] {""} ;
      P00547_n589TBM36_DEL_FLG = new boolean[] {false} ;
      P00547_A36TBM36_CRF_ID = new short[1] ;
      P00547_A35TBM36_STUDY_ID = new long[1] ;
      P00547_A38TBM36_SELECT_CRF_ID = new short[1] ;
      P00547_A37TBM36_COND_NO = new short[1] ;
      A589TBM36_DEL_FLG = "" ;
      AV30SDT_TBM36_I = new SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem(remoteHandle, context);
      AV29SDT_TBM36_C = new GxObjectCollection(SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem.class, "B_TBM36_CRF_SELECT.B_TBM36_CRF_SELECTItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      P00548_A79TBM37_STUDY_ID = new long[1] ;
      P00548_A80TBM37_CRF_ID = new short[1] ;
      P00548_A433TBM37_DEL_FLG = new String[] {""} ;
      P00548_n433TBM37_DEL_FLG = new boolean[] {false} ;
      P00548_A81TBM37_CRF_ITEM_GRP_DIV = new String[] {""} ;
      P00548_A83TBM37_VISIT_NO = new int[1] ;
      P00548_n83TBM37_VISIT_NO = new boolean[] {false} ;
      P00548_A84TBM37_DOM_CD = new String[] {""} ;
      P00548_n84TBM37_DOM_CD = new boolean[] {false} ;
      P00548_A500TBM37_DOM_VAR_NM = new String[] {""} ;
      P00548_n500TBM37_DOM_VAR_NM = new boolean[] {false} ;
      P00548_A85TBM37_DOM_ITM_GRP_OID = new String[] {""} ;
      P00548_n85TBM37_DOM_ITM_GRP_OID = new boolean[] {false} ;
      P00548_A501TBM37_DOM_ITM_GRP_ATTR_SEQ = new short[1] ;
      P00548_n501TBM37_DOM_ITM_GRP_ATTR_SEQ = new boolean[] {false} ;
      P00548_A86TBM37_DOM_ITM_GRP_ROWNO = new short[1] ;
      P00548_n86TBM37_DOM_ITM_GRP_ROWNO = new boolean[] {false} ;
      P00548_A82TBM37_CRF_ITEM_GRP_CD = new String[] {""} ;
      A433TBM37_DEL_FLG = "" ;
      A81TBM37_CRF_ITEM_GRP_DIV = "" ;
      A84TBM37_DOM_CD = "" ;
      A500TBM37_DOM_VAR_NM = "" ;
      A85TBM37_DOM_ITM_GRP_OID = "" ;
      A82TBM37_CRF_ITEM_GRP_CD = "" ;
      AV32SDT_TBM37_I = new SdtB_TBM37_CRF_DOM_MAP_B_TBM37_CRF_DOM_MAPItem(remoteHandle, context);
      AV31SDT_TBM37_C = new GxObjectCollection(SdtB_TBM37_CRF_DOM_MAP_B_TBM37_CRF_DOM_MAPItem.class, "B_TBM37_CRF_DOM_MAP.B_TBM37_CRF_DOM_MAPItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      P00549_A19TBM41_STUDY_ID = new long[1] ;
      P00549_A20TBM41_CRF_ID = new short[1] ;
      P00549_A425TBM41_DEL_FLG = new String[] {""} ;
      P00549_n425TBM41_DEL_FLG = new boolean[] {false} ;
      P00549_A21TBM41_CRF_ITEM_GRP_DIV = new String[] {""} ;
      P00549_A424TBM41_NCM_METADATA_ID = new String[] {""} ;
      P00549_n424TBM41_NCM_METADATA_ID = new boolean[] {false} ;
      P00549_A22TBM41_CRF_ITEM_GRP_CD = new String[] {""} ;
      A425TBM41_DEL_FLG = "" ;
      A21TBM41_CRF_ITEM_GRP_DIV = "" ;
      A424TBM41_NCM_METADATA_ID = "" ;
      A22TBM41_CRF_ITEM_GRP_CD = "" ;
      AV34SDT_TBM41_I = new SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem(remoteHandle, context);
      AV33SDT_TBM41_C = new GxObjectCollection(SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem.class, "B_TBM41_CRF_NCM_MAP.B_TBM41_CRF_NCM_MAPItem", "tablet-EDC_GXXEV3U3", remoteHandle);
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
            P00542_A397TBM31_DEL_FLG, P00542_n397TBM31_DEL_FLG, P00542_A69TBM31_CRF_ID, P00542_A68TBM31_STUDY_ID, P00542_A528TBM31_DEF_VISIT_NO, P00542_n528TBM31_DEF_VISIT_NO, P00542_A529TBM31_DEF_DOMAIN_CD, P00542_n529TBM31_DEF_DOMAIN_CD
            }
            , new Object[] {
            P00543_A75TBM32_DEL_FLG, P00543_n75TBM32_DEL_FLG, P00543_A71TBM32_CRF_ID, P00543_A70TBM32_STUDY_ID, P00543_A405TBM32_CRF_ITEM_NM, P00543_n405TBM32_CRF_ITEM_NM, P00543_A74TBM32_CRF_ITEM_DIV, P00543_n74TBM32_CRF_ITEM_DIV, P00543_A73TBM32_CRF_ITEM_GRP_CD, P00543_n73TBM32_CRF_ITEM_GRP_CD,
            P00543_A507TBM32_CRF_ITEM_GRP_ORDER, P00543_n507TBM32_CRF_ITEM_GRP_ORDER, P00543_A508TBM32_LOCATION_X, P00543_n508TBM32_LOCATION_X, P00543_A509TBM32_LOCATION_Y, P00543_n509TBM32_LOCATION_Y, P00543_A510TBM32_LOCATION_X2, P00543_n510TBM32_LOCATION_X2, P00543_A511TBM32_LOCATION_Y2, P00543_n511TBM32_LOCATION_Y2,
            P00543_A512TBM32_TEXT_ALIGN_DIV, P00543_n512TBM32_TEXT_ALIGN_DIV, P00543_A516TBM32_TEXT_MAXROWS, P00543_n516TBM32_TEXT_MAXROWS, P00543_A517TBM32_TEXT_MAXLENGTH, P00543_n517TBM32_TEXT_MAXLENGTH, P00543_A518TBM32_DECIMAL_DIGITS, P00543_n518TBM32_DECIMAL_DIGITS, P00543_A522TBM32_CHK_TRUE_INNER_VALUE, P00543_n522TBM32_CHK_TRUE_INNER_VALUE,
            P00543_A523TBM32_CHK_FALSE_INNER_VALUE, P00543_n523TBM32_CHK_FALSE_INNER_VALUE, P00543_A527TBM32_FIXED_VALUE, P00543_n527TBM32_FIXED_VALUE, P00543_A525TBM32_LIST_CD, P00543_n525TBM32_LIST_CD, P00543_A526TBM32_IMAGE_CD, P00543_n526TBM32_IMAGE_CD, P00543_A524TBM32_TEXT, P00543_n524TBM32_TEXT,
            P00543_A513TBM32_FONT_SIZE, P00543_n513TBM32_FONT_SIZE, P00543_A514TBM32_FONT_UL_FLG, P00543_n514TBM32_FONT_UL_FLG, P00543_A515TBM32_FONT_COLOR_DIV, P00543_n515TBM32_FONT_COLOR_DIV, P00543_A521TBM32_LINE_SIZE_DIV, P00543_n521TBM32_LINE_SIZE_DIV, P00543_A689TBM32_LINE_COLOR_DIV, P00543_n689TBM32_LINE_COLOR_DIV,
            P00543_A519TBM32_LINE_START_POINT_DIV, P00543_n519TBM32_LINE_START_POINT_DIV, P00543_A520TBM32_LINE_END_POINT_DIV, P00543_n520TBM32_LINE_END_POINT_DIV, P00543_A690TBM32_LINE_ANGLE, P00543_n690TBM32_LINE_ANGLE, P00543_A644TBM32_AUTH_LVL_MIN, P00543_n644TBM32_AUTH_LVL_MIN, P00543_A645TBM32_ZORDER, P00543_n645TBM32_ZORDER,
            P00543_A691TBM32_TAB_ORDER, P00543_n691TBM32_TAB_ORDER, P00543_A692TBM32_TABSTOP_FLG, P00543_n692TBM32_TABSTOP_FLG, P00543_A693TBM32_REQUIRED_INPUT_FLG, P00543_n693TBM32_REQUIRED_INPUT_FLG, P00543_A694TBM32_MIN_VALUE, P00543_n694TBM32_MIN_VALUE, P00543_A695TBM32_MAX_VALUE, P00543_n695TBM32_MAX_VALUE,
            P00543_A406TBM32_CRF_ITEM_NOTE, P00543_n406TBM32_CRF_ITEM_NOTE, P00543_A774TBM32_REF_CRF_ID, P00543_n774TBM32_REF_CRF_ID, P00543_A775TBM32_REF_CRF_ITEM_CD, P00543_n775TBM32_REF_CRF_ITEM_CD, P00543_A72TBM32_CRF_ITEM_CD
            }
            , new Object[] {
            P00544_A416TBM33_DEL_FLG, P00544_n416TBM33_DEL_FLG, P00544_A77TBM33_CRF_ID, P00544_A76TBM33_STUDY_ID, P00544_A502TBM33_COND_NM, P00544_n502TBM33_COND_NM, P00544_A414TBM33_EXPRESSION, P00544_n414TBM33_EXPRESSION, P00544_A503TBM33_COND_DIV, P00544_n503TBM33_COND_DIV,
            P00544_A504TBM33_CRF_ITEM_CD, P00544_n504TBM33_CRF_ITEM_CD, P00544_A415TBM33_PRIOR_NO, P00544_n415TBM33_PRIOR_NO, P00544_A505TBM33_ERR_DIV, P00544_n505TBM33_ERR_DIV, P00544_A506TBM33_ERR_MSG, P00544_n506TBM33_ERR_MSG, P00544_A646TBM33_ENABLED_FLG, P00544_n646TBM33_ENABLED_FLG,
            P00544_A696TBM33_REQUIRED_INPUT_FLG, P00544_n696TBM33_REQUIRED_INPUT_FLG, P00544_A697TBM33_NUMERIC_RANGE_FLG, P00544_n697TBM33_NUMERIC_RANGE_FLG, P00544_A78TBM33_COND_NO
            }
            , new Object[] {
            P00545_A572TBM34_DEL_FLG, P00545_n572TBM34_DEL_FLG, P00545_A29TBM34_CRF_ID, P00545_A28TBM34_STUDY_ID, P00545_A571TBM34_DISPLAY_FLG, P00545_n571TBM34_DISPLAY_FLG, P00545_A30TBM34_STYDY_AUTH_CD
            }
            , new Object[] {
            P00546_A581TBM35_DEL_FLG, P00546_n581TBM35_DEL_FLG, P00546_A32TBM35_CRF_ID, P00546_A31TBM35_STUDY_ID, P00546_A580TBM35_DISPLAY_FLG, P00546_n580TBM35_DISPLAY_FLG, P00546_A34TBM35_STUDY_AUTH_CD, P00546_A33TBM35_CRF_ITEM_CD
            }
            , new Object[] {
            P00547_A589TBM36_DEL_FLG, P00547_n589TBM36_DEL_FLG, P00547_A36TBM36_CRF_ID, P00547_A35TBM36_STUDY_ID, P00547_A38TBM36_SELECT_CRF_ID, P00547_A37TBM36_COND_NO
            }
            , new Object[] {
            P00548_A79TBM37_STUDY_ID, P00548_A80TBM37_CRF_ID, P00548_A433TBM37_DEL_FLG, P00548_n433TBM37_DEL_FLG, P00548_A81TBM37_CRF_ITEM_GRP_DIV, P00548_A83TBM37_VISIT_NO, P00548_n83TBM37_VISIT_NO, P00548_A84TBM37_DOM_CD, P00548_n84TBM37_DOM_CD, P00548_A500TBM37_DOM_VAR_NM,
            P00548_n500TBM37_DOM_VAR_NM, P00548_A85TBM37_DOM_ITM_GRP_OID, P00548_n85TBM37_DOM_ITM_GRP_OID, P00548_A501TBM37_DOM_ITM_GRP_ATTR_SEQ, P00548_n501TBM37_DOM_ITM_GRP_ATTR_SEQ, P00548_A86TBM37_DOM_ITM_GRP_ROWNO, P00548_n86TBM37_DOM_ITM_GRP_ROWNO, P00548_A82TBM37_CRF_ITEM_GRP_CD
            }
            , new Object[] {
            P00549_A19TBM41_STUDY_ID, P00549_A20TBM41_CRF_ID, P00549_A425TBM41_DEL_FLG, P00549_n425TBM41_DEL_FLG, P00549_A21TBM41_CRF_ITEM_GRP_DIV, P00549_A424TBM41_NCM_METADATA_ID, P00549_n424TBM41_NCM_METADATA_ID, P00549_A22TBM41_CRF_ITEM_GRP_CD
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
   private byte A516TBM32_TEXT_MAXROWS ;
   private byte A518TBM32_DECIMAL_DIGITS ;
   private byte A513TBM32_FONT_SIZE ;
   private byte A521TBM32_LINE_SIZE_DIV ;
   private byte A644TBM32_AUTH_LVL_MIN ;
   private byte A415TBM33_PRIOR_NO ;
   private short AV19P_CRF_ID ;
   private short AV17P_BASE_CRF_ID ;
   private short AV39W_RTN_CD ;
   private short Gx_err ;
   private short A69TBM31_CRF_ID ;
   private short A71TBM32_CRF_ID ;
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
   private short A77TBM33_CRF_ID ;
   private short A78TBM33_COND_NO ;
   private short A29TBM34_CRF_ID ;
   private short A32TBM35_CRF_ID ;
   private short A36TBM36_CRF_ID ;
   private short A38TBM36_SELECT_CRF_ID ;
   private short A37TBM36_COND_NO ;
   private short A80TBM37_CRF_ID ;
   private short A501TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private short A86TBM37_DOM_ITM_GRP_ROWNO ;
   private short A20TBM41_CRF_ID ;
   private int GXActiveErrHndl ;
   private int A528TBM31_DEF_VISIT_NO ;
   private int AV38W_TBM31_DEF_VISIT_NO ;
   private int A83TBM37_VISIT_NO ;
   private int AV54GXV1 ;
   private int AV55GXV2 ;
   private int AV56GXV3 ;
   private int AV57GXV4 ;
   private int AV58GXV5 ;
   private int AV59GXV6 ;
   private int AV60GXV7 ;
   private long AV20P_STUDY_ID ;
   private long AV18P_BASE_STUDY_ID ;
   private long A68TBM31_STUDY_ID ;
   private long A70TBM32_STUDY_ID ;
   private long A515TBM32_FONT_COLOR_DIV ;
   private long A689TBM32_LINE_COLOR_DIV ;
   private long A76TBM33_STUDY_ID ;
   private long A28TBM34_STUDY_ID ;
   private long A31TBM35_STUDY_ID ;
   private long A35TBM36_STUDY_ID ;
   private long A79TBM37_STUDY_ID ;
   private long A19TBM41_STUDY_ID ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String AV43Pgmname ;
   private String scmdbuf ;
   private String GXt_char3 ;
   private String GXv_char2[] ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private boolean n397TBM31_DEL_FLG ;
   private boolean n528TBM31_DEF_VISIT_NO ;
   private boolean n529TBM31_DEF_DOMAIN_CD ;
   private boolean n75TBM32_DEL_FLG ;
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
   private boolean n416TBM33_DEL_FLG ;
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
   private boolean n572TBM34_DEL_FLG ;
   private boolean n571TBM34_DISPLAY_FLG ;
   private boolean n581TBM35_DEL_FLG ;
   private boolean n580TBM35_DISPLAY_FLG ;
   private boolean n589TBM36_DEL_FLG ;
   private boolean n433TBM37_DEL_FLG ;
   private boolean n83TBM37_VISIT_NO ;
   private boolean n84TBM37_DOM_CD ;
   private boolean n500TBM37_DOM_VAR_NM ;
   private boolean n85TBM37_DOM_ITM_GRP_OID ;
   private boolean n501TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private boolean n86TBM37_DOM_ITM_GRP_ROWNO ;
   private boolean n425TBM41_DEL_FLG ;
   private boolean n424TBM41_NCM_METADATA_ID ;
   private String AV40W_RTN_MSG ;
   private String AV16C_TAM02_APP_ID ;
   private String AV36W_ERRCD ;
   private String A529TBM31_DEF_DOMAIN_CD ;
   private String A397TBM31_DEL_FLG ;
   private String AV37W_TBM31_DEF_DOMAIN_CD ;
   private String A75TBM32_DEL_FLG ;
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
   private String A72TBM32_CRF_ITEM_CD ;
   private String A416TBM33_DEL_FLG ;
   private String A502TBM33_COND_NM ;
   private String A414TBM33_EXPRESSION ;
   private String A503TBM33_COND_DIV ;
   private String A504TBM33_CRF_ITEM_CD ;
   private String A505TBM33_ERR_DIV ;
   private String A506TBM33_ERR_MSG ;
   private String A646TBM33_ENABLED_FLG ;
   private String A696TBM33_REQUIRED_INPUT_FLG ;
   private String A697TBM33_NUMERIC_RANGE_FLG ;
   private String A572TBM34_DEL_FLG ;
   private String A571TBM34_DISPLAY_FLG ;
   private String A30TBM34_STYDY_AUTH_CD ;
   private String A581TBM35_DEL_FLG ;
   private String A580TBM35_DISPLAY_FLG ;
   private String A34TBM35_STUDY_AUTH_CD ;
   private String A33TBM35_CRF_ITEM_CD ;
   private String A589TBM36_DEL_FLG ;
   private String A433TBM37_DEL_FLG ;
   private String A81TBM37_CRF_ITEM_GRP_DIV ;
   private String A84TBM37_DOM_CD ;
   private String A500TBM37_DOM_VAR_NM ;
   private String A85TBM37_DOM_ITM_GRP_OID ;
   private String A82TBM37_CRF_ITEM_GRP_CD ;
   private String A425TBM41_DEL_FLG ;
   private String A21TBM41_CRF_ITEM_GRP_DIV ;
   private String A424TBM41_NCM_METADATA_ID ;
   private String A22TBM41_CRF_ITEM_GRP_CD ;
   private short[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P00542_A397TBM31_DEL_FLG ;
   private boolean[] P00542_n397TBM31_DEL_FLG ;
   private short[] P00542_A69TBM31_CRF_ID ;
   private long[] P00542_A68TBM31_STUDY_ID ;
   private int[] P00542_A528TBM31_DEF_VISIT_NO ;
   private boolean[] P00542_n528TBM31_DEF_VISIT_NO ;
   private String[] P00542_A529TBM31_DEF_DOMAIN_CD ;
   private boolean[] P00542_n529TBM31_DEF_DOMAIN_CD ;
   private String[] P00543_A75TBM32_DEL_FLG ;
   private boolean[] P00543_n75TBM32_DEL_FLG ;
   private short[] P00543_A71TBM32_CRF_ID ;
   private long[] P00543_A70TBM32_STUDY_ID ;
   private String[] P00543_A405TBM32_CRF_ITEM_NM ;
   private boolean[] P00543_n405TBM32_CRF_ITEM_NM ;
   private String[] P00543_A74TBM32_CRF_ITEM_DIV ;
   private boolean[] P00543_n74TBM32_CRF_ITEM_DIV ;
   private String[] P00543_A73TBM32_CRF_ITEM_GRP_CD ;
   private boolean[] P00543_n73TBM32_CRF_ITEM_GRP_CD ;
   private short[] P00543_A507TBM32_CRF_ITEM_GRP_ORDER ;
   private boolean[] P00543_n507TBM32_CRF_ITEM_GRP_ORDER ;
   private short[] P00543_A508TBM32_LOCATION_X ;
   private boolean[] P00543_n508TBM32_LOCATION_X ;
   private short[] P00543_A509TBM32_LOCATION_Y ;
   private boolean[] P00543_n509TBM32_LOCATION_Y ;
   private short[] P00543_A510TBM32_LOCATION_X2 ;
   private boolean[] P00543_n510TBM32_LOCATION_X2 ;
   private short[] P00543_A511TBM32_LOCATION_Y2 ;
   private boolean[] P00543_n511TBM32_LOCATION_Y2 ;
   private String[] P00543_A512TBM32_TEXT_ALIGN_DIV ;
   private boolean[] P00543_n512TBM32_TEXT_ALIGN_DIV ;
   private byte[] P00543_A516TBM32_TEXT_MAXROWS ;
   private boolean[] P00543_n516TBM32_TEXT_MAXROWS ;
   private short[] P00543_A517TBM32_TEXT_MAXLENGTH ;
   private boolean[] P00543_n517TBM32_TEXT_MAXLENGTH ;
   private byte[] P00543_A518TBM32_DECIMAL_DIGITS ;
   private boolean[] P00543_n518TBM32_DECIMAL_DIGITS ;
   private String[] P00543_A522TBM32_CHK_TRUE_INNER_VALUE ;
   private boolean[] P00543_n522TBM32_CHK_TRUE_INNER_VALUE ;
   private String[] P00543_A523TBM32_CHK_FALSE_INNER_VALUE ;
   private boolean[] P00543_n523TBM32_CHK_FALSE_INNER_VALUE ;
   private String[] P00543_A527TBM32_FIXED_VALUE ;
   private boolean[] P00543_n527TBM32_FIXED_VALUE ;
   private String[] P00543_A525TBM32_LIST_CD ;
   private boolean[] P00543_n525TBM32_LIST_CD ;
   private String[] P00543_A526TBM32_IMAGE_CD ;
   private boolean[] P00543_n526TBM32_IMAGE_CD ;
   private String[] P00543_A524TBM32_TEXT ;
   private boolean[] P00543_n524TBM32_TEXT ;
   private byte[] P00543_A513TBM32_FONT_SIZE ;
   private boolean[] P00543_n513TBM32_FONT_SIZE ;
   private String[] P00543_A514TBM32_FONT_UL_FLG ;
   private boolean[] P00543_n514TBM32_FONT_UL_FLG ;
   private long[] P00543_A515TBM32_FONT_COLOR_DIV ;
   private boolean[] P00543_n515TBM32_FONT_COLOR_DIV ;
   private byte[] P00543_A521TBM32_LINE_SIZE_DIV ;
   private boolean[] P00543_n521TBM32_LINE_SIZE_DIV ;
   private long[] P00543_A689TBM32_LINE_COLOR_DIV ;
   private boolean[] P00543_n689TBM32_LINE_COLOR_DIV ;
   private String[] P00543_A519TBM32_LINE_START_POINT_DIV ;
   private boolean[] P00543_n519TBM32_LINE_START_POINT_DIV ;
   private String[] P00543_A520TBM32_LINE_END_POINT_DIV ;
   private boolean[] P00543_n520TBM32_LINE_END_POINT_DIV ;
   private short[] P00543_A690TBM32_LINE_ANGLE ;
   private boolean[] P00543_n690TBM32_LINE_ANGLE ;
   private byte[] P00543_A644TBM32_AUTH_LVL_MIN ;
   private boolean[] P00543_n644TBM32_AUTH_LVL_MIN ;
   private short[] P00543_A645TBM32_ZORDER ;
   private boolean[] P00543_n645TBM32_ZORDER ;
   private short[] P00543_A691TBM32_TAB_ORDER ;
   private boolean[] P00543_n691TBM32_TAB_ORDER ;
   private String[] P00543_A692TBM32_TABSTOP_FLG ;
   private boolean[] P00543_n692TBM32_TABSTOP_FLG ;
   private String[] P00543_A693TBM32_REQUIRED_INPUT_FLG ;
   private boolean[] P00543_n693TBM32_REQUIRED_INPUT_FLG ;
   private String[] P00543_A694TBM32_MIN_VALUE ;
   private boolean[] P00543_n694TBM32_MIN_VALUE ;
   private String[] P00543_A695TBM32_MAX_VALUE ;
   private boolean[] P00543_n695TBM32_MAX_VALUE ;
   private String[] P00543_A406TBM32_CRF_ITEM_NOTE ;
   private boolean[] P00543_n406TBM32_CRF_ITEM_NOTE ;
   private short[] P00543_A774TBM32_REF_CRF_ID ;
   private boolean[] P00543_n774TBM32_REF_CRF_ID ;
   private String[] P00543_A775TBM32_REF_CRF_ITEM_CD ;
   private boolean[] P00543_n775TBM32_REF_CRF_ITEM_CD ;
   private String[] P00543_A72TBM32_CRF_ITEM_CD ;
   private String[] P00544_A416TBM33_DEL_FLG ;
   private boolean[] P00544_n416TBM33_DEL_FLG ;
   private short[] P00544_A77TBM33_CRF_ID ;
   private long[] P00544_A76TBM33_STUDY_ID ;
   private String[] P00544_A502TBM33_COND_NM ;
   private boolean[] P00544_n502TBM33_COND_NM ;
   private String[] P00544_A414TBM33_EXPRESSION ;
   private boolean[] P00544_n414TBM33_EXPRESSION ;
   private String[] P00544_A503TBM33_COND_DIV ;
   private boolean[] P00544_n503TBM33_COND_DIV ;
   private String[] P00544_A504TBM33_CRF_ITEM_CD ;
   private boolean[] P00544_n504TBM33_CRF_ITEM_CD ;
   private byte[] P00544_A415TBM33_PRIOR_NO ;
   private boolean[] P00544_n415TBM33_PRIOR_NO ;
   private String[] P00544_A505TBM33_ERR_DIV ;
   private boolean[] P00544_n505TBM33_ERR_DIV ;
   private String[] P00544_A506TBM33_ERR_MSG ;
   private boolean[] P00544_n506TBM33_ERR_MSG ;
   private String[] P00544_A646TBM33_ENABLED_FLG ;
   private boolean[] P00544_n646TBM33_ENABLED_FLG ;
   private String[] P00544_A696TBM33_REQUIRED_INPUT_FLG ;
   private boolean[] P00544_n696TBM33_REQUIRED_INPUT_FLG ;
   private String[] P00544_A697TBM33_NUMERIC_RANGE_FLG ;
   private boolean[] P00544_n697TBM33_NUMERIC_RANGE_FLG ;
   private short[] P00544_A78TBM33_COND_NO ;
   private String[] P00545_A572TBM34_DEL_FLG ;
   private boolean[] P00545_n572TBM34_DEL_FLG ;
   private short[] P00545_A29TBM34_CRF_ID ;
   private long[] P00545_A28TBM34_STUDY_ID ;
   private String[] P00545_A571TBM34_DISPLAY_FLG ;
   private boolean[] P00545_n571TBM34_DISPLAY_FLG ;
   private String[] P00545_A30TBM34_STYDY_AUTH_CD ;
   private String[] P00546_A581TBM35_DEL_FLG ;
   private boolean[] P00546_n581TBM35_DEL_FLG ;
   private short[] P00546_A32TBM35_CRF_ID ;
   private long[] P00546_A31TBM35_STUDY_ID ;
   private String[] P00546_A580TBM35_DISPLAY_FLG ;
   private boolean[] P00546_n580TBM35_DISPLAY_FLG ;
   private String[] P00546_A34TBM35_STUDY_AUTH_CD ;
   private String[] P00546_A33TBM35_CRF_ITEM_CD ;
   private String[] P00547_A589TBM36_DEL_FLG ;
   private boolean[] P00547_n589TBM36_DEL_FLG ;
   private short[] P00547_A36TBM36_CRF_ID ;
   private long[] P00547_A35TBM36_STUDY_ID ;
   private short[] P00547_A38TBM36_SELECT_CRF_ID ;
   private short[] P00547_A37TBM36_COND_NO ;
   private long[] P00548_A79TBM37_STUDY_ID ;
   private short[] P00548_A80TBM37_CRF_ID ;
   private String[] P00548_A433TBM37_DEL_FLG ;
   private boolean[] P00548_n433TBM37_DEL_FLG ;
   private String[] P00548_A81TBM37_CRF_ITEM_GRP_DIV ;
   private int[] P00548_A83TBM37_VISIT_NO ;
   private boolean[] P00548_n83TBM37_VISIT_NO ;
   private String[] P00548_A84TBM37_DOM_CD ;
   private boolean[] P00548_n84TBM37_DOM_CD ;
   private String[] P00548_A500TBM37_DOM_VAR_NM ;
   private boolean[] P00548_n500TBM37_DOM_VAR_NM ;
   private String[] P00548_A85TBM37_DOM_ITM_GRP_OID ;
   private boolean[] P00548_n85TBM37_DOM_ITM_GRP_OID ;
   private short[] P00548_A501TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private boolean[] P00548_n501TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private short[] P00548_A86TBM37_DOM_ITM_GRP_ROWNO ;
   private boolean[] P00548_n86TBM37_DOM_ITM_GRP_ROWNO ;
   private String[] P00548_A82TBM37_CRF_ITEM_GRP_CD ;
   private long[] P00549_A19TBM41_STUDY_ID ;
   private short[] P00549_A20TBM41_CRF_ID ;
   private String[] P00549_A425TBM41_DEL_FLG ;
   private boolean[] P00549_n425TBM41_DEL_FLG ;
   private String[] P00549_A21TBM41_CRF_ITEM_GRP_DIV ;
   private String[] P00549_A424TBM41_NCM_METADATA_ID ;
   private boolean[] P00549_n424TBM41_NCM_METADATA_ID ;
   private String[] P00549_A22TBM41_CRF_ITEM_GRP_CD ;
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
          new ForEachCursor("P00542", "SELECT `TBM31_DEL_FLG`, `TBM31_CRF_ID`, `TBM31_STUDY_ID`, `TBM31_DEF_VISIT_NO`, `TBM31_DEF_DOMAIN_CD` FROM `TBM31_CRF` WHERE (`TBM31_STUDY_ID` = ? and `TBM31_CRF_ID` = ?) AND (`TBM31_DEL_FLG` = '0') ORDER BY `TBM31_STUDY_ID`, `TBM31_CRF_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P00543", "SELECT `TBM32_DEL_FLG`, `TBM32_CRF_ID`, `TBM32_STUDY_ID`, `TBM32_CRF_ITEM_NM`, `TBM32_CRF_ITEM_DIV`, `TBM32_CRF_ITEM_GRP_CD`, `TBM32_CRF_ITEM_GRP_ORDER`, `TBM32_LOCATION_X`, `TBM32_LOCATION_Y`, `TBM32_LOCATION_X2`, `TBM32_LOCATION_Y2`, `TBM32_TEXT_ALIGN_DIV`, `TBM32_TEXT_MAXROWS`, `TBM32_TEXT_MAXLENGTH`, `TBM32_DECIMAL_DIGITS`, `TBM32_CHK_TRUE_INNER_VALUE`, `TBM32_CHK_FALSE_INNER_VALUE`, `TBM32_FIXED_VALUE`, `TBM32_LIST_CD`, `TBM32_IMAGE_CD`, `TBM32_TEXT`, `TBM32_FONT_SIZE`, `TBM32_FONT_UL_FLG`, `TBM32_FONT_COLOR_DIV`, `TBM32_LINE_SIZE_DIV`, `TBM32_LINE_COLOR_DIV`, `TBM32_LINE_START_POINT_DIV`, `TBM32_LINE_END_POINT_DIV`, `TBM32_LINE_ANGLE`, `TBM32_AUTH_LVL_MIN`, `TBM32_ZORDER`, `TBM32_TAB_ORDER`, `TBM32_TABSTOP_FLG`, `TBM32_REQUIRED_INPUT_FLG`, `TBM32_MIN_VALUE`, `TBM32_MAX_VALUE`, `TBM32_CRF_ITEM_NOTE`, `TBM32_REF_CRF_ID`, `TBM32_REF_CRF_ITEM_CD`, `TBM32_CRF_ITEM_CD` FROM `TBM32_CRF_ITEM` WHERE (`TBM32_STUDY_ID` = ? and `TBM32_CRF_ID` = ?) AND (`TBM32_DEL_FLG` = '0') ORDER BY `TBM32_STUDY_ID`, `TBM32_CRF_ID`, `TBM32_CRF_ITEM_CD` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P00544", "SELECT `TBM33_DEL_FLG`, `TBM33_CRF_ID`, `TBM33_STUDY_ID`, `TBM33_COND_NM`, `TBM33_EXPRESSION`, `TBM33_COND_DIV`, `TBM33_CRF_ITEM_CD`, `TBM33_PRIOR_NO`, `TBM33_ERR_DIV`, `TBM33_ERR_MSG`, `TBM33_ENABLED_FLG`, `TBM33_REQUIRED_INPUT_FLG`, `TBM33_NUMERIC_RANGE_FLG`, `TBM33_COND_NO` FROM `TBM33_CRF_COND` WHERE (`TBM33_STUDY_ID` = ? and `TBM33_CRF_ID` = ?) AND (`TBM33_DEL_FLG` = '0') ORDER BY `TBM33_STUDY_ID`, `TBM33_CRF_ID`, `TBM33_COND_NO` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P00545", "SELECT `TBM34_DEL_FLG`, `TBM34_CRF_ID`, `TBM34_STUDY_ID`, `TBM34_DISPLAY_FLG`, `TBM34_STYDY_AUTH_CD` FROM `TBM34_CRF_AUTH` WHERE (`TBM34_STUDY_ID` = ? and `TBM34_CRF_ID` = ?) AND (`TBM34_DEL_FLG` = '0') ORDER BY `TBM34_STUDY_ID`, `TBM34_CRF_ID`, `TBM34_STYDY_AUTH_CD` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P00546", "SELECT `TBM35_DEL_FLG`, `TBM35_CRF_ID`, `TBM35_STUDY_ID`, `TBM35_DISPLAY_FLG`, `TBM35_STUDY_AUTH_CD`, `TBM35_CRF_ITEM_CD` FROM `TBM35_CRF_ITEM_AUTH` WHERE (`TBM35_STUDY_ID` = ? and `TBM35_CRF_ID` = ?) AND (`TBM35_DEL_FLG` = '0') ORDER BY `TBM35_STUDY_ID`, `TBM35_CRF_ID`, `TBM35_CRF_ITEM_CD`, `TBM35_STUDY_AUTH_CD` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P00547", "SELECT `TBM36_DEL_FLG`, `TBM36_CRF_ID`, `TBM36_STUDY_ID`, `TBM36_SELECT_CRF_ID`, `TBM36_COND_NO` FROM `TBM36_CRF_SELECT` WHERE (`TBM36_STUDY_ID` = ? and `TBM36_CRF_ID` = ?) AND (`TBM36_DEL_FLG` = '0') ORDER BY `TBM36_STUDY_ID`, `TBM36_CRF_ID`, `TBM36_COND_NO`, `TBM36_SELECT_CRF_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P00548", "SELECT `TBM37_STUDY_ID`, `TBM37_CRF_ID`, `TBM37_DEL_FLG`, `TBM37_CRF_ITEM_GRP_DIV`, `TBM37_VISIT_NO`, `TBM37_DOM_CD`, `TBM37_DOM_VAR_NM`, `TBM37_DOM_ITM_GRP_OID`, `TBM37_DOM_ITM_GRP_ATTR_SEQ`, `TBM37_DOM_ITM_GRP_ROWNO`, `TBM37_CRF_ITEM_GRP_CD` FROM `TBM37_CRF_DOM_MAP` WHERE (`TBM37_STUDY_ID` = ? and `TBM37_CRF_ID` = ?) AND (`TBM37_DEL_FLG` = '0') ORDER BY `TBM37_STUDY_ID`, `TBM37_CRF_ID`, `TBM37_CRF_ITEM_GRP_CD` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P00549", "SELECT `TBM41_STUDY_ID`, `TBM41_CRF_ID`, `TBM41_DEL_FLG`, `TBM41_CRF_ITEM_GRP_DIV`, `TBM41_NCM_METADATA_ID`, `TBM41_CRF_ITEM_GRP_CD` FROM `TBM41_CRF_NCM_MAP` WHERE (`TBM41_STUDY_ID` = ? and `TBM41_CRF_ID` = ?) AND (`TBM41_DEL_FLG` = '0') ORDER BY `TBM41_STUDY_ID`, `TBM41_CRF_ID`, `TBM41_CRF_ITEM_GRP_CD` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
               ((int[]) buf[4])[0] = rslt.getInt(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
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
               return;
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
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2) ;
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2) ;
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2) ;
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               ((short[]) buf[4])[0] = rslt.getShort(4) ;
               ((short[]) buf[5])[0] = rslt.getShort(5) ;
               return;
            case 6 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((int[]) buf[5])[0] = rslt.getInt(5) ;
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
               return;
            case 7 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

