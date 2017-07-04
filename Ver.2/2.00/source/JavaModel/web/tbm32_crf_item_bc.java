/*
               File: tbm32_crf_item_bc
        Description: CRF項目マスタ
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:14:50.53
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbm32_crf_item_bc extends GXWebPanel implements IGxSilentTrn
{
   public tbm32_crf_item_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbm32_crf_item_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbm32_crf_item_bc.class ));
   }

   public tbm32_crf_item_bc( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow0K19( ) ;
      standaloneNotModal( ) ;
      initializeNonKey0K19( ) ;
      standaloneModal( ) ;
      addRow0K19( ) ;
      Gx_mode = "INS" ;
   }

   public void afterTrn( )
   {
      if ( trnEnded == 1 )
      {
         /* Execute user event: e120L2 */
         e120L2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            Z70TBM32_STUDY_ID = A70TBM32_STUDY_ID ;
            Z71TBM32_CRF_ID = A71TBM32_CRF_ID ;
            Z72TBM32_CRF_ITEM_CD = A72TBM32_CRF_ITEM_CD ;
            SetMode( "UPD") ;
         }
      }
   }

   public String toString( )
   {
      return "" ;
   }

   public GXContentInfo getContentInfo( )
   {
      return (GXContentInfo)(null) ;
   }

   public boolean Reindex( )
   {
      return true ;
   }

   public void confirm_0K0( )
   {
      beforeValidate0K19( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls0K19( ) ;
         }
         else
         {
            checkExtendedTable0K19( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors0K19( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void e110L2( )
   {
      /* Start Routine */
      AV8W_BC_FLG = "0" ;
      AV8W_BC_FLG = "1" ;
      if ( GXutil.strcmp(AV8W_BC_FLG, "1") != 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV9Pgmname, "ERR", "禁止機能") ;
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("8")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void e120L2( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV9Pgmname) ;
      AV7W_TXT = "" ;
      AV7W_TXT = AV7W_TXT + "試験ID:" + GXutil.trim( GXutil.str( A70TBM32_STUDY_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A71TBM32_CRF_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A72TBM32_CRF_ITEM_CD + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A405TBM32_CRF_ITEM_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A74TBM32_CRF_ITEM_DIV + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A73TBM32_CRF_ITEM_GRP_CD + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A507TBM32_CRF_ITEM_GRP_ORDER, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A508TBM32_LOCATION_X, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A509TBM32_LOCATION_Y, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A510TBM32_LOCATION_X2, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A511TBM32_LOCATION_Y2, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A512TBM32_TEXT_ALIGN_DIV + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A516TBM32_TEXT_MAXROWS, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A517TBM32_TEXT_MAXLENGTH, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A518TBM32_DECIMAL_DIGITS, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A522TBM32_CHK_TRUE_INNER_VALUE + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A523TBM32_CHK_FALSE_INNER_VALUE + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A527TBM32_FIXED_VALUE + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A525TBM32_LIST_CD + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A526TBM32_IMAGE_CD + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A524TBM32_TEXT + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A513TBM32_FONT_SIZE, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A514TBM32_FONT_UL_FLG + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A515TBM32_FONT_COLOR_DIV, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A521TBM32_LINE_SIZE_DIV, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A689TBM32_LINE_COLOR_DIV, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A519TBM32_LINE_START_POINT_DIV + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A520TBM32_LINE_END_POINT_DIV + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A690TBM32_LINE_ANGLE, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A644TBM32_AUTH_LVL_MIN, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A645TBM32_ZORDER, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A691TBM32_TAB_ORDER, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A692TBM32_TABSTOP_FLG + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A693TBM32_REQUIRED_INPUT_FLG + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A694TBM32_MIN_VALUE + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A695TBM32_MAX_VALUE + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A406TBM32_CRF_ITEM_NOTE + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A774TBM32_REF_CRF_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A775TBM32_REF_CRF_ITEM_CD + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A75TBM32_DEL_FLG + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A407TBM32_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm32_crf_item_bc.this.GXt_char1 = GXv_char2[0] ;
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A408TBM32_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A409TBM32_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A410TBM32_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm32_crf_item_bc.this.GXt_char1 = GXv_char2[0] ;
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A411TBM32_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A412TBM32_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A413TBM32_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = GXutil.strReplace( AV7W_TXT, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "@br@") ;
      new a804_pc03_datalog(remoteHandle, context).execute( AV9Pgmname, Gx_mode, AV7W_TXT) ;
   }

   public void S112( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV9Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void zm0K19( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         Z407TBM32_CRT_DATETIME = A407TBM32_CRT_DATETIME ;
         Z408TBM32_CRT_USER_ID = A408TBM32_CRT_USER_ID ;
         Z410TBM32_UPD_DATETIME = A410TBM32_UPD_DATETIME ;
         Z411TBM32_UPD_USER_ID = A411TBM32_UPD_USER_ID ;
         Z413TBM32_UPD_CNT = A413TBM32_UPD_CNT ;
         Z405TBM32_CRF_ITEM_NM = A405TBM32_CRF_ITEM_NM ;
         Z74TBM32_CRF_ITEM_DIV = A74TBM32_CRF_ITEM_DIV ;
         Z73TBM32_CRF_ITEM_GRP_CD = A73TBM32_CRF_ITEM_GRP_CD ;
         Z507TBM32_CRF_ITEM_GRP_ORDER = A507TBM32_CRF_ITEM_GRP_ORDER ;
         Z508TBM32_LOCATION_X = A508TBM32_LOCATION_X ;
         Z509TBM32_LOCATION_Y = A509TBM32_LOCATION_Y ;
         Z510TBM32_LOCATION_X2 = A510TBM32_LOCATION_X2 ;
         Z511TBM32_LOCATION_Y2 = A511TBM32_LOCATION_Y2 ;
         Z512TBM32_TEXT_ALIGN_DIV = A512TBM32_TEXT_ALIGN_DIV ;
         Z516TBM32_TEXT_MAXROWS = A516TBM32_TEXT_MAXROWS ;
         Z517TBM32_TEXT_MAXLENGTH = A517TBM32_TEXT_MAXLENGTH ;
         Z518TBM32_DECIMAL_DIGITS = A518TBM32_DECIMAL_DIGITS ;
         Z522TBM32_CHK_TRUE_INNER_VALUE = A522TBM32_CHK_TRUE_INNER_VALUE ;
         Z523TBM32_CHK_FALSE_INNER_VALUE = A523TBM32_CHK_FALSE_INNER_VALUE ;
         Z527TBM32_FIXED_VALUE = A527TBM32_FIXED_VALUE ;
         Z525TBM32_LIST_CD = A525TBM32_LIST_CD ;
         Z526TBM32_IMAGE_CD = A526TBM32_IMAGE_CD ;
         Z524TBM32_TEXT = A524TBM32_TEXT ;
         Z513TBM32_FONT_SIZE = A513TBM32_FONT_SIZE ;
         Z514TBM32_FONT_UL_FLG = A514TBM32_FONT_UL_FLG ;
         Z515TBM32_FONT_COLOR_DIV = A515TBM32_FONT_COLOR_DIV ;
         Z521TBM32_LINE_SIZE_DIV = A521TBM32_LINE_SIZE_DIV ;
         Z689TBM32_LINE_COLOR_DIV = A689TBM32_LINE_COLOR_DIV ;
         Z519TBM32_LINE_START_POINT_DIV = A519TBM32_LINE_START_POINT_DIV ;
         Z520TBM32_LINE_END_POINT_DIV = A520TBM32_LINE_END_POINT_DIV ;
         Z690TBM32_LINE_ANGLE = A690TBM32_LINE_ANGLE ;
         Z644TBM32_AUTH_LVL_MIN = A644TBM32_AUTH_LVL_MIN ;
         Z645TBM32_ZORDER = A645TBM32_ZORDER ;
         Z691TBM32_TAB_ORDER = A691TBM32_TAB_ORDER ;
         Z692TBM32_TABSTOP_FLG = A692TBM32_TABSTOP_FLG ;
         Z693TBM32_REQUIRED_INPUT_FLG = A693TBM32_REQUIRED_INPUT_FLG ;
         Z694TBM32_MIN_VALUE = A694TBM32_MIN_VALUE ;
         Z695TBM32_MAX_VALUE = A695TBM32_MAX_VALUE ;
         Z406TBM32_CRF_ITEM_NOTE = A406TBM32_CRF_ITEM_NOTE ;
         Z774TBM32_REF_CRF_ID = A774TBM32_REF_CRF_ID ;
         Z775TBM32_REF_CRF_ITEM_CD = A775TBM32_REF_CRF_ITEM_CD ;
         Z75TBM32_DEL_FLG = A75TBM32_DEL_FLG ;
         Z409TBM32_CRT_PROG_NM = A409TBM32_CRT_PROG_NM ;
         Z412TBM32_UPD_PROG_NM = A412TBM32_UPD_PROG_NM ;
      }
      if ( GX_JID == -8 )
      {
         Z70TBM32_STUDY_ID = A70TBM32_STUDY_ID ;
         Z71TBM32_CRF_ID = A71TBM32_CRF_ID ;
         Z72TBM32_CRF_ITEM_CD = A72TBM32_CRF_ITEM_CD ;
         Z407TBM32_CRT_DATETIME = A407TBM32_CRT_DATETIME ;
         Z408TBM32_CRT_USER_ID = A408TBM32_CRT_USER_ID ;
         Z410TBM32_UPD_DATETIME = A410TBM32_UPD_DATETIME ;
         Z411TBM32_UPD_USER_ID = A411TBM32_UPD_USER_ID ;
         Z413TBM32_UPD_CNT = A413TBM32_UPD_CNT ;
         Z405TBM32_CRF_ITEM_NM = A405TBM32_CRF_ITEM_NM ;
         Z74TBM32_CRF_ITEM_DIV = A74TBM32_CRF_ITEM_DIV ;
         Z73TBM32_CRF_ITEM_GRP_CD = A73TBM32_CRF_ITEM_GRP_CD ;
         Z507TBM32_CRF_ITEM_GRP_ORDER = A507TBM32_CRF_ITEM_GRP_ORDER ;
         Z508TBM32_LOCATION_X = A508TBM32_LOCATION_X ;
         Z509TBM32_LOCATION_Y = A509TBM32_LOCATION_Y ;
         Z510TBM32_LOCATION_X2 = A510TBM32_LOCATION_X2 ;
         Z511TBM32_LOCATION_Y2 = A511TBM32_LOCATION_Y2 ;
         Z512TBM32_TEXT_ALIGN_DIV = A512TBM32_TEXT_ALIGN_DIV ;
         Z516TBM32_TEXT_MAXROWS = A516TBM32_TEXT_MAXROWS ;
         Z517TBM32_TEXT_MAXLENGTH = A517TBM32_TEXT_MAXLENGTH ;
         Z518TBM32_DECIMAL_DIGITS = A518TBM32_DECIMAL_DIGITS ;
         Z522TBM32_CHK_TRUE_INNER_VALUE = A522TBM32_CHK_TRUE_INNER_VALUE ;
         Z523TBM32_CHK_FALSE_INNER_VALUE = A523TBM32_CHK_FALSE_INNER_VALUE ;
         Z527TBM32_FIXED_VALUE = A527TBM32_FIXED_VALUE ;
         Z525TBM32_LIST_CD = A525TBM32_LIST_CD ;
         Z526TBM32_IMAGE_CD = A526TBM32_IMAGE_CD ;
         Z524TBM32_TEXT = A524TBM32_TEXT ;
         Z513TBM32_FONT_SIZE = A513TBM32_FONT_SIZE ;
         Z514TBM32_FONT_UL_FLG = A514TBM32_FONT_UL_FLG ;
         Z515TBM32_FONT_COLOR_DIV = A515TBM32_FONT_COLOR_DIV ;
         Z521TBM32_LINE_SIZE_DIV = A521TBM32_LINE_SIZE_DIV ;
         Z689TBM32_LINE_COLOR_DIV = A689TBM32_LINE_COLOR_DIV ;
         Z519TBM32_LINE_START_POINT_DIV = A519TBM32_LINE_START_POINT_DIV ;
         Z520TBM32_LINE_END_POINT_DIV = A520TBM32_LINE_END_POINT_DIV ;
         Z690TBM32_LINE_ANGLE = A690TBM32_LINE_ANGLE ;
         Z644TBM32_AUTH_LVL_MIN = A644TBM32_AUTH_LVL_MIN ;
         Z645TBM32_ZORDER = A645TBM32_ZORDER ;
         Z691TBM32_TAB_ORDER = A691TBM32_TAB_ORDER ;
         Z692TBM32_TABSTOP_FLG = A692TBM32_TABSTOP_FLG ;
         Z693TBM32_REQUIRED_INPUT_FLG = A693TBM32_REQUIRED_INPUT_FLG ;
         Z694TBM32_MIN_VALUE = A694TBM32_MIN_VALUE ;
         Z695TBM32_MAX_VALUE = A695TBM32_MAX_VALUE ;
         Z406TBM32_CRF_ITEM_NOTE = A406TBM32_CRF_ITEM_NOTE ;
         Z774TBM32_REF_CRF_ID = A774TBM32_REF_CRF_ID ;
         Z775TBM32_REF_CRF_ITEM_CD = A775TBM32_REF_CRF_ITEM_CD ;
         Z75TBM32_DEL_FLG = A75TBM32_DEL_FLG ;
         Z409TBM32_CRT_PROG_NM = A409TBM32_CRT_PROG_NM ;
         Z412TBM32_UPD_PROG_NM = A412TBM32_UPD_PROG_NM ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load0K19( )
   {
      /* Using cursor BC000K4 */
      pr_default.execute(2, new Object[] {new Long(A70TBM32_STUDY_ID), new Short(A71TBM32_CRF_ID), A72TBM32_CRF_ITEM_CD});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound19 = (short)(1) ;
         A407TBM32_CRT_DATETIME = BC000K4_A407TBM32_CRT_DATETIME[0] ;
         n407TBM32_CRT_DATETIME = BC000K4_n407TBM32_CRT_DATETIME[0] ;
         A408TBM32_CRT_USER_ID = BC000K4_A408TBM32_CRT_USER_ID[0] ;
         n408TBM32_CRT_USER_ID = BC000K4_n408TBM32_CRT_USER_ID[0] ;
         A410TBM32_UPD_DATETIME = BC000K4_A410TBM32_UPD_DATETIME[0] ;
         n410TBM32_UPD_DATETIME = BC000K4_n410TBM32_UPD_DATETIME[0] ;
         A411TBM32_UPD_USER_ID = BC000K4_A411TBM32_UPD_USER_ID[0] ;
         n411TBM32_UPD_USER_ID = BC000K4_n411TBM32_UPD_USER_ID[0] ;
         A413TBM32_UPD_CNT = BC000K4_A413TBM32_UPD_CNT[0] ;
         n413TBM32_UPD_CNT = BC000K4_n413TBM32_UPD_CNT[0] ;
         A405TBM32_CRF_ITEM_NM = BC000K4_A405TBM32_CRF_ITEM_NM[0] ;
         n405TBM32_CRF_ITEM_NM = BC000K4_n405TBM32_CRF_ITEM_NM[0] ;
         A74TBM32_CRF_ITEM_DIV = BC000K4_A74TBM32_CRF_ITEM_DIV[0] ;
         n74TBM32_CRF_ITEM_DIV = BC000K4_n74TBM32_CRF_ITEM_DIV[0] ;
         A73TBM32_CRF_ITEM_GRP_CD = BC000K4_A73TBM32_CRF_ITEM_GRP_CD[0] ;
         n73TBM32_CRF_ITEM_GRP_CD = BC000K4_n73TBM32_CRF_ITEM_GRP_CD[0] ;
         A507TBM32_CRF_ITEM_GRP_ORDER = BC000K4_A507TBM32_CRF_ITEM_GRP_ORDER[0] ;
         n507TBM32_CRF_ITEM_GRP_ORDER = BC000K4_n507TBM32_CRF_ITEM_GRP_ORDER[0] ;
         A508TBM32_LOCATION_X = BC000K4_A508TBM32_LOCATION_X[0] ;
         n508TBM32_LOCATION_X = BC000K4_n508TBM32_LOCATION_X[0] ;
         A509TBM32_LOCATION_Y = BC000K4_A509TBM32_LOCATION_Y[0] ;
         n509TBM32_LOCATION_Y = BC000K4_n509TBM32_LOCATION_Y[0] ;
         A510TBM32_LOCATION_X2 = BC000K4_A510TBM32_LOCATION_X2[0] ;
         n510TBM32_LOCATION_X2 = BC000K4_n510TBM32_LOCATION_X2[0] ;
         A511TBM32_LOCATION_Y2 = BC000K4_A511TBM32_LOCATION_Y2[0] ;
         n511TBM32_LOCATION_Y2 = BC000K4_n511TBM32_LOCATION_Y2[0] ;
         A512TBM32_TEXT_ALIGN_DIV = BC000K4_A512TBM32_TEXT_ALIGN_DIV[0] ;
         n512TBM32_TEXT_ALIGN_DIV = BC000K4_n512TBM32_TEXT_ALIGN_DIV[0] ;
         A516TBM32_TEXT_MAXROWS = BC000K4_A516TBM32_TEXT_MAXROWS[0] ;
         n516TBM32_TEXT_MAXROWS = BC000K4_n516TBM32_TEXT_MAXROWS[0] ;
         A517TBM32_TEXT_MAXLENGTH = BC000K4_A517TBM32_TEXT_MAXLENGTH[0] ;
         n517TBM32_TEXT_MAXLENGTH = BC000K4_n517TBM32_TEXT_MAXLENGTH[0] ;
         A518TBM32_DECIMAL_DIGITS = BC000K4_A518TBM32_DECIMAL_DIGITS[0] ;
         n518TBM32_DECIMAL_DIGITS = BC000K4_n518TBM32_DECIMAL_DIGITS[0] ;
         A522TBM32_CHK_TRUE_INNER_VALUE = BC000K4_A522TBM32_CHK_TRUE_INNER_VALUE[0] ;
         n522TBM32_CHK_TRUE_INNER_VALUE = BC000K4_n522TBM32_CHK_TRUE_INNER_VALUE[0] ;
         A523TBM32_CHK_FALSE_INNER_VALUE = BC000K4_A523TBM32_CHK_FALSE_INNER_VALUE[0] ;
         n523TBM32_CHK_FALSE_INNER_VALUE = BC000K4_n523TBM32_CHK_FALSE_INNER_VALUE[0] ;
         A527TBM32_FIXED_VALUE = BC000K4_A527TBM32_FIXED_VALUE[0] ;
         n527TBM32_FIXED_VALUE = BC000K4_n527TBM32_FIXED_VALUE[0] ;
         A525TBM32_LIST_CD = BC000K4_A525TBM32_LIST_CD[0] ;
         n525TBM32_LIST_CD = BC000K4_n525TBM32_LIST_CD[0] ;
         A526TBM32_IMAGE_CD = BC000K4_A526TBM32_IMAGE_CD[0] ;
         n526TBM32_IMAGE_CD = BC000K4_n526TBM32_IMAGE_CD[0] ;
         A524TBM32_TEXT = BC000K4_A524TBM32_TEXT[0] ;
         n524TBM32_TEXT = BC000K4_n524TBM32_TEXT[0] ;
         A513TBM32_FONT_SIZE = BC000K4_A513TBM32_FONT_SIZE[0] ;
         n513TBM32_FONT_SIZE = BC000K4_n513TBM32_FONT_SIZE[0] ;
         A514TBM32_FONT_UL_FLG = BC000K4_A514TBM32_FONT_UL_FLG[0] ;
         n514TBM32_FONT_UL_FLG = BC000K4_n514TBM32_FONT_UL_FLG[0] ;
         A515TBM32_FONT_COLOR_DIV = BC000K4_A515TBM32_FONT_COLOR_DIV[0] ;
         n515TBM32_FONT_COLOR_DIV = BC000K4_n515TBM32_FONT_COLOR_DIV[0] ;
         A521TBM32_LINE_SIZE_DIV = BC000K4_A521TBM32_LINE_SIZE_DIV[0] ;
         n521TBM32_LINE_SIZE_DIV = BC000K4_n521TBM32_LINE_SIZE_DIV[0] ;
         A689TBM32_LINE_COLOR_DIV = BC000K4_A689TBM32_LINE_COLOR_DIV[0] ;
         n689TBM32_LINE_COLOR_DIV = BC000K4_n689TBM32_LINE_COLOR_DIV[0] ;
         A519TBM32_LINE_START_POINT_DIV = BC000K4_A519TBM32_LINE_START_POINT_DIV[0] ;
         n519TBM32_LINE_START_POINT_DIV = BC000K4_n519TBM32_LINE_START_POINT_DIV[0] ;
         A520TBM32_LINE_END_POINT_DIV = BC000K4_A520TBM32_LINE_END_POINT_DIV[0] ;
         n520TBM32_LINE_END_POINT_DIV = BC000K4_n520TBM32_LINE_END_POINT_DIV[0] ;
         A690TBM32_LINE_ANGLE = BC000K4_A690TBM32_LINE_ANGLE[0] ;
         n690TBM32_LINE_ANGLE = BC000K4_n690TBM32_LINE_ANGLE[0] ;
         A644TBM32_AUTH_LVL_MIN = BC000K4_A644TBM32_AUTH_LVL_MIN[0] ;
         n644TBM32_AUTH_LVL_MIN = BC000K4_n644TBM32_AUTH_LVL_MIN[0] ;
         A645TBM32_ZORDER = BC000K4_A645TBM32_ZORDER[0] ;
         n645TBM32_ZORDER = BC000K4_n645TBM32_ZORDER[0] ;
         A691TBM32_TAB_ORDER = BC000K4_A691TBM32_TAB_ORDER[0] ;
         n691TBM32_TAB_ORDER = BC000K4_n691TBM32_TAB_ORDER[0] ;
         A692TBM32_TABSTOP_FLG = BC000K4_A692TBM32_TABSTOP_FLG[0] ;
         n692TBM32_TABSTOP_FLG = BC000K4_n692TBM32_TABSTOP_FLG[0] ;
         A693TBM32_REQUIRED_INPUT_FLG = BC000K4_A693TBM32_REQUIRED_INPUT_FLG[0] ;
         n693TBM32_REQUIRED_INPUT_FLG = BC000K4_n693TBM32_REQUIRED_INPUT_FLG[0] ;
         A694TBM32_MIN_VALUE = BC000K4_A694TBM32_MIN_VALUE[0] ;
         n694TBM32_MIN_VALUE = BC000K4_n694TBM32_MIN_VALUE[0] ;
         A695TBM32_MAX_VALUE = BC000K4_A695TBM32_MAX_VALUE[0] ;
         n695TBM32_MAX_VALUE = BC000K4_n695TBM32_MAX_VALUE[0] ;
         A406TBM32_CRF_ITEM_NOTE = BC000K4_A406TBM32_CRF_ITEM_NOTE[0] ;
         n406TBM32_CRF_ITEM_NOTE = BC000K4_n406TBM32_CRF_ITEM_NOTE[0] ;
         A774TBM32_REF_CRF_ID = BC000K4_A774TBM32_REF_CRF_ID[0] ;
         n774TBM32_REF_CRF_ID = BC000K4_n774TBM32_REF_CRF_ID[0] ;
         A775TBM32_REF_CRF_ITEM_CD = BC000K4_A775TBM32_REF_CRF_ITEM_CD[0] ;
         n775TBM32_REF_CRF_ITEM_CD = BC000K4_n775TBM32_REF_CRF_ITEM_CD[0] ;
         A75TBM32_DEL_FLG = BC000K4_A75TBM32_DEL_FLG[0] ;
         n75TBM32_DEL_FLG = BC000K4_n75TBM32_DEL_FLG[0] ;
         A409TBM32_CRT_PROG_NM = BC000K4_A409TBM32_CRT_PROG_NM[0] ;
         n409TBM32_CRT_PROG_NM = BC000K4_n409TBM32_CRT_PROG_NM[0] ;
         A412TBM32_UPD_PROG_NM = BC000K4_A412TBM32_UPD_PROG_NM[0] ;
         n412TBM32_UPD_PROG_NM = BC000K4_n412TBM32_UPD_PROG_NM[0] ;
         zm0K19( -8) ;
      }
      pr_default.close(2);
      onLoadActions0K19( ) ;
   }

   public void onLoadActions0K19( )
   {
      AV9Pgmname = "TBM32_CRF_ITEM_BC" ;
   }

   public void checkExtendedTable0K19( )
   {
      standaloneModal( ) ;
      AV9Pgmname = "TBM32_CRF_ITEM_BC" ;
      if ( ! ( GXutil.nullDate().equals(A407TBM32_CRT_DATETIME) || (( A407TBM32_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A407TBM32_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A410TBM32_UPD_DATETIME) || (( A410TBM32_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A410TBM32_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors0K19( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey0K19( )
   {
      /* Using cursor BC000K5 */
      pr_default.execute(3, new Object[] {new Long(A70TBM32_STUDY_ID), new Short(A71TBM32_CRF_ID), A72TBM32_CRF_ITEM_CD});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound19 = (short)(1) ;
      }
      else
      {
         RcdFound19 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC000K6 */
      pr_default.execute(4, new Object[] {new Long(A70TBM32_STUDY_ID), new Short(A71TBM32_CRF_ID), A72TBM32_CRF_ITEM_CD});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zm0K19( 8) ;
         RcdFound19 = (short)(1) ;
         A70TBM32_STUDY_ID = BC000K6_A70TBM32_STUDY_ID[0] ;
         A71TBM32_CRF_ID = BC000K6_A71TBM32_CRF_ID[0] ;
         A72TBM32_CRF_ITEM_CD = BC000K6_A72TBM32_CRF_ITEM_CD[0] ;
         A407TBM32_CRT_DATETIME = BC000K6_A407TBM32_CRT_DATETIME[0] ;
         n407TBM32_CRT_DATETIME = BC000K6_n407TBM32_CRT_DATETIME[0] ;
         A408TBM32_CRT_USER_ID = BC000K6_A408TBM32_CRT_USER_ID[0] ;
         n408TBM32_CRT_USER_ID = BC000K6_n408TBM32_CRT_USER_ID[0] ;
         A410TBM32_UPD_DATETIME = BC000K6_A410TBM32_UPD_DATETIME[0] ;
         n410TBM32_UPD_DATETIME = BC000K6_n410TBM32_UPD_DATETIME[0] ;
         A411TBM32_UPD_USER_ID = BC000K6_A411TBM32_UPD_USER_ID[0] ;
         n411TBM32_UPD_USER_ID = BC000K6_n411TBM32_UPD_USER_ID[0] ;
         A413TBM32_UPD_CNT = BC000K6_A413TBM32_UPD_CNT[0] ;
         n413TBM32_UPD_CNT = BC000K6_n413TBM32_UPD_CNT[0] ;
         A405TBM32_CRF_ITEM_NM = BC000K6_A405TBM32_CRF_ITEM_NM[0] ;
         n405TBM32_CRF_ITEM_NM = BC000K6_n405TBM32_CRF_ITEM_NM[0] ;
         A74TBM32_CRF_ITEM_DIV = BC000K6_A74TBM32_CRF_ITEM_DIV[0] ;
         n74TBM32_CRF_ITEM_DIV = BC000K6_n74TBM32_CRF_ITEM_DIV[0] ;
         A73TBM32_CRF_ITEM_GRP_CD = BC000K6_A73TBM32_CRF_ITEM_GRP_CD[0] ;
         n73TBM32_CRF_ITEM_GRP_CD = BC000K6_n73TBM32_CRF_ITEM_GRP_CD[0] ;
         A507TBM32_CRF_ITEM_GRP_ORDER = BC000K6_A507TBM32_CRF_ITEM_GRP_ORDER[0] ;
         n507TBM32_CRF_ITEM_GRP_ORDER = BC000K6_n507TBM32_CRF_ITEM_GRP_ORDER[0] ;
         A508TBM32_LOCATION_X = BC000K6_A508TBM32_LOCATION_X[0] ;
         n508TBM32_LOCATION_X = BC000K6_n508TBM32_LOCATION_X[0] ;
         A509TBM32_LOCATION_Y = BC000K6_A509TBM32_LOCATION_Y[0] ;
         n509TBM32_LOCATION_Y = BC000K6_n509TBM32_LOCATION_Y[0] ;
         A510TBM32_LOCATION_X2 = BC000K6_A510TBM32_LOCATION_X2[0] ;
         n510TBM32_LOCATION_X2 = BC000K6_n510TBM32_LOCATION_X2[0] ;
         A511TBM32_LOCATION_Y2 = BC000K6_A511TBM32_LOCATION_Y2[0] ;
         n511TBM32_LOCATION_Y2 = BC000K6_n511TBM32_LOCATION_Y2[0] ;
         A512TBM32_TEXT_ALIGN_DIV = BC000K6_A512TBM32_TEXT_ALIGN_DIV[0] ;
         n512TBM32_TEXT_ALIGN_DIV = BC000K6_n512TBM32_TEXT_ALIGN_DIV[0] ;
         A516TBM32_TEXT_MAXROWS = BC000K6_A516TBM32_TEXT_MAXROWS[0] ;
         n516TBM32_TEXT_MAXROWS = BC000K6_n516TBM32_TEXT_MAXROWS[0] ;
         A517TBM32_TEXT_MAXLENGTH = BC000K6_A517TBM32_TEXT_MAXLENGTH[0] ;
         n517TBM32_TEXT_MAXLENGTH = BC000K6_n517TBM32_TEXT_MAXLENGTH[0] ;
         A518TBM32_DECIMAL_DIGITS = BC000K6_A518TBM32_DECIMAL_DIGITS[0] ;
         n518TBM32_DECIMAL_DIGITS = BC000K6_n518TBM32_DECIMAL_DIGITS[0] ;
         A522TBM32_CHK_TRUE_INNER_VALUE = BC000K6_A522TBM32_CHK_TRUE_INNER_VALUE[0] ;
         n522TBM32_CHK_TRUE_INNER_VALUE = BC000K6_n522TBM32_CHK_TRUE_INNER_VALUE[0] ;
         A523TBM32_CHK_FALSE_INNER_VALUE = BC000K6_A523TBM32_CHK_FALSE_INNER_VALUE[0] ;
         n523TBM32_CHK_FALSE_INNER_VALUE = BC000K6_n523TBM32_CHK_FALSE_INNER_VALUE[0] ;
         A527TBM32_FIXED_VALUE = BC000K6_A527TBM32_FIXED_VALUE[0] ;
         n527TBM32_FIXED_VALUE = BC000K6_n527TBM32_FIXED_VALUE[0] ;
         A525TBM32_LIST_CD = BC000K6_A525TBM32_LIST_CD[0] ;
         n525TBM32_LIST_CD = BC000K6_n525TBM32_LIST_CD[0] ;
         A526TBM32_IMAGE_CD = BC000K6_A526TBM32_IMAGE_CD[0] ;
         n526TBM32_IMAGE_CD = BC000K6_n526TBM32_IMAGE_CD[0] ;
         A524TBM32_TEXT = BC000K6_A524TBM32_TEXT[0] ;
         n524TBM32_TEXT = BC000K6_n524TBM32_TEXT[0] ;
         A513TBM32_FONT_SIZE = BC000K6_A513TBM32_FONT_SIZE[0] ;
         n513TBM32_FONT_SIZE = BC000K6_n513TBM32_FONT_SIZE[0] ;
         A514TBM32_FONT_UL_FLG = BC000K6_A514TBM32_FONT_UL_FLG[0] ;
         n514TBM32_FONT_UL_FLG = BC000K6_n514TBM32_FONT_UL_FLG[0] ;
         A515TBM32_FONT_COLOR_DIV = BC000K6_A515TBM32_FONT_COLOR_DIV[0] ;
         n515TBM32_FONT_COLOR_DIV = BC000K6_n515TBM32_FONT_COLOR_DIV[0] ;
         A521TBM32_LINE_SIZE_DIV = BC000K6_A521TBM32_LINE_SIZE_DIV[0] ;
         n521TBM32_LINE_SIZE_DIV = BC000K6_n521TBM32_LINE_SIZE_DIV[0] ;
         A689TBM32_LINE_COLOR_DIV = BC000K6_A689TBM32_LINE_COLOR_DIV[0] ;
         n689TBM32_LINE_COLOR_DIV = BC000K6_n689TBM32_LINE_COLOR_DIV[0] ;
         A519TBM32_LINE_START_POINT_DIV = BC000K6_A519TBM32_LINE_START_POINT_DIV[0] ;
         n519TBM32_LINE_START_POINT_DIV = BC000K6_n519TBM32_LINE_START_POINT_DIV[0] ;
         A520TBM32_LINE_END_POINT_DIV = BC000K6_A520TBM32_LINE_END_POINT_DIV[0] ;
         n520TBM32_LINE_END_POINT_DIV = BC000K6_n520TBM32_LINE_END_POINT_DIV[0] ;
         A690TBM32_LINE_ANGLE = BC000K6_A690TBM32_LINE_ANGLE[0] ;
         n690TBM32_LINE_ANGLE = BC000K6_n690TBM32_LINE_ANGLE[0] ;
         A644TBM32_AUTH_LVL_MIN = BC000K6_A644TBM32_AUTH_LVL_MIN[0] ;
         n644TBM32_AUTH_LVL_MIN = BC000K6_n644TBM32_AUTH_LVL_MIN[0] ;
         A645TBM32_ZORDER = BC000K6_A645TBM32_ZORDER[0] ;
         n645TBM32_ZORDER = BC000K6_n645TBM32_ZORDER[0] ;
         A691TBM32_TAB_ORDER = BC000K6_A691TBM32_TAB_ORDER[0] ;
         n691TBM32_TAB_ORDER = BC000K6_n691TBM32_TAB_ORDER[0] ;
         A692TBM32_TABSTOP_FLG = BC000K6_A692TBM32_TABSTOP_FLG[0] ;
         n692TBM32_TABSTOP_FLG = BC000K6_n692TBM32_TABSTOP_FLG[0] ;
         A693TBM32_REQUIRED_INPUT_FLG = BC000K6_A693TBM32_REQUIRED_INPUT_FLG[0] ;
         n693TBM32_REQUIRED_INPUT_FLG = BC000K6_n693TBM32_REQUIRED_INPUT_FLG[0] ;
         A694TBM32_MIN_VALUE = BC000K6_A694TBM32_MIN_VALUE[0] ;
         n694TBM32_MIN_VALUE = BC000K6_n694TBM32_MIN_VALUE[0] ;
         A695TBM32_MAX_VALUE = BC000K6_A695TBM32_MAX_VALUE[0] ;
         n695TBM32_MAX_VALUE = BC000K6_n695TBM32_MAX_VALUE[0] ;
         A406TBM32_CRF_ITEM_NOTE = BC000K6_A406TBM32_CRF_ITEM_NOTE[0] ;
         n406TBM32_CRF_ITEM_NOTE = BC000K6_n406TBM32_CRF_ITEM_NOTE[0] ;
         A774TBM32_REF_CRF_ID = BC000K6_A774TBM32_REF_CRF_ID[0] ;
         n774TBM32_REF_CRF_ID = BC000K6_n774TBM32_REF_CRF_ID[0] ;
         A775TBM32_REF_CRF_ITEM_CD = BC000K6_A775TBM32_REF_CRF_ITEM_CD[0] ;
         n775TBM32_REF_CRF_ITEM_CD = BC000K6_n775TBM32_REF_CRF_ITEM_CD[0] ;
         A75TBM32_DEL_FLG = BC000K6_A75TBM32_DEL_FLG[0] ;
         n75TBM32_DEL_FLG = BC000K6_n75TBM32_DEL_FLG[0] ;
         A409TBM32_CRT_PROG_NM = BC000K6_A409TBM32_CRT_PROG_NM[0] ;
         n409TBM32_CRT_PROG_NM = BC000K6_n409TBM32_CRT_PROG_NM[0] ;
         A412TBM32_UPD_PROG_NM = BC000K6_A412TBM32_UPD_PROG_NM[0] ;
         n412TBM32_UPD_PROG_NM = BC000K6_n412TBM32_UPD_PROG_NM[0] ;
         O413TBM32_UPD_CNT = A413TBM32_UPD_CNT ;
         n413TBM32_UPD_CNT = false ;
         Z70TBM32_STUDY_ID = A70TBM32_STUDY_ID ;
         Z71TBM32_CRF_ID = A71TBM32_CRF_ID ;
         Z72TBM32_CRF_ITEM_CD = A72TBM32_CRF_ITEM_CD ;
         sMode19 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load0K19( ) ;
         if ( AnyError == 1 )
         {
            RcdFound19 = (short)(0) ;
            initializeNonKey0K19( ) ;
         }
         Gx_mode = sMode19 ;
      }
      else
      {
         RcdFound19 = (short)(0) ;
         initializeNonKey0K19( ) ;
         sMode19 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode19 ;
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey0K19( ) ;
      if ( RcdFound19 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
      }
      getByPrimaryKey( ) ;
   }

   public void insert_check( )
   {
      confirm_0K0( ) ;
      IsConfirmed = (short)(0) ;
   }

   public void update_check( )
   {
      insert_check( ) ;
   }

   public void delete_check( )
   {
      insert_check( ) ;
   }

   public void checkOptimisticConcurrency0K19( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor BC000K7 */
         pr_default.execute(5, new Object[] {new Long(A70TBM32_STUDY_ID), new Short(A71TBM32_CRF_ID), A72TBM32_CRF_ITEM_CD});
         if ( (pr_default.getStatus(5) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM32_CRF_ITEM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(5) == 101) || !( Z407TBM32_CRT_DATETIME.equals( BC000K7_A407TBM32_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z408TBM32_CRT_USER_ID, BC000K7_A408TBM32_CRT_USER_ID[0]) != 0 ) || !( Z410TBM32_UPD_DATETIME.equals( BC000K7_A410TBM32_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z411TBM32_UPD_USER_ID, BC000K7_A411TBM32_UPD_USER_ID[0]) != 0 ) || ( Z413TBM32_UPD_CNT != BC000K7_A413TBM32_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z405TBM32_CRF_ITEM_NM, BC000K7_A405TBM32_CRF_ITEM_NM[0]) != 0 ) || ( GXutil.strcmp(Z74TBM32_CRF_ITEM_DIV, BC000K7_A74TBM32_CRF_ITEM_DIV[0]) != 0 ) || ( GXutil.strcmp(Z73TBM32_CRF_ITEM_GRP_CD, BC000K7_A73TBM32_CRF_ITEM_GRP_CD[0]) != 0 ) || ( Z507TBM32_CRF_ITEM_GRP_ORDER != BC000K7_A507TBM32_CRF_ITEM_GRP_ORDER[0] ) || ( Z508TBM32_LOCATION_X != BC000K7_A508TBM32_LOCATION_X[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z509TBM32_LOCATION_Y != BC000K7_A509TBM32_LOCATION_Y[0] ) || ( Z510TBM32_LOCATION_X2 != BC000K7_A510TBM32_LOCATION_X2[0] ) || ( Z511TBM32_LOCATION_Y2 != BC000K7_A511TBM32_LOCATION_Y2[0] ) || ( GXutil.strcmp(Z512TBM32_TEXT_ALIGN_DIV, BC000K7_A512TBM32_TEXT_ALIGN_DIV[0]) != 0 ) || ( Z516TBM32_TEXT_MAXROWS != BC000K7_A516TBM32_TEXT_MAXROWS[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z517TBM32_TEXT_MAXLENGTH != BC000K7_A517TBM32_TEXT_MAXLENGTH[0] ) || ( Z518TBM32_DECIMAL_DIGITS != BC000K7_A518TBM32_DECIMAL_DIGITS[0] ) || ( GXutil.strcmp(Z522TBM32_CHK_TRUE_INNER_VALUE, BC000K7_A522TBM32_CHK_TRUE_INNER_VALUE[0]) != 0 ) || ( GXutil.strcmp(Z523TBM32_CHK_FALSE_INNER_VALUE, BC000K7_A523TBM32_CHK_FALSE_INNER_VALUE[0]) != 0 ) || ( GXutil.strcmp(Z527TBM32_FIXED_VALUE, BC000K7_A527TBM32_FIXED_VALUE[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z525TBM32_LIST_CD, BC000K7_A525TBM32_LIST_CD[0]) != 0 ) || ( GXutil.strcmp(Z526TBM32_IMAGE_CD, BC000K7_A526TBM32_IMAGE_CD[0]) != 0 ) || ( GXutil.strcmp(Z524TBM32_TEXT, BC000K7_A524TBM32_TEXT[0]) != 0 ) || ( Z513TBM32_FONT_SIZE != BC000K7_A513TBM32_FONT_SIZE[0] ) || ( GXutil.strcmp(Z514TBM32_FONT_UL_FLG, BC000K7_A514TBM32_FONT_UL_FLG[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z515TBM32_FONT_COLOR_DIV != BC000K7_A515TBM32_FONT_COLOR_DIV[0] ) || ( Z521TBM32_LINE_SIZE_DIV != BC000K7_A521TBM32_LINE_SIZE_DIV[0] ) || ( Z689TBM32_LINE_COLOR_DIV != BC000K7_A689TBM32_LINE_COLOR_DIV[0] ) || ( GXutil.strcmp(Z519TBM32_LINE_START_POINT_DIV, BC000K7_A519TBM32_LINE_START_POINT_DIV[0]) != 0 ) || ( GXutil.strcmp(Z520TBM32_LINE_END_POINT_DIV, BC000K7_A520TBM32_LINE_END_POINT_DIV[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z690TBM32_LINE_ANGLE != BC000K7_A690TBM32_LINE_ANGLE[0] ) || ( Z644TBM32_AUTH_LVL_MIN != BC000K7_A644TBM32_AUTH_LVL_MIN[0] ) || ( Z645TBM32_ZORDER != BC000K7_A645TBM32_ZORDER[0] ) || ( Z691TBM32_TAB_ORDER != BC000K7_A691TBM32_TAB_ORDER[0] ) || ( GXutil.strcmp(Z692TBM32_TABSTOP_FLG, BC000K7_A692TBM32_TABSTOP_FLG[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z693TBM32_REQUIRED_INPUT_FLG, BC000K7_A693TBM32_REQUIRED_INPUT_FLG[0]) != 0 ) || ( GXutil.strcmp(Z694TBM32_MIN_VALUE, BC000K7_A694TBM32_MIN_VALUE[0]) != 0 ) || ( GXutil.strcmp(Z695TBM32_MAX_VALUE, BC000K7_A695TBM32_MAX_VALUE[0]) != 0 ) || ( GXutil.strcmp(Z406TBM32_CRF_ITEM_NOTE, BC000K7_A406TBM32_CRF_ITEM_NOTE[0]) != 0 ) || ( Z774TBM32_REF_CRF_ID != BC000K7_A774TBM32_REF_CRF_ID[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z775TBM32_REF_CRF_ITEM_CD, BC000K7_A775TBM32_REF_CRF_ITEM_CD[0]) != 0 ) || ( GXutil.strcmp(Z75TBM32_DEL_FLG, BC000K7_A75TBM32_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z409TBM32_CRT_PROG_NM, BC000K7_A409TBM32_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z412TBM32_UPD_PROG_NM, BC000K7_A412TBM32_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBM32_CRF_ITEM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0K19( )
   {
      beforeValidate0K19( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0K19( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0K19( 0) ;
         checkOptimisticConcurrency0K19( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0K19( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0K19( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000K8 */
                  pr_default.execute(6, new Object[] {new Long(A70TBM32_STUDY_ID), new Short(A71TBM32_CRF_ID), A72TBM32_CRF_ITEM_CD, new Boolean(n407TBM32_CRT_DATETIME), A407TBM32_CRT_DATETIME, new Boolean(n408TBM32_CRT_USER_ID), A408TBM32_CRT_USER_ID, new Boolean(n410TBM32_UPD_DATETIME), A410TBM32_UPD_DATETIME, new Boolean(n411TBM32_UPD_USER_ID), A411TBM32_UPD_USER_ID, new Boolean(n413TBM32_UPD_CNT), new Long(A413TBM32_UPD_CNT), new Boolean(n405TBM32_CRF_ITEM_NM), A405TBM32_CRF_ITEM_NM, new Boolean(n74TBM32_CRF_ITEM_DIV), A74TBM32_CRF_ITEM_DIV, new Boolean(n73TBM32_CRF_ITEM_GRP_CD), A73TBM32_CRF_ITEM_GRP_CD, new Boolean(n507TBM32_CRF_ITEM_GRP_ORDER), new Short(A507TBM32_CRF_ITEM_GRP_ORDER), new Boolean(n508TBM32_LOCATION_X), new Short(A508TBM32_LOCATION_X), new Boolean(n509TBM32_LOCATION_Y), new Short(A509TBM32_LOCATION_Y), new Boolean(n510TBM32_LOCATION_X2), new Short(A510TBM32_LOCATION_X2), new Boolean(n511TBM32_LOCATION_Y2), new Short(A511TBM32_LOCATION_Y2), new Boolean(n512TBM32_TEXT_ALIGN_DIV), A512TBM32_TEXT_ALIGN_DIV, new Boolean(n516TBM32_TEXT_MAXROWS), new Byte(A516TBM32_TEXT_MAXROWS), new Boolean(n517TBM32_TEXT_MAXLENGTH), new Short(A517TBM32_TEXT_MAXLENGTH), new Boolean(n518TBM32_DECIMAL_DIGITS), new Byte(A518TBM32_DECIMAL_DIGITS), new Boolean(n522TBM32_CHK_TRUE_INNER_VALUE), A522TBM32_CHK_TRUE_INNER_VALUE, new Boolean(n523TBM32_CHK_FALSE_INNER_VALUE), A523TBM32_CHK_FALSE_INNER_VALUE, new Boolean(n527TBM32_FIXED_VALUE), A527TBM32_FIXED_VALUE, new Boolean(n525TBM32_LIST_CD), A525TBM32_LIST_CD, new Boolean(n526TBM32_IMAGE_CD), A526TBM32_IMAGE_CD, new Boolean(n524TBM32_TEXT), A524TBM32_TEXT, new Boolean(n513TBM32_FONT_SIZE), new Byte(A513TBM32_FONT_SIZE), new Boolean(n514TBM32_FONT_UL_FLG), A514TBM32_FONT_UL_FLG, new Boolean(n515TBM32_FONT_COLOR_DIV), new Long(A515TBM32_FONT_COLOR_DIV), new Boolean(n521TBM32_LINE_SIZE_DIV), new Byte(A521TBM32_LINE_SIZE_DIV), new Boolean(n689TBM32_LINE_COLOR_DIV), new Long(A689TBM32_LINE_COLOR_DIV), new Boolean(n519TBM32_LINE_START_POINT_DIV), A519TBM32_LINE_START_POINT_DIV, new Boolean(n520TBM32_LINE_END_POINT_DIV), A520TBM32_LINE_END_POINT_DIV, new Boolean(n690TBM32_LINE_ANGLE), new Short(A690TBM32_LINE_ANGLE), new Boolean(n644TBM32_AUTH_LVL_MIN), new Byte(A644TBM32_AUTH_LVL_MIN), new Boolean(n645TBM32_ZORDER), new Short(A645TBM32_ZORDER), new Boolean(n691TBM32_TAB_ORDER), new Short(A691TBM32_TAB_ORDER), new Boolean(n692TBM32_TABSTOP_FLG), A692TBM32_TABSTOP_FLG, new Boolean(n693TBM32_REQUIRED_INPUT_FLG), A693TBM32_REQUIRED_INPUT_FLG, new Boolean(n694TBM32_MIN_VALUE), A694TBM32_MIN_VALUE, new Boolean(n695TBM32_MAX_VALUE), A695TBM32_MAX_VALUE, new Boolean(n406TBM32_CRF_ITEM_NOTE), A406TBM32_CRF_ITEM_NOTE, new Boolean(n774TBM32_REF_CRF_ID), new Short(A774TBM32_REF_CRF_ID), new Boolean(n775TBM32_REF_CRF_ITEM_CD), A775TBM32_REF_CRF_ITEM_CD, new Boolean(n75TBM32_DEL_FLG), A75TBM32_DEL_FLG, new Boolean(n409TBM32_CRT_PROG_NM), A409TBM32_CRT_PROG_NM, new Boolean(n412TBM32_UPD_PROG_NM), A412TBM32_UPD_PROG_NM});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM32_CRF_ITEM") ;
                  if ( (pr_default.getStatus(6) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucadded"), 0, "", true);
                     }
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
         else
         {
            load0K19( ) ;
         }
         endLevel0K19( ) ;
      }
      closeExtendedTableCursors0K19( ) ;
   }

   public void update0K19( )
   {
      beforeValidate0K19( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0K19( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0K19( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0K19( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0K19( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000K9 */
                  pr_default.execute(7, new Object[] {new Boolean(n407TBM32_CRT_DATETIME), A407TBM32_CRT_DATETIME, new Boolean(n408TBM32_CRT_USER_ID), A408TBM32_CRT_USER_ID, new Boolean(n410TBM32_UPD_DATETIME), A410TBM32_UPD_DATETIME, new Boolean(n411TBM32_UPD_USER_ID), A411TBM32_UPD_USER_ID, new Boolean(n413TBM32_UPD_CNT), new Long(A413TBM32_UPD_CNT), new Boolean(n405TBM32_CRF_ITEM_NM), A405TBM32_CRF_ITEM_NM, new Boolean(n74TBM32_CRF_ITEM_DIV), A74TBM32_CRF_ITEM_DIV, new Boolean(n73TBM32_CRF_ITEM_GRP_CD), A73TBM32_CRF_ITEM_GRP_CD, new Boolean(n507TBM32_CRF_ITEM_GRP_ORDER), new Short(A507TBM32_CRF_ITEM_GRP_ORDER), new Boolean(n508TBM32_LOCATION_X), new Short(A508TBM32_LOCATION_X), new Boolean(n509TBM32_LOCATION_Y), new Short(A509TBM32_LOCATION_Y), new Boolean(n510TBM32_LOCATION_X2), new Short(A510TBM32_LOCATION_X2), new Boolean(n511TBM32_LOCATION_Y2), new Short(A511TBM32_LOCATION_Y2), new Boolean(n512TBM32_TEXT_ALIGN_DIV), A512TBM32_TEXT_ALIGN_DIV, new Boolean(n516TBM32_TEXT_MAXROWS), new Byte(A516TBM32_TEXT_MAXROWS), new Boolean(n517TBM32_TEXT_MAXLENGTH), new Short(A517TBM32_TEXT_MAXLENGTH), new Boolean(n518TBM32_DECIMAL_DIGITS), new Byte(A518TBM32_DECIMAL_DIGITS), new Boolean(n522TBM32_CHK_TRUE_INNER_VALUE), A522TBM32_CHK_TRUE_INNER_VALUE, new Boolean(n523TBM32_CHK_FALSE_INNER_VALUE), A523TBM32_CHK_FALSE_INNER_VALUE, new Boolean(n527TBM32_FIXED_VALUE), A527TBM32_FIXED_VALUE, new Boolean(n525TBM32_LIST_CD), A525TBM32_LIST_CD, new Boolean(n526TBM32_IMAGE_CD), A526TBM32_IMAGE_CD, new Boolean(n524TBM32_TEXT), A524TBM32_TEXT, new Boolean(n513TBM32_FONT_SIZE), new Byte(A513TBM32_FONT_SIZE), new Boolean(n514TBM32_FONT_UL_FLG), A514TBM32_FONT_UL_FLG, new Boolean(n515TBM32_FONT_COLOR_DIV), new Long(A515TBM32_FONT_COLOR_DIV), new Boolean(n521TBM32_LINE_SIZE_DIV), new Byte(A521TBM32_LINE_SIZE_DIV), new Boolean(n689TBM32_LINE_COLOR_DIV), new Long(A689TBM32_LINE_COLOR_DIV), new Boolean(n519TBM32_LINE_START_POINT_DIV), A519TBM32_LINE_START_POINT_DIV, new Boolean(n520TBM32_LINE_END_POINT_DIV), A520TBM32_LINE_END_POINT_DIV, new Boolean(n690TBM32_LINE_ANGLE), new Short(A690TBM32_LINE_ANGLE), new Boolean(n644TBM32_AUTH_LVL_MIN), new Byte(A644TBM32_AUTH_LVL_MIN), new Boolean(n645TBM32_ZORDER), new Short(A645TBM32_ZORDER), new Boolean(n691TBM32_TAB_ORDER), new Short(A691TBM32_TAB_ORDER), new Boolean(n692TBM32_TABSTOP_FLG), A692TBM32_TABSTOP_FLG, new Boolean(n693TBM32_REQUIRED_INPUT_FLG), A693TBM32_REQUIRED_INPUT_FLG, new Boolean(n694TBM32_MIN_VALUE), A694TBM32_MIN_VALUE, new Boolean(n695TBM32_MAX_VALUE), A695TBM32_MAX_VALUE, new Boolean(n406TBM32_CRF_ITEM_NOTE), A406TBM32_CRF_ITEM_NOTE, new Boolean(n774TBM32_REF_CRF_ID), new Short(A774TBM32_REF_CRF_ID), new Boolean(n775TBM32_REF_CRF_ITEM_CD), A775TBM32_REF_CRF_ITEM_CD, new Boolean(n75TBM32_DEL_FLG), A75TBM32_DEL_FLG, new Boolean(n409TBM32_CRT_PROG_NM), A409TBM32_CRT_PROG_NM, new Boolean(n412TBM32_UPD_PROG_NM), A412TBM32_UPD_PROG_NM, new Long(A70TBM32_STUDY_ID), new Short(A71TBM32_CRF_ID), A72TBM32_CRF_ITEM_CD});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM32_CRF_ITEM") ;
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM32_CRF_ITEM"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0K19( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "", true);
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         endLevel0K19( ) ;
      }
      closeExtendedTableCursors0K19( ) ;
   }

   public void deferredUpdate0K19( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate0K19( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0K19( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0K19( ) ;
         afterConfirm0K19( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0K19( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC000K10 */
               pr_default.execute(8, new Object[] {new Long(A70TBM32_STUDY_ID), new Short(A71TBM32_CRF_ID), A72TBM32_CRF_ITEM_CD});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM32_CRF_ITEM") ;
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucdeleted"), 0, "", true);
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
      }
      sMode19 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel0K19( ) ;
      Gx_mode = sMode19 ;
   }

   public void onDeleteControls0K19( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBM32_CRF_ITEM_BC" ;
      }
   }

   public void endLevel0K19( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(5);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0K19( ) ;
      }
      if ( AnyError == 0 )
      {
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanKeyStart0K19( )
   {
      /* Scan By routine */
      /* Using cursor BC000K11 */
      pr_default.execute(9, new Object[] {new Long(A70TBM32_STUDY_ID), new Short(A71TBM32_CRF_ID), A72TBM32_CRF_ITEM_CD});
      RcdFound19 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound19 = (short)(1) ;
         A70TBM32_STUDY_ID = BC000K11_A70TBM32_STUDY_ID[0] ;
         A71TBM32_CRF_ID = BC000K11_A71TBM32_CRF_ID[0] ;
         A72TBM32_CRF_ITEM_CD = BC000K11_A72TBM32_CRF_ITEM_CD[0] ;
         A407TBM32_CRT_DATETIME = BC000K11_A407TBM32_CRT_DATETIME[0] ;
         n407TBM32_CRT_DATETIME = BC000K11_n407TBM32_CRT_DATETIME[0] ;
         A408TBM32_CRT_USER_ID = BC000K11_A408TBM32_CRT_USER_ID[0] ;
         n408TBM32_CRT_USER_ID = BC000K11_n408TBM32_CRT_USER_ID[0] ;
         A410TBM32_UPD_DATETIME = BC000K11_A410TBM32_UPD_DATETIME[0] ;
         n410TBM32_UPD_DATETIME = BC000K11_n410TBM32_UPD_DATETIME[0] ;
         A411TBM32_UPD_USER_ID = BC000K11_A411TBM32_UPD_USER_ID[0] ;
         n411TBM32_UPD_USER_ID = BC000K11_n411TBM32_UPD_USER_ID[0] ;
         A413TBM32_UPD_CNT = BC000K11_A413TBM32_UPD_CNT[0] ;
         n413TBM32_UPD_CNT = BC000K11_n413TBM32_UPD_CNT[0] ;
         A405TBM32_CRF_ITEM_NM = BC000K11_A405TBM32_CRF_ITEM_NM[0] ;
         n405TBM32_CRF_ITEM_NM = BC000K11_n405TBM32_CRF_ITEM_NM[0] ;
         A74TBM32_CRF_ITEM_DIV = BC000K11_A74TBM32_CRF_ITEM_DIV[0] ;
         n74TBM32_CRF_ITEM_DIV = BC000K11_n74TBM32_CRF_ITEM_DIV[0] ;
         A73TBM32_CRF_ITEM_GRP_CD = BC000K11_A73TBM32_CRF_ITEM_GRP_CD[0] ;
         n73TBM32_CRF_ITEM_GRP_CD = BC000K11_n73TBM32_CRF_ITEM_GRP_CD[0] ;
         A507TBM32_CRF_ITEM_GRP_ORDER = BC000K11_A507TBM32_CRF_ITEM_GRP_ORDER[0] ;
         n507TBM32_CRF_ITEM_GRP_ORDER = BC000K11_n507TBM32_CRF_ITEM_GRP_ORDER[0] ;
         A508TBM32_LOCATION_X = BC000K11_A508TBM32_LOCATION_X[0] ;
         n508TBM32_LOCATION_X = BC000K11_n508TBM32_LOCATION_X[0] ;
         A509TBM32_LOCATION_Y = BC000K11_A509TBM32_LOCATION_Y[0] ;
         n509TBM32_LOCATION_Y = BC000K11_n509TBM32_LOCATION_Y[0] ;
         A510TBM32_LOCATION_X2 = BC000K11_A510TBM32_LOCATION_X2[0] ;
         n510TBM32_LOCATION_X2 = BC000K11_n510TBM32_LOCATION_X2[0] ;
         A511TBM32_LOCATION_Y2 = BC000K11_A511TBM32_LOCATION_Y2[0] ;
         n511TBM32_LOCATION_Y2 = BC000K11_n511TBM32_LOCATION_Y2[0] ;
         A512TBM32_TEXT_ALIGN_DIV = BC000K11_A512TBM32_TEXT_ALIGN_DIV[0] ;
         n512TBM32_TEXT_ALIGN_DIV = BC000K11_n512TBM32_TEXT_ALIGN_DIV[0] ;
         A516TBM32_TEXT_MAXROWS = BC000K11_A516TBM32_TEXT_MAXROWS[0] ;
         n516TBM32_TEXT_MAXROWS = BC000K11_n516TBM32_TEXT_MAXROWS[0] ;
         A517TBM32_TEXT_MAXLENGTH = BC000K11_A517TBM32_TEXT_MAXLENGTH[0] ;
         n517TBM32_TEXT_MAXLENGTH = BC000K11_n517TBM32_TEXT_MAXLENGTH[0] ;
         A518TBM32_DECIMAL_DIGITS = BC000K11_A518TBM32_DECIMAL_DIGITS[0] ;
         n518TBM32_DECIMAL_DIGITS = BC000K11_n518TBM32_DECIMAL_DIGITS[0] ;
         A522TBM32_CHK_TRUE_INNER_VALUE = BC000K11_A522TBM32_CHK_TRUE_INNER_VALUE[0] ;
         n522TBM32_CHK_TRUE_INNER_VALUE = BC000K11_n522TBM32_CHK_TRUE_INNER_VALUE[0] ;
         A523TBM32_CHK_FALSE_INNER_VALUE = BC000K11_A523TBM32_CHK_FALSE_INNER_VALUE[0] ;
         n523TBM32_CHK_FALSE_INNER_VALUE = BC000K11_n523TBM32_CHK_FALSE_INNER_VALUE[0] ;
         A527TBM32_FIXED_VALUE = BC000K11_A527TBM32_FIXED_VALUE[0] ;
         n527TBM32_FIXED_VALUE = BC000K11_n527TBM32_FIXED_VALUE[0] ;
         A525TBM32_LIST_CD = BC000K11_A525TBM32_LIST_CD[0] ;
         n525TBM32_LIST_CD = BC000K11_n525TBM32_LIST_CD[0] ;
         A526TBM32_IMAGE_CD = BC000K11_A526TBM32_IMAGE_CD[0] ;
         n526TBM32_IMAGE_CD = BC000K11_n526TBM32_IMAGE_CD[0] ;
         A524TBM32_TEXT = BC000K11_A524TBM32_TEXT[0] ;
         n524TBM32_TEXT = BC000K11_n524TBM32_TEXT[0] ;
         A513TBM32_FONT_SIZE = BC000K11_A513TBM32_FONT_SIZE[0] ;
         n513TBM32_FONT_SIZE = BC000K11_n513TBM32_FONT_SIZE[0] ;
         A514TBM32_FONT_UL_FLG = BC000K11_A514TBM32_FONT_UL_FLG[0] ;
         n514TBM32_FONT_UL_FLG = BC000K11_n514TBM32_FONT_UL_FLG[0] ;
         A515TBM32_FONT_COLOR_DIV = BC000K11_A515TBM32_FONT_COLOR_DIV[0] ;
         n515TBM32_FONT_COLOR_DIV = BC000K11_n515TBM32_FONT_COLOR_DIV[0] ;
         A521TBM32_LINE_SIZE_DIV = BC000K11_A521TBM32_LINE_SIZE_DIV[0] ;
         n521TBM32_LINE_SIZE_DIV = BC000K11_n521TBM32_LINE_SIZE_DIV[0] ;
         A689TBM32_LINE_COLOR_DIV = BC000K11_A689TBM32_LINE_COLOR_DIV[0] ;
         n689TBM32_LINE_COLOR_DIV = BC000K11_n689TBM32_LINE_COLOR_DIV[0] ;
         A519TBM32_LINE_START_POINT_DIV = BC000K11_A519TBM32_LINE_START_POINT_DIV[0] ;
         n519TBM32_LINE_START_POINT_DIV = BC000K11_n519TBM32_LINE_START_POINT_DIV[0] ;
         A520TBM32_LINE_END_POINT_DIV = BC000K11_A520TBM32_LINE_END_POINT_DIV[0] ;
         n520TBM32_LINE_END_POINT_DIV = BC000K11_n520TBM32_LINE_END_POINT_DIV[0] ;
         A690TBM32_LINE_ANGLE = BC000K11_A690TBM32_LINE_ANGLE[0] ;
         n690TBM32_LINE_ANGLE = BC000K11_n690TBM32_LINE_ANGLE[0] ;
         A644TBM32_AUTH_LVL_MIN = BC000K11_A644TBM32_AUTH_LVL_MIN[0] ;
         n644TBM32_AUTH_LVL_MIN = BC000K11_n644TBM32_AUTH_LVL_MIN[0] ;
         A645TBM32_ZORDER = BC000K11_A645TBM32_ZORDER[0] ;
         n645TBM32_ZORDER = BC000K11_n645TBM32_ZORDER[0] ;
         A691TBM32_TAB_ORDER = BC000K11_A691TBM32_TAB_ORDER[0] ;
         n691TBM32_TAB_ORDER = BC000K11_n691TBM32_TAB_ORDER[0] ;
         A692TBM32_TABSTOP_FLG = BC000K11_A692TBM32_TABSTOP_FLG[0] ;
         n692TBM32_TABSTOP_FLG = BC000K11_n692TBM32_TABSTOP_FLG[0] ;
         A693TBM32_REQUIRED_INPUT_FLG = BC000K11_A693TBM32_REQUIRED_INPUT_FLG[0] ;
         n693TBM32_REQUIRED_INPUT_FLG = BC000K11_n693TBM32_REQUIRED_INPUT_FLG[0] ;
         A694TBM32_MIN_VALUE = BC000K11_A694TBM32_MIN_VALUE[0] ;
         n694TBM32_MIN_VALUE = BC000K11_n694TBM32_MIN_VALUE[0] ;
         A695TBM32_MAX_VALUE = BC000K11_A695TBM32_MAX_VALUE[0] ;
         n695TBM32_MAX_VALUE = BC000K11_n695TBM32_MAX_VALUE[0] ;
         A406TBM32_CRF_ITEM_NOTE = BC000K11_A406TBM32_CRF_ITEM_NOTE[0] ;
         n406TBM32_CRF_ITEM_NOTE = BC000K11_n406TBM32_CRF_ITEM_NOTE[0] ;
         A774TBM32_REF_CRF_ID = BC000K11_A774TBM32_REF_CRF_ID[0] ;
         n774TBM32_REF_CRF_ID = BC000K11_n774TBM32_REF_CRF_ID[0] ;
         A775TBM32_REF_CRF_ITEM_CD = BC000K11_A775TBM32_REF_CRF_ITEM_CD[0] ;
         n775TBM32_REF_CRF_ITEM_CD = BC000K11_n775TBM32_REF_CRF_ITEM_CD[0] ;
         A75TBM32_DEL_FLG = BC000K11_A75TBM32_DEL_FLG[0] ;
         n75TBM32_DEL_FLG = BC000K11_n75TBM32_DEL_FLG[0] ;
         A409TBM32_CRT_PROG_NM = BC000K11_A409TBM32_CRT_PROG_NM[0] ;
         n409TBM32_CRT_PROG_NM = BC000K11_n409TBM32_CRT_PROG_NM[0] ;
         A412TBM32_UPD_PROG_NM = BC000K11_A412TBM32_UPD_PROG_NM[0] ;
         n412TBM32_UPD_PROG_NM = BC000K11_n412TBM32_UPD_PROG_NM[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext0K19( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound19 = (short)(0) ;
      scanKeyLoad0K19( ) ;
   }

   public void scanKeyLoad0K19( )
   {
      sMode19 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound19 = (short)(1) ;
         A70TBM32_STUDY_ID = BC000K11_A70TBM32_STUDY_ID[0] ;
         A71TBM32_CRF_ID = BC000K11_A71TBM32_CRF_ID[0] ;
         A72TBM32_CRF_ITEM_CD = BC000K11_A72TBM32_CRF_ITEM_CD[0] ;
         A407TBM32_CRT_DATETIME = BC000K11_A407TBM32_CRT_DATETIME[0] ;
         n407TBM32_CRT_DATETIME = BC000K11_n407TBM32_CRT_DATETIME[0] ;
         A408TBM32_CRT_USER_ID = BC000K11_A408TBM32_CRT_USER_ID[0] ;
         n408TBM32_CRT_USER_ID = BC000K11_n408TBM32_CRT_USER_ID[0] ;
         A410TBM32_UPD_DATETIME = BC000K11_A410TBM32_UPD_DATETIME[0] ;
         n410TBM32_UPD_DATETIME = BC000K11_n410TBM32_UPD_DATETIME[0] ;
         A411TBM32_UPD_USER_ID = BC000K11_A411TBM32_UPD_USER_ID[0] ;
         n411TBM32_UPD_USER_ID = BC000K11_n411TBM32_UPD_USER_ID[0] ;
         A413TBM32_UPD_CNT = BC000K11_A413TBM32_UPD_CNT[0] ;
         n413TBM32_UPD_CNT = BC000K11_n413TBM32_UPD_CNT[0] ;
         A405TBM32_CRF_ITEM_NM = BC000K11_A405TBM32_CRF_ITEM_NM[0] ;
         n405TBM32_CRF_ITEM_NM = BC000K11_n405TBM32_CRF_ITEM_NM[0] ;
         A74TBM32_CRF_ITEM_DIV = BC000K11_A74TBM32_CRF_ITEM_DIV[0] ;
         n74TBM32_CRF_ITEM_DIV = BC000K11_n74TBM32_CRF_ITEM_DIV[0] ;
         A73TBM32_CRF_ITEM_GRP_CD = BC000K11_A73TBM32_CRF_ITEM_GRP_CD[0] ;
         n73TBM32_CRF_ITEM_GRP_CD = BC000K11_n73TBM32_CRF_ITEM_GRP_CD[0] ;
         A507TBM32_CRF_ITEM_GRP_ORDER = BC000K11_A507TBM32_CRF_ITEM_GRP_ORDER[0] ;
         n507TBM32_CRF_ITEM_GRP_ORDER = BC000K11_n507TBM32_CRF_ITEM_GRP_ORDER[0] ;
         A508TBM32_LOCATION_X = BC000K11_A508TBM32_LOCATION_X[0] ;
         n508TBM32_LOCATION_X = BC000K11_n508TBM32_LOCATION_X[0] ;
         A509TBM32_LOCATION_Y = BC000K11_A509TBM32_LOCATION_Y[0] ;
         n509TBM32_LOCATION_Y = BC000K11_n509TBM32_LOCATION_Y[0] ;
         A510TBM32_LOCATION_X2 = BC000K11_A510TBM32_LOCATION_X2[0] ;
         n510TBM32_LOCATION_X2 = BC000K11_n510TBM32_LOCATION_X2[0] ;
         A511TBM32_LOCATION_Y2 = BC000K11_A511TBM32_LOCATION_Y2[0] ;
         n511TBM32_LOCATION_Y2 = BC000K11_n511TBM32_LOCATION_Y2[0] ;
         A512TBM32_TEXT_ALIGN_DIV = BC000K11_A512TBM32_TEXT_ALIGN_DIV[0] ;
         n512TBM32_TEXT_ALIGN_DIV = BC000K11_n512TBM32_TEXT_ALIGN_DIV[0] ;
         A516TBM32_TEXT_MAXROWS = BC000K11_A516TBM32_TEXT_MAXROWS[0] ;
         n516TBM32_TEXT_MAXROWS = BC000K11_n516TBM32_TEXT_MAXROWS[0] ;
         A517TBM32_TEXT_MAXLENGTH = BC000K11_A517TBM32_TEXT_MAXLENGTH[0] ;
         n517TBM32_TEXT_MAXLENGTH = BC000K11_n517TBM32_TEXT_MAXLENGTH[0] ;
         A518TBM32_DECIMAL_DIGITS = BC000K11_A518TBM32_DECIMAL_DIGITS[0] ;
         n518TBM32_DECIMAL_DIGITS = BC000K11_n518TBM32_DECIMAL_DIGITS[0] ;
         A522TBM32_CHK_TRUE_INNER_VALUE = BC000K11_A522TBM32_CHK_TRUE_INNER_VALUE[0] ;
         n522TBM32_CHK_TRUE_INNER_VALUE = BC000K11_n522TBM32_CHK_TRUE_INNER_VALUE[0] ;
         A523TBM32_CHK_FALSE_INNER_VALUE = BC000K11_A523TBM32_CHK_FALSE_INNER_VALUE[0] ;
         n523TBM32_CHK_FALSE_INNER_VALUE = BC000K11_n523TBM32_CHK_FALSE_INNER_VALUE[0] ;
         A527TBM32_FIXED_VALUE = BC000K11_A527TBM32_FIXED_VALUE[0] ;
         n527TBM32_FIXED_VALUE = BC000K11_n527TBM32_FIXED_VALUE[0] ;
         A525TBM32_LIST_CD = BC000K11_A525TBM32_LIST_CD[0] ;
         n525TBM32_LIST_CD = BC000K11_n525TBM32_LIST_CD[0] ;
         A526TBM32_IMAGE_CD = BC000K11_A526TBM32_IMAGE_CD[0] ;
         n526TBM32_IMAGE_CD = BC000K11_n526TBM32_IMAGE_CD[0] ;
         A524TBM32_TEXT = BC000K11_A524TBM32_TEXT[0] ;
         n524TBM32_TEXT = BC000K11_n524TBM32_TEXT[0] ;
         A513TBM32_FONT_SIZE = BC000K11_A513TBM32_FONT_SIZE[0] ;
         n513TBM32_FONT_SIZE = BC000K11_n513TBM32_FONT_SIZE[0] ;
         A514TBM32_FONT_UL_FLG = BC000K11_A514TBM32_FONT_UL_FLG[0] ;
         n514TBM32_FONT_UL_FLG = BC000K11_n514TBM32_FONT_UL_FLG[0] ;
         A515TBM32_FONT_COLOR_DIV = BC000K11_A515TBM32_FONT_COLOR_DIV[0] ;
         n515TBM32_FONT_COLOR_DIV = BC000K11_n515TBM32_FONT_COLOR_DIV[0] ;
         A521TBM32_LINE_SIZE_DIV = BC000K11_A521TBM32_LINE_SIZE_DIV[0] ;
         n521TBM32_LINE_SIZE_DIV = BC000K11_n521TBM32_LINE_SIZE_DIV[0] ;
         A689TBM32_LINE_COLOR_DIV = BC000K11_A689TBM32_LINE_COLOR_DIV[0] ;
         n689TBM32_LINE_COLOR_DIV = BC000K11_n689TBM32_LINE_COLOR_DIV[0] ;
         A519TBM32_LINE_START_POINT_DIV = BC000K11_A519TBM32_LINE_START_POINT_DIV[0] ;
         n519TBM32_LINE_START_POINT_DIV = BC000K11_n519TBM32_LINE_START_POINT_DIV[0] ;
         A520TBM32_LINE_END_POINT_DIV = BC000K11_A520TBM32_LINE_END_POINT_DIV[0] ;
         n520TBM32_LINE_END_POINT_DIV = BC000K11_n520TBM32_LINE_END_POINT_DIV[0] ;
         A690TBM32_LINE_ANGLE = BC000K11_A690TBM32_LINE_ANGLE[0] ;
         n690TBM32_LINE_ANGLE = BC000K11_n690TBM32_LINE_ANGLE[0] ;
         A644TBM32_AUTH_LVL_MIN = BC000K11_A644TBM32_AUTH_LVL_MIN[0] ;
         n644TBM32_AUTH_LVL_MIN = BC000K11_n644TBM32_AUTH_LVL_MIN[0] ;
         A645TBM32_ZORDER = BC000K11_A645TBM32_ZORDER[0] ;
         n645TBM32_ZORDER = BC000K11_n645TBM32_ZORDER[0] ;
         A691TBM32_TAB_ORDER = BC000K11_A691TBM32_TAB_ORDER[0] ;
         n691TBM32_TAB_ORDER = BC000K11_n691TBM32_TAB_ORDER[0] ;
         A692TBM32_TABSTOP_FLG = BC000K11_A692TBM32_TABSTOP_FLG[0] ;
         n692TBM32_TABSTOP_FLG = BC000K11_n692TBM32_TABSTOP_FLG[0] ;
         A693TBM32_REQUIRED_INPUT_FLG = BC000K11_A693TBM32_REQUIRED_INPUT_FLG[0] ;
         n693TBM32_REQUIRED_INPUT_FLG = BC000K11_n693TBM32_REQUIRED_INPUT_FLG[0] ;
         A694TBM32_MIN_VALUE = BC000K11_A694TBM32_MIN_VALUE[0] ;
         n694TBM32_MIN_VALUE = BC000K11_n694TBM32_MIN_VALUE[0] ;
         A695TBM32_MAX_VALUE = BC000K11_A695TBM32_MAX_VALUE[0] ;
         n695TBM32_MAX_VALUE = BC000K11_n695TBM32_MAX_VALUE[0] ;
         A406TBM32_CRF_ITEM_NOTE = BC000K11_A406TBM32_CRF_ITEM_NOTE[0] ;
         n406TBM32_CRF_ITEM_NOTE = BC000K11_n406TBM32_CRF_ITEM_NOTE[0] ;
         A774TBM32_REF_CRF_ID = BC000K11_A774TBM32_REF_CRF_ID[0] ;
         n774TBM32_REF_CRF_ID = BC000K11_n774TBM32_REF_CRF_ID[0] ;
         A775TBM32_REF_CRF_ITEM_CD = BC000K11_A775TBM32_REF_CRF_ITEM_CD[0] ;
         n775TBM32_REF_CRF_ITEM_CD = BC000K11_n775TBM32_REF_CRF_ITEM_CD[0] ;
         A75TBM32_DEL_FLG = BC000K11_A75TBM32_DEL_FLG[0] ;
         n75TBM32_DEL_FLG = BC000K11_n75TBM32_DEL_FLG[0] ;
         A409TBM32_CRT_PROG_NM = BC000K11_A409TBM32_CRT_PROG_NM[0] ;
         n409TBM32_CRT_PROG_NM = BC000K11_n409TBM32_CRT_PROG_NM[0] ;
         A412TBM32_UPD_PROG_NM = BC000K11_A412TBM32_UPD_PROG_NM[0] ;
         n412TBM32_UPD_PROG_NM = BC000K11_n412TBM32_UPD_PROG_NM[0] ;
      }
      Gx_mode = sMode19 ;
   }

   public void scanKeyEnd0K19( )
   {
      pr_default.close(9);
   }

   public void afterConfirm0K19( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0K19( )
   {
      /* Before Insert Rules */
      A407TBM32_CRT_DATETIME = GXutil.now( ) ;
      n407TBM32_CRT_DATETIME = false ;
      GXt_char1 = A408TBM32_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm32_crf_item_bc.this.GXt_char1 = GXv_char2[0] ;
      A408TBM32_CRT_USER_ID = GXt_char1 ;
      n408TBM32_CRT_USER_ID = false ;
      A410TBM32_UPD_DATETIME = GXutil.now( ) ;
      n410TBM32_UPD_DATETIME = false ;
      GXt_char1 = A411TBM32_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm32_crf_item_bc.this.GXt_char1 = GXv_char2[0] ;
      A411TBM32_UPD_USER_ID = GXt_char1 ;
      n411TBM32_UPD_USER_ID = false ;
      A413TBM32_UPD_CNT = (long)(O413TBM32_UPD_CNT+1) ;
      n413TBM32_UPD_CNT = false ;
   }

   public void beforeUpdate0K19( )
   {
      /* Before Update Rules */
      A410TBM32_UPD_DATETIME = GXutil.now( ) ;
      n410TBM32_UPD_DATETIME = false ;
      GXt_char1 = A411TBM32_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm32_crf_item_bc.this.GXt_char1 = GXv_char2[0] ;
      A411TBM32_UPD_USER_ID = GXt_char1 ;
      n411TBM32_UPD_USER_ID = false ;
      A413TBM32_UPD_CNT = (long)(O413TBM32_UPD_CNT+1) ;
      n413TBM32_UPD_CNT = false ;
   }

   public void beforeDelete0K19( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0K19( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0K19( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0K19( )
   {
   }

   public void addRow0K19( )
   {
      VarsToRow19( bcTBM32_CRF_ITEM) ;
   }

   public void readRow0K19( )
   {
      RowToVars19( bcTBM32_CRF_ITEM, 1) ;
   }

   public void initializeNonKey0K19( )
   {
      A407TBM32_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n407TBM32_CRT_DATETIME = false ;
      A408TBM32_CRT_USER_ID = "" ;
      n408TBM32_CRT_USER_ID = false ;
      A410TBM32_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n410TBM32_UPD_DATETIME = false ;
      A411TBM32_UPD_USER_ID = "" ;
      n411TBM32_UPD_USER_ID = false ;
      A413TBM32_UPD_CNT = 0 ;
      n413TBM32_UPD_CNT = false ;
      A405TBM32_CRF_ITEM_NM = "" ;
      n405TBM32_CRF_ITEM_NM = false ;
      A74TBM32_CRF_ITEM_DIV = "" ;
      n74TBM32_CRF_ITEM_DIV = false ;
      A73TBM32_CRF_ITEM_GRP_CD = "" ;
      n73TBM32_CRF_ITEM_GRP_CD = false ;
      A507TBM32_CRF_ITEM_GRP_ORDER = (short)(0) ;
      n507TBM32_CRF_ITEM_GRP_ORDER = false ;
      A508TBM32_LOCATION_X = (short)(0) ;
      n508TBM32_LOCATION_X = false ;
      A509TBM32_LOCATION_Y = (short)(0) ;
      n509TBM32_LOCATION_Y = false ;
      A510TBM32_LOCATION_X2 = (short)(0) ;
      n510TBM32_LOCATION_X2 = false ;
      A511TBM32_LOCATION_Y2 = (short)(0) ;
      n511TBM32_LOCATION_Y2 = false ;
      A512TBM32_TEXT_ALIGN_DIV = "" ;
      n512TBM32_TEXT_ALIGN_DIV = false ;
      A516TBM32_TEXT_MAXROWS = (byte)(0) ;
      n516TBM32_TEXT_MAXROWS = false ;
      A517TBM32_TEXT_MAXLENGTH = (short)(0) ;
      n517TBM32_TEXT_MAXLENGTH = false ;
      A518TBM32_DECIMAL_DIGITS = (byte)(0) ;
      n518TBM32_DECIMAL_DIGITS = false ;
      A522TBM32_CHK_TRUE_INNER_VALUE = "" ;
      n522TBM32_CHK_TRUE_INNER_VALUE = false ;
      A523TBM32_CHK_FALSE_INNER_VALUE = "" ;
      n523TBM32_CHK_FALSE_INNER_VALUE = false ;
      A527TBM32_FIXED_VALUE = "" ;
      n527TBM32_FIXED_VALUE = false ;
      A525TBM32_LIST_CD = "" ;
      n525TBM32_LIST_CD = false ;
      A526TBM32_IMAGE_CD = "" ;
      n526TBM32_IMAGE_CD = false ;
      A524TBM32_TEXT = "" ;
      n524TBM32_TEXT = false ;
      A513TBM32_FONT_SIZE = (byte)(0) ;
      n513TBM32_FONT_SIZE = false ;
      A514TBM32_FONT_UL_FLG = "" ;
      n514TBM32_FONT_UL_FLG = false ;
      A515TBM32_FONT_COLOR_DIV = 0 ;
      n515TBM32_FONT_COLOR_DIV = false ;
      A521TBM32_LINE_SIZE_DIV = (byte)(0) ;
      n521TBM32_LINE_SIZE_DIV = false ;
      A689TBM32_LINE_COLOR_DIV = 0 ;
      n689TBM32_LINE_COLOR_DIV = false ;
      A519TBM32_LINE_START_POINT_DIV = "" ;
      n519TBM32_LINE_START_POINT_DIV = false ;
      A520TBM32_LINE_END_POINT_DIV = "" ;
      n520TBM32_LINE_END_POINT_DIV = false ;
      A690TBM32_LINE_ANGLE = (short)(0) ;
      n690TBM32_LINE_ANGLE = false ;
      A644TBM32_AUTH_LVL_MIN = (byte)(0) ;
      n644TBM32_AUTH_LVL_MIN = false ;
      A645TBM32_ZORDER = (short)(0) ;
      n645TBM32_ZORDER = false ;
      A691TBM32_TAB_ORDER = (short)(0) ;
      n691TBM32_TAB_ORDER = false ;
      A692TBM32_TABSTOP_FLG = "" ;
      n692TBM32_TABSTOP_FLG = false ;
      A693TBM32_REQUIRED_INPUT_FLG = "" ;
      n693TBM32_REQUIRED_INPUT_FLG = false ;
      A694TBM32_MIN_VALUE = "" ;
      n694TBM32_MIN_VALUE = false ;
      A695TBM32_MAX_VALUE = "" ;
      n695TBM32_MAX_VALUE = false ;
      A406TBM32_CRF_ITEM_NOTE = "" ;
      n406TBM32_CRF_ITEM_NOTE = false ;
      A774TBM32_REF_CRF_ID = (short)(0) ;
      n774TBM32_REF_CRF_ID = false ;
      A775TBM32_REF_CRF_ITEM_CD = "" ;
      n775TBM32_REF_CRF_ITEM_CD = false ;
      A75TBM32_DEL_FLG = "" ;
      n75TBM32_DEL_FLG = false ;
      A409TBM32_CRT_PROG_NM = "" ;
      n409TBM32_CRT_PROG_NM = false ;
      A412TBM32_UPD_PROG_NM = "" ;
      n412TBM32_UPD_PROG_NM = false ;
      O413TBM32_UPD_CNT = A413TBM32_UPD_CNT ;
      n413TBM32_UPD_CNT = false ;
   }

   public void initAll0K19( )
   {
      A70TBM32_STUDY_ID = 0 ;
      A71TBM32_CRF_ID = (short)(0) ;
      A72TBM32_CRF_ITEM_CD = "" ;
      initializeNonKey0K19( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void VarsToRow19( SdtTBM32_CRF_ITEM obj19 )
   {
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Mode( Gx_mode );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime( A407TBM32_CRT_DATETIME );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_user_id( A408TBM32_CRT_USER_ID );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime( A410TBM32_UPD_DATETIME );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_user_id( A411TBM32_UPD_USER_ID );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_cnt( A413TBM32_UPD_CNT );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_nm( A405TBM32_CRF_ITEM_NM );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_div( A74TBM32_CRF_ITEM_DIV );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_cd( A73TBM32_CRF_ITEM_GRP_CD );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_order( A507TBM32_CRF_ITEM_GRP_ORDER );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x( A508TBM32_LOCATION_X );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y( A509TBM32_LOCATION_Y );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x2( A510TBM32_LOCATION_X2 );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y2( A511TBM32_LOCATION_Y2 );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_align_div( A512TBM32_TEXT_ALIGN_DIV );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxrows( A516TBM32_TEXT_MAXROWS );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxlength( A517TBM32_TEXT_MAXLENGTH );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_decimal_digits( A518TBM32_DECIMAL_DIGITS );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_true_inner_value( A522TBM32_CHK_TRUE_INNER_VALUE );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_false_inner_value( A523TBM32_CHK_FALSE_INNER_VALUE );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_fixed_value( A527TBM32_FIXED_VALUE );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_list_cd( A525TBM32_LIST_CD );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_image_cd( A526TBM32_IMAGE_CD );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text( A524TBM32_TEXT );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_size( A513TBM32_FONT_SIZE );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_ul_flg( A514TBM32_FONT_UL_FLG );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_color_div( A515TBM32_FONT_COLOR_DIV );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_size_div( A521TBM32_LINE_SIZE_DIV );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_color_div( A689TBM32_LINE_COLOR_DIV );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_start_point_div( A519TBM32_LINE_START_POINT_DIV );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_end_point_div( A520TBM32_LINE_END_POINT_DIV );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_angle( A690TBM32_LINE_ANGLE );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_auth_lvl_min( A644TBM32_AUTH_LVL_MIN );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_zorder( A645TBM32_ZORDER );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_tab_order( A691TBM32_TAB_ORDER );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_tabstop_flg( A692TBM32_TABSTOP_FLG );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_required_input_flg( A693TBM32_REQUIRED_INPUT_FLG );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_min_value( A694TBM32_MIN_VALUE );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_max_value( A695TBM32_MAX_VALUE );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_note( A406TBM32_CRF_ITEM_NOTE );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_id( A774TBM32_REF_CRF_ID );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_item_cd( A775TBM32_REF_CRF_ITEM_CD );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_del_flg( A75TBM32_DEL_FLG );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_prog_nm( A409TBM32_CRT_PROG_NM );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_prog_nm( A412TBM32_UPD_PROG_NM );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_study_id( A70TBM32_STUDY_ID );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_id( A71TBM32_CRF_ID );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_cd( A72TBM32_CRF_ITEM_CD );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_study_id_Z( Z70TBM32_STUDY_ID );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_id_Z( Z71TBM32_CRF_ID );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_cd_Z( Z72TBM32_CRF_ITEM_CD );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_nm_Z( Z405TBM32_CRF_ITEM_NM );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_div_Z( Z74TBM32_CRF_ITEM_DIV );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_cd_Z( Z73TBM32_CRF_ITEM_GRP_CD );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_order_Z( Z507TBM32_CRF_ITEM_GRP_ORDER );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x_Z( Z508TBM32_LOCATION_X );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y_Z( Z509TBM32_LOCATION_Y );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x2_Z( Z510TBM32_LOCATION_X2 );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y2_Z( Z511TBM32_LOCATION_Y2 );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_align_div_Z( Z512TBM32_TEXT_ALIGN_DIV );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxrows_Z( Z516TBM32_TEXT_MAXROWS );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxlength_Z( Z517TBM32_TEXT_MAXLENGTH );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_decimal_digits_Z( Z518TBM32_DECIMAL_DIGITS );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_true_inner_value_Z( Z522TBM32_CHK_TRUE_INNER_VALUE );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_false_inner_value_Z( Z523TBM32_CHK_FALSE_INNER_VALUE );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_fixed_value_Z( Z527TBM32_FIXED_VALUE );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_list_cd_Z( Z525TBM32_LIST_CD );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_image_cd_Z( Z526TBM32_IMAGE_CD );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_Z( Z524TBM32_TEXT );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_size_Z( Z513TBM32_FONT_SIZE );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_ul_flg_Z( Z514TBM32_FONT_UL_FLG );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_color_div_Z( Z515TBM32_FONT_COLOR_DIV );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_size_div_Z( Z521TBM32_LINE_SIZE_DIV );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_color_div_Z( Z689TBM32_LINE_COLOR_DIV );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_start_point_div_Z( Z519TBM32_LINE_START_POINT_DIV );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_end_point_div_Z( Z520TBM32_LINE_END_POINT_DIV );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_angle_Z( Z690TBM32_LINE_ANGLE );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_auth_lvl_min_Z( Z644TBM32_AUTH_LVL_MIN );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_zorder_Z( Z645TBM32_ZORDER );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_tab_order_Z( Z691TBM32_TAB_ORDER );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_tabstop_flg_Z( Z692TBM32_TABSTOP_FLG );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_required_input_flg_Z( Z693TBM32_REQUIRED_INPUT_FLG );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_min_value_Z( Z694TBM32_MIN_VALUE );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_max_value_Z( Z695TBM32_MAX_VALUE );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_note_Z( Z406TBM32_CRF_ITEM_NOTE );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_id_Z( Z774TBM32_REF_CRF_ID );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_item_cd_Z( Z775TBM32_REF_CRF_ITEM_CD );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_del_flg_Z( Z75TBM32_DEL_FLG );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime_Z( Z407TBM32_CRT_DATETIME );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_user_id_Z( Z408TBM32_CRT_USER_ID );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_prog_nm_Z( Z409TBM32_CRT_PROG_NM );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime_Z( Z410TBM32_UPD_DATETIME );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_user_id_Z( Z411TBM32_UPD_USER_ID );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_prog_nm_Z( Z412TBM32_UPD_PROG_NM );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_cnt_Z( Z413TBM32_UPD_CNT );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_nm_N( (byte)((byte)((n405TBM32_CRF_ITEM_NM)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_div_N( (byte)((byte)((n74TBM32_CRF_ITEM_DIV)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_cd_N( (byte)((byte)((n73TBM32_CRF_ITEM_GRP_CD)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_order_N( (byte)((byte)((n507TBM32_CRF_ITEM_GRP_ORDER)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x_N( (byte)((byte)((n508TBM32_LOCATION_X)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y_N( (byte)((byte)((n509TBM32_LOCATION_Y)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x2_N( (byte)((byte)((n510TBM32_LOCATION_X2)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y2_N( (byte)((byte)((n511TBM32_LOCATION_Y2)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_align_div_N( (byte)((byte)((n512TBM32_TEXT_ALIGN_DIV)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxrows_N( (byte)((byte)((n516TBM32_TEXT_MAXROWS)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxlength_N( (byte)((byte)((n517TBM32_TEXT_MAXLENGTH)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_decimal_digits_N( (byte)((byte)((n518TBM32_DECIMAL_DIGITS)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_true_inner_value_N( (byte)((byte)((n522TBM32_CHK_TRUE_INNER_VALUE)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_false_inner_value_N( (byte)((byte)((n523TBM32_CHK_FALSE_INNER_VALUE)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_fixed_value_N( (byte)((byte)((n527TBM32_FIXED_VALUE)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_list_cd_N( (byte)((byte)((n525TBM32_LIST_CD)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_image_cd_N( (byte)((byte)((n526TBM32_IMAGE_CD)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_N( (byte)((byte)((n524TBM32_TEXT)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_size_N( (byte)((byte)((n513TBM32_FONT_SIZE)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_ul_flg_N( (byte)((byte)((n514TBM32_FONT_UL_FLG)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_color_div_N( (byte)((byte)((n515TBM32_FONT_COLOR_DIV)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_size_div_N( (byte)((byte)((n521TBM32_LINE_SIZE_DIV)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_color_div_N( (byte)((byte)((n689TBM32_LINE_COLOR_DIV)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_start_point_div_N( (byte)((byte)((n519TBM32_LINE_START_POINT_DIV)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_end_point_div_N( (byte)((byte)((n520TBM32_LINE_END_POINT_DIV)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_angle_N( (byte)((byte)((n690TBM32_LINE_ANGLE)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_auth_lvl_min_N( (byte)((byte)((n644TBM32_AUTH_LVL_MIN)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_zorder_N( (byte)((byte)((n645TBM32_ZORDER)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_tab_order_N( (byte)((byte)((n691TBM32_TAB_ORDER)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_tabstop_flg_N( (byte)((byte)((n692TBM32_TABSTOP_FLG)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_required_input_flg_N( (byte)((byte)((n693TBM32_REQUIRED_INPUT_FLG)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_min_value_N( (byte)((byte)((n694TBM32_MIN_VALUE)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_max_value_N( (byte)((byte)((n695TBM32_MAX_VALUE)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_note_N( (byte)((byte)((n406TBM32_CRF_ITEM_NOTE)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_id_N( (byte)((byte)((n774TBM32_REF_CRF_ID)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_item_cd_N( (byte)((byte)((n775TBM32_REF_CRF_ITEM_CD)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_del_flg_N( (byte)((byte)((n75TBM32_DEL_FLG)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime_N( (byte)((byte)((n407TBM32_CRT_DATETIME)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_user_id_N( (byte)((byte)((n408TBM32_CRT_USER_ID)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_prog_nm_N( (byte)((byte)((n409TBM32_CRT_PROG_NM)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime_N( (byte)((byte)((n410TBM32_UPD_DATETIME)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_user_id_N( (byte)((byte)((n411TBM32_UPD_USER_ID)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_prog_nm_N( (byte)((byte)((n412TBM32_UPD_PROG_NM)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_cnt_N( (byte)((byte)((n413TBM32_UPD_CNT)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Mode( Gx_mode );
   }

   public void KeyVarsToRow19( SdtTBM32_CRF_ITEM obj19 )
   {
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_study_id( A70TBM32_STUDY_ID );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_id( A71TBM32_CRF_ID );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_cd( A72TBM32_CRF_ITEM_CD );
   }

   public void RowToVars19( SdtTBM32_CRF_ITEM obj19 ,
                            int forceLoad )
   {
      Gx_mode = obj19.getgxTv_SdtTBM32_CRF_ITEM_Mode() ;
      A407TBM32_CRT_DATETIME = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime() ;
      n407TBM32_CRT_DATETIME = false ;
      A408TBM32_CRT_USER_ID = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_user_id() ;
      n408TBM32_CRT_USER_ID = false ;
      A410TBM32_UPD_DATETIME = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime() ;
      n410TBM32_UPD_DATETIME = false ;
      A411TBM32_UPD_USER_ID = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_user_id() ;
      n411TBM32_UPD_USER_ID = false ;
      A413TBM32_UPD_CNT = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_cnt() ;
      n413TBM32_UPD_CNT = false ;
      A405TBM32_CRF_ITEM_NM = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_nm() ;
      n405TBM32_CRF_ITEM_NM = false ;
      A74TBM32_CRF_ITEM_DIV = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_div() ;
      n74TBM32_CRF_ITEM_DIV = false ;
      A73TBM32_CRF_ITEM_GRP_CD = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_cd() ;
      n73TBM32_CRF_ITEM_GRP_CD = false ;
      A507TBM32_CRF_ITEM_GRP_ORDER = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_order() ;
      n507TBM32_CRF_ITEM_GRP_ORDER = false ;
      A508TBM32_LOCATION_X = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x() ;
      n508TBM32_LOCATION_X = false ;
      A509TBM32_LOCATION_Y = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y() ;
      n509TBM32_LOCATION_Y = false ;
      A510TBM32_LOCATION_X2 = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x2() ;
      n510TBM32_LOCATION_X2 = false ;
      A511TBM32_LOCATION_Y2 = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y2() ;
      n511TBM32_LOCATION_Y2 = false ;
      A512TBM32_TEXT_ALIGN_DIV = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_align_div() ;
      n512TBM32_TEXT_ALIGN_DIV = false ;
      A516TBM32_TEXT_MAXROWS = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxrows() ;
      n516TBM32_TEXT_MAXROWS = false ;
      A517TBM32_TEXT_MAXLENGTH = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxlength() ;
      n517TBM32_TEXT_MAXLENGTH = false ;
      A518TBM32_DECIMAL_DIGITS = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_decimal_digits() ;
      n518TBM32_DECIMAL_DIGITS = false ;
      A522TBM32_CHK_TRUE_INNER_VALUE = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_true_inner_value() ;
      n522TBM32_CHK_TRUE_INNER_VALUE = false ;
      A523TBM32_CHK_FALSE_INNER_VALUE = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_false_inner_value() ;
      n523TBM32_CHK_FALSE_INNER_VALUE = false ;
      A527TBM32_FIXED_VALUE = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_fixed_value() ;
      n527TBM32_FIXED_VALUE = false ;
      A525TBM32_LIST_CD = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_list_cd() ;
      n525TBM32_LIST_CD = false ;
      A526TBM32_IMAGE_CD = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_image_cd() ;
      n526TBM32_IMAGE_CD = false ;
      A524TBM32_TEXT = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_text() ;
      n524TBM32_TEXT = false ;
      A513TBM32_FONT_SIZE = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_size() ;
      n513TBM32_FONT_SIZE = false ;
      A514TBM32_FONT_UL_FLG = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_ul_flg() ;
      n514TBM32_FONT_UL_FLG = false ;
      A515TBM32_FONT_COLOR_DIV = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_color_div() ;
      n515TBM32_FONT_COLOR_DIV = false ;
      A521TBM32_LINE_SIZE_DIV = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_size_div() ;
      n521TBM32_LINE_SIZE_DIV = false ;
      A689TBM32_LINE_COLOR_DIV = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_color_div() ;
      n689TBM32_LINE_COLOR_DIV = false ;
      A519TBM32_LINE_START_POINT_DIV = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_start_point_div() ;
      n519TBM32_LINE_START_POINT_DIV = false ;
      A520TBM32_LINE_END_POINT_DIV = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_end_point_div() ;
      n520TBM32_LINE_END_POINT_DIV = false ;
      A690TBM32_LINE_ANGLE = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_angle() ;
      n690TBM32_LINE_ANGLE = false ;
      A644TBM32_AUTH_LVL_MIN = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_auth_lvl_min() ;
      n644TBM32_AUTH_LVL_MIN = false ;
      A645TBM32_ZORDER = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_zorder() ;
      n645TBM32_ZORDER = false ;
      A691TBM32_TAB_ORDER = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_tab_order() ;
      n691TBM32_TAB_ORDER = false ;
      A692TBM32_TABSTOP_FLG = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_tabstop_flg() ;
      n692TBM32_TABSTOP_FLG = false ;
      A693TBM32_REQUIRED_INPUT_FLG = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_required_input_flg() ;
      n693TBM32_REQUIRED_INPUT_FLG = false ;
      A694TBM32_MIN_VALUE = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_min_value() ;
      n694TBM32_MIN_VALUE = false ;
      A695TBM32_MAX_VALUE = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_max_value() ;
      n695TBM32_MAX_VALUE = false ;
      A406TBM32_CRF_ITEM_NOTE = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_note() ;
      n406TBM32_CRF_ITEM_NOTE = false ;
      A774TBM32_REF_CRF_ID = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_id() ;
      n774TBM32_REF_CRF_ID = false ;
      A775TBM32_REF_CRF_ITEM_CD = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_item_cd() ;
      n775TBM32_REF_CRF_ITEM_CD = false ;
      A75TBM32_DEL_FLG = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_del_flg() ;
      n75TBM32_DEL_FLG = false ;
      A409TBM32_CRT_PROG_NM = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_prog_nm() ;
      n409TBM32_CRT_PROG_NM = false ;
      A412TBM32_UPD_PROG_NM = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_prog_nm() ;
      n412TBM32_UPD_PROG_NM = false ;
      A70TBM32_STUDY_ID = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_study_id() ;
      A71TBM32_CRF_ID = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_id() ;
      A72TBM32_CRF_ITEM_CD = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_cd() ;
      Z70TBM32_STUDY_ID = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_study_id_Z() ;
      Z71TBM32_CRF_ID = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_id_Z() ;
      Z72TBM32_CRF_ITEM_CD = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_cd_Z() ;
      Z405TBM32_CRF_ITEM_NM = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_nm_Z() ;
      Z74TBM32_CRF_ITEM_DIV = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_div_Z() ;
      Z73TBM32_CRF_ITEM_GRP_CD = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_cd_Z() ;
      Z507TBM32_CRF_ITEM_GRP_ORDER = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_order_Z() ;
      Z508TBM32_LOCATION_X = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x_Z() ;
      Z509TBM32_LOCATION_Y = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y_Z() ;
      Z510TBM32_LOCATION_X2 = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x2_Z() ;
      Z511TBM32_LOCATION_Y2 = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y2_Z() ;
      Z512TBM32_TEXT_ALIGN_DIV = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_align_div_Z() ;
      Z516TBM32_TEXT_MAXROWS = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxrows_Z() ;
      Z517TBM32_TEXT_MAXLENGTH = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxlength_Z() ;
      Z518TBM32_DECIMAL_DIGITS = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_decimal_digits_Z() ;
      Z522TBM32_CHK_TRUE_INNER_VALUE = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_true_inner_value_Z() ;
      Z523TBM32_CHK_FALSE_INNER_VALUE = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_false_inner_value_Z() ;
      Z527TBM32_FIXED_VALUE = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_fixed_value_Z() ;
      Z525TBM32_LIST_CD = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_list_cd_Z() ;
      Z526TBM32_IMAGE_CD = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_image_cd_Z() ;
      Z524TBM32_TEXT = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_Z() ;
      Z513TBM32_FONT_SIZE = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_size_Z() ;
      Z514TBM32_FONT_UL_FLG = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_ul_flg_Z() ;
      Z515TBM32_FONT_COLOR_DIV = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_color_div_Z() ;
      Z521TBM32_LINE_SIZE_DIV = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_size_div_Z() ;
      Z689TBM32_LINE_COLOR_DIV = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_color_div_Z() ;
      Z519TBM32_LINE_START_POINT_DIV = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_start_point_div_Z() ;
      Z520TBM32_LINE_END_POINT_DIV = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_end_point_div_Z() ;
      Z690TBM32_LINE_ANGLE = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_angle_Z() ;
      Z644TBM32_AUTH_LVL_MIN = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_auth_lvl_min_Z() ;
      Z645TBM32_ZORDER = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_zorder_Z() ;
      Z691TBM32_TAB_ORDER = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_tab_order_Z() ;
      Z692TBM32_TABSTOP_FLG = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_tabstop_flg_Z() ;
      Z693TBM32_REQUIRED_INPUT_FLG = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_required_input_flg_Z() ;
      Z694TBM32_MIN_VALUE = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_min_value_Z() ;
      Z695TBM32_MAX_VALUE = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_max_value_Z() ;
      Z406TBM32_CRF_ITEM_NOTE = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_note_Z() ;
      Z774TBM32_REF_CRF_ID = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_id_Z() ;
      Z775TBM32_REF_CRF_ITEM_CD = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_item_cd_Z() ;
      Z75TBM32_DEL_FLG = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_del_flg_Z() ;
      Z407TBM32_CRT_DATETIME = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime_Z() ;
      Z408TBM32_CRT_USER_ID = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_user_id_Z() ;
      Z409TBM32_CRT_PROG_NM = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_prog_nm_Z() ;
      Z410TBM32_UPD_DATETIME = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime_Z() ;
      Z411TBM32_UPD_USER_ID = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_user_id_Z() ;
      Z412TBM32_UPD_PROG_NM = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_prog_nm_Z() ;
      Z413TBM32_UPD_CNT = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_cnt_Z() ;
      O413TBM32_UPD_CNT = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_cnt_Z() ;
      n405TBM32_CRF_ITEM_NM = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_nm_N()==0)?false:true) ;
      n74TBM32_CRF_ITEM_DIV = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_div_N()==0)?false:true) ;
      n73TBM32_CRF_ITEM_GRP_CD = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_cd_N()==0)?false:true) ;
      n507TBM32_CRF_ITEM_GRP_ORDER = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_order_N()==0)?false:true) ;
      n508TBM32_LOCATION_X = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x_N()==0)?false:true) ;
      n509TBM32_LOCATION_Y = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y_N()==0)?false:true) ;
      n510TBM32_LOCATION_X2 = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x2_N()==0)?false:true) ;
      n511TBM32_LOCATION_Y2 = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y2_N()==0)?false:true) ;
      n512TBM32_TEXT_ALIGN_DIV = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_align_div_N()==0)?false:true) ;
      n516TBM32_TEXT_MAXROWS = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxrows_N()==0)?false:true) ;
      n517TBM32_TEXT_MAXLENGTH = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxlength_N()==0)?false:true) ;
      n518TBM32_DECIMAL_DIGITS = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_decimal_digits_N()==0)?false:true) ;
      n522TBM32_CHK_TRUE_INNER_VALUE = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_true_inner_value_N()==0)?false:true) ;
      n523TBM32_CHK_FALSE_INNER_VALUE = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_false_inner_value_N()==0)?false:true) ;
      n527TBM32_FIXED_VALUE = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_fixed_value_N()==0)?false:true) ;
      n525TBM32_LIST_CD = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_list_cd_N()==0)?false:true) ;
      n526TBM32_IMAGE_CD = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_image_cd_N()==0)?false:true) ;
      n524TBM32_TEXT = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_N()==0)?false:true) ;
      n513TBM32_FONT_SIZE = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_size_N()==0)?false:true) ;
      n514TBM32_FONT_UL_FLG = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_ul_flg_N()==0)?false:true) ;
      n515TBM32_FONT_COLOR_DIV = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_color_div_N()==0)?false:true) ;
      n521TBM32_LINE_SIZE_DIV = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_size_div_N()==0)?false:true) ;
      n689TBM32_LINE_COLOR_DIV = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_color_div_N()==0)?false:true) ;
      n519TBM32_LINE_START_POINT_DIV = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_start_point_div_N()==0)?false:true) ;
      n520TBM32_LINE_END_POINT_DIV = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_end_point_div_N()==0)?false:true) ;
      n690TBM32_LINE_ANGLE = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_angle_N()==0)?false:true) ;
      n644TBM32_AUTH_LVL_MIN = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_auth_lvl_min_N()==0)?false:true) ;
      n645TBM32_ZORDER = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_zorder_N()==0)?false:true) ;
      n691TBM32_TAB_ORDER = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_tab_order_N()==0)?false:true) ;
      n692TBM32_TABSTOP_FLG = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_tabstop_flg_N()==0)?false:true) ;
      n693TBM32_REQUIRED_INPUT_FLG = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_required_input_flg_N()==0)?false:true) ;
      n694TBM32_MIN_VALUE = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_min_value_N()==0)?false:true) ;
      n695TBM32_MAX_VALUE = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_max_value_N()==0)?false:true) ;
      n406TBM32_CRF_ITEM_NOTE = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_note_N()==0)?false:true) ;
      n774TBM32_REF_CRF_ID = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_id_N()==0)?false:true) ;
      n775TBM32_REF_CRF_ITEM_CD = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_item_cd_N()==0)?false:true) ;
      n75TBM32_DEL_FLG = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_del_flg_N()==0)?false:true) ;
      n407TBM32_CRT_DATETIME = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime_N()==0)?false:true) ;
      n408TBM32_CRT_USER_ID = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_user_id_N()==0)?false:true) ;
      n409TBM32_CRT_PROG_NM = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_prog_nm_N()==0)?false:true) ;
      n410TBM32_UPD_DATETIME = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime_N()==0)?false:true) ;
      n411TBM32_UPD_USER_ID = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_user_id_N()==0)?false:true) ;
      n412TBM32_UPD_PROG_NM = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_prog_nm_N()==0)?false:true) ;
      n413TBM32_UPD_CNT = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_cnt_N()==0)?false:true) ;
      Gx_mode = obj19.getgxTv_SdtTBM32_CRF_ITEM_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A70TBM32_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      A71TBM32_CRF_ID = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.SHORT)).shortValue() ;
      A72TBM32_CRF_ITEM_CD = (String)getParm(obj,2) ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey0K19( ) ;
      scanKeyStart0K19( ) ;
      if ( RcdFound19 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z70TBM32_STUDY_ID = A70TBM32_STUDY_ID ;
         Z71TBM32_CRF_ID = A71TBM32_CRF_ID ;
         Z72TBM32_CRF_ITEM_CD = A72TBM32_CRF_ITEM_CD ;
         O413TBM32_UPD_CNT = A413TBM32_UPD_CNT ;
         n413TBM32_UPD_CNT = false ;
      }
      zm0K19( -8) ;
      onLoadActions0K19( ) ;
      addRow0K19( ) ;
      scanKeyEnd0K19( ) ;
      if ( RcdFound19 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Load( )
   {
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      RowToVars19( bcTBM32_CRF_ITEM, 0) ;
      scanKeyStart0K19( ) ;
      if ( RcdFound19 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z70TBM32_STUDY_ID = A70TBM32_STUDY_ID ;
         Z71TBM32_CRF_ID = A71TBM32_CRF_ID ;
         Z72TBM32_CRF_ITEM_CD = A72TBM32_CRF_ITEM_CD ;
         O413TBM32_UPD_CNT = A413TBM32_UPD_CNT ;
         n413TBM32_UPD_CNT = false ;
      }
      zm0K19( -8) ;
      onLoadActions0K19( ) ;
      addRow0K19( ) ;
      scanKeyEnd0K19( ) ;
      if ( RcdFound19 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Save( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars19( bcTBM32_CRF_ITEM, 0) ;
      nKeyPressed = (byte)(1) ;
      getKey0K19( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         insert0K19( ) ;
      }
      else
      {
         if ( RcdFound19 == 1 )
         {
            if ( ( A70TBM32_STUDY_ID != Z70TBM32_STUDY_ID ) || ( A71TBM32_CRF_ID != Z71TBM32_CRF_ID ) || ( GXutil.strcmp(A72TBM32_CRF_ITEM_CD, Z72TBM32_CRF_ITEM_CD) != 0 ) )
            {
               A70TBM32_STUDY_ID = Z70TBM32_STUDY_ID ;
               A71TBM32_CRF_ID = Z71TBM32_CRF_ID ;
               A72TBM32_CRF_ITEM_CD = Z72TBM32_CRF_ITEM_CD ;
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "");
               AnyError = (short)(1) ;
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               /* Update record */
               update0K19( ) ;
            }
         }
         else
         {
            if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "");
               AnyError = (short)(1) ;
            }
            else
            {
               if ( ( A70TBM32_STUDY_ID != Z70TBM32_STUDY_ID ) || ( A71TBM32_CRF_ID != Z71TBM32_CRF_ID ) || ( GXutil.strcmp(A72TBM32_CRF_ITEM_CD, Z72TBM32_CRF_ITEM_CD) != 0 ) )
               {
                  if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  else
                  {
                     Gx_mode = "INS" ;
                     /* Insert record */
                     insert0K19( ) ;
                  }
               }
               else
               {
                  if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
                  else
                  {
                     Gx_mode = "INS" ;
                     /* Insert record */
                     insert0K19( ) ;
                  }
               }
            }
         }
      }
      afterTrn( ) ;
      VarsToRow19( bcTBM32_CRF_ITEM) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars19( bcTBM32_CRF_ITEM, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey0K19( ) ;
      if ( RcdFound19 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( A70TBM32_STUDY_ID != Z70TBM32_STUDY_ID ) || ( A71TBM32_CRF_ID != Z71TBM32_CRF_ID ) || ( GXutil.strcmp(A72TBM32_CRF_ITEM_CD, Z72TBM32_CRF_ITEM_CD) != 0 ) )
         {
            A70TBM32_STUDY_ID = Z70TBM32_STUDY_ID ;
            A71TBM32_CRF_ID = Z71TBM32_CRF_ID ;
            A72TBM32_CRF_ITEM_CD = Z72TBM32_CRF_ITEM_CD ;
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            delete_check( ) ;
         }
         else
         {
            Gx_mode = "UPD" ;
            update_check( ) ;
         }
      }
      else
      {
         if ( ( A70TBM32_STUDY_ID != Z70TBM32_STUDY_ID ) || ( A71TBM32_CRF_ID != Z71TBM32_CRF_ID ) || ( GXutil.strcmp(A72TBM32_CRF_ITEM_CD, Z72TBM32_CRF_ITEM_CD) != 0 ) )
         {
            Gx_mode = "INS" ;
            insert_check( ) ;
         }
         else
         {
            if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
               AnyError = (short)(1) ;
            }
            else
            {
               Gx_mode = "INS" ;
               insert_check( ) ;
            }
         }
      }
      Application.rollback(context, remoteHandle, "DEFAULT", "tbm32_crf_item_bc");
      VarsToRow19( bcTBM32_CRF_ITEM) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public int Errors( )
   {
      if ( AnyError == 0 )
      {
         return 0 ;
      }
      return 1 ;
   }

   public com.genexus.internet.MsgList GetMessages( )
   {
      return LclMsgLst ;
   }

   public String GetMode( )
   {
      Gx_mode = bcTBM32_CRF_ITEM.getgxTv_SdtTBM32_CRF_ITEM_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcTBM32_CRF_ITEM.setgxTv_SdtTBM32_CRF_ITEM_Mode( Gx_mode );
   }

   public void SetSDT( SdtTBM32_CRF_ITEM sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcTBM32_CRF_ITEM )
      {
         bcTBM32_CRF_ITEM = sdt ;
         if ( GXutil.strcmp(bcTBM32_CRF_ITEM.getgxTv_SdtTBM32_CRF_ITEM_Mode(), "") == 0 )
         {
            bcTBM32_CRF_ITEM.setgxTv_SdtTBM32_CRF_ITEM_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow19( bcTBM32_CRF_ITEM) ;
         }
         else
         {
            RowToVars19( bcTBM32_CRF_ITEM, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcTBM32_CRF_ITEM.getgxTv_SdtTBM32_CRF_ITEM_Mode(), "") == 0 )
         {
            bcTBM32_CRF_ITEM.setgxTv_SdtTBM32_CRF_ITEM_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars19( bcTBM32_CRF_ITEM, 1) ;
   }

   public SdtTBM32_CRF_ITEM getTBM32_CRF_ITEM_BC( )
   {
      return bcTBM32_CRF_ITEM ;
   }


   public void webExecute( )
   {
   }

   protected void createObjects( )
   {
   }

   protected void Process( )
   {
   }

   protected void cleanup( )
   {
      super.cleanup();
      CloseOpenCursors();
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
               default:
                  /* Execute user subroutine: S112 */
                  S112 ();
                  break;
         }
      }
   }

   public void initialize( )
   {
      scmdbuf = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Gx_mode = "" ;
      Z72TBM32_CRF_ITEM_CD = "" ;
      A72TBM32_CRF_ITEM_CD = "" ;
      AV8W_BC_FLG = "" ;
      AV9Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV7W_TXT = "" ;
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
      A407TBM32_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A408TBM32_CRT_USER_ID = "" ;
      A409TBM32_CRT_PROG_NM = "" ;
      A410TBM32_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A411TBM32_UPD_USER_ID = "" ;
      A412TBM32_UPD_PROG_NM = "" ;
      Z407TBM32_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z408TBM32_CRT_USER_ID = "" ;
      Z410TBM32_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z411TBM32_UPD_USER_ID = "" ;
      Z405TBM32_CRF_ITEM_NM = "" ;
      Z74TBM32_CRF_ITEM_DIV = "" ;
      Z73TBM32_CRF_ITEM_GRP_CD = "" ;
      Z512TBM32_TEXT_ALIGN_DIV = "" ;
      Z522TBM32_CHK_TRUE_INNER_VALUE = "" ;
      Z523TBM32_CHK_FALSE_INNER_VALUE = "" ;
      Z527TBM32_FIXED_VALUE = "" ;
      Z525TBM32_LIST_CD = "" ;
      Z526TBM32_IMAGE_CD = "" ;
      Z524TBM32_TEXT = "" ;
      Z514TBM32_FONT_UL_FLG = "" ;
      Z519TBM32_LINE_START_POINT_DIV = "" ;
      Z520TBM32_LINE_END_POINT_DIV = "" ;
      Z692TBM32_TABSTOP_FLG = "" ;
      Z693TBM32_REQUIRED_INPUT_FLG = "" ;
      Z694TBM32_MIN_VALUE = "" ;
      Z695TBM32_MAX_VALUE = "" ;
      Z406TBM32_CRF_ITEM_NOTE = "" ;
      Z775TBM32_REF_CRF_ITEM_CD = "" ;
      Z75TBM32_DEL_FLG = "" ;
      Z409TBM32_CRT_PROG_NM = "" ;
      Z412TBM32_UPD_PROG_NM = "" ;
      BC000K4_A70TBM32_STUDY_ID = new long[1] ;
      BC000K4_A71TBM32_CRF_ID = new short[1] ;
      BC000K4_A72TBM32_CRF_ITEM_CD = new String[] {""} ;
      BC000K4_A407TBM32_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000K4_n407TBM32_CRT_DATETIME = new boolean[] {false} ;
      BC000K4_A408TBM32_CRT_USER_ID = new String[] {""} ;
      BC000K4_n408TBM32_CRT_USER_ID = new boolean[] {false} ;
      BC000K4_A410TBM32_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000K4_n410TBM32_UPD_DATETIME = new boolean[] {false} ;
      BC000K4_A411TBM32_UPD_USER_ID = new String[] {""} ;
      BC000K4_n411TBM32_UPD_USER_ID = new boolean[] {false} ;
      BC000K4_A413TBM32_UPD_CNT = new long[1] ;
      BC000K4_n413TBM32_UPD_CNT = new boolean[] {false} ;
      BC000K4_A405TBM32_CRF_ITEM_NM = new String[] {""} ;
      BC000K4_n405TBM32_CRF_ITEM_NM = new boolean[] {false} ;
      BC000K4_A74TBM32_CRF_ITEM_DIV = new String[] {""} ;
      BC000K4_n74TBM32_CRF_ITEM_DIV = new boolean[] {false} ;
      BC000K4_A73TBM32_CRF_ITEM_GRP_CD = new String[] {""} ;
      BC000K4_n73TBM32_CRF_ITEM_GRP_CD = new boolean[] {false} ;
      BC000K4_A507TBM32_CRF_ITEM_GRP_ORDER = new short[1] ;
      BC000K4_n507TBM32_CRF_ITEM_GRP_ORDER = new boolean[] {false} ;
      BC000K4_A508TBM32_LOCATION_X = new short[1] ;
      BC000K4_n508TBM32_LOCATION_X = new boolean[] {false} ;
      BC000K4_A509TBM32_LOCATION_Y = new short[1] ;
      BC000K4_n509TBM32_LOCATION_Y = new boolean[] {false} ;
      BC000K4_A510TBM32_LOCATION_X2 = new short[1] ;
      BC000K4_n510TBM32_LOCATION_X2 = new boolean[] {false} ;
      BC000K4_A511TBM32_LOCATION_Y2 = new short[1] ;
      BC000K4_n511TBM32_LOCATION_Y2 = new boolean[] {false} ;
      BC000K4_A512TBM32_TEXT_ALIGN_DIV = new String[] {""} ;
      BC000K4_n512TBM32_TEXT_ALIGN_DIV = new boolean[] {false} ;
      BC000K4_A516TBM32_TEXT_MAXROWS = new byte[1] ;
      BC000K4_n516TBM32_TEXT_MAXROWS = new boolean[] {false} ;
      BC000K4_A517TBM32_TEXT_MAXLENGTH = new short[1] ;
      BC000K4_n517TBM32_TEXT_MAXLENGTH = new boolean[] {false} ;
      BC000K4_A518TBM32_DECIMAL_DIGITS = new byte[1] ;
      BC000K4_n518TBM32_DECIMAL_DIGITS = new boolean[] {false} ;
      BC000K4_A522TBM32_CHK_TRUE_INNER_VALUE = new String[] {""} ;
      BC000K4_n522TBM32_CHK_TRUE_INNER_VALUE = new boolean[] {false} ;
      BC000K4_A523TBM32_CHK_FALSE_INNER_VALUE = new String[] {""} ;
      BC000K4_n523TBM32_CHK_FALSE_INNER_VALUE = new boolean[] {false} ;
      BC000K4_A527TBM32_FIXED_VALUE = new String[] {""} ;
      BC000K4_n527TBM32_FIXED_VALUE = new boolean[] {false} ;
      BC000K4_A525TBM32_LIST_CD = new String[] {""} ;
      BC000K4_n525TBM32_LIST_CD = new boolean[] {false} ;
      BC000K4_A526TBM32_IMAGE_CD = new String[] {""} ;
      BC000K4_n526TBM32_IMAGE_CD = new boolean[] {false} ;
      BC000K4_A524TBM32_TEXT = new String[] {""} ;
      BC000K4_n524TBM32_TEXT = new boolean[] {false} ;
      BC000K4_A513TBM32_FONT_SIZE = new byte[1] ;
      BC000K4_n513TBM32_FONT_SIZE = new boolean[] {false} ;
      BC000K4_A514TBM32_FONT_UL_FLG = new String[] {""} ;
      BC000K4_n514TBM32_FONT_UL_FLG = new boolean[] {false} ;
      BC000K4_A515TBM32_FONT_COLOR_DIV = new long[1] ;
      BC000K4_n515TBM32_FONT_COLOR_DIV = new boolean[] {false} ;
      BC000K4_A521TBM32_LINE_SIZE_DIV = new byte[1] ;
      BC000K4_n521TBM32_LINE_SIZE_DIV = new boolean[] {false} ;
      BC000K4_A689TBM32_LINE_COLOR_DIV = new long[1] ;
      BC000K4_n689TBM32_LINE_COLOR_DIV = new boolean[] {false} ;
      BC000K4_A519TBM32_LINE_START_POINT_DIV = new String[] {""} ;
      BC000K4_n519TBM32_LINE_START_POINT_DIV = new boolean[] {false} ;
      BC000K4_A520TBM32_LINE_END_POINT_DIV = new String[] {""} ;
      BC000K4_n520TBM32_LINE_END_POINT_DIV = new boolean[] {false} ;
      BC000K4_A690TBM32_LINE_ANGLE = new short[1] ;
      BC000K4_n690TBM32_LINE_ANGLE = new boolean[] {false} ;
      BC000K4_A644TBM32_AUTH_LVL_MIN = new byte[1] ;
      BC000K4_n644TBM32_AUTH_LVL_MIN = new boolean[] {false} ;
      BC000K4_A645TBM32_ZORDER = new short[1] ;
      BC000K4_n645TBM32_ZORDER = new boolean[] {false} ;
      BC000K4_A691TBM32_TAB_ORDER = new short[1] ;
      BC000K4_n691TBM32_TAB_ORDER = new boolean[] {false} ;
      BC000K4_A692TBM32_TABSTOP_FLG = new String[] {""} ;
      BC000K4_n692TBM32_TABSTOP_FLG = new boolean[] {false} ;
      BC000K4_A693TBM32_REQUIRED_INPUT_FLG = new String[] {""} ;
      BC000K4_n693TBM32_REQUIRED_INPUT_FLG = new boolean[] {false} ;
      BC000K4_A694TBM32_MIN_VALUE = new String[] {""} ;
      BC000K4_n694TBM32_MIN_VALUE = new boolean[] {false} ;
      BC000K4_A695TBM32_MAX_VALUE = new String[] {""} ;
      BC000K4_n695TBM32_MAX_VALUE = new boolean[] {false} ;
      BC000K4_A406TBM32_CRF_ITEM_NOTE = new String[] {""} ;
      BC000K4_n406TBM32_CRF_ITEM_NOTE = new boolean[] {false} ;
      BC000K4_A774TBM32_REF_CRF_ID = new short[1] ;
      BC000K4_n774TBM32_REF_CRF_ID = new boolean[] {false} ;
      BC000K4_A775TBM32_REF_CRF_ITEM_CD = new String[] {""} ;
      BC000K4_n775TBM32_REF_CRF_ITEM_CD = new boolean[] {false} ;
      BC000K4_A75TBM32_DEL_FLG = new String[] {""} ;
      BC000K4_n75TBM32_DEL_FLG = new boolean[] {false} ;
      BC000K4_A409TBM32_CRT_PROG_NM = new String[] {""} ;
      BC000K4_n409TBM32_CRT_PROG_NM = new boolean[] {false} ;
      BC000K4_A412TBM32_UPD_PROG_NM = new String[] {""} ;
      BC000K4_n412TBM32_UPD_PROG_NM = new boolean[] {false} ;
      BC000K5_A70TBM32_STUDY_ID = new long[1] ;
      BC000K5_A71TBM32_CRF_ID = new short[1] ;
      BC000K5_A72TBM32_CRF_ITEM_CD = new String[] {""} ;
      BC000K6_A70TBM32_STUDY_ID = new long[1] ;
      BC000K6_A71TBM32_CRF_ID = new short[1] ;
      BC000K6_A72TBM32_CRF_ITEM_CD = new String[] {""} ;
      BC000K6_A407TBM32_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000K6_n407TBM32_CRT_DATETIME = new boolean[] {false} ;
      BC000K6_A408TBM32_CRT_USER_ID = new String[] {""} ;
      BC000K6_n408TBM32_CRT_USER_ID = new boolean[] {false} ;
      BC000K6_A410TBM32_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000K6_n410TBM32_UPD_DATETIME = new boolean[] {false} ;
      BC000K6_A411TBM32_UPD_USER_ID = new String[] {""} ;
      BC000K6_n411TBM32_UPD_USER_ID = new boolean[] {false} ;
      BC000K6_A413TBM32_UPD_CNT = new long[1] ;
      BC000K6_n413TBM32_UPD_CNT = new boolean[] {false} ;
      BC000K6_A405TBM32_CRF_ITEM_NM = new String[] {""} ;
      BC000K6_n405TBM32_CRF_ITEM_NM = new boolean[] {false} ;
      BC000K6_A74TBM32_CRF_ITEM_DIV = new String[] {""} ;
      BC000K6_n74TBM32_CRF_ITEM_DIV = new boolean[] {false} ;
      BC000K6_A73TBM32_CRF_ITEM_GRP_CD = new String[] {""} ;
      BC000K6_n73TBM32_CRF_ITEM_GRP_CD = new boolean[] {false} ;
      BC000K6_A507TBM32_CRF_ITEM_GRP_ORDER = new short[1] ;
      BC000K6_n507TBM32_CRF_ITEM_GRP_ORDER = new boolean[] {false} ;
      BC000K6_A508TBM32_LOCATION_X = new short[1] ;
      BC000K6_n508TBM32_LOCATION_X = new boolean[] {false} ;
      BC000K6_A509TBM32_LOCATION_Y = new short[1] ;
      BC000K6_n509TBM32_LOCATION_Y = new boolean[] {false} ;
      BC000K6_A510TBM32_LOCATION_X2 = new short[1] ;
      BC000K6_n510TBM32_LOCATION_X2 = new boolean[] {false} ;
      BC000K6_A511TBM32_LOCATION_Y2 = new short[1] ;
      BC000K6_n511TBM32_LOCATION_Y2 = new boolean[] {false} ;
      BC000K6_A512TBM32_TEXT_ALIGN_DIV = new String[] {""} ;
      BC000K6_n512TBM32_TEXT_ALIGN_DIV = new boolean[] {false} ;
      BC000K6_A516TBM32_TEXT_MAXROWS = new byte[1] ;
      BC000K6_n516TBM32_TEXT_MAXROWS = new boolean[] {false} ;
      BC000K6_A517TBM32_TEXT_MAXLENGTH = new short[1] ;
      BC000K6_n517TBM32_TEXT_MAXLENGTH = new boolean[] {false} ;
      BC000K6_A518TBM32_DECIMAL_DIGITS = new byte[1] ;
      BC000K6_n518TBM32_DECIMAL_DIGITS = new boolean[] {false} ;
      BC000K6_A522TBM32_CHK_TRUE_INNER_VALUE = new String[] {""} ;
      BC000K6_n522TBM32_CHK_TRUE_INNER_VALUE = new boolean[] {false} ;
      BC000K6_A523TBM32_CHK_FALSE_INNER_VALUE = new String[] {""} ;
      BC000K6_n523TBM32_CHK_FALSE_INNER_VALUE = new boolean[] {false} ;
      BC000K6_A527TBM32_FIXED_VALUE = new String[] {""} ;
      BC000K6_n527TBM32_FIXED_VALUE = new boolean[] {false} ;
      BC000K6_A525TBM32_LIST_CD = new String[] {""} ;
      BC000K6_n525TBM32_LIST_CD = new boolean[] {false} ;
      BC000K6_A526TBM32_IMAGE_CD = new String[] {""} ;
      BC000K6_n526TBM32_IMAGE_CD = new boolean[] {false} ;
      BC000K6_A524TBM32_TEXT = new String[] {""} ;
      BC000K6_n524TBM32_TEXT = new boolean[] {false} ;
      BC000K6_A513TBM32_FONT_SIZE = new byte[1] ;
      BC000K6_n513TBM32_FONT_SIZE = new boolean[] {false} ;
      BC000K6_A514TBM32_FONT_UL_FLG = new String[] {""} ;
      BC000K6_n514TBM32_FONT_UL_FLG = new boolean[] {false} ;
      BC000K6_A515TBM32_FONT_COLOR_DIV = new long[1] ;
      BC000K6_n515TBM32_FONT_COLOR_DIV = new boolean[] {false} ;
      BC000K6_A521TBM32_LINE_SIZE_DIV = new byte[1] ;
      BC000K6_n521TBM32_LINE_SIZE_DIV = new boolean[] {false} ;
      BC000K6_A689TBM32_LINE_COLOR_DIV = new long[1] ;
      BC000K6_n689TBM32_LINE_COLOR_DIV = new boolean[] {false} ;
      BC000K6_A519TBM32_LINE_START_POINT_DIV = new String[] {""} ;
      BC000K6_n519TBM32_LINE_START_POINT_DIV = new boolean[] {false} ;
      BC000K6_A520TBM32_LINE_END_POINT_DIV = new String[] {""} ;
      BC000K6_n520TBM32_LINE_END_POINT_DIV = new boolean[] {false} ;
      BC000K6_A690TBM32_LINE_ANGLE = new short[1] ;
      BC000K6_n690TBM32_LINE_ANGLE = new boolean[] {false} ;
      BC000K6_A644TBM32_AUTH_LVL_MIN = new byte[1] ;
      BC000K6_n644TBM32_AUTH_LVL_MIN = new boolean[] {false} ;
      BC000K6_A645TBM32_ZORDER = new short[1] ;
      BC000K6_n645TBM32_ZORDER = new boolean[] {false} ;
      BC000K6_A691TBM32_TAB_ORDER = new short[1] ;
      BC000K6_n691TBM32_TAB_ORDER = new boolean[] {false} ;
      BC000K6_A692TBM32_TABSTOP_FLG = new String[] {""} ;
      BC000K6_n692TBM32_TABSTOP_FLG = new boolean[] {false} ;
      BC000K6_A693TBM32_REQUIRED_INPUT_FLG = new String[] {""} ;
      BC000K6_n693TBM32_REQUIRED_INPUT_FLG = new boolean[] {false} ;
      BC000K6_A694TBM32_MIN_VALUE = new String[] {""} ;
      BC000K6_n694TBM32_MIN_VALUE = new boolean[] {false} ;
      BC000K6_A695TBM32_MAX_VALUE = new String[] {""} ;
      BC000K6_n695TBM32_MAX_VALUE = new boolean[] {false} ;
      BC000K6_A406TBM32_CRF_ITEM_NOTE = new String[] {""} ;
      BC000K6_n406TBM32_CRF_ITEM_NOTE = new boolean[] {false} ;
      BC000K6_A774TBM32_REF_CRF_ID = new short[1] ;
      BC000K6_n774TBM32_REF_CRF_ID = new boolean[] {false} ;
      BC000K6_A775TBM32_REF_CRF_ITEM_CD = new String[] {""} ;
      BC000K6_n775TBM32_REF_CRF_ITEM_CD = new boolean[] {false} ;
      BC000K6_A75TBM32_DEL_FLG = new String[] {""} ;
      BC000K6_n75TBM32_DEL_FLG = new boolean[] {false} ;
      BC000K6_A409TBM32_CRT_PROG_NM = new String[] {""} ;
      BC000K6_n409TBM32_CRT_PROG_NM = new boolean[] {false} ;
      BC000K6_A412TBM32_UPD_PROG_NM = new String[] {""} ;
      BC000K6_n412TBM32_UPD_PROG_NM = new boolean[] {false} ;
      sMode19 = "" ;
      BC000K7_A70TBM32_STUDY_ID = new long[1] ;
      BC000K7_A71TBM32_CRF_ID = new short[1] ;
      BC000K7_A72TBM32_CRF_ITEM_CD = new String[] {""} ;
      BC000K7_A407TBM32_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000K7_n407TBM32_CRT_DATETIME = new boolean[] {false} ;
      BC000K7_A408TBM32_CRT_USER_ID = new String[] {""} ;
      BC000K7_n408TBM32_CRT_USER_ID = new boolean[] {false} ;
      BC000K7_A410TBM32_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000K7_n410TBM32_UPD_DATETIME = new boolean[] {false} ;
      BC000K7_A411TBM32_UPD_USER_ID = new String[] {""} ;
      BC000K7_n411TBM32_UPD_USER_ID = new boolean[] {false} ;
      BC000K7_A413TBM32_UPD_CNT = new long[1] ;
      BC000K7_n413TBM32_UPD_CNT = new boolean[] {false} ;
      BC000K7_A405TBM32_CRF_ITEM_NM = new String[] {""} ;
      BC000K7_n405TBM32_CRF_ITEM_NM = new boolean[] {false} ;
      BC000K7_A74TBM32_CRF_ITEM_DIV = new String[] {""} ;
      BC000K7_n74TBM32_CRF_ITEM_DIV = new boolean[] {false} ;
      BC000K7_A73TBM32_CRF_ITEM_GRP_CD = new String[] {""} ;
      BC000K7_n73TBM32_CRF_ITEM_GRP_CD = new boolean[] {false} ;
      BC000K7_A507TBM32_CRF_ITEM_GRP_ORDER = new short[1] ;
      BC000K7_n507TBM32_CRF_ITEM_GRP_ORDER = new boolean[] {false} ;
      BC000K7_A508TBM32_LOCATION_X = new short[1] ;
      BC000K7_n508TBM32_LOCATION_X = new boolean[] {false} ;
      BC000K7_A509TBM32_LOCATION_Y = new short[1] ;
      BC000K7_n509TBM32_LOCATION_Y = new boolean[] {false} ;
      BC000K7_A510TBM32_LOCATION_X2 = new short[1] ;
      BC000K7_n510TBM32_LOCATION_X2 = new boolean[] {false} ;
      BC000K7_A511TBM32_LOCATION_Y2 = new short[1] ;
      BC000K7_n511TBM32_LOCATION_Y2 = new boolean[] {false} ;
      BC000K7_A512TBM32_TEXT_ALIGN_DIV = new String[] {""} ;
      BC000K7_n512TBM32_TEXT_ALIGN_DIV = new boolean[] {false} ;
      BC000K7_A516TBM32_TEXT_MAXROWS = new byte[1] ;
      BC000K7_n516TBM32_TEXT_MAXROWS = new boolean[] {false} ;
      BC000K7_A517TBM32_TEXT_MAXLENGTH = new short[1] ;
      BC000K7_n517TBM32_TEXT_MAXLENGTH = new boolean[] {false} ;
      BC000K7_A518TBM32_DECIMAL_DIGITS = new byte[1] ;
      BC000K7_n518TBM32_DECIMAL_DIGITS = new boolean[] {false} ;
      BC000K7_A522TBM32_CHK_TRUE_INNER_VALUE = new String[] {""} ;
      BC000K7_n522TBM32_CHK_TRUE_INNER_VALUE = new boolean[] {false} ;
      BC000K7_A523TBM32_CHK_FALSE_INNER_VALUE = new String[] {""} ;
      BC000K7_n523TBM32_CHK_FALSE_INNER_VALUE = new boolean[] {false} ;
      BC000K7_A527TBM32_FIXED_VALUE = new String[] {""} ;
      BC000K7_n527TBM32_FIXED_VALUE = new boolean[] {false} ;
      BC000K7_A525TBM32_LIST_CD = new String[] {""} ;
      BC000K7_n525TBM32_LIST_CD = new boolean[] {false} ;
      BC000K7_A526TBM32_IMAGE_CD = new String[] {""} ;
      BC000K7_n526TBM32_IMAGE_CD = new boolean[] {false} ;
      BC000K7_A524TBM32_TEXT = new String[] {""} ;
      BC000K7_n524TBM32_TEXT = new boolean[] {false} ;
      BC000K7_A513TBM32_FONT_SIZE = new byte[1] ;
      BC000K7_n513TBM32_FONT_SIZE = new boolean[] {false} ;
      BC000K7_A514TBM32_FONT_UL_FLG = new String[] {""} ;
      BC000K7_n514TBM32_FONT_UL_FLG = new boolean[] {false} ;
      BC000K7_A515TBM32_FONT_COLOR_DIV = new long[1] ;
      BC000K7_n515TBM32_FONT_COLOR_DIV = new boolean[] {false} ;
      BC000K7_A521TBM32_LINE_SIZE_DIV = new byte[1] ;
      BC000K7_n521TBM32_LINE_SIZE_DIV = new boolean[] {false} ;
      BC000K7_A689TBM32_LINE_COLOR_DIV = new long[1] ;
      BC000K7_n689TBM32_LINE_COLOR_DIV = new boolean[] {false} ;
      BC000K7_A519TBM32_LINE_START_POINT_DIV = new String[] {""} ;
      BC000K7_n519TBM32_LINE_START_POINT_DIV = new boolean[] {false} ;
      BC000K7_A520TBM32_LINE_END_POINT_DIV = new String[] {""} ;
      BC000K7_n520TBM32_LINE_END_POINT_DIV = new boolean[] {false} ;
      BC000K7_A690TBM32_LINE_ANGLE = new short[1] ;
      BC000K7_n690TBM32_LINE_ANGLE = new boolean[] {false} ;
      BC000K7_A644TBM32_AUTH_LVL_MIN = new byte[1] ;
      BC000K7_n644TBM32_AUTH_LVL_MIN = new boolean[] {false} ;
      BC000K7_A645TBM32_ZORDER = new short[1] ;
      BC000K7_n645TBM32_ZORDER = new boolean[] {false} ;
      BC000K7_A691TBM32_TAB_ORDER = new short[1] ;
      BC000K7_n691TBM32_TAB_ORDER = new boolean[] {false} ;
      BC000K7_A692TBM32_TABSTOP_FLG = new String[] {""} ;
      BC000K7_n692TBM32_TABSTOP_FLG = new boolean[] {false} ;
      BC000K7_A693TBM32_REQUIRED_INPUT_FLG = new String[] {""} ;
      BC000K7_n693TBM32_REQUIRED_INPUT_FLG = new boolean[] {false} ;
      BC000K7_A694TBM32_MIN_VALUE = new String[] {""} ;
      BC000K7_n694TBM32_MIN_VALUE = new boolean[] {false} ;
      BC000K7_A695TBM32_MAX_VALUE = new String[] {""} ;
      BC000K7_n695TBM32_MAX_VALUE = new boolean[] {false} ;
      BC000K7_A406TBM32_CRF_ITEM_NOTE = new String[] {""} ;
      BC000K7_n406TBM32_CRF_ITEM_NOTE = new boolean[] {false} ;
      BC000K7_A774TBM32_REF_CRF_ID = new short[1] ;
      BC000K7_n774TBM32_REF_CRF_ID = new boolean[] {false} ;
      BC000K7_A775TBM32_REF_CRF_ITEM_CD = new String[] {""} ;
      BC000K7_n775TBM32_REF_CRF_ITEM_CD = new boolean[] {false} ;
      BC000K7_A75TBM32_DEL_FLG = new String[] {""} ;
      BC000K7_n75TBM32_DEL_FLG = new boolean[] {false} ;
      BC000K7_A409TBM32_CRT_PROG_NM = new String[] {""} ;
      BC000K7_n409TBM32_CRT_PROG_NM = new boolean[] {false} ;
      BC000K7_A412TBM32_UPD_PROG_NM = new String[] {""} ;
      BC000K7_n412TBM32_UPD_PROG_NM = new boolean[] {false} ;
      BC000K11_A70TBM32_STUDY_ID = new long[1] ;
      BC000K11_A71TBM32_CRF_ID = new short[1] ;
      BC000K11_A72TBM32_CRF_ITEM_CD = new String[] {""} ;
      BC000K11_A407TBM32_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000K11_n407TBM32_CRT_DATETIME = new boolean[] {false} ;
      BC000K11_A408TBM32_CRT_USER_ID = new String[] {""} ;
      BC000K11_n408TBM32_CRT_USER_ID = new boolean[] {false} ;
      BC000K11_A410TBM32_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000K11_n410TBM32_UPD_DATETIME = new boolean[] {false} ;
      BC000K11_A411TBM32_UPD_USER_ID = new String[] {""} ;
      BC000K11_n411TBM32_UPD_USER_ID = new boolean[] {false} ;
      BC000K11_A413TBM32_UPD_CNT = new long[1] ;
      BC000K11_n413TBM32_UPD_CNT = new boolean[] {false} ;
      BC000K11_A405TBM32_CRF_ITEM_NM = new String[] {""} ;
      BC000K11_n405TBM32_CRF_ITEM_NM = new boolean[] {false} ;
      BC000K11_A74TBM32_CRF_ITEM_DIV = new String[] {""} ;
      BC000K11_n74TBM32_CRF_ITEM_DIV = new boolean[] {false} ;
      BC000K11_A73TBM32_CRF_ITEM_GRP_CD = new String[] {""} ;
      BC000K11_n73TBM32_CRF_ITEM_GRP_CD = new boolean[] {false} ;
      BC000K11_A507TBM32_CRF_ITEM_GRP_ORDER = new short[1] ;
      BC000K11_n507TBM32_CRF_ITEM_GRP_ORDER = new boolean[] {false} ;
      BC000K11_A508TBM32_LOCATION_X = new short[1] ;
      BC000K11_n508TBM32_LOCATION_X = new boolean[] {false} ;
      BC000K11_A509TBM32_LOCATION_Y = new short[1] ;
      BC000K11_n509TBM32_LOCATION_Y = new boolean[] {false} ;
      BC000K11_A510TBM32_LOCATION_X2 = new short[1] ;
      BC000K11_n510TBM32_LOCATION_X2 = new boolean[] {false} ;
      BC000K11_A511TBM32_LOCATION_Y2 = new short[1] ;
      BC000K11_n511TBM32_LOCATION_Y2 = new boolean[] {false} ;
      BC000K11_A512TBM32_TEXT_ALIGN_DIV = new String[] {""} ;
      BC000K11_n512TBM32_TEXT_ALIGN_DIV = new boolean[] {false} ;
      BC000K11_A516TBM32_TEXT_MAXROWS = new byte[1] ;
      BC000K11_n516TBM32_TEXT_MAXROWS = new boolean[] {false} ;
      BC000K11_A517TBM32_TEXT_MAXLENGTH = new short[1] ;
      BC000K11_n517TBM32_TEXT_MAXLENGTH = new boolean[] {false} ;
      BC000K11_A518TBM32_DECIMAL_DIGITS = new byte[1] ;
      BC000K11_n518TBM32_DECIMAL_DIGITS = new boolean[] {false} ;
      BC000K11_A522TBM32_CHK_TRUE_INNER_VALUE = new String[] {""} ;
      BC000K11_n522TBM32_CHK_TRUE_INNER_VALUE = new boolean[] {false} ;
      BC000K11_A523TBM32_CHK_FALSE_INNER_VALUE = new String[] {""} ;
      BC000K11_n523TBM32_CHK_FALSE_INNER_VALUE = new boolean[] {false} ;
      BC000K11_A527TBM32_FIXED_VALUE = new String[] {""} ;
      BC000K11_n527TBM32_FIXED_VALUE = new boolean[] {false} ;
      BC000K11_A525TBM32_LIST_CD = new String[] {""} ;
      BC000K11_n525TBM32_LIST_CD = new boolean[] {false} ;
      BC000K11_A526TBM32_IMAGE_CD = new String[] {""} ;
      BC000K11_n526TBM32_IMAGE_CD = new boolean[] {false} ;
      BC000K11_A524TBM32_TEXT = new String[] {""} ;
      BC000K11_n524TBM32_TEXT = new boolean[] {false} ;
      BC000K11_A513TBM32_FONT_SIZE = new byte[1] ;
      BC000K11_n513TBM32_FONT_SIZE = new boolean[] {false} ;
      BC000K11_A514TBM32_FONT_UL_FLG = new String[] {""} ;
      BC000K11_n514TBM32_FONT_UL_FLG = new boolean[] {false} ;
      BC000K11_A515TBM32_FONT_COLOR_DIV = new long[1] ;
      BC000K11_n515TBM32_FONT_COLOR_DIV = new boolean[] {false} ;
      BC000K11_A521TBM32_LINE_SIZE_DIV = new byte[1] ;
      BC000K11_n521TBM32_LINE_SIZE_DIV = new boolean[] {false} ;
      BC000K11_A689TBM32_LINE_COLOR_DIV = new long[1] ;
      BC000K11_n689TBM32_LINE_COLOR_DIV = new boolean[] {false} ;
      BC000K11_A519TBM32_LINE_START_POINT_DIV = new String[] {""} ;
      BC000K11_n519TBM32_LINE_START_POINT_DIV = new boolean[] {false} ;
      BC000K11_A520TBM32_LINE_END_POINT_DIV = new String[] {""} ;
      BC000K11_n520TBM32_LINE_END_POINT_DIV = new boolean[] {false} ;
      BC000K11_A690TBM32_LINE_ANGLE = new short[1] ;
      BC000K11_n690TBM32_LINE_ANGLE = new boolean[] {false} ;
      BC000K11_A644TBM32_AUTH_LVL_MIN = new byte[1] ;
      BC000K11_n644TBM32_AUTH_LVL_MIN = new boolean[] {false} ;
      BC000K11_A645TBM32_ZORDER = new short[1] ;
      BC000K11_n645TBM32_ZORDER = new boolean[] {false} ;
      BC000K11_A691TBM32_TAB_ORDER = new short[1] ;
      BC000K11_n691TBM32_TAB_ORDER = new boolean[] {false} ;
      BC000K11_A692TBM32_TABSTOP_FLG = new String[] {""} ;
      BC000K11_n692TBM32_TABSTOP_FLG = new boolean[] {false} ;
      BC000K11_A693TBM32_REQUIRED_INPUT_FLG = new String[] {""} ;
      BC000K11_n693TBM32_REQUIRED_INPUT_FLG = new boolean[] {false} ;
      BC000K11_A694TBM32_MIN_VALUE = new String[] {""} ;
      BC000K11_n694TBM32_MIN_VALUE = new boolean[] {false} ;
      BC000K11_A695TBM32_MAX_VALUE = new String[] {""} ;
      BC000K11_n695TBM32_MAX_VALUE = new boolean[] {false} ;
      BC000K11_A406TBM32_CRF_ITEM_NOTE = new String[] {""} ;
      BC000K11_n406TBM32_CRF_ITEM_NOTE = new boolean[] {false} ;
      BC000K11_A774TBM32_REF_CRF_ID = new short[1] ;
      BC000K11_n774TBM32_REF_CRF_ID = new boolean[] {false} ;
      BC000K11_A775TBM32_REF_CRF_ITEM_CD = new String[] {""} ;
      BC000K11_n775TBM32_REF_CRF_ITEM_CD = new boolean[] {false} ;
      BC000K11_A75TBM32_DEL_FLG = new String[] {""} ;
      BC000K11_n75TBM32_DEL_FLG = new boolean[] {false} ;
      BC000K11_A409TBM32_CRT_PROG_NM = new String[] {""} ;
      BC000K11_n409TBM32_CRT_PROG_NM = new boolean[] {false} ;
      BC000K11_A412TBM32_UPD_PROG_NM = new String[] {""} ;
      BC000K11_n412TBM32_UPD_PROG_NM = new boolean[] {false} ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbm32_crf_item_bc__default(),
         new Object[] {
             new Object[] {
            BC000K2_A70TBM32_STUDY_ID, BC000K2_A71TBM32_CRF_ID, BC000K2_A72TBM32_CRF_ITEM_CD, BC000K2_A407TBM32_CRT_DATETIME, BC000K2_n407TBM32_CRT_DATETIME, BC000K2_A408TBM32_CRT_USER_ID, BC000K2_n408TBM32_CRT_USER_ID, BC000K2_A410TBM32_UPD_DATETIME, BC000K2_n410TBM32_UPD_DATETIME, BC000K2_A411TBM32_UPD_USER_ID,
            BC000K2_n411TBM32_UPD_USER_ID, BC000K2_A413TBM32_UPD_CNT, BC000K2_n413TBM32_UPD_CNT, BC000K2_A405TBM32_CRF_ITEM_NM, BC000K2_n405TBM32_CRF_ITEM_NM, BC000K2_A74TBM32_CRF_ITEM_DIV, BC000K2_n74TBM32_CRF_ITEM_DIV, BC000K2_A73TBM32_CRF_ITEM_GRP_CD, BC000K2_n73TBM32_CRF_ITEM_GRP_CD, BC000K2_A507TBM32_CRF_ITEM_GRP_ORDER,
            BC000K2_n507TBM32_CRF_ITEM_GRP_ORDER, BC000K2_A508TBM32_LOCATION_X, BC000K2_n508TBM32_LOCATION_X, BC000K2_A509TBM32_LOCATION_Y, BC000K2_n509TBM32_LOCATION_Y, BC000K2_A510TBM32_LOCATION_X2, BC000K2_n510TBM32_LOCATION_X2, BC000K2_A511TBM32_LOCATION_Y2, BC000K2_n511TBM32_LOCATION_Y2, BC000K2_A512TBM32_TEXT_ALIGN_DIV,
            BC000K2_n512TBM32_TEXT_ALIGN_DIV, BC000K2_A516TBM32_TEXT_MAXROWS, BC000K2_n516TBM32_TEXT_MAXROWS, BC000K2_A517TBM32_TEXT_MAXLENGTH, BC000K2_n517TBM32_TEXT_MAXLENGTH, BC000K2_A518TBM32_DECIMAL_DIGITS, BC000K2_n518TBM32_DECIMAL_DIGITS, BC000K2_A522TBM32_CHK_TRUE_INNER_VALUE, BC000K2_n522TBM32_CHK_TRUE_INNER_VALUE, BC000K2_A523TBM32_CHK_FALSE_INNER_VALUE,
            BC000K2_n523TBM32_CHK_FALSE_INNER_VALUE, BC000K2_A527TBM32_FIXED_VALUE, BC000K2_n527TBM32_FIXED_VALUE, BC000K2_A525TBM32_LIST_CD, BC000K2_n525TBM32_LIST_CD, BC000K2_A526TBM32_IMAGE_CD, BC000K2_n526TBM32_IMAGE_CD, BC000K2_A524TBM32_TEXT, BC000K2_n524TBM32_TEXT, BC000K2_A513TBM32_FONT_SIZE,
            BC000K2_n513TBM32_FONT_SIZE, BC000K2_A514TBM32_FONT_UL_FLG, BC000K2_n514TBM32_FONT_UL_FLG, BC000K2_A515TBM32_FONT_COLOR_DIV, BC000K2_n515TBM32_FONT_COLOR_DIV, BC000K2_A521TBM32_LINE_SIZE_DIV, BC000K2_n521TBM32_LINE_SIZE_DIV, BC000K2_A689TBM32_LINE_COLOR_DIV, BC000K2_n689TBM32_LINE_COLOR_DIV, BC000K2_A519TBM32_LINE_START_POINT_DIV,
            BC000K2_n519TBM32_LINE_START_POINT_DIV, BC000K2_A520TBM32_LINE_END_POINT_DIV, BC000K2_n520TBM32_LINE_END_POINT_DIV, BC000K2_A690TBM32_LINE_ANGLE, BC000K2_n690TBM32_LINE_ANGLE, BC000K2_A644TBM32_AUTH_LVL_MIN, BC000K2_n644TBM32_AUTH_LVL_MIN, BC000K2_A645TBM32_ZORDER, BC000K2_n645TBM32_ZORDER, BC000K2_A691TBM32_TAB_ORDER,
            BC000K2_n691TBM32_TAB_ORDER, BC000K2_A692TBM32_TABSTOP_FLG, BC000K2_n692TBM32_TABSTOP_FLG, BC000K2_A693TBM32_REQUIRED_INPUT_FLG, BC000K2_n693TBM32_REQUIRED_INPUT_FLG, BC000K2_A694TBM32_MIN_VALUE, BC000K2_n694TBM32_MIN_VALUE, BC000K2_A695TBM32_MAX_VALUE, BC000K2_n695TBM32_MAX_VALUE, BC000K2_A406TBM32_CRF_ITEM_NOTE,
            BC000K2_n406TBM32_CRF_ITEM_NOTE, BC000K2_A774TBM32_REF_CRF_ID, BC000K2_n774TBM32_REF_CRF_ID, BC000K2_A775TBM32_REF_CRF_ITEM_CD, BC000K2_n775TBM32_REF_CRF_ITEM_CD, BC000K2_A75TBM32_DEL_FLG, BC000K2_n75TBM32_DEL_FLG, BC000K2_A409TBM32_CRT_PROG_NM, BC000K2_n409TBM32_CRT_PROG_NM, BC000K2_A412TBM32_UPD_PROG_NM,
            BC000K2_n412TBM32_UPD_PROG_NM
            }
            , new Object[] {
            BC000K3_A70TBM32_STUDY_ID, BC000K3_A71TBM32_CRF_ID, BC000K3_A72TBM32_CRF_ITEM_CD, BC000K3_A407TBM32_CRT_DATETIME, BC000K3_n407TBM32_CRT_DATETIME, BC000K3_A408TBM32_CRT_USER_ID, BC000K3_n408TBM32_CRT_USER_ID, BC000K3_A410TBM32_UPD_DATETIME, BC000K3_n410TBM32_UPD_DATETIME, BC000K3_A411TBM32_UPD_USER_ID,
            BC000K3_n411TBM32_UPD_USER_ID, BC000K3_A413TBM32_UPD_CNT, BC000K3_n413TBM32_UPD_CNT, BC000K3_A405TBM32_CRF_ITEM_NM, BC000K3_n405TBM32_CRF_ITEM_NM, BC000K3_A74TBM32_CRF_ITEM_DIV, BC000K3_n74TBM32_CRF_ITEM_DIV, BC000K3_A73TBM32_CRF_ITEM_GRP_CD, BC000K3_n73TBM32_CRF_ITEM_GRP_CD, BC000K3_A507TBM32_CRF_ITEM_GRP_ORDER,
            BC000K3_n507TBM32_CRF_ITEM_GRP_ORDER, BC000K3_A508TBM32_LOCATION_X, BC000K3_n508TBM32_LOCATION_X, BC000K3_A509TBM32_LOCATION_Y, BC000K3_n509TBM32_LOCATION_Y, BC000K3_A510TBM32_LOCATION_X2, BC000K3_n510TBM32_LOCATION_X2, BC000K3_A511TBM32_LOCATION_Y2, BC000K3_n511TBM32_LOCATION_Y2, BC000K3_A512TBM32_TEXT_ALIGN_DIV,
            BC000K3_n512TBM32_TEXT_ALIGN_DIV, BC000K3_A516TBM32_TEXT_MAXROWS, BC000K3_n516TBM32_TEXT_MAXROWS, BC000K3_A517TBM32_TEXT_MAXLENGTH, BC000K3_n517TBM32_TEXT_MAXLENGTH, BC000K3_A518TBM32_DECIMAL_DIGITS, BC000K3_n518TBM32_DECIMAL_DIGITS, BC000K3_A522TBM32_CHK_TRUE_INNER_VALUE, BC000K3_n522TBM32_CHK_TRUE_INNER_VALUE, BC000K3_A523TBM32_CHK_FALSE_INNER_VALUE,
            BC000K3_n523TBM32_CHK_FALSE_INNER_VALUE, BC000K3_A527TBM32_FIXED_VALUE, BC000K3_n527TBM32_FIXED_VALUE, BC000K3_A525TBM32_LIST_CD, BC000K3_n525TBM32_LIST_CD, BC000K3_A526TBM32_IMAGE_CD, BC000K3_n526TBM32_IMAGE_CD, BC000K3_A524TBM32_TEXT, BC000K3_n524TBM32_TEXT, BC000K3_A513TBM32_FONT_SIZE,
            BC000K3_n513TBM32_FONT_SIZE, BC000K3_A514TBM32_FONT_UL_FLG, BC000K3_n514TBM32_FONT_UL_FLG, BC000K3_A515TBM32_FONT_COLOR_DIV, BC000K3_n515TBM32_FONT_COLOR_DIV, BC000K3_A521TBM32_LINE_SIZE_DIV, BC000K3_n521TBM32_LINE_SIZE_DIV, BC000K3_A689TBM32_LINE_COLOR_DIV, BC000K3_n689TBM32_LINE_COLOR_DIV, BC000K3_A519TBM32_LINE_START_POINT_DIV,
            BC000K3_n519TBM32_LINE_START_POINT_DIV, BC000K3_A520TBM32_LINE_END_POINT_DIV, BC000K3_n520TBM32_LINE_END_POINT_DIV, BC000K3_A690TBM32_LINE_ANGLE, BC000K3_n690TBM32_LINE_ANGLE, BC000K3_A644TBM32_AUTH_LVL_MIN, BC000K3_n644TBM32_AUTH_LVL_MIN, BC000K3_A645TBM32_ZORDER, BC000K3_n645TBM32_ZORDER, BC000K3_A691TBM32_TAB_ORDER,
            BC000K3_n691TBM32_TAB_ORDER, BC000K3_A692TBM32_TABSTOP_FLG, BC000K3_n692TBM32_TABSTOP_FLG, BC000K3_A693TBM32_REQUIRED_INPUT_FLG, BC000K3_n693TBM32_REQUIRED_INPUT_FLG, BC000K3_A694TBM32_MIN_VALUE, BC000K3_n694TBM32_MIN_VALUE, BC000K3_A695TBM32_MAX_VALUE, BC000K3_n695TBM32_MAX_VALUE, BC000K3_A406TBM32_CRF_ITEM_NOTE,
            BC000K3_n406TBM32_CRF_ITEM_NOTE, BC000K3_A774TBM32_REF_CRF_ID, BC000K3_n774TBM32_REF_CRF_ID, BC000K3_A775TBM32_REF_CRF_ITEM_CD, BC000K3_n775TBM32_REF_CRF_ITEM_CD, BC000K3_A75TBM32_DEL_FLG, BC000K3_n75TBM32_DEL_FLG, BC000K3_A409TBM32_CRT_PROG_NM, BC000K3_n409TBM32_CRT_PROG_NM, BC000K3_A412TBM32_UPD_PROG_NM,
            BC000K3_n412TBM32_UPD_PROG_NM
            }
            , new Object[] {
            BC000K4_A70TBM32_STUDY_ID, BC000K4_A71TBM32_CRF_ID, BC000K4_A72TBM32_CRF_ITEM_CD, BC000K4_A407TBM32_CRT_DATETIME, BC000K4_n407TBM32_CRT_DATETIME, BC000K4_A408TBM32_CRT_USER_ID, BC000K4_n408TBM32_CRT_USER_ID, BC000K4_A410TBM32_UPD_DATETIME, BC000K4_n410TBM32_UPD_DATETIME, BC000K4_A411TBM32_UPD_USER_ID,
            BC000K4_n411TBM32_UPD_USER_ID, BC000K4_A413TBM32_UPD_CNT, BC000K4_n413TBM32_UPD_CNT, BC000K4_A405TBM32_CRF_ITEM_NM, BC000K4_n405TBM32_CRF_ITEM_NM, BC000K4_A74TBM32_CRF_ITEM_DIV, BC000K4_n74TBM32_CRF_ITEM_DIV, BC000K4_A73TBM32_CRF_ITEM_GRP_CD, BC000K4_n73TBM32_CRF_ITEM_GRP_CD, BC000K4_A507TBM32_CRF_ITEM_GRP_ORDER,
            BC000K4_n507TBM32_CRF_ITEM_GRP_ORDER, BC000K4_A508TBM32_LOCATION_X, BC000K4_n508TBM32_LOCATION_X, BC000K4_A509TBM32_LOCATION_Y, BC000K4_n509TBM32_LOCATION_Y, BC000K4_A510TBM32_LOCATION_X2, BC000K4_n510TBM32_LOCATION_X2, BC000K4_A511TBM32_LOCATION_Y2, BC000K4_n511TBM32_LOCATION_Y2, BC000K4_A512TBM32_TEXT_ALIGN_DIV,
            BC000K4_n512TBM32_TEXT_ALIGN_DIV, BC000K4_A516TBM32_TEXT_MAXROWS, BC000K4_n516TBM32_TEXT_MAXROWS, BC000K4_A517TBM32_TEXT_MAXLENGTH, BC000K4_n517TBM32_TEXT_MAXLENGTH, BC000K4_A518TBM32_DECIMAL_DIGITS, BC000K4_n518TBM32_DECIMAL_DIGITS, BC000K4_A522TBM32_CHK_TRUE_INNER_VALUE, BC000K4_n522TBM32_CHK_TRUE_INNER_VALUE, BC000K4_A523TBM32_CHK_FALSE_INNER_VALUE,
            BC000K4_n523TBM32_CHK_FALSE_INNER_VALUE, BC000K4_A527TBM32_FIXED_VALUE, BC000K4_n527TBM32_FIXED_VALUE, BC000K4_A525TBM32_LIST_CD, BC000K4_n525TBM32_LIST_CD, BC000K4_A526TBM32_IMAGE_CD, BC000K4_n526TBM32_IMAGE_CD, BC000K4_A524TBM32_TEXT, BC000K4_n524TBM32_TEXT, BC000K4_A513TBM32_FONT_SIZE,
            BC000K4_n513TBM32_FONT_SIZE, BC000K4_A514TBM32_FONT_UL_FLG, BC000K4_n514TBM32_FONT_UL_FLG, BC000K4_A515TBM32_FONT_COLOR_DIV, BC000K4_n515TBM32_FONT_COLOR_DIV, BC000K4_A521TBM32_LINE_SIZE_DIV, BC000K4_n521TBM32_LINE_SIZE_DIV, BC000K4_A689TBM32_LINE_COLOR_DIV, BC000K4_n689TBM32_LINE_COLOR_DIV, BC000K4_A519TBM32_LINE_START_POINT_DIV,
            BC000K4_n519TBM32_LINE_START_POINT_DIV, BC000K4_A520TBM32_LINE_END_POINT_DIV, BC000K4_n520TBM32_LINE_END_POINT_DIV, BC000K4_A690TBM32_LINE_ANGLE, BC000K4_n690TBM32_LINE_ANGLE, BC000K4_A644TBM32_AUTH_LVL_MIN, BC000K4_n644TBM32_AUTH_LVL_MIN, BC000K4_A645TBM32_ZORDER, BC000K4_n645TBM32_ZORDER, BC000K4_A691TBM32_TAB_ORDER,
            BC000K4_n691TBM32_TAB_ORDER, BC000K4_A692TBM32_TABSTOP_FLG, BC000K4_n692TBM32_TABSTOP_FLG, BC000K4_A693TBM32_REQUIRED_INPUT_FLG, BC000K4_n693TBM32_REQUIRED_INPUT_FLG, BC000K4_A694TBM32_MIN_VALUE, BC000K4_n694TBM32_MIN_VALUE, BC000K4_A695TBM32_MAX_VALUE, BC000K4_n695TBM32_MAX_VALUE, BC000K4_A406TBM32_CRF_ITEM_NOTE,
            BC000K4_n406TBM32_CRF_ITEM_NOTE, BC000K4_A774TBM32_REF_CRF_ID, BC000K4_n774TBM32_REF_CRF_ID, BC000K4_A775TBM32_REF_CRF_ITEM_CD, BC000K4_n775TBM32_REF_CRF_ITEM_CD, BC000K4_A75TBM32_DEL_FLG, BC000K4_n75TBM32_DEL_FLG, BC000K4_A409TBM32_CRT_PROG_NM, BC000K4_n409TBM32_CRT_PROG_NM, BC000K4_A412TBM32_UPD_PROG_NM,
            BC000K4_n412TBM32_UPD_PROG_NM
            }
            , new Object[] {
            BC000K5_A70TBM32_STUDY_ID, BC000K5_A71TBM32_CRF_ID, BC000K5_A72TBM32_CRF_ITEM_CD
            }
            , new Object[] {
            BC000K6_A70TBM32_STUDY_ID, BC000K6_A71TBM32_CRF_ID, BC000K6_A72TBM32_CRF_ITEM_CD, BC000K6_A407TBM32_CRT_DATETIME, BC000K6_n407TBM32_CRT_DATETIME, BC000K6_A408TBM32_CRT_USER_ID, BC000K6_n408TBM32_CRT_USER_ID, BC000K6_A410TBM32_UPD_DATETIME, BC000K6_n410TBM32_UPD_DATETIME, BC000K6_A411TBM32_UPD_USER_ID,
            BC000K6_n411TBM32_UPD_USER_ID, BC000K6_A413TBM32_UPD_CNT, BC000K6_n413TBM32_UPD_CNT, BC000K6_A405TBM32_CRF_ITEM_NM, BC000K6_n405TBM32_CRF_ITEM_NM, BC000K6_A74TBM32_CRF_ITEM_DIV, BC000K6_n74TBM32_CRF_ITEM_DIV, BC000K6_A73TBM32_CRF_ITEM_GRP_CD, BC000K6_n73TBM32_CRF_ITEM_GRP_CD, BC000K6_A507TBM32_CRF_ITEM_GRP_ORDER,
            BC000K6_n507TBM32_CRF_ITEM_GRP_ORDER, BC000K6_A508TBM32_LOCATION_X, BC000K6_n508TBM32_LOCATION_X, BC000K6_A509TBM32_LOCATION_Y, BC000K6_n509TBM32_LOCATION_Y, BC000K6_A510TBM32_LOCATION_X2, BC000K6_n510TBM32_LOCATION_X2, BC000K6_A511TBM32_LOCATION_Y2, BC000K6_n511TBM32_LOCATION_Y2, BC000K6_A512TBM32_TEXT_ALIGN_DIV,
            BC000K6_n512TBM32_TEXT_ALIGN_DIV, BC000K6_A516TBM32_TEXT_MAXROWS, BC000K6_n516TBM32_TEXT_MAXROWS, BC000K6_A517TBM32_TEXT_MAXLENGTH, BC000K6_n517TBM32_TEXT_MAXLENGTH, BC000K6_A518TBM32_DECIMAL_DIGITS, BC000K6_n518TBM32_DECIMAL_DIGITS, BC000K6_A522TBM32_CHK_TRUE_INNER_VALUE, BC000K6_n522TBM32_CHK_TRUE_INNER_VALUE, BC000K6_A523TBM32_CHK_FALSE_INNER_VALUE,
            BC000K6_n523TBM32_CHK_FALSE_INNER_VALUE, BC000K6_A527TBM32_FIXED_VALUE, BC000K6_n527TBM32_FIXED_VALUE, BC000K6_A525TBM32_LIST_CD, BC000K6_n525TBM32_LIST_CD, BC000K6_A526TBM32_IMAGE_CD, BC000K6_n526TBM32_IMAGE_CD, BC000K6_A524TBM32_TEXT, BC000K6_n524TBM32_TEXT, BC000K6_A513TBM32_FONT_SIZE,
            BC000K6_n513TBM32_FONT_SIZE, BC000K6_A514TBM32_FONT_UL_FLG, BC000K6_n514TBM32_FONT_UL_FLG, BC000K6_A515TBM32_FONT_COLOR_DIV, BC000K6_n515TBM32_FONT_COLOR_DIV, BC000K6_A521TBM32_LINE_SIZE_DIV, BC000K6_n521TBM32_LINE_SIZE_DIV, BC000K6_A689TBM32_LINE_COLOR_DIV, BC000K6_n689TBM32_LINE_COLOR_DIV, BC000K6_A519TBM32_LINE_START_POINT_DIV,
            BC000K6_n519TBM32_LINE_START_POINT_DIV, BC000K6_A520TBM32_LINE_END_POINT_DIV, BC000K6_n520TBM32_LINE_END_POINT_DIV, BC000K6_A690TBM32_LINE_ANGLE, BC000K6_n690TBM32_LINE_ANGLE, BC000K6_A644TBM32_AUTH_LVL_MIN, BC000K6_n644TBM32_AUTH_LVL_MIN, BC000K6_A645TBM32_ZORDER, BC000K6_n645TBM32_ZORDER, BC000K6_A691TBM32_TAB_ORDER,
            BC000K6_n691TBM32_TAB_ORDER, BC000K6_A692TBM32_TABSTOP_FLG, BC000K6_n692TBM32_TABSTOP_FLG, BC000K6_A693TBM32_REQUIRED_INPUT_FLG, BC000K6_n693TBM32_REQUIRED_INPUT_FLG, BC000K6_A694TBM32_MIN_VALUE, BC000K6_n694TBM32_MIN_VALUE, BC000K6_A695TBM32_MAX_VALUE, BC000K6_n695TBM32_MAX_VALUE, BC000K6_A406TBM32_CRF_ITEM_NOTE,
            BC000K6_n406TBM32_CRF_ITEM_NOTE, BC000K6_A774TBM32_REF_CRF_ID, BC000K6_n774TBM32_REF_CRF_ID, BC000K6_A775TBM32_REF_CRF_ITEM_CD, BC000K6_n775TBM32_REF_CRF_ITEM_CD, BC000K6_A75TBM32_DEL_FLG, BC000K6_n75TBM32_DEL_FLG, BC000K6_A409TBM32_CRT_PROG_NM, BC000K6_n409TBM32_CRT_PROG_NM, BC000K6_A412TBM32_UPD_PROG_NM,
            BC000K6_n412TBM32_UPD_PROG_NM
            }
            , new Object[] {
            BC000K7_A70TBM32_STUDY_ID, BC000K7_A71TBM32_CRF_ID, BC000K7_A72TBM32_CRF_ITEM_CD, BC000K7_A407TBM32_CRT_DATETIME, BC000K7_n407TBM32_CRT_DATETIME, BC000K7_A408TBM32_CRT_USER_ID, BC000K7_n408TBM32_CRT_USER_ID, BC000K7_A410TBM32_UPD_DATETIME, BC000K7_n410TBM32_UPD_DATETIME, BC000K7_A411TBM32_UPD_USER_ID,
            BC000K7_n411TBM32_UPD_USER_ID, BC000K7_A413TBM32_UPD_CNT, BC000K7_n413TBM32_UPD_CNT, BC000K7_A405TBM32_CRF_ITEM_NM, BC000K7_n405TBM32_CRF_ITEM_NM, BC000K7_A74TBM32_CRF_ITEM_DIV, BC000K7_n74TBM32_CRF_ITEM_DIV, BC000K7_A73TBM32_CRF_ITEM_GRP_CD, BC000K7_n73TBM32_CRF_ITEM_GRP_CD, BC000K7_A507TBM32_CRF_ITEM_GRP_ORDER,
            BC000K7_n507TBM32_CRF_ITEM_GRP_ORDER, BC000K7_A508TBM32_LOCATION_X, BC000K7_n508TBM32_LOCATION_X, BC000K7_A509TBM32_LOCATION_Y, BC000K7_n509TBM32_LOCATION_Y, BC000K7_A510TBM32_LOCATION_X2, BC000K7_n510TBM32_LOCATION_X2, BC000K7_A511TBM32_LOCATION_Y2, BC000K7_n511TBM32_LOCATION_Y2, BC000K7_A512TBM32_TEXT_ALIGN_DIV,
            BC000K7_n512TBM32_TEXT_ALIGN_DIV, BC000K7_A516TBM32_TEXT_MAXROWS, BC000K7_n516TBM32_TEXT_MAXROWS, BC000K7_A517TBM32_TEXT_MAXLENGTH, BC000K7_n517TBM32_TEXT_MAXLENGTH, BC000K7_A518TBM32_DECIMAL_DIGITS, BC000K7_n518TBM32_DECIMAL_DIGITS, BC000K7_A522TBM32_CHK_TRUE_INNER_VALUE, BC000K7_n522TBM32_CHK_TRUE_INNER_VALUE, BC000K7_A523TBM32_CHK_FALSE_INNER_VALUE,
            BC000K7_n523TBM32_CHK_FALSE_INNER_VALUE, BC000K7_A527TBM32_FIXED_VALUE, BC000K7_n527TBM32_FIXED_VALUE, BC000K7_A525TBM32_LIST_CD, BC000K7_n525TBM32_LIST_CD, BC000K7_A526TBM32_IMAGE_CD, BC000K7_n526TBM32_IMAGE_CD, BC000K7_A524TBM32_TEXT, BC000K7_n524TBM32_TEXT, BC000K7_A513TBM32_FONT_SIZE,
            BC000K7_n513TBM32_FONT_SIZE, BC000K7_A514TBM32_FONT_UL_FLG, BC000K7_n514TBM32_FONT_UL_FLG, BC000K7_A515TBM32_FONT_COLOR_DIV, BC000K7_n515TBM32_FONT_COLOR_DIV, BC000K7_A521TBM32_LINE_SIZE_DIV, BC000K7_n521TBM32_LINE_SIZE_DIV, BC000K7_A689TBM32_LINE_COLOR_DIV, BC000K7_n689TBM32_LINE_COLOR_DIV, BC000K7_A519TBM32_LINE_START_POINT_DIV,
            BC000K7_n519TBM32_LINE_START_POINT_DIV, BC000K7_A520TBM32_LINE_END_POINT_DIV, BC000K7_n520TBM32_LINE_END_POINT_DIV, BC000K7_A690TBM32_LINE_ANGLE, BC000K7_n690TBM32_LINE_ANGLE, BC000K7_A644TBM32_AUTH_LVL_MIN, BC000K7_n644TBM32_AUTH_LVL_MIN, BC000K7_A645TBM32_ZORDER, BC000K7_n645TBM32_ZORDER, BC000K7_A691TBM32_TAB_ORDER,
            BC000K7_n691TBM32_TAB_ORDER, BC000K7_A692TBM32_TABSTOP_FLG, BC000K7_n692TBM32_TABSTOP_FLG, BC000K7_A693TBM32_REQUIRED_INPUT_FLG, BC000K7_n693TBM32_REQUIRED_INPUT_FLG, BC000K7_A694TBM32_MIN_VALUE, BC000K7_n694TBM32_MIN_VALUE, BC000K7_A695TBM32_MAX_VALUE, BC000K7_n695TBM32_MAX_VALUE, BC000K7_A406TBM32_CRF_ITEM_NOTE,
            BC000K7_n406TBM32_CRF_ITEM_NOTE, BC000K7_A774TBM32_REF_CRF_ID, BC000K7_n774TBM32_REF_CRF_ID, BC000K7_A775TBM32_REF_CRF_ITEM_CD, BC000K7_n775TBM32_REF_CRF_ITEM_CD, BC000K7_A75TBM32_DEL_FLG, BC000K7_n75TBM32_DEL_FLG, BC000K7_A409TBM32_CRT_PROG_NM, BC000K7_n409TBM32_CRT_PROG_NM, BC000K7_A412TBM32_UPD_PROG_NM,
            BC000K7_n412TBM32_UPD_PROG_NM
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000K11_A70TBM32_STUDY_ID, BC000K11_A71TBM32_CRF_ID, BC000K11_A72TBM32_CRF_ITEM_CD, BC000K11_A407TBM32_CRT_DATETIME, BC000K11_n407TBM32_CRT_DATETIME, BC000K11_A408TBM32_CRT_USER_ID, BC000K11_n408TBM32_CRT_USER_ID, BC000K11_A410TBM32_UPD_DATETIME, BC000K11_n410TBM32_UPD_DATETIME, BC000K11_A411TBM32_UPD_USER_ID,
            BC000K11_n411TBM32_UPD_USER_ID, BC000K11_A413TBM32_UPD_CNT, BC000K11_n413TBM32_UPD_CNT, BC000K11_A405TBM32_CRF_ITEM_NM, BC000K11_n405TBM32_CRF_ITEM_NM, BC000K11_A74TBM32_CRF_ITEM_DIV, BC000K11_n74TBM32_CRF_ITEM_DIV, BC000K11_A73TBM32_CRF_ITEM_GRP_CD, BC000K11_n73TBM32_CRF_ITEM_GRP_CD, BC000K11_A507TBM32_CRF_ITEM_GRP_ORDER,
            BC000K11_n507TBM32_CRF_ITEM_GRP_ORDER, BC000K11_A508TBM32_LOCATION_X, BC000K11_n508TBM32_LOCATION_X, BC000K11_A509TBM32_LOCATION_Y, BC000K11_n509TBM32_LOCATION_Y, BC000K11_A510TBM32_LOCATION_X2, BC000K11_n510TBM32_LOCATION_X2, BC000K11_A511TBM32_LOCATION_Y2, BC000K11_n511TBM32_LOCATION_Y2, BC000K11_A512TBM32_TEXT_ALIGN_DIV,
            BC000K11_n512TBM32_TEXT_ALIGN_DIV, BC000K11_A516TBM32_TEXT_MAXROWS, BC000K11_n516TBM32_TEXT_MAXROWS, BC000K11_A517TBM32_TEXT_MAXLENGTH, BC000K11_n517TBM32_TEXT_MAXLENGTH, BC000K11_A518TBM32_DECIMAL_DIGITS, BC000K11_n518TBM32_DECIMAL_DIGITS, BC000K11_A522TBM32_CHK_TRUE_INNER_VALUE, BC000K11_n522TBM32_CHK_TRUE_INNER_VALUE, BC000K11_A523TBM32_CHK_FALSE_INNER_VALUE,
            BC000K11_n523TBM32_CHK_FALSE_INNER_VALUE, BC000K11_A527TBM32_FIXED_VALUE, BC000K11_n527TBM32_FIXED_VALUE, BC000K11_A525TBM32_LIST_CD, BC000K11_n525TBM32_LIST_CD, BC000K11_A526TBM32_IMAGE_CD, BC000K11_n526TBM32_IMAGE_CD, BC000K11_A524TBM32_TEXT, BC000K11_n524TBM32_TEXT, BC000K11_A513TBM32_FONT_SIZE,
            BC000K11_n513TBM32_FONT_SIZE, BC000K11_A514TBM32_FONT_UL_FLG, BC000K11_n514TBM32_FONT_UL_FLG, BC000K11_A515TBM32_FONT_COLOR_DIV, BC000K11_n515TBM32_FONT_COLOR_DIV, BC000K11_A521TBM32_LINE_SIZE_DIV, BC000K11_n521TBM32_LINE_SIZE_DIV, BC000K11_A689TBM32_LINE_COLOR_DIV, BC000K11_n689TBM32_LINE_COLOR_DIV, BC000K11_A519TBM32_LINE_START_POINT_DIV,
            BC000K11_n519TBM32_LINE_START_POINT_DIV, BC000K11_A520TBM32_LINE_END_POINT_DIV, BC000K11_n520TBM32_LINE_END_POINT_DIV, BC000K11_A690TBM32_LINE_ANGLE, BC000K11_n690TBM32_LINE_ANGLE, BC000K11_A644TBM32_AUTH_LVL_MIN, BC000K11_n644TBM32_AUTH_LVL_MIN, BC000K11_A645TBM32_ZORDER, BC000K11_n645TBM32_ZORDER, BC000K11_A691TBM32_TAB_ORDER,
            BC000K11_n691TBM32_TAB_ORDER, BC000K11_A692TBM32_TABSTOP_FLG, BC000K11_n692TBM32_TABSTOP_FLG, BC000K11_A693TBM32_REQUIRED_INPUT_FLG, BC000K11_n693TBM32_REQUIRED_INPUT_FLG, BC000K11_A694TBM32_MIN_VALUE, BC000K11_n694TBM32_MIN_VALUE, BC000K11_A695TBM32_MAX_VALUE, BC000K11_n695TBM32_MAX_VALUE, BC000K11_A406TBM32_CRF_ITEM_NOTE,
            BC000K11_n406TBM32_CRF_ITEM_NOTE, BC000K11_A774TBM32_REF_CRF_ID, BC000K11_n774TBM32_REF_CRF_ID, BC000K11_A775TBM32_REF_CRF_ITEM_CD, BC000K11_n775TBM32_REF_CRF_ITEM_CD, BC000K11_A75TBM32_DEL_FLG, BC000K11_n75TBM32_DEL_FLG, BC000K11_A409TBM32_CRT_PROG_NM, BC000K11_n409TBM32_CRT_PROG_NM, BC000K11_A412TBM32_UPD_PROG_NM,
            BC000K11_n412TBM32_UPD_PROG_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBM32_CRF_ITEM_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: e110L2 */
      e110L2 ();
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private byte A516TBM32_TEXT_MAXROWS ;
   private byte A518TBM32_DECIMAL_DIGITS ;
   private byte A513TBM32_FONT_SIZE ;
   private byte A521TBM32_LINE_SIZE_DIV ;
   private byte A644TBM32_AUTH_LVL_MIN ;
   private byte Z516TBM32_TEXT_MAXROWS ;
   private byte Z518TBM32_DECIMAL_DIGITS ;
   private byte Z513TBM32_FONT_SIZE ;
   private byte Z521TBM32_LINE_SIZE_DIV ;
   private byte Z644TBM32_AUTH_LVL_MIN ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short Z71TBM32_CRF_ID ;
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
   private short Z507TBM32_CRF_ITEM_GRP_ORDER ;
   private short Z508TBM32_LOCATION_X ;
   private short Z509TBM32_LOCATION_Y ;
   private short Z510TBM32_LOCATION_X2 ;
   private short Z511TBM32_LOCATION_Y2 ;
   private short Z517TBM32_TEXT_MAXLENGTH ;
   private short Z690TBM32_LINE_ANGLE ;
   private short Z645TBM32_ZORDER ;
   private short Z691TBM32_TAB_ORDER ;
   private short Z774TBM32_REF_CRF_ID ;
   private short RcdFound19 ;
   private short Gx_err ;
   private int trnEnded ;
   private int GX_JID ;
   private int GXActiveErrHndl ;
   private long Z70TBM32_STUDY_ID ;
   private long A70TBM32_STUDY_ID ;
   private long A515TBM32_FONT_COLOR_DIV ;
   private long A689TBM32_LINE_COLOR_DIV ;
   private long A413TBM32_UPD_CNT ;
   private long Z413TBM32_UPD_CNT ;
   private long Z515TBM32_FONT_COLOR_DIV ;
   private long Z689TBM32_LINE_COLOR_DIV ;
   private long O413TBM32_UPD_CNT ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String AV9Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String sMode19 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Gx_emsg ;
   private java.util.Date A407TBM32_CRT_DATETIME ;
   private java.util.Date A410TBM32_UPD_DATETIME ;
   private java.util.Date Z407TBM32_CRT_DATETIME ;
   private java.util.Date Z410TBM32_UPD_DATETIME ;
   private boolean n407TBM32_CRT_DATETIME ;
   private boolean n408TBM32_CRT_USER_ID ;
   private boolean n410TBM32_UPD_DATETIME ;
   private boolean n411TBM32_UPD_USER_ID ;
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
   private boolean n409TBM32_CRT_PROG_NM ;
   private boolean n412TBM32_UPD_PROG_NM ;
   private boolean Gx_longc ;
   private String Z72TBM32_CRF_ITEM_CD ;
   private String A72TBM32_CRF_ITEM_CD ;
   private String AV8W_BC_FLG ;
   private String AV7W_TXT ;
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
   private String A408TBM32_CRT_USER_ID ;
   private String A409TBM32_CRT_PROG_NM ;
   private String A411TBM32_UPD_USER_ID ;
   private String A412TBM32_UPD_PROG_NM ;
   private String Z408TBM32_CRT_USER_ID ;
   private String Z411TBM32_UPD_USER_ID ;
   private String Z405TBM32_CRF_ITEM_NM ;
   private String Z74TBM32_CRF_ITEM_DIV ;
   private String Z73TBM32_CRF_ITEM_GRP_CD ;
   private String Z512TBM32_TEXT_ALIGN_DIV ;
   private String Z522TBM32_CHK_TRUE_INNER_VALUE ;
   private String Z523TBM32_CHK_FALSE_INNER_VALUE ;
   private String Z527TBM32_FIXED_VALUE ;
   private String Z525TBM32_LIST_CD ;
   private String Z526TBM32_IMAGE_CD ;
   private String Z524TBM32_TEXT ;
   private String Z514TBM32_FONT_UL_FLG ;
   private String Z519TBM32_LINE_START_POINT_DIV ;
   private String Z520TBM32_LINE_END_POINT_DIV ;
   private String Z692TBM32_TABSTOP_FLG ;
   private String Z693TBM32_REQUIRED_INPUT_FLG ;
   private String Z694TBM32_MIN_VALUE ;
   private String Z695TBM32_MAX_VALUE ;
   private String Z406TBM32_CRF_ITEM_NOTE ;
   private String Z775TBM32_REF_CRF_ITEM_CD ;
   private String Z75TBM32_DEL_FLG ;
   private String Z409TBM32_CRT_PROG_NM ;
   private String Z412TBM32_UPD_PROG_NM ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTBM32_CRF_ITEM bcTBM32_CRF_ITEM ;
   private IDataStoreProvider pr_default ;
   private long[] BC000K4_A70TBM32_STUDY_ID ;
   private short[] BC000K4_A71TBM32_CRF_ID ;
   private String[] BC000K4_A72TBM32_CRF_ITEM_CD ;
   private java.util.Date[] BC000K4_A407TBM32_CRT_DATETIME ;
   private boolean[] BC000K4_n407TBM32_CRT_DATETIME ;
   private String[] BC000K4_A408TBM32_CRT_USER_ID ;
   private boolean[] BC000K4_n408TBM32_CRT_USER_ID ;
   private java.util.Date[] BC000K4_A410TBM32_UPD_DATETIME ;
   private boolean[] BC000K4_n410TBM32_UPD_DATETIME ;
   private String[] BC000K4_A411TBM32_UPD_USER_ID ;
   private boolean[] BC000K4_n411TBM32_UPD_USER_ID ;
   private long[] BC000K4_A413TBM32_UPD_CNT ;
   private boolean[] BC000K4_n413TBM32_UPD_CNT ;
   private String[] BC000K4_A405TBM32_CRF_ITEM_NM ;
   private boolean[] BC000K4_n405TBM32_CRF_ITEM_NM ;
   private String[] BC000K4_A74TBM32_CRF_ITEM_DIV ;
   private boolean[] BC000K4_n74TBM32_CRF_ITEM_DIV ;
   private String[] BC000K4_A73TBM32_CRF_ITEM_GRP_CD ;
   private boolean[] BC000K4_n73TBM32_CRF_ITEM_GRP_CD ;
   private short[] BC000K4_A507TBM32_CRF_ITEM_GRP_ORDER ;
   private boolean[] BC000K4_n507TBM32_CRF_ITEM_GRP_ORDER ;
   private short[] BC000K4_A508TBM32_LOCATION_X ;
   private boolean[] BC000K4_n508TBM32_LOCATION_X ;
   private short[] BC000K4_A509TBM32_LOCATION_Y ;
   private boolean[] BC000K4_n509TBM32_LOCATION_Y ;
   private short[] BC000K4_A510TBM32_LOCATION_X2 ;
   private boolean[] BC000K4_n510TBM32_LOCATION_X2 ;
   private short[] BC000K4_A511TBM32_LOCATION_Y2 ;
   private boolean[] BC000K4_n511TBM32_LOCATION_Y2 ;
   private String[] BC000K4_A512TBM32_TEXT_ALIGN_DIV ;
   private boolean[] BC000K4_n512TBM32_TEXT_ALIGN_DIV ;
   private byte[] BC000K4_A516TBM32_TEXT_MAXROWS ;
   private boolean[] BC000K4_n516TBM32_TEXT_MAXROWS ;
   private short[] BC000K4_A517TBM32_TEXT_MAXLENGTH ;
   private boolean[] BC000K4_n517TBM32_TEXT_MAXLENGTH ;
   private byte[] BC000K4_A518TBM32_DECIMAL_DIGITS ;
   private boolean[] BC000K4_n518TBM32_DECIMAL_DIGITS ;
   private String[] BC000K4_A522TBM32_CHK_TRUE_INNER_VALUE ;
   private boolean[] BC000K4_n522TBM32_CHK_TRUE_INNER_VALUE ;
   private String[] BC000K4_A523TBM32_CHK_FALSE_INNER_VALUE ;
   private boolean[] BC000K4_n523TBM32_CHK_FALSE_INNER_VALUE ;
   private String[] BC000K4_A527TBM32_FIXED_VALUE ;
   private boolean[] BC000K4_n527TBM32_FIXED_VALUE ;
   private String[] BC000K4_A525TBM32_LIST_CD ;
   private boolean[] BC000K4_n525TBM32_LIST_CD ;
   private String[] BC000K4_A526TBM32_IMAGE_CD ;
   private boolean[] BC000K4_n526TBM32_IMAGE_CD ;
   private String[] BC000K4_A524TBM32_TEXT ;
   private boolean[] BC000K4_n524TBM32_TEXT ;
   private byte[] BC000K4_A513TBM32_FONT_SIZE ;
   private boolean[] BC000K4_n513TBM32_FONT_SIZE ;
   private String[] BC000K4_A514TBM32_FONT_UL_FLG ;
   private boolean[] BC000K4_n514TBM32_FONT_UL_FLG ;
   private long[] BC000K4_A515TBM32_FONT_COLOR_DIV ;
   private boolean[] BC000K4_n515TBM32_FONT_COLOR_DIV ;
   private byte[] BC000K4_A521TBM32_LINE_SIZE_DIV ;
   private boolean[] BC000K4_n521TBM32_LINE_SIZE_DIV ;
   private long[] BC000K4_A689TBM32_LINE_COLOR_DIV ;
   private boolean[] BC000K4_n689TBM32_LINE_COLOR_DIV ;
   private String[] BC000K4_A519TBM32_LINE_START_POINT_DIV ;
   private boolean[] BC000K4_n519TBM32_LINE_START_POINT_DIV ;
   private String[] BC000K4_A520TBM32_LINE_END_POINT_DIV ;
   private boolean[] BC000K4_n520TBM32_LINE_END_POINT_DIV ;
   private short[] BC000K4_A690TBM32_LINE_ANGLE ;
   private boolean[] BC000K4_n690TBM32_LINE_ANGLE ;
   private byte[] BC000K4_A644TBM32_AUTH_LVL_MIN ;
   private boolean[] BC000K4_n644TBM32_AUTH_LVL_MIN ;
   private short[] BC000K4_A645TBM32_ZORDER ;
   private boolean[] BC000K4_n645TBM32_ZORDER ;
   private short[] BC000K4_A691TBM32_TAB_ORDER ;
   private boolean[] BC000K4_n691TBM32_TAB_ORDER ;
   private String[] BC000K4_A692TBM32_TABSTOP_FLG ;
   private boolean[] BC000K4_n692TBM32_TABSTOP_FLG ;
   private String[] BC000K4_A693TBM32_REQUIRED_INPUT_FLG ;
   private boolean[] BC000K4_n693TBM32_REQUIRED_INPUT_FLG ;
   private String[] BC000K4_A694TBM32_MIN_VALUE ;
   private boolean[] BC000K4_n694TBM32_MIN_VALUE ;
   private String[] BC000K4_A695TBM32_MAX_VALUE ;
   private boolean[] BC000K4_n695TBM32_MAX_VALUE ;
   private String[] BC000K4_A406TBM32_CRF_ITEM_NOTE ;
   private boolean[] BC000K4_n406TBM32_CRF_ITEM_NOTE ;
   private short[] BC000K4_A774TBM32_REF_CRF_ID ;
   private boolean[] BC000K4_n774TBM32_REF_CRF_ID ;
   private String[] BC000K4_A775TBM32_REF_CRF_ITEM_CD ;
   private boolean[] BC000K4_n775TBM32_REF_CRF_ITEM_CD ;
   private String[] BC000K4_A75TBM32_DEL_FLG ;
   private boolean[] BC000K4_n75TBM32_DEL_FLG ;
   private String[] BC000K4_A409TBM32_CRT_PROG_NM ;
   private boolean[] BC000K4_n409TBM32_CRT_PROG_NM ;
   private String[] BC000K4_A412TBM32_UPD_PROG_NM ;
   private boolean[] BC000K4_n412TBM32_UPD_PROG_NM ;
   private long[] BC000K5_A70TBM32_STUDY_ID ;
   private short[] BC000K5_A71TBM32_CRF_ID ;
   private String[] BC000K5_A72TBM32_CRF_ITEM_CD ;
   private long[] BC000K6_A70TBM32_STUDY_ID ;
   private short[] BC000K6_A71TBM32_CRF_ID ;
   private String[] BC000K6_A72TBM32_CRF_ITEM_CD ;
   private java.util.Date[] BC000K6_A407TBM32_CRT_DATETIME ;
   private boolean[] BC000K6_n407TBM32_CRT_DATETIME ;
   private String[] BC000K6_A408TBM32_CRT_USER_ID ;
   private boolean[] BC000K6_n408TBM32_CRT_USER_ID ;
   private java.util.Date[] BC000K6_A410TBM32_UPD_DATETIME ;
   private boolean[] BC000K6_n410TBM32_UPD_DATETIME ;
   private String[] BC000K6_A411TBM32_UPD_USER_ID ;
   private boolean[] BC000K6_n411TBM32_UPD_USER_ID ;
   private long[] BC000K6_A413TBM32_UPD_CNT ;
   private boolean[] BC000K6_n413TBM32_UPD_CNT ;
   private String[] BC000K6_A405TBM32_CRF_ITEM_NM ;
   private boolean[] BC000K6_n405TBM32_CRF_ITEM_NM ;
   private String[] BC000K6_A74TBM32_CRF_ITEM_DIV ;
   private boolean[] BC000K6_n74TBM32_CRF_ITEM_DIV ;
   private String[] BC000K6_A73TBM32_CRF_ITEM_GRP_CD ;
   private boolean[] BC000K6_n73TBM32_CRF_ITEM_GRP_CD ;
   private short[] BC000K6_A507TBM32_CRF_ITEM_GRP_ORDER ;
   private boolean[] BC000K6_n507TBM32_CRF_ITEM_GRP_ORDER ;
   private short[] BC000K6_A508TBM32_LOCATION_X ;
   private boolean[] BC000K6_n508TBM32_LOCATION_X ;
   private short[] BC000K6_A509TBM32_LOCATION_Y ;
   private boolean[] BC000K6_n509TBM32_LOCATION_Y ;
   private short[] BC000K6_A510TBM32_LOCATION_X2 ;
   private boolean[] BC000K6_n510TBM32_LOCATION_X2 ;
   private short[] BC000K6_A511TBM32_LOCATION_Y2 ;
   private boolean[] BC000K6_n511TBM32_LOCATION_Y2 ;
   private String[] BC000K6_A512TBM32_TEXT_ALIGN_DIV ;
   private boolean[] BC000K6_n512TBM32_TEXT_ALIGN_DIV ;
   private byte[] BC000K6_A516TBM32_TEXT_MAXROWS ;
   private boolean[] BC000K6_n516TBM32_TEXT_MAXROWS ;
   private short[] BC000K6_A517TBM32_TEXT_MAXLENGTH ;
   private boolean[] BC000K6_n517TBM32_TEXT_MAXLENGTH ;
   private byte[] BC000K6_A518TBM32_DECIMAL_DIGITS ;
   private boolean[] BC000K6_n518TBM32_DECIMAL_DIGITS ;
   private String[] BC000K6_A522TBM32_CHK_TRUE_INNER_VALUE ;
   private boolean[] BC000K6_n522TBM32_CHK_TRUE_INNER_VALUE ;
   private String[] BC000K6_A523TBM32_CHK_FALSE_INNER_VALUE ;
   private boolean[] BC000K6_n523TBM32_CHK_FALSE_INNER_VALUE ;
   private String[] BC000K6_A527TBM32_FIXED_VALUE ;
   private boolean[] BC000K6_n527TBM32_FIXED_VALUE ;
   private String[] BC000K6_A525TBM32_LIST_CD ;
   private boolean[] BC000K6_n525TBM32_LIST_CD ;
   private String[] BC000K6_A526TBM32_IMAGE_CD ;
   private boolean[] BC000K6_n526TBM32_IMAGE_CD ;
   private String[] BC000K6_A524TBM32_TEXT ;
   private boolean[] BC000K6_n524TBM32_TEXT ;
   private byte[] BC000K6_A513TBM32_FONT_SIZE ;
   private boolean[] BC000K6_n513TBM32_FONT_SIZE ;
   private String[] BC000K6_A514TBM32_FONT_UL_FLG ;
   private boolean[] BC000K6_n514TBM32_FONT_UL_FLG ;
   private long[] BC000K6_A515TBM32_FONT_COLOR_DIV ;
   private boolean[] BC000K6_n515TBM32_FONT_COLOR_DIV ;
   private byte[] BC000K6_A521TBM32_LINE_SIZE_DIV ;
   private boolean[] BC000K6_n521TBM32_LINE_SIZE_DIV ;
   private long[] BC000K6_A689TBM32_LINE_COLOR_DIV ;
   private boolean[] BC000K6_n689TBM32_LINE_COLOR_DIV ;
   private String[] BC000K6_A519TBM32_LINE_START_POINT_DIV ;
   private boolean[] BC000K6_n519TBM32_LINE_START_POINT_DIV ;
   private String[] BC000K6_A520TBM32_LINE_END_POINT_DIV ;
   private boolean[] BC000K6_n520TBM32_LINE_END_POINT_DIV ;
   private short[] BC000K6_A690TBM32_LINE_ANGLE ;
   private boolean[] BC000K6_n690TBM32_LINE_ANGLE ;
   private byte[] BC000K6_A644TBM32_AUTH_LVL_MIN ;
   private boolean[] BC000K6_n644TBM32_AUTH_LVL_MIN ;
   private short[] BC000K6_A645TBM32_ZORDER ;
   private boolean[] BC000K6_n645TBM32_ZORDER ;
   private short[] BC000K6_A691TBM32_TAB_ORDER ;
   private boolean[] BC000K6_n691TBM32_TAB_ORDER ;
   private String[] BC000K6_A692TBM32_TABSTOP_FLG ;
   private boolean[] BC000K6_n692TBM32_TABSTOP_FLG ;
   private String[] BC000K6_A693TBM32_REQUIRED_INPUT_FLG ;
   private boolean[] BC000K6_n693TBM32_REQUIRED_INPUT_FLG ;
   private String[] BC000K6_A694TBM32_MIN_VALUE ;
   private boolean[] BC000K6_n694TBM32_MIN_VALUE ;
   private String[] BC000K6_A695TBM32_MAX_VALUE ;
   private boolean[] BC000K6_n695TBM32_MAX_VALUE ;
   private String[] BC000K6_A406TBM32_CRF_ITEM_NOTE ;
   private boolean[] BC000K6_n406TBM32_CRF_ITEM_NOTE ;
   private short[] BC000K6_A774TBM32_REF_CRF_ID ;
   private boolean[] BC000K6_n774TBM32_REF_CRF_ID ;
   private String[] BC000K6_A775TBM32_REF_CRF_ITEM_CD ;
   private boolean[] BC000K6_n775TBM32_REF_CRF_ITEM_CD ;
   private String[] BC000K6_A75TBM32_DEL_FLG ;
   private boolean[] BC000K6_n75TBM32_DEL_FLG ;
   private String[] BC000K6_A409TBM32_CRT_PROG_NM ;
   private boolean[] BC000K6_n409TBM32_CRT_PROG_NM ;
   private String[] BC000K6_A412TBM32_UPD_PROG_NM ;
   private boolean[] BC000K6_n412TBM32_UPD_PROG_NM ;
   private long[] BC000K7_A70TBM32_STUDY_ID ;
   private short[] BC000K7_A71TBM32_CRF_ID ;
   private String[] BC000K7_A72TBM32_CRF_ITEM_CD ;
   private java.util.Date[] BC000K7_A407TBM32_CRT_DATETIME ;
   private boolean[] BC000K7_n407TBM32_CRT_DATETIME ;
   private String[] BC000K7_A408TBM32_CRT_USER_ID ;
   private boolean[] BC000K7_n408TBM32_CRT_USER_ID ;
   private java.util.Date[] BC000K7_A410TBM32_UPD_DATETIME ;
   private boolean[] BC000K7_n410TBM32_UPD_DATETIME ;
   private String[] BC000K7_A411TBM32_UPD_USER_ID ;
   private boolean[] BC000K7_n411TBM32_UPD_USER_ID ;
   private long[] BC000K7_A413TBM32_UPD_CNT ;
   private boolean[] BC000K7_n413TBM32_UPD_CNT ;
   private String[] BC000K7_A405TBM32_CRF_ITEM_NM ;
   private boolean[] BC000K7_n405TBM32_CRF_ITEM_NM ;
   private String[] BC000K7_A74TBM32_CRF_ITEM_DIV ;
   private boolean[] BC000K7_n74TBM32_CRF_ITEM_DIV ;
   private String[] BC000K7_A73TBM32_CRF_ITEM_GRP_CD ;
   private boolean[] BC000K7_n73TBM32_CRF_ITEM_GRP_CD ;
   private short[] BC000K7_A507TBM32_CRF_ITEM_GRP_ORDER ;
   private boolean[] BC000K7_n507TBM32_CRF_ITEM_GRP_ORDER ;
   private short[] BC000K7_A508TBM32_LOCATION_X ;
   private boolean[] BC000K7_n508TBM32_LOCATION_X ;
   private short[] BC000K7_A509TBM32_LOCATION_Y ;
   private boolean[] BC000K7_n509TBM32_LOCATION_Y ;
   private short[] BC000K7_A510TBM32_LOCATION_X2 ;
   private boolean[] BC000K7_n510TBM32_LOCATION_X2 ;
   private short[] BC000K7_A511TBM32_LOCATION_Y2 ;
   private boolean[] BC000K7_n511TBM32_LOCATION_Y2 ;
   private String[] BC000K7_A512TBM32_TEXT_ALIGN_DIV ;
   private boolean[] BC000K7_n512TBM32_TEXT_ALIGN_DIV ;
   private byte[] BC000K7_A516TBM32_TEXT_MAXROWS ;
   private boolean[] BC000K7_n516TBM32_TEXT_MAXROWS ;
   private short[] BC000K7_A517TBM32_TEXT_MAXLENGTH ;
   private boolean[] BC000K7_n517TBM32_TEXT_MAXLENGTH ;
   private byte[] BC000K7_A518TBM32_DECIMAL_DIGITS ;
   private boolean[] BC000K7_n518TBM32_DECIMAL_DIGITS ;
   private String[] BC000K7_A522TBM32_CHK_TRUE_INNER_VALUE ;
   private boolean[] BC000K7_n522TBM32_CHK_TRUE_INNER_VALUE ;
   private String[] BC000K7_A523TBM32_CHK_FALSE_INNER_VALUE ;
   private boolean[] BC000K7_n523TBM32_CHK_FALSE_INNER_VALUE ;
   private String[] BC000K7_A527TBM32_FIXED_VALUE ;
   private boolean[] BC000K7_n527TBM32_FIXED_VALUE ;
   private String[] BC000K7_A525TBM32_LIST_CD ;
   private boolean[] BC000K7_n525TBM32_LIST_CD ;
   private String[] BC000K7_A526TBM32_IMAGE_CD ;
   private boolean[] BC000K7_n526TBM32_IMAGE_CD ;
   private String[] BC000K7_A524TBM32_TEXT ;
   private boolean[] BC000K7_n524TBM32_TEXT ;
   private byte[] BC000K7_A513TBM32_FONT_SIZE ;
   private boolean[] BC000K7_n513TBM32_FONT_SIZE ;
   private String[] BC000K7_A514TBM32_FONT_UL_FLG ;
   private boolean[] BC000K7_n514TBM32_FONT_UL_FLG ;
   private long[] BC000K7_A515TBM32_FONT_COLOR_DIV ;
   private boolean[] BC000K7_n515TBM32_FONT_COLOR_DIV ;
   private byte[] BC000K7_A521TBM32_LINE_SIZE_DIV ;
   private boolean[] BC000K7_n521TBM32_LINE_SIZE_DIV ;
   private long[] BC000K7_A689TBM32_LINE_COLOR_DIV ;
   private boolean[] BC000K7_n689TBM32_LINE_COLOR_DIV ;
   private String[] BC000K7_A519TBM32_LINE_START_POINT_DIV ;
   private boolean[] BC000K7_n519TBM32_LINE_START_POINT_DIV ;
   private String[] BC000K7_A520TBM32_LINE_END_POINT_DIV ;
   private boolean[] BC000K7_n520TBM32_LINE_END_POINT_DIV ;
   private short[] BC000K7_A690TBM32_LINE_ANGLE ;
   private boolean[] BC000K7_n690TBM32_LINE_ANGLE ;
   private byte[] BC000K7_A644TBM32_AUTH_LVL_MIN ;
   private boolean[] BC000K7_n644TBM32_AUTH_LVL_MIN ;
   private short[] BC000K7_A645TBM32_ZORDER ;
   private boolean[] BC000K7_n645TBM32_ZORDER ;
   private short[] BC000K7_A691TBM32_TAB_ORDER ;
   private boolean[] BC000K7_n691TBM32_TAB_ORDER ;
   private String[] BC000K7_A692TBM32_TABSTOP_FLG ;
   private boolean[] BC000K7_n692TBM32_TABSTOP_FLG ;
   private String[] BC000K7_A693TBM32_REQUIRED_INPUT_FLG ;
   private boolean[] BC000K7_n693TBM32_REQUIRED_INPUT_FLG ;
   private String[] BC000K7_A694TBM32_MIN_VALUE ;
   private boolean[] BC000K7_n694TBM32_MIN_VALUE ;
   private String[] BC000K7_A695TBM32_MAX_VALUE ;
   private boolean[] BC000K7_n695TBM32_MAX_VALUE ;
   private String[] BC000K7_A406TBM32_CRF_ITEM_NOTE ;
   private boolean[] BC000K7_n406TBM32_CRF_ITEM_NOTE ;
   private short[] BC000K7_A774TBM32_REF_CRF_ID ;
   private boolean[] BC000K7_n774TBM32_REF_CRF_ID ;
   private String[] BC000K7_A775TBM32_REF_CRF_ITEM_CD ;
   private boolean[] BC000K7_n775TBM32_REF_CRF_ITEM_CD ;
   private String[] BC000K7_A75TBM32_DEL_FLG ;
   private boolean[] BC000K7_n75TBM32_DEL_FLG ;
   private String[] BC000K7_A409TBM32_CRT_PROG_NM ;
   private boolean[] BC000K7_n409TBM32_CRT_PROG_NM ;
   private String[] BC000K7_A412TBM32_UPD_PROG_NM ;
   private boolean[] BC000K7_n412TBM32_UPD_PROG_NM ;
   private long[] BC000K11_A70TBM32_STUDY_ID ;
   private short[] BC000K11_A71TBM32_CRF_ID ;
   private String[] BC000K11_A72TBM32_CRF_ITEM_CD ;
   private java.util.Date[] BC000K11_A407TBM32_CRT_DATETIME ;
   private boolean[] BC000K11_n407TBM32_CRT_DATETIME ;
   private String[] BC000K11_A408TBM32_CRT_USER_ID ;
   private boolean[] BC000K11_n408TBM32_CRT_USER_ID ;
   private java.util.Date[] BC000K11_A410TBM32_UPD_DATETIME ;
   private boolean[] BC000K11_n410TBM32_UPD_DATETIME ;
   private String[] BC000K11_A411TBM32_UPD_USER_ID ;
   private boolean[] BC000K11_n411TBM32_UPD_USER_ID ;
   private long[] BC000K11_A413TBM32_UPD_CNT ;
   private boolean[] BC000K11_n413TBM32_UPD_CNT ;
   private String[] BC000K11_A405TBM32_CRF_ITEM_NM ;
   private boolean[] BC000K11_n405TBM32_CRF_ITEM_NM ;
   private String[] BC000K11_A74TBM32_CRF_ITEM_DIV ;
   private boolean[] BC000K11_n74TBM32_CRF_ITEM_DIV ;
   private String[] BC000K11_A73TBM32_CRF_ITEM_GRP_CD ;
   private boolean[] BC000K11_n73TBM32_CRF_ITEM_GRP_CD ;
   private short[] BC000K11_A507TBM32_CRF_ITEM_GRP_ORDER ;
   private boolean[] BC000K11_n507TBM32_CRF_ITEM_GRP_ORDER ;
   private short[] BC000K11_A508TBM32_LOCATION_X ;
   private boolean[] BC000K11_n508TBM32_LOCATION_X ;
   private short[] BC000K11_A509TBM32_LOCATION_Y ;
   private boolean[] BC000K11_n509TBM32_LOCATION_Y ;
   private short[] BC000K11_A510TBM32_LOCATION_X2 ;
   private boolean[] BC000K11_n510TBM32_LOCATION_X2 ;
   private short[] BC000K11_A511TBM32_LOCATION_Y2 ;
   private boolean[] BC000K11_n511TBM32_LOCATION_Y2 ;
   private String[] BC000K11_A512TBM32_TEXT_ALIGN_DIV ;
   private boolean[] BC000K11_n512TBM32_TEXT_ALIGN_DIV ;
   private byte[] BC000K11_A516TBM32_TEXT_MAXROWS ;
   private boolean[] BC000K11_n516TBM32_TEXT_MAXROWS ;
   private short[] BC000K11_A517TBM32_TEXT_MAXLENGTH ;
   private boolean[] BC000K11_n517TBM32_TEXT_MAXLENGTH ;
   private byte[] BC000K11_A518TBM32_DECIMAL_DIGITS ;
   private boolean[] BC000K11_n518TBM32_DECIMAL_DIGITS ;
   private String[] BC000K11_A522TBM32_CHK_TRUE_INNER_VALUE ;
   private boolean[] BC000K11_n522TBM32_CHK_TRUE_INNER_VALUE ;
   private String[] BC000K11_A523TBM32_CHK_FALSE_INNER_VALUE ;
   private boolean[] BC000K11_n523TBM32_CHK_FALSE_INNER_VALUE ;
   private String[] BC000K11_A527TBM32_FIXED_VALUE ;
   private boolean[] BC000K11_n527TBM32_FIXED_VALUE ;
   private String[] BC000K11_A525TBM32_LIST_CD ;
   private boolean[] BC000K11_n525TBM32_LIST_CD ;
   private String[] BC000K11_A526TBM32_IMAGE_CD ;
   private boolean[] BC000K11_n526TBM32_IMAGE_CD ;
   private String[] BC000K11_A524TBM32_TEXT ;
   private boolean[] BC000K11_n524TBM32_TEXT ;
   private byte[] BC000K11_A513TBM32_FONT_SIZE ;
   private boolean[] BC000K11_n513TBM32_FONT_SIZE ;
   private String[] BC000K11_A514TBM32_FONT_UL_FLG ;
   private boolean[] BC000K11_n514TBM32_FONT_UL_FLG ;
   private long[] BC000K11_A515TBM32_FONT_COLOR_DIV ;
   private boolean[] BC000K11_n515TBM32_FONT_COLOR_DIV ;
   private byte[] BC000K11_A521TBM32_LINE_SIZE_DIV ;
   private boolean[] BC000K11_n521TBM32_LINE_SIZE_DIV ;
   private long[] BC000K11_A689TBM32_LINE_COLOR_DIV ;
   private boolean[] BC000K11_n689TBM32_LINE_COLOR_DIV ;
   private String[] BC000K11_A519TBM32_LINE_START_POINT_DIV ;
   private boolean[] BC000K11_n519TBM32_LINE_START_POINT_DIV ;
   private String[] BC000K11_A520TBM32_LINE_END_POINT_DIV ;
   private boolean[] BC000K11_n520TBM32_LINE_END_POINT_DIV ;
   private short[] BC000K11_A690TBM32_LINE_ANGLE ;
   private boolean[] BC000K11_n690TBM32_LINE_ANGLE ;
   private byte[] BC000K11_A644TBM32_AUTH_LVL_MIN ;
   private boolean[] BC000K11_n644TBM32_AUTH_LVL_MIN ;
   private short[] BC000K11_A645TBM32_ZORDER ;
   private boolean[] BC000K11_n645TBM32_ZORDER ;
   private short[] BC000K11_A691TBM32_TAB_ORDER ;
   private boolean[] BC000K11_n691TBM32_TAB_ORDER ;
   private String[] BC000K11_A692TBM32_TABSTOP_FLG ;
   private boolean[] BC000K11_n692TBM32_TABSTOP_FLG ;
   private String[] BC000K11_A693TBM32_REQUIRED_INPUT_FLG ;
   private boolean[] BC000K11_n693TBM32_REQUIRED_INPUT_FLG ;
   private String[] BC000K11_A694TBM32_MIN_VALUE ;
   private boolean[] BC000K11_n694TBM32_MIN_VALUE ;
   private String[] BC000K11_A695TBM32_MAX_VALUE ;
   private boolean[] BC000K11_n695TBM32_MAX_VALUE ;
   private String[] BC000K11_A406TBM32_CRF_ITEM_NOTE ;
   private boolean[] BC000K11_n406TBM32_CRF_ITEM_NOTE ;
   private short[] BC000K11_A774TBM32_REF_CRF_ID ;
   private boolean[] BC000K11_n774TBM32_REF_CRF_ID ;
   private String[] BC000K11_A775TBM32_REF_CRF_ITEM_CD ;
   private boolean[] BC000K11_n775TBM32_REF_CRF_ITEM_CD ;
   private String[] BC000K11_A75TBM32_DEL_FLG ;
   private boolean[] BC000K11_n75TBM32_DEL_FLG ;
   private String[] BC000K11_A409TBM32_CRT_PROG_NM ;
   private boolean[] BC000K11_n409TBM32_CRT_PROG_NM ;
   private String[] BC000K11_A412TBM32_UPD_PROG_NM ;
   private boolean[] BC000K11_n412TBM32_UPD_PROG_NM ;
   private long[] BC000K2_A70TBM32_STUDY_ID ;
   private short[] BC000K2_A71TBM32_CRF_ID ;
   private String[] BC000K2_A72TBM32_CRF_ITEM_CD ;
   private java.util.Date[] BC000K2_A407TBM32_CRT_DATETIME ;
   private String[] BC000K2_A408TBM32_CRT_USER_ID ;
   private java.util.Date[] BC000K2_A410TBM32_UPD_DATETIME ;
   private String[] BC000K2_A411TBM32_UPD_USER_ID ;
   private long[] BC000K2_A413TBM32_UPD_CNT ;
   private String[] BC000K2_A405TBM32_CRF_ITEM_NM ;
   private String[] BC000K2_A74TBM32_CRF_ITEM_DIV ;
   private String[] BC000K2_A73TBM32_CRF_ITEM_GRP_CD ;
   private short[] BC000K2_A507TBM32_CRF_ITEM_GRP_ORDER ;
   private short[] BC000K2_A508TBM32_LOCATION_X ;
   private short[] BC000K2_A509TBM32_LOCATION_Y ;
   private short[] BC000K2_A510TBM32_LOCATION_X2 ;
   private short[] BC000K2_A511TBM32_LOCATION_Y2 ;
   private String[] BC000K2_A512TBM32_TEXT_ALIGN_DIV ;
   private byte[] BC000K2_A516TBM32_TEXT_MAXROWS ;
   private short[] BC000K2_A517TBM32_TEXT_MAXLENGTH ;
   private byte[] BC000K2_A518TBM32_DECIMAL_DIGITS ;
   private String[] BC000K2_A522TBM32_CHK_TRUE_INNER_VALUE ;
   private String[] BC000K2_A523TBM32_CHK_FALSE_INNER_VALUE ;
   private String[] BC000K2_A527TBM32_FIXED_VALUE ;
   private String[] BC000K2_A525TBM32_LIST_CD ;
   private String[] BC000K2_A526TBM32_IMAGE_CD ;
   private String[] BC000K2_A524TBM32_TEXT ;
   private byte[] BC000K2_A513TBM32_FONT_SIZE ;
   private String[] BC000K2_A514TBM32_FONT_UL_FLG ;
   private long[] BC000K2_A515TBM32_FONT_COLOR_DIV ;
   private byte[] BC000K2_A521TBM32_LINE_SIZE_DIV ;
   private long[] BC000K2_A689TBM32_LINE_COLOR_DIV ;
   private String[] BC000K2_A519TBM32_LINE_START_POINT_DIV ;
   private String[] BC000K2_A520TBM32_LINE_END_POINT_DIV ;
   private short[] BC000K2_A690TBM32_LINE_ANGLE ;
   private byte[] BC000K2_A644TBM32_AUTH_LVL_MIN ;
   private short[] BC000K2_A645TBM32_ZORDER ;
   private short[] BC000K2_A691TBM32_TAB_ORDER ;
   private String[] BC000K2_A692TBM32_TABSTOP_FLG ;
   private String[] BC000K2_A693TBM32_REQUIRED_INPUT_FLG ;
   private String[] BC000K2_A694TBM32_MIN_VALUE ;
   private String[] BC000K2_A695TBM32_MAX_VALUE ;
   private String[] BC000K2_A406TBM32_CRF_ITEM_NOTE ;
   private short[] BC000K2_A774TBM32_REF_CRF_ID ;
   private String[] BC000K2_A775TBM32_REF_CRF_ITEM_CD ;
   private String[] BC000K2_A75TBM32_DEL_FLG ;
   private String[] BC000K2_A409TBM32_CRT_PROG_NM ;
   private String[] BC000K2_A412TBM32_UPD_PROG_NM ;
   private long[] BC000K3_A70TBM32_STUDY_ID ;
   private short[] BC000K3_A71TBM32_CRF_ID ;
   private String[] BC000K3_A72TBM32_CRF_ITEM_CD ;
   private java.util.Date[] BC000K3_A407TBM32_CRT_DATETIME ;
   private String[] BC000K3_A408TBM32_CRT_USER_ID ;
   private java.util.Date[] BC000K3_A410TBM32_UPD_DATETIME ;
   private String[] BC000K3_A411TBM32_UPD_USER_ID ;
   private long[] BC000K3_A413TBM32_UPD_CNT ;
   private String[] BC000K3_A405TBM32_CRF_ITEM_NM ;
   private String[] BC000K3_A74TBM32_CRF_ITEM_DIV ;
   private String[] BC000K3_A73TBM32_CRF_ITEM_GRP_CD ;
   private short[] BC000K3_A507TBM32_CRF_ITEM_GRP_ORDER ;
   private short[] BC000K3_A508TBM32_LOCATION_X ;
   private short[] BC000K3_A509TBM32_LOCATION_Y ;
   private short[] BC000K3_A510TBM32_LOCATION_X2 ;
   private short[] BC000K3_A511TBM32_LOCATION_Y2 ;
   private String[] BC000K3_A512TBM32_TEXT_ALIGN_DIV ;
   private byte[] BC000K3_A516TBM32_TEXT_MAXROWS ;
   private short[] BC000K3_A517TBM32_TEXT_MAXLENGTH ;
   private byte[] BC000K3_A518TBM32_DECIMAL_DIGITS ;
   private String[] BC000K3_A522TBM32_CHK_TRUE_INNER_VALUE ;
   private String[] BC000K3_A523TBM32_CHK_FALSE_INNER_VALUE ;
   private String[] BC000K3_A527TBM32_FIXED_VALUE ;
   private String[] BC000K3_A525TBM32_LIST_CD ;
   private String[] BC000K3_A526TBM32_IMAGE_CD ;
   private String[] BC000K3_A524TBM32_TEXT ;
   private byte[] BC000K3_A513TBM32_FONT_SIZE ;
   private String[] BC000K3_A514TBM32_FONT_UL_FLG ;
   private long[] BC000K3_A515TBM32_FONT_COLOR_DIV ;
   private byte[] BC000K3_A521TBM32_LINE_SIZE_DIV ;
   private long[] BC000K3_A689TBM32_LINE_COLOR_DIV ;
   private String[] BC000K3_A519TBM32_LINE_START_POINT_DIV ;
   private String[] BC000K3_A520TBM32_LINE_END_POINT_DIV ;
   private short[] BC000K3_A690TBM32_LINE_ANGLE ;
   private byte[] BC000K3_A644TBM32_AUTH_LVL_MIN ;
   private short[] BC000K3_A645TBM32_ZORDER ;
   private short[] BC000K3_A691TBM32_TAB_ORDER ;
   private String[] BC000K3_A692TBM32_TABSTOP_FLG ;
   private String[] BC000K3_A693TBM32_REQUIRED_INPUT_FLG ;
   private String[] BC000K3_A694TBM32_MIN_VALUE ;
   private String[] BC000K3_A695TBM32_MAX_VALUE ;
   private String[] BC000K3_A406TBM32_CRF_ITEM_NOTE ;
   private short[] BC000K3_A774TBM32_REF_CRF_ID ;
   private String[] BC000K3_A775TBM32_REF_CRF_ITEM_CD ;
   private String[] BC000K3_A75TBM32_DEL_FLG ;
   private String[] BC000K3_A409TBM32_CRT_PROG_NM ;
   private String[] BC000K3_A412TBM32_UPD_PROG_NM ;
   private boolean[] BC000K2_n407TBM32_CRT_DATETIME ;
   private boolean[] BC000K2_n408TBM32_CRT_USER_ID ;
   private boolean[] BC000K2_n410TBM32_UPD_DATETIME ;
   private boolean[] BC000K2_n411TBM32_UPD_USER_ID ;
   private boolean[] BC000K2_n413TBM32_UPD_CNT ;
   private boolean[] BC000K2_n405TBM32_CRF_ITEM_NM ;
   private boolean[] BC000K2_n74TBM32_CRF_ITEM_DIV ;
   private boolean[] BC000K2_n73TBM32_CRF_ITEM_GRP_CD ;
   private boolean[] BC000K2_n507TBM32_CRF_ITEM_GRP_ORDER ;
   private boolean[] BC000K2_n508TBM32_LOCATION_X ;
   private boolean[] BC000K2_n509TBM32_LOCATION_Y ;
   private boolean[] BC000K2_n510TBM32_LOCATION_X2 ;
   private boolean[] BC000K2_n511TBM32_LOCATION_Y2 ;
   private boolean[] BC000K2_n512TBM32_TEXT_ALIGN_DIV ;
   private boolean[] BC000K2_n516TBM32_TEXT_MAXROWS ;
   private boolean[] BC000K2_n517TBM32_TEXT_MAXLENGTH ;
   private boolean[] BC000K2_n518TBM32_DECIMAL_DIGITS ;
   private boolean[] BC000K2_n522TBM32_CHK_TRUE_INNER_VALUE ;
   private boolean[] BC000K2_n523TBM32_CHK_FALSE_INNER_VALUE ;
   private boolean[] BC000K2_n527TBM32_FIXED_VALUE ;
   private boolean[] BC000K2_n525TBM32_LIST_CD ;
   private boolean[] BC000K2_n526TBM32_IMAGE_CD ;
   private boolean[] BC000K2_n524TBM32_TEXT ;
   private boolean[] BC000K2_n513TBM32_FONT_SIZE ;
   private boolean[] BC000K2_n514TBM32_FONT_UL_FLG ;
   private boolean[] BC000K2_n515TBM32_FONT_COLOR_DIV ;
   private boolean[] BC000K2_n521TBM32_LINE_SIZE_DIV ;
   private boolean[] BC000K2_n689TBM32_LINE_COLOR_DIV ;
   private boolean[] BC000K2_n519TBM32_LINE_START_POINT_DIV ;
   private boolean[] BC000K2_n520TBM32_LINE_END_POINT_DIV ;
   private boolean[] BC000K2_n690TBM32_LINE_ANGLE ;
   private boolean[] BC000K2_n644TBM32_AUTH_LVL_MIN ;
   private boolean[] BC000K2_n645TBM32_ZORDER ;
   private boolean[] BC000K2_n691TBM32_TAB_ORDER ;
   private boolean[] BC000K2_n692TBM32_TABSTOP_FLG ;
   private boolean[] BC000K2_n693TBM32_REQUIRED_INPUT_FLG ;
   private boolean[] BC000K2_n694TBM32_MIN_VALUE ;
   private boolean[] BC000K2_n695TBM32_MAX_VALUE ;
   private boolean[] BC000K2_n406TBM32_CRF_ITEM_NOTE ;
   private boolean[] BC000K2_n774TBM32_REF_CRF_ID ;
   private boolean[] BC000K2_n775TBM32_REF_CRF_ITEM_CD ;
   private boolean[] BC000K2_n75TBM32_DEL_FLG ;
   private boolean[] BC000K2_n409TBM32_CRT_PROG_NM ;
   private boolean[] BC000K2_n412TBM32_UPD_PROG_NM ;
   private boolean[] BC000K3_n407TBM32_CRT_DATETIME ;
   private boolean[] BC000K3_n408TBM32_CRT_USER_ID ;
   private boolean[] BC000K3_n410TBM32_UPD_DATETIME ;
   private boolean[] BC000K3_n411TBM32_UPD_USER_ID ;
   private boolean[] BC000K3_n413TBM32_UPD_CNT ;
   private boolean[] BC000K3_n405TBM32_CRF_ITEM_NM ;
   private boolean[] BC000K3_n74TBM32_CRF_ITEM_DIV ;
   private boolean[] BC000K3_n73TBM32_CRF_ITEM_GRP_CD ;
   private boolean[] BC000K3_n507TBM32_CRF_ITEM_GRP_ORDER ;
   private boolean[] BC000K3_n508TBM32_LOCATION_X ;
   private boolean[] BC000K3_n509TBM32_LOCATION_Y ;
   private boolean[] BC000K3_n510TBM32_LOCATION_X2 ;
   private boolean[] BC000K3_n511TBM32_LOCATION_Y2 ;
   private boolean[] BC000K3_n512TBM32_TEXT_ALIGN_DIV ;
   private boolean[] BC000K3_n516TBM32_TEXT_MAXROWS ;
   private boolean[] BC000K3_n517TBM32_TEXT_MAXLENGTH ;
   private boolean[] BC000K3_n518TBM32_DECIMAL_DIGITS ;
   private boolean[] BC000K3_n522TBM32_CHK_TRUE_INNER_VALUE ;
   private boolean[] BC000K3_n523TBM32_CHK_FALSE_INNER_VALUE ;
   private boolean[] BC000K3_n527TBM32_FIXED_VALUE ;
   private boolean[] BC000K3_n525TBM32_LIST_CD ;
   private boolean[] BC000K3_n526TBM32_IMAGE_CD ;
   private boolean[] BC000K3_n524TBM32_TEXT ;
   private boolean[] BC000K3_n513TBM32_FONT_SIZE ;
   private boolean[] BC000K3_n514TBM32_FONT_UL_FLG ;
   private boolean[] BC000K3_n515TBM32_FONT_COLOR_DIV ;
   private boolean[] BC000K3_n521TBM32_LINE_SIZE_DIV ;
   private boolean[] BC000K3_n689TBM32_LINE_COLOR_DIV ;
   private boolean[] BC000K3_n519TBM32_LINE_START_POINT_DIV ;
   private boolean[] BC000K3_n520TBM32_LINE_END_POINT_DIV ;
   private boolean[] BC000K3_n690TBM32_LINE_ANGLE ;
   private boolean[] BC000K3_n644TBM32_AUTH_LVL_MIN ;
   private boolean[] BC000K3_n645TBM32_ZORDER ;
   private boolean[] BC000K3_n691TBM32_TAB_ORDER ;
   private boolean[] BC000K3_n692TBM32_TABSTOP_FLG ;
   private boolean[] BC000K3_n693TBM32_REQUIRED_INPUT_FLG ;
   private boolean[] BC000K3_n694TBM32_MIN_VALUE ;
   private boolean[] BC000K3_n695TBM32_MAX_VALUE ;
   private boolean[] BC000K3_n406TBM32_CRF_ITEM_NOTE ;
   private boolean[] BC000K3_n774TBM32_REF_CRF_ID ;
   private boolean[] BC000K3_n775TBM32_REF_CRF_ITEM_CD ;
   private boolean[] BC000K3_n75TBM32_DEL_FLG ;
   private boolean[] BC000K3_n409TBM32_CRT_PROG_NM ;
   private boolean[] BC000K3_n412TBM32_UPD_PROG_NM ;
}

final  class tbm32_crf_item_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC000K2", "SELECT `TBM32_STUDY_ID`, `TBM32_CRF_ID`, `TBM32_CRF_ITEM_CD`, `TBM32_CRT_DATETIME`, `TBM32_CRT_USER_ID`, `TBM32_UPD_DATETIME`, `TBM32_UPD_USER_ID`, `TBM32_UPD_CNT`, `TBM32_CRF_ITEM_NM`, `TBM32_CRF_ITEM_DIV`, `TBM32_CRF_ITEM_GRP_CD`, `TBM32_CRF_ITEM_GRP_ORDER`, `TBM32_LOCATION_X`, `TBM32_LOCATION_Y`, `TBM32_LOCATION_X2`, `TBM32_LOCATION_Y2`, `TBM32_TEXT_ALIGN_DIV`, `TBM32_TEXT_MAXROWS`, `TBM32_TEXT_MAXLENGTH`, `TBM32_DECIMAL_DIGITS`, `TBM32_CHK_TRUE_INNER_VALUE`, `TBM32_CHK_FALSE_INNER_VALUE`, `TBM32_FIXED_VALUE`, `TBM32_LIST_CD`, `TBM32_IMAGE_CD`, `TBM32_TEXT`, `TBM32_FONT_SIZE`, `TBM32_FONT_UL_FLG`, `TBM32_FONT_COLOR_DIV`, `TBM32_LINE_SIZE_DIV`, `TBM32_LINE_COLOR_DIV`, `TBM32_LINE_START_POINT_DIV`, `TBM32_LINE_END_POINT_DIV`, `TBM32_LINE_ANGLE`, `TBM32_AUTH_LVL_MIN`, `TBM32_ZORDER`, `TBM32_TAB_ORDER`, `TBM32_TABSTOP_FLG`, `TBM32_REQUIRED_INPUT_FLG`, `TBM32_MIN_VALUE`, `TBM32_MAX_VALUE`, `TBM32_CRF_ITEM_NOTE`, `TBM32_REF_CRF_ID`, `TBM32_REF_CRF_ITEM_CD`, `TBM32_DEL_FLG`, `TBM32_CRT_PROG_NM`, `TBM32_UPD_PROG_NM` FROM `TBM32_CRF_ITEM` WHERE `TBM32_STUDY_ID` = ? AND `TBM32_CRF_ID` = ? AND `TBM32_CRF_ITEM_CD` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000K3", "SELECT `TBM32_STUDY_ID`, `TBM32_CRF_ID`, `TBM32_CRF_ITEM_CD`, `TBM32_CRT_DATETIME`, `TBM32_CRT_USER_ID`, `TBM32_UPD_DATETIME`, `TBM32_UPD_USER_ID`, `TBM32_UPD_CNT`, `TBM32_CRF_ITEM_NM`, `TBM32_CRF_ITEM_DIV`, `TBM32_CRF_ITEM_GRP_CD`, `TBM32_CRF_ITEM_GRP_ORDER`, `TBM32_LOCATION_X`, `TBM32_LOCATION_Y`, `TBM32_LOCATION_X2`, `TBM32_LOCATION_Y2`, `TBM32_TEXT_ALIGN_DIV`, `TBM32_TEXT_MAXROWS`, `TBM32_TEXT_MAXLENGTH`, `TBM32_DECIMAL_DIGITS`, `TBM32_CHK_TRUE_INNER_VALUE`, `TBM32_CHK_FALSE_INNER_VALUE`, `TBM32_FIXED_VALUE`, `TBM32_LIST_CD`, `TBM32_IMAGE_CD`, `TBM32_TEXT`, `TBM32_FONT_SIZE`, `TBM32_FONT_UL_FLG`, `TBM32_FONT_COLOR_DIV`, `TBM32_LINE_SIZE_DIV`, `TBM32_LINE_COLOR_DIV`, `TBM32_LINE_START_POINT_DIV`, `TBM32_LINE_END_POINT_DIV`, `TBM32_LINE_ANGLE`, `TBM32_AUTH_LVL_MIN`, `TBM32_ZORDER`, `TBM32_TAB_ORDER`, `TBM32_TABSTOP_FLG`, `TBM32_REQUIRED_INPUT_FLG`, `TBM32_MIN_VALUE`, `TBM32_MAX_VALUE`, `TBM32_CRF_ITEM_NOTE`, `TBM32_REF_CRF_ID`, `TBM32_REF_CRF_ITEM_CD`, `TBM32_DEL_FLG`, `TBM32_CRT_PROG_NM`, `TBM32_UPD_PROG_NM` FROM `TBM32_CRF_ITEM` WHERE `TBM32_STUDY_ID` = ? AND `TBM32_CRF_ID` = ? AND `TBM32_CRF_ITEM_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000K4", "SELECT TM1.`TBM32_STUDY_ID`, TM1.`TBM32_CRF_ID`, TM1.`TBM32_CRF_ITEM_CD`, TM1.`TBM32_CRT_DATETIME`, TM1.`TBM32_CRT_USER_ID`, TM1.`TBM32_UPD_DATETIME`, TM1.`TBM32_UPD_USER_ID`, TM1.`TBM32_UPD_CNT`, TM1.`TBM32_CRF_ITEM_NM`, TM1.`TBM32_CRF_ITEM_DIV`, TM1.`TBM32_CRF_ITEM_GRP_CD`, TM1.`TBM32_CRF_ITEM_GRP_ORDER`, TM1.`TBM32_LOCATION_X`, TM1.`TBM32_LOCATION_Y`, TM1.`TBM32_LOCATION_X2`, TM1.`TBM32_LOCATION_Y2`, TM1.`TBM32_TEXT_ALIGN_DIV`, TM1.`TBM32_TEXT_MAXROWS`, TM1.`TBM32_TEXT_MAXLENGTH`, TM1.`TBM32_DECIMAL_DIGITS`, TM1.`TBM32_CHK_TRUE_INNER_VALUE`, TM1.`TBM32_CHK_FALSE_INNER_VALUE`, TM1.`TBM32_FIXED_VALUE`, TM1.`TBM32_LIST_CD`, TM1.`TBM32_IMAGE_CD`, TM1.`TBM32_TEXT`, TM1.`TBM32_FONT_SIZE`, TM1.`TBM32_FONT_UL_FLG`, TM1.`TBM32_FONT_COLOR_DIV`, TM1.`TBM32_LINE_SIZE_DIV`, TM1.`TBM32_LINE_COLOR_DIV`, TM1.`TBM32_LINE_START_POINT_DIV`, TM1.`TBM32_LINE_END_POINT_DIV`, TM1.`TBM32_LINE_ANGLE`, TM1.`TBM32_AUTH_LVL_MIN`, TM1.`TBM32_ZORDER`, TM1.`TBM32_TAB_ORDER`, TM1.`TBM32_TABSTOP_FLG`, TM1.`TBM32_REQUIRED_INPUT_FLG`, TM1.`TBM32_MIN_VALUE`, TM1.`TBM32_MAX_VALUE`, TM1.`TBM32_CRF_ITEM_NOTE`, TM1.`TBM32_REF_CRF_ID`, TM1.`TBM32_REF_CRF_ITEM_CD`, TM1.`TBM32_DEL_FLG`, TM1.`TBM32_CRT_PROG_NM`, TM1.`TBM32_UPD_PROG_NM` FROM `TBM32_CRF_ITEM` TM1 WHERE TM1.`TBM32_STUDY_ID` = ? and TM1.`TBM32_CRF_ID` = ? and TM1.`TBM32_CRF_ITEM_CD` = ? ORDER BY TM1.`TBM32_STUDY_ID`, TM1.`TBM32_CRF_ID`, TM1.`TBM32_CRF_ITEM_CD` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("BC000K5", "SELECT `TBM32_STUDY_ID`, `TBM32_CRF_ID`, `TBM32_CRF_ITEM_CD` FROM `TBM32_CRF_ITEM` WHERE `TBM32_STUDY_ID` = ? AND `TBM32_CRF_ID` = ? AND `TBM32_CRF_ITEM_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000K6", "SELECT `TBM32_STUDY_ID`, `TBM32_CRF_ID`, `TBM32_CRF_ITEM_CD`, `TBM32_CRT_DATETIME`, `TBM32_CRT_USER_ID`, `TBM32_UPD_DATETIME`, `TBM32_UPD_USER_ID`, `TBM32_UPD_CNT`, `TBM32_CRF_ITEM_NM`, `TBM32_CRF_ITEM_DIV`, `TBM32_CRF_ITEM_GRP_CD`, `TBM32_CRF_ITEM_GRP_ORDER`, `TBM32_LOCATION_X`, `TBM32_LOCATION_Y`, `TBM32_LOCATION_X2`, `TBM32_LOCATION_Y2`, `TBM32_TEXT_ALIGN_DIV`, `TBM32_TEXT_MAXROWS`, `TBM32_TEXT_MAXLENGTH`, `TBM32_DECIMAL_DIGITS`, `TBM32_CHK_TRUE_INNER_VALUE`, `TBM32_CHK_FALSE_INNER_VALUE`, `TBM32_FIXED_VALUE`, `TBM32_LIST_CD`, `TBM32_IMAGE_CD`, `TBM32_TEXT`, `TBM32_FONT_SIZE`, `TBM32_FONT_UL_FLG`, `TBM32_FONT_COLOR_DIV`, `TBM32_LINE_SIZE_DIV`, `TBM32_LINE_COLOR_DIV`, `TBM32_LINE_START_POINT_DIV`, `TBM32_LINE_END_POINT_DIV`, `TBM32_LINE_ANGLE`, `TBM32_AUTH_LVL_MIN`, `TBM32_ZORDER`, `TBM32_TAB_ORDER`, `TBM32_TABSTOP_FLG`, `TBM32_REQUIRED_INPUT_FLG`, `TBM32_MIN_VALUE`, `TBM32_MAX_VALUE`, `TBM32_CRF_ITEM_NOTE`, `TBM32_REF_CRF_ID`, `TBM32_REF_CRF_ITEM_CD`, `TBM32_DEL_FLG`, `TBM32_CRT_PROG_NM`, `TBM32_UPD_PROG_NM` FROM `TBM32_CRF_ITEM` WHERE `TBM32_STUDY_ID` = ? AND `TBM32_CRF_ID` = ? AND `TBM32_CRF_ITEM_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000K7", "SELECT `TBM32_STUDY_ID`, `TBM32_CRF_ID`, `TBM32_CRF_ITEM_CD`, `TBM32_CRT_DATETIME`, `TBM32_CRT_USER_ID`, `TBM32_UPD_DATETIME`, `TBM32_UPD_USER_ID`, `TBM32_UPD_CNT`, `TBM32_CRF_ITEM_NM`, `TBM32_CRF_ITEM_DIV`, `TBM32_CRF_ITEM_GRP_CD`, `TBM32_CRF_ITEM_GRP_ORDER`, `TBM32_LOCATION_X`, `TBM32_LOCATION_Y`, `TBM32_LOCATION_X2`, `TBM32_LOCATION_Y2`, `TBM32_TEXT_ALIGN_DIV`, `TBM32_TEXT_MAXROWS`, `TBM32_TEXT_MAXLENGTH`, `TBM32_DECIMAL_DIGITS`, `TBM32_CHK_TRUE_INNER_VALUE`, `TBM32_CHK_FALSE_INNER_VALUE`, `TBM32_FIXED_VALUE`, `TBM32_LIST_CD`, `TBM32_IMAGE_CD`, `TBM32_TEXT`, `TBM32_FONT_SIZE`, `TBM32_FONT_UL_FLG`, `TBM32_FONT_COLOR_DIV`, `TBM32_LINE_SIZE_DIV`, `TBM32_LINE_COLOR_DIV`, `TBM32_LINE_START_POINT_DIV`, `TBM32_LINE_END_POINT_DIV`, `TBM32_LINE_ANGLE`, `TBM32_AUTH_LVL_MIN`, `TBM32_ZORDER`, `TBM32_TAB_ORDER`, `TBM32_TABSTOP_FLG`, `TBM32_REQUIRED_INPUT_FLG`, `TBM32_MIN_VALUE`, `TBM32_MAX_VALUE`, `TBM32_CRF_ITEM_NOTE`, `TBM32_REF_CRF_ID`, `TBM32_REF_CRF_ITEM_CD`, `TBM32_DEL_FLG`, `TBM32_CRT_PROG_NM`, `TBM32_UPD_PROG_NM` FROM `TBM32_CRF_ITEM` WHERE `TBM32_STUDY_ID` = ? AND `TBM32_CRF_ID` = ? AND `TBM32_CRF_ITEM_CD` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC000K8", "INSERT INTO `TBM32_CRF_ITEM`(`TBM32_STUDY_ID`, `TBM32_CRF_ID`, `TBM32_CRF_ITEM_CD`, `TBM32_CRT_DATETIME`, `TBM32_CRT_USER_ID`, `TBM32_UPD_DATETIME`, `TBM32_UPD_USER_ID`, `TBM32_UPD_CNT`, `TBM32_CRF_ITEM_NM`, `TBM32_CRF_ITEM_DIV`, `TBM32_CRF_ITEM_GRP_CD`, `TBM32_CRF_ITEM_GRP_ORDER`, `TBM32_LOCATION_X`, `TBM32_LOCATION_Y`, `TBM32_LOCATION_X2`, `TBM32_LOCATION_Y2`, `TBM32_TEXT_ALIGN_DIV`, `TBM32_TEXT_MAXROWS`, `TBM32_TEXT_MAXLENGTH`, `TBM32_DECIMAL_DIGITS`, `TBM32_CHK_TRUE_INNER_VALUE`, `TBM32_CHK_FALSE_INNER_VALUE`, `TBM32_FIXED_VALUE`, `TBM32_LIST_CD`, `TBM32_IMAGE_CD`, `TBM32_TEXT`, `TBM32_FONT_SIZE`, `TBM32_FONT_UL_FLG`, `TBM32_FONT_COLOR_DIV`, `TBM32_LINE_SIZE_DIV`, `TBM32_LINE_COLOR_DIV`, `TBM32_LINE_START_POINT_DIV`, `TBM32_LINE_END_POINT_DIV`, `TBM32_LINE_ANGLE`, `TBM32_AUTH_LVL_MIN`, `TBM32_ZORDER`, `TBM32_TAB_ORDER`, `TBM32_TABSTOP_FLG`, `TBM32_REQUIRED_INPUT_FLG`, `TBM32_MIN_VALUE`, `TBM32_MAX_VALUE`, `TBM32_CRF_ITEM_NOTE`, `TBM32_REF_CRF_ID`, `TBM32_REF_CRF_ITEM_CD`, `TBM32_DEL_FLG`, `TBM32_CRT_PROG_NM`, `TBM32_UPD_PROG_NM`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC000K9", "UPDATE `TBM32_CRF_ITEM` SET `TBM32_CRT_DATETIME`=?, `TBM32_CRT_USER_ID`=?, `TBM32_UPD_DATETIME`=?, `TBM32_UPD_USER_ID`=?, `TBM32_UPD_CNT`=?, `TBM32_CRF_ITEM_NM`=?, `TBM32_CRF_ITEM_DIV`=?, `TBM32_CRF_ITEM_GRP_CD`=?, `TBM32_CRF_ITEM_GRP_ORDER`=?, `TBM32_LOCATION_X`=?, `TBM32_LOCATION_Y`=?, `TBM32_LOCATION_X2`=?, `TBM32_LOCATION_Y2`=?, `TBM32_TEXT_ALIGN_DIV`=?, `TBM32_TEXT_MAXROWS`=?, `TBM32_TEXT_MAXLENGTH`=?, `TBM32_DECIMAL_DIGITS`=?, `TBM32_CHK_TRUE_INNER_VALUE`=?, `TBM32_CHK_FALSE_INNER_VALUE`=?, `TBM32_FIXED_VALUE`=?, `TBM32_LIST_CD`=?, `TBM32_IMAGE_CD`=?, `TBM32_TEXT`=?, `TBM32_FONT_SIZE`=?, `TBM32_FONT_UL_FLG`=?, `TBM32_FONT_COLOR_DIV`=?, `TBM32_LINE_SIZE_DIV`=?, `TBM32_LINE_COLOR_DIV`=?, `TBM32_LINE_START_POINT_DIV`=?, `TBM32_LINE_END_POINT_DIV`=?, `TBM32_LINE_ANGLE`=?, `TBM32_AUTH_LVL_MIN`=?, `TBM32_ZORDER`=?, `TBM32_TAB_ORDER`=?, `TBM32_TABSTOP_FLG`=?, `TBM32_REQUIRED_INPUT_FLG`=?, `TBM32_MIN_VALUE`=?, `TBM32_MAX_VALUE`=?, `TBM32_CRF_ITEM_NOTE`=?, `TBM32_REF_CRF_ID`=?, `TBM32_REF_CRF_ITEM_CD`=?, `TBM32_DEL_FLG`=?, `TBM32_CRT_PROG_NM`=?, `TBM32_UPD_PROG_NM`=?  WHERE `TBM32_STUDY_ID` = ? AND `TBM32_CRF_ID` = ? AND `TBM32_CRF_ITEM_CD` = ?", GX_NOMASK)
         ,new UpdateCursor("BC000K10", "DELETE FROM `TBM32_CRF_ITEM`  WHERE `TBM32_STUDY_ID` = ? AND `TBM32_CRF_ID` = ? AND `TBM32_CRF_ITEM_CD` = ?", GX_NOMASK)
         ,new ForEachCursor("BC000K11", "SELECT TM1.`TBM32_STUDY_ID`, TM1.`TBM32_CRF_ID`, TM1.`TBM32_CRF_ITEM_CD`, TM1.`TBM32_CRT_DATETIME`, TM1.`TBM32_CRT_USER_ID`, TM1.`TBM32_UPD_DATETIME`, TM1.`TBM32_UPD_USER_ID`, TM1.`TBM32_UPD_CNT`, TM1.`TBM32_CRF_ITEM_NM`, TM1.`TBM32_CRF_ITEM_DIV`, TM1.`TBM32_CRF_ITEM_GRP_CD`, TM1.`TBM32_CRF_ITEM_GRP_ORDER`, TM1.`TBM32_LOCATION_X`, TM1.`TBM32_LOCATION_Y`, TM1.`TBM32_LOCATION_X2`, TM1.`TBM32_LOCATION_Y2`, TM1.`TBM32_TEXT_ALIGN_DIV`, TM1.`TBM32_TEXT_MAXROWS`, TM1.`TBM32_TEXT_MAXLENGTH`, TM1.`TBM32_DECIMAL_DIGITS`, TM1.`TBM32_CHK_TRUE_INNER_VALUE`, TM1.`TBM32_CHK_FALSE_INNER_VALUE`, TM1.`TBM32_FIXED_VALUE`, TM1.`TBM32_LIST_CD`, TM1.`TBM32_IMAGE_CD`, TM1.`TBM32_TEXT`, TM1.`TBM32_FONT_SIZE`, TM1.`TBM32_FONT_UL_FLG`, TM1.`TBM32_FONT_COLOR_DIV`, TM1.`TBM32_LINE_SIZE_DIV`, TM1.`TBM32_LINE_COLOR_DIV`, TM1.`TBM32_LINE_START_POINT_DIV`, TM1.`TBM32_LINE_END_POINT_DIV`, TM1.`TBM32_LINE_ANGLE`, TM1.`TBM32_AUTH_LVL_MIN`, TM1.`TBM32_ZORDER`, TM1.`TBM32_TAB_ORDER`, TM1.`TBM32_TABSTOP_FLG`, TM1.`TBM32_REQUIRED_INPUT_FLG`, TM1.`TBM32_MIN_VALUE`, TM1.`TBM32_MAX_VALUE`, TM1.`TBM32_CRF_ITEM_NOTE`, TM1.`TBM32_REF_CRF_ID`, TM1.`TBM32_REF_CRF_ITEM_CD`, TM1.`TBM32_DEL_FLG`, TM1.`TBM32_CRT_PROG_NM`, TM1.`TBM32_UPD_PROG_NM` FROM `TBM32_CRF_ITEM` TM1 WHERE TM1.`TBM32_STUDY_ID` = ? and TM1.`TBM32_CRF_ID` = ? and TM1.`TBM32_CRF_ITEM_CD` = ? ORDER BY TM1.`TBM32_STUDY_ID`, TM1.`TBM32_CRF_ID`, TM1.`TBM32_CRF_ITEM_CD` ",true, GX_NOMASK, false, this,100,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((long[]) buf[11])[0] = rslt.getLong(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(13) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(14) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(15) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(16) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((byte[]) buf[31])[0] = rslt.getByte(18) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((short[]) buf[33])[0] = rslt.getShort(19) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((byte[]) buf[35])[0] = rslt.getByte(20) ;
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
               ((String[]) buf[47])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((byte[]) buf[49])[0] = rslt.getByte(27) ;
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getVarchar(28) ;
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((long[]) buf[53])[0] = rslt.getLong(29) ;
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((byte[]) buf[55])[0] = rslt.getByte(30) ;
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((long[]) buf[57])[0] = rslt.getLong(31) ;
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getVarchar(32) ;
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getVarchar(33) ;
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((short[]) buf[63])[0] = rslt.getShort(34) ;
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((byte[]) buf[65])[0] = rslt.getByte(35) ;
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
               ((String[]) buf[77])[0] = rslt.getVarchar(41) ;
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((String[]) buf[79])[0] = rslt.getVarchar(42) ;
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((short[]) buf[81])[0] = rslt.getShort(43) ;
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((String[]) buf[83])[0] = rslt.getVarchar(44) ;
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((String[]) buf[85])[0] = rslt.getVarchar(45) ;
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((String[]) buf[87])[0] = rslt.getVarchar(46) ;
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((String[]) buf[89])[0] = rslt.getVarchar(47) ;
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((long[]) buf[11])[0] = rslt.getLong(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(13) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(14) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(15) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(16) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((byte[]) buf[31])[0] = rslt.getByte(18) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((short[]) buf[33])[0] = rslt.getShort(19) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((byte[]) buf[35])[0] = rslt.getByte(20) ;
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
               ((String[]) buf[47])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((byte[]) buf[49])[0] = rslt.getByte(27) ;
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getVarchar(28) ;
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((long[]) buf[53])[0] = rslt.getLong(29) ;
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((byte[]) buf[55])[0] = rslt.getByte(30) ;
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((long[]) buf[57])[0] = rslt.getLong(31) ;
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getVarchar(32) ;
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getVarchar(33) ;
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((short[]) buf[63])[0] = rslt.getShort(34) ;
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((byte[]) buf[65])[0] = rslt.getByte(35) ;
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
               ((String[]) buf[77])[0] = rslt.getVarchar(41) ;
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((String[]) buf[79])[0] = rslt.getVarchar(42) ;
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((short[]) buf[81])[0] = rslt.getShort(43) ;
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((String[]) buf[83])[0] = rslt.getVarchar(44) ;
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((String[]) buf[85])[0] = rslt.getVarchar(45) ;
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((String[]) buf[87])[0] = rslt.getVarchar(46) ;
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((String[]) buf[89])[0] = rslt.getVarchar(47) ;
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((long[]) buf[11])[0] = rslt.getLong(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(13) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(14) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(15) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(16) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((byte[]) buf[31])[0] = rslt.getByte(18) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((short[]) buf[33])[0] = rslt.getShort(19) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((byte[]) buf[35])[0] = rslt.getByte(20) ;
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
               ((String[]) buf[47])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((byte[]) buf[49])[0] = rslt.getByte(27) ;
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getVarchar(28) ;
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((long[]) buf[53])[0] = rslt.getLong(29) ;
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((byte[]) buf[55])[0] = rslt.getByte(30) ;
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((long[]) buf[57])[0] = rslt.getLong(31) ;
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getVarchar(32) ;
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getVarchar(33) ;
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((short[]) buf[63])[0] = rslt.getShort(34) ;
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((byte[]) buf[65])[0] = rslt.getByte(35) ;
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
               ((String[]) buf[77])[0] = rslt.getVarchar(41) ;
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((String[]) buf[79])[0] = rslt.getVarchar(42) ;
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((short[]) buf[81])[0] = rslt.getShort(43) ;
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((String[]) buf[83])[0] = rslt.getVarchar(44) ;
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((String[]) buf[85])[0] = rslt.getVarchar(45) ;
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((String[]) buf[87])[0] = rslt.getVarchar(46) ;
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((String[]) buf[89])[0] = rslt.getVarchar(47) ;
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((long[]) buf[11])[0] = rslt.getLong(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(13) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(14) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(15) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(16) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((byte[]) buf[31])[0] = rslt.getByte(18) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((short[]) buf[33])[0] = rslt.getShort(19) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((byte[]) buf[35])[0] = rslt.getByte(20) ;
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
               ((String[]) buf[47])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((byte[]) buf[49])[0] = rslt.getByte(27) ;
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getVarchar(28) ;
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((long[]) buf[53])[0] = rslt.getLong(29) ;
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((byte[]) buf[55])[0] = rslt.getByte(30) ;
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((long[]) buf[57])[0] = rslt.getLong(31) ;
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getVarchar(32) ;
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getVarchar(33) ;
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((short[]) buf[63])[0] = rslt.getShort(34) ;
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((byte[]) buf[65])[0] = rslt.getByte(35) ;
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
               ((String[]) buf[77])[0] = rslt.getVarchar(41) ;
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((String[]) buf[79])[0] = rslt.getVarchar(42) ;
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((short[]) buf[81])[0] = rslt.getShort(43) ;
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((String[]) buf[83])[0] = rslt.getVarchar(44) ;
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((String[]) buf[85])[0] = rslt.getVarchar(45) ;
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((String[]) buf[87])[0] = rslt.getVarchar(46) ;
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((String[]) buf[89])[0] = rslt.getVarchar(47) ;
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((long[]) buf[11])[0] = rslt.getLong(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(13) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(14) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(15) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(16) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((byte[]) buf[31])[0] = rslt.getByte(18) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((short[]) buf[33])[0] = rslt.getShort(19) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((byte[]) buf[35])[0] = rslt.getByte(20) ;
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
               ((String[]) buf[47])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((byte[]) buf[49])[0] = rslt.getByte(27) ;
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getVarchar(28) ;
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((long[]) buf[53])[0] = rslt.getLong(29) ;
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((byte[]) buf[55])[0] = rslt.getByte(30) ;
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((long[]) buf[57])[0] = rslt.getLong(31) ;
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getVarchar(32) ;
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getVarchar(33) ;
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((short[]) buf[63])[0] = rslt.getShort(34) ;
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((byte[]) buf[65])[0] = rslt.getByte(35) ;
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
               ((String[]) buf[77])[0] = rslt.getVarchar(41) ;
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((String[]) buf[79])[0] = rslt.getVarchar(42) ;
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((short[]) buf[81])[0] = rslt.getShort(43) ;
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((String[]) buf[83])[0] = rslt.getVarchar(44) ;
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((String[]) buf[85])[0] = rslt.getVarchar(45) ;
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((String[]) buf[87])[0] = rslt.getVarchar(46) ;
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((String[]) buf[89])[0] = rslt.getVarchar(47) ;
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               return;
            case 9 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((long[]) buf[11])[0] = rslt.getLong(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(13) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(14) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(15) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(16) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((byte[]) buf[31])[0] = rslt.getByte(18) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((short[]) buf[33])[0] = rslt.getShort(19) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((byte[]) buf[35])[0] = rslt.getByte(20) ;
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
               ((String[]) buf[47])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((byte[]) buf[49])[0] = rslt.getByte(27) ;
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getVarchar(28) ;
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((long[]) buf[53])[0] = rslt.getLong(29) ;
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((byte[]) buf[55])[0] = rslt.getByte(30) ;
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((long[]) buf[57])[0] = rslt.getLong(31) ;
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getVarchar(32) ;
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getVarchar(33) ;
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((short[]) buf[63])[0] = rslt.getShort(34) ;
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((byte[]) buf[65])[0] = rslt.getByte(35) ;
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
               ((String[]) buf[77])[0] = rslt.getVarchar(41) ;
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((String[]) buf[79])[0] = rslt.getVarchar(42) ;
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((short[]) buf[81])[0] = rslt.getShort(43) ;
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((String[]) buf[83])[0] = rslt.getVarchar(44) ;
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
      switch ( cursor )
      {
            case 0 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 50, false);
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 50, false);
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 50, false);
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 50, false);
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 50, false);
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 50, false);
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 50, false);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[4], false);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[6], 128);
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
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(8, ((Number) parms[12]).longValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[14], 200);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[16], 20);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[18], 50);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[20]).shortValue());
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(13, ((Number) parms[22]).shortValue());
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
                  stmt.setShort(15, ((Number) parms[26]).shortValue());
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[28]).shortValue());
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[30], 6);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(18, ((Number) parms[32]).byteValue());
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(19, ((Number) parms[34]).shortValue());
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(20, ((Number) parms[36]).byteValue());
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[38], 100);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(22, (String)parms[40], 100);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(23, (String)parms[42], 100);
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(24, (String)parms[44], 20);
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(25, (String)parms[46], 50);
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(26, (String)parms[48], 200);
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(27, ((Number) parms[50]).byteValue());
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(28, (String)parms[52], 1);
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(29, ((Number) parms[54]).longValue());
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
                  stmt.setLong(31, ((Number) parms[58]).longValue());
               }
               if ( ((Boolean) parms[59]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(32, (String)parms[60], 2);
               }
               if ( ((Boolean) parms[61]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(33, (String)parms[62], 2);
               }
               if ( ((Boolean) parms[63]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(34, ((Number) parms[64]).shortValue());
               }
               if ( ((Boolean) parms[65]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(35, ((Number) parms[66]).byteValue());
               }
               if ( ((Boolean) parms[67]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(36, ((Number) parms[68]).shortValue());
               }
               if ( ((Boolean) parms[69]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(37, ((Number) parms[70]).shortValue());
               }
               if ( ((Boolean) parms[71]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(38, (String)parms[72], 1);
               }
               if ( ((Boolean) parms[73]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(39, (String)parms[74], 1);
               }
               if ( ((Boolean) parms[75]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(40, (String)parms[76], 10);
               }
               if ( ((Boolean) parms[77]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(41, (String)parms[78], 10);
               }
               if ( ((Boolean) parms[79]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(42, (String)parms[80], 1000);
               }
               if ( ((Boolean) parms[81]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(43, ((Number) parms[82]).shortValue());
               }
               if ( ((Boolean) parms[83]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(44, (String)parms[84], 50);
               }
               if ( ((Boolean) parms[85]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(45, (String)parms[86], 1);
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
                  stmt.setNull( 47 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(47, (String)parms[90], 40);
               }
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(1, (java.util.Date)parms[1], false);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 128);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(3, (java.util.Date)parms[5], false);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[7], 128);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(5, ((Number) parms[9]).longValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[11], 200);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[13], 20);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[15], 50);
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
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[19]).shortValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[21]).shortValue());
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
                  stmt.setShort(13, ((Number) parms[25]).shortValue());
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[27], 6);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(15, ((Number) parms[29]).byteValue());
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[31]).shortValue());
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(17, ((Number) parms[33]).byteValue());
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[35], 100);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[37], 100);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[39], 100);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[41], 20);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(22, (String)parms[43], 50);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(23, (String)parms[45], 200);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(24, ((Number) parms[47]).byteValue());
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(25, (String)parms[49], 1);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(26, ((Number) parms[51]).longValue());
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(27, ((Number) parms[53]).byteValue());
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(28, ((Number) parms[55]).longValue());
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(29, (String)parms[57], 2);
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(30, (String)parms[59], 2);
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(31, ((Number) parms[61]).shortValue());
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(32, ((Number) parms[63]).byteValue());
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(33, ((Number) parms[65]).shortValue());
               }
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(34, ((Number) parms[67]).shortValue());
               }
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(35, (String)parms[69], 1);
               }
               if ( ((Boolean) parms[70]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(36, (String)parms[71], 1);
               }
               if ( ((Boolean) parms[72]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(37, (String)parms[73], 10);
               }
               if ( ((Boolean) parms[74]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(38, (String)parms[75], 10);
               }
               if ( ((Boolean) parms[76]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(39, (String)parms[77], 1000);
               }
               if ( ((Boolean) parms[78]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(40, ((Number) parms[79]).shortValue());
               }
               if ( ((Boolean) parms[80]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(41, (String)parms[81], 50);
               }
               if ( ((Boolean) parms[82]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(42, (String)parms[83], 1);
               }
               if ( ((Boolean) parms[84]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(43, (String)parms[85], 40);
               }
               if ( ((Boolean) parms[86]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(44, (String)parms[87], 40);
               }
               stmt.setLong(45, ((Number) parms[88]).longValue());
               stmt.setShort(46, ((Number) parms[89]).shortValue());
               stmt.setVarchar(47, (String)parms[90], 50, false);
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 50, false);
               return;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 50, false);
               return;
      }
   }

}

