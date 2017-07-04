/*
               File: tbm32_crf_item_bc
        Description: CRF項目マスタ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:54:55.85
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

   public void afterTrn( )
   {
      if ( trnEnded == 1 )
      {
         /* Execute user event: e120K2 */
         e120K2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            Z231TBM32_STUDY_ID = A231TBM32_STUDY_ID ;
            Z232TBM32_CRF_ID = A232TBM32_CRF_ID ;
            Z233TBM32_CRF_ITEM_CD = A233TBM32_CRF_ITEM_CD ;
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

   public void e110K2( )
   {
      /* Start Routine */
      AV8W_BC_FLG = "0" ;
      AV8W_BC_FLG = "1" ;
      if ( GXutil.strcmp(AV8W_BC_FLG, "1") != 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV9Pgmname, "ERR", "禁止機能") ;
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("8")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void e120K2( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV9Pgmname) ;
      AV7W_TXT = "" ;
      AV7W_TXT = AV7W_TXT + "試験ID:" + GXutil.trim( GXutil.str( A231TBM32_STUDY_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A232TBM32_CRF_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A233TBM32_CRF_ITEM_CD + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A234TBM32_CRF_ITEM_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A235TBM32_CRF_ITEM_DIV + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A236TBM32_CRF_ITEM_GRP_CD + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A384TBM32_CRF_ITEM_GRP_ORDER, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A385TBM32_LOCATION_X, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A386TBM32_LOCATION_Y, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A387TBM32_LOCATION_X2, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A388TBM32_LOCATION_Y2, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A389TBM32_TEXT_ALIGN_DIV + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A393TBM32_TEXT_MAXROWS, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A394TBM32_TEXT_MAXLENGTH, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A395TBM32_DECIMAL_DIGITS, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A399TBM32_CHK_TRUE_INNER_VALUE + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A400TBM32_CHK_FALSE_INNER_VALUE + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A404TBM32_FIXED_VALUE + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A402TBM32_LIST_CD + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A403TBM32_IMAGE_CD + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A401TBM32_TEXT + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A390TBM32_FONT_SIZE, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A391TBM32_FONT_UL_FLG + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A392TBM32_FONT_COLOR_DIV, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A398TBM32_LINE_SIZE_DIV, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A603TBM32_LINE_COLOR_DIV, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A396TBM32_LINE_START_POINT_DIV + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A397TBM32_LINE_END_POINT_DIV + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A604TBM32_LINE_ANGLE, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A552TBM32_AUTH_LVL_MIN, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A553TBM32_ZORDER, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A605TBM32_TAB_ORDER, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A606TBM32_TABSTOP_FLG + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A607TBM32_REQUIRED_INPUT_FLG + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A608TBM32_MIN_VALUE + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A609TBM32_MAX_VALUE + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A237TBM32_CRF_ITEM_NOTE + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A746TBM32_REF_CRF_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A747TBM32_REF_CRF_ITEM_CD + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A238TBM32_DEL_FLG + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A239TBM32_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm32_crf_item_bc.this.GXt_char1 = GXv_char2[0] ;
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A240TBM32_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A241TBM32_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A242TBM32_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm32_crf_item_bc.this.GXt_char1 = GXv_char2[0] ;
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A243TBM32_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A244TBM32_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A245TBM32_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = GXutil.strReplace( AV7W_TXT, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "@br@") ;
      new a804_pc03_datalog(remoteHandle, context).execute( AV9Pgmname, Gx_mode, AV7W_TXT) ;
   }

   public void S11100( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV9Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void zm0K19( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         Z239TBM32_CRT_DATETIME = A239TBM32_CRT_DATETIME ;
         Z240TBM32_CRT_USER_ID = A240TBM32_CRT_USER_ID ;
         Z242TBM32_UPD_DATETIME = A242TBM32_UPD_DATETIME ;
         Z243TBM32_UPD_USER_ID = A243TBM32_UPD_USER_ID ;
         Z245TBM32_UPD_CNT = A245TBM32_UPD_CNT ;
         Z234TBM32_CRF_ITEM_NM = A234TBM32_CRF_ITEM_NM ;
         Z235TBM32_CRF_ITEM_DIV = A235TBM32_CRF_ITEM_DIV ;
         Z236TBM32_CRF_ITEM_GRP_CD = A236TBM32_CRF_ITEM_GRP_CD ;
         Z384TBM32_CRF_ITEM_GRP_ORDER = A384TBM32_CRF_ITEM_GRP_ORDER ;
         Z385TBM32_LOCATION_X = A385TBM32_LOCATION_X ;
         Z386TBM32_LOCATION_Y = A386TBM32_LOCATION_Y ;
         Z387TBM32_LOCATION_X2 = A387TBM32_LOCATION_X2 ;
         Z388TBM32_LOCATION_Y2 = A388TBM32_LOCATION_Y2 ;
         Z389TBM32_TEXT_ALIGN_DIV = A389TBM32_TEXT_ALIGN_DIV ;
         Z393TBM32_TEXT_MAXROWS = A393TBM32_TEXT_MAXROWS ;
         Z394TBM32_TEXT_MAXLENGTH = A394TBM32_TEXT_MAXLENGTH ;
         Z395TBM32_DECIMAL_DIGITS = A395TBM32_DECIMAL_DIGITS ;
         Z399TBM32_CHK_TRUE_INNER_VALUE = A399TBM32_CHK_TRUE_INNER_VALUE ;
         Z400TBM32_CHK_FALSE_INNER_VALUE = A400TBM32_CHK_FALSE_INNER_VALUE ;
         Z404TBM32_FIXED_VALUE = A404TBM32_FIXED_VALUE ;
         Z402TBM32_LIST_CD = A402TBM32_LIST_CD ;
         Z403TBM32_IMAGE_CD = A403TBM32_IMAGE_CD ;
         Z401TBM32_TEXT = A401TBM32_TEXT ;
         Z390TBM32_FONT_SIZE = A390TBM32_FONT_SIZE ;
         Z391TBM32_FONT_UL_FLG = A391TBM32_FONT_UL_FLG ;
         Z392TBM32_FONT_COLOR_DIV = A392TBM32_FONT_COLOR_DIV ;
         Z398TBM32_LINE_SIZE_DIV = A398TBM32_LINE_SIZE_DIV ;
         Z603TBM32_LINE_COLOR_DIV = A603TBM32_LINE_COLOR_DIV ;
         Z396TBM32_LINE_START_POINT_DIV = A396TBM32_LINE_START_POINT_DIV ;
         Z397TBM32_LINE_END_POINT_DIV = A397TBM32_LINE_END_POINT_DIV ;
         Z604TBM32_LINE_ANGLE = A604TBM32_LINE_ANGLE ;
         Z552TBM32_AUTH_LVL_MIN = A552TBM32_AUTH_LVL_MIN ;
         Z553TBM32_ZORDER = A553TBM32_ZORDER ;
         Z605TBM32_TAB_ORDER = A605TBM32_TAB_ORDER ;
         Z606TBM32_TABSTOP_FLG = A606TBM32_TABSTOP_FLG ;
         Z607TBM32_REQUIRED_INPUT_FLG = A607TBM32_REQUIRED_INPUT_FLG ;
         Z608TBM32_MIN_VALUE = A608TBM32_MIN_VALUE ;
         Z609TBM32_MAX_VALUE = A609TBM32_MAX_VALUE ;
         Z237TBM32_CRF_ITEM_NOTE = A237TBM32_CRF_ITEM_NOTE ;
         Z746TBM32_REF_CRF_ID = A746TBM32_REF_CRF_ID ;
         Z747TBM32_REF_CRF_ITEM_CD = A747TBM32_REF_CRF_ITEM_CD ;
         Z238TBM32_DEL_FLG = A238TBM32_DEL_FLG ;
         Z241TBM32_CRT_PROG_NM = A241TBM32_CRT_PROG_NM ;
         Z244TBM32_UPD_PROG_NM = A244TBM32_UPD_PROG_NM ;
      }
      if ( GX_JID == -8 )
      {
         Z231TBM32_STUDY_ID = A231TBM32_STUDY_ID ;
         Z232TBM32_CRF_ID = A232TBM32_CRF_ID ;
         Z233TBM32_CRF_ITEM_CD = A233TBM32_CRF_ITEM_CD ;
         Z239TBM32_CRT_DATETIME = A239TBM32_CRT_DATETIME ;
         Z240TBM32_CRT_USER_ID = A240TBM32_CRT_USER_ID ;
         Z242TBM32_UPD_DATETIME = A242TBM32_UPD_DATETIME ;
         Z243TBM32_UPD_USER_ID = A243TBM32_UPD_USER_ID ;
         Z245TBM32_UPD_CNT = A245TBM32_UPD_CNT ;
         Z234TBM32_CRF_ITEM_NM = A234TBM32_CRF_ITEM_NM ;
         Z235TBM32_CRF_ITEM_DIV = A235TBM32_CRF_ITEM_DIV ;
         Z236TBM32_CRF_ITEM_GRP_CD = A236TBM32_CRF_ITEM_GRP_CD ;
         Z384TBM32_CRF_ITEM_GRP_ORDER = A384TBM32_CRF_ITEM_GRP_ORDER ;
         Z385TBM32_LOCATION_X = A385TBM32_LOCATION_X ;
         Z386TBM32_LOCATION_Y = A386TBM32_LOCATION_Y ;
         Z387TBM32_LOCATION_X2 = A387TBM32_LOCATION_X2 ;
         Z388TBM32_LOCATION_Y2 = A388TBM32_LOCATION_Y2 ;
         Z389TBM32_TEXT_ALIGN_DIV = A389TBM32_TEXT_ALIGN_DIV ;
         Z393TBM32_TEXT_MAXROWS = A393TBM32_TEXT_MAXROWS ;
         Z394TBM32_TEXT_MAXLENGTH = A394TBM32_TEXT_MAXLENGTH ;
         Z395TBM32_DECIMAL_DIGITS = A395TBM32_DECIMAL_DIGITS ;
         Z399TBM32_CHK_TRUE_INNER_VALUE = A399TBM32_CHK_TRUE_INNER_VALUE ;
         Z400TBM32_CHK_FALSE_INNER_VALUE = A400TBM32_CHK_FALSE_INNER_VALUE ;
         Z404TBM32_FIXED_VALUE = A404TBM32_FIXED_VALUE ;
         Z402TBM32_LIST_CD = A402TBM32_LIST_CD ;
         Z403TBM32_IMAGE_CD = A403TBM32_IMAGE_CD ;
         Z401TBM32_TEXT = A401TBM32_TEXT ;
         Z390TBM32_FONT_SIZE = A390TBM32_FONT_SIZE ;
         Z391TBM32_FONT_UL_FLG = A391TBM32_FONT_UL_FLG ;
         Z392TBM32_FONT_COLOR_DIV = A392TBM32_FONT_COLOR_DIV ;
         Z398TBM32_LINE_SIZE_DIV = A398TBM32_LINE_SIZE_DIV ;
         Z603TBM32_LINE_COLOR_DIV = A603TBM32_LINE_COLOR_DIV ;
         Z396TBM32_LINE_START_POINT_DIV = A396TBM32_LINE_START_POINT_DIV ;
         Z397TBM32_LINE_END_POINT_DIV = A397TBM32_LINE_END_POINT_DIV ;
         Z604TBM32_LINE_ANGLE = A604TBM32_LINE_ANGLE ;
         Z552TBM32_AUTH_LVL_MIN = A552TBM32_AUTH_LVL_MIN ;
         Z553TBM32_ZORDER = A553TBM32_ZORDER ;
         Z605TBM32_TAB_ORDER = A605TBM32_TAB_ORDER ;
         Z606TBM32_TABSTOP_FLG = A606TBM32_TABSTOP_FLG ;
         Z607TBM32_REQUIRED_INPUT_FLG = A607TBM32_REQUIRED_INPUT_FLG ;
         Z608TBM32_MIN_VALUE = A608TBM32_MIN_VALUE ;
         Z609TBM32_MAX_VALUE = A609TBM32_MAX_VALUE ;
         Z237TBM32_CRF_ITEM_NOTE = A237TBM32_CRF_ITEM_NOTE ;
         Z746TBM32_REF_CRF_ID = A746TBM32_REF_CRF_ID ;
         Z747TBM32_REF_CRF_ITEM_CD = A747TBM32_REF_CRF_ITEM_CD ;
         Z238TBM32_DEL_FLG = A238TBM32_DEL_FLG ;
         Z241TBM32_CRT_PROG_NM = A241TBM32_CRT_PROG_NM ;
         Z244TBM32_UPD_PROG_NM = A244TBM32_UPD_PROG_NM ;
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
      pr_default.execute(2, new Object[] {new Long(A231TBM32_STUDY_ID), new Short(A232TBM32_CRF_ID), A233TBM32_CRF_ITEM_CD});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound19 = (short)(1) ;
         A239TBM32_CRT_DATETIME = BC000K4_A239TBM32_CRT_DATETIME[0] ;
         n239TBM32_CRT_DATETIME = BC000K4_n239TBM32_CRT_DATETIME[0] ;
         A240TBM32_CRT_USER_ID = BC000K4_A240TBM32_CRT_USER_ID[0] ;
         n240TBM32_CRT_USER_ID = BC000K4_n240TBM32_CRT_USER_ID[0] ;
         A242TBM32_UPD_DATETIME = BC000K4_A242TBM32_UPD_DATETIME[0] ;
         n242TBM32_UPD_DATETIME = BC000K4_n242TBM32_UPD_DATETIME[0] ;
         A243TBM32_UPD_USER_ID = BC000K4_A243TBM32_UPD_USER_ID[0] ;
         n243TBM32_UPD_USER_ID = BC000K4_n243TBM32_UPD_USER_ID[0] ;
         A245TBM32_UPD_CNT = BC000K4_A245TBM32_UPD_CNT[0] ;
         n245TBM32_UPD_CNT = BC000K4_n245TBM32_UPD_CNT[0] ;
         A234TBM32_CRF_ITEM_NM = BC000K4_A234TBM32_CRF_ITEM_NM[0] ;
         n234TBM32_CRF_ITEM_NM = BC000K4_n234TBM32_CRF_ITEM_NM[0] ;
         A235TBM32_CRF_ITEM_DIV = BC000K4_A235TBM32_CRF_ITEM_DIV[0] ;
         n235TBM32_CRF_ITEM_DIV = BC000K4_n235TBM32_CRF_ITEM_DIV[0] ;
         A236TBM32_CRF_ITEM_GRP_CD = BC000K4_A236TBM32_CRF_ITEM_GRP_CD[0] ;
         n236TBM32_CRF_ITEM_GRP_CD = BC000K4_n236TBM32_CRF_ITEM_GRP_CD[0] ;
         A384TBM32_CRF_ITEM_GRP_ORDER = BC000K4_A384TBM32_CRF_ITEM_GRP_ORDER[0] ;
         n384TBM32_CRF_ITEM_GRP_ORDER = BC000K4_n384TBM32_CRF_ITEM_GRP_ORDER[0] ;
         A385TBM32_LOCATION_X = BC000K4_A385TBM32_LOCATION_X[0] ;
         n385TBM32_LOCATION_X = BC000K4_n385TBM32_LOCATION_X[0] ;
         A386TBM32_LOCATION_Y = BC000K4_A386TBM32_LOCATION_Y[0] ;
         n386TBM32_LOCATION_Y = BC000K4_n386TBM32_LOCATION_Y[0] ;
         A387TBM32_LOCATION_X2 = BC000K4_A387TBM32_LOCATION_X2[0] ;
         n387TBM32_LOCATION_X2 = BC000K4_n387TBM32_LOCATION_X2[0] ;
         A388TBM32_LOCATION_Y2 = BC000K4_A388TBM32_LOCATION_Y2[0] ;
         n388TBM32_LOCATION_Y2 = BC000K4_n388TBM32_LOCATION_Y2[0] ;
         A389TBM32_TEXT_ALIGN_DIV = BC000K4_A389TBM32_TEXT_ALIGN_DIV[0] ;
         n389TBM32_TEXT_ALIGN_DIV = BC000K4_n389TBM32_TEXT_ALIGN_DIV[0] ;
         A393TBM32_TEXT_MAXROWS = BC000K4_A393TBM32_TEXT_MAXROWS[0] ;
         n393TBM32_TEXT_MAXROWS = BC000K4_n393TBM32_TEXT_MAXROWS[0] ;
         A394TBM32_TEXT_MAXLENGTH = BC000K4_A394TBM32_TEXT_MAXLENGTH[0] ;
         n394TBM32_TEXT_MAXLENGTH = BC000K4_n394TBM32_TEXT_MAXLENGTH[0] ;
         A395TBM32_DECIMAL_DIGITS = BC000K4_A395TBM32_DECIMAL_DIGITS[0] ;
         n395TBM32_DECIMAL_DIGITS = BC000K4_n395TBM32_DECIMAL_DIGITS[0] ;
         A399TBM32_CHK_TRUE_INNER_VALUE = BC000K4_A399TBM32_CHK_TRUE_INNER_VALUE[0] ;
         n399TBM32_CHK_TRUE_INNER_VALUE = BC000K4_n399TBM32_CHK_TRUE_INNER_VALUE[0] ;
         A400TBM32_CHK_FALSE_INNER_VALUE = BC000K4_A400TBM32_CHK_FALSE_INNER_VALUE[0] ;
         n400TBM32_CHK_FALSE_INNER_VALUE = BC000K4_n400TBM32_CHK_FALSE_INNER_VALUE[0] ;
         A404TBM32_FIXED_VALUE = BC000K4_A404TBM32_FIXED_VALUE[0] ;
         n404TBM32_FIXED_VALUE = BC000K4_n404TBM32_FIXED_VALUE[0] ;
         A402TBM32_LIST_CD = BC000K4_A402TBM32_LIST_CD[0] ;
         n402TBM32_LIST_CD = BC000K4_n402TBM32_LIST_CD[0] ;
         A403TBM32_IMAGE_CD = BC000K4_A403TBM32_IMAGE_CD[0] ;
         n403TBM32_IMAGE_CD = BC000K4_n403TBM32_IMAGE_CD[0] ;
         A401TBM32_TEXT = BC000K4_A401TBM32_TEXT[0] ;
         n401TBM32_TEXT = BC000K4_n401TBM32_TEXT[0] ;
         A390TBM32_FONT_SIZE = BC000K4_A390TBM32_FONT_SIZE[0] ;
         n390TBM32_FONT_SIZE = BC000K4_n390TBM32_FONT_SIZE[0] ;
         A391TBM32_FONT_UL_FLG = BC000K4_A391TBM32_FONT_UL_FLG[0] ;
         n391TBM32_FONT_UL_FLG = BC000K4_n391TBM32_FONT_UL_FLG[0] ;
         A392TBM32_FONT_COLOR_DIV = BC000K4_A392TBM32_FONT_COLOR_DIV[0] ;
         n392TBM32_FONT_COLOR_DIV = BC000K4_n392TBM32_FONT_COLOR_DIV[0] ;
         A398TBM32_LINE_SIZE_DIV = BC000K4_A398TBM32_LINE_SIZE_DIV[0] ;
         n398TBM32_LINE_SIZE_DIV = BC000K4_n398TBM32_LINE_SIZE_DIV[0] ;
         A603TBM32_LINE_COLOR_DIV = BC000K4_A603TBM32_LINE_COLOR_DIV[0] ;
         n603TBM32_LINE_COLOR_DIV = BC000K4_n603TBM32_LINE_COLOR_DIV[0] ;
         A396TBM32_LINE_START_POINT_DIV = BC000K4_A396TBM32_LINE_START_POINT_DIV[0] ;
         n396TBM32_LINE_START_POINT_DIV = BC000K4_n396TBM32_LINE_START_POINT_DIV[0] ;
         A397TBM32_LINE_END_POINT_DIV = BC000K4_A397TBM32_LINE_END_POINT_DIV[0] ;
         n397TBM32_LINE_END_POINT_DIV = BC000K4_n397TBM32_LINE_END_POINT_DIV[0] ;
         A604TBM32_LINE_ANGLE = BC000K4_A604TBM32_LINE_ANGLE[0] ;
         n604TBM32_LINE_ANGLE = BC000K4_n604TBM32_LINE_ANGLE[0] ;
         A552TBM32_AUTH_LVL_MIN = BC000K4_A552TBM32_AUTH_LVL_MIN[0] ;
         n552TBM32_AUTH_LVL_MIN = BC000K4_n552TBM32_AUTH_LVL_MIN[0] ;
         A553TBM32_ZORDER = BC000K4_A553TBM32_ZORDER[0] ;
         n553TBM32_ZORDER = BC000K4_n553TBM32_ZORDER[0] ;
         A605TBM32_TAB_ORDER = BC000K4_A605TBM32_TAB_ORDER[0] ;
         n605TBM32_TAB_ORDER = BC000K4_n605TBM32_TAB_ORDER[0] ;
         A606TBM32_TABSTOP_FLG = BC000K4_A606TBM32_TABSTOP_FLG[0] ;
         n606TBM32_TABSTOP_FLG = BC000K4_n606TBM32_TABSTOP_FLG[0] ;
         A607TBM32_REQUIRED_INPUT_FLG = BC000K4_A607TBM32_REQUIRED_INPUT_FLG[0] ;
         n607TBM32_REQUIRED_INPUT_FLG = BC000K4_n607TBM32_REQUIRED_INPUT_FLG[0] ;
         A608TBM32_MIN_VALUE = BC000K4_A608TBM32_MIN_VALUE[0] ;
         n608TBM32_MIN_VALUE = BC000K4_n608TBM32_MIN_VALUE[0] ;
         A609TBM32_MAX_VALUE = BC000K4_A609TBM32_MAX_VALUE[0] ;
         n609TBM32_MAX_VALUE = BC000K4_n609TBM32_MAX_VALUE[0] ;
         A237TBM32_CRF_ITEM_NOTE = BC000K4_A237TBM32_CRF_ITEM_NOTE[0] ;
         n237TBM32_CRF_ITEM_NOTE = BC000K4_n237TBM32_CRF_ITEM_NOTE[0] ;
         A746TBM32_REF_CRF_ID = BC000K4_A746TBM32_REF_CRF_ID[0] ;
         n746TBM32_REF_CRF_ID = BC000K4_n746TBM32_REF_CRF_ID[0] ;
         A747TBM32_REF_CRF_ITEM_CD = BC000K4_A747TBM32_REF_CRF_ITEM_CD[0] ;
         n747TBM32_REF_CRF_ITEM_CD = BC000K4_n747TBM32_REF_CRF_ITEM_CD[0] ;
         A238TBM32_DEL_FLG = BC000K4_A238TBM32_DEL_FLG[0] ;
         n238TBM32_DEL_FLG = BC000K4_n238TBM32_DEL_FLG[0] ;
         A241TBM32_CRT_PROG_NM = BC000K4_A241TBM32_CRT_PROG_NM[0] ;
         n241TBM32_CRT_PROG_NM = BC000K4_n241TBM32_CRT_PROG_NM[0] ;
         A244TBM32_UPD_PROG_NM = BC000K4_A244TBM32_UPD_PROG_NM[0] ;
         n244TBM32_UPD_PROG_NM = BC000K4_n244TBM32_UPD_PROG_NM[0] ;
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
      if ( ! ( GXutil.nullDate().equals(A239TBM32_CRT_DATETIME) || (( A239TBM32_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A239TBM32_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A242TBM32_UPD_DATETIME) || (( A242TBM32_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A242TBM32_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
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
      pr_default.execute(3, new Object[] {new Long(A231TBM32_STUDY_ID), new Short(A232TBM32_CRF_ID), A233TBM32_CRF_ITEM_CD});
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
      /* Using cursor BC000K3 */
      pr_default.execute(1, new Object[] {new Long(A231TBM32_STUDY_ID), new Short(A232TBM32_CRF_ID), A233TBM32_CRF_ITEM_CD});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0K19( 8) ;
         RcdFound19 = (short)(1) ;
         A231TBM32_STUDY_ID = BC000K3_A231TBM32_STUDY_ID[0] ;
         A232TBM32_CRF_ID = BC000K3_A232TBM32_CRF_ID[0] ;
         A233TBM32_CRF_ITEM_CD = BC000K3_A233TBM32_CRF_ITEM_CD[0] ;
         A239TBM32_CRT_DATETIME = BC000K3_A239TBM32_CRT_DATETIME[0] ;
         n239TBM32_CRT_DATETIME = BC000K3_n239TBM32_CRT_DATETIME[0] ;
         A240TBM32_CRT_USER_ID = BC000K3_A240TBM32_CRT_USER_ID[0] ;
         n240TBM32_CRT_USER_ID = BC000K3_n240TBM32_CRT_USER_ID[0] ;
         A242TBM32_UPD_DATETIME = BC000K3_A242TBM32_UPD_DATETIME[0] ;
         n242TBM32_UPD_DATETIME = BC000K3_n242TBM32_UPD_DATETIME[0] ;
         A243TBM32_UPD_USER_ID = BC000K3_A243TBM32_UPD_USER_ID[0] ;
         n243TBM32_UPD_USER_ID = BC000K3_n243TBM32_UPD_USER_ID[0] ;
         A245TBM32_UPD_CNT = BC000K3_A245TBM32_UPD_CNT[0] ;
         n245TBM32_UPD_CNT = BC000K3_n245TBM32_UPD_CNT[0] ;
         A234TBM32_CRF_ITEM_NM = BC000K3_A234TBM32_CRF_ITEM_NM[0] ;
         n234TBM32_CRF_ITEM_NM = BC000K3_n234TBM32_CRF_ITEM_NM[0] ;
         A235TBM32_CRF_ITEM_DIV = BC000K3_A235TBM32_CRF_ITEM_DIV[0] ;
         n235TBM32_CRF_ITEM_DIV = BC000K3_n235TBM32_CRF_ITEM_DIV[0] ;
         A236TBM32_CRF_ITEM_GRP_CD = BC000K3_A236TBM32_CRF_ITEM_GRP_CD[0] ;
         n236TBM32_CRF_ITEM_GRP_CD = BC000K3_n236TBM32_CRF_ITEM_GRP_CD[0] ;
         A384TBM32_CRF_ITEM_GRP_ORDER = BC000K3_A384TBM32_CRF_ITEM_GRP_ORDER[0] ;
         n384TBM32_CRF_ITEM_GRP_ORDER = BC000K3_n384TBM32_CRF_ITEM_GRP_ORDER[0] ;
         A385TBM32_LOCATION_X = BC000K3_A385TBM32_LOCATION_X[0] ;
         n385TBM32_LOCATION_X = BC000K3_n385TBM32_LOCATION_X[0] ;
         A386TBM32_LOCATION_Y = BC000K3_A386TBM32_LOCATION_Y[0] ;
         n386TBM32_LOCATION_Y = BC000K3_n386TBM32_LOCATION_Y[0] ;
         A387TBM32_LOCATION_X2 = BC000K3_A387TBM32_LOCATION_X2[0] ;
         n387TBM32_LOCATION_X2 = BC000K3_n387TBM32_LOCATION_X2[0] ;
         A388TBM32_LOCATION_Y2 = BC000K3_A388TBM32_LOCATION_Y2[0] ;
         n388TBM32_LOCATION_Y2 = BC000K3_n388TBM32_LOCATION_Y2[0] ;
         A389TBM32_TEXT_ALIGN_DIV = BC000K3_A389TBM32_TEXT_ALIGN_DIV[0] ;
         n389TBM32_TEXT_ALIGN_DIV = BC000K3_n389TBM32_TEXT_ALIGN_DIV[0] ;
         A393TBM32_TEXT_MAXROWS = BC000K3_A393TBM32_TEXT_MAXROWS[0] ;
         n393TBM32_TEXT_MAXROWS = BC000K3_n393TBM32_TEXT_MAXROWS[0] ;
         A394TBM32_TEXT_MAXLENGTH = BC000K3_A394TBM32_TEXT_MAXLENGTH[0] ;
         n394TBM32_TEXT_MAXLENGTH = BC000K3_n394TBM32_TEXT_MAXLENGTH[0] ;
         A395TBM32_DECIMAL_DIGITS = BC000K3_A395TBM32_DECIMAL_DIGITS[0] ;
         n395TBM32_DECIMAL_DIGITS = BC000K3_n395TBM32_DECIMAL_DIGITS[0] ;
         A399TBM32_CHK_TRUE_INNER_VALUE = BC000K3_A399TBM32_CHK_TRUE_INNER_VALUE[0] ;
         n399TBM32_CHK_TRUE_INNER_VALUE = BC000K3_n399TBM32_CHK_TRUE_INNER_VALUE[0] ;
         A400TBM32_CHK_FALSE_INNER_VALUE = BC000K3_A400TBM32_CHK_FALSE_INNER_VALUE[0] ;
         n400TBM32_CHK_FALSE_INNER_VALUE = BC000K3_n400TBM32_CHK_FALSE_INNER_VALUE[0] ;
         A404TBM32_FIXED_VALUE = BC000K3_A404TBM32_FIXED_VALUE[0] ;
         n404TBM32_FIXED_VALUE = BC000K3_n404TBM32_FIXED_VALUE[0] ;
         A402TBM32_LIST_CD = BC000K3_A402TBM32_LIST_CD[0] ;
         n402TBM32_LIST_CD = BC000K3_n402TBM32_LIST_CD[0] ;
         A403TBM32_IMAGE_CD = BC000K3_A403TBM32_IMAGE_CD[0] ;
         n403TBM32_IMAGE_CD = BC000K3_n403TBM32_IMAGE_CD[0] ;
         A401TBM32_TEXT = BC000K3_A401TBM32_TEXT[0] ;
         n401TBM32_TEXT = BC000K3_n401TBM32_TEXT[0] ;
         A390TBM32_FONT_SIZE = BC000K3_A390TBM32_FONT_SIZE[0] ;
         n390TBM32_FONT_SIZE = BC000K3_n390TBM32_FONT_SIZE[0] ;
         A391TBM32_FONT_UL_FLG = BC000K3_A391TBM32_FONT_UL_FLG[0] ;
         n391TBM32_FONT_UL_FLG = BC000K3_n391TBM32_FONT_UL_FLG[0] ;
         A392TBM32_FONT_COLOR_DIV = BC000K3_A392TBM32_FONT_COLOR_DIV[0] ;
         n392TBM32_FONT_COLOR_DIV = BC000K3_n392TBM32_FONT_COLOR_DIV[0] ;
         A398TBM32_LINE_SIZE_DIV = BC000K3_A398TBM32_LINE_SIZE_DIV[0] ;
         n398TBM32_LINE_SIZE_DIV = BC000K3_n398TBM32_LINE_SIZE_DIV[0] ;
         A603TBM32_LINE_COLOR_DIV = BC000K3_A603TBM32_LINE_COLOR_DIV[0] ;
         n603TBM32_LINE_COLOR_DIV = BC000K3_n603TBM32_LINE_COLOR_DIV[0] ;
         A396TBM32_LINE_START_POINT_DIV = BC000K3_A396TBM32_LINE_START_POINT_DIV[0] ;
         n396TBM32_LINE_START_POINT_DIV = BC000K3_n396TBM32_LINE_START_POINT_DIV[0] ;
         A397TBM32_LINE_END_POINT_DIV = BC000K3_A397TBM32_LINE_END_POINT_DIV[0] ;
         n397TBM32_LINE_END_POINT_DIV = BC000K3_n397TBM32_LINE_END_POINT_DIV[0] ;
         A604TBM32_LINE_ANGLE = BC000K3_A604TBM32_LINE_ANGLE[0] ;
         n604TBM32_LINE_ANGLE = BC000K3_n604TBM32_LINE_ANGLE[0] ;
         A552TBM32_AUTH_LVL_MIN = BC000K3_A552TBM32_AUTH_LVL_MIN[0] ;
         n552TBM32_AUTH_LVL_MIN = BC000K3_n552TBM32_AUTH_LVL_MIN[0] ;
         A553TBM32_ZORDER = BC000K3_A553TBM32_ZORDER[0] ;
         n553TBM32_ZORDER = BC000K3_n553TBM32_ZORDER[0] ;
         A605TBM32_TAB_ORDER = BC000K3_A605TBM32_TAB_ORDER[0] ;
         n605TBM32_TAB_ORDER = BC000K3_n605TBM32_TAB_ORDER[0] ;
         A606TBM32_TABSTOP_FLG = BC000K3_A606TBM32_TABSTOP_FLG[0] ;
         n606TBM32_TABSTOP_FLG = BC000K3_n606TBM32_TABSTOP_FLG[0] ;
         A607TBM32_REQUIRED_INPUT_FLG = BC000K3_A607TBM32_REQUIRED_INPUT_FLG[0] ;
         n607TBM32_REQUIRED_INPUT_FLG = BC000K3_n607TBM32_REQUIRED_INPUT_FLG[0] ;
         A608TBM32_MIN_VALUE = BC000K3_A608TBM32_MIN_VALUE[0] ;
         n608TBM32_MIN_VALUE = BC000K3_n608TBM32_MIN_VALUE[0] ;
         A609TBM32_MAX_VALUE = BC000K3_A609TBM32_MAX_VALUE[0] ;
         n609TBM32_MAX_VALUE = BC000K3_n609TBM32_MAX_VALUE[0] ;
         A237TBM32_CRF_ITEM_NOTE = BC000K3_A237TBM32_CRF_ITEM_NOTE[0] ;
         n237TBM32_CRF_ITEM_NOTE = BC000K3_n237TBM32_CRF_ITEM_NOTE[0] ;
         A746TBM32_REF_CRF_ID = BC000K3_A746TBM32_REF_CRF_ID[0] ;
         n746TBM32_REF_CRF_ID = BC000K3_n746TBM32_REF_CRF_ID[0] ;
         A747TBM32_REF_CRF_ITEM_CD = BC000K3_A747TBM32_REF_CRF_ITEM_CD[0] ;
         n747TBM32_REF_CRF_ITEM_CD = BC000K3_n747TBM32_REF_CRF_ITEM_CD[0] ;
         A238TBM32_DEL_FLG = BC000K3_A238TBM32_DEL_FLG[0] ;
         n238TBM32_DEL_FLG = BC000K3_n238TBM32_DEL_FLG[0] ;
         A241TBM32_CRT_PROG_NM = BC000K3_A241TBM32_CRT_PROG_NM[0] ;
         n241TBM32_CRT_PROG_NM = BC000K3_n241TBM32_CRT_PROG_NM[0] ;
         A244TBM32_UPD_PROG_NM = BC000K3_A244TBM32_UPD_PROG_NM[0] ;
         n244TBM32_UPD_PROG_NM = BC000K3_n244TBM32_UPD_PROG_NM[0] ;
         O245TBM32_UPD_CNT = A245TBM32_UPD_CNT ;
         n245TBM32_UPD_CNT = false ;
         Z231TBM32_STUDY_ID = A231TBM32_STUDY_ID ;
         Z232TBM32_CRF_ID = A232TBM32_CRF_ID ;
         Z233TBM32_CRF_ITEM_CD = A233TBM32_CRF_ITEM_CD ;
         sMode19 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load0K19( ) ;
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
      pr_default.close(1);
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
         /* Using cursor BC000K2 */
         pr_default.execute(0, new Object[] {new Long(A231TBM32_STUDY_ID), new Short(A232TBM32_CRF_ID), A233TBM32_CRF_ITEM_CD});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM32_CRF_ITEM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z239TBM32_CRT_DATETIME.equals( BC000K2_A239TBM32_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z240TBM32_CRT_USER_ID, BC000K2_A240TBM32_CRT_USER_ID[0]) != 0 ) || !( Z242TBM32_UPD_DATETIME.equals( BC000K2_A242TBM32_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z243TBM32_UPD_USER_ID, BC000K2_A243TBM32_UPD_USER_ID[0]) != 0 ) || ( Z245TBM32_UPD_CNT != BC000K2_A245TBM32_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z234TBM32_CRF_ITEM_NM, BC000K2_A234TBM32_CRF_ITEM_NM[0]) != 0 ) || ( GXutil.strcmp(Z235TBM32_CRF_ITEM_DIV, BC000K2_A235TBM32_CRF_ITEM_DIV[0]) != 0 ) || ( GXutil.strcmp(Z236TBM32_CRF_ITEM_GRP_CD, BC000K2_A236TBM32_CRF_ITEM_GRP_CD[0]) != 0 ) || ( Z384TBM32_CRF_ITEM_GRP_ORDER != BC000K2_A384TBM32_CRF_ITEM_GRP_ORDER[0] ) || ( Z385TBM32_LOCATION_X != BC000K2_A385TBM32_LOCATION_X[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z386TBM32_LOCATION_Y != BC000K2_A386TBM32_LOCATION_Y[0] ) || ( Z387TBM32_LOCATION_X2 != BC000K2_A387TBM32_LOCATION_X2[0] ) || ( Z388TBM32_LOCATION_Y2 != BC000K2_A388TBM32_LOCATION_Y2[0] ) || ( GXutil.strcmp(Z389TBM32_TEXT_ALIGN_DIV, BC000K2_A389TBM32_TEXT_ALIGN_DIV[0]) != 0 ) || ( Z393TBM32_TEXT_MAXROWS != BC000K2_A393TBM32_TEXT_MAXROWS[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z394TBM32_TEXT_MAXLENGTH != BC000K2_A394TBM32_TEXT_MAXLENGTH[0] ) || ( Z395TBM32_DECIMAL_DIGITS != BC000K2_A395TBM32_DECIMAL_DIGITS[0] ) || ( GXutil.strcmp(Z399TBM32_CHK_TRUE_INNER_VALUE, BC000K2_A399TBM32_CHK_TRUE_INNER_VALUE[0]) != 0 ) || ( GXutil.strcmp(Z400TBM32_CHK_FALSE_INNER_VALUE, BC000K2_A400TBM32_CHK_FALSE_INNER_VALUE[0]) != 0 ) || ( GXutil.strcmp(Z404TBM32_FIXED_VALUE, BC000K2_A404TBM32_FIXED_VALUE[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z402TBM32_LIST_CD, BC000K2_A402TBM32_LIST_CD[0]) != 0 ) || ( GXutil.strcmp(Z403TBM32_IMAGE_CD, BC000K2_A403TBM32_IMAGE_CD[0]) != 0 ) || ( GXutil.strcmp(Z401TBM32_TEXT, BC000K2_A401TBM32_TEXT[0]) != 0 ) || ( Z390TBM32_FONT_SIZE != BC000K2_A390TBM32_FONT_SIZE[0] ) || ( GXutil.strcmp(Z391TBM32_FONT_UL_FLG, BC000K2_A391TBM32_FONT_UL_FLG[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z392TBM32_FONT_COLOR_DIV != BC000K2_A392TBM32_FONT_COLOR_DIV[0] ) || ( Z398TBM32_LINE_SIZE_DIV != BC000K2_A398TBM32_LINE_SIZE_DIV[0] ) || ( Z603TBM32_LINE_COLOR_DIV != BC000K2_A603TBM32_LINE_COLOR_DIV[0] ) || ( GXutil.strcmp(Z396TBM32_LINE_START_POINT_DIV, BC000K2_A396TBM32_LINE_START_POINT_DIV[0]) != 0 ) || ( GXutil.strcmp(Z397TBM32_LINE_END_POINT_DIV, BC000K2_A397TBM32_LINE_END_POINT_DIV[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z604TBM32_LINE_ANGLE != BC000K2_A604TBM32_LINE_ANGLE[0] ) || ( Z552TBM32_AUTH_LVL_MIN != BC000K2_A552TBM32_AUTH_LVL_MIN[0] ) || ( Z553TBM32_ZORDER != BC000K2_A553TBM32_ZORDER[0] ) || ( Z605TBM32_TAB_ORDER != BC000K2_A605TBM32_TAB_ORDER[0] ) || ( GXutil.strcmp(Z606TBM32_TABSTOP_FLG, BC000K2_A606TBM32_TABSTOP_FLG[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z607TBM32_REQUIRED_INPUT_FLG, BC000K2_A607TBM32_REQUIRED_INPUT_FLG[0]) != 0 ) || ( GXutil.strcmp(Z608TBM32_MIN_VALUE, BC000K2_A608TBM32_MIN_VALUE[0]) != 0 ) || ( GXutil.strcmp(Z609TBM32_MAX_VALUE, BC000K2_A609TBM32_MAX_VALUE[0]) != 0 ) || ( GXutil.strcmp(Z237TBM32_CRF_ITEM_NOTE, BC000K2_A237TBM32_CRF_ITEM_NOTE[0]) != 0 ) || ( Z746TBM32_REF_CRF_ID != BC000K2_A746TBM32_REF_CRF_ID[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z747TBM32_REF_CRF_ITEM_CD, BC000K2_A747TBM32_REF_CRF_ITEM_CD[0]) != 0 ) || ( GXutil.strcmp(Z238TBM32_DEL_FLG, BC000K2_A238TBM32_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z241TBM32_CRT_PROG_NM, BC000K2_A241TBM32_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z244TBM32_UPD_PROG_NM, BC000K2_A244TBM32_UPD_PROG_NM[0]) != 0 ) )
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
                  /* Using cursor BC000K6 */
                  pr_default.execute(4, new Object[] {new Long(A231TBM32_STUDY_ID), new Short(A232TBM32_CRF_ID), A233TBM32_CRF_ITEM_CD, new Boolean(n239TBM32_CRT_DATETIME), A239TBM32_CRT_DATETIME, new Boolean(n240TBM32_CRT_USER_ID), A240TBM32_CRT_USER_ID, new Boolean(n242TBM32_UPD_DATETIME), A242TBM32_UPD_DATETIME, new Boolean(n243TBM32_UPD_USER_ID), A243TBM32_UPD_USER_ID, new Boolean(n245TBM32_UPD_CNT), new Long(A245TBM32_UPD_CNT), new Boolean(n234TBM32_CRF_ITEM_NM), A234TBM32_CRF_ITEM_NM, new Boolean(n235TBM32_CRF_ITEM_DIV), A235TBM32_CRF_ITEM_DIV, new Boolean(n236TBM32_CRF_ITEM_GRP_CD), A236TBM32_CRF_ITEM_GRP_CD, new Boolean(n384TBM32_CRF_ITEM_GRP_ORDER), new Short(A384TBM32_CRF_ITEM_GRP_ORDER), new Boolean(n385TBM32_LOCATION_X), new Short(A385TBM32_LOCATION_X), new Boolean(n386TBM32_LOCATION_Y), new Short(A386TBM32_LOCATION_Y), new Boolean(n387TBM32_LOCATION_X2), new Short(A387TBM32_LOCATION_X2), new Boolean(n388TBM32_LOCATION_Y2), new Short(A388TBM32_LOCATION_Y2), new Boolean(n389TBM32_TEXT_ALIGN_DIV), A389TBM32_TEXT_ALIGN_DIV, new Boolean(n393TBM32_TEXT_MAXROWS), new Byte(A393TBM32_TEXT_MAXROWS), new Boolean(n394TBM32_TEXT_MAXLENGTH), new Short(A394TBM32_TEXT_MAXLENGTH), new Boolean(n395TBM32_DECIMAL_DIGITS), new Byte(A395TBM32_DECIMAL_DIGITS), new Boolean(n399TBM32_CHK_TRUE_INNER_VALUE), A399TBM32_CHK_TRUE_INNER_VALUE, new Boolean(n400TBM32_CHK_FALSE_INNER_VALUE), A400TBM32_CHK_FALSE_INNER_VALUE, new Boolean(n404TBM32_FIXED_VALUE), A404TBM32_FIXED_VALUE, new Boolean(n402TBM32_LIST_CD), A402TBM32_LIST_CD, new Boolean(n403TBM32_IMAGE_CD), A403TBM32_IMAGE_CD, new Boolean(n401TBM32_TEXT), A401TBM32_TEXT, new Boolean(n390TBM32_FONT_SIZE), new Byte(A390TBM32_FONT_SIZE), new Boolean(n391TBM32_FONT_UL_FLG), A391TBM32_FONT_UL_FLG, new Boolean(n392TBM32_FONT_COLOR_DIV), new Long(A392TBM32_FONT_COLOR_DIV), new Boolean(n398TBM32_LINE_SIZE_DIV), new Byte(A398TBM32_LINE_SIZE_DIV), new Boolean(n603TBM32_LINE_COLOR_DIV), new Long(A603TBM32_LINE_COLOR_DIV), new Boolean(n396TBM32_LINE_START_POINT_DIV), A396TBM32_LINE_START_POINT_DIV, new Boolean(n397TBM32_LINE_END_POINT_DIV), A397TBM32_LINE_END_POINT_DIV, new Boolean(n604TBM32_LINE_ANGLE), new Short(A604TBM32_LINE_ANGLE), new Boolean(n552TBM32_AUTH_LVL_MIN), new Byte(A552TBM32_AUTH_LVL_MIN), new Boolean(n553TBM32_ZORDER), new Short(A553TBM32_ZORDER), new Boolean(n605TBM32_TAB_ORDER), new Short(A605TBM32_TAB_ORDER), new Boolean(n606TBM32_TABSTOP_FLG), A606TBM32_TABSTOP_FLG, new Boolean(n607TBM32_REQUIRED_INPUT_FLG), A607TBM32_REQUIRED_INPUT_FLG, new Boolean(n608TBM32_MIN_VALUE), A608TBM32_MIN_VALUE, new Boolean(n609TBM32_MAX_VALUE), A609TBM32_MAX_VALUE, new Boolean(n237TBM32_CRF_ITEM_NOTE), A237TBM32_CRF_ITEM_NOTE, new Boolean(n746TBM32_REF_CRF_ID), new Short(A746TBM32_REF_CRF_ID), new Boolean(n747TBM32_REF_CRF_ITEM_CD), A747TBM32_REF_CRF_ITEM_CD, new Boolean(n238TBM32_DEL_FLG), A238TBM32_DEL_FLG, new Boolean(n241TBM32_CRT_PROG_NM), A241TBM32_CRT_PROG_NM, new Boolean(n244TBM32_UPD_PROG_NM), A244TBM32_UPD_PROG_NM});
                  if ( (pr_default.getStatus(4) == 1) )
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
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucadded"), 0, "");
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
                  /* Using cursor BC000K7 */
                  pr_default.execute(5, new Object[] {new Boolean(n239TBM32_CRT_DATETIME), A239TBM32_CRT_DATETIME, new Boolean(n240TBM32_CRT_USER_ID), A240TBM32_CRT_USER_ID, new Boolean(n242TBM32_UPD_DATETIME), A242TBM32_UPD_DATETIME, new Boolean(n243TBM32_UPD_USER_ID), A243TBM32_UPD_USER_ID, new Boolean(n245TBM32_UPD_CNT), new Long(A245TBM32_UPD_CNT), new Boolean(n234TBM32_CRF_ITEM_NM), A234TBM32_CRF_ITEM_NM, new Boolean(n235TBM32_CRF_ITEM_DIV), A235TBM32_CRF_ITEM_DIV, new Boolean(n236TBM32_CRF_ITEM_GRP_CD), A236TBM32_CRF_ITEM_GRP_CD, new Boolean(n384TBM32_CRF_ITEM_GRP_ORDER), new Short(A384TBM32_CRF_ITEM_GRP_ORDER), new Boolean(n385TBM32_LOCATION_X), new Short(A385TBM32_LOCATION_X), new Boolean(n386TBM32_LOCATION_Y), new Short(A386TBM32_LOCATION_Y), new Boolean(n387TBM32_LOCATION_X2), new Short(A387TBM32_LOCATION_X2), new Boolean(n388TBM32_LOCATION_Y2), new Short(A388TBM32_LOCATION_Y2), new Boolean(n389TBM32_TEXT_ALIGN_DIV), A389TBM32_TEXT_ALIGN_DIV, new Boolean(n393TBM32_TEXT_MAXROWS), new Byte(A393TBM32_TEXT_MAXROWS), new Boolean(n394TBM32_TEXT_MAXLENGTH), new Short(A394TBM32_TEXT_MAXLENGTH), new Boolean(n395TBM32_DECIMAL_DIGITS), new Byte(A395TBM32_DECIMAL_DIGITS), new Boolean(n399TBM32_CHK_TRUE_INNER_VALUE), A399TBM32_CHK_TRUE_INNER_VALUE, new Boolean(n400TBM32_CHK_FALSE_INNER_VALUE), A400TBM32_CHK_FALSE_INNER_VALUE, new Boolean(n404TBM32_FIXED_VALUE), A404TBM32_FIXED_VALUE, new Boolean(n402TBM32_LIST_CD), A402TBM32_LIST_CD, new Boolean(n403TBM32_IMAGE_CD), A403TBM32_IMAGE_CD, new Boolean(n401TBM32_TEXT), A401TBM32_TEXT, new Boolean(n390TBM32_FONT_SIZE), new Byte(A390TBM32_FONT_SIZE), new Boolean(n391TBM32_FONT_UL_FLG), A391TBM32_FONT_UL_FLG, new Boolean(n392TBM32_FONT_COLOR_DIV), new Long(A392TBM32_FONT_COLOR_DIV), new Boolean(n398TBM32_LINE_SIZE_DIV), new Byte(A398TBM32_LINE_SIZE_DIV), new Boolean(n603TBM32_LINE_COLOR_DIV), new Long(A603TBM32_LINE_COLOR_DIV), new Boolean(n396TBM32_LINE_START_POINT_DIV), A396TBM32_LINE_START_POINT_DIV, new Boolean(n397TBM32_LINE_END_POINT_DIV), A397TBM32_LINE_END_POINT_DIV, new Boolean(n604TBM32_LINE_ANGLE), new Short(A604TBM32_LINE_ANGLE), new Boolean(n552TBM32_AUTH_LVL_MIN), new Byte(A552TBM32_AUTH_LVL_MIN), new Boolean(n553TBM32_ZORDER), new Short(A553TBM32_ZORDER), new Boolean(n605TBM32_TAB_ORDER), new Short(A605TBM32_TAB_ORDER), new Boolean(n606TBM32_TABSTOP_FLG), A606TBM32_TABSTOP_FLG, new Boolean(n607TBM32_REQUIRED_INPUT_FLG), A607TBM32_REQUIRED_INPUT_FLG, new Boolean(n608TBM32_MIN_VALUE), A608TBM32_MIN_VALUE, new Boolean(n609TBM32_MAX_VALUE), A609TBM32_MAX_VALUE, new Boolean(n237TBM32_CRF_ITEM_NOTE), A237TBM32_CRF_ITEM_NOTE, new Boolean(n746TBM32_REF_CRF_ID), new Short(A746TBM32_REF_CRF_ID), new Boolean(n747TBM32_REF_CRF_ITEM_CD), A747TBM32_REF_CRF_ITEM_CD, new Boolean(n238TBM32_DEL_FLG), A238TBM32_DEL_FLG, new Boolean(n241TBM32_CRT_PROG_NM), A241TBM32_CRT_PROG_NM, new Boolean(n244TBM32_UPD_PROG_NM), A244TBM32_UPD_PROG_NM, new Long(A231TBM32_STUDY_ID), new Short(A232TBM32_CRF_ID), A233TBM32_CRF_ITEM_CD});
                  if ( (pr_default.getStatus(5) == 103) )
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
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "");
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
               /* Using cursor BC000K8 */
               pr_default.execute(6, new Object[] {new Long(A231TBM32_STUDY_ID), new Short(A232TBM32_CRF_ID), A233TBM32_CRF_ITEM_CD});
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucdeleted"), 0, "");
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
         pr_default.close(0);
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
      /* Using cursor BC000K9 */
      pr_default.execute(7, new Object[] {new Long(A231TBM32_STUDY_ID), new Short(A232TBM32_CRF_ID), A233TBM32_CRF_ITEM_CD});
      RcdFound19 = (short)(0) ;
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound19 = (short)(1) ;
         A231TBM32_STUDY_ID = BC000K9_A231TBM32_STUDY_ID[0] ;
         A232TBM32_CRF_ID = BC000K9_A232TBM32_CRF_ID[0] ;
         A233TBM32_CRF_ITEM_CD = BC000K9_A233TBM32_CRF_ITEM_CD[0] ;
         A239TBM32_CRT_DATETIME = BC000K9_A239TBM32_CRT_DATETIME[0] ;
         n239TBM32_CRT_DATETIME = BC000K9_n239TBM32_CRT_DATETIME[0] ;
         A240TBM32_CRT_USER_ID = BC000K9_A240TBM32_CRT_USER_ID[0] ;
         n240TBM32_CRT_USER_ID = BC000K9_n240TBM32_CRT_USER_ID[0] ;
         A242TBM32_UPD_DATETIME = BC000K9_A242TBM32_UPD_DATETIME[0] ;
         n242TBM32_UPD_DATETIME = BC000K9_n242TBM32_UPD_DATETIME[0] ;
         A243TBM32_UPD_USER_ID = BC000K9_A243TBM32_UPD_USER_ID[0] ;
         n243TBM32_UPD_USER_ID = BC000K9_n243TBM32_UPD_USER_ID[0] ;
         A245TBM32_UPD_CNT = BC000K9_A245TBM32_UPD_CNT[0] ;
         n245TBM32_UPD_CNT = BC000K9_n245TBM32_UPD_CNT[0] ;
         A234TBM32_CRF_ITEM_NM = BC000K9_A234TBM32_CRF_ITEM_NM[0] ;
         n234TBM32_CRF_ITEM_NM = BC000K9_n234TBM32_CRF_ITEM_NM[0] ;
         A235TBM32_CRF_ITEM_DIV = BC000K9_A235TBM32_CRF_ITEM_DIV[0] ;
         n235TBM32_CRF_ITEM_DIV = BC000K9_n235TBM32_CRF_ITEM_DIV[0] ;
         A236TBM32_CRF_ITEM_GRP_CD = BC000K9_A236TBM32_CRF_ITEM_GRP_CD[0] ;
         n236TBM32_CRF_ITEM_GRP_CD = BC000K9_n236TBM32_CRF_ITEM_GRP_CD[0] ;
         A384TBM32_CRF_ITEM_GRP_ORDER = BC000K9_A384TBM32_CRF_ITEM_GRP_ORDER[0] ;
         n384TBM32_CRF_ITEM_GRP_ORDER = BC000K9_n384TBM32_CRF_ITEM_GRP_ORDER[0] ;
         A385TBM32_LOCATION_X = BC000K9_A385TBM32_LOCATION_X[0] ;
         n385TBM32_LOCATION_X = BC000K9_n385TBM32_LOCATION_X[0] ;
         A386TBM32_LOCATION_Y = BC000K9_A386TBM32_LOCATION_Y[0] ;
         n386TBM32_LOCATION_Y = BC000K9_n386TBM32_LOCATION_Y[0] ;
         A387TBM32_LOCATION_X2 = BC000K9_A387TBM32_LOCATION_X2[0] ;
         n387TBM32_LOCATION_X2 = BC000K9_n387TBM32_LOCATION_X2[0] ;
         A388TBM32_LOCATION_Y2 = BC000K9_A388TBM32_LOCATION_Y2[0] ;
         n388TBM32_LOCATION_Y2 = BC000K9_n388TBM32_LOCATION_Y2[0] ;
         A389TBM32_TEXT_ALIGN_DIV = BC000K9_A389TBM32_TEXT_ALIGN_DIV[0] ;
         n389TBM32_TEXT_ALIGN_DIV = BC000K9_n389TBM32_TEXT_ALIGN_DIV[0] ;
         A393TBM32_TEXT_MAXROWS = BC000K9_A393TBM32_TEXT_MAXROWS[0] ;
         n393TBM32_TEXT_MAXROWS = BC000K9_n393TBM32_TEXT_MAXROWS[0] ;
         A394TBM32_TEXT_MAXLENGTH = BC000K9_A394TBM32_TEXT_MAXLENGTH[0] ;
         n394TBM32_TEXT_MAXLENGTH = BC000K9_n394TBM32_TEXT_MAXLENGTH[0] ;
         A395TBM32_DECIMAL_DIGITS = BC000K9_A395TBM32_DECIMAL_DIGITS[0] ;
         n395TBM32_DECIMAL_DIGITS = BC000K9_n395TBM32_DECIMAL_DIGITS[0] ;
         A399TBM32_CHK_TRUE_INNER_VALUE = BC000K9_A399TBM32_CHK_TRUE_INNER_VALUE[0] ;
         n399TBM32_CHK_TRUE_INNER_VALUE = BC000K9_n399TBM32_CHK_TRUE_INNER_VALUE[0] ;
         A400TBM32_CHK_FALSE_INNER_VALUE = BC000K9_A400TBM32_CHK_FALSE_INNER_VALUE[0] ;
         n400TBM32_CHK_FALSE_INNER_VALUE = BC000K9_n400TBM32_CHK_FALSE_INNER_VALUE[0] ;
         A404TBM32_FIXED_VALUE = BC000K9_A404TBM32_FIXED_VALUE[0] ;
         n404TBM32_FIXED_VALUE = BC000K9_n404TBM32_FIXED_VALUE[0] ;
         A402TBM32_LIST_CD = BC000K9_A402TBM32_LIST_CD[0] ;
         n402TBM32_LIST_CD = BC000K9_n402TBM32_LIST_CD[0] ;
         A403TBM32_IMAGE_CD = BC000K9_A403TBM32_IMAGE_CD[0] ;
         n403TBM32_IMAGE_CD = BC000K9_n403TBM32_IMAGE_CD[0] ;
         A401TBM32_TEXT = BC000K9_A401TBM32_TEXT[0] ;
         n401TBM32_TEXT = BC000K9_n401TBM32_TEXT[0] ;
         A390TBM32_FONT_SIZE = BC000K9_A390TBM32_FONT_SIZE[0] ;
         n390TBM32_FONT_SIZE = BC000K9_n390TBM32_FONT_SIZE[0] ;
         A391TBM32_FONT_UL_FLG = BC000K9_A391TBM32_FONT_UL_FLG[0] ;
         n391TBM32_FONT_UL_FLG = BC000K9_n391TBM32_FONT_UL_FLG[0] ;
         A392TBM32_FONT_COLOR_DIV = BC000K9_A392TBM32_FONT_COLOR_DIV[0] ;
         n392TBM32_FONT_COLOR_DIV = BC000K9_n392TBM32_FONT_COLOR_DIV[0] ;
         A398TBM32_LINE_SIZE_DIV = BC000K9_A398TBM32_LINE_SIZE_DIV[0] ;
         n398TBM32_LINE_SIZE_DIV = BC000K9_n398TBM32_LINE_SIZE_DIV[0] ;
         A603TBM32_LINE_COLOR_DIV = BC000K9_A603TBM32_LINE_COLOR_DIV[0] ;
         n603TBM32_LINE_COLOR_DIV = BC000K9_n603TBM32_LINE_COLOR_DIV[0] ;
         A396TBM32_LINE_START_POINT_DIV = BC000K9_A396TBM32_LINE_START_POINT_DIV[0] ;
         n396TBM32_LINE_START_POINT_DIV = BC000K9_n396TBM32_LINE_START_POINT_DIV[0] ;
         A397TBM32_LINE_END_POINT_DIV = BC000K9_A397TBM32_LINE_END_POINT_DIV[0] ;
         n397TBM32_LINE_END_POINT_DIV = BC000K9_n397TBM32_LINE_END_POINT_DIV[0] ;
         A604TBM32_LINE_ANGLE = BC000K9_A604TBM32_LINE_ANGLE[0] ;
         n604TBM32_LINE_ANGLE = BC000K9_n604TBM32_LINE_ANGLE[0] ;
         A552TBM32_AUTH_LVL_MIN = BC000K9_A552TBM32_AUTH_LVL_MIN[0] ;
         n552TBM32_AUTH_LVL_MIN = BC000K9_n552TBM32_AUTH_LVL_MIN[0] ;
         A553TBM32_ZORDER = BC000K9_A553TBM32_ZORDER[0] ;
         n553TBM32_ZORDER = BC000K9_n553TBM32_ZORDER[0] ;
         A605TBM32_TAB_ORDER = BC000K9_A605TBM32_TAB_ORDER[0] ;
         n605TBM32_TAB_ORDER = BC000K9_n605TBM32_TAB_ORDER[0] ;
         A606TBM32_TABSTOP_FLG = BC000K9_A606TBM32_TABSTOP_FLG[0] ;
         n606TBM32_TABSTOP_FLG = BC000K9_n606TBM32_TABSTOP_FLG[0] ;
         A607TBM32_REQUIRED_INPUT_FLG = BC000K9_A607TBM32_REQUIRED_INPUT_FLG[0] ;
         n607TBM32_REQUIRED_INPUT_FLG = BC000K9_n607TBM32_REQUIRED_INPUT_FLG[0] ;
         A608TBM32_MIN_VALUE = BC000K9_A608TBM32_MIN_VALUE[0] ;
         n608TBM32_MIN_VALUE = BC000K9_n608TBM32_MIN_VALUE[0] ;
         A609TBM32_MAX_VALUE = BC000K9_A609TBM32_MAX_VALUE[0] ;
         n609TBM32_MAX_VALUE = BC000K9_n609TBM32_MAX_VALUE[0] ;
         A237TBM32_CRF_ITEM_NOTE = BC000K9_A237TBM32_CRF_ITEM_NOTE[0] ;
         n237TBM32_CRF_ITEM_NOTE = BC000K9_n237TBM32_CRF_ITEM_NOTE[0] ;
         A746TBM32_REF_CRF_ID = BC000K9_A746TBM32_REF_CRF_ID[0] ;
         n746TBM32_REF_CRF_ID = BC000K9_n746TBM32_REF_CRF_ID[0] ;
         A747TBM32_REF_CRF_ITEM_CD = BC000K9_A747TBM32_REF_CRF_ITEM_CD[0] ;
         n747TBM32_REF_CRF_ITEM_CD = BC000K9_n747TBM32_REF_CRF_ITEM_CD[0] ;
         A238TBM32_DEL_FLG = BC000K9_A238TBM32_DEL_FLG[0] ;
         n238TBM32_DEL_FLG = BC000K9_n238TBM32_DEL_FLG[0] ;
         A241TBM32_CRT_PROG_NM = BC000K9_A241TBM32_CRT_PROG_NM[0] ;
         n241TBM32_CRT_PROG_NM = BC000K9_n241TBM32_CRT_PROG_NM[0] ;
         A244TBM32_UPD_PROG_NM = BC000K9_A244TBM32_UPD_PROG_NM[0] ;
         n244TBM32_UPD_PROG_NM = BC000K9_n244TBM32_UPD_PROG_NM[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext0K19( )
   {
      pr_default.readNext(7);
      RcdFound19 = (short)(0) ;
      scanKeyLoad0K19( ) ;
   }

   public void scanKeyLoad0K19( )
   {
      sMode19 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound19 = (short)(1) ;
         A231TBM32_STUDY_ID = BC000K9_A231TBM32_STUDY_ID[0] ;
         A232TBM32_CRF_ID = BC000K9_A232TBM32_CRF_ID[0] ;
         A233TBM32_CRF_ITEM_CD = BC000K9_A233TBM32_CRF_ITEM_CD[0] ;
         A239TBM32_CRT_DATETIME = BC000K9_A239TBM32_CRT_DATETIME[0] ;
         n239TBM32_CRT_DATETIME = BC000K9_n239TBM32_CRT_DATETIME[0] ;
         A240TBM32_CRT_USER_ID = BC000K9_A240TBM32_CRT_USER_ID[0] ;
         n240TBM32_CRT_USER_ID = BC000K9_n240TBM32_CRT_USER_ID[0] ;
         A242TBM32_UPD_DATETIME = BC000K9_A242TBM32_UPD_DATETIME[0] ;
         n242TBM32_UPD_DATETIME = BC000K9_n242TBM32_UPD_DATETIME[0] ;
         A243TBM32_UPD_USER_ID = BC000K9_A243TBM32_UPD_USER_ID[0] ;
         n243TBM32_UPD_USER_ID = BC000K9_n243TBM32_UPD_USER_ID[0] ;
         A245TBM32_UPD_CNT = BC000K9_A245TBM32_UPD_CNT[0] ;
         n245TBM32_UPD_CNT = BC000K9_n245TBM32_UPD_CNT[0] ;
         A234TBM32_CRF_ITEM_NM = BC000K9_A234TBM32_CRF_ITEM_NM[0] ;
         n234TBM32_CRF_ITEM_NM = BC000K9_n234TBM32_CRF_ITEM_NM[0] ;
         A235TBM32_CRF_ITEM_DIV = BC000K9_A235TBM32_CRF_ITEM_DIV[0] ;
         n235TBM32_CRF_ITEM_DIV = BC000K9_n235TBM32_CRF_ITEM_DIV[0] ;
         A236TBM32_CRF_ITEM_GRP_CD = BC000K9_A236TBM32_CRF_ITEM_GRP_CD[0] ;
         n236TBM32_CRF_ITEM_GRP_CD = BC000K9_n236TBM32_CRF_ITEM_GRP_CD[0] ;
         A384TBM32_CRF_ITEM_GRP_ORDER = BC000K9_A384TBM32_CRF_ITEM_GRP_ORDER[0] ;
         n384TBM32_CRF_ITEM_GRP_ORDER = BC000K9_n384TBM32_CRF_ITEM_GRP_ORDER[0] ;
         A385TBM32_LOCATION_X = BC000K9_A385TBM32_LOCATION_X[0] ;
         n385TBM32_LOCATION_X = BC000K9_n385TBM32_LOCATION_X[0] ;
         A386TBM32_LOCATION_Y = BC000K9_A386TBM32_LOCATION_Y[0] ;
         n386TBM32_LOCATION_Y = BC000K9_n386TBM32_LOCATION_Y[0] ;
         A387TBM32_LOCATION_X2 = BC000K9_A387TBM32_LOCATION_X2[0] ;
         n387TBM32_LOCATION_X2 = BC000K9_n387TBM32_LOCATION_X2[0] ;
         A388TBM32_LOCATION_Y2 = BC000K9_A388TBM32_LOCATION_Y2[0] ;
         n388TBM32_LOCATION_Y2 = BC000K9_n388TBM32_LOCATION_Y2[0] ;
         A389TBM32_TEXT_ALIGN_DIV = BC000K9_A389TBM32_TEXT_ALIGN_DIV[0] ;
         n389TBM32_TEXT_ALIGN_DIV = BC000K9_n389TBM32_TEXT_ALIGN_DIV[0] ;
         A393TBM32_TEXT_MAXROWS = BC000K9_A393TBM32_TEXT_MAXROWS[0] ;
         n393TBM32_TEXT_MAXROWS = BC000K9_n393TBM32_TEXT_MAXROWS[0] ;
         A394TBM32_TEXT_MAXLENGTH = BC000K9_A394TBM32_TEXT_MAXLENGTH[0] ;
         n394TBM32_TEXT_MAXLENGTH = BC000K9_n394TBM32_TEXT_MAXLENGTH[0] ;
         A395TBM32_DECIMAL_DIGITS = BC000K9_A395TBM32_DECIMAL_DIGITS[0] ;
         n395TBM32_DECIMAL_DIGITS = BC000K9_n395TBM32_DECIMAL_DIGITS[0] ;
         A399TBM32_CHK_TRUE_INNER_VALUE = BC000K9_A399TBM32_CHK_TRUE_INNER_VALUE[0] ;
         n399TBM32_CHK_TRUE_INNER_VALUE = BC000K9_n399TBM32_CHK_TRUE_INNER_VALUE[0] ;
         A400TBM32_CHK_FALSE_INNER_VALUE = BC000K9_A400TBM32_CHK_FALSE_INNER_VALUE[0] ;
         n400TBM32_CHK_FALSE_INNER_VALUE = BC000K9_n400TBM32_CHK_FALSE_INNER_VALUE[0] ;
         A404TBM32_FIXED_VALUE = BC000K9_A404TBM32_FIXED_VALUE[0] ;
         n404TBM32_FIXED_VALUE = BC000K9_n404TBM32_FIXED_VALUE[0] ;
         A402TBM32_LIST_CD = BC000K9_A402TBM32_LIST_CD[0] ;
         n402TBM32_LIST_CD = BC000K9_n402TBM32_LIST_CD[0] ;
         A403TBM32_IMAGE_CD = BC000K9_A403TBM32_IMAGE_CD[0] ;
         n403TBM32_IMAGE_CD = BC000K9_n403TBM32_IMAGE_CD[0] ;
         A401TBM32_TEXT = BC000K9_A401TBM32_TEXT[0] ;
         n401TBM32_TEXT = BC000K9_n401TBM32_TEXT[0] ;
         A390TBM32_FONT_SIZE = BC000K9_A390TBM32_FONT_SIZE[0] ;
         n390TBM32_FONT_SIZE = BC000K9_n390TBM32_FONT_SIZE[0] ;
         A391TBM32_FONT_UL_FLG = BC000K9_A391TBM32_FONT_UL_FLG[0] ;
         n391TBM32_FONT_UL_FLG = BC000K9_n391TBM32_FONT_UL_FLG[0] ;
         A392TBM32_FONT_COLOR_DIV = BC000K9_A392TBM32_FONT_COLOR_DIV[0] ;
         n392TBM32_FONT_COLOR_DIV = BC000K9_n392TBM32_FONT_COLOR_DIV[0] ;
         A398TBM32_LINE_SIZE_DIV = BC000K9_A398TBM32_LINE_SIZE_DIV[0] ;
         n398TBM32_LINE_SIZE_DIV = BC000K9_n398TBM32_LINE_SIZE_DIV[0] ;
         A603TBM32_LINE_COLOR_DIV = BC000K9_A603TBM32_LINE_COLOR_DIV[0] ;
         n603TBM32_LINE_COLOR_DIV = BC000K9_n603TBM32_LINE_COLOR_DIV[0] ;
         A396TBM32_LINE_START_POINT_DIV = BC000K9_A396TBM32_LINE_START_POINT_DIV[0] ;
         n396TBM32_LINE_START_POINT_DIV = BC000K9_n396TBM32_LINE_START_POINT_DIV[0] ;
         A397TBM32_LINE_END_POINT_DIV = BC000K9_A397TBM32_LINE_END_POINT_DIV[0] ;
         n397TBM32_LINE_END_POINT_DIV = BC000K9_n397TBM32_LINE_END_POINT_DIV[0] ;
         A604TBM32_LINE_ANGLE = BC000K9_A604TBM32_LINE_ANGLE[0] ;
         n604TBM32_LINE_ANGLE = BC000K9_n604TBM32_LINE_ANGLE[0] ;
         A552TBM32_AUTH_LVL_MIN = BC000K9_A552TBM32_AUTH_LVL_MIN[0] ;
         n552TBM32_AUTH_LVL_MIN = BC000K9_n552TBM32_AUTH_LVL_MIN[0] ;
         A553TBM32_ZORDER = BC000K9_A553TBM32_ZORDER[0] ;
         n553TBM32_ZORDER = BC000K9_n553TBM32_ZORDER[0] ;
         A605TBM32_TAB_ORDER = BC000K9_A605TBM32_TAB_ORDER[0] ;
         n605TBM32_TAB_ORDER = BC000K9_n605TBM32_TAB_ORDER[0] ;
         A606TBM32_TABSTOP_FLG = BC000K9_A606TBM32_TABSTOP_FLG[0] ;
         n606TBM32_TABSTOP_FLG = BC000K9_n606TBM32_TABSTOP_FLG[0] ;
         A607TBM32_REQUIRED_INPUT_FLG = BC000K9_A607TBM32_REQUIRED_INPUT_FLG[0] ;
         n607TBM32_REQUIRED_INPUT_FLG = BC000K9_n607TBM32_REQUIRED_INPUT_FLG[0] ;
         A608TBM32_MIN_VALUE = BC000K9_A608TBM32_MIN_VALUE[0] ;
         n608TBM32_MIN_VALUE = BC000K9_n608TBM32_MIN_VALUE[0] ;
         A609TBM32_MAX_VALUE = BC000K9_A609TBM32_MAX_VALUE[0] ;
         n609TBM32_MAX_VALUE = BC000K9_n609TBM32_MAX_VALUE[0] ;
         A237TBM32_CRF_ITEM_NOTE = BC000K9_A237TBM32_CRF_ITEM_NOTE[0] ;
         n237TBM32_CRF_ITEM_NOTE = BC000K9_n237TBM32_CRF_ITEM_NOTE[0] ;
         A746TBM32_REF_CRF_ID = BC000K9_A746TBM32_REF_CRF_ID[0] ;
         n746TBM32_REF_CRF_ID = BC000K9_n746TBM32_REF_CRF_ID[0] ;
         A747TBM32_REF_CRF_ITEM_CD = BC000K9_A747TBM32_REF_CRF_ITEM_CD[0] ;
         n747TBM32_REF_CRF_ITEM_CD = BC000K9_n747TBM32_REF_CRF_ITEM_CD[0] ;
         A238TBM32_DEL_FLG = BC000K9_A238TBM32_DEL_FLG[0] ;
         n238TBM32_DEL_FLG = BC000K9_n238TBM32_DEL_FLG[0] ;
         A241TBM32_CRT_PROG_NM = BC000K9_A241TBM32_CRT_PROG_NM[0] ;
         n241TBM32_CRT_PROG_NM = BC000K9_n241TBM32_CRT_PROG_NM[0] ;
         A244TBM32_UPD_PROG_NM = BC000K9_A244TBM32_UPD_PROG_NM[0] ;
         n244TBM32_UPD_PROG_NM = BC000K9_n244TBM32_UPD_PROG_NM[0] ;
      }
      Gx_mode = sMode19 ;
   }

   public void scanKeyEnd0K19( )
   {
      pr_default.close(7);
   }

   public void afterConfirm0K19( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0K19( )
   {
      /* Before Insert Rules */
      A239TBM32_CRT_DATETIME = GXutil.now( ) ;
      n239TBM32_CRT_DATETIME = false ;
      GXt_char1 = A240TBM32_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm32_crf_item_bc.this.GXt_char1 = GXv_char2[0] ;
      A240TBM32_CRT_USER_ID = GXt_char1 ;
      n240TBM32_CRT_USER_ID = false ;
      A242TBM32_UPD_DATETIME = GXutil.now( ) ;
      n242TBM32_UPD_DATETIME = false ;
      GXt_char1 = A243TBM32_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm32_crf_item_bc.this.GXt_char1 = GXv_char2[0] ;
      A243TBM32_UPD_USER_ID = GXt_char1 ;
      n243TBM32_UPD_USER_ID = false ;
      A245TBM32_UPD_CNT = (long)(O245TBM32_UPD_CNT+1) ;
      n245TBM32_UPD_CNT = false ;
   }

   public void beforeUpdate0K19( )
   {
      /* Before Update Rules */
      A242TBM32_UPD_DATETIME = GXutil.now( ) ;
      n242TBM32_UPD_DATETIME = false ;
      GXt_char1 = A243TBM32_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm32_crf_item_bc.this.GXt_char1 = GXv_char2[0] ;
      A243TBM32_UPD_USER_ID = GXt_char1 ;
      n243TBM32_UPD_USER_ID = false ;
      A245TBM32_UPD_CNT = (long)(O245TBM32_UPD_CNT+1) ;
      n245TBM32_UPD_CNT = false ;
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
      A239TBM32_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n239TBM32_CRT_DATETIME = false ;
      A240TBM32_CRT_USER_ID = "" ;
      n240TBM32_CRT_USER_ID = false ;
      A242TBM32_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n242TBM32_UPD_DATETIME = false ;
      A243TBM32_UPD_USER_ID = "" ;
      n243TBM32_UPD_USER_ID = false ;
      A245TBM32_UPD_CNT = 0 ;
      n245TBM32_UPD_CNT = false ;
      A234TBM32_CRF_ITEM_NM = "" ;
      n234TBM32_CRF_ITEM_NM = false ;
      A235TBM32_CRF_ITEM_DIV = "" ;
      n235TBM32_CRF_ITEM_DIV = false ;
      A236TBM32_CRF_ITEM_GRP_CD = "" ;
      n236TBM32_CRF_ITEM_GRP_CD = false ;
      A384TBM32_CRF_ITEM_GRP_ORDER = (short)(0) ;
      n384TBM32_CRF_ITEM_GRP_ORDER = false ;
      A385TBM32_LOCATION_X = (short)(0) ;
      n385TBM32_LOCATION_X = false ;
      A386TBM32_LOCATION_Y = (short)(0) ;
      n386TBM32_LOCATION_Y = false ;
      A387TBM32_LOCATION_X2 = (short)(0) ;
      n387TBM32_LOCATION_X2 = false ;
      A388TBM32_LOCATION_Y2 = (short)(0) ;
      n388TBM32_LOCATION_Y2 = false ;
      A389TBM32_TEXT_ALIGN_DIV = "" ;
      n389TBM32_TEXT_ALIGN_DIV = false ;
      A393TBM32_TEXT_MAXROWS = (byte)(0) ;
      n393TBM32_TEXT_MAXROWS = false ;
      A394TBM32_TEXT_MAXLENGTH = (short)(0) ;
      n394TBM32_TEXT_MAXLENGTH = false ;
      A395TBM32_DECIMAL_DIGITS = (byte)(0) ;
      n395TBM32_DECIMAL_DIGITS = false ;
      A399TBM32_CHK_TRUE_INNER_VALUE = "" ;
      n399TBM32_CHK_TRUE_INNER_VALUE = false ;
      A400TBM32_CHK_FALSE_INNER_VALUE = "" ;
      n400TBM32_CHK_FALSE_INNER_VALUE = false ;
      A404TBM32_FIXED_VALUE = "" ;
      n404TBM32_FIXED_VALUE = false ;
      A402TBM32_LIST_CD = "" ;
      n402TBM32_LIST_CD = false ;
      A403TBM32_IMAGE_CD = "" ;
      n403TBM32_IMAGE_CD = false ;
      A401TBM32_TEXT = "" ;
      n401TBM32_TEXT = false ;
      A390TBM32_FONT_SIZE = (byte)(0) ;
      n390TBM32_FONT_SIZE = false ;
      A391TBM32_FONT_UL_FLG = "" ;
      n391TBM32_FONT_UL_FLG = false ;
      A392TBM32_FONT_COLOR_DIV = 0 ;
      n392TBM32_FONT_COLOR_DIV = false ;
      A398TBM32_LINE_SIZE_DIV = (byte)(0) ;
      n398TBM32_LINE_SIZE_DIV = false ;
      A603TBM32_LINE_COLOR_DIV = 0 ;
      n603TBM32_LINE_COLOR_DIV = false ;
      A396TBM32_LINE_START_POINT_DIV = "" ;
      n396TBM32_LINE_START_POINT_DIV = false ;
      A397TBM32_LINE_END_POINT_DIV = "" ;
      n397TBM32_LINE_END_POINT_DIV = false ;
      A604TBM32_LINE_ANGLE = (short)(0) ;
      n604TBM32_LINE_ANGLE = false ;
      A552TBM32_AUTH_LVL_MIN = (byte)(0) ;
      n552TBM32_AUTH_LVL_MIN = false ;
      A553TBM32_ZORDER = (short)(0) ;
      n553TBM32_ZORDER = false ;
      A605TBM32_TAB_ORDER = (short)(0) ;
      n605TBM32_TAB_ORDER = false ;
      A606TBM32_TABSTOP_FLG = "" ;
      n606TBM32_TABSTOP_FLG = false ;
      A607TBM32_REQUIRED_INPUT_FLG = "" ;
      n607TBM32_REQUIRED_INPUT_FLG = false ;
      A608TBM32_MIN_VALUE = "" ;
      n608TBM32_MIN_VALUE = false ;
      A609TBM32_MAX_VALUE = "" ;
      n609TBM32_MAX_VALUE = false ;
      A237TBM32_CRF_ITEM_NOTE = "" ;
      n237TBM32_CRF_ITEM_NOTE = false ;
      A746TBM32_REF_CRF_ID = (short)(0) ;
      n746TBM32_REF_CRF_ID = false ;
      A747TBM32_REF_CRF_ITEM_CD = "" ;
      n747TBM32_REF_CRF_ITEM_CD = false ;
      A238TBM32_DEL_FLG = "" ;
      n238TBM32_DEL_FLG = false ;
      A241TBM32_CRT_PROG_NM = "" ;
      n241TBM32_CRT_PROG_NM = false ;
      A244TBM32_UPD_PROG_NM = "" ;
      n244TBM32_UPD_PROG_NM = false ;
      O245TBM32_UPD_CNT = A245TBM32_UPD_CNT ;
      n245TBM32_UPD_CNT = false ;
   }

   public void initAll0K19( )
   {
      A231TBM32_STUDY_ID = 0 ;
      A232TBM32_CRF_ID = (short)(0) ;
      A233TBM32_CRF_ITEM_CD = "" ;
      initializeNonKey0K19( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void VarsToRow19( SdtTBM32_CRF_ITEM obj19 )
   {
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Mode( Gx_mode );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime( A239TBM32_CRT_DATETIME );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_user_id( A240TBM32_CRT_USER_ID );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime( A242TBM32_UPD_DATETIME );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_user_id( A243TBM32_UPD_USER_ID );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_cnt( A245TBM32_UPD_CNT );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_nm( A234TBM32_CRF_ITEM_NM );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_div( A235TBM32_CRF_ITEM_DIV );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_cd( A236TBM32_CRF_ITEM_GRP_CD );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_order( A384TBM32_CRF_ITEM_GRP_ORDER );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x( A385TBM32_LOCATION_X );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y( A386TBM32_LOCATION_Y );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x2( A387TBM32_LOCATION_X2 );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y2( A388TBM32_LOCATION_Y2 );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_align_div( A389TBM32_TEXT_ALIGN_DIV );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxrows( A393TBM32_TEXT_MAXROWS );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxlength( A394TBM32_TEXT_MAXLENGTH );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_decimal_digits( A395TBM32_DECIMAL_DIGITS );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_true_inner_value( A399TBM32_CHK_TRUE_INNER_VALUE );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_false_inner_value( A400TBM32_CHK_FALSE_INNER_VALUE );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_fixed_value( A404TBM32_FIXED_VALUE );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_list_cd( A402TBM32_LIST_CD );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_image_cd( A403TBM32_IMAGE_CD );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text( A401TBM32_TEXT );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_size( A390TBM32_FONT_SIZE );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_ul_flg( A391TBM32_FONT_UL_FLG );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_color_div( A392TBM32_FONT_COLOR_DIV );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_size_div( A398TBM32_LINE_SIZE_DIV );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_color_div( A603TBM32_LINE_COLOR_DIV );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_start_point_div( A396TBM32_LINE_START_POINT_DIV );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_end_point_div( A397TBM32_LINE_END_POINT_DIV );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_angle( A604TBM32_LINE_ANGLE );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_auth_lvl_min( A552TBM32_AUTH_LVL_MIN );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_zorder( A553TBM32_ZORDER );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_tab_order( A605TBM32_TAB_ORDER );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_tabstop_flg( A606TBM32_TABSTOP_FLG );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_required_input_flg( A607TBM32_REQUIRED_INPUT_FLG );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_min_value( A608TBM32_MIN_VALUE );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_max_value( A609TBM32_MAX_VALUE );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_note( A237TBM32_CRF_ITEM_NOTE );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_id( A746TBM32_REF_CRF_ID );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_item_cd( A747TBM32_REF_CRF_ITEM_CD );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_del_flg( A238TBM32_DEL_FLG );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_prog_nm( A241TBM32_CRT_PROG_NM );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_prog_nm( A244TBM32_UPD_PROG_NM );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_study_id( A231TBM32_STUDY_ID );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_id( A232TBM32_CRF_ID );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_cd( A233TBM32_CRF_ITEM_CD );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_study_id_Z( Z231TBM32_STUDY_ID );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_id_Z( Z232TBM32_CRF_ID );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_cd_Z( Z233TBM32_CRF_ITEM_CD );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_nm_Z( Z234TBM32_CRF_ITEM_NM );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_div_Z( Z235TBM32_CRF_ITEM_DIV );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_cd_Z( Z236TBM32_CRF_ITEM_GRP_CD );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_order_Z( Z384TBM32_CRF_ITEM_GRP_ORDER );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x_Z( Z385TBM32_LOCATION_X );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y_Z( Z386TBM32_LOCATION_Y );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x2_Z( Z387TBM32_LOCATION_X2 );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y2_Z( Z388TBM32_LOCATION_Y2 );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_align_div_Z( Z389TBM32_TEXT_ALIGN_DIV );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxrows_Z( Z393TBM32_TEXT_MAXROWS );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxlength_Z( Z394TBM32_TEXT_MAXLENGTH );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_decimal_digits_Z( Z395TBM32_DECIMAL_DIGITS );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_true_inner_value_Z( Z399TBM32_CHK_TRUE_INNER_VALUE );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_false_inner_value_Z( Z400TBM32_CHK_FALSE_INNER_VALUE );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_fixed_value_Z( Z404TBM32_FIXED_VALUE );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_list_cd_Z( Z402TBM32_LIST_CD );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_image_cd_Z( Z403TBM32_IMAGE_CD );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_Z( Z401TBM32_TEXT );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_size_Z( Z390TBM32_FONT_SIZE );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_ul_flg_Z( Z391TBM32_FONT_UL_FLG );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_color_div_Z( Z392TBM32_FONT_COLOR_DIV );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_size_div_Z( Z398TBM32_LINE_SIZE_DIV );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_color_div_Z( Z603TBM32_LINE_COLOR_DIV );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_start_point_div_Z( Z396TBM32_LINE_START_POINT_DIV );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_end_point_div_Z( Z397TBM32_LINE_END_POINT_DIV );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_angle_Z( Z604TBM32_LINE_ANGLE );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_auth_lvl_min_Z( Z552TBM32_AUTH_LVL_MIN );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_zorder_Z( Z553TBM32_ZORDER );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_tab_order_Z( Z605TBM32_TAB_ORDER );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_tabstop_flg_Z( Z606TBM32_TABSTOP_FLG );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_required_input_flg_Z( Z607TBM32_REQUIRED_INPUT_FLG );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_min_value_Z( Z608TBM32_MIN_VALUE );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_max_value_Z( Z609TBM32_MAX_VALUE );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_note_Z( Z237TBM32_CRF_ITEM_NOTE );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_id_Z( Z746TBM32_REF_CRF_ID );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_item_cd_Z( Z747TBM32_REF_CRF_ITEM_CD );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_del_flg_Z( Z238TBM32_DEL_FLG );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime_Z( Z239TBM32_CRT_DATETIME );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_user_id_Z( Z240TBM32_CRT_USER_ID );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_prog_nm_Z( Z241TBM32_CRT_PROG_NM );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime_Z( Z242TBM32_UPD_DATETIME );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_user_id_Z( Z243TBM32_UPD_USER_ID );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_prog_nm_Z( Z244TBM32_UPD_PROG_NM );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_cnt_Z( Z245TBM32_UPD_CNT );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_nm_N( (byte)((byte)((n234TBM32_CRF_ITEM_NM)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_div_N( (byte)((byte)((n235TBM32_CRF_ITEM_DIV)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_cd_N( (byte)((byte)((n236TBM32_CRF_ITEM_GRP_CD)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_order_N( (byte)((byte)((n384TBM32_CRF_ITEM_GRP_ORDER)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x_N( (byte)((byte)((n385TBM32_LOCATION_X)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y_N( (byte)((byte)((n386TBM32_LOCATION_Y)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x2_N( (byte)((byte)((n387TBM32_LOCATION_X2)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y2_N( (byte)((byte)((n388TBM32_LOCATION_Y2)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_align_div_N( (byte)((byte)((n389TBM32_TEXT_ALIGN_DIV)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxrows_N( (byte)((byte)((n393TBM32_TEXT_MAXROWS)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxlength_N( (byte)((byte)((n394TBM32_TEXT_MAXLENGTH)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_decimal_digits_N( (byte)((byte)((n395TBM32_DECIMAL_DIGITS)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_true_inner_value_N( (byte)((byte)((n399TBM32_CHK_TRUE_INNER_VALUE)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_false_inner_value_N( (byte)((byte)((n400TBM32_CHK_FALSE_INNER_VALUE)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_fixed_value_N( (byte)((byte)((n404TBM32_FIXED_VALUE)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_list_cd_N( (byte)((byte)((n402TBM32_LIST_CD)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_image_cd_N( (byte)((byte)((n403TBM32_IMAGE_CD)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_N( (byte)((byte)((n401TBM32_TEXT)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_size_N( (byte)((byte)((n390TBM32_FONT_SIZE)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_ul_flg_N( (byte)((byte)((n391TBM32_FONT_UL_FLG)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_color_div_N( (byte)((byte)((n392TBM32_FONT_COLOR_DIV)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_size_div_N( (byte)((byte)((n398TBM32_LINE_SIZE_DIV)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_color_div_N( (byte)((byte)((n603TBM32_LINE_COLOR_DIV)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_start_point_div_N( (byte)((byte)((n396TBM32_LINE_START_POINT_DIV)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_end_point_div_N( (byte)((byte)((n397TBM32_LINE_END_POINT_DIV)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_angle_N( (byte)((byte)((n604TBM32_LINE_ANGLE)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_auth_lvl_min_N( (byte)((byte)((n552TBM32_AUTH_LVL_MIN)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_zorder_N( (byte)((byte)((n553TBM32_ZORDER)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_tab_order_N( (byte)((byte)((n605TBM32_TAB_ORDER)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_tabstop_flg_N( (byte)((byte)((n606TBM32_TABSTOP_FLG)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_required_input_flg_N( (byte)((byte)((n607TBM32_REQUIRED_INPUT_FLG)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_min_value_N( (byte)((byte)((n608TBM32_MIN_VALUE)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_max_value_N( (byte)((byte)((n609TBM32_MAX_VALUE)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_note_N( (byte)((byte)((n237TBM32_CRF_ITEM_NOTE)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_id_N( (byte)((byte)((n746TBM32_REF_CRF_ID)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_item_cd_N( (byte)((byte)((n747TBM32_REF_CRF_ITEM_CD)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_del_flg_N( (byte)((byte)((n238TBM32_DEL_FLG)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime_N( (byte)((byte)((n239TBM32_CRT_DATETIME)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_user_id_N( (byte)((byte)((n240TBM32_CRT_USER_ID)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_prog_nm_N( (byte)((byte)((n241TBM32_CRT_PROG_NM)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime_N( (byte)((byte)((n242TBM32_UPD_DATETIME)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_user_id_N( (byte)((byte)((n243TBM32_UPD_USER_ID)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_prog_nm_N( (byte)((byte)((n244TBM32_UPD_PROG_NM)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_cnt_N( (byte)((byte)((n245TBM32_UPD_CNT)?1:0)) );
      obj19.setgxTv_SdtTBM32_CRF_ITEM_Mode( Gx_mode );
   }

   public void RowToVars19( SdtTBM32_CRF_ITEM obj19 ,
                            int forceLoad )
   {
      Gx_mode = obj19.getgxTv_SdtTBM32_CRF_ITEM_Mode() ;
      A239TBM32_CRT_DATETIME = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime() ;
      n239TBM32_CRT_DATETIME = false ;
      A240TBM32_CRT_USER_ID = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_user_id() ;
      n240TBM32_CRT_USER_ID = false ;
      A242TBM32_UPD_DATETIME = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime() ;
      n242TBM32_UPD_DATETIME = false ;
      A243TBM32_UPD_USER_ID = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_user_id() ;
      n243TBM32_UPD_USER_ID = false ;
      A245TBM32_UPD_CNT = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_cnt() ;
      n245TBM32_UPD_CNT = false ;
      A234TBM32_CRF_ITEM_NM = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_nm() ;
      n234TBM32_CRF_ITEM_NM = false ;
      A235TBM32_CRF_ITEM_DIV = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_div() ;
      n235TBM32_CRF_ITEM_DIV = false ;
      A236TBM32_CRF_ITEM_GRP_CD = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_cd() ;
      n236TBM32_CRF_ITEM_GRP_CD = false ;
      A384TBM32_CRF_ITEM_GRP_ORDER = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_order() ;
      n384TBM32_CRF_ITEM_GRP_ORDER = false ;
      A385TBM32_LOCATION_X = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x() ;
      n385TBM32_LOCATION_X = false ;
      A386TBM32_LOCATION_Y = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y() ;
      n386TBM32_LOCATION_Y = false ;
      A387TBM32_LOCATION_X2 = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x2() ;
      n387TBM32_LOCATION_X2 = false ;
      A388TBM32_LOCATION_Y2 = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y2() ;
      n388TBM32_LOCATION_Y2 = false ;
      A389TBM32_TEXT_ALIGN_DIV = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_align_div() ;
      n389TBM32_TEXT_ALIGN_DIV = false ;
      A393TBM32_TEXT_MAXROWS = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxrows() ;
      n393TBM32_TEXT_MAXROWS = false ;
      A394TBM32_TEXT_MAXLENGTH = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxlength() ;
      n394TBM32_TEXT_MAXLENGTH = false ;
      A395TBM32_DECIMAL_DIGITS = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_decimal_digits() ;
      n395TBM32_DECIMAL_DIGITS = false ;
      A399TBM32_CHK_TRUE_INNER_VALUE = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_true_inner_value() ;
      n399TBM32_CHK_TRUE_INNER_VALUE = false ;
      A400TBM32_CHK_FALSE_INNER_VALUE = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_false_inner_value() ;
      n400TBM32_CHK_FALSE_INNER_VALUE = false ;
      A404TBM32_FIXED_VALUE = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_fixed_value() ;
      n404TBM32_FIXED_VALUE = false ;
      A402TBM32_LIST_CD = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_list_cd() ;
      n402TBM32_LIST_CD = false ;
      A403TBM32_IMAGE_CD = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_image_cd() ;
      n403TBM32_IMAGE_CD = false ;
      A401TBM32_TEXT = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_text() ;
      n401TBM32_TEXT = false ;
      A390TBM32_FONT_SIZE = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_size() ;
      n390TBM32_FONT_SIZE = false ;
      A391TBM32_FONT_UL_FLG = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_ul_flg() ;
      n391TBM32_FONT_UL_FLG = false ;
      A392TBM32_FONT_COLOR_DIV = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_color_div() ;
      n392TBM32_FONT_COLOR_DIV = false ;
      A398TBM32_LINE_SIZE_DIV = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_size_div() ;
      n398TBM32_LINE_SIZE_DIV = false ;
      A603TBM32_LINE_COLOR_DIV = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_color_div() ;
      n603TBM32_LINE_COLOR_DIV = false ;
      A396TBM32_LINE_START_POINT_DIV = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_start_point_div() ;
      n396TBM32_LINE_START_POINT_DIV = false ;
      A397TBM32_LINE_END_POINT_DIV = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_end_point_div() ;
      n397TBM32_LINE_END_POINT_DIV = false ;
      A604TBM32_LINE_ANGLE = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_angle() ;
      n604TBM32_LINE_ANGLE = false ;
      A552TBM32_AUTH_LVL_MIN = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_auth_lvl_min() ;
      n552TBM32_AUTH_LVL_MIN = false ;
      A553TBM32_ZORDER = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_zorder() ;
      n553TBM32_ZORDER = false ;
      A605TBM32_TAB_ORDER = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_tab_order() ;
      n605TBM32_TAB_ORDER = false ;
      A606TBM32_TABSTOP_FLG = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_tabstop_flg() ;
      n606TBM32_TABSTOP_FLG = false ;
      A607TBM32_REQUIRED_INPUT_FLG = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_required_input_flg() ;
      n607TBM32_REQUIRED_INPUT_FLG = false ;
      A608TBM32_MIN_VALUE = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_min_value() ;
      n608TBM32_MIN_VALUE = false ;
      A609TBM32_MAX_VALUE = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_max_value() ;
      n609TBM32_MAX_VALUE = false ;
      A237TBM32_CRF_ITEM_NOTE = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_note() ;
      n237TBM32_CRF_ITEM_NOTE = false ;
      A746TBM32_REF_CRF_ID = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_id() ;
      n746TBM32_REF_CRF_ID = false ;
      A747TBM32_REF_CRF_ITEM_CD = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_item_cd() ;
      n747TBM32_REF_CRF_ITEM_CD = false ;
      A238TBM32_DEL_FLG = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_del_flg() ;
      n238TBM32_DEL_FLG = false ;
      A241TBM32_CRT_PROG_NM = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_prog_nm() ;
      n241TBM32_CRT_PROG_NM = false ;
      A244TBM32_UPD_PROG_NM = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_prog_nm() ;
      n244TBM32_UPD_PROG_NM = false ;
      A231TBM32_STUDY_ID = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_study_id() ;
      A232TBM32_CRF_ID = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_id() ;
      A233TBM32_CRF_ITEM_CD = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_cd() ;
      Z231TBM32_STUDY_ID = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_study_id_Z() ;
      Z232TBM32_CRF_ID = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_id_Z() ;
      Z233TBM32_CRF_ITEM_CD = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_cd_Z() ;
      Z234TBM32_CRF_ITEM_NM = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_nm_Z() ;
      Z235TBM32_CRF_ITEM_DIV = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_div_Z() ;
      Z236TBM32_CRF_ITEM_GRP_CD = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_cd_Z() ;
      Z384TBM32_CRF_ITEM_GRP_ORDER = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_order_Z() ;
      Z385TBM32_LOCATION_X = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x_Z() ;
      Z386TBM32_LOCATION_Y = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y_Z() ;
      Z387TBM32_LOCATION_X2 = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x2_Z() ;
      Z388TBM32_LOCATION_Y2 = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y2_Z() ;
      Z389TBM32_TEXT_ALIGN_DIV = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_align_div_Z() ;
      Z393TBM32_TEXT_MAXROWS = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxrows_Z() ;
      Z394TBM32_TEXT_MAXLENGTH = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxlength_Z() ;
      Z395TBM32_DECIMAL_DIGITS = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_decimal_digits_Z() ;
      Z399TBM32_CHK_TRUE_INNER_VALUE = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_true_inner_value_Z() ;
      Z400TBM32_CHK_FALSE_INNER_VALUE = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_false_inner_value_Z() ;
      Z404TBM32_FIXED_VALUE = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_fixed_value_Z() ;
      Z402TBM32_LIST_CD = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_list_cd_Z() ;
      Z403TBM32_IMAGE_CD = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_image_cd_Z() ;
      Z401TBM32_TEXT = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_Z() ;
      Z390TBM32_FONT_SIZE = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_size_Z() ;
      Z391TBM32_FONT_UL_FLG = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_ul_flg_Z() ;
      Z392TBM32_FONT_COLOR_DIV = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_color_div_Z() ;
      Z398TBM32_LINE_SIZE_DIV = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_size_div_Z() ;
      Z603TBM32_LINE_COLOR_DIV = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_color_div_Z() ;
      Z396TBM32_LINE_START_POINT_DIV = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_start_point_div_Z() ;
      Z397TBM32_LINE_END_POINT_DIV = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_end_point_div_Z() ;
      Z604TBM32_LINE_ANGLE = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_angle_Z() ;
      Z552TBM32_AUTH_LVL_MIN = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_auth_lvl_min_Z() ;
      Z553TBM32_ZORDER = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_zorder_Z() ;
      Z605TBM32_TAB_ORDER = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_tab_order_Z() ;
      Z606TBM32_TABSTOP_FLG = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_tabstop_flg_Z() ;
      Z607TBM32_REQUIRED_INPUT_FLG = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_required_input_flg_Z() ;
      Z608TBM32_MIN_VALUE = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_min_value_Z() ;
      Z609TBM32_MAX_VALUE = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_max_value_Z() ;
      Z237TBM32_CRF_ITEM_NOTE = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_note_Z() ;
      Z746TBM32_REF_CRF_ID = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_id_Z() ;
      Z747TBM32_REF_CRF_ITEM_CD = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_item_cd_Z() ;
      Z238TBM32_DEL_FLG = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_del_flg_Z() ;
      Z239TBM32_CRT_DATETIME = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime_Z() ;
      Z240TBM32_CRT_USER_ID = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_user_id_Z() ;
      Z241TBM32_CRT_PROG_NM = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_prog_nm_Z() ;
      Z242TBM32_UPD_DATETIME = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime_Z() ;
      Z243TBM32_UPD_USER_ID = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_user_id_Z() ;
      Z244TBM32_UPD_PROG_NM = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_prog_nm_Z() ;
      Z245TBM32_UPD_CNT = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_cnt_Z() ;
      O245TBM32_UPD_CNT = obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_cnt_Z() ;
      n234TBM32_CRF_ITEM_NM = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_nm_N()==0)?false:true) ;
      n235TBM32_CRF_ITEM_DIV = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_div_N()==0)?false:true) ;
      n236TBM32_CRF_ITEM_GRP_CD = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_cd_N()==0)?false:true) ;
      n384TBM32_CRF_ITEM_GRP_ORDER = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_order_N()==0)?false:true) ;
      n385TBM32_LOCATION_X = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x_N()==0)?false:true) ;
      n386TBM32_LOCATION_Y = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y_N()==0)?false:true) ;
      n387TBM32_LOCATION_X2 = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x2_N()==0)?false:true) ;
      n388TBM32_LOCATION_Y2 = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y2_N()==0)?false:true) ;
      n389TBM32_TEXT_ALIGN_DIV = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_align_div_N()==0)?false:true) ;
      n393TBM32_TEXT_MAXROWS = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxrows_N()==0)?false:true) ;
      n394TBM32_TEXT_MAXLENGTH = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxlength_N()==0)?false:true) ;
      n395TBM32_DECIMAL_DIGITS = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_decimal_digits_N()==0)?false:true) ;
      n399TBM32_CHK_TRUE_INNER_VALUE = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_true_inner_value_N()==0)?false:true) ;
      n400TBM32_CHK_FALSE_INNER_VALUE = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_false_inner_value_N()==0)?false:true) ;
      n404TBM32_FIXED_VALUE = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_fixed_value_N()==0)?false:true) ;
      n402TBM32_LIST_CD = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_list_cd_N()==0)?false:true) ;
      n403TBM32_IMAGE_CD = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_image_cd_N()==0)?false:true) ;
      n401TBM32_TEXT = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_N()==0)?false:true) ;
      n390TBM32_FONT_SIZE = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_size_N()==0)?false:true) ;
      n391TBM32_FONT_UL_FLG = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_ul_flg_N()==0)?false:true) ;
      n392TBM32_FONT_COLOR_DIV = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_color_div_N()==0)?false:true) ;
      n398TBM32_LINE_SIZE_DIV = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_size_div_N()==0)?false:true) ;
      n603TBM32_LINE_COLOR_DIV = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_color_div_N()==0)?false:true) ;
      n396TBM32_LINE_START_POINT_DIV = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_start_point_div_N()==0)?false:true) ;
      n397TBM32_LINE_END_POINT_DIV = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_end_point_div_N()==0)?false:true) ;
      n604TBM32_LINE_ANGLE = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_angle_N()==0)?false:true) ;
      n552TBM32_AUTH_LVL_MIN = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_auth_lvl_min_N()==0)?false:true) ;
      n553TBM32_ZORDER = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_zorder_N()==0)?false:true) ;
      n605TBM32_TAB_ORDER = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_tab_order_N()==0)?false:true) ;
      n606TBM32_TABSTOP_FLG = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_tabstop_flg_N()==0)?false:true) ;
      n607TBM32_REQUIRED_INPUT_FLG = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_required_input_flg_N()==0)?false:true) ;
      n608TBM32_MIN_VALUE = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_min_value_N()==0)?false:true) ;
      n609TBM32_MAX_VALUE = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_max_value_N()==0)?false:true) ;
      n237TBM32_CRF_ITEM_NOTE = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_note_N()==0)?false:true) ;
      n746TBM32_REF_CRF_ID = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_id_N()==0)?false:true) ;
      n747TBM32_REF_CRF_ITEM_CD = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_item_cd_N()==0)?false:true) ;
      n238TBM32_DEL_FLG = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_del_flg_N()==0)?false:true) ;
      n239TBM32_CRT_DATETIME = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime_N()==0)?false:true) ;
      n240TBM32_CRT_USER_ID = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_user_id_N()==0)?false:true) ;
      n241TBM32_CRT_PROG_NM = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_prog_nm_N()==0)?false:true) ;
      n242TBM32_UPD_DATETIME = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime_N()==0)?false:true) ;
      n243TBM32_UPD_USER_ID = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_user_id_N()==0)?false:true) ;
      n244TBM32_UPD_PROG_NM = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_prog_nm_N()==0)?false:true) ;
      n245TBM32_UPD_CNT = (boolean)((obj19.getgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_cnt_N()==0)?false:true) ;
      Gx_mode = obj19.getgxTv_SdtTBM32_CRF_ITEM_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A231TBM32_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      A232TBM32_CRF_ID = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.SHORT)).shortValue() ;
      A233TBM32_CRF_ITEM_CD = (String)getParm(obj,2) ;
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
         Z231TBM32_STUDY_ID = A231TBM32_STUDY_ID ;
         Z232TBM32_CRF_ID = A232TBM32_CRF_ID ;
         Z233TBM32_CRF_ITEM_CD = A233TBM32_CRF_ITEM_CD ;
         O245TBM32_UPD_CNT = A245TBM32_UPD_CNT ;
         n245TBM32_UPD_CNT = false ;
      }
      zm0K19( -8) ;
      sMode19 = Gx_mode ;
      Gx_mode = "DSP" ;
      onLoadActions0K19( ) ;
      Gx_mode = sMode19 ;
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
      if ( RcdFound19 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( A231TBM32_STUDY_ID != Z231TBM32_STUDY_ID ) || ( A232TBM32_CRF_ID != Z232TBM32_CRF_ID ) || ( GXutil.strcmp(A233TBM32_CRF_ITEM_CD, Z233TBM32_CRF_ITEM_CD) != 0 ) )
         {
            A231TBM32_STUDY_ID = Z231TBM32_STUDY_ID ;
            A232TBM32_CRF_ID = Z232TBM32_CRF_ID ;
            A233TBM32_CRF_ITEM_CD = Z233TBM32_CRF_ITEM_CD ;
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
            if ( ( A231TBM32_STUDY_ID != Z231TBM32_STUDY_ID ) || ( A232TBM32_CRF_ID != Z232TBM32_CRF_ID ) || ( GXutil.strcmp(A233TBM32_CRF_ITEM_CD, Z233TBM32_CRF_ITEM_CD) != 0 ) )
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
         else if ( ( A231TBM32_STUDY_ID != Z231TBM32_STUDY_ID ) || ( A232TBM32_CRF_ID != Z232TBM32_CRF_ID ) || ( GXutil.strcmp(A233TBM32_CRF_ITEM_CD, Z233TBM32_CRF_ITEM_CD) != 0 ) )
         {
            A231TBM32_STUDY_ID = Z231TBM32_STUDY_ID ;
            A232TBM32_CRF_ID = Z232TBM32_CRF_ID ;
            A233TBM32_CRF_ITEM_CD = Z233TBM32_CRF_ITEM_CD ;
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
         if ( ( A231TBM32_STUDY_ID != Z231TBM32_STUDY_ID ) || ( A232TBM32_CRF_ID != Z232TBM32_CRF_ID ) || ( GXutil.strcmp(A233TBM32_CRF_ITEM_CD, Z233TBM32_CRF_ITEM_CD) != 0 ) )
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
                  /* Execute user subroutine: S11100 */
                  S11100 ();
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
      Z233TBM32_CRF_ITEM_CD = "" ;
      A233TBM32_CRF_ITEM_CD = "" ;
      AV8W_BC_FLG = "" ;
      AV9Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV7W_TXT = "" ;
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
      A239TBM32_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A240TBM32_CRT_USER_ID = "" ;
      A241TBM32_CRT_PROG_NM = "" ;
      A242TBM32_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A243TBM32_UPD_USER_ID = "" ;
      A244TBM32_UPD_PROG_NM = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_cd_Z = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_nm_Z = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_div_Z = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_cd_Z = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_align_div_Z = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_true_inner_value_Z = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_false_inner_value_Z = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_fixed_value_Z = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_list_cd_Z = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_image_cd_Z = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_Z = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_ul_flg_Z = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_start_point_div_Z = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_end_point_div_Z = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_tabstop_flg_Z = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_required_input_flg_Z = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_min_value_Z = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_max_value_Z = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_note_Z = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_item_cd_Z = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_del_flg_Z = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_user_id_Z = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_prog_nm_Z = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_user_id_Z = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_prog_nm_Z = "" ;
      Z239TBM32_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z240TBM32_CRT_USER_ID = "" ;
      Z242TBM32_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z243TBM32_UPD_USER_ID = "" ;
      Z234TBM32_CRF_ITEM_NM = "" ;
      Z235TBM32_CRF_ITEM_DIV = "" ;
      Z236TBM32_CRF_ITEM_GRP_CD = "" ;
      Z389TBM32_TEXT_ALIGN_DIV = "" ;
      Z399TBM32_CHK_TRUE_INNER_VALUE = "" ;
      Z400TBM32_CHK_FALSE_INNER_VALUE = "" ;
      Z404TBM32_FIXED_VALUE = "" ;
      Z402TBM32_LIST_CD = "" ;
      Z403TBM32_IMAGE_CD = "" ;
      Z401TBM32_TEXT = "" ;
      Z391TBM32_FONT_UL_FLG = "" ;
      Z396TBM32_LINE_START_POINT_DIV = "" ;
      Z397TBM32_LINE_END_POINT_DIV = "" ;
      Z606TBM32_TABSTOP_FLG = "" ;
      Z607TBM32_REQUIRED_INPUT_FLG = "" ;
      Z608TBM32_MIN_VALUE = "" ;
      Z609TBM32_MAX_VALUE = "" ;
      Z237TBM32_CRF_ITEM_NOTE = "" ;
      Z747TBM32_REF_CRF_ITEM_CD = "" ;
      Z238TBM32_DEL_FLG = "" ;
      Z241TBM32_CRT_PROG_NM = "" ;
      Z244TBM32_UPD_PROG_NM = "" ;
      BC000K4_A231TBM32_STUDY_ID = new long[1] ;
      BC000K4_A232TBM32_CRF_ID = new short[1] ;
      BC000K4_A233TBM32_CRF_ITEM_CD = new String[] {""} ;
      BC000K4_A239TBM32_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000K4_n239TBM32_CRT_DATETIME = new boolean[] {false} ;
      BC000K4_A240TBM32_CRT_USER_ID = new String[] {""} ;
      BC000K4_n240TBM32_CRT_USER_ID = new boolean[] {false} ;
      BC000K4_A242TBM32_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000K4_n242TBM32_UPD_DATETIME = new boolean[] {false} ;
      BC000K4_A243TBM32_UPD_USER_ID = new String[] {""} ;
      BC000K4_n243TBM32_UPD_USER_ID = new boolean[] {false} ;
      BC000K4_A245TBM32_UPD_CNT = new long[1] ;
      BC000K4_n245TBM32_UPD_CNT = new boolean[] {false} ;
      BC000K4_A234TBM32_CRF_ITEM_NM = new String[] {""} ;
      BC000K4_n234TBM32_CRF_ITEM_NM = new boolean[] {false} ;
      BC000K4_A235TBM32_CRF_ITEM_DIV = new String[] {""} ;
      BC000K4_n235TBM32_CRF_ITEM_DIV = new boolean[] {false} ;
      BC000K4_A236TBM32_CRF_ITEM_GRP_CD = new String[] {""} ;
      BC000K4_n236TBM32_CRF_ITEM_GRP_CD = new boolean[] {false} ;
      BC000K4_A384TBM32_CRF_ITEM_GRP_ORDER = new short[1] ;
      BC000K4_n384TBM32_CRF_ITEM_GRP_ORDER = new boolean[] {false} ;
      BC000K4_A385TBM32_LOCATION_X = new short[1] ;
      BC000K4_n385TBM32_LOCATION_X = new boolean[] {false} ;
      BC000K4_A386TBM32_LOCATION_Y = new short[1] ;
      BC000K4_n386TBM32_LOCATION_Y = new boolean[] {false} ;
      BC000K4_A387TBM32_LOCATION_X2 = new short[1] ;
      BC000K4_n387TBM32_LOCATION_X2 = new boolean[] {false} ;
      BC000K4_A388TBM32_LOCATION_Y2 = new short[1] ;
      BC000K4_n388TBM32_LOCATION_Y2 = new boolean[] {false} ;
      BC000K4_A389TBM32_TEXT_ALIGN_DIV = new String[] {""} ;
      BC000K4_n389TBM32_TEXT_ALIGN_DIV = new boolean[] {false} ;
      BC000K4_A393TBM32_TEXT_MAXROWS = new byte[1] ;
      BC000K4_n393TBM32_TEXT_MAXROWS = new boolean[] {false} ;
      BC000K4_A394TBM32_TEXT_MAXLENGTH = new short[1] ;
      BC000K4_n394TBM32_TEXT_MAXLENGTH = new boolean[] {false} ;
      BC000K4_A395TBM32_DECIMAL_DIGITS = new byte[1] ;
      BC000K4_n395TBM32_DECIMAL_DIGITS = new boolean[] {false} ;
      BC000K4_A399TBM32_CHK_TRUE_INNER_VALUE = new String[] {""} ;
      BC000K4_n399TBM32_CHK_TRUE_INNER_VALUE = new boolean[] {false} ;
      BC000K4_A400TBM32_CHK_FALSE_INNER_VALUE = new String[] {""} ;
      BC000K4_n400TBM32_CHK_FALSE_INNER_VALUE = new boolean[] {false} ;
      BC000K4_A404TBM32_FIXED_VALUE = new String[] {""} ;
      BC000K4_n404TBM32_FIXED_VALUE = new boolean[] {false} ;
      BC000K4_A402TBM32_LIST_CD = new String[] {""} ;
      BC000K4_n402TBM32_LIST_CD = new boolean[] {false} ;
      BC000K4_A403TBM32_IMAGE_CD = new String[] {""} ;
      BC000K4_n403TBM32_IMAGE_CD = new boolean[] {false} ;
      BC000K4_A401TBM32_TEXT = new String[] {""} ;
      BC000K4_n401TBM32_TEXT = new boolean[] {false} ;
      BC000K4_A390TBM32_FONT_SIZE = new byte[1] ;
      BC000K4_n390TBM32_FONT_SIZE = new boolean[] {false} ;
      BC000K4_A391TBM32_FONT_UL_FLG = new String[] {""} ;
      BC000K4_n391TBM32_FONT_UL_FLG = new boolean[] {false} ;
      BC000K4_A392TBM32_FONT_COLOR_DIV = new long[1] ;
      BC000K4_n392TBM32_FONT_COLOR_DIV = new boolean[] {false} ;
      BC000K4_A398TBM32_LINE_SIZE_DIV = new byte[1] ;
      BC000K4_n398TBM32_LINE_SIZE_DIV = new boolean[] {false} ;
      BC000K4_A603TBM32_LINE_COLOR_DIV = new long[1] ;
      BC000K4_n603TBM32_LINE_COLOR_DIV = new boolean[] {false} ;
      BC000K4_A396TBM32_LINE_START_POINT_DIV = new String[] {""} ;
      BC000K4_n396TBM32_LINE_START_POINT_DIV = new boolean[] {false} ;
      BC000K4_A397TBM32_LINE_END_POINT_DIV = new String[] {""} ;
      BC000K4_n397TBM32_LINE_END_POINT_DIV = new boolean[] {false} ;
      BC000K4_A604TBM32_LINE_ANGLE = new short[1] ;
      BC000K4_n604TBM32_LINE_ANGLE = new boolean[] {false} ;
      BC000K4_A552TBM32_AUTH_LVL_MIN = new byte[1] ;
      BC000K4_n552TBM32_AUTH_LVL_MIN = new boolean[] {false} ;
      BC000K4_A553TBM32_ZORDER = new short[1] ;
      BC000K4_n553TBM32_ZORDER = new boolean[] {false} ;
      BC000K4_A605TBM32_TAB_ORDER = new short[1] ;
      BC000K4_n605TBM32_TAB_ORDER = new boolean[] {false} ;
      BC000K4_A606TBM32_TABSTOP_FLG = new String[] {""} ;
      BC000K4_n606TBM32_TABSTOP_FLG = new boolean[] {false} ;
      BC000K4_A607TBM32_REQUIRED_INPUT_FLG = new String[] {""} ;
      BC000K4_n607TBM32_REQUIRED_INPUT_FLG = new boolean[] {false} ;
      BC000K4_A608TBM32_MIN_VALUE = new String[] {""} ;
      BC000K4_n608TBM32_MIN_VALUE = new boolean[] {false} ;
      BC000K4_A609TBM32_MAX_VALUE = new String[] {""} ;
      BC000K4_n609TBM32_MAX_VALUE = new boolean[] {false} ;
      BC000K4_A237TBM32_CRF_ITEM_NOTE = new String[] {""} ;
      BC000K4_n237TBM32_CRF_ITEM_NOTE = new boolean[] {false} ;
      BC000K4_A746TBM32_REF_CRF_ID = new short[1] ;
      BC000K4_n746TBM32_REF_CRF_ID = new boolean[] {false} ;
      BC000K4_A747TBM32_REF_CRF_ITEM_CD = new String[] {""} ;
      BC000K4_n747TBM32_REF_CRF_ITEM_CD = new boolean[] {false} ;
      BC000K4_A238TBM32_DEL_FLG = new String[] {""} ;
      BC000K4_n238TBM32_DEL_FLG = new boolean[] {false} ;
      BC000K4_A241TBM32_CRT_PROG_NM = new String[] {""} ;
      BC000K4_n241TBM32_CRT_PROG_NM = new boolean[] {false} ;
      BC000K4_A244TBM32_UPD_PROG_NM = new String[] {""} ;
      BC000K4_n244TBM32_UPD_PROG_NM = new boolean[] {false} ;
      BC000K5_A231TBM32_STUDY_ID = new long[1] ;
      BC000K5_A232TBM32_CRF_ID = new short[1] ;
      BC000K5_A233TBM32_CRF_ITEM_CD = new String[] {""} ;
      BC000K3_A231TBM32_STUDY_ID = new long[1] ;
      BC000K3_A232TBM32_CRF_ID = new short[1] ;
      BC000K3_A233TBM32_CRF_ITEM_CD = new String[] {""} ;
      BC000K3_A239TBM32_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000K3_n239TBM32_CRT_DATETIME = new boolean[] {false} ;
      BC000K3_A240TBM32_CRT_USER_ID = new String[] {""} ;
      BC000K3_n240TBM32_CRT_USER_ID = new boolean[] {false} ;
      BC000K3_A242TBM32_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000K3_n242TBM32_UPD_DATETIME = new boolean[] {false} ;
      BC000K3_A243TBM32_UPD_USER_ID = new String[] {""} ;
      BC000K3_n243TBM32_UPD_USER_ID = new boolean[] {false} ;
      BC000K3_A245TBM32_UPD_CNT = new long[1] ;
      BC000K3_n245TBM32_UPD_CNT = new boolean[] {false} ;
      BC000K3_A234TBM32_CRF_ITEM_NM = new String[] {""} ;
      BC000K3_n234TBM32_CRF_ITEM_NM = new boolean[] {false} ;
      BC000K3_A235TBM32_CRF_ITEM_DIV = new String[] {""} ;
      BC000K3_n235TBM32_CRF_ITEM_DIV = new boolean[] {false} ;
      BC000K3_A236TBM32_CRF_ITEM_GRP_CD = new String[] {""} ;
      BC000K3_n236TBM32_CRF_ITEM_GRP_CD = new boolean[] {false} ;
      BC000K3_A384TBM32_CRF_ITEM_GRP_ORDER = new short[1] ;
      BC000K3_n384TBM32_CRF_ITEM_GRP_ORDER = new boolean[] {false} ;
      BC000K3_A385TBM32_LOCATION_X = new short[1] ;
      BC000K3_n385TBM32_LOCATION_X = new boolean[] {false} ;
      BC000K3_A386TBM32_LOCATION_Y = new short[1] ;
      BC000K3_n386TBM32_LOCATION_Y = new boolean[] {false} ;
      BC000K3_A387TBM32_LOCATION_X2 = new short[1] ;
      BC000K3_n387TBM32_LOCATION_X2 = new boolean[] {false} ;
      BC000K3_A388TBM32_LOCATION_Y2 = new short[1] ;
      BC000K3_n388TBM32_LOCATION_Y2 = new boolean[] {false} ;
      BC000K3_A389TBM32_TEXT_ALIGN_DIV = new String[] {""} ;
      BC000K3_n389TBM32_TEXT_ALIGN_DIV = new boolean[] {false} ;
      BC000K3_A393TBM32_TEXT_MAXROWS = new byte[1] ;
      BC000K3_n393TBM32_TEXT_MAXROWS = new boolean[] {false} ;
      BC000K3_A394TBM32_TEXT_MAXLENGTH = new short[1] ;
      BC000K3_n394TBM32_TEXT_MAXLENGTH = new boolean[] {false} ;
      BC000K3_A395TBM32_DECIMAL_DIGITS = new byte[1] ;
      BC000K3_n395TBM32_DECIMAL_DIGITS = new boolean[] {false} ;
      BC000K3_A399TBM32_CHK_TRUE_INNER_VALUE = new String[] {""} ;
      BC000K3_n399TBM32_CHK_TRUE_INNER_VALUE = new boolean[] {false} ;
      BC000K3_A400TBM32_CHK_FALSE_INNER_VALUE = new String[] {""} ;
      BC000K3_n400TBM32_CHK_FALSE_INNER_VALUE = new boolean[] {false} ;
      BC000K3_A404TBM32_FIXED_VALUE = new String[] {""} ;
      BC000K3_n404TBM32_FIXED_VALUE = new boolean[] {false} ;
      BC000K3_A402TBM32_LIST_CD = new String[] {""} ;
      BC000K3_n402TBM32_LIST_CD = new boolean[] {false} ;
      BC000K3_A403TBM32_IMAGE_CD = new String[] {""} ;
      BC000K3_n403TBM32_IMAGE_CD = new boolean[] {false} ;
      BC000K3_A401TBM32_TEXT = new String[] {""} ;
      BC000K3_n401TBM32_TEXT = new boolean[] {false} ;
      BC000K3_A390TBM32_FONT_SIZE = new byte[1] ;
      BC000K3_n390TBM32_FONT_SIZE = new boolean[] {false} ;
      BC000K3_A391TBM32_FONT_UL_FLG = new String[] {""} ;
      BC000K3_n391TBM32_FONT_UL_FLG = new boolean[] {false} ;
      BC000K3_A392TBM32_FONT_COLOR_DIV = new long[1] ;
      BC000K3_n392TBM32_FONT_COLOR_DIV = new boolean[] {false} ;
      BC000K3_A398TBM32_LINE_SIZE_DIV = new byte[1] ;
      BC000K3_n398TBM32_LINE_SIZE_DIV = new boolean[] {false} ;
      BC000K3_A603TBM32_LINE_COLOR_DIV = new long[1] ;
      BC000K3_n603TBM32_LINE_COLOR_DIV = new boolean[] {false} ;
      BC000K3_A396TBM32_LINE_START_POINT_DIV = new String[] {""} ;
      BC000K3_n396TBM32_LINE_START_POINT_DIV = new boolean[] {false} ;
      BC000K3_A397TBM32_LINE_END_POINT_DIV = new String[] {""} ;
      BC000K3_n397TBM32_LINE_END_POINT_DIV = new boolean[] {false} ;
      BC000K3_A604TBM32_LINE_ANGLE = new short[1] ;
      BC000K3_n604TBM32_LINE_ANGLE = new boolean[] {false} ;
      BC000K3_A552TBM32_AUTH_LVL_MIN = new byte[1] ;
      BC000K3_n552TBM32_AUTH_LVL_MIN = new boolean[] {false} ;
      BC000K3_A553TBM32_ZORDER = new short[1] ;
      BC000K3_n553TBM32_ZORDER = new boolean[] {false} ;
      BC000K3_A605TBM32_TAB_ORDER = new short[1] ;
      BC000K3_n605TBM32_TAB_ORDER = new boolean[] {false} ;
      BC000K3_A606TBM32_TABSTOP_FLG = new String[] {""} ;
      BC000K3_n606TBM32_TABSTOP_FLG = new boolean[] {false} ;
      BC000K3_A607TBM32_REQUIRED_INPUT_FLG = new String[] {""} ;
      BC000K3_n607TBM32_REQUIRED_INPUT_FLG = new boolean[] {false} ;
      BC000K3_A608TBM32_MIN_VALUE = new String[] {""} ;
      BC000K3_n608TBM32_MIN_VALUE = new boolean[] {false} ;
      BC000K3_A609TBM32_MAX_VALUE = new String[] {""} ;
      BC000K3_n609TBM32_MAX_VALUE = new boolean[] {false} ;
      BC000K3_A237TBM32_CRF_ITEM_NOTE = new String[] {""} ;
      BC000K3_n237TBM32_CRF_ITEM_NOTE = new boolean[] {false} ;
      BC000K3_A746TBM32_REF_CRF_ID = new short[1] ;
      BC000K3_n746TBM32_REF_CRF_ID = new boolean[] {false} ;
      BC000K3_A747TBM32_REF_CRF_ITEM_CD = new String[] {""} ;
      BC000K3_n747TBM32_REF_CRF_ITEM_CD = new boolean[] {false} ;
      BC000K3_A238TBM32_DEL_FLG = new String[] {""} ;
      BC000K3_n238TBM32_DEL_FLG = new boolean[] {false} ;
      BC000K3_A241TBM32_CRT_PROG_NM = new String[] {""} ;
      BC000K3_n241TBM32_CRT_PROG_NM = new boolean[] {false} ;
      BC000K3_A244TBM32_UPD_PROG_NM = new String[] {""} ;
      BC000K3_n244TBM32_UPD_PROG_NM = new boolean[] {false} ;
      sMode19 = "" ;
      BC000K2_A231TBM32_STUDY_ID = new long[1] ;
      BC000K2_A232TBM32_CRF_ID = new short[1] ;
      BC000K2_A233TBM32_CRF_ITEM_CD = new String[] {""} ;
      BC000K2_A239TBM32_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000K2_n239TBM32_CRT_DATETIME = new boolean[] {false} ;
      BC000K2_A240TBM32_CRT_USER_ID = new String[] {""} ;
      BC000K2_n240TBM32_CRT_USER_ID = new boolean[] {false} ;
      BC000K2_A242TBM32_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000K2_n242TBM32_UPD_DATETIME = new boolean[] {false} ;
      BC000K2_A243TBM32_UPD_USER_ID = new String[] {""} ;
      BC000K2_n243TBM32_UPD_USER_ID = new boolean[] {false} ;
      BC000K2_A245TBM32_UPD_CNT = new long[1] ;
      BC000K2_n245TBM32_UPD_CNT = new boolean[] {false} ;
      BC000K2_A234TBM32_CRF_ITEM_NM = new String[] {""} ;
      BC000K2_n234TBM32_CRF_ITEM_NM = new boolean[] {false} ;
      BC000K2_A235TBM32_CRF_ITEM_DIV = new String[] {""} ;
      BC000K2_n235TBM32_CRF_ITEM_DIV = new boolean[] {false} ;
      BC000K2_A236TBM32_CRF_ITEM_GRP_CD = new String[] {""} ;
      BC000K2_n236TBM32_CRF_ITEM_GRP_CD = new boolean[] {false} ;
      BC000K2_A384TBM32_CRF_ITEM_GRP_ORDER = new short[1] ;
      BC000K2_n384TBM32_CRF_ITEM_GRP_ORDER = new boolean[] {false} ;
      BC000K2_A385TBM32_LOCATION_X = new short[1] ;
      BC000K2_n385TBM32_LOCATION_X = new boolean[] {false} ;
      BC000K2_A386TBM32_LOCATION_Y = new short[1] ;
      BC000K2_n386TBM32_LOCATION_Y = new boolean[] {false} ;
      BC000K2_A387TBM32_LOCATION_X2 = new short[1] ;
      BC000K2_n387TBM32_LOCATION_X2 = new boolean[] {false} ;
      BC000K2_A388TBM32_LOCATION_Y2 = new short[1] ;
      BC000K2_n388TBM32_LOCATION_Y2 = new boolean[] {false} ;
      BC000K2_A389TBM32_TEXT_ALIGN_DIV = new String[] {""} ;
      BC000K2_n389TBM32_TEXT_ALIGN_DIV = new boolean[] {false} ;
      BC000K2_A393TBM32_TEXT_MAXROWS = new byte[1] ;
      BC000K2_n393TBM32_TEXT_MAXROWS = new boolean[] {false} ;
      BC000K2_A394TBM32_TEXT_MAXLENGTH = new short[1] ;
      BC000K2_n394TBM32_TEXT_MAXLENGTH = new boolean[] {false} ;
      BC000K2_A395TBM32_DECIMAL_DIGITS = new byte[1] ;
      BC000K2_n395TBM32_DECIMAL_DIGITS = new boolean[] {false} ;
      BC000K2_A399TBM32_CHK_TRUE_INNER_VALUE = new String[] {""} ;
      BC000K2_n399TBM32_CHK_TRUE_INNER_VALUE = new boolean[] {false} ;
      BC000K2_A400TBM32_CHK_FALSE_INNER_VALUE = new String[] {""} ;
      BC000K2_n400TBM32_CHK_FALSE_INNER_VALUE = new boolean[] {false} ;
      BC000K2_A404TBM32_FIXED_VALUE = new String[] {""} ;
      BC000K2_n404TBM32_FIXED_VALUE = new boolean[] {false} ;
      BC000K2_A402TBM32_LIST_CD = new String[] {""} ;
      BC000K2_n402TBM32_LIST_CD = new boolean[] {false} ;
      BC000K2_A403TBM32_IMAGE_CD = new String[] {""} ;
      BC000K2_n403TBM32_IMAGE_CD = new boolean[] {false} ;
      BC000K2_A401TBM32_TEXT = new String[] {""} ;
      BC000K2_n401TBM32_TEXT = new boolean[] {false} ;
      BC000K2_A390TBM32_FONT_SIZE = new byte[1] ;
      BC000K2_n390TBM32_FONT_SIZE = new boolean[] {false} ;
      BC000K2_A391TBM32_FONT_UL_FLG = new String[] {""} ;
      BC000K2_n391TBM32_FONT_UL_FLG = new boolean[] {false} ;
      BC000K2_A392TBM32_FONT_COLOR_DIV = new long[1] ;
      BC000K2_n392TBM32_FONT_COLOR_DIV = new boolean[] {false} ;
      BC000K2_A398TBM32_LINE_SIZE_DIV = new byte[1] ;
      BC000K2_n398TBM32_LINE_SIZE_DIV = new boolean[] {false} ;
      BC000K2_A603TBM32_LINE_COLOR_DIV = new long[1] ;
      BC000K2_n603TBM32_LINE_COLOR_DIV = new boolean[] {false} ;
      BC000K2_A396TBM32_LINE_START_POINT_DIV = new String[] {""} ;
      BC000K2_n396TBM32_LINE_START_POINT_DIV = new boolean[] {false} ;
      BC000K2_A397TBM32_LINE_END_POINT_DIV = new String[] {""} ;
      BC000K2_n397TBM32_LINE_END_POINT_DIV = new boolean[] {false} ;
      BC000K2_A604TBM32_LINE_ANGLE = new short[1] ;
      BC000K2_n604TBM32_LINE_ANGLE = new boolean[] {false} ;
      BC000K2_A552TBM32_AUTH_LVL_MIN = new byte[1] ;
      BC000K2_n552TBM32_AUTH_LVL_MIN = new boolean[] {false} ;
      BC000K2_A553TBM32_ZORDER = new short[1] ;
      BC000K2_n553TBM32_ZORDER = new boolean[] {false} ;
      BC000K2_A605TBM32_TAB_ORDER = new short[1] ;
      BC000K2_n605TBM32_TAB_ORDER = new boolean[] {false} ;
      BC000K2_A606TBM32_TABSTOP_FLG = new String[] {""} ;
      BC000K2_n606TBM32_TABSTOP_FLG = new boolean[] {false} ;
      BC000K2_A607TBM32_REQUIRED_INPUT_FLG = new String[] {""} ;
      BC000K2_n607TBM32_REQUIRED_INPUT_FLG = new boolean[] {false} ;
      BC000K2_A608TBM32_MIN_VALUE = new String[] {""} ;
      BC000K2_n608TBM32_MIN_VALUE = new boolean[] {false} ;
      BC000K2_A609TBM32_MAX_VALUE = new String[] {""} ;
      BC000K2_n609TBM32_MAX_VALUE = new boolean[] {false} ;
      BC000K2_A237TBM32_CRF_ITEM_NOTE = new String[] {""} ;
      BC000K2_n237TBM32_CRF_ITEM_NOTE = new boolean[] {false} ;
      BC000K2_A746TBM32_REF_CRF_ID = new short[1] ;
      BC000K2_n746TBM32_REF_CRF_ID = new boolean[] {false} ;
      BC000K2_A747TBM32_REF_CRF_ITEM_CD = new String[] {""} ;
      BC000K2_n747TBM32_REF_CRF_ITEM_CD = new boolean[] {false} ;
      BC000K2_A238TBM32_DEL_FLG = new String[] {""} ;
      BC000K2_n238TBM32_DEL_FLG = new boolean[] {false} ;
      BC000K2_A241TBM32_CRT_PROG_NM = new String[] {""} ;
      BC000K2_n241TBM32_CRT_PROG_NM = new boolean[] {false} ;
      BC000K2_A244TBM32_UPD_PROG_NM = new String[] {""} ;
      BC000K2_n244TBM32_UPD_PROG_NM = new boolean[] {false} ;
      BC000K9_A231TBM32_STUDY_ID = new long[1] ;
      BC000K9_A232TBM32_CRF_ID = new short[1] ;
      BC000K9_A233TBM32_CRF_ITEM_CD = new String[] {""} ;
      BC000K9_A239TBM32_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000K9_n239TBM32_CRT_DATETIME = new boolean[] {false} ;
      BC000K9_A240TBM32_CRT_USER_ID = new String[] {""} ;
      BC000K9_n240TBM32_CRT_USER_ID = new boolean[] {false} ;
      BC000K9_A242TBM32_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000K9_n242TBM32_UPD_DATETIME = new boolean[] {false} ;
      BC000K9_A243TBM32_UPD_USER_ID = new String[] {""} ;
      BC000K9_n243TBM32_UPD_USER_ID = new boolean[] {false} ;
      BC000K9_A245TBM32_UPD_CNT = new long[1] ;
      BC000K9_n245TBM32_UPD_CNT = new boolean[] {false} ;
      BC000K9_A234TBM32_CRF_ITEM_NM = new String[] {""} ;
      BC000K9_n234TBM32_CRF_ITEM_NM = new boolean[] {false} ;
      BC000K9_A235TBM32_CRF_ITEM_DIV = new String[] {""} ;
      BC000K9_n235TBM32_CRF_ITEM_DIV = new boolean[] {false} ;
      BC000K9_A236TBM32_CRF_ITEM_GRP_CD = new String[] {""} ;
      BC000K9_n236TBM32_CRF_ITEM_GRP_CD = new boolean[] {false} ;
      BC000K9_A384TBM32_CRF_ITEM_GRP_ORDER = new short[1] ;
      BC000K9_n384TBM32_CRF_ITEM_GRP_ORDER = new boolean[] {false} ;
      BC000K9_A385TBM32_LOCATION_X = new short[1] ;
      BC000K9_n385TBM32_LOCATION_X = new boolean[] {false} ;
      BC000K9_A386TBM32_LOCATION_Y = new short[1] ;
      BC000K9_n386TBM32_LOCATION_Y = new boolean[] {false} ;
      BC000K9_A387TBM32_LOCATION_X2 = new short[1] ;
      BC000K9_n387TBM32_LOCATION_X2 = new boolean[] {false} ;
      BC000K9_A388TBM32_LOCATION_Y2 = new short[1] ;
      BC000K9_n388TBM32_LOCATION_Y2 = new boolean[] {false} ;
      BC000K9_A389TBM32_TEXT_ALIGN_DIV = new String[] {""} ;
      BC000K9_n389TBM32_TEXT_ALIGN_DIV = new boolean[] {false} ;
      BC000K9_A393TBM32_TEXT_MAXROWS = new byte[1] ;
      BC000K9_n393TBM32_TEXT_MAXROWS = new boolean[] {false} ;
      BC000K9_A394TBM32_TEXT_MAXLENGTH = new short[1] ;
      BC000K9_n394TBM32_TEXT_MAXLENGTH = new boolean[] {false} ;
      BC000K9_A395TBM32_DECIMAL_DIGITS = new byte[1] ;
      BC000K9_n395TBM32_DECIMAL_DIGITS = new boolean[] {false} ;
      BC000K9_A399TBM32_CHK_TRUE_INNER_VALUE = new String[] {""} ;
      BC000K9_n399TBM32_CHK_TRUE_INNER_VALUE = new boolean[] {false} ;
      BC000K9_A400TBM32_CHK_FALSE_INNER_VALUE = new String[] {""} ;
      BC000K9_n400TBM32_CHK_FALSE_INNER_VALUE = new boolean[] {false} ;
      BC000K9_A404TBM32_FIXED_VALUE = new String[] {""} ;
      BC000K9_n404TBM32_FIXED_VALUE = new boolean[] {false} ;
      BC000K9_A402TBM32_LIST_CD = new String[] {""} ;
      BC000K9_n402TBM32_LIST_CD = new boolean[] {false} ;
      BC000K9_A403TBM32_IMAGE_CD = new String[] {""} ;
      BC000K9_n403TBM32_IMAGE_CD = new boolean[] {false} ;
      BC000K9_A401TBM32_TEXT = new String[] {""} ;
      BC000K9_n401TBM32_TEXT = new boolean[] {false} ;
      BC000K9_A390TBM32_FONT_SIZE = new byte[1] ;
      BC000K9_n390TBM32_FONT_SIZE = new boolean[] {false} ;
      BC000K9_A391TBM32_FONT_UL_FLG = new String[] {""} ;
      BC000K9_n391TBM32_FONT_UL_FLG = new boolean[] {false} ;
      BC000K9_A392TBM32_FONT_COLOR_DIV = new long[1] ;
      BC000K9_n392TBM32_FONT_COLOR_DIV = new boolean[] {false} ;
      BC000K9_A398TBM32_LINE_SIZE_DIV = new byte[1] ;
      BC000K9_n398TBM32_LINE_SIZE_DIV = new boolean[] {false} ;
      BC000K9_A603TBM32_LINE_COLOR_DIV = new long[1] ;
      BC000K9_n603TBM32_LINE_COLOR_DIV = new boolean[] {false} ;
      BC000K9_A396TBM32_LINE_START_POINT_DIV = new String[] {""} ;
      BC000K9_n396TBM32_LINE_START_POINT_DIV = new boolean[] {false} ;
      BC000K9_A397TBM32_LINE_END_POINT_DIV = new String[] {""} ;
      BC000K9_n397TBM32_LINE_END_POINT_DIV = new boolean[] {false} ;
      BC000K9_A604TBM32_LINE_ANGLE = new short[1] ;
      BC000K9_n604TBM32_LINE_ANGLE = new boolean[] {false} ;
      BC000K9_A552TBM32_AUTH_LVL_MIN = new byte[1] ;
      BC000K9_n552TBM32_AUTH_LVL_MIN = new boolean[] {false} ;
      BC000K9_A553TBM32_ZORDER = new short[1] ;
      BC000K9_n553TBM32_ZORDER = new boolean[] {false} ;
      BC000K9_A605TBM32_TAB_ORDER = new short[1] ;
      BC000K9_n605TBM32_TAB_ORDER = new boolean[] {false} ;
      BC000K9_A606TBM32_TABSTOP_FLG = new String[] {""} ;
      BC000K9_n606TBM32_TABSTOP_FLG = new boolean[] {false} ;
      BC000K9_A607TBM32_REQUIRED_INPUT_FLG = new String[] {""} ;
      BC000K9_n607TBM32_REQUIRED_INPUT_FLG = new boolean[] {false} ;
      BC000K9_A608TBM32_MIN_VALUE = new String[] {""} ;
      BC000K9_n608TBM32_MIN_VALUE = new boolean[] {false} ;
      BC000K9_A609TBM32_MAX_VALUE = new String[] {""} ;
      BC000K9_n609TBM32_MAX_VALUE = new boolean[] {false} ;
      BC000K9_A237TBM32_CRF_ITEM_NOTE = new String[] {""} ;
      BC000K9_n237TBM32_CRF_ITEM_NOTE = new boolean[] {false} ;
      BC000K9_A746TBM32_REF_CRF_ID = new short[1] ;
      BC000K9_n746TBM32_REF_CRF_ID = new boolean[] {false} ;
      BC000K9_A747TBM32_REF_CRF_ITEM_CD = new String[] {""} ;
      BC000K9_n747TBM32_REF_CRF_ITEM_CD = new boolean[] {false} ;
      BC000K9_A238TBM32_DEL_FLG = new String[] {""} ;
      BC000K9_n238TBM32_DEL_FLG = new boolean[] {false} ;
      BC000K9_A241TBM32_CRT_PROG_NM = new String[] {""} ;
      BC000K9_n241TBM32_CRT_PROG_NM = new boolean[] {false} ;
      BC000K9_A244TBM32_UPD_PROG_NM = new String[] {""} ;
      BC000K9_n244TBM32_UPD_PROG_NM = new boolean[] {false} ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbm32_crf_item_bc__default(),
         new Object[] {
             new Object[] {
            BC000K2_A231TBM32_STUDY_ID, BC000K2_A232TBM32_CRF_ID, BC000K2_A233TBM32_CRF_ITEM_CD, BC000K2_A239TBM32_CRT_DATETIME, BC000K2_n239TBM32_CRT_DATETIME, BC000K2_A240TBM32_CRT_USER_ID, BC000K2_n240TBM32_CRT_USER_ID, BC000K2_A242TBM32_UPD_DATETIME, BC000K2_n242TBM32_UPD_DATETIME, BC000K2_A243TBM32_UPD_USER_ID,
            BC000K2_n243TBM32_UPD_USER_ID, BC000K2_A245TBM32_UPD_CNT, BC000K2_n245TBM32_UPD_CNT, BC000K2_A234TBM32_CRF_ITEM_NM, BC000K2_n234TBM32_CRF_ITEM_NM, BC000K2_A235TBM32_CRF_ITEM_DIV, BC000K2_n235TBM32_CRF_ITEM_DIV, BC000K2_A236TBM32_CRF_ITEM_GRP_CD, BC000K2_n236TBM32_CRF_ITEM_GRP_CD, BC000K2_A384TBM32_CRF_ITEM_GRP_ORDER,
            BC000K2_n384TBM32_CRF_ITEM_GRP_ORDER, BC000K2_A385TBM32_LOCATION_X, BC000K2_n385TBM32_LOCATION_X, BC000K2_A386TBM32_LOCATION_Y, BC000K2_n386TBM32_LOCATION_Y, BC000K2_A387TBM32_LOCATION_X2, BC000K2_n387TBM32_LOCATION_X2, BC000K2_A388TBM32_LOCATION_Y2, BC000K2_n388TBM32_LOCATION_Y2, BC000K2_A389TBM32_TEXT_ALIGN_DIV,
            BC000K2_n389TBM32_TEXT_ALIGN_DIV, BC000K2_A393TBM32_TEXT_MAXROWS, BC000K2_n393TBM32_TEXT_MAXROWS, BC000K2_A394TBM32_TEXT_MAXLENGTH, BC000K2_n394TBM32_TEXT_MAXLENGTH, BC000K2_A395TBM32_DECIMAL_DIGITS, BC000K2_n395TBM32_DECIMAL_DIGITS, BC000K2_A399TBM32_CHK_TRUE_INNER_VALUE, BC000K2_n399TBM32_CHK_TRUE_INNER_VALUE, BC000K2_A400TBM32_CHK_FALSE_INNER_VALUE,
            BC000K2_n400TBM32_CHK_FALSE_INNER_VALUE, BC000K2_A404TBM32_FIXED_VALUE, BC000K2_n404TBM32_FIXED_VALUE, BC000K2_A402TBM32_LIST_CD, BC000K2_n402TBM32_LIST_CD, BC000K2_A403TBM32_IMAGE_CD, BC000K2_n403TBM32_IMAGE_CD, BC000K2_A401TBM32_TEXT, BC000K2_n401TBM32_TEXT, BC000K2_A390TBM32_FONT_SIZE,
            BC000K2_n390TBM32_FONT_SIZE, BC000K2_A391TBM32_FONT_UL_FLG, BC000K2_n391TBM32_FONT_UL_FLG, BC000K2_A392TBM32_FONT_COLOR_DIV, BC000K2_n392TBM32_FONT_COLOR_DIV, BC000K2_A398TBM32_LINE_SIZE_DIV, BC000K2_n398TBM32_LINE_SIZE_DIV, BC000K2_A603TBM32_LINE_COLOR_DIV, BC000K2_n603TBM32_LINE_COLOR_DIV, BC000K2_A396TBM32_LINE_START_POINT_DIV,
            BC000K2_n396TBM32_LINE_START_POINT_DIV, BC000K2_A397TBM32_LINE_END_POINT_DIV, BC000K2_n397TBM32_LINE_END_POINT_DIV, BC000K2_A604TBM32_LINE_ANGLE, BC000K2_n604TBM32_LINE_ANGLE, BC000K2_A552TBM32_AUTH_LVL_MIN, BC000K2_n552TBM32_AUTH_LVL_MIN, BC000K2_A553TBM32_ZORDER, BC000K2_n553TBM32_ZORDER, BC000K2_A605TBM32_TAB_ORDER,
            BC000K2_n605TBM32_TAB_ORDER, BC000K2_A606TBM32_TABSTOP_FLG, BC000K2_n606TBM32_TABSTOP_FLG, BC000K2_A607TBM32_REQUIRED_INPUT_FLG, BC000K2_n607TBM32_REQUIRED_INPUT_FLG, BC000K2_A608TBM32_MIN_VALUE, BC000K2_n608TBM32_MIN_VALUE, BC000K2_A609TBM32_MAX_VALUE, BC000K2_n609TBM32_MAX_VALUE, BC000K2_A237TBM32_CRF_ITEM_NOTE,
            BC000K2_n237TBM32_CRF_ITEM_NOTE, BC000K2_A746TBM32_REF_CRF_ID, BC000K2_n746TBM32_REF_CRF_ID, BC000K2_A747TBM32_REF_CRF_ITEM_CD, BC000K2_n747TBM32_REF_CRF_ITEM_CD, BC000K2_A238TBM32_DEL_FLG, BC000K2_n238TBM32_DEL_FLG, BC000K2_A241TBM32_CRT_PROG_NM, BC000K2_n241TBM32_CRT_PROG_NM, BC000K2_A244TBM32_UPD_PROG_NM,
            BC000K2_n244TBM32_UPD_PROG_NM
            }
            , new Object[] {
            BC000K3_A231TBM32_STUDY_ID, BC000K3_A232TBM32_CRF_ID, BC000K3_A233TBM32_CRF_ITEM_CD, BC000K3_A239TBM32_CRT_DATETIME, BC000K3_n239TBM32_CRT_DATETIME, BC000K3_A240TBM32_CRT_USER_ID, BC000K3_n240TBM32_CRT_USER_ID, BC000K3_A242TBM32_UPD_DATETIME, BC000K3_n242TBM32_UPD_DATETIME, BC000K3_A243TBM32_UPD_USER_ID,
            BC000K3_n243TBM32_UPD_USER_ID, BC000K3_A245TBM32_UPD_CNT, BC000K3_n245TBM32_UPD_CNT, BC000K3_A234TBM32_CRF_ITEM_NM, BC000K3_n234TBM32_CRF_ITEM_NM, BC000K3_A235TBM32_CRF_ITEM_DIV, BC000K3_n235TBM32_CRF_ITEM_DIV, BC000K3_A236TBM32_CRF_ITEM_GRP_CD, BC000K3_n236TBM32_CRF_ITEM_GRP_CD, BC000K3_A384TBM32_CRF_ITEM_GRP_ORDER,
            BC000K3_n384TBM32_CRF_ITEM_GRP_ORDER, BC000K3_A385TBM32_LOCATION_X, BC000K3_n385TBM32_LOCATION_X, BC000K3_A386TBM32_LOCATION_Y, BC000K3_n386TBM32_LOCATION_Y, BC000K3_A387TBM32_LOCATION_X2, BC000K3_n387TBM32_LOCATION_X2, BC000K3_A388TBM32_LOCATION_Y2, BC000K3_n388TBM32_LOCATION_Y2, BC000K3_A389TBM32_TEXT_ALIGN_DIV,
            BC000K3_n389TBM32_TEXT_ALIGN_DIV, BC000K3_A393TBM32_TEXT_MAXROWS, BC000K3_n393TBM32_TEXT_MAXROWS, BC000K3_A394TBM32_TEXT_MAXLENGTH, BC000K3_n394TBM32_TEXT_MAXLENGTH, BC000K3_A395TBM32_DECIMAL_DIGITS, BC000K3_n395TBM32_DECIMAL_DIGITS, BC000K3_A399TBM32_CHK_TRUE_INNER_VALUE, BC000K3_n399TBM32_CHK_TRUE_INNER_VALUE, BC000K3_A400TBM32_CHK_FALSE_INNER_VALUE,
            BC000K3_n400TBM32_CHK_FALSE_INNER_VALUE, BC000K3_A404TBM32_FIXED_VALUE, BC000K3_n404TBM32_FIXED_VALUE, BC000K3_A402TBM32_LIST_CD, BC000K3_n402TBM32_LIST_CD, BC000K3_A403TBM32_IMAGE_CD, BC000K3_n403TBM32_IMAGE_CD, BC000K3_A401TBM32_TEXT, BC000K3_n401TBM32_TEXT, BC000K3_A390TBM32_FONT_SIZE,
            BC000K3_n390TBM32_FONT_SIZE, BC000K3_A391TBM32_FONT_UL_FLG, BC000K3_n391TBM32_FONT_UL_FLG, BC000K3_A392TBM32_FONT_COLOR_DIV, BC000K3_n392TBM32_FONT_COLOR_DIV, BC000K3_A398TBM32_LINE_SIZE_DIV, BC000K3_n398TBM32_LINE_SIZE_DIV, BC000K3_A603TBM32_LINE_COLOR_DIV, BC000K3_n603TBM32_LINE_COLOR_DIV, BC000K3_A396TBM32_LINE_START_POINT_DIV,
            BC000K3_n396TBM32_LINE_START_POINT_DIV, BC000K3_A397TBM32_LINE_END_POINT_DIV, BC000K3_n397TBM32_LINE_END_POINT_DIV, BC000K3_A604TBM32_LINE_ANGLE, BC000K3_n604TBM32_LINE_ANGLE, BC000K3_A552TBM32_AUTH_LVL_MIN, BC000K3_n552TBM32_AUTH_LVL_MIN, BC000K3_A553TBM32_ZORDER, BC000K3_n553TBM32_ZORDER, BC000K3_A605TBM32_TAB_ORDER,
            BC000K3_n605TBM32_TAB_ORDER, BC000K3_A606TBM32_TABSTOP_FLG, BC000K3_n606TBM32_TABSTOP_FLG, BC000K3_A607TBM32_REQUIRED_INPUT_FLG, BC000K3_n607TBM32_REQUIRED_INPUT_FLG, BC000K3_A608TBM32_MIN_VALUE, BC000K3_n608TBM32_MIN_VALUE, BC000K3_A609TBM32_MAX_VALUE, BC000K3_n609TBM32_MAX_VALUE, BC000K3_A237TBM32_CRF_ITEM_NOTE,
            BC000K3_n237TBM32_CRF_ITEM_NOTE, BC000K3_A746TBM32_REF_CRF_ID, BC000K3_n746TBM32_REF_CRF_ID, BC000K3_A747TBM32_REF_CRF_ITEM_CD, BC000K3_n747TBM32_REF_CRF_ITEM_CD, BC000K3_A238TBM32_DEL_FLG, BC000K3_n238TBM32_DEL_FLG, BC000K3_A241TBM32_CRT_PROG_NM, BC000K3_n241TBM32_CRT_PROG_NM, BC000K3_A244TBM32_UPD_PROG_NM,
            BC000K3_n244TBM32_UPD_PROG_NM
            }
            , new Object[] {
            BC000K4_A231TBM32_STUDY_ID, BC000K4_A232TBM32_CRF_ID, BC000K4_A233TBM32_CRF_ITEM_CD, BC000K4_A239TBM32_CRT_DATETIME, BC000K4_n239TBM32_CRT_DATETIME, BC000K4_A240TBM32_CRT_USER_ID, BC000K4_n240TBM32_CRT_USER_ID, BC000K4_A242TBM32_UPD_DATETIME, BC000K4_n242TBM32_UPD_DATETIME, BC000K4_A243TBM32_UPD_USER_ID,
            BC000K4_n243TBM32_UPD_USER_ID, BC000K4_A245TBM32_UPD_CNT, BC000K4_n245TBM32_UPD_CNT, BC000K4_A234TBM32_CRF_ITEM_NM, BC000K4_n234TBM32_CRF_ITEM_NM, BC000K4_A235TBM32_CRF_ITEM_DIV, BC000K4_n235TBM32_CRF_ITEM_DIV, BC000K4_A236TBM32_CRF_ITEM_GRP_CD, BC000K4_n236TBM32_CRF_ITEM_GRP_CD, BC000K4_A384TBM32_CRF_ITEM_GRP_ORDER,
            BC000K4_n384TBM32_CRF_ITEM_GRP_ORDER, BC000K4_A385TBM32_LOCATION_X, BC000K4_n385TBM32_LOCATION_X, BC000K4_A386TBM32_LOCATION_Y, BC000K4_n386TBM32_LOCATION_Y, BC000K4_A387TBM32_LOCATION_X2, BC000K4_n387TBM32_LOCATION_X2, BC000K4_A388TBM32_LOCATION_Y2, BC000K4_n388TBM32_LOCATION_Y2, BC000K4_A389TBM32_TEXT_ALIGN_DIV,
            BC000K4_n389TBM32_TEXT_ALIGN_DIV, BC000K4_A393TBM32_TEXT_MAXROWS, BC000K4_n393TBM32_TEXT_MAXROWS, BC000K4_A394TBM32_TEXT_MAXLENGTH, BC000K4_n394TBM32_TEXT_MAXLENGTH, BC000K4_A395TBM32_DECIMAL_DIGITS, BC000K4_n395TBM32_DECIMAL_DIGITS, BC000K4_A399TBM32_CHK_TRUE_INNER_VALUE, BC000K4_n399TBM32_CHK_TRUE_INNER_VALUE, BC000K4_A400TBM32_CHK_FALSE_INNER_VALUE,
            BC000K4_n400TBM32_CHK_FALSE_INNER_VALUE, BC000K4_A404TBM32_FIXED_VALUE, BC000K4_n404TBM32_FIXED_VALUE, BC000K4_A402TBM32_LIST_CD, BC000K4_n402TBM32_LIST_CD, BC000K4_A403TBM32_IMAGE_CD, BC000K4_n403TBM32_IMAGE_CD, BC000K4_A401TBM32_TEXT, BC000K4_n401TBM32_TEXT, BC000K4_A390TBM32_FONT_SIZE,
            BC000K4_n390TBM32_FONT_SIZE, BC000K4_A391TBM32_FONT_UL_FLG, BC000K4_n391TBM32_FONT_UL_FLG, BC000K4_A392TBM32_FONT_COLOR_DIV, BC000K4_n392TBM32_FONT_COLOR_DIV, BC000K4_A398TBM32_LINE_SIZE_DIV, BC000K4_n398TBM32_LINE_SIZE_DIV, BC000K4_A603TBM32_LINE_COLOR_DIV, BC000K4_n603TBM32_LINE_COLOR_DIV, BC000K4_A396TBM32_LINE_START_POINT_DIV,
            BC000K4_n396TBM32_LINE_START_POINT_DIV, BC000K4_A397TBM32_LINE_END_POINT_DIV, BC000K4_n397TBM32_LINE_END_POINT_DIV, BC000K4_A604TBM32_LINE_ANGLE, BC000K4_n604TBM32_LINE_ANGLE, BC000K4_A552TBM32_AUTH_LVL_MIN, BC000K4_n552TBM32_AUTH_LVL_MIN, BC000K4_A553TBM32_ZORDER, BC000K4_n553TBM32_ZORDER, BC000K4_A605TBM32_TAB_ORDER,
            BC000K4_n605TBM32_TAB_ORDER, BC000K4_A606TBM32_TABSTOP_FLG, BC000K4_n606TBM32_TABSTOP_FLG, BC000K4_A607TBM32_REQUIRED_INPUT_FLG, BC000K4_n607TBM32_REQUIRED_INPUT_FLG, BC000K4_A608TBM32_MIN_VALUE, BC000K4_n608TBM32_MIN_VALUE, BC000K4_A609TBM32_MAX_VALUE, BC000K4_n609TBM32_MAX_VALUE, BC000K4_A237TBM32_CRF_ITEM_NOTE,
            BC000K4_n237TBM32_CRF_ITEM_NOTE, BC000K4_A746TBM32_REF_CRF_ID, BC000K4_n746TBM32_REF_CRF_ID, BC000K4_A747TBM32_REF_CRF_ITEM_CD, BC000K4_n747TBM32_REF_CRF_ITEM_CD, BC000K4_A238TBM32_DEL_FLG, BC000K4_n238TBM32_DEL_FLG, BC000K4_A241TBM32_CRT_PROG_NM, BC000K4_n241TBM32_CRT_PROG_NM, BC000K4_A244TBM32_UPD_PROG_NM,
            BC000K4_n244TBM32_UPD_PROG_NM
            }
            , new Object[] {
            BC000K5_A231TBM32_STUDY_ID, BC000K5_A232TBM32_CRF_ID, BC000K5_A233TBM32_CRF_ITEM_CD
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000K9_A231TBM32_STUDY_ID, BC000K9_A232TBM32_CRF_ID, BC000K9_A233TBM32_CRF_ITEM_CD, BC000K9_A239TBM32_CRT_DATETIME, BC000K9_n239TBM32_CRT_DATETIME, BC000K9_A240TBM32_CRT_USER_ID, BC000K9_n240TBM32_CRT_USER_ID, BC000K9_A242TBM32_UPD_DATETIME, BC000K9_n242TBM32_UPD_DATETIME, BC000K9_A243TBM32_UPD_USER_ID,
            BC000K9_n243TBM32_UPD_USER_ID, BC000K9_A245TBM32_UPD_CNT, BC000K9_n245TBM32_UPD_CNT, BC000K9_A234TBM32_CRF_ITEM_NM, BC000K9_n234TBM32_CRF_ITEM_NM, BC000K9_A235TBM32_CRF_ITEM_DIV, BC000K9_n235TBM32_CRF_ITEM_DIV, BC000K9_A236TBM32_CRF_ITEM_GRP_CD, BC000K9_n236TBM32_CRF_ITEM_GRP_CD, BC000K9_A384TBM32_CRF_ITEM_GRP_ORDER,
            BC000K9_n384TBM32_CRF_ITEM_GRP_ORDER, BC000K9_A385TBM32_LOCATION_X, BC000K9_n385TBM32_LOCATION_X, BC000K9_A386TBM32_LOCATION_Y, BC000K9_n386TBM32_LOCATION_Y, BC000K9_A387TBM32_LOCATION_X2, BC000K9_n387TBM32_LOCATION_X2, BC000K9_A388TBM32_LOCATION_Y2, BC000K9_n388TBM32_LOCATION_Y2, BC000K9_A389TBM32_TEXT_ALIGN_DIV,
            BC000K9_n389TBM32_TEXT_ALIGN_DIV, BC000K9_A393TBM32_TEXT_MAXROWS, BC000K9_n393TBM32_TEXT_MAXROWS, BC000K9_A394TBM32_TEXT_MAXLENGTH, BC000K9_n394TBM32_TEXT_MAXLENGTH, BC000K9_A395TBM32_DECIMAL_DIGITS, BC000K9_n395TBM32_DECIMAL_DIGITS, BC000K9_A399TBM32_CHK_TRUE_INNER_VALUE, BC000K9_n399TBM32_CHK_TRUE_INNER_VALUE, BC000K9_A400TBM32_CHK_FALSE_INNER_VALUE,
            BC000K9_n400TBM32_CHK_FALSE_INNER_VALUE, BC000K9_A404TBM32_FIXED_VALUE, BC000K9_n404TBM32_FIXED_VALUE, BC000K9_A402TBM32_LIST_CD, BC000K9_n402TBM32_LIST_CD, BC000K9_A403TBM32_IMAGE_CD, BC000K9_n403TBM32_IMAGE_CD, BC000K9_A401TBM32_TEXT, BC000K9_n401TBM32_TEXT, BC000K9_A390TBM32_FONT_SIZE,
            BC000K9_n390TBM32_FONT_SIZE, BC000K9_A391TBM32_FONT_UL_FLG, BC000K9_n391TBM32_FONT_UL_FLG, BC000K9_A392TBM32_FONT_COLOR_DIV, BC000K9_n392TBM32_FONT_COLOR_DIV, BC000K9_A398TBM32_LINE_SIZE_DIV, BC000K9_n398TBM32_LINE_SIZE_DIV, BC000K9_A603TBM32_LINE_COLOR_DIV, BC000K9_n603TBM32_LINE_COLOR_DIV, BC000K9_A396TBM32_LINE_START_POINT_DIV,
            BC000K9_n396TBM32_LINE_START_POINT_DIV, BC000K9_A397TBM32_LINE_END_POINT_DIV, BC000K9_n397TBM32_LINE_END_POINT_DIV, BC000K9_A604TBM32_LINE_ANGLE, BC000K9_n604TBM32_LINE_ANGLE, BC000K9_A552TBM32_AUTH_LVL_MIN, BC000K9_n552TBM32_AUTH_LVL_MIN, BC000K9_A553TBM32_ZORDER, BC000K9_n553TBM32_ZORDER, BC000K9_A605TBM32_TAB_ORDER,
            BC000K9_n605TBM32_TAB_ORDER, BC000K9_A606TBM32_TABSTOP_FLG, BC000K9_n606TBM32_TABSTOP_FLG, BC000K9_A607TBM32_REQUIRED_INPUT_FLG, BC000K9_n607TBM32_REQUIRED_INPUT_FLG, BC000K9_A608TBM32_MIN_VALUE, BC000K9_n608TBM32_MIN_VALUE, BC000K9_A609TBM32_MAX_VALUE, BC000K9_n609TBM32_MAX_VALUE, BC000K9_A237TBM32_CRF_ITEM_NOTE,
            BC000K9_n237TBM32_CRF_ITEM_NOTE, BC000K9_A746TBM32_REF_CRF_ID, BC000K9_n746TBM32_REF_CRF_ID, BC000K9_A747TBM32_REF_CRF_ITEM_CD, BC000K9_n747TBM32_REF_CRF_ITEM_CD, BC000K9_A238TBM32_DEL_FLG, BC000K9_n238TBM32_DEL_FLG, BC000K9_A241TBM32_CRT_PROG_NM, BC000K9_n241TBM32_CRT_PROG_NM, BC000K9_A244TBM32_UPD_PROG_NM,
            BC000K9_n244TBM32_UPD_PROG_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBM32_CRF_ITEM_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: e110K2 */
      e110K2 ();
   }

   private byte nKeyPressed ;
   private byte A393TBM32_TEXT_MAXROWS ;
   private byte A395TBM32_DECIMAL_DIGITS ;
   private byte A390TBM32_FONT_SIZE ;
   private byte A398TBM32_LINE_SIZE_DIV ;
   private byte A552TBM32_AUTH_LVL_MIN ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxrows_Z ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_decimal_digits_Z ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_size_Z ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_size_div_Z ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_auth_lvl_min_Z ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_nm_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_div_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_cd_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_order_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x2_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y2_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_align_div_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxrows_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxlength_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_decimal_digits_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_true_inner_value_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_false_inner_value_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_fixed_value_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_list_cd_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_image_cd_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_size_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_ul_flg_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_color_div_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_size_div_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_color_div_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_start_point_div_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_end_point_div_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_angle_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_auth_lvl_min_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_zorder_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_tab_order_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_tabstop_flg_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_required_input_flg_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_min_value_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_max_value_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_note_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_id_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_item_cd_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_del_flg_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_user_id_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_prog_nm_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_user_id_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_prog_nm_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_cnt_N ;
   private byte Z393TBM32_TEXT_MAXROWS ;
   private byte Z395TBM32_DECIMAL_DIGITS ;
   private byte Z390TBM32_FONT_SIZE ;
   private byte Z398TBM32_LINE_SIZE_DIV ;
   private byte Z552TBM32_AUTH_LVL_MIN ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short Z232TBM32_CRF_ID ;
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
   private short gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_id_Z ;
   private short gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_order_Z ;
   private short gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x_Z ;
   private short gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y_Z ;
   private short gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x2_Z ;
   private short gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y2_Z ;
   private short gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxlength_Z ;
   private short gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_angle_Z ;
   private short gxTv_SdtTBM32_CRF_ITEM_Tbm32_zorder_Z ;
   private short gxTv_SdtTBM32_CRF_ITEM_Tbm32_tab_order_Z ;
   private short gxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_id_Z ;
   private short Z384TBM32_CRF_ITEM_GRP_ORDER ;
   private short Z385TBM32_LOCATION_X ;
   private short Z386TBM32_LOCATION_Y ;
   private short Z387TBM32_LOCATION_X2 ;
   private short Z388TBM32_LOCATION_Y2 ;
   private short Z394TBM32_TEXT_MAXLENGTH ;
   private short Z604TBM32_LINE_ANGLE ;
   private short Z553TBM32_ZORDER ;
   private short Z605TBM32_TAB_ORDER ;
   private short Z746TBM32_REF_CRF_ID ;
   private short RcdFound19 ;
   private short Gx_err ;
   private int trnEnded ;
   private int GX_JID ;
   private int GXActiveErrHndl ;
   private long Z231TBM32_STUDY_ID ;
   private long A231TBM32_STUDY_ID ;
   private long A392TBM32_FONT_COLOR_DIV ;
   private long A603TBM32_LINE_COLOR_DIV ;
   private long A245TBM32_UPD_CNT ;
   private long gxTv_SdtTBM32_CRF_ITEM_Tbm32_study_id_Z ;
   private long gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_color_div_Z ;
   private long gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_color_div_Z ;
   private long gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_cnt_Z ;
   private long Z245TBM32_UPD_CNT ;
   private long Z392TBM32_FONT_COLOR_DIV ;
   private long Z603TBM32_LINE_COLOR_DIV ;
   private long O245TBM32_UPD_CNT ;
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
   private java.util.Date A239TBM32_CRT_DATETIME ;
   private java.util.Date A242TBM32_UPD_DATETIME ;
   private java.util.Date gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime_Z ;
   private java.util.Date gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime_Z ;
   private java.util.Date Z239TBM32_CRT_DATETIME ;
   private java.util.Date Z242TBM32_UPD_DATETIME ;
   private boolean n239TBM32_CRT_DATETIME ;
   private boolean n240TBM32_CRT_USER_ID ;
   private boolean n242TBM32_UPD_DATETIME ;
   private boolean n243TBM32_UPD_USER_ID ;
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
   private boolean n241TBM32_CRT_PROG_NM ;
   private boolean n244TBM32_UPD_PROG_NM ;
   private boolean Gx_longc ;
   private String Z233TBM32_CRF_ITEM_CD ;
   private String A233TBM32_CRF_ITEM_CD ;
   private String AV8W_BC_FLG ;
   private String AV7W_TXT ;
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
   private String A240TBM32_CRT_USER_ID ;
   private String A241TBM32_CRT_PROG_NM ;
   private String A243TBM32_UPD_USER_ID ;
   private String A244TBM32_UPD_PROG_NM ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_cd_Z ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_nm_Z ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_div_Z ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_cd_Z ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_align_div_Z ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_true_inner_value_Z ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_false_inner_value_Z ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_fixed_value_Z ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_list_cd_Z ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_image_cd_Z ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_Z ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_ul_flg_Z ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_start_point_div_Z ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_end_point_div_Z ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_tabstop_flg_Z ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_required_input_flg_Z ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_min_value_Z ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_max_value_Z ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_note_Z ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_item_cd_Z ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_del_flg_Z ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_user_id_Z ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_prog_nm_Z ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_user_id_Z ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_prog_nm_Z ;
   private String Z240TBM32_CRT_USER_ID ;
   private String Z243TBM32_UPD_USER_ID ;
   private String Z234TBM32_CRF_ITEM_NM ;
   private String Z235TBM32_CRF_ITEM_DIV ;
   private String Z236TBM32_CRF_ITEM_GRP_CD ;
   private String Z389TBM32_TEXT_ALIGN_DIV ;
   private String Z399TBM32_CHK_TRUE_INNER_VALUE ;
   private String Z400TBM32_CHK_FALSE_INNER_VALUE ;
   private String Z404TBM32_FIXED_VALUE ;
   private String Z402TBM32_LIST_CD ;
   private String Z403TBM32_IMAGE_CD ;
   private String Z401TBM32_TEXT ;
   private String Z391TBM32_FONT_UL_FLG ;
   private String Z396TBM32_LINE_START_POINT_DIV ;
   private String Z397TBM32_LINE_END_POINT_DIV ;
   private String Z606TBM32_TABSTOP_FLG ;
   private String Z607TBM32_REQUIRED_INPUT_FLG ;
   private String Z608TBM32_MIN_VALUE ;
   private String Z609TBM32_MAX_VALUE ;
   private String Z237TBM32_CRF_ITEM_NOTE ;
   private String Z747TBM32_REF_CRF_ITEM_CD ;
   private String Z238TBM32_DEL_FLG ;
   private String Z241TBM32_CRT_PROG_NM ;
   private String Z244TBM32_UPD_PROG_NM ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTBM32_CRF_ITEM bcTBM32_CRF_ITEM ;
   private IDataStoreProvider pr_default ;
   private long[] BC000K4_A231TBM32_STUDY_ID ;
   private short[] BC000K4_A232TBM32_CRF_ID ;
   private String[] BC000K4_A233TBM32_CRF_ITEM_CD ;
   private java.util.Date[] BC000K4_A239TBM32_CRT_DATETIME ;
   private boolean[] BC000K4_n239TBM32_CRT_DATETIME ;
   private String[] BC000K4_A240TBM32_CRT_USER_ID ;
   private boolean[] BC000K4_n240TBM32_CRT_USER_ID ;
   private java.util.Date[] BC000K4_A242TBM32_UPD_DATETIME ;
   private boolean[] BC000K4_n242TBM32_UPD_DATETIME ;
   private String[] BC000K4_A243TBM32_UPD_USER_ID ;
   private boolean[] BC000K4_n243TBM32_UPD_USER_ID ;
   private long[] BC000K4_A245TBM32_UPD_CNT ;
   private boolean[] BC000K4_n245TBM32_UPD_CNT ;
   private String[] BC000K4_A234TBM32_CRF_ITEM_NM ;
   private boolean[] BC000K4_n234TBM32_CRF_ITEM_NM ;
   private String[] BC000K4_A235TBM32_CRF_ITEM_DIV ;
   private boolean[] BC000K4_n235TBM32_CRF_ITEM_DIV ;
   private String[] BC000K4_A236TBM32_CRF_ITEM_GRP_CD ;
   private boolean[] BC000K4_n236TBM32_CRF_ITEM_GRP_CD ;
   private short[] BC000K4_A384TBM32_CRF_ITEM_GRP_ORDER ;
   private boolean[] BC000K4_n384TBM32_CRF_ITEM_GRP_ORDER ;
   private short[] BC000K4_A385TBM32_LOCATION_X ;
   private boolean[] BC000K4_n385TBM32_LOCATION_X ;
   private short[] BC000K4_A386TBM32_LOCATION_Y ;
   private boolean[] BC000K4_n386TBM32_LOCATION_Y ;
   private short[] BC000K4_A387TBM32_LOCATION_X2 ;
   private boolean[] BC000K4_n387TBM32_LOCATION_X2 ;
   private short[] BC000K4_A388TBM32_LOCATION_Y2 ;
   private boolean[] BC000K4_n388TBM32_LOCATION_Y2 ;
   private String[] BC000K4_A389TBM32_TEXT_ALIGN_DIV ;
   private boolean[] BC000K4_n389TBM32_TEXT_ALIGN_DIV ;
   private byte[] BC000K4_A393TBM32_TEXT_MAXROWS ;
   private boolean[] BC000K4_n393TBM32_TEXT_MAXROWS ;
   private short[] BC000K4_A394TBM32_TEXT_MAXLENGTH ;
   private boolean[] BC000K4_n394TBM32_TEXT_MAXLENGTH ;
   private byte[] BC000K4_A395TBM32_DECIMAL_DIGITS ;
   private boolean[] BC000K4_n395TBM32_DECIMAL_DIGITS ;
   private String[] BC000K4_A399TBM32_CHK_TRUE_INNER_VALUE ;
   private boolean[] BC000K4_n399TBM32_CHK_TRUE_INNER_VALUE ;
   private String[] BC000K4_A400TBM32_CHK_FALSE_INNER_VALUE ;
   private boolean[] BC000K4_n400TBM32_CHK_FALSE_INNER_VALUE ;
   private String[] BC000K4_A404TBM32_FIXED_VALUE ;
   private boolean[] BC000K4_n404TBM32_FIXED_VALUE ;
   private String[] BC000K4_A402TBM32_LIST_CD ;
   private boolean[] BC000K4_n402TBM32_LIST_CD ;
   private String[] BC000K4_A403TBM32_IMAGE_CD ;
   private boolean[] BC000K4_n403TBM32_IMAGE_CD ;
   private String[] BC000K4_A401TBM32_TEXT ;
   private boolean[] BC000K4_n401TBM32_TEXT ;
   private byte[] BC000K4_A390TBM32_FONT_SIZE ;
   private boolean[] BC000K4_n390TBM32_FONT_SIZE ;
   private String[] BC000K4_A391TBM32_FONT_UL_FLG ;
   private boolean[] BC000K4_n391TBM32_FONT_UL_FLG ;
   private long[] BC000K4_A392TBM32_FONT_COLOR_DIV ;
   private boolean[] BC000K4_n392TBM32_FONT_COLOR_DIV ;
   private byte[] BC000K4_A398TBM32_LINE_SIZE_DIV ;
   private boolean[] BC000K4_n398TBM32_LINE_SIZE_DIV ;
   private long[] BC000K4_A603TBM32_LINE_COLOR_DIV ;
   private boolean[] BC000K4_n603TBM32_LINE_COLOR_DIV ;
   private String[] BC000K4_A396TBM32_LINE_START_POINT_DIV ;
   private boolean[] BC000K4_n396TBM32_LINE_START_POINT_DIV ;
   private String[] BC000K4_A397TBM32_LINE_END_POINT_DIV ;
   private boolean[] BC000K4_n397TBM32_LINE_END_POINT_DIV ;
   private short[] BC000K4_A604TBM32_LINE_ANGLE ;
   private boolean[] BC000K4_n604TBM32_LINE_ANGLE ;
   private byte[] BC000K4_A552TBM32_AUTH_LVL_MIN ;
   private boolean[] BC000K4_n552TBM32_AUTH_LVL_MIN ;
   private short[] BC000K4_A553TBM32_ZORDER ;
   private boolean[] BC000K4_n553TBM32_ZORDER ;
   private short[] BC000K4_A605TBM32_TAB_ORDER ;
   private boolean[] BC000K4_n605TBM32_TAB_ORDER ;
   private String[] BC000K4_A606TBM32_TABSTOP_FLG ;
   private boolean[] BC000K4_n606TBM32_TABSTOP_FLG ;
   private String[] BC000K4_A607TBM32_REQUIRED_INPUT_FLG ;
   private boolean[] BC000K4_n607TBM32_REQUIRED_INPUT_FLG ;
   private String[] BC000K4_A608TBM32_MIN_VALUE ;
   private boolean[] BC000K4_n608TBM32_MIN_VALUE ;
   private String[] BC000K4_A609TBM32_MAX_VALUE ;
   private boolean[] BC000K4_n609TBM32_MAX_VALUE ;
   private String[] BC000K4_A237TBM32_CRF_ITEM_NOTE ;
   private boolean[] BC000K4_n237TBM32_CRF_ITEM_NOTE ;
   private short[] BC000K4_A746TBM32_REF_CRF_ID ;
   private boolean[] BC000K4_n746TBM32_REF_CRF_ID ;
   private String[] BC000K4_A747TBM32_REF_CRF_ITEM_CD ;
   private boolean[] BC000K4_n747TBM32_REF_CRF_ITEM_CD ;
   private String[] BC000K4_A238TBM32_DEL_FLG ;
   private boolean[] BC000K4_n238TBM32_DEL_FLG ;
   private String[] BC000K4_A241TBM32_CRT_PROG_NM ;
   private boolean[] BC000K4_n241TBM32_CRT_PROG_NM ;
   private String[] BC000K4_A244TBM32_UPD_PROG_NM ;
   private boolean[] BC000K4_n244TBM32_UPD_PROG_NM ;
   private long[] BC000K5_A231TBM32_STUDY_ID ;
   private short[] BC000K5_A232TBM32_CRF_ID ;
   private String[] BC000K5_A233TBM32_CRF_ITEM_CD ;
   private long[] BC000K3_A231TBM32_STUDY_ID ;
   private short[] BC000K3_A232TBM32_CRF_ID ;
   private String[] BC000K3_A233TBM32_CRF_ITEM_CD ;
   private java.util.Date[] BC000K3_A239TBM32_CRT_DATETIME ;
   private boolean[] BC000K3_n239TBM32_CRT_DATETIME ;
   private String[] BC000K3_A240TBM32_CRT_USER_ID ;
   private boolean[] BC000K3_n240TBM32_CRT_USER_ID ;
   private java.util.Date[] BC000K3_A242TBM32_UPD_DATETIME ;
   private boolean[] BC000K3_n242TBM32_UPD_DATETIME ;
   private String[] BC000K3_A243TBM32_UPD_USER_ID ;
   private boolean[] BC000K3_n243TBM32_UPD_USER_ID ;
   private long[] BC000K3_A245TBM32_UPD_CNT ;
   private boolean[] BC000K3_n245TBM32_UPD_CNT ;
   private String[] BC000K3_A234TBM32_CRF_ITEM_NM ;
   private boolean[] BC000K3_n234TBM32_CRF_ITEM_NM ;
   private String[] BC000K3_A235TBM32_CRF_ITEM_DIV ;
   private boolean[] BC000K3_n235TBM32_CRF_ITEM_DIV ;
   private String[] BC000K3_A236TBM32_CRF_ITEM_GRP_CD ;
   private boolean[] BC000K3_n236TBM32_CRF_ITEM_GRP_CD ;
   private short[] BC000K3_A384TBM32_CRF_ITEM_GRP_ORDER ;
   private boolean[] BC000K3_n384TBM32_CRF_ITEM_GRP_ORDER ;
   private short[] BC000K3_A385TBM32_LOCATION_X ;
   private boolean[] BC000K3_n385TBM32_LOCATION_X ;
   private short[] BC000K3_A386TBM32_LOCATION_Y ;
   private boolean[] BC000K3_n386TBM32_LOCATION_Y ;
   private short[] BC000K3_A387TBM32_LOCATION_X2 ;
   private boolean[] BC000K3_n387TBM32_LOCATION_X2 ;
   private short[] BC000K3_A388TBM32_LOCATION_Y2 ;
   private boolean[] BC000K3_n388TBM32_LOCATION_Y2 ;
   private String[] BC000K3_A389TBM32_TEXT_ALIGN_DIV ;
   private boolean[] BC000K3_n389TBM32_TEXT_ALIGN_DIV ;
   private byte[] BC000K3_A393TBM32_TEXT_MAXROWS ;
   private boolean[] BC000K3_n393TBM32_TEXT_MAXROWS ;
   private short[] BC000K3_A394TBM32_TEXT_MAXLENGTH ;
   private boolean[] BC000K3_n394TBM32_TEXT_MAXLENGTH ;
   private byte[] BC000K3_A395TBM32_DECIMAL_DIGITS ;
   private boolean[] BC000K3_n395TBM32_DECIMAL_DIGITS ;
   private String[] BC000K3_A399TBM32_CHK_TRUE_INNER_VALUE ;
   private boolean[] BC000K3_n399TBM32_CHK_TRUE_INNER_VALUE ;
   private String[] BC000K3_A400TBM32_CHK_FALSE_INNER_VALUE ;
   private boolean[] BC000K3_n400TBM32_CHK_FALSE_INNER_VALUE ;
   private String[] BC000K3_A404TBM32_FIXED_VALUE ;
   private boolean[] BC000K3_n404TBM32_FIXED_VALUE ;
   private String[] BC000K3_A402TBM32_LIST_CD ;
   private boolean[] BC000K3_n402TBM32_LIST_CD ;
   private String[] BC000K3_A403TBM32_IMAGE_CD ;
   private boolean[] BC000K3_n403TBM32_IMAGE_CD ;
   private String[] BC000K3_A401TBM32_TEXT ;
   private boolean[] BC000K3_n401TBM32_TEXT ;
   private byte[] BC000K3_A390TBM32_FONT_SIZE ;
   private boolean[] BC000K3_n390TBM32_FONT_SIZE ;
   private String[] BC000K3_A391TBM32_FONT_UL_FLG ;
   private boolean[] BC000K3_n391TBM32_FONT_UL_FLG ;
   private long[] BC000K3_A392TBM32_FONT_COLOR_DIV ;
   private boolean[] BC000K3_n392TBM32_FONT_COLOR_DIV ;
   private byte[] BC000K3_A398TBM32_LINE_SIZE_DIV ;
   private boolean[] BC000K3_n398TBM32_LINE_SIZE_DIV ;
   private long[] BC000K3_A603TBM32_LINE_COLOR_DIV ;
   private boolean[] BC000K3_n603TBM32_LINE_COLOR_DIV ;
   private String[] BC000K3_A396TBM32_LINE_START_POINT_DIV ;
   private boolean[] BC000K3_n396TBM32_LINE_START_POINT_DIV ;
   private String[] BC000K3_A397TBM32_LINE_END_POINT_DIV ;
   private boolean[] BC000K3_n397TBM32_LINE_END_POINT_DIV ;
   private short[] BC000K3_A604TBM32_LINE_ANGLE ;
   private boolean[] BC000K3_n604TBM32_LINE_ANGLE ;
   private byte[] BC000K3_A552TBM32_AUTH_LVL_MIN ;
   private boolean[] BC000K3_n552TBM32_AUTH_LVL_MIN ;
   private short[] BC000K3_A553TBM32_ZORDER ;
   private boolean[] BC000K3_n553TBM32_ZORDER ;
   private short[] BC000K3_A605TBM32_TAB_ORDER ;
   private boolean[] BC000K3_n605TBM32_TAB_ORDER ;
   private String[] BC000K3_A606TBM32_TABSTOP_FLG ;
   private boolean[] BC000K3_n606TBM32_TABSTOP_FLG ;
   private String[] BC000K3_A607TBM32_REQUIRED_INPUT_FLG ;
   private boolean[] BC000K3_n607TBM32_REQUIRED_INPUT_FLG ;
   private String[] BC000K3_A608TBM32_MIN_VALUE ;
   private boolean[] BC000K3_n608TBM32_MIN_VALUE ;
   private String[] BC000K3_A609TBM32_MAX_VALUE ;
   private boolean[] BC000K3_n609TBM32_MAX_VALUE ;
   private String[] BC000K3_A237TBM32_CRF_ITEM_NOTE ;
   private boolean[] BC000K3_n237TBM32_CRF_ITEM_NOTE ;
   private short[] BC000K3_A746TBM32_REF_CRF_ID ;
   private boolean[] BC000K3_n746TBM32_REF_CRF_ID ;
   private String[] BC000K3_A747TBM32_REF_CRF_ITEM_CD ;
   private boolean[] BC000K3_n747TBM32_REF_CRF_ITEM_CD ;
   private String[] BC000K3_A238TBM32_DEL_FLG ;
   private boolean[] BC000K3_n238TBM32_DEL_FLG ;
   private String[] BC000K3_A241TBM32_CRT_PROG_NM ;
   private boolean[] BC000K3_n241TBM32_CRT_PROG_NM ;
   private String[] BC000K3_A244TBM32_UPD_PROG_NM ;
   private boolean[] BC000K3_n244TBM32_UPD_PROG_NM ;
   private long[] BC000K2_A231TBM32_STUDY_ID ;
   private short[] BC000K2_A232TBM32_CRF_ID ;
   private String[] BC000K2_A233TBM32_CRF_ITEM_CD ;
   private java.util.Date[] BC000K2_A239TBM32_CRT_DATETIME ;
   private boolean[] BC000K2_n239TBM32_CRT_DATETIME ;
   private String[] BC000K2_A240TBM32_CRT_USER_ID ;
   private boolean[] BC000K2_n240TBM32_CRT_USER_ID ;
   private java.util.Date[] BC000K2_A242TBM32_UPD_DATETIME ;
   private boolean[] BC000K2_n242TBM32_UPD_DATETIME ;
   private String[] BC000K2_A243TBM32_UPD_USER_ID ;
   private boolean[] BC000K2_n243TBM32_UPD_USER_ID ;
   private long[] BC000K2_A245TBM32_UPD_CNT ;
   private boolean[] BC000K2_n245TBM32_UPD_CNT ;
   private String[] BC000K2_A234TBM32_CRF_ITEM_NM ;
   private boolean[] BC000K2_n234TBM32_CRF_ITEM_NM ;
   private String[] BC000K2_A235TBM32_CRF_ITEM_DIV ;
   private boolean[] BC000K2_n235TBM32_CRF_ITEM_DIV ;
   private String[] BC000K2_A236TBM32_CRF_ITEM_GRP_CD ;
   private boolean[] BC000K2_n236TBM32_CRF_ITEM_GRP_CD ;
   private short[] BC000K2_A384TBM32_CRF_ITEM_GRP_ORDER ;
   private boolean[] BC000K2_n384TBM32_CRF_ITEM_GRP_ORDER ;
   private short[] BC000K2_A385TBM32_LOCATION_X ;
   private boolean[] BC000K2_n385TBM32_LOCATION_X ;
   private short[] BC000K2_A386TBM32_LOCATION_Y ;
   private boolean[] BC000K2_n386TBM32_LOCATION_Y ;
   private short[] BC000K2_A387TBM32_LOCATION_X2 ;
   private boolean[] BC000K2_n387TBM32_LOCATION_X2 ;
   private short[] BC000K2_A388TBM32_LOCATION_Y2 ;
   private boolean[] BC000K2_n388TBM32_LOCATION_Y2 ;
   private String[] BC000K2_A389TBM32_TEXT_ALIGN_DIV ;
   private boolean[] BC000K2_n389TBM32_TEXT_ALIGN_DIV ;
   private byte[] BC000K2_A393TBM32_TEXT_MAXROWS ;
   private boolean[] BC000K2_n393TBM32_TEXT_MAXROWS ;
   private short[] BC000K2_A394TBM32_TEXT_MAXLENGTH ;
   private boolean[] BC000K2_n394TBM32_TEXT_MAXLENGTH ;
   private byte[] BC000K2_A395TBM32_DECIMAL_DIGITS ;
   private boolean[] BC000K2_n395TBM32_DECIMAL_DIGITS ;
   private String[] BC000K2_A399TBM32_CHK_TRUE_INNER_VALUE ;
   private boolean[] BC000K2_n399TBM32_CHK_TRUE_INNER_VALUE ;
   private String[] BC000K2_A400TBM32_CHK_FALSE_INNER_VALUE ;
   private boolean[] BC000K2_n400TBM32_CHK_FALSE_INNER_VALUE ;
   private String[] BC000K2_A404TBM32_FIXED_VALUE ;
   private boolean[] BC000K2_n404TBM32_FIXED_VALUE ;
   private String[] BC000K2_A402TBM32_LIST_CD ;
   private boolean[] BC000K2_n402TBM32_LIST_CD ;
   private String[] BC000K2_A403TBM32_IMAGE_CD ;
   private boolean[] BC000K2_n403TBM32_IMAGE_CD ;
   private String[] BC000K2_A401TBM32_TEXT ;
   private boolean[] BC000K2_n401TBM32_TEXT ;
   private byte[] BC000K2_A390TBM32_FONT_SIZE ;
   private boolean[] BC000K2_n390TBM32_FONT_SIZE ;
   private String[] BC000K2_A391TBM32_FONT_UL_FLG ;
   private boolean[] BC000K2_n391TBM32_FONT_UL_FLG ;
   private long[] BC000K2_A392TBM32_FONT_COLOR_DIV ;
   private boolean[] BC000K2_n392TBM32_FONT_COLOR_DIV ;
   private byte[] BC000K2_A398TBM32_LINE_SIZE_DIV ;
   private boolean[] BC000K2_n398TBM32_LINE_SIZE_DIV ;
   private long[] BC000K2_A603TBM32_LINE_COLOR_DIV ;
   private boolean[] BC000K2_n603TBM32_LINE_COLOR_DIV ;
   private String[] BC000K2_A396TBM32_LINE_START_POINT_DIV ;
   private boolean[] BC000K2_n396TBM32_LINE_START_POINT_DIV ;
   private String[] BC000K2_A397TBM32_LINE_END_POINT_DIV ;
   private boolean[] BC000K2_n397TBM32_LINE_END_POINT_DIV ;
   private short[] BC000K2_A604TBM32_LINE_ANGLE ;
   private boolean[] BC000K2_n604TBM32_LINE_ANGLE ;
   private byte[] BC000K2_A552TBM32_AUTH_LVL_MIN ;
   private boolean[] BC000K2_n552TBM32_AUTH_LVL_MIN ;
   private short[] BC000K2_A553TBM32_ZORDER ;
   private boolean[] BC000K2_n553TBM32_ZORDER ;
   private short[] BC000K2_A605TBM32_TAB_ORDER ;
   private boolean[] BC000K2_n605TBM32_TAB_ORDER ;
   private String[] BC000K2_A606TBM32_TABSTOP_FLG ;
   private boolean[] BC000K2_n606TBM32_TABSTOP_FLG ;
   private String[] BC000K2_A607TBM32_REQUIRED_INPUT_FLG ;
   private boolean[] BC000K2_n607TBM32_REQUIRED_INPUT_FLG ;
   private String[] BC000K2_A608TBM32_MIN_VALUE ;
   private boolean[] BC000K2_n608TBM32_MIN_VALUE ;
   private String[] BC000K2_A609TBM32_MAX_VALUE ;
   private boolean[] BC000K2_n609TBM32_MAX_VALUE ;
   private String[] BC000K2_A237TBM32_CRF_ITEM_NOTE ;
   private boolean[] BC000K2_n237TBM32_CRF_ITEM_NOTE ;
   private short[] BC000K2_A746TBM32_REF_CRF_ID ;
   private boolean[] BC000K2_n746TBM32_REF_CRF_ID ;
   private String[] BC000K2_A747TBM32_REF_CRF_ITEM_CD ;
   private boolean[] BC000K2_n747TBM32_REF_CRF_ITEM_CD ;
   private String[] BC000K2_A238TBM32_DEL_FLG ;
   private boolean[] BC000K2_n238TBM32_DEL_FLG ;
   private String[] BC000K2_A241TBM32_CRT_PROG_NM ;
   private boolean[] BC000K2_n241TBM32_CRT_PROG_NM ;
   private String[] BC000K2_A244TBM32_UPD_PROG_NM ;
   private boolean[] BC000K2_n244TBM32_UPD_PROG_NM ;
   private long[] BC000K9_A231TBM32_STUDY_ID ;
   private short[] BC000K9_A232TBM32_CRF_ID ;
   private String[] BC000K9_A233TBM32_CRF_ITEM_CD ;
   private java.util.Date[] BC000K9_A239TBM32_CRT_DATETIME ;
   private boolean[] BC000K9_n239TBM32_CRT_DATETIME ;
   private String[] BC000K9_A240TBM32_CRT_USER_ID ;
   private boolean[] BC000K9_n240TBM32_CRT_USER_ID ;
   private java.util.Date[] BC000K9_A242TBM32_UPD_DATETIME ;
   private boolean[] BC000K9_n242TBM32_UPD_DATETIME ;
   private String[] BC000K9_A243TBM32_UPD_USER_ID ;
   private boolean[] BC000K9_n243TBM32_UPD_USER_ID ;
   private long[] BC000K9_A245TBM32_UPD_CNT ;
   private boolean[] BC000K9_n245TBM32_UPD_CNT ;
   private String[] BC000K9_A234TBM32_CRF_ITEM_NM ;
   private boolean[] BC000K9_n234TBM32_CRF_ITEM_NM ;
   private String[] BC000K9_A235TBM32_CRF_ITEM_DIV ;
   private boolean[] BC000K9_n235TBM32_CRF_ITEM_DIV ;
   private String[] BC000K9_A236TBM32_CRF_ITEM_GRP_CD ;
   private boolean[] BC000K9_n236TBM32_CRF_ITEM_GRP_CD ;
   private short[] BC000K9_A384TBM32_CRF_ITEM_GRP_ORDER ;
   private boolean[] BC000K9_n384TBM32_CRF_ITEM_GRP_ORDER ;
   private short[] BC000K9_A385TBM32_LOCATION_X ;
   private boolean[] BC000K9_n385TBM32_LOCATION_X ;
   private short[] BC000K9_A386TBM32_LOCATION_Y ;
   private boolean[] BC000K9_n386TBM32_LOCATION_Y ;
   private short[] BC000K9_A387TBM32_LOCATION_X2 ;
   private boolean[] BC000K9_n387TBM32_LOCATION_X2 ;
   private short[] BC000K9_A388TBM32_LOCATION_Y2 ;
   private boolean[] BC000K9_n388TBM32_LOCATION_Y2 ;
   private String[] BC000K9_A389TBM32_TEXT_ALIGN_DIV ;
   private boolean[] BC000K9_n389TBM32_TEXT_ALIGN_DIV ;
   private byte[] BC000K9_A393TBM32_TEXT_MAXROWS ;
   private boolean[] BC000K9_n393TBM32_TEXT_MAXROWS ;
   private short[] BC000K9_A394TBM32_TEXT_MAXLENGTH ;
   private boolean[] BC000K9_n394TBM32_TEXT_MAXLENGTH ;
   private byte[] BC000K9_A395TBM32_DECIMAL_DIGITS ;
   private boolean[] BC000K9_n395TBM32_DECIMAL_DIGITS ;
   private String[] BC000K9_A399TBM32_CHK_TRUE_INNER_VALUE ;
   private boolean[] BC000K9_n399TBM32_CHK_TRUE_INNER_VALUE ;
   private String[] BC000K9_A400TBM32_CHK_FALSE_INNER_VALUE ;
   private boolean[] BC000K9_n400TBM32_CHK_FALSE_INNER_VALUE ;
   private String[] BC000K9_A404TBM32_FIXED_VALUE ;
   private boolean[] BC000K9_n404TBM32_FIXED_VALUE ;
   private String[] BC000K9_A402TBM32_LIST_CD ;
   private boolean[] BC000K9_n402TBM32_LIST_CD ;
   private String[] BC000K9_A403TBM32_IMAGE_CD ;
   private boolean[] BC000K9_n403TBM32_IMAGE_CD ;
   private String[] BC000K9_A401TBM32_TEXT ;
   private boolean[] BC000K9_n401TBM32_TEXT ;
   private byte[] BC000K9_A390TBM32_FONT_SIZE ;
   private boolean[] BC000K9_n390TBM32_FONT_SIZE ;
   private String[] BC000K9_A391TBM32_FONT_UL_FLG ;
   private boolean[] BC000K9_n391TBM32_FONT_UL_FLG ;
   private long[] BC000K9_A392TBM32_FONT_COLOR_DIV ;
   private boolean[] BC000K9_n392TBM32_FONT_COLOR_DIV ;
   private byte[] BC000K9_A398TBM32_LINE_SIZE_DIV ;
   private boolean[] BC000K9_n398TBM32_LINE_SIZE_DIV ;
   private long[] BC000K9_A603TBM32_LINE_COLOR_DIV ;
   private boolean[] BC000K9_n603TBM32_LINE_COLOR_DIV ;
   private String[] BC000K9_A396TBM32_LINE_START_POINT_DIV ;
   private boolean[] BC000K9_n396TBM32_LINE_START_POINT_DIV ;
   private String[] BC000K9_A397TBM32_LINE_END_POINT_DIV ;
   private boolean[] BC000K9_n397TBM32_LINE_END_POINT_DIV ;
   private short[] BC000K9_A604TBM32_LINE_ANGLE ;
   private boolean[] BC000K9_n604TBM32_LINE_ANGLE ;
   private byte[] BC000K9_A552TBM32_AUTH_LVL_MIN ;
   private boolean[] BC000K9_n552TBM32_AUTH_LVL_MIN ;
   private short[] BC000K9_A553TBM32_ZORDER ;
   private boolean[] BC000K9_n553TBM32_ZORDER ;
   private short[] BC000K9_A605TBM32_TAB_ORDER ;
   private boolean[] BC000K9_n605TBM32_TAB_ORDER ;
   private String[] BC000K9_A606TBM32_TABSTOP_FLG ;
   private boolean[] BC000K9_n606TBM32_TABSTOP_FLG ;
   private String[] BC000K9_A607TBM32_REQUIRED_INPUT_FLG ;
   private boolean[] BC000K9_n607TBM32_REQUIRED_INPUT_FLG ;
   private String[] BC000K9_A608TBM32_MIN_VALUE ;
   private boolean[] BC000K9_n608TBM32_MIN_VALUE ;
   private String[] BC000K9_A609TBM32_MAX_VALUE ;
   private boolean[] BC000K9_n609TBM32_MAX_VALUE ;
   private String[] BC000K9_A237TBM32_CRF_ITEM_NOTE ;
   private boolean[] BC000K9_n237TBM32_CRF_ITEM_NOTE ;
   private short[] BC000K9_A746TBM32_REF_CRF_ID ;
   private boolean[] BC000K9_n746TBM32_REF_CRF_ID ;
   private String[] BC000K9_A747TBM32_REF_CRF_ITEM_CD ;
   private boolean[] BC000K9_n747TBM32_REF_CRF_ITEM_CD ;
   private String[] BC000K9_A238TBM32_DEL_FLG ;
   private boolean[] BC000K9_n238TBM32_DEL_FLG ;
   private String[] BC000K9_A241TBM32_CRT_PROG_NM ;
   private boolean[] BC000K9_n241TBM32_CRT_PROG_NM ;
   private String[] BC000K9_A244TBM32_UPD_PROG_NM ;
   private boolean[] BC000K9_n244TBM32_UPD_PROG_NM ;
}

final  class tbm32_crf_item_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC000K2", "SELECT `TBM32_STUDY_ID`, `TBM32_CRF_ID`, `TBM32_CRF_ITEM_CD`, `TBM32_CRT_DATETIME`, `TBM32_CRT_USER_ID`, `TBM32_UPD_DATETIME`, `TBM32_UPD_USER_ID`, `TBM32_UPD_CNT`, `TBM32_CRF_ITEM_NM`, `TBM32_CRF_ITEM_DIV`, `TBM32_CRF_ITEM_GRP_CD`, `TBM32_CRF_ITEM_GRP_ORDER`, `TBM32_LOCATION_X`, `TBM32_LOCATION_Y`, `TBM32_LOCATION_X2`, `TBM32_LOCATION_Y2`, `TBM32_TEXT_ALIGN_DIV`, `TBM32_TEXT_MAXROWS`, `TBM32_TEXT_MAXLENGTH`, `TBM32_DECIMAL_DIGITS`, `TBM32_CHK_TRUE_INNER_VALUE`, `TBM32_CHK_FALSE_INNER_VALUE`, `TBM32_FIXED_VALUE`, `TBM32_LIST_CD`, `TBM32_IMAGE_CD`, `TBM32_TEXT`, `TBM32_FONT_SIZE`, `TBM32_FONT_UL_FLG`, `TBM32_FONT_COLOR_DIV`, `TBM32_LINE_SIZE_DIV`, `TBM32_LINE_COLOR_DIV`, `TBM32_LINE_START_POINT_DIV`, `TBM32_LINE_END_POINT_DIV`, `TBM32_LINE_ANGLE`, `TBM32_AUTH_LVL_MIN`, `TBM32_ZORDER`, `TBM32_TAB_ORDER`, `TBM32_TABSTOP_FLG`, `TBM32_REQUIRED_INPUT_FLG`, `TBM32_MIN_VALUE`, `TBM32_MAX_VALUE`, `TBM32_CRF_ITEM_NOTE`, `TBM32_REF_CRF_ID`, `TBM32_REF_CRF_ITEM_CD`, `TBM32_DEL_FLG`, `TBM32_CRT_PROG_NM`, `TBM32_UPD_PROG_NM` FROM `TBM32_CRF_ITEM` WHERE `TBM32_STUDY_ID` = ? AND `TBM32_CRF_ID` = ? AND `TBM32_CRF_ITEM_CD` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000K3", "SELECT `TBM32_STUDY_ID`, `TBM32_CRF_ID`, `TBM32_CRF_ITEM_CD`, `TBM32_CRT_DATETIME`, `TBM32_CRT_USER_ID`, `TBM32_UPD_DATETIME`, `TBM32_UPD_USER_ID`, `TBM32_UPD_CNT`, `TBM32_CRF_ITEM_NM`, `TBM32_CRF_ITEM_DIV`, `TBM32_CRF_ITEM_GRP_CD`, `TBM32_CRF_ITEM_GRP_ORDER`, `TBM32_LOCATION_X`, `TBM32_LOCATION_Y`, `TBM32_LOCATION_X2`, `TBM32_LOCATION_Y2`, `TBM32_TEXT_ALIGN_DIV`, `TBM32_TEXT_MAXROWS`, `TBM32_TEXT_MAXLENGTH`, `TBM32_DECIMAL_DIGITS`, `TBM32_CHK_TRUE_INNER_VALUE`, `TBM32_CHK_FALSE_INNER_VALUE`, `TBM32_FIXED_VALUE`, `TBM32_LIST_CD`, `TBM32_IMAGE_CD`, `TBM32_TEXT`, `TBM32_FONT_SIZE`, `TBM32_FONT_UL_FLG`, `TBM32_FONT_COLOR_DIV`, `TBM32_LINE_SIZE_DIV`, `TBM32_LINE_COLOR_DIV`, `TBM32_LINE_START_POINT_DIV`, `TBM32_LINE_END_POINT_DIV`, `TBM32_LINE_ANGLE`, `TBM32_AUTH_LVL_MIN`, `TBM32_ZORDER`, `TBM32_TAB_ORDER`, `TBM32_TABSTOP_FLG`, `TBM32_REQUIRED_INPUT_FLG`, `TBM32_MIN_VALUE`, `TBM32_MAX_VALUE`, `TBM32_CRF_ITEM_NOTE`, `TBM32_REF_CRF_ID`, `TBM32_REF_CRF_ITEM_CD`, `TBM32_DEL_FLG`, `TBM32_CRT_PROG_NM`, `TBM32_UPD_PROG_NM` FROM `TBM32_CRF_ITEM` WHERE `TBM32_STUDY_ID` = ? AND `TBM32_CRF_ID` = ? AND `TBM32_CRF_ITEM_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000K4", "SELECT TM1.`TBM32_STUDY_ID`, TM1.`TBM32_CRF_ID`, TM1.`TBM32_CRF_ITEM_CD`, TM1.`TBM32_CRT_DATETIME`, TM1.`TBM32_CRT_USER_ID`, TM1.`TBM32_UPD_DATETIME`, TM1.`TBM32_UPD_USER_ID`, TM1.`TBM32_UPD_CNT`, TM1.`TBM32_CRF_ITEM_NM`, TM1.`TBM32_CRF_ITEM_DIV`, TM1.`TBM32_CRF_ITEM_GRP_CD`, TM1.`TBM32_CRF_ITEM_GRP_ORDER`, TM1.`TBM32_LOCATION_X`, TM1.`TBM32_LOCATION_Y`, TM1.`TBM32_LOCATION_X2`, TM1.`TBM32_LOCATION_Y2`, TM1.`TBM32_TEXT_ALIGN_DIV`, TM1.`TBM32_TEXT_MAXROWS`, TM1.`TBM32_TEXT_MAXLENGTH`, TM1.`TBM32_DECIMAL_DIGITS`, TM1.`TBM32_CHK_TRUE_INNER_VALUE`, TM1.`TBM32_CHK_FALSE_INNER_VALUE`, TM1.`TBM32_FIXED_VALUE`, TM1.`TBM32_LIST_CD`, TM1.`TBM32_IMAGE_CD`, TM1.`TBM32_TEXT`, TM1.`TBM32_FONT_SIZE`, TM1.`TBM32_FONT_UL_FLG`, TM1.`TBM32_FONT_COLOR_DIV`, TM1.`TBM32_LINE_SIZE_DIV`, TM1.`TBM32_LINE_COLOR_DIV`, TM1.`TBM32_LINE_START_POINT_DIV`, TM1.`TBM32_LINE_END_POINT_DIV`, TM1.`TBM32_LINE_ANGLE`, TM1.`TBM32_AUTH_LVL_MIN`, TM1.`TBM32_ZORDER`, TM1.`TBM32_TAB_ORDER`, TM1.`TBM32_TABSTOP_FLG`, TM1.`TBM32_REQUIRED_INPUT_FLG`, TM1.`TBM32_MIN_VALUE`, TM1.`TBM32_MAX_VALUE`, TM1.`TBM32_CRF_ITEM_NOTE`, TM1.`TBM32_REF_CRF_ID`, TM1.`TBM32_REF_CRF_ITEM_CD`, TM1.`TBM32_DEL_FLG`, TM1.`TBM32_CRT_PROG_NM`, TM1.`TBM32_UPD_PROG_NM` FROM `TBM32_CRF_ITEM` TM1 WHERE TM1.`TBM32_STUDY_ID` = ? and TM1.`TBM32_CRF_ID` = ? and TM1.`TBM32_CRF_ITEM_CD` = ? ORDER BY TM1.`TBM32_STUDY_ID`, TM1.`TBM32_CRF_ID`, TM1.`TBM32_CRF_ITEM_CD` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("BC000K5", "SELECT `TBM32_STUDY_ID`, `TBM32_CRF_ID`, `TBM32_CRF_ITEM_CD` FROM `TBM32_CRF_ITEM` WHERE `TBM32_STUDY_ID` = ? AND `TBM32_CRF_ID` = ? AND `TBM32_CRF_ITEM_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC000K6", "INSERT INTO `TBM32_CRF_ITEM` (`TBM32_STUDY_ID`, `TBM32_CRF_ID`, `TBM32_CRF_ITEM_CD`, `TBM32_CRT_DATETIME`, `TBM32_CRT_USER_ID`, `TBM32_UPD_DATETIME`, `TBM32_UPD_USER_ID`, `TBM32_UPD_CNT`, `TBM32_CRF_ITEM_NM`, `TBM32_CRF_ITEM_DIV`, `TBM32_CRF_ITEM_GRP_CD`, `TBM32_CRF_ITEM_GRP_ORDER`, `TBM32_LOCATION_X`, `TBM32_LOCATION_Y`, `TBM32_LOCATION_X2`, `TBM32_LOCATION_Y2`, `TBM32_TEXT_ALIGN_DIV`, `TBM32_TEXT_MAXROWS`, `TBM32_TEXT_MAXLENGTH`, `TBM32_DECIMAL_DIGITS`, `TBM32_CHK_TRUE_INNER_VALUE`, `TBM32_CHK_FALSE_INNER_VALUE`, `TBM32_FIXED_VALUE`, `TBM32_LIST_CD`, `TBM32_IMAGE_CD`, `TBM32_TEXT`, `TBM32_FONT_SIZE`, `TBM32_FONT_UL_FLG`, `TBM32_FONT_COLOR_DIV`, `TBM32_LINE_SIZE_DIV`, `TBM32_LINE_COLOR_DIV`, `TBM32_LINE_START_POINT_DIV`, `TBM32_LINE_END_POINT_DIV`, `TBM32_LINE_ANGLE`, `TBM32_AUTH_LVL_MIN`, `TBM32_ZORDER`, `TBM32_TAB_ORDER`, `TBM32_TABSTOP_FLG`, `TBM32_REQUIRED_INPUT_FLG`, `TBM32_MIN_VALUE`, `TBM32_MAX_VALUE`, `TBM32_CRF_ITEM_NOTE`, `TBM32_REF_CRF_ID`, `TBM32_REF_CRF_ITEM_CD`, `TBM32_DEL_FLG`, `TBM32_CRT_PROG_NM`, `TBM32_UPD_PROG_NM`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC000K7", "UPDATE `TBM32_CRF_ITEM` SET `TBM32_CRT_DATETIME`=?, `TBM32_CRT_USER_ID`=?, `TBM32_UPD_DATETIME`=?, `TBM32_UPD_USER_ID`=?, `TBM32_UPD_CNT`=?, `TBM32_CRF_ITEM_NM`=?, `TBM32_CRF_ITEM_DIV`=?, `TBM32_CRF_ITEM_GRP_CD`=?, `TBM32_CRF_ITEM_GRP_ORDER`=?, `TBM32_LOCATION_X`=?, `TBM32_LOCATION_Y`=?, `TBM32_LOCATION_X2`=?, `TBM32_LOCATION_Y2`=?, `TBM32_TEXT_ALIGN_DIV`=?, `TBM32_TEXT_MAXROWS`=?, `TBM32_TEXT_MAXLENGTH`=?, `TBM32_DECIMAL_DIGITS`=?, `TBM32_CHK_TRUE_INNER_VALUE`=?, `TBM32_CHK_FALSE_INNER_VALUE`=?, `TBM32_FIXED_VALUE`=?, `TBM32_LIST_CD`=?, `TBM32_IMAGE_CD`=?, `TBM32_TEXT`=?, `TBM32_FONT_SIZE`=?, `TBM32_FONT_UL_FLG`=?, `TBM32_FONT_COLOR_DIV`=?, `TBM32_LINE_SIZE_DIV`=?, `TBM32_LINE_COLOR_DIV`=?, `TBM32_LINE_START_POINT_DIV`=?, `TBM32_LINE_END_POINT_DIV`=?, `TBM32_LINE_ANGLE`=?, `TBM32_AUTH_LVL_MIN`=?, `TBM32_ZORDER`=?, `TBM32_TAB_ORDER`=?, `TBM32_TABSTOP_FLG`=?, `TBM32_REQUIRED_INPUT_FLG`=?, `TBM32_MIN_VALUE`=?, `TBM32_MAX_VALUE`=?, `TBM32_CRF_ITEM_NOTE`=?, `TBM32_REF_CRF_ID`=?, `TBM32_REF_CRF_ITEM_CD`=?, `TBM32_DEL_FLG`=?, `TBM32_CRT_PROG_NM`=?, `TBM32_UPD_PROG_NM`=?  WHERE `TBM32_STUDY_ID` = ? AND `TBM32_CRF_ID` = ? AND `TBM32_CRF_ITEM_CD` = ?", GX_NOMASK)
         ,new UpdateCursor("BC000K8", "DELETE FROM `TBM32_CRF_ITEM`  WHERE `TBM32_STUDY_ID` = ? AND `TBM32_CRF_ID` = ? AND `TBM32_CRF_ITEM_CD` = ?", GX_NOMASK)
         ,new ForEachCursor("BC000K9", "SELECT TM1.`TBM32_STUDY_ID`, TM1.`TBM32_CRF_ID`, TM1.`TBM32_CRF_ITEM_CD`, TM1.`TBM32_CRT_DATETIME`, TM1.`TBM32_CRT_USER_ID`, TM1.`TBM32_UPD_DATETIME`, TM1.`TBM32_UPD_USER_ID`, TM1.`TBM32_UPD_CNT`, TM1.`TBM32_CRF_ITEM_NM`, TM1.`TBM32_CRF_ITEM_DIV`, TM1.`TBM32_CRF_ITEM_GRP_CD`, TM1.`TBM32_CRF_ITEM_GRP_ORDER`, TM1.`TBM32_LOCATION_X`, TM1.`TBM32_LOCATION_Y`, TM1.`TBM32_LOCATION_X2`, TM1.`TBM32_LOCATION_Y2`, TM1.`TBM32_TEXT_ALIGN_DIV`, TM1.`TBM32_TEXT_MAXROWS`, TM1.`TBM32_TEXT_MAXLENGTH`, TM1.`TBM32_DECIMAL_DIGITS`, TM1.`TBM32_CHK_TRUE_INNER_VALUE`, TM1.`TBM32_CHK_FALSE_INNER_VALUE`, TM1.`TBM32_FIXED_VALUE`, TM1.`TBM32_LIST_CD`, TM1.`TBM32_IMAGE_CD`, TM1.`TBM32_TEXT`, TM1.`TBM32_FONT_SIZE`, TM1.`TBM32_FONT_UL_FLG`, TM1.`TBM32_FONT_COLOR_DIV`, TM1.`TBM32_LINE_SIZE_DIV`, TM1.`TBM32_LINE_COLOR_DIV`, TM1.`TBM32_LINE_START_POINT_DIV`, TM1.`TBM32_LINE_END_POINT_DIV`, TM1.`TBM32_LINE_ANGLE`, TM1.`TBM32_AUTH_LVL_MIN`, TM1.`TBM32_ZORDER`, TM1.`TBM32_TAB_ORDER`, TM1.`TBM32_TABSTOP_FLG`, TM1.`TBM32_REQUIRED_INPUT_FLG`, TM1.`TBM32_MIN_VALUE`, TM1.`TBM32_MAX_VALUE`, TM1.`TBM32_CRF_ITEM_NOTE`, TM1.`TBM32_REF_CRF_ID`, TM1.`TBM32_REF_CRF_ITEM_CD`, TM1.`TBM32_DEL_FLG`, TM1.`TBM32_CRT_PROG_NM`, TM1.`TBM32_UPD_PROG_NM` FROM `TBM32_CRF_ITEM` TM1 WHERE TM1.`TBM32_STUDY_ID` = ? and TM1.`TBM32_CRF_ID` = ? and TM1.`TBM32_CRF_ITEM_CD` = ? ORDER BY TM1.`TBM32_STUDY_ID`, TM1.`TBM32_CRF_ID`, TM1.`TBM32_CRF_ITEM_CD` ",true, GX_NOMASK, false, this,10,0,false )
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
               break;
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
               break;
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
               break;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               break;
            case 7 :
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
               stmt.setVarchar(3, (String)parms[2], 50, false);
               break;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 50, false);
               break;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 50, false);
               break;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 50, false);
               break;
            case 4 :
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
               break;
            case 5 :
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
               break;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 50, false);
               break;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 50, false);
               break;
      }
   }

}

